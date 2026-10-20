package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f3904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f3905c;

    public /* synthetic */ j(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource, int i10) {
        this.f3903a = i10;
        this.f3904b = firebaseMessaging;
        this.f3905c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3903a;
        TaskCompletionSource taskCompletionSource = this.f3905c;
        FirebaseMessaging firebaseMessaging = this.f3904b;
        switch (i10) {
            case 0:
                firebaseMessaging.lambda$deleteToken$5(taskCompletionSource);
                break;
            case 1:
                firebaseMessaging.lambda$deleteToken$6(taskCompletionSource);
                break;
            default:
                firebaseMessaging.lambda$getToken$4(taskCompletionSource);
                break;
        }
    }
}
