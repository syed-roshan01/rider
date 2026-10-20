package d1;

import d7.t;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f4322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f4323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f4324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f4325d;

    public final void a(float f10, float f11, float f12, float f13) {
        this.f4322a = Math.max(f10, this.f4322a);
        this.f4323b = Math.max(f11, this.f4323b);
        this.f4324c = Math.min(f12, this.f4324c);
        this.f4325d = Math.min(f13, this.f4325d);
    }

    public final boolean b() {
        return this.f4322a >= this.f4324c || this.f4323b >= this.f4325d;
    }

    public final String toString() {
        return "MutableRect(" + t.w0(this.f4322a) + ", " + t.w0(this.f4323b) + ", " + t.w0(this.f4324c) + ", " + t.w0(this.f4325d) + ')';
    }
}
