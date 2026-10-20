package f0;

import aa.C0012;
import androidx.core.app.C0040;
import b7.C0053;
import c0.C0056;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d4.C0218;
import d9.C0224;
import e2.C0264;
import f6.C0278;
import g8.C0294;
import h.C0297;
import h0.C0300;
import h6.C0310;
import i6.C0321;
import j9.C0330;
import n.C0362;
import o2.C0369;
import o7.i2;
import q1.C0384;
import r1.C0394;
import r2.C0398;
import r5.C0400;
import s3.C0413;
import s8.C0417;
import u7.C0438;
import w4.C0460;
import x2.C0468;
import x5.C0471;

/* JADX INFO: loaded from: classes.dex */
public final class w extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f385short = {2307, 2305, 2316, 2316, 2368, 2324, 2319, 2368, 2375, 2322, 2309, 2323, 2325, 2317, 2309, 2375, 2368, 2306, 2309, 2310, 2319, 2322, 2309, 2368, 2375, 2313, 2318, 2326, 2319, 2315, 2309, 2375, 2368, 2327, 2313, 2324, 2312, 2368, 2307, 2319, 2322, 2319, 2325, 2324, 2313, 2318, 2309};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0.f f5981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2.a0 f5982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f5983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d2 f5984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g2.s f5985f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(c0.f fVar, g2.a0 a0Var, c2 c2Var, d2 d2Var, g2.s sVar, u8.e eVar) {
        super(C0398.f668 ^ 730, eVar);
        this.f5981b = fVar;
        this.f5982c = a0Var;
        this.f5983d = c2Var;
        this.f5984e = d2Var;
        this.f5985f = sVar;
        int iM7523 = C0384.m7523();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7523 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0180.m3429("Zi0RuSBUhS9bt5x30JbAeljD9vw")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۡۨ۟, reason: not valid java name and contains not printable characters */
    public static short[] m5212() {
        int iM7828 = C0400.m7828();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7828 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f385short;
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
        String str = "۟ۢۡ";
        c0.f fVarM1076 = null;
        c2 c2VarM3025 = null;
        d2 d2VarM7709 = null;
        g2.a0 a0VarM8093 = null;
        g2.s sVarM9152 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746782:
                    fVarM1076 = C0056.m1076(this);
                    str = "ۢۨ۟";
                    break;
                case 1748799:
                    str = "ۣۣ۟";
                    this = new w(fVarM1076, a0VarM8093, c2VarM3025, d2VarM7709, sVarM9152, eVar);
                    break;
                case 1749849:
                    a0VarM8093 = C0413.m8093(this);
                    str = "ۧۦۡ";
                    break;
                case 1750535:
                    return this;
                case 1754594:
                    c2VarM3025 = C0158.m3025(this);
                    str = "۟ۧ۠";
                    break;
                case 1755468:
                    sVarM9152 = C0471.m9152(this);
                    str = "ۡۥۣ";
                    break;
                default:
                    d2VarM7709 = C0394.m7709(this);
                    str = "ۣۨۧ";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "۠ۦ۠";
        Object objM2799 = obj;
        u8.e eVarM2507 = null;
        u8.e eVar = null;
        m9.d0 d0Var = null;
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56327:
                    eVarM2507 = C0130.m2507(this, d0Var, eVar);
                    str = "ۥ۟ۦ";
                    break;
                case 1750594:
                    return objM2799;
                case 1751686:
                    str = "ۦۣۦ";
                    lVarM238 = C0012.m238();
                    break;
                case 1752460:
                    str = "ۤۥۧ";
                    this = (w) eVarM2507;
                    break;
                case 1752648:
                    str = "۠ۧ";
                    eVar = (u8.e) obj2;
                    break;
                case 1753545:
                    objM2799 = C0147.m2799(this, lVarM238);
                    str = "ۣۡ۠";
                    break;
                default:
                    str = "ۥۥۨ";
                    d0Var = (m9.d0) objM2799;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        d1.d dVar;
        v8.a aVarM5766 = C0300.m5766();
        int iM786 = C0040.m786(this);
        q8.l lVarM238 = C0012.m238();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM786 != 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM786 == 1) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0264.m5027(m5212(), 0, C0128.f154 ^ (-136), 2400));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0330.m6365(obj);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = 48674;
                                            break;
                                        case 47483:
                                            return lVarM238;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    C0330.m6365(obj);
                    j1 j1VarM6196 = C0321.m6196(C0158.m3025(this));
                    a2.a0 a0VarM7085 = C0362.m7085(C0394.m7709(this));
                    this.f5980a = 1;
                    int iM4143 = C0218.m4143(C0471.m9152(this), C0468.m9099(C0310.m5972(C0413.m8093(this))));
                    int iM8181 = C0417.m8181(C0278.m5369(C0123.m2373(C0438.m8541(a0VarM7085))));
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                int i14 = 49666;
                                while (true) {
                                    i14 ^= 49683;
                                    switch (i14) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i14 = iM4143 != 0 ? 49759 : 49728;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            dVar = C0053.m1028(a0VarM7085, ((iM4143 + 22) - 1) - 22);
                                            int i15 = 49790;
                                            while (true) {
                                                i15 ^= 49807;
                                                switch (i15) {
                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 241:
                                                        i15 = 49821;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 83:
                                            long jM8957 = C0460.m8957(C0224.m4305(j1VarM6196), C0294.m5646(j1VarM6196), C0369.m7220(j1VarM6196));
                                            dVar = new d1.d(0.0f, 0.0f, 1.0f, (int) (jM8957 & ((4294967295L ^ (-1)) ^ jM8957)));
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 76:
                                dVar = C0053.m1028(a0VarM7085, iM4143);
                                int i16 = 48891;
                                while (true) {
                                    i16 ^= 48908;
                                    switch (i16) {
                                        case 22:
                                            break;
                                        case 503:
                                            i16 = 48922;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 239:
                                i13 = iM4143 < iM8181 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    Object objM5703 = C0297.m5703(C0056.m1076(this), dVar, this);
                    int i17 = 49914;
                    while (true) {
                        i17 ^= 49931;
                        switch (i17) {
                            case 497:
                                i17 = objM5703 == aVarM5766 ? 50658 : 50627;
                                break;
                            case 1711:
                                break;
                            case 1736:
                                objM5703 = lVarM238;
                                break;
                            case 1769:
                                int i18 = 50689;
                                while (true) {
                                    i18 ^= 50706;
                                    switch (i18) {
                                        case 19:
                                            i18 = 50720;
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
                    int i19 = 50813;
                    while (true) {
                        i19 ^= 50830;
                        switch (i19) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                return lVarM238;
                            case 243:
                                if (objM5703 == aVarM5766) {
                                    i19 = 51557;
                                }
                                break;
                            case 4075:
                                return aVarM5766;
                            default:
                                continue;
                        }
                        i19 = 50875;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
