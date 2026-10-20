package com.google.android.recaptcha.internal;

import c9.e;
import d7.t;
import m9.d0;
import m9.r;
import m9.s;
import q8.h;
import q8.l;
import v8.a;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
final class zzew extends i implements e {
    int zza;
    final /* synthetic */ zzez zzb;
    final /* synthetic */ zzoe zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzew(zzez zzezVar, zzoe zzoeVar, u8.e eVar) {
        super(2, eVar);
        this.zzb = zzezVar;
        this.zzc = zzoeVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new zzew(this.zzb, this.zzc, eVar);
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzew) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f15963a;
        int i10 = this.zza;
        t.v0(obj);
        if (i10 == 0) {
            zzez zzezVar = this.zzb;
            zzezVar.zzi.zza(zzezVar.zzp.zza(zzne.INIT_NATIVE));
            zzcb.zza(zznz.zzj(zzfy.zzh().zzj(this.zzc.zzJ())));
            this.zzb.zzn.zzd();
            this.zzb.zzn.zze();
            zzez.zzl(this.zzb, this.zzc);
            new Integer(this.zzb.zzk().hashCode());
            r rVarZzk = this.zzb.zzk();
            this.zza = 1;
            if (((s) rVarZzk).y(this) == aVar) {
                return aVar;
            }
        }
        return new h(l.f13235a);
    }
}
