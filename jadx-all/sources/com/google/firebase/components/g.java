package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3659a;

    public /* synthetic */ g(int i10) {
        this.f3659a = i10;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f3659a) {
            case 0:
                return OptionalProvider.lambda$static$1();
            default:
                return Collections.emptySet();
        }
    }
}
