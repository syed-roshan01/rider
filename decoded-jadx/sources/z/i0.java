package z;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17076b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i10, int i11) {
        super(0);
        this.f17075a = i10;
        this.f17076b = i11;
    }

    @Override // c9.a
    public final Object invoke() {
        return new g0(this.f17075a, this.f17076b);
    }
}
