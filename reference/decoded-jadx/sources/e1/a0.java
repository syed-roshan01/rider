package e1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f4989a;

    public /* synthetic */ a0(float[] fArr) {
        this.f4989a = fArr;
    }

    public static final long a(float[] fArr, long j10) {
        float fD = d1.c.d(j10);
        float fE = d1.c.e(j10);
        float f10 = 1 / (((fArr[7] * fE) + (fArr[3] * fD)) + fArr[15]);
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            f10 = 0.0f;
        }
        return d9.i.f(((fArr[4] * fE) + (fArr[0] * fD) + fArr[12]) * f10, ((fArr[5] * fE) + (fArr[1] * fD) + fArr[13]) * f10);
    }

    public static final void b(float[] fArr, d1.b bVar) {
        long jA = a(fArr, d9.i.f(bVar.f4322a, bVar.f4323b));
        long jA2 = a(fArr, d9.i.f(bVar.f4322a, bVar.f4325d));
        long jA3 = a(fArr, d9.i.f(bVar.f4324c, bVar.f4323b));
        long jA4 = a(fArr, d9.i.f(bVar.f4324c, bVar.f4325d));
        bVar.f4322a = Math.min(Math.min(d1.c.d(jA), d1.c.d(jA2)), Math.min(d1.c.d(jA3), d1.c.d(jA4)));
        bVar.f4323b = Math.min(Math.min(d1.c.e(jA), d1.c.e(jA2)), Math.min(d1.c.e(jA3), d1.c.e(jA4)));
        bVar.f4324c = Math.max(Math.max(d1.c.d(jA), d1.c.d(jA2)), Math.max(d1.c.d(jA3), d1.c.d(jA4)));
        bVar.f4325d = Math.max(Math.max(d1.c.e(jA), d1.c.e(jA2)), Math.max(d1.c.e(jA3), d1.c.e(jA4)));
    }

    public static final void c(float[] fArr) {
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                fArr[(i11 * 4) + i10] = i10 == i11 ? 1.0f : 0.0f;
                i11++;
            }
            i10++;
        }
    }

    public static final void d(float[] fArr, float[] fArr2) {
        float fH = androidx.compose.ui.graphics.a.h(fArr, 0, fArr2, 0);
        float fH2 = androidx.compose.ui.graphics.a.h(fArr, 0, fArr2, 1);
        float fH3 = androidx.compose.ui.graphics.a.h(fArr, 0, fArr2, 2);
        float fH4 = androidx.compose.ui.graphics.a.h(fArr, 0, fArr2, 3);
        float fH5 = androidx.compose.ui.graphics.a.h(fArr, 1, fArr2, 0);
        float fH6 = androidx.compose.ui.graphics.a.h(fArr, 1, fArr2, 1);
        float fH7 = androidx.compose.ui.graphics.a.h(fArr, 1, fArr2, 2);
        float fH8 = androidx.compose.ui.graphics.a.h(fArr, 1, fArr2, 3);
        float fH9 = androidx.compose.ui.graphics.a.h(fArr, 2, fArr2, 0);
        float fH10 = androidx.compose.ui.graphics.a.h(fArr, 2, fArr2, 1);
        float fH11 = androidx.compose.ui.graphics.a.h(fArr, 2, fArr2, 2);
        float fH12 = androidx.compose.ui.graphics.a.h(fArr, 2, fArr2, 3);
        float fH13 = androidx.compose.ui.graphics.a.h(fArr, 3, fArr2, 0);
        float fH14 = androidx.compose.ui.graphics.a.h(fArr, 3, fArr2, 1);
        float fH15 = androidx.compose.ui.graphics.a.h(fArr, 3, fArr2, 2);
        float fH16 = androidx.compose.ui.graphics.a.h(fArr, 3, fArr2, 3);
        fArr[0] = fH;
        fArr[1] = fH2;
        fArr[2] = fH3;
        fArr[3] = fH4;
        fArr[4] = fH5;
        fArr[5] = fH6;
        fArr[6] = fH7;
        fArr[7] = fH8;
        fArr[8] = fH9;
        fArr[9] = fH10;
        fArr[10] = fH11;
        fArr[11] = fH12;
        fArr[12] = fH13;
        fArr[13] = fH14;
        fArr[14] = fH15;
        fArr[15] = fH16;
    }

    public static void e(float[] fArr, float f10, float f11) {
        float f12 = (fArr[8] * 0.0f) + (fArr[4] * f11) + (fArr[0] * f10) + fArr[12];
        float f13 = (fArr[9] * 0.0f) + (fArr[5] * f11) + (fArr[1] * f10) + fArr[13];
        float f14 = (fArr[10] * 0.0f) + (fArr[6] * f11) + (fArr[2] * f10) + fArr[14];
        float f15 = (fArr[11] * 0.0f) + (fArr[7] * f11) + (fArr[3] * f10) + fArr[15];
        fArr[12] = f12;
        fArr[13] = f13;
        fArr[14] = f14;
        fArr[15] = f15;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            return d7.a.d(this.f4989a, ((a0) obj).f4989a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4989a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |");
        float[] fArr = this.f4989a;
        sb.append(fArr[0]);
        sb.append(' ');
        sb.append(fArr[1]);
        sb.append(' ');
        sb.append(fArr[2]);
        sb.append(' ');
        sb.append(fArr[3]);
        sb.append("|\n            |");
        sb.append(fArr[4]);
        sb.append(' ');
        sb.append(fArr[5]);
        sb.append(' ');
        sb.append(fArr[6]);
        sb.append(' ');
        sb.append(fArr[7]);
        sb.append("|\n            |");
        sb.append(fArr[8]);
        sb.append(' ');
        sb.append(fArr[9]);
        sb.append(' ');
        sb.append(fArr[10]);
        sb.append(' ');
        sb.append(fArr[11]);
        sb.append("|\n            |");
        sb.append(fArr[12]);
        sb.append(' ');
        sb.append(fArr[13]);
        sb.append(' ');
        sb.append(fArr[14]);
        sb.append(' ');
        sb.append(fArr[15]);
        sb.append("|\n        ");
        return z6.a.q0(sb.toString());
    }
}
