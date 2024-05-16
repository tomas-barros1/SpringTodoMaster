# TodoList API

Esta é uma API simples para gerenciar uma lista de tarefas (TodoList) usando Spring Boot, H2 Database e Spring Data JPA. A documentação da API está disponível através do Swagger.

## Funcionalidades

- Adicionar uma nova tarefa à lista
- Listar todas as tarefas
- Editar uma tarefa existente na lista
- Excluir uma tarefa da lista

## Pré-requisitos

- Java JDK 8 ou superior
- Maven
- Um cliente HTTP, como o Postman ou o Insomnia

## Como executar

1. Clone este repositório:

    ```bash
    git clone https://github.com/seu-usuario/todo-list-api.git
    ```

2. Navegue até o diretório clonado:

    ```bash
    cd todo-list-api
    ```

3. Execute o aplicativo usando Maven:

    ```bash
    mvn spring-boot:run
    ```

4. O aplicativo estará disponível em `http://localhost:8080`.

## Endpoints

- **POST /todos/add**: Adiciona uma nova tarefa à lista. O corpo da solicitação deve ser um JSON contendo os detalhes da tarefa.
- **GET /todos/list**: Lista todas as tarefas atualmente na lista.
- **PUT /todos/edit**: Edita uma tarefa existente na lista. O corpo da solicitação deve ser um JSON contendo os detalhes atualizados da tarefa, incluindo o ID.
- **DELETE /todos/delete/{id}**: Exclui uma tarefa da lista com o ID especificado.

## Documentação da API

A documentação da API está disponível através do Swagger. Você pode acessá-la em `http://localhost:8080/swagger-ui/index.html`.

## Exemplo de JSON para Adicionar uma Tarefa

```json
{
    "name": "Fazer almoço",
    "description": "Fazer o meu almoço",
    "done": false,
    "priority": 5
}
```

## Tecnologias Utilizadas

- Spring Boot
- H2 Database
- Spring Data JPA
- Swagger

## Autor

[Tomás Barros](https://github.com/tomas-barros1)
