# Runs the whole suite against a throwaway server on its OWN port.
#
# This deliberately does not use the default 8787: if a dashboard server is
# already listening there, the test server dies with EADDRINUSE and every test
# would silently run against the STALE server instead, which produced a very
# confusing failure pattern once already. Hence the dedicated port plus the
# HasExited guard below.
#
# NOTE: keep this file pure ASCII. Windows PowerShell 5.1 reads a .ps1 without a
# BOM as ANSI, so a stray em-dash breaks string terminators at parse time.
#
#   powershell -ExecutionPolicy Bypass -File license\test\run-all.ps1

$ErrorActionPreference = 'Stop'
$here = Split-Path -Parent $MyInvocation.MyCommand.Path   # license/test
$root = Split-Path -Parent $here                          # license/
Set-Location (Split-Path -Parent $root)                   # workspace root

$env:PORT = '8790'
$env:LICENSE_BASE = 'http://localhost:8790'
if (-not $env:ADMIN_PASSWORD) { $env:ADMIN_PASSWORD = 'admin@123' }

Remove-Item (Join-Path $root 'data\db.json') -Force -ErrorAction SilentlyContinue

Write-Host "=== unit: license core ===" -ForegroundColor Cyan
node license/test/core.test.ts
if ($LASTEXITCODE -ne 0) { Write-Host "UNIT FAILED" -ForegroundColor Red; exit 1 }

$p = Start-Process node -ArgumentList 'license/src/server.ts' -PassThru -WindowStyle Hidden
Start-Sleep -Seconds 3

if ($p.HasExited) {
    Write-Host "server exited immediately (code $($p.ExitCode)) - is port $env:PORT already in use?" -ForegroundColor Red
    exit 1
}

Write-Host "=== e2e: live server on $env:LICENSE_BASE ===" -ForegroundColor Cyan
node license/test/e2e.test.ts
$code = $LASTEXITCODE
Stop-Process -Id $p.Id -Force -ErrorAction SilentlyContinue

if ($code -eq 0) {
    Write-Host "ALL SUITES PASSED" -ForegroundColor Green
} else {
    Write-Host "E2E FAILED" -ForegroundColor Red
}
exit $code
