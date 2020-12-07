#!/usr/bin/env pwsh
Write-Output "Loading powershell shared utility functions..."

Function Test-CommandExists
{
    Param ($command)
    $oldPreference = $ErrorActionPreference
    $ErrorActionPreference = 'stop'
    try
    {
        if (Get-Command $command)
        {
            RETURN $true
        }
    }
    Catch
    {
        Write-Host "$command command does not exist"; RETURN $false
    }
    Finally
    {
        $ErrorActionPreference = $oldPreference
    }
}

Write-Output "Powershell shared utility functions loaded."