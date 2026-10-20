# build-console.ps1
#
# Builds rider-admin\console (Next.js static export) OUTSIDE the workspace and
# mirrors the exported site into BOTH:
#   rider-admin\public\
#   rider-admin\license\admin\
# The two mirrors are kept byte-identical and verified with a SHA-256 hash walk
# before success is reported.
#
# Rules honored by this script:
#   - NEVER runs npm install (or any package download).
#   - NEVER writes node_modules inside the workspace.
#   - Reuses the pre-installed node_modules from the zyqora-admin checkout by
#     copying it into the temp build dir.
#   - Handles the PowerShell native-stderr quirk: native commands do not throw
#     under $ErrorActionPreference='Stop', so output goes to a log file and the
#     exit code is inspected via $LASTEXITCODE.
#   - ASCII only: Windows PowerShell 5.1 reads a BOM-less .ps1 as ANSI, so this
#     file must contain no non-ASCII characters at all.

# Native-stderr quirk: NEVER run native commands under
# $ErrorActionPreference='Stop' in Windows PowerShell 5.1 - any stderr line
# becomes a terminating NativeCommandError. This script relies exclusively on
# explicit exit-code checks (robocopy codes, $LASTEXITCODE) and Fail().
$ErrorActionPreference = 'Continue'

function Fail([string]$msg) {
    Write-Host ''
    Write-Host ('BUILD-CONSOLE FAILED: ' + $msg) -ForegroundColor Red
    exit 1
}

# ---------------------------------------------------------------------------
# Paths
# ---------------------------------------------------------------------------

$repoRoot      = $PSScriptRoot
$consoleSrc    = Join-Path $repoRoot 'console'
$nodeModules   = 'C:\Users\toros\OneDrive\Desktop\zyqora-admin\node_modules'
$mirrorPublic  = Join-Path $repoRoot 'public'
$mirrorAdmin   = Join-Path $repoRoot 'license\admin'
$buildRoot     = Join-Path $env:TEMP 'acceptpro-console-build'
$buildLog      = Join-Path $buildRoot 'build.log'

if (-not (Test-Path -LiteralPath $consoleSrc)) {
    Fail ('console source not found: ' + $consoleSrc)
}
if (-not (Test-Path -LiteralPath (Join-Path $consoleSrc 'package.json'))) {
    Fail 'console\package.json is missing'
}
if (-not (Test-Path -LiteralPath $nodeModules)) {
    Fail ('node_modules source not found (read-only reuse): ' + $nodeModules)
}

Write-Host '=== AcceptPro console build ==='
Write-Host ('repo root    : ' + $repoRoot)
Write-Host ('console src  : ' + $consoleSrc)
Write-Host ('build dir    : ' + $buildRoot)
Write-Host ('node_modules : ' + $nodeModules + '  (copied, never installed)')

# ---------------------------------------------------------------------------
# 1. Stage the build tree in %TEMP% (outside the workspace)
# ---------------------------------------------------------------------------

if (-not (Test-Path -LiteralPath $buildRoot)) {
    New-Item -ItemType Directory -Path $buildRoot | Out-Null
}

Write-Host ''
Write-Host '[1/5] Staging console sources into the temp build dir...'

# /MIR keeps the staged copy an exact mirror (removed files do not linger).
# /XD protects the cached node_modules (and stale build products) from purge.
robocopy $consoleSrc $buildRoot /MIR /XD node_modules .next out /NFL /NDL /NJH /NJS /NC /NS /NP | Out-Null
if ($LASTEXITCODE -ge 8) { Fail ('robocopy of console sources failed with code ' + $LASTEXITCODE) }

# Drop stale build products so nothing from a previous run can leak in.
foreach ($stale in @('.next', 'out', 'node_modules\.cache')) {
    $p = Join-Path $buildRoot $stale
    if (Test-Path -LiteralPath $p) { Remove-Item -LiteralPath $p -Recurse -Force }
}
if (Test-Path -LiteralPath $buildLog) { Remove-Item -LiteralPath $buildLog -Force }

Write-Host '[2/5] Copying node_modules (read-only reuse from zyqora-admin)...'
$nmTarget = Join-Path $buildRoot 'node_modules'
robocopy $nodeModules $nmTarget /E /NFL /NDL /NJH /NJS /NC /NS /NP | Out-Null
if ($LASTEXITCODE -ge 8) { Fail ('robocopy of node_modules failed with code ' + $LASTEXITCODE) }

# ---------------------------------------------------------------------------
# 2. Build (offline: no npm install, no font fetch, telemetry disabled)
# ---------------------------------------------------------------------------

Write-Host '[3/5] Running: node node_modules\next\dist\bin\next build'

$nextBin = Join-Path $nmTarget 'next\dist\bin\next'
if (-not (Test-Path -LiteralPath $nextBin)) {
    Fail ('next build entry not found: ' + $nextBin)
}

$env:NEXT_TELEMETRY_DISABLED = '1'

Push-Location $buildRoot
try {
    # Native-stderr quirk: cmd.exe owns the redirection so PowerShell never
    # inspects node's stderr; the log file captures both streams and
    # $LASTEXITCODE is the only success signal.
    cmd /c ('node "' + $nextBin + '" build > "' + $buildLog + '" 2>&1')
    $buildExit = $LASTEXITCODE
} finally {
    Pop-Location
}

if ($buildExit -ne 0) {
    Write-Host ''
    Write-Host '--- tail of build.log ---' -ForegroundColor Yellow
    if (Test-Path -LiteralPath $buildLog) {
        Get-Content -LiteralPath $buildLog -Tail 60 | ForEach-Object { Write-Host $_ }
    }
    Fail ('next build exited with code ' + $buildExit + ' (full log: ' + $buildLog + ')')
}

$outDir = Join-Path $buildRoot 'out'
if (-not (Test-Path -LiteralPath (Join-Path $outDir 'index.html'))) {
    Fail ('export output missing index.html under ' + $outDir)
}

# Integration harness requirements: AcceptPro branding in the shell and
# root-absolute /_next/ asset references (never relative asset paths).
$indexHtml = Get-Content -LiteralPath (Join-Path $outDir 'index.html') -Raw
if ($indexHtml -notmatch 'AcceptPro') {
    Fail 'exported index.html does not contain AcceptPro branding'
}
if ($indexHtml -notmatch '(?:src|href)="/_next/') {
    Fail 'exported index.html does not reference root-absolute /_next/ assets'
}

# ---------------------------------------------------------------------------
# 3. Mirror the export into public\ and license\admin\
# ---------------------------------------------------------------------------

Write-Host '[4/5] Mirroring out\ into public\ and license\admin\ ...'

foreach ($mirror in @($mirrorPublic, $mirrorAdmin)) {
    $mirrorParent = Split-Path -Parent $mirror
    if (-not (Test-Path -LiteralPath $mirrorParent)) {
        New-Item -ItemType Directory -Path $mirrorParent | Out-Null
    }
    # Wipe + repopulate: /MIR makes the mirror exactly out\.
    robocopy $outDir $mirror /MIR /NFL /NDL /NJH /NJS /NC /NS /NP | Out-Null
    if ($LASTEXITCODE -ge 8) { Fail ('robocopy into ' + $mirror + ' failed with code ' + $LASTEXITCODE) }
}

# ---------------------------------------------------------------------------
# 4. Verify the two mirrors are byte-identical (SHA-256 hash walk)
# ---------------------------------------------------------------------------

Write-Host '[5/5] Verifying mirrors are byte-identical (SHA-256 hash walk)...'

function Get-TreeHashes([string]$root) {
    $map = @{}
    $rootFull = (Resolve-Path -LiteralPath $root).Path
    Get-ChildItem -LiteralPath $rootFull -Recurse -File | ForEach-Object {
        $rel = $_.FullName.Substring($rootFull.Length).TrimStart([char]0x5C, [char]0x2F)
        $rel = $rel.Replace([char]0x5C, [char]0x2F)
        $map[$rel] = (Get-FileHash -Algorithm SHA256 -LiteralPath $_.FullName).Hash
    }
    return $map
}

$hashesPublic = Get-TreeHashes $mirrorPublic
$hashesAdmin  = Get-TreeHashes $mirrorAdmin

$mismatch = $false
if ($hashesPublic.Count -ne $hashesAdmin.Count) {
    Write-Host ('  file count differs: public=' + $hashesPublic.Count + ' license\admin=' + $hashesAdmin.Count) -ForegroundColor Red
    $mismatch = $true
}
foreach ($rel in $hashesPublic.Keys) {
    if (-not $hashesAdmin.ContainsKey($rel)) {
        Write-Host ('  missing in license\admin: ' + $rel) -ForegroundColor Red
        $mismatch = $true
    } elseif ($hashesPublic[$rel] -ne $hashesAdmin[$rel]) {
        Write-Host ('  content differs: ' + $rel) -ForegroundColor Red
        $mismatch = $true
    }
}
foreach ($rel in $hashesAdmin.Keys) {
    if (-not $hashesPublic.ContainsKey($rel)) {
        Write-Host ('  missing in public: ' + $rel) -ForegroundColor Red
        $mismatch = $true
    }
}
if ($mismatch) {
    Fail 'public\ and license\admin\ are NOT byte-identical mirrors'
}

# ---------------------------------------------------------------------------
# Summary
# ---------------------------------------------------------------------------

$totalBytes = 0
foreach ($rel in $hashesPublic.Keys) {
    $totalBytes += (Get-Item -LiteralPath (Join-Path $mirrorPublic $rel)).Length
}

Write-Host ''
Write-Host 'BUILD-CONSOLE OK' -ForegroundColor Green
Write-Host ('  pages + assets : ' + $hashesPublic.Count + ' files, ' + $totalBytes + ' bytes')
Write-Host ('  mirror 1       : ' + $mirrorPublic)
Write-Host ('  mirror 2       : ' + $mirrorAdmin)
Write-Host ('  hash walk      : SHA-256 identical (' + $hashesPublic.Count + ' files compared)')
Write-Host ('  build dir kept : ' + $buildRoot + ' (cached node_modules for the next run)')
Write-Host ('  build log      : ' + $buildLog)
exit 0
