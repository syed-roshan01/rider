package com.google.android.play.core.integrity;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes.dex */
final class bb extends StandardIntegrityManager.StandardIntegrityToken {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f3468b;

    public bb(String str, p6.v vVar, PendingIntent pendingIntent) {
        this.f3467a = str;
        this.f3468b = new u(vVar, pendingIntent);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.f3467a;
    }
}
