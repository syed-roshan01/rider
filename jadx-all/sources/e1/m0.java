package e1;

import r1.x0;
import u.k1;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends y0.n implements t1.b0 {
    public float A;
    public float B;
    public float C;
    public float D;
    public long E;
    public l0 F;
    public boolean G;
    public long H;
    public long I;
    public int J;
    public q.w K;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f5046u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f5047v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f5048w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f5049x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f5050y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f5051z;

    @Override // t1.b0
    public final r1.k0 f(r1.l0 l0Var, r1.i0 i0Var, long j10) {
        x0 x0VarF = i0Var.f(j10);
        return l0Var.N(x0VarF.f13423a, x0VarF.f13424b, r8.s.f13662a, new u.s(19, x0VarF, this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f5046u);
        sb.append(", scaleY=");
        sb.append(this.f5047v);
        sb.append(", alpha = ");
        sb.append(this.f5048w);
        sb.append(", translationX=");
        sb.append(this.f5049x);
        sb.append(", translationY=");
        sb.append(this.f5050y);
        sb.append(", shadowElevation=");
        sb.append(this.f5051z);
        sb.append(", rotationX=");
        sb.append(this.A);
        sb.append(", rotationY=");
        sb.append(this.B);
        sb.append(", rotationZ=");
        sb.append(this.C);
        sb.append(", cameraDistance=");
        sb.append(this.D);
        sb.append(", transformOrigin=");
        sb.append((Object) p0.a(this.E));
        sb.append(", shape=");
        sb.append(this.F);
        sb.append(", clip=");
        sb.append(this.G);
        sb.append(", renderEffect=null, ambientShadowColor=");
        k1.d(this.H, sb, ", spotShadowColor=");
        k1.d(this.I, sb, ", compositingStrategy=");
        sb.append((Object) ("CompositingStrategy(value=" + this.J + ')'));
        sb.append(')');
        return sb.toString();
    }

    @Override // y0.n
    public final boolean w0() {
        return false;
    }
}
