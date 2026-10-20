package a2;

import android.graphics.Canvas;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import e1.k0;
import java.util.ArrayList;
import java.util.List;
import u1.z0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.d f886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2.v f889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q8.c f892g;

    /* JADX WARN: Code duplicated, block: B:52:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x0100  */
    public a(i2.d dVar, int i10, boolean z10, long j10) {
        CharSequence charSequence;
        int i11;
        int i12;
        k2.b[] bVarArr;
        List list;
        d1.d dVar2;
        float fG;
        Spannable spannableString;
        this.f886a = dVar;
        this.f887b = i10;
        this.f888c = j10;
        if (m2.a.j(j10) != 0 || m2.a.k(j10) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        int i13 = 1;
        if (i10 < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
        }
        c0 c0Var = dVar.f7916b;
        CharSequence charSequence2 = dVar.f7922h;
        if (z10 && !m2.n.a(c0Var.f911a.f1038h, o1.s.N(0)) && !m2.n.a(c0Var.f911a.f1038h, m2.n.f11820c)) {
            p pVar = c0Var.f912b;
            if (!l2.i.a(pVar.f957a, Integer.MIN_VALUE)) {
                int i14 = pVar.f957a;
                if (!l2.i.a(i14, 5) && !l2.i.a(i14, 4) && charSequence2.length() != 0) {
                    if (charSequence2 instanceof Spannable) {
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        spannableString = (Spannable) charSequence2;
                    } else {
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        charSequence = charSequence2;
                        spannableString = new SpannableString(charSequence2);
                    }
                    spannableString.setSpan(new d2.c(), spannableString.length() - 1, spannableString.length() - 1, 33);
                    charSequence = spannableString;
                }
            }
        }
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        charSequence = charSequence2;
        this.f890e = charSequence;
        int i15 = c0Var.f912b.f957a;
        int i16 = l2.i.a(i15, 1) ? 3 : l2.i.a(i15, 2) ? 4 : l2.i.a(i15, 3) ? 2 : (!l2.i.a(i15, 5) && l2.i.a(i15, 6)) ? 1 : 0;
        p pVar2 = c0Var.f912b;
        boolean zA = l2.i.a(pVar2.f957a, 4);
        int i17 = l2.d.a(pVar2.f964h, 2) ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : 0;
        int i18 = pVar2.f963g;
        int i19 = i18 & 255;
        if (z6.a.A(i19, 1)) {
            i11 = 0;
        } else if (z6.a.A(i19, 2)) {
            i11 = 1;
        } else if (z6.a.A(i19, 3)) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        int i20 = (i18 >> 8) & 255;
        if (f6.a.E(i20, 1)) {
            i12 = 0;
        } else if (f6.a.E(i20, 2)) {
            i12 = 1;
        } else if (f6.a.E(i20, 3)) {
            i12 = 2;
        } else if (f6.a.E(i20, 4)) {
            i12 = 3;
        } else {
            i12 = 0;
        }
        int i21 = (i18 >> 16) & 255;
        int i22 = (i21 != 1 && i21 == 2) ? 1 : 0;
        TextUtils.TruncateAt truncateAt = z10 ? TextUtils.TruncateAt.END : null;
        b2.v vVarA = a(i16, zA ? 1 : 0, truncateAt, i10, i17, i11, i12, i22);
        if (!z10 || vVarA.a() <= m2.a.h(j10) || i10 <= 1) {
            this.f889d = vVarA;
        } else {
            int iH = m2.a.h(j10);
            int i23 = 0;
            while (true) {
                int i24 = vVarA.f2579e;
                if (i23 >= i24) {
                    i23 = i24;
                    break;
                } else if (vVarA.d(i23) > iH) {
                    break;
                } else {
                    i23++;
                }
            }
            if (i23 >= 0 && i23 != this.f887b) {
                vVarA = a(i16, zA ? 1 : 0, truncateAt, i23 < 1 ? 1 : i23, i17, i11, i12, i22);
            }
            this.f889d = vVarA;
        }
        i2.e eVar = this.f886a.f7921g;
        x xVar = c0Var.f911a;
        eVar.a(xVar.f1031a.e(), d7.t.j(c(), b()), xVar.f1031a.c());
        b2.v vVar = this.f889d;
        if (vVar.f2578d.getText() instanceof Spanned) {
            Layout layout = vVar.f2578d;
            CharSequence text = layout.getText();
            d7.a.k(text, "null cannot be cast to non-null type android.text.Spanned");
            bVarArr = (k2.b[]) ((Spanned) text).getSpans(0, layout.getText().length(), k2.b.class);
            if (bVarArr.length == 0) {
                bVarArr = new k2.b[0];
            }
        } else {
            bVarArr = new k2.b[0];
        }
        for (k2.b bVar : bVarArr) {
            bVar.f9715c.setValue(new d1.f(d7.t.j(c(), b())));
        }
        CharSequence charSequence3 = this.f890e;
        if (charSequence3 instanceof Spanned) {
            Object[] spans = ((Spanned) charSequence3).getSpans(0, charSequence3.length(), d2.i.class);
            ArrayList arrayList = new ArrayList(spans.length);
            for (Object obj : spans) {
                d2.i iVar = (d2.i) obj;
                Spanned spanned = (Spanned) charSequence3;
                int spanStart = spanned.getSpanStart(iVar);
                int spanEnd = spanned.getSpanEnd(iVar);
                int lineForOffset = this.f889d.f2578d.getLineForOffset(spanStart);
                boolean z11 = lineForOffset >= this.f887b;
                boolean z12 = this.f889d.f2578d.getEllipsisCount(lineForOffset) > 0 && spanEnd > this.f889d.f2578d.getEllipsisStart(lineForOffset);
                boolean z13 = spanEnd > this.f889d.e(lineForOffset);
                if (z12 || z13 || z11) {
                    dVar2 = null;
                } else {
                    int iOrdinal = (this.f889d.f2578d.isRtlCharAt(spanStart) ? l2.h.f11208b : l2.h.f11207a).ordinal();
                    if (iOrdinal == 0) {
                        fG = this.f889d.g(spanStart, false);
                    } else {
                        if (iOrdinal != 1) {
                            throw new androidx.fragment.app.a0();
                        }
                        fG = this.f889d.g(spanStart, false) - iVar.c();
                    }
                    float fC = iVar.c() + fG;
                    float fC2 = this.f889d.c(lineForOffset) - iVar.b();
                    dVar2 = new d1.d(fG, fC2, fC, iVar.b() + fC2);
                }
                arrayList.add(dVar2);
            }
            list = arrayList;
        } else {
            list = r8.r.f13661a;
        }
        this.f891f = list;
        q8.d[] dVarArr = q8.d.f13224a;
        this.f892g = z6.a.R(new z0(this, i13));
    }

    public final b2.v a(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16) {
        r rVar;
        CharSequence charSequence = this.f890e;
        float fC = c();
        i2.d dVar = this.f886a;
        i2.e eVar = dVar.f7921g;
        int i17 = dVar.f7926l;
        b2.h hVar = dVar.f7923i;
        i2.a aVar = i2.b.f7912a;
        t tVar = dVar.f7916b.f913c;
        return new b2.v(charSequence, fC, eVar, i10, truncateAt, i17, (tVar == null || (rVar = tVar.f973b) == null) ? false : rVar.f969a, i12, i14, i15, i16, i13, i11, hVar);
    }

    public final float b() {
        return this.f889d.a();
    }

    public final float c() {
        return m2.a.i(this.f888c);
    }

    public final void d(e1.p pVar) {
        Canvas canvasA = e1.e.a(pVar);
        b2.v vVar = this.f889d;
        if (vVar.f2577c) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, c(), b());
        }
        if (canvasA.getClipBounds(vVar.f2588n)) {
            int i10 = vVar.f2580f;
            if (i10 != 0) {
                canvasA.translate(0.0f, i10);
            }
            b2.u uVar = b2.w.f2590a;
            uVar.f2574a = canvasA;
            vVar.f2578d.draw(uVar);
            if (i10 != 0) {
                canvasA.translate(0.0f, (-1) * i10);
            }
        }
        if (vVar.f2577c) {
            canvasA.restore();
        }
    }

    public final void e(e1.p pVar, long j10, k0 k0Var, l2.j jVar, g1.h hVar, int i10) {
        i2.d dVar = this.f886a;
        i2.e eVar = dVar.f7921g;
        e1.g gVar = eVar.f7927a;
        int i11 = gVar.f5005b;
        if (j10 != e1.r.f5065g) {
            gVar.e(j10);
            gVar.h(null);
        }
        eVar.c(k0Var);
        eVar.d(jVar);
        eVar.b(hVar);
        eVar.f7927a.d(i10);
        d(pVar);
        dVar.f7921g.f7927a.d(i11);
    }

    public final void f(e1.p pVar, e1.n nVar, float f10, k0 k0Var, l2.j jVar, g1.h hVar, int i10) {
        i2.d dVar = this.f886a;
        i2.e eVar = dVar.f7921g;
        int i11 = eVar.f7927a.f5005b;
        eVar.a(nVar, d7.t.j(c(), b()), f10);
        eVar.c(k0Var);
        eVar.d(jVar);
        eVar.b(hVar);
        eVar.f7927a.d(i10);
        d(pVar);
        dVar.f7921g.f7927a.d(i11);
    }
}
