package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1975a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f1976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1977c;

    public n0(o0 o0Var, e1 e1Var) {
        this.f1977c = o0Var;
        this.f1976b = e1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f1975a;
        Object obj = this.f1977c;
        switch (i10) {
            case 0:
                e1 e1Var = this.f1976b;
                d0 d0Var = e1Var.f1899c;
                e1Var.j();
                t1.g((ViewGroup) d0Var.mView.getParent(), ((o0) obj).f1986a).e();
                break;
            default:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                Field field = b3.q0.f2670a;
                b3.f0.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public n0(e1 e1Var, View view) {
        this.f1976b = e1Var;
        this.f1977c = view;
    }
}
