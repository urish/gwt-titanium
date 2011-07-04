package org.urish.gwtit.dev.gen;

import java.io.PrintWriter;
import java.util.Set;

import com.google.gwt.core.ext.GeneratorContext;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.dev.util.collect.HashSet;

public class PrintWriterManager {
	private final GeneratorContext genCtx;
	private final String packageName;
	private final TreeLogger logger;
	private final Set<PrintWriter> writers = new HashSet<PrintWriter>();

	public PrintWriterManager(GeneratorContext genCtx, TreeLogger logger, String packageName) {
		this.genCtx = genCtx;
		this.packageName = packageName;
		this.logger = logger;
	}

	/**
	 * Commit all writers we have vended.
	 */
	public void commit() {
		for (PrintWriter writer : writers) {
			genCtx.commit(logger, writer);
		}
	}

	/**
	 * @param name
	 *            classname
	 * @return the printwriter
	 * @throws RuntimeException
	 *             if this class has already been written
	 */
	public PrintWriter makePrintWriterFor(String name) {
		PrintWriter writer = tryToMakePrintWriterFor(name);
		if (writer == null) {
			throw new RuntimeException(String.format("Tried to write %s.%s twice.", packageName, name));
		}
		return writer;
	}

	/**
	 * @param name
	 *            classname
	 * @return the printwriter, or null if this class has already been written
	 */
	public PrintWriter tryToMakePrintWriterFor(String name) {
		PrintWriter writer = genCtx.tryCreate(logger, packageName, name);
		if (writer != null) {
			writers.add(writer);
		}
		return writer;
	}
}
