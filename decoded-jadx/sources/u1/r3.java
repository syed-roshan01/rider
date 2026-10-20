package u1;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r3 implements androidx.lifecycle.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m9.d0 f15256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0.p1 f15257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0.g2 f15258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d9.u f15259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f15260e;

    public r3(r9.e eVar, m0.p1 p1Var, m0.g2 g2Var, d9.u uVar, View view) {
        this.f15256a = eVar;
        this.f15257b = p1Var;
        this.f15258c = g2Var;
        this.f15259d = uVar;
        this.f15260e = view;
    }

    @Override // androidx.lifecycle.u
    public final void onStateChanged(androidx.lifecycle.w wVar, androidx.lifecycle.p pVar) {
        boolean z10;
        int i10 = n3.f15171a[pVar.ordinal()];
        m9.k kVarU = null;
        if (i10 == 1) {
            z6.a.Q(this.f15256a, null, 4, new q3(this.f15259d, this.f15258c, wVar, this, this.f15260e, null), 1);
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    return;
                }
                this.f15258c.t();
                return;
            } else {
                m0.g2 g2Var = this.f15258c;
                synchronized (g2Var.f11520b) {
                    g2Var.f11535q = true;
                }
                return;
            }
        }
        m0.p1 p1Var = this.f15257b;
        if (p1Var != null) {
            m0.x0 x0Var = p1Var.f11626b;
            synchronized (x0Var.f11749a) {
                try {
                    synchronized (x0Var.f11749a) {
                        z10 = x0Var.f11752d;
                    }
                    if (!z10) {
                        List list = x0Var.f11750b;
                        x0Var.f11750b = x0Var.f11751c;
                        x0Var.f11751c = list;
                        x0Var.f11752d = true;
                        int size = list.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            ((u8.e) list.get(i11)).resumeWith(q8.l.f13235a);
                        }
                        list.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        m0.g2 g2Var2 = this.f15258c;
        synchronized (g2Var2.f11520b) {
            if (g2Var2.f11535q) {
                g2Var2.f11535q = false;
                kVarU = g2Var2.u();
            }
        }
        if (kVarU != null) {
            kVarU.resumeWith(q8.l.f13235a);
        }
    }
}
