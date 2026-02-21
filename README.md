# DesafioJava1

> Sistema bancário CLI em Java com arquitetura modular, testes automatizados e automação de qualidade.

![CI](https://github.com/ESousa97/DesafioJava1/actions/workflows/ci.yml/badge.svg)
![License](https://img.shields.io/github/license/ESousa97/DesafioJava1)
![Java](https://img.shields.io/badge/java-17%2B-LTS-blue)
![Last Commit](https://img.shields.io/github/last-commit/ESousa97/DesafioJava1)
![Issues](https://img.shields.io/github/issues/ESousa97/DesafioJava1)

---

`DesafioJava1` implementa operações bancárias essenciais em linha de comando: consulta de saldo, depósito e transferência.
O projeto foi estruturado para manutenção profissional com separação de responsabilidades, testes unitários e pipeline CI.
É uma base adequada para evolução incremental de funcionalidades sem perder legibilidade e previsibilidade.

## Demonstração

Exemplo rápido de execução:

```bash
./mvnw.cmd -q compile
java -cp target/classes io.github.esousa97.desafio.DesafioApplication
```

Screenshot da execução no terminal:

![Demonstração](imgs/javademo.png)

## Stack Tecnológico

- Java 17+ (LTS)
- Maven (via `mvnw`/`mvnw.cmd`)
- JUnit 5 (testes)
- Checkstyle (lint)
- Spotless + google-java-format (formatação)
- JaCoCo (coverage)
- GitHub Actions (CI)

## Pré-requisitos

- Java 17+ instalado e no `PATH`
- PowerShell (Windows) ou shell POSIX (Linux/macOS)

## Instalação e Uso

```bash
git clone https://github.com/ESousa97/DesafioJava1.git
cd DesafioJava1
```

1) Opcional: copie variáveis de ambiente

```bash
copy .env.example .env
```

2) Rodar aplicação

```bash
./mvnw.cmd -q compile
java -cp target/classes io.github.esousa97.desafio.DesafioApplication
```

## Scripts Disponíveis

| Comando | Finalidade |
|---|---|
| `./mvnw.cmd -B compile` | Compila o projeto |
| `./mvnw.cmd -B test` | Executa testes unitários |
| `./mvnw.cmd -B checkstyle:check` | Executa lint de código |
| `./mvnw.cmd -B spotless:check` | Valida formatação |
| `./mvnw.cmd -B spotless:apply` | Corrige formatação |
| `./mvnw.cmd -B verify` | Executa pipeline local completa |
| `pwsh ./scripts/validate.ps1` | Atalho de validação local |

## Arquitetura

```text
src
├── main/java/io/github/esousa97/desafio
│   ├── cli/        # Interface de terminal e fluxo interativo
│   ├── domain/     # Entidades e regras de negócio
│   ├── exception/  # Exceções de domínio
│   ├── service/    # Orquestração de regras de negócio
│   └── DesafioApplication.java
└── test/java/io/github/esousa97/desafio/service
    └── BankServiceTest.java
```

Decisões principais:
- Camada `cli` isolada da lógica de domínio.
- Regras de saldo centralizadas em `domain` e `service`.
- Exceções de negócio com código semântico (`BusinessException`).

## API Reference

N/A — projeto de linha de comando (não expõe API HTTP).

## Roadmap

- [x] Estruturar projeto com Maven e camadas coesas
- [x] Adicionar testes unitários para regras críticas
- [x] Configurar lint, format e coverage
- [x] Configurar CI e Dependabot
- [ ] Evoluir para persistência de dados
- [ ] Incluir testes de integração de I/O

## Contribuindo

Consulte [CONTRIBUTING.md](CONTRIBUTING.md) para padrão de branches, commits e validação local.

## Licença

Distribuído sob licença MIT. Consulte [LICENSE](LICENSE).

## Autor

Jose Enoque
- Portfólio: https://enoquesousa.vercel.app
- GitHub: https://github.com/ESousa97
