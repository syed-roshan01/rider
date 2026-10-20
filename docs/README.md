# Docs

- [`DEPLOYMENT.md`](DEPLOYMENT.md) — deploying and operating the licence admin
  dashboard (Vercel + Supabase): env vars, security notes, rollout steps.
- [`screenshots/`](screenshots/) — UI screenshots (referenced by the patch log).
- [`recovery-notes/`](recovery-notes/) — internal notes from reconstructing the app
  core after the source archive was lost (Oct 2026). Kept for reference:
  - `DECODE_REPORT.md` — full component/literal report of the shipped build.
  - `WORKFLOW.md` — end-to-end behavioural analysis.
  - `PATCHES.md` — the complete patch log. **Read before editing `app/smali/`.**
  - `analysis/` — deobfuscation outputs (control flow, decrypted constants, literals,
    smali backups).
