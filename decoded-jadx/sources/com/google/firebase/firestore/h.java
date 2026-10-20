package com.google.firebase.firestore;

import o9.r;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements EventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3735b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f3734a = i10;
        this.f3735b = obj;
    }

    @Override // com.google.firebase.firestore.EventListener
    public final void onEvent(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        int i10 = this.f3734a;
        Object obj2 = this.f3735b;
        switch (i10) {
            case 0:
                FirestoreKt.AnonymousClass1.m2771invokeSuspend$lambda0((r) obj2, (DocumentSnapshot) obj, firebaseFirestoreException);
                break;
            case 1:
                FirestoreKt.AnonymousClass2.m2773invokeSuspend$lambda0((r) obj2, (QuerySnapshot) obj, firebaseFirestoreException);
                break;
            default:
                FirebaseFirestore.lambda$addSnapshotsInSyncListener$4((Runnable) obj2, (Void) obj, firebaseFirestoreException);
                break;
        }
    }
}
