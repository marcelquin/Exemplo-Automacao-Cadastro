# API de Cadastro de Clientes

API simples para cadastro de clientes, desenvolvida para receber dados através de uma automação Python que processa arquivos CSV.

## 💻 Funcionalidades

- Cadastro de novos clientes via endpoint POST
- Recebe nome e email do cliente
- Integração com automação Python para processamento de CSV

## 🔧 Requisitos

- Java Spring boot 3 +
- python 3 ou superior

## 🚀 Endpoints

### POST /api/cliente/novo
Cadastra um novo cliente no sistema.


## 📋 Estrutura do CSV esperado

O arquivo CSV deve conter as seguintes colunas:
- nome
- email


## 🔌 Como Executar

1. Clone o repositório
2. Instale as dependencias do projeto de automação
3. Execute a Api
4. Execute o script automacao.py
5. para verificar os dados entre no link: http://localhost:8080/swagger-ui/index.html#/ 
