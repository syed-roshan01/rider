package n0;

import java.util.ArrayList;
import m0.q2;

/* JADX INFO: loaded from: classes.dex */
public final class s extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f12092c = new s(1, 0, 2);

    @Override // n0.g0
    public final void a(h0 h0Var, m0.d dVar, q2 q2Var, m0.w wVar) {
        m0.c cVar;
        int iC;
        int iA = h0Var.a(0);
        if (!(q2Var.f11677m == 0)) {
            m0.s.g("Cannot move a group while inserting".toString());
            throw null;
        }
        if (!(iA >= 0)) {
            m0.s.g("Parameter offset is out of bounds".toString());
            throw null;
        }
        if (iA == 0) {
            return;
        }
        int i10 = q2Var.f11682r;
        int i11 = q2Var.f11684t;
        int i12 = q2Var.f11683s;
        int iS = i10;
        while (iA > 0) {
            iS += d7.t.s(q2Var.f11666b, q2Var.o(iS));
            if (iS > i12) {
                m0.s.g("Parameter offset is out of bounds".toString());
                throw null;
            }
            iA--;
        }
        int iS2 = d7.t.s(q2Var.f11666b, q2Var.o(iS));
        int i13 = q2Var.f11672h;
        int iF = q2Var.f(q2Var.f11666b, q2Var.o(iS));
        int i14 = iS + iS2;
        int iF2 = q2Var.f(q2Var.f11666b, q2Var.o(i14));
        int i15 = iF2 - iF;
        q2Var.s(i15, Math.max(q2Var.f11682r - 1, 0));
        q2Var.r(iS2);
        int[] iArr = q2Var.f11666b;
        int iO = q2Var.o(i14) * 5;
        b9.b.G(q2Var.o(i10) * 5, iO, (iS2 * 5) + iO, iArr, iArr);
        if (i15 > 0) {
            Object[] objArr = q2Var.f11667c;
            b9.b.H(i13, q2Var.g(iF + i15), q2Var.g(iF2 + i15), objArr, objArr);
        }
        int i16 = iF + i15;
        int i17 = i16 - i13;
        int i18 = q2Var.f11674j;
        int i19 = q2Var.f11675k;
        int length = q2Var.f11667c.length;
        int i20 = q2Var.f11676l;
        int i21 = i10 + iS2;
        int i22 = i10;
        while (i22 < i21) {
            int iO2 = q2Var.o(i22);
            int i23 = i21;
            int i24 = i17;
            iArr[(iO2 * 5) + 4] = q2.h(q2.h(q2Var.f(iArr, iO2) - i17, i20 < iO2 ? 0 : i18, i19, length), q2Var.f11674j, q2Var.f11675k, q2Var.f11667c.length);
            i22++;
            i17 = i24;
            i21 = i23;
            i18 = i18;
            i19 = i19;
        }
        int i25 = i14 + iS2;
        int iN = q2Var.n();
        int iW = d7.t.w(q2Var.f11668d, i14, iN);
        ArrayList arrayList = new ArrayList();
        if (iW >= 0) {
            while (iW < q2Var.f11668d.size() && (iC = q2Var.c((cVar = (m0.c) q2Var.f11668d.get(iW)))) >= i14 && iC < i25) {
                arrayList.add(cVar);
                q2Var.f11668d.remove(iW);
            }
        }
        int i26 = i10 - i14;
        int size = arrayList.size();
        for (int i27 = 0; i27 < size; i27++) {
            m0.c cVar2 = (m0.c) arrayList.get(i27);
            int iC2 = q2Var.c(cVar2) + i26;
            if (iC2 >= q2Var.f11670f) {
                cVar2.f11464a = -(iN - iC2);
            } else {
                cVar2.f11464a = iC2;
            }
            q2Var.f11668d.add(d7.t.w(q2Var.f11668d, iC2, iN), cVar2);
        }
        if (!(!q2Var.B(i14, iS2))) {
            m0.s.g("Unexpectedly removed anchors".toString());
            throw null;
        }
        q2Var.l(i11, q2Var.f11683s, i10);
        if (i15 > 0) {
            q2Var.C(i16, i15, i14 - 1);
        }
    }

    @Override // n0.g0
    public final String b(int i10) {
        return o7.d0.t(i10, 0) ? "offset" : super.b(i10);
    }
}
