package j4;

import a4.c0;
import d7.t;
import m9.d0;
import u1.z0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f8351b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, u8.e eVar) {
        super(2, eVar);
        this.f8351b = lVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new i(this.f8351b, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f8350a;
        if (i10 == 0) {
            t.v0(obj);
            final l lVar = this.f8351b;
            c0 c0VarT0 = t.t0(new z0(lVar, 8));
            g gVar = new g(lVar, null);
            int i11 = p9.o.f12932a;
            q9.o oVar = new q9.o(new p9.n(gVar, null), c0VarT0, u8.k.f15438a, -2, o9.a.f12668a);
            p9.g gVar2 = new p9.g() { // from class: j4.h
                @Override // p9.g
                public final Object emit(Object obj2, u8.e eVar) {
                    lVar.k((f) obj2);
                    v8.a aVar2 = v8.a.f15963a;
                    return q8.l.f13235a;
                }

                public final boolean equals(Object obj2) {
                    if ((obj2 instanceof p9.g) && (obj2 instanceof h)) {
                        return d7.a.d(new d9.a(lVar), new d9.a(lVar));
                    }
                    return false;
                }

                public final int hashCode() {
                    l lVar2 = lVar;
                    return ((((((((((l.class.hashCode() + ((lVar2 != null ? lVar2.hashCode() : 0) * 31)) * 31) - 584535736) * 31) + 1554688608) * 31) + 1237) * 31) + 2) * 31) + 2;
                }
            };
            this.f8350a = 1;
            if (oVar.collect(gVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.v0(obj);
        }
        return q8.l.f13235a;
    }
}
