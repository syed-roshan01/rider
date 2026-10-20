package k6;

import a.C0000;
import a.C0001;
import a2.C0005;
import a8.C0009;
import aa.C0011;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.graphics.C0030;
import b7.C0053;
import c0.C0057;
import c1.C0059;
import c7.C0069;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.components.C0135;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.bind.C0206;
import d9.C0225;
import d9.C0226;
import dagger.hilt.android.C0240;
import dagger.hilt.internal.definecomponent.C0249;
import dagger.hilt.migration.C0254;
import e0.C0256;
import e2.C0261;
import ea.C0268;
import f.C0270;
import f0.C0271;
import f4.C0276;
import fa.C0281;
import g.C0284;
import g3.C0288;
import ga.C0295;
import h5.C0307;
import h5.C0308;
import i.C0315;
import i6.C0319;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l2.C0341;
import l6.C0343;
import m5.C0355;
import m7.C0358;
import n9.C0366;
import s.C0408;
import t1.C0419;
import t2.C0421;
import t2.C0422;
import t3.C0424;
import u.C0429;
import u1.C0432;
import u4.C0436;
import u8.C0438;
import v.C0439;
import v5.C0445;
import v6.C0446;
import v8.C0450;
import w0.C0454;
import w1.C0455;
import w4.C0461;
import w6.C0464;
import y.C0475;
import y9.C0478;
import z2.C0484;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public final class f extends f4.y {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f540short = {2281, 2296, 2296, 2263, 2277, 2285, 2281, 2299, 2301, 2298, 2285, 2277, 2285, 2278, 2300, 2263, 2276, 2273, 2300, 2285, 2544, 2519, 2527, 2522, 2515, 2514, 2454, 2498, 2521, 2454, 2522, 2521, 2519, 2514, 2454, 2523, 2515, 2498, 2519, 2514, 2519, 2498, 2519, 2444, 2454, 2534, 2519, 2517, 2525, 2519, 2513, 2515, 2555, 2519, 2520, 2519, 2513, 2515, 2500, 2454, 2527, 2501, 2454, 2520, 2499, 2522, 2522, 2022, 1985, 1993, 1996, 1989, 1988, 1920, 2004, 1999, 1920, 1996, 1999, 1985, 1988, 1920, 1997, 1989, 2004, 1985, 1988, 1985, 2004, 1985, 1946, 1920, 2017, 2000, 2000, 1996, 1993, 1987, 1985, 2004, 1993, 1999, 1998, 2025, 1998, 1990, 1999, 1920, 1993, 2003, 1920, 1998, 2005, 1996, 1996, 2118, 2145, 2153, 2156, 2149, 2148, 2080, 2164, 2159, 2080, 2156, 2159, 2145, 2148, 2080, 2157, 2149, 2164, 2145, 2148, 2145, 2164, 2145, 2106, 2080, 2128, 2145, 2147, 2155, 2145, 2151, 2149, 2080, 2158, 2145, 2157, 2149, 2080, 2158, 2159, 2164, 2080, 2150, 2159, 2165, 2158, 2148, 2219, 2212, 2222, 2232, 2213, 2211, 2222, 2276, 2213, 2233, 2276, 2201, 2227, 2233, 2238, 2223, 2215, 2202, 2232, 2213, 2234, 2223, 2232, 2238, 2211, 2223, 2233, 1500, 1502, 1487, 1316, 1294, 1284, 1283, 1298, 1306, 1319, 1285, 1304, 1287, 1298, 1285, 1283, 1310, 1298, 1284, 1369, 1296, 1298, 1283, 1375, 1374, 1367, 1283, 1311, 1285, 1298, 1280, 1367, 1302, 1305, 1367, 1298, 1295, 1300, 1298, 1287, 1283, 1310, 1304, 1305, 1665, 1709, 1719, 1710, 1702, 1762, 1708, 1709, 1718, 1762, 1699, 1697, 1697, 1703, 1713, 1713, 1762, 1681, 1723, 1713, 1718, 1703, 1711, 1682, 1712, 1709, 1714, 1703, 1712, 1718, 1707, 1703, 1713, 1772, 1701, 1703, 1718, 1770, 1771, 842, 870, 892, 869, 877, 809, 871, 870, 893, 809, 879, 864, 871, 877, 809, 858, 880, 890, 893, 876, 868, 857, 891, 870, 889, 876, 891, 893, 864, 876, 890, 807, 878, 876, 893, 801, 800, 809, 868, 876, 893, 865, 870, 877, 498, 478, 452, 477, 469, 401, 479, 478, 453, 401, 471, 472, 479, 469, 401, 482, 456, 450, 453, 468, 476, 481, 451, 478, 449, 468, 451, 453, 472, 468, 450, 401, 466, 477, 464, 450, 450, 1513, 1285, 1314, 1322, 1327, 1318, 1319, 1379, 1335, 1324, 1379, 1327, 1324, 1314, 1319, 1379, 1326, 1318, 1335, 1314, 1319, 1314, 1335, 1314, 1401, 1379, 1294, 1318, 1335, 1314, 1319, 1314, 1335, 1314, 1379, 1313, 1334, 1325, 1319, 1327, 1318, 1379, 1322, 1328, 1379, 1325, 1334, 1327, 1327, 2808, 2800, 2804, 2790, 2784, 2791, 2800, 2808, 2800, 2811, 2785, 2747, 2800, 2787, 2800, 2811, 2785, 2762, 2790, 2804, 2808, 2789, 2809, 2812, 2811, 2802, 2762, 2800, 2811, 2804, 2807, 2809, 2800, 2801, 1735, 1309, 1301, 1301, 1309, 1302, 1311, 1317, 1307, 1300, 1307, 1302, 1283, 1294, 1299, 1305, 1289, 1317, 1307, 1295, 1294, 1301, 1303, 1307, 1294, 1299, 1305, 1317, 1289, 1305, 1288, 1311, 1311, 1300, 1317, 1288, 1311, 1290, 1301, 1288, 1294, 1299, 1300, 1309, 1317, 1311, 1300, 1307, 1304, 1302, 1311, 1310};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f10013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f10014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f10015d;

    public static long y() {
        return C0490.m9543((Long) C0261.m4995(C0461.m8991(), null));
    }

    /* JADX INFO: renamed from: ۣۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m6552() {
        int iM4866 = C0254.m4866();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4866 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f540short;
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

    public final boolean A() {
        Boolean boolM5961 = C0308.m5961(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = boolM5961 == null ? 1709 : 1678;
                    break;
                case 204:
                    Boolean boolM8320 = C0424.m8320(this, C0178.m3395(m6552(), 0, C0011.f31 ^ 368, 2184));
                    this.f10013b = boolM8320;
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = boolM8320 == null ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                this.f10013b = C0455.m8876();
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        boolean zM14 = C0000.m14(C0308.m5961(this));
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i12 = !zM14 ? 48736 : 48705;
                    break;
                case 47384:
                    break;
                case 47417:
                    boolean zM588 = C0030.m588((f5) C0163.m3121(this));
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                return false;
                            case 76:
                                int i14 = 48891;
                                while (true) {
                                    i14 ^= 48908;
                                    switch (i14) {
                                        case 22:
                                            break;
                                        case 503:
                                            i14 = 48922;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 239:
                                i13 = !zM588 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 47483:
                    break;
                default:
                    break;
            }
        }
        return true;
    }

    public final Bundle B() {
        Bundle bundleM4337 = null;
        try {
            PackageManager packageManagerM8279 = C0421.m8279(C0276.m5311(this));
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        if (packageManagerM8279 == null) {
                            i10 = 1709;
                        }
                        break;
                    case 204:
                        C0135.m2604(C0454.m8871(C0029.m572(this)), C0226.m4371(m6552(), 20, C0419.f690 ^ 117, 2486));
                        break;
                    case 239:
                        ApplicationInfo applicationInfoM5685 = C0295.m5685(C0478.m9334(C0276.m5311(this)), C0206.f230 ^ 229, C0445.m8680(C0276.m5311(this)));
                        int i11 = 1864;
                        while (true) {
                            i11 ^= 1881;
                            switch (i11) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    if (applicationInfoM5685 == null) {
                                        i11 = 48736;
                                    }
                                    break;
                                case 47384:
                                    bundleM4337 = C0225.m4337(applicationInfoM5685);
                                    break;
                                case 47417:
                                    C0135.m2604(C0454.m8871(C0029.m572(this)), C0475.m9255(m6552(), 67, C0195.f219 ^ (-904), 1952));
                                    break;
                                case 47483:
                                    break;
                                default:
                                    continue;
                            }
                            i11 = 48705;
                        }
                        break;
                    default:
                        continue;
                }
                i10 = 1678;
            }
        } catch (PackageManager.NameNotFoundException e4) {
            int i12 = 1740;
            while (true) {
                i12 ^= 1757;
                switch (i12) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i12 = 1771;
                        break;
                    case 54:
                        d4 d4VarM572 = C0029.m572(this);
                        C0419.m8245(C0454.m8871(d4VarM572), C0194.m3711(m6552(), 115, C0288.f433 ^ 728, 2048), e4);
                        break;
                }
            }
        }
        return bundleM4337;
    }

    public final double m(String str, x3 x3Var) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (str == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return C0112.m2157((Double) C0261.m4995(x3Var, null));
                case 239:
                    String strM2221 = C0115.m2221(C0069.m1336(this), str, C0484.m9425(x3Var));
                    boolean zM1883 = C0088.m1883(strM2221);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM1883) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                try {
                                    return C0112.m2157((Double) C0261.m4995(x3Var, C0422.m8281(C0450.m8791(strM2221))));
                                } catch (NumberFormatException e4) {
                                    return C0112.m2157((Double) C0261.m4995(x3Var, null));
                                }
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return C0112.m2157((Double) C0261.m4995(x3Var, null));
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

    public final String n(String str) {
        String strM8581 = C0439.m8581();
        try {
            Method methodM1121 = C0059.m1121(C0408.m8013(C0341.m6689(m6552(), 162, C0355.f626 ^ (-107), 2250)), C0464.m9053(m6552(), 189, C0436.f707 ^ (-284), 1467), new Class[]{String.class, String.class});
            Object[] objArr = new Object[2];
            objArr[C0249.f329 ^ (-828)] = str;
            objArr[C0005.f1063 ^ 521] = strM8581;
            String str2 = (String) C0116.m2245(methodM1121, null, objArr);
            C0270.m5173(str2);
            return str2;
        } catch (ClassNotFoundException e4) {
            int i10 = 48767;
            while (true) {
                i10 ^= 48784;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        C0419.m8245(C0454.m8871(C0029.m572(this)), C0053.m1023(m6552(), 316, C0126.f152 ^ (-235), 433), e4);
                        return strM8581;
                    case 239:
                        i10 = 48798;
                        break;
                }
            }
        } catch (IllegalAccessException e10) {
            int i11 = 1740;
            while (true) {
                i11 ^= 1757;
                switch (i11) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i11 = 1771;
                        continue;
                    case 54:
                        C0419.m8245(C0454.m8871(C0029.m572(this)), C0422.m8293(m6552(), 233, C0001.f769 ^ (-1015), 1730), e10);
                        int i12 = 49666;
                        while (true) {
                            i12 ^= 49683;
                            switch (i12) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = 49697;
                                    continue;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                default:
                                    continue;
                            }
                        }
                        break;
                    default:
                        continue;
                }
                return strM8581;
            }
        } catch (NoSuchMethodException e11) {
            int i13 = 1864;
            while (true) {
                i13 ^= 1881;
                switch (i13) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i13 = 48674;
                        continue;
                    case 47483:
                        C0419.m8245(C0454.m8871(C0029.m572(this)), C0078.m1682(m6552(), 272, C0017.f37 ^ (-413), 777), e11);
                        int i14 = 49790;
                        while (true) {
                            i14 ^= 49807;
                            switch (i14) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case 241:
                                    i14 = 49821;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                        break;
                    default:
                        continue;
                }
                return strM8581;
            }
        } catch (InvocationTargetException e12) {
            int i15 = 1616;
            while (true) {
                i15 ^= 1633;
                switch (i15) {
                    case Code.UNAVAILABLE /* 14 */:
                        C0419.m8245(C0454.m8871(C0029.m572(this)), C0168.m3223(m6552(), 192, C0436.f707 ^ (-306), 1399), e12);
                        int i16 = 48891;
                        while (true) {
                            i16 ^= 48908;
                            switch (i16) {
                                case 22:
                                    break;
                                case 503:
                                    i16 = 48922;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                        break;
                    case 49:
                        i15 = 1647;
                        continue;
                    default:
                        continue;
                }
                return strM8581;
            }
        }
    }

    public final boolean o(x3 x3Var) {
        return C0187.m3575(this, null, x3Var);
    }

    public final int p(String str) {
        boolean zM8420 = C0429.m8420();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = zM8420 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM3575 = C0187.m3575(C0091.m1951(this), null, C0256.m4902());
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = zM3575 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return C0315.f463 ^ 1014;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        return C0017.f37 ^ (-469);
    }

    public final int q(String str, x3 x3Var) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (str == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return C0366.m7190((Integer) C0261.m4995(x3Var, null));
                case 239:
                    String strM2221 = C0115.m2221(C0069.m1336(this), str, C0484.m9425(x3Var));
                    boolean zM1883 = C0088.m1883(strM2221);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM1883) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                try {
                                    return C0366.m7190((Integer) C0261.m4995(x3Var, C0057.m1083(C0084.m1797(strM2221))));
                                } catch (NumberFormatException e4) {
                                    return C0366.m7190((Integer) C0261.m4995(x3Var, null));
                                }
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return C0366.m7190((Integer) C0261.m4995(x3Var, null));
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

    public final long r(String str, x3 x3Var) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (str == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return C0490.m9543((Long) C0261.m4995(x3Var, null));
                case 239:
                    String strM2221 = C0115.m2221(C0069.m1336(this), str, C0484.m9425(x3Var));
                    boolean zM1883 = C0088.m1883(strM2221);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM1883) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                try {
                                    return C0490.m9543((Long) C0261.m4995(x3Var, C0438.m8554(C0240.m4604(strM2221))));
                                } catch (NumberFormatException e4) {
                                    return C0490.m9543((Long) C0261.m4995(x3Var, null));
                                }
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return C0490.m9543((Long) C0261.m4995(x3Var, null));
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

    public final String s(String str, x3 x3Var) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (str == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return (String) C0261.m4995(x3Var, null);
                case 239:
                    return (String) C0261.m4995(x3Var, C0115.m2221(C0069.m1336(this), str, C0484.m9425(x3Var)));
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final int t(String str) {
        return C0000.m1(this, str, C0284.m5485());
    }

    public final boolean u(String str, x3 x3Var) {
        return C0187.m3575(this, str, x3Var);
    }

    public final boolean v(String str, x3 x3Var) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (str == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return C0000.m14((Boolean) C0261.m4995(x3Var, null));
                case 239:
                    String strM2221 = C0115.m2221(C0069.m1336(this), str, C0484.m9425(x3Var));
                    boolean zM1883 = C0088.m1883(strM2221);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM1883) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return C0000.m14((Boolean) C0261.m4995(x3Var, C0009.m192(C0016.m321(C0001.m32(m6552(), 353, 1, 1496), strM2221))));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return C0000.m14((Boolean) C0261.m4995(x3Var, null));
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

    public final Boolean w(String str) {
        C0281.m5438(str);
        Bundle bundleM5942 = C0307.m5942(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (bundleM5942 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    d4 d4VarM572 = C0029.m572(this);
                    C0135.m2604(C0454.m8871(d4VarM572), C0343.m6742(m6552(), 354, C0271.f387 ^ (-786), 1347));
                    return null;
                case 239:
                    boolean zM7033 = C0358.m7033(bundleM5942, str);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM7033) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return C0009.m192(C0150.m2885(bundleM5942, str));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return null;
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

    public final boolean x(String str) {
        String str2 = "\u06e7\u06e8\u06e0";
        String strM2221 = null;
        g gVarM1336 = null;
        String strM5933 = null;
        short[] sArrM6552 = null;
        boolean zM321 = false;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str2)) {
                case 56296:
                    strM2221 = C0115.m2221(gVarM1336, str, strM5933);
                    str2 = "\u06e2\u06e8\u06e4";
                    break;
                case 56420:
                    strM5933 = C0307.m5933(sArrM6552, 402, i10, 2709);
                    str2 = "\u06df\u06e7";
                    break;
                case 56507:
                    i10 = i11 ^ 238;
                    str2 = "\u06e3\u06e7";
                    break;
                case 1748767:
                    str = C0268.m5114(sArrM6552, 436, 1, 1782);
                    str2 = "\u06e6\u06e3\u06e3";
                    break;
                case 1749854:
                    sArrM6552 = m6552();
                    str2 = "\u06e1\u06e4\u06e2";
                    break;
                case 1753542:
                    zM321 = C0016.m321(str, strM2221);
                    str2 = "\u06e7\u06e2\u06df";
                    break;
                case 1754468:
                    return zM321;
                case 1754530:
                    sArrM6552 = m6552();
                    str2 = "\u06e0\u06e3\u06e1";
                    break;
                case 1754655:
                    gVarM1336 = C0069.m1336(this);
                    str2 = "\u06e7\u06e4\u06df";
                    break;
                default:
                    i11 = C0319.f467;
                    str2 = "\u06e6\u06e1";
                    break;
            }
        }
    }

    public final boolean z() {
        Boolean boolM8320 = C0424.m8320(this, C0446.m8698(m6552(), 437, C0432.f703 ^ 574, 1402));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = boolM8320 != null ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM14 = C0000.m14(boolM8320);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = zM14 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                return false;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = 48674;
                                            continue;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        return true;
    }
}
