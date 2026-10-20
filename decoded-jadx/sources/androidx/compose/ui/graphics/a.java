package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.os.Build;
import e1.f;
import e1.g;
import e1.g0;
import e1.i;
import e1.k;
import e1.l0;
import e1.o0;
import e1.p0;
import e1.r;
import e1.v;
import e1.x;
import e1.y;
import f1.c;
import f1.d;
import f1.e;
import f1.l;
import f1.m;
import f1.q;
import java.util.Iterator;
import java.util.List;
import o1.s;
import y0.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final long a(float f10, float f11, float f12, float f13, d dVar) {
        float fB = dVar.b(0);
        if (f10 <= dVar.a(0) && fB <= f10) {
            float fB2 = dVar.b(1);
            if (f11 <= dVar.a(1) && fB2 <= f11) {
                float fB3 = dVar.b(2);
                if (f12 <= dVar.a(2) && fB3 <= f12 && 0.0f <= f13 && f13 <= 1.0f) {
                    if (dVar.c()) {
                        long j10 = (((long) ((((((int) ((f10 * 255.0f) + 0.5f)) << 16) | (((int) ((f13 * 255.0f) + 0.5f)) << 24)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((f12 * 255.0f) + 0.5f)))) & 4294967295L) << 32;
                        int i10 = r.f5066h;
                        return j10;
                    }
                    int i11 = c.f6024e;
                    if (((int) (dVar.f6026b >> 32)) != 3) {
                        throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components".toString());
                    }
                    int i12 = dVar.f6027c;
                    if (i12 == -1) {
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces".toString());
                    }
                    long jA = ((((long) v.a(f11)) & 65535) << 32) | ((((long) v.a(f10)) & 65535) << 48) | ((((long) v.a(f12)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) i12) & 63);
                    int i13 = r.f5066h;
                    return jA;
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f10 + ", green = " + f11 + ", blue = " + f12 + ", alpha = " + f13 + " outside the range for " + dVar).toString());
    }

    public static final long b(int i10) {
        long j10 = ((long) i10) << 32;
        int i11 = r.f5066h;
        return j10;
    }

    public static final long c(long j10) {
        long j11 = (j10 & 4294967295L) << 32;
        int i10 = r.f5066h;
        return j11;
    }

    public static long d(int i10, int i11, int i12) {
        return b(((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255));
    }

    public static f e(int i10, int i11, int i12) {
        q qVar = e.f6030c;
        t(i12);
        return new f(k.b(i10, i11, i12, true, qVar));
    }

    public static final g f() {
        return new g(new Paint(7));
    }

    public static final i g() {
        return new i(new Path());
    }

    public static final float h(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    public static final Bitmap i(y yVar) {
        if (yVar instanceof f) {
            return ((f) yVar).f5003a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long j(long j10, long j11) {
        float f10;
        float f11;
        long jA = r.a(j10, r.f(j11));
        float fD = r.d(j11);
        float fD2 = r.d(jA);
        float f12 = 1.0f - fD2;
        float f13 = (fD * f12) + fD2;
        float fH = r.h(jA);
        float fH2 = r.h(j11);
        float f14 = 0.0f;
        if (f13 == 0.0f) {
            f10 = 0.0f;
        } else {
            f10 = (((fH2 * fD) * f12) + (fH * fD2)) / f13;
        }
        float fG = r.g(jA);
        float fG2 = r.g(j11);
        if (f13 == 0.0f) {
            f11 = 0.0f;
        } else {
            f11 = (((fG2 * fD) * f12) + (fG * fD2)) / f13;
        }
        float fE = r.e(jA);
        float fE2 = r.e(j11);
        if (f13 != 0.0f) {
            f14 = (((fE2 * fD) * f12) + (fE * fD2)) / f13;
        }
        return a(f10, f11, f14, f13, r.f(j11));
    }

    public static o k(o oVar, float f10, float f11, float f12, float f13, l0 l0Var, boolean z10, int i10) {
        return oVar.j(new GraphicsLayerElement((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1.0f : f11, (i10 & 4) != 0 ? 1.0f : f12, 0.0f, 0.0f, (i10 & 32) != 0 ? 0.0f : f13, 0.0f, 0.0f, 0.0f, (i10 & 512) != 0 ? 8.0f : 0.0f, (i10 & 1024) != 0 ? p0.f5055b : 0L, (i10 & 2048) != 0 ? g0.f5008a : l0Var, (i10 & 4096) != 0 ? false : z10, (i10 & 16384) != 0 ? x.f5074a : 0L, (i10 & 32768) != 0 ? x.f5074a : 0L, 0));
    }

    public static final long l(long j10, long j11, float f10) {
        l lVar = e.f6047t;
        long jA = r.a(j10, lVar);
        long jA2 = r.a(j11, lVar);
        float fD = r.d(jA);
        float fH = r.h(jA);
        float fG = r.g(jA);
        float fE = r.e(jA);
        float fD2 = r.d(jA2);
        float fH2 = r.h(jA2);
        float fG2 = r.g(jA2);
        float fE2 = r.e(jA2);
        return r.a(a(s.W(fH, fH2, f10), s.W(fG, fG2, f10), s.W(fE, fE2, f10), s.W(fD, fD2, f10), lVar), r.f(j11));
    }

    public static final float m(long j10) {
        d dVarF = r.f(j10);
        if (!c.a(dVarF.f6026b, c.f6020a)) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) c.b(dVarF.f6026b))).toString());
        }
        double dH = r.h(j10);
        m mVar = ((q) dVarF).f6089p;
        double dB = mVar.b(dH);
        float fB = (float) ((mVar.b(r.e(j10)) * 0.0722d) + (mVar.b(r.g(j10)) * 0.7152d) + (dB * 0.2126d));
        float f10 = 0.0f;
        if (fB > 0.0f) {
            f10 = 1.0f;
            if (fB < 1.0f) {
                return fB;
            }
        }
        return f10;
    }

    public static final float[] n(List list, List list2) {
        if (list == null) {
            return null;
        }
        List list3 = list;
        float[] fArr = new float[list3.size()];
        Iterator it = list3.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = ((Number) it.next()).floatValue();
            i10++;
        }
        return fArr;
    }

    public static final void o(Matrix matrix, float[] fArr) {
        float f10 = fArr[2];
        if (f10 == 0.0f) {
            float f11 = fArr[6];
            if (f11 == 0.0f && fArr[10] == 1.0f && fArr[14] == 0.0f) {
                float f12 = fArr[8];
                if (f12 == 0.0f && fArr[9] == 0.0f && fArr[11] == 0.0f) {
                    float f13 = fArr[0];
                    float f14 = fArr[1];
                    float f15 = fArr[3];
                    float f16 = fArr[4];
                    float f17 = fArr[5];
                    float f18 = fArr[7];
                    float f19 = fArr[12];
                    float f20 = fArr[13];
                    float f21 = fArr[15];
                    fArr[0] = f13;
                    fArr[1] = f16;
                    fArr[2] = f19;
                    fArr[3] = f14;
                    fArr[4] = f17;
                    fArr[5] = f20;
                    fArr[6] = f15;
                    fArr[7] = f18;
                    fArr[8] = f21;
                    matrix.setValues(fArr);
                    fArr[0] = f13;
                    fArr[1] = f14;
                    fArr[2] = f10;
                    fArr[3] = f15;
                    fArr[4] = f16;
                    fArr[5] = f17;
                    fArr[6] = f11;
                    fArr[7] = f18;
                    fArr[8] = f12;
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Android does not support arbitrary transforms".toString());
    }

    public static final void p(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        fArr[0] = f10;
        fArr[1] = f13;
        fArr[2] = 0.0f;
        fArr[3] = f16;
        fArr[4] = f11;
        fArr[5] = f14;
        fArr[6] = 0.0f;
        fArr[7] = f17;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f12;
        fArr[13] = f15;
        fArr[14] = 0.0f;
        fArr[15] = f18;
    }

    public static final BlendMode q(int i10) {
        if (g0.b(i10, 0)) {
            return BlendMode.CLEAR;
        }
        if (g0.b(i10, 1)) {
            return BlendMode.SRC;
        }
        if (g0.b(i10, 2)) {
            return BlendMode.DST;
        }
        if (g0.b(i10, 3)) {
            return BlendMode.SRC_OVER;
        }
        if (g0.b(i10, 4)) {
            return BlendMode.DST_OVER;
        }
        if (g0.b(i10, 5)) {
            return BlendMode.SRC_IN;
        }
        if (g0.b(i10, 6)) {
            return BlendMode.DST_IN;
        }
        if (g0.b(i10, 7)) {
            return BlendMode.SRC_OUT;
        }
        if (g0.b(i10, 8)) {
            return BlendMode.DST_OUT;
        }
        if (g0.b(i10, 9)) {
            return BlendMode.SRC_ATOP;
        }
        if (g0.b(i10, 10)) {
            return BlendMode.DST_ATOP;
        }
        if (g0.b(i10, 11)) {
            return BlendMode.XOR;
        }
        if (g0.b(i10, 12)) {
            return BlendMode.PLUS;
        }
        if (g0.b(i10, 13)) {
            return BlendMode.MODULATE;
        }
        if (g0.b(i10, 14)) {
            return BlendMode.SCREEN;
        }
        if (g0.b(i10, 15)) {
            return BlendMode.OVERLAY;
        }
        if (g0.b(i10, 16)) {
            return BlendMode.DARKEN;
        }
        if (g0.b(i10, 17)) {
            return BlendMode.LIGHTEN;
        }
        if (g0.b(i10, 18)) {
            return BlendMode.COLOR_DODGE;
        }
        if (g0.b(i10, 19)) {
            return BlendMode.COLOR_BURN;
        }
        if (g0.b(i10, 20)) {
            return BlendMode.HARD_LIGHT;
        }
        if (g0.b(i10, 21)) {
            return BlendMode.SOFT_LIGHT;
        }
        if (g0.b(i10, 22)) {
            return BlendMode.DIFFERENCE;
        }
        if (g0.b(i10, 23)) {
            return BlendMode.EXCLUSION;
        }
        if (g0.b(i10, 24)) {
            return BlendMode.MULTIPLY;
        }
        if (g0.b(i10, 25)) {
            return BlendMode.HUE;
        }
        if (g0.b(i10, 26)) {
            return BlendMode.SATURATION;
        }
        if (g0.b(i10, 27)) {
            return BlendMode.COLOR;
        }
        return g0.b(i10, 28) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final Shader.TileMode r(int i10) {
        if (g0.h(i10, 0)) {
            return Shader.TileMode.CLAMP;
        }
        if (g0.h(i10, 1)) {
            return Shader.TileMode.REPEAT;
        }
        if (g0.h(i10, 2)) {
            return Shader.TileMode.MIRROR;
        }
        if (g0.h(i10, 3) && Build.VERSION.SDK_INT >= 31) {
            return o0.f5054a.b();
        }
        return Shader.TileMode.CLAMP;
    }

    public static final int s(long j10) {
        float[] fArr = e.f6028a;
        return (int) (r.a(j10, e.f6030c) >>> 32);
    }

    public static final Bitmap.Config t(int i10) {
        if (g0.e(i10, 0)) {
            return Bitmap.Config.ARGB_8888;
        }
        if (g0.e(i10, 1)) {
            return Bitmap.Config.ALPHA_8;
        }
        if (g0.e(i10, 2)) {
            return Bitmap.Config.RGB_565;
        }
        if (g0.e(i10, 3)) {
            return Bitmap.Config.RGBA_F16;
        }
        return g0.e(i10, 4) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final PorterDuff.Mode u(int i10) {
        if (g0.b(i10, 0)) {
            return PorterDuff.Mode.CLEAR;
        }
        if (g0.b(i10, 1)) {
            return PorterDuff.Mode.SRC;
        }
        if (g0.b(i10, 2)) {
            return PorterDuff.Mode.DST;
        }
        if (g0.b(i10, 3)) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (g0.b(i10, 4)) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (g0.b(i10, 5)) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (g0.b(i10, 6)) {
            return PorterDuff.Mode.DST_IN;
        }
        if (g0.b(i10, 7)) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (g0.b(i10, 8)) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (g0.b(i10, 9)) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (g0.b(i10, 10)) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (g0.b(i10, 11)) {
            return PorterDuff.Mode.XOR;
        }
        if (g0.b(i10, 12)) {
            return PorterDuff.Mode.ADD;
        }
        if (g0.b(i10, 14)) {
            return PorterDuff.Mode.SCREEN;
        }
        if (g0.b(i10, 15)) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (g0.b(i10, 16)) {
            return PorterDuff.Mode.DARKEN;
        }
        if (g0.b(i10, 17)) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return g0.b(i10, 13) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static final void v(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
