package androidx.activity;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1368b;

    public /* synthetic */ b0(Object obj, int i10) {
        this.f1367a = i10;
        this.f1368b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1367a) {
            case 0:
                c9.a aVar = (c9.a) this.f1368b;
                d7.a.m(aVar, "$onBackInvoked");
                aVar.invoke();
                break;
            default:
                ((Runnable) this.f1368b).run();
                break;
        }
    }
}
