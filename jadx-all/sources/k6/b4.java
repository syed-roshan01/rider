package k6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import androidx.activity.C0017;
import androidx.annotation.C0019;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.ui.draw.C0029;
import androidx.core.app.C0040;
import b1.C0050;
import c0.C0056;
import c0.C0057;
import c4.C0065;
import c7.C0068;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.components.C0134;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.installations.C0177;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.bind.C0206;
import d.C0211;
import d9.C0225;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.components.C0230;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.android.lifecycle.C0238;
import e1.C0258;
import e2.C0264;
import f.C0270;
import f4.C0277;
import g.C0285;
import g8.C0294;
import h0.C0300;
import h6.C0310;
import h8.C0314;
import i4.C0318;
import i6.C0320;
import ia.C0323;
import j2.C0324;
import j5.C0328;
import ja.C0331;
import k.C0332;
import l3.C0343;
import l9.C0348;
import okhttp3.internal.publicsuffix.C0373;
import p8.C0381;
import q6.C0388;
import q6.C0389;
import r1.C0394;
import r2.C0396;
import r6.C0402;
import r7.C0405;
import r9.C0406;
import s0.C0411;
import s3.C0413;
import s7.C0416;
import t1.C0420;
import t9.C0428;
import u0.C0431;
import u3.C0435;
import u8.C0439;
import v0.C0442;
import v0.C0443;
import v6.C0448;
import w0.C0455;
import w2.C0457;
import w4.C0460;
import x2.C0468;
import x4.C0470;
import x7.C0472;
import y.C0476;
import z2.C0485;
import z3.C0486;
import z3.C0487;

/* JADX INFO: loaded from: classes.dex */
public final class b4 extends p2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f525short = {1316, 1324, 1324, 1316, 1327, 1318, 1308, 1314, 1331, 1331, 1308, 1326, 1318, 1314, 1328, 1334, 1329, 1318, 1326, 1318, 1325, 1335, 1308, 1327, 1324, 1312, 1314, 1327, 1389, 1319, 1313, 924, 916, 898, 898, 912, 918, 916, 898, 993, 1020, 996, 1018, 1015, 1991, 1994, 1987, 2006, 1934, 1932, 522, 1504, 1533, 1509, 1531, 1526, 1458, 1526, 1527, 1505, 1521, 2883, 1742, 1731, 1738, 1759, 1480, 1475, 1497, 1503, 1492, 1438, 1416, 1409, 1416, 1422, 1433, 1485, 1422, 1410, 1432, 1411, 1433, 1477, 1500, 1476, 1485, 1419, 1439, 1410, 1408, 1485, 1408, 1416, 1438, 1438, 1420, 1418, 1416, 1438, 3316, 3324, 3306, 3306, 3320, 3326, 3324, 3306, 730, 767, 746, 767, 702, 754, 753, 749, 749, 690, 702, 754, 753, 765, 767, 754, 702, 762, 764, 702, 760, 747, 754, 754, 946, 943, 951, 937, 932, 992, 937, 942, 992, 1000, 947, 933, 940, 933, 931, 948, 992, 946, 943, 951, 937, 932, 992, 934, 946, 943, 941, 992, 941, 933, 947, 947, 929, 935, 933, 947, 992, 943, 946, 932, 933, 946, 992, 930, 953, 992, 946, 943, 951, 937, 932, 992, 929, 947, 931, 992, 940, 937, 941, 937, 948, 992, 1023, 1001, 1425, 1468, 1459, 1459, 1456, 1447, 1456, 1467, 1441, 1525, 1457, 1456, 1465, 1456, 1441, 1456, 1525, 1462, 1466, 1440, 1467, 1441, 1525, 1441, 1469, 1460, 1467, 1525, 1456, 1453, 1445, 1456, 1462, 1441, 1456, 1457, 1525, 1468, 1467, 1525, 1465, 1466, 1462, 1460, 1465, 1525, 1457, 1463, 1531, 1525, 1456, 1453, 1445, 1456, 1462, 1441, 1456, 1457, 1529, 1525, 1447, 1456, 1462, 1456, 1468, 1443, 1456, 1457, 1529, 1525, 1457, 1468, 1459, 1459, 1456, 1447, 1456, 1467, 1462, 1456, 1703, 1680, 1680, 1677, 1680, 1730, 1685, 1680, 1675, 1686, 1675, 1676, 1669, 1730, 1671, 1676, 1686, 1680, 1691, 1730, 1686, 1677, 1730, 1678, 1677, 1665, 1667, 1678, 1730, 1670, 1667, 1686, 1667, 1664, 1667, 1681, 1671, 2343, 2320, 2320, 2317, 2320, 2370, 2325, 2320, 2315, 2326, 2315, 2316, 2309, 2370, 2311, 2316, 2326, 2320, 2331, 2393, 2370, 2318, 2317, 2305, 2307, 2318, 2370, 2310, 2307, 2326, 2307, 2304, 2307, 2321, 2311, 2370, 2308, 2327, 2318, 2318, 3283, 3316, 3324, 3321, 3312, 3313, 3253, 3297, 3322, 3253, 3298, 3303, 3324, 3297, 3312, 3253, 3312, 3323, 3297, 3303, 3308, 3253, 3297, 3322, 3253, 3321, 3322, 3318, 3316, 3321, 3253, 3313, 3316, 3297, 3316, 3319, 3316, 3302, 3312, 3041, 3049, 3071, 3071, 3053, 3051, 3049, 3071, 1987, 2036, 2018, 2036, 2021, 1969, 2045, 2046, 2034, 2032, 2045, 1969, 2032, 2047, 2032, 2045, 2024, 2021, 2040, 2034, 2018, 1969, 2037, 2032, 2021, 2032, 1983, 1969, 2019, 2036, 2034, 2046, 2019, 2037, 2018, 1093, 1138, 1138, 1135, 1138, 1056, 1138, 1125, 1139, 1125, 1140, 1140, 1129, 1134, 1127, 1056, 1132, 1135, 1123, 1121, 1132, 1056, 1121, 1134, 1121, 1132, 1145, 1140, 1129, 1123, 1139, 1056, 1124, 1121, 1140, 1121, 1070, 1056, 1125, 1138, 1138, 1135, 1138, 394, 445, 445, 416, 445, 495, 427, 426, 419, 426, 443, 422, 417, 424, 495, 430, 447, 447, 495, 419, 430, 442, 417, 428, 423, 495, 429, 445, 426, 430, 420, 495, 425, 445, 416, 418, 495, 419, 416, 428, 430, 419, 495, 427, 430, 443, 430, 429, 430, 444, 426, 2321, 2329, 2329, 2321, 2330, 2323, 2345, 2327, 2310, 2310, 2345, 2331, 2323, 2327, 2309, 2307, 2308, 2323, 2331, 2323, 2328, 2306, 2345, 2330, 2329, 2325, 2327, 2330, 2392, 2322, 2324, 1424, 1432, 1422, 1422, 1436, 1434, 1432, 1422, 1928, 1925, 1932, 1945, 2012, 1985, 1985, 2012, 1987, 2926, 2905, 2905, 2884, 2905, 2827, 2895, 2894, 2887, 2894, 2911, 2882, 2885, 2892, 2827, 2890, 2907, 2907, 2827, 2887, 2890, 2910, 2885, 2888, 2883, 2827, 2889, 2905, 2894, 2890, 2880, 2827, 2893, 2905, 2884, 2886, 2827, 2887, 2884, 2888, 2890, 2887, 2827, 2895, 2890, 2911, 2890, 2889, 2890, 2904, 2894, 2827, 2882, 2885, 2827, 2905, 2894, 2890, 2904, 2884, 2885, 2890, 2889, 2887, 2894, 2827, 2911, 2882, 2886, 2894};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f9911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9912d;

    public b4(f5 f5Var) {
        super(f5Var);
        this.f9911c = new m(this, C0277.m5311(this), C0389.m7613(m6537(), 0, C0225.f304 ^ 845, 1347), 1);
        int iM7737 = C0396.m7737();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7737 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0460.m8952("Q9bwDy6I")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public static long v(SQLiteDatabase sQLiteDatabase) throws Throwable {
        Cursor cursor;
        try {
            Cursor cursorM4442 = C0232.m4442(sQLiteDatabase, C0121.m2327(m6537(), 31, C0178.f202 ^ 147, 1009), new String[]{C0229.m4396(m6537(), 39, C0411.f681 ^ 944, 915)}, C0017.m345(m6537(), 44, C0388.f658 ^ (-890), 1971), new String[]{C0485.m9421(m6537(), 50, 1, 569)}, null, null, C0431.m8432(m6537(), 51, C0206.f230 ^ 111, 1426), C0083.m1776(m6537(), 61, 1, 2930));
            try {
                boolean zM6068 = C0314.m6068(cursorM4442);
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i10 = zM6068 ? 1709 : 1678;
                            break;
                        case 204:
                            long jM7701 = C0394.m7701(cursorM4442, 0);
                            C0228.m4391(cursorM4442);
                            return jM7701;
                        case 239:
                            C0228.m4391(cursorM4442);
                            return 773 ^ ((long) C0237.f316);
                        default:
                            break;
                    }
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorM4442;
                int i11 = 1740;
                while (true) {
                    i11 ^= 1757;
                    switch (i11) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i11 = 1771;
                            break;
                        case 54:
                            int i12 = 1864;
                            while (true) {
                                i12 ^= 1881;
                                switch (i12) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i12 = cursor != null ? 48736 : 48705;
                                        break;
                                    case 47384:
                                        break;
                                    case 47417:
                                        C0228.m4391(cursor);
                                        break;
                                    case 47483:
                                        break;
                                    default:
                                        break;
                                }
                            }
                            throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۤۥ, reason: not valid java name and contains not printable characters */
    public static short[] m6537() {
        int iM8732 = C0448.m8732();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8732 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f525short;
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

    @Override // k6.p2
    public final boolean u() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:404:0x03e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x0364 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x03ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x03ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x03f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x03ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x03fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x0403 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x0407 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x040a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x0403 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x03ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:119:0x01bc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x01cc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:153:0x029b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:174:0x02e1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:202:0x0353. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:232:0x03b3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:264:0x0431. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x00c4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x00e7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:99:0x0174. Please report as an issue. */
    public final boolean w(int i10, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabaseM9147;
        Cursor cursorM3501;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long jM7701;
        C0040.m791(this);
        boolean zM5652 = C0294.m5652(this);
        int i17 = 1616;
        while (true) {
            i17 ^= 1633;
            switch (i17) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM5652) {
                        i17 = 1709;
                    }
                    break;
                case 204:
                    return false;
                case 239:
                    ContentValues contentValues = new ContentValues();
                    C0264.m5023(contentValues, C0134.m2581(m6537(), 62, C0130.f156 ^ (-61), 1722), C0057.m1083(i10));
                    C0416.m8156(contentValues, C0056.m1071(m6537(), 66, C0270.f349 ^ (-512), 1453), bArr);
                    int i18 = 5;
                    int i19 = 0;
                    while (true) {
                        int i20 = 1740;
                        while (true) {
                            i20 ^= 1757;
                            switch (i20) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i20 = i19 < 5 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    C0135.m2604(C0136.m2634(C0029.m572(this)), C0175.m3335(m6537(), 353, C0486.f759 ^ 16, 3221));
                                    return false;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    break;
                                default:
                                    break;
                            }
                        }
                        Cursor cursor = null;
                        try {
                            sQLiteDatabaseM9147 = C0470.m9147(this);
                            int i21 = 1864;
                            while (true) {
                                i21 ^= 1881;
                                switch (i21) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i21 = sQLiteDatabaseM9147 == null ? 48736 : 48705;
                                        break;
                                    case 47384:
                                        try {
                                            C0348.m6794(sQLiteDatabaseM9147);
                                            cursorM3501 = C0183.m3501(sQLiteDatabaseM9147, C0022.m430(m6537(), 71, C0318.f465 ^ 328, 1517), null);
                                            int i22 = 49914;
                                            while (true) {
                                                i22 ^= 49931;
                                                switch (i22) {
                                                    case 497:
                                                        i22 = cursorM3501 != null ? 50658 : 50627;
                                                        break;
                                                    case 1711:
                                                        break;
                                                    case 1736:
                                                        jM7701 = 0;
                                                        break;
                                                    case 1769:
                                                        try {
                                                            boolean zM6068 = C0314.m6068(cursorM3501);
                                                            int i23 = 50689;
                                                            while (true) {
                                                                i23 ^= 50706;
                                                                switch (i23) {
                                                                    case 19:
                                                                        i23 = zM6068 ? 50782 : 50751;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        jM7701 = 0;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 76:
                                                                        jM7701 = C0394.m7701(cursorM3501, 0);
                                                                        int i24 = 50813;
                                                                        while (true) {
                                                                            i24 ^= 50830;
                                                                            switch (i24) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case 243:
                                                                                    i24 = 50844;
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
                                                            }
                                                        } catch (SQLiteDatabaseLockedException e4) {
                                                            int i25 = 53634;
                                                            while (true) {
                                                                i25 ^= 53651;
                                                                switch (i25) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i25 = 53665;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                try {
                                                                    C0472.m9182(i18);
                                                                    int i26 = (C0285.f429 ^ 972) + i18;
                                                                    int i27 = 1507503;
                                                                    while (true) {
                                                                        i27 ^= 1507520;
                                                                        switch (i27) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                break;
                                                                            case 111:
                                                                                i27 = cursorM3501 != null ? 1507596 : 1507565;
                                                                                break;
                                                                            case 460:
                                                                                C0228.m4391(cursorM3501);
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    int i28 = 1507627;
                                                                    while (true) {
                                                                        i28 ^= 1507644;
                                                                        switch (i28) {
                                                                            case 23:
                                                                                i28 = sQLiteDatabaseM9147 != null ? 1507720 : 1507689;
                                                                                break;
                                                                            case 85:
                                                                                i12 = i26;
                                                                                break;
                                                                            case 118:
                                                                                break;
                                                                            case 180:
                                                                                C0160.m3061(sQLiteDatabaseM9147);
                                                                                int i29 = 1507751;
                                                                                while (true) {
                                                                                    i29 ^= 1507768;
                                                                                    switch (i29) {
                                                                                        case 31:
                                                                                            i29 = 1508433;
                                                                                            break;
                                                                                        case 1513:
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                    i12 = i26;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    int i30 = (C0258.f337 ^ (-351)) + i19;
                                                                    i16 = 1509425;
                                                                    while (true) {
                                                                        i16 ^= 1509442;
                                                                        switch (i16) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 115:
                                                                                i16 = 1509456;
                                                                                break;
                                                                        }
                                                                    }
                                                                    i18 = i12;
                                                                    i19 = i30;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    cursor = cursorM3501;
                                                                    sQLiteDatabase = sQLiteDatabaseM9147;
                                                                    i15 = 48891;
                                                                    while (true) {
                                                                        i15 ^= 48908;
                                                                        switch (i15) {
                                                                            case 22:
                                                                                break;
                                                                            case 503:
                                                                                i15 = 48922;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                        i13 = 1509549;
                                                                        while (true) {
                                                                            i13 ^= 1509566;
                                                                            switch (i13) {
                                                                                case 19:
                                                                                    i13 = cursor != null ? 1509642 : 1509611;
                                                                                    break;
                                                                                case 85:
                                                                                    break;
                                                                                case 114:
                                                                                    break;
                                                                                case 436:
                                                                                    C0228.m4391(cursor);
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        i14 = 1509673;
                                                                        while (true) {
                                                                            i14 ^= 1509690;
                                                                            switch (i14) {
                                                                                case 19:
                                                                                    if (sQLiteDatabase != null) {
                                                                                        i14 = 1510417;
                                                                                    }
                                                                                    break;
                                                                                case 712:
                                                                                    break;
                                                                                case 745:
                                                                                    break;
                                                                                case 1323:
                                                                                    C0160.m3061(sQLiteDatabase);
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                            i14 = 1510386;
                                                                        }
                                                                        throw th;
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                        } catch (SQLiteFullException e10) {
                                                            e = e10;
                                                            int i31 = 51836;
                                                            while (true) {
                                                                i31 ^= 51853;
                                                                switch (i31) {
                                                                    case 241:
                                                                        i31 = 52518;
                                                                        break;
                                                                    case 1963:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                cursor = cursorM3501;
                                                                try {
                                                                    C0420.m8245(C0455.m8871(C0029.m572(this)), C0310.m5976(m6537(), 313, C0159.f183 ^ 58, 2402), e);
                                                                    this.f9912d = true;
                                                                    int i32 = 1508526;
                                                                    while (true) {
                                                                        i32 ^= 1508543;
                                                                        switch (i32) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i32 = cursor != null ? 1508619 : 1508588;
                                                                                break;
                                                                            case 83:
                                                                                break;
                                                                            case 114:
                                                                                break;
                                                                            case 436:
                                                                                C0228.m4391(cursor);
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    int i33 = 1508650;
                                                                    while (true) {
                                                                        i33 ^= 1508667;
                                                                        switch (i33) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i33 = sQLiteDatabaseM9147 != null ? 1509394 : 1508712;
                                                                                break;
                                                                            case 83:
                                                                                i12 = i18;
                                                                                break;
                                                                            case 114:
                                                                                break;
                                                                            case 3369:
                                                                                C0160.m3061(sQLiteDatabaseM9147);
                                                                                i12 = i18;
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    int i34 = (C0258.f337 ^ (-351)) + i19;
                                                                    i16 = 1509425;
                                                                    while (true) {
                                                                        i16 ^= 1509442;
                                                                        switch (i16) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 115:
                                                                                i16 = 1509456;
                                                                                break;
                                                                        }
                                                                    }
                                                                    i18 = i12;
                                                                    i19 = i34;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    sQLiteDatabase = sQLiteDatabaseM9147;
                                                                    i15 = 48891;
                                                                    while (true) {
                                                                        i15 ^= 48908;
                                                                        switch (i15) {
                                                                            case 22:
                                                                                break;
                                                                            case 503:
                                                                                i15 = 48922;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                        i13 = 1509549;
                                                                        while (true) {
                                                                            i13 ^= 1509566;
                                                                            switch (i13) {
                                                                                case 19:
                                                                                    if (cursor != null) {
                                                                                    }
                                                                                    break;
                                                                                case 85:
                                                                                    break;
                                                                                case 114:
                                                                                    break;
                                                                                case 436:
                                                                                    C0228.m4391(cursor);
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        i14 = 1509673;
                                                                        while (true) {
                                                                            i14 ^= 1509690;
                                                                            switch (i14) {
                                                                                case 19:
                                                                                    if (sQLiteDatabase != null) {
                                                                                        i14 = 1510417;
                                                                                    }
                                                                                    break;
                                                                                case 712:
                                                                                    break;
                                                                                case 745:
                                                                                    break;
                                                                                case 1323:
                                                                                    C0160.m3061(sQLiteDatabase);
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                            i14 = 1510386;
                                                                        }
                                                                        throw th;
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                        } catch (SQLiteException e11) {
                                                            e = e11;
                                                            int i35 = 51712;
                                                            while (true) {
                                                                i35 ^= 51729;
                                                                switch (i35) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case 15:
                                                                    case Code.UNAUTHENTICATED /* 16 */:
                                                                    default:
                                                                        break;
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i35 = 51743;
                                                                        break;
                                                                }
                                                                int i36 = 49666;
                                                                while (true) {
                                                                    i36 ^= 49683;
                                                                    switch (i36) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i36 = 49697;
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                    sQLiteDatabase = sQLiteDatabaseM9147;
                                                                    cursor = cursorM3501;
                                                                    int i37 = 54533;
                                                                    while (true) {
                                                                        i37 ^= 54550;
                                                                        switch (i37) {
                                                                            case 19:
                                                                                i37 = sQLiteDatabase != null ? 54626 : 54595;
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 85:
                                                                                break;
                                                                            case 116:
                                                                                try {
                                                                                    boolean zM3035 = C0159.m3035(sQLiteDatabase);
                                                                                    int i38 = 54657;
                                                                                    while (true) {
                                                                                        i38 ^= 54674;
                                                                                        switch (i38) {
                                                                                            case 19:
                                                                                                i38 = zM3035 ? 55401 : 54719;
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                break;
                                                                                            case 3579:
                                                                                                C0320.m6188(sQLiteDatabase);
                                                                                                int i39 = 55432;
                                                                                                while (true) {
                                                                                                    i39 ^= 55449;
                                                                                                    switch (i39) {
                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i39 = 55463;
                                                                                                            break;
                                                                                                        case 62:
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
                                                                                    }
                                                                                } catch (Throwable th3) {
                                                                                    int i40 = 55556;
                                                                                    while (true) {
                                                                                        i40 ^= 55573;
                                                                                        switch (i40) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i40 = 55587;
                                                                                                continue;
                                                                                            case 54:
                                                                                                th = th3;
                                                                                                break;
                                                                                            default:
                                                                                                continue;
                                                                                        }
                                                                                        i11 = 51588;
                                                                                        while (true) {
                                                                                            i11 ^= 51605;
                                                                                            switch (i11) {
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i11 = 51619;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                case 54:
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                                    continue;
                                                                                            }
                                                                                            i13 = 1509549;
                                                                                            while (true) {
                                                                                                i13 ^= 1509566;
                                                                                                switch (i13) {
                                                                                                    case 19:
                                                                                                        if (cursor != null) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 85:
                                                                                                        break;
                                                                                                    case 114:
                                                                                                        break;
                                                                                                    case 436:
                                                                                                        C0228.m4391(cursor);
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            i14 = 1509673;
                                                                                            while (true) {
                                                                                                i14 ^= 1509690;
                                                                                                switch (i14) {
                                                                                                    case 19:
                                                                                                        if (sQLiteDatabase != null) {
                                                                                                            i14 = 1510417;
                                                                                                        }
                                                                                                        break;
                                                                                                    case 712:
                                                                                                        break;
                                                                                                    case 745:
                                                                                                        break;
                                                                                                    case 1323:
                                                                                                        C0160.m3061(sQLiteDatabase);
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                                i14 = 1510386;
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    C0420.m8245(C0455.m8871(C0029.m572(this)), C0405.m7937(m6537(), 276, C0050.f70 ^ 913, 1762), e);
                                                                    this.f9912d = true;
                                                                    int i41 = 55680;
                                                                    while (true) {
                                                                        i41 ^= 55697;
                                                                        switch (i41) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i41 = cursor != null ? 56424 : 56393;
                                                                                break;
                                                                            case 1467:
                                                                                break;
                                                                            case 1496:
                                                                                break;
                                                                            case 1529:
                                                                                C0228.m4391(cursor);
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    int i42 = 56455;
                                                                    while (true) {
                                                                        i42 ^= 56472;
                                                                        switch (i42) {
                                                                            case 31:
                                                                                i42 = sQLiteDatabase != null ? 56548 : 56517;
                                                                                break;
                                                                            case 62:
                                                                                break;
                                                                            case 93:
                                                                                i12 = i18;
                                                                                break;
                                                                            case 124:
                                                                                C0160.m3061(sQLiteDatabase);
                                                                                int i43 = 56579;
                                                                                while (true) {
                                                                                    i43 ^= 56596;
                                                                                    switch (i43) {
                                                                                        case 23:
                                                                                            i43 = 56610;
                                                                                            break;
                                                                                        case 54:
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                    i12 = i18;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    int i310 = (C0258.f337 ^ (-351)) + i19;
                                                                    i16 = 1509425;
                                                                    while (true) {
                                                                        i16 ^= 1509442;
                                                                        switch (i16) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 115:
                                                                                i16 = 1509456;
                                                                                break;
                                                                        }
                                                                    }
                                                                    i18 = i12;
                                                                    i19 = i310;
                                                                    break;
                                                                }
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            cursor = cursorM3501;
                                                            sQLiteDatabase = sQLiteDatabaseM9147;
                                                            i11 = 51588;
                                                            while (true) {
                                                                i11 ^= 51605;
                                                                switch (i11) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i11 = 51619;
                                                                        continue;
                                                                        continue;
                                                                    case 54:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                }
                                                                i13 = 1509549;
                                                                while (true) {
                                                                    i13 ^= 1509566;
                                                                    switch (i13) {
                                                                        case 19:
                                                                            if (cursor != null) {
                                                                            }
                                                                            break;
                                                                        case 85:
                                                                            break;
                                                                        case 114:
                                                                            break;
                                                                        case 436:
                                                                            C0228.m4391(cursor);
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                i14 = 1509673;
                                                                while (true) {
                                                                    i14 ^= 1509690;
                                                                    switch (i14) {
                                                                        case 19:
                                                                            if (sQLiteDatabase != null) {
                                                                                i14 = 1510417;
                                                                            }
                                                                            break;
                                                                        case 712:
                                                                            break;
                                                                        case 745:
                                                                            break;
                                                                        case 1323:
                                                                            C0160.m3061(sQLiteDatabase);
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                    }
                                                                    i14 = 1510386;
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            String strM9476 = C0487.m9476(m6537(), 100, C0177.f201 ^ 479, 3225);
                                            int i44 = 52611;
                                            while (true) {
                                                i44 ^= 52628;
                                                switch (i44) {
                                                    case 23:
                                                        i44 = jM7701 >= 100000 ? 52704 : 52673;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        break;
                                                    case 116:
                                                        C0135.m2604(C0455.m8871(C0029.m572(this)), C0442.m8618(m6537(), 108, C0328.f475 ^ (-819), 670));
                                                        long j10 = ((100001 + 20) - jM7701) - 20;
                                                        long jM4375 = C0228.m4375(sQLiteDatabaseM9147, strM9476, C0230.m4422(m6537(), 132, C0428.f698 ^ 434, 960), new String[]{C0180.m3442(j10)});
                                                        int i45 = 52735;
                                                        while (true) {
                                                            i45 ^= 52752;
                                                            switch (i45) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    break;
                                                                case 1007:
                                                                    i45 = jM4375 != j10 ? 53479 : 52797;
                                                                    break;
                                                                case 7927:
                                                                    C0238.m4564(C0455.m8871(C0029.m572(this)), C0151.m2908(m6537(), 196, C0413.f683 ^ (-842), 1493), C0439.m8554(j10), C0439.m8554(jM4375), C0439.m8554(((j10 + 29) - jM4375) - 29));
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
                                            C0402.m7862(sQLiteDatabaseM9147, strM9476, null, contentValues);
                                            C0435.m8501(sQLiteDatabaseM9147);
                                            C0320.m6188(sQLiteDatabaseM9147);
                                            int i46 = 53510;
                                            while (true) {
                                                i46 ^= 53527;
                                                switch (i46) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i46 = cursorM3501 != null ? 53603 : 53572;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 83:
                                                        break;
                                                    case 116:
                                                        C0228.m4391(cursorM3501);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            C0160.m3061(sQLiteDatabaseM9147);
                                            return true;
                                        } catch (SQLiteDatabaseLockedException e12) {
                                            int i47 = 1510448;
                                            while (true) {
                                                i47 ^= 1510465;
                                                switch (i47) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 113:
                                                        i47 = 1510479;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                cursorM3501 = null;
                                            }
                                        } catch (SQLiteFullException e13) {
                                            int i48 = 49790;
                                            while (true) {
                                                i48 ^= 49807;
                                                switch (i48) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 241:
                                                        i48 = 49821;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                cursor = null;
                                                e = e13;
                                            }
                                        } catch (SQLiteException e14) {
                                            e = e14;
                                            cursorM3501 = null;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            cursor = null;
                                            sQLiteDatabase = sQLiteDatabaseM9147;
                                            i15 = 48891;
                                            while (true) {
                                                i15 ^= 48908;
                                                switch (i15) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i15 = 48922;
                                                        continue;
                                                        continue;
                                                        continue;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                                i13 = 1509549;
                                                while (true) {
                                                    i13 ^= 1509566;
                                                    switch (i13) {
                                                        case 19:
                                                            if (cursor != null) {
                                                            }
                                                            break;
                                                        case 85:
                                                            break;
                                                        case 114:
                                                            break;
                                                        case 436:
                                                            C0228.m4391(cursor);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                i14 = 1509673;
                                                while (true) {
                                                    i14 ^= 1509690;
                                                    switch (i14) {
                                                        case 19:
                                                            if (sQLiteDatabase != null) {
                                                                i14 = 1510417;
                                                            }
                                                            break;
                                                        case 712:
                                                            break;
                                                        case 745:
                                                            break;
                                                        case 1323:
                                                            C0160.m3061(sQLiteDatabase);
                                                            break;
                                                        default:
                                                            continue;
                                                            continue;
                                                            continue;
                                                            continue;
                                                            continue;
                                                            continue;
                                                    }
                                                    i14 = 1510386;
                                                }
                                                throw th;
                                            }
                                        }
                                        break;
                                    case 47417:
                                        this.f9912d = true;
                                        int i49 = 48767;
                                        while (true) {
                                            i49 ^= 48784;
                                            switch (i49) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    break;
                                                case 76:
                                                    C0160.m3061(sQLiteDatabaseM9147);
                                                    break;
                                                case 239:
                                                    i49 = sQLiteDatabaseM9147 != null ? 48860 : 48829;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        return false;
                                    case 47483:
                                        break;
                                    default:
                                        break;
                                }
                            }
                        } catch (SQLiteDatabaseLockedException e15) {
                            sQLiteDatabaseM9147 = null;
                            cursorM3501 = null;
                        } catch (SQLiteFullException e16) {
                            e = e16;
                            sQLiteDatabaseM9147 = null;
                            cursor = null;
                        } catch (SQLiteException e17) {
                            e = e17;
                            cursor = null;
                            sQLiteDatabase = null;
                        } catch (Throwable th6) {
                            th = th6;
                            sQLiteDatabase = null;
                            int i50 = 53758;
                            while (true) {
                                i50 ^= 53775;
                                switch (i50) {
                                    case 1009:
                                        i50 = 54440;
                                        continue;
                                    case 1703:
                                        break;
                                    default:
                                        continue;
                                }
                                i13 = 1509549;
                                while (true) {
                                    i13 ^= 1509566;
                                    switch (i13) {
                                        case 19:
                                            if (cursor != null) {
                                            }
                                            break;
                                        case 85:
                                            break;
                                        case 114:
                                            break;
                                        case 436:
                                            C0228.m4391(cursor);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                i14 = 1509673;
                                while (true) {
                                    i14 ^= 1509690;
                                    switch (i14) {
                                        case 19:
                                            if (sQLiteDatabase != null) {
                                                i14 = 1510417;
                                            }
                                            break;
                                        case 712:
                                            break;
                                        case 745:
                                            break;
                                        case 1323:
                                            C0160.m3061(sQLiteDatabase);
                                            break;
                                        default:
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                    }
                                    i14 = 1510386;
                                }
                                throw th;
                            }
                        }
                        i18 = i12;
                        i19 = i310;
                    }
                    break;
                default:
                    continue;
            }
            i17 = 1678;
        }
    }

    public final void x() {
        C0040.m791(this);
        try {
            SQLiteDatabase sQLiteDatabaseM9147 = C0470.m9147(this);
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i10 = sQLiteDatabaseM9147 != null ? 1709 : 1678;
                        break;
                    case 204:
                        int iM4375 = C0228.m4375(sQLiteDatabaseM9147, C0457.m8898(m6537(), 392, C0161.f185 ^ (-782), 2956), null, null);
                        int i11 = 1740;
                        while (true) {
                            i11 ^= 1757;
                            switch (i11) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = iM4375 > 0 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    C0420.m8245(C0136.m2634(C0029.m572(this)), C0485.m9421(m6537(), 400, C0228.f307 ^ (-941), 1937), C0057.m1083(iM4375));
                                    int i12 = 1864;
                                    while (true) {
                                        i12 ^= 1881;
                                        switch (i12) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i12 = 48674;
                                                continue;
                                            case 47483:
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
                        break;
                    default:
                        break;
                }
                return;
            }
            int iM7309 = C0373.m7309();
            int i13 = 48891;
            while (true) {
                i13 ^= 48908;
                switch (i13) {
                    case 22:
                        break;
                    case 53:
                        return;
                    case 503:
                        if (iM7309 >= 0) {
                            i13 = 49635;
                        }
                        break;
                    case 32495:
                        System.out.println(Float.valueOf(C0476.m9264("cSs3tC43DO")));
                        return;
                    default:
                        continue;
                }
                i13 = 48953;
            }
        } catch (SQLiteException e4) {
            int i14 = 48767;
            while (true) {
                i14 ^= 48784;
                switch (i14) {
                    case Code.UNAVAILABLE /* 14 */:
                        C0420.m8245(C0455.m8871(C0029.m572(this)), C0320.m6192(m6537(), 435, C0431.f701 ^ 1013, 1024), e4);
                        return;
                    case 239:
                        i14 = 48798;
                        break;
                }
            }
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:143:0x009f */
    /* JADX WARN: Code duplicated, block: B:208:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x017d A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x00a5 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:112:0x01b7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x00ba. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:67:0x00dc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x0171. Please report as an issue. */
    public final boolean y() throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabaseM9147;
        int i10;
        int i11;
        int i12;
        String strM8629 = C0443.m8629(m6537(), 478, C0164.f188 ^ 430, 463);
        C0040.m791(this);
        boolean zM5652 = C0294.m5652(this);
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM5652) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    return false;
                case 239:
                    boolean zM5755 = C0300.m5755(C0487.m9471(C0277.m5311(this), C0211.m4027(m6537(), 529, C0332.f479 ^ 280, 2422)));
                    int i14 = 1740;
                    while (true) {
                        i14 ^= 1757;
                        switch (i14) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM5755) {
                                    i14 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                int i15 = 5;
                                int i16 = 0;
                                while (true) {
                                    int i17 = 1864;
                                    while (true) {
                                        i17 ^= 1881;
                                        switch (i17) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i17 = i16 < 5 ? 48736 : 48705;
                                                break;
                                            case 47384:
                                                C0135.m2604(C0331.m6385(C0029.m572(this)), C0089.m1913(m6537(), 577, C0323.f470 ^ 57, 2859));
                                                return false;
                                            case 47417:
                                                break;
                                            case 47483:
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    try {
                                        sQLiteDatabaseM9147 = C0470.m9147(this);
                                        int i18 = 48767;
                                        while (true) {
                                            i18 ^= 48784;
                                            try {
                                                switch (i18) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        C0348.m6794(sQLiteDatabaseM9147);
                                                        C0228.m4375(sQLiteDatabaseM9147, C0468.m9100(m6537(), 560, C0381.f651 ^ (-716), 1533), C0019.m390(m6537(), 568, C0131.f157 ^ (-866), 2044), new String[]{C0068.m1323(C0343.f613 ^ 58)});
                                                        C0435.m8501(sQLiteDatabaseM9147);
                                                        C0320.m6188(sQLiteDatabaseM9147);
                                                        C0160.m3061(sQLiteDatabaseM9147);
                                                        return true;
                                                    case 76:
                                                        this.f9912d = true;
                                                        int i19 = 48891;
                                                        while (true) {
                                                            i19 ^= 48908;
                                                            switch (i19) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    return false;
                                                                case 503:
                                                                    if (sQLiteDatabaseM9147 != null) {
                                                                        i19 = 49635;
                                                                    }
                                                                    break;
                                                                case 32495:
                                                                    C0160.m3061(sQLiteDatabaseM9147);
                                                                    return false;
                                                                default:
                                                                    continue;
                                                            }
                                                            i19 = 48953;
                                                        }
                                                        break;
                                                    case 239:
                                                        i18 = sQLiteDatabaseM9147 == null ? 48860 : 48829;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            } catch (SQLiteDatabaseLockedException e4) {
                                                try {
                                                    C0472.m9182(i15);
                                                    i15 += C0324.f471 ^ (-962);
                                                    int i20 = 51836;
                                                    while (true) {
                                                        i20 ^= 51853;
                                                        switch (i20) {
                                                            case 241:
                                                                i20 = sQLiteDatabaseM9147 != null ? 52580 : 52549;
                                                                break;
                                                            case 1963:
                                                                break;
                                                            case 1992:
                                                                break;
                                                            case 2025:
                                                                C0160.m3061(sQLiteDatabaseM9147);
                                                                int i21 = 52611;
                                                                while (true) {
                                                                    i21 ^= 52628;
                                                                    switch (i21) {
                                                                        case 23:
                                                                            i21 = 52642;
                                                                            break;
                                                                        case 54:
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
                                                    }
                                                    i16 += C0065.f85 ^ 669;
                                                    i12 = 53510;
                                                    while (true) {
                                                        i12 ^= 53527;
                                                        switch (i12) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i12 = 53541;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    sQLiteDatabase = sQLiteDatabaseM9147;
                                                    i10 = 49666;
                                                    while (true) {
                                                        i10 ^= 49683;
                                                        switch (i10) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i10 = 49697;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                i11 = 53634;
                                                                while (true) {
                                                                    i11 ^= 53651;
                                                                    switch (i11) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i11 = sQLiteDatabase != null ? 53727 : 53696;
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 76:
                                                                            C0160.m3061(sQLiteDatabase);
                                                                            break;
                                                                        case 83:
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                throw th;
                                                        }
                                                    }
                                                }
                                            } catch (SQLiteFullException e10) {
                                                e = e10;
                                                int i22 = 49914;
                                                while (true) {
                                                    i22 ^= 49931;
                                                    switch (i22) {
                                                        case 497:
                                                            i22 = 50596;
                                                            break;
                                                        case 1711:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    C0420.m8245(C0455.m8871(C0029.m572(this)), strM8629, e);
                                                    this.f9912d = true;
                                                    int i23 = 52735;
                                                    while (true) {
                                                        i23 ^= 52752;
                                                        switch (i23) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                break;
                                                            case 1007:
                                                                i23 = sQLiteDatabaseM9147 != null ? 53479 : 52797;
                                                                break;
                                                            case 7927:
                                                                C0160.m3061(sQLiteDatabaseM9147);
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    i16 += C0065.f85 ^ 669;
                                                    i12 = 53510;
                                                    while (true) {
                                                        i12 ^= 53527;
                                                        switch (i12) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i12 = 53541;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                        }
                                                    }
                                                }
                                            } catch (SQLiteException e11) {
                                                e = e11;
                                                int i24 = 49790;
                                                while (true) {
                                                    i24 ^= 49807;
                                                    switch (i24) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 241:
                                                            i24 = 49821;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    int i25 = 50689;
                                                    while (true) {
                                                        i25 ^= 50706;
                                                        switch (i25) {
                                                            case 19:
                                                                i25 = sQLiteDatabaseM9147 != null ? 50782 : 50751;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 76:
                                                                boolean zM3035 = C0159.m3035(sQLiteDatabaseM9147);
                                                                int i26 = 50813;
                                                                while (true) {
                                                                    i26 ^= 50830;
                                                                    switch (i26) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case 53:
                                                                            break;
                                                                        case 243:
                                                                            i26 = zM3035 ? 51557 : 50875;
                                                                            break;
                                                                        case 4075:
                                                                            C0320.m6188(sQLiteDatabaseM9147);
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
                                                    C0420.m8245(C0455.m8871(C0029.m572(this)), strM8629, e);
                                                    this.f9912d = true;
                                                    int i27 = 51588;
                                                    while (true) {
                                                        i27 ^= 51605;
                                                        switch (i27) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i27 = sQLiteDatabaseM9147 != null ? 51681 : 51650;
                                                                break;
                                                            case 54:
                                                                break;
                                                            case 87:
                                                                break;
                                                            case 116:
                                                                C0160.m3061(sQLiteDatabaseM9147);
                                                                int i28 = 51712;
                                                                while (true) {
                                                                    i28 ^= 51729;
                                                                    switch (i28) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case 15:
                                                                        case Code.UNAUTHENTICATED /* 16 */:
                                                                        default:
                                                                            break;
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i28 = 51743;
                                                                            break;
                                                                    }
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    i16 += C0065.f85 ^ 669;
                                                    i12 = 53510;
                                                    while (true) {
                                                        i12 ^= 53527;
                                                        switch (i12) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i12 = 53541;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (SQLiteDatabaseLockedException e12) {
                                        sQLiteDatabaseM9147 = null;
                                    } catch (SQLiteFullException e13) {
                                        e = e13;
                                        sQLiteDatabaseM9147 = null;
                                    } catch (SQLiteException e14) {
                                        e = e14;
                                        sQLiteDatabaseM9147 = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteDatabase = null;
                                        i10 = 49666;
                                        while (true) {
                                            i10 ^= 49683;
                                            switch (i10) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i10 = 49697;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    i11 = 53634;
                                                    while (true) {
                                                        i11 ^= 53651;
                                                        switch (i11) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                if (sQLiteDatabase != null) {
                                                                }
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 76:
                                                                C0160.m3061(sQLiteDatabase);
                                                                break;
                                                            case 83:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    throw th;
                                            }
                                        }
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return false;
                            default:
                                continue;
                        }
                        i14 = 1802;
                    }
                    break;
                default:
                    continue;
            }
            i13 = 1678;
        }
    }

    public final SQLiteDatabase z() {
        boolean zM5652 = C0294.m5652(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM5652) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return null;
                case 239:
                    SQLiteDatabase sQLiteDatabaseM2365 = C0123.m2365(C0406.m7947(this));
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (sQLiteDatabaseM2365 == null) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return sQLiteDatabaseM2365;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                this.f9912d = true;
                                return null;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
