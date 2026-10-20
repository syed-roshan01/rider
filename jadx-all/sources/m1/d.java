package m1;

import android.view.KeyEvent;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
public final class d extends n implements c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c9.c f11787u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c9.c f11788v;

    @Override // m1.c
    public final boolean M(KeyEvent keyEvent) {
        c9.c cVar = this.f11787u;
        if (cVar != null) {
            return ((Boolean) cVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // m1.c
    public final boolean l(KeyEvent keyEvent) {
        c9.c cVar = this.f11788v;
        if (cVar != null) {
            return ((Boolean) cVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
