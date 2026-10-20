package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements OnSuccessListener, FirebaseInstanceIdInternal.NewTokenListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f3899a;

    public /* synthetic */ h(FirebaseMessaging firebaseMessaging) {
        this.f3899a = firebaseMessaging;
    }

    @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
    public final void onNewToken(String str) {
        this.f3899a.lambda$new$0(str);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f3899a.lambda$new$2((TopicsSubscriber) obj);
    }
}
