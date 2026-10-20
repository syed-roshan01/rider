package f0;

import a8.C0010;
import aa.C0012;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0228;
import dagger.hilt.components.C0245;
import h0.C0300;
import j9.C0330;
import l0.C0340;
import l9.C0348;
import n9.C0367;
import o7.i2;
import okhttp3.internal.publicsuffix.C0373;
import q6.C0387;
import s2.C0412;
import t9.C0428;
import u1.C0432;
import v0.C0443;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f365short = {2966, 2964, 2969, 2969, 3029, 2945, 2970, 3029, 3026, 2951, 2960, 2950, 2944, 2968, 2960, 3026, 3029, 2967, 2960, 2963, 2970, 2951, 2960, 3029, 3026, 2972, 2971, 2947, 2970, 2974, 2960, 3026, 3029, 2946, 2972, 2945, 2973, 3029, 2966, 2970, 2951, 2970, 2944, 2945, 2972, 2971, 2960};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t.d f5813b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(t.d dVar, u8.e eVar) {
        super(C0428.f698 ^ 496, eVar);
        this.f5813b = dVar;
        int iM7309 = C0373.m7309();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7309 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0348.m6812("dH0b3aq")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۧۥ, reason: contains not printable characters */
    public static short[] m5194() {
        int iM8630 = C0443.m8630();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8630 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f365short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
        t.d dVarM7572 = null;
        String str = "۟۠ۡ";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746720:
                    dVarM7572 = C0387.m7572(this);
                    str = "ۣۨۦ";
                    break;
                case 1755336:
                    return this;
                default:
                    this = new l1(dVarM7572, eVar);
                    str = "ۨ۟۟";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۥۦ۟";
        m9.d0 d0Var = null;
        q8.l lVarM238 = null;
        Object objM4392 = obj;
        u8.e eVarM4689 = null;
        u8.e eVar = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56319:
                    eVarM4689 = C0245.m4689(this, d0Var, eVar);
                    str = "ۧۤۤ";
                    break;
                case 1746781:
                    str = "۠۟";
                    eVar = (u8.e) obj2;
                    break;
                case 1746975:
                    objM4392 = C0228.m4392(this, lVarM238);
                    str = "ۡ۟ۥ";
                    break;
                case 1748615:
                    return objM4392;
                case 1752670:
                    str = "۟ۢ۠";
                    d0Var = (m9.d0) objM4392;
                    break;
                case 1754535:
                    str = "ۡۤ";
                    this = (l1) eVarM4689;
                    break;
                default:
                    str = "۟ۨۨ";
                    lVarM238 = C0012.m238();
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVarM5766 = C0300.m5766();
        int iM8077 = C0412.m8077(this);
        t.d dVarM7572 = C0387.m7572(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM8077 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM8077 != 1 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                C0330.m6365(obj);
                                int i12 = 48891;
                                while (true) {
                                    i12 ^= 48908;
                                    switch (i12) {
                                        case 22:
                                            break;
                                        case 503:
                                            i12 = 48922;
                                            break;
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (iM8077 == 2) {
                                                i13 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            throw new IllegalStateException(C0010.m206(m5194(), 0, C0074.f108 ^ (-644), 3061));
                                        case 47417:
                                            C0330.m6365(obj);
                                            int i14 = 48767;
                                            while (true) {
                                                i14 ^= 48784;
                                                switch (i14) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 239:
                                                        i14 = 48798;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i13 = 48705;
                                }
                                return C0012.m238();
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    C0330.m6365(obj);
                    Float f10 = new Float(1.0f);
                    this.f5812a = 1;
                    Object objM7187 = C0367.m7187(dVarM7572, f10, this);
                    int i15 = 49666;
                    while (true) {
                        i15 ^= 49683;
                        switch (i15) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = objM7187 == aVarM5766 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                return aVarM5766;
                            case 83:
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
        Float f11 = new Float(0.0f);
        t.j0 j0VarM8446 = C0432.m8446();
        this.f5812a = 2;
        Object objM6662 = C0340.m6662(dVarM7572, f11, j0VarM8446, this);
        int i16 = 49790;
        while (true) {
            i16 ^= 49807;
            switch (i16) {
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    break;
                case 84:
                    return aVarM5766;
                case 241:
                    if (objM6662 == aVarM5766) {
                        i16 = 49883;
                    }
                    break;
                default:
                    continue;
            }
            i16 = 49852;
        }
        return C0012.m238();
    }
}
