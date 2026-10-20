package y;

/* JADX INFO: loaded from: classes.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16532a;

    @Override // y.i
    public final void c(m2.b bVar, int i10, int[] iArr, int[] iArr2) {
        switch (this.f16532a) {
            case 0:
                k.f(i10, iArr, iArr2, false);
                break;
            default:
                k.e(iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f16532a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
