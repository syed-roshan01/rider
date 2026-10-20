package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import com.ride.accepter.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f2033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2034b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2035c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2036d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2037e = false;

    public t1(ViewGroup viewGroup) {
        this.f2033a = viewGroup;
    }

    public static t1 f(ViewGroup viewGroup, q0 q0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof t1) {
            return (t1) tag;
        }
        q0Var.getClass();
        n nVar = new n(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, nVar);
        return nVar;
    }

    public static t1 g(ViewGroup viewGroup, x0 x0Var) {
        return f(viewGroup, x0Var.A());
    }

    public final void a(int i10, int i11, e1 e1Var) {
        synchronized (this.f2034b) {
            try {
                x2.g gVar = new x2.g();
                s1 s1VarD = d(e1Var.f1899c);
                if (s1VarD != null) {
                    s1VarD.c(i10, i11);
                    return;
                }
                s1 s1Var = new s1(i10, i11, e1Var, gVar);
                this.f2034b.add(s1Var);
                s1Var.f2026d.add(new r1(this, s1Var, 0));
                s1Var.f2026d.add(new r1(this, s1Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(ArrayList arrayList, boolean z10);

    public final void c() {
        if (this.f2037e) {
            return;
        }
        ViewGroup viewGroup = this.f2033a;
        Field field = b3.q0.f2670a;
        if (!b3.e0.b(viewGroup)) {
            e();
            this.f2036d = false;
            return;
        }
        synchronized (this.f2034b) {
            try {
                if (!this.f2034b.isEmpty()) {
                    ArrayList<s1> arrayList = new ArrayList(this.f2035c);
                    this.f2035c.clear();
                    for (s1 s1Var : arrayList) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + s1Var);
                        }
                        s1Var.a();
                        if (!s1Var.f2029g) {
                            this.f2035c.add(s1Var);
                        }
                    }
                    i();
                    ArrayList arrayList2 = new ArrayList(this.f2034b);
                    this.f2034b.clear();
                    this.f2035c.addAll(arrayList2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((s1) it.next()).d();
                    }
                    b(arrayList2, this.f2036d);
                    this.f2036d = false;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final s1 d(d0 d0Var) {
        for (s1 s1Var : this.f2034b) {
            if (s1Var.f2025c.equals(d0Var) && !s1Var.f2028f) {
                return s1Var;
            }
        }
        return null;
    }

    public final void e() {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f2033a;
        Field field = b3.q0.f2670a;
        boolean zB = b3.e0.b(viewGroup);
        synchronized (this.f2034b) {
            try {
                i();
                Iterator it = this.f2034b.iterator();
                while (it.hasNext()) {
                    ((s1) it.next()).d();
                }
                for (s1 s1Var : new ArrayList(this.f2035c)) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        sb.append(zB ? "" : "Container " + this.f2033a + " is not attached to window. ");
                        sb.append("Cancelling running operation ");
                        sb.append(s1Var);
                        Log.v("FragmentManager", sb.toString());
                    }
                    s1Var.a();
                }
                for (s1 s1Var2 : new ArrayList(this.f2034b)) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        sb2.append(zB ? "" : "Container " + this.f2033a + " is not attached to window. ");
                        sb2.append("Cancelling pending operation ");
                        sb2.append(s1Var2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    s1Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f2034b) {
            try {
                i();
                this.f2037e = false;
                for (int size = this.f2034b.size() - 1; size >= 0; size--) {
                    s1 s1Var = (s1) this.f2034b.get(size);
                    int iD = a7.a.d(s1Var.f2025c.mView);
                    if (s1Var.f2023a == 2 && iD != 2) {
                        this.f2037e = s1Var.f2025c.isPostponed();
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        for (s1 s1Var : this.f2034b) {
            if (s1Var.f2024b == 2) {
                s1Var.c(a7.a.c(s1Var.f2025c.requireView().getVisibility()), 1);
            }
        }
    }
}
