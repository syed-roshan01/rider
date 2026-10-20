package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
final class bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ax f3472a;

    public bd(ax axVar) {
        this.f3472a = axVar;
    }

    public final /* synthetic */ Task a(long j10, long j11, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f3472a.c(standardIntegrityTokenRequest.a(), j10, j11);
    }
}
