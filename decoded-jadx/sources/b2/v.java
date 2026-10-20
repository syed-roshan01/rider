package b2;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.NoSuchElementException;
import u1.z0;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2575a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Layout f2578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f2582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f2583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Paint.FontMetricsInt f2585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2586l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d2.h[] f2587m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q8.c f2589o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2576b = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f2588n = new Rect();

    /* JADX WARN: Code duplicated, block: B:123:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x017e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0180  */
    /* JADX WARN: Code duplicated, block: B:71:0x019d  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:80:0x01be  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x01c7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r54v1, types: [boolean] */
    public v(CharSequence charSequence, float f10, i2.e eVar, int i10, TextUtils.TruncateAt truncateAt, int i11, boolean z10, int i12, int i13, int i14, int i15, int i16, int i17, h hVar) {
        j jVar;
        Layout layoutA;
        int i18;
        d2.h[] hVarArr;
        Paint.FontMetricsInt fontMetricsInt;
        boolean zA;
        int lineAscent;
        int i19;
        int topPadding;
        int lineDescent;
        int i20;
        int bottomPadding;
        this.f2575a = z10;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicA = w.a(i11);
        Layout.Alignment alignment = r.f2572a;
        Layout.Alignment alignment2 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Layout.Alignment.ALIGN_NORMAL : r.f2573b : r.f2572a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z11 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, d2.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = hVar.a();
            double d10 = f10;
            int iCeil = (int) Math.ceil(d10);
            j jVar2 = o.f2550a;
            if (metricsA == null || hVar.b() > f10 || z11) {
                this.f2584j = false;
                jVar = jVar2;
                layoutA = jVar.a(new q(1.0f, 0.0f, 0, charSequence.length(), iCeil, i12, (int) Math.ceil(d10), i17, i13, i14, i15, i16, alignment2, textDirectionHeuristicA, eVar, truncateAt, charSequence, z10, true, null, null));
            } else {
                this.f2584j = true;
                if (iCeil < 0) {
                    throw new IllegalArgumentException("negative width".toString());
                }
                if (iCeil < 0) {
                    throw new IllegalArgumentException("negative ellipsized width".toString());
                }
                layoutA = Build.VERSION.SDK_INT >= 33 ? a.a(charSequence, eVar, iCeil, alignment2, 1.0f, 0.0f, metricsA, z10, true, truncateAt, iCeil) : b.a(charSequence, eVar, iCeil, alignment2, 1.0f, 0.0f, metricsA, z10, truncateAt, iCeil);
                jVar = jVar2;
            }
            this.f2578d = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i12);
            this.f2579e = iMin;
            int i21 = iMin - 1;
            this.f2577c = iMin >= i12 && (layoutA.getEllipsisCount(i21) > 0 || layoutA.getLineEnd(i21) != charSequence.length());
            long j10 = w.f2591b;
            if (z10) {
                i18 = 0;
            } else if (this.f2584j) {
                BoringLayout boringLayout = (BoringLayout) layoutA;
                if (Build.VERSION.SDK_INT >= 33) {
                    zA = boringLayout.isFallbackLineSpacingEnabled();
                    if (zA) {
                        i18 = 0;
                    } else {
                        TextPaint paint = layoutA.getPaint();
                        CharSequence text = layoutA.getText();
                        i18 = 0;
                        Rect rectQ = i1.b.q(paint, text, layoutA.getLineStart(0), layoutA.getLineEnd(0));
                        lineAscent = layoutA.getLineAscent(0);
                        i19 = rectQ.top;
                        if (i19 < lineAscent) {
                            topPadding = lineAscent - i19;
                        } else {
                            topPadding = layoutA.getTopPadding();
                        }
                        rectQ = iMin != 1 ? i1.b.q(paint, text, layoutA.getLineStart(i21), layoutA.getLineEnd(i21)) : rectQ;
                        lineDescent = layoutA.getLineDescent(i21);
                        i20 = rectQ.bottom;
                        if (i20 > lineDescent) {
                            bottomPadding = i20 - lineDescent;
                        } else {
                            bottomPadding = layoutA.getBottomPadding();
                        }
                        if (topPadding == 0 || bottomPadding != 0) {
                            j10 = (((long) topPadding) << 32) | (((long) bottomPadding) & 4294967295L);
                        }
                    }
                } else {
                    TextPaint paint2 = layoutA.getPaint();
                    CharSequence text2 = layoutA.getText();
                    i18 = 0;
                    Rect rectQ2 = i1.b.q(paint2, text2, layoutA.getLineStart(0), layoutA.getLineEnd(0));
                    lineAscent = layoutA.getLineAscent(0);
                    i19 = rectQ2.top;
                    if (i19 < lineAscent) {
                        topPadding = lineAscent - i19;
                    } else {
                        topPadding = layoutA.getTopPadding();
                    }
                    if (iMin != 1) {
                    }
                    lineDescent = layoutA.getLineDescent(i21);
                    i20 = rectQ2.bottom;
                    if (i20 > lineDescent) {
                        bottomPadding = i20 - lineDescent;
                    } else {
                        bottomPadding = layoutA.getBottomPadding();
                    }
                    if (topPadding == 0) {
                        j10 = (((long) topPadding) << 32) | (((long) bottomPadding) & 4294967295L);
                    } else {
                        j10 = (((long) topPadding) << 32) | (((long) bottomPadding) & 4294967295L);
                    }
                }
            } else {
                StaticLayout staticLayout = (StaticLayout) layoutA;
                int i22 = Build.VERSION.SDK_INT;
                if (i22 >= 33) {
                    zA = n.a(staticLayout);
                    if (zA) {
                        i18 = 0;
                    } else {
                        TextPaint paint3 = layoutA.getPaint();
                        CharSequence text3 = layoutA.getText();
                        i18 = 0;
                        Rect rectQ3 = i1.b.q(paint3, text3, layoutA.getLineStart(0), layoutA.getLineEnd(0));
                        lineAscent = layoutA.getLineAscent(0);
                        i19 = rectQ3.top;
                        if (i19 < lineAscent) {
                            topPadding = lineAscent - i19;
                        } else {
                            topPadding = layoutA.getTopPadding();
                        }
                        if (iMin != 1) {
                        }
                        lineDescent = layoutA.getLineDescent(i21);
                        i20 = rectQ3.bottom;
                        if (i20 > lineDescent) {
                            bottomPadding = i20 - lineDescent;
                        } else {
                            bottomPadding = layoutA.getBottomPadding();
                        }
                        if (topPadding == 0) {
                            j10 = (((long) topPadding) << 32) | (((long) bottomPadding) & 4294967295L);
                        } else {
                            j10 = (((long) topPadding) << 32) | (((long) bottomPadding) & 4294967295L);
                        }
                    }
                } else if (i22 >= 28) {
                    i18 = 0;
                } else {
                    TextPaint paint4 = layoutA.getPaint();
                    CharSequence text4 = layoutA.getText();
                    i18 = 0;
                    Rect rectQ4 = i1.b.q(paint4, text4, layoutA.getLineStart(0), layoutA.getLineEnd(0));
                    lineAscent = layoutA.getLineAscent(0);
                    i19 = rectQ4.top;
                    if (i19 < lineAscent) {
                        topPadding = lineAscent - i19;
                    } else {
                        topPadding = layoutA.getTopPadding();
                    }
                    if (iMin != 1) {
                    }
                    lineDescent = layoutA.getLineDescent(i21);
                    i20 = rectQ4.bottom;
                    if (i20 > lineDescent) {
                        bottomPadding = i20 - lineDescent;
                    } else {
                        bottomPadding = layoutA.getBottomPadding();
                    }
                    if (topPadding == 0) {
                        j10 = (((long) topPadding) << 32) | (((long) bottomPadding) & 4294967295L);
                    } else {
                        j10 = (((long) topPadding) << 32) | (((long) bottomPadding) & 4294967295L);
                    }
                }
            }
            if (layoutA.getText() instanceof Spanned) {
                CharSequence text5 = layoutA.getText();
                d7.a.k(text5, "null cannot be cast to non-null type android.text.Spanned");
                hVarArr = (d2.h[]) ((Spanned) text5).getSpans(i18, layoutA.getText().length(), d2.h.class);
                if (hVarArr.length == 0) {
                    hVarArr = new d2.h[i18];
                }
            } else {
                hVarArr = new d2.h[i18];
            }
            this.f2587m = hVarArr;
            int length2 = hVarArr.length;
            int i23 = i18;
            int iMax = i23;
            int iMax2 = iMax;
            while (i23 < length2) {
                d2.h hVar2 = hVarArr[i23];
                int i24 = hVar2.f4364k;
                iMax = i24 < 0 ? Math.max(iMax, Math.abs(i24)) : iMax;
                int i25 = hVar2.f4365l;
                if (i25 < 0) {
                    iMax2 = Math.max(iMax, Math.abs(i25));
                }
                i23++;
            }
            long j11 = (iMax == 0 && iMax2 == 0) ? w.f2591b : (((long) iMax) << 32) | (((long) iMax2) & 4294967295L);
            this.f2580f = Math.max((int) (j10 >> 32), (int) (j11 >> 32));
            this.f2581g = Math.max((int) (j10 & 4294967295L), (int) (j11 & 4294967295L));
            d2.h[] hVarArr2 = this.f2587m;
            int i26 = this.f2579e - 1;
            Layout layout = this.f2578d;
            if (layout.getLineStart(i26) != layout.getLineEnd(i26)) {
                fontMetricsInt = null;
            } else {
                if ((1 ^ (hVarArr2.length == 0 ? 1 : i18)) != 0) {
                    SpannableString spannableString = new SpannableString("\u200b");
                    if (hVarArr2.length == 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    d2.h hVar3 = hVarArr2[i18];
                    spannableString.setSpan(new d2.h(hVar3.f4354a, spannableString.length(), (i26 == 0 || !hVar3.f4358e) ? hVar3.f4358e : i18, hVar3.f4358e, hVar3.f4359f), i18, spannableString.length(), 33);
                    StaticLayout staticLayoutA = jVar.a(new q(1.0f, 0.0f, 0, spannableString.length(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0, 0, 0, 0, e.f2534a, textDirectionHeuristicA, eVar, null, spannableString, this.f2575a, this.f2576b, null, null));
                    fontMetricsInt = new Paint.FontMetricsInt();
                    fontMetricsInt.ascent = staticLayoutA.getLineAscent(i18);
                    fontMetricsInt.descent = staticLayoutA.getLineDescent(i18);
                    fontMetricsInt.top = staticLayoutA.getLineTop(i18);
                    fontMetricsInt.bottom = staticLayoutA.getLineBottom(i18);
                } else {
                    fontMetricsInt = null;
                }
            }
            this.f2586l = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i21) - f(i21))) : i18;
            this.f2585k = fontMetricsInt;
            Layout layout2 = this.f2578d;
            this.f2582h = o1.s.E(layout2, i21, layout2.getPaint());
            Layout layout3 = this.f2578d;
            this.f2583i = o1.s.F(layout3, i21, layout3.getPaint());
            q8.d[] dVarArr = q8.d.f13224a;
            this.f2589o = z6.a.R(new z0(this, 2));
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z10 = this.f2577c;
        Layout layout = this.f2578d;
        return (z10 ? layout.getLineBottom(this.f2579e - 1) : layout.getHeight()) + this.f2580f + this.f2581g + this.f2586l;
    }

    public final float b(int i10) {
        if (i10 == this.f2579e - 1) {
            return this.f2582h + this.f2583i;
        }
        return 0.0f;
    }

    public final float c(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f2580f + ((i10 != this.f2579e + (-1) || (fontMetricsInt = this.f2585k) == null) ? this.f2578d.getLineBaseline(i10) : f(i10) - fontMetricsInt.ascent);
    }

    public final float d(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        int i11 = this.f2579e;
        int i12 = i11 - 1;
        Layout layout = this.f2578d;
        if (i10 != i12 || (fontMetricsInt = this.f2585k) == null) {
            return this.f2580f + layout.getLineBottom(i10) + (i10 == i11 + (-1) ? this.f2581g : 0);
        }
        return layout.getLineBottom(i10 - 1) + fontMetricsInt.bottom;
    }

    public final int e(int i10) {
        Layout layout = this.f2578d;
        return layout.getEllipsisStart(i10) == 0 ? layout.getLineEnd(i10) : layout.getText().length();
    }

    public final float f(int i10) {
        return this.f2578d.getLineTop(i10) + (i10 == 0 ? 0 : this.f2580f);
    }

    public final float g(int i10, boolean z10) {
        return b(this.f2578d.getLineForOffset(i10)) + ((g) this.f2589o.getValue()).b(i10, true, z10);
    }

    public final float h(int i10, boolean z10) {
        return b(this.f2578d.getLineForOffset(i10)) + ((g) this.f2589o.getValue()).b(i10, false, z10);
    }
}
