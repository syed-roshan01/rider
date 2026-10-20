package k2;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import e1.g0;
import g1.h;
import g1.j;
import g1.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f9712a;

    public a(h hVar) {
        this.f9712a = hVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            j jVar = j.f6502a;
            h hVar = this.f9712a;
            if (d7.a.d(hVar, jVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (hVar instanceof k) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((k) hVar).f6503a);
                textPaint.setStrokeMiter(((k) hVar).f6504b);
                int i10 = ((k) hVar).f6506d;
                if (g0.g(i10, 0)) {
                    join = Paint.Join.MITER;
                } else if (g0.g(i10, 1)) {
                    join = Paint.Join.ROUND;
                } else {
                    join = g0.g(i10, 2) ? Paint.Join.BEVEL : Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i11 = ((k) hVar).f6505c;
                if (g0.f(i11, 0)) {
                    cap = Paint.Cap.BUTT;
                } else if (g0.f(i11, 1)) {
                    cap = Paint.Cap.ROUND;
                } else {
                    cap = g0.f(i11, 2) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                ((k) hVar).getClass();
                textPaint.setPathEffect(null);
            }
        }
    }
}
