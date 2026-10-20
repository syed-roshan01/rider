package androidx.fragment.app;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class v implements androidx.lifecycle.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f2041a;

    public v(d0 d0Var) {
        this.f2041a = d0Var;
    }

    @Override // androidx.lifecycle.u
    public final void onStateChanged(androidx.lifecycle.w wVar, androidx.lifecycle.p pVar) {
        View view;
        if (pVar != androidx.lifecycle.p.ON_STOP || (view = this.f2041a.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
