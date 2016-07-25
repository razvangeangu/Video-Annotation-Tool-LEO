package application;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.parser.ParseException;
import org.eclipse.xtext.util.StringInputStream;

import com.google.inject.Injector;

import kcl.ac.uk.xtext.VideoAnnotationsDSLStandaloneSetup;

public class VATParser {
	
	private Resource r;
	private ResourceSet rs;
	private static int number = 0;
	
	public VATParser() {
		setupResources();
	}
	
	private void setupResources() {
		Injector injector = new VideoAnnotationsDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		rs = injector.getInstance(ResourceSet.class);
	}
	
	public EObject parse(String modelString) {
		StringInputStream model = new StringInputStream(modelString);
		
		try {
			r = rs.createResource(URI.createURI("dummy" + number++ + ".videoannotationsdsl"));
			r.load(model, rs.getLoadOptions());
			if (r.getErrors().isEmpty()) {
				return r.getContents().get(0);
			} else throw new ParseException("Provided input contains syntax errors.\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
