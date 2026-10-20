package k6;

import a.C0000;
import a2.C0004;
import a7.C0008;
import a8.C0009;
import a8.C0010;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.C0014;
import android.support.v4.graphics.drawable.C0016;
import androidx.annotation.C0018;
import androidx.annotation.C0019;
import androidx.compose.foundation.C0026;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.graphics.C0030;
import androidx.compose.ui.graphics.C0032;
import androidx.compose.ui.input.key.C0033;
import androidx.compose.ui.layout.C0035;
import androidx.compose.ui.node.C0037;
import androidx.profileinstaller.C0046;
import androidx.versionedparcelable.C0048;
import b4.C0052;
import b7.C0053;
import b7.C0054;
import c0.C0057;
import c1.C0058;
import c1.C0060;
import c1.C0061;
import c3.C0062;
import c4.C0066;
import c6.C0067;
import c7.C0068;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.datatransport.cct.C0076;
import com.google.android.datatransport.cct.C0077;
import com.google.android.datatransport.cct.C0078;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.common.C0087;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.tasks.C0102;
import com.google.android.gms.measurement.internal.C0105;
import com.google.android.play.core.integrity.client.C0107;
import com.google.android.play.core.integrity.client.C0108;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.C0205;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.components.C0134;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.emulators.C0141;
import com.google.firebase.encoders.C0143;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.iid.C0170;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.ktx.C0179;
import com.google.firebase.measurement.C0183;
import com.google.firebase.measurement.C0184;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfig.interop.C0198;
import com.google.firebase.remoteconfig.ktx.C0199;
import com.google.firebase.remoteconfiginterop.C0203;
import com.google.firebase.tracing.C0204;
import com.google.gson.internal.bind.C0207;
import com.google.gson.internal.sql.C0208;
import com.google.protobuf.C0209;
import d.C0211;
import d1.C0214;
import d2.C0216;
import d4.C0218;
import d7.C0221;
import d9.C0224;
import d9.C0225;
import d9.C0227;
import dagger.hilt.C0256;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.internal.migration.C0233;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.android.internal.modules.C0235;
import dagger.hilt.android.lifecycle.C0238;
import dagger.hilt.codegen.C0243;
import dagger.hilt.internal.C0254;
import dagger.hilt.internal.aggregatedroot.codegen.C0246;
import dagger.hilt.internal.aliasof.C0248;
import dagger.hilt.internal.generatesrootinput.C0251;
import dagger.hilt.migration.C0255;
import e9.C0267;
import ea.C0268;
import f.C0270;
import f.C0271;
import f0.C0273;
import f4.C0275;
import f4.C0277;
import fa.C0280;
import fa.C0281;
import g.C0284;
import g2.C0287;
import g5.C0291;
import g8.C0294;
import g9.C0295;
import h3.C0302;
import h3.C0304;
import h4.C0305;
import h4.C0306;
import h5.C0308;
import i.C0316;
import i.C0317;
import ia.C0323;
import j5.C0328;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k1.C0333;
import k2.C0334;
import k3.C0335;
import k3.C0336;
import k7.C0338;
import l0.C0340;
import l0.C0341;
import l2.C0342;
import l6.C0345;
import l9.C0348;
import m1.C0351;
import m5.C0355;
import m5.C0356;
import m7.C0358;
import m7.C0359;
import n.C0361;
import n.C0362;
import o1.C0368;
import o4.C0370;
import o8.C0372;
import p0.C0374;
import p5.C0378;
import q1.C0384;
import q2.C0385;
import q5.C0386;
import q6.C0387;
import q6.C0388;
import q7.C0391;
import r2.C0397;
import r4.C0399;
import r5.C0400;
import r6.C0402;
import r7.C0404;
import r7.C0405;
import s0.C0410;
import s2.C0412;
import s6.C0414;
import s8.C0417;
import t1.C0420;
import t2.C0422;
import u.C0429;
import u1.C0432;
import u2.C0434;
import u3.C0435;
import u8.C0439;
import v.C0440;
import v0.C0441;
import v0.C0443;
import v6.C0447;
import v6.C0448;
import v7.C0449;
import v8.C0451;
import w.C0454;
import w0.C0455;
import w1.C0456;
import w2.C0457;
import w2.C0459;
import w4.C0460;
import w4.C0461;
import w4.C0462;
import w5.C0464;
import x0.C0467;
import x2.C0468;
import x4.C0470;
import x5.C0471;
import x7.C0473;
import x8.C0474;
import y6.C0477;
import y9.C0480;
import z.C0481;
import z.C0482;
import z0.C0483;
import z1.C0484;
import z2.C0485;
import z3.C0486;
import z3.C0487;
import z3.C0488;
import z7.C0491;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public final class r7 extends m7 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f582short = {2156, 2140, 1505, 1520, 1520, 3123, 2582, 2582, 2749, 2790, 2711, 588, 576, 578, 607, 590, 605, 582, 604, 576, 577, 624, 603, 598, 607, 586, 1264, 1276, 1257, 1278, 1269, 1218, 1276, 1262, 1218, 1275, 1265, 1266, 1276, 1257, 3138, 3150, 3148, 3153, 3136, 3155, 3144, 3154, 3150, 3151, 3198, 3159, 3136, 3149, 3156, 3140, 401, 405, 402, 419, 415, 403, 401, 396, 413, 398, 405, 399, 403, 402, 419, 394, 413, 400, 393, 409, 1045, 1049, 1024, 1063, 1051, 1047, 1045, 1032, 1049, 1034, 1041, 1035, 1047, 1046, 1063, 1038, 1049, 1044, 1037, 1053, 409, 494, 2004, 1998, 1676, 1751, 1702, 2808, 2804, 2770, 2757, 2771, 2773, 2764, 2772, 2771, 2714, 2688, 610, 613, 624, 613, 612, 610, 555, 561, 3042, 2965, 651, 662, 641, 654, 642, 646, 652, 688, 649, 646, 643, 667, 650, 669, 688, 667, 646, 642, 650, 668, 667, 654, 642, 671, 668, 725, 719, 660, 626, 1841, 1831, 1843, 1847, 1831, 1836, 1825, 1831, 1821, 1828, 1835, 1838, 1846, 1831, 1840, 1821, 1846, 1835, 1839, 1831, 1841, 1846, 1827, 1839, 1842, 1841, 1912, 1890, 1849, 2949, 2975, 3044, 752, 1140, 1031, 1143, 1137, 1025, 1141, 1123, 1140, 1031, 1132, 1137, 1125, 1025, 1143, 1024, 1138, 1123, 1031, 1132, 1137, 1125, 1025, 1142, 1056, 1031, 1132, 1137, 1125, 1025, 1142, 1024, 1138, 1123, 1031, 1132, 1137, 1125, 1025, 1143, 1141, 1496, 1509, 1522, 1533, 1521, 1525, 1535, 1468, 993, 983, 963, 967, 983, 988, 977, 983, 914, 2302, 2248, 2270, 2270, 2244, 2242, 2243, 2176, 2302, 2254, 2242, 2269, 2248, 2249, 2189, 1310, 1328, 1337, 1336, 1317, 1342, 1337, 1328, 1399, 1337, 1330, 1328, 1334, 1315, 1342, 1313, 1330, 1399, 1333, 1342, 1315, 1399, 1342, 1337, 1331, 1330, 1327, 1399, 1315, 1336, 1399, 1333, 1330, 1399, 1332, 1339, 1330, 1334, 1317, 1330, 1331, 1434, 1460, 1469, 1468, 1441, 1466, 1469, 1460, 1523, 1457, 1466, 1447, 1523, 1466, 1469, 1463, 1462, 1451, 1523, 1460, 1441, 1462, 1458, 1447, 1462, 1441, 1523, 1447, 1467, 1458, 1469, 1523, 1457, 1466, 1447, 1408, 1462, 1447, 1523, 1440, 1466, 1449, 1462, 2998, 1380, 1397, 1392, 1388, 1385, 1379, 1377, 1396, 1381, 1312, 1381, 1388, 1381, 1389, 1381, 1390, 1396, 1338, 1312, 1920, 2954, 2944, 2973, 2994, 2956, 2973, 2973, 2994, 2948, 2953, 581, 591, 594, 637, 596, 583, 592, 593, 587, 589, 588, 3077, 3087, 3085, 3085, 3084, 770, 787, 787, 828, 778, 781, 784, 791, 770, 781, 768, 774, 828, 778, 775, 417, 439, 442, 439, 3065, 3054, 3061, 3071, 3063, 3070, 3012, 3058, 3071, 2180, 2197, 2197, 2234, 2176, 2195, 2176, 2187, 2193, 2234, 2187, 2180, 2184, 2176, 443, 426, 426, 389, 428, 447, 424, 425, 435, 437, 436, 1308, 1280, 1324, 1285, 1302, 1281, 1280, 1306, 1308, 1309, 2569, 2580, 2576, 2584, 2574, 2569, 2588, 2576, 2573, 864, 2667, 2662, 2675, 832, 834, 857, 838, 849, 851, 841, 879, 835, 849, 862, 852, 850, 863, 840, 879, 838, 853, 834, 835, 857, 863, 862, 2541, 2539, 2544, 2558, 2558, 2556, 2539, 2502, 2540, 2539, 2544, 2502, 2538, 2550, 2540, 2539, 2554, 2556, 399, 393, 402, 412, 412, 414, 393, 420, 398, 393, 402, 420, 399, 402, 406, 414, 392, 399, 410, 406, 395, 1405, 1386, 1406, 1402, 1386, 1404, 1403, 1360, 1402, 1402, 1382, 1387, 1528, 1496, 1415, 421, 428, 416, 2408, 2401, 2413, 2387, 2415, 2428, 2431, 1115, 1141, 1148, 1149, 1120, 1147, 1148, 1141, 1074, 1147, 1148, 1124, 1139, 1150, 1147, 1142, 1074, 1082, 1126, 1131, 1122, 1143, 1083, 1074, 1143, 1124, 1143, 1148, 1126, 1074, 1122, 1139, 1120, 1139, 1151, 1074, 1124, 1139, 1150, 1127, 1143, 1785, 1782, 1779, 1771, 1786, 1773, 1727, 1764, 1685, 3085, 3073, 3075, 3102, 3074, 3083, 3075, 3083, 3072, 3098, 1772, 1789, 1774, 1789, 1777, 1731, 1778, 1789, 1777, 1785, 1767, 1680, 479, 472, 478, 453, 450, 459, 499, 458, 453, 448, 472, 457, 478, 1120, 1083, 1098, 2505, 2501, 2512, 2503, 2508, 2555, 2512, 2525, 2516, 2497, 1197, 1200, 1208, 1210, 1197, 1211, 1211, 1185, 1191, 1190, 1503, 1501, 1487, 1497, 1507, 1487, 1497, 1490, 1487, 1493, 1480, 1493, 1482, 1497, 3273, 3284, 3292, 3294, 3273, 3295, 3295, 3269, 3267, 3266, 3315, 3264, 3269, 3295, 3288, 3212, 3287, 3238, 1380, 2300, 2279, 2303, 2288, 2295, 2272, 2253, 2292, 2299, 2302, 2278, 2295, 2272, 2466, 2483, 2464, 2483, 2495, 2546, 2473, 2520, 2686, 2673, 2685, 2677, 1562, 1565, 1563, 1536, 1543, 1550, 1590, 1567, 1544, 1541, 1564, 1548, 1952, 1959, 1981, 1942, 1983, 1960, 1957, 1980, 1964, 2050, 2057, 2067, 2052, 2058, 2051, 2105, 2064, 2055, 2058, 2067, 2051, 912, 999, 1332, 1299, 1307, 1310, 1303, 1302, 1362, 1286, 1309, 1362, 1301, 1288, 1307, 1282, 1362, 1297, 1309, 1308, 1286, 1303, 1308, 1286, 1939, 1951, 1949, 2014, 1943, 1951, 1951, 1943, 1948, 1941, 783, 768, 778, 796, 769, 775, 778, 832, 798, 779, 796, 771, 775, 797, 797, 775, 769, 768, 832, 809, 811, 826, 817, 815, 813, 813, 801, 827, 800, 826, 829, 1423, 1466, 1453, 1458, 1462, 1452, 1452, 1462, 1456, 1457, 1535, 1466, 1453, 1453, 1456, 1453, 1535, 1468, 1463, 1466, 1468, 1460, 1462, 1457, 1464, 1535, 1465, 1456, 1453, 1535, 1467, 1470, 1452, 1463, 1466, 1453, 1520, 1450, 1457, 1462, 1468, 1456, 1453, 1457, 1535, 1470, 1468, 1468, 1456, 1450, 1457, 1451, 1452, 2291, 2277, 2290, 2294, 2281, 2275, 2277, 2271, 2248, 2255, 2259, 2260, 2245, 2244, 3155, 3141, 3154, 3158, 3145, 3139, 3141, 3199, 3157, 3139, 3137, 2090, 2071, 2060, 2058, 2079, 2075, 2054, 2048, 2049, 2127, 2060, 2055, 2058, 2060, 2052, 2054, 2049, 2056, 2127, 2062, 2060, 2060, 2048, 2074, 2049, 2075, 2127, 2075, 2070, 2079, 2058, 2076, 2782, 2809, 2801, 2804, 2813, 2812, 2744, 2796, 2807, 2744, 2797, 2806, 2815, 2786, 2801, 2792, 2744, 2811, 2807, 2806, 2796, 2813, 2806, 2796, 1400, 1396, 1398, 1333, 1404, 1396, 1396, 1404, 1399, 1406, 1333, 1402, 1397, 1407, 1385, 1396, 1394, 1407, 1333, 1404, 1398, 1384, 1333, 1398, 1406, 1402, 1384, 1390, 1385, 1406, 1398, 1406, 1397, 1391, 614, 622, 618, 632, 638, 633, 622, 614, 622, 613, 639, 549, 610, 623, 549, 2071, 
    2092, 2092, 2147, 2094, 2082, 2093, 2106, 2147, 2086, 2107, 2099, 2086, 2097, 2090, 2094, 2086, 2093, 2103, 2147, 2058, 2055, 2096, 2157, 2147, 2061, 2102, 2094, 2081, 2086, 2097, 2147, 2092, 2085, 2147, 2058, 2055, 2096, 1050, 1063, 1071, 1082, 1069, 1078, 1074, 1082, 1073, 1067, 1151, 1046, 1051, 1151, 1041, 1066, 1074, 1085, 1082, 1069, 1049, 1072, 1069, 1074, 1086, 1067, 1050, 1063, 1084, 1082, 1071, 1067, 1078, 1072, 1073, 3118, 3081, 3073, 3076, 3085, 3084, 3144, 3100, 3079, 3144, 3087, 3085, 3100, 3144, 3109, 3116, 3165, 2784, 2759, 2767, 2762, 2755, 2754, 2694, 2770, 2761, 2694, 2762, 2761, 2759, 2754, 2694, 2774, 2759, 2772, 2757, 2755, 2762, 2759, 2756, 2762, 2755, 2694, 2752, 2772, 2761, 2763, 2694, 2756, 2771, 2752, 2752, 2755, 2772, 846, 806, 805, 816, 807, 812, 868, 831, 846, 390, 497, 458, 477, 454, 460, 452, 461, 392, 467, 418, 3056, 3058, 3055, 3060, 3055, 3043, 3055, 3052, 3039, 3062, 3045, 3058, 3059, 3049, 3055, 3054, 1364, 1346, 1364, 1364, 1358, 1352, 1353, 1400, 1364, 1363, 1358, 1363, 1348, 1359, 1358, 1353, 1344, 1400, 1363, 1352, 1356, 1346, 1353, 2033, 2029, 2016, 2037, 2023, 2030, 2035, 2028, 2662, 2668, 2673, 2654, 2679, 2660, 2675, 2674, 2664, 2670, 2671, 1564, 1561, 1541, 1542, 1544, 1549, 1536, 1543, 1550, 1590, 1550, 1540, 1561, 1590, 1567, 1548, 1563, 1562, 1536, 1542, 1543, 267, 278, 257, 270, 258, 262, 283, 266, 304, 281, 266, 285, 284, 262, 256, 257, 1569, 1581, 1580, 1572, 1579, 1573, 1565, 1588, 1575, 1584, 1585, 1579, 1581, 1580, 778, 768, 797, 818, 780, 797, 797, 818, 772, 777, 844, 841, 832, 834, 847, 882, 844, 861, 861, 882, 836, 841, 1783, 1766, 1766, 1737, 1791, 1778, 1303, 1286, 1286, 1321, 1280, 1299, 1284, 1285, 1311, 1305, 1304, 2403, 2418, 2418, 2397, 2420, 2407, 2416, 2417, 2411, 2413, 2412, 2397, 2415, 2403, 2408, 2413, 2416, 3185, 3198, 3173, 3186, 3189, 3190, 3172, 3186, 3144, 3198, 3193, 3172, 3171, 3190, 3193, 3188, 3186, 3144, 3198, 3187, 944, 945, 930, 907, 951, 945, 934, 928, 907, 956, 949, 935, 956, 1489, 1472, 1472, 1519, 1475, 1476, 1503, 1474, 1493, 1131, 1134, 1138, 1137, 1151, 1146, 1089, 1130, 1143, 1139, 1147, 1133, 1130, 1151, 1139, 1134, 1089, 1139, 1143, 1138, 1138, 1143, 1133, 1837, 1834, 1855, 1836, 1834, 1793, 1834, 1847, 1843, 1851, 1837, 1834, 1855, 1843, 1838, 1793, 1843, 1847, 1842, 1842, 1847, 1837, 800, 811, 801, 794, 817, 812, 808, 800, 822, 817, 804, 808, 821, 794, 808, 812, 809, 809, 812, 822, 1718, 1716, 1699, 1712, 1711, 1705, 1715, 1717, 1689, 1700, 1715, 1704, 1698, 1706, 1699, 1689, 1717, 1714, 1703, 1716, 1714, 1689, 1714, 1711, 1707, 1699, 1717, 1714, 1703, 1707, 1718, 1689, 1707, 1711, 1706, 1706, 1711, 1717, 2926, 2924, 2939, 2920, 2935, 2929, 2923, 2925, 2881, 2940, 2923, 2928, 2938, 2930, 2939, 2881, 2939, 2928, 2938, 2881, 2922, 2935, 2931, 2939, 2925, 2922, 2943, 2931, 2926, 2881, 2931, 2935, 2930, 2930, 2935, 2925, 2075, 2058, 2058, 2085, 2067, 2068, 2057, 2062, 2075, 2068, 2073, 2079, 2085, 2067, 2078, 2899, 2884, 2898, 2884, 2901, 2901, 2880, 2883, 2893, 2884, 2942, 2885, 2884, 2903, 2888, 2882, 2884, 2942, 2888, 2885, 1662, 1641, 1605, 1651, 1662, 2886, 2883, 2887, 2883, 2910, 2895, 2894, 2933, 2891, 2894, 2933, 2910, 2904, 2891, 2889, 2881, 2883, 2884, 2893, 1713, 1709, 1665, 1704, 1723, 1708, 1709, 1719, 1713, 1712, 2402, 2403, 2416, 2415, 2405, 2403, 2393, 2411, 2409, 2402, 2403, 2410, 2435, 2437, 2451, 2436, 2473, 2450, 2451, 2448, 2455, 2435, 2458, 2434, 2473, 2458, 2455, 2456, 2449, 2435, 2455, 2449, 2451, 1501, 1472, 1476, 1484, 1526, 1491, 1478, 1479, 1484, 1526, 1478, 1487, 1487, 1498, 1484, 1501, 1526, 1476, 1472, 1479, 1500, 1501, 1484, 1498, 2406, 2417, 2410, 2400, 2408, 2401, 2395, 2423, 2401, 2421, 2417, 2401, 2410, 2416, 2413, 2405, 2408, 2395, 2413, 2410, 2400, 2401, 2428, 726, 704, 727, 723, 716, 710, 704, 762, 720, 725, 713, 714, 708, 705, 1990, 1995, 1999, 1986, 2010, 1990, 2033, 1987, 1985, 1984, 1991, 2010, 1985, 2012, 1932, 1947, 1930, 1932, 1927, 1953, 1949, 1937, 1931, 1936, 1930, 1947, 1932, 1958, 1962, 1963, 1974, 1952, 1963, 1969, 1946, 1974, 1964, 1954, 1963, 1956, 1961, 1974, 1387, 1393, 1373, 1382, 1391, 1379, 1373, 1392, 1383, 1381, 1387, 1389, 1388, 1680, 1692, 1665, 1686, 1708, 1667, 1695, 1682, 1671, 1685, 1692, 1665, 1694, 1708, 1664, 1686, 1665, 1669, 1690, 1680, 1686, 1664, 2775, 2779, 2778, 2759, 2769, 2778, 2752, 2795, 2768, 2781, 2773, 2771, 2778, 2779, 2759, 2752, 2781, 2775, 2759, 1934, 1947, 1928, 1949, 1951, 1934, 1957, 1941, 1929, 1957, 1932, 1951, 1928, 1929, 1939, 1941, 1940, 2371, 2374, 2429, 2385, 2375, 2384, 2388, 2379, 2369, 2375, 2385, 2429, 2388, 2375, 2384, 2385, 2379, 2381, 2380, 1825, 1844, 1844, 1842, 1833, 1826, 1845, 1844, 1833, 1839, 1838, 1823, 1829, 1836, 1833, 1831, 1833, 1826, 1833, 1836, 1833, 1844, 1849, 1823, 1843, 1844, 1825, 1844, 1845, 1843, 1888, 1851, 1866, 2146, 2155, 2158, 2144, 2158, 2149, 2155, 2146, 3197, 3196, 3148, 3186, 3184, 3184, 3190, 3168, 3168, 3148, 3186, 3191, 3168, 3190, 3169, 3173, 3194, 3184, 3190, 3168, 3148, 3186, 3175, 3175, 3169, 3194, 3185, 3174, 3175, 3194, 3196, 3197, 3148, 3171, 3190, 3169, 3198, 3194, 3168, 3168, 3194, 3196, 3197, 1392, 1394, 1381, 1375, 1394, 2396, 2417, 2379, 2390, 2394, 2379, 2368, 2397, 2375, 2369, 2368, 2397, 2417, 2394, 2369, 2369, 2417, 2369, 2370, 2378, 844, 841, 862, 840, 863, 859, 836, 846, 840, 862, 882, 840, 853, 857, 840, 835, 862, 836, 834, 835, 882, 857, 834, 834, 882, 834, 833, 841, 546, 551, 540, 560, 567, 556, 561, 546, 548, 550, 540, 557, 556, 567, 540, 546, 559, 559, 556, 564, 550, 551, 1803, 1795, 1799, 1813, 1811, 1812, 1795, 1803, 1795, 1800, 1810, 1849, 1803, 1799, 1800, 1799, 1793, 1795, 1812, 1849, 1794, 1807, 1813, 1799, 1796, 1802, 1795, 1794, 986, 981, 985, 977, 1577, 1583, 1593, 1582, 1539, 1580, 1582, 1587, 1580, 1593, 1582, 1576, 1573, 1660, 1575, 1622, 809, 831, 814, 773, 814, 819, 
    823, 831, 809, 814, 827, 823, 810, 773, 823, 819, 822, 822, 819, 809, 633, 638, 632, 611, 612, 621, 597, 636, 619, 614, 639, 623, 933, 930, 952, 915, 954, 941, 928, 953, 937, 2790, 2797, 2807, 2784, 2798, 2791, 2781, 2804, 2787, 2798, 2807, 2791, 1704, 1724, 1709, 1696, 1708, 1703, 1706, 1708, 1686, 1700, 1708, 1700, 1707, 1708, 1723, 1722, 1697, 1696, 1721, 1769, 1714, 1731, 2688, 2708, 2693, 2696, 2692, 2703, 2690, 2692, 2750, 2696, 2693, 1764, 1775, 1789, 1749, 1771, 1791, 1774, 1763, 1775, 1764, 1769, 1775, 493, 507, 508, 508, 491, 480, 506, 465, 490, 495, 506, 495, 3112, 3114, 3133, 3118, 3121, 3127, 3117, 3115, 3079, 3132, 3129, 3116, 3129, 1636, 1655, 1636, 1647, 1653, 1569, 1658, 1547, 1359, 1362, 1366, 1374, 1352, 1359, 1370, 1366, 1355, 1380, 1366, 1362, 1367, 1367, 1362, 1352, 554, 552, 575, 556, 563, 565, 559, 553, 517, 558, 563, 567, 575, 553, 558, 571, 567, 554, 517, 567, 563, 566, 566, 563, 553, 650, 646, 668, 647, 669};

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    public static ArrayList A(BitSet bitSet) {
        int iM3756 = (C0196.m3756(bitSet) + (C0336.f519 ^ 262)) / 64;
        ArrayList arrayList = new ArrayList(iM3756);
        int i10 = 0;
        while (true) {
            int i11 = 1616;
            while (true) {
                i11 ^= 1633;
                switch (i11) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i11 = i10 < iM3756 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                return arrayList;
            }
            long j10 = 0;
            int i12 = 0;
            while (true) {
                int i13 = 1740;
                while (true) {
                    i13 ^= 1757;
                    switch (i13) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i13 = i12 < 64 ? 1833 : 1802;
                            break;
                        case 54:
                            break;
                        case 471:
                            break;
                        case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                            int i14 = (i10 << (C0434.f704 ^ (-521))) - (0 - i12);
                            int iM3757 = C0196.m3756(bitSet);
                            int i15 = 1864;
                            while (true) {
                                i15 ^= 1881;
                                switch (i15) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i15 = i14 < iM3757 ? 48736 : 48705;
                                        break;
                                    case 47384:
                                        break;
                                    case 47417:
                                        boolean zM4007 = C0209.m4007(bitSet, i14);
                                        int i16 = 48767;
                                        while (true) {
                                            i16 ^= 48784;
                                            switch (i16) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    break;
                                                case 76:
                                                    long j11 = 1 << i12;
                                                    j10 = (j10 & j11) | (j10 ^ j11);
                                                    break;
                                                case 239:
                                                    i16 = zM4007 ? 48860 : 48829;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        i12 += C0204.f228 ^ 792;
                                        int i17 = 48891;
                                        while (true) {
                                            i17 ^= 48908;
                                            switch (i17) {
                                                case 22:
                                                    break;
                                                case 503:
                                                    i17 = 48922;
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
                            break;
                        default:
                            break;
                    }
                }
            }
            C0358.m6998(arrayList, C0439.m8554(j10));
            i10 += C0340.f610 ^ (-970);
            int i18 = 49666;
            while (true) {
                i18 ^= 49683;
                switch (i18) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i18 = 49697;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x000e A[EDGE_INSN: B:133:0x000e->B:132:0x000e BREAK  A[LOOP:3: B:36:0x0077->B:159:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x000e A[EDGE_INSN: B:134:0x000e->B:132:0x000e BREAK  A[LOOP:3: B:36:0x0077->B:159:0x0077], EDGE_INSN: B:121:0x01b4->B:134:0x000e BREAK  A[LOOP:7: B:120:0x01b0->B:184:0x01b0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x01b0 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x013d A[EDGE_INSN: B:215:0x013d->B:214:0x013d BREAK  A[LOOP:13: B:100:0x0160->B:230:0x0160], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x000e, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:108:0x0182. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0070. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x00d9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:80:0x0115. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:94:0x0144. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap B(android.os.Bundle r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.r7.B(android.os.Bundle, boolean):java.util.HashMap");
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0062 A[SYNTHETIC] */
    public static v D(zzad zzadVar) {
        String strM3642;
        int i10;
        Bundle bundleM7251 = C0370.m7251(C0037.m723(zzadVar), true);
        String strM1180 = C0062.m1180(m6592(), 0, C0027.f47 ^ 815, 2099);
        boolean zM7033 = C0359.m7033(bundleM7251, strM1180);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = zM7033 ? 1709 : 1678;
                    break;
                case 204:
                    Object objM195 = C0010.m195(bundleM7251, strM1180);
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = objM195 != null ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                strM3642 = C0191.m3642(m6592(), 2, C0359.f629 ^ 529, 1408);
                                i10 = 48767;
                                while (true) {
                                    i10 ^= 48784;
                                    switch (i10) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 239:
                                            i10 = 48798;
                                            continue;
                                            continue;
                                        default:
                                            continue;
                                            continue;
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                strM3642 = C0201.m3852(objM195);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    strM3642 = C0191.m3642(m6592(), 2, C0359.f629 ^ 529, 1408);
                    i10 = 48767;
                    while (true) {
                        i10 ^= 48784;
                        switch (i10) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i10 = 48798;
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
            int i13 = 1864;
            while (true) {
                i13 ^= 1881;
                switch (i13) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i13 = 48674;
                        break;
                    case 47483:
                        String strM1111 = C0058.m1111(C0449.m8742(), C0218.m4140(), C0351.m6872(zzadVar));
                        int i14 = 48891;
                        while (true) {
                            i14 ^= 48908;
                            switch (i14) {
                                case 22:
                                    break;
                                case 53:
                                    break;
                                case 503:
                                    if (strM1111 == null) {
                                        i14 = 49635;
                                    }
                                    break;
                                case 32495:
                                    strM1111 = C0351.m6872(zzadVar);
                                    break;
                                default:
                                    continue;
                            }
                            i14 = 48953;
                        }
                        return new v(strM1111, new s(bundleM7251), strM3642, C0171.m3274(zzadVar));
                }
            }
        }
    }

    public static void F(Uri.Builder builder, String str, String str2, Set set) {
        boolean zM5434 = C0281.m5434(set, str);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = !zM5434 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM1883 = C0088.m1883(str2);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = zM1883 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                C0443.m8642(builder, str, str2);
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
        }
        int iM1920 = C0090.m1920();
        int i13 = 48767;
        while (true) {
            i13 ^= 48784;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    return;
                case 76:
                    System.out.println(Integer.parseInt(C0461.m8976("5cQRrBvEnoFiBt2UQJIl")));
                    return;
                case 239:
                    if (iM1920 <= 0) {
                        i13 = 48860;
                    }
                    break;
                default:
                    continue;
            }
            i13 = 48829;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0007. Please report as an issue. */
    public static void G(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        int i10 = 0;
        while (true) {
            int length = strArr.length;
            int i11 = 1616;
            while (true) {
                i11 ^= 1633;
                switch (i11) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i11 = i10 < length ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                int iM6500 = C0336.m6500();
                int i12 = 48767;
                while (true) {
                    i12 ^= 48784;
                    switch (i12) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            return;
                        case 76:
                            System.out.println(Long.decode(C0474.m9217("t7AUJdD4dOqp5UtMRST7uaSKwar5")));
                            return;
                        case 239:
                            if (iM6500 >= 0) {
                                i12 = 48860;
                            }
                            break;
                        default:
                            continue;
                    }
                    i12 = 48829;
                }
            }
            String[] strArrM8842 = C0454.m8842(strArr[i10], C0176.m3354(m6592(), 5, 1, 3103));
            String str = strArrM8842[0];
            String str2 = strArrM8842[strArrM8842.length + (C0191.f215 ^ 449)];
            String strM2549 = C0132.m2549(bundle, str);
            int i13 = 1740;
            while (true) {
                i13 ^= 1757;
                switch (i13) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i13 = strM2549 != null ? 1833 : 1802;
                        break;
                    case 54:
                        break;
                    case 471:
                        break;
                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                        C0372.m7288(builder, str2, strM2549, set);
                        break;
                    default:
                        break;
                }
            }
            i10 += C0480.f753 ^ (-960);
            int i14 = 1864;
            while (true) {
                i14 ^= 1881;
                switch (i14) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i14 = 48674;
                        break;
                    case 47483:
                        break;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void H(zzfi.zze.zza zzaVar, String str, Long l10) {
        int i10;
        List listM720 = C0037.m720(zzaVar);
        int i11 = 0;
        while (true) {
            i10 = i11;
            int iM171 = C0008.m171(listM720);
            int i12 = 1616;
            while (true) {
                i12 ^= 1633;
                switch (i12) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i12 = i10 < iM171 ? 1709 : 1678;
                        break;
                    case 204:
                        boolean zM321 = C0016.m321(str, C0128.m2468((zzfi.zzg) C0316.m6101(listM720, i10)));
                        int i13 = 1740;
                        while (true) {
                            i13 ^= 1757;
                            switch (i13) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i13 = zM321 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    i11 = (C0397.f667 ^ (-198)) + i10;
                                    int i14 = 48767;
                                    while (true) {
                                        i14 ^= 48784;
                                        switch (i14) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 239:
                                                i14 = 48798;
                                                break;
                                        }
                                    }
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    int i15 = 1864;
                                    while (true) {
                                        i15 ^= 1881;
                                        switch (i15) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i15 = 48674;
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
                        i10 = -1;
                        break;
                    default:
                        break;
                }
            }
        }
        zzfi.zzg.zza zzaVarM1664 = C0077.m1664(C0078.m1697(), str);
        boolean z10 = l10 instanceof Long;
        int i16 = 48891;
        while (true) {
            i16 ^= 48908;
            switch (i16) {
                case 22:
                    break;
                case 53:
                    boolean z11 = l10 instanceof String;
                    int i17 = 49790;
                    while (true) {
                        i17 ^= 49807;
                        switch (i17) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 51:
                                boolean z12 = l10 instanceof Double;
                                int i18 = 50689;
                                while (true) {
                                    i18 ^= 50706;
                                    switch (i18) {
                                        case 19:
                                            i18 = z12 ? 50782 : 50751;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            C0305.m5880(zzaVarM1664, C0112.m2157((Double) l10));
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 84:
                                C0149.m2855(zzaVarM1664, (String) l10);
                                int i19 = 49914;
                                while (true) {
                                    i19 ^= 49931;
                                    switch (i19) {
                                        case 497:
                                            i19 = 50596;
                                            continue;
                                        case 1711:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 241:
                                i17 = z11 ? 49883 : 49852;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 503:
                    i16 = z10 ? 49635 : 48953;
                    break;
                case 32495:
                    C0135.m2597(zzaVarM1664, C0491.m9543(l10));
                    int i20 = 49666;
                    while (true) {
                        i20 ^= 49683;
                        switch (i20) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i20 = 49697;
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
        int i21 = 50813;
        while (true) {
            i21 ^= 50830;
            switch (i21) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 53:
                    C0066.m1268(zzaVar, zzaVarM1664);
                    return;
                case 243:
                    if (i10 >= 0) {
                        i21 = 51557;
                    }
                    break;
                case 4075:
                    C0362.m7076(zzaVar, i10, zzaVarM1664);
                    int iM1556 = C0072.m1556();
                    int i22 = 51588;
                    while (true) {
                        i22 ^= 51605;
                        switch (i22) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM1556 <= 0) {
                                    i22 = 51681;
                                }
                                break;
                            case 54:
                                break;
                            case 87:
                                return;
                            case 116:
                                System.out.println(Double.parseDouble(C0111.m2151("OGvHCcR7o2paeRw")));
                                return;
                            default:
                                continue;
                        }
                        i22 = 51650;
                    }
                    break;
                default:
                    continue;
            }
            i21 = 50875;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0005. Please report as an issue. */
    public static void J(StringBuilder sb, int i10) {
        int i11 = 0;
        while (true) {
            int i12 = 1616;
            while (true) {
                i12 ^= 1633;
                switch (i12) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i12 = i11 < i10 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                return;
            }
            C0142.m2728(sb, C0149.m2854(m6592(), 6, C0170.f194 ^ (-151), 2614));
            i11 += C0191.f215 ^ (-449);
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

    public static void L(StringBuilder sb, int i10, String str, zzew.zzd zzdVar) {
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zzdVar == null) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    int iM4083 = C0214.m4083();
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM4083 >= 0) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                System.out.println(C0473.m9195("CUPLJJXb"));
                                return;
                            default:
                                continue;
                        }
                        i12 = 1802;
                    }
                    break;
                case 239:
                    C0157.m2989(sb, i10);
                    C0142.m2728(sb, str);
                    C0142.m2728(sb, C0228.m4381(m6592(), 8, C0119.f145 ^ 898, 2717));
                    boolean zM7593 = C0388.m7593(zzdVar);
                    int i13 = 1864;
                    while (true) {
                        i13 ^= 1881;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i13 = zM7593 ? 48736 : 48705;
                                break;
                            case 47384:
                                break;
                            case 47417:
                                C0304.m5861(sb, i10, C0236.m4534(m6592(), 11, C0158.f182 ^ 429, 559), C0333.m6458(C0183.m3494(zzdVar)));
                                break;
                            case 47483:
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zM3603 = C0189.m3603(zzdVar);
                    int i14 = 48767;
                    while (true) {
                        i14 ^= 48784;
                        switch (i14) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case 76:
                                C0304.m5861(sb, i10, C0087.m1850(m6592(), 26, C0486.f759 ^ 57, 1181), C0009.m192(C0225.m4322(zzdVar)));
                                break;
                            case 239:
                                i14 = zM3603 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zM7327 = C0374.m7327(zzdVar);
                    int i15 = 48891;
                    while (true) {
                        i15 ^= 48908;
                        switch (i15) {
                            case 22:
                                break;
                            case 53:
                                break;
                            case 503:
                                i15 = zM7327 ? 49635 : 48953;
                                break;
                            case 32495:
                                C0304.m5861(sb, i10, C0273.m5240(m6592(), 40, C0455.f725 ^ 292, 3105), C0067.m1305(zzdVar));
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zM4849 = C0254.m4849(zzdVar);
                    int i16 = 49666;
                    while (true) {
                        i16 ^= 49683;
                        switch (i16) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i16 = zM4849 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                C0304.m5861(sb, i10, C0184.m3519(m6592(), 56, C0203.f227 ^ (-15), 508), C0295.m5672(zzdVar));
                                break;
                            case 83:
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zM7642 = C0391.m7642(zzdVar);
                    int i17 = 49790;
                    while (true) {
                        i17 ^= 49807;
                        switch (i17) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 51:
                                break;
                            case 84:
                                C0304.m5861(sb, i10, C0448.m8719(m6592(), 76, C0435.f705 ^ 426, 1144), C0256.m4882(zzdVar));
                                break;
                            case 241:
                                if (zM7642) {
                                    i17 = 49883;
                                }
                                break;
                            default:
                                continue;
                        }
                        i17 = 49852;
                    }
                    C0157.m2989(sb, i10);
                    C0142.m2728(sb, C0385.m7532(m6592(), 96, C0026.f46 ^ (-315), 484));
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public static void M(StringBuilder sb, int i10, String str, Object obj) {
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (obj == null) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    int iM3154 = C0165.m3154();
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM3154 >= 0) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                System.out.println(Long.decode(C0225.m4319("HEKQmOItUdlilYwcHwp3i")));
                                return;
                            default:
                                continue;
                        }
                        i12 = 1802;
                    }
                    break;
                case 239:
                    C0157.m2989(sb, (C0368.f638 ^ (-546)) + i10);
                    C0142.m2728(sb, str);
                    C0142.m2728(sb, C0052.m1017(m6592(), 98, C0188.f212 ^ 107, 2030));
                    C0214.m4074(sb, obj);
                    C0175.m3331(sb, '\n');
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:114:0x0243. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:135:0x02ab. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:157:0x0301. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:164:0x0335. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:179:0x0374. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x007d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:49:0x010b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:79:0x01a9. Please report as an issue. */
    public static void O(StringBuilder sb, String str, zzfi.zzl zzlVar) {
        Integer numM1083;
        Integer numM1084;
        Long lM8554;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zzlVar == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return;
                case 239:
                    int i11 = C0147.f172 ^ 940;
                    C0157.m2989(sb, i11);
                    C0142.m2728(sb, str);
                    C0142.m2728(sb, C0134.m2581(m6592(), 100, C0481.f754 ^ (-687), 1708));
                    int iM2213 = C0114.m2213(zzlVar);
                    int i12 = C0030.f50 ^ 738;
                    String strM8745 = C0449.m8745(m6592(), 103, C0199.f223 ^ (-54), 2772);
                    int i13 = 1740;
                    while (true) {
                        i13 ^= 1757;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i13 = iM2213 != 0 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0157.m2989(sb, i12);
                                C0142.m2728(sb, C0477.m9301(m6592(), 105, C0246.f325 ^ 303, 2720));
                                Iterator itM2089 = C0107.m2089(C0127.m2458(zzlVar));
                                int i14 = 0;
                                while (true) {
                                    int i15 = i14;
                                    boolean zM3327 = C0174.m3327(itM2089);
                                    int i16 = 1864;
                                    while (true) {
                                        i16 ^= 1881;
                                        switch (i16) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i16 = zM3327 ? 48736 : 48705;
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                Long l10 = (Long) C0414.m8115(itM2089);
                                                int i17 = C0486.f759;
                                                int i18 = 48767;
                                                while (true) {
                                                    i18 ^= 48784;
                                                    switch (i18) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            break;
                                                        case 76:
                                                            C0142.m2728(sb, strM8745);
                                                            break;
                                                        case 239:
                                                            i18 = i15 != 0 ? 48860 : 48829;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0214.m4074(sb, l10);
                                                i14 = (i17 ^ 54) + i15;
                                                int i19 = 48891;
                                                while (true) {
                                                    i19 ^= 48908;
                                                    switch (i19) {
                                                        case 22:
                                                            break;
                                                        case 503:
                                                            i19 = 48922;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                                break;
                                            default:
                                                break;
                                        }
                                        C0175.m3331(sb, '\n');
                                        break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    int iM4513 = C0235.m4513(zzlVar);
                    int i20 = 49666;
                    while (true) {
                        i20 ^= 49683;
                        switch (i20) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i20 = iM4513 != 0 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                C0157.m2989(sb, i12);
                                C0142.m2728(sb, C0211.m4027(m6592(), 114, C0027.f47 ^ 805, 529));
                                Iterator itM20810 = C0107.m2089(C0108.m2095(zzlVar));
                                int i21 = 0;
                                while (true) {
                                    int i22 = i21;
                                    boolean zM3328 = C0174.m3327(itM20810);
                                    int i23 = 49790;
                                    while (true) {
                                        i23 ^= 49807;
                                        switch (i23) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 51:
                                                break;
                                            case 84:
                                                Long l11 = (Long) C0414.m8115(itM20810);
                                                int i24 = C0167.f191;
                                                int i25 = 49914;
                                                while (true) {
                                                    i25 ^= 49931;
                                                    switch (i25) {
                                                        case 497:
                                                            i25 = i22 != 0 ? 50658 : 50627;
                                                            break;
                                                        case 1711:
                                                            break;
                                                        case 1736:
                                                            break;
                                                        case 1769:
                                                            C0142.m2728(sb, strM8745);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0214.m4074(sb, l11);
                                                i21 = (i24 ^ 943) + i22;
                                                int i26 = 50689;
                                                while (true) {
                                                    i26 ^= 50706;
                                                    switch (i26) {
                                                        case 19:
                                                            i26 = 50720;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 241:
                                                i23 = zM3328 ? 49883 : 49852;
                                                break;
                                            default:
                                                break;
                                        }
                                        C0175.m3331(sb, '\n');
                                        break;
                                    }
                                }
                                break;
                            case 83:
                                break;
                            default:
                                break;
                        }
                    }
                    int iM1648 = C0076.m1648(zzlVar);
                    String strM1682 = C0078.m1682(m6592(), 122, C0108.f134 ^ (-72), 2975);
                    int i27 = 50813;
                    while (true) {
                        i27 ^= 50830;
                        switch (i27) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                break;
                            case 243:
                                i27 = iM1648 != 0 ? 51557 : 50875;
                                break;
                            case 4075:
                                C0157.m2989(sb, i12);
                                C0142.m2728(sb, C0091.m1946(m6592(), 124, C0468.f738 ^ (-388), 751));
                                Iterator itM20811 = C0107.m2089(C0291.m5586(zzlVar));
                                int i28 = 0;
                                while (true) {
                                    int i29 = i28;
                                    boolean zM3329 = C0174.m3327(itM20811);
                                    int i30 = 51588;
                                    while (true) {
                                        i30 ^= 51605;
                                        switch (i30) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i30 = zM3329 ? 51681 : 51650;
                                                break;
                                            case 54:
                                                break;
                                            case 87:
                                                break;
                                            case 116:
                                                zzfi.zzd zzdVar = (zzfi.zzd) C0414.m8115(itM20811);
                                                int i31 = C0057.f77;
                                                int i32 = 51712;
                                                while (true) {
                                                    i32 ^= 51729;
                                                    switch (i32) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i32 = i29 != 0 ? 51805 : 51774;
                                                            break;
                                                        case 47:
                                                            break;
                                                        case 76:
                                                            C0142.m2728(sb, strM8745);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                boolean zM894 = C0046.m894(zzdVar);
                                                int i33 = 51836;
                                                while (true) {
                                                    i33 ^= 51853;
                                                    switch (i33) {
                                                        case 241:
                                                            i33 = zM894 ? 52580 : 52549;
                                                            break;
                                                        case 1963:
                                                            break;
                                                        case 1992:
                                                            numM1084 = null;
                                                            break;
                                                        case 2025:
                                                            numM1084 = C0057.m1083(C0107.m2086(zzdVar));
                                                            int i34 = 52611;
                                                            while (true) {
                                                                i34 ^= 52628;
                                                                switch (i34) {
                                                                    case 23:
                                                                        i34 = 52642;
                                                                        break;
                                                                    case 54:
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
                                                C0214.m4074(sb, numM1084);
                                                C0142.m2728(sb, C0090.m1922(m6592(), 152, 1, 584));
                                                boolean zM5083 = C0267.m5083(zzdVar);
                                                int i35 = 52735;
                                                while (true) {
                                                    i35 ^= 52752;
                                                    switch (i35) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            lM8554 = null;
                                                            break;
                                                        case 1007:
                                                            i35 = zM5083 ? 53479 : 52797;
                                                            break;
                                                        case 7927:
                                                            lM8554 = C0439.m8554(C0378.m7390(zzdVar));
                                                            int i36 = 53510;
                                                            while (true) {
                                                                i36 ^= 53527;
                                                                switch (i36) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i36 = 53541;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                                }
                                                C0214.m4074(sb, lM8554);
                                                i28 = (i31 ^ 688) + i29;
                                                int i37 = 53634;
                                                while (true) {
                                                    i37 ^= 53651;
                                                    switch (i37) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i37 = 53665;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                        C0142.m2728(sb, strM1682);
                                        break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    int iM3555 = C0186.m3555(zzlVar);
                    int i38 = 53758;
                    while (true) {
                        i38 ^= 53775;
                        switch (i38) {
                            case 1009:
                                if (iM3555 != 0) {
                                    i38 = 54502;
                                }
                                break;
                            case 1703:
                                break;
                            case 1736:
                                break;
                            case 1769:
                                C0157.m2989(sb, i12);
                                C0142.m2728(sb, C0461.m8963(m6592(), 153, C0308.f455 ^ 177, 1858));
                                Iterator itM20812 = C0107.m2089(C0464.m9029(zzlVar));
                                int i39 = 0;
                                while (true) {
                                    int i40 = i39;
                                    boolean zM33210 = C0174.m3327(itM20812);
                                    int i41 = 54533;
                                    while (true) {
                                        i41 ^= 54550;
                                        switch (i41) {
                                            case 19:
                                                i41 = zM33210 ? 54626 : 54595;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 85:
                                                break;
                                            case 116:
                                                break;
                                            default:
                                                break;
                                        }
                                        C0142.m2728(sb, strM1682);
                                        break;
                                    }
                                    zzfi.zzm zzmVar = (zzfi.zzm) C0414.m8115(itM20812);
                                    int i42 = C0138.f164;
                                    int i43 = 54657;
                                    while (true) {
                                        i43 ^= 54674;
                                        switch (i43) {
                                            case 19:
                                                i43 = i40 != 0 ? 55401 : 54719;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 3579:
                                                C0142.m2728(sb, strM8745);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    boolean zM2575 = C0133.m2575(zzmVar);
                                    int i44 = 55432;
                                    while (true) {
                                        i44 ^= 55449;
                                        switch (i44) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i44 = zM2575 ? 55525 : 55494;
                                                break;
                                            case 62:
                                                break;
                                            case 95:
                                                numM1083 = null;
                                                break;
                                            case 124:
                                                numM1083 = C0057.m1083(C0125.m2409(zzmVar));
                                                int i45 = 55556;
                                                while (true) {
                                                    i45 ^= 55573;
                                                    switch (i45) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i45 = 55587;
                                                            break;
                                                        case 54:
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
                                    }
                                    C0214.m4074(sb, numM1083);
                                    C0142.m2728(sb, C0455.m8868(m6592(), 182, C0156.f180 ^ 393, 3007));
                                    Iterator itM20813 = C0107.m2089(C0205.m3915(zzmVar));
                                    int i46 = 0;
                                    while (true) {
                                        int i47 = i46;
                                        boolean zM33211 = C0174.m3327(itM20813);
                                        int i48 = 55680;
                                        while (true) {
                                            i48 ^= 55697;
                                            switch (i48) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i48 = zM33211 ? 56424 : 56393;
                                                    break;
                                                case 1467:
                                                    break;
                                                case 1496:
                                                    break;
                                                case 1529:
                                                    long jM9543 = C0491.m9543((Long) C0414.m8115(itM20813));
                                                    int i49 = C0048.f68;
                                                    int i50 = 56455;
                                                    while (true) {
                                                        i50 ^= 56472;
                                                        switch (i50) {
                                                            case 31:
                                                                i50 = i47 != 0 ? 56548 : 56517;
                                                                break;
                                                            case 62:
                                                                break;
                                                            case 93:
                                                                break;
                                                            case 124:
                                                                C0142.m2728(sb, strM8745);
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0341.m6676(sb, jM9543);
                                                    i46 = (i49 ^ (-738)) + i47;
                                                    int i51 = 56579;
                                                    while (true) {
                                                        i51 ^= 56596;
                                                        switch (i51) {
                                                            case 23:
                                                                i51 = 56610;
                                                                break;
                                                            case 54:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                            C0142.m2728(sb, C0153.m2934(m6592(), 185, 1, 685));
                                            i39 = (i42 ^ (-565)) + i40;
                                            int i52 = 1507503;
                                            while (true) {
                                                i52 ^= 1507520;
                                                switch (i52) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 111:
                                                        i52 = 1507534;
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i38 = 54471;
                    }
                    C0157.m2989(sb, i11);
                    C0142.m2728(sb, strM1682);
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public static boolean P(int i10, List list) {
        int iM171 = C0008.m171(list);
        int i11 = C0440.f710;
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i12 = i10 < (iM171 << (i11 ^ 962)) ? 1709 : 1678;
                    break;
                case 204:
                    long jM9543 = C0491.m9543((Long) C0316.m6101(list, i10 / (C0076.f110 ^ 647)));
                    long j10 = 1 << (i10 % (C0156.f180 ^ 458));
                    int i13 = 1740;
                    while (true) {
                        i13 ^= 1757;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i13 = ((((-1) ^ jM9543) ^ j10) & j10) != 0 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return true;
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
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0094, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x009f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x00e0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x011f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:97:0x0185. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v64, types: [android.os.Bundle[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.Serializable R(com.google.android.gms.internal.measurement.zzfi.zze r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.r7.R(com.google.android.gms.internal.measurement.zzfi$zze, java.lang.String):java.io.Serializable");
    }

    public static boolean S(String str) {
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
                    boolean zM4736 = C0248.m4736(str, C0483.m9384(m6592(), 186, C0399.f669 ^ 702, 1116));
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = zM4736 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int iM8181 = C0417.m8181(str);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = iM8181 <= 310 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            return true;
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
        }
        return false;
    }

    public static int s(zzfi.zzj.zza zzaVar, String str) {
        int i10 = C0345.f615 ^ (-713);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zzaVar == null) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    return i10;
                case 239:
                    int i12 = 0;
                    while (true) {
                        int iM7589 = C0388.m7589(zzaVar);
                        int i13 = 1740;
                        while (true) {
                            i13 ^= 1757;
                            switch (i13) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i13 = i12 < iM7589 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    return i10;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    break;
                                default:
                                    break;
                            }
                        }
                        boolean zM321 = C0016.m321(str, C0302.m5817(C0384.m7512(zzaVar, i12)));
                        int i14 = 1864;
                        while (true) {
                            i14 ^= 1881;
                            switch (i14) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i14 = zM321 ? 48736 : 48705;
                                    break;
                                case 47384:
                                    break;
                                case 47417:
                                    return i12;
                                case 47483:
                                    break;
                                default:
                                    break;
                            }
                        }
                        i12 += C0216.f239 ^ (-793);
                        int i15 = 48767;
                        while (true) {
                            i15 ^= 48784;
                            switch (i15) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 239:
                                    i15 = 48798;
                                    break;
                            }
                        }
                    }
                    break;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x000e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x000e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x000e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x000e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x000e, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x00e9. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.Bundle u(java.util.Map r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.r7.u(java.util.Map, boolean):android.os.Bundle");
    }

    public static zzfi.zzg w(zzfi.zze zzeVar, String str) {
        Iterator itM2089 = C0107.m2089(C0131.m2528(zzeVar));
        while (true) {
            boolean zM3327 = C0174.m3327(itM2089);
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
                        return null;
                    default:
                        break;
                }
            }
            zzfi.zzg zzgVar = (zzfi.zzg) C0414.m8115(itM2089);
            boolean zM321 = C0016.m321(C0128.m2468(zzgVar), str);
            int i11 = 1740;
            while (true) {
                i11 ^= 1757;
                switch (i11) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i11 = zM321 ? 1833 : 1802;
                        break;
                    case 54:
                        break;
                    case 471:
                        break;
                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                        return zzgVar;
                    default:
                        break;
                }
            }
        }
    }

    public static zzkm x(zzix.zzb zzbVar, byte[] bArr) {
        zzik zzikVarM650 = C0033.m650();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zzikVarM650 != null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return C0451.m8788(zzbVar, bArr, zzikVarM650);
                case 239:
                    return C0275.m5291(zzbVar, bArr);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public static String z(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb = new StringBuilder();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = z10 ? 1709 : 1678;
                    break;
                case 204:
                    C0142.m2728(sb, C0035.m686(m6592(), 226, C0287.f431 ^ 364, 1436));
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        int i11 = 1740;
        while (true) {
            i11 ^= 1757;
            switch (i11) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i11 = z11 ? 1833 : 1802;
                    break;
                case 54:
                    break;
                case 471:
                    break;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    C0142.m2728(sb, C0447.m8698(m6592(), 234, C0338.f608 ^ 250, 946));
                    break;
                default:
                    break;
            }
        }
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (z12) {
                        i12 = 48736;
                    }
                    break;
                case 47384:
                    break;
                case 47417:
                    C0142.m2728(sb, C0158.m3014(m6592(), 243, C0008.f28 ^ (-9), 2221));
                    break;
                case 47483:
                    break;
                default:
                    continue;
            }
            i12 = 48705;
        }
        return C0441.m8605(sb);
    }

    /* JADX INFO: renamed from: ۟ۧۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6592() {
        int iM8890 = C0457.m8890();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8890 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f582short;
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

    /* JADX WARN: Code restructure failed: missing block: B:69:0x000b, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x000b, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x000b, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x00fb. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:49:0x011a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0013. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List C(java.util.List r13, java.util.List r14) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.r7.C(java.util.List, java.util.List):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:446:0x042d, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x042d, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x042d, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x042d, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x054a, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x054a, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x054a, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x054a, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:102:0x031d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:109:0x0336. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:135:0x0438. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:191:0x0555. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:81:0x02c2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:88:0x02e1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:95:0x0304. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k6.i7 E(java.lang.String r17, com.google.android.gms.internal.measurement.zzfi.zzj r18, com.google.android.gms.internal.measurement.zzfi.zze.zza r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 2458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.r7.E(java.lang.String, com.google.android.gms.internal.measurement.zzfi$zzj, com.google.android.gms.internal.measurement.zzfi$zze$zza, java.lang.String):k6.i7");
    }

    /* JADX WARN: Code duplicated, block: B:232:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x013e A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x00b1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x00ed. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x0134. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:77:0x0142. Please report as an issue. */
    public final void I(zzfi.zzg.zza zzaVar, Object obj) {
        int i10;
        C0019.m371(C0004.m81(C0422.m8272(C0076.m1650(zzaVar))));
        boolean z10 = obj instanceof String;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (z10) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    C0149.m2855(zzaVar, (String) obj);
                    return;
                case 239:
                    boolean z11 = obj instanceof Long;
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (z11) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                boolean z12 = obj instanceof Double;
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (z12) {
                                                i13 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            boolean z13 = obj instanceof Bundle[];
                                            int i14 = 48891;
                                            while (true) {
                                                i14 ^= 48908;
                                                switch (i14) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        C0420.m8245(C0455.m8871(C0029.m572(this)), C0359.m7042(m6592(), 552, C0018.f38 ^ (-617), 1042), obj);
                                                        return;
                                                    case 503:
                                                        if (z13) {
                                                            i14 = 49635;
                                                        }
                                                        break;
                                                    case 32495:
                                                        Bundle[] bundleArr = (Bundle[]) obj;
                                                        ArrayList arrayList = new ArrayList();
                                                        int length = bundleArr.length;
                                                        int i15 = 0;
                                                        while (true) {
                                                            int i16 = i15;
                                                            int i17 = 49666;
                                                            while (true) {
                                                                i17 ^= 49683;
                                                                switch (i17) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i17 = i16 < length ? 49759 : 49728;
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
                                                                C0486.m9451(zzaVar, arrayList);
                                                                return;
                                                            }
                                                            Bundle bundle = bundleArr[i16];
                                                            int i18 = 49790;
                                                            while (true) {
                                                                i18 ^= 49807;
                                                                switch (i18) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 51:
                                                                        break;
                                                                    case 84:
                                                                        zzfi.zzg.zza zzaVarM1697 = C0078.m1697();
                                                                        Iterator itM5256 = C0273.m5256(C0060.m1152(bundle));
                                                                        while (true) {
                                                                            boolean zM3327 = C0174.m3327(itM5256);
                                                                            int i19 = 49914;
                                                                            while (true) {
                                                                                i19 ^= 49931;
                                                                                switch (i19) {
                                                                                    case 497:
                                                                                        i19 = zM3327 ? 50658 : 50627;
                                                                                        break;
                                                                                    case 1711:
                                                                                        break;
                                                                                    case 1736:
                                                                                        break;
                                                                                    case 1769:
                                                                                        String str = (String) C0414.m8115(itM5256);
                                                                                        zzfi.zzg.zza zzaVarM1664 = C0077.m1664(C0078.m1697(), str);
                                                                                        Object objM195 = C0010.m195(bundle, str);
                                                                                        boolean z14 = objM195 instanceof Long;
                                                                                        int i20 = 50689;
                                                                                        while (true) {
                                                                                            i20 ^= 50706;
                                                                                            switch (i20) {
                                                                                                case 19:
                                                                                                    i20 = z14 ? 50782 : 50751;
                                                                                                    break;
                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                    boolean z15 = objM195 instanceof String;
                                                                                                    int i21 = 51588;
                                                                                                    while (true) {
                                                                                                        i21 ^= 51605;
                                                                                                        switch (i21) {
                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                i21 = z15 ? 51681 : 51650;
                                                                                                                break;
                                                                                                            case 54:
                                                                                                                break;
                                                                                                            case 87:
                                                                                                                boolean z16 = objM195 instanceof Double;
                                                                                                                int i22 = 51836;
                                                                                                                while (true) {
                                                                                                                    i22 ^= 51853;
                                                                                                                    switch (i22) {
                                                                                                                        case 241:
                                                                                                                            i22 = z16 ? 52580 : 52549;
                                                                                                                            break;
                                                                                                                        case 1963:
                                                                                                                            break;
                                                                                                                        case 1992:
                                                                                                                            break;
                                                                                                                        case 2025:
                                                                                                                            C0305.m5880(zzaVarM1664, C0112.m2157((Double) objM195));
                                                                                                                            C0348.m6810(zzaVarM1697, zzaVarM1664);
                                                                                                                            i10 = 52611;
                                                                                                                            while (true) {
                                                                                                                                i10 ^= 52628;
                                                                                                                                switch (i10) {
                                                                                                                                    case 23:
                                                                                                                                        i10 = 52642;
                                                                                                                                        break;
                                                                                                                                    case 54:
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
                                                                                                            case 116:
                                                                                                                C0149.m2855(zzaVarM1664, (String) objM195);
                                                                                                                int i23 = 51712;
                                                                                                                while (true) {
                                                                                                                    i23 ^= 51729;
                                                                                                                    switch (i23) {
                                                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                                                            break;
                                                                                                                        case 15:
                                                                                                                        case Code.UNAUTHENTICATED /* 16 */:
                                                                                                                        default:
                                                                                                                            break;
                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                            i23 = 51743;
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    C0348.m6810(zzaVarM1697, zzaVarM1664);
                                                                                                                    i10 = 52611;
                                                                                                                    while (true) {
                                                                                                                        i10 ^= 52628;
                                                                                                                        switch (i10) {
                                                                                                                            case 23:
                                                                                                                                i10 = 52642;
                                                                                                                                break;
                                                                                                                            case 54:
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
                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                    break;
                                                                                                case 76:
                                                                                                    C0135.m2597(zzaVarM1664, C0491.m9543((Long) objM195));
                                                                                                    int i24 = 50813;
                                                                                                    while (true) {
                                                                                                        i24 ^= 50830;
                                                                                                        switch (i24) {
                                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                break;
                                                                                                            case 243:
                                                                                                                i24 = 50844;
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                        C0348.m6810(zzaVarM1697, zzaVarM1664);
                                                                                                        i10 = 52611;
                                                                                                        while (true) {
                                                                                                            i10 ^= 52628;
                                                                                                            switch (i10) {
                                                                                                                case 23:
                                                                                                                    i10 = 52642;
                                                                                                                    break;
                                                                                                                case 54:
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
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                                int iM2424 = C0125.m2424(zzaVarM1697);
                                                                                int i25 = 52735;
                                                                                while (true) {
                                                                                    i25 ^= 52752;
                                                                                    switch (i25) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                            break;
                                                                                        case 1007:
                                                                                            i25 = iM2424 > 0 ? 53479 : 52797;
                                                                                            break;
                                                                                        case 7927:
                                                                                            C0358.m6998(arrayList, (zzfi.zzg) ((zzix) C0440.m8566(zzaVarM1697)));
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 241:
                                                                        i18 = bundle != null ? 49883 : 49852;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            i15 = (C0459.f729 ^ (-312)) + i16;
                                                            int i26 = 53510;
                                                            while (true) {
                                                                i26 ^= 53527;
                                                                switch (i26) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i26 = 53541;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i14 = 48953;
                                            }
                                            break;
                                        case 47417:
                                            C0305.m5880(zzaVar, C0112.m2157((Double) obj));
                                            int iM9143 = C0470.m9143();
                                            int i27 = 48767;
                                            while (true) {
                                                i27 ^= 48784;
                                                switch (i27) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        return;
                                                    case 76:
                                                        System.out.println(Float.decode(C0018.m365("WFBxpTsR69SWkB9")));
                                                        return;
                                                    case 239:
                                                        if (iM9143 <= 0) {
                                                            i27 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i27 = 48829;
                                            }
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i13 = 48705;
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0135.m2597(zzaVar, C0491.m9543((Long) obj));
                                return;
                            default:
                                continue;
                        }
                        i12 = 1802;
                    }
                    break;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:82:0x0203. Please report as an issue. */
    public final void K(StringBuilder sb, int i10, zzew.zzc zzcVar) {
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zzcVar == null) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    int iM8993 = C0462.m8993();
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM8993 <= 0) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                System.out.println(Integer.decode(C0208.m3982("Cg")));
                                return;
                            default:
                                continue;
                        }
                        i12 = 1802;
                    }
                    break;
                case 239:
                    C0157.m2989(sb, i10);
                    C0142.m2728(sb, C0203.m3898(m6592(), 593, C0451.f721 ^ (-676), 1695));
                    boolean zM5648 = C0294.m5648(zzcVar);
                    int i13 = 1864;
                    while (true) {
                        i13 ^= 1881;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i13 = zM5648 ? 48736 : 48705;
                                break;
                            case 47384:
                                break;
                            case 47417:
                                C0304.m5861(sb, i10, C0085.m1814(m6592(), 602, C0323.f470 ^ 117, 3182), C0009.m192(C0334.m6471(zzcVar)));
                                break;
                            case 47483:
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zM1034 = C0053.m1034(zzcVar);
                    int i14 = 48767;
                    while (true) {
                        i14 ^= 48784;
                        switch (i14) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case 76:
                                C0304.m5861(sb, i10, C0412.m8071(m6592(), 612, C0429.f699 ^ 205, 1692), C0412.m8083(C0234.m4489(this), C0227.m4356(zzcVar)));
                                break;
                            case 239:
                                i14 = zM1034 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zM7576 = C0387.m7576(zzcVar);
                    String strM1884 = C0088.m1884(m6592(), 622, C0467.f737 ^ 342, 1690);
                    int i15 = 48891;
                    while (true) {
                        i15 ^= 48908;
                        switch (i15) {
                            case 22:
                                break;
                            case 53:
                                break;
                            case 503:
                                i15 = zM7576 ? 49635 : 48953;
                                break;
                            case 32495:
                                int i16 = i10 + (C0484.f757 ^ (-782));
                                zzew.zzf zzfVarM8585 = C0440.m8585(zzcVar);
                                int i17 = 49666;
                                while (true) {
                                    i17 ^= 49683;
                                    switch (i17) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i17 = zzfVarM8585 != null ? 49759 : 49728;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            C0157.m2989(sb, i16);
                                            C0142.m2728(sb, C0054.m1043(m6592(), 624, C0141.f167 ^ 175, 428));
                                            C0142.m2728(sb, C0068.m1331(m6592(), 637, C0270.f349 ^ (-506), 1088));
                                            boolean zM8962 = C0461.m8962(zzfVarM8585);
                                            int i18 = 49790;
                                            while (true) {
                                                i18 ^= 49807;
                                                switch (i18) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        break;
                                                    case 84:
                                                        C0304.m5861(sb, i16, C0227.m4371(m6592(), 640, C0399.f669 ^ 668, 2468), C0333.m6458(C0405.m7930(zzfVarM8585)));
                                                        break;
                                                    case 241:
                                                        i18 = zM8962 ? 49883 : 49852;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            boolean zM7394 = C0378.m7394(zzfVarM8585);
                                            int i19 = 49914;
                                            while (true) {
                                                i19 ^= 49931;
                                                switch (i19) {
                                                    case 497:
                                                        i19 = zM7394 ? 50658 : 50627;
                                                        break;
                                                    case 1711:
                                                        break;
                                                    case 1736:
                                                        break;
                                                    case 1769:
                                                        C0304.m5861(sb, i16, C0142.m2731(m6592(), 650, C0342.f612 ^ (-761), 1224), C0238.m4563(zzfVarM8585));
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            boolean zM1991 = C0102.m1991(zzfVarM8585);
                                            int i20 = 50689;
                                            while (true) {
                                                i20 ^= 50706;
                                                switch (i20) {
                                                    case 19:
                                                        if (zM1991) {
                                                            i20 = 50782;
                                                        }
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        C0304.m5861(sb, i16, C0306.m5885(m6592(), 660, C0471.f741 ^ 187, 1468), C0009.m192(C0061.m1174(zzfVarM8585)));
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i20 = 50751;
                                            }
                                            int iM7830 = C0400.m7830(zzfVarM8585);
                                            int i21 = 50813;
                                            while (true) {
                                                i21 ^= 50830;
                                                switch (i21) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 243:
                                                        i21 = iM7830 > 0 ? 51557 : 50875;
                                                        break;
                                                    case 4075:
                                                        C0157.m2989(sb, (C0079.f113 ^ (-554)) + i10);
                                                        C0142.m2728(sb, C0090.m1922(m6592(), 674, C0119.f145 ^ 915, 3244));
                                                        Iterator itM2089 = C0107.m2089(C0317.m6129(zzfVarM8585));
                                                        while (true) {
                                                            boolean zM3327 = C0174.m3327(itM2089);
                                                            int i22 = 51588;
                                                            while (true) {
                                                                i22 ^= 51605;
                                                                switch (i22) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i22 = zM3327 ? 51681 : 51650;
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 87:
                                                                        break;
                                                                    case 116:
                                                                        String str = (String) C0414.m8115(itM2089);
                                                                        C0157.m2989(sb, (C0482.f755 ^ (-556)) + i10);
                                                                        C0142.m2728(sb, str);
                                                                        C0142.m2728(sb, C0356.m6971(m6592(), 692, 1, 1390));
                                                                        int i23 = 51712;
                                                                        while (true) {
                                                                            i23 ^= 51729;
                                                                            switch (i23) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i23 = 51743;
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                C0142.m2728(sb, strM1884);
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            C0157.m2989(sb, i16);
                                            C0142.m2728(sb, strM1884);
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
                    boolean zM636 = C0032.m636(zzcVar);
                    int i24 = 51836;
                    while (true) {
                        i24 ^= 51853;
                        switch (i24) {
                            case 241:
                                if (zM636) {
                                    i24 = 52580;
                                }
                                break;
                            case 1963:
                                break;
                            case 1992:
                                break;
                            case 2025:
                                C0281.m5429(sb, (C0118.f144 ^ (-955)) + i10, C0487.m9476(m6592(), 693, C0386.f656 ^ (-4), 2194), C0432.m8453(zzcVar));
                                break;
                            default:
                                continue;
                        }
                        i24 = 52549;
                    }
                    C0157.m2989(sb, i10);
                    C0142.m2728(sb, strM1884);
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x001b, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0023. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x00ca. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x010f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(java.lang.StringBuilder r10, int r11, java.util.List r12) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.r7.N(java.lang.StringBuilder, int, java.util.List):void");
    }

    public final boolean Q(long j10, long j11) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (j10 != 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (j11 > 0) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0014.m280((e6.c) C0166.m3176(this));
                                long jM6486 = C0335.m6486(((C0402.m7869() - 29) - j10) + 29);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (jM6486 > j11) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            return false;
                                        case 47417:
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
                                break;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return true;
    }

    public final byte[] T(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            C0492.m9559(gZIPOutputStream, bArr);
            C0221.m4253(gZIPOutputStream);
            C0386.m7554(byteArrayOutputStream);
            return C0384.m7522(byteArrayOutputStream);
        } catch (IOException e4) {
            d4 d4VarM572 = C0029.m572(this);
            C0420.m8245(C0455.m8871(d4VarM572), C0198.m3789(m6592(), 753, C0328.f475 ^ (-829), 1394), e4);
            throw e4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:276:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x023a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x024c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x024c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:83:0x01a2. Please report as an issue. */
    public final boolean U(String str) {
        Account[] accountArr;
        int i10;
        int length;
        int i11;
        C0271.m5173(str);
        a5 a5VarM4795 = C0251.m4795(C0090.m1924(this), str);
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (a5VarM4795 == null) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    return false;
                case 239:
                    r rVarM5903 = C0306.m5903((f5) C0163.m3121(this));
                    String strM8030 = C0410.m8030(m6592(), 775, C0035.f55 ^ (-714), 2032);
                    C0224.m4302(rVarM5903);
                    C0014.m280((e6.c) C0166.m3176(rVarM5903));
                    long jM7869 = C0402.m7869();
                    long jM8943 = C0460.m8943(rVarM5903);
                    int i13 = 1740;
                    while (true) {
                        i13 ^= 1757;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i13 = ((25 + jM7869) - jM8943) - 25 > 86400000 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                rVarM5903.f10334f = null;
                                break;
                            default:
                                break;
                        }
                    }
                    Boolean boolM2749 = C0143.m2749(rVarM5903);
                    int i14 = 1864;
                    while (true) {
                        i14 ^= 1881;
                        switch (i14) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i14 = boolM2749 != null ? 48736 : 48705;
                                break;
                            case 47384:
                                int iM3801 = C0198.m3801(C0277.m5311(rVarM5903), C0485.m9421(m6592(), 785, C0086.f120 ^ (-792), 878));
                                int i15 = 49666;
                                while (true) {
                                    i15 ^= 49683;
                                    switch (i15) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i15 = iM3801 != 0 ? 49759 : 49728;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            C0135.m2604(C0256.m4879(C0029.m572(rVarM5903)), C0488.m9485(m6592(), 816, C0207.f231 ^ (-608), 1503));
                                            rVarM5903.f10335g = jM7869;
                                            rVarM5903.f10334f = C0456.m8876();
                                            int i16 = 49790;
                                            while (true) {
                                                i16 ^= 49807;
                                                switch (i16) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        return false;
                                                    case 241:
                                                        i16 = 49821;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 83:
                                            AccountManager accountManagerM4657 = C0243.m4657(rVarM5903);
                                            int i17 = 49914;
                                            while (true) {
                                                i17 ^= 49931;
                                                switch (i17) {
                                                    case 497:
                                                        i17 = accountManagerM4657 == null ? 50658 : 50627;
                                                        break;
                                                    case 1711:
                                                        break;
                                                    case 1736:
                                                        break;
                                                    case 1769:
                                                        rVarM5903.f10333e = C0233.m4468(C0277.m5311(rVarM5903));
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            try {
                                                Account[] accountArr2 = (Account[]) C0209.m4010(C0404.m7919(C0243.m4657(rVarM5903), strM8030, new String[]{C0179.m3420(m6592(), 869, C0123.f149 ^ (-403), 2176)}, null, null));
                                                int i18 = 50689;
                                                while (true) {
                                                    i18 ^= 50706;
                                                    switch (i18) {
                                                        case 19:
                                                            i18 = accountArr2 != null ? 50782 : 50751;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            accountArr = (Account[]) C0209.m4010(C0404.m7919(C0243.m4657(rVarM5903), strM8030, new String[]{C0132.m2538(m6592(), 883, C0412.f682 ^ 46, 3104)}, null, null));
                                                            i10 = 52735;
                                                            while (true) {
                                                                i10 ^= 52752;
                                                                switch (i10) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        rVarM5903.f10335g = jM7869;
                                                                        rVarM5903.f10334f = C0456.m8876();
                                                                        return false;
                                                                    case 1007:
                                                                        i10 = accountArr != null ? 53479 : 52797;
                                                                        break;
                                                                    case 7927:
                                                                        length = accountArr.length;
                                                                        i11 = 53510;
                                                                        while (true) {
                                                                            i11 ^= 53527;
                                                                            switch (i11) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i11 = length > 0 ? 53603 : 53572;
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                case 83:
                                                                                    rVarM5903.f10335g = jM7869;
                                                                                    rVarM5903.f10334f = C0456.m8876();
                                                                                    return false;
                                                                                case 116:
                                                                                    rVarM5903.f10334f = C0335.m6483();
                                                                                    rVarM5903.f10335g = jM7869;
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
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 76:
                                                            int length2 = accountArr2.length;
                                                            int i19 = 50813;
                                                            while (true) {
                                                                i19 ^= 50830;
                                                                switch (i19) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 53:
                                                                        accountArr = (Account[]) C0209.m4010(C0404.m7919(C0243.m4657(rVarM5903), strM8030, new String[]{C0132.m2538(m6592(), 883, C0412.f682 ^ 46, 3104)}, null, null));
                                                                        i10 = 52735;
                                                                        while (true) {
                                                                            i10 ^= 52752;
                                                                            switch (i10) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    rVarM5903.f10335g = jM7869;
                                                                                    rVarM5903.f10334f = C0456.m8876();
                                                                                    return false;
                                                                                case 1007:
                                                                                    if (accountArr != null) {
                                                                                    }
                                                                                    break;
                                                                                case 7927:
                                                                                    length = accountArr.length;
                                                                                    i11 = 53510;
                                                                                    while (true) {
                                                                                        i11 ^= 53527;
                                                                                        switch (i11) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                if (length > 0) {
                                                                                                }
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                break;
                                                                                            case 83:
                                                                                                rVarM5903.f10335g = jM7869;
                                                                                                rVarM5903.f10334f = C0456.m8876();
                                                                                                return false;
                                                                                            case 116:
                                                                                                rVarM5903.f10334f = C0335.m6483();
                                                                                                rVarM5903.f10335g = jM7869;
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
                                                                    case 243:
                                                                        i19 = length2 > 0 ? 51557 : 50875;
                                                                        break;
                                                                    case 4075:
                                                                        rVarM5903.f10334f = C0335.m6483();
                                                                        rVarM5903.f10335g = jM7869;
                                                                        int i20 = 51588;
                                                                        while (true) {
                                                                            i20 ^= 51605;
                                                                            switch (i20) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i20 = 51619;
                                                                                    break;
                                                                                case 54:
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
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                            } catch (AuthenticatorException e4) {
                                                e = e4;
                                                int i21 = 52611;
                                                while (true) {
                                                    i21 ^= 52628;
                                                    switch (i21) {
                                                        case 23:
                                                            i21 = 52642;
                                                            break;
                                                        case 54:
                                                            C0420.m8245(C0336.m6498(C0029.m572(rVarM5903)), C0268.m5110(m6592(), 894, C0037.f57 ^ 645, 2159), e);
                                                            break;
                                                    }
                                                }
                                            } catch (OperationCanceledException e10) {
                                                e = e10;
                                                int i22 = 51712;
                                                while (true) {
                                                    i22 ^= 51729;
                                                    switch (i22) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            C0420.m8245(C0336.m6498(C0029.m572(rVarM5903)), C0268.m5110(m6592(), 894, C0037.f57 ^ 645, 2159), e);
                                                            break;
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i22 = 51743;
                                                            break;
                                                    }
                                                }
                                            } catch (IOException e11) {
                                                e = e11;
                                                int i23 = 51836;
                                                while (true) {
                                                    i23 ^= 51853;
                                                    switch (i23) {
                                                        case 241:
                                                            i23 = 52518;
                                                            break;
                                                        case 1963:
                                                            C0420.m8245(C0336.m6498(C0029.m572(rVarM5903)), C0268.m5110(m6592(), 894, C0037.f57 ^ 645, 2159), e);
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
                            case 47417:
                                boolean zM14 = C0000.m14(boolM2749);
                                int i24 = 48767;
                                while (true) {
                                    i24 ^= 48784;
                                    switch (i24) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            return false;
                                        case 76:
                                            int i25 = 48891;
                                            while (true) {
                                                i25 ^= 48908;
                                                switch (i25) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i25 = 48922;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 239:
                                            i24 = zM14 ? 48860 : 48829;
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
                    boolean zM1995 = C0102.m1995(a5VarM4795);
                    int i26 = 53634;
                    while (true) {
                        i26 ^= 53651;
                        switch (i26) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM1995) {
                                    i26 = 53727;
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                t4 t4VarM1950 = C0091.m1950(this);
                                C0224.m4302(t4VarM1950);
                                zzfc.zzd zzdVarM9561 = C0492.m9561(t4VarM1950, str);
                                int i27 = 53758;
                                while (true) {
                                    i27 ^= 53775;
                                    switch (i27) {
                                        case 1009:
                                            if (zzdVarM9561 == null) {
                                                i27 = 54502;
                                            }
                                            break;
                                        case 1703:
                                            break;
                                        case 1736:
                                            boolean zM5466 = C0284.m5466(zzdVarM9561);
                                            int i28 = 54657;
                                            while (true) {
                                                i28 ^= 54674;
                                                switch (i28) {
                                                    case 19:
                                                        if (zM5466) {
                                                            i28 = 55401;
                                                        }
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 3579:
                                                        return true;
                                                    default:
                                                        continue;
                                                }
                                                i28 = 54719;
                                            }
                                            break;
                                        case 1769:
                                            int i29 = 54533;
                                            while (true) {
                                                i29 ^= 54550;
                                                switch (i29) {
                                                    case 19:
                                                        i29 = 54564;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i27 = 54471;
                                }
                                break;
                            case 83:
                                break;
                            default:
                                continue;
                        }
                        i26 = 53696;
                    }
                    return false;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001b. Please report as an issue. */
    public final byte[] V(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int iM4740 = C0248.m4740(gZIPInputStream, bArr2);
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i10 = iM4740 > 0 ? 1709 : 1678;
                            break;
                        case 204:
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                    C0351.m6871(gZIPInputStream);
                    C0439.m8551(byteArrayInputStream);
                    return C0384.m7522(byteArrayOutputStream);
                }
                C0361.m7075(byteArrayOutputStream, bArr2, 0, iM4740);
                int i11 = 1740;
                while (true) {
                    i11 ^= 1757;
                    switch (i11) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i11 = 1771;
                            break;
                        case 54:
                            break;
                    }
                }
            }
        } catch (IOException e4) {
            int i12 = 1864;
            while (true) {
                i12 ^= 1881;
                switch (i12) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i12 = 48674;
                        break;
                    case 47483:
                        C0420.m8245(C0455.m8871(C0029.m572(this)), C0280.m5414(m6592(), 926, C0333.f516 ^ 811, 2712), e4);
                        throw e4;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x00ad, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList W() {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.r7.W():java.util.ArrayList");
    }

    @Override // k6.m7
    public final boolean r() {
        return false;
    }

    public final long t(byte[] bArr) {
        C0271.m5173(bArr);
        C0224.m4302(C0355.m6951(this));
        MessageDigest messageDigestM7212 = C0368.m7212();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (messageDigestM7212 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    d4 d4VarM572 = C0029.m572(this);
                    C0135.m2604(C0455.m8871(d4VarM572), C0105.m2052(m6592(), 1072, C0137.f163 ^ 115, 3176));
                    return (-781) ^ ((long) C0231.f310);
                case 239:
                    return C0255.m4861(C0340.m6663(messageDigestM7212, bArr));
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final Parcelable v(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (bArr == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return null;
                case 239:
                    Parcel parcelM7521 = C0384.m7521();
                    try {
                        try {
                            C0127.m2460(parcelM7521, bArr, 0, bArr.length);
                            C0075.m1634(parcelM7521, 0);
                            parcelable = (Parcelable) C0399.m7785(creator, parcelM7521);
                            C0082.m1756(parcelM7521);
                        } catch (a6.b e4) {
                            C0135.m2604(C0455.m8871(C0029.m572(this)), C0067.m1308(m6592(), 1089, C0456.f726 ^ 533, 2726));
                            C0082.m1756(parcelM7521);
                            parcelable = null;
                        }
                        return parcelable;
                    } catch (Throwable th) {
                        int i11 = 1740;
                        while (true) {
                            i11 ^= 1757;
                            switch (i11) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = 1771;
                                    break;
                                case 54:
                                    C0082.m1756(parcelM7521);
                                    throw th;
                            }
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:445:0x0035, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x004d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:263:0x086b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:284:0x08d3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:297:0x093e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:311:0x099c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:324:0x09cf. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:375:0x0afa. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:421:0x0c11. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String y(com.google.android.gms.internal.measurement.zzfi.zzi r15) {
        /*
            Method dump skipped, instruction units count: 4110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.r7.y(com.google.android.gms.internal.measurement.zzfi$zzi):java.lang.String");
    }
}
