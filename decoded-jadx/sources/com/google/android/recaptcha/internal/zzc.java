package com.google.android.recaptcha.internal;

import c9.e;
import d7.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m9.d0;
import m9.h0;
import q8.g;
import q8.h;
import q8.l;
import v8.a;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
final class zzc extends i implements e {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zzg zzgVar, String str, long j10, u8.e eVar) {
        super(2, eVar);
        this.zzb = zzgVar;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        zzc zzcVar = new zzc(this.zzb, this.zzc, this.zzd, eVar);
        zzcVar.zze = obj;
        return zzcVar;
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzc) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f15963a;
        int i10 = this.zza;
        t.v0(obj);
        if (i10 == 0) {
            d0 d0Var = (d0) this.zze;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzc().iterator();
            while (it.hasNext()) {
                arrayList.add(z6.a.e(d0Var, null, new zzb((zza) it.next(), this.zzc, this.zzd, null), 3));
            }
            h0[] h0VarArr = (h0[]) arrayList.toArray(new h0[0]);
            h0[] h0VarArr2 = (h0[]) Arrays.copyOf(h0VarArr, h0VarArr.length);
            this.zza = 1;
            obj = d7.a.e(h0VarArr2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        String str = this.zzc;
        zzof zzofVarZzf = zzog.zzf();
        zzofVarZzf.zzd(str);
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            Object obj2 = ((h) it2.next()).f13229a;
            if (!(obj2 instanceof g)) {
                zzofVarZzf.zzg((zzog) obj2);
            }
        }
        return (zzog) zzofVarZzf.zzj();
    }
}
