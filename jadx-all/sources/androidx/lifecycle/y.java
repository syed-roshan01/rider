package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n.a f2197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f2198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f2199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f2203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p9.q0 f2204i;

    public y(w wVar) {
        d7.a.m(wVar, "provider");
        this.f2196a = true;
        this.f2197b = new n.a();
        q qVar = q.f2170b;
        this.f2198c = qVar;
        this.f2203h = new ArrayList();
        this.f2199d = new WeakReference(wVar);
        this.f2204i = p9.d0.a(qVar);
    }

    @Override // androidx.lifecycle.r
    public final void a(v vVar) {
        u iVar;
        w wVar;
        d7.a.m(vVar, "observer");
        e("addObserver");
        q qVar = this.f2198c;
        q qVar2 = q.f2169a;
        if (qVar != qVar2) {
            qVar2 = q.f2170b;
        }
        x xVar = new x();
        HashMap map = z.f2210a;
        boolean z10 = vVar instanceof u;
        boolean z11 = vVar instanceof g;
        if (z10 && z11) {
            iVar = new i((g) vVar, (u) vVar);
        } else if (z11) {
            iVar = new i((g) vVar, (u) null);
        } else if (z10) {
            iVar = (u) vVar;
        } else {
            Class<?> cls = vVar.getClass();
            if (z.b(cls) == 2) {
                Object obj = z.f2211b.get(cls);
                d7.a.j(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    z.a((Constructor) list.get(0), vVar);
                    throw null;
                }
                int size = list.size();
                k[] kVarArr = new k[size];
                if (size > 0) {
                    z.a((Constructor) list.get(0), vVar);
                    throw null;
                }
                iVar = new f(kVarArr);
            } else {
                iVar = new i(vVar);
            }
        }
        xVar.f2195b = iVar;
        xVar.f2194a = qVar2;
        if (((x) this.f2197b.i(vVar, xVar)) == null && (wVar = (w) this.f2199d.get()) != null) {
            boolean z12 = this.f2200e != 0 || this.f2201f;
            q qVarD = d(vVar);
            this.f2200e++;
            while (xVar.f2194a.compareTo(qVarD) < 0 && this.f2197b.f12027e.containsKey(vVar)) {
                this.f2203h.add(xVar.f2194a);
                n nVar = p.Companion;
                q qVar3 = xVar.f2194a;
                nVar.getClass();
                p pVarB = n.b(qVar3);
                if (pVarB == null) {
                    throw new IllegalStateException("no event up from " + xVar.f2194a);
                }
                xVar.a(wVar, pVarB);
                ArrayList arrayList = this.f2203h;
                arrayList.remove(arrayList.size() - 1);
                qVarD = d(vVar);
            }
            if (!z12) {
                i();
            }
            this.f2200e--;
        }
    }

    @Override // androidx.lifecycle.r
    public final q b() {
        return this.f2198c;
    }

    @Override // androidx.lifecycle.r
    public final void c(v vVar) {
        d7.a.m(vVar, "observer");
        e("removeObserver");
        this.f2197b.g(vVar);
    }

    public final q d(v vVar) {
        x xVar;
        HashMap map = this.f2197b.f12027e;
        n.c cVar = map.containsKey(vVar) ? ((n.c) map.get(vVar)).f12032d : null;
        q qVar = (cVar == null || (xVar = (x) cVar.f12030b) == null) ? null : xVar.f2194a;
        ArrayList arrayList = this.f2203h;
        q qVar2 = arrayList.isEmpty() ^ true ? (q) a7.a.k(arrayList, 1) : null;
        q qVar3 = this.f2198c;
        d7.a.m(qVar3, "state1");
        if (qVar == null || qVar.compareTo(qVar3) >= 0) {
            qVar = qVar3;
        }
        return (qVar2 == null || qVar2.compareTo(qVar) >= 0) ? qVar : qVar2;
    }

    public final void e(String str) {
        if (this.f2196a) {
            m.b.o0().f11435x.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(l.q.k("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void f(p pVar) {
        d7.a.m(pVar, "event");
        e("handleLifecycleEvent");
        g(pVar.a());
    }

    public final void g(q qVar) {
        q qVar2 = this.f2198c;
        if (qVar2 == qVar) {
            return;
        }
        q qVar3 = q.f2170b;
        q qVar4 = q.f2169a;
        if (qVar2 == qVar3 && qVar == qVar4) {
            throw new IllegalStateException(("no event down from " + this.f2198c + " in component " + this.f2199d.get()).toString());
        }
        this.f2198c = qVar;
        if (this.f2201f || this.f2200e != 0) {
            this.f2202g = true;
            return;
        }
        this.f2201f = true;
        i();
        this.f2201f = false;
        if (this.f2198c == qVar4) {
            this.f2197b = new n.a();
        }
    }

    public final void h() {
        q qVar = q.f2171c;
        e("setCurrentState");
        g(qVar);
    }

    public final void i() {
        w wVar = (w) this.f2199d.get();
        if (wVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            n.a aVar = this.f2197b;
            if (aVar.f12041d != 0) {
                n.c cVar = aVar.f12038a;
                d7.a.j(cVar);
                q qVar = ((x) cVar.f12030b).f2194a;
                n.c cVar2 = this.f2197b.f12039b;
                d7.a.j(cVar2);
                q qVar2 = ((x) cVar2.f12030b).f2194a;
                if (qVar == qVar2 && this.f2198c == qVar2) {
                    break;
                }
                this.f2202g = false;
                q qVar3 = this.f2198c;
                n.c cVar3 = this.f2197b.f12038a;
                d7.a.j(cVar3);
                if (qVar3.compareTo(((x) cVar3.f12030b).f2194a) < 0) {
                    n.a aVar2 = this.f2197b;
                    n.b bVar = new n.b(aVar2.f12039b, aVar2.f12038a, 1);
                    aVar2.f12040c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f2202g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        d7.a.l(entry, "next()");
                        v vVar = (v) entry.getKey();
                        x xVar = (x) entry.getValue();
                        while (xVar.f2194a.compareTo(this.f2198c) > 0 && !this.f2202g && this.f2197b.f12027e.containsKey(vVar)) {
                            n nVar = p.Companion;
                            q qVar4 = xVar.f2194a;
                            nVar.getClass();
                            p pVarA = n.a(qVar4);
                            if (pVarA == null) {
                                throw new IllegalStateException("no event down from " + xVar.f2194a);
                            }
                            this.f2203h.add(pVarA.a());
                            xVar.a(wVar, pVarA);
                            ArrayList arrayList = this.f2203h;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                n.c cVar4 = this.f2197b.f12039b;
                if (!this.f2202g && cVar4 != null && this.f2198c.compareTo(((x) cVar4.f12030b).f2194a) > 0) {
                    n.a aVar3 = this.f2197b;
                    aVar3.getClass();
                    n.d dVar = new n.d(aVar3);
                    aVar3.f12040c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f2202g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        v vVar2 = (v) entry2.getKey();
                        x xVar2 = (x) entry2.getValue();
                        while (xVar2.f2194a.compareTo(this.f2198c) < 0 && !this.f2202g && this.f2197b.f12027e.containsKey(vVar2)) {
                            this.f2203h.add(xVar2.f2194a);
                            n nVar2 = p.Companion;
                            q qVar5 = xVar2.f2194a;
                            nVar2.getClass();
                            p pVarB = n.b(qVar5);
                            if (pVarB == null) {
                                throw new IllegalStateException("no event up from " + xVar2.f2194a);
                            }
                            xVar2.a(wVar, pVarB);
                            ArrayList arrayList2 = this.f2203h;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f2202g = false;
        this.f2204i.i(this.f2198c);
    }
}
