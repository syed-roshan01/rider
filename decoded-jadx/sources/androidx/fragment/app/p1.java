package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p1 implements androidx.lifecycle.l, b4.g, androidx.lifecycle.g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f1990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.f1 f1991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.y f1992c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b4.f f1993d = null;

    public p1(d0 d0Var, androidx.lifecycle.f1 f1Var) {
        this.f1990a = d0Var;
        this.f1991b = f1Var;
    }

    public final void a(androidx.lifecycle.p pVar) {
        this.f1992c.f(pVar);
    }

    public final void b() {
        if (this.f1992c == null) {
            this.f1992c = new androidx.lifecycle.y(this);
            b4.f fVarL = x9.v.l(this);
            this.f1993d = fVarL;
            fVarL.a();
            androidx.lifecycle.s0.c(this);
        }
    }

    @Override // androidx.lifecycle.l
    public final q3.c getDefaultViewModelCreationExtras() {
        Application application;
        d0 d0Var = this.f1990a;
        Context applicationContext = d0Var.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        q3.d dVar = new q3.d();
        LinkedHashMap linkedHashMap = dVar.f13125a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.z0.f2212a, application);
        }
        linkedHashMap.put(androidx.lifecycle.s0.f2178a, this);
        linkedHashMap.put(androidx.lifecycle.s0.f2179b, this);
        if (d0Var.getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.s0.f2180c, d0Var.getArguments());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.w
    public final androidx.lifecycle.r getLifecycle() {
        b();
        return this.f1992c;
    }

    @Override // b4.g
    public final b4.e getSavedStateRegistry() {
        b();
        return this.f1993d.f2708b;
    }

    @Override // androidx.lifecycle.g1
    public final androidx.lifecycle.f1 getViewModelStore() {
        b();
        return this.f1991b;
    }
}
