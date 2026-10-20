package q9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d[] f13242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z f13245d;

    public final d c() {
        d dVarD;
        z zVar;
        synchronized (this) {
            try {
                d[] dVarArrE = this.f13242a;
                if (dVarArrE == null) {
                    dVarArrE = e();
                    this.f13242a = dVarArrE;
                } else if (this.f13243b >= dVarArrE.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrE, dVarArrE.length * 2);
                    d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
                    this.f13242a = (d[]) objArrCopyOf;
                    dVarArrE = (d[]) objArrCopyOf;
                }
                int i10 = this.f13244c;
                do {
                    dVarD = dVarArrE[i10];
                    if (dVarD == null) {
                        dVarD = d();
                        dVarArrE[i10] = dVarD;
                    }
                    i10++;
                    if (i10 >= dVarArrE.length) {
                        i10 = 0;
                    }
                    d7.a.k(dVarD, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVarD.a(this));
                this.f13244c = i10;
                this.f13243b++;
                zVar = this.f13245d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zVar != null) {
            zVar.v(1);
        }
        return dVarD;
    }

    public abstract d d();

    public abstract d[] e();

    public final void g(d dVar) {
        z zVar;
        int i10;
        u8.e[] eVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f13243b - 1;
                this.f13243b = i11;
                zVar = this.f13245d;
                if (i11 == 0) {
                    this.f13244c = 0;
                }
                d7.a.k(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                eVarArrB = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (u8.e eVar : eVarArrB) {
            if (eVar != null) {
                eVar.resumeWith(q8.l.f13235a);
            }
        }
        if (zVar != null) {
            zVar.v(-1);
        }
    }

    public final z h() {
        z zVar;
        synchronized (this) {
            zVar = this.f13245d;
            if (zVar == null) {
                int i10 = this.f13243b;
                zVar = new z(1, Integer.MAX_VALUE, o9.a.f12669b);
                zVar.f(Integer.valueOf(i10));
                this.f13245d = zVar;
            }
        }
        return zVar;
    }
}
