package f0;

import aa.C0012;
import androidx.activity.C0017;
import androidx.compose.ui.platform.C0038;
import androidx.preference.C0044;
import b7.C0053;
import c0.C0057;
import c3.C0063;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.iid.C0171;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import com.google.gson.internal.bind.C0207;
import d1.C0211;
import d9.C0222;
import d9.C0226;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import e2.C0261;
import g3.C0288;
import k3.C0335;
import l6.C0344;
import o7.i2;
import okhttp3.internal.publicsuffix.C0372;
import p3.C0375;
import r1.C0393;
import r6.C0402;
import s2.C0411;
import t2.C0420;
import t9.C0427;
import u4.C0435;
import v0.C0441;
import v7.C0448;
import w1.C0455;
import w6.C0464;
import x5.C0470;
import y.C0475;
import y9.C0478;
import z3.C0485;
import z7.C0488;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d9.j implements c9.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f5670b = new e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f5671c = new e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f5672d = new e(C0455.f726 ^ 565);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5673a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(C0245.f325 ^ 293);
        this.f5673a = i10;
        int iM8612 = C0441.m8612();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8612 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0110.m2122("yABil4XH56ke7uYXV1YYuP9I9a")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public final void a(c9.e eVar, m0.m mVar, int i10) {
        int i11;
        int i12 = 4;
        switch (C0372.m7297(this)) {
            case 1:
                int i13 = C0344.f615;
                int i14 = 56579;
                while (true) {
                    i14 ^= 56596;
                    switch (i14) {
                        case 23:
                            i14 = ((i13 ^ 710) & i10) == 0 ? 1507472 : 56641;
                            break;
                        case 54:
                            break;
                        case 85:
                            break;
                        case 1564036:
                            boolean zM5551 = C0288.m5551((m0.q) mVar, eVar);
                            int i15 = 1507503;
                            while (true) {
                                i15 ^= 1507520;
                                switch (i15) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        i12 = 2;
                                        break;
                                    case 111:
                                        i15 = zM5551 ? 1507596 : 1507565;
                                        break;
                                    case 460:
                                        break;
                                    default:
                                        break;
                                }
                            }
                            i10 = (i10 ^ i12) | (i12 & i10);
                            break;
                        default:
                            break;
                    }
                }
                int i16 = C0167.f191;
                int i17 = 1507627;
                while (true) {
                    i17 ^= 1507644;
                    switch (i17) {
                        case 23:
                            i17 = ((i16 ^ 1013) & i10) == 18 ? 1507720 : 1507689;
                            break;
                        case 85:
                            C0464.m9049(eVar, mVar, C0057.m1083((C0427.f698 ^ 508) & i10));
                            break;
                        case 118:
                            break;
                        case 180:
                            m0.q qVar = (m0.q) mVar;
                            boolean zM1625 = C0074.m1625(qVar);
                            int i18 = 1507751;
                            while (true) {
                                i18 ^= 1507768;
                                switch (i18) {
                                    case 31:
                                        i18 = !zM1625 ? 1508495 : 1508464;
                                        break;
                                    case 1335:
                                        int i19 = 1508526;
                                        while (true) {
                                            i19 ^= 1508543;
                                            switch (i19) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i19 = 1508557;
                                                    continue;
                                                case 114:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            C0464.m9049(eVar, mVar, C0057.m1083((C0427.f698 ^ 508) & i10));
                                            break;
                                        }
                                        break;
                                    case 1480:
                                        C0470.m9156(qVar);
                                        int i20 = 1508650;
                                        while (true) {
                                            i20 ^= 1508667;
                                            switch (i20) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i20 = 1508681;
                                                    continue;
                                                case 114:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 1513:
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
                int iM7362 = C0375.m7362();
                int i21 = 1509425;
                while (true) {
                    i21 ^= 1509442;
                    switch (i21) {
                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            break;
                        case 115:
                            if (iM7362 <= 0) {
                                i21 = 1509518;
                            }
                            break;
                        case 204:
                            System.out.println(Long.decode(C0244.m4684("TXYH3KlOXNpbJT01VTJEoT7Ljm")));
                            break;
                        default:
                            continue;
                    }
                    i21 = 1509487;
                }
                break;
            case 2:
                int i22 = C0488.f762;
                int i23 = 54533;
                while (true) {
                    i23 ^= 54550;
                    switch (i23) {
                        case 19:
                            i23 = ((i22 ^ (-326)) & i10) == 0 ? 54626 : 54595;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 85:
                            break;
                        case 116:
                            boolean zM5552 = C0288.m5551((m0.q) mVar, eVar);
                            int i24 = 54657;
                            while (true) {
                                i24 ^= 54674;
                                switch (i24) {
                                    case 19:
                                        i24 = zM5552 ? 55401 : 54719;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        i12 = 2;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 3579:
                                        break;
                                    default:
                                        break;
                                }
                            }
                            i10 = (i10 ^ i12) | (i12 & i10);
                            break;
                        default:
                            break;
                    }
                }
                int i25 = C0147.f172;
                int i26 = 55432;
                while (true) {
                    i26 ^= 55449;
                    switch (i26) {
                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i26 = ((i25 ^ 1012) & i10) == 18 ? 55525 : 55494;
                            break;
                        case 62:
                            break;
                        case 95:
                            break;
                        case 124:
                            m0.q qVar2 = (m0.q) mVar;
                            boolean zM1626 = C0074.m1625(qVar2);
                            int i27 = 55556;
                            while (true) {
                                i27 ^= 55573;
                                switch (i27) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (zM1626) {
                                            i27 = 55618;
                                        } else {
                                            i27 = 55649;
                                            continue;
                                        }
                                        break;
                                    case 54:
                                        i27 = 55618;
                                        break;
                                    case 87:
                                        C0470.m9156(qVar2);
                                        int i28 = 56455;
                                        while (true) {
                                            i28 ^= 56472;
                                            switch (i28) {
                                                case 31:
                                                    i28 = 56486;
                                                    break;
                                                case 62:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 116:
                                        int i29 = 55680;
                                        while (true) {
                                            i29 ^= 55697;
                                            switch (i29) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i29 = 56362;
                                                    continue;
                                                case 1467:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
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
                C0464.m9049(eVar, mVar, C0057.m1083((C0038.f58 ^ (-215)) & i10));
                break;
            case 3:
                int i30 = C0485.f759;
                int i31 = 51836;
                while (true) {
                    i31 ^= 51853;
                    switch (i31) {
                        case 241:
                            i31 = ((i30 ^ 57) & i10) == 0 ? 52580 : 52549;
                            break;
                        case 1963:
                            break;
                        case 1992:
                            break;
                        case 2025:
                            boolean zM5553 = C0288.m5551((m0.q) mVar, eVar);
                            int i32 = 52611;
                            while (true) {
                                i32 ^= 52628;
                                switch (i32) {
                                    case 23:
                                        i32 = zM5553 ? 52704 : 52673;
                                        break;
                                    case 54:
                                        break;
                                    case 85:
                                        i12 = 2;
                                        break;
                                    case 116:
                                        break;
                                    default:
                                        break;
                                }
                            }
                            i10 = (i10 ^ i12) | (i12 & i10);
                            break;
                        default:
                            break;
                    }
                }
                int i33 = C0158.f182;
                int i34 = 52735;
                while (true) {
                    i34 ^= 52752;
                    switch (i34) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            break;
                        case 1007:
                            i34 = ((i33 ^ 505) & i10) == 18 ? 53479 : 52797;
                            break;
                        case 7927:
                            m0.q qVar3 = (m0.q) mVar;
                            boolean zM1627 = C0074.m1625(qVar3);
                            int i35 = 53510;
                            while (true) {
                                i35 ^= 53527;
                                switch (i35) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i35 = !zM1627 ? 53603 : 53572;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 83:
                                        C0470.m9156(qVar3);
                                        int i36 = 53758;
                                        while (true) {
                                            i36 ^= 53775;
                                            switch (i36) {
                                                case 1009:
                                                    i36 = 54440;
                                                    break;
                                                case 1703:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 116:
                                        int i37 = 53634;
                                        while (true) {
                                            i37 ^= 53651;
                                            switch (i37) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i37 = 53665;
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
                        default:
                            break;
                    }
                }
                C0464.m9049(eVar, mVar, C0057.m1083((C0393.f664 ^ 283) & i10));
                break;
            case 4:
                int i38 = C0044.f64;
                int i39 = 49790;
                while (true) {
                    i39 ^= 49807;
                    switch (i39) {
                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case 51:
                            break;
                        case 84:
                            boolean zM5554 = C0288.m5551((m0.q) mVar, eVar);
                            int i40 = 49914;
                            while (true) {
                                i40 ^= 49931;
                                switch (i40) {
                                    case 497:
                                        i40 = zM5554 ? 50658 : 50627;
                                        break;
                                    case 1711:
                                        break;
                                    case 1736:
                                        i12 = 2;
                                        break;
                                    case 1769:
                                        break;
                                    default:
                                        break;
                                }
                            }
                            i10 = (i10 ^ i12) | (i12 & i10);
                            break;
                        case 241:
                            i39 = ((i38 ^ 48) & i10) == 0 ? 49883 : 49852;
                            break;
                        default:
                            break;
                    }
                }
                int i41 = C0402.f673;
                int i42 = 50689;
                while (true) {
                    i42 ^= 50706;
                    switch (i42) {
                        case 19:
                            i42 = ((i41 ^ 851) & i10) == 18 ? 50782 : 50751;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 76:
                            m0.q qVar4 = (m0.q) mVar;
                            boolean zM1628 = C0074.m1625(qVar4);
                            int i43 = 50813;
                            while (true) {
                                i43 ^= 50830;
                                switch (i43) {
                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 53:
                                        C0470.m9156(qVar4);
                                        int i44 = 51712;
                                        while (true) {
                                            i44 ^= 51729;
                                            switch (i44) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i44 = 51743;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 243:
                                        i43 = !zM1628 ? 51557 : 50875;
                                        break;
                                    case 4075:
                                        int i45 = 51588;
                                        while (true) {
                                            i45 ^= 51605;
                                            switch (i45) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i45 = 51619;
                                                    continue;
                                                case 54:
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
                        default:
                            break;
                    }
                }
                C0464.m9049(eVar, mVar, C0057.m1083((C0420.f691 ^ 315) & i10));
                break;
            default:
                int i46 = C0053.f73;
                int i47 = 1616;
                while (true) {
                    i47 ^= 1633;
                    switch (i47) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i47 = ((i46 ^ (-156)) & i10) == 0 ? 1709 : 1678;
                            break;
                        case 204:
                            boolean zM5555 = C0288.m5551((m0.q) mVar, eVar);
                            int i48 = 1740;
                            while (true) {
                                i48 ^= 1757;
                                switch (i48) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i48 = zM5555 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        i11 = 2;
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        i11 = 4;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            i10 = (i10 ^ i11) | (i11 & i10);
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                }
                int i49 = C0091.f125;
                int i50 = 1864;
                while (true) {
                    i50 ^= 1881;
                    switch (i50) {
                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (((i49 ^ (-253)) & i10) == 18) {
                                i50 = 48736;
                            }
                            break;
                        case 47384:
                            break;
                        case 47417:
                            m0.q qVar5 = (m0.q) mVar;
                            boolean zM1629 = C0074.m1625(qVar5);
                            int i51 = 48767;
                            while (true) {
                                i51 ^= 48784;
                                switch (i51) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        C0470.m9156(qVar5);
                                        int i52 = 49666;
                                        while (true) {
                                            i52 ^= 49683;
                                            switch (i52) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i52 = 49697;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 76:
                                        int i53 = 48891;
                                        while (true) {
                                            i53 ^= 48908;
                                            switch (i53) {
                                                case 22:
                                                    break;
                                                case 503:
                                                    i53 = 48922;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 239:
                                        if (!zM1629) {
                                            i51 = 48860;
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i51 = 48829;
                            }
                            break;
                        case 47483:
                            break;
                        default:
                            continue;
                    }
                    i50 = 48705;
                }
                C0464.m9049(eVar, mVar, C0057.m1083((C0335.f519 ^ 311) & i10));
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x008d. Please report as an issue. */
    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i10 = 0;
        q8.l lVarM238 = C0012.m238();
        switch (C0372.m7297(this)) {
            case 0:
                y0.o oVar = (y0.o) obj;
                C0435.m8515((Number) obj3);
                m0.q qVar = (m0.q) ((m0.m) obj2);
                C0261.m4990(qVar, 2126898780 ^ C0202.f226);
                long jM1224 = C0063.m1224((h0.b1) C0475.m9256(qVar, C0485.m9445()));
                y0.l lVarM4370 = C0226.m4370();
                C0261.m4990(qVar, 2068318233 ^ C0222.f302);
                boolean zM4041 = C0211.m4041(qVar, jM1224);
                Object objM8078 = C0411.m8078(qVar);
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i11 = !zM4041 ? 1709 : 1678;
                            break;
                        case 204:
                            Object objM2417 = C0125.m2417();
                            int i12 = 1740;
                            while (true) {
                                i12 ^= 1757;
                                switch (i12) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (objM8078 == objM2417) {
                                            i12 = 1833;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
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
                    C0171.m3270(qVar, false);
                    y0.o oVarM8743 = C0448.m8743(oVar, C0207.m3956(lVarM4370, (c9.c) objM8078));
                    C0171.m3270(qVar, false);
                    return oVarM8743;
                }
                objM8078 = new d(jM1224, i10);
                C0478.m9328(qVar, objM8078);
                C0171.m3270(qVar, false);
                y0.o oVarM8744 = C0448.m8743(oVar, C0207.m3956(lVarM4370, (c9.c) objM8078));
                C0171.m3270(qVar, false);
                return oVarM8744;
            case 1:
                C0017.m334(this, (c9.e) obj, (m0.m) obj2, C0435.m8515((Number) obj3));
                return lVarM238;
            case 2:
                C0017.m334(this, (c9.e) obj, (m0.m) obj2, C0435.m8515((Number) obj3));
                return lVarM238;
            case 3:
                C0017.m334(this, (c9.e) obj, (m0.m) obj2, C0435.m8515((Number) obj3));
                return lVarM238;
            case 4:
                C0017.m334(this, (c9.e) obj, (m0.m) obj2, C0435.m8515((Number) obj3));
                return lVarM238;
            default:
                C0017.m334(this, (c9.e) obj, (m0.m) obj2, C0435.m8515((Number) obj3));
                return lVarM238;
        }
    }
}
