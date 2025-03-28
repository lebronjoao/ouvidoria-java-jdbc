# Ouvidoria CRUD - Java, JDBC e MySQL

## Descrição
Este projeto implementa um sistema de Ouvidoria com funcionalidades CRUD (Criar, Ler, Atualizar e Deletar) utilizando Java, JDBC e MySQL. O sistema permite que os usuários registrem, consultem, editem e excluam reclamações, sugestões e elogios.

## Tecnologias Utilizadas
- **Java**: Linguagem de programação principal
- **JDBC**: API para conexão com banco de dados
- **MySQL**: Banco de dados relacional
- **Maven**: Gerenciador de dependências

## Funcionalidades
- **Cadastrar nova manifestação** (reclamação, sugestão ou elogio)
- **Listar todas as manifestações**
- **Listar as manifestações por tipo**
- **Buscar uma manifestação por ID**
- **Excluir uma manifestação**

## Configuração do Ambiente
1. **Instale o MySQL** e crie um banco de dados:
   ```sql
   CREATE DATABASE ouvidoria-java2;
   USE ouvidoria-java2;
   CREATE TABLE manifestacao (
    id int auto_increment,
    autor varchar(100),
    ouvidor varchar(50),
    descricao varchar(500),
    tipo varchar(20),
    primary key(id)
   );
   ```

2. **Configure a conexão JDBC** no arquivo `DatabaseConnection.java`:
   ```java
   String JDBC_URL = "jdbc:mysql://localhost:3306/ouvidoria-java2";
   String JDBC_USER = "root";
   String JDBC_PASSWORD = "sua_senha";
   ```

3. **Execute o projeto** com um IDE como IntelliJ ou Eclipse.

## Como Usar
1. Execute a aplicação Java (Classe Main).
2. Escolha uma opção no menu para criar, listar, buscar, atualizar ou deletar manifestações.

## Melhorias Futuras
- Implementar interface gráfica (JavaFX ou Swing)
- Criar autenticação de usuários
- Implementar API REST

## Contribuição
Sinta-se à vontade para contribuir enviando pull requests ou abrindo issues.

## Licença
Este projeto está sob a licença MIT.
