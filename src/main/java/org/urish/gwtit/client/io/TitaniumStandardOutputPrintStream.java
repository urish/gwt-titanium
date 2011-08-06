package org.urish.gwtit.client.io;

import org.urish.gwtit.titanium.API;

public class TitaniumStandardOutputPrintStream extends AbstractTitaniumPrintStream {
	@Override
	protected void writeLine(String line) {
		API.info(line);
	}
}
