package y;

/* JADX INFO: loaded from: classes.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16528a;

    @Override // y.g
    public final void b(m2.b bVar, int i10, int[] iArr, m2.l lVar, int[] iArr2) {
        m2.l lVar2 = m2.l.f11815a;
        switch (this.f16528a) {
            case 6:
                if (lVar != lVar2) {
                    k.e(iArr, iArr2, true);
                } else {
                    k.f(i10, iArr, iArr2, false);
                }
                break;
            default:
                if (lVar != lVar2) {
                    k.f(i10, iArr, iArr2, true);
                } else {
                    k.e(iArr, iArr2, false);
                }
                break;
        }
    }

    public final String toString() {
        switch (this.f16528a) {
            case 6:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }
}
