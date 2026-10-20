package w4;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import i4.o;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class l implements ComponentCallbacks2, r4.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f16186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r4.g f16187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f16188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f16189e;

    public l(o oVar, Context context, boolean z10) {
        r4.g eVar;
        this.f16185a = context;
        this.f16186b = new WeakReference(oVar);
        if (z10) {
            oVar.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) r2.k.getSystemService(context, ConnectivityManager.class);
            if (connectivityManager == null || r2.k.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                eVar = new r4.e();
            } else {
                try {
                    eVar = new r4.i(connectivityManager, this);
                } catch (Exception unused) {
                    eVar = new r4.e();
                }
            }
        } else {
            eVar = new r4.e();
        }
        this.f16187c = eVar;
        this.f16188d = eVar.a();
        this.f16189e = new AtomicBoolean(false);
    }

    public final void a() {
        if (this.f16189e.getAndSet(true)) {
            return;
        }
        this.f16185a.unregisterComponentCallbacks(this);
        this.f16187c.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (((o) this.f16186b.get()) == null) {
            a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        q8.l lVar;
        q4.f fVar;
        o oVar = (o) this.f16186b.get();
        if (oVar != null) {
            q8.c cVar = oVar.f8058b;
            if (cVar != null && (fVar = (q4.f) cVar.getValue()) != null) {
                fVar.f13136a.b(i10);
                fVar.f13137b.b(i10);
            }
            lVar = q8.l.f13235a;
        } else {
            lVar = null;
        }
        if (lVar == null) {
            a();
        }
    }
}
