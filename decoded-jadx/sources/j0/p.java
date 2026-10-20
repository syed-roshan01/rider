package j0;

import m0.n1;
import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d1.c f8291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f8294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Float f8295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d1.c f8296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t.d f8297g = t.e.a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t.d f8298h = t.e.a(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t.d f8299i = t.e.a(0.0f);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m9.s f8300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n1 f8301k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n1 f8302l;

    public p(d1.c cVar, float f10, boolean z10) {
        this.f8291a = cVar;
        this.f8292b = f10;
        this.f8293c = z10;
        m9.s sVar = new m9.s(true);
        sVar.S(null);
        this.f8300j = sVar;
        Boolean bool = Boolean.FALSE;
        o3 o3Var = o3.f11621a;
        this.f8301k = d7.t.g0(bool, o3Var);
        this.f8302l = d7.t.g0(bool, o3Var);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(u8.e eVar) {
        i iVar;
        p pVar;
        Object objQ;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i10 = iVar.f8278d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f8278d = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, eVar);
            }
        } else {
            iVar = new i(this, eVar);
        }
        Object obj = iVar.f8276b;
        v8.a aVar = v8.a.f15963a;
        int i11 = iVar.f8278d;
        q8.l lVar = q8.l.f13235a;
        if (i11 != 0) {
            if (i11 == 1) {
                pVar = iVar.f8275a;
                d7.t.v0(obj);
            } else if (i11 == 2) {
                pVar = iVar.f8275a;
                d7.t.v0(obj);
                iVar.f8275a = null;
                iVar.f8278d = 3;
                pVar.getClass();
                objQ = d7.a.q(new o(pVar, null), iVar);
                if (objQ != aVar) {
                    objQ = lVar;
                }
                if (objQ == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d7.t.v0(obj);
            }
            return lVar;
        }
        d7.t.v0(obj);
        iVar.f8275a = this;
        iVar.f8278d = 1;
        Object objQ2 = d7.a.q(new m(this, null), iVar);
        if (objQ2 != aVar) {
            objQ2 = lVar;
        }
        if (objQ2 == aVar) {
            return aVar;
        }
        pVar = this;
        pVar.f8301k.setValue(Boolean.TRUE);
        iVar.f8275a = pVar;
        iVar.f8278d = 2;
        if (pVar.f8300j.y(iVar) == aVar) {
            return aVar;
        }
        iVar.f8275a = null;
        iVar.f8278d = 3;
        pVar.getClass();
        objQ = d7.a.q(new o(pVar, null), iVar);
        if (objQ != aVar) {
            objQ = lVar;
        }
        if (objQ == aVar) {
            return aVar;
        }
        return lVar;
    }
}
