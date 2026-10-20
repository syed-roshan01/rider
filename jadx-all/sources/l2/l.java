package l2;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.fragment.app.a0;
import e1.j0;
import e1.n0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class l {
    public static final float a(float f10, float[] fArr, float[] fArr2) {
        float f11;
        float f12;
        float f13;
        float f14;
        float fMax;
        float fAbs = Math.abs(f10);
        float fSignum = Math.signum(f10);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            fMax = fSignum * fArr2[iBinarySearch];
        } else {
            int i10 = -(iBinarySearch + 1);
            int i11 = i10 - 1;
            if (i11 >= fArr.length - 1) {
                float f15 = fArr[fArr.length - 1];
                float f16 = fArr2[fArr.length - 1];
                if (f15 == 0.0f) {
                    return 0.0f;
                }
                return (f16 / f15) * f10;
            }
            if (i11 == -1) {
                float f17 = fArr[0];
                f13 = fArr2[0];
                f14 = f17;
                f12 = 0.0f;
                f11 = 0.0f;
            } else {
                float f18 = fArr[i11];
                float f19 = fArr[i10];
                f11 = fArr2[i11];
                f12 = f18;
                f13 = fArr2[i10];
                f14 = f19;
            }
            fMax = fSignum * (((f13 - f11) * Math.max(0.0f, Math.min(1.0f, f12 == f14 ? 0.0f : (fAbs - f12) / (f14 - f12)))) + f11);
        }
        return fMax;
    }

    public static int b(int i10) {
        if (i10 < 8191) {
            return 13;
        }
        if (i10 < 32767) {
            return 15;
        }
        if (i10 < 65535) {
            return 16;
        }
        if (i10 < 262143) {
            return 18;
        }
        throw new IllegalArgumentException(l.q.h("Can't represent a size of ", i10, " in Constraints"));
    }

    public static long c(int i10, int i11, int i12, int i13) {
        long j10;
        int i14 = i13 == Integer.MAX_VALUE ? i12 : i13;
        int iB = b(i14);
        int i15 = i11 == Integer.MAX_VALUE ? i10 : i11;
        int iB2 = b(i15);
        if (iB + iB2 > 31) {
            throw new IllegalArgumentException("Can't represent a width of " + i15 + " and height of " + i14 + " in Constraints");
        }
        if (iB2 == 13) {
            j10 = 3;
        } else if (iB2 == 18) {
            j10 = 1;
        } else if (iB2 == 15) {
            j10 = 2;
        } else {
            if (iB2 != 16) {
                throw new IllegalStateException("Should only have the provided constants.");
            }
            j10 = 0;
        }
        int i16 = i11 == Integer.MAX_VALUE ? 0 : i11 + 1;
        int i17 = i13 != Integer.MAX_VALUE ? i13 + 1 : 0;
        int i18 = m2.a.f11789b[(int) j10];
        return (((long) i16) << 33) | j10 | (((long) i10) << 2) | (((long) i12) << i18) | (((long) i17) << (i18 + 31));
    }

    public static long d(int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            return c(i10, i10, i11, i11);
        }
        throw new IllegalArgumentException(("width(" + i10 + ") and height(" + i11 + ") must be >= 0").toString());
    }

    public static o e(float f10, e1.n nVar) {
        m mVar = m.f11216a;
        if (nVar == null) {
            return mVar;
        }
        if (!(nVar instanceof n0)) {
            if (nVar instanceof j0) {
                return new b((j0) nVar, f10);
            }
            throw new a0();
        }
        boolean zIsNaN = Float.isNaN(f10);
        long jB = ((n0) nVar).f5052a;
        if (!zIsNaN && f10 < 1.0f) {
            jB = e1.r.b(jB, e1.r.d(jB) * f10);
        }
        return jB != e1.r.f5065g ? new c(jB) : mVar;
    }

    public Signature[] f(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public void g() {
    }

    public void h(boolean z10) {
    }

    public void i(boolean z10) {
    }

    public void j() {
    }
}
