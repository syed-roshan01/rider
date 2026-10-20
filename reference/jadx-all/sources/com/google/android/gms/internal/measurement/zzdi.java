package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import f6.a;
import g6.b;
import h6.e;

/* JADX INFO: loaded from: classes.dex */
final class zzdi extends zzdf.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Context zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ zzdf zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdi(zzdf zzdfVar, String str, String str2, Context context, Bundle bundle) {
        super(zzdfVar);
        this.zzg = zzdfVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        String str;
        String str2;
        String str3;
        try {
            if (this.zzg.zzc(this.zzc, this.zzd)) {
                str3 = this.zzd;
                str2 = this.zzc;
                str = this.zzg.zzc;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            a.x(this.zze);
            zzdf zzdfVar = this.zzg;
            zzdfVar.zzj = zzdfVar.zza(this.zze, true);
            if (this.zzg.zzj == null) {
                Log.w(this.zzg.zzc, "Failed to connect to measurement client.");
                return;
            }
            int iA = e.a(this.zze, ModuleDescriptor.MODULE_ID);
            int iD = e.d(this.zze, ModuleDescriptor.MODULE_ID, false);
            zzdd zzddVar = new zzdd(82001L, Math.max(iA, iD), iD < iA, str, str2, str3, this.zzf, s.b(this.zze));
            zzcu zzcuVar = this.zzg.zzj;
            a.x(zzcuVar);
            zzcuVar.initialize(new b(this.zze), zzddVar, this.zza);
        } catch (Exception e4) {
            this.zzg.zza(e4, true, false);
        }
    }
}
