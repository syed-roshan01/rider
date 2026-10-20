package b3;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f2644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f2645b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f2646c = new HashMap();

    public m(Runnable runnable) {
        this.f2644a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.f2645b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.r0) ((o) it.next())).f2015a.l(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(o oVar) {
        this.f2645b.remove(oVar);
        l lVar = (l) this.f2646c.remove(oVar);
        if (lVar != null) {
            lVar.f2640a.c(lVar.f2641b);
            lVar.f2641b = null;
        }
        this.f2644a.run();
    }
}
