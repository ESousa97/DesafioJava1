# Contributing Guide

## Repository status

Este repositório está arquivado e permanece público apenas para fins de estudo.
Não há garantia de resposta, revisão, correção ou processamento de pull requests.

## Development setup

```bash
git clone https://github.com/ESousa97/DesafioJava1.git
cd DesafioJava1
```

Use Java 17+ e execute validações locais:

```bash
./mvnw.cmd -B spotless:check
./mvnw.cmd -B checkstyle:check
./mvnw.cmd -B test
./mvnw.cmd -B verify
```

## Code style and conventions

- Formatação: Spotless (`google-java-format`)
- Lint: Checkstyle (`config/checkstyle/checkstyle.xml`)
- Estrutura: separação `cli`, `service`, `domain`, `exception`
- Não introduzir código morto, duplicação ou strings mágicas sem contexto

## Branches and commits

### Branch naming

- `feat/<descricao-curta>`
- `fix/<descricao-curta>`
- `refactor/<descricao-curta>`
- `docs/<descricao-curta>`

### Conventional Commits

```text
<type>(<scope>): <description>
```

Tipos aceitos:
- `feat` — nova funcionalidade
- `fix` — correção de bug
- `refactor` — refatoração sem mudança de comportamento
- `docs` — documentação
- `style` — formatação (sem mudança de lógica)
- `test` — adição/correção de testes
- `chore` — manutenção e infraestrutura
- `ci` — mudanças de CI/CD
- `perf` — melhorias de performance
- `security` — correções de segurança

## Pull request process

1. Abra PR contra `main`
2. Preencha `PULL_REQUEST_TEMPLATE.md`
3. Garanta pipeline local e CI verde
4. Aguarde revisão de `CODEOWNERS`

## Running tests

```bash
./mvnw.cmd -B test
./mvnw.cmd -B verify
```

## Areas open for contribution

- Persistência de dados (arquivo local ou banco)
- Testes de integração da camada CLI
- Internacionalização de mensagens

## Maintainer

- Portfólio: https://enoquesousa.vercel.app
- GitHub: https://github.com/ESousa97
