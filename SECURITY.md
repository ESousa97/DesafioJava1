# Security Policy

## Repository status

Este repositório está arquivado e mantido público apenas para estudo.
Não há garantia de resposta, correção, revisão ou SLA ativo para reportes.

## Supported Versions

| Version | Supported |
|---|---|
| 1.x | Yes |
| < 1.0.0 | No |

## Reporting a Vulnerability

Para reportar vulnerabilidades, envie detalhes para:
- E-mail: security@desafiojava1.local
- Assunto recomendado: `[SECURITY] DesafioJava1 - <resumo>`

Inclua:
- Vetor de ataque
- Impacto potencial
- Passos de reprodução
- Evidências (logs/trechos mínimos)

## Response SLA

- Confirmação de recebimento: até 72 horas
- Triagem inicial: até 5 dias úteis
- Atualizações de status: semanais até resolução

## Responsible Disclosure

- Não publicar PoC/exploit antes de correção disponível
- Não acessar dados de terceiros
- Não executar testes destrutivos

## Security baseline

- Pipeline com `dependency-review-action` em PRs para novas vulnerabilidades transitivas
- Pipeline semanal com `trivy` para varredura de severidades `HIGH` e `CRITICAL`
- Sem segredos em código-fonte versionado
- Configuração de ambiente via `.env.example`
