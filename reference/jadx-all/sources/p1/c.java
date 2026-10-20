package p1;

import androidx.fragment.app.a0;
import m0.n1;
import t.k;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12745a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12746b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a[] f12748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f12750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f12751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f12752h;

    public c() {
        int i10;
        int iE = k.e(1);
        if (iE == 0) {
            i10 = 3;
        } else {
            if (iE != 1) {
                throw new a0();
            }
            i10 = 2;
        }
        this.f12747c = i10;
        this.f12748d = new a[20];
        this.f12750f = new float[20];
        this.f12751g = new float[20];
        this.f12752h = new float[3];
    }

    public final void a(float f10, long j10) {
        int i10 = (this.f12749e + 1) % 20;
        this.f12749e = i10;
        n1 n1Var = e.f12757a;
        a[] aVarArr = this.f12748d;
        a aVar = aVarArr[i10];
        if (aVar != null) {
            aVar.f12741a = j10;
            aVar.f12742b = f10;
        } else {
            a aVar2 = new a();
            aVar2.f12741a = j10;
            aVar2.f12742b = f10;
            aVarArr[i10] = aVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    public final float b(float f10) {
        float[] fArr;
        float[] fArr2;
        float f11;
        float fSignum;
        float f12 = 0.0f;
        if (f10 <= 0.0f) {
            throw new IllegalStateException(("maximumVelocity should be a positive value. You specified=" + f10).toString());
        }
        int i10 = this.f12749e;
        a[] aVarArr = this.f12748d;
        a aVar = aVarArr[i10];
        if (aVar == null) {
            f11 = 0.0f;
        } else {
            a aVar2 = aVar;
            int i11 = 0;
            while (true) {
                a aVar3 = aVarArr[i10];
                fArr = this.f12750f;
                fArr2 = this.f12751g;
                if (aVar3 == null) {
                    break;
                }
                long j10 = aVar.f12741a;
                int i12 = i10;
                long j11 = aVar3.f12741a;
                float f13 = j10 - j11;
                float fAbs = Math.abs(j11 - aVar2.f12741a);
                if (f13 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i11] = aVar3.f12742b;
                fArr2[i11] = -f13;
                i10 = (i12 == 0 ? 20 : i12) - 1;
                i11++;
                if (i11 >= 20) {
                    break;
                }
                aVar2 = aVar3;
            }
            if (i11 >= this.f12747c) {
                int iE = k.e(this.f12746b);
                if (iE == 0) {
                    try {
                        float[] fArr3 = this.f12752h;
                        e.c(fArr2, fArr, i11, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = 0.0f;
                    }
                } else {
                    if (iE != 1) {
                        throw new a0();
                    }
                    n1 n1Var = e.f12757a;
                    if (i11 < 2) {
                        fSignum = 0.0f;
                    } else {
                        boolean z10 = this.f12745a;
                        if (i11 == 2) {
                            float f14 = fArr2[0];
                            float f15 = fArr2[1];
                            if (f14 == f15) {
                                fSignum = 0.0f;
                            } else {
                                fSignum = (z10 ? fArr[0] : fArr[0] - fArr[1]) / (f14 - f15);
                            }
                        } else {
                            int i13 = i11 - 1;
                            float fAbs2 = 0.0f;
                            for (int i14 = i13; i14 > 0; i14--) {
                                int i15 = i14 - 1;
                                if (fArr2[i14] != fArr2[i15]) {
                                    float fSignum2 = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                                    float f16 = (z10 ? -fArr[i15] : fArr[i14] - fArr[i15]) / (fArr2[i14] - fArr2[i15]);
                                    fAbs2 += Math.abs(f16) * (f16 - fSignum2);
                                    if (i14 == i13) {
                                        fAbs2 *= 0.5f;
                                    }
                                }
                            }
                            fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                        }
                    }
                }
                f11 = fSignum * 1000;
                f12 = 0.0f;
            } else {
                f12 = 0.0f;
                f11 = 0.0f;
            }
        }
        if (f11 == f12) {
            return f12;
        }
        return f11 > f12 ? z6.a.o(f11, f10) : z6.a.m(f11, -f10);
    }
}
