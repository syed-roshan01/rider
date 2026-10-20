package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import e6.d;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzado {
    private final String zza;
    private final String zzb;

    public zzado(Context context) {
        this(context, context.getPackageName());
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    private zzado(Context context, String str) {
        a.x(context);
        a.u(str);
        this.zza = str;
        try {
            byte[] bArrC = d.c(context, str);
            if (bArrC != null) {
                this.zzb = d.a(bArrC);
            } else {
                a7.a.t("single cert required: ", str, "FBA-PackageInfo");
                this.zzb = null;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            a7.a.t("no pkg: ", str, "FBA-PackageInfo");
            this.zzb = null;
        }
    }
}
