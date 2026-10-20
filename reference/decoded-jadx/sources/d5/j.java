package d5;

import a7.C0008;
import aa.C0012;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.remoteconfig.internal.Code;
import e2.C0261;
import ea.C0267;
import p7.C0378;
import u4.C0435;
import x5.C0470;

/* JADX INFO: loaded from: classes.dex */
public final class j extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.a f4582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4583c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i10, c9.a aVar, int i11) {
        super(C0378.f649 ^ (-882));
        this.f4581a = i10;
        this.f4582b = aVar;
        this.f4583c = i11;
        int iM2543 = C0132.m2543();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2543 >= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0267.m5102("aBakCco1nBkCBJCe3DeY")));
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
        String str = "\u06e3\u06e1\u06e8";
        c9.a aVarM2210 = null;
        m0.m mVar = null;
        q8.l lVarM238 = null;
        Number number = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM2546 = 0;
        int iM159 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747929:
                    str = "\u06e5\u06e2\u06e1";
                    aVarM2210 = C0114.m2210(this);
                    break;
                case 1748735:
                    str = "\u06e2\u06e5\u06e4";
                    i12 = iM159 & 1;
                    break;
                case 1749761:
                    str = "\u06e6\u06df\u06e0";
                    i11 = iM159 ^ 1;
                    break;
                case 1750602:
                    str = "\u06e3\u06e8\u06e6";
                    mVar = (m0.m) obj;
                    break;
                case 1750627:
                    str = "\u06e8\u06e8\u06e8";
                    iM159 = C0435.m8515(number);
                    break;
                case 1750817:
                    str = "\u06e3\u06e2\u06e2";
                    number = (Number) obj2;
                    break;
                case 1751682:
                    str = "\u06e5\u06e4\u06e7";
                    lVarM238 = C0012.m238();
                    break;
                case 1752548:
                    C0261.m5000(iM2546, aVarM2210, mVar, iM159);
                    str = "\u06e4\u06e5\u06e3";
                    break;
                case 1752616:
                    return lVarM238;
                case 1753415:
                    i10 = i11 | i12;
                    str = "\u06e4\u06e8\u06df";
                    break;
                case 1753511:
                    str = "\u06e0\u06e8\u06e1";
                    iM2546 = C0132.m2546(this);
                    break;
                case 1755624:
                    str = "\u06e1\u06e3\u06e1";
                    iM159 = C0470.m9158(this);
                    break;
                default:
                    str = "\u06e6\u06e2\u06e3";
                    iM159 = C0008.m159(i10);
                    break;
            }
        }
    }
}
