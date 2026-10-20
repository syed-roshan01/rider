package com.google.firebase.firestore.core;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirestoreClient f3709b;

    public /* synthetic */ b(FirestoreClient firestoreClient, int i10) {
        this.f3708a = i10;
        this.f3709b = firestoreClient;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3708a;
        FirestoreClient firestoreClient = this.f3709b;
        switch (i10) {
            case 0:
                firestoreClient.lambda$deleteAllFieldIndexes$23();
                break;
            case 1:
                firestoreClient.lambda$terminate$6();
                break;
            case 2:
                firestoreClient.lambda$enableNetwork$5();
                break;
            default:
                firestoreClient.lambda$disableNetwork$4();
                break;
        }
    }
}
