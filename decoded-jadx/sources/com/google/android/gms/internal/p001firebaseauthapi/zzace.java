package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Context;
import c6.a;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.MultiFactorAssertion;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneMultiFactorAssertion;
import com.google.firebase.auth.TotpMultiFactorAssertion;
import com.google.firebase.auth.TotpSecret;
import com.google.firebase.auth.UserProfileChangeRequest;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzace {
    private static final a zza = new a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzyl zzb;
    private final zzadt zzc;

    public zzace(FirebaseApp firebaseApp, ScheduledExecutorService scheduledExecutorService) {
        f6.a.x(firebaseApp);
        Context applicationContext = firebaseApp.getApplicationContext();
        f6.a.x(applicationContext);
        this.zzb = new zzyl(new zzacs(firebaseApp, zzact.zza()));
        this.zzc = new zzadt(applicationContext, scheduledExecutorService);
    }

    public final void zza(String str, String str2, zzacc zzaccVar) {
        f6.a.u(str);
        f6.a.x(zzaccVar);
        this.zzb.zza(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zzb(String str, String str2, zzacc zzaccVar) {
        f6.a.u(str);
        f6.a.u(str2);
        f6.a.x(zzaccVar);
        this.zzb.zzb(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zzc(String str, String str2, zzacc zzaccVar) {
        f6.a.u(str);
        f6.a.u(str2);
        f6.a.x(zzaccVar);
        this.zzb.zzc(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zzd(String str, String str2, zzacc zzaccVar) {
        f6.a.u(str);
        f6.a.x(zzaccVar);
        this.zzb.zzd(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zze(String str, String str2, zzacc zzaccVar) {
        f6.a.u(str);
        this.zzb.zze(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zzf(String str, String str2, zzacc zzaccVar) {
        f6.a.u(str);
        f6.a.u(str2);
        f6.a.x(zzaccVar);
        this.zzb.zzf(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zze(String str, zzacc zzaccVar) {
        f6.a.u(str);
        f6.a.x(zzaccVar);
        this.zzb.zzf(str, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzxx zzxxVar, zzacc zzaccVar) {
        f6.a.x(zzxxVar);
        f6.a.u(zzxxVar.zza());
        f6.a.u(zzxxVar.zzb());
        f6.a.x(zzaccVar);
        this.zzb.zza(zzxxVar.zza(), zzxxVar.zzb(), zzxxVar.zzc(), new zzacf(zzaccVar, zza));
    }

    public final void zzd(String str, zzacc zzaccVar) {
        f6.a.x(zzaccVar);
        this.zzb.zze(str, new zzacf(zzaccVar, zza));
    }

    public final void zzb(String str, zzacc zzaccVar) {
        f6.a.u(str);
        f6.a.x(zzaccVar);
        this.zzb.zzb(str, new zzacf(zzaccVar, zza));
    }

    public final void zzc(String str, zzacc zzaccVar) {
        f6.a.u(str);
        f6.a.x(zzaccVar);
        this.zzb.zzc(str, new zzacf(zzaccVar, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzacc zzaccVar) {
        f6.a.u(str);
        f6.a.u(str2);
        f6.a.x(zzaccVar);
        this.zzb.zzb(str, str2, str3, str4, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzacc zzaccVar) {
        f6.a.u(str);
        f6.a.u(str2);
        f6.a.x(zzaccVar);
        this.zzb.zza(str, str2, str3, str4, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, zzacc zzaccVar) {
        f6.a.u(str);
        f6.a.x(zzaccVar);
        this.zzb.zza(str, new zzacf(zzaccVar, zza));
    }

    public final void zza(MultiFactorAssertion multiFactorAssertion, String str, String str2, String str3, zzacc zzaccVar) {
        zzaeq zzaeqVarZza;
        f6.a.x(multiFactorAssertion);
        f6.a.v("cachedTokenState should not be empty.", str);
        f6.a.x(zzaccVar);
        if (multiFactorAssertion instanceof PhoneMultiFactorAssertion) {
            PhoneAuthCredential phoneAuthCredentialZza = ((PhoneMultiFactorAssertion) multiFactorAssertion).zza();
            String strZzc = phoneAuthCredentialZza.zzc();
            f6.a.x(strZzc);
            String smsCode = phoneAuthCredentialZza.getSmsCode();
            f6.a.x(smsCode);
            zzaeqVarZza = zzaeu.zza(str, strZzc, smsCode, str2, str3);
        } else if (multiFactorAssertion instanceof TotpMultiFactorAssertion) {
            TotpMultiFactorAssertion totpMultiFactorAssertion = (TotpMultiFactorAssertion) multiFactorAssertion;
            TotpSecret totpSecretZza = totpMultiFactorAssertion.zza();
            f6.a.x(totpSecretZza);
            f6.a.u(str2);
            String sessionInfo = totpSecretZza.getSessionInfo();
            f6.a.u(sessionInfo);
            String strZzc2 = totpMultiFactorAssertion.zzc();
            f6.a.u(strZzc2);
            zzaeqVarZza = zzaew.zza(str, str2, sessionInfo, strZzc2, str3);
        } else {
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
        this.zzb.zza(zzaeqVarZza, str, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, MultiFactorAssertion multiFactorAssertion, String str2, zzacc zzaccVar) {
        f6.a.u(str);
        f6.a.x(multiFactorAssertion);
        f6.a.x(zzaccVar);
        if (multiFactorAssertion instanceof PhoneMultiFactorAssertion) {
            PhoneAuthCredential phoneAuthCredentialZza = ((PhoneMultiFactorAssertion) multiFactorAssertion).zza();
            zzyl zzylVar = this.zzb;
            String strZzc = phoneAuthCredentialZza.zzc();
            f6.a.x(strZzc);
            String smsCode = phoneAuthCredentialZza.getSmsCode();
            f6.a.x(smsCode);
            zzylVar.zza(zzaet.zza(str, strZzc, smsCode, str2), new zzacf(zzaccVar, zza));
            return;
        }
        if (multiFactorAssertion instanceof TotpMultiFactorAssertion) {
            TotpMultiFactorAssertion totpMultiFactorAssertion = (TotpMultiFactorAssertion) multiFactorAssertion;
            zzyl zzylVar2 = this.zzb;
            String strZzc2 = totpMultiFactorAssertion.zzc();
            f6.a.u(strZzc2);
            String strZzb = totpMultiFactorAssertion.zzb();
            f6.a.u(strZzb);
            zzylVar2.zza(zzaev.zza(str, strZzc2, str2, strZzb), new zzacf(zzaccVar, zza));
            return;
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public final void zza(zzxw zzxwVar, zzacc zzaccVar) {
        f6.a.x(zzxwVar);
        this.zzb.zza(zzaff.zzb(), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzxz zzxzVar, zzacc zzaccVar) {
        f6.a.x(zzxzVar);
        this.zzb.zza(zzafk.zza(zzxzVar.zzb(), zzxzVar.zza()), new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzacc zzaccVar) {
        f6.a.u(str);
        f6.a.u(str2);
        f6.a.u(str3);
        f6.a.x(zzaccVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, zzags zzagsVar, zzacc zzaccVar) {
        f6.a.u(str);
        f6.a.x(zzagsVar);
        f6.a.x(zzaccVar);
        this.zzb.zza(str, zzagsVar, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzxy zzxyVar, zzacc zzaccVar) {
        f6.a.x(zzaccVar);
        f6.a.x(zzxyVar);
        PhoneAuthCredential phoneAuthCredentialZza = zzxyVar.zza();
        f6.a.x(phoneAuthCredentialZza);
        String strZzb = zzxyVar.zzb();
        f6.a.u(strZzb);
        this.zzb.zza(strZzb, zzadn.zza(phoneAuthCredentialZza), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzafy zzafyVar, zzacc zzaccVar) {
        f6.a.x(zzafyVar);
        this.zzb.zza(zzafyVar, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzyb zzybVar, zzacc zzaccVar) {
        f6.a.x(zzybVar);
        f6.a.u(zzybVar.zzb());
        f6.a.x(zzaccVar);
        this.zzb.zza(zzybVar.zzb(), zzybVar.zza(), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzya zzyaVar, zzacc zzaccVar) {
        f6.a.x(zzyaVar);
        f6.a.u(zzyaVar.zzc());
        f6.a.x(zzaccVar);
        this.zzb.zza(zzyaVar.zzc(), zzyaVar.zza(), zzyaVar.zzd(), zzyaVar.zzb(), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzyd zzydVar, zzacc zzaccVar) {
        f6.a.x(zzaccVar);
        f6.a.x(zzydVar);
        zzafz zzafzVarZza = zzydVar.zza();
        f6.a.x(zzafzVarZza);
        String strZzd = zzafzVarZza.zzd();
        zzacf zzacfVar = new zzacf(zzaccVar, zza);
        if (this.zzc.zzd(strZzd)) {
            if (zzafzVarZza.zze()) {
                this.zzc.zzc(strZzd);
            } else {
                this.zzc.zzb(zzacfVar, strZzd);
                return;
            }
        }
        long jZzb = zzafzVarZza.zzb();
        boolean zZzf = zzafzVarZza.zzf();
        if (zza(jZzb, zZzf)) {
            zzafzVarZza.zza(new zzaed(this.zzc.zzb()));
        }
        this.zzc.zza(strZzd, zzacfVar, jZzb, zZzf);
        this.zzb.zza(zzafzVarZza, this.zzc.zza(zzacfVar, strZzd));
    }

    public final void zza(zzyc zzycVar, zzacc zzaccVar) {
        f6.a.x(zzycVar);
        f6.a.x(zzaccVar);
        this.zzb.zzd(zzycVar.zza(), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzags zzagsVar, zzacc zzaccVar) {
        f6.a.x(zzagsVar);
        f6.a.x(zzaccVar);
        this.zzb.zza(zzagsVar, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzagt zzagtVar, zzacc zzaccVar) {
        f6.a.x(zzagtVar);
        f6.a.x(zzaccVar);
        this.zzb.zza(zzagtVar, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzyf zzyfVar, zzacc zzaccVar) {
        f6.a.x(zzyfVar);
        f6.a.x(zzyfVar.zza());
        f6.a.x(zzaccVar);
        this.zzb.zza(zzyfVar.zza(), zzyfVar.zzb(), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzye zzyeVar, zzacc zzaccVar) {
        f6.a.x(zzaccVar);
        f6.a.x(zzyeVar);
        PhoneAuthCredential phoneAuthCredentialZza = zzyeVar.zza();
        f6.a.x(phoneAuthCredentialZza);
        this.zzb.zza(zzadn.zza(phoneAuthCredentialZza), new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, String str2, String str3, long j10, boolean z10, boolean z11, String str4, String str5, boolean z12, zzacc zzaccVar) {
        f6.a.v("idToken should not be empty.", str);
        f6.a.x(zzaccVar);
        zzacf zzacfVar = new zzacf(zzaccVar, zza);
        if (this.zzc.zzd(str2)) {
            if (z10) {
                this.zzc.zzc(str2);
            } else {
                this.zzc.zzb(zzacfVar, str2);
                return;
            }
        }
        zzagj zzagjVarZza = zzagj.zza(str, str2, str3, str4, str5, null);
        if (zza(j10, z12)) {
            zzagjVarZza.zza(new zzaed(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzacfVar, j10, z12);
        this.zzb.zza(zzagjVarZza, this.zzc.zza(zzacfVar, str2));
    }

    public final void zza(zzyh zzyhVar, zzacc zzaccVar) {
        f6.a.x(zzyhVar);
        f6.a.x(zzaccVar);
        String phoneNumber = zzyhVar.zzb().getPhoneNumber();
        zzacf zzacfVar = new zzacf(zzaccVar, zza);
        if (this.zzc.zzd(phoneNumber)) {
            if (zzyhVar.zzg()) {
                this.zzc.zzc(phoneNumber);
            } else {
                this.zzc.zzb(zzacfVar, phoneNumber);
                return;
            }
        }
        long jZza = zzyhVar.zza();
        boolean zZzh = zzyhVar.zzh();
        zzagh zzaghVarZza = zzagh.zza(zzyhVar.zzd(), zzyhVar.zzb().getUid(), zzyhVar.zzb().getPhoneNumber(), zzyhVar.zzc(), zzyhVar.zzf(), zzyhVar.zze());
        if (zza(jZza, zZzh)) {
            zzaghVarZza.zza(new zzaed(this.zzc.zzb()));
        }
        this.zzc.zza(phoneNumber, zzacfVar, jZza, zZzh);
        this.zzb.zza(zzaghVarZza, this.zzc.zza(zzacfVar, phoneNumber));
    }

    public final void zza(zzagl zzaglVar, zzacc zzaccVar) {
        if (zzaccVar != null) {
            this.zzb.zza(zzaglVar, new zzacf(zzaccVar, zza));
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final void zza(String str, String str2, String str3, zzacc zzaccVar) {
        f6.a.v("cachedTokenState should not be empty.", str);
        f6.a.v("uid should not be empty.", str2);
        f6.a.x(zzaccVar);
        this.zzb.zzb(str, str2, str3, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzacc zzaccVar) {
        f6.a.u(str);
        f6.a.x(userProfileChangeRequest);
        f6.a.x(zzaccVar);
        this.zzb.zza(str, userProfileChangeRequest, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzyg zzygVar, zzacc zzaccVar) {
        f6.a.x(zzygVar);
        this.zzb.zza(zzafd.zza(zzygVar.zza(), zzygVar.zzb(), zzygVar.zzc()), new zzacf(zzaccVar, zza));
    }

    private static boolean zza(long j10, boolean z10) {
        if (j10 > 0 && z10) {
            return true;
        }
        zza.e("App hash will not be appended to the request.", new Object[0]);
        return false;
    }
}
