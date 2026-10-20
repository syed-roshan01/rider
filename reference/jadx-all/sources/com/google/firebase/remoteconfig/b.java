package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements SuccessContinuation, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseRemoteConfig f3924a;

    public /* synthetic */ b(FirebaseRemoteConfig firebaseRemoteConfig) {
        this.f3924a = firebaseRemoteConfig;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        return this.f3924a.lambda$fetchAndActivate$1((Void) obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return Boolean.valueOf(this.f3924a.processActivatePutTask(task));
    }
}
