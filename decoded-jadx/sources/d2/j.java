package d2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4373d;

    public j(float f10, float f11, float f12, int i10) {
        this.f4370a = i10;
        this.f4371b = f10;
        this.f4372c = f11;
        this.f4373d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f4373d, this.f4371b, this.f4372c, this.f4370a);
    }
}
