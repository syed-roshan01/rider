package k0;

import a3.C0006;
import androidx.compose.ui.draw.C0027;
import c1.C0060;
import c3.C0063;
import c6.C0067;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import p0.C0373;
import v8.C0450;
import z.C0480;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8731d;

    public b1(long j10, long j11, long j12, long j13) {
        this.f8728a = j10;
        this.f8729b = j11;
        this.f8730c = j12;
        this.f8731d = j13;
        int iM541 = C0027.m541();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM541 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0450.m8771("WIYwcTdTPG")));
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
                                boolean z10 = obj instanceof b1;
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
                                            b1 b1Var = (b1) obj;
                                            boolean zM1210 = C0063.m1210(C0067.m1298(this), C0067.m1298(b1Var));
                                            int i13 = 48891;
                                            while (true) {
                                                i13 ^= 48908;
                                                switch (i13) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        boolean zM1211 = C0063.m1210(C0196.m3763(this), C0196.m3763(b1Var));
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
                                                                    boolean zM1212 = C0063.m1210(C0124.m2392(this), C0124.m2392(b1Var));
                                                                    int i15 = 49790;
                                                                    while (true) {
                                                                        i15 ^= 49807;
                                                                        switch (i15) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 51:
                                                                                boolean zM1213 = C0063.m1210(C0480.m9365(this), C0480.m9365(b1Var));
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
        long jM1298 = 0;
        String str = "\u06e5\u06df\u06df";
        int iM9363 = 0;
        int i10 = 0;
        int iM1146 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747719:
                    jM1298 = C0480.m9365(this);
                    str = "\u06e0\u06e2\u06e4";
                    break;
                case 1747746:
                    str = "\u06e3\u06e1\u06df";
                    iM1146 = C0060.m1146(jM1298);
                    break;
                case 1747805:
                    str = "\u06e3\u06e5\u06e3";
                    i10 = iM1146 - 24;
                    break;
                case 1749788:
                    str = "\u06e7\u06e3\u06e0";
                    iM1146 = C0480.m9363(jM1298, iM9363, i10);
                    break;
                case 1750593:
                    str = "\u06e8\u06e1\u06e5";
                    i10 = iM1146 + 24;
                    break;
                case 1750694:
                    iM9363 = iM1146 * i10;
                    str = "\u06e6\u06e6\u06df";
                    break;
                case 1750721:
                    return i10;
                case 1751773:
                    iM9363 = C0006.f1064;
                    str = "\u06e7\u06e5\u06e3";
                    break;
                case 1752453:
                    str = "\u06e5\u06e8\u06e8";
                    iM1146 = C0373.m7326();
                    break;
                case 1752710:
                    iM9363 = C0480.m9363(jM1298, iM1146, i10);
                    str = "\u06e0\u06e1\u06e8";
                    break;
                case 1752741:
                    jM1298 = C0067.m1298(this);
                    str = "\u06e0\u06e8\u06e0";
                    break;
                case 1753631:
                    jM1298 = C0196.m3763(this);
                    str = "\u06e2\u06e6\u06e0";
                    break;
                case 1754500:
                    jM1298 = C0124.m2392(this);
                    str = "\u06e5\u06e7\u06e8";
                    break;
                case 1754565:
                    str = "\u06e3\u06e4\u06e7";
                    i10 = iM9363 ^ 241;
                    break;
                case 1755404:
                    str = "\u06e0\u06e4\u06e1";
                    iM1146 = i10 + iM9363;
                    break;
                default:
                    str = "\u06e4\u06e8\u06e1";
                    iM1146 = C0060.m1146(jM1298);
                    break;
            }
        }
    }
}
