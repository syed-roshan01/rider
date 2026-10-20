package k0;

import a8.C0009;
import android.os.C0013;
import android.support.v4.app.C0014;
import android.support.v4.app.C0015;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import androidx.annotation.C0018;
import androidx.compose.foundation.C0026;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.input.pointer.C0034;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import androidx.core.app.C0040;
import androidx.core.content.C0041;
import androidx.lifecycle.C0043;
import androidx.profileinstaller.C0045;
import b1.C0050;
import c0.C0056;
import c0.C0057;
import c1.C0059;
import c1.C0060;
import c1.C0061;
import c3.C0062;
import c3.C0063;
import c7.C0068;
import ca.C0070;
import com.auto.accept.data.model.C0071;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.common.C0087;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.internal.tasks.C0103;
import com.google.android.gms.tasks.C0106;
import com.google.android.play.core.integrity.client.C0107;
import com.google.android.play.core.integrity.client.C0108;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.iid.C0169;
import com.google.firebase.iid.C0170;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfiginterop.C0203;
import com.google.firebase.tracing.C0204;
import d1.C0212;
import d1.C0213;
import d1.C0215;
import d3.C0217;
import d7.C0221;
import d9.C0223;
import d9.C0224;
import d9.C0225;
import d9.C0227;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.android.migration.C0239;
import dagger.hilt.codegen.C0243;
import dagger.hilt.internal.aliasof.C0248;
import dagger.hilt.internal.definecomponent.C0250;
import dagger.hilt.internal.generatesrootinput.C0251;
import dagger.hilt.migration.C0255;
import e1.C0259;
import e2.C0262;
import e2.C0264;
import ea.C0268;
import f.C0270;
import fa.C0280;
import g0.C0286;
import g3.C0289;
import g4.C0290;
import g5.C0292;
import g9.C0295;
import ga.C0296;
import h1.C0301;
import h3.C0303;
import h4.C0306;
import h5.C0307;
import h5.C0309;
import h7.C0311;
import h7.C0313;
import h8.C0315;
import i.C0317;
import j2.C0324;
import j4.C0327;
import ja.C0331;
import k1.C0333;
import k3.C0335;
import k3.C0336;
import k4.C0337;
import l3.C0343;
import la.C0349;
import m3.C0353;
import m4.C0354;
import m5.C0356;
import m9.C0360;
import n8.C0366;
import o5.C0371;
import p8.C0380;
import q0.C0383;
import q2.C0385;
import q6.C0387;
import r1.C0394;
import r2.C0396;
import r2.C0398;
import s.C0409;
import s0.C0410;
import s2.C0412;
import s3.C0413;
import s8.C0418;
import t0.C0419;
import t2.C0423;
import t7.C0426;
import u.C0430;
import u2.C0434;
import v0.C0442;
import v5.C0445;
import v5.C0446;
import v7.C0449;
import w0.C0455;
import w1.C0456;
import w2.C0457;
import w4.C0462;
import w6.C0465;
import w9.C0466;
import x0.C0467;
import x5.C0471;
import x7.C0473;
import x8.C0474;
import y.C0475;
import y.C0476;
import y9.C0479;
import z.C0482;
import z0.C0483;
import z1.C0484;
import z3.C0486;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f9633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f9634b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f511short = {1343, 1294, 1309, 1294, 1282, 1290, 1307, 1290, 1309, 1308, 1359, 1307, 1280, 1359, 1324, 1306, 1293, 1286, 1292, 1325, 1290, 1301, 1286, 1290, 1309, 1322, 1294, 1308, 1286, 1281, 1288, 1359, 1292, 1294, 1281, 1281, 1280, 1307, 1359, 1293, 1290, 1359, 1313, 1294, 1313, 1345, 1359, 1326, 1292, 1307, 1306, 1294, 1283, 1359, 1311, 1294, 1309, 1294, 1282, 1290, 1307, 1290, 1309, 1308, 1359, 1294, 1309, 1290, 1365, 1359, 1375, 1345, 1367, 1347, 1359, 1375, 1345, 1375, 1347, 1359, 1375, 1345, 1367, 1347, 1359, 1375, 1345, 1374, 1370, 1345, 1764, 1771, 1788, 1763, 1773, 1771, 1790, 1763, 1765, 1764, 1731, 1769, 1765, 1764, 2674, 2671, 2674, 2666, 2659, 2035, 2033, 2022, 2043, 2045, 2044, 2011, 2033, 2045, 2044, 2017};

    static {
        float f10 = C0139.f165 ^ 658;
        boolean zM6045 = C0313.m6045(0.8f);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = !zM6045 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM6046 = C0313.m6045(0.0f);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = !zM6046 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean zM6047 = C0313.m6045(0.8f);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = !zM6047 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            boolean zM6048 = C0313.m6045(0.15f);
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case 76:
                                                        float f11 = C0250.f329 ^ (-832);
                                                        f9633a = f11;
                                                        f9634b = ((f10 - 27.0f) - f11) + 27.0f;
                                                        return;
                                                    case 239:
                                                        i13 = !zM6048 ? 48860 : 48829;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
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
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        throw new IllegalArgumentException(C0201.m3852(C0492.m9565(m6441(), 0, C0333.f516 ^ 873, 1391)));
    }

    /* JADX WARN: Code duplicated, block: B:573:0x04d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:0x0506 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:0x050a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x050c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x0506 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x04d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:580:0x04cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:0x0533 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:0x0540 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:0x0544 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x0540 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:0x053c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x052b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:0x0550 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x0555 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x0548 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x056c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x0577 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x057b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:0x059b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x0577 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:0x0573 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:0x0564 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x0586 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x058c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x0590 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x0650 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x058c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x0588 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x057e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x059b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x064b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:0x0593 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x0647 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x0662 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:0x063f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x065b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x065f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x0653 A[SYNTHETIC] */
    public static final void a(y0.o oVar, c9.e eVar, a2.c0 c0Var, boolean z10, c9.e eVar2, c9.f fVar, y.i1 i1Var, d5 d5Var, m0.m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        y0.o oVar2;
        y0.l lVarM4370;
        int i23;
        float f10;
        int i24;
        boolean z11;
        boolean zM5919;
        Object objM8078;
        y0 y0VarM2417;
        int i25;
        Object oVar3;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        m0.q qVar = (m0.q) mVar;
        C0394.m7698(qVar, (-1841602155) ^ C0100.f126);
        int i31 = i11 & (i11 ^ (-2));
        int i32 = 1616;
        while (true) {
            i32 ^= 1633;
            switch (i32) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i32 = i31 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    i12 = (C0317.f464 ^ 169) | i10;
                    int i33 = 1740;
                    while (true) {
                        i33 ^= 1757;
                        switch (i33) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i33 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    int i34 = C0473.f743;
                    int i35 = 1864;
                    while (true) {
                        i35 ^= 1881;
                        switch (i35) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i35 = ((i34 ^ (-556)) & i10) == 0 ? 48736 : 48705;
                                break;
                            case 47384:
                                i12 = i10;
                                break;
                            case 47417:
                                boolean zM2013 = C0103.m2013(qVar, oVar);
                                int i36 = 48767;
                                while (true) {
                                    i36 ^= 48784;
                                    switch (i36) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i13 = 2;
                                            break;
                                        case 76:
                                            i13 = 4;
                                            int i37 = 48891;
                                            while (true) {
                                                i37 ^= 48908;
                                                switch (i37) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i37 = 48922;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 239:
                                            i36 = zM2013 ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                i12 = (i13 & i10) | (i13 ^ i10);
                                int i38 = 49666;
                                while (true) {
                                    i38 ^= 49683;
                                    switch (i38) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i38 = 49697;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 47483:
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
        int i39 = C0076.f110;
        int i40 = 49790;
        while (true) {
            i40 ^= 49807;
            switch (i40) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    int i41 = C0015.f35;
                    int i42 = 50689;
                    while (true) {
                        i42 ^= 50706;
                        switch (i42) {
                            case 19:
                                i42 = ((i41 ^ 707) & i10) == 0 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                boolean zM5551 = C0289.m5551(qVar, eVar);
                                int i43 = 50813;
                                while (true) {
                                    i43 ^= 50830;
                                    switch (i43) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 53:
                                            i14 = 16;
                                            break;
                                        case 243:
                                            i43 = zM5551 ? 51557 : 50875;
                                            break;
                                        case 4075:
                                            i14 = 32;
                                            int i44 = 51588;
                                            while (true) {
                                                i44 ^= 51605;
                                                switch (i44) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i44 = 51619;
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
                                i12 = (i12 & i14) | (i12 ^ i14);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 84:
                    i12 |= C0161.f185 ^ (-822);
                    int i45 = 49914;
                    while (true) {
                        i45 ^= 49931;
                        switch (i45) {
                            case 497:
                                i45 = 50596;
                                continue;
                            case 1711:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 241:
                    i40 = ((i39 ^ 709) & i11) != 0 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
        }
        int i46 = C0268.f347;
        int i47 = 51712;
        while (true) {
            i47 ^= 51729;
            switch (i47) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i47 = ((i46 ^ (-335)) & i11) != 0 ? 51805 : 51774;
                    break;
                case 47:
                    int i48 = C0387.f657;
                    int i49 = 52611;
                    while (true) {
                        i49 ^= 52628;
                        switch (i49) {
                            case 23:
                                i49 = ((i48 ^ (-799)) & i10) == 0 ? 52704 : 52673;
                                break;
                            case 54:
                                break;
                            case 85:
                                break;
                            case 116:
                                boolean zM2014 = C0103.m2013(qVar, c0Var);
                                int i50 = 52735;
                                while (true) {
                                    i50 ^= 52752;
                                    switch (i50) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i15 = 128;
                                            break;
                                        case 1007:
                                            i50 = zM2014 ? 53479 : 52797;
                                            break;
                                        case 7927:
                                            i15 = 256;
                                            int i51 = 53510;
                                            while (true) {
                                                i51 ^= 53527;
                                                switch (i51) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i51 = 53541;
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
                                i12 = (i12 & i15) | (i12 ^ i15);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 76:
                    i12 |= C0309.f456 ^ (-366);
                    int i52 = 51836;
                    while (true) {
                        i52 ^= 51853;
                        switch (i52) {
                            case 241:
                                i52 = 52518;
                                continue;
                            case 1963:
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
        int i53 = C0413.f683;
        int i54 = 53634;
        while (true) {
            i54 ^= 53651;
            switch (i54) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i54 = ((i53 ^ (-786)) & i11) != 0 ? 53727 : 53696;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    i12 |= C0483.f756 ^ 4015;
                    int i55 = 53758;
                    while (true) {
                        i55 ^= 53775;
                        switch (i55) {
                            case 1009:
                                i55 = 54440;
                                break;
                            case 1703:
                                break;
                        }
                    }
                    break;
                case 83:
                    int i56 = C0239.f318;
                    int i57 = 54533;
                    while (true) {
                        i57 ^= 54550;
                        switch (i57) {
                            case 19:
                                i57 = ((i56 ^ (-3847)) & i10) == 0 ? 54626 : 54595;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 85:
                                break;
                            case 116:
                                boolean zM4326 = C0225.m4326(qVar, z10);
                                int i58 = 54657;
                                while (true) {
                                    i58 ^= 54674;
                                    switch (i58) {
                                        case 19:
                                            i58 = zM4326 ? 55401 : 54719;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i16 = 1024;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 3579:
                                            i16 = 2048;
                                            int i59 = 55432;
                                            while (true) {
                                                i59 ^= 55449;
                                                switch (i59) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i59 = 55463;
                                                        continue;
                                                    case 62:
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
                                i12 = (i12 & i16) | (i12 ^ i16);
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
        int i60 = C0360.f630;
        int i61 = 55556;
        while (true) {
            i61 ^= 55573;
            switch (i61) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (((i60 ^ 297) & i11) != 0) {
                        i61 = 55649;
                    }
                    break;
                case 54:
                    break;
                case 87:
                    int i62 = C0186.f210;
                    int i63 = 56455;
                    while (true) {
                        i63 ^= 56472;
                        switch (i63) {
                            case 31:
                                if (((i62 ^ (-24908)) & i10) == 0) {
                                    i63 = 56548;
                                }
                                break;
                            case 62:
                                break;
                            case 93:
                                break;
                            case 124:
                                boolean zM5552 = C0289.m5551(qVar, eVar2);
                                int i64 = 56579;
                                while (true) {
                                    i64 ^= 56596;
                                    switch (i64) {
                                        case 23:
                                            if (zM5552) {
                                                i64 = 1507472;
                                            }
                                            break;
                                        case 54:
                                            break;
                                        case 85:
                                            i17 = 8192;
                                            break;
                                        case 1564036:
                                            i17 = 16384;
                                            int i65 = 1507503;
                                            while (true) {
                                                i65 ^= 1507520;
                                                switch (i65) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 111:
                                                        i65 = 1507534;
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i64 = 56641;
                                }
                                i12 = (i12 & i17) | (i12 ^ i17);
                                break;
                            default:
                                continue;
                        }
                        i63 = 56517;
                    }
                    break;
                case 116:
                    i12 |= C0484.f757 ^ (-25357);
                    int i66 = 55680;
                    while (true) {
                        i66 ^= 55697;
                        switch (i66) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i66 = 56362;
                                break;
                            case 1467:
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i61 = 55618;
        }
        int i67 = C0124.f150;
        int i68 = 1507627;
        while (true) {
            i68 ^= 1507644;
            switch (i68) {
                case 23:
                    i68 = ((i67 ^ (-78)) & i11) != 0 ? 1507720 : 1507689;
                    break;
                case 85:
                    int i69 = 1508526;
                    while (true) {
                        i69 ^= 1508543;
                        switch (i69) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i69 = (((-196609) ^ i10) & i10) == 0 ? 1508619 : 1508588;
                                break;
                            case 83:
                                break;
                            case 114:
                                break;
                            case 436:
                                boolean zM5553 = C0289.m5551(qVar, fVar);
                                int i70 = 1508650;
                                while (true) {
                                    i70 ^= 1508667;
                                    switch (i70) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i70 = zM5553 ? 1509394 : 1508712;
                                            break;
                                        case 83:
                                            i18 = 65536;
                                            break;
                                        case 114:
                                            break;
                                        case 3369:
                                            i18 = 131072;
                                            int i71 = 1509425;
                                            while (true) {
                                                i71 ^= 1509442;
                                                switch (i71) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 115:
                                                        i71 = 1509456;
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
                                i12 = (i12 & i18) | (i12 ^ i18);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 118:
                    break;
                case 180:
                    i12 = (i12 & 196608) | (196608 ^ i12);
                    int i72 = 1507751;
                    while (true) {
                        i72 ^= 1507768;
                        switch (i72) {
                            case 31:
                                i72 = 1508433;
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
        int i73 = C0255.f334;
        int i74 = 1509549;
        while (true) {
            i74 ^= 1509566;
            switch (i74) {
                case 19:
                    i74 = ((i73 ^ (-908)) & i11) != 0 ? 1509642 : 1509611;
                    break;
                case 85:
                    int i75 = 1510448;
                    while (true) {
                        i75 ^= 1510465;
                        switch (i75) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 47:
                                break;
                            case 113:
                                i75 = (((-1572865) ^ i10) & i10) == 0 ? 1510541 : 1510510;
                                break;
                            case 204:
                                boolean zM2015 = C0103.m2013(qVar, i1Var);
                                int i76 = 1510572;
                                while (true) {
                                    i76 ^= 1510589;
                                    switch (i76) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i76 = zM2015 ? 1511316 : 1510634;
                                            break;
                                        case 87:
                                            i19 = 524288;
                                            break;
                                        case 118:
                                            break;
                                        case 809:
                                            i19 = 1048576;
                                            int i77 = 1511347;
                                            while (true) {
                                                i77 ^= 1511364;
                                                switch (i77) {
                                                    case 22:
                                                        break;
                                                    case 119:
                                                        i77 = 1511378;
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
                                i12 = (i12 & i19) | (i12 ^ i19);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 114:
                    break;
                case 436:
                    i12 = (i12 & 1572864) | (1572864 ^ i12);
                    int i78 = 1509673;
                    while (true) {
                        i78 ^= 1509690;
                        switch (i78) {
                            case 19:
                                i78 = 1510355;
                                continue;
                            case 745:
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
        int i79 = C0050.f70;
        int i80 = 1511471;
        while (true) {
            i80 ^= 1511488;
            switch (i80) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    int i81 = 1512370;
                    while (true) {
                        i81 ^= 1512387;
                        switch (i81) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 51:
                                break;
                            case 113:
                                i81 = (((-12582913) ^ i10) & i10) == 0 ? 1512463 : 1512432;
                                break;
                            case 1996:
                                boolean zM2016 = C0103.m2013(qVar, d5Var);
                                int i82 = 1512494;
                                while (true) {
                                    i82 ^= 1512511;
                                    switch (i82) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i82 = zM2016 ? 1513238 : 1512556;
                                            break;
                                        case 83:
                                            i20 = 4194304;
                                            break;
                                        case 114:
                                            break;
                                        case 809:
                                            i20 = 8388608;
                                            int i83 = 1513269;
                                            while (true) {
                                                i83 ^= 1513286;
                                                switch (i83) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 115:
                                                        i83 = 1513300;
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
                                i12 = (i12 & i20) | (i12 ^ i20);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 111:
                    i80 = ((i79 ^ 820) & i11) != 0 ? 1511564 : 1511533;
                    break;
                case 204:
                    i12 = (i12 & 12582912) | (12582912 ^ i12);
                    int i84 = 1511595;
                    while (true) {
                        i84 ^= 1511612;
                        switch (i84) {
                            case 23:
                                i84 = 1512277;
                                continue;
                            case 1001:
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
        int i85 = C0333.f516;
        int i86 = 1513393;
        while (true) {
            i86 ^= 1513410;
            switch (i86) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    int i87 = 1514292;
                    while (true) {
                        i87 ^= 1514309;
                        switch (i87) {
                            case 22:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                i21 = i12;
                                break;
                            case 113:
                                i87 = (((-100663297) ^ i10) & i10) == 0 ? 1514385 : 1514354;
                                break;
                            case 212:
                                boolean zM2017 = C0103.m2013(qVar, null);
                                int i88 = 1514416;
                                while (true) {
                                    i88 ^= 1514433;
                                    switch (i88) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 47:
                                            i22 = 33554432;
                                            break;
                                        case 113:
                                            i88 = zM2017 ? 1515160 : 1514478;
                                            break;
                                        case 1369:
                                            i22 = 67108864;
                                            int i89 = 1515191;
                                            while (true) {
                                                i89 ^= 1515208;
                                                switch (i89) {
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                        break;
                                                    case 127:
                                                        i89 = 1515222;
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
                                i21 = (i12 & i22) | (i12 ^ i22);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 115:
                    i86 = ((i85 ^ 563) & i11) != 0 ? 1513486 : 1513455;
                    break;
                case 4044:
                    int i90 = (i12 & 100663296) | (100663296 ^ i12);
                    int i91 = 1513517;
                    while (true) {
                        i91 ^= 1513534;
                        switch (i91) {
                            case 19:
                                i91 = 1514199;
                                continue;
                            case 745:
                                i21 = i90;
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
        int i92 = 1515315;
        while (true) {
            i92 ^= 1515332;
            switch (i92) {
                case 22:
                    break;
                case 53:
                    lVarM4370 = C0227.m4370();
                    i23 = 1537294;
                    while (true) {
                        i23 ^= 1537311;
                        switch (i23) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i23 = i31 != 0 ? 1537387 : 1537356;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 83:
                                break;
                            case 116:
                                oVar = lVarM4370;
                                break;
                            default:
                                break;
                        }
                    }
                    f10 = -C0114.m2209((m2.b) C0476.m9256(qVar, C0479.m9327()), C0243.m4638());
                    C0262.m4990(qVar, (-1008351259) ^ C0193.f217);
                    i24 = 1537418;
                    while (true) {
                        i24 ^= 1537435;
                        switch (i24) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i24 = (((-234881025) ^ i21) & i21) == 67108864 ? 1537511 : 1537480;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 83:
                                z11 = false;
                                break;
                            case 124:
                                z11 = true;
                                i30 = 1537542;
                                while (true) {
                                    i30 ^= 1537559;
                                    switch (i30) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i30 = 1538224;
                                            continue;
                                            continue;
                                        case 3751:
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
                    zM5919 = C0307.m5919(qVar, f10);
                    objM8078 = C0412.m8078(qVar);
                    y0VarM2417 = C0125.m2417();
                    i25 = 1538317;
                    while (true) {
                        i25 ^= 1538334;
                        switch (i25) {
                            case 19:
                                i25 = !((z11 ^ zM5919) | (z11 & zM5919)) ? 1538410 : 1538379;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 85:
                                oVar3 = new o(null, f10, 0);
                                C0479.m9328(qVar, oVar3);
                                break;
                            case 116:
                                i27 = 1538441;
                                while (true) {
                                    i27 ^= 1538458;
                                    switch (i27) {
                                        case 19:
                                            i27 = objM8078 == y0VarM2417 ? 1539185 : 1538503;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 93:
                                            i28 = 1539340;
                                            while (true) {
                                                i28 ^= 1539357;
                                                switch (i28) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i28 = 1539371;
                                                        continue;
                                                        continue;
                                                    case 54:
                                                        oVar3 = objM8078;
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 1515:
                                            i29 = 1539216;
                                            while (true) {
                                                i29 ^= 1539233;
                                                switch (i29) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 49:
                                                        i29 = 1539247;
                                                        continue;
                                                        continue;
                                                    default:
                                                        continue;
                                                        continue;
                                                }
                                                oVar3 = new o(null, f10, 0);
                                                C0479.m9328(qVar, oVar3);
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
                    C0171.m3270(qVar, false);
                    C0150.m2879((c9.a) oVar3, qVar);
                    C0014.m280(d5Var);
                    m0.l3 l3VarM6525 = C0337.m6525(C0366.m7168(C0324.m6255(d5Var), C0018.m362(d5Var), C0410.m8035(C0159.m3028(), 0.0f)), C0084.m1803(400.0f, null, 5), null, qVar, 48, 12);
                    u0.b bVarM1122 = C0059.m1122(qVar, 1520880723 ^ C0082.f116, new r(fVar, 0));
                    C0262.m4990(qVar, (-1008350422) ^ C0466.f736);
                    C0171.m3270(qVar, false);
                    C0148.m2825(C0449.m8743(oVar, lVarM4370), null, C0455.m8864((e1.r) C0419.m8214(l3VarM6525)), 0L, 0.0f, 0.0f, null, C0059.m1122(qVar, (-376925542) ^ C0186.f210, new p(i1Var, d5Var, eVar, c0Var, z10, eVar2, bVarM1122)), qVar, 12583766 ^ C0043.f63, C0426.f696 ^ (-299));
                    i26 = 1539464;
                    while (true) {
                        i26 ^= 1539481;
                        switch (i26) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i26 = 1540146;
                                continue;
                                continue;
                            case 64939:
                                oVar2 = oVar;
                                break;
                            default:
                                continue;
                                continue;
                        }
                    }
                    break;
                case 119:
                    i92 = (38347923 & ((i21 ^ (-1)) ^ 38347923)) == 38347922 ? 1515408 : 1515377;
                    break;
                case 212:
                    boolean zM1625 = C0074.m1625(qVar);
                    int i93 = 1515439;
                    while (true) {
                        i93 ^= 1515456;
                        switch (i93) {
                            case 111:
                                i93 = !zM1625 ? 1516183 : 1516152;
                                break;
                            case 15703:
                                int i94 = 1516214;
                                while (true) {
                                    i94 ^= 1516231;
                                    switch (i94) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 113:
                                            i94 = 1516245;
                                            continue;
                                        default:
                                            continue;
                                    }
                                    lVarM4370 = C0227.m4370();
                                    i23 = 1537294;
                                    while (true) {
                                        i23 ^= 1537311;
                                        switch (i23) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (i31 != 0) {
                                                }
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 83:
                                                break;
                                            case 116:
                                                oVar = lVarM4370;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    f10 = -C0114.m2209((m2.b) C0476.m9256(qVar, C0479.m9327()), C0243.m4638());
                                    C0262.m4990(qVar, (-1008351259) ^ C0193.f217);
                                    i24 = 1537418;
                                    while (true) {
                                        i24 ^= 1537435;
                                        switch (i24) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if ((((-234881025) ^ i21) & i21) == 67108864) {
                                                }
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 83:
                                                z11 = false;
                                                break;
                                            case 124:
                                                z11 = true;
                                                i30 = 1537542;
                                                while (true) {
                                                    i30 ^= 1537559;
                                                    switch (i30) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i30 = 1538224;
                                                            continue;
                                                            continue;
                                                        case 3751:
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
                                    zM5919 = C0307.m5919(qVar, f10);
                                    objM8078 = C0412.m8078(qVar);
                                    y0VarM2417 = C0125.m2417();
                                    i25 = 1538317;
                                    while (true) {
                                        i25 ^= 1538334;
                                        switch (i25) {
                                            case 19:
                                                if (!((z11 ^ zM5919) | (z11 & zM5919))) {
                                                }
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 85:
                                                oVar3 = new o(null, f10, 0);
                                                C0479.m9328(qVar, oVar3);
                                                break;
                                            case 116:
                                                i27 = 1538441;
                                                while (true) {
                                                    i27 ^= 1538458;
                                                    switch (i27) {
                                                        case 19:
                                                            if (objM8078 == y0VarM2417) {
                                                            }
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 93:
                                                            i28 = 1539340;
                                                            while (true) {
                                                                i28 ^= 1539357;
                                                                switch (i28) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i28 = 1539371;
                                                                        continue;
                                                                        continue;
                                                                    case 54:
                                                                        oVar3 = objM8078;
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        case 1515:
                                                            i29 = 1539216;
                                                            while (true) {
                                                                i29 ^= 1539233;
                                                                switch (i29) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case 49:
                                                                        i29 = 1539247;
                                                                        continue;
                                                                        continue;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                }
                                                                oVar3 = new o(null, f10, 0);
                                                                C0479.m9328(qVar, oVar3);
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
                                    C0171.m3270(qVar, false);
                                    C0150.m2879((c9.a) oVar3, qVar);
                                    C0014.m280(d5Var);
                                    m0.l3 l3VarM6526 = C0337.m6525(C0366.m7168(C0324.m6255(d5Var), C0018.m362(d5Var), C0410.m8035(C0159.m3028(), 0.0f)), C0084.m1803(400.0f, null, 5), null, qVar, 48, 12);
                                    u0.b bVarM1123 = C0059.m1122(qVar, 1520880723 ^ C0082.f116, new r(fVar, 0));
                                    C0262.m4990(qVar, (-1008350422) ^ C0466.f736);
                                    C0171.m3270(qVar, false);
                                    C0148.m2825(C0449.m8743(oVar, lVarM4370), null, C0455.m8864((e1.r) C0419.m8214(l3VarM6526)), 0L, 0.0f, 0.0f, null, C0059.m1122(qVar, (-376925542) ^ C0186.f210, new p(i1Var, d5Var, eVar, c0Var, z10, eVar2, bVarM1123)), qVar, 12583766 ^ C0043.f63, C0426.f696 ^ (-299));
                                    i26 = 1539464;
                                    while (true) {
                                        i26 ^= 1539481;
                                        switch (i26) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i26 = 1540146;
                                                continue;
                                                continue;
                                            case 64939:
                                                oVar2 = oVar;
                                                break;
                                            default:
                                                continue;
                                                continue;
                                        }
                                    }
                                }
                                break;
                            case 15769:
                                break;
                            case 15800:
                                C0471.m9156(qVar);
                                oVar2 = oVar;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
            int i95 = 1516338;
            while (true) {
                i95 ^= 1516355;
                switch (i95) {
                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        m0.x1 x1VarM7533 = C0385.m7533(qVar);
                        int i96 = 1540239;
                        while (true) {
                            i96 ^= 1540256;
                            switch (i96) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 47:
                                    if (x1VarM7533 != null) {
                                        i96 = 1540332;
                                    }
                                    break;
                                case 76:
                                    x1VarM7533.f11756d = new q(oVar2, eVar, c0Var, z10, eVar2, fVar, i1Var, d5Var, i10, i11);
                                    return;
                                case 109:
                                    return;
                                default:
                                    continue;
                            }
                            i96 = 1540301;
                        }
                        break;
                    case 113:
                        i95 = 1516369;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:441:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x03d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x0401 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x040b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x051a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x0407 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:0x03d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:0x03c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:0x041a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x041e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x0424 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x0433 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x0420 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x041a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x0412 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x042f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:0x051a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x0427 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:0x0525 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x0529 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x052f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x0542 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:0x052b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:0x0525 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:0x051d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:0x053e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:0x0542 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:0x0536 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:0x054d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x0551 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x0557 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x055b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x0553 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:0x054d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x0545 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x0566 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x056a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:0x0570 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x0574 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x056c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:0x0566 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x055e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x0581 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x058b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x058f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x0609 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:0x058b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:0x0587 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x0579 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x05ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x05f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x05e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x05ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:0x060b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:0x060f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x06f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:0x060b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x0605 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:0x05f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x0635 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:0x063b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:0x063f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x069d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:0x063b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x0637 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x062d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x0661 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x0667 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x066b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x06ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:0x0667 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:0x0663 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:0x0659 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:0x067e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:0x06b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:0x0676 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:0x06b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:0x06aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:0x048c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:0x0515 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:0x0484 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:0x0673 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:0x06c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:0x06c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:0x0443 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:0x0447 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:0x0451 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:0x0456 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:0x044d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:0x0443 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:0x043b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:0x0463 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:0x0467 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:0x0471 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:0x06f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:0x046d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:0x0463 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:0x045b A[SYNTHETIC] */
    public static final void b(c9.e eVar, y0.o oVar, c9.e eVar2, c9.f fVar, y.i1 i1Var, d5 d5Var, m0.m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        c9.e eVar3;
        y0.o oVar2;
        int i18;
        int i19;
        d5 d5Var2;
        y.i1 i1Var2;
        c9.f fVar2;
        c9.e eVar4;
        y0.o oVar3;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        d5 d5VarM3909;
        int i28;
        i0 i0Var;
        int i29;
        int i30;
        long jM1857;
        boolean zM1210;
        int i31;
        long jM1858;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        boolean zM5148;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        m0.q qVar = (m0.q) mVar;
        C0394.m7698(qVar, (-1906352359) ^ C0217.f240);
        int i49 = 1616;
        while (true) {
            i49 ^= 1633;
            switch (i49) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i49 = ((i11 ^ (-2)) & i11) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    i12 = (C0221.f300 ^ (-123)) | i10;
                    int i50 = 1740;
                    while (true) {
                        i50 ^= 1757;
                        switch (i50) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i50 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    int i51 = C0076.f110;
                    int i52 = 1864;
                    while (true) {
                        i52 ^= 1881;
                        switch (i52) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i52 = ((i51 ^ 705) & i10) == 0 ? 48736 : 48705;
                                break;
                            case 47384:
                                i12 = i10;
                                break;
                            case 47417:
                                boolean zM5551 = C0289.m5551(qVar, eVar);
                                int i53 = 48767;
                                while (true) {
                                    i53 ^= 48784;
                                    switch (i53) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i13 = 2;
                                            break;
                                        case 76:
                                            i13 = 4;
                                            int i54 = 48891;
                                            while (true) {
                                                i54 ^= 48908;
                                                switch (i54) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i54 = 48922;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 239:
                                            i53 = zM5551 ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                i12 = (i13 & i10) | (i13 ^ i10);
                                int i55 = 49666;
                                while (true) {
                                    i55 ^= 49683;
                                    switch (i55) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i55 = 49697;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 47483:
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
        int i56 = i11 & (C0409.f679 ^ (-741));
        int i57 = 49790;
        while (true) {
            i57 ^= 49807;
            switch (i57) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    int i58 = C0385.f655;
                    int i59 = 50689;
                    while (true) {
                        i59 ^= 50706;
                        switch (i59) {
                            case 19:
                                i59 = ((i58 ^ 615) & i10) == 0 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                i48 = 49914;
                                while (true) {
                                    i48 ^= 49931;
                                    switch (i48) {
                                        case 497:
                                            i48 = 50596;
                                            continue;
                                            continue;
                                        case 1711:
                                            break;
                                        default:
                                            continue;
                                            continue;
                                    }
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                boolean zM2013 = C0103.m2013(qVar, oVar);
                                int i60 = 50813;
                                while (true) {
                                    i60 ^= 50830;
                                    switch (i60) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 53:
                                            i14 = 16;
                                            break;
                                        case 243:
                                            i60 = zM2013 ? 51557 : 50875;
                                            break;
                                        case 4075:
                                            i14 = 32;
                                            int i61 = 51588;
                                            while (true) {
                                                i61 ^= 51605;
                                                switch (i61) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i61 = 51619;
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
                                i12 = (i12 & i14) | (i12 ^ i14);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 84:
                    i12 |= C0059.f79 ^ 840;
                    i48 = 49914;
                    while (true) {
                        i48 ^= 49931;
                        switch (i48) {
                            case 497:
                                i48 = 50596;
                                continue;
                                continue;
                            case 1711:
                                break;
                            default:
                                continue;
                                continue;
                        }
                    }
                    break;
                case 241:
                    i57 = i56 != 0 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
            int i62 = i11 & (C0009.f29 ^ (-433));
            int i63 = 51712;
            while (true) {
                i63 ^= 51729;
                switch (i63) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i63 = i62 != 0 ? 51805 : 51774;
                        break;
                    case 47:
                        int i64 = C0027.f47;
                        int i65 = 52611;
                        while (true) {
                            i65 ^= 52628;
                            switch (i65) {
                                case 23:
                                    i65 = ((i64 ^ 685) & i10) == 0 ? 52704 : 52673;
                                    break;
                                case 54:
                                    break;
                                case 85:
                                    i47 = 51836;
                                    while (true) {
                                        i47 ^= 51853;
                                        switch (i47) {
                                            case 241:
                                                i47 = 52518;
                                                continue;
                                                continue;
                                            case 1963:
                                                break;
                                            default:
                                                continue;
                                                continue;
                                        }
                                    }
                                    break;
                                case 116:
                                    boolean zM5552 = C0289.m5551(qVar, eVar2);
                                    int i66 = 52735;
                                    while (true) {
                                        i66 ^= 52752;
                                        switch (i66) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                i15 = 128;
                                                break;
                                            case 1007:
                                                i66 = zM5552 ? 53479 : 52797;
                                                break;
                                            case 7927:
                                                i15 = 256;
                                                int i67 = 53510;
                                                while (true) {
                                                    i67 ^= 53527;
                                                    switch (i67) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i67 = 53541;
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
                                    i12 = (i12 & i15) | (i12 ^ i15);
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 76:
                        i12 |= C0070.f90 ^ 893;
                        i47 = 51836;
                        while (true) {
                            i47 ^= 51853;
                            switch (i47) {
                                case 241:
                                    i47 = 52518;
                                    continue;
                                    continue;
                                case 1963:
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
                int i68 = i11 & (C0296.f443 ^ 83);
                int i69 = 53634;
                while (true) {
                    i69 ^= 53651;
                    switch (i69) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i69 = i68 != 0 ? 53727 : 53696;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 76:
                            i12 |= C0068.f88 ^ (-3834);
                            i46 = 53758;
                            while (true) {
                                i46 ^= 53775;
                                switch (i46) {
                                    case 1009:
                                        i46 = 54440;
                                        continue;
                                        continue;
                                    case 1703:
                                        break;
                                    default:
                                        continue;
                                        continue;
                                }
                            }
                            break;
                        case 83:
                            int i70 = C0462.f732;
                            int i71 = 54533;
                            while (true) {
                                i71 ^= 54550;
                                switch (i71) {
                                    case 19:
                                        i71 = ((i70 ^ 3933) & i10) == 0 ? 54626 : 54595;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 85:
                                        i46 = 53758;
                                        while (true) {
                                            i46 ^= 53775;
                                            switch (i46) {
                                                case 1009:
                                                    i46 = 54440;
                                                    continue;
                                                    continue;
                                                case 1703:
                                                    break;
                                                default:
                                                    continue;
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 116:
                                        boolean zM5553 = C0289.m5551(qVar, fVar);
                                        int i72 = 54657;
                                        while (true) {
                                            i72 ^= 54674;
                                            switch (i72) {
                                                case 19:
                                                    i72 = zM5553 ? 55401 : 54719;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    i16 = 1024;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 3579:
                                                    i16 = 2048;
                                                    int i73 = 55432;
                                                    while (true) {
                                                        i73 ^= 55449;
                                                        switch (i73) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i73 = 55463;
                                                                continue;
                                                            case 62:
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
                                        i12 = (i12 & i16) | (i12 ^ i16);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    int i74 = C0110.f136;
                    int i75 = 55556;
                    while (true) {
                        i75 ^= 55573;
                        switch (i75) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i75 = ((i74 ^ 25051) & i10) == 0 ? 55649 : 55618;
                                break;
                            case 54:
                                break;
                            case 87:
                                break;
                            case 116:
                                int i76 = C0189.f213;
                                int i77 = 55680;
                                while (true) {
                                    i77 ^= 55697;
                                    switch (i77) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i77 = ((i76 ^ (-720)) & i11) == 0 ? 56424 : 56393;
                                            break;
                                        case 1467:
                                            break;
                                        case 1496:
                                            i45 = 8192;
                                            break;
                                        case 1529:
                                            boolean zM2014 = C0103.m2013(qVar, i1Var);
                                            int i78 = 56455;
                                            while (true) {
                                                i78 ^= 56472;
                                                switch (i78) {
                                                    case 31:
                                                        i78 = zM2014 ? 56548 : 56517;
                                                        break;
                                                    case 62:
                                                        break;
                                                    case 93:
                                                        i45 = 8192;
                                                        break;
                                                    case 124:
                                                        i45 = 16384;
                                                        int i79 = 56579;
                                                        while (true) {
                                                            i79 ^= 56596;
                                                            switch (i79) {
                                                                case 23:
                                                                    i79 = 56610;
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
                                i12 = (i12 & i45) | (i12 ^ i45);
                                int i80 = 1507503;
                                while (true) {
                                    i80 ^= 1507520;
                                    switch (i80) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 111:
                                            i80 = 1507534;
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
                    int i81 = 1507627;
                    while (true) {
                        i81 ^= 1507644;
                        switch (i81) {
                            case 23:
                                i81 = (196608 & ((i10 ^ (-1)) ^ 196608)) == 0 ? 1507720 : 1507689;
                                break;
                            case 85:
                                break;
                            case 118:
                                break;
                            case 180:
                                int i82 = C0080.f114;
                                int i83 = 1507751;
                                while (true) {
                                    i83 ^= 1507768;
                                    switch (i83) {
                                        case 31:
                                            i83 = ((i82 ^ (-640)) & i11) == 0 ? 1508495 : 1508464;
                                            break;
                                        case 1335:
                                            boolean zM2015 = C0103.m2013(qVar, d5Var);
                                            int i84 = 1508526;
                                            while (true) {
                                                i84 ^= 1508543;
                                                switch (i84) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i84 = zM2015 ? 1508619 : 1508588;
                                                        break;
                                                    case 83:
                                                        i44 = 65536;
                                                        break;
                                                    case 114:
                                                        break;
                                                    case 436:
                                                        i44 = 131072;
                                                        int i85 = 1508650;
                                                        while (true) {
                                                            i85 ^= 1508667;
                                                            switch (i85) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i85 = 1508681;
                                                                    continue;
                                                                case 114:
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
                                        case 1480:
                                            i44 = 65536;
                                            break;
                                        case 1513:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                i12 = (i12 & i44) | (i12 ^ i44);
                                int i86 = 1509425;
                                while (true) {
                                    i86 ^= 1509442;
                                    switch (i86) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 115:
                                            i86 = 1509456;
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
                    int i87 = C0183.f207;
                    int i88 = 1509549;
                    while (true) {
                        i88 ^= 1509566;
                        switch (i88) {
                            case 19:
                                i88 = ((i87 ^ (-824)) & i11) != 0 ? 1509642 : 1509611;
                                break;
                            case 85:
                                int i89 = 1510448;
                                while (true) {
                                    i89 ^= 1510465;
                                    switch (i89) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 47:
                                            break;
                                        case 113:
                                            i89 = (((-1572865) ^ i10) & i10) == 0 ? 1510541 : 1510510;
                                            break;
                                        case 204:
                                            boolean zM2016 = C0103.m2013(qVar, null);
                                            int i90 = 1510572;
                                            while (true) {
                                                i90 ^= 1510589;
                                                switch (i90) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i90 = zM2016 ? 1511316 : 1510634;
                                                        break;
                                                    case 87:
                                                        i17 = 524288;
                                                        break;
                                                    case 118:
                                                        break;
                                                    case 809:
                                                        i17 = 1048576;
                                                        int i91 = 1511347;
                                                        while (true) {
                                                            i91 ^= 1511364;
                                                            switch (i91) {
                                                                case 22:
                                                                    break;
                                                                case 119:
                                                                    i91 = 1511378;
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
                                            i12 = (i12 & i17) | (i12 ^ i17);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 114:
                                break;
                            case 436:
                                i12 = (i12 & 1572864) | (1572864 ^ i12);
                                int i92 = 1509673;
                                while (true) {
                                    i92 ^= 1509690;
                                    switch (i92) {
                                        case 19:
                                            i92 = 1510355;
                                            continue;
                                        case 745:
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
                    int i93 = 1511471;
                    while (true) {
                        i93 ^= 1511488;
                        switch (i93) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                C0309.m5960(qVar);
                                i18 = 1513269;
                                while (true) {
                                    i18 ^= 1513286;
                                    switch (i18) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 53:
                                            i21 = 1515315;
                                            while (true) {
                                                i21 ^= 1515332;
                                                switch (i21) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 119:
                                                        i21 = i56 != 0 ? 1515408 : 1515377;
                                                        break;
                                                    case 212:
                                                        oVar = C0227.m4370();
                                                        i36 = 1515439;
                                                        while (true) {
                                                            i36 ^= 1515456;
                                                            switch (i36) {
                                                                case 111:
                                                                    i36 = 1516121;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                case 15769:
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            i22 = 1516214;
                                            while (true) {
                                                i22 ^= 1516231;
                                                switch (i22) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        break;
                                                    case 113:
                                                        i22 = i62 != 0 ? 1516307 : 1516276;
                                                        break;
                                                    case 468:
                                                        eVar2 = C0117.m2255();
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            i23 = 1516338;
                                            while (true) {
                                                i23 ^= 1516355;
                                                switch (i23) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        break;
                                                    case 113:
                                                        i23 = i68 != 0 ? 1537263 : 1516400;
                                                        break;
                                                    case 22444:
                                                        fVar = C0194.m3719();
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            i24 = C0224.f303;
                                            i25 = 1537294;
                                            while (true) {
                                                i25 ^= 1537311;
                                                switch (i25) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i25 = ((i24 ^ (-249)) & i11) != 0 ? 1537387 : 1537356;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 83:
                                                        i19 = i12;
                                                        break;
                                                    case 116:
                                                        C0262.m4990(qVar, (-2143182451) ^ C0103.f129);
                                                        C0262.m4990(qVar, (-1816710364) ^ C0335.f518);
                                                        C0262.m4990(qVar, 282936952 ^ C0255.f334);
                                                        C0315.m6095();
                                                        y.j1 j1VarM6387 = C0331.m6387(qVar);
                                                        C0171.m3270(qVar, false);
                                                        C0171.m3270(qVar, false);
                                                        int iM1079 = C0056.m1079();
                                                        i1Var = new y.n0(C0201.m3858(j1VarM6387), (iM1079 & 16) | (iM1079 ^ 16));
                                                        C0171.m3270(qVar, false);
                                                        i34 = i12 & (57344 ^ i12);
                                                        i35 = 1537418;
                                                        while (true) {
                                                            i35 ^= 1537435;
                                                            switch (i35) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i35 = 1537449;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    i19 = i34;
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            i26 = C0445.f715;
                                            i27 = 1537542;
                                            while (true) {
                                                i27 ^= 1537559;
                                                switch (i27) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i27 = ((i26 ^ (-888)) & i11) != 0 ? 1538286 : 1538255;
                                                        break;
                                                    case 3751:
                                                        break;
                                                    case 3800:
                                                        d5VarM3909 = d5Var;
                                                        break;
                                                    case 3833:
                                                        C0262.m4990(qVar, (-1388521363) ^ C0034.f54);
                                                        i0Var = (i0) C0476.m9256(qVar, C0446.m8687());
                                                        d5VarM3909 = C0204.m3909(i0Var);
                                                        i29 = 1538317;
                                                        while (true) {
                                                            i29 ^= 1538334;
                                                            switch (i29) {
                                                                case 19:
                                                                    i29 = d5VarM3909 == null ? 1538410 : 1538379;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 85:
                                                                    break;
                                                                case 116:
                                                                    C0243.m4638();
                                                                    i30 = C0203.f227 ^ (-58);
                                                                    jM1857 = C0087.m1857(i0Var, i30);
                                                                    zM1210 = C0063.m1210(C0087.m1857(i0Var, i30), C0336.m6503(i0Var));
                                                                    i31 = 1538441;
                                                                    while (true) {
                                                                        i31 ^= 1538458;
                                                                        switch (i31) {
                                                                            case 19:
                                                                                i31 = zM1210 ? 1539185 : 1538503;
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 93:
                                                                                jM1858 = C0087.m1857(i0Var, i30);
                                                                                i32 = 1539340;
                                                                                while (true) {
                                                                                    i32 ^= 1539357;
                                                                                    switch (i32) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i32 = 1539371;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                        case 54:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1515:
                                                                                jM1858 = C0423.m8285(i0Var, C0223.m4280());
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    i33 = 1539216;
                                                                    while (true) {
                                                                        i33 ^= 1539233;
                                                                        switch (i33) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                d5VarM3909 = new d5(jM1857, jM1858, C0087.m1857(i0Var, C0091.m1944()), C0087.m1857(i0Var, C0117.m2266()), C0087.m1857(i0Var, C0409.m8008()));
                                                                                i0Var.O = d5VarM3909;
                                                                                break;
                                                                            case 49:
                                                                                i33 = 1539247;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        C0171.m3270(qVar, false);
                                                        i19 &= 458752 ^ i19;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            i28 = 1539464;
                                            while (true) {
                                                i28 ^= 1539481;
                                                switch (i28) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i28 = 1540146;
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                    case 64939:
                                                        eVar4 = eVar2;
                                                        oVar3 = oVar;
                                                        d5Var2 = d5VarM3909;
                                                        i1Var2 = i1Var;
                                                        fVar2 = fVar;
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 115:
                                            i18 = ((i10 ^ (-2)) & i10) != 0 ? 1513362 : 1513331;
                                            break;
                                        case 212:
                                            zM5148 = C0270.m5148(qVar);
                                            i37 = 1513393;
                                            while (true) {
                                                i37 ^= 1513410;
                                                switch (i37) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        C0471.m9156(qVar);
                                                        i38 = C0026.f46;
                                                        i39 = 1514292;
                                                        while (true) {
                                                            i39 ^= 1514309;
                                                            switch (i39) {
                                                                case 22:
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                                    break;
                                                                case 113:
                                                                    i39 = ((i38 ^ (-297)) & i11) != 0 ? 1514385 : 1514354;
                                                                    break;
                                                                case 212:
                                                                    i12 &= 57344 ^ i12;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        i40 = C0301.f448;
                                                        i41 = 1514416;
                                                        while (true) {
                                                            i41 ^= 1514433;
                                                            switch (i41) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 47:
                                                                    i42 = i12;
                                                                    break;
                                                                case 113:
                                                                    i41 = ((i40 ^ (-719)) & i11) != 0 ? 1515160 : 1514478;
                                                                    break;
                                                                case 1369:
                                                                    i42 = i12 & (458752 ^ i12);
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        i19 = i42;
                                                        eVar4 = eVar2;
                                                        oVar3 = oVar;
                                                        d5Var2 = d5Var;
                                                        i1Var2 = i1Var;
                                                        fVar2 = fVar;
                                                        break;
                                                    case 115:
                                                        i37 = zM5148 ? 1513486 : 1513455;
                                                        break;
                                                    case 4044:
                                                        i43 = 1513517;
                                                        while (true) {
                                                            i43 ^= 1513534;
                                                            switch (i43) {
                                                                case 19:
                                                                    i43 = 1514199;
                                                                    continue;
                                                                    continue;
                                                                case 745:
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                            }
                                                            i21 = 1515315;
                                                            while (true) {
                                                                i21 ^= 1515332;
                                                                switch (i21) {
                                                                    case 22:
                                                                        break;
                                                                    case 53:
                                                                        break;
                                                                    case 119:
                                                                        if (i56 != 0) {
                                                                        }
                                                                        break;
                                                                    case 212:
                                                                        oVar = C0227.m4370();
                                                                        i36 = 1515439;
                                                                        while (true) {
                                                                            i36 ^= 1515456;
                                                                            switch (i36) {
                                                                                case 111:
                                                                                    i36 = 1516121;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case 15769:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            i22 = 1516214;
                                                            while (true) {
                                                                i22 ^= 1516231;
                                                                switch (i22) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 51:
                                                                        break;
                                                                    case 113:
                                                                        if (i62 != 0) {
                                                                        }
                                                                        break;
                                                                    case 468:
                                                                        eVar2 = C0117.m2255();
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            i23 = 1516338;
                                                            while (true) {
                                                                i23 ^= 1516355;
                                                                switch (i23) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 51:
                                                                        break;
                                                                    case 113:
                                                                        if (i68 != 0) {
                                                                        }
                                                                        break;
                                                                    case 22444:
                                                                        fVar = C0194.m3719();
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            i24 = C0224.f303;
                                                            i25 = 1537294;
                                                            while (true) {
                                                                i25 ^= 1537311;
                                                                switch (i25) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (((i24 ^ (-249)) & i11) != 0) {
                                                                        }
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 83:
                                                                        i19 = i12;
                                                                        break;
                                                                    case 116:
                                                                        C0262.m4990(qVar, (-2143182451) ^ C0103.f129);
                                                                        C0262.m4990(qVar, (-1816710364) ^ C0335.f518);
                                                                        C0262.m4990(qVar, 282936952 ^ C0255.f334);
                                                                        C0315.m6095();
                                                                        y.j1 j1VarM6388 = C0331.m6387(qVar);
                                                                        C0171.m3270(qVar, false);
                                                                        C0171.m3270(qVar, false);
                                                                        int iM10710 = C0056.m1079();
                                                                        i1Var = new y.n0(C0201.m3858(j1VarM6388), (iM10710 & 16) | (iM10710 ^ 16));
                                                                        C0171.m3270(qVar, false);
                                                                        i34 = i12 & (57344 ^ i12);
                                                                        i35 = 1537418;
                                                                        while (true) {
                                                                            i35 ^= 1537435;
                                                                            switch (i35) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i35 = 1537449;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    i19 = i34;
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            i26 = C0445.f715;
                                                            i27 = 1537542;
                                                            while (true) {
                                                                i27 ^= 1537559;
                                                                switch (i27) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (((i26 ^ (-888)) & i11) != 0) {
                                                                        }
                                                                        break;
                                                                    case 3751:
                                                                        break;
                                                                    case 3800:
                                                                        d5VarM3909 = d5Var;
                                                                        break;
                                                                    case 3833:
                                                                        C0262.m4990(qVar, (-1388521363) ^ C0034.f54);
                                                                        i0Var = (i0) C0476.m9256(qVar, C0446.m8687());
                                                                        d5VarM3909 = C0204.m3909(i0Var);
                                                                        i29 = 1538317;
                                                                        while (true) {
                                                                            i29 ^= 1538334;
                                                                            switch (i29) {
                                                                                case 19:
                                                                                    if (d5VarM3909 == null) {
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                case 85:
                                                                                    break;
                                                                                case 116:
                                                                                    C0243.m4638();
                                                                                    i30 = C0203.f227 ^ (-58);
                                                                                    jM1857 = C0087.m1857(i0Var, i30);
                                                                                    zM1210 = C0063.m1210(C0087.m1857(i0Var, i30), C0336.m6503(i0Var));
                                                                                    i31 = 1538441;
                                                                                    while (true) {
                                                                                        i31 ^= 1538458;
                                                                                        switch (i31) {
                                                                                            case 19:
                                                                                                if (zM1210) {
                                                                                                }
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                break;
                                                                                            case 93:
                                                                                                jM1858 = C0087.m1857(i0Var, i30);
                                                                                                i32 = 1539340;
                                                                                                while (true) {
                                                                                                    i32 ^= 1539357;
                                                                                                    switch (i32) {
                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i32 = 1539371;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                        case 54:
                                                                                                            break;
                                                                                                        default:
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 1515:
                                                                                                jM1858 = C0423.m8285(i0Var, C0223.m4280());
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    i33 = 1539216;
                                                                                    while (true) {
                                                                                        i33 ^= 1539233;
                                                                                        switch (i33) {
                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                d5VarM3909 = new d5(jM1857, jM1858, C0087.m1857(i0Var, C0091.m1944()), C0087.m1857(i0Var, C0117.m2266()), C0087.m1857(i0Var, C0409.m8008()));
                                                                                                i0Var.O = d5VarM3909;
                                                                                                break;
                                                                                            case 49:
                                                                                                i33 = 1539247;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                            default:
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0171.m3270(qVar, false);
                                                                        i19 &= 458752 ^ i19;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            i28 = 1539464;
                                                            while (true) {
                                                                i28 ^= 1539481;
                                                                switch (i28) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i28 = 1540146;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    case 64939:
                                                                        eVar4 = eVar2;
                                                                        oVar3 = oVar;
                                                                        d5Var2 = d5VarM3909;
                                                                        i1Var2 = i1Var;
                                                                        fVar2 = fVar;
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
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
                                    i20 = 1515191;
                                    while (true) {
                                        i20 ^= 1515208;
                                        switch (i20) {
                                            case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                C0103.m2025(qVar);
                                                a2.c0 c0VarM2156 = C0112.m2156((e5) C0476.m9256(qVar, C0456.m8878()), C0090.m1932());
                                                int i94 = ((i19 >> (C0139.f165 ^ 641)) & (C0131.f157 ^ (-871))) | (C0255.f334 ^ (-4044));
                                                int i95 = (i19 << (C0349.f619 ^ 982)) & (C0221.f300 ^ (-13));
                                                int i96 = (i94 & i95) | (i94 ^ i95);
                                                int i97 = i19 << (C0398.f668 ^ 734);
                                                int i98 = 57344 & ((i97 ^ (-1)) ^ 57344);
                                                int i99 = (i96 & i98) | (i96 ^ i98);
                                                int i100 = 458752 & ((i97 ^ (-1)) ^ 458752);
                                                int i101 = (i99 & i100) | (i99 ^ i100);
                                                int i102 = 3670016 & ((i97 ^ (-1)) ^ 3670016);
                                                int i103 = (i101 & i102) | (i101 ^ i102);
                                                int i104 = 29360128 & ((i97 ^ (-1)) ^ 29360128);
                                                int i105 = (i103 & i104) | (i103 ^ i104);
                                                int i106 = ((-234881025) ^ i97) & i97;
                                                C0482.m9381(oVar3, eVar, c0VarM2156, false, eVar4, fVar2, i1Var2, d5Var2, qVar, (i105 ^ i106) | (i105 & i106), 0);
                                                eVar3 = eVar4;
                                                oVar2 = oVar3;
                                                d5Var = d5Var2;
                                                i1Var = i1Var2;
                                                fVar = fVar2;
                                                break;
                                            case 127:
                                                i20 = 1515222;
                                                continue;
                                                continue;
                                            default:
                                                continue;
                                                continue;
                                        }
                                    }
                                }
                                break;
                            case 111:
                                i93 = (599187 & ((i12 ^ (-1)) ^ 599187)) == 599186 ? 1511564 : 1511533;
                                break;
                            case 204:
                                boolean zM1625 = C0074.m1625(qVar);
                                int i107 = 1511595;
                                while (true) {
                                    i107 ^= 1511612;
                                    switch (i107) {
                                        case 23:
                                            i107 = !zM1625 ? 1512339 : 1512308;
                                            break;
                                        case 815:
                                            int i108 = 1512370;
                                            while (true) {
                                                i108 ^= 1512387;
                                                switch (i108) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 113:
                                                        i108 = 1512401;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                                C0309.m5960(qVar);
                                                i18 = 1513269;
                                                while (true) {
                                                    i18 ^= 1513286;
                                                    switch (i18) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 53:
                                                            i21 = 1515315;
                                                            while (true) {
                                                                i21 ^= 1515332;
                                                                switch (i21) {
                                                                    case 22:
                                                                        break;
                                                                    case 53:
                                                                        break;
                                                                    case 119:
                                                                        if (i56 != 0) {
                                                                        }
                                                                        break;
                                                                    case 212:
                                                                        oVar = C0227.m4370();
                                                                        i36 = 1515439;
                                                                        while (true) {
                                                                            i36 ^= 1515456;
                                                                            switch (i36) {
                                                                                case 111:
                                                                                    i36 = 1516121;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case 15769:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            i22 = 1516214;
                                                            while (true) {
                                                                i22 ^= 1516231;
                                                                switch (i22) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 51:
                                                                        break;
                                                                    case 113:
                                                                        if (i62 != 0) {
                                                                        }
                                                                        break;
                                                                    case 468:
                                                                        eVar2 = C0117.m2255();
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            i23 = 1516338;
                                                            while (true) {
                                                                i23 ^= 1516355;
                                                                switch (i23) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 51:
                                                                        break;
                                                                    case 113:
                                                                        if (i68 != 0) {
                                                                        }
                                                                        break;
                                                                    case 22444:
                                                                        fVar = C0194.m3719();
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            i24 = C0224.f303;
                                                            i25 = 1537294;
                                                            while (true) {
                                                                i25 ^= 1537311;
                                                                switch (i25) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (((i24 ^ (-249)) & i11) != 0) {
                                                                        }
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 83:
                                                                        i19 = i12;
                                                                        break;
                                                                    case 116:
                                                                        C0262.m4990(qVar, (-2143182451) ^ C0103.f129);
                                                                        C0262.m4990(qVar, (-1816710364) ^ C0335.f518);
                                                                        C0262.m4990(qVar, 282936952 ^ C0255.f334);
                                                                        C0315.m6095();
                                                                        y.j1 j1VarM6389 = C0331.m6387(qVar);
                                                                        C0171.m3270(qVar, false);
                                                                        C0171.m3270(qVar, false);
                                                                        int iM10711 = C0056.m1079();
                                                                        i1Var = new y.n0(C0201.m3858(j1VarM6389), (iM10711 & 16) | (iM10711 ^ 16));
                                                                        C0171.m3270(qVar, false);
                                                                        i34 = i12 & (57344 ^ i12);
                                                                        i35 = 1537418;
                                                                        while (true) {
                                                                            i35 ^= 1537435;
                                                                            switch (i35) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i35 = 1537449;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    i19 = i34;
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            i26 = C0445.f715;
                                                            i27 = 1537542;
                                                            while (true) {
                                                                i27 ^= 1537559;
                                                                switch (i27) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (((i26 ^ (-888)) & i11) != 0) {
                                                                        }
                                                                        break;
                                                                    case 3751:
                                                                        break;
                                                                    case 3800:
                                                                        d5VarM3909 = d5Var;
                                                                        break;
                                                                    case 3833:
                                                                        C0262.m4990(qVar, (-1388521363) ^ C0034.f54);
                                                                        i0Var = (i0) C0476.m9256(qVar, C0446.m8687());
                                                                        d5VarM3909 = C0204.m3909(i0Var);
                                                                        i29 = 1538317;
                                                                        while (true) {
                                                                            i29 ^= 1538334;
                                                                            switch (i29) {
                                                                                case 19:
                                                                                    if (d5VarM3909 == null) {
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                case 85:
                                                                                    break;
                                                                                case 116:
                                                                                    C0243.m4638();
                                                                                    i30 = C0203.f227 ^ (-58);
                                                                                    jM1857 = C0087.m1857(i0Var, i30);
                                                                                    zM1210 = C0063.m1210(C0087.m1857(i0Var, i30), C0336.m6503(i0Var));
                                                                                    i31 = 1538441;
                                                                                    while (true) {
                                                                                        i31 ^= 1538458;
                                                                                        switch (i31) {
                                                                                            case 19:
                                                                                                if (zM1210) {
                                                                                                }
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                break;
                                                                                            case 93:
                                                                                                jM1858 = C0087.m1857(i0Var, i30);
                                                                                                i32 = 1539340;
                                                                                                while (true) {
                                                                                                    i32 ^= 1539357;
                                                                                                    switch (i32) {
                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i32 = 1539371;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                        case 54:
                                                                                                            break;
                                                                                                        default:
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 1515:
                                                                                                jM1858 = C0423.m8285(i0Var, C0223.m4280());
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    i33 = 1539216;
                                                                                    while (true) {
                                                                                        i33 ^= 1539233;
                                                                                        switch (i33) {
                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                d5VarM3909 = new d5(jM1857, jM1858, C0087.m1857(i0Var, C0091.m1944()), C0087.m1857(i0Var, C0117.m2266()), C0087.m1857(i0Var, C0409.m8008()));
                                                                                                i0Var.O = d5VarM3909;
                                                                                                break;
                                                                                            case 49:
                                                                                                i33 = 1539247;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                            default:
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0171.m3270(qVar, false);
                                                                        i19 &= 458752 ^ i19;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            i28 = 1539464;
                                                            while (true) {
                                                                i28 ^= 1539481;
                                                                switch (i28) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i28 = 1540146;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    case 64939:
                                                                        eVar4 = eVar2;
                                                                        oVar3 = oVar;
                                                                        d5Var2 = d5VarM3909;
                                                                        i1Var2 = i1Var;
                                                                        fVar2 = fVar;
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        case 115:
                                                            if (((i10 ^ (-2)) & i10) != 0) {
                                                            }
                                                            break;
                                                        case 212:
                                                            zM5148 = C0270.m5148(qVar);
                                                            i37 = 1513393;
                                                            while (true) {
                                                                i37 ^= 1513410;
                                                                switch (i37) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        C0471.m9156(qVar);
                                                                        i38 = C0026.f46;
                                                                        i39 = 1514292;
                                                                        while (true) {
                                                                            i39 ^= 1514309;
                                                                            switch (i39) {
                                                                                case 22:
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                                                    break;
                                                                                case 113:
                                                                                    if (((i38 ^ (-297)) & i11) != 0) {
                                                                                    }
                                                                                    break;
                                                                                case 212:
                                                                                    i12 &= 57344 ^ i12;
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        i40 = C0301.f448;
                                                                        i41 = 1514416;
                                                                        while (true) {
                                                                            i41 ^= 1514433;
                                                                            switch (i41) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case 47:
                                                                                    i42 = i12;
                                                                                    break;
                                                                                case 113:
                                                                                    if (((i40 ^ (-719)) & i11) != 0) {
                                                                                    }
                                                                                    break;
                                                                                case 1369:
                                                                                    i42 = i12 & (458752 ^ i12);
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        i19 = i42;
                                                                        eVar4 = eVar2;
                                                                        oVar3 = oVar;
                                                                        d5Var2 = d5Var;
                                                                        i1Var2 = i1Var;
                                                                        fVar2 = fVar;
                                                                        break;
                                                                    case 115:
                                                                        if (zM5148) {
                                                                        }
                                                                        break;
                                                                    case 4044:
                                                                        i43 = 1513517;
                                                                        while (true) {
                                                                            i43 ^= 1513534;
                                                                            switch (i43) {
                                                                                case 19:
                                                                                    i43 = 1514199;
                                                                                    continue;
                                                                                    continue;
                                                                                case 745:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                            i21 = 1515315;
                                                                            while (true) {
                                                                                i21 ^= 1515332;
                                                                                switch (i21) {
                                                                                    case 22:
                                                                                        break;
                                                                                    case 53:
                                                                                        break;
                                                                                    case 119:
                                                                                        if (i56 != 0) {
                                                                                        }
                                                                                        break;
                                                                                    case 212:
                                                                                        oVar = C0227.m4370();
                                                                                        i36 = 1515439;
                                                                                        while (true) {
                                                                                            i36 ^= 1515456;
                                                                                            switch (i36) {
                                                                                                case 111:
                                                                                                    i36 = 1516121;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                case 15769:
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i22 = 1516214;
                                                                            while (true) {
                                                                                i22 ^= 1516231;
                                                                                switch (i22) {
                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case 51:
                                                                                        break;
                                                                                    case 113:
                                                                                        if (i62 != 0) {
                                                                                        }
                                                                                        break;
                                                                                    case 468:
                                                                                        eVar2 = C0117.m2255();
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i23 = 1516338;
                                                                            while (true) {
                                                                                i23 ^= 1516355;
                                                                                switch (i23) {
                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case 51:
                                                                                        break;
                                                                                    case 113:
                                                                                        if (i68 != 0) {
                                                                                        }
                                                                                        break;
                                                                                    case 22444:
                                                                                        fVar = C0194.m3719();
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i24 = C0224.f303;
                                                                            i25 = 1537294;
                                                                            while (true) {
                                                                                i25 ^= 1537311;
                                                                                switch (i25) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        if (((i24 ^ (-249)) & i11) != 0) {
                                                                                        }
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        break;
                                                                                    case 83:
                                                                                        i19 = i12;
                                                                                        break;
                                                                                    case 116:
                                                                                        C0262.m4990(qVar, (-2143182451) ^ C0103.f129);
                                                                                        C0262.m4990(qVar, (-1816710364) ^ C0335.f518);
                                                                                        C0262.m4990(qVar, 282936952 ^ C0255.f334);
                                                                                        C0315.m6095();
                                                                                        y.j1 j1VarM63810 = C0331.m6387(qVar);
                                                                                        C0171.m3270(qVar, false);
                                                                                        C0171.m3270(qVar, false);
                                                                                        int iM10712 = C0056.m1079();
                                                                                        i1Var = new y.n0(C0201.m3858(j1VarM63810), (iM10712 & 16) | (iM10712 ^ 16));
                                                                                        C0171.m3270(qVar, false);
                                                                                        i34 = i12 & (57344 ^ i12);
                                                                                        i35 = 1537418;
                                                                                        while (true) {
                                                                                            i35 ^= 1537435;
                                                                                            switch (i35) {
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i35 = 1537449;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                    i19 = i34;
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i26 = C0445.f715;
                                                                            i27 = 1537542;
                                                                            while (true) {
                                                                                i27 ^= 1537559;
                                                                                switch (i27) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        if (((i26 ^ (-888)) & i11) != 0) {
                                                                                        }
                                                                                        break;
                                                                                    case 3751:
                                                                                        break;
                                                                                    case 3800:
                                                                                        d5VarM3909 = d5Var;
                                                                                        break;
                                                                                    case 3833:
                                                                                        C0262.m4990(qVar, (-1388521363) ^ C0034.f54);
                                                                                        i0Var = (i0) C0476.m9256(qVar, C0446.m8687());
                                                                                        d5VarM3909 = C0204.m3909(i0Var);
                                                                                        i29 = 1538317;
                                                                                        while (true) {
                                                                                            i29 ^= 1538334;
                                                                                            switch (i29) {
                                                                                                case 19:
                                                                                                    if (d5VarM3909 == null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                    break;
                                                                                                case 85:
                                                                                                    break;
                                                                                                case 116:
                                                                                                    C0243.m4638();
                                                                                                    i30 = C0203.f227 ^ (-58);
                                                                                                    jM1857 = C0087.m1857(i0Var, i30);
                                                                                                    zM1210 = C0063.m1210(C0087.m1857(i0Var, i30), C0336.m6503(i0Var));
                                                                                                    i31 = 1538441;
                                                                                                    while (true) {
                                                                                                        i31 ^= 1538458;
                                                                                                        switch (i31) {
                                                                                                            case 19:
                                                                                                                if (zM1210) {
                                                                                                                }
                                                                                                                break;
                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                break;
                                                                                                            case 93:
                                                                                                                jM1858 = C0087.m1857(i0Var, i30);
                                                                                                                i32 = 1539340;
                                                                                                                while (true) {
                                                                                                                    i32 ^= 1539357;
                                                                                                                    switch (i32) {
                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                            i32 = 1539371;
                                                                                                                            continue;
                                                                                                                            continue;
                                                                                                                            continue;
                                                                                                                            continue;
                                                                                                                        case 54:
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            continue;
                                                                                                                            continue;
                                                                                                                            continue;
                                                                                                                            continue;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                            case 1515:
                                                                                                                jM1858 = C0423.m8285(i0Var, C0223.m4280());
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    i33 = 1539216;
                                                                                                    while (true) {
                                                                                                        i33 ^= 1539233;
                                                                                                        switch (i33) {
                                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                                d5VarM3909 = new d5(jM1857, jM1858, C0087.m1857(i0Var, C0091.m1944()), C0087.m1857(i0Var, C0117.m2266()), C0087.m1857(i0Var, C0409.m8008()));
                                                                                                                i0Var.O = d5VarM3909;
                                                                                                                break;
                                                                                                            case 49:
                                                                                                                i33 = 1539247;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                            default:
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        C0171.m3270(qVar, false);
                                                                                        i19 &= 458752 ^ i19;
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i28 = 1539464;
                                                                            while (true) {
                                                                                i28 ^= 1539481;
                                                                                switch (i28) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i28 = 1540146;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 64939:
                                                                                        eVar4 = eVar2;
                                                                                        oVar3 = oVar;
                                                                                        d5Var2 = d5VarM3909;
                                                                                        i1Var2 = i1Var;
                                                                                        fVar2 = fVar;
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
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
                                                    i20 = 1515191;
                                                    while (true) {
                                                        i20 ^= 1515208;
                                                        switch (i20) {
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                C0103.m2025(qVar);
                                                                a2.c0 c0VarM2157 = C0112.m2156((e5) C0476.m9256(qVar, C0456.m8878()), C0090.m1932());
                                                                int i910 = ((i19 >> (C0139.f165 ^ 641)) & (C0131.f157 ^ (-871))) | (C0255.f334 ^ (-4044));
                                                                int i911 = (i19 << (C0349.f619 ^ 982)) & (C0221.f300 ^ (-13));
                                                                int i912 = (i910 & i911) | (i910 ^ i911);
                                                                int i913 = i19 << (C0398.f668 ^ 734);
                                                                int i914 = 57344 & ((i913 ^ (-1)) ^ 57344);
                                                                int i915 = (i912 & i914) | (i912 ^ i914);
                                                                int i109 = 458752 & ((i913 ^ (-1)) ^ 458752);
                                                                int i1010 = (i915 & i109) | (i915 ^ i109);
                                                                int i1011 = 3670016 & ((i913 ^ (-1)) ^ 3670016);
                                                                int i1012 = (i1010 & i1011) | (i1010 ^ i1011);
                                                                int i1013 = 29360128 & ((i913 ^ (-1)) ^ 29360128);
                                                                int i1014 = (i1012 & i1013) | (i1012 ^ i1013);
                                                                int i1015 = ((-234881025) ^ i913) & i913;
                                                                C0482.m9381(oVar3, eVar, c0VarM2157, false, eVar4, fVar2, i1Var2, d5Var2, qVar, (i1014 ^ i1015) | (i1014 & i1015), 0);
                                                                eVar3 = eVar4;
                                                                oVar2 = oVar3;
                                                                d5Var = d5Var2;
                                                                i1Var = i1Var2;
                                                                fVar = fVar2;
                                                                break;
                                                            case 127:
                                                                i20 = 1515222;
                                                                continue;
                                                                continue;
                                                            default:
                                                                continue;
                                                                continue;
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 968:
                                            C0471.m9156(qVar);
                                            int i110 = 1512494;
                                            while (true) {
                                                i110 ^= 1512511;
                                                switch (i110) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i110 = 1512525;
                                                        continue;
                                                    case 114:
                                                        eVar3 = eVar2;
                                                        oVar2 = oVar;
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 1001:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                        m0.x1 x1VarM7533 = C0385.m7533(qVar);
                        int i111 = 1540239;
                        while (true) {
                            i111 ^= 1540256;
                            switch (i111) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 47:
                                    if (x1VarM7533 != null) {
                                        i111 = 1540332;
                                    }
                                    break;
                                case 76:
                                    x1VarM7533.f11756d = new s.e(eVar, oVar2, eVar3, fVar, i1Var, d5Var, i10, i11);
                                    return;
                                case 109:
                                    return;
                                default:
                                    continue;
                            }
                            i111 = 1540301;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:1001:0x054a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1002:0x054f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1004:0x0542 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1006:0x055e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1007:0x056b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1008:0x056f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1009:0x057f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1010:0x056b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1011:0x0567 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1013:0x0556 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1016:0x057b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1017:0x0580 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1019:0x0573 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1021:0x0592 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1022:0x059c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1023:0x05a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1024:0x05b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1025:0x059c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1026:0x0598 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1028:0x058a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1031:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1032:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1034:0x05a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1036:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1037:0x05c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1038:0x05cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1039:0x05e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1040:0x05cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1041:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1043:0x05b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1046:0x05de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1047:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1048:0x05e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1049:0x0b2f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1050:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1051:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1053:0x05d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1056:0x0642 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1057:0x0648 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1058:0x064c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1059:0x0b2a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1060:0x0648 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1061:0x0644 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1063:0x0639 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1066:0x065f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1067:0x0663 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1068:0x0669 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1069:0x0680 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1070:0x0665 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1071:0x065f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1073:0x0656 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1076:0x067c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1077:0x0683 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1079:0x0673 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1081:0x06ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1082:0x06b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1083:0x06b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1084:0x06d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1085:0x06b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1086:0x06ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1088:0x06a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1091:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1092:0x06d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1093:0x06d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1094:0x06de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1095:0x06d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1096:0x06cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1098:0x06c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1101:0x076d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1102:0x0773 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1103:0x0777 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1104:0x0b25 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1105:0x0773 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1106:0x076f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1108:0x0765 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1111:0x0789 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1112:0x078d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1113:0x0793 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1114:0x07a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1115:0x078f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1116:0x0789 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1118:0x0781 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1121:0x07a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1122:0x07ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1124:0x079d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1126:0x07c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1127:0x07cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1128:0x07d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1129:0x07f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1130:0x07cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1131:0x07c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1133:0x07c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1136:0x07ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1137:0x07ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1138:0x07f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1139:0x07fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1140:0x07f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1141:0x07ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1143:0x07e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1146:0x0864 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1147:0x086a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1148:0x086e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1149:0x08d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1150:0x086a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1151:0x0866 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1153:0x085c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1156:0x0881 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1157:0x08d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1159:0x0879 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1161:0x08cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1162:0x08d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1163:0x08de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1164:0x0b20 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1165:0x08da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1166:0x08cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1168:0x08c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1171:0x08f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1172:0x08f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1173:0x08fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1174:0x0933 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1175:0x08f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1176:0x08f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1178:0x08e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1181:0x090c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1182:0x092f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1184:0x0904 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1186:0x0929 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1187:0x0937 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1188:0x093b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1189:0x095c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1190:0x0937 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1191:0x092b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1193:0x0921 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1196:0x0952 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1197:0x0956 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1198:0x095c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1199:0x0963 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1200:0x0958 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1201:0x0952 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1203:0x094a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1206:0x0a06 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1207:0x0a0a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1208:0x0a10 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1209:0x0b1b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1210:0x0a0c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1211:0x0a06 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1213:0x09fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1216:0x0a22 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1217:0x0a28 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1218:0x0a2c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1219:0x0a42 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1220:0x0a28 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1221:0x0a24 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1223:0x0a1a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1226:0x0a3e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1227:0x0a45 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1229:0x0a36 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1231:0x0a62 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1232:0x0a68 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1233:0x0a6c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1234:0x0a8d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1235:0x0a68 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1236:0x0a64 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1238:0x0a5a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1241:0x0a83 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1242:0x0a89 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1243:0x0a8d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1244:0x0a94 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1245:0x0a89 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1246:0x0a85 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1248:0x0a7b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1251:0x0502 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1252:0x0aec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1253:0x0af1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1254:0x0b1a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1255:0x0aec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1256:0x0504 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1258:0x04fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:976:0x04d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:977:0x050c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:978:0x0510 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:979:0x052f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:980:0x050c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:981:0x04dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:983:0x04ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:986:0x051c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:987:0x052b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:989:0x0514 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:991:0x0527 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:992:0x0531 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:993:0x053e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:994:0x054e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:995:0x053a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:996:0x0527 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:998:0x051f A[SYNTHETIC] */
    public static final void c(y0.o oVar, float f10, long j10, long j11, long j12, c9.e eVar, a2.c0 c0Var, float f11, y.i iVar, y.g gVar, int i10, boolean z10, c9.e eVar2, c9.e eVar3, m0.m mVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        m0.x1 x1VarM7533;
        int i17;
        int i18;
        int i19;
        boolean z11;
        int i20;
        boolean z12;
        int i21;
        boolean z13;
        boolean z14;
        int i22;
        int i23;
        boolean z15;
        Object objM8078;
        int i24;
        Object vVar;
        r1.j0 j0Var;
        int i25;
        int i26;
        int iM276;
        m0.r1 r1VarM275;
        t1.j jVarM4451;
        u0.b bVarM6976;
        int i27;
        int i28;
        int i29;
        boolean z16;
        int i30;
        boolean zM7502;
        int i31;
        t1.i iVarM1208;
        t1.i iVarM9055;
        t1.i iVarM5562;
        boolean zM7503;
        int i32;
        y0.l lVarM4370;
        float fM6012;
        y0.g gVarM8889;
        r1.j0 j0VarM2476;
        int iM277;
        m0.r1 r1VarM276;
        u0.b bVarM6977;
        int i33;
        boolean zM7504;
        int i34;
        boolean zM7505;
        int i35;
        m0.p0 p0VarM2168;
        int i36;
        Object clearAndSetSemanticsElement;
        r1.j0 j0VarM2477;
        int iM278;
        m0.r1 r1VarM277;
        u0.b bVarM6978;
        int i37;
        boolean zM7506;
        int i38;
        boolean zM7507;
        int i39;
        r1.j0 j0VarM2478;
        int iM279;
        m0.r1 r1VarM278;
        u0.b bVarM6979;
        int i40;
        boolean zM7508;
        int i41;
        boolean zM7509;
        int i42;
        boolean zM4399;
        int i43;
        int i44;
        boolean zM43910;
        int i45;
        int i46;
        int i47;
        boolean zM43911;
        int i48;
        int i49;
        boolean zM43912;
        int i50;
        int i51;
        y0 y0VarM2417;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i60;
        int i61;
        int i62;
        int i63;
        int i64;
        int i65;
        int i66;
        int i67;
        int i68;
        int i69;
        int i70;
        m0.q qVar = (m0.q) mVar;
        C0394.m7698(qVar, 6793291 ^ C0060.f80);
        int i71 = C0343.f613;
        int i72 = 1616;
        while (true) {
            i72 ^= 1633;
            switch (i72) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i72 = ((i71 ^ 63) & i11) == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM2013 = C0103.m2013(qVar, oVar);
                    int i73 = 1740;
                    while (true) {
                        i73 ^= 1757;
                        switch (i73) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i73 = zM2013 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                i70 = 2;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                i70 = 4;
                                int i74 = 1864;
                                while (true) {
                                    i74 ^= 1881;
                                    switch (i74) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i74 = 48674;
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
                    i13 = (i70 & i11) | (i11 ^ i70);
                    int i75 = 48767;
                    while (true) {
                        i75 ^= 48784;
                        switch (i75) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i75 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    i13 = i11;
                    break;
                default:
                    break;
            }
        }
        int i76 = C0193.f217;
        int i77 = 48891;
        while (true) {
            i77 ^= 48908;
            switch (i77) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    i77 = ((i76 ^ 252) & i11) == 0 ? 49635 : 48953;
                    break;
                case 32495:
                    boolean zM5919 = C0307.m5919(qVar, f10);
                    int i78 = 49666;
                    while (true) {
                        i78 ^= 49683;
                        switch (i78) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i78 = zM5919 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                i69 = 32;
                                int i79 = 49790;
                                while (true) {
                                    i79 ^= 49807;
                                    switch (i79) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i79 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                i69 = 16;
                                break;
                            default:
                                break;
                        }
                    }
                    i13 = (i13 & i69) | (i13 ^ i69);
                    break;
                default:
                    break;
            }
        }
        int i80 = C0430.f700;
        int i81 = 49914;
        while (true) {
            i81 ^= 49931;
            switch (i81) {
                case 497:
                    i81 = ((i80 ^ 200) & i11) == 0 ? 50658 : 50627;
                    break;
                case 1711:
                    break;
                case 1736:
                    break;
                case 1769:
                    boolean zM4041 = C0212.m4041(qVar, j10);
                    int i82 = 50689;
                    while (true) {
                        i82 ^= 50706;
                        switch (i82) {
                            case 19:
                                i82 = zM4041 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                i68 = 128;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                i68 = 256;
                                int i83 = 50813;
                                while (true) {
                                    i83 ^= 50830;
                                    switch (i83) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 243:
                                            i83 = 50844;
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
                    i13 = (i13 & i68) | (i13 ^ i68);
                    break;
                default:
                    break;
            }
        }
        int i84 = C0171.f195;
        int i85 = 51588;
        while (true) {
            i85 ^= 51605;
            switch (i85) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i85 = ((i84 ^ (-3152)) & i11) == 0 ? 51681 : 51650;
                    break;
                case 54:
                    break;
                case 87:
                    break;
                case 116:
                    boolean zM4042 = C0212.m4041(qVar, j11);
                    int i86 = 51712;
                    while (true) {
                        i86 ^= 51729;
                        switch (i86) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i86 = zM4042 ? 51805 : 51774;
                                break;
                            case 47:
                                i67 = 1024;
                                break;
                            case 76:
                                i67 = 2048;
                                int i87 = 51836;
                                while (true) {
                                    i87 ^= 51853;
                                    switch (i87) {
                                        case 241:
                                            i87 = 52518;
                                            continue;
                                        case 1963:
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
                    i13 = (i13 & i67) | (i13 ^ i67);
                    break;
                default:
                    break;
            }
        }
        int i88 = C0061.f81;
        int i89 = 52611;
        while (true) {
            i89 ^= 52628;
            switch (i89) {
                case 23:
                    i89 = ((i88 ^ 25396) & i11) == 0 ? 52704 : 52673;
                    break;
                case 54:
                    break;
                case 85:
                    break;
                case 116:
                    boolean zM4043 = C0212.m4041(qVar, j12);
                    int i90 = 52735;
                    while (true) {
                        i90 ^= 52752;
                        switch (i90) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                i66 = 8192;
                                break;
                            case 1007:
                                i90 = zM4043 ? 53479 : 52797;
                                break;
                            case 7927:
                                i66 = 16384;
                                int i91 = 53510;
                                while (true) {
                                    i91 ^= 53527;
                                    switch (i91) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i91 = 53541;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    i13 = (i13 & i66) | (i13 ^ i66);
                    break;
                default:
                    break;
            }
        }
        int i92 = 53634;
        while (true) {
            i92 ^= 53651;
            switch (i92) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i92 = (196608 & ((i11 ^ (-1)) ^ 196608)) == 0 ? 53727 : 53696;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    boolean zM5551 = C0289.m5551(qVar, eVar);
                    int i93 = 53758;
                    while (true) {
                        i93 ^= 53775;
                        switch (i93) {
                            case 1009:
                                i93 = zM5551 ? 54502 : 54471;
                                break;
                            case 1703:
                                break;
                            case 1736:
                                i65 = 65536;
                                break;
                            case 1769:
                                i65 = 131072;
                                int i94 = 54533;
                                while (true) {
                                    i94 ^= 54550;
                                    switch (i94) {
                                        case 19:
                                            i94 = 54564;
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
                    i13 = (i13 & i65) | (i13 ^ i65);
                    int i95 = 54657;
                    while (true) {
                        i95 ^= 54674;
                        switch (i95) {
                            case 19:
                                i95 = 54688;
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 83:
                    break;
                default:
                    break;
            }
        }
        int i96 = 55432;
        while (true) {
            i96 ^= 55449;
            switch (i96) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i96 = (((-1572865) ^ i11) & i11) == 0 ? 55525 : 55494;
                    break;
                case 62:
                    break;
                case 95:
                    break;
                case 124:
                    boolean zM2014 = C0103.m2013(qVar, c0Var);
                    int i97 = 55556;
                    while (true) {
                        i97 ^= 55573;
                        switch (i97) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i97 = zM2014 ? 55649 : 55618;
                                break;
                            case 54:
                                break;
                            case 87:
                                i64 = 524288;
                                break;
                            case 116:
                                i64 = 1048576;
                                int i98 = 55680;
                                while (true) {
                                    i98 ^= 55697;
                                    switch (i98) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i98 = 56362;
                                            continue;
                                        case 1467:
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
                    i13 = (i13 & i64) | (i13 ^ i64);
                    break;
                default:
                    break;
            }
        }
        int i99 = 56455;
        while (true) {
            i99 ^= 56472;
            switch (i99) {
                case 31:
                    i99 = (((-12582913) ^ i11) & i11) == 0 ? 56548 : 56517;
                    break;
                case 62:
                    break;
                case 93:
                    break;
                case 124:
                    boolean zM59110 = C0307.m5919(qVar, f11);
                    int i100 = 56579;
                    while (true) {
                        i100 ^= 56596;
                        switch (i100) {
                            case 23:
                                i100 = zM59110 ? 1507472 : 56641;
                                break;
                            case 54:
                                break;
                            case 85:
                                i63 = 4194304;
                                break;
                            case 1564036:
                                i63 = 8388608;
                                int i101 = 1507503;
                                while (true) {
                                    i101 ^= 1507520;
                                    switch (i101) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 111:
                                            i101 = 1507534;
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
                    i13 = (i13 & i63) | (i13 ^ i63);
                    break;
                default:
                    break;
            }
        }
        int i102 = 1507627;
        while (true) {
            i102 ^= 1507644;
            switch (i102) {
                case 23:
                    i102 = (((-100663297) ^ i11) & i11) == 0 ? 1507720 : 1507689;
                    break;
                case 85:
                    break;
                case 118:
                    break;
                case 180:
                    boolean zM2015 = C0103.m2013(qVar, iVar);
                    int i103 = 1507751;
                    while (true) {
                        i103 ^= 1507768;
                        switch (i103) {
                            case 31:
                                i103 = zM2015 ? 1508495 : 1508464;
                                break;
                            case 1335:
                                i62 = 67108864;
                                int i104 = 1508526;
                                while (true) {
                                    i104 ^= 1508543;
                                    switch (i104) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i104 = 1508557;
                                            continue;
                                        case 114:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 1480:
                                i62 = 33554432;
                                break;
                            case 1513:
                                break;
                            default:
                                break;
                        }
                    }
                    i13 = (i13 & i62) | (i13 ^ i62);
                    break;
                default:
                    break;
            }
        }
        int i105 = 1508650;
        while (true) {
            i105 ^= 1508667;
            switch (i105) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i105 = (((-805306369) ^ i11) & i11) == 0 ? 1509394 : 1508712;
                    break;
                case 83:
                    i14 = i13;
                    break;
                case 114:
                    break;
                case 3369:
                    boolean zM2016 = C0103.m2013(qVar, gVar);
                    int i106 = 1509425;
                    while (true) {
                        i106 ^= 1509442;
                        switch (i106) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                i61 = 268435456;
                                break;
                            case 115:
                                i106 = zM2016 ? 1509518 : 1509487;
                                break;
                            case 204:
                                i61 = 536870912;
                                int i107 = 1509549;
                                while (true) {
                                    i107 ^= 1509566;
                                    switch (i107) {
                                        case 19:
                                            i107 = 1509580;
                                            continue;
                                        case 114:
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
                    i14 = (i13 & i61) | (i13 ^ i61);
                    break;
                default:
                    break;
            }
        }
        int i108 = C0108.f134;
        int i109 = 1509673;
        while (true) {
            i109 ^= 1509690;
            switch (i109) {
                case 19:
                    i109 = ((i108 ^ (-68)) & i12) == 0 ? 1510417 : 1510386;
                    break;
                case 712:
                    i15 = i12;
                    break;
                case 745:
                    break;
                case 1323:
                    boolean zM1859 = C0087.m1859(qVar, i10);
                    int i110 = 1510448;
                    while (true) {
                        i110 ^= 1510465;
                        switch (i110) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 47:
                                i60 = 2;
                                break;
                            case 113:
                                i110 = zM1859 ? 1510541 : 1510510;
                                break;
                            case 204:
                                i60 = 4;
                                int i111 = 1510572;
                                while (true) {
                                    i111 ^= 1510589;
                                    switch (i111) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i111 = 1510603;
                                            continue;
                                        case 118:
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
                    i15 = (i60 & i12) | (i12 ^ i60);
                    int i112 = 1511347;
                    while (true) {
                        i112 ^= 1511364;
                        switch (i112) {
                            case 22:
                                break;
                            case 119:
                                i112 = 1511378;
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
        int i113 = C0171.f195;
        int i114 = 1511471;
        while (true) {
            i114 ^= 1511488;
            switch (i114) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    break;
                case 111:
                    i114 = ((i113 ^ (-128)) & i12) == 0 ? 1511564 : 1511533;
                    break;
                case 204:
                    boolean zM4326 = C0225.m4326(qVar, z10);
                    int i115 = 1511595;
                    while (true) {
                        i115 ^= 1511612;
                        switch (i115) {
                            case 23:
                                i115 = zM4326 ? 1512339 : 1512308;
                                break;
                            case 815:
                                i59 = 32;
                                break;
                            case 968:
                                i59 = 16;
                                break;
                            case 1001:
                                break;
                            default:
                                break;
                        }
                    }
                    i15 = (i15 & i59) | (i15 ^ i59);
                    break;
                default:
                    break;
            }
        }
        int i116 = C0303.f450;
        int i117 = 1512370;
        while (true) {
            i117 ^= 1512387;
            switch (i117) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    break;
                case 113:
                    i117 = ((i116 ^ (-220)) & i12) == 0 ? 1512463 : 1512432;
                    break;
                case 1996:
                    boolean zM5552 = C0289.m5551(qVar, eVar2);
                    int i118 = 1512494;
                    while (true) {
                        i118 ^= 1512511;
                        switch (i118) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i118 = zM5552 ? 1513238 : 1512556;
                                break;
                            case 83:
                                i58 = 128;
                                break;
                            case 114:
                                break;
                            case 809:
                                i58 = 256;
                                break;
                            default:
                                break;
                        }
                    }
                    i15 = (i15 & i58) | (i15 ^ i58);
                    break;
                default:
                    break;
            }
        }
        int i119 = C0262.f341;
        int i120 = 1513269;
        while (true) {
            i120 ^= 1513286;
            switch (i120) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 53:
                    i16 = i15;
                    break;
                case 115:
                    i120 = ((i119 ^ (-3942)) & i12) == 0 ? 1513362 : 1513331;
                    break;
                case 212:
                    boolean zM5553 = C0289.m5551(qVar, eVar3);
                    int i121 = 1513393;
                    while (true) {
                        i121 ^= 1513410;
                        switch (i121) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                i57 = 1024;
                                break;
                            case 115:
                                i121 = zM5553 ? 1513486 : 1513455;
                                break;
                            case 4044:
                                i57 = 2048;
                                break;
                            default:
                                break;
                        }
                    }
                    i16 = (i15 & i57) | (i15 ^ i57);
                    break;
                default:
                    break;
            }
        }
        int i122 = 1513517;
        while (true) {
            i122 ^= 1513534;
            switch (i122) {
                case 19:
                    i122 = (((-306783380) ^ i14) & i14) == 306783378 ? 1514261 : 1514230;
                    break;
                case 712:
                    C0262.m4990(qVar, (-1019460398) ^ C0106.f132);
                    i18 = C0327.f474;
                    i19 = 1515439;
                    while (true) {
                        i19 ^= 1515456;
                        switch (i19) {
                            case 111:
                                i19 = ((i18 ^ (-872)) & i14) == 32 ? 1516183 : 1516152;
                                break;
                            case 15703:
                                z11 = true;
                                i56 = 1516214;
                                while (true) {
                                    i56 ^= 1516231;
                                    switch (i56) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 113:
                                            i56 = 1516245;
                                            continue;
                                            continue;
                                            continue;
                                        default:
                                            continue;
                                            continue;
                                            continue;
                                    }
                                }
                                break;
                            case 15769:
                                break;
                            case 15800:
                                z11 = false;
                                break;
                            default:
                                break;
                        }
                    }
                    i20 = 1516338;
                    while (true) {
                        i20 ^= 1516355;
                        switch (i20) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 51:
                                z12 = false;
                                break;
                            case 113:
                                i20 = (((-1879048193) ^ i14) & i14) == 536870912 ? 1537263 : 1516400;
                                break;
                            case 22444:
                                z12 = true;
                                i55 = 1537294;
                                while (true) {
                                    i55 ^= 1537311;
                                    switch (i55) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i55 = 1537325;
                                            continue;
                                            continue;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        default:
                                            continue;
                                            continue;
                                            continue;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    boolean z17 = (z11 ^ z12) | (z11 & z12);
                    i21 = 1537418;
                    while (true) {
                        i21 ^= 1537435;
                        switch (i21) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if ((((-234881025) ^ i14) & i14) == 67108864) {
                                    i21 = 1537511;
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 83:
                                z13 = false;
                                break;
                            case 124:
                                z13 = true;
                                i54 = 1537542;
                                while (true) {
                                    i54 ^= 1537559;
                                    switch (i54) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i54 = 1538224;
                                            break;
                                        case 3751:
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                                continue;
                                continue;
                        }
                        i21 = 1537480;
                    }
                    z14 = (z17 ^ z13) | (z13 & z17);
                    i22 = C0306.f453;
                    i23 = 1538317;
                    while (true) {
                        i23 ^= 1538334;
                        switch (i23) {
                            case 19:
                                i23 = ((i22 ^ (-378)) & i16) == 4 ? 1538410 : 1538379;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 85:
                                z15 = false;
                                break;
                            case 116:
                                z15 = true;
                                i53 = 1538441;
                                while (true) {
                                    i53 ^= 1538458;
                                    switch (i53) {
                                        case 19:
                                            i53 = 1538472;
                                            continue;
                                            continue;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        default:
                                            continue;
                                            continue;
                                            continue;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    objM8078 = C0412.m8078(qVar);
                    i24 = 1539216;
                    while (true) {
                        i24 ^= 1539233;
                        switch (i24) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 49:
                                i24 = !((z14 ^ z15) | (z14 & z15)) ? 1539309 : 1539278;
                                break;
                            case 76:
                                y0VarM2417 = C0125.m2417();
                                i52 = 1539340;
                                while (true) {
                                    i52 ^= 1539357;
                                    switch (i52) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i52 = objM8078 == y0VarM2417 ? 1539433 : 1539402;
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            vVar = objM8078;
                                            break;
                                        case 116:
                                            vVar = new v(f10, gVar, iVar, i10);
                                            C0479.m9328(qVar, vVar);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 111:
                                vVar = new v(f10, gVar, iVar, i10);
                                C0479.m9328(qVar, vVar);
                                break;
                            default:
                                break;
                        }
                    }
                    j0Var = (r1.j0) vVar;
                    C0171.m3270(qVar, false);
                    i25 = C0068.f88;
                    i26 = C0259.f338;
                    C0262.m4990(qVar, 1323940522 ^ C0292.f439);
                    iM276 = C0014.m276(qVar);
                    r1VarM275 = C0014.m275(qVar);
                    C0014.m280(C0380.m7428());
                    jVarM4451 = C0232.m4451();
                    bVarM6976 = C0356.m6976(oVar);
                    i27 = C0474.f744;
                    i28 = C0280.f424;
                    i29 = C0215.f238;
                    z16 = C0196.m3764(qVar) instanceof m0.d;
                    i30 = 1539464;
                    while (true) {
                        i30 ^= 1539481;
                        switch (i30) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i30 = z16 ? 1540208 : 1540177;
                                break;
                            case 64939:
                                break;
                            case 64968:
                                C0236.m4537();
                                throw null;
                            case 65001:
                                C0100.m1961(qVar);
                                zM7502 = C0383.m7502(qVar);
                                i31 = 1540239;
                                while (true) {
                                    i31 ^= 1540256;
                                    switch (i31) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 47:
                                            i31 = zM7502 ? 1540332 : 1540301;
                                            break;
                                        case 76:
                                            C0017.m346(qVar, jVarM4451);
                                            i51 = 1540363;
                                            while (true) {
                                                i51 ^= 1540380;
                                                switch (i51) {
                                                    case 23:
                                                        i51 = 1540394;
                                                        continue;
                                                        continue;
                                                        continue;
                                                    case 54:
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 109:
                                            C0446.m8685(qVar);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                iVarM1208 = C0063.m1208();
                                C0089.m1904(qVar, j0Var, iVarM1208);
                                iVarM9055 = C0465.m9055();
                                C0089.m1904(qVar, r1VarM275, iVarM9055);
                                iVarM5562 = C0290.m5562();
                                zM7503 = C0383.m7502(qVar);
                                i32 = 1541138;
                                while (true) {
                                    i32 ^= 1541155;
                                    switch (i32) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 49:
                                            i32 = !zM7503 ? 1541231 : 1541200;
                                            break;
                                        case 76:
                                            zM43912 = C0229.m4399(C0412.m8078(qVar), C0057.m1083(iM276));
                                            i50 = 1541262;
                                            while (true) {
                                                i50 ^= 1541279;
                                                switch (i50) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i50 = !zM43912 ? 1541355 : 1541324;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 83:
                                                        break;
                                                    case 116:
                                                        C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 115:
                                            C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                C0353.m6912(((((((i14 << (i25 ^ (-763))) & (i26 ^ 660)) << (i27 ^ 653)) & (i28 ^ (-7286))) | (i29 ^ 202)) >> (C0442.f712 ^ (-256))) & (C0467.f737 ^ 292), bVarM6976, new m0.l2(qVar), qVar, 2058660081 ^ C0264.f343);
                                lVarM4370 = C0227.m4370();
                                y0.o oVarM5498 = C0286.m5498(lVarM4370, C0071.m1462(m6441(), 90, C0157.f181 ^ (-334), 1674));
                                fM6012 = C0311.m6012();
                                y0.o oVarM3568 = C0187.m3568(oVarM5498, fM6012, 0.0f, 0.0f, 0.0f, C0086.f120 ^ (-775));
                                C0262.m4990(qVar, (-733328708) ^ C0170.f194);
                                gVarM8889 = C0457.m8889();
                                j0VarM2476 = C0128.m2476(gVarM8889, false, qVar);
                                C0262.m4990(qVar, 1323940622 ^ C0107.f133);
                                iM277 = C0014.m276(qVar);
                                r1VarM276 = C0014.m275(qVar);
                                bVarM6977 = C0356.m6976(oVarM3568);
                                i33 = 1541386;
                                while (true) {
                                    i33 ^= 1541403;
                                    switch (i33) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i33 = z16 ? 1542130 : 1542099;
                                            break;
                                        case 687:
                                            break;
                                        case 712:
                                            C0236.m4537();
                                            throw null;
                                        case 745:
                                            C0100.m1961(qVar);
                                            zM7504 = C0383.m7502(qVar);
                                            i34 = 1542161;
                                            while (true) {
                                                i34 ^= 1542178;
                                                switch (i34) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        i34 = zM7504 ? 1542254 : 1542223;
                                                        break;
                                                    case 76:
                                                        C0017.m346(qVar, jVarM4451);
                                                        i49 = 1542285;
                                                        while (true) {
                                                            i49 ^= 1542302;
                                                            switch (i49) {
                                                                case 19:
                                                                    i49 = 1542316;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 109:
                                                        C0446.m8685(qVar);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            C0089.m1904(qVar, j0VarM2476, iVarM1208);
                                            C0089.m1904(qVar, r1VarM276, iVarM9055);
                                            zM7505 = C0383.m7502(qVar);
                                            i35 = 1543060;
                                            while (true) {
                                                i35 ^= 1543077;
                                                switch (i35) {
                                                    case 22:
                                                        break;
                                                    case 49:
                                                        i35 = !zM7505 ? 1543153 : 1543122;
                                                        break;
                                                    case 84:
                                                        zM43911 = C0229.m4399(C0412.m8078(qVar), C0057.m1083(iM277));
                                                        i48 = 1543184;
                                                        while (true) {
                                                            i48 ^= 1543201;
                                                            switch (i48) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 49:
                                                                    i48 = !zM43911 ? 1543277 : 1543246;
                                                                    break;
                                                                case 76:
                                                                    C0133.m2574(iM277, qVar, iM277, iVarM5562);
                                                                    break;
                                                                case 111:
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 119:
                                                        C0133.m2574(iM277, qVar, iM277, iVarM5562);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            C0353.m6912(0, bVarM6977, new m0.l2(qVar), qVar, (-2058660317) ^ C0063.f83);
                                            p0VarM2168 = C0112.m2168();
                                            C0396.m7736(C0434.m8483(p0VarM2168, new e1.r(j10)), eVar2, qVar, (i16 >> (C0062.f82 ^ 321)) & (C0040.f60 ^ (-33)));
                                            C0016.m325(qVar, false, true, false, false);
                                            y0.o oVarM245 = C0013.m245(C0286.m5498(lVarM4370, C0449.m8745(m6441(), 104, C0335.f518 ^ (-728), 2566)), fM6012, 0.0f, C0354.f624 ^ 891);
                                            i36 = 1543308;
                                            while (true) {
                                                i36 ^= 1543325;
                                                switch (i36) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i36 = z10 ? 1544052 : 1544021;
                                                        break;
                                                    case 939:
                                                        break;
                                                    case 968:
                                                        clearAndSetSemanticsElement = lVarM4370;
                                                        break;
                                                    case 1001:
                                                        C0475.m9249();
                                                        clearAndSetSemanticsElement = new ClearAndSetSemanticsElement();
                                                        i47 = 1544083;
                                                        while (true) {
                                                            i47 ^= 1544100;
                                                            switch (i47) {
                                                                case 22:
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                                    i47 = 1544114;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            y0.o oVarM803 = C0041.m803(C0449.m8743(oVarM245, clearAndSetSemanticsElement), 0.0f, 0.0f, f11, 0.0f, null, false, (-130588) ^ C0248.f327);
                                            C0262.m4990(qVar, (-733329025) ^ C0445.f715);
                                            j0VarM2477 = C0128.m2476(gVarM8889, false, qVar);
                                            C0262.m4990(qVar, (-1323939870) ^ C0223.f302);
                                            iM278 = C0014.m276(qVar);
                                            r1VarM277 = C0014.m275(qVar);
                                            bVarM6978 = C0356.m6976(oVarM803);
                                            i37 = 1544207;
                                            while (true) {
                                                i37 ^= 1544224;
                                                switch (i37) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 47:
                                                        i37 = z16 ? 1544951 : 1544269;
                                                        break;
                                                    case 109:
                                                        C0236.m4537();
                                                        throw null;
                                                    case 727:
                                                        C0100.m1961(qVar);
                                                        zM7506 = C0383.m7502(qVar);
                                                        i38 = 1544982;
                                                        while (true) {
                                                            i38 ^= 1544999;
                                                            switch (i38) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 49:
                                                                    i38 = zM7506 ? 1545075 : 1545044;
                                                                    break;
                                                                case 84:
                                                                    C0017.m346(qVar, jVarM4451);
                                                                    i46 = 1545106;
                                                                    while (true) {
                                                                        i46 ^= 1545123;
                                                                        switch (i46) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 49:
                                                                                i46 = 1545137;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 115:
                                                                    C0446.m8685(qVar);
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        C0089.m1904(qVar, j0VarM2477, iVarM1208);
                                                        C0089.m1904(qVar, r1VarM277, iVarM9055);
                                                        zM7507 = C0383.m7502(qVar);
                                                        i39 = 1545230;
                                                        while (true) {
                                                            i39 ^= 1545247;
                                                            switch (i39) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i39 = !zM7507 ? 1545974 : 1545943;
                                                                    break;
                                                                case 679:
                                                                    break;
                                                                case 712:
                                                                    C0133.m2574(iM278, qVar, iM278, iVarM5562);
                                                                    break;
                                                                case 745:
                                                                    zM43910 = C0229.m4399(C0412.m8078(qVar), C0057.m1083(iM278));
                                                                    i45 = 1546005;
                                                                    while (true) {
                                                                        i45 ^= 1546022;
                                                                        switch (i45) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 51:
                                                                                i45 = !zM43910 ? 1546098 : 1546067;
                                                                                break;
                                                                            case 84:
                                                                                C0133.m2574(iM278, qVar, iM278, iVarM5562);
                                                                                break;
                                                                            case 117:
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
                                                        C0353.m6912(0, bVarM6978, new m0.l2(qVar), qVar, 2058660078 ^ C0034.f54);
                                                        int i123 = i14 >> (C0418.f688 ^ 532);
                                                        int i124 = (C0147.f172 ^ 929) & i123;
                                                        int i125 = (i14 >> (C0187.f211 ^ (-334))) & (C0213.f236 ^ 152);
                                                        int i126 = (i124 & i125) | (i124 ^ i125);
                                                        int i127 = i123 & (C0188.f212 ^ 1001);
                                                        C0251.m4802(j11, c0Var, eVar, qVar, (i126 ^ i127) | (i127 & i126));
                                                        C0016.m325(qVar, false, true, false, false);
                                                        y0.o oVarM3569 = C0187.m3568(C0286.m5498(lVarM4370, C0486.m9450(m6441(), 109, C0371.f641 ^ 785, 1938)), 0.0f, 0.0f, fM6012, 0.0f, C0292.f439 ^ (-889));
                                                        C0262.m4990(qVar, (-733329250) ^ C0236.f315);
                                                        j0VarM2478 = C0128.m2476(gVarM8889, false, qVar);
                                                        C0262.m4990(qVar, 1323940370 ^ C0255.f334);
                                                        iM279 = C0014.m276(qVar);
                                                        r1VarM278 = C0014.m275(qVar);
                                                        bVarM6979 = C0356.m6976(oVarM3569);
                                                        i40 = 1546129;
                                                        while (true) {
                                                            i40 ^= 1546146;
                                                            switch (i40) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 51:
                                                                    i40 = z16 ? 1567054 : 1546191;
                                                                    break;
                                                                case 109:
                                                                    C0236.m4537();
                                                                    throw null;
                                                                case 32492:
                                                                    C0100.m1961(qVar);
                                                                    zM7508 = C0383.m7502(qVar);
                                                                    i41 = 1567085;
                                                                    while (true) {
                                                                        i41 ^= 1567102;
                                                                        switch (i41) {
                                                                            case 19:
                                                                                i41 = zM7508 ? 1567178 : 1567147;
                                                                                break;
                                                                            case 180:
                                                                                C0017.m346(qVar, jVarM4451);
                                                                                i44 = 1567209;
                                                                                while (true) {
                                                                                    i44 ^= 1567226;
                                                                                    switch (i44) {
                                                                                        case 19:
                                                                                            i44 = 1567240;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                        case 1010:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 213:
                                                                                C0446.m8685(qVar);
                                                                                break;
                                                                            case 242:
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    C0089.m1904(qVar, j0VarM2478, iVarM1208);
                                                                    C0089.m1904(qVar, r1VarM278, iVarM9055);
                                                                    zM7509 = C0383.m7502(qVar);
                                                                    i42 = 1567333;
                                                                    while (true) {
                                                                        i42 ^= 1567350;
                                                                        switch (i42) {
                                                                            case 19:
                                                                                i42 = !zM7509 ? 1568077 : 1568046;
                                                                                break;
                                                                            case 1851:
                                                                                zM4399 = C0229.m4399(C0412.m8078(qVar), C0057.m1083(iM279));
                                                                                i43 = 1568108;
                                                                                while (true) {
                                                                                    i43 ^= 1568125;
                                                                                    switch (i43) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i43 = !zM4399 ? 1568201 : 1568170;
                                                                                            break;
                                                                                        case 180:
                                                                                            C0133.m2574(iM279, qVar, iM279, iVarM5562);
                                                                                            break;
                                                                                        case 215:
                                                                                            break;
                                                                                        case 246:
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1880:
                                                                                C0133.m2574(iM279, qVar, iM279, iVarM5562);
                                                                                break;
                                                                            case 1913:
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    C0045.m869(bVarM6979, new m0.l2(qVar), qVar, C0057.m1083(0));
                                                                    C0262.m4990(qVar, (-2058659958) ^ C0295.f442);
                                                                    C0396.m7736(C0434.m8483(p0VarM2168, new e1.r(j12)), eVar3, qVar, (i16 >> (C0315.f462 ^ 260)) & (C0120.f146 ^ 431));
                                                                    C0016.m325(qVar, false, true, false, false);
                                                                    C0171.m3270(qVar, false);
                                                                    C0171.m3270(qVar, true);
                                                                    C0171.m3270(qVar, false);
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
                    x1VarM7533 = C0385.m7533(qVar);
                    i17 = 1568232;
                    while (true) {
                        i17 ^= 1568249;
                        switch (i17) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (x1VarM7533 != null) {
                                    i17 = 1568976;
                                }
                                break;
                            case 991:
                                return;
                            case 1022:
                                break;
                            case 7465:
                                x1VarM7533.f11756d = new w(oVar, f10, j10, j11, j12, eVar, c0Var, f11, iVar, gVar, i10, z10, eVar2, eVar3, i11, i12);
                                return;
                            default:
                                continue;
                                continue;
                                continue;
                                continue;
                        }
                        i17 = 1568294;
                    }
                    break;
                case 745:
                    break;
                case 811:
                    int i128 = C0169.f193;
                    int i129 = 1514292;
                    while (true) {
                        i129 ^= 1514309;
                        switch (i129) {
                            case 22:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                C0262.m4990(qVar, (-1019460398) ^ C0106.f132);
                                i18 = C0327.f474;
                                i19 = 1515439;
                                while (true) {
                                    i19 ^= 1515456;
                                    switch (i19) {
                                        case 111:
                                            if (((i18 ^ (-872)) & i14) == 32) {
                                            }
                                            break;
                                        case 15703:
                                            z11 = true;
                                            i56 = 1516214;
                                            while (true) {
                                                i56 ^= 1516231;
                                                switch (i56) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 113:
                                                        i56 = 1516245;
                                                        continue;
                                                        continue;
                                                        continue;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 15769:
                                            break;
                                        case 15800:
                                            z11 = false;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                i20 = 1516338;
                                while (true) {
                                    i20 ^= 1516355;
                                    switch (i20) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 51:
                                            z12 = false;
                                            break;
                                        case 113:
                                            if ((((-1879048193) ^ i14) & i14) == 536870912) {
                                            }
                                            break;
                                        case 22444:
                                            z12 = true;
                                            i55 = 1537294;
                                            while (true) {
                                                i55 ^= 1537311;
                                                switch (i55) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i55 = 1537325;
                                                        continue;
                                                        continue;
                                                        continue;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                boolean z18 = (z11 ^ z12) | (z11 & z12);
                                i21 = 1537418;
                                while (true) {
                                    i21 ^= 1537435;
                                    switch (i21) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if ((((-234881025) ^ i14) & i14) == 67108864) {
                                                i21 = 1537511;
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 83:
                                            z13 = false;
                                            break;
                                        case 124:
                                            z13 = true;
                                            i54 = 1537542;
                                            while (true) {
                                                i54 ^= 1537559;
                                                switch (i54) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i54 = 1538224;
                                                        break;
                                                    case 3751:
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                            continue;
                                            continue;
                                    }
                                    i21 = 1537480;
                                }
                                z14 = (z18 ^ z13) | (z13 & z18);
                                i22 = C0306.f453;
                                i23 = 1538317;
                                while (true) {
                                    i23 ^= 1538334;
                                    switch (i23) {
                                        case 19:
                                            if (((i22 ^ (-378)) & i16) == 4) {
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 85:
                                            z15 = false;
                                            break;
                                        case 116:
                                            z15 = true;
                                            i53 = 1538441;
                                            while (true) {
                                                i53 ^= 1538458;
                                                switch (i53) {
                                                    case 19:
                                                        i53 = 1538472;
                                                        continue;
                                                        continue;
                                                        continue;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                objM8078 = C0412.m8078(qVar);
                                i24 = 1539216;
                                while (true) {
                                    i24 ^= 1539233;
                                    switch (i24) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 49:
                                            if (!((z14 ^ z15) | (z14 & z15))) {
                                            }
                                            break;
                                        case 76:
                                            y0VarM2417 = C0125.m2417();
                                            i52 = 1539340;
                                            while (true) {
                                                i52 ^= 1539357;
                                                switch (i52) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (objM8078 == y0VarM2417) {
                                                        }
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 87:
                                                        vVar = objM8078;
                                                        break;
                                                    case 116:
                                                        vVar = new v(f10, gVar, iVar, i10);
                                                        C0479.m9328(qVar, vVar);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 111:
                                            vVar = new v(f10, gVar, iVar, i10);
                                            C0479.m9328(qVar, vVar);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                j0Var = (r1.j0) vVar;
                                C0171.m3270(qVar, false);
                                i25 = C0068.f88;
                                i26 = C0259.f338;
                                C0262.m4990(qVar, 1323940522 ^ C0292.f439);
                                iM276 = C0014.m276(qVar);
                                r1VarM275 = C0014.m275(qVar);
                                C0014.m280(C0380.m7428());
                                jVarM4451 = C0232.m4451();
                                bVarM6976 = C0356.m6976(oVar);
                                i27 = C0474.f744;
                                i28 = C0280.f424;
                                i29 = C0215.f238;
                                z16 = C0196.m3764(qVar) instanceof m0.d;
                                i30 = 1539464;
                                while (true) {
                                    i30 ^= 1539481;
                                    switch (i30) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (z16) {
                                            }
                                            break;
                                        case 64939:
                                            break;
                                        case 64968:
                                            C0236.m4537();
                                            throw null;
                                        case 65001:
                                            C0100.m1961(qVar);
                                            zM7502 = C0383.m7502(qVar);
                                            i31 = 1540239;
                                            while (true) {
                                                i31 ^= 1540256;
                                                switch (i31) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 47:
                                                        if (zM7502) {
                                                        }
                                                        break;
                                                    case 76:
                                                        C0017.m346(qVar, jVarM4451);
                                                        i51 = 1540363;
                                                        while (true) {
                                                            i51 ^= 1540380;
                                                            switch (i51) {
                                                                case 23:
                                                                    i51 = 1540394;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                case 54:
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 109:
                                                        C0446.m8685(qVar);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            iVarM1208 = C0063.m1208();
                                            C0089.m1904(qVar, j0Var, iVarM1208);
                                            iVarM9055 = C0465.m9055();
                                            C0089.m1904(qVar, r1VarM275, iVarM9055);
                                            iVarM5562 = C0290.m5562();
                                            zM7503 = C0383.m7502(qVar);
                                            i32 = 1541138;
                                            while (true) {
                                                i32 ^= 1541155;
                                                switch (i32) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 49:
                                                        if (!zM7503) {
                                                        }
                                                        break;
                                                    case 76:
                                                        zM43912 = C0229.m4399(C0412.m8078(qVar), C0057.m1083(iM276));
                                                        i50 = 1541262;
                                                        while (true) {
                                                            i50 ^= 1541279;
                                                            switch (i50) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (!zM43912) {
                                                                    }
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 83:
                                                                    break;
                                                                case 116:
                                                                    C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 115:
                                                        C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            C0353.m6912(((((((i14 << (i25 ^ (-763))) & (i26 ^ 660)) << (i27 ^ 653)) & (i28 ^ (-7286))) | (i29 ^ 202)) >> (C0442.f712 ^ (-256))) & (C0467.f737 ^ 292), bVarM6976, new m0.l2(qVar), qVar, 2058660081 ^ C0264.f343);
                                            lVarM4370 = C0227.m4370();
                                            y0.o oVarM5499 = C0286.m5498(lVarM4370, C0071.m1462(m6441(), 90, C0157.f181 ^ (-334), 1674));
                                            fM6012 = C0311.m6012();
                                            y0.o oVarM35610 = C0187.m3568(oVarM5499, fM6012, 0.0f, 0.0f, 0.0f, C0086.f120 ^ (-775));
                                            C0262.m4990(qVar, (-733328708) ^ C0170.f194);
                                            gVarM8889 = C0457.m8889();
                                            j0VarM2476 = C0128.m2476(gVarM8889, false, qVar);
                                            C0262.m4990(qVar, 1323940622 ^ C0107.f133);
                                            iM277 = C0014.m276(qVar);
                                            r1VarM276 = C0014.m275(qVar);
                                            bVarM6977 = C0356.m6976(oVarM35610);
                                            i33 = 1541386;
                                            while (true) {
                                                i33 ^= 1541403;
                                                switch (i33) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (z16) {
                                                        }
                                                        break;
                                                    case 687:
                                                        break;
                                                    case 712:
                                                        C0236.m4537();
                                                        throw null;
                                                    case 745:
                                                        C0100.m1961(qVar);
                                                        zM7504 = C0383.m7502(qVar);
                                                        i34 = 1542161;
                                                        while (true) {
                                                            i34 ^= 1542178;
                                                            switch (i34) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 51:
                                                                    if (zM7504) {
                                                                    }
                                                                    break;
                                                                case 76:
                                                                    C0017.m346(qVar, jVarM4451);
                                                                    i49 = 1542285;
                                                                    while (true) {
                                                                        i49 ^= 1542302;
                                                                        switch (i49) {
                                                                            case 19:
                                                                                i49 = 1542316;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 109:
                                                                    C0446.m8685(qVar);
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        C0089.m1904(qVar, j0VarM2476, iVarM1208);
                                                        C0089.m1904(qVar, r1VarM276, iVarM9055);
                                                        zM7505 = C0383.m7502(qVar);
                                                        i35 = 1543060;
                                                        while (true) {
                                                            i35 ^= 1543077;
                                                            switch (i35) {
                                                                case 22:
                                                                    break;
                                                                case 49:
                                                                    if (!zM7505) {
                                                                    }
                                                                    break;
                                                                case 84:
                                                                    zM43911 = C0229.m4399(C0412.m8078(qVar), C0057.m1083(iM277));
                                                                    i48 = 1543184;
                                                                    while (true) {
                                                                        i48 ^= 1543201;
                                                                        switch (i48) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case 49:
                                                                                if (!zM43911) {
                                                                                }
                                                                                break;
                                                                            case 76:
                                                                                C0133.m2574(iM277, qVar, iM277, iVarM5562);
                                                                                break;
                                                                            case 111:
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 119:
                                                                    C0133.m2574(iM277, qVar, iM277, iVarM5562);
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        C0353.m6912(0, bVarM6977, new m0.l2(qVar), qVar, (-2058660317) ^ C0063.f83);
                                                        p0VarM2168 = C0112.m2168();
                                                        C0396.m7736(C0434.m8483(p0VarM2168, new e1.r(j10)), eVar2, qVar, (i16 >> (C0062.f82 ^ 321)) & (C0040.f60 ^ (-33)));
                                                        C0016.m325(qVar, false, true, false, false);
                                                        y0.o oVarM246 = C0013.m245(C0286.m5498(lVarM4370, C0449.m8745(m6441(), 104, C0335.f518 ^ (-728), 2566)), fM6012, 0.0f, C0354.f624 ^ 891);
                                                        i36 = 1543308;
                                                        while (true) {
                                                            i36 ^= 1543325;
                                                            switch (i36) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (z10) {
                                                                    }
                                                                    break;
                                                                case 939:
                                                                    break;
                                                                case 968:
                                                                    clearAndSetSemanticsElement = lVarM4370;
                                                                    break;
                                                                case 1001:
                                                                    C0475.m9249();
                                                                    clearAndSetSemanticsElement = new ClearAndSetSemanticsElement();
                                                                    i47 = 1544083;
                                                                    while (true) {
                                                                        i47 ^= 1544100;
                                                                        switch (i47) {
                                                                            case 22:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                                                i47 = 1544114;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        y0.o oVarM804 = C0041.m803(C0449.m8743(oVarM246, clearAndSetSemanticsElement), 0.0f, 0.0f, f11, 0.0f, null, false, (-130588) ^ C0248.f327);
                                                        C0262.m4990(qVar, (-733329025) ^ C0445.f715);
                                                        j0VarM2477 = C0128.m2476(gVarM8889, false, qVar);
                                                        C0262.m4990(qVar, (-1323939870) ^ C0223.f302);
                                                        iM278 = C0014.m276(qVar);
                                                        r1VarM277 = C0014.m275(qVar);
                                                        bVarM6978 = C0356.m6976(oVarM804);
                                                        i37 = 1544207;
                                                        while (true) {
                                                            i37 ^= 1544224;
                                                            switch (i37) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 47:
                                                                    if (z16) {
                                                                    }
                                                                    break;
                                                                case 109:
                                                                    C0236.m4537();
                                                                    throw null;
                                                                case 727:
                                                                    C0100.m1961(qVar);
                                                                    zM7506 = C0383.m7502(qVar);
                                                                    i38 = 1544982;
                                                                    while (true) {
                                                                        i38 ^= 1544999;
                                                                        switch (i38) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 49:
                                                                                if (zM7506) {
                                                                                }
                                                                                break;
                                                                            case 84:
                                                                                C0017.m346(qVar, jVarM4451);
                                                                                i46 = 1545106;
                                                                                while (true) {
                                                                                    i46 ^= 1545123;
                                                                                    switch (i46) {
                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 49:
                                                                                            i46 = 1545137;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 115:
                                                                                C0446.m8685(qVar);
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    C0089.m1904(qVar, j0VarM2477, iVarM1208);
                                                                    C0089.m1904(qVar, r1VarM277, iVarM9055);
                                                                    zM7507 = C0383.m7502(qVar);
                                                                    i39 = 1545230;
                                                                    while (true) {
                                                                        i39 ^= 1545247;
                                                                        switch (i39) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (!zM7507) {
                                                                                }
                                                                                break;
                                                                            case 679:
                                                                                break;
                                                                            case 712:
                                                                                C0133.m2574(iM278, qVar, iM278, iVarM5562);
                                                                                break;
                                                                            case 745:
                                                                                zM43910 = C0229.m4399(C0412.m8078(qVar), C0057.m1083(iM278));
                                                                                i45 = 1546005;
                                                                                while (true) {
                                                                                    i45 ^= 1546022;
                                                                                    switch (i45) {
                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 51:
                                                                                            if (!zM43910) {
                                                                                            }
                                                                                            break;
                                                                                        case 84:
                                                                                            C0133.m2574(iM278, qVar, iM278, iVarM5562);
                                                                                            break;
                                                                                        case 117:
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
                                                                    C0353.m6912(0, bVarM6978, new m0.l2(qVar), qVar, 2058660078 ^ C0034.f54);
                                                                    int i1210 = i14 >> (C0418.f688 ^ 532);
                                                                    int i1211 = (C0147.f172 ^ 929) & i1210;
                                                                    int i1212 = (i14 >> (C0187.f211 ^ (-334))) & (C0213.f236 ^ 152);
                                                                    int i1213 = (i1211 & i1212) | (i1211 ^ i1212);
                                                                    int i1214 = i1210 & (C0188.f212 ^ 1001);
                                                                    C0251.m4802(j11, c0Var, eVar, qVar, (i1213 ^ i1214) | (i1214 & i1213));
                                                                    C0016.m325(qVar, false, true, false, false);
                                                                    y0.o oVarM35611 = C0187.m3568(C0286.m5498(lVarM4370, C0486.m9450(m6441(), 109, C0371.f641 ^ 785, 1938)), 0.0f, 0.0f, fM6012, 0.0f, C0292.f439 ^ (-889));
                                                                    C0262.m4990(qVar, (-733329250) ^ C0236.f315);
                                                                    j0VarM2478 = C0128.m2476(gVarM8889, false, qVar);
                                                                    C0262.m4990(qVar, 1323940370 ^ C0255.f334);
                                                                    iM279 = C0014.m276(qVar);
                                                                    r1VarM278 = C0014.m275(qVar);
                                                                    bVarM6979 = C0356.m6976(oVarM35611);
                                                                    i40 = 1546129;
                                                                    while (true) {
                                                                        i40 ^= 1546146;
                                                                        switch (i40) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 51:
                                                                                if (z16) {
                                                                                }
                                                                                break;
                                                                            case 109:
                                                                                C0236.m4537();
                                                                                throw null;
                                                                            case 32492:
                                                                                C0100.m1961(qVar);
                                                                                zM7508 = C0383.m7502(qVar);
                                                                                i41 = 1567085;
                                                                                while (true) {
                                                                                    i41 ^= 1567102;
                                                                                    switch (i41) {
                                                                                        case 19:
                                                                                            if (zM7508) {
                                                                                            }
                                                                                            break;
                                                                                        case 180:
                                                                                            C0017.m346(qVar, jVarM4451);
                                                                                            i44 = 1567209;
                                                                                            while (true) {
                                                                                                i44 ^= 1567226;
                                                                                                switch (i44) {
                                                                                                    case 19:
                                                                                                        i44 = 1567240;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    case 1010:
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 213:
                                                                                            C0446.m8685(qVar);
                                                                                            break;
                                                                                        case 242:
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                C0089.m1904(qVar, j0VarM2478, iVarM1208);
                                                                                C0089.m1904(qVar, r1VarM278, iVarM9055);
                                                                                zM7509 = C0383.m7502(qVar);
                                                                                i42 = 1567333;
                                                                                while (true) {
                                                                                    i42 ^= 1567350;
                                                                                    switch (i42) {
                                                                                        case 19:
                                                                                            if (!zM7509) {
                                                                                            }
                                                                                            break;
                                                                                        case 1851:
                                                                                            zM4399 = C0229.m4399(C0412.m8078(qVar), C0057.m1083(iM279));
                                                                                            i43 = 1568108;
                                                                                            while (true) {
                                                                                                i43 ^= 1568125;
                                                                                                switch (i43) {
                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        if (!zM4399) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 180:
                                                                                                        C0133.m2574(iM279, qVar, iM279, iVarM5562);
                                                                                                        break;
                                                                                                    case 215:
                                                                                                        break;
                                                                                                    case 246:
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 1880:
                                                                                            C0133.m2574(iM279, qVar, iM279, iVarM5562);
                                                                                            break;
                                                                                        case 1913:
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                C0045.m869(bVarM6979, new m0.l2(qVar), qVar, C0057.m1083(0));
                                                                                C0262.m4990(qVar, (-2058659958) ^ C0295.f442);
                                                                                C0396.m7736(C0434.m8483(p0VarM2168, new e1.r(j12)), eVar3, qVar, (i16 >> (C0315.f462 ^ 260)) & (C0120.f146 ^ 431));
                                                                                C0016.m325(qVar, false, true, false, false);
                                                                                C0171.m3270(qVar, false);
                                                                                C0171.m3270(qVar, true);
                                                                                C0171.m3270(qVar, false);
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
                                x1VarM7533 = C0385.m7533(qVar);
                                i17 = 1568232;
                                while (true) {
                                    i17 ^= 1568249;
                                    switch (i17) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (x1VarM7533 != null) {
                                                i17 = 1568976;
                                            }
                                            break;
                                        case 991:
                                            return;
                                        case 1022:
                                            break;
                                        case 7465:
                                            x1VarM7533.f11756d = new w(oVar, f10, j10, j11, j12, eVar, c0Var, f11, iVar, gVar, i10, z10, eVar2, eVar3, i11, i12);
                                            return;
                                        default:
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                    }
                                    i17 = 1568294;
                                }
                                break;
                            case 113:
                                i129 = ((i128 ^ 1655) & i16) == 1170 ? 1514385 : 1514354;
                                break;
                            case 212:
                                boolean zM1625 = C0074.m1625(qVar);
                                int i130 = 1514416;
                                while (true) {
                                    i130 ^= 1514433;
                                    switch (i130) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 47:
                                            C0471.m9156(qVar);
                                            int i131 = 1515315;
                                            while (true) {
                                                i131 ^= 1515332;
                                                switch (i131) {
                                                    case 22:
                                                        break;
                                                    case 119:
                                                        i131 = 1515346;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                                x1VarM7533 = C0385.m7533(qVar);
                                                i17 = 1568232;
                                                while (true) {
                                                    i17 ^= 1568249;
                                                    switch (i17) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (x1VarM7533 != null) {
                                                                i17 = 1568976;
                                                            }
                                                            break;
                                                        case 991:
                                                            return;
                                                        case 1022:
                                                            break;
                                                        case 7465:
                                                            x1VarM7533.f11756d = new w(oVar, f10, j10, j11, j12, eVar, c0Var, f11, iVar, gVar, i10, z10, eVar2, eVar3, i11, i12);
                                                            return;
                                                        default:
                                                            continue;
                                                            continue;
                                                            continue;
                                                            continue;
                                                    }
                                                    i17 = 1568294;
                                                }
                                            }
                                            break;
                                        case 113:
                                            i130 = !zM1625 ? 1515160 : 1514478;
                                            break;
                                        case 1369:
                                            int i132 = 1515191;
                                            while (true) {
                                                i132 ^= 1515208;
                                                switch (i132) {
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                        break;
                                                    case 127:
                                                        i132 = 1515222;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                                C0262.m4990(qVar, (-1019460398) ^ C0106.f132);
                                                i18 = C0327.f474;
                                                i19 = 1515439;
                                                while (true) {
                                                    i19 ^= 1515456;
                                                    switch (i19) {
                                                        case 111:
                                                            if (((i18 ^ (-872)) & i14) == 32) {
                                                            }
                                                            break;
                                                        case 15703:
                                                            z11 = true;
                                                            i56 = 1516214;
                                                            while (true) {
                                                                i56 ^= 1516231;
                                                                switch (i56) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 113:
                                                                        i56 = 1516245;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        case 15769:
                                                            break;
                                                        case 15800:
                                                            z11 = false;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                i20 = 1516338;
                                                while (true) {
                                                    i20 ^= 1516355;
                                                    switch (i20) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 51:
                                                            z12 = false;
                                                            break;
                                                        case 113:
                                                            if ((((-1879048193) ^ i14) & i14) == 536870912) {
                                                            }
                                                            break;
                                                        case 22444:
                                                            z12 = true;
                                                            i55 = 1537294;
                                                            while (true) {
                                                                i55 ^= 1537311;
                                                                switch (i55) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i55 = 1537325;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                boolean z19 = (z11 ^ z12) | (z11 & z12);
                                                i21 = 1537418;
                                                while (true) {
                                                    i21 ^= 1537435;
                                                    switch (i21) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if ((((-234881025) ^ i14) & i14) == 67108864) {
                                                                i21 = 1537511;
                                                            }
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 83:
                                                            z13 = false;
                                                            break;
                                                        case 124:
                                                            z13 = true;
                                                            i54 = 1537542;
                                                            while (true) {
                                                                i54 ^= 1537559;
                                                                switch (i54) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i54 = 1538224;
                                                                        break;
                                                                    case 3751:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            continue;
                                                            continue;
                                                            continue;
                                                    }
                                                    i21 = 1537480;
                                                }
                                                z14 = (z19 ^ z13) | (z13 & z19);
                                                i22 = C0306.f453;
                                                i23 = 1538317;
                                                while (true) {
                                                    i23 ^= 1538334;
                                                    switch (i23) {
                                                        case 19:
                                                            if (((i22 ^ (-378)) & i16) == 4) {
                                                            }
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 85:
                                                            z15 = false;
                                                            break;
                                                        case 116:
                                                            z15 = true;
                                                            i53 = 1538441;
                                                            while (true) {
                                                                i53 ^= 1538458;
                                                                switch (i53) {
                                                                    case 19:
                                                                        i53 = 1538472;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                objM8078 = C0412.m8078(qVar);
                                                i24 = 1539216;
                                                while (true) {
                                                    i24 ^= 1539233;
                                                    switch (i24) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case 49:
                                                            if (!((z14 ^ z15) | (z14 & z15))) {
                                                            }
                                                            break;
                                                        case 76:
                                                            y0VarM2417 = C0125.m2417();
                                                            i52 = 1539340;
                                                            while (true) {
                                                                i52 ^= 1539357;
                                                                switch (i52) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (objM8078 == y0VarM2417) {
                                                                        }
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 87:
                                                                        vVar = objM8078;
                                                                        break;
                                                                    case 116:
                                                                        vVar = new v(f10, gVar, iVar, i10);
                                                                        C0479.m9328(qVar, vVar);
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 111:
                                                            vVar = new v(f10, gVar, iVar, i10);
                                                            C0479.m9328(qVar, vVar);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                j0Var = (r1.j0) vVar;
                                                C0171.m3270(qVar, false);
                                                i25 = C0068.f88;
                                                i26 = C0259.f338;
                                                C0262.m4990(qVar, 1323940522 ^ C0292.f439);
                                                iM276 = C0014.m276(qVar);
                                                r1VarM275 = C0014.m275(qVar);
                                                C0014.m280(C0380.m7428());
                                                jVarM4451 = C0232.m4451();
                                                bVarM6976 = C0356.m6976(oVar);
                                                i27 = C0474.f744;
                                                i28 = C0280.f424;
                                                i29 = C0215.f238;
                                                z16 = C0196.m3764(qVar) instanceof m0.d;
                                                i30 = 1539464;
                                                while (true) {
                                                    i30 ^= 1539481;
                                                    switch (i30) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (z16) {
                                                            }
                                                            break;
                                                        case 64939:
                                                            break;
                                                        case 64968:
                                                            C0236.m4537();
                                                            throw null;
                                                        case 65001:
                                                            C0100.m1961(qVar);
                                                            zM7502 = C0383.m7502(qVar);
                                                            i31 = 1540239;
                                                            while (true) {
                                                                i31 ^= 1540256;
                                                                switch (i31) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case 47:
                                                                        if (zM7502) {
                                                                        }
                                                                        break;
                                                                    case 76:
                                                                        C0017.m346(qVar, jVarM4451);
                                                                        i51 = 1540363;
                                                                        while (true) {
                                                                            i51 ^= 1540380;
                                                                            switch (i51) {
                                                                                case 23:
                                                                                    i51 = 1540394;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case 54:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 109:
                                                                        C0446.m8685(qVar);
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            iVarM1208 = C0063.m1208();
                                                            C0089.m1904(qVar, j0Var, iVarM1208);
                                                            iVarM9055 = C0465.m9055();
                                                            C0089.m1904(qVar, r1VarM275, iVarM9055);
                                                            iVarM5562 = C0290.m5562();
                                                            zM7503 = C0383.m7502(qVar);
                                                            i32 = 1541138;
                                                            while (true) {
                                                                i32 ^= 1541155;
                                                                switch (i32) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 49:
                                                                        if (!zM7503) {
                                                                        }
                                                                        break;
                                                                    case 76:
                                                                        zM43912 = C0229.m4399(C0412.m8078(qVar), C0057.m1083(iM276));
                                                                        i50 = 1541262;
                                                                        while (true) {
                                                                            i50 ^= 1541279;
                                                                            switch (i50) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    if (!zM43912) {
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                case 83:
                                                                                    break;
                                                                                case 116:
                                                                                    C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 115:
                                                                        C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            C0353.m6912(((((((i14 << (i25 ^ (-763))) & (i26 ^ 660)) << (i27 ^ 653)) & (i28 ^ (-7286))) | (i29 ^ 202)) >> (C0442.f712 ^ (-256))) & (C0467.f737 ^ 292), bVarM6976, new m0.l2(qVar), qVar, 2058660081 ^ C0264.f343);
                                                            lVarM4370 = C0227.m4370();
                                                            y0.o oVarM54910 = C0286.m5498(lVarM4370, C0071.m1462(m6441(), 90, C0157.f181 ^ (-334), 1674));
                                                            fM6012 = C0311.m6012();
                                                            y0.o oVarM35612 = C0187.m3568(oVarM54910, fM6012, 0.0f, 0.0f, 0.0f, C0086.f120 ^ (-775));
                                                            C0262.m4990(qVar, (-733328708) ^ C0170.f194);
                                                            gVarM8889 = C0457.m8889();
                                                            j0VarM2476 = C0128.m2476(gVarM8889, false, qVar);
                                                            C0262.m4990(qVar, 1323940622 ^ C0107.f133);
                                                            iM277 = C0014.m276(qVar);
                                                            r1VarM276 = C0014.m275(qVar);
                                                            bVarM6977 = C0356.m6976(oVarM35612);
                                                            i33 = 1541386;
                                                            while (true) {
                                                                i33 ^= 1541403;
                                                                switch (i33) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (z16) {
                                                                        }
                                                                        break;
                                                                    case 687:
                                                                        break;
                                                                    case 712:
                                                                        C0236.m4537();
                                                                        throw null;
                                                                    case 745:
                                                                        C0100.m1961(qVar);
                                                                        zM7504 = C0383.m7502(qVar);
                                                                        i34 = 1542161;
                                                                        while (true) {
                                                                            i34 ^= 1542178;
                                                                            switch (i34) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case 51:
                                                                                    if (zM7504) {
                                                                                    }
                                                                                    break;
                                                                                case 76:
                                                                                    C0017.m346(qVar, jVarM4451);
                                                                                    i49 = 1542285;
                                                                                    while (true) {
                                                                                        i49 ^= 1542302;
                                                                                        switch (i49) {
                                                                                            case 19:
                                                                                                i49 = 1542316;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                break;
                                                                                            default:
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 109:
                                                                                    C0446.m8685(qVar);
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0089.m1904(qVar, j0VarM2476, iVarM1208);
                                                                        C0089.m1904(qVar, r1VarM276, iVarM9055);
                                                                        zM7505 = C0383.m7502(qVar);
                                                                        i35 = 1543060;
                                                                        while (true) {
                                                                            i35 ^= 1543077;
                                                                            switch (i35) {
                                                                                case 22:
                                                                                    break;
                                                                                case 49:
                                                                                    if (!zM7505) {
                                                                                    }
                                                                                    break;
                                                                                case 84:
                                                                                    zM43911 = C0229.m4399(C0412.m8078(qVar), C0057.m1083(iM277));
                                                                                    i48 = 1543184;
                                                                                    while (true) {
                                                                                        i48 ^= 1543201;
                                                                                        switch (i48) {
                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                break;
                                                                                            case 49:
                                                                                                if (!zM43911) {
                                                                                                }
                                                                                                break;
                                                                                            case 76:
                                                                                                C0133.m2574(iM277, qVar, iM277, iVarM5562);
                                                                                                break;
                                                                                            case 111:
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 119:
                                                                                    C0133.m2574(iM277, qVar, iM277, iVarM5562);
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0353.m6912(0, bVarM6977, new m0.l2(qVar), qVar, (-2058660317) ^ C0063.f83);
                                                                        p0VarM2168 = C0112.m2168();
                                                                        C0396.m7736(C0434.m8483(p0VarM2168, new e1.r(j10)), eVar2, qVar, (i16 >> (C0062.f82 ^ 321)) & (C0040.f60 ^ (-33)));
                                                                        C0016.m325(qVar, false, true, false, false);
                                                                        y0.o oVarM247 = C0013.m245(C0286.m5498(lVarM4370, C0449.m8745(m6441(), 104, C0335.f518 ^ (-728), 2566)), fM6012, 0.0f, C0354.f624 ^ 891);
                                                                        i36 = 1543308;
                                                                        while (true) {
                                                                            i36 ^= 1543325;
                                                                            switch (i36) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    if (z10) {
                                                                                    }
                                                                                    break;
                                                                                case 939:
                                                                                    break;
                                                                                case 968:
                                                                                    clearAndSetSemanticsElement = lVarM4370;
                                                                                    break;
                                                                                case 1001:
                                                                                    C0475.m9249();
                                                                                    clearAndSetSemanticsElement = new ClearAndSetSemanticsElement();
                                                                                    i47 = 1544083;
                                                                                    while (true) {
                                                                                        i47 ^= 1544100;
                                                                                        switch (i47) {
                                                                                            case 22:
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                                                                i47 = 1544114;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                            default:
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        y0.o oVarM805 = C0041.m803(C0449.m8743(oVarM247, clearAndSetSemanticsElement), 0.0f, 0.0f, f11, 0.0f, null, false, (-130588) ^ C0248.f327);
                                                                        C0262.m4990(qVar, (-733329025) ^ C0445.f715);
                                                                        j0VarM2477 = C0128.m2476(gVarM8889, false, qVar);
                                                                        C0262.m4990(qVar, (-1323939870) ^ C0223.f302);
                                                                        iM278 = C0014.m276(qVar);
                                                                        r1VarM277 = C0014.m275(qVar);
                                                                        bVarM6978 = C0356.m6976(oVarM805);
                                                                        i37 = 1544207;
                                                                        while (true) {
                                                                            i37 ^= 1544224;
                                                                            switch (i37) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case 47:
                                                                                    if (z16) {
                                                                                    }
                                                                                    break;
                                                                                case 109:
                                                                                    C0236.m4537();
                                                                                    throw null;
                                                                                case 727:
                                                                                    C0100.m1961(qVar);
                                                                                    zM7506 = C0383.m7502(qVar);
                                                                                    i38 = 1544982;
                                                                                    while (true) {
                                                                                        i38 ^= 1544999;
                                                                                        switch (i38) {
                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                break;
                                                                                            case 49:
                                                                                                if (zM7506) {
                                                                                                }
                                                                                                break;
                                                                                            case 84:
                                                                                                C0017.m346(qVar, jVarM4451);
                                                                                                i46 = 1545106;
                                                                                                while (true) {
                                                                                                    i46 ^= 1545123;
                                                                                                    switch (i46) {
                                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                            break;
                                                                                                        case 49:
                                                                                                            i46 = 1545137;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                        default:
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 115:
                                                                                                C0446.m8685(qVar);
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    C0089.m1904(qVar, j0VarM2477, iVarM1208);
                                                                                    C0089.m1904(qVar, r1VarM277, iVarM9055);
                                                                                    zM7507 = C0383.m7502(qVar);
                                                                                    i39 = 1545230;
                                                                                    while (true) {
                                                                                        i39 ^= 1545247;
                                                                                        switch (i39) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                if (!zM7507) {
                                                                                                }
                                                                                                break;
                                                                                            case 679:
                                                                                                break;
                                                                                            case 712:
                                                                                                C0133.m2574(iM278, qVar, iM278, iVarM5562);
                                                                                                break;
                                                                                            case 745:
                                                                                                zM43910 = C0229.m4399(C0412.m8078(qVar), C0057.m1083(iM278));
                                                                                                i45 = 1546005;
                                                                                                while (true) {
                                                                                                    i45 ^= 1546022;
                                                                                                    switch (i45) {
                                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                            break;
                                                                                                        case 51:
                                                                                                            if (!zM43910) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 84:
                                                                                                            C0133.m2574(iM278, qVar, iM278, iVarM5562);
                                                                                                            break;
                                                                                                        case 117:
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
                                                                                    C0353.m6912(0, bVarM6978, new m0.l2(qVar), qVar, 2058660078 ^ C0034.f54);
                                                                                    int i1215 = i14 >> (C0418.f688 ^ 532);
                                                                                    int i1216 = (C0147.f172 ^ 929) & i1215;
                                                                                    int i1217 = (i14 >> (C0187.f211 ^ (-334))) & (C0213.f236 ^ 152);
                                                                                    int i1218 = (i1216 & i1217) | (i1216 ^ i1217);
                                                                                    int i1219 = i1215 & (C0188.f212 ^ 1001);
                                                                                    C0251.m4802(j11, c0Var, eVar, qVar, (i1218 ^ i1219) | (i1219 & i1218));
                                                                                    C0016.m325(qVar, false, true, false, false);
                                                                                    y0.o oVarM35613 = C0187.m3568(C0286.m5498(lVarM4370, C0486.m9450(m6441(), 109, C0371.f641 ^ 785, 1938)), 0.0f, 0.0f, fM6012, 0.0f, C0292.f439 ^ (-889));
                                                                                    C0262.m4990(qVar, (-733329250) ^ C0236.f315);
                                                                                    j0VarM2478 = C0128.m2476(gVarM8889, false, qVar);
                                                                                    C0262.m4990(qVar, 1323940370 ^ C0255.f334);
                                                                                    iM279 = C0014.m276(qVar);
                                                                                    r1VarM278 = C0014.m275(qVar);
                                                                                    bVarM6979 = C0356.m6976(oVarM35613);
                                                                                    i40 = 1546129;
                                                                                    while (true) {
                                                                                        i40 ^= 1546146;
                                                                                        switch (i40) {
                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                break;
                                                                                            case 51:
                                                                                                if (z16) {
                                                                                                }
                                                                                                break;
                                                                                            case 109:
                                                                                                C0236.m4537();
                                                                                                throw null;
                                                                                            case 32492:
                                                                                                C0100.m1961(qVar);
                                                                                                zM7508 = C0383.m7502(qVar);
                                                                                                i41 = 1567085;
                                                                                                while (true) {
                                                                                                    i41 ^= 1567102;
                                                                                                    switch (i41) {
                                                                                                        case 19:
                                                                                                            if (zM7508) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 180:
                                                                                                            C0017.m346(qVar, jVarM4451);
                                                                                                            i44 = 1567209;
                                                                                                            while (true) {
                                                                                                                i44 ^= 1567226;
                                                                                                                switch (i44) {
                                                                                                                    case 19:
                                                                                                                        i44 = 1567240;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                    case 1010:
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        case 213:
                                                                                                            C0446.m8685(qVar);
                                                                                                            break;
                                                                                                        case 242:
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                C0089.m1904(qVar, j0VarM2478, iVarM1208);
                                                                                                C0089.m1904(qVar, r1VarM278, iVarM9055);
                                                                                                zM7509 = C0383.m7502(qVar);
                                                                                                i42 = 1567333;
                                                                                                while (true) {
                                                                                                    i42 ^= 1567350;
                                                                                                    switch (i42) {
                                                                                                        case 19:
                                                                                                            if (!zM7509) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 1851:
                                                                                                            zM4399 = C0229.m4399(C0412.m8078(qVar), C0057.m1083(iM279));
                                                                                                            i43 = 1568108;
                                                                                                            while (true) {
                                                                                                                i43 ^= 1568125;
                                                                                                                switch (i43) {
                                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                        if (!zM4399) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 180:
                                                                                                                        C0133.m2574(iM279, qVar, iM279, iVarM5562);
                                                                                                                        break;
                                                                                                                    case 215:
                                                                                                                        break;
                                                                                                                    case 246:
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        case 1880:
                                                                                                            C0133.m2574(iM279, qVar, iM279, iVarM5562);
                                                                                                            break;
                                                                                                        case 1913:
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                C0045.m869(bVarM6979, new m0.l2(qVar), qVar, C0057.m1083(0));
                                                                                                C0262.m4990(qVar, (-2058659958) ^ C0295.f442);
                                                                                                C0396.m7736(C0434.m8483(p0VarM2168, new e1.r(j12)), eVar3, qVar, (i16 >> (C0315.f462 ^ 260)) & (C0120.f146 ^ 431));
                                                                                                C0016.m325(qVar, false, true, false, false);
                                                                                                C0171.m3270(qVar, false);
                                                                                                C0171.m3270(qVar, true);
                                                                                                C0171.m3270(qVar, false);
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
                                                x1VarM7533 = C0385.m7533(qVar);
                                                i17 = 1568232;
                                                while (true) {
                                                    i17 ^= 1568249;
                                                    switch (i17) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (x1VarM7533 != null) {
                                                                i17 = 1568976;
                                                            }
                                                            break;
                                                        case 991:
                                                            return;
                                                        case 1022:
                                                            break;
                                                        case 7465:
                                                            x1VarM7533.f11756d = new w(oVar, f10, j10, j11, j12, eVar, c0Var, f11, iVar, gVar, i10, z10, eVar2, eVar3, i11, i12);
                                                            return;
                                                        default:
                                                            continue;
                                                            continue;
                                                            continue;
                                                            continue;
                                                    }
                                                    i17 = 1568294;
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
                    break;
                default:
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۟۠۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6441() {
        int iM3323 = C0174.m3323();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3323 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f511short;
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
}
