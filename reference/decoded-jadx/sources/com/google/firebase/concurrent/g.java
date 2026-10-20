package com.google.firebase.concurrent;

import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.RemoteConfigComponent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3686a;

    public /* synthetic */ g(int i10) {
        this.f3686a = i10;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f3686a) {
            case 0:
                return ExecutorsRegistrar.lambda$static$0();
            case 1:
                return ExecutorsRegistrar.lambda$static$1();
            case 2:
                return ExecutorsRegistrar.lambda$static$2();
            case 3:
                return ExecutorsRegistrar.lambda$static$3();
            default:
                return RemoteConfigComponent.lambda$getFetchHandler$0();
        }
    }
}
