package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class t1 extends b1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f10936t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f10937u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p1 f10938v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k.m f10939w;

    public t1(Context context, boolean z10) {
        super(context, z10);
        if (1 == s1.a(context.getResources().getConfiguration())) {
            this.f10936t = 21;
            this.f10937u = 22;
        } else {
            this.f10936t = 22;
            this.f10937u = 21;
        }
    }

    @Override // l.b1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        k.i iVar;
        int headersCount;
        int iPointToPosition;
        int i10;
        if (this.f10938v != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                iVar = (k.i) headerViewListAdapter.getWrappedAdapter();
            } else {
                iVar = (k.i) adapter;
                headersCount = 0;
            }
            k.m item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= iVar.getCount()) ? null : iVar.getItem(i10);
            k.m mVar = this.f10939w;
            if (mVar != item) {
                k.l lVar = iVar.f8621a;
                if (mVar != null) {
                    this.f10938v.f(lVar, mVar);
                }
                this.f10939w = item;
                if (item != null) {
                    this.f10938v.d(lVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.f10936t) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i10 != this.f10937u) {
            return super.onKeyDown(i10, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (k.i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (k.i) adapter).f8621a.c(false);
        return true;
    }

    public void setHoverListener(p1 p1Var) {
        this.f10938v = p1Var;
    }

    @Override // l.b1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
