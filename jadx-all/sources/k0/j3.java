package k0;

import aa.C0012;
import b4.C0052;
import b7.C0053;
import c6.C0067;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.measurement.internal.C0104;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.iid.C0171;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import d9.C0223;
import d9.C0226;
import e2.C0262;
import k3.C0335;
import m0.C0350;
import s.C0408;
import t0.C0419;
import u0.C0431;
import u4.C0436;
import v0.C0442;
import v7.C0449;
import x5.C0471;
import x7.C0472;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public final class j3 extends d9.j implements c9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9075b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3(Object obj, int i10) {
        super(C0490.f763 ^ (-530));
        this.f9074a = i10;
        this.f9075b = obj;
        int iM2034 = C0104.m2034();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2034 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0130.m2509("FXinvwMauPP61LNF5lBoym64VjL")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0098. Please report as an issue. */
    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        int iM1022 = C0052.m1022(this);
        Object objM1942 = C0091.m1942(this);
        switch (iM1022) {
            case 0:
                m0.m mVar = (m0.m) obj2;
                int iM8515 = C0436.m8515((Number) obj3);
                int i10 = C0408.f678;
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i11 = ((i10 ^ (-509)) & iM8515) == 16 ? 1709 : 1678;
                            break;
                        case 204:
                            m0.q qVar = (m0.q) mVar;
                            boolean zM1625 = C0074.m1625(qVar);
                            int i12 = 1740;
                            while (true) {
                                i12 ^= 1757;
                                switch (i12) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (!zM1625) {
                                            i12 = 1833;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        C0471.m9156(qVar);
                                        int i13 = 48767;
                                        while (true) {
                                            i13 ^= 48784;
                                            switch (i13) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 239:
                                                    i13 = 48798;
                                                    break;
                                            }
                                        }
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        int i14 = 1864;
                                        while (true) {
                                            i14 ^= 1881;
                                            switch (i14) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i14 = 48674;
                                                    break;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i12 = 1802;
                            }
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                    return C0012.m238();
                }
                C0185.m3537((String) objM1942, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mVar, 0, 0, (-130651) ^ C0202.f226);
                return C0012.m238();
            default:
                C0436.m8515((Number) obj3);
                m0.q qVar2 = (m0.q) ((m0.m) obj2);
                C0262.m4990(qVar2, 1541270940 ^ C0195.f219);
                d4 d4Var = (d4) objM1942;
                float fM1295 = C0067.m1295(d4Var);
                t.w wVarM4335 = C0226.m4335();
                int i15 = C0223.f302 ^ 454;
                y0.o oVarM8431 = C0431.m8431(C0335.m6495(C0442.m8617(C0449.m8743((y0.o) obj, C0123.m2371()), C0166.m3171()), C0152.m2924((m2.e) C0419.m8214(C0350.m6858(C0472.m9174(d4Var), C0053.m1033(250, 0, wVarM4335, i15), qVar2, 0))), 0), C0152.m2924((m2.e) C0419.m8214(C0350.m6858(fM1295, C0053.m1033(250, 0, wVarM4335, i15), qVar2, 0))));
                C0171.m3270(qVar2, false);
                return oVarM8431;
        }
    }
}
