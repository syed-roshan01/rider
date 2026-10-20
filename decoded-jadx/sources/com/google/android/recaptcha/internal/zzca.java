package com.google.android.recaptcha.internal;

import d7.a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import m9.d0;
import q8.l;
import r8.p;
import u8.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzca implements zzbu {
    public static final zzbv zza = new zzbv(null);
    private final d0 zzb;
    private final zzcl zzc;
    private final zzee zzd;
    private final Map zze;
    private final Map zzf;

    public zzca(d0 d0Var, zzcl zzclVar, zzee zzeeVar, Map map) {
        this.zzb = d0Var;
        this.zzc = zzclVar;
        this.zzd = zzeeVar;
        this.zze = map;
        this.zzf = zzclVar.zzb().zzc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzcj zzcjVar, e eVar) {
        Object objQ = a.q(new zzbx(zzcjVar, list, this, null), eVar);
        return objQ == v8.a.f15963a ? objQ : l.f13235a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzcj zzcjVar, e eVar) {
        Object objQ = a.q(new zzby(exc, zzcjVar, this, null), eVar);
        return objQ == v8.a.f15963a ? objQ : l.f13235a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzi(zzpr zzprVar, zzcj zzcjVar) throws zzae {
        zzfh zzfhVarZzb = zzfh.zzb();
        int iZza = zzcjVar.zza();
        zzdd zzddVar = (zzdd) this.zze.get(Integer.valueOf(zzprVar.zzf()));
        if (zzddVar == null) {
            throw new zzae(5, 2, null);
        }
        int iZzg = zzprVar.zzg();
        zzpq[] zzpqVarArr = (zzpq[]) zzprVar.zzj().toArray(new zzpq[0]);
        zzddVar.zza(iZzg, zzcjVar, (zzpq[]) Arrays.copyOf(zzpqVarArr, zzpqVarArr.length));
        if (iZza == zzcjVar.zza()) {
            zzcjVar.zzg(zzcjVar.zza() + 1);
        }
        zzfhVarZzb.zzf();
        long jZza = zzfhVarZzb.zza(TimeUnit.MICROSECONDS);
        zzv zzvVar = zzv.zza;
        int iZzk = zzprVar.zzk();
        if (iZzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzv.zza(iZzk - 2, jZza);
        zzprVar.zzk();
        zzprVar.zzg();
        p.K0(zzprVar.zzj(), null, null, null, new zzbw(this), 31);
    }

    @Override // com.google.android.recaptcha.internal.zzbu
    public final void zza(String str) {
        z6.a.Q(this.zzb, null, 0, new zzbz(new zzcj(this.zzc), this, str, null), 3);
    }
}
