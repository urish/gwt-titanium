package java.io;

import org.urish.gwtit.titanium.API;
import org.urish.gwtit.titanium.Blob;
import org.urish.gwtit.titanium.Buffer;
import org.urish.gwtit.titanium.Codec;
import org.urish.gwtit.titanium.CreateBufferArgs;
import org.urish.gwtit.titanium.CreateStreamArgs;
import org.urish.gwtit.titanium.DecodeNumberSpec;
import org.urish.gwtit.titanium.Filesystem;
import org.urish.gwtit.titanium.IOStream;
import org.urish.gwtit.titanium.Stream;
import org.urish.gwtit.titanium.Titanium;

public class FileInputStream extends InputStream {
	private final IOStream stream;

	private static native final CreateStreamArgs createStreamFromBlob(Blob blob)
	/*-{
		return { source: blob, mode: Titanium.Stream.MODE_READ };
	}-*/;

	private static native final DecodeNumberSpec createDecodeNumberSpec(Buffer source, String type)
	/*-{
		return { source: source, type: type };
	}-*/;

	private static native final CreateBufferArgs createByteBufferArgs(byte value)
	/*-{
		return { value: value, type: Titanium.Codec.TYPE_BYTE };
	}-*/;

	public FileInputStream(String fileName) throws FileNotFoundException {
		org.urish.gwtit.titanium.filesystem.File titaniumFile = Filesystem.getFile(fileName);
		if (!titaniumFile.exists()) {
			throw new FileNotFoundException(fileName);
		}
		
		API.info("Create file input stream: " + fileName);
		Blob fileData = titaniumFile.read();
		stream = Stream.createStream(createStreamFromBlob(fileData));
	}

	@Override
	public int read() throws IOException {
		Buffer buffer = Titanium.createBuffer(createByteBufferArgs((byte) 0));
		stream.read(buffer, 0, 1);
		return (byte) Codec.decodeNumber(createDecodeNumberSpec(buffer, Codec.TYPE_INT));
	}

	@Override
	public int read(byte b[], int off, int len) throws IOException {
		return 0; /* TODO: implement */
	}
}
