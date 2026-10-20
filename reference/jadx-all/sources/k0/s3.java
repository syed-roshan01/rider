package k0;

import a7.C0008;
import aa.C0012;
import android.os.C0013;
import c0.C0056;
import c4.C0064;
import com.google.android.datatransport.cct.C0077;
import com.google.firebase.C0205;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.iid.C0171;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import d8.C0222;
import e2.C0264;
import ga.C0296;
import p0.C0374;
import r.C0393;
import u4.C0436;
import v7.C0450;

/* JADX INFO: loaded from: classes.dex */
public final class s3 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.c f9450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0.o f9451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9.e f9452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q3 f9454f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x.m f9455n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f9456o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f9457p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(boolean z10, c9.c cVar, y0.o oVar, c9.e eVar, boolean z11, q3 q3Var, x.m mVar, int i10, int i11) {
        super(C0222.f301 ^ (-745));
        this.f9449a = z10;
        this.f9450b = cVar;
        this.f9451c = oVar;
        this.f9452d = eVar;
        this.f9453e = z11;
        this.f9454f = q3Var;
        this.f9455n = mVar;
        this.f9456o = i10;
        this.f9457p = i11;
        int iM1077 = C0056.m1077();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1077 >= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0450.m8753("rEZdZ3GM")));
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
        int iM8515 = 0;
        boolean zM3265 = false;
        c9.c cVarM3779 = null;
        y0.o oVarM7319 = null;
        c9.e eVarM256 = null;
        boolean zM7683 = false;
        q3 q3VarM5686 = null;
        x.m mVarM1669 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iM3923 = 0;
        q8.l lVarM238 = null;
        String str = "ۡ۟ۥ";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56508:
                    cVarM3779 = C0197.m3779(this);
                    str = "ۢۥ۠";
                    break;
                case 1746757:
                    lVarM238 = C0012.m238();
                    str = "ۡۨۦ";
                    break;
                case 1747872:
                    C0064.m1236(zM3265, cVarM3779, oVarM7319, eVarM256, zM7683, q3VarM5686, mVarM1669, mVar, iM8515, iM3923);
                    str = "۟ۡۧ";
                    break;
                case 1748615:
                    mVar = (m0.m) obj;
                    str = "ۥۤۢ";
                    break;
                case 1748618:
                    zM7683 = C0393.m7683(this);
                    str = "ۣ۠ۡ";
                    break;
                case 1748764:
                    i11 = iM8515 ^ 1;
                    str = "ۧ۠ۤ";
                    break;
                case 1748895:
                    return lVarM238;
                case 1749757:
                    oVarM7319 = C0374.m7319(this);
                    str = "ۨۧۡ";
                    break;
                case 1750564:
                    q3VarM5686 = C0296.m5686(this);
                    str = "ۨ۠۠";
                    break;
                case 1750633:
                    zM3265 = C0171.m3265(this);
                    str = "ۦۢ";
                    break;
                case 1751591:
                    i10 = iM8515 & 1;
                    str = "ۡۤ۟";
                    break;
                case 1751593:
                    iM3923 = C0205.m3923(this);
                    str = "۠ۦۦ";
                    break;
                case 1751648:
                    iM8515 = C0264.m5028(this);
                    str = "ۤۢۥ";
                    break;
                case 1752611:
                    number = (Number) obj2;
                    str = "ۣۢۧ";
                    break;
                case 1754411:
                    i12 = i11 | i10;
                    str = "ۨۦ۠";
                    break;
                case 1755368:
                    mVarM1669 = C0077.m1669(this);
                    str = "ۤۤ۠";
                    break;
                case 1755554:
                    iM8515 = C0008.m159(i12);
                    str = "ۤۢۧ";
                    break;
                case 1755586:
                    eVarM256 = C0013.m256(this);
                    str = "ۡ۟ۨ";
                    break;
                default:
                    iM8515 = C0436.m8515(number);
                    str = "ۣۢۨ";
                    break;
            }
        }
    }
}
