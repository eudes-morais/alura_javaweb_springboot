#!/usr/bin/env bash
set -euo pipefail

echo "Checking Java runtime and compiling project (expects JDK 21 installed)"

echo
echo "java -version"
java -version || true

echo
echo "javac -version"
javac -version || true

echo
echo "Compiling all sources into bin/ using --release 21 (if supported)"
mkdir -p bin
tmpfile=$(mktemp)
find src -name "*.java" > "$tmpfile"
if [[ -s "$tmpfile" ]]; then
  javac --release 21 -d bin "@${tmpfile}"
  echo "Compilation succeeded. Run: java -cp bin App"
else
  echo "No Java source files found under src/."
fi
rm -f "$tmpfile"
