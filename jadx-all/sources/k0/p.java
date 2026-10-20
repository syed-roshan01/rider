package k0;

import a2.C0004;
import aa.C0012;
import androidx.annotation.C0019;
import androidx.compose.ui.draw.C0029;
import b8.C0055;
import com.auto.accept.data.model.C0071;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.measurement.internal.C0104;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.installations.C0177;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0213;
import d9.C0227;
import dagger.hilt.codegen.C0243;
import e1.C0260;
import f4.C0277;
import f6.C0278;
import g.C0283;
import g9.C0295;
import k8.C0339;
import p7.C0379;
import u0.C0431;
import u4.C0436;
import v6.C0448;
import w4.C0460;
import x5.C0471;
import y.C0476;
import y9.C0479;

/* JADX INFO: loaded from: classes.dex */
public final class p extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y.i1 f9326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d5 f9327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f9328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2.c0 f9329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c9.e f9331f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c9.e f9332n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(y.i1 i1Var, d5 d5Var, c9.e eVar, a2.c0 c0Var, boolean z10, c9.e eVar2, u0.b bVar) {
        super(C0213.f236 ^ 234);
        this.f9326a = i1Var;
        this.f9327b = d5Var;
        this.f9328c = eVar;
        this.f9329d = c0Var;
        this.f9330e = z10;
        this.f9331f = eVar2;
        this.f9332n = bVar;
        int iM375 = C0019.m375();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM375 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0029.m559("LXFjOzc")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0028. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        Object objM2180;
        m0.m mVar = (m0.m) obj;
        int iM8515 = C0436.m8515((Number) obj2);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = ((iM8515 ^ (-4)) & iM8515) == 2 ? 1709 : 1678;
                    break;
                case 204:
                    m0.q qVar = (m0.q) mVar;
                    boolean zM1625 = C0074.m1625(qVar);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = !zM1625 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                C0471.m9156(qVar);
                                int i12 = 48767;
                                while (true) {
                                    i12 ^= 48784;
                                    switch (i12) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 239:
                                            i12 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
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
                    break;
                default:
                    break;
            }
            return C0012.m238();
        }
        m0.q qVar2 = (m0.q) mVar;
        float fM2209 = C0114.m2209((m2.b) C0476.m9256(qVar2, C0479.m9327()), C0243.m4638());
        y0.l lVarM4370 = C0227.m4370();
        C0278.m5362();
        y0.o oVarM2619 = C0136.m2619(C0448.m8724(lVarM4370, new s.h(C0104.m2035(this), 3)));
        d5 d5VarM8437 = C0431.m8437(this);
        long jM2795 = C0146.m2795(d5VarM8437);
        long jM1059 = C0055.m1059(d5VarM8437);
        long jM7419 = C0379.m7419(d5VarM8437);
        c9.e eVarM75 = C0004.m75(this);
        a2.c0 c0VarM4953 = C0260.m4953(this);
        y.f fVarM5323 = C0277.m5323();
        boolean zM6653 = C0339.m6653(this);
        int i14 = 48891;
        while (true) {
            i14 ^= 48908;
            switch (i14) {
                case 22:
                    break;
                case 53:
                    objM2180 = C0113.m2180();
                    break;
                case 503:
                    if (zM6653) {
                        i14 = 49635;
                    }
                    break;
                case 32495:
                    int i15 = 49666;
                    while (true) {
                        i15 ^= 49683;
                        switch (i15) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = 49697;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                objM2180 = fVarM5323;
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i14 = 48953;
        }
        C0460.m8960(oVarM2619, ((14.0f + fM2209) + 0.0f) - 14.0f, jM2795, jM1059, jM7419, eVarM75, c0VarM4953, 1.0f, fVarM5323, objM2180, 0, false, C0071.m1449(this), C0177.m3384(this), qVar2, (-113247188) ^ C0283.f427, C0295.f442 ^ (-3755));
        return C0012.m238();
    }
}
