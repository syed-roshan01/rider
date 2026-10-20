package z5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public class l extends androidx.fragment.app.r {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Dialog f17262v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public DialogInterface.OnCancelListener f17263w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AlertDialog f17264x;

    @Override // androidx.fragment.app.r
    public final Dialog i() {
        Dialog dialog = this.f17262v;
        if (dialog != null) {
            return dialog;
        }
        this.f2006f = false;
        if (this.f17264x == null) {
            Context context = getContext();
            f6.a.x(context);
            this.f17264x = new AlertDialog.Builder(context).create();
        }
        return this.f17264x;
    }

    @Override // androidx.fragment.app.r, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f17263w;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
