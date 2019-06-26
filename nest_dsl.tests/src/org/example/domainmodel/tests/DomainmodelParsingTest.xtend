package org.example.domainmodel.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.example.domainmodel.domainmodel.Domainmodel
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import static org.junit.Assert.*
import org.example.domainmodel.domainmodel.Entity

@ExtendWith(InjectionExtension)
@InjectWith(DomainmodelInjectorProvider)
class DomainmodelParsingTest {
	@Inject
	ParseHelper<Domainmodel> parseHelper
	
	 @Test 
    def void parseDomainmodel() {
        val model = parseHelper.parse(
            "entity MyEntity {
                parent: MyEntity
            }")
        val entity = model.elements.head as Entity
        assertSame(entity, entity.properties.head.type)
    }
}
