package k0;

import a7.C0008;
import aa.C0012;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.node.C0037;
import b.C0049;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0198;
import l2.C0342;
import n.C0361;
import o1.C0368;
import r6.C0403;
import u4.C0436;
import w2.C0457;

/* JADX INFO: loaded from: classes.dex */
public final class x3 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.a f9648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0.o f9649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9652f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x.m f9653n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c9.f f9654o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f9655p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f9656q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(boolean z10, c9.a aVar, y0.o oVar, boolean z11, long j10, long j11, x.m mVar, c9.f fVar, int i10, int i11) {
        super(C0187.f211 ^ (-321));
        this.f9647a = z10;
        this.f9648b = aVar;
        this.f9649c = oVar;
        this.f9650d = z11;
        this.f9651e = j10;
        this.f9652f = j11;
        this.f9653n = mVar;
        this.f9654o = fVar;
        this.f9655p = i10;
        this.f9656q = i11;
        int iM2274 = C0118.m2274();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2274 >= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0194.m3710("nsIi9QPsQ3")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        m0.m mVar = null;
        Number number = null;
        int iM159 = 0;
        boolean zM716 = false;
        c9.a aVarM6698 = null;
        y0.o oVarM2952 = null;
        boolean zM7072 = false;
        long jM3791 = 0;
        long jM8887 = 0;
        x.m mVarM946 = null;
        c9.f fVarM7204 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM2723 = 0;
        String str = "ۥۣ";
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56478:
                    mVar = (m0.m) obj;
                    str = "ۣۢۥ";
                    break;
                case 1746814:
                    iM2723 = C0142.m2723(this);
                    str = "ۥ۟ۥ";
                    break;
                case 1747873:
                    aVarM6698 = C0342.m6698(this);
                    str = "ۨۢۢ";
                    break;
                case 1748616:
                    fVarM7204 = C0368.m7204(this);
                    str = "ۨ۟ۤ";
                    break;
                case 1749823:
                    zM7072 = C0361.m7072(this);
                    str = "ۣۣۢ";
                    break;
                case 1749852:
                    iM159 = C0436.m8515(number);
                    str = "ۥۣۥ";
                    break;
                case 1750536:
                    i10 = iM159 & 1;
                    str = "ۨۡۥ";
                    break;
                case 1750630:
                    str = "ۢۨۢ";
                    number = (Number) obj2;
                    break;
                case 1750658:
                    jM3791 = C0198.m3791(this);
                    str = "ۨۦۧ";
                    break;
                case 1750750:
                    str = "ۤۦۢ";
                    lVarM238 = C0012.m238();
                    break;
                case 1751712:
                    return lVarM238;
                case 1752459:
                    C0403.m7898(zM716, aVarM6698, oVarM2952, zM7072, jM3791, jM8887, mVarM946, fVarM7204, mVar, iM159, iM2723);
                    str = "ۣۦۡ";
                    break;
                case 1752583:
                    zM716 = C0037.m716(this);
                    str = "۠ۦۧ";
                    break;
                case 1753696:
                    mVarM946 = C0049.m946(this);
                    str = "ۡ۟ۦ";
                    break;
                case 1754438:
                    i12 = i11 | i10;
                    str = "ۣۤ۟";
                    break;
                case 1755341:
                    iM159 = C0027.m539(this);
                    str = "ۣ۟ۤ";
                    break;
                case 1755404:
                    i11 = iM159 ^ 1;
                    str = "ۧۡ۠";
                    break;
                case 1755432:
                    oVarM2952 = C0154.m2952(this);
                    str = "ۢۧۤ";
                    break;
                case 1755561:
                    jM8887 = C0457.m8887(this);
                    str = "ۦۨۢ";
                    break;
                default:
                    iM159 = C0008.m159(i12);
                    str = "ۣ۟ۢ";
                    break;
            }
        }
    }
}
