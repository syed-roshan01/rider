package m4;

/* JADX INFO: loaded from: classes.dex */
public final class j extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f11843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11844c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, u8.e eVar) {
        super(eVar);
        this.f11843b = lVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f11842a = obj;
        this.f11844c |= Integer.MIN_VALUE;
        return this.f11843b.b(null, this);
    }
}
