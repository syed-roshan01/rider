package com.google.firebase.firestore.remote;

import e8.c2;
import e8.l1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3847c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f3845a = i10;
        this.f3846b = obj;
        this.f3847c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3845a;
        Object obj = this.f3847c;
        Object obj2 = this.f3846b;
        switch (i10) {
            case 0:
                ((AbstractStream.StreamObserver) obj2).lambda$onClose$3((c2) obj);
                break;
            case 1:
                ((AbstractStream.StreamObserver) obj2).lambda$onNext$1(obj);
                break;
            case 2:
                ((AbstractStream.StreamObserver) obj2).lambda$onHeaders$0((l1) obj);
                break;
            case 3:
                ((AndroidConnectivityMonitor) obj2).lambda$configureNetworkMonitoring$0((AndroidConnectivityMonitor.DefaultNetworkCallback) obj);
                break;
            case 4:
                ((AndroidConnectivityMonitor) obj2).lambda$configureNetworkMonitoring$1((AndroidConnectivityMonitor.NetworkReceiver) obj);
                break;
            default:
                ((RemoteStore) obj2).lambda$new$0((ConnectivityMonitor.NetworkStatus) obj);
                break;
        }
    }
}
