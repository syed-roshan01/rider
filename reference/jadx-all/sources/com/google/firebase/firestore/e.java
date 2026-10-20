package com.google.firebase.firestore;

import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.Function;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3729d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i10) {
        this.f3726a = i10;
        this.f3727b = obj;
        this.f3728c = obj2;
        this.f3729d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f3726a;
        Object obj = this.f3729d;
        Object obj2 = this.f3728c;
        Object obj3 = this.f3727b;
        switch (i10) {
            case 0:
                return ((FirebaseFirestore) obj3).lambda$runTransaction$0((Transaction.Function) obj2, (com.google.firebase.firestore.core.Transaction) obj);
            default:
                return ((FirestoreClient) obj3).lambda$transaction$13((TransactionOptions) obj2, (Function) obj);
        }
    }
}
