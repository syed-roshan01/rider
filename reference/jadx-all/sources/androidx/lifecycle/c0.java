package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f2117j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n.g f2119b = new n.g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2120c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f2122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f2123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2126i;

    public c0() {
        Object obj = f2117j;
        this.f2123f = obj;
        this.f2122e = obj;
        this.f2124g = -1;
    }

    public static void a(String str) {
        m.b.o0().f11435x.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(l.q.k("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(b0 b0Var) {
        if (b0Var.f2112b) {
            int i10 = b0Var.f2113c;
            int i11 = this.f2124g;
            if (i10 >= i11) {
                return;
            }
            b0Var.f2113c = i11;
            androidx.fragment.app.w wVar = b0Var.f2111a;
            Object obj = this.f2122e;
            wVar.getClass();
            if (((w) obj) != null) {
                androidx.fragment.app.r rVar = (androidx.fragment.app.r) wVar.f2042a;
                if (rVar.f2006f) {
                    View viewRequireView = rVar.requireView();
                    if (viewRequireView.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (rVar.f2010q != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + wVar + " setting the content view on " + rVar.f2010q);
                        }
                        rVar.f2010q.setContentView(viewRequireView);
                    }
                }
            }
        }
    }

    public final void c(b0 b0Var) {
        if (this.f2125h) {
            this.f2126i = true;
            return;
        }
        this.f2125h = true;
        do {
            this.f2126i = false;
            if (b0Var != null) {
                b(b0Var);
                b0Var = null;
            } else {
                n.g gVar = this.f2119b;
                gVar.getClass();
                n.d dVar = new n.d(gVar);
                gVar.f12040c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((b0) ((Map.Entry) dVar.next()).getValue());
                    if (this.f2126i) {
                        break;
                    }
                }
            }
        } while (this.f2126i);
        this.f2125h = false;
    }
}
