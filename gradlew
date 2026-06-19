#!/bin/bash
# Gradle wrapper — downloads Gradle if not cached and runs it
set -e

GRADLE_DIR="$HOME/.gradle/wrapper/dists/gradle-8.10.2-all/8a10f4ddbcacb1ff1ef8a7e7a22b23d4"
GRADLE_HOME="$GRADLE_DIR/gradle-8.10.2"
GRADLE_BIN="$GRADLE_HOME/bin/gradle"

if [ ! -f "$GRADLE_BIN" ]; then
  echo "Downloading Gradle 8.10.2..."
  mkdir -p "$GRADLE_DIR"
  cd "$GRADLE_DIR"
  curl -sSLO https://services.gradle.org/distributions/gradle-8.10.2-all.zip
  unzip -qo gradle-8.10.2-all.zip
  rm gradle-8.10.2-all.zip
fi

cd "$(dirname "$0")"
exec "$GRADLE_BIN" "$@"