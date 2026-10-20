package k0;

import a.C0001;
import aa.C0012;
import c1.C0059;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import dagger.hilt.internal.aliasof.C0248;
import f6.C0279;
import i.C0317;
import i9.C0322;
import n.C0362;
import o1.C0368;
import q0.C0383;
import q6.C0389;
import r2.C0396;
import t2.C0424;
import u2.C0434;
import u4.C0436;
import w1.C0456;
import x5.C0471;
import y.C0476;
import z8.C0493;

/* JADX INFO: loaded from: classes.dex */
public final class f3 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.e f8925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.e f8926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f8927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8930f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(c9.e eVar, c9.e eVar2, c9.e eVar3, long j10, long j11, boolean z10) {
        super(C0279.f423 ^ (-120));
        this.f8925a = eVar;
        this.f8926b = eVar2;
        this.f8927c = eVar3;
        this.f8928d = j10;
        this.f8929e = j11;
        this.f8930f = z10;
        int iM7199 = C0368.m7199();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7199 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0001.m38("I7mmVg9J1dRowHdrHp")));
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
    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        m0.m mVar = (m0.m) obj;
        int iM8515 = C0436.m8515((Number) obj2);
        int i10 = C0317.f464;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ 172) & iM8515) == 2 ? 1709 : 1678;
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
        m0.m3 m3VarM8878 = C0456.m8878();
        m0.q qVar2 = (m0.q) mVar;
        C0396.m7736(C0434.m8483(C0424.m8312(), C0112.m2156((e5) C0476.m9256(qVar2, m3VarM8878), C0383.m7488())), C0059.m1122(mVar, 835891593 ^ C0197.f221, new e3(C0122.m2344(this), C0493.m9569(this), C0389.m7601(this), C0112.m2156((e5) C0476.m9256(qVar2, m3VarM8878), C0089.f123 ^ 384), C0248.m4738(this), C0322.m6214(this), C0116.m2237(this))), mVar, C0362.f632 ^ 17);
        return C0012.m238();
    }
}
