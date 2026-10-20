package g2;

import android.graphics.RectF;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, d1.d dVar) {
        EditorBoundsInfo.Builder builderL = androidx.activity.q.l();
        float f10 = dVar.f4332a;
        float f11 = dVar.f4333b;
        float f12 = dVar.f4334c;
        float f13 = dVar.f4335d;
        return builder.setEditorBoundsInfo(builderL.setEditorBounds(new RectF(f10, f11, f12, f13)).setHandwritingBounds(new RectF(dVar.f4332a, f11, f12, f13)).build());
    }
}
