package k0;

import aa.C0012;
import android.support.v4.app.C0014;
import b7.C0054;
import com.google.android.gms.common.api.internal.C0082;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0226;
import dagger.hilt.components.C0244;
import h0.C0300;
import j9.C0330;
import k1.C0333;
import k3.C0336;
import m4.C0354;
import n9.C0367;
import u2.C0434;
import w2.C0457;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f484short = {2724, 2726, 2731, 2731, 2791, 2739, 2728, 2791, 2784, 2741, 2722, 2740, 2738, 2730, 2722, 2784, 2791, 2725, 2722, 2721, 2728, 2741, 2722, 2791, 2784, 2734, 2729, 2737, 2728, 2732, 2722, 2784, 2791, 2736, 2734, 2739, 2735, 2791, 2724, 2728, 2741, 2728, 2738, 2739, 2734, 2729, 2722};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x.l f8726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0.u f8727c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(x.l lVar, w0.u uVar, u8.e eVar) {
        super(C0354.f624 ^ 891, eVar);
        this.f8726b = lVar;
        this.f8727c = uVar;
        int iM4678 = C0244.m4678();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4678 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0457.m8886("RI25e1")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6414() {
        int iM7189 = C0367.m7189();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7189 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f484short;
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
        String str = "ۢۦۦ";
        x.l lVarM6510 = null;
        w0.u uVarM4332 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1749794:
                    lVarM6510 = C0336.m6510(this);
                    str = "۟۠۟";
                    break;
                case 1752580:
                    this = new b0(lVarM6510, uVarM4332, eVar);
                    str = "ۥۣۥ";
                    break;
                case 1752583:
                    return this;
                default:
                    str = "ۥۣۢ";
                    uVarM4332 = C0226.m4332(this);
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۧۢ";
        m9.d0 d0Var = null;
        u8.e eVarM2757 = null;
        u8.e eVar = null;
        q8.l lVarM238 = null;
        Object objM1049 = obj;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56539:
                    str = "ۣۢۦ";
                    d0Var = (m9.d0) objM1049;
                    break;
                case 1747932:
                    str = "ۡۢۤ";
                    lVarM238 = C0012.m238();
                    break;
                case 1748707:
                    objM1049 = C0054.m1049(this, lVarM238);
                    str = "ۣۣۧ";
                    break;
                case 1749826:
                    str = "۠ۨۤ";
                    this = (b0) eVarM2757;
                    break;
                case 1750631:
                    str = "ۦ۠ۨ";
                    eVar = (u8.e) obj2;
                    break;
                case 1754503:
                    return objM1049;
                default:
                    eVarM2757 = C0144.m2757(this, d0Var, eVar);
                    str = "ۢۧۧ";
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        int i10 = 0;
        v8.a aVarM5766 = C0300.m5766();
        int iM1765 = C0082.m1765(this);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = iM1765 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = iM1765 == 1 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0127.m2451(m6414(), 0, C0434.f704 ^ (-546), 2759));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0330.m6365(obj);
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i13 = 48674;
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
                    C0330.m6365(obj);
                    p9.c0 c0VarM6449 = C0333.m6449((x.m) C0336.m6510(this));
                    a0 a0Var = new a0(C0226.m4332(this), i10);
                    this.f8725a = 1;
                    C0014.m280(c0VarM6449);
                    v8.a aVarM2412 = C0125.m2412(c0VarM6449, a0Var, this);
                    int i14 = 48767;
                    while (true) {
                        i14 ^= 48784;
                        switch (i14) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case 76:
                                return aVarM5766;
                            case 239:
                                i14 = aVarM2412 == aVarM5766 ? 48860 : 48829;
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
        return C0012.m238();
    }
}
