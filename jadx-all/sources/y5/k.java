package y5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l.t;

/* JADX INFO: loaded from: classes.dex */
public final class k implements ServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f16972c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f16975f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16970a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Messenger f16971b = new Messenger(new zzf(Looper.getMainLooper(), new j(this)));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f16973d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f16974e = new SparseArray();

    public /* synthetic */ k(o oVar) {
        this.f16975f = oVar;
    }

    public final synchronized void a(int i10, String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i10 = this.f16970a;
            if (i10 == 0) {
                throw new IllegalStateException();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f16970a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f16970a = 4;
            d6.a.b().c((Context) this.f16975f.f16983b, this);
            n nVar = new n(str, securityException);
            Iterator it = this.f16973d.iterator();
            while (it.hasNext()) {
                ((m) it.next()).a(nVar);
            }
            this.f16973d.clear();
            for (int i11 = 0; i11 < this.f16974e.size(); i11++) {
                ((m) this.f16974e.valueAt(i11)).a(nVar);
            }
            this.f16974e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f16970a == 2 && this.f16973d.isEmpty() && this.f16974e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f16970a = 3;
                d6.a.b().c((Context) this.f16975f.f16983b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(l lVar) {
        int i10 = this.f16970a;
        int i11 = 0;
        int i12 = 1;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f16973d.add(lVar);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f16973d.add(lVar);
            ((ScheduledExecutorService) this.f16975f.f16984c).execute(new i(this, i11));
            return true;
        }
        this.f16973d.add(lVar);
        if (this.f16970a != 0) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f16970a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (d6.a.b().a((Context) this.f16975f.f16983b, intent, this, 1)) {
                ((ScheduledExecutorService) this.f16975f.f16984c).schedule(new i(this, i12), 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e4) {
            b("Unable to bind to service", e4);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f16975f.f16984c).execute(new l.h(this, iBinder, 1));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i10 = 2;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f16975f.f16984c).execute(new i(this, i10));
    }
}
