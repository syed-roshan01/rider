package androidx.compose.ui.draw;

import c9.c;
import e1.l0;
import r1.k;
import r1.l;
import y0.d;
import y0.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final o a(o oVar, float f10) {
        return f10 == 1.0f ? oVar : androidx.compose.ui.graphics.a.k(oVar, 0.0f, 0.0f, f10, 0.0f, null, true, 126971);
    }

    public static final o b(o oVar, l0 l0Var) {
        return androidx.compose.ui.graphics.a.k(oVar, 0.0f, 0.0f, 0.0f, 0.0f, l0Var, true, 124927);
    }

    public static final o c(o oVar) {
        return androidx.compose.ui.graphics.a.k(oVar, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 126975);
    }

    public static final o d(o oVar, c cVar) {
        return oVar.j(new DrawBehindElement(cVar));
    }

    public static final o e(o oVar, c cVar) {
        return oVar.j(new DrawWithCacheElement(cVar));
    }

    public static final o f(o oVar, c cVar) {
        return oVar.j(new DrawWithContentElement(cVar));
    }

    public static o g(o oVar, h1.c cVar, d dVar, l lVar, float f10, e1.l lVar2, int i10) {
        boolean z10 = (i10 & 2) != 0;
        if ((i10 & 4) != 0) {
            dVar = y0.a.f16710c;
        }
        d dVar2 = dVar;
        if ((i10 & 8) != 0) {
            lVar = k.f13394d;
        }
        l lVar3 = lVar;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 32) != 0) {
            lVar2 = null;
        }
        return oVar.j(new PainterElement(cVar, z10, dVar2, lVar3, f11, lVar2));
    }

    public static final o h(o oVar, float f10) {
        return (f10 == 1.0f && f10 == 1.0f) ? oVar : androidx.compose.ui.graphics.a.k(oVar, f10, f10, 0.0f, 0.0f, null, false, 131068);
    }
}
