package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.o0;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.s0;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.api.internal.y;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    protected final com.google.android.gms.common.api.internal.f zaa;
    private final Context zab;
    private final String zac;
    private final f zad;
    private final b zae;
    private final com.google.android.gms.common.api.internal.a zaf;
    private final Looper zag;
    private final int zah;
    private final l zai;
    private final r zaj;

    public i(Context context, Activity activity, f fVar, u uVar, h hVar) {
        if (context == null) {
            throw new NullPointerException("Null context is not permitted.");
        }
        if (fVar == null) {
            throw new NullPointerException("Api must not be null.");
        }
        if (hVar == null) {
            throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        }
        this.zab = context.getApplicationContext();
        String str = null;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.zac = str;
        this.zad = fVar;
        this.zae = uVar;
        this.zag = hVar.f3158b;
        com.google.android.gms.common.api.internal.a aVar = new com.google.android.gms.common.api.internal.a(fVar, uVar, str);
        this.zaf = aVar;
        this.zai = new g0();
        com.google.android.gms.common.api.internal.f fVarF = com.google.android.gms.common.api.internal.f.f(this.zab);
        this.zaa = fVarF;
        this.zah = fVarF.f3199h.getAndIncrement();
        this.zaj = hVar.f3157a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.j fragment = LifecycleCallback.getFragment(activity);
            x xVar = (x) fragment.b(x.class, "ConnectionlessLifecycleHelper");
            if (xVar == null) {
                Object obj = z5.e.f17250c;
                xVar = new x(fragment, fVarF);
            }
            xVar.f3269e.add(aVar);
            fVarF.a(xVar);
        }
        zaq zaqVar = fVarF.f3205n;
        zaqVar.sendMessage(zaqVar.obtainMessage(7, this));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    public final Task a(int i10, t tVar) {
        long jCurrentTimeMillis;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        com.google.android.gms.common.api.internal.f fVar = this.zaa;
        r rVar = this.zaj;
        fVar.getClass();
        int i11 = tVar.f3251c;
        final zaq zaqVar = fVar.f3205n;
        if (i11 != 0) {
            com.google.android.gms.common.api.internal.a apiKey = getApiKey();
            k0 k0Var = null;
            if (fVar.b()) {
                com.google.android.gms.common.internal.r rVar2 = q.a().f3376a;
                boolean z10 = true;
                if (rVar2 == null) {
                    if (z10) {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    } else {
                        jCurrentTimeMillis = 0;
                    }
                    k0Var = new k0(fVar, i11, apiKey, jCurrentTimeMillis, z10 ? SystemClock.elapsedRealtime() : 0L);
                } else if (rVar2.f3379b) {
                    d0 d0Var = (d0) fVar.f3201j.get(apiKey);
                    if (d0Var != null) {
                        Object obj = d0Var.f3174b;
                        if (obj instanceof com.google.android.gms.common.internal.f) {
                            com.google.android.gms.common.internal.f fVar2 = (com.google.android.gms.common.internal.f) obj;
                            if (!fVar2.hasConnectionInfo() || fVar2.isConnecting()) {
                                z10 = rVar2.f3380c;
                            } else {
                                com.google.android.gms.common.internal.i iVarA = k0.a(d0Var, fVar2, i11);
                                if (iVarA != null) {
                                    d0Var.f3184l++;
                                    z10 = iVarA.f3310c;
                                }
                            }
                            if (z10) {
                                jCurrentTimeMillis = System.currentTimeMillis();
                            } else {
                                jCurrentTimeMillis = 0;
                            }
                            if (z10) {
                            }
                            k0Var = new k0(fVar, i11, apiKey, jCurrentTimeMillis, z10 ? SystemClock.elapsedRealtime() : 0L);
                        }
                    } else {
                        z10 = rVar2.f3380c;
                        if (z10) {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        } else {
                            jCurrentTimeMillis = 0;
                        }
                        if (z10) {
                        }
                        k0Var = new k0(fVar, i11, apiKey, jCurrentTimeMillis, z10 ? SystemClock.elapsedRealtime() : 0L);
                    }
                }
            }
            if (k0Var != null) {
                Task task = taskCompletionSource.getTask();
                zaqVar.getClass();
                task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.a0
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        zaqVar.post(runnable);
                    }
                }, k0Var);
            }
        }
        zaqVar.sendMessage(zaqVar.obtainMessage(4, new m0(new s0(i10, tVar, taskCompletionSource, rVar), fVar.f3200i.get(), this)));
        return taskCompletionSource.getTask();
    }

    public l asGoogleApiClient() {
        return this.zai;
    }

    public com.google.android.gms.common.internal.g createClientSettingsBuilder() {
        com.google.android.gms.common.internal.g gVar = new com.google.android.gms.common.internal.g();
        gVar.f3293a = null;
        Set setEmptySet = Collections.emptySet();
        if (gVar.f3294b == null) {
            gVar.f3294b = new q.g(0);
        }
        gVar.f3294b.addAll(setEmptySet);
        gVar.f3296d = this.zab.getClass().getName();
        gVar.f3295c = this.zab.getPackageName();
        return gVar;
    }

    public Task<Boolean> disconnectService() {
        com.google.android.gms.common.api.internal.f fVar = this.zaa;
        fVar.getClass();
        y yVar = new y(getApiKey());
        zaq zaqVar = fVar.f3205n;
        zaqVar.sendMessage(zaqVar.obtainMessage(14, yVar));
        return yVar.f3276b.getTask();
    }

    public <A extends d, T extends com.google.android.gms.common.api.internal.d> T doBestEffortWrite(T t10) {
        throw null;
    }

    public <A extends d, T extends com.google.android.gms.common.api.internal.d> T doRead(T t10) {
        throw null;
    }

    @Deprecated
    public <A extends d, T extends o, U extends com.google.android.gms.common.api.internal.u> Task<Void> doRegisterEventListener(T t10, U u10) {
        f6.a.x(t10);
        throw null;
    }

    public Task<Boolean> doUnregisterEventListener(com.google.android.gms.common.api.internal.k kVar) {
        return doUnregisterEventListener(kVar, 0);
    }

    public <A extends d, T extends com.google.android.gms.common.api.internal.d> T doWrite(T t10) {
        throw null;
    }

    public final com.google.android.gms.common.api.internal.a getApiKey() {
        return this.zaf;
    }

    public b getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> com.google.android.gms.common.api.internal.l registerListener(L l10, String str) {
        Looper looper = this.zag;
        if (l10 == null) {
            throw new NullPointerException("Listener must not be null");
        }
        f6.a.y(looper, "Looper must not be null");
        if (str == null) {
            throw new NullPointerException("Listener type must not be null");
        }
        com.google.android.gms.common.api.internal.l lVar = new com.google.android.gms.common.api.internal.l();
        new zzi(looper);
        lVar.f3221a = l10;
        f6.a.u(str);
        return lVar;
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d zab(Looper looper, d0 d0Var) {
        com.google.android.gms.common.internal.g gVarCreateClientSettingsBuilder = createClientSettingsBuilder();
        com.google.android.gms.common.internal.h hVar = new com.google.android.gms.common.internal.h(gVarCreateClientSettingsBuilder.f3293a, gVarCreateClientSettingsBuilder.f3294b, gVarCreateClientSettingsBuilder.f3295c, gVarCreateClientSettingsBuilder.f3296d);
        a aVar = this.zad.f3154a;
        f6.a.x(aVar);
        d dVarBuildClient = aVar.buildClient(this.zab, looper, hVar, (Object) this.zae, (j) d0Var, (k) d0Var);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (dVarBuildClient instanceof com.google.android.gms.common.internal.f)) {
            ((com.google.android.gms.common.internal.f) dVarBuildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag == null || !(dVarBuildClient instanceof com.google.android.gms.common.api.internal.m)) {
            return dVarBuildClient;
        }
        throw null;
    }

    public final o0 zac(Context context, Handler handler) {
        com.google.android.gms.common.internal.g gVarCreateClientSettingsBuilder = createClientSettingsBuilder();
        return new o0(context, handler, new com.google.android.gms.common.internal.h(gVarCreateClientSettingsBuilder.f3293a, gVarCreateClientSettingsBuilder.f3294b, gVarCreateClientSettingsBuilder.f3295c, gVarCreateClientSettingsBuilder.f3296d));
    }

    public <TResult, A extends d> Task<TResult> doBestEffortWrite(t tVar) {
        return a(2, tVar);
    }

    public <TResult, A extends d> Task<TResult> doRead(t tVar) {
        return a(0, tVar);
    }

    public <A extends d> Task<Void> doRegisterEventListener(p pVar) {
        f6.a.x(pVar);
        throw null;
    }

    public Task<Boolean> doUnregisterEventListener(com.google.android.gms.common.api.internal.k kVar, int i10) {
        throw new NullPointerException("Listener key cannot be null.");
    }

    public <TResult, A extends d> Task<TResult> doWrite(t tVar) {
        return a(1, tVar);
    }
}
