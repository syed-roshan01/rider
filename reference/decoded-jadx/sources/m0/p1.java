package m0;

/* JADX INFO: loaded from: classes.dex */
public final class p1 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f11625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f11626b = new x0();

    public p1(a1 a1Var) {
        this.f11625a = a1Var;
    }

    @Override // u8.j
    public final u8.j O(u8.j jVar) {
        d7.a.m(jVar, "context");
        return d7.a.A(this, jVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // m0.a1
    public final Object T(c9.c cVar, u8.e eVar) {
        o1 o1Var;
        boolean z10;
        Object objS;
        p1 p1Var;
        if (eVar instanceof o1) {
            o1Var = (o1) eVar;
            int i10 = o1Var.f11617e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                o1Var.f11617e = i10 - Integer.MIN_VALUE;
            } else {
                o1Var = new o1(this, eVar);
            }
        } else {
            o1Var = new o1(this, eVar);
        }
        Object objT = o1Var.f11615c;
        v8.a aVar = v8.a.f15963a;
        int i11 = o1Var.f11617e;
        if (i11 != 0) {
            if (i11 == 1) {
                cVar = o1Var.f11614b;
                p1Var = o1Var.f11613a;
                d7.t.v0(objT);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d7.t.v0(objT);
            }
        }
        d7.t.v0(objT);
        x0 x0Var = this.f11626b;
        o1Var.f11613a = this;
        o1Var.f11614b = cVar;
        o1Var.f11617e = 1;
        synchronized (x0Var.f11749a) {
            z10 = x0Var.f11752d;
        }
        if (z10) {
            objS = q8.l.f13235a;
        } else {
            m9.l lVar = new m9.l(1, d7.t.b0(o1Var));
            lVar.t();
            synchronized (x0Var.f11749a) {
                x0Var.f11750b.add(lVar);
            }
            lVar.v(new u.s(16, x0Var, lVar));
            objS = lVar.s();
            if (objS != aVar) {
                objS = q8.l.f13235a;
            }
        }
        if (objS == aVar) {
            return aVar;
        }
        p1Var = this;
        a1 a1Var = p1Var.f11625a;
        o1Var.f11613a = null;
        o1Var.f11614b = null;
        o1Var.f11617e = 2;
        objT = a1Var.T(cVar, o1Var);
        return objT == aVar ? aVar : objT;
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
