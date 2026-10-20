package l;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class m1 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f10842a;

    public m1(o1 o1Var) {
        this.f10842a = o1Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        if (i10 == 1) {
            o1 o1Var = this.f10842a;
            if (o1Var.C.getInputMethodMode() == 2 || o1Var.C.getContentView() == null) {
                return;
            }
            Handler handler = o1Var.f10883y;
            h1 h1Var = o1Var.f10879u;
            handler.removeCallbacks(h1Var);
            h1Var.run();
        }
    }
}
