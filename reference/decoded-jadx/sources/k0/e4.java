package k0;

import a7.C0008;
import aa.C0012;
import c7.C0068;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.components.C0243;
import g2.C0287;
import h5.C0307;
import h5.C0308;
import l6.C0343;
import s7.C0414;
import u4.C0435;
import w5.C0462;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public final class e4 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f4 f8874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0.o f8875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8879f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(f4 f4Var, y0.o oVar, float f10, long j10, int i10, int i11) {
        super(C0462.f733 ^ 311);
        this.f8874a = f4Var;
        this.f8875b = oVar;
        this.f8876c = f10;
        this.f8877d = j10;
        this.f8878e = i10;
        this.f8879f = i11;
        int iM5962 = C0308.m5962();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5962 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0287.m5524("bEEDNUZTB8DGDxdUawxkM7fw")));
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
        int iM159 = 0;
        f4 f4VarM2550 = null;
        y0.o oVarM5943 = null;
        float fM9571 = 0.0f;
        long jM1319 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM4665 = 0;
        q8.l lVarM238 = null;
        String str = "\u06e8\u06e6";
        Number number = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56574:
                    str = "\u06e6\u06e1\u06e6";
                    mVar = (m0.m) obj;
                    break;
                case 1746724:
                    C0343.m6727(f4VarM2550, oVarM5943, fM9571, jM1319, mVar, iM159, iM4665);
                    str = "\u06e1\u06e2\u06e1";
                    break;
                case 1748704:
                    str = "\u06e4\u06e5\u06e8";
                    lVarM238 = C0012.m238();
                    break;
                case 1748734:
                    i11 = iM159 ^ 1;
                    str = "\u06e2\u06df\u06e1";
                    break;
                case 1748735:
                    i10 = iM159 & 1;
                    str = "\u06e1\u06e3\u06e0";
                    break;
                case 1749572:
                    i12 = i11 | i10;
                    str = "\u06e7\u06e8\u06e4";
                    break;
                case 1751589:
                    f4VarM2550 = C0132.m2550(this);
                    str = "\u06e8\u06e4\u06e1";
                    break;
                case 1751682:
                    iM159 = C0435.m8515(number);
                    str = "\u06e4\u06e2\u06e3";
                    break;
                case 1751687:
                    return lVarM238;
                case 1751777:
                    jM1319 = C0068.m1319(this);
                    str = "\u06e5\u06e4\u06e2";
                    break;
                case 1752611:
                    iM159 = C0414.m8139(this);
                    str = "\u06e1\u06e3\u06e1";
                    break;
                case 1753483:
                    str = "\u06e4\u06e5\u06e3";
                    number = (Number) obj2;
                    break;
                case 1754538:
                    fM9571 = C0492.m9571(this);
                    str = "\u06e4\u06e8\u06e5";
                    break;
                case 1754659:
                    iM159 = C0008.m159(i12);
                    str = "\u06e2\u06e7\u06df";
                    break;
                case 1755493:
                    oVarM5943 = C0307.m5943(this);
                    str = "\u06e7\u06e4\u06e7";
                    break;
                default:
                    iM4665 = C0243.m4665(this);
                    str = "\u06df\u06e0\u06e5";
                    break;
            }
        }
    }
}
