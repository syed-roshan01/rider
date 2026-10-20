package com.google.firebase.firestore.remote;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.core.OnlineState;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements OnlineStateTracker.OnlineStateCallback, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3859a;

    public /* synthetic */ h(Object obj) {
        this.f3859a = obj;
    }

    @Override // com.google.firebase.firestore.remote.OnlineStateTracker.OnlineStateCallback
    public final void handleOnlineStateChange(OnlineState onlineState) {
        ((RemoteStore.RemoteStoreCallback) this.f3859a).handleOnlineStateChange(onlineState);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return ((Datastore) this.f3859a).lambda$commit$0(task);
    }
}
