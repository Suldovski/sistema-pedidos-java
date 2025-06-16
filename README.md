# Sistema de Pedidos em Java

##  Informações Gerais

Este projeto consiste em um sistema simples de pedidos desenvolvido em Java, utilizando os princípios da Programação Orientada a Objetos (POO). Ele permite o cadastro de clientes, vendedores, produtos, e a criação de pedidos contendo múltiplos itens.

##  Objetivos e Funcionalidades

- Cadastro de clientes e vendedores
- Cadastro de produtos com preço
- Criação de pedidos com múltiplos itens
- Relatório de pedidos (implementação de interfaces)
- Cálculo de valores totais de pedidos
- Uso de herança, agregação, composição e interfaces

##  Estrutura de Classes

### 🔹 Pessoa (Classe Abstrata)
Superclasse base para Cliente e Vendedor. Contém atributos comuns como `nome` e `cpf`.

### 🔹 Cliente
Herdeira de `Pessoa`, representa um cliente do sistema.

### 🔹 Vendedor
Herdeira de `Pessoa`, representa o vendedor responsável pelo pedido.

### 🔹 Produto
Contém nome e preço do produto.

### 🔹 ItemPedido
Associa um produto a uma quantidade. Relacionamento de composição com `Pedido`.

### 🔹 Pedido
Agrega Cliente, Vendedor e uma lista de `ItemPedido`. Calcula o total.

### 🔹 Interfaces
- `Calculavel`: Interface para objetos que podem ser calculados (valor total do pedido).
- `Imprimivel`: Interface usada para gerar relatórios.

### 🔹 Relatorio
Implementa `Imprimivel` para exibir pedidos.

### 🔹 Principal
Classe com o `main`, responsável pela interação com o usuário via terminal.

##  Como Executar o Projeto

1. Instale o Java (versão 11 ou superior)
2. Compile todos os arquivos `.java` com:
   ```bash
   javac *.java
   ```
3. Execute com:
   ```bash
   java Principal
   ```

## Uso do ChatGPT

A ferramenta ChatGPT foi utilizada no desenvolvimento deste projeto para:
- Corrigir e melhorar a estrutura dos arquivos `.java`
- Auxilio na documentação deste `README.md`
- Orientar na criação e configuração do repositório GitHub

##  Referências

- Git e GitHub para iniciantes (projeto e versionamento)

---
## Equipe 

- Luan Gabriel Iliano Suldovski
- Vinicius Vilkevicius de Souza
