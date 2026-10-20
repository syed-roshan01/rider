package k6;

import a8.C0009;
import a8.C0010;
import android.os.Bundle;
import androidx.annotation.C0018;
import androidx.compose.ui.draw.C0029;
import androidx.core.app.C0040;
import androidx.core.content.C0041;
import androidx.versionedparcelable.C0048;
import b.C0049;
import b7.C0053;
import b8.C0055;
import c1.C0058;
import c1.C0060;
import c1.C0061;
import c6.C0067;
import com.auto.accept.data.model.C0071;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.ktx.C0179;
import com.google.firebase.measurement.C0183;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0198;
import com.google.firebase.remoteconfiginterop.C0202;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.migration.C0239;
import dagger.hilt.codegen.C0241;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import dagger.hilt.internal.definecomponent.C0249;
import e2.C0262;
import e7.C0264;
import e8.C0265;
import ea.C0268;
import f.C0270;
import f0.C0271;
import f0.C0272;
import f1.C0273;
import fa.C0281;
import g3.C0288;
import g5.C0291;
import h4.C0305;
import h5.C0306;
import h6.C0309;
import i.C0315;
import j4.C0326;
import j6.C0328;
import java.util.Iterator;
import java.util.TreeSet;
import k3.C0335;
import k8.C0338;
import l0.C0340;
import m4.C0353;
import m5.C0354;
import o2.C0368;
import p0.C0374;
import q0.C0381;
import q0.C0382;
import q7.C0389;
import r1.C0393;
import s0.C0410;
import s6.C0413;
import t1.C0419;
import t2.C0421;
import u.C0429;
import u0.C0430;
import u1.C0432;
import v.C0439;
import v8.C0450;
import w2.C0458;
import w4.C0459;
import x7.C0471;
import z.C0480;
import z3.C0487;
import z7.C0488;
import z8.C0491;
import z8.C0492;

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
                    System.out.println(Long.valueOf(C0353.m6915("xaJMDOuJgr0CTcLqkT96cK9")));
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
        int iM4380 = C0227.m4380();
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
    */
    public final void run() {
        boolean zM9580;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean zM5900;
        int i14;
        int i15;
        int i16;
        Bundle bundleM5171 = C0270.m5171(this);
        y5 y5VarM2312 = C0120.m2312(this);
        int iM3413 = C0179.m3413(this);
        String strM3395 = C0178.m3395(m6538(), 0, C0432.f703 ^ 513, 1493);
        String strM9565 = C0491.m9565(m6538(), 12, C0109.f135 ^ 76, 1892);
        String strM3867 = C0202.m3867(m6538(), 27, C0130.f156 ^ (-43), 1401);
        String strM5607 = C0291.m5607(m6538(), 45, C0183.f207 ^ (-870), 1458);
        String strM2375 = C0123.m2375(m6538(), 63, C0241.f321 ^ (-818), 1802);
        String strM1102 = C0058.m1102(m6538(), 83, C0131.f157 ^ (-891), 2034);
        String strM1023 = C0053.m1023(m6538(), 101, C0083.f117 ^ (-781), 1034);
        String strM7631 = C0389.m7631(m6538(), 105, C0335.f519 ^ 319, 1599);
        switch (iM3413) {
            case 0:
                int i17 = 49666;
                while (true) {
                    i17 ^= 49683;
                    switch (i17) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (bundleM5171 == null) {
                                i17 = 49759;
                            }
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 76:
                            C0315.m6100(C0109.m2117(C0338.m6640(y5VarM2312)), new Bundle());
                            int i18 = 49790;
                            while (true) {
                                i18 ^= 49807;
                                switch (i18) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 241:
                                        i18 = 49821;
                                        break;
                                }
                            }
                            break;
                        case 83:
                            Bundle bundleM1313 = C0067.m1313(C0109.m2117(C0338.m6640(y5VarM2312)));
                            Iterator itM5256 = C0272.m5256(C0060.m1152(bundleM5171));
                            while (true) {
                                boolean zM3327 = C0174.m3327(itM5256);
                                w4 w4VarM5227 = C0271.m5227(y5VarM2312);
                                int i19 = 49914;
                                while (true) {
                                    i19 ^= 49931;
                                    switch (i19) {
                                        case 497:
                                            i19 = zM3327 ? 50658 : 50627;
                                            break;
                                        case 1711:
                                            break;
                                        case 1736:
                                            break;
                                        case 1769:
                                            break;
                                        default:
                                            break;
                                    }
                                    C0354.m6951(y5VarM2312);
                                    boolean zM2887 = C0150.m2887(C0354.m6951(C0091.m1951(y5VarM2312)), 201500568 ^ C0459.f730);
                                    int i20 = 55432;
                                    while (true) {
                                        i20 ^= 55449;
                                        switch (i20) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i20 = zM2887 ? 55525 : 55494;
                                                break;
                                            case 62:
                                                break;
                                            case 95:
                                                i16 = 25;
                                                break;
                                            case 124:
                                                int i21 = 55556;
                                                while (true) {
                                                    i21 ^= 55573;
                                                    switch (i21) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i21 = 55587;
                                                            continue;
                                                        case 54:
                                                            i16 = 100;
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
                                    int iM9350 = C0480.m9350(bundleM1313);
                                    int i22 = 55680;
                                    while (true) {
                                        i22 ^= 55697;
                                        switch (i22) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i22 = iM9350 <= i16 ? 56424 : 56393;
                                                break;
                                            case 1467:
                                                break;
                                            case 1496:
                                                Iterator itM9493 = C0487.m9493(new TreeSet(C0060.m1152(bundleM1313)));
                                                int i23 = 0;
                                                while (true) {
                                                    boolean zM3328 = C0174.m3327(itM9493);
                                                    int i24 = 56579;
                                                    while (true) {
                                                        i24 ^= 56596;
                                                        switch (i24) {
                                                            case 23:
                                                                i24 = zM3328 ? 1507472 : 56641;
                                                                break;
                                                            case 54:
                                                                break;
                                                            case 85:
                                                                break;
                                                            case 1564036:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                        C0354.m6951(y5VarM2312);
                                                        C0058.m1107(w4VarM5227, null, 26, null, null, 0);
                                                        C0135.m2604(C0471.m9169(C0029.m572(y5VarM2312)), C0249.m4771(m6538(), 455, C0119.f145 ^ 975, 1673));
                                                        break;
                                                    }
                                                    String str = (String) C0413.m8115(itM9493);
                                                    i23 += C0381.f652 ^ (-19);
                                                    int i25 = 1507503;
                                                    while (true) {
                                                        i25 ^= 1507520;
                                                        switch (i25) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                break;
                                                            case 111:
                                                                i25 = i23 > i16 ? 1507596 : 1507565;
                                                                break;
                                                            case 460:
                                                                C0055.m1069(bundleM1313, str);
                                                                int i26 = 1507627;
                                                                while (true) {
                                                                    i26 ^= 1507644;
                                                                    switch (i26) {
                                                                        case 23:
                                                                            i26 = 1507658;
                                                                            break;
                                                                        case 118:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                }
                                                break;
                                            case 1529:
                                                int i27 = 56455;
                                                while (true) {
                                                    i27 ^= 56472;
                                                    switch (i27) {
                                                        case 31:
                                                            i27 = 56486;
                                                            continue;
                                                        case 62:
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
                                    C0315.m6100(C0109.m2117(C0338.m6640(y5VarM2312)), bundleM1313);
                                    s6 s6VarM7706 = C0393.m7706(y5VarM2312);
                                    C0040.m791(s6VarM7706);
                                    C0458.m8937(s6VarM7706);
                                    C0309.m5979(s6VarM7706, new y2.a((Object) s6VarM7706, (Object) C0061.m1159(s6VarM7706, false), (Object) bundleM1313, C0071.f98 ^ (-543)));
                                    break;
                                }
                                String str2 = (String) C0413.m8115(itM5256);
                                Object objM195 = C0010.m195(bundleM5171, str2);
                                int i28 = 50689;
                                while (true) {
                                    i28 ^= 50706;
                                    switch (i28) {
                                        case 19:
                                            i28 = objM195 != null ? 50782 : 50751;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            zM9580 = C0492.m9580(str2);
                                            i10 = 52735;
                                            while (true) {
                                                i10 ^= 52752;
                                                switch (i10) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        i12 = 53634;
                                                        while (true) {
                                                            i12 ^= 53651;
                                                            switch (i12) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i12 = objM195 == null ? 53727 : 53696;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    C0055.m1069(bundleM1313, str2);
                                                                    i13 = 53758;
                                                                    while (true) {
                                                                        i13 ^= 53775;
                                                                        switch (i13) {
                                                                            case 1009:
                                                                                i13 = 54440;
                                                                                break;
                                                                            case 1703:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 83:
                                                                    zM5900 = C0305.m5900(C0354.m6951(y5VarM2312), C0265.m5070(m6538(), 450, C0132.f158 ^ (-212), 950), str2, C0410.m8054(C0091.m1951(y5VarM2312), C0264.m5048(C0306.m5917((f5) C0163.m3121(y5VarM2312)))), objM195);
                                                                    i14 = 54533;
                                                                    while (true) {
                                                                        i14 ^= 54550;
                                                                        switch (i14) {
                                                                            case 19:
                                                                                i14 = zM5900 ? 54626 : 54595;
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 85:
                                                                                break;
                                                                            case 116:
                                                                                C0488.m9513(C0354.m6951(y5VarM2312), bundleM1313, str2, objM195);
                                                                                i15 = 54657;
                                                                                while (true) {
                                                                                    i15 ^= 54674;
                                                                                    switch (i15) {
                                                                                        case 19:
                                                                                            i15 = 54688;
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                                        break;
                                                    case 1007:
                                                        i10 = zM9580 ? 53479 : 52797;
                                                        break;
                                                    case 7927:
                                                        C0419.m8245(C0471.m9169(C0029.m572(y5VarM2312)), C0241.m4619(m6538(), 408, C0265.f345 ^ 948, 1955), str2);
                                                        i11 = 53510;
                                                        while (true) {
                                                            i11 ^= 53527;
                                                            switch (i11) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i11 = 53541;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            boolean z10 = objM195 instanceof String;
                                            int i29 = 50813;
                                            while (true) {
                                                i29 ^= 50830;
                                                switch (i29) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 53:
                                                        zM9580 = C0492.m9580(str2);
                                                        i10 = 52735;
                                                        while (true) {
                                                            i10 ^= 52752;
                                                            switch (i10) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    i12 = 53634;
                                                                    while (true) {
                                                                        i12 ^= 53651;
                                                                        switch (i12) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (objM195 == null) {
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 76:
                                                                                C0055.m1069(bundleM1313, str2);
                                                                                i13 = 53758;
                                                                                while (true) {
                                                                                    i13 ^= 53775;
                                                                                    switch (i13) {
                                                                                        case 1009:
                                                                                            i13 = 54440;
                                                                                            break;
                                                                                        case 1703:
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 83:
                                                                                zM5900 = C0305.m5900(C0354.m6951(y5VarM2312), C0265.m5070(m6538(), 450, C0132.f158 ^ (-212), 950), str2, C0410.m8054(C0091.m1951(y5VarM2312), C0264.m5048(C0306.m5917((f5) C0163.m3121(y5VarM2312)))), objM195);
                                                                                i14 = 54533;
                                                                                while (true) {
                                                                                    i14 ^= 54550;
                                                                                    switch (i14) {
                                                                                        case 19:
                                                                                            if (zM5900) {
                                                                                            }
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            break;
                                                                                        case 85:
                                                                                            break;
                                                                                            break;
                                                                                        case 116:
                                                                                            C0488.m9513(C0354.m6951(y5VarM2312), bundleM1313, str2, objM195);
                                                                                            i15 = 54657;
                                                                                            while (true) {
                                                                                                i15 ^= 54674;
                                                                                                switch (i15) {
                                                                                                    case 19:
                                                                                                        i15 = 54688;
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
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
                                                                    break;
                                                                case 1007:
                                                                    if (zM9580) {
                                                                    }
                                                                    break;
                                                                case 7927:
                                                                    C0419.m8245(C0471.m9169(C0029.m572(y5VarM2312)), C0241.m4619(m6538(), 408, C0265.f345 ^ 948, 1955), str2);
                                                                    i11 = 53510;
                                                                    while (true) {
                                                                        i11 ^= 53527;
                                                                        switch (i11) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i11 = 53541;
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 243:
                                                        i29 = !z10 ? 51557 : 50875;
                                                        break;
                                                    case 4075:
                                                        boolean z11 = objM195 instanceof Long;
                                                        int i30 = 51588;
                                                        while (true) {
                                                            i30 ^= 51605;
                                                            switch (i30) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i30 = !z11 ? 51681 : 51650;
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 87:
                                                                    zM9580 = C0492.m9580(str2);
                                                                    i10 = 52735;
                                                                    while (true) {
                                                                        i10 ^= 52752;
                                                                        switch (i10) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                i12 = 53634;
                                                                                while (true) {
                                                                                    i12 ^= 53651;
                                                                                    switch (i12) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            if (objM195 == null) {
                                                                                            }
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            break;
                                                                                        case 76:
                                                                                            C0055.m1069(bundleM1313, str2);
                                                                                            i13 = 53758;
                                                                                            while (true) {
                                                                                                i13 ^= 53775;
                                                                                                switch (i13) {
                                                                                                    case 1009:
                                                                                                        i13 = 54440;
                                                                                                        break;
                                                                                                    case 1703:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 83:
                                                                                            zM5900 = C0305.m5900(C0354.m6951(y5VarM2312), C0265.m5070(m6538(), 450, C0132.f158 ^ (-212), 950), str2, C0410.m8054(C0091.m1951(y5VarM2312), C0264.m5048(C0306.m5917((f5) C0163.m3121(y5VarM2312)))), objM195);
                                                                                            i14 = 54533;
                                                                                            while (true) {
                                                                                                i14 ^= 54550;
                                                                                                switch (i14) {
                                                                                                    case 19:
                                                                                                        if (zM5900) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                        break;
                                                                                                    case 85:
                                                                                                        break;
                                                                                                        break;
                                                                                                    case 116:
                                                                                                        C0488.m9513(C0354.m6951(y5VarM2312), bundleM1313, str2, objM195);
                                                                                                        i15 = 54657;
                                                                                                        while (true) {
                                                                                                            i15 ^= 54674;
                                                                                                            switch (i15) {
                                                                                                                case 19:
                                                                                                                    i15 = 54688;
                                                                                                                    break;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
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
                                                                                break;
                                                                            case 1007:
                                                                                if (zM9580) {
                                                                                }
                                                                                break;
                                                                            case 7927:
                                                                                C0419.m8245(C0471.m9169(C0029.m572(y5VarM2312)), C0241.m4619(m6538(), 408, C0265.f345 ^ 948, 1955), str2);
                                                                                i11 = 53510;
                                                                                while (true) {
                                                                                    i11 ^= 53527;
                                                                                    switch (i11) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i11 = 53541;
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 116:
                                                                    boolean z12 = objM195 instanceof Double;
                                                                    int i31 = 51712;
                                                                    while (true) {
                                                                        i31 ^= 51729;
                                                                        switch (i31) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i31 = !z12 ? 51805 : 51774;
                                                                                break;
                                                                            case 47:
                                                                                zM9580 = C0492.m9580(str2);
                                                                                i10 = 52735;
                                                                                while (true) {
                                                                                    i10 ^= 52752;
                                                                                    switch (i10) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                            i12 = 53634;
                                                                                            while (true) {
                                                                                                i12 ^= 53651;
                                                                                                switch (i12) {
                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        if (objM195 == null) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                        break;
                                                                                                    case 76:
                                                                                                        C0055.m1069(bundleM1313, str2);
                                                                                                        i13 = 53758;
                                                                                                        while (true) {
                                                                                                            i13 ^= 53775;
                                                                                                            switch (i13) {
                                                                                                                case 1009:
                                                                                                                    i13 = 54440;
                                                                                                                    break;
                                                                                                                case 1703:
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    case 83:
                                                                                                        zM5900 = C0305.m5900(C0354.m6951(y5VarM2312), C0265.m5070(m6538(), 450, C0132.f158 ^ (-212), 950), str2, C0410.m8054(C0091.m1951(y5VarM2312), C0264.m5048(C0306.m5917((f5) C0163.m3121(y5VarM2312)))), objM195);
                                                                                                        i14 = 54533;
                                                                                                        while (true) {
                                                                                                            i14 ^= 54550;
                                                                                                            switch (i14) {
                                                                                                                case 19:
                                                                                                                    if (zM5900) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                    break;
                                                                                                                case 85:
                                                                                                                    break;
                                                                                                                    break;
                                                                                                                case 116:
                                                                                                                    C0488.m9513(C0354.m6951(y5VarM2312), bundleM1313, str2, objM195);
                                                                                                                    i15 = 54657;
                                                                                                                    while (true) {
                                                                                                                        i15 ^= 54674;
                                                                                                                        switch (i15) {
                                                                                                                            case 19:
                                                                                                                                i15 = 54688;
                                                                                                                                break;
                                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
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
                                                                                            break;
                                                                                        case 1007:
                                                                                            if (zM9580) {
                                                                                            }
                                                                                            break;
                                                                                        case 7927:
                                                                                            C0419.m8245(C0471.m9169(C0029.m572(y5VarM2312)), C0241.m4619(m6538(), 408, C0265.f345 ^ 948, 1955), str2);
                                                                                            i11 = 53510;
                                                                                            while (true) {
                                                                                                i11 ^= 53527;
                                                                                                switch (i11) {
                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        i11 = 53541;
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 76:
                                                                                C0354.m6951(y5VarM2312);
                                                                                boolean zM8786 = C0450.m8786(objM195);
                                                                                int i32 = 51836;
                                                                                while (true) {
                                                                                    i32 ^= 51853;
                                                                                    switch (i32) {
                                                                                        case 241:
                                                                                            i32 = zM8786 ? 52580 : 52549;
                                                                                            break;
                                                                                        case 1963:
                                                                                            break;
                                                                                        case 1992:
                                                                                            break;
                                                                                        case 2025:
                                                                                            C0354.m6951(y5VarM2312);
                                                                                            C0058.m1107(w4VarM5227, null, 27, null, null, 0);
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                C0112.m2169(C0471.m9169(C0029.m572(y5VarM2312)), C0487.m9485(m6538(), 359, C0138.f164 ^ (-517), 1673), str2, objM195);
                                                                                int i33 = 52611;
                                                                                while (true) {
                                                                                    i33 ^= 52628;
                                                                                    switch (i33) {
                                                                                        case 23:
                                                                                            i33 = 52642;
                                                                                            break;
                                                                                        case 54:
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
                            break;
                        default:
                            continue;
                    }
                    i17 = 49728;
                }
                break;
            case 1:
                C0040.m791(y5VarM2312);
                C0458.m8937(y5VarM2312);
                C0270.m5173(bundleM5171);
                String strM2549 = C0132.m2549(bundleM5171, strM1023);
                C0281.m5438(strM2549);
                boolean zM8273 = C0421.m8273((f5) C0163.m3121(y5VarM2312));
                int i34 = 1864;
                while (true) {
                    i34 ^= 1881;
                    switch (i34) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i34 = !zM8273 ? 48736 : 48705;
                            break;
                        case 47384:
                            t7 t7Var = new t7(strM2549, C0439.m8581(), ((long) C0326.f474) ^ (-792), null);
                            try {
                                u7 u7VarM6951 = C0354.m6951(y5VarM2312);
                                C0132.m2549(bundleM5171, strM7631);
                                C0430.m8434(C0393.m7706(y5VarM2312), new e(C0132.m2549(bundleM5171, strM7631), C0439.m8581(), t7Var, C0158.m3008(bundleM5171, strM5607), C0150.m2885(bundleM5171, C0450.m8781(m6538(), 353, C0048.f68 ^ (-743), 1237)), C0132.m2549(bundleM5171, strM3867), null, C0158.m3008(bundleM5171, strM9565), null, C0158.m3008(bundleM5171, strM3395), C0009.m183(u7VarM6951, C0132.m2549(bundleM5171, strM1102), C0245.m4704(bundleM5171, strM2375), C0439.m8581(), C0158.m3008(bundleM5171, strM5607), true)));
                                break;
                            } catch (IllegalArgumentException e4) {
                                int i35 = 1508526;
                                while (true) {
                                    i35 ^= 1508543;
                                    switch (i35) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i35 = 1508557;
                                            continue;
                                        case 114:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                            }
                            break;
                        case 47417:
                            C0135.m2604(C0136.m2634(C0029.m572(y5VarM2312)), C0382.m7492(m6538(), 287, C0175.f199 ^ 624, 2198));
                            int i36 = 48767;
                            while (true) {
                                i36 ^= 48784;
                                switch (i36) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case 239:
                                        i36 = 48798;
                                        continue;
                                    default:
                                        continue;
                                }
                            }
                            break;
                        case 47483:
                            break;
                        default:
                            break;
                    }
                }
                int iM5170 = C0270.m5170();
                int i37 = 48891;
                while (true) {
                    i37 ^= 48908;
                    switch (i37) {
                        case 22:
                            break;
                        case 53:
                            break;
                        case 503:
                            if (iM5170 >= 0) {
                                i37 = 49635;
                            }
                            break;
                        case 32495:
                            System.out.println(Double.parseDouble(C0328.m6339("bOI9")));
                            break;
                        default:
                            continue;
                    }
                    i37 = 48953;
                }
                break;
            default:
                C0040.m791(y5VarM2312);
                C0458.m8937(y5VarM2312);
                C0270.m5173(bundleM5171);
                String strM25410 = C0132.m2549(bundleM5171, strM1023);
                String strM25411 = C0132.m2549(bundleM5171, C0368.m7218(m6538(), 111, C0288.f433 ^ 753, 803));
                C0281.m5438(strM25410);
                C0281.m5438(strM25411);
                String strM5259 = C0273.m5259(m6538(), 117, C0122.f148 ^ (-51), 1438);
                C0270.m5173(C0010.m195(bundleM5171, strM5259));
                boolean zM8274 = C0421.m8273((f5) C0163.m3121(y5VarM2312));
                int i38 = 1616;
                while (true) {
                    i38 ^= 1633;
                    switch (i38) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (!zM8274) {
                                i38 = 1709;
                            }
                            break;
                        case 204:
                            C0135.m2604(C0136.m2634(C0029.m572(y5VarM2312)), C0076.m1657(m6538(), 122, C0239.f319 ^ 244, 1715));
                            int i39 = 1740;
                            while (true) {
                                i39 ^= 1757;
                                switch (i39) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i39 = 1771;
                                        break;
                                    case 54:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            t7 t7Var2 = new t7(strM25410, strM25411, C0158.m3008(bundleM5171, C0131.m2529(m6538(), 184, C0429.f700 ^ 347, 1059)), C0010.m195(bundleM5171, strM5259));
                            try {
                                u7 u7VarM6952 = C0354.m6951(y5VarM2312);
                                C0132.m2549(bundleM5171, strM7631);
                                v vVarM183 = C0009.m183(u7VarM6952, C0132.m2549(bundleM5171, C0018.m360(m6538(), 203, C0335.f519 ^ 301, 2878)), C0245.m4704(bundleM5171, C0136.m2617(m6538(), 223, C0049.f69 ^ 313, 2124)), strM25411, (-262) ^ ((long) C0340.f611), true);
                                u7 u7VarM6953 = C0354.m6951(y5VarM2312);
                                C0132.m2549(bundleM5171, strM7631);
                                v vVarM184 = C0009.m183(u7VarM6953, C0132.m2549(bundleM5171, C0268.m5114(m6538(), 245, C0262.f342 ^ 169, 805)), C0245.m4704(bundleM5171, C0488.m9522(m6538(), 265, C0270.f350 ^ (-720), 2380)), strM25411, (-322) ^ ((long) C0041.f61), true);
                                u7 u7VarM6954 = C0354.m6951(y5VarM2312);
                                C0132.m2549(bundleM5171, strM7631);
                                C0430.m8434(C0393.m7706(y5VarM2312), new e(C0132.m2549(bundleM5171, strM7631), strM25411, t7Var2, C0158.m3008(bundleM5171, strM5607), false, C0132.m2549(bundleM5171, strM3867), vVarM184, C0158.m3008(bundleM5171, strM9565), vVarM183, C0158.m3008(bundleM5171, strM3395), C0009.m183(u7VarM6954, C0132.m2549(bundleM5171, strM1102), C0245.m4704(bundleM5171, strM2375), strM25411, (-778) ^ ((long) C0374.f645), true)));
                                break;
                            } catch (IllegalArgumentException e10) {
                                int i40 = 1507751;
                                while (true) {
                                    i40 ^= 1507768;
                                    switch (i40) {
                                        case 31:
                                            i40 = 1508433;
                                            break;
                                        case 1513:
                                            return;
                                    }
                                }
                            }
                            break;
                        default:
                            continue;
                    }
                    i38 = 1678;
                }
                break;
        }
    }
}
