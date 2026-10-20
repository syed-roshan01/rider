package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.base.zaq;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3164a;

    public b0(f fVar) {
        this.f3164a = fVar;
    }

    @Override // com.google.android.gms.common.api.internal.b
    public final void onBackgroundStateChanged(boolean z10) {
        zaq zaqVar = this.f3164a.f3205n;
        zaqVar.sendMessage(zaqVar.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
