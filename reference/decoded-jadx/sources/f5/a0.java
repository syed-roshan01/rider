package f5;

import a8.C0009;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0227;
import m9.b1;
import m9.f1;
import m9.p1;
import n.C0360;
import o2.C0368;
import o7.i2;
import p3.C0375;
import p7.C0378;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f394short = {264, 277};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f6230a = new a0(1);

    /* JADX INFO: renamed from: ۣۤۥۧ, reason: not valid java name and contains not printable characters */
    public static short[] m5330() {
        int iM7234 = C0368.m7234();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7234 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f394short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c9.c
    public final Object invoke(Object obj) {
        f1 f1Var = null;
        short[] sArrM5330 = null;
        int i10 = 0;
        int i11 = 0;
        String strM7066 = null;
        p1 p1Var = null;
        boolean z10 = false;
        boolean z11 = 0;
        int i12 = 0;
        int i13 = 0;
        String str = "\u06df\u06e5\u06e5";
        Boolean boolM192 = null;
        Object objM7405 = obj;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56382:
                    str = "\u06e2\u06e4\u06e4";
                    i13 = (z11 ? 1 : 0) & 1;
                    break;
                case 1746815:
                    str = "\u06e1\u06e5\u06e0";
                    i10 = C0227.f307;
                    break;
                case 1746879:
                    str = "\u06e2\u06df\u06e7";
                    f1Var = (f1) objM7405;
                    break;
                case 1747933:
                    str = "\u06e6\u06e8\u06e0";
                    z10 = objM7405 instanceof b1;
                    break;
                case 1748796:
                    str = "\u06e2\u06e5\u06e5";
                    i11 = i10 ^ (-910);
                    break;
                case 1748893:
                    str = "\u06e2\u06e0";
                    z11 = (z10 ? 1 : 0) ^ '\uffff';
                    break;
                case 1749578:
                    str = "\u06df\u06e3\u06e3";
                    sArrM5330 = m5330();
                    break;
                case 1749605:
                    str = "\u06e1\u06e8\u06e4";
                    i12 = (z11 ? 1 : 0) & (z10 ? 1 : 0);
                    break;
                case 1749609:
                    C0375.m7360(f1Var, strM7066);
                    str = "\u06e4\u06e5\u06e4";
                    break;
                case 1749730:
                    str = "\u06e5\u06e8\u06e5";
                    z11 = i13 | i12;
                    break;
                case 1749762:
                    str = "\u06e2\u06e0\u06e7";
                    strM7066 = C0360.m7066(sArrM5330, 0, i11, 353);
                    break;
                case 1751683:
                    str = "\u06e5\u06e1\u06e0";
                    p1Var = (p1) f1Var;
                    break;
                case 1752516:
                    objM7405 = C0378.m7405(p1Var);
                    str = "\u06e0\u06e8\u06e5";
                    break;
                case 1752738:
                    str = "\u06e8\u06e7\u06e7";
                    boolM192 = C0009.m192(z11);
                    break;
                case 1755592:
                    return boolM192;
                default:
                    str = "\u06e2\u06e0\u06e3";
                    z11 = -2;
                    break;
            }
        }
    }
}
