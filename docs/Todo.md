# Todo - Roadmap

**Documentation**

- [ ] Basic readme.md
- [ ] Learning path
  - Document what I learn while Programming. This way I can
  - Git tags after each iteration
- [ ] Todo / Roadmap
  - [ ] Simple markdown file to keep track of What's next (this file)
  - [ ] Migrate to Github / Gitlab issues later if necessary
- [ ] Features
- [ ] Migrate to Asciidoc
- [ ] Generated Behavior documentation from Gherkin
- [ ] Architecture decision records [ADR](https://adr.github.io/)
  - Lightweight ADRs : title, status, context, decision, consequences
    - [Markdown Architectural Decision Records](https://adr.github.io/madr/)
      - [Youtube - Markdown Architectural Decision Records: Capturing Decisions Where the Developer is Working](https://www.youtube.com/watch?v=t04uboZ9Lks)
- [ ] [Conventional commit 1.0.0](https://www.conventionalcommits.org/en/v1.0.0/)
  - Generate release notes from git commit messages
  - .githook (unix/windows)
  - [conventional commit with java](https://dwmkerr.com/conventional-commits-and-semantic-versioning-for-java/)
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

- [x] Decouple desktop behaviour from common app
    - [using function as parameter](Learning_path/kotlin-pass-function-as-parameter.md) 
- Cleanup all warnings (analyse project)
**Android**

- [ ] Setting up SDK
  - [ ] Running on device