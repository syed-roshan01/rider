package com.google.firebase.firestore;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DocumentReference f3701b;

    public /* synthetic */ b(DocumentReference documentReference, int i10) {
        this.f3700a = i10;
        this.f3701b = documentReference;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i10 = this.f3700a;
        DocumentReference documentReference = this.f3701b;
        switch (i10) {
            case 0:
                return CollectionReference.lambda$add$0(documentReference, task);
            default:
                return documentReference.lambda$get$0(task);
        }
    }
}
