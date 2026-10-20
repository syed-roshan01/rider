package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class o implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f1985a;

    public o(r rVar) {
        this.f1985a = rVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        r rVar = this.f1985a;
        Dialog dialog = rVar.f2010q;
        if (dialog != null) {
            rVar.onCancel(dialog);
        }
    }
}
