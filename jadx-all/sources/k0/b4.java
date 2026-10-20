package k0;

import a7.C0008;
import aa.C0012;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.messaging.C0191;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0198;
import g3.C0289;
import g5.C0292;
import p0.C0374;
import r4.C0399;
import u4.C0436;
import w.C0454;

/* JADX INFO: loaded from: classes.dex */
public final class b4 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9.e f8749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8750e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(long j10, long j11, boolean z10, c9.e eVar, int i10) {
        super(C0374.f644 ^ (-857));
        this.f8746a = j10;
        this.f8747b = j11;
        this.f8748c = z10;
        this.f8749d = eVar;
        this.f8750e = i10;
        int iM7797 = C0399.m7797();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7797 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0191.m3651("sL4jmAzJi3vpTkydcWOkk")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        m0.m mVar = null;
        Number number = null;
        int iM8515 = 0;
        long jM3794 = 0;
        long jM5615 = 0;
        boolean zM3746 = false;
        c9.e eVarM5545 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        String str = "ۢۦ۟";
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56295:
                    i10 = iM8515 & 1;
                    str = "ۥۣۤ";
                    break;
                case 1746910:
                    C0146.m2790(jM3794, jM5615, zM3746, eVarM5545, mVar, iM8515);
                    str = "ۨۧۥ";
                    break;
                case 1747688:
                    iM8515 = C0454.m8836(this);
                    str = "۟ۦ";
                    break;
                case 1747718:
                    iM8515 = C0008.m159(i12);
                    str = "۟ۦۥ";
                    break;
                case 1747742:
                    jM3794 = C0198.m3794(this);
                    str = "ۢۨۢ";
                    break;
                case 1748863:
                    zM3746 = C0195.m3746(this);
                    str = "ۤۤ۠";
                    break;
                case 1749852:
                    jM5615 = C0292.m5615(this);
                    str = "ۡۧۥ";
                    break;
                case 1750691:
                    return lVarM238;
                case 1751495:
                    i12 = i11 | i10;
                    str = "۠ۡۧ";
                    break;
                case 1751648:
                    eVarM5545 = C0289.m5545(this);
                    str = "۠۠ۨ";
                    break;
                case 1752582:
                    i11 = iM8515 ^ 1;
                    str = "ۤ۟ۢ";
                    break;
                case 1753669:
                    iM8515 = C0436.m8515(number);
                    str = "۠ۢ۠";
                    break;
                case 1754441:
                    str = "ۦۧۦ";
                    number = (Number) obj2;
                    break;
                case 1755590:
                    str = "ۣۤۤ";
                    lVarM238 = C0012.m238();
                    break;
                default:
                    mVar = (m0.m) obj;
                    str = "ۣۧۡ";
                    break;
            }
        }
    }
}
