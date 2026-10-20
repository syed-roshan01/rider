package f8;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.util.Log;
import com.google.firebase.firestore.remote.f;
import e8.c1;
import e8.k;
import e8.p1;
import e8.x;
import java.util.concurrent.TimeUnit;
import l.h;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f6381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConnectivityManager f6383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6384d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f6385e;

    public b(c1 c1Var, Context context) {
        this.f6381a = c1Var;
        this.f6382b = context;
        if (context == null) {
            this.f6383c = null;
            return;
        }
        this.f6383c = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            y();
        } catch (SecurityException e4) {
            Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e4);
        }
    }

    @Override // e8.j0
    public final String g() {
        return this.f6381a.g();
    }

    @Override // e8.j0
    public final k m(p1 p1Var, e8.h hVar) {
        return this.f6381a.m(p1Var, hVar);
    }

    @Override // e8.c1
    public final boolean s(long j10, TimeUnit timeUnit) {
        return this.f6381a.s(j10, timeUnit);
    }

    @Override // e8.c1
    public final void t() {
        this.f6381a.t();
    }

    @Override // e8.c1
    public final x u() {
        return this.f6381a.u();
    }

    @Override // e8.c1
    public final void v(x xVar, f fVar) {
        this.f6381a.v(xVar, fVar);
    }

    @Override // e8.c1
    public final c1 w() {
        synchronized (this.f6384d) {
            try {
                h hVar = this.f6385e;
                if (hVar != null) {
                    hVar.run();
                    this.f6385e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f6381a.w();
    }

    @Override // e8.c1
    public final c1 x() {
        synchronized (this.f6384d) {
            try {
                h hVar = this.f6385e;
                if (hVar != null) {
                    hVar.run();
                    this.f6385e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f6381a.x();
    }

    public final void y() {
        ConnectivityManager connectivityManager = this.f6383c;
        if (connectivityManager != null) {
            r4.h hVar = new r4.h(this);
            connectivityManager.registerDefaultNetworkCallback(hVar);
            this.f6385e = new h(17, this, hVar);
        } else {
            a aVar = new a(this);
            this.f6382b.registerReceiver(aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f6385e = new h(18, this, aVar);
        }
    }
}
