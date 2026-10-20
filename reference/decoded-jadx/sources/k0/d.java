package k0;

import a.C0002;
import aa.C0012;
import android.support.v4.app.C0014;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import androidx.annotation.C0019;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.core.app.C0040;
import b7.C0053;
import c0.C0057;
import c1.C0059;
import c1.C0061;
import c3.C0063;
import c4.C0066;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.abt.C0112;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.tracing.C0204;
import d5.C0218;
import d9.C0226;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.migration.C0239;
import dagger.hilt.codegen.C0241;
import dagger.hilt.internal.generatesrootinput.C0250;
import e2.C0261;
import f.C0269;
import g4.C0289;
import k3.C0335;
import k4.C0336;
import m3.C0352;
import m5.C0355;
import m7.C0358;
import m9.C0359;
import p8.C0379;
import q0.C0382;
import r2.C0395;
import s2.C0411;
import s8.C0416;
import t2.C0422;
import u.C0429;
import u2.C0433;
import u4.C0435;
import v5.C0445;
import w1.C0455;
import w2.C0456;
import w6.C0464;
import x5.C0470;
import y.C0474;
import y.C0475;
import y9.C0479;
import z.C0480;
import z1.C0483;
import z3.C0485;

/* JADX INFO: loaded from: classes.dex */
public final class d extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.e f8807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.e f8808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f8809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f8812f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f8813n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c9.e f8814o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c9.e eVar, c9.e eVar2, c9.e eVar3, long j10, long j11, long j12, long j13, c9.e eVar4) {
        super(C0127.f153 ^ (-516));
        this.f8807a = eVar;
        this.f8808b = eVar2;
        this.f8809c = eVar3;
        this.f8810d = j10;
        this.f8811e = j11;
        this.f8812f = j12;
        this.f8813n = j13;
        this.f8814o = eVar4;
        int iM6500 = C0335.m6500();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6500 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0422.m8292("i4sPwntYE"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:130:0x0332. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:137:0x0353. Please report as an issue. */
    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        m0.m mVar = (m0.m) obj;
        int iM8515 = C0435.m8515((Number) obj2);
        int i10 = C0479.f753;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ (-958)) & iM8515) == 2 ? 1709 : 1678;
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
                                        default:
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
        y0.o oVarM2181 = C0113.m2181(C0226.m4370(), C0483.m9417());
        long jM4462 = C0231.m4462(this);
        long jM58 = C0002.m58(this);
        long jM5567 = C0289.m5567(this);
        c9.e eVarM1281 = C0066.m1281(this);
        m0.q qVar2 = (m0.q) mVar;
        C0261.m4990(qVar2, (-483455030) ^ C0429.f700);
        r1.j0 j0VarM4231 = C0218.m4231(C0204.m3900(), C0173.m3300(), qVar2);
        C0261.m4990(qVar2, 1323940306 ^ C0002.f770);
        int iM276 = C0014.m276(qVar2);
        m0.r1 r1VarM275 = C0014.m275(qVar2);
        C0014.m280(C0379.m7428());
        t1.j jVarM4451 = C0231.m4451();
        u0.b bVarM6976 = C0355.m6976(oVarM2181);
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
                    C0352.m6912(0, bVarM6976, new m0.l2(qVar2), qVar2, (-2058660401) ^ C0066.f86);
                    y.w wVarM2721 = C0141.m2721();
                    C0261.m4990(qVar2, 76440780 ^ C0485.f759);
                    c9.e eVarM5155 = C0269.m5155(this);
                    int i21 = 51588;
                    while (true) {
                        i21 ^= 51605;
                        switch (i21) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i21 = eVarM5155 == null ? 51681 : 51650;
                                break;
                            case 54:
                                break;
                            case 87:
                                C0395.m7736(C0433.m8483(C0112.m2168(), new e1.r(C0061.m1163(this))), C0059.m1122(qVar2, 934657370 ^ C0117.f143, new b(eVarM5155, 0)), qVar2, C0359.f630 ^ 265);
                                break;
                            case 116:
                                int i22 = 51712;
                                while (true) {
                                    i22 ^= 51729;
                                    switch (i22) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 15:
                                        case Code.UNAUTHENTICATED /* 16 */:
                                        default:
                                            continue;
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i22 = 51743;
                                            continue;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    C0171.m3270(qVar2, false);
                    C0261.m4990(qVar2, (-76440996) ^ C0241.f321);
                    c9.e eVarM9235 = C0474.m9235(this);
                    int i23 = 51836;
                    while (true) {
                        i23 ^= 51853;
                        switch (i23) {
                            case 241:
                                i23 = eVarM9235 == null ? 52580 : 52549;
                                break;
                            case 1963:
                                break;
                            case 1992:
                                C0250.m4802(jM4462, C0112.m2156((e5) C0475.m9256(qVar2, C0455.m8878()), C0230.m4430()), C0059.m1122(qVar2, 434448718 ^ C0239.f319, new c((Object) wVarM2721, (Object) eVarM5155, (Object) eVarM9235, 0)), qVar2, 384);
                                break;
                            case 2025:
                                int i24 = 52611;
                                while (true) {
                                    i24 ^= 52628;
                                    switch (i24) {
                                        case 23:
                                            i24 = 52642;
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
                    C0171.m3270(qVar2, false);
                    C0261.m4990(qVar2, (-76442458) ^ C0416.f687);
                    c9.e eVarM1025 = C0053.m1025(this);
                    int i25 = 52735;
                    while (true) {
                        i25 ^= 52752;
                        switch (i25) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                C0250.m4802(jM58, C0112.m2156((e5) C0475.m9256(qVar2, C0455.m8878()), C0040.m781()), C0059.m1122(qVar2, 796843697 ^ C0019.f39, new b(eVarM1025, 1)), qVar2, 384);
                                break;
                            case 1007:
                                i25 = eVarM1025 == null ? 53479 : 52797;
                                break;
                            case 7927:
                                int i26 = 53510;
                                while (true) {
                                    i26 ^= 53527;
                                    switch (i26) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i26 = 53541;
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
                    C0171.m3270(qVar2, false);
                    HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(C0124.m2385());
                    C0261.m4990(qVar2, (-733329275) ^ C0480.f754);
                    r1.j0 j0VarM2476 = C0128.m2476(C0456.m8889(), false, qVar2);
                    C0261.m4990(qVar2, (-1323940326) ^ C0201.f225);
                    int iM277 = C0014.m276(qVar2);
                    m0.r1 r1VarM276 = C0014.m275(qVar2);
                    u0.b bVarM6977 = C0355.m6976(horizontalAlignElement);
                    int i27 = 53634;
                    while (true) {
                        i27 ^= 53651;
                        switch (i27) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (z10) {
                                    i27 = 53727;
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                C0100.m1961(qVar2);
                                boolean zM7504 = C0382.m7502(qVar2);
                                int i28 = 53758;
                                while (true) {
                                    i28 ^= 53775;
                                    switch (i28) {
                                        case 1009:
                                            i28 = zM7504 ? 54502 : 54471;
                                            break;
                                        case 1703:
                                            break;
                                        case 1736:
                                            C0445.m8685(qVar2);
                                            break;
                                        case 1769:
                                            C0017.m346(qVar2, jVarM4451);
                                            int i29 = 54533;
                                            while (true) {
                                                i29 ^= 54550;
                                                switch (i29) {
                                                    case 19:
                                                        i29 = 54564;
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
                                C0089.m1904(qVar2, j0VarM2476, iVarM1208);
                                C0089.m1904(qVar2, r1VarM276, iVarM9055);
                                boolean zM7505 = C0382.m7502(qVar2);
                                int i30 = 54657;
                                while (true) {
                                    i30 ^= 54674;
                                    switch (i30) {
                                        case 19:
                                            i30 = !zM7505 ? 55401 : 54719;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            C0133.m2574(iM277, qVar2, iM277, iVarM5562);
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 3579:
                                            boolean zM43910 = C0228.m4399(C0411.m8078(qVar2), C0057.m1083(iM277));
                                            int i31 = 55432;
                                            while (true) {
                                                i31 ^= 55449;
                                                switch (i31) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i31 = !zM43910 ? 55525 : 55494;
                                                        break;
                                                    case 62:
                                                        break;
                                                    case 95:
                                                        break;
                                                    case 124:
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
                                C0352.m6912(0, bVarM6977, new m0.l2(qVar2), qVar2, (-2058660270) ^ C0336.f520);
                                e5 e5Var = (e5) C0475.m9256(qVar2, C0455.m8878());
                                C0159.m3049();
                                C0250.m4802(jM5567, C0112.m2156(e5Var, C0358.f629 ^ 536), eVarM1281, qVar2, 0);
                                C0016.m325(qVar2, false, true, false, false);
                                C0016.m325(qVar2, false, true, false, false);
                                break;
                            case 83:
                                C0235.m4537();
                                throw null;
                            default:
                                continue;
                        }
                        i27 = 53696;
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
