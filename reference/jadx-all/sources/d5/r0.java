package d5;

import a6.C0007;
import aa.C0012;
import androidx.startup.C0047;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.internal.modules.C0234;
import h4.C0306;
import k0.a3;
import m1.C0351;
import r2.C0395;
import r5.C0401;
import u4.C0436;
import w4.C0461;
import x5.C0471;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f4751b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(a3 a3Var, int i10) {
        super(C0140.f166 ^ 65);
        this.f4750a = i10;
        this.f4751b = a3Var;
        int iM8972 = C0461.m8972();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8972 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0007.m151("4FBHgK6i1BN8KKPF7FnaJTKjU")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public final void a(m0.m mVar, int i10) {
        switch (C0158.m3016(this)) {
            case 0:
                int i11 = C0306.f453;
                int i12 = 48891;
                while (true) {
                    i12 ^= 48908;
                    switch (i12) {
                        case 22:
                            break;
                        case 53:
                            break;
                        case 503:
                            i12 = ((i11 ^ (-381)) & i10) == 2 ? 49635 : 48953;
                            break;
                        case 32495:
                            m0.q qVar = (m0.q) mVar;
                            boolean zM1625 = C0074.m1625(qVar);
                            int i13 = 49666;
                            while (true) {
                                i13 ^= 49683;
                                switch (i13) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i13 = !zM1625 ? 49759 : 49728;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        int i14 = 49790;
                                        while (true) {
                                            i14 ^= 49807;
                                            switch (i14) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 241:
                                                    i14 = 49821;
                                                    continue;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 83:
                                        C0471.m9156(qVar);
                                        int i15 = 49914;
                                        while (true) {
                                            i15 ^= 49931;
                                            switch (i15) {
                                                case 497:
                                                    i15 = 50596;
                                                    break;
                                                case 1711:
                                                    break;
                                            }
                                        }
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
                C0351.m6870(C0047.m902(this), null, null, mVar, C0131.f157 ^ (-879), C0174.f198 ^ (-175));
                break;
            default:
                int i16 = C0234.f313;
                int i17 = 1616;
                while (true) {
                    i17 ^= 1633;
                    switch (i17) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (((i16 ^ 309) & i10) == 2) {
                                i17 = 1709;
                            }
                            break;
                        case 204:
                            m0.q qVar2 = (m0.q) mVar;
                            boolean zM1626 = C0074.m1625(qVar2);
                            int i18 = 1740;
                            while (true) {
                                i18 ^= 1757;
                                switch (i18) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (!zM1626) {
                                            i18 = 1833;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        C0471.m9156(qVar2);
                                        int i19 = 48767;
                                        while (true) {
                                            i19 ^= 48784;
                                            switch (i19) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 239:
                                                    i19 = 48798;
                                                    break;
                                            }
                                        }
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        int i20 = 1864;
                                        while (true) {
                                            i20 ^= 1881;
                                            switch (i20) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i20 = 48674;
                                                    break;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i18 = 1802;
                            }
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i17 = 1678;
                }
                C0351.m6870(C0047.m902(this), null, null, mVar, C0395.f665 ^ 73, C0137.f163 ^ 100);
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0158.m3016(this)) {
            case 0:
                C0401.m7846(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            default:
                C0401.m7846(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
