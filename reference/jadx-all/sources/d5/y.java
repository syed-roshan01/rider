package d5;

import a7.C0008;
import aa.C0012;
import c4.C0065;
import com.auto.accept.data.model.C0071;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.measurement.C0181;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import com.google.gson.internal.bind.C0207;
import d1.C0212;
import h4.C0305;
import q6.C0387;
import u4.C0436;
import w2.C0457;

/* JADX INFO: loaded from: classes.dex */
public final class y extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.a f4855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4856f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f4857n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, String str2, String str3, boolean z10, c9.a aVar, int i10, int i11) {
        super(C0457.f727 ^ 704);
        this.f4851a = str;
        this.f4852b = str2;
        this.f4853c = str3;
        this.f4854d = z10;
        this.f4855e = aVar;
        this.f4856f = i10;
        this.f4857n = i11;
        int iM3868 = C0202.m3868();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3868 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0071.m1457("nZIZ5AW")));
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
        String strM3970 = null;
        String strM2489 = null;
        String strM1264 = null;
        boolean zM7579 = false;
        c9.a aVarM3467 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM5862 = 0;
        String str = "ۥۧ";
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56452:
                    str = "ۢۢۧ";
                    lVarM238 = C0012.m238();
                    break;
                case 56514:
                    C0212.m4034(strM3970, strM2489, strM1264, zM7579, aVarM3467, mVar, iM159, iM5862);
                    str = "ۤۨ";
                    break;
                case 1748609:
                    iM5862 = C0305.m5862(this);
                    str = "ۦۨ";
                    break;
                case 1748678:
                    str = "ۨۢۨ";
                    number = (Number) obj2;
                    break;
                case 1748707:
                    i11 = iM159 ^ 1;
                    str = "ۣۧۨ";
                    break;
                case 1749671:
                    return lVarM238;
                case 1750563:
                    iM159 = C0123.m2380(this);
                    str = "ۥ۠ۨ";
                    break;
                case 1750788:
                    i12 = i11 | i10;
                    str = "ۤ۠ۡ";
                    break;
                case 1751525:
                    iM159 = C0008.m159(i12);
                    str = "ۡ۟۟";
                    break;
                case 1751748:
                    strM1264 = C0065.m1264(this);
                    str = "ۧۢ۠";
                    break;
                case 1752493:
                    i10 = iM159 & 1;
                    str = "ۡۢۤ";
                    break;
                case 1753420:
                    aVarM3467 = C0181.m3467(this);
                    str = "ۣ۠۠";
                    break;
                case 1753540:
                    strM3970 = C0207.m3970(this);
                    str = "ۨ۟ۢ";
                    break;
                case 1754469:
                    zM7579 = C0387.m7579(this);
                    str = "ۦ۟ۥ";
                    break;
                case 1755339:
                    strM2489 = C0129.m2489(this);
                    str = "ۤۧۧ";
                    break;
                case 1755438:
                    iM159 = C0436.m8515(number);
                    str = "ۦۣۡ";
                    break;
                default:
                    mVar = (m0.m) obj;
                    str = "ۡۡۦ";
                    break;
            }
        }
    }
}
