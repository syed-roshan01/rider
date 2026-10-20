package com.google.android.recaptcha.internal;

import c9.e;
import d7.t;
import java.util.List;
import java.util.concurrent.TimeUnit;
import m9.d0;
import q8.l;
import v8.a;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
final class zzbx extends i implements e {
    int zza;
    final /* synthetic */ zzcj zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzca zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbx(zzcj zzcjVar, List list, zzca zzcaVar, u8.e eVar) {
        super(2, eVar);
        this.zzb = zzcjVar;
        this.zzc = list;
        this.zzd = zzcaVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        zzbx zzbxVar = new zzbx(this.zzb, this.zzc, this.zzd, eVar);
        zzbxVar.zze = obj;
        return zzbxVar;
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbx) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f15963a;
        int i10 = this.zza;
        l lVar = l.f13235a;
        t.v0(obj);
        if (i10 == 0) {
            d0 d0Var = (d0) this.zze;
            zzfh zzfhVarZzb = zzfh.zzb();
            while (true) {
                zzcj zzcjVar = this.zzb;
                if (zzcjVar.zza() < 0) {
                    break;
                }
                if (zzcjVar.zza() >= this.zzc.size() || !d7.a.x(d0Var)) {
                    break;
                }
                try {
                    this.zzd.zzi((zzpr) this.zzc.get(this.zzb.zza()), this.zzb);
                } catch (Exception e4) {
                    zzca zzcaVar = this.zzd;
                    zzcj zzcjVar2 = this.zzb;
                    this.zza = 1;
                    if (zzcaVar.zzh(e4, zzcjVar2, this) == aVar) {
                        return aVar;
                    }
                }
            }
            zzfhVarZzb.zzf();
            new Long(zzfhVarZzb.zza(TimeUnit.MICROSECONDS));
            return lVar;
        }
        return lVar;
    }
}
