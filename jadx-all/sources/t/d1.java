package t;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14125c;

    public d1(float f10, float f11, Object obj) {
        this.f14123a = f10;
        this.f14124b = f11;
        this.f14125c = obj;
    }

    @Override // t.n
    public final z1 a(x1 x1Var) {
        Object obj = this.f14125c;
        return new g2(this.f14123a, this.f14124b, obj == null ? null : (t) x1Var.f14351a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return d1Var.f14123a == this.f14123a && d1Var.f14124b == this.f14124b && d7.a.d(d1Var.f14125c, this.f14125c);
    }

    public final int hashCode() {
        Object obj = this.f14125c;
        return Float.hashCode(this.f14124b) + l.q.a(this.f14123a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ d1(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
