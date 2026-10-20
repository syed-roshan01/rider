package o2;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class s extends a4.q {
    @Override // a4.q
    public final void l(View view, int i10, int i11) {
        view.setSystemGestureExclusionRects(d7.t.f0(new Rect(0, 0, i10, i11)));
    }
}
