# Todo - Roadmap

**Documentation**

- [X] Basic readme.md
- [X] [Learning path](Learning_path.md)
  - Document what I learn while Programming. This way I can
  - Git tags after each iteration
- [ ] Todo / Roadmap
  - [X] Simple markdown file to keep track of What's next (this file)
  - [ ] Migrate to Github / Gitlab issues later if necessary
- [ ] Features
- [ ] Migrate to Asciidoc
- [ ] Generated Behavior documentation from Gherkin
- [X] Architecture decision records [ADR](https://adr.github.io/)
  - [X] Lightweight ADRs : title, status, context, decision, consequences
    - [Markdown Architectural Decision Records](https://adr.github.io/madr/)
      - [Youtube - Markdown Architectural Decision Records: Capturing Decisions Where the Developer is Working](https://www.youtube.com/watch?v=t04uboZ9Lks)
- [ ] [Conventional commit 1.0.0](https://www.conventionalcommits.org/en/v1.0.0/)
  - Generate release notes from git commit messages
  - .githook (unix/windows)
  - [conventional commit with java](https://dwmkerr.com/conventional-commits-and-semantic-versioning-for-java/)
- [ ] Choose a licence
- [ ] [Docs as code](https://www.writethedocs.org/guide/docs-as-code/)


**Scaffolding**

- [x] Setup multiplatform project (gradle)
- [x] Init git
- [ ] CI
- [ ] CD (release tags)

**UI**

- [x] Basic layout
    - `Column`
    - `Row`
- [ ] Dark mode
- [ ]

**Behaviour**

- Drive the new features from real needs
  - Split in very small

**Craftsmanship**

- Unit testing
  - [ ] Common
    - [ ] common
      - [ ] domain
    - [ ] android
    - [ ] desktop  
- BDD
  - [ ] write test functions that are "BDD ready"
  - [ ] write Gherkin scenarios
  - [ ] reconciliate Gherkin scenarios and automated tests using tooling 
    (e.g. [cucumber](https://cucumber.io/docs/installation/kotlin/))
- TDD

**Architecture**

- [ ] ADR : Git
- [ ] ADR : Github
- [ ] ADR : choose a VCS project structure
    - [Monorepo ?](https://monorepo.guide/)
- [ ] choose a VCS workflow 
    - [Trunk based?](https://trunkbaseddevelopment.com/)
- [x] Decouple desktop behaviour from common app
    - [using function as parameter](Learning_path/kotlin-pass-function-as-parameter.md)
    - It works in theory, but fails at compile due to what appeard to be SDK limitations 
- Cleanup all warnings (analyse project)
  - android lint ./gradlew lint
- [ ] ADR versionning model
    - Semver?
    - [changeset bot?](https://github.com/atlassian/changesets)
- [X] .editorconfig ADR
- [ ] encourage optional git hooks ADR
- [ ] kotlin linter ADR
- [ ] android linter ADR
- meta comment "Contracts are forever"
  - when a change is detected in a public API a warning is issued by CI / githook or whatever
- [ ] Scaffold a structured architecture documentation arborescence

**Android**

- [X] Setting up SDK
  - [X] Running on device
- [ ] Add a real icon
  
**Automation**

- [ ] Setting up SonarCloud
  - [ ] Bind github baldir-fr org to sonarcloud organization
  - [ ] Add sonarcloud scan to build
- [X] git pre-push hook (run the build)
  - [prevent secrets to leak](https://www.tygertec.com/git-hooks-practical-uses-windows/)
