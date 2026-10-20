package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f1935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rect f1937c;

    public i(o1 o1Var, View view, Rect rect) {
        this.f1935a = o1Var;
        this.f1936b = view;
        this.f1937c = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1935a.getClass();
        o1.g(this.f1936b, this.f1937c);
    }
}
