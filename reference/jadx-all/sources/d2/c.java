package d2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import b2.u;
import b2.w;
import o1.s;

/* JADX INFO: loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i15)) != layout.getLineCount() - 1) {
            return;
        }
        u uVar = w.f2590a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float F = s.F(layout, lineForOffset, paint) + s.E(layout, lineForOffset, paint);
            if (F == 0.0f) {
                return;
            }
            d7.a.j(canvas);
            canvas.translate(F, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return 0;
    }
}
