package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    r0 zza;
    final Handler zzb;
    protected d zzc;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private final Context zzl;
    private final Looper zzm;
    private final l zzn;
    private final z5.f zzo;
    private n zzr;
    private IInterface zzs;
    private j0 zzu;
    private final b zzw;
    private final c zzx;
    private final int zzy;
    private final String zzz;
    private static final z5.d[] zze = new z5.d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};
    private volatile String zzk = null;
    private final Object zzp = new Object();
    private final Object zzq = new Object();
    private final ArrayList zzt = new ArrayList();
    private int zzv = 1;
    private z5.b zzB = null;
    private boolean zzC = false;
    private volatile m0 zzD = null;
    protected AtomicInteger zzd = new AtomicInteger(0);

    public f(Context context, Looper looper, p0 p0Var, z5.f fVar, int i10, b bVar, c cVar, String str) {
        if (context == null) {
            throw new NullPointerException("Context must not be null");
        }
        this.zzl = context;
        if (looper == null) {
            throw new NullPointerException("Looper must not be null");
        }
        this.zzm = looper;
        if (p0Var == null) {
            throw new NullPointerException("Supervisor must not be null");
        }
        this.zzn = p0Var;
        f6.a.y(fVar, "API availability must not be null");
        this.zzo = fVar;
        this.zzb = new h0(this, looper);
        this.zzy = i10;
        this.zzw = bVar;
        this.zzx = cVar;
        this.zzz = str;
    }

    public static void zzj(f fVar, m0 m0Var) {
        fVar.zzD = m0Var;
        if (fVar.usesClientTelemetry()) {
            i iVar = m0Var.f3343d;
            q qVarA = q.a();
            r rVar = iVar == null ? null : iVar.f3308a;
            synchronized (qVarA) {
                try {
                    if (rVar == null) {
                        rVar = q.f3375c;
                    } else {
                        r rVar2 = qVarA.f3376a;
                        if (rVar2 == null || rVar2.f3378a < rVar.f3378a) {
                        }
                    }
                    qVarA.f3376a = rVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(f fVar, int i10) {
        int i11;
        int i12;
        synchronized (fVar.zzp) {
            i11 = fVar.zzv;
        }
        if (i11 == 3) {
            fVar.zzC = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = fVar.zzb;
        handler.sendMessage(handler.obtainMessage(i12, fVar.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(f fVar, int i10, int i11, IInterface iInterface) {
        synchronized (fVar.zzp) {
            try {
                if (fVar.zzv != i10) {
                    return false;
                }
                fVar.c(i11, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzo(f fVar) {
        if (fVar.zzC || TextUtils.isEmpty(fVar.getServiceDescriptor()) || TextUtils.isEmpty(fVar.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(fVar.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void c(int i10, IInterface iInterface) {
        r0 r0Var;
        r0 r0Var2;
        f6.a.r((i10 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i10;
                this.zzs = iInterface;
                if (i10 == 1) {
                    j0 j0Var = this.zzu;
                    if (j0Var != null) {
                        l lVar = this.zzn;
                        String str = this.zza.f3383a;
                        f6.a.x(str);
                        String str2 = this.zza.f3384b;
                        zze();
                        lVar.b(str, str2, 4225, j0Var, this.zza.f3385c);
                        this.zzu = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    j0 j0Var2 = this.zzu;
                    if (j0Var2 != null && (r0Var2 = this.zza) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + r0Var2.f3383a + " on " + r0Var2.f3384b);
                        l lVar2 = this.zzn;
                        String str3 = this.zza.f3383a;
                        f6.a.x(str3);
                        String str4 = this.zza.f3384b;
                        zze();
                        lVar2.b(str3, str4, 4225, j0Var2, this.zza.f3385c);
                        this.zzd.incrementAndGet();
                    }
                    j0 j0Var3 = new j0(this, this.zzd.get());
                    this.zzu = j0Var3;
                    if (this.zzv != 3 || getLocalStartServiceAction() == null) {
                        String startServicePackage = getStartServicePackage();
                        String startServiceAction = getStartServiceAction();
                        Object obj = l.f3336a;
                        r0Var = new r0(startServicePackage, startServiceAction, getUseDynamicLookup());
                    } else {
                        String packageName = getContext().getPackageName();
                        String localStartServiceAction = getLocalStartServiceAction();
                        Object obj2 = l.f3336a;
                        r0Var = new r0(packageName, localStartServiceAction, false);
                    }
                    this.zza = r0Var;
                    if (r0Var.f3385c && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f3383a)));
                    }
                    l lVar3 = this.zzn;
                    String str5 = this.zza.f3383a;
                    f6.a.x(str5);
                    if (!lVar3.c(new n0(4225, str5, this.zza.f3384b, this.zza.f3385c), j0Var3, zze(), getBindServiceExecutor())) {
                        r0 r0Var3 = this.zza;
                        Log.w("GmsClient", "unable to connect to service: " + r0Var3.f3383a + " on " + r0Var3.f3384b);
                        zzl(16, null, this.zzd.get());
                    }
                } else if (i10 == 4) {
                    f6.a.x(iInterface);
                    onConnectedLocked(iInterface);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iC = this.zzo.c(this.zzl, getMinApkVersion());
        int i10 = 24;
        if (iC == 0) {
            connect(new k.f(this, i10));
        } else {
            c(1, null);
            triggerNotAvailable(new k.f(this, i10), iC, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(d dVar) {
        if (dVar == null) {
            throw new NullPointerException("Connection progress callbacks cannot be null.");
        }
        this.zzc = dVar;
        c(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                for (int i10 = 0; i10 < size; i10++) {
                    b0 b0Var = (b0) this.zzt.get(i10);
                    synchronized (b0Var) {
                        b0Var.f3285a = null;
                    }
                }
                this.zzt.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        c(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        IInterface iInterface;
        n nVar;
        synchronized (this.zzp) {
            i10 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            nVar = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (nVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(nVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.zzh;
            printWriterAppend.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.zzf;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append((CharSequence) String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.zzg;
            printWriterAppend2.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) y3.e.l0(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j12 = this.zzj;
            printWriterAppend3.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public z5.d[] getApiFeatures() {
        return zze;
    }

    public final z5.d[] getAvailableFeatures() {
        m0 m0Var = this.zzD;
        if (m0Var == null) {
            return null;
        }
        return m0Var.f3341b;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        r0 r0Var;
        if (!isConnected() || (r0Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return r0Var.f3384b;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public abstract int getMinApkVersion();

    public void getRemoteService(m mVar, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        int i10 = this.zzy;
        String str = this.zzA;
        int i11 = z5.f.f17252a;
        Scope[] scopeArr = j.f3316v;
        Bundle bundle = new Bundle();
        z5.d[] dVarArr = j.f3317w;
        j jVar = new j(6, i10, i11, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        jVar.f3321d = this.zzl.getPackageName();
        jVar.f3324n = getServiceRequestExtraArgs;
        if (set != null) {
            jVar.f3323f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            jVar.f3325o = account;
            if (mVar != null) {
                jVar.f3322e = mVar.asBinder();
            }
        } else if (requiresAccount()) {
            jVar.f3325o = getAccount();
        }
        jVar.f3326p = zze;
        jVar.f3327q = getApiFeatures();
        if (usesClientTelemetry()) {
            jVar.f3330t = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    n nVar = this.zzr;
                    if (nVar != null) {
                        ((c0) nVar).a(new i0(this, this.zzd.get()), jVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            triggerConnectionSuspended(3);
        } catch (RemoteException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            e = e12;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set getScopes() {
        return Collections.emptySet();
    }

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                iInterface = this.zzs;
                f6.a.y(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                n nVar = this.zzr;
                if (nVar == null) {
                    return null;
                }
                return nVar.asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public i getTelemetryConfiguration() {
        m0 m0Var = this.zzD;
        if (m0Var == null) {
            return null;
        }
        return m0Var.f3343d;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.zzp) {
            z10 = this.zzv == 4;
        }
        return z10;
    }

    public boolean isConnecting() {
        boolean z10;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(z5.b bVar) {
        this.zzi = bVar.f17241b;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new k0(this, i10, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        com.google.android.gms.common.api.internal.z zVar = (com.google.android.gms.common.api.internal.z) eVar;
        ((com.google.android.gms.common.api.internal.d0) zVar.f3277a).f3185m.f3205n.post(new com.google.android.gms.common.api.internal.n0(zVar, 2));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i10) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.zzd.get(), i10));
    }

    public void triggerNotAvailable(d dVar, int i10, PendingIntent pendingIntent) {
        if (dVar == null) {
            throw new NullPointerException("Connection progress callbacks cannot be null.");
        }
        this.zzc = dVar;
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, this.zzd.get(), i10, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzl(int i10, Bundle bundle, int i11) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, new l0(this, i10)));
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }
}
