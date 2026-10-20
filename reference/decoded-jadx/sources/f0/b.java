package f0;

import aa.C0012;
import android.support.v4.app.C0014;
import androidx.activity.C0017;
import androidx.annotation.C0019;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.ui.semantics.C0039;
import androidx.preference.C0044;
import b7.C0054;
import c0.C0057;
import c3.C0063;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.C0177;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import d4.C0217;
import d9.C0226;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.android.lifecycle.C0236;
import e2.C0260;
import e2.C0261;
import ea.C0268;
import g4.C0289;
import h7.C0312;
import i6.C0320;
import k3.C0334;
import l0.C0339;
import m5.C0355;
import o7.i2;
import okhttp3.internal.publicsuffix.C0372;
import p5.C0377;
import p8.C0379;
import q0.C0382;
import q7.C0390;
import s2.C0411;
import u4.C0435;
import v5.C0445;
import v7.C0448;
import v9.C0451;
import w.C0453;
import w2.C0456;
import w6.C0464;
import x5.C0470;
import y9.C0478;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5605a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0.o f5606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f5607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c9.e eVar, y0.o oVar) {
        super(C0022.f42 ^ (-684));
        this.f5607c = eVar;
        this.f5606b = oVar;
        int iM8831 = C0453.m8831();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8831 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0054.m1044("UEpITI0t5wuz0ln11S3pBPD9FpYd")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y0.o oVar, c9.e eVar) {
        super(C0334.f518 ^ (-721));
        this.f5606b = oVar;
        this.f5607c = eVar;
        int iM3380 = C0177.m3380();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3380 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0183.m3506("OT7UH74qtEGx81")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:249:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x020a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x024c A[SYNTHETIC] */
    public final void a(m0.m mVar, int i10) {
        int i11;
        int i12;
        int i13 = 0;
        Integer numM1083 = C0057.m1083(0);
        y0.o oVarM3611 = C0189.m3611(this);
        int iM848 = C0044.m848(this);
        c9.e eVarM6031 = C0312.m6031(this);
        switch (iM848) {
            case 0:
                int i14 = C0372.f643;
                int i15 = 51712;
                while (true) {
                    i15 ^= 51729;
                    switch (i15) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i15 = ((i14 ^ (-465)) & i10) == 2 ? 51805 : 51774;
                            break;
                        case 47:
                            i11 = 53510;
                            while (true) {
                                i11 ^= 53527;
                                switch (i11) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i11 = eVarM6031 == null ? 53603 : 53572;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 83:
                                        m0.q qVar = (m0.q) mVar;
                                        C0261.m4990(qVar, 1275644788 ^ C0453.f724);
                                        C0464.m9049(eVarM6031, qVar, numM1083);
                                        C0171.m3270(qVar, false);
                                        break;
                                    case 116:
                                        m0.q qVar2 = (m0.q) mVar;
                                        C0261.m4990(qVar2, 1275643770 ^ C0377.f648);
                                        C0086.m1832(oVarM3611, qVar2, 0);
                                        C0171.m3270(qVar2, false);
                                        i12 = 53634;
                                        while (true) {
                                            i12 ^= 53651;
                                            switch (i12) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i12 = 53665;
                                                    continue;
                                                    continue;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                default:
                                                    continue;
                                                    continue;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 76:
                            m0.q qVar3 = (m0.q) mVar;
                            boolean zM1625 = C0074.m1625(qVar3);
                            int i16 = 51836;
                            while (true) {
                                i16 ^= 51853;
                                switch (i16) {
                                    case 241:
                                        i16 = !zM1625 ? 52580 : 52549;
                                        break;
                                    case 1963:
                                        break;
                                    case 1992:
                                        C0470.m9156(qVar3);
                                        int i17 = 52735;
                                        while (true) {
                                            i17 ^= 52752;
                                            switch (i17) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 1007:
                                                    i17 = 52766;
                                                    continue;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 2025:
                                        int i18 = 52611;
                                        while (true) {
                                            i18 ^= 52628;
                                            switch (i18) {
                                                case 23:
                                                    i18 = 52642;
                                                    continue;
                                                case 54:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i11 = 53510;
                                            while (true) {
                                                i11 ^= 53527;
                                                switch (i11) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (eVarM6031 == null) {
                                                        }
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 83:
                                                        m0.q qVar4 = (m0.q) mVar;
                                                        C0261.m4990(qVar4, 1275644788 ^ C0453.f724);
                                                        C0464.m9049(eVarM6031, qVar4, numM1083);
                                                        C0171.m3270(qVar4, false);
                                                        break;
                                                    case 116:
                                                        m0.q qVar5 = (m0.q) mVar;
                                                        C0261.m4990(qVar5, 1275643770 ^ C0377.f648);
                                                        C0086.m1832(oVarM3611, qVar5, 0);
                                                        C0171.m3270(qVar5, false);
                                                        i12 = 53634;
                                                        while (true) {
                                                            i12 ^= 53651;
                                                            switch (i12) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i12 = 53665;
                                                                    continue;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
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
                    int iM4984 = C0260.m4984();
                    int i19 = 53758;
                    while (true) {
                        i19 ^= 53775;
                        switch (i19) {
                            case 1009:
                                if (iM4984 <= 0) {
                                    i19 = 54502;
                                }
                                break;
                            case 1703:
                                break;
                            case 1736:
                                return;
                            case 1769:
                                System.out.println(Float.parseFloat(C0268.m5134("6bCXh7QVyPCtfKlBnAY0mA9yvC7")));
                                return;
                            default:
                                continue;
                        }
                        i19 = 54471;
                    }
                }
                break;
            default:
                int i20 = C0390.f661;
                int i21 = 1616;
                while (true) {
                    i21 ^= 1633;
                    switch (i21) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i21 = ((i20 ^ (-314)) & i10) == 2 ? 1709 : 1678;
                            break;
                        case 204:
                            m0.q qVar6 = (m0.q) mVar;
                            boolean zM1626 = C0074.m1625(qVar6);
                            int i22 = 1740;
                            while (true) {
                                i22 ^= 1757;
                                switch (i22) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i22 = !zM1626 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        C0470.m9156(qVar6);
                                        int i23 = 48767;
                                        while (true) {
                                            i23 ^= 48784;
                                            switch (i23) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    return;
                                                case 239:
                                                    i23 = 48798;
                                                    break;
                                            }
                                        }
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        int i24 = 1864;
                                        while (true) {
                                            i24 ^= 1881;
                                            switch (i24) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i24 = 48674;
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
                String strM6667 = C0339.m6667(2131624272 ^ C0233.f313, mVar);
                C0118.m2284();
                y0.o oVarM2337 = C0121.m2337(oVarM3611);
                y0.l lVarM4370 = C0226.m4370();
                m0.q qVar7 = (m0.q) mVar;
                C0261.m4990(qVar7, 874814219 ^ C0478.f752);
                boolean zM2013 = C0103.m2013(qVar7, strM6667);
                Object objM8078 = C0411.m8078(qVar7);
                int i25 = 48891;
                while (true) {
                    i25 ^= 48908;
                    switch (i25) {
                        case 22:
                            break;
                        case 53:
                            objM8078 = new k0.m(strM6667, i13);
                            C0478.m9328(qVar7, objM8078);
                            break;
                        case 503:
                            i25 = !zM2013 ? 49635 : 48953;
                            break;
                        case 32495:
                            Object objM2417 = C0125.m2417();
                            int i26 = 49666;
                            while (true) {
                                i26 ^= 49683;
                                switch (i26) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i26 = objM8078 == objM2417 ? 49759 : 49728;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        objM8078 = new k0.m(strM6667, i13);
                                        C0478.m9328(qVar7, objM8078);
                                        break;
                                    case 83:
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
                C0171.m3270(qVar7, false);
                y0.o oVarM8743 = C0448.m8743(oVarM2337, C0039.m758(lVarM4370, false, (c9.c) objM8078));
                C0261.m4990(qVar7, (-733329139) ^ C0320.f468);
                r1.j0 j0VarM2476 = C0128.m2476(C0456.m8889(), true, qVar7);
                C0261.m4990(qVar7, (-1323940630) ^ C0451.f722);
                int iM276 = C0014.m276(qVar7);
                m0.r1 r1VarM275 = C0014.m275(qVar7);
                C0014.m280(C0379.m7428());
                t1.j jVarM4451 = C0231.m4451();
                u0.b bVarM6976 = C0355.m6976(oVarM8743);
                boolean z10 = C0196.m3764(qVar7) instanceof m0.d;
                int i27 = 49790;
                while (true) {
                    i27 ^= 49807;
                    switch (i27) {
                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case 51:
                            C0235.m4537();
                            throw null;
                        case 84:
                            C0100.m1961(qVar7);
                            boolean zM7502 = C0382.m7502(qVar7);
                            int i28 = 49914;
                            while (true) {
                                i28 ^= 49931;
                                switch (i28) {
                                    case 497:
                                        i28 = zM7502 ? 50658 : 50627;
                                        break;
                                    case 1711:
                                        break;
                                    case 1736:
                                        C0445.m8685(qVar7);
                                        break;
                                    case 1769:
                                        C0017.m346(qVar7, jVarM4451);
                                        int i29 = 50689;
                                        while (true) {
                                            i29 ^= 50706;
                                            switch (i29) {
                                                case 19:
                                                    i29 = 50720;
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
                            C0089.m1904(qVar7, j0VarM2476, C0063.m1208());
                            C0089.m1904(qVar7, r1VarM275, C0464.m9055());
                            t1.i iVarM5562 = C0289.m5562();
                            boolean zM7503 = C0382.m7502(qVar7);
                            int i30 = 50813;
                            while (true) {
                                i30 ^= 50830;
                                switch (i30) {
                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 53:
                                        break;
                                    case 243:
                                        if (!zM7503) {
                                            i30 = 51557;
                                        }
                                        break;
                                    case 4075:
                                        boolean zM4399 = C0228.m4399(C0411.m8078(qVar7), C0057.m1083(iM276));
                                        int i31 = 51588;
                                        while (true) {
                                            i31 ^= 51605;
                                            switch (i31) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (!zM4399) {
                                                        i31 = 51681;
                                                    }
                                                    break;
                                                case 54:
                                                    break;
                                                case 87:
                                                    C0236.m4560(qVar7, bVarM6976, qVar7, numM1083, (-2058660515) ^ C0019.f39);
                                                    C0464.m9049(eVarM6031, qVar7, numM1083);
                                                    C0171.m3270(qVar7, false);
                                                    C0171.m3270(qVar7, true);
                                                    C0171.m3270(qVar7, false);
                                                    C0171.m3270(qVar7, false);
                                                    return;
                                                case 116:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i31 = 51650;
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i30 = 50875;
                            }
                            C0133.m2574(iM276, qVar7, iM276, iVarM5562);
                            C0236.m4560(qVar7, bVarM6976, qVar7, numM1083, (-2058660515) ^ C0019.f39);
                            C0464.m9049(eVarM6031, qVar7, numM1083);
                            C0171.m3270(qVar7, false);
                            C0171.m3270(qVar7, true);
                            C0171.m3270(qVar7, false);
                            C0171.m3270(qVar7, false);
                            return;
                        case 241:
                            if (z10) {
                                i27 = 49883;
                            }
                            break;
                        default:
                            continue;
                    }
                    i27 = 49852;
                }
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0044.m848(this)) {
            case 0:
                C0217.m4147(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
            default:
                C0217.m4147(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
