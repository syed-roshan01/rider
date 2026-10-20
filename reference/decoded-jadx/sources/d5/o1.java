package d5;

import a.C0000;
import a.C0001;
import a.C0002;
import a0.C0003;
import a2.C0004;
import a2.C0005;
import a6.C0007;
import a8.C0009;
import a8.C0010;
import aa.C0011;
import aa.C0012;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.C0013;
import android.support.v4.app.C0014;
import android.support.v4.app.C0015;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import androidx.annotation.C0018;
import androidx.annotation.C0019;
import androidx.appcompat.widget.C0020;
import androidx.compose.foundation.C0026;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.foundation.text.modifiers.C0025;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.draw.C0028;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.graphics.C0030;
import androidx.compose.ui.graphics.C0031;
import androidx.compose.ui.input.pointer.C0034;
import androidx.compose.ui.layout.C0036;
import androidx.compose.ui.node.C0037;
import androidx.compose.ui.platform.C0038;
import androidx.compose.ui.semantics.C0039;
import androidx.core.app.C0040;
import androidx.core.content.C0041;
import androidx.fragment.app.C0042;
import androidx.lifecycle.C0043;
import androidx.preference.C0044;
import androidx.profileinstaller.C0045;
import androidx.profileinstaller.C0046;
import androidx.startup.C0047;
import androidx.versionedparcelable.C0048;
import b.C0049;
import b1.C0050;
import b3.C0051;
import b4.C0052;
import b7.C0053;
import b7.C0054;
import b8.C0055;
import c0.C0056;
import c0.C0057;
import c1.C0058;
import c1.C0059;
import c1.C0061;
import c3.C0062;
import c3.C0063;
import c4.C0064;
import c4.C0065;
import c4.C0066;
import c6.C0067;
import c7.C0069;
import com.auto.accept.data.model.SupportedApp;
import com.auto.accept.data.model.UserProfile;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.C0074;
import com.auto.accept.ui.viewmodel.C0075;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0076;
import com.google.android.datatransport.cct.C0078;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.common.C0087;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.internal.stats.C0101;
import com.google.android.gms.internal.tasks.C0102;
import com.google.android.gms.internal.tasks.C0103;
import com.google.android.gms.measurement.internal.C0104;
import com.google.android.gms.measurement.internal.C0105;
import com.google.android.play.core.integrity.client.C0107;
import com.google.android.play.core.integrity.model.C0109;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.C0205;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.components.C0134;
import com.google.firebase.components.C0135;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.emulators.C0140;
import com.google.firebase.emulators.C0141;
import com.google.firebase.encoders.C0143;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.iid.C0169;
import com.google.firebase.iid.C0170;
import com.google.firebase.iid.C0171;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.inject.C0172;
import com.google.firebase.installations.C0177;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement.C0182;
import com.google.firebase.measurement.C0183;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.firebase.remoteconfig.ktx.C0199;
import com.google.firebase.remoteconfiginterop.C0202;
import com.google.firebase.tracing.C0204;
import com.google.gson.internal.bind.C0206;
import com.google.gson.internal.sql.C0208;
import d.C0210;
import d1.C0211;
import d1.C0214;
import d2.C0215;
import d3.C0216;
import d4.C0217;
import d7.C0219;
import d7.C0220;
import d8.C0221;
import d9.C0222;
import d9.C0223;
import d9.C0224;
import d9.C0225;
import d9.C0226;
import dagger.hilt.C0255;
import dagger.hilt.android.C0240;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.internal.migration.C0232;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.android.migration.C0238;
import dagger.hilt.components.C0243;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.aliasof.C0247;
import dagger.hilt.internal.componenttreedeps.C0248;
import dagger.hilt.internal.definecomponent.C0249;
import dagger.hilt.internal.generatesrootinput.C0250;
import dagger.hilt.migration.C0254;
import e0.C0256;
import e1.C0257;
import e1.C0258;
import e1.C0259;
import e2.C0261;
import e2.C0262;
import e2.C0263;
import e7.C0264;
import e8.C0265;
import e9.C0266;
import ea.C0267;
import ea.C0268;
import f.C0269;
import f.C0270;
import f0.C0271;
import f0.C0272;
import f1.C0273;
import f4.C0275;
import f4.C0276;
import f6.C0277;
import fa.C0279;
import fa.C0280;
import fa.C0281;
import g.C0282;
import g.C0284;
import g0.C0285;
import g2.C0286;
import g3.C0288;
import g4.C0289;
import g5.C0290;
import g7.C0292;
import g8.C0293;
import g9.C0294;
import ga.C0295;
import h.C0297;
import h0.C0299;
import h1.C0300;
import h3.C0301;
import h3.C0302;
import h4.C0304;
import h5.C0306;
import h5.C0307;
import h6.C0309;
import h7.C0311;
import h7.C0312;
import h8.C0314;
import i.C0315;
import i.C0316;
import i4.C0317;
import i5.C0318;
import i6.C0319;
import i6.C0320;
import i9.C0321;
import ia.C0322;
import j2.C0323;
import j3.C0325;
import j4.C0326;
import j5.C0327;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k.C0331;
import k0.a3;
import k1.C0332;
import k2.C0333;
import k3.C0334;
import k3.C0335;
import k7.C0337;
import k8.C0338;
import l0.C0339;
import l2.C0341;
import l3.C0342;
import l6.C0343;
import l6.C0344;
import l8.C0346;
import l9.C0347;
import la.C0348;
import m0.C0349;
import m0.l2;
import m0.l3;
import m0.m3;
import m0.o3;
import m1.C0350;
import m1.C0351;
import m3.C0352;
import m4.C0353;
import m5.C0354;
import m5.C0355;
import m7.C0356;
import m7.C0357;
import m7.C0358;
import m9.C0359;
import n7.C0363;
import n7.C0364;
import n8.C0365;
import n9.C0366;
import o1.C0367;
import o2.C0368;
import o4.C0369;
import o8.C0371;
import p0.C0373;
import p3.C0375;
import p4.C0376;
import p5.C0377;
import p7.C0378;
import p8.C0379;
import q0.C0381;
import q0.C0382;
import q1.C0383;
import q2.C0384;
import q5.C0385;
import q6.C0388;
import q7.C0390;
import r.C0392;
import r1.C0393;
import r2.C0394;
import r2.C0396;
import r2.C0397;
import r5.C0400;
import r6.C0401;
import r7.C0403;
import r9.C0405;
import s.C0408;
import s0.C0409;
import s2.C0411;
import s3.C0412;
import s6.C0413;
import s7.C0414;
import s8.C0416;
import t0.C0418;
import t1.C0419;
import t2.C0421;
import t2.C0422;
import t2.C0423;
import t3.C0424;
import t8.C0426;
import t9.C0427;
import u.C0428;
import u.C0429;
import u.p2;
import u0.C0430;
import u3.C0434;
import u4.C0435;
import u4.C0436;
import u7.C0437;
import v.C0439;
import v0.C0441;
import v0.C0443;
import v5.C0444;
import v5.C0445;
import v6.C0446;
import v6.C0447;
import v7.C0448;
import v7.C0449;
import v8.C0450;
import v9.C0451;
import v9.C0452;
import w.C0453;
import w0.C0454;
import w1.C0455;
import w2.C0456;
import w2.C0457;
import w4.C0459;
import w5.C0462;
import w5.C0463;
import w6.C0464;
import w9.C0465;
import x0.C0466;
import x4.C0468;
import x4.C0469;
import x5.C0470;
import x7.C0472;
import x8.C0473;
import y.C0475;
import y6.C0477;
import y9.C0478;
import y9.C0479;
import z.C0481;
import z0.C0482;
import z1.C0483;
import z2.C0484;
import z3.C0485;
import z3.C0487;
import z7.C0488;
import z7.C0489;
import z8.C0491;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public abstract class o1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f281short = {1062, 1081, 1077, 1063, 1053, 1087, 1076, 1077, 1084, 2661, 2672, 2663, 2644, 2661, 2661, 2630, 2672, 2657, 2657, 2684, 2683, 2674, 2662, 2956, 2955, 2966, 2961, 2948, 2953, 2953, 2944, 2945, 3002, 2948, 2965, 2965, 2966, 1459, 1460, 1449, 1454, 1467, 1462, 1462, 1471, 1470, 1413, 1467, 1450, 1450, 1449, 1413, 1470, 1471, 1449, 1465, 614, 618, 616, 555, 618, 617, 612, 614, 612, 615, 630, 555, 614, 624, 630, 625, 618, 616, 608, 631, 2378, 2374, 2372, 2311, 2374, 2373, 2376, 2378, 2376, 2379, 2394, 2311, 2374, 2373, 2376, 2381, 2395, 2368, 2399, 2380, 2395, 2166, 2151, 2151, 2105, 2168, 2171, 2166, 2105, 2163, 2149, 2174, 2145, 2162, 2149, 402, 433, 444, 1020, 1008, 1010, 945, 1002, 1021, 1018, 1005, 1020, 1022, 1021, 945, 1007, 1022, 1005, 1003, 1009, 1018, 1005, 644, 648, 650, 713, 658, 645, 642, 661, 644, 646, 645, 713, 643, 661, 654, 657, 642, 661, 596, 600, 602, 537, 578, 597, 594, 581, 596, 598, 597, 2070, 2081, 2086, 2097, 518, 522, 520, 587, 535, 516, 533, 524, 513, 522, 587, 535, 524, 513, 512, 535, 2806, 2810, 2808, 2747, 2791, 2804, 2789, 2812, 2801, 2810, 2747, 2789, 2804, 2790, 2790, 2800, 2811, 2802, 2800, 2791, 2371, 2416, 2401, 2424, 2421, 2430, 2217, 2213, 2215, 2276, 2238, 2210, 2223, 2234, 2213, 2232, 2238, 2223, 2232, 2276, 2222, 2232, 2211, 2236, 2223, 2232, 2219, 2234, 2234, 1222, 1273, 1252, 1250, 1267, 1252, 1401, 1406, 1342, 1402, 1381, 1379, 1376, 1393, 1385, 1342, 1406, 1393, 1405, 1405, 1393, 1385, 1393, 1380, 1378, 1401, 1376, 1393, 1378, 1380, 1406, 1397, 1378, 3319, 3312, 3248, 3316, 3307, 3309, 3310, 3327, 3303, 3248, 3312, 3327, 3315, 3315, 3327, 3303, 3327, 3306, 3308, 3319, 707, 748, 736, 736, 748, 685, 724, 748, 761, 767, 740, 1579, 1580, 1644, 1585, 1589, 1579, 1573, 1573, 1595, 1644, 1574, 1575, 1582, 1579, 1588, 1575, 1584, 1595, 1571, 1586, 1586, 1607, 1635, 1661, 1651, 1651, 1645, 434, 446, 444, 511, 427, 446, 444, 432, 421, 446, 511, 437, 436, 445, 440, 423, 436, 419, 424, 2493, 2440, 2442, 2438, 2451, 2440, 1697, 1718, 1723, 1698, 1714, 1154, 1167, 1164, 1163, 1154, 426, 437, 441, 427, 401, 435, 440, 441, 432, 1699, 1727, 1714, 1725, 1671, 1706, 1699, 1718, 273, 260, 275, 288, 273, 273, 306, 260, 277, 277, 264, 271, 262, 274, 2193, 2192, 2224, 2207, 2184, 2199, 2201, 2207, 2186, 2203, 2218, 2193, 2239, 2190, 2190, 2189, 2189, 2177, 2179, 2240, 2204, 2191, 2206, 2183, 2186, 2177, 2240, 2204, 2183, 2186, 2187, 2204, 3271, 3275, 3273, 3210, 3286, 3269, 3284, 3277, 3264, 3275, 3210, 3284, 3269, 3287, 3287, 3265, 3274, 3267, 3265, 3286, 1337, 1333, 1335, 1396, 1326, 1330, 1343, 1322, 1333, 1320, 1326, 1343, 1320, 1396, 1342, 1320, 1331, 1324, 1343, 1320, 1339, 1322, 1322, 2102, 2106, 2104, 2171, 2106, 2105, 2100, 2102, 2100, 2103, 2086, 2171, 2102, 2080, 2086, 2081, 2106, 2104, 2096, 2087, 1203, 1215, 1213, 1278, 1215, 1212, 1201, 1203, 1201, 1202, 1187, 1278, 1215, 1212, 1201, 1204, 1186, 1209, 1190, 1205, 1186, 1886, 1871, 1871, 1809, 1872, 1875, 1886, 1809, 1883, 1869, 1878, 1865, 1882, 1869, 2516, 2520, 2522, 2457, 2498, 2517, 2514, 2501, 2516, 2518, 2517, 2457, 2503, 2518, 2501, 2499, 2521, 2514, 2501, 494, 482, 480, 419, 504, 495, 488, 511, 494, 492, 495, 419, 489, 511, 484, 507, 488, 511, 1714, 1726, 1724, 1791, 1700, 1715, 1716, 1699, 1714, 1712, 1715, 1415, 1460, 1445, 1468, 1457, 1466, 850, 877, 880, 886, 871, 880, 2625, 2658, 2671, 880, 839, 832, 855, 3072, 3094, 3073, 3077, 3098, 3088, 3094, 3116, 3088, 3100, 3101, 3079, 3073, 3100, 3103, 1250, 1268, 1263, 1264, 1251, 1268, 1241, 1255, 1270, 1270, 1269, 1241, 1269, 1266, 1255, 1266, 1267, 1269, 986, 972, 983, 968, 983, 976, 985, 993, 978, 991, 976, 985, 971, 991, 985, 987, 993, 976, 977, 970, 983, 989, 987, 3155, 3156, 3143, 3152, 3178, 3155, 3164, 3161, 3137, 3152, 3143, 1673, 1668, 1677, 1690, 1692, 1719, 1671, 1670, 1719, 1673, 1675, 1675, 1677, 1688, 1692, 2921, 2908, 2891, 2900, 2896, 2890, 2890, 2896, 2902, 2903, 2890, 1134, 1100, 1100, 1098, 1116, 1116, 1094, 1101, 1094, 1091, 1094, 1115, 1110, 1039, 1148, 1098, 1117, 1113, 1094, 1100, 1098, 2900, 2943, 2928, 2931, 2941, 2932, 2933, 305, 262, 274, 278, 266, 273, 262, 263, 323, 279, 268, 323, 263, 262, 279, 262, 256, 279, 323, 273, 266, 263, 262, 272, 1570, 1563, 1544, 1567, 1537, 1548, 1556, 1613, 1597, 1544, 1567, 1536, 1540, 1566, 1566, 1540, 1538, 1539, 1475, 1526, 1509, 1514, 1520, 1505, 1504, 2280, 2271, 2251, 2255, 2259, 2248, 2271, 2270, 2202, 2268, 2261, 2248, 2202, 2268, 2262, 2261, 2267, 2254, 2259, 2260, 2269, 2202, 2253, 2259, 2270, 2269, 2271, 2254, 3011, 3064, 3065, 3050, 3045, 3067, 3045, 2992, 3011, 3064, 3061, 3068, 3068, 1945, 1982, 1957, 1957, 1954, 1957, 1964, 1803, 1854, 1839, 1919, 1835, 1840, 1919, 1854, 1834, 1835, 1847, 1840, 1837, 1846, 1829, 1850, 1919, 1804, 1847, 1846, 1829, 1834, 1844, 1834, 3129, 3094, 3091, 3091, 3098, 3099, 3153, 3115, 3098, 3085, 3090, 3094, 3089, 3102, 3091, 460, 495, 506, 506, 491, 508, 503, 430, 449, 510, 506, 487, 483, 487, 500, 495, 506, 487, 481, 480, 1678, 1717, 1705, 1726, 1704, 1711, 1705, 1714, 1720, 1711, 1726, 1727, 2830, 2875, 2858, 2938, 2862, 2869, 2938, 2879, 2850, 2879, 2871, 2858, 2862, 2256, 2303, 2298, 2298, 2291, 2290, 2232, 2260, 2295, 2274, 2274, 2291, 2276, 2287, 2261, 2302, 2295, 2276, 2289, 2303, 2296, 2289, 2256, 2275, 2298, 2298, 2112, 2143, 2131, 2113, 2171, 2137, 2130, 2131, 2138, 581, 584, 594, 597, 576, 591, 578, 580, 638, 583, 584, 589, 597, 580, 595, 2218, 2217, 2213, 2215, 2226, 2223, 2217, 2216, 2201, 2208, 2223, 2218, 2226, 2211, 2228, 1666, 1693, 1681, 1667, 1721, 1691, 1680, 1681, 1688, 1025, 1050, 1041, 1044, 1036, 1066, 1030, 1025, 1044, 1025, 1030, 1845, 1847, 1847, 1841, 1828, 1824, 1841, 1840, 1479, 1500, 1489, 1488, 1514, 1501, 1500, 1478, 1473, 1498, 1479, 1484, 2935, 2920, 2916, 2934, 2892, 2926, 2917, 2916, 
    2925, 921, 924, 910, 917, 927, 914, 924, 911, 921, 1736, 1735, 1730, 1754, 1739, 1756, 1757, 1694, 1679, 1679, 1676, 1043, 1042, 1032, 1039, 1044, 1033, 1026, 857, 847, 862, 862, 835, 836, 845, 857, 3056, 3053, 3056, 3048, 3041, 989, 988, 970, 986, 971, 976, 969, 973, 976, 982, 983, 2744, 2738, 2750, 2751, 2197, 2196, 2233, 2198, 2195, 2201, 2193, 1626, 1623, 1620, 1619, 1626, 601, 590, 579, 602, 586, 1071, 1072, 1084, 1070, 1044, 1078, 1085, 1084, 1077, 572, 573, 529, 562, 560, 568, 1840, 1841, 1804, 1846, 1848, 1841, 1808, 1834, 1835, 2427, 2394, 2325, 2420, 2390, 2369, 2396, 2371, 2396, 2369, 2380, 2407, 2384, 2374, 2368, 2393, 2369, 2407, 2384, 2386, 2396, 2374, 2369, 2375, 2380, 2426, 2370, 2395, 2384, 2375, 2325, 2370, 2388, 2374, 2325, 2373, 2375, 2394, 2371, 2396, 2385, 2384, 2385, 2325, 2371, 2396, 2388, 2325, 2425, 2394, 2390, 2388, 2393, 2420, 2390, 2369, 2396, 2371, 2396, 2369, 2380, 2407, 2384, 2374, 2368, 2393, 2369, 2407, 2384, 2386, 2396, 2374, 2369, 2375, 2380, 2426, 2370, 2395, 2384, 2375, 1366, 1355, 1366, 1358, 1351, 3062, 3049, 3045, 3063, 3021, 3055, 3044, 3045, 3052, 1528, 1510, 1505, 1515, 1504, 1528, 1488, 1518, 1505, 1510, 1506, 1518, 1531, 1510, 1504, 1505, 1488, 1532, 1516, 1518, 1507, 1514, 1447, 1445, 1455, 1508, 1465, 1442, 1443, 1456, 1471, 1441, 1471, 1508, 1466, 1464, 1443, 1468, 1443, 1446, 1455, 1453, 1455, 1454, 1508, 1451, 1466, 1443, 1046, 1050, 1051, 1025, 1040, 1037, 1025, 2444, 2455, 2454, 2437, 2442, 2452, 2442, 2464, 2458, 2449, 2456, 2454, 2449, 2458, 2464, 2444, 2443, 2462, 2443, 2442, 2444, 1905, 1895, 1902, 1895, 1889, 1910, 1885, 1902, 1891, 1900, 1893, 1911, 1891, 1893, 1895, 269, 271, 271, 265, 284, 280, 307, 280, 261, 257, 265, 286, 307, 280, 261, 280, 256, 265, 2064, 2079, 2053, 2072, 2094, 2069, 2068, 2053, 2068, 2066, 2053, 2072, 2078, 2079, 2094, 2053, 2072, 2053, 2077, 2068, 1303, 1299, 1295, 1285, 1293, 1337, 1301, 1283, 1298, 1299, 1302, 2165, 2162, 2147, 2166, 2120, 2163, 2155, 2148, 2147, 2164, 1552, 1549, 1552, 1544, 1537, 958, 948, 952, 953, 2931, 2930, 2911, 2928, 2933, 2943, 2935, 1792, 1802, 1798, 1799, 716, 705, 706, 709, 716, 1931, 1948, 1937, 1928, 1944};

    /* JADX WARN: Code duplicated, block: B:217:0x04b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x04b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x043e A[EDGE_INSN: B:93:0x04bd->B:220:0x043e BREAK  A[LOOP:16: B:92:0x04b9->B:286:0x04b9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x043e A[EDGE_INSN: B:108:0x04f8->B:221:0x043e BREAK  A[LOOP:19: B:107:0x04f4->B:300:0x04f4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x044d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x0451 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0457 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0453 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x044d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x0445 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0473 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x0479 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x047d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x0633 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x0479 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x0475 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x046b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0490 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x0494 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x049a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x04c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x0496 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0490 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x04ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x04b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x04c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x04b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x04ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x04c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x04b9 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x04d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x04dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x04e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x04de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x04d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x04d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x04fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x04f4 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x0449. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:79:0x048c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:86:0x04a8. Please report as an issue. */
    public static final void a(MainViewModel mainViewModel, Map map, m0.m mVar, int i10) {
        ArrayList arrayList;
        Iterator itM8318;
        boolean zM3327;
        int i11;
        Object objM8115;
        SupportedApp supportedApp;
        List list;
        int i12;
        List listM819;
        List list2;
        boolean z10;
        int i13;
        Iterator itM8319;
        boolean zM3328;
        int i14;
        int i15;
        int i16;
        boolean zM9582;
        int i17;
        C0375.m7360(mainViewModel, C0065.m1259(m4193(), 0, C0475.f746 ^ (-20), 1104));
        C0375.m7360(map, C0012.m232(m4193(), 9, C0482.f756 ^ 929, 2581));
        m0.q qVar = (m0.q) mVar;
        C0393.m7698(qVar, (-1375399725) ^ C0481.f755);
        Context context = (Context) C0475.m9256(qVar, C0390.m7636());
        PackageManager packageManagerM8279 = C0421.m8279(context);
        m0.g1 g1VarM8775 = C0450.m8775(C0271.m5232(mainViewModel), qVar);
        y0.l lVarM4370 = C0226.m4370();
        y0.o oVarM8892 = C0456.m8892(C0143.m2748(), C0146.m2779(qVar));
        float f10 = C0044.f64 ^ 46;
        y0.o oVarM4788 = C0250.m4788(oVarM8892, f10);
        C0261.m4990(qVar, 483455901 ^ C0048.f68);
        r1.j0 j0VarM4231 = C0218.m4231(C0204.m3900(), C0173.m3300(), qVar);
        C0261.m4990(qVar, 1323940310 ^ C0363.f634);
        int iM276 = C0014.m276(qVar);
        m0.r1 r1VarM275 = C0014.m275(qVar);
        C0014.m280(C0379.m7428());
        t1.j jVarM4451 = C0231.m4451();
        u0.b bVarM6976 = C0355.m6976(oVarM4788);
        boolean z11 = C0196.m3764(qVar) instanceof m0.d;
        int i18 = 1616;
        while (true) {
            i18 ^= 1633;
            switch (i18) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (z11) {
                        i18 = 1709;
                    }
                    break;
                case 204:
                    C0100.m1961(qVar);
                    boolean zM7502 = C0382.m7502(qVar);
                    int i19 = 1740;
                    while (true) {
                        i19 ^= 1757;
                        switch (i19) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i19 = zM7502 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                C0445.m8685(qVar);
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0017.m346(qVar, jVarM4451);
                                int i20 = 1864;
                                while (true) {
                                    i20 ^= 1881;
                                    switch (i20) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i20 = 48674;
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
                    C0089.m1904(qVar, j0VarM4231, C0063.m1208());
                    C0089.m1904(qVar, r1VarM275, C0464.m9055());
                    t1.i iVarM5562 = C0289.m5562();
                    boolean zM7503 = C0382.m7502(qVar);
                    int i21 = 48767;
                    while (true) {
                        i21 ^= 48784;
                        switch (i21) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                break;
                            case 76:
                                boolean zM4399 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM276));
                                int i22 = 48891;
                                while (true) {
                                    i22 ^= 48908;
                                    switch (i22) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 503:
                                            i22 = !zM4399 ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                i21 = !zM7503 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    C0352.m6912(0, bVarM6976, new l2(qVar), qVar, (-2058660297) ^ C0192.f216);
                    C0318.m6169();
                    C0488.m9503(0, qVar, C0316.m6122(C0141.m2710(m4193(), 23, C0138.f164 ^ (-572), 3045), (String) C0418.m8214(g1VarM8775)));
                    String strM6122 = C0316.m6122(C0312.m6034(m4193(), 37, C0075.f109 ^ 274, 1498), (String) C0418.m8214(g1VarM8775));
                    long jM41 = C0001.m41();
                    int i23 = C0224.f304 ^ 862;
                    C0185.m3537(strM6122, C0187.m3568(lVarM4370, 0.0f, 0.0f, 0.0f, i23, 7), jM41, C0135.m2601(i23), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, 3120, 0, 130669 ^ C0477.f751);
                    String strM2192 = C0113.m2192(m4193(), 56, C0359.f630 ^ 301, 517);
                    String strM7163 = C0365.m7163(m4193(), 76, C0297.f445 ^ (-509), 2345);
                    String strM4381 = C0227.m4381(m4193(), 97, C0011.f31 ^ 362, 2071);
                    String[] strArr = new String[3];
                    strArr[C0373.f644 ^ (-859)] = strM7163;
                    strArr[C0020.f40 ^ (-668)] = strM4381;
                    strArr[C0119.f145 ^ 899] = strM2192;
                    q8.f fVar = new q8.f(C0334.m6494(m4193(), 111, C0147.f172 ^ 940, 477), C0405.m7965(strArr));
                    String strM9485 = C0487.m9485(m4193(), 114, C0331.f479 ^ 276, 927);
                    String strM7218 = C0368.m7218(m4193(), 133, C0087.f121 ^ 590, 743);
                    String strM8363 = C0426.m8363(m4193(), 151, C0294.f442 ^ (-664), 567);
                    String[] strArr2 = new String[3];
                    strArr2[C0423.f694 ^ 806] = strM7218;
                    strArr2[C0237.f317 ^ (-616)] = strM8363;
                    strArr2[C0468.f739 ^ 299] = strM9485;
                    q8.f fVar2 = new q8.f(C0027.m527(m4193(), 162, C0109.f135 ^ 71, 2115), C0405.m7965(strArr2));
                    String strM2756 = C0143.m2756(m4193(), 166, C0470.f741 ^ 165, 613);
                    String strM5683 = C0295.m5683(m4193(), 182, C0050.f70 ^ 928, 2709);
                    String[] strArr3 = new String[2];
                    strArr3[C0189.f213 ^ (-736)] = strM2756;
                    strArr3[C0322.f470 ^ 126] = strM5683;
                    q8.f fVar3 = new q8.f(C0429.m8416(m4193(), 202, C0462.f733 ^ 307, 2321), C0405.m7965(strArr3));
                    q8.f fVar4 = new q8.f(C0165.m3159(m4193(), 231, C0121.f147 ^ 592, 1174), C0320.m6195(C0017.m345(m4193(), 208, C0159.f183 ^ 5, 2250)));
                    String strM3816 = C0199.m3816(m4193(), 237, C0477.f751 ^ 390, 1296);
                    String strM1180 = C0062.m1180(m4193(), 264, C0483.f757 ^ (-793), 3230);
                    String[] strArr4 = new String[2];
                    strArr4[C0468.f739 ^ 297] = strM3816;
                    strArr4[C0016.f36 ^ (-875)] = strM1180;
                    q8.f fVar5 = new q8.f(C0262.m5010(m4193(), 284, C0265.f345 ^ 917, 653), C0405.m7965(strArr4));
                    q8.f fVar6 = new q8.f(C0188.m3587(m4193(), 316, C0354.f625 ^ 303, 1556), C0320.m6195(C0254.m4870(m4193(), 295, C0319.f467 ^ 217, 1602)));
                    q8.f fVar7 = new q8.f(C0135.m2596(m4193(), 341, C0286.f431 ^ 354, 2535), C0320.m6195(C0196.m3766(m4193(), 322, C0445.f716 ^ 558, 465)));
                    q8.f[] fVarArr = new q8.f[7];
                    fVarArr[C0321.f469 ^ (-617)] = fVar;
                    fVarArr[C0072.f104 ^ 112] = fVar2;
                    fVarArr[C0293.f441 ^ (-945)] = fVar3;
                    fVarArr[C0010.f30 ^ 882] = fVar4;
                    fVarArr[C0011.f31 ^ 352] = fVar5;
                    fVarArr[C0031.f51 ^ (-157)] = fVar6;
                    fVarArr[C0191.f215 ^ (-456)] = fVar7;
                    Map mapM4194 = m4194(fVarArr);
                    C0261.m4990(qVar, (-1442116087) ^ C0010.f30);
                    boolean zM2013 = C0103.m2013(qVar, map);
                    Object objM8078 = C0411.m8078(qVar);
                    int i24 = 49666;
                    while (true) {
                        i24 ^= 49683;
                        switch (i24) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i24 = !zM2013 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                k0.y0 y0VarM2417 = C0125.m2417();
                                int i25 = 49790;
                                while (true) {
                                    i25 ^= 49807;
                                    switch (i25) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 51:
                                            int i26 = 50689;
                                            while (true) {
                                                i26 ^= 50706;
                                                switch (i26) {
                                                    case 19:
                                                        i26 = 50720;
                                                        continue;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 84:
                                            int i27 = 49914;
                                            while (true) {
                                                i27 ^= 49931;
                                                switch (i27) {
                                                    case 497:
                                                        i27 = 50596;
                                                        break;
                                                    case 1711:
                                                        List listM2084 = C0107.m2084(C0405.m7950());
                                                        arrayList = new ArrayList();
                                                        itM8318 = C0424.m8318(listM2084);
                                                        while (true) {
                                                            zM3327 = C0174.m3327(itM8318);
                                                            i11 = 50813;
                                                            while (true) {
                                                                i11 ^= 50830;
                                                                switch (i11) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 53:
                                                                        break;
                                                                    case 243:
                                                                        i11 = zM3327 ? 51557 : 50875;
                                                                        break;
                                                                    case 4075:
                                                                        objM8115 = C0413.m8115(itM8318);
                                                                        supportedApp = (SupportedApp) objM8115;
                                                                        list = (List) C0487.m9501(mapM4194, C0463.m9017(supportedApp));
                                                                        i12 = 51588;
                                                                        while (true) {
                                                                            i12 ^= 51605;
                                                                            switch (i12) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i12 = list == null ? 51681 : 51650;
                                                                                    break;
                                                                                case 54:
                                                                                    break;
                                                                                case 87:
                                                                                    listM819 = list;
                                                                                    break;
                                                                                case 116:
                                                                                    listM819 = C0042.m819(supportedApp);
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        list2 = listM819;
                                                                        z10 = list2 instanceof Collection;
                                                                        i13 = 51712;
                                                                        while (true) {
                                                                            i13 ^= 51729;
                                                                            switch (i13) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i13 = z10 ? 51805 : 51774;
                                                                                    break;
                                                                                case 47:
                                                                                    itM8319 = C0424.m8318(list2);
                                                                                    while (true) {
                                                                                        zM3328 = C0174.m3327(itM8319);
                                                                                        i14 = 52735;
                                                                                        while (true) {
                                                                                            i14 ^= 52752;
                                                                                            switch (i14) {
                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                    break;
                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                    i16 = 52611;
                                                                                                    while (true) {
                                                                                                        i16 ^= 52628;
                                                                                                        switch (i16) {
                                                                                                            case 23:
                                                                                                                i16 = 52642;
                                                                                                                break;
                                                                                                            case 54:
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 1007:
                                                                                                    i14 = zM3328 ? 53479 : 52797;
                                                                                                    break;
                                                                                                case 7927:
                                                                                                    try {
                                                                                                        C0290.m5588(packageManagerM8279, (String) C0413.m8115(itM8319), 0);
                                                                                                        C0357.m6998(arrayList, objM8115);
                                                                                                        i15 = 53510;
                                                                                                        while (true) {
                                                                                                            i15 ^= 53527;
                                                                                                            switch (i15) {
                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                    i15 = 53541;
                                                                                                                    break;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Exception e4) {
                                                                                                        int i28 = 54657;
                                                                                                        while (true) {
                                                                                                            i28 ^= 54674;
                                                                                                            switch (i28) {
                                                                                                                case 19:
                                                                                                                    i28 = 54688;
                                                                                                                    break;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 76:
                                                                                    zM9582 = C0492.m9582(list2);
                                                                                    i17 = 51836;
                                                                                    while (true) {
                                                                                        i17 ^= 51853;
                                                                                        switch (i17) {
                                                                                            case 241:
                                                                                                i17 = zM9582 ? 52580 : 52549;
                                                                                                break;
                                                                                            case 1963:
                                                                                                break;
                                                                                            case 1992:
                                                                                                itM8319 = C0424.m8318(list2);
                                                                                                while (true) {
                                                                                                    zM3328 = C0174.m3327(itM8319);
                                                                                                    i14 = 52735;
                                                                                                    while (true) {
                                                                                                        i14 ^= 52752;
                                                                                                        switch (i14) {
                                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                                break;
                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                                i16 = 52611;
                                                                                                                while (true) {
                                                                                                                    i16 ^= 52628;
                                                                                                                    switch (i16) {
                                                                                                                        case 23:
                                                                                                                            i16 = 52642;
                                                                                                                            break;
                                                                                                                        case 54:
                                                                                                                            continue;
                                                                                                                            continue;
                                                                                                                            continue;
                                                                                                                            continue;
                                                                                                                            continue;
                                                                                                                            continue;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                            case 1007:
                                                                                                                if (zM3328) {
                                                                                                                }
                                                                                                                break;
                                                                                                            case 7927:
                                                                                                                C0290.m5588(packageManagerM8279, (String) C0413.m8115(itM8319), 0);
                                                                                                                C0357.m6998(arrayList, objM8115);
                                                                                                                i15 = 53510;
                                                                                                                while (true) {
                                                                                                                    i15 ^= 53527;
                                                                                                                    switch (i15) {
                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                            i15 = 53541;
                                                                                                                            break;
                                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                            continue;
                                                                                                                            continue;
                                                                                                                            continue;
                                                                                                                            continue;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 2025:
                                                                                                i16 = 52611;
                                                                                                while (true) {
                                                                                                    i16 ^= 52628;
                                                                                                    switch (i16) {
                                                                                                        case 23:
                                                                                                            i16 = 52642;
                                                                                                            break;
                                                                                                        case 54:
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
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
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                C0478.m9328(qVar, arrayList);
                                                                objM8078 = arrayList;
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case 241:
                                            i25 = objM8078 == y0VarM2417 ? 49883 : 49852;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 83:
                                List listM2085 = C0107.m2084(C0405.m7950());
                                arrayList = new ArrayList();
                                itM8318 = C0424.m8318(listM2085);
                                while (true) {
                                    zM3327 = C0174.m3327(itM8318);
                                    i11 = 50813;
                                    while (true) {
                                        i11 ^= 50830;
                                        switch (i11) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 53:
                                                break;
                                            case 243:
                                                if (zM3327) {
                                                }
                                                break;
                                            case 4075:
                                                objM8115 = C0413.m8115(itM8318);
                                                supportedApp = (SupportedApp) objM8115;
                                                list = (List) C0487.m9501(mapM4194, C0463.m9017(supportedApp));
                                                i12 = 51588;
                                                while (true) {
                                                    i12 ^= 51605;
                                                    switch (i12) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (list == null) {
                                                            }
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 87:
                                                            listM819 = list;
                                                            break;
                                                        case 116:
                                                            listM819 = C0042.m819(supportedApp);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                list2 = listM819;
                                                z10 = list2 instanceof Collection;
                                                i13 = 51712;
                                                while (true) {
                                                    i13 ^= 51729;
                                                    switch (i13) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (z10) {
                                                            }
                                                            break;
                                                        case 47:
                                                            itM8319 = C0424.m8318(list2);
                                                            while (true) {
                                                                zM3328 = C0174.m3327(itM8319);
                                                                i14 = 52735;
                                                                while (true) {
                                                                    i14 ^= 52752;
                                                                    switch (i14) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            i16 = 52611;
                                                                            while (true) {
                                                                                i16 ^= 52628;
                                                                                switch (i16) {
                                                                                    case 23:
                                                                                        i16 = 52642;
                                                                                        break;
                                                                                    case 54:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 1007:
                                                                            if (zM3328) {
                                                                            }
                                                                            break;
                                                                        case 7927:
                                                                            C0290.m5588(packageManagerM8279, (String) C0413.m8115(itM8319), 0);
                                                                            C0357.m6998(arrayList, objM8115);
                                                                            i15 = 53510;
                                                                            while (true) {
                                                                                i15 ^= 53527;
                                                                                switch (i15) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i15 = 53541;
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        case 76:
                                                            zM9582 = C0492.m9582(list2);
                                                            i17 = 51836;
                                                            while (true) {
                                                                i17 ^= 51853;
                                                                switch (i17) {
                                                                    case 241:
                                                                        if (zM9582) {
                                                                        }
                                                                        break;
                                                                    case 1963:
                                                                        break;
                                                                    case 1992:
                                                                        itM8319 = C0424.m8318(list2);
                                                                        while (true) {
                                                                            zM3328 = C0174.m3327(itM8319);
                                                                            i14 = 52735;
                                                                            while (true) {
                                                                                i14 ^= 52752;
                                                                                switch (i14) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                        i16 = 52611;
                                                                                        while (true) {
                                                                                            i16 ^= 52628;
                                                                                            switch (i16) {
                                                                                                case 23:
                                                                                                    i16 = 52642;
                                                                                                    break;
                                                                                                case 54:
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 1007:
                                                                                        if (zM3328) {
                                                                                        }
                                                                                        break;
                                                                                    case 7927:
                                                                                        C0290.m5588(packageManagerM8279, (String) C0413.m8115(itM8319), 0);
                                                                                        C0357.m6998(arrayList, objM8115);
                                                                                        i15 = 53510;
                                                                                        while (true) {
                                                                                            i15 ^= 53527;
                                                                                            switch (i15) {
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i15 = 53541;
                                                                                                    break;
                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2025:
                                                                        i16 = 52611;
                                                                        while (true) {
                                                                            i16 ^= 52628;
                                                                            switch (i16) {
                                                                                case 23:
                                                                                    i16 = 52642;
                                                                                    break;
                                                                                case 54:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
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
                                                    break;
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                        C0478.m9328(qVar, arrayList);
                                        objM8078 = arrayList;
                                        break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                        List list3 = (List) objM8078;
                        C0171.m3270(qVar, false);
                        boolean zM7153 = C0364.m7153(list3);
                        int i29 = 53634;
                        while (true) {
                            i29 ^= 53651;
                            switch (i29) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i29 = zM7153 ? 53727 : 53696;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 76:
                                    C0261.m4990(qVar, (-1442116232) ^ C0263.f343);
                                    C0271.m5230(C0123.m2371(), C0419.m8237(f10), C0067.m1299(C0104.m2039(), qVar, 0), null, null, C0059.m1122(qVar, 30097762 ^ C0441.f712, new t(g1VarM8775, 1)), qVar, (-196954) ^ C0257.f337, C0469.f740 ^ 211);
                                    C0171.m3270(qVar, false);
                                    int i30 = 53758;
                                    while (true) {
                                        i30 ^= 53775;
                                        switch (i30) {
                                            case 1009:
                                                i30 = 54440;
                                                continue;
                                            case 1703:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                case 83:
                                    C0261.m4990(qVar, 1442115388 ^ C0064.f84);
                                    C0271.m5230(C0123.m2371(), C0419.m8237(f10), C0067.m1299(C0104.m2039(), qVar, 0), null, null, C0059.m1122(qVar, (-2129585832) ^ C0113.f139, new a0(list3, map, g1VarM8775, mapM4194, context, packageManagerM8279, mainViewModel)), qVar, 196614, 24);
                                    C0171.m3270(qVar, false);
                                    break;
                                default:
                                    break;
                            }
                        }
                        C0072.m1564(C0270.m5166(lVarM4370, C0000.f768 ^ (-87)), qVar);
                        C0171.m3270(qVar, false);
                        C0171.m3270(qVar, true);
                        C0171.m3270(qVar, false);
                        C0171.m3270(qVar, false);
                        m0.x1 x1VarM7533 = C0384.m7533(qVar);
                        int i31 = 54533;
                        while (true) {
                            i31 ^= 54550;
                            switch (i31) {
                                case 19:
                                    if (x1VarM7533 != null) {
                                        i31 = 54626;
                                    }
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 85:
                                    return;
                                case 116:
                                    x1VarM7533.f11756d = new u.x(mainViewModel, map, i10, C0262.f342 ^ 183);
                                    return;
                                default:
                                    continue;
                            }
                            i31 = 54595;
                        }
                    }
                    break;
                case 239:
                    C0235.m4537();
                    throw null;
                default:
                    continue;
            }
            i18 = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:251:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0367 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x021a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x026f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x034d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0353 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0357 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0366 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0353 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x034f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x0345 A[SYNTHETIC] */
    public static final void b(String str, String str2, long j10, m0.m mVar, int i10) {
        int i11;
        int i12;
        m0.x1 x1VarM7533;
        int i13;
        r1.j0 j0VarM4231;
        int iM276;
        m0.r1 r1VarM275;
        t1.j jVarM4451;
        u0.b bVarM6976;
        boolean z10;
        int i14;
        boolean zM7502;
        int i15;
        t1.i iVarM5562;
        boolean zM7503;
        int i16;
        boolean zM4399;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        C0375.m7360(str, C0127.m2451(m4193(), 347, C0159.f183 ^ 23, 1751));
        C0375.m7360(str2, C0223.m4303(m4193(), 352, C0489.f763 ^ (-536), 1262));
        m0.q qVar = (m0.q) mVar;
        C0393.m7698(qVar, 2101240456 ^ C0306.f454);
        int i22 = C0437.f708;
        int i23 = 1616;
        while (true) {
            i23 ^= 1633;
            switch (i23) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i23 = ((i22 ^ (-857)) & i10) == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM2013 = C0103.m2013(qVar, str);
                    int i24 = 1740;
                    while (true) {
                        i24 ^= 1757;
                        switch (i24) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i24 = zM2013 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                i21 = 2;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                i21 = 4;
                                int i25 = 1864;
                                while (true) {
                                    i25 ^= 1881;
                                    switch (i25) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i25 = 48674;
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
                    i11 = (i21 & i10) | (i21 ^ i10);
                    int i26 = 48767;
                    while (true) {
                        i26 ^= 48784;
                        switch (i26) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i26 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    i11 = i10;
                    break;
                default:
                    break;
            }
        }
        int i27 = C0273.f389;
        int i28 = 48891;
        while (true) {
            i28 ^= 48908;
            switch (i28) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    i28 = ((i27 ^ 468) & i10) == 0 ? 49635 : 48953;
                    break;
                case 32495:
                    boolean zM2014 = C0103.m2013(qVar, str2);
                    int i29 = 49666;
                    while (true) {
                        i29 ^= 49683;
                        switch (i29) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i29 = zM2014 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                i20 = 32;
                                int i30 = 49790;
                                while (true) {
                                    i30 ^= 49807;
                                    switch (i30) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i30 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                i20 = 16;
                                break;
                            default:
                                break;
                        }
                    }
                    i11 = (i11 & i20) | (i11 ^ i20);
                    break;
                default:
                    break;
            }
        }
        int i31 = C0191.f215;
        int i32 = 49914;
        while (true) {
            i32 ^= 49931;
            switch (i32) {
                case 497:
                    i32 = ((i31 ^ (-578)) & i10) == 0 ? 50658 : 50627;
                    break;
                case 1711:
                    break;
                case 1736:
                    i12 = i11;
                    break;
                case 1769:
                    boolean zM4041 = C0211.m4041(qVar, j10);
                    int i33 = 50689;
                    while (true) {
                        i33 ^= 50706;
                        switch (i33) {
                            case 19:
                                i33 = zM4041 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                i19 = 128;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                i19 = 256;
                                int i34 = 50813;
                                while (true) {
                                    i34 ^= 50830;
                                    switch (i34) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 243:
                                            i34 = 50844;
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
                    i12 = (i11 & i19) | (i11 ^ i19);
                    break;
                default:
                    break;
            }
        }
        int i35 = C0081.f115;
        int i36 = 51588;
        while (true) {
            i36 ^= 51605;
            switch (i36) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i36 = ((i35 ^ 611) & i12) == 146 ? 51681 : 51650;
                    break;
                case 54:
                    break;
                case 87:
                    y0.e eVarM1926 = C0090.m1926();
                    y0.l lVarM4370 = C0226.m4370();
                    long jM4129 = C0216.m4129(j10, 0.1f);
                    float f10 = C0079.f113 ^ (-548);
                    y0.o oVarM5770 = C0300.m5770(C0002.m48(lVarM4370, jM4129, C0419.m8237(f10)), C0208.f232 ^ 364, f10);
                    C0261.m4990(qVar, (-483455567) ^ C0332.f516);
                    j0VarM4231 = C0218.m4231(C0204.m3900(), eVarM1926, qVar);
                    C0261.m4990(qVar, (-1323940364) ^ C0217.f241);
                    iM276 = C0014.m276(qVar);
                    r1VarM275 = C0014.m275(qVar);
                    C0014.m280(C0379.m7428());
                    jVarM4451 = C0231.m4451();
                    bVarM6976 = C0355.m6976(oVarM5770);
                    z10 = C0196.m3764(qVar) instanceof m0.d;
                    i14 = 52735;
                    while (true) {
                        i14 ^= 52752;
                        switch (i14) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                C0235.m4537();
                                throw null;
                            case 1007:
                                i14 = z10 ? 53479 : 52797;
                                break;
                            case 7927:
                                C0100.m1961(qVar);
                                zM7502 = C0382.m7502(qVar);
                                i15 = 53510;
                                while (true) {
                                    i15 ^= 53527;
                                    switch (i15) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i15 = zM7502 ? 53603 : 53572;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 83:
                                            C0445.m8685(qVar);
                                            break;
                                        case 116:
                                            C0017.m346(qVar, jVarM4451);
                                            i18 = 53634;
                                            while (true) {
                                                i18 ^= 53651;
                                                switch (i18) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i18 = 53665;
                                                        continue;
                                                        continue;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                }
                                C0089.m1904(qVar, j0VarM4231, C0063.m1208());
                                C0089.m1904(qVar, r1VarM275, C0464.m9055());
                                iVarM5562 = C0289.m5562();
                                zM7503 = C0382.m7502(qVar);
                                i16 = 53758;
                                while (true) {
                                    i16 ^= 53775;
                                    switch (i16) {
                                        case 1009:
                                            i16 = !zM7503 ? 54502 : 54471;
                                            break;
                                        case 1703:
                                            break;
                                        case 1736:
                                            C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                            break;
                                        case 1769:
                                            zM4399 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM276));
                                            i17 = 54533;
                                            while (true) {
                                                i17 ^= 54550;
                                                switch (i17) {
                                                    case 19:
                                                        i17 = !zM4399 ? 54626 : 54595;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 85:
                                                        break;
                                                    case 116:
                                                        C0133.m2574(iM276, qVar, iM276, iVarM5562);
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
                                C0352.m6912(0, bVarM6976, new l2(qVar), qVar, (-2058660322) ^ C0083.f117);
                                f2.l lVarM9305 = C0477.m9305();
                                long jM2601 = C0135.m2601(C0121.f147 ^ 578);
                                int i37 = (C0083.f117 ^ (-775)) & i12;
                                int i38 = (i37 & 199680) | (199680 ^ i37);
                                int i39 = i12 & (C0289.f434 ^ (-849));
                                C0185.m3537(str, null, j10, jM2601, null, lVarM9305, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, (i38 ^ i39) | (i38 & i39), 0, (-130922) ^ C0365.f636);
                                long jM41210 = C0216.m4129(j10, 0.7f);
                                long jM2602 = C0135.m2601(C0159.f183 ^ 24);
                                f2.l lVarM3904 = C0204.m3904();
                                int i40 = (i12 >> (C0233.f313 ^ 317)) & (C0103.f129 ^ (-388));
                                C0185.m3537(str2, null, jM41210, jM2602, null, lVarM3904, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, (199680 ^ i40) | (i40 & 199680), 0, C0054.f74 ^ 130716);
                                C0016.m325(qVar, false, true, false, false);
                                break;
                            default:
                                break;
                        }
                    }
                    x1VarM7533 = C0384.m7533(qVar);
                    i13 = 54657;
                    while (true) {
                        i13 ^= 54674;
                        switch (i13) {
                            case 19:
                                if (x1VarM7533 != null) {
                                    i13 = 55401;
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                return;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 3579:
                                x1VarM7533.f11756d = new f0.c(str, str2, j10, i10);
                                return;
                            default:
                                continue;
                                continue;
                                continue;
                        }
                        i13 = 54719;
                    }
                    break;
                case 116:
                    boolean zM1625 = C0074.m1625(qVar);
                    int i41 = 51712;
                    while (true) {
                        i41 ^= 51729;
                        switch (i41) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i41 = !zM1625 ? 51805 : 51774;
                                break;
                            case 47:
                                C0470.m9156(qVar);
                                int i42 = 52611;
                                while (true) {
                                    i42 ^= 52628;
                                    switch (i42) {
                                        case 23:
                                            i42 = 52642;
                                            continue;
                                        case 54:
                                            break;
                                        default:
                                            continue;
                                    }
                                    x1VarM7533 = C0384.m7533(qVar);
                                    i13 = 54657;
                                    while (true) {
                                        i13 ^= 54674;
                                        switch (i13) {
                                            case 19:
                                                if (x1VarM7533 != null) {
                                                    i13 = 55401;
                                                }
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                return;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 3579:
                                                x1VarM7533.f11756d = new f0.c(str, str2, j10, i10);
                                                return;
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        i13 = 54719;
                                    }
                                }
                                break;
                            case 76:
                                int i43 = 51836;
                                while (true) {
                                    i43 ^= 51853;
                                    switch (i43) {
                                        case 241:
                                            i43 = 52518;
                                            continue;
                                        case 1963:
                                            break;
                                        default:
                                            continue;
                                    }
                                    y0.e eVarM1927 = C0090.m1926();
                                    y0.l lVarM4371 = C0226.m4370();
                                    long jM41211 = C0216.m4129(j10, 0.1f);
                                    float f11 = C0079.f113 ^ (-548);
                                    y0.o oVarM5771 = C0300.m5770(C0002.m48(lVarM4371, jM41211, C0419.m8237(f11)), C0208.f232 ^ 364, f11);
                                    C0261.m4990(qVar, (-483455567) ^ C0332.f516);
                                    j0VarM4231 = C0218.m4231(C0204.m3900(), eVarM1927, qVar);
                                    C0261.m4990(qVar, (-1323940364) ^ C0217.f241);
                                    iM276 = C0014.m276(qVar);
                                    r1VarM275 = C0014.m275(qVar);
                                    C0014.m280(C0379.m7428());
                                    jVarM4451 = C0231.m4451();
                                    bVarM6976 = C0355.m6976(oVarM5771);
                                    z10 = C0196.m3764(qVar) instanceof m0.d;
                                    i14 = 52735;
                                    while (true) {
                                        i14 ^= 52752;
                                        switch (i14) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                C0235.m4537();
                                                throw null;
                                            case 1007:
                                                if (z10) {
                                                }
                                                break;
                                            case 7927:
                                                C0100.m1961(qVar);
                                                zM7502 = C0382.m7502(qVar);
                                                i15 = 53510;
                                                while (true) {
                                                    i15 ^= 53527;
                                                    switch (i15) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (zM7502) {
                                                            }
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 83:
                                                            C0445.m8685(qVar);
                                                            break;
                                                        case 116:
                                                            C0017.m346(qVar, jVarM4451);
                                                            i18 = 53634;
                                                            while (true) {
                                                                i18 ^= 53651;
                                                                switch (i18) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i18 = 53665;
                                                                        continue;
                                                                        continue;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                                }
                                                C0089.m1904(qVar, j0VarM4231, C0063.m1208());
                                                C0089.m1904(qVar, r1VarM275, C0464.m9055());
                                                iVarM5562 = C0289.m5562();
                                                zM7503 = C0382.m7502(qVar);
                                                i16 = 53758;
                                                while (true) {
                                                    i16 ^= 53775;
                                                    switch (i16) {
                                                        case 1009:
                                                            if (!zM7503) {
                                                            }
                                                            break;
                                                        case 1703:
                                                            break;
                                                        case 1736:
                                                            C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                            break;
                                                        case 1769:
                                                            zM4399 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM276));
                                                            i17 = 54533;
                                                            while (true) {
                                                                i17 ^= 54550;
                                                                switch (i17) {
                                                                    case 19:
                                                                        if (!zM4399) {
                                                                        }
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 85:
                                                                        break;
                                                                    case 116:
                                                                        C0133.m2574(iM276, qVar, iM276, iVarM5562);
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
                                                C0352.m6912(0, bVarM6976, new l2(qVar), qVar, (-2058660322) ^ C0083.f117);
                                                f2.l lVarM9306 = C0477.m9305();
                                                long jM2603 = C0135.m2601(C0121.f147 ^ 578);
                                                int i310 = (C0083.f117 ^ (-775)) & i12;
                                                int i311 = (i310 & 199680) | (199680 ^ i310);
                                                int i312 = i12 & (C0289.f434 ^ (-849));
                                                C0185.m3537(str, null, j10, jM2603, null, lVarM9306, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, (i311 ^ i312) | (i311 & i312), 0, (-130922) ^ C0365.f636);
                                                long jM41212 = C0216.m4129(j10, 0.7f);
                                                long jM2604 = C0135.m2601(C0159.f183 ^ 24);
                                                f2.l lVarM3905 = C0204.m3904();
                                                int i44 = (i12 >> (C0233.f313 ^ 317)) & (C0103.f129 ^ (-388));
                                                C0185.m3537(str2, null, jM41212, jM2604, null, lVarM3905, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, (199680 ^ i44) | (i44 & 199680), 0, C0054.f74 ^ 130716);
                                                C0016.m325(qVar, false, true, false, false);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    x1VarM7533 = C0384.m7533(qVar);
                                    i13 = 54657;
                                    while (true) {
                                        i13 ^= 54674;
                                        switch (i13) {
                                            case 19:
                                                if (x1VarM7533 != null) {
                                                    i13 = 55401;
                                                }
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                return;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 3579:
                                                x1VarM7533.f11756d = new f0.c(str, str2, j10, i10);
                                                return;
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        i13 = 54719;
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
    }

    /* JADX WARN: Code duplicated, block: B:1000:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1001:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1002:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1003:0x03ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1005:0x03a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1012:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1015:0x034f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1016:0x0355 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1017:0x0359 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1018:0x0355 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1019:0x0351 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1021:0x0347 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:0x02da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x03c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x038c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:996:0x0387 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:999:0x03ab A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:110:0x032e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:129:0x0379. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:350:0x089b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:359:0x08c4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x0238. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:99:0x02bf. Please report as an issue. */
    public static final void c(MainViewModel mainViewModel, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11, String str, long j10, Map map, c9.a aVar, m0.m mVar, int i12, int i13) {
        boolean z14;
        boolean z15;
        boolean z16;
        Iterator itM8318;
        boolean zM3327;
        int i14;
        boolean z17;
        Iterator itM8319;
        boolean zM3328;
        int i15;
        boolean z18;
        boolean z19;
        long jM882;
        String strM1234;
        String strM3243;
        String strM1308;
        String strM8301;
        int i16;
        int i17;
        int i18;
        C0375.m7360(mainViewModel, C0373.m7334(m4193(), 357, C0323.f471 ^ (-989), 476));
        C0375.m7360(str, C0163.m3133(m4193(), 366, C0217.f241 ^ 986, 1747));
        C0375.m7360(map, C0358.m7042(m4193(), 374, C0396.f667 ^ (-203), 353));
        C0375.m7360(aVar, C0125.m2407(m4193(), 388, C0403.f674 ^ (-876), 2302));
        m0.q qVar = (m0.q) mVar;
        C0393.m7698(qVar, (-1328642117) ^ C0031.f51);
        Context context = (Context) C0475.m9256(qVar, C0390.m7636());
        y0.o oVarM8892 = C0456.m8892(C0143.m2748(), C0146.m2779(qVar));
        float f10 = C0382.f653 ^ 829;
        y0.o oVarM4788 = C0250.m4788(oVarM8892, f10);
        C0261.m4990(qVar, 483455660 ^ C0001.f769);
        r1.j0 j0VarM4231 = C0218.m4231(C0204.m3900(), C0173.m3300(), qVar);
        C0261.m4990(qVar, (-1323940077) ^ C0462.f733);
        int iM276 = C0014.m276(qVar);
        m0.r1 r1VarM275 = C0014.m275(qVar);
        C0014.m280(C0379.m7428());
        t1.j jVarM4451 = C0231.m4451();
        u0.b bVarM6976 = C0355.m6976(oVarM4788);
        boolean z20 = C0196.m3764(qVar) instanceof m0.d;
        int i19 = 1616;
        while (true) {
            i19 ^= 1633;
            switch (i19) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (z20) {
                        i19 = 1709;
                    }
                    break;
                case 204:
                    C0100.m1961(qVar);
                    boolean zM7502 = C0382.m7502(qVar);
                    int i20 = 1740;
                    while (true) {
                        i20 ^= 1757;
                        switch (i20) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i20 = zM7502 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                C0445.m8685(qVar);
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0017.m346(qVar, jVarM4451);
                                int i21 = 1864;
                                while (true) {
                                    i21 ^= 1881;
                                    switch (i21) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i21 = 48674;
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
                    C0089.m1904(qVar, j0VarM4231, C0063.m1208());
                    C0089.m1904(qVar, r1VarM275, C0464.m9055());
                    t1.i iVarM5562 = C0289.m5562();
                    boolean zM7503 = C0382.m7502(qVar);
                    int i22 = 48767;
                    while (true) {
                        i22 ^= 48784;
                        switch (i22) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                break;
                            case 76:
                                boolean zM4399 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM276));
                                int i23 = 48891;
                                while (true) {
                                    i23 ^= 48908;
                                    switch (i23) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 503:
                                            i23 = !zM4399 ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                i22 = !zM7503 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    C0352.m6912(0, bVarM6976, new l2(qVar), qVar, (-2058660292) ^ C0327.f475);
                    m0.g1 g1VarM8775 = C0450.m8775(C0271.m5232(mainViewModel), qVar);
                    PackageManager packageManagerM8279 = C0421.m8279(context);
                    try {
                        try {
                            boolean zM6316 = C0326.m6316();
                            int i24 = 49666;
                            while (true) {
                                i24 ^= 49683;
                                switch (i24) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i24 = !zM6316 ? 49759 : 49728;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        z14 = false;
                                        int i25 = 49790;
                                        while (true) {
                                            i25 ^= 49807;
                                            switch (i25) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 241:
                                                    i25 = 49821;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 83:
                                        int iM2521 = C0131.m2521();
                                        int i26 = 49914;
                                        while (true) {
                                            i26 ^= 49931;
                                            switch (i26) {
                                                case 497:
                                                    i26 = iM2521 == 0 ? 50658 : 50627;
                                                    break;
                                                case 1711:
                                                    break;
                                                case 1736:
                                                    z14 = false;
                                                    break;
                                                case 1769:
                                                    z14 = true;
                                                    int i27 = 50689;
                                                    while (true) {
                                                        i27 ^= 50706;
                                                        switch (i27) {
                                                            case 19:
                                                                i27 = 50720;
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
                                        break;
                                    default:
                                        break;
                                }
                            }
                            while (true) {
                                i18 ^= 50830;
                                switch (i18) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        z15 = true;
                                        break;
                                    case 243:
                                        i18 = 50844;
                                        continue;
                                    default:
                                        continue;
                                }
                                try {
                                    C0290.m5588(packageManagerM8279, C0259.m4951(m4193(), 440, C0055.f75 ^ (-722), 1370), 0);
                                    int i28 = 51712;
                                    while (true) {
                                        i28 ^= 51729;
                                        switch (i28) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                z16 = true;
                                                break;
                                            case 15:
                                            case Code.UNAUTHENTICATED /* 16 */:
                                            default:
                                                continue;
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i28 = 51743;
                                                continue;
                                        }
                                        String strM3556 = C0186.m3556(m4193(), 463, C0255.f335 ^ (-350), 2133);
                                        String strM4943 = C0258.m4943(m4193(), 483, C0025.f45 ^ 127, 1232);
                                        String strM1004 = C0051.m1004(m4193(), 504, C0342.f613 ^ 55, 1855);
                                        String[] strArr = new String[3];
                                        strArr[C0485.f759 ^ 55] = strM4943;
                                        strArr[C0111.f137 ^ (-770)] = strM1004;
                                        strArr[C0110.f136 ^ 473] = strM3556;
                                        List listM7965 = C0405.m7965(strArr);
                                        boolean z21 = listM7965 instanceof Collection;
                                        int i29 = 51836;
                                        while (true) {
                                            i29 ^= 51853;
                                            switch (i29) {
                                                case 241:
                                                    i29 = z21 ? 52580 : 52549;
                                                    break;
                                                case 1963:
                                                    break;
                                                case 1992:
                                                    itM8318 = C0424.m8318(listM7965);
                                                    while (true) {
                                                        zM3327 = C0174.m3327(itM8318);
                                                        i14 = 53510;
                                                        while (true) {
                                                            i14 ^= 53527;
                                                            switch (i14) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i14 = zM3327 ? 53603 : 53572;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 83:
                                                                    z17 = false;
                                                                    i17 = 52735;
                                                                    while (true) {
                                                                        i17 ^= 52752;
                                                                        switch (i17) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case 1007:
                                                                                i17 = 52766;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 116:
                                                                    try {
                                                                        C0290.m5588(packageManagerM8279, (String) C0413.m8115(itM8318), 0);
                                                                        z17 = true;
                                                                        break;
                                                                    } catch (Exception e4) {
                                                                        int i30 = 1543184;
                                                                        while (true) {
                                                                            i30 ^= 1543201;
                                                                            switch (i30) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case 49:
                                                                                    i30 = 1543215;
                                                                                    break;
                                                                            }
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 2025:
                                                    boolean zM9582 = C0492.m9582(listM7965);
                                                    int i31 = 52611;
                                                    while (true) {
                                                        i31 ^= 52628;
                                                        switch (i31) {
                                                            case 23:
                                                                i31 = zM9582 ? 52704 : 52673;
                                                                break;
                                                            case 54:
                                                                break;
                                                            case 85:
                                                                itM8318 = C0424.m8318(listM7965);
                                                                while (true) {
                                                                    zM3327 = C0174.m3327(itM8318);
                                                                    i14 = 53510;
                                                                    while (true) {
                                                                        i14 ^= 53527;
                                                                        switch (i14) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (zM3327) {
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 83:
                                                                                z17 = false;
                                                                                i17 = 52735;
                                                                                while (true) {
                                                                                    i17 ^= 52752;
                                                                                    switch (i17) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case 1007:
                                                                                            i17 = 52766;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 116:
                                                                                C0290.m5588(packageManagerM8279, (String) C0413.m8115(itM8318), 0);
                                                                                z17 = true;
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            case 116:
                                                                z17 = false;
                                                                i17 = 52735;
                                                                while (true) {
                                                                    i17 ^= 52752;
                                                                    switch (i17) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case 1007:
                                                                            i17 = 52766;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        default:
                                                                            continue;
                                                                            continue;
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
                                            String strM4907 = C0256.m4907(m4193(), 518, C0211.f235 ^ 569, 2487);
                                            String strM6943 = C0353.m6943(m4193(), 537, C0178.f202 ^ 137, 397);
                                            String strM889 = C0046.m889(m4193(), 555, C0019.f39 ^ (-65), 1745);
                                            String[] strArr2 = new String[3];
                                            strArr2[C0279.f424 ^ (-118)] = strM6943;
                                            strArr2[C0428.f699 ^ 198] = strM889;
                                            strArr2[C0371.f642 ^ (-936)] = strM4907;
                                            List listM7966 = C0405.m7965(strArr2);
                                            boolean z22 = listM7966 instanceof Collection;
                                            int i32 = 53634;
                                            while (true) {
                                                i32 ^= 53651;
                                                switch (i32) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i32 = z22 ? 53727 : 53696;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        boolean zM9583 = C0492.m9582(listM7966);
                                                        int i33 = 53758;
                                                        while (true) {
                                                            i33 ^= 53775;
                                                            switch (i33) {
                                                                case 1009:
                                                                    i33 = zM9583 ? 54502 : 54471;
                                                                    break;
                                                                case 1703:
                                                                    break;
                                                                case 1736:
                                                                    itM8319 = C0424.m8318(listM7966);
                                                                    while (true) {
                                                                        zM3328 = C0174.m3327(itM8319);
                                                                        i15 = 54657;
                                                                        while (true) {
                                                                            i15 ^= 54674;
                                                                            switch (i15) {
                                                                                case 19:
                                                                                    i15 = zM3328 ? 55401 : 54719;
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    z18 = false;
                                                                                    i16 = 54533;
                                                                                    while (true) {
                                                                                        i16 ^= 54550;
                                                                                        switch (i16) {
                                                                                            case 19:
                                                                                                i16 = 54564;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                break;
                                                                                            default:
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                case 3579:
                                                                                    try {
                                                                                        C0290.m5588(packageManagerM8279, (String) C0413.m8115(itM8319), 0);
                                                                                        z18 = true;
                                                                                        break;
                                                                                    } catch (Exception e10) {
                                                                                        int i34 = 1543308;
                                                                                        while (true) {
                                                                                            i34 ^= 1543325;
                                                                                            switch (i34) {
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i34 = 1543990;
                                                                                                    break;
                                                                                                case 939:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1769:
                                                                    z18 = false;
                                                                    i16 = 54533;
                                                                    while (true) {
                                                                        i16 ^= 54550;
                                                                        switch (i16) {
                                                                            case 19:
                                                                                i16 = 54564;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 83:
                                                        itM8319 = C0424.m8318(listM7966);
                                                        while (true) {
                                                            zM3328 = C0174.m3327(itM8319);
                                                            i15 = 54657;
                                                            while (true) {
                                                                i15 ^= 54674;
                                                                switch (i15) {
                                                                    case 19:
                                                                        if (zM3328) {
                                                                        }
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        z18 = false;
                                                                        i16 = 54533;
                                                                        while (true) {
                                                                            i16 ^= 54550;
                                                                            switch (i16) {
                                                                                case 19:
                                                                                    i16 = 54564;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 3579:
                                                                        C0290.m5588(packageManagerM8279, (String) C0413.m8115(itM8319), 0);
                                                                        z18 = true;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                ArrayList arrayList = new ArrayList();
                                                int i35 = 55432;
                                                while (true) {
                                                    i35 ^= 55449;
                                                    switch (i35) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i35 = z15 ? 55525 : 55494;
                                                            break;
                                                        case 62:
                                                            break;
                                                        case 95:
                                                            break;
                                                        case 124:
                                                            String strM8796 = C0451.m8796(m4193(), 566, C0040.f60 ^ (-87), 1493);
                                                            Boolean bool = (Boolean) C0487.m9501(map, strM8796);
                                                            int i36 = 55556;
                                                            while (true) {
                                                                i36 ^= 55573;
                                                                switch (i36) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i36 = bool != null ? 55649 : 55618;
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 87:
                                                                        C0357.m6998(arrayList, strM8796);
                                                                        break;
                                                                    case 116:
                                                                        boolean zM14 = C0000.m14(bool);
                                                                        int i37 = 55680;
                                                                        while (true) {
                                                                            i37 ^= 55697;
                                                                            switch (i37) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i37 = zM14 ? 56424 : 56393;
                                                                                    break;
                                                                                case 1467:
                                                                                    break;
                                                                                case 1496:
                                                                                    break;
                                                                                case 1529:
                                                                                    C0357.m6998(arrayList, strM8796);
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
                                                int i38 = 56455;
                                                while (true) {
                                                    i38 ^= 56472;
                                                    switch (i38) {
                                                        case 31:
                                                            i38 = z16 ? 56548 : 56517;
                                                            break;
                                                        case 62:
                                                            break;
                                                        case 93:
                                                            break;
                                                        case 124:
                                                            String strM2792 = C0146.m2792(m4193(), 572, C0090.f124 ^ 860, 770);
                                                            Boolean bool2 = (Boolean) C0487.m9501(map, strM2792);
                                                            int i39 = 56579;
                                                            while (true) {
                                                                i39 ^= 56596;
                                                                switch (i39) {
                                                                    case 23:
                                                                        i39 = bool2 != null ? 1507472 : 56641;
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 85:
                                                                        C0357.m6998(arrayList, strM2792);
                                                                        break;
                                                                    case 1564036:
                                                                        boolean zM15 = C0000.m14(bool2);
                                                                        int i40 = 1507503;
                                                                        while (true) {
                                                                            i40 ^= 1507520;
                                                                            switch (i40) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    break;
                                                                                case 111:
                                                                                    i40 = zM15 ? 1507596 : 1507565;
                                                                                    break;
                                                                                case 460:
                                                                                    C0357.m6998(arrayList, strM2792);
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
                                                int i41 = 1507627;
                                                while (true) {
                                                    i41 ^= 1507644;
                                                    switch (i41) {
                                                        case 23:
                                                            i41 = z17 ? 1507720 : 1507689;
                                                            break;
                                                        case 85:
                                                            break;
                                                        case 118:
                                                            break;
                                                        case 180:
                                                            int i42 = 1507751;
                                                            while (true) {
                                                                i42 ^= 1507768;
                                                                switch (i42) {
                                                                    case 31:
                                                                        i42 = z14 ? 1508495 : 1508464;
                                                                        break;
                                                                    case 1335:
                                                                        String strM5911 = C0306.m5911(m4193(), 578, C0269.f349 ^ (-506), 2574);
                                                                        Boolean bool3 = (Boolean) C0487.m9501(map, strM5911);
                                                                        int i43 = 1508526;
                                                                        while (true) {
                                                                            i43 ^= 1508543;
                                                                            switch (i43) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i43 = bool3 != null ? 1508619 : 1508588;
                                                                                    break;
                                                                                case 83:
                                                                                    C0357.m6998(arrayList, strM5911);
                                                                                    break;
                                                                                case 114:
                                                                                    break;
                                                                                case 436:
                                                                                    boolean zM16 = C0000.m14(bool3);
                                                                                    int i44 = 1508650;
                                                                                    while (true) {
                                                                                        i44 ^= 1508667;
                                                                                        switch (i44) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i44 = zM16 ? 1509394 : 1508712;
                                                                                                break;
                                                                                            case 83:
                                                                                                break;
                                                                                            case 114:
                                                                                                break;
                                                                                            case 3369:
                                                                                                C0357.m6998(arrayList, strM5911);
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
                                                                    case 1480:
                                                                        break;
                                                                    case 1513:
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
                                                int i45 = 1509425;
                                                while (true) {
                                                    i45 ^= 1509442;
                                                    switch (i45) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            break;
                                                        case 115:
                                                            i45 = z18 ? 1509518 : 1509487;
                                                            break;
                                                        case 204:
                                                            int i46 = 1509549;
                                                            while (true) {
                                                                i46 ^= 1509566;
                                                                switch (i46) {
                                                                    case 19:
                                                                        i46 = z14 ? 1509642 : 1509611;
                                                                        break;
                                                                    case 85:
                                                                        break;
                                                                    case 114:
                                                                        break;
                                                                    case 436:
                                                                        String strM406 = C0020.m406(m4193(), 581, C0031.f51 ^ (-158), 805);
                                                                        Boolean bool4 = (Boolean) C0487.m9501(map, strM406);
                                                                        int i47 = 1509673;
                                                                        while (true) {
                                                                            i47 ^= 1509690;
                                                                            switch (i47) {
                                                                                case 19:
                                                                                    i47 = bool4 != null ? 1510417 : 1510386;
                                                                                    break;
                                                                                case 712:
                                                                                    C0357.m6998(arrayList, strM406);
                                                                                    break;
                                                                                case 745:
                                                                                    break;
                                                                                case 1323:
                                                                                    boolean zM17 = C0000.m14(bool4);
                                                                                    int i48 = 1510448;
                                                                                    while (true) {
                                                                                        i48 ^= 1510465;
                                                                                        switch (i48) {
                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                break;
                                                                                            case 47:
                                                                                                break;
                                                                                            case 113:
                                                                                                i48 = zM17 ? 1510541 : 1510510;
                                                                                                break;
                                                                                            case 204:
                                                                                                C0357.m6998(arrayList, strM406);
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
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0318.m6169();
                                                C0488.m9503(0, qVar, C0316.m6122(C0072.m1553(m4193(), 585, C0335.f519 ^ 310, 3187), (String) C0418.m8214(g1VarM8775)));
                                                y0.l lVarM4370 = C0226.m4370();
                                                FillElement fillElementM2371 = C0123.m2371();
                                                long jM2039 = C0104.m2039();
                                                C0271.m5230(fillElementM2371, C0419.m8237(f10), C0067.m1299(jM2039, qVar, 0), null, null, C0059.m1122(qVar, 1119323294 ^ C0202.f226, new b0(z11, z12, z10, g1VarM8775, arrayList, map, context, aVar, mainViewModel)), qVar, (-197345) ^ C0408.f679, C0469.f740 ^ 211);
                                                float f11 = C0079.f113 ^ (-576);
                                                C0072.m1564(C0270.m5166(lVarM4370, f11), qVar);
                                                C0488.m9503(0, qVar, C0316.m6122(C0105.m2052(m4193(), 600, C0180.f204 ^ (-358), 1158), (String) C0418.m8214(g1VarM8775)));
                                                m0.g1 g1VarM8776 = C0450.m8775(C0175.m3347(mainViewModel), qVar);
                                                m0.g1 g1VarM8777 = C0450.m8775(C0250.m4783(mainViewModel), qVar);
                                                boolean zM18 = C0000.m14((Boolean) C0418.m8214(g1VarM8776));
                                                int i49 = 1510572;
                                                while (true) {
                                                    i49 ^= 1510589;
                                                    switch (i49) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i49 = !zM18 ? 1511316 : 1510634;
                                                            break;
                                                        case 87:
                                                            z19 = true;
                                                            break;
                                                        case 118:
                                                            break;
                                                        case 809:
                                                            boolean zM19 = C0000.m14((Boolean) C0418.m8214(g1VarM8777));
                                                            int i50 = 1511347;
                                                            while (true) {
                                                                i50 ^= 1511364;
                                                                switch (i50) {
                                                                    case 22:
                                                                        break;
                                                                    case 53:
                                                                        z19 = false;
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
                                                                        break;
                                                                    case 119:
                                                                        i50 = zM19 ? 1511440 : 1511409;
                                                                        break;
                                                                    case 8148:
                                                                        int i52 = 1511471;
                                                                        while (true) {
                                                                            i52 ^= 1511488;
                                                                            switch (i52) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case 111:
                                                                                    i52 = 1511502;
                                                                                    continue;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                            z19 = true;
                                                                            break;
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
                                                int i53 = 1512370;
                                                while (true) {
                                                    i53 ^= 1512387;
                                                    switch (i53) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 51:
                                                            jM882 = C0045.m882();
                                                            int i54 = 1513269;
                                                            while (true) {
                                                                i54 ^= 1513286;
                                                                switch (i54) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 115:
                                                                        i54 = 1513300;
                                                                        continue;
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        case 113:
                                                            i53 = z19 ? 1512463 : 1512432;
                                                            break;
                                                        case 1996:
                                                            jM882 = C0019.m389(4294923024L ^ ((long) C0062.f82));
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                int i55 = 1512494;
                                                while (true) {
                                                    i55 ^= 1512511;
                                                    switch (i55) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i55 = 1512525;
                                                            break;
                                                        case 114:
                                                            C0271.m5230(fillElementM2371, C0419.m8237(f10), C0067.m1299(jM2039, qVar, 0), null, null, C0059.m1122(qVar, 594337702 ^ C0261.f341, new c0(z10, arrayList, z19, z17, map, z18, z14, g1VarM8775, jM882)), qVar, 196614, 24);
                                                            float f12 = C0076.f110 ^ 717;
                                                            C0072.m1564(C0270.m5166(lVarM4370, f12), qVar);
                                                            float f13 = C0003.f881 ^ (-849);
                                                            y0.o oVarM4789 = C0250.m4788(C0002.m48(C0333.m6470(fillElementM2371, C0419.m8237(f13)), C0019.m389((-4279904099L) ^ ((long) C0154.f179)), C0041.m813()), f13);
                                                            C0261.m4990(qVar, 733329070 ^ C0353.f624);
                                                            r1.j0 j0VarM2476 = C0128.m2476(C0456.m8889(), false, qVar);
                                                            C0261.m4990(qVar, -1323940314);
                                                            int iM277 = C0014.m276(qVar);
                                                            m0.r1 r1VarM276 = C0014.m275(qVar);
                                                            C0014.m280(C0379.m7428());
                                                            t1.j jVarM4452 = C0231.m4451();
                                                            u0.b bVarM6977 = C0355.m6976(oVarM4789);
                                                            int i56 = 1513393;
                                                            while (true) {
                                                                i56 ^= 1513410;
                                                                switch (i56) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        C0235.m4537();
                                                                        throw null;
                                                                    case 115:
                                                                        if (z20) {
                                                                            i56 = 1513486;
                                                                        }
                                                                        break;
                                                                    case 4044:
                                                                        C0100.m1961(qVar);
                                                                        boolean zM7504 = C0382.m7502(qVar);
                                                                        int i57 = 1513517;
                                                                        while (true) {
                                                                            i57 ^= 1513534;
                                                                            switch (i57) {
                                                                                case 19:
                                                                                    i57 = zM7504 ? 1514261 : 1514230;
                                                                                    break;
                                                                                case 712:
                                                                                    C0445.m8685(qVar);
                                                                                    break;
                                                                                case 745:
                                                                                    break;
                                                                                case 811:
                                                                                    C0017.m346(qVar, jVarM4452);
                                                                                    int i58 = 1514292;
                                                                                    while (true) {
                                                                                        i58 ^= 1514309;
                                                                                        switch (i58) {
                                                                                            case 22:
                                                                                                break;
                                                                                            case 113:
                                                                                                i58 = 1514323;
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
                                                                        t1.i iVarM1208 = C0063.m1208();
                                                                        C0089.m1904(qVar, j0VarM2476, iVarM1208);
                                                                        t1.i iVarM9055 = C0464.m9055();
                                                                        C0089.m1904(qVar, r1VarM276, iVarM9055);
                                                                        t1.i iVarM5563 = C0289.m5562();
                                                                        boolean zM7505 = C0382.m7502(qVar);
                                                                        int i59 = 1514416;
                                                                        while (true) {
                                                                            i59 ^= 1514433;
                                                                            switch (i59) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case 47:
                                                                                    C0133.m2574(iM277, qVar, iM277, iVarM5563);
                                                                                    break;
                                                                                case 113:
                                                                                    i59 = !zM7505 ? 1515160 : 1514478;
                                                                                    break;
                                                                                case 1369:
                                                                                    boolean zM43910 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM277));
                                                                                    int i60 = 1515191;
                                                                                    while (true) {
                                                                                        i60 ^= 1515208;
                                                                                        switch (i60) {
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                                break;
                                                                                            case 61:
                                                                                                break;
                                                                                            case 127:
                                                                                                i60 = !zM43910 ? 1515284 : 1515253;
                                                                                                break;
                                                                                            case 476:
                                                                                                C0133.m2574(iM277, qVar, iM277, iVarM5563);
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
                                                                        C0352.m6912(0, bVarM6977, new l2(qVar), qVar, (-2058660211) ^ C0435.f706);
                                                                        y0.f fVarM6849 = C0349.m6849();
                                                                        C0261.m4990(qVar, (-693286757) ^ C0220.f300);
                                                                        r1.j0 j0VarM4288 = C0222.m4288(C0113.m2180(), fVarM6849, qVar);
                                                                        C0261.m4990(qVar, -1323940314);
                                                                        int iM278 = C0014.m276(qVar);
                                                                        m0.r1 r1VarM277 = C0014.m275(qVar);
                                                                        u0.b bVarM6978 = C0355.m6976(lVarM4370);
                                                                        int i61 = 1515315;
                                                                        while (true) {
                                                                            i61 ^= 1515332;
                                                                            switch (i61) {
                                                                                case 22:
                                                                                    break;
                                                                                case 53:
                                                                                    C0235.m4537();
                                                                                    throw null;
                                                                                case 119:
                                                                                    if (z20) {
                                                                                        i61 = 1515408;
                                                                                    }
                                                                                    break;
                                                                                case 212:
                                                                                    C0100.m1961(qVar);
                                                                                    boolean zM7506 = C0382.m7502(qVar);
                                                                                    int i62 = 1515439;
                                                                                    while (true) {
                                                                                        i62 ^= 1515456;
                                                                                        switch (i62) {
                                                                                            case 111:
                                                                                                i62 = zM7506 ? 1516183 : 1516152;
                                                                                                break;
                                                                                            case 15703:
                                                                                                C0017.m346(qVar, jVarM4452);
                                                                                                int i63 = 1516214;
                                                                                                while (true) {
                                                                                                    i63 ^= 1516231;
                                                                                                    switch (i63) {
                                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                            break;
                                                                                                        case 113:
                                                                                                            i63 = 1516245;
                                                                                                            continue;
                                                                                                        default:
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 15769:
                                                                                                break;
                                                                                            case 15800:
                                                                                                C0445.m8685(qVar);
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    C0089.m1904(qVar, j0VarM4288, iVarM1208);
                                                                                    C0089.m1904(qVar, r1VarM277, iVarM9055);
                                                                                    boolean zM7507 = C0382.m7502(qVar);
                                                                                    int i64 = 1516338;
                                                                                    while (true) {
                                                                                        i64 ^= 1516355;
                                                                                        switch (i64) {
                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                break;
                                                                                            case 51:
                                                                                                C0133.m2574(iM278, qVar, iM278, iVarM5563);
                                                                                                break;
                                                                                            case 113:
                                                                                                i64 = !zM7507 ? 1537263 : 1516400;
                                                                                                break;
                                                                                            case 22444:
                                                                                                boolean zM43911 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM278));
                                                                                                int i65 = 1537294;
                                                                                                while (true) {
                                                                                                    i65 ^= 1537311;
                                                                                                    switch (i65) {
                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i65 = !zM43911 ? 1537387 : 1537356;
                                                                                                            break;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                            break;
                                                                                                        case 83:
                                                                                                            break;
                                                                                                        case 116:
                                                                                                            C0133.m2574(iM278, qVar, iM278, iVarM5563);
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
                                                                                    C0045.m869(bVarM6978, new l2(qVar), qVar, C0057.m1083(0));
                                                                                    C0261.m4990(qVar, (-2058660310) ^ C0448.f719);
                                                                                    C0142.m2736(C0264.m5057(), null, C0154.m2949(lVarM4370, C0235.f315 ^ (-677)), C0019.m389(4294945554L ^ ((long) C0304.f452)), qVar, 3504, 0);
                                                                                    C0072.m1564(C0430.m8431(lVarM4370, f12), qVar);
                                                                                    C0185.m3537(C0316.m6122(C0325.m6296(m4193(), 618, C0300.f448 ^ (-762), 958), (String) C0418.m8214(g1VarM8775)), C0221.m4269(), C0001.m41(), C0135.m2601(C0090.f124 ^ 854), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, 3072, 0, 130644 ^ C0273.f389);
                                                                                    C0016.m325(qVar, false, true, false, false);
                                                                                    C0016.m325(qVar, false, true, false, false);
                                                                                    C0072.m1564(C0270.m5166(lVarM4370, f11), qVar);
                                                                                    C0488.m9503(0, qVar, C0316.m6122(C0148.m2836(m4193(), 641, C0285.f430 ^ (-877), 3125), (String) C0418.m8214(g1VarM8775)));
                                                                                    C0271.m5230(fillElementM2371, C0419.m8237(f10), C0067.m1299(jM2039, qVar, 0), null, null, C0059.m1122(qVar, (-1162308972) ^ C0349.f620, new g0(i10, g1VarM8775, mainViewModel, z10, context)), qVar, 196835 ^ C0418.f689, 24);
                                                                                    C0072.m1564(C0270.m5166(lVarM4370, f11), qVar);
                                                                                    C0488.m9503(0, qVar, C0316.m6122(C0350.m6868(m4193(), 652, C0224.f304 ^ 861, 1768), (String) C0418.m8214(g1VarM8775)));
                                                                                    C0271.m5230(fillElementM2371, C0419.m8237(f10), C0067.m1299(jM2039, qVar, 0), null, null, C0059.m1122(qVar, 1730281148 ^ C0306.f454, new a(mainViewModel, g1VarM8775)), qVar, (-196838) ^ C0368.f639, C0221.f301 ^ (-755));
                                                                                    C0072.m1564(C0270.m5166(lVarM4370, f11), qVar);
                                                                                    String strM8665 = C0444.m8665(m4193(), 667, C0489.f763 ^ (-538), 2873);
                                                                                    int i66 = C0321.f469 ^ (-623);
                                                                                    C0488.m9503(i66, qVar, strM8665);
                                                                                    String strM7757 = C0396.m7757(m4193(), 678, C0117.f143 ^ 938, 1071);
                                                                                    int i67 = 1537418;
                                                                                    while (true) {
                                                                                        i67 ^= 1537435;
                                                                                        switch (i67) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i67 = z11 ? 1537511 : 1537480;
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                break;
                                                                                            case 83:
                                                                                                strM1234 = C0064.m1234(m4193(), 706, C0392.f663 ^ 601, 355);
                                                                                                break;
                                                                                            case 124:
                                                                                                strM1234 = C0063.m1214(m4193(), 699, C0119.f145 ^ 902, 2833);
                                                                                                int i68 = 1537542;
                                                                                                while (true) {
                                                                                                    i68 ^= 1537559;
                                                                                                    switch (i68) {
                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i68 = 1538224;
                                                                                                            continue;
                                                                                                        case 3751:
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
                                                                                    C0450.m8770(strM7757, strM1234, z11, C0428.m8408(), new k4.p(context, C0366.f637 ^ 373), qVar, ((C0401.f672 ^ (-397)) & i12) | (C0144.f170 ^ (-139)));
                                                                                    String strM5301 = C0275.m5301(m4193(), 730, C0294.f442 ^ (-655), 1645);
                                                                                    int i69 = 1538317;
                                                                                    while (true) {
                                                                                        i69 ^= 1538334;
                                                                                        switch (i69) {
                                                                                            case 19:
                                                                                                i69 = z12 ? 1538410 : 1538379;
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                break;
                                                                                            case 85:
                                                                                                strM3243 = C0169.m3243(m4193(), 755, C0215.f239 ^ (-774), 2234);
                                                                                                break;
                                                                                            case 116:
                                                                                                strM3243 = C0204.m3906(m4193(), 748, C0412.f683 ^ (-799), 1412);
                                                                                                int i70 = 1538441;
                                                                                                while (true) {
                                                                                                    i70 ^= 1538458;
                                                                                                    switch (i70) {
                                                                                                        case 19:
                                                                                                            i70 = 1538472;
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
                                                                                    C0450.m8770(strM5301, strM3243, z12, C0036.m706(), new k4.p(context, i66), qVar, ((i12 >> (C0189.f213 ^ (-733))) & (C0037.f57 ^ 293)) | (C0107.f133 ^ (-722)));
                                                                                    m0.g1 g1VarM8778 = C0450.m8775(C0013.m260(mainViewModel), qVar);
                                                                                    String strM2596 = C0135.m2596(m4193(), 783, C0443.f714 ^ (-807), 2960);
                                                                                    boolean zM110 = C0000.m14((Boolean) C0418.m8214(g1VarM8778));
                                                                                    int i71 = 1539216;
                                                                                    while (true) {
                                                                                        i71 ^= 1539233;
                                                                                        switch (i71) {
                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                break;
                                                                                            case 49:
                                                                                                i71 = zM110 ? 1539309 : 1539278;
                                                                                                break;
                                                                                            case 76:
                                                                                                strM1308 = C0482.m9384(m4193(), 796, C0385.f656 ^ (-10), 1995);
                                                                                                int i72 = 1539340;
                                                                                                while (true) {
                                                                                                    i72 ^= 1539357;
                                                                                                    switch (i72) {
                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i72 = 1539371;
                                                                                                            continue;
                                                                                                        case 54:
                                                                                                            break;
                                                                                                        default:
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 111:
                                                                                                strM1308 = C0067.m1308(m4193(), 803, C0234.f314 ^ 1018, 1887);
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    boolean zM111 = C0000.m14((Boolean) C0418.m8214(g1VarM8778));
                                                                                    i1.f fVarM2984 = C0156.m2984();
                                                                                    int i73 = C0102.f128;
                                                                                    int i74 = 1539464;
                                                                                    while (true) {
                                                                                        i74 ^= 1539481;
                                                                                        switch (i74) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i74 = fVarM2984 != null ? 1540208 : 1540177;
                                                                                                break;
                                                                                            case 64939:
                                                                                                break;
                                                                                            case 64968:
                                                                                                i1.e eVar = new i1.e(C0170.m3259(m4193(), 827, C0225.f305 ^ (-155), 3199), 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, C0267.f347 ^ (-299));
                                                                                                C0167.m3190();
                                                                                                e1.n0 n0Var = new e1.n0(C0180.m3437());
                                                                                                k.f fVar = new k.f(i73 ^ 233);
                                                                                                C0447.m8725(fVar, 20.0f, 4.0f);
                                                                                                C0103.m2024(fVar, 4.0f);
                                                                                                C0388.m7609(fVar, 2.89f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
                                                                                                C0022.m438(fVar, 12.0f);
                                                                                                C0051.m999(fVar, 0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                                                                                                C0180.m3426(fVar, 16.0f);
                                                                                                C0051.m999(fVar, 1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                                                                                                C0454.m8859(fVar, 6.0f);
                                                                                                C0388.m7609(fVar, 22.0f, 4.9f, 21.11f, 4.0f, 20.0f, 4.0f);
                                                                                                C0488.m9518(fVar);
                                                                                                C0447.m8725(fVar, 20.0f, 18.0f);
                                                                                                C0103.m2024(fVar, 4.0f);
                                                                                                C0454.m8859(fVar, 8.0f);
                                                                                                C0180.m3426(fVar, 16.0f);
                                                                                                C0454.m8859(fVar, 18.0f);
                                                                                                C0488.m9518(fVar);
                                                                                                C0447.m8725(fVar, 18.0f, 17.0f);
                                                                                                C0180.m3426(fVar, -6.0f);
                                                                                                C0022.m438(fVar, -2.0f);
                                                                                                C0180.m3426(fVar, 6.0f);
                                                                                                C0454.m8859(fVar, 17.0f);
                                                                                                C0488.m9518(fVar);
                                                                                                C0447.m8725(fVar, 7.5f, 17.0f);
                                                                                                C0282.m5453(fVar, -1.41f, -1.41f);
                                                                                                C0473.m9221(fVar, 8.67f, 13.0f);
                                                                                                C0282.m5453(fVar, -2.59f, -2.59f);
                                                                                                C0473.m9221(fVar, 7.5f, 9.0f);
                                                                                                C0282.m5453(fVar, 4.0f, 4.0f);
                                                                                                C0473.m9221(fVar, 7.5f, 17.0f);
                                                                                                C0488.m9518(fVar);
                                                                                                C0479.m9341(eVar, (ArrayList) C0354.m6945(fVar), n0Var);
                                                                                                fVarM2984 = C0390.m7638(eVar);
                                                                                                f6.a.f6372u = fVarM2984;
                                                                                                break;
                                                                                            case 65001:
                                                                                                int i75 = 1540239;
                                                                                                while (true) {
                                                                                                    i75 ^= 1540256;
                                                                                                    switch (i75) {
                                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                                            break;
                                                                                                        case 47:
                                                                                                            i75 = 1540270;
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
                                                                                    C0450.m8770(strM2596, strM1308, zM111, fVarM2984, C0269.m5150(), qVar, 24582);
                                                                                    String strM4105 = C0215.m4105(m4193(), 842, C0079.f113 ^ (-576), 398);
                                                                                    int i76 = 1540363;
                                                                                    while (true) {
                                                                                        i76 ^= 1540380;
                                                                                        switch (i76) {
                                                                                            case 23:
                                                                                                if (z13) {
                                                                                                    i76 = 1541107;
                                                                                                }
                                                                                                break;
                                                                                            case 54:
                                                                                                break;
                                                                                            case 85:
                                                                                                strM8301 = C0423.m8301(m4193(), 874, C0444.f715 ^ (-859), 2906);
                                                                                                break;
                                                                                            case 751:
                                                                                                strM8301 = C0344.m6750(m4193(), 862, C0266.f346 ^ (-784), 1755);
                                                                                                int i77 = 1541138;
                                                                                                while (true) {
                                                                                                    i77 ^= 1541155;
                                                                                                    switch (i77) {
                                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                            break;
                                                                                                        case 49:
                                                                                                            i77 = 1541169;
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                continue;
                                                                                        }
                                                                                        i76 = 1540425;
                                                                                    }
                                                                                    i1.f fVarM3716 = C0194.m3716();
                                                                                    int i78 = 1541262;
                                                                                    while (true) {
                                                                                        i78 ^= 1541279;
                                                                                        switch (i78) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i78 = fVarM3716 != null ? 1541355 : 1541324;
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                break;
                                                                                            case 83:
                                                                                                i1.e eVar2 = new i1.e(C0052.m1017(m4193(), 887, C0170.f194 ^ (-143), 2198), 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, C0392.f663 ^ 545);
                                                                                                C0167.m3190();
                                                                                                e1.n0 n0Var2 = new e1.n0(C0180.m3437());
                                                                                                k.f fVar2 = new k.f(7);
                                                                                                C0447.m8725(fVar2, 15.67f, 4.0f);
                                                                                                C0103.m2024(fVar2, 14.0f);
                                                                                                C0454.m8859(fVar2, 2.0f);
                                                                                                C0180.m3426(fVar2, -4.0f);
                                                                                                C0022.m438(fVar2, 2.0f);
                                                                                                C0103.m2024(fVar2, 8.33f);
                                                                                                C0388.m7609(fVar2, 7.6f, 4.0f, 7.0f, 4.6f, 7.0f, 5.33f);
                                                                                                C0022.m438(fVar2, 15.33f);
                                                                                                C0388.m7609(fVar2, 7.0f, 21.4f, 7.6f, 22.0f, 8.33f, 22.0f);
                                                                                                C0180.m3426(fVar2, 7.33f);
                                                                                                C0051.m999(fVar2, 0.74f, 0.0f, 1.34f, -0.6f, 1.34f, -1.33f);
                                                                                                C0454.m8859(fVar2, 5.33f);
                                                                                                C0388.m7609(fVar2, 17.0f, 4.6f, 16.4f, 4.0f, 15.67f, 4.0f);
                                                                                                C0488.m9518(fVar2);
                                                                                                C0447.m8725(fVar2, 11.0f, 20.0f);
                                                                                                C0022.m438(fVar2, -5.5f);
                                                                                                C0103.m2024(fVar2, 9.0f);
                                                                                                C0473.m9221(fVar2, 13.0f, 7.0f);
                                                                                                C0022.m438(fVar2, 5.5f);
                                                                                                C0180.m3426(fVar2, 2.0f);
                                                                                                C0473.m9221(fVar2, 11.0f, 20.0f);
                                                                                                C0488.m9518(fVar2);
                                                                                                C0479.m9341(eVar2, (ArrayList) C0354.m6945(fVar2), n0Var2);
                                                                                                fVarM3716 = C0390.m7638(eVar2);
                                                                                                z6.a.f17301b = fVarM3716;
                                                                                                int i79 = 1542161;
                                                                                                while (true) {
                                                                                                    i79 ^= 1542178;
                                                                                                    switch (i79) {
                                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                            break;
                                                                                                        case 51:
                                                                                                            i79 = 1542192;
                                                                                                            continue;
                                                                                                        default:
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 116:
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    int i80 = 1541386;
                                                                                    while (true) {
                                                                                        i80 ^= 1541403;
                                                                                        switch (i80) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i80 = 1542068;
                                                                                                break;
                                                                                            case 687:
                                                                                                C0450.m8770(strM4105, strM8301, z13, fVarM3716, new k4.p(context, 7), qVar, ((i12 >> (C0338.f609 ^ 808)) & (C0169.f193 ^ 356)) | (C0078.f112 ^ (-92)));
                                                                                                C0072.m1564(C0270.m5166(lVarM4370, C0047.f67 ^ 1007), qVar);
                                                                                                C0171.m3270(qVar, false);
                                                                                                C0171.m3270(qVar, true);
                                                                                                C0171.m3270(qVar, false);
                                                                                                C0171.m3270(qVar, false);
                                                                                                m0.x1 x1VarM7533 = C0384.m7533(qVar);
                                                                                                int i81 = 1542285;
                                                                                                while (true) {
                                                                                                    i81 ^= 1542302;
                                                                                                    switch (i81) {
                                                                                                        case 19:
                                                                                                            if (x1VarM7533 != null) {
                                                                                                                i81 = 1543029;
                                                                                                            }
                                                                                                            break;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                            break;
                                                                                                        case 85:
                                                                                                            return;
                                                                                                        case 1003:
                                                                                                            x1VarM7533.f11756d = new i0(mainViewModel, z10, z11, z12, z13, i10, i11, str, j10, map, aVar, i12, i13);
                                                                                                            return;
                                                                                                        default:
                                                                                                            continue;
                                                                                                    }
                                                                                                    i81 = 1542347;
                                                                                                }
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                            i61 = 1515377;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                                i56 = 1513455;
                                                            }
                                                            break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e11) {
                                    z16 = false;
                                }
                            }
                        } catch (Exception e12) {
                            int i82 = 1543060;
                            while (true) {
                                i82 ^= 1543077;
                                switch (i82) {
                                    case 22:
                                        break;
                                    case 49:
                                        i82 = 1543091;
                                        continue;
                                    default:
                                        continue;
                                }
                            }
                        }
                        C0290.m5588(packageManagerM8279, C0004.m89(m4193(), 404, C0259.f339 ^ (-884), 2286), 0);
                        break;
                    } catch (Exception e13) {
                        try {
                            C0290.m5588(packageManagerM8279, C0193.m3702(m4193(), 420, C0140.f166 ^ 87, 3236), 0);
                            int i83 = 51588;
                            while (true) {
                                i83 ^= 51605;
                                switch (i83) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i83 = 51619;
                                        continue;
                                    case 54:
                                        break;
                                    default:
                                        continue;
                                }
                            }
                        } catch (Exception e14) {
                            z15 = false;
                        }
                    }
                    i18 = 50813;
                    break;
                case 239:
                    C0235.m4537();
                    throw null;
                default:
                    continue;
            }
            i19 = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:281:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x051f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x01fb A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x021c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x024f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x030b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x029c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x030b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x029e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x031a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x03e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x03fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x03d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x03fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x03fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x03f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x0416 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x0420 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x0424 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x0433 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x0420 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x041c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x040e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x044e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x0454 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x0458 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x0527 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x0454 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x0450 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x0446 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x0470 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x0494 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x0468 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x048e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x0498 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x0524 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x0498 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x0490 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x0486 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x0506 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x050c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x0510 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x051e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x050c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x0508 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x04fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x030e A[SYNTHETIC] */
    public static final void d(MainViewModel mainViewModel, boolean z10, m0.m mVar, int i10) {
        int i11;
        m0.x1 x1VarM7533;
        int i12;
        Context context;
        m0.g1 g1VarM8775;
        Object objM8078;
        Object objM2417;
        o3 o3VarM2137;
        int i13;
        m0.g1 g1Var;
        y0.l lVarM4370;
        float f10;
        r1.j0 j0VarM4231;
        int iM276;
        m0.r1 r1VarM275;
        t1.j jVarM4451;
        u0.b bVarM6976;
        boolean z11;
        int i14;
        boolean zM7502;
        int i15;
        t1.i iVarM5562;
        boolean zM7503;
        int i16;
        boolean zM14;
        int i17;
        int i18;
        int i19;
        long jM2039;
        Object objM8079;
        int i20;
        Object objM6985;
        int i21;
        boolean zM15;
        int i22;
        long jM389;
        boolean zM16;
        int i23;
        u.w wVarM1134;
        int i24;
        int i25;
        int i26;
        boolean zM4399;
        int i27;
        int i28;
        int i29;
        int i30;
        C0375.m7360(mainViewModel, C0218.m4229(m4193(), 913, C0219.f299 ^ 267, 2102));
        m0.q qVar = (m0.q) mVar;
        C0393.m7698(qVar, 1471043201 ^ C0302.f450);
        int i31 = C0292.f440;
        int i32 = 1616;
        while (true) {
            i32 ^= 1633;
            switch (i32) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i32 = ((i31 ^ 33) & i10) == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM2013 = C0103.m2013(qVar, mainViewModel);
                    int i33 = 1740;
                    while (true) {
                        i33 ^= 1757;
                        switch (i33) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i33 = zM2013 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                i30 = 2;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                i30 = 4;
                                int i34 = 1864;
                                while (true) {
                                    i34 ^= 1881;
                                    switch (i34) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i34 = 48674;
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
                    i11 = (i30 & i10) | (i30 ^ i10);
                    int i35 = 48767;
                    while (true) {
                        i35 ^= 48784;
                        switch (i35) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i35 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    i11 = i10;
                    break;
                default:
                    break;
            }
        }
        int i36 = C0397.f668;
        int i37 = 48891;
        while (true) {
            i37 ^= 48908;
            switch (i37) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    i37 = ((i36 ^ 680) & i10) == 0 ? 49635 : 48953;
                    break;
                case 32495:
                    boolean zM4326 = C0224.m4326(qVar, z10);
                    int i38 = 49666;
                    while (true) {
                        i38 ^= 49683;
                        switch (i38) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i38 = zM4326 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                i29 = 32;
                                int i39 = 49790;
                                while (true) {
                                    i39 ^= 49807;
                                    switch (i39) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i39 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                i29 = 16;
                                break;
                            default:
                                break;
                        }
                    }
                    i11 = (i11 & i29) | (i11 ^ i29);
                    break;
                default:
                    break;
            }
        }
        int i40 = C0265.f345;
        int i41 = 49914;
        while (true) {
            i41 ^= 49931;
            switch (i41) {
                case 497:
                    i41 = ((i40 ^ 965) & i11) == 18 ? 50658 : 50627;
                    break;
                case 1711:
                    break;
                case 1736:
                    context = (Context) C0475.m9256(qVar, C0390.m7636());
                    p2 p2VarM2779 = C0146.m2779(qVar);
                    g1VarM8775 = C0450.m8775(C0271.m5232(mainViewModel), qVar);
                    C0261.m4990(qVar, (-1960790538) ^ C0015.f35);
                    objM8078 = C0411.m8078(qVar);
                    objM2417 = C0125.m2417();
                    o3VarM2137 = C0111.m2137();
                    i13 = 51712;
                    while (true) {
                        i13 ^= 51729;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i13 = objM8078 == objM2417 ? 51805 : 51774;
                                break;
                            case 47:
                                break;
                            case 76:
                                objM8078 = C0173.m3305(C0455.m8876(), o3VarM2137);
                                C0478.m9328(qVar, objM8078);
                                break;
                            default:
                                break;
                        }
                    }
                    g1Var = (m0.g1) objM8078;
                    C0171.m3270(qVar, false);
                    lVarM4370 = C0226.m4370();
                    f10 = 16;
                    y0.o oVarM4788 = C0250.m4788(C0456.m8892(C0143.m2748(), p2VarM2779), f10);
                    C0261.m4990(qVar, 483455045 ^ C0026.f46);
                    j0VarM4231 = C0218.m4231(C0204.m3900(), C0173.m3300(), qVar);
                    C0261.m4990(qVar, (-1323940220) ^ C0141.f167);
                    iM276 = C0014.m276(qVar);
                    r1VarM275 = C0014.m275(qVar);
                    C0014.m280(C0379.m7428());
                    jVarM4451 = C0231.m4451();
                    bVarM6976 = C0355.m6976(oVarM4788);
                    z11 = C0196.m3764(qVar) instanceof m0.d;
                    i14 = 51836;
                    while (true) {
                        i14 ^= 51853;
                        switch (i14) {
                            case 241:
                                i14 = z11 ? 52580 : 52549;
                                break;
                            case 1963:
                                break;
                            case 1992:
                                C0235.m4537();
                                throw null;
                            case 2025:
                                C0100.m1961(qVar);
                                zM7502 = C0382.m7502(qVar);
                                i15 = 52611;
                                while (true) {
                                    i15 ^= 52628;
                                    switch (i15) {
                                        case 23:
                                            if (zM7502) {
                                                i15 = 52704;
                                            }
                                            break;
                                        case 54:
                                            break;
                                        case 85:
                                            C0445.m8685(qVar);
                                            break;
                                        case 116:
                                            C0017.m346(qVar, jVarM4451);
                                            i28 = 52735;
                                            while (true) {
                                                i28 ^= 52752;
                                                switch (i28) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 1007:
                                                        i28 = 52766;
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                            continue;
                                    }
                                    i15 = 52673;
                                }
                                C0089.m1904(qVar, j0VarM4231, C0063.m1208());
                                C0089.m1904(qVar, r1VarM275, C0464.m9055());
                                iVarM5562 = C0289.m5562();
                                zM7503 = C0382.m7502(qVar);
                                i16 = 53510;
                                while (true) {
                                    i16 ^= 53527;
                                    switch (i16) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i16 = !zM7503 ? 53603 : 53572;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 83:
                                            C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                            break;
                                        case 116:
                                            zM4399 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM276));
                                            i27 = 53634;
                                            while (true) {
                                                i27 ^= 53651;
                                                switch (i27) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i27 = !zM4399 ? 53727 : 53696;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                        break;
                                                    case 83:
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
                                C0352.m6912(0, bVarM6976, new l2(qVar), qVar, 2058660329 ^ C0101.f127);
                                C0261.m4990(qVar, (-516043463) ^ C0427.f698);
                                zM14 = C0000.m14((Boolean) C0418.m8214(g1Var));
                                i17 = 53758;
                                while (true) {
                                    i17 ^= 53775;
                                    switch (i17) {
                                        case 1009:
                                            i17 = zM14 ? 54502 : 54471;
                                            break;
                                        case 1703:
                                            break;
                                        case 1736:
                                            i18 = 55432;
                                            while (true) {
                                                i18 ^= 55449;
                                                switch (i18) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i18 = 55463;
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                    case 62:
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 1769:
                                            i26 = 54533;
                                            while (true) {
                                                i26 ^= 54550;
                                                switch (i26) {
                                                    case 19:
                                                        i26 = z10 ? 54626 : 54595;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 85:
                                                        i18 = 55432;
                                                        while (true) {
                                                            i18 ^= 55449;
                                                            switch (i18) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i18 = 55463;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                case 62:
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 116:
                                                        FillElement fillElementM2371 = C0123.m2371();
                                                        long jM6087 = C0314.m6087();
                                                        C0271.m5230(fillElementM2371, C0419.m8237(C0311.f459 ^ 742), C0067.m1299(C0216.m4129(jM6087, 0.1f), qVar, 0), null, C0059.m1134(1, C0216.m4129(jM6087, 0.4f)), C0059.m1122(qVar, 208144052 ^ C0065.f85, new t(g1VarM8775, C0113.f139 ^ (-94))), qVar, 196614, 8);
                                                        C0072.m1564(C0270.m5166(lVarM4370, C0107.f133 ^ (-732)), qVar);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                    i19 = 54657;
                                    while (true) {
                                        i19 ^= 54674;
                                        switch (i19) {
                                            case 19:
                                                i19 = 54688;
                                                continue;
                                                continue;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                C0171.m3270(qVar, false);
                                                C0318.m6169();
                                                C0488.m9503(0, qVar, C0316.m6122(C0436.m8522(m4193(), 922, C0492.f766 ^ (-801), 545), (String) C0418.m8214(g1VarM8775)));
                                                m0.g1 g1VarM8776 = C0450.m8775(C0175.m3347(mainViewModel), qVar);
                                                FillElement fillElementM2372 = C0123.m2371();
                                                jM2039 = C0104.m2039();
                                                C0271.m5230(fillElementM2372, C0419.m8237(f10), C0067.m1299(jM2039, qVar, 0), null, null, C0059.m1122(qVar, 1462285934 ^ C0197.f221, new l0(g1VarM8775, g1VarM8776, mainViewModel, z10, g1Var, context)), qVar, 196703 ^ C0042.f62, C0400.f671 ^ 98);
                                                C0072.m1564(C0270.m5166(lVarM4370, C0111.f137 ^ (-789)), qVar);
                                                C0488.m9503(0, qVar, C0316.m6122(C0088.m1884(m4193(), 937, C0472.f743 ^ (-547), 2246), (String) C0418.m8214(g1VarM8775)));
                                                m0.g1 g1VarM8777 = C0450.m8775(C0250.m4783(mainViewModel), qVar);
                                                m0.g1 g1VarM8778 = C0450.m8775(C0126.m2432(mainViewModel), qVar);
                                                C0261.m4990(qVar, 516030257 ^ C0126.f152);
                                                objM8079 = C0411.m8078(qVar);
                                                i20 = 55556;
                                                while (true) {
                                                    i20 ^= 55573;
                                                    switch (i20) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i20 = objM8079 == objM2417 ? 55649 : 55618;
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 87:
                                                            break;
                                                        case 116:
                                                            objM8079 = C0173.m3305(C0439.m8581(), o3VarM2137);
                                                            C0478.m9328(qVar, objM8079);
                                                            i25 = 55680;
                                                            while (true) {
                                                                i25 ^= 55697;
                                                                switch (i25) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i25 = 56362;
                                                                        continue;
                                                                        continue;
                                                                    case 1467:
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
                                                }
                                                m0.g1 g1Var2 = (m0.g1) objM8079;
                                                objM6985 = C0356.m6985(qVar, false, (-516030231) ^ C0465.f736);
                                                i21 = 56455;
                                                while (true) {
                                                    i21 ^= 56472;
                                                    switch (i21) {
                                                        case 31:
                                                            i21 = objM6985 == objM2417 ? 56548 : 56517;
                                                            break;
                                                        case 62:
                                                            break;
                                                        case 93:
                                                            break;
                                                        case 124:
                                                            objM6985 = C0173.m3305(C0334.m6483(), o3VarM2137);
                                                            C0478.m9328(qVar, objM6985);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                m0.g1 g1Var3 = (m0.g1) objM6985;
                                                C0171.m3270(qVar, false);
                                                zM15 = C0000.m14((Boolean) C0418.m8214(g1VarM8777));
                                                i22 = 56579;
                                                while (true) {
                                                    i22 ^= 56596;
                                                    switch (i22) {
                                                        case 23:
                                                            i22 = zM15 ? 1507472 : 56641;
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 85:
                                                            jM389 = jM2039;
                                                            break;
                                                        case 1564036:
                                                            jM389 = C0019.m389(4279048241L ^ ((long) C0232.f312));
                                                            i24 = 1507503;
                                                            while (true) {
                                                                i24 ^= 1507520;
                                                                switch (i24) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case 111:
                                                                        i24 = 1507534;
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
                                                }
                                                k0.g0 g0VarM1299 = C0067.m1299(jM389, qVar, 0);
                                                e0.e eVarM8237 = C0419.m8237(f10);
                                                zM16 = C0000.m14((Boolean) C0418.m8214(g1VarM8777));
                                                i23 = 1507627;
                                                while (true) {
                                                    i23 ^= 1507644;
                                                    switch (i23) {
                                                        case 23:
                                                            i23 = zM16 ? 1507720 : 1507689;
                                                            break;
                                                        case 85:
                                                            wVarM1134 = null;
                                                            break;
                                                        case 118:
                                                            break;
                                                        case 180:
                                                            wVarM1134 = C0059.m1134(1, C0216.m4129(C0019.m389((-4283215281L) ^ ((long) C0048.f68)), 0.3f));
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0271.m5230(fillElementM2372, eVarM8237, g0VarM1299, null, wVarM1134, C0059.m1122(qVar, 1609596859 ^ C0491.f765, new n0(g1VarM8775, g1VarM8777, mainViewModel, z10, g1Var, g1Var2, g1Var3, g1VarM8778)), qVar, 196927 ^ C0335.f519, C0482.f756 ^ 935);
                                                C0072.m1564(C0270.m5166(lVarM4370, C0238.f318 ^ (-807)), qVar);
                                                C0171.m3270(qVar, false);
                                                C0171.m3270(qVar, true);
                                                C0171.m3270(qVar, false);
                                                C0171.m3270(qVar, false);
                                                break;
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
                    x1VarM7533 = C0384.m7533(qVar);
                    i12 = 1507751;
                    while (true) {
                        i12 ^= 1507768;
                        switch (i12) {
                            case 31:
                                if (x1VarM7533 != null) {
                                    i12 = 1508495;
                                }
                                break;
                            case 1335:
                                x1VarM7533.f11756d = new f0.f0(mainViewModel, z10, i10, 1);
                                return;
                            case 1480:
                                return;
                            case 1513:
                                break;
                            default:
                                continue;
                                continue;
                                continue;
                        }
                        i12 = 1508464;
                    }
                    break;
                case 1769:
                    boolean zM1625 = C0074.m1625(qVar);
                    int i42 = 50689;
                    while (true) {
                        i42 ^= 50706;
                        switch (i42) {
                            case 19:
                                i42 = !zM1625 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                C0470.m9156(qVar);
                                int i43 = 51588;
                                while (true) {
                                    i43 ^= 51605;
                                    switch (i43) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i43 = 51619;
                                            continue;
                                        case 54:
                                            break;
                                        default:
                                            continue;
                                    }
                                    x1VarM7533 = C0384.m7533(qVar);
                                    i12 = 1507751;
                                    while (true) {
                                        i12 ^= 1507768;
                                        switch (i12) {
                                            case 31:
                                                if (x1VarM7533 != null) {
                                                    i12 = 1508495;
                                                }
                                                break;
                                            case 1335:
                                                x1VarM7533.f11756d = new f0.f0(mainViewModel, z10, i10, 1);
                                                return;
                                            case 1480:
                                                return;
                                            case 1513:
                                                break;
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        i12 = 1508464;
                                    }
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                int i44 = 50813;
                                while (true) {
                                    i44 ^= 50830;
                                    switch (i44) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 243:
                                            i44 = 50844;
                                            continue;
                                        default:
                                            continue;
                                    }
                                    context = (Context) C0475.m9256(qVar, C0390.m7636());
                                    p2 p2VarM27710 = C0146.m2779(qVar);
                                    g1VarM8775 = C0450.m8775(C0271.m5232(mainViewModel), qVar);
                                    C0261.m4990(qVar, (-1960790538) ^ C0015.f35);
                                    objM8078 = C0411.m8078(qVar);
                                    objM2417 = C0125.m2417();
                                    o3VarM2137 = C0111.m2137();
                                    i13 = 51712;
                                    while (true) {
                                        i13 ^= 51729;
                                        switch (i13) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (objM8078 == objM2417) {
                                                }
                                                break;
                                            case 47:
                                                break;
                                            case 76:
                                                objM8078 = C0173.m3305(C0455.m8876(), o3VarM2137);
                                                C0478.m9328(qVar, objM8078);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    g1Var = (m0.g1) objM8078;
                                    C0171.m3270(qVar, false);
                                    lVarM4370 = C0226.m4370();
                                    f10 = 16;
                                    y0.o oVarM4789 = C0250.m4788(C0456.m8892(C0143.m2748(), p2VarM27710), f10);
                                    C0261.m4990(qVar, 483455045 ^ C0026.f46);
                                    j0VarM4231 = C0218.m4231(C0204.m3900(), C0173.m3300(), qVar);
                                    C0261.m4990(qVar, (-1323940220) ^ C0141.f167);
                                    iM276 = C0014.m276(qVar);
                                    r1VarM275 = C0014.m275(qVar);
                                    C0014.m280(C0379.m7428());
                                    jVarM4451 = C0231.m4451();
                                    bVarM6976 = C0355.m6976(oVarM4789);
                                    z11 = C0196.m3764(qVar) instanceof m0.d;
                                    i14 = 51836;
                                    while (true) {
                                        i14 ^= 51853;
                                        switch (i14) {
                                            case 241:
                                                if (z11) {
                                                }
                                                break;
                                            case 1963:
                                                break;
                                            case 1992:
                                                C0235.m4537();
                                                throw null;
                                            case 2025:
                                                C0100.m1961(qVar);
                                                zM7502 = C0382.m7502(qVar);
                                                i15 = 52611;
                                                while (true) {
                                                    i15 ^= 52628;
                                                    switch (i15) {
                                                        case 23:
                                                            if (zM7502) {
                                                                i15 = 52704;
                                                            }
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 85:
                                                            C0445.m8685(qVar);
                                                            break;
                                                        case 116:
                                                            C0017.m346(qVar, jVarM4451);
                                                            i28 = 52735;
                                                            while (true) {
                                                                i28 ^= 52752;
                                                                switch (i28) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case 1007:
                                                                        i28 = 52766;
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            continue;
                                                            continue;
                                                    }
                                                    i15 = 52673;
                                                }
                                                C0089.m1904(qVar, j0VarM4231, C0063.m1208());
                                                C0089.m1904(qVar, r1VarM275, C0464.m9055());
                                                iVarM5562 = C0289.m5562();
                                                zM7503 = C0382.m7502(qVar);
                                                i16 = 53510;
                                                while (true) {
                                                    i16 ^= 53527;
                                                    switch (i16) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (!zM7503) {
                                                            }
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 83:
                                                            C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                            break;
                                                        case 116:
                                                            zM4399 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM276));
                                                            i27 = 53634;
                                                            while (true) {
                                                                i27 ^= 53651;
                                                                switch (i27) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (!zM4399) {
                                                                        }
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 76:
                                                                        C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                                        break;
                                                                    case 83:
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
                                                C0352.m6912(0, bVarM6976, new l2(qVar), qVar, 2058660329 ^ C0101.f127);
                                                C0261.m4990(qVar, (-516043463) ^ C0427.f698);
                                                zM14 = C0000.m14((Boolean) C0418.m8214(g1Var));
                                                i17 = 53758;
                                                while (true) {
                                                    i17 ^= 53775;
                                                    switch (i17) {
                                                        case 1009:
                                                            if (zM14) {
                                                            }
                                                            break;
                                                        case 1703:
                                                            break;
                                                        case 1736:
                                                            i18 = 55432;
                                                            while (true) {
                                                                i18 ^= 55449;
                                                                switch (i18) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i18 = 55463;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    case 62:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        case 1769:
                                                            i26 = 54533;
                                                            while (true) {
                                                                i26 ^= 54550;
                                                                switch (i26) {
                                                                    case 19:
                                                                        if (z10) {
                                                                        }
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 85:
                                                                        i18 = 55432;
                                                                        while (true) {
                                                                            i18 ^= 55449;
                                                                            switch (i18) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i18 = 55463;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case 62:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 116:
                                                                        FillElement fillElementM2373 = C0123.m2371();
                                                                        long jM6088 = C0314.m6087();
                                                                        C0271.m5230(fillElementM2373, C0419.m8237(C0311.f459 ^ 742), C0067.m1299(C0216.m4129(jM6088, 0.1f), qVar, 0), null, C0059.m1134(1, C0216.m4129(jM6088, 0.4f)), C0059.m1122(qVar, 208144052 ^ C0065.f85, new t(g1VarM8775, C0113.f139 ^ (-94))), qVar, 196614, 8);
                                                                        C0072.m1564(C0270.m5166(lVarM4370, C0107.f133 ^ (-732)), qVar);
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    i19 = 54657;
                                                    while (true) {
                                                        i19 ^= 54674;
                                                        switch (i19) {
                                                            case 19:
                                                                i19 = 54688;
                                                                continue;
                                                                continue;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                C0171.m3270(qVar, false);
                                                                C0318.m6169();
                                                                C0488.m9503(0, qVar, C0316.m6122(C0436.m8522(m4193(), 922, C0492.f766 ^ (-801), 545), (String) C0418.m8214(g1VarM8775)));
                                                                m0.g1 g1VarM8779 = C0450.m8775(C0175.m3347(mainViewModel), qVar);
                                                                FillElement fillElementM2374 = C0123.m2371();
                                                                jM2039 = C0104.m2039();
                                                                C0271.m5230(fillElementM2374, C0419.m8237(f10), C0067.m1299(jM2039, qVar, 0), null, null, C0059.m1122(qVar, 1462285934 ^ C0197.f221, new l0(g1VarM8775, g1VarM8779, mainViewModel, z10, g1Var, context)), qVar, 196703 ^ C0042.f62, C0400.f671 ^ 98);
                                                                C0072.m1564(C0270.m5166(lVarM4370, C0111.f137 ^ (-789)), qVar);
                                                                C0488.m9503(0, qVar, C0316.m6122(C0088.m1884(m4193(), 937, C0472.f743 ^ (-547), 2246), (String) C0418.m8214(g1VarM8775)));
                                                                m0.g1 g1VarM87710 = C0450.m8775(C0250.m4783(mainViewModel), qVar);
                                                                m0.g1 g1VarM87711 = C0450.m8775(C0126.m2432(mainViewModel), qVar);
                                                                C0261.m4990(qVar, 516030257 ^ C0126.f152);
                                                                objM8079 = C0411.m8078(qVar);
                                                                i20 = 55556;
                                                                while (true) {
                                                                    i20 ^= 55573;
                                                                    switch (i20) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (objM8079 == objM2417) {
                                                                            }
                                                                            break;
                                                                        case 54:
                                                                            break;
                                                                        case 87:
                                                                            break;
                                                                        case 116:
                                                                            objM8079 = C0173.m3305(C0439.m8581(), o3VarM2137);
                                                                            C0478.m9328(qVar, objM8079);
                                                                            i25 = 55680;
                                                                            while (true) {
                                                                                i25 ^= 55697;
                                                                                switch (i25) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i25 = 56362;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 1467:
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
                                                                }
                                                                m0.g1 g1Var4 = (m0.g1) objM8079;
                                                                objM6985 = C0356.m6985(qVar, false, (-516030231) ^ C0465.f736);
                                                                i21 = 56455;
                                                                while (true) {
                                                                    i21 ^= 56472;
                                                                    switch (i21) {
                                                                        case 31:
                                                                            if (objM6985 == objM2417) {
                                                                            }
                                                                            break;
                                                                        case 62:
                                                                            break;
                                                                        case 93:
                                                                            break;
                                                                        case 124:
                                                                            objM6985 = C0173.m3305(C0334.m6483(), o3VarM2137);
                                                                            C0478.m9328(qVar, objM6985);
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                m0.g1 g1Var5 = (m0.g1) objM6985;
                                                                C0171.m3270(qVar, false);
                                                                zM15 = C0000.m14((Boolean) C0418.m8214(g1VarM87710));
                                                                i22 = 56579;
                                                                while (true) {
                                                                    i22 ^= 56596;
                                                                    switch (i22) {
                                                                        case 23:
                                                                            if (zM15) {
                                                                            }
                                                                            break;
                                                                        case 54:
                                                                            break;
                                                                        case 85:
                                                                            jM389 = jM2039;
                                                                            break;
                                                                        case 1564036:
                                                                            jM389 = C0019.m389(4279048241L ^ ((long) C0232.f312));
                                                                            i24 = 1507503;
                                                                            while (true) {
                                                                                i24 ^= 1507520;
                                                                                switch (i24) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case 111:
                                                                                        i24 = 1507534;
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
                                                                }
                                                                k0.g0 g0VarM12910 = C0067.m1299(jM389, qVar, 0);
                                                                e0.e eVarM8238 = C0419.m8237(f10);
                                                                zM16 = C0000.m14((Boolean) C0418.m8214(g1VarM87710));
                                                                i23 = 1507627;
                                                                while (true) {
                                                                    i23 ^= 1507644;
                                                                    switch (i23) {
                                                                        case 23:
                                                                            if (zM16) {
                                                                            }
                                                                            break;
                                                                        case 85:
                                                                            wVarM1134 = null;
                                                                            break;
                                                                        case 118:
                                                                            break;
                                                                        case 180:
                                                                            wVarM1134 = C0059.m1134(1, C0216.m4129(C0019.m389((-4283215281L) ^ ((long) C0048.f68)), 0.3f));
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0271.m5230(fillElementM2374, eVarM8238, g0VarM12910, null, wVarM1134, C0059.m1122(qVar, 1609596859 ^ C0491.f765, new n0(g1VarM8775, g1VarM87710, mainViewModel, z10, g1Var, g1Var4, g1Var5, g1VarM87711)), qVar, 196927 ^ C0335.f519, C0482.f756 ^ 935);
                                                                C0072.m1564(C0270.m5166(lVarM4370, C0238.f318 ^ (-807)), qVar);
                                                                C0171.m3270(qVar, false);
                                                                C0171.m3270(qVar, true);
                                                                C0171.m3270(qVar, false);
                                                                C0171.m3270(qVar, false);
                                                                break;
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
                                    x1VarM7533 = C0384.m7533(qVar);
                                    i12 = 1507751;
                                    while (true) {
                                        i12 ^= 1507768;
                                        switch (i12) {
                                            case 31:
                                                if (x1VarM7533 != null) {
                                                    i12 = 1508495;
                                                }
                                                break;
                                            case 1335:
                                                x1VarM7533.f11756d = new f0.f0(mainViewModel, z10, i10, 1);
                                                return;
                                            case 1480:
                                                return;
                                            case 1513:
                                                break;
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        i12 = 1508464;
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
    }

    /* JADX WARN: Code duplicated, block: B:281:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x0641 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x020b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x023f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x063c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x0331 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x0327 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x032d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x0331 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x032d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x031f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x03c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x03ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x0637 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x03ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x03e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x03ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x0400 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x03ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x03e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x03fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x0412 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x03f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x0427 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x042b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x0431 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x0452 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x042d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x0427 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x041f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x0448 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x044e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x0452 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x0457 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x044e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x044a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x0440 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x04a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x04ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x04b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x04f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x04ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x0498 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x04f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x04f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x04e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x0514 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x051a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x051e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x051a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:461:0x0516 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x050c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x056a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x05dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:0x0562 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x05d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x0623 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x0627 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x0636 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x0623 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x05d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x05ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x040e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x0406 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(MainViewModel mainViewModel, m0.m mVar, int i10) {
        int i11;
        m0.x1 x1VarM7533;
        int i12;
        m0.g1 g1VarM8775;
        m0.g1 g1VarM8776;
        boolean zM2013;
        Object objM8078;
        int i13;
        int iM8515;
        y0.l lVarM4370;
        float f10;
        r1.j0 j0VarM4231;
        int iM276;
        m0.r1 r1VarM275;
        t1.j jVarM4451;
        u0.b bVarM6976;
        boolean z10;
        int i14;
        boolean zM7502;
        int i15;
        t1.i iVarM1208;
        t1.i iVarM9055;
        t1.i iVarM5562;
        boolean zM7503;
        int i16;
        FillElement fillElementM2371;
        r1.j0 j0VarM4288;
        int iM277;
        m0.r1 r1VarM276;
        u0.b bVarM6977;
        int i17;
        boolean zM7504;
        int i18;
        boolean zM7505;
        int i19;
        int i20;
        r1.j0 j0VarM4289;
        int iM278;
        m0.r1 r1VarM277;
        u0.b bVarM6978;
        int i21;
        boolean zM7506;
        int i22;
        int i23;
        int i24;
        boolean zM7507;
        int i25;
        boolean zM9582;
        int i26;
        boolean zM7153;
        int i27;
        int i28;
        int i29;
        boolean zM4399;
        int i30;
        boolean zM43910;
        int i31;
        int i32;
        boolean zM43911;
        int i33;
        int i34;
        int i35;
        Object objM2417;
        int i36;
        int i37;
        C0375.m7360(mainViewModel, C0122.m2349(m4193(), 952, C0244.f324 ^ 525, 1780));
        m0.q qVar = (m0.q) mVar;
        C0393.m7698(qVar, 1936175425 ^ C0190.f214);
        int i38 = C0170.f194;
        int i39 = 1616;
        while (true) {
            i39 ^= 1633;
            switch (i39) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i39 = ((i38 ^ (-155)) & i10) == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM2014 = C0103.m2013(qVar, mainViewModel);
                    int i40 = 1740;
                    while (true) {
                        i40 ^= 1757;
                        switch (i40) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i40 = zM2014 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                i37 = 2;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                i37 = 4;
                                int i41 = 1864;
                                while (true) {
                                    i41 ^= 1881;
                                    switch (i41) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i41 = 48674;
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
                    i11 = (i37 & i10) | (i37 ^ i10);
                    int i42 = 48767;
                    while (true) {
                        i42 ^= 48784;
                        switch (i42) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i42 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    i11 = i10;
                    break;
                default:
                    break;
            }
        }
        int i43 = 48891;
        while (true) {
            i43 ^= 48908;
            switch (i43) {
                case 22:
                    break;
                case 53:
                    p2 p2VarM2779 = C0146.m2779(qVar);
                    g1VarM8775 = C0450.m8775(C0178.m3401(mainViewModel), qVar);
                    g1VarM8776 = C0450.m8775(C0271.m5232(mainViewModel), qVar);
                    C0405.m7954(C0012.m238(), new o0(mainViewModel, null), qVar);
                    List list = (List) C0418.m8214(g1VarM8775);
                    C0261.m4990(qVar, 736338885 ^ C0221.f301);
                    zM2013 = C0103.m2013(qVar, list);
                    objM8078 = C0411.m8078(qVar);
                    i13 = 50689;
                    while (true) {
                        i13 ^= 50706;
                        switch (i13) {
                            case 19:
                                i13 = !zM2013 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                objM8078 = C0452.m8818(mainViewModel);
                                C0478.m9328(qVar, objM8078);
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                objM2417 = C0125.m2417();
                                i36 = 50813;
                                while (true) {
                                    i36 ^= 50830;
                                    switch (i36) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 53:
                                            break;
                                        case 243:
                                            i36 = objM8078 == objM2417 ? 51557 : 50875;
                                            break;
                                        case 4075:
                                            objM8078 = C0452.m8818(mainViewModel);
                                            C0478.m9328(qVar, objM8078);
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
                    q8.f fVar = (q8.f) objM8078;
                    C0171.m3270(qVar, false);
                    iM8515 = C0435.m8515((Number) C0004.m84(fVar));
                    C0435.m8515((Number) C0279.m5403(fVar));
                    lVarM4370 = C0226.m4370();
                    y0.o oVarM8892 = C0456.m8892(C0143.m2748(), p2VarM2779);
                    f10 = C0462.f733 ^ 293;
                    y0.o oVarM4788 = C0250.m4788(oVarM8892, f10);
                    C0261.m4990(qVar, (-483455147) ^ C0177.f201);
                    j0VarM4231 = C0218.m4231(C0204.m3900(), C0173.m3300(), qVar);
                    C0261.m4990(qVar, 1323940651 ^ C0341.f612);
                    iM276 = C0014.m276(qVar);
                    r1VarM275 = C0014.m275(qVar);
                    C0014.m280(C0379.m7428());
                    jVarM4451 = C0231.m4451();
                    bVarM6976 = C0355.m6976(oVarM4788);
                    z10 = C0196.m3764(qVar) instanceof m0.d;
                    i14 = 51588;
                    while (true) {
                        i14 ^= 51605;
                        switch (i14) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i14 = z10 ? 51681 : 51650;
                                break;
                            case 54:
                                break;
                            case 87:
                                C0235.m4537();
                                throw null;
                            case 116:
                                C0100.m1961(qVar);
                                zM7502 = C0382.m7502(qVar);
                                i15 = 51712;
                                while (true) {
                                    i15 ^= 51729;
                                    switch (i15) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i15 = zM7502 ? 51805 : 51774;
                                            break;
                                        case 47:
                                            C0445.m8685(qVar);
                                            break;
                                        case 76:
                                            C0017.m346(qVar, jVarM4451);
                                            i35 = 51836;
                                            while (true) {
                                                i35 ^= 51853;
                                                switch (i35) {
                                                    case 241:
                                                        i35 = 52518;
                                                        continue;
                                                        continue;
                                                    case 1963:
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
                                }
                                iVarM1208 = C0063.m1208();
                                C0089.m1904(qVar, j0VarM4231, iVarM1208);
                                iVarM9055 = C0464.m9055();
                                C0089.m1904(qVar, r1VarM275, iVarM9055);
                                iVarM5562 = C0289.m5562();
                                zM7503 = C0382.m7502(qVar);
                                i16 = 52611;
                                while (true) {
                                    i16 ^= 52628;
                                    switch (i16) {
                                        case 23:
                                            i16 = !zM7503 ? 52704 : 52673;
                                            break;
                                        case 54:
                                            break;
                                        case 85:
                                            C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                            break;
                                        case 116:
                                            zM43911 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM276));
                                            i33 = 52735;
                                            while (true) {
                                                i33 ^= 52752;
                                                switch (i33) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case 1007:
                                                        i33 = !zM43911 ? 53479 : 52797;
                                                        break;
                                                    case 7927:
                                                        i34 = 53510;
                                                        while (true) {
                                                            i34 ^= 53527;
                                                            switch (i34) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i34 = 53541;
                                                                    continue;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                            }
                                                            C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                            break;
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
                                C0352.m6912(0, bVarM6976, new l2(qVar), qVar, 2058660215 ^ C0265.f345);
                                C0318.m6169();
                                C0488.m9503(0, qVar, C0316.m6122(C0344.m6750(m4193(), 961, C0250.f330 ^ (-143), 1141), (String) C0418.m8214(g1VarM8776)));
                                fillElementM2371 = C0123.m2371();
                                y.h hVarM1683 = C0078.m1683(C0323.f471 ^ (-990));
                                C0261.m4990(qVar, 693286374 ^ C0268.f348);
                                j0VarM4288 = C0222.m4288(hVarM1683, C0392.m7688(), qVar);
                                C0261.m4990(qVar, 1323940438 ^ C0227.f307);
                                iM277 = C0014.m276(qVar);
                                r1VarM276 = C0014.m275(qVar);
                                bVarM6977 = C0355.m6976(fillElementM2371);
                                i17 = 53634;
                                while (true) {
                                    i17 ^= 53651;
                                    switch (i17) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i17 = z10 ? 53727 : 53696;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            C0100.m1961(qVar);
                                            zM7504 = C0382.m7502(qVar);
                                            i18 = 53758;
                                            while (true) {
                                                i18 ^= 53775;
                                                switch (i18) {
                                                    case 1009:
                                                        i18 = zM7504 ? 54502 : 54471;
                                                        break;
                                                    case 1703:
                                                        break;
                                                    case 1736:
                                                        C0445.m8685(qVar);
                                                        break;
                                                    case 1769:
                                                        C0017.m346(qVar, jVarM4451);
                                                        i32 = 54533;
                                                        while (true) {
                                                            i32 ^= 54550;
                                                            switch (i32) {
                                                                case 19:
                                                                    i32 = 54564;
                                                                    continue;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                            }
                                            C0089.m1904(qVar, j0VarM4288, iVarM1208);
                                            C0089.m1904(qVar, r1VarM276, iVarM9055);
                                            zM7505 = C0382.m7502(qVar);
                                            i19 = 54657;
                                            while (true) {
                                                i19 ^= 54674;
                                                switch (i19) {
                                                    case 19:
                                                        i19 = !zM7505 ? 55401 : 54719;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        C0133.m2574(iM277, qVar, iM277, iVarM5562);
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 3579:
                                                        zM43910 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM277));
                                                        i31 = 55432;
                                                        while (true) {
                                                            i31 ^= 55449;
                                                            switch (i31) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i31 = !zM43910 ? 55525 : 55494;
                                                                    break;
                                                                case 62:
                                                                    break;
                                                                case 95:
                                                                    break;
                                                                case 124:
                                                                    C0133.m2574(iM277, qVar, iM277, iVarM5562);
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
                                            C0045.m869(bVarM6977, new l2(qVar), qVar, C0057.m1083(0));
                                            i20 = (-2058659900) ^ C0334.f518;
                                            C0261.m4990(qVar, i20);
                                            C0158.m3010(C0129.m2486(), C0316.m6122(C0175.m3335(m4193(), 972, C0221.f301 ^ (-739), 1876), (String) C0418.m8214(g1VarM8776)), C0276.m5318(iM8515), C0276.m5325(), C0221.m4269(), qVar, 0, 0);
                                            C0016.m325(qVar, false, true, false, false);
                                            C0072.m1564(C0270.m5166(lVarM4370, C0444.f715 ^ (-836)), qVar);
                                            y.f fVarM6623 = C0337.m6623();
                                            y0.f fVarM6849 = C0349.m6849();
                                            C0261.m4990(qVar, 693286083 ^ C0275.f391);
                                            j0VarM4289 = C0222.m4288(fVarM6623, fVarM6849, qVar);
                                            C0261.m4990(qVar, 1323939987 ^ C0267.f347);
                                            iM278 = C0014.m276(qVar);
                                            r1VarM277 = C0014.m275(qVar);
                                            bVarM6978 = C0355.m6976(fillElementM2371);
                                            i21 = 55556;
                                            while (true) {
                                                i21 ^= 55573;
                                                switch (i21) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i21 = z10 ? 55649 : 55618;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 87:
                                                        C0235.m4537();
                                                        throw null;
                                                    case 116:
                                                        C0100.m1961(qVar);
                                                        zM7506 = C0382.m7502(qVar);
                                                        i22 = 55680;
                                                        while (true) {
                                                            i22 ^= 55697;
                                                            switch (i22) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i22 = zM7506 ? 56424 : 56393;
                                                                    break;
                                                                case 1467:
                                                                    break;
                                                                case 1496:
                                                                    C0445.m8685(qVar);
                                                                    i23 = 56579;
                                                                    while (true) {
                                                                        i23 ^= 56596;
                                                                        switch (i23) {
                                                                            case 23:
                                                                                i23 = 56610;
                                                                                continue;
                                                                                continue;
                                                                            case 54:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1529:
                                                                    C0017.m346(qVar, jVarM4451);
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        i24 = 56455;
                                                        while (true) {
                                                            i24 ^= 56472;
                                                            switch (i24) {
                                                                case 31:
                                                                    i24 = 56486;
                                                                    continue;
                                                                    continue;
                                                                case 62:
                                                                    C0089.m1904(qVar, j0VarM4289, iVarM1208);
                                                                    C0089.m1904(qVar, r1VarM277, iVarM9055);
                                                                    zM7507 = C0382.m7502(qVar);
                                                                    i25 = 1507503;
                                                                    while (true) {
                                                                        i25 ^= 1507520;
                                                                        switch (i25) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                C0133.m2574(iM278, qVar, iM278, iVarM5562);
                                                                                break;
                                                                            case 111:
                                                                                i25 = !zM7507 ? 1507596 : 1507565;
                                                                                break;
                                                                            case 460:
                                                                                zM4399 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM278));
                                                                                i30 = 1507627;
                                                                                while (true) {
                                                                                    i30 ^= 1507644;
                                                                                    switch (i30) {
                                                                                        case 23:
                                                                                            i30 = !zM4399 ? 1507720 : 1507689;
                                                                                            break;
                                                                                        case 85:
                                                                                            break;
                                                                                        case 118:
                                                                                            break;
                                                                                        case 180:
                                                                                            C0133.m2574(iM278, qVar, iM278, iVarM5562);
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
                                                                    C0352.m6912(0, bVarM6978, new l2(qVar), qVar, i20);
                                                                    C0488.m9503(0, qVar, C0316.m6122(C0434.m8500(m4193(), 980, C0061.f81 ^ 824, 1461), (String) C0418.m8214(g1VarM8776)));
                                                                    C0261.m4990(qVar, 1166861920 ^ C0326.f474);
                                                                    zM9582 = C0492.m9582((List) C0418.m8214(g1VarM8775));
                                                                    i26 = 1507751;
                                                                    while (true) {
                                                                        i26 ^= 1507768;
                                                                        switch (i26) {
                                                                            case 31:
                                                                                i26 = ((((zM9582 ? 1 : 0) ^ '\uffff') & 1) | ((zM9582 ? 1 : 0) & '\ufffe')) != 0 ? 1508495 : 1508464;
                                                                                break;
                                                                            case 1335:
                                                                                C0408.m8011(new c5.j(mainViewModel, C0187.f211 ^ (-330)), null, false, null, null, null, null, null, null, C0059.m1122(qVar, (-1796316708) ^ C0048.f68, new t(g1VarM8776, C0146.f171 ^ (-433))), qVar, 805306368, 510);
                                                                                i29 = 1508526;
                                                                                while (true) {
                                                                                    i29 ^= 1508543;
                                                                                    switch (i29) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i29 = 1508557;
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
                                                                            case 1480:
                                                                                break;
                                                                            case 1513:
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    C0016.m325(qVar, false, false, true, false);
                                                                    C0171.m3270(qVar, false);
                                                                    zM7153 = C0364.m7153((List) C0418.m8214(g1VarM8775));
                                                                    i27 = 1508650;
                                                                    while (true) {
                                                                        i27 ^= 1508667;
                                                                        switch (i27) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i27 = zM7153 ? 1509394 : 1508712;
                                                                                break;
                                                                            case 83:
                                                                                C0261.m4990(qVar, (-1166859413) ^ C0211.f235);
                                                                                C0271.m5230(fillElementM2371, C0419.m8237(f10), C0067.m1299(C0104.m2039(), qVar, 0), null, null, C0059.m1122(qVar, (-1828931410) ^ C0180.f204, new t(g1VarM8775, C0007.f27 ^ (-423))), qVar, 196883 ^ C0393.f664, C0202.f226 ^ (-445));
                                                                                C0171.m3270(qVar, false);
                                                                                break;
                                                                            case 114:
                                                                                break;
                                                                            case 3369:
                                                                                C0261.m4990(qVar, (-1166861604) ^ C0379.f650);
                                                                                C0271.m5230(fillElementM2371, C0419.m8237(f10), C0067.m1299(C0104.m2039(), qVar, 0), null, null, C0059.m1122(qVar, (-2036358968) ^ C0450.f721, new t(g1VarM8776, C0162.f186 ^ 833)), qVar, 196767 ^ C0085.f119, C0168.f192 ^ 936);
                                                                                C0171.m3270(qVar, false);
                                                                                i28 = 1509425;
                                                                                while (true) {
                                                                                    i28 ^= 1509442;
                                                                                    switch (i28) {
                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 115:
                                                                                            i28 = 1509456;
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
                                                                    }
                                                                    C0072.m1564(C0270.m5166(lVarM4370, f10), qVar);
                                                                    int i44 = C0376.f647 ^ 818;
                                                                    C0403.m7922(new c5.j(mainViewModel, i44), fillElementM2371, false, C0419.m8237(i44), null, null, C0059.m1134(1, C0216.m4129(C0001.m41(), 0.3f)), null, null, C0388.m7604(), qVar, 805306416, 436);
                                                                    C0072.m1564(C0270.m5166(lVarM4370, C0117.f143 ^ 927), qVar);
                                                                    C0171.m3270(qVar, false);
                                                                    C0171.m3270(qVar, true);
                                                                    C0171.m3270(qVar, false);
                                                                    C0171.m3270(qVar, false);
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
                                            }
                                            break;
                                        case 83:
                                            C0235.m4537();
                                            throw null;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    x1VarM7533 = C0384.m7533(qVar);
                    i12 = 1509549;
                    while (true) {
                        i12 ^= 1509566;
                        switch (i12) {
                            case 19:
                                if (x1VarM7533 != null) {
                                    i12 = 1509642;
                                }
                                break;
                            case 85:
                                return;
                            case 114:
                                break;
                            case 436:
                                x1VarM7533.f11756d = new c5.k(mainViewModel, i10, C0322.f470 ^ 121);
                                return;
                            default:
                                continue;
                                continue;
                                continue;
                        }
                        i12 = 1509611;
                    }
                    break;
                case 503:
                    i43 = ((i11 ^ (-12)) & i11) == 2 ? 49635 : 48953;
                    break;
                case 32495:
                    boolean zM1625 = C0074.m1625(qVar);
                    int i45 = 49666;
                    while (true) {
                        i45 ^= 49683;
                        switch (i45) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i45 = !zM1625 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                int i46 = 49790;
                                while (true) {
                                    i46 ^= 49807;
                                    switch (i46) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i46 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                    p2 p2VarM27710 = C0146.m2779(qVar);
                                    g1VarM8775 = C0450.m8775(C0178.m3401(mainViewModel), qVar);
                                    g1VarM8776 = C0450.m8775(C0271.m5232(mainViewModel), qVar);
                                    C0405.m7954(C0012.m238(), new o0(mainViewModel, null), qVar);
                                    List list2 = (List) C0418.m8214(g1VarM8775);
                                    C0261.m4990(qVar, 736338885 ^ C0221.f301);
                                    zM2013 = C0103.m2013(qVar, list2);
                                    objM8078 = C0411.m8078(qVar);
                                    i13 = 50689;
                                    while (true) {
                                        i13 ^= 50706;
                                        switch (i13) {
                                            case 19:
                                                if (!zM2013) {
                                                }
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                objM8078 = C0452.m8818(mainViewModel);
                                                C0478.m9328(qVar, objM8078);
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                objM2417 = C0125.m2417();
                                                i36 = 50813;
                                                while (true) {
                                                    i36 ^= 50830;
                                                    switch (i36) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 53:
                                                            break;
                                                        case 243:
                                                            if (objM8078 == objM2417) {
                                                            }
                                                            break;
                                                        case 4075:
                                                            objM8078 = C0452.m8818(mainViewModel);
                                                            C0478.m9328(qVar, objM8078);
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
                                    q8.f fVar2 = (q8.f) objM8078;
                                    C0171.m3270(qVar, false);
                                    iM8515 = C0435.m8515((Number) C0004.m84(fVar2));
                                    C0435.m8515((Number) C0279.m5403(fVar2));
                                    lVarM4370 = C0226.m4370();
                                    y0.o oVarM8893 = C0456.m8892(C0143.m2748(), p2VarM27710);
                                    f10 = C0462.f733 ^ 293;
                                    y0.o oVarM4789 = C0250.m4788(oVarM8893, f10);
                                    C0261.m4990(qVar, (-483455147) ^ C0177.f201);
                                    j0VarM4231 = C0218.m4231(C0204.m3900(), C0173.m3300(), qVar);
                                    C0261.m4990(qVar, 1323940651 ^ C0341.f612);
                                    iM276 = C0014.m276(qVar);
                                    r1VarM275 = C0014.m275(qVar);
                                    C0014.m280(C0379.m7428());
                                    jVarM4451 = C0231.m4451();
                                    bVarM6976 = C0355.m6976(oVarM4789);
                                    z10 = C0196.m3764(qVar) instanceof m0.d;
                                    i14 = 51588;
                                    while (true) {
                                        i14 ^= 51605;
                                        switch (i14) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (z10) {
                                                }
                                                break;
                                            case 54:
                                                break;
                                            case 87:
                                                C0235.m4537();
                                                throw null;
                                            case 116:
                                                C0100.m1961(qVar);
                                                zM7502 = C0382.m7502(qVar);
                                                i15 = 51712;
                                                while (true) {
                                                    i15 ^= 51729;
                                                    switch (i15) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (zM7502) {
                                                            }
                                                            break;
                                                        case 47:
                                                            C0445.m8685(qVar);
                                                            break;
                                                        case 76:
                                                            C0017.m346(qVar, jVarM4451);
                                                            i35 = 51836;
                                                            while (true) {
                                                                i35 ^= 51853;
                                                                switch (i35) {
                                                                    case 241:
                                                                        i35 = 52518;
                                                                        continue;
                                                                        continue;
                                                                    case 1963:
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
                                                }
                                                iVarM1208 = C0063.m1208();
                                                C0089.m1904(qVar, j0VarM4231, iVarM1208);
                                                iVarM9055 = C0464.m9055();
                                                C0089.m1904(qVar, r1VarM275, iVarM9055);
                                                iVarM5562 = C0289.m5562();
                                                zM7503 = C0382.m7502(qVar);
                                                i16 = 52611;
                                                while (true) {
                                                    i16 ^= 52628;
                                                    switch (i16) {
                                                        case 23:
                                                            if (!zM7503) {
                                                            }
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 85:
                                                            C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                            break;
                                                        case 116:
                                                            zM43911 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM276));
                                                            i33 = 52735;
                                                            while (true) {
                                                                i33 ^= 52752;
                                                                switch (i33) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        break;
                                                                    case 1007:
                                                                        if (!zM43911) {
                                                                        }
                                                                        break;
                                                                    case 7927:
                                                                        i34 = 53510;
                                                                        while (true) {
                                                                            i34 ^= 53527;
                                                                            switch (i34) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i34 = 53541;
                                                                                    continue;
                                                                                    continue;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                            C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                                            break;
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
                                                C0352.m6912(0, bVarM6976, new l2(qVar), qVar, 2058660215 ^ C0265.f345);
                                                C0318.m6169();
                                                C0488.m9503(0, qVar, C0316.m6122(C0344.m6750(m4193(), 961, C0250.f330 ^ (-143), 1141), (String) C0418.m8214(g1VarM8776)));
                                                fillElementM2371 = C0123.m2371();
                                                y.h hVarM1684 = C0078.m1683(C0323.f471 ^ (-990));
                                                C0261.m4990(qVar, 693286374 ^ C0268.f348);
                                                j0VarM4288 = C0222.m4288(hVarM1684, C0392.m7688(), qVar);
                                                C0261.m4990(qVar, 1323940438 ^ C0227.f307);
                                                iM277 = C0014.m276(qVar);
                                                r1VarM276 = C0014.m275(qVar);
                                                bVarM6977 = C0355.m6976(fillElementM2371);
                                                i17 = 53634;
                                                while (true) {
                                                    i17 ^= 53651;
                                                    switch (i17) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (z10) {
                                                            }
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 76:
                                                            C0100.m1961(qVar);
                                                            zM7504 = C0382.m7502(qVar);
                                                            i18 = 53758;
                                                            while (true) {
                                                                i18 ^= 53775;
                                                                switch (i18) {
                                                                    case 1009:
                                                                        if (zM7504) {
                                                                        }
                                                                        break;
                                                                    case 1703:
                                                                        break;
                                                                    case 1736:
                                                                        C0445.m8685(qVar);
                                                                        break;
                                                                    case 1769:
                                                                        C0017.m346(qVar, jVarM4451);
                                                                        i32 = 54533;
                                                                        while (true) {
                                                                            i32 ^= 54550;
                                                                            switch (i32) {
                                                                                case 19:
                                                                                    i32 = 54564;
                                                                                    continue;
                                                                                    continue;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                                            }
                                                            C0089.m1904(qVar, j0VarM4288, iVarM1208);
                                                            C0089.m1904(qVar, r1VarM276, iVarM9055);
                                                            zM7505 = C0382.m7502(qVar);
                                                            i19 = 54657;
                                                            while (true) {
                                                                i19 ^= 54674;
                                                                switch (i19) {
                                                                    case 19:
                                                                        if (!zM7505) {
                                                                        }
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        C0133.m2574(iM277, qVar, iM277, iVarM5562);
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 3579:
                                                                        zM43910 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM277));
                                                                        i31 = 55432;
                                                                        while (true) {
                                                                            i31 ^= 55449;
                                                                            switch (i31) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    if (!zM43910) {
                                                                                    }
                                                                                    break;
                                                                                case 62:
                                                                                    break;
                                                                                case 95:
                                                                                    break;
                                                                                case 124:
                                                                                    C0133.m2574(iM277, qVar, iM277, iVarM5562);
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
                                                            C0045.m869(bVarM6977, new l2(qVar), qVar, C0057.m1083(0));
                                                            i20 = (-2058659900) ^ C0334.f518;
                                                            C0261.m4990(qVar, i20);
                                                            C0158.m3010(C0129.m2486(), C0316.m6122(C0175.m3335(m4193(), 972, C0221.f301 ^ (-739), 1876), (String) C0418.m8214(g1VarM8776)), C0276.m5318(iM8515), C0276.m5325(), C0221.m4269(), qVar, 0, 0);
                                                            C0016.m325(qVar, false, true, false, false);
                                                            C0072.m1564(C0270.m5166(lVarM4370, C0444.f715 ^ (-836)), qVar);
                                                            y.f fVarM6624 = C0337.m6623();
                                                            y0.f fVarM68410 = C0349.m6849();
                                                            C0261.m4990(qVar, 693286083 ^ C0275.f391);
                                                            j0VarM4289 = C0222.m4288(fVarM6624, fVarM68410, qVar);
                                                            C0261.m4990(qVar, 1323939987 ^ C0267.f347);
                                                            iM278 = C0014.m276(qVar);
                                                            r1VarM277 = C0014.m275(qVar);
                                                            bVarM6978 = C0355.m6976(fillElementM2371);
                                                            i21 = 55556;
                                                            while (true) {
                                                                i21 ^= 55573;
                                                                switch (i21) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (z10) {
                                                                        }
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 87:
                                                                        C0235.m4537();
                                                                        throw null;
                                                                    case 116:
                                                                        C0100.m1961(qVar);
                                                                        zM7506 = C0382.m7502(qVar);
                                                                        i22 = 55680;
                                                                        while (true) {
                                                                            i22 ^= 55697;
                                                                            switch (i22) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    if (zM7506) {
                                                                                    }
                                                                                    break;
                                                                                case 1467:
                                                                                    break;
                                                                                case 1496:
                                                                                    C0445.m8685(qVar);
                                                                                    i23 = 56579;
                                                                                    while (true) {
                                                                                        i23 ^= 56596;
                                                                                        switch (i23) {
                                                                                            case 23:
                                                                                                i23 = 56610;
                                                                                                continue;
                                                                                                continue;
                                                                                            case 54:
                                                                                                break;
                                                                                            default:
                                                                                                continue;
                                                                                                continue;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 1529:
                                                                                    C0017.m346(qVar, jVarM4451);
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        i24 = 56455;
                                                                        while (true) {
                                                                            i24 ^= 56472;
                                                                            switch (i24) {
                                                                                case 31:
                                                                                    i24 = 56486;
                                                                                    continue;
                                                                                    continue;
                                                                                case 62:
                                                                                    C0089.m1904(qVar, j0VarM4289, iVarM1208);
                                                                                    C0089.m1904(qVar, r1VarM277, iVarM9055);
                                                                                    zM7507 = C0382.m7502(qVar);
                                                                                    i25 = 1507503;
                                                                                    while (true) {
                                                                                        i25 ^= 1507520;
                                                                                        switch (i25) {
                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                C0133.m2574(iM278, qVar, iM278, iVarM5562);
                                                                                                break;
                                                                                            case 111:
                                                                                                if (!zM7507) {
                                                                                                }
                                                                                                break;
                                                                                            case 460:
                                                                                                zM4399 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM278));
                                                                                                i30 = 1507627;
                                                                                                while (true) {
                                                                                                    i30 ^= 1507644;
                                                                                                    switch (i30) {
                                                                                                        case 23:
                                                                                                            if (!zM4399) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 85:
                                                                                                            break;
                                                                                                        case 118:
                                                                                                            break;
                                                                                                        case 180:
                                                                                                            C0133.m2574(iM278, qVar, iM278, iVarM5562);
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
                                                                                    C0352.m6912(0, bVarM6978, new l2(qVar), qVar, i20);
                                                                                    C0488.m9503(0, qVar, C0316.m6122(C0434.m8500(m4193(), 980, C0061.f81 ^ 824, 1461), (String) C0418.m8214(g1VarM8776)));
                                                                                    C0261.m4990(qVar, 1166861920 ^ C0326.f474);
                                                                                    zM9582 = C0492.m9582((List) C0418.m8214(g1VarM8775));
                                                                                    i26 = 1507751;
                                                                                    while (true) {
                                                                                        i26 ^= 1507768;
                                                                                        switch (i26) {
                                                                                            case 31:
                                                                                                if (((((zM9582 ? 1 : 0) ^ '\uffff') & 1) | ((zM9582 ? 1 : 0) & '\ufffe')) != 0) {
                                                                                                }
                                                                                                break;
                                                                                            case 1335:
                                                                                                C0408.m8011(new c5.j(mainViewModel, C0187.f211 ^ (-330)), null, false, null, null, null, null, null, null, C0059.m1122(qVar, (-1796316708) ^ C0048.f68, new t(g1VarM8776, C0146.f171 ^ (-433))), qVar, 805306368, 510);
                                                                                                i29 = 1508526;
                                                                                                while (true) {
                                                                                                    i29 ^= 1508543;
                                                                                                    switch (i29) {
                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i29 = 1508557;
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
                                                                                            case 1480:
                                                                                                break;
                                                                                            case 1513:
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    C0016.m325(qVar, false, false, true, false);
                                                                                    C0171.m3270(qVar, false);
                                                                                    zM7153 = C0364.m7153((List) C0418.m8214(g1VarM8775));
                                                                                    i27 = 1508650;
                                                                                    while (true) {
                                                                                        i27 ^= 1508667;
                                                                                        switch (i27) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                if (zM7153) {
                                                                                                }
                                                                                                break;
                                                                                            case 83:
                                                                                                C0261.m4990(qVar, (-1166859413) ^ C0211.f235);
                                                                                                C0271.m5230(fillElementM2371, C0419.m8237(f10), C0067.m1299(C0104.m2039(), qVar, 0), null, null, C0059.m1122(qVar, (-1828931410) ^ C0180.f204, new t(g1VarM8775, C0007.f27 ^ (-423))), qVar, 196883 ^ C0393.f664, C0202.f226 ^ (-445));
                                                                                                C0171.m3270(qVar, false);
                                                                                                break;
                                                                                            case 114:
                                                                                                break;
                                                                                            case 3369:
                                                                                                C0261.m4990(qVar, (-1166861604) ^ C0379.f650);
                                                                                                C0271.m5230(fillElementM2371, C0419.m8237(f10), C0067.m1299(C0104.m2039(), qVar, 0), null, null, C0059.m1122(qVar, (-2036358968) ^ C0450.f721, new t(g1VarM8776, C0162.f186 ^ 833)), qVar, 196767 ^ C0085.f119, C0168.f192 ^ 936);
                                                                                                C0171.m3270(qVar, false);
                                                                                                i28 = 1509425;
                                                                                                while (true) {
                                                                                                    i28 ^= 1509442;
                                                                                                    switch (i28) {
                                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                            break;
                                                                                                        case 115:
                                                                                                            i28 = 1509456;
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
                                                                                    }
                                                                                    C0072.m1564(C0270.m5166(lVarM4370, f10), qVar);
                                                                                    int i47 = C0376.f647 ^ 818;
                                                                                    C0403.m7922(new c5.j(mainViewModel, i47), fillElementM2371, false, C0419.m8237(i47), null, null, C0059.m1134(1, C0216.m4129(C0001.m41(), 0.3f)), null, null, C0388.m7604(), qVar, 805306416, 436);
                                                                                    C0072.m1564(C0270.m5166(lVarM4370, C0117.f143 ^ 927), qVar);
                                                                                    C0171.m3270(qVar, false);
                                                                                    C0171.m3270(qVar, true);
                                                                                    C0171.m3270(qVar, false);
                                                                                    C0171.m3270(qVar, false);
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
                                                            }
                                                            break;
                                                        case 83:
                                                            C0235.m4537();
                                                            throw null;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    x1VarM7533 = C0384.m7533(qVar);
                                    i12 = 1509549;
                                    while (true) {
                                        i12 ^= 1509566;
                                        switch (i12) {
                                            case 19:
                                                if (x1VarM7533 != null) {
                                                    i12 = 1509642;
                                                }
                                                break;
                                            case 85:
                                                return;
                                            case 114:
                                                break;
                                            case 436:
                                                x1VarM7533.f11756d = new c5.k(mainViewModel, i10, C0322.f470 ^ 121);
                                                return;
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        i12 = 1509611;
                                    }
                                }
                                break;
                            case 83:
                                C0470.m9156(qVar);
                                int i48 = 49914;
                                while (true) {
                                    i48 ^= 49931;
                                    switch (i48) {
                                        case 497:
                                            i48 = 50596;
                                            continue;
                                        case 1711:
                                            break;
                                        default:
                                            continue;
                                    }
                                    x1VarM7533 = C0384.m7533(qVar);
                                    i12 = 1509549;
                                    while (true) {
                                        i12 ^= 1509566;
                                        switch (i12) {
                                            case 19:
                                                if (x1VarM7533 != null) {
                                                    i12 = 1509642;
                                                }
                                                break;
                                            case 85:
                                                return;
                                            case 114:
                                                break;
                                            case 436:
                                                x1VarM7533.f11756d = new c5.k(mainViewModel, i10, C0322.f470 ^ 121);
                                                return;
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        i12 = 1509611;
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
    }

    /* JADX WARN: Code duplicated, block: B:141:0x043f  */
    /* JADX WARN: Code duplicated, block: B:154:0x048a  */
    /* JADX WARN: Code duplicated, block: B:160:0x049f  */
    /* JADX WARN: Code duplicated, block: B:244:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x023f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x02e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x02e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x02af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x025e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x025e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x02e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x02df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x0351 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x032a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x0347 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x034d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x0351 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x041c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x034d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x0349 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x033f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x044e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x0452 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x0446 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x047e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x04a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x055d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x04a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x0486 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x0475 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x04b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x04ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x04be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x04cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x04ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x04b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x04ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x04c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x055d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x04c1 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x0552 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x0569 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x056d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x0569 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x054a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x04d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x0558 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x04d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x0499 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x049d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x0491 A[SYNTHETIC] */
    public static final void f(MainViewModel mainViewModel, m0.m mVar, int i10) {
        int i11;
        m0.x1 x1VarM7533;
        int i12;
        Object objM8078;
        Object objM2417;
        int i13;
        m9.d0 d0VarM7237;
        m0.g1 g1VarM8775;
        m0.g1 g1VarM8776;
        m0.g1 g1VarM8777;
        m0.g1 g1VarM8778;
        m0.g1 g1VarM8779;
        m0.g1 g1VarM87710;
        m0.g1 g1VarM87711;
        m0.g1 g1VarM87712;
        m0.g1 g1VarM87713;
        m0.g1 g1VarM87714;
        Object objM8079;
        int i14;
        a3 a3Var;
        boolean zM14;
        int i15;
        m0.g1 g1VarM87715;
        boolean zM2013;
        Object objM80710;
        int i16;
        b0.j0 j0Var;
        v0.p pVarM6659;
        v0.p pVarM2991;
        int i17;
        boolean z10;
        boolean zM5551;
        Object objM80711;
        int i18;
        int i19;
        int i20;
        int i21;
        v0.p pVarM802;
        int i22;
        int i23;
        f5.h hVar;
        boolean z11;
        int i24;
        boolean z12;
        int i25;
        boolean z13;
        int i26;
        UserProfile userProfileM6924;
        int i27;
        int i28;
        int i29;
        m0.x1 x1VarM7534;
        int i30;
        int i31;
        int i32;
        C0375.m7360(mainViewModel, C0383.m7518(m4193(), 992, C0376.f647 ^ 823, 2817));
        m0.q qVar = (m0.q) mVar;
        C0393.m7698(qVar, (-1930892695) ^ C0343.f614);
        int i33 = C0122.f148;
        int i34 = 1616;
        while (true) {
            i34 ^= 1633;
            switch (i34) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i34 = ((i33 ^ (-58)) & i10) == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM2014 = C0103.m2013(qVar, mainViewModel);
                    int i35 = 1740;
                    while (true) {
                        i35 ^= 1757;
                        switch (i35) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i35 = zM2014 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                i32 = 2;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                i32 = 4;
                                int i36 = 1864;
                                while (true) {
                                    i36 ^= 1881;
                                    switch (i36) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i36 = 48674;
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
                    int i37 = (i32 & i10) | (i32 ^ i10);
                    int i38 = 48767;
                    while (true) {
                        i38 ^= 48784;
                        switch (i38) {
                            case Code.UNAVAILABLE /* 14 */:
                                i11 = i37;
                                break;
                            case 239:
                                i38 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    i11 = i10;
                    break;
                default:
                    break;
            }
        }
        int i39 = C0073.f107;
        int i40 = 48891;
        while (true) {
            i40 ^= 48908;
            switch (i40) {
                case 22:
                    break;
                case 53:
                    C0261.m4990(qVar, 773894690 ^ C0152.f177);
                    C0261.m4990(qVar, 492369453 ^ C0143.f169);
                    objM8078 = C0411.m8078(qVar);
                    objM2417 = C0125.m2417();
                    i13 = 50689;
                    while (true) {
                        i13 ^= 50706;
                        switch (i13) {
                            case 19:
                                i13 = objM8078 == objM2417 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                objM8078 = new m0.d0(C0449.m8758(qVar));
                                C0478.m9328(qVar, objM8078);
                                break;
                            default:
                                break;
                        }
                    }
                    C0171.m3270(qVar, false);
                    d0VarM7237 = C0368.m7237((m0.d0) objM8078);
                    C0171.m3270(qVar, false);
                    g1VarM8775 = C0450.m8775(C0397.m7766(mainViewModel), qVar);
                    g1VarM8776 = C0450.m8775(C0029.m566(mainViewModel), qVar);
                    g1VarM8777 = C0450.m8775(C0036.m703(mainViewModel), qVar);
                    g1VarM8778 = C0450.m8775(C0067.m1311(mainViewModel), qVar);
                    g1VarM8779 = C0450.m8775(C0018.m356(mainViewModel), qVar);
                    g1VarM87710 = C0450.m8775(C0466.m9081(mainViewModel), qVar);
                    C0450.m8775(C0489.m9535(mainViewModel), qVar);
                    C0450.m8775(C0408.m8015(mainViewModel), qVar);
                    C0450.m8775(C0484.m9435(mainViewModel), qVar);
                    C0450.m8775(C0367.m7207(mainViewModel), qVar);
                    g1VarM87711 = C0450.m8775(C0206.m3935(mainViewModel), qVar);
                    m0.g1 g1VarM87716 = C0450.m8775(C0158.m3011(mainViewModel), qVar);
                    g1VarM87712 = C0450.m8775(C0138.m2677(mainViewModel), qVar);
                    g1VarM87713 = C0450.m8775(C0165.m3155(mainViewModel), qVar);
                    g1VarM87714 = C0450.m8775(C0413.m8112(mainViewModel), qVar);
                    androidx.lifecycle.w wVar = (androidx.lifecycle.w) C0475.m9256(qVar, C0240.m4603());
                    C0002.m53(wVar, new c5.s(wVar, mainViewModel, 1), qVar);
                    m0.g1 g1VarM87717 = C0450.m8775(C0292.m5631(mainViewModel), qVar);
                    C0261.m4990(qVar, 47048366 ^ C0154.f179);
                    objM8079 = C0411.m8078(qVar);
                    i14 = 50813;
                    while (true) {
                        i14 ^= 50830;
                        switch (i14) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                break;
                            case 243:
                                i14 = objM8079 == objM2417 ? 51557 : 50875;
                                break;
                            case 4075:
                                objM8079 = new a3();
                                C0478.m9328(qVar, objM8079);
                                break;
                            default:
                                break;
                        }
                    }
                    a3Var = (a3) objM8079;
                    C0171.m3270(qVar, false);
                    C0405.m7954((String) C0418.m8214(g1VarM87717), new p0(g1VarM87717, a3Var, mainViewModel, null), qVar);
                    C0261.m4990(qVar, 47048274 ^ C0183.f207);
                    zM14 = C0000.m14((Boolean) C0418.m8214(g1VarM87716));
                    i15 = 51588;
                    while (true) {
                        i15 ^= 51605;
                        switch (i15) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = zM14 ? 51681 : 51650;
                                break;
                            case 54:
                                break;
                            case 87:
                                C0171.m3270(qVar, false);
                                C0405.m7954(C0012.m238(), new q0(mainViewModel, null), qVar);
                                g1VarM87715 = C0450.m8775(C0271.m5232(mainViewModel), qVar);
                                String str = (String) C0418.m8214(g1VarM87715);
                                C0261.m4990(qVar, (-47047451) ^ C0076.f110);
                                zM2013 = C0103.m2013(qVar, str);
                                objM80710 = C0411.m8078(qVar);
                                i16 = 54533;
                                while (true) {
                                    i16 ^= 54550;
                                    switch (i16) {
                                        case 19:
                                            i16 = !zM2013 ? 54626 : 54595;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 85:
                                            C0318.m6169();
                                            String strM6122 = C0316.m6122(C0152.m2920(m4193(), 1001, C0294.f442 ^ (-662), 1021), (String) C0418.m8214(g1VarM87715));
                                            String strM6123 = C0316.m6122(C0039.m760(m4193(), 1010, C0180.f204 ^ (-369), 1710), (String) C0418.m8214(g1VarM87715));
                                            String strM6124 = C0316.m6122(C0195.m3738(m4193(), 1017, C0282.f427 ^ (-984), 1791), (String) C0418.m8214(g1VarM87715));
                                            String strM6125 = C0316.m6122(C0024.m469(m4193(), 1021, C0281.f426 ^ 814, 1147), (String) C0418.m8214(g1VarM87715));
                                            String strM6126 = C0316.m6122(C0171.m3275(m4193(), 1028, C0133.f159 ^ 784, 810), (String) C0418.m8214(g1VarM87715));
                                            String[] strArr = new String[5];
                                            strArr[C0002.f770 ^ (-12)] = strM6122;
                                            strArr[C0275.f391 ^ 986] = strM6123;
                                            strArr[C0255.f335 ^ (-332)] = strM6124;
                                            strArr[C0355.f626 ^ (-115)] = strM6125;
                                            strArr[C0001.f769 ^ (-982)] = strM6126;
                                            objM80710 = C0405.m7965(strArr);
                                            C0478.m9328(qVar, objM80710);
                                            break;
                                        case 116:
                                            i23 = 54657;
                                            while (true) {
                                                i23 ^= 54674;
                                                switch (i23) {
                                                    case 19:
                                                        i23 = objM80710 == objM2417 ? 55401 : 54719;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 3579:
                                                        C0318.m6169();
                                                        String strM6127 = C0316.m6122(C0152.m2920(m4193(), 1001, C0294.f442 ^ (-662), 1021), (String) C0418.m8214(g1VarM87715));
                                                        String strM6128 = C0316.m6122(C0039.m760(m4193(), 1010, C0180.f204 ^ (-369), 1710), (String) C0418.m8214(g1VarM87715));
                                                        String strM6129 = C0316.m6122(C0195.m3738(m4193(), 1017, C0282.f427 ^ (-984), 1791), (String) C0418.m8214(g1VarM87715));
                                                        String strM61210 = C0316.m6122(C0024.m469(m4193(), 1021, C0281.f426 ^ 814, 1147), (String) C0418.m8214(g1VarM87715));
                                                        String strM61211 = C0316.m6122(C0171.m3275(m4193(), 1028, C0133.f159 ^ 784, 810), (String) C0418.m8214(g1VarM87715));
                                                        String[] strArr2 = new String[5];
                                                        strArr2[C0002.f770 ^ (-12)] = strM6127;
                                                        strArr2[C0275.f391 ^ 986] = strM6128;
                                                        strArr2[C0255.f335 ^ (-332)] = strM6129;
                                                        strArr2[C0355.f626 ^ (-115)] = strM61210;
                                                        strArr2[C0001.f769 ^ (-982)] = strM61211;
                                                        objM80710 = C0405.m7965(strArr2);
                                                        C0478.m9328(qVar, objM80710);
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
                                List list = (List) objM80710;
                                C0171.m3270(qVar, false);
                                j0Var = new b0.j0(1, list);
                                C0020.m411();
                                C0261.m4990(qVar, 1210769353 ^ C0063.f83);
                                switch (C0101.m1980(C0134.m2589())) {
                                    case 12:
                                        pVarM6659 = C0339.m6659();
                                        break;
                                    case 19:
                                        pVarM2991 = C0157.m2991();
                                        i17 = 55556;
                                        while (true) {
                                            i17 ^= 55573;
                                            switch (i17) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i17 = 55587;
                                                    continue;
                                                    continue;
                                                case 54:
                                                    pVarM6659 = pVarM2991;
                                                    break;
                                                default:
                                                    continue;
                                                    continue;
                                            }
                                        }
                                        break;
                                    default:
                                        pVarM802 = C0041.m802();
                                        i22 = 55432;
                                        while (true) {
                                            i22 ^= 55449;
                                            switch (i22) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i22 = 55463;
                                                    continue;
                                                    continue;
                                                case 62:
                                                    pVarM6659 = pVarM802;
                                                    break;
                                                default:
                                                    continue;
                                                    continue;
                                            }
                                        }
                                        break;
                                }
                                C0261.m4990(qVar, (-1614658905) ^ C0176.f200);
                                boolean zM1859 = C0087.m1859(qVar, 0);
                                boolean zM5919 = C0306.m5919(qVar, 0.0f);
                                z10 = (zM1859 ^ zM5919) | (zM1859 & zM5919);
                                zM5551 = C0288.m5551(qVar, j0Var);
                                objM80711 = C0411.m8078(qVar);
                                i18 = 55680;
                                while (true) {
                                    i18 ^= 55697;
                                    switch (i18) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i18 = !((z10 ^ zM5551) | (z10 & zM5551)) ? 56424 : 56393;
                                            break;
                                        case 1467:
                                            break;
                                        case 1496:
                                            objM80711 = new b0.n0(0, 0.0f, j0Var);
                                            C0478.m9328(qVar, objM80711);
                                            break;
                                        case 1529:
                                            i19 = 56455;
                                            while (true) {
                                                i19 ^= 56472;
                                                switch (i19) {
                                                    case 31:
                                                        i19 = objM80711 == objM2417 ? 56548 : 56517;
                                                        break;
                                                    case 62:
                                                        break;
                                                    case 93:
                                                        i20 = 1507503;
                                                        while (true) {
                                                            i20 ^= 1507520;
                                                            switch (i20) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 111:
                                                                    i20 = 1507534;
                                                                    continue;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 124:
                                                        i21 = 56579;
                                                        while (true) {
                                                            i21 ^= 56596;
                                                            switch (i21) {
                                                                case 23:
                                                                    i21 = 56610;
                                                                    break;
                                                                case 54:
                                                                    objM80711 = new b0.n0(0, 0.0f, j0Var);
                                                                    C0478.m9328(qVar, objM80711);
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
                                C0171.m3270(qVar, false);
                                b0.k0 k0Var = (b0.k0) C0180.m3449(new Object[0], pVarM6659, (c9.a) objM80711, qVar, C0215.f239 ^ (-798));
                                C0037.m728(C0161.m3085(k0Var), j0Var);
                                C0171.m3270(qVar, false);
                                C0257.m4920(null, C0059.m1122(qVar, (-358167960) ^ C0472.f743, new c5.u(mainViewModel, 1)), null, C0059.m1122(qVar, 1389209251 ^ C0343.f614, new r0(a3Var, 0)), null, 0, C0182.m3479(), 0L, null, C0059.m1122(qVar, (-769257536) ^ C0269.f349, new w0(k0Var, list, d0VarM7237, mainViewModel, g1VarM8777, g1VarM8778, g1VarM8779, g1VarM87710, g1VarM8775, g1VarM8776, g1VarM87713, g1VarM87714, g1VarM87711)), qVar, 805309488, 437);
                                break;
                            case 116:
                                hVar = (f5.h) C0418.m8214(g1VarM87712);
                                z11 = hVar instanceof f5.e;
                                i24 = 51712;
                                while (true) {
                                    i24 ^= 51729;
                                    switch (i24) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i24 = z11 ? 51805 : 51774;
                                            break;
                                        case 47:
                                            z12 = hVar instanceof f5.g;
                                            i25 = 52611;
                                            while (true) {
                                                i25 ^= 52628;
                                                switch (i25) {
                                                    case 23:
                                                        i25 = z12 ? 52704 : 52673;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        z13 = hVar instanceof f5.a;
                                                        i26 = 53510;
                                                        while (true) {
                                                            i26 ^= 53527;
                                                            switch (i26) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i26 = z13 ? 53603 : 53572;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 83:
                                                                    userProfileM6924 = null;
                                                                    break;
                                                                case 116:
                                                                    userProfileM6924 = C0353.m6924((f5.a) hVar);
                                                                    i27 = 53634;
                                                                    while (true) {
                                                                        i27 ^= 53651;
                                                                        switch (i27) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i27 = 53665;
                                                                                continue;
                                                                                continue;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                                        }
                                                        break;
                                                    case 116:
                                                        userProfileM6924 = C0347.m6804((f5.g) hVar);
                                                        i28 = 52735;
                                                        while (true) {
                                                            i28 ^= 52752;
                                                            switch (i28) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 1007:
                                                                    i28 = 52766;
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
                                            }
                                            break;
                                        case 76:
                                            userProfileM6924 = C0243.m4675((f5.e) hVar);
                                            i31 = 51836;
                                            while (true) {
                                                i31 ^= 51853;
                                                switch (i31) {
                                                    case 241:
                                                        i31 = 52518;
                                                        continue;
                                                        continue;
                                                    case 1963:
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
                                }
                                c5.j jVar = new c5.j(mainViewModel, C0231.f311 ^ (-202));
                                int i41 = C0069.f89 ^ (-808);
                                c5.j jVar2 = new c5.j(mainViewModel, i41);
                                int i42 = ((i41 ^ (-1)) ^ i11) & i11;
                                i29 = C0261.f341 ^ (-878);
                                C0411.m8086(mainViewModel, userProfileM6924, jVar, jVar2, qVar, (i29 ^ i42) | (i42 & i29));
                                C0171.m3270(qVar, false);
                                x1VarM7534 = C0384.m7533(qVar);
                                i30 = 53758;
                                while (true) {
                                    i30 ^= 53775;
                                    switch (i30) {
                                        case 1009:
                                            if (x1VarM7534 != null) {
                                                i30 = 54502;
                                            }
                                            break;
                                        case 1703:
                                            break;
                                        case 1736:
                                            break;
                                        case 1769:
                                            x1VarM7534.f11756d = new c5.k(mainViewModel, i10, i29);
                                            break;
                                        default:
                                            continue;
                                            continue;
                                    }
                                    i30 = 54471;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    x1VarM7533 = C0384.m7533(qVar);
                    i12 = 1507627;
                    while (true) {
                        i12 ^= 1507644;
                        switch (i12) {
                            case 23:
                                if (x1VarM7533 != null) {
                                    i12 = 1507720;
                                }
                                break;
                            case 85:
                                break;
                            case 118:
                                break;
                            case 180:
                                x1VarM7533.f11756d = new c5.k(mainViewModel, i10, C0301.f449 ^ 953);
                                break;
                            default:
                                continue;
                                continue;
                                continue;
                        }
                        i12 = 1507689;
                    }
                    break;
                case 503:
                    i40 = ((i39 ^ (-922)) & i11) == 2 ? 49635 : 48953;
                    break;
                case 32495:
                    boolean zM1625 = C0074.m1625(qVar);
                    int i43 = 49666;
                    while (true) {
                        i43 ^= 49683;
                        switch (i43) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i43 = !zM1625 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                int i44 = 49790;
                                while (true) {
                                    i44 ^= 49807;
                                    switch (i44) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i44 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                    C0261.m4990(qVar, 773894690 ^ C0152.f177);
                                    C0261.m4990(qVar, 492369453 ^ C0143.f169);
                                    objM8078 = C0411.m8078(qVar);
                                    objM2417 = C0125.m2417();
                                    i13 = 50689;
                                    while (true) {
                                        i13 ^= 50706;
                                        switch (i13) {
                                            case 19:
                                                if (objM8078 == objM2417) {
                                                }
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                objM8078 = new m0.d0(C0449.m8758(qVar));
                                                C0478.m9328(qVar, objM8078);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    C0171.m3270(qVar, false);
                                    d0VarM7237 = C0368.m7237((m0.d0) objM8078);
                                    C0171.m3270(qVar, false);
                                    g1VarM8775 = C0450.m8775(C0397.m7766(mainViewModel), qVar);
                                    g1VarM8776 = C0450.m8775(C0029.m566(mainViewModel), qVar);
                                    g1VarM8777 = C0450.m8775(C0036.m703(mainViewModel), qVar);
                                    g1VarM8778 = C0450.m8775(C0067.m1311(mainViewModel), qVar);
                                    g1VarM8779 = C0450.m8775(C0018.m356(mainViewModel), qVar);
                                    g1VarM87710 = C0450.m8775(C0466.m9081(mainViewModel), qVar);
                                    C0450.m8775(C0489.m9535(mainViewModel), qVar);
                                    C0450.m8775(C0408.m8015(mainViewModel), qVar);
                                    C0450.m8775(C0484.m9435(mainViewModel), qVar);
                                    C0450.m8775(C0367.m7207(mainViewModel), qVar);
                                    g1VarM87711 = C0450.m8775(C0206.m3935(mainViewModel), qVar);
                                    m0.g1 g1VarM87718 = C0450.m8775(C0158.m3011(mainViewModel), qVar);
                                    g1VarM87712 = C0450.m8775(C0138.m2677(mainViewModel), qVar);
                                    g1VarM87713 = C0450.m8775(C0165.m3155(mainViewModel), qVar);
                                    g1VarM87714 = C0450.m8775(C0413.m8112(mainViewModel), qVar);
                                    androidx.lifecycle.w wVar2 = (androidx.lifecycle.w) C0475.m9256(qVar, C0240.m4603());
                                    C0002.m53(wVar2, new c5.s(wVar2, mainViewModel, 1), qVar);
                                    m0.g1 g1VarM87719 = C0450.m8775(C0292.m5631(mainViewModel), qVar);
                                    C0261.m4990(qVar, 47048366 ^ C0154.f179);
                                    objM8079 = C0411.m8078(qVar);
                                    i14 = 50813;
                                    while (true) {
                                        i14 ^= 50830;
                                        switch (i14) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 53:
                                                break;
                                            case 243:
                                                if (objM8079 == objM2417) {
                                                }
                                                break;
                                            case 4075:
                                                objM8079 = new a3();
                                                C0478.m9328(qVar, objM8079);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    a3Var = (a3) objM8079;
                                    C0171.m3270(qVar, false);
                                    C0405.m7954((String) C0418.m8214(g1VarM87719), new p0(g1VarM87719, a3Var, mainViewModel, null), qVar);
                                    C0261.m4990(qVar, 47048274 ^ C0183.f207);
                                    zM14 = C0000.m14((Boolean) C0418.m8214(g1VarM87718));
                                    i15 = 51588;
                                    while (true) {
                                        i15 ^= 51605;
                                        switch (i15) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (zM14) {
                                                }
                                                break;
                                            case 54:
                                                break;
                                            case 87:
                                                C0171.m3270(qVar, false);
                                                C0405.m7954(C0012.m238(), new q0(mainViewModel, null), qVar);
                                                g1VarM87715 = C0450.m8775(C0271.m5232(mainViewModel), qVar);
                                                String str2 = (String) C0418.m8214(g1VarM87715);
                                                C0261.m4990(qVar, (-47047451) ^ C0076.f110);
                                                zM2013 = C0103.m2013(qVar, str2);
                                                objM80710 = C0411.m8078(qVar);
                                                i16 = 54533;
                                                while (true) {
                                                    i16 ^= 54550;
                                                    switch (i16) {
                                                        case 19:
                                                            if (!zM2013) {
                                                            }
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 85:
                                                            C0318.m6169();
                                                            String strM61212 = C0316.m6122(C0152.m2920(m4193(), 1001, C0294.f442 ^ (-662), 1021), (String) C0418.m8214(g1VarM87715));
                                                            String strM61213 = C0316.m6122(C0039.m760(m4193(), 1010, C0180.f204 ^ (-369), 1710), (String) C0418.m8214(g1VarM87715));
                                                            String strM61214 = C0316.m6122(C0195.m3738(m4193(), 1017, C0282.f427 ^ (-984), 1791), (String) C0418.m8214(g1VarM87715));
                                                            String strM61215 = C0316.m6122(C0024.m469(m4193(), 1021, C0281.f426 ^ 814, 1147), (String) C0418.m8214(g1VarM87715));
                                                            String strM61216 = C0316.m6122(C0171.m3275(m4193(), 1028, C0133.f159 ^ 784, 810), (String) C0418.m8214(g1VarM87715));
                                                            String[] strArr3 = new String[5];
                                                            strArr3[C0002.f770 ^ (-12)] = strM61212;
                                                            strArr3[C0275.f391 ^ 986] = strM61213;
                                                            strArr3[C0255.f335 ^ (-332)] = strM61214;
                                                            strArr3[C0355.f626 ^ (-115)] = strM61215;
                                                            strArr3[C0001.f769 ^ (-982)] = strM61216;
                                                            objM80710 = C0405.m7965(strArr3);
                                                            C0478.m9328(qVar, objM80710);
                                                            break;
                                                        case 116:
                                                            i23 = 54657;
                                                            while (true) {
                                                                i23 ^= 54674;
                                                                switch (i23) {
                                                                    case 19:
                                                                        if (objM80710 == objM2417) {
                                                                        }
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 3579:
                                                                        C0318.m6169();
                                                                        String strM61217 = C0316.m6122(C0152.m2920(m4193(), 1001, C0294.f442 ^ (-662), 1021), (String) C0418.m8214(g1VarM87715));
                                                                        String strM61218 = C0316.m6122(C0039.m760(m4193(), 1010, C0180.f204 ^ (-369), 1710), (String) C0418.m8214(g1VarM87715));
                                                                        String strM61219 = C0316.m6122(C0195.m3738(m4193(), 1017, C0282.f427 ^ (-984), 1791), (String) C0418.m8214(g1VarM87715));
                                                                        String strM612110 = C0316.m6122(C0024.m469(m4193(), 1021, C0281.f426 ^ 814, 1147), (String) C0418.m8214(g1VarM87715));
                                                                        String strM612111 = C0316.m6122(C0171.m3275(m4193(), 1028, C0133.f159 ^ 784, 810), (String) C0418.m8214(g1VarM87715));
                                                                        String[] strArr4 = new String[5];
                                                                        strArr4[C0002.f770 ^ (-12)] = strM61217;
                                                                        strArr4[C0275.f391 ^ 986] = strM61218;
                                                                        strArr4[C0255.f335 ^ (-332)] = strM61219;
                                                                        strArr4[C0355.f626 ^ (-115)] = strM612110;
                                                                        strArr4[C0001.f769 ^ (-982)] = strM612111;
                                                                        objM80710 = C0405.m7965(strArr4);
                                                                        C0478.m9328(qVar, objM80710);
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
                                                List list2 = (List) objM80710;
                                                C0171.m3270(qVar, false);
                                                j0Var = new b0.j0(1, list2);
                                                C0020.m411();
                                                C0261.m4990(qVar, 1210769353 ^ C0063.f83);
                                                switch (C0101.m1980(C0134.m2589())) {
                                                    case 12:
                                                        pVarM6659 = C0339.m6659();
                                                        break;
                                                    case 19:
                                                        pVarM2991 = C0157.m2991();
                                                        i17 = 55556;
                                                        while (true) {
                                                            i17 ^= 55573;
                                                            switch (i17) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i17 = 55587;
                                                                    continue;
                                                                    continue;
                                                                case 54:
                                                                    pVarM6659 = pVarM2991;
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        pVarM802 = C0041.m802();
                                                        i22 = 55432;
                                                        while (true) {
                                                            i22 ^= 55449;
                                                            switch (i22) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i22 = 55463;
                                                                    continue;
                                                                    continue;
                                                                case 62:
                                                                    pVarM6659 = pVarM802;
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                }
                                                C0261.m4990(qVar, (-1614658905) ^ C0176.f200);
                                                boolean zM18510 = C0087.m1859(qVar, 0);
                                                boolean zM59110 = C0306.m5919(qVar, 0.0f);
                                                z10 = (zM18510 ^ zM59110) | (zM18510 & zM59110);
                                                zM5551 = C0288.m5551(qVar, j0Var);
                                                objM80711 = C0411.m8078(qVar);
                                                i18 = 55680;
                                                while (true) {
                                                    i18 ^= 55697;
                                                    switch (i18) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (!((z10 ^ zM5551) | (z10 & zM5551))) {
                                                            }
                                                            break;
                                                        case 1467:
                                                            break;
                                                        case 1496:
                                                            objM80711 = new b0.n0(0, 0.0f, j0Var);
                                                            C0478.m9328(qVar, objM80711);
                                                            break;
                                                        case 1529:
                                                            i19 = 56455;
                                                            while (true) {
                                                                i19 ^= 56472;
                                                                switch (i19) {
                                                                    case 31:
                                                                        if (objM80711 == objM2417) {
                                                                        }
                                                                        break;
                                                                    case 62:
                                                                        break;
                                                                    case 93:
                                                                        i20 = 1507503;
                                                                        while (true) {
                                                                            i20 ^= 1507520;
                                                                            switch (i20) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case 111:
                                                                                    i20 = 1507534;
                                                                                    continue;
                                                                                    continue;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 124:
                                                                        i21 = 56579;
                                                                        while (true) {
                                                                            i21 ^= 56596;
                                                                            switch (i21) {
                                                                                case 23:
                                                                                    i21 = 56610;
                                                                                    break;
                                                                                case 54:
                                                                                    objM80711 = new b0.n0(0, 0.0f, j0Var);
                                                                                    C0478.m9328(qVar, objM80711);
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
                                                C0171.m3270(qVar, false);
                                                b0.k0 k0Var2 = (b0.k0) C0180.m3449(new Object[0], pVarM6659, (c9.a) objM80711, qVar, C0215.f239 ^ (-798));
                                                C0037.m728(C0161.m3085(k0Var2), j0Var);
                                                C0171.m3270(qVar, false);
                                                C0257.m4920(null, C0059.m1122(qVar, (-358167960) ^ C0472.f743, new c5.u(mainViewModel, 1)), null, C0059.m1122(qVar, 1389209251 ^ C0343.f614, new r0(a3Var, 0)), null, 0, C0182.m3479(), 0L, null, C0059.m1122(qVar, (-769257536) ^ C0269.f349, new w0(k0Var2, list2, d0VarM7237, mainViewModel, g1VarM8777, g1VarM8778, g1VarM8779, g1VarM87710, g1VarM8775, g1VarM8776, g1VarM87713, g1VarM87714, g1VarM87711)), qVar, 805309488, 437);
                                                break;
                                            case 116:
                                                hVar = (f5.h) C0418.m8214(g1VarM87712);
                                                z11 = hVar instanceof f5.e;
                                                i24 = 51712;
                                                while (true) {
                                                    i24 ^= 51729;
                                                    switch (i24) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (z11) {
                                                            }
                                                            break;
                                                        case 47:
                                                            z12 = hVar instanceof f5.g;
                                                            i25 = 52611;
                                                            while (true) {
                                                                i25 ^= 52628;
                                                                switch (i25) {
                                                                    case 23:
                                                                        if (z12) {
                                                                        }
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 85:
                                                                        z13 = hVar instanceof f5.a;
                                                                        i26 = 53510;
                                                                        while (true) {
                                                                            i26 ^= 53527;
                                                                            switch (i26) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    if (z13) {
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                case 83:
                                                                                    userProfileM6924 = null;
                                                                                    break;
                                                                                case 116:
                                                                                    userProfileM6924 = C0353.m6924((f5.a) hVar);
                                                                                    i27 = 53634;
                                                                                    while (true) {
                                                                                        i27 ^= 53651;
                                                                                        switch (i27) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i27 = 53665;
                                                                                                continue;
                                                                                                continue;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                                                        }
                                                                        break;
                                                                    case 116:
                                                                        userProfileM6924 = C0347.m6804((f5.g) hVar);
                                                                        i28 = 52735;
                                                                        while (true) {
                                                                            i28 ^= 52752;
                                                                            switch (i28) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case 1007:
                                                                                    i28 = 52766;
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
                                                            }
                                                            break;
                                                        case 76:
                                                            userProfileM6924 = C0243.m4675((f5.e) hVar);
                                                            i31 = 51836;
                                                            while (true) {
                                                                i31 ^= 51853;
                                                                switch (i31) {
                                                                    case 241:
                                                                        i31 = 52518;
                                                                        continue;
                                                                        continue;
                                                                    case 1963:
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
                                                }
                                                c5.j jVar3 = new c5.j(mainViewModel, C0231.f311 ^ (-202));
                                                int i45 = C0069.f89 ^ (-808);
                                                c5.j jVar4 = new c5.j(mainViewModel, i45);
                                                int i46 = ((i45 ^ (-1)) ^ i11) & i11;
                                                i29 = C0261.f341 ^ (-878);
                                                C0411.m8086(mainViewModel, userProfileM6924, jVar3, jVar4, qVar, (i29 ^ i46) | (i46 & i29));
                                                C0171.m3270(qVar, false);
                                                x1VarM7534 = C0384.m7533(qVar);
                                                i30 = 53758;
                                                while (true) {
                                                    i30 ^= 53775;
                                                    switch (i30) {
                                                        case 1009:
                                                            if (x1VarM7534 != null) {
                                                                i30 = 54502;
                                                            }
                                                            break;
                                                        case 1703:
                                                            break;
                                                        case 1736:
                                                            break;
                                                        case 1769:
                                                            x1VarM7534.f11756d = new c5.k(mainViewModel, i10, i29);
                                                            break;
                                                        default:
                                                            continue;
                                                            continue;
                                                    }
                                                    i30 = 54471;
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    x1VarM7533 = C0384.m7533(qVar);
                                    i12 = 1507627;
                                    while (true) {
                                        i12 ^= 1507644;
                                        switch (i12) {
                                            case 23:
                                                if (x1VarM7533 != null) {
                                                    i12 = 1507720;
                                                }
                                                break;
                                            case 85:
                                                break;
                                            case 118:
                                                break;
                                            case 180:
                                                x1VarM7533.f11756d = new c5.k(mainViewModel, i10, C0301.f449 ^ 953);
                                                break;
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        i12 = 1507689;
                                    }
                                }
                                break;
                            case 83:
                                C0470.m9156(qVar);
                                int i47 = 49914;
                                while (true) {
                                    i47 ^= 49931;
                                    switch (i47) {
                                        case 497:
                                            i47 = 50596;
                                            continue;
                                        case 1711:
                                            break;
                                        default:
                                            continue;
                                    }
                                    x1VarM7533 = C0384.m7533(qVar);
                                    i12 = 1507627;
                                    while (true) {
                                        i12 ^= 1507644;
                                        switch (i12) {
                                            case 23:
                                                if (x1VarM7533 != null) {
                                                    i12 = 1507720;
                                                }
                                                break;
                                            case 85:
                                                break;
                                            case 118:
                                                break;
                                            case 180:
                                                x1VarM7533.f11756d = new c5.k(mainViewModel, i10, C0301.f449 ^ 953);
                                                break;
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        i12 = 1507689;
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
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:346:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x0359 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x02a0 A[SYNTHETIC] */
    public static final void g(String str, String str2, boolean z10, i1.f fVar, c9.a aVar, m0.m mVar, int i10) {
        int i11;
        int i12;
        boolean z11;
        Object objM8078;
        int i13;
        Object e1Var;
        k0.y0 y0VarM2417;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        C0375.m7360(str, C0306.m5911(m4193(), 1036, C0356.f627 ^ 728, 2948));
        C0375.m7360(str2, C0332.m6448(m4193(), 1041, C0028.f48 ^ 368, 953));
        C0375.m7360(fVar, C0383.m7518(m4193(), 1052, C0116.f142 ^ 232, 2769));
        C0375.m7360(aVar, C0056.m1071(m4193(), 1056, C0299.f447 ^ 614, 2298));
        m0.q qVar = (m0.q) mVar;
        C0393.m7698(qVar, (-768264867) ^ C0197.f221);
        int i21 = C0367.f638;
        int i22 = 1616;
        while (true) {
            i22 ^= 1633;
            switch (i22) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i22 = ((i21 ^ (-559)) & i10) == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM2013 = C0103.m2013(qVar, str);
                    int i23 = 1740;
                    while (true) {
                        i23 ^= 1757;
                        switch (i23) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i23 = zM2013 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                i20 = 2;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                i20 = 4;
                                int i24 = 1864;
                                while (true) {
                                    i24 ^= 1881;
                                    switch (i24) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i24 = 48674;
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
                    i11 = (i20 & i10) | (i20 ^ i10);
                    int i25 = 48767;
                    while (true) {
                        i25 ^= 48784;
                        switch (i25) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i25 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    i11 = i10;
                    break;
                default:
                    break;
            }
        }
        int i26 = C0258.f338;
        int i27 = 48891;
        while (true) {
            i27 ^= 48908;
            switch (i27) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    i27 = ((i26 ^ 660) & i10) == 0 ? 49635 : 48953;
                    break;
                case 32495:
                    boolean zM2014 = C0103.m2013(qVar, str2);
                    int i28 = 49666;
                    while (true) {
                        i28 ^= 49683;
                        switch (i28) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i28 = zM2014 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                i19 = 32;
                                int i29 = 49790;
                                while (true) {
                                    i29 ^= 49807;
                                    switch (i29) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i29 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                i19 = 16;
                                break;
                            default:
                                break;
                        }
                    }
                    i11 = (i11 & i19) | (i11 ^ i19);
                    break;
                default:
                    break;
            }
        }
        int i30 = C0005.f1063;
        int i31 = 49914;
        while (true) {
            i31 ^= 49931;
            switch (i31) {
                case 497:
                    i31 = ((i30 ^ 392) & i10) == 0 ? 50658 : 50627;
                    break;
                case 1711:
                    break;
                case 1736:
                    break;
                case 1769:
                    boolean zM4326 = C0224.m4326(qVar, z10);
                    int i32 = 50689;
                    while (true) {
                        i32 ^= 50706;
                        switch (i32) {
                            case 19:
                                i32 = zM4326 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                i18 = 128;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                i18 = 256;
                                int i33 = 50813;
                                while (true) {
                                    i33 ^= 50830;
                                    switch (i33) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 243:
                                            i33 = 50844;
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
                    i11 = (i11 & i18) | (i11 ^ i18);
                    break;
                default:
                    break;
            }
        }
        int i34 = C0394.f665;
        int i35 = 51588;
        while (true) {
            i35 ^= 51605;
            switch (i35) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i35 = ((i34 ^ 7247) & i10) == 0 ? 51681 : 51650;
                    break;
                case 54:
                    break;
                case 87:
                    break;
                case 116:
                    boolean zM2015 = C0103.m2013(qVar, fVar);
                    int i36 = 51712;
                    while (true) {
                        i36 ^= 51729;
                        switch (i36) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i36 = zM2015 ? 51805 : 51774;
                                break;
                            case 47:
                                i17 = 1024;
                                break;
                            case 76:
                                i17 = 2048;
                                int i37 = 51836;
                                while (true) {
                                    i37 ^= 51853;
                                    switch (i37) {
                                        case 241:
                                            i37 = 52518;
                                            continue;
                                        case 1963:
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
                    i11 = (i11 & i17) | (i11 ^ i17);
                    break;
                default:
                    break;
            }
        }
        int i38 = 52611;
        while (true) {
            i38 ^= 52628;
            switch (i38) {
                case 23:
                    i38 = (((-57345) ^ i10) & i10) == 0 ? 52704 : 52673;
                    break;
                case 54:
                    break;
                case 85:
                    break;
                case 116:
                    boolean zM5551 = C0288.m5551(qVar, aVar);
                    int i39 = 52735;
                    while (true) {
                        i39 ^= 52752;
                        switch (i39) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                i16 = 8192;
                                break;
                            case 1007:
                                i39 = zM5551 ? 53479 : 52797;
                                break;
                            case 7927:
                                i16 = 16384;
                                int i40 = 53510;
                                while (true) {
                                    i40 ^= 53527;
                                    switch (i40) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i40 = 53541;
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
                    i11 = (i11 & i16) | (i11 ^ i16);
                    break;
                default:
                    break;
            }
        }
        int i41 = 53634;
        while (true) {
            i41 ^= 53651;
            switch (i41) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i41 = (46811 & ((i11 ^ (-1)) ^ 46811)) == 9362 ? 53727 : 53696;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    boolean zM1625 = C0074.m1625(qVar);
                    int i42 = 53758;
                    while (true) {
                        i42 ^= 53775;
                        switch (i42) {
                            case 1009:
                                i42 = !zM1625 ? 54502 : 54471;
                                break;
                            case 1703:
                                break;
                            case 1736:
                                C0470.m9156(qVar);
                                int i43 = 54657;
                                while (true) {
                                    i43 ^= 54674;
                                    switch (i43) {
                                        case 19:
                                            i43 = 54688;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 1769:
                                int i44 = 54533;
                                while (true) {
                                    i44 ^= 54550;
                                    switch (i44) {
                                        case 19:
                                            i44 = 54564;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        default:
                                            continue;
                                    }
                                    y0.o oVarM245 = C0013.m245(C0123.m2371(), 0.0f, 4, 1);
                                    C0261.m4990(qVar, (-853160324) ^ C0377.f648);
                                    i12 = 55432;
                                    while (true) {
                                        i12 ^= 55449;
                                        switch (i12) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i12 = (((-57345) ^ i11) & i11) == 16384 ? 55525 : 55494;
                                                break;
                                            case 62:
                                                break;
                                            case 95:
                                                z11 = false;
                                                break;
                                            case 124:
                                                i15 = 55556;
                                                while (true) {
                                                    i15 ^= 55573;
                                                    switch (i15) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i15 = 55587;
                                                            continue;
                                                            continue;
                                                        case 54:
                                                            z11 = true;
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
                                    }
                                    objM8078 = C0411.m8078(qVar);
                                    i13 = 55680;
                                    while (true) {
                                        i13 ^= 55697;
                                        switch (i13) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i13 = !z11 ? 56424 : 56393;
                                                break;
                                            case 1467:
                                                break;
                                            case 1496:
                                                e1Var = new u.e1(aVar, C0004.f1062 ^ (-216));
                                                C0478.m9328(qVar, e1Var);
                                                break;
                                            case 1529:
                                                y0VarM2417 = C0125.m2417();
                                                i14 = 56455;
                                                while (true) {
                                                    i14 ^= 56472;
                                                    switch (i14) {
                                                        case 31:
                                                            i14 = objM8078 == y0VarM2417 ? 56548 : 56517;
                                                            break;
                                                        case 62:
                                                            break;
                                                        case 93:
                                                            e1Var = objM8078;
                                                            break;
                                                        case 124:
                                                            e1Var = new u.e1(aVar, C0004.f1062 ^ (-216));
                                                            C0478.m9328(qVar, e1Var);
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
                                    C0171.m3270(qVar, false);
                                    C0271.m5230(C0446.m8712(oVarM245, (c9.a) e1Var), C0419.m8237(C0172.f196 ^ 300), C0067.m1299(C0104.m2039(), qVar, 0), null, null, C0059.m1122(qVar, (-1439878102) ^ C0142.f168, new x0(z10, fVar, str, str2, 0)), qVar, 197348 ^ C0258.f338, C0424.f695 ^ 543);
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 83:
                    y0.o oVarM246 = C0013.m245(C0123.m2371(), 0.0f, 4, 1);
                    C0261.m4990(qVar, (-853160324) ^ C0377.f648);
                    i12 = 55432;
                    while (true) {
                        i12 ^= 55449;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if ((((-57345) ^ i11) & i11) == 16384) {
                                }
                                break;
                            case 62:
                                break;
                            case 95:
                                z11 = false;
                                break;
                            case 124:
                                i15 = 55556;
                                while (true) {
                                    i15 ^= 55573;
                                    switch (i15) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i15 = 55587;
                                            continue;
                                            continue;
                                        case 54:
                                            z11 = true;
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
                    }
                    objM8078 = C0411.m8078(qVar);
                    i13 = 55680;
                    while (true) {
                        i13 ^= 55697;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!z11) {
                                }
                                break;
                            case 1467:
                                break;
                            case 1496:
                                e1Var = new u.e1(aVar, C0004.f1062 ^ (-216));
                                C0478.m9328(qVar, e1Var);
                                break;
                            case 1529:
                                y0VarM2417 = C0125.m2417();
                                i14 = 56455;
                                while (true) {
                                    i14 ^= 56472;
                                    switch (i14) {
                                        case 31:
                                            if (objM8078 == y0VarM2417) {
                                            }
                                            break;
                                        case 62:
                                            break;
                                        case 93:
                                            e1Var = objM8078;
                                            break;
                                        case 124:
                                            e1Var = new u.e1(aVar, C0004.f1062 ^ (-216));
                                            C0478.m9328(qVar, e1Var);
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
                    C0171.m3270(qVar, false);
                    C0271.m5230(C0446.m8712(oVarM246, (c9.a) e1Var), C0419.m8237(C0172.f196 ^ 300), C0067.m1299(C0104.m2039(), qVar, 0), null, null, C0059.m1122(qVar, (-1439878102) ^ C0142.f168, new x0(z10, fVar, str, str2, 0)), qVar, 197348 ^ C0258.f338, C0424.f695 ^ 543);
                    break;
                default:
                    break;
            }
            m0.x1 x1VarM7533 = C0384.m7533(qVar);
            int i45 = 56579;
            while (true) {
                i45 ^= 56596;
                switch (i45) {
                    case 23:
                        i45 = x1VarM7533 != null ? 1507472 : 56641;
                        break;
                    case 54:
                        break;
                    case 85:
                        break;
                    case 1564036:
                        x1VarM7533.f11756d = new y0(str, str2, z10, fVar, aVar, i10, 0);
                        break;
                    default:
                        break;
                }
            }
            int iM2408 = C0125.m2408();
            int i46 = 1507503;
            while (true) {
                i46 ^= 1507520;
                switch (i46) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        return;
                    case 111:
                        if (iM2408 <= 0) {
                            i46 = 1507596;
                        }
                        break;
                    case 460:
                        System.out.println(Double.parseDouble(C0247.m4733("7oyvcrE0D64OsoKV0TOfx5EdK7H")));
                        return;
                    default:
                        continue;
                }
                i46 = 1507565;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:212:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x021a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x021a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x021f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x02ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x02f4 A[SYNTHETIC] */
    public static final void h(String str, String str2, m0.m mVar, int i10) {
        int i11;
        int i12;
        m0.x1 x1VarM7533;
        int i13;
        int iM6259;
        int i14;
        r1.j0 j0VarM4288;
        int iM276;
        m0.r1 r1VarM275;
        t1.j jVarM4451;
        u0.b bVarM6976;
        boolean z10;
        int i15;
        boolean zM7502;
        int i16;
        t1.i iVarM5562;
        boolean zM7503;
        int i17;
        boolean zM4399;
        int i18;
        int i19;
        int i20;
        int i21;
        C0375.m7360(str, C0463.m9022(m4193(), 1063, C0040.f60 ^ (-86), 1590));
        C0375.m7360(str2, C0354.m6950(m4193(), 1068, C0230.f310 ^ (-778), 559));
        m0.q qVar = (m0.q) mVar;
        C0393.m7698(qVar, 925093177 ^ C0126.f152);
        int i22 = C0031.f51;
        int i23 = 1616;
        while (true) {
            i23 ^= 1633;
            switch (i23) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i23 = ((i22 ^ (-152)) & i10) == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM2013 = C0103.m2013(qVar, str);
                    int i24 = 1740;
                    while (true) {
                        i24 ^= 1757;
                        switch (i24) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i24 = zM2013 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                i21 = 2;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                i21 = 4;
                                int i25 = 1864;
                                while (true) {
                                    i25 ^= 1881;
                                    switch (i25) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i25 = 48674;
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
                    i11 = (i21 & i10) | (i21 ^ i10);
                    int i26 = 48767;
                    while (true) {
                        i26 ^= 48784;
                        switch (i26) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i26 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    i11 = i10;
                    break;
                default:
                    break;
            }
        }
        int i27 = C0453.f724;
        int i28 = 48891;
        while (true) {
            i28 ^= 48908;
            switch (i28) {
                case 22:
                    break;
                case 53:
                    i12 = i11;
                    break;
                case 503:
                    i28 = ((i27 ^ 783) & i10) == 0 ? 49635 : 48953;
                    break;
                case 32495:
                    boolean zM2014 = C0103.m2013(qVar, str2);
                    int i29 = 49666;
                    while (true) {
                        i29 ^= 49683;
                        switch (i29) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i29 = zM2014 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                i20 = 32;
                                int i30 = 49790;
                                while (true) {
                                    i30 ^= 49807;
                                    switch (i30) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i30 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                i20 = 16;
                                break;
                            default:
                                break;
                        }
                    }
                    i12 = (i11 & i20) | (i11 ^ i20);
                    break;
                default:
                    break;
            }
        }
        int i31 = C0222.f302;
        int i32 = 49914;
        while (true) {
            i32 ^= 49931;
            switch (i32) {
                case 497:
                    i32 = ((i31 ^ 415) & i12) == 18 ? 50658 : 50627;
                    break;
                case 1711:
                    break;
                case 1736:
                    y0.o oVarM245 = C0013.m245(C0123.m2371(), 0.0f, 4, 1);
                    y.f fVarM6623 = C0337.m6623();
                    C0261.m4990(qVar, (-693285967) ^ C0437.f708);
                    j0VarM4288 = C0222.m4288(fVarM6623, C0392.m7688(), qVar);
                    C0261.m4990(qVar, 1323940014 ^ C0369.f640);
                    iM276 = C0014.m276(qVar);
                    r1VarM275 = C0014.m275(qVar);
                    C0014.m280(C0379.m7428());
                    jVarM4451 = C0231.m4451();
                    bVarM6976 = C0355.m6976(oVarM245);
                    z10 = C0196.m3764(qVar) instanceof m0.d;
                    i15 = 51712;
                    while (true) {
                        i15 ^= 51729;
                        switch (i15) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = z10 ? 51805 : 51774;
                                break;
                            case 47:
                                C0235.m4537();
                                throw null;
                            case 76:
                                C0100.m1961(qVar);
                                zM7502 = C0382.m7502(qVar);
                                i16 = 51836;
                                while (true) {
                                    i16 ^= 51853;
                                    switch (i16) {
                                        case 241:
                                            i16 = zM7502 ? 52580 : 52549;
                                            break;
                                        case 1963:
                                            break;
                                        case 1992:
                                            C0445.m8685(qVar);
                                            break;
                                        case 2025:
                                            C0017.m346(qVar, jVarM4451);
                                            i19 = 52611;
                                            while (true) {
                                                i19 ^= 52628;
                                                switch (i19) {
                                                    case 23:
                                                        i19 = 52642;
                                                        continue;
                                                        continue;
                                                    case 54:
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
                                }
                                C0089.m1904(qVar, j0VarM4288, C0063.m1208());
                                C0089.m1904(qVar, r1VarM275, C0464.m9055());
                                iVarM5562 = C0289.m5562();
                                zM7503 = C0382.m7502(qVar);
                                i17 = 52735;
                                while (true) {
                                    i17 ^= 52752;
                                    switch (i17) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                            break;
                                        case 1007:
                                            i17 = !zM7503 ? 53479 : 52797;
                                            break;
                                        case 7927:
                                            zM4399 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM276));
                                            i18 = 53510;
                                            while (true) {
                                                i18 ^= 53527;
                                                switch (i18) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i18 = !zM4399 ? 53603 : 53572;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 83:
                                                        break;
                                                    case 116:
                                                        C0133.m2574(iM276, qVar, iM276, iVarM5562);
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
                                C0352.m6912(0, bVarM6976, new l2(qVar), qVar, (-2058660243) ^ C0403.f674);
                                long jM41 = C0001.m41();
                                int i33 = C0053.f73 ^ (-156);
                                C0185.m3537(str, null, jM41, C0135.m2601(i33), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, (C0400.f671 ^ 3194) | ((C0257.f337 ^ (-338)) & i12), 0, C0284.f429 ^ 130090);
                                f2.l lVarM3904 = C0204.m3904();
                                long jM1964 = C0100.m1964();
                                long jM2601 = C0135.m2601(i33);
                                int i34 = (i12 >> (C0039.f59 ^ 821)) & (C0450.f721 ^ (-677));
                                C0185.m3537(str2, null, jM1964, jM2601, null, lVarM3904, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, (199680 ^ i34) | (i34 & 199680), 0, C0115.f141 ^ (-130542));
                                C0016.m325(qVar, false, true, false, false);
                                break;
                            default:
                                break;
                        }
                    }
                    x1VarM7533 = C0384.m7533(qVar);
                    i13 = 53634;
                    while (true) {
                        i13 ^= 53651;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i13 = x1VarM7533 != null ? 53727 : 53696;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                x1VarM7533.f11756d = new u.x(str, str2, i10, C0446.f717 ^ (-34));
                                break;
                            case 83:
                                break;
                            default:
                                break;
                        }
                    }
                    iM6259 = C0323.m6259();
                    i14 = 53758;
                    while (true) {
                        i14 ^= 53775;
                        switch (i14) {
                            case 1009:
                                if (iM6259 >= 0) {
                                    i14 = 54502;
                                }
                                break;
                            case 1703:
                                break;
                            case 1736:
                                return;
                            case 1769:
                                System.out.println(Double.decode(C0335.m6509("atDqYv5EfkdIYuPMGTFaZEN")));
                                return;
                            default:
                                continue;
                                continue;
                                continue;
                        }
                        i14 = 54471;
                    }
                    break;
                case 1769:
                    boolean zM1625 = C0074.m1625(qVar);
                    int i35 = 50689;
                    while (true) {
                        i35 ^= 50706;
                        switch (i35) {
                            case 19:
                                i35 = !zM1625 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                C0470.m9156(qVar);
                                int i36 = 51588;
                                while (true) {
                                    i36 ^= 51605;
                                    switch (i36) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i36 = 51619;
                                            continue;
                                        case 54:
                                            break;
                                        default:
                                            continue;
                                    }
                                    x1VarM7533 = C0384.m7533(qVar);
                                    i13 = 53634;
                                    while (true) {
                                        i13 ^= 53651;
                                        switch (i13) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (x1VarM7533 != null) {
                                                }
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                x1VarM7533.f11756d = new u.x(str, str2, i10, C0446.f717 ^ (-34));
                                                break;
                                            case 83:
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    iM6259 = C0323.m6259();
                                    i14 = 53758;
                                    while (true) {
                                        i14 ^= 53775;
                                        switch (i14) {
                                            case 1009:
                                                if (iM6259 >= 0) {
                                                    i14 = 54502;
                                                }
                                                break;
                                            case 1703:
                                                break;
                                            case 1736:
                                                return;
                                            case 1769:
                                                System.out.println(Double.decode(C0335.m6509("atDqYv5EfkdIYuPMGTFaZEN")));
                                                return;
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        i14 = 54471;
                                    }
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                int i37 = 50813;
                                while (true) {
                                    i37 ^= 50830;
                                    switch (i37) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 243:
                                            i37 = 50844;
                                            continue;
                                        default:
                                            continue;
                                    }
                                    y0.o oVarM246 = C0013.m245(C0123.m2371(), 0.0f, 4, 1);
                                    y.f fVarM6624 = C0337.m6623();
                                    C0261.m4990(qVar, (-693285967) ^ C0437.f708);
                                    j0VarM4288 = C0222.m4288(fVarM6624, C0392.m7688(), qVar);
                                    C0261.m4990(qVar, 1323940014 ^ C0369.f640);
                                    iM276 = C0014.m276(qVar);
                                    r1VarM275 = C0014.m275(qVar);
                                    C0014.m280(C0379.m7428());
                                    jVarM4451 = C0231.m4451();
                                    bVarM6976 = C0355.m6976(oVarM246);
                                    z10 = C0196.m3764(qVar) instanceof m0.d;
                                    i15 = 51712;
                                    while (true) {
                                        i15 ^= 51729;
                                        switch (i15) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (z10) {
                                                }
                                                break;
                                            case 47:
                                                C0235.m4537();
                                                throw null;
                                            case 76:
                                                C0100.m1961(qVar);
                                                zM7502 = C0382.m7502(qVar);
                                                i16 = 51836;
                                                while (true) {
                                                    i16 ^= 51853;
                                                    switch (i16) {
                                                        case 241:
                                                            if (zM7502) {
                                                            }
                                                            break;
                                                        case 1963:
                                                            break;
                                                        case 1992:
                                                            C0445.m8685(qVar);
                                                            break;
                                                        case 2025:
                                                            C0017.m346(qVar, jVarM4451);
                                                            i19 = 52611;
                                                            while (true) {
                                                                i19 ^= 52628;
                                                                switch (i19) {
                                                                    case 23:
                                                                        i19 = 52642;
                                                                        continue;
                                                                        continue;
                                                                    case 54:
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
                                                }
                                                C0089.m1904(qVar, j0VarM4288, C0063.m1208());
                                                C0089.m1904(qVar, r1VarM275, C0464.m9055());
                                                iVarM5562 = C0289.m5562();
                                                zM7503 = C0382.m7502(qVar);
                                                i17 = 52735;
                                                while (true) {
                                                    i17 ^= 52752;
                                                    switch (i17) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                            break;
                                                        case 1007:
                                                            if (!zM7503) {
                                                            }
                                                            break;
                                                        case 7927:
                                                            zM4399 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM276));
                                                            i18 = 53510;
                                                            while (true) {
                                                                i18 ^= 53527;
                                                                switch (i18) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (!zM4399) {
                                                                        }
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 83:
                                                                        break;
                                                                    case 116:
                                                                        C0133.m2574(iM276, qVar, iM276, iVarM5562);
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
                                                C0352.m6912(0, bVarM6976, new l2(qVar), qVar, (-2058660243) ^ C0403.f674);
                                                long jM42 = C0001.m41();
                                                int i38 = C0053.f73 ^ (-156);
                                                C0185.m3537(str, null, jM42, C0135.m2601(i38), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, (C0400.f671 ^ 3194) | ((C0257.f337 ^ (-338)) & i12), 0, C0284.f429 ^ 130090);
                                                f2.l lVarM3905 = C0204.m3904();
                                                long jM1965 = C0100.m1964();
                                                long jM2602 = C0135.m2601(i38);
                                                int i39 = (i12 >> (C0039.f59 ^ 821)) & (C0450.f721 ^ (-677));
                                                C0185.m3537(str2, null, jM1965, jM2602, null, lVarM3905, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, (199680 ^ i39) | (i39 & 199680), 0, C0115.f141 ^ (-130542));
                                                C0016.m325(qVar, false, true, false, false);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    x1VarM7533 = C0384.m7533(qVar);
                                    i13 = 53634;
                                    while (true) {
                                        i13 ^= 53651;
                                        switch (i13) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (x1VarM7533 != null) {
                                                }
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                x1VarM7533.f11756d = new u.x(str, str2, i10, C0446.f717 ^ (-34));
                                                break;
                                            case 83:
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    iM6259 = C0323.m6259();
                                    i14 = 53758;
                                    while (true) {
                                        i14 ^= 53775;
                                        switch (i14) {
                                            case 1009:
                                                if (iM6259 >= 0) {
                                                    i14 = 54502;
                                                }
                                                break;
                                            case 1703:
                                                break;
                                            case 1736:
                                                return;
                                            case 1769:
                                                System.out.println(Double.decode(C0335.m6509("atDqYv5EfkdIYuPMGTFaZEN")));
                                                return;
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        i14 = 54471;
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
    }

    /* JADX WARN: Code duplicated, block: B:479:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x0225 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x023c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x029e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x02af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:0x0283 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x02ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:0x031c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:0x0324 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:0x032d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x0347 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:0x034f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0353 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x034f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:0x034b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:0x033f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x037a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:0x0397 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x0380 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x03bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x03b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:0x03e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:0x03f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x03fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:0x03ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x0417 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x041b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x0425 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x0430 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x0421 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x0417 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:0x040f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x044a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:0x0452 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:0x0456 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x0460 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x0452 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x044e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x0442 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x04d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x04d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x04dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:0x0520 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x04d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x04d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:0x04cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x0513 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:0x0550 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:0x04f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:0x04f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:0x04fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:0x04f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:0x04f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:0x04ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:0x0531 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x0552 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x0556 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x076c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x0552 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:0x0533 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x0529 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x0576 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x057a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:0x0582 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x058c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x057e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:0x0576 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x056d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x05a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x05b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x05bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:0x05ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x05a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x060b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x060f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x061a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x0713 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x0616 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x060b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:0x0603 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x0625 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x0629 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:0x0631 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x0640 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:0x062d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x0625 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:0x061d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x063c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:0x0713 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:0x0634 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x0640 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x0728 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x0720 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:0x064b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:0x070e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:0x0643 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:0x070a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:0x072c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:0x0732 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:0x0743 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:0x072e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:0x070a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:0x0702 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:0x0752 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:0x0756 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:0x075c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:0x076b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:0x0758 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:0x0752 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:0x074a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:0x0509 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:0x050f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:0x053b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:0x050f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:0x050b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:0x0501 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:0x051e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:0x0537 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:0x0516 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:0x054c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:0x0544 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:122:0x021f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:129:0x0238. Please report as an issue. */
    public static final void i(MainViewModel mainViewModel, UserProfile userProfile, c9.a aVar, c9.a aVar2, m0.m mVar, int i10) {
        int i11;
        m0.x1 x1VarM7533;
        int i12;
        int iM6746;
        int i13;
        m0.g1 g1VarM8775;
        m0.g1 g1VarM8776;
        m0.g1 g1VarM8777;
        m0.g1 g1VarM8778;
        FirebaseUser firebaseUserM5359;
        String strM8581;
        int i14;
        String str;
        Object objM8078;
        Object objM2417;
        o3 o3VarM2137;
        int i15;
        m0.g1 g1Var;
        Object objM6985;
        int i16;
        m0.g1 g1Var2;
        Object objM6986;
        int i17;
        m0.g1 g1Var3;
        Object objM6987;
        int i18;
        m0.g1 g1Var4;
        Object objM6988;
        int i19;
        m0.g1 g1Var5;
        Object objM6989;
        int i20;
        m0.g1 g1Var6;
        Object objM69810;
        int i21;
        m0.g1 g1Var7;
        Object objM69811;
        int i22;
        m0.g1 g1Var8;
        Object objM69812;
        int i23;
        a3 a3Var;
        m3 m3VarM7636;
        Context context;
        e.c cVar;
        m0.g1 g1VarM862;
        String str2;
        d.j jVar;
        int i24;
        int i25;
        Object objM8079;
        int i26;
        b.a aVar3;
        Object objM80710;
        int i27;
        b.l lVar;
        b.d dVar;
        boolean z10;
        boolean zM2013;
        Object objM80711;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Object objM2584;
        boolean z11;
        int i33;
        boolean z12;
        int i34;
        int i35;
        int i36;
        String strM5149;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        C0375.m7360(mainViewModel, C0378.m7424(m4193(), 1073, C0320.f468 ^ (-813), 1113));
        C0375.m7360(aVar, C0342.m6715(m4193(), 1082, C0055.f75 ^ (-705), 595));
        C0375.m7360(aVar2, C0158.m3014(m4193(), 1088, C0416.f687 ^ (-663), 1887));
        m0.q qVar = (m0.q) mVar;
        C0393.m7698(qVar, 58941762 ^ C0161.f185);
        int i46 = C0261.f341;
        int i47 = 1616;
        while (true) {
            i47 ^= 1633;
            switch (i47) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i47 = ((i46 ^ (-876)) & i10) == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM2014 = C0103.m2013(qVar, mainViewModel);
                    int i48 = 1740;
                    while (true) {
                        i48 ^= 1757;
                        switch (i48) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i48 = zM2014 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                i45 = 2;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                i45 = 4;
                                int i49 = 1864;
                                while (true) {
                                    i49 ^= 1881;
                                    switch (i49) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i49 = 48674;
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
                    i11 = (i45 & i10) | (i45 ^ i10);
                    int i50 = 48767;
                    while (true) {
                        i50 ^= 48784;
                        switch (i50) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i50 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    i11 = i10;
                    break;
                default:
                    break;
            }
        }
        int i51 = C0367.f638;
        int i52 = 48891;
        while (true) {
            i52 ^= 48908;
            switch (i52) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    i52 = ((i51 ^ (-593)) & i10) == 0 ? 49635 : 48953;
                    break;
                case 32495:
                    boolean zM2015 = C0103.m2013(qVar, userProfile);
                    int i53 = 49666;
                    while (true) {
                        i53 ^= 49683;
                        switch (i53) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i53 = zM2015 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                i44 = 32;
                                int i54 = 49790;
                                while (true) {
                                    i54 ^= 49807;
                                    switch (i54) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i54 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                i44 = 16;
                                break;
                            default:
                                break;
                        }
                    }
                    i11 = (i11 & i44) | (i11 ^ i44);
                    break;
                default:
                    break;
            }
        }
        int i55 = C0233.f313;
        int i56 = 49914;
        while (true) {
            i56 ^= 49931;
            switch (i56) {
                case 497:
                    i56 = ((i55 ^ 702) & i10) == 0 ? 50658 : 50627;
                    break;
                case 1711:
                    break;
                case 1736:
                    break;
                case 1769:
                    boolean zM5551 = C0288.m5551(qVar, aVar);
                    int i57 = 50689;
                    while (true) {
                        i57 ^= 50706;
                        switch (i57) {
                            case 19:
                                i57 = zM5551 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                i43 = 128;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                i43 = 256;
                                int i58 = 50813;
                                while (true) {
                                    i58 ^= 50830;
                                    switch (i58) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 243:
                                            i58 = 50844;
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
                    i11 = (i11 & i43) | (i11 ^ i43);
                    break;
                default:
                    break;
            }
        }
        int i59 = C0401.f672;
        int i60 = 51588;
        while (true) {
            i60 ^= 51605;
            switch (i60) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (((i59 ^ (-7693)) & i10) == 0) {
                        i60 = 51681;
                    }
                    break;
                case 54:
                    break;
                case 87:
                    break;
                case 116:
                    boolean zM5552 = C0288.m5551(qVar, aVar2);
                    int i61 = 51712;
                    while (true) {
                        i61 ^= 51729;
                        switch (i61) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM5552) {
                                    i61 = 51805;
                                }
                                break;
                            case 47:
                                i42 = 1024;
                                break;
                            case 76:
                                i42 = 2048;
                                int i62 = 51836;
                                while (true) {
                                    i62 ^= 51853;
                                    switch (i62) {
                                        case 241:
                                            i62 = 52518;
                                            break;
                                        case 1963:
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i61 = 51774;
                    }
                    i11 = (i11 & i42) | (i11 ^ i42);
                    break;
                default:
                    continue;
            }
            i60 = 51650;
        }
        int i63 = C0109.f135;
        int i64 = 52611;
        while (true) {
            i64 ^= 52628;
            switch (i64) {
                case 23:
                    i64 = ((i63 ^ 5784) & i11) == 1170 ? 52704 : 52673;
                    break;
                case 54:
                    break;
                case 85:
                    g1VarM8775 = C0450.m8775(C0163.m3129(mainViewModel), qVar);
                    g1VarM8776 = C0450.m8775(C0452.m8813(mainViewModel), qVar);
                    g1VarM8777 = C0450.m8775(C0413.m8112(mainViewModel), qVar);
                    g1VarM8778 = C0450.m8775(C0128.m2481(mainViewModel), qVar);
                    firebaseUserM5359 = C0277.m5359(C0441.m8614());
                    strM8581 = C0439.m8581();
                    i14 = 53758;
                    while (true) {
                        i14 ^= 53775;
                        switch (i14) {
                            case 1009:
                                i14 = firebaseUserM5359 != null ? 54502 : 54471;
                                break;
                            case 1703:
                                break;
                            case 1736:
                                i38 = 55556;
                                while (true) {
                                    i38 ^= 55573;
                                    switch (i38) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i38 = userProfile != null ? 55649 : 55618;
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            str = strM8581;
                                            break;
                                        case 116:
                                            strM5149 = C0269.m5149(userProfile);
                                            i39 = 55680;
                                            while (true) {
                                                i39 ^= 55697;
                                                switch (i39) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i39 = 56362;
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                    case 1467:
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                                i37 = 55432;
                                                while (true) {
                                                    i37 ^= 55449;
                                                    switch (i37) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i37 = 55463;
                                                            continue;
                                                            continue;
                                                            continue;
                                                            continue;
                                                            continue;
                                                            continue;
                                                        case 62:
                                                            str = strM5149;
                                                            break;
                                                        default:
                                                            continue;
                                                            continue;
                                                            continue;
                                                            continue;
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
                            case 1769:
                                strM5149 = C0400.m7836(firebaseUserM5359);
                                i40 = 54533;
                                while (true) {
                                    i40 ^= 54550;
                                    switch (i40) {
                                        case 19:
                                            i40 = strM5149 == null ? 54626 : 54595;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 85:
                                            i37 = 55432;
                                            while (true) {
                                                i37 ^= 55449;
                                                switch (i37) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i37 = 55463;
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                    case 62:
                                                        str = strM5149;
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 116:
                                            i41 = 54657;
                                            while (true) {
                                                i41 ^= 54674;
                                                switch (i41) {
                                                    case 19:
                                                        i41 = 54688;
                                                        continue;
                                                        continue;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                }
                                                i38 = 55556;
                                                while (true) {
                                                    i38 ^= 55573;
                                                    switch (i38) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (userProfile != null) {
                                                            }
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 87:
                                                            str = strM8581;
                                                            break;
                                                        case 116:
                                                            strM5149 = C0269.m5149(userProfile);
                                                            i39 = 55680;
                                                            while (true) {
                                                                i39 ^= 55697;
                                                                switch (i39) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i39 = 56362;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    case 1467:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                                i37 = 55432;
                                                                while (true) {
                                                                    i37 ^= 55449;
                                                                    switch (i37) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i37 = 55463;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        case 62:
                                                                            str = strM5149;
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
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
                        C0189.m3608(str);
                        C0261.m4990(qVar, 678310201 ^ C0280.f425);
                        objM8078 = C0411.m8078(qVar);
                        objM2417 = C0125.m2417();
                        o3VarM2137 = C0111.m2137();
                        i15 = 56455;
                        while (true) {
                            i15 ^= 56472;
                            switch (i15) {
                                case 31:
                                    i15 = objM8078 == objM2417 ? 56548 : 56517;
                                    break;
                                case 62:
                                    break;
                                case 93:
                                    break;
                                case 124:
                                    objM8078 = C0173.m3305(C0455.m8876(), o3VarM2137);
                                    C0478.m9328(qVar, objM8078);
                                    break;
                                default:
                                    break;
                            }
                        }
                        g1Var = (m0.g1) objM8078;
                        objM6985 = C0356.m6985(qVar, false, (-678310894) ^ C0338.f609);
                        i16 = 56579;
                        while (true) {
                            i16 ^= 56596;
                            switch (i16) {
                                case 23:
                                    i16 = objM6985 == objM2417 ? 1507472 : 56641;
                                    break;
                                case 54:
                                    break;
                                case 85:
                                    break;
                                case 1564036:
                                    objM6985 = C0173.m3305(strM8581, o3VarM2137);
                                    C0478.m9328(qVar, objM6985);
                                    break;
                                default:
                                    break;
                            }
                        }
                        g1Var2 = (m0.g1) objM6985;
                        objM6986 = C0356.m6985(qVar, false, 678310103 ^ C0078.f112);
                        i17 = 1507503;
                        while (true) {
                            i17 ^= 1507520;
                            switch (i17) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    break;
                                case 111:
                                    i17 = objM6986 == objM2417 ? 1507596 : 1507565;
                                    break;
                                case 460:
                                    objM6986 = C0173.m3305(strM8581, o3VarM2137);
                                    C0478.m9328(qVar, objM6986);
                                    break;
                                default:
                                    break;
                            }
                        }
                        g1Var3 = (m0.g1) objM6986;
                        objM6987 = C0356.m6985(qVar, false, 678310883 ^ C0282.f427);
                        i18 = 1507627;
                        while (true) {
                            i18 ^= 1507644;
                            switch (i18) {
                                case 23:
                                    i18 = objM6987 == objM2417 ? 1507720 : 1507689;
                                    break;
                                case 85:
                                    break;
                                case 118:
                                    break;
                                case 180:
                                    objM6987 = C0173.m3305(C0455.m8876(), o3VarM2137);
                                    C0478.m9328(qVar, objM6987);
                                    break;
                                default:
                                    break;
                            }
                        }
                        g1Var4 = (m0.g1) objM6987;
                        objM6988 = C0356.m6985(qVar, false, 678309354 ^ C0058.f78);
                        i19 = 1507751;
                        while (true) {
                            i19 ^= 1507768;
                            switch (i19) {
                                case 31:
                                    i19 = objM6988 == objM2417 ? 1508495 : 1508464;
                                    break;
                                case 1335:
                                    objM6988 = C0173.m3305(C0455.m8876(), o3VarM2137);
                                    C0478.m9328(qVar, objM6988);
                                    break;
                                case 1480:
                                    break;
                                case 1513:
                                    break;
                                default:
                                    break;
                            }
                        }
                        g1Var5 = (m0.g1) objM6988;
                        objM6989 = C0356.m6985(qVar, false, (-678308940) ^ C0284.f429);
                        i20 = 1508526;
                        while (true) {
                            i20 ^= 1508543;
                            switch (i20) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i20 = objM6989 == objM2417 ? 1508619 : 1508588;
                                    break;
                                case 83:
                                    break;
                                case 114:
                                    break;
                                case 436:
                                    objM6989 = C0173.m3305(strM8581, o3VarM2137);
                                    C0478.m9328(qVar, objM6989);
                                    break;
                                default:
                                    break;
                            }
                        }
                        g1Var6 = (m0.g1) objM6989;
                        objM69810 = C0356.m6985(qVar, false, (-678309809) ^ C0116.f142);
                        i21 = 1508650;
                        while (true) {
                            i21 ^= 1508667;
                            switch (i21) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i21 = objM69810 == objM2417 ? 1509394 : 1508712;
                                    break;
                                case 83:
                                    break;
                                case 114:
                                    break;
                                case 3369:
                                    objM69810 = C0173.m3305(strM8581, o3VarM2137);
                                    C0478.m9328(qVar, objM69810);
                                    break;
                                default:
                                    break;
                            }
                        }
                        g1Var7 = (m0.g1) objM69810;
                        objM69811 = C0356.m6985(qVar, false, (-678309159) ^ C0034.f54);
                        i22 = 1509425;
                        while (true) {
                            i22 ^= 1509442;
                            switch (i22) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    break;
                                case 115:
                                    i22 = objM69811 == objM2417 ? 1509518 : 1509487;
                                    break;
                                case 204:
                                    objM69811 = C0173.m3305(strM8581, o3VarM2137);
                                    C0478.m9328(qVar, objM69811);
                                    break;
                                default:
                                    break;
                            }
                        }
                        g1Var8 = (m0.g1) objM69811;
                        objM69812 = C0356.m6985(qVar, false, (-678309535) ^ C0400.f671);
                        i23 = 1509549;
                        while (true) {
                            i23 ^= 1509566;
                            switch (i23) {
                                case 19:
                                    i23 = objM69812 == objM2417 ? 1509642 : 1509611;
                                    break;
                                case 85:
                                    break;
                                case 114:
                                    break;
                                case 436:
                                    objM69812 = new a3();
                                    C0478.m9328(qVar, objM69812);
                                    break;
                                default:
                                    break;
                            }
                        }
                        a3Var = (a3) objM69812;
                        C0171.m3270(qVar, false);
                        m3VarM7636 = C0390.m7636();
                        context = (Context) C0475.m9256(qVar, m3VarM7636);
                        cVar = new e.c(0);
                        i1 i1Var = new i1(0, context, mainViewModel);
                        C0261.m4990(qVar, 1408503966 ^ C0131.f157);
                        C0044.m862(cVar, qVar);
                        g1VarM862 = C0044.m862(i1Var, qVar);
                        str2 = (String) C0180.m3449(new Object[0], null, C0437.m8537(), qVar, C0214.f238 ^ 202);
                        C0168.m3219();
                        C0261.m4990(qVar, 1418020843 ^ C0201.f225);
                        jVar = (d.j) C0475.m9256(qVar, C0168.m3219());
                        i24 = 1509673;
                        while (true) {
                            i24 ^= 1509690;
                            switch (i24) {
                                case 19:
                                    i24 = jVar == null ? 1510417 : 1510386;
                                    break;
                                case 712:
                                    break;
                                case 745:
                                    break;
                                case 1323:
                                    objM2584 = (Context) C0475.m9256(qVar, m3VarM7636);
                                    while (true) {
                                        z11 = objM2584 instanceof ContextWrapper;
                                        i33 = 1510448;
                                        while (true) {
                                            i33 ^= 1510465;
                                            switch (i33) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 47:
                                                    objM2584 = null;
                                                    break;
                                                case 113:
                                                    i33 = z11 ? 1510541 : 1510510;
                                                    break;
                                                case 204:
                                                    z12 = objM2584 instanceof d.j;
                                                    i34 = 1510572;
                                                    while (true) {
                                                        i34 ^= 1510589;
                                                        switch (i34) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i34 = z12 ? 1511316 : 1510634;
                                                                break;
                                                            case 87:
                                                                objM2584 = C0134.m2584((ContextWrapper) objM2584);
                                                                i35 = 1511471;
                                                                while (true) {
                                                                    i35 ^= 1511488;
                                                                    switch (i35) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case 111:
                                                                            i35 = 1511502;
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 118:
                                                                break;
                                                            case 809:
                                                                i36 = 1511347;
                                                                while (true) {
                                                                    i36 ^= 1511364;
                                                                    switch (i36) {
                                                                        case 22:
                                                                            break;
                                                                        case 119:
                                                                            i36 = 1511378;
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
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    }
                                    jVar = (d.j) objM2584;
                                    break;
                                default:
                                    break;
                            }
                        }
                        C0171.m3270(qVar, false);
                        i25 = 1511595;
                        while (true) {
                            i25 ^= 1511612;
                            switch (i25) {
                                case 23:
                                    i25 = jVar != null ? 1512339 : 1512308;
                                    break;
                                case 815:
                                    d.i iVarM3235 = C0169.m3235(jVar);
                                    int i65 = 3686646 ^ C0479.f753;
                                    C0261.m4990(qVar, i65);
                                    objM8079 = C0411.m8078(qVar);
                                    i26 = 1512370;
                                    while (true) {
                                        i26 ^= 1512387;
                                        switch (i26) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 51:
                                                break;
                                            case 113:
                                                i26 = objM8079 == objM2417 ? 1512463 : 1512432;
                                                break;
                                            case 1996:
                                                objM8079 = new b.a();
                                                C0478.m9328(qVar, objM8079);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    C0171.m3270(qVar, false);
                                    aVar3 = (b.a) objM8079;
                                    C0261.m4990(qVar, i65);
                                    objM80710 = C0411.m8078(qVar);
                                    i27 = 1512494;
                                    while (true) {
                                        i27 ^= 1512511;
                                        switch (i27) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i27 = objM80710 == objM2417 ? 1513238 : 1512556;
                                                break;
                                            case 83:
                                                break;
                                            case 114:
                                                break;
                                            case 809:
                                                objM80710 = new b.l(aVar3);
                                                C0478.m9328(qVar, objM80710);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    C0171.m3270(qVar, false);
                                    lVar = (b.l) objM80710;
                                    dVar = new b.d(aVar3, iVarM3235, str2, cVar, g1VarM862, 0);
                                    C0261.m4990(qVar, (-1239537737) ^ C0351.f622);
                                    C0261.m4990(qVar, (-1618982892) ^ C0173.f197);
                                    boolean zM2016 = C0103.m2013(qVar, iVarM3235);
                                    boolean zM2017 = C0103.m2013(qVar, str2);
                                    z10 = (zM2017 ^ zM2016) | (zM2016 & zM2017);
                                    zM2013 = C0103.m2013(qVar, cVar);
                                    objM80711 = C0411.m8078(qVar);
                                    i28 = 1513269;
                                    while (true) {
                                        i28 ^= 1513286;
                                        switch (i28) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 53:
                                                C0478.m9328(qVar, new m0.m0(dVar));
                                                i30 = 1514416;
                                                while (true) {
                                                    i30 ^= 1514433;
                                                    switch (i30) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case 113:
                                                            i30 = 1514447;
                                                            continue;
                                                            continue;
                                                            continue;
                                                            continue;
                                                        default:
                                                            continue;
                                                            continue;
                                                            continue;
                                                            continue;
                                                    }
                                                }
                                                break;
                                            case 115:
                                                i28 = !((z10 ^ zM2013) | (z10 & zM2013)) ? 1513362 : 1513331;
                                                break;
                                            case 212:
                                                i31 = 1513393;
                                                while (true) {
                                                    i31 ^= 1513410;
                                                    switch (i31) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            break;
                                                        case 115:
                                                            i31 = objM80711 == objM2417 ? 1513486 : 1513455;
                                                            break;
                                                        case 4044:
                                                            i32 = 1513517;
                                                            while (true) {
                                                                i32 ^= 1513534;
                                                                switch (i32) {
                                                                    case 19:
                                                                        i32 = 1514199;
                                                                        continue;
                                                                        continue;
                                                                    case 745:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                }
                                                                C0478.m9328(qVar, new m0.m0(dVar));
                                                                i30 = 1514416;
                                                                while (true) {
                                                                    i30 ^= 1514433;
                                                                    switch (i30) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case 113:
                                                                            i30 = 1514447;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        default:
                                                                            continue;
                                                                            continue;
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
                                            default:
                                                break;
                                        }
                                        i29 = 1514292;
                                        while (true) {
                                            i29 ^= 1514309;
                                            switch (i29) {
                                                case 22:
                                                    C0171.m3270(qVar, false);
                                                    C0171.m3270(qVar, false);
                                                    C0171.m3270(qVar, false);
                                                    C0405.m7954(C0012.m238(), new z0(mainViewModel, null), qVar);
                                                    C0405.m7954((String) C0418.m8214(g1VarM8776), new a1(g1VarM8776, a3Var, mainViewModel, null), qVar);
                                                    m0.g1 g1VarM8779 = C0450.m8775(C0271.m5232(mainViewModel), qVar);
                                                    C0257.m4920(null, C0059.m1122(qVar, (-1544054002) ^ C0400.f671, new v.n0(C0248.f328 ^ 54, g1VarM8779, aVar)), null, C0059.m1122(qVar, 1133473410 ^ C0455.f726, new r0(a3Var, 1)), null, 0, C0182.m3479(), 0L, null, C0059.m1122(qVar, C0353.f624 ^ (-1457254672), new g1(userProfile, g1VarM8777, aVar2, str, lVar, g1VarM8778, g1VarM8779, g1Var4, context, g1Var, g1Var2, g1Var3, g1VarM8775, mainViewModel, g1Var5, g1Var6, g1Var7, g1Var8)), qVar, (-805310226) ^ C0192.f216, C0256.f336 ^ (-739));
                                                    break;
                                                case 113:
                                                    i29 = 1514323;
                                                    continue;
                                                    continue;
                                                default:
                                                    continue;
                                                    continue;
                                            }
                                        }
                                    }
                                    break;
                                case 968:
                                    throw new IllegalStateException(C0201.m3852(C0357.m7004(m4193(), 1097, C0149.f174 ^ (-223), 2357)));
                                case 1001:
                                    break;
                                default:
                                    break;
                            }
                        }
                        x1VarM7533 = C0384.m7533(qVar);
                        i12 = 1515191;
                        while (true) {
                            i12 ^= 1515208;
                            switch (i12) {
                                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                    break;
                                case 61:
                                    break;
                                case 127:
                                    i12 = x1VarM7533 != null ? 1515284 : 1515253;
                                    break;
                                case 476:
                                    x1VarM7533.f11756d = new h1(mainViewModel, userProfile, aVar, aVar2, i10);
                                    break;
                                default:
                                    break;
                            }
                        }
                        iM6746 = C0344.m6746();
                        i13 = 1515315;
                        while (true) {
                            i13 ^= 1515332;
                            switch (i13) {
                                case 22:
                                    break;
                                case 53:
                                    return;
                                case 119:
                                    if (iM6746 <= 0) {
                                        i13 = 1515408;
                                    }
                                    break;
                                case 212:
                                    System.out.println(Double.parseDouble(C0210.m4020("U0XpmR9Ne5VV9f4RfKaT")));
                                    return;
                                default:
                                    continue;
                                    continue;
                                    continue;
                            }
                            i13 = 1515377;
                        }
                    }
                    break;
                case 116:
                    boolean zM1625 = C0074.m1625(qVar);
                    int i66 = 52735;
                    while (true) {
                        i66 ^= 52752;
                        switch (i66) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                C0470.m9156(qVar);
                                int i67 = 53634;
                                while (true) {
                                    i67 ^= 53651;
                                    switch (i67) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i67 = 53665;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        default:
                                            continue;
                                    }
                                    x1VarM7533 = C0384.m7533(qVar);
                                    i12 = 1515191;
                                    while (true) {
                                        i12 ^= 1515208;
                                        switch (i12) {
                                            case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                break;
                                            case 61:
                                                break;
                                            case 127:
                                                if (x1VarM7533 != null) {
                                                }
                                                break;
                                            case 476:
                                                x1VarM7533.f11756d = new h1(mainViewModel, userProfile, aVar, aVar2, i10);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    iM6746 = C0344.m6746();
                                    i13 = 1515315;
                                    while (true) {
                                        i13 ^= 1515332;
                                        switch (i13) {
                                            case 22:
                                                break;
                                            case 53:
                                                return;
                                            case 119:
                                                if (iM6746 <= 0) {
                                                    i13 = 1515408;
                                                }
                                                break;
                                            case 212:
                                                System.out.println(Double.parseDouble(C0210.m4020("U0XpmR9Ne5VV9f4RfKaT")));
                                                return;
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        i13 = 1515377;
                                    }
                                }
                                break;
                            case 1007:
                                i66 = !zM1625 ? 53479 : 52797;
                                break;
                            case 7927:
                                int i68 = 53510;
                                while (true) {
                                    i68 ^= 53527;
                                    switch (i68) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i68 = 53541;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        default:
                                            continue;
                                    }
                                    g1VarM8775 = C0450.m8775(C0163.m3129(mainViewModel), qVar);
                                    g1VarM8776 = C0450.m8775(C0452.m8813(mainViewModel), qVar);
                                    g1VarM8777 = C0450.m8775(C0413.m8112(mainViewModel), qVar);
                                    g1VarM8778 = C0450.m8775(C0128.m2481(mainViewModel), qVar);
                                    firebaseUserM5359 = C0277.m5359(C0441.m8614());
                                    strM8581 = C0439.m8581();
                                    i14 = 53758;
                                    while (true) {
                                        i14 ^= 53775;
                                        switch (i14) {
                                            case 1009:
                                                if (firebaseUserM5359 != null) {
                                                }
                                                break;
                                            case 1703:
                                                break;
                                            case 1736:
                                                i38 = 55556;
                                                while (true) {
                                                    i38 ^= 55573;
                                                    switch (i38) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (userProfile != null) {
                                                            }
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 87:
                                                            str = strM8581;
                                                            break;
                                                        case 116:
                                                            strM5149 = C0269.m5149(userProfile);
                                                            i39 = 55680;
                                                            while (true) {
                                                                i39 ^= 55697;
                                                                switch (i39) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i39 = 56362;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    case 1467:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                                i37 = 55432;
                                                                while (true) {
                                                                    i37 ^= 55449;
                                                                    switch (i37) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i37 = 55463;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        case 62:
                                                                            str = strM5149;
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
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
                                            case 1769:
                                                strM5149 = C0400.m7836(firebaseUserM5359);
                                                i40 = 54533;
                                                while (true) {
                                                    i40 ^= 54550;
                                                    switch (i40) {
                                                        case 19:
                                                            if (strM5149 == null) {
                                                            }
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 85:
                                                            i37 = 55432;
                                                            while (true) {
                                                                i37 ^= 55449;
                                                                switch (i37) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i37 = 55463;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    case 62:
                                                                        str = strM5149;
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        case 116:
                                                            i41 = 54657;
                                                            while (true) {
                                                                i41 ^= 54674;
                                                                switch (i41) {
                                                                    case 19:
                                                                        i41 = 54688;
                                                                        continue;
                                                                        continue;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                }
                                                                i38 = 55556;
                                                                while (true) {
                                                                    i38 ^= 55573;
                                                                    switch (i38) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (userProfile != null) {
                                                                            }
                                                                            break;
                                                                        case 54:
                                                                            break;
                                                                        case 87:
                                                                            str = strM8581;
                                                                            break;
                                                                        case 116:
                                                                            strM5149 = C0269.m5149(userProfile);
                                                                            i39 = 55680;
                                                                            while (true) {
                                                                                i39 ^= 55697;
                                                                                switch (i39) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i39 = 56362;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 1467:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                                i37 = 55432;
                                                                                while (true) {
                                                                                    i37 ^= 55449;
                                                                                    switch (i37) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i37 = 55463;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                        case 62:
                                                                                            str = strM5149;
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
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
                                        C0189.m3608(str);
                                        C0261.m4990(qVar, 678310201 ^ C0280.f425);
                                        objM8078 = C0411.m8078(qVar);
                                        objM2417 = C0125.m2417();
                                        o3VarM2137 = C0111.m2137();
                                        i15 = 56455;
                                        while (true) {
                                            i15 ^= 56472;
                                            switch (i15) {
                                                case 31:
                                                    if (objM8078 == objM2417) {
                                                    }
                                                    break;
                                                case 62:
                                                    break;
                                                case 93:
                                                    break;
                                                case 124:
                                                    objM8078 = C0173.m3305(C0455.m8876(), o3VarM2137);
                                                    C0478.m9328(qVar, objM8078);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        g1Var = (m0.g1) objM8078;
                                        objM6985 = C0356.m6985(qVar, false, (-678310894) ^ C0338.f609);
                                        i16 = 56579;
                                        while (true) {
                                            i16 ^= 56596;
                                            switch (i16) {
                                                case 23:
                                                    if (objM6985 == objM2417) {
                                                    }
                                                    break;
                                                case 54:
                                                    break;
                                                case 85:
                                                    break;
                                                case 1564036:
                                                    objM6985 = C0173.m3305(strM8581, o3VarM2137);
                                                    C0478.m9328(qVar, objM6985);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        g1Var2 = (m0.g1) objM6985;
                                        objM6986 = C0356.m6985(qVar, false, 678310103 ^ C0078.f112);
                                        i17 = 1507503;
                                        while (true) {
                                            i17 ^= 1507520;
                                            switch (i17) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    break;
                                                case 111:
                                                    if (objM6986 == objM2417) {
                                                    }
                                                    break;
                                                case 460:
                                                    objM6986 = C0173.m3305(strM8581, o3VarM2137);
                                                    C0478.m9328(qVar, objM6986);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        g1Var3 = (m0.g1) objM6986;
                                        objM6987 = C0356.m6985(qVar, false, 678310883 ^ C0282.f427);
                                        i18 = 1507627;
                                        while (true) {
                                            i18 ^= 1507644;
                                            switch (i18) {
                                                case 23:
                                                    if (objM6987 == objM2417) {
                                                    }
                                                    break;
                                                case 85:
                                                    break;
                                                case 118:
                                                    break;
                                                case 180:
                                                    objM6987 = C0173.m3305(C0455.m8876(), o3VarM2137);
                                                    C0478.m9328(qVar, objM6987);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        g1Var4 = (m0.g1) objM6987;
                                        objM6988 = C0356.m6985(qVar, false, 678309354 ^ C0058.f78);
                                        i19 = 1507751;
                                        while (true) {
                                            i19 ^= 1507768;
                                            switch (i19) {
                                                case 31:
                                                    if (objM6988 == objM2417) {
                                                    }
                                                    break;
                                                case 1335:
                                                    objM6988 = C0173.m3305(C0455.m8876(), o3VarM2137);
                                                    C0478.m9328(qVar, objM6988);
                                                    break;
                                                case 1480:
                                                    break;
                                                case 1513:
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        g1Var5 = (m0.g1) objM6988;
                                        objM6989 = C0356.m6985(qVar, false, (-678308940) ^ C0284.f429);
                                        i20 = 1508526;
                                        while (true) {
                                            i20 ^= 1508543;
                                            switch (i20) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (objM6989 == objM2417) {
                                                    }
                                                    break;
                                                case 83:
                                                    break;
                                                case 114:
                                                    break;
                                                case 436:
                                                    objM6989 = C0173.m3305(strM8581, o3VarM2137);
                                                    C0478.m9328(qVar, objM6989);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        g1Var6 = (m0.g1) objM6989;
                                        objM69810 = C0356.m6985(qVar, false, (-678309809) ^ C0116.f142);
                                        i21 = 1508650;
                                        while (true) {
                                            i21 ^= 1508667;
                                            switch (i21) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (objM69810 == objM2417) {
                                                    }
                                                    break;
                                                case 83:
                                                    break;
                                                case 114:
                                                    break;
                                                case 3369:
                                                    objM69810 = C0173.m3305(strM8581, o3VarM2137);
                                                    C0478.m9328(qVar, objM69810);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        g1Var7 = (m0.g1) objM69810;
                                        objM69811 = C0356.m6985(qVar, false, (-678309159) ^ C0034.f54);
                                        i22 = 1509425;
                                        while (true) {
                                            i22 ^= 1509442;
                                            switch (i22) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    break;
                                                case 115:
                                                    if (objM69811 == objM2417) {
                                                    }
                                                    break;
                                                case 204:
                                                    objM69811 = C0173.m3305(strM8581, o3VarM2137);
                                                    C0478.m9328(qVar, objM69811);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        g1Var8 = (m0.g1) objM69811;
                                        objM69812 = C0356.m6985(qVar, false, (-678309535) ^ C0400.f671);
                                        i23 = 1509549;
                                        while (true) {
                                            i23 ^= 1509566;
                                            switch (i23) {
                                                case 19:
                                                    if (objM69812 == objM2417) {
                                                    }
                                                    break;
                                                case 85:
                                                    break;
                                                case 114:
                                                    break;
                                                case 436:
                                                    objM69812 = new a3();
                                                    C0478.m9328(qVar, objM69812);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        a3Var = (a3) objM69812;
                                        C0171.m3270(qVar, false);
                                        m3VarM7636 = C0390.m7636();
                                        context = (Context) C0475.m9256(qVar, m3VarM7636);
                                        cVar = new e.c(0);
                                        i1 i1Var2 = new i1(0, context, mainViewModel);
                                        C0261.m4990(qVar, 1408503966 ^ C0131.f157);
                                        C0044.m862(cVar, qVar);
                                        g1VarM862 = C0044.m862(i1Var2, qVar);
                                        str2 = (String) C0180.m3449(new Object[0], null, C0437.m8537(), qVar, C0214.f238 ^ 202);
                                        C0168.m3219();
                                        C0261.m4990(qVar, 1418020843 ^ C0201.f225);
                                        jVar = (d.j) C0475.m9256(qVar, C0168.m3219());
                                        i24 = 1509673;
                                        while (true) {
                                            i24 ^= 1509690;
                                            switch (i24) {
                                                case 19:
                                                    if (jVar == null) {
                                                    }
                                                    break;
                                                case 712:
                                                    break;
                                                case 745:
                                                    break;
                                                case 1323:
                                                    objM2584 = (Context) C0475.m9256(qVar, m3VarM7636);
                                                    while (true) {
                                                        z11 = objM2584 instanceof ContextWrapper;
                                                        i33 = 1510448;
                                                        while (true) {
                                                            i33 ^= 1510465;
                                                            switch (i33) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 47:
                                                                    objM2584 = null;
                                                                    break;
                                                                case 113:
                                                                    if (z11) {
                                                                    }
                                                                    break;
                                                                case 204:
                                                                    z12 = objM2584 instanceof d.j;
                                                                    i34 = 1510572;
                                                                    while (true) {
                                                                        i34 ^= 1510589;
                                                                        switch (i34) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (z12) {
                                                                                }
                                                                                break;
                                                                            case 87:
                                                                                objM2584 = C0134.m2584((ContextWrapper) objM2584);
                                                                                i35 = 1511471;
                                                                                while (true) {
                                                                                    i35 ^= 1511488;
                                                                                    switch (i35) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case 111:
                                                                                            i35 = 1511502;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 118:
                                                                                break;
                                                                            case 809:
                                                                                i36 = 1511347;
                                                                                while (true) {
                                                                                    i36 ^= 1511364;
                                                                                    switch (i36) {
                                                                                        case 22:
                                                                                            break;
                                                                                        case 119:
                                                                                            i36 = 1511378;
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
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                    jVar = (d.j) objM2584;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        C0171.m3270(qVar, false);
                                        i25 = 1511595;
                                        while (true) {
                                            i25 ^= 1511612;
                                            switch (i25) {
                                                case 23:
                                                    if (jVar != null) {
                                                    }
                                                    break;
                                                case 815:
                                                    d.i iVarM3236 = C0169.m3235(jVar);
                                                    int i69 = 3686646 ^ C0479.f753;
                                                    C0261.m4990(qVar, i69);
                                                    objM8079 = C0411.m8078(qVar);
                                                    i26 = 1512370;
                                                    while (true) {
                                                        i26 ^= 1512387;
                                                        switch (i26) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 51:
                                                                break;
                                                            case 113:
                                                                if (objM8079 == objM2417) {
                                                                }
                                                                break;
                                                            case 1996:
                                                                objM8079 = new b.a();
                                                                C0478.m9328(qVar, objM8079);
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0171.m3270(qVar, false);
                                                    aVar3 = (b.a) objM8079;
                                                    C0261.m4990(qVar, i69);
                                                    objM80710 = C0411.m8078(qVar);
                                                    i27 = 1512494;
                                                    while (true) {
                                                        i27 ^= 1512511;
                                                        switch (i27) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                if (objM80710 == objM2417) {
                                                                }
                                                                break;
                                                            case 83:
                                                                break;
                                                            case 114:
                                                                break;
                                                            case 809:
                                                                objM80710 = new b.l(aVar3);
                                                                C0478.m9328(qVar, objM80710);
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0171.m3270(qVar, false);
                                                    lVar = (b.l) objM80710;
                                                    dVar = new b.d(aVar3, iVarM3236, str2, cVar, g1VarM862, 0);
                                                    C0261.m4990(qVar, (-1239537737) ^ C0351.f622);
                                                    C0261.m4990(qVar, (-1618982892) ^ C0173.f197);
                                                    boolean zM2018 = C0103.m2013(qVar, iVarM3236);
                                                    boolean zM2019 = C0103.m2013(qVar, str2);
                                                    z10 = (zM2019 ^ zM2018) | (zM2018 & zM2019);
                                                    zM2013 = C0103.m2013(qVar, cVar);
                                                    objM80711 = C0411.m8078(qVar);
                                                    i28 = 1513269;
                                                    while (true) {
                                                        i28 ^= 1513286;
                                                        switch (i28) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 53:
                                                                C0478.m9328(qVar, new m0.m0(dVar));
                                                                i30 = 1514416;
                                                                while (true) {
                                                                    i30 ^= 1514433;
                                                                    switch (i30) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case 113:
                                                                            i30 = 1514447;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            case 115:
                                                                if (!((z10 ^ zM2013) | (z10 & zM2013))) {
                                                                }
                                                                break;
                                                            case 212:
                                                                i31 = 1513393;
                                                                while (true) {
                                                                    i31 ^= 1513410;
                                                                    switch (i31) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            break;
                                                                        case 115:
                                                                            if (objM80711 == objM2417) {
                                                                            }
                                                                            break;
                                                                        case 4044:
                                                                            i32 = 1513517;
                                                                            while (true) {
                                                                                i32 ^= 1513534;
                                                                                switch (i32) {
                                                                                    case 19:
                                                                                        i32 = 1514199;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 745:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                                C0478.m9328(qVar, new m0.m0(dVar));
                                                                                i30 = 1514416;
                                                                                while (true) {
                                                                                    i30 ^= 1514433;
                                                                                    switch (i30) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case 113:
                                                                                            i30 = 1514447;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
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
                                                            default:
                                                                break;
                                                        }
                                                        i29 = 1514292;
                                                        while (true) {
                                                            i29 ^= 1514309;
                                                            switch (i29) {
                                                                case 22:
                                                                    C0171.m3270(qVar, false);
                                                                    C0171.m3270(qVar, false);
                                                                    C0171.m3270(qVar, false);
                                                                    C0405.m7954(C0012.m238(), new z0(mainViewModel, null), qVar);
                                                                    C0405.m7954((String) C0418.m8214(g1VarM8776), new a1(g1VarM8776, a3Var, mainViewModel, null), qVar);
                                                                    m0.g1 g1VarM87710 = C0450.m8775(C0271.m5232(mainViewModel), qVar);
                                                                    C0257.m4920(null, C0059.m1122(qVar, (-1544054002) ^ C0400.f671, new v.n0(C0248.f328 ^ 54, g1VarM87710, aVar)), null, C0059.m1122(qVar, 1133473410 ^ C0455.f726, new r0(a3Var, 1)), null, 0, C0182.m3479(), 0L, null, C0059.m1122(qVar, C0353.f624 ^ (-1457254672), new g1(userProfile, g1VarM8777, aVar2, str, lVar, g1VarM8778, g1VarM87710, g1Var4, context, g1Var, g1Var2, g1Var3, g1VarM8775, mainViewModel, g1Var5, g1Var6, g1Var7, g1Var8)), qVar, (-805310226) ^ C0192.f216, C0256.f336 ^ (-739));
                                                                    break;
                                                                case 113:
                                                                    i29 = 1514323;
                                                                    continue;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 968:
                                                    throw new IllegalStateException(C0201.m3852(C0357.m7004(m4193(), 1097, C0149.f174 ^ (-223), 2357)));
                                                case 1001:
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        x1VarM7533 = C0384.m7533(qVar);
                                        i12 = 1515191;
                                        while (true) {
                                            i12 ^= 1515208;
                                            switch (i12) {
                                                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                    break;
                                                case 61:
                                                    break;
                                                case 127:
                                                    if (x1VarM7533 != null) {
                                                    }
                                                    break;
                                                case 476:
                                                    x1VarM7533.f11756d = new h1(mainViewModel, userProfile, aVar, aVar2, i10);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        iM6746 = C0344.m6746();
                                        i13 = 1515315;
                                        while (true) {
                                            i13 ^= 1515332;
                                            switch (i13) {
                                                case 22:
                                                    break;
                                                case 53:
                                                    return;
                                                case 119:
                                                    if (iM6746 <= 0) {
                                                        i13 = 1515408;
                                                    }
                                                    break;
                                                case 212:
                                                    System.out.println(Double.parseDouble(C0210.m4020("U0XpmR9Ne5VV9f4RfKaT")));
                                                    return;
                                                default:
                                                    continue;
                                                    continue;
                                                    continue;
                                            }
                                            i13 = 1515377;
                                        }
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
    }

    public static final void j(int i10, m0.m mVar, String str) {
        int i11;
        int i12;
        C0375.m7360(str, C0157.m2993(m4193(), 1177, C0383.f654 ^ (-49), 1314));
        m0.q qVar = (m0.q) mVar;
        C0393.m7698(qVar, 1884728535 ^ C0413.f684);
        int i13 = C0001.f769;
        int i14 = 1616;
        while (true) {
            i14 ^= 1633;
            switch (i14) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i14 = ((i13 ^ (-992)) & i10) == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM2013 = C0103.m2013(qVar, str);
                    int i15 = 1740;
                    while (true) {
                        i15 ^= 1757;
                        switch (i15) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM2013) {
                                    i15 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                i12 = 2;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                i12 = 4;
                                int i16 = 1864;
                                while (true) {
                                    i16 ^= 1881;
                                    switch (i16) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i16 = 48674;
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i15 = 1802;
                    }
                    int i17 = (i12 & i10) | (i12 ^ i10);
                    int i18 = 48767;
                    while (true) {
                        i18 ^= 48784;
                        switch (i18) {
                            case Code.UNAVAILABLE /* 14 */:
                                i11 = i17;
                                break;
                            case 239:
                                i18 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    i11 = i10;
                    break;
                default:
                    break;
            }
        }
        int i19 = C0468.f739;
        int i20 = 48891;
        while (true) {
            i20 ^= 48908;
            switch (i20) {
                case 22:
                    break;
                case 53:
                    f2.l lVarM5164 = C0270.m5164();
                    long jM6142 = C0317.m6142();
                    long jM2601 = C0135.m2601(C0109.f135 ^ 77);
                    y0.o oVarM3568 = C0187.m3568(C0226.m4370(), 0.0f, 0.0f, 0.0f, 8, C0043.f63 ^ 849);
                    int i21 = (C0286.f431 ^ 362) & i11;
                    C0185.m3537(str, oVarM3568, jM6142, jM2601, null, lVarM5164, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, (199728 ^ i21) | (i21 & 199728), 0, 130240 ^ C0185.f209);
                    break;
                case 503:
                    i20 = ((i19 ^ 290) & i11) == 2 ? 49635 : 48953;
                    break;
                case 32495:
                    boolean zM1625 = C0074.m1625(qVar);
                    int i22 = 49666;
                    while (true) {
                        i22 ^= 49683;
                        switch (i22) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i22 = !zM1625 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                int i23 = 49790;
                                while (true) {
                                    i23 ^= 49807;
                                    switch (i23) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i23 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                    f2.l lVarM5165 = C0270.m5164();
                                    long jM6143 = C0317.m6142();
                                    long jM2602 = C0135.m2601(C0109.f135 ^ 77);
                                    y0.o oVarM3569 = C0187.m3568(C0226.m4370(), 0.0f, 0.0f, 0.0f, 8, C0043.f63 ^ 849);
                                    int i24 = (C0286.f431 ^ 362) & i11;
                                    C0185.m3537(str, oVarM3569, jM6143, jM2602, null, lVarM5165, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, (199728 ^ i24) | (i24 & 199728), 0, 130240 ^ C0185.f209);
                                    break;
                                }
                                break;
                            case 83:
                                C0470.m9156(qVar);
                                int i25 = 49914;
                                while (true) {
                                    i25 ^= 49931;
                                    switch (i25) {
                                        case 497:
                                            i25 = 50596;
                                            continue;
                                        case 1711:
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
        m0.x1 x1VarM7533 = C0384.m7533(qVar);
        int i26 = 50689;
        while (true) {
            i26 ^= 50706;
            switch (i26) {
                case 19:
                    if (x1VarM7533 != null) {
                        i26 = 50782;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    return;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    x1VarM7533.f11756d = new t.o0(str, i10, C0309.f457 ^ (-402));
                    return;
                default:
                    continue;
            }
            i26 = 50751;
        }
    }

    /* JADX WARN: Code duplicated, block: B:313:0x022c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x02bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x0132 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:0x01df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x021a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x0707 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x038a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x0380 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x03a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x03aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x03ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x03aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x03a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x039c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x03e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x03b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x03dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x03eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x03ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x0410 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:0x03eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x03d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x0406 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:0x040c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:0x0410 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x0413 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:0x040c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x0408 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x03fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0464 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:0x0468 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x046e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x04e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:0x046a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x0464 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x045c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:0x0479 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x0480 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x0484 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x04c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x0480 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x047c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x0471 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x04c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:560:0x0494 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x04bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:0x04ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x04f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:0x06e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:0x04ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:0x04be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x04b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:0x04fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x04ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:0x0506 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:0x052c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x0502 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x04fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x04f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x0528 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:0x0542 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:0x0520 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x06db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:0x06f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:0x06f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x0706 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:0x06f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:0x06db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x06d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x0542 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x06df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x053a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:0x04dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:0x04d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x029e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:0x02dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x02d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x02af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x019d A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:304:0x0724 -> B:91:0x0186). Please report as a decompilation issue!!! */
    public static final void k(MainViewModel mainViewModel, m0.m mVar, int i10) {
        int i11;
        m0.x1 x1VarM7533;
        int i12;
        Context context;
        Object objM8078;
        Object objM2417;
        o3 o3VarM2137;
        int i13;
        m0.g1 g1Var;
        Object objM6985;
        int i14;
        m0.g1 g1Var2;
        Object objM6986;
        int i15;
        m0.g1 g1Var3;
        y0.l lVarM4370;
        float f10;
        r1.j0 j0VarM4231;
        int iM276;
        m0.r1 r1VarM275;
        t1.j jVarM4451;
        u0.b bVarM6976;
        boolean z10;
        int i16;
        boolean zM7502;
        int i17;
        t1.i iVarM5562;
        boolean zM7503;
        int i18;
        int iM6740;
        int i19;
        long jM4129;
        int iM6741;
        int i20;
        long jM41210;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean zM4399;
        int i27;
        int i28;
        String strM3930;
        boolean zM6316;
        int i29;
        boolean z11;
        int i30;
        int i31;
        g5.c cVarM1823;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int iM2521;
        int i37;
        int i38;
        int i39;
        boolean z12;
        int i40;
        boolean zM6317;
        int i41;
        int iM2522;
        int i42;
        boolean z13;
        float fM749;
        int i43;
        int i44;
        int i45;
        C0375.m7360(mainViewModel, C0455.m8879(m4193(), 1182, C0249.f329 ^ (-819), 2944));
        m0.q qVar = (m0.q) mVar;
        C0393.m7698(qVar, 993955303 ^ C0078.f112);
        int i46 = C0105.f131;
        int i47 = 1616;
        while (true) {
            i47 ^= 1633;
            switch (i47) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i47 = ((i46 ^ 479) & i10) == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM2013 = C0103.m2013(qVar, mainViewModel);
                    int i48 = 1740;
                    while (true) {
                        i48 ^= 1757;
                        switch (i48) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i48 = zM2013 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                i45 = 2;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                i45 = 4;
                                int i49 = 1864;
                                while (true) {
                                    i49 ^= 1881;
                                    switch (i49) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i49 = 48674;
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
                    i11 = (i45 & i10) | (i45 ^ i10);
                    int i50 = 48767;
                    while (true) {
                        i50 ^= 48784;
                        switch (i50) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i50 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    i11 = i10;
                    break;
                default:
                    break;
            }
        }
        int i51 = C0462.f733;
        int i52 = 48891;
        while (true) {
            i52 ^= 48908;
            switch (i52) {
                case 22:
                    break;
                case 53:
                    context = (Context) C0475.m9256(qVar, C0390.m7636());
                    C0261.m4990(qVar, 1153808653 ^ C0325.f473);
                    objM8078 = C0411.m8078(qVar);
                    objM2417 = C0125.m2417();
                    o3VarM2137 = C0111.m2137();
                    i13 = 50689;
                    while (true) {
                        i13 ^= 50706;
                        switch (i13) {
                            case 19:
                                i13 = objM8078 == objM2417 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                try {
                                    fM749 = C0038.m749(C0152.m2915(context), C0049.m957(m4193(), 1191, C0292.f440 ^ 57, 1423), 1.0f);
                                    i43 = 50813;
                                    while (true) {
                                        i43 ^= 50830;
                                        switch (i43) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 53:
                                                z13 = false;
                                                break;
                                            case 243:
                                                if (fM749 == 0.0f) {
                                                    i43 = 51557;
                                                }
                                                break;
                                            case 4075:
                                                z13 = true;
                                                i44 = 51588;
                                                while (true) {
                                                    i44 ^= 51605;
                                                    switch (i44) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i44 = 51619;
                                                            break;
                                                        case 54:
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                continue;
                                                continue;
                                        }
                                        i43 = 50875;
                                    }
                                } catch (Exception e4) {
                                    int i53 = 1513517;
                                    while (true) {
                                        i53 ^= 1513534;
                                        switch (i53) {
                                            case 19:
                                                i53 = 1514199;
                                                break;
                                            case 745:
                                                break;
                                        }
                                    }
                                }
                                objM8078 = C0173.m3305(C0009.m192(z13), o3VarM2137);
                                C0478.m9328(qVar, objM8078);
                                break;
                            default:
                                break;
                        }
                    }
                    g1Var = (m0.g1) objM8078;
                    objM6985 = C0356.m6985(qVar, false, 1153808919 ^ C0217.f241);
                    i14 = 51712;
                    while (true) {
                        i14 ^= 51729;
                        switch (i14) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i14 = objM6985 == objM2417 ? 51805 : 51774;
                                break;
                            case 47:
                                break;
                            case 76:
                                try {
                                    zM6317 = C0326.m6316();
                                    i41 = 51836;
                                    while (true) {
                                        i41 ^= 51853;
                                        switch (i41) {
                                            case 241:
                                                i41 = !zM6317 ? 52580 : 52549;
                                                break;
                                            case 1963:
                                                break;
                                            case 1992:
                                                iM2522 = C0131.m2521();
                                                i42 = 52735;
                                                while (true) {
                                                    i42 ^= 52752;
                                                    switch (i42) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            z12 = false;
                                                            i40 = 52611;
                                                            while (true) {
                                                                i40 ^= 52628;
                                                                switch (i40) {
                                                                    case 23:
                                                                        i40 = 52642;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    case 54:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        case 1007:
                                                            i42 = iM2522 == 0 ? 53479 : 52797;
                                                            break;
                                                        case 7927:
                                                            z12 = true;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 2025:
                                                z12 = false;
                                                i40 = 52611;
                                                while (true) {
                                                    i40 ^= 52628;
                                                    switch (i40) {
                                                        case 23:
                                                            i40 = 52642;
                                                            continue;
                                                            continue;
                                                            continue;
                                                            continue;
                                                        case 54:
                                                            break;
                                                        default:
                                                            continue;
                                                            continue;
                                                            continue;
                                                            continue;
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                        objM6985 = C0173.m3305(C0009.m192(z12), o3VarM2137);
                                        C0478.m9328(qVar, objM6985);
                                        break;
                                    }
                                } catch (Exception e10) {
                                    int i54 = 1514292;
                                    while (true) {
                                        i54 ^= 1514309;
                                        switch (i54) {
                                            case 22:
                                                break;
                                            case 113:
                                                i54 = 1514323;
                                                continue;
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
                    g1Var2 = (m0.g1) objM6985;
                    objM6986 = C0356.m6985(qVar, false, 1153808844 ^ C0348.f619);
                    i15 = 53510;
                    while (true) {
                        i15 ^= 53527;
                        switch (i15) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = objM6986 == objM2417 ? 53603 : 53572;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 83:
                                break;
                            case 116:
                                strM3930 = C0205.m3930(m4193(), 1213, C0452.f723 ^ (-860), 1482);
                                C0375.m7360(context, C0243.m4671(m4193(), 1239, C0307.f455 ^ 171, 1141));
                                try {
                                    zM6316 = C0326.m6316();
                                    i39 = 53634;
                                    while (true) {
                                        i39 ^= 53651;
                                        switch (i39) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i39 = 53665;
                                                continue;
                                                continue;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            default:
                                                continue;
                                                continue;
                                        }
                                        i29 = 53758;
                                        while (true) {
                                            i29 ^= 53775;
                                            switch (i29) {
                                                case 1009:
                                                    i29 = zM6316 ? 54502 : 54471;
                                                    break;
                                                case 1703:
                                                    break;
                                                case 1736:
                                                    z11 = false;
                                                    break;
                                                case 1769:
                                                    try {
                                                        iM2521 = C0131.m2521();
                                                        i37 = 54533;
                                                        while (true) {
                                                            i37 ^= 54550;
                                                            switch (i37) {
                                                                case 19:
                                                                    i37 = iM2521 == 0 ? 54626 : 54595;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 85:
                                                                    z11 = false;
                                                                    break;
                                                                case 116:
                                                                    z11 = true;
                                                                    i38 = 54657;
                                                                    while (true) {
                                                                        i38 ^= 54674;
                                                                        switch (i38) {
                                                                            case 19:
                                                                                i38 = 54688;
                                                                                continue;
                                                                                continue;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                                        }
                                                    } catch (Exception e11) {
                                                        int i55 = 1514416;
                                                        while (true) {
                                                            i55 ^= 1514433;
                                                            switch (i55) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 113:
                                                                    i55 = 1514447;
                                                                    continue;
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
                                        i30 = 55432;
                                        while (true) {
                                            i30 ^= 55449;
                                            switch (i30) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i30 = zM6316 ? 55525 : 55494;
                                                    break;
                                                case 62:
                                                    break;
                                                case 95:
                                                    i31 = 56455;
                                                    while (true) {
                                                        i31 ^= 56472;
                                                        switch (i31) {
                                                            case 31:
                                                                i31 = zM6316 ? 56548 : 56517;
                                                                break;
                                                            case 62:
                                                                break;
                                                            case 93:
                                                                try {
                                                                    C0290.m5588(C0421.m8279(context), strM3930, 0);
                                                                    i34 = 1507503;
                                                                    while (true) {
                                                                        i34 ^= 1507520;
                                                                        switch (i34) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case 111:
                                                                                i34 = 1507534;
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                        cVarM1823 = C0414.m8143();
                                                                        i33 = 1507751;
                                                                        while (true) {
                                                                            i33 ^= 1507768;
                                                                            switch (i33) {
                                                                                case 31:
                                                                                    i33 = 1508433;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case 1513:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (Exception e12) {
                                                                    Intent intentM6258 = C0323.m6258(C0421.m8279(context), strM3930);
                                                                    int i56 = 1507627;
                                                                    while (true) {
                                                                        i56 ^= 1507644;
                                                                        switch (i56) {
                                                                            case 23:
                                                                                i56 = intentM6258 != null ? 1507720 : 1507689;
                                                                                break;
                                                                            case 85:
                                                                                cVarM1823 = C0443.m8653();
                                                                                break;
                                                                            case 118:
                                                                                break;
                                                                            case 180:
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                        objM6986 = C0173.m3305(cVarM1823, o3VarM2137);
                                                                        C0478.m9328(qVar, objM6986);
                                                                        g1Var3 = (m0.g1) objM6986;
                                                                        C0171.m3270(qVar, false);
                                                                        C0405.m7954(C0012.m238(), new j1(context, g1Var2, g1Var3, null), qVar);
                                                                        lVarM4370 = C0226.m4370();
                                                                        y0.o oVarM8892 = C0456.m8892(C0143.m2748(), C0146.m2779(qVar));
                                                                        f10 = C0280.f425 ^ (-468);
                                                                        y0.o oVarM4788 = C0250.m4788(oVarM8892, f10);
                                                                        C0261.m4990(qVar, (-483455900) ^ C0030.f50);
                                                                        j0VarM4231 = C0218.m4231(C0204.m3900(), C0173.m3300(), qVar);
                                                                        C0261.m4990(qVar, (-1323939993) ^ C0457.f728);
                                                                        iM276 = C0014.m276(qVar);
                                                                        r1VarM275 = C0014.m275(qVar);
                                                                        C0014.m280(C0379.m7428());
                                                                        jVarM4451 = C0231.m4451();
                                                                        bVarM6976 = C0355.m6976(oVarM4788);
                                                                        z10 = C0196.m3764(qVar) instanceof m0.d;
                                                                        i16 = 1508526;
                                                                        while (true) {
                                                                            i16 ^= 1508543;
                                                                            switch (i16) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i16 = z10 ? 1508619 : 1508588;
                                                                                    break;
                                                                                case 83:
                                                                                    C0235.m4537();
                                                                                    throw null;
                                                                                case 114:
                                                                                    break;
                                                                                case 436:
                                                                                    C0100.m1961(qVar);
                                                                                    zM7502 = C0382.m7502(qVar);
                                                                                    i17 = 1508650;
                                                                                    while (true) {
                                                                                        i17 ^= 1508667;
                                                                                        switch (i17) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i17 = zM7502 ? 1509394 : 1508712;
                                                                                                break;
                                                                                            case 83:
                                                                                                C0445.m8685(qVar);
                                                                                                break;
                                                                                            case 114:
                                                                                                break;
                                                                                            case 3369:
                                                                                                C0017.m346(qVar, jVarM4451);
                                                                                                i28 = 1509425;
                                                                                                while (true) {
                                                                                                    i28 ^= 1509442;
                                                                                                    switch (i28) {
                                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                            break;
                                                                                                        case 115:
                                                                                                            i28 = 1509456;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                        default:
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    C0089.m1904(qVar, j0VarM4231, C0063.m1208());
                                                                                    C0089.m1904(qVar, r1VarM275, C0464.m9055());
                                                                                    iVarM5562 = C0289.m5562();
                                                                                    zM7503 = C0382.m7502(qVar);
                                                                                    i18 = 1509549;
                                                                                    while (true) {
                                                                                        i18 ^= 1509566;
                                                                                        switch (i18) {
                                                                                            case 19:
                                                                                                i18 = !zM7503 ? 1509642 : 1509611;
                                                                                                break;
                                                                                            case 85:
                                                                                                C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                                                                break;
                                                                                            case 114:
                                                                                                break;
                                                                                            case 436:
                                                                                                zM4399 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM276));
                                                                                                i27 = 1509673;
                                                                                                while (true) {
                                                                                                    i27 ^= 1509690;
                                                                                                    switch (i27) {
                                                                                                        case 19:
                                                                                                            i27 = !zM4399 ? 1510417 : 1510386;
                                                                                                            break;
                                                                                                        case 712:
                                                                                                            break;
                                                                                                        case 745:
                                                                                                            break;
                                                                                                        case 1323:
                                                                                                            C0133.m2574(iM276, qVar, iM276, iVarM5562);
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
                                                                                    C0352.m6912(0, bVarM6976, new l2(qVar), qVar, 2058660288 ^ C0125.f151);
                                                                                    m0.g1 g1VarM8775 = C0450.m8775(C0271.m5232(mainViewModel), qVar);
                                                                                    C0318.m6169();
                                                                                    C0488.m9503(0, qVar, C0316.m6122(C0010.m206(m4193(), 1246, C0346.f617 ^ (-750), 2559), (String) C0418.m8214(g1VarM8775)));
                                                                                    FillElement fillElementM2371 = C0123.m2371();
                                                                                    iM6740 = C0343.m6740((g5.c) C0418.m8214(g1Var3));
                                                                                    i19 = 1510448;
                                                                                    while (true) {
                                                                                        i19 ^= 1510465;
                                                                                        switch (i19) {
                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                break;
                                                                                            case 47:
                                                                                                jM4129 = C0216.m4129(C0314.m6087(), 0.1f);
                                                                                                break;
                                                                                            case 113:
                                                                                                i19 = iM6740 != 0 ? 1510541 : 1510510;
                                                                                                break;
                                                                                            case 204:
                                                                                                i24 = 1510572;
                                                                                                while (true) {
                                                                                                    i24 ^= 1510589;
                                                                                                    switch (i24) {
                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i24 = iM6740 != 3 ? 1511316 : 1510634;
                                                                                                            break;
                                                                                                        case 87:
                                                                                                            jM4129 = C0216.m4129(C0045.m882(), 0.1f);
                                                                                                            i25 = 1511471;
                                                                                                            while (true) {
                                                                                                                i25 ^= 1511488;
                                                                                                                switch (i25) {
                                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                                        break;
                                                                                                                    case 111:
                                                                                                                        i25 = 1511502;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                    default:
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        case 118:
                                                                                                            break;
                                                                                                        case 809:
                                                                                                            jM4129 = C0019.m389(4281539390L ^ ((long) C0233.f313));
                                                                                                            i26 = 1511347;
                                                                                                            while (true) {
                                                                                                                i26 ^= 1511364;
                                                                                                                switch (i26) {
                                                                                                                    case 22:
                                                                                                                        break;
                                                                                                                    case 119:
                                                                                                                        i26 = 1511378;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                    default:
                                                                                                                        continue;
                                                                                                                        continue;
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
                                                                                    k0.g0 g0VarM1299 = C0067.m1299(jM4129, qVar, 0);
                                                                                    e0.e eVarM8237 = C0419.m8237(f10);
                                                                                    float f11 = 1;
                                                                                    iM6741 = C0343.m6740((g5.c) C0418.m8214(g1Var3));
                                                                                    i20 = 1511595;
                                                                                    while (true) {
                                                                                        i20 ^= 1511612;
                                                                                        switch (i20) {
                                                                                            case 23:
                                                                                                i20 = iM6741 != 0 ? 1512339 : 1512308;
                                                                                                break;
                                                                                            case 815:
                                                                                                i21 = 1512370;
                                                                                                while (true) {
                                                                                                    i21 ^= 1512387;
                                                                                                    switch (i21) {
                                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                            break;
                                                                                                        case 51:
                                                                                                            jM41210 = C0216.m4129(C0045.m882(), 0.3f);
                                                                                                            i22 = 1513269;
                                                                                                            while (true) {
                                                                                                                i22 ^= 1513286;
                                                                                                                switch (i22) {
                                                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                        break;
                                                                                                                    case 115:
                                                                                                                        i22 = 1513300;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                    default:
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        case 113:
                                                                                                            i21 = iM6741 != 3 ? 1512463 : 1512432;
                                                                                                            break;
                                                                                                        case 1996:
                                                                                                            jM41210 = C0216.m4129(C0019.m389((-4294940968L) ^ ((long) C0114.f140)), 0.4f);
                                                                                                            i23 = 1512494;
                                                                                                            while (true) {
                                                                                                                i23 ^= 1512511;
                                                                                                                switch (i23) {
                                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                        i23 = 1512525;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                    case 114:
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 968:
                                                                                                jM41210 = C0216.m4129(C0314.m6087(), 0.3f);
                                                                                                break;
                                                                                            case 1001:
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    C0271.m5230(fillElementM2371, eVarM8237, g0VarM1299, null, C0059.m1134(f11, jM41210), C0059.m1122(qVar, (-694633640) ^ C0084.f118, new k1(g1Var3, g1VarM8775, context)), qVar, 196614, 8);
                                                                                    float f12 = C0069.f89 ^ (-830);
                                                                                    C0072.m1564(C0270.m5166(lVarM4370, f12), qVar);
                                                                                    C0488.m9503(0, qVar, C0316.m6122(C0031.m607(m4193(), 1267, C0413.f684 ^ (-948), 1794), (String) C0418.m8214(g1VarM8775)));
                                                                                    long jM2039 = C0104.m2039();
                                                                                    C0271.m5230(fillElementM2371, C0419.m8237(f10), C0067.m1299(jM2039, qVar, 0), null, null, C0059.m1122(qVar, (-2074903755) ^ C0144.f170, new k(mainViewModel, g1VarM8775, context)), qVar, 196614, 24);
                                                                                    C0072.m1564(C0270.m5166(lVarM4370, f12), qVar);
                                                                                    C0488.m9503(0, qVar, C0316.m6122(C0376.m7387(m4193(), 1282, C0264.f344 ^ 557, 364), (String) C0418.m8214(g1VarM8775)));
                                                                                    C0271.m5230(fillElementM2371, C0419.m8237(f10), C0067.m1299(jM2039, qVar, 0), null, null, C0059.m1122(qVar, 1140521609 ^ C0381.f652, new s.k(g1Var, g1VarM8775, context, g1Var2, 4)), qVar, 196614, 24);
                                                                                    C0072.m1564(C0270.m5166(lVarM4370, f12), qVar);
                                                                                    C0488.m9503(0, qVar, C0316.m6122(C0121.m2327(m4193(), 1300, C0170.f194 ^ (-129), 2161), (String) C0418.m8214(g1VarM8775)));
                                                                                    C0271.m5230(fillElementM2371, C0419.m8237(f10), C0067.m1299(jM2039, qVar, 0), null, null, C0059.m1122(qVar, (-60979203) ^ C0426.f697, new k1(g1VarM8775, g1Var2, context, 0)), qVar, 196614, 24);
                                                                                    C0072.m1564(C0270.m5166(lVarM4370, f12), qVar);
                                                                                    C0488.m9503(0, qVar, C0316.m6122(C0456.m8898(m4193(), 1320, C0452.f723 ^ (-843), 1382), (String) C0418.m8214(g1VarM8775)));
                                                                                    C0271.m5230(fillElementM2371, C0419.m8237(f10), C0067.m1299(jM2039, qVar, 0), null, null, C0059.m1122(qVar, 1018562151 ^ C0222.f302, new u(mainViewModel, context, g1VarM8775, g1Var2, g1Var3)), qVar, 196614, C0290.f438 ^ (-326));
                                                                                    C0072.m1564(C0270.m5166(lVarM4370, C0143.f169 ^ (-343)), qVar);
                                                                                    C0171.m3270(qVar, false);
                                                                                    C0171.m3270(qVar, true);
                                                                                    C0171.m3270(qVar, false);
                                                                                    C0171.m3270(qVar, false);
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        x1VarM7533 = C0384.m7533(qVar);
                                                                        i12 = 1513393;
                                                                        while (true) {
                                                                            i12 ^= 1513410;
                                                                            switch (i12) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    return;
                                                                                case 115:
                                                                                    if (x1VarM7533 != null) {
                                                                                        i12 = 1513486;
                                                                                    }
                                                                                    break;
                                                                                case 4044:
                                                                                    x1VarM7533.f11756d = new c5.k(mainViewModel, i10, C0152.f177 ^ 363);
                                                                                    return;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                            i12 = 1513455;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            case 124:
                                                                cVarM1823 = C0085.m1823();
                                                                i32 = 56579;
                                                                while (true) {
                                                                    i32 ^= 56596;
                                                                    switch (i32) {
                                                                        case 23:
                                                                            i32 = 56610;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        case 54:
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 124:
                                                    i35 = 55556;
                                                    while (true) {
                                                        i35 ^= 55573;
                                                        switch (i35) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i35 = z11 ? 55649 : 55618;
                                                                break;
                                                            case 54:
                                                                break;
                                                            case 87:
                                                                i31 = 56455;
                                                                while (true) {
                                                                    i31 ^= 56472;
                                                                    switch (i31) {
                                                                        case 31:
                                                                            if (zM6316) {
                                                                            }
                                                                            break;
                                                                        case 62:
                                                                            break;
                                                                        case 93:
                                                                            C0290.m5588(C0421.m8279(context), strM3930, 0);
                                                                            i34 = 1507503;
                                                                            while (true) {
                                                                                i34 ^= 1507520;
                                                                                switch (i34) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case 111:
                                                                                        i34 = 1507534;
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                                cVarM1823 = C0414.m8143();
                                                                                i33 = 1507751;
                                                                                while (true) {
                                                                                    i33 ^= 1507768;
                                                                                    switch (i33) {
                                                                                        case 31:
                                                                                            i33 = 1508433;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                        case 1513:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 124:
                                                                            cVarM1823 = C0085.m1823();
                                                                            i32 = 56579;
                                                                            while (true) {
                                                                                i32 ^= 56596;
                                                                                switch (i32) {
                                                                                    case 23:
                                                                                        i32 = 56610;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 54:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 116:
                                                                cVarM1823 = C0124.m2396();
                                                                i36 = 55680;
                                                                while (true) {
                                                                    i36 ^= 55697;
                                                                    switch (i36) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i36 = 56362;
                                                                            continue;
                                                                            continue;
                                                                        case 1467:
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
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                            objM6986 = C0173.m3305(cVarM1823, o3VarM2137);
                                            C0478.m9328(qVar, objM6986);
                                        }
                                    }
                                } catch (Exception e13) {
                                    zM6316 = false;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    g1Var3 = (m0.g1) objM6986;
                    C0171.m3270(qVar, false);
                    C0405.m7954(C0012.m238(), new j1(context, g1Var2, g1Var3, null), qVar);
                    lVarM4370 = C0226.m4370();
                    y0.o oVarM8893 = C0456.m8892(C0143.m2748(), C0146.m2779(qVar));
                    f10 = C0280.f425 ^ (-468);
                    y0.o oVarM4789 = C0250.m4788(oVarM8893, f10);
                    C0261.m4990(qVar, (-483455900) ^ C0030.f50);
                    j0VarM4231 = C0218.m4231(C0204.m3900(), C0173.m3300(), qVar);
                    C0261.m4990(qVar, (-1323939993) ^ C0457.f728);
                    iM276 = C0014.m276(qVar);
                    r1VarM275 = C0014.m275(qVar);
                    C0014.m280(C0379.m7428());
                    jVarM4451 = C0231.m4451();
                    bVarM6976 = C0355.m6976(oVarM4789);
                    z10 = C0196.m3764(qVar) instanceof m0.d;
                    i16 = 1508526;
                    while (true) {
                        i16 ^= 1508543;
                        switch (i16) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (z10) {
                                }
                                break;
                            case 83:
                                C0235.m4537();
                                throw null;
                            case 114:
                                break;
                            case 436:
                                C0100.m1961(qVar);
                                zM7502 = C0382.m7502(qVar);
                                i17 = 1508650;
                                while (true) {
                                    i17 ^= 1508667;
                                    switch (i17) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (zM7502) {
                                            }
                                            break;
                                        case 83:
                                            C0445.m8685(qVar);
                                            break;
                                        case 114:
                                            break;
                                        case 3369:
                                            C0017.m346(qVar, jVarM4451);
                                            i28 = 1509425;
                                            while (true) {
                                                i28 ^= 1509442;
                                                switch (i28) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 115:
                                                        i28 = 1509456;
                                                        continue;
                                                        continue;
                                                        continue;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                C0089.m1904(qVar, j0VarM4231, C0063.m1208());
                                C0089.m1904(qVar, r1VarM275, C0464.m9055());
                                iVarM5562 = C0289.m5562();
                                zM7503 = C0382.m7502(qVar);
                                i18 = 1509549;
                                while (true) {
                                    i18 ^= 1509566;
                                    switch (i18) {
                                        case 19:
                                            if (!zM7503) {
                                            }
                                            break;
                                        case 85:
                                            C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                            break;
                                        case 114:
                                            break;
                                        case 436:
                                            zM4399 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM276));
                                            i27 = 1509673;
                                            while (true) {
                                                i27 ^= 1509690;
                                                switch (i27) {
                                                    case 19:
                                                        if (!zM4399) {
                                                        }
                                                        break;
                                                    case 712:
                                                        break;
                                                    case 745:
                                                        break;
                                                    case 1323:
                                                        C0133.m2574(iM276, qVar, iM276, iVarM5562);
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
                                C0352.m6912(0, bVarM6976, new l2(qVar), qVar, 2058660288 ^ C0125.f151);
                                m0.g1 g1VarM8776 = C0450.m8775(C0271.m5232(mainViewModel), qVar);
                                C0318.m6169();
                                C0488.m9503(0, qVar, C0316.m6122(C0010.m206(m4193(), 1246, C0346.f617 ^ (-750), 2559), (String) C0418.m8214(g1VarM8776)));
                                FillElement fillElementM2372 = C0123.m2371();
                                iM6740 = C0343.m6740((g5.c) C0418.m8214(g1Var3));
                                i19 = 1510448;
                                while (true) {
                                    i19 ^= 1510465;
                                    switch (i19) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 47:
                                            jM4129 = C0216.m4129(C0314.m6087(), 0.1f);
                                            break;
                                        case 113:
                                            if (iM6740 != 0) {
                                            }
                                            break;
                                        case 204:
                                            i24 = 1510572;
                                            while (true) {
                                                i24 ^= 1510589;
                                                switch (i24) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (iM6740 != 3) {
                                                        }
                                                        break;
                                                    case 87:
                                                        jM4129 = C0216.m4129(C0045.m882(), 0.1f);
                                                        i25 = 1511471;
                                                        while (true) {
                                                            i25 ^= 1511488;
                                                            switch (i25) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 111:
                                                                    i25 = 1511502;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 118:
                                                        break;
                                                    case 809:
                                                        jM4129 = C0019.m389(4281539390L ^ ((long) C0233.f313));
                                                        i26 = 1511347;
                                                        while (true) {
                                                            i26 ^= 1511364;
                                                            switch (i26) {
                                                                case 22:
                                                                    break;
                                                                case 119:
                                                                    i26 = 1511378;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                                    continue;
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
                                k0.g0 g0VarM12910 = C0067.m1299(jM4129, qVar, 0);
                                e0.e eVarM8238 = C0419.m8237(f10);
                                float f13 = 1;
                                iM6741 = C0343.m6740((g5.c) C0418.m8214(g1Var3));
                                i20 = 1511595;
                                while (true) {
                                    i20 ^= 1511612;
                                    switch (i20) {
                                        case 23:
                                            if (iM6741 != 0) {
                                            }
                                            break;
                                        case 815:
                                            i21 = 1512370;
                                            while (true) {
                                                i21 ^= 1512387;
                                                switch (i21) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        jM41210 = C0216.m4129(C0045.m882(), 0.3f);
                                                        i22 = 1513269;
                                                        while (true) {
                                                            i22 ^= 1513286;
                                                            switch (i22) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 115:
                                                                    i22 = 1513300;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 113:
                                                        if (iM6741 != 3) {
                                                        }
                                                        break;
                                                    case 1996:
                                                        jM41210 = C0216.m4129(C0019.m389((-4294940968L) ^ ((long) C0114.f140)), 0.4f);
                                                        i23 = 1512494;
                                                        while (true) {
                                                            i23 ^= 1512511;
                                                            switch (i23) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i23 = 1512525;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                case 114:
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 968:
                                            jM41210 = C0216.m4129(C0314.m6087(), 0.3f);
                                            break;
                                        case 1001:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                C0271.m5230(fillElementM2372, eVarM8238, g0VarM12910, null, C0059.m1134(f13, jM41210), C0059.m1122(qVar, (-694633640) ^ C0084.f118, new k1(g1Var3, g1VarM8776, context)), qVar, 196614, 8);
                                float f14 = C0069.f89 ^ (-830);
                                C0072.m1564(C0270.m5166(lVarM4370, f14), qVar);
                                C0488.m9503(0, qVar, C0316.m6122(C0031.m607(m4193(), 1267, C0413.f684 ^ (-948), 1794), (String) C0418.m8214(g1VarM8776)));
                                long jM20310 = C0104.m2039();
                                C0271.m5230(fillElementM2372, C0419.m8237(f10), C0067.m1299(jM20310, qVar, 0), null, null, C0059.m1122(qVar, (-2074903755) ^ C0144.f170, new k(mainViewModel, g1VarM8776, context)), qVar, 196614, 24);
                                C0072.m1564(C0270.m5166(lVarM4370, f14), qVar);
                                C0488.m9503(0, qVar, C0316.m6122(C0376.m7387(m4193(), 1282, C0264.f344 ^ 557, 364), (String) C0418.m8214(g1VarM8776)));
                                C0271.m5230(fillElementM2372, C0419.m8237(f10), C0067.m1299(jM20310, qVar, 0), null, null, C0059.m1122(qVar, 1140521609 ^ C0381.f652, new s.k(g1Var, g1VarM8776, context, g1Var2, 4)), qVar, 196614, 24);
                                C0072.m1564(C0270.m5166(lVarM4370, f14), qVar);
                                C0488.m9503(0, qVar, C0316.m6122(C0121.m2327(m4193(), 1300, C0170.f194 ^ (-129), 2161), (String) C0418.m8214(g1VarM8776)));
                                C0271.m5230(fillElementM2372, C0419.m8237(f10), C0067.m1299(jM20310, qVar, 0), null, null, C0059.m1122(qVar, (-60979203) ^ C0426.f697, new k1(g1VarM8776, g1Var2, context, 0)), qVar, 196614, 24);
                                C0072.m1564(C0270.m5166(lVarM4370, f14), qVar);
                                C0488.m9503(0, qVar, C0316.m6122(C0456.m8898(m4193(), 1320, C0452.f723 ^ (-843), 1382), (String) C0418.m8214(g1VarM8776)));
                                C0271.m5230(fillElementM2372, C0419.m8237(f10), C0067.m1299(jM20310, qVar, 0), null, null, C0059.m1122(qVar, 1018562151 ^ C0222.f302, new u(mainViewModel, context, g1VarM8776, g1Var2, g1Var3)), qVar, 196614, C0290.f438 ^ (-326));
                                C0072.m1564(C0270.m5166(lVarM4370, C0143.f169 ^ (-343)), qVar);
                                C0171.m3270(qVar, false);
                                C0171.m3270(qVar, true);
                                C0171.m3270(qVar, false);
                                C0171.m3270(qVar, false);
                                break;
                            default:
                                break;
                        }
                    }
                    x1VarM7533 = C0384.m7533(qVar);
                    i12 = 1513393;
                    while (true) {
                        i12 ^= 1513410;
                        switch (i12) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                return;
                            case 115:
                                if (x1VarM7533 != null) {
                                    i12 = 1513486;
                                }
                                break;
                            case 4044:
                                x1VarM7533.f11756d = new c5.k(mainViewModel, i10, C0152.f177 ^ 363);
                                return;
                            default:
                                continue;
                                continue;
                                continue;
                                continue;
                        }
                        i12 = 1513455;
                    }
                    break;
                case 503:
                    i52 = ((i51 ^ 318) & i11) == 2 ? 49635 : 48953;
                    break;
                case 32495:
                    boolean zM1625 = C0074.m1625(qVar);
                    int i57 = 49666;
                    while (true) {
                        i57 ^= 49683;
                        switch (i57) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i57 = !zM1625 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                int i58 = 49790;
                                while (true) {
                                    i58 ^= 49807;
                                    switch (i58) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i58 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                    context = (Context) C0475.m9256(qVar, C0390.m7636());
                                    C0261.m4990(qVar, 1153808653 ^ C0325.f473);
                                    objM8078 = C0411.m8078(qVar);
                                    objM2417 = C0125.m2417();
                                    o3VarM2137 = C0111.m2137();
                                    i13 = 50689;
                                    while (true) {
                                        i13 ^= 50706;
                                        switch (i13) {
                                            case 19:
                                                if (objM8078 == objM2417) {
                                                }
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                fM749 = C0038.m749(C0152.m2915(context), C0049.m957(m4193(), 1191, C0292.f440 ^ 57, 1423), 1.0f);
                                                i43 = 50813;
                                                while (true) {
                                                    i43 ^= 50830;
                                                    switch (i43) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 53:
                                                            z13 = false;
                                                            break;
                                                        case 243:
                                                            if (fM749 == 0.0f) {
                                                                i43 = 51557;
                                                            }
                                                            break;
                                                        case 4075:
                                                            z13 = true;
                                                            i44 = 51588;
                                                            while (true) {
                                                                i44 ^= 51605;
                                                                switch (i44) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i44 = 51619;
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            continue;
                                                            continue;
                                                    }
                                                    i43 = 50875;
                                                }
                                                objM8078 = C0173.m3305(C0009.m192(z13), o3VarM2137);
                                                C0478.m9328(qVar, objM8078);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    g1Var = (m0.g1) objM8078;
                                    objM6985 = C0356.m6985(qVar, false, 1153808919 ^ C0217.f241);
                                    i14 = 51712;
                                    while (true) {
                                        i14 ^= 51729;
                                        switch (i14) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (objM6985 == objM2417) {
                                                }
                                                break;
                                            case 47:
                                                break;
                                            case 76:
                                                zM6317 = C0326.m6316();
                                                i41 = 51836;
                                                while (true) {
                                                    i41 ^= 51853;
                                                    switch (i41) {
                                                        case 241:
                                                            if (!zM6317) {
                                                            }
                                                            break;
                                                        case 1963:
                                                            break;
                                                        case 1992:
                                                            iM2522 = C0131.m2521();
                                                            i42 = 52735;
                                                            while (true) {
                                                                i42 ^= 52752;
                                                                switch (i42) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        z12 = false;
                                                                        i40 = 52611;
                                                                        while (true) {
                                                                            i40 ^= 52628;
                                                                            switch (i40) {
                                                                                case 23:
                                                                                    i40 = 52642;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case 54:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 1007:
                                                                        if (iM2522 == 0) {
                                                                        }
                                                                        break;
                                                                    case 7927:
                                                                        z12 = true;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 2025:
                                                            z12 = false;
                                                            i40 = 52611;
                                                            while (true) {
                                                                i40 ^= 52628;
                                                                switch (i40) {
                                                                    case 23:
                                                                        i40 = 52642;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    case 54:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    objM6985 = C0173.m3305(C0009.m192(z12), o3VarM2137);
                                                    C0478.m9328(qVar, objM6985);
                                                    break;
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    g1Var2 = (m0.g1) objM6985;
                                    objM6986 = C0356.m6985(qVar, false, 1153808844 ^ C0348.f619);
                                    i15 = 53510;
                                    while (true) {
                                        i15 ^= 53527;
                                        switch (i15) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (objM6986 == objM2417) {
                                                }
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 83:
                                                break;
                                            case 116:
                                                strM3930 = C0205.m3930(m4193(), 1213, C0452.f723 ^ (-860), 1482);
                                                C0375.m7360(context, C0243.m4671(m4193(), 1239, C0307.f455 ^ 171, 1141));
                                                zM6316 = C0326.m6316();
                                                i39 = 53634;
                                                while (true) {
                                                    i39 ^= 53651;
                                                    switch (i39) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i39 = 53665;
                                                            continue;
                                                            continue;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        default:
                                                            continue;
                                                            continue;
                                                    }
                                                    i29 = 53758;
                                                    while (true) {
                                                        i29 ^= 53775;
                                                        switch (i29) {
                                                            case 1009:
                                                                if (zM6316) {
                                                                }
                                                                break;
                                                            case 1703:
                                                                break;
                                                            case 1736:
                                                                z11 = false;
                                                                break;
                                                            case 1769:
                                                                iM2521 = C0131.m2521();
                                                                i37 = 54533;
                                                                while (true) {
                                                                    i37 ^= 54550;
                                                                    switch (i37) {
                                                                        case 19:
                                                                            if (iM2521 == 0) {
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 85:
                                                                            z11 = false;
                                                                            break;
                                                                        case 116:
                                                                            z11 = true;
                                                                            i38 = 54657;
                                                                            while (true) {
                                                                                i38 ^= 54674;
                                                                                switch (i38) {
                                                                                    case 19:
                                                                                        i38 = 54688;
                                                                                        continue;
                                                                                        continue;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    i30 = 55432;
                                                    while (true) {
                                                        i30 ^= 55449;
                                                        switch (i30) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                if (zM6316) {
                                                                }
                                                                break;
                                                            case 62:
                                                                break;
                                                            case 95:
                                                                i31 = 56455;
                                                                while (true) {
                                                                    i31 ^= 56472;
                                                                    switch (i31) {
                                                                        case 31:
                                                                            if (zM6316) {
                                                                            }
                                                                            break;
                                                                        case 62:
                                                                            break;
                                                                        case 93:
                                                                            C0290.m5588(C0421.m8279(context), strM3930, 0);
                                                                            i34 = 1507503;
                                                                            while (true) {
                                                                                i34 ^= 1507520;
                                                                                switch (i34) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case 111:
                                                                                        i34 = 1507534;
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                                cVarM1823 = C0414.m8143();
                                                                                i33 = 1507751;
                                                                                while (true) {
                                                                                    i33 ^= 1507768;
                                                                                    switch (i33) {
                                                                                        case 31:
                                                                                            i33 = 1508433;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                        case 1513:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 124:
                                                                            cVarM1823 = C0085.m1823();
                                                                            i32 = 56579;
                                                                            while (true) {
                                                                                i32 ^= 56596;
                                                                                switch (i32) {
                                                                                    case 23:
                                                                                        i32 = 56610;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 54:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 124:
                                                                i35 = 55556;
                                                                while (true) {
                                                                    i35 ^= 55573;
                                                                    switch (i35) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (z11) {
                                                                            }
                                                                            break;
                                                                        case 54:
                                                                            break;
                                                                        case 87:
                                                                            i31 = 56455;
                                                                            while (true) {
                                                                                i31 ^= 56472;
                                                                                switch (i31) {
                                                                                    case 31:
                                                                                        if (zM6316) {
                                                                                        }
                                                                                        break;
                                                                                    case 62:
                                                                                        break;
                                                                                    case 93:
                                                                                        C0290.m5588(C0421.m8279(context), strM3930, 0);
                                                                                        i34 = 1507503;
                                                                                        while (true) {
                                                                                            i34 ^= 1507520;
                                                                                            switch (i34) {
                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                    break;
                                                                                                case 111:
                                                                                                    i34 = 1507534;
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                            cVarM1823 = C0414.m8143();
                                                                                            i33 = 1507751;
                                                                                            while (true) {
                                                                                                i33 ^= 1507768;
                                                                                                switch (i33) {
                                                                                                    case 31:
                                                                                                        i33 = 1508433;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    case 1513:
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 124:
                                                                                        cVarM1823 = C0085.m1823();
                                                                                        i32 = 56579;
                                                                                        while (true) {
                                                                                            i32 ^= 56596;
                                                                                            switch (i32) {
                                                                                                case 23:
                                                                                                    i32 = 56610;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                case 54:
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 116:
                                                                            cVarM1823 = C0124.m2396();
                                                                            i36 = 55680;
                                                                            while (true) {
                                                                                i36 ^= 55697;
                                                                                switch (i36) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i36 = 56362;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 1467:
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
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                        objM6986 = C0173.m3305(cVarM1823, o3VarM2137);
                                                        C0478.m9328(qVar, objM6986);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    g1Var3 = (m0.g1) objM6986;
                                    C0171.m3270(qVar, false);
                                    C0405.m7954(C0012.m238(), new j1(context, g1Var2, g1Var3, null), qVar);
                                    lVarM4370 = C0226.m4370();
                                    y0.o oVarM8894 = C0456.m8892(C0143.m2748(), C0146.m2779(qVar));
                                    f10 = C0280.f425 ^ (-468);
                                    y0.o oVarM47810 = C0250.m4788(oVarM8894, f10);
                                    C0261.m4990(qVar, (-483455900) ^ C0030.f50);
                                    j0VarM4231 = C0218.m4231(C0204.m3900(), C0173.m3300(), qVar);
                                    C0261.m4990(qVar, (-1323939993) ^ C0457.f728);
                                    iM276 = C0014.m276(qVar);
                                    r1VarM275 = C0014.m275(qVar);
                                    C0014.m280(C0379.m7428());
                                    jVarM4451 = C0231.m4451();
                                    bVarM6976 = C0355.m6976(oVarM47810);
                                    z10 = C0196.m3764(qVar) instanceof m0.d;
                                    i16 = 1508526;
                                    while (true) {
                                        i16 ^= 1508543;
                                        switch (i16) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (z10) {
                                                }
                                                break;
                                            case 83:
                                                C0235.m4537();
                                                throw null;
                                            case 114:
                                                break;
                                            case 436:
                                                C0100.m1961(qVar);
                                                zM7502 = C0382.m7502(qVar);
                                                i17 = 1508650;
                                                while (true) {
                                                    i17 ^= 1508667;
                                                    switch (i17) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (zM7502) {
                                                            }
                                                            break;
                                                        case 83:
                                                            C0445.m8685(qVar);
                                                            break;
                                                        case 114:
                                                            break;
                                                        case 3369:
                                                            C0017.m346(qVar, jVarM4451);
                                                            i28 = 1509425;
                                                            while (true) {
                                                                i28 ^= 1509442;
                                                                switch (i28) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 115:
                                                                        i28 = 1509456;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0089.m1904(qVar, j0VarM4231, C0063.m1208());
                                                C0089.m1904(qVar, r1VarM275, C0464.m9055());
                                                iVarM5562 = C0289.m5562();
                                                zM7503 = C0382.m7502(qVar);
                                                i18 = 1509549;
                                                while (true) {
                                                    i18 ^= 1509566;
                                                    switch (i18) {
                                                        case 19:
                                                            if (!zM7503) {
                                                            }
                                                            break;
                                                        case 85:
                                                            C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                            break;
                                                        case 114:
                                                            break;
                                                        case 436:
                                                            zM4399 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM276));
                                                            i27 = 1509673;
                                                            while (true) {
                                                                i27 ^= 1509690;
                                                                switch (i27) {
                                                                    case 19:
                                                                        if (!zM4399) {
                                                                        }
                                                                        break;
                                                                    case 712:
                                                                        break;
                                                                    case 745:
                                                                        break;
                                                                    case 1323:
                                                                        C0133.m2574(iM276, qVar, iM276, iVarM5562);
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
                                                C0352.m6912(0, bVarM6976, new l2(qVar), qVar, 2058660288 ^ C0125.f151);
                                                m0.g1 g1VarM8777 = C0450.m8775(C0271.m5232(mainViewModel), qVar);
                                                C0318.m6169();
                                                C0488.m9503(0, qVar, C0316.m6122(C0010.m206(m4193(), 1246, C0346.f617 ^ (-750), 2559), (String) C0418.m8214(g1VarM8777)));
                                                FillElement fillElementM2373 = C0123.m2371();
                                                iM6740 = C0343.m6740((g5.c) C0418.m8214(g1Var3));
                                                i19 = 1510448;
                                                while (true) {
                                                    i19 ^= 1510465;
                                                    switch (i19) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case 47:
                                                            jM4129 = C0216.m4129(C0314.m6087(), 0.1f);
                                                            break;
                                                        case 113:
                                                            if (iM6740 != 0) {
                                                            }
                                                            break;
                                                        case 204:
                                                            i24 = 1510572;
                                                            while (true) {
                                                                i24 ^= 1510589;
                                                                switch (i24) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (iM6740 != 3) {
                                                                        }
                                                                        break;
                                                                    case 87:
                                                                        jM4129 = C0216.m4129(C0045.m882(), 0.1f);
                                                                        i25 = 1511471;
                                                                        while (true) {
                                                                            i25 ^= 1511488;
                                                                            switch (i25) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case 111:
                                                                                    i25 = 1511502;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 118:
                                                                        break;
                                                                    case 809:
                                                                        jM4129 = C0019.m389(4281539390L ^ ((long) C0233.f313));
                                                                        i26 = 1511347;
                                                                        while (true) {
                                                                            i26 ^= 1511364;
                                                                            switch (i26) {
                                                                                case 22:
                                                                                    break;
                                                                                case 119:
                                                                                    i26 = 1511378;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
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
                                                k0.g0 g0VarM12911 = C0067.m1299(jM4129, qVar, 0);
                                                e0.e eVarM8239 = C0419.m8237(f10);
                                                float f15 = 1;
                                                iM6741 = C0343.m6740((g5.c) C0418.m8214(g1Var3));
                                                i20 = 1511595;
                                                while (true) {
                                                    i20 ^= 1511612;
                                                    switch (i20) {
                                                        case 23:
                                                            if (iM6741 != 0) {
                                                            }
                                                            break;
                                                        case 815:
                                                            i21 = 1512370;
                                                            while (true) {
                                                                i21 ^= 1512387;
                                                                switch (i21) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 51:
                                                                        jM41210 = C0216.m4129(C0045.m882(), 0.3f);
                                                                        i22 = 1513269;
                                                                        while (true) {
                                                                            i22 ^= 1513286;
                                                                            switch (i22) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case 115:
                                                                                    i22 = 1513300;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 113:
                                                                        if (iM6741 != 3) {
                                                                        }
                                                                        break;
                                                                    case 1996:
                                                                        jM41210 = C0216.m4129(C0019.m389((-4294940968L) ^ ((long) C0114.f140)), 0.4f);
                                                                        i23 = 1512494;
                                                                        while (true) {
                                                                            i23 ^= 1512511;
                                                                            switch (i23) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i23 = 1512525;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case 114:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 968:
                                                            jM41210 = C0216.m4129(C0314.m6087(), 0.3f);
                                                            break;
                                                        case 1001:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0271.m5230(fillElementM2373, eVarM8239, g0VarM12911, null, C0059.m1134(f15, jM41210), C0059.m1122(qVar, (-694633640) ^ C0084.f118, new k1(g1Var3, g1VarM8777, context)), qVar, 196614, 8);
                                                float f16 = C0069.f89 ^ (-830);
                                                C0072.m1564(C0270.m5166(lVarM4370, f16), qVar);
                                                C0488.m9503(0, qVar, C0316.m6122(C0031.m607(m4193(), 1267, C0413.f684 ^ (-948), 1794), (String) C0418.m8214(g1VarM8777)));
                                                long jM20311 = C0104.m2039();
                                                C0271.m5230(fillElementM2373, C0419.m8237(f10), C0067.m1299(jM20311, qVar, 0), null, null, C0059.m1122(qVar, (-2074903755) ^ C0144.f170, new k(mainViewModel, g1VarM8777, context)), qVar, 196614, 24);
                                                C0072.m1564(C0270.m5166(lVarM4370, f16), qVar);
                                                C0488.m9503(0, qVar, C0316.m6122(C0376.m7387(m4193(), 1282, C0264.f344 ^ 557, 364), (String) C0418.m8214(g1VarM8777)));
                                                C0271.m5230(fillElementM2373, C0419.m8237(f10), C0067.m1299(jM20311, qVar, 0), null, null, C0059.m1122(qVar, 1140521609 ^ C0381.f652, new s.k(g1Var, g1VarM8777, context, g1Var2, 4)), qVar, 196614, 24);
                                                C0072.m1564(C0270.m5166(lVarM4370, f16), qVar);
                                                C0488.m9503(0, qVar, C0316.m6122(C0121.m2327(m4193(), 1300, C0170.f194 ^ (-129), 2161), (String) C0418.m8214(g1VarM8777)));
                                                C0271.m5230(fillElementM2373, C0419.m8237(f10), C0067.m1299(jM20311, qVar, 0), null, null, C0059.m1122(qVar, (-60979203) ^ C0426.f697, new k1(g1VarM8777, g1Var2, context, 0)), qVar, 196614, 24);
                                                C0072.m1564(C0270.m5166(lVarM4370, f16), qVar);
                                                C0488.m9503(0, qVar, C0316.m6122(C0456.m8898(m4193(), 1320, C0452.f723 ^ (-843), 1382), (String) C0418.m8214(g1VarM8777)));
                                                C0271.m5230(fillElementM2373, C0419.m8237(f10), C0067.m1299(jM20311, qVar, 0), null, null, C0059.m1122(qVar, 1018562151 ^ C0222.f302, new u(mainViewModel, context, g1VarM8777, g1Var2, g1Var3)), qVar, 196614, C0290.f438 ^ (-326));
                                                C0072.m1564(C0270.m5166(lVarM4370, C0143.f169 ^ (-343)), qVar);
                                                C0171.m3270(qVar, false);
                                                C0171.m3270(qVar, true);
                                                C0171.m3270(qVar, false);
                                                C0171.m3270(qVar, false);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    x1VarM7533 = C0384.m7533(qVar);
                                    i12 = 1513393;
                                    while (true) {
                                        i12 ^= 1513410;
                                        switch (i12) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                return;
                                            case 115:
                                                if (x1VarM7533 != null) {
                                                    i12 = 1513486;
                                                }
                                                break;
                                            case 4044:
                                                x1VarM7533.f11756d = new c5.k(mainViewModel, i10, C0152.f177 ^ 363);
                                                return;
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        i12 = 1513455;
                                    }
                                }
                                break;
                            case 83:
                                C0470.m9156(qVar);
                                int i59 = 49914;
                                while (true) {
                                    i59 ^= 49931;
                                    switch (i59) {
                                        case 497:
                                            i59 = 50596;
                                            continue;
                                        case 1711:
                                            break;
                                        default:
                                            continue;
                                    }
                                    x1VarM7533 = C0384.m7533(qVar);
                                    i12 = 1513393;
                                    while (true) {
                                        i12 ^= 1513410;
                                        switch (i12) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                return;
                                            case 115:
                                                if (x1VarM7533 != null) {
                                                    i12 = 1513486;
                                                }
                                                break;
                                            case 4044:
                                                x1VarM7533.f11756d = new c5.k(mainViewModel, i10, C0152.f177 ^ 363);
                                                return;
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        i12 = 1513455;
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
    }

    /* JADX WARN: Code duplicated, block: B:329:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x0272 A[SYNTHETIC] */
    public static final void l(String str, String str2, boolean z10, i1.f fVar, c9.a aVar, m0.m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        long jM9422;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        C0375.m7360(str, C0469.m9139(m4193(), 1331, C0042.f62 ^ 83, 2054));
        C0375.m7360(str2, C0422.m8293(m4193(), 1341, C0257.f337 ^ (-347), 1636));
        C0375.m7360(fVar, C0221.m4271(m4193(), 1346, C0227.f307 ^ (-908), 983));
        C0375.m7360(aVar, C0085.m1814(m4193(), 1350, C0315.f463 ^ 517, 2844));
        m0.q qVar = (m0.q) mVar;
        C0393.m7698(qVar, 790907530 ^ C0411.f682);
        int i20 = C0300.f448;
        int i21 = 1616;
        while (true) {
            i21 ^= 1633;
            switch (i21) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i21 = ((i20 ^ (-737)) & i10) == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM2013 = C0103.m2013(qVar, str);
                    int i22 = 1740;
                    while (true) {
                        i22 ^= 1757;
                        switch (i22) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i22 = zM2013 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                i19 = 2;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                i19 = 4;
                                int i23 = 1864;
                                while (true) {
                                    i23 ^= 1881;
                                    switch (i23) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i23 = 48674;
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
                    i11 = (i19 & i10) | (i19 ^ i10);
                    int i24 = 48767;
                    while (true) {
                        i24 ^= 48784;
                        switch (i24) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i24 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    i11 = i10;
                    break;
                default:
                    break;
            }
        }
        int i25 = C0086.f120;
        int i26 = 48891;
        while (true) {
            i26 ^= 48908;
            switch (i26) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    i26 = ((i25 ^ (-889)) & i10) == 0 ? 49635 : 48953;
                    break;
                case 32495:
                    boolean zM2014 = C0103.m2013(qVar, str2);
                    int i27 = 49666;
                    while (true) {
                        i27 ^= 49683;
                        switch (i27) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i27 = zM2014 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                i18 = 32;
                                int i28 = 49790;
                                while (true) {
                                    i28 ^= 49807;
                                    switch (i28) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i28 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                i18 = 16;
                                break;
                            default:
                                break;
                        }
                    }
                    i11 = (i11 & i18) | (i11 ^ i18);
                    break;
                default:
                    break;
            }
        }
        int i29 = C0020.f40;
        int i30 = 49914;
        while (true) {
            i30 ^= 49931;
            switch (i30) {
                case 497:
                    i30 = ((i29 ^ (-283)) & i10) == 0 ? 50658 : 50627;
                    break;
                case 1711:
                    break;
                case 1736:
                    break;
                case 1769:
                    boolean zM4326 = C0224.m4326(qVar, z10);
                    int i31 = 50689;
                    while (true) {
                        i31 ^= 50706;
                        switch (i31) {
                            case 19:
                                if (zM4326) {
                                    i31 = 50782;
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                i17 = 128;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                i17 = 256;
                                int i32 = 50813;
                                while (true) {
                                    i32 ^= 50830;
                                    switch (i32) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 243:
                                            i32 = 50844;
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i31 = 50751;
                    }
                    i11 = (i11 & i17) | (i11 ^ i17);
                    break;
                default:
                    break;
            }
        }
        int i33 = C0195.f219;
        int i34 = 51588;
        while (true) {
            i34 ^= 51605;
            switch (i34) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i34 = ((i33 ^ (-8120)) & i10) == 0 ? 51681 : 51650;
                    break;
                case 54:
                    break;
                case 87:
                    break;
                case 116:
                    boolean zM2015 = C0103.m2013(qVar, fVar);
                    int i35 = 51712;
                    while (true) {
                        i35 ^= 51729;
                        switch (i35) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i35 = zM2015 ? 51805 : 51774;
                                break;
                            case 47:
                                i16 = 1024;
                                break;
                            case 76:
                                i16 = 2048;
                                int i36 = 51836;
                                while (true) {
                                    i36 ^= 51853;
                                    switch (i36) {
                                        case 241:
                                            i36 = 52518;
                                            continue;
                                        case 1963:
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
                    i11 = (i11 & i16) | (i11 ^ i16);
                    break;
                default:
                    break;
            }
        }
        int i37 = 52611;
        while (true) {
            i37 ^= 52628;
            switch (i37) {
                case 23:
                    i37 = (57344 & ((i10 ^ (-1)) ^ 57344)) == 0 ? 52704 : 52673;
                    break;
                case 54:
                    break;
                case 85:
                    i12 = i11;
                    break;
                case 116:
                    boolean zM5551 = C0288.m5551(qVar, aVar);
                    int i38 = 52735;
                    while (true) {
                        i38 ^= 52752;
                        switch (i38) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                i15 = 8192;
                                break;
                            case 1007:
                                i38 = zM5551 ? 53479 : 52797;
                                break;
                            case 7927:
                                i15 = 16384;
                                int i39 = 53510;
                                while (true) {
                                    i39 ^= 53527;
                                    switch (i39) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i39 = 53541;
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
                    i12 = (i11 & i15) | (i11 ^ i15);
                    break;
                default:
                    break;
            }
        }
        int i40 = 53634;
        while (true) {
            i40 ^= 53651;
            switch (i40) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i40 = (46811 & ((i12 ^ (-1)) ^ 46811)) == 9362 ? 53727 : 53696;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    boolean zM1625 = C0074.m1625(qVar);
                    int i41 = 53758;
                    while (true) {
                        i41 ^= 53775;
                        switch (i41) {
                            case 1009:
                                i41 = !zM1625 ? 54502 : 54471;
                                break;
                            case 1703:
                                break;
                            case 1736:
                                C0470.m9156(qVar);
                                int i42 = 54657;
                                while (true) {
                                    i42 ^= 54674;
                                    switch (i42) {
                                        case 19:
                                            i42 = 54688;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 1769:
                                int i43 = 54533;
                                while (true) {
                                    i43 ^= 54550;
                                    switch (i43) {
                                        case 19:
                                            i43 = 54564;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        default:
                                            continue;
                                    }
                                    FillElement fillElementM2371 = C0123.m2371();
                                    C0066.m1280();
                                    i13 = 55432;
                                    while (true) {
                                        i13 ^= 55449;
                                        switch (i13) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i13 = z10 ? 55525 : 55494;
                                                break;
                                            case 62:
                                                break;
                                            case 95:
                                                jM9422 = C0484.m9422();
                                                break;
                                            case 124:
                                                jM9422 = C0216.m4129(C0045.m882(), 0.15f);
                                                i14 = 55556;
                                                while (true) {
                                                    i14 ^= 55573;
                                                    switch (i14) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i14 = 55587;
                                                            continue;
                                                            continue;
                                                        case 54:
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
                                    }
                                    k0.y yVarM9441 = C0485.m9441(jM9422, 820 ^ ((long) C0061.f81), qVar, C0052.f72 ^ 943);
                                    e0.e eVarM8237 = C0419.m8237(C0396.f667 ^ (-207));
                                    u0.b bVarM1122 = C0059.m1122(qVar, 1967506518 ^ C0196.f220, new x0(z10, fVar, str, str2, 1));
                                    int i44 = (i12 >> (C0307.f455 ^ 160)) & (C0247.f327 ^ (-495));
                                    C0057.m1096(aVar, fillElementM2371, false, eVarM8237, yVarM9441, null, null, null, null, bVarM1122, qVar, (805306416 ^ i44) | (i44 & 805306416), C0149.f174 ^ (-363));
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 83:
                    FillElement fillElementM2372 = C0123.m2371();
                    C0066.m1280();
                    i13 = 55432;
                    while (true) {
                        i13 ^= 55449;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (z10) {
                                }
                                break;
                            case 62:
                                break;
                            case 95:
                                jM9422 = C0484.m9422();
                                break;
                            case 124:
                                jM9422 = C0216.m4129(C0045.m882(), 0.15f);
                                i14 = 55556;
                                while (true) {
                                    i14 ^= 55573;
                                    switch (i14) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i14 = 55587;
                                            continue;
                                            continue;
                                        case 54:
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
                    }
                    k0.y yVarM9442 = C0485.m9441(jM9422, 820 ^ ((long) C0061.f81), qVar, C0052.f72 ^ 943);
                    e0.e eVarM8238 = C0419.m8237(C0396.f667 ^ (-207));
                    u0.b bVarM1123 = C0059.m1122(qVar, 1967506518 ^ C0196.f220, new x0(z10, fVar, str, str2, 1));
                    int i45 = (i12 >> (C0307.f455 ^ 160)) & (C0247.f327 ^ (-495));
                    C0057.m1096(aVar, fillElementM2372, false, eVarM8238, yVarM9442, null, null, null, null, bVarM1123, qVar, (805306416 ^ i45) | (i45 & 805306416), C0149.f174 ^ (-363));
                    break;
                default:
                    break;
            }
            m0.x1 x1VarM7533 = C0384.m7533(qVar);
            int i46 = 55680;
            while (true) {
                i46 ^= 55697;
                switch (i46) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i46 = x1VarM7533 != null ? 56424 : 56393;
                        break;
                    case 1467:
                        break;
                    case 1496:
                        break;
                    case 1529:
                        x1VarM7533.f11756d = new y0(str, str2, z10, fVar, aVar, i10, 1);
                        break;
                    default:
                        break;
                }
            }
            int iM8951 = C0459.m8951();
            int i47 = 56455;
            while (true) {
                i47 ^= 56472;
                switch (i47) {
                    case 31:
                        if (iM8951 >= 0) {
                            i47 = 56548;
                        }
                        break;
                    case 62:
                        break;
                    case 93:
                        return;
                    case 124:
                        System.out.println(Long.valueOf(C0166.m3175("Zpfw8x")));
                        return;
                    default:
                        continue;
                }
                i47 = 56517;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:337:0x0354 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x035e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x034c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x036d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x0373 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x0365 A[SYNTHETIC] */
    public static final void m(i1.f fVar, String str, String str2, long j10, y0.o oVar, m0.m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        y0.o oVar2;
        int i19;
        y0.o oVarM4370;
        int i20;
        C0375.m7360(fVar, C0385.m7543(m4193(), 1357, C0232.f312 ^ 568, 1897));
        C0375.m7360(str, C0258.m4943(m4193(), 1361, C0229.f309 ^ (-246), 672));
        C0375.m7360(str2, C0210.m4027(m4193(), 1366, C0258.f338 ^ 737, 2045));
        m0.q qVar = (m0.q) mVar;
        C0393.m7698(qVar, 976985643 ^ C0150.f175);
        int i21 = 1616;
        while (true) {
            i21 ^= 1633;
            switch (i21) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i21 = ((i11 ^ (-2)) & i11) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    i12 = (C0382.f653 ^ 811) | i10;
                    int i22 = 1740;
                    while (true) {
                        i22 ^= 1757;
                        switch (i22) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i22 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    int i23 = C0048.f68;
                    int i24 = 1864;
                    while (true) {
                        i24 ^= 1881;
                        switch (i24) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i24 = ((i23 ^ (-751)) & i10) == 0 ? 48736 : 48705;
                                break;
                            case 47384:
                                i12 = i10;
                                break;
                            case 47417:
                                boolean zM2013 = C0103.m2013(qVar, fVar);
                                int i25 = 48767;
                                while (true) {
                                    i25 ^= 48784;
                                    switch (i25) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i13 = 2;
                                            break;
                                        case 76:
                                            i13 = 4;
                                            int i26 = 48891;
                                            while (true) {
                                                i26 ^= 48908;
                                                switch (i26) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i26 = 48922;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 239:
                                            i25 = zM2013 ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                i12 = (i13 & i10) | (i13 ^ i10);
                                int i27 = 49666;
                                while (true) {
                                    i27 ^= 49683;
                                    switch (i27) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i27 = 49697;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
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
        int i28 = C0162.f186;
        int i29 = 49790;
        while (true) {
            i29 ^= 49807;
            switch (i29) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    int i30 = C0426.f697;
                    int i31 = 50689;
                    while (true) {
                        i31 ^= 50706;
                        switch (i31) {
                            case 19:
                                i31 = ((i30 ^ 265) & i10) == 0 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                boolean zM2014 = C0103.m2013(qVar, str);
                                int i32 = 50813;
                                while (true) {
                                    i32 ^= 50830;
                                    switch (i32) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 53:
                                            i14 = 16;
                                            break;
                                        case 243:
                                            i32 = zM2014 ? 51557 : 50875;
                                            break;
                                        case 4075:
                                            i14 = 32;
                                            int i33 = 51588;
                                            while (true) {
                                                i33 ^= 51605;
                                                switch (i33) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i33 = 51619;
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
                                i12 = (i12 & i14) | (i12 ^ i14);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 84:
                    i12 |= C0341.f612 ^ (-707);
                    int i34 = 49914;
                    while (true) {
                        i34 ^= 49931;
                        switch (i34) {
                            case 497:
                                i34 = 50596;
                                continue;
                            case 1711:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 241:
                    i29 = ((i28 ^ 838) & i11) != 0 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
        }
        int i35 = C0390.f661;
        int i36 = 51712;
        while (true) {
            i36 ^= 51729;
            switch (i36) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i36 = ((i35 ^ (-319)) & i11) != 0 ? 51805 : 51774;
                    break;
                case 47:
                    int i37 = C0116.f142;
                    int i38 = 52611;
                    while (true) {
                        i38 ^= 52628;
                        switch (i38) {
                            case 23:
                                i38 = ((i37 ^ 876) & i10) == 0 ? 52704 : 52673;
                                break;
                            case 54:
                                break;
                            case 85:
                                break;
                            case 116:
                                boolean zM2015 = C0103.m2013(qVar, str2);
                                int i39 = 52735;
                                while (true) {
                                    i39 ^= 52752;
                                    switch (i39) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i15 = 128;
                                            break;
                                        case 1007:
                                            i39 = zM2015 ? 53479 : 52797;
                                            break;
                                        case 7927:
                                            i15 = 256;
                                            int i40 = 53510;
                                            while (true) {
                                                i40 ^= 53527;
                                                switch (i40) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i40 = 53541;
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
                                i12 = (i12 & i15) | (i12 ^ i15);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 76:
                    i12 |= C0306.f454 ^ (-254);
                    int i41 = 51836;
                    while (true) {
                        i41 ^= 51853;
                        switch (i41) {
                            case 241:
                                i41 = 52518;
                                continue;
                            case 1963:
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
        int i42 = C0174.f198;
        int i43 = 53634;
        while (true) {
            i43 ^= 53651;
            switch (i43) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i43 = ((i42 ^ (-161)) & i11) != 0 ? 53727 : 53696;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    i12 |= C0381.f652 ^ (-3092);
                    int i44 = 53758;
                    while (true) {
                        i44 ^= 53775;
                        switch (i44) {
                            case 1009:
                                i44 = 54440;
                                continue;
                            case 1703:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 83:
                    int i45 = C0186.f210;
                    int i46 = 54533;
                    while (true) {
                        i46 ^= 54550;
                        switch (i46) {
                            case 19:
                                i46 = ((i45 ^ (-7500)) & i10) == 0 ? 54626 : 54595;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 85:
                                break;
                            case 116:
                                boolean zM4041 = C0211.m4041(qVar, j10);
                                int i47 = 54657;
                                while (true) {
                                    i47 ^= 54674;
                                    switch (i47) {
                                        case 19:
                                            if (zM4041) {
                                                i47 = 55401;
                                                continue;
                                            } else {
                                                i47 = 54719;
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i16 = 1024;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            i47 = 54719;
                                            break;
                                        case 3579:
                                            i16 = 2048;
                                            int i48 = 55432;
                                            while (true) {
                                                i48 ^= 55449;
                                                switch (i48) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i48 = 55463;
                                                        break;
                                                    case 62:
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                i12 = (i12 & i16) | (i12 ^ i16);
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
        int i49 = i11 & (C0444.f715 ^ (-840));
        int i50 = 55556;
        while (true) {
            i50 ^= 55573;
            switch (i50) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i50 = i49 != 0 ? 55649 : 55618;
                    break;
                case 54:
                    break;
                case 87:
                    int i51 = 56455;
                    while (true) {
                        i51 ^= 56472;
                        switch (i51) {
                            case 31:
                                i51 = (57344 & ((i10 ^ (-1)) ^ 57344)) == 0 ? 56548 : 56517;
                                break;
                            case 62:
                                break;
                            case 93:
                                i17 = i12;
                                break;
                            case 124:
                                boolean zM2016 = C0103.m2013(qVar, oVar);
                                int i52 = 56579;
                                while (true) {
                                    i52 ^= 56596;
                                    switch (i52) {
                                        case 23:
                                            i52 = zM2016 ? 1507472 : 56641;
                                            break;
                                        case 54:
                                            break;
                                        case 85:
                                            i18 = 8192;
                                            break;
                                        case 1564036:
                                            i18 = 16384;
                                            int i53 = 1507503;
                                            while (true) {
                                                i53 ^= 1507520;
                                                switch (i53) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 111:
                                                        i53 = 1507534;
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
                                int i54 = (i12 & i18) | (i12 ^ i18);
                                int i55 = 1507627;
                                while (true) {
                                    i55 ^= 1507644;
                                    switch (i55) {
                                        case 23:
                                            i55 = 1507658;
                                            continue;
                                        case 118:
                                            i17 = i54;
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
                case 116:
                    i17 = i12 | (C0243.f323 ^ 24688);
                    break;
                default:
                    break;
            }
        }
        int i56 = 55680;
        while (true) {
            i56 ^= 55697;
            switch (i56) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i56 = 56362;
                    break;
                case 1467:
                    int i57 = 1507751;
                    while (true) {
                        i57 ^= 1507768;
                        switch (i57) {
                            case 31:
                                i57 = (46811 & ((i17 ^ (-1)) ^ 46811)) == 9362 ? 1508495 : 1508464;
                                break;
                            case 1335:
                                boolean zM1625 = C0074.m1625(qVar);
                                int i58 = 1508526;
                                while (true) {
                                    i58 ^= 1508543;
                                    switch (i58) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i58 = !zM1625 ? 1508619 : 1508588;
                                            break;
                                        case 83:
                                            C0470.m9156(qVar);
                                            int i59 = 1509425;
                                            while (true) {
                                                i59 ^= 1509442;
                                                switch (i59) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        oVar2 = oVar;
                                                        break;
                                                    case 115:
                                                        i59 = 1509456;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 114:
                                            break;
                                        case 436:
                                            int i60 = 1508650;
                                            while (true) {
                                                i60 ^= 1508667;
                                                switch (i60) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i60 = 1508681;
                                                        continue;
                                                    case 114:
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i19 = 1509549;
                                                while (true) {
                                                    i19 ^= 1509566;
                                                    switch (i19) {
                                                        case 19:
                                                            i19 = i49 != 0 ? 1509642 : 1509611;
                                                            break;
                                                        case 85:
                                                            oVarM4370 = oVar;
                                                            break;
                                                        case 114:
                                                            break;
                                                        case 436:
                                                            oVarM4370 = C0226.m4370();
                                                            i20 = 1509673;
                                                            while (true) {
                                                                i20 ^= 1509690;
                                                                switch (i20) {
                                                                    case 19:
                                                                        i20 = 1510355;
                                                                        continue;
                                                                        continue;
                                                                    case 745:
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
                                                }
                                                k0.g0 g0VarM1299 = C0067.m1299(C0104.m2039(), qVar, 0);
                                                e0.e eVarM8237 = C0419.m8237(C0288.f433 ^ 763);
                                                u0.b bVarM1122 = C0059.m1122(qVar, (-891116440) ^ C0464.f735, new m1(fVar, str, j10, str2));
                                                int i61 = (i17 >> (C0409.f680 ^ (-390))) & (C0132.f158 ^ (-217));
                                                C0271.m5230(oVarM4370, eVarM8237, g0VarM1299, null, null, bVarM1122, qVar, (196608 ^ i61) | (i61 & 196608), 24);
                                                oVar2 = oVarM4370;
                                                break;
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 1480:
                                i19 = 1509549;
                                while (true) {
                                    i19 ^= 1509566;
                                    switch (i19) {
                                        case 19:
                                            if (i49 != 0) {
                                            }
                                            break;
                                        case 85:
                                            oVarM4370 = oVar;
                                            break;
                                        case 114:
                                            break;
                                        case 436:
                                            oVarM4370 = C0226.m4370();
                                            i20 = 1509673;
                                            while (true) {
                                                i20 ^= 1509690;
                                                switch (i20) {
                                                    case 19:
                                                        i20 = 1510355;
                                                        continue;
                                                        continue;
                                                    case 745:
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
                                }
                                k0.g0 g0VarM12910 = C0067.m1299(C0104.m2039(), qVar, 0);
                                e0.e eVarM8238 = C0419.m8237(C0288.f433 ^ 763);
                                u0.b bVarM1123 = C0059.m1122(qVar, (-891116440) ^ C0464.f735, new m1(fVar, str, j10, str2));
                                int i62 = (i17 >> (C0409.f680 ^ (-390))) & (C0132.f158 ^ (-217));
                                C0271.m5230(oVarM4370, eVarM8238, g0VarM12910, null, null, bVarM1123, qVar, (196608 ^ i62) | (i62 & 196608), 24);
                                oVar2 = oVarM4370;
                                break;
                            case 1513:
                                break;
                            default:
                                break;
                        }
                        m0.x1 x1VarM7533 = C0384.m7533(qVar);
                        int i63 = 1510448;
                        while (true) {
                            i63 ^= 1510465;
                            switch (i63) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 47:
                                    return;
                                case 113:
                                    if (x1VarM7533 != null) {
                                        i63 = 1510541;
                                    }
                                    break;
                                case 204:
                                    x1VarM7533.f11756d = new n1(fVar, str, str2, j10, oVar2, i10, i11);
                                    return;
                                default:
                                    continue;
                            }
                            i63 = 1510510;
                        }
                    }
                    break;
            }
        }
    }

    public static final String n(l3 l3Var) {
        return (String) C0418.m8214(l3Var);
    }

    /* JADX INFO: renamed from: ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static short[] m4193() {
        int iM5249 = C0272.m5249();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5249 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f281short;
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

    /* JADX INFO: renamed from: ۡۥۥۡ, reason: not valid java name and contains not printable characters */
    public static Map m4194(Object obj) {
        int iM6940 = C0353.m6940();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6940 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return r8.v.D0((q8.f[]) obj);
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
}
