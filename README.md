# springboot-Project
 
## Aqui detalharei o passo a passo do projeto, com algumas de minhas anotações. [Em Processo/In-process]

### [CREATE NEW SPRING STARTER PROJECT]

> Pacote base de criação de classes da aplicação. 

### [GERANDO DEPENDÊNCIAS]
- Spring Web 
> Ao add um starter automaticamente add um conjunto de dependências do projeto. O spring autoconfigura o projeto para usar as dep (baixando as bibliotecas necessárias e config o projeto para p desenvolvimento web).
> Caso de algum problema: 
```sh

maven - updateproject - force update

```

> Dependecy Hierarchy: Dep transitivas, podendo ter outras também. Pode-se dizer que a maven dependecy é uma pasta lógica, uma ref. <br>
> Repo local do maven: 
```sh

[nome do arquivo] ls ~/.m2/repository

```
> Gerando arquivo jar para rodar aplicação. Server content (TomCat)

### [JAR]
> run as - maven build... - clean <br>
> package (no input goals)
```sh

cd target 

ls

[Copiar caminho]

java -jar [nome do caminho]

```

### [IMPLEMENTANDO ENDPOINTS - COLLECTION RESOURCE]
- Postman
> Criar collection + nova requisição. Selecionar verbo http. LocalHost:8080/clientes <br>
> Criando classe controladora para tratar as req HTTP e enviar uma resposta. 

### [MÉTODOS]
- @GetMapping("Clientes")
> ou seja, qnd for feito uma req em /clientes volta o método criado. <br>
> Além disso precisamos dizer ao spring que isso é um componente spring capaz de tratar uma req HTTP.
- @RestController

### [LOMBOK]
- Gerador de Getters e Setters. 
- <a href="https://www.youtube.com/watch?v=W0ywxkvc4_M">Lombok no STS</a> 

### [OUTRAS ANOTAÇÕES - DICAS]

#### MySQL

```sh

spring.datasource.url=jdbc:mysql://localhost/levilog?createDatabaseIfNotExist=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=senha

```

<br> 

```sh

@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "nome"

```
<br>

> @PersistenceContext vai injetar um entity manager na variavél de instância. <br>

BIZU: JPQL linguagem de consultas do jakarta, onde consultas obj do modelo POO <br>

BIZU: como hablitar no console os sqls gerados, o jakarta esta gerando os sqls <br>

BIZU: em projetos prof são separadas as responsabilidades, criaremos um componente na nossa arquitetura  
que tem acesso aos dados e essa classe controladora usará esse componente. <br>

> @Repository anotação que define que a interface é um componente do spring, porém com uma semântica bem defininida 
comp spring é um tipo gerenciado pelo próprio container do spring, com isso injetamos uma instância de maneira fácil
usando injeção de dependências <br>


> @Autowired: significa que queremos gerar uma instância que esta sendo gerada pelo spring. o spring data fornece uma implemetação 
dessa interface aqui no repo automaticamente. 
<br>
