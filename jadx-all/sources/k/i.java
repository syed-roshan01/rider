package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f8621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8622b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f8625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8626f;

    public i(l lVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f8624d = z10;
        this.f8625e = layoutInflater;
        this.f8621a = lVar;
        this.f8626f = i10;
        a();
    }

    public final void a() {
        l lVar = this.f8621a;
        m mVar = lVar.f8646s;
        if (mVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f8637j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((m) arrayList.get(i10)) == mVar) {
                    this.f8622b = i10;
                    return;
                }
            }
        }
        this.f8622b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i10) {
        ArrayList arrayListK;
        boolean z10 = this.f8624d;
        l lVar = this.f8621a;
        if (z10) {
            lVar.i();
            arrayListK = lVar.f8637j;
        } else {
            arrayListK = lVar.k();
        }
        int i11 = this.f8622b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (m) arrayListK.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListK;
        boolean z10 = this.f8624d;
        l lVar = this.f8621a;
        if (z10) {
            lVar.i();
            arrayListK = lVar.f8637j;
        } else {
            arrayListK = lVar.k();
        }
        return this.f8622b < 0 ? arrayListK.size() : arrayListK.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.f8625e.inflate(this.f8626f, viewGroup, false);
        }
        int i11 = getItem(i10).f8649b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f8649b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f8621a.l() && i11 != i13) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        t tVar = (t) view;
        if (this.f8623c) {
            listMenuItemView.setForceShowIcon(true);
        }
        tVar.a(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
