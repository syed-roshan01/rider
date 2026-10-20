package v;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f15743b = new q0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15744a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i10) {
        super(1);
        this.f15744a = i10;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        int i10 = this.f15744a;
        switch (i10) {
            case 0:
                o1.u uVar = (o1.u) obj;
                switch (i10) {
                    case 0:
                        return Boolean.TRUE;
                    default:
                        return Boolean.valueOf(!o1.s.u(uVar.f12422i, 2));
                }
            default:
                o1.u uVar2 = (o1.u) obj;
                switch (i10) {
                    case 0:
                        return Boolean.TRUE;
                    default:
                        return Boolean.valueOf(!o1.s.u(uVar2.f12422i, 2));
                }
        }
    }
}
