package com.google.firebase.heartbeatinfo;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultHeartBeatController f3875b;

    public /* synthetic */ a(DefaultHeartBeatController defaultHeartBeatController, int i10) {
        this.f3874a = i10;
        this.f3875b = defaultHeartBeatController;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f3874a;
        DefaultHeartBeatController defaultHeartBeatController = this.f3875b;
        switch (i10) {
            case 0:
                return defaultHeartBeatController.lambda$getHeartBeatsHeader$1();
            default:
                return defaultHeartBeatController.lambda$registerHeartBeat$0();
        }
    }
}
