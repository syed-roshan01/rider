package f0;

import aa.C0012;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.semantics.C0039;
import androidx.core.content.C0041;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0212;
import dagger.hilt.codegen.C0241;
import e2.C0262;
import g8.C0293;
import h0.C0299;
import j9.C0329;
import m3.C0352;
import n1.C0362;
import o7.i2;
import p8.C0379;
import u0.C0430;
import w6.C0464;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f358short = {1074, 1072, 1085, 1085, 1137, 1061, 1086, 1137, 1142, 1059, 1076, 1058, 1060, 1084, 1076, 1142, 1137, 1075, 1076, 1079, 1086, 1059, 1076, 1137, 1142, 1080, 1087, 1063, 1086, 1082, 1076, 1142, 1137, 1062, 1080, 1061, 1081, 1137, 1074, 1086, 1059, 1086, 1060, 1061, 1080, 1087, 1076};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1.z f5706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f5707c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(o1.z zVar, k1 k1Var, u8.e eVar) {
        super(C0039.f59 ^ 820, eVar);
        this.f5706b = zVar;
        this.f5707c = k1Var;
        int iM6904 = C0352.m6904();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6904 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0379.m7437("84qo1")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static short[] m5187() {
        int iM568 = C0029.m568();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM568 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f358short;
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
        String str = "\u06e2\u06e3\u06e7";
        o1.z zVarM4056 = null;
        k1 k1VarM806 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747872:
                    str = "\u06e1\u06e6\u06e4";
                    k1VarM806 = C0041.m806(this);
                    break;
                case 1749702:
                    zVarM4056 = C0212.m4056(this);
                    str = "\u06e0\u06e6\u06e6";
                    break;
                case 1753423:
                    return this;
                default:
                    this = new g0(zVarM4056, k1VarM806, eVar);
                    str = "\u06e6\u06df\u06e8";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e3\u06e5\u06e5";
        q8.l lVarM238 = null;
        Object objM8430 = obj;
        u8.e eVarM5638 = null;
        u8.e eVar = null;
        m9.d0 d0Var = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747683:
                    objM8430 = C0430.m8430(this, lVarM238);
                    str = "\u06e2\u06e4\u06e4";
                    break;
                case 1749571:
                    str = "\u06e2\u06e7\u06e1";
                    eVar = (u8.e) obj2;
                    break;
                case 1749730:
                    return objM8430;
                case 1750723:
                    str = "\u06e2\u06df\u06e0";
                    d0Var = (m9.d0) objM8430;
                    break;
                case 1751558:
                    str = "\u06e8\u06e3\u06e0";
                    this = (g0) eVarM5638;
                    break;
                case 1755461:
                    str = "\u06e0\u06e0\u06e3";
                    lVarM238 = C0012.m238();
                    break;
                default:
                    eVarM5638 = C0293.m5638(this, d0Var, eVar);
                    str = "\u06e4\u06e1\u06e3";
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVarM5766 = C0299.m5766();
        int iM5015 = C0262.m5015(this);
        q8.l lVarM238 = C0012.m238();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5015 != 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM5015 == 1) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0362.m7110(m5187(), 0, C0464.f735 ^ 401, 1105));
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
                    this.f5705a = 1;
                    Object objM4634 = C0241.m4634(new e1(C0212.m4056(this), C0041.m806(this), null), this);
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
