package y;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import b3.r1;
import b3.u1;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Runnable, b3.t, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WindowInsets f16544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f16546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u1 f16549f;

    public g0(j1 j1Var) {
        this.f16545b = !j1Var.f16602r ? 1 : 0;
        this.f16546c = j1Var;
    }

    public final u1 a(View view, u1 u1Var) {
        this.f16549f = u1Var;
        j1 j1Var = this.f16546c;
        j1Var.getClass();
        r1 r1Var = u1Var.f2683a;
        j1Var.f16600p.f(androidx.compose.foundation.layout.a.s(r1Var.f(8)));
        if (this.f16547d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f16548e) {
            j1Var.f16601q.f(androidx.compose.foundation.layout.a.s(r1Var.f(8)));
            j1.a(j1Var, u1Var);
        }
        return j1Var.f16602r ? u1.f2682b : u1Var;
    }

    public final void b(b3.g1 g1Var) {
        this.f16547d = false;
        this.f16548e = false;
        u1 u1Var = this.f16549f;
        if (g1Var.f2623a.a() != 0 && u1Var != null) {
            j1 j1Var = this.f16546c;
            j1Var.getClass();
            r1 r1Var = u1Var.f2683a;
            j1Var.f16601q.f(androidx.compose.foundation.layout.a.s(r1Var.f(8)));
            j1Var.f16600p.f(androidx.compose.foundation.layout.a.s(r1Var.f(8)));
            j1.a(j1Var, u1Var);
        }
        this.f16549f = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f16547d) {
            this.f16547d = false;
            this.f16548e = false;
            u1 u1Var = this.f16549f;
            if (u1Var != null) {
                j1 j1Var = this.f16546c;
                j1Var.getClass();
                j1Var.f16601q.f(androidx.compose.foundation.layout.a.s(u1Var.f2683a.f(8)));
                j1.a(j1Var, u1Var);
                this.f16549f = null;
            }
        }
    }
}
