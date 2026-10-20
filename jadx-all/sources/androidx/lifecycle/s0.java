package androidx.lifecycle;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f2178a = new z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z0 f2179b = new z0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z0 f2180c = new z0();

    public static final void a(x0 x0Var, b4.e eVar, r rVar) {
        d7.a.m(eVar, "registry");
        d7.a.m(rVar, "lifecycle");
        q0 q0Var = (q0) x0Var.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (q0Var == null || q0Var.f2177c) {
            return;
        }
        q0Var.a(rVar, eVar);
        q qVarB = rVar.b();
        if (qVarB == q.f2170b || qVarB.compareTo(q.f2172d) >= 0) {
            eVar.e();
        } else {
            rVar.a(new i(rVar, eVar));
        }
    }

    public static final p0 b(q3.c cVar) {
        d7.a.m(cVar, "<this>");
        b4.g gVar = (b4.g) cVar.a(f2178a);
        if (gVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        g1 g1Var = (g1) cVar.a(f2179b);
        if (g1Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) cVar.a(f2180c);
        String str = (String) cVar.a(z0.f2213b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        b4.d dVarB = gVar.getSavedStateRegistry().b();
        t0 t0Var = dVarB instanceof t0 ? (t0) dVarB : null;
        if (t0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = ((u0) new e1(g1Var, new r0()).b(u0.class, "androidx.lifecycle.internal.SavedStateHandlesVM")).f2186a;
        p0 p0Var = (p0) linkedHashMap.get(str);
        if (p0Var != null) {
            return p0Var;
        }
        Class[] clsArr = p0.f2163f;
        t0Var.b();
        Bundle bundle2 = t0Var.f2184c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = t0Var.f2184c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = t0Var.f2184c;
        if (bundle5 != null && bundle5.isEmpty()) {
            t0Var.f2184c = null;
        }
        p0 p0VarO = x9.v.o(bundle3, bundle);
        linkedHashMap.put(str, p0VarO);
        return p0VarO;
    }

    public static final void c(b4.g gVar) {
        d7.a.m(gVar, "<this>");
        q qVarB = gVar.getLifecycle().b();
        if (qVarB != q.f2170b && qVarB != q.f2171c) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (gVar.getSavedStateRegistry().b() == null) {
            t0 t0Var = new t0(gVar.getSavedStateRegistry(), (g1) gVar);
            gVar.getSavedStateRegistry().d("androidx.lifecycle.internal.SavedStateHandlesProvider", t0Var);
            gVar.getLifecycle().a(new f(t0Var));
        }
    }
}
