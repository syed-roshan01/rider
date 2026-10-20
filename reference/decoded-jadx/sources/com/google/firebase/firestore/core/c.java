package com.google.firebase.firestore.core;

import com.google.firebase.firestore.EventListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirestoreClient f3711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EventListener f3712c;

    public /* synthetic */ c(FirestoreClient firestoreClient, EventListener eventListener, int i10) {
        this.f3710a = i10;
        this.f3711b = firestoreClient;
        this.f3712c = eventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3710a;
        EventListener eventListener = this.f3712c;
        FirestoreClient firestoreClient = this.f3711b;
        switch (i10) {
            case 0:
                firestoreClient.lambda$addSnapshotsInSyncListener$18(eventListener);
                break;
            default:
                firestoreClient.lambda$removeSnapshotsInSyncListener$24(eventListener);
                break;
        }
    }
}
