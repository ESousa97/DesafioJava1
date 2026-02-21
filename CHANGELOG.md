# Changelog

All notable changes to this project are documented in this file.

The format is based on Keep a Changelog and this project adheres to Semantic Versioning.

## [1.0.1] - 2026-02-21

### Changed

- Repositório marcado como arquivado para estudo, com aviso explícito em documentação e templates de governança.
- Dependabot configurado para não abrir novos pull requests.

## [1.0.0] - 2026-02-20

### Added

- Maven project structure (`src/main/java`, `src/test/java`) and modular package layout.
- Automated quality stack: Checkstyle, Spotless, JaCoCo.
- Unit tests for `BankService` critical rules.
- GitHub governance: issue templates, PR template, CODEOWNERS, FUNDING.
- CI workflow and scheduled security dependency workflow.
- Dependabot for Maven and GitHub Actions.
- Internal baseline/final reporting docs and operational scripts.

### Changed

- Replaced single-file monolithic implementation with layered architecture (`cli`, `domain`, `service`, `exception`).
- Rewrote README for production-grade onboarding and maintenance.

### Removed

- Legacy root-level `Desafio.java` source file.

### Fixed

- Consolidated input validation and business-rule error handling.

### Security

- Added explicit vulnerability disclosure policy and weekly dependency scan automation.
