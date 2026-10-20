package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends d1 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f2187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f2188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f2189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f2190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b4.e f2191e;

    public v0(Application application, b4.g gVar, Bundle bundle) {
        a1 a1Var;
        d7.a.m(gVar, "owner");
        this.f2191e = gVar.getSavedStateRegistry();
        this.f2190d = gVar.getLifecycle();
        this.f2189c = bundle;
        this.f2187a = application;
        if (application != null) {
            if (a1.f2107c == null) {
                a1.f2107c = new a1(application);
            }
            a1Var = a1.f2107c;
            d7.a.j(a1Var);
        } else {
            a1Var = new a1(null);
        }
        this.f2188b = a1Var;
    }

    public final x0 a(Class cls, String str) {
        d7.a.m(cls, "modelClass");
        r rVar = this.f2190d;
        if (rVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Application application = this.f2187a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? w0.a(cls, w0.f2193b) : w0.a(cls, w0.f2192a);
        if (constructorA == null) {
            if (application != null) {
                return this.f2188b.create(cls);
            }
            if (c1.f2127a == null) {
                c1.f2127a = new c1();
            }
            c1 c1Var = c1.f2127a;
            d7.a.j(c1Var);
            return c1Var.create(cls);
        }
        b4.e eVar = this.f2191e;
        d7.a.j(eVar);
        Bundle bundleA = eVar.a(str);
        Class[] clsArr = p0.f2163f;
        p0 p0VarO = x9.v.o(bundleA, this.f2189c);
        q0 q0Var = new q0(str, p0VarO);
        q0Var.a(rVar, eVar);
        q qVarB = rVar.b();
        if (qVarB == q.f2170b || qVarB.compareTo(q.f2172d) >= 0) {
            eVar.e();
        } else {
            rVar.a(new i(rVar, eVar));
        }
        x0 x0VarB = (!zIsAssignableFrom || application == null) ? w0.b(cls, constructorA, p0VarO) : w0.b(cls, constructorA, application, p0VarO);
        x0VarB.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", q0Var);
        return x0VarB;
    }

    @Override // androidx.lifecycle.b1
    public final x0 create(Class cls, q3.c cVar) {
        d7.a.m(cls, "modelClass");
        d7.a.m(cVar, "extras");
        String str = (String) cVar.a(z0.f2213b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (cVar.a(s0.f2178a) == null || cVar.a(s0.f2179b) == null) {
            if (this.f2190d != null) {
                return a(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) cVar.a(z0.f2212a);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? w0.a(cls, w0.f2193b) : w0.a(cls, w0.f2192a);
        if (constructorA == null) {
            return this.f2188b.create(cls, cVar);
        }
        return (!zIsAssignableFrom || application == null) ? w0.b(cls, constructorA, s0.b(cVar)) : w0.b(cls, constructorA, application, s0.b(cVar));
    }

    @Override // androidx.lifecycle.b1
    public final x0 create(Class cls) {
        d7.a.m(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return a(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
