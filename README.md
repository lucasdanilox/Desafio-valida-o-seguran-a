# Desafio-validacao-seguranca

![Modelo de domínio Desafio01](https://i.postimg.cc/159r9G5m/desafio.png)

# Sobre o projeto

Este foi um desafio iniciado pelo professor Nélio Alves, no qual o projeto já estava pronto, contendo apenas os DTOs, entidades e os testes de TDD. 
Foi proposto que eu implementasse as funcionalidades necessárias para que os testes do projeto fossem bem-sucedidos. 
Dessa forma, criei os controllers para City e Event, bem como os services.
Utilizei o Handler para personalizar as respostas de exceções e adicionei as entidades User e Role para proporcionar segurança ao projeto,
utilizando JWT e OAuth2. Isso possibilita requisições de login para administradores ou clientes, onde alguns endpoints podem ser acessados por administradores,
enquanto apenas alguns estão disponíveis para clientes. Além disso, a cada login é gerado o token de segurança.

# Tecnologias utilizadas
## Back end

- Java
- Spring Boot
- JPA
- Hibernate
- ORM
- OAuth2
- Spring Security
- JUnit tests

# Autor

Lucas Danilo de Castro

https://www.linkedin.com/in/lucasdanilox/
