package k;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.contentcapture.ContentCaptureSession;
import b3.u0;
import com.ride.accepter.R;
import m9.f1;
import u1.p0;
import u1.x3;

/* JADX INFO: loaded from: classes.dex */
public final class d implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8592b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f8591a = i10;
        this.f8592b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ContentCaptureSession contentCaptureSessionA;
        switch (this.f8591a) {
            case 2:
                p0 p0Var = (p0) this.f8592b;
                AccessibilityManager accessibilityManager = p0Var.f15198n;
                accessibilityManager.addAccessibilityStateChangeListener(p0Var.f15199o);
                accessibilityManager.addTouchExplorationStateChangeListener(p0Var.f15200p);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    w1.f.a(view, 1);
                }
                l.t tVar = null;
                if (i10 >= 29 && (contentCaptureSessionA = w1.e.a(view)) != null) {
                    tVar = new l.t(5, contentCaptureSessionA, view);
                }
                p0Var.F = tVar;
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i10 = this.f8591a;
        Object obj = this.f8592b;
        switch (i10) {
            case 0:
                h hVar = (h) obj;
                ViewTreeObserver viewTreeObserver = hVar.F;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        hVar.F = view.getViewTreeObserver();
                    }
                    hVar.F.removeGlobalOnLayoutListener(hVar.f8611q);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                v vVar = (v) obj;
                ViewTreeObserver viewTreeObserver2 = vVar.f8702w;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        vVar.f8702w = view.getViewTreeObserver();
                    }
                    vVar.f8702w.removeGlobalOnLayoutListener(vVar.f8696q);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                p0 p0Var = (p0) obj;
                p0Var.f15202r.removeCallbacks(p0Var.T);
                AccessibilityManager accessibilityManager = p0Var.f15198n;
                accessibilityManager.removeAccessibilityStateChangeListener(p0Var.f15199o);
                accessibilityManager.removeTouchExplorationStateChangeListener(p0Var.f15200p);
                p0Var.F = null;
                break;
            case 3:
                u1.a aVar = (u1.a) obj;
                d7.a.m(aVar, "<this>");
                for (Object obj2 : k9.l.F0(u0.f2681p, aVar.getParent())) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        d7.a.m(view2, "<this>");
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null && bool.booleanValue()) {
                            break;
                        }
                    }
                }
                x3 x3Var = aVar.f15015c;
                if (x3Var != null) {
                    x3Var.a();
                }
                aVar.f15015c = null;
                aVar.requestLayout();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((f1) obj).a(null);
                break;
        }
    }
}
