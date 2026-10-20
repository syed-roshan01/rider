package f1;

import b0.l0;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public final class q extends d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l0 f6076r = new l0(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f6077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f6078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f6079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f6080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f6081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f6082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f6083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f6084k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f6085l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f6086m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f6087n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p f6088o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f6089p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f6090q;

    /* JADX WARN: Code duplicated, block: B:38:0x0210  */
    /* JADX WARN: Code duplicated, block: B:63:0x025f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0215 A[SYNTHETIC] */
    public q(String str, float[] fArr, s sVar, float[] fArr2, i iVar, i iVar2, float f10, float f11, r rVar, int i10) {
        boolean z10;
        q qVar;
        double d10;
        boolean z11;
        super(str, c.f6020a, i10);
        this.f6077d = sVar;
        this.f6078e = f10;
        this.f6079f = f11;
        this.f6080g = rVar;
        this.f6084k = iVar;
        int i11 = 1;
        this.f6085l = new p(this, i11);
        int i12 = 0;
        this.f6086m = new m(this, i12);
        this.f6087n = iVar2;
        this.f6088o = new p(this, i12);
        this.f6089p = new m(this, i11);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        float[] fArr3 = new float[6];
        if (fArr.length == 9) {
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = f12 + f13 + fArr[2];
            fArr3[0] = f12 / f14;
            fArr3[1] = f13 / f14;
            float f15 = fArr[3];
            float f16 = fArr[4];
            float f17 = f15 + f16 + fArr[5];
            fArr3[2] = f15 / f17;
            fArr3[3] = f16 / f17;
            float f18 = fArr[6];
            float f19 = fArr[7];
            float f20 = f18 + f19 + fArr[8];
            fArr3[4] = f18 / f20;
            fArr3[5] = f19 / f20;
        } else {
            System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.f6081h = fArr3;
        if (fArr2 == null) {
            float f21 = fArr3[0];
            float f22 = fArr3[1];
            float f23 = fArr3[2];
            float f24 = fArr3[3];
            float f25 = fArr3[4];
            float f26 = fArr3[5];
            float f27 = 1;
            float f28 = (f27 - f21) / f22;
            float f29 = (f27 - f23) / f24;
            float f30 = (f27 - f25) / f26;
            float f31 = sVar.f6098a;
            float f32 = sVar.f6099b;
            float f33 = (f27 - f31) / f32;
            float f34 = f21 / f22;
            float f35 = (f23 / f24) - f34;
            float f36 = (f31 / f32) - f34;
            float f37 = f29 - f28;
            float f38 = (f25 / f26) - f34;
            float f39 = (((f33 - f28) * f35) - (f36 * f37)) / (((f30 - f28) * f35) - (f37 * f38));
            float f40 = (f36 - (f38 * f39)) / f35;
            float f41 = (1.0f - f40) - f39;
            float f42 = f41 / f22;
            float f43 = f40 / f24;
            float f44 = f39 / f26;
            this.f6082i = new float[]{f42 * f21, f41, ((1.0f - f21) - f22) * f42, f43 * f23, f40, ((1.0f - f23) - f24) * f43, f44 * f25, f39, ((1.0f - f25) - f26) * f44};
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f6082i = fArr2;
        }
        this.f6083j = d0.O(this.f6082i);
        float f45 = a4.q.f(fArr3);
        float[] fArr4 = e.f6028a;
        if (f45 / a4.q.f(e.f6029b) > 0.9f) {
            float[] fArr5 = e.f6028a;
            float f46 = fArr3[0] - fArr5[0];
            float f47 = fArr3[1] - fArr5[1];
            float[] fArr6 = {f46, f47, fArr3[2] - fArr5[2], fArr3[3] - fArr5[3], fArr3[4] - fArr5[4], fArr3[5] - fArr5[5]};
            if (a4.q.g(f46, f47, fArr5[0] - fArr5[4], fArr5[1] - fArr5[5]) < 0.0f || a4.q.g(fArr5[0] - fArr5[2], fArr5[1] - fArr5[3], fArr6[0], fArr6[1]) < 0.0f) {
                z10 = true;
            } else if (a4.q.g(fArr6[2], fArr6[3], fArr5[2] - fArr5[0], fArr5[3] - fArr5[1]) < 0.0f || a4.q.g(fArr5[2] - fArr5[4], fArr5[3] - fArr5[5], fArr6[2], fArr6[3]) < 0.0f || a4.q.g(fArr6[4], fArr6[5], fArr5[4] - fArr5[2], fArr5[5] - fArr5[3]) < 0.0f) {
                z10 = true;
            } else {
                z10 = true;
                if (a4.q.g(fArr5[4] - fArr5[0], fArr5[5] - fArr5[1], fArr6[4], fArr6[5]) < 0.0f) {
                }
            }
            int i13 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        } else {
            z10 = true;
            int i14 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        }
        if (i10 != 0) {
            float[] fArr7 = e.f6028a;
            if (fArr3 != fArr7) {
                int i15 = 0;
                while (true) {
                    if (i15 < 6) {
                        if (Float.compare(fArr3[i15], fArr7[i15]) == 0 || Math.abs(fArr3[i15] - fArr7[i15]) <= 0.001f) {
                            i15++;
                        }
                    } else if (d0.p(sVar, j.f6062d)) {
                        float[] fArr8 = e.f6028a;
                        qVar = e.f6030c;
                        d10 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                        while (true) {
                            if (d10 <= 1.0d) {
                                z11 = z10;
                            } else if (Math.abs(iVar.b(d10) - qVar.f6084k.b(d10)) > 0.001d) {
                            }
                            d10 += 0.00392156862745098d;
                        }
                    }
                }
            } else if (d0.p(sVar, j.f6062d) && f10 == 0.0f && f11 == 1.0f) {
                float[] fArr9 = e.f6028a;
                qVar = e.f6030c;
                d10 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                while (true) {
                    if (d10 <= 1.0d) {
                        z11 = z10;
                    } else if (Math.abs(iVar.b(d10) - qVar.f6084k.b(d10)) > 0.001d && Math.abs(iVar2.b(d10) - qVar.f6087n.b(d10)) <= 0.001d) {
                        d10 += 0.00392156862745098d;
                    }
                }
            }
            z11 = false;
        } else {
            z11 = z10;
        }
        this.f6090q = z11;
    }

    @Override // f1.d
    public final float a(int i10) {
        return this.f6079f;
    }

    @Override // f1.d
    public final float b(int i10) {
        return this.f6078e;
    }

    @Override // f1.d
    public final boolean c() {
        return this.f6090q;
    }

    @Override // f1.d
    public final long d(float f10, float f11, float f12) {
        double d10 = f10;
        m mVar = this.f6089p;
        float fB = (float) mVar.b(d10);
        float fB2 = (float) mVar.b(f11);
        float fB3 = (float) mVar.b(f12);
        float[] fArr = this.f6082i;
        return (((long) Float.floatToRawIntBits(d0.W(fArr, fB, fB2, fB3))) << 32) | (((long) Float.floatToRawIntBits(d0.X(fArr, fB, fB2, fB3))) & 4294967295L);
    }

    @Override // f1.d
    public final float e(float f10, float f11, float f12) {
        double d10 = f10;
        m mVar = this.f6089p;
        return d0.Y(this.f6082i, (float) mVar.b(d10), (float) mVar.b(f11), (float) mVar.b(f12));
    }

    @Override // f1.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        if (Float.compare(qVar.f6078e, this.f6078e) != 0 || Float.compare(qVar.f6079f, this.f6079f) != 0 || !d7.a.d(this.f6077d, qVar.f6077d) || !Arrays.equals(this.f6081h, qVar.f6081h)) {
            return false;
        }
        r rVar = qVar.f6080g;
        r rVar2 = this.f6080g;
        if (rVar2 != null) {
            return d7.a.d(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (d7.a.d(this.f6084k, qVar.f6084k)) {
            return d7.a.d(this.f6087n, qVar.f6087n);
        }
        return false;
    }

    @Override // f1.d
    public final long f(float f10, float f11, float f12, float f13, d dVar) {
        float[] fArr = this.f6083j;
        float fW = d0.W(fArr, f10, f11, f12);
        float fX = d0.X(fArr, f10, f11, f12);
        float fY = d0.Y(fArr, f10, f11, f12);
        m mVar = this.f6086m;
        return androidx.compose.ui.graphics.a.a((float) mVar.b(fW), (float) mVar.b(fX), (float) mVar.b(fY), f13, dVar);
    }

    @Override // f1.d
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f6081h) + ((this.f6077d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f10 = this.f6078e;
        int iFloatToIntBits = (iHashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f6079f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        r rVar = this.f6080g;
        int iHashCode2 = iFloatToIntBits2 + (rVar != null ? rVar.hashCode() : 0);
        if (rVar == null) {
            return this.f6087n.hashCode() + ((this.f6084k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    public q(String str, float[] fArr, s sVar, final r rVar, int i10) {
        i iVar;
        i iVar2;
        double d10 = rVar.f6096f;
        double d11 = rVar.f6097g;
        if (d10 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d11 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            final int i11 = 0;
            iVar = new i() { // from class: f1.n
                @Override // f1.i
                public final double b(double d12) {
                    int i12 = i11;
                    r rVar2 = rVar;
                    switch (i12) {
                        case 0:
                            double d13 = rVar2.f6092b;
                            double d14 = rVar2.f6095e;
                            double d15 = rVar2.f6094d;
                            return d12 >= d14 * d15 ? (Math.pow(d12, 1.0d / rVar2.f6091a) - rVar2.f6093c) / d13 : d12 / d15;
                        case 1:
                            double d16 = rVar2.f6092b;
                            double d17 = rVar2.f6095e;
                            double d18 = rVar2.f6094d;
                            return d12 >= d17 * d18 ? (Math.pow(d12 - rVar2.f6096f, 1.0d / rVar2.f6091a) - rVar2.f6093c) / d16 : (d12 - rVar2.f6097g) / d18;
                        case 2:
                            return d12 >= rVar2.f6095e ? Math.pow((rVar2.f6092b * d12) + rVar2.f6093c, rVar2.f6091a) : d12 * rVar2.f6094d;
                        default:
                            double d19 = rVar2.f6092b;
                            if (d12 >= rVar2.f6095e) {
                                return Math.pow((d19 * d12) + rVar2.f6093c, rVar2.f6091a) + rVar2.f6096f;
                            }
                            return rVar2.f6097g + (rVar2.f6094d * d12);
                    }
                }
            };
        } else {
            final int i12 = 1;
            iVar = new i() { // from class: f1.n
                @Override // f1.i
                public final double b(double d12) {
                    int i13 = i12;
                    r rVar2 = rVar;
                    switch (i13) {
                        case 0:
                            double d13 = rVar2.f6092b;
                            double d14 = rVar2.f6095e;
                            double d15 = rVar2.f6094d;
                            return d12 >= d14 * d15 ? (Math.pow(d12, 1.0d / rVar2.f6091a) - rVar2.f6093c) / d13 : d12 / d15;
                        case 1:
                            double d16 = rVar2.f6092b;
                            double d17 = rVar2.f6095e;
                            double d18 = rVar2.f6094d;
                            return d12 >= d17 * d18 ? (Math.pow(d12 - rVar2.f6096f, 1.0d / rVar2.f6091a) - rVar2.f6093c) / d16 : (d12 - rVar2.f6097g) / d18;
                        case 2:
                            return d12 >= rVar2.f6095e ? Math.pow((rVar2.f6092b * d12) + rVar2.f6093c, rVar2.f6091a) : d12 * rVar2.f6094d;
                        default:
                            double d19 = rVar2.f6092b;
                            if (d12 >= rVar2.f6095e) {
                                return Math.pow((d19 * d12) + rVar2.f6093c, rVar2.f6091a) + rVar2.f6096f;
                            }
                            return rVar2.f6097g + (rVar2.f6094d * d12);
                    }
                }
            };
        }
        i iVar3 = iVar;
        if (d10 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d11 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            final int i13 = 2;
            iVar2 = new i() { // from class: f1.n
                @Override // f1.i
                public final double b(double d12) {
                    int i14 = i13;
                    r rVar2 = rVar;
                    switch (i14) {
                        case 0:
                            double d13 = rVar2.f6092b;
                            double d14 = rVar2.f6095e;
                            double d15 = rVar2.f6094d;
                            return d12 >= d14 * d15 ? (Math.pow(d12, 1.0d / rVar2.f6091a) - rVar2.f6093c) / d13 : d12 / d15;
                        case 1:
                            double d16 = rVar2.f6092b;
                            double d17 = rVar2.f6095e;
                            double d18 = rVar2.f6094d;
                            return d12 >= d17 * d18 ? (Math.pow(d12 - rVar2.f6096f, 1.0d / rVar2.f6091a) - rVar2.f6093c) / d16 : (d12 - rVar2.f6097g) / d18;
                        case 2:
                            return d12 >= rVar2.f6095e ? Math.pow((rVar2.f6092b * d12) + rVar2.f6093c, rVar2.f6091a) : d12 * rVar2.f6094d;
                        default:
                            double d19 = rVar2.f6092b;
                            if (d12 >= rVar2.f6095e) {
                                return Math.pow((d19 * d12) + rVar2.f6093c, rVar2.f6091a) + rVar2.f6096f;
                            }
                            return rVar2.f6097g + (rVar2.f6094d * d12);
                    }
                }
            };
        } else {
            final int i14 = 3;
            iVar2 = new i() { // from class: f1.n
                @Override // f1.i
                public final double b(double d12) {
                    int i15 = i14;
                    r rVar2 = rVar;
                    switch (i15) {
                        case 0:
                            double d13 = rVar2.f6092b;
                            double d14 = rVar2.f6095e;
                            double d15 = rVar2.f6094d;
                            return d12 >= d14 * d15 ? (Math.pow(d12, 1.0d / rVar2.f6091a) - rVar2.f6093c) / d13 : d12 / d15;
                        case 1:
                            double d16 = rVar2.f6092b;
                            double d17 = rVar2.f6095e;
                            double d18 = rVar2.f6094d;
                            return d12 >= d17 * d18 ? (Math.pow(d12 - rVar2.f6096f, 1.0d / rVar2.f6091a) - rVar2.f6093c) / d16 : (d12 - rVar2.f6097g) / d18;
                        case 2:
                            return d12 >= rVar2.f6095e ? Math.pow((rVar2.f6092b * d12) + rVar2.f6093c, rVar2.f6091a) : d12 * rVar2.f6094d;
                        default:
                            double d19 = rVar2.f6092b;
                            if (d12 >= rVar2.f6095e) {
                                return Math.pow((d19 * d12) + rVar2.f6093c, rVar2.f6091a) + rVar2.f6096f;
                            }
                            return rVar2.f6097g + (rVar2.f6094d * d12);
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar3, iVar2, 0.0f, 1.0f, rVar, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(String str, float[] fArr, s sVar, final double d10, float f10, float f11, int i10) {
        i iVar;
        i iVar2;
        l0 l0Var = f6076r;
        if (d10 == 1.0d) {
            iVar = l0Var;
        } else {
            final int i11 = 0;
            iVar = new i() { // from class: f1.o
                @Override // f1.i
                public final double b(double d11) {
                    int i12 = i11;
                    double d12 = d10;
                    switch (i12) {
                        case 0:
                            if (d11 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d12);
                        default:
                            if (d11 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d12);
                    }
                }
            };
        }
        if (d10 == 1.0d) {
            iVar2 = l0Var;
        } else {
            final int i12 = 1;
            iVar2 = new i() { // from class: f1.o
                @Override // f1.i
                public final double b(double d11) {
                    int i13 = i12;
                    double d12 = d10;
                    switch (i13) {
                        case 0:
                            if (d11 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d12);
                        default:
                            if (d11 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d12);
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, f10, f11, new r(d10, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE), i10);
    }
}
