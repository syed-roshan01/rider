package k6;

import a7.C0008;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.C0014;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.draw.C0029;
import androidx.startup.C0047;
import b7.C0054;
import c0.C0057;
import c3.C0062;
import c4.C0064;
import ca.C0070;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.firebase.C0205;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.components.C0135;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.ktx.C0199;
import d8.C0222;
import d9.C0224;
import d9.C0225;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.internal.modules.C0235;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.android.lifecycle.C0238;
import dagger.hilt.codegen.C0242;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.aggregatedroot.C0247;
import e1.C0258;
import ea.C0269;
import f0.C0272;
import f0.C0273;
import f1.C0274;
import f4.C0277;
import g.C0285;
import g4.C0290;
import g9.C0295;
import h5.C0307;
import ja.C0331;
import l8.C0347;
import m4.C0354;
import m5.C0355;
import o4.C0370;
import o8.C0372;
import org.json.JSONException;
import org.json.JSONObject;
import p0.C0374;
import p3.C0376;
import p7.C0379;
import q1.C0384;
import q6.C0389;
import r1.C0394;
import r2.C0397;
import s.C0409;
import s2.C0412;
import t1.C0420;
import t2.C0424;
import u.C0429;
import u3.C0435;
import u7.C0438;
import v.C0440;
import v5.C0446;
import w0.C0455;
import w9.C0466;
import x7.C0472;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m6 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f564short = {2689, 2716, 2712, 2704, 2694, 2689, 2708, 2712, 2693, 2132, 2129, 2113, 2130, 2138, 2135, 1924, 1920, 1935, 1930, 1927, 932, 933, 933, 944, 940, 937, 942, 939, 2861, 2828, 2831, 2828, 2843, 2843, 2828, 2829, 2889, 2861, 2828, 2828, 2841, 2889, 2853, 2816, 2823, 2818, 2889, 2816, 2842, 2889, 2828, 2820, 2841, 2845, 2832, 2887, 1810, 1843, 1840, 1843, 1828, 1828, 1843, 1842, 1910, 1810, 1843, 1843, 1830, 1910, 1818, 1855, 1848, 1853, 1910, 1824, 1847, 1850, 1855, 1842, 1847, 1826, 1855, 1849, 1848, 1910, 1840, 1847, 1855, 1850, 1843, 1842, 1912, 1910, 1841, 1845, 1850, 1855, 1842, 1914, 1910, 1841, 1844, 1828, 1847, 1855, 1842, 1914, 1910, 1842, 1843, 1843, 1830, 1910, 1850, 1855, 1848, 1853, 931, 898, 897, 898, 917, 917, 898, 899, 967, 931, 898, 898, 919, 967, 939, 910, 905, 908, 967, 913, 902, 907, 910, 899, 902, 915, 910, 904, 905, 967, 897, 902, 910, 907, 898, 899, 969, 967, 896, 900, 907, 910, 899, 971, 967, 899, 898, 898, 919, 967, 907, 910, 905, 908, 1683, 1711, 1701, 1727, 389, 389, 401, 866, 886, 887, 876, 3048, 3028, 3034, 3015, 946, 954, 954, 946, 953, 944, 1019, 948, 955, 948, 953, 940, 929, 956, 950, 934, 1019, 945, 944, 947, 944, 935, 935, 944, 945, 1019, 945, 944, 944, 933, 953, 956, 955, 958, 1019, 933, 935, 944, 947, 934, 2080, 2095, 2085, 2099, 2094, 2088, 2085, 2159, 2086, 2094, 2094, 2086, 2093, 2084, 2159, 2080, 2095, 2080, 2093, 2104, 2101, 2088, 2082, 2098, 2159, 2080, 2082, 2101, 2088, 2094, 2095, 2159, 2053, 2052, 2052, 2065, 2061, 2056, 2063, 2058, 2078, 2048, 2050, 2069, 2056, 2062, 2063, 572, 539, 531, 534, 543, 542, 602, 526, 533, 602, 522, 543, 520, 521, 531, 521, 526, 602, 574, 543, 540, 543, 520, 520, 543, 542, 602, 574, 543, 543, 522, 602, 566, 531, 532, 529, 596, 602, 543, 514, 537, 543, 522, 526, 531, 533, 532, 1314, 1285, 1293, 1288, 1281, 1280, 1348, 1296, 1291, 1348, 1300, 1285, 1302, 1303, 1281, 1348, 1296, 1292, 1281, 1348, 1312, 1281, 1282, 1281, 1302, 1302, 1281, 1280, 1348, 1312, 1281, 1281, 1300, 1348, 1320, 1293, 1290, 1295, 1348, 1302, 1281, 1303, 1300, 1291, 1290, 1303, 1281, 1354, 1348, 1281, 1308, 1287, 1281, 1300, 1296, 1293, 1291, 1290, 2158, 2127, 2124, 2127, 2136, 2136, 2127, 2126, 2058, 2158, 2127, 2127, 2138, 2058, 2150, 2115, 2116, 2113, 2058, 2136, 2127, 2137, 2138, 2117, 2116, 2137, 2127, 2058, 2127, 2119, 2138, 2142, 2131, 2052, 2581, 2622, 2607, 2604, 2612, 2601, 2608, 2683, 2569, 2622, 2602, 2606, 2622, 2600, 2607, 2683, 2621, 2612, 2601, 2683, 2591, 2622, 2621, 2622, 2601, 2601, 2622, 2623, 2683, 2591, 2622, 2622, 2603, 2683, 2583, 2610, 2613, 2608, 2683, 2621, 2618, 2610, 2615, 2622, 2623, 2677, 2683, 2601, 2622, 2600, 2603, 2612, 2613, 2600, 2622, 2679, 2683, 2622, 2595, 2616, 2622, 2603, 2607, 2610, 2612, 2613};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n6 f10208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Exception f10210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f10211d;

    /* JADX INFO: renamed from: ۣۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m6576() {
        int iM7283 = C0372.m7283();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7283 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f564short;
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

    /* JADX WARN: Code duplicated, block: B:157:0x0300 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x03b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x02af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x03b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x0367 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x03b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0366 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x02d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x03b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x02f0 A[DONT_GENERATE, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zM7365;
        int i10;
        int i11;
        boolean zM1883;
        int i12;
        boolean zM4376;
        int i13;
        int i14;
        g5 g5Var = (g5) C0235.m4518(C0158.m3017(this));
        String strM6943 = C0354.m6943(m6576(), 0, C0054.f74 ^ 327, 2805);
        String strM4303 = C0224.m4303(m6576(), 9, C0205.f229 ^ 427, 2099);
        String strM8396 = C0429.m8396(m6576(), 15, C0285.f429 ^ 989, 2019);
        String strM7757 = C0397.m7757(m6576(), 20, C0379.f649 ^ (-892), 960);
        String strM8581 = C0440.m8581();
        f5 f5VarM2283 = C0118.m2283(g5Var);
        d4 d4VarM3434 = C0180.m3434(f5VarM2283);
        int iM6959 = C0355.m6959(this);
        Exception excM6781 = C0347.m6781(this);
        int i15 = 1616;
        while (true) {
            i15 ^= 1633;
            switch (i15) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i15 = iM6959 != 200 ? 1709 : 1678;
                    break;
                case 204:
                    int i16 = 1740;
                    while (true) {
                        i16 ^= 1757;
                        switch (i16) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i16 = iM6959 != 204 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i17 = 1864;
                                while (true) {
                                    i17 ^= 1881;
                                    switch (i17) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i17 = iM6959 == 304 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            C0258.m4924(d4VarM3434);
                                            C0112.m2169(C0331.m6385(d4VarM3434), C0307.m5911(m6576(), 413, C0412.f682 ^ 103, 2651), C0057.m1083(iM6959), excM6781);
                                            break;
                                        case 47417:
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            break;
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
        int i18 = 48767;
        while (true) {
            i18 ^= 48784;
            switch (i18) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    C0258.m4924(d4VarM3434);
                    C0112.m2169(C0331.m6385(d4VarM3434), C0307.m5911(m6576(), 413, C0412.f682 ^ 103, 2651), C0057.m1083(iM6959), excM6781);
                    return;
                case 76:
                    l4 l4VarM4620 = C0242.m4620(f5VarM2283);
                    C0237.m4550(l4VarM4620);
                    C0374.m7332(C0023.m457(l4VarM4620), true);
                    byte[] bArrM5237 = C0272.m5237(this);
                    int i19 = 48891;
                    while (true) {
                        i19 ^= 48908;
                        switch (i19) {
                            case 22:
                                break;
                            case 53:
                                break;
                            case 503:
                                i19 = bArrM5237 != null ? 49635 : 48953;
                                break;
                            case 32495:
                                int length = bArrM5237.length;
                                int i20 = 49666;
                                while (true) {
                                    i20 ^= 49683;
                                    switch (i20) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (length == 0) {
                                                i20 = 49759;
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            int i21 = 49790;
                                            while (true) {
                                                i21 ^= 49807;
                                                switch (i21) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 241:
                                                        i21 = 49821;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 83:
                                            try {
                                                JSONObject jSONObject = new JSONObject(new String(bArrM5237));
                                                String strM4327 = C0225.m4327(jSONObject, strM7757, strM8581);
                                                String strM4328 = C0225.m4327(jSONObject, strM8396, strM8581);
                                                String strM4329 = C0225.m4327(jSONObject, strM4303, strM8581);
                                                double dM5122 = C0269.m5122(jSONObject, strM6943, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                                                boolean zM1884 = C0088.m1883(strM4327);
                                                int i22 = 49914;
                                                while (true) {
                                                    i22 ^= 49931;
                                                    switch (i22) {
                                                        case 497:
                                                            i22 = zM1884 ? 50658 : 50627;
                                                            break;
                                                        case 1711:
                                                            break;
                                                        case 1736:
                                                            Bundle bundle = new Bundle();
                                                            boolean zM2722 = C0141.m2722();
                                                            u7 u7VarM9185 = C0472.m9185(f5VarM2283);
                                                            int i23 = 51588;
                                                            while (true) {
                                                                i23 ^= 51605;
                                                                switch (i23) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i23 = zM2722 ? 51681 : 51650;
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 87:
                                                                        C0237.m4550(u7VarM9185);
                                                                        zM7365 = C0376.m7365(u7VarM9185, strM4327);
                                                                        i10 = 53510;
                                                                        while (true) {
                                                                            i10 ^= 53527;
                                                                            switch (i10) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i10 = !zM7365 ? 53603 : 53572;
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                case 83:
                                                                                    break;
                                                                                case 116:
                                                                                    C0258.m4924(d4VarM3434);
                                                                                    C0112.m2169(C0331.m6385(d4VarM3434), C0008.m172(m6576(), 118, C0199.f223 ^ (-2), 999), strM4328, strM4327);
                                                                                    i11 = 53634;
                                                                                    while (true) {
                                                                                        i11 ^= 53651;
                                                                                        switch (i11) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i11 = 53665;
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0236.m4526(bundle, strM8396, strM4328);
                                                                        C0236.m4526(bundle, C0022.m430(m6576(), 172, C0112.f138 ^ 572, 1740), C0370.m7239(m6576(), 176, C0435.f705 ^ 445, 481));
                                                                        C0168.m3222(C0222.m4277(f5VarM2283), C0054.m1043(m6576(), 179, C0347.f617 ^ (-765), 771), C0070.m1360(m6576(), 183, C0290.f434 ^ (-213), 2999), bundle);
                                                                        C0237.m4550(u7VarM9185);
                                                                        zM1883 = C0088.m1883(strM4327);
                                                                        i12 = 53758;
                                                                        while (true) {
                                                                            i12 ^= 53775;
                                                                            switch (i12) {
                                                                                case 1009:
                                                                                    i12 = !zM1883 ? 54502 : 54471;
                                                                                    break;
                                                                                case 1703:
                                                                                    break;
                                                                                case 1736:
                                                                                    break;
                                                                                case 1769:
                                                                                    try {
                                                                                        SharedPreferences.Editor editorM3199 = C0167.m3199(C0446.m8693(C0277.m5311(u7VarM9185), C0014.m279(m6576(), 187, C0047.f67 ^ 999, 981), 0));
                                                                                        C0384.m7519(editorM3199, strM7757, strM4327);
                                                                                        C0389.m7616(editorM3199, strM6943, C0273.m5251(dM5122));
                                                                                        zM4376 = C0228.m4376(editorM3199);
                                                                                        i13 = 54533;
                                                                                        while (true) {
                                                                                            i13 ^= 54550;
                                                                                            switch (i13) {
                                                                                                case 19:
                                                                                                    if (zM4376) {
                                                                                                        i13 = 54626;
                                                                                                    }
                                                                                                    break;
                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                    break;
                                                                                                case 85:
                                                                                                    break;
                                                                                                case 116:
                                                                                                    C0194.m3722(C0277.m5311(u7VarM9185), new Intent(C0247.m4720(m6576(), 227, C0394.f664 ^ 314, 2113)));
                                                                                                    i14 = 54657;
                                                                                                    while (true) {
                                                                                                        i14 ^= 54674;
                                                                                                        switch (i14) {
                                                                                                            case 19:
                                                                                                                i14 = 54688;
                                                                                                                break;
                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                            }
                                                                                            i13 = 54595;
                                                                                        }
                                                                                    } catch (RuntimeException e4) {
                                                                                        C0420.m8245(C0455.m8871(C0029.m572(u7VarM9185)), C0424.m8301(m6576(), 274, C0064.f84 ^ (-910), 634), e4);
                                                                                        int i24 = 55432;
                                                                                        while (true) {
                                                                                            i24 ^= 55449;
                                                                                            switch (i24) {
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i24 = 55463;
                                                                                                    break;
                                                                                                case 62:
                                                                                                    return;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 116:
                                                                        boolean zM3575 = C0187.m3575(C0438.m8535(f5VarM2283), null, C0295.m5668());
                                                                        int i25 = 51712;
                                                                        while (true) {
                                                                            i25 ^= 51729;
                                                                            switch (i25) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i25 = zM3575 ? 51805 : 51774;
                                                                                    break;
                                                                                case 47:
                                                                                    C0237.m4550(u7VarM9185);
                                                                                    zM7365 = C0376.m7365(u7VarM9185, strM4327);
                                                                                    i10 = 53510;
                                                                                    while (true) {
                                                                                        i10 ^= 53527;
                                                                                        switch (i10) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                if (!zM7365) {
                                                                                                }
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                break;
                                                                                            case 83:
                                                                                                break;
                                                                                            case 116:
                                                                                                C0258.m4924(d4VarM3434);
                                                                                                C0112.m2169(C0331.m6385(d4VarM3434), C0008.m172(m6576(), 118, C0199.f223 ^ (-2), 999), strM4328, strM4327);
                                                                                                i11 = 53634;
                                                                                                while (true) {
                                                                                                    i11 ^= 53651;
                                                                                                    switch (i11) {
                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i11 = 53665;
                                                                                                            break;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    C0236.m4526(bundle, strM8396, strM4328);
                                                                                    C0236.m4526(bundle, C0022.m430(m6576(), 172, C0112.f138 ^ 572, 1740), C0370.m7239(m6576(), 176, C0435.f705 ^ 445, 481));
                                                                                    C0168.m3222(C0222.m4277(f5VarM2283), C0054.m1043(m6576(), 179, C0347.f617 ^ (-765), 771), C0070.m1360(m6576(), 183, C0290.f434 ^ (-213), 2999), bundle);
                                                                                    C0237.m4550(u7VarM9185);
                                                                                    zM1883 = C0088.m1883(strM4327);
                                                                                    i12 = 53758;
                                                                                    while (true) {
                                                                                        i12 ^= 53775;
                                                                                        switch (i12) {
                                                                                            case 1009:
                                                                                                if (!zM1883) {
                                                                                                }
                                                                                                break;
                                                                                            case 1703:
                                                                                                break;
                                                                                            case 1736:
                                                                                                break;
                                                                                            case 1769:
                                                                                                SharedPreferences.Editor editorM31910 = C0167.m3199(C0446.m8693(C0277.m5311(u7VarM9185), C0014.m279(m6576(), 187, C0047.f67 ^ 999, 981), 0));
                                                                                                C0384.m7519(editorM31910, strM7757, strM4327);
                                                                                                C0389.m7616(editorM31910, strM6943, C0273.m5251(dM5122));
                                                                                                zM4376 = C0228.m4376(editorM31910);
                                                                                                i13 = 54533;
                                                                                                while (true) {
                                                                                                    i13 ^= 54550;
                                                                                                    switch (i13) {
                                                                                                        case 19:
                                                                                                            if (zM4376) {
                                                                                                                i13 = 54626;
                                                                                                            }
                                                                                                            break;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                            break;
                                                                                                        case 85:
                                                                                                            break;
                                                                                                        case 116:
                                                                                                            C0194.m3722(C0277.m5311(u7VarM9185), new Intent(C0247.m4720(m6576(), 227, C0394.f664 ^ 314, 2113)));
                                                                                                            i14 = 54657;
                                                                                                            while (true) {
                                                                                                                i14 ^= 54674;
                                                                                                                switch (i14) {
                                                                                                                    case 19:
                                                                                                                        i14 = 54688;
                                                                                                                        break;
                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        default:
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                    }
                                                                                                    i13 = 54595;
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 76:
                                                                                    C0237.m4550(u7VarM9185);
                                                                                    boolean zM7366 = C0376.m7365(u7VarM9185, strM4327);
                                                                                    int i26 = 51836;
                                                                                    while (true) {
                                                                                        i26 ^= 51853;
                                                                                        switch (i26) {
                                                                                            case 241:
                                                                                                i26 = !zM7366 ? 52580 : 52549;
                                                                                                break;
                                                                                            case 1963:
                                                                                                break;
                                                                                            case 1992:
                                                                                                C0236.m4526(bundle, strM4303, strM4329);
                                                                                                int i27 = 52735;
                                                                                                while (true) {
                                                                                                    i27 ^= 52752;
                                                                                                    switch (i27) {
                                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                                            break;
                                                                                                        case 1007:
                                                                                                            i27 = 52766;
                                                                                                            continue;
                                                                                                        default:
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 2025:
                                                                                                C0258.m4924(d4VarM3434);
                                                                                                C0238.m4564(C0331.m6385(d4VarM3434), C0409.m8010(m6576(), 56, C0235.f314 ^ 988, 1878), strM4328, strM4329, strM4327);
                                                                                                int i28 = 52611;
                                                                                                while (true) {
                                                                                                    i28 ^= 52628;
                                                                                                    switch (i28) {
                                                                                                        case 23:
                                                                                                            i28 = 52642;
                                                                                                            break;
                                                                                                        case 54:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    C0236.m4526(bundle, strM8396, strM4328);
                                                                                    C0236.m4526(bundle, C0022.m430(m6576(), 172, C0112.f138 ^ 572, 1740), C0370.m7239(m6576(), 176, C0435.f705 ^ 445, 481));
                                                                                    C0168.m3222(C0222.m4277(f5VarM2283), C0054.m1043(m6576(), 179, C0347.f617 ^ (-765), 771), C0070.m1360(m6576(), 183, C0290.f434 ^ (-213), 2999), bundle);
                                                                                    C0237.m4550(u7VarM9185);
                                                                                    zM1883 = C0088.m1883(strM4327);
                                                                                    i12 = 53758;
                                                                                    while (true) {
                                                                                        i12 ^= 53775;
                                                                                        switch (i12) {
                                                                                            case 1009:
                                                                                                if (!zM1883) {
                                                                                                }
                                                                                                break;
                                                                                            case 1703:
                                                                                                break;
                                                                                            case 1736:
                                                                                                break;
                                                                                            case 1769:
                                                                                                SharedPreferences.Editor editorM31911 = C0167.m3199(C0446.m8693(C0277.m5311(u7VarM9185), C0014.m279(m6576(), 187, C0047.f67 ^ 999, 981), 0));
                                                                                                C0384.m7519(editorM31911, strM7757, strM4327);
                                                                                                C0389.m7616(editorM31911, strM6943, C0273.m5251(dM5122));
                                                                                                zM4376 = C0228.m4376(editorM31911);
                                                                                                i13 = 54533;
                                                                                                while (true) {
                                                                                                    i13 ^= 54550;
                                                                                                    switch (i13) {
                                                                                                        case 19:
                                                                                                            if (zM4376) {
                                                                                                                i13 = 54626;
                                                                                                            }
                                                                                                            break;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                            break;
                                                                                                        case 85:
                                                                                                            break;
                                                                                                        case 116:
                                                                                                            C0194.m3722(C0277.m5311(u7VarM9185), new Intent(C0247.m4720(m6576(), 227, C0394.f664 ^ 314, 2113)));
                                                                                                            i14 = 54657;
                                                                                                            while (true) {
                                                                                                                i14 ^= 54674;
                                                                                                                switch (i14) {
                                                                                                                    case 19:
                                                                                                                        i14 = 54688;
                                                                                                                        break;
                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        default:
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                    }
                                                                                                    i13 = 54595;
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 1769:
                                                            C0258.m4924(d4VarM3434);
                                                            C0135.m2604(C0466.m9073(d4VarM3434), C0027.m527(m6576(), 28, C0274.f389 ^ 440, 2921));
                                                            int i29 = 50689;
                                                            while (true) {
                                                                i29 ^= 50706;
                                                                switch (i29) {
                                                                    case 19:
                                                                        i29 = 50720;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                            } catch (JSONException e10) {
                                                int i30 = 50813;
                                                while (true) {
                                                    i30 ^= 50830;
                                                    switch (i30) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            C0258.m4924(d4VarM3434);
                                                            C0420.m8245(C0455.m8871(d4VarM3434), C0081.m1741(m6576(), 321, C0062.f82 ^ 376, 1380), e10);
                                                            int i31 = 55556;
                                                            while (true) {
                                                                i31 ^= 55573;
                                                                switch (i31) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i31 = 55587;
                                                                        break;
                                                                    case 54:
                                                                        return;
                                                                }
                                                            }
                                                            break;
                                                        case 243:
                                                            i30 = 50844;
                                                            break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i20 = 49728;
                                }
                                break;
                            default:
                                break;
                        }
                        return;
                    }
                    C0258.m4924(d4VarM3434);
                    C0135.m2604(C0466.m9073(d4VarM3434), C0085.m1814(m6576(), 379, C0244.f323 ^ 82, 2090));
                    int i32 = 55680;
                    while (true) {
                        i32 ^= 55697;
                        switch (i32) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i32 = 56362;
                                break;
                            case 1467:
                                return;
                        }
                    }
                    break;
                case 239:
                    if (excM6781 == null) {
                        i18 = 48860;
                    }
                    break;
                default:
                    continue;
            }
            i18 = 48829;
        }
    }
}
