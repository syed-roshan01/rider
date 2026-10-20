package l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b3 implements n, k.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f10713a;

    public /* synthetic */ b3(Toolbar toolbar) {
        this.f10713a = toolbar;
    }

    @Override // k.j
    public final boolean g(MenuItem menuItem) {
        this.f10713a.getClass();
        return false;
    }

    @Override // k.j
    public final void m(k.l lVar) {
        f fVar;
        Toolbar toolbar = this.f10713a;
        k kVar = toolbar.f1560a.f1505z;
        if (kVar == null || (fVar = kVar.f10818y) == null || !fVar.b()) {
            Iterator it = toolbar.N.f2645b.iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.r0) ((b3.o) it.next())).f2015a.o(lVar);
            }
        }
    }
}
