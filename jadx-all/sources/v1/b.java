package v1;

import android.R;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.a0;
import d1.d;
import u1.z0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.a f15883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f15884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c9.a f15885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c9.a f15886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c9.a f15887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c9.a f15888f;

    public b(z0 z0Var) {
        d dVar = d.f4331e;
        this.f15883a = z0Var;
        this.f15884b = dVar;
        this.f15885c = null;
        this.f15886d = null;
        this.f15887e = null;
        this.f15888f = null;
    }

    public static void a(Menu menu, int i10) {
        int i11;
        if (i10 == 0) {
            throw null;
        }
        int i12 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i12 == 0) {
            i11 = R.string.copy;
        } else if (i12 == 1) {
            i11 = R.string.paste;
        } else if (i12 == 2) {
            i11 = R.string.cut;
        } else {
            if (i12 != 3) {
                throw new a0();
            }
            i11 = R.string.selectAll;
        }
        if (i10 == 0) {
            throw null;
        }
        menu.add(0, i12, i12, i11).setShowAsAction(1);
    }

    public static void b(Menu menu, int i10, c9.a aVar) {
        if (aVar != null) {
            if (i10 == 0) {
                throw null;
            }
            if (menu.findItem(i10 - 1) == null) {
                a(menu, i10);
                return;
            }
        }
        if (aVar == null) {
            if (i10 == 0) {
                throw null;
            }
            int i11 = i10 - 1;
            if (menu.findItem(i11) != null) {
                if (i10 == 0) {
                    throw null;
                }
                menu.removeItem(i11);
            }
        }
    }

    public final boolean c(ActionMode actionMode, MenuItem menuItem) {
        d7.a.j(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            c9.a aVar = this.f15885c;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == 1) {
            c9.a aVar2 = this.f15886d;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == 2) {
            c9.a aVar3 = this.f15887e;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else {
            if (itemId != 3) {
                return false;
            }
            c9.a aVar4 = this.f15888f;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    public final void d(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu".toString());
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode".toString());
        }
        if (this.f15885c != null) {
            a(menu, 1);
        }
        if (this.f15886d != null) {
            a(menu, 2);
        }
        if (this.f15887e != null) {
            a(menu, 3);
        }
        if (this.f15888f != null) {
            a(menu, 4);
        }
    }

    public final boolean e(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        b(menu, 1, this.f15885c);
        b(menu, 2, this.f15886d);
        b(menu, 3, this.f15887e);
        b(menu, 4, this.f15888f);
        return true;
    }
}
