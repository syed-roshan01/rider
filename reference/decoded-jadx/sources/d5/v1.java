package d5;

import aa.C0012;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.ui.input.pointer.C0034;
import androidx.compose.ui.platform.C0038;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0169;
import com.google.firebase.iid.C0171;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.tracing.C0204;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.migration.C0254;
import e2.C0261;
import g3.C0288;
import h1.C0300;
import i6.C0319;
import i6.C0320;
import m5.C0354;
import p3.C0375;
import s.C0408;
import s2.C0411;
import u.C0429;
import u4.C0435;
import w2.C0456;
import x5.C0470;
import y9.C0478;
import z3.C0487;

/* JADX INFO: loaded from: classes.dex */
public final class v1 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.a f4810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.g1 f4811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(c9.a aVar, m0.g1 g1Var, int i10) {
        super(C0169.f193 ^ 742);
        this.f4809a = i10;
        this.f4810b = aVar;
        this.f4811c = g1Var;
        int iM7362 = C0375.m7362();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7362 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0354.m6958("vj")));
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
        int i11 = 0;
        Object objM2417 = C0125.m2417();
        int iM6194 = C0320.m6194(this);
        m0.g1 g1VarM2712 = C0141.m2712(this);
        c9.a aVarM9488 = C0487.m9488(this);
        switch (iM6194) {
            case 0:
                int i12 = C0429.f700;
                int i13 = 49790;
                while (true) {
                    i13 ^= 49807;
                    switch (i13) {
                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case 51:
                            break;
                        case 84:
                            m0.q qVar = (m0.q) mVar;
                            boolean zM1625 = C0074.m1625(qVar);
                            int i14 = 49914;
                            while (true) {
                                i14 ^= 49931;
                                switch (i14) {
                                    case 497:
                                        i14 = !zM1625 ? 50658 : 50627;
                                        break;
                                    case 1711:
                                        break;
                                    case 1736:
                                        C0470.m9156(qVar);
                                        int i15 = 50813;
                                        while (true) {
                                            i15 ^= 50830;
                                            switch (i15) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 243:
                                                    i15 = 50844;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 1769:
                                        int i16 = 50689;
                                        while (true) {
                                            i16 ^= 50706;
                                            switch (i16) {
                                                case 19:
                                                    i16 = 50720;
                                                    continue;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                        case 241:
                            i13 = ((i12 ^ 323) & i10) == 2 ? 49883 : 49852;
                            break;
                        default:
                            break;
                    }
                }
                m0.q qVar2 = (m0.q) mVar;
                C0261.m4990(qVar2, 1011745719 ^ C0456.f727);
                boolean zM5551 = C0288.m5551(qVar2, aVarM9488);
                Object objM8078 = C0411.m8078(qVar2);
                int i17 = 51588;
                while (true) {
                    i17 ^= 51605;
                    switch (i17) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i17 = !zM5551 ? 51681 : 51650;
                            break;
                        case 54:
                            break;
                        case 87:
                            break;
                        case 116:
                            int i18 = 51712;
                            while (true) {
                                i18 ^= 51729;
                                switch (i18) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i18 = objM8078 == objM2417 ? 51805 : 51774;
                                        break;
                                    case 47:
                                        break;
                                    case 76:
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    C0171.m3270(qVar2, false);
                    C0408.m8011((c9.a) objM8078, null, false, null, null, null, null, null, null, C0254.m4868(), qVar2, (-805306585) ^ C0038.f58, C0023.f43 ^ (-587));
                    break;
                }
                objM8078 = new u1(aVarM9488, g1VarM2712, i11);
                C0478.m9328(qVar2, objM8078);
                C0171.m3270(qVar2, false);
                C0408.m8011((c9.a) objM8078, null, false, null, null, null, null, null, null, C0254.m4868(), qVar2, (-805306585) ^ C0038.f58, C0023.f43 ^ (-587));
                break;
            default:
                int i19 = C0204.f228;
                int i20 = 1616;
                while (true) {
                    i20 ^= 1633;
                    switch (i20) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i20 = ((i19 ^ 786) & i10) == 2 ? 1709 : 1678;
                            break;
                        case 204:
                            m0.q qVar3 = (m0.q) mVar;
                            boolean zM1626 = C0074.m1625(qVar3);
                            int i21 = 1740;
                            while (true) {
                                i21 ^= 1757;
                                switch (i21) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i21 = !zM1626 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        C0470.m9156(qVar3);
                                        int i22 = 48767;
                                        while (true) {
                                            i22 ^= 48784;
                                            switch (i22) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 239:
                                                    i22 = 48798;
                                                    break;
                                            }
                                        }
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        int i23 = 1864;
                                        while (true) {
                                            i23 ^= 1881;
                                            switch (i23) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i23 = 48674;
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
                }
                m0.q qVar4 = (m0.q) mVar;
                C0261.m4990(qVar4, 2125508686 ^ C0118.f144);
                boolean zM5552 = C0288.m5551(qVar4, aVarM9488);
                Object objM8079 = C0411.m8078(qVar4);
                int i24 = 48891;
                while (true) {
                    i24 ^= 48908;
                    switch (i24) {
                        case 22:
                            break;
                        case 53:
                            break;
                        case 503:
                            if (!zM5552) {
                                i24 = 49635;
                            }
                            break;
                        case 32495:
                            int i25 = 49666;
                            while (true) {
                                i25 ^= 49683;
                                switch (i25) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (objM8079 == objM2417) {
                                            i25 = 49759;
                                        }
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        break;
                                    case 83:
                                        C0171.m3270(qVar4, false);
                                        C0408.m8011((c9.a) objM8079, null, false, null, null, null, null, null, null, C0319.m6186(), qVar4, (-805307063) ^ C0235.f315, C0300.f448 ^ (-785));
                                        break;
                                    default:
                                        continue;
                                }
                                i25 = 49728;
                            }
                            break;
                        default:
                            continue;
                    }
                    i24 = 48953;
                }
                objM8079 = new u1(aVarM9488, g1VarM2712, 1);
                C0478.m9328(qVar4, objM8079);
                C0171.m3270(qVar4, false);
                C0408.m8011((c9.a) objM8079, null, false, null, null, null, null, null, null, C0319.m6186(), qVar4, (-805307063) ^ C0235.f315, C0300.f448 ^ (-785));
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0320.m6194(this)) {
            case 0:
                C0034.m671(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
            default:
                C0034.m671(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
