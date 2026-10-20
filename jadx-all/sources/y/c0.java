package y;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public static final c a(int i10, String str) {
        WeakHashMap weakHashMap = j1.f16584u;
        return new c(i10, str);
    }

    public static final g1 b(int i10, String str) {
        WeakHashMap weakHashMap = j1.f16584u;
        return new g1(new k0(0, 0, 0, 0), str);
    }

    public static j1 c(m0.m mVar) {
        j1 j1Var;
        m0.q qVar = (m0.q) mVar;
        qVar.Z(-1366542614);
        View view = (View) qVar.m(u1.y0.f15381f);
        WeakHashMap weakHashMap = j1.f16584u;
        synchronized (weakHashMap) {
            try {
                Object j1Var2 = weakHashMap.get(view);
                if (j1Var2 == null) {
                    j1Var2 = new j1(view);
                    weakHashMap.put(view, j1Var2);
                }
                j1Var = (j1) j1Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        m0.s.a(j1Var, new u.s(6, j1Var, view), qVar);
        qVar.t(false);
        return j1Var;
    }
}
