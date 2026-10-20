package q9;

import m9.d0;
import m9.f1;
import m9.p1;
import t.y0;

/* JADX INFO: loaded from: classes.dex */
public final class m implements p9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9.u f13271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f13272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f13273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p9.g f13274d;

    public m(d9.u uVar, d0 d0Var, o oVar, p9.g gVar) {
        this.f13271a = uVar;
        this.f13272b = d0Var;
        this.f13273c = oVar;
        this.f13274d = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p9.g
    public final Object emit(Object obj, u8.e eVar) {
        l lVar;
        m mVar;
        if (eVar instanceof l) {
            lVar = (l) eVar;
            int i10 = lVar.f13270e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f13270e = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, eVar);
            }
        } else {
            lVar = new l(this, eVar);
        }
        Object obj2 = lVar.f13268c;
        v8.a aVar = v8.a.f15963a;
        int i11 = lVar.f13270e;
        if (i11 == 0) {
            d7.t.v0(obj2);
            f1 f1Var = (f1) this.f13271a.f4952a;
            if (f1Var != null) {
                f1Var.a(new y0(5));
                lVar.f13266a = this;
                lVar.f13267b = obj;
                lVar.getClass();
                lVar.f13270e = 1;
                if (((p1) f1Var).W(lVar) == aVar) {
                    return aVar;
                }
            }
            mVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = lVar.f13267b;
            mVar = lVar.f13266a;
            d7.t.v0(obj2);
        }
        mVar.f13271a.f4952a = z6.a.Q(mVar.f13272b, null, 4, new k(mVar.f13273c, mVar.f13274d, obj, null), 1);
        return q8.l.f13235a;
    }
}
