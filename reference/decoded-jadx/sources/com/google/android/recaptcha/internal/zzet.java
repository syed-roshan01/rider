package com.google.android.recaptcha.internal;

import c9.e;
import d7.t;
import m9.d0;
import m9.s;
import q8.l;
import v8.a;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
final class zzet extends i implements e {
    int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzez zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzet(String str, zzez zzezVar, u8.e eVar) {
        super(2, eVar);
        this.zzb = str;
        this.zzc = zzezVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new zzet(this.zzb, this.zzc, eVar);
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzet) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f15963a;
        int i10 = this.zza;
        t.v0(obj);
        if (i10 == 0) {
            zzez zzezVar = this.zzc;
            String str = this.zzb;
            s sVar = new s(true);
            sVar.S(null);
            zzezVar.zzl.put(str, sVar);
            String str2 = this.zzb;
            zzou zzouVarZzf = zzov.zzf();
            zzouVarZzf.zzd(str2);
            byte[] bArrZzd = ((zzov) zzouVarZzf.zzj()).zzd();
            z6.a.Q(this.zzc.zzq.zzb(), null, 0, new zzes(this.zzc, zzfy.zzh().zzi(bArrZzd, 0, bArrZzd.length), null), 3);
            this.zza = 1;
            obj = sVar.y(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
