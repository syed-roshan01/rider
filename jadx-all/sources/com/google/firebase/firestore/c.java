package com.google.firebase.firestore;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements EventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f3703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f3704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Source f3705d;

    public /* synthetic */ c(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, Source source, int i10) {
        this.f3702a = i10;
        this.f3703b = taskCompletionSource;
        this.f3704c = taskCompletionSource2;
        this.f3705d = source;
    }

    @Override // com.google.firebase.firestore.EventListener
    public final void onEvent(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        int i10 = this.f3702a;
        TaskCompletionSource taskCompletionSource = this.f3704c;
        TaskCompletionSource taskCompletionSource2 = this.f3703b;
        Source source = this.f3705d;
        switch (i10) {
            case 0:
                DocumentReference.lambda$getViaSnapshotListener$1(taskCompletionSource2, taskCompletionSource, source, (DocumentSnapshot) obj, firebaseFirestoreException);
                break;
            default:
                Query.lambda$getViaSnapshotListener$1(taskCompletionSource2, taskCompletionSource, source, (QuerySnapshot) obj, firebaseFirestoreException);
                break;
        }
    }
}
