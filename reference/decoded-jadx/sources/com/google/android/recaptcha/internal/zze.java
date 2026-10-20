package com.google.android.recaptcha.internal;

import c9.e;
import d7.t;
import m9.d0;
import q8.h;
import q8.l;
import v8.a;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
final class zze extends i implements e {
    int zza;
    final /* synthetic */ zza zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzoe zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zze(zza zzaVar, long j10, zzoe zzoeVar, u8.e eVar) {
        super(2, eVar);
        this.zzb = zzaVar;
        this.zzc = j10;
        this.zzd = zzoeVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new zze(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zze) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objZzb;
        a aVar = a.f15963a;
        int i10 = this.zza;
        t.v0(obj);
        if (i10 != 0) {
            objZzb = ((h) obj).f13229a;
        } else {
            zza zzaVar = this.zzb;
            long j10 = this.zzc;
            zzoe zzoeVar = this.zzd;
            this.zza = 1;
            objZzb = zzaVar.zzb(j10, zzoeVar, this);
            if (objZzb == aVar) {
                return aVar;
            }
        }
        return new h(objZzb);
    }
}
