var devMode = (function() {
	window = this;

	var $hostedHtmlVersion = "2.1";

	// from com.google.gwt.dev.shell.BrowserChannel.BROWSERCHANNEL_PROTOCOL_VERSION
	var BROWSERCHANNEL_PROTOCOL_VERSION = 2;

	// from com.google.gwt.dev.shell.BrowserChannel.SpecialDispatchId
	var SPECIAL_HAS_METHOD = 0;
	var SPECIAL_HAS_PROPERTY = 1;
	var SPECIAL_GET_PROPERTY = 2;
	var SPECIAL_SET_PROPERTY = 3;

	// from com.google.gwt.dev.shell.BrowserChannel.MessageType
	var MESSAGE_TYPE_INVOKE = 0;
	var MESSAGE_TYPE_RETURN = 1;
	var MESSAGE_TYPE_OLD_LOAD_MODULE = 2;
	var MESSAGE_TYPE_QUIT = 3;
	var MESSAGE_TYPE_LOADJSNI = 4;
	var MESSAGE_TYPE_INVOKESPECIAL = 5;
	var MESSAGE_TYPE_FREEVALUE = 6;
	var MESSAGE_TYPE_FATAL_ERROR = 7;
	var MESSAGE_TYPE_CHECK_VERSIONS = 8;
	var MESSAGE_TYPE_PROTOCOL_VERSION = 9;
	var MESSAGE_TYPE_CHOOSE_TRANSPORT = 10;
	var MESSAGE_TYPE_SWITCH_TRANSPORT = 11;
	var MESSAGE_TYPE_LOAD_MODULE = 12;

	// from com.google.gwt.dev.shell.BrowserChannel.Value.ValueType
	var VALUE_TYPE_NULL = 0;
	var VALUE_TYPE_BOOLEAN = 1;
	var VALUE_TYPE_BYTE = 2;
	var VALUE_TYPE_CHAR = 3;
	var VALUE_TYPE_SHORT = 4;
	var VALUE_TYPE_INT = 5;
	var VALUE_TYPE_LONG = 6;
	var VALUE_TYPE_FLOAT = 7;
	var VALUE_TYPE_DOUBLE = 8;
	var VALUE_TYPE_STRING = 9;
	var VALUE_TYPE_JAVA_OBJECT = 10;
	var VALUE_TYPE_JS_OBJECT = 11;
	var VALUE_TYPE_UNDEFINED = 12;

	var QUIT_EXCEPTION = {
		type : 'quit'
	};
	var EOF_EXCEPTION = {
		type : 'eof'
	};

	function debug(msg) {
		Ti.API.debug(msg);
	}
	function info(msg) {
		Ti.API.info(msg);
	}
	function warn(msg) {
		Ti.API.warn(msg);
	}
	function error(msg) {
		Ti.API.error(msg);
	}

	function GwtException(msg) {
		this.msg = msg;
		this.toString = function() {
			return msg;
		};
	}

	var JAVA_OBJECT_MAGIC = {};

	function JavaObject(id) {
		var result = function() {
			warn("Called JavaObject... What now?");
		};
		result.javaObject = JAVA_OBJECT_MAGIC;
		result.id = id;
		return result;
	}

	var IO_BUFFER_LENGTH = 1024;
	var _ioBuffer = Ti.createBuffer({
		length : IO_BUFFER_LENGTH
	});
	function readNumberFactory(type) {
		var size = Titanium.Codec.encodeNumber({
			source : 0,
			type : type,
			byteOrder : Titanium.Codec.BIG_ENDIAN,
			dest : _ioBuffer
		});
		return function(stream) {
			var bytesRead = stream.read(_ioBuffer, 0, size);
			if (bytesRead < size) {
				throw EOF_EXCEPTION;
			}
			return Titanium.Codec.decodeNumber({
				source : _ioBuffer,
				type : type,
				byteOrder : Titanium.Codec.BIG_ENDIAN
			});
		};
	}
	function writeNumberFactory(type) {
		return function(stream, value) {
			var size = Titanium.Codec.encodeNumber({
				source : value,
				type : type,
				byteOrder : Titanium.Codec.BIG_ENDIAN,
				dest : _ioBuffer
			});
			var bytesWritten = stream.write(_ioBuffer, 0, size);
			if (bytesWritten < size) {
				throw EOF_EXCEPTION;
			}
		};
	}

	var readByte = readNumberFactory(Titanium.Codec.TYPE_BYTE);
	var writeByte = writeNumberFactory(Titanium.Codec.TYPE_BYTE);
	var readShort = readNumberFactory(Titanium.Codec.TYPE_SHORT);
	var writeShort = writeNumberFactory(Titanium.Codec.TYPE_SHORT);
	var readInt = readNumberFactory(Titanium.Codec.TYPE_INT);
	var writeInt = writeNumberFactory(Titanium.Codec.TYPE_INT);
	var readLong = readNumberFactory(Titanium.Codec.TYPE_LONG);
	var writeLong = writeNumberFactory(Titanium.Codec.TYPE_LONG);
	var readFloat = readNumberFactory(Titanium.Codec.TYPE_FLOAT);
	var writeFloat = writeNumberFactory(Titanium.Codec.TYPE_FLOAT);
	var readDouble = readNumberFactory(Titanium.Codec.TYPE_DOUBLE);
	var writeDouble = writeNumberFactory(Titanium.Codec.TYPE_DOUBLE);

	function getIoBuffer(size) {
		return size <= IO_BUFFER_LENGTH ? _ioBuffer : Ti.createBuffer({
			length : size
		});
	}
	function readString(stream) {
		var len = readInt(stream);
		var buffer = getIoBuffer(len);
		var bytesRead = socket.read(buffer, 0, len);
		if (bytesRead < len) {
			throw EOF_EXCEPTION;
		}
		return Ti.Codec.decodeString({
			source : buffer,
			length : len
		});
	}

	function writeString(stream, value) {
		if (value.length == 0) {
			writeInt(stream, 0);
			return;
		}
		var buffer = getIoBuffer(value.length * 2 + 4);
		var len = Ti.Codec.encodeString({
			source : value,
			dest : buffer,
			destPosition : 4
		}) - 4;
		writeInt(stream, len);
		var bytesWritten = stream.write(buffer, 4, len);
		if (bytesWritten < len) {
			throw EOF_EXCEPTION;
		}
	}

	var javascript_object_table = [];
	var javascript_object_reverse_map = {};

	function readValue(stream) {
		var type = readByte(stream);

		switch (type) {
		case VALUE_TYPE_NULL:
			return null;

		case VALUE_TYPE_BOOLEAN:
			return readByte(stream) > 0;

		case VALUE_TYPE_BYTE:
			return readByte(stream);

		case VALUE_TYPE_CHAR:
			var val = readShort(stream);
			return String.fromCharCode(val);

		case VALUE_TYPE_SHORT:
			return readShort(stream);

		case VALUE_TYPE_INT:
			return readInt(stream);

		case VALUE_TYPE_LONG:
			return readLong(stream);

		case VALUE_TYPE_FLOAT:
			return readFloat(stream);

		case VALUE_TYPE_DOUBLE:
			return readDouble(stream);

		case VALUE_TYPE_STRING:
			return readString(stream);

		case VALUE_TYPE_JAVA_OBJECT:
			var index = readInt(stream);
			return new JavaObject(index);

		case VALUE_TYPE_JS_OBJECT:
			var index = readInt(stream);
			return javascript_object_table[index];

		case VALUE_TYPE_UNDEFINED:
			return undefined;

		default:
			error("Unhandled value type sent from server: " + type);
		}
	}

	function writeValue(stream, value) {
		if (value === null) {
			writeByte(stream, VALUE_TYPE_NULL);
			return;
		}
		if (typeof value == typeof '') {
			writeByte(stream, VALUE_TYPE_STRING);
			writeString(stream, value);
			return;
		}
		if (typeof value == 'function' && (value.javaObject === JAVA_OBJECT_MAGIC)) {
			writeByte(stream, VALUE_TYPE_JAVA_OBJECT);
			writeInt(stream, value.id);
			return;
		}
		if (typeof value == 'object' || typeof value == 'function') {
			var index = javascript_object_reverse_map[value];
			if (index === undefined) {
				index = javascript_object_table.length;
				debug("Adding new object, table index = " + index);
				javascript_object_table[index] = value;
				javascript_object_reverse_map[value] = index;
			} else {
				debug("Sending existing object, table index = " + index);
			}
			writeByte(stream, VALUE_TYPE_JS_OBJECT);
			writeInt(stream, index);
			return;
		}
		if (value === undefined) {
			writeByte(stream, VALUE_TYPE_UNDEFINED);
			return;
		}
		error("Unimplemented return value type: " + typeof value);
		// TODO implement other types
	}

	function sendCheckVersions(stream, minVersion, maxVersion, hostedHtmlVersion) {
		writeByte(stream, MESSAGE_TYPE_CHECK_VERSIONS);
		writeInt(stream, minVersion);
		writeInt(stream, maxVersion);
		writeString(stream, hostedHtmlVersion);
	}

	function sendReturn(stream, value, isException) {
		writeByte(stream, MESSAGE_TYPE_RETURN);
		writeByte(stream, isException ? 1 : 0);
		writeValue(stream, value);
	}

	function sendLoadModule(stream, url, tabKey, sessionKey, moduleName, userAgent) {
		writeByte(stream, MESSAGE_TYPE_LOAD_MODULE);
		writeString(stream, url);
		writeString(stream, tabKey);
		writeString(stream, sessionKey);
		writeString(stream, moduleName);
		writeString(stream, userAgent);
	}

	function processInvoke(stream) {
		var methodName = readString(stream);
		var thisRef = readValue(stream);
		var numArgs = readInt(stream);
		var args = [];
		for ( var i = 0; i < numArgs; i++) {
			args[i] = readValue(stream);
		}
		debug("Invoke " + methodName + " on " + thisRef + " with " + numArgs + " args");
		try {
			var func = (thisRef == null) ? window[methodName] : thisRef[methodName];
			sendReturn(stream, func.apply(thisRef, args), false);
		} catch (e) {
			warn("Exception during invoke: " + e);
			sendReturn(stream, e, true);
		}
	}

	function processReturn(stream) {
		var isException = readByte(stream);
		var value = readValue(stream);
		if (isException) {
			warn("Received exception from channel: " + value);
			throw new GwtException(value);
		}
		return value;
	}

	function processLoadJsni(stream) {
		var code = readString(stream);
		debug("LoadJsni (code length: " + code.length + ")");
		try {
			eval.call(null, code);
		} catch (e) {
			error("JSNI code failed: " + e);
		}
	}

	function processProtocolVersion(stream) {
		var version = readInt(stream);
		debug("Remote Protocol Version: " + version);
		sendLoadModule(stream, "", "", "", "com.salsa4fun.zampona.Zampona", "");
	}

	function processIO(socket) {
		for (;;) {
			debug("read...");
			var type = readByte(socket);
			debug("MSG, type=" + type);
			switch (type) {
			case MESSAGE_TYPE_INVOKE:
				processInvoke(socket);
				break;

			case MESSAGE_TYPE_FREEVALUE:
				// TODO
				break;

			case MESSAGE_TYPE_RETURN:
				return processReturn(socket);

			case MESSAGE_TYPE_QUIT:
				throw "Quit";

			case MESSAGE_TYPE_LOADJSNI:
				processLoadJsni(socket);
				break;

			case MESSAGE_TYPE_PROTOCOL_VERSION:
				processProtocolVersion(socket);
				break;

			default:
				warn("Unexcepted message from server, code= " + type);
			}
		}
	}

	window.__gwt_makeJavaInvoke = function(numArgs) {
		return window.__static;
	};
	window.__gwt_makeTearOff = function(dispId, argCount) {
		// TODO optimize
		return function() {
			var newArgs = [ dispId, this ];
			for ( var i = 0; arguments.length; i++) {
				newArgs.push(arguments[i]);
			}
			window.__static.apply(null, newArgs);
		};
	};
	window.__gwt_displayGlassMessage = function(summary, details) {
		alert("S: " + summary + ", " + details);
	};
	window.fireOnModuleLoadStart = function(className) {
		debug("fireOnModuleLoadStart(" + className + ")");
	};

	function processNegotiation(socket) {
		sendCheckVersions();
		var type = readByte(socket);
		switch (type) {
		case MESSAGE_TYPE_PROTOCOL_VERSION:
			// TODO
			break;

		case MESSAGE_TYPE_FATAL_ERROR:
			// TODO
			break;

		default:
			return false;
		}
		return true;
	}

	var connectionOk = false;
	function onConnected() {
		connectionOk = true;
		try {
			sendCheckVersions(socket, BROWSERCHANNEL_PROTOCOL_VERSION, BROWSERCHANNEL_PROTOCOL_VERSION,
					$hostedHtmlVersion);
			processIO(socket);
		} catch (e) {
			if ((e == QUIT_EXCEPTION) || (e == EOF_EXCEPTION)) {
				/* pass */
			} else {
				var location = e.sourceURL.replace(/.+\//, "") + ":" + e.line;
				alert("Code exited with uncaught exception: [" + location + "] " + e);
				error(e);
			}
		} finally {
			socket.close();
		}
	}

	function onError(e) {
		if (!connectionOk) {
			warn(e);
			alert("Connection failed! " + e);
		} else {
			info("Connection closed.");
		}
	}

	var socket = Titanium.Network.Socket.createTCP({
		host : "10.10.10.151",
		port : 9997,
		connected : onConnected,
		error : onError
	});

	socket.connect();
})();