package f1;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f6091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f6092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f6093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f6094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f6095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f6096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f6097g;

    public /* synthetic */ r(double d10, double d11, double d12, double d13, double d14) {
        this(d10, d11, d12, d13, d14, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f6091a, rVar.f6091a) == 0 && Double.compare(this.f6092b, rVar.f6092b) == 0 && Double.compare(this.f6093c, rVar.f6093c) == 0 && Double.compare(this.f6094d, rVar.f6094d) == 0 && Double.compare(this.f6095e, rVar.f6095e) == 0 && Double.compare(this.f6096f, rVar.f6096f) == 0 && Double.compare(this.f6097g, rVar.f6097g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f6097g) + ((Double.hashCode(this.f6096f) + ((Double.hashCode(this.f6095e) + ((Double.hashCode(this.f6094d) + ((Double.hashCode(this.f6093c) + ((Double.hashCode(this.f6092b) + (Double.hashCode(this.f6091a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f6091a + ", a=" + this.f6092b + ", b=" + this.f6093c + ", c=" + this.f6094d + ", d=" + this.f6095e + ", e=" + this.f6096f + ", f=" + this.f6097g + ')';
    }

    public r(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f6091a = d10;
        this.f6092b = d11;
        this.f6093c = d12;
        this.f6094d = d13;
        this.f6095e = d14;
        this.f6096f = d15;
        this.f6097g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d14 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && (d11 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d10 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d10 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) && d13 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d10 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
