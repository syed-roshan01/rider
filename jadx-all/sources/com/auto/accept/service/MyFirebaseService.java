package com.auto.accept.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.C0019;
import b5.a;
import com.auto.accept.data.model.C0071;
import com.auto.accept.ui.MainActivity;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.iid.C0169;
import com.google.firebase.iid.C0170;
import com.google.firebase.measurement.C0181;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0198;
import com.google.firebase.tracing.C0204;
import com.ride.accepter.R;
import d7.C0220;
import d8.C0222;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.internal.componenttreedeps.C0249;
import e9.C0267;
import f.C0270;
import f6.C0278;
import h.C0298;
import h0.C0300;
import i4.C0318;
import j2.C0325;
import k4.C0337;
import l6.C0344;
import o7.i2;
import q2.x;
import q5.C0386;
import q6.C0387;
import r6.C0402;
import u2.C0434;
import v0.C0441;
import v5.C0445;
import x0.C0467;

/* JADX INFO: loaded from: classes.dex */
public final class MyFirebaseService extends FirebaseMessagingService {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f101short = {2483, 2450, 2449, 2454, 2434, 2459, 2435, 2484, 2463, 2454, 2457, 2457, 2450, 2459, 2494, 2451, 409, 429, 402, 445, 422, 433, 438, 437, 423, 433, 391, 433, 422, 418, 445, 439, 433, 3135, 3102, 3101, 3098, 3086, 3095, 3087, 3128, 3091, 3098, 3093, 3093, 3102, 3095, 3122, 3103, 1985, 2016, 2019, 2020, 2032, 2025, 2033, 1957, 1990, 2029, 2020, 2027, 2027, 2016, 2025, 2769, 2759, 2764, 2758, 2800, 2759, 2757, 2763, 2769, 2774, 2768, 2755, 2774, 2763, 2765, 2764, 2806, 2765, 2801, 2759, 2768, 2772, 2759, 2768, 2712, 2690, 2315, 2367, 2304, 2351, 2356, 2339, 2340, 2343, 2357, 2339, 2325, 2339, 2356, 2352, 2351, 2341, 2339, 2293, 2274, 2282, 2280, 2291, 2274, 2250, 2274, 2292, 2292, 2278, 2272, 2274, 1785, 1741, 1744, 1746, 1669, 1695, 3010, 3062, 3017, 3046, 3069, 3050, 3053, 3054, 3068, 3050, 3036, 3050, 3069, 3065, 3046, 3052, 3050, 1622, 1662, 1640, 1640, 1658, 1660, 1662, 1595, 1621, 1652, 1647, 1650, 1661, 1650, 1656, 1658, 1647, 1650, 1652, 1653, 1595, 1625, 1652, 1663, 1634, 1569, 1595, 387, 408, 412, 402, 409, 1696, 1687, 1684, 1664, 1687, 1665, 1690, 1687, 1686, 1746, 1670, 1693, 1689, 1687, 1692, 1736, 1746, 755, 711, 760, 727, 716, 731, 732, 735, 717, 731, 749, 731, 716, 712, 727, 733, 731};
    private static final String CHANNEL_ID = C0181.m3459(m1470(), 0, C0445.f715 ^ (-840), 2551);
    private static final String TAG = C0434.m8486(m1470(), 16, C0222.f301 ^ (-764), 468);
    public static final a Companion = new a();

    public MyFirebaseService() {
        int iM3800 = C0198.m3800();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3800 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0193.m3687("aPE4FRUgxSXyxYp7")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    private final void sendNotification(String str, String str2) {
        Class<MainActivity> cls = null;
        int i10 = 0;
        int i11 = 0;
        PendingIntent pendingIntentM4448 = null;
        short[] sArr = null;
        String strM3259 = null;
        x xVar = null;
        Notification notificationM3907 = null;
        CharSequence charSequenceM9088 = null;
        CharSequence charSequenceM9089 = null;
        NotificationManager notificationManager = null;
        String str3 = "ۨۢۥ";
        Intent intent = null;
        while (true) {
            switch (C0124.m2383(str3)) {
                case 56541:
                    xVar.f13106e = charSequenceM9088;
                    str3 = "ۢ۠ۡ";
                    charSequenceM9089 = C0467.m9088(str2);
                    break;
                case 1746756:
                    notificationM3907.icon = R.mipmap.ic_launcher;
                    str3 = "ۧۤ";
                    charSequenceM9088 = C0467.m9088(str);
                    break;
                case 1746757:
                    i11 = 1140850946 ^ i10;
                    str3 = "ۢ۠ۥ";
                    pendingIntentM4448 = C0232.m4448(this, 0, intent, i11);
                    break;
                case 1747780:
                    i11 = i10 ^ (-31);
                    str3 = "ۧ۠ۦ";
                    strM3259 = C0170.m3259(sArr, 33, i11, 3195);
                    break;
                case 1747839:
                    Notification notificationM4749 = C0249.m4749(xVar);
                    C0278.m5360(notificationManager, 0, notificationM4749);
                    str3 = "ۦۥۤ";
                    notificationM3907 = notificationM4749;
                    break;
                case 1747902:
                    C0071.m1454(intent, i11);
                    str3 = "۟ۡۧ";
                    i10 = C0220.f299;
                    break;
                case 1749603:
                    xVar.f13107f = charSequenceM9089;
                    str3 = "ۤۧ۠";
                    i10 = C0318.f465;
                    break;
                case 1749607:
                    short[] sArrM1470 = m1470();
                    i10 = C0386.f656;
                    str3 = "ۣ۠ۧ";
                    sArr = sArrM1470;
                    break;
                case 1749632:
                    str3 = "ۢۨۦ";
                    notificationManager = (NotificationManager) C0402.m7876(this, cls);
                    break;
                case 1749756:
                    int i12 = i10 ^ (-463);
                    str = C0300.m5767(sArr, 49, i12, 1925);
                    str3 = "ۥۥ۟";
                    i11 = i12;
                    break;
                case 1749856:
                    short[] sArrM1471 = m1470();
                    i10 = C0191.f215;
                    str3 = "ۢۥ۟";
                    sArr = sArrM1471;
                    break;
                case 1751741:
                    int i13 = i10 ^ 325;
                    C0169.m3240(xVar, i13, true);
                    str3 = "ۧۦۥ";
                    i11 = i13;
                    break;
                case 1752639:
                    i10 = C0232.f311;
                    str3 = "ۥۧۨ";
                    i11 = i10 ^ (-200);
                    break;
                case 1752710:
                    C0267.m5095(notificationManager, new NotificationChannel(strM3259, str, i11));
                    str3 = "۠ۥۤ";
                    break;
                case 1753605:
                    return;
                case 1754413:
                    x xVar2 = new x(this, strM3259);
                    notificationM3907 = C0204.m3907(xVar2);
                    str3 = "۟ۡۦ";
                    xVar = xVar2;
                    break;
                case 1754598:
                    xVar.f13108g = pendingIntentM4448;
                    str3 = "ۢۡ۟";
                    cls = NotificationManager.class;
                    break;
                case 1755435:
                    cls = MainActivity.class;
                    str3 = "ۦۨ۠";
                    intent = new Intent(this, cls);
                    break;
                default:
                    i10 = C0344.f614;
                    str3 = "۠ۧۥ";
                    i11 = 67109279 ^ i10;
                    break;
            }
        }
    }

    private final void sendRegistrationToServer(String str) {
        StringBuilder sb = new StringBuilder(C0318.m6156(m1470(), 64, C0270.f349 ^ (-481), 2722));
        C0142.m2728(sb, str);
        C0441.m8605(sb);
        C0190.m3630(m1470(), 90, C0387.f657 ^ (-656), 2374);
        int iM375 = C0019.m375();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM375 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0337.m6526("XfswYzK2O9Kd5jMjkKsNhoAVrj")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۤ, reason: not valid java name and contains not printable characters */
    public static void m1469(Object obj, Object obj2) {
        int iM3247 = C0170.m3247();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3247 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    ((MyFirebaseService) obj).sendRegistrationToServer((String) obj2);
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

    /* JADX INFO: renamed from: ۣۥۣۧ, reason: not valid java name and contains not printable characters */
    public static short[] m1470() {
        int iM6278 = C0325.m6278();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6278 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f101short;
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

    /* JADX INFO: renamed from: ۦ۠ۡ, reason: contains not printable characters */
    public static void m1471(Object obj, Object obj2, Object obj3) {
        int iM5722 = C0298.m5722();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM5722 >= 0 ? 1709 : 1678;
                    break;
                case 204:
                    ((MyFirebaseService) obj).sendNotification((String) obj2, (String) obj3);
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
        int iM4762 = C0249.m4762();
        int i12 = 1740;
        while (true) {
            i12 ^= 1757;
            switch (i12) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM4762 <= 0) {
                        i12 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    return;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    System.out.println(Float.decode(C0100.m1967("YuXo1uECG5mw3Dl5JV")));
                    return;
                default:
                    continue;
            }
            i12 = 1802;
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
    }
}
