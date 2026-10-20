package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e3 implements k.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k.l f10731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k.m f10732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f10733c;

    public e3(Toolbar toolbar) {
        this.f10733c = toolbar;
    }

    @Override // k.s
    public final boolean a(k.m mVar) {
        Toolbar toolbar = this.f10733c;
        toolbar.c();
        ViewParent parent = toolbar.f1567o.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1567o);
            }
            toolbar.addView(toolbar.f1567o);
        }
        View view = mVar.f8673z;
        if (view == null) {
            view = null;
        }
        toolbar.f1568p = view;
        this.f10732b = mVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1568p);
            }
            f3 f3VarG = Toolbar.g();
            f3VarG.f6419a = (toolbar.f1573u & 112) | 8388611;
            f3VarG.f10737b = 2;
            toolbar.f1568p.setLayoutParams(f3VarG);
            toolbar.addView(toolbar.f1568p);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((f3) childAt.getLayoutParams()).f10737b != 2 && childAt != toolbar.f1560a) {
                toolbar.removeViewAt(childCount);
                toolbar.L.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.B = true;
        mVar.f8661n.o(false);
        KeyEvent.Callback callback = toolbar.f1568p;
        if (callback instanceof j.b) {
            SearchView searchView = (SearchView) ((j.b) callback);
            if (!searchView.f1524g0) {
                searchView.f1524g0 = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f1530w;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f1525h0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        toolbar.t();
        return true;
    }

    @Override // k.s
    public final boolean b(k.w wVar) {
        return false;
    }

    @Override // k.s
    public final void c(k.l lVar, boolean z10) {
    }

    @Override // k.s
    public final boolean d(k.m mVar) {
        Toolbar toolbar = this.f10733c;
        KeyEvent.Callback callback = toolbar.f1568p;
        if (callback instanceof j.b) {
            SearchView searchView = (SearchView) ((j.b) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f1530w;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f1523f0 = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f1525h0);
            searchView.f1524g0 = false;
        }
        toolbar.removeView(toolbar.f1568p);
        toolbar.removeView(toolbar.f1567o);
        toolbar.f1568p = null;
        ArrayList arrayList = toolbar.L;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f10732b = null;
        toolbar.requestLayout();
        mVar.B = false;
        mVar.f8661n.o(false);
        toolbar.t();
        return true;
    }

    @Override // k.s
    public final void f() {
        if (this.f10732b != null) {
            k.l lVar = this.f10731a;
            if (lVar != null) {
                int size = lVar.f8633f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f10731a.getItem(i10) == this.f10732b) {
                        return;
                    }
                }
            }
            d(this.f10732b);
        }
    }

    @Override // k.s
    public final void i(Context context, k.l lVar) {
        k.m mVar;
        k.l lVar2 = this.f10731a;
        if (lVar2 != null && (mVar = this.f10732b) != null) {
            lVar2.d(mVar);
        }
        this.f10731a = lVar;
    }

    @Override // k.s
    public final boolean j() {
        return false;
    }
}
