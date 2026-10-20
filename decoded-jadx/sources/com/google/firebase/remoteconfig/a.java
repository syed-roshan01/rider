package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseRemoteConfig f3923b;

    public /* synthetic */ a(FirebaseRemoteConfig firebaseRemoteConfig, int i10) {
        this.f3922a = i10;
        this.f3923b = firebaseRemoteConfig;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f3922a;
        FirebaseRemoteConfig firebaseRemoteConfig = this.f3923b;
        switch (i10) {
            case 0:
                return firebaseRemoteConfig.lambda$reset$6();
            default:
                return firebaseRemoteConfig.getInfo();
        }
    }
}
