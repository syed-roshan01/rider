package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.k;
import k.m;
import l.z2;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements k, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f1444a = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        z2 z2Var = new z2(0, context, context.obtainStyledAttributes(attributeSet, f1444a, R.attr.listViewStyle, 0));
        if (z2Var.D(0)) {
            setBackgroundDrawable(z2Var.t(0));
        }
        if (z2Var.D(1)) {
            setDivider(z2Var.t(1));
        }
        z2Var.K();
    }

    @Override // k.k
    public final boolean a(m mVar) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        throw null;
    }
}
