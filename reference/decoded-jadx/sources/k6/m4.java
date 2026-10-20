package k6;

import a.C0000;
import a2.C0004;
import a8.C0009;
import androidx.compose.ui.draw.C0028;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.bind.C0206;
import d9.C0224;
import e1.C0257;
import f0.C0271;
import h.C0296;
import i4.C0317;
import i6.C0320;
import ja.C0330;
import m1.C0351;
import m7.C0356;
import q7.C0390;
import s7.C0415;
import t1.C0419;
import t2.C0421;
import w.C0453;
import w5.C0463;
import x7.C0471;
import z1.C0483;

/* JADX INFO: loaded from: classes.dex */
public final class m4 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f562short = {2323, 2354, 2353, 2358, 2338, 2363, 2339, 2423, 2355, 2358, 2339, 2358, 2423, 2356, 2360, 2363, 2363, 2354, 2356, 2339, 2366, 2360, 2361, 2423, 2340, 2339, 2358, 2339, 2354, 2423, 2358, 2363, 2341, 2354, 2358, 2355, 2350, 2423, 2340, 2354, 2339, 2423, 2339, 2360, 2232, 2201, 2202, 2205, 2185, 2192, 2184, 2268, 2200, 2205, 2184, 2205, 2268, 2207, 2195, 2192, 2192, 2201, 2207, 2184, 2197, 2195, 2194, 2268, 2197, 2191, 2268, 2200, 2197, 2202, 2202, 2201, 2190, 2201, 2194, 2184, 2268, 2184, 2196, 2205, 2194, 2268, 2205, 2207, 2184, 2185, 2205, 2192, 2268, 2191, 2184, 2205, 2184, 2185, 2191};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10203c;

    public /* synthetic */ m4(int i10, Object obj, boolean z10) {
        this.f10201a = i10;
        this.f10203c = obj;
        this.f10202b = z10;
        int iM3070 = C0160.m3070();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3070 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0206.m3945("fCu")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۡۨۢ۠, reason: not valid java name and contains not printable characters */
    public static short[] m6574() {
        int iM6200 = C0320.m6200();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6200 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f562short;
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

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11 = true;
        int iM6390 = C0330.m6390(this);
        boolean zM90 = C0004.m90(this);
        Object objM9019 = C0463.m9019(this);
        switch (iM6390) {
            case 0:
                C0028.m556(C0178.m3397((k4) objM9019));
                break;
            case 1:
                y5 y5Var = (y5) objM9019;
                boolean zM8273 = C0421.m8273((f5) C0163.m3121(y5Var));
                f5 f5Var = (f5) C0163.m3121(y5Var);
                Boolean boolM2948 = C0154.m2948(f5Var);
                int i10 = 48767;
                while (true) {
                    i10 ^= 48784;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            z10 = false;
                            break;
                        case 76:
                            boolean zM14 = C0000.m14(C0154.m2948(f5Var));
                            int i11 = 48891;
                            while (true) {
                                i11 ^= 48908;
                                switch (i11) {
                                    case 22:
                                        break;
                                    case 53:
                                        z10 = false;
                                        break;
                                    case 503:
                                        i11 = zM14 ? 49635 : 48953;
                                        break;
                                    case 32495:
                                        int i12 = 49666;
                                        while (true) {
                                            i12 ^= 49683;
                                            switch (i12) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i12 = 49697;
                                                    continue;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    z10 = true;
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
                        case 239:
                            i10 = boolM2948 != null ? 48860 : 48829;
                            break;
                        default:
                            break;
                    }
                }
                ((f5) C0163.m3121(y5Var)).A = C0009.m192(zM90);
                int i13 = 49790;
                while (true) {
                    i13 ^= 49807;
                    switch (i13) {
                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case 51:
                            break;
                        case 84:
                            d4 d4VarM3434 = C0180.m3434((f5) C0163.m3121(y5Var));
                            C0257.m4924(d4VarM3434);
                            C0419.m8245(C0136.m2634(d4VarM3434), C0356.m6992(m6574(), 0, C0201.f225 ^ 16, 2391), C0009.m192(zM90));
                            break;
                        case 241:
                            i13 = z10 == zM90 ? 49883 : 49852;
                            break;
                        default:
                            break;
                    }
                }
                boolean zM8274 = C0421.m8273((f5) C0163.m3121(y5Var));
                int i14 = 49914;
                while (true) {
                    i14 ^= 49931;
                    switch (i14) {
                        case 497:
                            i14 = zM8274 != zM8273 ? 50658 : 50627;
                            break;
                        case 1711:
                            break;
                        case 1736:
                            break;
                        case 1769:
                            boolean zM8275 = C0421.m8273((f5) C0163.m3121(y5Var));
                            f5 f5Var2 = (f5) C0163.m3121(y5Var);
                            Boolean boolM2949 = C0154.m2948(f5Var2);
                            int i15 = 50689;
                            while (true) {
                                i15 ^= 50706;
                                switch (i15) {
                                    case 19:
                                        i15 = boolM2949 != null ? 50782 : 50751;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        z11 = false;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        boolean zM15 = C0000.m14(C0154.m2948(f5Var2));
                                        int i16 = 50813;
                                        while (true) {
                                            i16 ^= 50830;
                                            switch (i16) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 53:
                                                    z11 = false;
                                                    break;
                                                case 243:
                                                    if (zM15) {
                                                        i16 = 51557;
                                                    }
                                                    break;
                                                case 4075:
                                                    int i17 = 51588;
                                                    while (true) {
                                                        i17 ^= 51605;
                                                        switch (i17) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i17 = 51619;
                                                                break;
                                                            case 54:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i16 = 50875;
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            int i18 = 51712;
                            while (true) {
                                i18 ^= 51729;
                                switch (i18) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i18 = zM8275 != z11 ? 51805 : 51774;
                                        break;
                                    case 47:
                                        break;
                                    case 76:
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    C0453.m8846(y5Var);
                    break;
                }
                d4 d4VarM3435 = C0180.m3434((f5) C0163.m3121(y5Var));
                C0257.m4924(d4VarM3435);
                C0112.m2169(C0471.m9169(d4VarM3435), C0079.m1700(m6574(), 44, C0271.f387 ^ (-791), 2300), C0009.m192(zM90), C0009.m192(zM8273));
                C0453.m8846(y5Var);
                break;
            case 2:
                C0415.m8163(C0483.m9404((g8.k) objM9019), zM90);
                break;
            case 3:
                C0224.m4325(C0317.m6135((g8.v0) objM9019), zM90);
                int iM2311 = C0120.m2311();
                int i19 = 1864;
                while (true) {
                    i19 ^= 1881;
                    switch (i19) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (iM2311 >= 0) {
                                i19 = 48736;
                            }
                            break;
                        case 47384:
                            break;
                        case 47417:
                            System.out.println(Integer.valueOf(C0089.m1910("Cbdfo0tRugAs16vlaF")));
                            break;
                        case 47483:
                            break;
                        default:
                            continue;
                    }
                    i19 = 48705;
                }
                break;
            default:
                int i20 = 1616;
                while (true) {
                    i20 ^= 1633;
                    switch (i20) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (zM90) {
                                i20 = 1709;
                            }
                            break;
                        case 204:
                            g8.g1 g1Var = (g8.g1) C0453.m8843((g8.x1) objM9019);
                            g1Var.f6806l = true;
                            long jM5706 = C0296.m5706(g1Var);
                            int i21 = 1740;
                            while (true) {
                                i21 ^= 1757;
                                switch (i21) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (jM5706 > 0) {
                                            i21 = 1833;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        q6.l lVarM7637 = C0390.m7637(g1Var);
                                        lVarM7637.f13212a = false;
                                        C0351.m6886(lVarM7637);
                                        break;
                                    default:
                                        continue;
                                }
                                i21 = 1802;
                            }
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i20 = 1678;
                }
                ((g8.g1) C0453.m8843((g8.x1) objM9019)).f6811q = false;
                break;
        }
    }
}
