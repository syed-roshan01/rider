package k6;

import a0.C0003;
import a8.C0010;
import android.net.Uri;
import androidx.compose.ui.draw.C0028;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.graphics.C0031;
import androidx.compose.ui.layout.C0036;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.stats.C0101;
import com.google.firebase.abt.C0112;
import com.google.firebase.annotations.C0128;
import com.google.firebase.components.C0134;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import d9.C0223;
import dagger.hilt.android.components.C0228;
import dagger.hilt.internal.generatesrootinput.C0250;
import e2.C0261;
import f.C0269;
import f0.C0271;
import h4.C0305;
import java.util.HashMap;
import m7.C0357;
import r5.C0400;
import v0.C0440;
import z1.C0483;
import z7.C0489;
import z8.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class l7 extends k7 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f560short = {2396, 2376, 2395, 2370, 2319, 2377, 2378, 2382, 2395, 2394, 2397, 2378, 2319, 2377, 2371, 2382, 2376, 2319, 2378, 2369, 2382, 2381, 2371, 2378, 2379, 2305, 1594, 1582, 1597, 1572, 1641, 1596, 1593, 1573, 1574, 1576, 1581, 1641, 1580, 1575, 1576, 1579, 1573, 1580, 1581, 1641, 1568, 1575, 1641, 1572, 1576, 1575, 1568, 1583, 1580, 1594, 1597, 1639, 2363, 3321, 3259, 3247, 3260, 3237, 3304, 3243, 3239, 3238, 3246, 3233, 3247, 3261, 3258, 3245, 3244, 3304, 3263, 3233, 3260, 3232, 3304, 3261, 3256, 3236, 3239, 3241, 3244, 3223, 3261, 3258, 3236, 3300, 3304, 3259, 3245, 3258, 3262, 3245, 3258, 3223, 3233, 3238, 3246, 3239, 1079, 1122, 1064, 1056, 1056, 1064, 1059, 1066, 1122, 1084, 1064, 1083, 1058, 1122, 1084, 1066, 1085, 1081, 1066, 1085, 1122, 1062, 1057, 1065, 1056, 928};

    /* JADX INFO: renamed from: ۟ۧۡۧۧ, reason: not valid java name and contains not printable characters */
    public static short[] m6572() {
        int iM5152 = C0269.m5152();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5152 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f560short;
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

    public final l.t p(String str) {
        String strM1814;
        l.t tVar = null;
        boolean zM67 = C0003.m67();
        int i10 = C0072.f104 ^ 109;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = zM67 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM3575 = C0187.m3575(C0091.m1951(this), null, C0075.m1632());
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = zM3575 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0135.m2604(C0136.m2634(C0029.m572(this)), C0101.m1981(m6572(), 0, C0028.f48 ^ 353, 2351));
                                a5 a5VarM4795 = C0250.m4795(C0090.m1924(this), str);
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i13 = a5VarM4795 == null ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            boolean zM7853 = C0400.m7853(a5VarM4795);
                                            int i14 = 48767;
                                            while (true) {
                                                i14 ^= 48784;
                                                switch (i14) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        C0135.m2604(C0136.m2634(C0029.m572(this)), C0357.m7004(m6572(), 26, C0082.f116 ^ 345, 1609));
                                                        zzfc.zzd zzdVarM9561 = C0491.m9561(C0091.m1950(this), C0160.m3052(a5VarM4795));
                                                        int i15 = 49666;
                                                        while (true) {
                                                            i15 ^= 49683;
                                                            switch (i15) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i15 = zzdVarM9561 == null ? 49759 : 49728;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    int i16 = 49790;
                                                                    while (true) {
                                                                        i16 ^= 49807;
                                                                        switch (i16) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 241:
                                                                                i16 = 49821;
                                                                                continue;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 83:
                                                                    String strM9530 = C0489.m9530(zzdVarM9561);
                                                                    boolean zM1883 = C0088.m1883(strM9530);
                                                                    int i17 = 49914;
                                                                    while (true) {
                                                                        i17 ^= 49931;
                                                                        switch (i17) {
                                                                            case 497:
                                                                                i17 = zM1883 ? 50658 : 50627;
                                                                                break;
                                                                            case 1711:
                                                                                break;
                                                                            case 1736:
                                                                                String strM3887 = C0202.m3887(zzdVarM9561);
                                                                                d4 d4VarM572 = C0029.m572(this);
                                                                                boolean zM1884 = C0088.m1883(strM3887);
                                                                                int i18 = 50813;
                                                                                while (true) {
                                                                                    i18 ^= 50830;
                                                                                    switch (i18) {
                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 53:
                                                                                            strM1814 = C0085.m1814(m6572(), 59, 1, 3255);
                                                                                            break;
                                                                                        case 243:
                                                                                            i18 = zM1884 ? 51557 : 50875;
                                                                                            break;
                                                                                        case 4075:
                                                                                            strM1814 = C0491.m9565(m6572(), 58, 1, 2402);
                                                                                            int i19 = 51588;
                                                                                            while (true) {
                                                                                                i19 ^= 51605;
                                                                                                switch (i19) {
                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        i19 = 51619;
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
                                                                                C0112.m2169(C0136.m2634(d4VarM572), C0271.m5220(m6572(), 60, C0089.f123 ^ 422, 3272), strM9530, strM1814);
                                                                                boolean zM1885 = C0088.m1883(strM3887);
                                                                                int i20 = 51712;
                                                                                while (true) {
                                                                                    i20 ^= 51729;
                                                                                    switch (i20) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            i20 = 51774;
                                                                                            break;
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            if (zM1885) {
                                                                                                i20 = 51805;
                                                                                                continue;
                                                                                            } else {
                                                                                                i20 = 51774;
                                                                                            }
                                                                                            break;
                                                                                        case 47:
                                                                                            HashMap map = new HashMap();
                                                                                            C0128.m2473(map, C0305.m5885(m6572(), 104, C0036.f56 ^ 51, 1103), strM3887);
                                                                                            tVar = new l.t(i10, strM9530, map);
                                                                                            break;
                                                                                        case 76:
                                                                                            tVar = new l.t(strM9530, i10);
                                                                                            int i21 = 51836;
                                                                                            while (true) {
                                                                                                i21 ^= 51853;
                                                                                                switch (i21) {
                                                                                                    case 241:
                                                                                                        i21 = 52518;
                                                                                                        continue;
                                                                                                    case 1963:
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
                                                                            case 1769:
                                                                                int i22 = 50689;
                                                                                while (true) {
                                                                                    i22 ^= 50706;
                                                                                    switch (i22) {
                                                                                        case 19:
                                                                                            i22 = 50720;
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
                                                        break;
                                                    case 76:
                                                        int i23 = 48891;
                                                        while (true) {
                                                            i23 ^= 48908;
                                                            switch (i23) {
                                                                case 22:
                                                                    break;
                                                                case 503:
                                                                    i23 = 48922;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i14 = !zM7853 ? 48860 : 48829;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            int i24 = 52611;
                                            while (true) {
                                                i24 ^= 52628;
                                                switch (i24) {
                                                    case 23:
                                                        i24 = tVar != null ? 52704 : 52673;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        break;
                                                    case 116:
                                                        return tVar;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47417:
                                            return new l.t(C0166.m3184(this, str), i10);
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
        return new l.t(C0166.m3184(this, str), i10);
    }

    public final String q(String str) {
        t4 t4VarM1950 = C0091.m1950(this);
        C0223.m4302(t4VarM1950);
        C0083.m1785(t4VarM1950, str);
        String str2 = (String) C0183.m3495(C0183.m3503(t4VarM1950), str);
        boolean zM1883 = C0088.m1883(str2);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM1883) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    Uri uriM2730 = C0142.m2730((String) C0261.m4995(C0228.m4398(), null));
                    Uri.Builder builderM5891 = C0305.m5891(uriM2730);
                    String strM9409 = C0483.m9409(uriM2730);
                    StringBuilder sb = new StringBuilder();
                    C0142.m2728(sb, str2);
                    C0142.m2728(sb, C0174.m3324(m6572(), 129, 1, 910));
                    C0142.m2728(sb, strM9409);
                    C0134.m2590(builderM5891, C0440.m8605(sb));
                    return C0031.m608(C0010.m198(builderM5891));
                case 239:
                    return (String) C0261.m4995(C0228.m4398(), null);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
