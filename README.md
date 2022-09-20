# springboot-Project
 
## Aqui detalharei o passo a passo do projeto: 

### 1° [CREATE NEW SPRING STARTER PROJECT]

> Pacote base de criação de classes da aplicação. 

### 2° [GERANDO DEPENDÊNCIAS]
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
