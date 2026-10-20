package f0;

import a8.C0010;
import androidx.compose.foundation.relocation.C0024;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.play.core.integrity.client.C0107;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0223;
import e0.C0257;
import e9.C0267;
import k.C0332;
import m0.C0350;
import n.C0362;
import n8.C0366;
import o7.i2;
import r7.C0404;
import s8.C0417;
import t2.C0423;
import t8.C0427;
import z0.C0483;

/* JADX INFO: loaded from: classes.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.a0 f5667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r1.s f5668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r1.s f5669c;

    public d2(a2.a0 a0Var) {
        this.f5667a = a0Var;
        int iM1701 = C0079.m1701();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1701 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0109.m2108("UN")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final long a(long j10) {
        float fM7907;
        d1.d dVarM5097;
        r1.s sVarM3034 = C0159.m3034(this);
        d1.d dVarM8183 = C0417.m8183();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = sVarM3034 != null ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM1630 = C0075.m1630(sVarM3034);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = zM1630 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                dVarM5097 = dVarM8183;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                r1.s sVarM9400 = C0483.m9400(this);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = sVarM9400 != null ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            dVarM5097 = null;
                                            int i13 = 48891;
                                            while (true) {
                                                i13 ^= 48908;
                                                switch (i13) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i13 = 48922;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 47417:
                                            dVarM5097 = C0267.m5097(sVarM9400, sVarM3034, true);
                                            int i14 = 48767;
                                            while (true) {
                                                i14 ^= 48784;
                                                switch (i14) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 239:
                                                        i14 = 48798;
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
                                break;
                            default:
                                break;
                        }
                    }
                    int i15 = 49666;
                    while (true) {
                        i15 ^= 49683;
                        switch (i15) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = dVarM5097 == null ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                int i16 = 49790;
                                while (true) {
                                    i16 ^= 49807;
                                    switch (i16) {
                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i16 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                dVarM8183 = dVarM5097;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        float fM4903 = C0257.m4903(j10);
        float fM467 = C0024.m467(dVarM8183);
        int i17 = 49914;
        while (true) {
            i17 ^= 49931;
            switch (i17) {
                case 497:
                    i17 = fM4903 < fM467 ? 50658 : 50627;
                    break;
                case 1711:
                    break;
                case 1736:
                    float fM4904 = C0257.m4903(j10);
                    fM467 = C0119.m2297(dVarM8183);
                    int i18 = 50813;
                    while (true) {
                        i18 ^= 50830;
                        switch (i18) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                fM467 = C0257.m4903(j10);
                                break;
                            case 243:
                                i18 = fM4904 > fM467 ? 51557 : 50875;
                                break;
                            case 4075:
                                int i19 = 51588;
                                while (true) {
                                    i19 ^= 51605;
                                    switch (i19) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i19 = 51619;
                                            continue;
                                        case 54:
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
                    break;
                case 1769:
                    int i20 = 50689;
                    while (true) {
                        i20 ^= 50706;
                        switch (i20) {
                            case 19:
                                i20 = 50720;
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
        float fM2078 = C0107.m2078(j10);
        float fM205 = C0010.m205(dVarM8183);
        int i21 = 51712;
        while (true) {
            i21 ^= 51729;
            switch (i21) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (fM2078 < fM205) {
                        i21 = 51805;
                    }
                    break;
                case 47:
                    float fM2079 = C0107.m2078(j10);
                    fM7907 = C0404.m7907(dVarM8183);
                    int i22 = 52611;
                    while (true) {
                        i22 ^= 52628;
                        switch (i22) {
                            case 23:
                                if (fM2079 > fM7907) {
                                    i22 = 52704;
                                }
                                break;
                            case 54:
                                break;
                            case 85:
                                fM7907 = C0107.m2078(j10);
                                break;
                            case 116:
                                int i23 = 52735;
                                while (true) {
                                    i23 ^= 52752;
                                    switch (i23) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 1007:
                                            i23 = 52766;
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i22 = 52673;
                    }
                    break;
                case 76:
                    int i24 = 51836;
                    while (true) {
                        i24 ^= 51853;
                        switch (i24) {
                            case 241:
                                i24 = 52518;
                                break;
                            case 1963:
                                fM7907 = fM205;
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i21 = 51774;
        }
        return C0164.m3152(fM467, fM7907);
    }

    public final int b(long j10, boolean z10) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (z10) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    j10 = C0223.m4286(this, j10);
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return C0366.m7164(C0362.m7085(this), C0129.m2496(this, j10));
    }

    public final boolean c(long j10) {
        long jM2496 = C0129.m2496(this, C0223.m4286(this, j10));
        float fM2078 = C0107.m2078(jM2496);
        a2.a0 a0VarM7085 = C0362.m7085(this);
        int iM8290 = C0423.m8290(a0VarM7085, fM2078);
        float fM4903 = C0257.m4903(jM2496);
        float fM8357 = C0427.m8357(a0VarM7085, iM8290);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = fM4903 >= fM8357 ? 1709 : 1678;
                    break;
                case 204:
                    float fM4904 = C0257.m4903(jM2496);
                    float fM6847 = C0350.m6847(a0VarM7085, iM8290);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = fM4904 <= fM6847 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = 48674;
                                            break;
                                        case 47483:
                                            return true;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        return false;
    }

    public final long d(long j10) {
        r1.s sVar = null;
        r1.s sVarM3034 = C0159.m3034(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (sVarM3034 != null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    boolean zM1630 = C0075.m1630(sVarM3034);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = zM1630 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                sVarM3034 = null;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = 48674;
                                            continue;
                                        case 47483:
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
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                r1.s sVarM9400 = C0483.m9400(this);
                                int i14 = 49666;
                                while (true) {
                                    i14 ^= 49683;
                                    switch (i14) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (sVarM9400 != null) {
                                                i14 = 49759;
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            boolean zM1631 = C0075.m1630(sVarM9400);
                                            int i15 = 49790;
                                            while (true) {
                                                i15 ^= 49807;
                                                switch (i15) {
                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        break;
                                                    case 84:
                                                        sVar = sVarM9400;
                                                        break;
                                                    case 241:
                                                        i15 = zM1631 ? 49883 : 49852;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            int i16 = 49914;
                                            while (true) {
                                                i16 ^= 49931;
                                                switch (i16) {
                                                    case 497:
                                                        if (sVar == null) {
                                                            i16 = 50658;
                                                        }
                                                        break;
                                                    case 1711:
                                                        break;
                                                    case 1736:
                                                        return C0332.m6406(sVarM3034, sVar, j10);
                                                    case 1769:
                                                        int i17 = 50689;
                                                        while (true) {
                                                            i17 ^= 50706;
                                                            switch (i17) {
                                                                case 19:
                                                                    i17 = 50720;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    return j10;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i16 = 50627;
                                            }
                                            break;
                                        case 83:
                                            return j10;
                                        default:
                                            continue;
                                    }
                                    i14 = 49728;
                                }
                                break;
                            case 76:
                                int i18 = 48891;
                                while (true) {
                                    i18 ^= 48908;
                                    switch (i18) {
                                        case 22:
                                            return j10;
                                        case 503:
                                            i18 = 48922;
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                if (sVarM3034 == null) {
                                    i13 = 48860;
                                }
                                break;
                            default:
                                continue;
                        }
                        i13 = 48829;
                    }
                    break;
                case 239:
                    return j10;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final long e(long j10) {
        r1.s sVar = null;
        r1.s sVarM3034 = C0159.m3034(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (sVarM3034 != null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    boolean zM1630 = C0075.m1630(sVarM3034);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = zM1630 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                sVarM3034 = null;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = 48674;
                                            continue;
                                        case 47483:
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
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                r1.s sVarM9400 = C0483.m9400(this);
                                int i14 = 49666;
                                while (true) {
                                    i14 ^= 49683;
                                    switch (i14) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (sVarM9400 != null) {
                                                i14 = 49759;
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            boolean zM1631 = C0075.m1630(sVarM9400);
                                            int i15 = 49790;
                                            while (true) {
                                                i15 ^= 49807;
                                                switch (i15) {
                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        break;
                                                    case 84:
                                                        sVar = sVarM9400;
                                                        break;
                                                    case 241:
                                                        i15 = zM1631 ? 49883 : 49852;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            int i16 = 49914;
                                            while (true) {
                                                i16 ^= 49931;
                                                switch (i16) {
                                                    case 497:
                                                        if (sVar == null) {
                                                            i16 = 50658;
                                                        }
                                                        break;
                                                    case 1711:
                                                        break;
                                                    case 1736:
                                                        return C0332.m6406(sVar, sVarM3034, j10);
                                                    case 1769:
                                                        int i17 = 50689;
                                                        while (true) {
                                                            i17 ^= 50706;
                                                            switch (i17) {
                                                                case 19:
                                                                    i17 = 50720;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    return j10;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i16 = 50627;
                                            }
                                            break;
                                        case 83:
                                            return j10;
                                        default:
                                            continue;
                                    }
                                    i14 = 49728;
                                }
                                break;
                            case 76:
                                int i18 = 48891;
                                while (true) {
                                    i18 ^= 48908;
                                    switch (i18) {
                                        case 22:
                                            return j10;
                                        case 503:
                                            i18 = 48922;
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                if (sVarM3034 == null) {
                                    i13 = 48860;
                                }
                                break;
                            default:
                                continue;
                        }
                        i13 = 48829;
                    }
                    break;
                case 239:
                    return j10;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
