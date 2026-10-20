package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements RequestDeduplicator.GetTokenRequest, SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f3900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Store.Token f3902c;

    public /* synthetic */ i(FirebaseMessaging firebaseMessaging, String str, Store.Token token) {
        this.f3900a = firebaseMessaging;
        this.f3901b = str;
        this.f3902c = token;
    }

    @Override // com.google.firebase.messaging.RequestDeduplicator.GetTokenRequest
    public final Task start() {
        return this.f3900a.lambda$blockingGetToken$10(this.f3901b, this.f3902c);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        return this.f3900a.lambda$blockingGetToken$9(this.f3901b, this.f3902c, (String) obj);
    }
}
