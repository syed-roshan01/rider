package o6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import e6.c;
import e6.e;
import e6.f;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f12546n = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f12547o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f12548p = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f12550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f12552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f12554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zzb f12556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f12557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f12558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f12559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f12560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f12561m;

    public a(Context context) {
        String packageName = context.getPackageName();
        this.f12549a = new Object();
        this.f12551c = 0;
        this.f12554f = new HashSet();
        this.f12555g = true;
        this.f12557i = c.f5143a;
        this.f12559k = new HashMap();
        this.f12560l = new AtomicInteger(0);
        f6.a.v("WakeLock: wakeLockName must not be empty", "wake:com.google.firebase.iid.WakeLockHolder");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f12556h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f12558j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f12558j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        this.f12550b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = f.f5149a;
        if (context.getPackageManager() != null) {
            if (f6.b.a(context).f8194a.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0) {
                int i10 = e.f5148a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfoC = f6.b.a(context).c(0, packageName);
                        if (applicationInfoC == null) {
                            Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                        } else {
                            int i11 = applicationInfoC.uid;
                            workSource = new WorkSource();
                            Method method2 = f.f5150b;
                            if (method2 != null) {
                                try {
                                    method2.invoke(workSource, Integer.valueOf(i11), packageName);
                                } catch (Exception e4) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e4);
                                }
                            } else {
                                Method method3 = f.f5149a;
                                if (method3 != null) {
                                    try {
                                        method3.invoke(workSource, Integer.valueOf(i11));
                                    } catch (Exception e10) {
                                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                                    }
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                    }
                }
                if (workSource != null) {
                    try {
                        this.f12550b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e11) {
                        Log.wtf("WakeLock", e11.toString());
                    }
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f12547o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f12548p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f12547o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        zzh.zza();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f12547o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f12561m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void a(long j10) {
        this.f12560l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f12546n), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f12549a) {
            try {
                if (!b()) {
                    this.f12556h = zzb.zza(false, null);
                    this.f12550b.acquire();
                    this.f12557i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f12551c++;
                if (this.f12555g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f12559k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f12559k.put(null, bVar);
                }
                bVar.f12562a++;
                this.f12557i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j11 > this.f12553e) {
                    this.f12553e = j11;
                    ScheduledFuture scheduledFuture = this.f12552d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f12552d = this.f12561m.schedule(new h.a(this, 10), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f12549a) {
            z10 = this.f12551c > 0;
        }
        return z10;
    }

    public final void c() {
        if (this.f12560l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f12558j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f12549a) {
            try {
                if (this.f12555g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f12559k.containsKey(null)) {
                    b bVar = (b) this.f12559k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f12562a - 1;
                        bVar.f12562a = i10;
                        if (i10 == 0) {
                            this.f12559k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f12558j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f12554f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        a7.a.w(arrayList.get(0));
        throw null;
    }

    public final void e() {
        synchronized (this.f12549a) {
            try {
                if (b()) {
                    if (this.f12555g) {
                        int i10 = this.f12551c - 1;
                        this.f12551c = i10;
                        if (i10 > 0) {
                            return;
                        }
                    } else {
                        this.f12551c = 0;
                    }
                    d();
                    Iterator it = this.f12559k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f12562a = 0;
                    }
                    this.f12559k.clear();
                    ScheduledFuture scheduledFuture = this.f12552d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f12552d = null;
                        this.f12553e = 0L;
                    }
                    if (this.f12550b.isHeld()) {
                        try {
                            try {
                                this.f12550b.release();
                                if (this.f12556h != null) {
                                    this.f12556h = null;
                                }
                            } catch (RuntimeException e4) {
                                if (!e4.getClass().equals(RuntimeException.class)) {
                                    throw e4;
                                }
                                Log.e("WakeLock", String.valueOf(this.f12558j).concat(" failed to release!"), e4);
                                if (this.f12556h != null) {
                                    this.f12556h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f12556h != null) {
                                this.f12556h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f12558j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
