package p1;

import d7.t;
import java.util.List;
import m0.n1;
import m0.o3;
import m9.e0;
import o1.u;
import r8.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1 f12757a = t.g0(Boolean.FALSE, o3.f11621a);

    public static final void a(d dVar, u uVar) {
        boolean zBooleanValue = ((Boolean) f12757a.getValue()).booleanValue();
        List list = r.f13661a;
        int i10 = 0;
        if (zBooleanValue) {
            if (e0.r(uVar)) {
                dVar.c();
            }
            boolean zT = e0.t(uVar);
            long j10 = uVar.f12415b;
            if (!zT) {
                List list2 = uVar.f12424k;
                if (list2 != null) {
                    list = list2;
                }
                int size = list.size();
                while (i10 < size) {
                    o1.d dVar2 = (o1.d) list.get(i10);
                    dVar.a(dVar2.f12351a, dVar2.f12353c);
                    i10++;
                }
                dVar.a(j10, uVar.f12425l);
            }
            if (e0.t(uVar) && j10 - dVar.f12756d > 40) {
                dVar.c();
            }
            dVar.f12756d = j10;
            return;
        }
        boolean zR = e0.r(uVar);
        long j11 = uVar.f12416c;
        if (zR) {
            dVar.f12755c = j11;
            dVar.c();
        }
        List list3 = uVar.f12424k;
        if (list3 != null) {
            list = list3;
        }
        int size2 = list.size();
        long j12 = uVar.f12420g;
        while (i10 < size2) {
            o1.d dVar3 = (o1.d) list.get(i10);
            long jG = d1.c.g(dVar.f12755c, d1.c.f(dVar3.f12352b, j12));
            dVar.f12755c = jG;
            dVar.a(dVar3.f12351a, jG);
            i10++;
            j12 = dVar3.f12352b;
        }
        long jG2 = d1.c.g(dVar.f12755c, d1.c.f(j11, j12));
        dVar.f12755c = jG2;
        dVar.a(uVar.f12415b, jG2);
    }

    public static final float b(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f10 += fArr[i10] * fArr2[i10];
        }
        return f10;
    }

    public static final void c(float[] fArr, float[] fArr2, int i10, float[] fArr3) {
        if (i10 == 0) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        int i11 = 2 >= i10 ? i10 - 1 : 2;
        int i12 = i11 + 1;
        float[][] fArr4 = new float[i12][];
        for (int i13 = 0; i13 < i12; i13++) {
            fArr4[i13] = new float[i10];
        }
        for (int i14 = 0; i14 < i10; i14++) {
            fArr4[0][i14] = 1.0f;
            for (int i15 = 1; i15 < i12; i15++) {
                fArr4[i15][i14] = fArr4[i15 - 1][i14] * fArr[i14];
            }
        }
        float[][] fArr5 = new float[i12][];
        for (int i16 = 0; i16 < i12; i16++) {
            fArr5[i16] = new float[i10];
        }
        float[][] fArr6 = new float[i12][];
        for (int i17 = 0; i17 < i12; i17++) {
            fArr6[i17] = new float[i12];
        }
        int i18 = 0;
        while (i18 < i12) {
            float[] fArr7 = fArr5[i18];
            float[] fArr8 = fArr4[i18];
            for (int i19 = 0; i19 < i10; i19++) {
                fArr7[i19] = fArr8[i19];
            }
            for (int i20 = 0; i20 < i18; i20++) {
                float[] fArr9 = fArr5[i20];
                float fB = b(fArr7, fArr9);
                for (int i21 = 0; i21 < i10; i21++) {
                    fArr7[i21] = fArr7[i21] - (fArr9[i21] * fB);
                }
            }
            float fSqrt = (float) Math.sqrt(b(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
            }
            float f10 = 1.0f / fSqrt;
            for (int i22 = 0; i22 < i10; i22++) {
                fArr7[i22] = fArr7[i22] * f10;
            }
            float[] fArr10 = fArr6[i18];
            int i23 = 0;
            while (i23 < i12) {
                fArr10[i23] = i23 < i18 ? 0.0f : b(fArr7, fArr4[i23]);
                i23++;
            }
            i18++;
        }
        for (int i24 = i11; -1 < i24; i24--) {
            fArr3[i24] = b(fArr5[i24], fArr2);
            int i25 = i24 + 1;
            if (i25 <= i11) {
                int i26 = i11;
                while (true) {
                    fArr3[i24] = fArr3[i24] - (fArr6[i24][i26] * fArr3[i26]);
                    if (i26 != i25) {
                        i26--;
                    }
                }
            }
            fArr3[i24] = fArr3[i24] / fArr6[i24][i24];
        }
    }
}
