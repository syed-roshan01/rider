package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements b4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4.e f2182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f2184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q8.i f2185d;

    public t0(b4.e eVar, g1 g1Var) {
        d7.a.m(eVar, "savedStateRegistry");
        d7.a.m(g1Var, "viewModelStoreOwner");
        this.f2182a = eVar;
        this.f2185d = new q8.i(new u1.z0(g1Var, 7));
    }

    @Override // b4.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2184c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((u0) this.f2185d.getValue()).f2186a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((p0) entry.getValue()).f2168e.a();
            if (!d7.a.d(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f2183b = false;
        return bundle;
    }

    public final void b() {
        if (this.f2183b) {
            return;
        }
        Bundle bundleA = this.f2182a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2184c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleA != null) {
            bundle.putAll(bundleA);
        }
        this.f2184c = bundle;
        this.f2183b = true;
    }
}
