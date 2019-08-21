package prodest.es.gov.br.dsl.generator
 
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.google.inject.Inject
import prodest.es.gov.br.dsl.nestdsl.Entity
import prodest.es.gov.br.dsl.nestdsl.MethodArg
import prodest.es.gov.br.dsl.nestdsl.Method
import prodest.es.gov.br.dsl.nestdsl.Property
import java.util.ArrayList
import java.util.List

class GenericCoreGenerator extends AbstractGenerator {
				
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : resource.allContents.toIterable.filter(Entity)) {
            fsa.generateFile(
                "src/BaseModule/IBase.interface.ts",
                interfaceCompiler())
            fsa.generateFile(
                "src/BaseModule/base.service.ts",
                serviceCompiler())
            fsa.generateFile(
                "src/BaseModule/base.controller.ts",
                controllerCompiller())
           
        }    
	}
	
	def interfaceCompiler()
	'''
		export interface IBaseService<T>{
		
		    findAll(): Promise<T[]>;
		    findOne(id: number): Promise<T>;
		    createOne(object: T): Promise<void>;
		    updateOne(id:number, object: T): Promise<void>;
		    deleteOne(id: number): Promise<void>;
		}
	'''
	
	def serviceCompiler()
	'''
		import { IBaseService } from "./IBase.interface";
		import { Injectable } from '@nestjs/common';
		import { Repository } from 'typeorm';
		
		@Injectable()
		export class BaseService <T> implements IBaseService<T>{
		
		    constructor(
		        private readonly baseRepository: Repository<T>
		    ){}
		
		    async findAll(): Promise<T[]> {
		        return await this.baseRepository.find();
		    }  
		
		    async findOne(id: number): Promise<T> {
		        return await this.baseRepository.findOne(id);
		    }
		
		    async createOne(object: T): Promise<void> {
		        await this.baseRepository.save(object);
		    }
		
		    async updateOne(id:number, object: T): Promise<void> {
		        await this.baseRepository.update(id, object);
		    }
		
		    async deleteOne(id: number): Promise<void> {
		        await this.baseRepository.delete(id);
		    }
		
		    
		}
	'''
	
	def controllerCompiller()
	'''
		import { Get, Post, Put, Delete, Param, Res, HttpStatus, Body } from '@nestjs/common';
		import { ApiOperation, ApiResponse, ApiImplicitParam } from '@nestjs/swagger';
		import { IBaseService } from './IBase.interface';
		
		export class BaseController<T>{
		    
		    constructor(
		        private readonly baseService: IBaseService<T>
		    ){}
		
		    @Get()
		    @ApiOperation({
		        title: 'Find all',
		        description: 'Find all records of this entity'
		    })
		    @ApiResponse({
		        status: 200,
		        description: 'All records was retrieved successfully',
		        isArray: true
		    })
		    public async findAll(@Res() res): Promise<T[]>{
		        try{
					return res
				 			.status(HttpStatus.OK)
					 		.send(await this.baseService.findAll());
				}
				catch(error){
					const badGateWay = HttpStatus.BAD_GATEWAY;
					res
						.status(badGateWay)
			 			.send({error, badGateWay});
				}
		    }
		
		    @Get(':id')
		    @ApiOperation({
		        title: 'Find one',
		        description: 'Find one record of this entity'
		    })
		    @ApiResponse({
		        status: 200,
		        description: 'The record was retrieved successfully',
		        isArray: false
		    })
		    @ApiImplicitParam({
		        name: 'id',
		        description: 'Record ID',
		        required: true, //or false
		        type: 'number'
		    })
			public async findOne(@Res() res, @Param('id') id): Promise<T> {
				try{
					return res
					 	.status(HttpStatus.OK)
					 	.send(await this.baseService.findOne(id));
				}
				catch(error){
					const badGateWay = HttpStatus.BAD_GATEWAY;
					res
						 .status(badGateWay)
						 .send({error, badGateWay});
				}
		    }
		    
		    @Post()
			@ApiOperation({
		        title: 'Create one',
		        description: 'Create an entity record'
		    })
		    @ApiResponse({
		        status: 200,
		        description: 'The record was created successfully',
		        isArray: false // or true
		    })
			public async createOne(@Res() res, @Body() object: T): Promise<void> {
				try{
					res
					 .status(HttpStatus.OK)
					 .send(await this.baseService.createOne(object));
				}
				catch(error){
					const badGateWay = HttpStatus.BAD_GATEWAY;
					res
						 .status(badGateWay)
						 .send({error, badGateWay});
				}
		    }
		    
		    @Put(':id')
			@ApiOperation({
		        title: 'Update one',
		        description: 'Update an entity record'
		    })
		    @ApiResponse({
		        status: 200,
		        description: 'The record was updated successfully',
		        isArray: false
		    })
		    @ApiImplicitParam({
		        name: 'id',
		        description: 'Record ID',
		        required: true, //or false
		        type: 'number'
		    })
		    public async updateOne(@Res() res, @Param('id') id, @Body() object: T): Promise<void> {
				try{
					res
					 .status(HttpStatus.OK)
					 .send(await this.baseService.updateOne(id, object));
				}
				catch(error){
					const badGateWay = HttpStatus.BAD_GATEWAY;
					res
					 .status(badGateWay)
					 .send({error, badGateWay});
				}
		    }
		    
		    @Delete(':id')
			@ApiOperation({
		        title: 'Delete one',
		        description: 'Delete an entity record'
		    })
		    @ApiResponse({
		        status: 200,
		        description: 'The record was deleted successfully',
		        isArray: false
		    })
		    @ApiImplicitParam({
		        name: 'id',
		        description: 'Record ID',
		        required: true, //or false
		        type: 'number'
		    })		    
			public async deleteOne(@Res() res, @Param('id') id): Promise<void> {
				try{
					res
					 .status(HttpStatus.OK)
					 .send(await this.baseService.deleteOne(id));
				}
				catch(error){
					const badGateWay = HttpStatus.BAD_GATEWAY;
					res
					 .status(badGateWay)
					 .send({error, badGateWay});
				}
			}
		}
	'''

   
}