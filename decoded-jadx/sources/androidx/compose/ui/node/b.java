package androidx.compose.ui.node;

import d9.i;
import t1.y0;
import y0.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f1755a;

    static {
        y0 y0Var = new y0();
        y0Var.f16733d = -1;
        f1755a = y0Var;
    }

    public static final int a(m mVar, m mVar2) {
        if (d7.a.d(mVar, mVar2)) {
            return 2;
        }
        return (i.l(mVar, mVar2) || ((mVar instanceof ForceUpdateElement) && i.l(((ForceUpdateElement) mVar).f1735b, mVar2))) ? 1 : 0;
    }
}
