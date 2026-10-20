package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f1971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f1973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f1974d;

    public m0(g0 g0Var) {
        Handler handler = new Handler();
        this.f1974d = new y0();
        this.f1971a = g0Var;
        this.f1972b = g0Var;
        this.f1973c = handler;
    }
}
