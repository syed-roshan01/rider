package k6;

import a.C0001;
import a8.C0009;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.input.pointer.C0034;
import androidx.profileinstaller.C0045;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.measurement.internal.C0105;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.components.C0135;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.iid.C0171;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.sql.C0208;
import d1.C0213;
import d8.C0222;
import dagger.hilt.android.internal.modules.C0235;
import dagger.hilt.android.lifecycle.C0238;
import dagger.hilt.internal.definecomponent.C0250;
import f.C0270;
import f.C0271;
import f0.C0272;
import f6.C0278;
import fa.C0281;
import fa.C0282;
import g2.C0288;
import g5.C0292;
import h0.C0300;
import h4.C0305;
import ja.C0331;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l2.C0342;
import l3.C0343;
import l8.C0347;
import m7.C0358;
import o2.C0369;
import o8.C0372;
import q2.C0385;
import t2.C0424;
import t8.C0427;
import t9.C0428;
import u1.C0433;
import u7.C0438;
import v6.C0448;
import v9.C0452;
import w1.C0456;
import w2.C0458;
import w4.C0461;
import y9.C0479;
import z7.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class z4 extends o5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c5 f10606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c5 f10607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue f10608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f10609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b5 f10610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b5 f10611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f10612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Semaphore f10613j;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f606short = {784, 812, 822, 801, 805, 800, 868, 800, 801, 805, 816, 812, 894, 868, 785, 810, 807, 805, 817, 803, 812, 816, 868, 801, 828, 807, 801, 820, 816, 813, 811, 810, 868, 811, 810, 868, 819, 811, 822, 815, 801, 822, 868, 816, 812, 822, 801, 805, 800, 2942, 2882, 2904, 2895, 2891, 2894, 2826, 2894, 2895, 2891, 2910, 2882, 2832, 2826, 2943, 2884, 2889, 2891, 2911, 2893, 2882, 2910, 2826, 2895, 2898, 2889, 2895, 2906, 2910, 2883, 2885, 2884, 2826, 2885, 2884, 2826, 2884, 2895, 2910, 2909, 2885, 2904, 2881, 2826, 2910, 2882, 2904, 2895, 2891, 2894, 858, 888, 885, 885, 825, 892, 865, 873, 892, 890, 877, 892, 893, 825, 895, 875, 886, 884, 825, 878, 886, 875, 882, 892, 875, 825, 877, 881, 875, 892, 888, 893, 719, 744, 754, 739, 756, 756, 755, 758, 754, 739, 738, 678, 753, 743, 751, 754, 751, 744, 737, 678, 736, 745, 756, 678, 3051, 3030, 3026, 3034, 3035, 2975, 3024, 3018, 3019, 2975, 3016, 3038, 3030, 3019, 3030, 3025, 3032, 2975, 3033, 3024, 3021, 2975, 1605, 1639, 1642, 1642, 1639, 1636, 1642, 1635, 1574, 1653, 1645, 1647, 1654, 1654, 1635, 1634, 1574, 1650, 1646, 1635, 1574, 1649, 1641, 1652, 1645, 1635, 1652, 1574, 1655, 1651, 1635, 1651, 1635, 1576, 1494, 1534, 1530, 1512, 1518, 1513, 1534, 1526, 1534, 1525, 1519, 1467, 1484, 1524, 1513, 1520, 1534, 1513, 1815, 1826, 1840, 1832, 1891, 1830, 1851, 1824, 1830, 1843, 1847, 1834, 1836, 1837, 1891, 1836, 1837, 1891, 1837, 1830, 1847, 1844, 1836, 1841, 1832, 1891, 1847, 1835, 1841, 1830, 1826, 1831, 2791, 2767, 2763, 2777, 2783, 2776, 2767, 2759, 2767, 2756, 2782, 2698, 2788, 2767, 2782, 2781, 2757, 2776, 2753, 2347, 2334, 2316, 2324, 2399, 2330, 2311, 2332, 2330, 2319, 2315, 2326, 2320, 2321, 2399, 2320, 2321, 2399, 2312, 2320, 2317, 2324, 2330, 2317, 2399, 2315, 2327, 2317, 2330, 2334, 2331, 1463, 1410, 1424, 1416, 1475, 1414, 1435, 1408, 1414, 1427, 1431, 1418, 1420, 1421, 1475, 1420, 1421, 1475, 1428, 1420, 1425, 1416, 1414, 1425, 1475, 1431, 1419, 1425, 1414, 1410, 1415, 1871, 1901, 1888, 1888, 1836, 1897, 1908, 1916, 1897, 1903, 1912, 1897, 1896, 1836, 1898, 1918, 1891, 1889, 1836, 1890, 1897, 1912, 1915, 1891, 1918, 1895, 1836, 1912, 1892, 1918, 1897, 1901, 1896};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicLong f10605k = new AtomicLong((-9223372036854775248L) ^ ((long) C0456.f726));

    public z4(f5 f5Var) {
        super(f5Var);
        this.f10612i = new Object();
        this.f10613j = new Semaphore(C0162.f186 ^ 838);
        this.f10608e = new PriorityBlockingQueue();
        this.f10609f = new LinkedBlockingQueue();
        this.f10610g = new b5(this, C0109.m2104(m6616(), 0, C0282.f426 ^ 792, 836));
        this.f10611h = new b5(this, C0372.m7287(m6616(), 49, C0347.f617 ^ (-715), 2858));
        int iM5222 = C0272.m5222();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5222 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0369.m7229("m1B8E5r1Qf7r35Yk4UuTCDRBhZz")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۠ۦۥۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6616() {
        int iM8356 = C0427.m8356();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8356 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f606short;
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

    @Override // f4.y
    public final void l() {
        Thread threadM4773 = C0250.m4773();
        c5 c5VarM476 = C0024.m476(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (threadM4773 == c5VarM476) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return;
                case 239:
                    throw new IllegalStateException(C0238.m4582(m6616(), 99, C0171.f195 ^ (-112), 793));
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // k6.o5
    public final boolean o() {
        return false;
    }

    public final Object p(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        String strM2052 = C0105.m2052(m6616(), 131, C0167.f191 ^ 950, 646);
        synchronized (atomicReference) {
            try {
                C0343.m6719(C0208.m3979(this), runnable);
                try {
                    C0458.m8915(atomicReference, j10);
                } catch (InterruptedException e4) {
                    C0135.m2604(C0331.m6385(C0029.m572(this)), C0452.m8805(strM2052, str));
                    return null;
                }
            } catch (Throwable th) {
                int i10 = 1740;
                while (true) {
                    i10 ^= 1757;
                    switch (i10) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i10 = 1771;
                            break;
                        case 54:
                            throw th;
                    }
                }
            }
        }
        Object objM9542 = C0491.m9542(atomicReference);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (objM9542 == null) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    C0135.m2604(C0331.m6385(C0029.m572(this)), C0452.m8805(C0270.m5144(m6616(), 155, C0034.f54 ^ 529, 3007), str));
                    return objM9542;
                case 239:
                    return objM9542;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public final d5 q(Callable callable) {
        C0167.m3203(this);
        d5 d5Var = new d5(this, callable, false);
        Thread threadM4773 = C0250.m4773();
        c5 c5VarM476 = C0024.m476(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (threadM4773 == c5VarM476) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    boolean zM2356 = C0122.m2356(C0001.m26(this));
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = !zM2356 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0135.m2604(C0331.m6385(C0029.m572(this)), C0385.m7532(m6616(), 177, C0358.f628 ^ 814, 1542));
                                break;
                            default:
                                break;
                        }
                    }
                    C0082.m1754(d5Var);
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
                case 239:
                    C0424.m8314(this, d5Var);
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return d5Var;
    }

    public final void r(d5 d5Var) {
        synchronized (C0080.m1723(this)) {
            try {
                C0156.m2985(C0001.m26(this), d5Var);
                c5 c5VarM476 = C0024.m476(this);
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i10 = c5VarM476 == null ? 1709 : 1678;
                            break;
                        case 204:
                            c5 c5Var = new c5(this, C0300.m5767(m6616(), 211, C0109.f135 ^ 81, 1435), C0001.m26(this));
                            this.f10606c = c5Var;
                            C0288.m5544(c5Var, C0479.m9319(this));
                            C0281.m5426(C0024.m476(this));
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
                            synchronized (C0461.m8969(c5VarM476)) {
                                C0448.m8727(C0461.m8969(c5VarM476));
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                }
            } catch (Throwable th) {
                int i12 = 1864;
                while (true) {
                    i12 ^= 1881;
                    switch (i12) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i12 = 48674;
                            break;
                        case 47483:
                            throw th;
                    }
                }
            }
        }
        int iM4051 = C0213.m4051();
        int i13 = 48767;
        while (true) {
            i13 ^= 48784;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    return;
                case 76:
                    System.out.println(Long.parseLong(C0428.m8390("CCvYgR")));
                    return;
                case 239:
                    if (iM4051 <= 0) {
                        i13 = 48860;
                    }
                    break;
                default:
                    continue;
            }
            i13 = 48829;
        }
    }

    public final void s(Runnable runnable) {
        C0167.m3203(this);
        d5 d5Var = new d5(this, runnable, false, C0292.m5607(m6616(), 229, C0235.f314 ^ 962, 1859));
        synchronized (C0080.m1723(this)) {
            try {
                C0433.m8459(C0045.m878(this), d5Var);
                c5 c5VarM2953 = C0154.m2953(this);
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i10 = c5VarM2953 == null ? 1709 : 1678;
                            break;
                        case 204:
                            c5 c5Var = new c5(this, C0438.m8534(m6616(), 261, C0278.f422 ^ (-419), 2730), C0045.m878(this));
                            this.f10607d = c5Var;
                            C0288.m5544(c5Var, C0194.m3712(this));
                            C0281.m5426(C0154.m2953(this));
                            int i11 = 1740;
                            while (true) {
                                i11 ^= 1757;
                                switch (i11) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i11 = 1771;
                                        break;
                                    case 54:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            synchronized (C0461.m8969(c5VarM2953)) {
                                C0448.m8727(C0461.m8969(c5VarM2953));
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                }
            } catch (Throwable th) {
                int i12 = 1864;
                while (true) {
                    i12 ^= 1881;
                    switch (i12) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i12 = 48674;
                            break;
                        case 47483:
                            throw th;
                    }
                }
            }
        }
    }

    public final d5 t(Callable callable) {
        C0167.m3203(this);
        d5 d5Var = new d5(this, callable, true);
        Thread threadM4773 = C0250.m4773();
        c5 c5VarM476 = C0024.m476(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (threadM4773 == c5VarM476) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    C0082.m1754(d5Var);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    C0424.m8314(this, d5Var);
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return d5Var;
    }

    public final void u(Runnable runnable) {
        String str = "ۧۤ۟";
        String strM5865 = null;
        short[] sArrM6616 = null;
        d5 d5Var = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747717:
                    i10 = i11 ^ (-750);
                    str = "ۧۡۡ";
                    break;
                case 1747805:
                    str = "ۣۢۧ";
                    d5Var = new d5(this, runnable, false, strM5865);
                    break;
                case 1748863:
                    C0271.m5173(runnable);
                    str = "ۧ۟۠";
                    break;
                case 1749822:
                    C0424.m8314(this, d5Var);
                    str = "ۤۧۤ";
                    break;
                case 1751745:
                    return;
                case 1754376:
                    str = "ۦۣۧ";
                    sArrM6616 = m6616();
                    break;
                case 1754439:
                    strM5865 = C0305.m5865(sArrM6616, 280, i10, 2431);
                    str = "۠ۤۡ";
                    break;
                case 1754530:
                    C0167.m3203(this);
                    str = "ۡۧۥ";
                    break;
                default:
                    i11 = C0342.f612;
                    str = "۠ۡۦ";
                    break;
            }
        }
    }

    public final void v(Runnable runnable) {
        String str = "ۢۨۥ";
        d5 d5Var = null;
        short[] sArrM6616 = null;
        String strM3093 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746723:
                    str = "ۡۥۨ";
                    i11 = C0147.f172;
                    break;
                case 1748804:
                    i10 = i11 ^ 944;
                    str = "ۢۢۢ";
                    break;
                case 1749666:
                    str = "ۣۢ۠";
                    strM3093 = C0162.m3093(sArrM6616, 311, i10, 1507);
                    break;
                case 1749855:
                    C0167.m3203(this);
                    str = "ۧۨ۟";
                    break;
                case 1750625:
                    d5Var = new d5(this, runnable, true, strM3093);
                    str = "ۣۥ۟";
                    break;
                case 1750717:
                    C0424.m8314(this, d5Var);
                    str = "ۧۢۥ";
                    break;
                case 1754654:
                    str = "۟۠ۤ";
                    sArrM6616 = m6616();
                    break;
                default:
                    return;
            }
        }
    }

    public final boolean w() {
        Thread threadM4773 = C0250.m4773();
        c5 c5VarM476 = C0024.m476(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (threadM4773 == c5VarM476) {
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

    public final void x() {
        Thread threadM4773 = C0250.m4773();
        c5 c5VarM2953 = C0154.m2953(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (threadM4773 == c5VarM2953) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int iM177 = C0009.m177();
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM177 <= 0) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                System.out.println(C0433.m8461("OtYZGseXXJH"));
                                return;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    throw new IllegalStateException(C0222.m4271(m6616(), 342, C0083.f117 ^ (-810), 1804));
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
