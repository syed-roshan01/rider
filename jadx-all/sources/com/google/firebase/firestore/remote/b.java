package com.google.firebase.firestore.remote;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3844b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f3843a = i10;
        this.f3844b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3843a;
        Object obj = this.f3844b;
        switch (i10) {
            case 0:
                ((AbstractStream.StreamObserver) obj).lambda$onOpen$2();
                break;
            default:
                ((OnlineStateTracker) obj).lambda$handleWatchStreamStart$0();
                break;
        }
    }
}
