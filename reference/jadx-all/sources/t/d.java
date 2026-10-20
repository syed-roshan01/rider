package t;

import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f14108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f14110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.n1 f14111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0.n1 f14112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f14113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f14114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b1 f14115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f14116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f14117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t f14118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public t f14119l;

    public d(Object obj, x1 x1Var, Object obj2) {
        this.f14108a = x1Var;
        this.f14109b = obj2;
        o oVar = new o(x1Var, obj, null, 60);
        this.f14110c = oVar;
        Boolean bool = Boolean.FALSE;
        o3 o3Var = o3.f11621a;
        this.f14111d = d7.t.g0(bool, o3Var);
        this.f14112e = d7.t.g0(obj, o3Var);
        this.f14115h = new b1();
        t tVar = oVar.f14265c;
        boolean z10 = tVar instanceof p;
        t tVar2 = z10 ? e.f14134e : tVar instanceof q ? e.f14135f : tVar instanceof r ? e.f14136g : e.f14137h;
        this.f14116i = tVar2;
        t tVar3 = z10 ? e.f14130a : tVar instanceof q ? e.f14131b : tVar instanceof r ? e.f14132c : e.f14133d;
        this.f14117j = tVar3;
        this.f14118k = tVar2;
        this.f14119l = tVar3;
    }

    public static final void a(d dVar) {
        o oVar = dVar.f14110c;
        oVar.f14265c.d();
        oVar.f14266d = Long.MIN_VALUE;
        dVar.f14111d.setValue(Boolean.FALSE);
    }

    public static Object b(d dVar, Object obj, n nVar, u8.e eVar) {
        Object objInvoke = dVar.f14108a.f14352b.invoke(dVar.f14110c.f14265c);
        Object objD = dVar.d();
        x1 x1Var = dVar.f14108a;
        return b1.a(dVar.f14115h, new b(dVar, objInvoke, new l1(nVar, x1Var, objD, obj, (t) x1Var.f14351a.invoke(objInvoke)), dVar.f14110c.f14266d, null, null), eVar);
    }

    public final Object c(Object obj) {
        if (d7.a.d(this.f14118k, this.f14116i) && d7.a.d(this.f14119l, this.f14117j)) {
            return obj;
        }
        x1 x1Var = this.f14108a;
        t tVar = (t) x1Var.f14351a.invoke(obj);
        int iB = tVar.b();
        boolean z10 = false;
        for (int i10 = 0; i10 < iB; i10++) {
            if (tVar.a(i10) < this.f14118k.a(i10) || tVar.a(i10) > this.f14119l.a(i10)) {
                tVar.e(i10, z6.a.q(tVar.a(i10), this.f14118k.a(i10), this.f14119l.a(i10)));
                z10 = true;
            }
        }
        return z10 ? x1Var.f14352b.invoke(tVar) : obj;
    }

    public final Object d() {
        return this.f14110c.f14264b.getValue();
    }

    public final Object e(Object obj, u8.e eVar) {
        Object objA = b1.a(this.f14115h, new c(this, obj, null), eVar);
        return objA == v8.a.f15963a ? objA : q8.l.f13235a;
    }

    public /* synthetic */ d(Object obj, x1 x1Var, Object obj2, int i10) {
        this(obj, x1Var, (i10 & 4) != 0 ? null : obj2);
    }
}
