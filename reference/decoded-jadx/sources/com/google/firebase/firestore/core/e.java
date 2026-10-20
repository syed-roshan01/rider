package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3716c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f3714a = i10;
        this.f3715b = obj;
        this.f3716c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f3714a;
        Object obj = this.f3716c;
        Object obj2 = this.f3715b;
        switch (i10) {
            case 0:
                return ((FirestoreClient) obj2).lambda$getDocumentFromLocalCache$9((DocumentKey) obj);
            case 1:
                return ((FirestoreClient) obj2).lambda$getDocumentsFromLocalCache$11((Query) obj);
            case 2:
                return ((FirebaseRemoteConfig) obj2).lambda$setConfigSettingsAsync$5((FirebaseRemoteConfigSettings) obj);
            default:
                return ((ConfigCacheClient) obj2).lambda$put$0((ConfigContainer) obj);
        }
    }
}
