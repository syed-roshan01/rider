package com.google.android.recaptcha.internal;

import android.content.Context;
import android.webkit.WebView;
import d7.t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m9.d2;
import m9.r;
import m9.s;
import q8.h;
import r8.p;
import u8.e;
import z6.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzez implements zza {
    public static final zzep zza = new zzep(null);
    public r zzb;
    public zzbu zzc;
    private final WebView zzd;
    private final String zze;
    private final Context zzf;
    private final zzab zzg;
    private final zzbd zzh;
    private final zzbg zzi;
    private final zzbq zzj;
    private final Map zzk = zzfa.zza();
    private final Map zzl;
    private final Map zzm;
    private final zzfh zzn;
    private final zzeq zzo;
    private final zzbd zzp;
    private final zzt zzq;

    public zzez(WebView webView, String str, Context context, zzab zzabVar, zzbd zzbdVar, zzt zztVar, zzbg zzbgVar, zzbq zzbqVar) {
        this.zzd = webView;
        this.zze = str;
        this.zzf = context;
        this.zzg = zzabVar;
        this.zzh = zzbdVar;
        this.zzq = zztVar;
        this.zzi = zzbgVar;
        this.zzj = zzbqVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzl = linkedHashMap;
        this.zzm = linkedHashMap;
        this.zzn = zzfh.zzc();
        zzeq zzeqVar = new zzeq(this);
        this.zzo = zzeqVar;
        zzbd zzbdVarZzb = zzbdVar.zzb();
        zzbdVarZzb.zzc(zzbdVar.zzd());
        this.zzp = zzbdVarZzb;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(zzeqVar, "RN");
        webView.setWebViewClient(new zzeu(this));
    }

    public static final /* synthetic */ void zzl(zzez zzezVar, zzoe zzoeVar) {
        zzezVar.zzd.clearCache(true);
        zzbb zzbbVarZza = zzezVar.zzp.zza(zzne.INIT_NETWORK);
        zzbg zzbgVar = zzezVar.zzi;
        zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
        a.Q(zzezVar.zzq.zza(), null, 0, new zzey(zzezVar, zzoeVar, zzbbVarZza, null), 3);
    }

    public static final /* synthetic */ void zzm(zzez zzezVar, String str) {
        zzbb zzbbVarZza = zzezVar.zzp.zza(zzne.LOAD_WEBVIEW);
        try {
            zzbg zzbgVar = zzezVar.zzi;
            zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
            zzezVar.zzd.loadDataWithBaseURL(zzezVar.zzg.zza(), str, "text/html", "utf-8", null);
        } catch (Exception unused) {
            zzp zzpVar = new zzp(zzn.zzc, zzl.zzag, null);
            zzezVar.zzi.zzb(zzbbVarZza, zzpVar, null);
            ((s) zzezVar.zzk()).i0(zzpVar);
        }
    }

    private final zzp zzp(Exception exc, zzp zzpVar) {
        if (exc instanceof d2) {
            return new zzp(zzn.zzc, zzl.zzj, null);
        }
        return exc instanceof zzp ? (zzp) exc : zzpVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zza
    public final Object zza(String str, long j10, e eVar) {
        zzer zzerVar;
        Exception e4;
        zzez zzezVar;
        zzp zzpVarZzp;
        r rVar;
        if (eVar instanceof zzer) {
            zzerVar = (zzer) eVar;
            int i10 = zzerVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzerVar.zzc = i10 - Integer.MIN_VALUE;
            } else {
                zzerVar = new zzer(this, eVar);
            }
        } else {
            zzerVar = new zzer(this, eVar);
        }
        Object objW0 = zzerVar.zza;
        v8.a aVar = v8.a.f15963a;
        int i11 = zzerVar.zzc;
        if (i11 == 0) {
            t.v0(objW0);
            try {
                zzet zzetVar = new zzet(str, this, null);
                zzerVar.zzd = this;
                zzerVar.zze = str;
                zzerVar.zzc = 1;
                objW0 = a.w0(j10, zzetVar, zzerVar);
                if (objW0 == aVar) {
                    return aVar;
                }
                zzezVar = this;
            } catch (Exception e10) {
                e4 = e10;
                zzezVar = this;
                zzpVarZzp = zzezVar.zzp(e4, new zzp(zzn.zzc, zzl.zzai, e4.getClass().getSimpleName()));
                rVar = (r) zzezVar.zzl.remove(str);
                if (rVar != null) {
                    ((s) rVar).i0(zzpVarZzp);
                }
                return t.N(zzpVarZzp);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = zzerVar.zze;
            zzezVar = zzerVar.zzd;
            try {
                t.v0(objW0);
            } catch (Exception e11) {
                e4 = e11;
                zzpVarZzp = zzezVar.zzp(e4, new zzp(zzn.zzc, zzl.zzai, e4.getClass().getSimpleName()));
                rVar = (r) zzezVar.zzl.remove(str);
                if (rVar != null) {
                    ((s) rVar).i0(zzpVarZzp);
                }
                return t.N(zzpVarZzp);
            }
        }
        return (zzog) objW0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e5 A[LOOP:0: B:43:0x00df->B:45:0x00e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zza
    public final Object zzb(long j10, zzoe zzoeVar, e eVar) {
        zzev zzevVar;
        Exception e4;
        zzez zzezVar;
        boolean z10;
        List listD0;
        Long lZza;
        zzp zzpVarZzp;
        Iterator it;
        if (eVar instanceof zzev) {
            zzevVar = (zzev) eVar;
            int i10 = zzevVar.zzd;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzevVar.zzd = i10 - Integer.MIN_VALUE;
            } else {
                zzevVar = new zzev(this, eVar);
            }
        } else {
            zzevVar = new zzev(this, eVar);
        }
        Object objW0 = zzevVar.zzb;
        v8.a aVar = v8.a.f15963a;
        int i11 = zzevVar.zzd;
        if (i11 == 0) {
            t.v0(objW0);
            try {
                zzbg zzbgVar = this.zzi;
                zzbb zzbbVarZza = this.zzp.zza(zzne.INIT_NATIVE);
                zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
                this.zzc = zzo(zzoeVar, new zzag(zzoeVar.zzf()));
                s sVar = new s(true);
                sVar.S(null);
                this.zzb = sVar;
                new Integer(zzk().hashCode());
                zzew zzewVar = new zzew(this, zzoeVar, null);
                zzevVar.zze = this;
                zzevVar.zza = j10;
                zzevVar.zzd = 1;
                objW0 = a.w0(j10, zzewVar, zzevVar);
                if (objW0 == aVar) {
                    return aVar;
                }
                zzezVar = this;
            } catch (Exception e10) {
                e4 = e10;
                zzezVar = this;
                e4.getMessage();
                z10 = e4 instanceof d2;
                if (z10) {
                    listD0 = t.e0(zzne.INIT_TOTAL, zzne.LOAD_WEBVIEW);
                } else {
                    listD0 = t.d0(zzne.INIT_TOTAL);
                }
                lZza = zzezVar.zzo.zza();
                if (z10) {
                    if (lZza != null) {
                        if (lZza.longValue() > j10 - 2000) {
                            zzpVarZzp = zzezVar.zzp(e4, new zzp(zzn.zzc, zzl.zzah, e4.getClass().getSimpleName()));
                        }
                    }
                    zzpVarZzp = new zzp(zzn.zze, zzl.zzS, null);
                } else {
                    zzpVarZzp = zzezVar.zzp(e4, new zzp(zzn.zzc, zzl.zzah, e4.getClass().getSimpleName()));
                }
                it = listD0.iterator();
                while (it.hasNext()) {
                    zzezVar.zzi.zzb(zzezVar.zzp.zza((zzne) it.next()), zzpVarZzp, null);
                }
                return t.N(zzpVarZzp.zzc());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = zzevVar.zza;
            zzezVar = zzevVar.zze;
            try {
                t.v0(objW0);
            } catch (Exception e11) {
                e4 = e11;
                e4.getMessage();
                z10 = e4 instanceof d2;
                if (z10) {
                    listD0 = t.e0(zzne.INIT_TOTAL, zzne.LOAD_WEBVIEW);
                } else {
                    listD0 = t.d0(zzne.INIT_TOTAL);
                }
                lZza = zzezVar.zzo.zza();
                if (z10) {
                    if (lZza != null) {
                        if (lZza.longValue() > j10 - 2000) {
                            zzpVarZzp = zzezVar.zzp(e4, new zzp(zzn.zzc, zzl.zzah, e4.getClass().getSimpleName()));
                        }
                    }
                    zzpVarZzp = new zzp(zzn.zze, zzl.zzS, null);
                } else {
                    zzpVarZzp = zzezVar.zzp(e4, new zzp(zzn.zzc, zzl.zzah, e4.getClass().getSimpleName()));
                }
                it = listD0.iterator();
                while (it.hasNext()) {
                    zzezVar.zzi.zzb(zzezVar.zzp.zza((zzne) it.next()), zzpVarZzp, null);
                }
                return t.N(zzpVarZzp.zzc());
            }
        }
        return ((h) objW0).f13229a;
    }

    public final WebView zzc() {
        return this.zzd;
    }

    public final zzbq zzf() {
        return this.zzj;
    }

    public final zzeq zzg() {
        return this.zzo;
    }

    public final r zzk() {
        r rVar = this.zzb;
        if (rVar != null) {
            return rVar;
        }
        return null;
    }

    public final zzca zzo(zzoe zzoeVar, zzag zzagVar) {
        zzcd zzcdVar = new zzcd(this.zzd, this.zzq.zzb());
        zzef zzefVar = new zzef();
        zzefVar.zzb(p.X0(zzoeVar.zzK()));
        zzcl zzclVar = new zzcl(zzcdVar, zzagVar, new zzaa());
        zzeg zzegVar = new zzeg(zzefVar, new zzed());
        zzclVar.zzf(3, this.zzf);
        zzclVar.zzf(5, zzen.class.getMethod("cs", new Object[0].getClass()));
        zzclVar.zzf(6, new zzeh(this.zzf));
        zzclVar.zzf(7, new zzej());
        zzclVar.zzf(8, new zzeo(this.zzf));
        zzclVar.zzf(9, new zzek(this.zzf));
        zzclVar.zzf(10, new zzei(this.zzf));
        return new zzca(this.zzq.zzc(), zzclVar, zzegVar, zzbt.zza());
    }
}
