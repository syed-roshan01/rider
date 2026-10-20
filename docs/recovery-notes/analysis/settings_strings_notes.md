# g5/b localization string table - recovery notes

Source: `decoded-apktool/smali/g5/b.smali` (class `Lg5/b;`, 11,357 lines). Result: `analysis/settings_strings.json`.

## Class layout

| member | meaning |
|---|---|
| `a: List<g5/a>` | 9 language descriptors. `g5/a` (toString `LanguageItem(code=.., name=.., nativeName=..)`) = (code, English name, native name). Created at `<clinit>` lines 25-167 in order **en, hi, ta, kn, te, ml, mr, bn, pa**. Runtime list order is scrambled by opaque `aput` index writes (`sget int-field ^ constant`) and was not recovered. |
| `b: Map<String, Map<String,String>>` | langCode -> (key -> text). Built in `<clinit>` as 9 `kotlin mapOf(...)` chunks (Pair arrays `Lq8/f;` via `to`), each closed by `const-string vX, "<code>"` + `mapOf` + `code to map` (e.g. line 2179 `"en"`). Chunk order: **en, hi, bn, ta, kn, te, ml, mr, pa**. Entry counts: en=111 (complete), hi=104, bn=103, ta/kn/te/ml/mr/pa=61. |
| `short: short[17]` | NOT table data. 3 XOR-encoded runtime strings only: `"context"` (offset 0, len 7, xor 0x8a3), `"langCode"` (offset 7, len 8, xor 0xa51), `"en"` (offset 15, len 2, xor 0x9f5). Decode = `chars[i] = (shorts[offset+i] ^ xorKey) as char`, args `(shorts, offset, length, xorKey)` (helpers `([SIII)Ljava/lang/String;`). |

All 111 keys and all 995 texts are **plain data in `<clinit>`**: `const-string` literals (879) plus 173 strings served by the obfuscator's per-string accessor methods (`static ...()Ljava/lang/String;` returning a `const-string` behind junk control flow), already decoded in `analysis/accessor_strings.json`. No runtime decryption is needed to recover the table.

## Lookup semantics - `b(String key, String langCode)`

1. `checkNotNullParameter(langCode, "langCode")` (2nd arg is the lang code, 1st is the key).
2. `langMap = b.get(langCode)`.
3. If `langMap == null` -> `langMap = b.get("en")` (unknown lang falls back to the whole English map; `"en"` is decrypted from `short[15..16]`).
4. `text = langMap.get(key)`; if `null` -> `text = b.get("en").get(key)` (missing translation falls back to the English text).
5. If still `null` -> **return the key itself**. The method never returns null.

## Locale switch - `a(Context, String langCode)`

`checkNotNullParameter(context, "context")`, then inside try/catch(Exception, ignored):
`locale = new Locale(langCode); Locale.setDefault(locale); cfg = new Configuration(context.getResources().getConfiguration()); cfg.setLocale(locale); context.getResources().updateConfiguration(cfg, context.getResources().getDisplayMetrics()); context.createConfigurationContext(cfg)` (result only null-checked).

## Validation performed

- 693 `to(...)` pair constructions = 684 inner + 9 outer (`langCode to map`); each pair lands in exactly one map.
- All 111 keys distinct, snake_case; every key present in any language exists in `en`.
- Spot-checked pairs against raw smali lines (e.g. `driving_language_notice`, `dev_options_disabled_toast`).
- Requested keys not present in the table: `accessibility_enabled`, `service_enabled`, `ride_alert_enabled` (they look like preference IDs, not display strings).

## Coverage pattern

61 "core" keys are translated into all 9 languages; 43 more are additionally translated into Hindi and 42 into Bengali; 7 keys (`email`, `expires`, `how_to_use`, `name`, `plan`, `status`, `shizuku_notice`) are English-only and `profile` is en+hi only. At runtime the missing ones render in English via the fallback.
