package kcl.ac.uk.xtext.interpreter;

import java.io.IOException;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.xtext.parser.ParseException;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;

import com.google.inject.Injector;

import kcl.ac.uk.xtext.AnnotationsStoresStandaloneSetup;
import kcl.ac.uk.xtext.annotationsStores.AnnotationStores;

public class ASParser {

	private Resource r;
	private XtextResourceSet rs;
	private Diagnostic diagnostic;
	private static int number = 0;

	public ASParser() {
			setupResources();
		}

	private void setupResources() {
		Injector injector = new AnnotationsStoresStandaloneSetup().createInjectorAndDoEMFRegistration();
		rs = injector.getInstance(XtextResourceSet.class);
		rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	}

	@SuppressWarnings("static-access")
	public AnnotationStores parse(String modelString) {
		StringInputStream model = new StringInputStream(modelString);

		try {
			r = rs.createResource(URI.createURI("data" + number++ + ".as"));
			r.load(model, rs.getLoadOptions());

			AnnotationStores result = (AnnotationStores) r.getContents().get(0);
			diagnostic = Diagnostician.INSTANCE.validate(result);

			if (r.getErrors().isEmpty() && diagnostic.getSeverity() == diagnostic.OK) {
				return result;
			} else
				throw new ParseException(
						r.getErrors().toString() + "\n" + r.getWarnings().toString() + "\n" + diagnostic.getChildren());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
}