package z2;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import b2.l;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f17195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f17196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17198d;

    public b(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            l.j(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
        }
        this.f17195a = textPaint;
        this.f17196b = textDirectionHeuristic;
        this.f17197c = i10;
        this.f17198d = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f17197c == bVar.f17197c && this.f17198d == bVar.f17198d) {
            TextPaint textPaint = this.f17195a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = bVar.f17195a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f17196b == bVar.f17196b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f17195a;
        return a3.b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f17196b, Integer.valueOf(this.f17197c), Integer.valueOf(this.f17198d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f17195a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f17196b);
        sb.append(", breakStrategy=" + this.f17197c);
        sb.append(", hyphenationFrequency=" + this.f17198d);
        sb.append("}");
        return sb.toString();
    }

    public b(PrecomputedText.Params params) {
        this.f17195a = params.getTextPaint();
        this.f17196b = params.getTextDirection();
        this.f17197c = params.getBreakStrategy();
        this.f17198d = params.getHyphenationFrequency();
    }
}
