package e3;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b3.c {
    @Override // b3.c
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        c3.l.c(accessibilityEvent, nestedScrollView.getScrollX());
        c3.l.d(accessibilityEvent, nestedScrollView.getScrollRange());
    }

    @Override // b3.c
    public final void g(View view, c3.k kVar) {
        int scrollRange;
        View.AccessibilityDelegate accessibilityDelegate = this.f2606a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2942a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        kVar.g(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        accessibilityNodeInfo.setScrollable(true);
        if (nestedScrollView.getScrollY() > 0) {
            kVar.b(c3.e.f2934f);
            kVar.b(c3.e.f2935g);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            kVar.b(c3.e.f2933e);
            kVar.b(c3.e.f2937i);
        }
    }

    @Override // b3.c
    public final boolean h(View view, int i10, Bundle bundle) {
        if (super.h(view, i10, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i10 != 4096) {
            if (i10 == 8192 || i10 == 16908344) {
                int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (iMax == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.t(true, 0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY());
                return true;
            }
            if (i10 != 16908346) {
                return false;
            }
        }
        int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
        if (iMin == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.t(true, 0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY());
        return true;
    }
}
