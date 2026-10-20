package com.google.android.gms.internal.p001firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.j;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzau;
import f6.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzacw<ResultT, CallbackT> implements zzadh<ResultT> {
    protected final int zza;
    private ResultT zzaa;
    private Status zzab;
    protected FirebaseApp zzc;
    protected FirebaseUser zzd;
    protected CallbackT zze;
    protected zzau zzf;
    protected zzacx<ResultT> zzg;
    protected Executor zzi;
    protected zzafm zzj;
    protected zzafb zzk;
    protected zzaem zzl;
    protected zzafv zzm;
    protected String zzn;
    protected String zzo;
    protected AuthCredential zzp;
    protected String zzq;
    protected String zzr;
    protected zzyi zzs;
    protected zzafj zzt;
    protected zzafi zzu;
    protected zzagi zzv;
    protected zzaga zzw;
    boolean zzx;
    private boolean zzz;
    protected final zzacy zzb = new zzacy(this);
    protected final List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> zzh = new ArrayList();
    private boolean zzy = true;

    public static class zza extends LifecycleCallback {
        private final List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> zza;

        private zza(j jVar, List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list) {
            super(jVar);
            this.mLifecycleFragment.a("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list) {
            j fragment = LifecycleCallback.getFragment(activity);
            if (((zza) fragment.b(zza.class, "PhoneAuthActivityStopCallback")) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzacw(int i10) {
        this.zza = i10;
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzz = true;
        this.zzx = true;
        this.zzaa = resultt;
        this.zzg.zza(resultt, null);
    }

    public final zzacw<ResultT, CallbackT> zza(FirebaseApp firebaseApp) {
        if (firebaseApp == null) {
            throw new NullPointerException("firebaseApp cannot be null");
        }
        this.zzc = firebaseApp;
        return this;
    }

    public final zzacw<ResultT, CallbackT> zza(FirebaseUser firebaseUser) {
        if (firebaseUser == null) {
            throw new NullPointerException("firebaseUser cannot be null");
        }
        this.zzd = firebaseUser;
        return this;
    }

    public final zzacw<ResultT, CallbackT> zza(CallbackT callbackt) {
        if (callbackt == null) {
            throw new NullPointerException("external callback cannot be null");
        }
        this.zze = callbackt;
        return this;
    }

    public final zzacw<ResultT, CallbackT> zza(zzau zzauVar) {
        if (zzauVar != null) {
            this.zzf = zzauVar;
            return this;
        }
        throw new NullPointerException("external failure callback cannot be null");
    }

    public final zzacw<ResultT, CallbackT> zza(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor, String str) {
        PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacksZza = zzads.zza(str, onVerificationStateChangedCallbacks, this);
        synchronized (this.zzh) {
            List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list = this.zzh;
            a.x(onVerificationStateChangedCallbacksZza);
            list.add(onVerificationStateChangedCallbacksZza);
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        if (executor == null) {
            throw new NullPointerException("null reference");
        }
        this.zzi = executor;
        return this;
    }

    public static /* synthetic */ void zza(zzacw zzacwVar) {
        zzacwVar.zzb();
        a.z("no success or failure set on method implementation", zzacwVar.zzz);
    }

    public static /* synthetic */ void zza(zzacw zzacwVar, Status status) {
        zzau zzauVar = zzacwVar.zzf;
        if (zzauVar != null) {
            zzauVar.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzz = true;
        this.zzx = false;
        this.zzab = status;
        this.zzg.zza(null, status);
    }
}
