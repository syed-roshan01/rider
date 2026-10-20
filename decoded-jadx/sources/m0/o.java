package m0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f11609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f11610e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f11611f = d7.t.g0(u0.e.f15008d, h2.f11553a);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f11612g;

    public o(q qVar, int i10, boolean z10, boolean z11, c0 c0Var) {
        this.f11612g = qVar;
        this.f11606a = i10;
        this.f11607b = z10;
        this.f11608c = z11;
    }

    @Override // m0.u
    public final void a(e0 e0Var, u0.b bVar) {
        this.f11612g.f11631b.a(e0Var, bVar);
    }

    @Override // m0.u
    public final void b() {
        this.f11612g.f11655z--;
    }

    @Override // m0.u
    public final boolean c() {
        return this.f11607b;
    }

    @Override // m0.u
    public final boolean d() {
        return this.f11608c;
    }

    @Override // m0.u
    public final r1 e() {
        return (r1) this.f11611f.getValue();
    }

    @Override // m0.u
    public final int f() {
        return this.f11606a;
    }

    @Override // m0.u
    public final u8.j g() {
        return this.f11612g.f11631b.g();
    }

    @Override // m0.u
    public final void h() {
    }

    @Override // m0.u
    public final void i(e0 e0Var) {
        q qVar = this.f11612g;
        qVar.f11631b.i(qVar.f11636g);
        qVar.f11631b.i(e0Var);
    }

    @Override // m0.u
    public final b1 j(c1 c1Var) {
        return this.f11612g.f11631b.j(c1Var);
    }

    @Override // m0.u
    public final void k(Set set) {
        HashSet hashSet = this.f11609d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f11609d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // m0.u
    public final void l(q qVar) {
        this.f11610e.add(qVar);
    }

    @Override // m0.u
    public final void m(e0 e0Var) {
        this.f11612g.f11631b.m(e0Var);
    }

    @Override // m0.u
    public final void n() {
        this.f11612g.f11655z++;
    }

    @Override // m0.u
    public final void o(q qVar) {
        HashSet hashSet = this.f11609d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(qVar.f11632c);
            }
        }
        z6.a.c(this.f11610e).remove(qVar);
    }

    @Override // m0.u
    public final void p(e0 e0Var) {
        this.f11612g.f11631b.p(e0Var);
    }

    public final void q() {
        LinkedHashSet<q> linkedHashSet = this.f11610e;
        if (!linkedHashSet.isEmpty()) {
            HashSet hashSet = this.f11609d;
            if (hashSet != null) {
                for (q qVar : linkedHashSet) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(qVar.f11632c);
                    }
                }
            }
            linkedHashSet.clear();
        }
    }
}
