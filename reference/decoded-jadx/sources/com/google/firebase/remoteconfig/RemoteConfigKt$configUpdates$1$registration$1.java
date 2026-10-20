package com.google.firebase.remoteconfig;

import com.google.firebase.messaging.Constants;
import h6.g;
import o9.r;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteConfigKt$configUpdates$1$registration$1 implements ConfigUpdateListener {
    final /* synthetic */ r $$this$callbackFlow;
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;

    public RemoteConfigKt$configUpdates$1$registration$1(FirebaseRemoteConfig firebaseRemoteConfig, r rVar) {
        this.$this_configUpdates = firebaseRemoteConfig;
        this.$$this$callbackFlow = rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onUpdate$lambda-0, reason: not valid java name */
    public static final void m3727onUpdate$lambda0(r rVar, ConfigUpdate configUpdate) {
        d7.a.m(rVar, "$$this$callbackFlow");
        d7.a.m(configUpdate, "$configUpdate");
        g.z0(rVar, configUpdate);
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onError(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        d7.a.m(firebaseRemoteConfigException, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        d7.a.h(this.$$this$callbackFlow, "Error listening for config updates.", firebaseRemoteConfigException);
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onUpdate(ConfigUpdate configUpdate) {
        d7.a.m(configUpdate, "configUpdate");
        this.$this_configUpdates.schedule(new d(this.$$this$callbackFlow, configUpdate, 0));
    }
}
