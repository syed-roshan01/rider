package f5;

import a8.C0009;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0228;
import m9.b1;
import m9.f1;
import m9.p1;
import n.C0361;
import o2.C0369;
import o7.i2;
import p3.C0376;
import p7.C0379;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f394short = {264, 277};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f6230a = new a0(1);

    /* JADX INFO: renamed from: ۣۤۥۧ, reason: not valid java name and contains not printable characters */
    public static short[] m5330() {
        int iM7234 = C0369.m7234();
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
        String str = "۟ۥۥ";
        Boolean boolM192 = null;
        Object objM7405 = obj;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56382:
                    str = "ۢۤۤ";
                    i13 = (z11 ? 1 : 0) & 1;
                    break;
                case 1746815:
                    str = "ۡۥ۠";
                    i10 = C0228.f307;
                    break;
                case 1746879:
                    str = "ۢ۟ۧ";
                    f1Var = (f1) objM7405;
                    break;
                case 1747933:
                    str = "ۦۨ۠";
                    z10 = objM7405 instanceof b1;
                    break;
                case 1748796:
                    str = "ۢۥۥ";
                    i11 = i10 ^ (-910);
                    break;
                case 1748893:
                    str = "ۢ۠";
                    z11 = (z10 ? 1 : 0) ^ 65535;
                    break;
                case 1749578:
                    str = "ۣۣ۟";
                    sArrM5330 = m5330();
                    break;
                case 1749605:
                    str = "ۡۨۤ";
                    i12 = (z11 ? 1 : 0) & (z10 ? 1 : 0);
                    break;
                case 1749609:
                    C0376.m7360(f1Var, strM7066);
                    str = "ۤۥۤ";
                    break;
                case 1749730:
                    str = "ۥۨۥ";
                    z11 = i13 | i12;
                    break;
                case 1749762:
                    str = "ۢ۠ۧ";
                    strM7066 = C0361.m7066(sArrM5330, 0, i11, 353);
                    break;
                case 1751683:
                    str = "ۥۡ۠";
                    p1Var = (p1) f1Var;
                    break;
                case 1752516:
                    objM7405 = C0379.m7405(p1Var);
                    str = "۠ۨۥ";
                    break;
                case 1752738:
                    str = "ۨۧۧ";
                    boolM192 = C0009.m192(z11);
                    break;
                case 1755592:
                    return boolM192;
                default:
                    str = "ۣۢ۠";
                    z11 = -2;
                    break;
            }
        }
    }
}
