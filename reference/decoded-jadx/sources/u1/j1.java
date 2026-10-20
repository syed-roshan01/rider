package u1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f15119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f15120b;

    public j1(Context context) {
        super(context);
        setClipChildren(false);
        this.f15119a = new HashMap();
        this.f15120b = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<Object, androidx.compose.ui.node.a> getHolderToLayoutNode() {
        return this.f15119a;
    }

    public final HashMap<androidx.compose.ui.node.a, Object> getLayoutNodeToHolder() {
        return this.f15120b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Iterator it = this.f15119a.keySet().iterator();
        if (it.hasNext()) {
            a7.a.w(it.next());
            throw null;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalArgumentException("widthMeasureSpec should be EXACTLY".toString());
        }
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            throw new IllegalArgumentException("heightMeasureSpec should be EXACTLY".toString());
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        Iterator it = this.f15119a.keySet().iterator();
        if (it.hasNext()) {
            a7.a.w(it.next());
            throw null;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) this.f15119a.get(childAt);
            if (childAt.isLayoutRequested() && aVar != null) {
                androidx.compose.ui.node.a.Q(aVar, false, 3);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
