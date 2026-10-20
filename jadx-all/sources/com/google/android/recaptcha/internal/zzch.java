package com.google.android.recaptcha.internal;

import b9.b;
import d7.a;
import java.lang.reflect.Method;
import r8.r;

/* JADX INFO: loaded from: classes.dex */
public final class zzch extends zzce {
    private final zzcg zza;
    private final String zzb;

    public zzch(zzcg zzcgVar, String str, Object obj) {
        super(obj);
        this.zza = zzcgVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzce
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        if (!a.d(method.getName(), this.zzb)) {
            return false;
        }
        this.zza.zzb(objArr != null ? b.E(objArr) : r.f13661a);
        return true;
    }
}
