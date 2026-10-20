package k0;

import aa.C0012;
import b1.C0050;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.internal.tasks.C0102;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.components.C0135;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import h0.C0299;
import h3.C0303;
import j9.C0329;
import l0.C0339;
import m1.C0350;
import okhttp3.internal.publicsuffix.C0372;
import r2.C0394;
import u.C0428;
import u3.C0434;
import v8.C0450;

/* JADX INFO: loaded from: classes.dex */
public final class r3 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f502short = {3034, 3032, 3029, 3029, 2969, 3021, 3030, 2969, 2974, 3019, 3036, 3018, 3020, 3028, 3036, 2974, 2969, 3035, 3036, 3039, 3030, 3019, 3036, 2969, 2974, 3024, 3031, 3023, 3030, 3026, 3036, 2974, 2969, 3022, 3024, 3021, 3025, 2969, 3034, 3030, 3019, 3030, 3020, 3021, 3024, 3031, 3036};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t.d f9421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9422c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(t.d dVar, float f10, u8.e eVar) {
        super(C0394.f665 ^ 77, eVar);
        this.f9421b = dVar;
        this.f9422c = f10;
        int iM8409 = C0428.m8409();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8409 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0372.m7308("pWXiDTcKzPKxy2L0iFFTumK1hY")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static short[] m6431() {
        int iM8498 = C0434.m8498();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8498 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f502short;
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
        t.d dVarM2614 = null;
        float fM6861 = 0.0f;
        String str = "\u06e3\u06e6\u06e5";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747778:
                    return this;
                case 1750754:
                    dVarM2614 = C0135.m2614(this);
                    str = "\u06e4\u06e3\u06e8";
                    break;
                case 1754629:
                    this = new r3(dVarM2614, fM6861, eVar);
                    str = "\u06e0\u06e3\u06e5";
                    break;
                default:
                    fM6861 = C0350.m6861(this);
                    str = "\u06e7\u06e7\u06e5";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e2\u06e7\u06df";
        m9.d0 d0Var = null;
        u8.e eVar = null;
        q8.l lVarM238 = null;
        Object objM1775 = obj;
        u8.e eVarM1994 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746788:
                    str = "\u06e6\u06e7\u06e3";
                    this = (r3) eVarM1994;
                    break;
                case 1747749:
                    str = "\u06e8\u06e5\u06e7";
                    eVar = (u8.e) obj2;
                    break;
                case 1747780:
                    objM1775 = C0083.m1775(this, lVarM238);
                    str = "\u06e2\u06e4\u06e7";
                    break;
                case 1749733:
                    return objM1775;
                case 1753666:
                    str = "\u06e0\u06e3\u06e7";
                    lVarM238 = C0012.m238();
                    break;
                case 1755530:
                    eVarM1994 = C0102.m1994(this, d0Var, eVar);
                    str = "\u06df\u06e2\u06e7";
                    break;
                default:
                    str = "\u06e0\u06e2\u06e7";
                    d0Var = (m9.d0) objM1775;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVarM5766 = C0299.m5766();
        int iM5850 = C0303.m5850(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5850 != 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM5850 == 1) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0450.m8781(m6431(), 0, C0050.f70 ^ 923, 3001));
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
                    Float f10 = new Float(C0350.m6861(this));
                    t.w1 w1VarM2819 = C0147.m2819();
                    this.f9420a = 1;
                    Object objM6662 = C0339.m6662(C0135.m2614(this), f10, w1VarM2819, this);
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
                                if (objM6662 == aVarM5766) {
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
