package k0;

import a7.C0008;
import aa.C0012;
import androidx.compose.foundation.C0026;
import com.auto.accept.data.model.C0071;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.firebase.components.C0135;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0171;
import com.google.firebase.measurement.C0181;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0198;
import dagger.hilt.internal.aggregatedroot.C0247;
import e2.C0262;
import e9.C0267;
import ea.C0268;
import p8.C0380;
import q6.C0388;
import s0.C0410;
import u4.C0436;
import v0.C0444;
import w6.C0465;
import x5.C0471;
import z1.C0484;

/* JADX INFO: loaded from: classes.dex */
public final class e3 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.e f8867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.e f8868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f8869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2.c0 f8870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f8872f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f8873n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(c9.e eVar, c9.e eVar2, c9.e eVar3, a2.c0 c0Var, long j10, long j11, boolean z10) {
        super(C0192.f216 ^ (-804));
        this.f8867a = eVar;
        this.f8868b = eVar2;
        this.f8869c = eVar3;
        this.f8870d = c0Var;
        this.f8871e = j10;
        this.f8872f = j11;
        this.f8873n = z10;
        int iM508 = C0026.m508();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM508 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0181.m3454("uka9E3Uz")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x002a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000f. Please report as an issue. */
    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        m0.m mVar = (m0.m) obj;
        int iM8515 = C0436.m8515((Number) obj2);
        int i10 = C0484.f757;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ (-784)) & iM8515) == 2 ? 1709 : 1678;
                    break;
                case 204:
                    m0.q qVar = (m0.q) mVar;
                    boolean zM1625 = C0074.m1625(qVar);
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = !zM1625 ? 1833 : 1802;
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
        c9.e eVarM1448 = C0071.m1448(this);
        int i15 = 48891;
        while (true) {
            i15 ^= 48908;
            switch (i15) {
                case 22:
                    break;
                case 53:
                    boolean zM4724 = C0247.m4724(this);
                    int i16 = 49790;
                    while (true) {
                        i16 ^= 49807;
                        switch (i16) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 51:
                                m0.q qVar2 = (m0.q) mVar;
                                C0262.m4990(qVar2, 2104361690 ^ C0410.f680);
                                C0198.m3799(C0380.m7452(this), C0071.m1448(this), C0268.m5107(this), C0388.m7588(this), C0135.m2606(this), C0465.m9057(this), qVar2, 0);
                                C0171.m3270(qVar2, false);
                                break;
                            case 84:
                                m0.q qVar3 = (m0.q) mVar;
                                C0262.m4990(qVar3, 2104362816 ^ C0444.f714);
                                C0071.m1453(C0380.m7452(this), C0071.m1448(this), C0268.m5107(this), C0388.m7588(this), C0135.m2606(this), C0465.m9057(this), qVar3, 0);
                                C0171.m3270(qVar3, false);
                                int i17 = 49914;
                                while (true) {
                                    i17 ^= 49931;
                                    switch (i17) {
                                        case 497:
                                            i17 = 50596;
                                            break;
                                        case 1711:
                                            break;
                                    }
                                }
                                break;
                            case 241:
                                if (zM4724) {
                                    i16 = 49883;
                                }
                                break;
                            default:
                                break;
                        }
                        i16 = 49852;
                    }
                    break;
                case 503:
                    if (eVarM1448 == null) {
                        i15 = 49635;
                    }
                    break;
                case 32495:
                    m0.q qVar4 = (m0.q) mVar;
                    C0262.m4990(qVar4, 2104362662 ^ C0267.f346);
                    C0198.m3799(C0380.m7452(this), null, C0268.m5107(this), C0388.m7588(this), C0135.m2606(this), C0465.m9057(this), qVar4, C0008.f28 ^ (-56));
                    C0171.m3270(qVar4, false);
                    int i18 = 49666;
                    while (true) {
                        i18 ^= 49683;
                        switch (i18) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i18 = 49697;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i15 = 48953;
        }
        return C0012.m238();
    }
}
