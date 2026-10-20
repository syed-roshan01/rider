package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3241c;

    public r0(TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f3241c = null;
    }

    @Override // com.google.android.gms.common.api.internal.t0
    public final /* bridge */ /* synthetic */ void d(androidx.fragment.app.x xVar, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final boolean f(d0 d0Var) {
        HashMap map = d0Var.f3178f;
        a7.a.w(this.f3241c);
        a7.a.w(map.get(null));
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final z5.d[] g(d0 d0Var) {
        HashMap map = d0Var.f3178f;
        a7.a.w(this.f3241c);
        a7.a.w(map.get(null));
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void h(d0 d0Var) {
        HashMap map = d0Var.f3178f;
        a7.a.w(this.f3241c);
        a7.a.w(map.remove(null));
        this.f3240b.trySetResult(Boolean.FALSE);
    }
}
