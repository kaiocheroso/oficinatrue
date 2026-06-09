# 2-Oficina
# Avaliação Prática – API de Oficina Mecânica

## Contexto

Uma oficina mecânica precisa de uma API para controlar seus clientes, os veículos cadastrados e as ordens de serviço abertas para manutenção.

O projeto base já foi iniciado por um colega do seu time de desenvolvedores, então está parcialmente completo. Entretanto, ele pediu para você dar continuidade e fazer o projeto "rodar".

Ele deixou alguns comentários com "TODO", que indicam pontos a fazer (to-do) no código.

Seu objetivo é analisar a estrutura do projeto, corrigir os problemas existentes e implementar as funcionalidades solicitadas.

A avaliação tem como foco verificar sua compreensão sobre:

- estrutura de uma API com Spring Boot;
- organização em camadas;
- uso de model, repository, service, controller e DTO;
- relacionamento entre entidades;
- integração com PostgreSQL;
- criação de rotas REST;
- validações;
- documentação com Swagger/OpenAPI;
- filtros simples;
- entrega via GitHub.

---

## Tema da API

Sistema de Oficina Mecânica.

A API deve trabalhar com as seguintes entidades principais:

- Cliente;
- Veiculo;
- OrdemServico.

---

## Relacionamentos esperados

Um cliente pode possuir vários veículos. Um veículo pertence a um único cliente.

Um veículo pode possuir várias ordens de serviço. Uma ordem de serviço pertence a um único veículo.

Representação simplificada:

Cliente 1 ---- N Veiculo  
Veiculo 1 ---- N OrdemServico

---

A entrega deve ser feita por meio de um repositório público no GitHub, e o link deve ser enviado no AVA.

Não haverá apresentação. A avaliação será feita pela análise do projeto entregue.

---

Durante a avaliação, é permitido consultar apenas os arquivos disponíveis na pasta:

/docs

Não é permitido consultar:

ChatGPT, Copilot ou qualquer outra IA generativa;
sites externos;
fóruns;
vídeos;
repositórios de terceiros;
colegas;
projetos antigos;
materiais fora da pasta /docs.

---

## Objetivo geral

Corrigir e completar a API da Oficina Mecânica, garantindo que o projeto rode corretamente, esteja conectado ao PostgreSQL, possua rotas REST funcionais, utilize Swagger e respeite a estrutura em camadas
