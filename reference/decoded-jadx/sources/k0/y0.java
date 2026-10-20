package k0;

import a.C0000;
import a7.C0008;
import aa.C0011;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import androidx.annotation.C0018;
import androidx.annotation.C0019;
import androidx.compose.foundation.C0026;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.ui.graphics.C0030;
import androidx.compose.ui.graphics.C0032;
import androidx.compose.ui.layout.C0036;
import androidx.compose.ui.semantics.C0039;
import androidx.core.app.C0040;
import androidx.core.content.C0041;
import androidx.fragment.app.C0042;
import androidx.startup.C0047;
import b.C0049;
import b3.C0051;
import b4.C0052;
import b7.C0053;
import b7.C0054;
import c1.C0061;
import c3.C0062;
import c3.C0063;
import c6.C0067;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.tasks.C0103;
import com.google.android.gms.tasks.C0106;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.components.C0134;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.iid.C0169;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.inject.C0172;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.measurement.C0182;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import com.google.gson.internal.sql.C0208;
import d1.C0213;
import d7.C0220;
import d9.C0225;
import d9.C0226;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.android.migration.C0239;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.C0253;
import dagger.hilt.internal.aggregatedroot.C0246;
import dagger.hilt.internal.definecomponent.C0249;
import e0.C0256;
import e1.C0257;
import e1.C0258;
import e2.C0260;
import e9.C0266;
import ea.C0267;
import f.C0269;
import f1.C0273;
import g.C0283;
import g0.C0285;
import g2.C0286;
import g5.C0291;
import h3.C0301;
import h5.C0307;
import h8.C0313;
import i.C0315;
import i.C0316;
import i6.C0319;
import i6.C0320;
import i9.C0321;
import ia.C0322;
import j3.C0325;
import j5.C0327;
import j6.C0328;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k3.C0334;
import k7.C0337;
import k8.C0338;
import l6.C0343;
import l6.C0344;
import m1.C0351;
import m4.C0353;
import m5.C0355;
import m7.C0357;
import n7.C0363;
import n7.C0364;
import p5.C0377;
import q0.C0382;
import q1.C0383;
import r.C0392;
import r1.C0393;
import r2.C0395;
import r5.C0400;
import r7.C0403;
import rikka.shizuku.C0406;
import s7.C0414;
import t7.C0425;
import u1.C0431;
import u4.C0435;
import v0.C0441;
import v7.C0448;
import w.C0453;
import w4.C0461;
import w5.C0462;
import w6.C0464;
import w9.C0465;
import x4.C0468;
import x8.C0473;
import y6.C0477;
import z1.C0483;
import z3.C0485;
import z3.C0486;
import z3.C0487;
import z7.C0490;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f513short = {838, 861, 836, 836, 776, 843, 841, 838, 838, 839, 860, 776, 842, 845, 776, 843, 841, 859, 860, 776, 860, 839, 776, 838, 839, 838, 773, 838, 861, 836, 836, 776, 860, 849, 856, 845, 776, 841, 838, 844, 858, 839, 833, 844, 848, 774, 843, 839, 837, 856, 839, 859, 845, 774, 858, 861, 838, 860, 833, 837, 845, 774, 845, 848, 860, 845, 858, 838, 841, 836, 774, 835, 839, 860, 836, 833, 838, 848, 774, 843, 839, 836, 836, 845, 843, 860, 833, 839, 838, 859, 774, 833, 837, 837, 861, 860, 841, 842, 836, 845, 774, 833, 837, 856, 836, 845, 837, 845, 838, 860, 841, 860, 833, 839, 838, 859, 774, 833, 837, 837, 861, 860, 841, 842, 836, 845, 869, 841, 856, 774, 888, 845, 858, 859, 833, 859, 860, 845, 838, 860, 864, 841, 859, 832, 869, 841, 856, 788, 867, 776, 839, 846, 776, 841, 838, 844, 858, 839, 833, 844, 848, 774, 843, 839, 837, 856, 839, 859, 845, 774, 858, 861, 838, 860, 833, 837, 845, 774, 845, 848, 860, 845, 858, 838, 841, 836, 774, 835, 839, 860, 836, 833, 838, 848, 774, 843, 839, 836, 836, 845, 843, 860, 833, 839, 838, 859, 774, 833, 837, 837, 861, 860, 841, 842, 836, 845, 774, 833, 837, 856, 836, 845, 837, 845, 838, 860, 841, 860, 833, 839, 838, 859, 774, 833, 837, 837, 861, 860, 841, 842, 836, 845, 869, 841, 856, 774, 888, 845, 858, 859, 833, 859, 860, 845, 838, 860, 864, 841, 859, 832, 869, 841, 856, 774, 875, 839, 837, 856, 841, 838, 833, 839, 838, 774, 845, 837, 856, 860, 849, 871, 846, 772, 776, 894, 776, 839, 846, 776, 841, 838, 844, 858, 839, 833, 844, 848, 774, 843, 839, 837, 856, 839, 859, 845, 774, 858, 861, 838, 860, 833, 837, 845, 774, 845, 848, 860, 845, 858, 838, 841, 836, 774, 835, 839, 860, 836, 833, 838, 848, 774, 843, 839, 836, 836, 845, 843, 860, 833, 839, 838, 859, 774, 833, 837, 837, 861, 860, 841, 842, 836, 845, 774, 833, 837, 856, 836, 845, 837, 845, 838, 860, 841, 860, 833, 839, 838, 859, 774, 833, 837, 837, 861, 860, 841, 842, 836, 845, 869, 841, 856, 774, 888, 845, 858, 859, 833, 859, 860, 845, 838, 860, 864, 841, 859, 832, 869, 841, 856, 774, 875, 839, 837, 856, 841, 838, 833, 839, 838, 774, 845, 837, 856, 860, 849, 871, 846, 790, 1978, 1921, 1930, 1943, 1951, 1930, 1932, 1947, 1930, 1931, 1923, 1942, 1999, 1949, 1930, 1922, 1920, 1945, 1930, 1931, 1999, 1934, 1921, 1932, 1927, 1920, 1949, 1948, 2682, 2648, 2647, 2647, 2646, 2637, 2585, 2650, 2635, 2652, 2648, 2637, 2652, 2585, 2648, 2585, 2644, 2636, 2637, 2648, 2651, 2645, 2652, 2585, 2634, 2647, 2648, 2633, 2634, 2641, 2646, 2637, 2585, 2646, 2655, 2585, 2648, 2647, 2585, 2635, 2652, 2648, 2653, 2580, 2646, 2647, 2645, 2624, 2585, 2634, 2647, 2648, 2633, 2634, 2641, 2646, 2637, 3079, 3119, 3122, 3126, 3131};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9664a;

    public /* synthetic */ y0(int i10) {
        this.f9664a = i10;
        int iM6120 = C0316.m6120();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6120 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0191.m3651("BhR2O8VYLR")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(int i10, int i11) {
        this(0);
        this.f9664a = i10;
        switch (i10) {
            case 1:
                this(1);
                break;
            case 2:
            default:
                int iM992 = C0051.m992();
                int i12 = 1616;
                while (true) {
                    i12 ^= 1633;
                    switch (i12) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (iM992 <= 0) {
                                i12 = 1709;
                            }
                            break;
                        case 204:
                            System.out.println(Long.decode(C0041.m808("FoXz8N")));
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i12 = 1678;
                }
                break;
            case 3:
                this(C0053.f73 ^ (-151));
                break;
            case 4:
                this(C0237.f317 ^ (-611));
                break;
            case 5:
                this(C0164.f188 ^ 408);
                break;
            case 6:
                this(C0161.f185 ^ (-772));
                break;
            case 7:
                this(C0091.f125 ^ (-161));
                break;
            case 8:
                this(C0321.f469 ^ (-609));
                break;
            case 9:
                this(C0081.f115 ^ 177);
                break;
            case 10:
                this(C0036.f56 ^ 32);
                break;
            case 11:
                this(C0307.f455 ^ 167);
                break;
            case 12:
                this(C0441.f712 ^ (-241));
                break;
            case 13:
                this(C0052.f72 ^ 940);
                break;
            case Code.UNAVAILABLE /* 14 */:
                this(C0435.f706 ^ (-918));
                break;
            case 15:
                this(C0183.f207 ^ (-889));
                break;
            case Code.UNAUTHENTICATED /* 16 */:
                this(C0392.f663 ^ 593);
                break;
            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                this(C0334.f518 ^ (-708));
                break;
            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                this(C0322.f470 ^ 109);
                break;
            case 19:
                this(C0266.f346 ^ (-785));
                break;
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                this(C0036.f56 ^ 62);
                break;
            case 21:
                this(C0121.f147 ^ 579);
                break;
            case 22:
                this(C0319.f467 ^ 218);
                break;
            case 23:
                this(C0249.f329 ^ (-813));
                break;
            case 24:
                this(C0395.f666 ^ 897);
                break;
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                this(C0462.f733 ^ 300);
                break;
            case 26:
                this(C0267.f347 ^ (-337));
                break;
            case 27:
                this(C0047.f67 ^ 980);
                break;
            case 28:
                this(C0049.f69 ^ 307);
                break;
            case 29:
                this(C0072.f104 ^ 108);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x002f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0053. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x0081. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x00d4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:87:0x016b. Please report as an issue. */
    public static final void a(k.f fVar) {
        int iM2842;
        r0.d dVar;
        boolean z10;
        Object objM2744;
        Object objM3013;
        C0036.m709();
        while (true) {
            p9.q0 q0VarM709 = C0036.m709();
            Object obj = (p0.g) C0246.m4716(q0VarM709);
            s0.b bVar = (s0.b) obj;
            r0.d dVarM518 = C0026.m518(bVar);
            s0.a aVar = (s0.a) C0201.m3851(dVarM518, fVar);
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i10 = aVar == null ? 1709 : 1678;
                        break;
                    case 204:
                        int i11 = 1740;
                        while (true) {
                            i11 ^= 1757;
                            switch (i11) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = 1771;
                                    break;
                                case 54:
                                    break;
                                default:
                                    break;
                            }
                            break;
                        }
                        break;
                    case 239:
                        int i12 = 1864;
                        while (true) {
                            i12 ^= 1881;
                            switch (i12) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = fVar != null ? 48736 : 48705;
                                    break;
                                case 47384:
                                    iM2842 = 0;
                                    break;
                                case 47417:
                                    iM2842 = C0148.m2842(fVar);
                                    int i13 = 48767;
                                    while (true) {
                                        i13 ^= 48784;
                                        switch (i13) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 239:
                                                i13 = 48798;
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    }
                                    break;
                                case 47483:
                                    break;
                                default:
                                    break;
                            }
                        }
                        r0.r rVarM768 = C0039.m768(dVarM518);
                        r0.r rVarM4696 = C0244.m4696(rVarM768, fVar, iM2842, 0);
                        int i14 = 48891;
                        while (true) {
                            i14 ^= 48908;
                            switch (i14) {
                                case 22:
                                    break;
                                case 53:
                                    int i15 = 49790;
                                    while (true) {
                                        i15 ^= 49807;
                                        switch (i15) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 51:
                                                dVar = new r0.d(rVarM4696, ((C0285.m5494(dVarM518) + 18) - 1) - 18);
                                                break;
                                            case 84:
                                                dVar = C0168.m3209();
                                                C0301.m5795(dVar, C0337.m6634(m6443(), 0, C0225.f305 ^ (-309), 808));
                                                int i16 = 49914;
                                                while (true) {
                                                    i16 ^= 49931;
                                                    switch (i16) {
                                                        case 497:
                                                            i16 = 50596;
                                                            break;
                                                        case 1711:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    break;
                                                }
                                                break;
                                            case 241:
                                                i15 = rVarM4696 == null ? 49883 : 49852;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case 503:
                                    i14 = rVarM768 == rVarM4696 ? 49635 : 48953;
                                    break;
                                case 32495:
                                    int i17 = 49666;
                                    while (true) {
                                        i17 ^= 49683;
                                        switch (i17) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i17 = 49697;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            default:
                                                break;
                                        }
                                        dVar = dVarM518;
                                        break;
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        t0.b bVarM4251 = C0220.m4251();
                        Object objM1651 = C0076.m1651(aVar);
                        int i18 = 50689;
                        while (true) {
                            i18 ^= 50706;
                            switch (i18) {
                                case 19:
                                    i18 = objM1651 != bVarM4251 ? 50782 : 50751;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    z10 = false;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 76:
                                    z10 = true;
                                    break;
                                default:
                                    break;
                            }
                        }
                        Object objM7144 = C0364.m7144(aVar);
                        int i19 = 50813;
                        while (true) {
                            i19 ^= 50830;
                            switch (i19) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case 53:
                                    break;
                                case 243:
                                    i19 = z10 ? 51557 : 50875;
                                    break;
                                case 4075:
                                    Object objM9501 = C0487.m9501(dVar, objM1651);
                                    C0189.m3608(objM9501);
                                    dVar = C0165.m3165(dVar, objM1651, new s0.a(C0076.m1651((s0.a) objM9501), objM7144));
                                    break;
                                default:
                                    break;
                            }
                        }
                        int i20 = 51588;
                        while (true) {
                            i20 ^= 51605;
                            switch (i20) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i20 = objM7144 != bVarM4251 ? 51681 : 51650;
                                    break;
                                case 54:
                                    break;
                                case 87:
                                    break;
                                case 116:
                                    Object objM9502 = C0487.m9501(dVar, objM7144);
                                    C0189.m3608(objM9502);
                                    dVar = C0165.m3165(dVar, objM7144, new s0.a(objM1651, C0364.m7144((s0.a) objM9502)));
                                    break;
                                default:
                                    break;
                            }
                        }
                        int i21 = 51712;
                        while (true) {
                            i21 ^= 51729;
                            switch (i21) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i21 = objM1651 != bVarM4251 ? 51805 : 51774;
                                    break;
                                case 47:
                                    objM2744 = objM7144;
                                    break;
                                case 76:
                                    objM2744 = C0143.m2744(bVar);
                                    int i22 = 51836;
                                    while (true) {
                                        i22 ^= 51853;
                                        switch (i22) {
                                            case 241:
                                                i22 = 52518;
                                                break;
                                            case 1963:
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        int i23 = 52611;
                        while (true) {
                            i23 ^= 52628;
                            switch (i23) {
                                case 23:
                                    i23 = objM7144 != bVarM4251 ? 52704 : 52673;
                                    break;
                                case 54:
                                    break;
                                case 85:
                                    objM3013 = objM1651;
                                    break;
                                case 116:
                                    objM3013 = C0158.m3013(bVar);
                                    break;
                                default:
                                    break;
                            }
                        }
                        bVar = new s0.b(objM2744, objM3013, dVar);
                        break;
                    default:
                        break;
                }
            }
            int i24 = 52735;
            while (true) {
                i24 ^= 52752;
                switch (i24) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        break;
                    case 1007:
                        i24 = obj != bVar ? 53479 : 52797;
                        break;
                    case 7927:
                        break;
                    default:
                        break;
                }
                return;
            }
            i3.u uVarM7398 = C0377.m7398();
            int i25 = 53510;
            while (true) {
                i25 ^= 53527;
                switch (i25) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i25 = obj == null ? 53603 : 53572;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                    case 83:
                        break;
                    case 116:
                        obj = uVarM7398;
                        break;
                    default:
                        break;
                }
            }
            boolean zM6744 = C0344.m6744(q0VarM709, obj, bVar);
            int i26 = 53634;
            while (true) {
                i26 ^= 53651;
                switch (i26) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i26 = zM6744 ? 53727 : 53696;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                    case 76:
                        break;
                    case 83:
                        break;
                    default:
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0028. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x007e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public static void b(m0.q2 q2Var, List list, m0.y1 y1Var) {
        Object objM2417;
        m0.x1 x1Var;
        boolean zM9582 = C0492.m9582(list);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (((((zM9582 ? 1 : 0) ^ '\uffff') & 1) | ((zM9582 ? 1 : 0) & '\ufffe')) != 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int iM171 = C0008.m171(list);
                    int i11 = 0;
                    while (true) {
                        int i12 = i11;
                        int i13 = 1740;
                        while (true) {
                            i13 ^= 1757;
                            switch (i13) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i13 = i12 < iM171 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    break;
                                default:
                                    break;
                            }
                            return;
                        }
                        int iM1010 = C0052.m1010(q2Var, (m0.c) C0315.m6101(list, i12));
                        int iM339 = C0017.m339(q2Var, C0351.m6889(q2Var), C0112.m2166(q2Var, iM1010));
                        int iM6916 = C0353.m6916(q2Var, C0351.m6889(q2Var), C0112.m2166(q2Var, iM1010 + (C0040.f60 ^ (-82))));
                        int i14 = 1864;
                        while (true) {
                            i14 ^= 1881;
                            switch (i14) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i14 = iM339 < iM6916 ? 48736 : 48705;
                                    break;
                                case 47384:
                                    objM2417 = C0125.m2417();
                                    break;
                                case 47417:
                                    objM2417 = C0461.m8986(q2Var)[C0400.m7856(q2Var, iM339)];
                                    int i15 = 48767;
                                    while (true) {
                                        i15 ^= 48784;
                                        switch (i15) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 239:
                                                i15 = 48798;
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    }
                                    break;
                                case 47483:
                                    break;
                                default:
                                    break;
                            }
                        }
                        boolean z10 = objM2417 instanceof m0.x1;
                        int i16 = 48891;
                        while (true) {
                            i16 ^= 48908;
                            switch (i16) {
                                case 22:
                                    break;
                                case 53:
                                    x1Var = null;
                                    break;
                                case 503:
                                    i16 = z10 ? 49635 : 48953;
                                    break;
                                case 32495:
                                    x1Var = (m0.x1) objM2417;
                                    int i17 = 49666;
                                    while (true) {
                                        i17 ^= 49683;
                                        switch (i17) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i17 = 49697;
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
                        int i18 = 49790;
                        while (true) {
                            i18 ^= 49807;
                            switch (i18) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case 51:
                                    break;
                                case 84:
                                    x1Var.f11754b = y1Var;
                                    break;
                                case 241:
                                    i18 = x1Var != null ? 49883 : 49852;
                                    break;
                                default:
                                    break;
                            }
                        }
                        i11 = (C0258.f338 ^ 741) + i12;
                        int i19 = 49914;
                        while (true) {
                            i19 ^= 49931;
                            switch (i19) {
                                case 497:
                                    i19 = 50596;
                                    break;
                                case 1711:
                                    break;
                            }
                        }
                    }
                    break;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public static w0.i c() {
        return C0448.m8746((w0.i) C0393.m7708(C0403.m7917()), null, false);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:129:0x02dd. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x011b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:66:0x0177. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:93:0x0220. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public static List d(m0.q2 q2Var, int i10, m0.q2 q2Var2, boolean z10, boolean z11, boolean z12) {
        Object[] objArr;
        int iM7136;
        List listM7500;
        boolean zM3489;
        boolean z13;
        int iM9470;
        int iM21 = C0000.m21(q2Var, i10);
        int i11 = i10 - (0 - iM21);
        int iM6916 = C0353.m6916(q2Var, C0351.m6889(q2Var), C0112.m2166(q2Var, i10));
        int iM6917 = C0353.m6916(q2Var, C0351.m6889(q2Var), C0112.m2166(q2Var, i11));
        int i12 = ((iM6917 + 32) - iM6916) - 32;
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i13 = i10 >= 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i14 = C0351.m6889(q2Var)[1 - (0 - (C0112.m2166(q2Var, i10) * (C0253.f333 ^ 212)))];
                    int i15 = 1740;
                    while (true) {
                        i15 ^= 1757;
                        switch (i15) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = (((-201326593) ^ i14) & i14) != 0 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                objArr = false;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i16 = 1864;
                                while (true) {
                                    i16 ^= 1881;
                                    switch (i16) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i16 = 48674;
                                            continue;
                                        case 47483:
                                            objArr = true;
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
                    objArr = false;
                    break;
                default:
                    break;
            }
        }
        C0286.m5521(q2Var2, iM21);
        C0269.m5153(q2Var2, i12, C0169.m3232(q2Var2));
        int iM8336 = C0425.m8336(q2Var);
        int i17 = 48767;
        while (true) {
            i17 ^= 48784;
            switch (i17) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    break;
                case 76:
                    C0032.m623(q2Var, i11);
                    break;
                case 239:
                    i17 = iM8336 < i11 ? 48860 : 48829;
                    break;
                default:
                    break;
            }
        }
        int iM7137 = C0363.m7136(q2Var);
        int i18 = 48891;
        while (true) {
            i18 ^= 48908;
            switch (i18) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    i18 = iM7137 < iM6917 ? 49635 : 48953;
                    break;
                case 32495:
                    C0106.m2058(q2Var, iM6917, i11);
                    break;
                default:
                    break;
            }
        }
        int[] iArrM6889 = C0351.m6889(q2Var2);
        int iM3232 = C0169.m3232(q2Var2);
        int[] iArrM68810 = C0351.m6889(q2Var);
        int i19 = (C0465.f736 ^ 211) * iM3232;
        C0075.m1629(i19, (C0406.f677 ^ 846) * i10, (C0239.f319 ^ 207) * i11, iArrM68810, iArrM6889);
        Object[] objArrM8986 = C0461.m8986(q2Var2);
        int iM6649 = C0338.m6649(q2Var2);
        C0225.m4348(iM6649, iM6916, iM6917, C0461.m8986(q2Var), objArrM8986);
        int iM2474 = C0128.m2474(q2Var2);
        iArrM6889[(C0483.f757 ^ (-783)) + i19] = iM2474;
        int i20 = ((iM3232 + 20) - i10) - 20;
        int i21 = (iM3232 - 5) + iM21 + 5;
        int iM6918 = C0353.m6916(q2Var2, iArrM6889, iM3232);
        int iM1160 = C0061.m1160(q2Var2);
        int iM8445 = C0431.m8445(q2Var2);
        int length = objArrM8986.length;
        int i22 = iM3232;
        while (true) {
            int i23 = 49666;
            while (true) {
                i23 ^= 49683;
                switch (i23) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i23 = i22 < i21 ? 49759 : 49728;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                    case 76:
                        break;
                    case 83:
                        break;
                    default:
                        break;
                }
                q2Var2.f11676l = iM1160;
                int iM2582 = C0134.m2582(C0042.m825(q2Var), i10, C0453.m8834(q2Var));
                int iM2583 = C0134.m2582(C0042.m825(q2Var), i11, C0453.m8834(q2Var));
                int i24 = 51712;
                while (true) {
                    i24 ^= 51729;
                    switch (i24) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i24 = iM2582 < iM2583 ? 51805 : 51774;
                            break;
                        case 47:
                            listM7500 = C0382.m7500();
                            break;
                        case 76:
                            ArrayList arrayListM825 = C0042.m825(q2Var);
                            ArrayList arrayList = new ArrayList(((iM2583 - 8) - iM2582) + 8);
                            int i25 = iM2582;
                            while (true) {
                                int i26 = 51836;
                                while (true) {
                                    i26 ^= 51853;
                                    switch (i26) {
                                        case 241:
                                            i26 = i25 < iM2583 ? 52580 : 52549;
                                            break;
                                        case 1963:
                                            break;
                                        case 1992:
                                            break;
                                        case 2025:
                                            m0.c cVar = (m0.c) C0233.m4486(arrayListM825, i25);
                                            cVar.f11464a = C0120.m2318(cVar) - (0 - i20);
                                            C0357.m6998(arrayList, cVar);
                                            int i27 = (C0072.f104 ^ 112) + i25;
                                            int i28 = 52611;
                                            while (true) {
                                                i28 ^= 52628;
                                                switch (i28) {
                                                    case 23:
                                                        i28 = 52642;
                                                        break;
                                                    case 54:
                                                        break;
                                                }
                                            }
                                            i25 = i27;
                                            break;
                                        default:
                                            break;
                                    }
                                    C0325.m6290(C0042.m825(q2Var2), C0134.m2582(C0042.m825(q2Var2), C0169.m3232(q2Var2), C0453.m8834(q2Var2)), arrayList);
                                    C0023.m462(C0343.m6729(arrayListM825, iM2582, iM2583));
                                    int i29 = 52735;
                                    while (true) {
                                        i29 ^= 52752;
                                        switch (i29) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                listM7500 = arrayList;
                                                break;
                                            case 1007:
                                                i29 = 52766;
                                                continue;
                                            default:
                                                continue;
                                        }
                                    }
                                }
                            }
                            break;
                        default:
                            break;
                    }
                }
                boolean zM9582 = C0492.m9582(listM7500);
                int i30 = 53510;
                while (true) {
                    i30 ^= 53527;
                    switch (i30) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i30 = ((((zM9582 ? 1 : 0) ^ '\uffff') & 1) | ((zM9582 ? 1 : 0) & '\ufffe')) != 0 ? 53603 : 53572;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 83:
                            break;
                        case 116:
                            HashMap mapM9459 = C0485.m9459(q2Var);
                            int i31 = 53634;
                            while (true) {
                                i31 ^= 53651;
                                switch (i31) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i31 = mapM9459 != null ? 53727 : 53696;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        C0485.m9459(q2Var2);
                                        int iM171 = C0008.m171(listM7500);
                                        int i32 = 0;
                                        while (true) {
                                            int i33 = i32;
                                            int i34 = 53758;
                                            while (true) {
                                                i34 ^= 53775;
                                                switch (i34) {
                                                    case 1009:
                                                        i34 = i33 < iM171 ? 54502 : 54471;
                                                        break;
                                                    case 1703:
                                                        break;
                                                    case 1736:
                                                        break;
                                                    case 1769:
                                                        i32 = (C0039.f59 ^ 823) + i33;
                                                        int i35 = 54533;
                                                        while (true) {
                                                            i35 ^= 54550;
                                                            switch (i35) {
                                                                case 19:
                                                                    i35 = 54564;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                boolean zM5272 = C0273.m5272(mapM9459);
                                                int i36 = 54657;
                                                while (true) {
                                                    i36 ^= 54674;
                                                    switch (i36) {
                                                        case 19:
                                                            i36 = zM5272 ? 55401 : 54719;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 3579:
                                                            q2Var.f11669e = null;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
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
                C0128.m2474(q2Var2);
                C0067.m1310(q2Var2, iM2474);
                int iM6324 = C0327.m6324(q2Var, C0351.m6889(q2Var), i10);
                int i37 = 55432;
                while (true) {
                    i37 ^= 55449;
                    switch (i37) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i37 = !z12 ? 55525 : 55494;
                            break;
                        case 62:
                            break;
                        case 95:
                            int i38 = 55680;
                            while (true) {
                                i38 ^= 55697;
                                switch (i38) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i38 = z10 ? 56424 : 56393;
                                        break;
                                    case 1467:
                                        break;
                                    case 1496:
                                        zM3489 = C0182.m3489(q2Var, i10, iM21);
                                        C0103.m2032(q2Var, iM6916, i12, ((i10 + 31) - 1) - 31);
                                        break;
                                    case 1529:
                                        int i39 = 56455;
                                        while (true) {
                                            i39 ^= 56472;
                                            switch (i39) {
                                                case 31:
                                                    i39 = iM6324 >= 0 ? 56548 : 56517;
                                                    break;
                                                case 62:
                                                    break;
                                                case 93:
                                                    z13 = false;
                                                    break;
                                                case 124:
                                                    z13 = true;
                                                    int i40 = 56579;
                                                    while (true) {
                                                        i40 ^= 56596;
                                                        switch (i40) {
                                                            case 23:
                                                                i40 = 56610;
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
                                        int i41 = 1507503;
                                        while (true) {
                                            i41 ^= 1507520;
                                            switch (i41) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    break;
                                                case 111:
                                                    i41 = z13 ? 1507596 : 1507565;
                                                    break;
                                                case 460:
                                                    C0468.m9120(q2Var);
                                                    C0257.m4916(q2Var, ((iM6324 - 29) - C0169.m3232(q2Var)) + 29);
                                                    C0468.m9120(q2Var);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        C0257.m4916(q2Var, ((i10 + 23) - C0169.m3232(q2Var)) - 23);
                                        boolean zM217 = C0011.m217(q2Var);
                                        int i42 = 1507627;
                                        while (true) {
                                            i42 ^= 1507644;
                                            switch (i42) {
                                                case 23:
                                                    i42 = z13 ? 1507720 : 1507689;
                                                    break;
                                                case 85:
                                                    break;
                                                case 118:
                                                    break;
                                                case 180:
                                                    C0016.m308(q2Var);
                                                    C0226.m4362(q2Var);
                                                    C0016.m308(q2Var);
                                                    C0226.m4362(q2Var);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        int i43 = 1507751;
                                        while (true) {
                                            i43 ^= 1507768;
                                            switch (i43) {
                                                case 31:
                                                    i43 = 1508433;
                                                    continue;
                                                case 1513:
                                                    zM3489 = zM217;
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
                        case 124:
                            zM3489 = 0;
                            int i44 = 55556;
                            while (true) {
                                i44 ^= 55573;
                                switch (i44) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i44 = 55587;
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
                int i45 = 1508526;
                while (true) {
                    i45 ^= 1508543;
                    switch (i45) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if ((((zM3489 ^ (-1)) & 1) | (zM3489 & (-2))) != 0) {
                                i45 = 1508619;
                            }
                            break;
                        case 83:
                            C0328.m6341(C0201.m3852(C0320.m6205(m6443(), 417, C0118.f144 ^ (-936), 2031)));
                            throw null;
                        case 114:
                            break;
                        case 436:
                            int iM3293 = C0172.m3293(q2Var2);
                            boolean zM577 = C0030.m577(iArrM6889, iM3232);
                            int i46 = 1508650;
                            while (true) {
                                i46 ^= 1508667;
                                switch (i46) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i46 = zM577 ? 1509394 : 1508712;
                                        break;
                                    case 83:
                                        iM9470 = C0486.m9470(iArrM6889, iM3232);
                                        break;
                                    case 114:
                                        break;
                                    case 3369:
                                        iM9470 = 1;
                                        int i47 = 1509425;
                                        while (true) {
                                            i47 ^= 1509442;
                                            switch (i47) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 115:
                                                    i47 = 1509456;
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
                            q2Var2.f11678n = (iM9470 + (iM3293 + 29)) - 29;
                            int i48 = 1509549;
                            while (true) {
                                i48 ^= 1509566;
                                switch (i48) {
                                    case 19:
                                        i48 = z11 ? 1509642 : 1509611;
                                        break;
                                    case 85:
                                        break;
                                    case 114:
                                        break;
                                    case 436:
                                        q2Var2.f11682r = i21;
                                        q2Var2.f11672h = 0 - ((0 - iM6649) - i12);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            int i49 = 1509673;
                            while (true) {
                                i49 ^= 1509690;
                                switch (i49) {
                                    case 19:
                                        if (objArr == true) {
                                            i49 = 1510417;
                                        }
                                        break;
                                    case 712:
                                        break;
                                    case 745:
                                        break;
                                    case 1323:
                                        C0220.m4240(q2Var2, iM2474);
                                        break;
                                    default:
                                        continue;
                                }
                                i49 = 1510386;
                            }
                            return listM7500;
                        default:
                            continue;
                    }
                    i45 = 1508588;
                }
            }
            int i50 = 49790;
            while (true) {
                i50 ^= 49807;
                switch (i50) {
                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        break;
                    case 51:
                        break;
                    case 84:
                        int i51 = ((C0137.f163 ^ 103) * i22) + (C0283.f428 ^ (-416));
                        iArrM6889[i51] = 0 - ((0 - iArrM6889[i51]) - i20);
                        break;
                    case 241:
                        i50 = i22 != iM3232 ? 49883 : 49852;
                        break;
                    default:
                        break;
                }
            }
            int iM6919 = C0353.m6916(q2Var2, iArrM6889, i22);
            int i52 = 49914;
            while (true) {
                i52 ^= 49931;
                switch (i52) {
                    case 497:
                        i52 = iM1160 < i22 ? 50658 : 50627;
                        break;
                    case 1711:
                        break;
                    case 1736:
                        iM7136 = C0363.m7136(q2Var2);
                        break;
                    case 1769:
                        iM7136 = 0;
                        int i53 = 50689;
                        while (true) {
                            i53 ^= 50706;
                            switch (i53) {
                                case 19:
                                    i53 = 50720;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                default:
                                    break;
                            }
                            break;
                        }
                        break;
                    default:
                        break;
                }
            }
            iArrM6889[((C0213.f237 ^ (-12)) * i22) + (C0026.f46 ^ (-317))] = C0393.m7712((iM6919 - 21) + ((iM6649 - 27) - iM6918) + 27 + 21, iM7136, iM8445, length);
            int i54 = 50813;
            while (true) {
                i54 ^= 50830;
                switch (i54) {
                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        break;
                    case 53:
                        break;
                    case 243:
                        i54 = i22 == iM1160 ? 51557 : 50875;
                        break;
                    case 4075:
                        iM1160 += C0477.f751 ^ 412;
                        break;
                    default:
                        break;
                }
            }
            i22 += C0063.f83 ^ (-821);
            int i55 = 51588;
            while (true) {
                i55 ^= 51605;
                switch (i55) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i55 = 51619;
                        break;
                    case 54:
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00bd A[SYNTHETIC] */
    public static Object e(c9.c cVar, c9.a aVar) {
        w0.i l0Var;
        w0.i iVarM7524;
        boolean z10;
        int i10;
        int i11;
        w0.c cVar2;
        int i12;
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (cVar == null) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    return C0260.m4986(aVar);
                case 239:
                    w0.i iVar = (w0.i) C0393.m7708(C0403.m7917());
                    int i14 = 1740;
                    while (true) {
                        i14 ^= 1757;
                        switch (i14) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i14 = iVar != null ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                z10 = iVar instanceof w0.c;
                                i10 = 49790;
                                while (true) {
                                    i10 ^= 49807;
                                    switch (i10) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 51:
                                            i11 = 50689;
                                            while (true) {
                                                i11 ^= 50706;
                                                switch (i11) {
                                                    case 19:
                                                        i11 = 50720;
                                                        continue;
                                                        continue;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        cVar2 = null;
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 84:
                                            cVar2 = (w0.c) iVar;
                                            break;
                                        case 241:
                                            i10 = z10 ? 49883 : 49852;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                i12 = 49914;
                                while (true) {
                                    i12 ^= 49931;
                                    switch (i12) {
                                        case 497:
                                            i12 = 50596;
                                            continue;
                                            continue;
                                        case 1711:
                                            l0Var = new w0.l0(cVar2, cVar, null, true, false);
                                            break;
                                        default:
                                            continue;
                                            continue;
                                    }
                                    try {
                                        iVarM7524 = C0383.m7524(l0Var);
                                        try {
                                            Object objM4986 = C0260.m4986(aVar);
                                            C0464.m9051(iVarM7524);
                                            C0355.m6978(l0Var);
                                            return objM4986;
                                        } catch (Throwable th) {
                                            C0464.m9051(iVarM7524);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        C0355.m6978(l0Var);
                                        throw th2;
                                    }
                                }
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean z11 = iVar instanceof w0.c;
                                int i15 = 1864;
                                while (true) {
                                    i15 ^= 1881;
                                    switch (i15) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i15 = z11 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            int i16 = 48891;
                                            while (true) {
                                                i16 ^= 48908;
                                                switch (i16) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        w0.i iVarM9218 = C0473.m9218(iVar, cVar);
                                                        int i17 = 49666;
                                                        while (true) {
                                                            i17 ^= 49683;
                                                            switch (i17) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i17 = 49697;
                                                                    continue;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    l0Var = iVarM9218;
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 503:
                                                        i16 = cVar == null ? 49635 : 48953;
                                                        break;
                                                    case 32495:
                                                        return C0260.m4986(aVar);
                                                    default:
                                                        break;
                                                }
                                            }
                                            iVarM7524 = C0383.m7524(l0Var);
                                            Object objM4987 = C0260.m4986(aVar);
                                            C0464.m9051(iVarM7524);
                                            C0355.m6978(l0Var);
                                            return objM4987;
                                        case 47417:
                                            int i18 = 48767;
                                            while (true) {
                                                i18 ^= 48784;
                                                switch (i18) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 239:
                                                        i18 = 48798;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                                z10 = iVar instanceof w0.c;
                                                i10 = 49790;
                                                while (true) {
                                                    i10 ^= 49807;
                                                    switch (i10) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 51:
                                                            i11 = 50689;
                                                            while (true) {
                                                                i11 ^= 50706;
                                                                switch (i11) {
                                                                    case 19:
                                                                        i11 = 50720;
                                                                        continue;
                                                                        continue;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        cVar2 = null;
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        case 84:
                                                            cVar2 = (w0.c) iVar;
                                                            break;
                                                        case 241:
                                                            if (z10) {
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                i12 = 49914;
                                                while (true) {
                                                    i12 ^= 49931;
                                                    switch (i12) {
                                                        case 497:
                                                            i12 = 50596;
                                                            continue;
                                                            continue;
                                                        case 1711:
                                                            l0Var = new w0.l0(cVar2, cVar, null, true, false);
                                                            break;
                                                        default:
                                                            continue;
                                                            continue;
                                                    }
                                                    iVarM7524 = C0383.m7524(l0Var);
                                                    Object objM4988 = C0260.m4986(aVar);
                                                    C0464.m9051(iVarM7524);
                                                    C0355.m6978(l0Var);
                                                    return objM4988;
                                                }
                                            }
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
                default:
                    continue;
            }
            i13 = 1678;
        }
    }

    public static w0.h f(s.i iVar) {
        C0403.m7917();
        C0256.m4900(C0414.m8133());
        synchronized (C0018.m367()) {
            w0.p.f16114g = C0147.m2821(C0163.m3118(), iVar);
        }
        return new w0.h(iVar, 0);
    }

    public static void g() {
        boolean z10;
        synchronized (C0018.m367()) {
            try {
                o0.d dVarM3302 = C0173.m3302((w0.b) C0490.m9542(C0208.m3986()));
                z10 = false;
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i10 = dVarM3302 != null ? 1709 : 1678;
                            break;
                        case 204:
                            boolean zM1040 = C0054.m1040(dVarM3302);
                            int i11 = 1740;
                            while (true) {
                                i11 ^= 1757;
                                switch (i11) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i11 = zM1040 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        int i12 = 1864;
                                        while (true) {
                                            i12 ^= 1881;
                                            switch (i12) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i12 = 48674;
                                                    continue;
                                                case 47483:
                                                    z10 = true;
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
            } catch (Throwable th) {
                int i13 = 48767;
                while (true) {
                    i13 ^= 48784;
                    switch (i13) {
                        case Code.UNAVAILABLE /* 14 */:
                            throw th;
                        case 239:
                            i13 = 48798;
                            break;
                    }
                }
            }
        }
        int i14 = 48891;
        while (true) {
            i14 ^= 48908;
            switch (i14) {
                case 22:
                    break;
                case 53:
                    return;
                case 503:
                    if (z10) {
                        i14 = 49635;
                    }
                    break;
                case 32495:
                    C0256.m4900(C0174.m3316());
                    return;
                default:
                    continue;
            }
            i14 = 48953;
        }
    }

    public static w0.c h(q.w wVar, u.s sVar) {
        w0.c cVar;
        w0.i iVarM3884 = C0202.m3884();
        boolean z10 = iVarM3884 instanceof w0.c;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = z10 ? 1709 : 1678;
                    break;
                case 204:
                    cVar = (w0.c) iVarM3884;
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    cVar = null;
                    break;
                default:
                    break;
            }
        }
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (cVar != null) {
                        i12 = 48736;
                    }
                    break;
                case 47384:
                    break;
                case 47417:
                    w0.c cVarM370 = C0019.m370(cVar, wVar, sVar);
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case 76:
                                return cVarM370;
                            case 239:
                                if (cVarM370 != null) {
                                    i13 = 48860;
                                }
                                break;
                            default:
                                continue;
                        }
                        i13 = 48829;
                    }
                    break;
                case 47483:
                    break;
                default:
                    continue;
            }
            i12 = 48705;
        }
        throw new IllegalStateException(C0201.m3852(C0063.m1214(m6443(), 445, C0062.f82 ^ 379, 2617)));
    }

    /* JADX INFO: renamed from: ۟ۤۦۢۡ, reason: not valid java name and contains not printable characters */
    public static short[] m6443() {
        int iM6072 = C0313.m6072();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6072 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f513short;
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

    public final String toString() {
        switch (C0291.m5609(this)) {
            case 2:
                return C0051.m1004(m6443(), 502, C0406.f677 ^ 846, 3138);
            default:
                return super.toString();
        }
    }
}
