package com.google.firebase.remoteconfig;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import h6.g;
import p9.f;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteConfigKt {
    public static final FirebaseRemoteConfigValue get(FirebaseRemoteConfig firebaseRemoteConfig, String str) {
        d7.a.m(firebaseRemoteConfig, "<this>");
        d7.a.m(str, "key");
        FirebaseRemoteConfigValue value = firebaseRemoteConfig.getValue(str);
        d7.a.l(value, "this.getValue(key)");
        return value;
    }

    public static final f getConfigUpdates(FirebaseRemoteConfig firebaseRemoteConfig) {
        d7.a.m(firebaseRemoteConfig, "<this>");
        return g.b(new RemoteConfigKt$configUpdates$1(firebaseRemoteConfig, null));
    }

    public static final FirebaseRemoteConfig getRemoteConfig(Firebase firebase) {
        d7.a.m(firebase, "<this>");
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        d7.a.l(firebaseRemoteConfig, "getInstance()");
        return firebaseRemoteConfig;
    }

    public static final FirebaseRemoteConfig remoteConfig(Firebase firebase, FirebaseApp firebaseApp) {
        d7.a.m(firebase, "<this>");
        d7.a.m(firebaseApp, "app");
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance(firebaseApp);
        d7.a.l(firebaseRemoteConfig, "getInstance(app)");
        return firebaseRemoteConfig;
    }

    public static final FirebaseRemoteConfigSettings remoteConfigSettings(c9.c cVar) {
        d7.a.m(cVar, "init");
        FirebaseRemoteConfigSettings.Builder builder = new FirebaseRemoteConfigSettings.Builder();
        cVar.invoke(builder);
        FirebaseRemoteConfigSettings firebaseRemoteConfigSettingsBuild = builder.build();
        d7.a.l(firebaseRemoteConfigSettingsBuild, "builder.build()");
        return firebaseRemoteConfigSettingsBuild;
    }
}
