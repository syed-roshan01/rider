package j4;

import u1.o3;

/* JADX INFO: loaded from: classes.dex */
public final class k extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o3 f8355c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o3 o3Var, u8.e eVar) {
        super(eVar);
        this.f8355c = o3Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f8353a = obj;
        this.f8354b |= Integer.MIN_VALUE;
        return this.f8355c.emit(null, this);
    }
}
