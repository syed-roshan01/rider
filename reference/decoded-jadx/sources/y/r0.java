package y;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f16673b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(int i10, float f10) {
        super(1);
        this.f16672a = i10;
        this.f16673b = f10;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        int i10 = this.f16672a;
        switch (i10) {
            case 0:
                a7.a.w(obj);
                switch (i10) {
                    case 0:
                        throw null;
                    default:
                        throw null;
                }
            default:
                return new m2.i(i1.b.c(d7.t.p0(this.f16673b), 0));
        }
    }
}
