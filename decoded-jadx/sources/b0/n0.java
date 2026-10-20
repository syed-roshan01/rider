package b0;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f2432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.a f2433c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(int i10, float f10, j0 j0Var) {
        super(0);
        this.f2431a = i10;
        this.f2432b = f10;
        this.f2433c = j0Var;
    }

    @Override // c9.a
    public final Object invoke() {
        return new k0(this.f2431a, this.f2432b, this.f2433c);
    }
}
