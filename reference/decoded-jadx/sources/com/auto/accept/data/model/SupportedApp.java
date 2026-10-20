package com.auto.accept.data.model;

import a.C0000;
import a.C0002;
import a0.C0003;
import a2.C0005;
import a7.C0008;
import a8.C0010;
import aa.C0011;
import android.support.v4.app.C0014;
import androidx.annotation.C0018;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.graphics.C0030;
import androidx.compose.ui.graphics.C0031;
import androidx.compose.ui.input.key.C0033;
import androidx.compose.ui.layout.C0035;
import androidx.lifecycle.C0043;
import androidx.preference.C0044;
import androidx.versionedparcelable.C0048;
import b3.C0051;
import c0.C0057;
import c1.C0060;
import c4.C0065;
import c7.C0068;
import c7.C0069;
import ca.C0070;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.datatransport.cct.C0077;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.internal.tasks.C0103;
import com.google.android.gms.measurement.internal.C0104;
import com.google.android.gms.tasks.C0106;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.components.C0135;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.iid.C0169;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.inject.C0172;
import com.google.firebase.installations.C0177;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.measurement.C0184;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.firebase.remoteconfig.ktx.C0199;
import com.google.firebase.remoteconfiginterop.C0202;
import com.google.gson.internal.bind.C0206;
import com.google.gson.internal.sql.C0208;
import com.ride.accepter.R;
import d.C0210;
import d1.C0213;
import d3.C0216;
import d7.C0219;
import d7.C0220;
import d8.C0221;
import d9.f;
import dagger.hilt.android.C0240;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.android.lifecycle.C0236;
import dagger.hilt.codegen.C0241;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import dagger.hilt.internal.aliasof.C0247;
import dagger.hilt.internal.componenttreedeps.C0248;
import dagger.hilt.internal.generatesrootinput.C0250;
import e0.C0256;
import e1.C0258;
import e9.C0266;
import f.C0269;
import f0.C0272;
import f4.C0274;
import fa.C0279;
import fa.C0280;
import fa.C0281;
import g.C0282;
import g0.C0285;
import g2.C0286;
import g2.C0287;
import g3.C0288;
import g5.C0291;
import g7.C0292;
import g8.C0293;
import ga.C0295;
import h.C0298;
import h3.C0303;
import h4.C0304;
import h5.C0306;
import h5.C0308;
import h7.C0310;
import i.C0315;
import i5.C0318;
import i6.C0320;
import j6.C0328;
import ja.C0330;
import java.util.List;
import k.C0331;
import k8.C0338;
import l6.C0343;
import l8.C0346;
import la.C0348;
import m1.C0351;
import m3.C0352;
import m4.C0353;
import m7.C0357;
import m9.C0359;
import n.C0360;
import n.C0361;
import n1.C0362;
import n7.C0363;
import n8.C0365;
import o4.C0369;
import o7.i2;
import p0.C0374;
import p3.C0375;
import p8.C0380;
import q0.C0381;
import q1.C0383;
import q2.C0384;
import q6.C0386;
import q7.C0389;
import q7.C0390;
import r2.C0397;
import r5.C0399;
import r5.C0400;
import r6.C0402;
import r9.C0405;
import s.C0408;
import s8.C0416;
import s8.C0417;
import t1.C0419;
import t2.C0420;
import t2.C0421;
import t2.C0423;
import t3.C0424;
import t7.C0425;
import t8.C0426;
import u.C0429;
import u7.C0437;
import v0.C0440;
import v0.C0443;
import v5.C0445;
import v6.C0446;
import v7.C0448;
import v7.C0449;
import w0.C0454;
import w1.C0455;
import w2.C0458;
import w4.C0461;
import w6.C0464;
import x0.C0466;
import x4.C0469;
import x7.C0471;
import x8.C0473;
import y.C0474;
import y6.C0476;
import y9.C0478;
import z2.C0484;
import z3.C0487;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public final class SupportedApp {
    private static final List<SupportedApp> ALL_APPS;
    private final List<String> acceptKeywords;
    private final boolean enabled;
    private final int iconRes;
    private final String name;
    private final List<String> packageKeywords;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f95short = {1718, 1685, 1688, 2339, 2336, 2349, 968, 970, 970, 972, 985, 989, 1528, 1524, 1525, 1533, 1522, 1513, 1526, 501, 505, 492, 507, 496, 1994, 2045, 2042, 2029, 2732, 2747, 2748, 2731, 2021, 2029, 2496, 2519, 2497, 2519, 2496, 2500, 2519, 2092, 2079, 2062, 2071, 2074, 2065, 1288, 1288, 1364, 1307, 1300, 1310, 1288, 1301, 1299, 1310, 706, 704, 721, 725, 704, 712, 719, 1796, 1815, 1798, 1823, 1810, 1817, 391, 402, 408, 406, 1652, 1627, 1623, 1623, 1627, 1562, 1635, 1627, 1614, 1608, 1619, 1450, 1458, 1447, 1441, 1466, 2364, 2339, 2341, 2342, 2359, 2351, 1184, 1199, 1187, 1187, 1199, 1300, 1309, 1309, 1310, 1289, 1435, 1454, 1452, 1440, 1461, 1454, 2493, 2472, 2474, 2470, 2483, 2472, 2873, 2878, 2859, 2872, 2878, 3110, 3074, 3100, 3090, 3090, 3084, 853, 849, 847, 833, 833, 863, 732, 709, 719, 711, 3054, 3039, 3012, 3024, 3013, 2780, 2765, 2774, 2754, 2775, 1792, 1838, 1835, 1836, 1833, 1835, 1846, 2267, 2261, 2256, 2263, 2258, 2256, 2253, 925, 904, 917, 924, 927, 904, 905, 980, 1003, 1022, 1018, 993, 2779, 2756, 2769, 2773, 2766, 1972, 1951, 1937, 1972, 1943, 1925, 1949, 1939, 1922, 2922, 2913, 2927, 2922, 2921, 2939, 2915, 2925, 2940, 1402, 1349, 1368, 1374, 1359, 1368, 3320, 3303, 3322, 3324, 3309, 3322, 1650, 1621, 1608, 1615, 1626, 1622, 1626, 1609, 1615, 1569, 1574, 1595, 1596, 1577, 1573, 1577, 1594, 1596, 2237, 2226, 2238, 2230, 297, 312, 314, 306, 312, 318, 316, 274, 316, 288, 302, 310, 299, 317, 298, 2305, 2307, 2307, 2309, 2320, 2324, 2347, 2309, 2329, 2327, 2319, 2322, 2308, 2323, 2545, 2557, 2556, 2548, 2555, 2528, 2559, 1841, 1853, 1832, 1855, 1844, 660, 662, 662, 656, 645, 641, 859, 852, 856, 848, 2417, 2400, 2402, 2410, 2400, 2406, 2404, 2378, 2404, 2424, 2422, 2414, 2419, 2405, 2418, 3125, 3127, 3127, 3121, 3108, 3104, 3103, 3121, 3117, 3107, 3131, 3110, 3120, 3111, 2998, 2960, 2965, 2965, 2954, 2967, 2961, 2944, 2945, 2980, 2965, 2965, 3021, 2955, 2948, 2952, 2944, 3032, 1258, 1254, 1206, 1191, 1189, 1197, 1191, 1185, 1187, 1165, 1187, 1215, 1201, 1193, 1204, 1186, 1205, 1275, 1884, 1872, 1809, 1811, 1811, 1813, 1792, 1796, 1851, 1813, 1801, 1799, 1823, 1794, 1812, 1795, 1869, 1048, 1044, 1105, 1114, 1109, 1110, 1112, 1105, 1104, 1033, 1213, 1201, 1272, 1266, 1278, 1279, 1219, 1268, 1250, 1196, 2384};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
            int iM833 = C0043.m833();
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        if (iM833 <= 0) {
                            i10 = 1709;
                        }
                        break;
                    case 204:
                        System.out.println(Integer.valueOf(C0473.m9217("kDtK")));
                        return;
                    case 239:
                        return;
                    default:
                        continue;
                }
                i10 = 1678;
            }
        }

        public /* synthetic */ Companion(f fVar) {
            this();
            int iM3380 = C0177.m3380();
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        if (iM3380 <= 0) {
                            i10 = 1709;
                        }
                        break;
                    case 204:
                        System.out.println(Integer.valueOf(C0291.m5617("pNoTbasr4RNA2PlAOTuRxmUTpRiZ4")));
                        return;
                    case 239:
                        return;
                    default:
                        continue;
                }
                i10 = 1678;
            }
        }

        public final List<SupportedApp> getALL_APPS() {
            return C0476.m9287();
        }
    }

    static {
        String strM8010 = C0408.m8010(m1423(), 0, C0139.f165 ^ 641, 1785);
        List listM6195 = C0320.m6195(C0172.m3283(m1423(), 3, C0127.f153 ^ (-515), 2380));
        String strM9093 = C0466.m9093(m1423(), 6, C0051.f71 ^ (-428), 937);
        String strM5865 = C0304.m5865(m1423(), 12, C0077.f111 ^ (-661), 1435);
        String strM7631 = C0389.m7631(m1423(), 19, C0310.f458 ^ (-186), 408);
        String[] strArr = new String[3];
        strArr[C0440.f711 ^ (-882)] = strM9093;
        strArr[C0320.f468 ^ (-805)] = strM5865;
        strArr[C0169.f193 ^ 742] = strM7631;
        SupportedApp supportedApp = new SupportedApp(strM8010, listM6195, C0405.m7965(strArr), false, R.drawable.ic_logo_ola, C0405.f676 ^ 88, null);
        String strM4259 = C0220.m4259(m1423(), 24, C0365.f636 ^ (-192), 1951);
        List listM6196 = C0320.m6195(C0269.m5144(m1423(), 28, C0135.f161 ^ (-897), 2777));
        String strM2874 = C0150.m2874(m1423(), 32, C0057.f77 ^ 691, 1922);
        String strM2667 = C0138.m2667(m1423(), 34, C0029.f49 ^ (-488), 2482);
        String[] strArr2 = new String[5];
        strArr2[C0190.f214 ^ (-37)] = strM9093;
        strArr2[C0005.f1063 ^ 521] = strM5865;
        strArr2[C0008.f28 ^ (-6)] = strM7631;
        strArr2[C0346.f617 ^ (-764)] = strM2874;
        strArr2[C0423.f694 ^ 802] = strM2667;
        List listM7965 = C0405.m7965(strArr2);
        int i10 = C0003.f881 ^ (-853);
        SupportedApp supportedApp2 = new SupportedApp(strM4259, listM6196, listM7965, false, R.drawable.ic_logo_uber, i10, null);
        String strM647 = C0033.m647(m1423(), 41, C0227.f307 ^ (-906), 2174);
        String strM6742 = C0343.m6742(m1423(), 47, C0369.f640 ^ (-382), 1402);
        String strM8935 = C0458.m8935(m1423(), 57, C0476.f750 ^ 584, 673);
        String[] strArr3 = new String[3];
        strArr3[C0220.f300 ^ (-125)] = C0362.m7110(m1423(), 64, C0002.f770 ^ (-14), 1910);
        strArr3[C0381.f652 ^ (-19)] = strM6742;
        strArr3[C0199.f223 ^ (-54)] = strM8935;
        List listM7966 = C0405.m7965(strArr3);
        String strM360 = C0018.m360(m1423(), 70, C0425.f696 ^ (-341), 499);
        String[] strArr4 = new String[4];
        strArr4[C0384.f655 ^ 599] = strM9093;
        strArr4[C0383.f654 ^ (-53)] = strM5865;
        strArr4[C0287.f432 ^ (-543)] = strM7631;
        strArr4[C0399.f670 ^ 1] = strM360;
        List listM7967 = C0405.m7965(strArr4);
        int i11 = C0216.f240 ^ (-928);
        SupportedApp supportedApp3 = new SupportedApp(strM647, listM7966, listM7967, false, R.drawable.ic_logo_rapido, i11, null);
        String strM4552 = C0236.m4552(m1423(), 74, C0080.f114 ^ (-597), 1594);
        String strM7239 = C0369.m7239(m1423(), 85, C0241.f321 ^ (-801), 1491);
        String strM2920 = C0152.m2920(m1423(), 90, C0353.f624 ^ 895, 2390);
        String[] strArr5 = new String[3];
        strArr5[C0303.f451 ^ (-606)] = C0330.m6370(m1423(), 96, C0274.f390 ^ 899, 1230);
        strArr5[C0421.f692 ^ (-288)] = strM7239;
        strArr5[C0228.f308 ^ (-570)] = strM2920;
        List listM7968 = C0405.m7965(strArr5);
        String strM1728 = C0080.m1728(m1423(), 101, C0461.f732 ^ 856, 1403);
        String[] strArr6 = new String[4];
        strArr6[C0250.f330 ^ (-134)] = strM9093;
        strArr6[C0139.f165 ^ 643] = strM5865;
        strArr6[C0248.f328 ^ 63] = strM7631;
        strArr6[C0380.f651 ^ (-705)] = strM1728;
        SupportedApp supportedApp4 = new SupportedApp(strM4552, listM7968, C0405.m7965(strArr6), false, 2131165567 ^ C0219.f299, i10, null);
        String strM8346 = C0425.m8346(m1423(), 106, C0150.f175 ^ (-859), 1473);
        List listM6197 = C0320.m6195(C0184.m3519(m1423(), 112, C0071.f98 ^ (-536), 2503));
        String strM9301 = C0476.m9301(m1423(), 118, C0476.f750 ^ 586, 2890);
        String[] strArr7 = new String[3];
        strArr7[C0295.f443 ^ 91] = strM9093;
        strArr7[C0449.f720 ^ 361] = strM5865;
        strArr7[C0426.f697 ^ 379] = strM9301;
        SupportedApp supportedApp5 = new SupportedApp(strM8346, listM6197, C0405.m7965(strArr7), false, 2131165664 ^ C0286.f431, i11, null);
        String strM9331 = C0478.m9331(m1423(), 123, C0375.f646 ^ (-127), 3189);
        List listM6198 = C0320.m6195(C0044.m855(m1423(), 129, C0352.f623 ^ (-629), 806));
        String strM8868 = C0454.m8868(m1423(), 135, C0292.f440 ^ 43, 684);
        String[] strArr8 = new String[4];
        strArr8[C0115.f141 ^ (-576)] = strM9093;
        strArr8[C0357.f628 ^ 781] = strM5865;
        strArr8[C0245.f325 ^ 292] = strM9301;
        strArr8[C0318.f466 ^ 172] = strM8868;
        SupportedApp supportedApp6 = new SupportedApp(strM9331, listM6198, C0405.m7965(strArr8), false, 2131165830 ^ C0424.f695, i10, null);
        String strM4786 = C0250.m4786(m1423(), 139, C0282.f427 ^ (-983), 2986);
        List listM6199 = C0320.m6195(C0386.m7577(m1423(), 144, C0419.f690 ^ 95, 2744));
        String[] strArr9 = new String[4];
        strArr9[C0397.f668 ^ 728] = strM9093;
        strArr9[C0035.f55 ^ (-707)] = strM5865;
        strArr9[C0219.f299 ^ 256] = strM9301;
        strArr9[C0104.f130 ^ 784] = strM8868;
        SupportedApp supportedApp7 = new SupportedApp(strM4786, listM6199, C0405.m7965(strArr9), false, 2131165849 ^ C0360.f631, i11, null);
        String strM6177 = C0318.m6177(m1423(), 149, C0338.f609 ^ 809, 1858);
        String strM7834 = C0400.m7834(m1423(), 156, C0484.f758 ^ (-738), 2233);
        String strM4907 = C0256.m4907(m1423(), 163, C0011.f31 ^ 355, 1018);
        String[] strArr10 = new String[2];
        strArr10[C0157.f181 ^ (-324)] = strM7834;
        strArr10[C0258.f338 ^ 741] = strM4907;
        List listM7969 = C0405.m7965(strArr10);
        String[] strArr11 = new String[4];
        strArr11[C0024.f44 ^ 535] = strM9093;
        strArr11[C0437.f708 ^ (-856)] = strM5865;
        strArr11[C0308.f456 ^ (-240)] = strM9301;
        strArr11[C0348.f619 ^ 982] = strM8868;
        SupportedApp supportedApp8 = new SupportedApp(strM6177, listM7969, C0405.m7965(strArr11), false, 2131165816 ^ C0315.f463, i10, null);
        String strM6403 = C0331.m6403(m1423(), 170, C0010.f30 ^ 884, 910);
        List listM61910 = C0320.m6195(C0417.m8192(m1423(), 175, C0100.f126 ^ (-573), 2721));
        String[] strArr12 = new String[3];
        strArr12[C0210.f234 ^ 361] = strM9093;
        strArr12[C0425.f696 ^ (-338)] = strM5865;
        strArr12[C0293.f441 ^ (-945)] = strM9301;
        List listM79610 = C0405.m7965(strArr12);
        int i12 = C0484.f758 ^ (-751);
        SupportedApp supportedApp9 = new SupportedApp(strM6403, listM61910, listM79610, false, R.drawable.ic_logo_zepto, i12, null);
        String strM8936 = C0458.m8935(m1423(), 180, C0458.f729 ^ (-320), 2038);
        List listM61911 = C0320.m6195(C0416.m8170(m1423(), 189, C0127.f153 ^ (-521), 2824));
        String[] strArr13 = new String[3];
        strArr13[C0157.f181 ^ (-324)] = strM9093;
        strArr13[C0285.f430 ^ (-871)] = strM5865;
        strArr13[C0402.f673 ^ 778] = strM9301;
        List listM79611 = C0405.m7965(strArr13);
        int i13 = C0359.f630 ^ 305;
        SupportedApp supportedApp10 = new SupportedApp(strM8936, listM61911, listM79611, false, R.drawable.ic_logo_bigbasket, i13, null);
        String strM7649 = C0390.m7649(m1423(), 198, C0280.f425 ^ (-454), 1322);
        List listM61912 = C0320.m6195(C0361.m7077(m1423(), 204, C0274.f390 ^ 896, 3208));
        String[] strArr14 = new String[3];
        strArr14[C0492.f766 ^ (-816)] = strM9093;
        strArr14[C0106.f132 ^ (-235)] = strM5865;
        strArr14[C0073.f107 ^ (-913)] = strM7631;
        SupportedApp supportedApp11 = new SupportedApp(strM7649, listM61912, C0405.m7965(strArr14), false, 2131165604 ^ C0110.f136, i12, null);
        String strM3519 = C0184.m3519(m1423(), 210, C0351.f622 ^ 543, 1595);
        List listM61913 = C0320.m6195(C0112.m2172(m1423(), 219, C0148.f173 ^ (-249), 1608));
        String[] strArr15 = new String[3];
        strArr15[C0474.f745 ^ (-610)] = strM9093;
        strArr15[C0266.f346 ^ (-771)] = strM5865;
        strArr15[C0164.f188 ^ 415] = strM9301;
        SupportedApp supportedApp12 = new SupportedApp(strM3519, listM61913, C0405.m7965(strArr15), false, (-2131165682) ^ C0103.f129, i13, null);
        SupportedApp[] supportedAppArr = new SupportedApp[12];
        supportedAppArr[C0044.f64 ^ 62] = supportedApp;
        supportedAppArr[C0031.f51 ^ (-153)] = supportedApp2;
        supportedAppArr[C0469.f740 ^ 201] = supportedApp3;
        supportedAppArr[C0068.f88 ^ (-763)] = supportedApp4;
        supportedAppArr[C0374.f645 ^ (-782)] = supportedApp5;
        supportedAppArr[C0200.f224 ^ 307] = supportedApp6;
        supportedAppArr[C0478.f752 ^ (-830)] = supportedApp7;
        supportedAppArr[C0048.f68 ^ (-744)] = supportedApp8;
        supportedAppArr[C0208.f232 ^ 362] = supportedApp9;
        supportedAppArr[C0127.f153 ^ (-521)] = supportedApp10;
        supportedAppArr[C0069.f89 ^ (-804)] = supportedApp11;
        supportedAppArr[C0478.f752 ^ (-817)] = supportedApp12;
        ALL_APPS = C0405.m7965(supportedAppArr);
    }

    public SupportedApp(String str, List<String> list, List<String> list2, boolean z10, int i10) {
        C0375.m7360(str, C0455.m8879(m1423(), 228, C0240.f320 ^ 463, 2259));
        C0375.m7360(list, C0375.m7355(m1423(), 232, C0003.f881 ^ (-852), 345));
        C0375.m7360(list2, C0014.m279(m1423(), 247, C0060.f80 ^ (-882), 2400));
        this.name = str;
        this.packageKeywords = list;
        this.acceptKeywords = list2;
        this.enabled = z10;
        this.iconRes = i10;
        int iM3229 = C0168.m3229();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3229 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0443.m8650("s2BhIxXSdRU")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SupportedApp(String str, List list, List list2, boolean z10, int i10, int i11, f fVar) {
        List listM7965;
        boolean z11;
        int i12;
        int i13 = C0139.f165;
        int i14 = 1616;
        while (true) {
            i14 ^= 1633;
            switch (i14) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i14 = ((i13 ^ 646) & i11) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    String strM4271 = C0221.m4271(m1423(), 261, C0298.f446 ^ (-142), 2450);
                    String strM2056 = C0106.m2056(m1423(), 268, C0288.f433 ^ 754, 1884);
                    String[] strArr = new String[3];
                    strArr[C0202.f226 ^ (-421)] = C0070.m1360(m1423(), 273, C0126.f152 ^ (-202), 757);
                    strArr[C0487.f761 ^ (-285)] = strM4271;
                    strArr[C0295.f443 ^ 89] = strM2056;
                    listM7965 = C0405.m7965(strArr);
                    break;
                case 239:
                    listM7965 = list2;
                    break;
                default:
                    break;
            }
        }
        int i15 = C0492.f766;
        int i16 = 1740;
        while (true) {
            i16 ^= 1757;
            switch (i16) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i16 = ((i15 ^ (-808)) & i11) != 0 ? 1833 : 1802;
                    break;
                case 54:
                    break;
                case 471:
                    z11 = z10;
                    break;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    z11 = true;
                    break;
                default:
                    break;
            }
        }
        int i17 = C0389.f660;
        int i18 = 1864;
        while (true) {
            i18 ^= 1881;
            switch (i18) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i18 = ((i17 ^ 215) & i11) != 0 ? 48736 : 48705;
                    break;
                case 47384:
                    i12 = i10;
                    break;
                case 47417:
                    i12 = R.drawable.ic_logo_ola;
                    break;
                case 47483:
                    break;
                default:
                    break;
            }
        }
        this(str, list, listM7965, z11, i12);
        int iM5432 = C0280.m5432();
        int i19 = 48767;
        while (true) {
            i19 ^= 48784;
            switch (i19) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    return;
                case 76:
                    System.out.println(Long.decode(C0272.m5244("Xc")));
                    return;
                case 239:
                    if (iM5432 <= 0) {
                        i19 = 48860;
                    }
                    break;
                default:
                    continue;
            }
            i19 = 48829;
        }
    }

    public static /* synthetic */ SupportedApp copy$default(SupportedApp supportedApp, String str, List list, List list2, boolean z10, int i10, int i11, Object obj) {
        String strM1422;
        List listM1426;
        List listM1425;
        boolean zM1424;
        int iM1421;
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i12 = ((i11 ^ (-2)) & i11) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    strM1422 = m1422(supportedApp);
                    break;
                case 239:
                    strM1422 = str;
                    break;
                default:
                    break;
            }
        }
        int i13 = C0085.f119;
        int i14 = 1740;
        while (true) {
            i14 ^= 1757;
            switch (i14) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (((i13 ^ 155) & i11) != 0) {
                        i14 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    listM1426 = list;
                    break;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    listM1426 = m1426(supportedApp);
                    break;
                default:
                    continue;
            }
            i14 = 1802;
        }
        int i15 = C0464.f735;
        int i16 = 1864;
        while (true) {
            i16 ^= 1881;
            switch (i16) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i16 = ((i15 ^ 442) & i11) != 0 ? 48736 : 48705;
                    break;
                case 47384:
                    listM1425 = list2;
                    break;
                case 47417:
                    listM1425 = m1425(supportedApp);
                    break;
                case 47483:
                    break;
                default:
                    break;
            }
        }
        int i17 = C0420.f691;
        int i18 = 48767;
        while (true) {
            i18 ^= 48784;
            switch (i18) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    zM1424 = z10;
                    break;
                case 76:
                    zM1424 = m1424(supportedApp);
                    break;
                case 239:
                    i18 = ((i17 ^ 317) & i11) != 0 ? 48860 : 48829;
                    break;
                default:
                    break;
            }
        }
        int i19 = C0286.f431;
        int i20 = 48891;
        while (true) {
            i20 ^= 48908;
            switch (i20) {
                case 22:
                    break;
                case 53:
                    iM1421 = i10;
                    break;
                case 503:
                    if (((i19 ^ 372) & i11) != 0) {
                        i20 = 49635;
                    }
                    break;
                case 32495:
                    iM1421 = m1421(supportedApp);
                    break;
                default:
                    continue;
            }
            i20 = 48953;
        }
        return C0466.m9078(supportedApp, strM1422, listM1426, listM1425, zM1424, iM1421);
    }

    /* JADX INFO: renamed from: ۟۟۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static List m1420() {
        int iM575 = C0030.m575();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM575 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ALL_APPS;
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

    /* JADX INFO: renamed from: ۟۠ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static int m1421(Object obj) {
        int iM2123 = C0110.m2123();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2123 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((SupportedApp) obj).iconRes;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧۧ۠, reason: not valid java name and contains not printable characters */
    public static String m1422(Object obj) {
        int iM690 = C0035.m690();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM690 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((SupportedApp) obj).name;
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

    /* JADX INFO: renamed from: ۣ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m1423() {
        int iM5443 = C0281.m5443();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5443 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f95short;
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

    /* JADX INFO: renamed from: ۣۧۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1424(Object obj) {
        int iM1257 = C0065.m1257();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1257 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((SupportedApp) obj).enabled;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۥۧۨ, reason: contains not printable characters */
    public static List m1425(Object obj) {
        int iM2336 = C0121.m2336();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2336 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((SupportedApp) obj).acceptKeywords;
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

    /* JADX INFO: renamed from: ۦ۟ۥۦ, reason: contains not printable characters */
    public static List m1426(Object obj) {
        int iM12 = C0000.m12();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM12 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((SupportedApp) obj).packageKeywords;
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

    public final String component1() {
        return m1422(this);
    }

    public final List<String> component2() {
        return m1426(this);
    }

    public final List<String> component3() {
        return m1425(this);
    }

    public final boolean component4() {
        return m1424(this);
    }

    public final int component5() {
        return m1421(this);
    }

    public final SupportedApp copy(String str, List<String> list, List<String> list2, boolean z10, int i10) {
        String str2 = "\u06e6\u06e2";
        SupportedApp supportedApp = null;
        short[] sArrM1423 = null;
        String strM5911 = null;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            switch (C0124.m2383(str2)) {
                case 56412:
                    str2 = "\u06e8\u06e3\u06e7";
                    i12 = i11 ^ (-620);
                    break;
                case 56508:
                    str2 = "\u06e5\u06e3\u06e8";
                    sArrM1423 = m1423();
                    break;
                case 56567:
                    str2 = "\u06e0\u06e4\u06df";
                    sArrM1423 = m1423();
                    break;
                case 1746788:
                    str2 = "\u06df\u06e5\u06e0";
                    strM5911 = C0306.m5911(sArrM1423, 279, i12, 821);
                    break;
                case 1746972:
                    str2 = "\u06e0\u06e5\u06e6";
                    i12 = i11 ^ 195;
                    break;
                case 1747803:
                    str2 = "\u06e3\u06df";
                    i11 = C0142.f168;
                    break;
                case 1747841:
                    str2 = "\u06e8\u06df\u06e4";
                    strM5911 = C0176.m3354(sArrM1423, 283, i12, 2305);
                    break;
                case 1748857:
                    C0375.m7360(list2, strM5911);
                    str2 = "\u06e6\u06e2\u06e6";
                    break;
                case 1749666:
                    str2 = "\u06e8\u06e7\u06e3";
                    sArrM1423 = m1423();
                    break;
                case 1749694:
                    return supportedApp;
                case 1752586:
                    str2 = "\u06e5\u06e7\u06e1";
                    i11 = C0236.f316;
                    break;
                case 1752703:
                    str2 = "\u06df\u06e2\u06e7";
                    i12 = i11 ^ (-770);
                    break;
                case 1753514:
                    supportedApp = new SupportedApp(str, list, list2, z10, i10);
                    str2 = "\u06e2\u06e3\u06df";
                    break;
                case 1755341:
                    C0375.m7360(list, strM5911);
                    str2 = "\u06e8\u06df";
                    break;
                case 1755468:
                    str2 = "\u06e1\u06e7\u06df";
                    strM5911 = C0233.m4496(sArrM1423, 298, i12, 3156);
                    break;
                case 1755588:
                    str2 = "\u06df\u06e8\u06e5";
                    i11 = C0193.f217;
                    break;
                default:
                    C0375.m7360(str, strM5911);
                    str2 = "\u06e2\u06e2\u06e2";
                    break;
            }
        }
    }

    public boolean equals(Object obj) {
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
                    boolean z10 = obj instanceof SupportedApp;
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!z10) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                SupportedApp supportedApp = (SupportedApp) obj;
                                boolean zM4399 = C0228.m4399(m1422(this), m1422(supportedApp));
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (!zM4399) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            boolean zM43910 = C0228.m4399(m1426(this), m1426(supportedApp));
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        boolean zM43911 = C0228.m4399(m1425(this), m1425(supportedApp));
                                                        int i14 = 48891;
                                                        while (true) {
                                                            i14 ^= 48908;
                                                            switch (i14) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    boolean zM1424 = m1424(this);
                                                                    boolean zM1425 = m1424(supportedApp);
                                                                    int i15 = 49666;
                                                                    while (true) {
                                                                        i15 ^= 49683;
                                                                        switch (i15) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (zM1424 != zM1425) {
                                                                                    i15 = 49759;
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 76:
                                                                                return false;
                                                                            case 83:
                                                                                int iM1421 = m1421(this);
                                                                                int iM1422 = m1421(supportedApp);
                                                                                int i16 = 49790;
                                                                                while (true) {
                                                                                    i16 ^= 49807;
                                                                                    switch (i16) {
                                                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 51:
                                                                                            return true;
                                                                                        case 84:
                                                                                            return false;
                                                                                        case 241:
                                                                                            if (iM1421 != iM1422) {
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

    public final List<String> getAcceptKeywords() {
        return m1425(this);
    }

    public final boolean getEnabled() {
        return m1424(this);
    }

    public final int getIconRes() {
        return m1421(this);
    }

    public final String getName() {
        return m1422(this);
    }

    public final List<String> getPackageKeywords() {
        return m1426(this);
    }

    public int hashCode() {
        String str = "\u06e4\u06e2\u06df";
        String strM1422 = null;
        List listM1425 = null;
        boolean zM1424 = false;
        int i10 = 0;
        int iM8418 = 0;
        int iM2842 = 0;
        int iM5411 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56290:
                    str = "\u06e0\u06df\u06e6";
                    listM1425 = m1426(this);
                    break;
                case 56447:
                    str = "\u06e4\u06e0\u06e1";
                    iM2842 = 0 - iM8418;
                    break;
                case 56480:
                    str = "\u06e1\u06e4\u06e4";
                    iM2842 = i10 - iM8418;
                    break;
                case 56511:
                    str = "\u06e6\u06e3\u06e6";
                    iM2842 = C0148.m2842(listM1425);
                    break;
                case 1746723:
                    str = "\u06e1\u06e1\u06e8";
                    iM5411 = C0279.m5411(iM2842);
                    break;
                case 1747655:
                    str = "\u06e4\u06e3";
                    iM8418 = C0148.m2842(listM1425);
                    break;
                case 1747933:
                    str = "\u06df\u06e1";
                    iM5411 = iM8418 * i10;
                    break;
                case 1748680:
                    str = "\u06e5\u06e5";
                    i10 = 0 - iM5411;
                    break;
                case 1748769:
                    str = "\u06e4\u06e8\u06e5";
                    iM5411 = 0 - iM2842;
                    break;
                case 1748866:
                    str = "\u06e6\u06e5";
                    listM1425 = m1425(this);
                    break;
                case 1751501:
                    str = "\u06e5\u06e7\u06e6";
                    iM2842 = iM5411 - iM8418;
                    break;
                case 1751525:
                    str = "\u06e4\u06e5\u06e8";
                    iM8418 = iM5411 - iM2842;
                    break;
                case 1751585:
                    strM1422 = m1422(this);
                    str = "\u06df\u06df";
                    break;
                case 1751687:
                    str = "\u06e1\u06e7\u06e8";
                    iM5411 = iM8418 * i10;
                    break;
                case 1751715:
                    str = "\u06e0\u06e8\u06e5";
                    i10 = iM5411 ^ (-17);
                    break;
                case 1751777:
                    return iM5411;
                case 1752708:
                    str = "\u06e8\u06e2\u06df";
                    iM5411 = iM2842 * i10;
                    break;
                case 1753482:
                    str = "\u06e7\u06df\u06e3";
                    iM8418 = C0445.m8688(zM1424, iM5411, i10);
                    break;
                case 1753545:
                    str = "\u06e4\u06df\u06e8";
                    iM8418 = 0 - iM2842;
                    break;
                case 1754379:
                    str = "\u06df\u06e0\u06e4";
                    iM2842 = m1421(this);
                    break;
                case 1754569:
                    str = "\u06e4\u06e6\u06e5";
                    iM5411 = C0363.f634;
                    break;
                case 1755429:
                    zM1424 = m1424(this);
                    str = "\u06e6\u06e1\u06e5";
                    break;
                default:
                    str = "\u06e7\u06e5\u06e7";
                    iM8418 = C0429.m8418(strM1422);
                    break;
            }
        }
    }

    public String toString() {
        String str = "\u06e0\u06e2\u06df";
        StringBuilder sb = null;
        List list = null;
        List listM1426 = null;
        String strM1422 = null;
        short[] sArrM1423 = null;
        boolean zM1424 = false;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56296:
                    int iM1421 = m1421(this);
                    str = "\u06e3\u06e3\u06e1";
                    sArrM1423 = m1423();
                    i10 = iM1421;
                    break;
                case 56568:
                    C0197.m3772(sb, i10);
                    str = "\u06e2\u06e8\u06e5";
                    sArrM1423 = m1423();
                    break;
                case 56573:
                    str = "\u06e0\u06e4\u06e0";
                    i11 = C0446.f717 ^ (-61);
                    break;
                case 1747741:
                    strM1422 = m1422(this);
                    str = "\u06e3\u06e1\u06df";
                    listM1426 = m1426(this);
                    break;
                case 1747804:
                    String strM565 = C0029.m565(sArrM1423, 348, i11, 1904);
                    C0142.m2728(sb, strM565);
                    str = "\u06e3\u06e7\u06e4";
                    strM1422 = strM565;
                    break;
                case 1747903:
                    C0142.m2728(sb, strM1422);
                    str = "\u06e6\u06e0\u06e7";
                    sArrM1423 = m1423();
                    break;
                case 1749635:
                    str = "\u06e8\u06e7\u06df";
                    i11 = C0471.f742 ^ 118;
                    break;
                case 1749731:
                    C0030.m585(sb, zM1424);
                    str = "\u06e6\u06e5\u06e8";
                    sArrM1423 = m1423();
                    break;
                case 1749757:
                    String strM8745 = C0448.m8745(sArrM1423, 375, i11, 1169);
                    C0142.m2728(sb, strM8745);
                    str = "\u06e8\u06e0";
                    strM1422 = strM8745;
                    break;
                case 1749855:
                    C0142.m2728(sb, C0328.m6342(sArrM1423, 385, 1, 2425));
                    str = "\u06e0\u06e6\u06e0";
                    break;
                case 1750593:
                    List listM1425 = m1425(this);
                    zM1424 = m1424(this);
                    str = "\u06df\u06e7";
                    list = listM1425;
                    break;
                case 1750657:
                    str = "\u06e7\u06df\u06df";
                    i11 = C0449.f720 ^ 378;
                    break;
                case 1750784:
                    C0213.m4074(sb, list);
                    str = "\u06e2\u06e1\u06e2";
                    sArrM1423 = m1423();
                    break;
                case 1753453:
                    str = "\u06e8\u06e7\u06e7";
                    i11 = C0080.f114 ^ (-590);
                    break;
                case 1753609:
                    str = "\u06e2\u06e5\u06e0";
                    i11 = C0247.f327 ^ (-491);
                    break;
                case 1754375:
                    sb = new StringBuilder(C0206.m3946(sArrM1423, 312, i11, 3045));
                    str = "\u06e0\u06e7\u06e6";
                    break;
                case 1754561:
                    C0213.m4074(sb, listM1426);
                    str = "\u06e8\u06e5";
                    sArrM1423 = m1423();
                    break;
                case 1755584:
                    C0142.m2728(sb, C0429.m8416(sArrM1423, 365, i11, 1076));
                    str = "\u06e2\u06e4\u06e5";
                    break;
                case 1755592:
                    C0142.m2728(sb, C0390.m7649(sArrM1423, 330, i11, 1222));
                    str = "\u06e7\u06e5\u06df";
                    break;
                default:
                    return C0440.m8605(sb);
            }
        }
    }
}
