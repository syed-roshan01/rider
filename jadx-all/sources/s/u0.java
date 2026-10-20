package s;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13875b;

    public u0(float f10, m2.b bVar) {
        this.f13874a = f10;
        float fC = bVar.c();
        float f11 = v0.f13879a;
        this.f13875b = fC * 386.0878f * 160.0f * 0.84f;
    }

    public final t0 a(float f10) {
        double dB = b(f10);
        double d10 = v0.f13879a;
        double d11 = d10 - 1.0d;
        return new t0(f10, (float) (Math.exp((d10 / d11) * dB) * ((double) (this.f13874a * this.f13875b))), (long) (Math.exp(dB / d11) * 1000.0d));
    }

    public final double b(float f10) {
        float[] fArr = b.f13751a;
        return Math.log(((double) (Math.abs(f10) * 0.35f)) / ((double) (this.f13874a * this.f13875b)));
    }
}
