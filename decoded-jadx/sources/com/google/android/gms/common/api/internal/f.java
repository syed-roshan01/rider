package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zal;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.internal.common.zzd;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.remoteconfig.internal.Code;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Handler.Callback {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Status f3188p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Status f3189q = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f3190r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static f f3191s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.gms.common.internal.t f3194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b6.b f3195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f3196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z5.e f3197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l.t f3198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f3199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f3200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f3201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x f3202k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q.g f3203l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q.g f3204m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zaq f3205n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f3206o;

    public f(Context context, Looper looper) {
        z5.e eVar = z5.e.f17251d;
        this.f3192a = 10000L;
        this.f3193b = false;
        this.f3199h = new AtomicInteger(1);
        this.f3200i = new AtomicInteger(0);
        this.f3201j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f3202k = null;
        this.f3203l = new q.g(0);
        this.f3204m = new q.g(0);
        this.f3206o = true;
        this.f3196e = context;
        zaq zaqVar = new zaq(looper, this);
        this.f3205n = zaqVar;
        this.f3197f = eVar;
        this.f3198g = new l.t();
        PackageManager packageManager = context.getPackageManager();
        if (y3.e.f16907n == null) {
            y3.e.f16907n = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (y3.e.f16907n.booleanValue()) {
            this.f3206o = false;
        }
        zaqVar.sendMessage(zaqVar.obtainMessage(6));
    }

    public static Status d(a aVar, z5.b bVar) {
        String str = aVar.f3160b.f3155b;
        String strValueOf = String.valueOf(bVar);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(strValueOf);
        return new Status(1, 17, sb.toString(), bVar.f17242c, bVar);
    }

    public static f f(Context context) {
        f fVar;
        HandlerThread handlerThread;
        synchronized (f3190r) {
            if (f3191s == null) {
                synchronized (com.google.android.gms.common.internal.l.f3336a) {
                    try {
                        handlerThread = com.google.android.gms.common.internal.l.f3338c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            com.google.android.gms.common.internal.l.f3338c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = com.google.android.gms.common.internal.l.f3338c;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = z5.e.f17250c;
                f3191s = new f(applicationContext, looper);
            }
            fVar = f3191s;
        }
        return fVar;
    }

    public final void a(x xVar) {
        synchronized (f3190r) {
            try {
                if (this.f3202k != xVar) {
                    this.f3202k = xVar;
                    this.f3203l.clear();
                }
                this.f3203l.addAll(xVar.f3269e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        if (this.f3193b) {
            return false;
        }
        com.google.android.gms.common.internal.r rVar = com.google.android.gms.common.internal.q.a().f3376a;
        if (rVar != null && !rVar.f3379b) {
            return false;
        }
        int i10 = ((SparseIntArray) this.f3198g.f10928b).get(203400000, -1);
        return i10 == -1 || i10 == 0;
    }

    public final boolean c(z5.b bVar, int i10) {
        z5.e eVar = this.f3197f;
        eVar.getClass();
        Context context = this.f3196e;
        if (f6.a.X(context)) {
            return false;
        }
        int i11 = bVar.f17241b;
        PendingIntent activity = bVar.f17242c;
        if (!((i11 == 0 || activity == null) ? false : true)) {
            activity = null;
            Intent intentA = eVar.a(i11, context, null);
            if (intentA != null) {
                activity = PendingIntent.getActivity(context, 0, intentA, zzd.zza | 134217728);
            }
        }
        if (activity == null) {
            return false;
        }
        int i12 = GoogleApiActivity.f3145b;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", true);
        eVar.g(context, i11, zal.zaa(context, 0, intent, zal.zaa | 134217728));
        return true;
    }

    public final d0 e(com.google.android.gms.common.api.i iVar) {
        a apiKey = iVar.getApiKey();
        ConcurrentHashMap concurrentHashMap = this.f3201j;
        d0 d0Var = (d0) concurrentHashMap.get(apiKey);
        if (d0Var == null) {
            d0Var = new d0(this, iVar);
            concurrentHashMap.put(apiKey, d0Var);
        }
        if (d0Var.f3174b.requiresSignIn()) {
            this.f3204m.add(apiKey);
        }
        d0Var.n();
        return d0Var;
    }

    public final void g(z5.b bVar, int i10) {
        if (c(bVar, i10)) {
            return;
        }
        zaq zaqVar = this.f3205n;
        zaqVar.sendMessage(zaqVar.obtainMessage(5, i10, 0, bVar));
    }

    /* JADX WARN: Code duplicated, block: B:132:0x030f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0315  */
    /* JADX WARN: Code duplicated, block: B:135:0x0358  */
    /* JADX WARN: Code duplicated, block: B:136:0x0363  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10;
        z5.d[] dVarArrG;
        int i11 = message.what;
        zaq zaqVar = this.f3205n;
        ConcurrentHashMap concurrentHashMap = this.f3201j;
        com.google.android.gms.common.internal.u uVar = com.google.android.gms.common.internal.u.f3390b;
        d0 d0Var = null;
        switch (i11) {
            case 1:
                this.f3192a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                zaqVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    zaqVar.sendMessageDelayed(zaqVar.obtainMessage(12, (a) it.next()), this.f3192a);
                }
                return true;
            case 2:
                a7.a.w(message.obj);
                throw null;
            case 3:
                for (d0 d0Var2 : concurrentHashMap.values()) {
                    f6.a.s(d0Var2.f3185m.f3205n);
                    d0Var2.f3183k = null;
                    d0Var2.n();
                }
                return true;
            case 4:
            case 8:
            case 13:
                m0 m0Var = (m0) message.obj;
                d0 d0VarE = (d0) concurrentHashMap.get(m0Var.f3228c.getApiKey());
                if (d0VarE == null) {
                    d0VarE = e(m0Var.f3228c);
                }
                boolean zRequiresSignIn = d0VarE.f3174b.requiresSignIn();
                t0 t0Var = m0Var.f3226a;
                if (!zRequiresSignIn || this.f3200i.get() == m0Var.f3227b) {
                    d0VarE.o(t0Var);
                } else {
                    t0Var.a(f3188p);
                    d0VarE.q();
                }
                return true;
            case 5:
                int i12 = message.arg1;
                z5.b bVar = (z5.b) message.obj;
                for (d0 d0Var3 : concurrentHashMap.values()) {
                    if (d0Var3.f3179g == i12) {
                        d0Var = d0Var3;
                        if (d0Var != null) {
                            i10 = bVar.f17241b;
                            if (i10 == 13) {
                                this.f3197f.getClass();
                                AtomicBoolean atomicBoolean = z5.j.f17255a;
                                String strE = z5.b.e(i10);
                                int length = String.valueOf(strE).length();
                                String str = bVar.f17243d;
                                StringBuilder sb = new StringBuilder(length + 69 + String.valueOf(str).length());
                                sb.append("Error resolution was canceled by the user, original error message: ");
                                sb.append(strE);
                                sb.append(": ");
                                sb.append(str);
                                d0Var.d(new Status(17, sb.toString()));
                            } else {
                                d0Var.d(d(d0Var.f3175c, bVar));
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder(76);
                            sb2.append("Could not find API instance ");
                            sb2.append(i12);
                            sb2.append(" while trying to fail enqueued calls.");
                            Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                        }
                        return true;
                    }
                }
                if (d0Var != null) {
                    i10 = bVar.f17241b;
                    if (i10 == 13) {
                        this.f3197f.getClass();
                        AtomicBoolean atomicBoolean2 = z5.j.f17255a;
                        String strE2 = z5.b.e(i10);
                        int length2 = String.valueOf(strE2).length();
                        String str2 = bVar.f17243d;
                        StringBuilder sb3 = new StringBuilder(length2 + 69 + String.valueOf(str2).length());
                        sb3.append("Error resolution was canceled by the user, original error message: ");
                        sb3.append(strE2);
                        sb3.append(": ");
                        sb3.append(str2);
                        d0Var.d(new Status(17, sb3.toString()));
                    } else {
                        d0Var.d(d(d0Var.f3175c, bVar));
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder(76);
                    sb4.append("Could not find API instance ");
                    sb4.append(i12);
                    sb4.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb4.toString(), new Exception());
                }
                return true;
            case 6:
                Context context = this.f3196e;
                if (context.getApplicationContext() instanceof Application) {
                    c.b((Application) context.getApplicationContext());
                    c cVar = c.f3165e;
                    cVar.a(new b0(this));
                    AtomicBoolean atomicBoolean3 = cVar.f3167b;
                    boolean z10 = atomicBoolean3.get();
                    AtomicBoolean atomicBoolean4 = cVar.f3166a;
                    if (!z10) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean3.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean4.set(true);
                        }
                    }
                    if (!atomicBoolean4.get()) {
                        this.f3192a = 300000L;
                    }
                }
                return true;
            case 7:
                e((com.google.android.gms.common.api.i) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    d0 d0Var4 = (d0) concurrentHashMap.get(message.obj);
                    f6.a.s(d0Var4.f3185m.f3205n);
                    if (d0Var4.f3181i) {
                        d0Var4.n();
                    }
                }
                return true;
            case 10:
                q.g gVar = this.f3204m;
                gVar.getClass();
                q.b bVar2 = new q.b(gVar);
                while (bVar2.hasNext()) {
                    d0 d0Var5 = (d0) concurrentHashMap.remove((a) bVar2.next());
                    if (d0Var5 != null) {
                        d0Var5.q();
                    }
                }
                gVar.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    d0 d0Var6 = (d0) concurrentHashMap.get(message.obj);
                    f fVar = d0Var6.f3185m;
                    f6.a.s(fVar.f3205n);
                    boolean z11 = d0Var6.f3181i;
                    if (z11) {
                        if (z11) {
                            f fVar2 = d0Var6.f3185m;
                            zaq zaqVar2 = fVar2.f3205n;
                            a aVar = d0Var6.f3175c;
                            zaqVar2.removeMessages(11, aVar);
                            fVar2.f3205n.removeMessages(9, aVar);
                            d0Var6.f3181i = false;
                        }
                        d0Var6.d(fVar.f3197f.c(fVar.f3196e, z5.f.f17252a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
                        d0Var6.f3174b.disconnect("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((d0) concurrentHashMap.get(message.obj)).m(true);
                }
                return true;
            case Code.UNAVAILABLE /* 14 */:
                y yVar = (y) message.obj;
                a aVar2 = yVar.f3275a;
                boolean zContainsKey = concurrentHashMap.containsKey(aVar2);
                TaskCompletionSource taskCompletionSource = yVar.f3276b;
                if (zContainsKey) {
                    taskCompletionSource.setResult(Boolean.valueOf(((d0) concurrentHashMap.get(aVar2)).m(false)));
                } else {
                    taskCompletionSource.setResult(Boolean.FALSE);
                }
                return true;
            case 15:
                e0 e0Var = (e0) message.obj;
                if (concurrentHashMap.containsKey(e0Var.f3186a)) {
                    d0 d0Var7 = (d0) concurrentHashMap.get(e0Var.f3186a);
                    if (d0Var7.f3182j.contains(e0Var) && !d0Var7.f3181i) {
                        if (d0Var7.f3174b.isConnected()) {
                            d0Var7.f();
                        } else {
                            d0Var7.n();
                        }
                    }
                }
                return true;
            case Code.UNAUTHENTICATED /* 16 */:
                e0 e0Var2 = (e0) message.obj;
                if (concurrentHashMap.containsKey(e0Var2.f3186a)) {
                    d0 d0Var8 = (d0) concurrentHashMap.get(e0Var2.f3186a);
                    if (d0Var8.f3182j.remove(e0Var2)) {
                        f fVar3 = d0Var8.f3185m;
                        fVar3.f3205n.removeMessages(15, e0Var2);
                        fVar3.f3205n.removeMessages(16, e0Var2);
                        LinkedList linkedList = d0Var8.f3173a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it2 = linkedList.iterator();
                        while (true) {
                            boolean zHasNext = it2.hasNext();
                            z5.d dVar = e0Var2.f3187b;
                            if (zHasNext) {
                                t0 t0Var2 = (t0) it2.next();
                                if ((t0Var2 instanceof j0) && (dVarArrG = ((j0) t0Var2).g(d0Var8)) != null) {
                                    int length3 = dVarArrG.length;
                                    for (int i13 = 0; i13 < length3; i13++) {
                                        if (y3.e.g0(dVarArrG[i13], dVar)) {
                                            if (i13 < 0) {
                                            }
                                            arrayList.add(t0Var2);
                                        }
                                        break;
                                    }
                                }
                            } else {
                                int size = arrayList.size();
                                for (int i14 = 0; i14 < size; i14++) {
                                    t0 t0Var3 = (t0) arrayList.get(i14);
                                    linkedList.remove(t0Var3);
                                    t0Var3.b(new com.google.android.gms.common.api.n(dVar));
                                }
                            }
                        }
                    }
                }
                return true;
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                com.google.android.gms.common.internal.t tVar = this.f3194c;
                if (tVar != null) {
                    if (tVar.f3388a > 0 || b()) {
                        if (this.f3195d == null) {
                            this.f3195d = new b6.b(this.f3196e, null, b6.b.f2732a, uVar, com.google.android.gms.common.api.h.f3156c);
                        }
                        this.f3195d.b(tVar);
                    }
                    this.f3194c = null;
                }
                return true;
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                l0 l0Var = (l0) message.obj;
                long j10 = l0Var.f3224c;
                com.google.android.gms.common.internal.p pVar = l0Var.f3222a;
                int i15 = l0Var.f3223b;
                if (j10 == 0) {
                    com.google.android.gms.common.internal.t tVar2 = new com.google.android.gms.common.internal.t(i15, Arrays.asList(pVar));
                    if (this.f3195d == null) {
                        this.f3195d = new b6.b(this.f3196e, null, b6.b.f2732a, uVar, com.google.android.gms.common.api.h.f3156c);
                    }
                    this.f3195d.b(tVar2);
                } else {
                    com.google.android.gms.common.internal.t tVar3 = this.f3194c;
                    if (tVar3 != null) {
                        List list = tVar3.f3389b;
                        if (tVar3.f3388a != i15 || (list != null && list.size() >= l0Var.f3225d)) {
                            zaqVar.removeMessages(17);
                            com.google.android.gms.common.internal.t tVar4 = this.f3194c;
                            if (tVar4 != null) {
                                if (tVar4.f3388a > 0 || b()) {
                                    if (this.f3195d == null) {
                                        this.f3195d = new b6.b(this.f3196e, null, b6.b.f2732a, uVar, com.google.android.gms.common.api.h.f3156c);
                                    }
                                    this.f3195d.b(tVar4);
                                }
                                this.f3194c = null;
                            }
                        } else {
                            com.google.android.gms.common.internal.t tVar5 = this.f3194c;
                            if (tVar5.f3389b == null) {
                                tVar5.f3389b = new ArrayList();
                            }
                            tVar5.f3389b.add(pVar);
                        }
                    }
                    if (this.f3194c == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(pVar);
                        this.f3194c = new com.google.android.gms.common.internal.t(i15, arrayList2);
                        zaqVar.sendMessageDelayed(zaqVar.obtainMessage(17), l0Var.f3224c);
                    }
                }
                return true;
            case 19:
                this.f3193b = false;
                return true;
            default:
                StringBuilder sb5 = new StringBuilder(31);
                sb5.append("Unknown message id: ");
                sb5.append(i11);
                Log.w("GoogleApiManager", sb5.toString());
                return false;
        }
    }
}
