package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f10715b;

    public /* synthetic */ c(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f10714a = i10;
        this.f10715b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f10714a;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f10715b;
        switch (i10) {
            case 0:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.A = actionBarOverlayLayout.f1485c.animate().translationY(0.0f).setListener(actionBarOverlayLayout.B);
                break;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.A = actionBarOverlayLayout.f1485c.animate().translationY(-actionBarOverlayLayout.f1485c.getHeight()).setListener(actionBarOverlayLayout.B);
                break;
        }
    }
}
