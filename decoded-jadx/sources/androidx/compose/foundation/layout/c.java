package androidx.compose.foundation.layout;

import k0.k3;
import s.i;
import y0.f;
import y0.g;
import y0.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FillElement f1667a = new FillElement(2, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FillElement f1668b = new FillElement(3, 1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WrapContentElement f1669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final WrapContentElement f1670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final WrapContentElement f1671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final WrapContentElement f1672f;

    static {
        int i10 = 2;
        f fVar = y0.a.f16714n;
        int i11 = 1;
        f1669c = new WrapContentElement(1, false, new i(fVar, i11), fVar);
        f fVar2 = y0.a.f16713f;
        f1670d = new WrapContentElement(1, false, new i(fVar2, i11), fVar2);
        g gVar = y0.a.f16710c;
        f1671e = new WrapContentElement(3, false, new i(gVar, i10), gVar);
        g gVar2 = y0.a.f16708a;
        f1672f = new WrapContentElement(3, false, new i(gVar2, i10), gVar2);
    }

    public static final o a(o oVar, float f10, float f11) {
        return oVar.j(new UnspecifiedConstraintsElement(f10, f11));
    }

    public static o b(o oVar) {
        return oVar.j(f1667a);
    }

    public static final o c(o oVar, float f10) {
        return oVar.j(new SizeElement(0.0f, f10, 0.0f, f10, 5));
    }

    public static final o d(o oVar, float f10, float f11) {
        return oVar.j(new SizeElement(0.0f, f10, 0.0f, f11, 5));
    }

    public static /* synthetic */ o e(o oVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f11 = Float.NaN;
        }
        return d(oVar, f10, f11);
    }

    public static final o f(o oVar, float f10) {
        return oVar.j(new SizeElement(f10, f10, f10, f10, false));
    }

    public static final o g(o oVar, float f10, float f11) {
        return oVar.j(new SizeElement(f10, f11, f10, f11, false));
    }

    public static final o h(o oVar, float f10) {
        return oVar.j(new SizeElement(f10, f10, f10, f10, true));
    }

    public static final o i(o oVar, float f10, float f11) {
        return oVar.j(new SizeElement(f10, f11, f10, f11, true));
    }

    public static o j(o oVar) {
        return oVar.j(new SizeElement(k0.i.f8991a, Float.NaN, k0.i.f8992b, Float.NaN, true));
    }

    public static final o k(o oVar, float f10) {
        return oVar.j(new SizeElement(f10, 0.0f, f10, 0.0f, 10));
    }

    public static o l() {
        return new SizeElement(Float.NaN, 0.0f, k3.f9111a, 0.0f, 10);
    }

    public static o m(o oVar) {
        WrapContentElement wrapContentElement;
        f fVar = y0.a.f16714n;
        if (d7.a.d(fVar, fVar)) {
            wrapContentElement = f1669c;
        } else {
            wrapContentElement = d7.a.d(fVar, y0.a.f16713f) ? f1670d : new WrapContentElement(1, false, new i(fVar, 1), fVar);
        }
        return oVar.j(wrapContentElement);
    }

    public static o n(o oVar, g gVar) {
        WrapContentElement wrapContentElement;
        if (d7.a.d(gVar, y0.a.f16710c)) {
            wrapContentElement = f1671e;
        } else {
            wrapContentElement = d7.a.d(gVar, y0.a.f16708a) ? f1672f : new WrapContentElement(3, false, new i(gVar, 2), gVar);
        }
        return oVar.j(wrapContentElement);
    }
}
