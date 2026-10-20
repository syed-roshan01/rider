package f0;

import a7.C0008;
import aa.C0012;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.tasks.C0106;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.components.C0134;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.codegen.C0241;
import dagger.hilt.components.C0244;
import fa.C0281;
import h0.C0299;
import h7.C0312;
import j9.C0329;
import l9.C0347;
import m0.l3;
import m4.C0353;
import o7.i2;
import p0.C0373;
import p3.C0375;
import q1.C0383;
import u4.C0436;
import v.u2;

/* JADX INFO: loaded from: classes.dex */
public final class v1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f384short = {717, 719, 706, 706, 654, 730, 705, 654, 649, 732, 715, 733, 731, 707, 715, 649, 654, 716, 715, 712, 705, 732, 715, 654, 649, 711, 704, 728, 705, 709, 715, 649, 654, 729, 711, 730, 710, 654, 717, 705, 732, 705, 731, 730, 711, 704, 715};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m9.d0 f5976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.g1 f5977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x.m f5978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l3 f5979f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(m9.d0 d0Var, m0.g1 g1Var, x.m mVar, l3 l3Var, u8.e eVar) {
        super(C0353.f624 ^ 891, eVar);
        this.f5976c = d0Var;
        this.f5977d = g1Var;
        this.f5978e = mVar;
        this.f5979f = l3Var;
        int iM2938 = C0153.m2938();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2938 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0281.m5439("Pu1rC04vw9D")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static short[] m5211() {
        int iM6808 = C0347.m6808();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6808 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f384short;
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
        String str = "\u06e8\u06e7\u06e2";
        l3 l3VarM2591 = null;
        m9.d0 d0VarM7321 = null;
        m0.g1 g1VarM2444 = null;
        x.m mVarM7363 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748801:
                    l3VarM2591 = C0134.m2591(this);
                    str = "\u06e3\u06e3\u06e1";
                    break;
                case 1750657:
                    str = "\u06e4\u06e3\u06e4";
                    this = new v1(d0VarM7321, g1VarM2444, mVarM7363, l3VarM2591, eVar);
                    break;
                case 1751621:
                    this.f5975b = obj;
                    str = "\u06e8\u06df\u06e4";
                    break;
                case 1751777:
                    g1VarM2444 = C0126.m2444(this);
                    str = "\u06e0\u06e6\u06e3";
                    break;
                case 1755341:
                    return this;
                case 1755587:
                    d0VarM7321 = C0373.m7321(this);
                    str = "\u06e4\u06e8\u06e5";
                    break;
                default:
                    mVarM7363 = C0375.m7363(this);
                    str = "\u06e1\u06e5\u06e5";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e3\u06e4\u06e4";
        q8.l lVarM238 = null;
        o1.z zVar = null;
        Object objM6039 = obj;
        u8.e eVar = null;
        u8.e eVarM1892 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747748:
                    str = "\u06e6\u06e7\u06e5";
                    this = (v1) eVarM1892;
                    break;
                case 1747779:
                    str = "\u06e3\u06e1\u06e1";
                    eVar = (u8.e) obj2;
                    break;
                case 1750595:
                    eVarM1892 = C0088.m1892(this, zVar, eVar);
                    str = "\u06e0\u06e2\u06e6";
                    break;
                case 1750691:
                    str = "\u06e0\u06e3\u06e6";
                    zVar = (o1.z) objM6039;
                    break;
                case 1753601:
                    return objM6039;
                case 1753668:
                    str = "\u06e0\u06e7";
                    lVarM238 = C0012.m238();
                    break;
                default:
                    objM6039 = C0312.m6039(this, lVarM238);
                    str = "\u06e6\u06e5\u06e0";
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVarM5766 = C0299.m5766();
        int iM168 = C0008.m168(this);
        q8.l lVarM238 = C0012.m238();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM168 != 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM168 == 1) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0188.m3587(m5211(), 0, C0244.f324 ^ 555, 686));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0329.m6365(obj);
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
                    C0329.m6365(obj);
                    o1.z zVar = (o1.z) C0106.m2059(this);
                    u1 u1Var = new u1(C0373.m7321(this), C0126.m2444(this), C0375.m7363(this), null);
                    v.s0 s0Var = new v.s0(C0134.m2591(this), C0436.f707 ^ (-283));
                    this.f5974a = 1;
                    C0383.m7517();
                    Object objM4634 = C0241.m4634(new u2(zVar, u1Var, s0Var, new v.l1(zVar), null), this);
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                objM4634 = lVarM238;
                                break;
                            case 76:
                                int i14 = 48891;
                                while (true) {
                                    i14 ^= 48908;
                                    switch (i14) {
                                        case 22:
                                            break;
                                        case 503:
                                            i14 = 48922;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                i13 = objM4634 == aVarM5766 ? 48860 : 48829;
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
                                if (objM4634 == aVarM5766) {
                                    i15 = 49759;
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                return aVarM5766;
                            case 83:
                                return lVarM238;
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
    }
}
