package com.google.firebase.auth.ktx;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import d7.t;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAuthLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<Component<?>> getComponents() {
        return t.d0(LibraryVersionComponent.create(LoggingKt.LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
