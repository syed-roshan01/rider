package k6;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v4.graphics.drawable.C0016;
import android.util.Pair;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.draw.C0028;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.platform.C0038;
import androidx.core.content.C0041;
import androidx.preference.C0044;
import b1.C0050;
import c0.C0057;
import c7.C0068;
import com.auto.accept.service.C0072;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.measurement.internal.C0104;
import com.google.android.play.core.integrity.client.C0107;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.C0128;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.ktx.C0179;
import com.google.firebase.measurement.C0183;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0203;
import com.google.firebase.tracing.C0204;
import d3.C0217;
import d4.C0218;
import d9.C0224;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.lifecycle.C0238;
import dagger.hilt.internal.componenttreedeps.C0249;
import dagger.hilt.internal.generatesrootinput.C0251;
import e2.C0261;
import e2.C0264;
import ea.C0268;
import f.C0271;
import g0.C0286;
import g2.C0288;
import g4.C0290;
import h3.C0303;
import h7.C0312;
import h8.C0314;
import i4.C0318;
import j2.C0325;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k3.C0336;
import m1.C0351;
import m7.C0357;
import m7.C0358;
import o8.C0372;
import q6.C0387;
import q6.C0388;
import r.C0393;
import r1.C0394;
import rikka.shizuku.C0407;
import s6.C0414;
import s8.C0417;
import t0.C0419;
import t1.C0420;
import t2.C0423;
import u.C0430;
import u1.C0432;
import u7.C0438;
import u8.C0439;
import v.C0440;
import v5.C0445;
import w0.C0455;
import w4.C0461;
import x7.C0473;
import z3.C0487;
import z7.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class c8 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f532short = {1206, 1164, 1152, 1165, 416, 410, 399, 2544, 2506, 2497, 1955, 1950, 1938, 1940, 1927, 1990, 1942, 1927, 1940, 1927, 1931, 1923, 1938, 1923, 1940, 1990, 1937, 1935, 1938, 1934, 1929, 1939, 1938, 1990, 1927, 1928, 1990, 1923, 1936, 1923, 1928, 1938, 1990, 1928, 1927, 1931, 1923, 1992, 1990, 1923, 1936, 1923, 1928, 1938, 1967, 1922, 933, 947, 954, 947, 949, 930, 1014, 955, 951, 959, 952, 905, 947, 928, 947, 952, 930, 1018, 1014, 949, 958, 959, 954, 946, 932, 947, 952, 905, 930, 953, 905, 934, 932, 953, 949, 947, 933, 933, 1014, 944, 932, 953, 955, 1014, 955, 951, 959, 952, 905, 947, 928, 947, 952, 930, 905, 934, 951, 932, 951, 955, 933, 1014, 929, 958, 947, 932, 947, 1014, 951, 934, 934, 905, 959, 946, 1003, 1001, 1014, 951, 952, 946, 1014, 947, 928, 947, 952, 930, 905, 959, 946, 1003, 1001, 2295, 2267, 2259, 2260, 2202, 2271, 2252, 2271, 2260, 2254, 2202, 2260, 2261, 2254, 2202, 2268, 2261, 2255, 2260, 2270, 2528, 2503, 2511, 2506, 2499, 2498, 2438, 2514, 2505, 2438, 2507, 2499, 2516, 2497, 2499, 2438, 2507, 2503, 2511, 2504, 2438, 2499, 2512, 2499, 2504, 2514, 2440, 2438, 2503, 2518, 2518, 2543, 2498, 2442, 2438, 2499, 2512, 2499, 2504, 2514, 2543, 2498, 1605, 1650, 1650, 1647, 1650, 1568, 1651, 1637, 1644, 1637, 1635, 1652, 1641, 1646, 1639, 1568, 1645, 1633, 1641, 1646, 1568, 1637, 1654, 1637, 1646, 1652, 2011, 2036, 2045, 2041, 2026, 2033, 2038, 2047, 1976, 2043, 2039, 2037, 2024, 2036, 2045, 2016, 1976, 2037, 2041, 2033, 2038, 1976, 2045, 2030, 2045, 2038, 2028, 1976, 2033, 2038, 2046, 2039, 1974, 1976, 2041, 2024, 2024, 2001, 2044, 1711, 1710, 1703, 1710, 1727, 1710, 1771, 1709, 1721, 1700, 1702, 1771, 1702, 1706, 1698, 1701, 1684, 1710, 1725, 1710, 1701, 1727, 1684, 1723, 1706, 1721, 1706, 1702, 1720, 1771, 1724, 1699, 1710, 1721, 1710, 1771, 1706, 1723, 1723, 1684, 1698, 1711, 1782, 1780, 1657, 1614, 1614, 1619, 1614, 1564, 1631, 1616, 1625, 1629, 1614, 1621, 1618, 1627, 1564, 1631, 1619, 1617, 1612, 1616, 1625, 1604, 1564, 1617, 1629, 1621, 1618, 1564, 1625, 1610, 1625, 1618, 1608, 3020, 3053, 2978, 3063, 3052, 3051, 3059, 3063, 3047, 2978, 3058, 3043, 3056, 3043, 3055, 3047, 3062, 3047, 3056, 3057, 2978, 3051, 3052, 2978, 3055, 3043, 3051, 3052, 2978, 3047, 3060, 3047, 3052, 3062, 2988, 2978, 3047, 3060, 3047, 3052, 3062, 3020, 3043, 3055, 3047, 1976, 1925, 1929, 1935, 1948, 2013, 1933, 1948, 1935, 1948, 1936, 1944, 1929, 1944, 1935, 2013, 1930, 1940, 1929, 1941, 1938, 1928, 1929, 2013, 1944, 1925, 1940, 1934, 1929, 1940, 1939, 1946, 2013, 1936, 1948, 1940, 1939, 2013, 1944, 1931, 1944, 1939, 1929, 2003, 2013, 1944, 1931, 1944, 1939, 1929, 1971, 1948, 1936, 1944, 2001, 2013, 1944, 1931, 1944, 1939, 1929, 1972, 1945, 560, 522, 543, 524, 1526, 1498, 1496, 1477, 1497, 1488, 1485, 1429, 1488, 1475, 1488, 1499, 1473, 1429, 1474, 1500, 1473, 1501, 1429, 1487, 1488, 1479, 1498, 1429, 1488, 1485, 1473, 1479, 1492, 1429, 1477, 1492, 1479, 1492, 1496, 1429, 1494, 1498, 1472, 1499, 1473, 1435, 1429, 1488, 1475, 1488, 1499, 1473, 1531, 1492, 1496, 1488};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzfi.zze f9947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f9948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z7 f9950d;

    public c8(z7 z7Var) {
        this.f9950d = z7Var;
        int iM3323 = C0174.m3323();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3323 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0112.m2170("9sy6U01fl4Kka3MuBCDjep7X2m14")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6544() {
        int iM7977 = C0407.m7977();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7977 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f532short;
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

    /* JADX WARN: Code duplicated, block: B:338:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x0487 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x0487 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x031a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x031e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x039c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x031a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x036d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x03ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x03ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x03be A[EDGE_INSN: B:397:0x03be->B:396:0x03be BREAK  A[LOOP:20: B:184:0x03ed->B:432:0x03ed], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x03be A[EDGE_INSN: B:398:0x03be->B:396:0x03be BREAK  A[LOOP:20: B:184:0x03ed->B:432:0x03ed], EDGE_INSN: B:192:0x0409->B:398:0x03be BREAK  A[LOOP:21: B:191:0x0405->B:437:0x0405], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x03cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x03cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x03c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x0420 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x0426 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x042a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x045b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x0426 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x0422 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x0418 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x0439 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x043d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x0431 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x0481 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x0485 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x0479 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x03fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:0x03fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x03f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x03ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x040d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x0405 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x04a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x04aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x04ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x04a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:178:0x03c9. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.google.android.gms.internal.measurement.zzfi$zze] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v80, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r4v81 */
    public final zzfi.zze a(zzfi.zze zzeVar, String str) throws Throwable {
        boolean z10;
        String str2;
        long jM747;
        int i10;
        ArrayList arrayList;
        Iterator itM2089;
        boolean zM3327;
        int i11;
        zzfi.zzg zzgVar;
        zzfi.zzg zzgVarM7590;
        int i12;
        int i13;
        boolean zM3889;
        int i14;
        int i15;
        List list;
        int i16;
        k kVarM1924;
        int i17;
        k kVarM1925;
        ?? r10;
        Cursor cursorM3501;
        int i18;
        Pair pair;
        int i19;
        Object objM1560;
        int i20;
        int i21;
        int i22;
        boolean zM6068;
        int i23;
        Pair pairM9544;
        int i24;
        String strM2037 = C0104.m2037(zzeVar);
        List listM2528 = C0131.m2528(zzeVar);
        z7 z7VarM3903 = C0204.m3903(this);
        C0041.m810(z7VarM3903);
        String strM1741 = C0081.m1741(m6544(), 0, C0268.f347 ^ (-335), 1257);
        Long l10 = (Long) C0312.m6022(zzeVar, strM1741);
        int i25 = 1616;
        while (true) {
            i25 ^= 1633;
            switch (i25) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i25 = l10 != null ? 1709 : 1678;
                    break;
                case 204:
                    z10 = true;
                    int i26 = 1740;
                    while (true) {
                        i26 ^= 1757;
                        switch (i26) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i26 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    z10 = false;
                    break;
                default:
                    break;
            }
        }
        int i27 = 1864;
        while (true) {
            i27 ^= 1881;
            switch (i27) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i27 = z10 ? 48736 : 48705;
                    break;
                case 47384:
                    break;
                case 47417:
                    boolean zM321 = C0016.m321(strM2037, C0286.m5503(m6544(), 4, C0487.f760 ^ 231, 511));
                    int i28 = 48767;
                    while (true) {
                        i28 ^= 48784;
                        switch (i28) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case 76:
                                C0271.m5173(l10);
                                C0041.m810(z7VarM3903);
                                String str3 = (String) C0312.m6022(zzeVar, C0445.m8665(m6544(), 7, C0357.f627 ^ 734, 2479));
                                boolean zM1883 = C0088.m1883(str3);
                                int i29 = 48891;
                                while (true) {
                                    i29 ^= 48908;
                                    switch (i29) {
                                        case 22:
                                            break;
                                        case 53:
                                            ?? M4131 = C0218.m4131(this);
                                            int i30 = 49666;
                                            while (true) {
                                                i30 ^= 49683;
                                                switch (i30) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i30 = M4131 != 0 ? 49759 : 49728;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        M4131 = C0455.m8870(this);
                                                        int i31 = 49790;
                                                        while (true) {
                                                            i31 ^= 49807;
                                                            switch (i31) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 51:
                                                                    kVarM1925 = C0090.m1924(z7VarM3903);
                                                                    C0224.m4302(kVarM1925);
                                                                    C0068.m1329(kVarM1925);
                                                                    try {
                                                                        try {
                                                                            cursorM3501 = C0183.m3501(C0050.m964(kVarM1925), C0261.m4969(m6544(), 56, C0128.f154 ^ (-244), 982), new String[]{str, C0251.m4789(l10)});
                                                                            try {
                                                                                zM6068 = C0314.m6068(cursorM3501);
                                                                                i23 = 50689;
                                                                                while (true) {
                                                                                    i23 ^= 50706;
                                                                                    switch (i23) {
                                                                                        case 19:
                                                                                            i23 = !zM6068 ? 50782 : 50751;
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                            try {
                                                                                                pairM9544 = C0491.m9544((zzfi.zze) ((zzix) C0440.m8566((zzfi.zze.zza) C0164.m3146(C0325.m6273(), C0372.m7292(cursorM3501, 0)))), C0439.m8554(C0394.m7701(cursorM3501, 1)));
                                                                                                C0228.m4391(cursorM3501);
                                                                                                i24 = 51836;
                                                                                                while (true) {
                                                                                                    i24 ^= 51853;
                                                                                                    switch (i24) {
                                                                                                        case 241:
                                                                                                            i24 = 52518;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                        case 1963:
                                                                                                            pair = pairM9544;
                                                                                                            break;
                                                                                                        default:
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                            } catch (IOException e4) {
                                                                                                C0238.m4564(C0455.m8871(C0029.m572(kVarM1925)), C0419.m8230(m6544(), 167, C0152.f177 ^ 328, 2470), C0027.m535(str), l10, e4);
                                                                                                C0228.m4391(cursorM3501);
                                                                                                int i32 = 52611;
                                                                                                while (true) {
                                                                                                    i32 ^= 52628;
                                                                                                    switch (i32) {
                                                                                                        case 23:
                                                                                                            i32 = 52642;
                                                                                                            continue;
                                                                                                        case 54:
                                                                                                            break;
                                                                                                        default:
                                                                                                            continue;
                                                                                                    }
                                                                                                    i22 = 50813;
                                                                                                    while (true) {
                                                                                                        i22 ^= 50830;
                                                                                                        switch (i22) {
                                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                pair = null;
                                                                                                                break;
                                                                                                            case 243:
                                                                                                                i22 = 50844;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                            default:
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            break;
                                                                                        case 76:
                                                                                            C0135.m2604(C0136.m2634(C0029.m572(kVarM1925)), C0179.m3420(m6544(), 147, C0417.f687 ^ (-652), 2234));
                                                                                            C0228.m4391(cursorM3501);
                                                                                            i22 = 50813;
                                                                                            while (true) {
                                                                                                i22 ^= 50830;
                                                                                                switch (i22) {
                                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                        pair = null;
                                                                                                        break;
                                                                                                    case 243:
                                                                                                        i22 = 50844;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                    i19 = 53758;
                                                                                    while (true) {
                                                                                        i19 ^= 53775;
                                                                                        switch (i19) {
                                                                                            case 1009:
                                                                                                i19 = pair != null ? 54502 : 54471;
                                                                                                break;
                                                                                            case 1703:
                                                                                                break;
                                                                                            case 1736:
                                                                                                C0112.m2169(C0336.m6498(C0029.m572(z7VarM3903)), C0318.m6156(m6544(), 396, C0127.f153 ^ (-575), 2045), str3, l10);
                                                                                                return null;
                                                                                            case 1769:
                                                                                                objM1560 = C0072.m1560(pair);
                                                                                                i20 = 54533;
                                                                                                while (true) {
                                                                                                    i20 ^= 54550;
                                                                                                    switch (i20) {
                                                                                                        case 19:
                                                                                                            i20 = objM1560 == null ? 54626 : 54595;
                                                                                                            break;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                            break;
                                                                                                        case 85:
                                                                                                            this.f9947a = (zzfi.zze) objM1560;
                                                                                                            this.f9949c = C0491.m9543((Long) C0057.m1086(pair));
                                                                                                            C0041.m810(z7VarM3903);
                                                                                                            this.f9948b = (Long) C0312.m6022(C0218.m4131(this), strM1741);
                                                                                                            break;
                                                                                                        case 116:
                                                                                                            i21 = 54657;
                                                                                                            while (true) {
                                                                                                                i21 ^= 54674;
                                                                                                                switch (i21) {
                                                                                                                    case 19:
                                                                                                                        i21 = 54688;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                }
                                                                                                                C0112.m2169(C0336.m6498(C0029.m572(z7VarM3903)), C0318.m6156(m6544(), 396, C0127.f153 ^ (-575), 2045), str3, l10);
                                                                                                                return null;
                                                                                                            }
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    jM747 = ((C0038.m747(this) - 7) - 1) + 7;
                                                                                    this.f9949c = jM747;
                                                                                    i10 = 55432;
                                                                                    while (true) {
                                                                                        i10 ^= 55449;
                                                                                        switch (i10) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i10 = jM747 <= 0 ? 55525 : 55494;
                                                                                                break;
                                                                                            case 62:
                                                                                                break;
                                                                                            case 95:
                                                                                                C0303.m5833(C0090.m1924(z7VarM3903), str, l10, C0038.m747(this), C0218.m4131(this));
                                                                                                break;
                                                                                            case 124:
                                                                                                kVarM1924 = C0090.m1924(z7VarM3903);
                                                                                                C0224.m4302(kVarM1924);
                                                                                                C0420.m8245(C0136.m2634(C0029.m572(kVarM1924)), C0432.m8452(m6544(), 235, C0288.f432 ^ (-572), 1944), str);
                                                                                                try {
                                                                                                    SQLiteDatabase sQLiteDatabaseM964 = C0050.m964(kVarM1924);
                                                                                                    String strM7577 = C0387.m7577(m6544(), 274, C0131.f157 ^ (-837), 1739);
                                                                                                    String[] strArr = new String[1];
                                                                                                    strArr[C0128.f154 ^ (-169)] = str;
                                                                                                    C0044.m858(sQLiteDatabaseM964, strM7577, strArr);
                                                                                                    i17 = 55556;
                                                                                                    while (true) {
                                                                                                        i17 ^= 55573;
                                                                                                        switch (i17) {
                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                i17 = 55587;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                            case 54:
                                                                                                                break;
                                                                                                            default:
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                        }
                                                                                                    }
                                                                                                } catch (SQLiteException e10) {
                                                                                                    C0420.m8245(C0455.m8871(C0029.m572(kVarM1924)), C0473.m9207(m6544(), 318, C0461.f731 ^ 996, 1596), e10);
                                                                                                    int i33 = 55680;
                                                                                                    while (true) {
                                                                                                        i33 ^= 55697;
                                                                                                        switch (i33) {
                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                i33 = 56362;
                                                                                                                continue;
                                                                                                            case 1467:
                                                                                                                break;
                                                                                                            default:
                                                                                                                continue;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    arrayList = new ArrayList();
                                                                                    itM2089 = C0107.m2089(C0131.m2528(C0218.m4131(this)));
                                                                                    while (true) {
                                                                                        zM3327 = C0174.m3327(itM2089);
                                                                                        i11 = 56455;
                                                                                        while (true) {
                                                                                            i11 ^= 56472;
                                                                                            switch (i11) {
                                                                                                case 31:
                                                                                                    i11 = zM3327 ? 56548 : 56517;
                                                                                                    break;
                                                                                                case 62:
                                                                                                    break;
                                                                                                case 93:
                                                                                                    break;
                                                                                                case 124:
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                            zM3889 = C0203.m3889(arrayList);
                                                                                            i14 = 1507627;
                                                                                            while (true) {
                                                                                                i14 ^= 1507644;
                                                                                                switch (i14) {
                                                                                                    case 23:
                                                                                                        i14 = !zM3889 ? 1507720 : 1507689;
                                                                                                        break;
                                                                                                    case 85:
                                                                                                        C0420.m8245(C0336.m6498(C0029.m572(z7VarM3903)), C0161.m3082(m6544(), 351, C0114.f140 ^ (-267), 2946), str3);
                                                                                                        i15 = 1508526;
                                                                                                        while (true) {
                                                                                                            i15 ^= 1508543;
                                                                                                            switch (i15) {
                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                    i15 = 1508557;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                case 114:
                                                                                                                    list = listM2528;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    case 118:
                                                                                                        break;
                                                                                                    case 180:
                                                                                                        C0393.m7672(arrayList, listM2528);
                                                                                                        list = arrayList;
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            i16 = 1507751;
                                                                                            while (true) {
                                                                                                i16 ^= 1507768;
                                                                                                switch (i16) {
                                                                                                    case 31:
                                                                                                        i16 = 1508433;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    case 1513:
                                                                                                        listM2528 = list;
                                                                                                        str2 = str3;
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                                return (zzfi.zze) ((zzix) C0440.m8566(C0264.m5045(C0110.m2136(C0021.m416((zzfi.zze.zza) C0290.m5569(zzeVar), str2)), listM2528)));
                                                                                            }
                                                                                        }
                                                                                        zzgVar = (zzfi.zzg) C0414.m8115(itM2089);
                                                                                        C0041.m810(z7VarM3903);
                                                                                        zzgVarM7590 = C0388.m7590(zzeVar, C0128.m2468(zzgVar));
                                                                                        i12 = 56579;
                                                                                        while (true) {
                                                                                            i12 ^= 56596;
                                                                                            switch (i12) {
                                                                                                case 23:
                                                                                                    i12 = zzgVarM7590 == null ? 1507472 : 56641;
                                                                                                    break;
                                                                                                case 54:
                                                                                                    break;
                                                                                                case 85:
                                                                                                    break;
                                                                                                case 1564036:
                                                                                                    C0358.m6998(arrayList, zzgVar);
                                                                                                    i13 = 1507503;
                                                                                                    while (true) {
                                                                                                        i13 ^= 1507520;
                                                                                                        switch (i13) {
                                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                                break;
                                                                                                            case 111:
                                                                                                                i13 = 1507534;
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } catch (SQLiteException e11) {
                                                                                e = e11;
                                                                                int i34 = 51712;
                                                                                while (true) {
                                                                                    i34 ^= 51729;
                                                                                    switch (i34) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case 15:
                                                                                        case Code.UNAUTHENTICATED /* 16 */:
                                                                                        default:
                                                                                            continue;
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i34 = 51743;
                                                                                            continue;
                                                                                    }
                                                                                    C0420.m8245(C0455.m8871(C0029.m572(kVarM1925)), C0217.m4120(m6544(), 209, C0438.f708 ^ (-845), 1536), e);
                                                                                    int i35 = 53510;
                                                                                    while (true) {
                                                                                        i35 ^= 53527;
                                                                                        switch (i35) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i35 = cursorM3501 != null ? 53603 : 53572;
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                break;
                                                                                            case 83:
                                                                                                break;
                                                                                            case 116:
                                                                                                C0228.m4391(cursorM3501);
                                                                                                int i36 = 53634;
                                                                                                while (true) {
                                                                                                    i36 ^= 53651;
                                                                                                    switch (i36) {
                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i36 = 53665;
                                                                                                            continue;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                                                                }
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            r10 = M4131;
                                                                            int i37 = 51588;
                                                                            while (true) {
                                                                                i37 ^= 51605;
                                                                                switch (i37) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i37 = 51619;
                                                                                        continue;
                                                                                    case 54:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                                i18 = 1508650;
                                                                                while (true) {
                                                                                    i18 ^= 1508667;
                                                                                    switch (i18) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i18 = r10 != 0 ? 1509394 : 1508712;
                                                                                            break;
                                                                                        case 83:
                                                                                            break;
                                                                                        case 114:
                                                                                            break;
                                                                                        case 3369:
                                                                                            C0228.m4391(r10);
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        }
                                                                    } catch (SQLiteException e12) {
                                                                        e = e12;
                                                                        cursorM3501 = null;
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        r10 = 0;
                                                                        int i38 = 52735;
                                                                        while (true) {
                                                                            i38 ^= 52752;
                                                                            switch (i38) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case 1007:
                                                                                    i38 = 52766;
                                                                                    continue;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                            i18 = 1508650;
                                                                            while (true) {
                                                                                i18 ^= 1508667;
                                                                                switch (i18) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        if (r10 != 0) {
                                                                                        }
                                                                                        break;
                                                                                    case 83:
                                                                                        break;
                                                                                    case 114:
                                                                                        break;
                                                                                    case 3369:
                                                                                        C0228.m4391(r10);
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 84:
                                                                    long jM9543 = C0491.m9543(l10);
                                                                    long jM9544 = C0491.m9543(C0455.m8870(this));
                                                                    int i39 = 49914;
                                                                    while (true) {
                                                                        M4131 = 49931;
                                                                        i39 ^= 49931;
                                                                        switch (i39) {
                                                                            case 497:
                                                                                i39 = jM9543 != jM9544 ? 50658 : 50627;
                                                                                break;
                                                                            case 1711:
                                                                                break;
                                                                            case 1736:
                                                                                jM747 = ((C0038.m747(this) - 7) - 1) + 7;
                                                                                this.f9949c = jM747;
                                                                                i10 = 55432;
                                                                                while (true) {
                                                                                    i10 ^= 55449;
                                                                                    switch (i10) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            if (jM747 <= 0) {
                                                                                            }
                                                                                            break;
                                                                                        case 62:
                                                                                            break;
                                                                                        case 95:
                                                                                            C0303.m5833(C0090.m1924(z7VarM3903), str, l10, C0038.m747(this), C0218.m4131(this));
                                                                                            break;
                                                                                        case 124:
                                                                                            kVarM1924 = C0090.m1924(z7VarM3903);
                                                                                            C0224.m4302(kVarM1924);
                                                                                            C0420.m8245(C0136.m2634(C0029.m572(kVarM1924)), C0432.m8452(m6544(), 235, C0288.f432 ^ (-572), 1944), str);
                                                                                            SQLiteDatabase sQLiteDatabaseM965 = C0050.m964(kVarM1924);
                                                                                            String strM7578 = C0387.m7577(m6544(), 274, C0131.f157 ^ (-837), 1739);
                                                                                            String[] strArr2 = new String[1];
                                                                                            strArr2[C0128.f154 ^ (-169)] = str;
                                                                                            C0044.m858(sQLiteDatabaseM965, strM7578, strArr2);
                                                                                            i17 = 55556;
                                                                                            while (true) {
                                                                                                i17 ^= 55573;
                                                                                                switch (i17) {
                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        i17 = 55587;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    case 54:
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                arrayList = new ArrayList();
                                                                                itM2089 = C0107.m2089(C0131.m2528(C0218.m4131(this)));
                                                                                while (true) {
                                                                                    zM3327 = C0174.m3327(itM2089);
                                                                                    i11 = 56455;
                                                                                    while (true) {
                                                                                        i11 ^= 56472;
                                                                                        switch (i11) {
                                                                                            case 31:
                                                                                                if (zM3327) {
                                                                                                }
                                                                                                break;
                                                                                            case 62:
                                                                                                break;
                                                                                            case 93:
                                                                                                break;
                                                                                            case 124:
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                        zM3889 = C0203.m3889(arrayList);
                                                                                        i14 = 1507627;
                                                                                        while (true) {
                                                                                            i14 ^= 1507644;
                                                                                            switch (i14) {
                                                                                                case 23:
                                                                                                    if (!zM3889) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 85:
                                                                                                    C0420.m8245(C0336.m6498(C0029.m572(z7VarM3903)), C0161.m3082(m6544(), 351, C0114.f140 ^ (-267), 2946), str3);
                                                                                                    i15 = 1508526;
                                                                                                    while (true) {
                                                                                                        i15 ^= 1508543;
                                                                                                        switch (i15) {
                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                i15 = 1508557;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                            case 114:
                                                                                                                list = listM2528;
                                                                                                                break;
                                                                                                            default:
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 118:
                                                                                                    break;
                                                                                                case 180:
                                                                                                    C0393.m7672(arrayList, listM2528);
                                                                                                    list = arrayList;
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        i16 = 1507751;
                                                                                        while (true) {
                                                                                            i16 ^= 1507768;
                                                                                            switch (i16) {
                                                                                                case 31:
                                                                                                    i16 = 1508433;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                case 1513:
                                                                                                    listM2528 = list;
                                                                                                    str2 = str3;
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                            }
                                                                                            return (zzfi.zze) ((zzix) C0440.m8566(C0264.m5045(C0110.m2136(C0021.m416((zzfi.zze.zza) C0290.m5569(zzeVar), str2)), listM2528)));
                                                                                        }
                                                                                    }
                                                                                    zzgVar = (zzfi.zzg) C0414.m8115(itM2089);
                                                                                    C0041.m810(z7VarM3903);
                                                                                    zzgVarM7590 = C0388.m7590(zzeVar, C0128.m2468(zzgVar));
                                                                                    i12 = 56579;
                                                                                    while (true) {
                                                                                        i12 ^= 56596;
                                                                                        switch (i12) {
                                                                                            case 23:
                                                                                                if (zzgVarM7590 == null) {
                                                                                                }
                                                                                                break;
                                                                                            case 54:
                                                                                                break;
                                                                                            case 85:
                                                                                                break;
                                                                                                break;
                                                                                            case 1564036:
                                                                                                C0358.m6998(arrayList, zzgVar);
                                                                                                i13 = 1507503;
                                                                                                while (true) {
                                                                                                    i13 ^= 1507520;
                                                                                                    switch (i13) {
                                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            break;
                                                                                                        case 111:
                                                                                                            i13 = 1507534;
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
                                                                            case 1769:
                                                                                kVarM1925 = C0090.m1924(z7VarM3903);
                                                                                C0224.m4302(kVarM1925);
                                                                                C0068.m1329(kVarM1925);
                                                                                cursorM3501 = C0183.m3501(C0050.m964(kVarM1925), C0261.m4969(m6544(), 56, C0128.f154 ^ (-244), 982), new String[]{str, C0251.m4789(l10)});
                                                                                zM6068 = C0314.m6068(cursorM3501);
                                                                                i23 = 50689;
                                                                                while (true) {
                                                                                    i23 ^= 50706;
                                                                                    switch (i23) {
                                                                                        case 19:
                                                                                            if (!zM6068) {
                                                                                            }
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                            pairM9544 = C0491.m9544((zzfi.zze) ((zzix) C0440.m8566((zzfi.zze.zza) C0164.m3146(C0325.m6273(), C0372.m7292(cursorM3501, 0)))), C0439.m8554(C0394.m7701(cursorM3501, 1)));
                                                                                            C0228.m4391(cursorM3501);
                                                                                            i24 = 51836;
                                                                                            while (true) {
                                                                                                i24 ^= 51853;
                                                                                                switch (i24) {
                                                                                                    case 241:
                                                                                                        i24 = 52518;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    case 1963:
                                                                                                        pair = pairM9544;
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            break;
                                                                                        case 76:
                                                                                            C0135.m2604(C0136.m2634(C0029.m572(kVarM1925)), C0179.m3420(m6544(), 147, C0417.f687 ^ (-652), 2234));
                                                                                            C0228.m4391(cursorM3501);
                                                                                            i22 = 50813;
                                                                                            while (true) {
                                                                                                i22 ^= 50830;
                                                                                                switch (i22) {
                                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                        pair = null;
                                                                                                        break;
                                                                                                    case 243:
                                                                                                        i22 = 50844;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                    i19 = 53758;
                                                                                    while (true) {
                                                                                        i19 ^= 53775;
                                                                                        switch (i19) {
                                                                                            case 1009:
                                                                                                if (pair != null) {
                                                                                                }
                                                                                                break;
                                                                                            case 1703:
                                                                                                break;
                                                                                            case 1736:
                                                                                                C0112.m2169(C0336.m6498(C0029.m572(z7VarM3903)), C0318.m6156(m6544(), 396, C0127.f153 ^ (-575), 2045), str3, l10);
                                                                                                return null;
                                                                                            case 1769:
                                                                                                objM1560 = C0072.m1560(pair);
                                                                                                i20 = 54533;
                                                                                                while (true) {
                                                                                                    i20 ^= 54550;
                                                                                                    switch (i20) {
                                                                                                        case 19:
                                                                                                            if (objM1560 == null) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                            break;
                                                                                                        case 85:
                                                                                                            this.f9947a = (zzfi.zze) objM1560;
                                                                                                            this.f9949c = C0491.m9543((Long) C0057.m1086(pair));
                                                                                                            C0041.m810(z7VarM3903);
                                                                                                            this.f9948b = (Long) C0312.m6022(C0218.m4131(this), strM1741);
                                                                                                            break;
                                                                                                        case 116:
                                                                                                            i21 = 54657;
                                                                                                            while (true) {
                                                                                                                i21 ^= 54674;
                                                                                                                switch (i21) {
                                                                                                                    case 19:
                                                                                                                        i21 = 54688;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                }
                                                                                                                C0112.m2169(C0336.m6498(C0029.m572(z7VarM3903)), C0318.m6156(m6544(), 396, C0127.f153 ^ (-575), 2045), str3, l10);
                                                                                                                return null;
                                                                                                            }
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    jM747 = ((C0038.m747(this) - 7) - 1) + 7;
                                                                                    this.f9949c = jM747;
                                                                                    i10 = 55432;
                                                                                    while (true) {
                                                                                        i10 ^= 55449;
                                                                                        switch (i10) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                if (jM747 <= 0) {
                                                                                                }
                                                                                                break;
                                                                                            case 62:
                                                                                                break;
                                                                                            case 95:
                                                                                                C0303.m5833(C0090.m1924(z7VarM3903), str, l10, C0038.m747(this), C0218.m4131(this));
                                                                                                break;
                                                                                            case 124:
                                                                                                kVarM1924 = C0090.m1924(z7VarM3903);
                                                                                                C0224.m4302(kVarM1924);
                                                                                                C0420.m8245(C0136.m2634(C0029.m572(kVarM1924)), C0432.m8452(m6544(), 235, C0288.f432 ^ (-572), 1944), str);
                                                                                                SQLiteDatabase sQLiteDatabaseM966 = C0050.m964(kVarM1924);
                                                                                                String strM7579 = C0387.m7577(m6544(), 274, C0131.f157 ^ (-837), 1739);
                                                                                                String[] strArr3 = new String[1];
                                                                                                strArr3[C0128.f154 ^ (-169)] = str;
                                                                                                C0044.m858(sQLiteDatabaseM966, strM7579, strArr3);
                                                                                                i17 = 55556;
                                                                                                while (true) {
                                                                                                    i17 ^= 55573;
                                                                                                    switch (i17) {
                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i17 = 55587;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                        case 54:
                                                                                                            break;
                                                                                                        default:
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    arrayList = new ArrayList();
                                                                                    itM2089 = C0107.m2089(C0131.m2528(C0218.m4131(this)));
                                                                                    while (true) {
                                                                                        zM3327 = C0174.m3327(itM2089);
                                                                                        i11 = 56455;
                                                                                        while (true) {
                                                                                            i11 ^= 56472;
                                                                                            switch (i11) {
                                                                                                case 31:
                                                                                                    if (zM3327) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 62:
                                                                                                    break;
                                                                                                case 93:
                                                                                                    break;
                                                                                                case 124:
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                            zM3889 = C0203.m3889(arrayList);
                                                                                            i14 = 1507627;
                                                                                            while (true) {
                                                                                                i14 ^= 1507644;
                                                                                                switch (i14) {
                                                                                                    case 23:
                                                                                                        if (!zM3889) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 85:
                                                                                                        C0420.m8245(C0336.m6498(C0029.m572(z7VarM3903)), C0161.m3082(m6544(), 351, C0114.f140 ^ (-267), 2946), str3);
                                                                                                        i15 = 1508526;
                                                                                                        while (true) {
                                                                                                            i15 ^= 1508543;
                                                                                                            switch (i15) {
                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                    i15 = 1508557;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                case 114:
                                                                                                                    list = listM2528;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    case 118:
                                                                                                        break;
                                                                                                    case 180:
                                                                                                        C0393.m7672(arrayList, listM2528);
                                                                                                        list = arrayList;
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            i16 = 1507751;
                                                                                            while (true) {
                                                                                                i16 ^= 1507768;
                                                                                                switch (i16) {
                                                                                                    case 31:
                                                                                                        i16 = 1508433;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    case 1513:
                                                                                                        listM2528 = list;
                                                                                                        str2 = str3;
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                                return (zzfi.zze) ((zzix) C0440.m8566(C0264.m5045(C0110.m2136(C0021.m416((zzfi.zze.zza) C0290.m5569(zzeVar), str2)), listM2528)));
                                                                                            }
                                                                                        }
                                                                                        zzgVar = (zzfi.zzg) C0414.m8115(itM2089);
                                                                                        C0041.m810(z7VarM3903);
                                                                                        zzgVarM7590 = C0388.m7590(zzeVar, C0128.m2468(zzgVar));
                                                                                        i12 = 56579;
                                                                                        while (true) {
                                                                                            i12 ^= 56596;
                                                                                            switch (i12) {
                                                                                                case 23:
                                                                                                    if (zzgVarM7590 == null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 54:
                                                                                                    break;
                                                                                                case 85:
                                                                                                    break;
                                                                                                    break;
                                                                                                case 1564036:
                                                                                                    C0358.m6998(arrayList, zzgVar);
                                                                                                    i13 = 1507503;
                                                                                                    while (true) {
                                                                                                        i13 ^= 1507520;
                                                                                                        switch (i13) {
                                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                break;
                                                                                                            case 111:
                                                                                                                i13 = 1507534;
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 241:
                                                                    i31 = M4131 != 0 ? 49883 : 49852;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 83:
                                                        kVarM1925 = C0090.m1924(z7VarM3903);
                                                        C0224.m4302(kVarM1925);
                                                        C0068.m1329(kVarM1925);
                                                        cursorM3501 = C0183.m3501(C0050.m964(kVarM1925), C0261.m4969(m6544(), 56, C0128.f154 ^ (-244), 982), new String[]{str, C0251.m4789(l10)});
                                                        zM6068 = C0314.m6068(cursorM3501);
                                                        i23 = 50689;
                                                        while (true) {
                                                            i23 ^= 50706;
                                                            switch (i23) {
                                                                case 19:
                                                                    if (!zM6068) {
                                                                    }
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    pairM9544 = C0491.m9544((zzfi.zze) ((zzix) C0440.m8566((zzfi.zze.zza) C0164.m3146(C0325.m6273(), C0372.m7292(cursorM3501, 0)))), C0439.m8554(C0394.m7701(cursorM3501, 1)));
                                                                    C0228.m4391(cursorM3501);
                                                                    i24 = 51836;
                                                                    while (true) {
                                                                        i24 ^= 51853;
                                                                        switch (i24) {
                                                                            case 241:
                                                                                i24 = 52518;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            case 1963:
                                                                                pair = pairM9544;
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    C0135.m2604(C0136.m2634(C0029.m572(kVarM1925)), C0179.m3420(m6544(), 147, C0417.f687 ^ (-652), 2234));
                                                                    C0228.m4391(cursorM3501);
                                                                    i22 = 50813;
                                                                    while (true) {
                                                                        i22 ^= 50830;
                                                                        switch (i22) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                pair = null;
                                                                                break;
                                                                            case 243:
                                                                                i22 = 50844;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                            i19 = 53758;
                                                            while (true) {
                                                                i19 ^= 53775;
                                                                switch (i19) {
                                                                    case 1009:
                                                                        if (pair != null) {
                                                                        }
                                                                        break;
                                                                    case 1703:
                                                                        break;
                                                                    case 1736:
                                                                        C0112.m2169(C0336.m6498(C0029.m572(z7VarM3903)), C0318.m6156(m6544(), 396, C0127.f153 ^ (-575), 2045), str3, l10);
                                                                        return null;
                                                                    case 1769:
                                                                        objM1560 = C0072.m1560(pair);
                                                                        i20 = 54533;
                                                                        while (true) {
                                                                            i20 ^= 54550;
                                                                            switch (i20) {
                                                                                case 19:
                                                                                    if (objM1560 == null) {
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                case 85:
                                                                                    this.f9947a = (zzfi.zze) objM1560;
                                                                                    this.f9949c = C0491.m9543((Long) C0057.m1086(pair));
                                                                                    C0041.m810(z7VarM3903);
                                                                                    this.f9948b = (Long) C0312.m6022(C0218.m4131(this), strM1741);
                                                                                    break;
                                                                                case 116:
                                                                                    i21 = 54657;
                                                                                    while (true) {
                                                                                        i21 ^= 54674;
                                                                                        switch (i21) {
                                                                                            case 19:
                                                                                                i21 = 54688;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                break;
                                                                                            default:
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                        }
                                                                                        C0112.m2169(C0336.m6498(C0029.m572(z7VarM3903)), C0318.m6156(m6544(), 396, C0127.f153 ^ (-575), 2045), str3, l10);
                                                                                        return null;
                                                                                    }
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            jM747 = ((C0038.m747(this) - 7) - 1) + 7;
                                                            this.f9949c = jM747;
                                                            i10 = 55432;
                                                            while (true) {
                                                                i10 ^= 55449;
                                                                switch (i10) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (jM747 <= 0) {
                                                                        }
                                                                        break;
                                                                    case 62:
                                                                        break;
                                                                    case 95:
                                                                        C0303.m5833(C0090.m1924(z7VarM3903), str, l10, C0038.m747(this), C0218.m4131(this));
                                                                        break;
                                                                    case 124:
                                                                        kVarM1924 = C0090.m1924(z7VarM3903);
                                                                        C0224.m4302(kVarM1924);
                                                                        C0420.m8245(C0136.m2634(C0029.m572(kVarM1924)), C0432.m8452(m6544(), 235, C0288.f432 ^ (-572), 1944), str);
                                                                        SQLiteDatabase sQLiteDatabaseM967 = C0050.m964(kVarM1924);
                                                                        String strM75710 = C0387.m7577(m6544(), 274, C0131.f157 ^ (-837), 1739);
                                                                        String[] strArr4 = new String[1];
                                                                        strArr4[C0128.f154 ^ (-169)] = str;
                                                                        C0044.m858(sQLiteDatabaseM967, strM75710, strArr4);
                                                                        i17 = 55556;
                                                                        while (true) {
                                                                            i17 ^= 55573;
                                                                            switch (i17) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i17 = 55587;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case 54:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            arrayList = new ArrayList();
                                                            itM2089 = C0107.m2089(C0131.m2528(C0218.m4131(this)));
                                                            while (true) {
                                                                zM3327 = C0174.m3327(itM2089);
                                                                i11 = 56455;
                                                                while (true) {
                                                                    i11 ^= 56472;
                                                                    switch (i11) {
                                                                        case 31:
                                                                            if (zM3327) {
                                                                            }
                                                                            break;
                                                                        case 62:
                                                                            break;
                                                                        case 93:
                                                                            break;
                                                                        case 124:
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                    zM3889 = C0203.m3889(arrayList);
                                                                    i14 = 1507627;
                                                                    while (true) {
                                                                        i14 ^= 1507644;
                                                                        switch (i14) {
                                                                            case 23:
                                                                                if (!zM3889) {
                                                                                }
                                                                                break;
                                                                            case 85:
                                                                                C0420.m8245(C0336.m6498(C0029.m572(z7VarM3903)), C0161.m3082(m6544(), 351, C0114.f140 ^ (-267), 2946), str3);
                                                                                i15 = 1508526;
                                                                                while (true) {
                                                                                    i15 ^= 1508543;
                                                                                    switch (i15) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i15 = 1508557;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                        case 114:
                                                                                            list = listM2528;
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 118:
                                                                                break;
                                                                            case 180:
                                                                                C0393.m7672(arrayList, listM2528);
                                                                                list = arrayList;
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    i16 = 1507751;
                                                                    while (true) {
                                                                        i16 ^= 1507768;
                                                                        switch (i16) {
                                                                            case 31:
                                                                                i16 = 1508433;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            case 1513:
                                                                                listM2528 = list;
                                                                                str2 = str3;
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                        return (zzfi.zze) ((zzix) C0440.m8566(C0264.m5045(C0110.m2136(C0021.m416((zzfi.zze.zza) C0290.m5569(zzeVar), str2)), listM2528)));
                                                                    }
                                                                }
                                                                zzgVar = (zzfi.zzg) C0414.m8115(itM2089);
                                                                C0041.m810(z7VarM3903);
                                                                zzgVarM7590 = C0388.m7590(zzeVar, C0128.m2468(zzgVar));
                                                                i12 = 56579;
                                                                while (true) {
                                                                    i12 ^= 56596;
                                                                    switch (i12) {
                                                                        case 23:
                                                                            if (zzgVarM7590 == null) {
                                                                            }
                                                                            break;
                                                                        case 54:
                                                                            break;
                                                                        case 85:
                                                                            break;
                                                                            break;
                                                                        case 1564036:
                                                                            C0358.m6998(arrayList, zzgVar);
                                                                            i13 = 1507503;
                                                                            while (true) {
                                                                                i13 ^= 1507520;
                                                                                switch (i13) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        break;
                                                                                    case 111:
                                                                                        i13 = 1507534;
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 503:
                                            i29 = zM1883 ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            C0420.m8245(C0336.m6498(C0029.m572(z7VarM3903)), C0423.m8293(m6544(), 10, C0264.f343 ^ 566, 2022), l10);
                                            return null;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                i28 = zM321 ? 48860 : 48829;
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
        int i40 = 1509425;
        while (true) {
            i40 ^= 1509442;
            switch (i40) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    str2 = strM2037;
                    break;
                case 115:
                    i40 = z10 ? 1509518 : 1509487;
                    break;
                case 204:
                    this.f9948b = l10;
                    this.f9947a = zzeVar;
                    C0041.m810(z7VarM3903);
                    Serializable serializableM8554 = C0439.m8554(0L);
                    Serializable serializableM6022 = C0312.m6022(zzeVar, C0351.m6868(m6544(), 459, C0249.f328 ^ 57, 623));
                    int i41 = 1509549;
                    while (true) {
                        i41 ^= 1509566;
                        switch (i41) {
                            case 19:
                                if (serializableM6022 == null) {
                                    i41 = 1509642;
                                }
                                break;
                            case 85:
                                serializableM8554 = serializableM6022;
                                break;
                            case 114:
                                break;
                            case 436:
                                int i42 = 1509673;
                                while (true) {
                                    i42 ^= 1509690;
                                    switch (i42) {
                                        case 19:
                                            i42 = 1510355;
                                            break;
                                        case 745:
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i41 = 1509611;
                    }
                    long jM9545 = C0491.m9543((Long) serializableM8554);
                    this.f9949c = jM9545;
                    int i43 = 1510448;
                    while (true) {
                        i43 ^= 1510465;
                        switch (i43) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 47:
                                k kVarM1926 = C0090.m1924(z7VarM3903);
                                C0271.m5173(l10);
                                C0303.m5833(kVarM1926, str, l10, C0038.m747(this), zzeVar);
                                str2 = strM2037;
                                break;
                            case 113:
                                i43 = jM9545 <= 0 ? 1510541 : 1510510;
                                break;
                            case 204:
                                C0420.m8245(C0336.m6498(C0029.m572(z7VarM3903)), C0430.m8416(m6544(), 463, C0028.f48 ^ 335, 1461), strM2037);
                                int i44 = 1510572;
                                while (true) {
                                    i44 ^= 1510589;
                                    switch (i44) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i44 = 1510603;
                                            continue;
                                        case 118:
                                            str2 = strM2037;
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
        return (zzfi.zze) ((zzix) C0440.m8566(C0264.m5045(C0110.m2136(C0021.m416((zzfi.zze.zza) C0290.m5569(zzeVar), str2)), listM2528)));
    }
}
