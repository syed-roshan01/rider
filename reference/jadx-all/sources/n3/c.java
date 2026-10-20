package n3;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.d0;
import java.util.Set;
import r8.p;
import u1.i0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f12142a = b.f12139c;

    public static b a(d0 d0Var) {
        while (d0Var != null) {
            if (d0Var.isAdded()) {
                d7.a.l(d0Var.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            d0Var = d0Var.getParentFragment();
        }
        return f12142a;
    }

    public static void b(b bVar, j jVar) {
        d0 d0Var = jVar.f12143a;
        String name = d0Var.getClass().getName();
        a aVar = a.f12130a;
        Set set = bVar.f12140a;
        if (set.contains(aVar)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), jVar);
        }
        if (set.contains(a.f12131b)) {
            i0 i0Var = new i0(3, name, jVar);
            if (!d0Var.isAdded()) {
                i0Var.run();
                return;
            }
            Handler handler = d0Var.getParentFragmentManager().f2067t.f1973c;
            d7.a.l(handler, "fragment.parentFragmentManager.host.handler");
            if (d7.a.d(handler.getLooper(), Looper.myLooper())) {
                i0Var.run();
            } else {
                handler.post(i0Var);
            }
        }
    }

    public static void c(j jVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(jVar.f12143a.getClass().getName()), jVar);
        }
    }

    public static final void d(d0 d0Var, String str) {
        d7.a.m(str, "previousFragmentId");
        d dVar = new d(d0Var, "Attempting to reuse fragment " + d0Var + " with previous ID " + str);
        c(dVar);
        b bVarA = a(d0Var);
        if (bVarA.f12140a.contains(a.f12132c) && e(bVarA, d0Var.getClass(), d.class)) {
            b(bVarA, dVar);
        }
    }

    public static boolean e(b bVar, Class cls, Class cls2) {
        Set set = (Set) bVar.f12141b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (d7.a.d(cls2.getSuperclass(), j.class) || !p.D0(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
