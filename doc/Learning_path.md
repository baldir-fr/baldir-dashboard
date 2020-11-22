# Learning path

What I learned while developing this application.

## Episode 01 - Boostraping

- Toying with some UI stuff
    - A Menu for desktop
      - Exit app
    - A bit of layout
    - Trigger platform event from common code
- Toying with kotlin code in [Intellij Scratch file](https://www.jetbrains.com/help/idea/scratches.html)
- Install Android SDK
- Run on real Android Device (Android 9.0)
  - Error on android when I pass function from android Main into common 
- Setting up markdown documentation
    - [Learning path](Learning_path.md)
    - [Todo - Roadmap](Todo.md)
    - [Readme](../readme.md)
- Init git locally

**Kotlin**

- [How to pass a function as a parameter in Kotlin](Learning_path/kotlin-pass-function-as-parameter.md)
- [Run kotlin code interactively in scratch file](Learning_path/kotlin-scratch-file-run-interactive.md)

Git tag 01-init

## Offline 02 - ADR : Architectural Decision Records

- Setup ADR
  - [adr-j](https://github.com/adoble/adr-j)
  - init adr with MADR
    `adr init -t src/adr-template/madr-template.md doc/architecture/decisions`
    - add an adr
      `adr new "Use Architecture Decision Records"`
    - [adr-log](https://adr.github.io/adr-log/) `npm install -g adr-log`
      - `adr-log -i ArchitectureDecisions.md -d doc/architecture/decisions`
  - [ADR automation](Learning_path/adr-automation.md)
  
Git tag 02-adr