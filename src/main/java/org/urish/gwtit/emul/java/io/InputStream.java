package java.io;

public abstract class InputStream {
	public abstract int read() throws IOException;

	public int read(byte b[]) throws IOException {
		return read(b, 0, b.length);
	}

	abstract public int read(byte b[], int off, int len) throws IOException;
}
