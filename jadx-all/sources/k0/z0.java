package k0;

import androidx.activity.C0017;
import androidx.annotation.C0019;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0214;
import dagger.hilt.android.components.C0229;
import h5.C0307;
import q6.C0388;
import r.C0393;
import r4.C0399;
import s.C0408;
import t8.C0427;
import v0.C0441;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f515short = {2708, 2739, 2742, 2743, 2715, 2748, 2708, 2739, 2742, 2743, 2717, 2727, 2726, 2707, 2748, 2747, 2751, 2739, 2726, 2747, 2749, 2748, 2715, 2726, 2743, 2751, 2810, 2745, 2743, 2731, 2799, 3189, 3193, 3117, 3115, 3128, 3127, 3114, 3120, 3117, 3120, 3126, 3127, 3172};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.f f9688b;

    public z0(x2 x2Var, u0.b bVar) {
        this.f9687a = x2Var;
        this.f9688b = bVar;
        int iM7797 = C0399.m7797();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7797 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0408.m7990("0znEtBiA82tqjdcq")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۥۢ۠ۥ, reason: contains not printable characters */
    public static short[] m6445() {
        int iM2684 = C0139.m2684();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2684 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f515short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
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
                    boolean z10 = obj instanceof z0;
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!z10) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                z0 z0Var = (z0) obj;
                                boolean zM4399 = C0229.m4399(C0017.m348(this), C0017.m348(z0Var));
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (!zM4399) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            boolean zM43910 = C0229.m4399(C0019.m381(this), C0019.m381(z0Var));
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        return true;
                                                    case 76:
                                                        return false;
                                                    case 239:
                                                        if (!zM43910) {
                                                            i13 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i13 = 48829;
                                            }
                                            break;
                                        case 47417:
                                            return false;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i12 = 48705;
                                }
                                break;
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
        Object objM348 = C0017.m348(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (objM348 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    iM2842 = 0;
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    iM2842 = C0148.m2842(objM348);
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return (iM2842 * (C0091.f125 ^ (-185))) + (C0148.m2842(C0019.m381(this)) - 9) + 9;
    }

    public final String toString() {
        String str = "ۢۨۨ";
        StringBuilder sb = null;
        Object objM348 = null;
        c9.f fVarM381 = null;
        short[] sArrM6445 = null;
        String strM7676 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56573:
                    i11 = i10 ^ 358;
                    str = "ۢۨۢ";
                    break;
                case 1746843:
                    sb = new StringBuilder(strM7676);
                    str = "ۣۧۡ";
                    break;
                case 1746909:
                    C0214.m4074(sb, objM348);
                    str = "ۢ۠ۤ";
                    break;
                case 1748831:
                    str = "ۦ۟ۧ";
                    strM7676 = C0441.m8605(sb);
                    break;
                case 1749606:
                    str = "۟ۥ۠";
                    sArrM6445 = m6445();
                    break;
                case 1749608:
                    str = "ۣۣۦ";
                    strM7676 = C0393.m7676(sArrM6445, 31, i11, 3161);
                    break;
                case 1749852:
                    str = "۟ۤ۠";
                    strM7676 = C0388.m7580(sArrM6445, 0, i11, 2770);
                    break;
                case 1749858:
                    str = "ۣۧۧ";
                    sArrM6445 = m6445();
                    break;
                case 1750661:
                    C0214.m4074(sb, fVarM381);
                    str = "ۥۥۣ";
                    break;
                case 1750662:
                    C0142.m2728(sb, strM7676);
                    str = "ۤۢ۠";
                    break;
                case 1751586:
                    str = "ۣۣۥ";
                    fVarM381 = C0019.m381(this);
                    break;
                case 1752643:
                    C0175.m3331(sb, ')');
                    str = "ۡۦۤ";
                    break;
                case 1753422:
                    return strM7676;
                case 1754501:
                    str = "۟ۦۤ";
                    objM348 = C0017.m348(this);
                    break;
                case 1754507:
                    i10 = C0427.f697;
                    str = "ۨۥ";
                    break;
                case 1755372:
                    i11 = i10 ^ (-369);
                    str = "ۢ۠ۦ";
                    break;
                default:
                    i10 = C0307.f454;
                    str = "ۨ۠ۤ";
                    break;
            }
        }
    }
}
