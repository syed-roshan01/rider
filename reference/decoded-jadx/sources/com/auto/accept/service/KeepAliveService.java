package com.auto.accept.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.C0019;
import androidx.compose.foundation.C0026;
import b7.C0054;
import c7.C0069;
import com.auto.accept.ui.MainActivity;
import com.google.android.datatransport.cct.C0077;
import com.google.android.gms.common.api.internal.C0083;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.C0127;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.iid.C0169;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.tracing.C0204;
import com.ride.accepter.R;
import d9.C0224;
import dagger.hilt.android.C0240;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.internal.componenttreedeps.C0248;
import e8.C0265;
import e9.C0266;
import g.C0284;
import g8.C0293;
import h1.C0300;
import h7.C0311;
import k3.C0335;
import l6.C0344;
import n7.C0363;
import o7.i2;
import q0.C0382;
import q2.x;
import r.C0392;
import r6.C0401;
import r9.C0405;
import v8.C0450;
import x0.C0466;
import x2.C0467;
import x7.C0471;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public final class KeepAliveService extends Service {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f100short = {2352, 2347, 2342, 2343, 2333, 2339, 2337, 2337, 2343, 2354, 2358, 2343, 2352, 2333, 2345, 2343, 2343, 2354, 2339, 2350, 2347, 2356, 2343, 1271, 1228, 1217, 1216, 1157, 1252, 1222, 1222, 1216, 1237, 1233, 1216, 1239, 1157, 1252, 1222, 1233, 1228, 1235, 1216, 2547, 2525, 2525, 2504, 2507, 2456, 2538, 2513, 2524, 2525, 2456, 2553, 2523, 2523, 2525, 2504, 2508, 2525, 2506, 2456, 2506, 2509, 2518, 2518, 2513, 2518, 2527, 2456, 2513, 2518, 2456, 2508, 2512, 2525, 2456, 2522, 2521, 2523, 2515, 2527, 2506, 2519, 2509, 2518, 2524, 1331, 1297, 1296, 1303, 1290, 1297, 1292, 1303, 1296, 1305, 1374, 1304, 1297, 1292, 1374, 1292, 1303, 1306, 1307, 1374, 1292, 1307, 1295, 1291, 1307, 1293, 1290, 1293, 1360, 1360, 1360, 899, 917, 898, 902, 921, 915, 917, 1128, 1151, 1123, 1126, 1134, 1058, 1060, 1060, 1060, 1059};

    public KeepAliveService() {
        int iM2227 = C0115.m2227();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2227 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0471.m9181("0WoF56B0CFXXbeoV")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۥۥۤۦ, reason: contains not printable characters */
    public static short[] m1468() {
        int iM3170 = C0166.m3170();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3170 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f100short;
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

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        String strM9556 = C0490.m9556(m1468(), 0, C0190.f214 ^ (-52), 2370);
        String strM5777 = C0300.m5777(m1468(), 23, C0069.f89 ^ (-830), 1189);
        int i10 = C0026.f46 ^ (-315);
        NotificationChannel notificationChannel = new NotificationChannel(strM9556, strM5777, i10);
        C0127.m2454(notificationChannel, C0363.m7119(m1468(), 43, C0054.f74 ^ 355, 2488));
        C0120.m2308(notificationChannel, false);
        NotificationManager notificationManager = (NotificationManager) C0401.m7876(this, NotificationManager.class);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = notificationManager != null ? 1709 : 1678;
                    break;
                case 204:
                    C0266.m5095(notificationManager, notificationChannel);
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        C0019.m383(intent, (-536871595) ^ C0450.f721);
        PendingIntent pendingIntentM4448 = C0231.m4448(this, 0, intent, (-201327008) ^ C0467.f738);
        x xVar = new x(this, strM9556);
        xVar.f13106e = C0466.m9088(strM5777);
        xVar.f13107f = C0466.m9088(C0240.m4608(m1468(), 88, C0382.f653 ^ 818, 1406));
        C0204.m3907(xVar).icon = R.drawable.ic_launcher_foreground;
        xVar.f13108g = pendingIntentM4448;
        C0169.m3240(xVar, i10, true);
        xVar.f13111j = -1;
        xVar.f13115n = C0265.m5070(m1468(), 119, C0284.f429 ^ 991, 1008);
        Notification notificationM4749 = C0248.m4749(xVar);
        C0335.m6501(notificationM4749, C0224.m4328(m1468(), 126, C0344.f615 ^ 706, 1034));
        C0392.m7691(this, C0405.f676 ^ 953, notificationM4749);
        int iM3030 = C0159.m3030();
        int i12 = 1740;
        while (true) {
            i12 ^= 1757;
            switch (i12) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM3030 >= 0) {
                        i12 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    return;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    System.out.println(Long.parseLong(C0083.m1792("8d3595rCuNA8cNaOFpZj5BZrwpM")));
                    return;
                default:
                    continue;
            }
            i12 = 1802;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C0311.m6024(this, 1);
        int iM5656 = C0293.m5656();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5656 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0077.m1662("3TC9Z93TH49Hs1opUJ8V6xI")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        return 1;
    }
}
