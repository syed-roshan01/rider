package w0;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f16050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16051q;

    public d(int i10, n nVar, c9.c cVar, c9.c cVar2, c cVar3) {
        super(i10, nVar, cVar, cVar2);
        this.f16050p = cVar3;
        cVar3.k();
    }

    @Override // w0.c, w0.i
    public final void c() {
        if (this.f16071c) {
            return;
        }
        super.c();
        if (this.f16051q) {
            return;
        }
        this.f16051q = true;
        this.f16050p.l();
    }

    @Override // w0.c
    public final y.a0 v() {
        c cVar = this.f16050p;
        if (cVar.f16044n || cVar.f16071c) {
            return new j();
        }
        o0.d dVar = this.f16039i;
        int i10 = this.f16070b;
        HashMap mapB = dVar != null ? p.b(cVar, this, cVar.e()) : null;
        Object obj = p.f16109b;
        synchronized (obj) {
            try {
                p.c(this);
                if (dVar == null || dVar.f12332a == 0) {
                    a();
                } else {
                    y.a0 a0VarX = x(this.f16050p.d(), mapB, this.f16050p.e());
                    if (!d7.a.d(a0VarX, k.f16077a)) {
                        return a0VarX;
                    }
                    o0.d dVarW = this.f16050p.w();
                    if (dVarW != null) {
                        dVarW.e(dVar);
                    } else {
                        this.f16050p.z(dVar);
                        this.f16039i = null;
                    }
                }
                if (this.f16050p.d() < i10) {
                    this.f16050p.u();
                }
                c cVar2 = this.f16050p;
                cVar2.r(cVar2.e().i(i10).e(this.f16041k));
                this.f16050p.y(i10);
                c cVar3 = this.f16050p;
                int i11 = this.f16072d;
                this.f16072d = -1;
                if (i11 >= 0) {
                    int[] iArr = cVar3.f16042l;
                    d7.a.m(iArr, "<this>");
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i11;
                    cVar3.f16042l = iArrCopyOf;
                } else {
                    cVar3.getClass();
                }
                c cVar4 = this.f16050p;
                n nVar = this.f16041k;
                cVar4.getClass();
                synchronized (obj) {
                    cVar4.f16041k = cVar4.f16041k.n(nVar);
                    c cVar5 = this.f16050p;
                    int[] iArr2 = this.f16042l;
                    cVar5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = cVar5.f16042l;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            d7.a.j(iArrCopyOf2);
                            iArr2 = iArrCopyOf2;
                        }
                        cVar5.f16042l = iArr2;
                    }
                }
                this.f16044n = true;
                if (!this.f16051q) {
                    this.f16051q = true;
                    this.f16050p.l();
                }
                return k.f16077a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
