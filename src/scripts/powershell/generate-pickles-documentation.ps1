#!/usr/bin/env pwsh
. .\shared-functions.ps1

$FeatureDirectory="c:/dogfooding/baldir-dashboard/desktop-infra/src/jvmTest/resources/features"
# Directory where output files will be placed
$OutputDirectory="c:/dogfooding/baldir-dashboard/desktop-infra/build/reports/acceptance/pickles"
# Can be a comma separated list
$CucumberJsonTestResultsFiles="c:/dogfooding/baldir-dashboard/desktop-infra/build/reports/acceptance/cucumberReport.json"
$SystemUnderTestName="Baldir-dashboard"
# --df documentation format
# DHTML = dynamic HTML (with search)
# HTML = static HTML (without search)
# WORD = MS word (openxml)
# EXCEL
# CUCUMBER = cucumber json (not really useful because we already have richer cucumber json as input)
# JSON
$DocumentationFormat="DHTML"
# --trfmt - the format of the linked test results
# nunit|nunit3|xunit|xunit2|mstest|cucumberjson|specrun|vstest
# -l language
$Language="fr"
if (Test-CommandExists("pickles"))
{
    Write-Output "Generating living documentation with pickles..."
    Pickles -l=$Language --sn=$SystemUnderTestName --df=$DocumentationFormat --trfmt=cucumberjson --lr=$CucumberJsonTestResultsFile --feature-directory=$FeatureDirectory --output-directory=$OutputDirectory
    # Invoke-Command -ScriptBlock {}
    if($LASTEXITCODE -ne 0) {
        Write-Output "Could not generate living documentation with pickles."
        EXIT 1
    }

}
else
{
    Write-Output "Living documentation generation will be ignored."
}