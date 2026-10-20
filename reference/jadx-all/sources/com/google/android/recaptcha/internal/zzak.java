package com.google.android.recaptcha.internal;

import android.app.Application;
import c9.e;
import d7.t;
import m9.d0;
import q8.l;
import v8.a;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
final class zzak extends i implements e {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzak(Application application, String str, long j10, u8.e eVar) {
        super(2, eVar);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new zzak(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzak) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f15963a;
        int i10 = this.zza;
        t.v0(obj);
        if (i10 == 0) {
            zzam zzamVar = zzam.zza;
            Application application = this.zzb;
            String str = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            obj = zzam.zzc(application, str, j10, null, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
