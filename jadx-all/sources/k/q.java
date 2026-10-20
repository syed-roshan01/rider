package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import b3.c0;
import b3.q0;
import com.ride.accepter.R;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f8677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f8681f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r f8684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n f8685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f8686k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8682g = 8388611;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f8687l = new o(this);

    public q(int i10, int i11, Context context, View view, l lVar, boolean z10) {
        this.f8676a = context;
        this.f8677b = lVar;
        this.f8681f = view;
        this.f8678c = z10;
        this.f8679d = i10;
        this.f8680e = i11;
    }

    public final n a() {
        n vVar;
        if (this.f8685j == null) {
            Context context = this.f8676a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            p.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                vVar = new h(this.f8676a, this.f8681f, this.f8679d, this.f8680e, this.f8678c);
            } else {
                Context context2 = this.f8676a;
                l lVar = this.f8677b;
                vVar = new v(this.f8679d, this.f8680e, context2, this.f8681f, lVar, this.f8678c);
            }
            vVar.l(this.f8677b);
            vVar.r(this.f8687l);
            vVar.n(this.f8681f);
            vVar.h(this.f8684i);
            vVar.o(this.f8683h);
            vVar.p(this.f8682g);
            this.f8685j = vVar;
        }
        return this.f8685j;
    }

    public final boolean b() {
        n nVar = this.f8685j;
        return nVar != null && nVar.k();
    }

    public void c() {
        this.f8685j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f8686k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        n nVarA = a();
        nVarA.s(z11);
        if (z10) {
            int i12 = this.f8682g;
            View view = this.f8681f;
            Field field = q0.f2670a;
            if ((Gravity.getAbsoluteGravity(i12, c0.d(view)) & 7) == 5) {
                i10 -= this.f8681f.getWidth();
            }
            nVarA.q(i10);
            nVarA.t(i11);
            int i13 = (int) ((this.f8676a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            nVarA.f8674a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        nVarA.e();
    }
}
