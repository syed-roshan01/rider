package f0;

import aa.C0012;
import android.support.v4.app.C0015;
import androidx.annotation.C0019;
import androidx.compose.ui.graphics.C0031;
import androidx.core.content.C0041;
import androidx.profileinstaller.C0046;
import c0.C0057;
import ca.C0070;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.tasks.C0102;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.C0205;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.components.C0135;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.iid.C0170;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.C0177;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.measurement.C0181;
import com.google.firebase.measurement.C0183;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0227;
import dagger.hilt.C0256;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.android.migration.C0240;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.C0253;
import e2.C0262;
import f4.C0275;
import f4.C0277;
import f6.C0278;
import g.C0285;
import g5.C0291;
import g9.C0295;
import h.C0299;
import h3.C0304;
import i.C0317;
import i5.C0319;
import j4.C0327;
import ja.C0331;
import k.C0332;
import k3.C0336;
import l8.C0346;
import la.C0349;
import m0.l3;
import m7.C0357;
import n9.C0367;
import o1.C0368;
import o5.C0371;
import o7.i2;
import p3.C0376;
import p4.C0377;
import s2.C0412;
import s6.C0414;
import t0.C0419;
import t2.C0423;
import u0.C0431;
import u1.C0433;
import u4.C0436;
import u7.C0438;
import v0.C0441;
import v6.C0448;
import v7.C0450;
import w2.C0459;
import x5.C0471;
import y.C0476;
import y9.C0479;
import z.C0481;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends d9.j implements c9.f {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f373short = {1588, 1636, 1656, 1657, 1635, 1588, 1618, 1637, 1636, 1636, 1663, 1662, 1558, 1536, 1544, 1557, 1544, 1551, 1542, 1598, 1543, 1550, 1555, 1598, 1553, 1536, 1560, 1548, 1540, 1551, 1557, 1236, 1217, 1219, 1173, 1227, 1236, 1217, 1219, 1173, 2319, 2310, 2331, 2308, 2312, 2333, 2369, 2375, 2375, 2375, 2368, 2454, 2462, 2675};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Object obj, int i10, int i11, int i12) {
        super(C0327.f474 ^ (-789));
        this.f5858a = i12;
        this.f5859b = i10;
        this.f5860c = i11;
        this.f5861d = obj;
        int iM3132 = C0163.m3132();
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3132 <= 0) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0159.m3042("h7")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i13 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۤۦۣ۠, reason: not valid java name and contains not printable characters */
    public static short[] m5200() {
        int iM3510 = C0183.m3510();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3510 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f373short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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

    /* JADX WARN: Code duplicated, block: B:376:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x0639 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x0309 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x031d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x0337 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x033b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x0337 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x0330 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x0325 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x034b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x034f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x040f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x0449 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x0441 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x04ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x0571 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x0569 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:134:0x039e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:178:0x0492. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:191:0x04cc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:198:0x04e1. Please report as an issue. */
    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        Object objM1083;
        Integer numM1083;
        float fM7374;
        float fM7375;
        int i10;
        int i11;
        f2.l lVarM2878;
        int i12;
        f2.l lVarM4818;
        f2.j jVarM4874;
        int i13;
        int i14;
        f2.k kVarM8544;
        int i15;
        int i16;
        int iM3499;
        int i17;
        int iM804;
        int i18;
        y0.l lVarM4370 = C0227.m4370();
        int iM5370 = C0278.m5370(this);
        int iM3301 = C0173.m3301(this);
        int iM3387 = C0178.m3387(this);
        Object objM2886 = C0150.m2886(this);
        switch (iM5370) {
            case 0:
                C0436.m8515((Number) obj3);
                m0.q qVar = (m0.q) ((m0.m) obj2);
                C0262.m4990(qVar, 408240423 ^ C0331.f478);
                C0232.m4446(iM3387, iM3301);
                int i19 = 48891;
                while (true) {
                    i19 ^= 48908;
                    switch (i19) {
                        case 22:
                            break;
                        case 53:
                            break;
                        case 503:
                            i19 = iM3387 == 1 ? 49635 : 48953;
                            break;
                        case 32495:
                            int i20 = 49666;
                            while (true) {
                                i20 ^= 49683;
                                switch (i20) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i20 = iM3301 == Integer.MAX_VALUE ? 49759 : 49728;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        C0171.m3270(qVar, false);
                                        int i21 = 49790;
                                        while (true) {
                                            i21 ^= 49807;
                                            switch (i21) {
                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    return lVarM4370;
                                                case 241:
                                                    i21 = 49821;
                                                    break;
                                            }
                                        }
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
                m2.b bVar = (m2.b) C0476.m9256(qVar, C0479.m9327());
                f2.d dVar = (f2.d) C0476.m9256(qVar, C0346.m6755());
                m2.l lVar = (m2.l) C0476.m9256(qVar, C0304.m5851());
                a2.c0 c0Var = (a2.c0) objM2886;
                int i22 = (-511387865) ^ C0414.f684;
                C0262.m4990(qVar, i22);
                boolean zM2013 = C0103.m2013(qVar, c0Var);
                boolean zM2014 = C0103.m2013(qVar, lVar);
                Object objM8078 = C0412.m8078(qVar);
                Object objM2417 = C0125.m2417();
                int i23 = 49914;
                while (true) {
                    i23 ^= 49931;
                    switch (i23) {
                        case 497:
                            i23 = !((zM2013 ^ zM2014) | (zM2013 & zM2014)) ? 50658 : 50627;
                            break;
                        case 1711:
                            break;
                        case 1736:
                            objM8078 = C0272.m5215(c0Var, lVar);
                            C0479.m9328(qVar, objM8078);
                            break;
                        case 1769:
                            int i24 = 50689;
                            while (true) {
                                i24 ^= 50706;
                                switch (i24) {
                                    case 19:
                                        i24 = objM8078 == objM2417 ? 50782 : 50751;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        objM8078 = C0272.m5215(c0Var, lVar);
                                        C0479.m9328(qVar, objM8078);
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
                a2.c0 c0Var2 = (a2.c0) objM8078;
                C0262.m4990(qVar, i22);
                boolean zM2015 = C0103.m2013(qVar, dVar);
                boolean zM2016 = C0103.m2013(qVar, c0Var2);
                Object objM8079 = C0412.m8078(qVar);
                int i25 = 50813;
                while (true) {
                    i25 ^= 50830;
                    switch (i25) {
                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case 53:
                            a2.x xVarM3257 = C0170.m3257(c0Var2);
                            f2.e eVarM3456 = C0181.m3456(xVarM3257);
                            lVarM2878 = C0150.m2878(xVarM3257);
                            i12 = 52611;
                            while (true) {
                                i12 ^= 52628;
                                switch (i12) {
                                    case 23:
                                        i12 = lVarM2878 == null ? 52704 : 52673;
                                        break;
                                    case 54:
                                        break;
                                    case 85:
                                        lVarM4818 = lVarM2878;
                                        break;
                                    case 116:
                                        lVarM4818 = C0253.m4818();
                                        break;
                                    default:
                                        break;
                                }
                            }
                            jVarM4874 = C0256.m4874(xVarM3257);
                            i13 = 52735;
                            while (true) {
                                i13 ^= 52752;
                                switch (i13) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        i14 = 0;
                                        break;
                                    case 1007:
                                        i13 = jVarM4874 != null ? 53479 : 52797;
                                        break;
                                    case 7927:
                                        iM804 = C0041.m804(jVarM4874);
                                        i18 = 53510;
                                        while (true) {
                                            i18 ^= 53527;
                                            switch (i18) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i18 = 53541;
                                                    continue;
                                                    continue;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    i14 = iM804;
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
                            kVarM8544 = C0438.m8544(xVarM3257);
                            i15 = 53634;
                            while (true) {
                                i15 ^= 53651;
                                switch (i15) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i15 = kVarM8544 != null ? 53727 : 53696;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        iM3499 = C0183.m3499(kVarM8544);
                                        i17 = 53758;
                                        while (true) {
                                            i17 ^= 53775;
                                            switch (i17) {
                                                case 1009:
                                                    i17 = 54440;
                                                    continue;
                                                    continue;
                                                case 1703:
                                                    i16 = iM3499;
                                                    break;
                                                default:
                                                    continue;
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 83:
                                        i16 = 1;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            objM8079 = C0031.m610((f2.f) dVar, eVarM3456, lVarM4818, i14, i16);
                            C0479.m9328(qVar, objM8079);
                            break;
                        case 243:
                            i25 = !((zM2015 ^ zM2016) | (zM2015 & zM2016)) ? 51557 : 50875;
                            break;
                        case 4075:
                            int i26 = 51588;
                            while (true) {
                                i26 ^= 51605;
                                switch (i26) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i26 = objM8079 == objM2417 ? 51681 : 51650;
                                        break;
                                    case 54:
                                        break;
                                    case 87:
                                        int i27 = 51836;
                                        while (true) {
                                            i27 ^= 51853;
                                            switch (i27) {
                                                case 241:
                                                    i27 = 52518;
                                                    continue;
                                                case 1963:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 116:
                                        int i28 = 51712;
                                        while (true) {
                                            i28 ^= 51729;
                                            switch (i28) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 15:
                                                case Code.UNAUTHENTICATED /* 16 */:
                                                default:
                                                    continue;
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i28 = 51743;
                                                    continue;
                                            }
                                            a2.x xVarM3258 = C0170.m3257(c0Var2);
                                            f2.e eVarM3457 = C0181.m3456(xVarM3258);
                                            lVarM2878 = C0150.m2878(xVarM3258);
                                            i12 = 52611;
                                            while (true) {
                                                i12 ^= 52628;
                                                switch (i12) {
                                                    case 23:
                                                        if (lVarM2878 == null) {
                                                        }
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        lVarM4818 = lVarM2878;
                                                        break;
                                                    case 116:
                                                        lVarM4818 = C0253.m4818();
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            jVarM4874 = C0256.m4874(xVarM3258);
                                            i13 = 52735;
                                            while (true) {
                                                i13 ^= 52752;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        i14 = 0;
                                                        break;
                                                    case 1007:
                                                        if (jVarM4874 != null) {
                                                        }
                                                        break;
                                                    case 7927:
                                                        iM804 = C0041.m804(jVarM4874);
                                                        i18 = 53510;
                                                        while (true) {
                                                            i18 ^= 53527;
                                                            switch (i18) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i18 = 53541;
                                                                    continue;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    i14 = iM804;
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
                                            kVarM8544 = C0438.m8544(xVarM3258);
                                            i15 = 53634;
                                            while (true) {
                                                i15 ^= 53651;
                                                switch (i15) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (kVarM8544 != null) {
                                                        }
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        iM3499 = C0183.m3499(kVarM8544);
                                                        i17 = 53758;
                                                        while (true) {
                                                            i17 ^= 53775;
                                                            switch (i17) {
                                                                case 1009:
                                                                    i17 = 54440;
                                                                    continue;
                                                                    continue;
                                                                case 1703:
                                                                    i16 = iM3499;
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 83:
                                                        i16 = 1;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            objM8079 = C0031.m610((f2.f) dVar, eVarM3457, lVarM4818, i14, i16);
                                            C0479.m9328(qVar, objM8079);
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
                    C0171.m3270(qVar, false);
                    l3 l3Var = (l3) objM8079;
                    Object objM8214 = C0419.m8214(l3Var);
                    Object[] objArr = new Object[5];
                    objArr[C0019.f39 ^ (-76)] = bVar;
                    objArr[C0319.f466 ^ 174] = dVar;
                    objArr[C0291.f438 ^ (-352)] = c0Var;
                    objArr[C0431.f701 ^ 989] = lVar;
                    objArr[C0357.f627 ^ 729] = objM8214;
                    C0262.m4990(qVar, (-568225171) ^ C0371.f641);
                    int i29 = 0;
                    boolean z10 = false;
                    while (true) {
                        int i30 = 54533;
                        while (true) {
                            i30 ^= 54550;
                            switch (i30) {
                                case 19:
                                    i30 = i29 < 5 ? 54626 : 54595;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 85:
                                    break;
                                case 116:
                                    break;
                                default:
                                    break;
                            }
                            Object objM80710 = C0412.m8078(qVar);
                            int i31 = 55432;
                            while (true) {
                                i31 ^= 55449;
                                switch (i31) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i31 = !z10 ? 55525 : 55494;
                                        break;
                                    case 62:
                                        break;
                                    case 95:
                                        long jM8933 = C0459.m8933(c0Var2, bVar, dVar, C0015.m289(), 1);
                                        objM80710 = C0057.m1083((int) (jM8933 & ((4294967295L ^ (-1)) ^ jM8933)));
                                        C0479.m9328(qVar, objM80710);
                                        i11 = 56579;
                                        while (true) {
                                            i11 ^= 56596;
                                            switch (i11) {
                                                case 23:
                                                    i11 = 56610;
                                                    continue;
                                                    continue;
                                                case 54:
                                                    break;
                                                default:
                                                    continue;
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 124:
                                        int i32 = 55556;
                                        while (true) {
                                            i32 ^= 55573;
                                            switch (i32) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i32 = objM80710 == objM2417 ? 55649 : 55618;
                                                    break;
                                                case 54:
                                                    break;
                                                case 87:
                                                    break;
                                                case 116:
                                                    int i33 = 55680;
                                                    while (true) {
                                                        i33 ^= 55697;
                                                        switch (i33) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i33 = 56362;
                                                                continue;
                                                            case 1467:
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                        long jM8934 = C0459.m8933(c0Var2, bVar, dVar, C0015.m289(), 1);
                                                        objM80710 = C0057.m1083((int) (jM8934 & ((4294967295L ^ (-1)) ^ jM8934)));
                                                        C0479.m9328(qVar, objM80710);
                                                        i11 = 56579;
                                                        while (true) {
                                                            i11 ^= 56596;
                                                            switch (i11) {
                                                                case 23:
                                                                    i11 = 56610;
                                                                    continue;
                                                                    continue;
                                                                case 54:
                                                                    break;
                                                                default:
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
                                int i34 = 56455;
                                while (true) {
                                    i34 ^= 56472;
                                    switch (i34) {
                                        case 31:
                                            i34 = 56486;
                                            break;
                                        case 62:
                                            C0171.m3270(qVar, false);
                                            int iM8515 = C0436.m8515((Number) objM80710);
                                            Object objM8215 = C0419.m8214(l3Var);
                                            Object[] objArr2 = new Object[5];
                                            objArr2[C0102.f128 ^ 238] = bVar;
                                            objArr2[C0041.f61 ^ (-321)] = dVar;
                                            objArr2[C0448.f718 ^ (-188)] = c0Var;
                                            objArr2[C0285.f429 ^ 987] = lVar;
                                            objArr2[C0177.f201 ^ 467] = objM8215;
                                            C0262.m4990(qVar, (-568225381) ^ C0116.f142);
                                            int i35 = 0;
                                            boolean z11 = false;
                                            while (true) {
                                                int i36 = 1507503;
                                                while (true) {
                                                    i36 ^= 1507520;
                                                    switch (i36) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            break;
                                                        case 111:
                                                            i36 = i35 < 5 ? 1507596 : 1507565;
                                                            break;
                                                        case 460:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    Object objM80711 = C0412.m8078(qVar);
                                                    int i37 = 1507751;
                                                    while (true) {
                                                        i37 ^= 1507768;
                                                        switch (i37) {
                                                            case 31:
                                                                i37 = !z11 ? 1508495 : 1508464;
                                                                break;
                                                            case 1335:
                                                                int i38 = 1508526;
                                                                while (true) {
                                                                    i38 ^= 1508543;
                                                                    switch (i38) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i38 = objM80711 == objM2417 ? 1508619 : 1508588;
                                                                            break;
                                                                        case 83:
                                                                            objM1083 = objM80711;
                                                                            break;
                                                                        case 114:
                                                                            break;
                                                                        case 436:
                                                                            int i39 = 1508650;
                                                                            while (true) {
                                                                                i39 ^= 1508667;
                                                                                switch (i39) {
                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i39 = 1508681;
                                                                                        continue;
                                                                                    case 114:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                                StringBuilder sb = new StringBuilder();
                                                                                String strM289 = C0015.m289();
                                                                                C0142.m2728(sb, strM289);
                                                                                C0175.m3331(sb, '\n');
                                                                                C0142.m2728(sb, strM289);
                                                                                long jM8935 = C0459.m8933(c0Var2, bVar, dVar, C0441.m8605(sb), C0332.f479 ^ 261);
                                                                                objM1083 = C0057.m1083((int) (jM8935 & ((4294967295L ^ (-1)) ^ jM8935)));
                                                                                C0479.m9328(qVar, objM1083);
                                                                                i10 = 1509549;
                                                                                while (true) {
                                                                                    i10 ^= 1509566;
                                                                                    switch (i10) {
                                                                                        case 19:
                                                                                            i10 = 1509580;
                                                                                            break;
                                                                                        case 114:
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
                                                            case 1480:
                                                                StringBuilder sb2 = new StringBuilder();
                                                                String strM2810 = C0015.m289();
                                                                C0142.m2728(sb2, strM2810);
                                                                C0175.m3331(sb2, '\n');
                                                                C0142.m2728(sb2, strM2810);
                                                                long jM8936 = C0459.m8933(c0Var2, bVar, dVar, C0441.m8605(sb2), C0332.f479 ^ 261);
                                                                objM1083 = C0057.m1083((int) (jM8936 & ((4294967295L ^ (-1)) ^ jM8936)));
                                                                C0479.m9328(qVar, objM1083);
                                                                i10 = 1509549;
                                                                while (true) {
                                                                    i10 ^= 1509566;
                                                                    switch (i10) {
                                                                        case 19:
                                                                            i10 = 1509580;
                                                                            break;
                                                                        case 114:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 1513:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                        int i40 = 1509425;
                                                        while (true) {
                                                            i40 ^= 1509442;
                                                            switch (i40) {
                                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    C0171.m3270(qVar, false);
                                                                    int iM8516 = ((C0436.m8515((Number) objM1083) + 29) - iM8515) - 29;
                                                                    Integer numM1084 = null;
                                                                    int i41 = 1509673;
                                                                    while (true) {
                                                                        i41 ^= 1509690;
                                                                        switch (i41) {
                                                                            case 19:
                                                                                i41 = iM3387 == 1 ? 1510417 : 1510386;
                                                                                break;
                                                                            case 712:
                                                                                numM1083 = C0057.m1083(iM8515 - (0 - ((((iM3387 - 30) - 1) + 30) * iM8516)));
                                                                                int i42 = 1510572;
                                                                                while (true) {
                                                                                    i42 ^= 1510589;
                                                                                    switch (i42) {
                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i42 = 1510603;
                                                                                            continue;
                                                                                        case 118:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 745:
                                                                                break;
                                                                            case 1323:
                                                                                numM1083 = null;
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    int i43 = 1510448;
                                                                    while (true) {
                                                                        i43 ^= 1510465;
                                                                        switch (i43) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                int i44 = 1511347;
                                                                                while (true) {
                                                                                    i44 ^= 1511364;
                                                                                    switch (i44) {
                                                                                        case 22:
                                                                                            break;
                                                                                        case 53:
                                                                                            numM1084 = C0057.m1083(((((iM3301 - 1) - 1) + 1) * iM8516) - (0 - iM8515));
                                                                                            break;
                                                                                        case 119:
                                                                                            i44 = iM3301 == Integer.MAX_VALUE ? 1511440 : 1511409;
                                                                                            break;
                                                                                        case 8148:
                                                                                            int i45 = 1511471;
                                                                                            while (true) {
                                                                                                i45 ^= 1511488;
                                                                                                switch (i45) {
                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                        break;
                                                                                                    case 111:
                                                                                                        i45 = 1511502;
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
                                                                                int i46 = 1511595;
                                                                                while (true) {
                                                                                    i46 ^= 1511612;
                                                                                    switch (i46) {
                                                                                        case 23:
                                                                                            i46 = numM1083 != null ? 1512339 : 1512308;
                                                                                            break;
                                                                                        case 815:
                                                                                            fM7374 = C0377.m7374(bVar, C0367.m7190(numM1083));
                                                                                            int i47 = 1512370;
                                                                                            while (true) {
                                                                                                i47 ^= 1512387;
                                                                                                switch (i47) {
                                                                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                        break;
                                                                                                    case 113:
                                                                                                        i47 = 1512401;
                                                                                                        continue;
                                                                                                    default:
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 968:
                                                                                            fM7374 = Float.NaN;
                                                                                            break;
                                                                                        case 1001:
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                int i48 = 1512494;
                                                                                while (true) {
                                                                                    i48 ^= 1512511;
                                                                                    switch (i48) {
                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            if (numM1084 != null) {
                                                                                                i48 = 1513238;
                                                                                            }
                                                                                            break;
                                                                                        case 83:
                                                                                            fM7375 = Float.NaN;
                                                                                            break;
                                                                                        case 114:
                                                                                            break;
                                                                                        case 809:
                                                                                            fM7375 = C0377.m7374(bVar, C0367.m7190(numM1084));
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    i48 = 1512556;
                                                                                }
                                                                                y0.o oVarM5673 = C0295.m5673(lVarM4370, fM7374, fM7375);
                                                                                C0171.m3270(qVar, false);
                                                                                return oVarM5673;
                                                                            case 113:
                                                                                i43 = 1510479;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 115:
                                                                    i40 = 1509456;
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                }
                                                boolean zM2017 = C0103.m2013(qVar, objArr2[i35]);
                                                z11 = (z11 & zM2017) | (z11 ^ zM2017);
                                                i35 += C0240.f319 ^ 203;
                                                int i49 = 1507627;
                                                while (true) {
                                                    i49 ^= 1507644;
                                                    switch (i49) {
                                                        case 23:
                                                            i49 = 1507658;
                                                            break;
                                                        case 118:
                                                            break;
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                }
                            }
                        }
                        boolean zM2018 = C0103.m2013(qVar, objArr[i29]);
                        z10 = (z10 & zM2018) | (z10 ^ zM2018);
                        i29 += C0135.f161 ^ (-902);
                        int i50 = 54657;
                        while (true) {
                            i50 ^= 54674;
                            switch (i50) {
                                case 19:
                                    i50 = 54688;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                            }
                        }
                    }
                }
                break;
            default:
                m0.m mVar = (m0.m) obj2;
                int iM8517 = C0436.m8515((Number) obj3);
                C0376.m7360((y.a1) obj, C0142.m2731(m5200(), 0, C0057.f77 ^ 701, 1552));
                int i51 = C0070.f90;
                int i52 = 1616;
                while (true) {
                    i52 ^= 1633;
                    switch (i52) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (((i51 ^ 684) & iM8517) == 16) {
                                i52 = 1709;
                            }
                            break;
                        case 204:
                            m0.q qVar2 = (m0.q) mVar;
                            boolean zM1625 = C0074.m1625(qVar2);
                            int i53 = 1740;
                            while (true) {
                                i53 ^= 1757;
                                switch (i53) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (!zM1625) {
                                            i53 = 1833;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        C0471.m9156(qVar2);
                                        int i54 = 48767;
                                        while (true) {
                                            i54 ^= 48784;
                                            switch (i54) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    return C0012.m238();
                                                case 239:
                                                    i54 = 48798;
                                                    break;
                                            }
                                        }
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        int i55 = 1864;
                                        while (true) {
                                            i55 ^= 1881;
                                            switch (i55) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i55 = 48674;
                                                    break;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i53 = 1802;
                            }
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i52 = 1678;
                }
                y0.o oVarM2949 = C0154.m2949(lVarM4370, C0423.f693 ^ (-813));
                long jM6826 = C0349.m6826();
                C0319.m6166(oVarM2949, jM6826, (float) 2.5d, 0L, 0, mVar, C0450.f720 ^ 222, C0299.f446 ^ (-147));
                C0072.m1564(C0431.m8431(lVarM4370, 10), mVar);
                C0319.m6169();
                String strM6122 = C0317.m6122(C0144.m2760(m5200(), 12, C0046.f66 ^ (-815), 1633), (String) C0419.m8214((l3) objM2886));
                Integer numM1085 = C0057.m1083(iM3387);
                Integer numM1086 = C0057.m1083(iM3301);
                Object[] objArr3 = new Object[2];
                objArr3[C0205.f229 ^ 429] = numM1085;
                objArr3[C0195.f219 ^ (-951)] = numM1086;
                String strM3635 = C0190.m3635(C0244.m4671(m5200(), 31, C0471.f741 ^ 188, 1265), C0433.m8465(objArr3, 2));
                C0336.m6501(strM3635, C0119.m2300(m5200(), 40, C0142.f168 ^ (-623), 2409));
                StringBuilder sb3 = new StringBuilder();
                C0142.m2728(sb3, strM6122);
                C0142.m2728(sb3, C0087.m1850(m5200(), 51, C0431.f701 ^ 988, 2486));
                C0142.m2728(sb3, strM3635);
                C0142.m2728(sb3, C0275.m5289(m5200(), 53, 1, 2650));
                C0185.m3537(C0441.m8605(sb3), null, jM6826, C0135.m2601(C0277.f392 ^ (-119)), null, C0081.m1734(), null, C0368.m7197(0.5d), null, null, 0L, 0, false, 0, 0, null, null, mVar, 12782976, 0, (-130560) ^ C0481.f754);
                return C0012.m238();
        }
    }
}
