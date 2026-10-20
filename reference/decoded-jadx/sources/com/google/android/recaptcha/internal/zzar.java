package com.google.android.recaptcha.internal;

import q8.h;
import u8.e;
import v8.a;
import w8.c;

/* JADX INFO: loaded from: classes.dex */
final class zzar extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzaw zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(zzaw zzawVar, e eVar) {
        super(eVar);
        this.zzb = zzawVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo2121executegIAlus = this.zzb.mo2121executegIAlus(null, this);
        return objMo2121executegIAlus == a.f15963a ? objMo2121executegIAlus : new h(objMo2121executegIAlus);
    }
}
