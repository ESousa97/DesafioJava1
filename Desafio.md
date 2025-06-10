# Desafio: Sistema Bancário Virtual em Java

## 📋 Objetivo do Projeto

Desenvolver um sistema de conta bancária virtual utilizando Java no IntelliJ IDEA. Este projeto tem como objetivo consolidar os conhecimentos fundamentais de programação, incluindo:

- Declaração de variáveis
- Estruturas condicionais
- Estruturas de repetição (loops)
- Manipulação de entrada do usuário
- Lógica de negócio básica

## 🏦 Funcionalidades do Sistema

### Dados Iniciais
O sistema deve inicializar com as seguintes informações do cliente:

```
***********************
Dados iniciais do cliente:

Nome: Jose Enoque
Tipo conta: Corrente
Saldo inicial: R$ 2300,00
***********************
```

### Menu de Operações
O sistema deve apresentar um menu interativo com 4 opções:

```
Operações

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada:
```

## 🔧 Implementação das Funcionalidades

### 1. Consultar Saldo (Opção 1)
- Exibe o saldo atual da conta
- Exemplo: "Saldo atual: R$ 2500.0"

### 2. Receber Valor (Opção 2)
- Solicita ao usuário o valor a ser depositado
- Atualiza o saldo somando o valor recebido
- Exibe o saldo atualizado

**Exemplo de uso:**
```
Digite a opção desejada:
2

Informe o valor a receber:
700

Saldo atualizado R$ 3200.0
```

### 3. Transferir Valor (Opção 3)
- Solicita ao usuário o valor a ser transferido
- Verifica se há saldo suficiente
- Se houver saldo: deduz o valor e exibe saldo atualizado
- Se não houver saldo: exibe mensagem de erro

**Exemplo de uso:**
```
Digite a opção desejada:
3

Informe o valor que deseja transferir:
1000

Saldo atualizado R$ 2200.0
```

### 4. Sair (Opção 4)
- Encerra a aplicação

## ⚠️ Validações Necessárias

### Validação de Opção Inválida
- Se o usuário digitar uma opção que não existe (ex: 9)
- Exibir: "Opção inválida"

### Validação de Saldo Insuficiente
- Se o usuário tentar transferir mais do que possui
- Exibir: "Não há saldo suficiente para fazer essa transferência"

**Exemplo:**
```
Saldo atual: R$ 2200.0
Valor a transferir: R$ 5000.0
Resultado: "Não há saldo suficiente para fazer essa transferência"
```

## 📝 Sugestões de Métodos

O projeto sugere a criação de métodos com nomes descritivos:

- `recebeTransferencia()`
- `fazTransferencia()`
- `enviaPix()`
- `recebePix()`
- Ou qualquer nomenclatura que você considere apropriada

## 🏗️ Plano de Desenvolvimento (Checklist)

### Etapa 1: Estrutura Básica
- [ ] Criar classe principal
- [ ] Inicializar dados do cliente (nome, tipo de conta, saldo)

### Etapa 2: Interface do Usuário
- [ ] Implementar menu de opções
- [ ] Criar loop principal da aplicação
- [ ] Implementar leitura de entrada do usuário

### Etapa 3: Funcionalidades Core
- [ ] Implementar consulta de saldo (opção 1)
- [ ] Implementar recebimento de valor (opção 2)
- [ ] Implementar transferência de valor (opção 3)
- [ ] Implementar opção de saída (opção 4)

### Etapa 4: Validações
- [ ] Validar opções inválidas do menu
- [ ] Validar saldo insuficiente para transferências
- [ ] Validar valores negativos (se aplicável)

### Etapa 5: Testes
- [ ] Testar todas as operações
- [ ] Testar cenários de erro
- [ ] Verificar se o saldo é atualizado corretamente

## 💡 Dicas de Implementação

1. **Teste cada etapa**: Implemente uma funcionalidade por vez e teste antes de prosseguir
2. **Use variáveis apropriadas**: Declare variáveis para saldo, nome, tipo de conta, etc.
3. **Implemente loops**: Use estruturas de repetição para manter o menu ativo
4. **Trate exceções**: Considere o que acontece se o usuário inserir dados inválidos
5. **Organize o código**: Divida a lógica em métodos menores e mais gerenciáveis

## 🎯 Objetivos de Aprendizado

Este projeto permite praticar:

- **Variáveis**: Declaração e manipulação de dados do cliente
- **Condicionais**: Validação de opções e saldo suficiente  
- **Loops**: Menu interativo que permanece ativo até o usuário sair
- **Métodos**: Organização do código em funções específicas
- **Scanner**: Leitura de entrada do usuário
- **Formatação**: Exibição adequada de valores monetários

---

**Lembre-se**: O objetivo é consolidar os conhecimentos adquiridos no curso através da prática. Implemente o projeto passo a passo, testando cada funcionalidade antes de avançar para a próxima!