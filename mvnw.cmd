@echo off
setlocal enabledelayedexpansion

set "MAVEN_VERSION=3.9.9"
set "BASE_DIR=%~dp0"
set "WRAPPER_DIR=%BASE_DIR%.mvn\wrapper"
set "MAVEN_DIR=%WRAPPER_DIR%\apache-maven-%MAVEN_VERSION%"
set "MAVEN_ZIP=%WRAPPER_DIR%\apache-maven-%MAVEN_VERSION%-bin.zip"
set "DOWNLOAD_URL=https://archive.apache.org/dist/maven/maven-3/%MAVEN_VERSION%/binaries/apache-maven-%MAVEN_VERSION%-bin.zip"

if not exist "%WRAPPER_DIR%" mkdir "%WRAPPER_DIR%"

if not exist "%MAVEN_DIR%\bin\mvn.cmd" (
  echo Baixando Apache Maven %MAVEN_VERSION%...
  powershell -NoProfile -ExecutionPolicy Bypass -Command "Invoke-WebRequest -UseBasicParsing '%DOWNLOAD_URL%' -OutFile '%MAVEN_ZIP%'"
  if errorlevel 1 (
    echo Falha ao baixar Maven.
    exit /b 1
  )

  powershell -NoProfile -ExecutionPolicy Bypass -Command "Expand-Archive -Path '%MAVEN_ZIP%' -DestinationPath '%WRAPPER_DIR%' -Force"
  if errorlevel 1 (
    echo Falha ao extrair Maven.
    exit /b 1
  )
)

"%MAVEN_DIR%\bin\mvn.cmd" %*
exit /b %errorlevel%
