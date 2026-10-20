package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Context;
import z5.f;

/* JADX INFO: loaded from: classes.dex */
public final class zzack {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int iC = f.f17253b.c(context, 12451000);
            zza = Boolean.valueOf(iC == 0 || iC == 2);
        }
        return zza.booleanValue();
    }
}
