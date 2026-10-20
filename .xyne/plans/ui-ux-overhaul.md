# AcceptPro UI/UX overhaul + performance plan

Status: PROPOSED (2026-10-20). Scope: `app/java/com/ride/accepter/ui/DashboardActivity.java`
(2,224 lines, all tabs), `app/java/com/ride/accepter/activation/ActivationActivity.java`.
No smali/engine changes. No new dependencies (plain Android Views).

## 1. Why the UI reads as "AI-generated" (audit)

| # | Tell | Where (real code) |
|---|---|---|
| 1 | Ad-hoc type scale — 26/24/19/17/15/14/13/12/11/10.5sp sprinkled per call site | `text()`/`label()` call sites across all tabs |
| 2 | ALL-CAPS micro-labels + tracking | dashboard "DARK"/"LIGHT" pill; buttons "EDIT", "CHANGE", "TELEGRAM", "WHATSAPP", "WEBSITE", "GET ON PLAY STORE", "GITHUB RELEASES" |
| 3 | Rainbow accent rails on every row (GREEN/CYAN/BLUE/PURPLE/AMBER/RED) | `switchRow/toggleRow/editRow/actionRow/langPickRow` |
| 4 | Every card identical (same gradient, radius, padding) — zero hierarchy | `gradientCard()` used everywhere |
| 5 | No touch feedback anywhere (no ripple/press state) — biggest "not native" factor | all rows/buttons |
| 6 | No motion at all (tab switch is an instant rebuild) | `show()` |
| 7 | Template copy: "neon speed auto-accept", "Today's earn", "Safe test mode - ..." | hero + tiles |
| 8 | Outlined text pills used for primary AND tertiary actions alike | `smallButton()` |
| 9 | Text-only bottom nav, no icons | `buildNav()` |
| 10 | Uniform 2x2 stat tiles | `buildDashboard()` tiles |

Distinctive and worth KEEPING: the neon brand plate + logo identity (a unique seed color is
the #1 anti-template move per research), the custom toggle, the dark-first palette.

## 2. Design system (Material 3-mapped tokens, in-code constants)

- **Type** (Roboto, one scale — replaces all ad-hoc sizes):
  `DISPLAY 32/Medium` hero stat · `HEADLINE 24/Medium` hero status · `TITLE 16/Medium` row+section
  · `BODY 14/Regular` supporting · `LABEL 12/Medium` eyebrows (sentence case, tracking 0).
- **Spacing**: 4/8/12/16/20/24/32 (8dp grid + half-steps). Page margins 16dp (keep), card
  padding 16dp (normalize from 14–20), section gap 24dp (normalize from 14–20).
- **Color roles** (keep neon identity, restrict gradient to hero + primary CTA):
  `bg0/bg1` tonal dark surfaces (M3: surface tone 10, containers tone 16/22 — tonal elevation,
  not pure black) · `onSurface` tone 90 · `onSurfaceVariant` tone 80 · `outlineVariant` tone 30
  (hairlines AND row rails — kills the rainbow) · `primary` NEON `#03FFB1` · semantic
  success/warning/error only where semantic (status, switches).
- **Shape**: card 16dp · button 12dp · chip 999dp · hairline 1dp `outlineVariant`.
- **Motion**: page cross-fade 150ms · switch knob slide 180ms (`ValueAnimator`) ·
  `RippleDrawable` press states on every interactive row/button (API 21+; min is 26).

## 3. Component kit (built once in DashboardActivity helpers — all tabs inherit)

1. **text/label() → typed scale** (the 5 sizes above). Biggest single win: hierarchy via scale,
   not bold-everything.
2. **Buttons by role**: `primaryButton` (filled NEON, 48dp+, ink=dark) for ACTIVATE/CTA,
   `tonalButton` (soft fill) for secondary, `textButton` for tertiary. Retires outlined pills.
3. **listRow(title, sub, trailing)** — one row family (56–64dp, neutral rail or none, ripple,
   title TITLE / sub BODY) for Settings/Filters/Permissions/History.
4. **ToggleSwitch v2** — 52x30dp visual, animated knob, semantic accent, 48dp touch (row click).
5. **heroCard v2** — keep brand plate; wordmark 20sp + tagline 12sp; status = **status chip**
   (8dp dot + label) + HEADLINE status line + BODY sub.
6. **Asymmetric stat grid** (research pattern): 1 wide hero tile ("Accepted today", number
   DISPLAY) + 3 compact tiles (number 20sp, label LABEL) instead of 2x2 uniform.
7. **navBar v2** — 5 items with 24dp programmatically-drawn icons (Canvas paths, no asset
   pipeline) + 11sp labels + active pill (existing `NAV_SEL_BG` refined).
8. **statusChip** — reused in hero + licence card ("Active until ...").
9. **emptyState** for History (icon + headline + body) and empty filters.
10. **dialogCard/styledDialog** — radius 20→16, padding to tokens (picker/number dialogs inherit).

## 4. Screen-by-screen

- **Home**: hero (chip+headline+sub) → asymmetric stats → Controls (listRow+toggle) →
  Permissions (card of rows w/ per-row action) → Recent activity (row = time + outcome chip).
- **Filters**: section cards with headers; editRows to kit; Zones map card unchanged (already
  good; WebView now reused).
- **Apps**: group headers "Rider apps" / "Delivery apps"; appRow = logo + name + toggle.
- **History**: filter chips (All/Accepted/Skipped) + rows + emptyState.
- **Settings**: M3 grouped list (structure exists) + kit rows + quick-setup card rhythm fix;
  licence card already truthful — add statusChip.
- **Activation**: centered brand column, device-id as a single-line chip row (done), primary
  CTA full-width 50dp, help text BODY, spacing rhythm to tokens.

Copy polish pass: "Today's earnings", replace template-y taglines, em-dashes not " - ".

## 5. Performance plan

Done already (this session): WebView reuse in Zones (no Chromium re-boot per Filters build);
resume refreshes only permission rows (no full Home rebuild).

This phase:
1. **Reflection method cache** — `callAny/read/uiText` call `getMethod` per invocation; the
   Settings tab fires dozens per build. Cache `HashMap<String,Method>`. (Expect: visibly
   snappier Settings/Filters tab builds.)
2. **Tab view cache** — `SparseArray<View>`; build each tab once, swap on nav; `refresh()`
   already repaints live fields (stats/toggles), so cached views stay truthful. (Expect: tab
   switch from ~rebuild-everything to a view swap.)
3. **Page cross-fade** 150ms on `show()` (perceived speed; research: animate only cheap props).
4. Constant-drawable cache for static `round()/gradient()` fills (minor allocation cut).
5. Keep `fullVerify` off the frame path (already cached 30s for the engine gate).

Not in scope: engine/smali hot path (untouchable safely), Compose rewrite, WebView UI rewrite.

## 6. Ordered rollout (each phase independently buildable)

1. **Tokens + component kit** — `DashboardActivity` palette block + `text/label/smallButton/
   bigButton/switchRow/toggleRow/editRow/actionRow/tile/gradientCard/head/title` rewrites;
   `ActivationActivity` to the same tokens.
2. **Home recomposition** (hero v2, asymmetric stats, activity rows).
3. **Settings/Filters/Apps/History + dialogs** to the kit (+ empty states).
4. **Motion + perf** (method cache, tab cache, fades).
5. **QA pass** — screenshots per tab (compare with `docs/screenshots/` baselines), copy polish.

## 7. Risks & verification

- Visual work is blind from this Mac (no Android build toolchain) → conservative, component-level
  changes; verify via `.\app\build.ps1 all` (its guards: 1702 resource IDs + dex round-trip) and
  on-device screenshots. Optional: install apktool + build-tools here so I can self-verify.
- Tab caching can show stale rows → every state change routes through existing `paint()`/
  `refresh()`; add invalidation on resume (partial rebuild already in place).
- Touch/motion changes are API-26-safe (RippleDrawable/ValueAnimator).

## 8. References (from this session's research)

M3 typography/roles/motion: https://m3.material.io/styles/typography ·
https://m3.material.io/styles/color/roles · https://m3.material.io/styles/motion/easing-and-duration
Touch targets 48dp: https://support.google.com/accessibility/android/answer/7101858
Settings rows: https://developer.android.com/develop/ui/views/components/settings
Nav/toolbars: https://m3.material.io/components/toolbars/guidelines
Anti-"AI look": https://dev.to/alanwest/how-to-fix-the-ai-generated-look-in-your-frontend-1ahh
WebView perf: https://developer.android.com/develop/ui/views/layout/webapps/optimize-webview-startup ·
https://web.dev/articles/speed-rendering
