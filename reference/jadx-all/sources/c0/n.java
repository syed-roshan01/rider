package c0;

import android.graphics.Rect;
import android.view.View;
import r1.s;
import u1.y0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t1.m f2872a;

    public n(t1.m mVar) {
        this.f2872a = mVar;
    }

    @Override // c0.d
    public final Object x(s sVar, c9.a aVar, u8.e eVar) {
        View view = (View) t1.g.p(this.f2872a, y0.f15381f);
        long jP = sVar.P(d1.c.f4326b);
        d1.d dVar = (d1.d) aVar.invoke();
        d1.d dVarG = dVar != null ? dVar.g(jP) : null;
        if (dVarG != null) {
            view.requestRectangleOnScreen(new Rect((int) dVarG.f4332a, (int) dVarG.f4333b, (int) dVarG.f4334c, (int) dVarG.f4335d), false);
        }
        return q8.l.f13235a;
    }
}
