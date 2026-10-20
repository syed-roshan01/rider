package com.google.android.recaptcha.internal;

import c9.e;
import d7.t;
import java.util.ArrayList;
import m9.d0;
import q8.l;
import r8.p;
import v8.a;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
final class zzcc extends i implements e {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzcd zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcc(String[] strArr, zzcd zzcdVar, String str, u8.e eVar) {
        super(2, eVar);
        this.zza = strArr;
        this.zzb = zzcdVar;
        this.zzc = str;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new zzcc(this.zza, this.zzb, this.zzc, eVar);
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcc) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f15963a;
        t.v0(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        this.zzb.zza.evaluateJavascript(this.zzc + "(" + p.K0(arrayList, ",", null, null, null, 62) + ")", null);
        return l.f13235a;
    }
}
