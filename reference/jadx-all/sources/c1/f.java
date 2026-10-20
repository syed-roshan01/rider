package c1;

import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import androidx.fragment.app.a0;
import t1.u0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f2882b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m2.l f2885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q.q f2886f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f2881a = new p();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f2883c = new q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FocusOwnerImpl$modifier$1 f2884d = new u0() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // t1.u0
        public final int hashCode() {
            return this.f1702b.f2881a.hashCode();
        }

        @Override // t1.u0
        public final n l() {
            return this.f1702b.f2881a;
        }

        @Override // t1.u0
        public final /* bridge */ /* synthetic */ void m(n nVar) {
        }
    };

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public f(u1.r rVar) {
        this.f2882b = new d(rVar);
    }

    public final void a(boolean z10, boolean z11) {
        o oVar;
        int iE;
        q qVar = this.f2883c;
        try {
            if (qVar.f2916c) {
                q.a(qVar);
            }
            qVar.f2916c = true;
            p pVar = this.f2881a;
            if (!z10 && ((iE = t.k.e(androidx.compose.ui.focus.a.v(pVar, 8))) == 1 || iE == 2 || iE == 3)) {
                q.b(qVar);
                return;
            }
            o oVarH0 = pVar.H0();
            if (androidx.compose.ui.focus.a.d(pVar, z10, z11)) {
                int iOrdinal = oVarH0.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                    oVar = o.f2907a;
                } else {
                    if (iOrdinal != 3) {
                        throw new a0();
                    }
                    oVar = o.f2909c;
                }
                pVar.K0(oVar);
            }
            q.b(qVar);
        } catch (Throwable th) {
            q.b(qVar);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x012e  */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0258, code lost:
    
        if (b(r18) == false) goto L189;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r18) {
        /*
            Method dump skipped, instruction units count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.f.b(int):boolean");
    }
}
