package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import d7.t;
import java.util.UUID;
import r2.k;
import u9.a;
import u9.d;
import u9.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzam {
    private static zzaw zzb;
    public static final zzam zza = new zzam();
    private static final String zzc = UUID.randomUUID().toString();
    private static final a zzd = e.a();
    private static final zzt zze = new zzt();
    private static zzg zzf = new zzg(null, 1, 0 == true ? 1 : 0);

    private zzam() {
    }

    public static final Object zzc(Application application, String str, long j10, zzbq zzbqVar, u8.e eVar) {
        return z6.a.u0(zze.zzb().q(), new zzah(application, str, j10, null, null), eVar);
    }

    public static final Task zzd(Application application, String str, long j10) {
        return zzj.zza(z6.a.e(zze.zzb(), null, new zzak(application, str, j10, null), 3));
    }

    public static final zzg zze() {
        return zzf;
    }

    public static final void zzf(zzg zzgVar) {
        zzf = zzgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [u9.d] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.recaptcha.internal.zzai, u8.e, w8.c] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final Object zza(Application application, String str, long j10, zzab zzabVar, WebView webView, zzbq zzbqVar, zzt zztVar, u8.e eVar) throws Throwable {
        ?? zzaiVar;
        ?? r15;
        zzt zztVar2;
        zzab zzabVar2;
        Application application2;
        long j11;
        String str2;
        ?? r21;
        zzbd zzbdVar;
        zzbg zzbgVar;
        zzne zzneVar;
        zzaw zzawVar;
        zzbd zzbdVar2;
        zzbg zzbgVar2;
        ?? r10;
        ?? r16;
        if (eVar instanceof zzai) {
            zzai zzaiVar2 = (zzai) eVar;
            int i10 = zzaiVar2.zzg;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzaiVar2.zzg = i10 - Integer.MIN_VALUE;
                zzaiVar = zzaiVar2;
            } else {
                zzaiVar = new zzai(this, eVar);
            }
        } else {
            zzaiVar = new zzai(this, eVar);
        }
        Object objW0 = zzaiVar.zze;
        v8.a aVar = v8.a.f15963a;
        int i11 = zzaiVar.zzg;
        try {
            try {
                try {
                    if (i11 == 0) {
                        t.v0(objW0);
                        a aVar2 = zzd;
                        zzaiVar.zza = application;
                        zzaiVar.zzb = str;
                        zzaiVar.zzc = zzabVar;
                        zzaiVar.zzi = zztVar;
                        zzaiVar.zzh = aVar2;
                        zzaiVar.zzd = j10;
                        zzaiVar.zzg = 1;
                        ?? r11 = (d) aVar2;
                        if (r11.c(null, zzaiVar) != aVar) {
                            r15 = r11;
                            zztVar2 = zztVar;
                            zzabVar2 = zzabVar;
                            application2 = application;
                            j11 = j10;
                            str2 = str;
                        }
                        return aVar;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zzbgVar2 = (zzbg) zzaiVar.zzc;
                        zzbdVar2 = (zzbd) zzaiVar.zzb;
                        a aVar3 = (a) zzaiVar.zza;
                        try {
                            t.v0(objW0);
                            r10 = aVar3;
                            zzawVar = (zzaw) objW0;
                            zzb = zzawVar;
                            zzbgVar2.zza(zzbdVar2.zza(zzne.INIT_TOTAL));
                            r16 = r10;
                            ((d) r16).d(null);
                            return zzawVar;
                        } catch (RecaptchaException e4) {
                            throw e4;
                        } catch (Exception unused) {
                            throw new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null);
                        }
                    }
                    j11 = zzaiVar.zzd;
                    a aVar4 = zzaiVar.zzh;
                    zzt zztVar3 = zzaiVar.zzi;
                    zzabVar2 = (zzab) zzaiVar.zzc;
                    str2 = (String) zzaiVar.zzb;
                    Application application3 = (Application) zzaiVar.zza;
                    t.v0(objW0);
                    r15 = aVar4;
                    zztVar2 = zztVar3;
                    application2 = application3;
                    if (j11 < 5000) {
                        zzbgVar.zzb(zzbdVar.zza(zzneVar), new zzp(zzn.zzm, zzl.zzT, null), null);
                        throw new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
                    }
                    if (k.checkSelfPermission(application2, "android.permission.INTERNET") != 0) {
                        zzbgVar.zzb(zzbdVar.zza(zzneVar), new zzp(zzn.zze, zzl.zzv, null), null);
                        throw new RecaptchaException(RecaptchaErrorCode.NETWORK_ERROR, null, 2, null);
                    }
                    zzbq zzbqVar2 = new zzbq(new zzy(application2), zzbgVar);
                    zzawVar = zzb;
                    if (zzawVar == null) {
                        zzaiVar.zza = r15;
                        zzaiVar.zzb = zzbdVar;
                        zzaiVar.zzc = zzbgVar;
                        zzaiVar.zzi = null;
                        zzaiVar.zzh = null;
                        zzaiVar.zzg = 2;
                        ?? r22 = r15;
                        objW0 = z6.a.w0(j11, new zzaj(application2, zzabVar2, str2, zzbqVar2, zzbdVar, zztVar2, null, zzbgVar, j11, null), zzaiVar);
                        if (objW0 != aVar) {
                            zzbdVar2 = zzbdVar;
                            zzbgVar2 = zzbgVar;
                            r10 = r22;
                            zzawVar = (zzaw) objW0;
                            zzb = zzawVar;
                            zzbgVar2.zza(zzbdVar2.zza(zzne.INIT_TOTAL));
                            r16 = r10;
                        }
                        return aVar;
                    }
                    if (!d7.a.d(zzawVar.zzg(), str2)) {
                        throw new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, "Only one site key can be used per runtime. The site key you provided " + str2 + " is different than " + zzawVar.zzg());
                    }
                    zzbgVar.zza(zzbdVar.zza(zzneVar));
                    r16 = r15;
                    ((d) r16).d(null);
                    return zzawVar;
                } catch (RecaptchaException e10) {
                    e = e10;
                    throw e;
                } catch (Exception unused2) {
                    throw new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null);
                } catch (Throwable th) {
                    th = th;
                    zzaiVar = r21;
                    ((d) zzaiVar).d(null);
                    throw th;
                }
                String string = UUID.randomUUID().toString();
                zzbdVar = new zzbd(zzc, string, null);
                zzbdVar.zzc(string);
                zzbgVar = new zzbg(str2, application2, zzabVar2, zztVar2, new zzbm(application2, new zzbo(zzabVar2.zzc()), zztVar2.zza()));
                zzneVar = zzne.INIT_TOTAL;
                zzbb zzbbVarZza = zzbdVar.zza(zzneVar);
                zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
            } catch (RecaptchaException e11) {
                e = e11;
            } catch (Exception unused3) {
            } catch (Throwable th2) {
                th = th2;
                r21 = r15;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
