package k6;

import androidx.compose.ui.graphics.C0031;
import androidx.compose.ui.node.C0037;
import androidx.core.content.C0041;
import c4.C0064;
import c7.C0069;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.internal.measurement.zzm;
import com.google.android.gms.internal.measurement.zzx;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.C0128;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0198;
import d9.C0224;
import dagger.hilt.components.C0245;
import dagger.hilt.internal.generatesrootinput.C0251;
import fa.C0282;
import g.C0284;
import g5.C0291;
import h7.C0311;
import i.C0316;
import i6.C0321;
import java.util.HashMap;
import java.util.concurrent.Callable;
import k3.C0335;
import m0.C0350;
import q6.C0387;
import s8.C0417;
import u8.C0439;
import v7.C0450;
import z3.C0486;
import z7.C0491;
import z8.C0493;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u4 implements Callable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f591short = {1524, 1523, 1513, 1528, 1519, 1523, 1532, 1521, 1459, 1532, 1517, 1517, 1488, 1528, 1513, 1532, 1529, 1532, 1513, 1532, 1026, 1054, 1043, 1030, 1044, 1053, 1024, 1055, 2092, 2083, 2089, 2111, 2082, 2084, 2089, 2538, 2555, 2553, 2545, 2555, 2557, 2559, 2501, 2548, 2555, 2551, 2559, 1443, 1449, 1460, 1435, 1458, 1441, 1462, 1463, 1453, 1451, 1450, 286, 271, 271, 288, 265, 282, 269, 268, 278, 272, 273, 538, 523, 523, 548, 525, 542, 521, 520, 530, 532, 533, 548, 530, 533, 527, 2421, 2408, 2431, 2416, 2428, 2424, 2405, 2420, 2382, 2407, 2420, 2403, 2402, 2424, 2430, 2431, 1877, 1874, 1864, 1881, 1870, 1874, 1885, 1872, 1810, 1870, 1881, 1873, 1875, 1864, 1881, 1919, 1875, 1874, 1882, 1877, 1883};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t4 f10418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10419c;

    public /* synthetic */ u4(t4 t4Var, String str, int i10) {
        this.f10417a = i10;
        this.f10418b = t4Var;
        this.f10419c = str;
        int iM8755 = C0450.m8755();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8755 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0076.m1645("hj7")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static short[] m6601() {
        int iM3314 = C0173.m3314();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3314 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f591short;
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

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String strM604 = C0031.m604(this);
        t4 t4VarM6856 = C0350.m6856(this);
        switch (C0350.m6833(this)) {
            case 0:
                return new zzm(C0245.m4690(m6601(), 100, C0335.f518 ^ (-712), 1852), new y4(t4VarM6856, strM604));
            case 1:
                a5 a5VarM4795 = C0251.m4795(C0090.m1924(t4VarM6856), strM604);
                HashMap map = new HashMap();
                C0128.m2473(map, C0064.m1234(m6601(), 20, C0114.f140 ^ (-304), 1138), C0069.m1349(m6601(), 28, C0224.f303 ^ (-240), 2125));
                C0128.m2473(map, C0291.m5593(m6601(), 35, C0417.f687 ^ (-660), 2458), strM604);
                C0128.m2473(map, C0198.m3789(m6601(), 47, C0162.f186 ^ 847, 1476), C0439.m8554((-82815) ^ ((long) C0493.f766)));
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (a5VarM4795 != null) {
                                i10 = 1709;
                            }
                            break;
                        case 204:
                            String strM730 = C0037.m730(a5VarM4795);
                            int i11 = 1740;
                            while (true) {
                                i11 ^= 1757;
                                switch (i11) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (strM730 != null) {
                                            i11 = 1833;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        C0128.m2473(map, C0311.m6013(m6601(), 58, C0486.f759 ^ 60, 383), strM730);
                                        break;
                                    default:
                                        continue;
                                }
                                i11 = 1802;
                            }
                            C0128.m2473(map, C0491.m9556(m6601(), 69, C0321.f468 ^ (-811), 635), C0439.m8554(C0136.m2621(a5VarM4795)));
                            C0128.m2473(map, C0282.m5440(m6601(), 84, C0316.f463 ^ 530, 2321), C0439.m8554(C0387.m7575(a5VarM4795)));
                            return map;
                        case 239:
                            return map;
                        default:
                            continue;
                    }
                    i10 = 1678;
                }
                break;
            default:
                return new zzx(C0041.m814(m6601(), 0, C0284.f428 ^ (-394), 1437), new u4(t4VarM6856, strM604, 1));
        }
    }
}
