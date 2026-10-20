package k4;

/* JADX INFO: loaded from: classes.dex */
public final class d extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u9.f f9746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f9748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9749e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, u8.e eVar2) {
        super(eVar2);
        this.f9748d = eVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f9747c = obj;
        this.f9749e |= Integer.MIN_VALUE;
        return this.f9748d.a(this);
    }
}
