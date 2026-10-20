package com.auto.accept.service;

import a6.C0007;
import a8.C0009;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.IBinder;
import android.support.v4.app.C0014;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0019;
import androidx.appcompat.widget.C0020;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.input.key.C0033;
import androidx.fragment.app.C0042;
import androidx.lifecycle.C0043;
import b5.d;
import b5.e;
import b7.C0054;
import c3.C0062;
import c3.C0063;
import c6.C0067;
import c7.C0068;
import com.auto.accept.service.OverlayService;
import com.auto.accept.ui.MainActivity;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.internal.stats.C0101;
import com.google.android.gms.internal.tasks.C0102;
import com.google.android.gms.measurement.internal.C0104;
import com.google.android.play.core.integrity.client.C0108;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.C0205;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.encoders.C0143;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.iid.C0169;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.measurement.C0181;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.tracing.C0204;
import com.ride.accepter.R;
import d1.C0211;
import d1.C0212;
import d1.C0214;
import d2.C0215;
import d4.C0217;
import d5.C0218;
import d7.C0220;
import d9.C0223;
import d9.C0225;
import dagger.hilt.android.C0240;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.android.migration.C0239;
import dagger.hilt.codegen.C0241;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.C0252;
import dagger.hilt.internal.aggregatedroot.C0246;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import dagger.hilt.internal.componenttreedeps.C0248;
import e1.C0259;
import e9.C0266;
import ea.C0268;
import f1.C0273;
import f4.C0274;
import f6.C0277;
import fa.C0280;
import g0.C0285;
import g2.C0287;
import g5.C0291;
import h.C0296;
import h1.C0300;
import h3.C0301;
import h3.C0302;
import h5.C0307;
import h8.C0313;
import i.C0315;
import i9.C0321;
import j2.C0323;
import j4.C0326;
import j6.C0328;
import k.C0331;
import k2.C0333;
import k3.C0335;
import k4.C0336;
import k7.C0337;
import l2.C0341;
import l3.C0342;
import l8.C0345;
import m0.C0349;
import m5.C0354;
import m5.C0355;
import m7.C0357;
import m7.C0358;
import m9.C0359;
import n.C0360;
import n.C0361;
import n9.C0366;
import o7.i2;
import p0.C0374;
import p3.C0375;
import p4.C0376;
import p8.C0380;
import q0.C0382;
import q2.C0384;
import q2.x;
import q5.C0385;
import q9.C0391;
import r.C0392;
import r2.C0396;
import r4.C0398;
import r4.h;
import r6.C0401;
import r9.C0405;
import s.C0408;
import s0.C0409;
import s0.C0410;
import s2.C0411;
import t0.C0418;
import t2.C0420;
import t2.C0423;
import u.C0429;
import u4.C0436;
import v.C0439;
import v0.C0441;
import v0.C0442;
import v0.C0443;
import v5.C0444;
import v7.C0448;
import v7.C0449;
import v9.C0451;
import v9.C0452;
import w5.C0462;
import x0.C0466;
import x4.C0468;
import x4.C0469;
import x5.C0470;
import x7.C0471;
import x7.C0472;
import y6.C0477;
import z.C0481;
import z0.C0482;
import z1.C0483;
import z2.C0484;
import z3.C0485;
import z7.C0489;

/* JADX INFO: loaded from: classes.dex */
public final class OverlayService extends Service {
    public static final int $stable = 8;
    private static final int NOTIFICATION_ID = 1001;
    private ConnectivityManager connectivityManager;
    private final e fareReceiver = new e(this);
    private TextView fareText;
    private float initialTouchX;
    private float initialTouchY;
    private int initialX;
    private int initialY;
    private ConnectivityManager.NetworkCallback networkCallback;
    private TextView networkStatusText;
    private View overlayView;
    private TextView statusText;
    private TextView stopButton;
    private WindowManager windowManager;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f102short = {2144, 2169, 2154, 2173, 2147, 2158, 2166, 2128, 2156, 2151, 2158, 2145, 2145, 2154, 2147, 2628, 2685, 2670, 2681, 2663, 2666, 2674, 2648, 2670, 2681, 2685, 2658, 2664, 2670, 812, 821, 806, 817, 815, 802, 826, 796, 800, 811, 802, 813, 813, 806, 815, 531, 552, 549, 548, 609, 512, 546, 546, 548, 561, 565, 548, 563, 609, 512, 546, 565, 552, 567, 548, 2186, 2216, 2217, 2222, 2227, 2216, 2229, 2222, 2217, 2208, 2279, 2209, 2216, 2229, 2279, 2229, 2222, 2211, 2210, 2279, 2229, 2210, 2230, 2226, 2210, 2228, 2227, 2228, 1234, 1221, 1241, 1244, 1236, 1176, 1182, 1182, 1182, 1177, 2794, 2769, 2780, 2781, 2712, 2809, 2779, 2779, 2781, 2760, 2764, 2781, 2762, 2712, 2807, 2766, 2781, 2762, 2772, 2777, 2753, 448, 473, 458, 477, 451, 462, 470, 496, 460, 455, 462, 449, 449, 458, 451, 1493, 1518, 1513, 1521, 1525, 1446, 1522, 1518, 1507, 1446, 1504, 1514, 1513, 1511, 1522, 1519, 1512, 1505, 1446, 1513, 1520, 1507, 1524, 1514, 1511, 1535, 1446, 1521, 1519, 1506, 1505, 1507, 1522, 2253, 2292, 2279, 2288, 2286, 2275, 2299, 2257, 2279, 2288, 2292, 2283, 2273, 2279, 708, 767, 754, 755, 694, 727, 757, 757, 755, 742, 738, 755, 740, -9553, -8848, 690, 723, 721, 710, 731, 708, 727, 8792, 8949, 9242, 1987, 1968, 1975, 1964, 1971, 11319, 2818, 2913, 2894, 2893, 2897, 2887, 1888, 1881, 1866, 1885, 1859, 1870, 1878, 1807, 1881, 1862, 1866, 1880, 1807, 1870, 1867, 1867, 1866, 1867, 943, 904, 896, 901, 908, 909, 969, 925, 902, 969, 904, 909, 909, 969, 902, 927, 908, 923, 901, 904, 912, 979, 969, 2622, 2594, 2595, 2617, 2670, 2682, 317, 289, 288, 314, 365, 377, 1299, 1351, 1366, 1349, 1366, 1370, 1348, 1251, 1279, 1278, 1252, 1203, 1191, 1497, 1487, 1496, 1500, 1475, 1481, 1487, 1525, 1487, 1476, 1483, 1480, 1478, 1487, 1486, 493, 481, 483, 416, 495, 507, 506, 481, 416, 495, 493, 493, 491, 510, 506, 416, 456, 463, 476, 459, 465, 458, 459, 474, 459, 461, 474, 459, 458, 1573, 1577, 1579, 1640, 1575, 1587, 1586, 1577, 1640, 1575, 1573, 1573, 1571, 1590, 1586, 1640, 1557, 1539, 1556, 1552, 1551, 1541, 1539, 1561, 1557, 1554, 1543, 1554, 1555, 1557, -11977, -10520, 2346, 2379, 2377, 2398, 2371, 2396, 2383, -11729, -10458, 2610, 2653, 2644, 2644, 9731, 1498, 1449, 1454, 1461, 1450, 8493, 1211, 1224, 1231, 1242, 1225, 1231, 2981, 2972, 2959, 2968, 2950, 2955, 2963, 3001, 2959, 2968, 2972, 2947, 2953, 2959, 2398, 2407, 2420, 2403, 2429, 2416, 2408, 2353, 2402, 2420, 2403, 2407, 2424, 2418, 2420, 2353, 2418, 2403, 2420, 2416, 2405, 2420, 2421, 483, 509, 506, 496, 507, 483, 3198, 3173, 3196, 3196, 3120, 3187, 3185, 3198, 3198, 3199, 3172, 3120, 3186, 3189, 3120, 3187, 3185, 3171, 3172, 3120, 3172, 3199, 3120, 3198, 3199, 3198, 3133, 3198, 3173, 3196, 3196, 3120, 3172, 3177, 3168, 3189, 3120, 3185, 3198, 3188, 3170, 3199, 3193, 3188, 3134, 3174, 3193, 3189, 3175, 3134, 3143, 3193, 3198, 3188, 3199, 3175, 3165, 3185, 3198, 3185, 3191, 3189, 3170, 1365, 1347, 1364, 1360, 1359, 1349, 1347, 1401, 1347, 1352, 1351, 1348, 1354, 1347, 1346, 513, 568, 555, 572, 546, 559, 567, 541, 555, 572, 568, 551, 557, 555, 684, 643, 650, 654, 641, 666, 671, 719, 650, 669, 669, 640, 669, 725, 719, 1727, 1670, 1685, 1666, 1692, 1681, 1673, 1744, 1667, 1685, 1666, 1670, 1689, 1683, 1685, 1744, 1684, 1685, 1667, 1668, 1666, 1695, 1673, 1685, 1684, 2075, 2061, 2074, 2078, 2049, 2059, 2061, 2103, 2061, 2054, 2057, 2058, 2052, 2061, 2060};
    private static final String CHANNEL_ID = C0384.m7532(m1486(), 0, C0019.f39 ^ (-69), 2063);
    private static final String TAG = C0439.m8580(m1486(), 15, C0342.f613 ^ 55, 2571);
    public static final d Companion = new d();

    public OverlayService() {
        int iM2838 = C0148.m2838();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2838 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0483.m9411("FZW9")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public static final /* synthetic */ void access$updateStatusDisplay(OverlayService overlayService, boolean z10) {
        m1479(overlayService, z10);
        int iM820 = C0042.m820();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM820 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0082.m1759("YTbbr5BId7gbpS6Hwotczsc")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    private final Notification buildNotification() {
        String str = "\u06e8\u06e4\u06e7";
        x xVar = null;
        CharSequence charSequenceM9088 = null;
        PendingIntent pendingIntentM4448 = null;
        Class cls = null;
        CharSequence charSequenceM9089 = null;
        Intent intent = null;
        Notification notificationM4749 = null;
        String strM836 = null;
        short[] sArrM1486 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56412:
                    strM836 = C0241.m4619(sArrM1486, 64, i10, 2247);
                    str = "\u06e0\u06e6\u06e2";
                    charSequenceM9088 = C0466.m9088(strM836);
                    break;
                case 56475:
                    C0335.m6501(notificationM4749, strM836);
                    return notificationM4749;
                case 1746688:
                    i10 = i11 ^ (-643);
                    str = "\u06e3\u06e2\u06e8";
                    strM836 = C0252.m4833(sArrM1486, 29, i10, 835);
                    break;
                case 1746881:
                    strM836 = C0326.m6307(sArrM1486, 44, i10, 577);
                    str = "\u06e8\u06e6\u06e6";
                    charSequenceM9089 = C0466.m9088(strM836);
                    break;
                case 1746968:
                    notificationM4749.icon = R.mipmap.ic_launcher;
                    str = "\u06e4\u06e6\u06e4";
                    sArrM1486 = m1486();
                    break;
                case 1747868:
                    xVar.f13107f = charSequenceM9088;
                    i11 = C0089.f123;
                    str = "\u06e2\u06e1\u06e1";
                    break;
                case 1749634:
                    i10 = i11 ^ 392;
                    C0169.m3240(xVar, i10, true);
                    str = "\u06e6\u06e0\u06e4";
                    break;
                case 1749725:
                    Intent intent2 = new Intent(this, (Class<?>) cls);
                    i11 = C0109.f135;
                    str = "\u06e7\u06e1\u06e1";
                    intent = intent2;
                    break;
                case 1750633:
                    xVar = new x(this, strM836);
                    str = "\u06df\u06e8\u06e1";
                    notificationM4749 = C0204.m3907(xVar);
                    break;
                case 1751714:
                    i11 = C0268.f348;
                    i10 = i11 ^ 746;
                    str = "\u06df\u06e5\u06e7";
                    break;
                case 1752520:
                    i11 = C0361.f632;
                    i10 = i11 ^ 61;
                    str = "\u06e3\u06df";
                    break;
                case 1753414:
                    short[] sArrM1487 = m1486();
                    i11 = C0114.f140;
                    str = "\u06df\u06df";
                    sArrM1486 = sArrM1487;
                    break;
                case 1753450:
                    xVar.f13111j = -1;
                    str = "\u06e2\u06e4\u06df";
                    cls = MainActivity.class;
                    break;
                case 1754439:
                    i10 = 67108931 ^ i11;
                    str = "\u06e7\u06e7\u06e2";
                    pendingIntentM4448 = C0231.m4448(this, 0, intent, i10);
                    break;
                case 1754626:
                    xVar.f13108g = pendingIntentM4448;
                    str = "\u06e6\u06df\u06df";
                    notificationM4749 = C0248.m4749(xVar);
                    break;
                case 1755499:
                    short[] sArrM1488 = m1486();
                    i11 = C0246.f326;
                    str = "\u06df\u06df\u06e0";
                    sArrM1486 = sArrM1488;
                    break;
                case 1755560:
                    xVar.f13106e = charSequenceM9089;
                    str = "\u06e5\u06e1\u06e4";
                    sArrM1486 = m1486();
                    break;
                default:
                    i10 = i11 ^ (-302);
                    str = "\u06e5\u06e0";
                    strM836 = C0043.m836(sArrM1486, 92, i10, 1200);
                    break;
            }
        }
    }

    private final void createNotificationChannel() {
        String str = "\u06e3\u06e2\u06e4";
        Object obj = null;
        String strM6634 = null;
        NotificationChannel notificationChannel = null;
        NotificationManager notificationManager = null;
        Object objM7876 = null;
        String strM6514 = null;
        short[] sArrM1486 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747713:
                    i12 = C0063.f83;
                    str = "\u06e2\u06e4\u06e8";
                    break;
                case 1747778:
                    return;
                case 1747805:
                    str = "\u06e2\u06e1\u06e8";
                    obj = NotificationManager.class;
                    break;
                case 1749641:
                    objM7876 = C0401.m7876(this, obj);
                    str = "\u06e7\u06e7\u06e7";
                    break;
                case 1749734:
                    i10 = i12 ^ (-801);
                    str = "\u06e3\u06e7\u06e3";
                    break;
                case 1749763:
                    C0127.m2454(notificationChannel, strM6514);
                    str = "\u06e8\u06df\u06e6";
                    break;
                case 1749794:
                    str = "\u06e6\u06e0\u06e7";
                    sArrM1486 = m1486();
                    break;
                case 1750629:
                    str = "\u06e0\u06e1\u06e2";
                    sArrM1486 = m1486();
                    break;
                case 1750694:
                    str = "\u06e2\u06e5\u06e6";
                    strM6514 = C0336.m6514(sArrM1486, 138, i11, 1414);
                    break;
                case 1750783:
                    str = "\u06e6\u06df\u06e0";
                    strM6634 = C0337.m6634(sArrM1486, 102, i10, 2744);
                    break;
                case 1751500:
                    i10 = i12 ^ (-373);
                    str = "\u06e2\u06e6\u06e6";
                    break;
                case 1751714:
                    i11 = i12 ^ (-772);
                    str = "\u06e7\u06e0\u06df";
                    break;
                case 1751742:
                    i11 = i12 ^ (-887);
                    str = "\u06e3\u06e4\u06e7";
                    break;
                case 1753415:
                    i12 = C0143.f169;
                    str = "\u06e4\u06df\u06e7";
                    break;
                case 1753419:
                    C0266.m5095(notificationManager, notificationChannel);
                    str = "\u06e0\u06e3\u06e5";
                    break;
                case 1753453:
                    i12 = C0483.f757;
                    str = "\u06e4\u06e6\u06e4";
                    break;
                case 1754406:
                    str = "\u06df\u06e6\u06e1";
                    strM6514 = C0223.m4303(sArrM1486, 123, i11, 431);
                    break;
                case 1754476:
                    i12 = C0444.f715;
                    str = "\u06e4\u06e7\u06e1";
                    break;
                case 1754538:
                    str = "\u06e7\u06e2\u06e7";
                    sArrM1486 = m1486();
                    break;
                case 1754631:
                    str = "\u06e6\u06df\u06e4";
                    notificationManager = (NotificationManager) objM7876;
                    break;
                case 1755343:
                    C0120.m2308(notificationChannel, false);
                    str = "\u06e0\u06e4\u06e1";
                    break;
                default:
                    str = "\u06e7\u06e4\u06e7";
                    notificationChannel = new NotificationChannel(strM6514, strM6634, i10);
                    break;
            }
        }
    }

    private final void createOverlayView() {
        String strM7532 = C0384.m7532(m1486(), 171, C0220.f300 ^ (-115), 2178);
        final WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2038, 264, C0489.f763 ^ 528);
        layoutParams.gravity = 8388659;
        layoutParams.x = 20;
        layoutParams.y = 200;
        LinearLayout linearLayout = new LinearLayout(this);
        C0167.m3188(linearLayout, 1);
        int i10 = C0449.f720 ^ 376;
        int i11 = C0481.f755 ^ (-561);
        C0366.m7183(linearLayout, i11, i10, i11, i10);
        C0471.m9180(linearLayout, (-435087241) ^ C0405.f676);
        C0120.m2315(linearLayout, 8.0f);
        TextView textView = new TextView(this);
        C0137.m2641(textView, C0205.m3930(m1486(), 185, C0174.f198 ^ (-166), 662));
        C0321.m6224(textView, 2037835 ^ C0019.f39);
        C0150.m2893(textView, 12.0f);
        Typeface typefaceM7376 = C0376.m7376();
        C0152.m2913(textView, typefaceM7376);
        C0054.m1048(linearLayout, textView);
        TextView textView2 = new TextView(this);
        C0137.m2641(textView2, C0382.m7492(m1486(), 198, C0259.f339 ^ (-875), 658));
        C0321.m6224(textView2, (-11752009) ^ C0328.f476);
        C0150.m2893(textView2, 11.0f);
        this.statusText = textView2;
        C0054.m1048(linearLayout, textView2);
        TextView textView3 = new TextView(this);
        C0137.m2641(textView3, C0439.m8581());
        int i12 = (-43031) ^ C0469.f740;
        C0321.m6224(textView3, i12);
        C0150.m2893(textView3, 9.0f);
        int i13 = C0214.f238 ^ 196;
        C0014.m270(textView3, i13);
        this.networkStatusText = textView3;
        C0054.m1048(linearLayout, textView3);
        TextView textView4 = new TextView(this);
        C0137.m2641(textView4, C0167.m3196(m1486(), 207, C0225.f305 ^ (-152), 737));
        int i14 = C0101.f127 ^ (-769);
        C0321.m6224(textView4, i14);
        C0150.m2893(textView4, 18.0f);
        C0152.m2913(textView4, typefaceM7376);
        this.fareText = textView4;
        C0054.m1048(linearLayout, textView4);
        TextView textView5 = new TextView(this);
        C0137.m2641(textView5, C0484.m9421(m1486(), 209, C0418.f689 ^ 227, 2019));
        C0321.m6224(textView5, i14);
        C0150.m2893(textView5, 11.0f);
        C0152.m2913(textView5, typefaceM7376);
        C0471.m9180(textView5, i12);
        C0391.m7664(textView5, i11, i13, i11, i13);
        int i15 = C0477.f751 ^ 396;
        C0398.m7802(textView5, i15);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i14, C0321.f469 ^ 617);
        layoutParams2.topMargin = i13;
        C0239.m4598(textView5, layoutParams2);
        final int i16 = 0;
        C0280.m5421(textView5, new View.OnClickListener(this) { // from class: b5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OverlayService f2714b;

            {
                this.f2714b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i17 = i16;
                OverlayService overlayService = this.f2714b;
                switch (i17) {
                    case 0:
                        OverlayService.m1473(overlayService, view);
                        break;
                    default:
                        OverlayService.m1480(overlayService, view);
                        break;
                }
            }
        });
        this.stopButton = textView5;
        C0054.m1048(linearLayout, textView5);
        TextView textView6 = new TextView(this);
        C0137.m2641(textView6, C0323.m6250(m1486(), 215, C0315.f463 ^ 517, 2850));
        C0321.m6224(textView6, 6511710 ^ C0385.f656);
        C0150.m2893(textView6, 9.0f);
        C0398.m7802(textView6, i15);
        C0391.m7664(textView6, 0, i13, 0, 0);
        final int i17 = 1;
        C0280.m5421(textView6, new View.OnClickListener(this) { // from class: b5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OverlayService f2714b;

            {
                this.f2714b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i18 = i17;
                OverlayService overlayService = this.f2714b;
                switch (i18) {
                    case 0:
                        OverlayService.m1473(overlayService, view);
                        break;
                    default:
                        OverlayService.m1480(overlayService, view);
                        break;
                }
            }
        });
        C0054.m1048(linearLayout, textView6);
        C0357.m7018(linearLayout, new View.OnTouchListener() { // from class: b5.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return OverlayService.m1494(this.f2715a, layoutParams, view, motionEvent);
            }
        });
        this.overlayView = linearLayout;
        try {
            WindowManager windowManagerM1481 = m1481(this);
            int i18 = 1616;
            while (true) {
                i18 ^= 1633;
                switch (i18) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i18 = windowManagerM1481 != null ? 1709 : 1678;
                        break;
                    case 204:
                        C0151.m2904(windowManagerM1481, linearLayout, layoutParams);
                        int i19 = 1740;
                        while (true) {
                            i19 ^= 1757;
                            switch (i19) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i19 = 1771;
                                    break;
                                case 54:
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
            C0211.m4036(m1486(), 222, C0189.f213 ^ (-718), 1839);
            int i20 = 48767;
            while (true) {
                i20 ^= 48784;
                switch (i20) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 239:
                        i20 = 48798;
                        continue;
                    default:
                        continue;
                }
                int iM6699 = C0341.m6699();
                int i21 = 48891;
                while (true) {
                    i21 ^= 48908;
                    switch (i21) {
                        case 22:
                            break;
                        case 53:
                            return;
                        case 503:
                            if (iM6699 >= 0) {
                                i21 = 49635;
                            }
                            break;
                        case 32495:
                            System.out.println(Long.parseLong(C0164.m3141("8EP4kFZSYbyUcA5ju4GXSa")));
                            return;
                        default:
                            continue;
                    }
                    i21 = 48953;
                }
            }
        } catch (Exception e4) {
            int i22 = 1864;
            while (true) {
                i22 ^= 1881;
                switch (i22) {
                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i22 = 48674;
                        continue;
                    case 47483:
                        C0291.m5604(C0146.m2792(m1486(), 240, C0273.f389 ^ 435, NOTIFICATION_ID), C0212.m4049(e4), strM7532);
                        break;
                    default:
                        continue;
                }
            }
        }
    }

    private static final void createOverlayView$lambda$10$lambda$9(OverlayService overlayService, View view) {
        C0375.m7360(overlayService, C0355.m6971(m1486(), 263, C0173.f197 ^ (-810), 2634));
        C0237.m4569(overlayService);
        int iM2289 = C0119.m2289();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2289 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0429.m8423("Qai9vqQTIFl0hDYVsb6YY")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    private static final boolean createOverlayView$lambda$11(OverlayService overlayService, WindowManager.LayoutParams layoutParams, View view, MotionEvent motionEvent) {
        C0375.m7360(overlayService, C0409.m8030(m1486(), 269, C0468.f739 ^ 303, 329));
        C0375.m7360(layoutParams, C0246.m4720(m1486(), 275, C0244.f324 ^ 515, 1335));
        int iM5944 = C0307.m5944(motionEvent);
        boolean z10 = true;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5944 != 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM5944 != 2) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                layoutParams.x = m1490(overlayService) - (0 - ((int) (((C0411.m8070(motionEvent) - 9.0f) - m1491(overlayService)) + 9.0f)));
                                layoutParams.y = m1492(overlayService) - (0 - ((int) (((C0358.m7022(motionEvent) + 30.0f) - m1493(overlayService)) - 30.0f)));
                                WindowManager windowManagerM1481 = m1481(overlayService);
                                int i12 = 48767;
                                while (true) {
                                    i12 ^= 48784;
                                    switch (i12) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            break;
                                        case 76:
                                            C0441.m8623(windowManagerM1481, view, layoutParams);
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
                                        case 239:
                                            if (windowManagerM1481 != null) {
                                                i12 = 48860;
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i12 = 48829;
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                z10 = false;
                                int i14 = 1864;
                                while (true) {
                                    i14 ^= 1881;
                                    switch (i14) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i14 = 48674;
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
                    overlayService.initialX = C0442.m8638(layoutParams);
                    overlayService.initialY = C0300.m5785(layoutParams);
                    overlayService.initialTouchX = C0411.m8070(motionEvent);
                    overlayService.initialTouchY = C0358.m7022(motionEvent);
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void createOverlayView$lambda$8$lambda$7(OverlayService overlayService, View view) {
        C0375.m7360(overlayService, C0181.m3459(m1486(), 282, C0360.f631 ^ 740, 1175));
        SharedPreferences sharedPreferencesM5821 = C0302.m5821(overlayService);
        String strM8796 = C0451.m8796(m1486(), 288, C0007.f27 ^ (-432), 1450);
        boolean zM2784 = C0146.m2784(sharedPreferencesM5821, strM8796, false);
        C0333.m6480(C0482.m9390(C0167.m3199(sharedPreferencesM5821), strM8796, (((zM2784 ? 1 : 0) ^ '\uffff') & 1) | ((zM2784 ? 1 : 0) & '\ufffe')));
        m1479(overlayService, (((zM2784 ? 1 : 0) ^ '\uffff') & 1) | ((zM2784 ? 1 : 0) & '\ufffe'));
        int iM5504 = C0285.m5504();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5504 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0443.m8650("kF2yKAiN1")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    private final void registerReceivers() {
        IntentFilter intentFilter = new IntentFilter();
        C0408.m8021(intentFilter, C0020.m406(m1486(), 303, C0116.f142 ^ 241, 398));
        C0408.m8021(intentFilter, C0068.m1331(m1486(), 332, C0162.f186 ^ 858, 1606));
        int iM7181 = C0366.m7181();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7181 >= 33) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    C0420.m8259(this, m1483(this), intentFilter, C0472.f743 ^ (-554));
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                case 239:
                    C0240.m4602(this, m1483(this), intentFilter);
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    private final void setupNetworkMonitor() {
        this.connectivityManager = (ConnectivityManager) C0401.m7876(this, ConnectivityManager.class);
        this.networkCallback = new h(this, 1);
        NetworkRequest networkRequestM2270 = C0118.m2270(C0090.m1921(new NetworkRequest.Builder(), C0337.f608 ^ 255));
        ConnectivityManager connectivityManagerM1484 = m1484(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (connectivityManagerM1484 != null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    ConnectivityManager.NetworkCallback networkCallbackM1488 = m1488(this);
                    C0189.m3608(networkCallbackM1488);
                    C0354.m6947(connectivityManagerM1484, networkRequestM2270, networkCallbackM1488);
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    private final void updateStatusDisplay(boolean z10) {
        String strM5289;
        String strM6342;
        int i10;
        int i11 = -43230;
        TextView textViewM1476 = m1476(this);
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i12 = textViewM1476 == null ? 1709 : 1678;
                    break;
                case 204:
                    int i13 = 1740;
                    while (true) {
                        i13 ^= 1757;
                        switch (i13) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i13 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    int i14 = 1864;
                    while (true) {
                        i14 ^= 1881;
                        switch (i14) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i14 = z10 ? 48736 : 48705;
                                break;
                            case 47384:
                                strM5289 = C0274.m5289(m1486(), 371, C0152.f177 ^ 356, 2578);
                                break;
                            case 47417:
                                strM5289 = C0024.m469(m1486(), 362, C0142.f168 ^ (-621), 2314);
                                int i15 = 48767;
                                while (true) {
                                    i15 ^= 48784;
                                    switch (i15) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 239:
                                            i15 = 48798;
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
                    C0137.m2641(textViewM1476, strM5289);
                    break;
                default:
                    break;
            }
        }
        TextView textViewM1477 = m1476(this);
        int i16 = 48891;
        while (true) {
            i16 ^= 48908;
            switch (i16) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    i16 = textViewM1477 != null ? 49635 : 48953;
                    break;
                case 32495:
                    int i17 = 49666;
                    while (true) {
                        i17 ^= 49683;
                        switch (i17) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i17 = z10 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                int i18 = 49790;
                                while (true) {
                                    i18 ^= 49807;
                                    switch (i18) {
                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            i10 = -11751600;
                                            break;
                                        case 241:
                                            i18 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                i10 = -43230;
                                break;
                            default:
                                break;
                        }
                    }
                    C0321.m6224(textViewM1477, i10);
                    break;
                default:
                    break;
            }
        }
        TextView textViewM1478 = m1478(this);
        int i19 = 49914;
        while (true) {
            i19 ^= 49931;
            switch (i19) {
                case 497:
                    i19 = textViewM1478 == null ? 50658 : 50627;
                    break;
                case 1711:
                    break;
                case 1736:
                    int i20 = 50813;
                    while (true) {
                        i20 ^= 50830;
                        switch (i20) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                strM6342 = C0328.m6342(m1486(), 383, C0137.f163 ^ 101, 1179);
                                break;
                            case 243:
                                i20 = z10 ? 51557 : 50875;
                                break;
                            case 4075:
                                strM6342 = C0067.m1308(m1486(), 377, C0183.f207 ^ (-882), 1530);
                                int i21 = 51588;
                                while (true) {
                                    i21 ^= 51605;
                                    switch (i21) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i21 = 51619;
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
                    C0137.m2641(textViewM1478, strM6342);
                    break;
                case 1769:
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
                    }
                    break;
                default:
                    break;
            }
        }
        TextView textViewM1479 = m1478(this);
        int i23 = 51712;
        while (true) {
            i23 ^= 51729;
            switch (i23) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (textViewM1479 != null) {
                        i23 = 51805;
                    }
                    break;
                case 47:
                    return;
                case 76:
                    int i24 = 51836;
                    while (true) {
                        i24 ^= 51853;
                        switch (i24) {
                            case 241:
                                if (z10) {
                                    i24 = 52580;
                                }
                                break;
                            case 1963:
                                break;
                            case 1992:
                                i11 = -11751600;
                                break;
                            case 2025:
                                int i25 = 52611;
                                while (true) {
                                    i25 ^= 52628;
                                    switch (i25) {
                                        case 23:
                                            i25 = 52642;
                                            break;
                                        case 54:
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i24 = 52549;
                    }
                    C0471.m9180(textViewM1479, i11);
                    return;
                default:
                    continue;
            }
            i23 = 51774;
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Notification m1472(Object obj) {
        int iM8825 = C0452.m8825();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8825 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((OverlayService) obj).buildNotification();
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

    /* JADX INFO: renamed from: ۟ۡۤۦۤ, reason: not valid java name and contains not printable characters */
    public static void m1473(Object obj, Object obj2) {
        int iM8063 = C0410.m8063();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8063 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    createOverlayView$lambda$8$lambda$7((OverlayService) obj, (View) obj2);
                    return;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦۥ, reason: not valid java name and contains not printable characters */
    public static void m1474(Object obj) {
        int iM8524 = C0436.m8524();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8524 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    ((OverlayService) obj).setupNetworkMonitor();
                    return;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧۡۥ, reason: not valid java name and contains not printable characters */
    public static void m1475(Object obj) {
        int iM2646 = C0137.m2646();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2646 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    ((OverlayService) obj).createNotificationChannel();
                    return;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦۡ۟, reason: not valid java name and contains not printable characters */
    public static TextView m1476(Object obj) {
        int iM2434 = C0126.m2434();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2434 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((OverlayService) obj).statusText;
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

    /* JADX INFO: renamed from: ۟ۤ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m1477(Object obj) {
        int iM6072 = C0313.m6072();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM6072 < 0 ? 1709 : 1678;
                    break;
                case 204:
                    ((OverlayService) obj).createOverlayView();
                    break;
                case 239:
                    int i11 = 1864;
                    while (true) {
                        i11 ^= 1881;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
        int iM2511 = C0130.m2511();
        int i12 = 1740;
        while (true) {
            i12 ^= 1757;
            switch (i12) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM2511 <= 0) {
                        i12 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    return;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    System.out.println(Integer.decode(C0287.m5524("BCoDDJCfa28wFXrMDKOM")));
                    return;
                default:
                    continue;
            }
            i12 = 1802;
        }
    }

    /* JADX INFO: renamed from: ۟ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static TextView m1478(Object obj) {
        int iM9013 = C0462.m9013();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9013 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((OverlayService) obj).stopButton;
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

    /* JADX INFO: renamed from: ۟ۦۡۥۣ, reason: not valid java name and contains not printable characters */
    public static void m1479(Object obj, boolean z10) {
        int iM3402 = C0178.m3402();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM3402 >= 0 ? 1709 : 1678;
                    break;
                case 204:
                    ((OverlayService) obj).updateStatusDisplay(z10);
                    break;
                case 239:
                    int i11 = 1864;
                    while (true) {
                        i11 ^= 1881;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
        int iM7546 = C0385.m7546();
        int i12 = 1740;
        while (true) {
            i12 ^= 1757;
            switch (i12) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM7546 <= 0) {
                        i12 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    return;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    System.out.println(Float.decode(C0331.m6409("7cHEkGYwFWD9Ug8aa0Exm9e")));
                    return;
                default:
                    continue;
            }
            i12 = 1802;
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢ۠۠, reason: not valid java name and contains not printable characters */
    public static void m1480(Object obj, Object obj2) {
        int iM1975 = C0101.m1975();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1975 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    createOverlayView$lambda$10$lambda$9((OverlayService) obj, (View) obj2);
                    return;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۥ, reason: not valid java name and contains not printable characters */
    public static WindowManager m1481(Object obj) {
        int iM8612 = C0441.m8612();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8612 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((OverlayService) obj).windowManager;
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

    /* JADX INFO: renamed from: ۠ۤۢۡ, reason: not valid java name and contains not printable characters */
    public static View m1482(Object obj) {
        int iM4339 = C0225.m4339();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4339 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((OverlayService) obj).overlayView;
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

    /* JADX INFO: renamed from: ۣۢۤۨ, reason: not valid java name and contains not printable characters */
    public static e m1483(Object obj) {
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
                    return ((OverlayService) obj).fareReceiver;
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

    /* JADX INFO: renamed from: ۣ۟ۦ, reason: not valid java name and contains not printable characters */
    public static ConnectivityManager m1484(Object obj) {
        int iM7467 = C0380.m7467();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7467 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((OverlayService) obj).connectivityManager;
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

    /* JADX INFO: renamed from: ۣۣۧۡ, reason: not valid java name and contains not printable characters */
    public static TextView m1485(Object obj) {
        int iM6838 = C0349.m6838();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6838 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((OverlayService) obj).fareText;
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

    /* JADX INFO: renamed from: ۤۥۢ۠, reason: not valid java name and contains not printable characters */
    public static short[] m1486() {
        int iM6072 = C0313.m6072();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6072 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f102short;
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

    /* JADX INFO: renamed from: ۥۧۡ, reason: contains not printable characters */
    public static TextView m1487(Object obj) {
        int iM1607 = C0074.m1607();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1607 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((OverlayService) obj).networkStatusText;
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

    /* JADX INFO: renamed from: ۦۥ۟ۤ, reason: contains not printable characters */
    public static ConnectivityManager.NetworkCallback m1488(Object obj) {
        int iM2559 = C0133.m2559();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2559 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((OverlayService) obj).networkCallback;
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

    /* JADX INFO: renamed from: ۦۧۢۥ, reason: contains not printable characters */
    public static void m1489(Object obj) {
        int iM9449 = C0485.m9449();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9449 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    ((OverlayService) obj).registerReceivers();
                    return;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۧۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m1490(Object obj) {
        int iM177 = C0009.m177();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM177 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((OverlayService) obj).initialX;
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

    /* JADX INFO: renamed from: ۧۥۣۤ, reason: not valid java name and contains not printable characters */
    public static float m1491(Object obj) {
        int iM7059 = C0359.m7059();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7059 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((OverlayService) obj).initialTouchX;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return 0.0f;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۨۡۥ, reason: not valid java name and contains not printable characters */
    public static int m1492(Object obj) {
        int iM2274 = C0118.m2274();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2274 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((OverlayService) obj).initialY;
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

    /* JADX INFO: renamed from: ۨۢۥۥ, reason: not valid java name and contains not printable characters */
    public static float m1493(Object obj) {
        int iM4108 = C0215.m4108();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4108 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((OverlayService) obj).initialTouchY;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return 0.0f;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۨۨۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1494(Object obj, Object obj2, Object obj3, Object obj4) {
        int iM2522 = C0131.m2522();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2522 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return createOverlayView$lambda$11((OverlayService) obj, (WindowManager.LayoutParams) obj2, (View) obj3, (MotionEvent) obj4);
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

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        String str = "\u06df\u06df\u06df";
        SharedPreferences sharedPreferencesM5821 = null;
        Object objM4133 = null;
        short[] sArrM1486 = null;
        String strM8071 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747655:
                    C0392.m7691(this, i10, m1472(this));
                    str = "\u06e6\u06e0\u06e5";
                    break;
                case 1749729:
                    i10 = i11 ^ (-204);
                    str = "\u06e7\u06e6\u06e3";
                    strM8071 = C0411.m8071(sArrM1486, 496, i10, 1318);
                    break;
                case 1749794:
                    return;
                case 1750719:
                    i11 = C0159.f183;
                    i10 = i11 ^ 1019;
                    str = "\u06e0\u06df\u06e6";
                    break;
                case 1751492:
                    String strM6764 = C0345.m6764(sArrM1486, 433, i10, 3088);
                    C0301.m5795(objM4133, strM6764);
                    str = "\u06e5\u06e3\u06e1";
                    strM8071 = strM6764;
                    break;
                case 1751500:
                    strM8071 = C0218.m4229(sArrM1486, 390, i10, 3050);
                    str = "\u06e6\u06df\u06e2";
                    sArrM1486 = m1486();
                    break;
                case 1751589:
                    short[] sArrM1487 = m1486();
                    i11 = C0396.f667;
                    str = "\u06e2\u06e4\u06e3";
                    sArrM1486 = sArrM1487;
                    break;
                case 1751714:
                    m1477(this);
                    m1489(this);
                    str = "\u06e5\u06e3\u06e7";
                    break;
                case 1752578:
                    objM4133 = C0217.m4133(this, strM8071);
                    str = "\u06e8\u06e0\u06e0";
                    sArrM1486 = m1486();
                    break;
                case 1752579:
                    this.windowManager = (WindowManager) objM4133;
                    str = "\u06e4\u06e6\u06e4";
                    break;
                case 1752585:
                    m1474(this);
                    str = "\u06e4\u06e2\u06e3";
                    sharedPreferencesM5821 = C0302.m5821(this);
                    break;
                case 1752705:
                    String strM3660 = C0192.m3660(sArrM1486, 404, i10, 2321);
                    m1475(this);
                    str = "\u06e3\u06e5\u06e1";
                    strM8071 = strM3660;
                    break;
                case 1753417:
                    i11 = C0068.f88;
                    i10 = i11 ^ (-751);
                    str = "\u06e5\u06e7\u06e3";
                    break;
                case 1753451:
                    short[] sArrM1488 = m1486();
                    i11 = C0266.f346;
                    str = "\u06e6\u06e5\u06e0";
                    sArrM1486 = sArrM1488;
                    break;
                case 1753601:
                    i10 = i11 ^ (-774);
                    str = "\u06e5\u06e3\u06e0";
                    strM8071 = C0108.m2094(sArrM1486, 427, i10, 404);
                    break;
                case 1754596:
                    m1479(this, C0146.m2784(sharedPreferencesM5821, strM8071, false));
                    str = "\u06e2\u06e6\u06e6";
                    break;
                case 1755368:
                    i11 = C0470.f741;
                    i10 = i11 ^ 138;
                    str = "\u06e4\u06df\u06df";
                    break;
                case 1755494:
                    i11 = C0245.f325;
                    i10 = i11 ^ 296;
                    str = "\u06e4\u06df\u06e7";
                    break;
                default:
                    super.onCreate();
                    str = "\u06e8\u06e4\u06e2";
                    sArrM1486 = m1486();
                    break;
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        int iM2007;
        int i10;
        String strM8030 = C0409.m8030(m1486(), 511, C0218.f298 ^ (-559), 590);
        super.onDestroy();
        try {
            View viewM1482 = m1482(this);
            int i11 = 1616;
            while (true) {
                i11 ^= 1633;
                switch (i11) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i11 = viewM1482 != null ? 1709 : 1678;
                        break;
                    case 204:
                        WindowManager windowManagerM1481 = m1481(this);
                        int i12 = 1740;
                        while (true) {
                            i12 ^= 1757;
                            switch (i12) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = windowManagerM1481 != null ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    C0296.m5700(windowManagerM1481, viewM1482);
                                    int i13 = 1864;
                                    while (true) {
                                        i13 ^= 1881;
                                        switch (i13) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
            }
            C0205.m3924(this, m1483(this));
            ConnectivityManager.NetworkCallback networkCallbackM1488 = m1488(this);
            int i14 = 48891;
            while (true) {
                i14 ^= 48908;
                switch (i14) {
                    case 22:
                        break;
                    case 53:
                        break;
                    case 503:
                        i14 = networkCallbackM1488 != null ? 49635 : 48953;
                        break;
                    case 32495:
                        ConnectivityManager connectivityManagerM1484 = m1484(this);
                        int i15 = 49666;
                        while (true) {
                            i15 ^= 49683;
                            switch (i15) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i15 = connectivityManagerM1484 != null ? 49759 : 49728;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 76:
                                    C0277.m5383(connectivityManagerM1484, networkCallbackM1488);
                                    int i16 = 49790;
                                    while (true) {
                                        i16 ^= 49807;
                                        switch (i16) {
                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 241:
                                                i16 = 49821;
                                                continue;
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
                        break;
                    default:
                        break;
                }
            }
            while (true) {
                i10 ^= 49931;
                switch (i10) {
                    case 497:
                        if (iM2007 <= 0) {
                            i10 = 50658;
                        }
                        break;
                    case 1711:
                        break;
                    case 1736:
                        return;
                    case 1769:
                        System.out.println(Integer.decode(C0448.m8737("ba3sifDf1GaNuwkrwfLkupUWA")));
                        return;
                    default:
                        continue;
                }
                i10 = 50627;
            }
        } catch (Exception e4) {
            int i17 = 48767;
            while (true) {
                i17 ^= 48784;
                switch (i17) {
                    case Code.UNAVAILABLE /* 14 */:
                        C0291.m5604(C0374.m7338(m1486(), 525, C0033.f53 ^ (-237), 751), C0212.m4049(e4), strM8030);
                        break;
                    case 239:
                        i17 = 48798;
                        continue;
                    default:
                        continue;
                }
            }
        }
        C0485.m9450(m1486(), 540, C0062.f82 ^ 347, 1776);
        iM2007 = C0102.m2007();
        i10 = 49914;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        String str = "\u06e8\u06e6\u06e6";
        String strM8301 = null;
        SharedPreferences sharedPreferencesM5821 = null;
        short[] sArrM1486 = null;
        boolean zM2784 = false;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56511:
                    str = "\u06e2\u06e0\u06e5";
                    i13 = C0104.f130;
                    break;
                case 1747837:
                    str = "\u06e6\u06e3\u06e0";
                    zM2784 = C0146.m2784(sharedPreferencesM5821, strM8301, false);
                    break;
                case 1749607:
                    str = "\u06e4\u06e6\u06e6";
                    i12 = i13 ^ 796;
                    break;
                case 1751716:
                    strM8301 = C0423.m8301(sArrM1486, 565, i12, 2152);
                    str = "\u06e0\u06e5\u06e2";
                    break;
                case 1753539:
                    m1479(this, zM2784);
                    str = "\u06e5\u06e5";
                    break;
                case 1754600:
                    str = "\u06e6\u06e5";
                    sArrM1486 = m1486();
                    break;
                case 1755560:
                    str = "\u06e7\u06e6\u06e7";
                    sharedPreferencesM5821 = C0302.m5821(this);
                    break;
                default:
                    return 1;
            }
        }
    }
}
