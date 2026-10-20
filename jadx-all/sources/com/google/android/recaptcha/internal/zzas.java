package com.google.android.recaptcha.internal;

import q8.h;
import u8.e;
import v8.a;
import w8.c;

/* JADX INFO: loaded from: classes.dex */
final class zzas extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzaw zzb;
    int zzc;
    zzaw zzd;
    zzbd zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzas(zzaw zzawVar, e eVar) {
        super(eVar);
        this.zzb = zzawVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzk = this.zzb.zzk(null, 0L, this);
        return objZzk == a.f15963a ? objZzk : new h(objZzk);
    }
}
