# NestG

**NestG** é uma ferramenta desenvolvida em [Xtext](https://www.eclipse.org/Xtext/) para facilitar o desenvolvimento de webservices em [NestJS](https://nestjs.com/).

## Features
A ferramenta gera automaticamente:
* Controllers
* Services
* Providers
* Entities e/ou DTOs
* Modules ( incluindo app.module )
* Database Module
* Dockerfile
* sonar-project.properties
* .gitlab-cy.yml
* package.json 
* .env.example
* main.ts

## Instalação e uso
Atualmente, existe apenas uma forma de instalação e uso, que é pelo **Eclipse**
## Eclipse
#### Pré-requisitos
O seguintes tópicos são Necessários já estarem instalados.
* Eclipse
* Eclipse DSL Tools
#### Instalação
1. Clonar a branch master desse repositório
1.1 Para clonar pelo Eclipse (recomendado), vá em **File > Import > Projects from Git > Clique em next > Clone URI**. E então preencha a URI com o link deste repositório 
1.2 Em seguida, deixe todas as pastas marcadase clique em **finish**
2. Com o projeto baixado, basta compilar a linguagem, vá até o arquivo **nest_dsl > src > prodest.es.gov.br.dsl > Clique com o direito em NestDsl.xtext > Run as > Generate Xtext Artifacts** ![Generate artifacts](link)
#### Configuração
Para fazer a configuração e uso da ferramenta, realize os seguintes passos:

1. **Clique com direito em nest_dsl > Run as > Eclipse Application**
2. Crie um projeto (pode ser um projeto java) **Clique em File > new > Java Project**
3. Depois de criado, clique com o direito no projeto recém criado e vá **Configure > Convert to Xtext Project** ![Convert xtext](link)
#### Uso



## Arquitetura gerada
O código gerado pelo NestG tem a seguinte arquitetura base:
![Arquitetura](link)
<br>
Todos os modulos gerados herdam desse modulo genérico, que contém todas as funcionalidades relacionadas aos CRUDs.