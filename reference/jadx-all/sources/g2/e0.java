package g2;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import u1.z0;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f6544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f6545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f6546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c9.c f6548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c9.c f6549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a0 f6550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o f6551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f6552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q8.c f6553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f6554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f6555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o0.i f6556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public androidx.activity.d f6557n;

    public e0(View view, o1.b0 b0Var) {
        q qVar = new q(view);
        final Choreographer choreographer = Choreographer.getInstance();
        Executor executor = new Executor() { // from class: g2.f0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                choreographer.postFrameCallback(new g0(runnable, 0));
            }
        };
        this.f6544a = view;
        this.f6545b = qVar;
        this.f6546c = executor;
        this.f6548e = d.f6521d;
        this.f6549f = d.f6522e;
        this.f6550g = new a0("", a2.b0.f903b, 4);
        this.f6551h = o.f6583f;
        this.f6552i = new ArrayList();
        q8.d[] dVarArr = q8.d.f13224a;
        this.f6553j = z6.a.R(new z0(this, 4));
        this.f6555l = new e(b0Var, qVar);
        this.f6556m = new o0.i(new c0[16]);
    }

    public final void a(c0 c0Var) {
        this.f6556m.c(c0Var);
        if (this.f6557n == null) {
            androidx.activity.d dVar = new androidx.activity.d(this, 7);
            this.f6546c.execute(dVar);
            this.f6557n = dVar;
        }
    }
}
