package org.urish.gwtit.client.io;

import java.io.OutputStream;
import java.io.PrintStream;

public abstract class AbstractTitaniumPrintStream extends PrintStream {
	private String buffer = "";
	
	public AbstractTitaniumPrintStream() {
		super((OutputStream)null);
	}
	
	abstract protected void writeLine(String line);

	@Override
	public void print(boolean x) {
		buffer += String.valueOf(x);
	}

	@Override
	public void print(char x) {
		buffer += String.valueOf(x);
	}

	@Override
	public void print(char[] x) {
		buffer += String.valueOf(x);
	}

	@Override
	public void print(double x) {
		buffer += String.valueOf(x);
	}

	@Override
	public void print(float x) {
		buffer += String.valueOf(x);
	}

	@Override
	public void print(int x) {
		buffer += String.valueOf(x);
	}

	@Override
	public void print(long x) {
		buffer += String.valueOf(x);
	}

	@Override
	public void print(Object x) {
		buffer += String.valueOf(x);
	}

	@Override
	public void print(String s) {
		if (s == null) {
		    s = "null";
		}
		buffer += s;
	}

	@Override
	public void println() {
		writeLine(buffer);
		buffer = "";
	}

	@Override
	public void println(boolean x) {
		writeLine(buffer + String.valueOf(x));
		buffer = "";
	}

	@Override
	public void println(char x) {
		writeLine(buffer + String.valueOf(x));
		buffer = "";
	}

	@Override
	public void println(char[] x) {
		writeLine(buffer + String.valueOf(x));
		buffer = "";
	}

	@Override
	public void println(double x) {
		writeLine(buffer + String.valueOf(x));
		buffer = "";
	}

	@Override
	public void println(float x) {
		writeLine(buffer + String.valueOf(x));
		buffer = "";
	}

	@Override
	public void println(int x) {
		writeLine(buffer + String.valueOf(x));
		buffer = "";
	}

	@Override
	public void println(long x) {
		writeLine(buffer + String.valueOf(x));
		buffer = "";
	}

	@Override
	public void println(Object x) {
		writeLine(buffer + String.valueOf(x));
		buffer = "";
	}

	@Override
	public void println(String s) {
		if (s == null) {
		    s = "null";
		}
		writeLine(buffer + s);
		buffer = "";
	}
}
