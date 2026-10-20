package com.google.android.recaptcha.internal;

import c9.e;
import d7.t;
import m9.d0;
import m9.s;
import q8.l;
import v8.a;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
final class zzey extends i implements e {
    final /* synthetic */ zzez zza;
    final /* synthetic */ zzoe zzb;
    final /* synthetic */ zzbb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzey(zzez zzezVar, zzoe zzoeVar, zzbb zzbbVar, u8.e eVar) {
        super(2, eVar);
        this.zza = zzezVar;
        this.zzb = zzoeVar;
        this.zzc = zzbbVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new zzey(this.zza, this.zzb, this.zzc, eVar);
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzey) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws Exception {
        a aVar = a.f15963a;
        t.v0(obj);
        try {
            zzez zzezVar = this.zza;
            z6.a.Q(this.zza.zzq.zzb(), null, 0, new zzex(this.zza, zzezVar.zzf().zzb(this.zzb, zzezVar.zzp), null), 3);
        } catch (zzp e4) {
            zzez zzezVar2 = this.zza;
            zzezVar2.zzi.zzb(this.zzc, e4, null);
            ((s) this.zza.zzk()).i0(e4);
        }
        return l.f13235a;
    }
}
