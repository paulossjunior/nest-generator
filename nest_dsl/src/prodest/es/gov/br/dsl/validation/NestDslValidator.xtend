/*
 * generated by XText 2.18.0.M3
 */
package prodest.es.gov.br.dsl.validation

import prodest.es.gov.br.dsl.nestdsl.NestdslPackage
import org.eclipse.xtext.validation.Check
import prodest.es.gov.br.dsl.nestdsl.Entity
import prodest.es.gov.br.dsl.nestdsl.Property

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class NestDslValidator extends AbstractNestDslValidator {
	/*
//	@Check
	def void checkNameStartsWithCapital(Entity entity) {
	    if (!Character.isUpperCase(entity.name.charAt(0))) {
	        warning("O nome deve comear com letra maiscula", 
	            NestdslPackage.Literals.TYPE__NAME)
	    }
	}
	
	@Check
	def void checkFeatureNameIsUnique(Property f) {
	    var superEntity = (f.eContainer as Entity).superType
	    while (superEntity !== null) {
	        for (other : superEntity.properties) {
	            if (f.name == other.name) {
	                error("Nome de propriedades devem ser �nicos",
	                    NestdslPackage.Literals.PROPERTY__NAME)
	                return
	            }
	        }
	        superEntity = superEntity.getSuperType();
	    }
	}

	 */
}
