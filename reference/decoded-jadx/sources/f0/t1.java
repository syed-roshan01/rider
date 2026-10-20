package f0;

import aa.C0012;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.iid.C0169;
import com.google.firebase.ktx.C0179;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import d9.C0224;
import dagger.hilt.android.internal.migration.C0232;
import h0.C0299;
import i4.C0317;
import j9.C0329;
import o7.i2;
import q0.C0381;
import t0.C0418;
import t2.C0423;
import t7.C0425;
import u.C0428;
import w0.C0454;
import w2.C0456;

/* JADX INFO: loaded from: classes.dex */
public final class t1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f380short = {1403, 1401, 1396, 1396, 1336, 1388, 1399, 1336, 1343, 1386, 1405, 1387, 1389, 1397, 1405, 1343, 1336, 1402, 1405, 1406, 1399, 1386, 1405, 1336, 1343, 1393, 1398, 1390, 1399, 1395, 1405, 1343, 1336, 1391, 1393, 1388, 1392, 1336, 1403, 1399, 1386, 1399, 1389, 1388, 1393, 1398, 1405};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m0.g1 f5941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.g1 f5943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x.m f5945e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(m0.g1 g1Var, boolean z10, x.m mVar, u8.e eVar) {
        super(C0423.f694 ^ 804, eVar);
        this.f5943c = g1Var;
        this.f5944d = z10;
        this.f5945e = mVar;
        int iM3081 = C0161.m3081();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3081 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0232.m4474("qXU76oxqDQ181Kqm05gjudf")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static short[] m5207() {
        int iM2022 = C0103.m2022();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2022 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f380short;
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
        boolean zM7469 = false;
        String str = "\u06e5\u06e0\u06e5";
        m0.g1 g1VarM6155 = null;
        x.m mVarM8896 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1749606:
                    str = "\u06e5\u06e5\u06e6";
                    mVarM8896 = C0456.m8896(this);
                    break;
                case 1752646:
                    g1VarM6155 = C0317.m6155(this);
                    str = "\u06e8\u06e8\u06df";
                    break;
                case 1755526:
                    return this;
                case 1755615:
                    this = new t1(g1VarM6155, zM7469, mVarM8896, eVar);
                    str = "\u06e8\u06e5\u06e3";
                    break;
                default:
                    str = "\u06e2\u06e0\u06e4";
                    zM7469 = C0381.m7469(this);
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06df\u06e8\u06e2";
        m9.d0 d0Var = null;
        u8.e eVar = null;
        u8.e eVarM8340 = null;
        q8.l lVarM238 = null;
        Object objM3412 = obj;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746908:
                    objM3412 = C0179.m3412(this, lVarM238);
                    str = "\u06e4\u06e4";
                    break;
                case 1746969:
                    str = "\u06e0\u06e3\u06e5";
                    d0Var = (m9.d0) objM3412;
                    break;
                case 1747778:
                    str = "\u06e8\u06e7\u06e0";
                    eVar = (u8.e) obj2;
                    break;
                case 1754411:
                    str = "\u06df\u06e6\u06e3";
                    lVarM238 = C0012.m238();
                    break;
                case 1755468:
                    str = "\u06e7\u06e0\u06e4";
                    this = (t1) eVarM8340;
                    break;
                case 1755585:
                    eVarM8340 = C0425.m8340(this, d0Var, eVar);
                    str = "\u06e8\u06e3\u06e7";
                    break;
                default:
                    return objM3412;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        m0.g1 g1VarM6155;
        Object nVar;
        m0.g1 g1VarM8397;
        v8.a aVarM5766 = C0299.m5766();
        int iM3233 = C0169.m3233(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM3233 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM3233 == 1 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0202.m3867(m5207(), 0, C0454.f725 ^ 283, 1304));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                g1VarM8397 = C0428.m8397(this);
                                C0329.m6365(obj);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                    g1VarM6155 = g1VarM8397;
                    break;
                case 239:
                    C0329.m6365(obj);
                    g1VarM6155 = C0317.m6155(this);
                    x.o oVar = (x.o) C0418.m8214(g1VarM6155);
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                return C0012.m238();
                            case 76:
                                boolean zM7469 = C0381.m7469(this);
                                int i14 = 48891;
                                while (true) {
                                    i14 ^= 48908;
                                    switch (i14) {
                                        case 22:
                                            break;
                                        case 53:
                                            nVar = new x.n(oVar);
                                            break;
                                        case 503:
                                            i14 = zM7469 ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            x.p pVar = new x.p(oVar);
                                            int i15 = 49666;
                                            while (true) {
                                                i15 ^= 49683;
                                                switch (i15) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i15 = 49697;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        nVar = pVar;
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
                                x.m mVarM8896 = C0456.m8896(this);
                                int i16 = 49790;
                                while (true) {
                                    i16 ^= 49807;
                                    switch (i16) {
                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 51:
                                            break;
                                        case 84:
                                            this.f5941a = g1VarM6155;
                                            this.f5942b = 1;
                                            Object objM2517 = C0130.m2517(mVarM8896, nVar, this);
                                            int i17 = 49914;
                                            while (true) {
                                                i17 ^= 49931;
                                                switch (i17) {
                                                    case 497:
                                                        i17 = objM2517 == aVarM5766 ? 50658 : 50627;
                                                        break;
                                                    case 1711:
                                                        break;
                                                    case 1736:
                                                        g1VarM8397 = g1VarM6155;
                                                        break;
                                                    case 1769:
                                                        return aVarM5766;
                                                    default:
                                                        break;
                                                }
                                            }
                                            g1VarM6155 = g1VarM8397;
                                            break;
                                        case 241:
                                            i16 = mVarM8896 != null ? 49883 : 49852;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                i13 = oVar != null ? 48860 : 48829;
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
        C0224.m4315(g1VarM6155, null);
        return C0012.m238();
    }
}
