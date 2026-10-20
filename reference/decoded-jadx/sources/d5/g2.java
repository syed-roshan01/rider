package d5;

import a7.C0008;
import aa.C0012;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.measurement.C0183;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import e2.C0261;
import f0.C0272;
import f4.C0274;
import f4.C0275;
import h8.C0314;
import r7.C0404;
import u4.C0435;

/* JADX INFO: loaded from: classes.dex */
public final class g2 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1 f4529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9.a f4532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(p1 p1Var, boolean z10, boolean z11, c9.a aVar, int i10) {
        super(C0274.f390 ^ SQLitePersistence.MAX_ARGS);
        this.f4529a = p1Var;
        this.f4530b = z10;
        this.f4531c = z11;
        this.f4532d = aVar;
        this.f4533e = i10;
        int iM3510 = C0183.m3510();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3510 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0272.m5244("ZyWNfjIUr0lYdFwCV2E3G86HLgV7F")));
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
        p1 p1VarM1945 = null;
        boolean zM7943 = false;
        boolean zM3752 = false;
        c9.a aVarM5309 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        q8.l lVarM238 = null;
        String str = "\u06e5\u06e6\u06df";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747741:
                    i11 = iM8515 ^ 1;
                    str = "\u06df\u06e7\u06e0";
                    break;
                case 1748708:
                    C0314.m6083(p1VarM1945, zM7943, zM3752, aVarM5309, mVar, iM8515);
                    str = "\u06e1\u06e8\u06df";
                    break;
                case 1748773:
                    p1VarM1945 = C0091.m1945(this);
                    str = "\u06e3\u06e7\u06e7";
                    break;
                case 1748888:
                    lVarM238 = C0012.m238();
                    str = "\u06e8\u06e6\u06df";
                    break;
                case 1749607:
                    iM8515 = C0261.m4989(this);
                    str = "\u06e4\u06e6\u06e4";
                    break;
                case 1749638:
                    iM8515 = C0008.m159(i12);
                    str = "\u06e1\u06e2\u06e5";
                    break;
                case 1750533:
                    iM8515 = C0435.m8515(number);
                    str = "\u06e1\u06e4\u06e8";
                    break;
                case 1750662:
                    number = (Number) obj2;
                    str = "\u06e3\u06df\u06e1";
                    break;
                case 1750726:
                    zM3752 = C0196.m3752(this);
                    str = "\u06e7\u06e4\u06e7";
                    break;
                case 1750787:
                    zM7943 = C0404.m7943(this);
                    str = "\u06e3\u06e5\u06e8";
                    break;
                case 1751714:
                    i10 = iM8515 & 1;
                    str = "\u06e0\u06e2\u06df";
                    break;
                case 1752670:
                    mVar = (m0.m) obj;
                    str = "\u06e3\u06e3\u06e6";
                    break;
                case 1754538:
                    aVarM5309 = C0275.m5309(this);
                    str = "\u06e2\u06e0\u06e5";
                    break;
                case 1755553:
                    return lVarM238;
                default:
                    i12 = i11 | i10;
                    str = "\u06e2\u06e1\u06e5";
                    break;
            }
        }
    }
}
