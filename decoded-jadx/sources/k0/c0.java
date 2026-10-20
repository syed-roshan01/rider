package k0;

import aa.C0012;
import android.support.v4.graphics.drawable.C0016;
import androidx.startup.C0047;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.measurement.internal.C0105;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0198;
import dagger.hilt.internal.processedrootsentinel.C0251;
import e0.C0256;
import g.C0284;
import g4.C0289;
import h0.C0299;
import j9.C0329;
import l6.C0343;
import n9.C0366;
import q0.C0382;
import r5.C0399;
import s0.C0410;
import t2.C0422;
import u1.C0431;
import u1.C0432;
import v6.C0447;
import w2.C0457;
import w4.C0459;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f487short = {3189, 3191, 3194, 3194, 3126, 3170, 3193, 3126, 3121, 3172, 3187, 3173, 3171, 3195, 3187, 3121, 3126, 3188, 3187, 3184, 3193, 3172, 3187, 3126, 3121, 3199, 3192, 3168, 3193, 3197, 3187, 3121, 3126, 3169, 3199, 3170, 3198, 3126, 3189, 3193, 3172, 3193, 3171, 3170, 3199, 3192, 3187};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t.d f8775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0 f8778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x.k f8779f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(t.d dVar, float f10, boolean z10, d0 d0Var, x.k kVar, u8.e eVar) {
        super(C0431.f702 ^ (-214), eVar);
        this.f8775b = dVar;
        this.f8776c = f10;
        this.f8777d = z10;
        this.f8778e = d0Var;
        this.f8779f = kVar;
        int iM8470 = C0432.m8470();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8470 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0081.m1749("ortg")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۦۡۧ۠, reason: contains not printable characters */
    public static short[] m6417() {
        int iM8294 = C0422.m8294();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8294 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f487short;
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
        float fM6743 = 0.0f;
        boolean zM5576 = false;
        String str = "\u06e7\u06df\u06df";
        d0 d0VarM3802 = null;
        t.d dVarM2224 = null;
        x.k kVarM919 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1751523:
                    str = "\u06e2\u06e6\u06df";
                    this = new c0(dVarM2224, fM6743, zM5576, d0VarM3802, kVarM919, eVar);
                    break;
                case 1751590:
                    zM5576 = C0289.m5576(this);
                    str = "\u06e7\u06e5\u06e6";
                    break;
                case 1751647:
                    kVarM919 = C0047.m919(this);
                    str = "\u06e4\u06e0\u06df";
                    break;
                case 1752740:
                    fM6743 = C0343.m6743(this);
                    str = "\u06e4\u06e2\u06e4";
                    break;
                case 1754375:
                    dVarM2224 = C0115.m2224(this);
                    str = "\u06e5\u06e8\u06e7";
                    break;
                case 1754568:
                    d0VarM3802 = C0198.m3802(this);
                    str = "\u06e4\u06e4\u06df";
                    break;
                default:
                    return this;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e1\u06e4\u06e6";
        q8.l lVarM238 = null;
        u8.e eVar = null;
        u8.e eVarM8944 = null;
        Object objM5487 = obj;
        m9.d0 d0Var = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746817:
                    str = "\u06e3\u06e5\u06e7";
                    lVarM238 = C0012.m238();
                    break;
                case 1748771:
                    str = "\u06e2\u06e5\u06e5";
                    d0Var = (m9.d0) objM5487;
                    break;
                case 1750725:
                    objM5487 = C0284.m5487(this, lVarM238);
                    str = "\u06e7\u06e2\u06e2";
                    break;
                case 1752679:
                    eVarM8944 = C0459.m8944(this, d0Var, eVar);
                    str = "\u06e8\u06e8\u06e3";
                    break;
                case 1754471:
                    return objM5487;
                case 1755619:
                    str = "\u06df\u06e3\u06e5";
                    this = (c0) eVarM8944;
                    break;
                default:
                    str = "\u06e5\u06e6\u06e8";
                    eVar = (u8.e) obj2;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object dVar;
        v8.a aVarM5766 = C0299.m5766();
        int iM7489 = C0382.m7489(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7489 != 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM7489 != 1 ? 1833 : 1802;
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
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = iM7489 == 2 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            throw new IllegalStateException(C0251.m4804(m6417(), 0, C0284.f429 ^ 1015, 3094));
                                        case 47417:
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 239:
                                                        i13 = 48798;
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
                    C0329.m6365(obj);
                    int i14 = 48891;
                    while (true) {
                        i14 ^= 48908;
                        switch (i14) {
                            case 22:
                                break;
                            case 503:
                                i14 = 48922;
                                break;
                        }
                    }
                    break;
                case 239:
                    C0329.m6365(obj);
                    t.d dVarM2224 = C0115.m2224(this);
                    float fM2924 = C0152.m2924((m2.e) C0457.m8909(C0105.m2053(dVarM2224)));
                    float fM6743 = C0343.m6743(this);
                    boolean zM7816 = C0399.m7816(fM2924, fM6743);
                    int i15 = 49666;
                    while (true) {
                        i15 ^= 49683;
                        switch (i15) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM7816) {
                                    i15 = 49759;
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                boolean zM5576 = C0289.m5576(this);
                                int i16 = 49790;
                                while (true) {
                                    i16 ^= 49807;
                                    switch (i16) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 51:
                                            float fM2925 = C0152.m2924((m2.e) C0457.m8909(C0105.m2053(dVarM2224)));
                                            d0 d0VarM3802 = C0198.m3802(this);
                                            boolean zM7817 = C0399.m7816(fM2925, C0016.m324(d0VarM3802));
                                            int i17 = 50689;
                                            while (true) {
                                                i17 ^= 50706;
                                                switch (i17) {
                                                    case 19:
                                                        if (zM7817) {
                                                            i17 = 50782;
                                                        }
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        boolean zM7818 = C0399.m7816(fM2925, C0447.m8730(d0VarM3802));
                                                        int i18 = 51588;
                                                        while (true) {
                                                            i18 ^= 51605;
                                                            switch (i18) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (zM7818) {
                                                                        i18 = 51681;
                                                                    }
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 87:
                                                                    boolean zM7819 = C0399.m7816(fM2925, C0410.m8044(d0VarM3802));
                                                                    int i19 = 51836;
                                                                    while (true) {
                                                                        i19 ^= 51853;
                                                                        switch (i19) {
                                                                            case 241:
                                                                                if (zM7819) {
                                                                                    i19 = 52580;
                                                                                }
                                                                                break;
                                                                            case 1963:
                                                                                break;
                                                                            case 1992:
                                                                                dVar = null;
                                                                                break;
                                                                            case 2025:
                                                                                dVar = new x.d();
                                                                                int i20 = 52611;
                                                                                while (true) {
                                                                                    i20 ^= 52628;
                                                                                    switch (i20) {
                                                                                        case 23:
                                                                                            i20 = 52642;
                                                                                            break;
                                                                                        case 54:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i19 = 52549;
                                                                    }
                                                                    break;
                                                                case 116:
                                                                    dVar = new x.h();
                                                                    int i21 = 51712;
                                                                    while (true) {
                                                                        i21 ^= 51729;
                                                                        switch (i21) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i21 = 51743;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i18 = 51650;
                                                        }
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        dVar = new x.o(C0185.m3534());
                                                        int i22 = 50813;
                                                        while (true) {
                                                            i22 ^= 50830;
                                                            switch (i22) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 243:
                                                                    i22 = 50844;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i17 = 50751;
                                            }
                                            this.f8774a = 2;
                                            Object objM4896 = C0256.m4896(dVarM2224, fM6743, dVar, C0047.m919(this), this);
                                            int i23 = 52735;
                                            while (true) {
                                                i23 ^= 52752;
                                                switch (i23) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case 1007:
                                                        if (objM4896 == aVarM5766) {
                                                            i23 = 53479;
                                                        }
                                                        break;
                                                    case 7927:
                                                        return aVarM5766;
                                                    default:
                                                        continue;
                                                }
                                                i23 = 52797;
                                            }
                                            break;
                                        case 84:
                                            m2.e eVar = new m2.e(fM6743);
                                            this.f8774a = 1;
                                            Object objM7187 = C0366.m7187(dVarM2224, eVar, this);
                                            int i24 = 49914;
                                            while (true) {
                                                i24 ^= 49931;
                                                switch (i24) {
                                                    case 497:
                                                        if (objM7187 == aVarM5766) {
                                                            i24 = 50658;
                                                        }
                                                        break;
                                                    case 1711:
                                                        break;
                                                    case 1736:
                                                        break;
                                                    case 1769:
                                                        return aVarM5766;
                                                    default:
                                                        continue;
                                                }
                                                i24 = 50627;
                                            }
                                            break;
                                        case 241:
                                            if (!zM5576) {
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
            i10 = 1678;
        }
        return C0012.m238();
    }
}
