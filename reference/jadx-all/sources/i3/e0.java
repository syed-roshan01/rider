package i3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f7956b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextPaint f7959e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f7955a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public short f7957c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f7958d = 1.0f;

    public e0(d0 d0Var) {
        if (d0Var == null) {
            throw new NullPointerException("rasterizer cannot be null");
        }
        this.f7956b = d0Var;
    }

    @Override // android.text.style.ReplacementSpan
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f7955a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        d0 d0Var = this.f7956b;
        j3.a aVarC = d0Var.c();
        int iA = aVarC.a(14);
        this.f7958d = fAbs / (iA != 0 ? aVarC.f8336b.getShort(iA + aVarC.f8335a) : (short) 0);
        j3.a aVarC2 = d0Var.c();
        int iA2 = aVarC2.a(14);
        if (iA2 != 0) {
            aVarC2.f8336b.getShort(iA2 + aVarC2.f8335a);
        }
        j3.a aVarC3 = d0Var.c();
        int iA3 = aVarC3.a(12);
        short s9 = (short) ((iA3 != 0 ? aVarC3.f8336b.getShort(iA3 + aVarC3.f8335a) : (short) 0) * this.f7958d);
        this.f7957c = s9;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s9;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f7959e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f7959e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                } else if (paint2 instanceof TextPaint) {
                    textPaint = (TextPaint) paint2;
                }
            } else if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        if (textPaint != null && textPaint.bgColor != 0) {
            int color = textPaint.getColor();
            Paint.Style style = textPaint.getStyle();
            textPaint.setColor(textPaint.bgColor);
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f10, i12, f10 + this.f7957c, i14, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        l.a().getClass();
        float f11 = i13;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        d0 d0Var = this.f7956b;
        a0 a0Var = d0Var.f7951b;
        Typeface typeface = (Typeface) a0Var.f7944d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) a0Var.f7942b, d0Var.f7950a * 2, 2, f10, f11, paint2);
        paint2.setTypeface(typeface2);
    }
}
