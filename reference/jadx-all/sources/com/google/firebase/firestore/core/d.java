package com.google.firebase.firestore.core;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.util.AsyncQueue;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements OnSuccessListener, OnFailureListener, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f3713a;

    public /* synthetic */ d(TaskCompletionSource taskCompletionSource) {
        this.f3713a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.f3713a.setException(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.f3713a.setResult((Map) obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return AsyncQueue.lambda$callTask$0(this.f3713a, task);
    }
}
