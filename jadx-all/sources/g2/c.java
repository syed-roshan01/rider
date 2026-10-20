package g2;

import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, a2.a0 a0Var, d1.d dVar) {
        int iG;
        int iG2;
        if (dVar.f4332a < dVar.f4334c) {
            float f10 = dVar.f4333b;
            float f11 = dVar.f4335d;
            if (f10 < f11 && (iG = a0Var.g(f10)) <= (iG2 = a0Var.g(f11))) {
                while (true) {
                    builder.addVisibleLineBounds(a0Var.h(iG), a0Var.k(iG), a0Var.i(iG), a0Var.d(iG));
                    if (iG == iG2) {
                        break;
                    }
                    iG++;
                }
            }
        }
        return builder;
    }
}
