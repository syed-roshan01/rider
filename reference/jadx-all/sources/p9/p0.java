package p9;

import m9.f1;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q0 f12934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f12935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0 f12936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f1 f12937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f12938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f12939f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q0 f12940n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12941o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, u8.e eVar) {
        super(eVar);
        this.f12940n = q0Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f12939f = obj;
        this.f12941o |= Integer.MIN_VALUE;
        return this.f12940n.collect(null, this);
    }
}
