package androidx.compose.foundation.text.modifiers;

import a2.c0;
import d7.a;
import f2.d;
import g0.e;
import g0.k;
import h6.g;
import l.q;
import l2.l;
import o1.s;
import t1.u0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
public final class TextStringSimpleElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f1685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f1686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1690h;

    public TextStringSimpleElement(String str, c0 c0Var, d dVar, int i10, boolean z10, int i11, int i12) {
        this.f1684b = str;
        this.f1685c = c0Var;
        this.f1686d = dVar;
        this.f1687e = i10;
        this.f1688f = z10;
        this.f1689g = i11;
        this.f1690h = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        textStringSimpleElement.getClass();
        return a.d(null, null) && a.d(this.f1684b, textStringSimpleElement.f1684b) && a.d(this.f1685c, textStringSimpleElement.f1685c) && a.d(this.f1686d, textStringSimpleElement.f1686d) && g.T(this.f1687e, textStringSimpleElement.f1687e) && this.f1688f == textStringSimpleElement.f1688f && this.f1689g == textStringSimpleElement.f1689g && this.f1690h == textStringSimpleElement.f1690h;
    }

    @Override // t1.u0
    public final int hashCode() {
        return (((q.c(this.f1688f, a7.a.u(this.f1687e, (this.f1686d.hashCode() + ((this.f1685c.hashCode() + (this.f1684b.hashCode() * 31)) * 31)) * 31, 31), 31) + this.f1689g) * 31) + this.f1690h) * 31;
    }

    @Override // t1.u0
    public final n l() {
        return new k(this.f1684b, this.f1685c, this.f1686d, this.f1687e, this.f1688f, this.f1689g, this.f1690h);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // t1.u0
    public final void m(n nVar) {
        boolean z10;
        boolean z11;
        k kVar = (k) nVar;
        kVar.getClass();
        boolean z12 = true;
        boolean z13 = !a.d(null, null);
        c0 c0Var = this.f1685c;
        if (z13) {
            z10 = true;
        } else {
            c0 c0Var2 = kVar.f6485v;
            if (c0Var == c0Var2) {
                c0Var.getClass();
            } else if (!c0Var.f911a.b(c0Var2.f911a)) {
                z10 = true;
            }
            z10 = false;
        }
        String str = kVar.f6484u;
        String str2 = this.f1684b;
        if (a.d(str, str2)) {
            z11 = false;
        } else {
            kVar.f6484u = str2;
            kVar.E.setValue(null);
            z11 = true;
        }
        boolean z14 = !kVar.f6485v.c(c0Var);
        kVar.f6485v = c0Var;
        int i10 = kVar.A;
        int i11 = this.f1690h;
        if (i10 != i11) {
            kVar.A = i11;
            z14 = true;
        }
        int i12 = kVar.f6489z;
        int i13 = this.f1689g;
        if (i12 != i13) {
            kVar.f6489z = i13;
            z14 = true;
        }
        boolean z15 = kVar.f6488y;
        boolean z16 = this.f1688f;
        if (z15 != z16) {
            kVar.f6488y = z16;
            z14 = true;
        }
        d dVar = kVar.f6486w;
        d dVar2 = this.f1686d;
        if (!a.d(dVar, dVar2)) {
            kVar.f6486w = dVar2;
            z14 = true;
        }
        int i14 = kVar.f6487x;
        int i15 = this.f1687e;
        if (g.T(i14, i15)) {
            z12 = z14;
        } else {
            kVar.f6487x = i15;
        }
        if (kVar.f16742t) {
            if (z11 || (z10 && kVar.D != null)) {
                t1.g.u(kVar);
            }
            if (z11 || z12) {
                e eVarG0 = kVar.G0();
                String str3 = kVar.f6484u;
                c0 c0Var3 = kVar.f6485v;
                d dVar3 = kVar.f6486w;
                int i16 = kVar.f6487x;
                boolean z17 = kVar.f6488y;
                int i17 = kVar.f6489z;
                int i18 = kVar.A;
                eVarG0.f6448a = str3;
                eVarG0.f6449b = c0Var3;
                eVarG0.f6450c = dVar3;
                eVarG0.f6451d = i16;
                eVarG0.f6452e = z17;
                eVarG0.f6453f = i17;
                eVarG0.f6454g = i18;
                eVarG0.f6457j = null;
                eVarG0.f6461n = null;
                eVarG0.f6462o = null;
                eVarG0.f6464q = -1;
                eVarG0.f6465r = -1;
                eVarG0.f6463p = l.d(0, 0);
                eVarG0.f6459l = s.e(0, 0);
                eVarG0.f6458k = false;
                t1.g.t(kVar);
                t1.g.s(kVar);
            }
            if (z10) {
                t1.g.s(kVar);
            }
        }
    }
}
