## ADR automation

### adr-j

- Install [adr-j](https://github.com/adoble/adr-j)
- init adr with MADR template
  
```
adr init -t src/adr-template/madr-template.md doc/architecture/decisions
``` 

Add a new ADR

```
adr new "Use Architecture Decision Records"
```

### adr-log

Install [adr-log](https://adr.github.io/adr-log/) 
```
npm install -g adr-log
```

Update adr index.

```
adr-log -i doc/ArchitectureDecisions.md -d doc/architecture/decisions
```

This task may be used by CI