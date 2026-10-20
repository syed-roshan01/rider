package f5;

import a.C0001;
import a2.C0005;
import aa.C0012;
import androidx.appcompat.widget.C0020;
import androidx.compose.ui.draw.C0028;
import androidx.compose.ui.graphics.C0030;
import androidx.profileinstaller.C0045;
import b7.C0053;
import com.auto.accept.data.model.UserProfile;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.C0075;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.tasks.C0103;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.components.C0134;
import com.google.firebase.components.C0135;
import com.google.firebase.emulators.C0140;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.measurement.C0183;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import d1.C0213;
import d9.C0226;
import dagger.hilt.android.components.C0228;
import dagger.hilt.codegen.C0242;
import dagger.hilt.internal.C0254;
import dagger.hilt.internal.componenttreedeps.C0249;
import f1.C0274;
import f4.C0276;
import f4.C0277;
import f6.C0278;
import g.C0283;
import h0.C0300;
import h1.C0301;
import h8.C0315;
import j9.C0330;
import o7.i2;
import okhttp3.internal.publicsuffix.C0373;
import p4.C0377;
import p8.C0381;
import p9.q0;
import q0.C0383;
import q9.C0392;
import r2.C0395;
import r5.C0401;
import s0.C0410;
import t1.C0420;
import t7.C0426;
import t9.C0428;
import v.C0440;
import v0.C0441;
import v6.C0447;
import w2.C0457;
import w4.C0462;
import x2.C0468;

/* JADX INFO: loaded from: classes.dex */
public final class j extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f406short = {8339, -659, 834, 769, 778, 775, 769, 777, 803, 791, 790, 778, 817, 790, 771, 790, 775, 856, 834, 791, 779, 774, 863, 12258, -3556, 3123, 3184, 3195, 3190, 3184, 3192, 3154, 3174, 3175, 3195, 3136, 3175, 3186, 3175, 3190, 3123, 3136, 3143, 3154, 3137, 3143, 3135, 3123, 3194, 3168, 3167, 3196, 3188, 3188, 3190, 3191, 3162, 3197, 3118, 1186, 1206, 1185, 1185, 1214, 1185, 1211, 1184, 1185, 1190, 1201, 1187, 9367, -1687, 1862, 1797, 1806, 1795, 1797, 1805, 1831, 1811, 1810, 1806, 1845, 1810, 1799, 1810, 1795, 1884, 1862, 1832, 1833, 1842, 1862, 1802, 1801, 1793, 1793, 1795, 1794, 1862, 1807, 1800, 1862, 9972, 1862, 1834, 1801, 1793, 1793, 1795, 1794, 1833, 1811, 1810, 8479, -799, 718, 653, 646, 651, 653, 645, 687, 667, 666, 646, 701, 666, 655, 666, 651, 724, 718, 667, 647, 650, 718, 672, 699, 674, 674, 718, 9084, 718, 674, 641, 649, 649, 651, 650, 673, 667, 666, 353, 365, 302, 293, 296, 302, 294, 292, 291, 298, 365, 291, 296, 313, 314, 290, 319, 294, 355, 355, 355, 8767, -63, 494, 429, 422, 427, 429, 421, 399, 443, 442, 422, 413, 442, 431, 442, 427, 500, 494, 384, 385, 494, 391, 384, 410, 395, 412, 384, 395, 410, 494, 8284, 494, 386, 417, 425, 425, 427, 426, 391, 416, 494, 486, 417, 424, 424, 418, 423, 416, 427, 487, 738, 708, 722, 709, 545, 515, 532, 521, 534, 517, 9744, -1042, 1473, 1410, 1417, 1412, 1410, 1418, 1440, 1428, 1429, 1417, 1458, 1429, 1408, 1429, 1412, 1499, 1473, 1423, 1412, 1429, 1430, 1422, 1427, 1418, 1473, 1454, 1450, 1473, 9331, 1473, 1410, 1408, 1421, 1421, 1416, 1423, 1414, 1473, 1422, 1411, 1426, 1412, 1427, 1431, 1412, 1460, 1426, 1412, 1427, 1457, 1427, 1422, 1415, 1416, 1421, 1412, 11187, -2483, 2146, 2081, 2090, 2087, 2081, 2089, 2051, 2103, 2102, 2090, 2065, 2102, 2083, 2102, 2087, 2168, 2146, 2093, 2080, 2097, 2087, 2096, 2100, 2087, 2071, 2097, 2087, 2096, 2066, 2096, 2093, 2084, 2091, 2094, 2087, 2146, 2054, 2059, 2065, 2066, 2051, 2070, 2049, 2058, 2055, 2054, 8199, -519, 982, 917, 926, 915, 917, 925, 951, 899, 898, 926, 933, 898, 919, 898, 915, 982, 947, 932, 932, 953, 932, 972, 982, 2391, 2417, 2407, 2416, 3025, 3059, 3044, 3065, 3046, 3061};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f6277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f6278b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MainViewModel mainViewModel, u8.e eVar) {
        super(C0426.f696 ^ (-339), eVar);
        this.f6278b = mainViewModel;
        int iM2938 = C0153.m2938();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2938 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0440.m8583("hOS")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۢ, reason: not valid java name and contains not printable characters */
    public static short[] m5342() {
        int iM7309 = C0373.m7309();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7309 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f406short;
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

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        MainViewModel mainViewModelM2697 = null;
        String str = "ۥۤۤ";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746691:
                    this = new j(mainViewModelM2697, eVar);
                    str = "ۣۧۨ";
                    break;
                case 1752613:
                    mainViewModelM2697 = C0140.m2697(this);
                    str = "ۣ۟۟";
                    break;
                case 1755590:
                    return this;
                default:
                    this.f6277a = obj;
                    str = "ۨۧۥ";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "۟ۥۦ";
        u8.e eVar = null;
        q8.l lVarM238 = null;
        Object objM7385 = obj;
        m9.d0 d0Var = null;
        u8.e eVarM8891 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746880:
                    str = "ۣ۠ۢ";
                    d0Var = (m9.d0) objM7385;
                    break;
                case 1749571:
                    objM7385 = C0377.m7385(this, lVarM238);
                    str = "ۣۤۤ";
                    break;
                case 1750565:
                    str = "ۣ۠ۥ";
                    eVar = (u8.e) obj2;
                    break;
                case 1751651:
                    return objM7385;
                case 1753607:
                    str = "ۢ۟۠";
                    lVarM238 = C0012.m238();
                    break;
                case 1753631:
                    str = "ۦۥۦ";
                    this = (j) eVarM8891;
                    break;
                default:
                    eVarM8891 = C0457.m8891(this, d0Var, eVar);
                    str = "ۦۦ۟";
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:223:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x020e A[SYNTHETIC] */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        String strM7836;
        String strM7837;
        String strM3496;
        int i10;
        String strM8581 = C0440.m8581();
        f fVarM4838 = C0254.m4838();
        q8.l lVarM238 = C0012.m238();
        String strM3711 = C0194.m3711(m5342(), 0, C0134.f160 ^ (-842), 866);
        C0300.m5766();
        C0330.m6365(obj);
        MainViewModel mainViewModelM2697 = C0140.m2697(this);
        a5.j jVarM7458 = C0381.m7458(mainViewModelM2697);
        q0 q0VarM4345 = C0226.m4345(mainViewModelM2697);
        a5.j jVarM7459 = C0381.m7458(mainViewModelM2697);
        boolean zM5293 = C0276.m5293(jVarM7458);
        StringBuilder sb = new StringBuilder(C0283.m5456(m5342(), 23, C0420.f690 ^ 126, 3091));
        C0030.m585(sb, zM5293);
        C0441.m8605(sb);
        C0315.m6078(m5342(), 59, C0001.f769 ^ (-990), 1252);
        try {
            boolean zM5294 = C0276.m5293(jVarM7459);
            int i11 = 1616;
            while (true) {
                i11 ^= 1633;
                switch (i11) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i11 = !zM5294 ? 1709 : 1678;
                        break;
                    case 204:
                        C0242.m4619(m5342(), 71, C0392.f662 ^ 783, 1894);
                        C0228.m4382(q0VarM4345, fVarM4838);
                        break;
                    case 239:
                        String strM5791 = C0301.m5791(jVarM7459);
                        int i12 = 1864;
                        while (true) {
                            i12 ^= 1881;
                            switch (i12) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = strM5791 == null ? 48736 : 48705;
                                    break;
                                case 47384:
                                    StringBuilder sb2 = new StringBuilder(strM3711);
                                    C0142.m2728(sb2, strM5791);
                                    C0142.m2728(sb2, C0028.m554(m5342(), 154, C0073.f107 ^ (-904), 333));
                                    C0441.m8605(sb2);
                                    boolean zM2600 = C0135.m2600(mainViewModelM2697);
                                    int i13 = 48767;
                                    while (true) {
                                        i13 ^= 48784;
                                        switch (i13) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                C0053.m1023(m5342(), 236, C0001.f769 ^ (-1004), 1505);
                                                C0468.m9105(mainViewModelM2697, strM5791);
                                                C0162.m3093(m5342(), 294, C0277.f392 ^ (-74), 2114);
                                                int i14 = 52611;
                                                while (true) {
                                                    i14 ^= 52628;
                                                    switch (i14) {
                                                        case 23:
                                                            i14 = 52642;
                                                            continue;
                                                        case 54:
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    break;
                                                }
                                                break;
                                            case 76:
                                                C0410.m8030(m5342(), 175, C0428.f698 ^ 449, 462);
                                                FirebaseUser firebaseUserM5359 = C0278.m5359(C0020.m402(jVarM7459));
                                                int i15 = 48891;
                                                while (true) {
                                                    i15 ^= 48908;
                                                    switch (i15) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            strM7837 = strM8581;
                                                            break;
                                                        case 503:
                                                            i15 = firebaseUserM5359 != null ? 49635 : 48953;
                                                            break;
                                                        case 32495:
                                                            strM7837 = C0401.m7836(firebaseUserM5359);
                                                            int i16 = 49666;
                                                            while (true) {
                                                                i16 ^= 49683;
                                                                switch (i16) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i16 = strM7837 == null ? 49759 : 49728;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 76:
                                                                        int i17 = 49790;
                                                                        while (true) {
                                                                            i17 ^= 49807;
                                                                            switch (i17) {
                                                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case 241:
                                                                                    i17 = 49821;
                                                                                    continue;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                            strM7837 = strM8581;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case 83:
                                                                        int i18 = 49914;
                                                                        while (true) {
                                                                            i18 ^= 49931;
                                                                            switch (i18) {
                                                                                case 497:
                                                                                    i18 = 50596;
                                                                                    continue;
                                                                                case 1711:
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
                                                FirebaseUser firebaseUserM53510 = C0278.m5359(C0020.m402(jVarM7459));
                                                int i19 = 50689;
                                                while (true) {
                                                    i19 ^= 50706;
                                                    switch (i19) {
                                                        case 19:
                                                            i19 = firebaseUserM53510 != null ? 50782 : 50751;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            strM3496 = C0183.m3496(m5342(), 226, C0249.f328 ^ 57, 695);
                                                            i10 = 51836;
                                                            while (true) {
                                                                i10 ^= 51853;
                                                                switch (i10) {
                                                                    case 241:
                                                                        i10 = 52518;
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
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 76:
                                                            strM3496 = C0117.m2263(firebaseUserM53510);
                                                            int i20 = 50813;
                                                            while (true) {
                                                                i20 ^= 50830;
                                                                switch (i20) {
                                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 53:
                                                                        break;
                                                                    case 243:
                                                                        i20 = strM3496 == null ? 51557 : 50875;
                                                                        break;
                                                                    case 4075:
                                                                        int i21 = 51588;
                                                                        while (true) {
                                                                            i21 ^= 51605;
                                                                            switch (i21) {
                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i21 = 51619;
                                                                                    continue;
                                                                                case 54:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                            strM3496 = C0183.m3496(m5342(), 226, C0249.f328 ^ 57, 695);
                                                                            i10 = 51836;
                                                                            while (true) {
                                                                                i10 ^= 51853;
                                                                                switch (i10) {
                                                                                    case 241:
                                                                                        i10 = 52518;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 1963:
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
                                                    int i22 = 51712;
                                                    while (true) {
                                                        i22 ^= 51729;
                                                        switch (i22) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                C0228.m4382(q0VarM4345, new e(new UserProfile(strM3496, strM7837, C0103.m2009(m5342(), 230, C0383.f653 ^ 811, 608), true, true, false, C0440.m8581(), null, 0L, false, null, C0395.f665 ^ 1999, null)));
                                                                break;
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i22 = 51743;
                                                                break;
                                                        }
                                                    }
                                                }
                                                break;
                                            case 239:
                                                i13 = !zM2600 ? 48860 : 48829;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case 47417:
                                    C0447.m8698(m5342(), 115, C0045.f65 ^ 98, 750);
                                    C0228.m4382(q0VarM4345, fVarM4838);
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
                return lVarM238;
            }
        } catch (Exception e4) {
            int i23 = 1740;
            while (true) {
                i23 ^= 1757;
                switch (i23) {
                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i23 = 1771;
                        continue;
                    case 54:
                        String strM4049 = C0213.m4049(e4);
                        StringBuilder sb3 = new StringBuilder(C0075.m1636(m5342(), 342, C0274.f389 ^ 445, 1014));
                        C0142.m2728(sb3, strM4049);
                        C0441.m8605(sb3);
                        boolean zM5295 = C0276.m5293(jVarM7459);
                        int i24 = 52735;
                        while (true) {
                            i24 ^= 52752;
                            switch (i24) {
                                case Code.UNAVAILABLE /* 14 */:
                                    i24 = 52797;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    C0228.m4382(q0VarM4345, fVarM4838);
                                    break;
                                case 1007:
                                    if (zM5295) {
                                        i24 = 53479;
                                        continue;
                                    } else {
                                        i24 = 52797;
                                    }
                                    break;
                                case 7927:
                                    FirebaseUser firebaseUserM53511 = C0278.m5359(C0020.m402(jVarM7459));
                                    int i25 = 53510;
                                    while (true) {
                                        i25 ^= 53527;
                                        switch (i25) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i25 = firebaseUserM53511 != null ? 53603 : 53572;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 83:
                                                strM7836 = strM8581;
                                                break;
                                            case 116:
                                                strM7836 = C0401.m7836(firebaseUserM53511);
                                                int i26 = 53634;
                                                while (true) {
                                                    i26 ^= 53651;
                                                    switch (i26) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i26 = strM7836 == null ? 53727 : 53696;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 76:
                                                            int i27 = 53758;
                                                            while (true) {
                                                                i27 ^= 53775;
                                                                switch (i27) {
                                                                    case 1009:
                                                                        i27 = 54440;
                                                                        continue;
                                                                    case 1703:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                                strM7836 = strM8581;
                                                                break;
                                                            }
                                                            break;
                                                        case 83:
                                                            int i28 = 54533;
                                                            while (true) {
                                                                i28 ^= 54550;
                                                                switch (i28) {
                                                                    case 19:
                                                                        i28 = 54564;
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
                                    C0228.m4382(q0VarM4345, new e(new UserProfile(C0196.m3766(m5342(), 367, C0462.f732 ^ 857, 2306), strM7836, C0111.m2138(m5342(), 371, C0168.f192 ^ 950, 2960), true, true, false, C0440.m8581(), null, 0L, false, null, C0005.f1063 ^ 1416, null)));
                                    int i29 = 54657;
                                    while (true) {
                                        i29 ^= 54674;
                                        switch (i29) {
                                            case 19:
                                                i29 = 54688;
                                                continue;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                        continue;
                }
            }
        }
    }
}
