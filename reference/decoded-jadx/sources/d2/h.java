package d2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4354a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4359f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4365l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4355b = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4360g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4361h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4362i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4363j = Integer.MIN_VALUE;

    public h(float f10, int i10, boolean z10, boolean z11, float f11) {
        this.f4354a = f10;
        this.f4356c = i10;
        this.f4357d = z10;
        this.f4358e = z11;
        this.f4359f = f11;
        if ((0.0f > f11 || f11 > 1.0f) && f11 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14 = fontMetricsInt.descent;
        int i15 = fontMetricsInt.ascent;
        if (i14 - i15 <= 0) {
            return;
        }
        boolean z10 = i10 == this.f4355b;
        boolean z11 = i11 == this.f4356c;
        boolean z12 = this.f4358e;
        boolean z13 = this.f4357d;
        if (z10 && z11 && z13 && z12) {
            return;
        }
        if (this.f4360g == Integer.MIN_VALUE) {
            int i16 = i14 - i15;
            int iCeil = (int) Math.ceil(this.f4354a);
            int i17 = iCeil - i16;
            float fAbs = this.f4359f;
            if (fAbs == -1.0f) {
                fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            int iCeil2 = (int) (i17 <= 0 ? Math.ceil(i17 * fAbs) : Math.ceil((1.0f - fAbs) * i17));
            int i18 = fontMetricsInt.descent;
            int i19 = iCeil2 + i18;
            this.f4362i = i19;
            int i20 = i19 - iCeil;
            this.f4361h = i20;
            if (z13) {
                i20 = fontMetricsInt.ascent;
            }
            this.f4360g = i20;
            if (z12) {
                i19 = i18;
            }
            this.f4363j = i19;
            this.f4364k = fontMetricsInt.ascent - i20;
            this.f4365l = i19 - i18;
        }
        fontMetricsInt.ascent = z10 ? this.f4360g : this.f4361h;
        fontMetricsInt.descent = z11 ? this.f4363j : this.f4362i;
    }
}
