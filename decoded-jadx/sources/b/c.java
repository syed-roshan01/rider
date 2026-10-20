package b;

import a0.p;
import a0.z;
import h0.v0;
import java.util.Iterator;
import m0.n0;
import o1.s;
import o2.n;
import o2.r;
import t.u1;
import u1.w1;
import u1.x3;

/* JADX INFO: loaded from: classes.dex */
public final class c implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2292b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f2291a = i10;
        this.f2292b = obj;
    }

    @Override // m0.n0
    public final void a() {
        int i10 = this.f2291a;
        q8.l lVar = null;
        Object obj = this.f2292b;
        switch (i10) {
            case 0:
                d.d dVar = ((a) obj).f2288a;
                if (dVar != null) {
                    dVar.b();
                    lVar = q8.l.f13235a;
                }
                if (lVar == null) {
                    throw new IllegalStateException("Launcher has not been initialized".toString());
                }
                return;
            case 1:
                Iterator it = ((h) obj).f1429b.iterator();
                while (it.hasNext()) {
                    ((androidx.activity.c) it.next()).cancel();
                }
                return;
            case 2:
                ((u1) obj).f();
                return;
            case 3:
                ((p) obj).f840d = null;
                return;
            case 4:
                z zVar = (z) obj;
                int iD = zVar.f878d.d();
                for (int i11 = 0; i11 < iD; i11++) {
                    zVar.b();
                }
                return;
            case 5:
                ((v0) obj).l();
                return;
            case 6:
                ((w1) obj).f15361a.invoke();
                return;
            case 7:
                o2.p pVar = (o2.p) obj;
                pVar.dismiss();
                n nVar = pVar.f12493n;
                x3 x3Var = nVar.f15015c;
                if (x3Var != null) {
                    x3Var.a();
                }
                nVar.f15015c = null;
                nVar.requestLayout();
                return;
            default:
                r rVar = (r) obj;
                x3 x3Var2 = rVar.f15015c;
                if (x3Var2 != null) {
                    x3Var2.a();
                }
                rVar.f15015c = null;
                rVar.requestLayout();
                s.i0(rVar, null);
                rVar.f12504u.removeViewImmediate(rVar);
                return;
        }
    }
}
