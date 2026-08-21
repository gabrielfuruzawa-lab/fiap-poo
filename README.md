# Projeto FiapRide

## Descrição
Sistema de gerenciamento de passageiros desenvolvido como atividade prática da disciplina de Programação Orientada a Objetos (POO) da FIAP. O sistema permite cadastrar passageiros, realizar recargas de saldo e processar pagamentos de viagens, aplicando conceitos de encapsulamento, construtores e validação de regras de negócio.

## Funcionalidades
- **Cadastro**: Criação de passageiros exigindo nome e CPF.
- **Recarga de Saldo**: Adição de valores ao saldo do passageiro, com validação para impedir valores negativos ou zero.
- **Pagamento de Viagem**: Processamento de pagamentos, verificando se o custo é válido e se há saldo suficiente na conta.

## Como Executar
1. Importe o projeto no Eclipse ou IDE de sua preferência.
2. Execute a classe `SistemaPrincipal.java` contida no pacote `br.com.fiapride.main`.