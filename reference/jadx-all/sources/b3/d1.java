package b3;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y.g0 f2611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f2612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f2613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f2614d;

    public d1(y.g0 g0Var) {
        super(g0Var.f16545b);
        this.f2614d = new HashMap();
        this.f2611a = g0Var;
    }

    public final g1 a(WindowInsetsAnimation windowInsetsAnimation) {
        g1 g1Var = (g1) this.f2614d.get(windowInsetsAnimation);
        if (g1Var == null) {
            g1Var = new g1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                g1Var.f2623a = new e1(windowInsetsAnimation);
            }
            this.f2614d.put(windowInsetsAnimation, g1Var);
        }
        return g1Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f2611a.b(a(windowInsetsAnimation));
        this.f2614d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        y.g0 g0Var = this.f2611a;
        a(windowInsetsAnimation);
        g0Var.f16547d = true;
        g0Var.f16548e = true;
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f2613c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f2613c = arrayList2;
            this.f2612b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationI = b2.t.i(list.get(size));
            g1 g1VarA = a(windowInsetsAnimationI);
            g1VarA.f2623a.c(windowInsetsAnimationI.getFraction());
            this.f2613c.add(g1VarA);
        }
        y.g0 g0Var = this.f2611a;
        u1 u1VarC = u1.c(null, windowInsets);
        y.j1 j1Var = g0Var.f16546c;
        y.j1.a(j1Var, u1VarC);
        if (j1Var.f16602r) {
            u1VarC = u1.f2682b;
        }
        return u1VarC.b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        y.g0 g0Var = this.f2611a;
        a(windowInsetsAnimation);
        u2.c cVarC = u2.c.c(bounds.getLowerBound());
        u2.c cVarC2 = u2.c.c(bounds.getUpperBound());
        g0Var.f16547d = false;
        b2.t.k();
        return b2.t.g(cVarC.d(), cVarC2.d());
    }
}
