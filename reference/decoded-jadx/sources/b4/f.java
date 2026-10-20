package b4;

import android.os.Bundle;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f2707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f2708b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2709c;

    public f(g gVar) {
        this.f2707a = gVar;
    }

    public final void a() {
        g gVar = this.f2707a;
        r lifecycle = gVar.getLifecycle();
        if (lifecycle.b() != q.f2170b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.a(new b(gVar));
        this.f2708b.c(lifecycle);
        this.f2709c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f2709c) {
            a();
        }
        r lifecycle = this.f2707a.getLifecycle();
        if (!(!(lifecycle.b().compareTo(q.f2172d) >= 0))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
        }
        e eVar = this.f2708b;
        if (!eVar.f2702b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!eVar.f2704d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        eVar.f2703c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        eVar.f2704d = true;
    }

    public final void c(Bundle bundle) {
        d7.a.m(bundle, "outBundle");
        e eVar = this.f2708b;
        eVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = eVar.f2703c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.g gVar = eVar.f2701a;
        gVar.getClass();
        n.d dVar = new n.d(gVar);
        gVar.f12040c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((d) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
