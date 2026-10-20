package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import q6.a;
import q6.h;
import q6.j;

/* JADX INFO: loaded from: classes.dex */
public final class zzgl {
    private static volatile h zza = a.f13200a;
    private static final Object zzb = new Object();

    private static boolean zza(Context context) {
        try {
            return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean zza(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z10 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", authority + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (zza.b()) {
            return ((Boolean) zza.a()).booleanValue();
        }
        synchronized (zzb) {
            try {
                if (zza.b()) {
                    return ((Boolean) zza.a()).booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                    }
                    Boolean boolValueOf = Boolean.valueOf(z10);
                    boolValueOf.getClass();
                    zza = new j(boolValueOf);
                    return ((Boolean) zza.a()).booleanValue();
                }
                if (zza(context)) {
                    z10 = true;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z10);
                boolValueOf2.getClass();
                zza = new j(boolValueOf2);
                return ((Boolean) zza.a()).booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
