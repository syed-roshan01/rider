package com.auto.accept.service;

import a6.C0007;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.ui.draw.C0028;
import com.google.android.gms.common.api.internal.C0083;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d5.C0219;
import dagger.hilt.android.components.C0229;
import e2.C0263;
import g2.C0287;
import h4.C0305;
import n.C0361;
import o7.i2;
import p3.C0376;
import t1.C0420;
import u7.C0438;
import z.C0481;

/* JADX INFO: loaded from: classes.dex */
public final class BootReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f99short = {1873, 1885, 1884, 1862, 1879, 1866, 1862, 2132, 2131, 2121, 2136, 2131, 2121, 1878, 1881, 1875, 1861, 1880, 1886, 1875, 1817, 1886, 1881, 1859, 1874, 1881, 1859, 1817, 1878, 1876, 1859, 1886, 1880, 1881, 1817, 1909, 1912, 1912, 1891, 1896, 1908, 1912, 1914, 1895, 1915, 1906, 1891, 1906, 1907, 1536, 1581, 1581, 1590, 1552, 1575, 1569, 1575, 1579, 1588, 1575, 1584, 2931, 2910, 2910, 2885, 2833, 2898, 2910, 2908, 2881, 2909, 2900, 2885, 2900, 2901, 2833, 2844, 2833, 2896, 2898, 2898, 2900, 2882, 2882, 2904, 2899, 2904, 2909, 2904, 2885, 2888, 2833, 2882, 2900, 2883, 2887, 2904, 2898, 2900, 2833, 2883, 2900, 2882, 2885, 2896, 2883, 2885, 2882, 2833, 2896, 2884, 2885, 2910, 2908, 2896, 2885, 2904, 2898, 2896, 2909, 2909, 2888};

    public BootReceiver() {
        int iM7073 = C0361.m7073();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7073 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0168.m3220("iVjHxGPyU6d36WHqP6XFHp")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m1467() {
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
                    return f99short;
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

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C0376.m7360(context, C0022.m430(m1467(), 0, C0438.f708 ^ (-850), 1842));
        C0376.m7360(intent, C0007.m155(m1467(), 7, C0028.f48 ^ 381, 2109));
        boolean zM4399 = C0229.m4399(C0219.m4226(intent), C0173.m3297(m1467(), 13, C0287.f431 ^ 320, 1847));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = zM4399 ? 1709 : 1678;
                    break;
                case 204:
                    C0263.m5010(m1467(), 49, C0124.f150 ^ (-98), 1602);
                    C0420.m8250(m1467(), 61, C0481.f754 ^ (-657), 2865);
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        int iM1779 = C0083.m1779();
        int i11 = 1740;
        while (true) {
            i11 ^= 1757;
            switch (i11) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM1779 <= 0) {
                        i11 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    return;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    System.out.println(Double.valueOf(C0305.m5879("Ntc5xBmj2gYpzO")));
                    return;
                default:
                    continue;
            }
            i11 = 1802;
        }
    }
}
