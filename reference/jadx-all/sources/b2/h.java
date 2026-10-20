package b2;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f2543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f2544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2546d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2547e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f2548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2549g;

    public h(CharSequence charSequence, i2.e eVar, int i10) {
        this.f2543a = charSequence;
        this.f2544b = eVar;
        this.f2545c = i10;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f2549g) {
            TextDirectionHeuristic textDirectionHeuristicA = w.a(this.f2545c);
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f2543a;
            TextPaint textPaint = this.f2544b;
            this.f2548f = i10 >= 33 ? a.b(charSequence, textPaint, textDirectionHeuristicA) : b.b(charSequence, textPaint, textDirectionHeuristicA);
            this.f2549g = true;
        }
        return this.f2548f;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    public final float b() {
        if (!Float.isNaN(this.f2546d)) {
            return this.f2546d;
        }
        BoringLayout.Metrics metricsA = a();
        Float fValueOf = metricsA != null ? Float.valueOf(metricsA.width) : null;
        TextPaint textPaint = this.f2544b;
        CharSequence charSequence = this.f2543a;
        if (fValueOf == null) {
            fValueOf = Float.valueOf((float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), textPaint)));
        }
        if (fValueOf.floatValue() != 0.0f) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (spanned.nextSpanTransition(-1, spanned.length(), d2.f.class) != spanned.length() || spanned.nextSpanTransition(-1, spanned.length(), d2.e.class) != spanned.length()) {
                    fValueOf = Float.valueOf(fValueOf.floatValue() + 0.5f);
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                    fValueOf = Float.valueOf(fValueOf.floatValue() + 0.5f);
                }
            } else if (textPaint.getLetterSpacing() != 0.0f) {
                fValueOf = Float.valueOf(fValueOf.floatValue() + 0.5f);
            }
        }
        float fFloatValue = fValueOf.floatValue();
        this.f2546d = fFloatValue;
        return fFloatValue;
    }
}
