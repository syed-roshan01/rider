package com.google.firebase.firestore.ktx;

import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;
import o9.r;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements EventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f3740b;

    public /* synthetic */ a(r rVar, int i10) {
        this.f3739a = i10;
        this.f3740b = rVar;
    }

    @Override // com.google.firebase.firestore.EventListener
    public final void onEvent(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        int i10 = this.f3739a;
        r rVar = this.f3740b;
        switch (i10) {
            case 0:
                FirestoreKt.AnonymousClass1.m2970invokeSuspend$lambda0(rVar, (DocumentSnapshot) obj, firebaseFirestoreException);
                break;
            default:
                FirestoreKt.AnonymousClass2.m2972invokeSuspend$lambda0(rVar, (QuerySnapshot) obj, firebaseFirestoreException);
                break;
        }
    }
}
