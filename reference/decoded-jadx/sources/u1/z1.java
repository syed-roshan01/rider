package u1;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.ride.accepter.R;

/* JADX INFO: loaded from: classes.dex */
public class z1 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15390a;

    public z1(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(e1.p pVar, View view, long j10) {
        super.drawChild(e1.e.a(pVar), view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            d7.a.k(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((b3) childAt).f15044o) {
                this.f15390a = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f15390a = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f15390a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }
}
