package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentRegistrar f3658b;

    public /* synthetic */ e(ComponentRegistrar componentRegistrar, int i10) {
        this.f3657a = i10;
        this.f3658b = componentRegistrar;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        int i10 = this.f3657a;
        ComponentRegistrar componentRegistrar = this.f3658b;
        switch (i10) {
            case 0:
                return ComponentRuntime.lambda$toProviders$1(componentRegistrar);
            default:
                return ComponentRuntime.Builder.lambda$addComponentRegistrar$0(componentRegistrar);
        }
    }
}
