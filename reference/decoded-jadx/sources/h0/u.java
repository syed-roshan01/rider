package h0;

import m0.g1;

/* JADX INFO: loaded from: classes.dex */
public final class u extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7465a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7467c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i10, g1 g1Var) {
        super(0);
        this.f7466b = i10;
        this.f7467c = g1Var;
    }

    @Override // c9.a
    public final Object invoke() {
        int i10 = this.f7465a;
        int i11 = this.f7466b;
        Object obj = this.f7467c;
        switch (i10) {
            case 0:
                return Integer.valueOf(((n) obj).f7430d.f(i11));
            default:
                ((g1) obj).setValue(Integer.valueOf(i11));
                return q8.l.f13235a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(n nVar, int i10) {
        super(0);
        this.f7467c = nVar;
        this.f7466b = i10;
    }
}
