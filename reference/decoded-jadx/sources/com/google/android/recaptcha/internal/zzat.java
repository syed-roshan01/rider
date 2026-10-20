package com.google.android.recaptcha.internal;

import c9.e;
import com.google.android.recaptcha.RecaptchaAction;
import d7.t;
import m9.d0;
import q8.h;
import q8.l;
import v8.a;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
final class zzat extends i implements e {
    int zza;
    final /* synthetic */ zzaw zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    final /* synthetic */ zzbd zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzat(zzaw zzawVar, long j10, RecaptchaAction recaptchaAction, zzbd zzbdVar, String str, u8.e eVar) {
        super(2, eVar);
        this.zzb = zzawVar;
        this.zzc = j10;
        this.zzd = recaptchaAction;
        this.zze = zzbdVar;
        this.zzf = str;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new zzat(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, eVar);
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzat) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f15963a;
        int i10 = this.zza;
        t.v0(obj);
        if (i10 != 0) {
            if (i10 == 1) {
            }
            zzol zzolVar = (zzol) obj;
            this.zzb.zzl(zzolVar, this.zze);
            this.zzb.zzi.zza(this.zze.zza(zzne.EXECUTE_TOTAL));
            return new h(zzolVar.zzi());
        }
        zzaw.zzi(this.zzb, this.zzc, this.zzd, this.zze);
        zzaw zzawVar = this.zzb;
        long j10 = this.zzc;
        String str = this.zzf;
        zzbd zzbdVar = this.zze;
        this.zza = 1;
        obj = zzawVar.zzj(j10, str, zzbdVar, this);
        if (obj == aVar) {
            return aVar;
        }
        zzaw zzawVar2 = this.zzb;
        RecaptchaAction recaptchaAction = this.zzd;
        this.zza = 2;
        obj = z6.a.u0(zzawVar2.zzl.zza().q(), new zzav(this.zze, zzawVar2, recaptchaAction, (zzog) obj, null), this);
        if (obj == aVar) {
            return aVar;
        }
        zzol zzolVar2 = (zzol) obj;
        this.zzb.zzl(zzolVar2, this.zze);
        this.zzb.zzi.zza(this.zze.zza(zzne.EXECUTE_TOTAL));
        return new h(zzolVar2.zzi());
    }
}
