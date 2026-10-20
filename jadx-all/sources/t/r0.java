package t;

import android.content.Context;
import android.net.ConnectivityManager;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class r0 implements m0.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14302c;

    public /* synthetic */ r0(int i10, Object obj, Object obj2) {
        this.f14300a = i10;
        this.f14301b = obj;
        this.f14302c = obj2;
    }

    @Override // m0.n0
    public final void a() {
        q1 q1Var;
        int i10 = this.f14300a;
        Object obj = this.f14302c;
        Object obj2 = this.f14301b;
        switch (i10) {
            case 0:
                ((p0) obj2).f14273a.m((k0) obj);
                break;
            case 1:
                ((u1) obj2).f14327i.remove((u1) obj);
                break;
            case 2:
                u1 u1Var = (u1) obj2;
                u1Var.getClass();
                m1 m1Var = (m1) ((n1) obj).f14261b.getValue();
                if (m1Var != null && (q1Var = m1Var.f14251a) != null) {
                    u1Var.f14326h.remove(q1Var);
                    break;
                }
                break;
            case 3:
                ((u1) obj2).f14326h.remove((q1) obj);
                break;
            case 4:
                y.j1 j1Var = (y.j1) obj2;
                View view = (View) obj;
                int i11 = j1Var.f16603s - 1;
                j1Var.f16603s = i11;
                if (i11 == 0) {
                    Field field = b3.q0.f2670a;
                    b3.h0.u(view, null);
                    b3.q0.f(view, null);
                    view.removeOnAttachStateChangeListener(j1Var.f16604t);
                }
                break;
            case 5:
                ((a0.o0) obj2).f836c.add(obj);
                break;
            case 6:
                m0.g1 g1Var = (m0.g1) obj2;
                x.o oVar = (x.o) g1Var.getValue();
                if (oVar != null) {
                    x.n nVar = new x.n(oVar);
                    x.m mVar = (x.m) obj;
                    if (mVar != null) {
                        mVar.b(nVar);
                    }
                    g1Var.setValue(null);
                }
                break;
            case 7:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((u1.x0) obj);
                break;
            case 8:
                ((ConnectivityManager) obj2).unregisterNetworkCallback((r4.h) obj);
                break;
            default:
                try {
                    ((Context) obj2).unregisterReceiver((d5.w) obj);
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
