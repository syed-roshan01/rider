package k6;

import a8.C0009;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.C0015;
import android.util.Pair;
import android.util.SparseArray;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.graphics.C0031;
import androidx.versionedparcelable.C0048;
import b1.C0050;
import b7.C0054;
import c1.C0059;
import c4.C0065;
import c6.C0067;
import c7.C0068;
import ca.C0070;
import com.auto.accept.data.model.C0071;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.measurement.internal.C0105;
import com.google.android.play.core.integrity.client.C0108;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.C0205;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.iid.C0170;
import com.google.firebase.installations.C0177;
import com.google.firebase.ktx.C0179;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement.C0184;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import com.google.firebase.tracing.C0204;
import d.C0210;
import d1.C0211;
import d1.C0213;
import d3.C0216;
import d7.C0220;
import d9.C0223;
import dagger.hilt.C0255;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.codegen.C0242;
import dagger.hilt.components.C0244;
import e2.C0261;
import e8.C0265;
import f.C0270;
import f0.C0271;
import f4.C0276;
import fa.C0281;
import g2.C0286;
import h.C0296;
import h4.C0304;
import h5.C0308;
import h8.C0314;
import ja.C0330;
import k1.C0332;
import k2.C0333;
import l0.C0340;
import l8.C0345;
import l9.C0347;
import m5.C0354;
import m7.C0358;
import n.C0361;
import n7.C0363;
import o4.C0369;
import o5.C0370;
import p4.C0376;
import q2.C0384;
import q5.C0385;
import q6.C0386;
import q7.C0389;
import r2.C0395;
import s8.C0417;
import t0.C0418;
import t1.C0419;
import t8.C0426;
import u8.C0438;
import v.C0439;
import v5.C0445;
import v6.C0446;
import w0.C0454;
import w9.C0465;
import x4.C0469;
import x8.C0473;
import y6.C0476;
import y6.C0477;
import y9.C0478;
import z0.C0482;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public final class l4 extends o5 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f558short = {3289, 3279, 3289, 3289, 3267, 3269, 3268, 3317, 3294, 3267, 3271, 3279, 3269, 3295, 3294, 1323, 1324, 1337, 1322, 1324, 1287, 1334, 1341, 1327, 1287, 1323, 1341, 1323, 1323, 1329, 1335, 1334, 1762, 1775, 1789, 1786, 1745, 1790, 1775, 1787, 1789, 1771, 1745, 1786, 1767, 1763, 1771, 1186, 1204, 1186, 1186, 1208, 1214, 1215, 1166, 1208, 1205, 2917, 2916, 2917, 2900, 2939, 2926, 2937, 2936, 2916, 2917, 2922, 2919, 2914, 2929, 2926, 2927, 2900, 2922, 2927, 2936, 932, 937, 955, 956, 919, 954, 941, 939, 941, 929, 958, 941, 940, 919, 957, 954, 929, 919, 956, 929, 933, 941, 955, 956, 937, 933, 952, 955, 919, 938, 945, 919, 955, 935, 957, 954, 939, 941, 1056, 1069, 1069, 1070, 1078, 1054, 1075, 1060, 1068, 1070, 1077, 1060, 1054, 1061, 1080, 1071, 1056, 1068, 1064, 1077, 1060, 2258, 2269, 2246, 2247, 2240, 2283, 2267, 2244, 2257, 2266, 2283, 2240, 2269, 2265, 2257, 1968, 1953, 1953, 1934, 1976, 1983, 1954, 1957, 1968, 1981, 1981, 1934, 1957, 1976, 1980, 1972, 550, 567, 567, 536, 558, 553, 564, 563, 550, 553, 548, 546, 536, 558, 547, 692, 677, 677, 650, 695, 692, 694, 702, 690, 679, 698, 672, 699, 689, 688, 689, 2789, 2788, 2788, 2801, 2782, 2797, 2792, 2799, 2794, 2782, 2803, 2788, 2805, 2803, 2792, 2788, 2807, 2784, 2797, 2782, 2786, 2798, 2796, 2801, 2797, 2788, 2805, 2788, 619, 618, 618, 639, 592, 611, 614, 609, 612, 592, 637, 618, 635, 637, 614, 618, 633, 622, 611, 592, 622, 635, 635, 618, 610, 639, 635, 636, 2817, 2830, 2837, 2818, 2821, 2822, 2836, 2818, 2872, 2817, 2818, 2822, 2835, 2834, 2837, 2818, 2872, 2837, 2824, 2827, 2827, 2824, 2834, 2835, 2836, 1367, 1366, 1365, 1366, 1345, 1345, 1366, 1367, 1388, 1362, 1351, 1351, 1345, 1370, 1361, 1350, 1351, 1370, 1372, 1373, 1388, 1360, 1362, 1360, 1371, 1366, 1337, 1336, 1339, 1336, 1327, 1327, 1336, 1337, 1282, 1340, 1321, 1321, 1327, 1332, 1343, 1320, 1321, 1332, 1330, 1331, 1282, 1342, 1340, 1342, 1333, 1336, 1282, 1321, 1332, 1328, 1336, 1326, 1321, 1340, 1328, 1325, 1774, 1775, 1772, 1771, 1791, 1766, 1790, 1749, 1775, 1788, 1775, 1764, 1790, 1749, 1786, 1771, 1784, 1771, 1767, 1775, 1790, 1775, 1784, 1785, 2316, 2304, 2305, 2332, 2314, 2305, 2331, 2352, 2332, 2304, 2330, 2333, 2316, 2314, 1705, 1688, 1688, 1736, 1669, 1677, 1673, 1691, 1693, 1690, 1677, 1669, 1677, 1670, 1692, 1736, 1691, 1677, 1692, 1692, 1665, 1670, 1679, 1736, 1676, 1677, 1678, 1677, 1690, 1690, 1677, 1676, 1736, 1675, 1671, 1668, 1668, 1677, 1675, 1692, 1665, 1671, 1670, 1854, 1855, 1852, 1855, 1832, 1832, 1855, 1854, 1797, 1851, 1844, 1851, 1846, 1827, 1838, 1843, 1849, 1833, 1797, 1849, 1845, 1846, 1846, 1855, 1849, 1838, 1843, 1845, 1844, 2730, 2733, 2742, 2700, 2736, 2730, 2733, 2748, 2746, 2732, 518, 513, 538, 551, 538, 542, 534, 512, 519, 530, 542, 515, 512, 2294, 2256, 2251, 2245, 2245, 2247, 2256, 2178, 2295, 2288, 2283, 2178, 2257, 2253, 2263, 2256, 2241, 2247, 2178, 2243, 2252, 2246, 2178, 2262, 2251, 2255, 2247, 2257, 2262, 2243, 2255, 2258, 2178, 2243, 2256, 2256, 2243, 2267, 2178, 2254, 2247, 2252, 2245, 2262, 2250, 2257, 2178, 2246, 2253, 2178, 2252, 2253, 2262, 2178, 2255, 2243, 2262, 2241, 2250, 2264, 2260, 2261, 2248, 2270, 2261, 2255, 2276, 2248, 2270, 2255, 2255, 2258, 2261, 2268, 2248, 1166, 1272, 2127, 2115, 2114, 2143, 2121, 2114, 2136, 2163, 2143, 2115, 2137, 2142, 2127, 2121, 1121, 1133, 1135, 1068, 1125, 1133, 1133, 1125, 1134, 1127, 1068, 1123, 1132, 1126, 1136, 1133, 1131, 1126, 1068, 1125, 1135, 1137, 1068, 1135, 1127, 1123, 1137, 1143, 1136, 1127, 1135, 1127, 1132, 1142, 1068, 1138, 1136, 1127, 1124, 1137, 1065, 1056, 1074, 1054, 1059, 1060, 1060, 1071, 1054, 1070, 1073, 1060, 1071, 1060, 1061};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pair f10169y = new Pair(C0439.m8581(), C0438.m8554(530 ^ ((long) C0358.f629)));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f10170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o4 f10171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p4 f10172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j0.b0 f10173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f10174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f10176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p4 f10177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n4 f10178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j0.b0 f10179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i3.a0 f10180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n4 f10181n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p4 f10182o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p4 f10183p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10184q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n4 f10185r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n4 f10186s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p4 f10187t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j0.b0 f10188u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j0.b0 f10189v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p4 f10190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i3.a0 f10191x;

    public l4(f5 f5Var) {
        super(f5Var);
        this.f10177j = new p4(this, C0265.m5070(m6570(), 0, C0105.f131 ^ 478, 3242), 1799977 ^ ((long) C0188.f212));
        this.f10178k = new n4(this, C0361.m7077(m6570(), 15, C0220.f300 ^ (-110), 1368), true);
        String strM1922 = C0090.m1922(m6570(), 32, C0244.f324 ^ 523, 1678);
        long j10 = 765 ^ ((long) C0070.f90);
        this.f10182o = new p4(this, strM1922, j10);
        this.f10183p = new p4(this, C0465.m9075(m6570(), 47, C0177.f201 ^ 477, 1233), j10);
        this.f10179l = new j0.b0(this, C0163.m3133(m6570(), 57, C0363.f634 ^ (-28), 2827));
        this.f10180m = new i3.a0(this, C0180.m3427(m6570(), 77, C0108.f134 ^ (-100), 968));
        this.f10181n = new n4(this, C0417.m8192(m6570(), 115, C0105.f131 ^ 452, 1089), false);
        this.f10172e = new p4(this, C0296.m5708(m6570(), 136, C0389.f660 ^ 200, 2228), j10);
        C0281.m5438(C0477.m9304(m6570(), 151, C0369.f640 ^ (-360), 2001));
        this.f10173f = new j0.b0(this, C0216.m4120(m6570(), 167, C0384.f655 ^ 600, 583));
        this.f10185r = new n4(this, C0201.m3862(m6570(), 182, C0473.f744 ^ 660, 725), false);
        this.f10186s = new n4(this, C0369.m7239(m6570(), 198, C0050.f70 ^ 936, 2689), false);
        this.f10187t = new p4(this, C0469.m9139(m6570(), 226, C0089.f123 ^ 406, 527), j10);
        this.f10188u = new j0.b0(this, C0476.m9301(m6570(), 254, C0205.f229 ^ 436, 2919));
        this.f10189v = new j0.b0(this, C0082.m1753(m6570(), 279, C0068.f88 ^ (-740), 1331));
        this.f10190w = new p4(this, C0308.m5959(m6570(), 305, C0015.f35 ^ 727, 1373), j10);
        this.f10191x = new i3.a0(this, C0170.m3259(m6570(), 341, C0193.f217 ^ 212, 1674));
        int iM3905 = C0204.m3905();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3905 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0211.m4040("BpTymFnrSayreXn8fTRocs4")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۤۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6570() {
        int iM1117 = C0059.m1117();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1117 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f558short;
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

    @Override // k6.o5
    public final boolean o() {
        return true;
    }

    public final boolean p(int i10) {
        int iM934 = C0048.m934(C0361.m7082(this), C0340.m6675(m6570(), 365, C0054.f74 ^ 320, 2415), C0386.f657 ^ (-763));
        C0179.m3415();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (i10 <= iM934) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = 1771;
                                break;
                            case 54:
                                return true;
                        }
                    }
                    break;
                case 239:
                    return false;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public final boolean q(long j10) {
        long jM7113 = C0363.m7113(C0255.m4887(this));
        long jM7114 = C0363.m7113(C0235.m4522(this));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (((j10 - 13) - jM7113) + 13 > jM7114) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return true;
                case 239:
                    return false;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final void r(boolean z10) {
        String str = "\u06e8\u06e3\u06e3";
        SharedPreferences sharedPreferencesM7082 = null;
        d4 d4VarM572 = null;
        SharedPreferences.Editor editorM3199 = null;
        Boolean boolM192 = null;
        f4 f4VarM2634 = null;
        String strM2265 = null;
        short[] sArrM6570 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56514:
                    i10 = C0202.f226;
                    str = "\u06e0\u06e5\u06e0";
                    break;
                case 1746692:
                    str = "\u06df\u06e7\u06e7";
                    f4VarM2634 = C0136.m2634(d4VarM572);
                    break;
                case 1746943:
                    C0419.m8245(f4VarM2634, strM2265, boolM192);
                    str = "\u06e8\u06e2\u06e8";
                    break;
                case 1747743:
                    C0333.m6480(editorM3199);
                    str = "\u06e5\u06df\u06df";
                    break;
                case 1747774:
                    str = "\u06e6\u06e8";
                    sArrM6570 = m6570();
                    break;
                case 1748618:
                    str = "\u06e6\u06e1\u06e6";
                    editorM3199 = C0167.m3199(sharedPreferencesM7082);
                    break;
                case 1748733:
                    str = "\u06e6\u06df\u06e7";
                    strM2265 = C0213.m4078(sArrM6570, 422, i11, 1882);
                    break;
                case 1749793:
                    str = "\u06e0\u06e3\u06e1";
                    d4VarM572 = C0029.m572(this);
                    break;
                case 1752453:
                    return;
                case 1753422:
                    C0482.m9390(editorM3199, strM2265, z10);
                    str = "\u06e0\u06e2\u06e1";
                    break;
                case 1753483:
                    str = "\u06e8\u06e1\u06df";
                    sArrM6570 = m6570();
                    break;
                case 1753538:
                    str = "\u06e7\u06e2\u06e8";
                    strM2265 = C0117.m2265(sArrM6570, 379, i11, 1768);
                    break;
                case 1754477:
                    str = "\u06df\u06df\u06e4";
                    boolM192 = C0009.m192(z10);
                    break;
                case 1755398:
                    i10 = C0330.f478;
                    str = "\u06e8\u06e5\u06e2";
                    break;
                case 1755438:
                    sharedPreferencesM7082 = C0361.m7082(this);
                    str = "\u06e1\u06df\u06e8";
                    break;
                case 1755464:
                    C0223.m4302(this);
                    str = "\u06e2\u06e6\u06e5";
                    break;
                case 1755525:
                    str = "\u06e1\u06e3\u06df";
                    i11 = i10 ^ 352;
                    break;
                default:
                    str = "\u06e6\u06e3\u06df";
                    i11 = i10 ^ (-400);
                    break;
            }
        }
    }

    public final SharedPreferences s() {
        SharedPreferences sharedPreferencesM6757 = null;
        String str = "\u06e8\u06e2\u06e4";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56538:
                    sharedPreferencesM6757 = C0345.m6757(this);
                    str = "\u06e1\u06e4\u06df";
                    break;
                case 1746966:
                    C0270.m5173(sharedPreferencesM6757);
                    str = "\u06e7\u06e1";
                    break;
                case 1748764:
                    return sharedPreferencesM6757;
                case 1750660:
                    sharedPreferencesM6757 = C0345.m6757(this);
                    str = "\u06df\u06e8\u06df";
                    break;
                case 1753700:
                    C0167.m3203(this);
                    str = "\u06e3\u06e3\u06e4";
                    break;
                default:
                    C0223.m4302(this);
                    str = "\u06e6\u06e8\u06e6";
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x00c4. Please report as an issue. */
    public final SparseArray t() {
        Bundle bundleM1313 = C0067.m1313(C0210.m4025(this));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (bundleM1313 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return new SparseArray();
                case 239:
                    int[] iArrM5867 = C0304.m5867(bundleM1313, C0184.m3519(m6570(), 451, C0376.f647 ^ 820, 2783));
                    long[] jArrM1460 = C0071.m1460(bundleM1313, C0370.m7267(m6570(), 461, C0332.f516 ^ 830, 627));
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iArrM5867 != null) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (jArrM1460 == null) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            int length = iArrM5867.length;
                                            int length2 = jArrM1460.length;
                                            int i13 = 48891;
                                            while (true) {
                                                i13 ^= 48908;
                                                switch (i13) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        SparseArray sparseArray = new SparseArray();
                                                        int i14 = 0;
                                                        while (true) {
                                                            int length3 = iArrM5867.length;
                                                            int i15 = 49666;
                                                            while (true) {
                                                                i15 ^= 49683;
                                                                switch (i15) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i15 = i14 < length3 ? 49759 : 49728;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 76:
                                                                        break;
                                                                    case 83:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                return sparseArray;
                                                            }
                                                            C0478.m9321(sparseArray, iArrM5867[i14], C0438.m8554(jArrM1460[i14]));
                                                            i14 += C0347.f618 ^ 385;
                                                            int i16 = 49790;
                                                            while (true) {
                                                                i16 ^= 49807;
                                                                switch (i16) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 241:
                                                                        i16 = 49821;
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case 503:
                                                        if (length != length2) {
                                                            i13 = 49635;
                                                        }
                                                        break;
                                                    case 32495:
                                                        C0135.m2604(C0454.m8871(C0029.m572(this)), C0438.m8563(m6570(), 474, C0109.f135 ^ 120, 2210));
                                                        return new SparseArray();
                                                    default:
                                                        continue;
                                                }
                                                i13 = 48953;
                                            }
                                            break;
                                        case 47417:
                                            int i17 = 48767;
                                            while (true) {
                                                i17 ^= 48784;
                                                switch (i17) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 239:
                                                        i17 = 48798;
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
                                break;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    return new SparseArray();
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final s5 u() {
        String str = "\u06e1\u06e6\u06e8";
        s5 s5VarM5225 = null;
        String strM1259 = null;
        String strM595 = null;
        String strM2234 = null;
        SharedPreferences sharedPreferencesM7082 = null;
        short[] sArrM6570 = null;
        int i10 = 0;
        int iM934 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56420:
                    str = "\u06e5\u06e5\u06e8";
                    iM934 = C0395.f666;
                    break;
                case 1746818:
                    str = "\u06e6\u06e1\u06e5";
                    iM934 = C0048.m934(sharedPreferencesM7082, strM2234, i10);
                    break;
                case 1747681:
                    str = "\u06e1\u06e4\u06e1";
                    sharedPreferencesM7082 = C0361.m7082(this);
                    break;
                case 1747929:
                    str = "\u06e8\u06e2\u06e8";
                    sArrM6570 = m6570();
                    break;
                case 1748766:
                    str = "\u06e3\u06e3\u06e6";
                    sArrM6570 = m6570();
                    break;
                case 1748835:
                    C0223.m4302(this);
                    str = "\u06e0\u06e0\u06e1";
                    break;
                case 1750534:
                    str = "\u06e7\u06e8\u06e2";
                    strM595 = C0031.m595(sharedPreferencesM7082, strM2234, strM1259);
                    break;
                case 1750662:
                    str = "\u06e3\u06e6\u06e0";
                    iM934 = C0109.f135;
                    break;
                case 1750749:
                    i10 = iM934 ^ 83;
                    str = "\u06e4\u06e6\u06e1";
                    break;
                case 1751711:
                    str = "\u06e0\u06e8\u06e1";
                    strM2234 = C0286.m5516(sArrM6570, 533, i10, 2235);
                    break;
                case 1751744:
                    str = "\u06e7\u06e6\u06e8";
                    strM2234 = C0116.m2234(sArrM6570, 551, i10, 2092);
                    break;
                case 1752648:
                    i10 = iM934 ^ 919;
                    str = "\u06e4\u06e7\u06e3";
                    break;
                case 1753482:
                    s5VarM5225 = C0271.m5225(iM934, strM595);
                    str = "\u06e7\u06e8\u06e1";
                    break;
                case 1753666:
                    i10 = iM934 ^ 358;
                    str = "\u06df\u06e3\u06e6";
                    break;
                case 1753696:
                    i10 = iM934 ^ 552;
                    str = "\u06df\u06e7\u06e2";
                    break;
                case 1753702:
                    str = "\u06e3\u06e7";
                    sArrM6570 = m6570();
                    break;
                case 1754601:
                    str = "\u06e6\u06e7\u06e3";
                    iM934 = C0314.f462;
                    break;
                case 1754656:
                    return s5VarM5225;
                case 1754657:
                    str = "\u06e6\u06e8\u06e8";
                    sharedPreferencesM7082 = C0361.m7082(this);
                    break;
                case 1755438:
                    str = "\u06e6\u06e8\u06e2";
                    iM934 = C0211.f235;
                    break;
                default:
                    str = "\u06e3\u06df\u06e2";
                    strM1259 = C0065.m1259(sArrM6570, 549, i10, 1225);
                    break;
            }
        }
    }

    public final void v() {
        SharedPreferences sharedPreferencesM8693 = C0445.m8693(C0276.m5311(this), C0354.m6950(m6570(), 565, C0446.f717 ^ (-6), 1026), 0);
        this.f10170c = sharedPreferencesM8693;
        String strM8230 = C0418.m8230(m6570(), 605, C0147.f172 ^ 928, 1089);
        boolean zM2784 = C0146.m2784(sharedPreferencesM8693, strM8230, false);
        this.f10184q = zM2784;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = !zM2784 ? 1709 : 1678;
                    break;
                case 204:
                    SharedPreferences.Editor editorM3199 = C0167.m3199(C0345.m6757(this));
                    C0482.m9390(editorM3199, strM8230, true);
                    C0333.m6480(editorM3199);
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        this.f10171d = new o4(this, C0242.m4661(972 ^ ((long) C0021.f41), C0490.m9543((Long) C0261.m4995(C0385.m7556(), null))));
        int iM4380 = C0227.m4380();
        int i11 = 1740;
        while (true) {
            i11 ^= 1757;
            switch (i11) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM4380 <= 0) {
                        i11 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    return;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    System.out.println(Long.parseLong(C0426.m8366("pdo6WVIb9wXhxhclxE")));
                    return;
                default:
                    continue;
            }
            i11 = 1802;
        }
    }
}
