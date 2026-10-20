package f0;

import a.C0000;
import androidx.versionedparcelable.C0048;
import com.google.android.datatransport.cct.C0077;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.remoteconfig.internal.Code;
import i.C0316;
import j6.C0328;
import m7.C0357;
import m9.C0359;
import p0.C0374;

/* JADX INFO: loaded from: classes.dex */
public final class x1 implements v.f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v.f2 f5999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.j0 f6000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.j0 f6001c;

    public x1(v.f2 f2Var, a2 a2Var) {
        this.f5999a = f2Var;
        this.f6000b = C0048.m935(new w1(a2Var, 1));
        this.f6001c = C0048.m935(new w1(a2Var, 0));
        int iM6120 = C0316.m6120();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6120 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0357.m7015("kX6Oxd8X")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // v.f2
    public final boolean a() {
        boolean zM14 = false;
        String str = "\u06e0\u06e4\u06e2";
        Object objM1677 = null;
        Boolean bool = null;
        m0.j0 j0VarM2391 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746689:
                    zM14 = C0000.m14(bool);
                    str = "\u06e7\u06e6\u06e3";
                    break;
                case 1749574:
                    str = "\u06df\u06df\u06e1";
                    bool = (Boolean) objM1677;
                    break;
                case 1752546:
                    objM1677 = C0077.m1677(j0VarM2391);
                    str = "\u06e2\u06df\u06e3";
                    break;
                case 1754596:
                    return zM14;
                default:
                    str = "\u06e5\u06e2\u06df";
                    j0VarM2391 = C0124.m2391(this);
                    break;
            }
        }
    }

    @Override // v.f2
    public final boolean b() {
        return C0359.m7047(C0129.m2497(this));
    }

    @Override // v.f2
    public final Object c(u.s1 s1Var, c9.e eVar, u8.e eVar2) {
        String str = "\u06e5\u06df\u06e4";
        v.f2 f2VarM2497 = null;
        Object objM7353 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746908:
                    return objM7353;
                case 1747714:
                    str = "\u06df\u06e6\u06e3";
                    objM7353 = C0374.m7353(f2VarM2497, s1Var, eVar, eVar2);
                    break;
                default:
                    f2VarM2497 = C0129.m2497(this);
                    str = "\u06e0\u06e1\u06e3";
                    break;
            }
        }
    }

    @Override // v.f2
    public final boolean d() {
        boolean zM14 = false;
        String str = "\u06e6\u06e6\u06e7";
        Object objM1677 = null;
        Boolean bool = null;
        m0.j0 j0VarM2374 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747684:
                    return zM14;
                case 1747805:
                    str = "\u06e8\u06df\u06e5";
                    bool = (Boolean) objM1677;
                    break;
                case 1750663:
                    objM1677 = C0077.m1677(j0VarM2374);
                    str = "\u06e0\u06e4\u06e1";
                    break;
                case 1753639:
                    str = "\u06e3\u06e3\u06e7";
                    j0VarM2374 = C0123.m2374(this);
                    break;
                default:
                    zM14 = C0000.m14(bool);
                    str = "\u06e0\u06e0\u06e4";
                    break;
            }
        }
    }

    @Override // v.f2
    public final float e(float f10) {
        return C0328.m6348(C0129.m2497(this), f10);
    }
}
