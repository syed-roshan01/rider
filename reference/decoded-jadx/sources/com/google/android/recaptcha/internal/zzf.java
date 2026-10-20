package com.google.android.recaptcha.internal;

import c9.e;
import d7.t;
import d9.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m9.d0;
import m9.h0;
import q8.h;
import q8.l;
import v8.a;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
final class zzf extends i implements e {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzoe zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(zzg zzgVar, long j10, zzoe zzoeVar, u8.e eVar) {
        super(2, eVar);
        this.zzb = zzgVar;
        this.zzc = j10;
        this.zzd = zzoeVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, eVar);
        zzfVar.zze = obj;
        return zzfVar;
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        u uVar;
        zzp zzpVar;
        a aVar = a.f15963a;
        if (this.zza != 0) {
            uVar = (u) this.zze;
            t.v0(obj);
        } else {
            t.v0(obj);
            d0 d0Var = (d0) this.zze;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzc().iterator();
            while (it.hasNext()) {
                arrayList.add(z6.a.e(d0Var, null, new zze((zza) it.next(), this.zzc, this.zzd, null), 3));
            }
            u uVar2 = new u();
            h0[] h0VarArr = (h0[]) arrayList.toArray(new h0[0]);
            h0[] h0VarArr2 = (h0[]) Arrays.copyOf(h0VarArr, h0VarArr.length);
            this.zze = uVar2;
            this.zza = 1;
            Object objE = d7.a.e(h0VarArr2, this);
            if (objE == aVar) {
                return aVar;
            }
            uVar = uVar2;
            obj = objE;
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            Throwable thA = h.a(((h) it2.next()).f13229a);
            if (thA != null) {
                if (uVar.f4952a == null) {
                    zzpVar = thA instanceof zzp ? (zzp) thA : null;
                } else {
                    zzpVar = new zzp(zzn.zzc, zzl.zzal, null);
                }
                uVar.f4952a = zzpVar;
            }
        }
        zzp zzpVar2 = (zzp) uVar.f4952a;
        return new h(zzpVar2 != null ? t.N(zzpVar2) : l.f13235a);
    }
}
