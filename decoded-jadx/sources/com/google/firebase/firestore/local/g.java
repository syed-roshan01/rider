package com.google.firebase.firestore.local;

import com.google.firebase.firestore.bundle.BundleMetadata;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalStore f3776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3777c;

    public /* synthetic */ g(LocalStore localStore, Object obj, int i10) {
        this.f3775a = i10;
        this.f3776b = localStore;
        this.f3777c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3775a;
        LocalStore localStore = this.f3776b;
        Object obj = this.f3777c;
        switch (i10) {
            case 0:
                localStore.lambda$saveBundle$10((BundleMetadata) obj);
                break;
            default:
                localStore.lambda$setLastStreamToken$5((com.google.protobuf.n) obj);
                break;
        }
    }
}
