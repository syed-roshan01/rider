package t;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f14190b;

    public h0(float f10, float f11, float f12) {
        this.f14189a = f12;
        c1 c1Var = new c1();
        c1Var.f14097a = 1.0f;
        double dSqrt = Math.sqrt(50.0d);
        c1Var.f14098b = dSqrt;
        c1Var.f14103g = 1.0f;
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        c1Var.f14103g = f10;
        c1Var.f14099c = false;
        if (((float) (dSqrt * dSqrt)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        c1Var.f14098b = Math.sqrt(f11);
        c1Var.f14099c = false;
        this.f14190b = c1Var;
    }

    @Override // t.f0
    public final float b(long j10, float f10, float f11, float f12) {
        c1 c1Var = this.f14190b;
        c1Var.f14097a = f11;
        return Float.intBitsToFloat((int) (c1Var.a(f10, f12, j10 / 1000000) >> 32));
    }

    @Override // t.f0
    public final float c(long j10, float f10, float f11, float f12) {
        c1 c1Var = this.f14190b;
        c1Var.f14097a = f11;
        return Float.intBitsToFloat((int) (c1Var.a(f10, f12, j10 / 1000000) & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0144  */
    @Override // t.f0
    public final long d(float f10, float f11, float f12) {
        double d10;
        boolean z10;
        boolean z11;
        double d11;
        double dLog;
        long j10;
        double d12;
        c1 c1Var = this.f14190b;
        double d13 = c1Var.f14098b;
        float f13 = c1Var.f14103g;
        float f14 = this.f14189a;
        double d14 = (float) (d13 * d13);
        double d15 = f13;
        double d16 = f12 / f14;
        double d17 = (f10 - f11) / f14;
        double d18 = 1.0f;
        double dSqrt = d15 * 2.0d * Math.sqrt(d14);
        double d19 = (dSqrt * dSqrt) - (d14 * 4.0d);
        double d20 = -dSqrt;
        v vVar = d19 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? new v(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, Math.sqrt(Math.abs(d19))) : new v(Math.sqrt(d19), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        vVar.f14331a = (vVar.f14331a + d20) * 0.5d;
        vVar.f14332b *= 0.5d;
        v vVar2 = d19 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? new v(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, Math.sqrt(Math.abs(d19))) : new v(Math.sqrt(d19), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        double d21 = -1;
        double d22 = vVar2.f14331a * d21;
        double d23 = vVar2.f14332b * d21;
        vVar2.f14331a = (d22 + d20) * 0.5d;
        vVar2.f14332b = d23 * 0.5d;
        if (d17 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d16 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            j10 = 0;
        } else {
            if (d17 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                d16 = -d16;
            }
            double dAbs = Math.abs(d17);
            int i10 = 0;
            if (d15 > 1.0d) {
                double d24 = vVar.f14331a;
                double d25 = vVar2.f14331a;
                double d26 = (d24 * dAbs) - d16;
                double d27 = d24 - d25;
                double d28 = d26 / d27;
                double d29 = dAbs - d28;
                dLog = Math.log(Math.abs(d18 / d29)) / d24;
                double dLog2 = Math.log(Math.abs(d18 / d28)) / d25;
                if (!((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true)) {
                    dLog = dLog2;
                } else if (!(!((Double.isInfinite(dLog2) || Double.isNaN(dLog2)) ? false : true))) {
                    dLog = Math.max(dLog, dLog2);
                }
                double d30 = d29 * d24;
                double dLog3 = Math.log(d30 / ((-d28) * d25)) / (d25 - d24);
                if (Double.isNaN(dLog3) || dLog3 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    d12 = -d18;
                } else if (dLog3 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    d12 = d18;
                    dLog = Math.log((-((d28 * d25) * d25)) / (d30 * d24)) / d27;
                } else if ((-((Math.exp(dLog3 * d25) * d28) + (Math.exp(d24 * dLog3) * d29))) < d18) {
                    d12 = -d18;
                    dLog = (d28 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d29 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? dLog : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                } else {
                    d12 = d18;
                    dLog = Math.log((-((d28 * d25) * d25)) / (d30 * d24)) / d27;
                }
                double d31 = d28 * d25;
                if (Math.abs((Math.exp(d25 * dLog) * d31) + (Math.exp(d24 * dLog) * d30)) >= 1.0E-4d) {
                    double dAbs2 = Double.MAX_VALUE;
                    for (double d32 = 0.001d; dAbs2 > d32 && i10 < 100; d32 = 0.001d) {
                        i10++;
                        double d33 = d24 * dLog;
                        double d34 = d25 * dLog;
                        double dExp = dLog - ((((Math.exp(d34) * d28) + (Math.exp(d33) * d29)) + d12) / ((Math.exp(d34) * d31) + (Math.exp(d33) * d30)));
                        dAbs2 = Math.abs(dLog - dExp);
                        dLog = dExp;
                    }
                }
            } else {
                v vVar3 = vVar;
                if (d15 < 1.0d) {
                    d10 = d18;
                    double d35 = vVar3.f14331a;
                    double d36 = (d16 - (d35 * dAbs)) / vVar3.f14332b;
                    dLog = Math.log(d10 / Math.sqrt((d36 * d36) + (dAbs * dAbs))) / d35;
                } else {
                    d10 = d18;
                    double d37 = vVar3.f14331a;
                    double d38 = d37 * dAbs;
                    double d39 = d16 - d38;
                    double dLog4 = Math.log(Math.abs(d10 / dAbs)) / d37;
                    double dLog5 = Math.log(Math.abs(d10 / d39));
                    double dLog6 = dLog5;
                    for (int i11 = 0; i11 < 6; i11++) {
                        dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d37));
                    }
                    double d40 = dLog6 / d37;
                    if (Double.isInfinite(dLog4) || Double.isNaN(dLog4)) {
                        z10 = false;
                        z11 = true;
                    } else {
                        z11 = true;
                        z10 = true;
                    }
                    if (!z10) {
                        dLog4 = d40;
                    } else if (!(!((Double.isInfinite(d40) || Double.isNaN(d40)) ? false : z11))) {
                        dLog4 = Math.max(dLog4, d40);
                    }
                    double d41 = (-(d38 + d39)) / (d37 * d39);
                    double d42 = d37 * d41;
                    double d43 = dLog4;
                    double dExp2 = (Math.exp(d42) * d39 * d41) + (Math.exp(d42) * dAbs);
                    if (Double.isNaN(d41) || d41 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        d10 = -d10;
                        d11 = d43;
                    } else if (d41 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || (-dExp2) >= d10) {
                        d11 = (-(2.0d / d37)) - (dAbs / d39);
                    } else {
                        d11 = (d39 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || dAbs <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? d43 : 0.0d;
                        d10 = -d10;
                    }
                    double dAbs3 = Double.MAX_VALUE;
                    for (double d44 = 0.001d; dAbs3 > d44 && i10 < 100; d44 = 0.001d) {
                        i10++;
                        double d45 = d37 * d11;
                        double dExp3 = d11 - (((Math.exp(d45) * ((d39 * d11) + dAbs)) + d10) / (Math.exp(d45) * (((d45 + ((double) 1)) * d39) + d38)));
                        dAbs3 = Math.abs(d11 - dExp3);
                        d11 = dExp3;
                    }
                    dLog = d11;
                }
            }
            j10 = (long) (dLog * 1000.0d);
        }
        return j10 * 1000000;
    }

    @Override // t.f0
    public final float e(float f10, float f11, float f12) {
        return 0.0f;
    }
}
