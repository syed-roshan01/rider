package g1;

import d7.t;
import e1.p;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f6500a;

    public d(b bVar) {
        this.f6500a = bVar;
    }

    public final void a(float f10, float f11, float f12, float f13) {
        b bVar = this.f6500a;
        p pVarA = bVar.a();
        long j10 = t.j(d1.f.d(bVar.b()) - (f12 + f10), d1.f.b(bVar.b()) - (f13 + f11));
        if (d1.f.d(j10) < 0.0f || d1.f.b(j10) < 0.0f) {
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
        }
        bVar.c(j10);
        pVarA.e(f10, f11);
    }

    public final void b(float f10, float f11, long j10) {
        p pVarA = this.f6500a.a();
        pVarA.e(d1.c.d(j10), d1.c.e(j10));
        pVarA.b(f10, f11);
        pVarA.e(-d1.c.d(j10), -d1.c.e(j10));
    }
}
