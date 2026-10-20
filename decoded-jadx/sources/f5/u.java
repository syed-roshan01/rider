package f5;

import a6.C0007;
import a8.C0009;
import aa.C0012;
import androidx.profileinstaller.C0046;
import c7.C0069;
import com.auto.accept.data.model.UserProfile;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.stats.C0101;
import com.google.android.play.core.integrity.client.C0107;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.sql.C0208;
import d1.C0212;
import d4.C0217;
import d9.C0222;
import d9.C0225;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.internal.migration.C0232;
import dagger.hilt.codegen.C0241;
import dagger.hilt.internal.C0253;
import f4.C0274;
import f6.C0278;
import fa.C0279;
import h0.C0299;
import h3.C0301;
import h8.C0313;
import j9.C0329;
import k.C0331;
import k2.C0333;
import k3.C0334;
import l0.C0340;
import n.C0361;
import o4.C0369;
import o7.i2;
import p8.C0380;
import p9.q0;
import q6.C0388;
import r1.C0393;
import r5.C0399;
import r6.C0401;
import rikka.shizuku.C0406;
import t2.C0421;
import t2.C0422;
import v.C0439;
import v0.C0440;
import v6.C0447;
import v7.C0449;
import w1.C0455;
import w2.C0458;
import y.C0475;
import y9.C0479;
import z1.C0483;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public final class u extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f416short = {8818, -116, 419, 484, 486, 503, 470, 496, 486, 497, 467, 497, 492, 485, 490, 495, 486, 419, 503, 492, 492, 488, 419, 679, 697, 1446, 1444, 1449, 1449, 1509, 1457, 1450, 1509, 1506, 1463, 1440, 1462, 1456, 1448, 1440, 1506, 1509, 1447, 1440, 1443, 1450, 1463, 1440, 1509, 1506, 1452, 1451, 1459, 1450, 1454, 1440, 1506, 1509, 1458, 1452, 1457, 1453, 1509, 1446, 1450, 1463, 1450, 1456, 1457, 1452, 1451, 1440, 10182, -1480, 1047, 1093, 1106, 1108, 1119, 1106, 1108, 1116, 1122, 1092, 1106, 1093, 1124, 1091, 1110, 1091, 1090, 1092, 1047, 1124, 1123, 1142, 1125, 1123, 9854, -1152, 1455, 1513, 1514, 1531, 1516, 1511, 1501, 1514, 1506, 1504, 1531, 1514, 1484, 1504, 1505, 1513, 1510, 1512, 1455, 1531, 1504, 1504, 1508, 1455, 1809, 1799, 1793, 1853, 1810, 1806, 1795, 1804, 1853, 1799, 1818, 1810, 1803, 1808, 1819, 1853, 1807, 1809, 2736, 2737, 2730, 2814, 2744, 2737, 2731, 2736, 2746};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MainViewModel f6331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(MainViewModel mainViewModel, String str, u8.e eVar) {
        super(C0279.f424 ^ (-120), eVar);
        this.f6331c = mainViewModel;
        this.f6332d = str;
        int iM6408 = C0331.m6408();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6408 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0422.m8292("2uYfdqOlWAaC8638JmPnxOL5c0M7D")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦۧۥ, reason: not valid java name and contains not printable characters */
    public static short[] m5352() {
        int iM2116 = C0109.m2116();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2116 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f416short;
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
        String str = "\u06e7\u06e0\u06e4";
        MainViewModel mainViewModelM9343 = null;
        String strM9576 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748673:
                    return this;
                case 1751616:
                    this = new u(mainViewModelM9343, strM9576, eVar);
                    str = "\u06e1\u06e1\u06e1";
                    break;
                case 1755369:
                    str = "\u06e4\u06e3\u06df";
                    strM9576 = C0492.m9576(this);
                    break;
                default:
                    mainViewModelM9343 = C0479.m9343(this);
                    str = "\u06e8\u06e0\u06e1";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e6\u06e4\u06e2";
        Object objM1340 = obj;
        m9.d0 d0Var = null;
        u8.e eVar = null;
        u8.e eVarM147 = null;
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56510:
                    str = "\u06e4\u06e5\u06e7";
                    this = (u) eVarM147;
                    break;
                case 1747713:
                    objM1340 = C0069.m1340(this, lVarM238);
                    str = "\u06e7\u06e7\u06df";
                    break;
                case 1751648:
                    eVarM147 = C0007.m147(this, d0Var, eVar);
                    str = "\u06e6\u06e4";
                    break;
                case 1751686:
                    str = "\u06e0\u06e1\u06e2";
                    lVarM238 = C0012.m238();
                    break;
                case 1753572:
                    str = "\u06e1\u06e5\u06e2";
                    d0Var = (m9.d0) objM1340;
                    break;
                case 1754623:
                    return objM1340;
                default:
                    str = "\u06e4\u06e4\u06e0";
                    eVar = (u8.e) obj2;
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x0245. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:99:0x028c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        long jM7869;
        Object objM7969;
        String strM3642 = C0191.m3642(m5352(), 0, C0449.f720 ^ 383, 387);
        v8.a aVarM5766 = C0299.m5766();
        int iM2200 = C0114.m2200(this);
        String strM9406 = C0483.m9406(m5352(), 23, C0160.f184 ^ 745, 714);
        MainViewModel mainViewModelM9343 = C0479.m9343(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            try {
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i10 = iM2200 != 0 ? 1709 : 1678;
                        break;
                    case 204:
                        int i11 = 1740;
                        while (true) {
                            i11 ^= 1757;
                            switch (i11) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = iM2200 == 1 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    throw new IllegalStateException(C0208.m3983(m5352(), 25, C0241.f321 ^ (-779), 1477));
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    jM7869 = C0232.m4481(this);
                                    C0329.m6365(obj);
                                    objM7969 = C0361.m7093((q8.h) obj);
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
                        C0329.m6365(obj);
                        C0401.m7869();
                        C0159.m3036(mainViewModelM9343);
                        C0007.m155(m5352(), 72, C0274.f390 ^ 924, 1079);
                        long jM78610 = C0401.m7869();
                        C0475.m9262(mainViewModelM9343);
                        long jM78611 = C0401.m7869();
                        StringBuilder sb = new StringBuilder(C0217.m4134(m5352(), 98, C0369.f640 ^ (-366), 1423));
                        C0340.m6676(sb, ((jM78611 + 26) - jM78610) - 26);
                        C0142.m2728(sb, strM9406);
                        C0440.m8605(sb);
                        C0159.m3036(mainViewModelM9343);
                        jM7869 = C0401.m7869();
                        a5.z zVarM7827 = C0399.m7827(mainViewModelM9343);
                        String strM9576 = C0492.m9576(this);
                        this.f6329a = jM7869;
                        this.f6330b = 1;
                        objM7969 = C0406.m7969(zVarM7827, strM9576, true, this);
                        int i13 = 48767;
                        while (true) {
                            i13 ^= 48784;
                            switch (i13) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    break;
                                case 76:
                                    return aVarM5766;
                                case 239:
                                    i13 = objM7969 == aVarM5766 ? 48860 : 48829;
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    default:
                        break;
                }
            } catch (Exception e4) {
                int i14 = 52611;
                while (true) {
                    i14 ^= 52628;
                    switch (i14) {
                        case 23:
                            i14 = 52642;
                            break;
                        case 54:
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        C0159.m3036(mainViewModelM9343);
        q0 q0VarM2079 = C0107.m2079(mainViewModelM9343);
        long jM78612 = C0401.m7869();
        StringBuilder sb2 = new StringBuilder(strM3642);
        C0340.m6676(sb2, ((jM78612 - 28) - jM7869) + 28);
        C0142.m2728(sb2, strM9406);
        C0440.m8605(sb2);
        boolean z10 = objM7969 instanceof q8.g;
        f fVarM4838 = C0253.m4838();
        a5.j jVarM7458 = C0380.m7458(mainViewModelM9343);
        q0 q0VarM3094 = C0162.m3094(mainViewModelM9343);
        q0 q0VarM4345 = C0225.m4345(mainViewModelM9343);
        int i15 = 48891;
        while (true) {
            i15 ^= 48908;
            switch (i15) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    i15 = ((((z10 ? 1 : 0) ^ '\uffff') & 1) | ((z10 ? 1 : 0) & '\ufffe')) != 0 ? 49635 : 48953;
                    break;
                case 32495:
                    UserProfile userProfile = (UserProfile) objM7969;
                    C0227.m4382(q0VarM2079, C0009.m192(C0301.m5798(userProfile)));
                    C0227.m4382(C0116.m2242(mainViewModelM9343), C0447.m8720(userProfile));
                    C0227.m4382(C0200.m3835(mainViewModelM9343), new Long(C0458.m8921(userProfile)));
                    C0333.m6480(C0388.m7616(C0167.m3199(C0421.m8270(C0393.m7699(C0278.m5385(mainViewModelM9343)))), C0069.m1349(m5352(), 124, C0313.f461 ^ 554, 1890), C0458.m8921(userProfile)));
                    long jM8921 = C0458.m8921(userProfile);
                    int i16 = 49666;
                    while (true) {
                        i16 ^= 49683;
                        switch (i16) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i16 = jM8921 > 0 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                long jM8922 = C0458.m8921(userProfile);
                                long jM78613 = C0401.m7869();
                                int i17 = 49790;
                                while (true) {
                                    i17 ^= 49807;
                                    switch (i17) {
                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 51:
                                            break;
                                        case 84:
                                            C0227.m4382(q0VarM2079, C0455.m8876());
                                            break;
                                        case 241:
                                            i17 = jM8922 <= jM78613 ? 49883 : 49852;
                                            break;
                                        default:
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
                    boolean zM4287 = C0222.m4287(userProfile);
                    int i18 = 49914;
                    while (true) {
                        i18 ^= 49931;
                        switch (i18) {
                            case 497:
                                i18 = zM4287 ? 50658 : 50627;
                                break;
                            case 1711:
                                break;
                            case 1736:
                                boolean zM1971 = C0101.m1971(userProfile);
                                int i19 = 50813;
                                while (true) {
                                    i19 ^= 50830;
                                    switch (i19) {
                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 53:
                                            break;
                                        case 243:
                                            i19 = !zM1971 ? 51557 : 50875;
                                            break;
                                        case 4075:
                                            C0225.m4338(jVarM7458);
                                            C0227.m4382(q0VarM3094, C0334.m6483());
                                            C0227.m4382(q0VarM4345, fVarM4838);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 1769:
                                C0225.m4338(jVarM7458);
                                C0227.m4382(q0VarM3094, C0334.m6483());
                                C0227.m4382(q0VarM4345, fVarM4838);
                                int i20 = 50689;
                                while (true) {
                                    i20 ^= 50706;
                                    switch (i20) {
                                        case 19:
                                            i20 = 50720;
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
        Throwable thM9416 = C0483.m9416(objM7969);
        int i21 = 51588;
        while (true) {
            i21 ^= 51605;
            switch (i21) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i21 = thM9416 != null ? 51681 : 51650;
                    break;
                case 54:
                    break;
                case 87:
                    break;
                case 116:
                    String strM4049 = C0212.m4049(thM9416);
                    int i22 = 51712;
                    while (true) {
                        i22 ^= 51729;
                        switch (i22) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i22 = strM4049 == null ? 51805 : 51774;
                                break;
                            case 47:
                                break;
                            case 76:
                                strM4049 = C0439.m8581();
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zM2645 = C0137.m2645(strM4049, C0046.m889(m5352(), 142, C0162.f186 ^ 845, 2782), true);
                    int i23 = 51836;
                    while (true) {
                        i23 ^= 51853;
                        switch (i23) {
                            case 241:
                                i23 = zM2645 ? 52580 : 52549;
                                break;
                            case 1963:
                                break;
                            case 1992:
                                break;
                            case 2025:
                                C0225.m4338(jVarM7458);
                                C0227.m4382(q0VarM3094, C0334.m6483());
                                C0227.m4382(q0VarM4345, fVarM4838);
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
        return C0012.m238();
    }
}
