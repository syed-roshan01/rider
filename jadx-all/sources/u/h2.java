package u;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class h2 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h2 f14798a = new h2();

    @Override // u.d2
    public final boolean a() {
        return true;
    }

    @Override // u.d2
    public final c2 b(View view, boolean z10, long j10, float f10, float f11, boolean z11, m2.b bVar, float f12) {
        if (z10) {
            return new g2(new Magnifier(view));
        }
        long jS = bVar.S(j10);
        float fV = bVar.v(f10);
        float fV2 = bVar.v(f11);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jS != d1.f.f4345c) {
            builder.setSize(d7.t.p0(d1.f.d(jS)), d7.t.p0(d1.f.b(jS)));
        }
        if (!Float.isNaN(fV)) {
            builder.setCornerRadius(fV);
        }
        if (!Float.isNaN(fV2)) {
            builder.setElevation(fV2);
        }
        if (!Float.isNaN(f12)) {
            builder.setInitialZoom(f12);
        }
        builder.setClippingEnabled(z11);
        return new g2(builder.build());
    }
}
