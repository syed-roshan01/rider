package v5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import m0.z1;
import z5.f;
import z5.g;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z5.a f15893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzf f15894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15896d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f15897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f15898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f15899g;

    public a(Context context) {
        f6.a.x(context);
        Context applicationContext = context.getApplicationContext();
        this.f15898f = applicationContext != null ? applicationContext : context;
        this.f15895c = false;
        this.f15899g = -1L;
    }

    public static z1 a(Context context) {
        a aVar = new a(context);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.c();
            z1 z1VarE = aVar.e();
            d(z1VarE, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            aVar.b();
            return z1VarE;
        } catch (Throwable th) {
            try {
                d(null, -1L, th);
                throw th;
            } catch (Throwable th2) {
                aVar.b();
                throw th2;
            }
        }
    }

    public static void d(z1 z1Var, long j10, Throwable th) {
        if (Math.random() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (z1Var != null) {
                map.put("limit_ad_tracking", true != z1Var.f11770b ? "0" : "1");
                String str = (String) z1Var.f11771c;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j10));
            new b(map).start();
        }
    }

    public final void b() {
        f6.a.w("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f15898f == null || this.f15893a == null) {
                    return;
                }
                try {
                    if (this.f15895c) {
                        d6.a.b().c(this.f15898f, this.f15893a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f15895c = false;
                this.f15894b = null;
                this.f15893a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        f6.a.w("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f15895c) {
                    b();
                }
                Context context = this.f15898f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iC = f.f17253b.c(context, 12451000);
                    if (iC != 0 && iC != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    z5.a aVar = new z5.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!d6.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f15893a = aVar;
                        try {
                            this.f15894b = zze.zza(aVar.a(TimeUnit.MILLISECONDS));
                            this.f15895c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new g();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final z1 e() {
        z1 z1Var;
        f6.a.w("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f15895c) {
                    synchronized (this.f15896d) {
                        c cVar = this.f15897e;
                        if (cVar == null || !cVar.f15904d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.f15895c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e4) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e4);
                    }
                }
                f6.a.x(this.f15893a);
                f6.a.x(this.f15894b);
                try {
                    z1Var = new z1(this.f15894b.zzc(), this.f15894b.zze(true));
                } catch (RemoteException e10) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f();
        return z1Var;
    }

    public final void f() {
        synchronized (this.f15896d) {
            c cVar = this.f15897e;
            if (cVar != null) {
                cVar.f15903c.countDown();
                try {
                    this.f15897e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f15899g;
            if (j10 > 0) {
                this.f15897e = new c(this, j10);
            }
        }
    }

    public final void finalize() throws Throwable {
        b();
        super.finalize();
    }
}
