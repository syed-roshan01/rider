package k0;

import a7.C0008;
import a8.C0010;
import androidx.activity.C0017;
import androidx.annotation.C0018;
import androidx.appcompat.widget.C0020;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.ui.graphics.C0032;
import androidx.compose.ui.input.pointer.C0034;
import androidx.compose.ui.semantics.C0039;
import androidx.startup.C0047;
import b1.C0050;
import c0.C0056;
import c0.C0057;
import c1.C0059;
import c1.C0060;
import c4.C0064;
import ca.C0070;
import com.auto.accept.service.C0072;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.common.C0087;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.internal.tasks.C0102;
import com.google.android.gms.measurement.internal.C0105;
import com.google.android.gms.tasks.C0106;
import com.google.android.play.core.integrity.client.C0107;
import com.google.android.play.core.integrity.model.C0109;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.C0205;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0198;
import com.google.firebase.remoteconfiginterop.C0202;
import com.google.protobuf.C0209;
import d1.C0211;
import d1.C0212;
import d2.C0215;
import d4.C0217;
import d9.C0223;
import d9.C0224;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.codegen.C0241;
import dagger.hilt.internal.C0252;
import dagger.hilt.internal.definecomponent.C0249;
import dagger.hilt.internal.generatesrootinput.C0250;
import ea.C0268;
import g.C0282;
import g3.C0288;
import h.C0296;
import h4.C0304;
import i.C0315;
import i.C0316;
import i4.C0317;
import ia.C0322;
import j2.C0324;
import java.util.List;
import java.util.NoSuchElementException;
import k1.C0332;
import k2.C0333;
import k7.C0337;
import l0.C0339;
import l2.C0341;
import l8.C0346;
import l9.C0347;
import m1.C0350;
import m5.C0354;
import m5.C0355;
import m9.C0359;
import n7.C0364;
import o2.C0368;
import o5.C0370;
import o8.C0371;
import okhttp3.internal.publicsuffix.C0372;
import p8.C0380;
import q7.C0390;
import s.C0407;
import s0.C0410;
import u4.C0435;
import v.C0439;
import v7.C0448;
import w.C0453;
import w2.C0456;
import w4.C0459;
import w4.C0460;
import w5.C0462;
import x0.C0466;
import x7.C0472;
import y.C0475;
import y6.C0476;
import y9.C0479;
import z3.C0485;
import z7.C0488;

/* JADX INFO: loaded from: classes.dex */
public final class u1 implements r1.j0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f506short = {1352, 1377, 1381, 1376, 1389, 1386, 1379, 2659, 2629, 2646, 2654, 2651, 2654, 2649, 2640, 803, 769, 790, 789, 794, 779, 1554, 1588, 1575, 1575, 1576, 1593, 2475, 2438, 2437, 2434, 2443, 3061, 3027, 3030, 3030, 3017, 3028, 3026, 3023, 3016, 3009, 2257, 2301, 2302, 2302, 2295, 2289, 2278, 2299, 2301, 2300, 2226, 2289, 2301, 2300, 2278, 2291, 2299, 2300, 2273, 2226, 2300, 2301, 2226, 2295, 2302, 2295, 2303, 2295, 2300, 2278, 2226, 2303, 2291, 2278, 2289, 2298, 2299, 2300, 2293, 2226, 2278, 2298, 2295, 2226, 2274, 2272, 2295, 2294, 2299, 2289, 2291, 2278, 2295, 2236, 2310, 2359, 2346, 2342, 2324, 2363, 2359, 2366, 2358, 1310, 1343, 1336, 1314, 3078, 3114, 3115, 3121, 3108, 3116, 3115, 3104, 3127, 1014, 991, 987, 990, 979, 980, 989, 1708, 1674, 1689, 1681, 1684, 1681, 1686, 1695, 2922, 2887, 2884, 2883, 2890, 2122, 2152, 2175, 2172, 2163, 2146, 2519, 2545, 2530, 2530, 2541, 2556, 1800, 1849, 1828, 1832, 1818, 1845, 1849, 1840, 1848, 1887, 1918, 1913, 1891, 1915, 1885, 1880, 1880, 1863, 1882, 1884, 1857, 1862, 1871, 2023, 1995, 1992, 1992, 1985, 1991, 2000, 1997, 1995, 1994, 1924, 1991, 1995, 1994, 2000, 1989, 1997, 1994, 2007, 1924, 1994, 1995, 1924, 1985, 1992, 1985, 1993, 1985, 1994, 2000, 1924, 1993, 1989, 2000, 1991, 1996, 1997, 1994, 1987, 1924, 2000, 1996, 1985, 1924, 2004, 2006, 1985, 1984, 1997, 1991, 1989, 2000, 1985, 1930, 953, 904, 917, 921, 939, 900, 904, 897, 905, 2094, 2051, 2048, 2055, 2062, 943, 905, 922, 914, 919, 914, 917, 924, 1170, 1211, 1215, 1210, 1207, 1200, 1209, 2147, 2113, 2134, 2133, 2138, 2123, 2481, 2455, 2436, 2436, 2443, 2458, 2319, 2350, 2345, 2355, 2084, 2056, 2059, 2059, 2050, 2052, 2067, 2062, 2056, 2057, 2119, 2052, 2056, 2057, 2067, 2054, 2062, 2057, 2068, 2119, 2057, 2056, 2119, 2050, 2059, 2050, 2058, 2050, 2057, 2067, 2119, 2058, 2054, 2067, 2052, 2063, 2062, 2057, 2048, 2119, 2067, 2063, 2050, 2119, 2071, 2069, 2050, 2051, 2062, 2052, 2054, 2067, 2050, 2121};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.c f9517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y.t0 f9520d;

    public u1(c9.c cVar, boolean z10, float f10, y.t0 t0Var) {
        this.f9517a = cVar;
        this.f9518b = z10;
        this.f9519c = f10;
        this.f9520d = t0Var;
        int iM7269 = C0370.m7269();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7269 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0106.m2063("aZ2Mig1DAY")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۤۨۨۥ, reason: not valid java name and contains not printable characters */
    public static short[] m6436() {
        int iM2007 = C0102.m2007();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2007 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f506short;
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

    @Override // r1.j0
    public final int a(t1.c1 c1Var, List list, int i10) {
        l0 l0VarM1241 = null;
        int iM9514 = 0;
        String str = "\u06e2\u06df\u06e0";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1749571:
                    l0VarM1241 = C0064.m1241();
                    str = "\u06e3\u06e7\u06e6";
                    break;
                case 1753540:
                    return iM9514;
                default:
                    iM9514 = C0488.m9514(this, c1Var, list, i10, l0VarM1241);
                    str = "\u06e6\u06e3\u06e1";
                    break;
            }
        }
    }

    @Override // r1.j0
    public final int b(t1.c1 c1Var, List list, int i10) {
        l0 l0VarM7290 = null;
        int iM9290 = 0;
        String str = "\u06df\u06e5\u06e1";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1751773:
                    return iM9290;
                case 1753665:
                    iM9290 = C0476.m9290(this, c1Var, list, i10, l0VarM7290);
                    str = "\u06e4\u06e8\u06e1";
                    break;
                default:
                    l0VarM7290 = C0371.m7290();
                    str = "\u06e6\u06e7\u06e2";
                    break;
            }
        }
    }

    @Override // r1.j0
    public final int c(t1.c1 c1Var, List list, int i10) {
        l0 l0VarM4135 = null;
        int iM9514 = 0;
        String str = "\u06e4\u06e2\u06e5";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1751591:
                    l0VarM4135 = C0217.m4135();
                    str = "\u06e0\u06e4\u06df";
                    break;
                case 1752546:
                    return iM9514;
                default:
                    iM9514 = C0488.m9514(this, c1Var, list, i10, l0VarM4135);
                    str = "\u06e5\u06e2\u06df";
                    break;
            }
        }
    }

    @Override // r1.j0
    public final int d(t1.c1 c1Var, List list, int i10) {
        l0 l0VarM4309 = null;
        int iM9290 = 0;
        String str = "\u06e4\u06e1\u06e3";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1751558:
                    l0VarM4309 = C0224.m4309();
                    str = "\u06e6\u06e7\u06e4";
                    break;
                case 1753667:
                    iM9290 = C0476.m9290(this, c1Var, list, i10, l0VarM4309);
                    str = "\u06e6\u06e8\u06e4";
                    break;
                default:
                    return iM9290;
            }
        }
    }

    @Override // r1.j0
    public final r1.k0 e(r1.l0 l0Var, List list, long j10) {
        Object obj;
        r1.x0 x0Var;
        Object obj2;
        r1.x0 x0Var2;
        Object obj3;
        r1.x0 x0Var3;
        Object obj4;
        r1.x0 x0Var4;
        Object obj5;
        r1.x0 x0Var5;
        Object obj6;
        int iM161;
        Object obj7;
        r1.x0 x0Var6;
        r1.x0 x0Var7;
        int i10;
        int i11;
        y.t0 t0VarM2223 = C0115.m2223(this);
        int iM2912 = C0152.m2912(l0Var, C0087.m1856(t0VarM2223));
        long jM3547 = C0186.m3547(j10, 0, 0, 0, 0, C0072.f104 ^ 123);
        int iM171 = C0008.m171(list);
        int i12 = 0;
        while (true) {
            int i13 = i12;
            int i14 = 1616;
            while (true) {
                i14 ^= 1633;
                switch (i14) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i14 = i13 < iM171 ? 1709 : 1678;
                        break;
                    case 204:
                        Object objM6101 = C0315.m6101(list, i13);
                        boolean zM4399 = C0228.m4399(C0368.m7238((r1.i0) objM6101), C0390.m7649(m6436(), 0, C0010.f30 ^ 886, 1284));
                        int i15 = 1740;
                        while (true) {
                            i15 ^= 1757;
                            switch (i15) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i15 = zM4399 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    i12 = (C0112.f138 ^ 569) + i13;
                                    int i16 = 48767;
                                    while (true) {
                                        i16 ^= 48784;
                                        switch (i16) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 239:
                                                i16 = 48798;
                                                break;
                                        }
                                    }
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    int i17 = 1864;
                                    while (true) {
                                        i17 ^= 1881;
                                        switch (i17) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i17 = 48674;
                                                continue;
                                            case 47483:
                                                obj = objM6101;
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
                        obj = null;
                        break;
                    default:
                        break;
                }
            }
        }
        r1.i0 i0Var = (r1.i0) obj;
        int i18 = 48891;
        while (true) {
            i18 ^= 48908;
            switch (i18) {
                case 22:
                    break;
                case 53:
                    x0Var = null;
                    break;
                case 503:
                    i18 = i0Var != null ? 49635 : 48953;
                    break;
                case 32495:
                    r1.x0 x0VarM8844 = C0453.m8844(i0Var, jM3547);
                    int i19 = 49666;
                    while (true) {
                        i19 ^= 49683;
                        switch (i19) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i19 = 49697;
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                x0Var = x0VarM8844;
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
        int iM4386 = C0227.m4386(x0Var);
        int iM1119 = C0059.m1119(0, C0332.m6460(x0Var));
        int iM172 = C0008.m171(list);
        int i20 = 0;
        while (true) {
            int i21 = i20;
            int i22 = 49790;
            while (true) {
                i22 ^= 49807;
                switch (i22) {
                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        break;
                    case 51:
                        obj2 = null;
                        break;
                    case 84:
                        Object objM6102 = C0315.m6101(list, i21);
                        boolean zM43910 = C0228.m4399(C0368.m7238((r1.i0) objM6102), C0460.m8963(m6436(), 7, C0047.f67 ^ 967, 2615));
                        int i23 = 49914;
                        while (true) {
                            i23 ^= 49931;
                            switch (i23) {
                                case 497:
                                    i23 = zM43910 ? 50658 : 50627;
                                    break;
                                case 1711:
                                    break;
                                case 1736:
                                    i20 = (C0109.f135 ^ 66) + i21;
                                    int i24 = 50813;
                                    while (true) {
                                        i24 ^= 50830;
                                        switch (i24) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 243:
                                                i24 = 50844;
                                                break;
                                        }
                                    }
                                    break;
                                case 1769:
                                    int i25 = 50689;
                                    while (true) {
                                        i25 ^= 50706;
                                        switch (i25) {
                                            case 19:
                                                i25 = 50720;
                                                continue;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                obj2 = objM6102;
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
                    case 241:
                        i22 = i21 < iM172 ? 49883 : 49852;
                        break;
                    default:
                        break;
                }
            }
        }
        r1.i0 i0Var2 = (r1.i0) obj2;
        int i26 = C0080.f114;
        int i27 = 51588;
        while (true) {
            i27 ^= 51605;
            switch (i27) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i27 = i0Var2 != null ? 51681 : 51650;
                    break;
                case 54:
                    break;
                case 87:
                    x0Var2 = null;
                    break;
                case 116:
                    r1.x0 x0VarM8845 = C0453.m8844(i0Var2, C0339.m6666(jM3547, -iM4386, 0, i26 ^ (-606)));
                    int i28 = 51712;
                    while (true) {
                        i28 ^= 51729;
                        switch (i28) {
                            case Code.UNAVAILABLE /* 14 */:
                                x0Var2 = x0VarM8845;
                                break;
                            case 15:
                            case Code.UNAUTHENTICATED /* 16 */:
                            default:
                                continue;
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i28 = 51743;
                                continue;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        int iM4387 = 0 - ((0 - C0227.m4386(x0Var2)) - iM4386);
        int iM11110 = C0059.m1119(iM1119, C0332.m6460(x0Var2));
        int iM173 = C0008.m171(list);
        int i29 = 0;
        while (true) {
            int i30 = i29;
            int i31 = 51836;
            while (true) {
                i31 ^= 51853;
                switch (i31) {
                    case 241:
                        i31 = i30 < iM173 ? 52580 : 52549;
                        break;
                    case 1963:
                        break;
                    case 1992:
                        obj3 = null;
                        break;
                    case 2025:
                        Object objM6103 = C0315.m6101(list, i30);
                        boolean zM43911 = C0228.m4399(C0368.m7238((r1.i0) objM6103), C0456.m8898(m6436(), 15, C0364.f635 ^ (-740), 883));
                        int i32 = 52611;
                        while (true) {
                            i32 ^= 52628;
                            switch (i32) {
                                case 23:
                                    i32 = zM43911 ? 52704 : 52673;
                                    break;
                                case 54:
                                    break;
                                case 85:
                                    i29 = (C0316.f464 ^ 174) + i30;
                                    int i33 = 53510;
                                    while (true) {
                                        i33 ^= 53527;
                                        switch (i33) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i33 = 53541;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                        }
                                    }
                                    break;
                                case 116:
                                    int i34 = 52735;
                                    while (true) {
                                        i34 ^= 52752;
                                        switch (i34) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                obj3 = objM6103;
                                                break;
                                            case 1007:
                                                i34 = 52766;
                                                continue;
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
        }
        r1.i0 i0Var3 = (r1.i0) obj3;
        int i35 = 53634;
        while (true) {
            i35 ^= 53651;
            switch (i35) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i35 = i0Var3 != null ? 53727 : 53696;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    r1.x0 x0VarM8846 = C0453.m8844(i0Var3, C0339.m6666(jM3547, -iM4387, 0, C0250.f330 ^ (-136)));
                    int i36 = 53758;
                    while (true) {
                        i36 ^= 53775;
                        switch (i36) {
                            case 1009:
                                i36 = 54440;
                                continue;
                            case 1703:
                                x0Var3 = x0VarM8846;
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 83:
                    x0Var3 = null;
                    break;
                default:
                    break;
            }
        }
        int iM4388 = ((C0227.m4386(x0Var3) + 8) + iM4387) - 8;
        int iM11111 = C0059.m1119(iM11110, C0332.m6460(x0Var3));
        int iM174 = C0008.m171(list);
        int i37 = 0;
        while (true) {
            int i38 = i37;
            int i39 = 54533;
            while (true) {
                i39 ^= 54550;
                switch (i39) {
                    case 19:
                        i39 = i38 < iM174 ? 54626 : 54595;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                    case 85:
                        obj4 = null;
                        break;
                    case 116:
                        Object objM6104 = C0315.m6101(list, i38);
                        boolean zM43912 = C0228.m4399(C0368.m7238((r1.i0) objM6104), C0112.m2172(m6436(), 21, C0472.f743 ^ (-556), 1601));
                        int i40 = 54657;
                        while (true) {
                            i40 ^= 54674;
                            switch (i40) {
                                case 19:
                                    i40 = zM43912 ? 55401 : 54719;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    i37 = (C0241.f321 ^ (-805)) + i38;
                                    int i41 = 55556;
                                    while (true) {
                                        i41 ^= 55573;
                                        switch (i41) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i41 = 55587;
                                                break;
                                            case 54:
                                                break;
                                        }
                                    }
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 3579:
                                    int i42 = 55432;
                                    while (true) {
                                        i42 ^= 55449;
                                        switch (i42) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i42 = 55463;
                                                continue;
                                            case 62:
                                                obj4 = objM6104;
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
        }
        r1.i0 i0Var4 = (r1.i0) obj4;
        int i43 = 55680;
        while (true) {
            i43 ^= 55697;
            switch (i43) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i43 = i0Var4 != null ? 56424 : 56393;
                    break;
                case 1467:
                    break;
                case 1496:
                    x0Var4 = null;
                    break;
                case 1529:
                    r1.x0 x0VarM8847 = C0453.m8844(i0Var4, C0339.m6666(jM3547, -iM4388, 0, C0021.f41 ^ 974));
                    int i44 = 56455;
                    while (true) {
                        i44 ^= 56472;
                        switch (i44) {
                            case 31:
                                i44 = 56486;
                                continue;
                            case 62:
                                x0Var4 = x0VarM8847;
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
        int iM4389 = C0227.m4386(x0Var4);
        int iM11112 = C0059.m1119(iM11111, C0332.m6460(x0Var4));
        int iM2913 = 0 - ((0 - C0152.m2912(l0Var, C0180.m3439(t0VarM2223, C0359.m7050(l0Var)))) - C0152.m2912(l0Var, C0268.m5128(t0VarM2223, C0359.m7050(l0Var))));
        int i45 = -(((iM4389 + 20) + iM4388) - 20);
        int i46 = -iM2912;
        long jM6705 = C0341.m6705(jM3547, C0249.m4776(((i45 - 15) - iM2913) + 15, -iM2913, C0202.m3871(this)), i46);
        int iM175 = C0008.m171(list);
        int i47 = 0;
        while (true) {
            int i48 = i47;
            int i49 = 56579;
            while (true) {
                i49 ^= 56596;
                switch (i49) {
                    case 23:
                        i49 = i48 < iM175 ? 1507472 : 56641;
                        break;
                    case 54:
                        break;
                    case 85:
                        obj5 = null;
                        break;
                    case 1564036:
                        Object objM6105 = C0315.m6101(list, i48);
                        boolean zM43913 = C0228.m4399(C0368.m7238((r1.i0) objM6105), C0189.m3620(m6436(), 27, C0183.f207 ^ (-883), 2535));
                        int i50 = 1507503;
                        while (true) {
                            i50 ^= 1507520;
                            switch (i50) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    i47 = (C0017.f37 ^ (-434)) + i48;
                                    int i51 = 1507751;
                                    while (true) {
                                        i51 ^= 1507768;
                                        switch (i51) {
                                            case 31:
                                                i51 = 1508433;
                                                break;
                                            case 1513:
                                                break;
                                        }
                                    }
                                    break;
                                case 111:
                                    i50 = zM43913 ? 1507596 : 1507565;
                                    break;
                                case 460:
                                    int i52 = 1507627;
                                    while (true) {
                                        i52 ^= 1507644;
                                        switch (i52) {
                                            case 23:
                                                i52 = 1507658;
                                                continue;
                                            case 118:
                                                obj5 = objM6105;
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
        }
        r1.i0 i0Var5 = (r1.i0) obj5;
        int i53 = 1508526;
        while (true) {
            i53 ^= 1508543;
            switch (i53) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i53 = i0Var5 != null ? 1508619 : 1508588;
                    break;
                case 83:
                    x0Var5 = null;
                    break;
                case 114:
                    break;
                case 436:
                    r1.x0 x0VarM8848 = C0453.m8844(i0Var5, jM6705);
                    int i54 = 1508650;
                    while (true) {
                        i54 ^= 1508667;
                        switch (i54) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i54 = 1508681;
                                continue;
                            case 114:
                                x0Var5 = x0VarM8848;
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
        int i55 = 1509425;
        while (true) {
            i55 ^= 1509442;
            switch (i55) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    break;
                case 115:
                    i55 = x0Var5 != null ? 1509518 : 1509487;
                    break;
                case 204:
                    C0223.m4297(C0462.m9007(this), new d1.f(C0083.m1788(C0076.m1647(x0Var5), C0350.m6867(x0Var5))));
                    break;
                default:
                    break;
            }
        }
        int iM176 = C0008.m171(list);
        int i56 = 0;
        while (true) {
            int i57 = i56;
            int i58 = 1509549;
            while (true) {
                i58 ^= 1509566;
                switch (i58) {
                    case 19:
                        i58 = i57 < iM176 ? 1509642 : 1509611;
                        break;
                    case 85:
                        obj6 = null;
                        break;
                    case 114:
                        break;
                    case 436:
                        Object objM6106 = C0315.m6101(list, i57);
                        boolean zM43914 = C0228.m4399(C0368.m7238((r1.i0) objM6106), C0475.m9255(m6436(), 32, C0032.f52 ^ (-748), 2982));
                        int i59 = 1509673;
                        while (true) {
                            i59 ^= 1509690;
                            switch (i59) {
                                case 19:
                                    i59 = zM43914 ? 1510417 : 1510386;
                                    break;
                                case 712:
                                    i56 = (C0448.f719 ^ (-830)) + i57;
                                    int i60 = 1510572;
                                    while (true) {
                                        i60 ^= 1510589;
                                        switch (i60) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i60 = 1510603;
                                                break;
                                            case 118:
                                                break;
                                        }
                                    }
                                    break;
                                case 745:
                                    break;
                                case 1323:
                                    int i61 = 1510448;
                                    while (true) {
                                        i61 ^= 1510465;
                                        switch (i61) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                obj6 = objM6106;
                                                break;
                                            case 113:
                                                i61 = 1510479;
                                                continue;
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
        }
        r1.i0 i0Var6 = (r1.i0) obj6;
        int i62 = 1511347;
        while (true) {
            i62 ^= 1511364;
            switch (i62) {
                case 22:
                    break;
                case 53:
                    iM161 = 0;
                    break;
                case 119:
                    i62 = i0Var6 != null ? 1511440 : 1511409;
                    break;
                case 8148:
                    iM161 = C0008.m161(i0Var6, C0090.m1927(j10));
                    int i63 = 1511471;
                    while (true) {
                        i63 ^= 1511488;
                        switch (i63) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 111:
                                i63 = 1511502;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        int iM11113 = C0059.m1119(C0332.m6460(x0Var5) / 2, C0152.m2912(l0Var, C0337.m6619(t0VarM2223)));
        long jM3548 = C0186.m3547(C0341.m6705(j10, i45, (((((i46 - 5) - iM11113) + 5) - 3) - iM161) + 3), 0, 0, 0, 0, C0060.f80 ^ (-885));
        int iM177 = C0008.m171(list);
        int i64 = 0;
        while (true) {
            int i65 = i64;
            String strM5456 = C0282.m5456(m6436(), 42, C0090.f124 ^ 876, 2194);
            int i66 = 1511595;
            while (true) {
                i66 ^= 1511612;
                switch (i66) {
                    case 23:
                        i66 = i65 < iM177 ? 1512339 : 1512308;
                        break;
                    case 815:
                        break;
                    case 968:
                        throw new NoSuchElementException(strM5456);
                    case 1001:
                        break;
                    default:
                        break;
                }
            }
            r1.i0 i0Var7 = (r1.i0) C0315.m6101(list, i65);
            boolean zM43915 = C0228.m4399(C0368.m7238(i0Var7), C0466.m9093(m6436(), 96, C0117.f143 ^ 950, 2386));
            int i67 = 1512370;
            while (true) {
                i67 ^= 1512387;
                switch (i67) {
                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        break;
                    case 51:
                        break;
                    case 113:
                        i67 = zM43915 ? 1512463 : 1512432;
                        break;
                    case 1996:
                        r1.x0 x0VarM8849 = C0453.m8844(i0Var7, jM3548);
                        long jM3549 = C0186.m3547(jM3548, 0, 0, 0, 0, C0022.f42 ^ (-680));
                        int iM178 = C0008.m171(list);
                        int i68 = 0;
                        while (true) {
                            int i69 = i68;
                            int i70 = 1512494;
                            while (true) {
                                i70 ^= 1512511;
                                switch (i70) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i70 = i69 < iM178 ? 1513238 : 1512556;
                                        break;
                                    case 83:
                                        obj7 = null;
                                        break;
                                    case 114:
                                        break;
                                    case 809:
                                        Object objM6107 = C0315.m6101(list, i69);
                                        boolean zM43916 = C0228.m4399(C0368.m7238((r1.i0) objM6107), C0296.m5708(m6436(), 105, C0370.f641 ^ 798, 1366));
                                        int i71 = 1513269;
                                        while (true) {
                                            i71 ^= 1513286;
                                            switch (i71) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 53:
                                                    i68 = (C0372.f643 ^ (-475)) + i69;
                                                    int i72 = 1513517;
                                                    while (true) {
                                                        i72 ^= 1513534;
                                                        switch (i72) {
                                                            case 19:
                                                                i72 = 1514199;
                                                                break;
                                                            case 745:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 115:
                                                    i71 = zM43916 ? 1513362 : 1513331;
                                                    break;
                                                case 212:
                                                    int i73 = 1513393;
                                                    while (true) {
                                                        i73 ^= 1513410;
                                                        switch (i73) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                obj7 = objM6107;
                                                                break;
                                                            case 115:
                                                                i73 = 1513424;
                                                                continue;
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
                        }
                        r1.i0 i0Var8 = (r1.i0) obj7;
                        int i74 = 1514292;
                        while (true) {
                            i74 ^= 1514309;
                            switch (i74) {
                                case 22:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                    x0Var6 = null;
                                    break;
                                case 113:
                                    if (i0Var8 != null) {
                                        i74 = 1514385;
                                    }
                                    break;
                                case 212:
                                    r1.x0 x0VarM88410 = C0453.m8844(i0Var8, jM3549);
                                    int i75 = 1514416;
                                    while (true) {
                                        i75 ^= 1514433;
                                        switch (i75) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                x0Var6 = x0VarM88410;
                                                break;
                                            case 113:
                                                i75 = 1514447;
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i74 = 1514354;
                        }
                        int iM11114 = C0059.m1119(iM11112, ((((C0059.m1119(C0332.m6460(x0VarM8849), C0332.m6460(x0Var6)) - 23) + iM11113) + 23) - 18) + iM2912 + 18);
                        int iM4447 = C0231.m4447(C0227.m4386(x0Var), C0227.m4386(x0Var2), C0227.m4386(x0Var3), C0227.m4386(x0Var4), C0076.m1647(x0VarM8849), C0227.m4386(x0Var5), C0227.m4386(x0Var6), C0202.m3871(this), j10, C0223.m4299(l0Var), C0115.m2223(this));
                        long jM35410 = C0186.m3547(C0339.m6666(jM3547, 0, -iM11114, 1), 0, iM4447, 0, 0, C0324.f472 ^ (-432));
                        int i76 = 1515191;
                        while (true) {
                            i76 ^= 1515208;
                            switch (i76) {
                                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                    break;
                                case 61:
                                    x0Var7 = null;
                                    break;
                                case 127:
                                    i76 = i0Var6 != null ? 1515284 : 1515253;
                                    break;
                                case 476:
                                    r1.x0 x0VarM88411 = C0453.m8844(i0Var6, jM35410);
                                    int i77 = 1515315;
                                    while (true) {
                                        i77 ^= 1515332;
                                        switch (i77) {
                                            case 22:
                                                x0Var7 = x0VarM88411;
                                                break;
                                            case 119:
                                                i77 = 1515346;
                                                continue;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        int iM6460 = C0332.m6460(x0Var7);
                        int iM6949 = C0354.m6949(C0332.m6460(x0Var), C0332.m6460(x0Var2), C0332.m6460(x0Var3), C0332.m6460(x0Var4), C0350.m6867(x0VarM8849), C0332.m6460(x0Var5), C0332.m6460(x0Var6), C0332.m6460(x0Var7), C0202.m3871(this), j10, C0223.m4299(l0Var), C0115.m2223(this));
                        int i78 = ((iM6949 + 16) - iM6460) - 16;
                        int iM179 = C0008.m171(list);
                        int i79 = 0;
                        while (true) {
                            int i80 = i79;
                            int i81 = 1515439;
                            while (true) {
                                i81 ^= 1515456;
                                switch (i81) {
                                    case 111:
                                        i81 = i80 < iM179 ? 1516183 : 1516152;
                                        break;
                                    case 15703:
                                        break;
                                    case 15769:
                                        break;
                                    case 15800:
                                        throw new NoSuchElementException(strM5456);
                                    default:
                                        break;
                                }
                            }
                            r1.i0 i0Var9 = (r1.i0) C0315.m6101(list, i80);
                            boolean zM43917 = C0228.m4399(C0368.m7238(i0Var9), C0252.m4833(m6436(), 109, C0380.f651 ^ (-715), 3141));
                            int i82 = 1516214;
                            while (true) {
                                i82 ^= 1516231;
                                switch (i82) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 51:
                                        break;
                                    case 113:
                                        i82 = zM43917 ? 1516307 : 1516276;
                                        break;
                                    case 468:
                                        int i83 = 1516338;
                                        while (true) {
                                            i83 ^= 1516355;
                                            switch (i83) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 51:
                                                    i10 = 0;
                                                    break;
                                                case 113:
                                                    i83 = iM4447 != Integer.MAX_VALUE ? 1537263 : 1516400;
                                                    break;
                                                case 22444:
                                                    int i84 = 1537294;
                                                    while (true) {
                                                        i84 ^= 1537311;
                                                        switch (i84) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i84 = 1537325;
                                                                continue;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                i10 = iM4447;
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
                                        int i85 = 1537418;
                                        while (true) {
                                            i85 ^= 1537435;
                                            switch (i85) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (i78 != Integer.MAX_VALUE) {
                                                        i85 = 1537511;
                                                    }
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 83:
                                                    i11 = 0;
                                                    break;
                                                case 124:
                                                    int i86 = 1537542;
                                                    while (true) {
                                                        i86 ^= 1537559;
                                                        switch (i86) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i86 = 1538224;
                                                                break;
                                                            case 3751:
                                                                i11 = i78;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i85 = 1537480;
                                        }
                                        return C0410.m8048(l0Var, iM4447, iM6949, C0127.m2452(), new t1(iM6949, iM4447, x0Var, x0Var2, x0Var3, x0Var4, x0VarM8849, x0Var5, x0Var6, C0453.m8844(i0Var9, C0175.m3332(i10, iM4447, i11, i78)), x0Var7, this, l0Var));
                                    default:
                                        break;
                                }
                            }
                            i79 = (C0105.f131 ^ 464) + i80;
                            int i87 = 1538317;
                            while (true) {
                                i87 ^= 1538334;
                                switch (i87) {
                                    case 19:
                                        i87 = 1538348;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                }
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
            i64 = (C0157.f181 ^ (-323)) + i65;
            int i88 = 1538441;
            while (true) {
                i88 ^= 1538458;
                switch (i88) {
                    case 19:
                        i88 = 1538472;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:322:0x055b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:331:0x0597. Please report as an issue. */
    public final int f(t1.c1 c1Var, List list, int i10, l0 l0Var) {
        Object obj;
        int iM8515;
        int i11;
        Object obj2;
        int iM8516;
        int i12;
        Object obj3;
        int iM8517;
        Object obj4;
        int iM8518;
        int i13;
        Object obj5;
        int iM8519;
        int i14;
        Object obj6;
        int iM85110;
        Object obj7;
        int iM85111;
        int i15;
        int iM171 = C0008.m171(list);
        int i16 = 0;
        while (true) {
            int i17 = i16;
            int i18 = 1616;
            while (true) {
                i18 ^= 1633;
                switch (i18) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i18 = i17 < iM171 ? 1709 : 1678;
                        break;
                    case 204:
                        Object objM6101 = C0315.m6101(list, i17);
                        boolean zM4399 = C0228.m4399(C0123.m2381((r1.p) objM6101), C0209.m4014(m6436(), 118, C0237.f317 ^ (-610), 954));
                        int i19 = 1740;
                        while (true) {
                            i19 ^= 1757;
                            switch (i19) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i19 = zM4399 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    i16 = (C0183.f207 ^ (-887)) + i17;
                                    int i20 = 48767;
                                    while (true) {
                                        i20 ^= 48784;
                                        switch (i20) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 239:
                                                i20 = 48798;
                                                break;
                                        }
                                    }
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    int i21 = 1864;
                                    while (true) {
                                        i21 ^= 1881;
                                        switch (i21) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i21 = 48674;
                                                continue;
                                            case 47483:
                                                obj = objM6101;
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
                        obj = null;
                        break;
                    default:
                        break;
                }
            }
        }
        r1.p pVar = (r1.p) obj;
        int i22 = 2147483587 ^ C0201.f225;
        int i23 = 48891;
        while (true) {
            i23 ^= 48908;
            switch (i23) {
                case 22:
                    break;
                case 53:
                    iM8515 = 0;
                    i11 = i10;
                    break;
                case 503:
                    i23 = pVar != null ? 49635 : 48953;
                    break;
                case 32495:
                    int iM420 = C0021.m420(pVar, i22);
                    int i24 = 49666;
                    while (true) {
                        i24 ^= 49683;
                        switch (i24) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i24 = i10 == i22 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                int i25 = 49790;
                                while (true) {
                                    i25 ^= 49807;
                                    switch (i25) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            i15 = i10;
                                            break;
                                        case 241:
                                            i25 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                i15 = ((i10 - 3) - iM420) + 3;
                                break;
                            default:
                                break;
                        }
                    }
                    iM8515 = C0435.m8515((Number) C0364.m7154(l0Var, pVar, C0057.m1083(i10)));
                    int i26 = 49914;
                    while (true) {
                        i26 ^= 49931;
                        switch (i26) {
                            case 497:
                                i26 = 50596;
                                continue;
                            case 1711:
                                i11 = i15;
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
        int iM172 = C0008.m171(list);
        int i27 = 0;
        while (true) {
            int i28 = i27;
            int i29 = 50689;
            while (true) {
                i29 ^= 50706;
                switch (i29) {
                    case 19:
                        i29 = i28 < iM172 ? 50782 : 50751;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        obj2 = null;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                    case 76:
                        Object objM6102 = C0315.m6101(list, i28);
                        boolean zM43910 = C0228.m4399(C0123.m2381((r1.p) objM6102), C0337.m6634(m6436(), 125, C0070.f90 ^ 757, 1784));
                        int i30 = 50813;
                        while (true) {
                            i30 ^= 50830;
                            switch (i30) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case 53:
                                    i27 = (C0347.f618 ^ 385) + i28;
                                    int i31 = 51712;
                                    while (true) {
                                        i31 ^= 51729;
                                        switch (i31) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i31 = 51743;
                                                break;
                                        }
                                    }
                                    break;
                                case 243:
                                    i30 = zM43910 ? 51557 : 50875;
                                    break;
                                case 4075:
                                    int i32 = 51588;
                                    while (true) {
                                        i32 ^= 51605;
                                        switch (i32) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i32 = 51619;
                                                continue;
                                            case 54:
                                                obj2 = objM6102;
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
        }
        r1.p pVar2 = (r1.p) obj2;
        int i33 = 51836;
        while (true) {
            i33 ^= 51853;
            switch (i33) {
                case 241:
                    i33 = pVar2 != null ? 52580 : 52549;
                    break;
                case 1963:
                    break;
                case 1992:
                    iM8516 = 0;
                    i12 = i11;
                    break;
                case 2025:
                    int iM421 = C0021.m420(pVar2, i22);
                    int i34 = 52611;
                    while (true) {
                        i34 ^= 52628;
                        switch (i34) {
                            case 23:
                                i34 = i11 == i22 ? 52704 : 52673;
                                break;
                            case 54:
                                break;
                            case 85:
                                i11 = ((i11 + 27) - iM421) - 27;
                                break;
                            case 116:
                                int i35 = 52735;
                                while (true) {
                                    i35 ^= 52752;
                                    switch (i35) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 1007:
                                            i35 = 52766;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    iM8516 = C0435.m8515((Number) C0364.m7154(l0Var, pVar2, C0057.m1083(i10)));
                    int i36 = 53510;
                    while (true) {
                        i36 ^= 53527;
                        switch (i36) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i36 = 53541;
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                i12 = i11;
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
        int iM173 = C0008.m171(list);
        int i37 = 0;
        while (true) {
            int i38 = i37;
            int i39 = 53634;
            while (true) {
                i39 ^= 53651;
                switch (i39) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i39 = i38 < iM173 ? 53727 : 53696;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                    case 76:
                        Object objM6103 = C0315.m6101(list, i38);
                        boolean zM43911 = C0228.m4399(C0123.m2381((r1.p) objM6103), C0059.m1123(m6436(), 133, C0107.f133 ^ (-723), 2854));
                        int i40 = 53758;
                        while (true) {
                            i40 ^= 53775;
                            switch (i40) {
                                case 1009:
                                    i40 = zM43911 ? 54502 : 54471;
                                    break;
                                case 1703:
                                    break;
                                case 1736:
                                    i37 = (C0171.f195 ^ (-79)) + i38;
                                    int i41 = 54657;
                                    while (true) {
                                        i41 ^= 54674;
                                        switch (i41) {
                                            case 19:
                                                i41 = 54688;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                        }
                                    }
                                    break;
                                case 1769:
                                    int i42 = 54533;
                                    while (true) {
                                        i42 ^= 54550;
                                        switch (i42) {
                                            case 19:
                                                i42 = 54564;
                                                continue;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                obj3 = objM6103;
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
                    case 83:
                        obj3 = null;
                        break;
                    default:
                        break;
                }
            }
        }
        r1.p pVar3 = (r1.p) obj3;
        int i43 = 55432;
        while (true) {
            i43 ^= 55449;
            switch (i43) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (pVar3 != null) {
                        i43 = 55525;
                    }
                    break;
                case 62:
                    break;
                case 95:
                    iM8517 = 0;
                    break;
                case 124:
                    iM8517 = C0435.m8515((Number) C0364.m7154(l0Var, pVar3, C0057.m1083(C0249.m4776(i12, i10, C0202.m3871(this)))));
                    int i44 = 55556;
                    while (true) {
                        i44 ^= 55573;
                        switch (i44) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i44 = 55587;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i43 = 55494;
        }
        int iM174 = C0008.m171(list);
        int i45 = 0;
        while (true) {
            int i46 = i45;
            int i47 = 55680;
            while (true) {
                i47 ^= 55697;
                switch (i47) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i47 = i46 < iM174 ? 56424 : 56393;
                        break;
                    case 1467:
                        break;
                    case 1496:
                        obj4 = null;
                        break;
                    case 1529:
                        Object objM6104 = C0315.m6101(list, i46);
                        boolean zM43912 = C0228.m4399(C0123.m2381((r1.p) objM6104), C0032.m626(m6436(), 138, C0346.f617 ^ (-767), 2074));
                        int i48 = 56455;
                        while (true) {
                            i48 ^= 56472;
                            switch (i48) {
                                case 31:
                                    i48 = zM43912 ? 56548 : 56517;
                                    break;
                                case 62:
                                    break;
                                case 93:
                                    i45 = (C0215.f239 ^ (-793)) + i46;
                                    int i49 = 1507503;
                                    while (true) {
                                        i49 ^= 1507520;
                                        switch (i49) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 111:
                                                i49 = 1507534;
                                                break;
                                        }
                                    }
                                    break;
                                case 124:
                                    int i50 = 56579;
                                    while (true) {
                                        i50 ^= 56596;
                                        switch (i50) {
                                            case 23:
                                                i50 = 56610;
                                                continue;
                                            case 54:
                                                obj4 = objM6104;
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
        }
        r1.p pVar4 = (r1.p) obj4;
        int i51 = 1507627;
        while (true) {
            i51 ^= 1507644;
            switch (i51) {
                case 23:
                    i51 = pVar4 != null ? 1507720 : 1507689;
                    break;
                case 85:
                    iM8518 = 0;
                    i13 = i12;
                    break;
                case 118:
                    break;
                case 180:
                    iM8518 = C0435.m8515((Number) C0364.m7154(l0Var, pVar4, C0057.m1083(i12)));
                    int iM422 = C0021.m420(pVar4, i22);
                    int i52 = 1507751;
                    while (true) {
                        i52 ^= 1507768;
                        switch (i52) {
                            case 31:
                                i52 = i12 == i22 ? 1508495 : 1508464;
                                break;
                            case 1335:
                                int i53 = 1508526;
                                while (true) {
                                    i53 ^= 1508543;
                                    switch (i53) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i53 = 1508557;
                                            continue;
                                        case 114:
                                            i13 = i12;
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 1480:
                                int i54 = ((i12 + 0) - iM422) + 0;
                                int i55 = 1508650;
                                while (true) {
                                    i55 ^= 1508667;
                                    switch (i55) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i55 = 1508681;
                                            continue;
                                        case 114:
                                            i13 = i54;
                                            break;
                                        default:
                                            continue;
                                    }
                                }
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
        }
        int iM175 = C0008.m171(list);
        int i56 = 0;
        while (true) {
            int i57 = i56;
            int i58 = 1509425;
            while (true) {
                i58 ^= 1509442;
                switch (i58) {
                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        obj5 = null;
                        break;
                    case 115:
                        i58 = i57 < iM175 ? 1509518 : 1509487;
                        break;
                    case 204:
                        Object objM6105 = C0315.m6101(list, i57);
                        boolean zM43913 = C0228.m4399(C0123.m2381((r1.p) objM6105), C0322.m6240(m6436(), 144, C0070.f90 ^ 763, 2436));
                        int i59 = 1509549;
                        while (true) {
                            i59 ^= 1509566;
                            switch (i59) {
                                case 19:
                                    i59 = zM43913 ? 1509642 : 1509611;
                                    break;
                                case 85:
                                    i56 = (C0111.f137 ^ (-770)) + i57;
                                    int i60 = 1510448;
                                    while (true) {
                                        i60 ^= 1510465;
                                        switch (i60) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 113:
                                                i60 = 1510479;
                                                break;
                                        }
                                    }
                                    break;
                                case 114:
                                    break;
                                case 436:
                                    int i61 = 1509673;
                                    while (true) {
                                        i61 ^= 1509690;
                                        switch (i61) {
                                            case 19:
                                                i61 = 1510355;
                                                continue;
                                            case 745:
                                                obj5 = objM6105;
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
        }
        r1.p pVar5 = (r1.p) obj5;
        int i62 = 1510572;
        while (true) {
            i62 ^= 1510589;
            switch (i62) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i62 = pVar5 != null ? 1511316 : 1510634;
                    break;
                case 87:
                    iM8519 = 0;
                    i14 = i13;
                    break;
                case 118:
                    break;
                case 809:
                    iM8519 = C0435.m8515((Number) C0364.m7154(l0Var, pVar5, C0057.m1083(i13)));
                    int iM423 = C0021.m420(pVar5, i22);
                    int i63 = 1511347;
                    while (true) {
                        i63 ^= 1511364;
                        switch (i63) {
                            case 22:
                                break;
                            case 53:
                                i13 = ((i13 + 15) - iM423) - 15;
                                break;
                            case 119:
                                i63 = i13 == i22 ? 1511440 : 1511409;
                                break;
                            case 8148:
                                int i64 = 1511471;
                                while (true) {
                                    i64 ^= 1511488;
                                    switch (i64) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 111:
                                            i64 = 1511502;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    int i65 = 1511595;
                    while (true) {
                        i65 ^= 1511612;
                        switch (i65) {
                            case 23:
                                i65 = 1512277;
                                continue;
                            case 1001:
                                i14 = i13;
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
        int iM176 = C0008.m171(list);
        int i66 = 0;
        while (true) {
            int i67 = i66;
            int i68 = 1512370;
            while (true) {
                i68 ^= 1512387;
                switch (i68) {
                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        break;
                    case 51:
                        throw new NoSuchElementException(C0157.m2993(m6436(), 173, C0020.f40 ^ (-685), 1956));
                    case 113:
                        i68 = i67 < iM176 ? 1512463 : 1512432;
                        break;
                    case 1996:
                        break;
                    default:
                        break;
                }
            }
            Object objM6106 = C0315.m6101(list, i67);
            boolean zM43914 = C0228.m4399(C0123.m2381((r1.p) objM6106), C0022.m430(m6436(), 150, C0119.f145 ^ 904, 1884));
            int i69 = 1512494;
            while (true) {
                i69 ^= 1512511;
                switch (i69) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i69 = zM43914 ? 1513238 : 1512556;
                        break;
                    case 83:
                        break;
                    case 114:
                        break;
                    case 809:
                        int iM85112 = C0435.m8515((Number) C0364.m7154(l0Var, objM6106, C0057.m1083(i14)));
                        int iM177 = C0008.m171(list);
                        int i70 = 0;
                        while (true) {
                            int i71 = i70;
                            int i72 = 1513269;
                            while (true) {
                                i72 ^= 1513286;
                                switch (i72) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 53:
                                        obj6 = null;
                                        break;
                                    case 115:
                                        i72 = i71 < iM177 ? 1513362 : 1513331;
                                        break;
                                    case 212:
                                        Object objM6107 = C0315.m6101(list, i71);
                                        boolean zM43915 = C0228.m4399(C0123.m2381((r1.p) objM6107), C0439.m8580(m6436(), 159, C0211.f235 ^ 558, 1815));
                                        int i73 = 1513393;
                                        while (true) {
                                            i73 ^= 1513410;
                                            switch (i73) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    i70 = (C0212.f236 ^ 233) + i71;
                                                    int i74 = 1514292;
                                                    while (true) {
                                                        i74 ^= 1514309;
                                                        switch (i74) {
                                                            case 22:
                                                                break;
                                                            case 113:
                                                                i74 = 1514323;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 115:
                                                    i73 = zM43915 ? 1513486 : 1513455;
                                                    break;
                                                case 4044:
                                                    int i75 = 1513517;
                                                    while (true) {
                                                        i75 ^= 1513534;
                                                        switch (i75) {
                                                            case 19:
                                                                i75 = 1514199;
                                                                continue;
                                                            case 745:
                                                                obj6 = objM6107;
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
                        }
                        r1.p pVar6 = (r1.p) obj6;
                        int i76 = 1514416;
                        while (true) {
                            i76 ^= 1514433;
                            switch (i76) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 47:
                                    iM85110 = 0;
                                    break;
                                case 113:
                                    i76 = pVar6 != null ? 1515160 : 1514478;
                                    break;
                                case 1369:
                                    iM85110 = C0435.m8515((Number) C0364.m7154(l0Var, pVar6, C0057.m1083(i14)));
                                    int i77 = 1515191;
                                    while (true) {
                                        i77 ^= 1515208;
                                        switch (i77) {
                                            case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                break;
                                            case 127:
                                                i77 = 1515222;
                                                continue;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        int iM178 = C0008.m171(list);
                        int i78 = 0;
                        while (true) {
                            int i79 = i78;
                            int i80 = 1515315;
                            while (true) {
                                i80 ^= 1515332;
                                switch (i80) {
                                    case 22:
                                        break;
                                    case 53:
                                        obj7 = null;
                                        break;
                                    case 119:
                                        i80 = i79 < iM178 ? 1515408 : 1515377;
                                        break;
                                    case 212:
                                        Object objM6108 = C0315.m6101(list, i79);
                                        boolean zM43916 = C0228.m4399(C0123.m2381((r1.p) objM6108), C0459.m8961(m6436(), 163, C0252.f332 ^ 679, 1832));
                                        int i81 = 1515439;
                                        while (true) {
                                            i81 ^= 1515456;
                                            switch (i81) {
                                                case 111:
                                                    i81 = zM43916 ? 1516183 : 1516152;
                                                    break;
                                                case 15703:
                                                    int i82 = 1516214;
                                                    while (true) {
                                                        i82 ^= 1516231;
                                                        switch (i82) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                obj7 = objM6108;
                                                                break;
                                                            case 113:
                                                                i82 = 1516245;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 15769:
                                                    break;
                                                case 15800:
                                                    i78 = (C0039.f59 ^ 823) + i79;
                                                    int i83 = 1516338;
                                                    while (true) {
                                                        i83 ^= 1516355;
                                                        switch (i83) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 113:
                                                                i83 = 1516369;
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
                        r1.p pVar7 = (r1.p) obj7;
                        int i84 = 1537294;
                        while (true) {
                            i84 ^= 1537311;
                            switch (i84) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    if (pVar7 != null) {
                                        i84 = 1537387;
                                    }
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 83:
                                    iM85111 = 0;
                                    break;
                                case 116:
                                    iM85111 = C0435.m8515((Number) C0364.m7154(l0Var, pVar7, C0057.m1083(i10)));
                                    int i85 = 1537418;
                                    while (true) {
                                        i85 ^= 1537435;
                                        switch (i85) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i85 = 1537449;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i84 = 1537356;
                        }
                        return C0354.m6949(iM8515, iM8516, iM8518, iM8519, iM85112, iM8517, iM85110, iM85111, C0202.m3871(this), C0018.m361(), C0485.m9452(c1Var), C0115.m2223(this));
                    default:
                        break;
                }
            }
            i66 = (C0249.f329 ^ (-827)) + i67;
            int i86 = 1537542;
            while (true) {
                i86 ^= 1537559;
                switch (i86) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i86 = 1538224;
                        break;
                    case 3751:
                        break;
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:182:0x0320. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:191:0x035c. Please report as an issue. */
    public final int g(t1.c1 c1Var, List list, int i10, l0 l0Var) {
        Object obj;
        int iM8515;
        Object obj2;
        int iM8516;
        Object obj3;
        int iM8517;
        Object obj4;
        int iM8518;
        Object obj5;
        int iM8519;
        Object obj6;
        int iM85110;
        int iM171 = C0008.m171(list);
        int i11 = 0;
        while (true) {
            int i12 = i11;
            int i13 = 1616;
            while (true) {
                i13 ^= 1633;
                switch (i13) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i13 = i12 < iM171 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        throw new NoSuchElementException(C0050.m980(m6436(), 272, C0354.f625 ^ 287, 2151));
                    default:
                        break;
                }
            }
            Object objM6101 = C0315.m6101(list, i12);
            boolean zM4399 = C0228.m4399(C0123.m2381((r1.p) objM6101), C0355.m6971(m6436(), 227, C0304.f452 ^ 27, 1005));
            int i14 = 1740;
            while (true) {
                i14 ^= 1757;
                switch (i14) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i14 = zM4399 ? 1833 : 1802;
                        break;
                    case 54:
                        break;
                    case 471:
                        break;
                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                        int iM85111 = C0435.m8515((Number) C0364.m7154(l0Var, objM6101, C0057.m1083(i10)));
                        int iM172 = C0008.m171(list);
                        int i15 = 0;
                        while (true) {
                            int i16 = i15;
                            int i17 = 1864;
                            while (true) {
                                i17 ^= 1881;
                                switch (i17) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i17 = i16 < iM172 ? 48736 : 48705;
                                        break;
                                    case 47384:
                                        obj = null;
                                        break;
                                    case 47417:
                                        Object objM6102 = C0315.m6101(list, i16);
                                        boolean zM43910 = C0228.m4399(C0123.m2381((r1.p) objM6102), C0479.m9345(m6436(), 236, C0333.f517 ^ 783, 2146));
                                        int i18 = 48767;
                                        while (true) {
                                            i18 ^= 48784;
                                            switch (i18) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    i15 = (C0288.f433 ^ 758) + i16;
                                                    int i19 = 49666;
                                                    while (true) {
                                                        i19 ^= 49683;
                                                        switch (i19) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i19 = 49697;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 76:
                                                    int i20 = 48891;
                                                    while (true) {
                                                        i20 ^= 48908;
                                                        switch (i20) {
                                                            case 22:
                                                                obj = objM6102;
                                                                break;
                                                            case 503:
                                                                i20 = 48922;
                                                                continue;
                                                            default:
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                                case 239:
                                                    i18 = zM43910 ? 48860 : 48829;
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
                        }
                        r1.p pVar = (r1.p) obj;
                        int i21 = 49790;
                        while (true) {
                            i21 ^= 49807;
                            switch (i21) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case 51:
                                    iM8515 = 0;
                                    break;
                                case 84:
                                    iM8515 = C0435.m8515((Number) C0364.m7154(l0Var, pVar, C0057.m1083(i10)));
                                    int i22 = 49914;
                                    while (true) {
                                        i22 ^= 49931;
                                        switch (i22) {
                                            case 497:
                                                i22 = 50596;
                                                continue;
                                            case 1711:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                case 241:
                                    i21 = pVar != null ? 49883 : 49852;
                                    break;
                                default:
                                    break;
                            }
                        }
                        int iM173 = C0008.m171(list);
                        int i23 = 0;
                        while (true) {
                            int i24 = i23;
                            int i25 = 50689;
                            while (true) {
                                i25 ^= 50706;
                                switch (i25) {
                                    case 19:
                                        i25 = i24 < iM173 ? 50782 : 50751;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        obj2 = null;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        Object objM6103 = C0315.m6101(list, i24);
                                        boolean zM43911 = C0228.m4399(C0123.m2381((r1.p) objM6103), C0056.m1071(m6436(), 241, C0205.f229 ^ 421, 1019));
                                        int i26 = 50813;
                                        while (true) {
                                            i26 ^= 50830;
                                            switch (i26) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 53:
                                                    i23 = (C0086.f120 ^ (-778)) + i24;
                                                    int i27 = 51712;
                                                    while (true) {
                                                        i27 ^= 51729;
                                                        switch (i27) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i27 = 51743;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 243:
                                                    i26 = zM43911 ? 51557 : 50875;
                                                    break;
                                                case 4075:
                                                    int i28 = 51588;
                                                    while (true) {
                                                        i28 ^= 51605;
                                                        switch (i28) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i28 = 51619;
                                                                continue;
                                                            case 54:
                                                                obj2 = objM6103;
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
                        }
                        r1.p pVar2 = (r1.p) obj2;
                        int i29 = 51836;
                        while (true) {
                            i29 ^= 51853;
                            switch (i29) {
                                case 241:
                                    i29 = pVar2 != null ? 52580 : 52549;
                                    break;
                                case 1963:
                                    break;
                                case 1992:
                                    iM8516 = 0;
                                    break;
                                case 2025:
                                    iM8516 = C0435.m8515((Number) C0364.m7154(l0Var, pVar2, C0057.m1083(i10)));
                                    int i30 = 52611;
                                    while (true) {
                                        i30 ^= 52628;
                                        switch (i30) {
                                            case 23:
                                                i30 = 52642;
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
                        int iM174 = C0008.m171(list);
                        int i31 = 0;
                        while (true) {
                            int i32 = i31;
                            int i33 = 52735;
                            while (true) {
                                i33 ^= 52752;
                                switch (i33) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        obj3 = null;
                                        break;
                                    case 1007:
                                        i33 = i32 < iM174 ? 53479 : 52797;
                                        break;
                                    case 7927:
                                        Object objM6104 = C0315.m6101(list, i32);
                                        boolean zM43912 = C0228.m4399(C0123.m2381((r1.p) objM6104), C0237.m4582(m6436(), 249, C0460.f731 ^ 962, 1246));
                                        int i34 = 53510;
                                        while (true) {
                                            i34 ^= 53527;
                                            switch (i34) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i34 = zM43912 ? 53603 : 53572;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 83:
                                                    i31 = (C0175.f199 ^ 563) + i32;
                                                    int i35 = 53758;
                                                    while (true) {
                                                        i35 ^= 53775;
                                                        switch (i35) {
                                                            case 1009:
                                                                i35 = 54440;
                                                                break;
                                                            case 1703:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 116:
                                                    int i36 = 53634;
                                                    while (true) {
                                                        i36 ^= 53651;
                                                        switch (i36) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i36 = 53665;
                                                                continue;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                obj3 = objM6104;
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
                        }
                        r1.p pVar3 = (r1.p) obj3;
                        int i37 = 54533;
                        while (true) {
                            i37 ^= 54550;
                            switch (i37) {
                                case 19:
                                    if (pVar3 != null) {
                                        i37 = 54626;
                                    }
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 85:
                                    iM8517 = 0;
                                    break;
                                case 116:
                                    iM8517 = C0435.m8515((Number) C0364.m7154(l0Var, pVar3, C0057.m1083(i10)));
                                    int i38 = 54657;
                                    while (true) {
                                        i38 ^= 54674;
                                        switch (i38) {
                                            case 19:
                                                i38 = 54688;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i37 = 54595;
                        }
                        int iM175 = C0008.m171(list);
                        int i39 = 0;
                        while (true) {
                            int i40 = i39;
                            int i41 = 55432;
                            while (true) {
                                i41 ^= 55449;
                                switch (i41) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i41 = i40 < iM175 ? 55525 : 55494;
                                        break;
                                    case 62:
                                        break;
                                    case 95:
                                        obj4 = null;
                                        break;
                                    case 124:
                                        Object objM6105 = C0315.m6101(list, i40);
                                        boolean zM43913 = C0228.m4399(C0123.m2381((r1.p) objM6105), C0198.m3789(m6436(), 256, C0164.f188 ^ 411, 2099));
                                        int i42 = 55556;
                                        while (true) {
                                            i42 ^= 55573;
                                            switch (i42) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i42 = zM43913 ? 55649 : 55618;
                                                    break;
                                                case 54:
                                                    break;
                                                case 87:
                                                    i39 = (C0475.f746 ^ (-28)) + i40;
                                                    int i43 = 56455;
                                                    while (true) {
                                                        i43 ^= 56472;
                                                        switch (i43) {
                                                            case 31:
                                                                i43 = 56486;
                                                                break;
                                                            case 62:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 116:
                                                    int i44 = 55680;
                                                    while (true) {
                                                        i44 ^= 55697;
                                                        switch (i44) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i44 = 56362;
                                                                continue;
                                                            case 1467:
                                                                obj4 = objM6105;
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
                        }
                        r1.p pVar4 = (r1.p) obj4;
                        int i45 = 56579;
                        while (true) {
                            i45 ^= 56596;
                            switch (i45) {
                                case 23:
                                    i45 = pVar4 != null ? 1507472 : 56641;
                                    break;
                                case 54:
                                    break;
                                case 85:
                                    iM8518 = 0;
                                    break;
                                case 1564036:
                                    iM8518 = C0435.m8515((Number) C0364.m7154(l0Var, pVar4, C0057.m1083(i10)));
                                    int i46 = 1507503;
                                    while (true) {
                                        i46 ^= 1507520;
                                        switch (i46) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 111:
                                                i46 = 1507534;
                                                continue;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        int iM176 = C0008.m171(list);
                        int i47 = 0;
                        while (true) {
                            int i48 = i47;
                            int i49 = 1507627;
                            while (true) {
                                i49 ^= 1507644;
                                switch (i49) {
                                    case 23:
                                        i49 = i48 < iM176 ? 1507720 : 1507689;
                                        break;
                                    case 85:
                                        obj5 = null;
                                        break;
                                    case 118:
                                        break;
                                    case 180:
                                        Object objM6106 = C0315.m6101(list, i48);
                                        boolean zM43914 = C0228.m4399(C0123.m2381((r1.p) objM6106), C0192.m3660(m6436(), 262, C0034.f54 ^ 513, 2530));
                                        int i50 = 1507751;
                                        while (true) {
                                            i50 ^= 1507768;
                                            switch (i50) {
                                                case 31:
                                                    i50 = zM43914 ? 1508495 : 1508464;
                                                    break;
                                                case 1335:
                                                    int i51 = 1508526;
                                                    while (true) {
                                                        i51 ^= 1508543;
                                                        switch (i51) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i51 = 1508557;
                                                                break;
                                                            case 114:
                                                                obj5 = objM6106;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 1480:
                                                    i47 = (C0407.f678 ^ (-493)) + i48;
                                                    int i52 = 1508650;
                                                    while (true) {
                                                        i52 ^= 1508667;
                                                        switch (i52) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i52 = 1508681;
                                                                break;
                                                            case 114:
                                                                break;
                                                        }
                                                    }
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
                            }
                        }
                        r1.p pVar5 = (r1.p) obj5;
                        int i53 = 1509425;
                        while (true) {
                            i53 ^= 1509442;
                            switch (i53) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    iM8519 = 0;
                                    break;
                                case 115:
                                    if (pVar5 != null) {
                                        i53 = 1509518;
                                    }
                                    break;
                                case 204:
                                    iM8519 = C0435.m8515((Number) C0364.m7154(l0Var, pVar5, C0057.m1083(i10)));
                                    int i54 = 1509549;
                                    while (true) {
                                        i54 ^= 1509566;
                                        switch (i54) {
                                            case 19:
                                                i54 = 1509580;
                                                break;
                                            case 114:
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i53 = 1509487;
                        }
                        int iM177 = C0008.m171(list);
                        int i55 = 0;
                        while (true) {
                            int i56 = i55;
                            int i57 = 1509673;
                            while (true) {
                                i57 ^= 1509690;
                                switch (i57) {
                                    case 19:
                                        i57 = i56 < iM177 ? 1510417 : 1510386;
                                        break;
                                    case 712:
                                        obj6 = null;
                                        break;
                                    case 745:
                                        break;
                                    case 1323:
                                        Object objM6107 = C0315.m6101(list, i56);
                                        boolean zM43915 = C0228.m4399(C0123.m2381((r1.p) objM6107), C0230.m4437(m6436(), 268, C0456.f727 ^ 710, 2375));
                                        int i58 = 1510448;
                                        while (true) {
                                            i58 ^= 1510465;
                                            switch (i58) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 47:
                                                    i55 = (C0317.f465 ^ 340) + i56;
                                                    int i59 = 1511347;
                                                    while (true) {
                                                        i59 ^= 1511364;
                                                        switch (i59) {
                                                            case 22:
                                                                break;
                                                            case 119:
                                                                i59 = 1511378;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 113:
                                                    i58 = zM43915 ? 1510541 : 1510510;
                                                    break;
                                                case 204:
                                                    int i60 = 1510572;
                                                    while (true) {
                                                        i60 ^= 1510589;
                                                        switch (i60) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i60 = 1510603;
                                                                continue;
                                                            case 118:
                                                                obj6 = objM6107;
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
                        }
                        r1.p pVar6 = (r1.p) obj6;
                        int i61 = 1511471;
                        while (true) {
                            i61 ^= 1511488;
                            switch (i61) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    iM85110 = 0;
                                    break;
                                case 111:
                                    if (pVar6 != null) {
                                        i61 = 1511564;
                                    }
                                    break;
                                case 204:
                                    iM85110 = C0435.m8515((Number) C0364.m7154(l0Var, pVar6, C0057.m1083(i10)));
                                    break;
                                default:
                                    continue;
                            }
                            i61 = 1511533;
                        }
                        return C0231.m4447(iM8517, iM8516, iM8518, iM8519, iM85111, iM8515, iM85110, C0202.m3871(this), C0018.m361(), C0485.m9452(c1Var), C0115.m2223(this));
                    default:
                        break;
                }
            }
            i11 = (C0112.f138 ^ 569) + i12;
            int i62 = 1511595;
            while (true) {
                i62 ^= 1511612;
                switch (i62) {
                    case 23:
                        i62 = 1512277;
                        break;
                    case 1001:
                        break;
                }
            }
        }
    }
}
