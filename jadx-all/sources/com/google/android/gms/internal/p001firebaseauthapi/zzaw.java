package com.google.android.gms.internal.p001firebaseauthapi;

import u.k1;

/* JADX INFO: loaded from: classes.dex */
final class zzaw {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzaw(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(this.zzb);
        String strValueOf3 = String.valueOf(this.zza);
        String strValueOf4 = String.valueOf(this.zzc);
        StringBuilder sbC = k1.c("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and ");
        sbC.append(strValueOf3);
        sbC.append("=");
        sbC.append(strValueOf4);
        return new IllegalArgumentException(sbC.toString());
    }
}
