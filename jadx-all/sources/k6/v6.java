package k6;

import androidx.compose.ui.draw.C0027;
import c3.C0063;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.emulators.C0141;
import com.google.firebase.remoteconfig.internal.Code;
import k.C0332;
import v7.C0449;

/* JADX INFO: loaded from: classes.dex */
public final class v6 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f595short = {2289, 2261, 2294, 2250, 2250, 2254, 2301, 2258, 2263, 2267, 2256, 2250, 2282, 2252, 2271, 2256, 2253, 2254, 2257, 2252, 2250, 719, 740, 750, 682, 741, 748, 682, 761, 766, 760, 751, 747, 743, 682, 741, 760, 682, 707, 709, 719, 754, 745, 751, 762, 766, 739, 741, 740, 770, 831, 804, 802, 823, 819, 814, 808, 809, 871, 804, 811, 808, 820, 814, 809, 800, 871, 801, 821, 806, 810, 802, 871, 821, 802, 806, 803, 802, 821, 1711, 1720, 1720, 1701, 1720, 1770, 1699, 1700, 1770, 1708, 1720, 1707, 1703, 1711, 1770, 1698, 1707, 1700, 1710, 1702, 1711, 1720, 1642, 1623, 1612, 1610, 1631, 1627, 1606, 1600, 1601, 1551, 1612, 1603, 1600, 1628, 1606, 1601, 1608, 1551, 1609, 1629, 1614, 1602, 1610, 1551, 1629, 1610, 1614, 1611, 1610, 1629, 1223, 1274, 1249, 1255, 1266, 1270, 1259, 1261, 1260, 1186, 1249, 1262, 1261, 1265, 1259, 1260, 1253, 1186, 1252, 1264, 1251, 1263, 1255, 1186, 1264, 1255, 1251, 1254, 1255, 1264, 2280, 2245, 2271, 2255, 2253, 2270, 2248, 2245, 2242, 2251, 2188, 2248, 2253, 2264, 2253, 2178, 2188, 2282, 2253, 2245, 2240, 2249, 2248, 2188, 2264, 2243, 2188, 2271, 2249, 2264, 2188, 2265, 2271, 2249, 2270, 2188, 2268, 2270, 2243, 2268, 2249, 2270, 2264, 2261};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10444e;

    public v6(h8.n nVar, j8.i iVar) {
        this.f10440a = 1;
        this.f10444e = nVar;
        this.f10442c = new v6.d(C0449.m8751());
        this.f10441b = true;
        this.f10443d = iVar;
        int iM6408 = C0332.m6408();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6408 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0063.m1223("6zcuPwVgWVJeP0zfm4hqJwSm")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public v6(s6 s6Var, x7 x7Var, boolean z10, t7 t7Var) {
        this.f10440a = 0;
        this.f10444e = s6Var;
        this.f10442c = x7Var;
        this.f10441b = z10;
        this.f10443d = t7Var;
        int iM2714 = C0141.m2714();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2714 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0124.m2397("IOUba7cP1oq7sBV8N6clWN")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۤۦۣۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6605() {
        int iM541 = C0027.m541();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM541 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f595short;
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

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0025, code lost:
    
        continue;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.v6.run():void");
    }
}
