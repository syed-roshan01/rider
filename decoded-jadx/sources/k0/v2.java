package k0;

import aa.C0012;
import c1.C0061;
import c3.C0063;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0198;
import com.google.firebase.tracing.C0204;
import d1.C0214;
import e2.C0260;
import g0.C0285;
import h0.C0299;
import h3.C0301;
import i4.C0317;
import j9.C0329;
import l0.C0339;
import m5.C0355;
import p8.C0379;
import z1.C0483;

/* JADX INFO: loaded from: classes.dex */
public final class v2 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f509short = {3167, 3165, 3152, 3152, 3100, 3144, 3155, 3100, 3099, 3150, 3161, 3151, 3145, 3153, 3161, 3099, 3100, 3166, 3161, 3162, 3155, 3150, 3161, 3100, 3099, 3157, 3154, 3146, 3155, 3159, 3161, 3099, 3100, 3147, 3157, 3144, 3156, 3100, 3167, 3155, 3150, 3155, 3145, 3144, 3157, 3154, 3161};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t.d f9552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t.n f9554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.a f9555e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(t.d dVar, boolean z10, t.n nVar, c9.a aVar, u8.e eVar) {
        super(C0483.f757 ^ (-783), eVar);
        this.f9552b = dVar;
        this.f9553c = z10;
        this.f9554d = nVar;
        this.f9555e = aVar;
        int iM3905 = C0204.m3905();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3905 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0204.m3908("XwzPeSp16t")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static short[] m6439() {
        int iM6968 = C0355.m6968();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6968 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f509short;
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
        boolean zM1172 = false;
        String str = "\u06e2\u06e6\u06df";
        c9.a aVarM1222 = null;
        t.d dVarM3792 = null;
        t.n nVarM5799 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56419:
                    zM1172 = C0061.m1172(this);
                    str = "\u06e1\u06e6\u06e6";
                    break;
                case 1747810:
                    return this;
                case 1748833:
                    nVarM5799 = C0301.m5799(this);
                    str = "\u06e2\u06e2\u06e2";
                    break;
                case 1749666:
                    aVarM1222 = C0063.m1222(this);
                    str = "\u06e5\u06e1\u06e7";
                    break;
                case 1752523:
                    str = "\u06e0\u06e4\u06e6";
                    this = new v2(dVarM3792, zM1172, nVarM5799, aVarM1222, eVar);
                    break;
                default:
                    dVarM3792 = C0198.m3792(this);
                    str = "\u06e3\u06e6";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e1\u06e0\u06e3";
        u8.e eVar = null;
        Object objM7436 = obj;
        u8.e eVarM6150 = null;
        m9.d0 d0Var = null;
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746789:
                    str = "\u06e8\u06e1\u06e3";
                    lVarM238 = C0012.m238();
                    break;
                case 1746904:
                    return objM7436;
                case 1747648:
                    str = "\u06df\u06e2\u06e8";
                    this = (v2) eVarM6150;
                    break;
                case 1748644:
                    str = "\u06e5\u06e4\u06e2";
                    d0Var = (m9.d0) objM7436;
                    break;
                case 1752611:
                    str = "\u06e8\u06e7\u06e0";
                    eVar = (u8.e) obj2;
                    break;
                case 1755585:
                    eVarM6150 = C0317.m6150(this, d0Var, eVar);
                    str = "\u06e0\u06df\u06df";
                    break;
                default:
                    objM7436 = C0379.m7436(this, lVarM238);
                    str = "\u06df\u06e6\u06df";
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        float f10;
        v8.a aVarM5766 = C0299.m5766();
        int iM2082 = C0107.m2082(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM2082 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM2082 == 1 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0214.m4094(m6439(), 0, C0285.f430 ^ (-841), 3132));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0329.m6365(obj);
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
                    C0329.m6365(obj);
                    boolean zM1172 = C0061.m1172(this);
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                f10 = 0.0f;
                                break;
                            case 76:
                                f10 = 1.0f;
                                int i14 = 48891;
                                while (true) {
                                    i14 ^= 48908;
                                    switch (i14) {
                                        case 22:
                                            break;
                                        case 503:
                                            i14 = 48922;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 239:
                                i13 = zM1172 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    Float f11 = new Float(f10);
                    this.f9551a = 1;
                    Object objM6662 = C0339.m6662(C0198.m3792(this), f11, C0301.m5799(this), this);
                    int i15 = 49666;
                    while (true) {
                        i15 ^= 49683;
                        switch (i15) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = objM6662 == aVarM5766 ? 49759 : 49728;
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
        C0260.m4986(C0063.m1222(this));
        return C0012.m238();
    }
}
