package a2;

import android.graphics.Matrix;
import android.graphics.Shader;
import e1.j0;
import e1.k0;
import e1.n0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f939h;

    public i(k kVar, long j10, int i10, boolean z10) {
        boolean z11;
        int iH;
        this.f932a = kVar;
        this.f933b = i10;
        if (m2.a.k(j10) != 0 || m2.a.j(j10) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = kVar.f946e;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        float f10 = 0.0f;
        while (true) {
            if (i11 >= size) {
                z11 = false;
                break;
            }
            n nVar = (n) arrayList2.get(i11);
            o oVar = nVar.f954a;
            int i13 = m2.a.i(j10);
            if (m2.a.d(j10)) {
                iH = m2.a.h(j10) - ((int) Math.ceil(f10));
                if (iH < 0) {
                    iH = 0;
                }
            } else {
                iH = m2.a.h(j10);
            }
            long jB = o1.s.b(i13, iH, 5);
            int i14 = this.f933b - i12;
            d7.a.k(oVar, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
            a aVar = new a((i2.d) oVar, i14, z10, jB);
            float fB = aVar.b() + f10;
            b2.v vVar = aVar.f889d;
            int i15 = i12 + vVar.f2579e;
            arrayList.add(new m(aVar, nVar.f955b, nVar.f956c, i12, i15, f10, fB));
            if (vVar.f2577c) {
                i12 = i15;
            } else {
                i12 = i15;
                if (i12 != this.f933b || i11 == d7.t.Y(this.f932a.f946e)) {
                    i11++;
                    f10 = fB;
                }
            }
            z11 = true;
            f10 = fB;
            break;
        }
        this.f936e = f10;
        this.f937f = i12;
        this.f934c = z11;
        this.f939h = arrayList;
        this.f935d = m2.a.i(j10);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i16 = 0; i16 < size2; i16++) {
            m mVar = (m) arrayList.get(i16);
            List list = ((a) mVar.f947a).f891f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i17 = 0; i17 < size3; i17++) {
                d1.d dVar = (d1.d) list.get(i17);
                arrayList4.add(dVar != null ? dVar.g(d9.i.f(0.0f, mVar.f952f)) : null);
            }
            r8.n.A0(arrayList4, arrayList3);
        }
        if (arrayList3.size() < this.f932a.f943b.size()) {
            int size4 = this.f932a.f943b.size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i18 = 0; i18 < size4; i18++) {
                arrayList5.add(null);
            }
            arrayList3 = r8.p.P0(arrayList5, arrayList3);
        }
        this.f938g = arrayList3;
    }

    public static void a(i iVar, e1.p pVar, long j10, k0 k0Var, l2.j jVar, g1.h hVar) {
        iVar.getClass();
        pVar.j();
        ArrayList arrayList = iVar.f939h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            ((a) mVar.f947a).e(pVar, j10, k0Var, jVar, hVar, 3);
            pVar.e(0.0f, ((a) mVar.f947a).b());
        }
        pVar.h();
    }

    public static void b(i iVar, e1.p pVar, e1.n nVar, float f10, k0 k0Var, l2.j jVar, g1.h hVar) {
        iVar.getClass();
        pVar.j();
        ArrayList arrayList = iVar.f939h;
        if (arrayList.size() <= 1 || (nVar instanceof n0)) {
            o1.s.s(iVar, pVar, nVar, f10, k0Var, jVar, hVar, 3);
        } else if (nVar instanceof j0) {
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                m mVar = (m) arrayList.get(i10);
                fB += ((a) mVar.f947a).b();
                fMax = Math.max(fMax, ((a) mVar.f947a).c());
            }
            Shader shaderB = ((j0) nVar).b(d7.t.j(fMax, fB));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                m mVar2 = (m) arrayList.get(i11);
                ((a) mVar2.f947a).f(pVar, new e1.o(shaderB), f10, k0Var, jVar, hVar, 3);
                a aVar = (a) mVar2.f947a;
                pVar.e(0.0f, aVar.b());
                matrix.setTranslate(0.0f, -aVar.b());
                shaderB.setLocalMatrix(matrix);
            }
        }
        pVar.h();
    }

    public final void c(int i10) {
        k kVar = this.f932a;
        if (i10 < 0 || i10 >= kVar.f942a.f918a.length()) {
            StringBuilder sbQ = a7.a.q("offset(", i10, ") is out of bounds [0, ");
            sbQ.append(kVar.f942a.f918a.length());
            sbQ.append(')');
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
    }

    public final void d(int i10) {
        k kVar = this.f932a;
        if (i10 < 0 || i10 > kVar.f942a.f918a.length()) {
            StringBuilder sbQ = a7.a.q("offset(", i10, ") is out of bounds [0, ");
            sbQ.append(kVar.f942a.f918a.length());
            sbQ.append(']');
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
    }

    public final void e(int i10) {
        int i11 = this.f937f;
        if (i10 < 0 || i10 >= i11) {
            throw new IllegalArgumentException(("lineIndex(" + i10 + ") is out of bounds [0, " + i11 + ')').toString());
        }
    }
}
