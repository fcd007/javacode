# Projeto Aplicativo Webservice com Java 11, Spring Boot, Hibernate, Microsoft SQL, Testes Automatizados, Clean Code

## Descrição do projeto

Projeto Gestão de vendas de itens cosméticos/perfumes, a ideia é ajudar a adicionar os pedidos a cada ciclo ou período, fazer o cadastro de clientes e realizar o pedido, exibindo o custo com ou sem desconto, cada cliente terá sua fatura/pagamento a realizar após lançar os itens e valores no seu nome, vamos de Java no Backend + ReactJS aplicação responsiva SPA, é um aplicativo básico de gerenciamento de clientes, pedidos e custos dos ciclo, cada entidade terá o recurso básico com o CRUD (Create, Read, Update, Delete), iremos adicionar uma parte de relatório de faturamento total para poder ajudar no controle de lucro do vendedor/consultor/representante.

## Entidades:
* Clientes;
* Pedidos;
* Produtos;
* Usuarios;

## Clientes:
- Listar  | GET  | `gestaovendasservice/api/v1/clientes` | Status Code (200 (OK)) | Busca todos os Clientes
- Criar   | POST | `gestaovendasservice/api/v1/clientes/criar` | Status Code (201 (OK)) | criar um novo Cliente
- Buscar  | GET  | `gestaovendasservice/api/v1/clientes/{id}` | Status Code (200 (OK)) | Buscar Cliente por ID
- Editar  | PUT  | `gestaovendasservice/api/v1/clientes/{id}` | Status Code (200 (OK)) | Atualizar Cliente
- Excluir | DELETE | `gestaovendasservice/api/v1/clientes/{id}` | Status Code (204 (No Content)) | Deletar Cliente

## Pedidos:
- Listar  | GET  | `gestaovendasservice/api/v1/pedidos` | Status Code (200 (OK)) | Busca todos os Pedidos
- Criar   | POST | `gestaovendasservice/api/v1/pedidos/criar` | Status Code (201 (OK)) | criar um novo Pedido
- Buscar  | GET  | `gestaovendasservice/api/v1/pedidos/{id}` | Status Code (200 (OK)) | Buscar Pedido por ID
- Editar  | PUT  | `gestaovendasservice/api/v1/pedidos/{id}` | Status Code (200 (OK)) | Atualizar Pedido
- Excluir | DELETE | `gestaovendasservice/api/v1/pedidos/{id}` | Status Code (204 (No Content)) | Deletar Pedido

## Produtos:
- Criar   | POST | `gestaovendasservice/api/v1/produtos/criar` | Status Code (201 (OK)) | criar um novo produto
- Buscar  | GET  | `gestaovendasservice/api/v1/produtos/{id}` | Status Code (200 (OK)) | Buscar produto por ID
- Editar  | PUT  | `gestaovendasservice/api/v1/produtos/{id}` | Status Code (200 (OK)) | Atualizar produto
- Excluir | DELETE | `gestaovendasservice/api/v1/produtos/{id}` | Status Code (204 (No Content)) | Deletar produto

## Usuarios:
- Criar   | POST | `gestaovendasservice/api/v1/usuarios/criar` | Status Code (201 (OK)) | criar um novo usuario
- Buscar  | GET  | `gestaovendasservice/api/v1/usuarios/{id}` | Status Code (200 (OK)) | Buscar usuario por ID
- Editar  | PUT  | `gestaovendasservice/api/v1/usuarios/{id}` | Status Code (200 (OK)) | Atualizar usuario
- Excluir | DELETE | `gestaovendasservice/api/v1/usuarios/{id}` | Status Code (204 (No Content)) | Deletar usuario

## Antes de iniciar

Verifique o ambiente com os seguintes parâmetros:

- Instalação Java 11+;
- Eclipse IDE ou Spring Tool Suite [STS];
- Verifique o projeto backend - script de criação do banco de dados;
- MS SQL Server 2019+;
- Conexão API Rest;

## Ferramentas e tecnologias do lado do servidor usadas

- Spring Boot 2 +
- SpringData JPA (Hibernate)
- Maven 3.2 +
- Tomcat 9+ / JBoss Wildfly
- Banco de dados MS SQL Server

Bora ao projeto, entra na pasta frontend e execute:

Clone o projeto em um local com permissões, abra-o no eclipse e aguarde 
as dependências serem baixadas, qualquer dúvida só enviar mensagem.
