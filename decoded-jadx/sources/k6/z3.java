package k6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.C0014;
import android.support.v4.graphics.drawable.C0016;
import androidx.appcompat.widget.C0020;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.input.pointer.C0034;
import androidx.compose.ui.layout.C0035;
import androidx.compose.ui.layout.C0036;
import androidx.core.app.C0040;
import androidx.core.content.C0041;
import androidx.versionedparcelable.C0048;
import b3.C0051;
import b8.C0055;
import c0.C0057;
import c1.C0058;
import c1.C0059;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.common.C0087;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.tasks.C0103;
import com.google.android.play.core.integrity.client.C0107;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.C0205;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.installations.C0177;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.measurement.C0182;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfig.ktx.C0199;
import d1.C0214;
import d7.C0219;
import dagger.hilt.android.C0240;
import dagger.hilt.android.internal.C0235;
import e2.C0261;
import e7.C0264;
import f.C0270;
import f4.C0276;
import fa.C0281;
import g.C0282;
import g.C0283;
import g5.C0290;
import g8.C0293;
import h.C0296;
import h1.C0300;
import h5.C0307;
import h6.C0309;
import i6.C0320;
import j2.C0323;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k3.C0335;
import k4.C0336;
import k8.C0338;
import l6.C0344;
import m1.C0350;
import m5.C0354;
import m7.C0358;
import n7.C0364;
import n9.C0366;
import o4.C0369;
import p0.C0374;
import p3.C0375;
import q0.C0382;
import q5.C0385;
import r2.C0396;
import r6.C0401;
import s.C0408;
import s2.C0411;
import s6.C0413;
import t0.C0418;
import t1.C0419;
import t2.C0421;
import t7.C0425;
import u7.C0437;
import v.C0439;
import v0.C0443;
import v5.C0445;
import v7.C0448;
import v8.C0450;
import w.C0453;
import w0.C0454;
import w2.C0458;
import w4.C0459;
import w4.C0460;
import w4.C0461;
import w9.C0465;
import x2.C0467;
import x7.C0471;
import x7.C0472;
import x8.C0473;
import y.C0474;
import y.C0475;
import y9.C0479;
import z.C0480;
import z.C0481;
import z2.C0484;
import z3.C0486;
import z7.C0490;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public final class z3 extends p2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f605short = {2254, 2273, 2286, 2275, 2294, 2299, 2278, 2284, 2300, 2223, 2268, 2299, 2272, 2301, 2286, 2280, 2282, 2223, 2284, 2272, 2273, 2300, 2282, 2273, 2299, 2223, 2278, 2300, 2223, 2273, 2272, 2299, 2223, 2280, 2301, 2286, 2273, 2299, 2282, 2283, 2294, 2275, 2272, 2273, 2219, 2714, 2689, 2712, 2712, 1884, 1885, 1862, 1810, 1884, 1863, 1886, 1886, 666, 685, 699, 685, 700, 700, 673, 678, 687, 744, 699, 685, 699, 699, 673, 679, 678, 744, 699, 700, 673, 700, 683, 672, 673, 678, 687, 744, 700, 679, 675, 685, 678, 744, 700, 679, 744, 749, 699, 893, 890, 892, 871, 864, 873, 2509, 2518, 2515, 2518, 2519, 2511, 2518, 3167, 3172, 3169, 3172, 3173, 3197, 3172, 1738, 1787, 1785, 1777, 1787, 1789, 1791, 1751, 1787, 1780, 1787, 1789, 1791, 1768, 1722, 1779, 1769, 1722, 1780, 1775, 1782, 1782, 1718, 1722, 1787, 1770, 1770, 1722, 1779, 1790, 1791, 1780, 1774, 1779, 1774, 1763, 1722, 1779, 1780, 1788, 1781, 1768, 1783, 1787, 1774, 1779, 1781, 1780, 1722, 1783, 1779, 1789, 1778, 1774, 1722, 1784, 1791, 1722, 1779, 1780, 1787, 1785, 1785, 1775, 1768, 1787, 1774, 1791, 1716, 1722, 1787, 1770, 1770, 1747, 1790, 272, 295, 295, 314, 295, 373, 295, 304, 289, 295, 316, 304, 291, 316, 315, 306, 373, 308, 293, 293, 373, 316, 315, 294, 289, 308, 313, 313, 304, 295, 373, 293, 308, 310, 318, 308, 306, 304, 373, 315, 308, 312, 304, 379, 373, 308, 293, 293, 284, 305, 1687, 1691, 1684, 1679, 1691, 1686, 1701, 1683, 1684, 1673, 1678, 1691, 1686, 1686, 3144, 3140, 3142, 3077, 3146, 3141, 3151, 3161, 3140, 3138, 3151, 3077, 3165, 3150, 3141, 3151, 3138, 3141, 3148, 661, 674, 674, 703, 674, 752, 674, 693, 676, 674, 697, 693, 678, 697, 702, 695, 752, 672, 689, 691, 699, 689, 695, 693, 752, 697, 702, 694, 703, 766, 752, 689, 672, 672, 665, 692, 764, 752, 689, 672, 672, 670, 689, 701, 693, 2265, 2261, 745, 728, 728, 648, 709, 717, 713, 731, 733, 730, 717, 709, 717, 710, 732, 648, 716, 705, 731, 713, 714, 708, 717, 716, 2644, 2675, 2667, 2684, 2673, 2676, 2681, 2621, 2670, 2686, 2676, 2674, 2675, 2621, 2670, 2665, 2684, 2665, 2680, 2621, 2676, 2675, 2621, 2676, 2681, 2680, 2675, 2665, 2676, 2665, 2660, 802, 787, 787, 835, 782, 774, 770, 784, 790, 785, 774, 782, 774, 781, 791, 835, 775, 778, 784, 770, 769, 783, 774, 775, 835, 775, 790, 774, 835, 791, 780, 835, 775, 774, 781, 778, 774, 775, 835, 784, 791, 780, 785, 770, 772, 774, 835, 768, 780, 781, 784, 774, 781, 791, 2753, 2800, 2800, 2720, 2797, 2789, 2785, 2803, 2805, 2802, 2789, 2797, 2789, 2798, 2804, 2720, 2788, 2793, 2803, 2785, 2786, 2796, 2789, 2788, 2720, 2806, 2793, 2785, 2720, 2804, 2792, 2789, 2720, 2791, 2796, 2799, 2786, 2785, 2796, 2720, 2788, 2785, 2804, 2785, 2720, 2787, 2799, 2796, 2796, 2789, 2787, 2804, 2793, 2799, 2798, 2720, 2803, 2789, 2804, 2804, 2793, 2798, 2791, 2332, 2349, 2349, 2429, 2352, 2360, 2364, 2350, 2344, 2351, 2360, 2352, 2360, 2355, 2345, 2429, 2361, 2360, 2364, 2366, 2345, 2356, 2347, 2364, 2345, 2360, 2361, 2429, 2347, 2356, 2364, 2429, 2351, 2360, 2350, 2354, 2344, 2351, 2366, 2360, 2350, 2419, 2429, 2313, 2357, 2356, 2350, 2429, 2352, 2360, 2345, 2357, 2354, 2361, 2429, 2356, 2350, 2429, 2367, 2360, 2356, 2355, 2362, 2429, 2361, 2360, 2349, 2351, 2360, 2366, 2364, 2345, 2360, 2361, 2419, 2429, 2317, 2353, 2360, 2364, 2350, 2360, 2429, 2351, 2360, 2363, 2360, 2351, 2429, 2345, 2354, 2429, 2357, 2345, 2345, 2349, 2350, 2407, 2418, 2418, 2363, 2356, 2351, 2360, 2367, 2364, 2350, 2360, 2419, 2362, 2354, 2354, 2362, 2353, 2360, 2419, 2366, 2354, 2352, 2418, 2350, 2344, 2349, 2349, 2354, 2351, 2345, 2418, 2362, 2344, 2356, 2361, 2360, 2350, 2418, 2361, 2356, 2350, 2364, 2367, 2353, 2360, 2416, 2364, 2355, 2364, 2353, 2340, 2345, 2356, 2366, 2350, 871, 854, 854, 774, 843, 835, 839, 853, 851, 852, 835, 843, 835, 840, 850, 774, 834, 847, 853, 839, 836, 842, 835, 834, 774, 848, 847, 839, 774, 850, 846, 835, 774, 847, 840, 847, 850, 774, 854, 839, 852, 839, 843, 835, 850, 835, 852, 853, 2305, 2352, 2352, 2400, 2349, 2341, 2337, 2355, 2357, 2354, 2341, 2349, 2341, 2350, 2356, 2400, 2340, 2345, 2355, 2337, 2338, 2348, 2341, 2340, 2400, 2358, 2345, 2337, 2400, 2356, 2344, 2341, 2400, 2349, 2337, 2350, 2345, 2342, 2341, 2355, 2356, 1364, 1381, 1381, 1333, 1400, 1392, 1396, 1382, 1376, 1383, 1392, 1400, 1392, 1403, 1377, 1333, 1393, 1404, 1382, 1396, 1399, 1401, 1392, 1393, 1333, 1399, 1388, 1333, 1382, 1392, 1377, 1364, 1403, 1396, 1401, 1388, 1377, 1404, 1398, 1382, 1366, 1402, 1401, 1401, 1392, 1398, 1377, 1404, 1402, 1403, 1360, 1403, 1396, 1399, 1401, 1392, 1393, 1341, 1395, 1396, 1401, 1382, 1392, 1340, 1346, 1395, 1395, 1315, 1390, 1382, 1378, 1392, 1398, 1393, 1382, 1390, 1382, 1389, 1399, 1315, 1383, 1382, 1378, 1376, 1399, 1386, 1397, 1378, 1399, 1382, 1383, 1315, 1397, 1386, 1378, 1315, 1399, 1387, 1382, 1315, 1386, 1389, 1386, 1399, 1315, 1395, 1378, 1393, 1378, 1390, 1382, 1399, 1382, 1393, 1392, 2370, 2419, 2419, 2339, 2414, 2406, 2402, 2416, 2422, 2417, 2406, 2414, 2406, 2413, 2423, 2339, 2407, 2406, 2402, 2400, 2423, 2410, 2421, 2402, 2423, 2406, 2407, 2339, 2421, 2410, 2402, 2339, 2423, 2411, 2406, 2339, 2414, 2402, 2413, 2410, 2405, 2406, 2416, 2423, 410, 427, 427, 507, 438, 446, 442, 424, 430, 425, 446, 438, 446, 437, 431, 507, 440, 436, 439, 439, 446, 440, 431, 434, 436, 437, 507, 446, 437, 442, 441, 439, 446, 447, 1048, 1040, 1040, 1048, 1043, 1050, 1056, 1054, 1039, 1039, 1056, 1046, 1051, 3296, 3301, 3308, 3310, 3299, 3294, 3296, 3313, 3313, 3294, 3304, 3301, 3080, 3129, 3129, 3177, 3108, 3116, 3112, 3130, 3132, 3131, 3116, 3108, 3116, 3111, 3133, 3177, 3116, 3111, 3112, 3115, 3109, 3116, 3117, 3177, 3119, 3110, 3131, 3177, 3112, 3129, 3129, 3177, 3129, 3112, 3114, 3106, 3112, 3118, 3116, 3173, 3177, 3118, 3110, 3110, 3118, 3109, 3116, 3177, 
    3112, 3129, 3129, 3177, 3104, 3117, 455, 484, 501, 482, 489, 488, 495, 486, 417, 454, 494, 494, 486, 493, 484, 417, 448, 497, 497, 417, 456, 485, 417, 487, 480, 488, 493, 484, 485, 417, 502, 488, 501, 489, 417, 484, 505, 482, 484, 497, 501, 488, 494, 495, 431, 417, 480, 497, 497, 456, 485, 470, 473, 470, 475, 462, 451, 478, 468, 452, 409, 452, 470, 465, 466, 475, 478, 452, 451, 466, 467, 488, 466, 449, 466, 473, 451, 452, 1108, 1139, 1147, 1150, 1143, 1142, 1074, 1126, 1149, 1074, 1150, 1149, 1139, 1142, 1074, 1151, 1143, 1126, 1139, 1142, 1139, 1126, 1139, 1064, 1074, 1119, 1143, 1126, 1139, 1142, 1139, 1126, 1139, 1074, 1136, 1127, 1148, 1142, 1150, 1143, 1074, 1147, 1121, 1074, 1148, 1127, 1150, 1150, 959, 920, 912, 917, 924, 925, 985, 909, 918, 985, 917, 918, 920, 925, 985, 906, 909, 907, 912, 919, 926, 985, 920, 907, 907, 920, 896, 985, 927, 907, 918, 916, 985, 916, 924, 909, 920, 925, 920, 909, 920, 963, 985, 907, 924, 906, 918, 908, 907, 922, 924, 985, 919, 918, 909, 985, 927, 918, 908, 919, 925, 2196, 2214, 2209, 2210, 2219, 2222, 2228, 2227, 2210, 2211, 2279, 2210, 2225, 2210, 2217, 2227, 2279, 2219, 2222, 2228, 2227, 2279, 2222, 2228, 2279, 2210, 2218, 2231, 2227, 2238, 2281, 2279, 2190, 2208, 2217, 2216, 2229, 2222, 2217, 2208, 314, 296, 303, 300, 293, 288, 314, 317, 300, 301, 361, 300, 319, 300, 295, 317};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f10594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f10596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f10597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f10598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f10600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f10601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f10602n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10603o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f10604p;

    /* JADX INFO: renamed from: ۟ۢۥۧۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6615() {
        int iM2767 = C0144.m2767();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2767 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f605short;
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

    @Override // k6.p2
    public final boolean u() {
        return true;
    }

    public final String v() {
        String strM1842 = null;
        String str = "\u06e5\u06df\u06df";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1750813:
                    return strM1842;
                case 1751617:
                    C0270.m5173(strM1842);
                    str = "\u06e7\u06df\u06e5";
                    break;
                case 1752453:
                    C0458.m8937(this);
                    str = "\u06e8\u06e8\u06e5";
                    break;
                case 1755621:
                    strM1842 = C0086.m1842(this);
                    str = "\u06e4\u06e3\u06e0";
                    break;
                default:
                    strM1842 = C0086.m1842(this);
                    str = "\u06e3\u06e8\u06e2";
                    break;
            }
        }
    }

    public final String w() {
        String strM2456 = null;
        String str = "\u06e6\u06e4\u06e2";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748831:
                    C0270.m5173(strM2456);
                    str = "\u06e0\u06e6\u06df";
                    break;
                case 1751523:
                    C0458.m8937(this);
                    str = "\u06e6\u06e8\u06e8";
                    break;
                case 1752580:
                    return strM2456;
                case 1753572:
                    C0040.m791(this);
                    str = "\u06e4\u06e0\u06df";
                    break;
                case 1753702:
                    strM2456 = C0127.m2456(this);
                    str = "\u06e1\u06e6\u06e4";
                    break;
                default:
                    strM2456 = C0127.m2456(this);
                    str = "\u06e5\u06e3\u06e2";
                    break;
            }
        }
    }

    public final void x() {
        String strM920;
        String strM7239;
        C0040.m791(this);
        boolean zM990 = C0051.m990(C0078.m1685(C0338.m6640(this)), C0475.m9267());
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = !zM990 ? 1709 : 1678;
                    break;
                case 204:
                    C0135.m2604(C0465.m9073(C0029.m572(this)), C0461.m8984(m6615(), 0, C0418.f689 ^ 205, 2191));
                    strM920 = null;
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    byte[] bArr = new byte[16];
                    C0411.m8082(C0199.m3826(C0354.m6951(this)), bArr);
                    Locale localeM5051 = C0264.m5051();
                    BigInteger bigInteger = new BigInteger(1, bArr);
                    Object[] objArr = new Object[1];
                    objArr[C0261.f341 ^ (-870)] = bigInteger;
                    strM920 = C0048.m920(localeM5051, C0460.m8963(m6615(), 40, C0336.f520 ^ (-834), 2259), objArr);
                    break;
                default:
                    break;
            }
        }
        d4 d4VarM572 = C0029.m572(this);
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (strM920 == null) {
                        i12 = 48736;
                    }
                    break;
                case 47384:
                    strM7239 = C0369.m7239(m6615(), 49, C0309.f457 ^ (-402), 1842);
                    break;
                case 47417:
                    strM7239 = C0178.m3395(m6615(), 45, C0020.f40 ^ (-671), 2804);
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i13 = 48798;
                                break;
                        }
                    }
                    break;
                case 47483:
                    break;
                default:
                    continue;
            }
            i12 = 48705;
        }
        C0135.m2604(C0465.m9073(d4VarM572), C0190.m3635(C0182.m3474(m6615(), 57, C0473.f744 ^ 675, 712), new Object[]{strM7239}));
        this.f10602n = strM920;
        C0014.m280((e6.c) C0166.m3176(this));
        this.f10603o = C0401.m7869();
    }

    /* JADX WARN: Code duplicated, block: B:651:0x0691 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:0x06a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x0689 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:0x056e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:0x0581 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:0x056d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:0x04ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:817:0x04b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x017a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v86 */
    public final void y() {
        String str;
        boolean z10;
        Integer numM1083;
        ?? r10;
        int i10;
        String strM7491;
        int i11;
        String str2;
        String strM2456;
        String strM7492;
        int i12;
        String strM1884;
        String str3;
        String strM3852;
        String strM3395 = C0178.m3395(m6615(), 96, C0059.f79 ^ 894, 782);
        String strM8680 = C0445.m8680(C0276.m5311(this));
        PackageManager packageManagerM8279 = C0421.m8279(C0276.m5311(this));
        String strM8581 = C0439.m8581();
        String strM2980 = C0156.m2980(m6615(), 102, C0480.f754 ^ (-683), 2488);
        String strM6250 = C0323.m6250(m6615(), 109, C0205.f229 ^ 426, 3082);
        int i13 = Integer.MIN_VALUE;
        int i14 = 1616;
        while (true) {
            i14 ^= 1633;
            switch (i14) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i14 = packageManagerM8279 == null ? 1709 : 1678;
                    break;
                case 204:
                    C0419.m8245(C0454.m8871(C0029.m572(this)), C0344.m6750(m6615(), 116, C0338.f609 ^ 869, 1690), C0027.m535(strM8680));
                    int i15 = 1740;
                    while (true) {
                        i15 ^= 1757;
                        switch (i15) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = 1771;
                                continue;
                            case 54:
                                str = strM2980;
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    try {
                        strM2980 = C0396.m7747(packageManagerM8279, strM8680);
                        int i16 = 1864;
                        while (true) {
                            i16 ^= 1881;
                            switch (i16) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i16 = 48674;
                                    continue;
                                case 47483:
                                    break;
                                default:
                                    continue;
                            }
                            int i17 = 48767;
                            while (true) {
                                i17 ^= 48784;
                                switch (i17) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        boolean zM321 = C0016.m321(C0484.m9421(m6615(), 255, C0448.f719 ^ (-816), 3115), strM2980);
                                        int i18 = 49666;
                                        while (true) {
                                            i18 ^= 49683;
                                            switch (i18) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i18 = zM321 ? 49759 : 49728;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 76:
                                                    strM1884 = strM8581;
                                                    break;
                                                case 83:
                                                    strM1884 = strM2980;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 76:
                                        strM1884 = C0088.m1884(m6615(), 241, C0103.f129 ^ (-388), 1786);
                                        int i19 = 48891;
                                        while (true) {
                                            i19 ^= 48908;
                                            switch (i19) {
                                                case 22:
                                                    break;
                                                case 503:
                                                    i19 = 48922;
                                                    continue;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 239:
                                        i17 = strM2980 == null ? 48860 : 48829;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            try {
                                PackageInfo packageInfoM5588 = C0290.m5588(packageManagerM8279, C0445.m8680(C0276.m5311(this)), 0);
                                int i20 = 49790;
                                while (true) {
                                    i20 ^= 49807;
                                    switch (i20) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 51:
                                            str = strM1884;
                                            break;
                                        case 84:
                                            CharSequence charSequenceM1058 = C0055.m1058(packageManagerM8279, C0450.m8785(packageInfoM5588));
                                            boolean zM1883 = C0088.m1883(charSequenceM1058);
                                            int i21 = 49914;
                                            while (true) {
                                                i21 ^= 49931;
                                                switch (i21) {
                                                    case 497:
                                                        i21 = !zM1883 ? 50658 : 50627;
                                                        break;
                                                    case 1711:
                                                        break;
                                                    case 1736:
                                                        strM3852 = strM6250;
                                                        break;
                                                    case 1769:
                                                        strM3852 = C0201.m3852(charSequenceM1058);
                                                        int i22 = 50689;
                                                        while (true) {
                                                            i22 ^= 50706;
                                                            switch (i22) {
                                                                case 19:
                                                                    i22 = 50720;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            C0112.m2169(C0454.m8871(C0029.m572(this)), C0041.m814(m6615(), 274, C0492.f766 ^ (-771), 720), C0027.m535(strM8680), strM3852);
                                                            str = strM1884;
                                                            strM6250 = str3;
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            try {
                                                strM6250 = C0443.m8651(packageInfoM5588);
                                                int iM8851 = C0453.m8851(packageInfoM5588);
                                                int i23 = 50813;
                                                while (true) {
                                                    i23 ^= 50830;
                                                    switch (i23) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            str = strM1884;
                                                            i13 = iM8851;
                                                            break;
                                                        case 243:
                                                            i23 = 50844;
                                                            continue;
                                                        default:
                                                            continue;
                                                    }
                                                }
                                            } catch (PackageManager.NameNotFoundException e4) {
                                                str3 = strM6250;
                                                int i24 = 51588;
                                                while (true) {
                                                    i24 ^= 51605;
                                                    switch (i24) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i24 = 51619;
                                                            continue;
                                                        case 54:
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    C0112.m2169(C0454.m8871(C0029.m572(this)), C0041.m814(m6615(), 274, C0492.f766 ^ (-771), 720), C0027.m535(strM8680), strM3852);
                                                    str = strM1884;
                                                    strM6250 = str3;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 241:
                                            i20 = packageInfoM5588 != null ? 49883 : 49852;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException e10) {
                                str3 = strM6250;
                                strM3852 = strM6250;
                            }
                        }
                    } catch (IllegalArgumentException e11) {
                        C0419.m8245(C0454.m8871(C0029.m572(this)), C0036.m713(m6615(), 191, C0158.f182 ^ 400, 341), C0027.m535(strM8680));
                    }
                    break;
                default:
                    break;
            }
        }
        this.f10591c = strM8680;
        this.f10594f = str;
        this.f10592d = strM6250;
        this.f10593e = i13;
        this.f10595g = 0L;
        Object objM3121 = C0163.m3121(this);
        f5 f5Var = (f5) objM3121;
        boolean zM1884 = C0088.m1883(C0133.m2573(f5Var));
        boolean z11 = true;
        int i25 = 51712;
        while (true) {
            i25 ^= 51729;
            switch (i25) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i25 = !zM1884 ? 51805 : 51774;
                    break;
                case 47:
                    z10 = false;
                    break;
                case 76:
                    boolean zM322 = C0016.m321(C0177.m3376(m6615(), 319, C0450.f721 ^ (-681), 2232), C0185.m3528(f5Var));
                    int i26 = 51836;
                    while (true) {
                        i26 ^= 51853;
                        switch (i26) {
                            case 241:
                                i26 = zM322 ? 52580 : 52549;
                                break;
                            case 1963:
                                break;
                            case 1992:
                                z10 = false;
                                break;
                            case 2025:
                                z10 = true;
                                int i27 = 52611;
                                while (true) {
                                    i27 ^= 52628;
                                    switch (i27) {
                                        case 23:
                                            i27 = 52642;
                                            continue;
                                        case 54:
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
                default:
                    break;
            }
        }
        int iM1103 = C0058.m1103(f5Var);
        switch (iM1103) {
            case 0:
                C0135.m2604(C0136.m2634(C0029.m572(this)), C0283.m5471(m6615(), 893, C0481.f755 ^ (-523), 475));
                break;
            case 1:
                C0135.m2604(C0459.m8950(C0029.m572(this)), C0374.m7338(m6615(), 849, C0293.f441 ^ (-927), 2307));
                int i28 = 55680;
                while (true) {
                    i28 ^= 55697;
                    switch (i28) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i28 = 56362;
                            continue;
                        case 1467:
                            break;
                        default:
                            continue;
                    }
                }
                break;
            case 2:
                C0135.m2604(C0136.m2634(C0029.m572(this)), C0082.m1753(m6615(), 798, C0484.f758 ^ (-726), 1283));
                int i29 = 55556;
                while (true) {
                    i29 ^= 55573;
                    switch (i29) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i29 = 55587;
                            continue;
                        case 54:
                            break;
                        default:
                            continue;
                    }
                }
                break;
            case 3:
                C0135.m2604(C0459.m8950(C0029.m572(this)), C0282.m5456(m6615(), 734, C0385.f656 ^ (-79), 1301));
                int i30 = 55432;
                while (true) {
                    i30 ^= 55449;
                    switch (i30) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i30 = 55463;
                            continue;
                        case 62:
                            break;
                        default:
                            continue;
                    }
                }
                break;
            case 4:
                C0135.m2604(C0459.m8950(C0029.m572(this)), C0016.m329(m6615(), 693, C0300.f448 ^ (-712), 2368));
                int i31 = 54657;
                while (true) {
                    i31 ^= 54674;
                    switch (i31) {
                        case 19:
                            i31 = 54688;
                            continue;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        default:
                            continue;
                    }
                }
                break;
            case 5:
                C0135.m2604(C0136.m2634(C0029.m572(this)), C0320.m6205(m6615(), 645, C0240.f320 ^ 507, 806));
                int i32 = 54533;
                while (true) {
                    i32 ^= 54550;
                    switch (i32) {
                        case 19:
                            i32 = 54564;
                            continue;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        default:
                            continue;
                    }
                }
                break;
            case 6:
                C0135.m2604(C0471.m9169(C0029.m572(this)), C0219.m4233(m6615(), 493, C0481.f755 ^ (-689), 2397));
                int i33 = 53758;
                while (true) {
                    i33 ^= 53775;
                    switch (i33) {
                        case 1009:
                            i33 = 54440;
                            continue;
                        case 1703:
                            break;
                        default:
                            continue;
                    }
                }
                break;
            case 7:
                C0135.m2604(C0459.m8950(C0029.m572(this)), C0154.m2951(m6615(), 430, C0471.f742 ^ 67, 2688));
                int i34 = 53634;
                while (true) {
                    i34 ^= 53651;
                    switch (i34) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i34 = 53665;
                            continue;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        default:
                            continue;
                    }
                }
                break;
            case 8:
                C0135.m2604(C0459.m8950(C0029.m572(this)), C0375.m7355(m6615(), 376, C0149.f174 ^ (-185), 867));
                int i35 = 53510;
                while (true) {
                    i35 ^= 53527;
                    switch (i35) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i35 = 53541;
                            continue;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        default:
                            continue;
                    }
                }
                break;
            default:
                C0135.m2604(C0459.m8950(C0029.m572(this)), C0235.m4534(m6615(), 321, C0474.f745 ^ (-634), 680));
                C0135.m2604(C0335.m6498(C0029.m572(this)), C0087.m1850(m6615(), 345, C0484.f758 ^ (-762), 2589));
                int i36 = 52735;
                while (true) {
                    i36 ^= 52752;
                    switch (i36) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 1007:
                            i36 = 52766;
                            continue;
                        default:
                            continue;
                    }
                }
                break;
        }
        int i37 = 56455;
        while (true) {
            i37 ^= 56472;
            switch (i37) {
                case 31:
                    i37 = iM1103 == 0 ? 56548 : 56517;
                    break;
                case 62:
                    break;
                case 93:
                    z11 = false;
                    break;
                case 124:
                    int i38 = 56579;
                    while (true) {
                        i38 ^= 56596;
                        switch (i38) {
                            case 23:
                                i38 = 56610;
                                continue;
                            case 54:
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
        this.f10600l = strM8581;
        this.f10601m = strM8581;
        int i39 = 1507503;
        while (true) {
            i39 ^= 1507520;
            switch (i39) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    break;
                case 111:
                    i39 = z10 ? 1507596 : 1507565;
                    break;
                case 460:
                    this.f10601m = C0133.m2573(f5Var);
                    break;
                default:
                    break;
            }
        }
        ?? r11 = 0;
        r11 = 0;
        try {
            Context contextM5311 = C0276.m5311(this);
            String strM1936 = C0091.m1936((f5) objM3121);
            String strM9556 = C0490.m9556(m6615(), 927, C0411.f682 ^ 40, 1151);
            C0270.m5173(contextM5311);
            Resources resourcesM798 = C0040.m798(contextM5311);
            boolean zM1885 = C0088.m1883(strM1936);
            int i40 = 1507627;
            while (true) {
                i40 ^= 1507644;
                switch (i40) {
                    case 23:
                        i40 = !zM1885 ? 1507720 : 1507689;
                        break;
                    case 85:
                        strM1936 = C0034.m666(contextM5311);
                        break;
                    case 118:
                        break;
                    case 180:
                        int i41 = 1507751;
                        while (true) {
                            i41 ^= 1507768;
                            switch (i41) {
                                case 31:
                                    i41 = 1508433;
                                    continue;
                                case 1513:
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
            int iM3631 = C0190.m3631(resourcesM798, strM9556, strM3395, strM1936);
            int i42 = 1508526;
            while (true) {
                i42 ^= 1508543;
                switch (i42) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i42 = iM3631 == 0 ? 1508619 : 1508588;
                        break;
                    case 83:
                        try {
                            strM7491 = C0382.m7491(resourcesM798, iM3631);
                            break;
                        } catch (Resources.NotFoundException e12) {
                            int i43 = 1541138;
                            while (true) {
                                i43 ^= 1541155;
                                switch (i43) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 49:
                                        i43 = 1541169;
                                        continue;
                                    default:
                                        continue;
                                }
                                strM7491 = null;
                                i11 = 1508650;
                                while (true) {
                                    i11 ^= 1508667;
                                    switch (i11) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i11 = 1508681;
                                            continue;
                                            continue;
                                        case 114:
                                            break;
                                        default:
                                            continue;
                                            continue;
                                    }
                                }
                            }
                        }
                        break;
                    case 114:
                        break;
                    case 436:
                        strM7491 = null;
                        i11 = 1508650;
                        while (true) {
                            i11 ^= 1508667;
                            switch (i11) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = 1508681;
                                    continue;
                                    continue;
                                case 114:
                                    break;
                                default:
                                    continue;
                                    continue;
                            }
                        }
                        break;
                    default:
                        break;
                }
                boolean zM1886 = C0088.m1883(strM7491);
                int i44 = 1509425;
                while (true) {
                    i44 ^= 1509442;
                    switch (i44) {
                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            str2 = strM7491;
                            break;
                        case 115:
                            i44 = zM1886 ? 1509518 : 1509487;
                            break;
                        case 204:
                            int i45 = 1509549;
                            while (true) {
                                i45 ^= 1509566;
                                switch (i45) {
                                    case 19:
                                        i45 = 1509580;
                                        continue;
                                    case 114:
                                        str2 = strM8581;
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
                this.f10600l = str2;
                boolean zM1887 = C0088.m1883(strM7491);
                int i46 = 1509673;
                while (true) {
                    i46 ^= 1509690;
                    switch (i46) {
                        case 19:
                            i46 = !zM1887 ? 1510417 : 1510386;
                            break;
                        case 712:
                            break;
                        case 745:
                            break;
                        case 1323:
                            Context contextM5312 = C0276.m5311(this);
                            String strM1937 = C0091.m1936((f5) objM3121);
                            C0270.m5173(contextM5312);
                            Resources resourcesM799 = C0040.m798(contextM5312);
                            boolean zM1888 = C0088.m1883(strM1937);
                            int i47 = 1510448;
                            while (true) {
                                i47 ^= 1510465;
                                switch (i47) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case 47:
                                        strM1937 = C0034.m666(contextM5312);
                                        break;
                                    case 113:
                                        i47 = !zM1888 ? 1510541 : 1510510;
                                        break;
                                    case 204:
                                        int i48 = 1510572;
                                        while (true) {
                                            i48 ^= 1510589;
                                            switch (i48) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i48 = 1510603;
                                                    continue;
                                                case 118:
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
                            int iM3632 = C0190.m3631(resourcesM799, C0214.m4094(m6615(), 940, C0127.f153 ^ (-526), 3201), strM3395, strM1937);
                            int i49 = 1511347;
                            while (true) {
                                i49 ^= 1511364;
                                switch (i49) {
                                    case 22:
                                        break;
                                    case 53:
                                        try {
                                            strM7492 = C0382.m7491(resourcesM799, iM3632);
                                            break;
                                        } catch (Resources.NotFoundException e13) {
                                            int i50 = 1541262;
                                            while (true) {
                                                i50 ^= 1541279;
                                                switch (i50) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i50 = 1541293;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                strM7492 = null;
                                                i12 = 1511471;
                                                while (true) {
                                                    i12 ^= 1511488;
                                                    switch (i12) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case 111:
                                                            i12 = 1511502;
                                                            continue;
                                                            continue;
                                                        default:
                                                            continue;
                                                            continue;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    case 119:
                                        i49 = iM3632 == 0 ? 1511440 : 1511409;
                                        break;
                                    case 8148:
                                        strM7492 = null;
                                        i12 = 1511471;
                                        while (true) {
                                            i12 ^= 1511488;
                                            switch (i12) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 111:
                                                    i12 = 1511502;
                                                    continue;
                                                    continue;
                                                default:
                                                    continue;
                                                    continue;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                                this.f10601m = strM7492;
                                int i51 = 1511595;
                                while (true) {
                                    i51 ^= 1511612;
                                    switch (i51) {
                                        case 23:
                                            i51 = 1512277;
                                            continue;
                                        case 1001:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                            }
                            break;
                        default:
                            break;
                    }
                }
                int i52 = 1512494;
                while (true) {
                    i52 ^= 1512511;
                    switch (i52) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i52 = z11 ? 1513238 : 1512556;
                            break;
                        case 83:
                            break;
                        case 114:
                            break;
                        case 809:
                            f4 f4VarM2634 = C0136.m2634(C0029.m572(this));
                            String strM5708 = C0296.m5708(m6615(), 952, C0472.f743 ^ (-540), 3145);
                            String strM1842 = C0086.m1842(this);
                            boolean zM1889 = C0088.m1883(C0127.m2456(this));
                            int i53 = 1513269;
                            while (true) {
                                i53 ^= 1513286;
                                switch (i53) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 53:
                                        strM2456 = C0127.m2456(this);
                                        break;
                                    case 115:
                                        i53 = zM1889 ? 1513362 : 1513331;
                                        break;
                                    case 212:
                                        strM2456 = C0196.m3757(this);
                                        int i54 = 1513393;
                                        while (true) {
                                            i54 ^= 1513410;
                                            switch (i54) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 115:
                                                    i54 = 1513424;
                                                    continue;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            C0112.m2169(f4VarM2634, strM5708, strM1842, strM2456);
                            int i55 = 1513517;
                            while (true) {
                                i55 ^= 1513534;
                                switch (i55) {
                                    case 19:
                                        i55 = 1514199;
                                        break;
                                    case 745:
                                        break;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                }
                this.f10597i = null;
                f fVarM1951 = C0091.m1951(this);
                C0014.m280(fVarM1951);
                String strM8010 = C0408.m8010(m6615(), 1057, C0108.f134 ^ (-95), 439);
                C0281.m5438(strM8010);
                Bundle bundleM5942 = C0307.m5942(fVarM1951);
                int i56 = 1514292;
                while (true) {
                    i56 ^= 1514309;
                    switch (i56) {
                        case 22:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                            boolean zM7033 = C0358.m7033(bundleM5942, strM8010);
                            int i57 = 1515191;
                            while (true) {
                                i57 ^= 1515208;
                                switch (i57) {
                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                        break;
                                    case 61:
                                        numM1083 = C0057.m1083(C0425.m8344(bundleM5942, strM8010));
                                        break;
                                    case 127:
                                        i57 = !zM7033 ? 1515284 : 1515253;
                                        break;
                                    case 476:
                                        int i58 = 1515315;
                                        while (true) {
                                            i58 ^= 1515332;
                                            switch (i58) {
                                                case 22:
                                                    break;
                                                case 119:
                                                    i58 = 1515346;
                                                    continue;
                                                default:
                                                    continue;
                                            }
                                            numM1083 = null;
                                            i10 = 1514416;
                                            while (true) {
                                                i10 ^= 1514433;
                                                switch (i10) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 113:
                                                        i10 = 1514447;
                                                        continue;
                                                        continue;
                                                    default:
                                                        continue;
                                                        continue;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 113:
                            i56 = bundleM5942 == null ? 1514385 : 1514354;
                            break;
                        case 212:
                            C0135.m2604(C0454.m8871(C0029.m572(fVarM1951)), C0350.m6868(m6615(), 1084, C0467.f738 ^ (-432), 1042));
                            numM1083 = null;
                            i10 = 1514416;
                            while (true) {
                                i10 ^= 1514433;
                                switch (i10) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case 113:
                                        i10 = 1514447;
                                        continue;
                                        continue;
                                    default:
                                        continue;
                                        continue;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    int i59 = 1515439;
                    while (true) {
                        i59 ^= 1515456;
                        switch (i59) {
                            case 111:
                                i59 = numM1083 == null ? 1516183 : 1516152;
                                break;
                            case 15703:
                                int i60 = 1516214;
                                while (true) {
                                    i60 ^= 1516231;
                                    switch (i60) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            r10 = 0;
                                            break;
                                        case 113:
                                            i60 = 1516245;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 15769:
                                break;
                            case 15800:
                                try {
                                    String[] strArrM796 = C0040.m796(C0040.m798(C0276.m5311(fVarM1951)), C0366.m7190(numM1083));
                                    int i61 = 1516338;
                                    while (true) {
                                        i61 ^= 1516355;
                                        switch (i61) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 51:
                                                List listM2872 = C0150.m2872(strArrM796);
                                                int i62 = 1537418;
                                                while (true) {
                                                    r11 = 1537435;
                                                    i62 ^= 1537435;
                                                    switch (i62) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i62 = 1537449;
                                                            continue;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            r10 = listM2872;
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                }
                                                break;
                                            case 113:
                                                i61 = strArrM796 == null ? 1537263 : 1516400;
                                                break;
                                            case 22444:
                                                int i63 = 1537294;
                                                while (true) {
                                                    i63 ^= 1537311;
                                                    switch (i63) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i63 = 1537325;
                                                            continue;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            r10 = 0;
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
                                } catch (Resources.NotFoundException e14) {
                                    C0419.m8245(C0454.m8871(C0029.m572(fVarM1951)), C0087.m1850(m6615(), 1132, C0035.f55 ^ (-767), 1017), e14);
                                    r10 = r11;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    int i64 = 1537542;
                    while (true) {
                        i64 ^= 1537559;
                        switch (i64) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i64 = r10 != 0 ? 1538286 : 1538255;
                                break;
                            case 3751:
                                break;
                            case 3800:
                                this.f10597i = r10;
                                break;
                            case 3833:
                                boolean zM7153 = C0364.m7153(r10);
                                int i65 = 1538317;
                                while (true) {
                                    i65 ^= 1538334;
                                    switch (i65) {
                                        case 19:
                                            i65 = zM7153 ? 1538410 : 1538379;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 85:
                                            Iterator itM2089 = C0107.m2089(r10);
                                            while (true) {
                                                boolean zM3327 = C0174.m3327(itM2089);
                                                int i66 = 1539216;
                                                while (true) {
                                                    i66 ^= 1539233;
                                                    switch (i66) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case 49:
                                                            i66 = zM3327 ? 1539309 : 1539278;
                                                            break;
                                                        case 76:
                                                            boolean zM9344 = C0479.m9344(C0354.m6951(this), C0117.m2265(m6615(), 1233, C0465.f736 ^ 198, 329), (String) C0413.m8115(itM2089));
                                                            int i67 = 1539340;
                                                            while (true) {
                                                                i67 ^= 1539357;
                                                                switch (i67) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i67 = !zM9344 ? 1539433 : 1539402;
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 87:
                                                                        break;
                                                                    case 116:
                                                                        int i68 = 1539464;
                                                                        while (true) {
                                                                            i68 ^= 1539481;
                                                                            switch (i68) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i68 = 1540146;
                                                                                    continue;
                                                                                case 64939:
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
                                                        case 111:
                                                            this.f10597i = r10;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 116:
                                            C0135.m2604(C0471.m9169(C0029.m572(this)), C0437.m8534(m6615(), 1193, C0486.f760 ^ 204, 2247));
                                            int i69 = 1538441;
                                            while (true) {
                                                i69 ^= 1538458;
                                                switch (i69) {
                                                    case 19:
                                                        i69 = 1538472;
                                                        continue;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                            default:
                                break;
                        }
                    }
                    int i70 = 1540239;
                    while (true) {
                        i70 ^= 1540256;
                        switch (i70) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 47:
                                if (packageManagerM8279 != null) {
                                    i70 = 1540332;
                                }
                                break;
                            case 76:
                                this.f10599k = C0195.m3740(C0276.m5311(this)) ? 1 : 0;
                                return;
                            case 109:
                                this.f10599k = 0;
                                int iM5773 = C0300.m5773();
                                int i71 = 1540363;
                                while (true) {
                                    i71 ^= 1540380;
                                    switch (i71) {
                                        case 23:
                                            if (iM5773 >= 0) {
                                                i71 = 1541107;
                                            }
                                            break;
                                        case 54:
                                            break;
                                        case 85:
                                            return;
                                        case 751:
                                            System.out.println(Integer.parseInt(C0214.m4087("qGsLwC8")));
                                            return;
                                        default:
                                            continue;
                                    }
                                    i71 = 1540425;
                                }
                                break;
                            default:
                                continue;
                        }
                        i70 = 1540301;
                    }
                }
            }
        } catch (IllegalStateException e15) {
            int i72 = 1512370;
            while (true) {
                i72 ^= 1512387;
                switch (i72) {
                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        C0112.m2169(C0454.m8871(C0029.m572(this)), C0214.m4094(m6615(), 1006, C0103.f129 ^ (-447), 385), C0027.m535(strM8680), e15);
                        break;
                    case 113:
                        i72 = 1512401;
                        continue;
                    default:
                        continue;
                }
            }
        }
    }
}
