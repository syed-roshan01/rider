package b2;

import android.text.StaticLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final boolean a(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void b(StaticLayout.Builder builder, int i10, int i11) {
        builder.setLineBreakConfig(androidx.activity.q.e().setLineBreakStyle(i10).setLineBreakWordStyle(i11).build());
    }
}
