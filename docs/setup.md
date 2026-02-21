# Setup

## Pré-requisitos

- Java 17+
- Acesso à internet para baixar dependências Maven no primeiro run

## Instalação

```bash
git clone https://github.com/ESousa97/DesafioJava1.git
cd DesafioJava1
```

## Validação local

```bash
./mvnw.cmd -B spotless:check
./mvnw.cmd -B checkstyle:check
./mvnw.cmd -B test
./mvnw.cmd -B verify
```

## Execução da aplicação

```bash
./mvnw.cmd -q compile
java -cp target/classes io.github.esousa97.desafio.DesafioApplication
```
