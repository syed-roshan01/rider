package k6;

import a.C0000;
import a.C0001;
import a.C0002;
import a0.C0003;
import a2.C0004;
import a2.C0005;
import a3.C0006;
import a6.C0007;
import a7.C0008;
import a8.C0009;
import a8.C0010;
import aa.C0011;
import aa.C0012;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.C0013;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.app.C0014;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import androidx.annotation.C0019;
import androidx.appcompat.widget.C0020;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.graphics.C0030;
import androidx.compose.ui.graphics.C0031;
import androidx.compose.ui.input.pointer.C0034;
import androidx.compose.ui.layout.C0035;
import androidx.compose.ui.layout.C0036;
import androidx.compose.ui.node.C0037;
import androidx.compose.ui.platform.C0038;
import androidx.core.app.C0040;
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
import c1.C0059;
import c1.C0060;
import c1.C0061;
import c3.C0063;
import c4.C0064;
import c4.C0065;
import c4.C0066;
import c6.C0067;
import c7.C0069;
import ca.C0070;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.C0074;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.datatransport.cct.C0076;
import com.google.android.datatransport.cct.C0077;
import com.google.android.datatransport.cct.C0078;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.common.C0087;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.stats.C0101;
import com.google.android.gms.internal.tasks.C0103;
import com.google.android.play.core.integrity.client.C0107;
import com.google.android.play.core.integrity.client.C0108;
import com.google.android.play.core.integrity.model.C0109;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.C0205;
import com.google.firebase.abt.C0112;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.emulators.C0141;
import com.google.firebase.encoders.C0143;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.installations.C0177;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.ktx.C0179;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement.C0181;
import com.google.firebase.measurement.C0182;
import com.google.firebase.measurement.C0183;
import com.google.firebase.measurement.C0184;
import com.google.firebase.measurement_impl.C0185;
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
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.firebase.remoteconfig.interop.C0198;
import com.google.firebase.remoteconfig.ktx.C0199;
import com.google.firebase.remoteconfiginterop.C0202;
import com.google.firebase.remoteconfiginterop.C0203;
import com.google.firebase.tracing.C0204;
import com.google.gson.internal.bind.C0206;
import com.google.gson.internal.bind.C0207;
import com.google.gson.internal.sql.C0208;
import com.google.protobuf.C0209;
import d.C0210;
import d1.C0211;
import d1.C0212;
import d2.C0215;
import d3.C0216;
import d4.C0217;
import d7.C0219;
import d7.C0220;
import d9.C0222;
import d9.C0223;
import d9.C0225;
import d9.C0226;
import dagger.hilt.C0255;
import dagger.hilt.android.C0240;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import dagger.hilt.android.internal.migration.C0232;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.android.lifecycle.C0236;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.android.migration.C0238;
import dagger.hilt.codegen.C0241;
import dagger.hilt.codegen.C0242;
import dagger.hilt.components.C0243;
import dagger.hilt.internal.C0252;
import dagger.hilt.internal.C0253;
import dagger.hilt.internal.aggregatedroot.C0246;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import dagger.hilt.internal.aliasof.C0247;
import dagger.hilt.internal.componenttreedeps.C0248;
import dagger.hilt.internal.definecomponent.C0249;
import dagger.hilt.internal.generatesrootinput.C0250;
import dagger.hilt.migration.C0254;
import e0.C0256;
import e1.C0257;
import e1.C0259;
import e2.C0260;
import e2.C0261;
import e2.C0263;
import e7.C0264;
import e9.C0266;
import ea.C0267;
import f.C0270;
import f0.C0271;
import f0.C0272;
import f1.C0273;
import f4.C0274;
import f4.C0275;
import f4.C0276;
import f6.C0277;
import f6.C0278;
import fa.C0280;
import fa.C0281;
import g.C0282;
import g.C0283;
import g2.C0286;
import g2.C0287;
import g4.C0289;
import g5.C0290;
import g5.C0291;
import ga.C0295;
import h.C0297;
import h.C0298;
import h0.C0299;
import h4.C0304;
import h4.C0305;
import h5.C0306;
import h5.C0307;
import h6.C0309;
import h7.C0310;
import h8.C0313;
import i.C0316;
import i5.C0318;
import i6.C0319;
import ia.C0322;
import j2.C0324;
import j3.C0325;
import j4.C0326;
import j5.C0327;
import j9.C0329;
import ja.C0330;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import k.C0331;
import k1.C0332;
import k2.C0333;
import k3.C0334;
import k4.C0336;
import l0.C0340;
import l2.C0341;
import l6.C0343;
import l8.C0345;
import l8.C0346;
import l9.C0347;
import la.C0348;
import m1.C0350;
import m1.C0351;
import m3.C0352;
import m5.C0354;
import m7.C0356;
import m7.C0357;
import m7.C0358;
import m9.C0359;
import n.C0360;
import n.C0361;
import n1.C0362;
import n7.C0363;
import n7.C0364;
import n8.C0365;
import n9.C0366;
import o1.C0367;
import o2.C0368;
import o8.C0371;
import p0.C0373;
import p0.C0374;
import p3.C0375;
import p4.C0376;
import p8.C0379;
import q0.C0382;
import q1.C0383;
import q5.C0385;
import q6.C0386;
import q6.C0387;
import q6.C0388;
import q7.C0389;
import q7.C0390;
import q9.C0391;
import r.C0392;
import r1.C0393;
import r2.C0394;
import r2.C0395;
import r2.C0397;
import r5.C0399;
import r5.C0400;
import r6.C0401;
import r6.C0402;
import r7.C0404;
import rikka.shizuku.C0406;
import s.C0407;
import s0.C0409;
import s0.C0410;
import s2.C0411;
import s6.C0413;
import s7.C0414;
import s7.C0415;
import s8.C0416;
import s8.C0417;
import t0.C0418;
import t1.C0419;
import t2.C0420;
import t2.C0421;
import t2.C0422;
import t2.C0423;
import t3.C0424;
import t7.C0425;
import t8.C0426;
import u.C0429;
import u1.C0432;
import u2.C0433;
import u4.C0435;
import u7.C0437;
import u8.C0438;
import v.C0439;
import v0.C0440;
import v0.C0443;
import v5.C0444;
import v5.C0445;
import v6.C0447;
import v7.C0448;
import v7.C0449;
import v8.C0450;
import v9.C0451;
import w.C0453;
import w0.C0454;
import w1.C0455;
import w2.C0456;
import w2.C0457;
import w2.C0458;
import w4.C0460;
import w4.C0461;
import w5.C0462;
import w5.C0463;
import w9.C0465;
import x4.C0468;
import x4.C0469;
import x7.C0471;
import x7.C0472;
import x8.C0473;
import y.C0475;
import y6.C0477;
import y9.C0478;
import y9.C0479;
import z.C0481;
import z0.C0482;
import z2.C0484;
import z3.C0486;
import z3.C0487;
import z7.C0488;
import z7.C0490;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public final class u7 extends o5 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f10423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f10424j;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f593short = {1092, 1100, 1100, 1092, 1103, 1094, 1148, 2833, 2839, 2857, 1050, 1045, 1038, 1049, 1054, 1053, 1039, 1049, 1059, 2157, 2135, 2112, 2112, 2003, 2025, 2042, 2949, 3007, 2998, 2313, 2341, 2367, 2830, 2850, 2879, 800, 780, 796, 1996, 2038, 2047, 2936, 2882, 2901, 2901, 1703, 1707, 1705, 1770, 1699, 1707, 1707, 1699, 1704, 1697, 1770, 1701, 1706, 1696, 1718, 1707, 1709, 1696, 1770, 1699, 1705, 1719, 1770, 1705, 1697, 1701, 1719, 1713, 1718, 1697, 1705, 1697, 1706, 1712, 1770, 1669, 1716, 1716, 1673, 1697, 1701, 1719, 1713, 1718, 1697, 1705, 1697, 1706, 1712, 1686, 1697, 1703, 1697, 1709, 1714, 1697, 1718, 1244, 1235, 1241, 1231, 1234, 1236, 1241, 1171, 1236, 1235, 1225, 1240, 1235, 1225, 1171, 1240, 1221, 1225, 1231, 1244, 1171, 1263, 1272, 1275, 1272, 1263, 1263, 1272, 1263, 1250, 1267, 1276, 1264, 1272, 3060, 3067, 3057, 3047, 3066, 3068, 3057, 3000, 3060, 3045, 3045, 2991, 3002, 3002, 3062, 3066, 3064, 3003, 3058, 3066, 3066, 3058, 3065, 3056, 3003, 3060, 3067, 3057, 3047, 3066, 3068, 3057, 3003, 3058, 3066, 3066, 3058, 3065, 3056, 3044, 3040, 3068, 3062, 3070, 3046, 3056, 3060, 3047, 3062, 3069, 3063, 3066, 3053, 3002, 3069, 3041, 3041, 3045, 3046, 3002, 3042, 3042, 3042, 3003, 3058, 3066, 3066, 3058, 3065, 3056, 3003, 3062, 3066, 3064, 557, 561, 561, 565, 566, 639, 618, 618, 562, 562, 562, 619, 546, 554, 554, 546, 553, 544, 619, 550, 554, 552, 264, 263, 269, 283, 262, 256, 269, 324, 264, 281, 281, 339, 326, 326, 266, 262, 260, 327, 270, 262, 262, 270, 261, 268, 327, 264, 281, 281, 266, 283, 264, 286, 261, 268, 283, 1967, 1982, 1982, 1937, 1959, 1962, 2627, 2654, 2629, 2635, 2629, 2626, 2536, 2553, 2542, 2538, 2559, 2530, 2532, 2533, 2516, 2559, 2530, 2534, 2542, 2552, 2559, 2538, 2534, 2555, 709, 714, 710, 718, 2583, 2581, 2562, 2591, 2560, 2579, 1952, 1958, 1981, 1971, 1971, 1969, 1958, 1931, 1969, 1954, 1969, 1978, 1952, 1931, 1978, 1973, 1977, 1969, 459, 470, 466, 474, 475, 480, 464, 458, 459, 480, 474, 457, 474, 465, 459, 480, 465, 478, 466, 474, 1997, 2000, 2004, 2012, 2013, 2022, 2006, 1996, 1997, 2022, 2012, 1999, 2012, 2007, 1997, 2022, 1993, 2008, 1995, 2008, 2004, 1994, 2177, 2183, 2204, 2194, 2194, 2192, 2183, 2218, 2177, 2204, 2200, 2192, 2202, 2176, 2177, 615, 609, 634, 628, 628, 630, 609, 630, 631, 588, 630, 613, 630, 637, 615, 588, 637, 626, 638, 630, 299, 301, 310, 312, 312, 314, 301, 314, 315, 256, 314, 297, 314, 305, 299, 256, 303, 318, 301, 318, 306, 300, 1359, 1353, 1362, 1372, 1372, 1374, 1353, 1374, 1375, 1380, 1359, 1362, 1366, 1374, 1352, 1359, 1370, 1366, 1355, 2446, 2451, 2455, 2463, 2469, 2446, 2453, 2469, 2454, 2451, 2444, 2463, 1249, 1276, 1268, 1261, 1270, 1249, 1248, 1243, 1249, 1266, 1249, 1258, 1264, 1243, 1258, 1253, 1257, 1249, 2341, 2360, 2352, 2345, 2354, 2341, 2340, 2335, 2341, 2358, 2341, 2350, 2356, 2335, 2352, 2337, 2354, 2337, 2349, 2355, 2435, 2489, 2478, 2478, 2771, 2783, 2781, 2718, 2775, 2783, 2783, 2775, 2780, 2773, 2718, 2769, 2782, 2772, 2754, 2783, 2777, 2772, 2718, 2775, 2781, 2755, 2718, 2781, 2773, 2769, 2755, 2757, 2754, 2773, 2781, 2773, 2782, 2756, 2718, 2801, 2752, 2752, 2813, 2773, 2769, 2755, 2757, 2754, 2773, 2781, 2773, 2782, 2756, 2810, 2783, 2770, 2787, 2773, 2754, 2758, 2777, 2771, 2773, 2965, 3194, 669, 1949, 1959, 1970, 3147, 3192, 3184, 3192, 1394, 1348, 1353, 2331, 2344, 2339, 2343, 2344, 2349, 2336, 1784, 1728, 1733, 1749, 1734, 1742, 1731, 1663, 1654, 1543, 2579, 2579, 2579, 796, 806, 823, 2886, 2935, 2916, 2935, 2939, 2917, 2870, 2935, 2938, 2916, 2931, 2935, 2930, 2927, 2870, 2933, 2937, 2936, 2914, 2935, 2943, 2936, 2931, 2930, 2870, 2931, 2936, 2929, 2935, 2929, 2931, 2939, 2931, 2936, 2914, 682, 651, 656, 708, 660, 657, 656, 656, 653, 650, 643, 708, 641, 658, 641, 650, 656, 708, 660, 645, 662, 645, 649, 641, 656, 641, 662, 714, 708, 685, 650, 658, 645, 648, 653, 640, 708, 658, 645, 648, 657, 641, 708, 656, 669, 660, 641, 714, 708, 650, 645, 649, 641, 712, 708, 656, 669, 660, 641, 646, 523, 572, 572, 545, 572, 622, 572, 555, 570, 571, 572, 544, 551, 544, 553, 622, 551, 544, 570, 622, 568, 559, 546, 571, 555, 622, 570, 545, 622, 569, 572, 559, 574, 574, 555, 572, 402, 2360, 2319, 2319, 2322, 2319, 2397, 2319, 2328, 2313, 2312, 2319, 2323, 2324, 2323, 2330, 2397, 2321, 2322, 2323, 2330, 2397, 2315, 2332, 2321, 2312, 2328, 2397, 2313, 2322, 2397, 2314, 2319, 2332, 2317, 2317, 2328, 2319, 1908, 1859, 1859, 1886, 1859, 1809, 1859, 1876, 1861, 1860, 1859, 1887, 1880, 1887, 1878, 1809, 1875, 1860, 1887, 1877, 1885, 1876, 1809, 1863, 1872, 1885, 1860, 1876, 1809, 1861, 1886, 1809, 1862, 1859, 1872, 1857, 1857, 1876, 1859, 2090, 2459, 2476, 2476, 2481, 2476, 2558, 2476, 2491, 2474, 2475, 2476, 2480, 2487, 2480, 2489, 2558, 2492, 2475, 2480, 2490, 2482, 2491, 2558, 2482, 2487, 2477, 2474, 2558, 2474, 2481, 2558, 2473, 2476, 2495, 2478, 2478, 2491, 2476, 1423, 1399, 1344, 1344, 1373, 1344, 1298, 1344, 1367, 1350, 1351, 1344, 1372, 1371, 1372, 1365, 1298, 1360, 1373, 1373, 1374, 1367, 1363, 1372, 1298, 1348, 1363, 1374, 1351, 1367, 1298, 1350, 1373, 1298, 1349, 1344, 1363, 1346, 1346, 1367, 1344, 2019, 851, 868, 868, 889, 868, 822, 868, 883, 866, 867, 868, 888, 895, 888, 881, 822, 884, 879, 866, 883, 822, 887, 868, 868, 887, 879, 822, 866, 889, 822, 865, 868, 887, 870, 870, 883, 868, 2029, 2781, 2794, 2794, 2807, 2794, 2744, 2794, 2813, 2796, 2797, 2794, 2806, 2801, 2806, 2815, 2744, 2795, 2796, 2794, 2801, 2806, 2815, 2744, 2798, 2809, 2804, 2797, 2813, 2744, 2796, 2807, 2744, 2799, 2794, 2809, 2792, 2792, 2813, 2794, 1014, 997, 1014, 1021, 999, 947, 995, 1010, 993, 1010, 1022, 2928, 2907, 2893, 2890, 2907, 2906, 2846, 2940, 2891, 2896, 2906, 2898, 2907, 2846, 2894, 2911, 2892, 2911, 2899, 2907, 2890, 2907, 2892, 2893, 2846, 2911, 2892, 2907, 2846, 2896, 2897, 
    2890, 2846, 2911, 2898, 2898, 2897, 2889, 2907, 2906, 2821, 2846, 2906, 2903, 2893, 2909, 2911, 2892, 2906, 2907, 2906, 2832, 2846, 2907, 2888, 2907, 2896, 2890, 2846, 2896, 2911, 2899, 2907, 2834, 2846, 2894, 2911, 2892, 2911, 2899, 2846, 2896, 2911, 2899, 2907, 2834, 2846, 2909, 2902, 2903, 2898, 2906, 2846, 2894, 2911, 2892, 2911, 2899, 2846, 2896, 2911, 2899, 2907, 2242, 2296, 2283, 1807, 1842, 1827, 1835, 1894, 1831, 1844, 1844, 1831, 1855, 1894, 1832, 1833, 1842, 1894, 1845, 1843, 1846, 1846, 1833, 1844, 1842, 1827, 1826, 1894, 1833, 1832, 1894, 1829, 1834, 1839, 1827, 1832, 1842, 1889, 1845, 1894, 1840, 1827, 1844, 1845, 1839, 1833, 1832, 1894, 1833, 1824, 1894, 1793, 1833, 1833, 1825, 1834, 1827, 1894, 1814, 1834, 1831, 1855, 1894, 1813, 1827, 1844, 1840, 1839, 1829, 1827, 1845, 1894, 1902, 1799, 1832, 1826, 1844, 1833, 1839, 1826, 1894, 1801, 1832, 1834, 1855, 1903, 1571, 1566, 1551, 1543, 1610, 1545, 1547, 1540, 1613, 1566, 1610, 1545, 1541, 1540, 1566, 1547, 1539, 1540, 1610, 1543, 1541, 1560, 1551, 1610, 1566, 1538, 1547, 1540, 1610, 960, 905, 916, 901, 909, 973, 915, 899, 911, 912, 901, 900, 960, 899, 917, 915, 916, 911, 909, 960, 912, 897, 914, 897, 909, 915, 1748, 1769, 1784, 1776, 1725, 1790, 1788, 1779, 1779, 1778, 1769, 1725, 1790, 1778, 1779, 1769, 1788, 1780, 1779, 1725, 1790, 1768, 1774, 1769, 1778, 1776, 1725, 1773, 1788, 1775, 1788, 1776, 1784, 1769, 1784, 1775, 1774, 1821, 1838, 1853, 1846, 1836, 1912, 1851, 1849, 1846, 1919, 1836, 1912, 1851, 1847, 1846, 1836, 1849, 1841, 1846, 1912, 1845, 1847, 1834, 1853, 1912, 1836, 1840, 1849, 1846, 1912, 1859, 1811, 1794, 1809, 1794, 1806, 1808, 1697, 1680, 1667, 1680, 1692, 1745, 1682, 1680, 1695, 1750, 1669, 1745, 1682, 1694, 1695, 1669, 1680, 1688, 1695, 1745, 1692, 1694, 1667, 1684, 1745, 1669, 1689, 1680, 1695, 1745, 1621, 1564, 1537, 1552, 1560, 1624, 1542, 1558, 1562, 1541, 1552, 1553, 1621, 1558, 1536, 1542, 1537, 1562, 1560, 1621, 1541, 1556, 1543, 1556, 1560, 1552, 1537, 1552, 1543, 1542, 1219, 1266, 1249, 1266, 1278, 1203, 1264, 1266, 1277, 1277, 1276, 1255, 1203, 1264, 1276, 1277, 1255, 1266, 1274, 1277, 1203, 1274, 1255, 1270, 1278, 1214, 1248, 1264, 1276, 1251, 1270, 1271, 1203, 1264, 1254, 1248, 1255, 1276, 1278, 1203, 1251, 1266, 1249, 1266, 1278, 1270, 1255, 1270, 1249, 1248, 2689, 2734, 2722, 2730, 2799, 2726, 2748, 2799, 2749, 2730, 2750, 2746, 2726, 2749, 2730, 2731, 2799, 2734, 2721, 2731, 2799, 2732, 2734, 2721, 2792, 2747, 2799, 2733, 2730, 2799, 2721, 2746, 2723, 2723, 2785, 2799, 2715, 2742, 2751, 2730, 2760, 2791, 2795, 2787, 2726, 2799, 2805, 2726, 2802, 2793, 2793, 2726, 2794, 2793, 2792, 2785, 2728, 2726, 2770, 2815, 2806, 2787, 2730, 2726, 2795, 2791, 2814, 2799, 2795, 2803, 2795, 2726, 2805, 2803, 2806, 2806, 2793, 2804, 2802, 2787, 2786, 2726, 2794, 2787, 2792, 2785, 2802, 2798, 2730, 2726, 2792, 2791, 2795, 2787, 2972, 3050, 3059, 3064, 2974, 2982, 3049, 3064, 2979, 2988, 2982, 2992, 2989, 2987, 2982, 3064, 2969, 2979, 3055, 2980, 3058, 3055, 3067, 2975, 3049, 3006, 2977, 2979, 3055, 2979, 2994, 2994, 3055, 2994, 2999, 2976, 3055, 3052, 3048, 3051, 3046, 1641, 1614, 1622, 1601, 1612, 1609, 1604, 1536, 1607, 1615, 1615, 1607, 1612, 1605, 1663, 1601, 1616, 1616, 1663, 1609, 1604, 1550, 1536, 1638, 1609, 1618, 1605, 1602, 1601, 1619, 1605, 1536, 1633, 1614, 1601, 1612, 1625, 1620, 1609, 1603, 1619, 1536, 1604, 1609, 1619, 1601, 1602, 1612, 1605, 1604, 1550, 1536, 1651, 1605, 1605, 1536, 1608, 1620, 1620, 1616, 1619, 1562, 1551, 1551, 1607, 1615, 1615, 1550, 1607, 1612, 1551, 1646, 1633, 1647, 1647, 1647, 1641, 1550, 1536, 1616, 1618, 1615, 1622, 1609, 1604, 1605, 1604, 1536, 1609, 1604, 2203, 2236, 2212, 2227, 2238, 2235, 2230, 2290, 2227, 2230, 2239, 2237, 2224, 2189, 2227, 2210, 2210, 2189, 2235, 2230, 2300, 2290, 2195, 2236, 2227, 2238, 2219, 2214, 2235, 2225, 2209, 2290, 2230, 2235, 2209, 2227, 2224, 2238, 2231, 2230, 2300, 2222, 2186, 2192, 2192, 2186, 2189, 2180, 2243, 2180, 2188, 2188, 2180, 2191, 2182, 2236, 2178, 2195, 2195, 2236, 2186, 2183, 2253, 2243, 2213, 2186, 2193, 2182, 2177, 2178, 2192, 2182, 2243, 2210, 2189, 2178, 2191, 2202, 2199, 2186, 2176, 2192, 2243, 2183, 2186, 2192, 2178, 2177, 2191, 2182, 2183, 2253, 2243, 2224, 2182, 2182, 2243, 2187, 2199, 2199, 2195, 2192, 2265, 2252, 2252, 2180, 2188, 2188, 2253, 2180, 2191, 2252, 2221, 2210, 2220, 2220, 2220, 2218, 1274, 1229, 1216, 1241, 1225, 1164, 1221, 1247, 1164, 1240, 1219, 1219, 1164, 1216, 1219, 1218, 1227, 1175, 1164, 1224, 1221, 1247, 1231, 1229, 1246, 1224, 1225, 1224, 1154, 1164, 1274, 1229, 1216, 1241, 1225, 1164, 1223, 1221, 1218, 1224, 1152, 1164, 1218, 1229, 1217, 1225, 1152, 1164, 1242, 1229, 1216, 1241, 1225, 1164, 1216, 1225, 1218, 1227, 1240, 1220, 2954, 2981, 2985, 2977, 3044, 2989, 2999, 3044, 2998, 2977, 2997, 2993, 2989, 2998, 2977, 2976, 3044, 2981, 2986, 2976, 3044, 2983, 2981, 2986, 3043, 2992, 3044, 2982, 2977, 3044, 2986, 2993, 2984, 2984, 3050, 3044, 2960, 3005, 2996, 2977, 411, 436, 440, 432, 501, 422, 417, 436, 423, 417, 422, 501, 418, 444, 417, 445, 501, 423, 432, 422, 432, 423, 419, 432, 433, 501, 421, 423, 432, 435, 444, 429, 507, 501, 385, 428, 421, 432, 505, 501, 443, 436, 440, 432, 1811, 1852, 1840, 1848, 1917, 1844, 1838, 1917, 1839, 1848, 1838, 1848, 1839, 1835, 1848, 1849, 1907, 1917, 1801, 1828, 1837, 1848, 1905, 1917, 1843, 1852, 1840, 1848, 1907, 1909, 1891, 1908, 1830, 1910, 1908, 1897, 1910, 1891, 1908, 1906, 1919, 671, 686, 701, 686, 674, 751, 697, 686, 675, 698, 682, 751, 684, 686, 673, 744, 699, 751, 685, 682, 751, 673, 698, 675, 675, 3031, 3053, 3070, 318, 307, 320, 316, 275, 281, 271, 274, 276, 281, 349, 313, 280, 287, 264, 282, 337, 306, 320, 316, 275, 281, 271, 274, 276, 281, 337, 318, 320, 296, 302, 486, 400, 395, 398, 391, 897, 944, 946, 954, 944, 950, 948, 1009, 959, 944, 956, 948, 1009, 959, 958, 933, 1009, 951, 958, 932, 959, 
    949, 751, 728, 728, 709, 728, 650, 709, 712, 734, 715, 707, 708, 707, 708, 717, 650, 713, 719, 728, 734, 707, 716, 707, 713, 715, 734, 719, 2054, 2089, 2085, 2093, 2152, 2081, 2107, 2152, 2106, 2093, 2105, 2109, 2081, 2106, 2093, 2092, 2152, 2089, 2086, 2092, 2152, 2091, 2089, 2086, 2159, 2108, 2152, 2090, 2093, 2152, 2086, 2109, 2084, 2084, 2150, 2152, 2076, 2097, 2104, 2093, 2715, 2740, 2744, 2736, 2805, 2748, 2726, 2805, 2727, 2736, 2724, 2720, 2748, 2727, 2736, 2737, 2805, 2740, 2747, 2737, 2805, 2742, 2740, 2747, 2802, 2721, 2805, 2743, 2736, 2805, 2736, 2744, 2725, 2721, 2732, 2811, 2805, 2689, 2732, 2725, 2736, 3147, 3172, 3176, 3168, 3109, 3176, 3184, 3190, 3185, 3109, 3190, 3185, 3172, 3191, 3185, 3109, 3186, 3180, 3185, 3181, 3109, 3172, 3109, 3177, 3168, 3185, 3185, 3168, 3191, 3109, 3178, 3191, 3109, 3162, 3109, 3117, 3184, 3179, 3169, 3168, 3191, 3190, 3174, 3178, 3191, 3168, 3116, 3115, 3109, 3153, 3196, 3189, 3168, 3113, 3109, 3179, 3172, 3176, 3168, 2811, 2772, 2776, 2768, 2709, 2776, 2752, 2758, 2753, 2709, 2774, 2778, 2779, 2758, 2780, 2758, 2753, 2709, 2778, 2771, 2709, 2777, 2768, 2753, 2753, 2768, 2759, 2758, 2713, 2709, 2769, 2780, 2770, 2780, 2753, 2758, 2709, 2778, 2759, 2709, 2794, 2709, 2717, 2752, 2779, 2769, 2768, 2759, 2758, 2774, 2778, 2759, 2768, 2758, 2716, 2715, 2709, 2785, 2764, 2757, 2768, 2713, 2709, 2779, 2772, 2776, 2768, 1237, 1254, 1262, 1254, 1145, 1110, 1114, 1106, 1047, 1118, 1092, 1047, 1093, 1106, 1094, 1090, 1118, 1093, 1106, 1107, 1047, 1110, 1113, 1107, 1047, 1108, 1110, 1113, 1040, 1091, 1047, 1109, 1106, 1047, 1113, 1090, 1115, 1115, 1049, 1047, 1123, 1102, 1095, 1106, 616, 583, 587, 579, 518, 591, 597, 518, 596, 579, 599, 595, 591, 596, 579, 578, 518, 583, 584, 578, 518, 581, 583, 584, 513, 594, 518, 580, 579, 518, 579, 587, 598, 594, 607, 520, 518, 626, 607, 598, 579, 1627, 1652, 1656, 1648, 1589, 1656, 1632, 1638, 1633, 1589, 1638, 1633, 1652, 1639, 1633, 1589, 1634, 1660, 1633, 1661, 1589, 1652, 1589, 1657, 1648, 1633, 1633, 1648, 1639, 1595, 1589, 1601, 1644, 1637, 1648, 1593, 1589, 1659, 1652, 1656, 1648, 2062, 2081, 2093, 2085, 2144, 2093, 2101, 2099, 2100, 2144, 2083, 2095, 2094, 2099, 2089, 2099, 2100, 2144, 2095, 2086, 2144, 2092, 2085, 2100, 2100, 2085, 2098, 2099, 2156, 2144, 2084, 2089, 2087, 2089, 2100, 2099, 2144, 2095, 2098, 2144, 2079, 2144, 2152, 2101, 2094, 2084, 2085, 2098, 2099, 2083, 2095, 2098, 2085, 2099, 2153, 2158, 2144, 2068, 2105, 2096, 2085, 2156, 2144, 2094, 2081, 2093, 2085, 3280, 3301, 3314, 3309, 3305, 3315, 3315, 3305, 3311, 3310, 3232, 3310, 3311, 3316, 3232, 3303, 3314, 3297, 3310, 3316, 3301, 3300, 2485, 2489, 2491, 2552, 2481, 2489, 2489, 2481, 2490, 2483, 2552, 2487, 2488, 2482, 2468, 2489, 2495, 2482, 2552, 2481, 2491, 2469, 2431, 2391, 2391, 2399, 2388, 2397, 2408, 2388, 2393, 2369, 2411, 2397, 2378, 2382, 2385, 2395, 2397, 2379, 2413, 2380, 2385, 2388, 2178, 2218, 2218, 2210, 2217, 2208, 2277, 2197, 2217, 2212, 2236, 2277, 2230, 2208, 2231, 2227, 2220, 2214, 2208, 2230, 2277, 2220, 2230, 2277, 2216, 2220, 2230, 2230, 2220, 2219, 2210, 2283, 1898, 1881, 1873, 1881, 1695, 1689, 1679, 1688, 1738, 1690, 1688, 1669, 1690, 1679, 1688, 1694, 1683, 1738, 1688, 1679, 1676, 1679, 1688, 1688, 1679, 1688, 776, 782, 792, 783, 861, 781, 783, 786, 781, 792, 783, 777, 772, 707, 716, 710, 720, 717, 715, 710, 652, 722, 711, 720, 719, 715, 721, 721, 715, 717, 716, 652, 739, 737, 737, 743, 753, 753, 765, 739, 742, 753, 743, 752, 756, 747, 737, 743, 753, 765, 739, 758, 758, 752, 747, 736, 759, 758, 747, 749, 748, 2241, 2281, 2285, 2303, 2297, 2302, 2281, 2273, 2281, 2274, 2296, 2220, 2273, 2285, 2274, 2285, 2283, 2281, 2302, 2220, 2285, 2300, 2277, 2220, 2281, 2292, 2287, 2281, 2300, 2296, 2277, 2275, 2274, 3129, 3089, 3093, 3079, 3073, 3078, 3089, 3097, 3089, 3098, 3072, 3156, 3097, 3093, 3098, 3093, 3091, 3089, 3078, 3156, 3093, 3076, 3101, 3156, 3079, 3072, 3093, 3072, 3073, 3079, 3156, 3078, 3089, 3079, 3073, 3096, 3072, 525, 542, 525, 518, 540, 2404, 2421, 2406, 2421, 2425, 1156, 1205, 1190, 1205, 1209, 1201, 1184, 1201, 1190, 1268, 1205, 1190, 1190, 1205, 1197, 1268, 1213, 1191, 1268, 1184, 1211, 1211, 1268, 1208, 1211, 1210, 1203, 1263, 1268, 1200, 1213, 1191, 1207, 1205, 1190, 1200, 1201, 1200, 1274, 1268, 1154, 1205, 1208, 1185, 1201, 1268, 1215, 1213, 1210, 1200, 1272, 1268, 1210, 1205, 1209, 1201, 1272, 1268, 1205, 1190, 1190, 1205, 1197, 1268, 1208, 1201, 1210, 1203, 1184, 1212, 1689, 1716, 1716, 1784, 1672, 1721, 1706, 1723, 1725, 1716, 1721, 1722, 1716, 1725, 1667, 1669, 1784, 1725, 1716, 1725, 1717, 1725, 1718, 1708, 1707, 1784, 1717, 1709, 1707, 1708, 1784, 1722, 1725, 1784, 1719, 1726, 1784, 1708, 1697, 1704, 1725, 1784, 1690, 1709, 1718, 1724, 1716, 1725, 1782, 1784, 1678, 1721, 1716, 1709, 1725, 1784, 1708, 1697, 1704, 1725, 1780, 1784, 1718, 1721, 1717, 1725, 3009, 3034, 3011, 3011, 1218, 1263, 1263, 1187, 1218, 1265, 1265, 1250, 1274, 1231, 1258, 1264, 1271, 1187, 1254, 1263, 1254, 1262, 1254, 1261, 1271, 1264, 1187, 1262, 1270, 1264, 1271, 1187, 1249, 1254, 1187, 1260, 1253, 1187, 1271, 1274, 1267, 1254, 1187, 1217, 1270, 1261, 1255, 1263, 1254, 1197, 1187, 1237, 1250, 1263, 1270, 1254, 1187, 1271, 1274, 1267, 1254, 1199, 1187, 1261, 1250, 1262, 1254, 2919, 2920, 2914, 2932, 2921, 2927, 2914, 2856, 2927, 2920, 2930, 2915, 2920, 2930, 2856, 2919, 2917, 2930, 2927, 2921, 2920, 2856, 2896, 2895, 2883, 2897, 594, 583, 588, 578, 638, 584, 581, 1176, 1177, 1176, 1159, 1183, 1154, 1167, 3113, 3118, 3105, 3108, 3113, 731, 734, 718, 733, 725, 728, 1340, 1336, 1335, 1330, 1343, 2632, 2633, 2640, 2658, 2654, 2652, 2640, 2637, 2652, 2644, 2650, 2643, 570, 571, 546, 528, 572, 544, 570, 573, 556, 554, 2470, 2471, 2494, 2444, 2494, 2486, 2487, 2490, 2470, 2494, 1264, 1265, 1256, 1242, 1260, 1249, 690, 688, 700, 673, 688, 696, 694, 703, 512, 540, 
    518, 513, 528, 534, 288, 296, 297, 292, 312, 288, 2873, 2872, 2849, 2835, 2872, 2857, 2878, 2849, 1514, 1531, 1516, 1523, 2578, 2579, 2570, 2616, 2564, 2568, 2569, 2579, 2562, 2569, 2579, 897, 909, 908, 918, 903, 908, 918, 3295, 3293, 3282, 3287, 3290, 1157, 1174, 1239, 2224, 2239, 2232, 2229, 3111, 3109, 3113, 3124, 3109, 3117, 3107, 3114, 3099, 3117, 3104, 2783, 2782, 2759, 2805, 2777, 2757, 2783, 2776, 2761, 2767, 2805, 2778, 2758, 2763, 2782, 2764, 2757, 2776, 2759, 463, 467, 457, 462, 479, 473, 483, 460, 464, 477, 456, 474, 467, 462, 465, 2766, 2767, 2774, 2788, 2776, 2761, 2782, 2778, 2767, 2770, 2765, 2782, 2788, 2781, 2772, 2761, 2774, 2778, 2767, 2044, 2029, 2042, 2046, 2027, 2038, 2025, 2042, 1984, 2041, 2032, 2029, 2034, 2046, 2027, 2630, 2631, 2654, 2668, 2654, 2642, 2625, 2648, 2646, 2631, 2650, 2653, 2644, 2668, 2631, 2642, 2640, 2631, 2650, 2640, 836, 840, 859, 834, 844, 861, 832, 839, 846, 886, 861, 840, 842, 861, 832, 842, 2991, 2952, 2965, 2962, 2951, 2954, 2954, 3014, 2964, 2947, 2944, 2947, 2964, 2964, 2947, 2964, 3014, 2963, 2964, 2954, 3014, 2959, 2965, 2952, 3009, 2962, 3014, 2951, 3014, 2958, 2959, 2947, 2964, 2951, 2964, 2949, 2958, 2959, 2949, 2951, 2954, 3014, 2995, 2996, 2991, 3238, 3242, 3243, 3249, 3232, 3261, 3249, 2596, 2561, 2614, 2560, 2583, 2579, 2572, 2566, 2560, 2582, 2604, 2571, 2563, 2570, 2635, 2579, 2560, 2583, 2582, 2572, 2570, 2571, 2648, 2453, 2493, 2489, 2475, 2477, 2474, 2493, 2485, 2493, 2486, 2476, 2453, 2489, 2486, 2489, 2495, 2493, 2474, 1922, 1937, 1922, 1929, 1939, 1991, 1943, 1926, 1941, 1926, 1930, 1797, 1855, 1836, 3143, 3188, 3175, 3180, 3190, 3106, 3169, 3171, 3180, 3109, 3190, 3106, 3169, 3181, 3180, 3190, 3171, 3179, 3180, 3106, 3183, 3181, 3184, 3175, 3106, 3190, 3178, 3171, 3180, 3106, 1265, 1185, 1200, 1187, 1200, 1212, 1186, 1735, 1746, 1745, 1744, 1690, 771, 802, 831, 826, 805, 886, 816, 823, 826, 826, 831, 824, 817, 886, 820, 823, 821, 829, 886, 802, 825, 886, 772, 823, 824, 818, 825, 827, 886, 816, 825, 804, 886, 804, 823, 824, 818, 825, 827, 886, 831, 818, 880, 832, 792, 831, 807, 816, 829, 824, 821, 881, 818, 830, 831, 821, 824, 805, 824, 830, 831, 816, 829, 881, 801, 803, 830, 801, 820, 803, 805, 808, 881, 820, 807, 820, 831, 805, 881, 831, 816, 828, 820};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f10425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f10426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w3.d f10428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f10429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f10430h;

    static {
        String strM8781 = C0450.m8781(m6603(), 0, C0374.f645 ^ (-783), 1059);
        String strM7203 = C0367.m7203(m6603(), 7, C0116.f142 ^ 239, 2934);
        String[] strArr = new String[3];
        strArr[C0173.f197 ^ (-816)] = C0190.m3630(m6603(), 10, C0183.f207 ^ (-895), 1148);
        strArr[C0234.f314 ^ 995] = strM8781;
        strArr[C0179.f203 ^ 573] = strM7203;
        f10423i = strArr;
        String[] strArr2 = new String[1];
        strArr2[C0201.f225 ^ 60] = C0373.m7334(m6603(), 19, C0143.f169 ^ (-371), 2098);
        f10424j = strArr2;
    }

    public u7(f5 f5Var) {
        super(f5Var);
        this.f10430h = null;
        this.f10426d = new AtomicLong(126 ^ ((long) C0362.f633));
        int iM4482 = C0232.m4482();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4482 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0414.m8138("sUcvAb")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public static void A(Bundle bundle, int i10, String str, Object obj) {
        boolean zM4723 = C0246.m4723(i10, bundle);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = zM4723 ? 1709 : 1678;
                    break;
                case 204:
                    C0235.m4526(bundle, C0181.m3459(m6603(), 23, C0395.f666 ^ 922, 1932), C0023.m460(str, C0143.f169 ^ (-351), true));
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = obj != null ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean z10 = obj instanceof String;
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i13 = !z10 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            C0490.m9555(bundle, C0048.m921(m6603(), 26, C0063.f83 ^ (-823), 3034), C0416.m8181(C0250.m4789(obj)));
                                            break;
                                        case 47417:
                                            boolean z11 = obj instanceof CharSequence;
                                            int i14 = 48767;
                                            while (true) {
                                                i14 ^= 48784;
                                                switch (i14) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case 76:
                                                        C0490.m9555(bundle, C0048.m921(m6603(), 26, C0063.f83 ^ (-823), 3034), C0416.m8181(C0250.m4789(obj)));
                                                        break;
                                                    case 239:
                                                        i14 = z11 ? 48860 : 48829;
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
        int iM9068 = C0465.m9068();
        int i15 = 48891;
        while (true) {
            i15 ^= 48908;
            switch (i15) {
                case 22:
                    break;
                case 53:
                    return;
                case 503:
                    if (iM9068 >= 0) {
                        i15 = 49635;
                    }
                    break;
                case 32495:
                    System.out.println(Float.parseFloat(C0423.m8300("qf6cofAujr")));
                    return;
                default:
                    continue;
            }
            i15 = 48953;
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x00c8 A[DONT_GENERATE, SYNTHETIC] */
    public static void N(q6 q6Var, Bundle bundle, boolean z10) {
        String strM4106;
        int i10;
        String strM8333;
        int i11;
        int i12;
        int i13;
        String strM1636 = C0075.m1636(m6603(), 29, C0238.f318 ^ (-774), 2390);
        String strM4907 = C0256.m4907(m6603(), 32, C0282.f427 ^ (-977), 2897);
        String strM5767 = C0299.m5767(m6603(), 35, C0395.f666 ^ 922, 895);
        int i14 = 1616;
        while (true) {
            i14 ^= 1633;
            switch (i14) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i14 = bundle != null ? 1709 : 1678;
                    break;
                case 204:
                    int i15 = 1740;
                    while (true) {
                        i15 ^= 1757;
                        switch (i15) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = q6Var != null ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean zM7033 = C0358.m7033(bundle, strM5767);
                                int i16 = 1864;
                                while (true) {
                                    i16 ^= 1881;
                                    switch (i16) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i16 = zM7033 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            strM4106 = C0215.m4106(q6Var);
                                            i10 = 48891;
                                            while (true) {
                                                i10 ^= 48908;
                                                switch (i10) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        C0055.m1069(bundle, strM4907);
                                                        break;
                                                    case 503:
                                                        i10 = strM4106 != null ? 49635 : 48953;
                                                        break;
                                                    case 32495:
                                                        C0235.m4526(bundle, strM4907, strM4106);
                                                        i13 = 49666;
                                                        while (true) {
                                                            i13 ^= 49683;
                                                            switch (i13) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i13 = 49697;
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
                                            strM8333 = C0425.m8333(q6Var);
                                            i11 = 49790;
                                            while (true) {
                                                i11 ^= 49807;
                                                switch (i11) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        C0055.m1069(bundle, strM5767);
                                                        break;
                                                    case 84:
                                                        C0235.m4526(bundle, strM5767, strM8333);
                                                        i12 = 49914;
                                                        while (true) {
                                                            i12 ^= 49931;
                                                            switch (i12) {
                                                                case 497:
                                                                    i12 = 50596;
                                                                    break;
                                                                case 1711:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 241:
                                                        if (strM8333 != null) {
                                                            i11 = 49883;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                }
                                                i11 = 49852;
                                            }
                                            C0490.m9555(bundle, strM1636, C0463.m9035(q6Var));
                                            break;
                                        case 47417:
                                            int i17 = 48767;
                                            while (true) {
                                                i17 ^= 48784;
                                                switch (i17) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case 76:
                                                        strM4106 = C0215.m4106(q6Var);
                                                        i10 = 48891;
                                                        while (true) {
                                                            i10 ^= 48908;
                                                            switch (i10) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    C0055.m1069(bundle, strM4907);
                                                                    break;
                                                                case 503:
                                                                    if (strM4106 != null) {
                                                                    }
                                                                    break;
                                                                case 32495:
                                                                    C0235.m4526(bundle, strM4907, strM4106);
                                                                    i13 = 49666;
                                                                    while (true) {
                                                                        i13 ^= 49683;
                                                                        switch (i13) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i13 = 49697;
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
                                                        strM8333 = C0425.m8333(q6Var);
                                                        i11 = 49790;
                                                        while (true) {
                                                            i11 ^= 49807;
                                                            switch (i11) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 51:
                                                                    C0055.m1069(bundle, strM5767);
                                                                    break;
                                                                case 84:
                                                                    C0235.m4526(bundle, strM5767, strM8333);
                                                                    i12 = 49914;
                                                                    while (true) {
                                                                        i12 ^= 49931;
                                                                        switch (i12) {
                                                                            case 497:
                                                                                i12 = 50596;
                                                                                break;
                                                                            case 1711:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 241:
                                                                    if (strM8333 != null) {
                                                                        i11 = 49883;
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                            }
                                                            i11 = 49852;
                                                        }
                                                        C0490.m9555(bundle, strM1636, C0463.m9035(q6Var));
                                                        break;
                                                    case 239:
                                                        i17 = z10 ? 48860 : 48829;
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
        int i18 = 50689;
        while (true) {
            i18 ^= 50706;
            switch (i18) {
                case 19:
                    i18 = bundle != null ? 50782 : 50751;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    int i19 = 50813;
                    while (true) {
                        i19 ^= 50830;
                        switch (i19) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                break;
                            case 243:
                                i19 = q6Var == null ? 51557 : 50875;
                                break;
                            case 4075:
                                int i20 = 51588;
                                while (true) {
                                    i20 ^= 51605;
                                    switch (i20) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i20 = z10 ? 51681 : 51650;
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            break;
                                        case 116:
                                            C0055.m1069(bundle, strM4907);
                                            C0055.m1069(bundle, strM5767);
                                            C0055.m1069(bundle, strM1636);
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
        int iM874 = C0045.m874();
        int i21 = 51712;
        while (true) {
            i21 ^= 51729;
            switch (i21) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM874 <= 0) {
                        i21 = 51805;
                    }
                    break;
                case 47:
                    return;
                case 76:
                    System.out.println(Double.valueOf(C0226.m4359("06elWvzeRhxl")));
                    return;
                default:
                    continue;
            }
            i21 = 51774;
        }
    }

    public static void O(w7 w7Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        C0246.m4723(i10, bundle);
        boolean zM1883 = C0088.m1883(str2);
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i12 = !zM1883 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM1884 = C0088.m1883(str3);
                    int i13 = 1740;
                    while (true) {
                        i13 ^= 1757;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i13 = !zM1884 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0235.m4526(bundle, str2, str3);
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
        int i14 = 1864;
        while (true) {
            i14 ^= 1881;
            switch (i14) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (i10 != 6) {
                        i14 = 48736;
                    }
                    break;
                case 47384:
                    break;
                case 47417:
                    int i15 = 48767;
                    while (true) {
                        i15 ^= 48784;
                        switch (i15) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case 76:
                                int i16 = 48891;
                                while (true) {
                                    i16 ^= 48908;
                                    switch (i16) {
                                        case 22:
                                            break;
                                        case 53:
                                            C0087.m1869(w7Var, str, C0413.m8108(m6603(), 41, C0346.f617 ^ (-765), 2855), bundle);
                                        case 503:
                                            if (i10 == 2) {
                                                i16 = 49635;
                                            }
                                            break;
                                        case 32495:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i16 = 48953;
                                }
                                break;
                            case 239:
                                if (i10 != 7) {
                                    i15 = 48860;
                                }
                                break;
                            default:
                                continue;
                        }
                        i15 = 48829;
                    }
                    break;
                case 47483:
                    break;
                default:
                    continue;
            }
            i14 = 48705;
        }
        C0490.m9555(bundle, C0477.m9304(m6603(), 38, C0056.f76 ^ (-847), 1939), i11);
        C0087.m1869(w7Var, str, C0413.m8108(m6603(), 41, C0346.f617 ^ (-765), 2855), bundle);
    }

    public static boolean Q(Context context) {
        C0270.m5173(context);
        try {
            PackageManager packageManagerM8279 = C0421.m8279(context);
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i10 = packageManagerM8279 == null ? 1709 : 1678;
                        break;
                    case 204:
                        return false;
                    case 239:
                        ActivityInfo activityInfoM8799 = C0451.m8799(packageManagerM8279, new ComponentName(context, C0137.m2642(m6603(), 45, C0079.f113 ^ (-531), 1732)), 0);
                        int i11 = 1740;
                        while (true) {
                            i11 ^= 1757;
                            switch (i11) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = activityInfoM8799 != null ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    return false;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    boolean zM8514 = C0435.m8514(activityInfoM8799);
                                    int i12 = 1864;
                                    while (true) {
                                        i12 ^= 1881;
                                        switch (i12) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (zM8514) {
                                                    i12 = 48736;
                                                }
                                                break;
                                            case 47384:
                                                return false;
                                            case 47417:
                                                return true;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                        i12 = 48705;
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
            int i13 = 48767;
            while (true) {
                i13 ^= 48784;
                switch (i13) {
                    case Code.UNAVAILABLE /* 14 */:
                        return false;
                    case 239:
                        i13 = 48798;
                        break;
                }
            }
        }
    }

    public static boolean R(Intent intent) {
        String strM3369 = C0176.m3369(intent, C0437.m8534(m6603(), 102, C0424.f695 ^ 549, 1213));
        boolean zM321 = C0016.m321(C0118.m2272(m6603(), 136, C0373.f644 ^ (-785), 2965), strM3369);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM321) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    boolean zM322 = C0016.m321(C0399.m7813(m6603(), 210, C0131.f157 ^ (-895), 581), strM3369);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM322) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean zM323 = C0016.m321(C0192.m3660(m6603(), 232, C0157.f181 ^ (-353), 361), strM3369);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (zM323) {
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

    public static boolean S(Object obj) {
        boolean z10 = obj instanceof Parcelable[];
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!z10) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    boolean z11 = obj instanceof ArrayList;
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!z11) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean z12 = obj instanceof Bundle;
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

    public static boolean W(String str, String str2, String str3, String str4) {
        boolean zM1883 = C0088.m1883(str);
        boolean zM1884 = C0088.m1883(str2);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = !zM1883 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = !zM1884 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0270.m5173(str);
                                boolean zM321 = C0016.m321(str, str2);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (!zM321) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            return false;
                                        case 47417:
                                            return true;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i12 = 48705;
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
        int i13 = 48767;
        while (true) {
            i13 ^= 48784;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    break;
                case 76:
                    int i14 = 48891;
                    while (true) {
                        i14 ^= 48908;
                        switch (i14) {
                            case 22:
                                break;
                            case 53:
                                break;
                            case 503:
                                i14 = zM1884 ? 49635 : 48953;
                                break;
                            case 32495:
                                boolean zM1885 = C0088.m1883(str3);
                                int i15 = 49666;
                                while (true) {
                                    i15 ^= 49683;
                                    switch (i15) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i15 = !zM1885 ? 49759 : 49728;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            boolean zM1886 = C0088.m1883(str4);
                                            int i16 = 49790;
                                            while (true) {
                                                i16 ^= 49807;
                                                switch (i16) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        break;
                                                    case 84:
                                                        boolean zM322 = C0016.m321(str3, str4);
                                                        int i17 = 49914;
                                                        while (true) {
                                                            i17 ^= 49931;
                                                            switch (i17) {
                                                                case 497:
                                                                    if (!zM322) {
                                                                        i17 = 50658;
                                                                    }
                                                                    break;
                                                                case 1711:
                                                                    break;
                                                                case 1736:
                                                                    return false;
                                                                case 1769:
                                                                    return true;
                                                                default:
                                                                    continue;
                                                            }
                                                            i17 = 50627;
                                                        }
                                                        break;
                                                    case 241:
                                                        i16 = !zM1886 ? 49883 : 49852;
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
                                boolean zM1887 = C0088.m1883(str4);
                                int i18 = 50689;
                                while (true) {
                                    i18 ^= 50706;
                                    switch (i18) {
                                        case 19:
                                            if (!zM1887) {
                                                i18 = 50782;
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            return false;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            return true;
                                        default:
                                            continue;
                                    }
                                    i18 = 50751;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    i13 = zM1883 ? 48860 : 48829;
                    break;
                default:
                    break;
            }
        }
        int i19 = 50813;
        while (true) {
            i19 ^= 50830;
            switch (i19) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 53:
                    break;
                case 243:
                    i19 = !zM1883 ? 51557 : 50875;
                    break;
                case 4075:
                    int i20 = 51588;
                    while (true) {
                        i20 ^= 51605;
                        switch (i20) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i20 = zM1884 ? 51681 : 51650;
                                break;
                            case 54:
                                break;
                            case 87:
                                break;
                            case 116:
                                boolean zM1888 = C0088.m1883(str4);
                                int i21 = 51712;
                                while (true) {
                                    i21 ^= 51729;
                                    switch (i21) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (zM1888) {
                                                i21 = 51805;
                                            }
                                            break;
                                        case 47:
                                            boolean zM1889 = C0088.m1883(str3);
                                            int i22 = 51836;
                                            while (true) {
                                                i22 ^= 51853;
                                                switch (i22) {
                                                    case 241:
                                                        if (!zM1889) {
                                                            i22 = 52580;
                                                        }
                                                        break;
                                                    case 1963:
                                                        break;
                                                    case 1992:
                                                        return true;
                                                    case 2025:
                                                        boolean zM323 = C0016.m321(str3, str4);
                                                        int i23 = 52611;
                                                        while (true) {
                                                            i23 ^= 52628;
                                                            switch (i23) {
                                                                case 23:
                                                                    if (!zM323) {
                                                                        i23 = 52704;
                                                                    }
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 85:
                                                                    return false;
                                                                case 116:
                                                                    int i24 = 52735;
                                                                    while (true) {
                                                                        i24 ^= 52752;
                                                                        switch (i24) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                return true;
                                                                            case 1007:
                                                                                i24 = 52766;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i23 = 52673;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i22 = 52549;
                                            }
                                            break;
                                        case 76:
                                            return false;
                                        default:
                                            continue;
                                    }
                                    i21 = 51774;
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
        boolean zM18810 = C0088.m1883(str3);
        int i25 = 53510;
        while (true) {
            i25 ^= 53527;
            switch (i25) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (!zM18810) {
                        i25 = 53603;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 83:
                    return true;
                case 116:
                    boolean zM324 = C0016.m321(str3, str4);
                    int i26 = 53634;
                    while (true) {
                        i26 ^= 53651;
                        switch (i26) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM324) {
                                    i26 = 53727;
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                int i27 = 53758;
                                while (true) {
                                    i27 ^= 53775;
                                    switch (i27) {
                                        case 1009:
                                            i27 = 54440;
                                            break;
                                        case 1703:
                                            return true;
                                    }
                                }
                                break;
                            case 83:
                                return false;
                            default:
                                continue;
                        }
                        i26 = 53696;
                    }
                    break;
                default:
                    break;
            }
            i25 = 53572;
        }
    }

    public static boolean X(String str, String[] strArr) {
        C0270.m5173(strArr);
        int length = strArr.length;
        int i10 = 0;
        while (true) {
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
                        return false;
                    default:
                        break;
                }
            }
            String str2 = strArr[i10];
            int i12 = 1740;
            while (true) {
                i12 ^= 1757;
                switch (i12) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i12 = str != str2 ? 1833 : 1802;
                        break;
                    case 54:
                        break;
                    case 471:
                        return true;
                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                        break;
                    default:
                        break;
                }
            }
            int i13 = 1864;
            while (true) {
                i13 ^= 1881;
                switch (i13) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i13 = str != null ? 48736 : 48705;
                        break;
                    case 47384:
                        break;
                    case 47417:
                        boolean zM5257 = C0272.m5257(str, str2);
                        int i14 = 48767;
                        while (true) {
                            i14 ^= 48784;
                            switch (i14) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    break;
                                case 76:
                                    int i15 = 48891;
                                    while (true) {
                                        i15 ^= 48908;
                                        switch (i15) {
                                            case 22:
                                                return true;
                                            case 503:
                                                i15 = 48922;
                                                continue;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                case 239:
                                    i14 = zM5257 ? 48860 : 48829;
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
            i10 += C0069.f89 ^ (-809);
            int i16 = 49666;
            while (true) {
                i16 ^= 49683;
                switch (i16) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i16 = 49697;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                }
            }
        }
    }

    public static byte[] Z(Parcelable parcelable) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (parcelable == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return null;
                case 239:
                    Parcel parcelM7521 = C0383.m7521();
                    try {
                        C0052.m1012(parcelable, parcelM7521, 0);
                        return C0347.m6798(parcelM7521);
                    } finally {
                        C0082.m1756(parcelM7521);
                    }
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x002c. Please report as an issue. */
    public static ArrayList e0(List list) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (list == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return new ArrayList(0);
                case 239:
                    ArrayList arrayList = new ArrayList(C0008.m171(list));
                    Iterator itM2089 = C0107.m2089(list);
                    while (true) {
                        boolean zM3327 = C0174.m3327(itM2089);
                        int i11 = 1740;
                        while (true) {
                            i11 ^= 1757;
                            switch (i11) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = zM3327 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    break;
                                default:
                                    break;
                            }
                            return arrayList;
                        }
                        e eVar = (e) C0413.m8115(itM2089);
                        Bundle bundle = new Bundle();
                        C0235.m4526(bundle, C0457.m8900(m6603(), 267, C0003.f881 ^ (-859), 1998), C0475.m9253(eVar));
                        C0235.m4526(bundle, C0220.m4259(m6603(), 273, C0016.f36 ^ (-878), 2604), C0013.m266(eVar));
                        C0490.m9555(bundle, C0343.m6742(m6603(), 279, C0035.f55 ^ (-722), 2443), C0194.m3723(eVar));
                        C0235.m4526(bundle, C0263.m5027(m6603(), 297, C0073.f107 ^ (-919), 683), C0450.m8772(C0325.m6291(eVar)));
                        Object objM2343 = C0122.m2343(C0325.m6291(eVar));
                        C0270.m5173(objM2343);
                        C0475.m9269(bundle, objM2343);
                        C0019.m378(bundle, C0341.m6689(m6603(), 301, C0475.f746 ^ (-29), 2678), C0440.m8588(eVar));
                        String strM2358 = C0122.m2358(eVar);
                        int i12 = 1864;
                        while (true) {
                            i12 ^= 1881;
                            switch (i12) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = strM2358 != null ? 48736 : 48705;
                                    break;
                                case 47384:
                                    break;
                                case 47417:
                                    C0235.m4526(bundle, C0001.m32(m6603(), 307, C0034.f54 ^ 533, 2004), strM2358);
                                    break;
                                case 47483:
                                    break;
                                default:
                                    break;
                            }
                        }
                        v vVarM7647 = C0390.m7647(eVar);
                        int i13 = 48767;
                        while (true) {
                            i13 ^= 48784;
                            switch (i13) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    break;
                                case 76:
                                    C0235.m4526(bundle, C0273.m5259(m6603(), 325, C0331.f479 ^ 275, 447), C0278.m5389(vVarM7647));
                                    s sVarM6279 = C0324.m6279(vVarM7647);
                                    int i14 = 48891;
                                    while (true) {
                                        i14 ^= 48908;
                                        switch (i14) {
                                            case 22:
                                                break;
                                            case 53:
                                                break;
                                            case 503:
                                                i14 = sVarM6279 != null ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                C0006.m120(bundle, C0252.m4833(m6603(), 345, C0385.f656 ^ (-25), 1977), C0415.m8166(sVarM6279));
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case 239:
                                    i13 = vVarM7647 != null ? 48860 : 48829;
                                    break;
                                default:
                                    break;
                            }
                        }
                        C0490.m9555(bundle, C0249.m4771(m6603(), 367, C0299.f447 ^ 622, 2293), C0309.m5980(eVar));
                        v vVarM224 = C0011.m224(eVar);
                        int i15 = 49666;
                        while (true) {
                            i15 ^= 49683;
                            switch (i15) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i15 = vVarM224 != null ? 49759 : 49728;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 76:
                                    C0235.m4526(bundle, C0219.m4233(m6603(), 382, C0395.f666 ^ 909, 531), C0278.m5389(vVarM224));
                                    s sVarM62710 = C0324.m6279(vVarM224);
                                    int i16 = 49790;
                                    while (true) {
                                        i16 ^= 49807;
                                        switch (i16) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 51:
                                                break;
                                            case 84:
                                                C0006.m120(bundle, C0278.m5391(m6603(), 402, C0332.f516 ^ 805, 351), C0415.m8166(sVarM62710));
                                                break;
                                            case 241:
                                                i16 = sVarM62710 != null ? 49883 : 49852;
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
                        C0490.m9555(bundle, C0297.m5721(m6603(), 424, C0034.f54 ^ 532, 1339), C0429.m8421(C0325.m6291(eVar)));
                        C0490.m9555(bundle, C0479.m9345(m6603(), 443, C0182.f206 ^ 259, 2554), C0112.m2158(eVar));
                        v vVarM1862 = C0087.m1862(eVar);
                        int i17 = 49914;
                        while (true) {
                            i17 ^= 49931;
                            switch (i17) {
                                case 497:
                                    i17 = vVarM1862 != null ? 50658 : 50627;
                                    break;
                                case 1711:
                                    break;
                                case 1736:
                                    break;
                                case 1769:
                                    C0235.m4526(bundle, C0077.m1672(m6603(), 455, C0326.f474 ^ (-774), 1156), C0278.m5389(vVarM1862));
                                    s sVarM62711 = C0324.m6279(vVarM1862);
                                    int i18 = 50689;
                                    while (true) {
                                        i18 ^= 50706;
                                        switch (i18) {
                                            case 19:
                                                i18 = sVarM62711 != null ? 50782 : 50751;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                C0006.m120(bundle, C0365.m7163(m6603(), 473, C0261.f341 ^ (-882), 2368), C0415.m8166(sVarM62711));
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
                        C0357.m6998(arrayList, bundle);
                        int i19 = 50813;
                        while (true) {
                            i19 ^= 50830;
                            switch (i19) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case 243:
                                    i19 = 50844;
                                    break;
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

    public static boolean f0(int i10, Bundle bundle) {
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (bundle == null) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    return false;
                case 239:
                    String strM172 = C0008.m172(m6603(), 493, C0465.f736 ^ 210, 2524);
                    long jM3008 = C0158.m3008(bundle, strM172);
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (jM3008 == 0) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return false;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0490.m9555(bundle, strM172, i10);
                                return true;
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

    public static boolean j0(Context context) {
        String strM3045 = C0159.m3045(m6603(), 497, C0227.f307 ^ (-949), 2736);
        try {
            PackageManager packageManagerM8279 = C0421.m8279(context);
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i10 = packageManagerM8279 == null ? 1709 : 1678;
                        break;
                    case 204:
                        return false;
                    case 239:
                        ServiceInfo serviceInfoM4527 = C0235.m4527(packageManagerM8279, new ComponentName(context, strM3045), 0);
                        int i11 = 1740;
                        while (true) {
                            i11 ^= 1757;
                            switch (i11) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = serviceInfoM4527 != null ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    return false;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    boolean zM975 = C0050.m975(serviceInfoM4527);
                                    int i12 = 1864;
                                    while (true) {
                                        i12 ^= 1881;
                                        switch (i12) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (zM975) {
                                                    i12 = 48736;
                                                }
                                                break;
                                            case 47384:
                                                return false;
                                            case 47417:
                                                return true;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                        i12 = 48705;
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
            int i13 = 48767;
            while (true) {
                i13 ^= 48784;
                switch (i13) {
                    case Code.UNAVAILABLE /* 14 */:
                        return false;
                    case 239:
                        i13 = 48798;
                        break;
                }
            }
        }
    }

    public static boolean l0(String str) {
        String str2 = (String) C0261.m4995(C0083.m1784(), null);
        boolean zM321 = C0016.m321(str2, C0000.m22(m6603(), 556, 1, 3007));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM321) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    boolean zM2099 = C0108.m2099(C0150.m2872(C0453.m8842(str2, C0424.m8319(m6603(), 557, 1, 3158))), str);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM2099) {
                                    i11 = 1833;
                                }
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
                                            break;
                                        case 47483:
                                            break;
                                    }
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

    public static boolean o0(String str) {
        boolean zM1883 = C0088.m1883(str);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = !zM1883 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM8715 = C0447.m8715(str, C0389.m7631(m6603(), 558, 1, 706));
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = zM8715 ? 1833 : 1802;
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

    public static boolean q0(String str) {
        C0281.m5438(str);
        char cM4352 = C0226.m4352(str, 0);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = cM4352 == '_' ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM321 = C0016.m321(str, C0047.m914(m6603(), 559, C0037.f57 ^ 678, 1986));
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

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0024. Please report as an issue. */
    public static long s(s sVar) {
        long j10 = (-70) ^ ((long) C0108.f134);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (sVar == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return j10;
                case 239:
                    u uVar = new u(sVar);
                    long j11 = j10;
                    while (true) {
                        boolean zM1587 = C0073.m1587(uVar);
                        int i11 = 1740;
                        while (true) {
                            i11 ^= 1757;
                            switch (i11) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = zM1587 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    break;
                                default:
                                    break;
                            }
                            return j11;
                        }
                        Object objM195 = C0010.m195(C0152.m2916(sVar), (String) C0245.m4697(uVar));
                        boolean z10 = objM195 instanceof Parcelable[];
                        int i12 = 1864;
                        while (true) {
                            i12 ^= 1881;
                            switch (i12) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = z10 ? 48736 : 48705;
                                    break;
                                case 47384:
                                    break;
                                case 47417:
                                    long length = ((long) ((Parcelable[]) objM195).length) - (0 - j11);
                                    int i13 = 48767;
                                    while (true) {
                                        i13 ^= 48784;
                                        switch (i13) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                j11 = length;
                                                continue;
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
                                    break;
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

    public static int s0(String str) {
        boolean zM321 = C0016.m321(C0322.m6240(m6603(), 562, C0178.f202 ^ 159, 3092), str);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM321) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return C0118.f144 ^ (-3004);
                case 239:
                    boolean zM322 = C0016.m321(C0276.m5313(m6603(), 566, C0163.f187 ^ (-697), 1325), str);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM322) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                boolean zM323 = C0016.m321(C0465.m9075(m6603(), 569, C0067.f87 ^ (-801), 2372), str);
                                int i12 = C0139.f165 ^ 742;
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (zM323) {
                                                i13 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            boolean zM324 = C0016.m321(C0035.m686(m6603(), 576, C0142.f168 ^ (-611), 1703), str);
                                            int i14 = 48767;
                                            while (true) {
                                                i14 ^= 48784;
                                                switch (i14) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        return C0220.f300 ^ (-89);
                                                    case 76:
                                                        return i12;
                                                    case 239:
                                                        if (zM324) {
                                                            i14 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i14 = 48829;
                                            }
                                            break;
                                        case 47417:
                                            return i12;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i13 = 48705;
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return C0242.f322 ^ 140;
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

    public static long t(byte[] bArr) {
        C0270.m5173(bArr);
        int length = bArr.length;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (length > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int length2 = bArr.length + (C0193.f217 ^ (-205));
                    int i11 = 0;
                    long j10 = 0;
                    while (true) {
                        int i12 = 1740;
                        while (true) {
                            i12 ^= 1757;
                            switch (i12) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = length2 >= 0 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    break;
                                default:
                                    break;
                            }
                        }
                        int length3 = bArr.length;
                        int i13 = C0166.f190;
                        int i14 = 1864;
                        while (true) {
                            i14 ^= 1881;
                            switch (i14) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i14 = length2 >= (i13 ^ 575) + length3 ? 48736 : 48705;
                                    break;
                                case 47384:
                                    break;
                                case 47417:
                                    break;
                                case 47483:
                                    break;
                                default:
                                    break;
                            }
                        }
                        long j11 = bArr[length2];
                        j10 -= 0 - ((j11 & ((255 ^ (-1)) ^ j11)) << i11);
                        i11 += C0121.f147 ^ 606;
                        length2 += C0137.f163 ^ (-99);
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
                    return j10;
                case 239:
                    throw new IllegalStateException();
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x001b, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x001b, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x001b, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0023. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bundle w(List list) {
        Bundle bundle = new Bundle();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (list == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return bundle;
                case 239:
                    Iterator itM2089 = C0107.m2089(list);
                    while (true) {
                        boolean zM3327 = C0174.m3327(itM2089);
                        int i11 = 1740;
                        while (true) {
                            i11 ^= 1757;
                            switch (i11) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = zM3327 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    break;
                                default:
                                    break;
                            }
                            return bundle;
                        }
                        t7 t7Var = (t7) C0413.m8115(itM2089);
                        String strM6469 = C0333.m6469(t7Var);
                        String strM8772 = C0450.m8772(t7Var);
                        int i12 = 1864;
                        while (true) {
                            i12 ^= 1881;
                            switch (i12) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = strM6469 != null ? 48736 : 48705;
                                    break;
                                case 47384:
                                    Long lM8744 = C0448.m8744(t7Var);
                                    int i13 = 48891;
                                    while (true) {
                                        i13 ^= 48908;
                                        switch (i13) {
                                            case 22:
                                                break;
                                            case 53:
                                                Double dM9489 = C0487.m9489(t7Var);
                                                int i14 = 49790;
                                                while (true) {
                                                    i14 ^= 49807;
                                                    switch (i14) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 51:
                                                            break;
                                                        case 84:
                                                            C0271.m5217(bundle, strM8772, C0112.m2157(dM9489));
                                                            int i15 = 49914;
                                                            while (true) {
                                                                i15 ^= 49931;
                                                                switch (i15) {
                                                                    case 497:
                                                                        i15 = 50596;
                                                                        break;
                                                                    case 1711:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 241:
                                                            i14 = dM9489 != null ? 49883 : 49852;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 503:
                                                i13 = lM8744 != null ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                C0490.m9555(bundle, strM8772, C0490.m9543(lM8744));
                                                int i16 = 49666;
                                                while (true) {
                                                    i16 ^= 49683;
                                                    switch (i16) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i16 = 49697;
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
                                case 47417:
                                    C0235.m4526(bundle, strM8772, strM6469);
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
                                    break;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0053. Please report as an issue. */
    public static MessageDigest w0() {
        int i10;
        int i11 = 0;
        while (true) {
            int i12 = 1616;
            while (true) {
                i12 ^= 1633;
                switch (i12) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i12 = i11 < 2 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        return null;
                    default:
                        break;
                }
            }
            try {
                MessageDigest messageDigestM4100 = C0215.m4100(C0278.m5391(m6603(), 583, C0014.f34 ^ 961, 1586));
                int i13 = 1740;
                while (true) {
                    i13 ^= 1757;
                    switch (i13) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i13 = messageDigestM4100 != null ? 1833 : 1802;
                            break;
                        case 54:
                            break;
                        case 471:
                            break;
                        case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                            return messageDigestM4100;
                        default:
                            break;
                    }
                }
                while (true) {
                    i10 ^= 1881;
                    switch (i10) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i10 = 48674;
                            break;
                        case 47483:
                            break;
                    }
                }
            } catch (NoSuchAlgorithmException e4) {
                int i14 = 48767;
                while (true) {
                    i14 ^= 48784;
                    switch (i14) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 239:
                            i14 = 48798;
                            break;
                        default:
                            break;
                    }
                }
            }
            i11 += C0465.f736 ^ 215;
            i10 = 1864;
        }
    }

    public static String y(String str, int i10, boolean z10) {
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (str == null) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    return null;
                case 239:
                    int iM7372 = C0376.m7372(str, 0, C0416.m8181(str));
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM7372 > i10) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return str;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (z10) {
                                                i13 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            return null;
                                        case 47417:
                                            return C0418.m8231(C0125.m2418(str, 0, C0257.m4925(str, 0, i10)), C0492.m9575(m6603(), 586, C0086.f120 ^ (-780), 2621));
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i13 = 48705;
                                }
                                break;
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

    /* JADX INFO: renamed from: ۟ۥۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m6603() {
        int iM1692 = C0078.m1692();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1692 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f593short;
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

    public final void B(Bundle bundle, long j10) {
        String strM155 = C0007.m155(m6603(), 589, C0111.f137 ^ (-772), 835);
        long jM3008 = C0158.m3008(bundle, strM155);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (jM3008 != 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    d4 d4VarM572 = C0029.m572(this);
                    C0419.m8245(C0330.m6385(d4VarM572), C0249.m4771(m6603(), 592, C0385.f656 ^ (-46), 2838), C0438.m8554(jM3008));
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        C0490.m9555(bundle, strM155, jM3008 + (j10 - 4) + 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0018, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0020. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(Bundle bundle, Bundle bundle2) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (bundle2 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return;
                case 239:
                    Iterator itM5256 = C0272.m5256(C0060.m1152(bundle2));
                    while (true) {
                        boolean zM3327 = C0174.m3327(itM5256);
                        int i11 = 1740;
                        while (true) {
                            i11 ^= 1757;
                            switch (i11) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = zM3327 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    break;
                                default:
                                    break;
                            }
                            return;
                        }
                        String str = (String) C0413.m8115(itM5256);
                        boolean zM7033 = C0358.m7033(bundle, str);
                        int i12 = 1864;
                        while (true) {
                            i12 ^= 1881;
                            switch (i12) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = !zM7033 ? 48736 : 48705;
                                    break;
                                case 47384:
                                    break;
                                case 47417:
                                    C0488.m9513(C0354.m6951(this), bundle, str, C0010.m195(bundle2, str));
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
                                    break;
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

    public final void D(Bundle bundle, String str, Object obj) {
        String strM6761;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (bundle == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return;
                case 239:
                    boolean z10 = obj instanceof Long;
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (z10) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                boolean z11 = obj instanceof String;
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (z11) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            boolean z12 = obj instanceof Double;
                                            int i13 = 48891;
                                            while (true) {
                                                i13 ^= 48908;
                                                switch (i13) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        boolean z13 = obj instanceof Bundle[];
                                                        int i14 = 49666;
                                                        while (true) {
                                                            i14 ^= 49683;
                                                            switch (i14) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (z13) {
                                                                        i14 = 49759;
                                                                    }
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    C0060.m1147(bundle, str, (Bundle[]) obj);
                                                                    return;
                                                                case 83:
                                                                    int i15 = 49790;
                                                                    while (true) {
                                                                        i15 ^= 49807;
                                                                        switch (i15) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 51:
                                                                                return;
                                                                            case 84:
                                                                                int i16 = 49914;
                                                                                while (true) {
                                                                                    i16 ^= 49931;
                                                                                    switch (i16) {
                                                                                        case 497:
                                                                                            i16 = obj != null ? 50658 : 50627;
                                                                                            break;
                                                                                        case 1711:
                                                                                            break;
                                                                                        case 1736:
                                                                                            strM6761 = null;
                                                                                            break;
                                                                                        case 1769:
                                                                                            strM6761 = C0345.m6761(C0014.m280(obj));
                                                                                            int i17 = 50689;
                                                                                            while (true) {
                                                                                                i17 ^= 50706;
                                                                                                switch (i17) {
                                                                                                    case 19:
                                                                                                        i17 = 50720;
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
                                                                                C0112.m2169(C0471.m9169(C0029.m572(this)), C0266.m5096(m6603(), 627, C0023.f43 ^ (-912), 740), C0411.m8083(C0233.m4489(this), str), strM6761);
                                                                                return;
                                                                            case 241:
                                                                                if (str != null) {
                                                                                    i15 = 49883;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i15 = 49852;
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i14 = 49728;
                                                        }
                                                        break;
                                                    case 503:
                                                        if (z12) {
                                                            i13 = 49635;
                                                        }
                                                        break;
                                                    case 32495:
                                                        C0271.m5217(bundle, str, C0112.m2157((Double) obj));
                                                        return;
                                                    default:
                                                        continue;
                                                }
                                                i13 = 48953;
                                            }
                                            break;
                                        case 47417:
                                            C0235.m4526(bundle, str, C0250.m4789(obj));
                                            int iM9210 = C0473.m9210();
                                            int i18 = 48767;
                                            while (true) {
                                                i18 ^= 48784;
                                                switch (i18) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        return;
                                                    case 76:
                                                        System.out.println(Integer.valueOf(C0451.m8794("pHHe4EKOiuyVtRVUY")));
                                                        return;
                                                    case 239:
                                                        if (iM9210 >= 0) {
                                                            i18 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i18 = 48829;
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
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0490.m9555(bundle, str, C0490.m9543((Long) obj));
                                return;
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

    public final void E(zzcv zzcvVar, int i10) {
        Bundle bundle = new Bundle();
        C0159.m3040(bundle, C0461.m8984(m6603(), 686, 1, 756), i10);
        try {
            C0304.m5871(zzcvVar, bundle);
        } catch (RemoteException e4) {
            d4 d4VarM3434 = C0180.m3434((f5) C0163.m3121(this));
            C0257.m4924(d4VarM3434);
            C0419.m8245(C0330.m6385(d4VarM3434), C0433.m8486(m6603(), 687, C0282.f427 ^ (-1016), 590), e4);
        }
    }

    public final void F(zzcv zzcvVar, long j10) {
        Bundle bundle = new Bundle();
        C0490.m9555(bundle, C0259.m4951(m6603(), 723, 1, 480), j10);
        try {
            C0304.m5871(zzcvVar, bundle);
        } catch (RemoteException e4) {
            d4 d4VarM3434 = C0180.m3434((f5) C0163.m3121(this));
            C0257.m4924(d4VarM3434);
            C0419.m8245(C0330.m6385(d4VarM3434), C0188.m3587(m6603(), 724, C0188.f212 ^ 76, 2429), e4);
        }
    }

    public final void G(zzcv zzcvVar, Bundle bundle) {
        try {
            C0304.m5871(zzcvVar, bundle);
        } catch (RemoteException e4) {
            d4 d4VarM3434 = C0180.m3434((f5) C0163.m3121(this));
            C0257.m4924(d4VarM3434);
            C0419.m8245(C0330.m6385(d4VarM3434), C0449.m8757(m6603(), 761, C0333.f517 ^ 813, 1841), e4);
        }
    }

    public final void H(zzcv zzcvVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        C0382.m7504(bundle, C0278.m5391(m6603(), 800, 1, 2136), arrayList);
        try {
            C0304.m5871(zzcvVar, bundle);
        } catch (RemoteException e4) {
            d4 d4VarM3434 = C0180.m3434((f5) C0163.m3121(this));
            C0257.m4924(d4VarM3434);
            C0419.m8245(C0330.m6385(d4VarM3434), C0030.m576(m6603(), 801, C0271.f387 ^ (-776), 2526), e4);
            int iM4482 = C0232.m4482();
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        if (iM4482 <= 0) {
                            i10 = 1709;
                        }
                        break;
                    case 204:
                        System.out.println(Float.decode(C0225.m4330("L38gHUvItP0E4dsDTjzd4ypmXHcM")));
                        return;
                    case 239:
                        return;
                    default:
                        continue;
                }
                i10 = 1678;
            }
        }
    }

    public final void I(zzcv zzcvVar, boolean z10) {
        Bundle bundle = new Bundle();
        C0019.m378(bundle, C0061.m1168(m6603(), 839, 1, 1533), z10);
        try {
            C0304.m5871(zzcvVar, bundle);
        } catch (RemoteException e4) {
            d4 d4VarM3434 = C0180.m3434((f5) C0163.m3121(this));
            C0257.m4924(d4VarM3434);
            C0419.m8245(C0330.m6385(d4VarM3434), C0222.m4290(m6603(), 840, C0069.f89 ^ (-770), 1330), e4);
            int iM5722 = C0297.m5722();
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        if (iM5722 <= 0) {
                            i10 = 1709;
                        }
                        break;
                    case 204:
                        System.out.println(Double.parseDouble(C0101.m1974("PRLD8fu4G5VKL31f8aW")));
                        return;
                    case 239:
                        return;
                    default:
                        continue;
                }
                i10 = 1678;
            }
        }
    }

    public final void J(zzcv zzcvVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        C0087.m1860(bundle, C0166.m3169(m6603(), 880, 1, 1937), bArr);
        try {
            C0304.m5871(zzcvVar, bundle);
            int iM5882 = C0304.m5882();
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        if (iM5882 >= 0) {
                            i10 = 1709;
                        }
                        break;
                    case 204:
                        System.out.println(Long.decode(C0114.m2208("XojStEAIXGVJPwAyqw6QTH")));
                        return;
                    case 239:
                        return;
                    default:
                        continue;
                }
                i10 = 1678;
            }
        } catch (RemoteException e4) {
            d4 d4VarM3434 = C0180.m3434((f5) C0163.m3121(this));
            C0257.m4924(d4VarM3434);
            C0419.m8245(C0330.m6385(d4VarM3434), C0118.m2272(m6603(), 881, C0189.f213 ^ (-763), 790), e4);
        }
    }

    public final void K(String str, zzcv zzcvVar) {
        Bundle bundle = new Bundle();
        C0235.m4526(bundle, C0192.m3660(m6603(), 918, 1, 1951), str);
        try {
            C0304.m5871(zzcvVar, bundle);
        } catch (RemoteException e4) {
            d4 d4VarM3434 = C0180.m3434((f5) C0163.m3121(this));
            C0257.m4924(d4VarM3434);
            C0419.m8245(C0330.m6385(d4VarM3434), C0076.m1657(m6603(), 919, C0066.f86 ^ (-255), 2712), e4);
            int iM4237 = C0219.m4237();
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        if (iM4237 <= 0) {
                            i10 = 1709;
                        }
                        break;
                    case 204:
                        System.out.println(Float.decode(C0449.m8753("Oyz0f5waaSME")));
                        return;
                    case 239:
                        return;
                    default:
                        continue;
                }
                i10 = 1678;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:328:0x036d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x038a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x008b A[EDGE_INSN: B:331:0x008b->B:330:0x008b BREAK  A[LOOP:14: B:69:0x00ff->B:409:0x00ff], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x008b A[EDGE_INSN: B:332:0x008b->B:330:0x008b BREAK  A[LOOP:14: B:69:0x00ff->B:409:0x00ff], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x0159 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x0367 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x0369 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x035b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x0380 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x0382 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x0378 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x03a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x03a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x03ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x0400 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x03a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x03a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x039a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:0x03fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x03e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x03f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:0x04e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x03f1 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x040b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x0411 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x0415 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:0x0411 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x040d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x0403 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x0424 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x0428 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:0x042e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x04ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x042a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:0x0424 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x041c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x0446 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x044c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x0450 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x04ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x044c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x0448 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x043e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x04aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x04a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x01df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x020a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:0x020c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x021f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:570:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x023f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:580:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x0185 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x008b, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x008b, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:114:0x01ad. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:121:0x01c2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:135:0x01f1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:147:0x021b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:160:0x0246. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:175:0x0273. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:194:0x02dc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:240:0x03ea. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:271:0x04a6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x0096. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x00e8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:66:0x00f8. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(String str, String str2, Bundle bundle, List list, boolean z10) {
        int i10;
        int i11;
        String str3;
        int iM1757;
        boolean zM7180;
        int i12;
        boolean zM8869;
        int i13;
        int i14;
        boolean zM2887;
        int i15;
        int i16;
        int i17;
        boolean zM9115;
        int i18;
        boolean zM3575;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        String strM3816;
        int i24;
        int i25;
        boolean zM9344;
        int i26;
        boolean zM4973;
        int i27;
        boolean zM7850;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean zM1085;
        int i32;
        boolean zM4974;
        int i33;
        boolean zM7851;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38 = 1616;
        while (true) {
            i38 ^= 1633;
            switch (i38) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (bundle == null) {
                        i38 = 1709;
                    }
                    break;
                case 204:
                    return;
                case 239:
                    f fVarM1951 = C0091.m1951(this);
                    C0014.m280(fVarM1951);
                    boolean zM9116 = C0468.m9115();
                    int i39 = (-231100286) ^ C0487.f761;
                    int i40 = 1740;
                    while (true) {
                        i40 ^= 1757;
                        switch (i40) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i40 = zM9116 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                i10 = 0;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean zM3576 = C0187.m3575(C0091.m1951(fVarM1951), null, C0247.m4745());
                                int i41 = 1864;
                                while (true) {
                                    i41 ^= 1881;
                                    switch (i41) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i41 = zM3576 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            i10 = 0;
                                            break;
                                        case 47417:
                                            boolean zM2888 = C0150.m2887(C0354.m6951(fVarM1951), i39);
                                            int i42 = 48767;
                                            while (true) {
                                                i42 ^= 48784;
                                                switch (i42) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        i10 = 0;
                                                        break;
                                                    case 76:
                                                        int i43 = 48891;
                                                        while (true) {
                                                            i43 ^= 48908;
                                                            switch (i43) {
                                                                case 22:
                                                                    i10 = 35;
                                                                    break;
                                                                case 503:
                                                                    i43 = 48922;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i42 = zM2888 ? 48860 : 48829;
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
                                break;
                            default:
                                break;
                        }
                    }
                    Iterator itM9493 = C0487.m9493(new TreeSet(C0060.m1152(bundle)));
                    int i44 = 0;
                    while (true) {
                        boolean zM3327 = C0174.m3327(itM9493);
                        int i45 = 49666;
                        while (true) {
                            i45 ^= 49683;
                            switch (i45) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i45 = zM3327 ? 49759 : 49728;
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
                            return;
                        }
                        String str4 = (String) C0413.m8115(itM9493);
                        int i46 = 49790;
                        while (true) {
                            i46 ^= 49807;
                            switch (i46) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case 51:
                                    i23 = C0017.f37 ^ (-409);
                                    strM3816 = C0199.m3816(m6603(), 958, C0416.f687 ^ (-661), 915);
                                    i24 = 51588;
                                    while (true) {
                                        i24 ^= 51605;
                                        switch (i24) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i24 = !z10 ? 51681 : 51650;
                                                break;
                                            case 54:
                                                break;
                                            case 87:
                                                i11 = 0;
                                                break;
                                            case 116:
                                                zM1085 = C0057.m1085(this, strM3816, str4);
                                                i32 = 51712;
                                                while (true) {
                                                    i32 ^= 51729;
                                                    switch (i32) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i32 = !zM1085 ? 51805 : 51774;
                                                            break;
                                                        case 47:
                                                            zM4974 = C0260.m4973(this, strM3816, null, null, str4);
                                                            i33 = 52611;
                                                            while (true) {
                                                                i33 ^= 52628;
                                                                switch (i33) {
                                                                    case 23:
                                                                        i33 = !zM4974 ? 52704 : 52673;
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 85:
                                                                        zM7851 = C0400.m7850(this, strM3816, i23, str4);
                                                                        i34 = 53510;
                                                                        while (true) {
                                                                            i34 ^= 53527;
                                                                            switch (i34) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i34 = !zM7851 ? 53603 : 53572;
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                case 83:
                                                                                    i11 = 0;
                                                                                    break;
                                                                                case 116:
                                                                                    i35 = 53634;
                                                                                    while (true) {
                                                                                        i35 ^= 53651;
                                                                                        switch (i35) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i35 = 53665;
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                        i11 = 3;
                                                                                        i37 = 51836;
                                                                                        while (true) {
                                                                                            i37 ^= 51853;
                                                                                            switch (i37) {
                                                                                                case 241:
                                                                                                    i37 = 52518;
                                                                                                    break;
                                                                                                case 1963:
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
                                                                    case 116:
                                                                        i11 = 14;
                                                                        i36 = 52735;
                                                                        while (true) {
                                                                            i36 ^= 52752;
                                                                            switch (i36) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case 1007:
                                                                                    i36 = 52766;
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 76:
                                                            i11 = 3;
                                                            i37 = 51836;
                                                            while (true) {
                                                                i37 ^= 51853;
                                                                switch (i37) {
                                                                    case 241:
                                                                        i37 = 52518;
                                                                        break;
                                                                    case 1963:
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
                                    i25 = 53758;
                                    while (true) {
                                        i25 ^= 53775;
                                        switch (i25) {
                                            case 1009:
                                                i25 = i11 == 0 ? 54502 : 54471;
                                                break;
                                            case 1703:
                                                break;
                                            case 1736:
                                                break;
                                            case 1769:
                                                zM9344 = C0479.m9344(this, strM3816, str4);
                                                i26 = 54533;
                                                while (true) {
                                                    i26 ^= 54550;
                                                    switch (i26) {
                                                        case 19:
                                                            i26 = !zM9344 ? 54626 : 54595;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 85:
                                                            zM4973 = C0260.m4973(this, strM3816, null, null, str4);
                                                            i27 = 55432;
                                                            while (true) {
                                                                i27 ^= 55449;
                                                                switch (i27) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i27 = !zM4973 ? 55525 : 55494;
                                                                        break;
                                                                    case 62:
                                                                        break;
                                                                    case 95:
                                                                        zM7850 = C0400.m7850(this, strM3816, i23, str4);
                                                                        i28 = 55680;
                                                                        while (true) {
                                                                            i28 ^= 55697;
                                                                            switch (i28) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i28 = !zM7850 ? 56424 : 56393;
                                                                                    break;
                                                                                case 1467:
                                                                                    break;
                                                                                case 1496:
                                                                                    i11 = 0;
                                                                                    break;
                                                                                case 1529:
                                                                                    i29 = 56455;
                                                                                    while (true) {
                                                                                        i29 ^= 56472;
                                                                                        switch (i29) {
                                                                                            case 31:
                                                                                                i29 = 56486;
                                                                                                break;
                                                                                            case 62:
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                        i11 = 3;
                                                                                        i31 = 54657;
                                                                                        while (true) {
                                                                                            i31 ^= 54674;
                                                                                            switch (i31) {
                                                                                                case 19:
                                                                                                    i31 = 54688;
                                                                                                    break;
                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 124:
                                                                        i30 = 55556;
                                                                        while (true) {
                                                                            i30 ^= 55573;
                                                                            switch (i30) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i30 = 55587;
                                                                                    break;
                                                                                case 54:
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                            i11 = 14;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 116:
                                                            i11 = 3;
                                                            i31 = 54657;
                                                            while (true) {
                                                                i31 ^= 54674;
                                                                switch (i31) {
                                                                    case 19:
                                                                        i31 = 54688;
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
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case 84:
                                    boolean zM2099 = C0108.m2099(list, str4);
                                    int i47 = 49914;
                                    while (true) {
                                        i47 ^= 49931;
                                        switch (i47) {
                                            case 497:
                                                i47 = !zM2099 ? 50658 : 50627;
                                                break;
                                            case 1711:
                                                break;
                                            case 1736:
                                                i11 = 0;
                                                int i48 = 50813;
                                                while (true) {
                                                    i48 ^= 50830;
                                                    switch (i48) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 243:
                                                            i48 = 50844;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    break;
                                                }
                                                break;
                                            case 1769:
                                                int i49 = 50689;
                                                while (true) {
                                                    i49 ^= 50706;
                                                    switch (i49) {
                                                        case 19:
                                                            i49 = 50720;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    i23 = C0017.f37 ^ (-409);
                                                    strM3816 = C0199.m3816(m6603(), 958, C0416.f687 ^ (-661), 915);
                                                    i24 = 51588;
                                                    while (true) {
                                                        i24 ^= 51605;
                                                        switch (i24) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                if (!z10) {
                                                                }
                                                                break;
                                                            case 54:
                                                                break;
                                                            case 87:
                                                                i11 = 0;
                                                                break;
                                                            case 116:
                                                                zM1085 = C0057.m1085(this, strM3816, str4);
                                                                i32 = 51712;
                                                                while (true) {
                                                                    i32 ^= 51729;
                                                                    switch (i32) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (!zM1085) {
                                                                            }
                                                                            break;
                                                                        case 47:
                                                                            zM4974 = C0260.m4973(this, strM3816, null, null, str4);
                                                                            i33 = 52611;
                                                                            while (true) {
                                                                                i33 ^= 52628;
                                                                                switch (i33) {
                                                                                    case 23:
                                                                                        if (!zM4974) {
                                                                                        }
                                                                                        break;
                                                                                    case 54:
                                                                                        break;
                                                                                    case 85:
                                                                                        zM7851 = C0400.m7850(this, strM3816, i23, str4);
                                                                                        i34 = 53510;
                                                                                        while (true) {
                                                                                            i34 ^= 53527;
                                                                                            switch (i34) {
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    if (!zM7851) {
                                                                                                    }
                                                                                                    break;
                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                    break;
                                                                                                case 83:
                                                                                                    i11 = 0;
                                                                                                    break;
                                                                                                case 116:
                                                                                                    i35 = 53634;
                                                                                                    while (true) {
                                                                                                        i35 ^= 53651;
                                                                                                        switch (i35) {
                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                i35 = 53665;
                                                                                                                break;
                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                        i11 = 3;
                                                                                                        i37 = 51836;
                                                                                                        while (true) {
                                                                                                            i37 ^= 51853;
                                                                                                            switch (i37) {
                                                                                                                case 241:
                                                                                                                    i37 = 52518;
                                                                                                                    break;
                                                                                                                case 1963:
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
                                                                                    case 116:
                                                                                        i11 = 14;
                                                                                        i36 = 52735;
                                                                                        while (true) {
                                                                                            i36 ^= 52752;
                                                                                            switch (i36) {
                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                    break;
                                                                                                case 1007:
                                                                                                    i36 = 52766;
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 76:
                                                                            i11 = 3;
                                                                            i37 = 51836;
                                                                            while (true) {
                                                                                i37 ^= 51853;
                                                                                switch (i37) {
                                                                                    case 241:
                                                                                        i37 = 52518;
                                                                                        break;
                                                                                    case 1963:
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
                                                    i25 = 53758;
                                                    while (true) {
                                                        i25 ^= 53775;
                                                        switch (i25) {
                                                            case 1009:
                                                                if (i11 == 0) {
                                                                }
                                                                break;
                                                            case 1703:
                                                                break;
                                                            case 1736:
                                                                break;
                                                            case 1769:
                                                                zM9344 = C0479.m9344(this, strM3816, str4);
                                                                i26 = 54533;
                                                                while (true) {
                                                                    i26 ^= 54550;
                                                                    switch (i26) {
                                                                        case 19:
                                                                            if (!zM9344) {
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 85:
                                                                            zM4973 = C0260.m4973(this, strM3816, null, null, str4);
                                                                            i27 = 55432;
                                                                            while (true) {
                                                                                i27 ^= 55449;
                                                                                switch (i27) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        if (!zM4973) {
                                                                                        }
                                                                                        break;
                                                                                    case 62:
                                                                                        break;
                                                                                    case 95:
                                                                                        zM7850 = C0400.m7850(this, strM3816, i23, str4);
                                                                                        i28 = 55680;
                                                                                        while (true) {
                                                                                            i28 ^= 55697;
                                                                                            switch (i28) {
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    if (!zM7850) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1467:
                                                                                                    break;
                                                                                                case 1496:
                                                                                                    i11 = 0;
                                                                                                    break;
                                                                                                case 1529:
                                                                                                    i29 = 56455;
                                                                                                    while (true) {
                                                                                                        i29 ^= 56472;
                                                                                                        switch (i29) {
                                                                                                            case 31:
                                                                                                                i29 = 56486;
                                                                                                                break;
                                                                                                            case 62:
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                        i11 = 3;
                                                                                                        i31 = 54657;
                                                                                                        while (true) {
                                                                                                            i31 ^= 54674;
                                                                                                            switch (i31) {
                                                                                                                case 19:
                                                                                                                    i31 = 54688;
                                                                                                                    break;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 124:
                                                                                        i30 = 55556;
                                                                                        while (true) {
                                                                                            i30 ^= 55573;
                                                                                            switch (i30) {
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i30 = 55587;
                                                                                                    break;
                                                                                                case 54:
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                            i11 = 14;
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 116:
                                                                            i11 = 3;
                                                                            i31 = 54657;
                                                                            while (true) {
                                                                                i31 ^= 54674;
                                                                                switch (i31) {
                                                                                    case 19:
                                                                                        i31 = 54688;
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
                                case 241:
                                    i46 = list != null ? 49883 : 49852;
                                    break;
                                default:
                                    break;
                            }
                            int i50 = 56579;
                            while (true) {
                                i50 ^= 56596;
                                switch (i50) {
                                    case 23:
                                        i50 = i11 != 0 ? 1507472 : 56641;
                                        break;
                                    case 54:
                                        break;
                                    case 85:
                                        boolean zM8786 = C0450.m8786(C0010.m195(bundle, str4));
                                        int i51 = 1508526;
                                        while (true) {
                                            i51 ^= 1508543;
                                            switch (i51) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i51 = zM8786 ? 1508619 : 1508588;
                                                    break;
                                                case 83:
                                                    iM1757 = C0082.m1757(this, str, str4, C0010.m195(bundle, str4), bundle, list, z10, false);
                                                    break;
                                                case 114:
                                                    break;
                                                case 436:
                                                    C0237.m4564(C0471.m9169(C0029.m572(this)), C0233.m4496(m6603(), 969, C0070.f90 ^ 672, 2878), str, str2, str4);
                                                    iM1757 = 22;
                                                    int i52 = 1508650;
                                                    while (true) {
                                                        i52 ^= 1508667;
                                                        switch (i52) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i52 = 1508681;
                                                                break;
                                                            case 114:
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
                                        int i53 = 1509425;
                                        while (true) {
                                            i53 ^= 1509442;
                                            switch (i53) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    zM7180 = C0365.m7180(str4);
                                                    i12 = 1510448;
                                                    while (true) {
                                                        i12 ^= 1510465;
                                                        switch (i12) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case 47:
                                                                break;
                                                            case 113:
                                                                i12 = zM7180 ? 1510541 : 1510510;
                                                                break;
                                                            case 204:
                                                                zM8869 = C0454.m8869(str4, C0387.m7598());
                                                                i13 = 1510572;
                                                                while (true) {
                                                                    i13 ^= 1510589;
                                                                    switch (i13) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i13 = !zM8869 ? 1511316 : 1510634;
                                                                            break;
                                                                        case 87:
                                                                            break;
                                                                        case 118:
                                                                            break;
                                                                        case 809:
                                                                            i14 = (C0137.f163 ^ 99) + i44;
                                                                            zM2887 = C0150.m2887(this, i39);
                                                                            i15 = C0270.f350 ^ (-719);
                                                                            i16 = 1511347;
                                                                            while (true) {
                                                                                i16 ^= 1511364;
                                                                                switch (i16) {
                                                                                    case 22:
                                                                                        break;
                                                                                    case 53:
                                                                                        i17 = 1511595;
                                                                                        while (true) {
                                                                                            i17 ^= 1511612;
                                                                                            switch (i17) {
                                                                                                case 23:
                                                                                                    i17 = i14 > i10 ? 1512339 : 1512308;
                                                                                                    break;
                                                                                                case 815:
                                                                                                    zM9115 = C0468.m9115();
                                                                                                    i18 = 1512370;
                                                                                                    while (true) {
                                                                                                        i18 ^= 1512387;
                                                                                                        switch (i18) {
                                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                break;
                                                                                                            case 51:
                                                                                                                C0112.m2169(C0069.m1345(C0029.m572(this)), C0460.m8963(m6603(), 1203, C0045.f65 ^ 96, 1693), C0174.m3320(C0233.m4489(this), str), C0232.m4479(C0233.m4489(this), bundle));
                                                                                                                C0246.m4723(i15, bundle);
                                                                                                                C0055.m1069(bundle, str4);
                                                                                                                break;
                                                                                                            case 113:
                                                                                                                i18 = zM9115 ? 1512463 : 1512432;
                                                                                                                break;
                                                                                                            case 1996:
                                                                                                                zM3575 = C0187.m3575(C0091.m1951(this), null, C0247.m4745());
                                                                                                                i19 = 1512494;
                                                                                                                while (true) {
                                                                                                                    i19 ^= 1512511;
                                                                                                                    switch (i19) {
                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                            i19 = zM3575 ? 1513238 : 1512556;
                                                                                                                            break;
                                                                                                                        case 83:
                                                                                                                            C0112.m2169(C0069.m1345(C0029.m572(this)), C0460.m8963(m6603(), 1203, C0045.f65 ^ 96, 1693), C0174.m3320(C0233.m4489(this), str), C0232.m4479(C0233.m4489(this), bundle));
                                                                                                                            C0246.m4723(i15, bundle);
                                                                                                                            C0055.m1069(bundle, str4);
                                                                                                                            break;
                                                                                                                        case 114:
                                                                                                                            break;
                                                                                                                        case 809:
                                                                                                                            C0112.m2169(C0069.m1345(C0029.m572(this)), C0031.m596(C0136.m2617(m6603(), 1148, C0327.f475 ^ (-824), 1642), i10, C0447.m8719(m6603(), 1177, C0147.f172 ^ 949, 992)), C0174.m3320(C0233.m4489(this), str), C0232.m4479(C0233.m4489(this), bundle));
                                                                                                                            C0246.m4723(C0174.f198 ^ (-181), bundle);
                                                                                                                            C0055.m1069(bundle, str4);
                                                                                                                            i20 = 1513269;
                                                                                                                            while (true) {
                                                                                                                                i20 ^= 1513286;
                                                                                                                                switch (i20) {
                                                                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                        break;
                                                                                                                                    case 115:
                                                                                                                                        i20 = 1513300;
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
                                                                                                    break;
                                                                                                case 968:
                                                                                                    break;
                                                                                                case 1001:
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 119:
                                                                                        i16 = !zM2887 ? 1511440 : 1511409;
                                                                                        break;
                                                                                    case 8148:
                                                                                        C0112.m2169(C0069.m1345(C0029.m572(this)), C0188.m3587(m6603(), 1065, C0330.f478 ^ 302, 1862), C0174.m3320(C0233.m4489(this), str), C0232.m4479(C0233.m4489(this), bundle));
                                                                                        C0246.m4723(i15, bundle);
                                                                                        C0055.m1069(bundle, str4);
                                                                                        i22 = 1511471;
                                                                                        while (true) {
                                                                                            i22 ^= 1511488;
                                                                                            switch (i22) {
                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                    break;
                                                                                                case 111:
                                                                                                    i22 = 1511502;
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
                                                                            i21 = 1513393;
                                                                            while (true) {
                                                                                i21 ^= 1513410;
                                                                                switch (i21) {
                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        i44 = i14;
                                                                                        continue;
                                                                                        continue;
                                                                                        break;
                                                                                    case 115:
                                                                                        i21 = 1513424;
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
                                                case 115:
                                                    i53 = iM1757 != 0 ? 1509518 : 1509487;
                                                    break;
                                                case 204:
                                                    boolean zM321 = C0016.m321(C0063.m1214(m6603(), 1062, C0061.f81 ^ 823, 2205), str4);
                                                    int i54 = 1509549;
                                                    while (true) {
                                                        i54 ^= 1509566;
                                                        switch (i54) {
                                                            case 19:
                                                                i54 = !zM321 ? 1509642 : 1509611;
                                                                break;
                                                            case 85:
                                                                zM7180 = C0365.m7180(str4);
                                                                i12 = 1510448;
                                                                while (true) {
                                                                    i12 ^= 1510465;
                                                                    switch (i12) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case 47:
                                                                            break;
                                                                            break;
                                                                        case 113:
                                                                            if (zM7180) {
                                                                            }
                                                                            break;
                                                                        case 204:
                                                                            zM8869 = C0454.m8869(str4, C0387.m7598());
                                                                            i13 = 1510572;
                                                                            while (true) {
                                                                                i13 ^= 1510589;
                                                                                switch (i13) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        if (!zM8869) {
                                                                                        }
                                                                                        break;
                                                                                    case 87:
                                                                                        break;
                                                                                        break;
                                                                                    case 118:
                                                                                        break;
                                                                                    case 809:
                                                                                        i14 = (C0137.f163 ^ 99) + i44;
                                                                                        zM2887 = C0150.m2887(this, i39);
                                                                                        i15 = C0270.f350 ^ (-719);
                                                                                        i16 = 1511347;
                                                                                        while (true) {
                                                                                            i16 ^= 1511364;
                                                                                            switch (i16) {
                                                                                                case 22:
                                                                                                    break;
                                                                                                case 53:
                                                                                                    i17 = 1511595;
                                                                                                    while (true) {
                                                                                                        i17 ^= 1511612;
                                                                                                        switch (i17) {
                                                                                                            case 23:
                                                                                                                if (i14 > i10) {
                                                                                                                }
                                                                                                                break;
                                                                                                            case 815:
                                                                                                                zM9115 = C0468.m9115();
                                                                                                                i18 = 1512370;
                                                                                                                while (true) {
                                                                                                                    i18 ^= 1512387;
                                                                                                                    switch (i18) {
                                                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                            break;
                                                                                                                        case 51:
                                                                                                                            C0112.m2169(C0069.m1345(C0029.m572(this)), C0460.m8963(m6603(), 1203, C0045.f65 ^ 96, 1693), C0174.m3320(C0233.m4489(this), str), C0232.m4479(C0233.m4489(this), bundle));
                                                                                                                            C0246.m4723(i15, bundle);
                                                                                                                            C0055.m1069(bundle, str4);
                                                                                                                            break;
                                                                                                                        case 113:
                                                                                                                            if (zM9115) {
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 1996:
                                                                                                                            zM3575 = C0187.m3575(C0091.m1951(this), null, C0247.m4745());
                                                                                                                            i19 = 1512494;
                                                                                                                            while (true) {
                                                                                                                                i19 ^= 1512511;
                                                                                                                                switch (i19) {
                                                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                        if (zM3575) {
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 83:
                                                                                                                                        C0112.m2169(C0069.m1345(C0029.m572(this)), C0460.m8963(m6603(), 1203, C0045.f65 ^ 96, 1693), C0174.m3320(C0233.m4489(this), str), C0232.m4479(C0233.m4489(this), bundle));
                                                                                                                                        C0246.m4723(i15, bundle);
                                                                                                                                        C0055.m1069(bundle, str4);
                                                                                                                                        break;
                                                                                                                                    case 114:
                                                                                                                                        break;
                                                                                                                                    case 809:
                                                                                                                                        C0112.m2169(C0069.m1345(C0029.m572(this)), C0031.m596(C0136.m2617(m6603(), 1148, C0327.f475 ^ (-824), 1642), i10, C0447.m8719(m6603(), 1177, C0147.f172 ^ 949, 992)), C0174.m3320(C0233.m4489(this), str), C0232.m4479(C0233.m4489(this), bundle));
                                                                                                                                        C0246.m4723(C0174.f198 ^ (-181), bundle);
                                                                                                                                        C0055.m1069(bundle, str4);
                                                                                                                                        i20 = 1513269;
                                                                                                                                        while (true) {
                                                                                                                                            i20 ^= 1513286;
                                                                                                                                            switch (i20) {
                                                                                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                                    break;
                                                                                                                                                case 115:
                                                                                                                                                    i20 = 1513300;
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
                                                                                                                break;
                                                                                                            case 968:
                                                                                                                break;
                                                                                                            case 1001:
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 119:
                                                                                                    if (!zM2887) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 8148:
                                                                                                    C0112.m2169(C0069.m1345(C0029.m572(this)), C0188.m3587(m6603(), 1065, C0330.f478 ^ 302, 1862), C0174.m3320(C0233.m4489(this), str), C0232.m4479(C0233.m4489(this), bundle));
                                                                                                    C0246.m4723(i15, bundle);
                                                                                                    C0055.m1069(bundle, str4);
                                                                                                    i22 = 1511471;
                                                                                                    while (true) {
                                                                                                        i22 ^= 1511488;
                                                                                                        switch (i22) {
                                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                                break;
                                                                                                            case 111:
                                                                                                                i22 = 1511502;
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
                                                                                        i21 = 1513393;
                                                                                        while (true) {
                                                                                            i21 ^= 1513410;
                                                                                            switch (i21) {
                                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                    i44 = i14;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    break;
                                                                                                case 115:
                                                                                                    i21 = 1513424;
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
                                                            case 114:
                                                                break;
                                                            case 436:
                                                                C0260.m4972(bundle, iM1757, str4, C0010.m195(bundle, str4));
                                                                C0055.m1069(bundle, str4);
                                                                int i55 = 1509673;
                                                                while (true) {
                                                                    i55 ^= 1509690;
                                                                    switch (i55) {
                                                                        case 19:
                                                                            i55 = 1510355;
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
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 1564036:
                                        int i56 = 1507503;
                                        while (true) {
                                            i56 ^= 1507520;
                                            switch (i56) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    str3 = null;
                                                    break;
                                                case 111:
                                                    i56 = i11 == 3 ? 1507596 : 1507565;
                                                    break;
                                                case 460:
                                                    int i57 = 1507627;
                                                    while (true) {
                                                        i57 ^= 1507644;
                                                        switch (i57) {
                                                            case 23:
                                                                i57 = 1507658;
                                                                break;
                                                            case 118:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                        str3 = str4;
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        C0260.m4972(bundle, i11, str4, str3);
                                        C0055.m1069(bundle, str4);
                                        int i58 = 1507751;
                                        while (true) {
                                            i58 ^= 1507768;
                                            switch (i58) {
                                                case 31:
                                                    i58 = 1508433;
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
                        }
                    }
                    break;
                default:
                    continue;
            }
            i38 = 1678;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0013, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(g4 g4Var, int i10) {
        Iterator itM9493 = C0487.m9493(new TreeSet(C0060.m1152(C0240.m4606(g4Var))));
        int i11 = 0;
        while (true) {
            boolean zM3327 = C0174.m3327(itM9493);
            int i12 = 1616;
            while (true) {
                i12 ^= 1633;
                switch (i12) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i12 = zM3327 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                int iM8673 = C0444.m8673();
                int i13 = 48891;
                while (true) {
                    i13 ^= 48908;
                    switch (i13) {
                        case 22:
                            break;
                        case 53:
                            return;
                        case 503:
                            if (iM8673 <= 0) {
                                i13 = 49635;
                            }
                            break;
                        case 32495:
                            System.out.println(Double.valueOf(C0178.m3386("cMu6y9yjZGeV7wZh1JJ1")));
                            return;
                        default:
                            continue;
                    }
                    i13 = 48953;
                }
            }
            String str = (String) C0413.m8115(itM9493);
            boolean zM7180 = C0365.m7180(str);
            int i14 = 1740;
            while (true) {
                i14 ^= 1757;
                switch (i14) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i14 = zM7180 ? 1833 : 1802;
                        break;
                    case 54:
                        break;
                    case 471:
                        break;
                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                        i11 += C0426.f697 ^ 376;
                        int i15 = 1864;
                        while (true) {
                            i15 ^= 1881;
                            switch (i15) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i15 = i11 > i10 ? 48736 : 48705;
                                    break;
                                case 47384:
                                    break;
                                case 47417:
                                    String strM596 = C0031.m596(C0017.m345(m6603(), 1240, C0356.f627 ^ 707, 1880), i10, C0079.m1700(m6603(), 1270, C0348.f619 ^ 978, 1891));
                                    d4 d4VarM572 = C0029.m572(this);
                                    String strM3320 = C0174.m3320(C0233.m4489(this), C0387.m7587(g4Var));
                                    c4 c4VarM4489 = C0233.m4489(this);
                                    Bundle bundleM4606 = C0240.m4606(g4Var);
                                    C0112.m2169(C0069.m1345(d4VarM572), strM596, strM3320, C0232.m4479(c4VarM4489, bundleM4606));
                                    C0246.m4723(C0275.f391 ^ 990, bundleM4606);
                                    C0055.m1069(bundleM4606, str);
                                    int i16 = 48767;
                                    while (true) {
                                        i16 ^= 48784;
                                        switch (i16) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 239:
                                                i16 = 48798;
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
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0031. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000a. Please report as an issue. */
    public final void P(Parcelable[] parcelableArr, int i10, boolean z10) {
        C0270.m5173(parcelableArr);
        int length = parcelableArr.length;
        int i11 = 0;
        while (true) {
            int i12 = i11;
            int i13 = 1616;
            while (true) {
                i13 ^= 1633;
                switch (i13) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i13 = i12 < length ? 1709 : 1678;
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
            Bundle bundle = (Bundle) parcelableArr[i12];
            Iterator itM9493 = C0487.m9493(new TreeSet(C0060.m1152(bundle)));
            int i14 = 0;
            while (true) {
                boolean zM3327 = C0174.m3327(itM9493);
                int i15 = 1740;
                while (true) {
                    i15 ^= 1757;
                    switch (i15) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i15 = zM3327 ? 1833 : 1802;
                            break;
                        case 54:
                            break;
                        case 471:
                            break;
                        case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                            String str = (String) C0413.m8115(itM9493);
                            boolean zM7180 = C0365.m7180(str);
                            int i16 = 1864;
                            while (true) {
                                i16 ^= 1881;
                                switch (i16) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i16 = zM7180 ? 48736 : 48705;
                                        break;
                                    case 47384:
                                        break;
                                    case 47417:
                                        boolean zM8869 = C0454.m8869(str, C0387.m7598());
                                        int i17 = 48767;
                                        while (true) {
                                            i17 ^= 48784;
                                            switch (i17) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    break;
                                                case 76:
                                                    i14 += C0281.f426 ^ 808;
                                                    int i18 = 48891;
                                                    while (true) {
                                                        i18 ^= 48908;
                                                        switch (i18) {
                                                            case 22:
                                                                break;
                                                            case 53:
                                                                break;
                                                            case 503:
                                                                i18 = i14 > i10 ? 49635 : 48953;
                                                                break;
                                                            case 32495:
                                                                int i19 = 49666;
                                                                while (true) {
                                                                    i19 ^= 49683;
                                                                    switch (i19) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i19 = z10 ? 49759 : 49728;
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 76:
                                                                            C0112.m2169(C0069.m1345(C0029.m572(this)), C0031.m596(C0113.m2192(m6603(), 1277, C0402.f673 ^ 790, 1777), i10, C0392.m7676(m6603(), 1307, C0417.f688 ^ 515, 1653)), C0411.m8083(C0233.m4489(this), str), C0232.m4479(C0233.m4489(this), bundle));
                                                                            C0246.m4723(C0116.f142 ^ 240, bundle);
                                                                            int i20 = 49790;
                                                                            while (true) {
                                                                                i20 ^= 49807;
                                                                                switch (i20) {
                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case 241:
                                                                                        i20 = 49821;
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 83:
                                                                            C0112.m2169(C0069.m1345(C0029.m572(this)), C0207.m3953(m6603(), 1337, C0177.f201 ^ 485, 1171), C0411.m8083(C0233.m4489(this), str), C0232.m4479(C0233.m4489(this), bundle));
                                                                            C0246.m4723(C0420.f691 ^ 290, bundle);
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0055.m1069(bundle, str);
                                                                int i21 = 49914;
                                                                while (true) {
                                                                    i21 ^= 49931;
                                                                    switch (i21) {
                                                                        case 497:
                                                                            i21 = 50596;
                                                                            break;
                                                                        case 1711:
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
                                                    i17 = !zM8869 ? 48860 : 48829;
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
                            break;
                        default:
                            break;
                    }
                    i11 = (C0351.f622 ^ 535) + i12;
                    int i22 = 50689;
                    while (true) {
                        i22 ^= 50706;
                        switch (i22) {
                            case 19:
                                i22 = 50720;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                        }
                    }
                }
            }
        }
    }

    public final boolean T(String str, int i10, String str2) {
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (str2 == null) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    d4 d4VarM572 = C0029.m572(this);
                    C0419.m8245(C0069.m1345(d4VarM572), C0458.m8935(m6603(), 1387, C0050.f70 ^ 924, 2767), str);
                    return false;
                case 239:
                    int iM7372 = C0376.m7372(str2, 0, C0416.m8181(str2));
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM7372 > i10) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return true;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                d4 d4VarM573 = C0029.m572(this);
                                C0237.m4564(C0069.m1345(d4VarM573), C0079.m1700(m6603(), 1427, C0399.f670 ^ 52, 2694), str, C0057.m1083(i10), str2);
                                return false;
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

    public final boolean U(String str, String str2) {
        boolean zM1883 = C0088.m1883(str);
        Object objM3121 = C0163.m3121(this);
        String strM5301 = C0275.m5301(m6603(), 1481, C0227.f307 ^ (-935), 3010);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = !zM1883 ? 1709 : 1678;
                    break;
                case 204:
                    C0270.m5173(str);
                    boolean zM4736 = C0247.m4736(str, strM5301);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = !zM4736 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean zM1884 = C0088.m1883(C0133.m2573((f5) objM3121));
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (zM1884) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            C0419.m8245(C0069.m1345(C0029.m572(this)), C0325.m6296(m6603(), 1522, C0047.f67 ^ 917, 1568), C0027.m535(str));
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i12 = 48705;
                                }
                                return false;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    boolean zM1885 = C0088.m1883(str2);
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                boolean zM1886 = C0088.m1883(C0133.m2573((f5) objM3121));
                                int i14 = 49666;
                                while (true) {
                                    i14 ^= 49683;
                                    switch (i14) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (zM1886) {
                                                i14 = 49759;
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            C0135.m2604(C0069.m1345(C0029.m572(this)), C0019.m390(m6603(), 1653, C0331.f479 ^ 330, 2275));
                                            break;
                                        case 83:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i14 = 49728;
                                }
                                return false;
                            case 76:
                                C0270.m5173(str2);
                                boolean zM4737 = C0247.m4736(str2, strM5301);
                                int i15 = 48891;
                                while (true) {
                                    i15 ^= 48908;
                                    switch (i15) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 503:
                                            i15 = !zM4737 ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            C0419.m8245(C0069.m1345(C0029.m572(this)), C0165.m3159(m6603(), 1612, C0318.f466 ^ 134, 2258), C0027.m535(str2));
                                            return false;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                i13 = !zM1885 ? 48860 : 48829;
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
        return true;
    }

    public final boolean V(String str, String str2, int i10, Object obj) {
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
                    return true;
                case 239:
                    boolean z10 = obj instanceof Long;
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!z10) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return true;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean z11 = obj instanceof Float;
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (!z11) {
                                                i13 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            return true;
                                        case 47417:
                                            boolean z12 = obj instanceof Integer;
                                            int i14 = 48767;
                                            while (true) {
                                                i14 ^= 48784;
                                                switch (i14) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        return true;
                                                    case 76:
                                                        boolean z13 = obj instanceof Byte;
                                                        int i15 = 48891;
                                                        while (true) {
                                                            i15 ^= 48908;
                                                            switch (i15) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    return true;
                                                                case 503:
                                                                    if (!z13) {
                                                                        i15 = 49635;
                                                                    }
                                                                    break;
                                                                case 32495:
                                                                    boolean z14 = obj instanceof Short;
                                                                    int i16 = 49666;
                                                                    while (true) {
                                                                        i16 ^= 49683;
                                                                        switch (i16) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (!z14) {
                                                                                    i16 = 49759;
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 76:
                                                                                boolean z15 = obj instanceof Boolean;
                                                                                int i17 = 49790;
                                                                                while (true) {
                                                                                    i17 ^= 49807;
                                                                                    switch (i17) {
                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 51:
                                                                                            return true;
                                                                                        case 84:
                                                                                            boolean z16 = obj instanceof Double;
                                                                                            int i18 = 49914;
                                                                                            while (true) {
                                                                                                i18 ^= 49931;
                                                                                                switch (i18) {
                                                                                                    case 497:
                                                                                                        if (z16) {
                                                                                                            i18 = 50658;
                                                                                                        }
                                                                                                        break;
                                                                                                    case 1711:
                                                                                                        break;
                                                                                                    case 1736:
                                                                                                        boolean z17 = obj instanceof String;
                                                                                                        int i19 = 50813;
                                                                                                        while (true) {
                                                                                                            i19 ^= 50830;
                                                                                                            switch (i19) {
                                                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                    break;
                                                                                                                case 53:
                                                                                                                    break;
                                                                                                                case 243:
                                                                                                                    i19 = !z17 ? 51557 : 50875;
                                                                                                                    break;
                                                                                                                case 4075:
                                                                                                                    boolean z18 = obj instanceof Character;
                                                                                                                    int i20 = 51588;
                                                                                                                    while (true) {
                                                                                                                        i20 ^= 51605;
                                                                                                                        switch (i20) {
                                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                i20 = !z18 ? 51681 : 51650;
                                                                                                                                break;
                                                                                                                            case 54:
                                                                                                                                break;
                                                                                                                            case 87:
                                                                                                                                break;
                                                                                                                            case 116:
                                                                                                                                boolean z19 = obj instanceof CharSequence;
                                                                                                                                int i21 = 51712;
                                                                                                                                while (true) {
                                                                                                                                    i21 ^= 51729;
                                                                                                                                    switch (i21) {
                                                                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                                                                            break;
                                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                            i21 = z19 ? 51805 : 51774;
                                                                                                                                            break;
                                                                                                                                        case 47:
                                                                                                                                            return false;
                                                                                                                                        case 76:
                                                                                                                                            int i22 = 51836;
                                                                                                                                            while (true) {
                                                                                                                                                i22 ^= 51853;
                                                                                                                                                switch (i22) {
                                                                                                                                                    case 241:
                                                                                                                                                        i22 = 52518;
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
                                                                                                        String strM4789 = C0250.m4789(obj);
                                                                                                        int iM7372 = C0376.m7372(strM4789, 0, C0416.m8181(strM4789));
                                                                                                        int i23 = 52611;
                                                                                                        while (true) {
                                                                                                            i23 ^= 52628;
                                                                                                            switch (i23) {
                                                                                                                case 23:
                                                                                                                    if (iM7372 > i10) {
                                                                                                                        i23 = 52704;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 54:
                                                                                                                    break;
                                                                                                                case 85:
                                                                                                                    return true;
                                                                                                                case 116:
                                                                                                                    C0237.m4564(C0471.m9169(C0029.m572(this)), C0150.m2874(m6603(), 1730, C0361.f632 ^ 29, 1196), str, str2, C0057.m1083(C0416.m8181(strM4789)));
                                                                                                                    return false;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                            }
                                                                                                            i23 = 52673;
                                                                                                        }
                                                                                                        break;
                                                                                                    case 1769:
                                                                                                        int i24 = 50689;
                                                                                                        while (true) {
                                                                                                            i24 ^= 50706;
                                                                                                            switch (i24) {
                                                                                                                case 19:
                                                                                                                    i24 = 50720;
                                                                                                                    break;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                    return true;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                }
                                                                                                i18 = 50627;
                                                                                            }
                                                                                            break;
                                                                                        case 241:
                                                                                            if (!z15) {
                                                                                                i17 = 49883;
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    i17 = 49852;
                                                                                }
                                                                                break;
                                                                            case 83:
                                                                                return true;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i16 = 49728;
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i15 = 48953;
                                                        }
                                                        break;
                                                    case 239:
                                                        if (!z12) {
                                                            i14 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i14 = 48829;
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

    public final boolean Y(String str, String[] strArr, String[] strArr2, String str2) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (str2 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    C0419.m8245(C0069.m1345(C0029.m572(this)), C0287.m5538(m6603(), 1790, C0481.f755 ^ (-513), 3012), str);
                    return false;
                case 239:
                    String[] strArrM3106 = C0162.m3106();
                    int i11 = 0;
                    while (true) {
                        int i12 = 1740;
                        while (true) {
                            i12 ^= 1757;
                            switch (i12) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = i11 < 3 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    int i13 = 48891;
                                    while (true) {
                                        i13 ^= 48908;
                                        switch (i13) {
                                            case 22:
                                                break;
                                            case 53:
                                                break;
                                            case 503:
                                                i13 = strArr != null ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                boolean zM8869 = C0454.m8869(str2, strArr);
                                                int i14 = 49666;
                                                while (true) {
                                                    i14 ^= 49683;
                                                    switch (i14) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i14 = zM8869 ? 49759 : 49728;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 76:
                                                            int i15 = 49790;
                                                            while (true) {
                                                                i15 ^= 49807;
                                                                switch (i15) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 51:
                                                                        break;
                                                                    case 84:
                                                                        boolean zM88610 = C0454.m8869(str2, strArr2);
                                                                        int i16 = 49914;
                                                                        while (true) {
                                                                            i16 ^= 49931;
                                                                            switch (i16) {
                                                                                case 497:
                                                                                    i16 = !zM88610 ? 50658 : 50627;
                                                                                    break;
                                                                                case 1711:
                                                                                    break;
                                                                                case 1736:
                                                                                    break;
                                                                                case 1769:
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 241:
                                                                        i15 = strArr2 != null ? 49883 : 49852;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            C0112.m2169(C0069.m1345(C0029.m572(this)), C0070.m1360(m6603(), 1874, C0274.f390 ^ 922, 1885), str, str2);
                                                            return false;
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
                                    return true;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    break;
                                default:
                                    break;
                            }
                        }
                        boolean zM8715 = C0447.m8715(str2, strArrM3106[i11]);
                        int i17 = 1864;
                        while (true) {
                            i17 ^= 1881;
                            switch (i17) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i17 = zM8715 ? 48736 : 48705;
                                    break;
                                case 47384:
                                    break;
                                case 47417:
                                    C0112.m2169(C0069.m1345(C0029.m572(this)), C0456.m8898(m6603(), 1830, C0186.f210 ^ (-360), 469), str, str2);
                                    return false;
                                case 47483:
                                    break;
                                default:
                                    break;
                            }
                        }
                        i11 += C0162.f186 ^ 837;
                        int i18 = 48767;
                        while (true) {
                            i18 ^= 48784;
                            switch (i18) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 239:
                                    i18 = 48798;
                                    break;
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

    public final boolean a0(int i10) {
        Boolean boolM905 = C0047.m905(C0146.m2789((f5) C0163.m3121(this)));
        int iM9136 = C0469.m9136(this);
        int i11 = i10 / (C0423.f694 ^ 206);
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9136 < i11) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    int i13 = 1740;
                    while (true) {
                        i13 ^= 1757;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i13 = boolM905 != null ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                return false;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean zM14 = C0000.m14(boolM905);
                                int i14 = 1864;
                                while (true) {
                                    i14 ^= 1881;
                                    switch (i14) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i14 = !zM14 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            return false;
                                        case 47417:
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
                    continue;
            }
            i12 = 1678;
        }
        return true;
    }

    public final int b0(String str) {
        String strM3702 = C0193.m3702(m6603(), 1902, C0482.f756 ^ 930, 1798);
        boolean zM9344 = C0479.m9344(this, strM3702, str);
        int i10 = C0236.f316 ^ (-772);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM9344) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    return i10;
                case 239:
                    boolean zM4973 = C0260.m4973(this, strM3702, C0351.m6887(), null, str);
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM4973) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                boolean zM7850 = C0400.m7850(this, strM3702, C0247.f327 ^ (-505), str);
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (!zM7850) {
                                                i13 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            return 0;
                                        case 47417:
                                            return i10;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i13 = 48705;
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return C0012.f32 ^ 941;
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

    /* JADX WARN: Code restructure failed: missing block: B:49:0x001d, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x001d, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0025. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle c0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (bundle != null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    Iterator itM5256 = C0272.m5256(C0060.m1152(bundle));
                    while (true) {
                        boolean zM3327 = C0174.m3327(itM5256);
                        int i11 = 1740;
                        while (true) {
                            i11 ^= 1757;
                            switch (i11) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = zM3327 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    break;
                                default:
                                    break;
                            }
                            break;
                        }
                        String str = (String) C0413.m8115(itM5256);
                        Object objM6824 = C0348.m6824(this, C0010.m195(bundle, str), str);
                        int i12 = 1864;
                        while (true) {
                            i12 ^= 1881;
                            switch (i12) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = objM6824 == null ? 48736 : 48705;
                                    break;
                                case 47384:
                                    C0488.m9513(this, bundle2, str, objM6824);
                                    int i13 = 48891;
                                    while (true) {
                                        i13 ^= 48908;
                                        switch (i13) {
                                            case 22:
                                                break;
                                            case 503:
                                                i13 = 48922;
                                                break;
                                        }
                                    }
                                    break;
                                case 47417:
                                    C0419.m8245(C0471.m9169(C0029.m572(this)), C0074.m1617(m6603(), 1915, C0011.f31 ^ 381, 719), C0411.m8083(C0233.m4489(this), str));
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
                                case 47483:
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return bundle2;
    }

    public final Object d0(Object obj, String str) {
        int iM8054;
        boolean zM321 = C0016.m321(C0141.m2710(m6603(), 1940, C0484.f758 ^ (-742), 2952), str);
        Object objM3121 = C0163.m3121(this);
        int i10 = C0462.f733 ^ 53;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM321) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    return C0289.m5574(this, C0059.m1119(C0410.m8054(C0091.m1951(this), C0264.m5048(C0306.m5917((f5) objM3121))), i10), obj, true, true);
                case 239:
                    boolean zM9580 = C0492.m9580(str);
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM9580) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                iM8054 = C0410.m8054(C0091.m1951(this), C0264.m5048(C0306.m5917((f5) objM3121)));
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                iM8054 = C0059.m1119(C0410.m8054(C0091.m1951(this), C0264.m5048(C0306.m5917((f5) objM3121))), i10);
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i13 = 48674;
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i12 = 1802;
                    }
                    return C0289.m5574(this, iM8054, obj, false, true);
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public final boolean g0(Context context, String str) {
        X500Principal x500Principal = new X500Principal(C0202.m3867(m6603(), 1943, C0115.f141 ^ (-545), 381));
        try {
            PackageInfo packageInfoM5365 = C0277.m5365(C0478.m9334(context), C0107.f133 ^ (-664), str);
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i10 = packageInfoM5365 != null ? 1709 : 1678;
                        break;
                    case 204:
                        Signature[] signatureArrM5590 = C0290.m5590(packageInfoM5365);
                        int i11 = 1740;
                        while (true) {
                            i11 ^= 1757;
                            switch (i11) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = signatureArrM5590 != null ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    int length = signatureArrM5590.length;
                                    int i12 = 1864;
                                    while (true) {
                                        i12 ^= 1881;
                                        switch (i12) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i12 = length > 0 ? 48736 : 48705;
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                return C0192.m3662(C0010.m207((X509Certificate) C0225.m4343(C0101.m1969(C0205.m3930(m6603(), 1974, C0124.f150 ^ (-105), 446)), new ByteArrayInputStream(C0393.m7700(signatureArrM5590[0])))), x500Principal);
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
        } catch (PackageManager.NameNotFoundException e4) {
            int i13 = 48767;
            while (true) {
                i13 ^= 48784;
                switch (i13) {
                    case Code.UNAVAILABLE /* 14 */:
                        C0419.m8245(C0454.m8871(C0029.m572(this)), C0359.m7056(m6603(), 1979, C0458.f729 ^ (-289), 977), e4);
                        int i14 = 49666;
                        while (true) {
                            i14 ^= 49683;
                            switch (i14) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i14 = 49697;
                                    continue;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                default:
                                    continue;
                            }
                        }
                        break;
                    case 239:
                        i13 = 48798;
                        continue;
                    default:
                        continue;
                }
            }
        } catch (CertificateException e10) {
            int i15 = 48891;
            while (true) {
                i15 ^= 48908;
                switch (i15) {
                    case 22:
                        C0419.m8245(C0454.m8871(C0029.m572(this)), C0358.m7042(m6603(), 2001, C0168.f192 ^ 939, 682), e10);
                        break;
                    case 503:
                        i15 = 48922;
                        continue;
                    default:
                        continue;
                }
            }
        }
        return true;
    }

    public final boolean h0(String str, String str2) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (str2 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    C0419.m8245(C0069.m1345(C0029.m572(this)), C0227.m4381(m6603(), 2028, C0173.f197 ^ (-776), 2120), str);
                    return false;
                case 239:
                    int iM8181 = C0416.m8181(str2);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM8181 == 0) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                int iM6062 = C0313.m6062(str2, 0);
                                boolean zM8974 = C0460.m8974(iM6062);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = !zM8974 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case 76:
                                                        C0112.m2169(C0069.m1345(C0029.m572(this)), C0397.m7776(m6603(), 2109, C0298.f446 ^ (-178), 3077), str, str2);
                                                        return false;
                                                    case 239:
                                                        i13 = iM6062 != 95 ? 48860 : 48829;
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
                                int iM8182 = C0416.m8181(str2);
                                int iM3661 = C0192.m3661(iM6062);
                                while (true) {
                                    int i14 = 48891;
                                    while (true) {
                                        i14 ^= 48908;
                                        switch (i14) {
                                            case 22:
                                                break;
                                            case 53:
                                                return true;
                                            case 503:
                                                i14 = iM3661 < iM8182 ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    int iM6063 = C0313.m6062(str2, iM3661);
                                    int i15 = 49666;
                                    while (true) {
                                        i15 ^= 49683;
                                        switch (i15) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i15 = iM6063 != 95 ? 49759 : 49728;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                boolean zM4743 = C0247.m4743(iM6063);
                                                int i16 = 49790;
                                                while (true) {
                                                    i16 ^= 49807;
                                                    switch (i16) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 51:
                                                            break;
                                                        case 84:
                                                            C0112.m2169(C0069.m1345(C0029.m572(this)), C0465.m9075(m6603(), 2168, C0040.f60 ^ (-20), 2741), str, str2);
                                                            return false;
                                                        case 241:
                                                            i16 = !zM4743 ? 49883 : 49852;
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
                                    iM3661 = (iM3661 - 2) + C0192.m3661(iM6063) + 2;
                                    int i17 = 49914;
                                    while (true) {
                                        i17 ^= 49931;
                                        switch (i17) {
                                            case 497:
                                                i17 = 50596;
                                                break;
                                            case 1711:
                                                break;
                                        }
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0419.m8245(C0069.m1345(C0029.m572(this)), C0024.m469(m6603(), 2068, C0194.f218 ^ 146, 2773), str);
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

    public final Object i0(Object obj, String str) {
        boolean zM321 = C0016.m321(C0394.m7730(m6603(), 2235, C0468.f739 ^ 301, 1162), str);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM321) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return C0289.m5574(this, C0413.m8121(str), obj, true, false);
                case 239:
                    return C0289.m5574(this, C0413.m8121(str), obj, false, false);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final boolean k0(String str, String str2) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (str2 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    C0419.m8245(C0069.m1345(C0029.m572(this)), C0255.m4884(m6603(), 2239, C0278.f423 ^ (-94), 1079), str);
                    return false;
                case 239:
                    int iM8181 = C0416.m8181(str2);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM8181 == 0) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                int iM6062 = C0313.m6062(str2, 0);
                                boolean zM8974 = C0460.m8974(iM6062);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (!zM8974) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            int iM8182 = C0416.m8181(str2);
                                            int iM3661 = C0192.m3661(iM6062);
                                            while (true) {
                                                int i13 = 48767;
                                                while (true) {
                                                    i13 ^= 48784;
                                                    switch (i13) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            return true;
                                                        case 76:
                                                            break;
                                                        case 239:
                                                            i13 = iM3661 < iM8182 ? 48860 : 48829;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                int iM6063 = C0313.m6062(str2, iM3661);
                                                int i14 = 48891;
                                                while (true) {
                                                    i14 ^= 48908;
                                                    switch (i14) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            break;
                                                        case 503:
                                                            i14 = iM6063 != 95 ? 49635 : 48953;
                                                            break;
                                                        case 32495:
                                                            boolean zM4743 = C0247.m4743(iM6063);
                                                            int i15 = 49666;
                                                            while (true) {
                                                                i15 ^= 49683;
                                                                switch (i15) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i15 = !zM4743 ? 49759 : 49728;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 76:
                                                                        C0112.m2169(C0069.m1345(C0029.m572(this)), C0443.m8659(m6603(), 2361, C0361.f632 ^ 98, 2112), str, str2);
                                                                        return false;
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
                                                iM3661 = 0 - ((0 - iM3661) - C0192.m3661(iM6063));
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
                                        case 47417:
                                            C0112.m2169(C0069.m1345(C0029.m572(this)), C0471.m9178(m6603(), 2320, C0445.f716 ^ 532, 1557), str, str2);
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
                                C0419.m8245(C0069.m1345(C0029.m572(this)), C0316.m6131(m6603(), 2279, C0388.f659 ^ 569, 550), str);
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

    public final boolean m0(String str) {
        C0223.m4302(this);
        int iM7929 = C0404.m7929(C0423.m8316(C0478.m9334(C0276.m5311(this))), str);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7929 == 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return true;
                case 239:
                    d4 d4VarM572 = C0029.m572(this);
                    C0419.m8245(C0465.m9073(d4VarM572), C0075.m1636(m6603(), 2428, C0399.f670 ^ 20, 3200), str);
                    return false;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final int n0() {
        int iM8851 = 0;
        Integer numM3670 = C0192.m3670(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (numM3670 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    z5.f fVarM4545 = C0236.m4545();
                    Context contextM5311 = C0276.m5311(this);
                    C0014.m280(fVarM4545);
                    C0247.m4734();
                    try {
                        iM8851 = C0453.m8851(C0290.m5588(C0421.m8279(contextM5311), C0283.m5471(m6603(), 2450, C0209.f233 ^ 200, 2518), 0));
                        int i11 = 1740;
                        while (true) {
                            i11 ^= 1757;
                            switch (i11) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = 1771;
                                    break;
                                case 54:
                                    this.f10430h = C0057.m1083(iM8851 / (C0154.f179 ^ (-975)));
                                    break;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e4) {
                        C0127.m2451(m6603(), 2472, C0267.f347 ^ (-349), 2360);
                        C0198.m3789(m6603(), 2494, C0455.f726 ^ 528, 2245);
                    }
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return C0366.m7190(C0192.m3670(this));
    }

    @Override // k6.o5
    public final boolean o() {
        return true;
    }

    public final int p(Object obj, String str) {
        boolean zM5900;
        boolean zM321 = C0016.m321(C0280.m5427(m6603(), 2526, C0360.f631 ^ 742, 1845), str);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = zM321 ? 1709 : 1678;
                    break;
                case 204:
                    zM5900 = C0305.m5900(this, C0204.m3906(m6603(), 2530, C0439.f710 ^ 978, 1770), str, C0413.m8121(str), obj);
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
                    zM5900 = C0305.m5900(this, C0116.m2234(m6603(), 2552, C0083.f117 ^ (-774), 893), str, C0413.m8121(str), obj);
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
                    if (zM5900) {
                        i12 = 48736;
                    }
                    break;
                case 47384:
                    return C0135.f161 ^ (-900);
                case 47417:
                    return 0;
                case 47483:
                    break;
                default:
                    continue;
            }
            i12 = 48705;
        }
    }

    /* JADX WARN: Code duplicated, block: B:316:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x029c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:116:0x01b8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:87:0x014c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:94:0x0165. Please report as an issue. */
    public final long p0() {
        int i10;
        long j10;
        long j11;
        boolean zM14;
        int i11;
        Integer num;
        int i12;
        boolean z10 = false;
        C0223.m4302(this);
        boolean zM6317 = C0327.m6317(C0264.m5048(C0306.m5917((f5) C0163.m3121(this))));
        long j12 = (-150) ^ ((long) C0053.f73);
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM6317) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    return j12;
                case 239:
                    int iM7181 = C0366.m7181();
                    int i14 = 1740;
                    while (true) {
                        i14 ^= 1757;
                        switch (i14) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i14 = iM7181 < 30 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                int iM3581 = C0188.m3581();
                                int i15 = 48767;
                                while (true) {
                                    i15 ^= 48784;
                                    switch (i15) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            int i16 = 49666;
                                            while (true) {
                                                i16 ^= 49683;
                                                switch (i16) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i16 = iM7181 >= 30 ? 49759 : 49728;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        int iM3582 = C0188.m3581();
                                                        int i17 = 49790;
                                                        while (true) {
                                                            i17 ^= 49807;
                                                            switch (i17) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 51:
                                                                    i10 = 0;
                                                                    break;
                                                                case 84:
                                                                    int iM7223 = C0368.m7223();
                                                                    int i18 = 49914;
                                                                    while (true) {
                                                                        i18 ^= 49931;
                                                                        switch (i18) {
                                                                            case 497:
                                                                                i18 = 50596;
                                                                                continue;
                                                                            case 1711:
                                                                                i10 = iM7223;
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 241:
                                                                    i17 = iM3582 > 3 ? 49883 : 49852;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 83:
                                                        i10 = 0;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            int iM7190 = C0366.m7190((Integer) C0261.m4995(C0340.m6686(), null));
                                            int i19 = 50689;
                                            while (true) {
                                                i19 ^= 50706;
                                                switch (i19) {
                                                    case 19:
                                                        i19 = i10 < iM7190 ? 50782 : 50751;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        j10 = j12;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        j10 = 16;
                                                        int i20 = 50813;
                                                        while (true) {
                                                            i20 ^= 50830;
                                                            switch (i20) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 243:
                                                                    i20 = 50844;
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
                                        case 76:
                                            j10 = 8;
                                            int i21 = 48891;
                                            while (true) {
                                                i21 ^= 48908;
                                                switch (i21) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i21 = 48922;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 239:
                                            i15 = iM3581 < 4 ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                j10 = 4;
                                int i22 = 1864;
                                while (true) {
                                    i22 ^= 1881;
                                    switch (i22) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i22 = 48674;
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zM3020 = C0158.m3020(this, C0354.m6950(m6603(), 2565, C0253.f333 ^ 225, 674));
                    int i23 = 51588;
                    while (true) {
                        i23 ^= 51605;
                        switch (i23) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i23 = !zM3020 ? 51681 : 51650;
                                break;
                            case 54:
                                break;
                            case 87:
                                j11 = j10;
                                break;
                            case 116:
                                j11 = (j10 & 2) | (j10 ^ 2);
                                break;
                            default:
                                break;
                        }
                    }
                    int i24 = 51712;
                    while (true) {
                        i24 ^= 51729;
                        switch (i24) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i24 = j11 == j12 ? 51805 : 51774;
                                break;
                            case 47:
                                break;
                            case 76:
                                Boolean boolM721 = C0037.m721(this);
                                int i25 = 51836;
                                while (true) {
                                    i25 ^= 51853;
                                    switch (i25) {
                                        case 241:
                                            i25 = boolM721 == null ? 52580 : 52549;
                                            break;
                                        case 1963:
                                            break;
                                        case 1992:
                                            zM14 = C0000.m14(C0037.m721(this));
                                            i11 = 1507627;
                                            while (true) {
                                                i11 ^= 1507644;
                                                switch (i11) {
                                                    case 23:
                                                        i11 = !zM14 ? 1507720 : 1507689;
                                                        break;
                                                    case 85:
                                                        break;
                                                    case 118:
                                                        break;
                                                    case 180:
                                                        j11 = (64 ^ j11) | (64 & j11);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 2025:
                                            w3.d dVarM7162 = C0365.m7162(this);
                                            int i26 = 52611;
                                            while (true) {
                                                i26 ^= 52628;
                                                switch (i26) {
                                                    case 23:
                                                        i26 = dVarM7162 == null ? 52704 : 52673;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        try {
                                                            num = (Integer) C0253.m4843(C0216.m4126(dVarM7162), (-9238) ^ ((long) C0236.f316), C0472.m9196());
                                                            int i27 = 53510;
                                                            while (true) {
                                                                i27 ^= 53527;
                                                                switch (i27) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i27 = num != null ? 53603 : 53572;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 83:
                                                                        break;
                                                                    case 116:
                                                                        try {
                                                                            int iM7191 = C0366.m7190(num);
                                                                            int i28 = 53634;
                                                                            while (true) {
                                                                                i28 ^= 53651;
                                                                                switch (i28) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i28 = iM7191 == 1 ? 53727 : 53696;
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        break;
                                                                                    case 76:
                                                                                        int i29 = 53758;
                                                                                        while (true) {
                                                                                            i29 ^= 53775;
                                                                                            switch (i29) {
                                                                                                case 1009:
                                                                                                    i29 = 54440;
                                                                                                    continue;
                                                                                                case 1703:
                                                                                                    z10 = true;
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 83:
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                        } catch (InterruptedException e4) {
                                                                            e = e4;
                                                                            int i30 = 54657;
                                                                            while (true) {
                                                                                i30 ^= 54674;
                                                                                switch (i30) {
                                                                                    case 19:
                                                                                        i30 = 54688;
                                                                                        continue;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                                i12 = 54533;
                                                                                while (true) {
                                                                                    i12 ^= 54550;
                                                                                    switch (i12) {
                                                                                        case 19:
                                                                                            i12 = 54564;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                    }
                                                                                    C0419.m8245(C0330.m6385(C0029.m572(this)), C0429.m8416(m6603(), 2613, C0202.f226 ^ (-390), 2188), e);
                                                                                    this.f10429g = C0455.m8876();
                                                                                    break;
                                                                                }
                                                                            }
                                                                        } catch (CancellationException e10) {
                                                                            e = e10;
                                                                            int i31 = 55556;
                                                                            while (true) {
                                                                                i31 ^= 55573;
                                                                                switch (i31) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i31 = 55587;
                                                                                        continue;
                                                                                    case 54:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                                i12 = 54533;
                                                                                while (true) {
                                                                                    i12 ^= 54550;
                                                                                    switch (i12) {
                                                                                        case 19:
                                                                                            i12 = 54564;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                    }
                                                                                    C0419.m8245(C0330.m6385(C0029.m572(this)), C0429.m8416(m6603(), 2613, C0202.f226 ^ (-390), 2188), e);
                                                                                    this.f10429g = C0455.m8876();
                                                                                    break;
                                                                                }
                                                                            }
                                                                        } catch (ExecutionException e11) {
                                                                            e = e11;
                                                                            int i32 = 55432;
                                                                            while (true) {
                                                                                i32 ^= 55449;
                                                                                switch (i32) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i32 = 55463;
                                                                                        continue;
                                                                                    case 62:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                                i12 = 54533;
                                                                                while (true) {
                                                                                    i12 ^= 54550;
                                                                                    switch (i12) {
                                                                                        case 19:
                                                                                            i12 = 54564;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                    }
                                                                                    C0419.m8245(C0330.m6385(C0029.m572(this)), C0429.m8416(m6603(), 2613, C0202.f226 ^ (-390), 2188), e);
                                                                                    this.f10429g = C0455.m8876();
                                                                                    break;
                                                                                }
                                                                            }
                                                                        } catch (TimeoutException e12) {
                                                                            e = e12;
                                                                            i12 = 54533;
                                                                            while (true) {
                                                                                i12 ^= 54550;
                                                                                switch (i12) {
                                                                                    case 19:
                                                                                        i12 = 54564;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                                C0419.m8245(C0330.m6385(C0029.m572(this)), C0429.m8416(m6603(), 2613, C0202.f226 ^ (-390), 2188), e);
                                                                                this.f10429g = C0455.m8876();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                C0419.m8245(C0136.m2634(C0029.m572(this)), C0286.m5516(m6603(), 2646, C0310.f458 ^ (-154), 3188), num);
                                                                zM14 = C0000.m14(C0037.m721(this));
                                                                i11 = 1507627;
                                                                while (true) {
                                                                    i11 ^= 1507644;
                                                                    switch (i11) {
                                                                        case 23:
                                                                            if (!zM14) {
                                                                            }
                                                                            break;
                                                                        case 85:
                                                                            break;
                                                                        case 118:
                                                                            break;
                                                                        case 180:
                                                                            j11 = (64 ^ j11) | (64 & j11);
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                            this.f10429g = C0009.m192(z10);
                                                            int i33 = 55680;
                                                            while (true) {
                                                                i33 ^= 55697;
                                                                switch (i33) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i33 = 56362;
                                                                        continue;
                                                                    case 1467:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                                C0419.m8245(C0136.m2634(C0029.m572(this)), C0286.m5516(m6603(), 2646, C0310.f458 ^ (-154), 3188), num);
                                                                zM14 = C0000.m14(C0037.m721(this));
                                                                i11 = 1507627;
                                                                while (true) {
                                                                    i11 ^= 1507644;
                                                                    switch (i11) {
                                                                        case 23:
                                                                            if (!zM14) {
                                                                            }
                                                                            break;
                                                                        case 85:
                                                                            break;
                                                                        case 118:
                                                                            break;
                                                                        case 180:
                                                                            j11 = (64 ^ j11) | (64 & j11);
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        } catch (InterruptedException e13) {
                                                            e = e13;
                                                            int i34 = 56579;
                                                            while (true) {
                                                                i34 ^= 56596;
                                                                switch (i34) {
                                                                    case 23:
                                                                        i34 = 56610;
                                                                        continue;
                                                                    case 54:
                                                                        num = null;
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                        } catch (CancellationException e14) {
                                                            e = e14;
                                                            num = null;
                                                        } catch (ExecutionException e15) {
                                                            e = e15;
                                                            int i35 = 1507503;
                                                            while (true) {
                                                                i35 ^= 1507520;
                                                                switch (i35) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        num = null;
                                                                        break;
                                                                    case 111:
                                                                        i35 = 1507534;
                                                                        continue;
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                        } catch (TimeoutException e16) {
                                                            e = e16;
                                                            int i36 = 56455;
                                                            while (true) {
                                                                i36 ^= 56472;
                                                                switch (i36) {
                                                                    case 31:
                                                                        i36 = 56486;
                                                                        continue;
                                                                    case 62:
                                                                        num = null;
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case 116:
                                                        int i37 = 52735;
                                                        while (true) {
                                                            i37 ^= 52752;
                                                            switch (i37) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 1007:
                                                                    i37 = 52766;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                            }
                                                            j11 = (64 ^ j11) | (64 & j11);
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
                            default:
                                break;
                        }
                    }
                    int i38 = 1507751;
                    while (true) {
                        i38 ^= 1507768;
                        switch (i38) {
                            case 31:
                                if (j11 == j12) {
                                    i38 = 1508495;
                                }
                                break;
                            case 1335:
                                return (-493) ^ ((long) C0407.f678);
                            case 1480:
                                return j11;
                            case 1513:
                                break;
                            default:
                                continue;
                        }
                        i38 = 1508464;
                    }
                    break;
                default:
                    continue;
            }
            i13 = 1678;
        }
    }

    public final int q(String str) {
        String strM9129 = C0468.m9129(m6603(), 2683, C0394.f665 ^ 74, 616);
        boolean zM9344 = C0479.m9344(this, strM9129, str);
        int i10 = C0211.f235 ^ 552;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM9344) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    return i10;
                case 239:
                    boolean zM4973 = C0260.m4973(this, strM9129, C0448.m8742(), C0197.m3787(), str);
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM4973) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                boolean zM7850 = C0400.m7850(this, strM9129, C0129.f155 ^ 728, str);
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (!zM7850) {
                                                i13 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            return 0;
                                        case 47417:
                                            return i10;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i13 = 48705;
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return C0036.f56 ^ 39;
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

    /* JADX WARN: Code duplicated, block: B:306:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x01bb A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x0095. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x00e3. Please report as an issue. */
    public final int r(String str, String str2, Object obj, Bundle bundle, List list, boolean z10, boolean z11) {
        int i10;
        int iM1119;
        Object objM7355;
        int iM4637;
        int i11;
        int i12;
        int i13;
        boolean z12;
        int i14;
        ArrayList arrayList;
        int iM4638;
        int i15;
        int i16;
        Parcelable[] parcelableArr;
        int length;
        int i17;
        int i18;
        C0223.m4302(this);
        boolean zM8786 = C0450.m8786(obj);
        Object objM3121 = C0163.m3121(this);
        String strM2874 = C0150.m2874(m6603(), 2688, C0184.f208 ^ (-729), 2324);
        int i19 = 1616;
        while (true) {
            i19 ^= 1633;
            switch (i19) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i19 = zM8786 ? 1709 : 1678;
                    break;
                case 204:
                    int i20 = 1740;
                    while (true) {
                        i20 ^= 1757;
                        switch (i20) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i20 = z11 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                return C0371.f642 ^ (-945);
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean zM8869 = C0454.m8869(str2, C0115.m2217());
                                int i21 = 1864;
                                while (true) {
                                    i21 ^= 1881;
                                    switch (i21) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i21 = !zM8869 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            s6 s6VarM2789 = C0146.m2789((f5) objM3121);
                                            C0040.m791(s6VarM2789);
                                            C0458.m8937(s6VarM2789);
                                            boolean zM3356 = C0176.m3356(s6VarM2789);
                                            int i22 = 48767;
                                            while (true) {
                                                i22 ^= 48784;
                                                switch (i22) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        int iM9136 = C0469.m9136(C0354.m6951(s6VarM2789));
                                                        int i23 = 49666;
                                                        while (true) {
                                                            i23 ^= 49683;
                                                            switch (i23) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i23 = iM9136 >= 200900 ? 49759 : 49728;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    break;
                                                                case 83:
                                                                    return C0035.f55 ^ (-731);
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 76:
                                                        int i24 = 48891;
                                                        while (true) {
                                                            i24 ^= 48908;
                                                            switch (i24) {
                                                                case 22:
                                                                    break;
                                                                case 503:
                                                                    i24 = 48922;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i22 = !zM3356 ? 48860 : 48829;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            boolean z13 = obj instanceof Parcelable[];
                                            int i25 = 49790;
                                            while (true) {
                                                i25 ^= 49807;
                                                switch (i25) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        boolean z14 = obj instanceof ArrayList;
                                                        int i26 = 50689;
                                                        while (true) {
                                                            i26 ^= 50706;
                                                            switch (i26) {
                                                                case 19:
                                                                    i26 = z14 ? 50782 : 50751;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    i10 = 0;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    iM4637 = C0241.m4637((ArrayList) obj);
                                                                    i11 = C0352.f623 ^ (-699);
                                                                    i12 = 50813;
                                                                    while (true) {
                                                                        i12 ^= 50830;
                                                                        switch (i12) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 53:
                                                                                i10 = 0;
                                                                                break;
                                                                            case 243:
                                                                                i12 = iM4637 > i11 ? 51557 : 50875;
                                                                                break;
                                                                            case 4075:
                                                                                C0237.m4564(C0471.m9169(C0029.m572(this)), C0090.m1922(m6603(), 2693, C0014.f34 ^ SQLitePersistence.MAX_ARGS, 1236), strM2874, str2, C0057.m1083(iM4637));
                                                                                i13 = 51588;
                                                                                while (true) {
                                                                                    i13 ^= 51605;
                                                                                    switch (i13) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i13 = z13 ? 51681 : 51650;
                                                                                            break;
                                                                                        case 54:
                                                                                            break;
                                                                                        case 87:
                                                                                            z12 = obj instanceof ArrayList;
                                                                                            i14 = 52611;
                                                                                            while (true) {
                                                                                                i14 ^= 52628;
                                                                                                switch (i14) {
                                                                                                    case 23:
                                                                                                        i14 = z12 ? 52704 : 52673;
                                                                                                        break;
                                                                                                    case 54:
                                                                                                        break;
                                                                                                    case 85:
                                                                                                        break;
                                                                                                    case 116:
                                                                                                        arrayList = (ArrayList) obj;
                                                                                                        iM4638 = C0241.m4637(arrayList);
                                                                                                        i15 = 52735;
                                                                                                        while (true) {
                                                                                                            i15 ^= 52752;
                                                                                                            switch (i15) {
                                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                                    break;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                                    break;
                                                                                                                case 1007:
                                                                                                                    i15 = iM4638 > i11 ? 53479 : 52797;
                                                                                                                    break;
                                                                                                                case 7927:
                                                                                                                    C0382.m7504(bundle, str2, new ArrayList(C0343.m6729(arrayList, 0, i11)));
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
                                                                                            parcelableArr = (Parcelable[]) obj;
                                                                                            length = parcelableArr.length;
                                                                                            i17 = 51712;
                                                                                            while (true) {
                                                                                                i17 ^= 51729;
                                                                                                switch (i17) {
                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                        break;
                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        i17 = length > i11 ? 51805 : 51774;
                                                                                                        break;
                                                                                                    case 47:
                                                                                                        break;
                                                                                                    case 76:
                                                                                                        C0060.m1147(bundle, str2, (Parcelable[]) C0432.m8465(parcelableArr, i11));
                                                                                                        i18 = 51836;
                                                                                                        while (true) {
                                                                                                            i18 ^= 51853;
                                                                                                            switch (i18) {
                                                                                                                case 241:
                                                                                                                    i18 = 52518;
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
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                i16 = 53510;
                                                                                while (true) {
                                                                                    i16 ^= 53527;
                                                                                    switch (i16) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i16 = 53541;
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            i10 = 17;
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
                                                        iM4637 = ((Parcelable[]) obj).length;
                                                        int i27 = 49914;
                                                        while (true) {
                                                            i27 ^= 49931;
                                                            switch (i27) {
                                                                case 497:
                                                                    i27 = 50596;
                                                                    continue;
                                                                case 1711:
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i11 = C0352.f623 ^ (-699);
                                                            i12 = 50813;
                                                            while (true) {
                                                                i12 ^= 50830;
                                                                switch (i12) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 53:
                                                                        i10 = 0;
                                                                        break;
                                                                    case 243:
                                                                        if (iM4637 > i11) {
                                                                        }
                                                                        break;
                                                                    case 4075:
                                                                        C0237.m4564(C0471.m9169(C0029.m572(this)), C0090.m1922(m6603(), 2693, C0014.f34 ^ SQLitePersistence.MAX_ARGS, 1236), strM2874, str2, C0057.m1083(iM4637));
                                                                        i13 = 51588;
                                                                        while (true) {
                                                                            i13 ^= 51605;
                                                                            switch (i13) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    if (z13) {
                                                                                    }
                                                                                    break;
                                                                                case 54:
                                                                                    break;
                                                                                case 87:
                                                                                    z12 = obj instanceof ArrayList;
                                                                                    i14 = 52611;
                                                                                    while (true) {
                                                                                        i14 ^= 52628;
                                                                                        switch (i14) {
                                                                                            case 23:
                                                                                                if (z12) {
                                                                                                }
                                                                                                break;
                                                                                            case 54:
                                                                                                break;
                                                                                            case 85:
                                                                                                break;
                                                                                            case 116:
                                                                                                arrayList = (ArrayList) obj;
                                                                                                iM4638 = C0241.m4637(arrayList);
                                                                                                i15 = 52735;
                                                                                                while (true) {
                                                                                                    i15 ^= 52752;
                                                                                                    switch (i15) {
                                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                                            break;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                            break;
                                                                                                        case 1007:
                                                                                                            if (iM4638 > i11) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 7927:
                                                                                                            C0382.m7504(bundle, str2, new ArrayList(C0343.m6729(arrayList, 0, i11)));
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
                                                                                    parcelableArr = (Parcelable[]) obj;
                                                                                    length = parcelableArr.length;
                                                                                    i17 = 51712;
                                                                                    while (true) {
                                                                                        i17 ^= 51729;
                                                                                        switch (i17) {
                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                break;
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                if (length > i11) {
                                                                                                }
                                                                                                break;
                                                                                            case 47:
                                                                                                break;
                                                                                            case 76:
                                                                                                C0060.m1147(bundle, str2, (Parcelable[]) C0432.m8465(parcelableArr, i11));
                                                                                                i18 = 51836;
                                                                                                while (true) {
                                                                                                    i18 ^= 51853;
                                                                                                    switch (i18) {
                                                                                                        case 241:
                                                                                                            i18 = 52518;
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
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        i16 = 53510;
                                                                        while (true) {
                                                                            i16 ^= 53527;
                                                                            switch (i16) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i16 = 53541;
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    i10 = 17;
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
                                                    case 241:
                                                        i25 = z13 ? 49883 : 49852;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47417:
                                            return C0204.f228 ^ 781;
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
                    i10 = 0;
                    break;
                default:
                    break;
            }
        }
        boolean zM9580 = C0492.m9580(str);
        int i28 = 53634;
        while (true) {
            i28 ^= 53651;
            switch (i28) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i28 = !zM9580 ? 53727 : 53696;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    boolean zM9581 = C0492.m9580(str2);
                    int i29 = 53758;
                    while (true) {
                        i29 ^= 53775;
                        switch (i29) {
                            case 1009:
                                i29 = zM9581 ? 54502 : 54471;
                                break;
                            case 1703:
                                break;
                            case 1736:
                                iM1119 = C0410.m8054(C0091.m1951(this), C0264.m5048(C0306.m5917((f5) objM3121)));
                                int i30 = 54657;
                                while (true) {
                                    i30 ^= 54674;
                                    switch (i30) {
                                        case 19:
                                            i30 = 54688;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 1769:
                                int i31 = 54533;
                                while (true) {
                                    i31 ^= 54550;
                                    switch (i31) {
                                        case 19:
                                            i31 = 54564;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        default:
                                            continue;
                                    }
                                    iM1119 = C0059.m1119(C0410.m8054(C0091.m1951(this), C0264.m5048(C0306.m5917((f5) objM3121))), C0208.f232 ^ 98);
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 83:
                    iM1119 = C0059.m1119(C0410.m8054(C0091.m1951(this), C0264.m5048(C0306.m5917((f5) objM3121))), C0208.f232 ^ 98);
                    break;
                default:
                    break;
            }
        }
        boolean zM5900 = C0305.m5900(this, strM2874, str2, iM1119, obj);
        int i32 = 55432;
        while (true) {
            i32 ^= 55449;
            switch (i32) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (zM5900) {
                        i32 = 55525;
                    }
                    break;
                case 62:
                    break;
                case 95:
                    int i33 = 55556;
                    while (true) {
                        i33 ^= 55573;
                        switch (i33) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i33 = z11 ? 55649 : 55618;
                                break;
                            case 54:
                                break;
                            case 87:
                                break;
                            case 116:
                                boolean z15 = obj instanceof Bundle;
                                int i34 = 55680;
                                while (true) {
                                    i34 ^= 55697;
                                    switch (i34) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i34 = z15 ? 56424 : 56393;
                                            break;
                                        case 1467:
                                            break;
                                        case 1496:
                                            boolean z16 = obj instanceof Parcelable[];
                                            int i35 = 56579;
                                            while (true) {
                                                i35 ^= 56596;
                                                switch (i35) {
                                                    case 23:
                                                        i35 = z16 ? 1507472 : 56641;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        boolean z17 = obj instanceof ArrayList;
                                                        int i36 = 1508650;
                                                        while (true) {
                                                            i36 ^= 1508667;
                                                            switch (i36) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i36 = z17 ? 1509394 : 1508712;
                                                                    break;
                                                                case 83:
                                                                    break;
                                                                case 114:
                                                                    break;
                                                                case 3369:
                                                                    ArrayList arrayList2 = (ArrayList) obj;
                                                                    int iM4639 = C0241.m4637(arrayList2);
                                                                    int i37 = 0;
                                                                    while (true) {
                                                                        int i38 = 1509425;
                                                                        while (true) {
                                                                            i38 ^= 1509442;
                                                                            switch (i38) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    return i10;
                                                                                case 115:
                                                                                    i38 = i37 < iM4639 ? 1509518 : 1509487;
                                                                                    break;
                                                                                case 204:
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        Object objM4486 = C0233.m4486(arrayList2, i37);
                                                                        int i39 = C0056.f76;
                                                                        boolean z18 = objM4486 instanceof Bundle;
                                                                        int i40 = 1509549;
                                                                        while (true) {
                                                                            i40 ^= 1509566;
                                                                            switch (i40) {
                                                                                case 19:
                                                                                    i40 = !z18 ? 1509642 : 1509611;
                                                                                    break;
                                                                                case 85:
                                                                                    break;
                                                                                case 114:
                                                                                    break;
                                                                                case 436:
                                                                                    d4 d4VarM572 = C0029.m572(this);
                                                                                    int i41 = 1509673;
                                                                                    while (true) {
                                                                                        i41 ^= 1509690;
                                                                                        switch (i41) {
                                                                                            case 19:
                                                                                                i41 = objM4486 != null ? 1510417 : 1510386;
                                                                                                break;
                                                                                            case 712:
                                                                                                objM7355 = C0375.m7355(m6603(), 2829, C0334.f518 ^ (-727), 2991);
                                                                                                break;
                                                                                            case 745:
                                                                                                break;
                                                                                            case 1323:
                                                                                                objM7355 = C0014.m280(objM4486);
                                                                                                int i42 = 1510448;
                                                                                                while (true) {
                                                                                                    i42 ^= 1510465;
                                                                                                    switch (i42) {
                                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                                            break;
                                                                                                        case 113:
                                                                                                            i42 = 1510479;
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
                                                                                    C0112.m2169(C0471.m9169(d4VarM572), C0462.m8998(m6603(), 2833, C0212.f236 ^ 215, 1155), objM7355, str2);
                                                                                    int i43 = 1510572;
                                                                                    while (true) {
                                                                                        i43 ^= 1510589;
                                                                                        switch (i43) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i43 = 1510603;
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
                                                                        C0031.m606(this, str, str2, (Bundle) objM4486, list, z10);
                                                                        int i44 = (i39 ^ (-845)) + i37;
                                                                        int i45 = 1511347;
                                                                        while (true) {
                                                                            i45 ^= 1511364;
                                                                            switch (i45) {
                                                                                case 22:
                                                                                    break;
                                                                                case 119:
                                                                                    i45 = 1511378;
                                                                                    break;
                                                                            }
                                                                        }
                                                                        i37 = i44;
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 1564036:
                                                        Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                                                        int length2 = parcelableArr2.length;
                                                        int i46 = 0;
                                                        while (true) {
                                                            int i47 = i46;
                                                            int i48 = 1507503;
                                                            while (true) {
                                                                i48 ^= 1507520;
                                                                switch (i48) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        return i10;
                                                                    case 111:
                                                                        i48 = i47 < length2 ? 1507596 : 1507565;
                                                                        break;
                                                                    case 460:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            Parcelable parcelable = parcelableArr2[i47];
                                                            boolean z19 = parcelable instanceof Bundle;
                                                            int i49 = 1507627;
                                                            while (true) {
                                                                i49 ^= 1507644;
                                                                switch (i49) {
                                                                    case 23:
                                                                        i49 = !z19 ? 1507720 : 1507689;
                                                                        break;
                                                                    case 85:
                                                                        break;
                                                                    case 118:
                                                                        break;
                                                                    case 180:
                                                                        C0112.m2169(C0471.m9169(C0029.m572(this)), C0295.m5683(m6603(), 2763, C0054.f74 ^ 268, 1752), C0014.m280(parcelable), str2);
                                                                        int i50 = 1507751;
                                                                        while (true) {
                                                                            i50 ^= 1507768;
                                                                            switch (i50) {
                                                                                case 31:
                                                                                    i50 = 1508433;
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
                                                            C0031.m606(this, str, str2, (Bundle) parcelable, list, z10);
                                                            i46 = (C0186.f210 ^ (-331)) + i47;
                                                            int i51 = 1508526;
                                                            while (true) {
                                                                i51 ^= 1508543;
                                                                switch (i51) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i51 = 1508557;
                                                                        break;
                                                                    case 114:
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
                                        case 1529:
                                            C0031.m606(this, str, str2, (Bundle) obj, list, z10);
                                            int i52 = 56455;
                                            while (true) {
                                                i52 ^= 56472;
                                                switch (i52) {
                                                    case 31:
                                                        i52 = 56486;
                                                        break;
                                                    case 62:
                                                        return i10;
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
                    return C0004.f1062 ^ (-220);
                case 124:
                    return i10;
                default:
                    continue;
            }
            i32 = 55494;
        }
    }

    public final boolean r0(String str) {
        boolean zM1883 = C0088.m1883(str);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM1883) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return false;
                case 239:
                    List listM867 = C0045.m867(C0421.m8279(C0276.m5311(this)), new Intent(C0410.m8046(m6603(), 2896, C0162.f186 ^ 862, 2822), C0142.m2730(str)), 0);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (listM867 != null) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return false;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean zM7153 = C0364.m7153(listM867);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (!zM7153) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            return false;
                                        case 47417:
                                            return true;
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

    public final long t0() {
        long jM6521;
        long jM4426;
        long j10;
        long jM7114 = C0363.m7114(C0001.m29(this));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (jM7114 == 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    synchronized (C0001.m29(this)) {
                        long jM194 = C0010.m194();
                        C0014.m280((e6.c) C0166.m3176(this));
                        long jM7869 = C0401.m7869();
                        jM4426 = C0230.m4426(new Random((jM194 & (jM7869 ^ (-1))) | ((jM194 ^ (-1)) & jM7869)));
                        int iM7718 = C0393.m7718(this) + (C0254.f334 ^ (-971));
                        this.f10427e = iM7718;
                        j10 = iM7718;
                    }
                    return j10 - (0 - jM4426);
                case 239:
                    synchronized (C0001.m29(this)) {
                        C0177.m3377(C0001.m29(this), (-840) ^ ((long) C0329.f477), 113 ^ ((long) C0243.f323));
                        jM6521 = C0336.m6521(C0001.m29(this));
                        break;
                    }
                    return jM6521;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:412:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x024c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x024c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x029c A[DONT_GENERATE, SYNTHETIC] */
    public final Bundle u(Uri uri, boolean z10, boolean z11) {
        String str;
        String strM180;
        String strM181;
        String strM182;
        String strM183;
        String strM184;
        String strM185;
        String strM186;
        String strM187;
        boolean zM1883;
        int i10;
        boolean zM1884;
        int i11;
        boolean zM1885;
        int i12;
        int i13;
        boolean zM1886;
        int i14;
        int i15;
        int i16 = 1616;
        while (true) {
            i16 ^= 1633;
            switch (i16) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (uri == null) {
                        i16 = 1709;
                    }
                    break;
                case 204:
                    return null;
                case 239:
                    try {
                        boolean zM5941 = C0307.m5941(uri);
                        String strM957 = C0049.m957(m6603(), 2922, C0157.f181 ^ (-325), 545);
                        String strM45 = C0002.m45(m6603(), 2929, C0131.f157 ^ (-880), 1259);
                        String strM102 = C0005.m102(m6603(), 2936, C0319.f467 ^ 201, 3149);
                        String strM2692 = C0139.m2692(m6603(), 2941, C0110.f136 ^ 477, 700);
                        String strM4477 = C0232.m4477(m6603(), 2947, C0233.f313 ^ 315, 1371);
                        int i17 = 1740;
                        while (true) {
                            i17 ^= 1757;
                            switch (i17) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i17 = zM5941 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    str = null;
                                    strM180 = null;
                                    strM181 = null;
                                    strM182 = null;
                                    strM183 = null;
                                    strM184 = null;
                                    strM185 = null;
                                    strM186 = null;
                                    strM187 = null;
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    String strM188 = C0009.m180(uri, C0064.m1234(m6603(), 2952, C0386.f657 ^ (-659), 2621));
                                    strM180 = C0009.m180(uri, C0379.m7435(m6603(), 2964, C0017.f37 ^ (-443), 591));
                                    strM186 = C0009.m180(uri, C0185.m3539(m6603(), 2974, C0246.f326 ^ (-648), 2515));
                                    strM185 = C0009.m180(uri, strM4477);
                                    int i18 = 1864;
                                    while (true) {
                                        i18 ^= 1881;
                                        switch (i18) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i18 = z11 ? 48736 : 48705;
                                                break;
                                            case 47384:
                                                strM184 = null;
                                                break;
                                            case 47417:
                                                strM184 = C0009.m180(uri, strM2692);
                                                int i19 = 48767;
                                                while (true) {
                                                    i19 ^= 48784;
                                                    switch (i19) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case 239:
                                                            i19 = 48798;
                                                            continue;
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
                                    strM183 = C0009.m180(uri, C0391.m7660(m6603(), 2984, C0038.f58 ^ (-223), 1157));
                                    strM182 = C0009.m180(uri, strM102);
                                    strM181 = C0009.m180(uri, strM45);
                                    int i20 = 49666;
                                    while (true) {
                                        i20 ^= 49683;
                                        switch (i20) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i20 = z10 ? 49759 : 49728;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                strM187 = C0009.m180(uri, strM957);
                                                int i21 = 49790;
                                                while (true) {
                                                    i21 ^= 49807;
                                                    switch (i21) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            str = strM188;
                                                            break;
                                                        case 241:
                                                            i21 = 49821;
                                                            continue;
                                                        default:
                                                            continue;
                                                    }
                                                }
                                                break;
                                            case 83:
                                                strM187 = null;
                                                int i22 = 49914;
                                                while (true) {
                                                    i22 ^= 49931;
                                                    switch (i22) {
                                                        case 497:
                                                            i22 = 50596;
                                                            continue;
                                                        case 1711:
                                                            str = strM188;
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
                        boolean zM1887 = C0088.m1883(str);
                        int i23 = 50689;
                        while (true) {
                            i23 ^= 50706;
                            switch (i23) {
                                case 19:
                                    i23 = zM1887 ? 50782 : 50751;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 76:
                                    boolean zM1888 = C0088.m1883(strM180);
                                    int i24 = 50813;
                                    while (true) {
                                        i24 ^= 50830;
                                        switch (i24) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 53:
                                                break;
                                            case 243:
                                                i24 = zM1888 ? 51557 : 50875;
                                                break;
                                            case 4075:
                                                boolean zM1889 = C0088.m1883(strM186);
                                                int i25 = 51588;
                                                while (true) {
                                                    i25 ^= 51605;
                                                    switch (i25) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i25 = zM1889 ? 51681 : 51650;
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 87:
                                                            break;
                                                        case 116:
                                                            boolean zM18810 = C0088.m1883(strM185);
                                                            int i26 = 51712;
                                                            while (true) {
                                                                i26 ^= 51729;
                                                                switch (i26) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i26 = zM18810 ? 51805 : 51774;
                                                                        break;
                                                                    case 47:
                                                                        break;
                                                                    case 76:
                                                                        int i27 = 51836;
                                                                        while (true) {
                                                                            i27 ^= 51853;
                                                                            switch (i27) {
                                                                                case 241:
                                                                                    i27 = z11 ? 52580 : 52549;
                                                                                    break;
                                                                                case 1963:
                                                                                    break;
                                                                                case 1992:
                                                                                    zM1883 = C0088.m1883(strM183);
                                                                                    i10 = 52735;
                                                                                    while (true) {
                                                                                        i10 ^= 52752;
                                                                                        switch (i10) {
                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                break;
                                                                                            case 1007:
                                                                                                i10 = zM1883 ? 53479 : 52797;
                                                                                                break;
                                                                                            case 7927:
                                                                                                zM1884 = C0088.m1883(strM182);
                                                                                                i11 = 53510;
                                                                                                while (true) {
                                                                                                    i11 ^= 53527;
                                                                                                    switch (i11) {
                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i11 = zM1884 ? 53603 : 53572;
                                                                                                            break;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                            break;
                                                                                                        case 83:
                                                                                                            break;
                                                                                                        case 116:
                                                                                                            zM1885 = C0088.m1883(strM181);
                                                                                                            i12 = 53634;
                                                                                                            while (true) {
                                                                                                                i12 ^= 53651;
                                                                                                                switch (i12) {
                                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                        i12 = zM1885 ? 53727 : 53696;
                                                                                                                        break;
                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                        break;
                                                                                                                    case 76:
                                                                                                                        i13 = 53758;
                                                                                                                        while (true) {
                                                                                                                            i13 ^= 53775;
                                                                                                                            switch (i13) {
                                                                                                                                case 1009:
                                                                                                                                    i13 = z10 ? 54502 : 54471;
                                                                                                                                    break;
                                                                                                                                case 1703:
                                                                                                                                    break;
                                                                                                                                case 1736:
                                                                                                                                    return null;
                                                                                                                                case 1769:
                                                                                                                                    zM1886 = C0088.m1883(strM187);
                                                                                                                                    i14 = 54533;
                                                                                                                                    while (true) {
                                                                                                                                        i14 ^= 54550;
                                                                                                                                        switch (i14) {
                                                                                                                                            case 19:
                                                                                                                                                i14 = !zM1886 ? 54626 : 54595;
                                                                                                                                                break;
                                                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                                break;
                                                                                                                                            case 85:
                                                                                                                                                return null;
                                                                                                                                            case 116:
                                                                                                                                                i15 = 54657;
                                                                                                                                                while (true) {
                                                                                                                                                    i15 ^= 54674;
                                                                                                                                                    switch (i15) {
                                                                                                                                                        case 19:
                                                                                                                                                            i15 = 54688;
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
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 2025:
                                                                                    boolean zM18811 = C0088.m1883(strM184);
                                                                                    int i28 = 52611;
                                                                                    while (true) {
                                                                                        i28 ^= 52628;
                                                                                        switch (i28) {
                                                                                            case 23:
                                                                                                i28 = zM18811 ? 52704 : 52673;
                                                                                                break;
                                                                                            case 54:
                                                                                                break;
                                                                                            case 85:
                                                                                                break;
                                                                                            case 116:
                                                                                                zM1883 = C0088.m1883(strM183);
                                                                                                i10 = 52735;
                                                                                                while (true) {
                                                                                                    i10 ^= 52752;
                                                                                                    switch (i10) {
                                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                                            break;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                            break;
                                                                                                        case 1007:
                                                                                                            if (zM1883) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 7927:
                                                                                                            zM1884 = C0088.m1883(strM182);
                                                                                                            i11 = 53510;
                                                                                                            while (true) {
                                                                                                                i11 ^= 53527;
                                                                                                                switch (i11) {
                                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                        if (zM1884) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                        break;
                                                                                                                    case 83:
                                                                                                                        break;
                                                                                                                    case 116:
                                                                                                                        zM1885 = C0088.m1883(strM181);
                                                                                                                        i12 = 53634;
                                                                                                                        while (true) {
                                                                                                                            i12 ^= 53651;
                                                                                                                            switch (i12) {
                                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                    if (zM1885) {
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                    break;
                                                                                                                                case 76:
                                                                                                                                    i13 = 53758;
                                                                                                                                    while (true) {
                                                                                                                                        i13 ^= 53775;
                                                                                                                                        switch (i13) {
                                                                                                                                            case 1009:
                                                                                                                                                if (z10) {
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            case 1703:
                                                                                                                                                break;
                                                                                                                                            case 1736:
                                                                                                                                                return null;
                                                                                                                                            case 1769:
                                                                                                                                                zM1886 = C0088.m1883(strM187);
                                                                                                                                                i14 = 54533;
                                                                                                                                                while (true) {
                                                                                                                                                    i14 ^= 54550;
                                                                                                                                                    switch (i14) {
                                                                                                                                                        case 19:
                                                                                                                                                            if (!zM1886) {
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                                            break;
                                                                                                                                                        case 85:
                                                                                                                                                            return null;
                                                                                                                                                        case 116:
                                                                                                                                                            i15 = 54657;
                                                                                                                                                            while (true) {
                                                                                                                                                                i15 ^= 54674;
                                                                                                                                                                switch (i15) {
                                                                                                                                                                    case 19:
                                                                                                                                                                        i15 = 54688;
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
                                default:
                                    break;
                            }
                        }
                        Bundle bundle = new Bundle();
                        boolean zM18812 = C0088.m1883(str);
                        int i29 = 55432;
                        while (true) {
                            i29 ^= 55449;
                            switch (i29) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i29 = !zM18812 ? 55525 : 55494;
                                    break;
                                case 62:
                                    break;
                                case 95:
                                    break;
                                case 124:
                                    C0235.m4526(bundle, C0462.m8998(m6603(), 2990, C0351.f622 ^ 542, 721), str);
                                    int i30 = 55556;
                                    while (true) {
                                        i30 ^= 55573;
                                        switch (i30) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i30 = 55587;
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
                        boolean zM18813 = C0088.m1883(strM180);
                        int i31 = 55680;
                        while (true) {
                            i31 ^= 55697;
                            switch (i31) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i31 = !zM18813 ? 56424 : 56393;
                                    break;
                                case 1467:
                                    break;
                                case 1496:
                                    break;
                                case 1529:
                                    C0235.m4526(bundle, C0157.m2993(m6603(), 2998, C0404.f675 ^ 800, 627), strM180);
                                    break;
                                default:
                                    break;
                            }
                        }
                        boolean zM18814 = C0088.m1883(strM186);
                        int i32 = 56455;
                        while (true) {
                            i32 ^= 56472;
                            switch (i32) {
                                case 31:
                                    i32 = !zM18814 ? 56548 : 56517;
                                    break;
                                case 62:
                                    break;
                                case 93:
                                    break;
                                case 124:
                                    C0235.m4526(bundle, C0227.m4381(m6603(), 3004, C0263.f343 ^ 542, 333), strM186);
                                    break;
                                default:
                                    break;
                            }
                        }
                        boolean zM18815 = C0088.m1883(strM185);
                        int i33 = 56579;
                        while (true) {
                            i33 ^= 56596;
                            switch (i33) {
                                case 23:
                                    i33 = !zM18815 ? 1507472 : 56641;
                                    break;
                                case 54:
                                    break;
                                case 85:
                                    break;
                                case 1564036:
                                    C0235.m4526(bundle, strM4477, strM185);
                                    break;
                                default:
                                    break;
                            }
                        }
                        int i34 = 1507503;
                        while (true) {
                            i34 ^= 1507520;
                            switch (i34) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    break;
                                case 111:
                                    i34 = z11 ? 1507596 : 1507565;
                                    break;
                                case 460:
                                    boolean zM18816 = C0088.m1883(strM184);
                                    int i35 = 1507627;
                                    while (true) {
                                        i35 ^= 1507644;
                                        switch (i35) {
                                            case 23:
                                                i35 = !zM18816 ? 1507720 : 1507689;
                                                break;
                                            case 85:
                                                break;
                                            case 118:
                                                break;
                                            case 180:
                                                C0235.m4526(bundle, strM2692, strM184);
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
                        String strM189 = C0009.m180(uri, C0168.m3223(m6603(), 3010, C0267.f347 ^ (-323), 2892));
                        boolean zM18817 = C0088.m1883(strM189);
                        int i36 = 1507751;
                        while (true) {
                            i36 ^= 1507768;
                            switch (i36) {
                                case 31:
                                    i36 = !zM18817 ? 1508495 : 1508464;
                                    break;
                                case 1335:
                                    C0235.m4526(bundle, C0406.m7983(m6603(), 3018, C0203.f227 ^ (-31), 1438), strM189);
                                    break;
                                case 1480:
                                    break;
                                case 1513:
                                    break;
                                default:
                                    break;
                            }
                        }
                        String strM1810 = C0009.m180(uri, C0046.m889(m6603(), 3022, C0386.f657 ^ (-662), 2663));
                        boolean zM18818 = C0088.m1883(strM1810);
                        int i37 = 1508526;
                        while (true) {
                            i37 ^= 1508543;
                            switch (i37) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i37 = !zM18818 ? 1508619 : 1508588;
                                    break;
                                case 83:
                                    break;
                                case 114:
                                    break;
                                case 436:
                                    C0235.m4526(bundle, C0070.m1360(m6603(), 3033, C0346.f617 ^ (-768), 994), strM1810);
                                    break;
                                default:
                                    break;
                            }
                        }
                        String strM5607 = C0291.m5607(m6603(), 3040, C0052.f72 ^ 932, 3262);
                        String strM1811 = C0009.m180(uri, strM5607);
                        boolean zM18819 = C0088.m1883(strM1811);
                        int i38 = 1508650;
                        while (true) {
                            i38 ^= 1508667;
                            switch (i38) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i38 = !zM18819 ? 1509394 : 1508712;
                                    break;
                                case 83:
                                    break;
                                case 114:
                                    break;
                                case 3369:
                                    C0235.m4526(bundle, strM5607, strM1811);
                                    break;
                                default:
                                    break;
                            }
                        }
                        String strM7631 = C0389.m7631(m6603(), 3045, C0179.f203 ^ 572, 1254);
                        String strM1812 = C0009.m180(uri, strM7631);
                        boolean zM18820 = C0088.m1883(strM1812);
                        int i39 = 1509425;
                        while (true) {
                            i39 ^= 1509442;
                            switch (i39) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    break;
                                case 115:
                                    i39 = !zM18820 ? 1509518 : 1509487;
                                    break;
                                case 204:
                                    C0235.m4526(bundle, strM7631, strM1812);
                                    break;
                                default:
                                    break;
                            }
                        }
                        String strM1123 = C0059.m1123(m6603(), 3048, C0347.f618 ^ 388, 2257);
                        String strM1813 = C0009.m180(uri, strM1123);
                        boolean zM18821 = C0088.m1883(strM1813);
                        int i40 = 1509549;
                        while (true) {
                            i40 ^= 1509566;
                            switch (i40) {
                                case 19:
                                    i40 = !zM18821 ? 1509642 : 1509611;
                                    break;
                                case 85:
                                    break;
                                case 114:
                                    break;
                                case 436:
                                    C0235.m4526(bundle, strM1123, strM1813);
                                    break;
                                default:
                                    break;
                            }
                        }
                        boolean zM18822 = C0088.m1883(strM183);
                        int i41 = 1509673;
                        while (true) {
                            i41 ^= 1509690;
                            switch (i41) {
                                case 19:
                                    i41 = !zM18822 ? 1510417 : 1510386;
                                    break;
                                case 712:
                                    break;
                                case 745:
                                    break;
                                case 1323:
                                    C0235.m4526(bundle, C0017.m345(m6603(), 3052, C0136.f162 ^ (-350), 3140), strM183);
                                    break;
                                default:
                                    break;
                            }
                        }
                        boolean zM18823 = C0088.m1883(strM182);
                        int i42 = 1510448;
                        while (true) {
                            i42 ^= 1510465;
                            switch (i42) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 47:
                                    break;
                                case 113:
                                    i42 = !zM18823 ? 1510541 : 1510510;
                                    break;
                                case 204:
                                    C0235.m4526(bundle, strM102, strM182);
                                    break;
                                default:
                                    break;
                            }
                        }
                        String strM1814 = C0009.m180(uri, C0030.m576(m6603(), 3063, C0211.f235 ^ 569, 2730));
                        boolean zM18824 = C0088.m1883(strM1814);
                        int i43 = 1510572;
                        while (true) {
                            i43 ^= 1510589;
                            switch (i43) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i43 = !zM18824 ? 1511316 : 1510634;
                                    break;
                                case 87:
                                    break;
                                case 118:
                                    break;
                                case 809:
                                    C0235.m4526(bundle, C0217.m4134(m6603(), 3082, C0188.f212 ^ 102, 444), strM1814);
                                    break;
                                default:
                                    break;
                            }
                        }
                        String strM1815 = C0009.m180(uri, C0267.m5110(m6603(), 3097, C0248.f328 ^ 46, 2747));
                        boolean zM18825 = C0088.m1883(strM1815);
                        int i44 = 1511347;
                        while (true) {
                            i44 ^= 1511364;
                            switch (i44) {
                                case 22:
                                    break;
                                case 53:
                                    break;
                                case 119:
                                    i44 = !zM18825 ? 1511440 : 1511409;
                                    break;
                                case 8148:
                                    C0235.m4526(bundle, C0241.m4619(m6603(), 3116, C0330.f478 ^ 370, 1951), strM1815);
                                    break;
                                default:
                                    break;
                            }
                        }
                        String strM1816 = C0009.m180(uri, C0007.m155(m6603(), 3131, C0009.f29 ^ (-417), 2611));
                        boolean zM18826 = C0088.m1883(strM1816);
                        int i45 = 1511471;
                        while (true) {
                            i45 ^= 1511488;
                            switch (i45) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    break;
                                case 111:
                                    i45 = !zM18826 ? 1511564 : 1511533;
                                    break;
                                case 204:
                                    C0235.m4526(bundle, C0280.m5427(m6603(), 3151, C0020.f40 ^ (-651), 809), strM1816);
                                    break;
                                default:
                                    break;
                            }
                        }
                        boolean zM18827 = C0088.m1883(strM181);
                        int i46 = 1511595;
                        while (true) {
                            i46 ^= 1511612;
                            switch (i46) {
                                case 23:
                                    i46 = !zM18827 ? 1512339 : 1512308;
                                    break;
                                case 815:
                                    C0235.m4526(bundle, strM45, strM181);
                                    break;
                                case 968:
                                    break;
                                case 1001:
                                    break;
                                default:
                                    break;
                            }
                        }
                        int i47 = 1512370;
                        while (true) {
                            i47 ^= 1512387;
                            switch (i47) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case 51:
                                    break;
                                case 113:
                                    i47 = z10 ? 1512463 : 1512432;
                                    break;
                                case 1996:
                                    boolean zM18828 = C0088.m1883(strM187);
                                    int i48 = 1512494;
                                    while (true) {
                                        i48 ^= 1512511;
                                        switch (i48) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i48 = !zM18828 ? 1513238 : 1512556;
                                                break;
                                            case 83:
                                                break;
                                            case 114:
                                                break;
                                            case 809:
                                                C0235.m4526(bundle, strM957, strM187);
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
                        return bundle;
                    } catch (UnsupportedOperationException e4) {
                        int i49 = 48891;
                        while (true) {
                            i49 ^= 48908;
                            switch (i49) {
                                case 22:
                                    C0419.m8245(C0330.m6385(C0029.m572(this)), C0206.m3946(m6603(), 3167, C0277.f422 ^ (-413), 3046), e4);
                                    return null;
                                case 503:
                                    i49 = 48922;
                                    break;
                            }
                        }
                    }
                    break;
                default:
                    continue;
            }
            i16 = 1678;
        }
    }

    public final w3.d u0() {
        int iM8038;
        x3.b bVar;
        w3.d dVar = null;
        w3.d dVarM7348 = C0374.m7348(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (dVarM7348 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    Context contextM5311 = C0276.m5311(this);
                    C0375.m7360(contextM5311, C0271.m5220(m6603(), 3212, C0117.f143 ^ 952, 3269));
                    StringBuilder sb = new StringBuilder(C0254.m4870(m6603(), 3219, C0122.f148 ^ (-33), 2661));
                    int iM7181 = C0366.m7181();
                    u3.a aVarM2028 = C0103.m2028();
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM7181 >= 30 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                iM8038 = 0;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                iM8038 = C0409.m8038(aVarM2028);
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
                    C0197.m3772(sb, iM8038);
                    C0440.m8605(sb);
                    C0304.m5865(m6603(), 3242, C0393.f664 ^ 263, 2520);
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                bVar = null;
                                break;
                            case 76:
                                int iM8039 = C0409.m8038(aVarM2028);
                                int i14 = 48891;
                                while (true) {
                                    i14 ^= 48908;
                                    switch (i14) {
                                        case 22:
                                            break;
                                        case 53:
                                            bVar = null;
                                            break;
                                        case 503:
                                            i14 = iM8039 >= 5 ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            bVar = new x3.b(contextM5311);
                                            int i15 = 49666;
                                            while (true) {
                                                i15 ^= 49683;
                                                switch (i15) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i15 = 49697;
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
                            case 239:
                                i13 = iM7181 >= 30 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    int i16 = 49790;
                    while (true) {
                        i16 ^= 49807;
                        switch (i16) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 51:
                                break;
                            case 84:
                                dVar = new w3.d(bVar);
                                break;
                            case 241:
                                if (bVar != null) {
                                    i16 = 49883;
                                }
                                break;
                            default:
                                continue;
                        }
                        i16 = 49852;
                    }
                    this.f10428f = dVar;
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return C0374.m7348(this);
    }

    /* JADX WARN: Code duplicated, block: B:320:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x0124 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x033e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x035c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x034e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x03b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x03b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x03ac A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x01df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x021c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x0161 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:106:0x018d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:120:0x01bc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:132:0x01e6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:151:0x0220. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:166:0x024b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:192:0x02ac. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:219:0x0310. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x007b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:52:0x00c4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x00d4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:99:0x0178. Please report as an issue. */
    public final Bundle v(String str, Bundle bundle, List list, boolean z10) {
        int i10;
        int i11;
        String str2;
        boolean zM7180;
        int i12;
        int i13;
        int i14;
        int i15;
        String str3;
        int i16;
        String strM3953;
        int i17;
        int i18;
        boolean zM9344;
        int i19;
        boolean zM4973;
        int i20;
        boolean zM7850;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean zM1085;
        int i25;
        boolean zM4974;
        int i26;
        boolean zM7851;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean zM8869 = C0454.m8869(str, C0154.m2961());
        int i31 = 1616;
        while (true) {
            i31 ^= 1633;
            switch (i31) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (bundle != null) {
                        i31 = 1709;
                    }
                    break;
                case 204:
                    Bundle bundle2 = new Bundle(bundle);
                    boolean zM2887 = C0150.m2887(C0354.m6951(C0091.m1951(this)), 201499650 ^ C0152.f177);
                    int i32 = 1740;
                    while (true) {
                        i32 ^= 1757;
                        switch (i32) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM2887) {
                                    i32 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                int i33 = 48767;
                                while (true) {
                                    i33 ^= 48784;
                                    switch (i33) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            i10 = 25;
                                            break;
                                        case 239:
                                            i33 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                i10 = 100;
                                break;
                            default:
                                continue;
                        }
                        i32 = 1802;
                    }
                    int i34 = 1864;
                    while (true) {
                        i34 ^= 1881;
                        switch (i34) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i34 = 48674;
                                break;
                            case 47483:
                                Iterator itM9493 = C0487.m9493(new TreeSet(C0060.m1152(bundle)));
                                int i35 = 0;
                                while (true) {
                                    int i36 = i35;
                                    boolean zM3327 = C0174.m3327(itM9493);
                                    int i37 = 48891;
                                    while (true) {
                                        i37 ^= 48908;
                                        switch (i37) {
                                            case 22:
                                                break;
                                            case 53:
                                                break;
                                            case 503:
                                                i37 = zM3327 ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                break;
                                            default:
                                                break;
                                        }
                                        int i38 = 1511595;
                                        while (true) {
                                            i38 ^= 1511612;
                                            switch (i38) {
                                                case 23:
                                                    i38 = 1512277;
                                                    break;
                                                case 1001:
                                                    return bundle2;
                                            }
                                        }
                                    }
                                    String str4 = (String) C0413.m8115(itM9493);
                                    int i39 = 49666;
                                    while (true) {
                                        i39 ^= 49683;
                                        switch (i39) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i39 = list != null ? 49759 : 49728;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                boolean zM2099 = C0108.m2099(list, str4);
                                                int i40 = 49790;
                                                while (true) {
                                                    i40 ^= 49807;
                                                    switch (i40) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 51:
                                                            i11 = 0;
                                                            int i41 = 50689;
                                                            while (true) {
                                                                i41 ^= 50706;
                                                                switch (i41) {
                                                                    case 19:
                                                                        i41 = 50720;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        case 84:
                                                            int i42 = 49914;
                                                            while (true) {
                                                                i42 ^= 49931;
                                                                switch (i42) {
                                                                    case 497:
                                                                        i42 = 50596;
                                                                        break;
                                                                    case 1711:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                i16 = C0031.f51 ^ (-178);
                                                                strM3953 = C0207.m3953(m6603(), 3260, C0316.f464 ^ 164, 2023);
                                                                i17 = 50813;
                                                                while (true) {
                                                                    i17 ^= 50830;
                                                                    switch (i17) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case 53:
                                                                            i11 = 0;
                                                                            break;
                                                                        case 243:
                                                                            i17 = !z10 ? 51557 : 50875;
                                                                            break;
                                                                        case 4075:
                                                                            zM1085 = C0057.m1085(this, strM3953, str4);
                                                                            i25 = 51588;
                                                                            while (true) {
                                                                                i25 ^= 51605;
                                                                                switch (i25) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i25 = !zM1085 ? 51681 : 51650;
                                                                                        break;
                                                                                    case 54:
                                                                                        break;
                                                                                    case 87:
                                                                                        zM4974 = C0260.m4973(this, strM3953, null, null, str4);
                                                                                        i26 = 51836;
                                                                                        while (true) {
                                                                                            i26 ^= 51853;
                                                                                            switch (i26) {
                                                                                                case 241:
                                                                                                    i26 = !zM4974 ? 52580 : 52549;
                                                                                                    break;
                                                                                                case 1963:
                                                                                                    break;
                                                                                                case 1992:
                                                                                                    zM7851 = C0400.m7850(this, strM3953, i16, str4);
                                                                                                    i27 = 52735;
                                                                                                    while (true) {
                                                                                                        i27 ^= 52752;
                                                                                                        switch (i27) {
                                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                                break;
                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                                i11 = 0;
                                                                                                                break;
                                                                                                            case 1007:
                                                                                                                i27 = !zM7851 ? 53479 : 52797;
                                                                                                                break;
                                                                                                            case 7927:
                                                                                                                i28 = 53510;
                                                                                                                while (true) {
                                                                                                                    i28 ^= 53527;
                                                                                                                    switch (i28) {
                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                            i28 = 53541;
                                                                                                                            break;
                                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    i11 = 3;
                                                                                                                    i30 = 51712;
                                                                                                                    while (true) {
                                                                                                                        i30 ^= 51729;
                                                                                                                        switch (i30) {
                                                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                                                break;
                                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                i30 = 51743;
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
                                                                                                case 2025:
                                                                                                    i11 = 14;
                                                                                                    i29 = 52611;
                                                                                                    while (true) {
                                                                                                        i29 ^= 52628;
                                                                                                        switch (i29) {
                                                                                                            case 23:
                                                                                                                i29 = 52642;
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
                                                                                        break;
                                                                                    case 116:
                                                                                        i11 = 3;
                                                                                        i30 = 51712;
                                                                                        while (true) {
                                                                                            i30 ^= 51729;
                                                                                            switch (i30) {
                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                    break;
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i30 = 51743;
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
                                                                i18 = 53634;
                                                                while (true) {
                                                                    i18 ^= 53651;
                                                                    switch (i18) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i18 = i11 == 0 ? 53727 : 53696;
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 76:
                                                                            zM9344 = C0479.m9344(this, strM3953, str4);
                                                                            i19 = 53758;
                                                                            while (true) {
                                                                                i19 ^= 53775;
                                                                                switch (i19) {
                                                                                    case 1009:
                                                                                        i19 = !zM9344 ? 54502 : 54471;
                                                                                        break;
                                                                                    case 1703:
                                                                                        break;
                                                                                    case 1736:
                                                                                        zM4973 = C0260.m4973(this, strM3953, null, null, str4);
                                                                                        i20 = 54657;
                                                                                        while (true) {
                                                                                            i20 ^= 54674;
                                                                                            switch (i20) {
                                                                                                case 19:
                                                                                                    i20 = !zM4973 ? 55401 : 54719;
                                                                                                    break;
                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                    zM7850 = C0400.m7850(this, strM3953, i16, str4);
                                                                                                    i21 = 55556;
                                                                                                    while (true) {
                                                                                                        i21 ^= 55573;
                                                                                                        switch (i21) {
                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                i21 = !zM7850 ? 55649 : 55618;
                                                                                                                break;
                                                                                                            case 54:
                                                                                                                break;
                                                                                                            case 87:
                                                                                                                i11 = 0;
                                                                                                                break;
                                                                                                            case 116:
                                                                                                                i22 = 55680;
                                                                                                                while (true) {
                                                                                                                    i22 ^= 55697;
                                                                                                                    switch (i22) {
                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                            i22 = 56362;
                                                                                                                            break;
                                                                                                                        case 1467:
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    i11 = 3;
                                                                                                                    i24 = 54533;
                                                                                                                    while (true) {
                                                                                                                        i24 ^= 54550;
                                                                                                                        switch (i24) {
                                                                                                                            case 19:
                                                                                                                                i24 = 54564;
                                                                                                                                break;
                                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                        }
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
                                                                                                case 3579:
                                                                                                    i23 = 55432;
                                                                                                    while (true) {
                                                                                                        i23 ^= 55449;
                                                                                                        switch (i23) {
                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                i23 = 55463;
                                                                                                                break;
                                                                                                            case 62:
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                        i11 = 14;
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 1769:
                                                                                        i11 = 3;
                                                                                        i24 = 54533;
                                                                                        while (true) {
                                                                                            i24 ^= 54550;
                                                                                            switch (i24) {
                                                                                                case 19:
                                                                                                    i24 = 54564;
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
                                                                            break;
                                                                        case 83:
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        case 241:
                                                            i40 = !zM2099 ? 49883 : 49852;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 83:
                                                i16 = C0031.f51 ^ (-178);
                                                strM3953 = C0207.m3953(m6603(), 3260, C0316.f464 ^ 164, 2023);
                                                i17 = 50813;
                                                while (true) {
                                                    i17 ^= 50830;
                                                    switch (i17) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 53:
                                                            i11 = 0;
                                                            break;
                                                        case 243:
                                                            if (!z10) {
                                                            }
                                                            break;
                                                        case 4075:
                                                            zM1085 = C0057.m1085(this, strM3953, str4);
                                                            i25 = 51588;
                                                            while (true) {
                                                                i25 ^= 51605;
                                                                switch (i25) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (!zM1085) {
                                                                        }
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 87:
                                                                        zM4974 = C0260.m4973(this, strM3953, null, null, str4);
                                                                        i26 = 51836;
                                                                        while (true) {
                                                                            i26 ^= 51853;
                                                                            switch (i26) {
                                                                                case 241:
                                                                                    if (!zM4974) {
                                                                                    }
                                                                                    break;
                                                                                case 1963:
                                                                                    break;
                                                                                case 1992:
                                                                                    zM7851 = C0400.m7850(this, strM3953, i16, str4);
                                                                                    i27 = 52735;
                                                                                    while (true) {
                                                                                        i27 ^= 52752;
                                                                                        switch (i27) {
                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                i11 = 0;
                                                                                                break;
                                                                                            case 1007:
                                                                                                if (!zM7851) {
                                                                                                }
                                                                                                break;
                                                                                            case 7927:
                                                                                                i28 = 53510;
                                                                                                while (true) {
                                                                                                    i28 ^= 53527;
                                                                                                    switch (i28) {
                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i28 = 53541;
                                                                                                            break;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                    i11 = 3;
                                                                                                    i30 = 51712;
                                                                                                    while (true) {
                                                                                                        i30 ^= 51729;
                                                                                                        switch (i30) {
                                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                                break;
                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                i30 = 51743;
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
                                                                                case 2025:
                                                                                    i11 = 14;
                                                                                    i29 = 52611;
                                                                                    while (true) {
                                                                                        i29 ^= 52628;
                                                                                        switch (i29) {
                                                                                            case 23:
                                                                                                i29 = 52642;
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
                                                                        break;
                                                                    case 116:
                                                                        i11 = 3;
                                                                        i30 = 51712;
                                                                        while (true) {
                                                                            i30 ^= 51729;
                                                                            switch (i30) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i30 = 51743;
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
                                                i18 = 53634;
                                                while (true) {
                                                    i18 ^= 53651;
                                                    switch (i18) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (i11 == 0) {
                                                            }
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 76:
                                                            zM9344 = C0479.m9344(this, strM3953, str4);
                                                            i19 = 53758;
                                                            while (true) {
                                                                i19 ^= 53775;
                                                                switch (i19) {
                                                                    case 1009:
                                                                        if (!zM9344) {
                                                                        }
                                                                        break;
                                                                    case 1703:
                                                                        break;
                                                                    case 1736:
                                                                        zM4973 = C0260.m4973(this, strM3953, null, null, str4);
                                                                        i20 = 54657;
                                                                        while (true) {
                                                                            i20 ^= 54674;
                                                                            switch (i20) {
                                                                                case 19:
                                                                                    if (!zM4973) {
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    zM7850 = C0400.m7850(this, strM3953, i16, str4);
                                                                                    i21 = 55556;
                                                                                    while (true) {
                                                                                        i21 ^= 55573;
                                                                                        switch (i21) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                if (!zM7850) {
                                                                                                }
                                                                                                break;
                                                                                            case 54:
                                                                                                break;
                                                                                            case 87:
                                                                                                i11 = 0;
                                                                                                break;
                                                                                            case 116:
                                                                                                i22 = 55680;
                                                                                                while (true) {
                                                                                                    i22 ^= 55697;
                                                                                                    switch (i22) {
                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i22 = 56362;
                                                                                                            break;
                                                                                                        case 1467:
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                    i11 = 3;
                                                                                                    i24 = 54533;
                                                                                                    while (true) {
                                                                                                        i24 ^= 54550;
                                                                                                        switch (i24) {
                                                                                                            case 19:
                                                                                                                i24 = 54564;
                                                                                                                break;
                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
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
                                                                                case 3579:
                                                                                    i23 = 55432;
                                                                                    while (true) {
                                                                                        i23 ^= 55449;
                                                                                        switch (i23) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i23 = 55463;
                                                                                                break;
                                                                                            case 62:
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                        i11 = 14;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 1769:
                                                                        i11 = 3;
                                                                        i24 = 54533;
                                                                        while (true) {
                                                                            i24 ^= 54550;
                                                                            switch (i24) {
                                                                                case 19:
                                                                                    i24 = 54564;
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
                                        int i43 = 56455;
                                        while (true) {
                                            i43 ^= 56472;
                                            switch (i43) {
                                                case 31:
                                                    i43 = i11 != 0 ? 56548 : 56517;
                                                    break;
                                                case 62:
                                                    break;
                                                case 93:
                                                    int iM1757 = C0082.m1757(this, str, str4, C0010.m195(bundle, str4), bundle2, list, z10, zM8869);
                                                    int i44 = 1507751;
                                                    while (true) {
                                                        i44 ^= 1507768;
                                                        switch (i44) {
                                                            case 31:
                                                                i44 = iM1757 == 17 ? 1508495 : 1508464;
                                                                break;
                                                            case 1335:
                                                                C0260.m4972(bundle2, iM1757, str4, C0455.m8876());
                                                                int i45 = 1508526;
                                                                while (true) {
                                                                    i45 ^= 1508543;
                                                                    switch (i45) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i45 = 1508557;
                                                                            break;
                                                                        case 114:
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                    zM7180 = C0365.m7180(str4);
                                                                    i12 = 1510572;
                                                                    while (true) {
                                                                        i12 ^= 1510589;
                                                                        switch (i12) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i12 = zM7180 ? 1511316 : 1510634;
                                                                                break;
                                                                            case 87:
                                                                                i35 = i36;
                                                                                break;
                                                                            case 118:
                                                                                break;
                                                                            case 809:
                                                                                i13 = i36 + (C0298.f446 ^ (-140));
                                                                                i14 = 1511347;
                                                                                while (true) {
                                                                                    i14 ^= 1511364;
                                                                                    switch (i14) {
                                                                                        case 22:
                                                                                            break;
                                                                                        case 53:
                                                                                            break;
                                                                                        case 119:
                                                                                            i14 = i13 > i10 ? 1511440 : 1511409;
                                                                                            break;
                                                                                        case 8148:
                                                                                            C0112.m2169(C0069.m1345(C0029.m572(this)), C0031.m596(C0486.m9476(m6603(), 3274, C0109.f135 ^ 93, 3074), i10, C0395.m7741(m6603(), 3304, C0400.f671 ^ 125, 1233)), C0174.m3320(C0233.m4489(this), str), C0232.m4479(C0233.m4489(this), bundle));
                                                                                            C0246.m4723(C0448.f719 ^ (-826), bundle2);
                                                                                            C0055.m1069(bundle2, str4);
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                i15 = 1511471;
                                                                                while (true) {
                                                                                    i15 ^= 1511488;
                                                                                    switch (i15) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            i35 = i13;
                                                                                            break;
                                                                                        case 111:
                                                                                            i15 = 1511502;
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
                                                            case 1480:
                                                                int i46 = 1508650;
                                                                while (true) {
                                                                    i46 ^= 1508667;
                                                                    switch (i46) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i46 = iM1757 != 0 ? 1509394 : 1508712;
                                                                            break;
                                                                        case 83:
                                                                            zM7180 = C0365.m7180(str4);
                                                                            i12 = 1510572;
                                                                            while (true) {
                                                                                i12 ^= 1510589;
                                                                                switch (i12) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        if (zM7180) {
                                                                                        }
                                                                                        break;
                                                                                    case 87:
                                                                                        i35 = i36;
                                                                                        break;
                                                                                    case 118:
                                                                                        break;
                                                                                    case 809:
                                                                                        i13 = i36 + (C0298.f446 ^ (-140));
                                                                                        i14 = 1511347;
                                                                                        while (true) {
                                                                                            i14 ^= 1511364;
                                                                                            switch (i14) {
                                                                                                case 22:
                                                                                                    break;
                                                                                                case 53:
                                                                                                    break;
                                                                                                case 119:
                                                                                                    if (i13 > i10) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 8148:
                                                                                                    C0112.m2169(C0069.m1345(C0029.m572(this)), C0031.m596(C0486.m9476(m6603(), 3274, C0109.f135 ^ 93, 3074), i10, C0395.m7741(m6603(), 3304, C0400.f671 ^ 125, 1233)), C0174.m3320(C0233.m4489(this), str), C0232.m4479(C0233.m4489(this), bundle));
                                                                                                    C0246.m4723(C0448.f719 ^ (-826), bundle2);
                                                                                                    C0055.m1069(bundle2, str4);
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        i15 = 1511471;
                                                                                        while (true) {
                                                                                            i15 ^= 1511488;
                                                                                            switch (i15) {
                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                    i35 = i13;
                                                                                                    break;
                                                                                                case 111:
                                                                                                    i15 = 1511502;
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 114:
                                                                            break;
                                                                        case 3369:
                                                                            boolean zM321 = C0016.m321(C0024.m469(m6603(), 3271, C0051.f71 ^ (-431), 1882), str4);
                                                                            int i47 = 1509425;
                                                                            while (true) {
                                                                                i47 ^= 1509442;
                                                                                switch (i47) {
                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                        zM7180 = C0365.m7180(str4);
                                                                                        i12 = 1510572;
                                                                                        while (true) {
                                                                                            i12 ^= 1510589;
                                                                                            switch (i12) {
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    if (zM7180) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 87:
                                                                                                    i35 = i36;
                                                                                                    break;
                                                                                                case 118:
                                                                                                    break;
                                                                                                case 809:
                                                                                                    i13 = i36 + (C0298.f446 ^ (-140));
                                                                                                    i14 = 1511347;
                                                                                                    while (true) {
                                                                                                        i14 ^= 1511364;
                                                                                                        switch (i14) {
                                                                                                            case 22:
                                                                                                                break;
                                                                                                            case 53:
                                                                                                                break;
                                                                                                            case 119:
                                                                                                                if (i13 > i10) {
                                                                                                                }
                                                                                                                break;
                                                                                                            case 8148:
                                                                                                                C0112.m2169(C0069.m1345(C0029.m572(this)), C0031.m596(C0486.m9476(m6603(), 3274, C0109.f135 ^ 93, 3074), i10, C0395.m7741(m6603(), 3304, C0400.f671 ^ 125, 1233)), C0174.m3320(C0233.m4489(this), str), C0232.m4479(C0233.m4489(this), bundle));
                                                                                                                C0246.m4723(C0448.f719 ^ (-826), bundle2);
                                                                                                                C0055.m1069(bundle2, str4);
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    i15 = 1511471;
                                                                                                    while (true) {
                                                                                                        i15 ^= 1511488;
                                                                                                        switch (i15) {
                                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                                i35 = i13;
                                                                                                                break;
                                                                                                            case 111:
                                                                                                                i15 = 1511502;
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 115:
                                                                                        i47 = !zM321 ? 1509518 : 1509487;
                                                                                        break;
                                                                                    case 204:
                                                                                        int i48 = 1509549;
                                                                                        while (true) {
                                                                                            i48 ^= 1509566;
                                                                                            switch (i48) {
                                                                                                case 19:
                                                                                                    i48 = iM1757 == 21 ? 1509642 : 1509611;
                                                                                                    break;
                                                                                                case 85:
                                                                                                    str2 = str4;
                                                                                                    break;
                                                                                                case 114:
                                                                                                    break;
                                                                                                case 436:
                                                                                                    int i49 = 1509673;
                                                                                                    while (true) {
                                                                                                        i49 ^= 1509690;
                                                                                                        switch (i49) {
                                                                                                            case 19:
                                                                                                                i49 = 1510355;
                                                                                                                break;
                                                                                                            case 745:
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                        str2 = str;
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        C0260.m4972(bundle2, iM1757, str2, C0010.m195(bundle, str4));
                                                                                        C0055.m1069(bundle2, str4);
                                                                                        i35 = i36;
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
                                                            case 1513:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 124:
                                                    int i50 = 56579;
                                                    while (true) {
                                                        i50 ^= 56596;
                                                        switch (i50) {
                                                            case 23:
                                                                i50 = i11 == 3 ? 1507472 : 56641;
                                                                break;
                                                            case 54:
                                                                break;
                                                            case 85:
                                                                str3 = null;
                                                                break;
                                                            case 1564036:
                                                                int i51 = 1507503;
                                                                while (true) {
                                                                    i51 ^= 1507520;
                                                                    switch (i51) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case 111:
                                                                            i51 = 1507534;
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                    str3 = str4;
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0260.m4972(bundle2, i11, str4, str3);
                                                    C0055.m1069(bundle2, str4);
                                                    int i52 = 1507627;
                                                    while (true) {
                                                        i52 ^= 1507644;
                                                        switch (i52) {
                                                            case 23:
                                                                i52 = 1507658;
                                                                break;
                                                            case 118:
                                                                i35 = i36;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        int i53 = 1510448;
                                        while (true) {
                                            i53 ^= 1510465;
                                            switch (i53) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 113:
                                                    i53 = 1510479;
                                                    break;
                                            }
                                        }
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 239:
                    return null;
                default:
                    continue;
            }
            i31 = 1678;
        }
    }

    public final String v0() {
        String str = "\u06df\u06e1\u06e8";
        String strM4027 = null;
        BigInteger bigInteger = null;
        byte[] bArr = null;
        Object[] objArr = null;
        SecureRandom secureRandomM3826 = null;
        Locale localeM5051 = null;
        short[] sArrM6603 = null;
        String strM920 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746758:
                    str = "\u06e5\u06e3\u06e8";
                    bArr = new byte[16];
                    break;
                case 1748828:
                    i10 = i11 ^ 534;
                    str = "\u06e8\u06e6\u06e5";
                    break;
                case 1749665:
                    str = "\u06e7\u06e2\u06e5";
                    objArr = new Object[1];
                    break;
                case 1749700:
                    return strM920;
                case 1750662:
                    str = "\u06e4\u06e1\u06e7";
                    sArrM6603 = m6603();
                    break;
                case 1750664:
                    strM4027 = C0210.m4027(sArrM6603, 3311, i10, 1762);
                    str = "\u06e7\u06e4\u06e0";
                    break;
                case 1750755:
                    str = "\u06e2\u06e2\u06e1";
                    bigInteger = new BigInteger(1, bArr);
                    break;
                case 1751562:
                    str = "\u06e8\u06e1\u06e7";
                    i11 = C0107.f133;
                    break;
                case 1752552:
                    str = "\u06e3\u06e6\u06e6";
                    localeM5051 = C0264.m5051();
                    break;
                case 1752586:
                    str = "\u06e1\u06e5\u06e2";
                    secureRandomM3826 = C0199.m3826(this);
                    break;
                case 1754474:
                    str = "\u06e1\u06e6\u06e1";
                    i11 = C0351.f622;
                    break;
                case 1754531:
                    str = "\u06e2\u06e3\u06e5";
                    strM920 = C0048.m920(localeM5051, strM4027, objArr);
                    break;
                case 1755406:
                    i10 = i11 ^ (-723);
                    str = "\u06e3\u06e3\u06e8";
                    break;
                case 1755559:
                    objArr[i10] = bigInteger;
                    str = "\u06e3\u06e3\u06e6";
                    break;
                default:
                    C0411.m8082(secureRandomM3826, bArr);
                    str = "\u06e5\u06e2\u06e5";
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:134:0x01d3. Please report as an issue. */
    public final Object x(int i10, Object obj, boolean z10, boolean z11) {
        long j10;
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
                    return null;
                case 239:
                    boolean z12 = obj instanceof Long;
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!z12) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return obj;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean z13 = obj instanceof Double;
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (z13) {
                                                i13 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            boolean z14 = obj instanceof Integer;
                                            int i14 = 48891;
                                            while (true) {
                                                i14 ^= 48908;
                                                switch (i14) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        boolean z15 = obj instanceof Byte;
                                                        int i15 = 49666;
                                                        while (true) {
                                                            i15 ^= 49683;
                                                            switch (i15) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i15 = !z15 ? 49728 : 49759;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    return C0438.m8554(C0362.m7101((Byte) obj));
                                                                case 83:
                                                                    boolean z16 = obj instanceof Short;
                                                                    int i16 = 49790;
                                                                    while (true) {
                                                                        i16 ^= 49807;
                                                                        switch (i16) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 51:
                                                                                boolean z17 = obj instanceof Boolean;
                                                                                int i17 = 49914;
                                                                                while (true) {
                                                                                    i17 ^= 49931;
                                                                                    switch (i17) {
                                                                                        case 497:
                                                                                            if (z17) {
                                                                                                i17 = 50658;
                                                                                            }
                                                                                            break;
                                                                                        case 1711:
                                                                                            break;
                                                                                        case 1736:
                                                                                            boolean z18 = obj instanceof Float;
                                                                                            int i18 = 51588;
                                                                                            while (true) {
                                                                                                i18 ^= 51605;
                                                                                                switch (i18) {
                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        if (z18) {
                                                                                                            i18 = 51681;
                                                                                                        }
                                                                                                        break;
                                                                                                    case 54:
                                                                                                        break;
                                                                                                    case 87:
                                                                                                        boolean z19 = obj instanceof String;
                                                                                                        int i19 = 51712;
                                                                                                        while (true) {
                                                                                                            i19 ^= 51729;
                                                                                                            switch (i19) {
                                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                                    break;
                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                    i19 = !z19 ? 51805 : 51774;
                                                                                                                    break;
                                                                                                                case 47:
                                                                                                                    break;
                                                                                                                case 76:
                                                                                                                    boolean z20 = obj instanceof Character;
                                                                                                                    int i20 = 51836;
                                                                                                                    while (true) {
                                                                                                                        i20 ^= 51853;
                                                                                                                        switch (i20) {
                                                                                                                            case 241:
                                                                                                                                i20 = !z20 ? 52580 : 52549;
                                                                                                                                break;
                                                                                                                            case 1963:
                                                                                                                                break;
                                                                                                                            case 1992:
                                                                                                                                break;
                                                                                                                            case 2025:
                                                                                                                                boolean z21 = obj instanceof CharSequence;
                                                                                                                                int i21 = 52611;
                                                                                                                                while (true) {
                                                                                                                                    i21 ^= 52628;
                                                                                                                                    switch (i21) {
                                                                                                                                        case 23:
                                                                                                                                            i21 = z21 ? 52704 : 52673;
                                                                                                                                            break;
                                                                                                                                        case 54:
                                                                                                                                            break;
                                                                                                                                        case 85:
                                                                                                                                            int i22 = 53510;
                                                                                                                                            while (true) {
                                                                                                                                                i22 ^= 53527;
                                                                                                                                                switch (i22) {
                                                                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                        i22 = z11 ? 53603 : 53572;
                                                                                                                                                        break;
                                                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                                        break;
                                                                                                                                                    case 83:
                                                                                                                                                        break;
                                                                                                                                                    case 116:
                                                                                                                                                        boolean z22 = obj instanceof Bundle[];
                                                                                                                                                        int i23 = 53634;
                                                                                                                                                        while (true) {
                                                                                                                                                            i23 ^= 53651;
                                                                                                                                                            switch (i23) {
                                                                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                    i23 = !z22 ? 53727 : 53696;
                                                                                                                                                                    break;
                                                                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                                                    break;
                                                                                                                                                                case 76:
                                                                                                                                                                    boolean z23 = obj instanceof Parcelable[];
                                                                                                                                                                    int i24 = 53758;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i24 ^= 53775;
                                                                                                                                                                        switch (i24) {
                                                                                                                                                                            case 1009:
                                                                                                                                                                                i24 = z23 ? 54502 : 54471;
                                                                                                                                                                                break;
                                                                                                                                                                            case 1703:
                                                                                                                                                                                break;
                                                                                                                                                                            case 1736:
                                                                                                                                                                                break;
                                                                                                                                                                            case 1769:
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
                                                                                                                                                        ArrayList arrayList = new ArrayList();
                                                                                                                                                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                                                                                                                                                        int length = parcelableArr.length;
                                                                                                                                                        int i25 = 0;
                                                                                                                                                        while (true) {
                                                                                                                                                            int i26 = i25;
                                                                                                                                                            int i27 = 54533;
                                                                                                                                                            while (true) {
                                                                                                                                                                i27 ^= 54550;
                                                                                                                                                                switch (i27) {
                                                                                                                                                                    case 19:
                                                                                                                                                                        i27 = i26 < length ? 54626 : 54595;
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
                                                                                                                                                                return C0065.m1255(arrayList, new Bundle[C0241.m4637(arrayList)]);
                                                                                                                                                            }
                                                                                                                                                            Parcelable parcelable = parcelableArr[i26];
                                                                                                                                                            boolean z24 = parcelable instanceof Bundle;
                                                                                                                                                            int i28 = 54657;
                                                                                                                                                            while (true) {
                                                                                                                                                                i28 ^= 54674;
                                                                                                                                                                switch (i28) {
                                                                                                                                                                    case 19:
                                                                                                                                                                        i28 = z24 ? 55401 : 54719;
                                                                                                                                                                        break;
                                                                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                                                                                        break;
                                                                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                                                        break;
                                                                                                                                                                    case 3579:
                                                                                                                                                                        Bundle bundleM1218 = C0063.m1218(this, (Bundle) parcelable);
                                                                                                                                                                        int i29 = 55432;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i29 ^= 55449;
                                                                                                                                                                            switch (i29) {
                                                                                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                                    i29 = bundleM1218 != null ? 55525 : 55494;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 62:
                                                                                                                                                                                    break;
                                                                                                                                                                                case 95:
                                                                                                                                                                                    break;
                                                                                                                                                                                case 124:
                                                                                                                                                                                    boolean zM3729 = C0195.m3729(bundleM1218);
                                                                                                                                                                                    int i30 = 55556;
                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        i30 ^= 55573;
                                                                                                                                                                                        switch (i30) {
                                                                                                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                                                i30 = !zM3729 ? 55649 : 55618;
                                                                                                                                                                                                break;
                                                                                                                                                                                            case 54:
                                                                                                                                                                                                break;
                                                                                                                                                                                            case 87:
                                                                                                                                                                                                break;
                                                                                                                                                                                            case 116:
                                                                                                                                                                                                C0357.m6998(arrayList, bundleM1218);
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
                                                                                                                                                            i25 = (C0445.f716 ^ 572) + i26;
                                                                                                                                                            int i31 = 55680;
                                                                                                                                                            while (true) {
                                                                                                                                                                i31 ^= 55697;
                                                                                                                                                                switch (i31) {
                                                                                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                        i31 = 56362;
                                                                                                                                                                        break;
                                                                                                                                                                    case 1467:
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    default:
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            return null;
                                                                                                                                        case 116:
                                                                                                                                            int i32 = 52735;
                                                                                                                                            while (true) {
                                                                                                                                                i32 ^= 52752;
                                                                                                                                                switch (i32) {
                                                                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                                                                        break;
                                                                                                                                                    case 1007:
                                                                                                                                                        i32 = 52766;
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
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        return C0023.m460(C0250.m4789(obj), i10, z10);
                                                                                                    case 116:
                                                                                                        return C0422.m8281(C0362.m7107((Float) obj));
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                                i18 = 51650;
                                                                                            }
                                                                                            break;
                                                                                        case 1769:
                                                                                            boolean zM14 = C0000.m14((Boolean) obj);
                                                                                            int i33 = 50689;
                                                                                            while (true) {
                                                                                                i33 ^= 50706;
                                                                                                switch (i33) {
                                                                                                    case 19:
                                                                                                        i33 = zM14 ? 50782 : 50751;
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                        j10 = 0;
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                        break;
                                                                                                    case 76:
                                                                                                        j10 = 1;
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
                                                                                            return C0438.m8554(j10);
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    i17 = 50627;
                                                                                }
                                                                                break;
                                                                            case 84:
                                                                                return C0438.m8554(C0472.m9201((Short) obj));
                                                                            case 241:
                                                                                i16 = !z16 ? 49852 : 49883;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 503:
                                                        i14 = !z14 ? 48953 : 49635;
                                                        break;
                                                    case 32495:
                                                        return C0438.m8554(C0366.m7190((Integer) obj));
                                                }
                                            }
                                            break;
                                        case 47417:
                                            int i35 = 48767;
                                            while (true) {
                                                i35 ^= 48784;
                                                switch (i35) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        return obj;
                                                    case 239:
                                                        i35 = 48798;
                                                        break;
                                                }
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

    public final SecureRandom x0() {
        C0223.m4302(this);
        SecureRandom secureRandomM5573 = C0289.m5573(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (secureRandomM5573 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    this.f10425c = new SecureRandom();
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return C0289.m5573(this);
    }

    public final void y0() {
        C0223.m4302(this);
        SecureRandom secureRandom = new SecureRandom();
        long jM4426 = C0230.m4426(secureRandom);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (jM4426 == 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    jM4426 = C0230.m4426(secureRandom);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (jM4426 == 0) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                d4 d4VarM572 = C0029.m572(this);
                                C0135.m2604(C0330.m6385(d4VarM572), C0469.m9139(m6603(), 3316, C0421.f692 ^ (-309), 854));
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
        C0138.m2666(C0001.m29(this), jM4426);
    }

    public final v z(String str, Bundle bundle, String str2, long j10, boolean z10) {
        Bundle bundle2;
        Bundle bundleM1218;
        boolean zM1883 = C0088.m1883(str);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM1883) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return null;
                case 239:
                    int iM1748 = C0081.m1748(this, str);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM1748 == 0) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                C0419.m8245(C0454.m8871(C0029.m572(this)), C0188.m3587(m6603(), 3360, C0350.f621 ^ (-745), 849), C0387.m7586(C0233.m4489(this), str));
                                throw new IllegalArgumentException();
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = bundle != null ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            bundle2 = new Bundle();
                                            break;
                                        case 47417:
                                            bundle2 = new Bundle(bundle);
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 239:
                                                        i13 = 48798;
                                                        continue;
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
                                String strM1682 = C0078.m1682(m6603(), 3358, C0142.f168 ^ (-616), 815);
                                C0235.m4526(bundle2, strM1682, str2);
                                Bundle bundleM7614 = C0388.m7614(this, str, bundle2, C0243.m4667(strM1682), true);
                                int i14 = 48891;
                                while (true) {
                                    i14 ^= 48908;
                                    switch (i14) {
                                        case 22:
                                            break;
                                        case 53:
                                            bundleM1218 = bundleM7614;
                                            break;
                                        case 503:
                                            i14 = z10 ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            bundleM1218 = C0063.m1218(this, bundleM7614);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                C0270.m5173(bundleM1218);
                                return new v(str, new s(bundleM1218), str2, j10);
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
}
