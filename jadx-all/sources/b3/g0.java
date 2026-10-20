package b3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u1 f2620a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f2622c;

    public g0(View view, t tVar) {
        this.f2621b = view;
        this.f2622c = tVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        u1 u1VarC = u1.c(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        t tVar = this.f2622c;
        if (i10 < 30) {
            h0.a(windowInsets, this.f2621b);
            if (u1VarC.equals(this.f2620a)) {
                return ((y.g0) tVar).a(view, u1VarC).b();
            }
        }
        this.f2620a = u1VarC;
        u1 u1VarA = ((y.g0) tVar).a(view, u1VarC);
        if (i10 >= 30) {
            return u1VarA.b();
        }
        Field field = q0.f2670a;
        f0.c(view);
        return u1VarA.b();
    }
}
