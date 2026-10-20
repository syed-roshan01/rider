package z;

import m0.l1;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f17180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f17181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f17183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0.y f17184e;

    public z(int i10, int i11) {
        this.f17180a = o7.d0.Z(i10);
        this.f17181b = o7.d0.Z(i11);
        this.f17184e = new a0.y(i10);
    }

    public final void a(int i10, int i11) {
        if (i10 >= 0.0f) {
            this.f17180a.f(i10);
            this.f17184e.b(i10);
            this.f17181b.f(i11);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i10 + ')').toString());
        }
    }
}
