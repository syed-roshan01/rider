package k6;

import a2.C0005;
import android.os.Bundle;
import androidx.annotation.C0019;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.layout.C0036;
import c7.C0069;
import ca.C0070;
import com.auto.accept.service.C0072;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.C0128;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.tracing.C0204;
import com.google.gson.internal.sql.C0208;
import d1.C0212;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.codegen.C0243;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.C0254;
import dagger.hilt.internal.generatesrootinput.C0251;
import f.C0271;
import fa.C0282;
import g3.C0289;
import g4.C0290;
import g5.C0291;
import h3.C0304;
import i6.C0320;
import java.util.Iterator;
import l3.C0343;
import l6.C0345;
import l8.C0347;
import la.C0349;
import m1.C0352;
import m4.C0354;
import m7.C0357;
import o4.C0370;
import okhttp3.internal.publicsuffix.C0373;
import p4.C0377;
import q0.C0382;
import r.C0393;
import s6.C0414;
import s7.C0415;
import s8.C0417;
import s8.C0418;
import t1.C0420;
import t2.C0423;
import t9.C0428;
import u8.C0439;
import v.C0440;
import v5.C0446;
import v9.C0453;
import w0.C0455;
import w2.C0458;
import w5.C0463;
import w5.C0464;
import w6.C0465;
import z7.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class q extends q3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f575short = {1357, 1388, 1399, 1315, 1391, 1388, 1380, 1380, 1386, 1389, 1380, 1315, 1378, 1383, 1315, 1382, 1403, 1395, 1388, 1392, 1398, 1393, 1382, 1325, 1315, 1357, 1388, 1315, 1378, 1376, 1399, 1386, 1397, 1382, 1315, 1378, 1376, 1399, 1386, 1397, 1386, 1399, 1402, 1873, 1904, 1899, 1855, 1907, 1904, 1912, 1912, 1910, 1905, 1912, 1855, 1918, 1915, 1855, 1914, 1895, 1903, 1904, 1900, 1898, 1901, 1914, 1841, 1855, 1875, 1914, 1900, 1900, 1855, 1899, 1911, 1918, 1905, 1855, 1838, 1839, 1839, 1839, 1855, 1906, 1900, 1841, 1855, 1914, 1895, 1903, 1904, 1900, 1898, 1901, 1914, 3013, 3042, 3054, 484, 488, 2229, 2194, 2187, 2896, 2933, 2865, 2916, 2943, 2936, 2917, 2865, 2936, 2933, 2865, 2940, 2916, 2914, 2917, 2865, 2931, 2932, 2865, 2928, 2865, 2943, 2942, 2943, 2876, 2932, 2940, 2913, 2917, 2920, 2865, 2914, 2917, 2915, 2936, 2943, 2934, 2057, 2088, 2099, 2151, 2091, 2088, 2080, 2080, 2094, 2089, 2080, 2151, 2086, 2083, 2151, 2098, 2089, 2094, 2099, 2151, 2082, 2111, 2103, 2088, 2100, 2098, 2101, 2082, 2153, 2151, 2057, 2088, 2151, 2086, 2084, 2099, 2094, 2097, 2082, 2151, 2086, 2084, 2099, 2094, 2097, 2094, 2099, 2110, 2134, 2167, 2156, 2104, 2164, 2167, 2175, 2175, 2161, 2166, 2175, 2104, 2169, 2172, 2104, 2157, 2166, 2161, 2156, 2104, 2173, 2144, 2152, 2167, 2155, 2157, 2154, 2173, 2102, 2104, 2132, 2173, 2155, 2155, 2104, 2156, 2160, 2169, 2166, 2104, 2089, 2088, 2088, 2088, 2104, 2165, 2155, 2102, 2104, 2173, 2144, 2152, 2167, 2155, 2157, 2154, 2173, 2091, 2069, 2077, 3285, 3314, 3326, 2571, 2567, 2455, 2480, 2493, 1025, 1060, 1120, 1077, 1070, 1065, 1076, 1120, 1065, 1060, 1120, 1069, 1077, 1075, 1076, 1120, 1058, 1061, 1120, 1057, 1120, 1070, 1071, 1070, 1133, 1061, 1069, 1072, 1076, 1081, 1120, 1075, 1076, 1074, 1065, 1070, 1063};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q.f f10312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q.f f10313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10314d;

    public q(f5 f5Var) {
        C0271.m5173(f5Var);
        this.f6226a = f5Var;
        this.f10313c = new q.f(0);
        this.f10312b = new q.f(0);
        int iM5443 = C0282.m5443();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5443 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0189.m3602("jTGiJ")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6587() {
        int iM8692 = C0446.m8692();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8692 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f575short;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001f. Please report as an issue. */
    public final void s(long j10) {
        q6 q6VarM7299 = C0373.m7299(C0347.m6778(this), false);
        q.f fVarM7684 = C0393.m7684(this);
        Iterator itM2319 = C0120.m2319((q.c) C0005.m108(fVarM7684));
        while (true) {
            boolean zM3327 = C0174.m3327(itM2319);
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i10 = zM3327 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                boolean zM9034 = C0464.m9034(fVarM7684);
                int i11 = 1864;
                while (true) {
                    i11 ^= 1881;
                    switch (i11) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (!zM9034) {
                                i11 = 48736;
                            }
                            break;
                        case 47384:
                            break;
                        case 47417:
                            C0158.m3018(this, ((21 + j10) - C0251.m4792(this)) - 21, q6VarM7299);
                            break;
                        case 47483:
                            break;
                        default:
                            continue;
                    }
                    i11 = 48705;
                }
                C0191.m3646(this, j10);
                int iM8371 = C0428.m8371();
                int i12 = 48767;
                while (true) {
                    i12 ^= 48784;
                    switch (i12) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            return;
                        case 76:
                            System.out.println(Double.decode(C0005.m109("5DaGJUSfLM")));
                            return;
                        case 239:
                            if (iM8371 >= 0) {
                                i12 = 48860;
                            }
                            break;
                        default:
                            continue;
                    }
                    i12 = 48829;
                }
            }
            String str = (String) C0414.m8115(itM2319);
            C0212.m4039(this, str, ((28 + j10) - C0491.m9543((Long) C0183.m3495(fVarM7684, str))) - 28, q6VarM7299);
            int i13 = 1740;
            while (true) {
                i13 ^= 1757;
                switch (i13) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i13 = 1771;
                        break;
                    case 54:
                        break;
                }
            }
        }
    }

    public final void t(long j10, q6 q6Var) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (q6Var == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    d4 d4VarM572 = C0029.m572(this);
                    C0135.m2604(C0136.m2634(d4VarM572), C0072.m1553(m6587(), 0, C0415.f685 ^ (-446), 1283));
                    int iM6746 = C0345.m6746();
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM6746 <= 0) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                System.out.println(Double.decode(C0090.m1935("714wEHKd")));
                                return;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    int i12 = 1864;
                    while (true) {
                        i12 ^= 1881;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (j10 < 1000) {
                                    i12 = 48736;
                                }
                                break;
                            case 47384:
                                Bundle bundle = new Bundle();
                                C0491.m9555(bundle, C0204.m3906(m6587(), 95, C0019.f39 ^ (-73), 2970), j10);
                                C0465.m9060(q6Var, bundle, true);
                                C0168.m3222(C0128.m2464(this), C0291.m5593(m6587(), 98, C0024.f44 ^ 533, 389), C0382.m7474(m6587(), 100, C0440.f710 ^ 967, 2282), bundle);
                                return;
                            case 47417:
                                d4 d4VarM573 = C0029.m572(this);
                                C0420.m8245(C0136.m2634(d4VarM573), C0081.m1741(m6587(), 43, C0418.f688 ^ 553, 1823), C0439.m8554(j10));
                                return;
                            case 47483:
                                break;
                            default:
                                continue;
                        }
                        i12 = 48705;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final void u(String str, long j10) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = str != null ? 1709 : 1678;
                    break;
                case 204:
                    int iM8181 = C0417.m8181(str);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM8181 == 0 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                C0343.m6719(C0208.m3979(this), new b(this, str, j10, 0));
                                break;
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
            return;
        }
        C0135.m2604(C0455.m8871(C0029.m572(this)), C0377.m7387(m6587(), 103, C0458.f728 ^ 356, 2833));
        int iM4660 = C0243.m4660();
        int i13 = 48767;
        while (true) {
            i13 ^= 48784;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    return;
                case 76:
                    System.out.println(Double.decode(C0414.m8117("T2Ez")));
                    return;
                case 239:
                    if (iM4660 >= 0) {
                        i13 = 48860;
                    }
                    break;
                default:
                    continue;
            }
            i13 = 48829;
        }
    }

    public final void v(String str, long j10, q6 q6Var) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (q6Var == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    d4 d4VarM572 = C0029.m572(this);
                    C0135.m2604(C0136.m2634(d4VarM572), C0149.m2854(m6587(), 140, C0175.f199 ^ 514, 2119));
                    return;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (j10 < 1000) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                Bundle bundle = new Bundle();
                                C0236.m4526(bundle, C0070.m1360(m6587(), 245, C0237.f316 ^ (-775), 2164), str);
                                C0491.m9555(bundle, C0453.m8812(m6587(), 248, C0290.f434 ^ (-212), 3210), j10);
                                C0465.m9060(q6Var, bundle, true);
                                C0168.m3222(C0128.m2464(this), C0370.m7239(m6587(), 251, C0354.f624 ^ 891, 2666), C0357.m6992(m6587(), 253, C0069.f89 ^ (-811), 2504), bundle);
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                d4 d4VarM573 = C0029.m572(this);
                                C0420.m8245(C0136.m2634(d4VarM573), C0349.m6825(m6587(), 188, C0352.f622 ^ 559, 2072), C0439.m8554(j10));
                                int iM4678 = C0244.m4678();
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (iM4678 <= 0) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            return;
                                        case 47417:
                                            System.out.println(Integer.decode(C0423.m8292("crdbb325iTmIpQ8XkZSkMLUCrczzE")));
                                            return;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i12 = 48705;
                                }
                                break;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    public final void w(long j10) {
        q.f fVarM7684 = C0393.m7684(this);
        Iterator itM2319 = C0120.m2319((q.c) C0005.m108(fVarM7684));
        while (true) {
            boolean zM3327 = C0174.m3327(itM2319);
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i10 = zM3327 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                boolean zM9034 = C0464.m9034(fVarM7684);
                int i11 = 1864;
                while (true) {
                    i11 ^= 1881;
                    switch (i11) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (!zM9034) {
                                i11 = 48736;
                            }
                            break;
                        case 47384:
                            break;
                        case 47417:
                            this.f10314d = j10;
                            break;
                        case 47483:
                            break;
                        default:
                            continue;
                    }
                    i11 = 48705;
                }
                int iM1701 = C0079.m1701();
                int i12 = 48767;
                while (true) {
                    i12 ^= 48784;
                    switch (i12) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            return;
                        case 76:
                            System.out.println(Float.valueOf(C0304.m5860("Z6dv9gcs")));
                            return;
                        case 239:
                            if (iM1701 <= 0) {
                                i12 = 48860;
                            }
                            break;
                        default:
                            continue;
                    }
                    i12 = 48829;
                }
            }
            C0289.m5548(fVarM7684, (String) C0414.m8115(itM2319), C0439.m8554(j10));
            int i13 = 1740;
            while (true) {
                i13 ^= 1757;
                switch (i13) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i13 = 1771;
                        break;
                    case 54:
                        break;
                }
            }
        }
    }

    public final void x(String str, long j10) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = str != null ? 1709 : 1678;
                    break;
                case 204:
                    int iM8181 = C0417.m8181(str);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM8181 == 0 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                C0343.m6719(C0208.m3979(this), new b(this, str, j10, 1));
                                int iM4844 = C0254.m4844();
                                int i12 = 48767;
                                while (true) {
                                    i12 ^= 48784;
                                    switch (i12) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            break;
                                        case 76:
                                            System.out.println(Long.parseLong(C0320.m6178("RSPK46AwPUIUgy8IFCxPFg")));
                                            break;
                                        case 239:
                                            i12 = iM4844 > 0 ? 48829 : 48860;
                                            break;
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i13 = 48674;
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
            return;
        }
        C0135.m2604(C0455.m8871(C0029.m572(this)), C0036.m713(m6587(), 256, C0463.f733 ^ 272, 1088));
    }
}
