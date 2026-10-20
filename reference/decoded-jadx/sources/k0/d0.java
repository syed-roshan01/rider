package k0;

import a.C0000;
import android.support.v4.graphics.drawable.C0016;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.iid.C0169;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.remoteconfig.internal.Code;
import j2.C0324;
import m7.C0358;
import r5.C0399;
import s0.C0410;
import v6.C0447;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8819e;

    public d0(float f10, float f11, float f12, float f13, float f14) {
        this.f8815a = f10;
        this.f8816b = f11;
        this.f8817c = f12;
        this.f8818d = f13;
        this.f8819e = f14;
        int iM6278 = C0324.m6278();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6278 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0000.m9("eH4PmfEH1BHqiLX2vkL2n7")));
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
                                boolean z10 = obj instanceof d0;
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
                                            d0 d0Var = (d0) obj;
                                            boolean zM7816 = C0399.m7816(C0358.m7029(this), C0358.m7029(d0Var));
                                            int i13 = 48891;
                                            while (true) {
                                                i13 ^= 48908;
                                                switch (i13) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        boolean zM7817 = C0399.m7816(C0016.m324(this), C0016.m324(d0Var));
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
                                                                    boolean zM7818 = C0399.m7816(C0410.m8044(this), C0410.m8044(d0Var));
                                                                    int i15 = 49790;
                                                                    while (true) {
                                                                        i15 ^= 49807;
                                                                        switch (i15) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 51:
                                                                                boolean zM7819 = C0399.m7816(C0447.m8730(this), C0447.m8730(d0Var));
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
                                                                                            boolean zM78110 = C0399.m7816(C0079.m1703(this), C0079.m1703(d0Var));
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
        float fM7029 = 0.0f;
        String str = "\u06e0\u06e2\u06e8";
        int iM3629 = 0;
        int i10 = 0;
        int iM36210 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746780:
                    str = "\u06e5\u06e4\u06e1";
                    iM36210 = i10 - iM3629;
                    break;
                case 1747652:
                    str = "\u06e8\u06e7\u06e2";
                    i10 = iM36210 ^ 312;
                    break;
                case 1747742:
                    iM3629 = C0169.m3231(fM7029);
                    str = "\u06e5\u06e7\u06e2";
                    break;
                case 1747750:
                    str = "\u06e0\u06e2\u06e0";
                    fM7029 = C0358.m7029(this);
                    break;
                case 1748613:
                    str = "\u06df\u06e2\u06df";
                    i10 = 0 - iM36210;
                    break;
                case 1748866:
                    iM3629 = C0190.m3629(fM7029, iM36210, i10);
                    str = "\u06e3\u06e2\u06e7";
                    break;
                case 1749572:
                    str = "\u06e7\u06e1\u06e3";
                    iM36210 = C0190.m3629(fM7029, iM3629, i10);
                    break;
                case 1749633:
                    str = "\u06e1\u06df\u06e3";
                    iM36210 = C0169.m3231(fM7029);
                    break;
                case 1749826:
                    str = "\u06e2\u06e7\u06e0";
                    fM7029 = C0016.m324(this);
                    break;
                case 1750632:
                    str = "\u06e2\u06e1\u06e0";
                    fM7029 = C0079.m1703(this);
                    break;
                case 1752610:
                    str = "\u06e8\u06df\u06e3";
                    i10 = 0 - iM36210;
                    break;
                case 1752704:
                    str = "\u06e0\u06df\u06e3";
                    iM36210 = C0165.f189;
                    break;
                case 1754441:
                    str = "\u06e1\u06e7\u06e8";
                    fM7029 = C0447.m8730(this);
                    break;
                case 1754446:
                    str = "\u06e2\u06df\u06e1";
                    fM7029 = C0410.m8044(this);
                    break;
                case 1755340:
                    return i10;
                case 1755587:
                    str = "\u06e2\u06e7\u06e7";
                    iM36210 = iM3629 * i10;
                    break;
                default:
                    iM3629 = C0190.m3629(fM7029, iM36210, i10);
                    str = "\u06e7\u06e1\u06e8";
                    break;
            }
        }
    }
}
