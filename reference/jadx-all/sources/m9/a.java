package m9;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends p1 implements u8.e, d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u8.j f11900c;

    public a(u8.j jVar, boolean z10) {
        super(z10);
        S((f1) jVar.f(a0.f11902b));
        this.f11900c = jVar.O(this);
    }

    @Override // m9.p1
    public final String C() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // m9.p1
    public final void R(androidx.fragment.app.a0 a0Var) throws IllegalAccessException, InvocationTargetException {
        h6.g.n0(this.f11900c, a0Var);
    }

    @Override // m9.p1
    public String Z() {
        return super.Z();
    }

    @Override // m9.p1, m9.f1
    public boolean b() {
        return super.b();
    }

    @Override // m9.p1
    public final void c0(Object obj) {
        if (!(obj instanceof u)) {
            j0(obj);
            return;
        }
        u uVar = (u) obj;
        Throwable th = uVar.f12005a;
        uVar.getClass();
        i0(th, u.f12004b.get(uVar) != 0);
    }

    @Override // u8.e
    public final u8.j getContext() {
        return this.f11900c;
    }

    public void i0(Throwable th, boolean z10) {
    }

    public void j0(Object obj) {
    }

    public final void k0(int i10, a aVar, c9.e eVar) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            h6.g.v0(eVar, aVar, this);
            return;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                d7.a.m(eVar, "<this>");
                d7.t.b0(d7.t.M(aVar, this, eVar)).resumeWith(q8.l.f13235a);
                return;
            }
            if (i11 != 3) {
                throw new androidx.fragment.app.a0();
            }
            try {
                u8.j jVar = this.f11900c;
                Object objT = r9.a.t(jVar, null);
                try {
                    z6.a.f(2, eVar);
                    Object objInvoke = eVar.invoke(aVar, this);
                    r9.a.k(jVar, objT);
                    if (objInvoke != v8.a.f15963a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    r9.a.k(jVar, objT);
                    throw th;
                }
            } catch (Throwable th2) {
                resumeWith(d7.t.N(th2));
            }
        }
    }

    @Override // m9.d0
    public final u8.j q() {
        return this.f11900c;
    }

    @Override // u8.e
    public final void resumeWith(Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thA = q8.h.a(obj);
        if (thA != null) {
            obj = new u(thA, false);
        }
        Object objY = Y(obj);
        if (objY == e0.f11928e) {
            return;
        }
        v(objY);
    }
}
