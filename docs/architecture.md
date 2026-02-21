# Architecture

## Context

O sistema implementa operações bancárias essenciais em CLI e prioriza separação de responsabilidades para facilitar evolução com baixo acoplamento.

## Componentes

- `DesafioApplication`: bootstrap e composição de dependências.
- `cli/BankCli`: interação com usuário e fluxo de menu.
- `service/BankService`: fachada de casos de uso.
- `domain/BankAccount`: regras de negócio de saldo.
- `exception/BusinessException`: erro de domínio com código semântico.

## Fluxo principal

1. Usuário informa opção no terminal.
2. `BankCli` interpreta input e chama `BankService`.
3. `BankService` delega operações para `BankAccount`.
4. Em violação de regra, `BusinessException` é tratada na CLI.

## Decisões

- Manter aplicação em CLI para foco pedagógico.
- Extrair domínio para viabilizar testes sem dependência de I/O.
- Usar Maven Wrapper para reprodutibilidade de build em qualquer ambiente.
