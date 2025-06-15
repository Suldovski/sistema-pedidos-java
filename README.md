# Sistema de Pedidos - Projeto Java

## Informações Gerais
Este projeto simula um sistema de pedidos em Java, com foco em conceitos de Programação Orientada a Objetos. Os principais objetivos são:
- Gerenciar produtos, clientes, vendedores e pedidos.
- Calcular valores totais de pedidos.
- Emitir relatórios de pedidos realizados.

## Funcionalidades
- Cadastro de clientes, vendedores e produtos.
- Criação e registro de pedidos com múltiplos itens.
- Cálculo automático do valor total dos pedidos.
- Geração de relatórios através de uma interface genérica (`Imprimivel`).

## Estrutura de Classes e Relações

### Herança
- `Pessoa`: Superclasse de `Cliente` e `Vendedor`.

### Interfaces
- `Calculavel`: Implementada por `Pedido`, define o método `calcularTotal()`.
- `Imprimivel`: Implementada por `Pedido` e `Relatorio`, define o método `imprimir()`.

### Composição
- `Pedido` possui um `Cliente`, um `Vendedor`, e uma lista de `ItemPedido`.
- `ItemPedido` possui um `Produto` e uma quantidade.

### Agregação
- `Relatorio` recebe uma lista de objetos `Imprimivel`.

## Como Executar o Projeto

1. Abra seu IDE (como IntelliJ ou Eclipse).
2. Importe todos os arquivos `.java` do projeto.
3. Execute a classe `Principal.java`, que contém o `main`.
4. Siga as instruções no console para simular o uso do sistema.

## Uso do ChatGPT
O ChatGPT foi utilizado no projeto para:
- Esclarecimento e explicações de conceitos de POO.
- Correções e ajustes finais de código.
- Auxilio para configurar repositorio no git.

## Referências e Recursos
- Apoio do ChatGPT (OpenAI) na revisão de código, auxilio em pequenos ajustes finais e auxilio para configurar
o repositorio no git.