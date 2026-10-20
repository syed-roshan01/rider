package com.google.android.recaptcha.internal;

import d7.a;
import d7.t;
import d9.f;
import java.util.ArrayList;
import java.util.List;
import q8.h;
import r8.r;
import u8.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzg {
    private final List zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzg() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Object zza(String str, long j10, e eVar) {
        return a.q(new zzc(this, str, j10, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzb(long j10, zzoe zzoeVar, e eVar) {
        zzd zzdVar;
        if (eVar instanceof zzd) {
            zzdVar = (zzd) eVar;
            int i10 = zzdVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzdVar.zzc = i10 - Integer.MIN_VALUE;
            } else {
                zzdVar = new zzd(this, eVar);
            }
        } else {
            zzdVar = new zzd(this, eVar);
        }
        Object objQ = zzdVar.zza;
        v8.a aVar = v8.a.f15963a;
        int i11 = zzdVar.zzc;
        if (i11 == 0) {
            t.v0(objQ);
            zzf zzfVar = new zzf(this, j10, zzoeVar, null);
            zzdVar.zzc = 1;
            objQ = a.q(zzfVar, zzdVar);
            if (objQ == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.v0(objQ);
        }
        return ((h) objQ).f13229a;
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zza zzaVar) {
        this.zza.add(zzaVar);
    }

    public /* synthetic */ zzg(List list, int i10, f fVar) {
        r rVar = r.f13661a;
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        arrayList.addAll(rVar);
    }
}
