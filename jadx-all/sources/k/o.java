package k;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class o implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f8675a;

    public o(q qVar) {
        this.f8675a = qVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f8675a.c();
    }
}
