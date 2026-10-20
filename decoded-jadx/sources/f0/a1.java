package f0;

import a2.C0005;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.draw.C0028;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0170;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.migration.C0238;
import dagger.hilt.android.migration.C0239;
import e2.C0263;
import h4.C0305;
import h8.C0314;
import o7.i2;
import v7.C0449;
import z3.C0486;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a1 f5591g = new a1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.c f5592a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.c f5593b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.c f5594c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9.c f5595d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.c f5596e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c9.c f5597f = null;

    public a1() {
        int iM8755 = C0449.m8755();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8755 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0138.m2676("oqVYCHCxvfgLuG7F")));
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
                    boolean z10 = obj instanceof a1;
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
                                a1 a1Var = (a1) obj;
                                boolean zM4399 = C0228.m4399(C0024.m472(this), C0024.m472(a1Var));
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = zM4399 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            boolean zM43910 = C0228.m4399(C0028.m548(this), C0028.m548(a1Var));
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case 76:
                                                        boolean zM43911 = C0228.m4399(C0170.m3261(this), C0170.m3261(a1Var));
                                                        int i14 = 48891;
                                                        while (true) {
                                                            i14 ^= 48908;
                                                            switch (i14) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 503:
                                                                    if (zM43911) {
                                                                        i14 = 49635;
                                                                    }
                                                                    break;
                                                                case 32495:
                                                                    boolean zM43912 = C0228.m4399(C0005.m103(this), C0005.m103(a1Var));
                                                                    int i15 = 49666;
                                                                    while (true) {
                                                                        i15 ^= 49683;
                                                                        switch (i15) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (zM43912) {
                                                                                    i15 = 49759;
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 76:
                                                                                boolean zM43913 = C0228.m4399(C0239.m4589(this), C0239.m4589(a1Var));
                                                                                int i16 = 49790;
                                                                                while (true) {
                                                                                    i16 ^= 49807;
                                                                                    switch (i16) {
                                                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 51:
                                                                                            break;
                                                                                        case 84:
                                                                                            boolean zM43914 = C0228.m4399(C0305.m5889(this), C0305.m5889(a1Var));
                                                                                            int i17 = 49914;
                                                                                            while (true) {
                                                                                                i17 ^= 49931;
                                                                                                switch (i17) {
                                                                                                    case 497:
                                                                                                        if (zM43914) {
                                                                                                            i17 = 50658;
                                                                                                        }
                                                                                                        break;
                                                                                                    case 1711:
                                                                                                        break;
                                                                                                    case 1736:
                                                                                                        break;
                                                                                                    case 1769:
                                                                                                        int i18 = 50689;
                                                                                                        while (true) {
                                                                                                            i18 ^= 50706;
                                                                                                            switch (i18) {
                                                                                                                case 19:
                                                                                                                    i18 = 50720;
                                                                                                                    break;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                    return true;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                }
                                                                                                i17 = 50627;
                                                                                            }
                                                                                            break;
                                                                                        case 241:
                                                                                            if (zM43913) {
                                                                                                i16 = 49883;
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    i16 = 49852;
                                                                                }
                                                                                break;
                                                                            case 83:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i15 = 49728;
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i14 = 48953;
                                                        }
                                                        break;
                                                    case 239:
                                                        if (zM43910) {
                                                            i13 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i13 = 48829;
                                            }
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                return false;
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
        int iM2842;
        int iM2843;
        int iM2844;
        int iM2845;
        int iM2846;
        int iM2847 = 0;
        c9.c cVarM472 = C0024.m472(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = cVarM472 != null ? 1709 : 1678;
                    break;
                case 204:
                    iM2842 = C0148.m2842(cVarM472);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    iM2842 = 0;
                    break;
                default:
                    break;
            }
        }
        int i12 = C0133.f159;
        c9.c cVarM548 = C0028.m548(this);
        int i13 = 1864;
        while (true) {
            i13 ^= 1881;
            switch (i13) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i13 = cVarM548 != null ? 48736 : 48705;
                    break;
                case 47384:
                    iM2843 = 0;
                    break;
                case 47417:
                    iM2843 = C0148.m2842(cVarM548);
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
        int i15 = C0314.f462;
        c9.c cVarM3261 = C0170.m3261(this);
        int i16 = 48891;
        while (true) {
            i16 ^= 48908;
            switch (i16) {
                case 22:
                    break;
                case 53:
                    iM2844 = 0;
                    break;
                case 503:
                    i16 = cVarM3261 != null ? 49635 : 48953;
                    break;
                case 32495:
                    iM2844 = C0148.m2842(cVarM3261);
                    int i17 = 49666;
                    while (true) {
                        i17 ^= 49683;
                        switch (i17) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i17 = 49697;
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
        int i18 = C0263.f343;
        c9.c cVarM103 = C0005.m103(this);
        int i19 = 49790;
        while (true) {
            i19 ^= 49807;
            switch (i19) {
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    iM2845 = 0;
                    break;
                case 84:
                    iM2845 = C0148.m2842(cVarM103);
                    int i20 = 49914;
                    while (true) {
                        i20 ^= 49931;
                        switch (i20) {
                            case 497:
                                i20 = 50596;
                                continue;
                            case 1711:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 241:
                    i19 = cVarM103 != null ? 49883 : 49852;
                    break;
                default:
                    break;
            }
        }
        int i21 = C0238.f318;
        c9.c cVarM4589 = C0239.m4589(this);
        int i22 = 50689;
        while (true) {
            i22 ^= 50706;
            switch (i22) {
                case 19:
                    i22 = cVarM4589 != null ? 50782 : 50751;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    iM2846 = 0;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    iM2846 = C0148.m2842(cVarM4589);
                    int i23 = 50813;
                    while (true) {
                        i23 ^= 50830;
                        switch (i23) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 243:
                                i23 = 50844;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        int i24 = C0486.f760;
        c9.c cVarM5889 = C0305.m5889(this);
        int i25 = 51588;
        while (true) {
            i25 ^= 51605;
            switch (i25) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (cVarM5889 != null) {
                        i25 = 51681;
                    }
                    break;
                case 54:
                    break;
                case 87:
                    break;
                case 116:
                    iM2847 = C0148.m2842(cVarM5889);
                    break;
                default:
                    continue;
            }
            i25 = 51650;
        }
        return ((0 - ((0 - (((((((((((iM2842 * (i12 ^ 775)) + 19) + iM2843) - 19) * (i15 ^ 285)) - (0 - iM2844)) * (i18 ^ 519)) - 24) + iM2845) + 24) * (i21 ^ (-794)))) - iM2846)) * (i24 ^ 251)) - (0 - iM2847);
    }
}
