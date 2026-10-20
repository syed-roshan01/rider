package com.google.android.recaptcha.internal;

import c9.e;
import d7.t;
import m9.d0;
import q8.h;
import q8.l;
import v8.a;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
final class zzb extends i implements e {
    int zza;
    final /* synthetic */ zza zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(zza zzaVar, String str, long j10, u8.e eVar) {
        super(2, eVar);
        this.zzb = zzaVar;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new zzb(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzb) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objZza;
        a aVar = a.f15963a;
        int i10 = this.zza;
        t.v0(obj);
        if (i10 != 0) {
            objZza = ((h) obj).f13229a;
        } else {
            zza zzaVar = this.zzb;
            String str = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            objZza = zzaVar.zza(str, j10, this);
            if (objZza == aVar) {
                return aVar;
            }
        }
        return new h(objZza);
    }
}
