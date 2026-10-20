package d5;

import aa.C0012;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.measurement.C0183;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0224;
import f6.C0277;
import h8.C0314;
import r6.C0402;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g5.a f4651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.g1 f4652c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(g5.a aVar, m0.g1 g1Var, int i10) {
        super(0);
        this.f4650a = i10;
        this.f4651b = aVar;
        this.f4652c = g1Var;
        int iM3510 = C0183.m3510();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3510 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0173.m3303("3Is5L")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    @Override // c9.a
    public final Object invoke() {
        q8.l lVarM238 = C0012.m238();
        g5.a aVarM5366 = C0277.m5366(this);
        m0.g1 g1VarM1746 = C0081.m1746(this);
        int iM6081 = C0314.m6081(this);
        switch (iM6081) {
            case 0:
                switch (iM6081) {
                    case 0:
                        C0224.m4315(g1VarM1746, C0402.m7887(aVarM5366));
                        return lVarM238;
                    default:
                        C0224.m4315(g1VarM1746, C0402.m7887(aVarM5366));
                        int i10 = 1740;
                        while (true) {
                            i10 ^= 1757;
                            switch (i10) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i10 = 1771;
                                    break;
                                case 54:
                                    return lVarM238;
                            }
                        }
                        break;
                }
                break;
            default:
                switch (iM6081) {
                    case 0:
                        C0224.m4315(g1VarM1746, C0402.m7887(aVarM5366));
                        return lVarM238;
                    default:
                        C0224.m4315(g1VarM1746, C0402.m7887(aVarM5366));
                        int i11 = 1616;
                        while (true) {
                            i11 ^= 1633;
                            switch (i11) {
                                case Code.UNAVAILABLE /* 14 */:
                                    return lVarM238;
                                case 49:
                                    i11 = 1647;
                                    break;
                            }
                        }
                        break;
                }
                break;
        }
    }
}
