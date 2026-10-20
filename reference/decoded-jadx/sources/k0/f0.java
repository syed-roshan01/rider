package k0;

import a7.C0008;
import aa.C0012;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.input.pointer.C0034;
import c0.C0057;
import com.google.android.gms.common.C0087;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.messaging.C0192;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import g3.C0288;
import h8.C0314;
import m3.C0352;
import q6.C0386;
import r7.C0403;
import s.C0408;
import u0.C0430;
import u4.C0435;
import w2.C0458;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.a f8901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0.o f8902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e1.l0 f8904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f8905f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d0 f8906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u.w f8907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y.t0 f8908p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x.m f8909q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c9.f f8910r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8911s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f8912t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(c9.a aVar, y0.o oVar, boolean z10, e1.l0 l0Var, y yVar, d0 d0Var, u.w wVar, y.t0 t0Var, x.m mVar, c9.f fVar, int i10, int i11, int i12) {
        super(C0492.f766 ^ (-814));
        this.f8900a = i12;
        this.f8901b = aVar;
        this.f8902c = oVar;
        this.f8903d = z10;
        this.f8904e = l0Var;
        this.f8905f = yVar;
        this.f8906n = d0Var;
        this.f8907o = wVar;
        this.f8908p = t0Var;
        this.f8909q = mVar;
        this.f8910r = fVar;
        this.f8911s = i10;
        this.f8912t = i11;
        int iM5547 = C0288.m5547();
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5547 <= 0) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0192.m3669("65wFZnzK8hBgY5DTpVl1gOL")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i13 = 1678;
        }
    }

    public final void a(m0.m mVar, int i10) {
        int iM488 = C0024.m488(this);
        int iM2797 = C0146.m2797(this);
        switch (iM488) {
            case 0:
                C0057.m1096(C0176.m3352(this), C0087.m1848(this), C0430.m8427(this), C0023.m451(this), C0034.m672(this), C0386.m7568(this), C0352.m6905(this), C0314.m6080(this), C0231.m4463(this), C0458.m8924(this), mVar, C0008.m159((iM2797 & 1) | (iM2797 ^ 1)), C0125.m2420(this));
                break;
            case 1:
                C0403.m7922(C0176.m3352(this), C0087.m1848(this), C0430.m8427(this), C0023.m451(this), C0034.m672(this), C0386.m7568(this), C0352.m6905(this), C0314.m6080(this), C0231.m4463(this), C0458.m8924(this), mVar, C0008.m159((iM2797 & 1) | (iM2797 ^ 1)), C0125.m2420(this));
                break;
            default:
                C0408.m8011(C0176.m3352(this), C0087.m1848(this), C0430.m8427(this), C0023.m451(this), C0034.m672(this), C0386.m7568(this), C0352.m6905(this), C0314.m6080(this), C0231.m4463(this), C0458.m8924(this), mVar, C0008.m159((iM2797 & 1) | (iM2797 ^ 1)), C0125.m2420(this));
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0024.m488(this)) {
            case 0:
                C0435.m8519(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
            case 1:
                C0435.m8519(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
            default:
                C0435.m8519(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
