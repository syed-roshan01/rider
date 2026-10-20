package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f1394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r8.l f1395b = new r8.l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y f1396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f1397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f1398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1400g;

    public i0(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackA;
        this.f1394a = runnable;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (i10 >= 34) {
                int i11 = 0;
                int i12 = 1;
                onBackInvokedCallbackA = e0.f1377a.a(new z(this, i11), new z(this, i12), new a0(this, i11), new a0(this, i12));
            } else {
                onBackInvokedCallbackA = c0.f1369a.a(new a0(this, 2));
            }
            this.f1397d = onBackInvokedCallbackA;
        }
    }

    public final void a(androidx.lifecycle.w wVar, y yVar) {
        d7.a.m(wVar, "owner");
        d7.a.m(yVar, "onBackPressedCallback");
        androidx.lifecycle.r lifecycle = wVar.getLifecycle();
        if (lifecycle.b() == androidx.lifecycle.q.f2169a) {
            return;
        }
        yVar.f1429b.add(new f0(this, lifecycle, yVar));
        d();
        yVar.f1430c = new h0(this, 0);
    }

    public final void b() {
        Object objPrevious;
        y yVar = this.f1396c;
        if (yVar == null) {
            r8.l lVar = this.f1395b;
            ListIterator<E> listIterator = lVar.listIterator(lVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((y) objPrevious).f1428a);
            yVar = (y) objPrevious;
        }
        this.f1396c = null;
        if (yVar != null) {
            yVar.a();
            return;
        }
        Runnable runnable = this.f1394a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1398e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f1397d) == null) {
            return;
        }
        c0 c0Var = c0.f1369a;
        if (z10 && !this.f1399f) {
            c0Var.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1399f = true;
        } else {
            if (z10 || !this.f1399f) {
                return;
            }
            c0Var.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1399f = false;
        }
    }

    public final void d() {
        boolean z10 = this.f1400g;
        r8.l lVar = this.f1395b;
        boolean z11 = false;
        if (!(lVar instanceof Collection) || !lVar.isEmpty()) {
            Iterator it = lVar.iterator();
            while (it.hasNext()) {
                if (((y) it.next()).f1428a) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f1400g = z11;
        if (z11 == z10 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z11);
    }
}
