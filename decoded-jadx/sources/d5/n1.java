package d5;

import a7.C0008;
import aa.C0012;
import androidx.profileinstaller.C0046;
import b1.C0050;
import b4.C0052;
import com.auto.accept.service.C0072;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import e8.C0265;
import g.C0282;
import j3.C0325;
import s8.C0416;
import u4.C0435;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1.f f4699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0.o f4703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4704f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f4705n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(i1.f fVar, String str, String str2, long j10, y0.o oVar, int i10, int i11) {
        super(C0416.f687 ^ (-670));
        this.f4699a = fVar;
        this.f4700b = str;
        this.f4701c = str2;
        this.f4702d = j10;
        this.f4703e = oVar;
        this.f4704f = i10;
        this.f4705n = i11;
        int iM6295 = C0325.m6295();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6295 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0072.m1562("Y0E7OxpHxq7mYIbcmecPEPcku")));
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
        int iM1009 = 0;
        i1.f fVarM4427 = null;
        String strM8518 = null;
        String strM981 = null;
        long jM5454 = 0;
        y0.o oVarM5079 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM897 = 0;
        String str = "\u06e4\u06e6\u06e2";
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56446:
                    return lVarM238;
                case 1746725:
                    i12 = i11 | i10;
                    str = "\u06e3\u06e2\u06e8";
                    break;
                case 1746909:
                    iM897 = C0046.m897(this);
                    str = "\u06e6\u06e0\u06e6";
                    break;
                case 1747777:
                    strM981 = C0050.m981(this);
                    str = "\u06e2\u06e6\u06e5";
                    break;
                case 1747867:
                    i11 = iM1009 ^ 1;
                    str = "\u06df\u06e0\u06e6";
                    break;
                case 1747902:
                    oVarM5079 = C0265.m5079(this);
                    str = "\u06e5\u06e5";
                    break;
                case 1748710:
                    str = "\u06e7\u06e3\u06e3";
                    number = (Number) obj2;
                    break;
                case 1749601:
                    i10 = iM1009 & 1;
                    str = "\u06e0\u06e6\u06e1";
                    break;
                case 1749604:
                    fVarM4427 = C0230.m4427(this);
                    str = "\u06e5\u06df\u06e5";
                    break;
                case 1749793:
                    jM5454 = C0282.m5454(this);
                    str = "\u06e0\u06e7\u06e5";
                    break;
                case 1750633:
                    iM1009 = C0008.m159(i12);
                    str = "\u06df\u06e6\u06e4";
                    break;
                case 1751712:
                    str = "\u06e1\u06e2\u06e7";
                    mVar = (m0.m) obj;
                    break;
                case 1752459:
                    strM8518 = C0435.m8518(this);
                    str = "\u06e0\u06e3\u06e4";
                    break;
                case 1753452:
                    C0158.m3010(fVarM4427, strM8518, strM981, jM5454, oVarM5079, mVar, iM1009, iM897);
                    str = "\u06e8\u06e3\u06e3";
                    break;
                case 1754503:
                    iM1009 = C0435.m8515(number);
                    str = "\u06e2\u06e0\u06e2";
                    break;
                case 1755464:
                    str = "\u06e4\u06e2";
                    lVarM238 = C0012.m238();
                    break;
                default:
                    iM1009 = C0052.m1009(this);
                    str = "\u06e2\u06e0\u06df";
                    break;
            }
        }
    }
}
