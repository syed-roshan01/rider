package u1;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p implements ViewTranslationCallback {
    public final boolean onClearTranslation(View view) {
        c9.a aVar;
        d7.a.k(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        p0 p0Var = ((w) view).f15345t;
        p0Var.W = 1;
        Iterator it = p0Var.r().values().iterator();
        while (it.hasNext()) {
            y1.j jVar = ((s2) it.next()).f15289a.f16798d;
            if (o1.s.J(jVar, y1.r.f16838w) != null) {
                Object obj = jVar.f16786a.get(y1.i.f16771k);
                if (obj == null) {
                    obj = null;
                }
                y1.a aVar2 = (y1.a) obj;
                if (aVar2 != null && (aVar = (c9.a) aVar2.f16746b) != null) {
                }
            }
        }
        return true;
    }

    public final boolean onHideTranslation(View view) {
        c9.c cVar;
        d7.a.k(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        p0 p0Var = ((w) view).f15345t;
        p0Var.W = 1;
        Iterator it = p0Var.r().values().iterator();
        while (it.hasNext()) {
            y1.j jVar = ((s2) it.next()).f15289a.f16798d;
            if (d7.a.d(o1.s.J(jVar, y1.r.f16838w), Boolean.TRUE)) {
                Object obj = jVar.f16786a.get(y1.i.f16770j);
                if (obj == null) {
                    obj = null;
                }
                y1.a aVar = (y1.a) obj;
                if (aVar != null && (cVar = (c9.c) aVar.f16746b) != null) {
                }
            }
        }
        return true;
    }

    public final boolean onShowTranslation(View view) {
        c9.c cVar;
        d7.a.k(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        p0 p0Var = ((w) view).f15345t;
        p0Var.W = 2;
        Iterator it = p0Var.r().values().iterator();
        while (it.hasNext()) {
            y1.j jVar = ((s2) it.next()).f15289a.f16798d;
            if (d7.a.d(o1.s.J(jVar, y1.r.f16838w), Boolean.FALSE)) {
                Object obj = jVar.f16786a.get(y1.i.f16770j);
                if (obj == null) {
                    obj = null;
                }
                y1.a aVar = (y1.a) obj;
                if (aVar != null && (cVar = (c9.c) aVar.f16746b) != null) {
                }
            }
        }
        return true;
    }
}
