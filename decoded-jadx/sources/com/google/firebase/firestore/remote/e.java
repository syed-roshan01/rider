package com.google.firebase.firestore.remote;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e8.k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3854d;

    public /* synthetic */ e(Task task, e8.d dVar, Task task2) {
        this.f3851a = 0;
        this.f3852b = task;
        this.f3854d = dVar;
        this.f3853c = task2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i10 = this.f3851a;
        Object obj = this.f3854d;
        Object obj2 = this.f3853c;
        Object obj3 = this.f3852b;
        switch (i10) {
            case 0:
                FirestoreCallCredentials.lambda$applyRequestMetadata$0((Task) obj3, (e8.d) obj, (Task) obj2, task);
                break;
            case 1:
                ((FirestoreChannel) obj3).lambda$runBidiStreamingRpc$0((k[]) obj2, (IncomingStreamObserver) obj, task);
                break;
            case 2:
                ((FirestoreChannel) obj3).lambda$runStreamingResponseRpc$1((FirestoreChannel.StreamingListener) obj2, obj, task);
                break;
            default:
                ((FirestoreChannel) obj3).lambda$runRpc$2((TaskCompletionSource) obj2, obj, task);
                break;
        }
    }

    public /* synthetic */ e(FirestoreChannel firestoreChannel, Object obj, Object obj2, int i10) {
        this.f3851a = i10;
        this.f3852b = firestoreChannel;
        this.f3853c = obj;
        this.f3854d = obj2;
    }
}
