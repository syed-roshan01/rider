package u;

import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class g2 extends e2 {
    @Override // u.e2, u.c2
    public final void a(long j10, long j11, float f10) {
        boolean zIsNaN = Float.isNaN(f10);
        Magnifier magnifier = this.f14763a;
        if (!zIsNaN) {
            magnifier.setZoom(f10);
        }
        if (d9.i.u(j11)) {
            magnifier.show(d1.c.d(j10), d1.c.e(j10), d1.c.d(j11), d1.c.e(j11));
        } else {
            magnifier.show(d1.c.d(j10), d1.c.e(j10));
        }
    }
}
