# Enforce basic code style with editorconfig

* Status: Accepted
* Deciders: Marc Bouvier
* Date: 2020-11-22

## Context and Problem Statement

Editors and IDE might have different default settings for code style. Also Operating Systems can have different settings
like end of line characters.

Not having consistency in basic code style may add noise to files commited (change of indentation style, end of lines ...)

## Considered Options

* Version IDE settings in git repository
* Use .editorconfig for lightweight code standards

## Decision Outcome

Chosen option: ".editorconfig", because it is a simple universal way to check simple code style across various tooling 
and OS.

### Positive Consequences

* More consistency on commits and push to VCS
* Less potential noise on VCS changesets  
* Possible automation of lint and format with tools (build & CI)

## Pros and Cons of the Options

### Version IDE settings in git repository

ex. `.idea` metadata folder 

* Good, because a lot of advanced code style rules can be enforced
* Bad, too much tied with a specific editor might be an obstacle to open-source contribution
* Bad, because rules can vary between Editors and IDE
* Bad, because some IDE settings might have to be setup manually
* Bad, because it's hard to synchronize rules among all Editors vendors
* Bad, because noise can happen when automatic IDE settings changes (ex. plugin added)

### Use .editorconfig for lightweight code standards

[EditorConfig](https://editorconfig.org/) proposes a lightweight basic coding styles rules
largely supported and by various Editors and IDEs.

* Good, because rules can be applied depending on technology (e.g different indent style for python and java)
* Good, because even if some coding style from IDEs are not supported, some editors support optional advanced rules 
  (e.g rules prefixed by `ij_` for intelliJ) 
* Good, because there is a very good tooling support (IntelliJ allows to export automatically the Ide Config into an 
  .editorconfig file). A lot of editors have native support.
* Allows some tooling to automatically check and automatically lint files
* Bad, because only a few coding styles are supported across all editors
