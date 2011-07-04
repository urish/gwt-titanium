package org.urish.gwtit.dev.gen;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.core.ext.typeinfo.JMethod;
import com.google.gwt.uibinder.rebind.IndentedWriter;

public class TitaniumProxyGenerator extends BaseGenerator {

	@Override
	protected void doGenerate(JClassType interfaceType, String implName, IndentedWriter writer) {
		writeImports(writer);
		writeClassIntro(interfaceType, implName, writer);
		writeFieldsIntro(writer);
		writeMethods(writer, interfaceType);
		writeFieldsBinding(interfaceType, writer);
		writeOutro(writer);
	}

	private void writeMethods(IndentedWriter writer, JClassType interfaceType) {
		for (JMethod method : interfaceType.getMethods()) {
			if (method.getName().startsWith("get")) {
				writeGetter(writer, method);
			} else if (method.getName().startsWith("set")) {
				writeSetter(writer, method, interfaceType);
			} else {
				writeMethod(writer, method);
			}
		}
	}

	private String fieldName(String getterName) {
		return getterName.substring(3, 4).toLowerCase() + getterName.substring(4);
	}

	private void writeGetter(IndentedWriter writer, JMethod method) {
		writer.write("public native %1$s %2$s() /*-{", method.getReturnType().getQualifiedSourceName(), method
				.getName());
		writer.indent();
		writer.write("return this.%1$s;", fieldName(method.getName()));
		writer.outdent();
		writer.write("}-*/;");
		writer.newline();
	}

	private void writeSetter(IndentedWriter writer, JMethod method, JClassType interfaceType) {
		writer.write("public native %1$s %2$s(%3$s value) /*-{", interfaceType.getName(), method.getName(), method
				.getParameterTypes()[0].getQualifiedSourceName());
		writer.indent();
		writer.write("this.%1$s = value;", fieldName(method.getName()));
		writer.write("return this;", fieldName(method.getName()));
		writer.outdent();
		writer.write("}-*/;");
		writer.newline();
	}

	private void writeMethod(IndentedWriter writer, JMethod method) {
		writer.write("public native %1$s %2$s() /*-{", method.getReturnType(), method.getName());
		writer.indent();
		writer.write("return this.%1$s();", method.getName());
		writer.outdent();
		writer.write("}-*/;");
		writer.newline();
	}

	/**
	 * Generate default code for all generated Components
	 * 
	 * @param interfaceType
	 * @param writer
	 */
	private void writeFieldsBinding(JClassType interfaceType, IndentedWriter writer) {
		/*
		 * for (JField jField : interfaceType.getEnclosingType().getFields()) {
		 * FormField annotation = jField.getAnnotation(FormField.class);
		 * if(annotation != null) { writer.write("component.%1$s = new %2$s();",
		 * jField.getName(), jField.getType().getQualifiedSourceName());
		 * writer.write("component.%1$s.setStyleName("%2$s");",
		 * jField.getName(), annotation.styleName());
		 * writer.write("GWT.log("Adding Field: %1$s of Type: %2$s to:
		 * %3$s",null);", jField.getName(),
		 * jField.getType().getQualifiedSourceName(),
		 * annotation.parentAccessor());
		 * writer.write("component.%1$s.add(component.%2$s);",
		 * annotation.parentAccessor(), jField.getName());
		 * FieldGeneratorFactory.getInstance().createFor(jField).write(jField,
		 * annotation, writer); } }
		 */
	}

	private void writeFieldsIntro(IndentedWriter writer) {
		// nothing to do now
		writer.newline();
	}

	private void writeImports(IndentedWriter writer) {
		writer.write(IMPORT, GWT.class.getName());
		writer.newline();
	}

}
