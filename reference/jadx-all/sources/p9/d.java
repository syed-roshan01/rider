package p9;

/* JADX INFO: loaded from: classes.dex */
public final class d extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.c0 f12880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12881c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(s.c0 c0Var, u8.e eVar) {
        super(eVar);
        this.f12880b = c0Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f12879a = obj;
        this.f12881c |= Integer.MIN_VALUE;
        return this.f12880b.emit(null, this);
    }
}
