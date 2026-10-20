package p1;

import m2.p;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f12753a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f12754b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12755c = d1.c.f4326b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12756d;

    public final void a(long j10, long j11) {
        this.f12753a.a(d1.c.d(j11), j10);
        this.f12754b.a(d1.c.e(j11), j10);
    }

    public final long b(long j10) {
        if (p.b(j10) > 0.0f && p.c(j10) > 0.0f) {
            return i1.b.e(this.f12753a.b(p.b(j10)), this.f12754b.b(p.c(j10)));
        }
        throw new IllegalStateException(("maximumVelocity should be a positive value. You specified=" + ((Object) p.f(j10))).toString());
    }

    public final void c() {
        c cVar = this.f12753a;
        b9.b.Q(cVar.f12748d);
        cVar.f12749e = 0;
        c cVar2 = this.f12754b;
        b9.b.Q(cVar2.f12748d);
        cVar2.f12749e = 0;
        this.f12756d = 0L;
    }
}
