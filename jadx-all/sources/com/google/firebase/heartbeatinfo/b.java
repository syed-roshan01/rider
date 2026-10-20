package com.google.firebase.heartbeatinfo;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Qualified f3877b;

    public /* synthetic */ b(Qualified qualified, int i10) {
        this.f3876a = i10;
        this.f3877b = qualified;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        int i10 = this.f3876a;
        Qualified qualified = this.f3877b;
        switch (i10) {
            case 0:
                return DefaultHeartBeatController.lambda$component$3(qualified, componentContainer);
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(qualified, componentContainer);
        }
    }
}
