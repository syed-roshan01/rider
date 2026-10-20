package com.ride.accepter.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.InputType;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * AcceptPro — friendly control surface.
 *
 * Dashboard  status, telemetry, permissions, engine + detect controls, activity
 * Filters    editable fare / distance / location rules
 * Apps       per-app scan toggles
 * History    accepted / skipped ride log
 * Settings   quick setup, language, feature toggles, Shizuku, community
 */
public class DashboardActivity extends Activity {

    private static final String ENGINE = "com.auto.accept.service.RideAcceptorService";
    private static final String MY_A11Y = "com.ride.accepter/com.auto.accept.service.RideAcceptorService";
    private static final String SHIZUKU_PKG = "moe.shizuku.privileged.api";
    // The Shizuku API is renamed by the obfuscator in this build:
    //   moe.shizuku.privileged.api.Shizuku -> rikka.shizuku.۟ۤۦ۟ۦ
    //   checkSelfPermission()I             -> ۤۤۥۣ()I   (rikka/shizuku/۟ۤۦ۟ۦ.smali:240)
    private static final String SHIZUKU_API_CLASS = "rikka.shizuku.۟ۤۦ۟ۦ";
    private static final String SHIZUKU_CHECK_PERM = "ۤۤۥۣ";
    private static final String URL_SITE = "https://rider-theta.vercel.app/";
    private static final String URL_TG   = "https://t.me/rideaccepter";
    private static final String URL_WA   = "https://whatsapp.com/channel/0029VbDa51y7j6gA9aiXbK0n";
    private static final String URL_SHIZUKU_PLAY = "https://play.google.com/store/apps/details?id=moe.shizuku.privileged.api";
    private static final String URL_SHIZUKU_GIT  = "https://github.com/RikkaApps/Shizuku/releases";

    // Brand plate + accent — theme-aware design tokens (docs/DESIGN_SYSTEM.md).
    private int NEON, NEON2, PLATE_A, PLATE_B, PLATE_INK, PLATE_SUB, PLATE_CHIP, PLATE_EDGE;
    private Ui ui;

    // Palette — two themes: the logo's neon dark (default) and a clean light.
    // Instance fields so the theme can swap at runtime (see applyTheme).
    private int BG0, BG1, CARD, CARD_EDGE, INK, INK_SOFT, INK_FAINT;
    private int GREEN, CYAN, BLUE, PURPLE, AMBER, RED;
    private int WARN_A, WARN_B, QUICK_A, QUICK_B;
    private int INPUT_BG, BTN_SOFT, SEL_BG, SEL_INK, ROW_BG, NAV_SEL_BG;
    private int SW_OFF, SW_KNOB;
    private boolean dark;
    private View rootBg, navBg;

    private LinearLayout body;
    private final TextView[] navItems = new TextView[5];
    private int current = 0;

    private ToggleSwitch engineSw, detectSw;
    private TextView heroStatus, heroSub;
    private TextView statAccepted, statSkipped, statRate, statEarnings;
    private LinearLayout permBox;
    private boolean engineOn, detectOn = true;
    private SharedPreferences prefs;

    @Override protected void onCreate(Bundle b) {
        super.onCreate(b);
        // Licence gate: the dashboard is reachable only with a verified,
        // machine-bound, unexpired grant (server-validated). Anything else -
        // forged prefs, a token copied from another phone, a revoked or
        // expired licence - goes back to the login/activation screen.
        com.ride.accepter.licence.LicenceGate.Result lic =
                com.ride.accepter.licence.LicenceGate.fullVerify(this, System.currentTimeMillis());
        if (!lic.ok) {
            android.util.Log.i("AcceptPro-Licence", "dashboard blocked: " + lic.reason);
            com.ride.accepter.licence.LicenceGate.stopEngine(this);
            startActivity(new android.content.Intent(this,
                    com.ride.accepter.activation.ActivationActivity.class)
                    .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK));
            finish();
            return;
        }
        prefs = getSharedPreferences("ra_state", MODE_PRIVATE);
        applyTheme();
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        rootBg = root;
        root.setBackground(gradient(BG0, BG1, true, 0));
        body = new LinearLayout(this);
        body.setOrientation(LinearLayout.VERTICAL);
        root.addView(body, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f));
        navBg = buildNav();
        root.addView(navBg);
        setContentView(root);
        tintChrome();
        show(0);
    }

    // ----------------------------------------------------------------- theme

    /** Loads the saved mode and swaps every palette token.
     *  Values are the design-system tokens (docs/DESIGN_SYSTEM.md). */
    private void applyTheme() {
        dark = prefs.getBoolean("ui_dark", true);
        ui = new Ui(this, dark);
        NEON = 0xFF2563EB; NEON2 = 0xFF2563EB;
        if (dark) {
            BG0 = 0xFF000000; BG1 = 0xFF000000;
            CARD = 0xFF0E0F13; CARD_EDGE = 0xFF26282F;
            INK = 0xFFFFFFFF; INK_SOFT = 0xFF9AA0AB; INK_FAINT = 0xFF6A7078;
            GREEN = 0xFF22C55E; CYAN = 0xFF2563EB; BLUE = 0xFF2563EB;
            PURPLE = 0xFF2563EB; AMBER = 0xFFF59E0B; RED = 0xFFEF4444;
            SW_OFF = 0xFF33363E; SW_KNOB = 0xFFE6E8EC;
            WARN_A = 0xFF2B2110; WARN_B = 0xFF2B2110;
            QUICK_A = 0xFF10233F; QUICK_B = 0xFF10233F;
            INPUT_BG = 0xFF171920; BTN_SOFT = 0xFF171920;
            SEL_BG = 0xFF10233F; SEL_INK = 0xFF2563EB; ROW_BG = 0xFF171920;
            NAV_SEL_BG = 0xFF10233F;
            PLATE_A = 0xFF0E0F13; PLATE_B = 0xFF0E0F13;
            PLATE_INK = 0xFFFFFFFF; PLATE_SUB = 0xFF9AA0AB;
            PLATE_CHIP = 0xFF171920; PLATE_EDGE = 0xFF26282F;
        } else {
            BG0 = 0xFFF5F6F8; BG1 = 0xFFF5F6F8;
            CARD = 0xFFFFFFFF; CARD_EDGE = 0xFFE3E6EB;
            INK = 0xFF0C0D10; INK_SOFT = 0xFF5F6673; INK_FAINT = 0xFF8A919C;
            GREEN = 0xFF16A34A; CYAN = 0xFF2563EB; BLUE = 0xFF2563EB;
            PURPLE = 0xFF2563EB; AMBER = 0xFFB45309; RED = 0xFFDC2626;
            SW_OFF = 0xFFD7DBE0; SW_KNOB = 0xFFFFFFFF;
            WARN_A = 0xFFFEF3E2; WARN_B = 0xFFFEF3E2;
            QUICK_A = 0xFFE9F0FE; QUICK_B = 0xFFE9F0FE;
            INPUT_BG = 0xFFF0F2F5; BTN_SOFT = 0xFFF0F2F5;
            SEL_BG = 0xFFE9F0FE; SEL_INK = 0xFF2563EB; ROW_BG = 0xFFF0F2F5;
            NAV_SEL_BG = 0xFFE9F0FE;
            PLATE_A = 0xFFFFFFFF; PLATE_B = 0xFFFFFFFF;
            PLATE_INK = 0xFF0C0D10; PLATE_SUB = 0xFF5F6673;
            PLATE_CHIP = 0xFFF0F2F5; PLATE_EDGE = 0xFFE3E6EB;
        }
    }

    /** Persist a theme choice and repaint everything live. */
    private void setTheme(boolean goDark) {
        prefs.edit().putBoolean("ui_dark", goDark).commit(); // sync: survives force-stop
        applyTheme();
        tintChrome();
        show(current);
    }

    /** Re-tints the chrome that lives outside the rebuilt page body. */
    private void tintChrome() {
        if (rootBg != null) rootBg.setBackground(gradient(BG0, BG1, true, 0));
        if (navBg != null) navBg.setBackground(gradient(CARD, CARD, true, 0));
        Window w = getWindow();
        w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        w.setStatusBarColor(BG0);
        w.setNavigationBarColor(CARD);
        if (Build.VERSION.SDK_INT >= 23) {
            View d = w.getDecorView();
            int f = d.getSystemUiVisibility();
            d.setSystemUiVisibility(dark ? (f & ~View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR)
                    : (f | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR));
        }
    }

    @Override protected void onResume() {
        super.onResume();
        // Re-validate on EVERY entry, not just creation: a launcher tap on an
        // existing task delivers onNewIntent and never re-runs onCreate, which
        // is exactly how a revoked licence would otherwise stay usable. The
        // server is authoritative - a refusal clears the grant and stops the
        // engine (rolling token on success).
        com.ride.accepter.licence.LicenceGate.Result lic =
                com.ride.accepter.licence.LicenceGate.fullVerify(this, System.currentTimeMillis());
        if (!lic.ok) {
            android.util.Log.i("AcceptPro-Licence", "dashboard blocked: " + lic.reason);
            com.ride.accepter.licence.LicenceGate.stopEngine(this);
            startActivity(new android.content.Intent(this,
                    com.ride.accepter.activation.ActivationActivity.class)
                    .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK));
            finish();
            return;
        }
        com.ride.accepter.licence.LicenceGate.maybeRefreshAsync(this,
                new com.ride.accepter.licence.LicenceGate.RefreshCb() {
                    @Override public void onRefresh(String outcome, String detail) {
                        if ("OK".equals(outcome) || "SKIP".equals(outcome) || "OFFLINE".equals(outcome)) {
                            return;
                        }
                        runOnUiThread(new Runnable() {
                            @Override public void run() {
                                android.widget.Toast.makeText(DashboardActivity.this,
                                        "Licence check failed: " + outcome,
                                        android.widget.Toast.LENGTH_LONG).show();
                                startActivity(new android.content.Intent(DashboardActivity.this,
                                        com.ride.accepter.activation.ActivationActivity.class)
                                        .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK));
                                finish();
                            }
                        });
                    }
                });
        // log the engine's licence gate verdict (AcceptPro-Test: lic)
        callAny("probeLicenceGate", new Class<?>[] {});
        if (permBox != null && current == 0) {
            // refresh only the permission rows - rebuilding the whole tab on
            // every resume resets scroll position and re-inflates for nothing
            permBox.removeAllViews();
            buildPermissions(permBox);
        }
        refresh();
    }

    // ------------------------------------------------------------------ nav

    private View buildNav() {
        LinearLayout nav = new LinearLayout(this);
        nav.setOrientation(LinearLayout.HORIZONTAL);
        nav.setBackground(gradient(CARD, CARD, true, 0));
        nav.setPadding(dp(4), dp(8), dp(4), dp(10));
        String[] labels = { "Home", "Filters", "Apps", "History", "Settings" };
        for (int i = 0; i < labels.length; i++) {
            final int idx = i;
            TextView t = new TextView(this);
            t.setText(labels[i]);
            t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 11f);
            t.setTypeface(Typeface.create("sans-serif-medium", Typeface.BOLD));
            t.setGravity(Gravity.CENTER);
            t.setPadding(0, dp(10), 0, dp(10));
            t.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) { show(idx); }
            });
            navItems[i] = t;
            nav.addView(t, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        }
        return nav;
    }

    private void show(int idx) {
        current = idx;
        for (int i = 0; i < navItems.length; i++) {
            boolean sel = i == idx;
            navItems[i].setTextColor(sel ? BLUE : INK_FAINT);
            navItems[i].setBackground(sel ? round(NAV_SEL_BG, dp(10)) : null);
        }
        body.removeAllViews();
        ScrollView scroll = new ScrollView(this);
        scroll.setFillViewport(true);
        scroll.setVerticalScrollBarEnabled(false);
        LinearLayout page = new LinearLayout(this);
        page.setOrientation(LinearLayout.VERTICAL);
        page.setPadding(dp(16), dp(20), dp(16), dp(24));
        scroll.addView(page, new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        body.addView(scroll, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        switch (idx) {
            case 0: buildDashboard(page); break;
            case 1: buildFilters(page); break;
            case 2: buildApps(page); break;
            case 3: buildHistory(page); break;
            case 4: buildSettings(page); break;
        }
        refresh();
    }

    // ------------------------------------------------------------- dashboard

    private void buildDashboard(LinearLayout p) {
        // --- top bar (design): brand left, bell + gear icon buttons right -----
        LinearLayout bar = row();
        bar.setGravity(Gravity.CENTER_VERTICAL);
        LinearLayout brand = row();
        brand.setGravity(Gravity.CENTER_VERTICAL);
        int logoId = getResources().getIdentifier("logo", "drawable", getPackageName());
        if (logoId != 0) {
            android.widget.ImageView logo = new android.widget.ImageView(this);
            logo.setImageResource(logoId);
            brand.addView(logo, new LinearLayout.LayoutParams(dp(28), dp(28)));
        }
        brand.addView(hspacer(dp(10)));
        LinearLayout wm = row();
        wm.setGravity(Gravity.CENTER_VERTICAL);
        wm.addView(text("Accept", 19f, PLATE_INK, Typeface.BOLD, 0f));
        wm.addView(text("Pro", 19f, NEON, Typeface.BOLD, 0f));
        brand.addView(wm);
        bar.addView(brand, new LinearLayout.LayoutParams(0,
                ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        bar.addView(ui.iconButton("bell", PLATE_INK, new View.OnClickListener() {
            @Override public void onClick(View v) { show(3); }
        }));
        bar.addView(hspacer(dp(2)));
        bar.addView(ui.iconButton("gear", PLATE_INK, new View.OnClickListener() {
            @Override public void onClick(View v) { show(4); }
        }));
        p.addView(bar, matchWrap());
        p.addView(spacer(dp(14)));

        // --- hero card (design): circular status glyph + title + subtitle -----
        LinearLayout hero = row();
        hero.setPadding(dp(16), dp(16), dp(16), dp(16));
        hero.setGravity(Gravity.CENTER_VERTICAL);
        GradientDrawable plate = gradient(CARD, CARD, true, dp(14));
        plate.setStroke(dp(1), CARD_EDGE);
        hero.setBackground(plate);
        LinearLayout glyph = row();
        glyph.setGravity(Gravity.CENTER);
        glyph.setBackground(round(NEON, dp(24)));
        glyph.addView(ui.icon("power", ui.onPrimary, 22));
        hero.addView(glyph, new LinearLayout.LayoutParams(dp(48), dp(48)));
        hero.addView(hspacer(dp(14)));
        LinearLayout htxt = column();
        heroStatus = text("Service is stopped", 18f, PLATE_INK, Typeface.BOLD, 0f);
        htxt.addView(heroStatus);
        htxt.addView(spacer(dp(3)));
        heroSub = text("Turn on the engine to start watching for rides.", 12f, PLATE_SUB,
                Typeface.NORMAL, 0f);
        htxt.addView(heroSub);
        hero.addView(htxt, new LinearLayout.LayoutParams(0,
                ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        p.addView(hero, matchWrap());
        p.addView(spacer(dp(12)));

        LinearLayout eng = switchRow(GREEN, "Auto-accept engine",
                "Watches your ride apps and accepts matching offers");
        engineSw = (ToggleSwitch) eng.findViewWithTag("switch");
        eng.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                engineOn = !engineOn;
                call("setServiceEnabled", boolean.class, engineOn);
                paint();
            }
        });
        p.addView(eng, matchWrap());
        p.addView(spacer(dp(10)));

        LinearLayout det = switchRow(CYAN, "Detect-only mode",
                "Safe test mode - shows what it would accept, taps nothing");
        detectSw = (ToggleSwitch) det.findViewWithTag("switch");
        det.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                detectOn = !detectOn;
                call("setDetectOnly", boolean.class, detectOn);
                paint();
            }
        });
        p.addView(det, matchWrap());
        p.addView(spacer(dp(22)));

        // --- stats (design): borderless 2x2 grid ------------------------------
        LinearLayout g1 = row();
        statAccepted = tile(g1, "0", "Accepted");
        g1.addView(hspacer(dp(12)));
        statSkipped = tile(g1, "0", "Skipped");
        p.addView(g1, matchWrap());
        p.addView(spacer(dp(18)));
        LinearLayout g2 = row();
        statRate = tile(g2, "0%", "Accept rate");
        g2.addView(hspacer(dp(12)));
        statEarnings = tile(g2, "₹0", "Today's earnings");
        p.addView(g2, matchWrap());
        p.addView(spacer(dp(22)));

        LinearLayout ra = row();
        ra.setGravity(Gravity.CENTER_VERTICAL);
        ra.addView(text("Recent activity", 16f, INK, Typeface.BOLD, 0f),
                new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        TextView seeAll = text("See all", 13f, NEON, Typeface.BOLD, 0f);
        seeAll.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) { show(3); }
        });
        ra.addView(seeAll);
        p.addView(ra, matchWrap());
        p.addView(spacer(dp(12)));
        p.addView(activityFeed());
        p.addView(spacer(dp(22)));

        // Permissions - below the fold: the sheet's Home puts Recent activity here.
        title(p, "Permissions");
        p.addView(spacer(dp(4)));
        p.addView(text("AcceptPro needs these to work. Grant any that are missing.",
                12f, INK_SOFT, Typeface.NORMAL, 0f));
        p.addView(spacer(dp(12)));
        permBox = column();
        buildPermissions(permBox);
        p.addView(permBox, matchWrap());
    }

    private void buildPermissions(LinearLayout box) {
        box.addView(permRow("Accessibility Service",
                "Lets AcceptPro read ride offers on screen", hasA11y(),
                new View.OnClickListener() {
                    @Override public void onClick(View v) {
                        open(new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS));
                    }
                }));
        box.addView(spacer(dp(9)));
        box.addView(permRow("Overlay Permission",
                "Shows the control button over other apps", hasOverlay(),
                new View.OnClickListener() {
                    @Override public void onClick(View v) {
                        open(new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                                Uri.parse("package:" + getPackageName())));
                    }
                }));
        box.addView(spacer(dp(9)));
        box.addView(permRow("Battery Optimization",
                "Stops Android from sleeping the service", hasBatteryOk(),
                new View.OnClickListener() {
                    @Override public void onClick(View v) {
                        try {
                            open(new Intent(Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS,
                                    Uri.parse("package:" + getPackageName())));
                        } catch (Exception e) {
                            open(new Intent(Settings.ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS));
                        }
                    }
                }));
        box.addView(spacer(dp(9)));
        box.addView(permRow("Shizuku",
                "Needed for Ola and Uber auto-accept", hasShizuku(),
                new View.OnClickListener() {
                    @Override public void onClick(View v) {
                        // Installed and reachable -> ask for the permission,
                        // exactly like the original grant_shizuku_btn.
                        if (isShizukuInstalled()) {
                            // Shizuku app present but permission not granted ->
                            // open the app so the user completes pairing/grant.
                            // (The API's requestPermission is obfuscated in this
                            // build, so we do not attempt to call it blindly.)
                            openShizukuApp();
                            toast("Open Shizuku and approve permission for AcceptPro");
                        } else {
                            open(URL_SHIZUKU_PLAY);
                        }
                    }
                }));
    }

    private LinearLayout permRow(String name, String why, boolean granted,
                                 View.OnClickListener grant) {
        LinearLayout outer = row();
        outer.setPadding(dp(14), dp(13), dp(14), dp(13));
        outer.setBackground(gradient(CARD, CARD, true, dp(14)));
        outer.setGravity(Gravity.CENTER_VERTICAL);
        View icon = new View(this);
        icon.setBackground(round(granted ? GREEN : AMBER, dp(5)));
        outer.addView(icon, new LinearLayout.LayoutParams(dp(10), dp(10)));

        LinearLayout txt = column();
        txt.setPadding(dp(14), 0, dp(12), 0);
        txt.addView(text(name, 14f, INK, Typeface.BOLD, 0f));
        txt.addView(text(why, 11f, INK_SOFT, Typeface.NORMAL, 0f));
        outer.addView(txt, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));

        if (granted) {
            outer.addView(label("Granted", 11f, GREEN), gravityCentered());
        } else {
            outer.addView(smallButton("GRANT", BLUE, grant), gravityCentered());
        }
        return outer;
    }

    private LinearLayout activityFeed() {
        LinearLayout feed = gradientCard(CARD, CARD);
        String[] entries = readLog();
        if (entries.length == 0) {
            feed.addView(text("No rides yet", 15f, INK, Typeface.BOLD, 0f));
            feed.addView(spacer(dp(4)));
            feed.addView(text("Offers we detect will show up here in real time.",
                    12f, INK_SOFT, Typeface.NORMAL, 0f));
            return feed;
        }
        int shown = 0;
        for (int i = entries.length - 1; i >= 0 && shown < 5; i--, shown++) {
            String[] parts = entries[i].split("\\|", 3);
            String fare = parts.length > 0 ? parts[0] : "—";
            String decision = parts.length > 1 ? parts[1] : "—";
            String when = parts.length > 2 ? parts[2] : "";
            boolean ok = "ACCEPTED".equals(decision);
            LinearLayout r = row();
            r.setGravity(Gravity.CENTER_VERTICAL);
            r.addView(text(fare, 15f, INK, Typeface.BOLD, 0f),
                    new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
            r.addView(label(when, 11f, INK_FAINT));
            r.addView(hspacer(dp(10)));
            r.addView(ui.chip(ok ? "Accepted" : "Skipped",
                    ok ? ui.successTint : ui.errorTint, ok ? ui.success : ui.error));
            feed.addView(r, matchWrap());
            if (shown < 4) feed.addView(spacer(dp(10)));
        }
        return feed;
    }

    // --------------------------------------------------------------- filters

    private void buildFilters(final LinearLayout p) {
        head(p, "Filters", "Only offers matching every rule get accepted. Everything else is skipped.");
        p.addView(spacer(dp(18)));

        title(p, "Fare");
        p.addView(spacer(dp(12)));
        p.addView(editRow("Minimum fare", "₹" + prefs.getInt("min_fare", 50) + " and above",
                "min_fare", 50, GREEN));
        p.addView(spacer(dp(10)));
        p.addView(editRow("Maximum fare", prefs.getInt("max_fare", 0) == 0 ? "No upper limit"
                        : "₹" + prefs.getInt("max_fare", 0) + " and below",
                "max_fare", 0, PURPLE));

        p.addView(spacer(dp(20)));
        title(p, "Distance");
        p.addView(spacer(dp(12)));
        p.addView(editRow("Max pickup distance", prefs.getInt("max_pickup", 50) + " km",
                "max_pickup", 50, CYAN));
        p.addView(spacer(dp(10)));
        p.addView(editRow("Max drop distance", prefs.getInt("max_drop", 100) + " km",
                "max_drop", 100, CYAN));

        p.addView(spacer(dp(20)));
        title(p, "Location");
        p.addView(spacer(dp(12)));
        buildZones(p);

        p.addView(spacer(dp(24)));
        p.addView(bigButton("Save filters", GREEN, new View.OnClickListener() {
            @Override public void onClick(View v) { pushFilters(); }
        }));
    }

    // ==================== Drop zones (Go-To areas) ====================
    // Zone record in ra_zones (plain store): {"n":name,"lat":,"lng":,"r":m(0=exact),"ex":bool,"needles":[]}
    // Engine binding (decoded schema from the original d5/e0 save path):
    //   sec_location_filters        = [{"keyword":<needle>,"isAccept":true}, ...]  (Gson List<Map>)
    //   sec_location_filter_enabled = boolean   (encrypted store, via z4/b)
    // The engine matcher is text.contains(needle, ignoreCase) over the offer texts, so a zone's
    // needles are the area words/pincodes covering the exact area or the chosen radius.

    private LinearLayout zonesListView;
    private TextView zonesMasterSub;
    private ToggleSwitch zonesMasterSw;
    private android.webkit.WebView mapWeb;
    private double mapLat = 20.59, mapLng = 78.96;
    private Dialog mapDlg;

    private static final String MAP_HTML =
        "<html><head><meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0\">" +
        "<link rel=\"stylesheet\" href=\"https://unpkg.com/leaflet@1.9.4/dist/leaflet.css\"/>" +
        "<script src=\"https://unpkg.com/leaflet@1.9.4/dist/leaflet.js\"></script>" +
        "<style>html,body,#m{margin:0;height:100%;width:100%;background:#0b1622}" +
        "#pin{position:absolute;left:50%;top:50%;transform:translate(-50%,-100%);z-index:1000;" +
        "font-size:34px;color:#03FFB1;text-shadow:0 0 6px #000;pointer-events:none;font-family:sans-serif}" +
        "</style></head><body><div id=\"m\"></div><div id=\"pin\">&#9670;</div><script>" +
        "var map=null;try{" +
        "map=L.map('m').setView([INIT_LAT,INIT_LNG],INIT_ZOOM);" +
        "L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png',{maxZoom:19," +
        "attribution:'&copy; OpenStreetMap contributors'}).addTo(map);" +
        "map.on('moveend',function(){try{var c=map.getCenter();Bridge.onCenter(c.lat,c.lng);}catch(e){}});" +
        "}catch(e){document.getElementById('pin').innerHTML='Map unavailable';}" +
        "function setPoint(a,b,pan){try{if(pan)map.setView([a,b],16);map.panTo([a,b]);Bridge.onCenter(a,b);}catch(e){}}" +
        "</script></body></html>";

    private org.json.JSONArray loadZones() {
        try { return new org.json.JSONArray(enginePrefs().getString("ra_zones", "[]")); }
        catch (Throwable t) { return new org.json.JSONArray(); }
    }

    private void saveZones(org.json.JSONArray arr) {
        enginePrefs().edit().putString("ra_zones", arr.toString()).commit();
    }

    /** Push zones to the engine as Go-To keyword rules + the enable flag. All zones' match
     *  words become isAccept=true rules (Go-To); the engine skips rides matching nothing. */
    private void pushLocationToEngine() {
        try {
            org.json.JSONArray zones = loadZones();
            org.json.JSONArray rules = new org.json.JSONArray();
            for (int i = 0; i < zones.length(); i++) {
                org.json.JSONObject z = zones.optJSONObject(i);
                if (z == null) continue;
                org.json.JSONArray nd = z.optJSONArray("needles");
                if (nd == null) continue;
                for (int j = 0; j < nd.length(); j++) {
                    String k = nd.optString(j, "");
                    if (k.length() < 2) continue;
                    org.json.JSONObject r = new org.json.JSONObject();
                    r.put("keyword", k);
                    r.put("isAccept", true);
                    rules.put(r);
                }
            }
            boolean enabled = prefs.getBoolean("location_filter", false) && rules.length() > 0;
            callAny("settingsLocationFilters", new Class<?>[] { String.class, boolean.class },
                    rules.toString(), enabled);
        } catch (Throwable t) { toast("Zone sync error: " + t); }
    }

    private void buildZones(final LinearLayout p) {
        // master switch: location filter on/off
        final LinearLayout m = row();
        m.setPadding(dp(16), dp(14), dp(16), dp(14));
        m.setBackground(gradient(CARD, CARD, true, dp(14)));
        m.setGravity(Gravity.CENTER_VERTICAL);
        LinearLayout mt = column();
        mt.setPadding(0, 0, dp(10), 0);
        mt.addView(text("Go-To areas", 15f, INK, Typeface.BOLD, 0f));
        boolean on = prefs.getBoolean("location_filter", false);
        zonesMasterSub = label(on ? "On \u00b7 only rides dropping at your areas are taken"
                : "Off \u00b7 all areas accepted", 11f, INK_SOFT);
        mt.addView(zonesMasterSub);
        m.addView(mt, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        zonesMasterSw = new ToggleSwitch(this);
        m.addView(zonesMasterSw, gravityCentered());
        zonesMasterSw.show(on, AMBER);
        m.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                boolean now = !prefs.getBoolean("location_filter", false);
                prefs.edit().putBoolean("location_filter", now).commit();
                zonesMasterSw.show(now, AMBER);
                zonesMasterSub.setText(now ? "On \u00b7 only rides dropping at your areas are taken"
                        : "Off \u00b7 all areas accepted");
                pushLocationToEngine();
            }
        });
        p.addView(m, matchWrap());

        p.addView(spacer(dp(12)));
        zonesListView = column();
        p.addView(zonesListView, matchWrap());
        renderZones();

        p.addView(spacer(dp(12)));
        LinearLayout btns = row();
        btns.addView(bigButton("Add area on map", GREEN, new View.OnClickListener() {
            @Override public void onClick(View v) { mapPickerDialog(); }
        }), new LinearLayout.LayoutParams(0, dp(52), 1.35f));
        View gap = new View(this);
        btns.addView(gap, new LinearLayout.LayoutParams(dp(10), dp(52)));
        btns.addView(bigButton("Test", CYAN, new View.OnClickListener() {
            @Override public void onClick(View v) { testZoneDialog(); }
        }), new LinearLayout.LayoutParams(0, dp(52), 1f));
        p.addView(btns, matchWrap());
        // The engine service may have bound (or rebound) after our last push - resync
        // so sec_location_filters / sec_location_filter_enabled are never left stale.
        pushLocationToEngine();
    }

    private void renderZones() {
        if (zonesListView == null) return;
        zonesListView.removeAllViews();
        org.json.JSONArray zones = loadZones();
        if (zones.length() == 0) {
            zonesListView.addView(text("No Go-To areas yet \u00b7 add one so matching drops are grabbed first.",
                    12f, INK_FAINT, Typeface.NORMAL, 0f));
            return;
        }
        for (int i = 0; i < zones.length(); i++) {
            final int idx = i;
            final org.json.JSONObject z = zones.optJSONObject(i);
            if (z == null) continue;
            LinearLayout r = row();
            r.setPadding(dp(14), dp(12), dp(10), dp(12));
            r.setBackground(gradient(CARD, CARD, true, dp(14)));
            r.setGravity(Gravity.CENTER_VERTICAL);
            LinearLayout t = column();
            t.setPadding(0, 0, dp(8), 0);
            t.addView(text(z.optString("n", "Area"), 14f, INK, Typeface.BOLD, 0f));
            boolean ex = z.optBoolean("ex", true);
            int rm = z.optInt("r", 0);
            String mode = ex ? "Exact area"
                    : (rm >= 1000 ? (rm / 1000.0) + " km radius" : rm + " m radius");
            org.json.JSONArray nd = z.optJSONArray("needles");
            t.addView(label(mode + " \u00b7 " + (nd == null ? 0 : nd.length()) + " match words", 11f, INK_SOFT));
            r.addView(t, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
            r.addView(smallButton("\u2715", RED, new View.OnClickListener() {
                @Override public void onClick(View v) { confirmDeleteZone(idx, z.optString("n", "Area")); }
            }));
            zonesListView.addView(r, matchWrap());
            zonesListView.addView(spacer(dp(8)));
        }
    }

    private void confirmDeleteZone(final int idx, String name) {
        LinearLayout card = dialogCard("Remove " + name + "?", "This area will no longer be grabbed first.");
        card.addView(spacer(dp(16)));
        LinearLayout btns = row();
        btns.addView(smallButton("Cancel", GREEN, new View.OnClickListener() {
            @Override public void onClick(View v) { }
        }), new LinearLayout.LayoutParams(0, dp(46), 1f));
        View gap = new View(this);
        btns.addView(gap, new LinearLayout.LayoutParams(dp(10), dp(46)));
        btns.addView(smallButton("Remove", RED, new View.OnClickListener() {
            @Override public void onClick(View v) {
                try {
                    org.json.JSONArray zones = loadZones();
                    org.json.JSONArray keep = new org.json.JSONArray();
                    for (int i = 0; i < zones.length(); i++) if (i != idx) keep.put(zones.get(i));
                    saveZones(keep);
                } catch (Throwable ignored) {}
                pushLocationToEngine();
                renderZones();
            }
        }), new LinearLayout.LayoutParams(0, dp(46), 1f));
        card.addView(btns, matchWrap());
        final Dialog d = styledDialog(card);
        d.show();
    }

    /** Map picker: Leaflet map with a fixed centre pin + Geocoder search (places and pincodes). */
    private void mapPickerDialog() {
        LinearLayout card = dialogCard("Add Go-To area",
                "Search a place or pincode, move the map so the pin sits on your area.");
        LinearLayout sr = row();
        sr.setGravity(Gravity.CENTER_VERTICAL);
        final EditText q = new EditText(this);
        q.setSingleLine(true);
        q.setHint("Place name or pincode");
        q.setTextColor(INK);
        q.setHintTextColor(INK_FAINT);
        q.setTextSize(13f);
        q.setBackground(round(INPUT_BG, dp(12)));
        q.setPadding(dp(14), dp(10), dp(14), dp(10));
        sr.addView(q, new LinearLayout.LayoutParams(0, dp(46), 1f));
        View gap = new View(this);
        sr.addView(gap, new LinearLayout.LayoutParams(dp(8), dp(46)));
        sr.addView(smallButton("Search", CYAN, new View.OnClickListener() {
            @Override public void onClick(View v) { geoSearch(q.getText().toString()); }
        }), new LinearLayout.LayoutParams(dp(96), dp(46)));
        card.addView(sr, matchWrap());
        card.addView(spacer(dp(10)));

        // Reuse one WebView for the app's lifetime - constructing one boots
        // Chromium (hundreds of ms) and this ran on every Filters rebuild.
        if (mapWeb != null && mapWeb.getParent() instanceof ViewGroup) {
            ((ViewGroup) mapWeb.getParent()).removeView(mapWeb);
        }
        if (mapWeb == null) {
            mapWeb = new android.webkit.WebView(this);
            mapWeb.getSettings().setJavaScriptEnabled(true);
            mapWeb.getSettings().setDomStorageEnabled(true);
            mapWeb.setBackgroundColor(0xFF0B1622);
        }
        mapWeb.removeJavascriptInterface("Bridge");
        mapWeb.addJavascriptInterface(new Object() {
            @android.webkit.JavascriptInterface
            public void onCenter(double lat, double lng) { mapLat = lat; mapLng = lng; }
            @android.webkit.JavascriptInterface
            public void onUse(double lat, double lng) {
                mapLat = lat; mapLng = lng;
                runOnUiThread(new Runnable() {
                    @Override public void run() {
                        if (mapDlg != null) mapDlg.dismiss();
                        zoneSetupDialog(mapLat, mapLng);
                    }
                });
            }
        }, "Bridge");
        String html = MAP_HTML
                .replace("INIT_LAT", String.valueOf(mapLat))
                .replace("INIT_LNG", String.valueOf(mapLng))
                .replace("INIT_ZOOM", "5");
        mapWeb.loadDataWithBaseURL("https://tile.openstreetmap.org/", html, "text/html", "utf-8", null);
        card.addView(mapWeb, matchWrap(dp(300)));
        card.addView(spacer(dp(12)));
        card.addView(bigButton("Use this point", GREEN, new View.OnClickListener() {
            @Override public void onClick(View v) {
                mapWeb.loadUrl("javascript:try{var c=map.getCenter();Bridge.onUse(c.lat,c.lng);}catch(e){}");
            }
        }));
        mapDlg = styledDialog(card);
        mapDlg.show();
    }

    /** Geocoder search: place names and pincodes -> results list -> fly the map there. */
    private void geoSearch(final String q) {
        if (q == null || q.trim().length() < 2) { toast("Type a place or pincode"); return; }
        toast("Searching\u2026");
        new Thread(new Runnable() {
            @Override public void run() {
                final java.util.ArrayList<String> lines = new java.util.ArrayList<String>();
                final java.util.ArrayList<double[]> pts = new java.util.ArrayList<double[]>();
                try {
                    java.util.List<android.location.Address> rs = new android.location.Geocoder(
                            DashboardActivity.this, java.util.Locale.ENGLISH)
                            .getFromLocationName(q.trim(), 6);
                    if (rs != null) {
                        for (int i = 0; i < rs.size(); i++) {
                            android.location.Address a = rs.get(i);
                            String line = a.getAddressLine(0);
                            if (line == null || line.length() == 0) line = a.toString();
                            lines.add(line);
                            pts.add(new double[] { a.getLatitude(), a.getLongitude() });
                        }
                    }
                } catch (Throwable ignored) {}
                runOnUiThread(new Runnable() {
                    @Override public void run() {
                        if (lines.isEmpty()) { toast("No results \u00b7 try another name or pincode"); return; }
                        showSearchResults(lines, pts);
                    }
                });
            }
        }).start();
    }

    private void showSearchResults(final java.util.ArrayList<String> lines,
                                   final java.util.ArrayList<double[]> pts) {
        LinearLayout card = dialogCard("Search results", "Tap the right place to move the pin.");
        final Dialog rd = styledDialog(card);
        for (int i = 0; i < lines.size(); i++) {
            final double[] pt = pts.get(i);
            final String nm = lines.get(i);
            LinearLayout r = plainRow(nm, "", GREEN);
            r.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    mapLat = pt[0]; mapLng = pt[1];
                    if (mapWeb != null) {
                        mapWeb.loadUrl("javascript:try{setPoint(" + pt[0] + "," + pt[1] + ",true);}catch(e){}");
                    }
                    rd.dismiss();
                }
            });
            card.addView(r, matchWrap());
            card.addView(spacer(dp(6)));
        }
        rd.show();
    }

    /** After the pin: name + match mode (exact area or a radius). */
    private void zoneSetupDialog(final double lat, final double lng) {
        final org.json.JSONObject draft = new org.json.JSONObject();
        try { draft.put("lat", lat); draft.put("lng", lng); draft.put("ex", true); draft.put("r", 0); }
        catch (Throwable ignored) {}

        LinearLayout card = dialogCard("New Go-To area", "Set how drops near this point should match.");
        final EditText name = new EditText(this);
        name.setSingleLine(true);
        name.setHint("Area name");
        name.setTextColor(INK);
        name.setHintTextColor(INK_FAINT);
        name.setTextSize(14f);
        name.setBackground(round(INPUT_BG, dp(12)));
        name.setPadding(dp(14), dp(10), dp(14), dp(10));
        card.addView(name, matchWrap(dp(48)));
        card.addView(spacer(dp(12)));

        LinearLayout modes = row();
        final TextView mEx = segPill("Exact area", true);
        final TextView mRad = segPill("Nearby radius", false);
        modes.addView(mEx, new LinearLayout.LayoutParams(0, dp(42), 1f));
        View g1 = new View(this);
        modes.addView(g1, new LinearLayout.LayoutParams(dp(10), dp(42)));
        modes.addView(mRad, new LinearLayout.LayoutParams(0, dp(42), 1f));
        card.addView(modes, matchWrap());

        card.addView(spacer(dp(12)));
        final LinearLayout radRow = row();
        final int[] radii = { 500, 1000, 2000, 5000, 10000 };
        final String[] radLabels = { "500 m", "1 km", "2 km", "5 km", "10 km" };
        final java.util.ArrayList<TextView> chips = new java.util.ArrayList<TextView>();
        for (int i = 0; i < radii.length; i++) {
            final int rr = radii[i];
            final TextView chip = segPill(radLabels[i], rr == 1000);
            chips.add(chip);
            chip.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    try { draft.put("r", rr); draft.put("ex", false); } catch (Throwable ignored) {}
                    for (TextView c : chips) styleSeg(c, c == chip);
                }
            });
            radRow.addView(chip, new LinearLayout.LayoutParams(0, dp(38), 1f));
            if (i < radii.length - 1) {
                View g = new View(this);
                radRow.addView(g, new LinearLayout.LayoutParams(dp(6), dp(38)));
            }
        }
        radRow.setVisibility(View.GONE);
        card.addView(radRow, matchWrap());

        card.addView(spacer(dp(8)));
        LinearLayout custom = row();
        custom.setGravity(Gravity.CENTER_VERTICAL);
        custom.addView(label("Custom radius (km)", 12f, INK_SOFT));
        View g2 = new View(this);
        custom.addView(g2, new LinearLayout.LayoutParams(dp(10), dp(40)));
        final EditText kmIn = new EditText(this);
        kmIn.setSingleLine(true);
        kmIn.setHint("e.g. 1.5");
        kmIn.setTextColor(INK);
        kmIn.setHintTextColor(INK_FAINT);
        kmIn.setTextSize(13f);
        kmIn.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        kmIn.setBackground(round(INPUT_BG, dp(12)));
        kmIn.setPadding(dp(12), dp(8), dp(12), dp(8));
        custom.addView(kmIn, new LinearLayout.LayoutParams(0, dp(42), 1f));
        custom.setVisibility(View.GONE);
        card.addView(custom, matchWrap());

        mEx.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                try { draft.put("ex", true); draft.put("r", 0); } catch (Throwable ignored) {}
                styleSeg(mEx, true); styleSeg(mRad, false);
                radRow.setVisibility(View.GONE); custom.setVisibility(View.GONE);
            }
        });
        mRad.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                styleSeg(mEx, false); styleSeg(mRad, true);
                radRow.setVisibility(View.VISIBLE); custom.setVisibility(View.VISIBLE);
                try { draft.put("ex", false); if (draft.optInt("r", 0) == 0) draft.put("r", 1000); }
                catch (Throwable ignored) {}
            }
        });

        card.addView(spacer(dp(14)));
        final Dialog d = styledDialog(card);
        card.addView(bigButton("Save area", GREEN, new View.OnClickListener() {
            @Override public void onClick(View v) {
                try {
                    String txt = kmIn.getText().toString().trim();
                    if (!draft.optBoolean("ex", true) && txt.length() > 0) {
                        double km = Double.parseDouble(txt);
                        if (km > 0 && km <= 50) draft.put("r", (int) (km * 1000));
                    }
                    String nm = name.getText().toString().trim();
                    draft.put("n", nm.length() > 0 ? nm : ("Area @ " + round4(lat) + "," + round4(lng)));
                } catch (Throwable t) { toast("Check the radius value"); return; }
                d.dismiss();
                toast("Preparing match words\u2026");
                saveZoneAsync(draft);
            }
        }));
        d.show();

        // prefill the name from a reverse geocode
        new Thread(new Runnable() {
            @Override public void run() {
                String nm = reverseName(lat, lng);
                final String f = nm;
                runOnUiThread(new Runnable() {
                    @Override public void run() { name.setText(f); }
                });
            }
        }).start();
    }

    private String round4(double v) { return String.format(java.util.Locale.US, "%.4f", v); }

    private String reverseName(double lat, double lng) {
        try {
            java.util.List<android.location.Address> as = new android.location.Geocoder(
                    this, java.util.Locale.ENGLISH).getFromLocation(lat, lng, 1);
            if (as != null && !as.isEmpty()) {
                android.location.Address a = as.get(0);
                if (a.getSubLocality() != null) return a.getSubLocality();
                if (a.getFeatureName() != null) return a.getFeatureName();
                if (a.getLocality() != null) return a.getLocality();
            }
        } catch (Throwable ignored) {}
        return "Pinned area";
    }

    /** Build the match words: exact = the point's own area words; radius = words covering the
     *  circle (centre + 12 sample points), i.e. area names, streets and pincodes. City/state
     *  names are excluded so one zone never matches a whole city. */
    private java.util.LinkedHashSet<String> needlesFor(double lat, double lng, int radiusM, boolean exact) {
        java.util.LinkedHashSet<String> out = new java.util.LinkedHashSet<String>();
        try {
            android.location.Geocoder g = new android.location.Geocoder(this, java.util.Locale.ENGLISH);
            java.util.ArrayList<double[]> pts = new java.util.ArrayList<double[]>();
            pts.add(new double[] { lat, lng });
            if (!exact && radiusM > 0) {
                double dl = radiusM / 111320.0;
                double dg = dl / Math.max(0.2, Math.cos(Math.toRadians(lat)));
                double[] frs = { 0.5, 0.95 };
                for (int fi = 0; fi < frs.length; fi++) {
                    for (int ai = 0; ai < 8; ai++) {
                        double a = Math.toRadians(ai * 45.0);
                        pts.add(new double[] { lat + dl * frs[fi] * Math.sin(a),
                                lng + dg * frs[fi] * Math.cos(a) });
                    }
                }
            }
            for (int i = 0; i < pts.size(); i++) {
                try {
                    java.util.List<android.location.Address> as =
                            g.getFromLocation(pts.get(i)[0], pts.get(i)[1], 1);
                    if (as == null || as.isEmpty()) continue;
                    android.location.Address a0 = as.get(0);
                    addNeedle(out, a0.getFeatureName());
                    addNeedle(out, a0.getSubLocality());
                    addNeedle(out, a0.getThoroughfare());
                    addNeedle(out, a0.getPostalCode());
                } catch (Throwable ignored) {}
            }
        } catch (Throwable ignored) {}
        return out;
    }

    private void addNeedle(java.util.LinkedHashSet<String> out, String s) {
        if (s == null) return;
        String t = s.trim().toLowerCase(java.util.Locale.ROOT);
        if (t.length() < 3 || t.length() > 40) return;
        if (t.equals("india")) return;
        out.add(t);
    }

    private void saveZoneAsync(final org.json.JSONObject draft) {
        new Thread(new Runnable() {
            @Override public void run() {
                try {
                    boolean ex = draft.optBoolean("ex", true);
                    java.util.LinkedHashSet<String> nd = needlesFor(
                            draft.getDouble("lat"), draft.getDouble("lng"), draft.optInt("r", 0), ex);
                    if (nd.isEmpty()) nd.add(draft.optString("n", "area").toLowerCase(java.util.Locale.ROOT));
                    org.json.JSONArray arr = new org.json.JSONArray();
                    for (String s : nd) arr.put(s);
                    draft.put("needles", arr);
                } catch (Throwable ignored) {}
                runOnUiThread(new Runnable() {
                    @Override public void run() {
                        try {
                            org.json.JSONArray zones = loadZones();
                            zones.put(draft);
                            saveZones(zones);
                        } catch (Throwable ignored) {}
                        pushLocationToEngine();
                        renderZones();
                        toast("Area saved \u00b7 matching drops come to you first");
                    }
                });
            }
        }).start();
    }

    /** Same rule as the engine: the drop text contains one of the zone's match words. */
    private String matchZone(String dropText) {
        if (dropText == null) return null;
        String t = dropText.toLowerCase(java.util.Locale.ROOT);
        org.json.JSONArray zones = loadZones();
        for (int i = 0; i < zones.length(); i++) {
            org.json.JSONObject z = zones.optJSONObject(i);
            if (z == null) continue;
            org.json.JSONArray nd = z.optJSONArray("needles");
            if (nd == null) continue;
            for (int j = 0; j < nd.length(); j++) {
                String k = nd.optString(j, "").toLowerCase(java.util.Locale.ROOT);
                if (k.length() >= 2 && t.contains(k)) return z.optString("n", "Area");
            }
        }
        return null;
    }

    /** Live proof: our verdict shown here, plus the REAL engine decision (detect-only) in logcat. */
    private void testZoneDialog() {
        LinearLayout card = dialogCard("Test a drop",
                "Type a drop address \u00b7 the engine verdict is also logged (adb logcat -s RideToggle).");
        final EditText in = new EditText(this);
        in.setSingleLine(true);
        in.setHint("e.g. 3rd Ave, Anna Nagar, Chennai 600040");
        in.setTextColor(INK);
        in.setHintTextColor(INK_FAINT);
        in.setTextSize(13f);
        in.setBackground(round(INPUT_BG, dp(12)));
        in.setPadding(dp(14), dp(10), dp(14), dp(10));
        card.addView(in, matchWrap(dp(48)));
        card.addView(spacer(dp(10)));
        final TextView out = text("Result appears here.", 12f, INK_FAINT, Typeface.NORMAL, 0f);
        card.addView(out, matchWrap());
        card.addView(spacer(dp(14)));
        card.addView(bigButton("Run test", CYAN, new View.OnClickListener() {
            @Override public void onClick(View v) {
                String t = in.getText().toString();
                if (t.trim().length() < 2) { toast("Type a drop address"); return; }
                String z = matchZone(t);
                out.setText(z != null ? "\u2713 Go-To match \u00b7 zone: " + z
                        : "\u2717 no Go-To area matches (engine will skip)");
                pushLocationToEngine();
                try { callAny("testZoneEngine", new Class<?>[] { String.class }, t); }
                catch (Throwable ignored) {}
            }
        }));
        styledDialog(card).show();
    }

    private void pushFilters() {
        double min = prefs.getInt("min_fare", 50);
        double max = prefs.getInt("max_fare", 0);
        double mp = prefs.getInt("max_pickup", 50);
        double md = prefs.getInt("max_drop", 100);
        try {
            Class.forName(ENGINE).getMethod("setFilters", double.class, double.class,
                    double.class, double.class).invoke(null, min, max > 0 ? max : 100000.0, mp, md);
            Class.forName(ENGINE).getMethod("setFilterFlags", boolean.class, boolean.class)
                    .invoke(null, true, true);
        } catch (Throwable ignored) {}
        toast("Filters saved ✓");
    }

    // ------------------------------------------------------------------ apps

    /** Apps section: session state for the Installed / All apps segmented switch. */
    private boolean appsShowAll = false;

    /** 12 SupportedApp.ALL_APPS platforms - RIDER/PARTNER apps (the side that RECEIVES
      * offers), NOT the consumer apps. Fields: platform, rider app, logo, brand keywords.
      * Display order per spec: Ola, Uber, Rapido, Namma Yatri, Swiggy, Zomato, Zepto,
      * Blinkit, BigBasket, then the rest. */
    private static final String[][] APPS = {
            { "Ola",         "Ola Driver \u00b7 needs Shizuku tap",       "ic_logo_ola",         "ola" },
            { "Uber",        "Uber Driver \u00b7 needs Shizuku tap",      "ic_logo_uber",        "uber" },
            { "Rapido",      "Rapido Rider (Captain) \u00b7 no Shizuku",  "ic_logo_rapido",      "rapido|rr.android|captain" },
            { "Namma Yatri", "Namma Yatri Partner \u00b7 ride offers",    "ic_logo_nammayatri",  "yatri|juspay|namma" },
            { "Swiggy",      "Swiggy Delivery Partner \u00b7 orders",     "ic_logo_swiggy",      "swiggy" },
            { "Zomato",      "Zomato Delivery Partner \u00b7 orders",     "ic_logo_zomato",      "zomato" },
            { "Zepto",       "Zepto Rider \u00b7 grocery runs",           "ic_logo_zepto",       "zepto" },
            { "Blinkit",     "Blinkit Partner \u00b7 grocery runs",       "ic_logo_blinkit",     "blinkit|grofers" },
            { "BigBasket",   "BigBasket Partner \u00b7 grocery runs",     "ic_logo_bigbasket",   "bigbasket" },
            { "Dunzo",       "Dunzo Partner \u00b7 delivery tasks",       "ic_logo_dunzo",       "dunzo" },
            { "Porter",      "Porter Partner Driver \u00b7 truck jobs",   "ic_logo_porter",      "porter" },
            { "Instamart",   "Instamart Partner \u00b7 instant grocery",  "ic_logo_instamart",   "instamart|swiggy" },
    };

    private void buildApps(LinearLayout p) {
        head(p, "Apps", "Choose which ride apps we watch for incoming offers.");
        p.addView(spacer(dp(16)));

        // one-time defaults: installed rider apps ON, every unlisted platform OFF
        applyAppDefaults();

        // segmented switch: Installed (default) | All apps
        LinearLayout seg = row();
        final TextView segA = segPill("Installed", !appsShowAll);
        final TextView segB = segPill("All apps", appsShowAll);
        seg.addView(segA, new LinearLayout.LayoutParams(0, dp(42), 1f));
        View segGap = new View(this);
        seg.addView(segGap, new LinearLayout.LayoutParams(dp(10), dp(42)));
        seg.addView(segB, new LinearLayout.LayoutParams(0, dp(42), 1f));
        p.addView(seg, matchWrap());

        p.addView(spacer(dp(4)));
        final LinearLayout list = column();
        p.addView(list, matchWrap());
        renderApps(list, appsShowAll);

        segA.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                appsShowAll = false;
                styleSeg(segA, true);
                styleSeg(segB, false);
                list.removeAllViews();
                renderApps(list, false);
            }
        });
        segB.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                appsShowAll = true;
                styleSeg(segA, false);
                styleSeg(segB, true);
                list.removeAllViews();
                renderApps(list, true);
            }
        });

        p.addView(spacer(dp(18)));
        LinearLayout warn = gradientCard(WARN_A, WARN_B);
        warn.addView(label("Shizuku needed for Ola and Uber", 12f, AMBER));
        warn.addView(spacer(dp(6)));
        warn.addView(text("Those apps block accessibility clicks, so Shizuku provides shell-level tap access instead. Set it up in Settings.",
                12f, INK_SOFT, Typeface.NORMAL, 0f));
        p.addView(warn, matchWrap());
    }

    private TextView segPill(String title, boolean on) {
        TextView t = text(title, 13f, on ? SEL_INK : INK_SOFT, Typeface.BOLD, 0.2f);
        t.setGravity(Gravity.CENTER);
        t.setPadding(dp(12), dp(11), dp(12), dp(11));
        styleSeg(t, on);
        return t;
    }

    private void styleSeg(TextView t, boolean on) {
        GradientDrawable d = gradient(on ? SEL_BG : BTN_SOFT, on ? SEL_BG : BTN_SOFT, true, dp(12));
        if (!on) d.setStroke(dp(1), CARD_EDGE);
        t.setBackground(d);
        t.setTextColor(on ? SEL_INK : INK_SOFT);
    }

    private void renderApps(LinearLayout list, boolean showAll) {
        int shown = 0;
        for (String[] a : APPS) {
            String[] brands = a[3].split("\\|");
            boolean installed = findRiderPkg(brands) != null;
            if (!showAll && !installed) continue;
            boolean shizuku = "Ola".equals(a[0]) || "Uber".equals(a[0]);
            list.addView(appRow(a[0], a[1], a[2], brands, shizuku ? AMBER : GREEN));
            list.addView(spacer(dp(10)));
            shown++;
        }
        if (shown == 0) {
            list.addView(text("No rider apps installed yet \u00b7 open All apps to browse the 12 supported platforms.",
                    12f, INK_FAINT, Typeface.NORMAL, 0f));
        }
    }

    /** One-time default state: only installed rider apps are ON, everything else OFF. */
    private void applyAppDefaults() {
        SharedPreferences ep = enginePrefs();
        for (String[] a : APPS) {
            String key = "app_enabled_" + a[0];
            if (ep.contains(key)) continue;
            boolean installed = findRiderPkg(a[3].split("\\|")) != null;
            ep.edit().putBoolean(key, installed).commit();
            // live reload through the engine's own updatePreferences()
            callAny("setAppEnabled", new Class<?>[] { String.class, boolean.class },
                    a[0], installed);
        }
    }

    /** Rider-side package markers: we target the apps that RECEIVE offers (Driver, Partner,
     *  Captain, Rider, Delivery, Courier), never the consumer/user apps. */
    private static final String[] RIDER_MARKERS =
            { "driver", "partner", "captain", "rider", "delivery", "courier" };

    private LinearLayout appRow(String name, String riderApp, String logoRes,
                                final String[] brands, final int accent) {
        final String appName = name;
        final LinearLayout outer = row();
        outer.setPadding(dp(14), dp(13), dp(16), dp(13));
        outer.setBackground(gradient(CARD, CARD, true, dp(14)));
        outer.setGravity(Gravity.CENTER_VERTICAL);

        // platform logo as a proper app icon: white rounded-square tile + official mark
        String pkg = findRiderPkg(brands);
        android.widget.ImageView icon = new android.widget.ImageView(this);
        icon.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        icon.setBackground(round(0xFFFFFFFF, dp(11)));
        icon.setOutlineProvider(new ViewOutlineProvider() {
            @Override public void getOutline(View v, Outline o) {
                o.setRoundRect(0, 0, v.getWidth(), v.getHeight(), dp(11));
            }
        });
        icon.setClipToOutline(true);
        int res = getResources().getIdentifier(logoRes, "drawable", getPackageName());
        if (res != 0) icon.setImageResource(res);
        LinearLayout.LayoutParams ilp = new LinearLayout.LayoutParams(dp(44), dp(44));
        ilp.setMargins(dp(12), 0, dp(2), 0);
        outer.addView(icon, ilp);

        LinearLayout txt = column();
        txt.setPadding(dp(12), 0, dp(10), 0);
        txt.addView(text(name, 15f, INK, Typeface.BOLD, 0f));
        txt.addView(text(riderApp, 11f, INK_SOFT, Typeface.NORMAL, 0f));
        boolean has = pkg != null;
        txt.addView(label(has ? "Installed \u2713" : "Not installed \u2717", 11f,
                has ? GREEN : INK_FAINT));
        outer.addView(txt, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));

        final ToggleSwitch sw = new ToggleSwitch(this);
        outer.addView(sw, gravityCentered());
        // default: only installed rider apps are ON (persists to the engine store)
        final String key = "app_enabled_" + appName;
        final boolean[] on = { enginePrefs().contains(key)
                ? enginePrefs().getBoolean(key, true) : has };
        sw.show(on[0], accent);
        outer.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                on[0] = !on[0];
                // same store + key the engine reads (b/g.f write path, commit())
                enginePrefs().edit().putBoolean("app_enabled_" + appName, on[0]).commit();
                // live reload through the engine's own updatePreferences()
                callAny("setAppEnabled", new Class<?>[] { String.class, boolean.class },
                        appName, on[0]);
                sw.show(on[0], accent);
                toast(appName + (on[0] ? " auto-accept ON" : " paused"));
            }
        });
        return outer;
    }

    /** The engine's primary settings store (PreferenceManager default prefs). */
    private SharedPreferences enginePrefs() {
        return getSharedPreferences(getPackageName() + "_preferences", MODE_PRIVATE);
    }

    /** Installed rider/partner package for this platform, or null. Requires the brand
     *  keyword AND a rider-side marker, so consumer apps (com.olacabs.customer,
     *  com.zeptoconsumerapp, com.rapido.passenger, ...) are never counted. */
    private String findRiderPkg(String[] brands) {
        try {
            java.util.List<android.content.pm.PackageInfo> pkgs =
                    getPackageManager().getInstalledPackages(0);
            for (android.content.pm.PackageInfo pi : pkgs) {
                String p = pi.packageName.toLowerCase(java.util.Locale.ROOT);
                boolean brand = false;
                for (String b : brands) if (p.contains(b)) { brand = true; break; }
                if (!brand) continue;
                for (String m : RIDER_MARKERS) if (p.contains(m)) return pi.packageName;
            }
        } catch (Throwable ignored) {}
        return null;
    }

    // --------------------------------------------------------------- history

    private void buildHistory(LinearLayout p) {
        head(p, "History", "Every offer we saw, and what we did with it.");

        SharedPreferences sp = getSharedPreferences("ride_history", MODE_PRIVATE);
        int a = sp.getInt("accepted_count", 0), s = sp.getInt("skipped_count", 0);
        LinearLayout g = row();
        tile(g, String.valueOf(a), "Accepted");
        g.addView(hspacer(dp(12)));
        tile(g, String.valueOf(s), "Skipped");
        p.addView(g, matchWrap());
        p.addView(spacer(dp(18)));

        String[] entries = readLog();
        if (entries.length == 0) {
            LinearLayout empty = gradientCard(CARD, CARD);
            empty.addView(text("No rides yet", 15f, INK, Typeface.BOLD, 0f));
            empty.addView(spacer(dp(4)));
            empty.addView(text("Turn on the engine and the rides you see will be listed here.",
                    12f, INK_SOFT, Typeface.NORMAL, 0f));
            p.addView(empty, matchWrap());
        } else {
            for (int i = entries.length - 1; i >= 0; i--) {
                String[] parts = entries[i].split("\\|", 3);
                String fare = parts.length > 0 ? parts[0] : "—";
                String decision = parts.length > 1 ? parts[1] : "—";
                String when = parts.length > 2 ? parts[2] : "";
                boolean ok = "ACCEPTED".equals(decision);
                LinearLayout r = row();
                r.setPadding(dp(16), dp(14), dp(16), dp(14));
                r.setBackground(gradient(CARD, CARD, true, dp(14)));
                r.setGravity(Gravity.CENTER_VERTICAL);
                LinearLayout t = column();
                t.addView(text(fare, 16f, INK, Typeface.BOLD, 0f));
                t.addView(label(ok ? "Accepted" : "Skipped", 11f, ok ? GREEN : AMBER));
                r.addView(t, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
                r.addView(label(when, 11f, INK_FAINT), gravityCentered());
                p.addView(r, matchWrap());
                p.addView(spacer(dp(10)));
            }
        }

        p.addView(spacer(dp(20)));
        p.addView(bigButton("Reset daily stats", RED, new View.OnClickListener() {
            @Override public void onClick(View v) {
                getSharedPreferences("ride_history", MODE_PRIVATE).edit()
                        .putInt("accepted_count", 0).putInt("skipped_count", 0)
                        .putInt("total_earnings", 0).apply();
                show(current);
                toast("Daily stats reset ✓");
            }
        }));
    }

    // -------------------------------------------------------------- settings

    /** Persisted on/off switch for one of the four design preference rows. */
    private Ui.ToggleSwitch prefToggle(final String key, boolean def) {
        Ui.ToggleSwitch sw = ui.toggle();
        sw.show(prefs.getBoolean(key, def));
        sw.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                boolean nv = !((Ui.ToggleSwitch) v).isOn();
                ((Ui.ToggleSwitch) v).show(nv);
                prefs.edit().putBoolean(key, nv).apply();
            }
        });
        return sw;
    }

    /** Quick-setup row (design panel 6): icon tile + title/sub + Grant/Fix/Pair. */
    private void setupRow(LinearLayout parent, String title, String sub,
                          String icon, int tileFill, String action, View.OnClickListener click) {
        LinearLayout r = row();
        r.setGravity(Gravity.CENTER_VERTICAL);
        r.setPadding(0, dp(12), 0, dp(12));
        r.addView(ui.iconTile(icon, tileFill, ui.onPrimary));
        r.addView(hspacer(dp(12)));
        LinearLayout t = column();
        t.addView(text(title, 15f, INK, Typeface.BOLD, 0f));
        t.addView(text(sub, 12f, INK_SOFT, Typeface.NORMAL, 0f));
        r.addView(t, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        if (action == null) {
            r.addView(ui.icon("check", GREEN, 20));
        } else {
            r.addView(ui.button(action, Ui.OUTLINE, click));
        }
        parent.addView(r, matchWrap());
        View hair = new View(this);
        hair.setBackground(round(CARD_EDGE, dp(1)));
        parent.addView(hair, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(1)));
    }

    /** Preference row (design panel 6): glyph + title + value/chevron or a switch. */
    private void prefRow(LinearLayout parent, String icon, String title,
                         String value, View right, View.OnClickListener click) {
        LinearLayout r = row();
        r.setGravity(Gravity.CENTER_VERTICAL);
        r.setPadding(0, dp(12), 0, dp(12));
        r.addView(ui.icon(icon, INK_FAINT, 20));
        r.addView(hspacer(dp(12)));
        r.addView(text(title, 15f, INK, Typeface.NORMAL, 0f),
                new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        if (right != null) {
            r.addView(right);
        } else if (value != null) {
            r.addView(label(value, 13f, INK_SOFT));
            r.addView(hspacer(dp(6)));
            r.addView(ui.icon("chevron", INK_FAINT, 18));
        }
        if (click != null) {
            r.setClickable(true);
            r.setFocusable(true);
            r.setOnClickListener(click);
        }
        parent.addView(r, matchWrap());
        View hair = new View(this);
        hair.setBackground(round(CARD_EDGE, dp(1)));
        parent.addView(hair, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(1)));
    }

    private void buildSettings(LinearLayout p) {
        head(p, "Settings", "Set it up once, then it runs on its own.");

        // Hand the engine our Context once; every row below is bound to the
        // original shipped handler through the static bridges in classes.dex.
        callAny("uiInit", new Class<?>[] { Context.class }, this);

        // Appearance — the logo's neon dark or a clean light theme
        title(p, T("appearance", "Appearance"));
        p.addView(spacer(dp(4)));
        p.addView(text(T("appearance_sub", "Neon dark or clean light"), 12f, INK_SOFT,
                Typeface.NORMAL, 0f));
        p.addView(spacer(dp(12)));
        LinearLayout prefsCard = gradientCard(CARD, CARD);
        prefsCard.setPadding(dp(16), dp(4), dp(16), dp(4));
        prefRow(prefsCard, "moon", T("theme", "Theme"), dark ? "Dark" : "Light", null,
                new View.OnClickListener() {
            @Override public void onClick(View v) { setTheme(!dark); show(current); }
        });
        prefRow(prefsCard, "bell", "Alert on accept", null, prefToggle("alert_on_accept", true), null);
        prefRow(prefsCard, "power", "Ola accept timers remove", null,
                prefToggle("ola_timers_remove", true), null);
        prefRow(prefsCard, "lock", "Hide developer options", null,
                prefToggle("hide_dev_options", false), null);
        prefRow(prefsCard, "globe", "Keep driving app in English", null,
                prefToggle("keep_driving_english", true), null);
        p.addView(prefsCard, matchWrap());
        p.addView(spacer(dp(20)));

        // Quick setup (design panel 6): progress bar + one action row per item
        int setupDone = (hasA11y() ? 1 : 0) + (hasOverlay() ? 1 : 0)
                + (hasBatteryOk() ? 1 : 0) + (hasShizuku() ? 1 : 0);
        LinearLayout quick = gradientCard(CARD, CARD);
        quick.setPadding(dp(16), dp(8), dp(16), dp(4));
        LinearLayout qh = row();
        qh.setGravity(Gravity.CENTER_VERTICAL);
        qh.setPadding(0, dp(10), 0, 0);
        qh.addView(text("Quick setup", 16f, INK, Typeface.BOLD, 0f),
                new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        qh.addView(label(setupDone + "/4", 13f, BLUE));
        quick.addView(qh, matchWrap());
        quick.addView(spacer(dp(10)));
        LinearLayout bar = row();
        View barFill = new View(this);
        barFill.setBackground(round(NEON, dp(2)));
        View barRest = new View(this);
        barRest.setBackground(round(SW_OFF, dp(2)));
        bar.addView(barFill, new LinearLayout.LayoutParams(0, dp(4),
                setupDone == 0 ? 0.001f : setupDone));
        bar.addView(barRest, new LinearLayout.LayoutParams(0, dp(4),
                setupDone == 4 ? 0.001f : (4 - setupDone)));
        quick.addView(bar, matchWrap());
        quick.addView(spacer(dp(6)));

        setupRow(quick, "Accessibility service",
                hasA11y() ? "Connected" : "Not enabled", "shield", BLUE,
                hasA11y() ? null : "Grant", new View.OnClickListener() {
            @Override public void onClick(View v) {
                open(new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS));
            }
        });
        setupRow(quick, "Draw over other apps",
                hasOverlay() ? "Granted" : "Not granted", "alert", RED,
                hasOverlay() ? null : "Grant", new View.OnClickListener() {
            @Override public void onClick(View v) {
                open(new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                        Uri.parse("package:" + getPackageName())));
            }
        });
        setupRow(quick, "Battery optimization",
                hasBatteryOk() ? "Ignored" : "Not ignored", "power", AMBER,
                hasBatteryOk() ? null : "Fix", new View.OnClickListener() {
            @Override public void onClick(View v) {
                open(new Intent(Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS,
                        Uri.parse("package:" + getPackageName())));
            }
        });
        setupRow(quick, "Shizuku (optional)",
                hasShizuku() ? "Paired" : (isShizukuInstalled() ? "Not paired" : "Not installed"),
                "key", BLUE, hasShizuku() ? null : "Pair", new View.OnClickListener() {
            @Override public void onClick(View v) {
                callAny("settingsShizukuGrant", new Class<?>[] { Context.class },
                        DashboardActivity.this);
                show(current);
            }
        });
        p.addView(quick, matchWrap());
        p.addView(spacer(dp(20)));

        // Shizuku status (shizuku_engine_status + the original shizuku_*_title
        // / _desc state pairs) and the grant_shizuku_btn row. GRANT runs the
        // original Lc5/p; click lambda (d5/k1.smali:5641) via its bridge —
        // requestPermission / open app / install, exactly as shipped.
        title(p, T("shizuku_engine_status", "Shizuku Engine Status"));
        p.addView(spacer(dp(4)));
        p.addView(text("Required only for Ola and Uber.", 12f, INK_SOFT, Typeface.NORMAL, 0f));
        p.addView(spacer(dp(12)));
        LinearLayout sz = gradientCard(CARD, CARD);
        sz.setPadding(dp(18), dp(18), dp(18), dp(18));
        if (!isShizukuInstalled()) {
            sz.addView(text(T("shizuku_not_installed_title", "Shizuku Not Installed \u2717"), 15f, RED, Typeface.BOLD, 0f));
            sz.addView(spacer(dp(4)));
            sz.addView(text(T("shizuku_not_installed_desc", "Shizuku app is not installed. Required for Ola & Uber."),
                    12f, INK_SOFT, Typeface.NORMAL, 0f));
        } else if (!hasShizuku()) {
            sz.addView(text(T("shizuku_permission_title", "Shizuku Permission Required \u26a0"), 15f, AMBER, Typeface.BOLD, 0f));
            sz.addView(spacer(dp(4)));
            sz.addView(text(T("shizuku_permission_desc", "Shizuku service is running. Tap below to pair & authorize."),
                    12f, INK_SOFT, Typeface.NORMAL, 0f));
        } else {
            sz.addView(text(T("shizuku_active_title", "Shizuku Service Active \u2713"), 15f, GREEN, Typeface.BOLD, 0f));
            sz.addView(spacer(dp(4)));
            sz.addView(text(T("shizuku_active_desc", "Ola & Uber auto-accept engine ready at maximum speed."),
                    12f, INK_SOFT, Typeface.NORMAL, 0f));
        }
        sz.addView(spacer(dp(14)));
        sz.addView(bigButton(T("grant_shizuku_btn", "Grant Shizuku Permission / Pair"), BLUE,
                new View.OnClickListener() {
            @Override public void onClick(View v) {
                callAny("settingsShizukuGrant", new Class<?>[] { Context.class }, DashboardActivity.this);
                show(current);
            }
        }));
        sz.addView(spacer(dp(10)));
        LinearLayout btns = row();
        btns.addView(smallButton("GET ON PLAY STORE", BLUE, new View.OnClickListener() {
            @Override public void onClick(View v) { open(URL_SHIZUKU_PLAY); }
        }), new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        btns.addView(hspacer(dp(10)));
        btns.addView(smallButton("GITHUB RELEASES", PURPLE, new View.OnClickListener() {
            @Override public void onClick(View v) { open(URL_SHIZUKU_GIT); }
        }), new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        sz.addView(btns, matchWrap());
        p.addView(sz, matchWrap());
        p.addView(spacer(dp(20)));

        // Language (select_language / select_language_sub). SAVE runs the
        // original Lz/p; language lambda (z/p.smali:489 :pswitch_0) through
        // its bridge: z4/d.M state + putString("app_language", code) on the
        // original com.ride.accepter_preferences store + g5/b locale switch
        // + the save_language toast.
        title(p, T("select_language", "Select App Language"));
        p.addView(spacer(dp(4)));
        p.addView(text(T("select_language_sub", "Choose language and tap Save below"),
                12f, INK_SOFT, Typeface.NORMAL, 0f));
        p.addView(spacer(dp(12)));
        p.addView(langPickRow(T("select_language", "Select App Language"), BLUE));

        p.addView(spacer(dp(20)));
        title(p, "Features");
        p.addView(spacer(dp(12)));
        // Alert on accept (alert_on_accept / play_sound_on_accept). The click
        // runs the original Lh1/b; lambda (d5/a.smali:2552, dispatch 13) which
        // writes ride_alert_enabled (default true) — the same key the engine
        // reads in executeAccept — plus the old setAlertOnAccept bridge.
        p.addView(boundToggleRow(T("alert_on_accept", "Alert on Accept"),
                T("play_sound_on_accept", "Play sound when ride is accepted"),
                readBool("ride_alert_enabled", true), GREEN, new RowToggle() {
            @Override public void apply(boolean on) {
                call("setAlertOnAccept", boolean.class, on);
                callAny("settingsAlertOnAccept", new Class<?>[] { boolean.class }, on);
            }
        }));
        p.addView(spacer(dp(10)));
        // Ola accept timer remover (accept_timer_title / accept_timer_desc).
        // Switch bound to the original Lb/g; lambda (s/k.smali:984, dispatch
        // 0x15=21 -> invoke():pswitch_3 -> f(Z) default = "Zero Animation
        // Mode"): Shizuku "settings put global window/transition/animator_
        // *_scale 0|1" + Log.d "ShellTapExecutor". Checked state mirrors
        // Settings.Global.window_animation_scale == 0f (the original keeps no
        // pref for this row).
        p.addView(boundToggleRow(T("accept_timer_title", "Ola accept timers remove"),
                T("accept_timer_desc", "The accept timer countdown animation will be removed and popups will appear instantly. Requires Shizuku."),
                zeroAnimOn(), CYAN, new RowToggle() {
            @Override public void apply(boolean on) {
                callAny("settingsAcceptTimer", new Class<?>[] { Context.class, boolean.class },
                        DashboardActivity.this, on);
                show(current); // re-read the real Settings.Global state
            }
        }));
        p.addView(spacer(dp(10)));
        // Hide Developer Options (anti_detection_title / anti_detection_desc).
        // hide_btn runs the original Lz/p; default case (z/p.smali:489-555):
        // gate on Shizuku.checkSelfPermission() == 0 (else toast
        // enable_shizuku_first), then via Shizuku "settings put global
        // development_settings_enabled 0" + "adb_enabled 0", Log.d
        // "ShellTapExecutor" "🔒 Hide Developer Settings executed via Shizuku",
        // toast dev_options_hidden only when both exitValue() == 0.
        p.addView(actionRow(T("anti_detection_title", "Hide Developer Options"),
                T("anti_detection_desc", "Prevents ride apps from detecting Developer Options or blocking auto-accept."),
                T("hide_btn", "Hide"), PURPLE, new Runnable() {
            @Override public void run() {
                callAny("settingsHideDevOptions", new Class<?>[] { Context.class }, DashboardActivity.this);
            }
        }));
        p.addView(spacer(dp(10)));
        p.addView(toggleRow("Keep driving app in English",
                "Detection is most reliable with English labels", "force_english", AMBER));

        p.addView(spacer(dp(20)));
        title(p, "Community");
        p.addView(spacer(dp(12)));
        // Community links (url_telegram / url_whatsapp / url_website). Each runs
        // the original Lk4/p; lambda (y3/e.smali:55553/55575/55597, dispatch
        // 3 / 4 / 2) whose invoke()V fires ACTION_VIEW on the res URL.
        LinearLayout links = row();
        links.addView(smallButton("TELEGRAM", BLUE, new View.OnClickListener() {
            @Override public void onClick(View v) {
                callAny("settingsOpenUrl", new Class<?>[] { Context.class, int.class },
                        DashboardActivity.this, 3); // url_telegram
            }
        }), new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        links.addView(hspacer(dp(9)));
        links.addView(smallButton("WHATSAPP", GREEN, new View.OnClickListener() {
            @Override public void onClick(View v) {
                callAny("settingsOpenUrl", new Class<?>[] { Context.class, int.class },
                        DashboardActivity.this, 4); // url_whatsapp
            }
        }), new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        links.addView(hspacer(dp(9)));
        links.addView(smallButton("WEBSITE", PURPLE, new View.OnClickListener() {
            @Override public void onClick(View v) {
                callAny("settingsOpenUrl", new Class<?>[] { Context.class, int.class },
                        DashboardActivity.this, 2); // url_website
            }
        }), new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        p.addView(links, matchWrap());
        p.addView(spacer(dp(18)));

        LinearLayout info = gradientCard(CARD, CARD);
        info.addView(label("Device code", 11f, INK_FAINT));
        info.addView(text(com.ride.accepter.licence.LicenceGate.deviceCode(this), 14f, INK, Typeface.BOLD, 0f));
        info.addView(spacer(dp(10)));
        info.addView(label("Licence", 11f, INK_FAINT));
        long licExp = com.ride.accepter.licence.LicenceGate.licenceExpiry(this);
        String licStatus = com.ride.accepter.licence.LicenceGate.storedStatus(this);
        String licLine = licExp > 0
                ? ("Active until " + expiryText(licExp)
                        + (licStatus.isEmpty() || "OK".equals(licStatus) ? "" : " · " + licStatus))
                : "Not activated";
        info.addView(text(licLine, 14f, licExp > 0 ? GREEN : RED, Typeface.BOLD, 0f));
        p.addView(info, matchWrap());
        p.addView(spacer(dp(14)));
        p.addView(text("AcceptPro · v6", 11f, INK_FAINT, Typeface.NORMAL, 0f));
    }

    // --------------------------------------------------------------- widgets

    /** Page heading (design-system H1) + subtitle. No decorative rails. */
    private void head(LinearLayout p, String title, String sub) {
        p.addView(text(title, 20f, INK, Typeface.BOLD, 0f));
        p.addView(spacer(dp(6)));
        p.addView(text(sub, 13f, INK_SOFT, Typeface.NORMAL, 0f));
    }

    /** Section label (design-system H2): plain 16sp ink, no decoration. */
    private void title(LinearLayout p, String s) {
        p.addView(text(s, 16f, INK, Typeface.BOLD, 0f));
        p.addView(spacer(dp(2)));
    }

    private LinearLayout gradientCard(int a, int b) {
        LinearLayout l = column();
        l.setPadding(dp(16), dp(16), dp(16), dp(16));
        l.setBackground(gradient(a, b, true, dp(16)));
        return l;
    }

    /** Real toggle switch (rounded track + sliding knob) for every on/off row. */
    private class ToggleSwitch extends View {
        private final Paint tp = new Paint(Paint.ANTI_ALIAS_FLAG);
        private final RectF trk = new RectF();
        private boolean on;
        private int accent = NEON;
        ToggleSwitch(Context c) { super(c); }
        void show(boolean v, int acc) { on = v; accent = acc; invalidate(); }
        @Override protected void onMeasure(int ws, int hs) {
            setMeasuredDimension(dp(46), dp(26));
        }
        @Override protected void onDraw(Canvas canvas) {
            float w = getWidth(), h = getHeight(), r = h / 2f;
            trk.set(0, 0, w, h);
            tp.setColor(on ? accent : SW_OFF);
            canvas.drawRoundRect(trk, r, r, tp);
            tp.setColor(SW_KNOB);
            canvas.drawCircle(on ? w - r : r, r, r - dp(3), tp);
        }
    }

    private LinearLayout switchRow(int accent, String title, String sub) {
        LinearLayout outer = row();
        outer.setPadding(dp(16), dp(15), dp(16), dp(15));
        outer.setBackground(gradient(CARD, CARD, true, dp(14)));
        outer.setGravity(Gravity.CENTER_VERTICAL);
        LinearLayout txt = column();
        txt.setPadding(0, 0, dp(12), 0);
        txt.addView(text(title, 15f, INK, Typeface.BOLD, 0f));
        txt.addView(text(sub, 11f, INK_SOFT, Typeface.NORMAL, 0f));
        outer.addView(txt, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        ToggleSwitch sw = new ToggleSwitch(this);
        sw.setTag("switch");
        outer.addView(sw, gravityCentered());
        return outer;
    }

    private LinearLayout toggleRow(String title, String sub, final String key, int accent) {
        final LinearLayout outer = row();
        outer.setPadding(dp(16), dp(15), dp(16), dp(15));
        outer.setBackground(gradient(CARD, CARD, true, dp(14)));
        outer.setGravity(Gravity.CENTER_VERTICAL);
        View rail = new View(this);
        rail.setBackground(round(accent, dp(2)));
        outer.addView(rail, new LinearLayout.LayoutParams(dp(3), dp(34)));
        LinearLayout txt = column();
        txt.setPadding(dp(14), 0, dp(12), 0);
        txt.addView(text(title, 14f, INK, Typeface.BOLD, 0f));
        txt.addView(text(sub, 11f, INK_SOFT, Typeface.NORMAL, 0f));
        outer.addView(txt, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        final ToggleSwitch sw = new ToggleSwitch(this);
        outer.addView(sw, gravityCentered());
        final int ac = accent;
        final boolean[] on = { prefs.getBoolean(key, "force_english".equals(key)) };
        sw.show(on[0], ac);
        outer.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                on[0] = !on[0];
                prefs.edit().putBoolean(key, on[0]).apply();
                sw.show(on[0], ac);
                // "Alert on accept" is the one feature toggle with real engine behaviour
                if ("alert_on_accept".equals(key)) {
                    call("setAlertOnAccept", boolean.class, on[0]);
                    toast(on[0] ? "You'll hear a tone when a ride is accepted"
                            : "Accept alert turned off");
                }
            }
        });
        return outer;
    }

    private LinearLayout editRow(String title, String value, final String key,
                                 final int def, int accent) {
        final LinearLayout outer = row();
        outer.setPadding(dp(16), dp(15), dp(16), dp(15));
        outer.setBackground(gradient(CARD, CARD, true, dp(14)));
        outer.setGravity(Gravity.CENTER_VERTICAL);
        View rail = new View(this);
        rail.setBackground(round(accent, dp(2)));
        outer.addView(rail, new LinearLayout.LayoutParams(dp(3), dp(32)));
        LinearLayout txt = column();
        txt.setPadding(dp(14), 0, dp(12), 0);
        txt.addView(text(title, 14f, INK, Typeface.BOLD, 0f));
        txt.addView(text(value, 12f, INK_SOFT, Typeface.NORMAL, 0f));
        outer.addView(txt, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        outer.addView(smallButton("EDIT", BLUE, new View.OnClickListener() {
            @Override public void onClick(View v) {
                numberDialog(title, key, def);
            }
        }), gravityCentered());
        return outer;
    }

    // ------------------------------------------------------- dialog chrome

    /** Option chosen in a styled picker dialog. */
    private interface OnPick { void pick(int index); }

    /** Frameless dialog: the styled card IS the dialog surface.
     *  A plain Dialog is used (not AlertDialog) so the platform's themed
     *  dialog panel - which draws a dark outline on OneUI - never renders.
     *  The window is outline-clipped to the card's rounded shape so the
     *  corner wedges composite the page behind (never painted dark). */
    private Dialog styledDialog(View content) {
        Dialog dlg = new Dialog(this);
        dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
        content.setLayoutParams(new ViewGroup.LayoutParams(dp(330),
                ViewGroup.LayoutParams.WRAP_CONTENT));
        dlg.setContentView(content);
        dlg.show();
        Window w = dlg.getWindow();
        if (w != null) {
            w.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            ViewGroup decor = (ViewGroup) w.getDecorView();
            decor.setBackground(gradient(CARD, CARD, true, dp(20)));
            decor.setOutlineProvider(new ViewOutlineProvider() {
                @Override public void getOutline(View v, Outline outline) {
                    outline.setRoundRect(0, 0, v.getWidth(), v.getHeight(), dp(20));
                }
            });
            decor.setClipToOutline(true);
            w.setLayout(dp(330), ViewGroup.LayoutParams.WRAP_CONTENT);
        }
        return dlg;
    }

    /** Shared dialog card: white surface, 20dp radius, CARD_EDGE hairline. */
    private LinearLayout dialogCard(String title, String sub) {
        LinearLayout box = column();
        box.setPadding(dp(22), dp(20), dp(22), dp(18));
        box.setBackground(gradient(CARD, CARD, true, dp(20)));
        box.addView(text(title, 17f, INK, Typeface.BOLD, 0f));
        if (sub != null && sub.length() > 0) {
            box.addView(spacer(dp(4)));
            box.addView(text(sub, 12f, INK_SOFT, Typeface.NORMAL, 0f));
        }
        return box;
    }

    /** Styled option-list dialog; rows echo the app's accent-rail cards. */
    private void pickerDialog(String title, String sub, String[] labels, int selected,
                              final OnPick cb) {
        LinearLayout box = dialogCard(title, sub);
        box.addView(spacer(dp(14)));

        LinearLayout list = column();
        final Dialog[] holder = new Dialog[1];
        for (int i = 0; i < labels.length; i++) {
            final int idx = i;
            boolean sel = i == selected;
            LinearLayout r = row();
            r.setPadding(dp(14), dp(12), dp(14), dp(12));
            r.setBackground(round(sel ? SEL_BG : ROW_BG, dp(12)));
            r.setGravity(Gravity.CENTER_VERTICAL);
            View rail = new View(this);
            rail.setBackground(round(sel ? SEL_INK : CARD_EDGE, dp(2)));
            LinearLayout.LayoutParams rl = new LinearLayout.LayoutParams(dp(3), dp(24));
            rl.rightMargin = dp(12);
            r.addView(rail, rl);
            TextView t = text(labels[i], 15f, sel ? SEL_INK : INK,
                    sel ? Typeface.BOLD : Typeface.NORMAL, 0f);
            r.addView(t, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
            if (sel) r.addView(text("\u2713", 15f, SEL_INK, Typeface.BOLD, 0f));
            r.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    if (holder[0] != null) holder[0].dismiss();
                    cb.pick(idx);
                }
            });
            LinearLayout.LayoutParams rp = matchWrap();
            rp.topMargin = dp(5);
            rp.bottomMargin = dp(5);
            list.addView(r, rp);
        }

        ScrollView sc = new ScrollView(this);
        sc.setVerticalScrollBarEnabled(false);
        sc.addView(list, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        box.addView(sc, matchWrap(Math.min(labels.length * dp(56) + dp(8), dp(540))));

        holder[0] = styledDialog(box);
    }

    /** Modern rounded input dialog matching the app's card styling. */
    private void numberDialog(String title, final String key, final int def) {
        LinearLayout box = dialogCard(title, "Enter a number and tap Save.");
        box.addView(spacer(dp(16)));

        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        input.setText(String.valueOf(prefs.getInt(key, def)));
        input.setSelectAllOnFocus(true);
        input.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20f);
        input.setTextColor(INK);
        input.setGravity(Gravity.CENTER);
        input.setPadding(dp(16), dp(14), dp(16), dp(14));
        input.setBackground(round(INPUT_BG, dp(12)));
        box.addView(input, matchWrap());
        box.addView(spacer(dp(18)));

        LinearLayout btns = row();
        TextView cancel = text("Cancel", 14f, INK_SOFT, Typeface.BOLD, 0f);
        cancel.setGravity(Gravity.CENTER);
        cancel.setPadding(dp(16), dp(14), dp(16), dp(14));
        cancel.setBackground(round(BTN_SOFT, dp(12)));
        TextView save = text("Save", 14f, onColor(BLUE), Typeface.BOLD, 0f);
        save.setGravity(Gravity.CENTER);
        save.setPadding(dp(16), dp(14), dp(16), dp(14));
        save.setBackground(gradient(BLUE, shade(BLUE, 0.85f), true, dp(12)));

        btns.addView(cancel, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        btns.addView(hspacer(dp(12)));
        btns.addView(save, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        box.addView(btns, matchWrap());

        final Dialog dlg = styledDialog(box);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) { dlg.dismiss(); }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                try {
                    prefs.edit().putInt(key, Integer.parseInt(
                            input.getText().toString().trim())).apply();
                } catch (Exception ignored) {}
                dlg.dismiss();
                show(current);
            }
        });
    }

    private LinearLayout pickRow(String title, String value, final String[] options,
                                 final String key, int accent) {
        LinearLayout outer = row();
        outer.setPadding(dp(16), dp(15), dp(16), dp(15));
        outer.setBackground(gradient(CARD, CARD, true, dp(14)));
        outer.setGravity(Gravity.CENTER_VERTICAL);
        View rail = new View(this);
        rail.setBackground(round(accent, dp(2)));
        outer.addView(rail, new LinearLayout.LayoutParams(dp(3), dp(32)));
        LinearLayout txt = column();
        txt.setPadding(dp(14), 0, dp(12), 0);
        txt.addView(text(title, 14f, INK, Typeface.BOLD, 0f));
        txt.addView(text(value, 12f, INK_SOFT, Typeface.NORMAL, 0f));
        outer.addView(txt, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        outer.addView(smallButton("CHANGE", BLUE, new View.OnClickListener() {
            @Override public void onClick(View v) {
                pickerDialog(title, null, options,
                        java.util.Arrays.asList(options).indexOf(prefs.getString(key, "")),
                        new OnPick() {
                            @Override public void pick(int w) {
                                prefs.edit().putString(key, options[w]).apply();
                                show(current);
                            }
                        });
            }
        }), gravityCentered());
        return outer;
    }

    // ------------------------------------------- original-handler row plumbing

    /** Row toggle callback bound to a shipping handler. */
    private interface RowToggle { void apply(boolean on); }

    /** Calls a static bridge on RideAcceptorService; the handler logic itself
     *  stays untouched in classes.dex. */
    private Object callAny(String n, Class<?>[] sig, Object... args) {
        try {
            return Class.forName(ENGINE).getMethod(n, sig).invoke(null, args);
        } catch (Throwable t) {
            return null;
        }
    }

    /** Boolean state from the ORIGINAL store (z4/d -> com.ride.accepter_preferences). */
    private boolean readBool(String key, boolean fb) {
        Object r = callAny("uiBool", new Class<?>[] { String.class, boolean.class }, key, fb);
        return r instanceof Boolean ? (Boolean) r : fb;
    }

    /** Accept-timer row state: Settings.Global.window_animation_scale == 0f
     *  (the original derives the checked state from the global setting). */
    private boolean zeroAnimOn() {
        Object r = callAny("uiZeroAnim", new Class<?>[] {});
        return r instanceof Boolean ? (Boolean) r : false;
    }

    /** g5/b.b(key, lang) — the shipping localization lookup (falls back to English). */
    private String T(String key, String fallback) {
        Object r = callAny("uiText", new Class<?>[] { String.class }, key);
        return (r instanceof String && ((String) r).length() > 0 && !((String) r).equals(key))
                ? (String) r : fallback;
    }

    /** Current app_language code (z4/d.L key, default "en"). */
    private String langCode() {
        Object r = callAny("uiLang", new Class<?>[] {});
        return r instanceof String ? (String) r : "en";
    }

    /** g5/b.a language table flattened to [code, name, nativeName] * n. */
    private String[] langItems() {
        Object r = callAny("uiLangs", new Class<?>[] {});
        return (r instanceof String[] && ((String[]) r).length >= 3) ? (String[]) r
                : new String[] { "en", "English", "English", "hi", "\u0939\u093f\u0928\u094d\u0926\u0940", "\u0939\u093f\u0928\u094d\u0926\u0940",
                        "ta", "\u0ba4\u0bae\u0bbf\u0bb4\u0bcd", "\u0ba4\u0bae\u0bbf\u0bb4\u0bcd",
                        "kn", "\u0c95\u0ca8\u0ccd\u0ca8\u0ca1", "\u0c95\u0ca8\u0ccd\u0ca8\u0ca1",
                        "te", "\u0c24\u0c46\u0c32\u0c41\u0c17\u0c41", "\u0c24\u0c46\u0c32\u0c41\u0c17\u0c41" };
    }

    /** Toggle row whose state is read from the original prefs and whose click
     *  runs the original handler (same chrome as toggleRow). */
    private LinearLayout boundToggleRow(String title, String sub, boolean checked,
                                        int accent, final RowToggle handler) {
        final LinearLayout outer = row();
        outer.setPadding(dp(16), dp(15), dp(16), dp(15));
        outer.setBackground(gradient(CARD, CARD, true, dp(14)));
        outer.setGravity(Gravity.CENTER_VERTICAL);
        View rail = new View(this);
        rail.setBackground(round(accent, dp(2)));
        outer.addView(rail, new LinearLayout.LayoutParams(dp(3), dp(34)));
        LinearLayout txt = column();
        txt.setPadding(dp(14), 0, dp(12), 0);
        txt.addView(text(title, 14f, INK, Typeface.BOLD, 0f));
        txt.addView(text(sub, 11f, INK_SOFT, Typeface.NORMAL, 0f));
        outer.addView(txt, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        final ToggleSwitch sw = new ToggleSwitch(this);
        outer.addView(sw, gravityCentered());
        final int ac = accent;
        final boolean[] on = { checked };
        sw.show(on[0], ac);
        outer.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                on[0] = !on[0];
                handler.apply(on[0]);
                sw.show(on[0], ac);
            }
        });
        return outer;
    }

    /** Non-interactive row: original key/title/description kept, no handler
     *  wired (used where the build ships no binding). */
    private LinearLayout plainRow(String title, String sub, int accent) {
        LinearLayout outer = row();
        outer.setPadding(dp(16), dp(15), dp(16), dp(15));
        outer.setBackground(gradient(CARD, CARD, true, dp(14)));
        outer.setGravity(Gravity.CENTER_VERTICAL);
        View rail = new View(this);
        rail.setBackground(round(accent, dp(2)));
        outer.addView(rail, new LinearLayout.LayoutParams(dp(3), dp(34)));
        LinearLayout txt = column();
        txt.setPadding(dp(14), 0, dp(12), 0);
        txt.addView(text(title, 14f, INK, Typeface.BOLD, 0f));
        txt.addView(text(sub, 11f, INK_SOFT, Typeface.NORMAL, 0f));
        outer.addView(txt, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        return outer;
    }

    /** Row with a single action button (same chrome as editRow). */
    private LinearLayout actionRow(String title, String sub, String action, int accent,
                                   final Runnable handler) {
        LinearLayout outer = row();
        outer.setPadding(dp(16), dp(15), dp(16), dp(15));
        outer.setBackground(gradient(CARD, CARD, true, dp(14)));
        outer.setGravity(Gravity.CENTER_VERTICAL);
        View rail = new View(this);
        rail.setBackground(round(accent, dp(2)));
        outer.addView(rail, new LinearLayout.LayoutParams(dp(3), dp(32)));
        LinearLayout txt = column();
        txt.setPadding(dp(14), 0, dp(12), 0);
        txt.addView(text(title, 14f, INK, Typeface.BOLD, 0f));
        txt.addView(text(sub, 11f, INK_SOFT, Typeface.NORMAL, 0f));
        outer.addView(txt, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        outer.addView(smallButton(action, accent, new View.OnClickListener() {
            @Override public void onClick(View v) { handler.run(); }
        }), gravityCentered());
        return outer;
    }

    /** Language row (same chrome as pickRow); picking an entry runs the
     *  original Lz/p; save-language lambda via settingsSaveLanguage. */
    private LinearLayout langPickRow(String title, int accent) {
        final String[] triples = langItems();
        final String code = langCode();
        String value = code;
        for (int i = 0; i + 2 < triples.length; i += 3) {
            if (triples[i].equals(code)) { value = triples[i + 1] + " (" + code + ")"; break; }
        }
        LinearLayout outer = row();
        outer.setPadding(dp(16), dp(15), dp(16), dp(15));
        outer.setBackground(gradient(CARD, CARD, true, dp(14)));
        outer.setGravity(Gravity.CENTER_VERTICAL);
        View rail = new View(this);
        rail.setBackground(round(accent, dp(2)));
        outer.addView(rail, new LinearLayout.LayoutParams(dp(3), dp(32)));
        LinearLayout txt = column();
        txt.setPadding(dp(14), 0, dp(12), 0);
        txt.addView(text(title, 14f, INK, Typeface.BOLD, 0f));
        txt.addView(text(value, 12f, INK_SOFT, Typeface.NORMAL, 0f));
        outer.addView(txt, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        outer.addView(smallButton(T("save_language", "SAVE LANGUAGE"), BLUE, new View.OnClickListener() {
            @Override public void onClick(View v) {
                final String[] codes = new String[triples.length / 3 + 1];
                String[] labels = new String[triples.length / 3 + 1];
                int n = 0, sel = 0;
                for (int i = 0; i + 2 < triples.length; i += 3) {
                    codes[n] = triples[i];
                    labels[n] = triples[i + 1] + " (" + triples[i] + ")";
                    if (triples[i].equals(code)) sel = n;
                    n++;
                }
                pickerDialog(title, null, java.util.Arrays.copyOf(labels, n), sel,
                        new OnPick() {
                            @Override public void pick(int w) {
                                callAny("settingsSaveLanguage",
                                        new Class<?>[] { Context.class, String.class },
                                        DashboardActivity.this, codes[w]);
                                show(current);
                            }
                        });
            }
        }), gravityCentered());
        return outer;
    }

    /** Stat tile (design): borderless value + label, no card chrome. */
    private TextView tile(LinearLayout parent, String value, String label) {
        LinearLayout t = column();
        TextView v = text(value, 24f, INK, Typeface.BOLD, 0f);
        t.addView(v);
        t.addView(spacer(dp(3)));
        t.addView(text(label, 13f, INK_SOFT, Typeface.NORMAL, 0f));
        parent.addView(t, new LinearLayout.LayoutParams(0,
                ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        return v;
    }

    /** Slight vertical shade so buttons read as pressed-out of the surface. */
    private int shade(int c, float f) {
        int r = Math.min(255, (int)(((c >> 16) & 0xFF) * f));
        int g = Math.min(255, (int)(((c >> 8) & 0xFF) * f));
        int b = Math.min(255, (int)((c & 0xFF) * f));
        return (c & 0xFF000000) | (r << 16) | (g << 8) | b;
    }

    /** Readable ink for text sitting on a filled accent (white or near-black). */
    private int onColor(int bg) {
        double lum = 0.299 * ((bg >> 16) & 0xFF) + 0.587 * ((bg >> 8) & 0xFF)
                + 0.114 * (bg & 0xFF);
        return lum > 150 ? 0xFF07121E : Color.WHITE;
    }

    /** Theme chooser pill; the active one wears the logo's neon accent. */
    private View themePill(String name, final boolean goDark) {
        boolean sel = dark == goDark;
        TextView t = text(name, 14f, sel ? onColor(GREEN) : INK_SOFT, Typeface.BOLD, 0f);
        t.setGravity(Gravity.CENTER);
        t.setPadding(0, dp(13), 0, dp(13));
        t.setBackground(sel ? gradient(GREEN, shade(GREEN, 0.85f), true, dp(12))
                : gradient(CARD, CARD, true, dp(12)));
        t.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) { setTheme(goDark); }
        });
        return t;
    }

    private View bigButton(String label, int color, View.OnClickListener l) {
        TextView t = text(label, 14f, onColor(color), Typeface.BOLD, 0f);
        t.setGravity(Gravity.CENTER);
        t.setPadding(dp(18), dp(16), dp(18), dp(16));
        t.setBackground(gradient(color, shade(color, 0.82f), true, dp(12)));
        t.setOnClickListener(l);
        return t;
    }

    private View smallButton(String label, int color, View.OnClickListener l) {
        TextView t = text(label, 11f, color, Typeface.BOLD, 0f);
        t.setGravity(Gravity.CENTER);
        t.setPadding(dp(13), dp(10), dp(13), dp(10));
        GradientDrawable d = new GradientDrawable();
        d.setColor((dark ? 0x2E000000 : 0x14000000) | (color & 0xFFFFFF));
        d.setCornerRadius(dp(9));
        d.setStroke(dp(1), color);
        t.setBackground(d);
        t.setOnClickListener(l);
        return t;
    }

    // ---------------------------------------------------------------- state

    private String[] readLog() {
        String raw = getSharedPreferences("ride_history", MODE_PRIVATE).getString("entries", "");
        return raw.isEmpty() ? new String[0] : raw.split("\n");
    }

    private boolean hasA11y() {
        String s = Settings.Secure.getString(getContentResolver(),
                Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES);
        return s != null && s.contains(MY_A11Y);
    }

    private boolean hasOverlay() {
        return Settings.canDrawOverlays(this);
    }

    private boolean hasBatteryOk() {
        PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
        return pm != null && pm.isIgnoringBatteryOptimizations(getPackageName());
    }

    /**
     * Shizuku permission check, matching the original app exactly
     * (d5/o1.smali:19908 -> Shizuku.checkSelfPermission() == 0).
     *
     * The Shizuku API is obfuscated in this build:
     *   moe.shizuku.privileged.api.Shizuku  ->  rikka.shizuku.۟ۤۦ۟ۦ
     *   checkSelfPermission()I              ->  ۤۤۥۣ()I   (rikka/shizuku/۟ۤۦ۟ۦ.smali:240)
     * Installed-but-ungranted must report as NOT granted.
     */
    private boolean hasShizuku() {
        try {
            Class<?> shizuku = Class.forName(SHIZUKU_API_CLASS);
            Object result = shizuku.getMethod(SHIZUKU_CHECK_PERM).invoke(null);
            return Integer.valueOf(0).equals(result);
        } catch (Throwable t) {
            return false;
        }
    }

    private void refresh() {
        engineOn = read("getEngineEnabled", engineOn);
        detectOn = read("getDetectOnly", detectOn);
        paint();
    }

    private void paint() {
        if (heroStatus == null) return;
        heroStatus.setText(engineOn ? "Service is running" : "Service is stopped");
        heroSub.setText(engineOn
                ? "Watching your ride apps for matching offers."
                : "Turn on the engine to start watching for rides.");
        if (engineSw != null) engineSw.show(engineOn, GREEN);
        if (detectSw != null) detectSw.show(detectOn, CYAN);

        SharedPreferences sp = getSharedPreferences("ride_history", MODE_PRIVATE);
        int a = sp.getInt("accepted_count", 0), s = sp.getInt("skipped_count", 0);
        statAccepted.setText(String.valueOf(a));
        statSkipped.setText(String.valueOf(s));
        statRate.setText(((a + s) == 0 ? 0 : Math.round(100f * a / (a + s))) + "%");
        statEarnings.setText("₹" + sp.getInt("total_earnings", 0));
    }

    private boolean isShizukuInstalled() {
        try {
            getPackageManager().getPackageInfo(SHIZUKU_PKG, 0);
            return true;
        } catch (Exception e) { return false; }
    }

    /** Same market deep-link the original uses (c5/p.smali:89). */
    private void openShizukuApp() {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=" + SHIZUKU_PKG)));
        } catch (Exception e) {
            open(URL_SHIZUKU_PLAY);
        }
    }

    private void open(String url) {
        try { startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url))); }
        catch (Exception ignored) {}
    }

    private void open(Intent i) {
        try { startActivity(i); } catch (Exception e) { toast("Can't open that setting"); }
    }

    private String expiryText(long ms) {
        return java.text.DateFormat.getDateTimeInstance(
                java.text.DateFormat.MEDIUM, java.text.DateFormat.SHORT)
                .format(new java.util.Date(ms));
    }

    private void toast(String m) {
        android.widget.Toast.makeText(this, m, android.widget.Toast.LENGTH_SHORT).show();
    }

    // --------------------------------------------------------------- helpers

    private boolean read(String m, boolean fb) {
        try {
            Object r = Class.forName(ENGINE).getMethod(m).invoke(null);
            return Boolean.TRUE.equals(r);
        } catch (Throwable t) { return fb; }
    }

    private void call(String n, Class<?> s, boolean v) {
        try { Class.forName(ENGINE).getMethod(n, s).invoke(null, v); } catch (Throwable ignored) {}
    }

    private void tint(View v, int c) {
        if (v != null && v.getBackground() instanceof GradientDrawable)
            ((GradientDrawable) v.getBackground()).setColor(c);
    }

    private GradientDrawable gradient(int a, int b, boolean vert, int radius) {
        GradientDrawable d = new GradientDrawable(
                vert ? GradientDrawable.Orientation.TOP_BOTTOM : GradientDrawable.Orientation.LEFT_RIGHT,
                new int[] { a, b });
        d.setCornerRadius(radius);
        if (a == CARD && b == CARD) { d.setColor(CARD); d.setStroke(dp(1), CARD_EDGE); }
        return d;
    }

    private GradientDrawable round(int c, int r) {
        GradientDrawable d = new GradientDrawable();
        d.setColor(c); d.setCornerRadius(r);
        return d;
    }

    private LinearLayout row() {
        LinearLayout l = new LinearLayout(this); l.setOrientation(LinearLayout.HORIZONTAL); return l;
    }

    private LinearLayout column() {
        LinearLayout l = new LinearLayout(this); l.setOrientation(LinearLayout.VERTICAL); return l;
    }

    private TextView text(String s, float sp, int color, int style, float spacing) {
        TextView t = new TextView(this);
        t.setText(s); t.setTextColor(color);
        t.setTextSize(TypedValue.COMPLEX_UNIT_SP, sp);
        t.setTypeface(Typeface.create("sans-serif", style));
        return t;
    }

    private TextView label(String s, float sp, int color) {
        TextView t = new TextView(this);
        t.setText(s); t.setTextColor(color);
        t.setTextSize(TypedValue.COMPLEX_UNIT_SP, sp);
        t.setTypeface(Typeface.create("sans-serif-medium", Typeface.BOLD));
        return t;
    }

    private View spacer(int h) {
        View v = new View(this);
        v.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, h));
        return v;
    }

    private View hspacer(int w) {
        View v = new View(this);
        v.setLayoutParams(new LinearLayout.LayoutParams(w, 1));
        return v;
    }

    private LinearLayout.LayoutParams matchWrap() {
        return new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
    }

    private LinearLayout.LayoutParams matchWrap(int h) {
        return new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, h);
    }

    private LinearLayout.LayoutParams gravityCentered() {
        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        p.gravity = Gravity.CENTER_VERTICAL;
        return p;
    }

    private int dp(float v) {
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, v,
                getResources().getDisplayMetrics()));
    }
}
