package k0;

import androidx.annotation.C0018;
import b8.C0055;
import c1.C0060;
import c3.C0063;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0223;
import h1.C0300;
import j2.C0323;
import p0.C0373;
import p7.C0378;
import z.C0480;

/* JADX INFO: loaded from: classes.dex */
public final class d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8843e;

    public d5(long j10, long j11, long j12, long j13, long j14) {
        this.f8839a = j10;
        this.f8840b = j11;
        this.f8841c = j12;
        this.f8842d = j13;
        this.f8843e = j14;
        int iM5773 = C0300.m5773();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5773 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0223.m4307("4a3rn6KBi")));
                    return;
                case 239:
                    return;
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
                                boolean z10 = obj instanceof d5;
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
                                            d5 d5Var = (d5) obj;
                                            boolean zM1210 = C0063.m1210(C0323.m6255(this), C0323.m6255(d5Var));
                                            int i13 = 48891;
                                            while (true) {
                                                i13 ^= 48908;
                                                switch (i13) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        boolean zM1211 = C0063.m1210(C0018.m362(this), C0018.m362(d5Var));
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
                                                                    boolean zM1212 = C0063.m1210(C0146.m2795(this), C0146.m2795(d5Var));
                                                                    int i15 = 49790;
                                                                    while (true) {
                                                                        i15 ^= 49807;
                                                                        switch (i15) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 51:
                                                                                boolean zM1213 = C0063.m1210(C0055.m1059(this), C0055.m1059(d5Var));
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
                                                                                            boolean zM1214 = C0063.m1210(C0378.m7419(this), C0378.m7419(d5Var));
                                                                                            int i17 = 50689;
                                                                                            while (true) {
                                                                                                i17 ^= 50706;
                                                                                                switch (i17) {
                                                                                                    case 19:
                                                                                                        if (!zM1214) {
                                                                                                            i17 = 50782;
                                                                                                        }
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                        return true;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                        break;
                                                                                                    case 76:
                                                                                                        return false;
                                                                                                    default:
                                                                                                        continue;
                                                                                                }
                                                                                                i17 = 50751;
                                                                                            }
                                                                                            break;
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
                                            int i18 = 48767;
                                            while (true) {
                                                i18 ^= 48784;
                                                switch (i18) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 239:
                                                        i18 = 48798;
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
        long jM6255 = 0;
        String str = "\u06e0\u06e4\u06e1";
        int i10 = 0;
        int iM9363 = 0;
        int iM9364 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56291:
                    str = "\u06df\u06e6\u06e4";
                    iM9364 = iM9363 * i10;
                    break;
                case 56420:
                    return iM9364;
                case 1746752:
                    str = "\u06e7\u06e5\u06e0";
                    iM9364 = C0480.m9363(jM6255, iM9363, i10);
                    break;
                case 1746788:
                    i10 = iM9364 ^ (-865);
                    str = "\u06df\u06e2";
                    break;
                case 1746909:
                    jM6255 = C0018.m362(this);
                    str = "\u06e2\u06e6\u06e2";
                    break;
                case 1746910:
                    str = "\u06e2\u06e3\u06df";
                    iM9363 = C0060.m1146(jM6255);
                    break;
                case 1747746:
                    jM6255 = C0146.m2795(this);
                    str = "\u06df\u06e1\u06e2";
                    break;
                case 1747805:
                    str = "\u06e3\u06e4\u06e8";
                    iM9363 = C0373.m7326();
                    break;
                case 1748648:
                    str = "\u06e3\u06e7";
                    iM9364 = iM9363 - i10;
                    break;
                case 1748734:
                    str = "\u06e2\u06e4";
                    iM9364 = C0060.m1146(jM6255);
                    break;
                case 1748769:
                    jM6255 = C0378.m7419(this);
                    str = "\u06e1\u06e3\u06e0";
                    break;
                case 1749694:
                    str = "\u06df\u06e2\u06e7";
                    iM9364 = C0060.f80;
                    break;
                case 1749765:
                    str = "\u06e1\u06e4\u06e4";
                    iM9363 = C0480.m9363(jM6255, iM9364, i10);
                    break;
                case 1749790:
                    str = "\u06e0\u06e2\u06e4";
                    iM9363 = C0480.m9363(jM6255, iM9364, i10);
                    break;
                case 1750695:
                    jM6255 = C0323.m6255(this);
                    str = "\u06df\u06e6\u06e5";
                    break;
                case 1754562:
                    jM6255 = C0055.m1059(this);
                    str = "\u06e2\u06e5\u06e8";
                    break;
                default:
                    i10 = 0 - iM9364;
                    str = "\u06e1\u06e0\u06e7";
                    break;
            }
        }
    }
}
