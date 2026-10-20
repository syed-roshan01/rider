package com.google.firebase.firestore.remote;

import e8.c1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GrpcCallProvider f3856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f3857c;

    public /* synthetic */ f(GrpcCallProvider grpcCallProvider, c1 c1Var, int i10) {
        this.f3855a = i10;
        this.f3856b = grpcCallProvider;
        this.f3857c = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3855a;
        c1 c1Var = this.f3857c;
        GrpcCallProvider grpcCallProvider = this.f3856b;
        switch (i10) {
            case 0:
                grpcCallProvider.lambda$resetChannel$4(c1Var);
                break;
            case 1:
                grpcCallProvider.lambda$initChannelTask$5(c1Var);
                break;
            case 2:
                grpcCallProvider.lambda$onConnectivityStateChange$1(c1Var);
                break;
            case 3:
                grpcCallProvider.lambda$onConnectivityStateChange$3(c1Var);
                break;
            default:
                grpcCallProvider.lambda$onConnectivityStateChange$2(c1Var);
                break;
        }
    }
}
