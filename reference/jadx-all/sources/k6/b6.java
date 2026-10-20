package k6;

import android.os.Bundle;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0198;
import dagger.hilt.android.components.C0228;
import m4.C0354;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b6 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f526short = {1441, 1468, 1464, 1456, 1418, 1441, 1466, 1418, 1465, 1468, 1443, 1456, 1808, 1814, 1805, 1795, 1795, 1793, 1814, 1851, 1808, 1805, 1801, 1793, 1803, 1809, 1808, 1293, 1291, 1296, 1310, 1310, 1308, 1291, 1318, 1308, 1295, 1308, 1303, 1293, 1318, 1303, 1304, 1300, 1308, 1489, 1472, 1495, 1491, 1478, 1499, 1501, 1500, 1517, 1478, 1499, 1503, 1495, 1473, 1478, 1491, 1503, 1474, 1903, 1906, 1914, 1891, 1912, 1903, 1902, 1877, 1903, 1916, 1903, 1892, 1918, 1877, 1914, 1899, 1912, 1899, 1895, 1913, 1943, 1930, 1922, 1947, 1920, 1943, 1942, 1965, 1943, 1924, 1943, 1948, 1926, 1965, 1948, 1939, 1951, 1943, 1124, 1131, 1127, 1135, 1630, 1615, 1615, 1632, 1622, 1627, 844, 849, 842, 836, 842, 845, 1512, 1535, 1522, 1515, 1531, 1776, 1756, 1757, 1751, 1754, 1735, 1754, 1756, 1757, 1746, 1759, 1683, 1731, 1729, 1756, 1731, 1750, 1729, 1735, 1738, 1683, 1757, 1756, 1735, 1683, 1728, 1750, 1735, 1683, 1728, 1754, 1757, 1744, 1750, 1683, 1746, 1731, 1731, 1683, 1758, 1750, 1746, 1728, 1734, 1729, 1750, 1758, 1750, 1757, 1735, 1683, 1754, 1728, 1683, 1751, 1754, 1728, 1746, 1745, 1759, 1750, 1751, 1111, 1105, 1098, 1092, 1092, 1094, 1105, 1094, 1095, 1148, 1111, 1098, 1102, 1094, 1104, 1111, 1090, 1102, 1107, 2890, 2892, 2903, 2905, 2905, 2907, 2892, 2907, 2906, 2913, 2907, 2888, 2907, 2896, 2890, 2913, 2896, 2911, 2899, 2907, 2104, 2110, 2085, 2091, 2091, 2089, 2110, 2089, 2088, 2067, 2089, 2106, 2089, 2082, 2104, 2067, 2108, 2093, 2110, 2093, 2081, 2111, 849, 844, 840, 832, 833, 890, 842, 848, 849, 890, 832, 851, 832, 843, 849, 890, 843, 836, 840, 832, 2360, 2341, 2337, 2345, 2344, 2323, 2339, 2361, 2360, 2323, 2345, 2362, 2345, 2338, 2360, 2323, 2364, 2349, 2366, 2349, 2337, 2367, 2261, 2297, 2296, 2290, 2303, 2274, 2303, 2297, 2296, 2295, 2298, 2230, 2278, 2276, 2297, 2278, 2291, 2276, 2274, 2287, 2230, 2296, 2297, 2274, 2230, 2293, 2298, 2291, 2295, 2276, 2291, 2290, 2230, 2277, 2303, 2296, 2293, 2291, 2230, 2295, 2278, 2278, 2230, 2299, 2291, 2295, 2277, 2275, 2276, 2291, 2299, 2291, 2296, 2274, 2230, 2303, 2277, 2230, 2290, 2303, 2277, 2295, 2292, 2298, 2291, 2290, 1204, 1206, 1185, 1212, 1187, 1200, 1728, 1767, 1791, 1768, 1765, 1760, 1773, 1705, 1773, 1772, 1775, 1768, 1788, 1765, 1789, 1705, 1772, 1791, 1772, 1767, 1789, 1705, 1785, 1768, 1787, 1768, 1764, 1772, 1789, 1772, 1787, 1705, 1789, 1776, 1785, 1772, 1703, 1705, 1735, 1768, 1764, 1772, 1701, 1705, 1791, 1768, 1765, 1788, 1772, 2026, 1997, 2005, 1986, 1999, 1994, 1991, 1923, 1991, 1990, 1989, 1986, 2006, 1999, 2007, 1923, 1990, 2005, 1990, 1997, 2007, 1923, 2003, 1986, 2001, 1986, 1998, 1990, 2007, 1990, 2001, 1923, 1997, 1986, 1998, 1990, 1933, 1923, 2029, 1986, 1998, 1990, 966, 983, 964, 983, 987, 1757, 1766, 1766, 1705, 1764, 1768, 1767, 1776, 1705, 1773, 1772, 1775, 1768, 1788, 1765, 1789, 1705, 1772, 1791, 1772, 1767, 1789, 1705, 1785, 1768, 1787, 1768, 1764, 1772, 1789, 1772, 1787, 1786, 1705, 1786, 1772, 1789, 1703, 1705, 1741, 1760, 1786, 1770, 1768, 1787, 1773, 1760, 1767, 1774, 1705, 1771, 1772, 1776, 1766, 1767, 1773, 1705, 1772, 1791, 1772, 1767, 1789, 1705, 1785, 1768, 1787, 1768, 1764, 1772, 1789, 1772, 1787, 1705, 1765, 1760, 1764, 1760, 1789};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f9916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y5 f9917c;

    public /* synthetic */ b6(y5 y5Var, Bundle bundle, int i10) {
        this.f9915a = i10;
        this.f9917c = y5Var;
        this.f9916b = bundle;
        int iM3800 = C0198.m3800();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3800 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0354.m6915("xaJMDOuJgr0CTcLqkT96cK9")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۠ۦۣۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6538() {
        int iM4380 = C0228.m4380();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4380 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f526short;
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

    /* JADX WARN: Code duplicated, block: B:275:0x0484 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x045a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x04ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x04ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x0499 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x036b A[EDGE_INSN: B:281:0x036b->B:280:0x036b BREAK  A[LOOP:20: B:105:0x0448->B:364:0x0448], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x036b A[EDGE_INSN: B:282:0x036b->B:280:0x036b BREAK  A[LOOP:20: B:105:0x0448->B:364:0x0448], EDGE_INSN: B:137:0x04fc->B:282:0x036b BREAK  A[LOOP:23: B:136:0x04f8->B:385:0x04f8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x036b A[EDGE_INSN: B:283:0x036b->B:280:0x036b BREAK  A[LOOP:20: B:105:0x0448->B:364:0x0448], EDGE_INSN: B:125:0x04a3->B:283:0x036b BREAK  A[LOOP:24: B:124:0x049f->B:389:0x049f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x036b A[EDGE_INSN: B:284:0x036b->B:280:0x036b BREAK  A[LOOP:20: B:105:0x0448->B:364:0x0448], EDGE_INSN: B:113:0x047c->B:284:0x036b BREAK  A[LOOP:25: B:112:0x0478->B:393:0x0478], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x0450 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x0454 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x0456 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x0450 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x0448 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x048f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x0487 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x04e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x04ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x04ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x04e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x04dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x0500 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x04f8 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x04a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x049f A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x0480 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x0478 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x036b, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x057b, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:169:0x0586. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x037a. Please report as an issue. */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 2024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.b6.run():void");
    }
}
