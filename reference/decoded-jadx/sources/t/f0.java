package t;

/* JADX INFO: loaded from: classes.dex */
public interface f0 extends n {
    @Override // t.n
    default z1 a(x1 x1Var) {
        return new c2(this);
    }

    float b(long j10, float f10, float f11, float f12);

    float c(long j10, float f10, float f11, float f12);

    long d(float f10, float f11, float f12);

    default float e(float f10, float f11, float f12) {
        return c(d(f10, f11, f12), f10, f11, f12);
    }
}
