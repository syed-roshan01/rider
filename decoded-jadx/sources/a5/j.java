package a5;

import aa.C0012;
import androidx.activity.C0017;
import androidx.appcompat.widget.C0020;
import androidx.compose.ui.graphics.C0031;
import c1.C0059;
import c3.C0063;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.client.C0108;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.C0128;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.components.C0135;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.iid.C0170;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement.C0181;
import com.google.firebase.measurement.C0183;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.C0240;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import dagger.hilt.android.internal.migration.C0232;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.codegen.C0241;
import dagger.hilt.internal.C0253;
import e7.C0264;
import f.C0269;
import f4.C0276;
import f6.C0277;
import g2.C0286;
import h.C0296;
import h0.C0299;
import h1.C0300;
import h4.C0305;
import h5.C0306;
import h5.C0308;
import j5.C0327;
import j6.C0328;
import j9.C0329;
import k3.C0335;
import m0.C0349;
import m1.C0350;
import n9.C0366;
import o2.C0368;
import o7.i2;
import p4.C0376;
import q7.C0390;
import r.C0392;
import r5.C0399;
import r5.C0400;
import t3.C0424;
import t8.C0426;
import t9.C0427;
import v0.C0440;
import v0.C0441;
import v8.C0450;
import v9.C0451;
import y.C0475;
import y9.C0479;
import z0.C0482;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f17short = {2768, 2770, 2755, 2814, 2777, 2756, 2755, 2774, 2777, 2772, 2770, 2719, 2713, 2713, 2713, 2718, 3294, 3292, 3281, 3281, 3229, 3273, 3282, 3229, 3226, 3279, 3288, 3278, 3272, 3280, 3288, 3226, 3229, 3295, 3288, 3291, 3282, 3279, 3288, 3229, 3226, 3284, 3283, 3275, 3282, 3286, 3288, 3226, 3229, 3274, 3284, 3273, 3285, 3229, 3294, 3282, 3279, 3282, 3272, 3273, 3284, 3283, 3288, 3320, 3289, 3222, 3267, 3269, 3283, 3268, 3222, 3290, 3289, 3281, 3281, 3283, 3282, 3222, 3295, 3288, 774, 807, 872, 813, 805, 809, 801, 804, 872, 814, 807, 829, 806, 812, 1370, 1368, 1353, 1406, 1359, 1368, 1369, 1368, 1363, 1353, 1364, 1372, 1361, 1301, 1299, 1299, 1299, 1300, 2969, 2958, 2954, 2974, 2975, 2947, 2958, 2949, 2975, 2946, 2952, 2954, 2975, 2958, 3011, 3013, 3013, 3013, 3010, 1772, 1774, 1763, 1763, 1711, 1787, 1760, 1711, 1704, 1789, 1770, 1788, 1786, 1762, 1770, 1704, 1711, 1773, 1770, 1769, 1760, 1789, 1770, 1711, 1704, 1766, 1761, 1785, 1760, 1764, 1770, 1704, 1711, 1784, 1766, 1787, 1767, 1711, 1772, 1760, 1789, 1760, 1786, 1787, 1766, 1761, 1770, 1157, 1171, 1176, 1170, 1190, 1175, 1157, 1157, 1153, 1177, 1156, 1170, 1188, 1171, 1157, 1171, 1154, 1203, 1179, 1175, 1183, 1178, 1246, 1240, 1240, 1240, 1247, 3036, 3038, 3027, 3027, 2975, 3019, 3024, 2975, 2968, 3021, 3034, 3020, 3018, 3026, 3034, 2968, 2975, 3037, 3034, 3033, 3024, 3021, 3034, 2975, 2968, 3030, 3025, 3017, 3024, 3028, 3034, 2968, 2975, 3016, 3030, 3019, 3031, 2975, 3036, 3024, 3021, 3024, 3018, 3019, 3030, 3025, 3034, 1000, 1010, 1020, 1013, 978, 1013, 972, 1010, 1007, 1011, 990, 1014, 1018, 1010, 1015, 986, 1013, 1023, 971, 1018, 1000, 1000, 1004, 1012, 1001, 1023, 947, 949, 949, 949, 946, 1019, 984, 976, 990, 985, 919, 977, 982, 990, 987, 978, 979, 909, 919, 962, 964, 978, 965, 919, 990, 964, 919, 985, 962, 987, 987, 2913, 2915, 2926, 2926, 2850, 2934, 2925, 2850, 2853, 2928, 2919, 2929, 2935, 2927, 2919, 2853, 2850, 2912, 2919, 2916, 2925, 2928, 2919, 2850, 2853, 2923, 2924, 2932, 2925, 2921, 2919, 2853, 2850, 2933, 2923, 2934, 2922, 2850, 2913, 2925, 2928, 2925, 2935, 2934, 2923, 2924, 2919, 1634, 1651, 1636, 1632, 1653, 1636, 1620, 1650, 1636, 1651, 1622, 1640, 1653, 1641, 1604, 1644, 1632, 1640, 1645, 1600, 1647, 1637, 1617, 1632, 1650, 1650, 1654, 1646, 1651, 1637, 1577, 1583, 1583, 1583, 1576, 1996, 2038, 2040, 2033, 2026, 2031, 1983, 2041, 2046, 2038, 2035, 2042, 2043, 1957, 1983, 2026, 2028, 2042, 2029, 1983, 2038, 2028, 1983, 2033, 2026, 2035, 2035, 838, 836, 841, 841, 773, 849, 842, 773, 770, 855, 832, 854, 848, 840, 832, 770, 773, 839, 832, 835, 842, 855, 832, 773, 770, 844, 843, 851, 842, 846, 832, 770, 773, 850, 844, 849, 845, 773, 838, 842, 855, 842, 848, 849, 844, 843, 832, 3122, 3091, 3164, 3081, 3087, 3097, 3086, 3164, 3088, 3091, 3099, 3099, 3097, 3096, 3164, 3093, 3090, 1700, 1719, 1696, 1723, 1716, 1707, 1680, 1719, 1716, 1725, 1696, 1719, 1671, 1698, 1718, 1715, 1702, 1719, 1687, 1727, 1715, 1723, 1726, 1786, 1788, 1788, 1788, 1787, 1313, 1315, 1326, 1326, 1378, 1334, 1325, 1378, 1381, 1328, 1319, 1329, 1335, 1327, 1319, 1381, 1378, 1312, 1319, 1316, 1325, 1328, 1319, 1378, 1381, 1323, 1324, 1332, 1325, 1321, 1319, 1381, 1378, 1333, 1323, 1334, 1322, 1378, 1313, 1325, 1328, 1325, 1335, 1334, 1323, 1324, 1319, 1713, 1680, 1759, 1674, 1676, 1690, 1677, 1759, 1683, 1680, 1688, 1688, 1690, 1691, 1759, 1686, 1681};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseAuth f1276a;

    public j() {
        FirebaseAuth firebaseAuthM8614 = C0441.m8614();
        C0335.m6501(firebaseAuthM8614, C0368.m7218(m134(), 0, C0440.f711 ^ (-866), 2743));
        this.f1276a = firebaseAuthM8614;
        int iM4609 = C0240.m4609();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4609 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0296.m5698("ft2bfWLP5S2iuPg9E9SfOmZGj4H1")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۥۦۢ۟, reason: contains not printable characters */
    public static short[] m134() {
        int iM2475 = C0128.m2475();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2475 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f17short;
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

    public final String a() {
        FirebaseUser firebaseUserM5359 = C0277.m5359(C0020.m402(this));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (firebaseUserM5359 != null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    String strM8790 = C0450.m8790(firebaseUserM5359);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return strM8790;
                        }
                    }
                    break;
                case 239:
                    return null;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final boolean b() {
        FirebaseUser firebaseUserM5359 = C0277.m5359(C0020.m402(this));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (firebaseUserM5359 != null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return true;
                        }
                    }
                    break;
                case 239:
                    return false;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final Object c(String str, u8.e eVar) {
        d dVar;
        boolean z10 = eVar instanceof d;
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
                    dVar = (d) eVar;
                    int iM3529 = C0185.m3529(dVar);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = ((Integer.MAX_VALUE ^ iM3529) & iM3529) != 0 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                dVar = new d(this, eVar);
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                dVar.f1238c = ((iM3529 + 8) - Integer.MIN_VALUE) - 8;
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = 48674;
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
                    dVar = new d(this, eVar);
                    break;
                default:
                    break;
            }
        }
        Object objM8323 = C0424.m8323(dVar);
        v8.a aVarM5766 = C0299.m5766();
        int iM35210 = C0185.m3529(dVar);
        int i13 = 48767;
        while (true) {
            i13 ^= 48784;
            try {
                switch (i13) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        C0329.m6365(objM8323);
                        FirebaseUser firebaseUserM5359 = C0277.m5359(C0020.m402(this));
                        int i14 = 49914;
                        while (true) {
                            i14 ^= 49931;
                            switch (i14) {
                                case 497:
                                    i14 = firebaseUserM5359 == null ? 50658 : 50627;
                                    break;
                                case 1711:
                                    break;
                                case 1736:
                                    String strM7836 = C0400.m7836(firebaseUserM5359);
                                    int i15 = 50689;
                                    while (true) {
                                        i15 ^= 50706;
                                        switch (i15) {
                                            case 19:
                                                i15 = strM7836 == null ? 50782 : 50751;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                AuthCredential authCredentialM1212 = C0063.m1212(strM7836, str);
                                                C0335.m6501(authCredentialM1212, C0108.m2094(m134(), 94, C0276.f392 ^ (-108), 1341));
                                                Task taskM4636 = C0241.m4636(firebaseUserM5359, authCredentialM1212);
                                                C0335.m6501(taskM4636, C0490.m9556(m134(), 112, C0089.f123 ^ 409, 3051));
                                                dVar.f1238c = 1;
                                                Object objM3126 = C0163.m3126(taskM4636, dVar);
                                                int i16 = 50813;
                                                while (true) {
                                                    i16 ^= 50830;
                                                    switch (i16) {
                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 53:
                                                            break;
                                                        case 243:
                                                            i16 = objM3126 == aVarM5766 ? 51557 : 50875;
                                                            break;
                                                        case 4075:
                                                            return aVarM5766;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                return C0195.m3728(new Exception(C0228.m4396(m134(), 80, C0327.f475 ^ (-805), 840)));
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case 1769:
                                    return C0195.m3728(new Exception(C0296.m5708(m134(), 63, C0031.f51 ^ (-137), 3254)));
                                default:
                                    break;
                            }
                        }
                        break;
                    case 76:
                        int i17 = 48891;
                        while (true) {
                            i17 ^= 48908;
                            switch (i17) {
                                case 22:
                                    break;
                                case 53:
                                    throw new IllegalStateException(C0234.m4516(m134(), 16, C0427.f698 ^ 477, 3261));
                                case 503:
                                    i17 = iM35210 == 1 ? 49635 : 48953;
                                    break;
                                case 32495:
                                    C0329.m6365(objM8323);
                                    int i18 = 49666;
                                    while (true) {
                                        i18 ^= 49683;
                                        switch (i18) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i18 = 49697;
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
                    case 239:
                        i13 = iM35210 != 0 ? 48860 : 48829;
                        break;
                    default:
                        break;
                }
            } catch (Exception e4) {
                int i19 = 49790;
                while (true) {
                    i19 ^= 49807;
                    switch (i19) {
                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            return C0195.m3728(e4);
                        case 241:
                            i19 = 49821;
                            break;
                    }
                }
            }
        }
        q8.l lVarM238 = C0012.m238();
        int i20 = 51588;
        while (true) {
            i20 ^= 51605;
            switch (i20) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i20 = 51619;
                    break;
                case 54:
                    return lVarM238;
            }
        }
    }

    public final Object d(String str, u8.e eVar) {
        e eVar2;
        boolean z10 = eVar instanceof e;
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
                    eVar2 = (e) eVar;
                    int iM7191 = C0366.m7191(eVar2);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = ((Integer.MAX_VALUE ^ iM7191) & iM7191) != 0 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                eVar2 = new e(this, eVar);
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                eVar2.f1249c = ((iM7191 - 26) - Integer.MIN_VALUE) + 26;
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = 48674;
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
                    eVar2 = new e(this, eVar);
                    break;
                default:
                    break;
            }
        }
        Object objM7644 = C0390.m7644(eVar2);
        v8.a aVarM5766 = C0299.m5766();
        int iM7192 = C0366.m7191(eVar2);
        int i13 = 48767;
        while (true) {
            i13 ^= 48784;
            try {
                switch (i13) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        C0329.m6365(objM7644);
                        Task taskM2525 = C0131.m2525(C0020.m402(this), str);
                        C0335.m6501(taskM2525, C0426.m8363(m134(), 178, C0111.f137 ^ (-796), 1270));
                        eVar2.f1249c = 1;
                        Object objM3126 = C0163.m3126(taskM2525, eVar2);
                        int i14 = 49914;
                        while (true) {
                            i14 ^= 49931;
                            switch (i14) {
                                case 497:
                                    i14 = objM3126 == aVarM5766 ? 50658 : 50627;
                                    break;
                                case 1711:
                                    break;
                                case 1736:
                                    break;
                                case 1769:
                                    return aVarM5766;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 76:
                        int i15 = 48891;
                        while (true) {
                            i15 ^= 48908;
                            switch (i15) {
                                case 22:
                                    break;
                                case 53:
                                    throw new IllegalStateException(C0017.m345(m134(), 131, C0059.f79 ^ 855, 1679));
                                case 503:
                                    i15 = iM7192 == 1 ? 49635 : 48953;
                                    break;
                                case 32495:
                                    C0329.m6365(objM7644);
                                    int i16 = 49666;
                                    while (true) {
                                        i16 ^= 49683;
                                        switch (i16) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i16 = 49697;
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
                        break;
                    case 239:
                        i13 = iM7192 != 0 ? 48860 : 48829;
                        break;
                    default:
                        break;
                }
            } catch (Exception e4) {
                int i17 = 49790;
                while (true) {
                    i17 ^= 49807;
                    switch (i17) {
                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            return C0195.m3728(e4);
                        case 241:
                            i17 = 49821;
                            break;
                    }
                }
            }
        }
        q8.l lVarM238 = C0012.m238();
        int i18 = 50689;
        while (true) {
            i18 ^= 50706;
            switch (i18) {
                case 19:
                    i18 = 50720;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    return lVarM238;
            }
        }
    }

    public final Object e(String str, String str2, u8.e eVar) {
        f fVar;
        Object objM3126;
        boolean z10 = eVar instanceof f;
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
                    fVar = (f) eVar;
                    int iM9393 = C0482.m9393(fVar);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = ((Integer.MAX_VALUE ^ iM9393) & iM9393) != 0 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                fVar = new f(this, eVar);
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                fVar.f1252c = ((iM9393 - 6) - Integer.MIN_VALUE) + 6;
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = 48674;
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
                    fVar = new f(this, eVar);
                    break;
                default:
                    break;
            }
        }
        Object objM4851 = C0253.m4851(fVar);
        v8.a aVarM5766 = C0299.m5766();
        int iM9394 = C0482.m9393(fVar);
        int i13 = 48767;
        while (true) {
            i13 ^= 48784;
            try {
                switch (i13) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        C0329.m6365(objM4851);
                        Task taskM5912 = C0306.m5912(C0020.m402(this), str, str2);
                        C0335.m6501(taskM5912, C0479.m9345(m134(), 252, C0296.f444 ^ (-1023), 923));
                        fVar.f1252c = 1;
                        objM3126 = C0163.m3126(taskM5912, fVar);
                        int i14 = 49914;
                        while (true) {
                            i14 ^= 49931;
                            switch (i14) {
                                case 497:
                                    i14 = objM3126 == aVarM5766 ? 50658 : 50627;
                                    break;
                                case 1711:
                                    break;
                                case 1736:
                                    break;
                                case 1769:
                                    return aVarM5766;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 76:
                        int i15 = 48891;
                        while (true) {
                            i15 ^= 48908;
                            switch (i15) {
                                case 22:
                                    break;
                                case 53:
                                    throw new IllegalStateException(C0135.m2596(m134(), 205, C0079.f113 ^ (-517), 3007));
                                case 503:
                                    i15 = iM9394 == 1 ? 49635 : 48953;
                                    break;
                                case 32495:
                                    C0329.m6365(objM4851);
                                    int i16 = 49666;
                                    while (true) {
                                        i16 ^= 49683;
                                        switch (i16) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i16 = 49697;
                                                continue;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                objM3126 = objM4851;
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
                        i13 = iM9394 != 0 ? 48860 : 48829;
                        break;
                    default:
                        break;
                }
            } catch (Exception e4) {
                int i17 = 49790;
                while (true) {
                    i17 ^= 49807;
                    switch (i17) {
                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            return C0195.m3728(e4);
                        case 241:
                            i17 = 49821;
                            break;
                    }
                }
            }
        }
        FirebaseUser firebaseUserM3601 = C0189.m3601((AuthResult) objM3126);
        int i18 = 50689;
        while (true) {
            i18 ^= 50706;
            switch (i18) {
                case 19:
                    if (firebaseUserM3601 != null) {
                        i18 = 50782;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    q8.g gVarM3728 = C0195.m3728(new Exception(C0308.m5959(m134(), 283, C0183.f207 ^ (-878), 951)));
                    int i19 = 51588;
                    while (true) {
                        i19 ^= 51605;
                        switch (i19) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i19 = 51619;
                                break;
                            case 54:
                                return gVarM3728;
                        }
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    int i20 = 50813;
                    while (true) {
                        i20 ^= 50830;
                        switch (i20) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                return firebaseUserM3601;
                            case 243:
                                i20 = 50844;
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i18 = 50751;
        }
    }

    public final void f() {
        C0180.m3435(C0020.m402(this));
    }

    public final Object g(String str, String str2, u8.e eVar) {
        g gVar;
        Object objM3126;
        boolean z10 = eVar instanceof g;
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
                    gVar = (g) eVar;
                    int iM7692 = C0392.m7692(gVar);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = ((Integer.MAX_VALUE ^ iM7692) & iM7692) != 0 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                gVar = new g(this, eVar);
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                gVar.f1258c = ((iM7692 - 9) - Integer.MIN_VALUE) + 9;
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = 48674;
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
                    gVar = new g(this, eVar);
                    break;
                default:
                    break;
            }
        }
        Object objM2726 = C0142.m2726(gVar);
        v8.a aVarM5766 = C0299.m5766();
        int iM7693 = C0392.m7692(gVar);
        int i13 = 48767;
        while (true) {
            i13 ^= 48784;
            try {
                switch (i13) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        C0329.m6365(objM2726);
                        Task taskM2526 = C0131.m2526(C0020.m402(this), str, str2);
                        C0335.m6501(taskM2526, C0451.m8796(m134(), 356, C0264.f344 ^ 540, 1537));
                        gVar.f1258c = 1;
                        objM3126 = C0163.m3126(taskM2526, gVar);
                        int i14 = 49914;
                        while (true) {
                            i14 ^= 49931;
                            switch (i14) {
                                case 497:
                                    i14 = objM3126 == aVarM5766 ? 50658 : 50627;
                                    break;
                                case 1711:
                                    break;
                                case 1736:
                                    break;
                                case 1769:
                                    return aVarM5766;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 76:
                        int i15 = 48891;
                        while (true) {
                            i15 ^= 48908;
                            switch (i15) {
                                case 22:
                                    break;
                                case 53:
                                    throw new IllegalStateException(C0376.m7387(m134(), 309, C0300.f448 ^ (-706), 2818));
                                case 503:
                                    i15 = iM7693 == 1 ? 49635 : 48953;
                                    break;
                                case 32495:
                                    C0329.m6365(objM2726);
                                    int i16 = 49666;
                                    while (true) {
                                        i16 ^= 49683;
                                        switch (i16) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i16 = 49697;
                                                continue;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                objM3126 = objM2726;
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
                        i13 = iM7693 != 0 ? 48860 : 48829;
                        break;
                    default:
                        break;
                }
            } catch (Exception e4) {
                int i17 = 49790;
                while (true) {
                    i17 ^= 49807;
                    switch (i17) {
                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            return C0195.m3728(e4);
                        case 241:
                            i17 = 49821;
                            break;
                    }
                }
            }
        }
        FirebaseUser firebaseUserM3601 = C0189.m3601((AuthResult) objM3126);
        int i18 = 50689;
        while (true) {
            i18 ^= 50706;
            switch (i18) {
                case 19:
                    if (firebaseUserM3601 != null) {
                        i18 = 50782;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    q8.g gVarM3728 = C0195.m3728(new Exception(C0350.m6868(m134(), 391, C0286.f431 ^ 383, 1951)));
                    int i19 = 51588;
                    while (true) {
                        i19 ^= 51605;
                        switch (i19) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i19 = 51619;
                                break;
                            case 54:
                                return gVarM3728;
                        }
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    int i20 = 50813;
                    while (true) {
                        i20 ^= 50830;
                        switch (i20) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                return firebaseUserM3601;
                            case 243:
                                i20 = 50844;
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i18 = 50751;
        }
    }

    public final Object h(String str, u8.e eVar) {
        h hVar;
        boolean z10 = eVar instanceof h;
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
                    hVar = (h) eVar;
                    int iM5902 = C0305.m5902(hVar);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = ((Integer.MAX_VALUE ^ iM5902) & iM5902) != 0 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                hVar = new h(this, eVar);
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                hVar.f1263c = ((iM5902 + 5) - Integer.MIN_VALUE) - 5;
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = 48674;
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
                    hVar = new h(this, eVar);
                    break;
                default:
                    break;
            }
        }
        Object objM6852 = C0349.m6852(hVar);
        v8.a aVarM5766 = C0299.m5766();
        int iM5903 = C0305.m5902(hVar);
        int i13 = 48767;
        while (true) {
            i13 ^= 48784;
            try {
                switch (i13) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        C0329.m6365(objM6852);
                        FirebaseUser firebaseUserM5359 = C0277.m5359(C0020.m402(this));
                        int i14 = 49914;
                        while (true) {
                            i14 ^= 49931;
                            switch (i14) {
                                case 497:
                                    i14 = firebaseUserM5359 == null ? 50658 : 50627;
                                    break;
                                case 1711:
                                    break;
                                case 1736:
                                    Task taskM3248 = C0170.m3248(firebaseUserM5359, str);
                                    C0335.m6501(taskM3248, C0482.m9384(m134(), 482, C0181.f205 ^ (-917), 1746));
                                    hVar.f1263c = 1;
                                    Object objM3126 = C0163.m3126(taskM3248, hVar);
                                    int i15 = 50689;
                                    while (true) {
                                        i15 ^= 50706;
                                        switch (i15) {
                                            case 19:
                                                i15 = objM3126 == aVarM5766 ? 50782 : 50751;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                return aVarM5766;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case 1769:
                                    return C0195.m3728(new Exception(C0175.m3335(m134(), 465, C0120.f146 ^ 462, 3196)));
                                default:
                                    break;
                            }
                        }
                        break;
                    case 76:
                        int i16 = 48891;
                        while (true) {
                            i16 ^= 48908;
                            switch (i16) {
                                case 22:
                                    break;
                                case 53:
                                    throw new IllegalStateException(C0230.m4437(m134(), 418, C0269.f349 ^ (-470), 805));
                                case 503:
                                    i16 = iM5903 == 1 ? 49635 : 48953;
                                    break;
                                case 32495:
                                    C0329.m6365(objM6852);
                                    int i17 = 49666;
                                    while (true) {
                                        i17 ^= 49683;
                                        switch (i17) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i17 = 49697;
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
                    case 239:
                        i13 = iM5903 != 0 ? 48860 : 48829;
                        break;
                    default:
                        break;
                }
            } catch (Exception e4) {
                int i18 = 49790;
                while (true) {
                    i18 ^= 49807;
                    switch (i18) {
                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            return C0195.m3728(e4);
                        case 241:
                            i18 = 49821;
                            break;
                    }
                }
            }
        }
        q8.l lVarM238 = C0012.m238();
        int i19 = 50813;
        while (true) {
            i19 ^= 50830;
            switch (i19) {
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    return lVarM238;
                case 243:
                    i19 = 50844;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:149:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x015d A[DONT_GENERATE, SYNTHETIC] */
    public final Object i(String str, u8.e eVar) {
        i iVar;
        Void r10;
        Object objM3126;
        int i10;
        q8.l lVarM238;
        int i11;
        int i12;
        boolean z10 = eVar instanceof i;
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i13 = z10 ? 1709 : 1678;
                    break;
                case 204:
                    iVar = (i) eVar;
                    int iM6344 = C0328.m6344(iVar);
                    int i14 = 1740;
                    while (true) {
                        i14 ^= 1757;
                        switch (i14) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i14 = ((Integer.MAX_VALUE ^ iM6344) & iM6344) != 0 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                iVar = new i(this, eVar);
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                iVar.f1270c = ((iM6344 + 1) - Integer.MIN_VALUE) - 1;
                                int i15 = 1864;
                                while (true) {
                                    i15 ^= 1881;
                                    switch (i15) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i15 = 48674;
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
                    iVar = new i(this, eVar);
                    break;
                default:
                    break;
            }
        }
        Object objM2129 = C0110.m2129(iVar);
        v8.a aVarM5766 = C0299.m5766();
        int iM6345 = C0328.m6344(iVar);
        int i16 = 48767;
        while (true) {
            i16 ^= 48784;
            try {
                switch (i16) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        C0329.m6365(objM2129);
                        FirebaseUser firebaseUserM5359 = C0277.m5359(C0020.m402(this));
                        int i17 = 49914;
                        while (true) {
                            i17 ^= 49931;
                            switch (i17) {
                                case 497:
                                    i17 = firebaseUserM5359 != null ? 50658 : 50627;
                                    break;
                                case 1711:
                                    break;
                                case 1736:
                                    r10 = null;
                                    i10 = 51712;
                                    while (true) {
                                        i10 ^= 51729;
                                        switch (i10) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (r10 == null) {
                                                    i10 = 51805;
                                                }
                                                break;
                                            case 47:
                                                lVarM238 = C0012.m238();
                                                i11 = 51836;
                                                while (true) {
                                                    i11 ^= 51853;
                                                    switch (i11) {
                                                        case 241:
                                                            i11 = 52518;
                                                            break;
                                                        case 1963:
                                                            return lVarM238;
                                                    }
                                                }
                                                break;
                                            case 76:
                                                return C0195.m3728(new Exception(C0399.m7813(m134(), 557, C0113.f139 ^ (-79), 1791)));
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        i10 = 51774;
                                    }
                                    break;
                                case 1769:
                                    Task taskM9257 = C0475.m9257(firebaseUserM5359, str);
                                    int i18 = 50689;
                                    while (true) {
                                        i18 ^= 50706;
                                        switch (i18) {
                                            case 19:
                                                i18 = taskM9257 != null ? 50782 : 50751;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                r10 = null;
                                                i10 = 51712;
                                                while (true) {
                                                    i10 ^= 51729;
                                                    switch (i10) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (r10 == null) {
                                                                i10 = 51805;
                                                            }
                                                            break;
                                                        case 47:
                                                            lVarM238 = C0012.m238();
                                                            i11 = 51836;
                                                            while (true) {
                                                                i11 ^= 51853;
                                                                switch (i11) {
                                                                    case 241:
                                                                        i11 = 52518;
                                                                        break;
                                                                    case 1963:
                                                                        return lVarM238;
                                                                }
                                                            }
                                                            break;
                                                        case 76:
                                                            return C0195.m3728(new Exception(C0399.m7813(m134(), 557, C0113.f139 ^ (-79), 1791)));
                                                        default:
                                                            continue;
                                                            continue;
                                                            continue;
                                                            continue;
                                                    }
                                                    i10 = 51774;
                                                }
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                iVar.f1270c = 1;
                                                objM3126 = C0163.m3126(taskM9257, iVar);
                                                int i19 = 50813;
                                                while (true) {
                                                    i19 ^= 50830;
                                                    switch (i19) {
                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 53:
                                                            break;
                                                        case 243:
                                                            i19 = objM3126 == aVarM5766 ? 51557 : 50875;
                                                            break;
                                                        case 4075:
                                                            return aVarM5766;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                r10 = (Void) objM3126;
                                                i12 = 51588;
                                                while (true) {
                                                    i12 ^= 51605;
                                                    switch (i12) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i12 = 51619;
                                                            continue;
                                                            continue;
                                                        case 54:
                                                            break;
                                                        default:
                                                            continue;
                                                            continue;
                                                    }
                                                    i10 = 51712;
                                                    while (true) {
                                                        i10 ^= 51729;
                                                        switch (i10) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                if (r10 == null) {
                                                                    i10 = 51805;
                                                                }
                                                                break;
                                                            case 47:
                                                                lVarM238 = C0012.m238();
                                                                i11 = 51836;
                                                                while (true) {
                                                                    i11 ^= 51853;
                                                                    switch (i11) {
                                                                        case 241:
                                                                            i11 = 52518;
                                                                            break;
                                                                        case 1963:
                                                                            return lVarM238;
                                                                    }
                                                                }
                                                                break;
                                                            case 76:
                                                                return C0195.m3728(new Exception(C0399.m7813(m134(), 557, C0113.f139 ^ (-79), 1791)));
                                                            default:
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                        }
                                                        i10 = 51774;
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
                    case 76:
                        int i20 = 48891;
                        while (true) {
                            i20 ^= 48908;
                            switch (i20) {
                                case 22:
                                    break;
                                case 53:
                                    throw new IllegalStateException(C0085.m1814(m134(), 510, C0232.f312 ^ 531, 1346));
                                case 503:
                                    i20 = iM6345 == 1 ? 49635 : 48953;
                                    break;
                                case 32495:
                                    C0329.m6365(objM2129);
                                    int i21 = 49666;
                                    while (true) {
                                        i21 ^= 49683;
                                        switch (i21) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i21 = 49697;
                                                continue;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                objM3126 = objM2129;
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
                        r10 = (Void) objM3126;
                        i12 = 51588;
                        while (true) {
                            i12 ^= 51605;
                            switch (i12) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = 51619;
                                    continue;
                                    continue;
                                case 54:
                                    break;
                                default:
                                    continue;
                                    continue;
                            }
                            i10 = 51712;
                            while (true) {
                                i10 ^= 51729;
                                switch (i10) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (r10 == null) {
                                            i10 = 51805;
                                        }
                                        break;
                                    case 47:
                                        lVarM238 = C0012.m238();
                                        i11 = 51836;
                                        while (true) {
                                            i11 ^= 51853;
                                            switch (i11) {
                                                case 241:
                                                    i11 = 52518;
                                                    break;
                                                case 1963:
                                                    return lVarM238;
                                            }
                                        }
                                        break;
                                    case 76:
                                        return C0195.m3728(new Exception(C0399.m7813(m134(), 557, C0113.f139 ^ (-79), 1791)));
                                    default:
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                }
                                i10 = 51774;
                            }
                        }
                        break;
                    case 239:
                        i16 = iM6345 != 0 ? 48860 : 48829;
                        break;
                    default:
                        break;
                }
            } catch (Exception e4) {
                int i22 = 49790;
                while (true) {
                    i22 ^= 49807;
                    switch (i22) {
                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            return C0195.m3728(e4);
                        case 241:
                            i22 = 49821;
                            break;
                    }
                }
            }
        }
    }
}
