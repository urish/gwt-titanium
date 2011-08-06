package org.urish.gwtit.client.io;

import org.urish.gwtit.titanium.API;

public class TitaniumStandardErrorPrintStream extends AbstractTitaniumPrintStream {
	@Override
	protected void writeLine(String line) {
		API.error(line);
	}
}
