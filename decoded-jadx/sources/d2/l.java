package d2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class l extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4376b;

    public l(boolean z10, boolean z11) {
        this.f4375a = z10;
        this.f4376b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f4375a);
        textPaint.setStrikeThruText(this.f4376b);
    }
}
