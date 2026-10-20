package t;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f14097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f14098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f14100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f14101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f14102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f14103g;

    public final long a(float f10, float f11, long j10) {
        double dCos;
        double dExp;
        if (!this.f14099c) {
            if (this.f14097a == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f12 = this.f14103g;
            double d10 = f12;
            double d11 = d10 * d10;
            if (f12 > 1.0f) {
                double d12 = this.f14098b;
                double d13 = d11 - ((double) 1);
                this.f14100d = (Math.sqrt(d13) * d12) + (((double) (-f12)) * d12);
                double d14 = -this.f14103g;
                double d15 = this.f14098b;
                this.f14101e = (d14 * d15) - (Math.sqrt(d13) * d15);
            } else if (f12 >= 0.0f && f12 < 1.0f) {
                this.f14102f = Math.sqrt(((double) 1) - d11) * this.f14098b;
            }
            this.f14099c = true;
        }
        float f13 = f10 - this.f14097a;
        double d16 = j10 / 1000.0d;
        float f14 = this.f14103g;
        if (f14 > 1.0f) {
            double d17 = f13;
            double d18 = this.f14101e;
            double d19 = f11;
            double d20 = this.f14100d;
            double d21 = d17 - (((d18 * d17) - d19) / (d18 - d20));
            double d22 = ((d17 * d18) - d19) / (d18 - d20);
            dExp = (Math.exp(this.f14100d * d16) * d22) + (Math.exp(d18 * d16) * d21);
            double d23 = this.f14101e;
            double dExp2 = Math.exp(d23 * d16) * d21 * d23;
            double d24 = this.f14100d;
            dCos = (Math.exp(d24 * d16) * d22 * d24) + dExp2;
        } else if (f14 == 1.0f) {
            double d25 = this.f14098b;
            double d26 = f13;
            double d27 = (d25 * d26) + ((double) f11);
            double d28 = (d27 * d16) + d26;
            dExp = Math.exp((-d25) * d16) * d28;
            double dExp3 = Math.exp((-this.f14098b) * d16) * d28;
            double d29 = this.f14098b;
            dCos = (Math.exp((-d29) * d16) * d27) + (dExp3 * (-d29));
        } else {
            double d30 = ((double) 1) / this.f14102f;
            double d31 = this.f14098b;
            double d32 = f13;
            double d33 = ((((double) f14) * d31 * d32) + ((double) f11)) * d30;
            double dExp4 = Math.exp(((double) (-f14)) * d31 * d16) * ((Math.sin(this.f14102f * d16) * d33) + (Math.cos(this.f14102f * d16) * d32));
            double d34 = this.f14098b;
            float f15 = this.f14103g;
            double d35 = (-d34) * dExp4 * ((double) f15);
            double dExp5 = Math.exp(((double) (-f15)) * d34 * d16);
            double d36 = this.f14102f;
            double dSin = Math.sin(d36 * d16) * (-d36) * d32;
            double d37 = this.f14102f;
            dCos = (((Math.cos(d37 * d16) * d33 * d37) + dSin) * dExp5) + d35;
            dExp = dExp4;
        }
        return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dExp + ((double) this.f14097a))) << 32);
    }
}
