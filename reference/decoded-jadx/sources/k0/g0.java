package k0;

import b.C0049;
import c1.C0060;
import c3.C0063;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import e2.C0261;
import p0.C0373;
import q1.C0383;
import z.C0480;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8939d;

    public g0(long j10, long j11, long j12, long j13) {
        this.f8936a = j10;
        this.f8937b = j11;
        this.f8938c = j12;
        this.f8939d = j13;
        int iM2227 = C0115.m2227();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2227 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0049.m961("uc2PJyxYv8zeSoZp")));
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
                                boolean z10 = obj instanceof g0;
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
                                            g0 g0Var = (g0) obj;
                                            boolean zM1210 = C0063.m1210(C0141.m2716(this), C0141.m2716(g0Var));
                                            int i13 = 48891;
                                            while (true) {
                                                i13 ^= 48908;
                                                switch (i13) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        boolean zM1211 = C0063.m1210(C0383.m7505(this), C0383.m7505(g0Var));
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
                                                                    boolean zM1212 = C0063.m1210(C0073.m1599(this), C0073.m1599(g0Var));
                                                                    int i15 = 49790;
                                                                    while (true) {
                                                                        i15 ^= 49807;
                                                                        switch (i15) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 51:
                                                                                boolean zM1213 = C0063.m1210(C0147.m2809(this), C0147.m2809(g0Var));
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
        long jM2809 = 0;
        String str = "\u06e6\u06e1";
        int i10 = 0;
        int iM9363 = 0;
        int iM9364 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56319:
                    jM2809 = C0147.m2809(this);
                    str = "\u06e7\u06e7\u06e3";
                    break;
                case 56507:
                    str = "\u06e3\u06e2\u06e7";
                    iM9364 = C0373.m7326();
                    break;
                case 1747749:
                    str = "\u06e0\u06df";
                    iM9363 = C0480.m9363(jM2809, iM9364, i10);
                    break;
                case 1750600:
                    str = "\u06e5\u06e1\u06e6";
                    iM9363 = C0261.f341;
                    break;
                case 1750632:
                    jM2809 = C0141.m2716(this);
                    str = "\u06e8\u06e7\u06df";
                    break;
                case 1750815:
                    return iM9363;
                case 1751561:
                    i10 = 0 - iM9363;
                    str = "\u06e7\u06df\u06e6";
                    break;
                case 1752522:
                    i10 = iM9363 ^ (-891);
                    str = "\u06e8\u06e2\u06e8";
                    break;
                case 1754382:
                    str = "\u06e3\u06e8\u06e4";
                    iM9363 = iM9364 - i10;
                    break;
                case 1754413:
                    jM2809 = C0073.m1599(this);
                    str = "\u06e0\u06e2\u06e7";
                    break;
                case 1754627:
                    str = "\u06e4\u06e1\u06e6";
                    iM9364 = C0060.m1146(jM2809);
                    break;
                case 1755367:
                    jM2809 = C0383.m7505(this);
                    str = "\u06e1\u06e4\u06e2";
                    break;
                case 1755438:
                    str = "\u06e8\u06e0\u06df";
                    iM9363 = iM9364 * i10;
                    break;
                case 1755584:
                    str = "\u06e3\u06e1\u06e6";
                    iM9364 = C0060.m1146(jM2809);
                    break;
                default:
                    str = "\u06e7\u06e0\u06e6";
                    iM9364 = C0480.m9363(jM2809, iM9363, i10);
                    break;
            }
        }
    }
}
