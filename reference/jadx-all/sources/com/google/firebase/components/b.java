package com.google.firebase.components;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3651b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f3650a = i10;
        this.f3651b = obj;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        int i10 = this.f3650a;
        Object obj = this.f3651b;
        switch (i10) {
            case 0:
                return ComponentDiscovery.instantiate((String) obj);
            default:
                return FirebaseInstallations.lambda$new$0((FirebaseApp) obj);
        }
    }
}
