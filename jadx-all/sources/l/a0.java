package l;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends t2.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WeakReference f10686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g0 f10687h;

    public a0(g0 g0Var, int i10, int i11, WeakReference weakReference) {
        this.f10687h = g0Var;
        this.f10684e = i10;
        this.f10685f = i11;
        this.f10686g = weakReference;
    }

    @Override // t2.b
    public final void e(Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f10684e) != -1) {
            typeface = f0.a(typeface, i10, (this.f10685f & 2) != 0);
        }
        g0 g0Var = this.f10687h;
        if (g0Var.f10751m) {
            g0Var.f10750l = typeface;
            TextView textView = (TextView) this.f10686g.get();
            if (textView != null) {
                Field field = b3.q0.f2670a;
                if (b3.e0.b(textView)) {
                    textView.post(new b0(g0Var, textView, typeface, g0Var.f10748j));
                } else {
                    textView.setTypeface(typeface, g0Var.f10748j);
                }
            }
        }
    }
}
