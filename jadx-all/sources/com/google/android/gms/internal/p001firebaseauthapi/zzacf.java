package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.RemoteException;
import c6.a;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;

/* JADX INFO: loaded from: classes.dex */
public class zzacf {
    private final zzacc zza;
    private final a zzb;

    public zzacf(zzacf zzacfVar) {
        this(zzacfVar.zza, zzacfVar.zzb);
    }

    public final void zza(String str) {
        try {
            this.zza.zza(str);
        } catch (RemoteException e4) {
            this.zzb.a(e4, "RemoteException when sending auto retrieval timeout response.", new Object[0]);
        }
    }

    public void zzb(String str) {
        try {
            this.zza.zzb(str);
        } catch (RemoteException e4) {
            this.zzb.a(e4, "RemoteException when sending send verification code response.", new Object[0]);
        }
    }

    public final void zzc(String str) {
        try {
            this.zza.zzc(str);
        } catch (RemoteException e4) {
            this.zzb.a(e4, "RemoteException when sending set account info response.", new Object[0]);
        }
    }

    public final void zza(zzaem zzaemVar) {
        try {
            this.zza.zza(zzaemVar);
        } catch (RemoteException e4) {
            this.zzb.a(e4, "RemoteException when sending create auth uri response.", new Object[0]);
        }
    }

    public final void zzb() {
        try {
            this.zza.zzb();
        } catch (RemoteException e4) {
            this.zzb.a(e4, "RemoteException when sending email verification response.", new Object[0]);
        }
    }

    public final void zzc() {
        try {
            this.zza.zzc();
        } catch (RemoteException e4) {
            this.zzb.a(e4, "RemoteException when setting FirebaseUI Version", new Object[0]);
        }
    }

    public zzacf(zzacc zzaccVar, a aVar) {
        if (zzaccVar == null) {
            throw new NullPointerException("null reference");
        }
        this.zza = zzaccVar;
        if (aVar == null) {
            throw new NullPointerException("null reference");
        }
        this.zzb = aVar;
    }

    public final void zza() {
        try {
            this.zza.zza();
        } catch (RemoteException e4) {
            this.zzb.a(e4, "RemoteException when sending delete account response.", new Object[0]);
        }
    }

    public final void zza(zzyj zzyjVar) {
        try {
            this.zza.zza(zzyjVar);
        } catch (RemoteException e4) {
            this.zzb.a(e4, "RemoteException when sending failure result with credential", new Object[0]);
        }
    }

    public final void zza(zzyi zzyiVar) {
        try {
            this.zza.zza(zzyiVar);
        } catch (RemoteException e4) {
            this.zzb.a(e4, "RemoteException when sending failure result for mfa", new Object[0]);
        }
    }

    public final void zza(Status status, PhoneAuthCredential phoneAuthCredential) {
        try {
            this.zza.zza(status, phoneAuthCredential);
        } catch (RemoteException e4) {
            this.zzb.a(e4, "RemoteException when sending failure result.", new Object[0]);
        }
    }

    public void zza(Status status) {
        try {
            this.zza.zza(status);
        } catch (RemoteException e4) {
            this.zzb.a(e4, "RemoteException when sending failure result.", new Object[0]);
        }
    }

    public final void zza(zzafi zzafiVar) {
        try {
            this.zza.zza(zzafiVar);
        } catch (RemoteException e4) {
            this.zzb.a(e4, "RemoteException when sending Play Integrity Producer project response.", new Object[0]);
        }
    }

    public final void zza(zzafj zzafjVar) {
        try {
            this.zza.zza(zzafjVar);
        } catch (RemoteException e4) {
            this.zzb.a(e4, "RemoteException when sending get recaptcha config response.", new Object[0]);
        }
    }

    public final void zza(zzafm zzafmVar, zzafb zzafbVar) {
        try {
            this.zza.zza(zzafmVar, zzafbVar);
        } catch (RemoteException e4) {
            this.zzb.a(e4, "RemoteException when sending get token and account info user response", new Object[0]);
        }
    }

    public final void zza(zzafv zzafvVar) {
        try {
            this.zza.zza(zzafvVar);
        } catch (RemoteException e4) {
            this.zzb.a(e4, "RemoteException when sending password reset response.", new Object[0]);
        }
    }

    public final void zza(zzaga zzagaVar) {
        try {
            this.zza.zza(zzagaVar);
        } catch (RemoteException e4) {
            this.zzb.a(e4, "RemoteException when sending revoke token response.", new Object[0]);
        }
    }

    public final void zza(zzagi zzagiVar) {
        try {
            this.zza.zza(zzagiVar);
        } catch (RemoteException e4) {
            this.zzb.a(e4, "RemoteException when sending start mfa enrollment response.", new Object[0]);
        }
    }

    public final void zza(zzafm zzafmVar) {
        try {
            this.zza.zza(zzafmVar);
        } catch (RemoteException e4) {
            this.zzb.a(e4, "RemoteException when sending token result.", new Object[0]);
        }
    }

    public final void zza(PhoneAuthCredential phoneAuthCredential) {
        try {
            this.zza.zza(phoneAuthCredential);
        } catch (RemoteException e4) {
            this.zzb.a(e4, "RemoteException when sending verification completed response.", new Object[0]);
        }
    }
}
