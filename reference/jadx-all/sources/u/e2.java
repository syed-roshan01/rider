package u;

import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public class e2 implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Magnifier f14763a;

    public e2(Magnifier magnifier) {
        this.f14763a = magnifier;
    }

    @Override // u.c2
    public void a(long j10, long j11, float f10) {
        this.f14763a.show(d1.c.d(j10), d1.c.e(j10));
    }

    public final void b() {
        this.f14763a.dismiss();
    }

    public final long c() {
        Magnifier magnifier = this.f14763a;
        return o1.s.e(magnifier.getWidth(), magnifier.getHeight());
    }

    public final void d() {
        this.f14763a.update();
    }
}
