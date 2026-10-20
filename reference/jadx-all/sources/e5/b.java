package e5;

import android.view.View;
import c9.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import k0.e5;
import k0.i0;
import k0.k0;
import k0.t0;
import m0.m;
import m0.m3;
import m0.q;
import m0.s;
import m0.x1;
import t.o0;
import u1.y0;
import u1.z0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f5142a;

    static {
        long j10 = a.f5125a;
        long j11 = a.f5134j;
        long j12 = a.f5126b;
        long j13 = a.f5128d;
        long j14 = a.f5129e;
        long j15 = a.f5131g;
        long j16 = a.f5135k;
        long j17 = a.f5132h;
        long j18 = a.f5136l;
        long j19 = a.f5133i;
        long j20 = a.f5137m;
        long j21 = a.f5138n;
        m3 m3Var = k0.f9091a;
        f5142a = new i0(j10, j11, j12, l0.b.f10993f, l0.b.f10990c, j13, j11, j14, l0.b.f10994g, l0.b.f11007t, l0.b.f10995h, l0.b.f11008u, l0.b.f10996i, j15, j16, j17, j18, j19, j20, j10, l0.b.f10991d, l0.b.f10989b, j21, j11, l0.b.f10988a, l0.b.f10992e, l0.b.f10997j, l0.b.f10998k, l0.b.f10999l, l0.b.f11000m, l0.b.f11006s, l0.b.f11001n, l0.b.f11002o, l0.b.f11003p, l0.b.f11004q, l0.b.f11005r);
    }

    public static final void a(e eVar, m mVar, int i10) {
        int i11;
        d7.a.m(eVar, FirebaseAnalytics.Param.CONTENT);
        q qVar = (q) mVar;
        qVar.a0(594620490);
        if ((i10 & 14) == 0) {
            i11 = (qVar.i(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && qVar.G()) {
            qVar.U();
        } else {
            View view = (View) qVar.m(y0.f15381f);
            qVar.Z(935222322);
            if (!view.isInEditMode()) {
                s.d(new z0(view, 12), qVar);
            }
            qVar.t(false);
            t0.a(f5142a, null, new e5(), eVar, qVar, ((i11 << 9) & 7168) | 390, 2);
        }
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new o0(eVar, i10, 10);
        }
    }
}
