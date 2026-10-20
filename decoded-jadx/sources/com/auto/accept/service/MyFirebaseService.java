package com.auto.accept.service;

import a.C0001;
import a2.C0004;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.C0019;
import androidx.compose.ui.layout.C0036;
import b5.a;
import b7.C0054;
import com.auto.accept.data.model.C0071;
import com.auto.accept.ui.MainActivity;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.iid.C0169;
import com.google.firebase.iid.C0170;
import com.google.firebase.installations.interop.C0174;
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
import d1.C0214;
import d7.C0219;
import d8.C0221;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.internal.migration.C0232;
import dagger.hilt.internal.componenttreedeps.C0248;
import e9.C0266;
import f.C0269;
import f6.C0277;
import g8.C0293;
import h.C0297;
import h0.C0299;
import h4.C0305;
import i4.C0317;
import ia.C0322;
import j2.C0324;
import k4.C0336;
import l6.C0343;
import m7.C0357;
import o7.i2;
import p3.C0375;
import q2.x;
import q5.C0385;
import q6.C0386;
import r6.C0401;
import u2.C0433;
import v0.C0440;
import v5.C0444;
import v6.C0447;
import v9.C0451;
import x0.C0466;

/* JADX INFO: loaded from: classes.dex */
public final class MyFirebaseService extends FirebaseMessagingService {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f101short = {2483, 2450, 2449, 2454, 2434, 2459, 2435, 2484, 2463, 2454, 2457, 2457, 2450, 2459, 2494, 2451, 409, 429, 402, 445, 422, 433, 438, 437, 423, 433, 391, 433, 422, 418, 445, 439, 433, 3135, 3102, 3101, 3098, 3086, 3095, 3087, 3128, 3091, 3098, 3093, 3093, 3102, 3095, 3122, 3103, 1985, 2016, 2019, 2020, 2032, 2025, 2033, 1957, 1990, 2029, 2020, 2027, 2027, 2016, 2025, 2769, 2759, 2764, 2758, 2800, 2759, 2757, 2763, 2769, 2774, 2768, 2755, 2774, 2763, 2765, 2764, 2806, 2765, 2801, 2759, 2768, 2772, 2759, 2768, 2712, 2690, 2315, 2367, 2304, 2351, 2356, 2339, 2340, 2343, 2357, 2339, 2325, 2339, 2356, 2352, 2351, 2341, 2339, 2293, 2274, 2282, 2280, 2291, 2274, 2250, 2274, 2292, 2292, 2278, 2272, 2274, 1785, 1741, 1744, 1746, 1669, 1695, 3010, 3062, 3017, 3046, 3069, 3050, 3053, 3054, 3068, 3050, 3036, 3050, 3069, 3065, 3046, 3052, 3050, 1622, 1662, 1640, 1640, 1658, 1660, 1662, 1595, 1621, 1652, 1647, 1650, 1661, 1650, 1656, 1658, 1647, 1650, 1652, 1653, 1595, 1625, 1652, 1663, 1634, 1569, 1595, 387, 408, 412, 402, 409, 1696, 1687, 1684, 1664, 1687, 1665, 1690, 1687, 1686, 1746, 1670, 1693, 1689, 1687, 1692, 1736, 1746, 755, 711, 760, 727, 716, 731, 732, 735, 717, 731, 749, 731, 716, 712, 727, 733, 731};
    private static final String CHANNEL_ID = C0181.m3459(m1470(), 0, C0444.f715 ^ (-840), 2551);
    private static final String TAG = C0433.m8486(m1470(), 16, C0221.f301 ^ (-764), 468);
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
        String str3 = "\u06e8\u06e2\u06e5";
        Intent intent = null;
        while (true) {
            switch (C0124.m2383(str3)) {
                case 56541:
                    xVar.f13106e = charSequenceM9088;
                    str3 = "\u06e2\u06e0\u06e1";
                    charSequenceM9089 = C0466.m9088(str2);
                    break;
                case 1746756:
                    notificationM3907.icon = R.mipmap.ic_launcher;
                    str3 = "\u06e7\u06e4";
                    charSequenceM9088 = C0466.m9088(str);
                    break;
                case 1746757:
                    i11 = 1140850946 ^ i10;
                    str3 = "\u06e2\u06e0\u06e5";
                    pendingIntentM4448 = C0231.m4448(this, 0, intent, i11);
                    break;
                case 1747780:
                    i11 = i10 ^ (-31);
                    str3 = "\u06e7\u06e0\u06e6";
                    strM3259 = C0170.m3259(sArr, 33, i11, 3195);
                    break;
                case 1747839:
                    Notification notificationM4749 = C0248.m4749(xVar);
                    C0277.m5360(notificationManager, 0, notificationM4749);
                    str3 = "\u06e6\u06e5\u06e4";
                    notificationM3907 = notificationM4749;
                    break;
                case 1747902:
                    C0071.m1454(intent, i11);
                    str3 = "\u06df\u06e1\u06e7";
                    i10 = C0219.f299;
                    break;
                case 1749603:
                    xVar.f13107f = charSequenceM9089;
                    str3 = "\u06e4\u06e7\u06e0";
                    i10 = C0317.f465;
                    break;
                case 1749607:
                    short[] sArrM1470 = m1470();
                    i10 = C0385.f656;
                    str3 = "\u06e0\u06e3\u06e7";
                    sArr = sArrM1470;
                    break;
                case 1749632:
                    str3 = "\u06e2\u06e8\u06e6";
                    notificationManager = (NotificationManager) C0401.m7876(this, cls);
                    break;
                case 1749756:
                    int i12 = i10 ^ (-463);
                    str = C0299.m5767(sArr, 49, i12, 1925);
                    str3 = "\u06e5\u06e5\u06df";
                    i11 = i12;
                    break;
                case 1749856:
                    short[] sArrM1471 = m1470();
                    i10 = C0191.f215;
                    str3 = "\u06e2\u06e5\u06df";
                    sArr = sArrM1471;
                    break;
                case 1751741:
                    int i13 = i10 ^ 325;
                    C0169.m3240(xVar, i13, true);
                    str3 = "\u06e7\u06e6\u06e5";
                    i11 = i13;
                    break;
                case 1752639:
                    i10 = C0231.f311;
                    str3 = "\u06e5\u06e7\u06e8";
                    i11 = i10 ^ (-200);
                    break;
                case 1752710:
                    C0266.m5095(notificationManager, new NotificationChannel(strM3259, str, i11));
                    str3 = "\u06e0\u06e5\u06e4";
                    break;
                case 1753605:
                    return;
                case 1754413:
                    x xVar2 = new x(this, strM3259);
                    notificationM3907 = C0204.m3907(xVar2);
                    str3 = "\u06df\u06e1\u06e6";
                    xVar = xVar2;
                    break;
                case 1754598:
                    xVar.f13108g = pendingIntentM4448;
                    str3 = "\u06e2\u06e1\u06df";
                    cls = NotificationManager.class;
                    break;
                case 1755435:
                    cls = MainActivity.class;
                    str3 = "\u06e6\u06e8\u06e0";
                    intent = new Intent(this, cls);
                    break;
                default:
                    i10 = C0343.f614;
                    str3 = "\u06e0\u06e7\u06e5";
                    i11 = 67109279 ^ i10;
                    break;
            }
        }
    }

    private final void sendRegistrationToServer(String str) {
        StringBuilder sb = new StringBuilder(C0317.m6156(m1470(), 64, C0269.f349 ^ (-481), 2722));
        C0142.m2728(sb, str);
        C0440.m8605(sb);
        C0190.m3630(m1470(), 90, C0386.f657 ^ (-656), 2374);
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
                    System.out.println(Long.decode(C0336.m6526("XfswYzK2O9Kd5jMjkKsNhoAVrj")));
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
        int iM6278 = C0324.m6278();
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
        int iM5722 = C0297.m5722();
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
        int iM4762 = C0248.m4762();
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
        C0375.m7360(remoteMessage, C0036.m713(m1470(), 107, C0214.f238 ^ 193, 2183));
        super.onMessageReceived(remoteMessage);
        String strM2107 = C0109.m2107(remoteMessage);
        StringBuilder sb = new StringBuilder(C0004.m89(m1470(), 120, C0232.f312 ^ 570, 1727));
        C0142.m2728(sb, strM2107);
        C0440.m8605(sb);
        C0054.m1043(m1470(), 126, C0229.f309 ^ (-226), 2959);
        RemoteMessage.Notification notificationM8722 = C0447.m8722(remoteMessage);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (notificationM8722 != null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    String strM7003 = C0357.m7003(notificationM8722);
                    StringBuilder sb2 = new StringBuilder(C0158.m3014(m1470(), 143, C0174.f198 ^ (-180), 1563));
                    C0142.m2728(sb2, strM7003);
                    C0440.m8605(sb2);
                    m1471(this, C0001.m28(notificationM8722), C0357.m7003(notificationM8722));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        String str2 = "\u06e8\u06e3\u06df";
        String strM5655 = null;
        short[] sArrM1470 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str2)) {
                case 56290:
                    C0451.m8805(strM5655, str);
                    str2 = "\u06e1\u06e1\u06e3";
                    break;
                case 56295:
                    strM5655 = C0293.m5655(sArrM1470, 175, i10, 1778);
                    str2 = "\u06df\u06e1";
                    break;
                case 56386:
                    return;
                case 1746781:
                    strM5655 = C0123.m2375(sArrM1470, 170, i10, 503);
                    str2 = "\u06e0\u06e8\u06e3";
                    break;
                case 1747650:
                    i10 = i11 ^ (-79);
                    str2 = "\u06df\u06e2\u06e0";
                    break;
                case 1748675:
                    str2 = "\u06e2\u06df\u06e6";
                    sArrM1470 = m1470();
                    break;
                case 1748864:
                    C0305.m5885(sArrM1470, 192, i10, 702);
                    str2 = "\u06e8\u06e1\u06e0";
                    break;
                case 1749577:
                    str2 = "\u06e2\u06e3\u06e1";
                    i11 = C0322.f470;
                    break;
                case 1749696:
                    i10 = i11 ^ 110;
                    str2 = "\u06e1\u06e7\u06e6";
                    break;
                case 1751586:
                    super.onNewToken(str);
                    str2 = "\u06e7\u06e8\u06e4";
                    break;
                case 1751656:
                    str2 = "\u06e8\u06e7\u06e4";
                    i11 = C0269.f349;
                    break;
                case 1754659:
                    str2 = "\u06e4\u06e4\u06e8";
                    sArrM1470 = m1470();
                    break;
                case 1755339:
                    str2 = "\u06e0\u06df\u06e1";
                    i11 = C0019.f39;
                    break;
                case 1755399:
                    m1469(this, str);
                    str2 = "\u06e2\u06e4";
                    break;
                case 1755460:
                    str2 = "\u06e8\u06df\u06e2";
                    sArrM1470 = m1470();
                    break;
                case 1755589:
                    i10 = i11 ^ (-492);
                    str2 = "\u06df\u06e6";
                    break;
                default:
                    C0375.m7360(str, strM5655);
                    str2 = "\u06e4\u06e2\u06e0";
                    break;
            }
        }
    }
}
