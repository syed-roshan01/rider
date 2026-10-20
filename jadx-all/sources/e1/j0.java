package e1;

import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Shader f5036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5037b = d1.f.f4345c;

    @Override // e1.n
    public final void a(float f10, long j10, g gVar) {
        Shader shaderB = this.f5036a;
        if (shaderB == null || !d1.f.a(this.f5037b, j10)) {
            if (d1.f.e(j10)) {
                shaderB = null;
                this.f5036a = null;
                this.f5037b = d1.f.f4345c;
            } else {
                shaderB = b(j10);
                this.f5036a = shaderB;
                this.f5037b = j10;
            }
        }
        long jB = androidx.compose.ui.graphics.a.b(gVar.f5004a.getColor());
        long j11 = r.f5060b;
        if (!r.c(jB, j11)) {
            gVar.e(j11);
        }
        if (!d7.a.d(gVar.f5006c, shaderB)) {
            gVar.h(shaderB);
        }
        if (gVar.f5004a.getAlpha() / 255.0f == f10) {
            return;
        }
        gVar.c(f10);
    }

    public abstract Shader b(long j10);
}
