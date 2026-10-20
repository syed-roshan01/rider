package a4;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f1189a;

    public t(e0 e0Var) {
        new Rect();
        this.f1189a = e0Var;
    }

    public static s a(e0 e0Var, int i10) {
        if (i10 == 0) {
            return new s(e0Var, 0);
        }
        if (i10 == 1) {
            return new s(e0Var, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d();

    public abstract int e();

    public abstract int f();
}
