package application;


import java.io.IOException;
import java.io.Reader;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.ParseException;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import kcl.ac.uk.xtext.VideoAnnotationsDSLStandaloneSetup;

public class XtextParser {
	 
    private IParser parser;
 
    public XtextParser() {
    	
    	addDependency();
    }
 
    private void setupParser() {
    	
        Injector injector = new VideoAnnotationsDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
        injector.injectMembers(this);
    }
    
    private void addDependency() {
    	// do this only once per application
    	Injector injector = new VideoAnnotationsDSLStandaloneSetup().createInjectorAndDoEMFRegistration();

    	// obtain a resourceset from the injector
    	XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

    	// load a resource by URI, in this case from the file system
    	Resource resource = resourceSet.getResource(URI.createFileURI("./VideAnnotationsDSL.videannotationsdsl"), true);
    }
 
    /**
     * Parses data provided by an input reader using Xtext and returns the root node of the resulting object tree.
     * @param reader Input reader
     * @return root object node
     * @throws IOException when errors occur during the parsing process
     */
    public EObject parse(Reader reader) throws IOException {
        IParseResult result = parser.parse(reader);
        
        if (result.hasSyntaxErrors()) {
            throw new ParseException("Provided input contains syntax errors.");
        }
        
        return result.getRootASTElement();
    }
}
