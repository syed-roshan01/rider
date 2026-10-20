package com.google.android.recaptcha;

import q8.h;
import u8.e;
import v8.a;
import w8.c;

/* JADX INFO: loaded from: classes.dex */
public final class Recaptcha$getClient$1 extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, e eVar) {
        super(eVar);
        this.zzb = recaptcha;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM2119getClientBWLJW6A = this.zzb.m2119getClientBWLJW6A(null, null, 0L, this);
        return objM2119getClientBWLJW6A == a.f15963a ? objM2119getClientBWLJW6A : new h(objM2119getClientBWLJW6A);
    }
}
