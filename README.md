## LiterAlura - Catálogo de Livros com Java e Spring Boot

Bem-vindo ao **LiterAlura**!  
Uma aplicação console desenvolvida em **Java** e **Spring Boot** que consome a API gratuita **[Gutendex](https://gutendex.com/)** para buscar informações sobre livros e autores.

Os livros consultados são salvos em um banco de dados **PostgreSQL** local, permitindo consultas rápidas mesmo offline e evitando chamadas repetidas à API.

### Funcionalidades

- Buscar livro por título (consulta na API Gutendex + salvamento no banco)
- Listar todos os livros registrados no banco
- Buscar autor por nome
- Listar todos os autores registrados
- Listar autores vivos em determinado ano
- Listar livros por idioma
- Exibir o **Top 10** livros mais baixados
- Menu interativo com validação de entradas inválidas
- Persistência com **Spring Data JPA** e **PostgreSQL**
- Consumo eficiente da API com cache local (evita duplicatas)

### Requisitos

- **Java Development Kit (JDK)**: versão 21
- **Spring Framework**: Spring Boot 3.4.0
- **Conexão com a Internet**: necessária para acessar a API  
- **Maven**: para gerenciamento de dependências  
- **PostgreSQL**: versão 18
- **Bibliotecas Java:**  
  - Gson ou Jackson (para processar JSON)  
  - JDBC ou JPA/Hibernate (para comunicação com PostgreSQL)  
  - Driver JDBC PostgreSQL  
- **Dependências Spring Boot:**  
  - `spring-boot-starter-data-jpa`  
  - `spring-boot-starter-test`  
  - `spring-boot-maven-plugin`  

## Características

- **Consumo da API:** A aplicação utiliza a API gratuita Gutendex para obter informações de livros e autores, incluindo título, nome do autor, ano de publicação e idioma. A conexão é feita de forma eficiente, garantindo dados precisos e atualizados.  
- **Tratamento de entradas inválidas:** Caso o usuário digite uma entrada inválida, o sistema solicita novamente.  
- **Análise de JSON:** As respostas da API chegam em formato JSON e são processadas usando bibliotecas Java, como Jackson ou Gson, convertendo os dados em objetos manipuláveis.  
- **Armazenamento e consulta no banco de dados:** Os resultados da API são salvos no PostgreSQL local. Antes de realizar uma nova consulta, o sistema verifica se os dados já estão presentes, garantindo eficiência em buscas futuras.  
- **Exibição de resultados:** As informações são apresentadas de forma clara no menu interativo, com detalhes de título, autor, idioma, número de downloads e outros metadados relevantes.

## Instalação

1. **Clonar o repositório:**

```bash
git clone https://github.com/
cd alura-one-next-oracle-challenge-literalura
```

2. **Configurar o banco de dados PostgreSQL:**

- Instale o PostgreSQL e crie um banco de dados para a aplicação.
- Configure as credenciais de acesso no arquivo `application.properties`:

3. **Testar a aplicação:**

```bash
mvn clean install -DskipTests

```

4. **Executar a aplicação:**

```bash
mvn spring-boot:run
```

### Um exemplo de demostração do menu para que o usuário interage com a aplicação

```bash
Menu
Digite o número da opção que deseja executar.
1). Buscar livro por título
2). Listar livros registrados
3). Buscar autor por nome
4). Listar autores registrados
5). Listar autores vivos em um determinado ano
6). Listar livros por idioma
7). Top 10 livros mais baixados
0). Sair
```

#### Se escolher a apção 2, o sistema exibe os livros registrados no banco de dados:

```bash
2
```

#### Mostra os dados dos livros registrados:

Livros Registrados
___________________________________________________________________________
___________________________________________________________________________

 Titulo: Letters of a Javanese Princess
 Autor: Kartini, Raden Adjeng
 Idioma: EN
 Número de download: 1228
___________________________________________________________________________

 Titulo: The Merry Adventures of Robin Hood
 Autor: Pyle, Howard
 Idioma: EN
 Número de download: 2424
___________________________________________________________________________

 Titulo: The War of the Worlds
 Autor: Wells, H. G. (Herbert George)
 Idioma: EN
 Número de download: 6138
___________________________________________________________________________

 Titulo: La Odisea
 Autor: Homer
 Idioma: ES
 Número de download: 3312
___________________________________________________________________________

 Titulo: Frankenstein; Or, The Modern Prometheus
 Autor: Shelley, Mary Wollstonecraft
 Idioma: EN
 Número de download: 78467
___________________________________________________________________________

 Titulo: Don Quijote
 Autor: Cervantes Saavedra, Miguel de
 Idioma: ES
 Número de download: 12877
___________________________________________________________________________

 Titulo: The Ruins; Or, Meditation on the Revolutions of Empires and the Law of Nature
 Autor: Volney, C.-F. (Constantin-François)
 Idioma: EN
 Número de download: 527
___________________________________________________________________________

 Titulo: Grimms' Fairy Tales
 Autor: Grimm, Jacob
 Idioma: EN
 Número de download: 17728
___________________________________________________________________________

 Titulo: Moby Dick; Or, The Whale
 Autor: Melville, Herman
 Idioma: EN
 Número de download: 74858
___________________________________________________________________________

 Titulo: Alice's Adventures in Wonderland
 Autor: Carroll, Lewis
 Idioma: EN
 Número de download: 51356
___________________________________________________________________________

 Titulo: Little Women; Or, Meg, Jo, Beth, and Amy
 Autor: Alcott, Louisa May
 Idioma: EN
 Número de download: 50288
___________________________________________________________________________

 Titulo: Peter Pan
 Autor: Barrie, J. M. (James Matthew)
 Idioma: EN
 Número de download: 7768
___________________________________________________________________________

### Contato
<div style="display: inline_block" align="left" > 
<a href="https://discord.gg/QXnhv9H7fC" target="_blank" alt="Sabrina Souza#5541" title="Sabrina Souza#5541"><img src="https://img.shields.io/badge/Discord-7289DA?style=for-the-badge&logo=discord&logoColor=white" target="_blank"></a>
  <a href="https://mail.google.com/mail/u/0/#inbox?compose=CllgCJNrcmhcnjzCPDCbxXmtkDlWpFgcKKMPHktkGdltmNQvzLqFwwJDqCPpQHKbTKvQkgNwrbq" target="_blank" alt="lynxsabri@gmail.com" title="lynxsabri@gmail.com"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
  <a href="https://www.linkedin.com/in/sabrina-souza-6361a5148/" target="_blank" alt="sabrina-souza-6361a5148" title="sabrina-souza-6361a5148"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"/>
  </a>

### Licença

MIT
