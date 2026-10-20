package com.ride.accepter.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.InputType;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * AcceptPro design kit - the ONLY place visual values live.
 *
 * Tokens, type scale and components are codified from the approved mockups in
 * docs/DESIGN_SYSTEM.md. Screens compose these builders and never hardcode a
 * color, radius or text size. Flat fills + 1dp hairlines + integer sp sizes:
 * crisp, sharp, no gradients.
 */
public final class Ui {

    // ---- type scale (integer sp only - crisp text rendering) -------------
    public static final int DISPLAY = 24;
    public static final int H1 = 20;
    public static final int H2 = 16;
    public static final int ROW = 15;
    public static final int BTN = 15;
    public static final int BODY = 13;
    public static final int LABEL = 12;
    public static final int CAPTION = 11;

    // ---- button kinds ----------------------------------------------------
    public static final int PRIMARY = 0;
    public static final int OUTLINE = 1;
    public static final int LINK = 2;

    // ---- banner kinds ----------------------------------------------------
    public static final int SUCCESS = 0;
    public static final int ERROR = 1;
    public static final int WARNING = 2;
    public static final int INFO = 3;

    // ---- tokens (docs/DESIGN_SYSTEM.md section 1) ------------------------
    public final boolean dark;
    public final int bg, surface, surfaceHigh, border;
    public final int ink, inkSoft, inkFaint;
    public final int primary, onPrimary, primaryTint;
    public final int success, successTint, error, errorTint, warning, warningTint;
    public final int switchOff, switchKnob, ripple;

    private final Context ctx;

    public Ui(Context ctx, boolean dark) {
        this.ctx = ctx;
        this.dark = dark;
        if (dark) {
            bg = 0xFF000000; surface = 0xFF0E0F13; surfaceHigh = 0xFF171920; border = 0xFF26282F;
            ink = 0xFFFFFFFF; inkSoft = 0xFF9AA0AB; inkFaint = 0xFF6A7078;
            primary = 0xFF2563EB; onPrimary = 0xFFFFFFFF; primaryTint = 0xFF10233F;
            success = 0xFF22C55E; successTint = 0xFF0F2A1C;
            error = 0xFFEF4444; errorTint = 0xFF2C1416;
            warning = 0xFFF59E0B; warningTint = 0xFF2B2110;
            switchOff = 0xFF33363E; switchKnob = 0xFFE6E8EC;
            ripple = 0x33FFFFFF;
        } else {
            bg = 0xFFF5F6F8; surface = 0xFFFFFFFF; surfaceHigh = 0xFFF0F2F5; border = 0xFFE3E6EB;
            ink = 0xFF0C0D10; inkSoft = 0xFF5F6673; inkFaint = 0xFF8A919C;
            primary = 0xFF2563EB; onPrimary = 0xFFFFFFFF; primaryTint = 0xFFE9F0FE;
            success = 0xFF16A34A; successTint = 0xFFE7F8EE;
            error = 0xFFDC2626; errorTint = 0xFFFDECEC;
            warning = 0xFFB45309; warningTint = 0xFFFEF3E2;
            switchOff = 0xFFD7DBE0; switchKnob = 0xFFFFFFFF;
            ripple = 0x1F000000;
        }
    }

    // ---- measurements ----------------------------------------------------

    public int dp(float v) {
        return Math.round(TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, v, ctx.getResources().getDisplayMetrics()));
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

    public GradientDrawable shape(int fill, int radiusDp, boolean hairline) {
        GradientDrawable d = new GradientDrawable();
        d.setColor(fill);
        d.setCornerRadius(dp(radiusDp));
        if (hairline) {
            d.setStroke(dp(1), border);
        }
        return d;
    }

    /** Flat surface + hairline + press ripple. The standard interactive row. */
    public void press(View v, int fill, int radiusDp, boolean hairline) {
        v.setBackground(new RippleDrawable(ColorStateList.valueOf(ripple),
                shape(fill, radiusDp, hairline), shape(0xFFFFFFFF, radiusDp, false)));
        v.setClickable(true);
    }

    // ---- text ------------------------------------------------------------

    public TextView text(String s, int sp, int color, boolean medium) {
        TextView t = new TextView(ctx);
        t.setText(s);
        t.setTextColor(color);
        t.setTextSize(TypedValue.COMPLEX_UNIT_SP, sp);
        t.setTypeface(Typeface.create("sans-serif", medium ? Typeface.NORMAL : Typeface.NORMAL),
                medium ? Typeface.BOLD : Typeface.NORMAL);
        return t;
    }

    /** Section header / dialog title. */
    public TextView title(String s) {
        return text(s, H2, ink, true);
    }

    /** Field label / chip / status text. */
    public TextView label(String s) {
        return text(s, LABEL, inkSoft, true);
    }

    /** Supporting text. */
    public TextView body(String s) {
        return text(s, BODY, inkSoft, false);
    }

    /** Timestamps, fine print. */
    public TextView caption(String s) {
        return text(s, CAPTION, inkFaint, false);
    }

    // ---- components ------------------------------------------------------

    /** Standard card: flat surface + hairline, r14, 16dp padding. */
    public LinearLayout card() {
        LinearLayout l = col();
        l.setPadding(dp(16), dp(16), dp(16), dp(16));
        l.setBackground(shape(surface, 14, true));
        return l;
    }

    /** Primary (filled) / OUTLINE (hairline) / LINK (bare text) button. */
    public TextView button(String s, int kind, View.OnClickListener click) {
        TextView t = text(s, BTN, kind == PRIMARY ? onPrimary : (kind == LINK ? primary : ink), true);
        t.setGravity(Gravity.CENTER);
        t.setMinHeight(dp(48));
        t.setPadding(dp(16), dp(13), dp(16), dp(13));
        if (kind == PRIMARY) {
            press(t, primary, 12, false);
        } else if (kind == OUTLINE) {
            press(t, surface, 12, true);
        } else {
            t.setClickable(true);
        }
        t.setOnClickListener(click);
        return t;
    }

    /** Pill chip. Pass fill=0 for the outline variant. */
    public LinearLayout chip(String s, int fill, int textColor) {
        LinearLayout c = row();
        c.setGravity(Gravity.CENTER_VERTICAL);
        c.setPadding(dp(12), dp(6), dp(12), dp(6));
        c.setBackground(shape(fill == 0 ? surface : fill, 999, fill == 0));
        TextView t = text(s, LABEL, textColor, true);
        t.setTag("label");
        c.addView(t);
        return c;
    }

    /** Status chip: 6dp semantic dot + label on a semantic tint (mock 15). */
    public LinearLayout statusChip(String s, int dotColor, int tint) {
        LinearLayout c = row();
        c.setGravity(Gravity.CENTER_VERTICAL);
        c.setPadding(dp(10), dp(5), dp(12), dp(5));
        c.setBackground(shape(tint, 999, false));
        View dot = new View(ctx);
        dot.setBackground(shape(dotColor, 999, false));
        c.addView(dot, new LinearLayout.LayoutParams(dp(6), dp(6)));
        c.addView(hspace(dp(6)));
        TextView lbl = text(s, LABEL, dotColor, true);
        lbl.setTag("label");
        c.addView(lbl);
        return c;
    }

    /** Update the label of a chip built by chip()/statusChip() (both tag it). */
    public void chipText(LinearLayout chip, String s) {
        View v = chip.findViewWithTag("label");
        if (v instanceof TextView) ((TextView) v).setText(s);
    }

    /** Icon button: 44dp hit area around a glyph (design top bar: bell / gear). */
    public LinearLayout iconButton(String name, int color, View.OnClickListener click) {
        LinearLayout b = row();
        b.setGravity(Gravity.CENTER);
        b.setPadding(dp(11), dp(11), dp(11), dp(11));
        b.addView(icon(name, color, 22));
        b.setClickable(true);
        b.setFocusable(true);
        b.setOnClickListener(click);
        return b;
    }

    /** Semantic banner (success / error / warning / info). */
    public TextView banner(String msg, int kind) {
        int fill, txt;
        switch (kind) {
            case SUCCESS: fill = successTint; txt = success; break;
            case ERROR:   fill = errorTint;   txt = error;   break;
            case WARNING: fill = warningTint; txt = warning; break;
            default:      fill = primaryTint; txt = primary; break;
        }
        TextView t = text(msg, BODY, txt, false);
        t.setPadding(dp(14), dp(12), dp(14), dp(12));
        t.setBackground(shape(fill, 12, false));
        return t;
    }

    /** Styled text field (r12 well + hairline). Mono for codes/keys. */
    public EditText field(String hint, boolean mono) {
        EditText e = new EditText(ctx);
        e.setHint(hint);
        e.setHintTextColor(inkFaint);
        e.setTextColor(ink);
        e.setTextSize(TypedValue.COMPLEX_UNIT_SP, ROW);
        if (mono) {
            e.setTypeface(Typeface.MONOSPACE);
        }
        e.setBackground(shape(surfaceHigh, 12, true));
        e.setPadding(dp(14), dp(13), dp(14), dp(13));
        e.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        e.setSingleLine(true);
        return e;
    }

    /** 40dp icon tile: surface well + hairline + 22dp glyph (mock 05/06). */
    public LinearLayout iconTile(String icon, int tileFill, int iconColor) {
        LinearLayout t = row();
        t.setGravity(Gravity.CENTER);
        t.setPadding(dp(9), dp(9), dp(9), dp(9));
        t.setBackground(shape(tileFill, 12, true));
        t.addView(icon(icon, iconColor, 22));
        return t;
    }

    public IconView icon(String name, int color, int sizeDp) {
        IconView v = new IconView(ctx);
        v.set(name, color, dp(sizeDp));
        return v;
    }

    // ---- switch (mock 12) ------------------------------------------------

    /** 52x32dp animated toggle. show(on) keeps the design accent (primary). */
    public ToggleSwitch toggle() {
        return new ToggleSwitch(this);
    }

    public static final class ToggleSwitch extends View {
        private final Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);
        private final RectF trk = new RectF();
        private final Ui ui;
        private boolean on;
        private float pos;

        ToggleSwitch(Ui ui) {
            super(ui.ctx);
            this.ui = ui;
        }

        public void show(boolean v) {
            on = v;
            ValueAnimator a = ValueAnimator.ofFloat(pos, v ? 1f : 0f);
            a.setDuration(180);
            a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override public void onAnimationUpdate(ValueAnimator an) {
                    pos = (Float) an.getAnimatedValue();
                    invalidate();
                }
            });
            a.start();
        }

        public boolean isOn() {
            return on;
        }

        @Override protected void onMeasure(int ws, int hs) {
            setMeasuredDimension(ui.dp(52), ui.dp(32));
        }

        @Override protected void onDraw(Canvas canvas) {
            float w = getWidth(), h = getHeight(), r = h / 2f;
            trk.set(0, 0, w, h);
            p.setColor(on ? ui.primary : ui.switchOff);
            canvas.drawRoundRect(trk, r, r, p);
            p.setColor(ui.switchKnob);
            float kx = r + (w - 2 * r) * pos;
            canvas.drawCircle(kx, r, r - ui.dp(4), p);
        }
    }

    // ---- icons (24-unit grid, stroke glyphs) -----------------------------

    /** Dual-thumb range slider (design panel 3). Build one with ui.rangeSlider(). */
    public static final class RangeSlider extends View {
        public interface OnRange { void changed(float lo, float hi); }
        private final Ui ui;
        private final Paint tp = new Paint(Paint.ANTI_ALIAS_FLAG);
        private final RectF trk = new RectF();
        private float min, max = 100, lo, hi;
        private int drag;
        private OnRange cb;
        public RangeSlider(Ui ui) { super(ui.ctx); this.ui = ui; }
        public void set(float mn, float mx, float l, float h) {
            min = mn; max = mx; lo = l; hi = h; invalidate();
        }
        public void on(OnRange c) { cb = c; }
        @Override protected void onMeasure(int ws, int hs) {
            setMeasuredDimension(MeasureSpec.getSize(ws), ui.dp(28));
        }
        private float thumb(float v, float w) {
            float r = ui.dp(10), t = w - 2 * r;
            return r + (max > min ? t * (v - min) / (max - min) : 0);
        }
        @Override protected void onDraw(Canvas canvas) {
            float w = getWidth(), h = getHeight(), cy = h / 2f, r = ui.dp(10);
            float x0 = thumb(lo, w), x1 = thumb(hi, w);
            trk.set(r, cy - ui.dp(2), w - r, cy + ui.dp(2));
            tp.setColor(ui.surfaceHigh);
            canvas.drawRoundRect(trk, ui.dp(2), ui.dp(2), tp);
            trk.set(x0, cy - ui.dp(2), x1, cy + ui.dp(2));
            tp.setColor(ui.primary);
            canvas.drawRoundRect(trk, ui.dp(2), ui.dp(2), tp);
            canvas.drawCircle(x0, cy, r, tp);
            canvas.drawCircle(x1, cy, r, tp);
        }
        @Override public boolean onTouchEvent(android.view.MotionEvent e) {
            float x = e.getX(), w = getWidth();
            if (e.getAction() == android.view.MotionEvent.ACTION_DOWN) {
                drag = Math.abs(x - thumb(lo, w)) <= Math.abs(x - thumb(hi, w)) ? 1 : 2;
                if (getParent() != null) getParent().requestDisallowInterceptTouchEvent(true);
            } else if (e.getAction() == android.view.MotionEvent.ACTION_MOVE && drag != 0) {
                float r = ui.dp(10), t = w - 2 * r;
                float f = t <= 0 ? 0 : (x - r) / t;
                if (f < 0) f = 0;
                if (f > 1) f = 1;
                float v = min + f * (max - min);
                if (drag == 1) lo = Math.min(v, hi); else hi = Math.max(v, lo);
                invalidate();
                if (cb != null) cb.changed(lo, hi);
            } else {
                drag = 0;
                if (getParent() != null) getParent().requestDisallowInterceptTouchEvent(false);
            }
            return true;
        }
    }

    /** Range slider factory. */
    public RangeSlider rangeSlider() { return new RangeSlider(this); }

    public static final class IconView extends View {
        private final Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);
        private String name = "";
        private int color;
        private int size;

        IconView(Context c) {
            super(c);
            p.setStyle(Paint.Style.STROKE);
            p.setStrokeCap(Paint.Cap.ROUND);
            p.setStrokeJoin(Paint.Join.ROUND);
        }

        public void set(String n, int c, int sizePx) {
            name = n;
            color = c;
            size = sizePx;
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
            p.setStrokeWidth(2f);
            p.setStyle(Paint.Style.STROKE);
            Path g = new Path();
            if ("check".equals(name)) {
                g.moveTo(4, 12.5f); g.lineTo(9.5f, 18); g.lineTo(20, 6.5f);
                canvas.drawPath(g, p);
            } else if ("close".equals(name)) {
                g.moveTo(6, 6); g.lineTo(18, 18); g.moveTo(18, 6); g.lineTo(6, 18);
                canvas.drawPath(g, p);
            } else if ("chevron".equals(name)) {
                g.moveTo(9.5f, 5); g.lineTo(16, 12); g.lineTo(9.5f, 19);
                canvas.drawPath(g, p);
            } else if ("copy".equals(name)) {
                canvas.drawRoundRect(new RectF(8, 8, 20, 20), 2, 2, p);
                g.moveTo(5, 16); g.lineTo(5, 4); g.lineTo(17, 4);
                canvas.drawPath(g, p);
            } else if ("search".equals(name)) {
                canvas.drawCircle(10.5f, 10.5f, 6, p);
                g.moveTo(15, 15); g.lineTo(20.5f, 20.5f);
                canvas.drawPath(g, p);
            } else if ("shield".equals(name)) {
                g.moveTo(12, 3); g.lineTo(20, 6); g.lineTo(20, 12);
                g.cubicTo(20, 16.5f, 16.5f, 19.8f, 12, 21);
                g.cubicTo(7.5f, 19.8f, 4, 16.5f, 4, 12);
                g.lineTo(4, 6); g.close();
                canvas.drawPath(g, p);
            } else if ("lock".equals(name)) {
                canvas.drawRoundRect(new RectF(5, 11, 19, 20), 2, 2, p);
                g.moveTo(8.5f, 11); g.lineTo(8.5f, 8);
                g.arcTo(new RectF(8.5f, 4, 15.5f, 12), 180, 180, false);
                g.lineTo(15.5f, 11);
                canvas.drawPath(g, p);
            } else if ("key".equals(name)) {
                canvas.drawCircle(8, 15.5f, 3.5f, p);
                g.moveTo(10.5f, 13); g.lineTo(20, 3.5f);
                g.moveTo(16, 7); g.lineTo(18.5f, 9.5f);
                canvas.drawPath(g, p);
            } else if ("bell".equals(name)) {
                g.moveTo(6, 17); g.lineTo(6, 11);
                g.arcTo(new RectF(6, 5, 18, 17), 180, 180, false);
                g.lineTo(18, 17); g.close();
                g.moveTo(10, 20); g.lineTo(14, 20);
                canvas.drawPath(g, p);
            } else if ("gear".equals(name)) {
                // proper cog: 8 teeth on a ring with a hollow hub. (Was a circle +
                // 8 spokes, which read as a sun.)
                float rIn = 6.4f, rOut = 9.2f;
                for (int i = 0; i < 8; i++) {
                    double c = Math.PI / 4 * i;
                    double a0 = c - 0.20, a1 = c + 0.20, b1 = c + Math.PI / 4 - 0.20;
                    float x0 = (float) (12 + rOut * Math.cos(a0)), y0 = (float) (12 + rOut * Math.sin(a0));
                    float x1 = (float) (12 + rOut * Math.cos(a1)), y1 = (float) (12 + rOut * Math.sin(a1));
                    float x2 = (float) (12 + rIn * Math.cos(a1)),  y2 = (float) (12 + rIn * Math.sin(a1));
                    float x3 = (float) (12 + rIn * Math.cos(b1)),  y3 = (float) (12 + rIn * Math.sin(b1));
                    if (i == 0) g.moveTo(x0, y0); else g.lineTo(x0, y0);
                    g.lineTo(x1, y1);
                    g.lineTo(x2, y2);
                    g.lineTo(x3, y3);
                }
                g.close();
                g.setFillType(Path.FillType.EVEN_ODD);
                g.addCircle(12, 12, 2.8f, Path.Direction.CW);
                canvas.drawPath(g, p);
            } else if ("home".equals(name)) {
                g.moveTo(4, 11); g.lineTo(12, 4); g.lineTo(20, 11);
                g.moveTo(6.5f, 10); g.lineTo(6.5f, 20); g.lineTo(17.5f, 20); g.lineTo(17.5f, 10);
                canvas.drawPath(g, p);
            } else if ("filter".equals(name)) {
                g.moveTo(4, 7); g.lineTo(20, 7); g.moveTo(4, 12); g.lineTo(20, 12); g.moveTo(4, 17); g.lineTo(20, 17);
                canvas.drawPath(g, p);
                p.setStyle(Paint.Style.FILL);
                canvas.drawCircle(9, 7, 2.4f, p);
                canvas.drawCircle(15, 12, 2.4f, p);
                canvas.drawCircle(8, 17, 2.4f, p);
            } else if ("apps".equals(name)) {
                canvas.drawRoundRect(new RectF(4, 4, 10, 10), 2, 2, p);
                canvas.drawRoundRect(new RectF(14, 4, 20, 10), 2, 2, p);
                canvas.drawRoundRect(new RectF(4, 14, 10, 20), 2, 2, p);
                canvas.drawRoundRect(new RectF(14, 14, 20, 20), 2, 2, p);
            } else if ("history".equals(name) || "clock".equals(name)) {
                canvas.drawCircle(12, 12, 8, p);
                g.moveTo(12, 12); g.lineTo(12, 7.5f);
                g.moveTo(12, 12); g.lineTo(15.5f, 14);
                canvas.drawPath(g, p);
            } else if ("pin".equals(name)) {
                g.moveTo(12, 21);
                g.cubicTo(12, 21, 5.5f, 14.5f, 5.5f, 9.5f);
                g.arcTo(new RectF(5.5f, 3, 18.5f, 16), 180, 180, false);
                g.cubicTo(18.5f, 14.5f, 12, 21, 12, 21);
                canvas.drawPath(g, p);
                canvas.drawCircle(12, 9.5f, 2.5f, p);
            } else if ("alert".equals(name)) {
                g.moveTo(12, 4); g.lineTo(21, 20); g.lineTo(3, 20); g.close();
                g.moveTo(12, 10); g.lineTo(12, 15);
                canvas.drawPath(g, p);
                p.setStyle(Paint.Style.FILL);
                canvas.drawCircle(12, 17.5f, 1.2f, p);
            } else if ("doc".equals(name)) {
                g.moveTo(6, 3); g.lineTo(15, 3); g.lineTo(18, 6); g.lineTo(18, 21); g.lineTo(6, 21); g.close();
                g.moveTo(9, 11); g.lineTo(15, 11); g.moveTo(9, 15); g.lineTo(15, 15);
                canvas.drawPath(g, p);
            } else if ("moon".equals(name)) {
                p.setStyle(Paint.Style.FILL);
                g.moveTo(16, 3.5f);
                g.arcTo(new RectF(3, 3.5f, 20.5f, 21), 130, 200, false);
                g.arcTo(new RectF(11, -1, 25, 14.5f), 250, 155, false);
                canvas.drawPath(g, p);
            } else if ("sun".equals(name)) {
                canvas.drawCircle(12, 12, 4, p);
                for (int i = 0; i < 8; i++) {
                    double a = Math.PI / 4 * i;
                    g.moveTo((float) (12 + 6.5 * Math.cos(a)), (float) (12 + 6.5 * Math.sin(a)));
                    g.lineTo((float) (12 + 9 * Math.cos(a)), (float) (12 + 9 * Math.sin(a)));
                }
                canvas.drawPath(g, p);
            } else if ("globe".equals(name)) {
                canvas.drawCircle(12, 12, 8.5f, p);
                canvas.drawOval(new RectF(8, 3.5f, 16, 20.5f), p);
                g.moveTo(3.5f, 12); g.lineTo(20.5f, 12);
                canvas.drawPath(g, p);
            } else if ("power".equals(name)) {
                g.moveTo(12, 2.5f); g.lineTo(12, 12);
                canvas.drawPath(g, p);
                canvas.drawArc(new RectF(5.5f, 5.5f, 18.5f, 18.5f), 135, 270, false, p);
            } else if ("star".equals(name)) {
                g.moveTo(12, 3); g.lineTo(14.6f, 9); g.lineTo(21, 9.6f);
                g.lineTo(16.2f, 13.9f); g.lineTo(17.7f, 20.3f);
                g.lineTo(12, 16.9f); g.lineTo(6.3f, 20.3f);
                g.lineTo(7.8f, 13.9f); g.lineTo(3, 9.6f);
                g.lineTo(9.4f, 9); g.close();
                canvas.drawPath(g, p);
            }
            canvas.restore();
        }
    }
}
