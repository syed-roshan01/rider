package k6;

import a.C0000;
import a0.C0003;
import a2.C0004;
import a3.C0006;
import a7.C0008;
import a8.C0009;
import a8.C0010;
import aa.C0012;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.C0014;
import android.support.v4.graphics.drawable.C0016;
import androidx.annotation.C0019;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.draw.C0028;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.graphics.C0031;
import androidx.compose.ui.input.key.C0033;
import androidx.compose.ui.layout.C0035;
import androidx.compose.ui.semantics.C0039;
import androidx.startup.C0047;
import b1.C0050;
import b7.C0053;
import c0.C0056;
import c0.C0057;
import c1.C0059;
import c1.C0061;
import c3.C0062;
import c4.C0064;
import c7.C0068;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.C0074;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.measurement.zzbx;
import com.google.android.play.core.integrity.client.C0107;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.C0205;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.iid.C0171;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.inject.C0172;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.remoteconfig.internal.Code;
import d.C0210;
import d5.C0218;
import d9.C0223;
import dagger.hilt.C0255;
import dagger.hilt.android.C0240;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.codegen.C0242;
import dagger.hilt.internal.aliasof.C0247;
import dagger.hilt.migration.C0254;
import e1.C0258;
import e1.C0259;
import e2.C0260;
import e2.C0262;
import f.C0269;
import f.C0270;
import f0.C0272;
import f6.C0278;
import fa.C0281;
import g.C0284;
import g0.C0285;
import g5.C0290;
import ga.C0295;
import h3.C0302;
import h8.C0313;
import i5.C0318;
import i6.C0319;
import i6.C0320;
import i9.C0321;
import j3.C0325;
import j5.C0327;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import k.C0331;
import k2.C0333;
import k3.C0335;
import k7.C0337;
import k8.C0338;
import l0.C0339;
import l3.C0342;
import m1.C0350;
import m1.C0351;
import m7.C0357;
import p7.C0378;
import q6.C0388;
import r.C0392;
import r2.C0394;
import r2.C0397;
import r5.C0400;
import rikka.shizuku.C0406;
import s0.C0409;
import s2.C0411;
import s3.C0412;
import s6.C0413;
import s8.C0416;
import t1.C0419;
import t2.C0420;
import u1.C0431;
import u4.C0436;
import u8.C0438;
import v8.C0450;
import w.C0453;
import w0.C0454;
import w5.C0463;
import w9.C0465;
import x7.C0472;
import y.C0475;
import z.C0480;
import z3.C0485;
import z3.C0487;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public final class h5 extends zzbx implements y3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f548short = {3110, 3114, 3112, 3179, 3106, 3114, 3114, 3106, 3113, 3104, 3179, 3108, 3115, 3105, 3127, 3114, 3116, 3105, 3179, 3106, 3112, 3126, 3179, 3112, 3104, 3108, 3126, 3120, 3127, 3104, 3112, 3104, 3115, 3121, 3179, 3116, 3115, 3121, 3104, 3127, 3115, 3108, 3113, 3179, 3084, 3080, 3104, 3108, 3126, 3120, 3127, 3104, 3112, 3104, 3115, 3121, 3094, 3104, 3127, 3123, 3116, 3110, 3104, 2321, 2333, 2335, 2396, 2325, 2333, 2333, 2325, 2334, 2327, 2396, 2323, 2332, 2326, 2304, 2333, 2331, 2326, 2396, 2325, 2335, 2305, 3288, 3299, 3302, 3299, 3298, 3322, 3299, 3245, 3310, 3308, 3297, 3297, 3300, 3299, 3306, 3245, 3325, 3308, 3310, 3302, 3308, 3306, 3304, 3245, 3299, 3308, 3296, 3304, 3245, 3242, 3240, 3326, 3242, 3235, 2751, 2711, 2707, 2689, 2695, 2688, 2711, 2719, 2711, 2716, 2694, 2770, 2721, 2711, 2688, 2692, 2715, 2705, 2711, 2770, 2705, 2707, 2718, 2718, 2711, 2710, 2770, 2693, 2715, 2694, 2714, 2770, 2715, 2716, 2692, 2707, 2718, 2715, 2710, 2770, 2705, 2707, 2718, 2718, 2715, 2716, 2709, 2770, 2690, 2707, 2705, 2713, 2707, 2709, 2711, 2780, 2770, 2707, 2690, 2690, 2747, 2710, 3307, 3267, 3271, 3285, 3283, 3284, 3267, 3275, 3267, 3272, 3282, 3206, 3317, 3267, 3284, 3280, 3279, 3269, 3267, 3206, 3269, 3271, 3274, 3274, 3267, 3266, 3206, 3281, 3279, 3282, 3278, 3273, 3283, 3282, 3206, 3271, 3286, 3286, 3206, 3286, 3271, 3269, 3277, 3271, 3265, 3267, 1948, 1979, 1971, 1974, 1983, 1982, 2042, 1966, 1973, 2042, 1981, 1983, 1966, 2042, 1966, 1960, 1971, 1981, 1981, 1983, 1960, 2042, 1935, 1928, 1939, 1961, 2036, 2042, 1979, 1962, 1962, 1939, 1982, 543, 568, 560, 565, 572, 573, 633, 557, 566, 633, 574, 572, 557, 633, 570, 566, 567, 554, 572, 567, 557, 631, 633, 568, 553, 553, 528, 573, 922, 957, 949, 944, 953, 952, 1020, 936, 947, 1020, 941, 937, 953, 942, 933, 1020, 937, 943, 953, 942, 1020, 940, 942, 947, 940, 953, 942, 936, 949, 953, 943, 1010, 1020, 957, 940, 940, 917, 952, 1116, 1147, 1139, 1142, 1151, 1150, 1082, 1134, 1141, 1082, 1149, 1151, 1134, 1082, 1135, 1129, 1151, 1128, 1082, 1130, 1128, 1141, 1130, 1151, 1128, 1134, 1139, 1151, 1129, 1082, 1147, 1129, 1076, 1082, 1147, 1130, 1130, 1107, 1150, 2065, 2098, 2106, 2173, 2108, 2099, 2105, 2173, 2111, 2088, 2099, 2105, 2097, 2104, 2163, 2173, 2104, 2091, 2104, 2099, 2089, 405, 438, 446, 505, 440, 439, 445, 505, 443, 428, 439, 445, 437, 444, 505, 427, 444, 429, 428, 427, 439, 444, 445, 505, 439, 428, 437, 437, 503, 505, 440, 425, 425, 400, 445, 423, 388, 396, 459, 394, 389, 399, 459, 393, 414, 389, 399, 391, 398, 459, 411, 409, 388, 392, 398, 408, 408, 398, 399, 453, 459, 398, 413, 398, 389, 415, 455, 459, 408, 386, 401, 398, 455, 459, 415, 386, 390, 398, 436, 390, 408, 1812, 1843, 1851, 1854, 1847, 1846, 1906, 1830, 1853, 1906, 1854, 1853, 1845, 1906, 1843, 1852, 1846, 1906, 1840, 1831, 1852, 1846, 1854, 1847, 1916, 1906, 1843, 1826, 1826, 1819, 1846, 1918, 1906, 1847, 1828, 1847, 1852, 1830, 1918, 1906, 1847, 1824, 1824, 1853, 1824, 2215, 2176, 2184, 2189, 2180, 2181, 2241, 2197, 2190, 2241, 2182, 2180, 2197, 2241, 2178, 2190, 2191, 2181, 2184, 2197, 2184, 2190, 2191, 2176, 2189, 2241, 2196, 2194, 2180, 2195, 2241, 2193, 2195, 2190, 2193, 2180, 2195, 2197, 2184, 2180, 2194, 1438, 1465, 1457, 1460, 1469, 1468, 1528, 1452, 1463, 1528, 1471, 1469, 1452, 1528, 1465, 1448, 1448, 1528, 1457, 1462, 1451, 1452, 1465, 1462, 1467, 1469, 1528, 1457, 1468, 1526, 1528, 1465, 1448, 1448, 1425, 1468, 1165, 1194, 1186, 1191, 1198, 1199, 1259, 1215, 1188, 1259, 1196, 1198, 1215, 1259, 1192, 1188, 1189, 1199, 1186, 1215, 1186, 1188, 1189, 1194, 1191, 1259, 1214, 1208, 1198, 1209, 1259, 1211, 1209, 1188, 1211, 1198, 1209, 1215, 1186, 1198, 1208, 1259, 1194, 1208, 2139, 2172, 2164, 2161, 2168, 2169, 2109, 2153, 2162, 2109, 2170, 2168, 2153, 2109, 2152, 2158, 2168, 2159, 2109, 2157, 2159, 2162, 2157, 2168, 2159, 2153, 2164, 2168, 2158, 2099, 2109, 2172, 2157, 2157, 2132, 2169};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7 f10081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f10082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10083c;

    public h5(p7 p7Var) {
        super(C0029.m565(m6560(), 0, C0295.f443 ^ 100, 3141));
        C0270.m5173(p7Var);
        this.f10081a = p7Var;
        this.f10083c = null;
        int iM598 = C0031.m598();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM598 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0161.m3079("FgJMlQBIG8innYlM")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static short[] m6560() {
        int iM6645 = C0338.m6645();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6645 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f548short;
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

    public final void a(Runnable runnable) {
        p7 p7VarM5151 = C0269.m5151(this);
        boolean zM766 = C0039.m766(C0485.m9461(p7VarM5151));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM766) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    C0035.m683(runnable);
                    int iM4453 = C0231.m4453();
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM4453 >= 0) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                System.out.println(Long.parseLong(C0010.m204("aL")));
                                return;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    C0342.m6719(C0485.m9461(p7VarM5151), runnable);
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final void b(String str, boolean z10) {
        boolean z11 = true;
        boolean zM1883 = C0088.m1883(str);
        p7 p7VarM5151 = C0269.m5151(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM1883) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = z10 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                try {
                                    Boolean boolM9352 = C0480.m9352(this);
                                    int i12 = 1864;
                                    while (true) {
                                        i12 ^= 1881;
                                        switch (i12) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i12 = boolM9352 == null ? 48736 : 48705;
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                boolean zM321 = C0016.m321(C0272.m5240(m6560(), 63, C0132.f158 ^ (-193), 2418), C0185.m3536(this));
                                                int i13 = 48767;
                                                while (true) {
                                                    i13 ^= 48784;
                                                    switch (i13) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            break;
                                                        case 76:
                                                            boolean zM6633 = C0337.m6633(C0319.m6184(C0313.m6073(p7VarM5151)), C0242.m4651());
                                                            int i14 = 48891;
                                                            while (true) {
                                                                i14 ^= 48908;
                                                                switch (i14) {
                                                                    case 22:
                                                                        break;
                                                                    case 53:
                                                                        break;
                                                                    case 503:
                                                                        i14 = !zM6633 ? 49635 : 48953;
                                                                        break;
                                                                    case 32495:
                                                                        boolean zM3227 = C0168.m3227(C0295.m5682(C0319.m6184(C0313.m6073(p7VarM5151))), C0242.m4651());
                                                                        int i15 = 49666;
                                                                        while (true) {
                                                                            i15 ^= 49683;
                                                                            switch (i15) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i15 = zM3227 ? 49759 : 49728;
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                case 76:
                                                                                    int i16 = 49790;
                                                                                    while (true) {
                                                                                        i16 ^= 49807;
                                                                                        switch (i16) {
                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
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
                                                                                    z11 = false;
                                                                                    int i17 = 49914;
                                                                                    while (true) {
                                                                                        i17 ^= 49931;
                                                                                        switch (i17) {
                                                                                            case 497:
                                                                                                i17 = 50596;
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
                                                            break;
                                                        case 239:
                                                            i13 = !zM321 ? 48860 : 48829;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                this.f10082b = C0009.m192(z11);
                                                break;
                                            case 47483:
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    boolean zM14 = C0000.m14(C0480.m9352(this));
                                    int i18 = 50813;
                                    while (true) {
                                        i18 ^= 50830;
                                        switch (i18) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 53:
                                                return;
                                            case 243:
                                                i18 = !zM14 ? 51557 : 50875;
                                                break;
                                            case 4075:
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                } catch (SecurityException e4) {
                                    int i19 = 50689;
                                    while (true) {
                                        i19 ^= 50706;
                                        switch (i19) {
                                            case 19:
                                                i19 = 50720;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                C0419.m8245(C0454.m8871(C0327.m6333(p7VarM5151)), C0269.m5144(m6560(), 119, C0331.f479 ^ 313, 2802), C0027.m535(str));
                                                throw e4;
                                        }
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    String strM3536 = C0185.m3536(this);
                    int i20 = 51588;
                    while (true) {
                        i20 ^= 51605;
                        switch (i20) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i20 = strM3536 == null ? 51681 : 51650;
                                break;
                            case 54:
                                break;
                            case 87:
                                break;
                            case 116:
                                Context contextM6184 = C0319.m6184(C0313.m6073(p7VarM5151));
                                int iM4651 = C0242.m4651();
                                C0247.m4734();
                                boolean zM9069 = C0465.m9069(iM4651, contextM6184, str);
                                int i21 = 51712;
                                while (true) {
                                    i21 ^= 51729;
                                    switch (i21) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i21 = zM9069 ? 51805 : 51774;
                                            break;
                                        case 47:
                                            break;
                                        case 76:
                                            this.f10083c = str;
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
                    boolean zM322 = C0016.m321(str, C0185.m3536(this));
                    int i22 = 51836;
                    while (true) {
                        i22 ^= 51853;
                        switch (i22) {
                            case 241:
                                i22 = zM322 ? 52580 : 52549;
                                break;
                            case 1963:
                                break;
                            case 1992:
                                String strM3556 = C0186.m3556(m6560(), 85, C0339.f610 ^ (-1003), 3213);
                                Object[] objArr = new Object[1];
                                objArr[C0284.f429 ^ 984] = str;
                                throw new SecurityException(C0190.m3635(strM3556, objArr));
                            case 2025:
                                return;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    f4 f4VarM8871 = C0454.m8871(C0327.m6333(p7VarM5151));
                    String strM6468 = C0333.m6468(m6560(), 181, C0258.f338 ^ 714, 3238);
                    C0135.m2604(f4VarM8871, strM6468);
                    throw new SecurityException(strM6468);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // k6.y3
    public final List c(Bundle bundle, x7 x7Var) {
        C0321.m6222(this, x7Var);
        String strM1624 = C0074.m1624(x7Var);
        C0270.m5173(strM1624);
        p7 p7VarM5151 = C0269.m5151(this);
        try {
            return (List) C0010.m202(C0003.m69(C0485.m9461(p7VarM5151), new m5(this, x7Var, bundle, 1)));
        } catch (InterruptedException e4) {
            e = e4;
            d4 d4VarM6333 = C0327.m6333(p7VarM5151);
            C0112.m2169(C0454.m8871(d4VarM6333), C0487.m9485(m6560(), 227, C0031.f51 ^ (-185), 2010), C0027.m535(strM1624), e);
            return C0160.m3062();
        } catch (ExecutionException e10) {
            e = e10;
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i10 = 1647;
                        continue;
                    default:
                        continue;
                }
                d4 d4VarM6334 = C0327.m6333(p7VarM5151);
                C0112.m2169(C0454.m8871(d4VarM6334), C0487.m9485(m6560(), 227, C0031.f51 ^ (-185), 2010), C0027.m535(strM1624), e);
                return C0160.m3062();
            }
        }
    }

    @Override // k6.y3
    /* JADX INFO: renamed from: c */
    public final void mo6534c(Bundle bundle, x7 x7Var) {
        String str = "\u06e1\u06e0\u06e0";
        String strM1624 = null;
        y2.a aVar = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748641:
                    C0321.m6222(this, x7Var);
                    str = "\u06e2\u06e3\u06e2";
                    break;
                case 1748734:
                    str = "\u06e7\u06e7\u06e5";
                    i11 = i10 ^ (-939);
                    break;
                case 1749697:
                    strM1624 = C0074.m1624(x7Var);
                    str = "\u06e6\u06e4\u06e6";
                    break;
                case 1750534:
                    return;
                case 1752584:
                    i10 = C0064.f84;
                    str = "\u06e1\u06e3\u06e0";
                    break;
                case 1753635:
                    C0218.m4213(this, aVar);
                    str = "\u06e3\u06df\u06e2";
                    break;
                case 1754629:
                    str = "\u06e6\u06e6\u06e3";
                    aVar = new y2.a((Object) this, (Object) strM1624, (Parcelable) bundle, i11);
                    break;
                default:
                    C0270.m5173(strM1624);
                    str = "\u06e5\u06e3\u06e6";
                    break;
            }
        }
    }

    @Override // k6.y3
    public final j d(x7 x7Var) {
        C0321.m6222(this, x7Var);
        String strM1624 = C0074.m1624(x7Var);
        C0281.m5438(strM1624);
        boolean zM2823 = C0147.m2823();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM2823) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    p7 p7VarM5151 = C0269.m5151(this);
                    try {
                        return (j) C0335.m6506(C0378.m7418(C0485.m9461(p7VarM5151), new l5(0, this, x7Var)), 9745 ^ ((long) C0075.f109), C0472.m9196());
                    } catch (InterruptedException e4) {
                        e = e4;
                        int i11 = 1864;
                        while (true) {
                            i11 ^= 1881;
                            switch (i11) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = 48674;
                                    break;
                                case 47483:
                                    d4 d4VarM6333 = C0327.m6333(p7VarM5151);
                                    C0112.m2169(C0454.m8871(d4VarM6333), C0388.m7613(m6560(), 260, C0162.f186 ^ 856, 601), C0027.m535(strM1624), e);
                                    return new j(null);
                            }
                        }
                    } catch (ExecutionException e10) {
                        e = e10;
                        int i12 = 1740;
                        while (true) {
                            i12 ^= 1757;
                            switch (i12) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = 1771;
                                    continue;
                                case 54:
                                    break;
                                default:
                                    continue;
                            }
                            d4 d4VarM6334 = C0327.m6333(p7VarM5151);
                            C0112.m2169(C0454.m8871(d4VarM6334), C0388.m7613(m6560(), 260, C0162.f186 ^ 856, 601), C0027.m535(strM1624), e);
                            return new j(null);
                        }
                    } catch (TimeoutException e11) {
                        e = e11;
                        d4 d4VarM6335 = C0327.m6333(p7VarM5151);
                        C0112.m2169(C0454.m8871(d4VarM6335), C0388.m7613(m6560(), 260, C0162.f186 ^ 856, 601), C0027.m535(strM1624), e);
                        return new j(null);
                    }
                    break;
                case 239:
                    return new j(null);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x008c A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x007d. Please report as an issue. */
    @Override // k6.y3
    public final List e(String str, String str2, boolean z10, x7 x7Var) {
        int i10;
        C0321.m6222(this, x7Var);
        String strM1624 = C0074.m1624(x7Var);
        C0270.m5173(strM1624);
        p7 p7VarM5151 = C0269.m5151(this);
        try {
            List list = (List) C0010.m202(C0003.m69(C0485.m9461(p7VarM5151), new k5(this, strM1624, str, str2, 0)));
            ArrayList arrayList = new ArrayList(C0008.m171(list));
            Iterator itM2089 = C0107.m2089(list);
            while (true) {
                boolean zM3327 = C0174.m3327(itM2089);
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i11 = zM3327 ? 1709 : 1678;
                            break;
                        case 204:
                            break;
                        case 239:
                            return arrayList;
                        default:
                            break;
                    }
                }
                v7 v7Var = (v7) C0413.m8115(itM2089);
                int i12 = 1740;
                while (true) {
                    i12 ^= 1757;
                    switch (i12) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i12 = !z10 ? 1833 : 1802;
                            break;
                        case 54:
                            break;
                        case 471:
                            C0357.m6998(arrayList, new t7(v7Var));
                            i10 = 49790;
                            while (true) {
                                i10 ^= 49807;
                                switch (i10) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 241:
                                        i10 = 49821;
                                        break;
                                }
                            }
                            break;
                        case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                            boolean zM9580 = C0492.m9580(C0320.m6207(v7Var));
                            int i13 = 1864;
                            while (true) {
                                i13 ^= 1881;
                                switch (i13) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i13 = !zM9580 ? 48736 : 48705;
                                        break;
                                    case 47384:
                                        break;
                                    case 47417:
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
                                            C0357.m6998(arrayList, new t7(v7Var));
                                            i10 = 49790;
                                            while (true) {
                                                i10 ^= 49807;
                                                switch (i10) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        continue;
                                                        continue;
                                                    case 241:
                                                        i10 = 49821;
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
                            break;
                        default:
                            break;
                    }
                }
            }
        } catch (InterruptedException e4) {
            e = e4;
            int i15 = 49666;
            while (true) {
                i15 ^= 49683;
                switch (i15) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i15 = 49697;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        C0112.m2169(C0454.m8871(C0327.m6333(p7VarM5151)), C0492.m9575(m6560(), 288, C0210.f234 ^ 335, 988), C0027.m535(strM1624), e);
                        return C0160.m3062();
                }
            }
        } catch (ExecutionException e10) {
            e = e10;
            int i16 = 48891;
            while (true) {
                i16 ^= 48908;
                switch (i16) {
                    case 22:
                        C0112.m2169(C0454.m8871(C0327.m6333(p7VarM5151)), C0492.m9575(m6560(), 288, C0210.f234 ^ 335, 988), C0027.m535(strM1624), e);
                        return C0160.m3062();
                    case 503:
                        i16 = 48922;
                        break;
                    default:
                        break;
                }
            }
        }
    }

    @Override // k6.y3
    public final void f(x7 x7Var) {
        i5 i5Var = null;
        String str = "\u06e5\u06e1\u06e2";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1749788:
                    i5Var = new i5(this, x7Var, 1);
                    str = "\u06df\u06e1\u06e0";
                    break;
                case 1751524:
                    return;
                case 1752518:
                    C0321.m6222(this, x7Var);
                    str = "\u06e2\u06e6\u06e0";
                    break;
                default:
                    C0218.m4213(this, i5Var);
                    str = "\u06e4\u06e0\u06e0";
                    break;
            }
        }
    }

    @Override // k6.y3
    public final void g(v vVar, x7 x7Var) {
        y2.a aVar = null;
        String str = "\u06e5\u06df\u06e4";
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746938:
                    return;
                case 1748893:
                    i10 = i11 ^ 884;
                    str = "\u06e7\u06e2\u06e4";
                    break;
                case 1748896:
                    C0218.m4213(this, aVar);
                    str = "\u06df\u06e7\u06e2";
                    break;
                case 1750664:
                    str = "\u06e1\u06e8\u06e4";
                    i11 = C0453.f724;
                    break;
                case 1754473:
                    aVar = new y2.a((Object) this, (Object) vVar, (Object) x7Var, i10);
                    str = "\u06e1\u06e8\u06e7";
                    break;
                case 1754502:
                    C0321.m6222(this, x7Var);
                    str = "\u06e3\u06e3\u06e8";
                    break;
                default:
                    C0270.m5173(vVar);
                    str = "\u06e7\u06e3\u06e2";
                    break;
            }
        }
    }

    @Override // k6.y3
    public final void h(String str, String str2, long j10, String str3) {
        j5 j5Var = null;
        String str4 = "\u06e4\u06e1\u06e3";
        while (true) {
            switch (C0124.m2383(str4)) {
                case 1747716:
                    C0218.m4213(this, j5Var);
                    str4 = "\u06e4\u06e0\u06e1";
                    break;
                case 1751525:
                    return;
                default:
                    j5Var = new j5(this, str2, str3, str, j10, 0);
                    str4 = "\u06e0\u06e1\u06e5";
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x008a A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x007b. Please report as an issue. */
    @Override // k6.y3
    public final List i(String str, String str2, String str3, boolean z10) {
        int i10;
        C0454.m8863(this, str, true);
        p7 p7VarM5151 = C0269.m5151(this);
        try {
            List list = (List) C0010.m202(C0003.m69(C0485.m9461(p7VarM5151), new k5(this, str, str2, str3, C0436.f707 ^ (-283))));
            ArrayList arrayList = new ArrayList(C0008.m171(list));
            Iterator itM2089 = C0107.m2089(list);
            while (true) {
                boolean zM3327 = C0174.m3327(itM2089);
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i11 = zM3327 ? 1709 : 1678;
                            break;
                        case 204:
                            break;
                        case 239:
                            return arrayList;
                        default:
                            break;
                    }
                }
                v7 v7Var = (v7) C0413.m8115(itM2089);
                int i12 = 1740;
                while (true) {
                    i12 ^= 1757;
                    switch (i12) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i12 = !z10 ? 1833 : 1802;
                            break;
                        case 54:
                            break;
                        case 471:
                            C0357.m6998(arrayList, new t7(v7Var));
                            i10 = 49790;
                            while (true) {
                                i10 ^= 49807;
                                switch (i10) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 241:
                                        i10 = 49821;
                                        break;
                                }
                            }
                            break;
                        case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                            boolean zM9580 = C0492.m9580(C0320.m6207(v7Var));
                            int i13 = 1864;
                            while (true) {
                                i13 ^= 1881;
                                switch (i13) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i13 = !zM9580 ? 48736 : 48705;
                                        break;
                                    case 47384:
                                        break;
                                    case 47417:
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
                                            C0357.m6998(arrayList, new t7(v7Var));
                                            i10 = 49790;
                                            while (true) {
                                                i10 ^= 49807;
                                                switch (i10) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        continue;
                                                        continue;
                                                    case 241:
                                                        i10 = 49821;
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
                            break;
                        default:
                            break;
                    }
                }
            }
        } catch (InterruptedException e4) {
            e = e4;
            int i15 = 49666;
            while (true) {
                i15 ^= 49683;
                switch (i15) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i15 = 49697;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        C0112.m2169(C0454.m8871(C0327.m6333(p7VarM5151)), C0262.m5010(m6560(), 326, C0028.f48 ^ 348, 1050), C0027.m535(str), e);
                        return C0160.m3062();
                }
            }
        } catch (ExecutionException e10) {
            e = e10;
            int i16 = 48891;
            while (true) {
                i16 ^= 48908;
                switch (i16) {
                    case 22:
                        C0112.m2169(C0454.m8871(C0327.m6333(p7VarM5151)), C0262.m5010(m6560(), 326, C0028.f48 ^ 348, 1050), C0027.m535(str), e);
                        return C0160.m3062();
                    case 503:
                        i16 = 48922;
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public final void j(x7 x7Var) {
        C0270.m5173(x7Var);
        String strM1624 = C0074.m1624(x7Var);
        C0281.m5438(strM1624);
        C0454.m8863(this, strM1624, false);
        C0416.m8188(C0472.m9198(C0269.m5151(this)), C0138.m2678(x7Var), C0016.m311(x7Var));
        int iM1322 = C0068.m1322();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1322 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0059.m1125("jpo")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x00ab. Please report as an issue. */
    @Override // k6.y3
    public final byte[] k(v vVar, String str) {
        byte[] bArr;
        C0281.m5438(str);
        C0270.m5173(vVar);
        C0454.m8863(this, str, true);
        p7 p7VarM5151 = C0269.m5151(this);
        d4 d4VarM6333 = C0327.m6333(p7VarM5151);
        f5 f5VarM6073 = C0313.m6073(p7VarM5151);
        c4 c4VarM3266 = C0171.m3266(f5VarM6073);
        String strM5389 = C0278.m5389(vVar);
        C0419.m8245(C0465.m9073(d4VarM6333), C0231.m4443(m6560(), 365, C0062.f82 ^ 343, 2141), C0174.m3320(c4VarM3266, strM5389));
        C0014.m280((e6.c) C0463.m9025(p7VarM5151));
        long jM194 = C0010.m194() / 1000000;
        try {
            byte[] bArr2 = (byte[]) C0010.m202(C0378.m7418(C0485.m9461(p7VarM5151), new m5(this, vVar, str, 0)));
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i10 = bArr2 == null ? 1709 : 1678;
                        break;
                    case 204:
                        C0419.m8245(C0454.m8871(C0327.m6333(p7VarM5151)), C0056.m1071(m6560(), 386, C0302.f450 ^ (-377), 473), C0027.m535(str));
                        bArr = new byte[0];
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
                        bArr = bArr2;
                        break;
                    default:
                        break;
                }
            }
            C0014.m280((e6.c) C0463.m9025(p7VarM5151));
            C0237.m4564(C0465.m9073(C0327.m6333(p7VarM5151)), C0411.m8071(m6560(), 421, C0141.f167 ^ 140, 491), C0174.m3320(C0171.m3266(f5VarM6073), strM5389), C0057.m1083(bArr.length), C0438.m8554((((C0010.m194() / 1000000) - 15) - jM194) + 15));
            return bArr;
        } catch (InterruptedException e4) {
            e = e4;
            int i12 = 48767;
            while (true) {
                i12 ^= 48784;
                switch (i12) {
                    case Code.UNAVAILABLE /* 14 */:
                        C0237.m4564(C0454.m8871(C0327.m6333(p7VarM5151)), C0394.m7730(m6560(), 467, C0431.f702 ^ (-251), 1874), C0027.m535(str), C0174.m3320(C0171.m3266(f5VarM6073), strM5389), e);
                        return null;
                    case 239:
                        i12 = 48798;
                        break;
                }
            }
        } catch (ExecutionException e10) {
            e = e10;
            int i13 = 1864;
            while (true) {
                i13 ^= 1881;
                switch (i13) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i13 = 48674;
                        break;
                    case 47483:
                        break;
                    default:
                        break;
                }
                C0237.m4564(C0454.m8871(C0327.m6333(p7VarM5151)), C0394.m7730(m6560(), 467, C0431.f702 ^ (-251), 1874), C0027.m535(str), C0174.m3320(C0171.m3266(f5VarM6073), strM5389), e);
                return null;
            }
        }
    }

    @Override // k6.y3
    public final void l(e eVar, x7 x7Var) {
        String str = "\u06e8\u06e2\u06e7";
        String strM1624 = null;
        t7 t7VarM6291 = null;
        y2.a aVar = null;
        e eVar2 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56291:
                    str = "\u06e7\u06e2\u06df";
                    i11 = i10 ^ 450;
                    break;
                case 1746845:
                    i10 = C0240.f320;
                    str = "\u06df\u06e2";
                    break;
                case 1747780:
                    str = "\u06e8\u06e1\u06e4";
                    eVar2 = new e(eVar);
                    break;
                case 1747935:
                    eVar2.f9987a = strM1624;
                    str = "\u06df\u06e4\u06e2";
                    break;
                case 1748707:
                    C0218.m4213(this, aVar);
                    str = "\u06e1\u06e8\u06e2";
                    break;
                case 1748891:
                    return;
                case 1751777:
                    C0321.m6222(this, x7Var);
                    str = "\u06e0\u06e3\u06e7";
                    break;
                case 1753421:
                    str = "\u06e8\u06e6\u06e6";
                    t7VarM6291 = C0325.m6291(eVar);
                    break;
                case 1754468:
                    str = "\u06e1\u06e2\u06e4";
                    aVar = new y2.a((Object) this, (Object) eVar2, (Object) x7Var, i11);
                    break;
                case 1755437:
                    C0270.m5173(eVar);
                    str = "\u06e6\u06df\u06e6";
                    break;
                case 1755560:
                    C0270.m5173(t7VarM6291);
                    str = "\u06e4\u06e8\u06e5";
                    break;
                default:
                    strM1624 = C0074.m1624(x7Var);
                    str = "\u06e0\u06e8\u06e7";
                    break;
            }
        }
    }

    @Override // k6.y3
    public final List m(String str, String str2, x7 x7Var) {
        C0321.m6222(this, x7Var);
        String strM1624 = C0074.m1624(x7Var);
        C0270.m5173(strM1624);
        p7 p7VarM5151 = C0269.m5151(this);
        try {
            return (List) C0010.m202(C0003.m69(C0485.m9461(p7VarM5151), new k5(this, strM1624, str, str2, 1)));
        } catch (InterruptedException e4) {
            e = e4;
            d4 d4VarM6333 = C0327.m6333(p7VarM5151);
            C0419.m8245(C0454.m8871(d4VarM6333), C0318.m6177(m6560(), 512, C0061.f81 ^ 797, 2273), e);
            return C0160.m3062();
        } catch (ExecutionException e10) {
            e = e10;
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i10 = 1647;
                        continue;
                    default:
                        continue;
                }
                d4 d4VarM6334 = C0327.m6333(p7VarM5151);
                C0419.m8245(C0454.m8871(d4VarM6334), C0318.m6177(m6560(), 512, C0061.f81 ^ 797, 2273), e);
                return C0160.m3062();
            }
        }
    }

    @Override // k6.y3
    public final void n(x7 x7Var) {
        C0281.m5438(C0074.m1624(x7Var));
        C0270.m5173(C0233.m4499(x7Var));
        i5 i5Var = new i5(this, x7Var, C0290.f438 ^ (-351));
        p7 p7VarM5151 = C0269.m5151(this);
        boolean zM766 = C0039.m766(C0485.m9461(p7VarM5151));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM766) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    C0233.m4501(i5Var);
                    return;
                case 239:
                    C0004.m73(C0485.m9461(p7VarM5151), i5Var);
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // k6.y3
    public final void o(t7 t7Var, x7 x7Var) {
        y2.a aVar = null;
        String str = "\u06e2\u06e2\u06e5";
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747809:
                    i10 = i11 ^ 79;
                    str = "\u06e2\u06df\u06e1";
                    break;
                case 1749572:
                    aVar = new y2.a((Object) this, (Object) t7Var, (Object) x7Var, i10);
                    str = "\u06e2\u06e1\u06df";
                    break;
                case 1749632:
                    C0218.m4213(this, aVar);
                    str = "\u06e8\u06e4\u06e2";
                    break;
                case 1749669:
                    C0270.m5173(t7Var);
                    str = "\u06e6\u06e2\u06e1";
                    break;
                case 1753509:
                    C0321.m6222(this, x7Var);
                    str = "\u06e7\u06e7\u06e2";
                    break;
                case 1755494:
                    return;
                default:
                    str = "\u06e0\u06e4\u06e5";
                    i11 = C0109.f135;
                    break;
            }
        }
    }

    @Override // k6.y3
    public final void p(x7 x7Var) {
        String str = "\u06e4\u06e2\u06e4";
        i5 i5Var = null;
        String strM1624 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56482:
                    str = "\u06e7\u06e7\u06df";
                    strM1624 = C0074.m1624(x7Var);
                    break;
                case 1748893:
                    i10 = C0122.f148;
                    str = "\u06e4\u06e5\u06df";
                    break;
                case 1751493:
                    C0218.m4213(this, i5Var);
                    str = "\u06e7\u06df\u06df";
                    break;
                case 1751590:
                    str = "\u06e4\u06e7\u06e5";
                    strM1624 = C0074.m1624(x7Var);
                    break;
                case 1751678:
                    i11 = i10 ^ (-54);
                    str = "\u06e8\u06e4\u06e6";
                    break;
                case 1751746:
                    C0281.m5438(strM1624);
                    str = "\u06e5\u06e7";
                    break;
                case 1754375:
                    return;
                case 1754623:
                    C0454.m8863(this, strM1624, false);
                    str = "\u06e1\u06e8\u06e4";
                    break;
                default:
                    i5Var = new i5(this, x7Var, i11);
                    str = "\u06e4\u06df\u06e0";
                    break;
            }
        }
    }

    @Override // k6.y3
    public final String q(x7 x7Var) {
        C0321.m6222(this, x7Var);
        p7 p7VarM5151 = C0269.m5151(this);
        d5 d5VarM69 = C0003.m69(C0485.m9461(p7VarM5151), new l5(C0406.f677 ^ 841, p7VarM5151, x7Var));
        try {
            String str = (String) C0335.m6506(d5VarM69, (-30250) ^ ((long) C0412.f683), C0472.m9196());
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        return str;
                    case 49:
                        i10 = 1647;
                        break;
                }
            }
        } catch (InterruptedException e4) {
            e = e4;
            int i11 = 1864;
            while (true) {
                i11 ^= 1881;
                switch (i11) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i11 = 48674;
                        break;
                    case 47483:
                        d4 d4VarM6333 = C0327.m6333(p7VarM5151);
                        C0112.m2169(C0454.m8871(d4VarM6333), C0006.m114(m6560(), 553, C0010.f30 ^ 853, 1496), C0027.m535(C0074.m1624(x7Var)), e);
                        return null;
                }
            }
        } catch (ExecutionException e10) {
            e = e10;
            int i12 = 1740;
            while (true) {
                i12 ^= 1757;
                switch (i12) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i12 = 1771;
                        break;
                    case 54:
                        d4 d4VarM6334 = C0327.m6333(p7VarM5151);
                        C0112.m2169(C0454.m8871(d4VarM6334), C0006.m114(m6560(), 553, C0010.f30 ^ 853, 1496), C0027.m535(C0074.m1624(x7Var)), e);
                        return null;
                }
            }
        } catch (TimeoutException e11) {
            e = e11;
            d4 d4VarM6335 = C0327.m6333(p7VarM5151);
            C0112.m2169(C0454.m8871(d4VarM6335), C0006.m114(m6560(), 553, C0010.f30 ^ 853, 1496), C0027.m535(C0074.m1624(x7Var)), e);
            return null;
        }
    }

    @Override // k6.y3
    public final List r(String str, String str2, String str3) {
        C0454.m8863(this, str, true);
        p7 p7VarM5151 = C0269.m5151(this);
        try {
            return (List) C0010.m202(C0003.m69(C0485.m9461(p7VarM5151), new k5(this, str, str2, str3, C0053.f73 ^ (-151))));
        } catch (InterruptedException e4) {
            e = e4;
            d4 d4VarM6333 = C0327.m6333(p7VarM5151);
            C0419.m8245(C0454.m8871(d4VarM6333), C0351.m6881(m6560(), 589, C0450.f721 ^ (-647), 1227), e);
            return C0160.m3062();
        } catch (ExecutionException e10) {
            e = e10;
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i10 = 1647;
                        continue;
                    default:
                        continue;
                }
                d4 d4VarM6334 = C0327.m6333(p7VarM5151);
                C0419.m8245(C0454.m8871(d4VarM6334), C0351.m6881(m6560(), 589, C0450.f721 ^ (-647), 1227), e);
                return C0160.m3062();
            }
        }
    }

    @Override // k6.y3
    public final void s(x7 x7Var) {
        i5 i5Var = null;
        String str = "\u06e1\u06e3\u06e3";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748675:
                    return;
                case 1748737:
                    C0321.m6222(this, x7Var);
                    str = "\u06e6\u06e7\u06e7";
                    break;
                case 1753670:
                    i5Var = new i5(this, x7Var, 0);
                    str = "\u06e2\u06e4\u06e1";
                    break;
                default:
                    C0218.m4213(this, i5Var);
                    str = "\u06e1\u06e1\u06e3";
                    break;
            }
        }
    }

    public final void t(v vVar, x7 x7Var) {
        p7 p7VarM5151 = null;
        String str = "\u06e3\u06e8\u06e3";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746726:
                    C0338.m6647(p7VarM5151);
                    str = "\u06e1\u06e4\u06e0";
                    break;
                case 1748765:
                    C0335.m6511(p7VarM5151, vVar, x7Var);
                    str = "\u06e6\u06df\u06df";
                    break;
                case 1753414:
                    return;
                default:
                    p7VarM5151 = C0269.m5151(this);
                    str = "\u06df\u06e0\u06e7";
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:281:0x036a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x0362 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:119:0x032f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:98:0x02e2. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        ArrayList arrayList;
        int i12;
        int i13 = 1;
        switch (i10) {
            case 1:
                v vVar = (v) C0047.m916(parcel, C0109.m2105());
                x7 x7Var = (x7) C0047.m916(parcel, C0205.m3922());
                C0137.m2644(parcel);
                C0185.m3542(this, vVar, x7Var);
                C0172.m3294(parcel2);
                return true;
            case 2:
                t7 t7Var = (t7) C0047.m916(parcel, C0073.m1593());
                x7 x7Var2 = (x7) C0047.m916(parcel, C0205.m3922());
                C0137.m2644(parcel);
                C0223.m4296(this, t7Var, x7Var2);
                C0172.m3294(parcel2);
                int i14 = 1507627;
                while (true) {
                    i14 ^= 1507644;
                    switch (i14) {
                        case 23:
                            i14 = 1507658;
                            break;
                        case 118:
                            return true;
                    }
                }
                break;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                int i15 = 1616;
                while (true) {
                    i15 ^= 1633;
                    switch (i15) {
                        case Code.UNAVAILABLE /* 14 */:
                            return false;
                        case 49:
                            i15 = 1647;
                            break;
                    }
                }
                break;
            case 4:
                x7 x7Var3 = (x7) C0047.m916(parcel, C0205.m3922());
                C0137.m2644(parcel);
                C0409.m8033(this, x7Var3);
                C0172.m3294(parcel2);
                int i16 = 1507503;
                while (true) {
                    i16 ^= 1507520;
                    switch (i16) {
                        case Code.UNAVAILABLE /* 14 */:
                            return true;
                        case 111:
                            i16 = 1507534;
                            break;
                    }
                }
                break;
            case 5:
                v vVar2 = (v) C0047.m916(parcel, C0109.m2105());
                String strM7681 = C0392.m7681(parcel);
                C0392.m7681(parcel);
                C0137.m2644(parcel);
                C0270.m5173(vVar2);
                C0281.m5438(strM7681);
                C0454.m8863(this, strM7681, true);
                C0218.m4213(this, new y2.a(this, vVar2, strM7681, C0050.f70 ^ 958));
                C0172.m3294(parcel2);
                int i17 = 56579;
                while (true) {
                    i17 ^= 56596;
                    switch (i17) {
                        case 23:
                            i17 = 56610;
                            break;
                        case 54:
                            return true;
                    }
                }
                break;
            case 6:
                x7 x7Var4 = (x7) C0047.m916(parcel, C0205.m3922());
                C0137.m2644(parcel);
                C0420.m8253(this, x7Var4);
                C0172.m3294(parcel2);
                int i18 = 56455;
                while (true) {
                    i18 ^= 56472;
                    switch (i18) {
                        case 31:
                            i18 = 56486;
                            break;
                        case 62:
                            return true;
                    }
                }
                break;
            case 7:
                x7 x7Var5 = (x7) C0047.m916(parcel, C0205.m3922());
                boolean zM8073 = C0411.m8073(parcel);
                C0137.m2644(parcel);
                C0321.m6222(this, x7Var5);
                String strM1624 = C0074.m1624(x7Var5);
                C0270.m5173(strM1624);
                p7 p7VarM5151 = C0269.m5151(this);
                try {
                    try {
                        List list = (List) C0010.m202(C0003.m69(C0485.m9461(p7VarM5151), new l5(i13, this, strM1624)));
                        ArrayList arrayList2 = new ArrayList(C0008.m171(list));
                        Iterator itM2089 = C0107.m2089(list);
                        while (true) {
                            boolean zM3327 = C0174.m3327(itM2089);
                            int i19 = 53510;
                            while (true) {
                                i19 ^= 53527;
                                switch (i19) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i19 = zM3327 ? 53603 : 53572;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 83:
                                        break;
                                    case 116:
                                        v7 v7Var = (v7) C0413.m8115(itM2089);
                                        int i20 = 53634;
                                        while (true) {
                                            i20 ^= 53651;
                                            switch (i20) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i20 = !zM8073 ? 53727 : 53696;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 76:
                                                    boolean zM9580 = C0492.m9580(C0320.m6207(v7Var));
                                                    int i21 = 53758;
                                                    while (true) {
                                                        i21 ^= 53775;
                                                        switch (i21) {
                                                            case 1009:
                                                                i21 = !zM9580 ? 54502 : 54471;
                                                                break;
                                                            case 1703:
                                                                break;
                                                            case 1736:
                                                                break;
                                                            case 1769:
                                                                int i22 = 54533;
                                                                while (true) {
                                                                    i22 ^= 54550;
                                                                    switch (i22) {
                                                                        case 19:
                                                                            i22 = 54564;
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                    C0357.m6998(arrayList2, new t7(v7Var));
                                                                    i12 = 55556;
                                                                    while (true) {
                                                                        i12 ^= 55573;
                                                                        switch (i12) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i12 = 55587;
                                                                                break;
                                                                            case 54:
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
                                                case 83:
                                                    C0357.m6998(arrayList2, new t7(v7Var));
                                                    i12 = 55556;
                                                    while (true) {
                                                        i12 ^= 55573;
                                                        switch (i12) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i12 = 55587;
                                                                break;
                                                            case 54:
                                                                continue;
                                                                continue;
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
                                arrayList = arrayList2;
                                C0172.m3294(parcel2);
                                C0019.m384(parcel2, arrayList);
                                int i23 = 55680;
                                while (true) {
                                    i23 ^= 55697;
                                    switch (i23) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i23 = 56362;
                                            break;
                                        case 1467:
                                            return true;
                                    }
                                }
                            }
                        }
                    } catch (ExecutionException e4) {
                        e = e4;
                        int i24 = 54657;
                        while (true) {
                            i24 ^= 54674;
                            switch (i24) {
                                case 19:
                                    i24 = 54688;
                                    continue;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                default:
                                    continue;
                            }
                            C0112.m2169(C0454.m8871(C0327.m6333(p7VarM5151)), C0254.m4870(m6560(), 633, C0230.f310 ^ (-809), 2077), C0027.m535(strM1624), e);
                            arrayList = null;
                        }
                    }
                } catch (InterruptedException e10) {
                    e = e10;
                    int i25 = 55432;
                    while (true) {
                        i25 ^= 55449;
                        switch (i25) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i25 = 55463;
                                continue;
                            case 62:
                                break;
                            default:
                                continue;
                        }
                    }
                }
                break;
            case 9:
                v vVar3 = (v) C0047.m916(parcel, C0109.m2105());
                String strM7682 = C0392.m7681(parcel);
                C0137.m2644(parcel);
                byte[] bArrM93 = C0004.m93(this, vVar3, strM7682);
                C0172.m3294(parcel2);
                C0159.m3048(parcel2, bArrM93);
                int i26 = 52735;
                while (true) {
                    i26 ^= 52752;
                    switch (i26) {
                        case Code.UNAVAILABLE /* 14 */:
                            return true;
                        case 1007:
                            i26 = 52766;
                            break;
                    }
                }
                break;
            case 10:
                long jM4982 = C0260.m4982(parcel);
                String strM7683 = C0392.m7681(parcel);
                String strM7684 = C0392.m7681(parcel);
                String strM7685 = C0392.m7681(parcel);
                C0137.m2644(parcel);
                C0180.m3446(this, strM7683, strM7684, jM4982, strM7685);
                C0172.m3294(parcel2);
                int i27 = 52611;
                while (true) {
                    i27 ^= 52628;
                    switch (i27) {
                        case 23:
                            i27 = 52642;
                            break;
                        case 54:
                            return true;
                    }
                }
                break;
            case 11:
                x7 x7Var6 = (x7) C0047.m916(parcel, C0205.m3922());
                C0137.m2644(parcel);
                String strM2111 = C0109.m2111(this, x7Var6);
                C0172.m3294(parcel2);
                C0285.m5508(parcel2, strM2111);
                int i28 = 51836;
                while (true) {
                    i28 ^= 51853;
                    switch (i28) {
                        case 241:
                            i28 = 52518;
                            break;
                        case 1963:
                            return true;
                    }
                }
                break;
            case 12:
                e eVar = (e) C0047.m916(parcel, C0259.m4944());
                x7 x7Var7 = (x7) C0047.m916(parcel, C0205.m3922());
                C0137.m2644(parcel);
                C0136.m2637(this, eVar, x7Var7);
                C0172.m3294(parcel2);
                int i29 = 51712;
                while (true) {
                    i29 ^= 51729;
                    switch (i29) {
                        case Code.UNAVAILABLE /* 14 */:
                            return true;
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i29 = 51743;
                            break;
                    }
                }
                break;
            case 13:
                e eVar2 = (e) C0047.m916(parcel, C0259.m4944());
                C0137.m2644(parcel);
                C0270.m5173(eVar2);
                C0270.m5173(C0325.m6291(eVar2));
                C0281.m5438(C0475.m9253(eVar2));
                C0454.m8863(this, C0475.m9253(eVar2), true);
                C0218.m4213(this, new l.h(C0109.f135 ^ 70, this, new e(eVar2)));
                C0172.m3294(parcel2);
                int i30 = 51588;
                while (true) {
                    i30 ^= 51605;
                    switch (i30) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i30 = 51619;
                            break;
                        case 54:
                            return true;
                    }
                }
                break;
            case Code.UNAVAILABLE /* 14 */:
                String strM7686 = C0392.m7681(parcel);
                String strM7687 = C0392.m7681(parcel);
                boolean zM8074 = C0411.m8073(parcel);
                x7 x7Var8 = (x7) C0047.m916(parcel, C0205.m3922());
                C0137.m2644(parcel);
                List listM8026 = C0409.m8026(this, strM7686, strM7687, zM8074, x7Var8);
                C0172.m3294(parcel2);
                C0019.m384(parcel2, listM8026);
                int i31 = 50813;
                while (true) {
                    i31 ^= 50830;
                    switch (i31) {
                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            return true;
                        case 243:
                            i31 = 50844;
                            break;
                    }
                }
                break;
            case 15:
                String strM7688 = C0392.m7681(parcel);
                String strM7689 = C0392.m7681(parcel);
                String strM76810 = C0392.m7681(parcel);
                boolean zM8075 = C0411.m8073(parcel);
                C0137.m2644(parcel);
                List listM230 = C0012.m230(this, strM7688, strM7689, strM76810, zM8075);
                C0172.m3294(parcel2);
                C0019.m384(parcel2, listM230);
                int i32 = 50689;
                while (true) {
                    i32 ^= 50706;
                    switch (i32) {
                        case 19:
                            i32 = 50720;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            return true;
                    }
                }
                break;
            case Code.UNAUTHENTICATED /* 16 */:
                String strM76811 = C0392.m7681(parcel);
                String strM76812 = C0392.m7681(parcel);
                x7 x7Var9 = (x7) C0047.m916(parcel, C0205.m3922());
                C0137.m2644(parcel);
                List listM3447 = C0180.m3447(this, strM76811, strM76812, x7Var9);
                C0172.m3294(parcel2);
                C0019.m384(parcel2, listM3447);
                int i33 = 49914;
                while (true) {
                    i33 ^= 49931;
                    switch (i33) {
                        case 497:
                            i33 = 50596;
                            break;
                        case 1711:
                            return true;
                    }
                }
                break;
            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                String strM76813 = C0392.m7681(parcel);
                String strM76814 = C0392.m7681(parcel);
                String strM76815 = C0392.m7681(parcel);
                C0137.m2644(parcel);
                List listM638 = C0033.m638(this, strM76813, strM76814, strM76815);
                C0172.m3294(parcel2);
                C0019.m384(parcel2, listM638);
                int i34 = 49790;
                while (true) {
                    i34 ^= 49807;
                    switch (i34) {
                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            return true;
                        case 241:
                            i34 = 49821;
                            break;
                    }
                }
                break;
            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                x7 x7Var10 = (x7) C0047.m916(parcel, C0205.m3922());
                C0137.m2644(parcel);
                C0400.m7837(this, x7Var10);
                C0172.m3294(parcel2);
                int i35 = 49666;
                while (true) {
                    i35 ^= 49683;
                    switch (i35) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i35 = 49697;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            return true;
                    }
                }
                break;
            case 19:
                Bundle bundle = (Bundle) C0047.m916(parcel, C0255.m4883());
                x7 x7Var11 = (x7) C0047.m916(parcel, C0205.m3922());
                C0137.m2644(parcel);
                C0148.m2845(this, bundle, x7Var11);
                C0172.m3294(parcel2);
                int i36 = 48891;
                while (true) {
                    i36 ^= 48908;
                    switch (i36) {
                        case 22:
                            return true;
                        case 503:
                            i36 = 48922;
                            break;
                    }
                }
                break;
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                x7 x7Var12 = (x7) C0047.m916(parcel, C0205.m3922());
                C0137.m2644(parcel);
                C0234.m4511(this, x7Var12);
                C0172.m3294(parcel2);
                int i37 = 48767;
                while (true) {
                    i37 ^= 48784;
                    switch (i37) {
                        case Code.UNAVAILABLE /* 14 */:
                            return true;
                        case 239:
                            i37 = 48798;
                            break;
                    }
                }
                break;
            case 21:
                x7 x7Var13 = (x7) C0047.m916(parcel, C0205.m3922());
                C0137.m2644(parcel);
                j jVarM6873 = C0350.m6873(this, x7Var13);
                C0172.m3294(parcel2);
                C0235.m4523(parcel2, jVarM6873);
                int i38 = 1864;
                while (true) {
                    i38 ^= 1881;
                    switch (i38) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i38 = 48674;
                            break;
                        case 47483:
                            return true;
                    }
                }
                break;
            case 24:
                x7 x7Var14 = (x7) C0047.m916(parcel, C0205.m3922());
                Bundle bundle2 = (Bundle) C0047.m916(parcel, C0255.m4883());
                C0137.m2644(parcel);
                List listM7779 = C0397.m7779(this, bundle2, x7Var14);
                C0172.m3294(parcel2);
                C0019.m384(parcel2, listM7779);
                int i39 = 1740;
                while (true) {
                    i39 ^= 1757;
                    switch (i39) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i39 = 1771;
                            break;
                        case 54:
                            return true;
                    }
                }
                break;
        }
    }
}
