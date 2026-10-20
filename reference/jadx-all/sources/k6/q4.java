package k6;

import aa.C0011;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.compose.ui.semantics.C0039;
import c6.C0067;
import com.auto.accept.service.C0072;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.abt.C0113;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.tracing.C0204;
import d.C0211;
import d1.C0215;
import dagger.hilt.android.migration.C0240;
import e1.C0258;
import ja.C0331;
import l0.C0341;
import l3.C0343;
import n8.C0366;
import okhttp3.internal.publicsuffix.C0373;
import t1.C0420;
import v5.C0445;
import v6.C0447;
import v9.C0452;
import w5.C0464;

/* JADX INFO: loaded from: classes.dex */
public final class q4 implements ServiceConnection {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f576short = {1455, 1416, 1429, 1426, 1415, 1418, 1418, 1478, 1460, 1411, 1408, 1411, 1428, 1428, 1411, 1428, 1478, 1413, 1417, 1416, 1416, 1411, 1413, 1426, 1423, 1417, 1416, 1478, 1428, 1411, 1426, 1427, 1428, 1416, 1411, 1410, 1478, 1425, 1423, 1426, 1422, 1478, 1416, 1427, 1418, 1418, 1478, 1412, 1423, 1416, 1410, 1411, 1428, 1815, 1840, 1837, 1834, 1855, 1842, 1842, 1918, 1804, 1851, 1848, 1851, 1836, 1836, 1851, 1836, 1918, 1805, 1851, 1836, 1832, 1847, 1853, 1851, 1918, 1847, 1843, 1838, 1842, 1851, 1843, 1851, 1840, 1834, 1855, 1834, 1847, 1841, 1840, 1918, 1833, 1855, 1837, 1918, 1840, 1841, 1834, 1918, 1848, 1841, 1835, 1840, 1850, 1807, 1832, 1845, 1842, 1831, 1834, 1834, 1894, 1812, 1827, 1824, 1827, 1844, 1844, 1827, 1844, 1894, 1813, 1827, 1844, 1840, 1839, 1829, 1827, 1894, 1829, 1833, 1832, 1832, 1827, 1829, 1842, 1827, 1826, 1473, 1532, 1511, 1505, 1524, 1520, 1517, 1515, 1514, 1444, 1515, 1511, 1511, 1521, 1526, 1526, 1505, 1504, 1444, 1523, 1516, 1517, 1512, 1505, 1444, 1511, 1509, 1512, 1512, 1517, 1514, 1507, 1444, 1485, 1514, 1527, 1520, 1509, 1512, 1512, 1444, 1494, 1505, 1506, 1505, 1526, 1526, 1505, 1526, 1444, 1477, 1492, 1485, 568, 543, 514, 517, 528, 541, 541, 593, 547, 532, 535, 532, 515, 515, 532, 515, 593, 546, 532, 515, 519, 536, 530, 532, 593, 533, 536, 514, 530, 542, 543, 543, 532, 530, 517, 532, 533};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r4 f10319b;

    public q4(r4 r4Var, String str) {
        this.f10319b = r4Var;
        this.f10318a = str;
        int iM208 = C0011.m208();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM208 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0240.m4599("UGtkcAsMwVAqAj7IhwnTuO")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6588() {
        int iM8793 = C0452.m8793();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8793 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f576short;
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

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        r4 r4VarM1730 = C0081.m1730(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iBinder == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    d4 d4VarM3434 = C0180.m3434(C0373.m7296(r4VarM1730));
                    C0258.m4924(d4VarM3434);
                    C0135.m2604(C0331.m6385(d4VarM3434), C0204.m3906(m6588(), 0, C0072.f104 ^ 68, 1510));
                    int iM4096 = C0215.m4096();
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM4096 <= 0) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                System.out.println(Float.valueOf(C0366.m7165("SD2BC")));
                                return;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    try {
                        zzby zzbyVarM2081 = C0107.m2081(iBinder);
                        int i12 = 1864;
                        while (true) {
                            i12 ^= 1881;
                            switch (i12) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    if (zzbyVarM2081 == null) {
                                        i12 = 48736;
                                    }
                                    break;
                                case 47384:
                                    d4 d4VarM3435 = C0180.m3434(C0373.m7296(r4VarM1730));
                                    C0258.m4924(d4VarM3435);
                                    C0135.m2604(C0136.m2634(d4VarM3435), C0039.m760(m6588(), 106, C0211.f234 ^ 331, 1862));
                                    z4 z4VarM8666 = C0445.m8666(C0373.m7296(r4VarM1730));
                                    C0258.m4924(z4VarM8666);
                                    C0343.m6719(z4VarM8666, new y2.a(this, zzbyVarM2081, this, C0163.f187 ^ (-701)));
                                    break;
                                case 47417:
                                    d4 d4VarM3436 = C0180.m3434(C0373.m7296(r4VarM1730));
                                    C0258.m4924(d4VarM3436);
                                    C0135.m2604(C0331.m6385(d4VarM3436), C0447.m8698(m6588(), 53, C0067.f87 ^ (-787), 1886));
                                    break;
                                case 47483:
                                    break;
                                default:
                                    continue;
                            }
                            i12 = 48705;
                        }
                        return;
                    } catch (RuntimeException e4) {
                        int i13 = 48767;
                        while (true) {
                            i13 ^= 48784;
                            switch (i13) {
                                case Code.UNAVAILABLE /* 14 */:
                                    d4 d4VarM3437 = C0180.m3434(C0373.m7296(r4VarM1730));
                                    C0258.m4924(d4VarM3437);
                                    C0420.m8245(C0331.m6385(d4VarM3437), C0113.m2192(m6588(), 140, C0123.f149 ^ (-426), 1412), e4);
                                    return;
                                case 239:
                                    i13 = 48798;
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

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        String str = "ۡ۠ۡ";
        f4 f4VarM2634 = null;
        r4 r4VarM1730 = null;
        f5 f5VarM7296 = null;
        d4 d4VarM3434 = null;
        String strM9022 = null;
        short[] sArrM6588 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56570:
                    return;
                case 1746938:
                    d4VarM3434 = C0180.m3434(f5VarM7296);
                    str = "ۨۧ۟";
                    break;
                case 1747935:
                    i10 = i11 ^ (-289);
                    str = "ۡۡ۟";
                    break;
                case 1748642:
                    r4VarM1730 = C0081.m1730(this);
                    str = "۟ۤ۟";
                    break;
                case 1748671:
                    strM9022 = C0464.m9022(sArrM6588, 193, i10, 625);
                    str = "ۦۨۦ";
                    break;
                case 1752490:
                    C0135.m2604(f4VarM2634, strM9022);
                    str = "ۨۢ";
                    break;
                case 1753446:
                    i11 = C0341.f611;
                    str = "۠ۨۧ";
                    break;
                case 1753700:
                    f4VarM2634 = C0136.m2634(d4VarM3434);
                    str = "ۥ۠ۥ";
                    break;
                case 1755460:
                    sArrM6588 = m6588();
                    str = "ۦ۠۠";
                    break;
                case 1755584:
                    C0258.m4924(d4VarM3434);
                    str = "ۣۨ۟";
                    break;
                default:
                    f5VarM7296 = C0373.m7296(r4VarM1730);
                    str = "۟ۧۢ";
                    break;
            }
        }
    }
}
