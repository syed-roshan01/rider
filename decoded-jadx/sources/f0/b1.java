package f0;

import a.C0002;
import android.support.v4.app.C0014;
import androidx.appcompat.widget.C0020;
import androidx.compose.ui.graphics.C0030;
import androidx.compose.ui.input.key.C0033;
import androidx.compose.ui.input.pointer.C0034;
import androidx.core.content.C0041;
import b1.C0050;
import c4.C0066;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0211;
import d1.C0213;
import d7.C0220;
import dagger.hilt.android.components.C0228;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.C0253;
import e2.C0262;
import f4.C0274;
import fa.C0279;
import h7.C0310;
import h7.C0311;
import m4.C0353;
import n9.C0366;
import o7.i2;
import q1.C0383;
import q5.C0385;
import s.C0407;
import s3.C0412;
import s6.C0413;
import u7.C0437;
import v0.C0440;
import v5.C0445;
import z0.C0482;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5616d;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f352short = {3103, 3121, 3117, 3126, 3131, 3125, 3110, 3120, 3099, 3108, 3104, 3133, 3131, 3130, 3111, 3196, 3127, 3125, 3108, 3133, 3104, 3125, 3128, 3133, 3118, 3125, 3104, 3133, 3131, 3130, 3177, 2331, 2327, 2390, 2370, 2371, 2392, 2420, 2392, 2373, 2373, 2386, 2388, 2371, 2314, 1720, 1716, 1791, 1777, 1773, 1782, 1787, 1781, 1766, 1776, 1728, 1773, 1764, 1777, 1705, 1009, 1021, 948, 944, 952, 924, 958, 937, 948, 946, 947, 992, 1474, 1486, 1438, 1410, 1423, 1434, 1416, 1409, 1436, 1411, 1447, 1411, 1419, 1441, 1438, 1434, 1415, 1409, 1408, 1437, 1491, 1408, 1435, 1410, 1410, 1479};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b1 f5612e = new b1(0, C0122.f148 ^ (-41));

    public b1(int i10, int i11) {
        boolean z10;
        int i12 = 1;
        int i13 = C0274.f390;
        int i14 = 1616;
        while (true) {
            i14 ^= 1633;
            switch (i14) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i14 = ((i13 ^ SQLitePersistence.MAX_ARGS) & i11) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i15 = 1740;
                    while (true) {
                        i15 ^= 1757;
                        switch (i15) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = 1771;
                                break;
                            case 54:
                                z10 = true;
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
        int i16 = C0353.f624;
        int i17 = 1864;
        while (true) {
            i17 ^= 1881;
            switch (i17) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i17 = ((i16 ^ 893) & i11) != 0 ? 48736 : 48705;
                    break;
                case 47384:
                    break;
                case 47417:
                    i10 = 1;
                    break;
                case 47483:
                    break;
                default:
                    break;
            }
        }
        int i18 = C0407.f678;
        int i19 = 48767;
        while (true) {
            i19 ^= 48784;
            switch (i19) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    i12 = 0;
                    break;
                case 76:
                    int i20 = 48891;
                    while (true) {
                        i20 ^= 48908;
                        switch (i20) {
                            case 22:
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
                    i19 = ((i18 ^ (-486)) & i11) != 0 ? 48860 : 48829;
                    break;
                default:
                    break;
            }
        }
        this.f5613a = 0;
        this.f5614b = z10;
        this.f5615c = i10;
        this.f5616d = i12;
        int iM667 = C0034.m667();
        int i21 = 49666;
        while (true) {
            i21 ^= 49683;
            switch (i21) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM667 <= 0) {
                        i21 = 49759;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    System.out.println(Double.parseDouble(C0041.m808("PdDUXLF8t5KNbmI8hB")));
                    return;
                case 83:
                    return;
                default:
                    continue;
            }
            i21 = 49728;
        }
    }

    /* JADX INFO: renamed from: ۟۟ۨۤۥ, reason: not valid java name and contains not printable characters */
    public static short[] m5180() {
        int iM2355 = C0122.m2355();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2355 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f352short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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

    public final boolean equals(Object obj) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (this == obj) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return true;
                case 239:
                    boolean z10 = obj instanceof b1;
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!z10) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                b1 b1Var = (b1) obj;
                                boolean zM4031 = C0211.m4031(C0262.m5012(this), C0262.m5012(b1Var));
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (!zM4031) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            boolean zM7507 = C0383.m7507(this);
                                            boolean zM7508 = C0383.m7507(b1Var);
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        boolean zM7188 = C0366.m7188(C0311.m6016(this), C0311.m6016(b1Var));
                                                        int i14 = 48891;
                                                        while (true) {
                                                            i14 ^= 48908;
                                                            switch (i14) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    boolean zM9385 = C0482.m9385(C0020.m403(this), C0020.m403(b1Var));
                                                                    int i15 = 49666;
                                                                    while (true) {
                                                                        i15 ^= 49683;
                                                                        switch (i15) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (!zM9385) {
                                                                                    i15 = 49759;
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 76:
                                                                                return false;
                                                                            case 83:
                                                                                C0014.m280(b1Var);
                                                                                boolean zM4399 = C0228.m4399(null, null);
                                                                                int i16 = 49790;
                                                                                while (true) {
                                                                                    i16 ^= 49807;
                                                                                    switch (i16) {
                                                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 51:
                                                                                            return true;
                                                                                        case 84:
                                                                                            return false;
                                                                                        case 241:
                                                                                            if (!zM4399) {
                                                                                                i16 = 49883;
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    i16 = 49852;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i15 = 49728;
                                                                    }
                                                                    break;
                                                                case 503:
                                                                    if (!zM7188) {
                                                                        i14 = 49635;
                                                                    }
                                                                    break;
                                                                case 32495:
                                                                    return false;
                                                                default:
                                                                    continue;
                                                            }
                                                            i14 = 48953;
                                                        }
                                                        break;
                                                    case 76:
                                                        return false;
                                                    case 239:
                                                        if (zM7507 != zM7508) {
                                                            i13 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i13 = 48829;
                                            }
                                            break;
                                        case 47417:
                                            return false;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i12 = 48705;
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return false;
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

    public final int hashCode() {
        String str = "\u06e0\u06e3\u06e0";
        boolean zM7507 = false;
        int i10 = 0;
        int iM7548 = 0;
        int iM7549 = 0;
        int iM403 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56319:
                    str = "\u06e6\u06e2\u06df";
                    iM7549 = C0445.m8688(zM7507, iM403, i10);
                    break;
                case 1746968:
                    zM7507 = C0383.m7507(this);
                    str = "\u06e0\u06df";
                    break;
                case 1747773:
                    str = "\u06e8\u06e3\u06e8";
                    iM403 = C0262.m5012(this);
                    break;
                case 1747873:
                    str = "\u06e1\u06e2";
                    iM403 = C0020.m403(this);
                    break;
                case 1748679:
                    str = "\u06e3\u06e6\u06e2";
                    i10 = iM403 ^ 939;
                    break;
                case 1750751:
                    str = "\u06df\u06e8\u06e1";
                    iM403 = iM7549 * i10;
                    break;
                case 1752609:
                    str = "\u06e1\u06e1\u06e7";
                    iM403 = C0050.f70;
                    break;
                case 1753479:
                    str = "\u06e0\u06e6\u06e7";
                    iM7548 = C0385.m7548(iM403, iM7549, i10);
                    break;
                case 1753507:
                    str = "\u06e6\u06e1\u06e2";
                    iM403 = C0311.m6016(this);
                    break;
                case 1754660:
                    return iM7549;
                case 1755469:
                    str = "\u06e5\u06e4\u06e0";
                    iM7549 = C0279.m5411(iM403);
                    break;
                default:
                    str = "\u06e7\u06e8\u06e5";
                    iM7549 = C0385.m7548(iM403, iM7548, i10);
                    break;
            }
        }
    }

    public final String toString() {
        String str = "\u06e5\u06e4\u06e4";
        StringBuilder sb = null;
        short[] sArrM5180 = null;
        String strM8092 = null;
        boolean zM7507 = false;
        int iM6016 = 0;
        int iM403 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56295:
                    C0030.m585(sb, zM7507);
                    str = "\u06df\u06e6\u06e0";
                    sArrM5180 = m5180();
                    break;
                case 56325:
                    String strM45 = C0002.m45(sArrM5180, 45, iM403, 1684);
                    C0142.m2728(sb, strM45);
                    str = "\u06e2\u06df\u06e7";
                    strM8092 = strM45;
                    break;
                case 1746905:
                    iM6016 = C0066.f86;
                    iM403 = iM6016 ^ (-215);
                    str = "\u06e0\u06e5";
                    break;
                case 1747936:
                    String strM6008 = C0310.m6008(iM403);
                    C0213.m4074(sb, strM6008);
                    str = "\u06e7\u06e7\u06df";
                    strM8092 = strM6008;
                    break;
                case 1749578:
                    iM6016 = C0311.m6016(this);
                    str = "\u06e3\u06df\u06e5";
                    strM8092 = C0437.m8539(iM6016);
                    break;
                case 1749672:
                    C0213.m4074(sb, strM8092);
                    str = "\u06e3\u06e0\u06e7";
                    sArrM5180 = m5180();
                    break;
                case 1749764:
                    C0142.m2728(sb, strM8092);
                    zM7507 = C0383.m7507(this);
                    str = "\u06df\u06e6";
                    break;
                case 1750537:
                    C0213.m4074(sb, strM8092);
                    str = "\u06e3\u06e4\u06e0";
                    sArrM5180 = m5180();
                    break;
                case 1750570:
                    iM6016 = C0220.f300;
                    iM403 = iM6016 ^ (-103);
                    str = "\u06e6\u06e1\u06e7";
                    break;
                case 1750687:
                    iM403 = C0244.f324;
                    iM6016 = iM403 ^ 520;
                    str = "\u06df\u06e5\u06e1";
                    break;
                case 1750757:
                    iM403 = C0020.m403(this);
                    str = "\u06e2\u06e2\u06e8";
                    strM8092 = C0412.m8092(iM403);
                    break;
                case 1751779:
                    return C0440.m8605(sb);
                case 1752490:
                    sb = new StringBuilder(strM8092);
                    iM403 = C0262.m5012(this);
                    str = "\u06e0\u06e8\u06e8";
                    break;
                case 1752613:
                    short[] sArrM5181 = m5180();
                    iM403 = C0129.f155;
                    str = "\u06e6\u06e5\u06df";
                    sArrM5180 = sArrM5181;
                    break;
                case 1753484:
                    String strM3223 = C0168.m3223(sArrM5180, 72, iM403, 1518);
                    C0142.m2728(sb, strM3223);
                    str = "\u06e4\u06e8\u06e7";
                    strM8092 = strM3223;
                    break;
                case 1753600:
                    iM6016 = iM403 ^ 751;
                    str = "\u06e5\u06e0\u06e5";
                    strM8092 = C0413.m8108(sArrM5180, 0, iM6016, 3156);
                    break;
                case 1754565:
                    iM403 = iM6016 ^ (-238);
                    str = "\u06e2\u06e5\u06e7";
                    strM8092 = C0228.m4396(sArrM5180, 31, iM403, 2359);
                    break;
                case 1754623:
                    short[] sArrM5182 = m5180();
                    iM6016 = C0033.f53;
                    str = "\u06e7\u06e5\u06e3";
                    sArrM5180 = sArrM5182;
                    break;
                default:
                    String strM4839 = C0253.m4839(sArrM5180, 60, iM6016, 989);
                    C0142.m2728(sb, strM4839);
                    str = "\u06e3\u06e6\u06e8";
                    strM8092 = strM4839;
                    break;
            }
        }
    }
}
