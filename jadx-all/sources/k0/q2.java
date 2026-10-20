package k0;

import b4.C0052;
import c1.C0058;
import c4.C0065;
import c6.C0067;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.internal.tasks.C0103;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.inject.C0172;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.ktx.C0199;
import d1.C0214;
import d1.C0215;
import d9.C0226;
import dagger.hilt.android.components.C0229;
import e2.C0262;
import h1.C0301;
import h3.C0304;
import l3.C0343;
import m7.C0357;
import o1.C0368;
import q7.C0391;
import s.C0409;
import t2.C0423;
import t8.C0427;
import v0.C0441;
import v0.C0444;
import y.C0476;
import y6.C0478;
import z0.C0483;
import z7.C0489;

/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f501short = {269, 310, 319, 302, 315, 301, 374, 315, 294, 298, 300, 319, 269, 307, 319, 306, 306, 355, 2541, 2529, 2482, 2476, 2464, 2477, 2477, 2556, 2675, 2687, 2610, 2618, 2619, 2614, 2602, 2610, 2658, 1864, 1860, 1800, 1797, 1814, 1795, 1793, 1881, 1539, 1551, 1610, 1623, 1627, 1629, 1614, 1635, 1614, 1629, 1608, 1610, 1554};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0.a f9389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0.a f9390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0.a f9391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0.a f9392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0.a f9393e;

    public q2() {
        e0.e eVarM1307 = C0067.m1307();
        e0.e eVarM2023 = C0103.m2023();
        e0.e eVarM9252 = C0476.m9252();
        e0.e eVarM9387 = C0483.m9387();
        e0.e eVarM2018 = C0103.m2018();
        this.f9389a = eVarM1307;
        this.f9390b = eVarM2023;
        this.f9391c = eVarM9252;
        this.f9392d = eVarM9387;
        this.f9393e = eVarM2018;
        int iM9312 = C0478.m9312();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9312 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0065.m1250("T0481pUmAd")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static short[] m6430() {
        int iM7643 = C0391.m7643();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7643 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f501short;
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
                    boolean z10 = obj instanceof q2;
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!z10) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                q2 q2Var = (q2) obj;
                                boolean zM4399 = C0229.m4399(C0301.m5792(this), C0301.m5792(q2Var));
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (!zM4399) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            boolean zM43910 = C0229.m4399(C0489.m9517(this), C0489.m9517(q2Var));
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        boolean zM43911 = C0229.m4399(C0409.m8016(this), C0409.m8016(q2Var));
                                                        int i14 = 48891;
                                                        while (true) {
                                                            i14 ^= 48908;
                                                            switch (i14) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    boolean zM43912 = C0229.m4399(C0058.m1101(this), C0058.m1101(q2Var));
                                                                    int i15 = 49666;
                                                                    while (true) {
                                                                        i15 ^= 49683;
                                                                        switch (i15) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (!zM43912) {
                                                                                    i15 = 49759;
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 76:
                                                                                return false;
                                                                            case 83:
                                                                                boolean zM43913 = C0229.m4399(C0343.m6713(this), C0343.m6713(q2Var));
                                                                                int i16 = 49790;
                                                                                while (true) {
                                                                                    i16 ^= 49807;
                                                                                    switch (i16) {
                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 51:
                                                                                            return true;
                                                                                        case 84:
                                                                                            return false;
                                                                                        case 241:
                                                                                            if (!zM43913) {
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
        e0.a aVarM9517 = null;
        String str = "۠۟ۦ";
        int i10 = 0;
        int iM2842 = 0;
        int iM2843 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56355:
                    aVarM9517 = C0409.m8016(this);
                    str = "ۨۥۦ";
                    break;
                case 56420:
                    str = "ۡۥۦ";
                    iM2842 = i10 ^ (-576);
                    break;
                case 56543:
                    str = "ۡۥۧ";
                    iM2843 = 0 - iM2842;
                    break;
                case 56573:
                    aVarM9517 = C0489.m9517(this);
                    str = "ۨۢۢ";
                    break;
                case 1746724:
                    i10 = iM2842 * iM2843;
                    str = "ۡۤ";
                    break;
                case 1746781:
                    str = "۠ۥۧ";
                    iM2842 = iM2843 + 9;
                    break;
                case 1746880:
                    aVarM9517 = C0058.m1101(this);
                    str = "ۦۣۥ";
                    break;
                case 1747655:
                    aVarM9517 = C0301.m5792(this);
                    str = "ۣۢۤ";
                    break;
                case 1747842:
                    i10 = C0444.f714;
                    str = "ۦۨ";
                    break;
                case 1747898:
                    i10 = C0111.f137;
                    str = "ۣۣۥ";
                    break;
                case 1748671:
                    str = "ۣۨۡ";
                    iM2843 = iM2842 + i10;
                    break;
                case 1748679:
                    str = "۟ۢ۠";
                    iM2843 = iM2842 + i10;
                    break;
                case 1748802:
                    i10 = iM2843 * iM2842;
                    str = "۟ۥۦ";
                    break;
                case 1748803:
                    i10 = C0368.f638;
                    str = "ۣۧ";
                    break;
                case 1749702:
                    i10 = iM2843 * iM2842;
                    str = "ۨۥ";
                    break;
                case 1749856:
                    str = "ۡۡ۟";
                    iM2842 = iM2843 - 16;
                    break;
                case 1750629:
                    str = "ۥۢۤ";
                    iM2843 = C0148.m2842(aVarM9517);
                    break;
                case 1750661:
                    str = "ۦ۟ۨ";
                    iM2843 = i10 ^ (-800);
                    break;
                case 1750663:
                    return i10;
                case 1750787:
                    str = "ۥۤۨ";
                    iM2843 = 0 - iM2842;
                    break;
                case 1750788:
                    i10 = iM2842 - iM2843;
                    str = "ۣۣۧ";
                    break;
                case 1750812:
                    str = "۠ۧۡ";
                    iM2842 = iM2843 + 16;
                    break;
                case 1751684:
                    str = "ۤۦۥ";
                    iM2842 = C0148.m2842(aVarM9517);
                    break;
                case 1751715:
                    str = "ۣۧۨ";
                    iM2843 = 0 - i10;
                    break;
                case 1752551:
                    i10 = C0172.f196;
                    str = "ۦۡ۟";
                    break;
                case 1752617:
                    str = "ۧۦ";
                    iM2842 = iM2843 - i10;
                    break;
                case 1753423:
                    i10 = iM2842 * iM2843;
                    str = "ۦۣۡ";
                    break;
                case 1753476:
                    str = "ۣۢۧ";
                    iM2842 = i10 ^ 319;
                    break;
                case 1753507:
                    str = "ۡۡۧ";
                    iM2842 = iM2843 - 9;
                    break;
                case 1753540:
                    aVarM9517 = C0343.m6713(this);
                    str = "ۤۥۥ";
                    break;
                case 1753544:
                    str = "ۢۨۦ";
                    iM2843 = C0148.m2842(aVarM9517);
                    break;
                case 1755432:
                    str = "ۦۢ۟";
                    iM2843 = C0148.m2842(aVarM9517);
                    break;
                case 1755529:
                    str = "ۣۧۧ";
                    iM2842 = C0148.m2842(aVarM9517);
                    break;
                default:
                    str = "۟۠ۥ";
                    iM2843 = i10 ^ (-821);
                    break;
            }
        }
    }

    public final String toString() {
        String str = "ۥۤ";
        StringBuilder sb = null;
        e0.a aVarM6713 = null;
        short[] sArrM6430 = null;
        String strM6992 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56479:
                    short[] sArrM6431 = m6430();
                    i10 = C0304.f451;
                    str = "ۦۥۤ";
                    sArrM6430 = sArrM6431;
                    break;
                case 1747905:
                    i10 = C0423.f693;
                    i11 = i10 ^ (-819);
                    str = "ۡۨ۠";
                    break;
                case 1748768:
                    C0142.m2728(sb, strM6992);
                    str = "ۧۦۤ";
                    aVarM6713 = C0409.m8016(this);
                    break;
                case 1748834:
                    i11 = i10 ^ (-877);
                    str = "ۣۡۤ";
                    strM6992 = C0427.m8363(sArrM6430, 26, i11, 2655);
                    break;
                case 1749667:
                    i10 = C0226.f305;
                    i11 = i10 ^ (-158);
                    str = "ۢۥۨ";
                    break;
                case 1749765:
                    String strM1017 = C0052.m1017(sArrM6430, 35, i11, 1892);
                    C0142.m2728(sb, strM1017);
                    str = "ۣۤۧ";
                    strM6992 = strM1017;
                    break;
                case 1750532:
                    i11 = i10 ^ 193;
                    str = "ۨۥۡ";
                    strM6992 = C0199.m3816(sArrM6430, 43, i11, 1583);
                    break;
                case 1750694:
                    e0.a aVarM1101 = C0058.m1101(this);
                    C0214.m4074(sb, aVarM1101);
                    str = "ۣۣۨ";
                    aVarM6713 = aVarM1101;
                    break;
                case 1753420:
                    short[] sArrM6432 = m6430();
                    i10 = C0262.f341;
                    str = "ۡۦۧ";
                    sArrM6430 = sArrM6432;
                    break;
                case 1753476:
                    C0214.m4074(sb, aVarM6713);
                    str = "۠ۧۨ";
                    sArrM6430 = m6430();
                    break;
                case 1753602:
                    C0214.m4074(sb, aVarM6713);
                    C0175.m3331(sb, ')');
                    str = "ۣۧۧ";
                    break;
                case 1753605:
                    i11 = i10 ^ (-592);
                    str = "ۣۨۨ";
                    strM6992 = C0357.m6992(sArrM6430, 0, i11, 350);
                    break;
                case 1753668:
                    e0.a aVarM9517 = C0489.m9517(this);
                    C0214.m4074(sb, aVarM9517);
                    str = "ۦ۟ۥ";
                    aVarM6713 = aVarM9517;
                    break;
                case 1754507:
                    return C0441.m8605(sb);
                case 1754597:
                    C0214.m4074(sb, aVarM6713);
                    str = "ۣۢۢ";
                    sArrM6430 = m6430();
                    break;
                case 1755464:
                    short[] sArrM6433 = m6430();
                    i10 = C0215.f238;
                    str = "ۣ۟۠";
                    sArrM6430 = sArrM6433;
                    break;
                case 1755469:
                    sb = new StringBuilder(strM6992);
                    str = "ۦۡ۟";
                    aVarM6713 = C0301.m5792(this);
                    break;
                case 1755524:
                    C0142.m2728(sb, strM6992);
                    str = "ۦۥۡ";
                    aVarM6713 = C0343.m6713(this);
                    break;
                default:
                    String strM1728 = C0080.m1728(sArrM6430, 18, i11, 2497);
                    C0142.m2728(sb, strM1728);
                    str = "ۦۧۥ";
                    strM6992 = strM1728;
                    break;
            }
        }
    }
}
