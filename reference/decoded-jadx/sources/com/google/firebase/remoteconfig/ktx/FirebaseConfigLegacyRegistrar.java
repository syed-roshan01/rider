package com.google.firebase.remoteconfig.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import d7.t;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseConfigLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return t.d0(LibraryVersionComponent.create(LoggingKt.LIBRARY_NAME, com.google.firebase.remoteconfig.BuildConfig.VERSION_NAME));
    }
}
