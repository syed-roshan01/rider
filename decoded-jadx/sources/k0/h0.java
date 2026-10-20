package k0;

import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0169;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.remoteconfig.internal.Code;
import g2.C0287;
import h.C0298;
import h7.C0311;
import r5.C0399;
import s0.C0410;
import t0.C0418;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8967e;

    public h0(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f8963a = f10;
        this.f8964b = f11;
        this.f8965c = f12;
        this.f8966d = f13;
        this.f8967e = f15;
        int iM8221 = C0418.m8221();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8221 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0410.m8057("xhY0n")));
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
                                boolean z10 = obj instanceof h0;
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
                                            h0 h0Var = (h0) obj;
                                            boolean zM7816 = C0399.m7816(C0152.m2929(this), C0152.m2929(h0Var));
                                            int i13 = 48891;
                                            while (true) {
                                                i13 ^= 48908;
                                                switch (i13) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        boolean zM7817 = C0399.m7816(C0139.m2689(this), C0139.m2689(h0Var));
                                                        int i14 = 49666;
                                                        while (true) {
                                                            i14 ^= 49683;
                                                            switch (i14) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (!zM7817) {
                                                                        i14 = 49759;
                                                                    }
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    return false;
                                                                case 83:
                                                                    boolean zM7818 = C0399.m7816(C0136.m2630(this), C0136.m2630(h0Var));
                                                                    int i15 = 49790;
                                                                    while (true) {
                                                                        i15 ^= 49807;
                                                                        switch (i15) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 51:
                                                                                boolean zM7819 = C0399.m7816(C0311.m6029(this), C0311.m6029(h0Var));
                                                                                int i16 = 49914;
                                                                                while (true) {
                                                                                    i16 ^= 49931;
                                                                                    switch (i16) {
                                                                                        case 497:
                                                                                            if (!zM7819) {
                                                                                                i16 = 50658;
                                                                                            }
                                                                                            break;
                                                                                        case 1711:
                                                                                            break;
                                                                                        case 1736:
                                                                                            boolean zM78110 = C0399.m7816(C0298.m5735(this), C0298.m5735(h0Var));
                                                                                            int i17 = 50689;
                                                                                            while (true) {
                                                                                                i17 ^= 50706;
                                                                                                switch (i17) {
                                                                                                    case 19:
                                                                                                        if (!zM78110) {
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
                                                                                if (!zM7818) {
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
                                                        if (!zM7816) {
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
        float fM5735 = 0.0f;
        String str = "\u06e3\u06e7\u06e3";
        int i10 = 0;
        int iM3629 = 0;
        int iM36210 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56359:
                    str = "\u06e8\u06e0\u06df";
                    iM3629 = C0190.m3629(fM5735, iM36210, i10);
                    break;
                case 1746940:
                    str = "\u06df\u06e8\u06e2";
                    iM36210 = C0287.f432;
                    break;
                case 1747715:
                    str = "\u06e7\u06e7\u06e8";
                    iM36210 = iM3629 * i10;
                    break;
                case 1747808:
                    str = "\u06e7\u06e6\u06e1";
                    fM5735 = C0136.m2630(this);
                    break;
                case 1748610:
                    str = "\u06e2\u06e2\u06e0";
                    iM36210 = iM3629 - i10;
                    break;
                case 1749664:
                    return iM36210;
                case 1750531:
                    str = "\u06e1\u06e8";
                    fM5735 = C0311.m6029(this);
                    break;
                case 1750783:
                    str = "\u06e5\u06e4\u06df";
                    fM5735 = C0152.m2929(this);
                    break;
                case 1751620:
                    str = "\u06e0\u06e4\u06e4";
                    iM3629 = C0190.m3629(fM5735, iM36210, i10);
                    break;
                case 1751773:
                    str = "\u06e8\u06e4\u06e5";
                    iM36210 = C0169.m3231(fM5735);
                    break;
                case 1752608:
                    str = "\u06df\u06e7\u06e4";
                    iM3629 = C0169.m3231(fM5735);
                    break;
                case 1754594:
                    str = "\u06e3\u06df\u06df";
                    iM36210 = C0190.m3629(fM5735, iM3629, i10);
                    break;
                case 1754632:
                    str = "\u06e4\u06e3\u06e3";
                    fM5735 = C0139.m2689(this);
                    break;
                case 1755367:
                    str = "\u06e4\u06e8\u06e1";
                    fM5735 = C0298.m5735(this);
                    break;
                case 1755497:
                    i10 = 0 - iM36210;
                    str = "\u06e1\u06df\u06e0";
                    break;
                default:
                    i10 = iM36210 ^ (-516);
                    str = "\u06e0\u06e1\u06e4";
                    break;
            }
        }
    }
}
