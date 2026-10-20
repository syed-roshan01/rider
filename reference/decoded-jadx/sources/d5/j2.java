package d5;

import a.C0001;
import a3.C0006;
import aa.C0012;
import android.support.v4.app.C0014;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import androidx.compose.foundation.layout.C0022;
import androidx.lifecycle.C0043;
import androidx.profileinstaller.C0045;
import c0.C0057;
import c3.C0063;
import c7.C0069;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.C0205;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.components.C0135;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.installations.C0177;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement.C0184;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.firebase.tracing.C0204;
import d9.C0222;
import d9.C0225;
import d9.C0226;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.internal.generatesrootinput.C0250;
import e0.C0256;
import e2.C0261;
import f.C0270;
import g.C0282;
import g4.C0289;
import h.C0297;
import i4.C0317;
import i5.C0318;
import j2.C0324;
import j4.C0326;
import j6.C0328;
import java.util.ArrayList;
import k7.C0337;
import l6.C0344;
import l8.C0345;
import m0.C0349;
import m0.l2;
import m3.C0352;
import m5.C0354;
import m5.C0355;
import p3.C0375;
import p8.C0379;
import q0.C0381;
import q0.C0382;
import q6.C0388;
import q7.C0390;
import r5.C0399;
import r6.C0401;
import s2.C0411;
import u4.C0435;
import v0.C0440;
import v5.C0445;
import v6.C0447;
import v9.C0451;
import w2.C0457;
import w2.C0458;
import w5.C0463;
import w6.C0464;
import x2.C0467;
import x5.C0470;
import x8.C0473;
import y6.C0477;
import y9.C0479;
import z.C0480;
import z0.C0482;
import z7.C0488;

/* JADX INFO: loaded from: classes.dex */
public final class j2 extends d9.j implements c9.f {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f270short = {2757, 2709, 2697, 2696, 2706, 2757, 2722, 2688, 2707, 2693, 1718, 1675, 1680, 1694, 1680, 1687, 1688, 1685, 8854, 868, 843, 846, 846, 839, 838, 780, 867, 848, 848, 845, 853, 868, 845, 848, 853, 835, 848, 838, 1939, 1957, 1983, 2026, 1946, 1963, 1971};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4593b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(int i10, int i11) {
        super(C0381.f652 ^ (-17));
        this.f4592a = i10;
        this.f4593b = i11;
        int iM3154 = C0165.m3154();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3154 >= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0177.m3383("TsPHDxucluRPYJfa")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m4182() {
        int iM112 = C0006.m112();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM112 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f270short;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:139:0x045c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:146:0x047d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:49:0x0130. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x0159. Please report as an issue. */
    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        m0.m mVar = (m0.m) obj2;
        int iM8515 = C0435.m8515((Number) obj3);
        C0375.m7360((y.v) obj, C0344.m6750(m4182(), 0, C0256.f336 ^ (-862), 2785));
        int i10 = C0205.f229;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ 508) & iM8515) == 16 ? 1709 : 1678;
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
        y0.o oVarM4788 = C0250.m4788(C0123.m2371(), C0328.f476 ^ 745);
        y.f fVarM6623 = C0337.m6623();
        y0.f fVarM6849 = C0349.m6849();
        m0.q qVar2 = (m0.q) mVar;
        C0261.m4990(qVar2, (-693285938) ^ C0069.f89);
        r1.j0 j0VarM4288 = C0222.m4288(fVarM6623, fVarM6849, qVar2);
        int i15 = (-1323940496) ^ C0043.f63;
        C0261.m4990(qVar2, i15);
        int iM276 = C0014.m276(qVar2);
        m0.r1 r1VarM275 = C0014.m275(qVar2);
        C0014.m280(C0379.m7428());
        t1.j jVarM4451 = C0231.m4451();
        u0.b bVarM6976 = C0355.m6976(oVarM4788);
        boolean z10 = C0196.m3764(qVar2) instanceof m0.d;
        int i16 = 48891;
        while (true) {
            i16 ^= 48908;
            switch (i16) {
                case 22:
                    break;
                case 53:
                    C0235.m4537();
                    throw null;
                case 503:
                    if (z10) {
                        i16 = 49635;
                    }
                    break;
                case 32495:
                    C0100.m1961(qVar2);
                    boolean zM7502 = C0382.m7502(qVar2);
                    int i17 = 49666;
                    while (true) {
                        i17 ^= 49683;
                        switch (i17) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i17 = zM7502 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                C0017.m346(qVar2, jVarM4451);
                                int i18 = 49790;
                                while (true) {
                                    i18 ^= 49807;
                                    switch (i18) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i18 = 49821;
                                            continue;
                                        default:
                                            continue;
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
                    C0089.m1904(qVar2, j0VarM4288, iVarM1208);
                    t1.i iVarM9055 = C0464.m9055();
                    C0089.m1904(qVar2, r1VarM275, iVarM9055);
                    t1.i iVarM5562 = C0289.m5562();
                    boolean zM7503 = C0382.m7502(qVar2);
                    int i19 = 49914;
                    while (true) {
                        i19 ^= 49931;
                        switch (i19) {
                            case 497:
                                i19 = !zM7503 ? 50658 : 50627;
                                break;
                            case 1711:
                                break;
                            case 1736:
                                C0133.m2574(iM276, qVar2, iM276, iVarM5562);
                                break;
                            case 1769:
                                boolean zM4399 = C0228.m4399(C0411.m8078(qVar2), C0057.m1083(iM276));
                                int i20 = 50689;
                                while (true) {
                                    i20 ^= 50706;
                                    switch (i20) {
                                        case 19:
                                            i20 = !zM4399 ? 50782 : 50751;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            C0133.m2574(iM276, qVar2, iM276, iVarM5562);
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
                    l2 l2Var = new l2(qVar2);
                    int i21 = (-2058660702) ^ C0146.f171;
                    C0352.m6912(0, bVarM6976, l2Var, qVar2, i21);
                    C0261.m4990(qVar2, 483455124 ^ C0297.f445);
                    y.e eVarM3900 = C0204.m3900();
                    r1.j0 j0VarM4231 = C0218.m4231(eVarM3900, C0173.m3300(), qVar2);
                    C0261.m4990(qVar2, i15);
                    int iM277 = C0014.m276(qVar2);
                    m0.r1 r1VarM276 = C0014.m275(qVar2);
                    u0.b bVarM6977 = C0355.m6976(lVarM4370);
                    int i22 = 50813;
                    while (true) {
                        i22 ^= 50830;
                        switch (i22) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                C0235.m4537();
                                throw null;
                            case 243:
                                if (z10) {
                                    i22 = 51557;
                                }
                                break;
                            case 4075:
                                C0100.m1961(qVar2);
                                boolean zM7504 = C0382.m7502(qVar2);
                                int i23 = 51588;
                                while (true) {
                                    i23 ^= 51605;
                                    switch (i23) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i23 = zM7504 ? 51681 : 51650;
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            C0445.m8685(qVar2);
                                            break;
                                        case 116:
                                            C0017.m346(qVar2, jVarM4451);
                                            int i24 = 51712;
                                            while (true) {
                                                i24 ^= 51729;
                                                switch (i24) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 15:
                                                    case Code.UNAUTHENTICATED /* 16 */:
                                                    default:
                                                        continue;
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i24 = 51743;
                                                        continue;
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                C0089.m1904(qVar2, j0VarM4231, iVarM1208);
                                C0089.m1904(qVar2, r1VarM276, iVarM9055);
                                boolean zM7505 = C0382.m7502(qVar2);
                                int i25 = 51836;
                                while (true) {
                                    i25 ^= 51853;
                                    switch (i25) {
                                        case 241:
                                            i25 = !zM7505 ? 52580 : 52549;
                                            break;
                                        case 1963:
                                            break;
                                        case 1992:
                                            C0133.m2574(iM277, qVar2, iM277, iVarM5562);
                                            break;
                                        case 2025:
                                            boolean zM43910 = C0228.m4399(C0411.m8078(qVar2), C0057.m1083(iM277));
                                            int i26 = 52611;
                                            while (true) {
                                                i26 ^= 52628;
                                                switch (i26) {
                                                    case 23:
                                                        i26 = !zM43910 ? 52704 : 52673;
                                                        break;
                                                    case 54:
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
                                C0352.m6912(0, bVarM6977, new l2(qVar2), qVar2, i21);
                                String strM8796 = C0451.m8796(m4182(), 10, C0184.f208 ^ (-726), 1785);
                                long jM41 = C0001.m41();
                                C0185.m3537(strM8796, null, jM41, C0135.m2601(C0326.f474 ^ (-797)), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 3462, 0, 130357 ^ C0076.f110);
                                String strM9022 = C0463.m9022(m4182(), 18, 1, 559);
                                StringBuilder sb = new StringBuilder(strM9022);
                                C0197.m3772(sb, C0185.m3530(this));
                                C0185.m3537(C0440.m8605(sb), null, jM41, C0135.m2601(C0401.f672 ^ (-541)), null, null, null, (-437) ^ ((long) C0146.f171), C0480.m9357(), null, 0L, 0, false, 0, 0, null, null, qVar2, 100666752, 0, 130274 ^ C0388.f659);
                                C0016.m325(qVar2, false, true, false, false);
                                i1.f fVarM8922 = C0458.m8922();
                                int i27 = 52735;
                                while (true) {
                                    i27 ^= 52752;
                                    switch (i27) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i1.e eVar = new i1.e(C0382.m7492(m4182(), 19, C0114.f140 ^ (-309), 802), 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, C0467.f738 ^ (-512));
                                            C0167.m3190();
                                            e1.n0 n0Var = new e1.n0(C0180.m3437());
                                            k.f fVar = new k.f(C0318.f466 ^ 168);
                                            C0447.m8725(fVar, 12.0f, 4.0f);
                                            C0282.m5453(fVar, -1.41f, 1.41f);
                                            C0473.m9221(fVar, 16.17f, 11.0f);
                                            C0103.m2024(fVar, 4.0f);
                                            C0022.m438(fVar, 2.0f);
                                            C0180.m3426(fVar, 12.17f);
                                            C0282.m5453(fVar, -5.58f, 5.59f);
                                            C0473.m9221(fVar, 12.0f, 20.0f);
                                            C0282.m5453(fVar, 8.0f, -8.0f);
                                            C0488.m9518(fVar);
                                            C0479.m9341(eVar, (ArrayList) C0354.m6945(fVar), n0Var);
                                            fVarM8922 = C0390.m7638(eVar);
                                            o7.d0.f12580i = fVarM8922;
                                            break;
                                        case 1007:
                                            i27 = fVarM8922 != null ? 53479 : 52797;
                                            break;
                                        case 7927:
                                            int i28 = 53510;
                                            while (true) {
                                                i28 ^= 53527;
                                                switch (i28) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i28 = 53541;
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
                                long jM882 = C0045.m882();
                                C0142.m2736(fVarM8922, null, C0154.m2949(lVarM4370, C0324.f472 ^ (-437)), jM882, qVar2, 3504, 0);
                                y0.e eVarM2385 = C0124.m2385();
                                C0261.m4990(qVar2, (-483455360) ^ C0399.f670);
                                r1.j0 j0VarM4232 = C0218.m4231(eVarM3900, eVarM2385, qVar2);
                                C0261.m4990(qVar2, 1323940172 ^ C0225.f305);
                                int iM278 = C0014.m276(qVar2);
                                m0.r1 r1VarM277 = C0014.m275(qVar2);
                                u0.b bVarM6978 = C0355.m6976(lVarM4370);
                                int i29 = 53634;
                                while (true) {
                                    i29 ^= 53651;
                                    switch (i29) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (z10) {
                                                i29 = 53727;
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            C0100.m1961(qVar2);
                                            boolean zM7506 = C0382.m7502(qVar2);
                                            int i30 = 53758;
                                            while (true) {
                                                i30 ^= 53775;
                                                switch (i30) {
                                                    case 1009:
                                                        i30 = zM7506 ? 54502 : 54471;
                                                        break;
                                                    case 1703:
                                                        break;
                                                    case 1736:
                                                        C0445.m8685(qVar2);
                                                        int i31 = 54657;
                                                        while (true) {
                                                            i31 ^= 54674;
                                                            switch (i31) {
                                                                case 19:
                                                                    i31 = 54688;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 1769:
                                                        C0017.m346(qVar2, jVarM4451);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            int i32 = 54533;
                                            while (true) {
                                                i32 ^= 54550;
                                                switch (i32) {
                                                    case 19:
                                                        i32 = 54564;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        C0089.m1904(qVar2, j0VarM4232, iVarM1208);
                                                        C0089.m1904(qVar2, r1VarM277, iVarM9055);
                                                        boolean zM7507 = C0382.m7502(qVar2);
                                                        int i33 = 55432;
                                                        while (true) {
                                                            i33 ^= 55449;
                                                            switch (i33) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i33 = !zM7507 ? 55525 : 55494;
                                                                    break;
                                                                case 62:
                                                                    break;
                                                                case 95:
                                                                    C0133.m2574(iM278, qVar2, iM278, iVarM5562);
                                                                    break;
                                                                case 124:
                                                                    boolean zM43911 = C0228.m4399(C0411.m8078(qVar2), C0057.m1083(iM278));
                                                                    int i34 = 55556;
                                                                    while (true) {
                                                                        i34 ^= 55573;
                                                                        switch (i34) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i34 = !zM43911 ? 55649 : 55618;
                                                                                break;
                                                                            case 54:
                                                                                break;
                                                                            case 87:
                                                                                break;
                                                                            case 116:
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
                                                        C0352.m6912(0, bVarM6978, new l2(qVar2), qVar2, 2058660653 ^ C0222.f302);
                                                        C0185.m3537(C0043.m836(m4182(), 38, C0345.f616 ^ 693, 1994), null, jM882, C0135.m2601(C0128.f154 ^ (-164)), null, C0270.m5164(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 200070, 0, (-130663) ^ C0146.f171);
                                                        StringBuilder sb2 = new StringBuilder(strM9022);
                                                        C0197.m3772(sb2, C0482.m9392(this));
                                                        C0185.m3537(C0440.m8605(sb2), null, jM882, C0135.m2601(C0317.f465 ^ 323), null, C0477.m9305(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 200064, 0, 130707 ^ C0457.f728);
                                                        C0016.m325(qVar2, false, true, false, false);
                                                        C0016.m325(qVar2, false, true, false, false);
                                                        break;
                                                }
                                            }
                                            break;
                                        case 83:
                                            C0235.m4537();
                                            throw null;
                                        default:
                                            continue;
                                    }
                                    i29 = 53696;
                                }
                                break;
                            default:
                                continue;
                        }
                        i22 = 50875;
                    }
                    break;
                default:
                    continue;
            }
            i16 = 48953;
        }
        return C0012.m238();
    }
}
