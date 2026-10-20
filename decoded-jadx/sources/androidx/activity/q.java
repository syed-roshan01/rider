package androidx.activity;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.inputmethod.EditorBoundsInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class q {
    public static /* synthetic */ LineBreakConfig.Builder e() {
        return new LineBreakConfig.Builder();
    }

    public static /* synthetic */ BoringLayout i(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f10, float f11, BoringLayout.Metrics metrics, boolean z10, TextUtils.TruncateAt truncateAt, int i11, boolean z11) {
        return new BoringLayout(charSequence, textPaint, i10, alignment, f10, f11, metrics, z10, truncateAt, i11, z11);
    }

    public static /* synthetic */ EditorBoundsInfo.Builder l() {
        return new EditorBoundsInfo.Builder();
    }
}
