package k0;

import android.support.v4.app.C0014;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0229;
import e2.C0262;
import g.C0285;
import j2.C0324;
import r.C0393;
import v8.C0451;

/* JADX INFO: loaded from: classes.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2 f9645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m9.k f9646b;

    public x2(y2 y2Var, m9.l lVar) {
        this.f9645a = y2Var;
        this.f9646b = lVar;
        int iM4991 = C0262.m4991();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4991 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0285.m5478("vHy7519W6loXYIPUhGzKr")));
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
                                Class clsM280 = C0014.m280(obj);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (x2.class != clsM280) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            x2 x2Var = (x2) obj;
                                            boolean zM4399 = C0229.m4399(C0393.m7674(this), C0393.m7674(x2Var));
                                            int i13 = 48891;
                                            while (true) {
                                                i13 ^= 48908;
                                                switch (i13) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        boolean zM43910 = C0229.m4399(C0451.m8773(this), C0451.m8773(x2Var));
                                                        int i14 = 49666;
                                                        while (true) {
                                                            i14 ^= 49683;
                                                            switch (i14) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (!zM43910) {
                                                                        i14 = 49759;
                                                                    }
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    return false;
                                                                case 83:
                                                                    return true;
                                                                default:
                                                                    continue;
                                                            }
                                                            i14 = 49728;
                                                        }
                                                        break;
                                                    case 503:
                                                        if (!zM4399) {
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
                                            int i15 = 48767;
                                            while (true) {
                                                i15 ^= 48784;
                                                switch (i15) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 239:
                                                        i15 = 48798;
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
        String str = "۠ۤۡ";
        y2 y2VarM7674 = null;
        m9.k kVarM8773 = null;
        int i10 = 0;
        int iM2842 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746784:
                    str = "ۣۢ۟";
                    kVarM8773 = C0451.m8773(this);
                    break;
                case 1746785:
                    return i11;
                case 1746811:
                    str = "ۤ۟ۦ";
                    i11 = i10 ^ 92;
                    break;
                case 1747805:
                    y2VarM7674 = C0393.m7674(this);
                    str = "ۡۥۡ";
                    break;
                case 1748610:
                    str = "ۤ۟ۢ";
                    iM2842 = i11 + i10;
                    break;
                case 1748797:
                    str = "ۤۤ";
                    iM2842 = C0324.m6252(y2VarM7674);
                    break;
                case 1749574:
                    str = "ۨۥ۟";
                    iM2842 = C0148.m2842(kVarM8773);
                    break;
                case 1751495:
                    str = "۟ۢۤ";
                    i11 = iM2842 - 7;
                    break;
                case 1751499:
                    i10 = iM2842 * i11;
                    str = "ۣ۟ۢ";
                    break;
                case 1755522:
                    str = "ۡ۟۠";
                    i11 = iM2842 + 7;
                    break;
                default:
                    i10 = C0140.f166;
                    str = "ۣ۟۟";
                    break;
            }
        }
    }
}
