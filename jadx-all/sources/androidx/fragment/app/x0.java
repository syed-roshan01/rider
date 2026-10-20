package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ride.accepter.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {
    public d.f A;
    public d.f B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public b1 L;
    public final e M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2049b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f2051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f2052e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.activity.i0 f2054g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f2059l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f2060m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f2061n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p0 f2062o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p0 f2063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p0 f2064q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r0 f2065r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2066s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m0 f2067t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j0 f2068u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d0 f2069v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d0 f2070w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s0 f2071x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final q0 f2072y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public d.f f2073z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2048a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1 f2050c = new f1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o0 f2053f = new o0(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.activity.j0 f2055h = new androidx.activity.j0(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f2056i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f2057j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f2058k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.p0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.p0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.p0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.p0] */
    public x0() {
        Collections.synchronizedMap(new HashMap());
        this.f2059l = new x(this);
        this.f2060m = new CopyOnWriteArrayList();
        final int i10 = 0;
        this.f2061n = new a3.a(this) { // from class: androidx.fragment.app.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x0 f1989b;

            {
                this.f1989b = this;
            }

            @Override // a3.a
            public final void accept(Object obj) {
                int i11 = i10;
                x0 x0Var = this.f1989b;
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        for (d0 d0Var : x0Var.f2050c.f()) {
                            if (d0Var != null) {
                                d0Var.performConfigurationChanged(configuration);
                            }
                        }
                        break;
                    case 1:
                        x0Var.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            for (d0 d0Var2 : x0Var.f2050c.f()) {
                                if (d0Var2 != null) {
                                    d0Var2.performLowMemory();
                                }
                            }
                        }
                        break;
                    case 2:
                        x0Var.getClass();
                        boolean z10 = ((q2.o) obj).f13089a;
                        for (d0 d0Var3 : x0Var.f2050c.f()) {
                            if (d0Var3 != null) {
                                d0Var3.performMultiWindowModeChanged(z10);
                            }
                        }
                        break;
                    default:
                        x0Var.getClass();
                        boolean z11 = ((q2.q0) obj).f13097a;
                        for (d0 d0Var4 : x0Var.f2050c.f()) {
                            if (d0Var4 != null) {
                                d0Var4.performPictureInPictureModeChanged(z11);
                            }
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f2062o = new a3.a(this) { // from class: androidx.fragment.app.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x0 f1989b;

            {
                this.f1989b = this;
            }

            @Override // a3.a
            public final void accept(Object obj) {
                int i12 = i11;
                x0 x0Var = this.f1989b;
                switch (i12) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        for (d0 d0Var : x0Var.f2050c.f()) {
                            if (d0Var != null) {
                                d0Var.performConfigurationChanged(configuration);
                            }
                        }
                        break;
                    case 1:
                        x0Var.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            for (d0 d0Var2 : x0Var.f2050c.f()) {
                                if (d0Var2 != null) {
                                    d0Var2.performLowMemory();
                                }
                            }
                        }
                        break;
                    case 2:
                        x0Var.getClass();
                        boolean z10 = ((q2.o) obj).f13089a;
                        for (d0 d0Var3 : x0Var.f2050c.f()) {
                            if (d0Var3 != null) {
                                d0Var3.performMultiWindowModeChanged(z10);
                            }
                        }
                        break;
                    default:
                        x0Var.getClass();
                        boolean z11 = ((q2.q0) obj).f13097a;
                        for (d0 d0Var4 : x0Var.f2050c.f()) {
                            if (d0Var4 != null) {
                                d0Var4.performPictureInPictureModeChanged(z11);
                            }
                        }
                        break;
                }
            }
        };
        final int i12 = 2;
        this.f2063p = new a3.a(this) { // from class: androidx.fragment.app.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x0 f1989b;

            {
                this.f1989b = this;
            }

            @Override // a3.a
            public final void accept(Object obj) {
                int i13 = i12;
                x0 x0Var = this.f1989b;
                switch (i13) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        for (d0 d0Var : x0Var.f2050c.f()) {
                            if (d0Var != null) {
                                d0Var.performConfigurationChanged(configuration);
                            }
                        }
                        break;
                    case 1:
                        x0Var.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            for (d0 d0Var2 : x0Var.f2050c.f()) {
                                if (d0Var2 != null) {
                                    d0Var2.performLowMemory();
                                }
                            }
                        }
                        break;
                    case 2:
                        x0Var.getClass();
                        boolean z10 = ((q2.o) obj).f13089a;
                        for (d0 d0Var3 : x0Var.f2050c.f()) {
                            if (d0Var3 != null) {
                                d0Var3.performMultiWindowModeChanged(z10);
                            }
                        }
                        break;
                    default:
                        x0Var.getClass();
                        boolean z11 = ((q2.q0) obj).f13097a;
                        for (d0 d0Var4 : x0Var.f2050c.f()) {
                            if (d0Var4 != null) {
                                d0Var4.performPictureInPictureModeChanged(z11);
                            }
                        }
                        break;
                }
            }
        };
        final int i13 = 3;
        this.f2064q = new a3.a(this) { // from class: androidx.fragment.app.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x0 f1989b;

            {
                this.f1989b = this;
            }

            @Override // a3.a
            public final void accept(Object obj) {
                int i14 = i13;
                x0 x0Var = this.f1989b;
                switch (i14) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        for (d0 d0Var : x0Var.f2050c.f()) {
                            if (d0Var != null) {
                                d0Var.performConfigurationChanged(configuration);
                            }
                        }
                        break;
                    case 1:
                        x0Var.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            for (d0 d0Var2 : x0Var.f2050c.f()) {
                                if (d0Var2 != null) {
                                    d0Var2.performLowMemory();
                                }
                            }
                        }
                        break;
                    case 2:
                        x0Var.getClass();
                        boolean z10 = ((q2.o) obj).f13089a;
                        for (d0 d0Var3 : x0Var.f2050c.f()) {
                            if (d0Var3 != null) {
                                d0Var3.performMultiWindowModeChanged(z10);
                            }
                        }
                        break;
                    default:
                        x0Var.getClass();
                        boolean z11 = ((q2.q0) obj).f13097a;
                        for (d0 d0Var4 : x0Var.f2050c.f()) {
                            if (d0Var4 != null) {
                                d0Var4.performPictureInPictureModeChanged(z11);
                            }
                        }
                        break;
                }
            }
        };
        this.f2065r = new r0(this);
        this.f2066s = -1;
        this.f2071x = new s0(this);
        this.f2072y = new q0(this, i11);
        this.C = new ArrayDeque();
        this.M = new e(this, i12);
    }

    public static boolean C(d0 d0Var) {
        if (!d0Var.mHasMenu || !d0Var.mMenuVisible) {
            boolean zC = false;
            for (d0 d0Var2 : d0Var.mChildFragmentManager.f2050c.e()) {
                if (d0Var2 != null) {
                    zC = C(d0Var2);
                }
                if (zC) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean D(d0 d0Var) {
        if (d0Var == null) {
            return true;
        }
        x0 x0Var = d0Var.mFragmentManager;
        return d0Var.equals(x0Var.f2070w) && D(x0Var.f2069v);
    }

    public static void R(d0 d0Var) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + d0Var);
        }
        if (d0Var.mHidden) {
            d0Var.mHidden = false;
            d0Var.mHiddenChanged = !d0Var.mHiddenChanged;
        }
    }

    public final q0 A() {
        d0 d0Var = this.f2069v;
        return d0Var != null ? d0Var.mFragmentManager.A() : this.f2072y;
    }

    public final void B(d0 d0Var) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + d0Var);
        }
        if (d0Var.mHidden) {
            return;
        }
        d0Var.mHidden = true;
        d0Var.mHiddenChanged = true ^ d0Var.mHiddenChanged;
        Q(d0Var);
    }

    public final void E(int i10, boolean z10) {
        HashMap map;
        m0 m0Var;
        if (this.f2067t == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f2066s) {
            this.f2066s = i10;
            f1 f1Var = this.f2050c;
            Iterator it = f1Var.f1907a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = f1Var.f1908b;
                if (!zHasNext) {
                    break;
                }
                e1 e1Var = (e1) map.get(((d0) it.next()).mWho);
                if (e1Var != null) {
                    e1Var.j();
                }
            }
            for (e1 e1Var2 : map.values()) {
                if (e1Var2 != null) {
                    e1Var2.j();
                    d0 d0Var = e1Var2.f1899c;
                    if (d0Var.mRemoving && !d0Var.isInBackStack()) {
                        if (d0Var.mBeingSaved && !f1Var.f1909c.containsKey(d0Var.mWho)) {
                            e1Var2.m();
                        }
                        f1Var.h(e1Var2);
                    }
                }
            }
            for (e1 e1Var3 : f1Var.d()) {
                d0 d0Var2 = e1Var3.f1899c;
                if (d0Var2.mDeferStart) {
                    if (this.f2049b) {
                        this.H = true;
                    } else {
                        d0Var2.mDeferStart = false;
                        e1Var3.j();
                    }
                }
            }
            if (this.D && (m0Var = this.f2067t) != null && this.f2066s == 7) {
                ((f0) m0Var).f1906e.invalidateOptionsMenu();
                this.D = false;
            }
        }
    }

    public final void F() {
        if (this.f2067t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.f1871f = false;
        for (d0 d0Var : this.f2050c.f()) {
            if (d0Var != null) {
                d0Var.noteStateNotSaved();
            }
        }
    }

    public final boolean G() {
        t(false);
        s(true);
        d0 d0Var = this.f2070w;
        if (d0Var != null && d0Var.getChildFragmentManager().G()) {
            return true;
        }
        boolean zH = H(this.I, this.J, -1, 0);
        if (zH) {
            this.f2049b = true;
            try {
                J(this.I, this.J);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        S();
        boolean z10 = this.H;
        f1 f1Var = this.f2050c;
        if (z10) {
            this.H = false;
            for (e1 e1Var : f1Var.d()) {
                d0 d0Var2 = e1Var.f1899c;
                if (d0Var2.mDeferStart) {
                    if (this.f2049b) {
                        this.H = true;
                    } else {
                        d0Var2.mDeferStart = false;
                        e1Var.j();
                    }
                }
            }
        }
        f1Var.f1908b.values().removeAll(Collections.singleton(null));
        return zH;
    }

    public final boolean H(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10 = (i11 & 1) != 0;
        ArrayList arrayList3 = this.f2051d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i10 < 0) {
                size = z10 ? 0 : this.f2051d.size() - 1;
            } else {
                int size2 = this.f2051d.size() - 1;
                while (size2 >= 0) {
                    a aVar = (a) this.f2051d.get(size2);
                    if (i10 >= 0 && i10 == aVar.f1849r) {
                        break;
                    }
                    size2--;
                }
                if (size2 >= 0) {
                    if (z10) {
                        while (size2 > 0) {
                            a aVar2 = (a) this.f2051d.get(size2 - 1);
                            if (i10 < 0 || i10 != aVar2.f1849r) {
                                break;
                            }
                            size2--;
                        }
                    } else if (size2 != this.f2051d.size() - 1) {
                        size2++;
                    }
                    size = size2;
                } else {
                    size = size2;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f2051d.size() - 1; size3 >= size; size3--) {
            arrayList.add((a) this.f2051d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void I(d0 d0Var) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + d0Var + " nesting=" + d0Var.mBackStackNesting);
        }
        boolean z10 = !d0Var.isInBackStack();
        if (!d0Var.mDetached || z10) {
            f1 f1Var = this.f2050c;
            synchronized (f1Var.f1907a) {
                f1Var.f1907a.remove(d0Var);
            }
            d0Var.mAdded = false;
            if (C(d0Var)) {
                this.D = true;
            }
            d0Var.mRemoving = true;
            Q(d0Var);
        }
    }

    public final void J(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((a) arrayList.get(i10)).f1846o) {
                if (i11 != i10) {
                    u(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((a) arrayList.get(i11)).f1846o) {
                        i11++;
                    }
                }
                u(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            u(arrayList, arrayList2, i11, size);
        }
    }

    public final void K(Parcelable parcelable) {
        int i10;
        x xVar;
        int i11;
        e1 e1Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f2067t.f1972b.getClassLoader());
                this.f2058k.put(str.substring(7), bundle2);
            }
        }
        ArrayList<d1> arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f2067t.f1972b.getClassLoader());
                arrayList.add((d1) bundle.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE));
            }
        }
        f1 f1Var = this.f2050c;
        HashMap map = f1Var.f1909c;
        map.clear();
        for (d1 d1Var : arrayList) {
            map.put(d1Var.f1881b, d1Var);
        }
        z0 z0Var = (z0) bundle3.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE);
        if (z0Var == null) {
            return;
        }
        HashMap map2 = f1Var.f1908b;
        map2.clear();
        Iterator it = z0Var.f2098a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i10 = 2;
            xVar = this.f2059l;
            if (!zHasNext) {
                break;
            }
            d1 d1Var2 = (d1) f1Var.f1909c.remove((String) it.next());
            if (d1Var2 != null) {
                d0 d0Var = (d0) this.L.f1866a.get(d1Var2.f1881b);
                if (d0Var != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + d0Var);
                    }
                    e1Var = new e1(xVar, f1Var, d0Var, d1Var2);
                } else {
                    e1Var = new e1(this.f2059l, this.f2050c, this.f2067t.f1972b.getClassLoader(), z(), d1Var2);
                }
                d0 d0Var2 = e1Var.f1899c;
                d0Var2.mFragmentManager = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + d0Var2.mWho + "): " + d0Var2);
                }
                e1Var.k(this.f2067t.f1972b.getClassLoader());
                f1Var.g(e1Var);
                e1Var.f1901e = this.f2066s;
            }
        }
        b1 b1Var = this.L;
        b1Var.getClass();
        for (d0 d0Var3 : new ArrayList(b1Var.f1866a.values())) {
            if (map2.get(d0Var3.mWho) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + d0Var3 + " that was not found in the set of active Fragments " + z0Var.f2098a);
                }
                this.L.e(d0Var3);
                d0Var3.mFragmentManager = this;
                e1 e1Var2 = new e1(xVar, f1Var, d0Var3);
                e1Var2.f1901e = 1;
                e1Var2.j();
                d0Var3.mRemoving = true;
                e1Var2.j();
            }
        }
        ArrayList<String> arrayList2 = z0Var.f2099b;
        f1Var.f1907a.clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                d0 d0VarB = f1Var.b(str3);
                if (d0VarB == null) {
                    throw new IllegalStateException(l.q.k("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + d0VarB);
                }
                f1Var.a(d0VarB);
            }
        }
        if (z0Var.f2100c != null) {
            this.f2051d = new ArrayList(z0Var.f2100c.length);
            int i12 = 0;
            while (true) {
                b[] bVarArr = z0Var.f2100c;
                if (i12 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i12];
                bVar.getClass();
                a aVar = new a(this);
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int[] iArr = bVar.f1851a;
                    if (i13 >= iArr.length) {
                        break;
                    }
                    g1 g1Var = new g1();
                    int i15 = i13 + 1;
                    g1Var.f1916a = iArr[i13];
                    if (Log.isLoggable("FragmentManager", i10)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i14 + " base fragment #" + iArr[i15]);
                    }
                    g1Var.f1923h = androidx.lifecycle.q.values()[bVar.f1853c[i14]];
                    g1Var.f1924i = androidx.lifecycle.q.values()[bVar.f1854d[i14]];
                    int i16 = i13 + 2;
                    g1Var.f1918c = iArr[i15] != 0;
                    int i17 = iArr[i16];
                    g1Var.f1919d = i17;
                    int i18 = iArr[i13 + 3];
                    g1Var.f1920e = i18;
                    int i19 = i13 + 5;
                    int i20 = iArr[i13 + 4];
                    g1Var.f1921f = i20;
                    i13 += 6;
                    int i21 = iArr[i19];
                    g1Var.f1922g = i21;
                    aVar.f1833b = i17;
                    aVar.f1834c = i18;
                    aVar.f1835d = i20;
                    aVar.f1836e = i21;
                    aVar.b(g1Var);
                    i14++;
                    i10 = 2;
                }
                aVar.f1837f = bVar.f1855e;
                aVar.f1839h = bVar.f1856f;
                aVar.f1838g = true;
                aVar.f1840i = bVar.f1858o;
                aVar.f1841j = bVar.f1859p;
                aVar.f1842k = bVar.f1860q;
                aVar.f1843l = bVar.f1861r;
                aVar.f1844m = bVar.f1862s;
                aVar.f1845n = bVar.f1863t;
                aVar.f1846o = bVar.f1864u;
                aVar.f1849r = bVar.f1857n;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList3 = bVar.f1852b;
                    if (i22 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i22);
                    if (str4 != null) {
                        ((g1) aVar.f1832a.get(i22)).f1917b = f1Var.b(str4);
                    }
                    i22++;
                }
                aVar.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder sbQ = a7.a.q("restoreAllState: back stack #", i12, " (index ");
                    sbQ.append(aVar.f1849r);
                    sbQ.append("): ");
                    sbQ.append(aVar);
                    Log.v("FragmentManager", sbQ.toString());
                    PrintWriter printWriter = new PrintWriter(new q1());
                    aVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2051d.add(aVar);
                i12++;
                i10 = 2;
            }
            i11 = 0;
        } else {
            i11 = 0;
            this.f2051d = null;
        }
        this.f2056i.set(z0Var.f2101d);
        String str5 = z0Var.f2102e;
        if (str5 != null) {
            d0 d0VarB2 = f1Var.b(str5);
            this.f2070w = d0VarB2;
            n(d0VarB2);
        }
        ArrayList arrayList4 = z0Var.f2103f;
        if (arrayList4 != null) {
            for (int i23 = i11; i23 < arrayList4.size(); i23++) {
                this.f2057j.put((String) arrayList4.get(i23), (c) z0Var.f2104n.get(i23));
            }
        }
        this.C = new ArrayDeque(z0Var.f2105o);
    }

    public final Bundle L() {
        ArrayList arrayList;
        b[] bVarArr;
        int size;
        Bundle bundle = new Bundle();
        x();
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((t1) it.next()).e();
        }
        t(true);
        this.E = true;
        this.L.f1871f = true;
        f1 f1Var = this.f2050c;
        f1Var.getClass();
        HashMap map = f1Var.f1908b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (e1 e1Var : map.values()) {
            if (e1Var != null) {
                e1Var.m();
                d0 d0Var = e1Var.f1899c;
                arrayList2.add(d0Var.mWho);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + d0Var + ": " + d0Var.mSavedFragmentState);
                }
            }
        }
        f1 f1Var2 = this.f2050c;
        f1Var2.getClass();
        ArrayList<d1> arrayList3 = new ArrayList(f1Var2.f1909c.values());
        if (!arrayList3.isEmpty()) {
            f1 f1Var3 = this.f2050c;
            synchronized (f1Var3.f1907a) {
                try {
                    if (f1Var3.f1907a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(f1Var3.f1907a.size());
                        for (d0 d0Var2 : f1Var3.f1907a) {
                            arrayList.add(d0Var2.mWho);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + d0Var2.mWho + "): " + d0Var2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList4 = this.f2051d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                bVarArr = null;
            } else {
                bVarArr = new b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    bVarArr[i10] = new b((a) this.f2051d.get(i10));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sbQ = a7.a.q("saveAllState: adding back stack #", i10, ": ");
                        sbQ.append(this.f2051d.get(i10));
                        Log.v("FragmentManager", sbQ.toString());
                    }
                }
            }
            z0 z0Var = new z0();
            z0Var.f2102e = null;
            ArrayList arrayList5 = new ArrayList();
            z0Var.f2103f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            z0Var.f2104n = arrayList6;
            z0Var.f2098a = arrayList2;
            z0Var.f2099b = arrayList;
            z0Var.f2100c = bVarArr;
            z0Var.f2101d = this.f2056i.get();
            d0 d0Var3 = this.f2070w;
            if (d0Var3 != null) {
                z0Var.f2102e = d0Var3.mWho;
            }
            arrayList5.addAll(this.f2057j.keySet());
            arrayList6.addAll(this.f2057j.values());
            z0Var.f2105o = new ArrayList(this.C);
            bundle.putParcelable(RemoteConfigConstants.ResponseFieldKey.STATE, z0Var);
            for (String str : this.f2058k.keySet()) {
                bundle.putBundle(l.q.x("result_", str), (Bundle) this.f2058k.get(str));
            }
            for (d1 d1Var : arrayList3) {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(RemoteConfigConstants.ResponseFieldKey.STATE, d1Var);
                bundle.putBundle("fragment_" + d1Var.f1881b, bundle2);
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void M() {
        synchronized (this.f2048a) {
            try {
                if (this.f2048a.size() == 1) {
                    this.f2067t.f1973c.removeCallbacks(this.M);
                    this.f2067t.f1973c.post(this.M);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void N(d0 d0Var, boolean z10) {
        ViewGroup viewGroupY = y(d0Var);
        if (viewGroupY == null || !(viewGroupY instanceof k0)) {
            return;
        }
        ((k0) viewGroupY).setDrawDisappearingViewsLast(!z10);
    }

    public final void O(d0 d0Var, androidx.lifecycle.q qVar) {
        if (d0Var.equals(this.f2050c.b(d0Var.mWho)) && (d0Var.mHost == null || d0Var.mFragmentManager == this)) {
            d0Var.mMaxState = qVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + d0Var + " is not an active fragment of FragmentManager " + this);
    }

    public final void P(d0 d0Var) {
        if (d0Var != null) {
            if (!d0Var.equals(this.f2050c.b(d0Var.mWho)) || (d0Var.mHost != null && d0Var.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + d0Var + " is not an active fragment of FragmentManager " + this);
            }
        }
        d0 d0Var2 = this.f2070w;
        this.f2070w = d0Var;
        n(d0Var2);
        n(this.f2070w);
    }

    public final void Q(d0 d0Var) {
        ViewGroup viewGroupY = y(d0Var);
        if (viewGroupY != null) {
            if (d0Var.getPopExitAnim() + d0Var.getPopEnterAnim() + d0Var.getExitAnim() + d0Var.getEnterAnim() > 0) {
                if (viewGroupY.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupY.setTag(R.id.visible_removing_fragment_view_tag, d0Var);
                }
                ((d0) viewGroupY.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(d0Var.getPopDirection());
            }
        }
    }

    public final void S() {
        synchronized (this.f2048a) {
            try {
                if (!this.f2048a.isEmpty()) {
                    androidx.activity.j0 j0Var = this.f2055h;
                    j0Var.f1428a = true;
                    c9.a aVar = j0Var.f1430c;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    return;
                }
                androidx.activity.j0 j0Var2 = this.f2055h;
                ArrayList arrayList = this.f2051d;
                j0Var2.f1428a = arrayList != null && arrayList.size() > 0 && D(this.f2069v);
                c9.a aVar2 = j0Var2.f1430c;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final e1 a(d0 d0Var) {
        String str = d0Var.mPreviousWho;
        if (str != null) {
            n3.c.d(d0Var, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + d0Var);
        }
        e1 e1VarF = f(d0Var);
        d0Var.mFragmentManager = this;
        f1 f1Var = this.f2050c;
        f1Var.g(e1VarF);
        if (!d0Var.mDetached) {
            f1Var.a(d0Var);
            d0Var.mRemoving = false;
            if (d0Var.mView == null) {
                d0Var.mHiddenChanged = false;
            }
            if (C(d0Var)) {
                this.D = true;
            }
        }
        return e1VarF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(m0 m0Var, j0 j0Var, d0 d0Var) {
        androidx.lifecycle.w wVar;
        if (this.f2067t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2067t = m0Var;
        this.f2068u = j0Var;
        this.f2069v = d0Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2060m;
        if (d0Var != null) {
            copyOnWriteArrayList.add(new t0(d0Var));
        } else if (m0Var instanceof c1) {
            copyOnWriteArrayList.add((c1) m0Var);
        }
        if (this.f2069v != null) {
            S();
        }
        if (m0Var instanceof androidx.activity.k0) {
            androidx.activity.k0 k0Var = (androidx.activity.k0) m0Var;
            androidx.activity.i0 onBackPressedDispatcher = k0Var.getOnBackPressedDispatcher();
            this.f2054g = onBackPressedDispatcher;
            if (d0Var != null) {
                wVar = k0Var;
                wVar = d0Var;
            }
            wVar = k0Var;
            onBackPressedDispatcher.a(wVar, this.f2055h);
        }
        int i10 = 0;
        if (d0Var != null) {
            b1 b1Var = d0Var.mFragmentManager.L;
            HashMap map = b1Var.f1867b;
            b1 b1Var2 = (b1) map.get(d0Var.mWho);
            if (b1Var2 == null) {
                b1Var2 = new b1(b1Var.f1869d);
                map.put(d0Var.mWho, b1Var2);
            }
            this.L = b1Var2;
        } else if (m0Var instanceof androidx.lifecycle.g1) {
            this.L = (b1) new androidx.lifecycle.e1(((androidx.lifecycle.g1) m0Var).getViewModelStore(), b1.f1865g).a(b1.class);
        } else {
            this.L = new b1(false);
        }
        b1 b1Var3 = this.L;
        int i11 = 1;
        b1Var3.f1871f = this.E || this.F;
        this.f2050c.f1910d = b1Var3;
        Object obj = this.f2067t;
        int i12 = 3;
        if ((obj instanceof b4.g) && d0Var == null) {
            b4.e savedStateRegistry = ((b4.g) obj).getSavedStateRegistry();
            savedStateRegistry.d("android:support:fragments", new androidx.activity.f(this, 3));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                K(bundleA);
            }
        }
        Object obj2 = this.f2067t;
        if (obj2 instanceof d.j) {
            d.i activityResultRegistry = ((d.j) obj2).getActivityResultRegistry();
            String strX = l.q.x("FragmentManager:", d0Var != null ? a7.a.p(new StringBuilder(), d0Var.mWho, ":") : "");
            this.f2073z = activityResultRegistry.d(l.q.j(strX, "StartActivityForResult"), new e.e(), new q0(this, 2));
            this.A = activityResultRegistry.d(l.q.j(strX, "StartIntentSenderForResult"), new e.c(i11), new q0(this, i12));
            this.B = activityResultRegistry.d(l.q.j(strX, "RequestPermissions"), new e.d(), new q0(this, i10));
        }
        Object obj3 = this.f2067t;
        if (obj3 instanceof r2.n) {
            ((r2.n) obj3).addOnConfigurationChangedListener(this.f2061n);
        }
        Object obj4 = this.f2067t;
        if (obj4 instanceof r2.o) {
            ((r2.o) obj4).addOnTrimMemoryListener(this.f2062o);
        }
        Object obj5 = this.f2067t;
        if (obj5 instanceof q2.o0) {
            ((q2.o0) obj5).addOnMultiWindowModeChangedListener(this.f2063p);
        }
        Object obj6 = this.f2067t;
        if (obj6 instanceof q2.p0) {
            ((q2.p0) obj6).addOnPictureInPictureModeChangedListener(this.f2064q);
        }
        Object obj7 = this.f2067t;
        if ((obj7 instanceof b3.i) && d0Var == null) {
            ((b3.i) obj7).addMenuProvider(this.f2065r);
        }
    }

    public final void c(d0 d0Var) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + d0Var);
        }
        if (d0Var.mDetached) {
            d0Var.mDetached = false;
            if (d0Var.mAdded) {
                return;
            }
            this.f2050c.a(d0Var);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + d0Var);
            }
            if (C(d0Var)) {
                this.D = true;
            }
        }
    }

    public final void d() {
        this.f2049b = false;
        this.J.clear();
        this.I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f2050c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((e1) it.next()).f1899c.mContainer;
            if (viewGroup != null) {
                hashSet.add(t1.f(viewGroup, A()));
            }
        }
        return hashSet;
    }

    public final e1 f(d0 d0Var) {
        String str = d0Var.mWho;
        f1 f1Var = this.f2050c;
        e1 e1Var = (e1) f1Var.f1908b.get(str);
        if (e1Var != null) {
            return e1Var;
        }
        e1 e1Var2 = new e1(this.f2059l, f1Var, d0Var);
        e1Var2.k(this.f2067t.f1972b.getClassLoader());
        e1Var2.f1901e = this.f2066s;
        return e1Var2;
    }

    public final void g(d0 d0Var) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + d0Var);
        }
        if (d0Var.mDetached) {
            return;
        }
        d0Var.mDetached = true;
        if (d0Var.mAdded) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + d0Var);
            }
            f1 f1Var = this.f2050c;
            synchronized (f1Var.f1907a) {
                f1Var.f1907a.remove(d0Var);
            }
            d0Var.mAdded = false;
            if (C(d0Var)) {
                this.D = true;
            }
            Q(d0Var);
        }
    }

    public final boolean h(MenuItem menuItem) {
        if (this.f2066s < 1) {
            return false;
        }
        for (d0 d0Var : this.f2050c.f()) {
            if (d0Var != null && d0Var.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(Menu menu, MenuInflater menuInflater) {
        if (this.f2066s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (d0 d0Var : this.f2050c.f()) {
            if (d0Var != null && d0Var.isMenuVisible() && d0Var.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(d0Var);
                z10 = true;
            }
        }
        if (this.f2052e != null) {
            for (int i10 = 0; i10 < this.f2052e.size(); i10++) {
                d0 d0Var2 = (d0) this.f2052e.get(i10);
                if (arrayList == null || !arrayList.contains(d0Var2)) {
                    d0Var2.onDestroyOptionsMenu();
                }
            }
        }
        this.f2052e = arrayList;
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x008f  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3 A[LOOP:3: B:41:0x00dd->B:43:0x00e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x0070, please report this as an issue */
    public final void j() {
        boolean zIsChangingConfigurations;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        d.f fVar;
        Iterator it;
        Iterator it2;
        this.G = true;
        t(true);
        Iterator it3 = e().iterator();
        while (it3.hasNext()) {
            ((t1) it3.next()).e();
        }
        m0 m0Var = this.f2067t;
        boolean z10 = m0Var instanceof androidx.lifecycle.g1;
        f1 f1Var = this.f2050c;
        if (!z10) {
            Context context = m0Var.f1972b;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            } else {
                it2 = this.f2057j.values().iterator();
                while (it2.hasNext()) {
                    for (String str : ((c) it2.next()).f1872a) {
                        b1 b1Var = f1Var.f1910d;
                        b1Var.getClass();
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                        }
                        b1Var.d(str);
                    }
                }
            }
            p(-1);
            obj = this.f2067t;
            if (obj instanceof r2.o) {
                ((r2.o) obj).removeOnTrimMemoryListener(this.f2062o);
            }
            obj2 = this.f2067t;
            if (obj2 instanceof r2.n) {
                ((r2.n) obj2).removeOnConfigurationChangedListener(this.f2061n);
            }
            obj3 = this.f2067t;
            if (obj3 instanceof q2.o0) {
                ((q2.o0) obj3).removeOnMultiWindowModeChangedListener(this.f2063p);
            }
            obj4 = this.f2067t;
            if (obj4 instanceof q2.p0) {
                ((q2.p0) obj4).removeOnPictureInPictureModeChangedListener(this.f2064q);
            }
            obj5 = this.f2067t;
            if (obj5 instanceof b3.i) {
                ((b3.i) obj5).removeMenuProvider(this.f2065r);
            }
            this.f2067t = null;
            this.f2068u = null;
            this.f2069v = null;
            if (this.f2054g != null) {
                it = this.f2055h.f1429b.iterator();
                while (it.hasNext()) {
                    ((androidx.activity.c) it.next()).cancel();
                }
                this.f2054g = null;
            }
            fVar = this.f2073z;
            if (fVar != null) {
                fVar.b();
                this.A.b();
                this.B.b();
            }
        }
        zIsChangingConfigurations = f1Var.f1910d.f1870e;
        if (zIsChangingConfigurations) {
            it2 = this.f2057j.values().iterator();
            while (it2.hasNext()) {
                while (r1.hasNext()) {
                    b1 b1Var2 = f1Var.f1910d;
                    b1Var2.getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    b1Var2.d(str);
                }
            }
        }
        p(-1);
        obj = this.f2067t;
        if (obj instanceof r2.o) {
            ((r2.o) obj).removeOnTrimMemoryListener(this.f2062o);
        }
        obj2 = this.f2067t;
        if (obj2 instanceof r2.n) {
            ((r2.n) obj2).removeOnConfigurationChangedListener(this.f2061n);
        }
        obj3 = this.f2067t;
        if (obj3 instanceof q2.o0) {
            ((q2.o0) obj3).removeOnMultiWindowModeChangedListener(this.f2063p);
        }
        obj4 = this.f2067t;
        if (obj4 instanceof q2.p0) {
            ((q2.p0) obj4).removeOnPictureInPictureModeChangedListener(this.f2064q);
        }
        obj5 = this.f2067t;
        if (obj5 instanceof b3.i) {
            ((b3.i) obj5).removeMenuProvider(this.f2065r);
        }
        this.f2067t = null;
        this.f2068u = null;
        this.f2069v = null;
        if (this.f2054g != null) {
            it = this.f2055h.f1429b.iterator();
            while (it.hasNext()) {
                ((androidx.activity.c) it.next()).cancel();
            }
            this.f2054g = null;
        }
        fVar = this.f2073z;
        if (fVar != null) {
            fVar.b();
            this.A.b();
            this.B.b();
        }
    }

    public final void k() {
        for (d0 d0Var : this.f2050c.e()) {
            if (d0Var != null) {
                d0Var.onHiddenChanged(d0Var.isHidden());
                d0Var.mChildFragmentManager.k();
            }
        }
    }

    public final boolean l(MenuItem menuItem) {
        if (this.f2066s < 1) {
            return false;
        }
        for (d0 d0Var : this.f2050c.f()) {
            if (d0Var != null && d0Var.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void m(Menu menu) {
        if (this.f2066s < 1) {
            return;
        }
        for (d0 d0Var : this.f2050c.f()) {
            if (d0Var != null) {
                d0Var.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void n(d0 d0Var) {
        if (d0Var != null) {
            if (d0Var.equals(this.f2050c.b(d0Var.mWho))) {
                d0Var.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final boolean o(Menu menu) {
        boolean z10 = false;
        if (this.f2066s < 1) {
            return false;
        }
        for (d0 d0Var : this.f2050c.f()) {
            if (d0Var != null && d0Var.isMenuVisible() && d0Var.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void p(int i10) {
        try {
            this.f2049b = true;
            for (e1 e1Var : this.f2050c.f1908b.values()) {
                if (e1Var != null) {
                    e1Var.f1901e = i10;
                }
            }
            E(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((t1) it.next()).e();
            }
            this.f2049b = false;
            t(true);
        } catch (Throwable th) {
            this.f2049b = false;
            throw th;
        }
    }

    public final void q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strJ = l.q.j(str, "    ");
        f1 f1Var = this.f2050c;
        f1Var.getClass();
        String str2 = str + "    ";
        HashMap map = f1Var.f1908b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (e1 e1Var : map.values()) {
                printWriter.print(str);
                if (e1Var != null) {
                    d0 d0Var = e1Var.f1899c;
                    printWriter.println(d0Var);
                    d0Var.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = f1Var.f1907a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                d0 d0Var2 = (d0) arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(d0Var2.toString());
            }
        }
        ArrayList arrayList2 = this.f2052e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                d0 d0Var3 = (d0) this.f2052e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(d0Var3.toString());
            }
        }
        ArrayList arrayList3 = this.f2051d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                a aVar = (a) this.f2051d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.f(strJ, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2056i.get());
        synchronized (this.f2048a) {
            try {
                int size4 = this.f2048a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        Object obj = (v0) this.f2048a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2067t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2068u);
        if (this.f2069v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2069v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2066s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void r(v0 v0Var, boolean z10) {
        if (!z10) {
            if (this.f2067t == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f2048a) {
            try {
                if (this.f2067t == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f2048a.add(v0Var);
                    M();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(boolean z10) {
        if (this.f2049b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2067t == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f2067t.f1973c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10 && (this.E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.I == null) {
            this.I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    public final boolean t(boolean z10) {
        s(z10);
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.I;
            ArrayList arrayList2 = this.J;
            synchronized (this.f2048a) {
                if (this.f2048a.isEmpty()) {
                    break;
                }
                try {
                    int size = this.f2048a.size();
                    boolean zA = false;
                    for (int i10 = 0; i10 < size; i10++) {
                        zA |= ((v0) this.f2048a.get(i10)).a(arrayList, arrayList2);
                    }
                    this.f2048a.clear();
                    this.f2067t.f1973c.removeCallbacks(this.M);
                    if (!zA) {
                        break;
                    }
                    this.f2049b = true;
                    try {
                        J(this.I, this.J);
                        d();
                        z11 = true;
                    } catch (Throwable th) {
                        d();
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.f2048a.clear();
                    this.f2067t.f1973c.removeCallbacks(this.M);
                    throw th2;
                }
            }
        }
        S();
        if (this.H) {
            this.H = false;
            for (e1 e1Var : this.f2050c.d()) {
                d0 d0Var = e1Var.f1899c;
                if (d0Var.mDeferStart) {
                    if (this.f2049b) {
                        this.H = true;
                    } else {
                        d0Var.mDeferStart = false;
                        e1Var.j();
                    }
                }
            }
        }
        this.f2050c.f1908b.values().removeAll(Collections.singleton(null));
        return z11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        d0 d0Var = this.f2069v;
        if (d0Var != null) {
            sb.append(d0Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f2069v)));
            sb.append("}");
        } else {
            m0 m0Var = this.f2067t;
            if (m0Var != null) {
                sb.append(m0Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f2067t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0223 A[PHI: r12
  0x0223: PHI (r12v9 int) = (r12v8 int), (r12v10 int) binds: [B:104:0x0213, B:109:0x021f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0167  */
    public final void u(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        ViewGroup viewGroup;
        f1 f1Var;
        f1 f1Var2;
        int i12;
        boolean z10 = ((a) arrayList.get(i10)).f1846o;
        ArrayList arrayList3 = this.K;
        if (arrayList3 == null) {
            this.K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.K;
        f1 f1Var3 = this.f2050c;
        arrayList4.addAll(f1Var3.f());
        d0 d0Var = this.f2070w;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int i14 = 1;
            if (i13 >= i11) {
                f1 f1Var4 = f1Var3;
                this.K.clear();
                if (!z10 && this.f2066s >= 1) {
                    for (int i15 = i10; i15 < i11; i15++) {
                        Iterator it = ((a) arrayList.get(i15)).f1832a.iterator();
                        while (it.hasNext()) {
                            d0 d0Var2 = ((g1) it.next()).f1917b;
                            if (d0Var2 == null || d0Var2.mFragmentManager == null) {
                                f1Var = f1Var4;
                            } else {
                                f1Var = f1Var4;
                                f1Var.g(f(d0Var2));
                            }
                            f1Var4 = f1Var;
                        }
                    }
                }
                for (int i16 = i10; i16 < i11; i16++) {
                    a aVar = (a) arrayList.get(i16);
                    if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                        aVar.c(-1);
                        boolean z12 = true;
                        for (int size = aVar.f1832a.size() - 1; size >= 0; size--) {
                            g1 g1Var = (g1) aVar.f1832a.get(size);
                            d0 d0Var3 = g1Var.f1917b;
                            if (d0Var3 != null) {
                                d0Var3.mBeingSaved = false;
                                d0Var3.setPopDirection(z12);
                                int i17 = aVar.f1837f;
                                int i18 = 8194;
                                int i19 = 4097;
                                if (i17 != 4097) {
                                    if (i17 != 8194) {
                                        i18 = 4100;
                                        i19 = 8197;
                                        if (i17 != 8197) {
                                            if (i17 == 4099) {
                                                i18 = 4099;
                                            } else if (i17 != 4100) {
                                                i18 = 0;
                                            } else {
                                                i18 = i19;
                                            }
                                        }
                                    } else {
                                        i18 = i19;
                                    }
                                }
                                d0Var3.setNextTransition(i18);
                                d0Var3.setSharedElementNames(aVar.f1845n, aVar.f1844m);
                            }
                            int i20 = g1Var.f1916a;
                            x0 x0Var = aVar.f1847p;
                            switch (i20) {
                                case 1:
                                    d0Var3.setAnimations(g1Var.f1919d, g1Var.f1920e, g1Var.f1921f, g1Var.f1922g);
                                    z12 = true;
                                    x0Var.N(d0Var3, true);
                                    x0Var.I(d0Var3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + g1Var.f1916a);
                                case 3:
                                    d0Var3.setAnimations(g1Var.f1919d, g1Var.f1920e, g1Var.f1921f, g1Var.f1922g);
                                    x0Var.a(d0Var3);
                                    z12 = true;
                                    break;
                                case 4:
                                    d0Var3.setAnimations(g1Var.f1919d, g1Var.f1920e, g1Var.f1921f, g1Var.f1922g);
                                    x0Var.getClass();
                                    R(d0Var3);
                                    z12 = true;
                                    break;
                                case 5:
                                    d0Var3.setAnimations(g1Var.f1919d, g1Var.f1920e, g1Var.f1921f, g1Var.f1922g);
                                    x0Var.N(d0Var3, true);
                                    x0Var.B(d0Var3);
                                    z12 = true;
                                    break;
                                case 6:
                                    d0Var3.setAnimations(g1Var.f1919d, g1Var.f1920e, g1Var.f1921f, g1Var.f1922g);
                                    x0Var.c(d0Var3);
                                    z12 = true;
                                    break;
                                case 7:
                                    d0Var3.setAnimations(g1Var.f1919d, g1Var.f1920e, g1Var.f1921f, g1Var.f1922g);
                                    x0Var.N(d0Var3, true);
                                    x0Var.g(d0Var3);
                                    z12 = true;
                                    break;
                                case 8:
                                    x0Var.P(null);
                                    z12 = true;
                                    break;
                                case 9:
                                    x0Var.P(d0Var3);
                                    z12 = true;
                                    break;
                                case 10:
                                    x0Var.O(d0Var3, g1Var.f1923h);
                                    z12 = true;
                                    break;
                            }
                        }
                    } else {
                        aVar.c(1);
                        int size2 = aVar.f1832a.size();
                        for (int i21 = 0; i21 < size2; i21++) {
                            g1 g1Var2 = (g1) aVar.f1832a.get(i21);
                            d0 d0Var4 = g1Var2.f1917b;
                            if (d0Var4 != null) {
                                d0Var4.mBeingSaved = false;
                                d0Var4.setPopDirection(false);
                                d0Var4.setNextTransition(aVar.f1837f);
                                d0Var4.setSharedElementNames(aVar.f1844m, aVar.f1845n);
                            }
                            int i22 = g1Var2.f1916a;
                            x0 x0Var2 = aVar.f1847p;
                            switch (i22) {
                                case 1:
                                    d0Var4.setAnimations(g1Var2.f1919d, g1Var2.f1920e, g1Var2.f1921f, g1Var2.f1922g);
                                    x0Var2.N(d0Var4, false);
                                    x0Var2.a(d0Var4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + g1Var2.f1916a);
                                case 3:
                                    d0Var4.setAnimations(g1Var2.f1919d, g1Var2.f1920e, g1Var2.f1921f, g1Var2.f1922g);
                                    x0Var2.I(d0Var4);
                                    break;
                                case 4:
                                    d0Var4.setAnimations(g1Var2.f1919d, g1Var2.f1920e, g1Var2.f1921f, g1Var2.f1922g);
                                    x0Var2.B(d0Var4);
                                    break;
                                case 5:
                                    d0Var4.setAnimations(g1Var2.f1919d, g1Var2.f1920e, g1Var2.f1921f, g1Var2.f1922g);
                                    x0Var2.N(d0Var4, false);
                                    R(d0Var4);
                                    break;
                                case 6:
                                    d0Var4.setAnimations(g1Var2.f1919d, g1Var2.f1920e, g1Var2.f1921f, g1Var2.f1922g);
                                    x0Var2.g(d0Var4);
                                    break;
                                case 7:
                                    d0Var4.setAnimations(g1Var2.f1919d, g1Var2.f1920e, g1Var2.f1921f, g1Var2.f1922g);
                                    x0Var2.N(d0Var4, false);
                                    x0Var2.c(d0Var4);
                                    break;
                                case 8:
                                    x0Var2.P(d0Var4);
                                    break;
                                case 9:
                                    x0Var2.P(null);
                                    break;
                                case 10:
                                    x0Var2.O(d0Var4, g1Var2.f1924i);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
                for (int i23 = i10; i23 < i11; i23++) {
                    a aVar2 = (a) arrayList.get(i23);
                    if (zBooleanValue) {
                        for (int size3 = aVar2.f1832a.size() - 1; size3 >= 0; size3--) {
                            d0 d0Var5 = ((g1) aVar2.f1832a.get(size3)).f1917b;
                            if (d0Var5 != null) {
                                f(d0Var5).j();
                            }
                        }
                    } else {
                        Iterator it2 = aVar2.f1832a.iterator();
                        while (it2.hasNext()) {
                            d0 d0Var6 = ((g1) it2.next()).f1917b;
                            if (d0Var6 != null) {
                                f(d0Var6).j();
                            }
                        }
                    }
                }
                E(this.f2066s, true);
                HashSet<t1> hashSet = new HashSet();
                for (int i24 = i10; i24 < i11; i24++) {
                    Iterator it3 = ((a) arrayList.get(i24)).f1832a.iterator();
                    while (it3.hasNext()) {
                        d0 d0Var7 = ((g1) it3.next()).f1917b;
                        if (d0Var7 != null && (viewGroup = d0Var7.mContainer) != null) {
                            hashSet.add(t1.f(viewGroup, A()));
                        }
                    }
                }
                for (t1 t1Var : hashSet) {
                    t1Var.f2036d = zBooleanValue;
                    t1Var.h();
                    t1Var.c();
                }
                for (int i25 = i10; i25 < i11; i25++) {
                    a aVar3 = (a) arrayList.get(i25);
                    if (((Boolean) arrayList2.get(i25)).booleanValue() && aVar3.f1849r >= 0) {
                        aVar3.f1849r = -1;
                    }
                    aVar3.getClass();
                }
                return;
            }
            a aVar4 = (a) arrayList.get(i13);
            if (((Boolean) arrayList2.get(i13)).booleanValue()) {
                f1Var2 = f1Var3;
                int i26 = 1;
                ArrayList arrayList5 = this.K;
                int size4 = aVar4.f1832a.size() - 1;
                while (size4 >= 0) {
                    g1 g1Var3 = (g1) aVar4.f1832a.get(size4);
                    int i27 = g1Var3.f1916a;
                    if (i27 != i26) {
                        if (i27 != 3) {
                            switch (i27) {
                                case 6:
                                    arrayList5.add(g1Var3.f1917b);
                                    break;
                                case 8:
                                    d0Var = null;
                                    break;
                                case 9:
                                    d0Var = g1Var3.f1917b;
                                    break;
                                case 10:
                                    g1Var3.f1924i = g1Var3.f1923h;
                                    break;
                            }
                        } else {
                            arrayList5.add(g1Var3.f1917b);
                        }
                        size4--;
                        i26 = 1;
                    }
                    arrayList5.remove(g1Var3.f1917b);
                    size4--;
                    i26 = 1;
                }
            } else {
                ArrayList arrayList6 = this.K;
                int i28 = 0;
                while (i28 < aVar4.f1832a.size()) {
                    g1 g1Var4 = (g1) aVar4.f1832a.get(i28);
                    int i29 = g1Var4.f1916a;
                    if (i29 != i14) {
                        if (i29 != 2) {
                            if (i29 == 3 || i29 == 6) {
                                arrayList6.remove(g1Var4.f1917b);
                                d0 d0Var8 = g1Var4.f1917b;
                                if (d0Var8 == d0Var) {
                                    aVar4.f1832a.add(i28, new g1(d0Var8, 9));
                                    i28++;
                                    f1Var3 = f1Var3;
                                    i12 = 1;
                                    d0Var = null;
                                }
                            } else if (i29 == 7) {
                                i12 = 1;
                            } else if (i29 == 8) {
                                aVar4.f1832a.add(i28, new g1(9, d0Var));
                                g1Var4.f1918c = true;
                                i28++;
                                d0Var = g1Var4.f1917b;
                            }
                            f1Var3 = f1Var3;
                            i12 = 1;
                        } else {
                            d0 d0Var9 = g1Var4.f1917b;
                            int i30 = d0Var9.mContainerId;
                            int size5 = arrayList6.size() - 1;
                            boolean z13 = false;
                            while (size5 >= 0) {
                                d0 d0Var10 = (d0) arrayList6.get(size5);
                                f1 f1Var5 = f1Var3;
                                if (d0Var10.mContainerId != i30) {
                                    i30 = i30;
                                } else if (d0Var10 == d0Var9) {
                                    i30 = i30;
                                    z13 = true;
                                } else {
                                    if (d0Var10 == d0Var) {
                                        aVar4.f1832a.add(i28, new g1(9, d0Var10));
                                        i28++;
                                        d0Var = null;
                                    }
                                    g1 g1Var5 = new g1(3, d0Var10);
                                    g1Var5.f1919d = g1Var4.f1919d;
                                    g1Var5.f1921f = g1Var4.f1921f;
                                    g1Var5.f1920e = g1Var4.f1920e;
                                    g1Var5.f1922g = g1Var4.f1922g;
                                    aVar4.f1832a.add(i28, g1Var5);
                                    arrayList6.remove(d0Var10);
                                    i28++;
                                }
                                size5--;
                                f1Var3 = f1Var5;
                                i30 = i30;
                            }
                            f1Var3 = f1Var3;
                            if (z13) {
                                aVar4.f1832a.remove(i28);
                                i28--;
                                i12 = 1;
                            } else {
                                i12 = 1;
                                g1Var4.f1916a = 1;
                                g1Var4.f1918c = true;
                                arrayList6.add(d0Var9);
                            }
                        }
                        i28 += i12;
                        i14 = i12;
                        f1Var3 = f1Var3;
                    } else {
                        i12 = i14;
                    }
                    arrayList6.add(g1Var4.f1917b);
                    i28 += i12;
                    i14 = i12;
                    f1Var3 = f1Var3;
                }
                f1Var2 = f1Var3;
            }
            z11 = z11 || aVar4.f1838g;
            i13++;
            f1Var3 = f1Var2;
        }
    }

    public final d0 v(int i10) {
        f1 f1Var = this.f2050c;
        ArrayList arrayList = f1Var.f1907a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d0 d0Var = (d0) arrayList.get(size);
            if (d0Var != null && d0Var.mFragmentId == i10) {
                return d0Var;
            }
        }
        for (e1 e1Var : f1Var.f1908b.values()) {
            if (e1Var != null) {
                d0 d0Var2 = e1Var.f1899c;
                if (d0Var2.mFragmentId == i10) {
                    return d0Var2;
                }
            }
        }
        return null;
    }

    public final d0 w(String str) {
        f1 f1Var = this.f2050c;
        ArrayList arrayList = f1Var.f1907a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d0 d0Var = (d0) arrayList.get(size);
            if (d0Var != null && str.equals(d0Var.mTag)) {
                return d0Var;
            }
        }
        for (e1 e1Var : f1Var.f1908b.values()) {
            if (e1Var != null) {
                d0 d0Var2 = e1Var.f1899c;
                if (str.equals(d0Var2.mTag)) {
                    return d0Var2;
                }
            }
        }
        return null;
    }

    public final void x() {
        for (t1 t1Var : e()) {
            if (t1Var.f2037e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                t1Var.f2037e = false;
                t1Var.c();
            }
        }
    }

    public final ViewGroup y(d0 d0Var) {
        ViewGroup viewGroup = d0Var.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (d0Var.mContainerId > 0 && this.f2068u.c()) {
            View viewB = this.f2068u.b(d0Var.mContainerId);
            if (viewB instanceof ViewGroup) {
                return (ViewGroup) viewB;
            }
        }
        return null;
    }

    public final s0 z() {
        d0 d0Var = this.f2069v;
        return d0Var != null ? d0Var.mFragmentManager.z() : this.f2071x;
    }
}
