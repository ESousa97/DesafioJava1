# Deployment

## Modelo atual

Projeto CLI empacotado como JAR (`target/desafio-java1-1.0.0.jar`) para execução em JVM.

## Build de release

```bash
./mvnw.cmd -B clean verify
```

## Execução do artefato

```bash
java -cp target/desafio-java1-1.0.0.jar io.github.esousa97.desafio.DesafioApplication
```

## Observações

- Não há endpoint HTTP; deploy é distribuição do artefato JAR.
- Pipeline CI garante lint, testes e build em Java 17 e 21.
