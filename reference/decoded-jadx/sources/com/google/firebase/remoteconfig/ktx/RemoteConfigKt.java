package com.google.firebase.remoteconfig.ktx;

import c9.c;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import d7.a;
import h6.g;
import p9.f;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteConfigKt {
    public static final FirebaseRemoteConfigValue get(FirebaseRemoteConfig firebaseRemoteConfig, String str) {
        a.m(firebaseRemoteConfig, "<this>");
        a.m(str, "key");
        FirebaseRemoteConfigValue value = firebaseRemoteConfig.getValue(str);
        a.l(value, "this.getValue(key)");
        return value;
    }

    public static final f getConfigUpdates(FirebaseRemoteConfig firebaseRemoteConfig) {
        a.m(firebaseRemoteConfig, "<this>");
        return g.b(new RemoteConfigKt$configUpdates$1(firebaseRemoteConfig, null));
    }

    public static /* synthetic */ void getConfigUpdates$annotations(FirebaseRemoteConfig firebaseRemoteConfig) {
    }

    public static final FirebaseRemoteConfig getRemoteConfig(Firebase firebase) {
        a.m(firebase, "<this>");
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        a.l(firebaseRemoteConfig, "getInstance()");
        return firebaseRemoteConfig;
    }

    public static final FirebaseRemoteConfig remoteConfig(Firebase firebase, FirebaseApp firebaseApp) {
        a.m(firebase, "<this>");
        a.m(firebaseApp, "app");
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance(firebaseApp);
        a.l(firebaseRemoteConfig, "getInstance(app)");
        return firebaseRemoteConfig;
    }

    public static final FirebaseRemoteConfigSettings remoteConfigSettings(c cVar) {
        a.m(cVar, "init");
        FirebaseRemoteConfigSettings.Builder builder = new FirebaseRemoteConfigSettings.Builder();
        cVar.invoke(builder);
        FirebaseRemoteConfigSettings firebaseRemoteConfigSettingsBuild = builder.build();
        a.l(firebaseRemoteConfigSettingsBuild, "builder.build()");
        return firebaseRemoteConfigSettingsBuild;
    }
}
