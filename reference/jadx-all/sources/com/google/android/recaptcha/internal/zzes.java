package com.google.android.recaptcha.internal;

import c9.e;
import d7.t;
import m9.d0;
import q8.l;
import v8.a;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
final class zzes extends i implements e {
    final /* synthetic */ zzez zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzes(zzez zzezVar, String str, u8.e eVar) {
        super(2, eVar);
        this.zza = zzezVar;
        this.zzb = str;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new zzes(this.zza, this.zzb, eVar);
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzes) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f15963a;
        t.v0(obj);
        this.zza.zzc().evaluateJavascript("recaptcha.m.Main.execute(\"" + this.zzb + "\")", null);
        return l.f13235a;
    }
}
