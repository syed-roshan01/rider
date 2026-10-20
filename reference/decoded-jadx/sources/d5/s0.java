package d5;

import aa.C0012;
import androidx.versionedparcelable.C0048;
import b4.C0052;
import c6.C0067;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.firebase.abt.C0112;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import f1.C0273;
import h0.C0299;
import j9.C0329;
import r1.C0393;
import s2.C0411;
import t1.C0419;
import u1.C0432;
import v8.C0450;
import w5.C0462;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f285short = {1145, 1147, 1142, 1142, 1082, 1134, 1141, 1082, 1085, 1128, 1151, 1129, 1135, 1143, 1151, 1085, 1082, 1144, 1151, 1148, 1141, 1128, 1151, 1082, 1085, 1139, 1140, 1132, 1141, 1137, 1151, 1085, 1082, 1133, 1139, 1134, 1138, 1082, 1145, 1141, 1128, 1141, 1135, 1134, 1139, 1140, 1151};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0.h0 f4769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(b0.h0 h0Var, int i10, u8.e eVar) {
        super(C0393.f664 ^ 279, eVar);
        this.f4769b = h0Var;
        this.f4770c = i10;
        int iM2176 = C0112.m2176();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2176 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0432.m8461("M9XuBEe2Oe5I09N2EW3Q3O23")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static short[] m4198() {
        int iM8792 = C0450.m8792();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8792 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f285short;
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
        b0.h0 h0VarM1716 = null;
        int iM1296 = 0;
        String str = "\u06e1\u06e7\u06e8";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746752:
                    return this;
                case 1748866:
                    h0VarM1716 = C0079.m1716(this);
                    str = "\u06e6\u06df\u06e4";
                    break;
                case 1749726:
                    this = new s0(h0VarM1716, iM1296, eVar);
                    str = "\u06df\u06e1\u06e2";
                    break;
                default:
                    iM1296 = C0067.m1296(this);
                    str = "\u06e2\u06e4\u06e0";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e7\u06e7\u06e0";
        m9.d0 d0Var = null;
        Object objM927 = obj;
        q8.l lVarM238 = null;
        u8.e eVar = null;
        u8.e eVarM5279 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746844:
                    str = "\u06e7\u06e4\u06e5";
                    eVar = (u8.e) obj2;
                    break;
                case 1748641:
                    return objM927;
                case 1749760:
                    objM927 = C0048.m927(this, lVarM238);
                    str = "\u06e1\u06e0\u06e0";
                    break;
                case 1754536:
                    eVarM5279 = C0273.m5279(this, d0Var, eVar);
                    str = "\u06df\u06df";
                    break;
                case 1754624:
                    str = "\u06df\u06e4\u06e1";
                    d0Var = (m9.d0) objM927;
                    break;
                case 1755462:
                    str = "\u06e2\u06e5\u06e3";
                    lVarM238 = C0012.m238();
                    break;
                default:
                    str = "\u06e8\u06e3\u06e1";
                    this = (s0) eVarM5279;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVarM5766 = C0299.m5766();
        int iM9009 = C0462.m9009(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9009 != 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM9009 == 1) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0419.m8250(m4198(), 0, C0052.f72 ^ 910, 1050));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0329.m6365(obj);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = 48674;
                                            break;
                                        case 47483:
                                            break;
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
                    this.f4768a = 1;
                    Object objM8067 = C0411.m8067(C0079.m1716(this), C0067.m1296(this), this);
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case 76:
                                return aVarM5766;
                            case 239:
                                if (objM8067 == aVarM5766) {
                                    i13 = 48860;
                                }
                                break;
                            default:
                                continue;
                        }
                        i13 = 48829;
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
