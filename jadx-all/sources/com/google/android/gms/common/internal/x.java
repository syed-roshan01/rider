package com.google.android.gms.common.internal;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class x extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f3398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.internal.j f3399b;

    public x(Intent intent, com.google.android.gms.common.api.internal.j jVar) {
        this.f3398a = intent;
        this.f3399b = jVar;
    }

    @Override // com.google.android.gms.common.internal.y
    public final void a() {
        Intent intent = this.f3398a;
        if (intent != null) {
            this.f3399b.startActivityForResult(intent, 2);
        }
    }
}
