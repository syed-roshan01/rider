package y;

/* JADX INFO: loaded from: classes.dex */
public final class f implements g, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16540b;

    public f(int i10) {
        this.f16539a = i10;
        if (i10 == 1) {
            this.f16540b = 0;
            return;
        }
        if (i10 == 2) {
            this.f16540b = 0;
        } else if (i10 != 3) {
            this.f16540b = 0;
        } else {
            this.f16540b = 0;
        }
    }

    @Override // y.g, y.i
    public final float a() {
        return this.f16540b;
    }

    @Override // y.g
    public final void b(m2.b bVar, int i10, int[] iArr, m2.l lVar, int[] iArr2) {
        m2.l lVar2 = m2.l.f11815a;
        switch (this.f16539a) {
            case 0:
                if (lVar != lVar2) {
                    k.d(i10, iArr, iArr2, true);
                } else {
                    k.d(i10, iArr, iArr2, false);
                }
                break;
            case 1:
                if (lVar != lVar2) {
                    k.g(i10, iArr, iArr2, true);
                } else {
                    k.g(i10, iArr, iArr2, false);
                }
                break;
            case 2:
                if (lVar != lVar2) {
                    k.h(i10, iArr, iArr2, true);
                } else {
                    k.h(i10, iArr, iArr2, false);
                }
                break;
            default:
                if (lVar != lVar2) {
                    k.i(i10, iArr, iArr2, true);
                } else {
                    k.i(i10, iArr, iArr2, false);
                }
                break;
        }
    }

    @Override // y.i
    public final void c(m2.b bVar, int i10, int[] iArr, int[] iArr2) {
        switch (this.f16539a) {
            case 0:
                k.d(i10, iArr, iArr2, false);
                break;
            case 1:
                k.g(i10, iArr, iArr2, false);
                break;
            case 2:
                k.h(i10, iArr, iArr2, false);
                break;
            default:
                k.i(i10, iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f16539a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
