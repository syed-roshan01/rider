package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class p implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f1987a;

    public p(r rVar) {
        this.f1987a = rVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        r rVar = this.f1987a;
        Dialog dialog = rVar.f2010q;
        if (dialog != null) {
            rVar.onDismiss(dialog);
        }
    }
}
