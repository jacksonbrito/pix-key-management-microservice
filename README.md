# PIX-KEY-MANAGEMENT-MICROSERVICE

### Este projeto foi criado para fins de estudo no qual será realizado um CRUD: 

## C - reate
## R - ead
## U - pdate
## D - elete

### Utilizaremos nesse cara arquitetura MVC Básica: 


```plaintext
src
 └── main
     ├── java
     │   └── com
     │       └── br
     |           └── pix
     │                ├── controller
     │                │   └── UserController.java
     │                ├── dto
     │                │   └── UserDTO.java
     │                ├── model
     │                │   └── User.java
     |                ├── repository
     │                │   └── UserRepository.java
     │                ├── service
     │                │   └── UserService.java
     │                └── Application.java
     └── resources
         ├── application.properties
```

### Explicando sobre cada pacote:

#### Controller: Trata as requisições HTTP e interage com o Service para processar as operações solicitadas.

### DTO: Data Transfer Object, é um padrão de design usado para transferir dados entre diferentes camadas de uma aplicação.

#### Model: Representa a entidade do nosso sistema. Normalmente, essa classe é anotada com @Entity e contém os atributos do usuário, além de getters e setters.

#### Repository: Estende JpaRepository e fornece métodos CRUD básicos para a entidade.

#### Service: Contém a lógica de negócios da aplicação. Ela chama o repositório para realizar operações no banco de dados.


