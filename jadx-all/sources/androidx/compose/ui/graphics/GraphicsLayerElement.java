package androidx.compose.ui.graphics;

import e1.g0;
import e1.l0;
import e1.m0;
import e1.p0;
import e1.r;
import l.q;
import q.w;
import t1.c1;
import t1.g;
import t1.u0;
import u.k1;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class GraphicsLayerElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f1710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f1711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f1712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f1713j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f1714k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f1715l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l0 f1716m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f1717n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f1718o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f1719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f1720q;

    public GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, l0 l0Var, boolean z10, long j11, long j12, int i10) {
        this.f1705b = f10;
        this.f1706c = f11;
        this.f1707d = f12;
        this.f1708e = f13;
        this.f1709f = f14;
        this.f1710g = f15;
        this.f1711h = f16;
        this.f1712i = f17;
        this.f1713j = f18;
        this.f1714k = f19;
        this.f1715l = j10;
        this.f1716m = l0Var;
        this.f1717n = z10;
        this.f1718o = j11;
        this.f1719p = j12;
        this.f1720q = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        if (Float.compare(this.f1705b, graphicsLayerElement.f1705b) != 0 || Float.compare(this.f1706c, graphicsLayerElement.f1706c) != 0 || Float.compare(this.f1707d, graphicsLayerElement.f1707d) != 0 || Float.compare(this.f1708e, graphicsLayerElement.f1708e) != 0 || Float.compare(this.f1709f, graphicsLayerElement.f1709f) != 0 || Float.compare(this.f1710g, graphicsLayerElement.f1710g) != 0 || Float.compare(this.f1711h, graphicsLayerElement.f1711h) != 0 || Float.compare(this.f1712i, graphicsLayerElement.f1712i) != 0 || Float.compare(this.f1713j, graphicsLayerElement.f1713j) != 0 || Float.compare(this.f1714k, graphicsLayerElement.f1714k) != 0) {
            return false;
        }
        int i10 = p0.f5056c;
        return this.f1715l == graphicsLayerElement.f1715l && d7.a.d(this.f1716m, graphicsLayerElement.f1716m) && this.f1717n == graphicsLayerElement.f1717n && d7.a.d(null, null) && r.c(this.f1718o, graphicsLayerElement.f1718o) && r.c(this.f1719p, graphicsLayerElement.f1719p) && g0.c(this.f1720q, graphicsLayerElement.f1720q);
    }

    @Override // t1.u0
    public final int hashCode() {
        int iA = q.a(this.f1714k, q.a(this.f1713j, q.a(this.f1712i, q.a(this.f1711h, q.a(this.f1710g, q.a(this.f1709f, q.a(this.f1708e, q.a(this.f1707d, q.a(this.f1706c, Float.hashCode(this.f1705b) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i10 = p0.f5056c;
        int iC = q.c(this.f1717n, (this.f1716m.hashCode() + q.b(this.f1715l, iA, 31)) * 31, 961);
        int i11 = r.f5066h;
        return Integer.hashCode(this.f1720q) + q.b(this.f1719p, q.b(this.f1718o, iC, 31), 31);
    }

    @Override // t1.u0
    public final n l() {
        m0 m0Var = new m0();
        m0Var.f5046u = this.f1705b;
        m0Var.f5047v = this.f1706c;
        m0Var.f5048w = this.f1707d;
        m0Var.f5049x = this.f1708e;
        m0Var.f5050y = this.f1709f;
        m0Var.f5051z = this.f1710g;
        m0Var.A = this.f1711h;
        m0Var.B = this.f1712i;
        m0Var.C = this.f1713j;
        m0Var.D = this.f1714k;
        m0Var.E = this.f1715l;
        m0Var.F = this.f1716m;
        m0Var.G = this.f1717n;
        m0Var.H = this.f1718o;
        m0Var.I = this.f1719p;
        m0Var.J = this.f1720q;
        m0Var.K = new w(m0Var, 29);
        return m0Var;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        m0 m0Var = (m0) nVar;
        m0Var.f5046u = this.f1705b;
        m0Var.f5047v = this.f1706c;
        m0Var.f5048w = this.f1707d;
        m0Var.f5049x = this.f1708e;
        m0Var.f5050y = this.f1709f;
        m0Var.f5051z = this.f1710g;
        m0Var.A = this.f1711h;
        m0Var.B = this.f1712i;
        m0Var.C = this.f1713j;
        m0Var.D = this.f1714k;
        m0Var.E = this.f1715l;
        m0Var.F = this.f1716m;
        m0Var.G = this.f1717n;
        m0Var.H = this.f1718o;
        m0Var.I = this.f1719p;
        m0Var.J = this.f1720q;
        c1 c1Var = g.x(m0Var, 2).f14396q;
        if (c1Var != null) {
            c1Var.c1(m0Var.K, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.f1705b);
        sb.append(", scaleY=");
        sb.append(this.f1706c);
        sb.append(", alpha=");
        sb.append(this.f1707d);
        sb.append(", translationX=");
        sb.append(this.f1708e);
        sb.append(", translationY=");
        sb.append(this.f1709f);
        sb.append(", shadowElevation=");
        sb.append(this.f1710g);
        sb.append(", rotationX=");
        sb.append(this.f1711h);
        sb.append(", rotationY=");
        sb.append(this.f1712i);
        sb.append(", rotationZ=");
        sb.append(this.f1713j);
        sb.append(", cameraDistance=");
        sb.append(this.f1714k);
        sb.append(", transformOrigin=");
        sb.append((Object) p0.a(this.f1715l));
        sb.append(", shape=");
        sb.append(this.f1716m);
        sb.append(", clip=");
        sb.append(this.f1717n);
        sb.append(", renderEffect=null, ambientShadowColor=");
        k1.d(this.f1718o, sb, ", spotShadowColor=");
        sb.append((Object) r.i(this.f1719p));
        sb.append(", compositingStrategy=");
        sb.append((Object) ("CompositingStrategy(value=" + this.f1720q + ')'));
        sb.append(')');
        return sb.toString();
    }
}
