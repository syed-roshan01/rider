package u1;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class x1 implements x2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class[] f15369b = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean l(Object obj) {
        if (obj instanceof w0.s) {
            w0.s sVar = (w0.s) obj;
            if (sVar.a() != m0.h1.f11552a && sVar.a() != m0.o3.f11621a && sVar.a() != m0.h2.f11553a) {
                return false;
            }
            Object value = sVar.getValue();
            if (value == null) {
                return true;
            }
            return l(value);
        }
        if ((obj instanceof q8.a) && (obj instanceof Serializable)) {
            return false;
        }
        Class[] clsArr = f15369b;
        for (int i10 = 0; i10 < 7; i10++) {
            if (clsArr[i10].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public static final float m(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    public static f2.l n() {
        return f2.l.f6118f;
    }

    public static f2.l o() {
        return f2.l.f6119n;
    }

    public static f2.l p() {
        return f2.l.f6117e;
    }

    public static final y0.o q(y0.o oVar, y0.o oVar2) {
        e2 e2Var = new e2();
        return oVar.j(e2Var).j(oVar2).j(e2Var.f15084c);
    }

    public static boolean r(int i10) {
        int type = Character.getType(i10);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final void s(float[] fArr, float[] fArr2) {
        float fM = m(fArr2, 0, fArr, 0);
        float fM2 = m(fArr2, 0, fArr, 1);
        float fM3 = m(fArr2, 0, fArr, 2);
        float fM4 = m(fArr2, 0, fArr, 3);
        float fM5 = m(fArr2, 1, fArr, 0);
        float fM6 = m(fArr2, 1, fArr, 1);
        float fM7 = m(fArr2, 1, fArr, 2);
        float fM8 = m(fArr2, 1, fArr, 3);
        float fM9 = m(fArr2, 2, fArr, 0);
        float fM10 = m(fArr2, 2, fArr, 1);
        float fM11 = m(fArr2, 2, fArr, 2);
        float fM12 = m(fArr2, 2, fArr, 3);
        float fM13 = m(fArr2, 3, fArr, 0);
        float fM14 = m(fArr2, 3, fArr, 1);
        float fM15 = m(fArr2, 3, fArr, 2);
        float fM16 = m(fArr2, 3, fArr, 3);
        fArr[0] = fM;
        fArr[1] = fM2;
        fArr[2] = fM3;
        fArr[3] = fM4;
        fArr[4] = fM5;
        fArr[5] = fM6;
        fArr[6] = fM7;
        fArr[7] = fM8;
        fArr[8] = fM9;
        fArr[9] = fM10;
        fArr[10] = fM11;
        fArr[11] = fM12;
        fArr[12] = fM13;
        fArr[13] = fM14;
        fArr[14] = fM15;
        fArr[15] = fM16;
    }
}
