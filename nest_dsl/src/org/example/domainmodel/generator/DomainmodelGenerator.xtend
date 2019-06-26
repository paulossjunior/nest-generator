package org.example.domainmodel.generator
 
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.example.domainmodel.domainmodel.Entity
import org.example.domainmodel.domainmodel.Property
 
import com.google.inject.Inject

class DomainmodelGenerator extends AbstractGenerator {
 
    @Inject extension IQualifiedNameProvider
 
    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        for (e : resource.allContents.toIterable.filter(Entity)) {
            fsa.generateFile(
                e.fullyQualifiedName.toString("/") + ".entity.ts",
                e.compile)
        }
    }
 
    def compile(Entity e) 
    ''' 
    import {Entity, PrimaryGeneratedColumn, Column} from "typeorm";
        
    @Entity()
    export class «e.name» «IF e.superType !== null
            »extends «e.superType.fullyQualifiedName» «ENDIF»{
        «FOR f : e.properties»
        
         «f.compile»
        «ENDFOR»
    }
    '''
 
	def compile(Property f) 
		'''
		«IF f.name == 'id' || f.name == 'ID'»
		@PrimaryGeneratedColumn()
		«ELSE»
		@Column()
		«ENDIF»
		«f.name»: «f.type.fullyQualifiedName»«f.array»;
	    '''
}