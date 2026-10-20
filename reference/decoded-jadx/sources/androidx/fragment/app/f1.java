package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1907a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f1908b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f1909c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b1 f1910d;

    public final void a(d0 d0Var) {
        if (this.f1907a.contains(d0Var)) {
            throw new IllegalStateException("Fragment already added: " + d0Var);
        }
        synchronized (this.f1907a) {
            this.f1907a.add(d0Var);
        }
        d0Var.mAdded = true;
    }

    public final d0 b(String str) {
        e1 e1Var = (e1) this.f1908b.get(str);
        if (e1Var != null) {
            return e1Var.f1899c;
        }
        return null;
    }

    public final d0 c(String str) {
        d0 d0VarFindFragmentByWho;
        for (e1 e1Var : this.f1908b.values()) {
            if (e1Var != null && (d0VarFindFragmentByWho = e1Var.f1899c.findFragmentByWho(str)) != null) {
                return d0VarFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (e1 e1Var : this.f1908b.values()) {
            if (e1Var != null) {
                arrayList.add(e1Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (e1 e1Var : this.f1908b.values()) {
            if (e1Var != null) {
                arrayList.add(e1Var.f1899c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f1907a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1907a) {
            arrayList = new ArrayList(this.f1907a);
        }
        return arrayList;
    }

    public final void g(e1 e1Var) {
        d0 d0Var = e1Var.f1899c;
        String str = d0Var.mWho;
        HashMap map = this.f1908b;
        if (map.get(str) != null) {
            return;
        }
        map.put(d0Var.mWho, e1Var);
        if (d0Var.mRetainInstanceChangedWhileDetached) {
            if (d0Var.mRetainInstance) {
                this.f1910d.b(d0Var);
            } else {
                this.f1910d.e(d0Var);
            }
            d0Var.mRetainInstanceChangedWhileDetached = false;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + d0Var);
        }
    }

    public final void h(e1 e1Var) {
        d0 d0Var = e1Var.f1899c;
        if (d0Var.mRetainInstance) {
            this.f1910d.e(d0Var);
        }
        if (((e1) this.f1908b.put(d0Var.mWho, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + d0Var);
        }
    }
}
