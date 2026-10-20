package k0;

import a7.C0008;
import aa.C0012;
import b4.C0052;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.migration.C0255;
import e2.C0263;
import ea.C0269;
import r2.C0395;
import r5.C0401;
import u4.C0436;
import x4.C0469;

/* JADX INFO: loaded from: classes.dex */
public final class h4 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0.o f8983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.f f8986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c9.e f8987f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c9.e f8988n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f8989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f8990p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(int i10, y0.o oVar, long j10, long j11, c9.f fVar, c9.e eVar, c9.e eVar2, int i11, int i12) {
        super(C0120.f146 ^ 477);
        this.f8982a = i10;
        this.f8983b = oVar;
        this.f8984c = j10;
        this.f8985d = j11;
        this.f8986e = fVar;
        this.f8987f = eVar;
        this.f8988n = eVar2;
        this.f8989o = i11;
        this.f8990p = i12;
        int iM2336 = C0121.m2336();
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2336 >= 0) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0469.m9118("pzYOhHdSLNfxjDnRsMD")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i13 = 1678;
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        m0.m mVar = null;
        Number number = null;
        int iM2076 = 0;
        y0.o oVarM3130 = null;
        long jM3333 = 0;
        long jM5011 = 0;
        c9.f fVarM3709 = null;
        c9.e eVarM1021 = null;
        c9.e eVarM7726 = null;
        int iM159 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM7854 = 0;
        String str = "ۦۣۨ";
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56421:
                    i11 = iM159 ^ 1;
                    str = "ۢۨۦ";
                    break;
                case 56568:
                    jM3333 = C0175.m3333(this);
                    str = "۟ۨۡ";
                    break;
                case 1746913:
                    iM7854 = C0401.m7854(this);
                    str = "ۨۦۥ";
                    break;
                case 1748613:
                    iM2076 = C0436.m8515(number);
                    str = "ۡۢۦ";
                    break;
                case 1748709:
                    iM2076 = C0107.m2076(this);
                    str = "ۡۤ۠";
                    break;
                case 1748765:
                    oVarM3130 = C0163.m3130(this);
                    str = "ۨ۠";
                    break;
                case 1749825:
                    i10 = iM159 & 1;
                    str = "ۣۨ";
                    break;
                case 1749856:
                    i12 = i11 | i10;
                    str = "ۦۦۥ";
                    break;
                case 1750751:
                    eVarM7726 = C0395.m7726(this);
                    str = "ۦۨۡ";
                    break;
                case 1751526:
                    return lVarM238;
                case 1751742:
                    fVarM3709 = C0194.m3709(this);
                    str = "ۥۤ۟";
                    break;
                case 1752608:
                    eVarM1021 = C0052.m1021(this);
                    str = "ۣۦۢ";
                    break;
                case 1753636:
                    str = "ۣۡ۟";
                    number = (Number) obj2;
                    break;
                case 1753637:
                    iM159 = C0008.m159(i12);
                    str = "۟ۦۨ";
                    break;
                case 1753695:
                    iM159 = C0255.m4871(this);
                    str = "ۢۧۦ";
                    break;
                case 1753697:
                    mVar = (m0.m) obj;
                    str = "ۦۦۤ";
                    break;
                case 1754508:
                    str = "ۤ۠ۢ";
                    lVarM238 = C0012.m238();
                    break;
                case 1755559:
                    C0269.m5124(iM2076, oVarM3130, jM3333, jM5011, fVarM3709, eVarM1021, eVarM7726, mVar, iM159, iM7854);
                    str = "ۣۧۨ";
                    break;
                default:
                    jM5011 = C0263.m5011(this);
                    str = "ۤۧۡ";
                    break;
            }
        }
    }
}
