package d5;

import aa.C0012;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.common.util.C0085;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0213;
import d3.C0216;
import d9.C0224;
import f4.C0276;
import g.C0284;
import g0.C0285;
import g2.C0286;
import h0.C0299;
import j9.C0329;
import m0.l3;
import m5.C0355;
import r6.C0401;
import t0.C0418;
import u8.C0438;
import w5.C0462;
import w5.C0463;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f258short = {2267, 2265, 2260, 2260, 2200, 2252, 2263, 2200, 2207, 2250, 2269, 2251, 2253, 2261, 2269, 2207, 2200, 2266, 2269, 2270, 2263, 2250, 2269, 2200, 2207, 2257, 2262, 2254, 2263, 2259, 2269, 2207, 2200, 2255, 2257, 2252, 2256, 2200, 2267, 2263, 2250, 2263, 2253, 2252, 2257, 2262, 2269};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l3 f4472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.g1 f4473c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(l3 l3Var, m0.g1 g1Var, u8.e eVar) {
        super(C0216.f240 ^ (-918), eVar);
        this.f4472b = l3Var;
        this.f4473c = g1Var;
        int iM2492 = C0129.m2492();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2492 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0284.m5478("tyLAVDKJUlSNOwSz1199zY")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۧ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static short[] m4168() {
        int iM9013 = C0462.m9013();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9013 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f258short;
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
        String str = "\u06e1\u06e6\u06e7";
        m0.g1 g1VarM5520 = null;
        l3 l3VarM6966 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748834:
                    str = "\u06e3\u06e5\u06df";
                    l3VarM6966 = C0355.m6966(this);
                    break;
                case 1750717:
                    g1VarM5520 = C0286.m5520(this);
                    str = "\u06e5\u06e1\u06e3";
                    break;
                case 1752519:
                    this = new e1(l3VarM6966, g1VarM5520, eVar);
                    str = "\u06df\u06e5\u06df";
                    break;
                default:
                    return this;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e1\u06e6\u06df";
        m9.d0 d0Var = null;
        Object objM4072 = obj;
        q8.l lVarM238 = null;
        u8.e eVar = null;
        u8.e eVarM1709 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56357:
                    eVarM1709 = C0079.m1709(this, d0Var, eVar);
                    str = "\u06e7\u06e2";
                    break;
                case 56512:
                    objM4072 = C0213.m4072(this, lVarM238);
                    str = "\u06e6\u06e4\u06e5";
                    break;
                case 56539:
                    str = "\u06e0\u06df\u06e8";
                    this = (e1) eVarM1709;
                    break;
                case 1747657:
                    str = "\u06e6\u06e6";
                    lVarM238 = C0012.m238();
                    break;
                case 1748649:
                    str = "\u06e1\u06e6";
                    eVar = (u8.e) obj2;
                    break;
                case 1753575:
                    return objM4072;
                default:
                    str = "\u06e1\u06e0\u06e8";
                    d0Var = (m9.d0) objM4072;
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0086. Please report as an issue. */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVarM5766 = C0299.m5766();
        int iM2554 = C0132.m2554(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM2554 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM2554 == 1 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0148.m2836(m4168(), 0, C0085.f119 ^ 182, 2232));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        C0329.m6365(obj);
        while (true) {
            C0224.m4315(C0286.m5520(this), C0438.m8554(C0276.m5314(((C0201.m3863((Number) C0418.m8214(C0355.m6966(this))) + 6) - C0401.m7869()) - 6)));
            this.f4471a = 1;
            Object objM5493 = C0285.m5493(715 ^ ((long) C0463.f734), this);
            int i13 = 48767;
            while (true) {
                i13 ^= 48784;
                switch (i13) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        break;
                    case 76:
                        break;
                    case 239:
                        i13 = objM5493 == aVarM5766 ? 48860 : 48829;
                        break;
                    default:
                        break;
                }
                return aVarM5766;
            }
        }
    }
}
