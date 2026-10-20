package com.auto.accept.ui.viewmodel;

import a.C0000;
import a0.C0003;
import a2.C0005;
import a3.C0006;
import a4.q;
import a5.i0;
import a5.j;
import a6.C0007;
import a7.C0008;
import a8.C0009;
import aa.C0012;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.C0013;
import android.os.PowerManager;
import android.support.v4.app.C0014;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.foundation.C0026;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.foundation.text.modifiers.C0025;
import androidx.compose.ui.draw.C0028;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.graphics.C0031;
import androidx.compose.ui.layout.C0035;
import androidx.compose.ui.platform.C0038;
import androidx.lifecycle.a;
import androidx.profileinstaller.C0045;
import androidx.profileinstaller.C0046;
import b.C0049;
import b7.C0054;
import b8.C0055;
import c0.C0057;
import c1.C0060;
import c3.C0063;
import c4.C0064;
import c6.C0067;
import c7.C0068;
import c7.C0069;
import ca.C0070;
import com.auto.accept.data.model.AppConfig;
import com.auto.accept.data.model.TransactionData;
import com.auto.accept.service.KeepAliveService;
import com.auto.accept.service.OverlayService;
import com.auto.accept.service.RideAcceptorService;
import com.google.android.datatransport.cct.C0076;
import com.google.android.datatransport.cct.C0077;
import com.google.android.datatransport.cct.C0078;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.stats.C0101;
import com.google.android.gms.internal.tasks.C0102;
import com.google.android.gms.tasks.C0106;
import com.google.android.play.core.integrity.client.C0107;
import com.google.android.play.core.integrity.client.C0108;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.abt.C0112;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.encoders.C0143;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.iid.C0170;
import com.google.firebase.inject.C0172;
import com.google.firebase.installations.C0177;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.measurement.C0181;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import com.google.firebase.tracing.C0204;
import com.google.gson.internal.bind.C0206;
import com.google.gson.internal.sql.C0208;
import com.google.protobuf.C0209;
import d.C0210;
import d1.C0211;
import d1.C0212;
import d2.C0215;
import d3.C0216;
import d4.C0217;
import d7.C0220;
import d8.C0221;
import d9.C0225;
import d9.C0226;
import dagger.hilt.android.C0240;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.lifecycle.C0236;
import dagger.hilt.android.lifecycle.HiltViewModel;
import dagger.hilt.codegen.C0241;
import dagger.hilt.components.C0243;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.C0253;
import dagger.hilt.internal.aggregatedroot.C0246;
import dagger.hilt.internal.componenttreedeps.C0248;
import dagger.hilt.internal.generatesrootinput.C0250;
import dagger.hilt.internal.processedrootsentinel.C0251;
import dagger.hilt.migration.C0254;
import e0.C0256;
import e2.C0263;
import e7.C0264;
import e9.C0266;
import f.C0270;
import f0.C0271;
import f1.C0273;
import f4.C0275;
import f5.e0;
import f5.g0;
import f5.k;
import f5.m;
import f5.o;
import f5.t;
import f5.u;
import f5.y;
import f6.C0278;
import g0.C0285;
import g2.C0287;
import g3.C0288;
import g4.C0289;
import g5.C0290;
import g7.C0292;
import g8.C0293;
import g9.C0294;
import h0.C0299;
import h1.C0300;
import h3.C0301;
import h4.C0304;
import h4.C0305;
import h5.C0307;
import h5.C0308;
import h7.C0310;
import h7.C0312;
import i4.C0317;
import i5.C0318;
import i6.C0320;
import j2.C0323;
import j4.C0326;
import j6.C0328;
import j9.C0329;
import ja.C0330;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k2.C0333;
import k3.C0334;
import k3.C0335;
import l0.C0340;
import l2.C0341;
import l3.C0342;
import l8.C0345;
import l8.C0346;
import l9.C0347;
import la.C0348;
import m5.C0354;
import m7.C0356;
import m7.C0357;
import m9.d0;
import m9.x1;
import n.C0361;
import n7.C0363;
import n7.C0364;
import n8.C0365;
import n9.C0366;
import o2.C0368;
import o7.i2;
import o8.C0371;
import p0.C0373;
import p3.C0375;
import p7.C0378;
import p8.C0379;
import p8.C0380;
import p9.q0;
import p9.z;
import q0.C0382;
import q1.C0383;
import q2.C0384;
import q5.C0385;
import q6.C0386;
import q6.C0388;
import q8.f;
import q8.h;
import r.C0392;
import r1.C0393;
import r2.C0395;
import r2.C0397;
import r5.C0399;
import r6.C0401;
import r7.C0403;
import r7.C0404;
import r8.r;
import r9.C0405;
import s3.C0412;
import s6.C0413;
import s7.C0415;
import t0.C0418;
import t1.C0419;
import t2.C0421;
import t2.C0422;
import t3.C0424;
import t7.C0425;
import u.C0429;
import u2.C0433;
import u4.C0435;
import u4.C0436;
import u8.C0438;
import u8.e;
import v.C0439;
import v0.C0441;
import v0.C0442;
import v5.C0445;
import v6.C0446;
import v7.C0449;
import v9.C0451;
import w1.C0455;
import w2.C0456;
import w4.C0459;
import w4.C0461;
import w9.C0465;
import x4.C0469;
import x7.C0471;
import x8.C0473;
import y.C0475;
import y6.C0477;
import y9.C0478;
import z0.C0482;
import z3.C0487;
import z4.b;
import z4.d;
import z4.g;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
@HiltViewModel
public final class MainViewModel extends a {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f106short = {849, 832, 832, 860, 857, 851, 849, 836, 857, 863, 862, 2766, 2764, 2779, 2776, 2779, 2764, 2779, 2768, 2781, 2779, 2765, 2803, 2783, 2768, 2783, 2777, 2779, 2764, 1040, 1028, 1029, 1049, 1084, 1040, 1055, 1040, 1046, 1044, 1027, 2910, 2897, 2890, 2909, 2891, 2892, 2903, 2890, 2909, 2922, 2909, 2888, 2903, 2891, 2897, 2892, 2903, 2890, 2881, 2394, 2381, 2373, 2375, 2396, 2381, 2411, 2375, 2374, 2382, 2369, 2383, 2405, 2377, 2374, 2377, 2383, 2381, 2394, 3084, 3104, 3112, 3119, 3095, 3112, 3108, 3126, 3084, 3118, 3109, 3108, 3117, 830, 826, 2815, 2813, 2800, 2800, 2748, 2792, 2803, 2748, 2747, 2798, 2809, 2799, 2793, 2801, 2809, 2747, 2748, 2814, 2809, 2810, 2803, 2798, 2809, 2748, 2747, 2805, 2802, 2794, 2803, 2807, 2809, 2747, 2748, 2795, 2805, 2792, 2804, 2748, 2815, 2803, 2798, 2803, 2793, 2792, 2805, 2802, 2809, 3135, 3114, 3105, 3115, 3110, 3105, 3112, 2681, 2660, 2668, 2677, 2670, 2681, 2680, 2344, 2356, 2361, 2358, 2316, 2337, 2344, 2365, 2647, 2654, 2643, 2649, 2624, 2642, 2640, 2641, 2635, 2647, 2781, 2783, 2782, 2756, 2776, 266, 278, 274, 257, 1304, 1290, 1290, 1284, 280, 285, 261, 3271, 3269, 3269, 3267, 3285, 3285, 3279, 3268, 3279, 3274, 3279, 3282, 3295, 3321, 3267, 3272, 3271, 3268, 3274, 3267, 3266, 3272, 3267, 3276, 3279, 3265, 3272, 3273, 3314, 3276, 3278, 3278, 3272, 3294, 3294, 3268, 3279, 3268, 3265, 3268, 3289, 3284, 3314, 3294, 3272, 3295, 3291, 3268, 3278, 3272, 3294, 1129, 1123, 1134, 1147, 1147, 1130, 1121, 1115, 1120, 1116, 1147, 1149, 1126, 1121, 1128, 1063, 1057, 1057, 1057, 1062, 2815, 2805, 2808, 2797, 2797, 2812, 2807, 2765, 2806, 2762, 2801, 2806, 2795, 2797, 2762, 2797, 2795, 2800, 2807, 2814, 2737, 2743, 2743, 2743, 2736, 1501, 1483, 1485, 1521, 1475, 1487, 1494, 1521, 1482, 1500, 1473, 1502, 1521, 1477, 1475, 2195, 2181, 2179, 2239, 2189, 2177, 2200, 2239, 2192, 2185, 2179, 2187, 2197, 2192, 2239, 2187, 2189, 464, 454, 448, 508, 462, 458, 461, 508, 455, 465, 460, 467, 508, 456, 462, 1355, 1373, 1371, 1383, 1365, 1361, 1366, 1383, 1352, 1361, 1371, 1363, 1357, 1352, 1383, 1363, 1365, 1984, 1993, 1988, 1998, 2007, 1989, 1991, 1990, 2012, 1984, 2727, 2725, 2724, 2750, 2722, 1611, 1623, 1619, 1600, 1179, 1161, 1161, 1159, 430, 427, 435, 3019, 3050, 2981, 3052, 3051, 3057, 3040, 3063, 3051, 3040, 3057, 2981, 3046, 3050, 3051, 3051, 3040, 3046, 3057, 3052, 3050, 3051, 2987, 2981, 3030, 3040, 3063, 3059, 3052, 3046, 3040, 2981, 3063, 3040, 3060, 3056, 3052, 3063, 3040, 3062, 2981, 3052, 3051, 3057, 3040, 3063, 3051, 3040, 3057, 2987, 1121, 1088, 1039, 1102, 1100, 1115, 1094, 1113, 1098, 1039, 1116, 1114, 1101, 1116, 1100, 1117, 1094, 1119, 1115, 1094, 1088, 1089, 1039, 1119, 1091, 1102, 1089, 1025, 1039, 1151, 1091, 1098, 1102, 1116, 1098, 1039, 1116, 1114, 1101, 1116, 1100, 1117, 1094, 1101, 1098, 1039, 1097, 1094, 1117, 1116, 1115, 1025, 831, 771, 778, 782, 796, 778, 847, 776, 797, 782, 769, 795, 847, 782, 780, 780, 778, 796, 796, 774, 781, 774, 771, 774, 795, 790, 847, 799, 778, 797, 770, 774, 796, 796, 774, 768, 769, 847, 777, 774, 797, 796, 795, 833, 1372, 1360, 1362, 1297, 1360, 1363, 1374, 1372, 1374, 1373, 1356, 1297, 1360, 1363, 1374, 1371, 1357, 1366, 1353, 1370, 1357, 3023, 3011, 3009, 2946, 3033, 3022, 3017, 3038, 3023, 3021, 3022, 2946, 3016, 3038, 3013, 3034, 3017, 3038, 3052, 3040, 3042, 2977, 3069, 3054, 3071, 3046, 3051, 3040, 2977, 3069, 3046, 3051, 3050, 3069, 3310, 3298, 3296, 3235, 3327, 3308, 3325, 3300, 3305, 3298, 3235, 3325, 3308, 3326, 3326, 3304, 3299, 3306, 3304, 3327, 2397, 2385, 2387, 2320, 2378, 2390, 2395, 2382, 2385, 2380, 2378, 2395, 2380, 2320, 2394, 2380, 2391, 2376, 2395, 2380, 2399, 2382, 2382, 1450, 1453, 1517, 1449, 1462, 1456, 1459, 1442, 1466, 1517, 1453, 1442, 1454, 1454, 1442, 1466, 1442, 1463, 1457, 1450, 1459, 1442, 1457, 1463, 1453, 1446, 1457, 306, 309, 373, 305, 302, 296, 299, 314, 290, 373, 309, 314, 310, 310, 314, 290, 314, 303, 297, 306, 1160, 1167, 1231, 1170, 1174, 1160, 1158, 1158, 1176, 1231, 1157, 1156, 1165, 1160, 1175, 1156, 1171, 1176, 1152, 1169, 1169, 3298, 3310, 3308, 3247, 3323, 3310, 3308, 3296, 3317, 3310, 3247, 3301, 3300, 3309, 3304, 3319, 3300, 3315, 3320, 2507, 2503, 2501, 2438, 2503, 2500, 2505, 2507, 2505, 2506, 2523, 2438, 2507, 2525, 2523, 2524, 2503, 2501, 2509, 2522, 2860, 2848, 2850, 2913, 2848, 2851, 2862, 2860, 2862, 2861, 2876, 2913, 2848, 2851, 2862, 2859, 2877, 2854, 2873, 2858, 2877, 2838, 2823, 2823, 2905, 2840, 2843, 2838, 2905, 2835, 2821, 2846, 2817, 2834, 2821, 1394, 1406, 1404, 1343, 1380, 1395, 1396, 1379, 1394, 1392, 1395, 1343, 1377, 1392, 1379, 1381, 1407, 1396, 1379, 3238, 3242, 3240, 3307, 3248, 3239, 3232, 3255, 3238, 3236, 3239, 3307, 3233, 3255, 3244, 3251, 3232, 3255, 2969, 2965, 2967, 3028, 2959, 2968, 2975, 2952, 2969, 2971, 2968, 752, 723, 734, 1820, 1835, 1836, 1851, 347, 349, 347, 1887, 1805, 1818, 1806, 1802, 1814, 1805, 1818, 1804, 1887, 1836, 1815, 1814, 1797, 1802, 1812, 1802, 1887, 1803, 1808, 1887, 1821, 1818, 1887, 1805, 1802, 1809, 1809, 1814, 1809, 1816, 1887, 1881, 1887, 1807, 1822, 1814, 1805, 1818, 1819, 1873, 1887, 1852, 1808, 1810, 1807, 1811, 1818, 1803, 1818, 1887, 1836, 1815, 1814, 1797, 1802, 1812, 1802, 1887, 1804, 1818, 1803, 1802, 1807, 1887, 1814, 1809, 1887, 1836, 1818, 1803, 1803, 1814, 1809, 1816, 1804, 1887, 1803, 1822, 1821, 1887, 1817, 1814, 1805, 1804, 1803, 1875, 1887, 1808, 1805, 1887, 1819, 1814, 1804, 1822, 1821, 1811, 1818, 1887, 1803, 1815, 1818, 1810, 1887, 1814, 1809, 1887, 1854, 1807, 1807, 1804, 1887, 1803, 1822, 1821, 1873, 2258, 2291, 2236, 2287, 2281, 2284, 2284, 2291, 2286, 2280, 2297, 2296, 2236, 2296, 2286, 2293, 2282, 2297, 2286, 2236, 2301, 2284, 2284, 2287, 2236, 2228, 2259, 2288, 2301, 2224, 2236, 2249, 2302, 2297, 2286, 2224, 2236, 2254, 2301, 2284, 2293, 2296, 2291, 2224, 2236, 2252, 2291, 2286, 2280, 2297, 2286, 2224, 2236, 2297, 2280, 2303, 2226, 2229, 2236, 2298, 2291, 2281, 2290, 2296, 2236, 2291, 
    2290, 2236, 2277, 2291, 2281, 2286, 2236, 2296, 2297, 2282, 2293, 2303, 2297, 2226, 2236, 2255, 2297, 2286, 2282, 2293, 2303, 2297, 2236, 2303, 2301, 2290, 2290, 2291, 2280, 2236, 2302, 2297, 2236, 2287, 2280, 2301, 2286, 2280, 2297, 2296, 2226, 1175, 1153, 1174, 1170, 1165, 1159, 1153, 1211, 1153, 1162, 1157, 1158, 1160, 1153, 1152, 1870, 1880, 1871, 1867, 1876, 1886, 1880, 1890, 1880, 1875, 1884, 1887, 1873, 1880, 1881, 2165, 2147, 2149, 2137, 2166, 2154, 2151, 2152, 2137, 2147, 2174, 2166, 2159, 2164, 2175, 2137, 2155, 2165, 674, 686, 677, 676, 1170, 1166, 1155, 1164, 1206, 1179, 1170, 1159, 1524, 1513, 1535, 1534, 1513, 1490, 1535, 712, 724, 729, 726, 748, 705, 712, 733};
    public final q0 A;
    public final z A0;
    public final z B;
    public final q0 B0;
    public final q0 C;
    public final z C0;
    public final z D;
    public final g D0;
    public final q0 E;
    public final q0 E0;
    public final z F;
    public final z F0;
    public final q0 G;
    public final q0 G0;
    public final z H;
    public final z H0;
    public boolean I;
    public final q0 I0;
    public final q0 J;
    public final z J0;
    public final z K;
    public final ArrayList K0;
    public final q0 L;
    public final z L0;
    public final z M;
    public final z M0;
    public final q0 N;
    public final z N0;
    public final z O;
    public final z O0;
    public final q0 P;
    public final z P0;
    public final z Q;
    public final q0 Q0;
    public final q0 R;
    public final z R0;
    public final z S;
    public final q0 T;
    public final z U;
    public final q0 V;
    public final z W;
    public final q0 X;
    public final z Y;
    public final q0 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final z f3080a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f3081b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final q0 f3082b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f3083c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final z f3084c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a5.z f3085d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final q0 f3086d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f3087e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final z f3088e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3089f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final q0 f3090f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q0 f3091g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final z f3092g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f3093h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final q0 f3094h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x1 f3095i;
    public final z i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z f3096j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final q0 f3097j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z f3098k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final z f3099k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z f3100l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final q0 f3101l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z f3102m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final z f3103m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z f3104n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final q0 f3105n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final z f3106o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final q0 f3107o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f3108p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final z f3109p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z f3110q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final q0 f3111q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q0 f3112r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final z f3113r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z f3114s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final q f3115s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q0 f3116t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final q0 f3117t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final z f3118u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final z f3119u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final q0 f3120v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final q0 f3121v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z f3122w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final z f3123w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final q0 f3124x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final q0 f3125x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z f3126y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final z f3127y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final z f3128z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final q0 f3129z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel(Application application, d dVar, j jVar, a5.z zVar, i0 i0Var) {
        super(application);
        C0375.m7360(application, C0386.m7577(m1570(), 0, C0076.f110 ^ 716, 816));
        C0375.m7360(dVar, C0132.m2538(m1570(), 11, C0165.f189 ^ 309, 2750));
        C0375.m7360(jVar, C0049.m957(m1570(), 29, C0110.f136 ^ 464, 1137));
        C0375.m7360(zVar, C0157.m2993(m1570(), 40, C0308.f456 ^ (-255), 2872));
        C0375.m7360(i0Var, C0287.m5538(m1570(), 59, C0172.f196 ^ 307, 2344));
        this.f3081b = dVar;
        this.f3083c = jVar;
        this.f3085d = zVar;
        this.f3087e = i0Var;
        this.f3089f = C0220.m4259(m1570(), 78, C0183.f207 ^ (-891), 3137);
        q0 q0VarM2752 = C0143.m2752(C0253.m4848());
        this.f3091g = q0VarM2752;
        this.f3093h = new z(q0VarM2752);
        this.f3096j = C0116.m2238(dVar);
        this.f3098k = C0285.m5505(dVar);
        this.f3100l = C0152.m2917(dVar);
        this.f3102m = C0449.m8767(dVar);
        this.f3104n = C0161.m3083(dVar);
        this.f3106o = C0067.m1302(dVar);
        this.f3108p = C0292.m5620(dVar);
        this.f3110q = C0365.m7167(i0Var);
        Boolean boolM8876 = C0455.m8876();
        q0 q0VarM2753 = C0143.m2752(boolM8876);
        this.f3112r = q0VarM2753;
        this.f3114s = new z(q0VarM2753);
        q0 q0VarM2754 = C0143.m2752(boolM8876);
        this.f3116t = q0VarM2754;
        this.f3118u = new z(q0VarM2754);
        q0 q0VarM2755 = C0143.m2752(boolM8876);
        this.f3120v = q0VarM2755;
        this.f3122w = new z(q0VarM2755);
        q0 q0VarM2756 = C0143.m2752(boolM8876);
        this.f3124x = q0VarM2756;
        this.f3126y = new z(q0VarM2756);
        this.f3128z = C0077.m1675(dVar);
        q0 q0VarM2757 = C0143.m2752(boolM8876);
        this.A = q0VarM2757;
        this.B = new z(q0VarM2757);
        q0 q0VarM2758 = C0143.m2752(boolM8876);
        this.C = q0VarM2758;
        this.D = new z(q0VarM2758);
        q0 q0VarM2759 = C0143.m2752(null);
        this.E = q0VarM2759;
        this.F = new z(q0VarM2759);
        q0 q0VarM27510 = C0143.m2752(boolM8876);
        this.G = q0VarM27510;
        this.H = new z(q0VarM27510);
        q0 q0VarM27511 = C0143.m2752(boolM8876);
        this.J = q0VarM27511;
        this.K = new z(q0VarM27511);
        String strM8581 = C0439.m8581();
        q0 q0VarM27512 = C0143.m2752(strM8581);
        this.L = q0VarM27512;
        this.M = new z(q0VarM27512);
        q0 q0VarM27513 = C0143.m2752(strM8581);
        this.N = q0VarM27513;
        this.O = new z(q0VarM27513);
        C0143.m2752(C0217.m4139(-1.0f));
        q0 q0VarM27514 = C0143.m2752(strM8581);
        this.P = q0VarM27514;
        this.Q = new z(q0VarM27514);
        q0 q0VarM27515 = C0143.m2752(C0334.m6483());
        this.R = q0VarM27515;
        this.S = new z(q0VarM27515);
        q0 q0VarM27516 = C0143.m2752(strM8581);
        this.T = q0VarM27516;
        this.U = new z(q0VarM27516);
        q0 q0VarM27517 = C0143.m2752(boolM8876);
        this.V = q0VarM27517;
        this.W = new z(q0VarM27517);
        q0 q0VarM27518 = C0143.m2752(strM8581);
        this.X = q0VarM27518;
        this.Y = new z(q0VarM27518);
        q0 q0VarM27519 = C0143.m2752(C0243.m4671(m1570(), 91, C0049.f69 ^ 301, 881));
        this.Z = q0VarM27519;
        this.f3080a0 = new z(q0VarM27519);
        q0 q0VarM27520 = C0143.m2752(C0057.m1083(1));
        this.f3082b0 = q0VarM27520;
        this.f3084c0 = new z(q0VarM27520);
        q0 q0VarM27521 = C0143.m2752(boolM8876);
        this.f3086d0 = q0VarM27521;
        this.f3088e0 = new z(q0VarM27521);
        q0 q0VarM27522 = C0143.m2752(strM8581);
        this.f3090f0 = q0VarM27522;
        this.f3092g0 = new z(q0VarM27522);
        q0 q0VarM27523 = C0143.m2752(boolM8876);
        this.f3094h0 = q0VarM27523;
        this.i0 = new z(q0VarM27523);
        q0 q0VarM27524 = C0143.m2752(strM8581);
        this.f3097j0 = q0VarM27524;
        this.f3099k0 = new z(q0VarM27524);
        q0 q0VarM27525 = C0143.m2752(C0438.m8554(80 ^ ((long) C0405.f676)));
        this.f3101l0 = q0VarM27525;
        this.f3103m0 = new z(q0VarM27525);
        this.f3105n0 = C0143.m2752(boolM8876);
        q0 q0VarM27526 = C0143.m2752(boolM8876);
        this.f3107o0 = q0VarM27526;
        this.f3109p0 = new z(q0VarM27526);
        q0 q0VarM27527 = C0143.m2752(null);
        this.f3111q0 = q0VarM27527;
        this.f3113r0 = new z(q0VarM27527);
        this.f3115s0 = new q();
        q0 q0VarM27528 = C0143.m2752(null);
        this.f3117t0 = q0VarM27528;
        this.f3119u0 = new z(q0VarM27528);
        q0 q0VarM27529 = C0143.m2752(null);
        this.f3121v0 = q0VarM27529;
        this.f3123w0 = new z(q0VarM27529);
        q0 q0VarM27530 = C0143.m2752(boolM8876);
        this.f3125x0 = q0VarM27530;
        this.f3127y0 = new z(q0VarM27530);
        r rVarM7500 = C0382.m7500();
        q0 q0VarM27531 = C0143.m2752(rVarM7500);
        this.f3129z0 = q0VarM27531;
        this.A0 = new z(q0VarM27531);
        q0 q0VarM27532 = C0143.m2752(null);
        this.B0 = q0VarM27532;
        this.C0 = new z(q0VarM27532);
        this.D0 = new g(C0287.m5540(this));
        q0 q0VarM27533 = C0143.m2752(rVarM7500);
        this.E0 = q0VarM27533;
        this.F0 = new z(q0VarM27533);
        q0 q0VarM27534 = C0143.m2752(boolM8876);
        this.G0 = q0VarM27534;
        this.H0 = new z(q0VarM27534);
        q0 q0VarM27535 = C0143.m2752(boolM8876);
        this.I0 = q0VarM27535;
        this.J0 = new z(q0VarM27535);
        d0 d0VarM2178 = C0113.m2178(this);
        f5.j jVar2 = new f5.j(this, null);
        int i10 = C0057.f77 ^ 690;
        C0383.m7508(d0VarM2178, null, 0, jVar2, i10);
        C0475.m9262(this);
        C0383.m7508(C0113.m2178(this), null, 0, new k(this, null), i10);
        this.K0 = new ArrayList();
        this.L0 = C0305.m5893(dVar);
        this.M0 = C0388.m7605(dVar);
        this.N0 = C0425.m8343(dVar);
        this.O0 = C0060.m1156(dVar);
        this.P0 = C0293.m5657(dVar);
        q0 q0VarM27536 = C0143.m2752(null);
        this.Q0 = q0VarM27536;
        this.R0 = new z(q0VarM27536);
        int iM5394 = C0278.m5394();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5394 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0156.m2977("QtA1jhU5G32T5rs1"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:207:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x023f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x024a A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x017b A[EDGE_INSN: B:253:0x017b->B:252:0x017b BREAK  A[LOOP:15: B:103:0x01b7->B:271:0x01b7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x017b A[EDGE_INSN: B:254:0x017b->B:252:0x017b BREAK  A[LOOP:15: B:103:0x01b7->B:271:0x01b7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x01f5 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0023. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:97:0x0186. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object c(MainViewModel mainViewModel, String str, String str2, e eVar) {
        m mVar;
        Object objM111;
        MainViewModel mainViewModelM3694;
        boolean z10;
        int i10;
        ArrayList arrayList;
        Iterator itM8318;
        boolean zM3327;
        int i11;
        Object objM8115;
        TransactionData transactionData;
        boolean zM4399;
        int i12;
        boolean zM43910;
        int i13;
        int i14;
        Iterator itM7155;
        Object objM8507;
        boolean zM3328;
        int i15;
        Object objM7131;
        int i16;
        int i17;
        C0014.m280(mainViewModel);
        boolean z11 = eVar instanceof m;
        int i18 = 1616;
        while (true) {
            i18 ^= 1633;
            switch (i18) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i18 = z11 ? 1709 : 1678;
                    break;
                case 204:
                    m mVar2 = (m) eVar;
                    int iM3698 = C0193.m3698(mVar2);
                    int i19 = 1740;
                    while (true) {
                        i19 ^= 1757;
                        switch (i19) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i19 = ((Integer.MAX_VALUE ^ iM3698) & iM3698) != 0 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                mVar = new m(mainViewModel, eVar);
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                mVar2.f6301f = ((iM3698 + 21) - Integer.MIN_VALUE) - 21;
                                int i20 = 1864;
                                while (true) {
                                    i20 ^= 1881;
                                    switch (i20) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i20 = 48674;
                                            break;
                                        case 47483:
                                            mVar = mVar2;
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
                    mVar = new m(mainViewModel, eVar);
                    break;
                default:
                    break;
            }
        }
        Object objM4365 = C0226.m4365(mVar);
        v8.a aVarM5766 = C0299.m5766();
        int iM3699 = C0193.m3698(mVar);
        int i21 = 48767;
        while (true) {
            i21 ^= 48784;
            try {
                switch (i21) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        C0329.m6365(objM4365);
                        a5.z zVarM7827 = C0399.m7827(mainViewModel);
                        mVar.f6296a = mainViewModel;
                        mVar.f6297b = str2;
                        mVar.f6301f = 1;
                        objM111 = C0006.m111(zVarM7827, str, mVar);
                        int i22 = 50689;
                        while (true) {
                            i22 ^= 50706;
                            switch (i22) {
                                case 19:
                                    i22 = objM111 == aVarM5766 ? 50782 : 50751;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    mainViewModelM3694 = mainViewModel;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 76:
                                    int i23 = 50813;
                                    while (true) {
                                        i23 ^= 50830;
                                        switch (i23) {
                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                return aVarM5766;
                                            case 243:
                                                i23 = 50844;
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        z10 = objM111 instanceof q8.g;
                        i10 = 51588;
                        while (true) {
                            i10 ^= 51605;
                            switch (i10) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i10 = ((((z10 ? 1 : 0) ^ '\uffff') & 1) | ((z10 ? 1 : 0) & '\ufffe')) != 0 ? 51681 : 51650;
                                    break;
                                case 54:
                                    break;
                                case 87:
                                    return C0012.m238();
                                case 116:
                                    arrayList = new ArrayList();
                                    itM8318 = C0424.m8318((List) objM111);
                                    while (true) {
                                        zM3327 = C0174.m3327(itM8318);
                                        i11 = 51712;
                                        while (true) {
                                            i11 ^= 51729;
                                            switch (i11) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i11 = zM3327 ? 51805 : 51774;
                                                    break;
                                                case 47:
                                                    break;
                                                case 76:
                                                    objM8115 = C0413.m8115(itM8318);
                                                    transactionData = (TransactionData) objM8115;
                                                    zM4399 = C0228.m4399(C0209.m4016(transactionData), C0152.m2920(m1570(), 140, C0078.f112 ^ (-91), 3183));
                                                    i12 = 51836;
                                                    while (true) {
                                                        i12 ^= 51853;
                                                        switch (i12) {
                                                            case 241:
                                                                i12 = zM4399 ? 52580 : 52549;
                                                                break;
                                                            case 1963:
                                                                break;
                                                            case 1992:
                                                                break;
                                                            case 2025:
                                                                zM43910 = C0228.m4399(C0244.m4692(transactionData), str2);
                                                                i13 = 52611;
                                                                while (true) {
                                                                    i13 ^= 52628;
                                                                    switch (i13) {
                                                                        case 23:
                                                                            i13 = !zM43910 ? 52704 : 52673;
                                                                            break;
                                                                        case 54:
                                                                            break;
                                                                        case 85:
                                                                            break;
                                                                        case 116:
                                                                            C0357.m6998(arrayList, objM8115);
                                                                            i14 = 52735;
                                                                            while (true) {
                                                                                i14 ^= 52752;
                                                                                switch (i14) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case 1007:
                                                                                        i14 = 52766;
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
                                            itM7155 = C0364.m7155(arrayList);
                                            objM8507 = objM111;
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        while (true) {
                            zM3328 = C0174.m3327(itM7155);
                            i15 = 53510;
                            while (true) {
                                i15 ^= 53527;
                                switch (i15) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i15 = zM3328 ? 53603 : 53572;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 83:
                                        break;
                                    case 116:
                                        break;
                                    default:
                                        break;
                                }
                            }
                            TransactionData transactionData2 = (TransactionData) C0413.m8115(itM7155);
                            a5.z zVarM7828 = C0399.m7827(mainViewModelM3694);
                            String strM4692 = C0244.m4692(transactionData2);
                            String strM4027 = C0210.m4027(m1570(), 147, C0477.f751 ^ 410, 2620);
                            mVar.f6296a = mainViewModelM3694;
                            mVar.f6297b = objM8507;
                            mVar.f6298c = itM7155;
                            mVar.f6301f = 2;
                            objM7131 = C0363.m7131(zVarM7828, strM4692, strM4027, mVar);
                            i16 = 53634;
                            while (true) {
                                i16 ^= 53651;
                                switch (i16) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i16 = objM7131 == aVarM5766 ? 53727 : 53696;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        i17 = 53758;
                                        while (true) {
                                            i17 ^= 53775;
                                            switch (i17) {
                                                case 1009:
                                                    i17 = 54440;
                                                    break;
                                                case 1703:
                                                    return aVarM5766;
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
                        return C0012.m238();
                    case 76:
                        int i24 = 48891;
                        while (true) {
                            i24 ^= 48908;
                            switch (i24) {
                                case 22:
                                    break;
                                case 53:
                                    String str3 = (String) C0435.m8507(mVar);
                                    mainViewModelM3694 = C0193.m3694(mVar);
                                    C0329.m6365(objM4365);
                                    objM111 = C0361.m7093((h) objM4365);
                                    int i25 = 49914;
                                    while (true) {
                                        i25 ^= 49931;
                                        switch (i25) {
                                            case 497:
                                                i25 = 50596;
                                                continue;
                                            case 1711:
                                                str2 = str3;
                                                break;
                                            default:
                                                continue;
                                        }
                                        z10 = objM111 instanceof q8.g;
                                        i10 = 51588;
                                        while (true) {
                                            i10 ^= 51605;
                                            switch (i10) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (((((z10 ? 1 : 0) ^ '\uffff') & 1) | ((z10 ? 1 : 0) & '\ufffe')) != 0) {
                                                    }
                                                    break;
                                                case 54:
                                                    break;
                                                case 87:
                                                    return C0012.m238();
                                                case 116:
                                                    arrayList = new ArrayList();
                                                    itM8318 = C0424.m8318((List) objM111);
                                                    while (true) {
                                                        zM3327 = C0174.m3327(itM8318);
                                                        i11 = 51712;
                                                        while (true) {
                                                            i11 ^= 51729;
                                                            switch (i11) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (zM3327) {
                                                                    }
                                                                    break;
                                                                case 47:
                                                                    break;
                                                                case 76:
                                                                    objM8115 = C0413.m8115(itM8318);
                                                                    transactionData = (TransactionData) objM8115;
                                                                    zM4399 = C0228.m4399(C0209.m4016(transactionData), C0152.m2920(m1570(), 140, C0078.f112 ^ (-91), 3183));
                                                                    i12 = 51836;
                                                                    while (true) {
                                                                        i12 ^= 51853;
                                                                        switch (i12) {
                                                                            case 241:
                                                                                if (zM4399) {
                                                                                }
                                                                                break;
                                                                            case 1963:
                                                                                break;
                                                                            case 1992:
                                                                                break;
                                                                                break;
                                                                            case 2025:
                                                                                zM43910 = C0228.m4399(C0244.m4692(transactionData), str2);
                                                                                i13 = 52611;
                                                                                while (true) {
                                                                                    i13 ^= 52628;
                                                                                    switch (i13) {
                                                                                        case 23:
                                                                                            if (!zM43910) {
                                                                                            }
                                                                                            break;
                                                                                        case 54:
                                                                                            break;
                                                                                        case 85:
                                                                                            break;
                                                                                            break;
                                                                                        case 116:
                                                                                            C0357.m6998(arrayList, objM8115);
                                                                                            i14 = 52735;
                                                                                            while (true) {
                                                                                                i14 ^= 52752;
                                                                                                switch (i14) {
                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        break;
                                                                                                    case 1007:
                                                                                                        i14 = 52766;
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
                                                            itM7155 = C0364.m7155(arrayList);
                                                            objM8507 = objM111;
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        while (true) {
                                            zM3328 = C0174.m3327(itM7155);
                                            i15 = 53510;
                                            while (true) {
                                                i15 ^= 53527;
                                                switch (i15) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (zM3328) {
                                                        }
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 83:
                                                        break;
                                                    case 116:
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            TransactionData transactionData3 = (TransactionData) C0413.m8115(itM7155);
                                            a5.z zVarM7829 = C0399.m7827(mainViewModelM3694);
                                            String strM4693 = C0244.m4692(transactionData3);
                                            String strM4028 = C0210.m4027(m1570(), 147, C0477.f751 ^ 410, 2620);
                                            mVar.f6296a = mainViewModelM3694;
                                            mVar.f6297b = objM8507;
                                            mVar.f6298c = itM7155;
                                            mVar.f6301f = 2;
                                            objM7131 = C0363.m7131(zVarM7829, strM4693, strM4028, mVar);
                                            i16 = 53634;
                                            while (true) {
                                                i16 ^= 53651;
                                                switch (i16) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (objM7131 == aVarM5766) {
                                                        }
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        i17 = 53758;
                                                        while (true) {
                                                            i17 ^= 53775;
                                                            switch (i17) {
                                                                case 1009:
                                                                    i17 = 54440;
                                                                    break;
                                                                case 1703:
                                                                    return aVarM5766;
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
                                        return C0012.m238();
                                    }
                                case 503:
                                    i24 = iM3699 != 1 ? 49635 : 48953;
                                    break;
                                case 32495:
                                    int i26 = 49666;
                                    while (true) {
                                        i26 ^= 49683;
                                        switch (i26) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i26 = iM3699 == 2 ? 49759 : 49728;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                itM7155 = C0054.m1054(mVar);
                                                objM8507 = C0435.m8507(mVar);
                                                MainViewModel mainViewModelM3695 = C0193.m3694(mVar);
                                                C0329.m6365(objM4365);
                                                C0014.m280((h) objM4365);
                                                int i27 = 49790;
                                                while (true) {
                                                    i27 ^= 49807;
                                                    switch (i27) {
                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            mainViewModelM3694 = mainViewModelM3695;
                                                            break;
                                                        case 241:
                                                            i27 = 49821;
                                                            continue;
                                                        default:
                                                            continue;
                                                    }
                                                }
                                                break;
                                            case 83:
                                                throw new IllegalStateException(C0112.m2172(m1570(), 93, C0142.f168 ^ (-587), 2716));
                                            default:
                                                break;
                                        }
                                    }
                                    while (true) {
                                        zM3328 = C0174.m3327(itM7155);
                                        i15 = 53510;
                                        while (true) {
                                            i15 ^= 53527;
                                            switch (i15) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (zM3328) {
                                                    }
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 83:
                                                    break;
                                                case 116:
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        TransactionData transactionData4 = (TransactionData) C0413.m8115(itM7155);
                                        a5.z zVarM78210 = C0399.m7827(mainViewModelM3694);
                                        String strM4694 = C0244.m4692(transactionData4);
                                        String strM4029 = C0210.m4027(m1570(), 147, C0477.f751 ^ 410, 2620);
                                        mVar.f6296a = mainViewModelM3694;
                                        mVar.f6297b = objM8507;
                                        mVar.f6298c = itM7155;
                                        mVar.f6301f = 2;
                                        objM7131 = C0363.m7131(zVarM78210, strM4694, strM4029, mVar);
                                        i16 = 53634;
                                        while (true) {
                                            i16 ^= 53651;
                                            switch (i16) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (objM7131 == aVarM5766) {
                                                    }
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 76:
                                                    i17 = 53758;
                                                    while (true) {
                                                        i17 ^= 53775;
                                                        switch (i17) {
                                                            case 1009:
                                                                i17 = 54440;
                                                                break;
                                                            case 1703:
                                                                return aVarM5766;
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
                                    return C0012.m238();
                                default:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        i21 = iM3699 != 0 ? 48860 : 48829;
                        break;
                    default:
                        break;
                }
            } catch (Exception e4) {
                int i28 = 54533;
                while (true) {
                    i28 ^= 54550;
                    switch (i28) {
                        case 19:
                            i28 = 54564;
                            continue;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        default:
                            continue;
                    }
                }
            }
        }
    }

    public static final void d(MainViewModel mainViewModel, String str) {
        x1 x1VarM3703 = C0193.m3703(mainViewModel);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (x1VarM3703 != null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    C0345.m6768(x1VarM3703, null);
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        mainViewModel.f3095i = C0383.m7508(C0113.m2178(mainViewModel), null, 0, new t(mainViewModel, str, true, null), C0118.f144 ^ (-953));
    }

    public static long k(String str) {
        C0375.m7360(str, C0167.m3196(m1570(), 154, C0263.f343 ^ 528, 2392));
        switch (C0429.m8418(str)) {
            case 67452:
                boolean zM321 = C0016.m321(str, C0045.m883(m1570(), 185, C0354.f625 ^ 298, 348));
                int i10 = 52611;
                while (true) {
                    i10 ^= 52628;
                    switch (i10) {
                        case 23:
                            i10 = zM321 ? 52704 : 52673;
                            break;
                        case 54:
                            break;
                        case 85:
                            break;
                        case 116:
                            int i11 = 52735;
                            while (true) {
                                i11 ^= 52752;
                                switch (i11) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        return 86400000L;
                                    case 1007:
                                        i11 = 52766;
                                        break;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                }
                return 0L;
            case 2660340:
                boolean zM322 = C0016.m321(str, C0445.m8682(m1570(), 181, C0014.f34 ^ 966, 1359));
                int i12 = 51588;
                while (true) {
                    i12 ^= 51605;
                    switch (i12) {
                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i12 = !zM322 ? 51681 : 51650;
                            break;
                        case 54:
                            break;
                        case 87:
                            int i13 = 51836;
                            while (true) {
                                i13 ^= 51853;
                                switch (i13) {
                                    case 241:
                                        i13 = 52518;
                                        break;
                                    case 1963:
                                        return 604800000L;
                                }
                            }
                            break;
                        case 116:
                            int i14 = 51712;
                            while (true) {
                                i14 ^= 51729;
                                switch (i14) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case 15:
                                    case Code.UNAUTHENTICATED /* 16 */:
                                    default:
                                        continue;
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i14 = 51743;
                                        continue;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                }
                return 0L;
            case 2719805:
                boolean zM323 = C0016.m321(str, C0307.m5933(m1570(), 177, C0418.f689 ^ 225, 339));
                int i15 = 49914;
                while (true) {
                    i15 ^= 49931;
                    switch (i15) {
                        case 497:
                            i15 = !zM323 ? 50658 : 50627;
                            break;
                        case 1711:
                            break;
                        case 1736:
                            int i16 = 50813;
                            while (true) {
                                i16 ^= 50830;
                                switch (i16) {
                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        return 31536000000L;
                                    case 243:
                                        i16 = 50844;
                                        break;
                                }
                            }
                            break;
                        case 1769:
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
                return 0L;
            case 73542240:
                boolean zM324 = C0016.m321(str, C0471.m9178(m1570(), 172, C0379.f650 ^ 315, 2704));
                int i18 = 48891;
                while (true) {
                    i18 ^= 48908;
                    switch (i18) {
                        case 22:
                            break;
                        case 53:
                            int i19 = 49790;
                            while (true) {
                                i19 ^= 49807;
                                switch (i19) {
                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        return 2419200000L;
                                    case 241:
                                        i19 = 49821;
                                        break;
                                }
                            }
                            break;
                        case 503:
                            i18 = !zM324 ? 49635 : 48953;
                            break;
                        case 32495:
                            int i20 = 49666;
                            while (true) {
                                i20 ^= 49683;
                                switch (i20) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                return 0L;
            case 1314132820:
                boolean zM325 = C0016.m321(str, C0342.m6715(m1570(), 162, C0422.f693 ^ (-817), 2591));
                int i21 = 1740;
                while (true) {
                    i21 ^= 1757;
                    switch (i21) {
                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i21 = !zM325 ? 1833 : 1802;
                            break;
                        case 54:
                            break;
                        case 471:
                            int i22 = 48767;
                            while (true) {
                                i22 ^= 48784;
                                switch (i22) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        return 1296000000L;
                                    case 239:
                                        i22 = 48798;
                                        break;
                                }
                            }
                            break;
                        case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                            int i23 = 1864;
                            while (true) {
                                i23 ^= 1881;
                                switch (i23) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                return 0L;
            default:
                int i24 = 1616;
                while (true) {
                    i24 ^= 1633;
                    switch (i24) {
                        case Code.UNAVAILABLE /* 14 */:
                            return 0L;
                        case 49:
                            i24 = 1647;
                            continue;
                        default:
                            continue;
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m1570() {
        int iM5997 = C0310.m5997();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5997 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f106short;
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

    /* JADX WARN: Code duplicated, block: B:134:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x011b A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x009d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x00cf. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x0100. Please report as an issue. */
    public final void e() {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12 = false;
        Application applicationM5540 = C0287.m5540(this);
        Application applicationM5541 = C0287.m5540(this);
        try {
            int iM1696 = C0078.m1696(C0152.m2915(applicationM5541), C0215.m4105(m1570(), 188, C0328.f476 ^ 754, 3238), 0);
            int i11 = 1616;
            while (true) {
                i11 ^= 1633;
                switch (i11) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i11 = iM1696 != 1 ? 1709 : 1678;
                        break;
                    case 239:
                        String strM7415 = C0378.m7415(C0152.m2915(applicationM5541), C0166.m3169(m1570(), 209, C0117.f143 ^ 929, 3245));
                        int i12 = 1864;
                        while (true) {
                            i12 ^= 1881;
                            switch (i12) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = strM7415 == null ? 48736 : 48705;
                                    break;
                                case 47384:
                                    ComponentName componentName = new ComponentName(applicationM5541, (Class<?>) RideAcceptorService.class);
                                    String strM7738 = C0395.m7738(componentName);
                                    C0335.m6501(strM7738, C0442.m8629(m1570(), 239, C0312.f460 ^ (-460), 1039));
                                    boolean zM2645 = C0137.m2645(strM7415, strM7738, false);
                                    int i13 = 48891;
                                    while (true) {
                                        i13 ^= 48908;
                                        switch (i13) {
                                            case 22:
                                                break;
                                            case 53:
                                                z10 = true;
                                                break;
                                            case 503:
                                                i13 = !zM2645 ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                String strM7784 = C0397.m7784(componentName);
                                                C0335.m6501(strM7784, C0106.m2056(m1570(), 259, C0079.f113 ^ (-563), 2713));
                                                boolean zM2646 = C0137.m2645(strM7415, strM7784, false);
                                                int i14 = 49666;
                                                while (true) {
                                                    i14 ^= 49683;
                                                    switch (i14) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i14 = zM2646 ? 49759 : 49728;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 76:
                                                            z10 = true;
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
                    case 204:
                        int i16 = 1740;
                        while (true) {
                            i16 ^= 1757;
                            switch (i16) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i16 = 1771;
                                    continue;
                                case 54:
                                    z10 = false;
                                    break;
                                default:
                                    continue;
                            }
                        }
                        break;
                    default:
                        break;
                }
                C0227.m4382(C0251.m4815(this), C0009.m192(z10));
                C0227.m4382(C0288.m5559(this), C0009.m192(C0212.m4066(applicationM5540)));
                try {
                    boolean zM6316 = C0326.m6316();
                    int i17 = 49790;
                    while (true) {
                        i17 ^= 49807;
                        switch (i17) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 51:
                                int iM2521 = C0131.m2521();
                                int i18 = 50689;
                                while (true) {
                                    i18 ^= 50706;
                                    switch (i18) {
                                        case 19:
                                            i18 = iM2521 == 0 ? 50782 : 50751;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i10 = 49914;
                                            while (true) {
                                                i10 ^= 49931;
                                                switch (i10) {
                                                    case 497:
                                                        i10 = 50596;
                                                        continue;
                                                        continue;
                                                    case 1711:
                                                        z11 = false;
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                }
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            z11 = true;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 84:
                                i10 = 49914;
                                while (true) {
                                    i10 ^= 49931;
                                    switch (i10) {
                                        case 497:
                                            i10 = 50596;
                                            continue;
                                            continue;
                                        case 1711:
                                            z11 = false;
                                            break;
                                        default:
                                            continue;
                                            continue;
                                    }
                                }
                                break;
                            case 241:
                                i17 = !zM6316 ? 49883 : 49852;
                                break;
                            default:
                                break;
                        }
                        C0227.m4382(C0445.m8684(this), C0009.m192(z11));
                        PowerManager powerManager = (PowerManager) C0401.m7876(applicationM5540, PowerManager.class);
                        int i19 = 50813;
                        while (true) {
                            i19 ^= 50830;
                            switch (i19) {
                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case 53:
                                    break;
                                case 243:
                                    i19 = powerManager != null ? 51557 : 50875;
                                    break;
                                case 4075:
                                    boolean zM1977 = C0101.m1977(powerManager, C0445.m8680(applicationM5540));
                                    int i20 = 51588;
                                    while (true) {
                                        i20 ^= 51605;
                                        switch (i20) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i20 = zM1977 ? 51681 : 51650;
                                                break;
                                            case 54:
                                                break;
                                            case 87:
                                                break;
                                            case 116:
                                                z12 = true;
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
                        C0227.m4382(C0373.m7317(this), C0009.m192(z12));
                        int iM3905 = C0204.m3905();
                        int i21 = 51712;
                        while (true) {
                            i21 ^= 51729;
                            switch (i21) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    if (iM3905 >= 0) {
                                        i21 = 51805;
                                    }
                                    break;
                                case 47:
                                    return;
                                case 76:
                                    System.out.println(Long.valueOf(C0008.m162("7zNJBuC")));
                                    return;
                                default:
                                    continue;
                            }
                            i21 = 51774;
                        }
                    }
                } catch (Exception e4) {
                    int i22 = 52611;
                    while (true) {
                        i22 ^= 52628;
                        switch (i22) {
                            case 23:
                                i22 = 52642;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                }
            }
        } catch (Exception e10) {
            int i23 = 51836;
            while (true) {
                i23 ^= 51853;
                switch (i23) {
                    case 241:
                        i23 = 52518;
                        continue;
                    case 1963:
                        break;
                    default:
                        continue;
                }
            }
        }
    }

    public final void f() {
        C0383.m7508(C0113.m2178(this), null, 0, new o(this, null), C0341.f612 ^ (-754));
        int iM6144 = C0317.m6144();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6144 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0429.m8423("ZA4Mu9")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final float g() {
        float fM9395 = 0.0f;
        String str = "\u06e6\u06e2\u06e6";
        short[] sArrM1570 = null;
        String strM6675 = null;
        b bVarM7699 = null;
        d dVarM5385 = null;
        SharedPreferences sharedPreferencesM8270 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56351:
                    str = "\u06e3\u06e4\u06e5";
                    sharedPreferencesM8270 = C0421.m8270(bVarM7699);
                    break;
                case 56476:
                    str = "\u06e4\u06e1\u06e2";
                    fM9395 = C0482.m9395(sharedPreferencesM8270, strM6675, 100.0f);
                    break;
                case 1746723:
                    str = "\u06e4\u06e6\u06e4";
                    i11 = i10 ^ 115;
                    break;
                case 1747682:
                    str = "\u06e1\u06e0";
                    bVarM7699 = C0393.m7699(dVarM5385);
                    break;
                case 1750598:
                    i10 = C0471.f742;
                    str = "\u06df\u06e0\u06e4";
                    break;
                case 1750692:
                    sArrM1570 = m1570();
                    str = "\u06e3\u06e1\u06e4";
                    break;
                case 1751557:
                    return fM9395;
                case 1751714:
                    str = "\u06e5\u06e1";
                    strM6675 = C0340.m6675(sArrM1570, 284, i11, 1454);
                    break;
                default:
                    str = "\u06e0\u06e0\u06e2";
                    dVarM5385 = C0278.m5385(this);
                    break;
            }
        }
    }

    public final float h() {
        float fM9395 = 0.0f;
        String str = "\u06e5\u06e6\u06e4";
        d dVarM5385 = null;
        b bVarM7699 = null;
        SharedPreferences sharedPreferencesM8270 = null;
        String strM4014 = null;
        short[] sArrM1570 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746882:
                    str = "\u06e5\u06e1\u06e7";
                    i11 = i10 ^ 75;
                    break;
                case 1746905:
                    str = "\u06e7\u06e3\u06e1";
                    bVarM7699 = C0393.m7699(dVarM5385);
                    break;
                case 1748733:
                    str = "\u06e4\u06e5\u06e6";
                    fM9395 = C0482.m9395(sharedPreferencesM8270, strM4014, 50.0f);
                    break;
                case 1751685:
                    return fM9395;
                case 1752492:
                    i10 = C0419.f690;
                    str = "\u06df\u06e5\u06e8";
                    break;
                case 1752675:
                    dVarM5385 = C0278.m5385(this);
                    str = "\u06df\u06e6\u06e0";
                    break;
                case 1754500:
                    str = "\u06e5\u06e0\u06e7";
                    sArrM1570 = m1570();
                    break;
                case 1754501:
                    str = "\u06e7\u06e3\u06e0";
                    sharedPreferencesM8270 = C0421.m8270(bVarM7699);
                    break;
                default:
                    str = "\u06e1\u06e3\u06df";
                    strM4014 = C0209.m4014(sArrM1570, 299, i11, 2272);
                    break;
            }
        }
    }

    public final float i() {
        String str = "\u06e0\u06e4\u06e0";
        d dVarM5385 = null;
        b bVarM7699 = null;
        SharedPreferences sharedPreferencesM8270 = null;
        String strM257 = null;
        short[] sArrM1570 = null;
        int i10 = 0;
        int i11 = 0;
        float fM9395 = 0.0f;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746848:
                    str = "\u06e4\u06e2\u06e4";
                    i11 = C0106.f132;
                    break;
                case 1747804:
                    dVarM5385 = C0278.m5385(this);
                    str = "\u06e3\u06e3\u06e6";
                    break;
                case 1748613:
                    str = "\u06df\u06e4\u06e5";
                    sArrM1570 = m1570();
                    break;
                case 1749668:
                    str = "\u06e1\u06df\u06e3";
                    sharedPreferencesM8270 = C0421.m8270(bVarM7699);
                    break;
                case 1750660:
                    str = "\u06e5\u06df\u06e3";
                    fM9395 = C0482.m9395(sharedPreferencesM8270, strM257, 0.0f);
                    break;
                case 1750662:
                    str = "\u06e2\u06e2\u06e4";
                    bVarM7699 = C0393.m7699(dVarM5385);
                    break;
                case 1751590:
                    i10 = i11 ^ (-229);
                    str = "\u06e1\u06e8\u06e1";
                    break;
                case 1752457:
                    return fM9395;
                default:
                    str = "\u06e3\u06e3\u06e4";
                    strM257 = C0013.m257(sArrM1570, 316, i10, 419);
                    break;
            }
        }
    }

    public final float j() {
        String str = "\u06e6\u06e4\u06e1";
        d dVarM5385 = null;
        b bVarM7699 = null;
        String strM6770 = null;
        short[] sArrM1570 = null;
        SharedPreferences sharedPreferencesM8270 = null;
        int i10 = 0;
        int i11 = 0;
        float fM9395 = 0.0f;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56292:
                    str = "\u06e1\u06e2\u06e6";
                    fM9395 = C0482.m9395(sharedPreferencesM8270, strM6770, 0.0f);
                    break;
                case 1746691:
                    i10 = i11 ^ 592;
                    str = "\u06e2\u06e0\u06e8";
                    break;
                case 1748709:
                    return fM9395;
                case 1749853:
                    str = "\u06e8\u06e1\u06e6";
                    sArrM1570 = m1570();
                    break;
                case 1753479:
                    str = "\u06e2\u06e8\u06e3";
                    sharedPreferencesM8270 = C0421.m8270(bVarM7699);
                    break;
                case 1753510:
                    str = "\u06e6\u06e1\u06e2";
                    bVarM7699 = C0393.m7699(dVarM5385);
                    break;
                case 1753571:
                    dVarM5385 = C0278.m5385(this);
                    str = "\u06e6\u06e2\u06e2";
                    break;
                case 1755405:
                    str = "\u06df\u06df\u06e3";
                    i11 = C0392.f663;
                    break;
                default:
                    str = "\u06df\u06e3";
                    strM6770 = C0346.m6770(sArrM1570, 331, i10, 1336);
                    break;
            }
        }
    }

    public final int l(String str) {
        AppConfig appConfig = (AppConfig) C0246.m4716(C0318.m6172(C0266.m5081(this)));
        switch (C0429.m8418(str)) {
            case 67452:
                boolean zM321 = C0016.m321(str, C0425.m8346(m1570(), 371, C0193.f217 ^ 207, 490));
                int i10 = 52611;
                while (true) {
                    i10 ^= 52628;
                    switch (i10) {
                        case 23:
                            i10 = zM321 ? 52704 : 52673;
                            break;
                        case 54:
                            break;
                        case 85:
                            break;
                        case 116:
                            int iM3512 = C0183.m3512(appConfig);
                            int i11 = 52735;
                            while (true) {
                                i11 ^= 52752;
                                switch (i11) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        return iM3512;
                                    case 1007:
                                        i11 = 52766;
                                        break;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                }
                return 0;
            case 2660340:
                boolean zM322 = C0016.m321(str, C0256.m4907(m1570(), 367, C0335.f519 ^ 317, 1228));
                int i12 = 51588;
                while (true) {
                    i12 ^= 51605;
                    switch (i12) {
                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i12 = !zM322 ? 51681 : 51650;
                            break;
                        case 54:
                            break;
                        case 87:
                            int iM600 = C0031.m600(appConfig);
                            int i13 = 51836;
                            while (true) {
                                i13 ^= 51853;
                                switch (i13) {
                                    case 241:
                                        i13 = 52518;
                                        break;
                                    case 1963:
                                        return iM600;
                                }
                            }
                            break;
                        case 116:
                            int i14 = 51712;
                            while (true) {
                                i14 ^= 51729;
                                switch (i14) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case 15:
                                    case Code.UNAUTHENTICATED /* 16 */:
                                    default:
                                        continue;
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i14 = 51743;
                                        continue;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                }
                return 0;
            case 2719805:
                boolean zM323 = C0016.m321(str, C0122.m2349(m1570(), 363, C0293.f441 ^ (-951), 1554));
                int i15 = 49914;
                while (true) {
                    i15 ^= 49931;
                    switch (i15) {
                        case 497:
                            i15 = !zM323 ? 50658 : 50627;
                            break;
                        case 1711:
                            break;
                        case 1736:
                            int iM7409 = C0378.m7409(appConfig);
                            int i16 = 50813;
                            while (true) {
                                i16 ^= 50830;
                                switch (i16) {
                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        return iM7409;
                                    case 243:
                                        i16 = 50844;
                                        break;
                                }
                            }
                            break;
                        case 1769:
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
                return 0;
            case 73542240:
                boolean zM324 = C0016.m321(str, C0211.m4036(m1570(), 358, C0459.f730 ^ 765, 2794));
                int i18 = 48891;
                while (true) {
                    i18 ^= 48908;
                    switch (i18) {
                        case 22:
                            break;
                        case 53:
                            int iM7910 = C0403.m7910(appConfig);
                            int i19 = 49790;
                            while (true) {
                                i19 ^= 49807;
                                switch (i19) {
                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        return iM7910;
                                    case 241:
                                        i19 = 49821;
                                        break;
                                }
                            }
                            break;
                        case 503:
                            i18 = !zM324 ? 49635 : 48953;
                            break;
                        case 32495:
                            int i20 = 49666;
                            while (true) {
                                i20 ^= 49683;
                                switch (i20) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                return 0;
            case 1314132820:
                boolean zM325 = C0016.m321(str, C0278.m5391(m1570(), 348, C0243.f323 ^ 122, 1928));
                int i21 = 1740;
                while (true) {
                    i21 ^= 1757;
                    switch (i21) {
                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i21 = !zM325 ? 1833 : 1802;
                            break;
                        case 54:
                            break;
                        case 471:
                            int iM2535 = C0131.m2535(appConfig);
                            int i22 = 48767;
                            while (true) {
                                i22 ^= 48784;
                                switch (i22) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        return iM2535;
                                    case 239:
                                        i22 = 48798;
                                        break;
                                }
                            }
                            break;
                        case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                            int i23 = 1864;
                            while (true) {
                                i23 ^= 1881;
                                switch (i23) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                return 0;
            default:
                int i24 = 1616;
                while (true) {
                    i24 ^= 1633;
                    switch (i24) {
                        case Code.UNAVAILABLE /* 14 */:
                            return 0;
                        case 49:
                            i24 = 1647;
                            continue;
                        default:
                            continue;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0021, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x009c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0029. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f m() {
        g gVarM8699 = C0446.m8699(this);
        C0014.m280(gVarM8699);
        long jM7869 = C0401.m7869();
        long j10 = (-86400332) ^ C0186.f210;
        List listM1659 = C0077.m1659(gVarM8699);
        ArrayList arrayList = new ArrayList();
        Iterator itM8318 = C0424.m8318(listM1659);
        while (true) {
            boolean zM3327 = C0174.m3327(itM8318);
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
                Integer numM1083 = C0057.m1083(C0241.m4637(arrayList));
                Iterator itM7155 = C0364.m7155(arrayList);
                int iM4908 = 0;
                while (true) {
                    boolean zM3328 = C0174.m3327(itM7155);
                    int i11 = 48891;
                    while (true) {
                        i11 ^= 48908;
                        switch (i11) {
                            case 22:
                                break;
                            case 53:
                                break;
                            case 503:
                                i11 = zM3328 ? 49635 : 48953;
                                break;
                            case 32495:
                                break;
                            default:
                                break;
                        }
                        return new f(numM1083, C0057.m1083(iM4908));
                    }
                    iM4908 = (C0256.m4908((z4.f) C0413.m8115(itM7155)) + (iM4908 + 28)) - 28;
                    int i12 = 49666;
                    while (true) {
                        i12 ^= 49683;
                        switch (i12) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = 49697;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                        }
                    }
                }
            }
            Object objM8115 = C0413.m8115(itM8318);
            z4.f fVar = (z4.f) objM8115;
            long jM3974 = C0208.m3974(fVar);
            int i13 = 1740;
            while (true) {
                i13 ^= 1757;
                switch (i13) {
                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i13 = jM3974 >= ((jM7869 - 24) - (jM7869 % j10)) + 24 ? 1833 : 1802;
                        break;
                    case 54:
                        break;
                    case 471:
                        break;
                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                        boolean zM5266 = C0273.m5266(fVar);
                        int i14 = 1864;
                        while (true) {
                            i14 ^= 1881;
                            switch (i14) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i14 = zM5266 ? 48736 : 48705;
                                    break;
                                case 47384:
                                    break;
                                case 47417:
                                    C0357.m6998(arrayList, objM8115);
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
        }
    }

    public final boolean n() {
        ConnectivityManager connectivityManager = (ConnectivityManager) C0401.m7876(C0287.m5540(this), ConnectivityManager.class);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (connectivityManager == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return false;
                case 239:
                    Network networkM9228 = C0473.m9228(connectivityManager);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (networkM9228 == null) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                NetworkCapabilities networkCapabilitiesM7525 = C0384.m7525(connectivityManager, networkM9228);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (networkCapabilitiesM7525 == null) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            return C0025.m501(networkCapabilitiesM7525, C0251.f331 ^ 597);
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

    public final void o() {
        String strM5791 = C0300.m5791(C0380.m7458(this));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (strM5791 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return;
                case 239:
                    C0383.m7508(C0113.m2178(this), null, 0, new f5.q(this, strM5791, null), C0107.f133 ^ (-725));
                    int iM508 = C0026.m508();
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM508 <= 0) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                System.out.println(Long.decode(C0310.m6002("PduNmMPGpwsdm")));
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

    public final void p() {
        boolean z10;
        boolean z11 = true;
        AppConfig appConfig = (AppConfig) C0246.m4716(C0318.m6172(C0266.m5081(this)));
        int iM3734 = C0195.m3734(appConfig);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM3734 > 6 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                continue;
                            case 54:
                                z10 = true;
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    z10 = false;
                    break;
                default:
                    break;
            }
        }
        boolean zM2099 = C0108.m2099(C0236.m4555(appConfig), C0057.m1083(6));
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i12 = zM2099 ? 48736 : 48705;
                    break;
                case 47384:
                    z11 = z10;
                    break;
                case 47417:
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
        int iM3735 = C0195.m3734(appConfig);
        int i14 = 48891;
        while (true) {
            i14 ^= 48908;
            switch (i14) {
                case 22:
                    break;
                case 53:
                    int i15 = 49790;
                    while (true) {
                        i15 ^= 49807;
                        switch (i15) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 51:
                                break;
                            case 84:
                                C0227.m4382(C0397.m7783(this), C0334.m6483());
                                C0227.m4382(C0380.m7468(this), C0116.m2248(appConfig));
                                C0227.m4382(C0441.m8615(this), C0220.m4254(appConfig));
                                C0227.m4382(C0473.m9230(this), C0248.m4750(appConfig));
                                C0227.m4382(C0079.m1712(this), C0009.m192(C0138.m2671(appConfig)));
                                break;
                            case 241:
                                i15 = z11 ? 49883 : 49852;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 503:
                    i14 = iM3735 > 6 ? 49635 : 48953;
                    break;
                case 32495:
                    int i16 = 49666;
                    while (true) {
                        i16 ^= 49683;
                        switch (i16) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i16 = 49697;
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            default:
                                continue;
                        }
                        C0227.m4382(C0397.m7783(this), C0334.m6483());
                        C0227.m4382(C0380.m7468(this), C0116.m2248(appConfig));
                        C0227.m4382(C0441.m8615(this), C0220.m4254(appConfig));
                        C0227.m4382(C0473.m9230(this), C0248.m4750(appConfig));
                        C0227.m4382(C0079.m1712(this), C0009.m192(C0138.m2671(appConfig)));
                        break;
                    }
                    break;
                default:
                    break;
            }
        }
        int iM2511 = C0130.m2511();
        int i17 = 49914;
        while (true) {
            i17 ^= 49931;
            switch (i17) {
                case 497:
                    if (iM2511 <= 0) {
                        i17 = 50658;
                    }
                    break;
                case 1711:
                    break;
                case 1736:
                    return;
                case 1769:
                    System.out.println(Float.decode(C0415.m8165("52GRtN")));
                    return;
                default:
                    continue;
            }
            i17 = 50627;
        }
    }

    public final void q() {
        String strM5791 = C0300.m5791(C0380.m7458(this));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (strM5791 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int iM1332 = C0069.m1332();
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM1332 >= 0) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                System.out.println(Float.valueOf(C0121.m2341("0IsDb")));
                                return;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    q0 q0VarM4345 = C0225.m4345(this);
                    boolean z10 = C0246.m4716(q0VarM4345) instanceof f5.f;
                    int i12 = 1864;
                    while (true) {
                        i12 ^= 1881;
                        switch (i12) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!z10) {
                                    i12 = 48736;
                                }
                                break;
                            case 47384:
                                return;
                            case 47417:
                                boolean z11 = C0246.m4716(q0VarM4345) instanceof f5.d;
                                int i13 = 48767;
                                while (true) {
                                    i13 ^= 48784;
                                    switch (i13) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            C0383.m7508(C0113.m2178(this), null, 0, new u(this, strM5791, null), C0003.f881 ^ (-864));
                                            return;
                                        case 76:
                                            int i14 = 48891;
                                            while (true) {
                                                i14 ^= 48908;
                                                switch (i14) {
                                                    case 22:
                                                        return;
                                                    case 503:
                                                        i14 = 48922;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 239:
                                            if (z11) {
                                                i13 = 48860;
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i13 = 48829;
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
            i10 = 1678;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:339:0x0520 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x031c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x03d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:0x045e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x0464 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0468 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:0x04ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x0464 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x0460 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x0456 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:0x0474 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:0x04aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x046c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:570:0x04d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x04df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:0x04e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x0502 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:0x04df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:0x04db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x04d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:580:0x04ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:0x04f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:0x04e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x052f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x0535 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x0539 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x055c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x0535 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x0531 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:0x0527 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x0544 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:0x0558 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x0593 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x0599 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x059c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x0595 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x054c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x05a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:0x05ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x05b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x05ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x05a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:0x059f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:0x0544 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:0x056b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:0x0571 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:0x0575 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:0x0571 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:0x056d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:0x0563 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x0580 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x058f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:0x0578 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x041f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x0425 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x0429 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x0425 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:0x0421 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:0x0417 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:0x0398 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:710:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:106:0x02e2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:113:0x02fe. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:126:0x0371. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:144:0x03b8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:157:0x0402. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:175:0x0445. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:194:0x04a0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:203:0x04c0. Please report as an issue. */
    public final void r(boolean z10) {
        Iterator itM8318;
        boolean zM3327;
        int i10;
        boolean z11;
        Iterator itM8319;
        boolean zM3328;
        int i11;
        boolean z12;
        boolean z13;
        boolean z14;
        ArrayList arrayList;
        int i12;
        int i13;
        boolean zM6316;
        int i14;
        int iM2521;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int iM1322;
        int i24;
        q0 q0VarM7430 = C0379.m7430(this);
        int i25 = 1616;
        while (true) {
            i25 ^= 1633;
            switch (i25) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i25 = z10 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM2600 = C0135.m2600(this);
                    int i26 = 1740;
                    while (true) {
                        i26 ^= 1757;
                        switch (i26) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i26 = !zM2600 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0227.m4382(q0VarM7430, C0364.m7140(m1570(), 374, C0181.f205 ^ (-955), 2949));
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
        int i27 = 1864;
        while (true) {
            i27 ^= 1881;
            switch (i27) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i27 = z10 ? 48736 : 48705;
                    break;
                case 47384:
                    break;
                case 47417:
                    boolean zM14 = C0000.m14((Boolean) C0246.m4716(C0107.m2079(this)));
                    int i28 = 48767;
                    while (true) {
                        i28 ^= 48784;
                        switch (i28) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                C0227.m4382(q0VarM7430, C0301.m5796(m1570(), 424, C0038.f58 ^ (-237), 1071));
                                iM1322 = C0068.m1322();
                                i24 = 49790;
                                while (true) {
                                    i24 ^= 49807;
                                    switch (i24) {
                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 51:
                                            break;
                                        case 84:
                                            System.out.println(Long.parseLong(C0063.m1223("GBgWyLCam4Z")));
                                            break;
                                        case 241:
                                            if (iM1322 <= 0) {
                                                i24 = 49883;
                                            }
                                            break;
                                        default:
                                            continue;
                                            continue;
                                    }
                                    i24 = 49852;
                                }
                                break;
                            case 76:
                                long jM3863 = C0201.m3863((Number) C0246.m4716(C0200.m3835(this)));
                                long jM7869 = C0401.m7869();
                                int i29 = 48891;
                                while (true) {
                                    i29 ^= 48908;
                                    switch (i29) {
                                        case 22:
                                            break;
                                        case 53:
                                            C0227.m4382(q0VarM7430, C0301.m5796(m1570(), 424, C0038.f58 ^ (-237), 1071));
                                            iM1322 = C0068.m1322();
                                            i24 = 49790;
                                            while (true) {
                                                i24 ^= 49807;
                                                switch (i24) {
                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        break;
                                                    case 84:
                                                        System.out.println(Long.parseLong(C0063.m1223("GBgWyLCam4Z")));
                                                        break;
                                                    case 241:
                                                        if (iM1322 <= 0) {
                                                            i24 = 49883;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                }
                                                i24 = 49852;
                                            }
                                            break;
                                        case 503:
                                            i29 = jM3863 > jM7869 ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            int i30 = 49666;
                                            while (true) {
                                                i30 ^= 49683;
                                                switch (i30) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i30 = 49697;
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
                                i28 = zM14 ? 48860 : 48829;
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
            return;
        }
        int i31 = 49914;
        while (true) {
            i31 ^= 49931;
            switch (i31) {
                case 497:
                    i31 = z10 ? 50658 : 50627;
                    break;
                case 1711:
                    break;
                case 1736:
                    break;
                case 1769:
                    boolean zM15 = C0000.m14((Boolean) C0246.m4716(C0251.m4815(this)));
                    int i32 = 50689;
                    while (true) {
                        i32 ^= 50706;
                        switch (i32) {
                            case 19:
                                i32 = !zM15 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                C0227.m4382(q0VarM7430, C0477.m9304(m1570(), 476, C0170.f194 ^ (-185), 879));
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
        d dVarM5385 = C0278.m5385(this);
        int i33 = 50813;
        while (true) {
            i33 ^= 50830;
            switch (i33) {
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 53:
                    break;
                case 243:
                    i33 = z10 ? 51557 : 50875;
                    break;
                case 4075:
                    PackageManager packageManagerM8279 = C0421.m8279(C0287.m5540(this));
                    String strM8486 = C0433.m8486(m1570(), 520, C0183.f207 ^ (-867), 1343);
                    String strM565 = C0029.m565(m1570(), 541, C0067.f87 ^ (-822), 2988);
                    String strM4786 = C0250.m4786(m1570(), 559, C0264.f344 ^ 559, 2959);
                    String strM7185 = C0366.m7185(m1570(), 575, C0007.f27 ^ (-437), 3213);
                    String strM9575 = C0492.m9575(m1570(), 595, C0148.f173 ^ (-231), 2366);
                    String strM114 = C0006.m114(m1570(), 618, C0461.f732 ^ 838, 1475);
                    String strM9331 = C0478.m9331(m1570(), 645, C0456.f727 ^ 726, 347);
                    String strM1981 = C0101.m1981(m1570(), 665, C0323.f471 ^ (-961), 1249);
                    String strM5623 = C0292.m5623(m1570(), 686, C0005.f1063 ^ 539, 3201);
                    String[] strArr = new String[9];
                    strArr[C0320.f468 ^ (-806)] = strM8486;
                    strArr[C0189.f213 ^ (-735)] = strM565;
                    strArr[C0385.f656 ^ (-13)] = strM4786;
                    strArr[C0348.f619 ^ 982] = strM7185;
                    strArr[C0024.f44 ^ 531] = strM9575;
                    strArr[C0347.f618 ^ 389] = strM114;
                    strArr[C0035.f55 ^ (-710)] = strM9331;
                    strArr[C0289.f434 ^ (-216)] = strM1981;
                    strArr[C0070.f90 ^ 757] = strM5623;
                    List listM7965 = C0405.m7965(strArr);
                    boolean z15 = listM7965 instanceof Collection;
                    int i34 = 51588;
                    while (true) {
                        i34 ^= 51605;
                        switch (i34) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i34 = z15 ? 51681 : 51650;
                                break;
                            case 54:
                                break;
                            case 87:
                                break;
                            case 116:
                                boolean zM9582 = C0492.m9582(listM7965);
                                int i35 = 51712;
                                while (true) {
                                    i35 ^= 51729;
                                    switch (i35) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i35 = zM9582 ? 51805 : 51774;
                                            break;
                                        case 47:
                                            break;
                                        case 76:
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
                                                C0227.m4382(q0VarM7430, C0270.m5178(m1570(), 934, C0323.f471 ^ (-959), 2204));
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
                    Iterator itM83110 = C0424.m8318(listM7965);
                    while (true) {
                        boolean zM3329 = C0174.m3327(itM83110);
                        int i37 = 52611;
                        while (true) {
                            i37 ^= 52628;
                            switch (i37) {
                                case 23:
                                    i37 = zM3329 ? 52704 : 52673;
                                    break;
                                case 54:
                                    break;
                                case 85:
                                    C0227.m4382(q0VarM7430, C0270.m5178(m1570(), 934, C0323.f471 ^ (-959), 2204));
                                    break;
                                case 116:
                                    break;
                                default:
                                    break;
                            }
                        }
                        try {
                            C0290.m5588(packageManagerM8279, (String) C0413.m8115(itM83110), 0);
                            String strM4341 = C0225.m4341(m1570(), 705, C0429.f700 ^ 348, 2472);
                            String strM9332 = C0478.m9331(m1570(), 725, C0136.f162 ^ (-324), 2895);
                            String strM3702 = C0193.m3702(m1570(), 746, C0271.f387 ^ (-816), 2935);
                            String[] strArr2 = new String[3];
                            strArr2[C0404.f675 ^ 806] = strM9332;
                            strArr2[C0340.f611 ^ (-261)] = strM3702;
                            strArr2[C0008.f28 ^ (-6)] = strM4341;
                            List listM7966 = C0405.m7965(strArr2);
                            boolean z16 = listM7966 instanceof Collection;
                            int i38 = 52735;
                            while (true) {
                                i38 ^= 52752;
                                switch (i38) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        itM8318 = C0424.m8318(listM7966);
                                        while (true) {
                                            zM3327 = C0174.m3327(itM8318);
                                            i10 = 53758;
                                            while (true) {
                                                i10 ^= 53775;
                                                switch (i10) {
                                                    case 1009:
                                                        i10 = zM3327 ? 54502 : 54471;
                                                        break;
                                                    case 1703:
                                                        break;
                                                    case 1736:
                                                        i23 = 53634;
                                                        while (true) {
                                                            i23 ^= 53651;
                                                            switch (i23) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i23 = 53665;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    z11 = false;
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 1769:
                                                        try {
                                                            C0290.m5588(packageManagerM8279, (String) C0413.m8115(itM8318), 0);
                                                            z11 = true;
                                                            break;
                                                        } catch (Exception e4) {
                                                            int i39 = 1513517;
                                                            while (true) {
                                                                i39 ^= 1513534;
                                                                switch (i39) {
                                                                    case 19:
                                                                        i39 = 1514199;
                                                                        break;
                                                                    case 745:
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
                                    case 1007:
                                        i38 = z16 ? 53479 : 52797;
                                        break;
                                    case 7927:
                                        boolean zM9583 = C0492.m9582(listM7966);
                                        int i40 = 53510;
                                        while (true) {
                                            i40 ^= 53527;
                                            switch (i40) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i40 = zM9583 ? 53603 : 53572;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 83:
                                                    itM8318 = C0424.m8318(listM7966);
                                                    while (true) {
                                                        zM3327 = C0174.m3327(itM8318);
                                                        i10 = 53758;
                                                        while (true) {
                                                            i10 ^= 53775;
                                                            switch (i10) {
                                                                case 1009:
                                                                    if (zM3327) {
                                                                    }
                                                                    break;
                                                                case 1703:
                                                                    break;
                                                                case 1736:
                                                                    i23 = 53634;
                                                                    while (true) {
                                                                        i23 ^= 53651;
                                                                        switch (i23) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i23 = 53665;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                z11 = false;
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1769:
                                                                    C0290.m5588(packageManagerM8279, (String) C0413.m8115(itM8318), 0);
                                                                    z11 = true;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 116:
                                                    i23 = 53634;
                                                    while (true) {
                                                        i23 ^= 53651;
                                                        switch (i23) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i23 = 53665;
                                                                continue;
                                                                continue;
                                                                continue;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                z11 = false;
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
                                    default:
                                        break;
                                }
                                String strM7218 = C0368.m7218(m1570(), 760, C0137.f163 ^ 113, 1297);
                                String strM8522 = C0436.m8522(m1570(), 779, C0240.f320 ^ 473, 3269);
                                String strM3074 = C0160.m3074(m1570(), 797, C0326.f474 ^ (-797), 3066);
                                String[] strArr3 = new String[3];
                                strArr3[C0206.f230 ^ 101] = strM8522;
                                strArr3[C0177.f201 ^ 470] = strM3074;
                                strArr3[C0371.f642 ^ (-936)] = strM7218;
                                List listM7967 = C0405.m7965(strArr3);
                                boolean z17 = listM7967 instanceof Collection;
                                int i41 = 54533;
                                while (true) {
                                    i41 ^= 54550;
                                    switch (i41) {
                                        case 19:
                                            i41 = z17 ? 54626 : 54595;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 85:
                                            itM8319 = C0424.m8318(listM7967);
                                            while (true) {
                                                zM3328 = C0174.m3327(itM8319);
                                                i11 = 55556;
                                                while (true) {
                                                    i11 ^= 55573;
                                                    switch (i11) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i11 = zM3328 ? 55649 : 55618;
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 87:
                                                            i22 = 55432;
                                                            while (true) {
                                                                i22 ^= 55449;
                                                                switch (i22) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i22 = 55463;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    case 62:
                                                                        z12 = false;
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        case 116:
                                                            try {
                                                                C0290.m5588(packageManagerM8279, (String) C0413.m8115(itM8319), 0);
                                                                z12 = true;
                                                                break;
                                                            } catch (Exception e10) {
                                                                int i42 = 1514292;
                                                                while (true) {
                                                                    i42 ^= 1514309;
                                                                    switch (i42) {
                                                                        case 22:
                                                                            break;
                                                                        case 113:
                                                                            i42 = 1514323;
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
                                        case 116:
                                            boolean zM9584 = C0492.m9582(listM7967);
                                            int i43 = 54657;
                                            while (true) {
                                                i43 ^= 54674;
                                                switch (i43) {
                                                    case 19:
                                                        i43 = zM9584 ? 55401 : 54719;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        itM8319 = C0424.m8318(listM7967);
                                                        while (true) {
                                                            zM3328 = C0174.m3327(itM8319);
                                                            i11 = 55556;
                                                            while (true) {
                                                                i11 ^= 55573;
                                                                switch (i11) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (zM3328) {
                                                                        }
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 87:
                                                                        i22 = 55432;
                                                                        while (true) {
                                                                            i22 ^= 55449;
                                                                            switch (i22) {
                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i22 = 55463;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case 62:
                                                                                    z12 = false;
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 116:
                                                                        C0290.m5588(packageManagerM8279, (String) C0413.m8115(itM8319), 0);
                                                                        z12 = true;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 3579:
                                                        i22 = 55432;
                                                        while (true) {
                                                            i22 ^= 55449;
                                                            switch (i22) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i22 = 55463;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                case 62:
                                                                    z12 = false;
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
                                        default:
                                            break;
                                    }
                                    Map map = (Map) C0469.m9145(C0022.m429(C0077.m1675(dVarM5385)));
                                    String strM4120 = C0216.m4120(m1570(), 808, C0086.f120 ^ (-780), 703);
                                    Boolean bool = (Boolean) C0487.m9501(map, strM4120);
                                    int i44 = 55680;
                                    while (true) {
                                        i44 ^= 55697;
                                        switch (i44) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i44 = bool != null ? 56424 : 56393;
                                                break;
                                            case 1467:
                                                break;
                                            case 1496:
                                                i20 = 56579;
                                                while (true) {
                                                    i20 ^= 56596;
                                                    switch (i20) {
                                                        case 23:
                                                            i20 = z11 ? 1507472 : 56641;
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 85:
                                                            z13 = false;
                                                            break;
                                                        case 1564036:
                                                            i21 = 1507503;
                                                            while (true) {
                                                                i21 ^= 1507520;
                                                                switch (i21) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        z13 = true;
                                                                        break;
                                                                    case 111:
                                                                        i21 = 1507534;
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
                                            case 1529:
                                                boolean zM16 = C0000.m14(bool);
                                                int i45 = 56455;
                                                while (true) {
                                                    i45 ^= 56472;
                                                    switch (i45) {
                                                        case 31:
                                                            i45 = zM16 ? 56548 : 56517;
                                                            break;
                                                        case 62:
                                                            break;
                                                        case 93:
                                                            z13 = false;
                                                            break;
                                                        case 124:
                                                            i20 = 56579;
                                                            while (true) {
                                                                i20 ^= 56596;
                                                                switch (i20) {
                                                                    case 23:
                                                                        if (z11) {
                                                                        }
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 85:
                                                                        z13 = false;
                                                                        break;
                                                                    case 1564036:
                                                                        i21 = 1507503;
                                                                        while (true) {
                                                                            i21 ^= 1507520;
                                                                            switch (i21) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    z13 = true;
                                                                                    break;
                                                                                case 111:
                                                                                    i21 = 1507534;
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
                                                break;
                                            default:
                                                break;
                                        }
                                        Map map2 = (Map) C0469.m9145(C0022.m429(C0077.m1675(dVarM5385)));
                                        String strM1982 = C0101.m1981(m1570(), 811, C0163.f187 ^ (-704), 1865);
                                        Boolean bool2 = (Boolean) C0487.m9501(map2, strM1982);
                                        int i46 = 1507627;
                                        while (true) {
                                            i46 ^= 1507644;
                                            switch (i46) {
                                                case 23:
                                                    i46 = bool2 != null ? 1507720 : 1507689;
                                                    break;
                                                case 85:
                                                    i18 = 1508526;
                                                    while (true) {
                                                        i18 ^= 1508543;
                                                        switch (i18) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i18 = z12 ? 1508619 : 1508588;
                                                                break;
                                                            case 83:
                                                                z14 = false;
                                                                break;
                                                            case 114:
                                                                break;
                                                            case 436:
                                                                i19 = 1508650;
                                                                while (true) {
                                                                    i19 ^= 1508667;
                                                                    switch (i19) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i19 = 1508681;
                                                                            continue;
                                                                            continue;
                                                                        case 114:
                                                                            z14 = true;
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
                                                case 118:
                                                    break;
                                                case 180:
                                                    boolean zM17 = C0000.m14(bool2);
                                                    int i47 = 1507751;
                                                    while (true) {
                                                        i47 ^= 1507768;
                                                        switch (i47) {
                                                            case 31:
                                                                i47 = zM17 ? 1508495 : 1508464;
                                                                break;
                                                            case 1335:
                                                                i18 = 1508526;
                                                                while (true) {
                                                                    i18 ^= 1508543;
                                                                    switch (i18) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (z12) {
                                                                            }
                                                                            break;
                                                                        case 83:
                                                                            z14 = false;
                                                                            break;
                                                                        case 114:
                                                                            break;
                                                                        case 436:
                                                                            i19 = 1508650;
                                                                            while (true) {
                                                                                i19 ^= 1508667;
                                                                                switch (i19) {
                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i19 = 1508681;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 114:
                                                                                        z14 = true;
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
                                                            case 1480:
                                                                z14 = false;
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
                                            int i48 = 1509425;
                                            while (true) {
                                                i48 ^= 1509442;
                                                switch (i48) {
                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        try {
                                                            zM6316 = C0326.m6316();
                                                            i14 = 1509673;
                                                            while (true) {
                                                                i14 ^= 1509690;
                                                                switch (i14) {
                                                                    case 19:
                                                                        i14 = !zM6316 ? 1510417 : 1510386;
                                                                        break;
                                                                    case 712:
                                                                        iM2521 = C0131.m2521();
                                                                        i15 = 1510572;
                                                                        while (true) {
                                                                            i15 ^= 1510589;
                                                                            switch (i15) {
                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i15 = iM2521 == 0 ? 1511316 : 1510634;
                                                                                    break;
                                                                                case 87:
                                                                                    arrayList = new ArrayList();
                                                                                    i12 = 1511471;
                                                                                    while (true) {
                                                                                        i12 ^= 1511488;
                                                                                        switch (i12) {
                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                break;
                                                                                            case 111:
                                                                                                i12 = z13 ? 1511564 : 1511533;
                                                                                                break;
                                                                                            case 204:
                                                                                                C0357.m6998(arrayList, strM4120);
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    i13 = 1511595;
                                                                                    while (true) {
                                                                                        i13 ^= 1511612;
                                                                                        switch (i13) {
                                                                                            case 23:
                                                                                                i13 = z14 ? 1512339 : 1512308;
                                                                                                break;
                                                                                            case 815:
                                                                                                C0357.m6998(arrayList, strM1982);
                                                                                                break;
                                                                                            case 968:
                                                                                                break;
                                                                                            case 1001:
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    C0227.m4382(q0VarM7430, C0451.m8805(C0465.m9067(arrayList, C0294.m5660(m1570(), 815, C0412.f683 ^ (-795), 379), null, null, null, C0254.f334 ^ (-1014)), C0379.m7435(m1570(), 818, C0209.f233 ^ 170, 1919)));
                                                                                    break;
                                                                                case 118:
                                                                                    break;
                                                                                case 809:
                                                                                    i16 = 1511347;
                                                                                    while (true) {
                                                                                        i16 ^= 1511364;
                                                                                        switch (i16) {
                                                                                            case 22:
                                                                                                break;
                                                                                            case 119:
                                                                                                i16 = 1511378;
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
                                                                    case 745:
                                                                        break;
                                                                    case 1323:
                                                                        i17 = 1510448;
                                                                        while (true) {
                                                                            i17 ^= 1510465;
                                                                            switch (i17) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case 113:
                                                                                    i17 = 1510479;
                                                                                    continue;
                                                                                    continue;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                            arrayList = new ArrayList();
                                                                            i12 = 1511471;
                                                                            while (true) {
                                                                                i12 ^= 1511488;
                                                                                switch (i12) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                        break;
                                                                                    case 111:
                                                                                        if (z13) {
                                                                                        }
                                                                                        break;
                                                                                    case 204:
                                                                                        C0357.m6998(arrayList, strM4120);
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i13 = 1511595;
                                                                            while (true) {
                                                                                i13 ^= 1511612;
                                                                                switch (i13) {
                                                                                    case 23:
                                                                                        if (z14) {
                                                                                        }
                                                                                        break;
                                                                                    case 815:
                                                                                        C0357.m6998(arrayList, strM1982);
                                                                                        break;
                                                                                    case 968:
                                                                                        break;
                                                                                    case 1001:
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            C0227.m4382(q0VarM7430, C0451.m8805(C0465.m9067(arrayList, C0294.m5660(m1570(), 815, C0412.f683 ^ (-795), 379), null, null, null, C0254.f334 ^ (-1014)), C0379.m7435(m1570(), 818, C0209.f233 ^ 170, 1919)));
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                        } catch (Exception e11) {
                                                            int i49 = 1514416;
                                                            while (true) {
                                                                i49 ^= 1514433;
                                                                switch (i49) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case 113:
                                                                        i49 = 1514447;
                                                                        continue;
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case 115:
                                                        i48 = !z13 ? 1509518 : 1509487;
                                                        break;
                                                    case 204:
                                                        int i50 = 1509549;
                                                        while (true) {
                                                            i50 ^= 1509566;
                                                            switch (i50) {
                                                                case 19:
                                                                    i50 = z14 ? 1509642 : 1509611;
                                                                    break;
                                                                case 85:
                                                                    break;
                                                                case 114:
                                                                    break;
                                                                case 436:
                                                                    zM6316 = C0326.m6316();
                                                                    i14 = 1509673;
                                                                    while (true) {
                                                                        i14 ^= 1509690;
                                                                        switch (i14) {
                                                                            case 19:
                                                                                if (!zM6316) {
                                                                                }
                                                                                break;
                                                                            case 712:
                                                                                iM2521 = C0131.m2521();
                                                                                i15 = 1510572;
                                                                                while (true) {
                                                                                    i15 ^= 1510589;
                                                                                    switch (i15) {
                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            if (iM2521 == 0) {
                                                                                            }
                                                                                            break;
                                                                                        case 87:
                                                                                            arrayList = new ArrayList();
                                                                                            i12 = 1511471;
                                                                                            while (true) {
                                                                                                i12 ^= 1511488;
                                                                                                switch (i12) {
                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                        break;
                                                                                                    case 111:
                                                                                                        if (z13) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 204:
                                                                                                        C0357.m6998(arrayList, strM4120);
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            i13 = 1511595;
                                                                                            while (true) {
                                                                                                i13 ^= 1511612;
                                                                                                switch (i13) {
                                                                                                    case 23:
                                                                                                        if (z14) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 815:
                                                                                                        C0357.m6998(arrayList, strM1982);
                                                                                                        break;
                                                                                                    case 968:
                                                                                                        break;
                                                                                                    case 1001:
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            C0227.m4382(q0VarM7430, C0451.m8805(C0465.m9067(arrayList, C0294.m5660(m1570(), 815, C0412.f683 ^ (-795), 379), null, null, null, C0254.f334 ^ (-1014)), C0379.m7435(m1570(), 818, C0209.f233 ^ 170, 1919)));
                                                                                            break;
                                                                                        case 118:
                                                                                            break;
                                                                                        case 809:
                                                                                            i16 = 1511347;
                                                                                            while (true) {
                                                                                                i16 ^= 1511364;
                                                                                                switch (i16) {
                                                                                                    case 22:
                                                                                                        break;
                                                                                                    case 119:
                                                                                                        i16 = 1511378;
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
                                                                            case 745:
                                                                                break;
                                                                            case 1323:
                                                                                i17 = 1510448;
                                                                                while (true) {
                                                                                    i17 ^= 1510465;
                                                                                    switch (i17) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case 113:
                                                                                            i17 = 1510479;
                                                                                            continue;
                                                                                            continue;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
                                                                                    }
                                                                                    arrayList = new ArrayList();
                                                                                    i12 = 1511471;
                                                                                    while (true) {
                                                                                        i12 ^= 1511488;
                                                                                        switch (i12) {
                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                break;
                                                                                            case 111:
                                                                                                if (z13) {
                                                                                                }
                                                                                                break;
                                                                                            case 204:
                                                                                                C0357.m6998(arrayList, strM4120);
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    i13 = 1511595;
                                                                                    while (true) {
                                                                                        i13 ^= 1511612;
                                                                                        switch (i13) {
                                                                                            case 23:
                                                                                                if (z14) {
                                                                                                }
                                                                                                break;
                                                                                            case 815:
                                                                                                C0357.m6998(arrayList, strM1982);
                                                                                                break;
                                                                                            case 968:
                                                                                                break;
                                                                                            case 1001:
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    C0227.m4382(q0VarM7430, C0451.m8805(C0465.m9067(arrayList, C0294.m5660(m1570(), 815, C0412.f683 ^ (-795), 379), null, null, null, C0254.f334 ^ (-1014)), C0379.m7435(m1570(), 818, C0209.f233 ^ 170, 1919)));
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
                                        }
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            int i51 = 1513393;
                            while (true) {
                                i51 ^= 1513410;
                                switch (i51) {
                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 115:
                                        i51 = 1513424;
                                        break;
                                }
                            }
                        }
                    }
                    break;
                default:
                    break;
            }
            return;
        }
        int i52 = 1512370;
        while (true) {
            i52 ^= 1512387;
            switch (i52) {
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    C0227.m4376(C0482.m9390(C0167.m3199(C0202.m3874(dVarM5385)), C0356.m6992(m1570(), 1041, C0028.f48 ^ 372, 1252), false));
                    try {
                        Application applicationM5540 = C0287.m5540(this);
                        C0102.m1989(applicationM5540, new Intent(applicationM5540, (Class<?>) KeepAliveService.class));
                        return;
                    } catch (Exception e13) {
                        int i53 = 1515191;
                        while (true) {
                            i53 ^= 1515208;
                            switch (i53) {
                                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                    return;
                                case 127:
                                    i53 = 1515222;
                                    break;
                            }
                        }
                    }
                    break;
                case 113:
                    if (z10) {
                        i52 = 1512463;
                    }
                    break;
                case 1996:
                    String strM5791 = C0300.m5791(C0380.m7458(this));
                    int i54 = 1512494;
                    while (true) {
                        i54 ^= 1512511;
                        switch (i54) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (strM5791 == null) {
                                    i54 = 1513238;
                                }
                                break;
                            case 83:
                                C0383.m7508(C0113.m2178(this), null, 0, new y(this, strM5791, null), C0304.f452 ^ 17);
                                int i55 = 1513269;
                                while (true) {
                                    i55 ^= 1513286;
                                    switch (i55) {
                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            return;
                                        case 115:
                                            i55 = 1513300;
                                            break;
                                    }
                                }
                                break;
                            case 114:
                                break;
                            case 809:
                                C0226.m4367(this);
                                return;
                            default:
                                continue;
                        }
                        i54 = 1512556;
                    }
                    break;
                default:
                    continue;
            }
            i52 = 1512432;
        }
    }

    public final void s() {
        x1 x1VarM3703 = C0193.m3703(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = x1VarM3703 != null ? 1709 : 1678;
                    break;
                case 204:
                    C0345.m6768(x1VarM3703, null);
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        this.f3095i = null;
        C0227.m4376(C0482.m9390(C0167.m3199(C0202.m3874(C0278.m5385(this))), C0190.m3630(m1570(), 1056, C0125.f151 ^ 806, 1853), false));
        try {
            Application applicationM5540 = C0287.m5540(this);
            C0102.m1989(applicationM5540, new Intent(applicationM5540, (Class<?>) KeepAliveService.class));
            C0102.m1989(applicationM5540, new Intent(applicationM5540, (Class<?>) OverlayService.class));
        } catch (Exception e4) {
            int i11 = 1740;
            while (true) {
                i11 ^= 1757;
                switch (i11) {
                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i11 = 1771;
                        break;
                    case 54:
                        break;
                }
            }
        }
        C0225.m4338(C0380.m7458(this));
        C0227.m4382(C0225.m4345(this), C0253.m4838());
        Boolean boolM8876 = C0455.m8876();
        C0227.m4382(C0107.m2079(this), boolM8876);
        C0227.m4382(C0116.m2242(this), C0439.m8581());
        C0122.m2359(this, 80 ^ ((long) C0405.f676));
        C0227.m4382(C0151.m2902(this), null);
        C0227.m4382(C0005.m97(this), boolM8876);
    }

    public final void t(long j10) {
        q0 q0VarM3835 = null;
        Long lM8554 = null;
        d dVarM5385 = null;
        b bVarM7699 = null;
        SharedPreferences sharedPreferencesM8270 = null;
        SharedPreferences.Editor editorM3199 = null;
        short[] sArrM1570 = null;
        int i10 = 0;
        int i11 = 0;
        String strM957 = null;
        SharedPreferences.Editor editorM7616 = null;
        String str = "\u06e8\u06e4\u06e3";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56319:
                    sharedPreferencesM8270 = C0421.m8270(bVarM7699);
                    str = "\u06e6\u06e4";
                    break;
                case 56510:
                    editorM3199 = C0167.m3199(sharedPreferencesM8270);
                    str = "\u06e8\u06e6\u06e6";
                    break;
                case 1746691:
                    C0333.m6480(editorM7616);
                    str = "\u06e0\u06e5\u06e7";
                    break;
                case 1746968:
                    bVarM7699 = C0393.m7699(dVarM5385);
                    str = "\u06e0\u06df";
                    break;
                case 1747842:
                    return;
                case 1747901:
                    i11 = i10 ^ (-157);
                    str = "\u06e4\u06e5\u06e7";
                    break;
                case 1748672:
                    editorM7616 = C0388.m7616(editorM3199, strM957, j10);
                    str = "\u06df\u06df\u06e3";
                    break;
                case 1748894:
                    dVarM5385 = C0278.m5385(this);
                    str = "\u06df\u06e8\u06e1";
                    break;
                case 1749758:
                    i10 = C0149.f174;
                    str = "\u06e0\u06e7\u06e4";
                    break;
                case 1749760:
                    lM8554 = C0438.m8554(j10);
                    str = "\u06e5\u06e7";
                    break;
                case 1751686:
                    strM957 = C0049.m957(sArrM1570, 1071, i11, 2054);
                    str = "\u06e1\u06e1\u06e0";
                    break;
                case 1755495:
                    q0VarM3835 = C0200.m3835(this);
                    str = "\u06e2\u06e5\u06e3";
                    break;
                case 1755560:
                    sArrM1570 = m1570();
                    str = "\u06e2\u06e5\u06e1";
                    break;
                default:
                    C0227.m4382(q0VarM3835, lM8554);
                    str = "\u06e1\u06e8\u06e5";
                    break;
            }
        }
    }

    public final void u(String str, String str2) {
        C0375.m7360(str, C0221.m4271(m1570(), 1089, C0188.f212 ^ 109, 705));
        C0375.m7360(str2, C0202.m3867(m1570(), 1093, C0055.f75 ^ (-719), 1250));
        String strM5791 = C0300.m5791(C0380.m7458(this));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (strM5791 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return;
                case 239:
                    C0383.m7508(C0113.m2178(this), null, 0, new e0(this, str, str2, strM5791, null), 3);
                    int iM6720 = C0342.m6720();
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM6720 <= 0) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                System.out.println(Integer.parseInt(C0046.m899("RS8kJYtrECNF4Z35JYprNlBS409")));
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

    public final void v(int i10, String str, String str2, boolean z10) {
        C0375.m7360(str, C0275.m5301(m1570(), 1101, C0074.f108 ^ (-684), 1435));
        C0375.m7360(str2, C0064.m1234(m1570(), 1108, C0114.f140 ^ (-304), 696));
        String strM5791 = C0300.m5791(C0380.m7458(this));
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (strM5791 == null) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    int iM6374 = C0330.m6374();
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM6374 <= 0) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                System.out.println(Integer.parseInt(C0456.m8886("t1MEDQ3ogDo77JSdo")));
                                return;
                            default:
                                continue;
                        }
                        i12 = 1802;
                    }
                    break;
                case 239:
                    C0383.m7508(C0113.m2178(this), null, 0, new g0(z10, this, strM5791, i10, str2, str, null), 3);
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }
}
