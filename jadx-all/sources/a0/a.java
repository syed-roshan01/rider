package a0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u8.e f771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f774d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, u8.e eVar) {
        super(eVar);
        this.f773c = bVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f772b = obj;
        this.f774d |= Integer.MIN_VALUE;
        return this.f773c.l(this);
    }
}
