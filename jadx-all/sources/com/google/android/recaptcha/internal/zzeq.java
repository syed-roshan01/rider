package com.google.android.recaptcha.internal;

import android.webkit.JavascriptInterface;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;
import m9.r;
import m9.s;
import q8.l;

/* JADX INFO: loaded from: classes.dex */
public final class zzeq {
    final /* synthetic */ zzez zza;
    private Long zzb;
    private final zzfh zzc = zzfh.zzb();

    public zzeq(zzez zzezVar) {
        this.zza = zzezVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(String str) {
        zznf zznfVarZzI = zznf.zzI(zzfy.zzh().zzj(str));
        zzez zzezVar = this.zza;
        if (zzezVar.zzg().zzb == null) {
            zzezVar.zzi.zza(zzezVar.zzp.zza(zzne.LOAD_WEBVIEW));
        }
        zzb();
        zzpc zzpcVarZzi = zzpd.zzi();
        zzpcVarZzi.zzd(zznfVarZzI);
        this.zza.zzi.zzd((zzpd) zzpcVarZzi.zzj());
    }

    @JavascriptInterface
    public final void zzlsm(String str) {
        zzb();
        zzpc zzpcVarZzi = zzpd.zzi();
        zzpcVarZzi.zze(zznu.zzi(zzfy.zzh().zzj(str)));
        this.zza.zzi.zzd((zzpd) zzpcVarZzi.zzj());
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzox zzoxVarZzg = zzox.zzg(zzfy.zzh().zzj(str));
        zzoxVarZzg.zzi().name();
        if (zzoxVarZzg.zzi() != zzpb.JS_CODE_SUCCESS) {
            zzoxVarZzg.zzi().name();
            zzo zzoVar = zzp.zza;
            zzp zzpVarZza = zzo.zza(zzoxVarZzg.zzi());
            this.zza.zzk().hashCode();
            ((s) this.zza.zzk()).i0(zzpVarZza);
            return;
        }
        this.zza.zzk().hashCode();
        if (((s) this.zza.zzk()).X(l.f13235a)) {
            return;
        }
        this.zza.zzk().hashCode();
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        zzbu zzbuVar = this.zza.zzc;
        if (zzbuVar == null) {
            zzbuVar = null;
        }
        zzbuVar.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(String str) throws IllegalAccessException, InvocationTargetException {
        zzb();
        zzog zzogVarZzi = zzog.zzi(zzfy.zzh().zzj(str));
        zzogVarZzi.toString();
        r rVar = (r) this.zza.zzl.remove(zzogVarZzi.zzk());
        if (rVar != null) {
            ((s) rVar).X(zzogVarZzi);
        }
    }
}
