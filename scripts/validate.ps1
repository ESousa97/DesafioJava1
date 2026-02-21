$ErrorActionPreference = 'Stop'

$projectRoot = Split-Path -Parent $PSScriptRoot
Set-Location $projectRoot

if (-not (Test-Path '.\mvnw.cmd')) {
  throw 'Maven Wrapper não encontrado.'
}

.\mvnw.cmd -B spotless:check
.\mvnw.cmd -B checkstyle:check
.\mvnw.cmd -B test
.\mvnw.cmd -B verify
