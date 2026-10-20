package k0;

import a7.C0008;
import aa.C0012;
import android.support.v4.app.C0014;
import androidx.compose.ui.input.key.C0033;
import androidx.compose.ui.node.C0037;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.iid.C0170;
import com.google.firebase.measurement.C0182;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import g5.C0292;
import ja.C0331;
import java.util.List;
import k3.C0336;
import n7.C0364;
import r1.C0394;
import u.C0430;
import u4.C0436;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8827a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.a f8828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0.o f8831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8832f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f8833n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f8834o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f8835p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(String str, c9.a aVar, boolean z10, boolean z11, y0.o oVar, List list, int i10, int i11) {
        super(C0123.f149 ^ (-415));
        this.f8834o = str;
        this.f8828b = aVar;
        this.f8829c = z10;
        this.f8830d = z11;
        this.f8831e = oVar;
        this.f8835p = list;
        this.f8832f = i10;
        this.f8833n = i11;
        int iM652 = C0033.m652();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM652 >= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0364.m7137("Ggspj2XYIzxsEb")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(boolean z10, c9.a aVar, y0.o oVar, boolean z11, c2 c2Var, x.m mVar, int i10, int i11) {
        super(C0188.f212 ^ 107);
        this.f8829c = z10;
        this.f8828b = aVar;
        this.f8831e = oVar;
        this.f8830d = z11;
        this.f8834o = c2Var;
        this.f8835p = mVar;
        this.f8832f = i10;
        this.f8833n = i11;
        int iM1874 = C0088.m1874();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1874 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0394.m7717("MEL8HDJwos4P1iFJE2Bp66ttks5O9")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    public final void a(m0.m mVar, int i10) {
        int iM6508 = C0336.m6508(this);
        int iM2330 = C0121.m2330(this);
        Object objM3878 = C0202.m3878(this);
        Object objM5612 = C0292.m5612(this);
        switch (iM6508) {
            case 0:
                C0014.m268(C0331.m6391(this), C0037.m722(this), C0157.m2988(this), C0182.m3477(this), (c2) objM5612, (x.m) objM3878, mVar, C0008.m159((iM2330 & 1) | (iM2330 ^ 1)), C0430.m8413(this));
                break;
            default:
                C0170.m3262((String) objM5612, C0037.m722(this), C0331.m6391(this), C0182.m3477(this), C0157.m2988(this), (List) objM3878, mVar, C0008.m159((iM2330 & 1) | (iM2330 ^ 1)), C0430.m8413(this));
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0336.m6508(this)) {
            case 0:
                C0149.m2852(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            default:
                C0149.m2852(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
