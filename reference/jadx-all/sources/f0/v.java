package f0;

import a.C0000;
import a2.C0005;
import a3.C0006;
import a8.C0009;
import aa.C0011;
import aa.C0012;
import android.support.v4.app.C0014;
import android.support.v4.app.C0015;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.draw.C0028;
import androidx.compose.ui.node.C0037;
import c1.C0060;
import com.google.android.gms.common.util.C0086;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.iid.C0170;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0224;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.migration.C0240;
import e2.C0262;
import e7.C0265;
import f6.C0278;
import g.C0284;
import g0.C0286;
import h4.C0306;
import i.C0317;
import j5.C0328;
import java.util.List;
import l9.C0348;
import m5.C0356;
import n.C0362;
import o7.i2;
import p8.C0380;
import q7.C0390;
import q9.C0392;
import r2.C0395;
import r9.C0406;
import s0.C0410;
import u1.t2;
import u4.C0437;
import v9.C0453;
import w5.C0463;
import y6.C0477;
import z0.C0483;
import z3.C0486;

/* JADX INFO: loaded from: classes.dex */
public final class v extends d9.j implements c9.c {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f382short = {676, 685, 673, 695, 689, 655, 675, 684, 675, 677, 679, 688, 709, 706, 730, 717, 704, 709, 712, 652, 741, 705, 713, 749, 719, 728, 709, 707, 706};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f5972b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(c2 c2Var, int i10) {
        super(1);
        this.f5971a = i10;
        this.f5972b = c2Var;
        int iM1148 = C0060.m1148();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1148 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0011.m223("yZLqeV4X0HSMnahhlLu2c")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m5209() {
        int iM2684 = C0139.m2684();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2684 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f382short;
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

    @Override // c9.c
    public final Object invoke(Object obj) {
        boolean z10;
        c9.c cVarM5889;
        q8.l lVar;
        String strM5369;
        q8.l lVarM238 = C0012.m238();
        int iM2232 = C0116.m2232(this);
        c2 c2VarM9457 = C0486.m9457(this);
        switch (iM2232) {
            case 0:
                r1.s sVar = (r1.s) obj;
                d2 d2VarM9440 = C0486.m9440(c2VarM9457);
                int i10 = 1509549;
                while (true) {
                    i10 ^= 1509566;
                    switch (i10) {
                        case 19:
                            if (d2VarM9440 == null) {
                                i10 = 1509642;
                            }
                            break;
                        case 85:
                            d2VarM9440.f5669c = sVar;
                            return lVarM238;
                        case 114:
                            break;
                        case 436:
                            int i11 = 1509673;
                            while (true) {
                                i11 ^= 1509690;
                                switch (i11) {
                                    case 19:
                                        i11 = 1510355;
                                        break;
                                    case 745:
                                        return lVarM238;
                                }
                            }
                            break;
                        default:
                            continue;
                    }
                    i10 = 1509611;
                }
                break;
            case 1:
                C0037.m728(C0463.m9002(c2VarM9457), C0009.m192(C0000.m14((Boolean) obj)));
                return lVarM238;
            case 2:
                List list = (List) obj;
                d2 d2VarM9441 = C0486.m9440(c2VarM9457);
                int i12 = 1509425;
                while (true) {
                    i12 ^= 1509442;
                    switch (i12) {
                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            z10 = false;
                            break;
                        case 115:
                            i12 = d2VarM9441 != null ? 1509518 : 1509487;
                            break;
                        case 204:
                            d2 d2VarM9442 = C0486.m9440(c2VarM9457);
                            C0189.m3608(d2VarM9442);
                            C0348.m6795(list, C0362.m7085(d2VarM9442));
                            z10 = true;
                            break;
                        default:
                            break;
                    }
                }
                return C0009.m192(z10);
            case 3:
                int iM293 = C0015.m293((g2.n) obj);
                z0 z0VarM3116 = C0163.m3116(c2VarM9457);
                C0014.m280(z0VarM3116);
                int i13 = C0437.f707 ^ (-288);
                boolean zM9385 = C0483.m9385(iM293, i13);
                int i14 = C0390.f660 ^ 197;
                int i15 = 48891;
                while (true) {
                    i15 ^= 48908;
                    switch (i15) {
                        case 22:
                            break;
                        case 53:
                            boolean zM9386 = C0483.m9385(iM293, i14);
                            int i16 = 49790;
                            while (true) {
                                i16 ^= 49807;
                                switch (i16) {
                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 51:
                                        boolean zM9387 = C0483.m9385(iM293, 6);
                                        int i17 = 50689;
                                        while (true) {
                                            i17 ^= 50706;
                                            switch (i17) {
                                                case 19:
                                                    i17 = zM9387 ? 50782 : 50751;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    boolean zM9388 = C0483.m9385(iM293, 5);
                                                    int i18 = 51588;
                                                    while (true) {
                                                        i18 ^= 51605;
                                                        switch (i18) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i18 = zM9388 ? 51681 : 51650;
                                                                break;
                                                            case 54:
                                                                break;
                                                            case 87:
                                                                boolean zM9389 = C0483.m9385(iM293, C0286.f430 ^ (-869));
                                                                int i19 = 51836;
                                                                while (true) {
                                                                    i19 ^= 51853;
                                                                    switch (i19) {
                                                                        case 241:
                                                                            i19 = zM9389 ? 52580 : 52549;
                                                                            break;
                                                                        case 1963:
                                                                            break;
                                                                        case 1992:
                                                                            boolean zM93810 = C0483.m9385(iM293, C0395.f665 ^ 75);
                                                                            int i20 = 52735;
                                                                            while (true) {
                                                                                i20 ^= 52752;
                                                                                switch (i20) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                        boolean zM93811 = C0483.m9385(iM293, 1);
                                                                                        int i21 = 53634;
                                                                                        while (true) {
                                                                                            i21 ^= 53651;
                                                                                            switch (i21) {
                                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i21 = zM93811 ? 53727 : 53696;
                                                                                                    break;
                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                    break;
                                                                                                case 76:
                                                                                                    int i22 = 53758;
                                                                                                    while (true) {
                                                                                                        i22 ^= 53775;
                                                                                                        switch (i22) {
                                                                                                            case 1009:
                                                                                                                i22 = 54440;
                                                                                                                continue;
                                                                                                            case 1703:
                                                                                                                break;
                                                                                                            default:
                                                                                                                continue;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 83:
                                                                                                    boolean zM93812 = C0483.m9385(iM293, 0);
                                                                                                    int i23 = 54533;
                                                                                                    while (true) {
                                                                                                        i23 ^= 54550;
                                                                                                        switch (i23) {
                                                                                                            case 19:
                                                                                                                i23 = zM93812 ? 54626 : 54595;
                                                                                                                break;
                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                break;
                                                                                                            case 85:
                                                                                                                throw new IllegalStateException(C0201.m3852(C0477.m9301(m5209(), 12, C0138.f164 ^ (-549), 684)));
                                                                                                            case 116:
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
                                                                                        cVarM5889 = null;
                                                                                        break;
                                                                                    case 1007:
                                                                                        i20 = zM93810 ? 53479 : 52797;
                                                                                        break;
                                                                                    case 7927:
                                                                                        cVarM5889 = C0306.m5889(C0159.m3043(z0VarM3116));
                                                                                        int i24 = 53510;
                                                                                        while (true) {
                                                                                            i24 ^= 53527;
                                                                                            switch (i24) {
                                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i24 = 53541;
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
                                                                        case 2025:
                                                                            cVarM5889 = C0240.m4589(C0159.m3043(z0VarM3116));
                                                                            int i25 = 52611;
                                                                            while (true) {
                                                                                i25 ^= 52628;
                                                                                switch (i25) {
                                                                                    case 23:
                                                                                        i25 = 52642;
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
                                                            case 116:
                                                                cVarM5889 = C0005.m103(C0159.m3043(z0VarM3116));
                                                                int i26 = 51712;
                                                                while (true) {
                                                                    i26 ^= 51729;
                                                                    switch (i26) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case 15:
                                                                        case Code.UNAUTHENTICATED /* 16 */:
                                                                        default:
                                                                            continue;
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i26 = 51743;
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 76:
                                                    cVarM5889 = C0170.m3261(C0159.m3043(z0VarM3116));
                                                    int i27 = 50813;
                                                    while (true) {
                                                        i27 ^= 50830;
                                                        switch (i27) {
                                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 243:
                                                                i27 = 50844;
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
                                        break;
                                    case 84:
                                        cVarM5889 = C0028.m548(C0159.m3043(z0VarM3116));
                                        int i28 = 49914;
                                        while (true) {
                                            i28 ^= 49931;
                                            switch (i28) {
                                                case 497:
                                                    i28 = 50596;
                                                    continue;
                                                case 1711:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 241:
                                        i16 = zM9386 ? 49883 : 49852;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 503:
                            i15 = zM9385 ? 49635 : 48953;
                            break;
                        case 32495:
                            cVarM5889 = C0024.m472(C0159.m3043(z0VarM3116));
                            int i29 = 49666;
                            while (true) {
                                i29 ^= 49683;
                                switch (i29) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i29 = 49697;
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
                int i30 = 54657;
                while (true) {
                    i30 ^= 54674;
                    switch (i30) {
                        case 19:
                            i30 = cVarM5889 != null ? 55401 : 54719;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            lVar = null;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 3579:
                            C0224.m4297(cVarM5889, z0VarM3116);
                            int i31 = 55432;
                            while (true) {
                                i31 ^= 55449;
                                switch (i31) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i31 = 55463;
                                        continue;
                                    case 62:
                                        lVar = lVarM238;
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
                int i32 = 55556;
                while (true) {
                    i32 ^= 55573;
                    switch (i32) {
                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (lVar == null) {
                                i32 = 55649;
                            }
                            break;
                        case 54:
                            break;
                        case 87:
                            return lVarM238;
                        case 116:
                            boolean zM93813 = C0483.m9385(iM293, 6);
                            String strM8812 = C0453.m8812(m5209(), 0, C0410.f680 ^ (-390), 706);
                            int i33 = 55680;
                            while (true) {
                                i33 ^= 55697;
                                switch (i33) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (zM93813) {
                                            i33 = 56424;
                                        }
                                        break;
                                    case 1467:
                                        break;
                                    case 1496:
                                        boolean zM93814 = C0483.m9385(iM293, 5);
                                        int i34 = 1507503;
                                        while (true) {
                                            i34 ^= 1507520;
                                            switch (i34) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    boolean zM93815 = C0483.m9385(iM293, i13);
                                                    int i35 = 1508526;
                                                    while (true) {
                                                        i35 ^= 1508543;
                                                        switch (i35) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                if (zM93815) {
                                                                    i35 = 1508619;
                                                                }
                                                                break;
                                                            case 83:
                                                                return lVarM238;
                                                            case 114:
                                                                break;
                                                            case 436:
                                                                t2 t2VarM4996 = C0262.m4996(z0VarM3116);
                                                                int i36 = 1508650;
                                                                while (true) {
                                                                    i36 ^= 1508667;
                                                                    switch (i36) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (t2VarM4996 != null) {
                                                                                i36 = 1509394;
                                                                            }
                                                                            break;
                                                                        case 83:
                                                                            return lVarM238;
                                                                        case 114:
                                                                            break;
                                                                        case 3369:
                                                                            C0392.m7655((g2.e0) C0022.m427(C0016.m309((u1.u1) t2VarM4996)), C0284.m5465());
                                                                            return lVarM238;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                    i36 = 1508712;
                                                                }
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                        i35 = 1508588;
                                                    }
                                                    break;
                                                case 111:
                                                    if (zM93814) {
                                                        i34 = 1507596;
                                                    }
                                                    break;
                                                case 460:
                                                    c1.e eVarM5060 = C0265.m5060(z0VarM3116);
                                                    int i37 = 1507627;
                                                    while (true) {
                                                        i37 ^= 1507644;
                                                        switch (i37) {
                                                            case 23:
                                                                if (eVarM5060 != null) {
                                                                    i37 = 1507720;
                                                                }
                                                                break;
                                                            case 85:
                                                                C0156.m2979(strM8812);
                                                                throw null;
                                                            case 118:
                                                                break;
                                                            case 180:
                                                                C0406.m7959((c1.f) eVarM5060, i14);
                                                                int i38 = 1507751;
                                                                while (true) {
                                                                    i38 ^= 1507768;
                                                                    switch (i38) {
                                                                        case 31:
                                                                            i38 = 1508433;
                                                                            break;
                                                                        case 1513:
                                                                            return lVarM238;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                        i37 = 1507689;
                                                    }
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i34 = 1507565;
                                        }
                                        break;
                                    case 1529:
                                        c1.e eVarM5061 = C0265.m5060(z0VarM3116);
                                        int i39 = 56455;
                                        while (true) {
                                            i39 ^= 56472;
                                            switch (i39) {
                                                case 31:
                                                    if (eVarM5061 != null) {
                                                        i39 = 56548;
                                                    }
                                                    break;
                                                case 62:
                                                    break;
                                                case 93:
                                                    C0156.m2979(strM8812);
                                                    throw null;
                                                case 124:
                                                    C0406.m7959((c1.f) eVarM5061, 1);
                                                    int i40 = 56579;
                                                    while (true) {
                                                        i40 ^= 56596;
                                                        switch (i40) {
                                                            case 23:
                                                                i40 = 56610;
                                                                break;
                                                            case 54:
                                                                return lVarM238;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i39 = 56517;
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i33 = 56393;
                            }
                            break;
                        default:
                            continue;
                    }
                    i32 = 55618;
                }
                break;
            default:
                g2.a0 a0Var = (g2.a0) obj;
                String strM53610 = C0278.m5369(C0143.m2754(a0Var));
                a2.e eVarM7451 = C0380.m7451(c2VarM9457);
                int i41 = 1616;
                while (true) {
                    i41 ^= 1633;
                    switch (i41) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i41 = eVarM7451 != null ? 1709 : 1678;
                            break;
                        case 204:
                            strM5369 = C0278.m5369(eVarM7451);
                            int i42 = 1740;
                            while (true) {
                                i42 ^= 1757;
                                switch (i42) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i42 = 1771;
                                        continue;
                                    case 54:
                                        break;
                                    default:
                                        continue;
                                }
                            }
                            break;
                        case 239:
                            strM5369 = null;
                            break;
                        default:
                            break;
                    }
                }
                boolean zM4399 = C0229.m4399(strM53610, strM5369);
                int i43 = 1864;
                while (true) {
                    i43 ^= 1881;
                    switch (i43) {
                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i43 = !zM4399 ? 48736 : 48705;
                            break;
                        case 47384:
                            break;
                        case 47417:
                            C0037.m728(C0356.m6974(c2VarM9457), C0006.m113());
                            break;
                        case 47483:
                            break;
                        default:
                            break;
                    }
                }
                C0224.m4297(C0150.m2890(c2VarM9457), a0Var);
                m0.x1 x1Var = (m0.x1) C0328.m6322(c2VarM9457);
                m0.y1 y1VarM1845 = C0086.m1845(x1Var);
                int i44 = 48767;
                while (true) {
                    i44 ^= 48784;
                    switch (i44) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            return lVarM238;
                        case 76:
                            C0317.m6124(y1VarM1845, x1Var, null);
                            return lVarM238;
                        case 239:
                            if (y1VarM1845 != null) {
                                i44 = 48860;
                            }
                            break;
                        default:
                            continue;
                    }
                    i44 = 48829;
                }
                break;
        }
    }
}
