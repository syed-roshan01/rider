package com.ride.accepter.ui;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.InputType;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * AcceptPro design kit - the ONLY place visual values live.
 *
 * Tokens, type scale and components are codified from the approved AcceptPro
 * mockups (dark + light boards: Activation, Home, Filters, Apps, History,
 * Settings, Select area, dialogs, chips, banners). Screens compose these
 * builders and never hardcode a color, radius or text size.
 *
 * Flat fills + hairlines + integer sp sizes: crisp, sharp, no gradients.
 * The public API of the previous kit is kept (same names and signatures), so
 * ActivationActivity and any other screen keep compiling unchanged.
 */
public final class Ui {

    // ---- type scale (integer sp only - crisp text rendering) -------------
    public static final int DISPLAY = 24;   // stat values
    public static final int H1 = 22;        // page titles: Filters, Apps, History, Settings
    public static final int H2 = 16;        // section / dialog titles
    public static final int ROW = 14;       // list row titles
    public static final int BTN = 15;       // button labels
    public static final int BODY = 13;      // supporting text
    public static final int LABEL = 12;     // row subtitles, chips
    public static final int CAPTION = 11;   // timestamps, tags, nav labels

    // ---- font weights ----------------------------------------------------
    public static final int REGULAR = 0;
    public static final int MEDIUM = 1;
    public static final int BOLD = 2;

    // ---- button kinds ----------------------------------------------------
    public static final int PRIMARY = 0;    // filled blue  (Activate, Use this point, Save)
    public static final int OUTLINE = 1;    // blue outline (Grant, Fix, Pair)
    public static final int LINK = 2;       // bare blue text (Reset, See all)
    public static final int GHOST = 3;      // neutral outline (Cancel, Copy)
    public static final int DANGER = 4;     // red outline (Remove)

    // ---- banner kinds ----------------------------------------------------
    public static final int SUCCESS = 0;
    public static final int ERROR = 1;
    public static final int WARNING = 2;
    public static final int INFO = 3;

    // ---- fixed tile accents (quick-setup icon tiles, same in both themes) -
    public static final int TILE_BLUE = 0xFF2F6BFF;
    public static final int TILE_RED = 0xFFEF4444;
    public static final int TILE_AMBER = 0xFFF59E0B;
    public static final int TILE_GREEN = 0xFF22C55E;

    private static final Typeface TF_REGULAR = Typeface.create("sans-serif", Typeface.NORMAL);
    private static final Typeface TF_MEDIUM = Typeface.create("sans-serif-medium", Typeface.NORMAL);
    private static final Typeface TF_BOLD = Typeface.create("sans-serif", Typeface.BOLD);
    private static final ArgbEvaluator ARGB = new ArgbEvaluator();

    // ---- tokens ----------------------------------------------------------
    public final boolean dark;
    public final int bg, surface, surfaceHigh, border;
    public final int ink, inkSoft, inkFaint;
    public final int primary, onPrimary, primaryTint;
    public final int success, successTint, error, errorTint, warning, warningTint;
    public final int switchOff, switchKnob, ripple;
    /** Text/icon colour that sits on primaryTint (Accepted tag, info banner). */
    public final int primaryInk;
    /** Input well fill. */
    public final int fieldFill;
    /** Disabled button fill. */
    public final int disabled;
    /** Status hero card. */
    public final int heroFill, heroEdge;
    /** Map placeholder palette (zone thumbnails, map background). */
    public final int mapLand, mapRoad, mapWater;

    private final Context ctx;

    public Ui(Context ctx, boolean dark) {
        this.ctx = ctx;
        this.dark = dark;
        if (dark) {
            bg = 0xFF0A0B0E; surface = 0xFF14161B; surfaceHigh = 0xFF1C1F26; border = 0xFF262A32;
            ink = 0xFFF4F6FA; inkSoft = 0xFF9BA1AD; inkFaint = 0xFF6B717C;
            primary = 0xFF2F6BFF; onPrimary = 0xFFFFFFFF; primaryTint = 0xFF15254A;
            primaryInk = 0xFF7EA6FF;
            success = 0xFF22C55E; successTint = 0xFF10291C;
            error = 0xFFF26464; errorTint = 0xFF34171A;
            warning = 0xFFF5A524; warningTint = 0xFF2D2312;
            switchOff = 0xFF3A3E47; switchKnob = 0xFFFFFFFF;
            ripple = 0x22FFFFFF;
            fieldFill = 0xFF101216; disabled = 0xFF2A2D35;
            heroFill = 0xFF111A2C; heroEdge = 0xFF1F2B45;
            mapLand = 0xFF1A1E26; mapRoad = 0xFF2C313B; mapWater = 0xFF15243A;
        } else {
            bg = 0xFFF5F6F8; surface = 0xFFFFFFFF; surfaceHigh = 0xFFF3F5F8; border = 0xFFE4E7EC;
            ink = 0xFF0F1115; inkSoft = 0xFF5E6573; inkFaint = 0xFF8C93A0;
            primary = 0xFF2563EB; onPrimary = 0xFFFFFFFF; primaryTint = 0xFFE8F0FE;
            primaryInk = 0xFF1D5BD8;
            success = 0xFF16A34A; successTint = 0xFFE8F7EE;
            error = 0xFFDC2626; errorTint = 0xFFFDECEC;
            warning = 0xFFB45309; warningTint = 0xFFFEF4E2;
            switchOff = 0xFFDCE0E6; switchKnob = 0xFFFFFFFF;
            ripple = 0x14000000;
            fieldFill = 0xFFFFFFFF; disabled = 0xFFE5E8ED;
            heroFill = 0xFFF2F6FF; heroEdge = 0xFFDDE7FC;
            mapLand = 0xFFEEF1F4; mapRoad = 0xFFFFFFFF; mapWater = 0xFFD5E6F7;
        }
    }

    // ---- measurements ----------------------------------------------------

    public int dp(float v) {
        return Math.round(TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, v, ctx.getResources().getDisplayMetrics()));
    }

    /** Crisp hairline: ~0.6dp, never below one physical pixel. */
    public int hairline() {
        return Math.max(1, Math.round(ctx.getResources().getDisplayMetrics().density * 0.6f));
    }

    /** Same colour with a new alpha (0-255). */
    public static int alpha(int color, int a) {
        return (color & 0x00FFFFFF) | ((a & 0xFF) << 24);
    }

    // ---- primitives ------------------------------------------------------

    public LinearLayout col() {
        LinearLayout l = new LinearLayout(ctx);
        l.setOrientation(LinearLayout.VERTICAL);
        return l;
    }

    public LinearLayout row() {
        LinearLayout l = new LinearLayout(ctx);
        l.setOrientation(LinearLayout.HORIZONTAL);
        return l;
    }

    public View spacer(int h) {
        View v = new View(ctx);
        v.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, h));
        return v;
    }

    public View hspace(int w) {
        View v = new View(ctx);
        v.setLayoutParams(new LinearLayout.LayoutParams(w, 1));
        return v;
    }

    public LinearLayout.LayoutParams matchWrap() {
        return new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
    }

    public LinearLayout.LayoutParams matchWrap(int h) {
        return new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, h);
    }

    public LinearLayout.LayoutParams wrap() {
        return new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
    }

    /** Fills the remaining width of a row. */
    public LinearLayout.LayoutParams flex() {
        return new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f);
    }

    /** Fixed size in dp. */
    public LinearLayout.LayoutParams size(int wDp, int hDp) {
        return new LinearLayout.LayoutParams(dp(wDp), dp(hDp));
    }

    /** Wrap-content, vertically centred in a row. */
    public LinearLayout.LayoutParams centered() {
        LinearLayout.LayoutParams p = wrap();
        p.gravity = Gravity.CENTER_VERTICAL;
        return p;
    }

    public GradientDrawable shape(int fill, int radiusDp, boolean hairline) {
        GradientDrawable d = new GradientDrawable();
        d.setColor(fill);
        d.setCornerRadius(dp(radiusDp));
        if (hairline) {
            d.setStroke(hairline(), border);
        }
        return d;
    }

    /** Rounded fill with a custom 1dp stroke colour. */
    public GradientDrawable stroke(int fill, int radiusDp, int strokeColor) {
        GradientDrawable d = new GradientDrawable();
        d.setColor(fill);
        d.setCornerRadius(dp(radiusDp));
        d.setStroke(dp(1), strokeColor);
        return d;
    }

    public GradientDrawable circle(int fill) {
        GradientDrawable d = new GradientDrawable();
        d.setShape(GradientDrawable.OVAL);
        d.setColor(fill);
        return d;
    }

    /** Flat surface + hairline + press ripple. The standard interactive surface. */
    public void press(View v, int fill, int radiusDp, boolean hairline) {
        v.setBackground(new RippleDrawable(ColorStateList.valueOf(ripple),
                shape(fill, radiusDp, hairline), shape(0xFFFFFFFF, radiusDp, false)));
        v.setClickable(true);
    }

    /** Ripple over a fill with a coloured 1dp stroke (outline buttons). */
    public void pressStroke(View v, int fill, int radiusDp, int strokeColor) {
        v.setBackground(new RippleDrawable(ColorStateList.valueOf(ripple),
                stroke(fill, radiusDp, strokeColor), shape(0xFFFFFFFF, radiusDp, false)));
        v.setClickable(true);
    }

    /** Rectangular ripple for list rows living inside a clipped group card. */
    public void pressRow(View v) {
        v.setBackground(new RippleDrawable(ColorStateList.valueOf(ripple), null,
                new ColorDrawable(Color.WHITE)));
        v.setClickable(true);
    }

    /** Unbounded ripple (nav items, bare icon buttons). */
    public void pressBorderless(View v) {
        v.setBackground(new RippleDrawable(ColorStateList.valueOf(ripple), null, null));
        v.setClickable(true);
    }

    // ---- text ------------------------------------------------------------

    /** Legacy signature: medium=true renders the medium (500) weight. */
    public TextView text(String s, int sp, int color, boolean medium) {
        return text(s, sp, color, medium ? MEDIUM : REGULAR);
    }

    /** Text with an explicit weight: REGULAR, MEDIUM or BOLD. */
    public TextView text(String s, int sp, int color, int weight) {
        TextView t = new TextView(ctx);
        t.setText(s);
        t.setTextColor(color);
        t.setTextSize(TypedValue.COMPLEX_UNIT_SP, sp);
        t.setTypeface(weight == BOLD ? TF_BOLD : (weight == MEDIUM ? TF_MEDIUM : TF_REGULAR));
        return t;
    }

    /** Single line, ellipsized at the end. */
    public TextView oneLine(TextView t) {
        t.setSingleLine(true);
        t.setEllipsize(TextUtils.TruncateAt.END);
        return t;
    }

    /** Section header / dialog title. */
    public TextView title(String s) {
        return text(s, H2, ink, BOLD);
    }

    /** Field label / chip / status text. */
    public TextView label(String s) {
        return text(s, LABEL, inkSoft, MEDIUM);
    }

    /** Supporting text. */
    public TextView body(String s) {
        return text(s, BODY, inkSoft, REGULAR);
    }

    /** Timestamps, fine print. */
    public TextView caption(String s) {
        return text(s, CAPTION, inkFaint, REGULAR);
    }

    // ---- surfaces --------------------------------------------------------

    /** Standard card: flat surface + hairline, r14, 16dp padding. */
    public LinearLayout card() {
        LinearLayout l = col();
        l.setPadding(dp(16), dp(16), dp(16), dp(16));
        l.setBackground(shape(surface, 14, true));
        return l;
    }

    /** List group: card surface without padding, children clipped to the corners. */
    public LinearLayout group() {
        LinearLayout l = col();
        l.setBackground(shape(surface, 14, true));
        l.setClipToOutline(true);
        return l;
    }

    /** Hairline separator, inset from the start edge. */
    public View divider(int insetStartDp) {
        View v = new View(ctx);
        v.setBackgroundColor(border);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, hairline());
        lp.setMarginStart(dp(insetStartDp));
        v.setLayoutParams(lp);
        return v;
    }

    /** 4dp progress track (Quick setup). */
    public LinearLayout progress(int done, int total) {
        LinearLayout bar = row();
        bar.setBackground(shape(switchOff, 2, false));
        bar.setClipToOutline(true);
        float f = total <= 0 ? 0f : Math.max(0f, Math.min(1f, done / (float) total));
        View fill = new View(ctx);
        fill.setBackground(shape(primary, 2, false));
        bar.addView(fill, new LinearLayout.LayoutParams(0, dp(4), f <= 0f ? 0.0001f : f));
        bar.addView(new View(ctx), new LinearLayout.LayoutParams(0, dp(4),
                f >= 1f ? 0.0001f : 1f - f));
        return bar;
    }

    // ---- buttons ---------------------------------------------------------

    /** PRIMARY (filled) / OUTLINE (blue) / LINK (bare) / GHOST (neutral) / DANGER. 48dp. */
    public TextView button(String s, int kind, View.OnClickListener click) {
        TextView t = text(s, BTN, buttonInk(kind), MEDIUM);
        t.setGravity(Gravity.CENTER);
        t.setMinHeight(dp(48));
        t.setPadding(dp(16), dp(12), dp(16), dp(12));
        t.setSingleLine(true);
        t.setEllipsize(TextUtils.TruncateAt.END);
        styleButton(t, kind, true, 10);
        t.setOnClickListener(click);
        return t;
    }

    /** Compact 32dp button (Grant / Fix / Pair, sheet actions). */
    public TextView smallButton(String s, int kind, View.OnClickListener click) {
        TextView t = text(s, BODY, buttonInk(kind), MEDIUM);
        t.setGravity(Gravity.CENTER);
        t.setMinHeight(dp(32));
        t.setMinWidth(dp(60));
        t.setPadding(dp(14), dp(6), dp(14), dp(6));
        t.setSingleLine(true);
        styleButton(t, kind, true, 8);
        t.setOnClickListener(click);
        return t;
    }

    /** Disabled look (grey fill, faint ink) per the buttons board. */
    public void setButtonEnabled(TextView b, int kind, boolean enabled) {
        styleButton(b, kind, enabled, 10);
    }

    private int buttonInk(int kind) {
        switch (kind) {
            case PRIMARY: return onPrimary;
            case GHOST: return ink;
            case DANGER: return error;
            default: return primary;
        }
    }

    private void styleButton(TextView t, int kind, boolean enabled, int r) {
        t.setEnabled(enabled);
        if (!enabled) {
            t.setTextColor(inkFaint);
            t.setBackground(kind == LINK ? null : shape(disabled, r, false));
            return;
        }
        t.setTextColor(buttonInk(kind));
        switch (kind) {
            case PRIMARY: press(t, primary, r, false); break;
            case OUTLINE: pressStroke(t, 0x00000000, r, primary); break;
            case GHOST: press(t, surface, r, true); break;
            case DANGER: pressStroke(t, 0x00000000, r, error); break;
            default: t.setBackground(null); t.setClickable(true); break;
        }
    }

    /** Icon button: 44dp hit area around a glyph (top bar: bell / gear / back). */
    public LinearLayout iconButton(String name, int color, View.OnClickListener click) {
        LinearLayout b = row();
        b.setGravity(Gravity.CENTER);
        b.setPadding(dp(11), dp(11), dp(11), dp(11));
        b.addView(icon(name, color, 22));
        pressBorderless(b);
        b.setFocusable(true);
        b.setContentDescription(name);
        b.setOnClickListener(click);
        return b;
    }

    /** 40dp floating circle button (map: locate / recentre). */
    public LinearLayout roundButton(String name, View.OnClickListener click) {
        LinearLayout b = row();
        b.setGravity(Gravity.CENTER);
        b.setPadding(dp(10), dp(10), dp(10), dp(10));
        GradientDrawable c = circle(surface);
        c.setStroke(hairline(), border);
        b.setBackground(new RippleDrawable(ColorStateList.valueOf(ripple), c, null));
        b.setElevation(dp(3));
        b.addView(icon(name, ink, 20));
        b.setClickable(true);
        b.setFocusable(true);
        b.setContentDescription(name);
        b.setOnClickListener(click);
        return b;
    }

    // ---- chips & tags ----------------------------------------------------

    /** Pill chip. Pass fill=0 for the outline variant. */
    public LinearLayout chip(String s, int fill, int textColor) {
        LinearLayout c = row();
        c.setGravity(Gravity.CENTER_VERTICAL);
        c.setPadding(dp(12), dp(6), dp(12), dp(6));
        c.setBackground(shape(fill == 0 ? surface : fill, 999, fill == 0));
        TextView t = text(s, LABEL, textColor, MEDIUM);
        t.setTag("label");
        c.addView(t);
        return c;
    }

    /** Status chip: dot + label on a semantic tint (Online / Accepted / Skipped pills). */
    public LinearLayout statusChip(String s, int dotColor, int tint) {
        LinearLayout c = row();
        c.setGravity(Gravity.CENTER_VERTICAL);
        c.setPadding(dp(10), dp(5), dp(12), dp(5));
        c.setBackground(shape(tint, 999, false));
        View dot = new View(ctx);
        dot.setTag("dot");
        dot.setBackground(circle(dotColor));
        c.addView(dot, new LinearLayout.LayoutParams(dp(6), dp(6)));
        c.addView(hspace(dp(6)));
        TextView lbl = text(s, LABEL, dotColor, MEDIUM);
        lbl.setTag("label");
        c.addView(lbl);
        return c;
    }

    /** Hero chip: coloured dot + neutral label (the "Online" pill on the status card). */
    public LinearLayout dotChip(String s, int dotColor, int textColor, int fill) {
        LinearLayout c = row();
        c.setGravity(Gravity.CENTER_VERTICAL);
        c.setPadding(dp(9), dp(4), dp(11), dp(4));
        c.setBackground(shape(fill, 999, false));
        View dot = new View(ctx);
        dot.setTag("dot");
        dot.setBackground(circle(dotColor));
        c.addView(dot, new LinearLayout.LayoutParams(dp(7), dp(7)));
        c.addView(hspace(dp(6)));
        TextView lbl = text(s, LABEL, textColor, MEDIUM);
        lbl.setTag("label");
        c.addView(lbl);
        return c;
    }

    /** Update the label of a chip built by chip()/statusChip()/dotChip() (all tag it). */
    public void chipText(LinearLayout chip, String s) {
        View v = chip.findViewWithTag("label");
        if (v instanceof TextView) ((TextView) v).setText(s);
    }

    /** Update label + dot colour of a dotChip()/statusChip(). */
    public void dotChipSet(LinearLayout chip, String s, int dotColor) {
        chipText(chip, s);
        View d = chip.findViewWithTag("dot");
        if (d != null) d.setBackground(circle(dotColor));
    }

    /** Small r6 status tag used in activity rows ("Accepted" / "Skipped"). */
    public TextView tag(String s, int fill, int textColor) {
        TextView t = text(s, CAPTION, textColor, MEDIUM);
        t.setGravity(Gravity.CENTER);
        t.setPadding(dp(8), dp(3), dp(8), dp(4));
        t.setBackground(shape(fill, 6, false));
        return t;
    }

    // ---- feedback --------------------------------------------------------

    /** Semantic banner with a leading glyph (success / error / warning / info). */
    public TextView banner(String msg, int kind) {
        int fill, txt;
        String glyph;
        switch (kind) {
            case SUCCESS: fill = successTint; txt = success; glyph = "check_circle"; break;
            case ERROR:   fill = errorTint;   txt = error;   glyph = "x_circle"; break;
            case WARNING: fill = warningTint; txt = warning; glyph = "alert"; break;
            default:      fill = primaryTint; txt = primaryInk; glyph = "info"; break;
        }
        TextView t = text(msg, BODY, txt, MEDIUM);
        t.setGravity(Gravity.CENTER_VERTICAL);
        t.setPadding(dp(14), dp(12), dp(14), dp(12));
        t.setBackground(shape(fill, 10, false));
        t.setCompoundDrawablesRelativeWithIntrinsicBounds(iconDrawable(glyph, txt, 18),
                null, null, null);
        t.setCompoundDrawablePadding(dp(10));
        return t;
    }

    // ---- inputs ----------------------------------------------------------

    /** Styled text field (r10 well + hairline, 48dp). Mono for codes/keys. */
    public EditText field(String hint, boolean mono) {
        EditText e = new EditText(ctx);
        e.setHint(hint);
        e.setHintTextColor(inkFaint);
        e.setTextColor(ink);
        e.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
        e.setTypeface(mono ? Typeface.MONOSPACE : TF_REGULAR);
        e.setBackground(shape(fieldFill, 10, true));
        e.setPadding(dp(14), dp(12), dp(14), dp(12));
        e.setMinHeight(dp(48));
        e.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        e.setSingleLine(true);
        e.setHighlightColor(alpha(primary, 0x55));
        if (Build.VERSION.SDK_INT >= 29) {
            GradientDrawable cur = new GradientDrawable();
            cur.setColor(primary);
            cur.setSize(dp(2), dp(20));
            e.setTextCursorDrawable(cur);
        }
        return e;
    }

    /** Search field: field + leading search glyph, IME action = search. */
    public EditText searchField(String hint) {
        EditText e = field(hint, false);
        e.setCompoundDrawablesRelativeWithIntrinsicBounds(iconDrawable("search", inkFaint, 18),
                null, null, null);
        e.setCompoundDrawablePadding(dp(10));
        e.setImeOptions(EditorInfo.IME_ACTION_SEARCH);
        return e;
    }

    // ---- icons -----------------------------------------------------------

    /** 34dp icon tile: filled r9 square + 18dp glyph (quick-setup rows). */
    public LinearLayout iconTile(String icon, int tileFill, int iconColor) {
        LinearLayout t = row();
        t.setGravity(Gravity.CENTER);
        t.setPadding(dp(8), dp(8), dp(8), dp(8));
        boolean neutral = tileFill == surface || tileFill == surfaceHigh || tileFill == bg;
        t.setBackground(shape(tileFill, 9, neutral));
        t.addView(icon(icon, iconColor, 18));
        return t;
    }

    public IconView icon(String name, int color, int sizeDp) {
        IconView v = new IconView(ctx);
        v.set(name, color, dp(sizeDp));
        return v;
    }

    /** Same glyphs as a Drawable (compound drawables on TextView / EditText). */
    public IconDrawable iconDrawable(String name, int color, int sizeDp) {
        return new IconDrawable(name, color, dp(sizeDp));
    }

    // ---- controls --------------------------------------------------------

    /** 46x28dp animated toggle (primary when on). */
    public ToggleSwitch toggle() {
        return new ToggleSwitch(this);
    }

    /** 20dp radio dot for pickers. */
    public RadioDot radio(boolean on) {
        RadioDot r = new RadioDot(this);
        r.set(on);
        return r;
    }

    /** Range slider factory (two thumbs). */
    public RangeSlider rangeSlider() {
        return new RangeSlider(this);
    }

    /** Single-thumb slider factory (map radius). */
    public Slider slider() {
        return new Slider(this);
    }

    /** Stylised map thumbnail for saved areas. */
    public MapThumb mapThumb(long seed, boolean avoid) {
        MapThumb m = new MapThumb(this);
        m.set(seed, avoid);
        return m;
    }

    // ---- shared slider painting -----------------------------------------

    void drawTrack(Canvas c, Paint p, float x0, float x1, float cy, int color) {
        float h = dp(2);
        p.setStyle(Paint.Style.FILL);
        p.setColor(color);
        c.drawRoundRect(new RectF(x0, cy - h, x1, cy + h), h, h, p);
    }

    void drawThumb(Canvas c, Paint p, float x, float cy) {
        p.setStyle(Paint.Style.FILL);
        if (dark) {
            p.setColor(0xFFFFFFFF);
            c.drawCircle(x, cy, dp(9), p);
        } else {
            p.setColor(border);
            c.drawCircle(x, cy, dp(10) + hairline(), p);
            p.setColor(0xFFFFFFFF);
            c.drawCircle(x, cy, dp(10), p);
            p.setColor(primary);
            c.drawCircle(x, cy, dp(6.5f), p);
        }
    }

    // =====================================================================
    // Views
    // =====================================================================

    public static final class ToggleSwitch extends View {
        private final Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);
        private final RectF trk = new RectF();
        private final Ui ui;
        private boolean on;
        private float pos;
        private ValueAnimator anim;

        ToggleSwitch(Ui ui) {
            super(ui.ctx);
            this.ui = ui;
        }

        /** Animated change (jumps without animation while not yet on screen). */
        public void show(boolean v) {
            on = v;
            if (anim != null) anim.cancel();
            if (!isAttachedToWindow()) {
                pos = v ? 1f : 0f;
                invalidate();
                return;
            }
            anim = ValueAnimator.ofFloat(pos, v ? 1f : 0f);
            anim.setDuration(160);
            anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override public void onAnimationUpdate(ValueAnimator an) {
                    pos = (Float) an.getAnimatedValue();
                    invalidate();
                }
            });
            anim.start();
        }

        /** Immediate change, no animation. */
        public void set(boolean v) {
            if (anim != null) anim.cancel();
            on = v;
            pos = v ? 1f : 0f;
            invalidate();
        }

        public boolean isOn() {
            return on;
        }

        @Override protected void onMeasure(int ws, int hs) {
            setMeasuredDimension(ui.dp(46), ui.dp(28));
        }

        @Override protected void onDraw(Canvas canvas) {
            float w = getWidth(), h = getHeight(), r = h / 2f;
            trk.set(0, 0, w, h);
            p.setStyle(Paint.Style.FILL);
            p.setColor((Integer) ARGB.evaluate(pos, ui.switchOff, ui.primary));
            canvas.drawRoundRect(trk, r, r, p);
            float kr = r - ui.dp(3);
            float kx = r + (w - 2 * r) * pos;
            if (!ui.dark) {
                p.setColor(0x1F000000);
                canvas.drawCircle(kx, r + ui.dp(0.5f), kr + ui.dp(0.5f), p);
            }
            p.setColor(ui.switchKnob);
            canvas.drawCircle(kx, r, kr, p);
        }
    }

    public static final class RadioDot extends View {
        private final Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);
        private final Ui ui;
        private boolean on;

        RadioDot(Ui ui) {
            super(ui.ctx);
            this.ui = ui;
        }

        public void set(boolean v) {
            on = v;
            invalidate();
        }

        public boolean isOn() {
            return on;
        }

        @Override protected void onMeasure(int ws, int hs) {
            setMeasuredDimension(ui.dp(20), ui.dp(20));
        }

        @Override protected void onDraw(Canvas c) {
            float cx = getWidth() / 2f, cy = getHeight() / 2f;
            p.setStyle(Paint.Style.STROKE);
            p.setStrokeWidth(ui.dp(1.8f));
            p.setColor(on ? ui.primary : ui.inkFaint);
            c.drawCircle(cx, cy, cx - ui.dp(1.5f), p);
            if (on) {
                p.setStyle(Paint.Style.FILL);
                c.drawCircle(cx, cy, ui.dp(5), p);
            }
        }
    }

    /** Dual-thumb range slider (Filters). Build one with ui.rangeSlider(). */
    public static final class RangeSlider extends View {
        public interface OnRange { void changed(float lo, float hi); }
        private final Ui ui;
        private final Paint tp = new Paint(Paint.ANTI_ALIAS_FLAG);
        private float min, max = 100, lo, hi, step;
        private int drag;
        private OnRange cb;

        public RangeSlider(Ui ui) {
            super(ui.ctx);
            this.ui = ui;
        }

        public void set(float mn, float mx, float l, float h) {
            min = mn; max = mx;
            lo = Math.max(mn, Math.min(l, mx));
            hi = Math.max(lo, Math.min(h, mx));
            invalidate();
        }

        /** Snap values to multiples of step (0 = continuous). */
        public void step(float s) { step = s; }

        public void on(OnRange c) { cb = c; }

        public float lo() { return lo; }

        public float hi() { return hi; }

        @Override protected void onMeasure(int ws, int hs) {
            setMeasuredDimension(MeasureSpec.getSize(ws), ui.dp(32));
        }

        private float thumb(float v, float w) {
            float r = ui.dp(10), t = w - 2 * r;
            return r + (max > min ? t * (v - min) / (max - min) : 0);
        }

        private float snap(float v) {
            if (step > 0) v = min + Math.round((v - min) / step) * step;
            return Math.max(min, Math.min(max, v));
        }

        @Override protected void onDraw(Canvas canvas) {
            float w = getWidth(), cy = getHeight() / 2f, r = ui.dp(10);
            float x0 = thumb(lo, w), x1 = thumb(hi, w);
            ui.drawTrack(canvas, tp, r, w - r, cy, ui.switchOff);
            ui.drawTrack(canvas, tp, x0, x1, cy, ui.primary);
            ui.drawThumb(canvas, tp, x0, cy);
            ui.drawThumb(canvas, tp, x1, cy);
        }

        @Override public boolean onTouchEvent(MotionEvent e) {
            float x = e.getX(), w = getWidth();
            int a = e.getActionMasked();
            if (a == MotionEvent.ACTION_DOWN) {
                float dl = Math.abs(x - thumb(lo, w)), dh = Math.abs(x - thumb(hi, w));
                if (Math.abs(dl - dh) < 1f) drag = x > thumb(lo, w) ? 2 : 1;
                else drag = dl < dh ? 1 : 2;
                if (getParent() != null) getParent().requestDisallowInterceptTouchEvent(true);
                move(x, w);
            } else if (a == MotionEvent.ACTION_MOVE && drag != 0) {
                move(x, w);
            } else if (a == MotionEvent.ACTION_UP || a == MotionEvent.ACTION_CANCEL) {
                drag = 0;
                if (getParent() != null) getParent().requestDisallowInterceptTouchEvent(false);
            }
            return true;
        }

        private void move(float x, float w) {
            float r = ui.dp(10), t = w - 2 * r;
            float f = t <= 0 ? 0 : (x - r) / t;
            f = Math.max(0f, Math.min(1f, f));
            float v = snap(min + f * (max - min));
            float pl = lo, ph = hi;
            if (drag == 1) lo = Math.min(v, hi); else hi = Math.max(v, lo);
            if (pl != lo || ph != hi) {
                invalidate();
                if (cb != null) cb.changed(lo, hi);
            }
        }
    }

    /** Single-thumb slider (map radius). */
    public static final class Slider extends View {
        public interface OnValue { void changed(float v); }
        private final Ui ui;
        private final Paint tp = new Paint(Paint.ANTI_ALIAS_FLAG);
        private float min, max = 100, step, value;
        private OnValue cb;

        public Slider(Ui ui) {
            super(ui.ctx);
            this.ui = ui;
        }

        public void set(float mn, float mx, float st, float v) {
            min = mn; max = mx; step = st;
            value = Math.max(mn, Math.min(v, mx));
            invalidate();
        }

        public void on(OnValue c) { cb = c; }

        public float value() { return value; }

        @Override protected void onMeasure(int ws, int hs) {
            setMeasuredDimension(MeasureSpec.getSize(ws), ui.dp(32));
        }

        private float pos(float v, float w) {
            float r = ui.dp(10), t = w - 2 * r;
            return r + (max > min ? t * (v - min) / (max - min) : 0);
        }

        @Override protected void onDraw(Canvas canvas) {
            float w = getWidth(), cy = getHeight() / 2f, r = ui.dp(10);
            float x = pos(value, w);
            ui.drawTrack(canvas, tp, r, w - r, cy, ui.switchOff);
            ui.drawTrack(canvas, tp, r, x, cy, ui.primary);
            ui.drawThumb(canvas, tp, x, cy);
        }

        @Override public boolean onTouchEvent(MotionEvent e) {
            int a = e.getActionMasked();
            if (a == MotionEvent.ACTION_DOWN || a == MotionEvent.ACTION_MOVE) {
                if (a == MotionEvent.ACTION_DOWN && getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                float w = getWidth(), r = ui.dp(10), t = w - 2 * r;
                float f = t <= 0 ? 0 : (e.getX() - r) / t;
                f = Math.max(0f, Math.min(1f, f));
                float v = min + f * (max - min);
                if (step > 0) v = min + Math.round((v - min) / step) * step;
                v = Math.max(min, Math.min(max, v));
                if (v != value) {
                    value = v;
                    invalidate();
                    if (cb != null) cb.changed(v);
                }
            } else if (a == MotionEvent.ACTION_UP || a == MotionEvent.ACTION_CANCEL) {
                if (getParent() != null) getParent().requestDisallowInterceptTouchEvent(false);
            }
            return true;
        }
    }

    /** Stylised map tile: land, a few roads, radius circle and pin (zone rows). */
    public static final class MapThumb extends View {
        private final Ui ui;
        private final Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);
        private final Path clip = new Path();
        private final RectF rf = new RectF();
        private long seed;
        private boolean avoid;

        MapThumb(Ui ui) {
            super(ui.ctx);
            this.ui = ui;
        }

        public void set(long seed, boolean avoid) {
            this.seed = seed;
            this.avoid = avoid;
            invalidate();
        }

        @Override protected void onDraw(Canvas c) {
            float w = getWidth(), h = getHeight(), r = ui.dp(10);
            rf.set(0, 0, w, h);
            clip.reset();
            clip.addRoundRect(rf, r, r, Path.Direction.CW);
            c.save();
            c.clipPath(clip);
            c.drawColor(ui.mapLand);
            java.util.Random rnd = new java.util.Random(seed);
            p.setStyle(Paint.Style.FILL);
            p.setColor(ui.mapWater);
            c.drawCircle(w * (0.05f + 0.3f * rnd.nextFloat()), h * (0.9f + 0.2f * rnd.nextFloat()),
                    h * 0.45f, p);
            p.setStyle(Paint.Style.STROKE);
            p.setStrokeCap(Paint.Cap.ROUND);
            p.setColor(ui.mapRoad);
            for (int i = 0; i < 3; i++) {
                p.setStrokeWidth(ui.dp(i == 0 ? 3 : 2));
                float y = h * (0.15f + 0.7f * rnd.nextFloat());
                c.drawLine(-4, y, w + 4, y + h * (rnd.nextFloat() - 0.5f) * 0.6f, p);
            }
            for (int i = 0; i < 2; i++) {
                p.setStrokeWidth(ui.dp(2));
                float x = w * (0.15f + 0.7f * rnd.nextFloat());
                c.drawLine(x, -4, x + w * (rnd.nextFloat() - 0.5f) * 0.4f, h + 4, p);
            }
            int acc = avoid ? ui.error : ui.primary;
            float cx = w / 2f, cy = h / 2f + ui.dp(2), rad = Math.min(w, h) * 0.38f;
            p.setStyle(Paint.Style.FILL);
            p.setColor(alpha(acc, 0x38));
            c.drawCircle(cx, cy, rad, p);
            p.setStyle(Paint.Style.STROKE);
            p.setStrokeWidth(ui.dp(1));
            p.setColor(alpha(acc, 0xB0));
            c.drawCircle(cx, cy, rad, p);
            // pin: tip on the centre
            float s = ui.dp(5.5f);
            Path pin = new Path();
            pin.moveTo(cx, cy);
            pin.lineTo(cx - s * 0.8f, cy - s * 1.35f);
            pin.lineTo(cx + s * 0.8f, cy - s * 1.35f);
            pin.close();
            pin.addCircle(cx, cy - s * 1.75f, s, Path.Direction.CW);
            p.setStyle(Paint.Style.FILL);
            p.setColor(acc);
            c.drawPath(pin, p);
            p.setColor(0xFFFFFFFF);
            c.drawCircle(cx, cy - s * 1.75f, s * 0.42f, p);
            c.restore();
            p.setStyle(Paint.Style.STROKE);
            p.setStrokeWidth(ui.hairline());
            p.setColor(ui.border);
            float hl = ui.hairline() / 2f;
            rf.set(hl, hl, w - hl, h - hl);
            c.drawRoundRect(rf, r, r, p);
        }
    }

    public static final class IconView extends View {
        private final Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);
        private String name = "";
        private int color;
        private int size;

        IconView(Context c) {
            super(c);
        }

        public void set(String n, int c, int sizePx) {
            boolean resize = sizePx != size;
            name = n;
            color = c;
            size = sizePx;
            if (resize) requestLayout();
            invalidate();
        }

        @Override protected void onMeasure(int ws, int hs) {
            setMeasuredDimension(size, size);
        }

        @Override protected void onDraw(Canvas canvas) {
            float s = size / 24f;
            canvas.save();
            canvas.scale(s, s);
            p.setColor(color);
            glyph(canvas, p, name);
            canvas.restore();
        }
    }

    public static final class IconDrawable extends Drawable {
        private final Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);
        private final String name;
        private final int size;

        IconDrawable(String name, int color, int sizePx) {
            this.name = name;
            this.size = sizePx;
            p.setColor(color);
        }

        @Override public void draw(Canvas c) {
            Rect b = getBounds();
            c.save();
            c.translate(b.left, b.top);
            float s = Math.min(b.width(), b.height()) / 24f;
            c.scale(s, s);
            glyph(c, p, name);
            c.restore();
        }

        @Override public int getIntrinsicWidth() { return size; }

        @Override public int getIntrinsicHeight() { return size; }

        @Override public void setAlpha(int a) {
            p.setAlpha(a);
            invalidateSelf();
        }

        @Override public void setColorFilter(ColorFilter cf) {
            p.setColorFilter(cf);
            invalidateSelf();
        }

        @Override public int getOpacity() { return PixelFormat.TRANSLUCENT; }
    }

    // =====================================================================
    // Glyphs: 24-unit grid, 1.8 stroke, round caps (matches the mock icon set)
    // =====================================================================

    static void glyph(Canvas canvas, Paint p, String name) {
        if (name == null) return;
        p.setStyle(Paint.Style.STROKE);
        p.setStrokeWidth(1.8f);
        p.setStrokeCap(Paint.Cap.ROUND);
        p.setStrokeJoin(Paint.Join.ROUND);
        Path g = new Path();
        switch (name) {
            case "check":
                g.moveTo(4.5f, 12.5f); g.lineTo(9.5f, 17.5f); g.lineTo(19.5f, 7f);
                break;
            case "close":
                g.moveTo(6, 6); g.lineTo(18, 18); g.moveTo(18, 6); g.lineTo(6, 18);
                break;
            case "chevron":
                g.moveTo(9.5f, 5.5f); g.lineTo(16, 12); g.lineTo(9.5f, 18.5f);
                break;
            case "chevron_down":
                g.moveTo(6, 9.5f); g.lineTo(12, 15.5f); g.lineTo(18, 9.5f);
                break;
            case "back":
                g.moveTo(19.5f, 12); g.lineTo(4.5f, 12);
                g.moveTo(10.5f, 5.5f); g.lineTo(4.5f, 12); g.lineTo(10.5f, 18.5f);
                break;
            case "plus":
                g.moveTo(12, 5); g.lineTo(12, 19); g.moveTo(5, 12); g.lineTo(19, 12);
                break;
            case "copy":
                g.addRoundRect(new RectF(8, 8, 20, 20), 2, 2, Path.Direction.CW);
                g.moveTo(5, 16); g.lineTo(5, 4); g.lineTo(17, 4);
                break;
            case "search":
                g.addCircle(10.5f, 10.5f, 6, Path.Direction.CW);
                g.moveTo(15, 15); g.lineTo(20.5f, 20.5f);
                break;
            case "shield":
                g.moveTo(12, 3); g.lineTo(20, 6); g.lineTo(20, 12);
                g.cubicTo(20, 16.5f, 16.5f, 19.8f, 12, 21);
                g.cubicTo(7.5f, 19.8f, 4, 16.5f, 4, 12);
                g.lineTo(4, 6); g.close();
                break;
            case "lock":
                g.addRoundRect(new RectF(5, 11, 19, 20), 2, 2, Path.Direction.CW);
                g.moveTo(8.5f, 11); g.lineTo(8.5f, 8);
                g.arcTo(new RectF(8.5f, 4.5f, 15.5f, 11.5f), 180, 180, false);
                g.lineTo(15.5f, 11);
                break;
            case "key":
                g.addCircle(8, 15.5f, 3.5f, Path.Direction.CW);
                g.moveTo(10.5f, 13); g.lineTo(20, 3.5f);
                g.moveTo(16, 7); g.lineTo(18.5f, 9.5f);
                break;
            case "bell":
                g.moveTo(6.5f, 16.5f); g.lineTo(6.5f, 10.5f);
                g.arcTo(new RectF(6.5f, 4.5f, 17.5f, 15.5f), 180, 180, false);
                g.lineTo(17.5f, 16.5f);
                g.moveTo(4.5f, 16.5f); g.lineTo(19.5f, 16.5f);
                g.moveTo(10, 19.5f); g.lineTo(14, 19.5f);
                break;
            case "gear": {
                // cog: 8 teeth on a ring with a hollow hub
                float rIn = 6.4f, rOut = 9.2f;
                for (int i = 0; i < 8; i++) {
                    double c = Math.PI / 4 * i;
                    double a0 = c - 0.20, a1 = c + 0.20, b1 = c + Math.PI / 4 - 0.20;
                    float x0 = (float) (12 + rOut * Math.cos(a0)), y0 = (float) (12 + rOut * Math.sin(a0));
                    float x1 = (float) (12 + rOut * Math.cos(a1)), y1 = (float) (12 + rOut * Math.sin(a1));
                    float x2 = (float) (12 + rIn * Math.cos(a1)), y2 = (float) (12 + rIn * Math.sin(a1));
                    float x3 = (float) (12 + rIn * Math.cos(b1)), y3 = (float) (12 + rIn * Math.sin(b1));
                    if (i == 0) g.moveTo(x0, y0); else g.lineTo(x0, y0);
                    g.lineTo(x1, y1);
                    g.lineTo(x2, y2);
                    g.lineTo(x3, y3);
                }
                g.close();
                g.addCircle(12, 12, 2.8f, Path.Direction.CW);
                break;
            }
            case "home":
                g.moveTo(4, 11); g.lineTo(12, 4); g.lineTo(20, 11);
                g.moveTo(6.5f, 9.5f); g.lineTo(6.5f, 20); g.lineTo(17.5f, 20); g.lineTo(17.5f, 9.5f);
                g.moveTo(10, 20); g.lineTo(10, 15); g.lineTo(14, 15); g.lineTo(14, 20);
                break;
            case "filter":
                g.moveTo(4, 5); g.lineTo(20, 5); g.lineTo(14, 12.5f); g.lineTo(14, 18.5f);
                g.lineTo(10, 20.5f); g.lineTo(10, 12.5f); g.close();
                break;
            case "sliders":
                g.moveTo(4, 7); g.lineTo(20, 7); g.moveTo(4, 12); g.lineTo(20, 12);
                g.moveTo(4, 17); g.lineTo(20, 17);
                canvas.drawPath(g, p);
                p.setStyle(Paint.Style.FILL);
                canvas.drawCircle(9, 7, 2.4f, p);
                canvas.drawCircle(15, 12, 2.4f, p);
                canvas.drawCircle(8, 17, 2.4f, p);
                return;
            case "apps":
                g.addRoundRect(new RectF(4, 4, 10.5f, 10.5f), 2, 2, Path.Direction.CW);
                g.addRoundRect(new RectF(13.5f, 4, 20, 10.5f), 2, 2, Path.Direction.CW);
                g.addRoundRect(new RectF(4, 13.5f, 10.5f, 20), 2, 2, Path.Direction.CW);
                g.addRoundRect(new RectF(13.5f, 13.5f, 20, 20), 2, 2, Path.Direction.CW);
                break;
            case "history":
            case "clock":
                g.addCircle(12, 12, 8.5f, Path.Direction.CW);
                g.moveTo(12, 12); g.lineTo(12, 7.5f);
                g.moveTo(12, 12); g.lineTo(15.5f, 14);
                break;
            case "pin":
                g.moveTo(12, 21);
                g.cubicTo(12, 21, 5.5f, 14.5f, 5.5f, 9.5f);
                g.arcTo(new RectF(5.5f, 3, 18.5f, 16), 180, 180, false);
                g.cubicTo(18.5f, 14.5f, 12, 21, 12, 21);
                g.addCircle(12, 9.5f, 2.5f, Path.Direction.CW);
                break;
            case "alert":
                g.moveTo(12, 4); g.lineTo(21, 20); g.lineTo(3, 20); g.close();
                g.moveTo(12, 10); g.lineTo(12, 14.5f);
                canvas.drawPath(g, p);
                p.setStyle(Paint.Style.FILL);
                canvas.drawCircle(12, 17.3f, 1.2f, p);
                return;
            case "doc":
                g.moveTo(6, 3); g.lineTo(15, 3); g.lineTo(18, 6); g.lineTo(18, 21); g.lineTo(6, 21); g.close();
                g.moveTo(9, 11); g.lineTo(15, 11); g.moveTo(9, 15); g.lineTo(15, 15);
                break;
            case "moon": {
                Path a = new Path();
                a.addCircle(11.5f, 12.5f, 8, Path.Direction.CW);
                Path b = new Path();
                b.addCircle(16.5f, 7.5f, 6.5f, Path.Direction.CW);
                a.op(b, Path.Op.DIFFERENCE);
                p.setStyle(Paint.Style.FILL);
                canvas.drawPath(a, p);
                return;
            }
            case "sun":
                g.addCircle(12, 12, 4, Path.Direction.CW);
                for (int i = 0; i < 8; i++) {
                    double a = Math.PI / 4 * i;
                    g.moveTo((float) (12 + 6.5 * Math.cos(a)), (float) (12 + 6.5 * Math.sin(a)));
                    g.lineTo((float) (12 + 9 * Math.cos(a)), (float) (12 + 9 * Math.sin(a)));
                }
                break;
            case "globe":
                g.addCircle(12, 12, 8.5f, Path.Direction.CW);
                g.addOval(new RectF(8, 3.5f, 16, 20.5f), Path.Direction.CW);
                g.moveTo(3.5f, 12); g.lineTo(20.5f, 12);
                break;
            case "power":
                g.moveTo(12, 3); g.lineTo(12, 11.5f);
                g.addArc(new RectF(5, 5.5f, 19, 19.5f), -60, 300);
                break;
            case "star":
                g.moveTo(12, 3); g.lineTo(14.6f, 9); g.lineTo(21, 9.6f);
                g.lineTo(16.2f, 13.9f); g.lineTo(17.7f, 20.3f);
                g.lineTo(12, 16.9f); g.lineTo(6.3f, 20.3f);
                g.lineTo(7.8f, 13.9f); g.lineTo(3, 9.6f);
                g.lineTo(9.4f, 9); g.close();
                break;
            case "logo":
                // AcceptPro mark: a bold "A" with a slanted speed bar
                p.setStyle(Paint.Style.FILL);
                g.moveTo(10.2f, 2.5f); g.lineTo(14.2f, 2.5f); g.lineTo(22.5f, 21.5f);
                g.lineTo(18.2f, 21.5f); g.lineTo(12.2f, 7.6f); g.lineTo(6f, 21.5f);
                g.lineTo(1.5f, 21.5f); g.close();
                g.moveTo(7.6f, 13.2f); g.lineTo(19.6f, 13.2f); g.lineTo(18.4f, 16.2f);
                g.lineTo(6.3f, 16.2f); g.close();
                break;
            case "bolt":
                g.moveTo(13.5f, 2.5f); g.lineTo(5, 13.5f); g.lineTo(11.5f, 13.5f);
                g.lineTo(10.5f, 21.5f); g.lineTo(19, 10.5f); g.lineTo(12.5f, 10.5f); g.close();
                break;
            case "eye":
            case "eye_off":
                g.moveTo(2.5f, 12); g.quadTo(12, 2.5f, 21.5f, 12); g.quadTo(12, 21.5f, 2.5f, 12); g.close();
                g.addCircle(12, 12, 3, Path.Direction.CW);
                if ("eye_off".equals(name)) { g.moveTo(4, 4); g.lineTo(20, 20); }
                break;
            case "target":
                g.addCircle(12, 12, 7, Path.Direction.CW);
                g.moveTo(12, 2.5f); g.lineTo(12, 5); g.moveTo(12, 19); g.lineTo(12, 21.5f);
                g.moveTo(2.5f, 12); g.lineTo(5, 12); g.moveTo(19, 12); g.lineTo(21.5f, 12);
                canvas.drawPath(g, p);
                p.setStyle(Paint.Style.FILL);
                canvas.drawCircle(12, 12, 2.5f, p);
                return;
            case "navigate":
                g.moveTo(20, 4); g.lineTo(3.5f, 11); g.lineTo(11, 13); g.lineTo(13, 20.5f); g.close();
                break;
            case "battery":
                g.addRoundRect(new RectF(3, 7.5f, 18.5f, 16.5f), 2.2f, 2.2f, Path.Direction.CW);
                g.moveTo(21, 10.5f); g.lineTo(21, 13.5f);
                canvas.drawPath(g, p);
                p.setStyle(Paint.Style.FILL);
                canvas.drawRoundRect(new RectF(5.5f, 10, 11, 14), 1, 1, p);
                return;
            case "overlay":
                g.addCircle(12, 12, 8.5f, Path.Direction.CW);
                g.addCircle(12, 12, 4.5f, Path.Direction.CW);
                canvas.drawPath(g, p);
                p.setStyle(Paint.Style.FILL);
                canvas.drawCircle(12, 12, 1.6f, p);
                return;
            case "a11y":
                g.moveTo(5, 9); g.lineTo(19, 9); g.moveTo(12, 9); g.lineTo(12, 14);
                g.lineTo(8.5f, 20.5f); g.moveTo(12, 14); g.lineTo(15.5f, 20.5f);
                canvas.drawPath(g, p);
                p.setStyle(Paint.Style.FILL);
                canvas.drawCircle(12, 5, 1.9f, p);
                return;
            case "hexagon":
                for (int i = 0; i < 6; i++) {
                    double a = Math.PI / 3 * i - Math.PI / 2;
                    float x = (float) (12 + 8.5 * Math.cos(a)), y = (float) (12 + 8.5 * Math.sin(a));
                    if (i == 0) g.moveTo(x, y); else g.lineTo(x, y);
                }
                g.close();
                g.addCircle(12, 12, 3, Path.Direction.CW);
                break;
            case "contrast": {
                g.addCircle(12, 12, 8.5f, Path.Direction.CW);
                canvas.drawPath(g, p);
                Path h = new Path();
                h.moveTo(12, 3.5f);
                h.arcTo(new RectF(3.5f, 3.5f, 20.5f, 20.5f), -90, 180, false);
                h.close();
                p.setStyle(Paint.Style.FILL);
                canvas.drawPath(h, p);
                return;
            }
            case "timer":
                g.addCircle(12, 13.5f, 7.5f, Path.Direction.CW);
                g.moveTo(12, 13.5f); g.lineTo(12, 10);
                g.moveTo(10, 3); g.lineTo(14, 3); g.moveTo(12, 3); g.lineTo(12, 6);
                break;
            case "letter":
                g.moveTo(5, 19.5f); g.lineTo(12, 4.5f); g.lineTo(19, 19.5f);
                g.moveTo(7.6f, 14); g.lineTo(16.4f, 14);
                break;
            case "send":
                g.moveTo(21, 3.5f); g.lineTo(3, 10.5f); g.lineTo(10, 13.8f); g.lineTo(13.5f, 20.5f); g.close();
                g.moveTo(21, 3.5f); g.lineTo(10, 13.8f);
                break;
            case "chat":
                g.addArc(new RectF(3.5f, 3.5f, 20.5f, 20.5f), 150, 330);
                g.lineTo(3.5f, 20.5f);
                g.lineTo(4.64f, 16.25f);
                break;
            case "phone":
                g.addRoundRect(new RectF(7, 2.5f, 17, 21.5f), 2.5f, 2.5f, Path.Direction.CW);
                g.moveTo(10.5f, 18.5f); g.lineTo(13.5f, 18.5f);
                break;
            case "more":
                p.setStyle(Paint.Style.FILL);
                canvas.drawCircle(12, 5.5f, 1.7f, p);
                canvas.drawCircle(12, 12, 1.7f, p);
                canvas.drawCircle(12, 18.5f, 1.7f, p);
                return;
            case "trash":
                g.moveTo(4, 6.5f); g.lineTo(20, 6.5f);
                g.moveTo(9.5f, 6.5f); g.lineTo(9.5f, 4); g.lineTo(14.5f, 4); g.lineTo(14.5f, 6.5f);
                g.moveTo(6, 6.5f); g.lineTo(7, 20.5f); g.lineTo(17, 20.5f); g.lineTo(18, 6.5f);
                g.moveTo(10, 10.5f); g.lineTo(10, 16.5f); g.moveTo(14, 10.5f); g.lineTo(14, 16.5f);
                break;
            case "check_circle":
                g.addCircle(12, 12, 9, Path.Direction.CW);
                g.moveTo(8, 12.3f); g.lineTo(10.8f, 15); g.lineTo(16, 9.3f);
                break;
            case "x_circle":
                g.addCircle(12, 12, 9, Path.Direction.CW);
                g.moveTo(9, 9); g.lineTo(15, 15); g.moveTo(15, 9); g.lineTo(9, 15);
                break;
            case "info":
                g.addCircle(12, 12, 9, Path.Direction.CW);
                g.moveTo(12, 11); g.lineTo(12, 16.5f);
                canvas.drawPath(g, p);
                p.setStyle(Paint.Style.FILL);
                canvas.drawCircle(12, 7.8f, 1.2f, p);
                return;
            case "loader":
                g.addArc(new RectF(4, 4, 20, 20), -90, 270);
                break;
            case "car":
                g.addRoundRect(new RectF(3, 10.5f, 21, 17), 2.5f, 2.5f, Path.Direction.CW);
                g.moveTo(5.5f, 10.5f); g.lineTo(7.8f, 5.5f); g.lineTo(16.2f, 5.5f); g.lineTo(18.5f, 10.5f);
                g.addCircle(7.5f, 17, 2, Path.Direction.CW);
                g.addCircle(16.5f, 17, 2, Path.Direction.CW);
                break;
            case "map":
                g.moveTo(3, 6.5f); g.lineTo(9, 4); g.lineTo(15, 6.5f); g.lineTo(21, 4);
                g.lineTo(21, 17.5f); g.lineTo(15, 20); g.lineTo(9, 17.5f); g.lineTo(3, 20); g.close();
                g.moveTo(9, 4); g.lineTo(9, 17.5f); g.moveTo(15, 6.5f); g.lineTo(15, 20);
                break;
            case "code":
                g.moveTo(8.5f, 7); g.lineTo(3.5f, 12); g.lineTo(8.5f, 17);
                g.moveTo(15.5f, 7); g.lineTo(20.5f, 12); g.lineTo(15.5f, 17);
                break;
            default:
                return;
        }
        canvas.drawPath(g, p);
    }
}