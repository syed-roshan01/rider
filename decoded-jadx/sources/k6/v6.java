package k6;

import aa.C0012;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.platform.C0038;
import b4.C0052;
import c1.C0059;
import c3.C0063;
import c4.C0066;
import com.google.android.datatransport.cct.C0076;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.components.C0135;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import dagger.hilt.internal.definecomponent.C0249;
import dagger.hilt.internal.generatesrootinput.C0250;
import f.C0270;
import f4.C0275;
import fa.C0280;
import g2.C0287;
import g4.C0289;
import g7.C0292;
import g9.C0294;
import h7.C0310;
import i.C0315;
import ia.C0322;
import j3.C0325;
import java.io.IOException;
import k.C0331;
import l6.C0343;
import l9.C0347;
import m1.C0351;
import m7.C0357;
import p8.C0379;
import r2.C0394;
import r5.C0399;
import r5.C0400;
import rikka.shizuku.C0406;
import t2.C0422;
import u3.C0434;
import v5.C0444;
import v7.C0448;
import v7.C0449;
import w0.C0454;
import w2.C0457;
import y6.C0477;
import y9.C0478;
import z7.C0489;

/* JADX INFO: loaded from: classes.dex */
public final class v6 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f595short = {2289, 2261, 2294, 2250, 2250, 2254, 2301, 2258, 2263, 2267, 2256, 2250, 2282, 2252, 2271, 2256, 2253, 2254, 2257, 2252, 2250, 719, 740, 750, 682, 741, 748, 682, 761, 766, 760, 751, 747, 743, 682, 741, 760, 682, 707, 709, 719, 754, 745, 751, 762, 766, 739, 741, 740, 770, 831, 804, 802, 823, 819, 814, 808, 809, 871, 804, 811, 808, 820, 814, 809, 800, 871, 801, 821, 806, 810, 802, 871, 821, 802, 806, 803, 802, 821, 1711, 1720, 1720, 1701, 1720, 1770, 1699, 1700, 1770, 1708, 1720, 1707, 1703, 1711, 1770, 1698, 1707, 1700, 1710, 1702, 1711, 1720, 1642, 1623, 1612, 1610, 1631, 1627, 1606, 1600, 1601, 1551, 1612, 1603, 1600, 1628, 1606, 1601, 1608, 1551, 1609, 1629, 1614, 1602, 1610, 1551, 1629, 1610, 1614, 1611, 1610, 1629, 1223, 1274, 1249, 1255, 1266, 1270, 1259, 1261, 1260, 1186, 1249, 1262, 1261, 1265, 1259, 1260, 1253, 1186, 1252, 1264, 1251, 1263, 1255, 1186, 1264, 1255, 1251, 1254, 1255, 1264, 2280, 2245, 2271, 2255, 2253, 2270, 2248, 2245, 2242, 2251, 2188, 2248, 2253, 2264, 2253, 2178, 2188, 2282, 2253, 2245, 2240, 2249, 2248, 2188, 2264, 2243, 2188, 2271, 2249, 2264, 2188, 2265, 2271, 2249, 2270, 2188, 2268, 2270, 2243, 2268, 2249, 2270, 2264, 2261};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10444e;

    public v6(h8.n nVar, j8.i iVar) {
        this.f10440a = 1;
        this.f10444e = nVar;
        this.f10442c = new v6.d(C0448.m8751());
        this.f10441b = true;
        this.f10443d = iVar;
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
                    System.out.println(Long.parseLong(C0063.m1223("6zcuPwVgWVJeP0zfm4hqJwSm")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public v6(s6 s6Var, x7 x7Var, boolean z10, t7 t7Var) {
        this.f10440a = 0;
        this.f10444e = s6Var;
        this.f10442c = x7Var;
        this.f10441b = z10;
        this.f10443d = t7Var;
        int iM2714 = C0141.m2714();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2714 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0124.m2397("IOUba7cP1oq7sBV8N6clWN")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۤۦۣۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6605() {
        int iM541 = C0027.m541();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM541 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f595short;
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

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0025, code lost:
    
        continue;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        t7 t7Var;
        h8.n nVar;
        e8.c2 c2VarM6243;
        e8.c2 c2VarM4782;
        switch (C0343.m6733(this)) {
            case 0:
                s6 s6Var = (s6) C0129.m2494(this);
                y3 y3VarM2387 = C0124.m2387(s6Var);
                int i10 = 51588;
                while (true) {
                    i10 ^= 51605;
                    switch (i10) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (y3VarM2387 == null) {
                                i10 = 51681;
                            }
                            break;
                        case 54:
                            break;
                        case 87:
                            x7 x7Var = (x7) C0315.m6109(this);
                            C0270.m5173(x7Var);
                            boolean zM225 = C0012.m225(this);
                            int i11 = 51836;
                            while (true) {
                                i11 ^= 51853;
                                switch (i11) {
                                    case 241:
                                        if (zM225) {
                                            i11 = 52580;
                                        }
                                        break;
                                    case 1963:
                                        break;
                                    case 1992:
                                        t7Var = (t7) C0287.m5533(this);
                                        break;
                                    case 2025:
                                        t7Var = null;
                                        int i12 = 52611;
                                        while (true) {
                                            i12 ^= 52628;
                                            switch (i12) {
                                                case 23:
                                                    i12 = 52642;
                                                    break;
                                                case 54:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i11 = 52549;
                            }
                            C0457.m8908(s6Var, y3VarM2387, t7Var, x7Var);
                            C0310.m6011(s6Var);
                            return;
                        case 116:
                            C0135.m2604(C0454.m8871(C0029.m572(s6Var)), C0357.m7004(m6605(), 161, C0434.f705 ^ 402, 2220));
                            int i13 = 51712;
                            while (true) {
                                i13 ^= 51729;
                                switch (i13) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        return;
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i13 = 51743;
                                        break;
                                }
                            }
                            break;
                        default:
                            continue;
                    }
                    i10 = 51650;
                }
                break;
            default:
                String strM9332 = C0478.m9332(C0249.m4773());
                C0200.m3838(C0249.m4773(), C0076.m1657(m6605(), 0, C0399.f670 ^ 23, 2238));
                while (true) {
                    try {
                        boolean zM9308 = C0477.m9308((j8.i) C0287.m5533(this), this);
                        int i14 = 1616;
                        while (true) {
                            i14 ^= 1633;
                            switch (i14) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 49:
                                    i14 = zM9308 ? 1709 : 1678;
                                    break;
                                case 204:
                                    Object objM2494 = C0129.m2494(this);
                                    g8.q2 q2VarM752 = C0038.m752((h8.n) objM2494);
                                    int i15 = 1740;
                                    while (true) {
                                        i15 ^= 1757;
                                        switch (i15) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i15 = q2VarM752 != null ? 1833 : 1802;
                                                break;
                                            case 54:
                                                break;
                                            case 471:
                                                break;
                                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                                C0066.m1288(C0038.m752((h8.n) objM2494));
                                                int i16 = 1864;
                                                while (true) {
                                                    i16 ^= 1881;
                                                    switch (i16) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i16 = 48674;
                                                            break;
                                                        case 47483:
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
                                    synchronized (C0325.m6294((h8.n) C0129.m2494(this))) {
                                        c2VarM6243 = C0322.m6243((h8.n) C0129.m2494(this));
                                        break;
                                    }
                                    int i17 = 48891;
                                    while (true) {
                                        i17 ^= 48908;
                                        switch (i17) {
                                            case 22:
                                                break;
                                            case 53:
                                                c2VarM4782 = c2VarM6243;
                                                break;
                                            case 503:
                                                i17 = c2VarM6243 == null ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                c2VarM4782 = C0250.m4782(C0394.m7733(), C0351.m6881(m6605(), 21, C0052.f72 ^ 957, 650));
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    C0379.m7455((h8.n) C0129.m2494(this), 0, C0129.m2485(), c2VarM4782);
                                    try {
                                        C0059.m1136((j8.i) C0287.m5533(this));
                                        int i18 = 49666;
                                        while (true) {
                                            i18 ^= 49683;
                                            switch (i18) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i18 = 49697;
                                                    continue;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            nVar = (h8.n) C0129.m2494(this);
                                            C0489.m9532(C0449.m8760(nVar));
                                            C0200.m3838(C0249.m4773(), strM9332);
                                            int i19 = 49790;
                                            while (true) {
                                                i19 ^= 49807;
                                                switch (i19) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        return;
                                                    case 241:
                                                        i19 = 49821;
                                                        break;
                                                }
                                            }
                                        }
                                    } catch (IOException e4) {
                                        C0406.m7973(C0280.m5422(), C0347.m6793(), C0196.m3766(m6605(), 49, C0275.f391 ^ 965, 839), e4);
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                    } catch (Throwable th) {
                        int i20 = 48767;
                        while (true) {
                            i20 ^= 48784;
                            switch (i20) {
                                case Code.UNAVAILABLE /* 14 */:
                                    try {
                                        h8.n nVar2 = (h8.n) C0129.m2494(this);
                                        j8.a aVarM240 = C0012.m240();
                                        e8.c2 c2VarM5659 = C0294.m5659(C0250.m4782(C0289.m5572(), C0400.m7834(m6605(), 79, C0129.f155 ^ 742, 1738)), th);
                                        C0477.m9315();
                                        C0379.m7455(nVar2, 0, aVarM240, c2VarM5659);
                                        try {
                                            C0059.m1136((j8.i) C0287.m5533(this));
                                            int i21 = 49914;
                                            while (true) {
                                                i21 ^= 49931;
                                                switch (i21) {
                                                    case 497:
                                                        i21 = 50596;
                                                        continue;
                                                    case 1711:
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                nVar = (h8.n) C0129.m2494(this);
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
                                            }
                                        } catch (IOException e10) {
                                            C0406.m7973(C0280.m5422(), C0347.m6793(), C0422.m8293(m6605(), 101, C0292.f440 ^ 49, 1583), e10);
                                        }
                                    } catch (Throwable th2) {
                                        try {
                                            C0059.m1136((j8.i) C0287.m5533(this));
                                            int i23 = 50813;
                                            while (true) {
                                                i23 ^= 50830;
                                                switch (i23) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        C0489.m9532(C0449.m8760((h8.n) C0129.m2494(this)));
                                                        C0200.m3838(C0249.m4773(), strM9332);
                                                        throw th2;
                                                    case 243:
                                                        i23 = 50844;
                                                        break;
                                                }
                                            }
                                        } catch (IOException e11) {
                                            C0406.m7973(C0280.m5422(), C0347.m6793(), C0444.m8665(m6605(), 131, C0116.f142 ^ 242, 1154), e11);
                                        }
                                    }
                                    break;
                                case 239:
                                    i20 = 48798;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                    }
                }
                break;
        }
    }
}
