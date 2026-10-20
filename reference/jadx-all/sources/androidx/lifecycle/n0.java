package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2158b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0 f2159a;

    public final void a(p pVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            d7.a.l(activity, "activity");
            x9.v.p(activity, pVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(p.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(p.ON_DESTROY);
        this.f2159a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(p.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        j0 j0Var = this.f2159a;
        if (j0Var != null) {
            j0Var.f2148a.a();
        }
        a(p.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        j0 j0Var = this.f2159a;
        if (j0Var != null) {
            k0 k0Var = j0Var.f2148a;
            int i10 = k0Var.f2150a + 1;
            k0Var.f2150a = i10;
            if (i10 == 1 && k0Var.f2153d) {
                k0Var.f2155f.f(p.ON_START);
                k0Var.f2153d = false;
            }
        }
        a(p.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(p.ON_STOP);
    }
}
