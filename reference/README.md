# reference/ — decompiled reference copies (read-only)

Full decompiles of the shipped v6 build, kept for reading while working on
`app/smali/`. Nothing here is built or shipped. All of it is **regenerable and safe
to delete** whenever you need the space.

| path | tool | contents |
|---|---|---|
| `orig-decode/` | apktool | pristine apktool decode (unpatched method bodies, useful when a `.orig` backup is missing) |
| `decoded-jadx/` | jadx | full decompiled Java source (~9,000 files) — primary reading reference |
| `jadx-all/` | jadx | second jadx pass over the full dex set (near-duplicate of `decoded-jadx/`) |
| `jadx-out/` | jadx | targeted jadx output for selected classes |
| `apk-raw/` | unzip | raw zip extraction: assets, `resources.arsc`, proto payloads |

Regenerate with the vendored jadx 1.5.6 (`tools/jadx`):

```bash
tools/jadx/bin/jadx -d reference/decoded-jadx 'app/original/Ride Accepter-v6.apk'
```
