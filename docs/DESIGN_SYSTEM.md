# AcceptPro — Design System v2

Codified from the approved UI mockups (dark + light, 5 screen sheets + 2 component sheets).
Single source of truth in code: `app/java/com/ride/accepter/ui/Ui.java`. Every hex/size below
lives there as a token — screens never hardcode values.

Principles (non-negotiable): **flat, sharp, crisp** — no gradients, no soft shadows, hairline
1dp borders, integer sp sizes, 8dp spacing grid, one blue accent, sentence-case labels,
semantic colors only where semantic. Reusable components over per-screen code.

---

## 1. Color tokens

### Dark (default) — true-black canvas, flat charcoal surfaces
| Token | Hex | Use |
|---|---|---|
| `bg` | `#000000` | screen background |
| `surface` | `#0E0F13` | cards (hero, stats, rows) |
| `surfaceHigh` | `#171920` | input fields, nested wells, pressed states |
| `border` | `#26282F` | 1dp hairlines on cards/fields/chips |
| `ink` | `#FFFFFF` | titles, numbers |
| `inkSoft` | `#9AA0AB` | supporting text, subtitles |
| `inkFaint` | `#6A7078` | labels, captions, inactive nav |
| `primary` | `#2563EB` | buttons, active switch, links, selected chips/nav |
| `onPrimary` | `#FFFFFF` | text/icons on primary |
| `primaryTint` | `#10233F` | selected chip/nav pill fills |
| `success` | `#22C55E` | Accepted chip, connected check |
| `successTint` | `#0F2A1C` | Accepted chip fill |
| `error` | `#EF4444` | Skipped chip, error banner |
| `errorTint` | `#2C1416` | Skipped chip fill, error banner fill |
| `warning` | `#F59E0B` | warning banner, "not granted" dots |
| `warningTint` | `#2B2110` | warning banner fill |
| `switchOff` | `#33363E` | switch track when off |
| `switchKnob` | `#E6E8EC` | switch knob |

### Light — white surfaces on cool page gray
| Token | Hex | Use |
|---|---|---|
| `bg` | `#F5F6F8` | screen background |
| `surface` | `#FFFFFF` | cards |
| `surfaceHigh` | `#F0F2F5` | input fields, wells |
| `border` | `#E3E6EB` | 1dp hairlines |
| `ink` | `#0C0D10` | titles, numbers |
| `inkSoft` | `#5F6673` | supporting text |
| `inkFaint` | `#8A919C` | labels, captions, inactive nav |
| `primary` | `#2563EB` | same accent both modes |
| `onPrimary` | `#FFFFFF` | text on primary |
| `primaryTint` | `#E9F0FE` | selected chip/nav pill fills |
| `success` | `#16A34A` | (darkened for AA contrast on white) |
| `successTint` | `#E7F8EE` | chip/banner fill |
| `error` | `#DC2626` | |
| `errorTint` | `#FDECEC` | |
| `warning` | `#B45309` | |
| `warningTint` | `#FEF3E2` | |
| `switchOff` | `#D7DBE0` | |
| `switchKnob` | `#FFFFFF` | |

Rules: accent blue is identical in both modes. Semantic colors get darker light-mode variants
to hold ≥4.5:1 body contrast. Never use `primary` for large fills except primary buttons and
the hero power circle. No third accent color, ever.

## 2. Typography (sans-serif/Roboto; Inter if the font is added later)

**Integer sp only** — no 10.5/11.5 sizes (crisp rendering). Two weights: Regular 400, Medium 500.
Sentence case everywhere. No letter-spacing.

| Style | Size/Weight | Use |
|---|---|---|
| `display` | 24 Medium | stat numbers (24, 6, 80%, ₹840) |
| `h1` | 20 Medium | hero status ("Service is running"), wordmark |
| `h2` | 16 Medium | section headers ("Recent activity"), dialog titles |
| `row` | 15 Medium | row/list titles |
| `btn` | 15 Medium | button labels |
| `body` | 13 Regular | supporting text, row subtitles |
| `label` | 12 Medium | field labels, chips, statuses |
| `caption` | 11 Regular | nav labels, timestamps, fine print |

Wordmark: "Accept" in `ink` + "Pro" in `primary`, one text run (two spans).

## 3. Grid, spacing, shape

- Spacing scale: **4 / 8 / 12 / 16 / 20 / 24 / 32** (8dp grid + half steps)
- Screen margins: 16dp · card padding: 16dp · section gap: 20dp · row gap: 8dp
- Radii: cards **14dp** · fields/buttons **12dp** · icon tiles **12dp** · chips **999dp** ·
  bottom-sheet/dialog top **20dp**
- Borders: **1dp `border`** hairlines. No drop shadows in dark; at most a 1dp border in light.
- Touch targets: ≥48dp everywhere (rows are 60–64dp tall and fully tappable).
- Icons: 24dp glyphs in 40dp icon tiles (`surfaceHigh` fill + `border` hairline) or bare.

## 4. Components (measurements + states)

| Component | Spec |
|---|---|
| **Top bar** | 56dp: logo mark + wordmark left; bell + gear 24dp icon buttons right (gear → Settings). Flat `bg`, bottom hairline optional. |
| **Hero card** | `surface` + hairline, r14, p16–20. 44dp `primary` circle w/ white power icon; `h1` status; `body` `inkSoft` sub; status chip top-right (dot + `label`). |
| **Stat tiles** | 2×2 grid, gap 8–12dp. `surface` + hairline r14, p16. Number `display` `ink`, label `body` `inkSoft`. No icons, no accents. |
| **Toggle row** | 64dp: icon tile (40dp) + title `row` + sub `body` `inkSoft` + switch. Whole row tappable. |
| **Action row** | 64dp: icon tile + title + sub + trailing = text button (Grant/Fix/Pair), chevron, or success check. |
| **App row** | 60dp: brand logo tile (40dp, brand colors) + name `row` + switch. |
| **Activity row** | 64dp: brand tile + `row` title (app) + `body` "₹120 · 4.8 km" + `caption` "2 min ago" + outcome chip. |
| **Input field** | 48–52dp, `surfaceHigh` + hairline r12, p14h. `label` above field. Mono for codes/keys. Trailing 20dp copy icon (inside field). |
| **Search field** | same + leading search icon, `body` hint. |
| **Primary button** | 52dp, `primary` fill r12, `btn` `onPrimary`. Disabled: `switchOff` fill, `inkFaint` text. |
| **Secondary button** | 40–48dp, transparent + 1dp `border` r12, `btn` `ink` (or `primary` for Grant/Fix/Pair). |
| **Chip** | 32dp h, r999, p12h, `label`. Selected: `primary` fill + `onPrimary`. Unselected: transparent + hairline + `inkSoft`. Status chip: dot 6dp + text, `successTint`/`errorTint`/`primaryTint` fills. |
| **Range slider** | track 4dp `border`, filled `primary`, thumb 20dp `surface` + 2dp `primary` ring. Dual-thumb for min/max with paired Min/Max fields. |
| **Switch** | 52×32dp visual, knob 24dp slide 180ms. ON: `primary` track + `switchKnob`. OFF: `switchOff` track. |
| **Bottom nav** | 64dp `surface`, top hairline. 5 items: 24dp icon + `caption` label. Active: `primary` icon/label on `primaryTint` pill (r999). Inactive: `inkFaint`. |
| **Dialog / sheet** | `surface`, r20, p20. Title `h2` + close icon. List rows w/ radio (selected: `primary`). Footer: `Cancel` (text btn) + `Save`/`Apply` (primary 40dp). |
| **Banner** (success/error/info/warning) | r12, p12–14: semantic tint fill + matching icon + `body` text in semantic color. |
| **Empty state** | centered outline icon 40dp `inkFaint` + `h2` + `body` `inkSoft`. |
| **Floating overlay** | pill `surface` + hairline + elevation: power icon + "Engine ON/OFF" `label`. |
| **Quick-setup header** | "Quick setup (4/6)" `h2` + 4dp progress bar (r999): `primary` fill on `border` track. |

## 5. Screen compositions

1. **Activation** — brand block (mark 64dp + wordmark + tagline "Auto-accept for gig drivers"),
   "Your device id" field + Copy, helper "Send this ID to your seller to get your licence key",
   "Enter licence key" field, full-width **Activate**, "How to get a key?" text link,
   trust list (shield/lock/check icon tiles: "Secure & device bound", "One device per key",
   "Direct from authorised seller"), footer "Need help? **Contact support**".
2. **Home** — top bar → hero → toggle rows (Auto-accept engine, Detect-only mode) → stat
   tiles 2×2 → "Recent activity" + "See all" link → activity rows (max 4) → bottom nav.
3. **Filters** — top bar + **Reset** link → "Enable filters" toggle → Fare range (₹)
   (Min/Max fields + dual slider) → Pickup distance (km) → Drop distance (km) →
   Go-To areas (map thumb cards + chevrons) → Avoid areas.
4. **Apps** — title + "Select which apps to monitor" → 12 app rows (brand tiles + toggles).
5. **History** — title + Reset → filter chips (All/Accepted/Skipped) → date group header
   ("Today · 12 Mar 2025" + "24 Accepted · 6 Skipped · ₹840 Earnings") → activity rows →
   empty state when quiet.
6. **Settings** — "Quick setup (4/6)" + progress → 4 action rows (Accessibility service,
   Draw over other apps, Battery optimization, Shizuku (optional)) → Language row (chevron,
   value "English") → Theme row (Dark toggle per mock) → feature toggle rows (Alert on accept,
   Ola accept timers remove, Hide developer options, Keep driving app in English).
7. **Map picker** — back + "Select area" → search field → map + pin + radius circle +
   area chips (Home/Work/Airport/Other + saved zones) → sheet card: zone name + sub,
   Radius slider (3 km), Match words field, full-width **Use this point**.

## 6. Motion (subtle, cheap)

Switch knob 180ms ease-out · page cross-fade 150ms · press ripple (system) · banner slide-in
200ms. Animate only opacity/transform. No parallax, no shimmer, no Lottie.

## 7. Anti-AI checklist (review every screen against this)

No gradients · no identical-card walls (hero > stats > rows have distinct weights) · no
ALL-CAPS/tracking · no rainbow rails (icon tiles carry color, max 1 tile hue per row) · no
emoji icons · no centered walls of text (except brand block) · real data (₹, km, counts,
timestamps) in every mock · sentence case · integer type sizes · hairlines not shadows.

## 8. Brand assets

Logo mark: blue speedmark chevrons (per mock). `res/drawable/logo` currently holds the old
neon art — drop the new mark at `app/design/` + `res/drawable/logo` when the asset is ready
(adaptive icon foreground references `@drawable/logo`, so launcher updates automatically).
Brand app tiles for the Apps/History rows come from `app/design/brandlogos/` → trimmed into
40dp rounded tiles.
