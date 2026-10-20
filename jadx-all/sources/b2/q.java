package b2;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f2551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextPaint f2554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextDirectionHeuristic f2556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Layout.Alignment f2557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextUtils.TruncateAt f2559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2560j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f2561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f2562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f2565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f2567q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2568r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2569s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f2570t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f2571u;

    public q(float f10, float f11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, Layout.Alignment alignment, TextDirectionHeuristic textDirectionHeuristic, i2.e eVar, TextUtils.TruncateAt truncateAt, CharSequence charSequence, boolean z10, boolean z11, int[] iArr, int[] iArr2) {
        this.f2551a = charSequence;
        this.f2552b = i10;
        this.f2553c = i11;
        this.f2554d = eVar;
        this.f2555e = i12;
        this.f2556f = textDirectionHeuristic;
        this.f2557g = alignment;
        this.f2558h = i13;
        this.f2559i = truncateAt;
        this.f2560j = i14;
        this.f2561k = f10;
        this.f2562l = f11;
        this.f2563m = i15;
        this.f2564n = z10;
        this.f2565o = z11;
        this.f2566p = i16;
        this.f2567q = i17;
        this.f2568r = i18;
        this.f2569s = i19;
        this.f2570t = iArr;
        this.f2571u = iArr2;
        if (i10 < 0 || i10 > i11) {
            throw new IllegalArgumentException("invalid start value".toString());
        }
        int length = charSequence.length();
        if (i11 < 0 || i11 > length) {
            throw new IllegalArgumentException("invalid end value".toString());
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("invalid maxLines value".toString());
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("invalid width value".toString());
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value".toString());
        }
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("invalid lineSpacingMultiplier value".toString());
        }
    }
}
