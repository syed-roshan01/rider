package k0;

import a.C0000;
import a8.C0009;
import aa.C0011;
import aa.C0012;
import android.os.C0013;
import android.support.v4.app.C0015;
import androidx.annotation.C0018;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.node.C0037;
import androidx.compose.ui.platform.C0038;
import c3.C0062;
import c7.C0069;
import com.auto.accept.data.model.C0071;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.tasks.C0103;
import com.google.android.play.core.integrity.client.C0107;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.components.C0135;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.iid.C0170;
import com.google.firebase.iid.C0171;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.measurement.C0181;
import com.google.firebase.measurement.C0184;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d7.C0219;
import dagger.hilt.C0255;
import dagger.hilt.android.C0240;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.codegen.C0242;
import dagger.hilt.internal.C0252;
import dagger.hilt.internal.definecomponent.C0249;
import e0.C0256;
import e1.C0258;
import e2.C0261;
import f.C0270;
import g5.C0291;
import g8.C0293;
import ga.C0295;
import h.C0296;
import h8.C0313;
import h8.C0314;
import i4.C0317;
import i5.C0318;
import j3.C0325;
import j4.C0326;
import k.C0331;
import n.C0361;
import n8.C0365;
import p8.C0379;
import q9.C0391;
import r2.C0397;
import r6.C0402;
import r7.C0403;
import s.C0408;
import s0.C0410;
import s7.C0415;
import u.C0429;
import u1.C0432;
import u2.C0433;
import u4.C0435;
import u7.C0437;
import u8.C0438;
import v8.C0450;
import w.C0453;
import w1.C0455;
import w5.C0463;
import x5.C0470;
import x7.C0471;
import x8.C0473;
import y.C0474;
import y.C0475;
import z.C0480;
import z7.C0488;

/* JADX INFO: loaded from: classes.dex */
public final class n4 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f9278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9280e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(float f10, long j10, c9.e eVar, boolean z10, long j11) {
        super(C0111.f137 ^ (-771));
        this.f9276a = f10;
        this.f9277b = j10;
        this.f9278c = eVar;
        this.f9279d = z10;
        this.f9280e = j11;
        int iM9246 = C0474.m9246();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9246 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0270.m5174("J7WaLCdCLaRGCF")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:529:0x0577 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x057b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:0x0581 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x0582 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:0x057d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x0577 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x056f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x058d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x0591 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:0x0597 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x0598 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x0593 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x058d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:0x0585 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x05ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x05b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x0649 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x05ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x05a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:560:0x0644 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x05b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x043f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:0x0445 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:0x0449 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:0x044d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:0x0445 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x0441 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x0437 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x002a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        l2.o oVarM8476;
        int i11;
        boolean z10;
        int i12;
        int i13;
        float fM8019;
        float fM80110;
        e1.k0 k0Var;
        e1.k0 k0Var2;
        int i14;
        a2.r rVarM1568;
        int i15;
        int i16;
        boolean zM8469;
        boolean zM84610;
        int i17;
        a2.r rVar;
        int i18;
        a2.c0 c0VarM4236;
        m0.m mVar = (m0.m) obj;
        int iM8515 = C0435.m8515((Number) obj2);
        int i19 = C0038.f58;
        int i20 = 1616;
        while (true) {
            i20 ^= 1633;
            switch (i20) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i20 = ((i19 ^ (-220)) & iM8515) == 2 ? 1709 : 1678;
                    break;
                case 204:
                    m0.q qVar = (m0.q) mVar;
                    boolean zM1625 = C0074.m1625(qVar);
                    int i21 = 1740;
                    while (true) {
                        i21 ^= 1757;
                        switch (i21) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i21 = !zM1625 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                C0470.m9156(qVar);
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
            return C0012.m238();
        }
        m0.m3 m3VarM8878 = C0455.m8878();
        m0.q qVar2 = (m0.q) mVar;
        a2.c0 c0VarM291 = C0015.m291((e5) C0475.m9256(qVar2, m3VarM8878));
        a2.c0 c0VarM5697 = C0296.m5697((e5) C0475.m9256(qVar2, m3VarM8878));
        a2.x xVarM3257 = C0170.m3257(c0VarM291);
        a2.x xVarM3258 = C0170.m3257(c0VarM5697);
        C0488.m9509();
        l2.o oVarM6060 = C0313.m6060(xVarM3257);
        l2.o oVarM6061 = C0313.m6060(xVarM3258);
        boolean z11 = oVarM6060 instanceof l2.b;
        float fM4574 = C0237.m4574(this);
        int i24 = 48891;
        while (true) {
            i24 ^= 48908;
            switch (i24) {
                case 22:
                    break;
                case 53:
                    i10 = 50813;
                    while (true) {
                        i10 ^= 50830;
                        switch (i10) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                oVarM8476 = (l2.o) C0331.m6407(fM4574, oVarM6060, oVarM6061);
                                i11 = 51836;
                                while (true) {
                                    i11 ^= 51853;
                                    switch (i11) {
                                        case 241:
                                            i11 = 52518;
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                        case 1963:
                                            break;
                                        default:
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                    }
                                }
                                break;
                            case 243:
                                i10 = z11 ? 51557 : 50875;
                                break;
                            case 4075:
                                z10 = oVarM6061 instanceof l2.b;
                                i12 = 51588;
                                while (true) {
                                    i12 ^= 51605;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = z10 ? 51681 : 51650;
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            oVarM8476 = (l2.o) C0331.m6407(fM4574, oVarM6060, oVarM6061);
                                            i11 = 51836;
                                            while (true) {
                                                i11 ^= 51853;
                                                switch (i11) {
                                                    case 241:
                                                        i11 = 52518;
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                    case 1963:
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 116:
                                            oVarM8476 = C0433.m8476(C0167.m3197(C0410.m8052(oVarM6060), C0410.m8052(oVarM6061), fM4574), (e1.n) C0331.m6407(fM4574, C0091.m1937((l2.b) oVarM6060), C0091.m1937((l2.b) oVarM6061)));
                                            i13 = 51712;
                                            while (true) {
                                                i13 ^= 51729;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 15:
                                                    case Code.UNAUTHENTICATED /* 16 */:
                                                    default:
                                                        continue;
                                                        continue;
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i13 = 51743;
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
                            default:
                                break;
                        }
                    }
                    break;
                case 503:
                    i24 = !z11 ? 49635 : 48953;
                    break;
                case 32495:
                    boolean z12 = oVarM6061 instanceof l2.b;
                    int i25 = 49666;
                    while (true) {
                        i25 ^= 49683;
                        switch (i25) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i25 = !z12 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                long jM7168 = C0365.m7168(C0000.m19(oVarM6060), C0000.m19(oVarM6061), fM4574);
                                long jM220 = C0011.m220();
                                int i26 = 49790;
                                while (true) {
                                    i26 ^= 49807;
                                    switch (i26) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 51:
                                            oVarM8476 = C0361.m7095();
                                            break;
                                        case 84:
                                            oVarM8476 = new l2.c(jM7168);
                                            int i27 = 49914;
                                            while (true) {
                                                i27 ^= 49931;
                                                switch (i27) {
                                                    case 497:
                                                        i27 = 50596;
                                                        continue;
                                                    case 1711:
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 241:
                                            i26 = jM7168 != jM220 ? 49883 : 49852;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 83:
                                i10 = 50813;
                                while (true) {
                                    i10 ^= 50830;
                                    switch (i10) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 53:
                                            oVarM8476 = (l2.o) C0331.m6407(fM4574, oVarM6060, oVarM6061);
                                            i11 = 51836;
                                            while (true) {
                                                i11 ^= 51853;
                                                switch (i11) {
                                                    case 241:
                                                        i11 = 52518;
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                    case 1963:
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 243:
                                            if (z11) {
                                            }
                                            break;
                                        case 4075:
                                            z10 = oVarM6061 instanceof l2.b;
                                            i12 = 51588;
                                            while (true) {
                                                i12 ^= 51605;
                                                switch (i12) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (z10) {
                                                        }
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 87:
                                                        oVarM8476 = (l2.o) C0331.m6407(fM4574, oVarM6060, oVarM6061);
                                                        i11 = 51836;
                                                        while (true) {
                                                            i11 ^= 51853;
                                                            switch (i11) {
                                                                case 241:
                                                                    i11 = 52518;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                case 1963:
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 116:
                                                        oVarM8476 = C0433.m8476(C0167.m3197(C0410.m8052(oVarM6060), C0410.m8052(oVarM6061), fM4574), (e1.n) C0331.m6407(fM4574, C0091.m1937((l2.b) oVarM6060), C0091.m1937((l2.b) oVarM6061)));
                                                        i13 = 51712;
                                                        while (true) {
                                                            i13 ^= 51729;
                                                            switch (i13) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 15:
                                                                case Code.UNAUTHENTICATED /* 16 */:
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i13 = 51743;
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
            int i28 = 50689;
            while (true) {
                i28 ^= 50706;
                switch (i28) {
                    case 19:
                        i28 = 50720;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        f2.e eVar = (f2.e) C0331.m6407(fM4574, C0181.m3456(xVarM3257), C0181.m3456(xVarM3258));
                        long jM6170 = C0318.m6170(C0293.m5645(xVarM3257), C0293.m5645(xVarM3258), fM4574);
                        f2.l lVarM2878 = C0150.m2878(xVarM3257);
                        int i29 = 52611;
                        while (true) {
                            i29 ^= 52628;
                            switch (i29) {
                                case 23:
                                    i29 = lVarM2878 == null ? 52704 : 52673;
                                    break;
                                case 54:
                                    break;
                                case 85:
                                    break;
                                case 116:
                                    lVarM2878 = C0252.m4818();
                                    break;
                                default:
                                    break;
                            }
                        }
                        f2.l lVarM2879 = C0150.m2878(xVarM3258);
                        int i30 = 52735;
                        while (true) {
                            i30 ^= 52752;
                            switch (i30) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    break;
                                case 1007:
                                    i30 = lVarM2879 == null ? 53479 : 52797;
                                    break;
                                case 7927:
                                    lVarM2879 = C0252.m4818();
                                    break;
                                default:
                                    break;
                            }
                        }
                        f2.l lVar = new f2.l(C0314.m6093(C0249.m4776(C0148.m2846(lVarM2878), C0148.m2846(lVarM2879), fM4574), 1, C0071.f98 ^ (-506)));
                        f2.j jVar = (f2.j) C0331.m6407(fM4574, C0255.m4874(xVarM3257), C0255.m4874(xVarM3258));
                        f2.k kVar = (f2.k) C0331.m6407(fM4574, C0437.m8544(xVarM3257), C0437.m8544(xVarM3258));
                        String str = (String) C0331.m6407(fM4574, C0117.m2253(xVarM3257), C0117.m2253(xVarM3258));
                        long jM6171 = C0318.m6170(C0121.m2325(xVarM3257), C0121.m2325(xVarM3258), fM4574);
                        l2.a aVarM1817 = C0085.m1817(xVarM3257);
                        int i31 = 53510;
                        while (true) {
                            i31 ^= 53527;
                            switch (i31) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i31 = aVarM1817 != null ? 53603 : 53572;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 83:
                                    fM8019 = 0.0f;
                                    break;
                                case 116:
                                    fM8019 = C0408.m8019(aVarM1817);
                                    int i32 = 53634;
                                    while (true) {
                                        i32 ^= 53651;
                                        switch (i32) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i32 = 53665;
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
                        l2.a aVarM1818 = C0085.m1817(xVarM3258);
                        int i33 = 53758;
                        while (true) {
                            i33 ^= 53775;
                            switch (i33) {
                                case 1009:
                                    i33 = aVarM1818 != null ? 54502 : 54471;
                                    break;
                                case 1703:
                                    break;
                                case 1736:
                                    fM80110 = 0.0f;
                                    break;
                                case 1769:
                                    fM80110 = C0408.m8019(aVarM1818);
                                    int i34 = 54533;
                                    while (true) {
                                        i34 ^= 54550;
                                        switch (i34) {
                                            case 19:
                                                i34 = 54564;
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
                        float fM3197 = C0167.m3197(fM8019, fM80110, fM4574);
                        l2.p pVarM9225 = C0473.m9225();
                        l2.p pVarM531 = C0027.m531(xVarM3257);
                        int i35 = 54657;
                        while (true) {
                            i35 ^= 54674;
                            switch (i35) {
                                case 19:
                                    i35 = pVarM531 == null ? 55401 : 54719;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 3579:
                                    pVarM531 = pVarM9225;
                                    break;
                                default:
                                    break;
                            }
                        }
                        l2.p pVarM532 = C0027.m531(xVarM3258);
                        int i36 = 55432;
                        while (true) {
                            i36 ^= 55449;
                            switch (i36) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i36 = pVarM532 == null ? 55525 : 55494;
                                    break;
                                case 62:
                                    break;
                                case 95:
                                    pVarM9225 = pVarM532;
                                    break;
                                case 124:
                                    int i37 = 55556;
                                    while (true) {
                                        i37 ^= 55573;
                                        switch (i37) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i37 = 55587;
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
                        l2.p pVar = new l2.p(C0167.m3197(C0402.m7882(pVarM531), C0402.m7882(pVarM9225), fM4574), C0167.m3197(C0471.m9183(pVarM531), C0471.m9183(pVarM9225), fM4574));
                        h2.d dVar = (h2.d) C0331.m6407(fM4574, C0397.m7767(xVarM3257), C0397.m7767(xVarM3258));
                        long jM7169 = C0365.m7168(C0103.m2021(xVarM3257), C0103.m2021(xVarM3258), fM4574);
                        l2.j jVar2 = (l2.j) C0331.m6407(fM4574, C0403.m7906(xVarM3257), C0403.m7906(xVarM3258));
                        int i38 = C0171.f195;
                        long j10 = (-110) ^ ((long) C0124.f150);
                        e1.k0 k0VarM9166 = C0470.m9166(xVarM3257);
                        int i39 = 55680;
                        while (true) {
                            i39 ^= 55697;
                            switch (i39) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i39 = k0VarM9166 == null ? 56424 : 56393;
                                    break;
                                case 1467:
                                    break;
                                case 1496:
                                    k0Var = k0VarM9166;
                                    break;
                                case 1529:
                                    e1.k0 k0Var3 = new e1.k0(j10, 0.0f, i38 ^ (-73));
                                    int i40 = 56455;
                                    while (true) {
                                        i40 ^= 56472;
                                        switch (i40) {
                                            case 31:
                                                i40 = 56486;
                                                continue;
                                            case 62:
                                                k0Var = k0Var3;
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
                        e1.k0 k0VarM9167 = C0470.m9166(xVarM3258);
                        int i41 = 56579;
                        while (true) {
                            i41 ^= 56596;
                            switch (i41) {
                                case 23:
                                    i41 = k0VarM9167 == null ? 1507472 : 56641;
                                    break;
                                case 54:
                                    break;
                                case 85:
                                    k0Var2 = k0VarM9167;
                                    break;
                                case 1564036:
                                    e1.k0 k0Var4 = new e1.k0(j10, 0.0f, C0317.f465 ^ 338);
                                    int i42 = 1507503;
                                    while (true) {
                                        i42 ^= 1507520;
                                        switch (i42) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                k0Var2 = k0Var4;
                                                break;
                                            case 111:
                                                i42 = 1507534;
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
                        long jM71610 = C0365.m7168(C0429.m8419(k0Var), C0429.m8419(k0Var2), fM4574);
                        long jM3304 = C0173.m3304(k0Var);
                        float fM4903 = C0256.m4903(jM3304);
                        long jM3305 = C0173.m3304(k0Var2);
                        e1.k0 k0Var5 = new e1.k0(jM71610, C0164.m3152(C0167.m3197(fM4903, C0256.m4903(jM3305), fM4574), C0167.m3197(C0107.m2078(jM3304), C0107.m2078(jM3305), fM4574)), C0167.m3197(C0438.m8559(k0Var), C0438.m8559(k0Var2), fM4574));
                        a2.s sVarM734 = C0037.m734(xVarM3257);
                        int i43 = 1507627;
                        while (true) {
                            i43 ^= 1507644;
                            switch (i43) {
                                case 23:
                                    i43 = sVarM734 == null ? 1507720 : 1507689;
                                    break;
                                case 85:
                                    i14 = 1508650;
                                    while (true) {
                                        i14 ^= 1508667;
                                        switch (i14) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i14 = sVarM734 == null ? 1509394 : 1508712;
                                                break;
                                            case 83:
                                                break;
                                            case 114:
                                                break;
                                            case 3369:
                                                sVarM734 = C0240.m4617();
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case 118:
                                    break;
                                case 180:
                                    a2.s sVarM735 = C0037.m734(xVarM3258);
                                    int i44 = 1507751;
                                    while (true) {
                                        i44 ^= 1507768;
                                        switch (i44) {
                                            case 31:
                                                i44 = sVarM735 == null ? 1508495 : 1508464;
                                                break;
                                            case 1335:
                                                sVarM734 = null;
                                                int i45 = 1508526;
                                                while (true) {
                                                    i45 ^= 1508543;
                                                    switch (i45) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i45 = 1508557;
                                                            continue;
                                                        case 114:
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                }
                                                break;
                                            case 1480:
                                                i14 = 1508650;
                                                while (true) {
                                                    i14 ^= 1508667;
                                                    switch (i14) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (sVarM734 == null) {
                                                            }
                                                            break;
                                                        case 83:
                                                            break;
                                                        case 114:
                                                            break;
                                                        case 3369:
                                                            sVarM734 = C0240.m4617();
                                                            break;
                                                        default:
                                                            break;
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
                            a2.x xVar = new a2.x(oVarM8476, jM6170, lVar, jVar, kVar, eVar, str, jM6171, new l2.a(fM3197), pVar, dVar, jM7169, jVar2, k0Var5, sVarM734, (g1.h) C0331.m6407(fM4574, C0013.m250(xVarM3257), C0013.m250(xVarM3258)));
                            C0116.m2230();
                            a2.p pVarM8153 = C0415.m8153(c0VarM291);
                            l2.i iVar = new l2.i(C0029.m561(pVarM8153));
                            a2.p pVarM8154 = C0415.m8153(c0VarM5697);
                            int iM6292 = C0325.m6292((l2.i) C0331.m6407(fM4574, iVar, new l2.i(C0029.m561(pVarM8154))));
                            int iM6314 = C0326.m6314((l2.k) C0331.m6407(fM4574, new l2.k(C0453.m8849(pVarM8153)), new l2.k(C0453.m8849(pVarM8154))));
                            long jM6172 = C0318.m6170(C0261.m4988(pVarM8153), C0261.m4988(pVarM8154), fM4574);
                            l2.q qVarM5692 = C0295.m5692(pVarM8153);
                            int i46 = 1509425;
                            while (true) {
                                i46 ^= 1509442;
                                switch (i46) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        break;
                                    case 115:
                                        i46 = qVarM5692 == null ? 1509518 : 1509487;
                                        break;
                                    case 204:
                                        qVarM5692 = C0242.m4656();
                                        break;
                                    default:
                                        break;
                                }
                            }
                            l2.q qVarM5693 = C0295.m5692(pVarM8154);
                            int i47 = 1509549;
                            while (true) {
                                i47 ^= 1509566;
                                switch (i47) {
                                    case 19:
                                        i47 = qVarM5693 == null ? 1509642 : 1509611;
                                        break;
                                    case 85:
                                        break;
                                    case 114:
                                        break;
                                    case 436:
                                        qVarM5693 = C0242.m4656();
                                        break;
                                    default:
                                        break;
                                }
                            }
                            l2.q qVar3 = new l2.q(C0318.m6170(C0111.m2150(qVarM5692), C0111.m2150(qVarM5693), fM4574), C0318.m6170(C0069.m1334(qVarM5692), C0069.m1334(qVarM5693), fM4574));
                            a2.r rVarM3524 = C0184.m3524(pVarM8153);
                            a2.r rVarM3525 = C0184.m3524(pVarM8154);
                            int i48 = 1509673;
                            while (true) {
                                i48 ^= 1509690;
                                switch (i48) {
                                    case 19:
                                        i48 = rVarM3524 == null ? 1510417 : 1510386;
                                        break;
                                    case 712:
                                        rVarM1568 = C0072.m1568();
                                        i15 = 1511347;
                                        while (true) {
                                            i15 ^= 1511364;
                                            switch (i15) {
                                                case 22:
                                                    break;
                                                case 53:
                                                    break;
                                                case 119:
                                                    i15 = rVarM3524 == null ? 1511440 : 1511409;
                                                    break;
                                                case 8148:
                                                    rVarM3524 = rVarM1568;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        i16 = 1511471;
                                        while (true) {
                                            i16 ^= 1511488;
                                            switch (i16) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    rVarM1568 = rVarM3525;
                                                    break;
                                                case 111:
                                                    i16 = rVarM3525 == null ? 1511564 : 1511533;
                                                    break;
                                                case 204:
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        zM8469 = C0432.m8469(rVarM3524);
                                        zM84610 = C0432.m8469(rVarM1568);
                                        i17 = 1511595;
                                        while (true) {
                                            i17 ^= 1511612;
                                            switch (i17) {
                                                case 23:
                                                    i17 = zM8469 == zM84610 ? 1512339 : 1512308;
                                                    break;
                                                case 815:
                                                    i18 = 1512370;
                                                    while (true) {
                                                        i18 ^= 1512387;
                                                        switch (i18) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                rVar = rVarM3524;
                                                                break;
                                                            case 113:
                                                                i18 = 1512401;
                                                                continue;
                                                                continue;
                                                            default:
                                                                continue;
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                                case 968:
                                                    rVar = new a2.r(C0463.m9038((a2.h) C0331.m6407(fM4574, new a2.h(C0167.m3192(rVarM3524)), new a2.h(C0167.m3192(rVarM1568)))), C0000.m14((Boolean) C0331.m6407(fM4574, C0009.m192(zM8469), C0009.m192(zM84610))));
                                                    break;
                                                case 1001:
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 745:
                                        break;
                                    case 1323:
                                        int i49 = 1510448;
                                        while (true) {
                                            i49 ^= 1510465;
                                            switch (i49) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 47:
                                                    rVarM1568 = C0072.m1568();
                                                    i15 = 1511347;
                                                    while (true) {
                                                        i15 ^= 1511364;
                                                        switch (i15) {
                                                            case 22:
                                                                break;
                                                            case 53:
                                                                break;
                                                            case 119:
                                                                if (rVarM3524 == null) {
                                                                }
                                                                break;
                                                            case 8148:
                                                                rVarM3524 = rVarM1568;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    i16 = 1511471;
                                                    while (true) {
                                                        i16 ^= 1511488;
                                                        switch (i16) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                rVarM1568 = rVarM3525;
                                                                break;
                                                            case 111:
                                                                if (rVarM3525 == null) {
                                                                }
                                                                break;
                                                            case 204:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    zM8469 = C0432.m8469(rVarM3524);
                                                    zM84610 = C0432.m8469(rVarM1568);
                                                    i17 = 1511595;
                                                    while (true) {
                                                        i17 ^= 1511612;
                                                        switch (i17) {
                                                            case 23:
                                                                if (zM8469 == zM84610) {
                                                                }
                                                                break;
                                                            case 815:
                                                                i18 = 1512370;
                                                                while (true) {
                                                                    i18 ^= 1512387;
                                                                    switch (i18) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            rVar = rVarM3524;
                                                                            break;
                                                                        case 113:
                                                                            i18 = 1512401;
                                                                            continue;
                                                                            continue;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            case 968:
                                                                rVar = new a2.r(C0463.m9038((a2.h) C0331.m6407(fM4574, new a2.h(C0167.m3192(rVarM3524)), new a2.h(C0167.m3192(rVarM1568)))), C0000.m14((Boolean) C0331.m6407(fM4574, C0009.m192(zM8469), C0009.m192(zM84610))));
                                                                break;
                                                            case 1001:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 113:
                                                    i49 = rVarM3525 == null ? 1510541 : 1510510;
                                                    break;
                                                case 204:
                                                    rVar = null;
                                                    int i50 = 1510572;
                                                    while (true) {
                                                        i50 ^= 1510589;
                                                        switch (i50) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i50 = 1510603;
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
                                        break;
                                    default:
                                        break;
                                }
                                a2.c0 c0Var = new a2.c0(xVar, new a2.p(iM6292, iM6314, jM6172, qVar3, rVar, (l2.g) C0331.m6407(fM4574, C0480.m9367(pVarM8153), C0480.m9367(pVarM8154)), C0473.m9216((l2.e) C0331.m6407(fM4574, new l2.e(C0391.m7670(pVarM8153)), new l2.e(C0391.m7670(pVarM8154)))), C0291.m5606((l2.d) C0331.m6407(fM4574, new l2.d(C0062.m1190(pVarM8153)), new l2.d(C0062.m1190(pVarM8154)))), (l2.r) C0331.m6407(fM4574, C0258.m4930(pVarM8153), C0258.m4930(pVarM8154))));
                                long jM7447 = C0379.m7447(this);
                                boolean zM355 = C0018.m355(this);
                                int i51 = 1512494;
                                while (true) {
                                    i51 ^= 1512511;
                                    switch (i51) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (zM355) {
                                                i51 = 1513238;
                                            }
                                            break;
                                        case 83:
                                            c0VarM4236 = c0Var;
                                            break;
                                        case 114:
                                            break;
                                        case 809:
                                            c0VarM4236 = C0219.m4236(0, (-16776533) ^ C0450.f721, jM7447, 0L, 0L, 0L, null, c0Var, null, null, null);
                                            break;
                                        default:
                                            continue;
                                    }
                                    i51 = 1512556;
                                }
                                C0168.m3208(C0453.m8839(this), c0VarM4236, C0135.m2593(this), mVar, 0, 0);
                                return C0012.m238();
                            }
                        }
                }
            }
        }
    }
}
