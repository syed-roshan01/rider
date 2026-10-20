package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import d7.t;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import l9.d;
import q8.h;
import u8.e;
import u8.j;
import v8.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzaw implements RecaptchaClient, RecaptchaTasksClient {
    public static final zzan zza = new zzan(null);
    private static final d zzb = new d("^[a-zA-Z0-9/_]{0,100}$");
    private final Application zzc;
    private final zzg zzd;
    private final String zze;
    private final zzab zzf;
    private final zzoe zzg;
    private final zzbd zzh;
    private final zzbg zzi;
    private final zzq zzj;
    private final zzbs zzk;
    private final zzt zzl;

    public zzaw(Application application, zzg zzgVar, String str, zzt zztVar, zzab zzabVar, zzoe zzoeVar, zzbd zzbdVar, zzbg zzbgVar, zzq zzqVar, zzbs zzbsVar) {
        this.zzc = application;
        this.zzd = zzgVar;
        this.zze = str;
        this.zzl = zztVar;
        this.zzf = zzabVar;
        this.zzg = zzoeVar;
        this.zzh = zzbdVar;
        this.zzi = zzbgVar;
        this.zzj = zzqVar;
        this.zzk = zzbsVar;
    }

    public static final /* synthetic */ void zzi(zzaw zzawVar, long j10, RecaptchaAction recaptchaAction, zzbd zzbdVar) throws zzp {
        zzbb zzbbVarZza = zzbdVar.zza(zzne.EXECUTE_NATIVE);
        zzbg zzbgVar = zzawVar.zzi;
        zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
        zzp zzpVar = !zzb.a(recaptchaAction.getAction()) ? new zzp(zzn.zzi, zzl.zzq, null) : null;
        if (j10 < 5000) {
            zzpVar = new zzp(zzn.zzc, zzl.zzT, null);
        }
        if (zzpVar == null) {
            zzawVar.zzi.zza(zzbbVarZza);
        } else {
            zzawVar.zzi.zzb(zzbbVarZza, zzpVar, null);
            throw zzpVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzj(long j10, String str, zzbd zzbdVar, e eVar) throws zzp {
        zzao zzaoVar;
        Exception e4;
        zzaw zzawVar;
        zzbb zzbbVar;
        zzp zzpVar;
        if (eVar instanceof zzao) {
            zzaoVar = (zzao) eVar;
            int i10 = zzaoVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzaoVar.zzc = i10 - Integer.MIN_VALUE;
            } else {
                zzaoVar = new zzao(this, eVar);
            }
        } else {
            zzaoVar = new zzao(this, eVar);
        }
        Object objZza = zzaoVar.zza;
        a aVar = a.f15963a;
        int i11 = zzaoVar.zzc;
        if (i11 == 0) {
            t.v0(objZza);
            zzbb zzbbVarZza = zzbdVar.zza(zzne.COLLECT_SIGNALS);
            zzbg zzbgVar = this.zzi;
            zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
            try {
                zzg zzgVar = this.zzd;
                zzaoVar.zzd = this;
                zzaoVar.zze = zzbbVarZza;
                zzaoVar.zzc = 1;
                objZza = zzgVar.zza(str, j10, zzaoVar);
                if (objZza == aVar) {
                    return aVar;
                }
                zzawVar = this;
                zzbbVar = zzbbVarZza;
            } catch (Exception e10) {
                e4 = e10;
                zzawVar = this;
                zzbbVar = zzbbVarZza;
                if (e4 instanceof zzp) {
                    zzpVar = (zzp) e4;
                } else {
                    zzpVar = new zzp(zzn.zzc, zzl.zzan, null);
                }
                zzawVar.zzi.zzb(zzbbVar, zzpVar, null);
                throw zzpVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzbbVar = zzaoVar.zze;
            zzawVar = zzaoVar.zzd;
            try {
                t.v0(objZza);
            } catch (Exception e11) {
                e4 = e11;
                if (e4 instanceof zzp) {
                    zzpVar = (zzp) e4;
                } else {
                    zzpVar = new zzp(zzn.zzc, zzl.zzan, null);
                }
                zzawVar.zzi.zzb(zzbbVar, zzpVar, null);
                throw zzpVar;
            }
        }
        zzog zzogVar = (zzog) objZza;
        zzawVar.zzi.zza(zzbbVar);
        return zzogVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final Object zzk(RecaptchaAction recaptchaAction, long j10, e eVar) throws Throwable {
        zzas zzasVar;
        zzaw zzawVar;
        zzbd zzbdVar;
        zzp zzpVar;
        if (eVar instanceof zzas) {
            zzasVar = (zzas) eVar;
            int i10 = zzasVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzasVar.zzc = i10 - Integer.MIN_VALUE;
            } else {
                zzasVar = new zzas(this, eVar);
            }
        } else {
            zzasVar = new zzas(this, eVar);
        }
        zzas zzasVar2 = zzasVar;
        Object objW0 = zzasVar2.zza;
        a aVar = a.f15963a;
        int i11 = zzasVar2.zzc;
        if (i11 == 0) {
            t.v0(objW0);
            String string = UUID.randomUUID().toString();
            zzbd zzbdVarZzb = this.zzh.zzb();
            zzbdVarZzb.zzc(string);
            zzbg zzbgVar = this.zzi;
            zzbb zzbbVarZza = zzbdVarZzb.zza(zzne.EXECUTE_TOTAL);
            zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
            try {
                zzat zzatVar = new zzat(this, j10, recaptchaAction, zzbdVarZzb, string, null);
                zzasVar2.zzd = this;
                zzasVar2.zze = zzbdVarZzb;
                zzasVar2.zzc = 1;
                objW0 = z6.a.w0(j10, zzatVar, zzasVar2);
                if (objW0 == aVar) {
                    return aVar;
                }
                zzawVar = this;
                zzbdVar = zzbdVarZzb;
            } catch (Exception e4) {
                e = e4;
                zzawVar = this;
                zzbdVar = zzbdVarZzb;
                if (e instanceof zzp) {
                    zzpVar = (zzp) e;
                } else {
                    zzpVar = new zzp(zzn.zzc, zzl.zzaj, e.getClass().getSimpleName());
                }
                zzawVar.zzi.zzb(zzbdVar.zza(zzne.EXECUTE_TOTAL), zzpVar, null);
                return t.N(zzpVar.zzc());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzbdVar = zzasVar2.zze;
            zzawVar = zzasVar2.zzd;
            try {
                t.v0(objW0);
            } catch (Exception e10) {
                e = e10;
                if (e instanceof zzp) {
                    zzpVar = (zzp) e;
                } else {
                    zzpVar = new zzp(zzn.zzc, zzl.zzaj, e.getClass().getSimpleName());
                }
                zzawVar.zzi.zzb(zzbdVar.zza(zzne.EXECUTE_TOTAL), zzpVar, null);
                return t.N(zzpVar.zzc());
            }
        }
        return ((h) objW0).f13229a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl(zzol zzolVar, zzbd zzbdVar) throws zzp {
        zzbb zzbbVarZza = zzbdVar.zza(zzne.POST_EXECUTE);
        zzbg zzbgVar = this.zzi;
        zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
        try {
            List<zzon> listZzj = zzolVar.zzj();
            int iT = z6.a.T(f9.a.y0(listZzj));
            if (iT < 16) {
                iT = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iT);
            for (zzon zzonVar : listZzj) {
                linkedHashMap.put(zzonVar.zzg(), zzonVar.zzi());
            }
            this.zzj.zzb(linkedHashMap);
            this.zzi.zza(zzbbVarZza);
        } catch (Exception e4) {
            zzp zzpVar = e4 instanceof zzp ? (zzp) e4 : new zzp(zzn.zzc, zzl.zzan, null);
            this.zzi.zzb(zzbbVarZza, zzpVar, null);
            throw zzpVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-0E7RQCE */
    public final Object mo2120execute0E7RQCE(RecaptchaAction recaptchaAction, long j10, e eVar) throws Throwable {
        zzap zzapVar;
        if (eVar instanceof zzap) {
            zzapVar = (zzap) eVar;
            int i10 = zzapVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzapVar.zzc = i10 - Integer.MIN_VALUE;
            } else {
                zzapVar = new zzap(this, eVar);
            }
        } else {
            zzapVar = new zzap(this, eVar);
        }
        Object objU0 = zzapVar.zza;
        a aVar = a.f15963a;
        int i11 = zzapVar.zzc;
        if (i11 == 0) {
            t.v0(objU0);
            j jVarQ = this.zzl.zzb().q();
            zzaq zzaqVar = new zzaq(this, recaptchaAction, j10, null);
            zzapVar.zzc = 1;
            objU0 = z6.a.u0(jVarQ, zzaqVar, zzapVar);
            if (objU0 == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.v0(objU0);
        }
        return ((h) objU0).f13229a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-gIAlu-s */
    public final Object mo2121executegIAlus(RecaptchaAction recaptchaAction, e eVar) throws Throwable {
        zzar zzarVar;
        if (eVar instanceof zzar) {
            zzarVar = (zzar) eVar;
            int i10 = zzarVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzarVar.zzc = i10 - Integer.MIN_VALUE;
            } else {
                zzarVar = new zzar(this, eVar);
            }
        } else {
            zzarVar = new zzar(this, eVar);
        }
        Object obj = zzarVar.zza;
        Object obj2 = a.f15963a;
        int i11 = zzarVar.zzc;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.v0(obj);
            return ((h) obj).f13229a;
        }
        t.v0(obj);
        zzarVar.zzc = 1;
        Object objMo2120execute0E7RQCE = mo2120execute0E7RQCE(recaptchaAction, 10000L, zzarVar);
        return objMo2120execute0E7RQCE == obj2 ? obj2 : objMo2120execute0E7RQCE;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzj.zza(z6.a.e(this.zzl.zzb(), null, new zzau(this, recaptchaAction, 10000L, null), 3));
    }

    public final String zzg() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j10) {
        return zzj.zza(z6.a.e(this.zzl.zzb(), null, new zzau(this, recaptchaAction, j10, null), 3));
    }
}
