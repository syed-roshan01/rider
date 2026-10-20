package k0;

import aa.C0011;
import c1.C0060;
import c3.C0063;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.firebase.abt.C0113;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d3.C0217;
import l6.C0344;
import p0.C0374;
import p8.C0381;
import z.C0481;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9663d;

    public y(long j10, long j11, long j12, long j13) {
        this.f9660a = j10;
        this.f9661b = j11;
        this.f9662c = j12;
        this.f9663d = j13;
        int iM7467 = C0381.m7467();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7467 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0089.m1910("SbBXTSqlWhgaYF1lFEge3F")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final y a(long j10, long j11, long j12, long j13) {
        long jM1798;
        long jM6736;
        long jM3403;
        long jM4128;
        long jM220 = C0011.m220();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = j10 != jM220 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                continue;
                            case 54:
                                jM1798 = j10;
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    jM1798 = C0084.m1798(this);
                    break;
                default:
                    break;
            }
        }
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i12 = j11 != jM220 ? 48736 : 48705;
                    break;
                case 47384:
                    jM6736 = C0344.m6736(this);
                    break;
                case 47417:
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                jM6736 = j11;
                                break;
                            case 239:
                                i13 = 48798;
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
        int i14 = 48891;
        while (true) {
            i14 ^= 48908;
            switch (i14) {
                case 22:
                    break;
                case 53:
                    jM3403 = C0178.m3403(this);
                    break;
                case 503:
                    i14 = j12 != jM220 ? 49635 : 48953;
                    break;
                case 32495:
                    int i15 = 49666;
                    while (true) {
                        i15 ^= 49683;
                        switch (i15) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = 49697;
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                jM3403 = j12;
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
        int i16 = 49790;
        while (true) {
            i16 ^= 49807;
            switch (i16) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    jM4128 = C0217.m4128(this);
                    break;
                case 84:
                    int i17 = 49914;
                    while (true) {
                        i17 ^= 49931;
                        switch (i17) {
                            case 497:
                                i17 = 50596;
                                break;
                            case 1711:
                                jM4128 = j13;
                                break;
                        }
                    }
                    break;
                case 241:
                    if (j13 != jM220) {
                        i16 = 49883;
                    }
                    break;
                default:
                    continue;
            }
            i16 = 49852;
        }
        return new y(jM1798, jM6736, jM3403, jM4128);
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
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (obj != null) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean z10 = obj instanceof y;
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (!z10) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            y yVar = (y) obj;
                                            boolean zM1210 = C0063.m1210(C0084.m1798(this), C0084.m1798(yVar));
                                            int i13 = 48891;
                                            while (true) {
                                                i13 ^= 48908;
                                                switch (i13) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        boolean zM1211 = C0063.m1210(C0344.m6736(this), C0344.m6736(yVar));
                                                        int i14 = 49666;
                                                        while (true) {
                                                            i14 ^= 49683;
                                                            switch (i14) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (!zM1211) {
                                                                        i14 = 49759;
                                                                    }
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    return false;
                                                                case 83:
                                                                    boolean zM1212 = C0063.m1210(C0178.m3403(this), C0178.m3403(yVar));
                                                                    int i15 = 49790;
                                                                    while (true) {
                                                                        i15 ^= 49807;
                                                                        switch (i15) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 51:
                                                                                boolean zM1213 = C0063.m1210(C0217.m4128(this), C0217.m4128(yVar));
                                                                                int i16 = 49914;
                                                                                while (true) {
                                                                                    i16 ^= 49931;
                                                                                    switch (i16) {
                                                                                        case 497:
                                                                                            if (!zM1213) {
                                                                                                i16 = 50658;
                                                                                            }
                                                                                            break;
                                                                                        case 1711:
                                                                                            break;
                                                                                        case 1736:
                                                                                            return true;
                                                                                        case 1769:
                                                                                            return false;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    i16 = 50627;
                                                                                }
                                                                                break;
                                                                            case 84:
                                                                                return false;
                                                                            case 241:
                                                                                if (!zM1212) {
                                                                                    i15 = 49883;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i15 = 49852;
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i14 = 49728;
                                                        }
                                                        break;
                                                    case 503:
                                                        if (!zM1210) {
                                                            i13 = 49635;
                                                        }
                                                        break;
                                                    case 32495:
                                                        return false;
                                                    default:
                                                        continue;
                                                }
                                                i13 = 48953;
                                            }
                                            break;
                                        case 47417:
                                            int i17 = 48767;
                                            while (true) {
                                                i17 ^= 48784;
                                                switch (i17) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 239:
                                                        i17 = 48798;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i12 = 48705;
                                }
                                break;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    return false;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final int hashCode() {
        long jM3403 = 0;
        String str = "ۧۧۢ";
        int iM9363 = 0;
        int i10 = 0;
        int iM1146 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56296:
                    jM3403 = C0217.m4128(this);
                    str = "ۨۥۢ";
                    break;
                case 56506:
                    iM9363 = C0481.m9363(jM3403, iM1146, i10);
                    str = "۟ۧ";
                    break;
                case 1747810:
                    str = "ۣۧۢ";
                    i10 = iM1146 + 26;
                    break;
                case 1749702:
                    jM3403 = C0344.m6736(this);
                    str = "ۦۣۤ";
                    break;
                case 1750571:
                    str = "۠ۤۦ";
                    iM1146 = i10 + iM9363;
                    break;
                case 1751622:
                    jM3403 = C0084.m1798(this);
                    str = "ۦۥۨ";
                    break;
                case 1752645:
                    jM3403 = C0178.m3403(this);
                    str = "ۦ۠";
                    break;
                case 1752701:
                    str = "ۦۢ۟";
                    i10 = iM9363 ^ (-65);
                    break;
                case 1753416:
                    iM9363 = C0113.f139;
                    str = "ۥۧ۟";
                    break;
                case 1753507:
                    iM9363 = iM1146 * i10;
                    str = "ۣۢۧ";
                    break;
                case 1753509:
                    str = "ۣ۠ۨ";
                    i10 = iM1146 - 26;
                    break;
                case 1753573:
                    str = "ۥۥۥ";
                    iM1146 = C0481.m9363(jM3403, iM9363, i10);
                    break;
                case 1753609:
                    str = "ۦ۟ۡ";
                    iM1146 = C0060.m1146(jM3403);
                    break;
                case 1754626:
                    str = "ۣۤۥ";
                    iM1146 = C0374.m7326();
                    break;
                case 1755525:
                    str = "ۦۢۡ";
                    iM1146 = C0060.m1146(jM3403);
                    break;
                default:
                    return i10;
            }
        }
    }
}
