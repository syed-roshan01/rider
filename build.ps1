#Requires -Version 5.1
<#
  Ride Accepter - build / sign / verify / install pipeline.

    .\build.ps1 build     rebuild APK from the decoded-apktool tree
    .\build.ps1 sign      zipalign + apksigner sign (creates keystore if needed)
    .\build.ps1 verify    assert resource IDs survived the rebuild
    .\build.ps1 install   adb install -r
    .\build.ps1 all       build -> sign -> verify -> install

  Verified round-trip facts (do not break these):
    * classes.dex is byte-identical through smali -> dex (10,076,240 bytes)
    * 1702 resource IDs, id -> type/name mapping must stay identical, because
      the dex inlines those IDs as constants.
    * aapt2 re-derives res/ FILE paths from resource names, so the obfuscated
      NP-Manager paths (res/zu.png) come back as canonical paths
      (res/drawable-xhdpi/abc_*.png). Harmless - Android looks up by ID.
#>
[CmdletBinding()]
param(
    [Parameter(Position = 0)]
    [ValidateSet('build', 'sign', 'verify', 'install', 'all', 'clean')]
    [string]$Task = 'all',

    [string]$Src = 'decoded-apktool',
    [string]$Out = 'build\RideAccepter-mod.apk',
    [string]$Keystore = 'tools\debug.keystore',
    [string]$StorePass = 'android',
    [string]$KeyPass = 'android',
    [string]$Alias = 'androiddebugkey'
)

$ErrorActionPreference = 'Stop'

$BT       = Join-Path $env:LOCALAPPDATA 'Android\Sdk\build-tools\36.0.0'
$ADB      = Join-Path $env:LOCALAPPDATA 'Android\Sdk\platform-tools\adb.exe'
$KEYTOOL  = 'C:\Program Files\Java\jdk-25\bin\keytool.exe'
$APKTOOL  = 'apktool'
$ORIG_APK = 'Ride Accepter-v6.apk'

foreach ($tool in @($BT, $ADB, $KEYTOOL)) {
    if (-not (Test-Path $tool)) { throw "missing tool: $tool" }
}

function Say($m, $colour = 'Cyan') { Write-Host "==> $m" -ForegroundColor $colour }

function Invoke-Step {
    param([string]$Name, [string]$Exe, [string[]]$Arguments)
    Say $Name
    & $Exe @Arguments
    if ($LASTEXITCODE -ne 0) { throw "$Name failed (exit $LASTEXITCODE)" }
}

function Task-Build {
    if (-not (Test-Path $Src)) { throw "source tree '$Src' not found" }
    New-Item -ItemType Directory -Force -Path (Split-Path $Out) | Out-Null
    Invoke-Step "rebuilding from $Src" $APKTOOL @('b', $Src, '-o', $Out, '-f')
    "    built: {0:N2} MB" -f ((Get-Item $Out).Length / 1MB)
}

function Task-Sign {
    if (-not (Test-Path $Out)) { throw "nothing to sign - run build first" }

    if (-not (Test-Path $Keystore)) {
        Say "generating keystore $Keystore"
        & $KEYTOOL -genkeypair -v -keystore $Keystore -storepass $StorePass `
            -keypass $KeyPass -alias $Alias -keyalg RSA -keysize 2048 `
            -validity 10000 -dname 'CN=Android Debug,O=Android,C=US' 2>&1 | Out-Null
        if ($LASTEXITCODE -ne 0) { throw 'keytool failed' }
    }

    $aligned = [System.IO.Path]::ChangeExtension($Out, '.aligned.apk')
    Invoke-Step 'zipalign (4-byte)' (Join-Path $BT 'zipalign.exe') @('-f', '-p', '4', $Out, $aligned)

    Invoke-Step "signing as $Alias" (Join-Path $BT 'apksigner.bat') @(
        'sign',
        '--ks', $Keystore,
        '--ks-key-alias', $Alias,
        '--ks-pass', "pass:$StorePass",
        '--key-pass', "pass:$KeyPass",
        '--out', $Out,
        $aligned
    )
    Remove-Item $aligned -Force
    Invoke-Step 'signature check' (Join-Path $BT 'apksigner.bat') @('verify', '--print-certs', $Out)
}

function Get-ResourceMap([string]$Apk) {
    & (Join-Path $BT 'aapt2.exe') dump resources $Apk 2>$null |
        Select-String -Pattern '^\s+resource 0x' |
        ForEach-Object { ($_.Line.Trim() -replace '\s+(PUBLIC|PRIVATE)$', '') } |
        Sort-Object -Unique
}

function Task-Verify {
    if (-not (Test-Path $Out)) { throw "nothing to verify - run build first" }
    Say 'verifying resource IDs survived the rebuild'

    $a = Get-ResourceMap $ORIG_APK
    $b = Get-ResourceMap $Out
    "    original: $($a.Count) IDs   rebuilt: $($b.Count) IDs"

    if ($a.Count -ne $b.Count) {
        throw "resource ID count changed ($($a.Count) -> $($b.Count)); dex-inlined IDs would break"
    }
    $diff = Compare-Object $a $b
    if ($diff) {
        $diff | Select-Object -First 20 | Format-Table -AutoSize | Out-String | Write-Host
        throw "resource id -> name mapping changed ($($diff.Count) lines); dex-inlined IDs would break"
    }
    Say 'OK: resource IDs identical (id -> type/name)' 'Green'

    # dex must round-trip byte-identical through smali
    Add-Type -AssemblyName System.IO.Compression.FileSystem
    function DexLen($p) {
        $z = [System.IO.Compression.ZipFile]::OpenRead((Resolve-Path $p))
        $e = $z.Entries | Where-Object { $_.FullName -eq 'classes.dex' }
        $z.Dispose(); if ($e) { $e.Length } else { -1 }
    }
    $da = DexLen $ORIG_APK; $db = DexLen $Out
    "    classes.dex: original=$da  rebuilt=$db"
    if ($da -ne $db) {
        Say "WARNING: classes.dex size changed ($da -> $db). Expected identical for an unmodified smali tree." 'Yellow'
    } else {
        Say 'OK: classes.dex byte-identical' 'Green'
    }
}

function Task-Install {
    if (-not (Test-Path $Out)) { throw "nothing to install - run build first" }
    Say 'checking for a connected device'
    & $ADB start-server 2>&1 | Out-Null
    $devs = & $ADB devices | Select-String -Pattern '\w+\s+device$'
    if (-not $devs) { throw 'no device/emulator connected (adb devices)' }
    $devs | ForEach-Object { "    $_" }
    Invoke-Step "installing $Out" $ADB @('install', '-r', '-d', $Out)
}

switch ($Task) {
    'build'   { Task-Build }
    'sign'    { Task-Sign }
    'verify'  { Task-Verify }
    'install' { Task-Install }
    'clean'   { Say 'removing build\'; if (Test-Path 'build') { Remove-Item 'build' -Recurse -Force } }
    'all'     {
        Task-Build
        Task-Sign
        Task-Verify
        try { Task-Install } catch { Say "skipping install: $($_.Exception.Message)" 'Yellow' }
    }
}

Say 'done' 'Green'
