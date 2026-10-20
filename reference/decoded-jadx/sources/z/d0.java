package z;

import r1.a1;
import v.r1;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f17031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, int i10, int i11, u8.e eVar) {
        super(2, eVar);
        this.f17031a = g0Var;
        this.f17032b = i10;
        this.f17033c = i11;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new d0(this.f17031a, this.f17032b, this.f17033c, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        d0 d0Var = (d0) create((r1) obj, (u8.e) obj2);
        q8.l lVar = q8.l.f13235a;
        d0Var.invokeSuspend(lVar);
        return lVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        d7.t.v0(obj);
        g0 g0Var = this.f17031a;
        z zVar = g0Var.f17047c;
        zVar.a(this.f17032b, this.f17033c);
        zVar.f17183d = null;
        j jVar = g0Var.f17060p;
        jVar.f17077a.clear();
        jVar.f17078b = a0.d.f780b;
        jVar.getClass();
        a1 a1Var = g0Var.f17057m;
        if (a1Var != null) {
            ((androidx.compose.ui.node.a) a1Var).j();
        }
        return q8.l.f13235a;
    }
}
