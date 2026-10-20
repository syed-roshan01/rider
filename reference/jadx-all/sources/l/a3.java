package l;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f10691b;

    public /* synthetic */ a3(Toolbar toolbar, int i10) {
        this.f10690a = i10;
        this.f10691b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f10690a;
        Toolbar toolbar = this.f10691b;
        switch (i10) {
            case 0:
                toolbar.m();
                break;
            default:
                e3 e3Var = toolbar.R;
                k.m mVar = e3Var == null ? null : e3Var.f10732b;
                if (mVar != null) {
                    mVar.collapseActionView();
                }
                break;
        }
    }
}
