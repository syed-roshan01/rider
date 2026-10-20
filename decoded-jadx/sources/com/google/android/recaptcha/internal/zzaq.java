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
final class zzaq extends i implements e {
    int zza;
    final /* synthetic */ zzaw zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaq(zzaw zzawVar, RecaptchaAction recaptchaAction, long j10, u8.e eVar) {
        super(2, eVar);
        this.zzb = zzawVar;
        this.zzc = recaptchaAction;
        this.zzd = j10;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new zzaq(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaq) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objZzk;
        a aVar = a.f15963a;
        int i10 = this.zza;
        t.v0(obj);
        if (i10 != 0) {
            objZzk = ((h) obj).f13229a;
        } else {
            zzaw zzawVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            objZzk = zzawVar.zzk(recaptchaAction, j10, this);
            if (objZzk == aVar) {
                return aVar;
            }
        }
        return new h(objZzk);
    }
}
