package u0;

import a0.g0;
import c9.h;
import d7.t;
import d9.j;
import java.util.ArrayList;
import k0.k2;
import m0.m;
import m0.q;
import m0.w1;
import m0.x1;
import u.x;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f15003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x1 f15004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f15005e;

    public b(int i10, j jVar, boolean z10) {
        this.f15001a = i10;
        this.f15002b = z10;
        this.f15003c = jVar;
    }

    public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, m mVar, int i10) {
        q qVar = (q) mVar;
        qVar.a0(this.f15001a);
        f(qVar);
        int iG = qVar.g(this) ? t.G(2, 5) : t.G(1, 5);
        Object obj6 = this.f15003c;
        d7.a.k(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        z6.a.f(7, obj6);
        Object objC = ((h) obj6).c(obj, obj2, obj3, obj4, obj5, qVar, Integer.valueOf(i10 | iG));
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new k2(this, obj, obj2, obj3, obj4, obj5, i10);
        }
        return objC;
    }

    public final Object b(Object obj, Object obj2, m mVar, int i10) {
        q qVar = (q) mVar;
        qVar.a0(this.f15001a);
        f(qVar);
        int iG = qVar.g(this) ? t.G(2, 2) : t.G(1, 2);
        Object obj3 = this.f15003c;
        d7.a.k(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        z6.a.f(4, obj3);
        Object objG = ((c9.g) obj3).g(obj, obj2, qVar, Integer.valueOf(iG | i10));
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new g0(i10, 4, this, obj, obj2);
        }
        return objG;
    }

    @Override // c9.h
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Integer num) {
        return a(obj, obj2, obj3, obj4, obj5, (m) obj6, num.intValue());
    }

    public final Object d(Object obj, m mVar, int i10) {
        q qVar = (q) mVar;
        qVar.a0(this.f15001a);
        f(qVar);
        int iG = qVar.g(this) ? t.G(2, 1) : t.G(1, 1);
        Object obj2 = this.f15003c;
        d7.a.k(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        z6.a.f(3, obj2);
        Object objE = ((c9.f) obj2).e(obj, qVar, Integer.valueOf(iG | i10));
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new x(this, obj, i10, 6);
        }
        return objE;
    }

    @Override // c9.f
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
        return d(obj, (m) obj2, ((Number) obj3).intValue());
    }

    public final void f(m mVar) {
        q qVar;
        x1 x1VarD;
        if (!this.f15002b || (x1VarD = (qVar = (q) mVar).D()) == null) {
            return;
        }
        qVar.getClass();
        x1VarD.f11753a |= 1;
        if (t.n0(this.f15004d, x1VarD)) {
            this.f15004d = x1VarD;
            return;
        }
        ArrayList arrayList = this.f15005e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f15005e = arrayList2;
            arrayList2.add(x1VarD);
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (t.n0((w1) arrayList.get(i10), x1VarD)) {
                arrayList.set(i10, x1VarD);
                return;
            }
        }
        arrayList.add(x1VarD);
    }

    @Override // c9.g
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        return b(obj, obj2, (m) obj3, ((Number) obj4).intValue());
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        q qVar = (q) ((m) obj);
        qVar.a0(this.f15001a);
        f(qVar);
        int iG = iIntValue | (qVar.g(this) ? t.G(2, 0) : t.G(1, 0));
        Object obj3 = this.f15003c;
        d7.a.k(obj3, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        z6.a.f(2, obj3);
        Object objInvoke = ((c9.e) obj3).invoke(qVar, Integer.valueOf(iG));
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            z6.a.f(2, this);
            x1VarX.f11756d = this;
        }
        return objInvoke;
    }
}
