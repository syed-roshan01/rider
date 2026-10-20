package n1;

import d7.t;
import m2.p;
import m9.d0;
import s1.j;
import t.l0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
public final class g extends n implements s1.f, a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f12120u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d f12121v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j f12122w;

    public g(a aVar, d dVar) {
        this.f12120u = aVar;
        this.f12121v = dVar == null ? new d() : dVar;
        j jVar = new j(i.f12124a);
        jVar.A.setValue(this);
        this.f12122w = jVar;
    }

    @Override // y0.n
    public final void A0() {
        d dVar = this.f12121v;
        if (dVar.f12106a == this) {
            dVar.f12106a = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // n1.a
    public final Object B(long j10, u8.e eVar) {
        f fVar;
        long j11;
        g gVar;
        long j12;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i10 = fVar.f12119e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f12119e = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, eVar);
            }
        } else {
            fVar = new f(this, eVar);
        }
        Object objB = fVar.f12117c;
        v8.a aVar = v8.a.f15963a;
        int i11 = fVar.f12119e;
        if (i11 != 0) {
            if (i11 == 1) {
                j10 = fVar.f12116b;
                gVar = fVar.f12115a;
                t.v0(objB);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j12 = fVar.f12116b;
                t.v0(objB);
            }
            return new p(p.e(j12, ((p) objB).f11825a));
        }
        t.v0(objB);
        a aVarH0 = H0();
        if (aVarH0 != null) {
            fVar.f12115a = this;
            fVar.f12116b = j10;
            fVar.f12119e = 1;
            objB = aVarH0.B(j10, fVar);
            if (objB == aVar) {
                return aVar;
            }
            gVar = this;
        } else {
            j11 = p.f11823b;
            gVar = this;
        }
        long j13 = j10;
        j12 = j11;
        a aVar2 = gVar.f12120u;
        long jD = p.d(j13, j12);
        fVar.f12115a = null;
        fVar.f12116b = j12;
        fVar.f12119e = 2;
        objB = aVar2.B(jD, fVar);
        if (objB == aVar) {
            return aVar;
        }
        return new p(p.e(j12, ((p) objB).f11825a));
        j11 = ((p) objB).f11825a;
        long j14 = j10;
        j12 = j11;
        a aVar3 = gVar.f12120u;
        long jD2 = p.d(j14, j12);
        fVar.f12115a = null;
        fVar.f12116b = j12;
        fVar.f12119e = 2;
        objB = aVar3.B(jD2, fVar);
        if (objB == aVar) {
            return aVar;
        }
        return new p(p.e(j12, ((p) objB).f11825a));
    }

    public final d0 G0() {
        g gVar = this.f16742t ? (g) g(i.f12124a) : null;
        if (gVar != null) {
            return gVar.G0();
        }
        d0 d0Var = this.f12121v.f12108c;
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final a H0() {
        if (this.f16742t) {
            return (a) g(i.f12124a);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // n1.a
    public final Object L(long j10, long j11, u8.e eVar) {
        e eVar2;
        long j12;
        long j13;
        g gVar;
        long j14;
        long j15;
        long j16;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i10 = eVar2.f12114f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar2.f12114f = i10 - Integer.MIN_VALUE;
            } else {
                eVar2 = new e(this, eVar);
            }
        } else {
            eVar2 = new e(this, eVar);
        }
        Object objL = eVar2.f12112d;
        v8.a aVar = v8.a.f15963a;
        int i11 = eVar2.f12114f;
        if (i11 != 0) {
            if (i11 == 1) {
                long j17 = eVar2.f12111c;
                long j18 = eVar2.f12110b;
                gVar = eVar2.f12109a;
                t.v0(objL);
                j13 = j17;
                j12 = j18;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j16 = eVar2.f12110b;
                t.v0(objL);
            }
            j15 = ((p) objL).f11825a;
            j14 = j16;
            return new p(p.e(j14, j15));
        }
        t.v0(objL);
        a aVar2 = this.f12120u;
        eVar2.f12109a = this;
        j12 = j10;
        eVar2.f12110b = j12;
        j13 = j11;
        eVar2.f12111c = j13;
        eVar2.f12114f = 1;
        objL = aVar2.L(j10, j11, eVar2);
        if (objL == aVar) {
            return aVar;
        }
        gVar = this;
        long j19 = ((p) objL).f11825a;
        a aVarH0 = gVar.H0();
        if (aVarH0 != null) {
            long jE = p.e(j12, j19);
            long jD = p.d(j13, j19);
            eVar2.f12109a = null;
            eVar2.f12110b = j19;
            eVar2.f12114f = 2;
            objL = aVarH0.L(jE, jD, eVar2);
            if (objL == aVar) {
                return aVar;
            }
            j16 = j19;
            j15 = ((p) objL).f11825a;
            j14 = j16;
        } else {
            j14 = j19;
            j15 = p.f11823b;
        }
        return new p(p.e(j14, j15));
    }

    @Override // n1.a
    public final long V(long j10, long j11, int i10) {
        long jV;
        long jV2 = this.f12120u.V(j10, j11, i10);
        a aVarH0 = H0();
        if (aVarH0 != null) {
            jV = aVarH0.V(d1.c.g(j10, jV2), d1.c.f(j11, jV2), i10);
        } else {
            int i11 = d1.c.f4329e;
            jV = d1.c.f4326b;
        }
        return d1.c.g(jV2, jV);
    }

    @Override // n1.a
    public final long g0(int i10, long j10) {
        long jG0;
        a aVarH0 = H0();
        if (aVarH0 != null) {
            jG0 = aVarH0.g0(i10, j10);
        } else {
            int i11 = d1.c.f4329e;
            jG0 = d1.c.f4326b;
        }
        return d1.c.g(jG0, this.f12120u.g0(i10, d1.c.f(j10, jG0)));
    }

    @Override // s1.f
    public final f6.a j() {
        return this.f12122w;
    }

    @Override // y0.n
    public final void z0() {
        d dVar = this.f12121v;
        dVar.f12106a = this;
        dVar.f12107b = new l0(this, 22);
        dVar.f12108c = v0();
    }
}
