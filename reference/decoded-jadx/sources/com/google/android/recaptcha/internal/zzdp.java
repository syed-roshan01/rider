package com.google.android.recaptcha.internal;

import b9.b;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzdp implements zzdd {
    public static final zzdp zza = new zzdp();

    private zzdp() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) throws zzae {
        int length = zzpqVarArr.length;
        if (length == 0) {
            throw new zzae(4, 3, null);
        }
        Constructor<?> constructorZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (constructorZza instanceof Object)) {
            constructorZza = null;
        }
        if (constructorZza == null) {
            throw new zzae(4, 5, null);
        }
        Constructor<?> constructor = constructorZza instanceof Constructor ? constructorZza : constructorZza.getClass().getConstructor(new Class[0]);
        Object[] objArrZzh = zzcjVar.zzc().zzh(b.X(zzpqVarArr).subList(1, length));
        try {
            zzcjVar.zzc().zzf(i10, constructor.newInstance(Arrays.copyOf(objArrZzh, objArrZzh.length)));
        } catch (Exception e4) {
            throw new zzae(6, 14, e4);
        }
    }
}
