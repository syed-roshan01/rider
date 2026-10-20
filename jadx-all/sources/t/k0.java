package t;

import m0.l3;
import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f14217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x1 f14219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.n1 f14220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l1 f14221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14222f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14223n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f14224o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p0 f14225p;

    public k0(p0 p0Var, Number number, Number number2, x1 x1Var, n nVar) {
        this.f14225p = p0Var;
        this.f14217a = number;
        this.f14218b = number2;
        this.f14219c = x1Var;
        this.f14220d = d7.t.g0(number, o3.f11621a);
        this.f14221e = new l1(nVar, x1Var, this.f14217a, this.f14218b, null);
    }

    @Override // m0.l3
    public final Object getValue() {
        return this.f14220d.getValue();
    }
}
