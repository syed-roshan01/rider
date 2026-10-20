package com.google.firebase.firestore.local;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalStore f3760b;

    public /* synthetic */ e(LocalStore localStore, int i10) {
        this.f3759a = i10;
        this.f3760b = localStore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3759a;
        LocalStore localStore = this.f3760b;
        switch (i10) {
            case 0:
                localStore.lambda$deleteAllFieldIndexes$16();
                break;
            case 1:
                localStore.lambda$startIndexManager$0();
                break;
            default:
                localStore.lambda$startMutationQueue$1();
                break;
        }
    }
}
