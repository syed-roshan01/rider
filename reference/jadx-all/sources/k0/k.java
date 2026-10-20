package k0;

import aa.C0012;
import androidx.compose.ui.input.pointer.C0034;
import c1.C0059;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0203;
import dagger.hilt.android.internal.modules.C0235;
import dagger.hilt.android.lifecycle.C0237;
import h.C0298;
import i4.C0318;
import ja.C0331;
import m1.C0351;
import m4.C0354;
import o1.C0368;
import o2.C0369;
import q0.C0382;
import r5.C0401;
import t7.C0426;
import u4.C0436;
import w9.C0466;
import x5.C0471;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public final class k extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.e f9080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.e f9081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f9082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e1.l0 f9083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f9085f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f9086n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f9087o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f9088p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c9.e f9089q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c9.e f9090r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c9.e eVar, c9.e eVar2, c9.e eVar3, e1.l0 l0Var, long j10, float f10, long j11, long j12, long j13, c9.e eVar4, c9.e eVar5) {
        super(C0368.f638 ^ (-547));
        this.f9080a = eVar;
        this.f9081b = eVar2;
        this.f9082c = eVar3;
        this.f9083d = l0Var;
        this.f9084e = j10;
        this.f9085f = f10;
        this.f9086n = j11;
        this.f9087o = j12;
        this.f9088p = j13;
        this.f9089q = eVar4;
        this.f9090r = eVar5;
        int iM7234 = C0369.m7234();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7234 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0298.m5717("mq7gaJO")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0010. Please report as an issue. */
    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        m0.m mVar = (m0.m) obj;
        int iM8515 = C0436.m8515((Number) obj2);
        int i10 = C0111.f137;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ (-772)) & iM8515) == 2 ? 1709 : 1678;
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
        u0.b bVarM1122 = C0059.m1122(mVar, 3244317 ^ C0203.f227, new j(C0426.m8331(this), C0331.m6395(this), 1));
        c9.e eVarM2875 = C0150.m2875(this);
        c9.e eVarM9533 = C0490.m9533(this);
        c9.e eVarM7845 = C0401.m7845(this);
        e1.l0 l0VarM6877 = C0351.m6877(this);
        long jM9066 = C0466.m9066(this);
        float fM6920 = C0354.m6920(this);
        C0159.m3049();
        C0079.m1713(bVarM1122, null, eVarM2875, eVarM9533, eVarM7845, l0VarM6877, jM9066, fM6920, C0235.m4507(C0122.f148 ^ (-46), mVar), C0318.m6149(this), C0382.m7476(this), C0237.m4559(this), mVar, 6, 0, C0034.f54 ^ 517);
        return C0012.m238();
    }
}
