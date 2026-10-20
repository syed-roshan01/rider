package n1;

import d7.t;
import m2.p;
import m9.d0;
import t.l0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s1.f f12106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c9.a f12107b = new l0(this, 21);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f12108c;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(long j10, long j11, u8.e eVar) {
        b bVar;
        long j12;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i10 = bVar.f12102c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f12102c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, eVar);
            }
        } else {
            bVar = new b(this, eVar);
        }
        b bVar2 = bVar;
        Object objL = bVar2.f12100a;
        v8.a aVar = v8.a.f15963a;
        int i11 = bVar2.f12102c;
        if (i11 == 0) {
            t.v0(objL);
            g gVarC = c();
            if (gVarC != null) {
                bVar2.f12102c = 1;
                objL = gVarC.L(j10, j11, bVar2);
                if (objL == aVar) {
                    return aVar;
                }
            } else {
                j12 = p.f11823b;
            }
            return new p(j12);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.v0(objL);
        j12 = ((p) objL).f11825a;
        return new p(j12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j10, u8.e eVar) {
        c cVar;
        long j11;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i10 = cVar.f12105c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f12105c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(this, eVar);
            }
        } else {
            cVar = new c(this, eVar);
        }
        Object objB = cVar.f12103a;
        v8.a aVar = v8.a.f15963a;
        int i11 = cVar.f12105c;
        if (i11 == 0) {
            t.v0(objB);
            g gVarC = c();
            if (gVarC != null) {
                cVar.f12105c = 1;
                objB = gVarC.B(j10, cVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                j11 = p.f11823b;
            }
            return new p(j11);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.v0(objB);
        j11 = ((p) objB).f11825a;
        return new p(j11);
    }

    public final g c() {
        s1.f fVar = this.f12106a;
        if (fVar != null) {
            return (g) fVar.g(i.f12124a);
        }
        return null;
    }
}
