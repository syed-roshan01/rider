package com.google.android.recaptcha.internal;

import q8.h;
import u8.e;
import v8.a;
import w8.c;

/* JADX INFO: loaded from: classes.dex */
final class zzev extends c {
    long zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzez zzc;
    int zzd;
    zzez zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzev(zzez zzezVar, e eVar) {
        super(eVar);
        this.zzc = zzezVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object objZzb = this.zzc.zzb(0L, null, this);
        return objZzb == a.f15963a ? objZzb : new h(objZzb);
    }
}
