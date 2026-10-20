package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001firebaseauthapi.zzaag;
import com.google.android.gms.internal.p001firebaseauthapi.zzach;
import com.google.android.gms.internal.p001firebaseauthapi.zzack;
import com.google.android.gms.internal.p001firebaseauthapi.zzacu;
import com.google.android.gms.internal.p001firebaseauthapi.zzads;
import com.google.android.gms.internal.p001firebaseauthapi.zzaec;
import com.google.android.gms.internal.p001firebaseauthapi.zzafi;
import com.google.android.gms.internal.p001firebaseauthapi.zzafj;
import com.google.android.gms.internal.p001firebaseauthapi.zzafm;
import com.google.android.gms.internal.p001firebaseauthapi.zzafz;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseError;
import com.google.firebase.FirebaseException;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.auth.internal.zzbi;
import com.google.firebase.auth.internal.zzbl;
import com.google.firebase.auth.internal.zzbx;
import com.google.firebase.auth.internal.zzby;
import com.google.firebase.auth.internal.zzcb;
import com.google.firebase.auth.internal.zzcc;
import com.google.firebase.auth.internal.zzce;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.InternalTokenResult;
import f6.a;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseAuth implements InternalAuthProvider {
    private final FirebaseApp zza;
    private final Executor zzaa;
    private String zzab;
    private final List<IdTokenListener> zzb;
    private final List<com.google.firebase.auth.internal.IdTokenListener> zzc;
    private final List<AuthStateListener> zzd;
    private final zzaag zze;
    private FirebaseUser zzf;
    private final com.google.firebase.auth.internal.zzac zzg;
    private final Object zzh;
    private String zzi;
    private final Object zzj;
    private String zzk;
    private zzbx zzl;
    private final RecaptchaAction zzm;
    private final RecaptchaAction zzn;
    private final RecaptchaAction zzo;
    private final RecaptchaAction zzp;
    private final RecaptchaAction zzq;
    private final RecaptchaAction zzr;
    private final zzby zzs;
    private final zzce zzt;
    private final com.google.firebase.auth.internal.zzb zzu;
    private final Provider<InteropAppCheckTokenProvider> zzv;
    private final Provider<HeartBeatController> zzw;
    private zzcb zzx;
    private final Executor zzy;
    private final Executor zzz;

    public interface AuthStateListener {
        void onAuthStateChanged(FirebaseAuth firebaseAuth);
    }

    public interface IdTokenListener {
        void onIdTokenChanged(FirebaseAuth firebaseAuth);
    }

    public class zzb implements com.google.firebase.auth.internal.zzl {
        public zzb() {
        }

        @Override // com.google.firebase.auth.internal.zzl
        public final void zza(zzafm zzafmVar, FirebaseUser firebaseUser) {
            a.x(zzafmVar);
            a.x(firebaseUser);
            firebaseUser.zza(zzafmVar);
            FirebaseAuth.this.zza(firebaseUser, zzafmVar, true);
        }
    }

    public class zzc extends zzb implements com.google.firebase.auth.internal.zzau, com.google.firebase.auth.internal.zzl {
        public zzc(FirebaseAuth firebaseAuth) {
            super();
        }

        @Override // com.google.firebase.auth.internal.zzau
        public final void zza(Status status) {
        }
    }

    public FirebaseAuth(FirebaseApp firebaseApp, Provider<InteropAppCheckTokenProvider> provider, Provider<HeartBeatController> provider2, @Background Executor executor, @Blocking Executor executor2, @Lightweight Executor executor3, @Lightweight ScheduledExecutorService scheduledExecutorService, @UiThread Executor executor4) {
        this(firebaseApp, new zzaag(firebaseApp, executor2, scheduledExecutorService), new zzby(firebaseApp.getApplicationContext(), firebaseApp.getPersistenceKey()), zzce.zzc(), com.google.firebase.auth.internal.zzb.zza(), provider, provider2, executor, executor2, executor3, executor4);
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) FirebaseApp.getInstance().get(FirebaseAuth.class);
    }

    private final synchronized zzcb zzj() {
        return zzj(this);
    }

    public void addAuthStateListener(AuthStateListener authStateListener) {
        this.zzd.add(authStateListener);
        this.zzaa.execute(new zzt(this, authStateListener));
    }

    public void addIdTokenListener(IdTokenListener idTokenListener) {
        this.zzb.add(idTokenListener);
        this.zzaa.execute(new zzk(this, idTokenListener));
    }

    public Task<Void> applyActionCode(String str) {
        a.u(str);
        return this.zze.zza(this.zza, str, this.zzk);
    }

    public Task<ActionCodeResult> checkActionCode(String str) {
        a.u(str);
        return this.zze.zzb(this.zza, str, this.zzk);
    }

    public Task<Void> confirmPasswordReset(String str, String str2) {
        a.u(str);
        a.u(str2);
        return this.zze.zza(this.zza, str, str2, this.zzk);
    }

    public Task<AuthResult> createUserWithEmailAndPassword(String str, String str2) {
        a.u(str);
        a.u(str2);
        return new zzq(this, str, str2).zza(this, this.zzk, this.zzo, "EMAIL_PASSWORD_PROVIDER");
    }

    @Deprecated
    public Task<SignInMethodQueryResult> fetchSignInMethodsForEmail(String str) {
        a.u(str);
        return this.zze.zzc(this.zza, str, this.zzk);
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider, com.google.firebase.internal.InternalTokenProvider
    public Task<GetTokenResult> getAccessToken(boolean z10) {
        return zza(this.zzf, z10);
    }

    public FirebaseApp getApp() {
        return this.zza;
    }

    public FirebaseUser getCurrentUser() {
        return this.zzf;
    }

    public String getCustomAuthDomain() {
        return this.zzab;
    }

    public FirebaseAuthSettings getFirebaseAuthSettings() {
        return this.zzg;
    }

    public String getLanguageCode() {
        String str;
        synchronized (this.zzh) {
            str = this.zzi;
        }
        return str;
    }

    public Task<AuthResult> getPendingAuthResult() {
        return this.zzt.zza();
    }

    public String getTenantId() {
        String str;
        synchronized (this.zzj) {
            str = this.zzk;
        }
        return str;
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider, com.google.firebase.internal.InternalTokenProvider
    public String getUid() {
        FirebaseUser firebaseUser = this.zzf;
        if (firebaseUser == null) {
            return null;
        }
        return firebaseUser.getUid();
    }

    public Task<Void> initializeRecaptchaConfig() {
        if (this.zzl == null) {
            this.zzl = new zzbx(this.zza, this);
        }
        return this.zzl.zza(this.zzk, Boolean.FALSE).continueWithTask(new zzz(this));
    }

    public boolean isSignInWithEmailLink(String str) {
        return EmailAuthCredential.zza(str);
    }

    public void removeAuthStateListener(AuthStateListener authStateListener) {
        this.zzd.remove(authStateListener);
    }

    public void removeIdTokenListener(IdTokenListener idTokenListener) {
        this.zzb.remove(idTokenListener);
    }

    public Task<Void> revokeAccessToken(String str) {
        a.u(str);
        FirebaseUser currentUser = getCurrentUser();
        a.x(currentUser);
        return currentUser.getIdToken(false).continueWithTask(new zzv(this, str));
    }

    public Task<Void> sendPasswordResetEmail(String str) {
        a.u(str);
        return sendPasswordResetEmail(str, null);
    }

    public Task<Void> sendSignInLinkToEmail(String str, ActionCodeSettings actionCodeSettings) {
        a.u(str);
        a.x(actionCodeSettings);
        if (!actionCodeSettings.canHandleCodeInApp()) {
            throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
        }
        String str2 = this.zzi;
        if (str2 != null) {
            actionCodeSettings.zza(str2);
        }
        return new zzs(this, str, actionCodeSettings).zza(this, this.zzk, this.zzm, "EMAIL_PASSWORD_PROVIDER");
    }

    public void setCustomAuthDomain(String str) {
        a.u(str);
        if (str.startsWith("chrome-extension://")) {
            this.zzab = str;
            return;
        }
        try {
            String host = new URI(str.contains("://") ? str : "http://".concat(str)).getHost();
            a.x(host);
            this.zzab = host;
        } catch (URISyntaxException e4) {
            if (Log.isLoggable("FirebaseAuth", 4)) {
                Log.i("FirebaseAuth", "Error parsing URL: '" + str + "', " + e4.getMessage());
            }
            this.zzab = str;
        }
    }

    public Task<Void> setFirebaseUIVersion(String str) {
        return this.zze.zza(str);
    }

    public void setLanguageCode(String str) {
        a.u(str);
        synchronized (this.zzh) {
            this.zzi = str;
        }
    }

    public void setTenantId(String str) {
        a.u(str);
        synchronized (this.zzj) {
            this.zzk = str;
        }
    }

    public Task<AuthResult> signInAnonymously() {
        FirebaseUser firebaseUser = this.zzf;
        if (firebaseUser == null || !firebaseUser.isAnonymous()) {
            return this.zze.zza(this.zza, new zzb(), this.zzk);
        }
        com.google.firebase.auth.internal.zzaf zzafVar = (com.google.firebase.auth.internal.zzaf) this.zzf;
        zzafVar.zza(false);
        return Tasks.forResult(new com.google.firebase.auth.internal.zzz(zzafVar));
    }

    public Task<AuthResult> signInWithCredential(AuthCredential authCredential) {
        a.x(authCredential);
        AuthCredential authCredentialZza = authCredential.zza();
        if (!(authCredentialZza instanceof EmailAuthCredential)) {
            if (authCredentialZza instanceof PhoneAuthCredential) {
                return this.zze.zza(this.zza, (PhoneAuthCredential) authCredentialZza, this.zzk, (com.google.firebase.auth.internal.zzl) new zzb());
            }
            return this.zze.zza(this.zza, authCredentialZza, this.zzk, new zzb());
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredentialZza;
        if (emailAuthCredential.zzf()) {
            String strZze = emailAuthCredential.zze();
            a.u(strZze);
            return zzb(strZze) ? Tasks.forException(zzach.zza(new Status(17072, null))) : zza(emailAuthCredential, (FirebaseUser) null, false);
        }
        String strZzc = emailAuthCredential.zzc();
        String strZzd = emailAuthCredential.zzd();
        a.x(strZzd);
        return zza(strZzc, strZzd, this.zzk, (FirebaseUser) null, false);
    }

    public Task<AuthResult> signInWithCustomToken(String str) {
        a.u(str);
        return this.zze.zza(this.zza, str, this.zzk, new zzb());
    }

    public Task<AuthResult> signInWithEmailAndPassword(String str, String str2) {
        a.u(str);
        a.u(str2);
        return zza(str, str2, this.zzk, (FirebaseUser) null, false);
    }

    public Task<AuthResult> signInWithEmailLink(String str, String str2) {
        return signInWithCredential(EmailAuthProvider.getCredentialWithLink(str, str2));
    }

    public void signOut() {
        zzh();
        zzcb zzcbVar = this.zzx;
        if (zzcbVar != null) {
            zzcbVar.zza();
        }
    }

    public Task<AuthResult> startActivityForSignInWithProvider(Activity activity, FederatedAuthProvider federatedAuthProvider) {
        a.x(federatedAuthProvider);
        a.x(activity);
        TaskCompletionSource<AuthResult> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.zzt.zza(activity, taskCompletionSource, this)) {
            return Tasks.forException(zzach.zza(new Status(17057, null)));
        }
        zzbl.zza(activity.getApplicationContext(), this);
        federatedAuthProvider.zzc(activity);
        return taskCompletionSource.getTask();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.firebase.auth.FirebaseAuth$zzc, com.google.firebase.auth.internal.zzcc] */
    public Task<Void> updateCurrentUser(FirebaseUser firebaseUser) {
        String str;
        if (firebaseUser == null) {
            throw new IllegalArgumentException("Cannot update current user with null user!");
        }
        String tenantId = firebaseUser.getTenantId();
        if ((tenantId != null && !tenantId.equals(this.zzk)) || ((str = this.zzk) != null && !str.equals(tenantId))) {
            return Tasks.forException(zzach.zza(new Status(17072, null)));
        }
        String apiKey = firebaseUser.zza().getOptions().getApiKey();
        String apiKey2 = this.zza.getOptions().getApiKey();
        if (!firebaseUser.zzc().zzg() || !apiKey2.equals(apiKey)) {
            return zza(firebaseUser, (zzcc) new zzc(this));
        }
        zza(com.google.firebase.auth.internal.zzaf.zza(this.zza, firebaseUser), firebaseUser.zzc(), true);
        return Tasks.forResult(null);
    }

    public void useAppLanguage() {
        synchronized (this.zzh) {
            this.zzi = zzacu.zza();
        }
    }

    public void useEmulator(String str, int i10) {
        a.u(str);
        a.q("Port number must be in the range 0-65535", i10 >= 0 && i10 <= 65535);
        zzaec.zza(this.zza, str, i10);
    }

    public Task<String> verifyPasswordResetCode(String str) {
        a.u(str);
        return this.zze.zzd(this.zza, str, this.zzk);
    }

    public class zza implements com.google.firebase.auth.internal.zzau, com.google.firebase.auth.internal.zzl {
        public zza() {
        }

        @Override // com.google.firebase.auth.internal.zzau
        public final void zza(Status status) {
            int i10 = status.f3150b;
            if (i10 == 17011 || i10 == 17021 || i10 == 17005 || i10 == 17091) {
                FirebaseAuth.this.signOut();
            }
        }

        @Override // com.google.firebase.auth.internal.zzl
        public final void zza(zzafm zzafmVar, FirebaseUser firebaseUser) {
            a.x(zzafmVar);
            a.x(firebaseUser);
            firebaseUser.zza(zzafmVar);
            FirebaseAuth.this.zza(firebaseUser, zzafmVar, true, true);
        }
    }

    private static zzcb zzj(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.zzx == null) {
            FirebaseApp firebaseApp = firebaseAuth.zza;
            a.x(firebaseApp);
            firebaseAuth.zzx = new zzcb(firebaseApp);
        }
        return firebaseAuth.zzx;
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider
    public void removeIdTokenListener(com.google.firebase.auth.internal.IdTokenListener idTokenListener) {
        a.x(idTokenListener);
        this.zzc.remove(idTokenListener);
        zzj().zza(this.zzc.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzcc] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzcc] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task<Void> zzb(FirebaseUser firebaseUser, AuthCredential authCredential) {
        a.x(firebaseUser);
        a.x(authCredential);
        AuthCredential authCredentialZza = authCredential.zza();
        if (!(authCredentialZza instanceof EmailAuthCredential)) {
            return authCredentialZza instanceof PhoneAuthCredential ? this.zze.zza(this.zza, firebaseUser, (PhoneAuthCredential) authCredentialZza, this.zzk, (zzcc) new zza()) : this.zze.zzb(this.zza, firebaseUser, authCredentialZza, firebaseUser.getTenantId(), (zzcc) new zza());
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredentialZza;
        if ("password".equals(emailAuthCredential.getSignInMethod())) {
            return zza(firebaseUser, emailAuthCredential, false);
        }
        String strZze = emailAuthCredential.zze();
        a.u(strZze);
        return zzb(strZze) ? Tasks.forException(zzach.zza(new Status(17072, null))) : zza(firebaseUser, emailAuthCredential, true);
    }

    public final Provider<InteropAppCheckTokenProvider> zzc() {
        return this.zzv;
    }

    public final Provider<HeartBeatController> zzd() {
        return this.zzw;
    }

    public final Executor zze() {
        return this.zzy;
    }

    public final Executor zzf() {
        return this.zzz;
    }

    public final Executor zzg() {
        return this.zzaa;
    }

    public final void zzh() {
        a.x(this.zzs);
        FirebaseUser firebaseUser = this.zzf;
        if (firebaseUser != null) {
            this.zzs.zza(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.getUid()));
            this.zzf = null;
        }
        this.zzs.zza("com.google.firebase.auth.FIREBASE_USER");
        zzb(this, (FirebaseUser) null);
        zza(this, (FirebaseUser) null);
    }

    public final boolean zzi() {
        return zzack.zza(getApp().getApplicationContext());
    }

    @Keep
    public static FirebaseAuth getInstance(FirebaseApp firebaseApp) {
        return (FirebaseAuth) firebaseApp.get(FirebaseAuth.class);
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider
    public void addIdTokenListener(com.google.firebase.auth.internal.IdTokenListener idTokenListener) {
        a.x(idTokenListener);
        this.zzc.add(idTokenListener);
        zzj().zza(this.zzc.size());
    }

    public Task<Void> sendPasswordResetEmail(String str, ActionCodeSettings actionCodeSettings) {
        a.u(str);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.zzb();
        }
        String str2 = this.zzi;
        if (str2 != null) {
            actionCodeSettings.zza(str2);
        }
        actionCodeSettings.zza(1);
        return new zzp(this, str, actionCodeSettings).zza(this, this.zzk, this.zzm, "EMAIL_PASSWORD_PROVIDER");
    }

    public final Task<Void> zza(FirebaseUser firebaseUser) {
        a.x(firebaseUser);
        return this.zze.zza(firebaseUser, new zzu(this, firebaseUser));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzcc] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzcc] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task<AuthResult> zzc(FirebaseUser firebaseUser, AuthCredential authCredential) {
        a.x(firebaseUser);
        a.x(authCredential);
        AuthCredential authCredentialZza = authCredential.zza();
        if (authCredentialZza instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredentialZza;
            if ("password".equals(emailAuthCredential.getSignInMethod())) {
                String strZzc = emailAuthCredential.zzc();
                String strZzd = emailAuthCredential.zzd();
                a.u(strZzd);
                return zza(strZzc, strZzd, firebaseUser.getTenantId(), firebaseUser, true);
            }
            String strZze = emailAuthCredential.zze();
            a.u(strZze);
            if (zzb(strZze)) {
                return Tasks.forException(zzach.zza(new Status(17072, null)));
            }
            return zza(emailAuthCredential, firebaseUser, true);
        }
        if (authCredentialZza instanceof PhoneAuthCredential) {
            return this.zze.zzb(this.zza, firebaseUser, (PhoneAuthCredential) authCredentialZza, this.zzk, (zzcc) new zza());
        }
        return this.zze.zzc(this.zza, firebaseUser, authCredentialZza, firebaseUser.getTenantId(), new zza());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzcc] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task<Void> zzd(FirebaseUser firebaseUser, String str) {
        a.x(firebaseUser);
        a.u(str);
        return this.zze.zzd(this.zza, firebaseUser, str, new zza());
    }

    public final Task<Void> zza(FirebaseUser firebaseUser, MultiFactorAssertion multiFactorAssertion, String str) {
        a.x(firebaseUser);
        a.x(multiFactorAssertion);
        if (multiFactorAssertion instanceof PhoneMultiFactorAssertion) {
            return this.zze.zza(this.zza, (PhoneMultiFactorAssertion) multiFactorAssertion, firebaseUser, str, new zzb());
        }
        if (multiFactorAssertion instanceof TotpMultiFactorAssertion) {
            return this.zze.zza(this.zza, (TotpMultiFactorAssertion) multiFactorAssertion, firebaseUser, str, this.zzk, new zzb());
        }
        return Tasks.forException(zzach.zza(new Status(FirebaseError.ERROR_INTERNAL_ERROR, null)));
    }

    private FirebaseAuth(FirebaseApp firebaseApp, zzaag zzaagVar, zzby zzbyVar, zzce zzceVar, com.google.firebase.auth.internal.zzb zzbVar, Provider<InteropAppCheckTokenProvider> provider, Provider<HeartBeatController> provider2, @Background Executor executor, @Blocking Executor executor2, @Lightweight Executor executor3, @UiThread Executor executor4) {
        zzafm zzafmVarZza;
        this.zzb = new CopyOnWriteArrayList();
        this.zzc = new CopyOnWriteArrayList();
        this.zzd = new CopyOnWriteArrayList();
        this.zzh = new Object();
        this.zzj = new Object();
        this.zzm = RecaptchaAction.custom("getOobCode");
        this.zzn = RecaptchaAction.custom("signInWithPassword");
        this.zzo = RecaptchaAction.custom("signUpPassword");
        this.zzp = RecaptchaAction.custom("sendVerificationCode");
        this.zzq = RecaptchaAction.custom("mfaSmsEnrollment");
        this.zzr = RecaptchaAction.custom("mfaSmsSignIn");
        if (firebaseApp == null) {
            throw new NullPointerException("null reference");
        }
        this.zza = firebaseApp;
        if (zzaagVar == null) {
            throw new NullPointerException("null reference");
        }
        this.zze = zzaagVar;
        if (zzbyVar != null) {
            this.zzs = zzbyVar;
            this.zzg = new com.google.firebase.auth.internal.zzac();
            if (zzceVar == null) {
                throw new NullPointerException("null reference");
            }
            this.zzt = zzceVar;
            if (zzbVar != null) {
                this.zzu = zzbVar;
                this.zzv = provider;
                this.zzw = provider2;
                this.zzy = executor2;
                this.zzz = executor3;
                this.zzaa = executor4;
                FirebaseUser firebaseUserZza = zzbyVar.zza();
                this.zzf = firebaseUserZza;
                if (firebaseUserZza != null && (zzafmVarZza = zzbyVar.zza(firebaseUserZza)) != null) {
                    zza(this, this.zzf, zzafmVarZza, false, false);
                }
                zzceVar.zza(this);
                return;
            }
            throw new NullPointerException("null reference");
        }
        throw new NullPointerException("null reference");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.internal.zzcc, com.google.firebase.auth.zzaa] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task<GetTokenResult> zza(FirebaseUser firebaseUser, boolean z10) {
        if (firebaseUser == null) {
            return Tasks.forException(zzach.zza(new Status(FirebaseError.ERROR_NO_SIGNED_IN_USER, null)));
        }
        zzafm zzafmVarZzc = firebaseUser.zzc();
        if (zzafmVarZzc.zzg() && !z10) {
            return Tasks.forResult(zzbi.zza(zzafmVarZzc.zzc()));
        }
        return this.zze.zza(this.zza, firebaseUser, zzafmVarZzc.zzd(), (zzcc) new zzaa(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzcc] */
    public final Task<Void> zzb(FirebaseUser firebaseUser) {
        return zza(firebaseUser, (zzcc) new zza());
    }

    public final Task<AuthResult> zzb(Activity activity, FederatedAuthProvider federatedAuthProvider, FirebaseUser firebaseUser) {
        a.x(activity);
        a.x(federatedAuthProvider);
        a.x(firebaseUser);
        TaskCompletionSource<AuthResult> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.zzt.zza(activity, taskCompletionSource, this, firebaseUser)) {
            return Tasks.forException(zzach.zza(new Status(17057, null)));
        }
        zzbl.zza(activity.getApplicationContext(), this, firebaseUser);
        federatedAuthProvider.zzb(activity);
        return taskCompletionSource.getTask();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzcc] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task<Void> zzc(FirebaseUser firebaseUser, String str) {
        a.x(firebaseUser);
        a.u(str);
        return this.zze.zzc(this.zza, firebaseUser, str, new zza());
    }

    public final Task<zzafi> zza() {
        return this.zze.zza();
    }

    public final Task<zzafj> zza(String str) {
        return this.zze.zza(this.zzk, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzcc] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task<AuthResult> zza(FirebaseUser firebaseUser, AuthCredential authCredential) {
        a.x(authCredential);
        a.x(firebaseUser);
        if (authCredential instanceof EmailAuthCredential) {
            return new zzn(this, firebaseUser, (EmailAuthCredential) authCredential.zza()).zza(this, firebaseUser.getTenantId(), this.zzo, "EMAIL_PASSWORD_PROVIDER");
        }
        return this.zze.zza(this.zza, firebaseUser, authCredential.zza(), (String) null, (zzcc) new zza());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzcc] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task<AuthResult> zzb(FirebaseUser firebaseUser, String str) {
        a.u(str);
        a.x(firebaseUser);
        return this.zze.zzb(this.zza, firebaseUser, str, new zza());
    }

    private final Task<Void> zza(FirebaseUser firebaseUser, zzcc zzccVar) {
        a.x(firebaseUser);
        return this.zze.zza(this.zza, firebaseUser, zzccVar);
    }

    public final synchronized zzbx zzb() {
        return this.zzl;
    }

    private static void zzb(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + firebaseUser.getUid() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        firebaseAuth.zzaa.execute(new zzy(firebaseAuth, new InternalTokenResult(firebaseUser != null ? firebaseUser.zzd() : null)));
    }

    public final Task<AuthResult> zza(MultiFactorAssertion multiFactorAssertion, com.google.firebase.auth.internal.zzam zzamVar, FirebaseUser firebaseUser) {
        a.x(multiFactorAssertion);
        a.x(zzamVar);
        if (multiFactorAssertion instanceof PhoneMultiFactorAssertion) {
            String strZzc = zzamVar.zzc();
            a.u(strZzc);
            return this.zze.zza(this.zza, firebaseUser, (PhoneMultiFactorAssertion) multiFactorAssertion, strZzc, new zzb());
        }
        if (multiFactorAssertion instanceof TotpMultiFactorAssertion) {
            String strZzc2 = zzamVar.zzc();
            a.u(strZzc2);
            return this.zze.zza(this.zza, firebaseUser, (TotpMultiFactorAssertion) multiFactorAssertion, strZzc2, this.zzk, new zzb());
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    private final boolean zzb(String str) {
        ActionCodeUrl link = ActionCodeUrl.parseLink(str);
        return (link == null || TextUtils.equals(this.zzk, link.zza())) ? false : true;
    }

    public final Task<Void> zza(ActionCodeSettings actionCodeSettings, String str) {
        a.u(str);
        if (this.zzi != null) {
            if (actionCodeSettings == null) {
                actionCodeSettings = ActionCodeSettings.zzb();
            }
            actionCodeSettings.zza(this.zzi);
        }
        return this.zze.zza(this.zza, actionCodeSettings, str);
    }

    public final Task<AuthResult> zza(Activity activity, FederatedAuthProvider federatedAuthProvider, FirebaseUser firebaseUser) {
        a.x(activity);
        a.x(federatedAuthProvider);
        a.x(firebaseUser);
        TaskCompletionSource<AuthResult> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.zzt.zza(activity, taskCompletionSource, this, firebaseUser)) {
            return Tasks.forException(zzach.zza(new Status(17057, null)));
        }
        zzbl.zza(activity.getApplicationContext(), this, firebaseUser);
        federatedAuthProvider.zza(activity);
        return taskCompletionSource.getTask();
    }

    public final Task<TotpSecret> zza(com.google.firebase.auth.internal.zzam zzamVar) {
        a.x(zzamVar);
        return this.zze.zza(zzamVar, this.zzk).continueWithTask(new zzw(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzcc] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task<Void> zza(FirebaseUser firebaseUser, String str) {
        a.x(firebaseUser);
        a.u(str);
        return this.zze.zza(this.zza, firebaseUser, str, this.zzk, (zzcc) new zza()).continueWithTask(new zzr(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzcc] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task<Void> zza(FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential) {
        a.x(firebaseUser);
        a.x(phoneAuthCredential);
        return this.zze.zza(this.zza, firebaseUser, (PhoneAuthCredential) phoneAuthCredential.zza(), (zzcc) new zza());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzcc] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task<Void> zza(FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest) {
        a.x(firebaseUser);
        a.x(userProfileChangeRequest);
        return this.zze.zza(this.zza, firebaseUser, userProfileChangeRequest, (zzcc) new zza());
    }

    public final Task<Void> zza(String str, String str2, ActionCodeSettings actionCodeSettings) {
        a.u(str);
        a.u(str2);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.zzb();
        }
        String str3 = this.zzi;
        if (str3 != null) {
            actionCodeSettings.zza(str3);
        }
        return this.zze.zza(str, str2, actionCodeSettings);
    }

    private final Task<Void> zza(FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, boolean z10) {
        return new zzad(this, z10, firebaseUser, emailAuthCredential).zza(this, this.zzk, z10 ? this.zzm : this.zzn, "EMAIL_PASSWORD_PROVIDER");
    }

    private final Task<AuthResult> zza(String str, String str2, String str3, FirebaseUser firebaseUser, boolean z10) {
        return new zzac(this, str, z10, firebaseUser, str2, str3).zza(this, str3, this.zzn, "EMAIL_PASSWORD_PROVIDER");
    }

    private final Task<AuthResult> zza(EmailAuthCredential emailAuthCredential, FirebaseUser firebaseUser, boolean z10) {
        return new zzab(this, z10, firebaseUser, emailAuthCredential).zza(this, this.zzk, this.zzm, "EMAIL_PASSWORD_PROVIDER");
    }

    public final PhoneAuthProvider.OnVerificationStateChangedCallbacks zza(PhoneAuthOptions phoneAuthOptions, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        return phoneAuthOptions.zzj() ? onVerificationStateChangedCallbacks : new zzo(this, phoneAuthOptions, onVerificationStateChangedCallbacks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhoneAuthProvider.OnVerificationStateChangedCallbacks zza(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        return (this.zzg.zzd() && str != null && str.equals(this.zzg.zza())) ? new zzl(this, onVerificationStateChangedCallbacks) : onVerificationStateChangedCallbacks;
    }

    public static void zza(final FirebaseException firebaseException, PhoneAuthOptions phoneAuthOptions, String str) {
        Log.e("FirebaseAuth", "Invoking verification failure callback for phone number/uid - " + str);
        final PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacksZza = zzads.zza(str, phoneAuthOptions.zze(), null);
        phoneAuthOptions.zzi().execute(new Runnable() { // from class: com.google.firebase.auth.zzi
            @Override // java.lang.Runnable
            public final void run() {
                onVerificationStateChangedCallbacksZza.onVerificationFailed(firebaseException);
            }
        });
    }

    public final synchronized void zza(zzbx zzbxVar) {
        this.zzl = zzbxVar;
    }

    public final void zza(FirebaseUser firebaseUser, zzafm zzafmVar, boolean z10) {
        zza(firebaseUser, zzafmVar, true, false);
    }

    public final void zza(FirebaseUser firebaseUser, zzafm zzafmVar, boolean z10, boolean z11) {
        zza(this, firebaseUser, zzafmVar, true, z11);
    }

    private static void zza(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + firebaseUser.getUid() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.zzaa.execute(new zzx(firebaseAuth));
    }

    private static void zza(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, zzafm zzafmVar, boolean z10, boolean z11) {
        boolean z12;
        a.x(firebaseUser);
        a.x(zzafmVar);
        boolean z13 = true;
        boolean z14 = firebaseAuth.zzf != null && firebaseUser.getUid().equals(firebaseAuth.zzf.getUid());
        if (z14 || !z11) {
            FirebaseUser firebaseUser2 = firebaseAuth.zzf;
            if (firebaseUser2 == null) {
                z12 = true;
            } else {
                boolean z15 = !z14 || (firebaseUser2.zzc().zzc().equals(zzafmVar.zzc()) ^ true);
                z12 = z14 ? false : true;
                z13 = z15;
            }
            if (firebaseAuth.zzf != null && firebaseUser.getUid().equals(firebaseAuth.getUid())) {
                firebaseAuth.zzf.zza(firebaseUser.getProviderData());
                if (!firebaseUser.isAnonymous()) {
                    firebaseAuth.zzf.zzb();
                }
                firebaseAuth.zzf.zzb(firebaseUser.getMultiFactor().getEnrolledFactors());
            } else {
                firebaseAuth.zzf = firebaseUser;
            }
            if (z10) {
                firebaseAuth.zzs.zzb(firebaseAuth.zzf);
            }
            if (z13) {
                FirebaseUser firebaseUser3 = firebaseAuth.zzf;
                if (firebaseUser3 != null) {
                    firebaseUser3.zza(zzafmVar);
                }
                zzb(firebaseAuth, firebaseAuth.zzf);
            }
            if (z12) {
                zza(firebaseAuth, firebaseAuth.zzf);
            }
            if (z10) {
                firebaseAuth.zzs.zza(firebaseUser, zzafmVar);
            }
            FirebaseUser firebaseUser4 = firebaseAuth.zzf;
            if (firebaseUser4 != null) {
                zzj(firebaseAuth).zza(firebaseUser4.zzc());
            }
        }
    }

    public static void zza(PhoneAuthOptions phoneAuthOptions) {
        String str;
        String phoneNumber;
        if (phoneAuthOptions.zzl()) {
            FirebaseAuth firebaseAuthZzb = phoneAuthOptions.zzb();
            MultiFactorSession multiFactorSessionZzc = phoneAuthOptions.zzc();
            a.x(multiFactorSessionZzc);
            com.google.firebase.auth.internal.zzam zzamVar = (com.google.firebase.auth.internal.zzam) multiFactorSessionZzc;
            if (zzamVar.zzd()) {
                String strZzh = phoneAuthOptions.zzh();
                a.u(strZzh);
                phoneNumber = strZzh;
                str = phoneNumber;
            } else {
                PhoneMultiFactorInfo phoneMultiFactorInfoZzf = phoneAuthOptions.zzf();
                a.x(phoneMultiFactorInfoZzf);
                String uid = phoneMultiFactorInfoZzf.getUid();
                a.u(uid);
                str = uid;
                phoneNumber = phoneMultiFactorInfoZzf.getPhoneNumber();
            }
            if (phoneAuthOptions.zzd() == null || !zzads.zza(str, phoneAuthOptions.zze(), phoneAuthOptions.zza(), phoneAuthOptions.zzi())) {
                firebaseAuthZzb.zzu.zza(firebaseAuthZzb, phoneNumber, phoneAuthOptions.zza(), firebaseAuthZzb.zzi(), phoneAuthOptions.zzj(), false, zzamVar.zzd() ? firebaseAuthZzb.zzq : firebaseAuthZzb.zzr).addOnCompleteListener(new zzm(firebaseAuthZzb, phoneAuthOptions, str));
                return;
            }
            return;
        }
        FirebaseAuth firebaseAuthZzb2 = phoneAuthOptions.zzb();
        String strZzh2 = phoneAuthOptions.zzh();
        a.u(strZzh2);
        if (phoneAuthOptions.zzd() == null && zzads.zza(strZzh2, phoneAuthOptions.zze(), phoneAuthOptions.zza(), phoneAuthOptions.zzi())) {
            return;
        }
        firebaseAuthZzb2.zzu.zza(firebaseAuthZzb2, strZzh2, phoneAuthOptions.zza(), firebaseAuthZzb2.zzi(), phoneAuthOptions.zzj(), false, firebaseAuthZzb2.zzp).addOnCompleteListener(new zzj(firebaseAuthZzb2, phoneAuthOptions, strZzh2));
    }

    public final void zza(PhoneAuthOptions phoneAuthOptions, String str, String str2) {
        long jLongValue = phoneAuthOptions.zzg().longValue();
        if (jLongValue >= 0 && jLongValue <= 120) {
            String strZzh = phoneAuthOptions.zzh();
            a.u(strZzh);
            zzafz zzafzVar = new zzafz(strZzh, jLongValue, phoneAuthOptions.zzd() != null, this.zzi, this.zzk, str, str2, zzi());
            PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacksZza = zza(strZzh, phoneAuthOptions.zze());
            this.zze.zza(this.zza, zzafzVar, TextUtils.isEmpty(str) ? zza(phoneAuthOptions, onVerificationStateChangedCallbacksZza) : onVerificationStateChangedCallbacksZza, phoneAuthOptions.zza(), phoneAuthOptions.zzi());
            return;
        }
        throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
    }
}
