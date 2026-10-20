package b0;

import u.s1;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0 f2369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s1 f2370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c9.e f2371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h0 f2373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2374f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, u8.e eVar) {
        super(eVar);
        this.f2373e = h0Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f2372d = obj;
        this.f2374f |= Integer.MIN_VALUE;
        return h0.r(this.f2373e, null, null, this);
    }
}
