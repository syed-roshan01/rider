package m0;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class g2 extends u {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p9.q0 f11517v = p9.d0.a(s0.b.f13898d);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final AtomicReference f11518w = new AtomicReference(Boolean.FALSE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f11519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m9.f1 f11521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f11522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f11523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f11524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o0.d f11525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f11526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f11527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f11528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f11529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f11530l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f11531m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Set f11532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m9.k f11533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public z1 f11534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f11535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p9.q0 f11536r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m9.i1 f11537s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u8.j f11538t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final k.f f11539u;

    public g2(u8.j jVar) {
        g gVar = new g(new t.l0(this, 16));
        this.f11519a = gVar;
        this.f11520b = new Object();
        this.f11523e = new ArrayList();
        this.f11525g = new o0.d();
        this.f11526h = new ArrayList();
        this.f11527i = new ArrayList();
        this.f11528j = new ArrayList();
        this.f11529k = new LinkedHashMap();
        this.f11530l = new LinkedHashMap();
        this.f11536r = p9.d0.a(a2.f11449c);
        m9.i1 i1Var = new m9.i1((m9.f1) jVar.f(m9.a0.f11902b));
        i1Var.U(false, true, new q.w(this, 24));
        this.f11537s = i1Var;
        this.f11538t = jVar.O(gVar).O(i1Var);
        this.f11539u = new k.f(this, 5);
    }

    public static /* synthetic */ void C(g2 g2Var, Exception exc, boolean z10, int i10) throws Exception {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        g2Var.B(exc, null, z10);
    }

    public static final e0 q(g2 g2Var, e0 e0Var, o0.d dVar) {
        x xVar = (x) e0Var;
        if (xVar.f11747y.E || xVar.f11748z) {
            return null;
        }
        Set set = g2Var.f11532n;
        if (set != null && set.contains(e0Var)) {
            return null;
        }
        w0.c cVarH = k0.y0.h(new q.w(e0Var, 25), new u.s(18, e0Var, dVar));
        try {
            w0.i iVarJ = cVarH.j();
            try {
                if (dVar.k()) {
                    u.r0 r0Var = new u.r0(8, dVar, e0Var);
                    q qVar = ((x) e0Var).f11747y;
                    if (!(!qVar.E)) {
                        s.g("Preparing a composition while composing is not supported".toString());
                        throw null;
                    }
                    qVar.E = true;
                    try {
                        r0Var.invoke();
                        qVar.E = false;
                    } catch (Throwable th) {
                        qVar.E = false;
                        throw th;
                    }
                }
                boolean zX = ((x) e0Var).x();
                w0.i.p(iVarJ);
                s(cVarH);
                if (!zX) {
                    e0Var = null;
                }
                return e0Var;
            } catch (Throwable th2) {
                w0.i.p(iVarJ);
                throw th2;
            }
        } catch (Throwable th3) {
            s(cVarH);
            throw th3;
        }
    }

    public static final boolean r(g2 g2Var) {
        List listX;
        boolean z10;
        synchronized (g2Var.f11520b) {
            if (g2Var.f11525g.isEmpty()) {
                z10 = (g2Var.f11526h.isEmpty() ^ true) || g2Var.v();
            } else {
                o0.d dVar = g2Var.f11525g;
                g2Var.f11525g = new o0.d();
                synchronized (g2Var.f11520b) {
                    listX = g2Var.x();
                }
                try {
                    int size = listX.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((x) ((e0) listX.get(i10))).y(dVar);
                        if (((a2) g2Var.f11536r.getValue()).compareTo(a2.f11448b) <= 0) {
                            break;
                        }
                    }
                    g2Var.f11525g = new o0.d();
                    synchronized (g2Var.f11520b) {
                        if (g2Var.u() != null) {
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                        }
                        z10 = (g2Var.f11526h.isEmpty() ^ true) || g2Var.v();
                    }
                } catch (Throwable th) {
                    synchronized (g2Var.f11520b) {
                        g2Var.f11525g.e(dVar);
                        throw th;
                    }
                }
            }
        }
        return z10;
    }

    public static void s(w0.c cVar) {
        try {
            if (cVar.v() instanceof w0.j) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
            cVar.c();
        } catch (Throwable th) {
            cVar.c();
            throw th;
        }
    }

    public static final void z(ArrayList arrayList, g2 g2Var, e0 e0Var) {
        arrayList.clear();
        synchronized (g2Var.f11520b) {
            Iterator it = g2Var.f11528j.iterator();
            while (it.hasNext()) {
                c1 c1Var = (c1) it.next();
                c1Var.getClass();
                if (d7.a.d(null, e0Var)) {
                    arrayList.add(c1Var);
                    it.remove();
                }
            }
        }
    }

    public final List A(List list, o0.d dVar) {
        ArrayList arrayList;
        Object obj;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = list.get(i10);
            ((c1) obj2).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj2);
        }
        for (Map.Entry entry : map.entrySet()) {
            e0 e0Var = (e0) entry.getKey();
            List list2 = (List) entry.getValue();
            s.l(!((x) e0Var).f11747y.E);
            w0.c cVarH = k0.y0.h(new q.w(e0Var, 25), new u.s(18, e0Var, dVar));
            try {
                w0.i iVarJ = cVarH.j();
                try {
                    synchronized (this.f11520b) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            c1 c1Var = (c1) list2.get(i11);
                            LinkedHashMap linkedHashMap = this.f11529k;
                            c1Var.getClass();
                            List list3 = (List) linkedHashMap.get(null);
                            if (list3 != null) {
                                if (list3.isEmpty()) {
                                    throw new NoSuchElementException("List is empty.");
                                }
                                Object objRemove = list3.remove(0);
                                if (list3.isEmpty()) {
                                    linkedHashMap.remove(null);
                                }
                                obj = objRemove;
                                w0.i.p(iVarJ);
                                throw th;
                            }
                            obj = null;
                            arrayList.add(new q8.f(c1Var, obj));
                        }
                    }
                    ((x) e0Var).s(arrayList);
                    w0.i.p(iVarJ);
                    s(cVarH);
                } catch (Throwable th) {
                    w0.i.p(iVarJ);
                    throw th;
                }
            } catch (Throwable th2) {
                s(cVarH);
                throw th2;
            }
        }
        return r8.p.W0(map.keySet());
    }

    public final void B(Exception exc, e0 e0Var, boolean z10) throws Exception {
        if (!((Boolean) f11518w.get()).booleanValue() || (exc instanceof k)) {
            synchronized (this.f11520b) {
                z1 z1Var = this.f11534p;
                if (z1Var != null) {
                    throw ((Exception) z1Var.f11771c);
                }
                this.f11534p = new z1(false, exc, 0);
            }
            throw exc;
        }
        synchronized (this.f11520b) {
            try {
                int i10 = b.f11457b;
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
                this.f11527i.clear();
                this.f11526h.clear();
                this.f11525g = new o0.d();
                this.f11528j.clear();
                this.f11529k.clear();
                this.f11530l.clear();
                this.f11534p = new z1(z10, exc, 0);
                if (e0Var != null) {
                    ArrayList arrayList = this.f11531m;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.f11531m = arrayList;
                    }
                    if (!arrayList.contains(e0Var)) {
                        arrayList.add(e0Var);
                    }
                    this.f11523e.remove(e0Var);
                    this.f11524f = null;
                }
                u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m0.u
    public final void a(e0 e0Var, u0.b bVar) throws Exception {
        boolean z10 = ((x) e0Var).f11747y.E;
        try {
            w0.c cVarH = k0.y0.h(new q.w(e0Var, 25), new u.s(18, e0Var, null));
            try {
                w0.i iVarJ = cVarH.j();
                try {
                    x xVar = (x) e0Var;
                    xVar.n(bVar);
                    w0.i.p(iVarJ);
                    s(cVarH);
                    if (!z10) {
                        w0.p.i().m();
                    }
                    synchronized (this.f11520b) {
                        if (((a2) this.f11536r.getValue()).compareTo(a2.f11448b) > 0 && !x().contains(e0Var)) {
                            this.f11523e.add(e0Var);
                            this.f11524f = null;
                        }
                    }
                    try {
                        y(e0Var);
                        try {
                            xVar.i();
                            xVar.k();
                            if (z10) {
                                return;
                            }
                            w0.p.i().m();
                        } catch (Exception e4) {
                            C(this, e4, false, 6);
                        }
                    } catch (Exception e10) {
                        B(e10, e0Var, true);
                    }
                } catch (Throwable th) {
                    w0.i.p(iVarJ);
                    throw th;
                }
            } catch (Throwable th2) {
                s(cVarH);
                throw th2;
            }
        } catch (Exception e11) {
            B(e11, e0Var, true);
        }
    }

    @Override // m0.u
    public final boolean c() {
        return false;
    }

    @Override // m0.u
    public final boolean d() {
        return false;
    }

    @Override // m0.u
    public final int f() {
        return 1000;
    }

    @Override // m0.u
    public final u8.j g() {
        return this.f11538t;
    }

    @Override // m0.u
    public final void i(e0 e0Var) {
        m9.k kVarU;
        synchronized (this.f11520b) {
            if (this.f11526h.contains(e0Var)) {
                kVarU = null;
            } else {
                this.f11526h.add(e0Var);
                kVarU = u();
            }
        }
        if (kVarU != null) {
            kVarU.resumeWith(q8.l.f13235a);
        }
    }

    @Override // m0.u
    public final b1 j(c1 c1Var) {
        b1 b1Var;
        synchronized (this.f11520b) {
            b1Var = (b1) this.f11530l.remove(c1Var);
        }
        return b1Var;
    }

    @Override // m0.u
    public final void k(Set set) {
    }

    @Override // m0.u
    public final void m(e0 e0Var) {
        synchronized (this.f11520b) {
            try {
                Set linkedHashSet = this.f11532n;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f11532n = linkedHashSet;
                }
                linkedHashSet.add(e0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m0.u
    public final void p(e0 e0Var) {
        synchronized (this.f11520b) {
            this.f11523e.remove(e0Var);
            this.f11524f = null;
            this.f11526h.remove(e0Var);
            this.f11527i.remove(e0Var);
        }
    }

    public final void t() {
        synchronized (this.f11520b) {
            if (((a2) this.f11536r.getValue()).compareTo(a2.f11451e) >= 0) {
                this.f11536r.i(a2.f11448b);
            }
        }
        this.f11537s.a(null);
    }

    public final m9.k u() {
        p9.q0 q0Var = this.f11536r;
        int iCompareTo = ((a2) q0Var.getValue()).compareTo(a2.f11448b);
        ArrayList arrayList = this.f11528j;
        ArrayList arrayList2 = this.f11527i;
        ArrayList arrayList3 = this.f11526h;
        if (iCompareTo <= 0) {
            this.f11523e.clear();
            this.f11524f = r8.r.f13661a;
            this.f11525g = new o0.d();
            arrayList3.clear();
            arrayList2.clear();
            arrayList.clear();
            this.f11531m = null;
            m9.k kVar = this.f11533o;
            if (kVar != null) {
                kVar.l(null);
            }
            this.f11533o = null;
            this.f11534p = null;
            return null;
        }
        z1 z1Var = this.f11534p;
        a2 a2Var = a2.f11452f;
        a2 a2Var2 = a2.f11449c;
        if (z1Var == null) {
            if (this.f11521c == null) {
                this.f11525g = new o0.d();
                arrayList3.clear();
                if (v()) {
                    a2Var2 = a2.f11450d;
                }
            } else {
                a2Var2 = ((arrayList3.isEmpty() ^ true) || this.f11525g.k() || (arrayList2.isEmpty() ^ true) || (arrayList.isEmpty() ^ true) || v()) ? a2Var : a2.f11451e;
            }
        }
        q0Var.i(a2Var2);
        if (a2Var2 != a2Var) {
            return null;
        }
        m9.k kVar2 = this.f11533o;
        this.f11533o = null;
        return kVar2;
    }

    public final boolean v() {
        boolean z10;
        if (!this.f11535q) {
            g gVar = this.f11519a;
            synchronized (gVar.f11511b) {
                z10 = !gVar.f11513d.isEmpty();
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean w() {
        boolean z10;
        synchronized (this.f11520b) {
            z10 = true;
            if (!this.f11525g.k() && !(!this.f11526h.isEmpty()) && !v()) {
                z10 = false;
            }
        }
        return z10;
    }

    public final List x() {
        List arrayList = this.f11524f;
        if (arrayList == null) {
            ArrayList arrayList2 = this.f11523e;
            arrayList = arrayList2.isEmpty() ? r8.r.f13661a : new ArrayList(arrayList2);
            this.f11524f = arrayList;
        }
        return arrayList;
    }

    public final void y(e0 e0Var) {
        synchronized (this.f11520b) {
            ArrayList arrayList = this.f11528j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((c1) arrayList.get(i10)).getClass();
                if (d7.a.d(null, e0Var)) {
                    ArrayList arrayList2 = new ArrayList();
                    z(arrayList2, this, e0Var);
                    while (!arrayList2.isEmpty()) {
                        A(arrayList2, null);
                        z(arrayList2, this, e0Var);
                    }
                    return;
                }
            }
        }
    }
}
