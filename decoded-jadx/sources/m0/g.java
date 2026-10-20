package m0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.a f11510a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f11512c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11511b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f11513d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f11514e = new ArrayList();

    public g(t.l0 l0Var) {
        this.f11510a = l0Var;
    }

    @Override // u8.j
    public final u8.j O(u8.j jVar) {
        d7.a.m(jVar, "context");
        return d7.a.A(this, jVar);
    }

    @Override // m0.a1
    public final Object T(c9.c cVar, u8.e eVar) {
        c9.a aVar;
        m9.l lVar = new m9.l(1, d7.t.b0(eVar));
        lVar.t();
        d9.u uVar = new d9.u();
        synchronized (this.f11511b) {
            Throwable th = this.f11512c;
            if (th != null) {
                lVar.resumeWith(d7.t.N(th));
            } else {
                uVar.f4952a = new f(cVar, lVar);
                boolean zIsEmpty = this.f11513d.isEmpty();
                List list = this.f11513d;
                Object obj = uVar.f4952a;
                if (obj == null) {
                    d7.a.D("awaiter");
                    throw null;
                }
                list.add((f) obj);
                lVar.v(new u.s(15, this, uVar));
                if (zIsEmpty && (aVar = this.f11510a) != null) {
                    try {
                        aVar.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.f11511b) {
                            try {
                                if (this.f11512c == null) {
                                    this.f11512c = th2;
                                    List list2 = this.f11513d;
                                    int size = list2.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        ((f) list2.get(i10)).f11495b.resumeWith(d7.t.N(th2));
                                    }
                                    this.f11513d.clear();
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        Object objS = lVar.s();
        v8.a aVar2 = v8.a.f15963a;
        return objS;
    }

    public final void c(long j10) {
        Object objN;
        synchronized (this.f11511b) {
            try {
                List list = this.f11513d;
                this.f11513d = this.f11514e;
                this.f11514e = list;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    f fVar = (f) list.get(i10);
                    fVar.getClass();
                    try {
                        objN = fVar.f11494a.invoke(Long.valueOf(j10));
                    } catch (Throwable th) {
                        objN = d7.t.N(th);
                    }
                    fVar.f11495b.resumeWith(objN);
                }
                list.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // u8.j
    public final Object e(Object obj, c9.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // u8.j
    public final u8.h f(u8.i iVar) {
        return z6.a.D(this, iVar);
    }

    @Override // u8.j
    public final u8.j u(u8.i iVar) {
        return z6.a.V(this, iVar);
    }
}
