package k0;

import a7.C0008;
import aa.C0012;
import com.google.android.gms.internal.stats.C0101;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.remoteconfig.internal.Code;
import ga.C0295;
import h5.C0307;
import m7.C0357;
import q2.C0384;
import s7.C0414;
import t1.C0419;
import u4.C0435;
import u8.C0438;

/* JADX INFO: loaded from: classes.dex */
public final class z1 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.a f9689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0.o f9690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9694f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f9695n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(c9.a aVar, y0.o oVar, long j10, long j11, int i10, int i11, int i12) {
        super(C0142.f168 ^ (-616));
        this.f9689a = aVar;
        this.f9690b = oVar;
        this.f9691c = j10;
        this.f9692d = j11;
        this.f9693e = i10;
        this.f9694f = i11;
        this.f9695n = i12;
        int iM2408 = C0125.m2408();
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2408 <= 0) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0414.m8138("MxAvq6qNJ")));
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
        int iM7536 = 0;
        c9.a aVarM7007 = null;
        y0.o oVarM5693 = null;
        long jM5937 = 0;
        long jM8252 = 0;
        int iM159 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM1986 = 0;
        q8.l lVarM238 = null;
        String str = "\u06e2\u06e0\u06e1";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56538:
                    iM7536 = C0384.m7536(this);
                    str = "\u06e6\u06e4\u06e0";
                    break;
                case 1746727:
                    lVarM238 = C0012.m238();
                    str = "\u06e6\u06e7\u06e2";
                    break;
                case 1747653:
                    i11 = iM159 ^ 1;
                    str = "\u06e4\u06e5\u06e4";
                    break;
                case 1748772:
                    aVarM7007 = C0357.m7007(this);
                    str = "\u06e7\u06e6\u06e4";
                    break;
                case 1749603:
                    mVar = (m0.m) obj;
                    str = "\u06e6\u06e3\u06e6";
                    break;
                case 1750601:
                    iM1986 = C0101.m1986(this);
                    str = "\u06e7\u06df\u06e5";
                    break;
                case 1751498:
                    iM7536 = C0435.m8515(number);
                    str = "\u06e1\u06e4\u06e7";
                    break;
                case 1751590:
                    jM8252 = C0419.m8252(this);
                    str = "\u06e7\u06e1";
                    break;
                case 1751683:
                    i12 = i11 | i10;
                    str = "\u06e6\u06e2\u06e3";
                    break;
                case 1753511:
                    iM159 = C0008.m159(i12);
                    str = "\u06e3\u06e1\u06e7";
                    break;
                case 1753545:
                    number = (Number) obj2;
                    str = "\u06e4\u06df\u06e5";
                    break;
                case 1753570:
                    iM159 = C0438.m8561(this);
                    str = "\u06e4\u06e6\u06e1";
                    break;
                case 1753665:
                    return lVarM238;
                case 1754381:
                    C0173.m3309(aVarM7007, oVarM5693, jM5937, jM8252, iM7536, mVar, iM159, iM1986);
                    str = "\u06df\u06e0\u06e8";
                    break;
                case 1754597:
                    oVarM5693 = C0295.m5693(this);
                    str = "\u06e8\u06e6\u06e6";
                    break;
                case 1755560:
                    jM5937 = C0307.m5937(this);
                    str = "\u06e4\u06e2\u06e4";
                    break;
                default:
                    i10 = iM159 & 1;
                    str = "\u06e0\u06df\u06e4";
                    break;
            }
        }
    }
}
