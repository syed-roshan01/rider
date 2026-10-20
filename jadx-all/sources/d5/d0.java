package d5;

import aa.C0012;
import androidx.compose.ui.semantics.C0039;
import b7.C0053;
import ca.C0070;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0225;
import d9.C0227;
import dagger.hilt.android.lifecycle.C0238;
import dagger.hilt.internal.definecomponent.C0250;
import f4.C0275;
import f6.C0278;
import h.C0298;
import h7.C0312;
import k3.C0336;
import m1.C0351;
import m5.C0356;
import p3.C0376;
import p5.C0378;
import q1.C0384;
import s.C0408;
import s7.C0415;
import s8.C0417;
import t3.C0425;
import v0.C0441;
import w1.C0456;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f253short = {2221, 2230, 2186, 2221, 2219, 2224, 2231, 2238, 2289, 2295, 2295, 2295, 2288, 2018, 2025, 2043, 2010, 2029, 2016};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.g1 f4447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.g1 f4448c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(m0.g1 g1Var, m0.g1 g1Var2, int i10) {
        super(1);
        this.f4446a = i10;
        this.f4447b = g1Var;
        this.f4448c = g1Var2;
        int iM4779 = C0250.m4779();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4779 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0219.m4218("iLG7zaFnxrze0Q5dvkgG")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۠ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static short[] m4160() {
        int iM4583 = C0238.m4583();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4583 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f253short;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:102:0x01d4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:131:0x0251. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x00b2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x0157. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0040. Please report as an issue. */
    public final void a(String str) {
        int i10 = 0;
        int iM6019 = C0312.m6019(this);
        m0.g1 g1VarM6981 = C0356.m6981(this);
        m0.g1 g1VarM1736 = C0081.m1736(this);
        String strM3082 = C0161.m3082(m4160(), 0, C0378.f648 ^ 178, 2265);
        String strM6868 = C0351.m6868(m4160(), 13, C0053.f73 ^ (-148), 1932);
        switch (iM6019) {
            case 0:
                C0376.m7360(str, strM6868);
                StringBuilder sb = new StringBuilder();
                int iM8181 = C0417.m8181(str);
                while (true) {
                    int i11 = 53758;
                    while (true) {
                        i11 ^= 53775;
                        switch (i11) {
                            case 1009:
                                i11 = i10 < iM8181 ? 54502 : 54471;
                                break;
                            case 1703:
                                break;
                            case 1736:
                                break;
                            case 1769:
                                break;
                            default:
                                break;
                        }
                        String strM8605 = C0441.m8605(sb);
                        C0336.m6501(strM8605, strM3082);
                        C0225.m4315(g1VarM1736, strM8605);
                        C0225.m4315(g1VarM6981, C0456.m8876());
                        break;
                    }
                    char cM4352 = C0227.m4352(str, i10);
                    boolean zM5373 = C0278.m5373(cM4352);
                    int i12 = 54533;
                    while (true) {
                        i12 ^= 54550;
                        switch (i12) {
                            case 19:
                                i12 = zM5373 ? 54626 : 54595;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 85:
                                break;
                            case 116:
                                C0384.m7515(sb, cM4352);
                                break;
                            default:
                                break;
                        }
                    }
                    i10 += C0415.f685 ^ (-408);
                    int i13 = 54657;
                    while (true) {
                        i13 ^= 54674;
                        switch (i13) {
                            case 19:
                                i13 = 54688;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                        }
                    }
                }
                break;
            case 1:
                C0376.m7360(str, strM6868);
                StringBuilder sb2 = new StringBuilder();
                int iM8182 = C0417.m8181(str);
                while (true) {
                    int i14 = 52611;
                    while (true) {
                        i14 ^= 52628;
                        switch (i14) {
                            case 23:
                                i14 = i10 < iM8182 ? 52704 : 52673;
                                break;
                            case 54:
                                break;
                            case 85:
                                break;
                            case 116:
                                break;
                            default:
                                break;
                        }
                        String strM8606 = C0441.m8605(sb2);
                        C0336.m6501(strM8606, strM3082);
                        C0225.m4315(g1VarM1736, strM8606);
                        C0225.m4315(g1VarM6981, C0456.m8876());
                        break;
                    }
                    char cM4353 = C0227.m4352(str, i10);
                    boolean zM5374 = C0278.m5373(cM4353);
                    int i15 = 52735;
                    while (true) {
                        i15 ^= 52752;
                        switch (i15) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                C0384.m7515(sb2, cM4353);
                                break;
                            case 1007:
                                i15 = !zM5374 ? 53479 : 52797;
                                break;
                            case 7927:
                                int i16 = 53510;
                                while (true) {
                                    i16 ^= 53527;
                                    switch (i16) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i16 = cM4353 == '.' ? 53603 : 53572;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 83:
                                            break;
                                        case 116:
                                            C0384.m7515(sb2, cM4353);
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
                    i10 += C0275.f390 ^ 903;
                    int i17 = 53634;
                    while (true) {
                        i17 ^= 53651;
                        switch (i17) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i17 = 53665;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                        }
                    }
                }
                break;
            case 2:
                C0376.m7360(str, strM6868);
                StringBuilder sb3 = new StringBuilder();
                int iM8183 = C0417.m8181(str);
                while (true) {
                    int i18 = 50813;
                    while (true) {
                        i18 ^= 50830;
                        switch (i18) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                break;
                            case 243:
                                i18 = i10 < iM8183 ? 51557 : 50875;
                                break;
                            case 4075:
                                break;
                            default:
                                break;
                        }
                        String strM8607 = C0441.m8605(sb3);
                        C0336.m6501(strM8607, strM3082);
                        C0225.m4315(g1VarM1736, strM8607);
                        C0225.m4315(g1VarM6981, C0456.m8876());
                        break;
                    }
                    char cM4354 = C0227.m4352(str, i10);
                    boolean zM5375 = C0278.m5373(cM4354);
                    int i19 = 51588;
                    while (true) {
                        i19 ^= 51605;
                        switch (i19) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i19 = !zM5375 ? 51681 : 51650;
                                break;
                            case 54:
                                break;
                            case 87:
                                C0384.m7515(sb3, cM4354);
                                break;
                            case 116:
                                int i20 = 51712;
                                while (true) {
                                    i20 ^= 51729;
                                    switch (i20) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i20 = cM4354 == '.' ? 51805 : 51774;
                                            break;
                                        case 47:
                                            break;
                                        case 76:
                                            C0384.m7515(sb3, cM4354);
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
                    i10 += C0070.f90 ^ 764;
                    int i21 = 51836;
                    while (true) {
                        i21 ^= 51853;
                        switch (i21) {
                            case 241:
                                i21 = 52518;
                                break;
                            case 1963:
                                break;
                        }
                    }
                }
                break;
            case 3:
                C0376.m7360(str, strM6868);
                StringBuilder sb4 = new StringBuilder();
                int iM8184 = C0417.m8181(str);
                while (true) {
                    int i22 = 48891;
                    while (true) {
                        i22 ^= 48908;
                        switch (i22) {
                            case 22:
                                break;
                            case 53:
                                break;
                            case 503:
                                i22 = i10 < iM8184 ? 49635 : 48953;
                                break;
                            case 32495:
                                break;
                            default:
                                break;
                        }
                        String strM8608 = C0441.m8605(sb4);
                        C0336.m6501(strM8608, strM3082);
                        C0225.m4315(g1VarM1736, strM8608);
                        C0225.m4315(g1VarM6981, C0456.m8876());
                        int iM2863 = C0149.m2863();
                        int i23 = 50689;
                        while (true) {
                            i23 ^= 50706;
                            switch (i23) {
                                case 19:
                                    if (iM2863 <= 0) {
                                        i23 = 50782;
                                    }
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 76:
                                    System.out.println(Long.decode(C0425.m8325("Cd")));
                                    break;
                                default:
                                    continue;
                            }
                            i23 = 50751;
                        }
                    }
                    char cM4355 = C0227.m4352(str, i10);
                    boolean zM5376 = C0278.m5373(cM4355);
                    int i24 = 49666;
                    while (true) {
                        i24 ^= 49683;
                        switch (i24) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i24 = !zM5376 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                int i25 = 49790;
                                while (true) {
                                    i25 ^= 49807;
                                    switch (i25) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 51:
                                            break;
                                        case 84:
                                            C0384.m7515(sb4, cM4355);
                                            break;
                                        case 241:
                                            i25 = cM4355 == '.' ? 49883 : 49852;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 83:
                                C0384.m7515(sb4, cM4355);
                                break;
                            default:
                                break;
                        }
                    }
                    i10 += C0298.f445 ^ (-489);
                    int i26 = 49914;
                    while (true) {
                        i26 ^= 49931;
                        switch (i26) {
                            case 497:
                                i26 = 50596;
                                break;
                            case 1711:
                                break;
                        }
                    }
                }
                break;
            default:
                C0376.m7360(str, strM6868);
                StringBuilder sb5 = new StringBuilder();
                int iM8185 = C0417.m8181(str);
                while (true) {
                    int i27 = 1616;
                    while (true) {
                        i27 ^= 1633;
                        switch (i27) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 49:
                                i27 = i10 < iM8185 ? 1709 : 1678;
                                break;
                            case 204:
                                break;
                            case 239:
                                break;
                            default:
                                break;
                        }
                        String strM8609 = C0441.m8605(sb5);
                        C0336.m6501(strM8609, strM3082);
                        C0225.m4315(g1VarM1736, strM8609);
                        C0225.m4315(g1VarM6981, C0456.m8876());
                        break;
                    }
                    char cM4356 = C0227.m4352(str, i10);
                    boolean zM5377 = C0278.m5373(cM4356);
                    int i28 = 1740;
                    while (true) {
                        i28 ^= 1757;
                        switch (i28) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i28 = !zM5377 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                C0384.m7515(sb5, cM4356);
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i29 = 1864;
                                while (true) {
                                    i29 ^= 1881;
                                    switch (i29) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i29 = cM4356 == '.' ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            C0384.m7515(sb5, cM4356);
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
                    }
                    i10 += C0408.f678 ^ (-493);
                    int i30 = 48767;
                    while (true) {
                        i30 ^= 48784;
                        switch (i30) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i30 = 48798;
                                break;
                        }
                    }
                }
                break;
        }
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        q8.l lVarM238 = C0012.m238();
        switch (C0312.m6019(this)) {
            case 0:
                C0039.m776(this, (String) obj);
                return lVarM238;
            case 1:
                C0039.m776(this, (String) obj);
                return lVarM238;
            case 2:
                C0039.m776(this, (String) obj);
                return lVarM238;
            case 3:
                C0039.m776(this, (String) obj);
                return lVarM238;
            default:
                C0039.m776(this, (String) obj);
                return lVarM238;
        }
    }
}
