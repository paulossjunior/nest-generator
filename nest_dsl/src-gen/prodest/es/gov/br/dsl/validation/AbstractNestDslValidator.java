/*
 * generated by XText 2.18.0.M3
 */
package prodest.es.gov.br.dsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractNestDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(prodest.es.gov.br.dsl.nestdsl.NestdslPackage.eINSTANCE);
		return result;
	}
}