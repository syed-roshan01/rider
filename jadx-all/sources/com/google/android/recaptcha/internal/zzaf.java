package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build;
import z5.f;

/* JADX INFO: loaded from: classes.dex */
public final class zzaf {
    public static final zzaf zza = new zzaf();
    private static final String zzb = String.valueOf(Build.VERSION.SDK_INT);
    private static final f zzc = f.f17253b;

    private zzaf() {
    }

    public static final String zza(Context context) {
        int iB = zzc.b(context);
        return (iB == 1 || iB == 3 || iB == 9) ? "ANDROID_OFFPLAY" : "ANDROID_ONPLAY";
    }
}
