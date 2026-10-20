package f0;

import a0.C0003;
import a2.C0004;
import aa.C0012;
import androidx.compose.foundation.layout.C0023;
import androidx.fragment.app.C0042;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import f.C0269;
import h0.C0299;
import j9.C0329;
import k3.C0335;
import k7.C0337;
import o7.i2;
import r5.C0399;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f353short = {2100, 2102, 2107, 2107, 2167, 2083, 2104, 2167, 2160, 2085, 2098, 2084, 2082, 2106, 2098, 2160, 2167, 2101, 2098, 2097, 2104, 2085, 2098, 2167, 2160, 2110, 2105, 2081, 2104, 2108, 2098, 2160, 2167, 2080, 2110, 2083, 2111, 2167, 2100, 2104, 2085, 2104, 2082, 2083, 2110, 2105, 2098};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1.z f5634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f5635c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(o1.z zVar, k1 k1Var, u8.e eVar) {
        super(C0042.f62 ^ 91, eVar);
        this.f5634b = zVar;
        this.f5635c = k1Var;
        int iM6500 = C0335.m6500();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6500 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0299.m5769("somdd0SnQ5p5CzY3c87AoyErvQ7D")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static short[] m5181() {
        int iM6638 = C0337.m6638();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6638 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f353short;
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
        String str = "\u06e4\u06e7\u06e8";
        o1.z zVarM2895 = null;
        k1 k1VarM63 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748674:
                    return this;
                case 1751749:
                    zVarM2895 = C0151.m2895(this);
                    str = "\u06e6\u06e5\u06e1";
                    break;
                case 1753602:
                    str = "\u06e5\u06df\u06e6";
                    k1VarM63 = C0003.m63(this);
                    break;
                default:
                    this = new c1(zVarM2895, k1VarM63, eVar);
                    str = "\u06e1\u06e1\u06e2";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e6\u06e0\u06e0";
        Object objM445 = obj;
        u8.e eVarM1575 = null;
        u8.e eVar = null;
        q8.l lVarM238 = null;
        m9.d0 d0Var = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56351:
                    str = "\u06e7\u06e6\u06e6";
                    eVar = (u8.e) obj2;
                    break;
                case 1746941:
                    str = "\u06e5\u06e1\u06e4";
                    lVarM238 = C0012.m238();
                    break;
                case 1749696:
                    return objM445;
                case 1752520:
                    objM445 = C0023.m445(this, lVarM238);
                    str = "\u06e2\u06e3\u06e1";
                    break;
                case 1753446:
                    str = "\u06e1\u06e0";
                    d0Var = (m9.d0) objM445;
                    break;
                case 1754599:
                    eVarM1575 = C0073.m1575(this, d0Var, eVar);
                    str = "\u06e3\u06e0\u06e5";
                    break;
                default:
                    str = "\u06df\u06e7\u06e5";
                    this = (c1) eVarM1575;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVarM5766 = C0299.m5766();
        int iM78 = C0004.m78(this);
        q8.l lVarM238 = C0012.m238();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM78 != 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM78 == 1) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0269.m5144(m5181(), 0, C0492.f766 ^ (-769), 2135));
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
                    this.f5633a = 1;
                    Object objM7820 = C0399.m7820(C0151.m2895(this), new h1(C0003.m63(this), null), this);
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                objM7820 = lVarM238;
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
                                i13 = objM7820 == aVarM5766 ? 48860 : 48829;
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
                                if (objM7820 == aVarM5766) {
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
