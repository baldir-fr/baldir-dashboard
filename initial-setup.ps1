#!/usr/bin/env pwsh

Copy-Item -Path "src/git-hooks/windows/*" -Destination ".git/hooks" -Recurse