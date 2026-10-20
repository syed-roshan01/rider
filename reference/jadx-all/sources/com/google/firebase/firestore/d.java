package com.google.firebase.firestore;

import com.google.firebase.firestore.core.ViewSnapshot;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements EventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EventListener f3724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3725c;

    public /* synthetic */ d(Object obj, EventListener eventListener, int i10) {
        this.f3723a = i10;
        this.f3725c = obj;
        this.f3724b = eventListener;
    }

    @Override // com.google.firebase.firestore.EventListener
    public final void onEvent(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        int i10 = this.f3723a;
        EventListener eventListener = this.f3724b;
        Object obj2 = this.f3725c;
        switch (i10) {
            case 0:
                ((DocumentReference) obj2).lambda$addSnapshotListenerInternal$2(eventListener, (ViewSnapshot) obj, firebaseFirestoreException);
                break;
            default:
                ((Query) obj2).lambda$addSnapshotListenerInternal$2(eventListener, (ViewSnapshot) obj, firebaseFirestoreException);
                break;
        }
    }
}
