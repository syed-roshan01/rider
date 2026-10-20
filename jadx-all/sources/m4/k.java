package m4;

/* JADX INFO: loaded from: classes.dex */
public final class k extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f11845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l4.m f11846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f11848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f11849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11850f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, u8.e eVar) {
        super(eVar);
        this.f11849e = lVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f11848d = obj;
        this.f11850f |= Integer.MIN_VALUE;
        return this.f11849e.a(this);
    }
}
