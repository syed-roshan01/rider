package androidx.activity;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f1405a;

    public k(p pVar) {
        this.f1405a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (IllegalStateException e4) {
            if (!TextUtils.equals(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e4;
            }
        } catch (NullPointerException e10) {
            if (!TextUtils.equals(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e10;
            }
        }
    }
}
