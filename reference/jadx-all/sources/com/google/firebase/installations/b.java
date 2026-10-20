package com.google.firebase.installations;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3882b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f3881a = i10;
        this.f3882b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f3881a;
        Object obj = this.f3882b;
        switch (i10) {
            case 0:
                return ((FirebaseInstallations) obj).deleteFirebaseInstallationId();
            case 1:
                return ((RemoteConfigComponent) obj).getDefault();
            default:
                return ((ConfigStorageClient) obj).read();
        }
    }
}
