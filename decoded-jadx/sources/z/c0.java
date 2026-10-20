package z;

import u.s1;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0 f17022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s1 f17023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c9.e f17024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f17025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f17026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17027f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g0 g0Var, u8.e eVar) {
        super(eVar);
        this.f17026e = g0Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f17025d = obj;
        this.f17027f |= Integer.MIN_VALUE;
        return this.f17026e.c(null, null, this);
    }
}
