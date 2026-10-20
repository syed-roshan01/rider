package com.google.firebase.remoteconfig;

import o9.r;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f3927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConfigUpdate f3928c;

    public /* synthetic */ d(r rVar, ConfigUpdate configUpdate, int i10) {
        this.f3926a = i10;
        this.f3927b = rVar;
        this.f3928c = configUpdate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3926a;
        ConfigUpdate configUpdate = this.f3928c;
        r rVar = this.f3927b;
        switch (i10) {
            case 0:
                RemoteConfigKt$configUpdates$1$registration$1.m3727onUpdate$lambda0(rVar, configUpdate);
                break;
            default:
                com.google.firebase.remoteconfig.ktx.RemoteConfigKt$configUpdates$1$registration$1.m3811onUpdate$lambda0(rVar, configUpdate);
                break;
        }
    }
}
