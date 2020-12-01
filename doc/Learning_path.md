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

Git tag : [01-init](https://github.com/baldir-fr/baldir-dashboard/releases/tag/01-init)

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
  
Git tag : [02-adr](https://github.com/baldir-fr/baldir-dashboard/releases/tag/02-adr)

## 03 - linting and git-hooks

- [ADR-0002 : use editorconfig](architecture/decisions/0002-enforce-basic-code-style-with-editorconfig.md)
- [gradle editorconfig plugin](Learning_path/gradle-editorconfig.md) : standard code style rules (+ Intellij specific rules)
- [kotlinter](Learning_path/gradle-kotlinter.md)
- optional [git-hook samples](Learning_path/git-hooks.md)
  - windows (pwsh)
    - pre-commit
      - re-generate ADR index
    - pre-push hooks
      - editorconfig lint
      - kotlin lint
      - build successfuly

Git tag : [03-lint](https://github.com/baldir-fr/baldir-dashboard/releases/tag/03-lint)

## 04 - ...

- BDD Starter with Cucumber
  - in a specific gradle module : domain-bdd (name subject to change)
    

- Asciidoc?
    - Lightweight markup languages
    - pros
        - more advanced capabilities than markdown
        - more output
        - some compatibility with markdown
        - plain text readable even if not formatted
        - include feature
        - can include file snippets (e.g. code samples from real code)
        - VCS friendly
    - cons
        - Harder to learn than markdown
        - Less out of the box support from tooling
        - Needs to setup tooling
        - Requires [much](https://asciidoc.org/README.html)
        - Challenging to install on Windows
        - Asciidoc (python) 
        - Asciidoctor (ruby)
        - [AsciidoctorJ](https://asciidoctor.org/docs/asciidoctorj/)
            - Maven & Gradle plugins
- Markdown ?
    - multiple flavours make it not that portable
    - no need to setup tooling generally
    - VCS friendly
    - Not much style and templating (specific to static generators such as Jekyll)
- LateX ?    
    - VCS friendly
- Headless cms?


- Hexagonal architecture and gradle modules

include(":android")
    dependencies {
        implementation(project(":common"))
    }
include(":desktop")
    dependencies {
        implementation(project(":common"))
        implementation(compose.desktop.currentOs)
    }
include(":common")
    androidMain
    androidTest
    commonMain
    commonTest
    desktopMain
    desktopTest

TODO : WIP
```puml
digraph G {
  compound=true;
  label="Hexagonal architecture";
    subgraph cluster1 {
        label="Hexagon";
        color="blue";
        subgraph cluster4 {
          label="Applicaton";
          color="blue";
          common;
        }
        subgraph cluster2 {
            label="Domain";
            color="green";
            test;
        }
        subgraph cluster3 {
            label="Infrastructure";
            color="red";
            ADAPTER -> PORT;
        }
    }
    subgraph clusterCommon{
        androidMain;
        androidTest;
        commonMain;
        commonTest;
        desktopMain;
        desktopTest;
    }
    subgraph clusterDesktop{
        label="desktop"
        jvmMain -> commonMain;
        jvmTest;
    }
    subgraph clusterAndroid{
        label="android"
        MainActivity -> commonMain;
    }
}
```
