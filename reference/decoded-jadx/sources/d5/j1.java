package d5;

import a8.C0009;
import aa.C0012;
import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.semantics.C0039;
import com.google.android.gms.common.util.C0085;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0214;
import d9.C0224;
import dagger.hilt.android.internal.migration.C0232;
import dagger.hilt.android.lifecycle.C0237;
import g.C0284;
import g0.C0285;
import g5.C0290;
import h.C0296;
import h0.C0299;
import h5.C0308;
import j2.C0323;
import j3.C0325;
import j4.C0326;
import j9.C0329;
import m0.C0349;
import m5.C0355;
import p3.C0375;
import r.C0392;
import s3.C0412;
import s7.C0414;
import t2.C0421;
import u.C0428;
import v0.C0443;
import x8.C0473;
import y9.C0478;
import z0.C0482;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f269short = {2701, 2703, 2690, 2690, 2766, 2714, 2689, 2766, 2761, 2716, 2699, 2717, 2715, 2691, 2699, 2761, 2766, 2700, 2699, 2696, 2689, 2716, 2699, 2766, 2761, 2695, 2688, 2712, 2689, 2693, 2699, 2761, 2766, 2713, 2695, 2714, 2694, 2766, 2701, 2689, 2716, 2689, 2715, 2714, 2695, 2688, 2699, 1239, 1237, 1247, 1172, 1225, 1234, 1235, 1216, 1231, 1233, 1231, 1172, 1226, 1224, 1235, 1228, 1235, 1238, 1247, 1245, 1247, 1246, 1172, 1243, 1226, 1235, 2676, 2680, 2681, 2659, 2674, 2671, 2659};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.g1 f4590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.g1 f4591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(Context context, m0.g1 g1Var, m0.g1 g1Var2, u8.e eVar) {
        super(C0349.f620 ^ 811, eVar);
        this.f4589b = context;
        this.f4590c = g1Var;
        this.f4591d = g1Var2;
        int iM4583 = C0237.m4583();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4583 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0325.m6285("SIznMyZMvpZG58R")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۡۧۥۨ, reason: not valid java name and contains not printable characters */
    public static short[] m4181() {
        int iM4096 = C0214.m4096();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4096 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f269short;
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

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        String str = "\u06e1\u06e7\u06e0";
        Context contextM5964 = null;
        m0.g1 g1VarM7673 = null;
        m0.g1 g1VarM4469 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746972:
                    return this;
                case 1750569:
                    contextM5964 = C0308.m5964(this);
                    str = "\u06e7\u06e2\u06e1";
                    break;
                case 1752740:
                    str = "\u06e3\u06e0\u06e6";
                    g1VarM4469 = C0232.m4469(this);
                    break;
                case 1754470:
                    this = new j1(contextM5964, g1VarM7673, g1VarM4469, eVar);
                    str = "\u06df\u06e8\u06e5";
                    break;
                default:
                    str = "\u06e5\u06e8\u06e7";
                    g1VarM7673 = C0392.m7673(this);
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e2\u06e3\u06e5";
        u8.e eVar = null;
        q8.l lVarM238 = null;
        m9.d0 d0Var = null;
        u8.e eVarM5707 = null;
        Object objM9215 = obj;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56507:
                    objM9215 = C0473.m9215(this, lVarM238);
                    str = "\u06e0\u06e5\u06e0";
                    break;
                case 1747746:
                    str = "\u06e4\u06df\u06e6";
                    this = (j1) eVarM5707;
                    break;
                case 1747835:
                    return objM9215;
                case 1749700:
                    str = "\u06e6\u06e3\u06e5";
                    d0Var = (m9.d0) objM9215;
                    break;
                case 1751499:
                    str = "\u06e6\u06e1";
                    lVarM238 = C0012.m238();
                    break;
                case 1753544:
                    str = "\u06e8\u06e5\u06e7";
                    eVar = (u8.e) obj2;
                    break;
                default:
                    eVarM5707 = C0296.m5707(this, d0Var, eVar);
                    str = "\u06e0\u06e2\u06e4";
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x019e A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0156 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:101:0x0189. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:116:0x01bd. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x008e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x00da. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x00f5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:75:0x012c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:82:0x0141. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:95:0x0171. Please report as an issue. */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        boolean zM6316;
        boolean z10;
        int i10;
        g5.c cVarM1823;
        int i11;
        int i12;
        int i13;
        Object objM5493;
        int i14;
        v8.a aVarM5766 = C0299.m5766();
        int iM8097 = C0412.m8097(this);
        int i15 = 1616;
        while (true) {
            i15 ^= 1633;
            switch (i15) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i15 = iM8097 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i16 = 1740;
                    while (true) {
                        i16 ^= 1757;
                        switch (i16) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i16 = iM8097 == 1 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0039.m760(m4181(), 0, C0284.f429 ^ 1015, 2798));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i17 = 1864;
                                while (true) {
                                    i17 ^= 1881;
                                    switch (i17) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i17 = 48674;
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
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        C0329.m6365(obj);
        while (true) {
            C0224.m4315(C0392.m7673(this), C0009.m192(C0355.m6979()));
            String strM8396 = C0428.m8396(m4181(), 47, C0200.f224 ^ 300, 1210);
            String strM9384 = C0482.m9384(m4181(), 73, C0161.f185 ^ (-771), 2583);
            Context contextM5964 = C0308.m5964(this);
            C0375.m7360(contextM5964, strM9384);
            try {
                zM6316 = C0326.m6316();
                int i18 = 48767;
                while (true) {
                    i18 ^= 48784;
                    switch (i18) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 239:
                            i18 = 48798;
                            break;
                        default:
                            break;
                    }
                    int i19 = 48891;
                    while (true) {
                        i19 ^= 48908;
                        switch (i19) {
                            case 22:
                                break;
                            case 53:
                                z10 = false;
                                break;
                            case 503:
                                i19 = zM6316 ? 49635 : 48953;
                                break;
                            case 32495:
                                try {
                                    int iM2521 = C0131.m2521();
                                    int i20 = 49666;
                                    while (true) {
                                        i20 ^= 49683;
                                        switch (i20) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i20 = iM2521 == 0 ? 49759 : 49728;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                int i21 = 49790;
                                                while (true) {
                                                    i21 ^= 49807;
                                                    switch (i21) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            z10 = true;
                                                            break;
                                                        case 241:
                                                            i21 = 49821;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 83:
                                                z10 = false;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                } catch (Exception e4) {
                                    int i22 = 53634;
                                    while (true) {
                                        i22 ^= 53651;
                                        switch (i22) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i22 = 53665;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    int i23 = 49914;
                    while (true) {
                        i23 ^= 49931;
                        switch (i23) {
                            case 497:
                                i23 = zM6316 ? 50658 : 50627;
                                break;
                            case 1711:
                                break;
                            case 1736:
                                i10 = 51588;
                                while (true) {
                                    i10 ^= 51605;
                                    switch (i10) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i10 = zM6316 ? 51681 : 51650;
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            try {
                                                C0290.m5588(C0421.m8279(contextM5964), strM8396, 0);
                                                i13 = 51836;
                                                while (true) {
                                                    i13 ^= 51853;
                                                    switch (i13) {
                                                        case 241:
                                                            i13 = 52518;
                                                            break;
                                                        case 1963:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    cVarM1823 = C0414.m8143();
                                                    i12 = 52735;
                                                    while (true) {
                                                        i12 ^= 52752;
                                                        switch (i12) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case 1007:
                                                                i12 = 52766;
                                                                break;
                                                        }
                                                    }
                                                }
                                            } catch (Exception e10) {
                                                Intent intentM6258 = C0323.m6258(C0421.m8279(contextM5964), strM8396);
                                                int i24 = 52611;
                                                while (true) {
                                                    i24 ^= 52628;
                                                    switch (i24) {
                                                        case 23:
                                                            i24 = intentM6258 != null ? 52704 : 52673;
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 85:
                                                            cVarM1823 = C0443.m8653();
                                                            break;
                                                        case 116:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    C0224.m4315(C0232.m4469(this), cVarM1823);
                                                    this.f4588a = 1;
                                                    objM5493 = C0285.m5493((-1260) ^ ((long) C0478.f752), this);
                                                    i14 = 53510;
                                                    while (true) {
                                                        i14 ^= 53527;
                                                        switch (i14) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i14 = objM5493 == aVarM5766 ? 53603 : 53572;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 83:
                                                                break;
                                                            case 116:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                        return aVarM5766;
                                                    }
                                                    break;
                                                }
                                            }
                                            break;
                                        case 116:
                                            cVarM1823 = C0085.m1823();
                                            i11 = 51712;
                                            while (true) {
                                                i11 ^= 51729;
                                                switch (i11) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i11 = 51743;
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 1769:
                                int i25 = 50689;
                                while (true) {
                                    i25 ^= 50706;
                                    switch (i25) {
                                        case 19:
                                            i25 = z10 ? 50782 : 50751;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i10 = 51588;
                                            while (true) {
                                                i10 ^= 51605;
                                                switch (i10) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (zM6316) {
                                                        }
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 87:
                                                        C0290.m5588(C0421.m8279(contextM5964), strM8396, 0);
                                                        i13 = 51836;
                                                        while (true) {
                                                            i13 ^= 51853;
                                                            switch (i13) {
                                                                case 241:
                                                                    i13 = 52518;
                                                                    break;
                                                                case 1963:
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                            cVarM1823 = C0414.m8143();
                                                            i12 = 52735;
                                                            while (true) {
                                                                i12 ^= 52752;
                                                                switch (i12) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case 1007:
                                                                        i12 = 52766;
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case 116:
                                                        cVarM1823 = C0085.m1823();
                                                        i11 = 51712;
                                                        while (true) {
                                                            i11 ^= 51729;
                                                            switch (i11) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i11 = 51743;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            cVarM1823 = C0124.m2396();
                                            int i26 = 50813;
                                            while (true) {
                                                i26 ^= 50830;
                                                switch (i26) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 243:
                                                        i26 = 50844;
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                        C0224.m4315(C0232.m4469(this), cVarM1823);
                        this.f4588a = 1;
                        objM5493 = C0285.m5493((-1260) ^ ((long) C0478.f752), this);
                        i14 = 53510;
                        while (true) {
                            i14 ^= 53527;
                            switch (i14) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    if (objM5493 == aVarM5766) {
                                    }
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 83:
                                    break;
                                case 116:
                                    break;
                                default:
                                    break;
                            }
                            return aVarM5766;
                        }
                    }
                }
            } catch (Exception e11) {
                zM6316 = false;
            }
        }
    }
}
