package k6;

import a.C0000;
import a7.C0008;
import a8.C0009;
import a8.C0010;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.C0013;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.app.C0014;
import android.support.v4.app.C0015;
import android.util.Pair;
import androidx.annotation.C0018;
import androidx.annotation.C0019;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.graphics.C0031;
import androidx.compose.ui.input.key.C0033;
import androidx.compose.ui.layout.C0035;
import androidx.compose.ui.layout.C0036;
import androidx.compose.ui.node.C0037;
import androidx.core.app.C0040;
import androidx.lifecycle.C0043;
import androidx.preference.C0044;
import androidx.profileinstaller.C0046;
import androidx.startup.C0047;
import androidx.versionedparcelable.C0048;
import b3.C0051;
import c0.C0057;
import c1.C0059;
import c1.C0060;
import c1.C0061;
import c7.C0068;
import ca.C0070;
import com.auto.accept.data.model.C0071;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.common.C0087;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.stats.C0101;
import com.google.android.gms.internal.tasks.C0102;
import com.google.android.gms.tasks.C0106;
import com.google.android.play.core.integrity.client.C0108;
import com.google.android.play.core.integrity.model.C0109;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.C0205;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.iid.C0170;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement.C0181;
import com.google.firebase.measurement.C0182;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.firebase.remoteconfig.ktx.C0199;
import com.google.gson.internal.bind.C0206;
import com.google.gson.internal.bind.C0207;
import d.C0211;
import d1.C0215;
import d7.C0221;
import d9.C0224;
import d9.C0225;
import dagger.hilt.C0256;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.android.lifecycle.C0238;
import dagger.hilt.codegen.C0242;
import dagger.hilt.codegen.C0243;
import dagger.hilt.internal.C0254;
import dagger.hilt.internal.aggregatedroot.codegen.C0246;
import dagger.hilt.internal.componenttreedeps.C0249;
import dagger.hilt.internal.generatesrootinput.C0251;
import dagger.hilt.migration.C0255;
import e1.C0258;
import e1.C0259;
import e1.C0260;
import e2.C0262;
import e7.C0265;
import f.C0270;
import f.C0271;
import f0.C0272;
import f4.C0275;
import f4.C0276;
import f4.C0277;
import f6.C0278;
import f6.C0279;
import fa.C0282;
import g.C0284;
import g.C0285;
import g2.C0287;
import g2.C0288;
import g3.C0289;
import g5.C0291;
import g5.C0292;
import g8.C0294;
import ga.C0296;
import h.C0298;
import h.C0299;
import h0.C0300;
import h3.C0302;
import h3.C0303;
import h3.C0304;
import h5.C0308;
import h6.C0310;
import h7.C0311;
import h7.C0313;
import h8.C0314;
import i4.C0318;
import i5.C0319;
import i6.C0320;
import i6.C0321;
import j2.C0324;
import j3.C0326;
import j6.C0329;
import j9.C0330;
import ja.C0331;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k2.C0334;
import k3.C0335;
import k3.C0336;
import k4.C0337;
import k8.C0339;
import l0.C0340;
import l2.C0342;
import l6.C0345;
import l9.C0348;
import m0.C0350;
import m5.C0355;
import m7.C0358;
import m7.C0359;
import n.C0361;
import n.C0362;
import n1.C0363;
import n7.C0364;
import n7.C0365;
import n8.C0366;
import n9.C0367;
import o1.C0368;
import o2.C0369;
import o4.C0370;
import o5.C0371;
import o8.C0372;
import okhttp3.internal.publicsuffix.C0373;
import p7.C0379;
import p8.C0380;
import p8.C0381;
import q1.C0384;
import q2.C0385;
import q6.C0389;
import q7.C0391;
import r.C0393;
import r1.C0394;
import r4.C0399;
import r5.C0400;
import r5.C0401;
import r6.C0402;
import r7.C0405;
import rikka.shizuku.C0407;
import s2.C0412;
import s3.C0413;
import s6.C0414;
import s7.C0415;
import s8.C0417;
import t1.C0420;
import t2.C0421;
import t2.C0422;
import t3.C0425;
import u.C0430;
import u1.C0432;
import u1.C0433;
import u3.C0435;
import u7.C0438;
import u8.C0439;
import v.C0440;
import v0.C0441;
import v0.C0442;
import v0.C0443;
import v5.C0446;
import v6.C0448;
import v8.C0451;
import v9.C0452;
import v9.C0453;
import w.C0454;
import w0.C0455;
import w1.C0456;
import w2.C0457;
import w2.C0459;
import w4.C0460;
import w4.C0462;
import w5.C0464;
import w6.C0465;
import w9.C0466;
import x2.C0468;
import x4.C0469;
import x4.C0470;
import x5.C0471;
import x7.C0472;
import x8.C0474;
import y9.C0479;
import z0.C0483;
import z2.C0485;
import z3.C0487;
import z7.C0489;
import z7.C0490;
import z7.C0491;
import z8.C0493;

/* JADX INFO: loaded from: classes.dex */
public final class s6 extends p2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f585short = {2096, 2076, 2077, 2077, 2070, 2064, 2055, 2074, 2076, 2077, 2131, 2066, 2055, 2055, 2070, 2078, 2051, 2055, 2131, 2066, 2079, 2049, 2070, 2066, 2071, 2058, 2131, 2074, 2077, 2131, 2051, 2049, 2076, 2068, 2049, 2070, 2048, 2048, 582, 619, 629, 610, 614, 611, 638, 551, 614, 624, 614, 622, 627, 622, 617, 608, 551, 612, 616, 617, 617, 610, 612, 627, 622, 616, 617, 551, 614, 627, 627, 610, 618, 631, 627, 2394, 2422, 2423, 2423, 2428, 2426, 2413, 2416, 2423, 2430, 2361, 2413, 2422, 2361, 2411, 2428, 2420, 2422, 2413, 2428, 2361, 2410, 2428, 2411, 2415, 2416, 2426, 2428, 2451, 2463, 2461, 2526, 2455, 2463, 2463, 2455, 2460, 2453, 2526, 2449, 2462, 2452, 2434, 2463, 2457, 2452, 2526, 2455, 2461, 2435, 2526, 2461, 2453, 2449, 2435, 2437, 2434, 2453, 2461, 2453, 2462, 2436, 2526, 2481, 2432, 2432, 2493, 2453, 2449, 2435, 2437, 2434, 2453, 2461, 2453, 2462, 2436, 2467, 2453, 2434, 2438, 2457, 2451, 2453, 1935, 1923, 1921, 1986, 1931, 1923, 1923, 1931, 1920, 1929, 1986, 1933, 1922, 1928, 1950, 1923, 1925, 1928, 1986, 1931, 1921, 1951, 1986, 1921, 1929, 1933, 1951, 1945, 1950, 1929, 1921, 1929, 1922, 1944, 1986, 1983, 1976, 1965, 1982, 1976, 2233, 2229, 2231, 2292, 2237, 2229, 2229, 2237, 2230, 2239, 2292, 2235, 2228, 2238, 2216, 2229, 2227, 2238, 2292, 2237, 2231, 2217, 2292, 2231, 2239, 2235, 2217, 2223, 2216, 2239, 2231, 2239, 2228, 2222, 2292, 2203, 2218, 2218, 2199, 2239, 2235, 2217, 2223, 2216, 2239, 2231, 2239, 2228, 2222, 2185, 2239, 2216, 2220, 2227, 2233, 2239, 1408, 1452, 1453, 1453, 1446, 1440, 1463, 1450, 1452, 1453, 1507, 1442, 1463, 1463, 1446, 1454, 1459, 1463, 1507, 1442, 1455, 1457, 1446, 1442, 1447, 1466, 1507, 1450, 1453, 1507, 1459, 1457, 1452, 1444, 1457, 1446, 1456, 1456, 1250, 1220, 1246, 1241, 1232, 1175, 1243, 1240, 1236, 1238, 1243, 1175, 1238, 1223, 1223, 1175, 1242, 1234, 1238, 1220, 1218, 1221, 1234, 1242, 1234, 1241, 1219, 1175, 1220, 1234, 1221, 1217, 1246, 1236, 1234, 1842, 1801, 1798, 1797, 1803, 1794, 1863, 1811, 1800, 1863, 1810, 1812, 1794, 1863, 1813, 1794, 1802, 1800, 1811, 1794, 1863, 1800, 1813, 1863, 1803, 1800, 1796, 1798, 1803, 1863, 1802, 1794, 1798, 1812, 1810, 1813, 1794, 1802, 1794, 1801, 1811, 1863, 1806, 1802, 1815, 1803, 1794, 1802, 1794, 1801, 1811, 1798, 1811, 1806, 1800, 1801, 1865, 1863, 1847, 1803, 1794, 1798, 1812, 1794, 1863, 1813, 1794, 1792, 1806, 1812, 1811, 1794, 1813, 1863, 1811, 1807, 1794, 1863, 1830, 1815, 1815, 1834, 1794, 1798, 1812, 1810, 1813, 1794, 1802, 1794, 1801, 1811, 1844, 1794, 1813, 1809, 1806, 1796, 1794, 1863, 1812, 1794, 1813, 1809, 1806, 1796, 1794, 1863, 1806, 1801, 1863, 1811, 1807, 1794, 1863, 1798, 1815, 1815, 1863, 1802, 1798, 1801, 1806, 1793, 1794, 1812, 1811, 692, 662, 651, 647, 641, 663, 663, 653, 650, 643, 708, 661, 657, 641, 657, 641, 640, 708, 657, 660, 708, 663, 641, 662, 658, 653, 647, 641, 708, 656, 645, 663, 655, 663, 2755, 2806, 2788, 2812, 2743, 2802, 2799, 2804, 2802, 2791, 2787, 2814, 2808, 2809, 2743, 2784, 2815, 2814, 2811, 2802, 2743, 2801, 2811, 2786, 2788, 2815, 2814, 2809, 2800, 2743, 2790, 2786, 2802, 2786, 2802, 1323, 1325, 1339, 1281, 1325, 1339, 1324, 1320, 1335, 1341, 1339, 1819, 1840, 1853, 1851, 1843, 1841, 1846, 1855, 1912, 1835, 1853, 1834, 1838, 1841, 1851, 1853, 1912, 1849, 1838, 1849, 1841, 1844, 1849, 1850, 1841, 1844, 1841, 1836, 1825, 774, 829, 822, 811, 803, 822, 816, 807, 822, 823, 883, 800, 822, 801, 805, 826, 816, 822, 883, 800, 807, 818, 807, 806, 800, 2855, 2833, 2822, 2818, 2845, 2839, 2833, 2900, 2817, 2820, 2832, 2837, 2816, 2845, 2842, 2835, 1366, 1376, 1399, 1395, 1388, 1382, 1376, 1317, 1388, 1387, 1395, 1380, 1385, 1388, 1377, 2507, 2557, 2538, 2542, 2545, 2555, 2557, 2488, 2556, 2545, 2539, 2553, 2554, 2548, 2557, 2556, 1377, 1367, 1344, 1348, 1371, 1361, 1367, 1298, 1361, 1373, 1372, 1350, 1363, 1371, 1372, 1367, 1344, 1298, 1373, 1351, 1350, 1298, 1373, 1364, 1298, 1366, 1363, 1350, 1367, 1599, 1545, 1566, 1562, 1541, 1551, 1545, 1612, 1537, 1541, 1567, 1567, 1541, 1538, 1547, 1304, 1326, 1337, 1341, 1314, 1320, 1326, 1387, 1322, 1341, 1322, 1314, 1319, 1322, 1321, 1319, 1326, 1386, 1355, 1284, 1363, 1349, 1373, 1284, 1360, 1355, 1284, 1361, 1364, 1352, 1355, 1349, 1344, 1290, 1284, 1383, 1355, 1354, 1367, 1357, 1344, 1345, 1366, 1284, 1361, 1367, 1357, 1354, 1347, 1284, 1360, 1356, 1345, 1284, 1346, 1361, 1352, 1352, 1284, 1362, 1345, 1366, 1367, 1357, 1355, 1354, 1284, 1355, 1346, 1284, 1381, 1354, 1349, 1352, 1373, 1360, 1357, 1351, 1367, 1212, 1167, 1158, 1162, 1204, 1160, 1156, 1157, 1176, 1166, 1157, 1183, 1204, 1176, 1166, 1183, 1183, 1154, 1157, 1164, 1176, 1164, 1184, 1210, 1187, 1195, 1263, 1185, 1184, 1211, 1263, 1192, 1194, 1211, 1263, 1154, 1163, 1274, 1263, 1190, 1185, 1212, 1211, 1198, 1185, 1196, 1194, 2807, 2779, 2753, 2776, 2768, 2708, 2778, 2779, 2752, 2708, 2771, 2769, 2752, 2708, 2759, 2781, 2771, 2778, 2773, 2752, 2753, 2758, 2769, 2759, 2654, 2671, 2669, 2661, 2671, 2665, 2667, 2606, 2656, 2671, 2659, 2667, 2606, 2656, 2657, 2682, 2606, 2664, 2657, 2683, 2656, 2666, 1527, 1498, 1472, 1490, 1489, 1503, 1494, 1495, 1427, 1530, 1530, 1527, 1427, 1493, 1500, 1473, 1427, 1479, 1494, 1472, 1479, 1472, 1437, 864, 876, 878, 813, 868, 876, 876, 868, 879, 870, 813, 869, 874, 881, 870, 865, 866, 880, 870, 813, 866, 877, 866, 879, 890, 887, 874, 864, 880, 813, 837, 874, 881, 870, 865, 866, 880, 870, 834, 877, 866, 879, 890, 887, 874, 864, 880, 1745, 1747, 1730, 1791, 1752, 1733, 1730, 1751, 1752, 1749, 1747, 2502, 2500, 2517, 2535, 2504, 2515, 2500, 2499, 2496, 2514, 2500, 2536, 2511, 2514, 2517, 2496, 2511, 2498, 2500, 2536, 2501, 1375, 1400, 1392, 1397, 1404, 1405, 1337, 1389, 1398, 1337, 1387, 1404, 1389, 1387, 1392, 1404, 1391, 1404, 1337, 1375, 1392, 1387, 1404, 1403, 1400, 1386, 1404, 1337, 1360, 1399, 1386, 1389, 1400, 1399, 1402, 1404, 1337, 1360, 1405, 2218, 2189, 2181, 2176, 2185, 2184, 2252, 2200, 2179, 
    2252, 2179, 2190, 2200, 2189, 2181, 2178, 2252, 2218, 2181, 2206, 2185, 2190, 2189, 2207, 2185, 2252, 2221, 2178, 2189, 2176, 2197, 2200, 2181, 2191, 2207, 2252, 2181, 2178, 2207, 2200, 2189, 2178, 2191, 2185, 1528, 1520, 1520, 1528, 1523, 1530, 1472, 1534, 1521, 1534, 1523, 1510, 1515, 1526, 1532, 1516, 1472, 1534, 1531, 1526, 1531, 1472, 1532, 1520, 1523, 1523, 1530, 1532, 1515, 1526, 1520, 1521, 1472, 1530, 1521, 1534, 1533, 1523, 1530, 1531, 968, 969, 970, 969, 990, 990, 969, 968, 1011, 973, 962, 973, 960, 981, 984, 965, 975, 991, 1011, 975, 963, 960, 960, 969, 975, 984, 965, 963, 962, 2418, 2426, 2426, 2418, 2425, 2416, 2378, 2420, 2427, 2420, 2425, 2412, 2401, 2428, 2422, 2406, 2378, 2417, 2416, 2419, 2420, 2400, 2425, 2401, 2378, 2420, 2425, 2425, 2426, 2402, 2378, 2420, 2417, 2378, 2405, 2416, 2407, 2406, 2426, 2427, 2420, 2425, 2428, 2415, 2420, 2401, 2428, 2426, 2427, 2378, 2406, 2428, 2418, 2427, 2420, 2425, 2406, 1498, 1490, 1490, 1498, 1489, 1496, 1506, 1500, 1491, 1500, 1489, 1476, 1481, 1492, 1502, 1486, 1506, 1486, 1498, 1481, 1488, 1506, 1480, 1485, 1489, 1490, 1500, 1497, 1506, 1496, 1491, 1500, 1503, 1489, 1496, 1497, 2811, 2762, 2760, 2752, 2762, 2764, 2766, 2790, 2762, 2757, 2762, 2764, 2766, 2777, 2699, 2765, 2762, 2754, 2759, 2766, 2767, 2699, 2783, 2756, 2699, 2765, 2754, 2757, 2767, 2699, 2777, 2782, 2757, 2757, 2754, 2757, 2764, 2699, 2762, 2779, 2779, 2705, 2699, 2762, 2779, 2779, 2804, 2754, 2767, 1632, 1613, 1623, 1607, 1605, 1622, 1600, 1613, 1610, 1603, 1540, 1600, 1605, 1616, 1605, 1546, 1540, 1641, 1605, 1628, 1540, 1622, 1617, 1610, 1610, 1605, 1606, 1608, 1601, 1540, 1621, 1617, 1601, 1617, 1601, 1540, 1623, 1613, 1630, 1601, 1540, 1622, 1601, 1605, 1607, 1612, 1601, 1600, 2849, 2829, 2828, 2822, 2827, 2838, 2827, 2829, 2828, 2819, 2830, 2882, 2839, 2833, 2823, 2832, 2882, 2834, 2832, 2829, 2834, 2823, 2832, 2838, 2843, 2882, 2838, 2829, 2829, 2882, 2830, 2829, 2828, 2821, 2882, 2820, 2829, 2832, 2882, 2830, 2829, 2817, 2819, 2830, 2882, 2822, 2819, 2838, 2819, 2816, 2819, 2833, 2823, 2892, 2882, 2865, 2823, 2828, 2822, 2827, 2828, 2821, 2882, 2822, 2827, 2832, 2823, 2817, 2838, 2830, 2843, 2882, 2838, 2829, 2882, 2833, 2823, 2832, 2836, 2827, 2817, 2823, 2780, 2795, 2795, 2806, 2795, 2745, 2795, 2812, 2808, 2813, 2800, 2807, 2814, 2745, 2812, 2807, 2797, 2795, 2800, 2812, 2794, 2745, 2815, 2795, 2806, 2804, 2745, 2805, 2806, 2810, 2808, 2805, 2745, 2813, 2808, 2797, 2808, 2811, 2808, 2794, 2812, 1821, 1813, 1813, 1821, 1814, 1823, 1829, 1819, 1802, 1802, 1829, 1815, 1823, 1819, 1801, 1807, 1800, 1823, 1815, 1823, 1812, 1806, 1829, 1814, 1813, 1817, 1819, 1814, 1876, 1822, 1816, 656, 653, 661, 651, 646, 734, 733, 2570, 2562, 2580, 2580, 2566, 2560, 2562, 2580, 3072, 3101, 3077, 3099, 3094, 2148, 2153, 2144, 2165, 2847, 2836, 2830, 2824, 2819, 779, 790, 782, 784, 797, 857, 792, 778, 794, 2727, 2688, 2696, 2701, 2692, 2693, 2753, 2709, 2702, 2753, 2701, 2702, 2688, 2693, 2753, 2692, 2711, 2692, 2703, 2709, 2753, 2695, 2707, 2702, 2700, 2753, 2701, 2702, 2690, 2688, 2701, 2753, 2693, 2688, 2709, 2688, 2691, 2688, 2706, 2692, 2321, 2358, 2366, 2363, 2354, 2355, 2423, 2339, 2360, 2423, 2363, 2360, 2358, 2355, 2423, 2338, 2340, 2354, 2341, 2423, 2343, 2341, 2360, 2343, 2354, 2341, 2339, 2350, 2423, 2353, 2341, 2360, 2362, 2423, 2363, 2360, 2356, 2358, 2363, 2423, 2355, 2358, 2339, 2358, 2357, 2358, 2340, 2354, 1880, 1919, 1911, 1906, 1915, 1914, 1854, 1898, 1905, 1854, 1906, 1905, 1919, 1914, 1854, 1917, 1905, 1904, 1914, 1911, 1898, 1911, 1905, 1904, 1919, 1906, 1854, 1899, 1901, 1915, 1900, 1854, 1902, 1900, 1905, 1902, 1915, 1900, 1898, 1895, 1854, 1912, 1900, 1905, 1907, 1854, 1906, 1905, 1917, 1919, 1906, 1854, 1914, 1919, 1898, 1919, 1916, 1919, 1901, 1915, 2736, 2696, 2698, 2707, 2707, 2698, 2701, 2692, 2755, 2690, 2707, 2707, 2755, 2703, 2690, 2710, 2701, 2688, 2699, 2755, 2689, 2705, 2694, 2690, 2696, 1342, 1285, 1280, 1285, 1284, 1308, 1285, 1355, 1305, 1294, 1288, 1284, 1305, 1295, 1355, 1311, 1298, 1307, 1294, 1355, 1282, 1285, 1355, 1287, 1284, 1288, 1290, 1287, 1355, 1295, 1290, 1311, 1290, 1289, 1290, 1304, 1294, 3281, 3289, 3279, 3279, 3293, 3291, 3289, 3279, 1375, 1346, 1370, 1348, 1353, 1293, 1297, 1296, 1293, 1298, 970, 1001, 1019, 1001, 1022, 940, 1001, 994, 1016, 1022, 997, 1001, 1023, 940, 1022, 1001, 993, 995, 1018, 1001, 1000, 940, 1002, 1022, 995, 993, 940, 992, 995, 1007, 1005, 992, 940, 1000, 1005, 1016, 1005, 1006, 1005, 1023, 1001, 940, 1016, 996, 1005, 994, 940, 1001, 1012, 1020, 1001, 1007, 1016, 1001, 1000, 2006, 2033, 2041, 2044, 2037, 2036, 1968, 2020, 2047, 1968, 2018, 2037, 2033, 2036, 1968, 2037, 2022, 2037, 2046, 2020, 2019, 1968, 2038, 2018, 2047, 2045, 1968, 2036, 2033, 2020, 2033, 2034, 2033, 2019, 2037, 1968, 2041, 2046, 1968, 2018, 2037, 2033, 2019, 2047, 2046, 2033, 2034, 2044, 2037, 1968, 2020, 2041, 2045, 2037, 2164, 2131, 2139, 2142, 2135, 2134, 2066, 2118, 2141, 2066, 2113, 2135, 2140, 2134, 2066, 2135, 2116, 2135, 2140, 2118, 2066, 2118, 2141, 2066, 2118, 2138, 2135, 2066, 2113, 2135, 2112, 2116, 2139, 2129, 2135, 2519, 2544, 2552, 2557, 2548, 2549, 2481, 2533, 2558, 2481, 2530, 2548, 2559, 2549, 2481, 2532, 2530, 2548, 2531, 2481, 2529, 2531, 2558, 2529, 2548, 2531, 2533, 2536, 2481, 2533, 2558, 2481, 2533, 2553, 2548, 2481, 2530, 2548, 2531, 2535, 2552, 2546, 2548, 1599, 1560, 1552, 1557, 1564, 1565, 1625, 1549, 1558, 1625, 1546, 1564, 1559, 1565, 1625, 1562, 1558, 1559, 1565, 1552, 1549, 1552, 1558, 1559, 1560, 1557, 1625, 1548, 1546, 1564, 1547, 1625, 1545, 1547, 1558, 1545, 1564, 1547, 1549, 1536, 1625, 1549, 1558, 1625, 1549, 1553, 1564, 1625, 1546, 1564, 1547, 1551, 1552, 1562, 1564, 312, 277, 271, 287, 285, 270, 280, 277, 274, 283, 348, 280, 285, 264, 285, 338, 348, 297, 274, 270, 281, 287, 275, 283, 274, 277, 262, 281, 280, 348, 268, 285, 270, 287, 281, 272, 348, 264, 261, 268, 281, 338};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z6 f10357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y3 f10358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Boolean f10359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t6 f10360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o8.c f10361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f10362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t6 f10363i;

    public s6(f5 f5Var) {
        super(f5Var);
        this.f10362h = new ArrayList();
        this.f10361g = new o8.c(C0363.m7108(f5Var));
        this.f10357c = new z6(this);
        this.f10360f = new t6(this, f5Var, 0);
        this.f10363i = new t6(this, f5Var, 1);
        int iM5547 = C0289.m5547();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5547 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0109.m2108("bR4avnBJ9X5YCLV9")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۤۧ, reason: not valid java name and contains not printable characters */
    public static short[] m6595() {
        int iM3452 = C0181.m3452();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3452 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f585short;
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

    /* JADX WARN: Code duplicated, block: B:203:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0116 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x027d A[DONT_GENERATE, SYNTHETIC] */
    public final void A() {
        int i10;
        int i11;
        C0040.m791(this);
        C0459.m8937(this);
        boolean zM8489 = C0435.m8489(this);
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM8489) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    return;
                case 239:
                    boolean zM3356 = C0176.m3356(this);
                    int i13 = 1740;
                    while (true) {
                        i13 ^= 1757;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM3356) {
                                    i13 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                boolean zM8120 = C0414.m8120(C0091.m1951(this));
                                int i14 = 50813;
                                while (true) {
                                    i14 ^= 50830;
                                    switch (i14) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 53:
                                            break;
                                        case 243:
                                            if (!zM8120) {
                                                i14 = 51557;
                                            }
                                            break;
                                        case 4075:
                                            List listM7166 = C0366.m7166(C0422.m8279(C0277.m5311(this)), C0128.m2465(new Intent(), C0277.m5311(this), C0400.m7813(m6595(), 101, C0465.f735 ^ 390, 2544)), 65573 ^ C0412.f682);
                                            int i15 = 51588;
                                            while (true) {
                                                i15 ^= 51605;
                                                switch (i15) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (listM7166 != null) {
                                                            i15 = 51681;
                                                        }
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 87:
                                                        break;
                                                    case 116:
                                                        boolean zM7153 = C0365.m7153(listM7166);
                                                        int i16 = 51712;
                                                        while (true) {
                                                            i16 ^= 51729;
                                                            switch (i16) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (!zM7153) {
                                                                        i16 = 51805;
                                                                    }
                                                                    break;
                                                                case 47:
                                                                    break;
                                                                case 76:
                                                                    Intent intent = new Intent(C0153.m2934(m6595(), 157, C0329.f476 ^ 719, 2028));
                                                                    C0490.m9534(intent, new ComponentName(C0277.m5311(this), C0394.m7710(m6595(), 197, C0061.f81 ^ 780, 2266)));
                                                                    z6 z6VarM4642 = C0243.m4642(this);
                                                                    C0040.m791(C0371.m7272(z6VarM4642));
                                                                    Context contextM5311 = C0277.m5311(C0371.m7272(z6VarM4642));
                                                                    d6.a aVarM1151 = C0060.m1151();
                                                                    synchronized (z6VarM4642) {
                                                                        try {
                                                                            boolean zM455 = C0023.m455(z6VarM4642);
                                                                            int i17 = 51836;
                                                                            while (true) {
                                                                                i17 ^= 51853;
                                                                                switch (i17) {
                                                                                    case 241:
                                                                                        if (zM455) {
                                                                                            i17 = 52580;
                                                                                        }
                                                                                        break;
                                                                                    case 1963:
                                                                                        break;
                                                                                    case 1992:
                                                                                        C0135.m2604(C0136.m2634(C0029.m572(C0371.m7272(z6VarM4642))), C0337.m6514(m6595(), 291, C0456.f726 ^ 531, 1207));
                                                                                        z6VarM4642.f10617a = true;
                                                                                        C0453.m8830(aVarM1151, contextM5311, intent, C0243.m4642(C0371.m7272(z6VarM4642)), C0278.f422 ^ (-305));
                                                                                        break;
                                                                                    case 2025:
                                                                                        C0135.m2604(C0136.m2634(C0029.m572(C0371.m7272(z6VarM4642))), C0238.m4582(m6595(), 253, C0228.f307 ^ (-938), 1475));
                                                                                        int i18 = 52611;
                                                                                        while (true) {
                                                                                            i18 ^= 52628;
                                                                                            switch (i18) {
                                                                                                case 23:
                                                                                                    i18 = 52642;
                                                                                                    continue;
                                                                                                case 54:
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                            }
                                                                                            i10 = 52735;
                                                                                            while (true) {
                                                                                                i10 ^= 52752;
                                                                                                switch (i10) {
                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                        throw th;
                                                                                                    case 1007:
                                                                                                        i10 = 52766;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                                i17 = 52549;
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            i10 = 52735;
                                                                            while (true) {
                                                                                i10 ^= 52752;
                                                                                switch (i10) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        throw th;
                                                                                    case 1007:
                                                                                        i10 = 52766;
                                                                                        break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    return;
                                                                default:
                                                                    continue;
                                                            }
                                                            i16 = 51774;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i15 = 51650;
                                            }
                                            C0135.m2604(C0455.m8871(C0029.m572(this)), C0465.m9053(m6595(), 326, C0086.f120 ^ (-888), 1895));
                                            break;
                                        default:
                                            continue;
                                    }
                                    i14 = 50875;
                                }
                                int iM9436 = C0485.m9436();
                                int i19 = 53510;
                                while (true) {
                                    i19 ^= 53527;
                                    switch (i19) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (iM9436 >= 0) {
                                                i19 = 53603;
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 83:
                                            return;
                                        case 116:
                                            System.out.println(Float.decode(C0106.m2063("iJlpriVAbh49YkV3KY")));
                                            return;
                                        default:
                                            continue;
                                    }
                                    i19 = 53572;
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                z6 z6VarM4643 = C0243.m4642(this);
                                C0040.m791(C0371.m7272(z6VarM4643));
                                Context contextM5312 = C0277.m5311(C0371.m7272(z6VarM4643));
                                synchronized (z6VarM4643) {
                                    try {
                                        boolean zM456 = C0023.m455(z6VarM4643);
                                        int i20 = 1864;
                                        while (true) {
                                            i20 ^= 1881;
                                            switch (i20) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (zM456) {
                                                        i20 = 48736;
                                                    }
                                                    break;
                                                case 47384:
                                                    e4 e4VarM7069 = C0361.m7069(z6VarM4643);
                                                    int i21 = 49666;
                                                    while (true) {
                                                        i21 ^= 49683;
                                                        switch (i21) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i21 = e4VarM7069 != null ? 49759 : 49728;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 76:
                                                                boolean zM3704 = C0193.m3704(C0361.m7069(z6VarM4643));
                                                                int i22 = 49790;
                                                                while (true) {
                                                                    i22 ^= 49807;
                                                                    switch (i22) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case 51:
                                                                            C0135.m2604(C0136.m2634(C0029.m572(C0371.m7272(z6VarM4643))), C0342.m6689(m6595(), 38, C0161.f185 ^ (-807), 519));
                                                                            i11 = 50689;
                                                                            while (true) {
                                                                                i11 ^= 50706;
                                                                                switch (i11) {
                                                                                    case 19:
                                                                                        i11 = 50720;
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        return;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 84:
                                                                            boolean zM8985 = C0462.m8985(C0361.m7069(z6VarM4643));
                                                                            int i23 = 49914;
                                                                            while (true) {
                                                                                i23 ^= 49931;
                                                                                switch (i23) {
                                                                                    case 497:
                                                                                        i23 = zM8985 ? 50658 : 50627;
                                                                                        break;
                                                                                    case 1711:
                                                                                        break;
                                                                                    case 1736:
                                                                                        break;
                                                                                    case 1769:
                                                                                        C0135.m2604(C0136.m2634(C0029.m572(C0371.m7272(z6VarM4643))), C0342.m6689(m6595(), 38, C0161.f185 ^ (-807), 519));
                                                                                        i11 = 50689;
                                                                                        while (true) {
                                                                                            i11 ^= 50706;
                                                                                            switch (i11) {
                                                                                                case 19:
                                                                                                    i11 = 50720;
                                                                                                    break;
                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                    return;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 241:
                                                                            i22 = !zM3704 ? 49883 : 49852;
                                                                            break;
                                                                        default:
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
                                                    z6VarM4643.f10618b = new e4(contextM5312, C0207.m3950(), C0029.m574(contextM5312), C0237.m4545(), C0285.f429 ^ 901, z6VarM4643, z6VarM4643, null);
                                                    C0135.m2604(C0136.m2634(C0029.m572(C0371.m7272(z6VarM4643))), C0298.m5721(m6595(), 73, C0311.f458 ^ (-161), 2329));
                                                    z6VarM4643.f10617a = true;
                                                    C0271.m5173(C0361.m7069(z6VarM4643));
                                                    C0454.m8832(C0361.m7069(z6VarM4643));
                                                    return;
                                                case 47417:
                                                    C0135.m2604(C0136.m2634(C0029.m572(C0371.m7272(z6VarM4643))), C0019.m390(m6595(), 0, C0296.f443 ^ 125, 2163));
                                                    int i24 = 48767;
                                                    while (true) {
                                                        i24 ^= 48784;
                                                        switch (i24) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                return;
                                                            case 239:
                                                                i24 = 48798;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i20 = 48705;
                                        }
                                    } catch (Throwable th2) {
                                        int i25 = 48891;
                                        while (true) {
                                            i25 ^= 48908;
                                            switch (i25) {
                                                case 22:
                                                    throw th2;
                                                case 503:
                                                    i25 = 48922;
                                                    break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i13 = 1802;
                    }
                    break;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    public final void B() {
        int iM5483;
        int i10;
        C0040.m791(this);
        C0459.m8937(this);
        z6 z6VarM4642 = C0243.m4642(this);
        e4 e4VarM7069 = C0361.m7069(z6VarM4642);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = e4VarM7069 != null ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM8985 = C0462.m8985(C0361.m7069(z6VarM4642));
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = !zM8985 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                C0071.m1459(C0361.m7069(z6VarM4642));
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean zM3704 = C0193.m3704(C0361.m7069(z6VarM4642));
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i13 = zM3704 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            C0071.m1459(C0361.m7069(z6VarM4642));
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
        }
        z6VarM4642.f10618b = null;
        try {
            C0401.m7848(C0060.m1151(), C0277.m5311(this), C0243.m4642(this));
            while (true) {
                i10 ^= 48784;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        return;
                    case 76:
                        System.out.println(C0015.m299("Ch35jPtobv"));
                        return;
                    case 239:
                        if (iM5483 <= 0) {
                            i10 = 48860;
                        }
                        break;
                    default:
                        continue;
                }
                i10 = 48829;
            }
        } catch (IllegalArgumentException | IllegalStateException e4) {
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
        }
        this.f10358d = null;
        iM5483 = C0285.m5483();
        i10 = 48767;
    }

    public final boolean C() {
        C0040.m791(this);
        C0459.m8937(this);
        y3 y3VarM2387 = C0124.m2387(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (y3VarM2387 != null) {
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

    public final boolean D() {
        C0040.m791(this);
        C0459.m8937(this);
        boolean zM3356 = C0176.m3356(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM3356) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return true;
                case 239:
                    int iM9136 = C0470.m9136(C0355.m6951(this));
                    int iM7190 = C0367.m7190((Integer) C0262.m4995(C0355.m6955(), null));
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM9136 >= iM7190) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return false;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return true;
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

    /* JADX WARN: Code restructure failed: missing block: B:37:0x002e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x002e, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0036. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E() {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.s6.E():void");
    }

    public final void F() {
        o8.c cVarM9229 = null;
        Object objM4995 = null;
        e6.b bVar = null;
        long jM3820 = 0;
        x3 x3VarM3256 = null;
        Long l10 = null;
        long jM9543 = 0;
        t6 t6VarM3476 = null;
        String str = "۠ۥۤ";
        e6.c cVar = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56537:
                    str = "ۥۦۦ";
                    t6VarM3476 = C0182.m3476(this);
                    break;
                case 1746721:
                    str = "ۥۧ۠";
                    cVarM9229 = C0474.m9229(this);
                    break;
                case 1746880:
                    cVarM9229.f12666b = jM3820;
                    str = "ۡ۟۟";
                    break;
                case 1747839:
                    C0040.m791(this);
                    str = "۟۠ۢ";
                    break;
                case 1748609:
                    str = "ۧ۠ۥ";
                    x3VarM3256 = C0170.m3256();
                    break;
                case 1751742:
                    str = "ۨۡۢ";
                    l10 = (Long) objM4995;
                    break;
                case 1751745:
                    return;
                case 1752579:
                    str = "۠ۤ۟";
                    cVar = (e6.c) bVar;
                    break;
                case 1752674:
                    jM3820 = C0199.m3820();
                    str = "۟ۥۦ";
                    break;
                case 1752677:
                    C0259.m4929(t6VarM3476, jM9543);
                    str = "ۤۧۤ";
                    break;
                case 1752702:
                    objM4995 = C0031.m601(cVarM9229);
                    str = "ۦۤ۠";
                    break;
                case 1753570:
                    str = "ۥۣۡ";
                    bVar = (e6.b) objM4995;
                    break;
                case 1754412:
                    objM4995 = C0262.m4995(x3VarM3256, null);
                    str = "ۤۧۡ";
                    break;
                case 1755401:
                    jM9543 = C0491.m9543(l10);
                    str = "ۧ۠";
                    break;
                default:
                    C0014.m280(cVar);
                    str = "ۥۦۣ";
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:248:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x00da A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x033a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0341 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0354 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x035e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x034c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x037c A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x0393 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x039d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x0395 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x028a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x02dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x02df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x032e A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x019c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:180:0x0350. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0071. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x008a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:60:0x00ef. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:87:0x016f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:95:0x0185. Please report as an issue. */
    public final boolean G() {
        Boolean boolM192;
        int iM6834;
        int i10;
        int iM3940;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        int i15;
        int iM9136;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean zM8120;
        int i30;
        int i31;
        int i32;
        C0040.m791(this);
        C0459.m8937(this);
        Boolean boolM905 = C0047.m905(this);
        int i33 = 1616;
        while (true) {
            i33 ^= 1633;
            switch (i33) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (boolM905 == null) {
                        i33 = 1709;
                    }
                    break;
                case 204:
                    C0040.m791(this);
                    C0459.m8937(this);
                    l4 l4VarM6640 = C0339.m6640(this);
                    C0224.m4302(l4VarM6640);
                    SharedPreferences sharedPreferencesM7082 = C0362.m7082(l4VarM6640);
                    String strM4437 = C0231.m4437(m6595(), 522, C0443.f713 ^ (-110), 1374);
                    boolean zM8463 = C0433.m8463(sharedPreferencesM7082, strM4437);
                    int i34 = 1740;
                    while (true) {
                        i34 ^= 1757;
                        switch (i34) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM8463) {
                                    i34 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                boolM192 = C0009.m192(C0146.m2784(C0362.m7082(l4VarM6640), strM4437, false));
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolM192 = null;
                                int i35 = 1864;
                                while (true) {
                                    i35 ^= 1881;
                                    switch (i35) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i35 = 48674;
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i34 = 1802;
                    }
                    int i36 = 48767;
                    while (true) {
                        i36 ^= 48784;
                        switch (i36) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                z3 z3VarM8874 = C0455.m8874(this);
                                C0459.m8937(z3VarM8874);
                                iM6834 = C0350.m6834(z3VarM8874);
                                i10 = 49790;
                                while (true) {
                                    i10 ^= 49807;
                                    switch (i10) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 51:
                                            C0135.m2604(C0136.m2634(C0029.m572(this)), C0407.m7983(m6595(), 533, C0205.f229 ^ 432, 1880));
                                            iM3940 = C0206.m3940(C0237.m4545(), C0277.m5311(C0355.m6951(this)), 12450950 ^ C0044.f64);
                                            i11 = 50689;
                                            while (true) {
                                                i11 ^= 50706;
                                                switch (i11) {
                                                    case 19:
                                                        i11 = iM3940 != 0 ? 50782 : 50751;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        C0135.m2604(C0136.m2634(C0029.m572(this)), C0242.m4619(m6595(), 678, C0108.f134 ^ (-85), 1355));
                                                        i12 = 56579;
                                                        while (true) {
                                                            i12 ^= 56596;
                                                            switch (i12) {
                                                                case 23:
                                                                    i12 = 56610;
                                                                    continue;
                                                                    continue;
                                                                case 54:
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                            }
                                                            i32 = 49914;
                                                            while (true) {
                                                                i32 ^= 49931;
                                                                switch (i32) {
                                                                    case 497:
                                                                        i32 = 50596;
                                                                        break;
                                                                    case 1711:
                                                                        z10 = true;
                                                                        z11 = true;
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        i13 = 50813;
                                                        while (true) {
                                                            i13 ^= 50830;
                                                            switch (i13) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 53:
                                                                    C0135.m2604(C0136.m2634(C0029.m572(this)), C0108.m2094(m6595(), 663, C0221.f300 ^ (-116), 1644));
                                                                    i14 = 56455;
                                                                    while (true) {
                                                                        i14 ^= 56472;
                                                                        switch (i14) {
                                                                            case 31:
                                                                                i14 = 56486;
                                                                                continue;
                                                                                continue;
                                                                            case 62:
                                                                                z10 = false;
                                                                                z11 = true;
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 243:
                                                                    i13 = iM3940 != 1 ? 51557 : 50875;
                                                                    break;
                                                                case 4075:
                                                                    i15 = 51588;
                                                                    while (true) {
                                                                        i15 ^= 51605;
                                                                        switch (i15) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i15 = iM3940 != 2 ? 51681 : 51650;
                                                                                break;
                                                                            case 54:
                                                                                break;
                                                                            case 87:
                                                                                C0135.m2604(C0466.m9073(C0029.m572(this)), C0371.m7267(m6595(), 634, C0319.f466 ^ 178, 1330));
                                                                                iM9136 = C0470.m9136(C0355.m6951(this));
                                                                                i16 = 54533;
                                                                                while (true) {
                                                                                    i16 ^= 54550;
                                                                                    switch (i16) {
                                                                                        case 19:
                                                                                            i16 = iM9136 < 17443 ? 54626 : 54595;
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            break;
                                                                                        case 85:
                                                                                            i17 = 55432;
                                                                                            while (true) {
                                                                                                i17 ^= 55449;
                                                                                                switch (i17) {
                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        i17 = boolM192 == null ? 55525 : 55494;
                                                                                                        break;
                                                                                                    case 62:
                                                                                                        break;
                                                                                                    case 95:
                                                                                                        z10 = false;
                                                                                                        break;
                                                                                                    case 124:
                                                                                                        i19 = 55556;
                                                                                                        while (true) {
                                                                                                            i19 ^= 55573;
                                                                                                            switch (i19) {
                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                    i19 = 55587;
                                                                                                                    break;
                                                                                                                case 54:
                                                                                                                    z10 = true;
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
                                                                                            i18 = 55680;
                                                                                            while (true) {
                                                                                                i18 ^= 55697;
                                                                                                switch (i18) {
                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        i18 = 56362;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    case 1467:
                                                                                                        z11 = false;
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 116:
                                                                                            i20 = 54657;
                                                                                            while (true) {
                                                                                                i20 ^= 54674;
                                                                                                switch (i20) {
                                                                                                    case 19:
                                                                                                        i20 = 54688;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                        z10 = false;
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
                                                                                break;
                                                                            case 116:
                                                                                i21 = 51712;
                                                                                while (true) {
                                                                                    i21 ^= 51729;
                                                                                    switch (i21) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i21 = iM3940 != 3 ? 51805 : 51774;
                                                                                            break;
                                                                                        case 47:
                                                                                            C0135.m2604(C0331.m6385(C0029.m572(this)), C0102.m1999(m6595(), 618, C0043.f63 ^ 838, 2456));
                                                                                            i22 = 53758;
                                                                                            while (true) {
                                                                                                i22 ^= 53775;
                                                                                                switch (i22) {
                                                                                                    case 1009:
                                                                                                        i22 = 54440;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    case 1703:
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                                i23 = 52735;
                                                                                                while (true) {
                                                                                                    i23 ^= 52752;
                                                                                                    switch (i23) {
                                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                                            z10 = false;
                                                                                                            z11 = false;
                                                                                                            break;
                                                                                                        case 1007:
                                                                                                            i23 = 52766;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
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
                                                                                        case 76:
                                                                                            i24 = 51836;
                                                                                            while (true) {
                                                                                                i24 ^= 51853;
                                                                                                switch (i24) {
                                                                                                    case 241:
                                                                                                        i24 = iM3940 != 9 ? 52580 : 52549;
                                                                                                        break;
                                                                                                    case 1963:
                                                                                                        break;
                                                                                                    case 1992:
                                                                                                        C0135.m2604(C0331.m6385(C0029.m572(this)), C0229.m4396(m6595(), 603, C0190.f214 ^ (-44), 1285));
                                                                                                        i25 = 53634;
                                                                                                        while (true) {
                                                                                                            i25 ^= 53651;
                                                                                                            switch (i25) {
                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                    i25 = 53665;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                            }
                                                                                                            i23 = 52735;
                                                                                                            while (true) {
                                                                                                                i23 ^= 52752;
                                                                                                                switch (i23) {
                                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                                        z10 = false;
                                                                                                                        z11 = false;
                                                                                                                        break;
                                                                                                                    case 1007:
                                                                                                                        i23 = 52766;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
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
                                                                                                    case 2025:
                                                                                                        i26 = 52611;
                                                                                                        while (true) {
                                                                                                            i26 ^= 52628;
                                                                                                            switch (i26) {
                                                                                                                case 23:
                                                                                                                    i26 = iM3940 != 18 ? 52704 : 52673;
                                                                                                                    break;
                                                                                                                case 54:
                                                                                                                    break;
                                                                                                                case 85:
                                                                                                                    C0135.m2604(C0331.m6385(C0029.m572(this)), C0161.m3082(m6595(), 587, C0147.f172 ^ 959, 2932));
                                                                                                                    i27 = 53510;
                                                                                                                    while (true) {
                                                                                                                        i27 ^= 53527;
                                                                                                                        switch (i27) {
                                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                i27 = 53541;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                        }
                                                                                                                        i32 = 49914;
                                                                                                                        while (true) {
                                                                                                                            i32 ^= 49931;
                                                                                                                            switch (i32) {
                                                                                                                                case 497:
                                                                                                                                    i32 = 50596;
                                                                                                                                    break;
                                                                                                                                case 1711:
                                                                                                                                    z10 = true;
                                                                                                                                    z11 = true;
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 116:
                                                                                                                    C0420.m8245(C0331.m6385(C0029.m572(this)), C0175.m3335(m6595(), 562, C0470.f740 ^ 210, 851), C0057.m1083(iM3940));
                                                                                                                    i23 = 52735;
                                                                                                                    while (true) {
                                                                                                                        i23 ^= 52752;
                                                                                                                        switch (i23) {
                                                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                                                z10 = false;
                                                                                                                                z11 = false;
                                                                                                                                break;
                                                                                                                            case 1007:
                                                                                                                                i23 = 52766;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
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
                                        case 84:
                                            i32 = 49914;
                                            while (true) {
                                                i32 ^= 49931;
                                                switch (i32) {
                                                    case 497:
                                                        i32 = 50596;
                                                        break;
                                                    case 1711:
                                                        z10 = true;
                                                        z11 = true;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 241:
                                            i10 = iM6834 == 1 ? 49883 : 49852;
                                            break;
                                        default:
                                            break;
                                    }
                                    i28 = 1507503;
                                    while (true) {
                                        i28 ^= 1507520;
                                        switch (i28) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                i29 = 1508526;
                                                while (true) {
                                                    i29 ^= 1508543;
                                                    switch (i29) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (z11) {
                                                                i29 = 1508619;
                                                            }
                                                            break;
                                                        case 83:
                                                            break;
                                                        case 114:
                                                            break;
                                                        case 436:
                                                            l4 l4VarM6641 = C0339.m6640(this);
                                                            C0224.m4302(l4VarM6641);
                                                            SharedPreferences.Editor editorM3199 = C0167.m3199(C0362.m7082(l4VarM6641));
                                                            C0483.m9390(editorM3199, strM4437, z10);
                                                            C0334.m6480(editorM3199);
                                                            break;
                                                        default:
                                                            continue;
                                                            continue;
                                                            continue;
                                                            continue;
                                                    }
                                                    i29 = 1508588;
                                                }
                                                break;
                                            case 111:
                                                i28 = !z10 ? 1507596 : 1507565;
                                                break;
                                            case 460:
                                                zM8120 = C0414.m8120(C0091.m1951(this));
                                                i30 = 1507627;
                                                while (true) {
                                                    i30 ^= 1507644;
                                                    switch (i30) {
                                                        case 23:
                                                            i30 = zM8120 ? 1507720 : 1507689;
                                                            break;
                                                        case 85:
                                                            i29 = 1508526;
                                                            while (true) {
                                                                i29 ^= 1508543;
                                                                switch (i29) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (z11) {
                                                                            i29 = 1508619;
                                                                        }
                                                                        break;
                                                                    case 83:
                                                                        break;
                                                                    case 114:
                                                                        break;
                                                                    case 436:
                                                                        l4 l4VarM6642 = C0339.m6640(this);
                                                                        C0224.m4302(l4VarM6642);
                                                                        SharedPreferences.Editor editorM31910 = C0167.m3199(C0362.m7082(l4VarM6642));
                                                                        C0483.m9390(editorM31910, strM4437, z10);
                                                                        C0334.m6480(editorM31910);
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                                i29 = 1508588;
                                                            }
                                                            break;
                                                        case 118:
                                                            break;
                                                        case 180:
                                                            C0135.m2604(C0455.m8871(C0029.m572(this)), C0433.m8458(m6595(), 695, C0110.f136 ^ 485, 1316));
                                                            i31 = 1507751;
                                                            while (true) {
                                                                i31 ^= 1507768;
                                                                switch (i31) {
                                                                    case 31:
                                                                        i31 = 1508433;
                                                                        break;
                                                                    case 1513:
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
                                }
                                break;
                            case 76:
                                boolean zM14 = C0000.m14(boolM192);
                                int i37 = 48891;
                                while (true) {
                                    i37 ^= 48908;
                                    switch (i37) {
                                        case 22:
                                            break;
                                        case 53:
                                            z3 z3VarM8875 = C0455.m8874(this);
                                            C0459.m8937(z3VarM8875);
                                            iM6834 = C0350.m6834(z3VarM8875);
                                            i10 = 49790;
                                            while (true) {
                                                i10 ^= 49807;
                                                switch (i10) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        C0135.m2604(C0136.m2634(C0029.m572(this)), C0407.m7983(m6595(), 533, C0205.f229 ^ 432, 1880));
                                                        iM3940 = C0206.m3940(C0237.m4545(), C0277.m5311(C0355.m6951(this)), 12450950 ^ C0044.f64);
                                                        i11 = 50689;
                                                        while (true) {
                                                            i11 ^= 50706;
                                                            switch (i11) {
                                                                case 19:
                                                                    if (iM3940 != 0) {
                                                                    }
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    C0135.m2604(C0136.m2634(C0029.m572(this)), C0242.m4619(m6595(), 678, C0108.f134 ^ (-85), 1355));
                                                                    i12 = 56579;
                                                                    while (true) {
                                                                        i12 ^= 56596;
                                                                        switch (i12) {
                                                                            case 23:
                                                                                i12 = 56610;
                                                                                continue;
                                                                                continue;
                                                                            case 54:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                        i32 = 49914;
                                                                        while (true) {
                                                                            i32 ^= 49931;
                                                                            switch (i32) {
                                                                                case 497:
                                                                                    i32 = 50596;
                                                                                    break;
                                                                                case 1711:
                                                                                    z10 = true;
                                                                                    z11 = true;
                                                                                    break;
                                                                            }
                                                                        }
                                                                    }
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    i13 = 50813;
                                                                    while (true) {
                                                                        i13 ^= 50830;
                                                                        switch (i13) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 53:
                                                                                C0135.m2604(C0136.m2634(C0029.m572(this)), C0108.m2094(m6595(), 663, C0221.f300 ^ (-116), 1644));
                                                                                i14 = 56455;
                                                                                while (true) {
                                                                                    i14 ^= 56472;
                                                                                    switch (i14) {
                                                                                        case 31:
                                                                                            i14 = 56486;
                                                                                            continue;
                                                                                            continue;
                                                                                        case 62:
                                                                                            z10 = false;
                                                                                            z11 = true;
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 243:
                                                                                if (iM3940 != 1) {
                                                                                }
                                                                                break;
                                                                            case 4075:
                                                                                i15 = 51588;
                                                                                while (true) {
                                                                                    i15 ^= 51605;
                                                                                    switch (i15) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            if (iM3940 != 2) {
                                                                                            }
                                                                                            break;
                                                                                        case 54:
                                                                                            break;
                                                                                        case 87:
                                                                                            C0135.m2604(C0466.m9073(C0029.m572(this)), C0371.m7267(m6595(), 634, C0319.f466 ^ 178, 1330));
                                                                                            iM9136 = C0470.m9136(C0355.m6951(this));
                                                                                            i16 = 54533;
                                                                                            while (true) {
                                                                                                i16 ^= 54550;
                                                                                                switch (i16) {
                                                                                                    case 19:
                                                                                                        if (iM9136 < 17443) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                        break;
                                                                                                    case 85:
                                                                                                        i17 = 55432;
                                                                                                        while (true) {
                                                                                                            i17 ^= 55449;
                                                                                                            switch (i17) {
                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                    if (boolM192 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 62:
                                                                                                                    break;
                                                                                                                case 95:
                                                                                                                    z10 = false;
                                                                                                                    break;
                                                                                                                case 124:
                                                                                                                    i19 = 55556;
                                                                                                                    while (true) {
                                                                                                                        i19 ^= 55573;
                                                                                                                        switch (i19) {
                                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                i19 = 55587;
                                                                                                                                break;
                                                                                                                            case 54:
                                                                                                                                z10 = true;
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
                                                                                                        i18 = 55680;
                                                                                                        while (true) {
                                                                                                            i18 ^= 55697;
                                                                                                            switch (i18) {
                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                    i18 = 56362;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                case 1467:
                                                                                                                    z11 = false;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    case 116:
                                                                                                        i20 = 54657;
                                                                                                        while (true) {
                                                                                                            i20 ^= 54674;
                                                                                                            switch (i20) {
                                                                                                                case 19:
                                                                                                                    i20 = 54688;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                    z10 = false;
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
                                                                                            break;
                                                                                        case 116:
                                                                                            i21 = 51712;
                                                                                            while (true) {
                                                                                                i21 ^= 51729;
                                                                                                switch (i21) {
                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                        break;
                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        if (iM3940 != 3) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 47:
                                                                                                        C0135.m2604(C0331.m6385(C0029.m572(this)), C0102.m1999(m6595(), 618, C0043.f63 ^ 838, 2456));
                                                                                                        i22 = 53758;
                                                                                                        while (true) {
                                                                                                            i22 ^= 53775;
                                                                                                            switch (i22) {
                                                                                                                case 1009:
                                                                                                                    i22 = 54440;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                case 1703:
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                            }
                                                                                                            i23 = 52735;
                                                                                                            while (true) {
                                                                                                                i23 ^= 52752;
                                                                                                                switch (i23) {
                                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                                        z10 = false;
                                                                                                                        z11 = false;
                                                                                                                        break;
                                                                                                                    case 1007:
                                                                                                                        i23 = 52766;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
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
                                                                                                    case 76:
                                                                                                        i24 = 51836;
                                                                                                        while (true) {
                                                                                                            i24 ^= 51853;
                                                                                                            switch (i24) {
                                                                                                                case 241:
                                                                                                                    if (iM3940 != 9) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 1963:
                                                                                                                    break;
                                                                                                                case 1992:
                                                                                                                    C0135.m2604(C0331.m6385(C0029.m572(this)), C0229.m4396(m6595(), 603, C0190.f214 ^ (-44), 1285));
                                                                                                                    i25 = 53634;
                                                                                                                    while (true) {
                                                                                                                        i25 ^= 53651;
                                                                                                                        switch (i25) {
                                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                i25 = 53665;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                        }
                                                                                                                        i23 = 52735;
                                                                                                                        while (true) {
                                                                                                                            i23 ^= 52752;
                                                                                                                            switch (i23) {
                                                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                                                    z10 = false;
                                                                                                                                    z11 = false;
                                                                                                                                    break;
                                                                                                                                case 1007:
                                                                                                                                    i23 = 52766;
                                                                                                                                    continue;
                                                                                                                                    continue;
                                                                                                                                    continue;
                                                                                                                                    continue;
                                                                                                                                    continue;
                                                                                                                                    continue;
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
                                                                                                                case 2025:
                                                                                                                    i26 = 52611;
                                                                                                                    while (true) {
                                                                                                                        i26 ^= 52628;
                                                                                                                        switch (i26) {
                                                                                                                            case 23:
                                                                                                                                if (iM3940 != 18) {
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 54:
                                                                                                                                break;
                                                                                                                            case 85:
                                                                                                                                C0135.m2604(C0331.m6385(C0029.m572(this)), C0161.m3082(m6595(), 587, C0147.f172 ^ 959, 2932));
                                                                                                                                i27 = 53510;
                                                                                                                                while (true) {
                                                                                                                                    i27 ^= 53527;
                                                                                                                                    switch (i27) {
                                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                            i27 = 53541;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                    }
                                                                                                                                    i32 = 49914;
                                                                                                                                    while (true) {
                                                                                                                                        i32 ^= 49931;
                                                                                                                                        switch (i32) {
                                                                                                                                            case 497:
                                                                                                                                                i32 = 50596;
                                                                                                                                                break;
                                                                                                                                            case 1711:
                                                                                                                                                z10 = true;
                                                                                                                                                z11 = true;
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 116:
                                                                                                                                C0420.m8245(C0331.m6385(C0029.m572(this)), C0175.m3335(m6595(), 562, C0470.f740 ^ 210, 851), C0057.m1083(iM3940));
                                                                                                                                i23 = 52735;
                                                                                                                                while (true) {
                                                                                                                                    i23 ^= 52752;
                                                                                                                                    switch (i23) {
                                                                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                                                                            z10 = false;
                                                                                                                                            z11 = false;
                                                                                                                                            break;
                                                                                                                                        case 1007:
                                                                                                                                            i23 = 52766;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
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
                                                    case 84:
                                                        i32 = 49914;
                                                        while (true) {
                                                            i32 ^= 49931;
                                                            switch (i32) {
                                                                case 497:
                                                                    i32 = 50596;
                                                                    break;
                                                                case 1711:
                                                                    z10 = true;
                                                                    z11 = true;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 241:
                                                        if (iM6834 == 1) {
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                i28 = 1507503;
                                                while (true) {
                                                    i28 ^= 1507520;
                                                    switch (i28) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            i29 = 1508526;
                                                            while (true) {
                                                                i29 ^= 1508543;
                                                                switch (i29) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (z11) {
                                                                            i29 = 1508619;
                                                                        }
                                                                        break;
                                                                    case 83:
                                                                        break;
                                                                    case 114:
                                                                        break;
                                                                    case 436:
                                                                        l4 l4VarM6643 = C0339.m6640(this);
                                                                        C0224.m4302(l4VarM6643);
                                                                        SharedPreferences.Editor editorM31911 = C0167.m3199(C0362.m7082(l4VarM6643));
                                                                        C0483.m9390(editorM31911, strM4437, z10);
                                                                        C0334.m6480(editorM31911);
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                                i29 = 1508588;
                                                            }
                                                            break;
                                                        case 111:
                                                            if (!z10) {
                                                            }
                                                            break;
                                                        case 460:
                                                            zM8120 = C0414.m8120(C0091.m1951(this));
                                                            i30 = 1507627;
                                                            while (true) {
                                                                i30 ^= 1507644;
                                                                switch (i30) {
                                                                    case 23:
                                                                        if (zM8120) {
                                                                        }
                                                                        break;
                                                                    case 85:
                                                                        i29 = 1508526;
                                                                        while (true) {
                                                                            i29 ^= 1508543;
                                                                            switch (i29) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    if (z11) {
                                                                                        i29 = 1508619;
                                                                                    }
                                                                                    break;
                                                                                case 83:
                                                                                    break;
                                                                                case 114:
                                                                                    break;
                                                                                case 436:
                                                                                    l4 l4VarM6644 = C0339.m6640(this);
                                                                                    C0224.m4302(l4VarM6644);
                                                                                    SharedPreferences.Editor editorM31912 = C0167.m3199(C0362.m7082(l4VarM6644));
                                                                                    C0483.m9390(editorM31912, strM4437, z10);
                                                                                    C0334.m6480(editorM31912);
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                            i29 = 1508588;
                                                                        }
                                                                        break;
                                                                    case 118:
                                                                        break;
                                                                    case 180:
                                                                        C0135.m2604(C0455.m8871(C0029.m572(this)), C0433.m8458(m6595(), 695, C0110.f136 ^ 485, 1316));
                                                                        i31 = 1507751;
                                                                        while (true) {
                                                                            i31 ^= 1507768;
                                                                            switch (i31) {
                                                                                case 31:
                                                                                    i31 = 1508433;
                                                                                    break;
                                                                                case 1513:
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
                                            }
                                            break;
                                        case 503:
                                            i37 = zM14 ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            int i38 = 49666;
                                            while (true) {
                                                i38 ^= 49683;
                                                switch (i38) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i38 = 49697;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        z10 = true;
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
                                i36 = boolM192 != null ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                        this.f10359e = C0009.m192(z10);
                        break;
                    }
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i33 = 1678;
        }
        return C0000.m14(C0047.m905(this));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:1012:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1013:0x056c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1015:0x0564 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1084:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1085:0x041a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1087:0x0412 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1100:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1101:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1103:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1130:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1131:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1133:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x0570 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x05d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x0528 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x0337 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:0x044e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x032f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x04b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x048d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:940:0x08da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:941:0x0905 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:943:0x08d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:964:0x0557 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:965:0x055d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:966:0x0561 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:967:0x055d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:968:0x0559 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:970:0x054f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:973:0x05bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:974:0x05c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:975:0x05c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:976:0x05c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:977:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:979:0x05b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:982:0x0610 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:983:0x0614 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:985:0x0608 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:992:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:993:0x05d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:995:0x05c8 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final x7 H(boolean z10) {
        String str;
        String strM8581;
        int iM4627;
        int i10;
        Class clsM725;
        int i11;
        int i12;
        Object objM2245;
        int i13;
        int i14;
        String str2;
        int i15;
        String str3;
        boolean z11;
        Boolean boolM192;
        int i16;
        String strM4764;
        boolean zM14;
        long j10;
        int i17;
        long jM3444;
        int iM7223;
        int iM9539;
        int i18;
        int i19;
        int i20;
        long jM6486;
        Pair pairM3856;
        String strM2490;
        int i21;
        int i22;
        z3 z3VarM8874 = C0455.m8874(this);
        int i23 = 1616;
        while (true) {
            i23 ^= 1633;
            switch (i23) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i23 = z10 ? 1709 : 1678;
                    break;
                case 204:
                    d4 d4VarM572 = C0029.m572(this);
                    o4 o4VarM1354 = C0070.m1354(C0339.m6640(d4VarM572));
                    int i24 = 1740;
                    while (true) {
                        i24 ^= 1757;
                        switch (i24) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i24 = o4VarM1354 == null ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                o4 o4VarM1355 = C0070.m1354(C0339.m6640(d4VarM572));
                                l4 l4VarM2361 = C0123.m2361(o4VarM1355);
                                C0224.m4302(l4VarM2361);
                                C0224.m4302(l4VarM2361);
                                long jM4711 = C0246.m4711(C0362.m7082(C0123.m2361(o4VarM1355)), C0451.m8789(o4VarM1355), 0L);
                                int i25 = 48767;
                                while (true) {
                                    i25 ^= 48784;
                                    switch (i25) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            C0014.m280((e6.c) C0166.m3176(l4VarM2361));
                                            jM6486 = C0335.m6486(((11 + jM4711) - C0402.m7869()) - 11);
                                            break;
                                        case 76:
                                            C0249.m4765(o4VarM1355);
                                            jM6486 = 0;
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
                                            i25 = jM4711 == 0 ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                long jM8324 = C0425.m8324(o4VarM1355);
                                int i27 = 49666;
                                while (true) {
                                    i27 ^= 49683;
                                    switch (i27) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i27 = jM6486 < jM8324 ? 49759 : 49728;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            pairM3856 = null;
                                            i21 = 49790;
                                            while (true) {
                                                i21 ^= 49807;
                                                switch (i21) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 241:
                                                        i21 = 49821;
                                                        continue;
                                                        continue;
                                                    default:
                                                        continue;
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 83:
                                            int i28 = 49914;
                                            while (true) {
                                                i28 ^= 49931;
                                                switch (i28) {
                                                    case 497:
                                                        i28 = jM6486 > (jM8324 << 1) ? 50658 : 50627;
                                                        break;
                                                    case 1711:
                                                        break;
                                                    case 1736:
                                                        String strM595 = C0031.m595(C0362.m7082(l4VarM2361), C0459.m8925(o4VarM1355), null);
                                                        long jM4712 = C0246.m4711(C0362.m7082(l4VarM2361), C0276.m5298(o4VarM1355), 0L);
                                                        C0249.m4765(o4VarM1355);
                                                        int i29 = 50813;
                                                        while (true) {
                                                            i29 ^= 50830;
                                                            switch (i29) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 53:
                                                                    pairM3856 = C0201.m3856();
                                                                    break;
                                                                case 243:
                                                                    i29 = strM595 != null ? 51557 : 50875;
                                                                    break;
                                                                case 4075:
                                                                    int i30 = 51588;
                                                                    while (true) {
                                                                        i30 ^= 51605;
                                                                        switch (i30) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i30 = jM4712 <= 0 ? 51681 : 51650;
                                                                                break;
                                                                            case 54:
                                                                                break;
                                                                            case 87:
                                                                                pairM3856 = new Pair(strM595, C0439.m8554(jM4712));
                                                                                int i31 = 51836;
                                                                                while (true) {
                                                                                    i31 ^= 51853;
                                                                                    switch (i31) {
                                                                                        case 241:
                                                                                            i31 = 52518;
                                                                                            continue;
                                                                                        case 1963:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 116:
                                                                                int i32 = 51712;
                                                                                while (true) {
                                                                                    i32 ^= 51729;
                                                                                    switch (i32) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case 15:
                                                                                        case Code.UNAUTHENTICATED /* 16 */:
                                                                                        default:
                                                                                            continue;
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i32 = 51743;
                                                                                            continue;
                                                                                    }
                                                                                    pairM3856 = C0201.m3856();
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
                                                        break;
                                                    case 1769:
                                                        C0249.m4765(o4VarM1355);
                                                        int i33 = 50689;
                                                        while (true) {
                                                            i33 ^= 50706;
                                                            switch (i33) {
                                                                case 19:
                                                                    i33 = 50720;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            pairM3856 = null;
                                                            i21 = 49790;
                                                            while (true) {
                                                                i21 ^= 49807;
                                                                switch (i21) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 241:
                                                                        i21 = 49821;
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
                                        default:
                                            break;
                                    }
                                    int i34 = 52611;
                                    while (true) {
                                        i34 ^= 52628;
                                        switch (i34) {
                                            case 23:
                                                i34 = pairM3856 != null ? 52704 : 52673;
                                                break;
                                            case 54:
                                                break;
                                            case 85:
                                                strM2490 = null;
                                                i22 = 1864;
                                                while (true) {
                                                    i22 ^= 1881;
                                                    switch (i22) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i22 = 48674;
                                                            continue;
                                                            continue;
                                                            continue;
                                                        case 47483:
                                                            break;
                                                        default:
                                                            continue;
                                                            continue;
                                                            continue;
                                                    }
                                                }
                                                break;
                                            case 116:
                                                Pair pairM3857 = C0201.m3856();
                                                int i35 = 52735;
                                                while (true) {
                                                    i35 ^= 52752;
                                                    switch (i35) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            strM2490 = C0129.m2490(C0251.m4789(C0057.m1086(pairM3856)), C0070.m1360(m6595(), 757, 1, 1158), (String) C0072.m1560(pairM3856));
                                                            break;
                                                        case 1007:
                                                            i35 = pairM3856 == pairM3857 ? 53479 : 52797;
                                                            break;
                                                        case 7927:
                                                            int i36 = 53510;
                                                            while (true) {
                                                                i36 ^= 53527;
                                                                switch (i36) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i36 = 53541;
                                                                        continue;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                                strM2490 = null;
                                                                i22 = 1864;
                                                                while (true) {
                                                                    i22 ^= 1881;
                                                                    switch (i22) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i22 = 48674;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        case 47483:
                                                                            break;
                                                                        default:
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
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                strM2490 = null;
                                i22 = 1864;
                                while (true) {
                                    i22 ^= 1881;
                                    switch (i22) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i22 = 48674;
                                            continue;
                                            continue;
                                            continue;
                                        case 47483:
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
                        int i37 = 53634;
                        while (true) {
                            i37 ^= 53651;
                            switch (i37) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i37 = 53665;
                                    continue;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    str = strM2490;
                                    break;
                                default:
                                    continue;
                            }
                        }
                    }
                    break;
                case 239:
                    str = null;
                    break;
                default:
                    break;
            }
        }
        C0040.m791(z3VarM8874);
        s5 s5VarM1685 = C0078.m1685(C0339.m6640(z3VarM8874));
        boolean zM2823 = C0147.m2823();
        int i38 = 53758;
        while (true) {
            i38 ^= 53775;
            switch (i38) {
                case 1009:
                    i38 = zM2823 ? 54502 : 54471;
                    break;
                case 1703:
                    break;
                case 1736:
                    strM8581 = C0440.m8581();
                    iM4627 = 100;
                    i10 = 55432;
                    while (true) {
                        i10 ^= 55449;
                        switch (i10) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i10 = 55463;
                                continue;
                                continue;
                            case 62:
                                break;
                            default:
                                continue;
                                continue;
                        }
                    }
                    break;
                case 1769:
                    boolean zM3575 = C0187.m3575(C0091.m1951(z3VarM8874), null, C0454.m8848());
                    int i39 = 54533;
                    while (true) {
                        i39 ^= 54550;
                        switch (i39) {
                            case 19:
                                i39 = zM3575 ? 54626 : 54595;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 85:
                                strM8581 = C0440.m8581();
                                iM4627 = 100;
                                i10 = 55432;
                                while (true) {
                                    i10 ^= 55449;
                                    switch (i10) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i10 = 55463;
                                            continue;
                                            continue;
                                        case 62:
                                            break;
                                        default:
                                            continue;
                                            continue;
                                    }
                                }
                                break;
                            case 116:
                                l4 l4VarM6640 = C0339.m6640(z3VarM8874);
                                C0224.m4302(l4VarM6640);
                                strM8581 = C0362.m7096(C0013.m259(C0031.m595(C0362.m7082(l4VarM6640), C0083.m1776(m6595(), 758, C0164.f188 ^ 393, 1259), null)));
                                iM4627 = C0242.m4627(s5VarM1685);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
            int i40 = 54657;
            while (true) {
                i40 ^= 54674;
                switch (i40) {
                    case 19:
                        i40 = 54688;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        String strM5048 = C0265.m5048(z3VarM8874);
                        String strM9122 = C0469.m9122(z3VarM8874);
                        C0459.m8937(z3VarM8874);
                        String strM2306 = C0119.m2306(z3VarM8874);
                        C0459.m8937(z3VarM8874);
                        long jM2436 = C0126.m2436(z3VarM8874);
                        C0459.m8937(z3VarM8874);
                        C0271.m5173(C0009.m187(z3VarM8874));
                        String strM187 = C0009.m187(z3VarM8874);
                        C0459.m8937(z3VarM8874);
                        C0040.m791(z3VarM8874);
                        long jM7010 = C0358.m7010(z3VarM8874);
                        Object objM3121 = C0163.m3121(z3VarM8874);
                        int i41 = 55556;
                        while (true) {
                            i41 ^= 55573;
                            switch (i41) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i41 = jM7010 == 0 ? 55649 : 55618;
                                    break;
                                case 54:
                                    break;
                                case 87:
                                    break;
                                case 116:
                                    u7 u7VarM9185 = C0472.m9185((f5) objM3121);
                                    C0237.m4550(u7VarM9185);
                                    Context contextM5311 = C0277.m5311(z3VarM8874);
                                    String strM8680 = C0446.m8680(C0277.m5311(z3VarM8874));
                                    C0224.m4302(u7VarM9185);
                                    C0271.m5173(contextM5311);
                                    C0282.m5438(strM8680);
                                    PackageManager packageManagerM8279 = C0422.m8279(contextM5311);
                                    MessageDigest messageDigestM7212 = C0368.m7212();
                                    long jM4861 = -1;
                                    int i42 = 55680;
                                    while (true) {
                                        i42 ^= 55697;
                                        switch (i42) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i42 = messageDigestM7212 == null ? 56424 : 56393;
                                                break;
                                            case 1467:
                                                break;
                                            case 1496:
                                                int i43 = 56579;
                                                while (true) {
                                                    i43 ^= 56596;
                                                    switch (i43) {
                                                        case 23:
                                                            i43 = packageManagerM8279 != null ? 1507472 : 56641;
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 85:
                                                            jM4861 = 0;
                                                            break;
                                                        case 1564036:
                                                            try {
                                                                boolean zM7539 = C0385.m7539(u7VarM9185, contextM5311, strM8680);
                                                                int i44 = 1507503;
                                                                while (true) {
                                                                    i44 ^= 1507520;
                                                                    switch (i44) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            jM4861 = 0;
                                                                            int i45 = 1509549;
                                                                            while (true) {
                                                                                i45 ^= 1509566;
                                                                                switch (i45) {
                                                                                    case 19:
                                                                                        i45 = 1509580;
                                                                                        continue;
                                                                                    case 114:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                                i20 = 56455;
                                                                                while (true) {
                                                                                    i20 ^= 56472;
                                                                                    switch (i20) {
                                                                                        case 31:
                                                                                            i20 = 56486;
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
                                                                            }
                                                                            break;
                                                                        case 111:
                                                                            i44 = !zM7539 ? 1507596 : 1507565;
                                                                            break;
                                                                        case 460:
                                                                            Signature[] signatureArrM5590 = C0291.m5590(C0278.m5365(C0479.m9334(contextM5311), C0336.f519 ^ 377, C0446.m8680(C0277.m5311(u7VarM9185))));
                                                                            int i46 = 1507627;
                                                                            while (true) {
                                                                                i46 ^= 1507644;
                                                                                switch (i46) {
                                                                                    case 23:
                                                                                        i46 = signatureArrM5590 != null ? 1507720 : 1507689;
                                                                                        break;
                                                                                    case 85:
                                                                                        C0135.m2604(C0331.m6385(C0029.m572(u7VarM9185)), C0442.m8618(m6595(), 804, C0272.f387 ^ (-826), 2740));
                                                                                        i19 = 1509425;
                                                                                        while (true) {
                                                                                            i19 ^= 1509442;
                                                                                            switch (i19) {
                                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                    break;
                                                                                                case 115:
                                                                                                    i19 = 1509456;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                default:
                                                                                                    continue;
                                                                                                    continue;
                                                                                            }
                                                                                            i20 = 56455;
                                                                                            while (true) {
                                                                                                i20 ^= 56472;
                                                                                                switch (i20) {
                                                                                                    case 31:
                                                                                                        i20 = 56486;
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
                                                                                        }
                                                                                        break;
                                                                                    case 118:
                                                                                        break;
                                                                                    case 180:
                                                                                        int length = signatureArrM5590.length;
                                                                                        int i47 = 1507751;
                                                                                        while (true) {
                                                                                            i47 ^= 1507768;
                                                                                            switch (i47) {
                                                                                                case 31:
                                                                                                    i47 = length > 0 ? 1508495 : 1508464;
                                                                                                    break;
                                                                                                case 1335:
                                                                                                    jM4861 = C0255.m4861(C0340.m6663(messageDigestM7212, C0394.m7700(signatureArrM5590[0])));
                                                                                                    int i48 = 1508526;
                                                                                                    while (true) {
                                                                                                        i48 ^= 1508543;
                                                                                                        switch (i48) {
                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                i48 = 1508557;
                                                                                                                continue;
                                                                                                            case 114:
                                                                                                                break;
                                                                                                            default:
                                                                                                                continue;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 1480:
                                                                                                    C0135.m2604(C0331.m6385(C0029.m572(u7VarM9185)), C0442.m8618(m6595(), 804, C0272.f387 ^ (-826), 2740));
                                                                                                    i19 = 1509425;
                                                                                                    while (true) {
                                                                                                        i19 ^= 1509442;
                                                                                                        switch (i19) {
                                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                break;
                                                                                                            case 115:
                                                                                                                i19 = 1509456;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                            default:
                                                                                                                continue;
                                                                                                                continue;
                                                                                                        }
                                                                                                        i20 = 56455;
                                                                                                        while (true) {
                                                                                                            i20 ^= 56472;
                                                                                                            switch (i20) {
                                                                                                                case 31:
                                                                                                                    i20 = 56486;
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
                                                                                                    }
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
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                            } catch (PackageManager.NameNotFoundException e4) {
                                                                int i49 = 1508650;
                                                                while (true) {
                                                                    i49 ^= 1508667;
                                                                    switch (i49) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i49 = 1508681;
                                                                            continue;
                                                                        case 114:
                                                                            C0420.m8245(C0455.m8871(C0029.m572(u7VarM9185)), C0148.m2836(m6595(), 828, C0225.f304 ^ 836, 2574), e4);
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                    jM4861 = 0;
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 1529:
                                                C0135.m2604(C0455.m8871(C0029.m572(u7VarM9185)), C0024.m469(m6595(), 778, C0132.f158 ^ (-205), 1231));
                                                i20 = 56455;
                                                while (true) {
                                                    i20 ^= 56472;
                                                    switch (i20) {
                                                        case 31:
                                                            i20 = 56486;
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
                                            default:
                                                break;
                                        }
                                        z3VarM8874.f10595g = jM4861;
                                        break;
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        long jM7011 = C0358.m7010(z3VarM8874);
                        f5 f5Var = (f5) objM3121;
                        boolean zM8273 = C0422.m8273(f5Var);
                        boolean zM7100 = C0363.m7100(C0339.m6640(z3VarM8874));
                        boolean z12 = (((zM7100 ? 1 : 0) ^ 65535) & 1) | ((zM7100 ? 1 : 0) & 65534);
                        C0040.m791(z3VarM8874);
                        boolean zM8274 = C0422.m8273(f5Var);
                        int i50 = 1509673;
                        while (true) {
                            i50 ^= 1509690;
                            switch (i50) {
                                case 19:
                                    i50 = !zM8274 ? 1510417 : 1510386;
                                    break;
                                case 712:
                                    boolean zM7808 = C0399.m7808();
                                    int i51 = 1510572;
                                    while (true) {
                                        i51 ^= 1510589;
                                        switch (i51) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i51 = zM7808 ? 1511316 : 1510634;
                                                break;
                                            case 87:
                                                try {
                                                    clsM725 = C0037.m725(C0078.m1689(C0277.m5311(z3VarM8874)), C0137.m2642(m6595(), 873, C0254.f333 ^ 254, 771));
                                                    i11 = 1511595;
                                                    while (true) {
                                                        i11 ^= 1511612;
                                                        switch (i11) {
                                                            case 23:
                                                                i11 = clsM725 == null ? 1512339 : 1512308;
                                                                break;
                                                            case 815:
                                                                i12 = 1512370;
                                                                while (true) {
                                                                    i12 ^= 1512387;
                                                                    switch (i12) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case 113:
                                                                            i12 = 1512401;
                                                                            continue;
                                                                            continue;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                    }
                                                                    str3 = null;
                                                                    i18 = 1510448;
                                                                    while (true) {
                                                                        i18 ^= 1510465;
                                                                        switch (i18) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case 113:
                                                                                i18 = 1510479;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            default:
                                                                                continue;
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
                                                            case 968:
                                                                try {
                                                                    try {
                                                                        try {
                                                                            objM2245 = C0116.m2245(C0182.m3483(clsM725, C0299.m5745(m6595(), 920, C0288.f432 ^ (-536), 1718), new Class[]{Context.class}), null, new Object[]{C0277.m5311(z3VarM8874)});
                                                                            i13 = 1512494;
                                                                            while (true) {
                                                                                i13 ^= 1512511;
                                                                                switch (i13) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i13 = objM2245 == null ? 1513238 : 1512556;
                                                                                        break;
                                                                                    case 83:
                                                                                        try {
                                                                                            str2 = (String) C0116.m2245(C0182.m3483(clsM725, C0211.m4027(m6595(), 931, C0324.f471 ^ (-961), 2465), new Class[0]), objM2245, new Object[0]);
                                                                                            i15 = 1513393;
                                                                                            while (true) {
                                                                                                i15 ^= 1513410;
                                                                                                switch (i15) {
                                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                        str3 = str2;
                                                                                                        break;
                                                                                                    case 115:
                                                                                                        i15 = 1513424;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                        } catch (Exception e10) {
                                                                                            C0135.m2604(C0472.m9169(C0029.m572(z3VarM8874)), C0368.m7203(m6595(), 952, C0275.f390 ^ 929, 1305));
                                                                                            int i52 = 1513517;
                                                                                            while (true) {
                                                                                                i52 ^= 1513534;
                                                                                                switch (i52) {
                                                                                                    case 19:
                                                                                                        i52 = 1514199;
                                                                                                        continue;
                                                                                                    case 745:
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                }
                                                                                                str3 = null;
                                                                                                i18 = 1510448;
                                                                                                while (true) {
                                                                                                    i18 ^= 1510465;
                                                                                                    switch (i18) {
                                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                                            break;
                                                                                                        case 113:
                                                                                                            i18 = 1510479;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                        default:
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 114:
                                                                                        break;
                                                                                    case 809:
                                                                                        i14 = 1513269;
                                                                                        while (true) {
                                                                                            i14 ^= 1513286;
                                                                                            switch (i14) {
                                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                    break;
                                                                                                case 115:
                                                                                                    i14 = 1513300;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                default:
                                                                                                    continue;
                                                                                                    continue;
                                                                                            }
                                                                                            str3 = null;
                                                                                            i18 = 1510448;
                                                                                            while (true) {
                                                                                                i18 ^= 1510465;
                                                                                                switch (i18) {
                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                        break;
                                                                                                    case 113:
                                                                                                        i18 = 1510479;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    default:
                                                                                                        continue;
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
                                                                        } catch (Exception e11) {
                                                                            int i53 = 1569131;
                                                                            while (true) {
                                                                                i53 ^= 1569148;
                                                                                switch (i53) {
                                                                                    case 23:
                                                                                        i53 = 1569162;
                                                                                        continue;
                                                                                    case 246:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                                C0135.m2604(C0256.m4879(C0029.m572(z3VarM8874)), C0195.m3738(m6595(), 991, C0385.f655 ^ 635, 2284));
                                                                                int i54 = 1514416;
                                                                                while (true) {
                                                                                    i54 ^= 1514433;
                                                                                    switch (i54) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case 113:
                                                                                            i54 = 1514447;
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } catch (Exception e12) {
                                                                        int i55 = 1514292;
                                                                        while (true) {
                                                                            i55 ^= 1514309;
                                                                            switch (i55) {
                                                                                case 22:
                                                                                    break;
                                                                                case 113:
                                                                                    i55 = 1514323;
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (Exception e13) {
                                                                }
                                                                break;
                                                            case 1001:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                } catch (ClassNotFoundException e14) {
                                                    int i56 = 1569007;
                                                    while (true) {
                                                        i56 ^= 1569024;
                                                        switch (i56) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case 495:
                                                                i56 = 1569038;
                                                                continue;
                                                            default:
                                                                continue;
                                                        }
                                                    }
                                                }
                                                break;
                                            case 118:
                                                break;
                                            case 809:
                                                boolean zM3576 = C0187.m3575(C0091.m1951(z3VarM8874), null, C0308.m5947());
                                                int i57 = 1511347;
                                                while (true) {
                                                    i57 ^= 1511364;
                                                    switch (i57) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            clsM725 = C0037.m725(C0078.m1689(C0277.m5311(z3VarM8874)), C0137.m2642(m6595(), 873, C0254.f333 ^ 254, 771));
                                                            i11 = 1511595;
                                                            while (true) {
                                                                i11 ^= 1511612;
                                                                switch (i11) {
                                                                    case 23:
                                                                        if (clsM725 == null) {
                                                                        }
                                                                        break;
                                                                    case 815:
                                                                        i12 = 1512370;
                                                                        while (true) {
                                                                            i12 ^= 1512387;
                                                                            switch (i12) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case 113:
                                                                                    i12 = 1512401;
                                                                                    continue;
                                                                                    continue;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                            str3 = null;
                                                                            i18 = 1510448;
                                                                            while (true) {
                                                                                i18 ^= 1510465;
                                                                                switch (i18) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case 113:
                                                                                        i18 = 1510479;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    default:
                                                                                        continue;
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
                                                                    case 968:
                                                                        objM2245 = C0116.m2245(C0182.m3483(clsM725, C0299.m5745(m6595(), 920, C0288.f432 ^ (-536), 1718), new Class[]{Context.class}), null, new Object[]{C0277.m5311(z3VarM8874)});
                                                                        i13 = 1512494;
                                                                        while (true) {
                                                                            i13 ^= 1512511;
                                                                            switch (i13) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    if (objM2245 == null) {
                                                                                    }
                                                                                    break;
                                                                                case 83:
                                                                                    str2 = (String) C0116.m2245(C0182.m3483(clsM725, C0211.m4027(m6595(), 931, C0324.f471 ^ (-961), 2465), new Class[0]), objM2245, new Object[0]);
                                                                                    i15 = 1513393;
                                                                                    while (true) {
                                                                                        i15 ^= 1513410;
                                                                                        switch (i15) {
                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                str3 = str2;
                                                                                                break;
                                                                                            case 115:
                                                                                                i15 = 1513424;
                                                                                                continue;
                                                                                                continue;
                                                                                            default:
                                                                                                continue;
                                                                                                continue;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 114:
                                                                                    break;
                                                                                case 809:
                                                                                    i14 = 1513269;
                                                                                    while (true) {
                                                                                        i14 ^= 1513286;
                                                                                        switch (i14) {
                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                break;
                                                                                            case 115:
                                                                                                i14 = 1513300;
                                                                                                continue;
                                                                                                continue;
                                                                                            default:
                                                                                                continue;
                                                                                                continue;
                                                                                        }
                                                                                        str3 = null;
                                                                                        i18 = 1510448;
                                                                                        while (true) {
                                                                                            i18 ^= 1510465;
                                                                                            switch (i18) {
                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                    break;
                                                                                                case 113:
                                                                                                    i18 = 1510479;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                default:
                                                                                                    continue;
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
                                                                    case 1001:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 119:
                                                            i57 = zM3576 ? 1511440 : 1511409;
                                                            break;
                                                        case 8148:
                                                            C0135.m2604(C0136.m2634(C0029.m572(z3VarM8874)), C0321.m6205(m6595(), 850, C0361.f631 ^ 757, 1459));
                                                            int i58 = 1511471;
                                                            while (true) {
                                                                i58 ^= 1511488;
                                                                switch (i58) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case 111:
                                                                        i58 = 1511502;
                                                                        continue;
                                                                    default:
                                                                        continue;
                                                                }
                                                                str3 = null;
                                                                i18 = 1510448;
                                                                while (true) {
                                                                    i18 ^= 1510465;
                                                                    switch (i18) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case 113:
                                                                            i18 = 1510479;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        default:
                                                                            continue;
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
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case 745:
                                    break;
                                case 1323:
                                    str3 = null;
                                    i18 = 1510448;
                                    while (true) {
                                        i18 ^= 1510465;
                                        switch (i18) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 113:
                                                i18 = 1510479;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                            default:
                                                continue;
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
                            l4 l4VarM4620 = C0242.m4620(f5Var);
                            C0237.m4550(l4VarM4620);
                            long jM7113 = C0364.m7113(C0270.m5154(l4VarM4620));
                            long jM8256 = C0421.m8256(f5Var);
                            int i59 = 1515191;
                            while (true) {
                                i59 ^= 1515208;
                                switch (i59) {
                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                        break;
                                    case 61:
                                        jM8256 = C0455.m8872(jM8256, jM7113);
                                        break;
                                    case 127:
                                        i59 = jM7113 == 0 ? 1515284 : 1515253;
                                        break;
                                    case 476:
                                        int i60 = 1515315;
                                        while (true) {
                                            i60 ^= 1515332;
                                            switch (i60) {
                                                case 22:
                                                    break;
                                                case 119:
                                                    i60 = 1515346;
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
                            C0459.m8937(z3VarM8874);
                            int iM6834 = C0350.m6834(z3VarM8874);
                            Boolean boolM8320 = C0425.m8320(C0091.m1951(z3VarM8874), C0279.m5391(m6595(), 1035, C0415.f685 ^ (-447), 1439));
                            int i61 = 1515439;
                            while (true) {
                                i61 ^= 1515456;
                                switch (i61) {
                                    case 111:
                                        i61 = boolM8320 != null ? 1516183 : 1516152;
                                        break;
                                    case 15703:
                                        boolean zM15 = C0000.m14(boolM8320);
                                        int i62 = 1516214;
                                        while (true) {
                                            i62 ^= 1516231;
                                            switch (i62) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 51:
                                                    z11 = false;
                                                    int i63 = 1537294;
                                                    while (true) {
                                                        i63 ^= 1537311;
                                                        switch (i63) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i63 = 1537325;
                                                                continue;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                                case 113:
                                                    i62 = zM15 ? 1516307 : 1516276;
                                                    break;
                                                case 468:
                                                    int i64 = 1516338;
                                                    while (true) {
                                                        i64 ^= 1516355;
                                                        switch (i64) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 113:
                                                                i64 = 1516369;
                                                                continue;
                                                            default:
                                                                continue;
                                                        }
                                                        z11 = true;
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 15769:
                                        break;
                                    case 15800:
                                        z11 = true;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            l4 l4VarM6641 = C0339.m6640(z3VarM8874);
                            C0224.m4302(l4VarM6641);
                            boolean zM2784 = C0146.m2784(C0362.m7082(l4VarM6641), C0086.m1834(m6595(), 1075, C0193.f217 ^ 209, 940), false);
                            C0459.m8937(z3VarM8874);
                            String strM3757 = C0196.m3757(z3VarM8874);
                            Boolean boolM8321 = C0425.m8320(C0091.m1951(z3VarM8874), C0345.m6750(m6595(), 1104, C0051.f71 ^ (-405), 2325));
                            int i65 = 1537418;
                            while (true) {
                                i65 ^= 1537435;
                                switch (i65) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i65 = boolM8321 == null ? 1537511 : 1537480;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 83:
                                        boolean zM16 = C0000.m14(boolM8321);
                                        boolM192 = C0009.m192(((zM16 ? 1 : 0) & 65534) | (((zM16 ? 1 : 0) ^ 65535) & 1));
                                        break;
                                    case 124:
                                        boolM192 = null;
                                        int i66 = 1537542;
                                        while (true) {
                                            i66 ^= 1537559;
                                            switch (i66) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i66 = 1538224;
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
                            long jM890 = C0046.m890(z3VarM8874);
                            List listM5163 = C0271.m5163(z3VarM8874);
                            String strM7407 = C0379.m7407(s5VarM1685);
                            String strM929 = C0048.m929(z3VarM8874);
                            int i67 = 1538317;
                            while (true) {
                                i67 ^= 1538334;
                                switch (i67) {
                                    case 19:
                                        i67 = strM929 == null ? 1538410 : 1538379;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 85:
                                        break;
                                    case 116:
                                        z3VarM8874.f10598j = C0304.m5843(C0355.m6951(z3VarM8874));
                                        break;
                                    default:
                                        break;
                                }
                            }
                            String strM9210 = C0048.m929(z3VarM8874);
                            boolean zM2753 = C0143.m2753();
                            int i68 = 1538441;
                            while (true) {
                                i68 ^= 1538458;
                                switch (i68) {
                                    case 19:
                                        i68 = zM2753 ? 1539185 : 1538503;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 93:
                                        int i69 = 1542285;
                                        while (true) {
                                            i69 ^= 1542302;
                                            switch (i69) {
                                                case 19:
                                                    i69 = 1542316;
                                                    continue;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i16 = 1542161;
                                            while (true) {
                                                i16 ^= 1542178;
                                                switch (i16) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        strM4764 = null;
                                                        break;
                                                    case 51:
                                                        i16 = 1542192;
                                                        continue;
                                                        continue;
                                                    default:
                                                        continue;
                                                        continue;
                                                }
                                            }
                                        }
                                        break;
                                    case 1515:
                                        boolean zM3577 = C0187.m3575(C0091.m1951(z3VarM8874), null, C0302.m5818());
                                        int i70 = 1539216;
                                        while (true) {
                                            i70 ^= 1539233;
                                            switch (i70) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 49:
                                                    i70 = zM3577 ? 1539309 : 1539278;
                                                    break;
                                                case 76:
                                                    C0040.m791(z3VarM8874);
                                                    long jM2675 = C0138.m2675(z3VarM8874);
                                                    int i71 = 1539340;
                                                    while (true) {
                                                        i71 ^= 1539357;
                                                        switch (i71) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i71 = jM2675 != 0 ? 1539433 : 1539402;
                                                                break;
                                                            case 54:
                                                                break;
                                                            case 87:
                                                                break;
                                                            case 116:
                                                                C0014.m280((e6.c) C0166.m3176(z3VarM8874));
                                                                long jM7869 = C0402.m7869();
                                                                long jM2676 = C0138.m2675(z3VarM8874);
                                                                String strM4765 = C0249.m4764(z3VarM8874);
                                                                int i72 = 1539464;
                                                                while (true) {
                                                                    i72 ^= 1539481;
                                                                    switch (i72) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i72 = strM4765 != null ? 1540208 : 1540177;
                                                                            break;
                                                                        case 64939:
                                                                            break;
                                                                        case 64968:
                                                                            break;
                                                                        case 65001:
                                                                            int i73 = 1540239;
                                                                            while (true) {
                                                                                i73 ^= 1540256;
                                                                                switch (i73) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case 47:
                                                                                        i73 = ((18 + jM7869) - jM2676) - 18 > 86400000 ? 1540332 : 1540301;
                                                                                        break;
                                                                                    case 76:
                                                                                        String strM4084 = C0215.m4084(z3VarM8874);
                                                                                        int i74 = 1540363;
                                                                                        while (true) {
                                                                                            i74 ^= 1540380;
                                                                                            switch (i74) {
                                                                                                case 23:
                                                                                                    i74 = strM4084 == null ? 1541107 : 1540425;
                                                                                                    break;
                                                                                                case 54:
                                                                                                    break;
                                                                                                case 85:
                                                                                                    break;
                                                                                                case 751:
                                                                                                    C0373.m7314(z3VarM8874);
                                                                                                    int i75 = 1541138;
                                                                                                    while (true) {
                                                                                                        i75 ^= 1541155;
                                                                                                        switch (i75) {
                                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                break;
                                                                                                            case 49:
                                                                                                                i75 = 1541169;
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
                                                                                        break;
                                                                                    case 109:
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
                                                    String strM4766 = C0249.m4764(z3VarM8874);
                                                    int i76 = 1541262;
                                                    while (true) {
                                                        i76 ^= 1541279;
                                                        switch (i76) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i76 = strM4766 == null ? 1541355 : 1541324;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 83:
                                                                break;
                                                            case 116:
                                                                C0373.m7314(z3VarM8874);
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    strM4764 = C0249.m4764(z3VarM8874);
                                                    int i77 = 1541386;
                                                    while (true) {
                                                        i77 ^= 1541403;
                                                        switch (i77) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i77 = 1542068;
                                                                continue;
                                                            case 687:
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                                case 111:
                                                    i16 = 1542161;
                                                    while (true) {
                                                        i16 ^= 1542178;
                                                        switch (i16) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                strM4764 = null;
                                                                break;
                                                            case 51:
                                                                i16 = 1542192;
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
                                Boolean boolM8322 = C0425.m8320(C0091.m1951(z3VarM8874), C0417.m8170(m6595(), 1161, C0464.f734 ^ 263, 1469));
                                int i78 = 1543060;
                                while (true) {
                                    i78 ^= 1543077;
                                    switch (i78) {
                                        case 22:
                                            break;
                                        case 49:
                                            i78 = boolM8322 == null ? 1543153 : 1543122;
                                            break;
                                        case 84:
                                            zM14 = false;
                                            int i79 = 1543184;
                                            while (true) {
                                                i79 ^= 1543201;
                                                switch (i79) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 49:
                                                        i79 = 1543215;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 119:
                                            zM14 = C0000.m14(boolM8322);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                u7 u7VarM6951 = C0355.m6951(z3VarM8874);
                                String strM5049 = C0265.m5048(z3VarM8874);
                                PackageManager packageManagerM82710 = C0422.m8279(C0277.m5311(u7VarM6951));
                                int i80 = 1543308;
                                while (true) {
                                    i80 ^= 1543325;
                                    switch (i80) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i80 = packageManagerM82710 == null ? 1544052 : 1544021;
                                            break;
                                        case 939:
                                            break;
                                        case 968:
                                            try {
                                                try {
                                                    ApplicationInfo applicationInfoM5685 = C0296.m5685(C0479.m9334(C0277.m5311(u7VarM6951)), 0, strM5049);
                                                    int i81 = 1544207;
                                                    while (true) {
                                                        i81 ^= 1544224;
                                                        switch (i81) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case 47:
                                                                i81 = applicationInfoM5685 != null ? 1544951 : 1544269;
                                                                break;
                                                            case 109:
                                                                iM9539 = 0;
                                                                break;
                                                            case 727:
                                                                iM9539 = C0490.m9539(applicationInfoM5685);
                                                                int i82 = 1544982;
                                                                while (true) {
                                                                    i82 ^= 1544999;
                                                                    switch (i82) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case 49:
                                                                            i82 = 1545013;
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
                                                } catch (PackageManager.NameNotFoundException e15) {
                                                    int i83 = 1569255;
                                                    while (true) {
                                                        i83 ^= 1569272;
                                                        switch (i83) {
                                                            case 31:
                                                                i83 = 1569937;
                                                                continue;
                                                            case 1385:
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                        C0420.m8245(C0460.m8950(C0029.m572(u7VarM6951)), C0468.m9100(m6595(), 1197, C0087.f121 ^ 621, 2731), strM5049);
                                                    }
                                                }
                                            } catch (PackageManager.NameNotFoundException e16) {
                                            }
                                            j10 = iM9539;
                                            break;
                                        case 1001:
                                            j10 = 0;
                                            int i84 = 1544083;
                                            while (true) {
                                                i84 ^= 1544100;
                                                switch (i84) {
                                                    case 22:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                        i84 = 1544114;
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
                                boolean zM1131 = C0059.m1131();
                                int i85 = 1545106;
                                while (true) {
                                    i85 ^= 1545123;
                                    switch (i85) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 49:
                                            i85 = zM1131 ? 1545199 : 1545168;
                                            break;
                                        case 76:
                                            boolean zM3578 = C0187.m3575(C0091.m1951(z3VarM8874), null, C0318.m6157());
                                            int i86 = 1545230;
                                            while (true) {
                                                i86 ^= 1545247;
                                                switch (i86) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i86 = zM3578 ? 1545974 : 1545943;
                                                        break;
                                                    case 679:
                                                        break;
                                                    case 712:
                                                        i17 = 0;
                                                        break;
                                                    case 745:
                                                        C0355.m6951(z3VarM8874);
                                                        int iM7181 = C0367.m7181();
                                                        int i87 = 1546005;
                                                        while (true) {
                                                            i87 ^= 1546022;
                                                            switch (i87) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 51:
                                                                    i87 = iM7181 >= 30 ? 1546098 : 1546067;
                                                                    break;
                                                                case 84:
                                                                    int iM3581 = C0188.m3581();
                                                                    int i88 = 1546129;
                                                                    while (true) {
                                                                        i88 ^= 1546146;
                                                                        switch (i88) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 51:
                                                                                i88 = iM3581 > 3 ? 1567054 : 1546191;
                                                                                break;
                                                                            case 109:
                                                                                iM7223 = 0;
                                                                                break;
                                                                            case 32492:
                                                                                iM7223 = C0369.m7223();
                                                                                int i89 = 1567085;
                                                                                while (true) {
                                                                                    i89 ^= 1567102;
                                                                                    switch (i89) {
                                                                                        case 19:
                                                                                            i89 = 1567116;
                                                                                            continue;
                                                                                        case 242:
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
                                                                case 117:
                                                                    iM7223 = 0;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        int i90 = 1567209;
                                                        while (true) {
                                                            i90 ^= 1567226;
                                                            switch (i90) {
                                                                case 19:
                                                                    i90 = 1567240;
                                                                    continue;
                                                                case 1010:
                                                                    i17 = iM7223;
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
                                        case 115:
                                            i17 = 0;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                boolean zM1132 = C0059.m1131();
                                int i91 = 1567333;
                                while (true) {
                                    i91 ^= 1567350;
                                    switch (i91) {
                                        case 19:
                                            if (zM1132) {
                                                i91 = 1568077;
                                            }
                                            break;
                                        case 1851:
                                            boolean zM3579 = C0187.m3575(C0091.m1951(z3VarM8874), null, C0318.m6157());
                                            int i92 = 1568108;
                                            while (true) {
                                                i92 ^= 1568125;
                                                switch (i92) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (zM3579) {
                                                            i92 = 1568201;
                                                        }
                                                        break;
                                                    case 180:
                                                        jM3444 = C0180.m3444(C0355.m6951(z3VarM8874));
                                                        int i93 = 1568232;
                                                        while (true) {
                                                            i93 ^= 1568249;
                                                            switch (i93) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i93 = 1568263;
                                                                    break;
                                                                case 1022:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 215:
                                                        jM3444 = 0;
                                                        break;
                                                    case 246:
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i92 = 1568170;
                                            }
                                            break;
                                        case 1880:
                                            jM3444 = 0;
                                            break;
                                        case 1913:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i91 = 1568046;
                                }
                                return new x7(strM5048, strM9122, strM2306, jM2436, strM187, (-82153) ^ ((long) C0448.f718), jM7011, str, zM8273, z12, str3, jM8256, iM6834, z11, zM2784, strM3757, boolM192, jM890, listM5163, strM7407, strM9210, strM4764, zM14, j10, iM4627, strM8581, i17, jM3444);
                            }
                        }
                }
            }
        }
    }

    @Override // k6.p2
    public final boolean u() {
        return false;
    }

    public final void v(Runnable runnable) {
        C0040.m791(this);
        boolean zM8489 = C0435.m8489(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM8489) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    C0035.m683(runnable);
                    return;
                case 239:
                    ArrayList arrayListM6037 = C0313.m6037(this);
                    long jM4637 = C0242.m4637(arrayListM6037);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (jM4637 >= 1000) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                C0358.m6998(arrayListM6037, runnable);
                                C0259.m4929(C0330.m6368(this), (-60407) ^ ((long) C0415.f685));
                                C0399.m7793(this);
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0135.m2604(C0455.m8871(C0029.m572(this)), C0040.m784(m6595(), 1246, C0265.f344 ^ 527, 1572));
                                int iM9505 = C0489.m9505();
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (iM9505 <= 0) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            return;
                                        case 47417:
                                            System.out.println(Float.valueOf(C0432.m8448("Bp")));
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

    public final void w(AtomicReference atomicReference) {
        String str = "ۡۥ";
        y2.a aVar = null;
        x7 x7VarM1159 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56356:
                    C0040.m791(this);
                    str = "ۡۨۢ";
                    break;
                case 56541:
                    aVar = new y2.a((Object) this, (Object) atomicReference, (Object) x7VarM1159, i11);
                    str = "ۢۧۥ";
                    break;
                case 1746972:
                    return;
                case 1748891:
                    C0459.m8937(this);
                    str = "ۦۣۧ";
                    break;
                case 1749725:
                    i11 = i10 ^ 540;
                    str = "ۧۤ";
                    break;
                case 1749824:
                    C0310.m5979(this, aVar);
                    str = "۟ۨۥ";
                    break;
                case 1753640:
                    i10 = C0359.f629;
                    str = "ۢۤ۟";
                    break;
                default:
                    str = "ۦۦۨ";
                    x7VarM1159 = C0061.m1159(this, false);
                    break;
            }
        }
    }

    public final void x(e eVar) {
        boolean zM2505;
        C0040.m791(this);
        C0459.m8937(this);
        b4 b4VarM2310 = C0120.m2310(this);
        C0355.m6951(b4VarM2310);
        byte[] bArrM7459 = C0381.m7459(eVar);
        int length = bArrM7459.length;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = length > 131072 ? 1709 : 1678;
                    break;
                case 204:
                    C0135.m2604(C0336.m6498(C0029.m572(b4VarM2310)), C0342.m6689(m6595(), 1294, C0368.f638 ^ (-627), 2914));
                    zM2505 = false;
                    break;
                case 239:
                    zM2505 = C0130.m2505(b4VarM2310, C0389.f659 ^ 530, bArrM7459);
                    int i11 = 1864;
                    while (true) {
                        i11 ^= 1881;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 48674;
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
        int i12 = 1740;
        while (true) {
            i12 ^= 1757;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i12 = 1771;
                    break;
                case 54:
                    C0310.m5979(this, new w6(this, C0061.m1159(this, true), zM2505, new e(eVar), eVar));
                    int iM5836 = C0303.m5836();
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                return;
                            case 76:
                                System.out.println(Float.decode(C0471.m9165("MMb")));
                                return;
                            case 239:
                                if (iM5836 <= 0) {
                                    i13 = 48860;
                                }
                                break;
                            default:
                                continue;
                        }
                        i13 = 48829;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:1001:0x0713 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1002:0x0717 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1003:0x071d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1004:0x0a10 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1005:0x0719 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1006:0x0713 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1008:0x070b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1011:0x072b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1014:0x0723 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1075:0x033e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1077:0x033d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1081:0x0595 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1082:0x0594 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1113:0x03e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1114:0x0400 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1116:0x03de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x0900 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x096b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x08a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x06c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:0x0818 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:0x081f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:0x0837 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:0x081a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:0x0833 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:0x082b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:0x0843 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:0x0847 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:0x084d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:0x086b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:0x0849 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:0x0843 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:0x083b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:0x0858 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:0x085c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:0x0864 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:0x086b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:0x0860 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:0x0858 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:0x0850 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:0x087b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:0x0881 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:0x0885 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:750:0x0881 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:0x087d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:0x0873 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:0x09e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:0x09d8 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:0x089c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:0x08a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:0x08e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:0x08a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:0x089e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:0x0894 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:0x08ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:0x08b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:0x09cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:0x091a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:0x08f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:0x08fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:0x0954 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:0x08fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:0x08f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:0x08ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:0x0925 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:0x090c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:0x0961 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:0x0967 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:0x09ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:0x0967 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:0x0963 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:0x0959 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:814:0x097f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:0x0977 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:833:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:836:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:884:0x03fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:885:0x0757 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:886:0x075c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:887:0x075f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:888:0x0757 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:889:0x03fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:891:0x03f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:894:0x076a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:895:0x0770 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:896:0x0774 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:897:0x0a10 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:898:0x0770 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:899:0x076c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:901:0x0762 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:905:0x0785 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:907:0x077a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:909:0x0742 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:912:0x073a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:914:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:915:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:916:0x02eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:920:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:921:0x07c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:922:0x07ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:923:0x07d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:924:0x02fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:925:0x07c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:926:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:931:0x07dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:932:0x07e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:933:0x07e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:934:0x07e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:935:0x07e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:936:0x07dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:938:0x07d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:946:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:947:0x079d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:948:0x07a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:949:0x07a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:950:0x079f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:951:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:953:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:956:0x07b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:957:0x07b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:958:0x07bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:959:0x0a10 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:960:0x07b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:961:0x07b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:963:0x07aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:971:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:972:0x06bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:973:0x06de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:974:0x06bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:975:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:977:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:980:0x06d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:981:0x06d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:982:0x06db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:983:0x06de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:984:0x06d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:985:0x06d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:986:0x06d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:991:0x06fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:992:0x0701 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:993:0x0705 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:994:0x0708 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:995:0x0701 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:996:0x06fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:998:0x06f3 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x0165. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:110:0x0177. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:130:0x01e4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:163:0x02d7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:182:0x0308. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:195:0x032b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:200:0x033a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:216:0x037e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:233:0x03bd. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:239:0x03ce. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:260:0x040d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:266:0x041d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:281:0x0464. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x006b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:300:0x04a7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:311:0x04c6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:317:0x04d6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:323:0x04e6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:329:0x04f6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:336:0x0506. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:347:0x0545. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:360:0x0585. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:372:0x05c1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:386:0x0639. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:398:0x0664. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:405:0x0677. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:411:0x068a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:424:0x06b0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:456:0x0727. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:462:0x073e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:468:0x074f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x00bf. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:482:0x077e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:489:0x0792. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:519:0x080c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:527:0x082f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:550:0x0877. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:565:0x08b6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:571:0x08e1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:584:0x0910. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:588:0x091e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:595:0x094c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:608:0x097b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:614:0x09a6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:628:0x09ef. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:634:0x09ff. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:78:0x0121. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x0144. Please report as an issue. */
    public final void y(y3 y3Var, a6.a aVar, x7 x7Var) throws Throwable {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabaseM9147;
        SQLiteDatabase sQLiteDatabase;
        SQLiteException e4;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteFullException e10;
        Cursor cursorM4442;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean zM3035;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        String strM7937;
        String[] strArr;
        e eVar;
        t7 t7Var;
        int i25;
        int i26;
        int i27;
        int i28;
        ArrayList arrayList;
        int i29;
        int iM171;
        int i30;
        int iM4637;
        int i31;
        int i32;
        a6.a aVar2;
        boolean z10;
        int i33;
        boolean z11;
        int i34;
        boolean z12;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        C0040.m791(this);
        C0459.m8937(this);
        int i44 = 100;
        int i45 = 0;
        int i46 = 0;
        while (true) {
            int i47 = 1616;
            while (true) {
                i47 ^= 1633;
                switch (i47) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i47 = i45 < 1001 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        return;
                    default:
                        break;
                }
            }
            int i48 = 1740;
            while (true) {
                i48 ^= 1757;
                switch (i48) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i48 = i44 == 100 ? 1833 : 1802;
                        break;
                    case 54:
                        break;
                    case 471:
                        return;
                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                        break;
                    default:
                        break;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            b4 b4VarM2310 = C0120.m2310(this);
            String strM5471 = C0284.m5471(m6595(), 1376, C0296.f443 ^ 114, 2713);
            C0040.m791(b4VarM2310);
            boolean zM5652 = C0294.m5652(b4VarM2310);
            int i49 = 1864;
            while (true) {
                i49 ^= 1881;
                switch (i49) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i49 = zM5652 ? 48736 : 48705;
                        break;
                    case 47384:
                        ArrayList arrayList3 = new ArrayList();
                        boolean zM5755 = C0300.m5755(C0487.m9471(C0277.m5311(b4VarM2310), C0031.m607(m6595(), 1417, C0287.f431 ^ 379, 1914)));
                        int i50 = 48891;
                        while (true) {
                            i50 ^= 48908;
                            switch (i50) {
                                case 22:
                                    break;
                                case 53:
                                    int i51 = 5;
                                    int i52 = i46;
                                    int i53 = i46;
                                    int i54 = i45;
                                    while (true) {
                                        int i55 = 49790;
                                        while (true) {
                                            i55 ^= 49807;
                                            switch (i55) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 51:
                                                    C0135.m2604(C0331.m6385(C0029.m572(b4VarM2310)), C0361.m7066(m6595(), 1769, C0161.f185 ^ (-820), 1936));
                                                    int i56 = 1544982;
                                                    while (true) {
                                                        i56 ^= 1544999;
                                                        switch (i56) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 49:
                                                                i56 = 1545013;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                        i45 = i54;
                                                        i46 = i53;
                                                        arrayList = null;
                                                        i43 = 48767;
                                                        while (true) {
                                                            i43 ^= 48784;
                                                            switch (i43) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 239:
                                                                    i43 = 48798;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                            i29 = 1545106;
                                                            while (true) {
                                                                i29 ^= 1545123;
                                                                switch (i29) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 49:
                                                                        i29 = arrayList != null ? 1545199 : 1545168;
                                                                        break;
                                                                    case 76:
                                                                        C0393.m7672(arrayList2, arrayList);
                                                                        iM171 = C0008.m171(arrayList);
                                                                        i42 = 1545230;
                                                                        while (true) {
                                                                            i42 ^= 1545247;
                                                                            switch (i42) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i42 = 1545912;
                                                                                    break;
                                                                                case 679:
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case 115:
                                                                        iM171 = i46;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            i30 = 1546005;
                                                            while (true) {
                                                                i30 ^= 1546022;
                                                                switch (i30) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 51:
                                                                        i30 = aVar != null ? 1546098 : 1546067;
                                                                        break;
                                                                    case 84:
                                                                        i41 = 1546129;
                                                                        while (true) {
                                                                            i41 ^= 1546146;
                                                                            switch (i41) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case 51:
                                                                                    i41 = iM171 < 100 ? 1567054 : 1546191;
                                                                                    break;
                                                                                case 109:
                                                                                    break;
                                                                                case 32492:
                                                                                    C0358.m6998(arrayList2, aVar);
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 117:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            iM4637 = C0242.m4637(arrayList2);
                                                            i31 = i46;
                                                            while (true) {
                                                                i32 = 1567085;
                                                                while (true) {
                                                                    i32 ^= 1567102;
                                                                    switch (i32) {
                                                                        case 19:
                                                                            i32 = i31 < iM4637 ? 1567178 : 1567147;
                                                                            break;
                                                                        case 180:
                                                                            Object objM4486 = C0234.m4486(arrayList2, i31);
                                                                            int i57 = C0036.f56;
                                                                            aVar2 = (a6.a) objM4486;
                                                                            z10 = aVar2 instanceof v;
                                                                            i33 = 1567209;
                                                                            while (true) {
                                                                                i33 ^= 1567226;
                                                                                switch (i33) {
                                                                                    case 19:
                                                                                        i33 = z10 ? 1567302 : 1567271;
                                                                                        break;
                                                                                    case 956:
                                                                                        try {
                                                                                            C0493.m9585(y3Var, (v) aVar2, x7Var);
                                                                                            i39 = 1567333;
                                                                                            while (true) {
                                                                                                i39 ^= 1567350;
                                                                                                switch (i39) {
                                                                                                    case 19:
                                                                                                        i39 = 1568015;
                                                                                                        break;
                                                                                                    case 1913:
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        } catch (RemoteException e11) {
                                                                                            C0420.m8245(C0455.m8871(C0029.m572(this)), C0258.m4914(m6595(), 1823, C0457.f727 ^ 737, 2098), e11);
                                                                                            int i58 = 1568108;
                                                                                            while (true) {
                                                                                                i58 ^= 1568125;
                                                                                                switch (i58) {
                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        i58 = 1568139;
                                                                                                        break;
                                                                                                    case 246:
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 989:
                                                                                        z11 = aVar2 instanceof t7;
                                                                                        i34 = 1568232;
                                                                                        while (true) {
                                                                                            i34 ^= 1568249;
                                                                                            switch (i34) {
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i34 = z11 ? 1568976 : 1568294;
                                                                                                    break;
                                                                                                case 991:
                                                                                                    z12 = aVar2 instanceof e;
                                                                                                    i35 = 1569255;
                                                                                                    while (true) {
                                                                                                        i35 ^= 1569272;
                                                                                                        switch (i35) {
                                                                                                            case 31:
                                                                                                                i35 = z12 ? 1569999 : 1569968;
                                                                                                                break;
                                                                                                            case 1335:
                                                                                                                try {
                                                                                                                    C0430.m8410(y3Var, (e) aVar2, x7Var);
                                                                                                                    i36 = 1570030;
                                                                                                                    while (true) {
                                                                                                                        i36 ^= 1570047;
                                                                                                                        switch (i36) {
                                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                i36 = 1570061;
                                                                                                                                break;
                                                                                                                            case 498:
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } catch (RemoteException e12) {
                                                                                                                    C0420.m8245(C0455.m8871(C0029.m572(this)), C0446.m8682(m6595(), 1901, C0460.f730 ^ 719, 1657), e12);
                                                                                                                    int i59 = 1570154;
                                                                                                                    while (true) {
                                                                                                                        i59 ^= 1570171;
                                                                                                                        switch (i59) {
                                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                i59 = 1570185;
                                                                                                                                break;
                                                                                                                            case 242:
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                            case 1352:
                                                                                                                C0135.m2604(C0455.m8871(C0029.m572(this)), C0046.m889(m6595(), 1956, C0109.f135 ^ 105, 380));
                                                                                                                break;
                                                                                                            case 1385:
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 1022:
                                                                                                    break;
                                                                                                case 7465:
                                                                                                    try {
                                                                                                        C0298.m5725(y3Var, (t7) aVar2, x7Var);
                                                                                                        i37 = 1569007;
                                                                                                        while (true) {
                                                                                                            i37 ^= 1569024;
                                                                                                            switch (i37) {
                                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                                    break;
                                                                                                                case 495:
                                                                                                                    i37 = 1569038;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (RemoteException e13) {
                                                                                                        C0420.m8245(C0455.m8871(C0029.m572(this)), C0369.m7218(m6595(), 1858, C0420.f690 ^ 113, 2449), e13);
                                                                                                        int i60 = 1569131;
                                                                                                        while (true) {
                                                                                                            i60 ^= 1569148;
                                                                                                            switch (i60) {
                                                                                                                case 23:
                                                                                                                    i60 = 1569162;
                                                                                                                    break;
                                                                                                                case 246:
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
                                                                                    case 1010:
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            int i61 = (i57 ^ 43) + i31;
                                                                            i38 = 1570929;
                                                                            while (true) {
                                                                                i38 ^= 1570946;
                                                                                switch (i38) {
                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case 243:
                                                                                        i38 = 1570960;
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i31 = i61;
                                                                            break;
                                                                        case 213:
                                                                            break;
                                                                        case 242:
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                    i45 += C0393.f663 ^ 576;
                                                                    i40 = 1571053;
                                                                    while (true) {
                                                                        i40 ^= 1571070;
                                                                        switch (i40) {
                                                                            case 19:
                                                                                i40 = 1571084;
                                                                                break;
                                                                            case 498:
                                                                                break;
                                                                        }
                                                                    }
                                                                    i44 = iM171;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 84:
                                                    try {
                                                        sQLiteDatabaseM9147 = C0470.m9147(b4VarM2310);
                                                        int i62 = 49914;
                                                        while (true) {
                                                            i62 ^= 49931;
                                                            switch (i62) {
                                                                case 497:
                                                                    i62 = sQLiteDatabaseM9147 == null ? 50658 : 50627;
                                                                    break;
                                                                case 1711:
                                                                    break;
                                                                case 1736:
                                                                    C0348.m6794(sQLiteDatabaseM9147);
                                                                    long jM1830 = C0086.m1830(sQLiteDatabaseM9147);
                                                                    int i63 = 52735;
                                                                    while (true) {
                                                                        i63 ^= 52752;
                                                                        switch (i63) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                strM7937 = null;
                                                                                strArr = null;
                                                                                break;
                                                                            case 1007:
                                                                                i63 = jM1830 != -1 ? 53479 : 52797;
                                                                                break;
                                                                            case 7927:
                                                                                strM7937 = C0405.m7937(m6595(), 1448, C0491.f764 ^ 817, 738);
                                                                                strArr = new String[1];
                                                                                strArr[i53] = C0024.m477(jM1830);
                                                                                int i64 = 53510;
                                                                                while (true) {
                                                                                    i64 ^= 53527;
                                                                                    switch (i64) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i64 = 53541;
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
                                                                    String strM2854 = C0149.m2854(m6595(), 1455, C0048.f68 ^ (-745), 2663);
                                                                    String[] strArr2 = new String[3];
                                                                    strArr2[i53] = C0438.m8534(m6595(), 1463, C0018.f38 ^ (-581), 3186);
                                                                    strArr2[1] = C0314.m6053(m6595(), 1468, C0197.f221 ^ 103, 2064);
                                                                    strArr2[2] = C0101.m1981(m6595(), 1472, C0010.f30 ^ 884, 2938);
                                                                    cursorM4442 = C0232.m4442(sQLiteDatabaseM9147, strM2854, strArr2, strM7937, strArr, null, null, C0413.m8103(m6595(), 1477, C0024.f44 ^ 542, 889), C0068.m1323(100));
                                                                    long jM7701 = -1;
                                                                    i45 = i54;
                                                                    while (true) {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    boolean zM2531 = C0131.m2531(cursorM4442);
                                                                                    int i65 = 53634;
                                                                                    while (true) {
                                                                                        i65 ^= 53651;
                                                                                        switch (i65) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i65 = zM2531 ? 53727 : 53696;
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                break;
                                                                                            case 76:
                                                                                                try {
                                                                                                    try {
                                                                                                        jM7701 = C0394.m7701(cursorM4442, i53);
                                                                                                        int iM7639 = C0391.m7639(cursorM4442, 1);
                                                                                                        byte[] bArrM7292 = C0372.m7292(cursorM4442, 2);
                                                                                                        int i66 = 53758;
                                                                                                        while (true) {
                                                                                                            i66 ^= 53775;
                                                                                                            switch (i66) {
                                                                                                                case 1009:
                                                                                                                    i66 = iM7639 == 0 ? 54502 : 54471;
                                                                                                                    break;
                                                                                                                case 1703:
                                                                                                                    break;
                                                                                                                case 1736:
                                                                                                                    int i67 = 1507751;
                                                                                                                    while (true) {
                                                                                                                        i67 ^= 1507768;
                                                                                                                        switch (i67) {
                                                                                                                            case 31:
                                                                                                                                i67 = iM7639 == 1 ? 1508495 : 1508464;
                                                                                                                                break;
                                                                                                                            case 1335:
                                                                                                                                try {
                                                                                                                                    Parcel parcelM7521 = C0384.m7521();
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            C0127.m2460(parcelM7521, bArrM7292, 0, bArrM7292.length);
                                                                                                                                            C0075.m1634(parcelM7521, 0);
                                                                                                                                            t7Var = (t7) C0399.m7785(C0073.m1593(), parcelM7521);
                                                                                                                                            C0082.m1756(parcelM7521);
                                                                                                                                            int i68 = 1508526;
                                                                                                                                            while (true) {
                                                                                                                                                i68 ^= 1508543;
                                                                                                                                                switch (i68) {
                                                                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                        i68 = 1508557;
                                                                                                                                                        break;
                                                                                                                                                    case 114:
                                                                                                                                                        break;
                                                                                                                                                    default:
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                                int i69 = 1510448;
                                                                                                                                                while (true) {
                                                                                                                                                    i69 ^= 1510465;
                                                                                                                                                    switch (i69) {
                                                                                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                                                                                            break;
                                                                                                                                                        case 47:
                                                                                                                                                            break;
                                                                                                                                                        case 113:
                                                                                                                                                            i69 = t7Var != null ? 1510541 : 1510510;
                                                                                                                                                            break;
                                                                                                                                                        case 204:
                                                                                                                                                            C0358.m6998(arrayList3, t7Var);
                                                                                                                                                            int i70 = 1510572;
                                                                                                                                                            while (true) {
                                                                                                                                                                i70 ^= 1510589;
                                                                                                                                                                switch (i70) {
                                                                                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                        i70 = 1510603;
                                                                                                                                                                        break;
                                                                                                                                                                    case 118:
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
                                                                                                                                                i27 = 56579;
                                                                                                                                                while (true) {
                                                                                                                                                    i27 ^= 56596;
                                                                                                                                                    switch (i27) {
                                                                                                                                                        case 23:
                                                                                                                                                            i27 = 56610;
                                                                                                                                                            break;
                                                                                                                                                        case 54:
                                                                                                                                                            break;
                                                                                                                                                        default:
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                    i53 = 0;
                                                                                                                                                    i26 = 1515191;
                                                                                                                                                    while (true) {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    i26 ^= 1515208;
                                                                                                                                                                    switch (i26) {
                                                                                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                                                                                                            break;
                                                                                                                                                                        case 127:
                                                                                                                                                                            i26 = 1515222;
                                                                                                                                                                            break;
                                                                                                                                                                    }
                                                                                                                                                                } catch (SQLiteFullException e14) {
                                                                                                                                                                    e10 = e14;
                                                                                                                                                                    int i71 = 1512370;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i71 ^= 1512387;
                                                                                                                                                                        switch (i71) {
                                                                                                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                                                                break;
                                                                                                                                                                            case 113:
                                                                                                                                                                                i71 = 1512401;
                                                                                                                                                                                break;
                                                                                                                                                                            default:
                                                                                                                                                                                break;
                                                                                                                                                                        }
                                                                                                                                                                        i53 = 0;
                                                                                                                                                                        int i72 = 1509549;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i72 ^= 1509566;
                                                                                                                                                                            switch (i72) {
                                                                                                                                                                                case 19:
                                                                                                                                                                                    i72 = 1509580;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 114:
                                                                                                                                                                                    break;
                                                                                                                                                                                default:
                                                                                                                                                                                    break;
                                                                                                                                                                            }
                                                                                                                                                                            C0420.m8245(C0455.m8871(C0029.m572(b4VarM2310)), strM5471, e10);
                                                                                                                                                                            b4VarM2310.f9912d = true;
                                                                                                                                                                            i16 = 1543060;
                                                                                                                                                                            while (true) {
                                                                                                                                                                                i16 ^= 1543077;
                                                                                                                                                                                switch (i16) {
                                                                                                                                                                                    case 22:
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 49:
                                                                                                                                                                                        i16 = cursorM4442 != null ? 1543153 : 1543122;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 84:
                                                                                                                                                                                        C0228.m4391(cursorM4442);
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 119:
                                                                                                                                                                                        break;
                                                                                                                                                                                    default:
                                                                                                                                                                                        break;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            i17 = 1543184;
                                                                                                                                                                            while (true) {
                                                                                                                                                                                i17 ^= 1543201;
                                                                                                                                                                                switch (i17) {
                                                                                                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 49:
                                                                                                                                                                                        i17 = sQLiteDatabaseM9147 != null ? 1543277 : 1543246;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 76:
                                                                                                                                                                                        C0160.m3061(sQLiteDatabaseM9147);
                                                                                                                                                                                        i14 = i51;
                                                                                                                                                                                        i54 = i45;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 111:
                                                                                                                                                                                        i14 = i51;
                                                                                                                                                                                        i54 = i45;
                                                                                                                                                                                        break;
                                                                                                                                                                                    default:
                                                                                                                                                                                        break;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            int i73 = i52 + (C0370.f640 ^ (-375));
                                                                                                                                                                            i21 = 1543308;
                                                                                                                                                                            while (true) {
                                                                                                                                                                                i21 ^= 1543325;
                                                                                                                                                                                switch (i21) {
                                                                                                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                                        i21 = 1543990;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 939:
                                                                                                                                                                                        break;
                                                                                                                                                                                    default:
                                                                                                                                                                                        break;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            i51 = i14;
                                                                                                                                                                            i52 = i73;
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } catch (SQLiteException e15) {
                                                                                                                                                                e4 = e15;
                                                                                                                                                                int i74 = 1511595;
                                                                                                                                                                while (true) {
                                                                                                                                                                    i74 ^= 1511612;
                                                                                                                                                                    switch (i74) {
                                                                                                                                                                        case 23:
                                                                                                                                                                            i74 = 1512277;
                                                                                                                                                                            break;
                                                                                                                                                                        case 1001:
                                                                                                                                                                            break;
                                                                                                                                                                        default:
                                                                                                                                                                            break;
                                                                                                                                                                    }
                                                                                                                                                                    i53 = 0;
                                                                                                                                                                    int i75 = 1508650;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i75 ^= 1508667;
                                                                                                                                                                        switch (i75) {
                                                                                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                                i75 = 1508681;
                                                                                                                                                                                break;
                                                                                                                                                                            case 114:
                                                                                                                                                                                break;
                                                                                                                                                                            default:
                                                                                                                                                                                break;
                                                                                                                                                                        }
                                                                                                                                                                        sQLiteDatabase = sQLiteDatabaseM9147;
                                                                                                                                                                        i10 = 1539216;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i10 ^= 1539233;
                                                                                                                                                                            switch (i10) {
                                                                                                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                                                                                                    break;
                                                                                                                                                                                case 49:
                                                                                                                                                                                    i10 = sQLiteDatabase != null ? 1539309 : 1539278;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 76:
                                                                                                                                                                                    try {
                                                                                                                                                                                        zM3035 = C0159.m3035(sQLiteDatabase);
                                                                                                                                                                                        i15 = 1539340;
                                                                                                                                                                                        while (true) {
                                                                                                                                                                                            i15 ^= 1539357;
                                                                                                                                                                                            switch (i15) {
                                                                                                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                                                    i15 = zM3035 ? 1539433 : 1539402;
                                                                                                                                                                                                    break;
                                                                                                                                                                                                case 54:
                                                                                                                                                                                                    break;
                                                                                                                                                                                                case 87:
                                                                                                                                                                                                    break;
                                                                                                                                                                                                case 116:
                                                                                                                                                                                                    C0320.m6188(sQLiteDatabase);
                                                                                                                                                                                                    break;
                                                                                                                                                                                                default:
                                                                                                                                                                                                    break;
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    } catch (Throwable th) {
                                                                                                                                                                                        th = th;
                                                                                                                                                                                        sQLiteDatabaseM9147 = sQLiteDatabase;
                                                                                                                                                                                        cursor = cursorM4442;
                                                                                                                                                                                        i20 = 55432;
                                                                                                                                                                                        while (true) {
                                                                                                                                                                                            i20 ^= 55449;
                                                                                                                                                                                            switch (i20) {
                                                                                                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                                                    i20 = 55463;
                                                                                                                                                                                                    continue;
                                                                                                                                                                                                    continue;
                                                                                                                                                                                                case 62:
                                                                                                                                                                                                    th = th;
                                                                                                                                                                                                    break;
                                                                                                                                                                                                default:
                                                                                                                                                                                                    continue;
                                                                                                                                                                                                    continue;
                                                                                                                                                                                            }
                                                                                                                                                                                            i18 = 1544083;
                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                i18 ^= 1544100;
                                                                                                                                                                                                switch (i18) {
                                                                                                                                                                                                    case 22:
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                                                                                                                                                                        i18 = cursor != null ? 1544176 : 1544145;
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case 84:
                                                                                                                                                                                                        C0228.m4391(cursor);
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case 117:
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    default:
                                                                                                                                                                                                        break;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            i19 = 1544207;
                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                i19 ^= 1544224;
                                                                                                                                                                                                switch (i19) {
                                                                                                                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case 47:
                                                                                                                                                                                                        i19 = sQLiteDatabaseM9147 != null ? 1544951 : 1544269;
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case 109:
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case 727:
                                                                                                                                                                                                        C0160.m3061(sQLiteDatabaseM9147);
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    default:
                                                                                                                                                                                                        break;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            throw th;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    break;
                                                                                                                                                                                case 111:
                                                                                                                                                                                    break;
                                                                                                                                                                                default:
                                                                                                                                                                                    break;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        C0420.m8245(C0455.m8871(C0029.m572(b4VarM2310)), strM5471, e4);
                                                                                                                                                                        b4VarM2310.f9912d = true;
                                                                                                                                                                        i11 = 1539464;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i11 ^= 1539481;
                                                                                                                                                                            switch (i11) {
                                                                                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                                    i11 = cursorM4442 != null ? 1540208 : 1540177;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 64939:
                                                                                                                                                                                    break;
                                                                                                                                                                                case 64968:
                                                                                                                                                                                    break;
                                                                                                                                                                                case 65001:
                                                                                                                                                                                    C0228.m4391(cursorM4442);
                                                                                                                                                                                    break;
                                                                                                                                                                                default:
                                                                                                                                                                                    break;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        i12 = 1540239;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i12 ^= 1540256;
                                                                                                                                                                            switch (i12) {
                                                                                                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                                                                                                    break;
                                                                                                                                                                                case 47:
                                                                                                                                                                                    i12 = sQLiteDatabase != null ? 1540332 : 1540301;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 76:
                                                                                                                                                                                    C0160.m3061(sQLiteDatabase);
                                                                                                                                                                                    i13 = 1540363;
                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        i13 ^= 1540380;
                                                                                                                                                                                        switch (i13) {
                                                                                                                                                                                            case 23:
                                                                                                                                                                                                i13 = 1540394;
                                                                                                                                                                                                break;
                                                                                                                                                                                            case 54:
                                                                                                                                                                                                break;
                                                                                                                                                                                            default:
                                                                                                                                                                                                break;
                                                                                                                                                                                        }
                                                                                                                                                                                        i14 = i51;
                                                                                                                                                                                        i54 = i45;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    break;
                                                                                                                                                                                case 109:
                                                                                                                                                                                    i14 = i51;
                                                                                                                                                                                    i54 = i45;
                                                                                                                                                                                    break;
                                                                                                                                                                                default:
                                                                                                                                                                                    break;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        int i76 = i52 + (C0370.f640 ^ (-375));
                                                                                                                                                                        i21 = 1543308;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i21 ^= 1543325;
                                                                                                                                                                            switch (i21) {
                                                                                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                                    i21 = 1543990;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 939:
                                                                                                                                                                                    break;
                                                                                                                                                                                default:
                                                                                                                                                                                    break;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        i51 = i14;
                                                                                                                                                                        i52 = i76;
                                                                                                                                                                        break;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        } catch (SQLiteDatabaseLockedException e16) {
                                                                                                                                                            int i77 = 1571952;
                                                                                                                                                            while (true) {
                                                                                                                                                                i77 ^= 1571969;
                                                                                                                                                                switch (i77) {
                                                                                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                                                                                        break;
                                                                                                                                                                    case 241:
                                                                                                                                                                        i77 = 1571983;
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                                i53 = 0;
                                                                                                                                                                i25 = 1509425;
                                                                                                                                                                while (true) {
                                                                                                                                                                    i25 ^= 1509442;
                                                                                                                                                                    switch (i25) {
                                                                                                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                                                            break;
                                                                                                                                                                        case 115:
                                                                                                                                                                            i25 = 1509456;
                                                                                                                                                                            break;
                                                                                                                                                                        default:
                                                                                                                                                                            break;
                                                                                                                                                                    }
                                                                                                                                                                    try {
                                                                                                                                                                        C0472.m9182(i51);
                                                                                                                                                                        i51 += C0441.f711 ^ (-870);
                                                                                                                                                                        i22 = 1541262;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i22 ^= 1541279;
                                                                                                                                                                            switch (i22) {
                                                                                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                                    i22 = cursorM4442 != null ? 1541355 : 1541324;
                                                                                                                                                                                    break;
                                                                                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                                                                    break;
                                                                                                                                                                                case 83:
                                                                                                                                                                                    break;
                                                                                                                                                                                case 116:
                                                                                                                                                                                    C0228.m4391(cursorM4442);
                                                                                                                                                                                    break;
                                                                                                                                                                                default:
                                                                                                                                                                                    break;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        i23 = 1541386;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i23 ^= 1541403;
                                                                                                                                                                            switch (i23) {
                                                                                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                                    i23 = sQLiteDatabaseM9147 != null ? 1542130 : 1542099;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 687:
                                                                                                                                                                                    break;
                                                                                                                                                                                case 712:
                                                                                                                                                                                    i14 = i51;
                                                                                                                                                                                    i54 = i45;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 745:
                                                                                                                                                                                    C0160.m3061(sQLiteDatabaseM9147);
                                                                                                                                                                                    i24 = 1542161;
                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        i24 ^= 1542178;
                                                                                                                                                                                        switch (i24) {
                                                                                                                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                                                                                break;
                                                                                                                                                                                            case 51:
                                                                                                                                                                                                i24 = 1542192;
                                                                                                                                                                                                break;
                                                                                                                                                                                            default:
                                                                                                                                                                                                break;
                                                                                                                                                                                        }
                                                                                                                                                                                        i14 = i51;
                                                                                                                                                                                        i54 = i45;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    break;
                                                                                                                                                                                default:
                                                                                                                                                                                    break;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        int i78 = i52 + (C0370.f640 ^ (-375));
                                                                                                                                                                        i21 = 1543308;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i21 ^= 1543325;
                                                                                                                                                                            switch (i21) {
                                                                                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                                    i21 = 1543990;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 939:
                                                                                                                                                                                    break;
                                                                                                                                                                                default:
                                                                                                                                                                                    break;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        i51 = i14;
                                                                                                                                                                        i52 = i78;
                                                                                                                                                                    } catch (Throwable th2) {
                                                                                                                                                                        th = th2;
                                                                                                                                                                        cursor = cursorM4442;
                                                                                                                                                                        i20 = 55432;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i20 ^= 55449;
                                                                                                                                                                            switch (i20) {
                                                                                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                                    i20 = 55463;
                                                                                                                                                                                    continue;
                                                                                                                                                                                    continue;
                                                                                                                                                                                case 62:
                                                                                                                                                                                    th = th;
                                                                                                                                                                                    break;
                                                                                                                                                                                default:
                                                                                                                                                                                    continue;
                                                                                                                                                                                    continue;
                                                                                                                                                                            }
                                                                                                                                                                            i18 = 1544083;
                                                                                                                                                                            while (true) {
                                                                                                                                                                                i18 ^= 1544100;
                                                                                                                                                                                switch (i18) {
                                                                                                                                                                                    case 22:
                                                                                                                                                                                        break;
                                                                                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                                                                                                                                                        if (cursor != null) {
                                                                                                                                                                                        }
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 84:
                                                                                                                                                                                        C0228.m4391(cursor);
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 117:
                                                                                                                                                                                        break;
                                                                                                                                                                                    default:
                                                                                                                                                                                        break;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            i19 = 1544207;
                                                                                                                                                                            while (true) {
                                                                                                                                                                                i19 ^= 1544224;
                                                                                                                                                                                switch (i19) {
                                                                                                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 47:
                                                                                                                                                                                        if (sQLiteDatabaseM9147 != null) {
                                                                                                                                                                                        }
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 109:
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 727:
                                                                                                                                                                                        C0160.m3061(sQLiteDatabaseM9147);
                                                                                                                                                                                        break;
                                                                                                                                                                                    default:
                                                                                                                                                                                        break;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            throw th;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } catch (a6.b e17) {
                                                                                                                                            C0135.m2604(C0455.m8871(C0029.m572(b4VarM2310)), C0380.m7435(m6595(), 1526, C0193.f217 ^ 252, 2391));
                                                                                                                                            C0082.m1756(parcelM7521);
                                                                                                                                            t7Var = null;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th3) {
                                                                                                                                        int i79 = 1509673;
                                                                                                                                        while (true) {
                                                                                                                                            i79 ^= 1509690;
                                                                                                                                            switch (i79) {
                                                                                                                                                case 19:
                                                                                                                                                    i79 = 1510355;
                                                                                                                                                    break;
                                                                                                                                                case 745:
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                            C0082.m1756(parcelM7521);
                                                                                                                                            throw th3;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } catch (SQLiteDatabaseLockedException e18) {
                                                                                                                                    i53 = 0;
                                                                                                                                    i25 = 1509425;
                                                                                                                                    while (true) {
                                                                                                                                        i25 ^= 1509442;
                                                                                                                                        switch (i25) {
                                                                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                                break;
                                                                                                                                            case 115:
                                                                                                                                                i25 = 1509456;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                        C0472.m9182(i51);
                                                                                                                                        i51 += C0441.f711 ^ (-870);
                                                                                                                                        i22 = 1541262;
                                                                                                                                        while (true) {
                                                                                                                                            i22 ^= 1541279;
                                                                                                                                            switch (i22) {
                                                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                    if (cursorM4442 != null) {
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                                    break;
                                                                                                                                                case 83:
                                                                                                                                                    break;
                                                                                                                                                case 116:
                                                                                                                                                    C0228.m4391(cursorM4442);
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        i23 = 1541386;
                                                                                                                                        while (true) {
                                                                                                                                            i23 ^= 1541403;
                                                                                                                                            switch (i23) {
                                                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                    if (sQLiteDatabaseM9147 != null) {
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                case 687:
                                                                                                                                                    break;
                                                                                                                                                case 712:
                                                                                                                                                    i14 = i51;
                                                                                                                                                    i54 = i45;
                                                                                                                                                    break;
                                                                                                                                                case 745:
                                                                                                                                                    C0160.m3061(sQLiteDatabaseM9147);
                                                                                                                                                    i24 = 1542161;
                                                                                                                                                    while (true) {
                                                                                                                                                        i24 ^= 1542178;
                                                                                                                                                        switch (i24) {
                                                                                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                                                break;
                                                                                                                                                            case 51:
                                                                                                                                                                i24 = 1542192;
                                                                                                                                                                break;
                                                                                                                                                            default:
                                                                                                                                                                break;
                                                                                                                                                        }
                                                                                                                                                        i14 = i51;
                                                                                                                                                        i54 = i45;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        int i710 = i52 + (C0370.f640 ^ (-375));
                                                                                                                                        i21 = 1543308;
                                                                                                                                        while (true) {
                                                                                                                                            i21 ^= 1543325;
                                                                                                                                            switch (i21) {
                                                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                    i21 = 1543990;
                                                                                                                                                    break;
                                                                                                                                                case 939:
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        i51 = i14;
                                                                                                                                        i52 = i710;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 1480:
                                                                                                                                int i80 = 1511347;
                                                                                                                                while (true) {
                                                                                                                                    i80 ^= 1511364;
                                                                                                                                    switch (i80) {
                                                                                                                                        case 22:
                                                                                                                                            break;
                                                                                                                                        case 53:
                                                                                                                                            int i81 = 1514292;
                                                                                                                                            while (true) {
                                                                                                                                                i81 ^= 1514309;
                                                                                                                                                switch (i81) {
                                                                                                                                                    case 22:
                                                                                                                                                        break;
                                                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                                                                                                                        C0135.m2604(C0455.m8871(C0029.m572(b4VarM2310)), C0298.m5721(m6595(), 1659, C0129.f155 ^ 725, 1387));
                                                                                                                                                        break;
                                                                                                                                                    case 113:
                                                                                                                                                        i81 = iM7639 == 3 ? 1514385 : 1514354;
                                                                                                                                                        break;
                                                                                                                                                    case 212:
                                                                                                                                                        C0135.m2604(C0331.m6385(C0029.m572(b4VarM2310)), C0326.m6296(m6595(), 1634, C0154.f179 ^ (-64), 2787));
                                                                                                                                                        int i82 = 1514416;
                                                                                                                                                        while (true) {
                                                                                                                                                            i82 ^= 1514433;
                                                                                                                                                            switch (i82) {
                                                                                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                                                                                    break;
                                                                                                                                                                case 113:
                                                                                                                                                                    i82 = 1514447;
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
                                                                                                                                            i53 = 0;
                                                                                                                                            i26 = 1515191;
                                                                                                                                            while (true) {
                                                                                                                                                i26 ^= 1515208;
                                                                                                                                                switch (i26) {
                                                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                                                                                        break;
                                                                                                                                                    case 127:
                                                                                                                                                        i26 = 1515222;
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 119:
                                                                                                                                            i80 = iM7639 == 2 ? 1511440 : 1511409;
                                                                                                                                            break;
                                                                                                                                        case 8148:
                                                                                                                                            Parcel parcelM7522 = C0384.m7521();
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        C0127.m2460(parcelM7522, bArrM7292, 0, bArrM7292.length);
                                                                                                                                                        C0075.m1634(parcelM7522, 0);
                                                                                                                                                        eVar = (e) C0399.m7785(C0260.m4944(), parcelM7522);
                                                                                                                                                        C0082.m1756(parcelM7522);
                                                                                                                                                        int i83 = 1511471;
                                                                                                                                                        while (true) {
                                                                                                                                                            i83 ^= 1511488;
                                                                                                                                                            switch (i83) {
                                                                                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                                                                                    break;
                                                                                                                                                                case 111:
                                                                                                                                                                    i83 = 1511502;
                                                                                                                                                                    break;
                                                                                                                                                                default:
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                            int i84 = 1513393;
                                                                                                                                                            while (true) {
                                                                                                                                                                i84 ^= 1513410;
                                                                                                                                                                switch (i84) {
                                                                                                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                                                        break;
                                                                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                                                                                        break;
                                                                                                                                                                    case 115:
                                                                                                                                                                        i84 = eVar != null ? 1513486 : 1513455;
                                                                                                                                                                        break;
                                                                                                                                                                    case 4044:
                                                                                                                                                                        C0358.m6998(arrayList3, eVar);
                                                                                                                                                                        int i85 = 1513517;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i85 ^= 1513534;
                                                                                                                                                                            switch (i85) {
                                                                                                                                                                                case 19:
                                                                                                                                                                                    i85 = 1514199;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 745:
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
                                                                                                                                                            i27 = 56579;
                                                                                                                                                            while (true) {
                                                                                                                                                                i27 ^= 56596;
                                                                                                                                                                switch (i27) {
                                                                                                                                                                    case 23:
                                                                                                                                                                        i27 = 56610;
                                                                                                                                                                        break;
                                                                                                                                                                    case 54:
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                                i53 = 0;
                                                                                                                                                                i26 = 1515191;
                                                                                                                                                                while (true) {
                                                                                                                                                                    i26 ^= 1515208;
                                                                                                                                                                    switch (i26) {
                                                                                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                                                                                                            break;
                                                                                                                                                                        case 127:
                                                                                                                                                                            i26 = 1515222;
                                                                                                                                                                            break;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } catch (a6.b e19) {
                                                                                                                                                        int i86 = 1571177;
                                                                                                                                                        while (true) {
                                                                                                                                                            i86 ^= 1571194;
                                                                                                                                                            switch (i86) {
                                                                                                                                                                case 19:
                                                                                                                                                                    i86 = 1571859;
                                                                                                                                                                    break;
                                                                                                                                                                case 1385:
                                                                                                                                                                    break;
                                                                                                                                                                default:
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                            C0135.m2604(C0455.m8871(C0029.m572(b4VarM2310)), C0292.m5607(m6595(), 1574, C0236.f315 ^ (-651), 1822));
                                                                                                                                                            C0082.m1756(parcelM7522);
                                                                                                                                                            eVar = null;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th4) {
                                                                                                                                                    th = th4;
                                                                                                                                                    int i87 = 1512494;
                                                                                                                                                    while (true) {
                                                                                                                                                        i87 ^= 1512511;
                                                                                                                                                        switch (i87) {
                                                                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                i87 = 1512525;
                                                                                                                                                                break;
                                                                                                                                                            case 114:
                                                                                                                                                                break;
                                                                                                                                                            default:
                                                                                                                                                                break;
                                                                                                                                                        }
                                                                                                                                                        C0082.m1756(parcelM7522);
                                                                                                                                                        throw th;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            } catch (a6.b e20) {
                                                                                                                                            } catch (Throwable th5) {
                                                                                                                                                th = th5;
                                                                                                                                                int i88 = 1513269;
                                                                                                                                                while (true) {
                                                                                                                                                    i88 ^= 1513286;
                                                                                                                                                    switch (i88) {
                                                                                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                                            break;
                                                                                                                                                        case 115:
                                                                                                                                                            i88 = 1513300;
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
                                                                                                                            case 1513:
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 1769:
                                                                                                                    Parcel parcelM7523 = C0384.m7521();
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            C0127.m2460(parcelM7523, bArrM7292, i53, bArrM7292.length);
                                                                                                                            C0075.m1634(parcelM7523, i53);
                                                                                                                            v vVar = (v) C0399.m7785(C0109.m2105(), parcelM7523);
                                                                                                                            C0082.m1756(parcelM7523);
                                                                                                                            int i89 = 54533;
                                                                                                                            while (true) {
                                                                                                                                i89 ^= 54550;
                                                                                                                                switch (i89) {
                                                                                                                                    case 19:
                                                                                                                                        i89 = vVar != null ? 54626 : 54595;
                                                                                                                                        break;
                                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                        break;
                                                                                                                                    case 85:
                                                                                                                                        break;
                                                                                                                                    case 116:
                                                                                                                                        C0358.m6998(arrayList3, vVar);
                                                                                                                                        int i90 = 54657;
                                                                                                                                        while (true) {
                                                                                                                                            i90 ^= 54674;
                                                                                                                                            switch (i90) {
                                                                                                                                                case 19:
                                                                                                                                                    i90 = 54688;
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
                                                                                                                            while (true) {
                                                                                                                                i27 ^= 56596;
                                                                                                                                switch (i27) {
                                                                                                                                    case 23:
                                                                                                                                        i27 = 56610;
                                                                                                                                        break;
                                                                                                                                    case 54:
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                                i53 = 0;
                                                                                                                                i26 = 1515191;
                                                                                                                                while (true) {
                                                                                                                                    i26 ^= 1515208;
                                                                                                                                    switch (i26) {
                                                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                                                                            break;
                                                                                                                                        case 127:
                                                                                                                                            i26 = 1515222;
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (Throwable th6) {
                                                                                                                            int i91 = 1507503;
                                                                                                                            while (true) {
                                                                                                                                i91 ^= 1507520;
                                                                                                                                switch (i91) {
                                                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                                                        C0082.m1756(parcelM7523);
                                                                                                                                        throw th6;
                                                                                                                                    case 111:
                                                                                                                                        i91 = 1507534;
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } catch (a6.b e21) {
                                                                                                                        C0135.m2604(C0455.m8871(C0029.m572(b4VarM2310)), C0189.m3620(m6595(), 1486, C0452.f722 ^ 740, 2785));
                                                                                                                        C0082.m1756(parcelM7523);
                                                                                                                        int i92 = 1507627;
                                                                                                                        while (true) {
                                                                                                                            i92 ^= 1507644;
                                                                                                                            switch (i92) {
                                                                                                                                case 23:
                                                                                                                                    i92 = 1507658;
                                                                                                                                    break;
                                                                                                                                case 118:
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    i27 = 56579;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (SQLiteDatabaseLockedException e22) {
                                                                                                        int i93 = 1515315;
                                                                                                        while (true) {
                                                                                                            i93 ^= 1515332;
                                                                                                            switch (i93) {
                                                                                                                case 22:
                                                                                                                    break;
                                                                                                                case 119:
                                                                                                                    i93 = 1515346;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } catch (SQLiteFullException e23) {
                                                                                                    e10 = e23;
                                                                                                } catch (SQLiteException e24) {
                                                                                                    e4 = e24;
                                                                                                }
                                                                                                break;
                                                                                            case 83:
                                                                                                i53 = 0;
                                                                                                i46 = 0;
                                                                                                try {
                                                                                                    int iM4375 = C0228.m4375(sQLiteDatabaseM9147, C0364.m7119(m6595(), 1696, C0033.f53 ^ (-236), 3260), C0296.m5683(m6595(), 1704, C0278.f422 ^ (-444), 1325), new String[]{C0180.m3442(jM7701)});
                                                                                                    int iM4638 = C0242.m4637(arrayList3);
                                                                                                    int i94 = 1515439;
                                                                                                    while (true) {
                                                                                                        i94 ^= 1515456;
                                                                                                        switch (i94) {
                                                                                                            case 111:
                                                                                                                i94 = iM4375 < iM4638 ? 1516183 : 1516152;
                                                                                                                break;
                                                                                                            case 15703:
                                                                                                                C0135.m2604(C0455.m8871(C0029.m572(b4VarM2310)), C0318.m6156(m6595(), 1714, C0043.f63 ^ 865, 908));
                                                                                                                int i95 = 1516214;
                                                                                                                while (true) {
                                                                                                                    i95 ^= 1516231;
                                                                                                                    switch (i95) {
                                                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                            break;
                                                                                                                        case 113:
                                                                                                                            i95 = 1516245;
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                }
                                                                                                                break;
                                                                                                            case 15769:
                                                                                                                break;
                                                                                                            case 15800:
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    C0435.m8501(sQLiteDatabaseM9147);
                                                                                                    C0320.m6188(sQLiteDatabaseM9147);
                                                                                                    C0228.m4391(cursorM4442);
                                                                                                    C0160.m3061(sQLiteDatabaseM9147);
                                                                                                    int i96 = 1537418;
                                                                                                    while (true) {
                                                                                                        i96 ^= 1537435;
                                                                                                        switch (i96) {
                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                i96 = 1537449;
                                                                                                                break;
                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                i28 = 49666;
                                                                                                                while (true) {
                                                                                                                    i28 ^= 49683;
                                                                                                                    switch (i28) {
                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                            i28 = 49697;
                                                                                                                            break;
                                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    arrayList = arrayList3;
                                                                                                                    i29 = 1545106;
                                                                                                                    while (true) {
                                                                                                                        i29 ^= 1545123;
                                                                                                                        switch (i29) {
                                                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                break;
                                                                                                                            case 49:
                                                                                                                                if (arrayList != null) {
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 76:
                                                                                                                                C0393.m7672(arrayList2, arrayList);
                                                                                                                                iM171 = C0008.m171(arrayList);
                                                                                                                                i42 = 1545230;
                                                                                                                                while (true) {
                                                                                                                                    i42 ^= 1545247;
                                                                                                                                    switch (i42) {
                                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                            i42 = 1545912;
                                                                                                                                            break;
                                                                                                                                        case 679:
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 115:
                                                                                                                                iM171 = i46;
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    i30 = 1546005;
                                                                                                                    while (true) {
                                                                                                                        i30 ^= 1546022;
                                                                                                                        switch (i30) {
                                                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                break;
                                                                                                                            case 51:
                                                                                                                                if (aVar != null) {
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 84:
                                                                                                                                i41 = 1546129;
                                                                                                                                while (true) {
                                                                                                                                    i41 ^= 1546146;
                                                                                                                                    switch (i41) {
                                                                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                            break;
                                                                                                                                        case 51:
                                                                                                                                            if (iM171 < 100) {
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 109:
                                                                                                                                            break;
                                                                                                                                        case 32492:
                                                                                                                                            C0358.m6998(arrayList2, aVar);
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 117:
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    iM4637 = C0242.m4637(arrayList2);
                                                                                                                    i31 = i46;
                                                                                                                    while (true) {
                                                                                                                        i32 = 1567085;
                                                                                                                        while (true) {
                                                                                                                            i32 ^= 1567102;
                                                                                                                            switch (i32) {
                                                                                                                                case 19:
                                                                                                                                    if (i31 < iM4637) {
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 180:
                                                                                                                                    Object objM4487 = C0234.m4486(arrayList2, i31);
                                                                                                                                    int i510 = C0036.f56;
                                                                                                                                    aVar2 = (a6.a) objM4487;
                                                                                                                                    z10 = aVar2 instanceof v;
                                                                                                                                    i33 = 1567209;
                                                                                                                                    while (true) {
                                                                                                                                        i33 ^= 1567226;
                                                                                                                                        switch (i33) {
                                                                                                                                            case 19:
                                                                                                                                                if (z10) {
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            case 956:
                                                                                                                                                C0493.m9585(y3Var, (v) aVar2, x7Var);
                                                                                                                                                i39 = 1567333;
                                                                                                                                                while (true) {
                                                                                                                                                    i39 ^= 1567350;
                                                                                                                                                    switch (i39) {
                                                                                                                                                        case 19:
                                                                                                                                                            i39 = 1568015;
                                                                                                                                                            break;
                                                                                                                                                        case 1913:
                                                                                                                                                            break;
                                                                                                                                                        default:
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            case 989:
                                                                                                                                                z11 = aVar2 instanceof t7;
                                                                                                                                                i34 = 1568232;
                                                                                                                                                while (true) {
                                                                                                                                                    i34 ^= 1568249;
                                                                                                                                                    switch (i34) {
                                                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                            if (z11) {
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        case 991:
                                                                                                                                                            z12 = aVar2 instanceof e;
                                                                                                                                                            i35 = 1569255;
                                                                                                                                                            while (true) {
                                                                                                                                                                i35 ^= 1569272;
                                                                                                                                                                switch (i35) {
                                                                                                                                                                    case 31:
                                                                                                                                                                        if (z12) {
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 1335:
                                                                                                                                                                        C0430.m8410(y3Var, (e) aVar2, x7Var);
                                                                                                                                                                        i36 = 1570030;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i36 ^= 1570047;
                                                                                                                                                                            switch (i36) {
                                                                                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                                    i36 = 1570061;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 498:
                                                                                                                                                                                    break;
                                                                                                                                                                                default:
                                                                                                                                                                                    break;
                                                                                                                                                                            }
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 1352:
                                                                                                                                                                        C0135.m2604(C0455.m8871(C0029.m572(this)), C0046.m889(m6595(), 1956, C0109.f135 ^ 105, 380));
                                                                                                                                                                        break;
                                                                                                                                                                    case 1385:
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        case 1022:
                                                                                                                                                            break;
                                                                                                                                                        case 7465:
                                                                                                                                                            C0298.m5725(y3Var, (t7) aVar2, x7Var);
                                                                                                                                                            i37 = 1569007;
                                                                                                                                                            while (true) {
                                                                                                                                                                i37 ^= 1569024;
                                                                                                                                                                switch (i37) {
                                                                                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                                                                                        break;
                                                                                                                                                                    case 495:
                                                                                                                                                                        i37 = 1569038;
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
                                                                                                                                            case 1010:
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    int i610 = (i510 ^ 43) + i31;
                                                                                                                                    i38 = 1570929;
                                                                                                                                    while (true) {
                                                                                                                                        i38 ^= 1570946;
                                                                                                                                        switch (i38) {
                                                                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                                break;
                                                                                                                                            case 243:
                                                                                                                                                i38 = 1570960;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    i31 = i610;
                                                                                                                                    break;
                                                                                                                                case 213:
                                                                                                                                    break;
                                                                                                                                case 242:
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            i45 += C0393.f663 ^ 576;
                                                                                                                            i40 = 1571053;
                                                                                                                            while (true) {
                                                                                                                                i40 ^= 1571070;
                                                                                                                                switch (i40) {
                                                                                                                                    case 19:
                                                                                                                                        i40 = 1571084;
                                                                                                                                        break;
                                                                                                                                    case 498:
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            i44 = iM171;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                } catch (SQLiteDatabaseLockedException e25) {
                                                                                                    int i97 = 1572076;
                                                                                                    while (true) {
                                                                                                        i97 ^= 1572093;
                                                                                                        switch (i97) {
                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                i97 = 1572107;
                                                                                                                break;
                                                                                                            case 502:
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                        i53 = 0;
                                                                                                        C0472.m9182(i51);
                                                                                                        i51 += C0441.f711 ^ (-870);
                                                                                                        i22 = 1541262;
                                                                                                        while (true) {
                                                                                                            i22 ^= 1541279;
                                                                                                            switch (i22) {
                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                    if (cursorM4442 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                    break;
                                                                                                                case 83:
                                                                                                                    break;
                                                                                                                case 116:
                                                                                                                    C0228.m4391(cursorM4442);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        i23 = 1541386;
                                                                                                        while (true) {
                                                                                                            i23 ^= 1541403;
                                                                                                            switch (i23) {
                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                    if (sQLiteDatabaseM9147 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 687:
                                                                                                                    break;
                                                                                                                case 712:
                                                                                                                    i14 = i51;
                                                                                                                    i54 = i45;
                                                                                                                    break;
                                                                                                                case 745:
                                                                                                                    C0160.m3061(sQLiteDatabaseM9147);
                                                                                                                    i24 = 1542161;
                                                                                                                    while (true) {
                                                                                                                        i24 ^= 1542178;
                                                                                                                        switch (i24) {
                                                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                break;
                                                                                                                            case 51:
                                                                                                                                i24 = 1542192;
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        i14 = i51;
                                                                                                                        i54 = i45;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        int i711 = i52 + (C0370.f640 ^ (-375));
                                                                                                        i21 = 1543308;
                                                                                                        while (true) {
                                                                                                            i21 ^= 1543325;
                                                                                                            switch (i21) {
                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                    i21 = 1543990;
                                                                                                                    break;
                                                                                                                case 939:
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        i51 = i14;
                                                                                                        i52 = i711;
                                                                                                        break;
                                                                                                    }
                                                                                                } catch (SQLiteFullException e26) {
                                                                                                    e10 = e26;
                                                                                                    int i98 = 1537294;
                                                                                                    while (true) {
                                                                                                        i98 ^= 1537311;
                                                                                                        switch (i98) {
                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                i98 = 1537325;
                                                                                                                break;
                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                        i53 = 0;
                                                                                                        C0420.m8245(C0455.m8871(C0029.m572(b4VarM2310)), strM5471, e10);
                                                                                                        b4VarM2310.f9912d = true;
                                                                                                        i16 = 1543060;
                                                                                                        while (true) {
                                                                                                            i16 ^= 1543077;
                                                                                                            switch (i16) {
                                                                                                                case 22:
                                                                                                                    break;
                                                                                                                case 49:
                                                                                                                    if (cursorM4442 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 84:
                                                                                                                    C0228.m4391(cursorM4442);
                                                                                                                    break;
                                                                                                                case 119:
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        i17 = 1543184;
                                                                                                        while (true) {
                                                                                                            i17 ^= 1543201;
                                                                                                            switch (i17) {
                                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                                    break;
                                                                                                                case 49:
                                                                                                                    if (sQLiteDatabaseM9147 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 76:
                                                                                                                    C0160.m3061(sQLiteDatabaseM9147);
                                                                                                                    i14 = i51;
                                                                                                                    i54 = i45;
                                                                                                                    break;
                                                                                                                case 111:
                                                                                                                    i14 = i51;
                                                                                                                    i54 = i45;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        int i712 = i52 + (C0370.f640 ^ (-375));
                                                                                                        i21 = 1543308;
                                                                                                        while (true) {
                                                                                                            i21 ^= 1543325;
                                                                                                            switch (i21) {
                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                    i21 = 1543990;
                                                                                                                    break;
                                                                                                                case 939:
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        i51 = i14;
                                                                                                        i52 = i712;
                                                                                                        break;
                                                                                                    }
                                                                                                } catch (SQLiteException e27) {
                                                                                                    e4 = e27;
                                                                                                    int i99 = 1516338;
                                                                                                    while (true) {
                                                                                                        i99 ^= 1516355;
                                                                                                        switch (i99) {
                                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                break;
                                                                                                            case 113:
                                                                                                                i99 = 1516369;
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                        sQLiteDatabase = sQLiteDatabaseM9147;
                                                                                                        i10 = 1539216;
                                                                                                        while (true) {
                                                                                                            i10 ^= 1539233;
                                                                                                            switch (i10) {
                                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                                    break;
                                                                                                                case 49:
                                                                                                                    if (sQLiteDatabase != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 76:
                                                                                                                    zM3035 = C0159.m3035(sQLiteDatabase);
                                                                                                                    i15 = 1539340;
                                                                                                                    while (true) {
                                                                                                                        i15 ^= 1539357;
                                                                                                                        switch (i15) {
                                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                if (zM3035) {
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 54:
                                                                                                                                break;
                                                                                                                            case 87:
                                                                                                                                break;
                                                                                                                            case 116:
                                                                                                                                C0320.m6188(sQLiteDatabase);
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 111:
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        C0420.m8245(C0455.m8871(C0029.m572(b4VarM2310)), strM5471, e4);
                                                                                                        b4VarM2310.f9912d = true;
                                                                                                        i11 = 1539464;
                                                                                                        while (true) {
                                                                                                            i11 ^= 1539481;
                                                                                                            switch (i11) {
                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                    if (cursorM4442 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 64939:
                                                                                                                    break;
                                                                                                                case 64968:
                                                                                                                    break;
                                                                                                                case 65001:
                                                                                                                    C0228.m4391(cursorM4442);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        i12 = 1540239;
                                                                                                        while (true) {
                                                                                                            i12 ^= 1540256;
                                                                                                            switch (i12) {
                                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                                    break;
                                                                                                                case 47:
                                                                                                                    if (sQLiteDatabase != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 76:
                                                                                                                    C0160.m3061(sQLiteDatabase);
                                                                                                                    i13 = 1540363;
                                                                                                                    while (true) {
                                                                                                                        i13 ^= 1540380;
                                                                                                                        switch (i13) {
                                                                                                                            case 23:
                                                                                                                                i13 = 1540394;
                                                                                                                                break;
                                                                                                                            case 54:
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        i14 = i51;
                                                                                                                        i54 = i45;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 109:
                                                                                                                    i14 = i51;
                                                                                                                    i54 = i45;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        int i713 = i52 + (C0370.f640 ^ (-375));
                                                                                                        i21 = 1543308;
                                                                                                        while (true) {
                                                                                                            i21 ^= 1543325;
                                                                                                            switch (i21) {
                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                    i21 = 1543990;
                                                                                                                    break;
                                                                                                                case 939:
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        i51 = i14;
                                                                                                        i52 = i713;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                } catch (SQLiteFullException e28) {
                                                                                    e10 = e28;
                                                                                    int i100 = 56455;
                                                                                    while (true) {
                                                                                        i100 ^= 56472;
                                                                                        switch (i100) {
                                                                                            case 31:
                                                                                                i100 = 56486;
                                                                                                break;
                                                                                            case 62:
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException e29) {
                                                                                int i101 = 55680;
                                                                                while (true) {
                                                                                    i101 ^= 55697;
                                                                                    switch (i101) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i101 = 56362;
                                                                                            break;
                                                                                        case 1467:
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (SQLiteException e30) {
                                                                            e4 = e30;
                                                                            int i102 = 55556;
                                                                            while (true) {
                                                                                i102 ^= 55573;
                                                                                switch (i102) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i102 = 55587;
                                                                                        break;
                                                                                    case 54:
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                                sQLiteDatabase = sQLiteDatabaseM9147;
                                                                            }
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1769:
                                                                    try {
                                                                        b4VarM2310.f9912d = true;
                                                                        int i103 = 50689;
                                                                        while (true) {
                                                                            i103 ^= 50706;
                                                                            switch (i103) {
                                                                                case 19:
                                                                                    i103 = sQLiteDatabaseM9147 != null ? 50782 : 50751;
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    i46 = i53;
                                                                                    i45 = i54;
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                case 76:
                                                                                    C0160.m3061(sQLiteDatabaseM9147);
                                                                                    int i104 = 50813;
                                                                                    while (true) {
                                                                                        i104 ^= 50830;
                                                                                        switch (i104) {
                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                break;
                                                                                            case 243:
                                                                                                i104 = 50844;
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                        i46 = i53;
                                                                                        i45 = i54;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        arrayList = null;
                                                                        i43 = 48767;
                                                                        while (true) {
                                                                            i43 ^= 48784;
                                                                            switch (i43) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case 239:
                                                                                    i43 = 48798;
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                            i29 = 1545106;
                                                                            while (true) {
                                                                                i29 ^= 1545123;
                                                                                switch (i29) {
                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case 49:
                                                                                        if (arrayList != null) {
                                                                                        }
                                                                                        break;
                                                                                    case 76:
                                                                                        C0393.m7672(arrayList2, arrayList);
                                                                                        iM171 = C0008.m171(arrayList);
                                                                                        i42 = 1545230;
                                                                                        while (true) {
                                                                                            i42 ^= 1545247;
                                                                                            switch (i42) {
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i42 = 1545912;
                                                                                                    break;
                                                                                                case 679:
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 115:
                                                                                        iM171 = i46;
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i30 = 1546005;
                                                                            while (true) {
                                                                                i30 ^= 1546022;
                                                                                switch (i30) {
                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case 51:
                                                                                        if (aVar != null) {
                                                                                        }
                                                                                        break;
                                                                                    case 84:
                                                                                        i41 = 1546129;
                                                                                        while (true) {
                                                                                            i41 ^= 1546146;
                                                                                            switch (i41) {
                                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                    break;
                                                                                                case 51:
                                                                                                    if (iM171 < 100) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 109:
                                                                                                    break;
                                                                                                case 32492:
                                                                                                    C0358.m6998(arrayList2, aVar);
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 117:
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            iM4637 = C0242.m4637(arrayList2);
                                                                            i31 = i46;
                                                                            while (true) {
                                                                                i32 = 1567085;
                                                                                while (true) {
                                                                                    i32 ^= 1567102;
                                                                                    switch (i32) {
                                                                                        case 19:
                                                                                            if (i31 < iM4637) {
                                                                                            }
                                                                                            break;
                                                                                        case 180:
                                                                                            Object objM4488 = C0234.m4486(arrayList2, i31);
                                                                                            int i511 = C0036.f56;
                                                                                            aVar2 = (a6.a) objM4488;
                                                                                            z10 = aVar2 instanceof v;
                                                                                            i33 = 1567209;
                                                                                            while (true) {
                                                                                                i33 ^= 1567226;
                                                                                                switch (i33) {
                                                                                                    case 19:
                                                                                                        if (z10) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 956:
                                                                                                        C0493.m9585(y3Var, (v) aVar2, x7Var);
                                                                                                        i39 = 1567333;
                                                                                                        while (true) {
                                                                                                            i39 ^= 1567350;
                                                                                                            switch (i39) {
                                                                                                                case 19:
                                                                                                                    i39 = 1568015;
                                                                                                                    break;
                                                                                                                case 1913:
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                        break;
                                                                                                    case 989:
                                                                                                        z11 = aVar2 instanceof t7;
                                                                                                        i34 = 1568232;
                                                                                                        while (true) {
                                                                                                            i34 ^= 1568249;
                                                                                                            switch (i34) {
                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                    if (z11) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 991:
                                                                                                                    z12 = aVar2 instanceof e;
                                                                                                                    i35 = 1569255;
                                                                                                                    while (true) {
                                                                                                                        i35 ^= 1569272;
                                                                                                                        switch (i35) {
                                                                                                                            case 31:
                                                                                                                                if (z12) {
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 1335:
                                                                                                                                C0430.m8410(y3Var, (e) aVar2, x7Var);
                                                                                                                                i36 = 1570030;
                                                                                                                                while (true) {
                                                                                                                                    i36 ^= 1570047;
                                                                                                                                    switch (i36) {
                                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                            i36 = 1570061;
                                                                                                                                            break;
                                                                                                                                        case 498:
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 1352:
                                                                                                                                C0135.m2604(C0455.m8871(C0029.m572(this)), C0046.m889(m6595(), 1956, C0109.f135 ^ 105, 380));
                                                                                                                                break;
                                                                                                                            case 1385:
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 1022:
                                                                                                                    break;
                                                                                                                case 7465:
                                                                                                                    C0298.m5725(y3Var, (t7) aVar2, x7Var);
                                                                                                                    i37 = 1569007;
                                                                                                                    while (true) {
                                                                                                                        i37 ^= 1569024;
                                                                                                                        switch (i37) {
                                                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                                                break;
                                                                                                                            case 495:
                                                                                                                                i37 = 1569038;
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
                                                                                                    case 1010:
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            int i611 = (i511 ^ 43) + i31;
                                                                                            i38 = 1570929;
                                                                                            while (true) {
                                                                                                i38 ^= 1570946;
                                                                                                switch (i38) {
                                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                        break;
                                                                                                    case 243:
                                                                                                        i38 = 1570960;
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            i31 = i611;
                                                                                            break;
                                                                                        case 213:
                                                                                            break;
                                                                                        case 242:
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                    i45 += C0393.f663 ^ 576;
                                                                                    i40 = 1571053;
                                                                                    while (true) {
                                                                                        i40 ^= 1571070;
                                                                                        switch (i40) {
                                                                                            case 19:
                                                                                                i40 = 1571084;
                                                                                                break;
                                                                                            case 498:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    i44 = iM171;
                                                                                }
                                                                            }
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException e31) {
                                                                        int i105 = 51836;
                                                                        while (true) {
                                                                            i105 ^= 51853;
                                                                            switch (i105) {
                                                                                case 241:
                                                                                    i105 = 52518;
                                                                                    break;
                                                                                case 1963:
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                            cursorM4442 = null;
                                                                            int i106 = 1537542;
                                                                            while (true) {
                                                                                i106 ^= 1537559;
                                                                                switch (i106) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i106 = 1538224;
                                                                                        break;
                                                                                    case 3751:
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                                i45 = i54;
                                                                                C0472.m9182(i51);
                                                                                i51 += C0441.f711 ^ (-870);
                                                                                i22 = 1541262;
                                                                                while (true) {
                                                                                    i22 ^= 1541279;
                                                                                    switch (i22) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            if (cursorM4442 != null) {
                                                                                            }
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            break;
                                                                                        case 83:
                                                                                            break;
                                                                                        case 116:
                                                                                            C0228.m4391(cursorM4442);
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                i23 = 1541386;
                                                                                while (true) {
                                                                                    i23 ^= 1541403;
                                                                                    switch (i23) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            if (sQLiteDatabaseM9147 != null) {
                                                                                            }
                                                                                            break;
                                                                                        case 687:
                                                                                            break;
                                                                                        case 712:
                                                                                            i14 = i51;
                                                                                            i54 = i45;
                                                                                            break;
                                                                                        case 745:
                                                                                            C0160.m3061(sQLiteDatabaseM9147);
                                                                                            i24 = 1542161;
                                                                                            while (true) {
                                                                                                i24 ^= 1542178;
                                                                                                switch (i24) {
                                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                        break;
                                                                                                    case 51:
                                                                                                        i24 = 1542192;
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                                i14 = i51;
                                                                                                i54 = i45;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                int i714 = i52 + (C0370.f640 ^ (-375));
                                                                                i21 = 1543308;
                                                                                while (true) {
                                                                                    i21 ^= 1543325;
                                                                                    switch (i21) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i21 = 1543990;
                                                                                            break;
                                                                                        case 939:
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                i51 = i14;
                                                                                i52 = i714;
                                                                            }
                                                                        }
                                                                    } catch (SQLiteFullException e32) {
                                                                        e10 = e32;
                                                                        sQLiteDatabase2 = sQLiteDatabaseM9147;
                                                                        cursorM4442 = null;
                                                                        int i107 = 52611;
                                                                        while (true) {
                                                                            i107 ^= 52628;
                                                                            switch (i107) {
                                                                                case 23:
                                                                                    i107 = 52642;
                                                                                    break;
                                                                                case 54:
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                            sQLiteDatabaseM9147 = sQLiteDatabase2;
                                                                            i45 = i54;
                                                                            C0420.m8245(C0455.m8871(C0029.m572(b4VarM2310)), strM5471, e10);
                                                                            b4VarM2310.f9912d = true;
                                                                            i16 = 1543060;
                                                                            while (true) {
                                                                                i16 ^= 1543077;
                                                                                switch (i16) {
                                                                                    case 22:
                                                                                        break;
                                                                                    case 49:
                                                                                        if (cursorM4442 != null) {
                                                                                        }
                                                                                        break;
                                                                                    case 84:
                                                                                        C0228.m4391(cursorM4442);
                                                                                        break;
                                                                                    case 119:
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i17 = 1543184;
                                                                            while (true) {
                                                                                i17 ^= 1543201;
                                                                                switch (i17) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case 49:
                                                                                        if (sQLiteDatabaseM9147 != null) {
                                                                                        }
                                                                                        break;
                                                                                    case 76:
                                                                                        C0160.m3061(sQLiteDatabaseM9147);
                                                                                        i14 = i51;
                                                                                        i54 = i45;
                                                                                        break;
                                                                                    case 111:
                                                                                        i14 = i51;
                                                                                        i54 = i45;
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            int i715 = i52 + (C0370.f640 ^ (-375));
                                                                            i21 = 1543308;
                                                                            while (true) {
                                                                                i21 ^= 1543325;
                                                                                switch (i21) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i21 = 1543990;
                                                                                        break;
                                                                                    case 939:
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i51 = i14;
                                                                            i52 = i715;
                                                                        }
                                                                    } catch (SQLiteException e33) {
                                                                        e4 = e33;
                                                                        sQLiteDatabase = sQLiteDatabaseM9147;
                                                                        int i108 = 51712;
                                                                        while (true) {
                                                                            i108 ^= 51729;
                                                                            switch (i108) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case 15:
                                                                                case Code.UNAUTHENTICATED /* 16 */:
                                                                                default:
                                                                                    break;
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i108 = 51743;
                                                                                    break;
                                                                            }
                                                                            cursorM4442 = null;
                                                                            i45 = i54;
                                                                            i10 = 1539216;
                                                                            while (true) {
                                                                                i10 ^= 1539233;
                                                                                switch (i10) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case 49:
                                                                                        if (sQLiteDatabase != null) {
                                                                                        }
                                                                                        break;
                                                                                    case 76:
                                                                                        zM3035 = C0159.m3035(sQLiteDatabase);
                                                                                        i15 = 1539340;
                                                                                        while (true) {
                                                                                            i15 ^= 1539357;
                                                                                            switch (i15) {
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    if (zM3035) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 54:
                                                                                                    break;
                                                                                                case 87:
                                                                                                    break;
                                                                                                case 116:
                                                                                                    C0320.m6188(sQLiteDatabase);
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 111:
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            C0420.m8245(C0455.m8871(C0029.m572(b4VarM2310)), strM5471, e4);
                                                                            b4VarM2310.f9912d = true;
                                                                            i11 = 1539464;
                                                                            while (true) {
                                                                                i11 ^= 1539481;
                                                                                switch (i11) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        if (cursorM4442 != null) {
                                                                                        }
                                                                                        break;
                                                                                    case 64939:
                                                                                        break;
                                                                                    case 64968:
                                                                                        break;
                                                                                    case 65001:
                                                                                        C0228.m4391(cursorM4442);
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i12 = 1540239;
                                                                            while (true) {
                                                                                i12 ^= 1540256;
                                                                                switch (i12) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case 47:
                                                                                        if (sQLiteDatabase != null) {
                                                                                        }
                                                                                        break;
                                                                                    case 76:
                                                                                        C0160.m3061(sQLiteDatabase);
                                                                                        i13 = 1540363;
                                                                                        while (true) {
                                                                                            i13 ^= 1540380;
                                                                                            switch (i13) {
                                                                                                case 23:
                                                                                                    i13 = 1540394;
                                                                                                    break;
                                                                                                case 54:
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                            i14 = i51;
                                                                                            i54 = i45;
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 109:
                                                                                        i14 = i51;
                                                                                        i54 = i45;
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            int i716 = i52 + (C0370.f640 ^ (-375));
                                                                            i21 = 1543308;
                                                                            while (true) {
                                                                                i21 ^= 1543325;
                                                                                switch (i21) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i21 = 1543990;
                                                                                        break;
                                                                                    case 939:
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i51 = i14;
                                                                            i52 = i716;
                                                                        }
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        cursor = null;
                                                                        int i109 = 51588;
                                                                        while (true) {
                                                                            i109 ^= 51605;
                                                                            switch (i109) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i109 = 51619;
                                                                                    continue;
                                                                                case 54:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                            i18 = 1544083;
                                                                            while (true) {
                                                                                i18 ^= 1544100;
                                                                                switch (i18) {
                                                                                    case 22:
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                                                        if (cursor != null) {
                                                                                        }
                                                                                        break;
                                                                                    case 84:
                                                                                        C0228.m4391(cursor);
                                                                                        break;
                                                                                    case 117:
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i19 = 1544207;
                                                                            while (true) {
                                                                                i19 ^= 1544224;
                                                                                switch (i19) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case 47:
                                                                                        if (sQLiteDatabaseM9147 != null) {
                                                                                        }
                                                                                        break;
                                                                                    case 109:
                                                                                        break;
                                                                                    case 727:
                                                                                        C0160.m3061(sQLiteDatabaseM9147);
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                    } catch (SQLiteDatabaseLockedException e34) {
                                                        sQLiteDatabaseM9147 = null;
                                                        int i110 = 1541138;
                                                        while (true) {
                                                            i110 ^= 1541155;
                                                            switch (i110) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 49:
                                                                    i110 = 1541169;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                    } catch (SQLiteFullException e35) {
                                                        sQLiteDatabase2 = null;
                                                        int i111 = 1542285;
                                                        while (true) {
                                                            i111 ^= 1542302;
                                                            switch (i111) {
                                                                case 19:
                                                                    i111 = 1542316;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                            e10 = e35;
                                                        }
                                                    } catch (SQLiteException e36) {
                                                        sQLiteDatabase = null;
                                                        int i112 = 1538441;
                                                        while (true) {
                                                            i112 ^= 1538458;
                                                            switch (i112) {
                                                                case 19:
                                                                    i112 = 1538472;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                            e4 = e36;
                                                        }
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        cursor = null;
                                                        sQLiteDatabaseM9147 = null;
                                                        int i113 = 1538317;
                                                        while (true) {
                                                            i113 ^= 1538334;
                                                            switch (i113) {
                                                                case 19:
                                                                    i113 = 1538348;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 241:
                                                    i55 = i52 < 5 ? 49883 : 49852;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        i51 = i14;
                                        i52 = i716;
                                    }
                                    break;
                                case 503:
                                    i50 = !zM5755 ? 49635 : 48953;
                                    break;
                                case 32495:
                                    i28 = 49666;
                                    while (true) {
                                        i28 ^= 49683;
                                        switch (i28) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i28 = 49697;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            default:
                                                break;
                                        }
                                        arrayList = arrayList3;
                                        i29 = 1545106;
                                        while (true) {
                                            i29 ^= 1545123;
                                            switch (i29) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 49:
                                                    if (arrayList != null) {
                                                    }
                                                    break;
                                                case 76:
                                                    C0393.m7672(arrayList2, arrayList);
                                                    iM171 = C0008.m171(arrayList);
                                                    i42 = 1545230;
                                                    while (true) {
                                                        i42 ^= 1545247;
                                                        switch (i42) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i42 = 1545912;
                                                                break;
                                                            case 679:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                case 115:
                                                    iM171 = i46;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        i30 = 1546005;
                                        while (true) {
                                            i30 ^= 1546022;
                                            switch (i30) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 51:
                                                    if (aVar != null) {
                                                    }
                                                    break;
                                                case 84:
                                                    i41 = 1546129;
                                                    while (true) {
                                                        i41 ^= 1546146;
                                                        switch (i41) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 51:
                                                                if (iM171 < 100) {
                                                                }
                                                                break;
                                                            case 109:
                                                                break;
                                                            case 32492:
                                                                C0358.m6998(arrayList2, aVar);
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 117:
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        iM4637 = C0242.m4637(arrayList2);
                                        i31 = i46;
                                        while (true) {
                                            i32 = 1567085;
                                            while (true) {
                                                i32 ^= 1567102;
                                                switch (i32) {
                                                    case 19:
                                                        if (i31 < iM4637) {
                                                        }
                                                        break;
                                                    case 180:
                                                        Object objM4489 = C0234.m4486(arrayList2, i31);
                                                        int i512 = C0036.f56;
                                                        aVar2 = (a6.a) objM4489;
                                                        z10 = aVar2 instanceof v;
                                                        i33 = 1567209;
                                                        while (true) {
                                                            i33 ^= 1567226;
                                                            switch (i33) {
                                                                case 19:
                                                                    if (z10) {
                                                                    }
                                                                    break;
                                                                case 956:
                                                                    C0493.m9585(y3Var, (v) aVar2, x7Var);
                                                                    i39 = 1567333;
                                                                    while (true) {
                                                                        i39 ^= 1567350;
                                                                        switch (i39) {
                                                                            case 19:
                                                                                i39 = 1568015;
                                                                                break;
                                                                            case 1913:
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 989:
                                                                    z11 = aVar2 instanceof t7;
                                                                    i34 = 1568232;
                                                                    while (true) {
                                                                        i34 ^= 1568249;
                                                                        switch (i34) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (z11) {
                                                                                }
                                                                                break;
                                                                            case 991:
                                                                                z12 = aVar2 instanceof e;
                                                                                i35 = 1569255;
                                                                                while (true) {
                                                                                    i35 ^= 1569272;
                                                                                    switch (i35) {
                                                                                        case 31:
                                                                                            if (z12) {
                                                                                            }
                                                                                            break;
                                                                                        case 1335:
                                                                                            C0430.m8410(y3Var, (e) aVar2, x7Var);
                                                                                            i36 = 1570030;
                                                                                            while (true) {
                                                                                                i36 ^= 1570047;
                                                                                                switch (i36) {
                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        i36 = 1570061;
                                                                                                        break;
                                                                                                    case 498:
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 1352:
                                                                                            C0135.m2604(C0455.m8871(C0029.m572(this)), C0046.m889(m6595(), 1956, C0109.f135 ^ 105, 380));
                                                                                            break;
                                                                                        case 1385:
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1022:
                                                                                break;
                                                                            case 7465:
                                                                                C0298.m5725(y3Var, (t7) aVar2, x7Var);
                                                                                i37 = 1569007;
                                                                                while (true) {
                                                                                    i37 ^= 1569024;
                                                                                    switch (i37) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case 495:
                                                                                            i37 = 1569038;
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
                                                                case 1010:
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        int i612 = (i512 ^ 43) + i31;
                                                        i38 = 1570929;
                                                        while (true) {
                                                            i38 ^= 1570946;
                                                            switch (i38) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 243:
                                                                    i38 = 1570960;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        i31 = i612;
                                                        break;
                                                    case 213:
                                                        break;
                                                    case 242:
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                i45 += C0393.f663 ^ 576;
                                                i40 = 1571053;
                                                while (true) {
                                                    i40 ^= 1571070;
                                                    switch (i40) {
                                                        case 19:
                                                            i40 = 1571084;
                                                            break;
                                                        case 498:
                                                            break;
                                                    }
                                                }
                                                i44 = iM171;
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
                        arrayList = null;
                        i43 = 48767;
                        while (true) {
                            i43 ^= 48784;
                            switch (i43) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 239:
                                    i43 = 48798;
                                    break;
                                default:
                                    break;
                            }
                            i29 = 1545106;
                            while (true) {
                                i29 ^= 1545123;
                                switch (i29) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 49:
                                        if (arrayList != null) {
                                        }
                                        break;
                                    case 76:
                                        C0393.m7672(arrayList2, arrayList);
                                        iM171 = C0008.m171(arrayList);
                                        i42 = 1545230;
                                        while (true) {
                                            i42 ^= 1545247;
                                            switch (i42) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i42 = 1545912;
                                                    break;
                                                case 679:
                                                    break;
                                                default:
                                                    break;
                                            }
                                            break;
                                        }
                                        break;
                                    case 115:
                                        iM171 = i46;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            i30 = 1546005;
                            while (true) {
                                i30 ^= 1546022;
                                switch (i30) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 51:
                                        if (aVar != null) {
                                        }
                                        break;
                                    case 84:
                                        i41 = 1546129;
                                        while (true) {
                                            i41 ^= 1546146;
                                            switch (i41) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 51:
                                                    if (iM171 < 100) {
                                                    }
                                                    break;
                                                case 109:
                                                    break;
                                                case 32492:
                                                    C0358.m6998(arrayList2, aVar);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 117:
                                        break;
                                    default:
                                        break;
                                }
                            }
                            iM4637 = C0242.m4637(arrayList2);
                            i31 = i46;
                            while (true) {
                                i32 = 1567085;
                                while (true) {
                                    i32 ^= 1567102;
                                    switch (i32) {
                                        case 19:
                                            if (i31 < iM4637) {
                                            }
                                            break;
                                        case 180:
                                            Object objM44810 = C0234.m4486(arrayList2, i31);
                                            int i513 = C0036.f56;
                                            aVar2 = (a6.a) objM44810;
                                            z10 = aVar2 instanceof v;
                                            i33 = 1567209;
                                            while (true) {
                                                i33 ^= 1567226;
                                                switch (i33) {
                                                    case 19:
                                                        if (z10) {
                                                        }
                                                        break;
                                                    case 956:
                                                        C0493.m9585(y3Var, (v) aVar2, x7Var);
                                                        i39 = 1567333;
                                                        while (true) {
                                                            i39 ^= 1567350;
                                                            switch (i39) {
                                                                case 19:
                                                                    i39 = 1568015;
                                                                    break;
                                                                case 1913:
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case 989:
                                                        z11 = aVar2 instanceof t7;
                                                        i34 = 1568232;
                                                        while (true) {
                                                            i34 ^= 1568249;
                                                            switch (i34) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (z11) {
                                                                    }
                                                                    break;
                                                                case 991:
                                                                    z12 = aVar2 instanceof e;
                                                                    i35 = 1569255;
                                                                    while (true) {
                                                                        i35 ^= 1569272;
                                                                        switch (i35) {
                                                                            case 31:
                                                                                if (z12) {
                                                                                }
                                                                                break;
                                                                            case 1335:
                                                                                C0430.m8410(y3Var, (e) aVar2, x7Var);
                                                                                i36 = 1570030;
                                                                                while (true) {
                                                                                    i36 ^= 1570047;
                                                                                    switch (i36) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i36 = 1570061;
                                                                                            break;
                                                                                        case 498:
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 1352:
                                                                                C0135.m2604(C0455.m8871(C0029.m572(this)), C0046.m889(m6595(), 1956, C0109.f135 ^ 105, 380));
                                                                                break;
                                                                            case 1385:
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1022:
                                                                    break;
                                                                case 7465:
                                                                    C0298.m5725(y3Var, (t7) aVar2, x7Var);
                                                                    i37 = 1569007;
                                                                    while (true) {
                                                                        i37 ^= 1569024;
                                                                        switch (i37) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case 495:
                                                                                i37 = 1569038;
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
                                                    case 1010:
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            int i613 = (i513 ^ 43) + i31;
                                            i38 = 1570929;
                                            while (true) {
                                                i38 ^= 1570946;
                                                switch (i38) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 243:
                                                        i38 = 1570960;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            i31 = i613;
                                            break;
                                        case 213:
                                            break;
                                        case 242:
                                            break;
                                        default:
                                            break;
                                    }
                                    i45 += C0393.f663 ^ 576;
                                    i40 = 1571053;
                                    while (true) {
                                        i40 ^= 1571070;
                                        switch (i40) {
                                            case 19:
                                                i40 = 1571084;
                                                break;
                                            case 498:
                                                break;
                                        }
                                    }
                                    i44 = iM171;
                                    break;
                                }
                            }
                        }
                        break;
                    case 47483:
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public final void z(boolean z10) {
        C0040.m791(this);
        C0459.m8937(this);
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
                    C0485.m9432(C0120.m2310(this));
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        boolean zM2415 = C0125.m2415(this);
        int i11 = 1740;
        while (true) {
            i11 ^= 1757;
            switch (i11) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (zM2415) {
                        i11 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    return;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    C0310.m5979(this, new u6(this, C0061.m1159(this, false), C0452.f722 ^ 719));
                    return;
                default:
                    continue;
            }
            i11 = 1802;
        }
    }
}
