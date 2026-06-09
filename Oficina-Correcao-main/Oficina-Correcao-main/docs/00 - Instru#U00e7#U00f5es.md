## Mínimo esperado

Para que a avaliação seja considerada entregue, o projeto deve:

- iniciar sem erro;
- conectar ao PostgreSQL;
- possuir CRUD funcional;
- estar em repositório público no GitHub.

Não espere que o projeto compile ou rode corretamente no primeiro momento. Parte da avaliação é justamente identificar e corrigir os problemas existentes.

## Instruções
1. Corrigir a configuração do projeto

Verifique se:

- o projeto inicia corretamente;
- o banco PostgreSQL está configurado;
- o application.properties possui as configurações corretas;
- as dependências necessárias estão no pom.xml.

---

2. Corrigir as entidades

As entidades devem estar corretamente mapeadas com JPA.

Entidades esperadas:

## Entidades esperadas

- Cliente:
  idCliente; nome; telefone; email.

- Veiculo:
  idVeiculo; placa; modelo; ano; cliente.

- OrdemServico:
  idOrdemServico; descricaoProblema; status; valorServico; veiculo.

---

3. Implementar os relacionamentos

O sistema deve permitir:

cadastrar cliente;
cadastrar veículos vinculados a um cliente;
cadastrar ordens de serviço vinculadas a um veículo;
listar veículos de um determinado cliente;
listar ordens de serviço de um determinado veículo.

--- 

4. Implementar os DTOs

O projeto deve usar DTOs para entrada e saída de dados.

Não é obrigatório retornar todos os dados da entidade diretamente.

Os DTOs devem ajudar a organizar as informações recebidas e devolvidas pela API.

---

5. Implementar os CRUDs principais

A API deve possuir rotas para:

Cliente
- GET /clientes
- GET /clientes/{idCliente}
- POST /clientes
- PUT /clientes/{idCliente}
- DELETE /clientes/{idCliente}

Veiculo
- GET /veiculos
- GET /veiculos/{idVeiculo}
- POST /veiculos
- PUT /veiculos/{idVeiculo}
- DELETE /veiculos/{idVeiculo}

OrdemServico
- GET /ordens
- GET /ordens/{idOrdemServico}
- POST /ordens
- DELETE /ordens/{idOrdemServico}

---

6. Criar consultas úteis

A API deve possuir pelo menos as seguintes consultas:

Lista os veículos cadastrados para um determinado cliente.
GET /veiculos/cliente/{idCliente}

Lista as ordens de serviço de um determinado veículo.
GET /ordens/veiculo/{idVeiculo}

Filtra veículos pela placa.
GET /veiculos/filtro?placa=...

---

7. Aplicar validações

Utilize validações nos DTOs ou entidades, como:

campo obrigatório;
valor positivo;
email válido;
capacidade positiva;
nome não vazio.

--- 

8. Configurar Swagger/OpenAPI

O projeto deve possuir documentação Swagger funcionando e personalizada.

Ao executar o projeto, o Swagger deve estar acessível em uma das opções abaixo:

http://localhost:8080/swagger-ui.html
ou
http://localhost:8080/swagger-ui/index.html

As principais classes e rotas devem possuir anotações
@Operation
@Tag

---

9. Testar a API

Teste as rotas principais usando Postman ou Swagger.

É importante verificar:

cadastro;
listagem;
busca por idCliente;
atualização;
remoção;
relacionamento entre entidades;
filtros.

--- 

10. Entregar no GitHub

Ao final, suba o projeto em um repositório público no GitHub.

O repositório deve conter:

código-fonte completo;
README atualizado;
pasta /docs;
projeto funcionando;
nome do aluno no README.
