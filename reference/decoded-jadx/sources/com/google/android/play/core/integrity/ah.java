package com.google.android.play.core.integrity;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes.dex */
final class ah extends IntegrityTokenResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f3432b;

    public ah(String str, p6.v vVar, PendingIntent pendingIntent) {
        this.f3431a = str;
        this.f3432b = new u(vVar, pendingIntent);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f3431a;
    }
}
