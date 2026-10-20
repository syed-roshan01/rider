package androidx.fragment.app;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends androidx.lifecycle.x0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a1 f1865g = new a1(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1869d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1866a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f1867b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f1868c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1870e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1871f = false;

    public b1(boolean z10) {
        this.f1869d = z10;
    }

    public final void b(d0 d0Var) {
        if (this.f1871f) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap map = this.f1866a;
        if (map.containsKey(d0Var.mWho)) {
            return;
        }
        map.put(d0Var.mWho, d0Var);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + d0Var);
        }
    }

    public final void c(d0 d0Var) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + d0Var);
        }
        d(d0Var.mWho);
    }

    public final void d(String str) {
        HashMap map = this.f1867b;
        b1 b1Var = (b1) map.get(str);
        if (b1Var != null) {
            b1Var.onCleared();
            map.remove(str);
        }
        HashMap map2 = this.f1868c;
        androidx.lifecycle.f1 f1Var = (androidx.lifecycle.f1) map2.get(str);
        if (f1Var != null) {
            f1Var.a();
            map2.remove(str);
        }
    }

    public final void e(d0 d0Var) {
        if (this.f1871f) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f1866a.remove(d0Var.mWho) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + d0Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f1866a.equals(b1Var.f1866a) && this.f1867b.equals(b1Var.f1867b) && this.f1868c.equals(b1Var.f1868c);
    }

    public final int hashCode() {
        return this.f1868c.hashCode() + ((this.f1867b.hashCode() + (this.f1866a.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.x0
    public final void onCleared() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1870e = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f1866a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f1867b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f1868c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
