package k0;

import a.C0000;
import a7.C0008;
import aa.C0012;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.foundation.layout.FillElement;
import androidx.fragment.app.C0042;
import c0.C0057;
import c1.C0059;
import c3.C0062;
import com.auto.accept.data.model.C0071;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.tasks.C0103;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.iid.C0171;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0224;
import dagger.hilt.android.components.C0229;
import dagger.hilt.internal.aggregatedroot.codegen.C0246;
import dagger.hilt.internal.definecomponent.C0250;
import e2.C0262;
import f.C0270;
import g9.C0295;
import h3.C0304;
import i.C0316;
import java.util.ArrayList;
import java.util.List;
import l3.C0343;
import m4.C0354;
import m7.C0358;
import n.C0361;
import p4.C0377;
import r7.C0405;
import s0.C0411;
import s2.C0412;
import t9.C0428;
import u4.C0436;
import w.C0454;
import x5.C0471;
import y9.C0479;
import z.C0482;
import z3.C0487;

/* JADX INFO: loaded from: classes.dex */
public final class j4 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.e f9077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f9078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9.f f9079d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j4(c9.e eVar, c9.e eVar2, c9.f fVar, int i10) {
        super(C0304.f451 ^ (-608));
        this.f9076a = i10;
        this.f9077b = eVar;
        this.f9078c = eVar2;
        this.f9079d = fVar;
        int iM5663 = C0295.m5663();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5663 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0042.m831("CO5Rff")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:101:0x023c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0035. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x0133. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0019. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x018b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:87:0x01d4. Please report as an issue. */
    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        int iM8378 = C0428.m8378(this);
        c9.e eVarM9383 = C0482.m9383(this);
        switch (iM8378) {
            case 0:
                r1.i1 i1Var = (r1.i1) obj;
                long jM2241 = C0116.m2241((m2.a) obj2);
                int iM3212 = C0168.m3212(jM2241);
                List listM1463 = C0071.m1463(i1Var, C0158.m3007(), eVarM9383);
                int iM171 = C0008.m171(listM1463);
                d9.s sVar = new d9.s();
                int i10 = 49790;
                while (true) {
                    i10 ^= 49807;
                    switch (i10) {
                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case 51:
                            break;
                        case 84:
                            sVar.f4950a = iM3212 / iM171;
                            break;
                        case 241:
                            i10 = iM171 > 0 ? 49883 : 49852;
                            break;
                        default:
                            break;
                    }
                }
                Integer numM1083 = C0057.m1083(0);
                int iM172 = C0008.m171(listM1463);
                int i11 = 0;
                while (true) {
                    int i12 = i11;
                    int i13 = 49914;
                    while (true) {
                        i13 ^= 49931;
                        switch (i13) {
                            case 497:
                                i13 = i12 < iM172 ? 50658 : 50627;
                                break;
                            case 1711:
                                break;
                            case 1736:
                                break;
                            case 1769:
                                break;
                            default:
                                break;
                        }
                        int iM8515 = C0436.m8515(numM1083);
                        ArrayList arrayList = new ArrayList(C0008.m171(listM1463));
                        int iM173 = C0008.m171(listM1463);
                        int i14 = 0;
                        while (true) {
                            int i15 = i14;
                            int i16 = 50813;
                            while (true) {
                                i16 ^= 50830;
                                switch (i16) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 53:
                                        break;
                                    case 243:
                                        i16 = i15 < iM173 ? 51557 : 50875;
                                        break;
                                    case 4075:
                                        break;
                                    default:
                                        break;
                                }
                                ArrayList arrayList2 = new ArrayList(iM171);
                                int i17 = 0;
                                while (true) {
                                    int i18 = i17;
                                    int i19 = 51712;
                                    while (true) {
                                        i19 ^= 51729;
                                        switch (i19) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i19 = i18 < iM171 ? 51805 : 51774;
                                                break;
                                            case 47:
                                                break;
                                            case 76:
                                                break;
                                            default:
                                                break;
                                        }
                                        return C0411.m8048(i1Var, iM3212, iM8515, C0127.m2452(), new i4(arrayList, i1Var, C0229.m4406(this), sVar, jM2241, iM8515, C0224.m4295(this), arrayList2, iM3212));
                                    }
                                    m2.e eVar = new m2.e(((C0377.m7374(i1Var, C0062.m1191(C0021.m420((r1.i0) C0316.m6101(listM1463, i18), iM8515), C0270.m5138(sVar))) - 18.0f) - (C0119.m2292() * 2)) + 18.0f);
                                    m2.e eVar2 = new m2.e(C0354.f624 ^ 865);
                                    int iM3850 = C0201.m3850(eVar, eVar2);
                                    int i20 = 51836;
                                    while (true) {
                                        i20 ^= 51853;
                                        switch (i20) {
                                            case 241:
                                                i20 = iM3850 >= 0 ? 52580 : 52549;
                                                break;
                                            case 1963:
                                                break;
                                            case 1992:
                                                break;
                                            case 2025:
                                                int i21 = 52611;
                                                while (true) {
                                                    i21 ^= 52628;
                                                    switch (i21) {
                                                        case 23:
                                                            i21 = 52642;
                                                            break;
                                                        case 54:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    eVar2 = eVar;
                                                    break;
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    C0358.m6998(arrayList2, new d4(C0377.m7374(i1Var, C0270.m5138(sVar)) * i18, C0377.m7374(i1Var, C0270.m5138(sVar)), C0152.m2924(eVar2)));
                                    i17 = (C0361.f631 ^ 739) + i18;
                                    int i22 = 52735;
                                    while (true) {
                                        i22 ^= 52752;
                                        switch (i22) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 1007:
                                                i22 = 52766;
                                                break;
                                        }
                                    }
                                }
                            }
                            r1.i0 i0Var = (r1.i0) C0316.m6101(listM1463, i15);
                            int iM5138 = C0270.m5138(sVar);
                            C0358.m6998(arrayList, C0454.m8844(i0Var, C0343.m6721(iM5138, iM5138, iM8515, iM8515)));
                            i14 = (C0405.f675 ^ 807) + i15;
                            int i23 = 51588;
                            while (true) {
                                i23 ^= 51605;
                                switch (i23) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i23 = 51619;
                                        break;
                                    case 54:
                                        break;
                                }
                            }
                        }
                    }
                    numM1083 = C0057.m1083(C0059.m1119(C0109.m2113((r1.i0) C0316.m6101(listM1463, i12), C0270.m5138(sVar)), C0436.m8515(numM1083)));
                    i11 = (C0000.f768 ^ (-120)) + i12;
                    int i24 = 50689;
                    while (true) {
                        i24 ^= 50706;
                        switch (i24) {
                            case 19:
                                i24 = 50720;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                        }
                    }
                }
                break;
            default:
                m0.m mVar = (m0.m) obj;
                int iM8516 = C0436.m8515((Number) obj2);
                int i25 = C0250.f329;
                int i26 = 1616;
                while (true) {
                    i26 ^= 1633;
                    switch (i26) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i26 = ((i25 ^ (-825)) & iM8516) == 2 ? 1709 : 1678;
                            break;
                        case 204:
                            m0.q qVar = (m0.q) mVar;
                            boolean zM1625 = C0074.m1625(qVar);
                            int i27 = 1740;
                            while (true) {
                                i27 ^= 1757;
                                switch (i27) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i27 = !zM1625 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        C0471.m9156(qVar);
                                        int i28 = 48767;
                                        while (true) {
                                            i28 ^= 48784;
                                            switch (i28) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 239:
                                                    i28 = 48798;
                                                    break;
                                            }
                                        }
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        int i29 = 1864;
                                        while (true) {
                                            i29 ^= 1881;
                                            switch (i29) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i29 = 48674;
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
                FillElement fillElementM2371 = C0123.m2371();
                m0.q qVar2 = (m0.q) mVar;
                C0262.m4990(qVar2, (-1028159478) ^ C0246.f325);
                boolean zM2013 = C0103.m2013(qVar2, eVarM9383);
                c9.e eVarM4406 = C0229.m4406(this);
                boolean zM2014 = C0103.m2013(qVar2, eVarM4406);
                boolean z10 = (zM2013 ^ zM2014) | (zM2013 & zM2014);
                c9.f fVarM4295 = C0224.m4295(this);
                boolean zM2015 = C0103.m2013(qVar2, fVarM4295);
                Object objM8078 = C0412.m8078(qVar2);
                int i30 = 48891;
                while (true) {
                    i30 ^= 48908;
                    switch (i30) {
                        case 22:
                            break;
                        case 53:
                            objM8078 = new j4(eVarM9383, eVarM4406, fVarM4295, 0);
                            C0479.m9328(qVar2, objM8078);
                            break;
                        case 503:
                            if (!(z10 ^ zM2015) && !(z10 & zM2015)) {
                                i30 = 49635;
                            }
                            break;
                        case 32495:
                            Object objM2417 = C0125.m2417();
                            int i31 = 49666;
                            while (true) {
                                i31 ^= 49683;
                                switch (i31) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (objM8078 == objM2417) {
                                            i31 = 49759;
                                        }
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        objM8078 = new j4(eVarM9383, eVarM4406, fVarM4295, 0);
                                        C0479.m9328(qVar2, objM8078);
                                        break;
                                    case 83:
                                        break;
                                    default:
                                        continue;
                                }
                                i31 = 49728;
                            }
                            break;
                        default:
                            continue;
                    }
                    i30 = 48953;
                }
                C0171.m3270(qVar2, false);
                C0120.m2317(fillElementM2371, (c9.e) objM8078, qVar2, C0487.f760 ^ 226, 0);
                return C0012.m238();
        }
    }
}
