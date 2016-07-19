package application;


import java.io.Reader;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.ParseException;

import com.google.inject.Injector;

import kcl.ac.uk.xtext.VideoAnnotationsDSLStandaloneSetup;

public class XtextParser {
	
    private IParser parser;
 
    public XtextParser() {
    	
    	setupParser();
    }
 
    private void setupParser() {
    	
        Injector injector = new VideoAnnotationsDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
        parser = injector.getInstance(IParser.class);
        injector.injectMembers(this);
    }
 
    /**
     * Parses data provided by an input reader using Xtext and returns the root node of the resulting object tree.
     * @param reader Input reader
     * @return root object node
     * @throws IOException when errors occur during the parsing process
     */
    public EObject parse(Reader reader) throws ParseException {
        IParseResult result = parser.parse(reader);
        
        if (result.hasSyntaxErrors()) {
        	String errorsString = "";
        	
        	for (INode error : result.getSyntaxErrors()) {
        		System.out.println(error.getSyntaxErrorMessage() + "\n");
        		errorsString += "\n" + error.getSyntaxErrorMessage();
        	}
        	
            throw new ParseException("Provided input contains syntax errors.\n" + errorsString);
        }
        
        return result.getRootASTElement();
    }
}
