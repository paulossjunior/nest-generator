package prodest.es.gov.br.dsl.generator
 
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.google.inject.Inject
import prodest.es.gov.br.dsl.nestdsl.Entity
import prodest.es.gov.br.dsl.nestdsl.Property

class NestDslGenerator extends AbstractGenerator {
 
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
	        «FOR p : e.properties»
	        
	         «p.compile»
	        «ENDFOR»
	    }
	    '''
 
	def compile(Property p) 
		'''
		«IF p.name == 'id' || p.name == 'ID'»
			@PrimaryGeneratedColumn()
		«ELSE»
			«IF p.relation !== null»
				«IF p.relation.oneArgument !== null»
					«var oneArgument = p.relation.oneArgument.argument»
					@«oneArgument»(type => «p.relation.oneArgument.type.name»)
					«IF oneArgument == 'OneToOne'»
						@JoinColumn()
					«ELSEIF oneArgument == 'ManyToMany'»
						@JoinTable()
					«ENDIF»
				«ELSEIF p.relation.multipleArgument !== null»
					
					@«p.relation.multipleArgument.argument»(type => «p.relation.multipleArgument.type.name»,«p.relation.multipleArgument.secondArgument»)
				«ENDIF»
				«ELSE»
				@Column()
			«ENDIF»
		«ENDIF»
		«p.name»: «p.type.fullyQualifiedName»«p.array»;
	    '''

  
}