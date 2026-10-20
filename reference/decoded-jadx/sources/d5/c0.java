package d5;

import a.C0000;
import a.C0001;
import a.C0002;
import aa.C0012;
import android.support.v4.app.C0014;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import androidx.annotation.C0019;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.layout.C0035;
import androidx.core.app.C0040;
import androidx.core.content.C0041;
import androidx.profileinstaller.C0046;
import c0.C0057;
import c1.C0059;
import c3.C0063;
import c6.C0067;
import c7.C0068;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.play.core.integrity.client.C0108;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.components.C0135;
import com.google.firebase.emulators.C0141;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.C0177;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.measurement.C0183;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfig.interop.C0198;
import com.google.firebase.remoteconfiginterop.C0203;
import com.google.firebase.tracing.C0204;
import d1.C0211;
import d7.C0219;
import d7.C0220;
import d8.C0221;
import d9.C0222;
import d9.C0224;
import d9.C0226;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.internal.componenttreedeps.C0248;
import dagger.hilt.internal.generatesrootinput.C0250;
import e1.C0257;
import e2.C0261;
import e7.C0264;
import e8.C0265;
import e9.C0266;
import f.C0270;
import f0.C0272;
import f4.C0276;
import f6.C0278;
import g3.C0288;
import g4.C0289;
import g7.C0292;
import h1.C0300;
import h3.C0301;
import i.C0315;
import i.C0316;
import i5.C0318;
import i6.C0320;
import j2.C0323;
import ja.C0330;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k2.C0333;
import k3.C0334;
import l6.C0343;
import l8.C0345;
import m0.C0349;
import m0.l2;
import m0.l3;
import m3.C0352;
import m4.C0353;
import m5.C0355;
import m7.C0357;
import n7.C0363;
import o2.C0368;
import p0.C0373;
import p3.C0375;
import p8.C0379;
import p8.C0380;
import q0.C0382;
import q7.C0389;
import r4.C0398;
import r9.C0405;
import s2.C0411;
import s6.C0413;
import s8.C0416;
import t0.C0418;
import t1.C0419;
import u0.C0430;
import u4.C0435;
import v0.C0440;
import v5.C0445;
import v6.C0447;
import v9.C0451;
import w1.C0455;
import w2.C0456;
import w2.C0458;
import w5.C0463;
import w6.C0464;
import w9.C0465;
import x5.C0470;
import x8.C0473;
import y.C0475;
import z3.C0487;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends d9.j implements c9.f {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f250short = {1535, 1455, 1459, 1458, 1448, 1535, 1432, 1466, 1449, 1471, 1982, 1970, 3133, 3109, 3128, 3105, 3107, 3108, 3117, 3093, 3130, 3119, 3128, 3116, 3119, 3113, 3134, 3110, 3123, 3093, 3116, 3109, 3128, 314, 292, 313, 293, 274, 299, 292, 289, 313, 296, 319, 2101, 841, 682, 692, 681, 693, 690, 680, 681, 642, 699, 692, 689, 681, 696, 687, 622, 2723, 2741, 2722, 2726, 2745, 2739, 2741, 2703, 2722, 2725, 2750, 2750, 2745, 2750, 2743, 2703, 2723, 2741, 2724, 2725, 2720, 2703, 2723, 2744, 2745, 2730, 2725, 2747, 2725, 1854, 1832, 1855, 1851, 1828, 1838, 1832, 1810, 1854, 1849, 1826, 1853, 1853, 1832, 1833, 1810, 1849, 1836, 1853, 1810, 1849, 1826, 1810, 1854, 1849, 1836, 1855, 1849, 3045, 3014, 3019, 1878, 1889, 1894, 1905, 485, 483, 485, 2980, 3007, 3006, 2989, 2978, 3004, 2978, 2952, 2998, 2983, 2983, 2980, 2952, 3001, 3000, 2979, 3006, 2996, 2994, 1073, 1067, 1082, 1082, 1081, 1079, 11699, 2867};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f4431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4432f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f4433n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l3 f4434o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f4435p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(boolean z10, ArrayList arrayList, boolean z11, boolean z12, Map map, boolean z13, boolean z14, m0.g1 g1Var, long j10) {
        super(C0188.f212 ^ 106);
        this.f4427a = z10;
        this.f4428b = arrayList;
        this.f4429c = z11;
        this.f4430d = z12;
        this.f4431e = map;
        this.f4432f = z13;
        this.f4433n = z14;
        this.f4434o = g1Var;
        this.f4435p = j10;
        int iM6259 = C0323.m6259();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6259 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0177.m3383("7VSVMdPYRs2Pv8n1")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۨۦ, reason: contains not printable characters */
    public static short[] m4156() {
        int iM2434 = C0126.m2434();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2434 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f250short;
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

    /* JADX WARN: Code duplicated, block: B:449:0x0598 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x059e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x05a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x05e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x059e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x059a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x0590 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x05c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x05c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:461:0x05cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x05e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x05c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:0x05c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x05bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:0x05dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x05e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x05e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x05de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x05d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x05f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x05fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x0602 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x0649 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x05fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x05f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x0623 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x0629 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x062d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x0646 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x0629 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x0625 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x061b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x063c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x0642 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x0646 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x0649 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x0642 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x063e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x0634 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x0663 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x0667 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x0674 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x0864 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x0670 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x0663 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x065b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x0683 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x0689 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:0x068d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x0864 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x0689 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x0685 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:0x067b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:0x0754 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x075a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:0x075e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x085f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:0x075a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x0756 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x074c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x0770 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x0774 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:0x077a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x078e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x0776 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x0770 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:0x0768 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x078a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x0791 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x0782 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x07b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:0x07ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x07c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x07e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x07bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:0x07b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:0x07ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x07d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:0x07db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:0x07e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:0x07e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:0x07dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x07d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x07cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:0x085b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:0x0864 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x0853 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:0x04a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:0x04ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:0x04b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:0x0525 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x04ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:0x04aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x04a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:0x0521 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x0580 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x0519 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:96:0x0290. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i10;
        int i11;
        int i12;
        ArrayList arrayList;
        boolean zM1297;
        Map mapM8726;
        int i13;
        boolean zM234;
        int i14;
        boolean zM3889;
        int i15;
        boolean zM7331;
        int i16;
        String strM2260;
        r1.j0 j0VarM2476;
        int iM276;
        m0.r1 r1VarM275;
        t1.j jVarM4451;
        u0.b bVarM6976;
        int i17;
        boolean zM7502;
        int i18;
        t1.i iVarM5562;
        boolean zM7503;
        int i19;
        int i20;
        boolean zM4399;
        int i21;
        int i22;
        String strM9227;
        Boolean bool;
        int i23;
        boolean zM14;
        int i24;
        String strM6177;
        Boolean bool2;
        int i25;
        boolean zM15;
        int i26;
        String strM6122;
        List listM4313;
        m0.m mVar = (m0.m) obj2;
        int iM8515 = C0435.m8515((Number) obj3);
        C0375.m7360((y.v) obj, C0111.m2138(m4156(), 0, C0363.f634 ^ (-6), 1499));
        int i27 = C0389.f660;
        int i28 = 1616;
        while (true) {
            i28 ^= 1633;
            switch (i28) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i28 = ((i27 ^ 150) & iM8515) == 16 ? 1709 : 1678;
                    break;
                case 204:
                    m0.q qVar = (m0.q) mVar;
                    boolean zM1625 = C0074.m1625(qVar);
                    int i29 = 1740;
                    while (true) {
                        i29 ^= 1757;
                        switch (i29) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i29 = !zM1625 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                C0470.m9156(qVar);
                                int i30 = 48767;
                                while (true) {
                                    i30 ^= 48784;
                                    switch (i30) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            return C0012.m238();
                                        case 239:
                                            i30 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i31 = 1864;
                                while (true) {
                                    i31 ^= 1881;
                                    switch (i31) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i31 = 48674;
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
        long jM7463 = C0380.m7463(this);
        m0.q qVar2 = (m0.q) mVar;
        C0261.m4990(qVar2, 483455498 ^ C0183.f207);
        r1.j0 j0VarM4231 = C0218.m4231(C0204.m3900(), C0173.m3300(), qVar2);
        int i32 = 1323940209 ^ C0174.f198;
        C0261.m4990(qVar2, i32);
        int iM277 = C0014.m276(qVar2);
        m0.r1 r1VarM276 = C0014.m275(qVar2);
        C0014.m280(C0379.m7428());
        t1.j jVarM4452 = C0231.m4451();
        u0.b bVarM6977 = C0355.m6976(oVarM4788);
        boolean z10 = C0196.m3764(qVar2) instanceof m0.d;
        int i33 = 48891;
        while (true) {
            i33 ^= 48908;
            switch (i33) {
                case 22:
                    break;
                case 53:
                    C0235.m4537();
                    throw null;
                case 503:
                    if (z10) {
                        i33 = 49635;
                    }
                    break;
                case 32495:
                    C0100.m1961(qVar2);
                    boolean zM7504 = C0382.m7502(qVar2);
                    int i34 = 49666;
                    while (true) {
                        i34 ^= 49683;
                        switch (i34) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM7504) {
                                    i34 = 49759;
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                C0017.m346(qVar2, jVarM4452);
                                int i35 = 49790;
                                while (true) {
                                    i35 ^= 49807;
                                    switch (i35) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i35 = 49821;
                                            break;
                                    }
                                }
                                break;
                            case 83:
                                C0445.m8685(qVar2);
                                break;
                            default:
                                continue;
                        }
                        i34 = 49728;
                    }
                    C0089.m1904(qVar2, j0VarM4231, C0063.m1208());
                    C0089.m1904(qVar2, r1VarM276, C0464.m9055());
                    t1.i iVarM5563 = C0289.m5562();
                    boolean zM7505 = C0382.m7502(qVar2);
                    int i36 = 49914;
                    while (true) {
                        i36 ^= 49931;
                        switch (i36) {
                            case 497:
                                i36 = !zM7505 ? 50658 : 50627;
                                break;
                            case 1711:
                                break;
                            case 1736:
                                C0133.m2574(iM277, qVar2, iM277, iVarM5563);
                                break;
                            case 1769:
                                boolean zM43910 = C0228.m4399(C0411.m8078(qVar2), C0057.m1083(iM277));
                                int i37 = 50689;
                                while (true) {
                                    i37 ^= 50706;
                                    switch (i37) {
                                        case 19:
                                            i37 = !zM43910 ? 50782 : 50751;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            C0133.m2574(iM277, qVar2, iM277, iVarM5563);
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
                    C0352.m6912(0, bVarM6977, new l2(qVar2), qVar2, 2058660139 ^ C0014.f34);
                    e1.f0 f0VarM813 = C0041.m813();
                    boolean zM4503 = C0233.m4503(this);
                    l3 l3VarM9043 = C0463.m9043(this);
                    int i38 = 50813;
                    while (true) {
                        i38 ^= 50830;
                        switch (i38) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                i10 = C0046.f66 ^ (-818);
                                i11 = 55680;
                                while (true) {
                                    i11 ^= 55697;
                                    switch (i11) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i11 = zM4503 ? 56424 : 56393;
                                            break;
                                        case 1467:
                                            break;
                                        case 1496:
                                            C0261.m4990(qVar2, (-112905012) ^ C0301.f449);
                                            C0318.m6169();
                                            C0185.m3537(C0316.m6122(C0265.m5070(m4156(), 90, C0059.f79 ^ 868, 1869), (String) C0418.m8214(l3VarM9043)), null, C0001.m41(), C0135.m2601(i10), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 3072, 0, 130498 ^ C0455.f726);
                                            C0171.m3270(qVar2, false);
                                            break;
                                        case 1529:
                                            C0261.m4990(qVar2, (-112904366) ^ C0272.f388);
                                            C0318.m6169();
                                            C0185.m3537(C0316.m6122(C0227.m4381(m4156(), 61, C0475.f746 ^ (-8), 2768), (String) C0418.m8214(l3VarM9043)), null, C0019.m389(4294940672L), C0135.m2601(i10), null, C0270.m5164(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 200064, 0, 130184 ^ C0090.f124);
                                            C0171.m3270(qVar2, false);
                                            i12 = 56455;
                                            while (true) {
                                                i12 ^= 56472;
                                                switch (i12) {
                                                    case 31:
                                                        i12 = 56486;
                                                        continue;
                                                        continue;
                                                    case 62:
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
                                arrayList = new ArrayList();
                                zM1297 = C0067.m1297(this);
                                mapM8726 = C0447.m8726(this);
                                i13 = 56579;
                                while (true) {
                                    i13 ^= 56596;
                                    switch (i13) {
                                        case 23:
                                            i13 = zM1297 ? 1507472 : 56641;
                                            break;
                                        case 54:
                                            break;
                                        case 85:
                                            break;
                                        case 1564036:
                                            strM6177 = C0318.m6177(m4156(), 118, C0330.f478 ^ 382, 2986);
                                            bool2 = (Boolean) C0487.m9501(mapM8726, strM6177);
                                            i25 = 1507503;
                                            while (true) {
                                                i25 ^= 1507520;
                                                switch (i25) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        C0357.m6998(arrayList, strM6177);
                                                        break;
                                                    case 111:
                                                        i25 = bool2 != null ? 1507596 : 1507565;
                                                        break;
                                                    case 460:
                                                        zM15 = C0000.m14(bool2);
                                                        i26 = 1507627;
                                                        while (true) {
                                                            i26 ^= 1507644;
                                                            switch (i26) {
                                                                case 23:
                                                                    i26 = zM15 ? 1507720 : 1507689;
                                                                    break;
                                                                case 85:
                                                                    break;
                                                                case 118:
                                                                    break;
                                                                case 180:
                                                                    C0357.m6998(arrayList, strM6177);
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
                                zM234 = C0012.m234(this);
                                i14 = 1507751;
                                while (true) {
                                    i14 ^= 1507768;
                                    switch (i14) {
                                        case 31:
                                            i14 = zM234 ? 1508495 : 1508464;
                                            break;
                                        case 1335:
                                            strM9227 = C0473.m9227(m4156(), 121, C0068.f88 ^ (-766), 1795);
                                            bool = (Boolean) C0487.m9501(mapM8726, strM9227);
                                            i23 = 1508526;
                                            while (true) {
                                                i23 ^= 1508543;
                                                switch (i23) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i23 = bool != null ? 1508619 : 1508588;
                                                        break;
                                                    case 83:
                                                        C0357.m6998(arrayList, strM9227);
                                                        break;
                                                    case 114:
                                                        break;
                                                    case 436:
                                                        zM14 = C0000.m14(bool);
                                                        i24 = 1508650;
                                                        while (true) {
                                                            i24 ^= 1508667;
                                                            switch (i24) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i24 = zM14 ? 1509394 : 1508712;
                                                                    break;
                                                                case 83:
                                                                    break;
                                                                case 114:
                                                                    break;
                                                                case 3369:
                                                                    C0357.m6998(arrayList, strM9227);
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
                                        case 1480:
                                            break;
                                        case 1513:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                C0261.m4990(qVar2, (-441153179) ^ C0230.f310);
                                zM3889 = C0203.m3889(arrayList);
                                i15 = 1509425;
                                while (true) {
                                    i15 ^= 1509442;
                                    switch (i15) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            break;
                                        case 115:
                                            if (((((zM3889 ? 1 : 0) ^ '\uffff') & 1) | ((zM3889 ? 1 : 0) & '\ufffe')) != 0) {
                                                i15 = 1509518;
                                            }
                                            break;
                                        case 204:
                                            zM7331 = C0373.m7331(this);
                                            i16 = 1509549;
                                            while (true) {
                                                i16 ^= 1509566;
                                                switch (i16) {
                                                    case 19:
                                                        if (!zM7331) {
                                                            i16 = 1509642;
                                                        }
                                                        break;
                                                    case 85:
                                                        break;
                                                    case 114:
                                                        break;
                                                    case 436:
                                                        String strM9067 = C0465.m9067(arrayList, C0002.m45(m4156(), 125, C0226.f306 ^ 836, 453), null, null, null, C0264.f344 ^ 513);
                                                        C0318.m6169();
                                                        strM2260 = C0117.m2260(C0316.m6122(C0320.m6205(m4156(), 128, C0405.f676 ^ 67, 3031), (String) C0418.m8214(l3VarM9043)), C0368.m7218(m4156(), 147, C0250.f330 ^ (-132), 1098), strM9067);
                                                        C0072.m1564(C0270.m5166(lVarM4370, C0141.f167 ^ 168), qVar2);
                                                        FillElement fillElementM2371 = C0123.m2371();
                                                        float f10 = C0190.f214 ^ (-45);
                                                        y0.o oVarM4789 = C0250.m4788(C0002.m48(C0333.m6470(fillElementM2371, C0419.m8237(f10)), C0019.m389((-4281539194L) ^ ((long) C0276.f392)), f0VarM813), f10);
                                                        C0261.m4990(qVar2, 733328597 ^ C0219.f299);
                                                        j0VarM2476 = C0128.m2476(C0456.m8889(), false, qVar2);
                                                        C0261.m4990(qVar2, (-1323940072) ^ C0233.f313);
                                                        iM276 = C0014.m276(qVar2);
                                                        r1VarM275 = C0014.m275(qVar2);
                                                        C0014.m280(C0379.m7428());
                                                        jVarM4451 = C0231.m4451();
                                                        bVarM6976 = C0355.m6976(oVarM4789);
                                                        i17 = 1509673;
                                                        while (true) {
                                                            i17 ^= 1509690;
                                                            switch (i17) {
                                                                case 19:
                                                                    if (z10) {
                                                                        i17 = 1510417;
                                                                    }
                                                                    break;
                                                                case 712:
                                                                    C0235.m4537();
                                                                    throw null;
                                                                case 745:
                                                                    break;
                                                                case 1323:
                                                                    C0100.m1961(qVar2);
                                                                    zM7502 = C0382.m7502(qVar2);
                                                                    i18 = 1510448;
                                                                    while (true) {
                                                                        i18 ^= 1510465;
                                                                        switch (i18) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case 47:
                                                                                C0445.m8685(qVar2);
                                                                                break;
                                                                            case 113:
                                                                                i18 = zM7502 ? 1510541 : 1510510;
                                                                                break;
                                                                            case 204:
                                                                                C0017.m346(qVar2, jVarM4451);
                                                                                i22 = 1510572;
                                                                                while (true) {
                                                                                    i22 ^= 1510589;
                                                                                    switch (i22) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i22 = 1510603;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                        case 118:
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
                                                                    C0089.m1904(qVar2, j0VarM2476, C0063.m1208());
                                                                    C0089.m1904(qVar2, r1VarM275, C0464.m9055());
                                                                    iVarM5562 = C0289.m5562();
                                                                    zM7503 = C0382.m7502(qVar2);
                                                                    i19 = 1511347;
                                                                    while (true) {
                                                                        i19 ^= 1511364;
                                                                        switch (i19) {
                                                                            case 22:
                                                                                break;
                                                                            case 53:
                                                                                C0133.m2574(iM276, qVar2, iM276, iVarM5562);
                                                                                break;
                                                                            case 119:
                                                                                i19 = !zM7503 ? 1511440 : 1511409;
                                                                                break;
                                                                            case 8148:
                                                                                zM4399 = C0228.m4399(C0411.m8078(qVar2), C0057.m1083(iM276));
                                                                                i21 = 1511471;
                                                                                while (true) {
                                                                                    i21 ^= 1511488;
                                                                                    switch (i21) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                            break;
                                                                                        case 111:
                                                                                            i21 = !zM4399 ? 1511564 : 1511533;
                                                                                            break;
                                                                                        case 204:
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
                                                                    C0352.m6912(0, bVarM6976, new l2(qVar2), qVar2, (-2058660454) ^ C0144.f170);
                                                                    C0185.m3537(C0451.m8805(C0343.m6742(m4156(), 153, C0183.f207 ^ (-886), 2835), strM2260), null, C0019.m389(4294940672L), C0135.m2601(C0040.f60 ^ (-92)), null, C0270.m5164(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 200064, 0, 130809 ^ C0198.f222);
                                                                    C0016.m325(qVar2, false, true, false, false);
                                                                    i20 = 1511595;
                                                                    while (true) {
                                                                        i20 ^= 1511612;
                                                                        switch (i20) {
                                                                            case 23:
                                                                                i20 = 1512277;
                                                                                break;
                                                                            case 1001:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                            }
                                                            i17 = 1510386;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                                i16 = 1509611;
                                            }
                                            break;
                                        default:
                                            continue;
                                            continue;
                                            continue;
                                    }
                                    i15 = 1509487;
                                }
                                C0016.m325(qVar2, false, false, true, false);
                                C0171.m3270(qVar2, false);
                                break;
                            case 243:
                                i38 = zM4503 ? 51557 : 50875;
                                break;
                            case 4075:
                                List listM6732 = C0343.m6732(this);
                                boolean zM9582 = C0492.m9582(listM6732);
                                int i39 = 51588;
                                while (true) {
                                    i39 ^= 51605;
                                    switch (i39) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i39 = ((((zM9582 ? 1 : 0) ^ '\uffff') & 1) | ((zM9582 ? 1 : 0) & '\ufffe')) != 0 ? 51681 : 51650;
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            i10 = C0046.f66 ^ (-818);
                                            i11 = 55680;
                                            while (true) {
                                                i11 ^= 55697;
                                                switch (i11) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (zM4503) {
                                                        }
                                                        break;
                                                    case 1467:
                                                        break;
                                                    case 1496:
                                                        C0261.m4990(qVar2, (-112905012) ^ C0301.f449);
                                                        C0318.m6169();
                                                        C0185.m3537(C0316.m6122(C0265.m5070(m4156(), 90, C0059.f79 ^ 868, 1869), (String) C0418.m8214(l3VarM9043)), null, C0001.m41(), C0135.m2601(i10), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 3072, 0, 130498 ^ C0455.f726);
                                                        C0171.m3270(qVar2, false);
                                                        break;
                                                    case 1529:
                                                        C0261.m4990(qVar2, (-112904366) ^ C0272.f388);
                                                        C0318.m6169();
                                                        C0185.m3537(C0316.m6122(C0227.m4381(m4156(), 61, C0475.f746 ^ (-8), 2768), (String) C0418.m8214(l3VarM9043)), null, C0019.m389(4294940672L), C0135.m2601(i10), null, C0270.m5164(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 200064, 0, 130184 ^ C0090.f124);
                                                        C0171.m3270(qVar2, false);
                                                        i12 = 56455;
                                                        while (true) {
                                                            i12 ^= 56472;
                                                            switch (i12) {
                                                                case 31:
                                                                    i12 = 56486;
                                                                    continue;
                                                                    continue;
                                                                case 62:
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
                                            arrayList = new ArrayList();
                                            zM1297 = C0067.m1297(this);
                                            mapM8726 = C0447.m8726(this);
                                            i13 = 56579;
                                            while (true) {
                                                i13 ^= 56596;
                                                switch (i13) {
                                                    case 23:
                                                        if (zM1297) {
                                                        }
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        break;
                                                    case 1564036:
                                                        strM6177 = C0318.m6177(m4156(), 118, C0330.f478 ^ 382, 2986);
                                                        bool2 = (Boolean) C0487.m9501(mapM8726, strM6177);
                                                        i25 = 1507503;
                                                        while (true) {
                                                            i25 ^= 1507520;
                                                            switch (i25) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    C0357.m6998(arrayList, strM6177);
                                                                    break;
                                                                case 111:
                                                                    if (bool2 != null) {
                                                                    }
                                                                    break;
                                                                case 460:
                                                                    zM15 = C0000.m14(bool2);
                                                                    i26 = 1507627;
                                                                    while (true) {
                                                                        i26 ^= 1507644;
                                                                        switch (i26) {
                                                                            case 23:
                                                                                if (zM15) {
                                                                                }
                                                                                break;
                                                                            case 85:
                                                                                break;
                                                                            case 118:
                                                                                break;
                                                                            case 180:
                                                                                C0357.m6998(arrayList, strM6177);
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
                                            zM234 = C0012.m234(this);
                                            i14 = 1507751;
                                            while (true) {
                                                i14 ^= 1507768;
                                                switch (i14) {
                                                    case 31:
                                                        if (zM234) {
                                                        }
                                                        break;
                                                    case 1335:
                                                        strM9227 = C0473.m9227(m4156(), 121, C0068.f88 ^ (-766), 1795);
                                                        bool = (Boolean) C0487.m9501(mapM8726, strM9227);
                                                        i23 = 1508526;
                                                        while (true) {
                                                            i23 ^= 1508543;
                                                            switch (i23) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (bool != null) {
                                                                    }
                                                                    break;
                                                                case 83:
                                                                    C0357.m6998(arrayList, strM9227);
                                                                    break;
                                                                case 114:
                                                                    break;
                                                                case 436:
                                                                    zM14 = C0000.m14(bool);
                                                                    i24 = 1508650;
                                                                    while (true) {
                                                                        i24 ^= 1508667;
                                                                        switch (i24) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (zM14) {
                                                                                }
                                                                                break;
                                                                            case 83:
                                                                                break;
                                                                            case 114:
                                                                                break;
                                                                            case 3369:
                                                                                C0357.m6998(arrayList, strM9227);
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
                                                    case 1480:
                                                        break;
                                                    case 1513:
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            C0261.m4990(qVar2, (-441153179) ^ C0230.f310);
                                            zM3889 = C0203.m3889(arrayList);
                                            i15 = 1509425;
                                            while (true) {
                                                i15 ^= 1509442;
                                                switch (i15) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case 115:
                                                        if (((((zM3889 ? 1 : 0) ^ '\uffff') & 1) | ((zM3889 ? 1 : 0) & '\ufffe')) != 0) {
                                                            i15 = 1509518;
                                                        }
                                                        break;
                                                    case 204:
                                                        zM7331 = C0373.m7331(this);
                                                        i16 = 1509549;
                                                        while (true) {
                                                            i16 ^= 1509566;
                                                            switch (i16) {
                                                                case 19:
                                                                    if (!zM7331) {
                                                                        i16 = 1509642;
                                                                    }
                                                                    break;
                                                                case 85:
                                                                    break;
                                                                case 114:
                                                                    break;
                                                                case 436:
                                                                    String strM9068 = C0465.m9067(arrayList, C0002.m45(m4156(), 125, C0226.f306 ^ 836, 453), null, null, null, C0264.f344 ^ 513);
                                                                    C0318.m6169();
                                                                    strM2260 = C0117.m2260(C0316.m6122(C0320.m6205(m4156(), 128, C0405.f676 ^ 67, 3031), (String) C0418.m8214(l3VarM9043)), C0368.m7218(m4156(), 147, C0250.f330 ^ (-132), 1098), strM9068);
                                                                    C0072.m1564(C0270.m5166(lVarM4370, C0141.f167 ^ 168), qVar2);
                                                                    FillElement fillElementM2372 = C0123.m2371();
                                                                    float f11 = C0190.f214 ^ (-45);
                                                                    y0.o oVarM47810 = C0250.m4788(C0002.m48(C0333.m6470(fillElementM2372, C0419.m8237(f11)), C0019.m389((-4281539194L) ^ ((long) C0276.f392)), f0VarM813), f11);
                                                                    C0261.m4990(qVar2, 733328597 ^ C0219.f299);
                                                                    j0VarM2476 = C0128.m2476(C0456.m8889(), false, qVar2);
                                                                    C0261.m4990(qVar2, (-1323940072) ^ C0233.f313);
                                                                    iM276 = C0014.m276(qVar2);
                                                                    r1VarM275 = C0014.m275(qVar2);
                                                                    C0014.m280(C0379.m7428());
                                                                    jVarM4451 = C0231.m4451();
                                                                    bVarM6976 = C0355.m6976(oVarM47810);
                                                                    i17 = 1509673;
                                                                    while (true) {
                                                                        i17 ^= 1509690;
                                                                        switch (i17) {
                                                                            case 19:
                                                                                if (z10) {
                                                                                    i17 = 1510417;
                                                                                }
                                                                                break;
                                                                            case 712:
                                                                                C0235.m4537();
                                                                                throw null;
                                                                            case 745:
                                                                                break;
                                                                            case 1323:
                                                                                C0100.m1961(qVar2);
                                                                                zM7502 = C0382.m7502(qVar2);
                                                                                i18 = 1510448;
                                                                                while (true) {
                                                                                    i18 ^= 1510465;
                                                                                    switch (i18) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case 47:
                                                                                            C0445.m8685(qVar2);
                                                                                            break;
                                                                                        case 113:
                                                                                            if (zM7502) {
                                                                                            }
                                                                                            break;
                                                                                        case 204:
                                                                                            C0017.m346(qVar2, jVarM4451);
                                                                                            i22 = 1510572;
                                                                                            while (true) {
                                                                                                i22 ^= 1510589;
                                                                                                switch (i22) {
                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        i22 = 1510603;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    case 118:
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
                                                                                C0089.m1904(qVar2, j0VarM2476, C0063.m1208());
                                                                                C0089.m1904(qVar2, r1VarM275, C0464.m9055());
                                                                                iVarM5562 = C0289.m5562();
                                                                                zM7503 = C0382.m7502(qVar2);
                                                                                i19 = 1511347;
                                                                                while (true) {
                                                                                    i19 ^= 1511364;
                                                                                    switch (i19) {
                                                                                        case 22:
                                                                                            break;
                                                                                        case 53:
                                                                                            C0133.m2574(iM276, qVar2, iM276, iVarM5562);
                                                                                            break;
                                                                                        case 119:
                                                                                            if (!zM7503) {
                                                                                            }
                                                                                            break;
                                                                                        case 8148:
                                                                                            zM4399 = C0228.m4399(C0411.m8078(qVar2), C0057.m1083(iM276));
                                                                                            i21 = 1511471;
                                                                                            while (true) {
                                                                                                i21 ^= 1511488;
                                                                                                switch (i21) {
                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                        break;
                                                                                                    case 111:
                                                                                                        if (!zM4399) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 204:
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
                                                                                C0352.m6912(0, bVarM6976, new l2(qVar2), qVar2, (-2058660454) ^ C0144.f170);
                                                                                C0185.m3537(C0451.m8805(C0343.m6742(m4156(), 153, C0183.f207 ^ (-886), 2835), strM2260), null, C0019.m389(4294940672L), C0135.m2601(C0040.f60 ^ (-92)), null, C0270.m5164(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 200064, 0, 130809 ^ C0198.f222);
                                                                                C0016.m325(qVar2, false, true, false, false);
                                                                                i20 = 1511595;
                                                                                while (true) {
                                                                                    i20 ^= 1511612;
                                                                                    switch (i20) {
                                                                                        case 23:
                                                                                            i20 = 1512277;
                                                                                            break;
                                                                                        case 1001:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                        i17 = 1510386;
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                            }
                                                            i16 = 1509611;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                                i15 = 1509487;
                                            }
                                            C0016.m325(qVar2, false, false, true, false);
                                            C0171.m3270(qVar2, false);
                                            break;
                                        case 116:
                                            C0261.m4990(qVar2, (-112906143) ^ C0419.f690);
                                            String strM9069 = C0465.m9067(listM6732, C0288.m5556(m4156(), 10, C0345.f616 ^ 688, 1938), null, null, null, C0458.f729 ^ (-265));
                                            C0318.m6169();
                                            String strM6123 = C0316.m6122(C0234.m4516(m4156(), 12, C0278.f423 ^ (-97), 3146), (String) C0418.m8214(l3VarM9043));
                                            boolean zM5619 = C0292.m5619(this);
                                            int i40 = 51712;
                                            while (true) {
                                                i40 ^= 51729;
                                                switch (i40) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i40 = zM5619 ? 51805 : 51774;
                                                        break;
                                                    case 47:
                                                        strM6122 = C0316.m6122(C0000.m22(m4156(), 46, C0108.f134 ^ (-76), 733), (String) C0418.m8214(l3VarM9043));
                                                        break;
                                                    case 76:
                                                        String strM6124 = C0316.m6122(C0035.m686(m4156(), 33, C0334.f518 ^ (-730), 333), (String) C0418.m8214(l3VarM9043));
                                                        String[] strArr = new String[1];
                                                        strArr[C0147.f172 ^ 943] = C0073.m1573(m4156(), 44, 1, 2063);
                                                        String str = strArr[0];
                                                        int iM8181 = C0416.m8181(str);
                                                        int i41 = 51836;
                                                        while (true) {
                                                            i41 ^= 51853;
                                                            switch (i41) {
                                                                case 241:
                                                                    i41 = iM8181 == 0 ? 52580 : 52549;
                                                                    break;
                                                                case 1963:
                                                                    break;
                                                                case 1992:
                                                                    listM4313 = C0224.m4313(0, strM6124, str, false);
                                                                    break;
                                                                case 2025:
                                                                    l9.c cVarM4922 = C0257.m4922(strM6124, strArr, false, 0);
                                                                    ArrayList arrayList2 = new ArrayList(C0024.m479(new k9.m(cVarM4922)));
                                                                    Iterator itM5087 = C0266.m5087(cVarM4922);
                                                                    while (true) {
                                                                        boolean zM3327 = C0174.m3327(itM5087);
                                                                        int i42 = 52611;
                                                                        while (true) {
                                                                            i42 ^= 52628;
                                                                            switch (i42) {
                                                                                case 23:
                                                                                    i42 = zM3327 ? 52704 : 52673;
                                                                                    break;
                                                                                case 54:
                                                                                    break;
                                                                                case 85:
                                                                                    break;
                                                                                case 116:
                                                                                    C0357.m6998(arrayList2, C0248.m4753(strM6124, (i9.g) C0413.m8115(itM5087)));
                                                                                    int i43 = 52735;
                                                                                    while (true) {
                                                                                        i43 ^= 52752;
                                                                                        switch (i43) {
                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                break;
                                                                                            case 1007:
                                                                                                i43 = 52766;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                            listM4313 = arrayList2;
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        strM6122 = C0418.m8231((String) C0315.m6101(listM4313, 0), C0074.m1617(m4156(), 45, 1, 864));
                                                        int i44 = 53510;
                                                        while (true) {
                                                            i44 ^= 53527;
                                                            switch (i44) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i44 = 53541;
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
                                            FillElement fillElementM2373 = C0123.m2371();
                                            y0.f fVarM6849 = C0349.m6849();
                                            C0261.m4990(qVar2, (-693286391) ^ C0300.f448);
                                            r1.j0 j0VarM4288 = C0222.m4288(C0113.m2180(), fVarM6849, qVar2);
                                            C0261.m4990(qVar2, i32);
                                            int iM278 = C0014.m276(qVar2);
                                            m0.r1 r1VarM277 = C0014.m275(qVar2);
                                            C0014.m280(C0379.m7428());
                                            t1.j jVarM4453 = C0231.m4451();
                                            u0.b bVarM6978 = C0355.m6976(fillElementM2373);
                                            int i45 = 53634;
                                            while (true) {
                                                i45 ^= 53651;
                                                switch (i45) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i45 = z10 ? 53727 : 53696;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        C0100.m1961(qVar2);
                                                        boolean zM7506 = C0382.m7502(qVar2);
                                                        int i46 = 53758;
                                                        while (true) {
                                                            i46 ^= 53775;
                                                            switch (i46) {
                                                                case 1009:
                                                                    i46 = zM7506 ? 54502 : 54471;
                                                                    break;
                                                                case 1703:
                                                                    break;
                                                                case 1736:
                                                                    C0445.m8685(qVar2);
                                                                    break;
                                                                case 1769:
                                                                    C0017.m346(qVar2, jVarM4453);
                                                                    int i47 = 54533;
                                                                    while (true) {
                                                                        i47 ^= 54550;
                                                                        switch (i47) {
                                                                            case 19:
                                                                                i47 = 54564;
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
                                                        C0089.m1904(qVar2, j0VarM4288, C0063.m1208());
                                                        C0089.m1904(qVar2, r1VarM277, C0464.m9055());
                                                        t1.i iVarM5564 = C0289.m5562();
                                                        boolean zM7507 = C0382.m7502(qVar2);
                                                        int i48 = 54657;
                                                        while (true) {
                                                            i48 ^= 54674;
                                                            switch (i48) {
                                                                case 19:
                                                                    i48 = !zM7507 ? 55401 : 54719;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    C0133.m2574(iM278, qVar2, iM278, iVarM5564);
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 3579:
                                                                    boolean zM43911 = C0228.m4399(C0411.m8078(qVar2), C0057.m1083(iM278));
                                                                    int i49 = 55432;
                                                                    while (true) {
                                                                        i49 ^= 55449;
                                                                        switch (i49) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i49 = !zM43911 ? 55525 : 55494;
                                                                                break;
                                                                            case 62:
                                                                                break;
                                                                            case 95:
                                                                                break;
                                                                            case 124:
                                                                                C0133.m2574(iM278, qVar2, iM278, iVarM5564);
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
                                                        C0352.m6912(0, bVarM6978, new l2(qVar2), qVar2, 2058659967 ^ C0398.f669);
                                                        C0220.m4245(C0002.m48(C0333.m6470(C0154.m2949(lVarM4370, C0211.f235 ^ 544), C0353.m6942()), jM7463, f0VarM813), qVar2, 0);
                                                        C0072.m1564(C0430.m8431(lVarM4370, C0089.f123 ^ 386), qVar2);
                                                        StringBuilder sb = new StringBuilder();
                                                        C0142.m2728(sb, strM6123);
                                                        String strM2472 = C0128.m2472(m4156(), 60, 1, 590);
                                                        C0142.m2728(sb, strM2472);
                                                        C0142.m2728(sb, strM9069);
                                                        C0142.m2728(sb, strM2472);
                                                        C0142.m2728(sb, strM6122);
                                                        C0185.m3537(C0440.m8605(sb), C0221.m4269(), jM7463, C0135.m2601(C0419.f690 ^ 87), null, C0081.m1734(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 199680, 0, 130374 ^ C0398.f669);
                                                        C0016.m325(qVar2, false, true, false, false);
                                                        C0171.m3270(qVar2, false);
                                                        int i50 = 55556;
                                                        while (true) {
                                                            i50 ^= 55573;
                                                            switch (i50) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i50 = 55587;
                                                                    continue;
                                                                case 54:
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 83:
                                                        C0235.m4537();
                                                        throw null;
                                                    default:
                                                        break;
                                                }
                                            }
                                            arrayList = new ArrayList();
                                            zM1297 = C0067.m1297(this);
                                            mapM8726 = C0447.m8726(this);
                                            i13 = 56579;
                                            while (true) {
                                                i13 ^= 56596;
                                                switch (i13) {
                                                    case 23:
                                                        if (zM1297) {
                                                        }
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        break;
                                                    case 1564036:
                                                        strM6177 = C0318.m6177(m4156(), 118, C0330.f478 ^ 382, 2986);
                                                        bool2 = (Boolean) C0487.m9501(mapM8726, strM6177);
                                                        i25 = 1507503;
                                                        while (true) {
                                                            i25 ^= 1507520;
                                                            switch (i25) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    C0357.m6998(arrayList, strM6177);
                                                                    break;
                                                                case 111:
                                                                    if (bool2 != null) {
                                                                    }
                                                                    break;
                                                                case 460:
                                                                    zM15 = C0000.m14(bool2);
                                                                    i26 = 1507627;
                                                                    while (true) {
                                                                        i26 ^= 1507644;
                                                                        switch (i26) {
                                                                            case 23:
                                                                                if (zM15) {
                                                                                }
                                                                                break;
                                                                            case 85:
                                                                                break;
                                                                            case 118:
                                                                                break;
                                                                            case 180:
                                                                                C0357.m6998(arrayList, strM6177);
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
                                            zM234 = C0012.m234(this);
                                            i14 = 1507751;
                                            while (true) {
                                                i14 ^= 1507768;
                                                switch (i14) {
                                                    case 31:
                                                        if (zM234) {
                                                        }
                                                        break;
                                                    case 1335:
                                                        strM9227 = C0473.m9227(m4156(), 121, C0068.f88 ^ (-766), 1795);
                                                        bool = (Boolean) C0487.m9501(mapM8726, strM9227);
                                                        i23 = 1508526;
                                                        while (true) {
                                                            i23 ^= 1508543;
                                                            switch (i23) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (bool != null) {
                                                                    }
                                                                    break;
                                                                case 83:
                                                                    C0357.m6998(arrayList, strM9227);
                                                                    break;
                                                                case 114:
                                                                    break;
                                                                case 436:
                                                                    zM14 = C0000.m14(bool);
                                                                    i24 = 1508650;
                                                                    while (true) {
                                                                        i24 ^= 1508667;
                                                                        switch (i24) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (zM14) {
                                                                                }
                                                                                break;
                                                                            case 83:
                                                                                break;
                                                                            case 114:
                                                                                break;
                                                                            case 3369:
                                                                                C0357.m6998(arrayList, strM9227);
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
                                                    case 1480:
                                                        break;
                                                    case 1513:
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            C0261.m4990(qVar2, (-441153179) ^ C0230.f310);
                                            zM3889 = C0203.m3889(arrayList);
                                            i15 = 1509425;
                                            while (true) {
                                                i15 ^= 1509442;
                                                switch (i15) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        break;
                                                    case 115:
                                                        if (((((zM3889 ? 1 : 0) ^ '\uffff') & 1) | ((zM3889 ? 1 : 0) & '\ufffe')) != 0) {
                                                            i15 = 1509518;
                                                        }
                                                        break;
                                                    case 204:
                                                        zM7331 = C0373.m7331(this);
                                                        i16 = 1509549;
                                                        while (true) {
                                                            i16 ^= 1509566;
                                                            switch (i16) {
                                                                case 19:
                                                                    if (!zM7331) {
                                                                        i16 = 1509642;
                                                                    }
                                                                    break;
                                                                case 85:
                                                                    break;
                                                                case 114:
                                                                    break;
                                                                case 436:
                                                                    String strM90610 = C0465.m9067(arrayList, C0002.m45(m4156(), 125, C0226.f306 ^ 836, 453), null, null, null, C0264.f344 ^ 513);
                                                                    C0318.m6169();
                                                                    strM2260 = C0117.m2260(C0316.m6122(C0320.m6205(m4156(), 128, C0405.f676 ^ 67, 3031), (String) C0418.m8214(l3VarM9043)), C0368.m7218(m4156(), 147, C0250.f330 ^ (-132), 1098), strM90610);
                                                                    C0072.m1564(C0270.m5166(lVarM4370, C0141.f167 ^ 168), qVar2);
                                                                    FillElement fillElementM2374 = C0123.m2371();
                                                                    float f12 = C0190.f214 ^ (-45);
                                                                    y0.o oVarM47811 = C0250.m4788(C0002.m48(C0333.m6470(fillElementM2374, C0419.m8237(f12)), C0019.m389((-4281539194L) ^ ((long) C0276.f392)), f0VarM813), f12);
                                                                    C0261.m4990(qVar2, 733328597 ^ C0219.f299);
                                                                    j0VarM2476 = C0128.m2476(C0456.m8889(), false, qVar2);
                                                                    C0261.m4990(qVar2, (-1323940072) ^ C0233.f313);
                                                                    iM276 = C0014.m276(qVar2);
                                                                    r1VarM275 = C0014.m275(qVar2);
                                                                    C0014.m280(C0379.m7428());
                                                                    jVarM4451 = C0231.m4451();
                                                                    bVarM6976 = C0355.m6976(oVarM47811);
                                                                    i17 = 1509673;
                                                                    while (true) {
                                                                        i17 ^= 1509690;
                                                                        switch (i17) {
                                                                            case 19:
                                                                                if (z10) {
                                                                                    i17 = 1510417;
                                                                                }
                                                                                break;
                                                                            case 712:
                                                                                C0235.m4537();
                                                                                throw null;
                                                                            case 745:
                                                                                break;
                                                                            case 1323:
                                                                                C0100.m1961(qVar2);
                                                                                zM7502 = C0382.m7502(qVar2);
                                                                                i18 = 1510448;
                                                                                while (true) {
                                                                                    i18 ^= 1510465;
                                                                                    switch (i18) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case 47:
                                                                                            C0445.m8685(qVar2);
                                                                                            break;
                                                                                        case 113:
                                                                                            if (zM7502) {
                                                                                            }
                                                                                            break;
                                                                                        case 204:
                                                                                            C0017.m346(qVar2, jVarM4451);
                                                                                            i22 = 1510572;
                                                                                            while (true) {
                                                                                                i22 ^= 1510589;
                                                                                                switch (i22) {
                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        i22 = 1510603;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    case 118:
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
                                                                                C0089.m1904(qVar2, j0VarM2476, C0063.m1208());
                                                                                C0089.m1904(qVar2, r1VarM275, C0464.m9055());
                                                                                iVarM5562 = C0289.m5562();
                                                                                zM7503 = C0382.m7502(qVar2);
                                                                                i19 = 1511347;
                                                                                while (true) {
                                                                                    i19 ^= 1511364;
                                                                                    switch (i19) {
                                                                                        case 22:
                                                                                            break;
                                                                                        case 53:
                                                                                            C0133.m2574(iM276, qVar2, iM276, iVarM5562);
                                                                                            break;
                                                                                        case 119:
                                                                                            if (!zM7503) {
                                                                                            }
                                                                                            break;
                                                                                        case 8148:
                                                                                            zM4399 = C0228.m4399(C0411.m8078(qVar2), C0057.m1083(iM276));
                                                                                            i21 = 1511471;
                                                                                            while (true) {
                                                                                                i21 ^= 1511488;
                                                                                                switch (i21) {
                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                        break;
                                                                                                    case 111:
                                                                                                        if (!zM4399) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 204:
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
                                                                                C0352.m6912(0, bVarM6976, new l2(qVar2), qVar2, (-2058660454) ^ C0144.f170);
                                                                                C0185.m3537(C0451.m8805(C0343.m6742(m4156(), 153, C0183.f207 ^ (-886), 2835), strM2260), null, C0019.m389(4294940672L), C0135.m2601(C0040.f60 ^ (-92)), null, C0270.m5164(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 200064, 0, 130809 ^ C0198.f222);
                                                                                C0016.m325(qVar2, false, true, false, false);
                                                                                i20 = 1511595;
                                                                                while (true) {
                                                                                    i20 ^= 1511612;
                                                                                    switch (i20) {
                                                                                        case 23:
                                                                                            i20 = 1512277;
                                                                                            break;
                                                                                        case 1001:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                        i17 = 1510386;
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                            }
                                                            i16 = 1509611;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                                i15 = 1509487;
                                            }
                                            C0016.m325(qVar2, false, false, true, false);
                                            C0171.m3270(qVar2, false);
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
                    continue;
            }
            i33 = 48953;
        }
        return C0012.m238();
    }
}
