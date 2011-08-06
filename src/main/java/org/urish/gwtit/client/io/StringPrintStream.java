package org.urish.gwtit.client.io;

import java.io.OutputStream;
import java.io.PrintStream;

public class StringPrintStream extends PrintStream {
	private final String NEW_LINE = "\n";

	final StringBuffer stringBuffer;

	public StringPrintStream() {
		this(new StringBuffer());
	}

	public StringPrintStream(StringBuffer stringBuffer) {
		super((OutputStream) null);
		this.stringBuffer = stringBuffer;
	}

	@Override
	public void print(boolean x) {
		stringBuffer.append(x);
	}

	@Override
	public void print(char x) {
		stringBuffer.append(x);
	}

	@Override
	public void print(char[] x) {
		stringBuffer.append(x);
	}

	@Override
	public void print(double x) {
		stringBuffer.append(x);
	}

	@Override
	public void print(float x) {
		stringBuffer.append(x);
	}

	@Override
	public void print(int x) {
		stringBuffer.append(x);
	}

	@Override
	public void print(long x) {
		stringBuffer.append(x);
	}

	@Override
	public void print(Object x) {
		stringBuffer.append(x);
	}

	@Override
	public void print(String s) {
		stringBuffer.append(s);
	}

	@Override
	public void println() {
		stringBuffer.append(NEW_LINE);
	}

	@Override
	public void println(boolean x) {
		stringBuffer.append(x);
		stringBuffer.append(NEW_LINE);
	}

	@Override
	public void println(char x) {
		stringBuffer.append(x);
		stringBuffer.append(NEW_LINE);
	}

	@Override
	public void println(char[] x) {
		stringBuffer.append(x);
		stringBuffer.append(NEW_LINE);
	}

	@Override
	public void println(double x) {
		stringBuffer.append(x);
		stringBuffer.append(NEW_LINE);
	}

	@Override
	public void println(float x) {
		stringBuffer.append(x);
		stringBuffer.append(NEW_LINE);
	}

	@Override
	public void println(int x) {
		stringBuffer.append(x);
		stringBuffer.append(NEW_LINE);
	}

	@Override
	public void println(long x) {
		stringBuffer.append(x);
		stringBuffer.append(NEW_LINE);
	}

	@Override
	public void println(Object x) {
		stringBuffer.append(x);
		stringBuffer.append(NEW_LINE);
	}

	@Override
	public void println(String s) {
		stringBuffer.append(s);
		stringBuffer.append(NEW_LINE);
	}

	public String toString() {
		return stringBuffer.toString();
	}

	public void reset() {
		stringBuffer.setLength(0);
	}
}
