package f0;

import a.C0000;
import aa.C0012;
import c4.C0066;
import com.google.android.gms.internal.stats.C0101;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.sql.C0208;
import d4.C0218;
import dagger.hilt.internal.aggregatedroot.codegen.C0246;
import dagger.hilt.internal.componenttreedeps.C0249;
import e7.C0265;
import g9.C0295;
import ia.C0323;
import j2.C0325;
import o7.i2;
import s8.C0417;

/* JADX INFO: loaded from: classes.dex */
public final class n implements p9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f5818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2.b0 f5819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0.v0 f5820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g2.o f5821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g2.s f5822e;

    public n(c2 c2Var, g2.b0 b0Var, h0.v0 v0Var, g2.o oVar, g2.s sVar) {
        this.f5818a = c2Var;
        this.f5819b = b0Var;
        this.f5820c = v0Var;
        this.f5821d = oVar;
        this.f5822e = sVar;
        int iM3643 = C0191.m3643();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3643 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0265.m5049("56ZN9g1Yo")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    @Override // p9.g
    public final Object emit(Object obj, u8.e eVar) {
        boolean zM14 = C0000.m14((Boolean) obj);
        c2 c2VarM1273 = C0066.m1273(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = zM14 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM6272 = C0325.m6272(c2VarM1273);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM6272) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                C0218.m4146(c2VarM1273);
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                g2.a0 a0VarM6231 = C0323.m6231(C0246.m4705(this));
                                c2VarM1273.f5640e = C0120.m2320(C0187.m3577(this), a0VarM6231, C0101.m1984(c2VarM1273), C0208.m3985(this), C0249.m4757(c2VarM1273), C0183.m3493(c2VarM1273));
                                C0295.m5664(c2VarM1273, a0VarM6231, C0417.m8189(this));
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                    C0218.m4146(c2VarM1273);
                    break;
                default:
                    break;
            }
        }
        return C0012.m238();
    }
}
