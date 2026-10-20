package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements d4.b {
    @Override // d4.b
    public final List a() {
        return r8.r.f13661a;
    }

    @Override // d4.b
    public final Object b(Context context) {
        d7.a.m(context, "context");
        d4.a aVarC = d4.a.c(context);
        d7.a.l(aVarC, "getInstance(context)");
        if (!aVarC.f4381b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        if (!t.f2181a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            d7.a.k(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new s());
        }
        k0 k0Var = k0.f2149p;
        k0Var.getClass();
        k0Var.f2154e = new Handler();
        k0Var.f2155f.f(p.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        d7.a.k(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new i0(k0Var));
        return k0Var;
    }
}
