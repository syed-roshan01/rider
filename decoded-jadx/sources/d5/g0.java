package d5;

import a.C0000;
import a.C0001;
import aa.C0012;
import android.content.Context;
import android.support.v4.app.C0014;
import android.support.v4.app.C0015;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import androidx.annotation.C0019;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.graphics.C0032;
import androidx.profileinstaller.C0045;
import b3.C0051;
import b7.C0054;
import c0.C0056;
import c0.C0057;
import c1.C0059;
import c1.C0061;
import c3.C0063;
import c4.C0066;
import c7.C0068;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0074;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.tasks.C0106;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.firebase.tracing.C0204;
import com.google.gson.internal.bind.C0206;
import com.google.gson.internal.sql.C0208;
import d7.C0219;
import d8.C0221;
import d9.C0222;
import d9.C0226;
import dagger.hilt.android.C0240;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.lifecycle.C0236;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.android.migration.C0239;
import dagger.hilt.components.C0243;
import dagger.hilt.internal.generatesrootinput.C0250;
import e1.C0258;
import e2.C0261;
import ea.C0267;
import f.C0270;
import f4.C0276;
import fa.C0281;
import g.C0283;
import g2.C0287;
import g4.C0289;
import g5.C0291;
import i.C0316;
import i5.C0318;
import k.C0331;
import k0.m4;
import k1.C0332;
import k3.C0334;
import k7.C0337;
import k8.C0338;
import m0.C0349;
import m0.l2;
import m0.l3;
import m0.o3;
import m3.C0352;
import m4.C0353;
import m5.C0355;
import m7.C0356;
import m7.C0357;
import m7.C0358;
import n7.C0363;
import p3.C0375;
import p8.C0379;
import q0.C0382;
import q5.C0385;
import s2.C0411;
import s8.C0416;
import t0.C0418;
import t1.C0419;
import u0.C0430;
import u4.C0435;
import v.C0439;
import v0.C0441;
import v5.C0445;
import w5.C0462;
import w6.C0464;
import x5.C0470;
import y9.C0478;
import z2.C0484;
import z3.C0485;
import z7.C0489;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends d9.j implements c9.f {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f262short = {618, 570, 550, 551, 573, 618, 525, 559, 572, 554, 317, 313, 318, 271, 310, 305, 290, 309, 557, 513, 536, 576, 550, 513, 530, 517, 576, 521, 531, 576, 565, 526, 524, 521, 525, 521, 532, 517, 516, 3033, 3010, 3039, 3021, 3034, 3017, 3016, 3059, 3023, 3012, 3021, 3010, 3019, 3017, 3039};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l3 f4507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MainViewModel f4508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f4510e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(int i10, m0.g1 g1Var, MainViewModel mainViewModel, boolean z10, Context context) {
        super(C0132.f158 ^ (-214));
        this.f4506a = i10;
        this.f4507b = g1Var;
        this.f4508c = mainViewModel;
        this.f4509d = z10;
        this.f4510e = context;
        int iM4596 = C0239.m4596();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4596 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0489.m9524("B5y")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m4172() {
        int iM8425 = C0430.m8425();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8425 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f262short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        long jM389;
        String strM8581;
        m0.m mVar = (m0.m) obj2;
        int iM8515 = C0435.m8515((Number) obj3);
        C0375.m7360((y.v) obj, C0197.m3785(m4172(), 0, C0139.f165 ^ 648, 590));
        int i10 = C0357.f628;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ 861) & iM8515) == 16 ? 1709 : 1678;
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
                                C0470.m9156(qVar);
                                int i13 = 48767;
                                while (true) {
                                    i13 ^= 48784;
                                    switch (i13) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            return C0012.m238();
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
        }
        y0.l lVarM4370 = C0226.m4370();
        y0.o oVarM4788 = C0250.m4788(lVarM4370, 16);
        MainViewModel mainViewModelM1321 = C0068.m1321(this);
        boolean zM2070 = C0106.m2070(this);
        Context contextM1005 = C0051.m1005(this);
        m0.q qVar2 = (m0.q) mVar;
        C0261.m4990(qVar2, 483455759 ^ C0352.f623);
        y.e eVarM3900 = C0204.m3900();
        y0.e eVarM3300 = C0173.m3300();
        r1.j0 j0VarM4231 = C0218.m4231(eVarM3900, eVarM3300, qVar2);
        C0261.m4990(qVar2, 1323940572 ^ C0161.f185);
        int iM276 = C0014.m276(qVar2);
        m0.r1 r1VarM275 = C0014.m275(qVar2);
        C0014.m280(C0379.m7428());
        t1.j jVarM4451 = C0231.m4451();
        u0.b bVarM6976 = C0355.m6976(oVarM4788);
        boolean z10 = C0196.m3764(qVar2) instanceof m0.d;
        int i15 = 48891;
        while (true) {
            i15 ^= 48908;
            switch (i15) {
                case 22:
                    break;
                case 53:
                    C0235.m4537();
                    throw null;
                case 503:
                    if (z10) {
                        i15 = 49635;
                    }
                    break;
                case 32495:
                    C0100.m1961(qVar2);
                    boolean zM7502 = C0382.m7502(qVar2);
                    int i16 = 49666;
                    while (true) {
                        i16 ^= 49683;
                        switch (i16) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i16 = zM7502 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                C0017.m346(qVar2, jVarM4451);
                                int i17 = 49790;
                                while (true) {
                                    i17 ^= 49807;
                                    switch (i17) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i17 = 49821;
                                            break;
                                    }
                                }
                                break;
                            case 83:
                                C0445.m8685(qVar2);
                                break;
                            default:
                                break;
                        }
                    }
                    t1.i iVarM1208 = C0063.m1208();
                    C0089.m1904(qVar2, j0VarM4231, iVarM1208);
                    t1.i iVarM9055 = C0464.m9055();
                    C0089.m1904(qVar2, r1VarM275, iVarM9055);
                    t1.i iVarM5562 = C0289.m5562();
                    boolean zM7503 = C0382.m7502(qVar2);
                    int i18 = 49914;
                    while (true) {
                        i18 ^= 49931;
                        switch (i18) {
                            case 497:
                                i18 = !zM7503 ? 50658 : 50627;
                                break;
                            case 1711:
                                break;
                            case 1736:
                                C0133.m2574(iM276, qVar2, iM276, iVarM5562);
                                break;
                            case 1769:
                                boolean zM4399 = C0228.m4399(C0411.m8078(qVar2), C0057.m1083(iM276));
                                int i19 = 50689;
                                while (true) {
                                    i19 ^= 50706;
                                    switch (i19) {
                                        case 19:
                                            i19 = !zM4399 ? 50782 : 50751;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            int i20 = 50813;
                                            while (true) {
                                                i20 ^= 50830;
                                                switch (i20) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 243:
                                                        i20 = 50844;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                                C0133.m2574(iM276, qVar2, iM276, iVarM5562);
                                                break;
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
                    C0352.m6912(0, bVarM6976, new l2(qVar2), qVar2, (-2058660584) ^ C0385.f656);
                    C0261.m4990(qVar2, 112902127 ^ C0227.f307);
                    Object objM8078 = C0411.m8078(qVar2);
                    Object objM2417 = C0125.m2417();
                    o3 o3VarM2137 = C0111.m2137();
                    int i21 = 51588;
                    while (true) {
                        i21 ^= 51605;
                        switch (i21) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i21 = objM8078 == objM2417 ? 51681 : 51650;
                                break;
                            case 54:
                                break;
                            case 87:
                                break;
                            case 116:
                                int iM5542 = C0287.m5542(this);
                                int i22 = 51712;
                                while (true) {
                                    i22 ^= 51729;
                                    switch (i22) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (iM5542 > 0) {
                                                i22 = 51805;
                                            }
                                            break;
                                        case 47:
                                            strM8581 = C0439.m8581();
                                            break;
                                        case 76:
                                            strM8581 = C0276.m5318(iM5542);
                                            int i23 = 51836;
                                            while (true) {
                                                i23 ^= 51853;
                                                switch (i23) {
                                                    case 241:
                                                        i23 = 52518;
                                                        break;
                                                    case 1963:
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i22 = 51774;
                                }
                                objM8078 = C0173.m3305(strM8581, o3VarM2137);
                                C0478.m9328(qVar2, objM8078);
                                break;
                            default:
                                break;
                        }
                    }
                    m0.g1 g1Var = (m0.g1) objM8078;
                    Object objM6985 = C0356.m6985(qVar2, false, 112900231 ^ C0291.f439);
                    int i24 = 52611;
                    while (true) {
                        i24 ^= 52628;
                        switch (i24) {
                            case 23:
                                i24 = objM6985 == objM2417 ? 52704 : 52673;
                                break;
                            case 54:
                                break;
                            case 85:
                                break;
                            case 116:
                                objM6985 = C0173.m3305(C0334.m6483(), o3VarM2137);
                                C0478.m9328(qVar2, objM6985);
                                break;
                            default:
                                break;
                        }
                    }
                    m0.g1 g1Var2 = (m0.g1) objM6985;
                    C0171.m3270(qVar2, false);
                    FillElement fillElementM2371 = C0123.m2371();
                    y.f fVarM6623 = C0337.m6623();
                    y0.f fVarM6849 = C0349.m6849();
                    C0261.m4990(qVar2, 693286533 ^ C0164.f188);
                    r1.j0 j0VarM4288 = C0222.m4288(fVarM6623, fVarM6849, qVar2);
                    C0261.m4990(qVar2, (-1323939992) ^ C0054.f74);
                    int iM277 = C0014.m276(qVar2);
                    m0.r1 r1VarM276 = C0014.m275(qVar2);
                    u0.b bVarM6977 = C0355.m6976(fillElementM2371);
                    int i25 = 52735;
                    while (true) {
                        i25 ^= 52752;
                        switch (i25) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                C0235.m4537();
                                throw null;
                            case 1007:
                                if (z10) {
                                    i25 = 53479;
                                }
                                break;
                            case 7927:
                                C0100.m1961(qVar2);
                                boolean zM7504 = C0382.m7502(qVar2);
                                int i26 = 53510;
                                while (true) {
                                    i26 ^= 53527;
                                    switch (i26) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i26 = zM7504 ? 53603 : 53572;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 83:
                                            C0445.m8685(qVar2);
                                            break;
                                        case 116:
                                            C0017.m346(qVar2, jVarM4451);
                                            int i27 = 53634;
                                            while (true) {
                                                i27 ^= 53651;
                                                switch (i27) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i27 = 53665;
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
                                C0089.m1904(qVar2, j0VarM4288, iVarM1208);
                                C0089.m1904(qVar2, r1VarM276, iVarM9055);
                                boolean zM7505 = C0382.m7502(qVar2);
                                int i28 = 53758;
                                while (true) {
                                    i28 ^= 53775;
                                    switch (i28) {
                                        case 1009:
                                            i28 = !zM7505 ? 54502 : 54471;
                                            break;
                                        case 1703:
                                            break;
                                        case 1736:
                                            C0133.m2574(iM277, qVar2, iM277, iVarM5562);
                                            break;
                                        case 1769:
                                            boolean zM43910 = C0228.m4399(C0411.m8078(qVar2), C0057.m1083(iM277));
                                            int i29 = 54533;
                                            while (true) {
                                                i29 ^= 54550;
                                                switch (i29) {
                                                    case 19:
                                                        i29 = !zM43910 ? 54626 : 54595;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 85:
                                                        break;
                                                    case 116:
                                                        C0133.m2574(iM277, qVar2, iM277, iVarM5562);
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
                                C0045.m869(bVarM6977, new l2(qVar2), qVar2, C0057.m1083(0));
                                C0261.m4990(qVar2, 2058660505 ^ C0243.f323);
                                y0.o oVarM4269 = C0221.m4269();
                                C0261.m4990(qVar2, (-483455567) ^ C0332.f516);
                                r1.j0 j0VarM4232 = C0218.m4231(eVarM3900, eVarM3300, qVar2);
                                C0261.m4990(qVar2, (-1323940284) ^ C0137.f163);
                                int iM278 = C0014.m276(qVar2);
                                m0.r1 r1VarM277 = C0014.m275(qVar2);
                                u0.b bVarM6978 = C0355.m6976(oVarM4269);
                                int i30 = 54657;
                                while (true) {
                                    i30 ^= 54674;
                                    switch (i30) {
                                        case 19:
                                            if (z10) {
                                                i30 = 55401;
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            C0235.m4537();
                                            throw null;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 3579:
                                            C0100.m1961(qVar2);
                                            boolean zM7506 = C0382.m7502(qVar2);
                                            int i31 = 55432;
                                            while (true) {
                                                i31 ^= 55449;
                                                switch (i31) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i31 = zM7506 ? 55525 : 55494;
                                                        break;
                                                    case 62:
                                                        break;
                                                    case 95:
                                                        C0445.m8685(qVar2);
                                                        break;
                                                    case 124:
                                                        C0017.m346(qVar2, jVarM4451);
                                                        int i32 = 55556;
                                                        while (true) {
                                                            i32 ^= 55573;
                                                            switch (i32) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i32 = 55587;
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
                                            C0089.m1904(qVar2, j0VarM4232, iVarM1208);
                                            C0089.m1904(qVar2, r1VarM277, iVarM9055);
                                            boolean zM7507 = C0382.m7502(qVar2);
                                            int i33 = 55680;
                                            while (true) {
                                                i33 ^= 55697;
                                                switch (i33) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i33 = !zM7507 ? 56424 : 56393;
                                                        break;
                                                    case 1467:
                                                        break;
                                                    case 1496:
                                                        C0133.m2574(iM278, qVar2, iM278, iVarM5562);
                                                        break;
                                                    case 1529:
                                                        boolean zM43911 = C0228.m4399(C0411.m8078(qVar2), C0057.m1083(iM278));
                                                        int i34 = 56455;
                                                        while (true) {
                                                            i34 ^= 56472;
                                                            switch (i34) {
                                                                case 31:
                                                                    i34 = !zM43911 ? 56548 : 56517;
                                                                    break;
                                                                case 62:
                                                                    break;
                                                                case 93:
                                                                    break;
                                                                case 124:
                                                                    C0133.m2574(iM278, qVar2, iM278, iVarM5562);
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
                                            C0352.m6912(0, bVarM6978, new l2(qVar2), qVar2, 2058660846 ^ C0331.f479);
                                            C0318.m6169();
                                            l3 l3VarM5106 = C0267.m5106(this);
                                            String strM6122 = C0316.m6122(C0056.m1071(m4172(), 10, C0240.f320 ^ 451, 336), (String) C0418.m8214(l3VarM5106));
                                            long jM41 = C0001.m41();
                                            int i35 = C0331.f479 ^ 267;
                                            C0185.m3537(strM6122, null, jM41, C0135.m2601(i35), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 3072, 0, 130326 ^ C0258.f338);
                                            String str = (String) C0418.m8214(g1Var);
                                            f0.b1 b1Var = new f0.b1(C0353.f624 ^ 890, C0128.f154 ^ (-180));
                                            C0186.m3550();
                                            long jM5325 = C0276.m5325();
                                            long jM9422 = C0484.m9422();
                                            long jM1964 = C0100.m1964();
                                            m4 m4VarM5458 = C0283.m5458(jM1964, jM1964, 0L, 0L, jM5325, jM5325, jM9422, 0L, 0L, 0L, 0L, 0L, 0L, 309 ^ ((long) C0462.f733), qVar2, 2147476495 ^ C0015.f35);
                                            int i36 = C0478.f752 ^ (-818);
                                            e0.e eVarM8237 = C0419.m8237(i36);
                                            C0261.m4990(qVar2, 63213835 ^ C0061.f81);
                                            Object objM8079 = C0411.m8078(qVar2);
                                            int i37 = 56579;
                                            while (true) {
                                                i37 ^= 56596;
                                                switch (i37) {
                                                    case 23:
                                                        i37 = objM8079 == objM2417 ? 1507472 : 56641;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        break;
                                                    case 1564036:
                                                        objM8079 = new d0(g1Var, g1Var2, 0);
                                                        C0478.m9328(qVar2, objM8079);
                                                        int i38 = 1507503;
                                                        while (true) {
                                                            i38 ^= 1507520;
                                                            switch (i38) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 111:
                                                                    i38 = 1507534;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            C0171.m3270(qVar2, false);
                                            C0032.m628(str, (c9.c) objM8079, fillElementM2371, false, false, null, null, null, null, null, null, null, null, false, null, b1Var, null, true, 0, 0, null, eVarM8237, m4VarM5458, qVar2, 432, 12779520, 0, (-1933186) ^ C0276.f392);
                                            long jM2601 = C0135.m2601(i36);
                                            float f10 = C0208.f232 ^ 358;
                                            C0185.m3537(C0416.m8170(m4172(), 18, C0167.f191 ^ 955, 608), C0187.m3568(lVarM4370, 0.0f, f10, 0.0f, 0.0f, C0441.f712 ^ (-242)), jM41, jM2601, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 3126, 0, 130965 ^ C0206.f230);
                                            C0016.m325(qVar2, false, true, false, false);
                                            C0016.m325(qVar2, false, true, false, false);
                                            float f11 = i35;
                                            C0072.m1564(C0270.m5166(lVarM4370, f11), qVar2);
                                            C0066.m1280();
                                            boolean zM14 = C0000.m14((Boolean) C0418.m8214(g1Var2));
                                            int i39 = 1507627;
                                            while (true) {
                                                i39 ^= 1507644;
                                                switch (i39) {
                                                    case 23:
                                                        i39 = zM14 ? 1507720 : 1507689;
                                                        break;
                                                    case 85:
                                                        jM389 = jM5325;
                                                        break;
                                                    case 118:
                                                        break;
                                                    case 180:
                                                        jM389 = C0019.m389((-4281237333L) ^ ((long) C0237.f317));
                                                        int i40 = 1507751;
                                                        while (true) {
                                                            i40 ^= 1507768;
                                                            switch (i40) {
                                                                case 31:
                                                                    i40 = 1508433;
                                                                    continue;
                                                                case 1513:
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
                                            C0057.m1096(new e0(mainViewModelM1321, zM2070, contextM1005, g1Var, g1Var2), fillElementM2371, false, C0419.m8237(f11), C0485.m9441(jM389, (-774) ^ ((long) C0236.f316), qVar2, C0219.f299 ^ 268), null, null, null, null, C0059.m1122(qVar2, 1757342900 ^ C0024.f44, new f0(g1Var2, l3VarM5106, 0)), qVar2, (-805306624) ^ C0126.f152, C0276.f392 ^ (-414));
                                            C0261.m4990(qVar2, (-441159343) ^ C0363.f634);
                                            boolean zM15 = C0000.m14((Boolean) C0418.m8214(g1Var2));
                                            int i41 = 1508526;
                                            while (true) {
                                                i41 ^= 1508543;
                                                switch (i41) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (!zM15) {
                                                            i41 = 1508619;
                                                        }
                                                        break;
                                                    case 83:
                                                        break;
                                                    case 114:
                                                        break;
                                                    case 436:
                                                        C0072.m1564(C0270.m5166(lVarM4370, f10), qVar2);
                                                        C0185.m3537(C0316.m6122(C0080.m1728(m4172(), 39, C0358.f629 ^ 541, 2988), (String) C0418.m8214(l3VarM5106)), null, C0019.m389(4294941486L ^ ((long) C0338.f609)), C0135.m2601(C0174.f198 ^ (-164)), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 3456, 0, 130267 ^ C0281.f426);
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i41 = 1508588;
                                            }
                                            C0016.m325(qVar2, false, false, true, false);
                                            C0171.m3270(qVar2, false);
                                            break;
                                        default:
                                            continue;
                                    }
                                    i30 = 54719;
                                }
                                break;
                            default:
                                continue;
                        }
                        i25 = 52797;
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
