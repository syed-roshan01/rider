package com.google.android.recaptcha.internal;

import q8.h;
import u8.e;
import v8.a;
import w8.c;

/* JADX INFO: loaded from: classes.dex */
final class zzer extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzez zzb;
    int zzc;
    zzez zzd;
    String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzez zzezVar, e eVar) {
        super(eVar);
        this.zzb = zzezVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZza = this.zzb.zza(null, 0L, this);
        return objZza == a.f15963a ? objZza : new h(objZza);
    }
}
