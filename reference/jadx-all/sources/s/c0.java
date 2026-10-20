package s;

import m0.l3;
import m0.t1;
import t.u1;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements p9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13762d;

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, int i10) {
        this.f13759a = i10;
        this.f13760b = obj;
        this.f13761c = obj2;
        this.f13762d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    @Override // p9.g
    public final Object emit(Object obj, u8.e eVar) {
        boolean zBooleanValue;
        p9.d dVar;
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f13759a;
        Object obj2 = this.f13761c;
        Object obj3 = this.f13762d;
        Object obj4 = this.f13760b;
        switch (i10) {
            case 0:
                t1 t1Var = (t1) obj4;
                if (((Boolean) obj).booleanValue()) {
                    u1 u1Var = (u1) obj2;
                    zBooleanValue = ((Boolean) ((c9.e) ((l3) obj3).getValue()).invoke(u1Var.b(), u1Var.f14321c.getValue())).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                t1Var.setValue(Boolean.valueOf(zBooleanValue));
                return lVar;
            case 1:
                if (eVar instanceof p9.d) {
                    dVar = (p9.d) eVar;
                    int i11 = dVar.f12881c;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        dVar.f12881c = i11 - Integer.MIN_VALUE;
                    } else {
                        dVar = new p9.d(this, eVar);
                    }
                } else {
                    dVar = new p9.d(this, eVar);
                }
                Object obj5 = dVar.f12879a;
                v8.a aVar = v8.a.f15963a;
                int i12 = dVar.f12881c;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d7.t.v0(obj5);
                    return lVar;
                }
                d7.t.v0(obj5);
                p9.e eVar2 = (p9.e) obj4;
                Object objInvoke = eVar2.f12886b.invoke(obj);
                d9.u uVar = (d9.u) obj2;
                Object obj6 = uVar.f4952a;
                if (obj6 != q9.c.f13247b && ((Boolean) eVar2.f12887c.invoke(obj6, objInvoke)).booleanValue()) {
                    return lVar;
                }
                uVar.f4952a = objInvoke;
                dVar.f12881c = 1;
                return ((p9.g) obj3).emit(obj, dVar) == aVar ? aVar : lVar;
            default:
                Object objV0 = z6.a.v0((u8.j) obj4, obj, obj2, (c9.e) obj3, eVar);
                return objV0 == v8.a.f15963a ? objV0 : lVar;
        }
    }

    public c0(p9.g gVar, u8.j jVar) {
        this.f13759a = 2;
        this.f13760b = jVar;
        this.f13761c = r9.a.s(jVar);
        this.f13762d = new q9.a0(gVar, null);
    }
}
