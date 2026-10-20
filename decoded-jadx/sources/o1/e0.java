package o1;

import m9.x1;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x1 f12356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f12358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h0 h0Var, u8.e eVar) {
        super(eVar);
        this.f12358c = h0Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f12357b = obj;
        this.f12359d |= Integer.MIN_VALUE;
        return this.f12358c.h(0L, null, this);
    }
}
