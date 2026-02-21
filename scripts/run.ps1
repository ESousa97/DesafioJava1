$ErrorActionPreference = 'Stop'

$projectRoot = Split-Path -Parent $PSScriptRoot
Set-Location $projectRoot

if (Test-Path '.\mvnw.cmd') {
  .\mvnw.cmd -q -DskipTests compile
  java -cp target/classes io.github.esousa97.desafio.DesafioApplication
} else {
  Write-Host 'Maven Wrapper não encontrado. Compile manualmente com javac ou instale Maven.' -ForegroundColor Yellow
}
