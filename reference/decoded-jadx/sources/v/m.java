package v;

/* JADX INFO: loaded from: classes.dex */
public final class m implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t.n f15683b;

    public m() {
        n nVar = n.f15709a;
        this.f15683b = n.f15710b;
    }

    @Override // v.o
    public final float a(float f10, float f11, float f12) {
        float f13 = f11 + f10;
        if ((f10 >= 0.0f && f13 <= f12) || (f10 < 0.0f && f13 > f12)) {
            return 0.0f;
        }
        float f14 = f13 - f12;
        return Math.abs(f10) < Math.abs(f14) ? f10 : f14;
    }

    @Override // v.o
    public final t.n b() {
        return this.f15683b;
    }
}
