package g5;

import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0228;
import dagger.hilt.components.C0243;
import e1.C0257;
import e1.C0258;
import g.C0283;
import k2.C0333;
import k8.C0338;
import o7.i2;
import r4.C0398;
import r6.C0402;
import t2.C0422;
import u.C0429;
import u1.C0432;
import v0.C0441;
import w2.C0458;
import x7.C0472;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f435short = {2154, 2119, 2120, 2113, 2131, 2119, 2113, 2115, 2159, 2130, 2115, 2123, 2062, 2117, 2121, 2114, 2115, 2075, 1123, 1135, 1057, 1070, 1058, 1066, 1138, 2955, 2951, 3017, 3014, 3027, 3022, 3025, 3010, 3049, 3014, 3018, 3010, 2970, 1127};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6615c;

    public a(String str, String str2, String str3) {
        this.f6613a = str;
        this.f6614b = str2;
        this.f6615c = str3;
        int iM7797 = C0398.m7797();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7797 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0283.m5463("UsocAObNnjFeyCGFu")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟۟۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static short[] m5584() {
        int iM4678 = C0243.m4678();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4678 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f435short;
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
                    boolean z10 = obj instanceof a;
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
                                a aVar = (a) obj;
                                boolean zM4399 = C0228.m4399(C0402.m7887(this), C0402.m7887(aVar));
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (!zM4399) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            boolean zM43910 = C0228.m4399(C0472.m9205(this), C0472.m9205(aVar));
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        boolean zM43911 = C0228.m4399(C0441.m8608(this), C0441.m8608(aVar));
                                                        int i14 = 48891;
                                                        while (true) {
                                                            i14 ^= 48908;
                                                            switch (i14) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    return true;
                                                                case 503:
                                                                    if (!zM43911) {
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
                                                        if (!zM43910) {
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
        String strM9205 = null;
        String str = "\u06e1\u06e6\u06e1";
        int iM8923 = 0;
        int i10 = 0;
        int iM8418 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746943:
                    str = "\u06e3\u06e6\u06e3";
                    i10 = iM8418 + 11;
                    break;
                case 1747778:
                    str = "\u06e7\u06e0\u06df";
                    iM8418 = iM8923 * i10;
                    break;
                case 1747933:
                    strM9205 = C0441.m8608(this);
                    str = "\u06e6\u06e7\u06e7";
                    break;
                case 1748679:
                    str = "\u06e5\u06e4\u06e0";
                    i10 = iM8418 - 11;
                    break;
                case 1748828:
                    strM9205 = C0402.m7887(this);
                    str = "\u06e8\u06e0\u06e5";
                    break;
                case 1749824:
                    iM8923 = C0458.m8923(strM9205, iM8418, i10);
                    str = "\u06e0\u06e8\u06e5";
                    break;
                case 1750752:
                    return i10;
                case 1752609:
                    str = "\u06df\u06e7\u06e7";
                    iM8418 = i10 + iM8923;
                    break;
                case 1753670:
                    str = "\u06e1\u06e1\u06e7";
                    iM8418 = C0429.m8418(strM9205);
                    break;
                case 1754406:
                    strM9205 = C0472.m9205(this);
                    str = "\u06e2\u06e7\u06e5";
                    break;
                case 1755373:
                    iM8923 = C0429.m8418(strM9205);
                    str = "\u06e8\u06e7\u06e3";
                    break;
                case 1755588:
                    str = "\u06e0\u06e8\u06e7";
                    iM8418 = C0100.f126;
                    break;
                default:
                    str = "\u06e0\u06e3\u06e5";
                    i10 = iM8418 ^ (-551);
                    break;
            }
        }
    }

    public final String toString() {
        String str = "\u06e1\u06e3\u06e3";
        StringBuilder sb = null;
        String strM6651 = null;
        String strM4942 = null;
        short[] sArrM5584 = null;
        String strM2437 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56289:
                    i11 = C0333.f517;
                    str = "\u06e7\u06e3";
                    break;
                case 56297:
                    C0142.m2728(sb, strM2437);
                    str = "\u06e4\u06e4";
                    break;
                case 56448:
                    str = "\u06df\u06df\u06e6";
                    sArrM5584 = m5584();
                    break;
                case 56483:
                    sb = new StringBuilder(strM2437);
                    str = "\u06e4\u06e2\u06e1";
                    break;
                case 56514:
                    C0142.m2728(sb, strM2437);
                    str = "\u06e1\u06e7\u06e4";
                    break;
                case 56540:
                    i10 = i11 ^ 792;
                    str = "\u06e4\u06e5\u06e8";
                    break;
                case 1746694:
                    i11 = C0432.f703;
                    str = "\u06e6\u06e6\u06e7";
                    break;
                case 1747932:
                    str = "\u06e6\u06e8";
                    strM2437 = C0422.m8293(sArrM5584, 18, i10, 1103);
                    break;
                case 1748672:
                    i11 = C0257.f337;
                    str = "\u06e4\u06e6\u06e2";
                    break;
                case 1748674:
                    str = "\u06e1\u06e1\u06e0";
                    sArrM5584 = m5584();
                    break;
                case 1748737:
                    str = "\u06df\u06e0";
                    sArrM5584 = m5584();
                    break;
                case 1748862:
                    str = "\u06df\u06e8";
                    strM2437 = C0472.m9205(this);
                    break;
                case 1749634:
                    C0142.m2728(sb, strM2437);
                    str = "\u06e5\u06e8\u06df";
                    break;
                case 1751587:
                    str = "\u06e8\u06e8";
                    strM2437 = C0402.m7887(this);
                    break;
                case 1751594:
                    str = "\u06e8\u06e5\u06df";
                    sArrM5584 = m5584();
                    break;
                case 1751650:
                    return strM4942;
                case 1751687:
                    str = "\u06e5\u06e8";
                    strM2437 = C0126.m2437(sArrM5584, 0, i10, 2086);
                    break;
                case 1751712:
                    i10 = i11 ^ (-345);
                    str = "\u06e0\u06e8\u06e4";
                    break;
                case 1752732:
                    str = "\u06e4\u06e2\u06e8";
                    strM2437 = C0441.m8608(this);
                    break;
                case 1753639:
                    i10 = i11 ^ 512;
                    str = "\u06e8\u06e1\u06e1";
                    break;
                case 1754624:
                    str = "\u06e4\u06e4\u06e2";
                    strM4942 = C0258.m4942(sb, strM2437, strM6651);
                    break;
                case 1755400:
                    str = "\u06e2\u06e1\u06e1";
                    strM2437 = C0175.m3335(sArrM5584, 25, i10, 2983);
                    break;
                case 1755522:
                    str = "\u06e7\u06e7\u06e0";
                    strM6651 = C0338.m6651(sArrM5584, 38, 1, 1102);
                    break;
                default:
                    C0142.m2728(sb, strM2437);
                    str = "\u06e1\u06e1\u06e2";
                    break;
            }
        }
    }
}
