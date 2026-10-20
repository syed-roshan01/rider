package p6;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f12793o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f12795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12796c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f12801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b0 f12802i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f12806m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IInterface f12807n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f12797d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f12798e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f12799f = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y f12804k = new IBinder.DeathRecipient() { // from class: p6.y
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            c cVar = this.f12823a;
            cVar.f12795b.b("reportBinderDeath", new Object[0]);
            a7.a.w(cVar.f12803j.get());
            cVar.f12795b.b("%s : Binder has died.", cVar.f12796c);
            Iterator it = cVar.f12797d.iterator();
            while (it.hasNext()) {
                ((w) it.next()).a(new RemoteException(String.valueOf(cVar.f12796c).concat(" : Binder has died.")));
            }
            cVar.f12797d.clear();
            synchronized (cVar.f12799f) {
                cVar.d();
            }
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f12805l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakReference f12803j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [p6.y] */
    public c(Context context, v vVar, String str, Intent intent, b0 b0Var) {
        this.f12794a = context;
        this.f12795b = vVar;
        this.f12796c = str;
        this.f12801h = intent;
        this.f12802i = b0Var;
    }

    public static void b(c cVar, w wVar) {
        IInterface iInterface = cVar.f12807n;
        ArrayList arrayList = cVar.f12797d;
        v vVar = cVar.f12795b;
        if (iInterface != null || cVar.f12800g) {
            if (!cVar.f12800g) {
                wVar.run();
                return;
            } else {
                vVar.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(wVar);
                return;
            }
        }
        vVar.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(wVar);
        b bVar = new b(cVar);
        cVar.f12806m = bVar;
        cVar.f12800g = true;
        if (cVar.f12794a.bindService(cVar.f12801h, bVar, 1)) {
            return;
        }
        vVar.b("Failed to bind to the service.", new Object[0]);
        cVar.f12800g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((w) it.next()).a(new d("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f12793o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f12796c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f12796c, 10);
                    handlerThread.start();
                    map.put(this.f12796c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f12796c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f12799f) {
            this.f12798e.remove(taskCompletionSource);
        }
        a().post(new a0(this, 0));
    }

    public final void d() {
        HashSet hashSet = this.f12798e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f12796c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
