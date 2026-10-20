package p9;

import m9.f1;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c0 f12862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f12863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e0 f12864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f1 f12865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f12866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0 f12867f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12868n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, u8.e eVar) {
        super(eVar);
        this.f12867f = c0Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f12866e = obj;
        this.f12868n |= Integer.MIN_VALUE;
        return c0.k(this.f12867f, null, this);
    }
}
