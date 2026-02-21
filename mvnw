#!/usr/bin/env sh
set -eu

MAVEN_VERSION="3.9.9"
BASE_DIR="$(CDPATH= cd -- "$(dirname -- "$0")" && pwd)"
WRAPPER_DIR="$BASE_DIR/.mvn/wrapper"
MAVEN_DIR="$WRAPPER_DIR/apache-maven-$MAVEN_VERSION"
MAVEN_TGZ="$WRAPPER_DIR/apache-maven-$MAVEN_VERSION-bin.tar.gz"
DOWNLOAD_URL="https://archive.apache.org/dist/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz"

mkdir -p "$WRAPPER_DIR"

if [ ! -x "$MAVEN_DIR/bin/mvn" ]; then
  echo "Downloading Apache Maven $MAVEN_VERSION..."
  if command -v curl >/dev/null 2>&1; then
    curl -fsSL "$DOWNLOAD_URL" -o "$MAVEN_TGZ"
  elif command -v wget >/dev/null 2>&1; then
    wget -q "$DOWNLOAD_URL" -O "$MAVEN_TGZ"
  else
    echo "curl or wget is required to download Maven." >&2
    exit 1
  fi

  tar -xzf "$MAVEN_TGZ" -C "$WRAPPER_DIR"
fi

exec "$MAVEN_DIR/bin/mvn" "$@"
