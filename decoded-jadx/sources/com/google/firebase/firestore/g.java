package com.google.firebase.firestore;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3733b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f3732a = i10;
        this.f3733b = obj;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i10 = this.f3732a;
        Object obj = this.f3733b;
        switch (i10) {
            case 0:
                return ((FirebaseFirestore) obj).lambda$getNamedQuery$3(task);
            case 1:
                return ((Query) obj).lambda$get$0(task);
            default:
                return ((Transaction) obj).lambda$getAsync$0(task);
        }
    }
}
