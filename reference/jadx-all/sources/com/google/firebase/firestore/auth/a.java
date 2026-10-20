package com.google.firebase.firestore.auth;

import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.AppCheckTokenListener;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements AppCheckTokenListener, Deferred.DeferredHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAppCheckTokenProvider f3696a;

    public /* synthetic */ a(FirebaseAppCheckTokenProvider firebaseAppCheckTokenProvider) {
        this.f3696a = firebaseAppCheckTokenProvider;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public final void handle(Provider provider) {
        this.f3696a.lambda$new$1(provider);
    }

    @Override // com.google.firebase.appcheck.interop.AppCheckTokenListener
    public final void onAppCheckTokenChanged(AppCheckTokenResult appCheckTokenResult) {
        this.f3696a.lambda$new$0(appCheckTokenResult);
    }
}
