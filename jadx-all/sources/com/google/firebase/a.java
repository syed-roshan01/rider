package com.google.firebase;

import android.content.Context;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3644a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3646c;

    public /* synthetic */ a(Context context, String str) {
        this.f3645b = context;
        this.f3646c = str;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        int i10 = this.f3644a;
        Context context = this.f3645b;
        Object obj = this.f3646c;
        switch (i10) {
            case 0:
                return ((FirebaseApp) obj).lambda$new$0(context);
            default:
                return DefaultHeartBeatController.lambda$new$2(context, (String) obj);
        }
    }

    public /* synthetic */ a(FirebaseApp firebaseApp, Context context) {
        this.f3646c = firebaseApp;
        this.f3645b = context;
    }
}
