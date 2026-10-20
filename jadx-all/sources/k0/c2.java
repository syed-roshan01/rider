package k0;

import a.C0001;
import androidx.annotation.C0018;
import c1.C0060;
import c3.C0063;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0225;
import fa.C0281;
import p0.C0374;
import z.C0481;

/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8791d;

    public c2(long j10, long j11, long j12, long j13) {
        this.f8788a = j10;
        this.f8789b = j11;
        this.f8790c = j12;
        this.f8791d = j13;
        int iM2838 = C0148.m2838();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2838 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0107.m2072("huvTQyUWlN")));
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
                                boolean z10 = obj instanceof c2;
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
                                            c2 c2Var = (c2) obj;
                                            boolean zM1210 = C0063.m1210(C0281.m5424(this), C0281.m5424(c2Var));
                                            int i13 = 48891;
                                            while (true) {
                                                i13 ^= 48908;
                                                switch (i13) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        boolean zM1211 = C0063.m1210(C0001.m25(this), C0001.m25(c2Var));
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
                                                                    boolean zM1212 = C0063.m1210(C0225.m4323(this), C0225.m4323(c2Var));
                                                                    int i15 = 49790;
                                                                    while (true) {
                                                                        i15 ^= 49807;
                                                                        switch (i15) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 51:
                                                                                boolean zM1213 = C0063.m1210(C0018.m357(this), C0018.m357(c2Var));
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
        long jM357 = 0;
        String str = "ۥ۠۟";
        int i10 = 0;
        int iM9363 = 0;
        int iM7326 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56571:
                    str = "ۤۧ";
                    iM9363 = C0481.m9363(jM357, iM7326, i10);
                    break;
                case 1746972:
                    jM357 = C0225.m4323(this);
                    str = "ۣۨ";
                    break;
                case 1748675:
                    str = "ۦۦۥ";
                    iM7326 = C0060.m1146(jM357);
                    break;
                case 1749820:
                    jM357 = C0281.m5424(this);
                    str = "ۣۧۡ";
                    break;
                case 1751772:
                    str = "ۥ۟۠";
                    iM9363 = iM7326 - i10;
                    break;
                case 1752454:
                    return iM9363;
                case 1752484:
                    str = "ۢۧۡ";
                    iM7326 = C0374.m7326();
                    break;
                case 1752518:
                    jM357 = C0001.m25(this);
                    str = "ۣۧ۟";
                    break;
                case 1752647:
                    str = "ۦ۠ۢ";
                    iM9363 = C0168.f192;
                    break;
                case 1753448:
                    i10 = iM9363 ^ 943;
                    str = "ۨۡۦ";
                    break;
                case 1753637:
                    i10 = 0 - iM9363;
                    str = "ۤۨ۠";
                    break;
                case 1754379:
                    str = "۟ۨۥ";
                    iM7326 = C0481.m9363(jM357, iM9363, i10);
                    break;
                case 1754441:
                    str = "ۥۥۧ";
                    iM7326 = C0060.m1146(jM357);
                    break;
                case 1755405:
                    str = "ۥۡۢ";
                    iM9363 = iM7326 * i10;
                    break;
                default:
                    jM357 = C0018.m357(this);
                    str = "ۣۡۡ";
                    break;
            }
        }
    }
}
