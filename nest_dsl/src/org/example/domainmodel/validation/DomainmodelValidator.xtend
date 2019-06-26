package org.example.domainmodel.validation

import org.example.domainmodel.domainmodel.Entity
import org.eclipse.xtext.validation.Check
import org.example.domainmodel.domainmodel.DomainmodelPackage
import org.example.domainmodel.domainmodel.Property


/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class DomainmodelValidator extends AbstractDomainmodelValidator {
	
	@Check
	def void checkNameStartsWithCapital(Entity entity) {
	    if (!Character.isUpperCase(entity.name.charAt(0))) {
	        warning("O nome deve começar com letra maiúscula", 
	            DomainmodelPackage.Literals.TYPE__NAME)
	    }
	}
	
	@Check
	def void checkFeatureNameIsUnique(Property f) {
	    var superEntity = (f.eContainer as Entity).superType
	    while (superEntity !== null) {
	        for (other : superEntity.properties) {
	            if (f.name == other.name) {
	                error("Feature names have to be unique",
	                    DomainmodelPackage.Literals.PROPERTY__NAME)
	                return
	            }
	        }
	        superEntity = superEntity.getSuperType();
	    }
	}
	
}
