package h0;

import f0.k1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x extends w8.h implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f7501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f7502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k1 f7503f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(l lVar, i iVar, k1 k1Var, u8.e eVar) {
        super(eVar);
        this.f7501d = lVar;
        this.f7502e = iVar;
        this.f7503f = k1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        x xVar = new x(this.f7501d, this.f7502e, this.f7503f, eVar);
        xVar.f7500c = obj;
        return xVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((o1.h0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081 A[RETURN] */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        o1.h0 h0Var;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f7499b;
        if (i10 != 0) {
            if (i10 == 1) {
                h0Var = (o1.h0) this.f7500c;
                d7.t.v0(obj);
            } else {
                if (i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d7.t.v0(obj);
            }
            return q8.l.f13235a;
        }
        d7.t.v0(obj);
        h0Var = (o1.h0) this.f7500c;
        this.f7500c = h0Var;
        this.f7499b = 1;
        obj = d9.i.h(h0Var, this);
        if (obj == aVar) {
            return aVar;
        }
        o1.k kVar = (o1.k) obj;
        if (d9.i.t(kVar) && (kVar.f12398b & 33) != 0) {
            List list = kVar.f12397a;
            int size = list.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    this.f7500c = null;
                    this.f7499b = 2;
                    if (d9.i.j(h0Var, this.f7501d, this.f7502e, kVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (!(!((o1.u) list.get(i11)).b())) {
                        break;
                    }
                    i11++;
                }
            }
            if (!d9.i.t(kVar)) {
                this.f7500c = null;
                this.f7499b = 3;
                if (d9.i.k(h0Var, this.f7503f, kVar, this) == aVar) {
                    return aVar;
                }
            }
        } else if (!d9.i.t(kVar)) {
            this.f7500c = null;
            this.f7499b = 3;
            if (d9.i.k(h0Var, this.f7503f, kVar, this) == aVar) {
                return aVar;
            }
        }
        return q8.l.f13235a;
    }
}
