package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public enum zzamy {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzahm.zza),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zzamy(Object obj) {
        this.zzk = obj;
    }
}
