package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class w extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f3395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f3396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3397c = 2;

    public w(Activity activity, Intent intent) {
        this.f3395a = intent;
        this.f3396b = activity;
    }

    @Override // com.google.android.gms.common.internal.y
    public final void a() {
        Intent intent = this.f3395a;
        if (intent != null) {
            this.f3396b.startActivityForResult(intent, this.f3397c);
        }
    }
}
