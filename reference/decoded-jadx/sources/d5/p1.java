package d5;

import aa.C0011;
import androidx.preference.C0044;
import c7.C0068;
import com.google.android.gms.common.api.internal.C0082;
import com.google.firebase.abt.C0113;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0169;
import com.google.firebase.iid.C0170;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import d1.C0213;
import dagger.hilt.C0255;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import f6.C0277;
import h3.C0303;
import k7.C0337;
import l8.C0346;
import m4.C0353;
import p7.C0378;
import q5.C0385;
import u.C0429;
import u1.C0432;
import v0.C0440;
import w2.C0458;
import x7.C0472;

/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f283short = {1671, 1723, 1718, 1721, 1694, 1721, 1713, 1720, 1791, 1699, 1710, 1703, 1714, 1770, 2905, 2901, 2817, 2844, 2817, 2841, 2832, 2888, 1738, 1734, 1666, 1683, 1684, 1671, 1682, 1679, 1673, 1672, 1755, 1539, 1551, 1631, 1629, 1606, 1612, 1610, 1554, 1874, 1886, 1815, 1821, 1809, 1808, 1859, 2719};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1.f f4723e;

    public p1(String str, String str2, String str3, int i10, i1.f fVar) {
        this.f4719a = str;
        this.f4720b = str2;
        this.f4721c = str3;
        this.f4722d = i10;
        this.f4723e = fVar;
        int iM7420 = C0378.m7420();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7420 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0044.m864("4R6neXkbsDcTZ5EqE0QtCigBarC")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۢۦۥ, reason: not valid java name and contains not printable characters */
    public static short[] m4196() {
        int iM9193 = C0472.m9193();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9193 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f283short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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

    public final boolean equals(Object obj) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (this == obj) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return true;
                case 239:
                    boolean z10 = obj instanceof p1;
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!z10) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                p1 p1Var = (p1) obj;
                                boolean zM4399 = C0228.m4399(C0231.m4452(this), C0231.m4452(p1Var));
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (!zM4399) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            boolean zM43910 = C0228.m4399(C0346.m6787(this), C0346.m6787(p1Var));
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        boolean zM43911 = C0228.m4399(C0189.m3615(this), C0189.m3615(p1Var));
                                                        int i14 = 48891;
                                                        while (true) {
                                                            i14 ^= 48908;
                                                            switch (i14) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    int iM6630 = C0337.m6630(this);
                                                                    int iM6631 = C0337.m6630(p1Var);
                                                                    int i15 = 49666;
                                                                    while (true) {
                                                                        i15 ^= 49683;
                                                                        switch (i15) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (iM6630 != iM6631) {
                                                                                    i15 = 49759;
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 76:
                                                                                return false;
                                                                            case 83:
                                                                                boolean zM43912 = C0228.m4399(C0195.m3739(this), C0195.m3739(p1Var));
                                                                                int i16 = 49790;
                                                                                while (true) {
                                                                                    i16 ^= 49807;
                                                                                    switch (i16) {
                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 51:
                                                                                            return true;
                                                                                        case 84:
                                                                                            return false;
                                                                                        case 241:
                                                                                            if (!zM43912) {
                                                                                                i16 = 49883;
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    i16 = 49852;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i15 = 49728;
                                                                    }
                                                                    break;
                                                                case 503:
                                                                    if (!zM43911) {
                                                                        i14 = 49635;
                                                                    }
                                                                    break;
                                                                case 32495:
                                                                    return false;
                                                                default:
                                                                    continue;
                                                            }
                                                            i14 = 48953;
                                                        }
                                                        break;
                                                    case 76:
                                                        return false;
                                                    case 239:
                                                        if (!zM43910) {
                                                            i13 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i13 = 48829;
                                            }
                                            break;
                                        case 47417:
                                            return false;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i12 = 48705;
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return false;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final int hashCode() {
        String str = "\u06e0\u06e2\u06df";
        i1.f fVarM3739 = null;
        String strM6787 = null;
        int iM7548 = 0;
        int i10 = 0;
        int iM8923 = 0;
        int iM2187 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747741:
                    str = "\u06e5\u06df\u06e0";
                    strM6787 = C0231.m4452(this);
                    break;
                case 1747773:
                    str = "\u06e5\u06e6\u06e6";
                    iM8923 = C0123.f149;
                    break;
                case 1748801:
                    return iM2187;
                case 1749668:
                    fVarM3739 = C0195.m3739(this);
                    str = "\u06e0\u06e0";
                    break;
                case 1750594:
                    str = "\u06e4\u06e0\u06e0";
                    strM6787 = C0189.m3615(this);
                    break;
                case 1750630:
                    str = "\u06e5\u06e0\u06df";
                    strM6787 = C0346.m6787(this);
                    break;
                case 1750662:
                    iM7548 = C0385.m7548(iM2187, iM8923, i10);
                    str = "\u06e2\u06e2\u06e4";
                    break;
                case 1751524:
                    str = "\u06e4\u06e1\u06e2";
                    iM8923 = C0458.m8923(strM6787, iM2187, i10);
                    break;
                case 1751557:
                    str = "\u06e3\u06e3\u06e6";
                    iM2187 = C0337.m6630(this);
                    break;
                case 1751588:
                    str = "\u06e3\u06e2\u06e5";
                    iM8923 = iM2187 * i10;
                    break;
                case 1752454:
                    str = "\u06e0\u06e3\u06e0";
                    iM2187 = C0429.m8418(strM6787);
                    break;
                case 1752484:
                    str = "\u06e3\u06e1\u06e0";
                    iM2187 = C0458.m8923(strM6787, iM8923, i10);
                    break;
                case 1752677:
                    str = "\u06e4\u06e2\u06e2";
                    i10 = iM8923 ^ (-388);
                    break;
                case 1753416:
                    str = "\u06e7\u06e5\u06e7";
                    iM8923 = 0 - iM2187;
                    break;
                case 1753639:
                    str = "\u06e1\u06e5\u06e5";
                    iM2187 = 0 - i10;
                    break;
                case 1754569:
                    str = "\u06e6\u06e6\u06e7";
                    i10 = iM8923 - iM7548;
                    break;
                default:
                    str = "\u06e6\u06df\u06e1";
                    iM2187 = C0113.m2187(fVarM3739);
                    break;
            }
        }
    }

    public final String toString() {
        String str = "\u06e8\u06e2\u06e7";
        StringBuilder sb = null;
        i1.f fVarM3739 = null;
        short[] sArrM4196 = null;
        String strM4452 = null;
        int i10 = 0;
        int iM6630 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56419:
                    C0142.m2728(sb, strM4452);
                    str = "\u06e1\u06e7\u06e3";
                    strM4452 = C0189.m3615(this);
                    break;
                case 56542:
                    iM6630 = i10 ^ 382;
                    str = "\u06e6\u06e7\u06e5";
                    strM4452 = C0068.m1331(sArrM4196, 41, iM6630, 1918);
                    break;
                case 1746720:
                    C0213.m4074(sb, fVarM3739);
                    str = "\u06e8\u06e6\u06e1";
                    sArrM4196 = m4196();
                    break;
                case 1746815:
                    iM6630 = C0337.m6630(this);
                    C0197.m3772(sb, iM6630);
                    str = "\u06e3\u06e3\u06e3";
                    break;
                case 1746820:
                    String strM5371 = C0277.m5371(sArrM4196, 33, i10, 1583);
                    C0142.m2728(sb, strM5371);
                    str = "\u06df\u06e3\u06e3";
                    strM4452 = strM5371;
                    break;
                case 1748643:
                    i10 = iM6630 ^ 518;
                    str = "\u06e3\u06e6";
                    strM4452 = C0011.m221(sArrM4196, 22, i10, 1766);
                    break;
                case 1748703:
                    String strM6787 = C0346.m6787(this);
                    C0142.m2728(sb, strM6787);
                    str = "\u06e3\u06e8\u06df";
                    strM4452 = strM6787;
                    break;
                case 1748706:
                    return C0440.m8605(sb);
                case 1748861:
                    C0142.m2728(sb, strM4452);
                    str = "\u06e3\u06e2\u06e6";
                    sArrM4196 = m4196();
                    break;
                case 1750631:
                    iM6630 = C0303.f451;
                    i10 = iM6630 ^ (-598);
                    str = "\u06df\u06e3\u06e8";
                    break;
                case 1750659:
                    short[] sArrM4197 = m4196();
                    i10 = C0082.f116;
                    str = "\u06e7\u06e5";
                    sArrM4196 = sArrM4197;
                    break;
                case 1751748:
                    iM6630 = C0353.f624;
                    i10 = iM6630 ^ 881;
                    str = "\u06e5\u06e1\u06e7";
                    break;
                case 1752523:
                    String strM3259 = C0170.m3259(sArrM4196, 14, i10, 2933);
                    C0142.m2728(sb, strM3259);
                    str = "\u06e1\u06e2\u06e0";
                    strM4452 = strM3259;
                    break;
                case 1753668:
                    C0142.m2728(sb, strM4452);
                    str = "\u06df\u06e0\u06e1";
                    fVarM3739 = C0195.m3739(this);
                    break;
                case 1754501:
                    sb = new StringBuilder(strM4452);
                    str = "\u06e8\u06e2\u06df";
                    strM4452 = C0231.m4452(this);
                    break;
                case 1754659:
                    i10 = iM6630 ^ (-771);
                    str = "\u06e7\u06e3\u06e1";
                    strM4452 = C0255.m4884(sArrM4196, 0, i10, 1751);
                    break;
                case 1755429:
                    C0142.m2728(sb, strM4452);
                    str = "\u06e4\u06e7\u06e7";
                    sArrM4196 = m4196();
                    break;
                case 1755437:
                    short[] sArrM4198 = m4196();
                    iM6630 = C0230.f310;
                    str = "\u06e7\u06e8\u06e4";
                    sArrM4196 = sArrM4198;
                    break;
                case 1755555:
                    String strM3243 = C0169.m3243(sArrM4196, 48, 1, 2742);
                    C0142.m2728(sb, strM3243);
                    str = "\u06e1\u06e2\u06e3";
                    strM4452 = strM3243;
                    break;
                default:
                    short[] sArrM4199 = m4196();
                    iM6630 = C0432.f703;
                    str = "\u06e1\u06e0\u06e2";
                    sArrM4196 = sArrM4199;
                    break;
            }
        }
    }
}
