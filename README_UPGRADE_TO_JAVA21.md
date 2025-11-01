# Upgrade to Java 21 (LTS) — Local instructions

This project contains plain Java sources under `src/` and is compiled to `bin/` by default.

The workspace doesn't include a Maven or Gradle wrapper. Because the online upgrade tool is unavailable from this environment, follow these local steps to move to Java 21.

1) Install JDK 21

- Ubuntu / Debian (example using Temurin/Adoptium):
  ```bash
  # Using apt with PPA or download Adoptium packages; alternatively use SDKMAN (recommended)
  curl -s "https://get.sdkman.io" | bash
  source "$HOME/.sdkman/bin/sdkman-init.sh"
  sdk install java 21-open
  sdk use java 21-open
  ```

- macOS (brew):
  ```bash
  brew install --cask temurin21
  ```

2) Point VS Code to your JDK 21 installation

- Open `.vscode/settings.json` and replace `/path/to/jdk-21` with the absolute path of your JDK 21 installation (for example `/usr/lib/jvm/jdk-21` or `~/.sdkman/candidates/java/21-open`).

3) Verify locally (quick):

Run the provided script to check java/javac and compile using `--release 21`:

```bash
chmod +x scripts/check-java.sh
./scripts/check-java.sh
```

If compilation succeeds, run the project:

```bash
java -cp bin App
```

4) If you want a full automated upgrade using the Copilot Java upgrade tool

- The workspace's automated upgrade tool requires a paid Copilot plan and can't be invoked from this session. If you want, I can still help manually: detect incompatibilities, update source-level APIs, and add a build tool (Maven/Gradle) so you can manage releases and toolchains more easily.

If you share the exact JDK 21 path, I can update `.vscode/settings.json` for you and attempt a local compile here (if this environment has JDK 21 installed). Otherwise, follow the steps above on your machine.
