package l;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends n0 {
    @Override // l.n0, l.p0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // l.p0
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
