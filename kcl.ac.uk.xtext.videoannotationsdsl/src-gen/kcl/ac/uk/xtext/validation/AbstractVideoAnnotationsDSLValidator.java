/*
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.NamesAreUniqueValidator;

@ComposedChecks(validators = {NamesAreUniqueValidator.class})
public abstract class AbstractVideoAnnotationsDSLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage.eINSTANCE);
		return result;
	}
	
}