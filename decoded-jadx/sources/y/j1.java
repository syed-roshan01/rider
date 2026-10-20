package y;

import android.os.Build;
import android.view.View;
import b3.r1;
import b3.u1;
import com.ride.accepter.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final WeakHashMap f16584u = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f16585a = c0.a(4, "captionBar");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f16586b = c0.a(128, "displayCutout");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f16587c = c0.a(8, "ime");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f16588d = c0.a(32, "mandatorySystemGestures");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f16589e = c0.a(2, "navigationBars");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f16590f = c0.a(1, "statusBars");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f16591g = c0.a(7, "systemBars");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f16592h = c0.a(16, "systemGestures");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f16593i = c0.a(64, "tappableElement");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g1 f16594j = new g1(new k0(0, 0, 0, 0), "waterfall");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g1 f16595k = c0.b(4, "captionBarIgnoringVisibility");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g1 f16596l = c0.b(2, "navigationBarsIgnoringVisibility");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g1 f16597m = c0.b(1, "statusBarsIgnoringVisibility");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g1 f16598n = c0.b(7, "systemBarsIgnoringVisibility");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g1 f16599o = c0.b(64, "tappableElementIgnoringVisibility");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g1 f16600p = c0.b(8, "imeAnimationTarget");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g1 f16601q = c0.b(8, "imeAnimationSource");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f16602r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g0 f16604t;

    public j1(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f16602r = bool != null ? bool.booleanValue() : true;
        this.f16604t = new g0(this);
    }

    public static void a(j1 j1Var, u1 u1Var) {
        j1Var.f16585a.f(u1Var, 0);
        j1Var.f16587c.f(u1Var, 0);
        j1Var.f16586b.f(u1Var, 0);
        j1Var.f16589e.f(u1Var, 0);
        j1Var.f16590f.f(u1Var, 0);
        j1Var.f16591g.f(u1Var, 0);
        j1Var.f16592h.f(u1Var, 0);
        j1Var.f16593i.f(u1Var, 0);
        j1Var.f16588d.f(u1Var, 0);
        j1Var.f16595k.f(androidx.compose.foundation.layout.a.s(u1Var.f2683a.g(4)));
        r1 r1Var = u1Var.f2683a;
        j1Var.f16596l.f(androidx.compose.foundation.layout.a.s(r1Var.g(2)));
        j1Var.f16597m.f(androidx.compose.foundation.layout.a.s(r1Var.g(1)));
        j1Var.f16598n.f(androidx.compose.foundation.layout.a.s(r1Var.g(7)));
        j1Var.f16599o.f(androidx.compose.foundation.layout.a.s(r1Var.g(64)));
        b3.f fVarE = r1Var.e();
        if (fVarE != null) {
            j1Var.f16594j.f(androidx.compose.foundation.layout.a.s(Build.VERSION.SDK_INT >= 30 ? u2.c.c(b3.e.b(fVarE.f2616a)) : u2.c.f15394e));
        }
        k0.y0.g();
    }
}
