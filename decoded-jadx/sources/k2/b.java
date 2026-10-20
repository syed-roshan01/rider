package k2;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import d1.f;
import d7.t;
import e1.j0;
import m0.n1;
import m0.o3;
import u1.z0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f9713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n1 f9715c = t.g0(new f(f.f4345c), o3.f11621a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.j0 f9716d = t.R(new z0(this, 5));

    public b(j0 j0Var, float f10) {
        this.f9713a = j0Var;
        this.f9714b = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float f10 = this.f9714b;
        if (!Float.isNaN(f10)) {
            textPaint.setAlpha(t.p0(z6.a.q(f10, 0.0f, 1.0f) * 255));
        }
        textPaint.setShader((Shader) this.f9716d.getValue());
    }
}
