package g2;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import u1.x1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1.b0 f6527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f6528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a0 f6535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a2.a0 f6536j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s f6537k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d1.d f6539m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d1.d f6540n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c9.c f6538l = d.f6520c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f6541o = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f6542p = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Matrix f6543q = new Matrix();

    public e(o1.b0 b0Var, q qVar) {
        this.f6527a = b0Var;
        this.f6528b = qVar;
    }

    public final void a() {
        l2.h hVar;
        q qVar = (q) this.f6528b;
        if (((InputMethodManager) qVar.f6590b.getValue()).isActive(qVar.f6589a)) {
            c9.c cVar = this.f6538l;
            float[] fArr = this.f6542p;
            cVar.invoke(new e1.a0(fArr));
            u1.w wVar = (u1.w) this.f6527a;
            wVar.y();
            e1.a0.d(fArr, wVar.Q);
            float fD = d1.c.d(wVar.U);
            float fE = d1.c.e(wVar.U);
            float[] fArr2 = wVar.P;
            e1.a0.c(fArr2);
            e1.a0.e(fArr2, fD, fE);
            x1.s(fArr, fArr2);
            Matrix matrix = this.f6543q;
            androidx.compose.ui.graphics.a.o(matrix, fArr);
            a0 a0Var = this.f6535i;
            d7.a.j(a0Var);
            s sVar = this.f6537k;
            d7.a.j(sVar);
            a2.a0 a0Var2 = this.f6536j;
            d7.a.j(a0Var2);
            d1.d dVar = this.f6539m;
            d7.a.j(dVar);
            d1.d dVar2 = this.f6540n;
            d7.a.j(dVar2);
            boolean z10 = this.f6531e;
            boolean z11 = this.f6532f;
            boolean z12 = this.f6533g;
            boolean z13 = this.f6534h;
            CursorAnchorInfo.Builder builder = this.f6541o;
            builder.reset();
            builder.setMatrix(matrix);
            long j10 = a0Var.f6510b;
            int iE = a2.b0.e(j10);
            builder.setSelectionRange(iE, a2.b0.d(j10));
            l2.h hVar2 = l2.h.f11208b;
            if (!z10 || iE < 0) {
                hVar = hVar2;
            } else {
                int iB = sVar.b(iE);
                d1.d dVarC = a0Var2.c(iB);
                float fQ = z6.a.q(dVarC.f4332a, 0.0f, (int) (a0Var2.f895c >> 32));
                boolean zH = i1.b.h(dVar, fQ, dVarC.f4333b);
                boolean zH2 = i1.b.h(dVar, fQ, dVarC.f4335d);
                boolean z14 = a0Var2.a(iB) == hVar2;
                int i10 = (zH || zH2) ? 1 : 0;
                if (!zH || !zH2) {
                    i10 |= 2;
                }
                int i11 = z14 ? i10 | 4 : i10;
                float f10 = dVarC.f4333b;
                float f11 = dVarC.f4335d;
                hVar = hVar2;
                builder.setInsertionMarkerLocation(fQ, f10, f11, f11, i11);
            }
            if (z11) {
                a2.b0 b0Var = a0Var.f6511c;
                int iE2 = b0Var != null ? a2.b0.e(b0Var.f905a) : -1;
                int iD = b0Var != null ? a2.b0.d(b0Var.f905a) : -1;
                if (iE2 >= 0 && iE2 < iD) {
                    builder.setComposingText(iE2, a0Var.f6509a.f918a.subSequence(iE2, iD));
                    int iB2 = sVar.b(iE2);
                    int iB3 = sVar.b(iD);
                    float[] fArr3 = new float[(iB3 - iB2) * 4];
                    long jG = o1.s.g(iB2, iB3);
                    a2.i iVar = a0Var2.f894b;
                    iVar.getClass();
                    iVar.c(a2.b0.e(jG));
                    iVar.d(a2.b0.d(jG));
                    d9.s sVar2 = new d9.s();
                    sVar2.f4950a = 0;
                    o1.s.z(iVar.f939h, jG, new u.t(jG, fArr3, sVar2, new d9.r()));
                    int i12 = iE2;
                    while (i12 < iD) {
                        int iB4 = sVar.b(i12);
                        int i13 = (iB4 - iB2) * 4;
                        float f12 = fArr3[i13];
                        float f13 = fArr3[i13 + 1];
                        int i14 = iD;
                        float f14 = fArr3[i13 + 2];
                        float f15 = fArr3[i13 + 3];
                        int i15 = iB2;
                        int i16 = (dVar.f4334c <= f12 || f14 <= dVar.f4332a || dVar.f4335d <= f13 || f15 <= dVar.f4333b) ? 0 : 1;
                        if (!i1.b.h(dVar, f12, f13) || !i1.b.h(dVar, f14, f15)) {
                            i16 |= 2;
                        }
                        s sVar3 = sVar;
                        l2.h hVar3 = hVar;
                        if (a0Var2.a(iB4) == hVar3) {
                            i16 |= 4;
                        }
                        builder.addCharacterBounds(i12, f12, f13, f14, f15, i16);
                        i12++;
                        fArr3 = fArr3;
                        hVar = hVar3;
                        iD = i14;
                        iB2 = i15;
                        sVar = sVar3;
                    }
                }
            }
            int i17 = Build.VERSION.SDK_INT;
            if (i17 >= 33 && z12) {
                b.a(builder, dVar2);
            }
            if (i17 >= 34 && z13) {
                c.a(builder, a0Var2, dVar);
            }
            ((InputMethodManager) qVar.f6590b.getValue()).updateCursorAnchorInfo(qVar.f6589a, builder.build());
            this.f6530d = false;
        }
    }
}
