package com.google.firebase.firestore.core;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirestoreClient f3718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QueryListener f3719c;

    public /* synthetic */ f(FirestoreClient firestoreClient, QueryListener queryListener, int i10) {
        this.f3717a = i10;
        this.f3718b = firestoreClient;
        this.f3719c = queryListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3717a;
        QueryListener queryListener = this.f3719c;
        FirestoreClient firestoreClient = this.f3718b;
        switch (i10) {
            case 0:
                firestoreClient.lambda$listen$7(queryListener);
                break;
            default:
                firestoreClient.lambda$stopListening$8(queryListener);
                break;
        }
    }
}
