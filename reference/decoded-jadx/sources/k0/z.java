package k0;

import a2.C0005;
import aa.C0011;
import androidx.compose.foundation.layout.C0023;
import c1.C0059;
import c3.C0063;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.common.C0087;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.iid.C0169;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.C0177;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.measurement.C0181;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.internal.Code;
import d3.C0216;
import d9.C0226;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.android.lifecycle.C0236;
import dagger.hilt.components.C0243;
import dagger.hilt.internal.aggregatedroot.C0246;
import dagger.hilt.internal.aliasof.C0247;
import dagger.hilt.internal.generatesrootinput.C0250;
import e2.C0260;
import e2.C0261;
import f4.C0276;
import g2.C0287;
import h3.C0302;
import h7.C0311;
import j2.C0323;
import p7.C0378;
import s7.C0414;
import s8.C0416;
import u2.C0433;
import v5.C0445;
import v6.C0446;
import v9.C0452;
import w.C0453;
import w4.C0459;
import y.C0475;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y.u0 f9683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y.u0 f9684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f9685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f9686d;

    static {
        float f10 = C0433.f704 ^ (-535);
        float f11 = C0023.f43 ^ (-957);
        f9683a = new y.u0(f10, f11, f10, f11);
        float f12 = C0226.f306 ^ 843;
        f9684b = new y.u0(f12, f11, f12, f11);
        f9685c = C0416.f687 ^ (-678);
        f9686d = C0247.f327 ^ (-457);
        C0260.m4968();
    }

    public static y a(long j10, long j11, m0.m mVar, int i10) {
        long jM220;
        long jM221;
        long jM222;
        long jM223;
        m0.q qVar = (m0.q) mVar;
        C0261.m4990(qVar, 339300593 ^ C0302.f450);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ (-2)) & i10) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    jM220 = C0011.m220();
                    break;
                case 239:
                    jM220 = j10;
                    break;
                default:
                    break;
            }
        }
        int i12 = C0161.f185;
        int i13 = 1740;
        while (true) {
            i13 ^= 1757;
            switch (i13) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i13 = ((i12 ^ (-776)) & i10) != 0 ? 1833 : 1802;
                    break;
                case 54:
                    break;
                case 471:
                    jM221 = 0;
                    break;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    jM221 = C0011.m220();
                    int i14 = 1864;
                    while (true) {
                        i14 ^= 1881;
                        switch (i14) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i14 = 48674;
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
        int i15 = C0227.f307;
        int i16 = 48767;
        while (true) {
            i16 ^= 48784;
            switch (i16) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    jM222 = j11;
                    break;
                case 76:
                    jM222 = C0011.m220();
                    break;
                case 239:
                    i16 = ((i15 ^ (-908)) & i10) != 0 ? 48860 : 48829;
                    break;
                default:
                    break;
            }
        }
        int i17 = C0169.f193;
        int i18 = 48891;
        while (true) {
            i18 ^= 48908;
            switch (i18) {
                case 22:
                    break;
                case 53:
                    jM223 = 0;
                    break;
                case 503:
                    if (((i17 ^ 748) & i10) != 0) {
                        i18 = 49635;
                    }
                    break;
                case 32495:
                    jM223 = C0011.m220();
                    int i19 = 49666;
                    while (true) {
                        i19 ^= 49683;
                        switch (i19) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i19 = 49697;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i18 = 48953;
        }
        y yVarM5317 = C0276.m5317(C0378.m7410((i0) C0475.m9256(qVar, C0445.m8687())), jM220, jM221, jM222, jM223);
        C0171.m3270(qVar, false);
        return yVarM5317;
    }

    public static d0 b(float f10, m0.m mVar, int i10) {
        float fM4968;
        float fM95;
        float fM1226;
        float fM6269;
        float fM1782;
        m0.q qVar = (m0.q) mVar;
        C0261.m4990(qVar, 1827791340 ^ C0194.f218);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ (-2)) & i10) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    fM4968 = C0260.m4968();
                    break;
                case 239:
                    fM4968 = f10;
                    break;
                default:
                    break;
            }
        }
        int i12 = C0446.f717;
        int i13 = 1740;
        while (true) {
            i13 ^= 1757;
            switch (i13) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (((i12 ^ (-48)) & i10) != 0) {
                        i13 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    fM95 = 0.0f;
                    break;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    fM95 = C0005.m95();
                    int i14 = 1864;
                    while (true) {
                        i14 ^= 1881;
                        switch (i14) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i14 = 48674;
                                break;
                            case 47483:
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i13 = 1802;
        }
        int i15 = C0311.f459;
        int i16 = 48767;
        while (true) {
            i16 ^= 48784;
            switch (i16) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    fM1226 = 0.0f;
                    break;
                case 76:
                    fM1226 = C0063.m1226();
                    int i17 = 48891;
                    while (true) {
                        i17 ^= 48908;
                        switch (i17) {
                            case 22:
                                break;
                            case 503:
                                i17 = 48922;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    i16 = ((i15 ^ 744) & i10) != 0 ? 48860 : 48829;
                    break;
                default:
                    break;
            }
        }
        int i18 = C0133.f159;
        int i19 = 49666;
        while (true) {
            i19 ^= 49683;
            switch (i19) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i19 = ((i18 ^ 784) & i10) != 0 ? 49759 : 49728;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    fM6269 = C0323.m6269();
                    int i20 = 49790;
                    while (true) {
                        i20 ^= 49807;
                        switch (i20) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 241:
                                i20 = 49821;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 83:
                    fM6269 = 0.0f;
                    break;
                default:
                    break;
            }
        }
        int i21 = C0246.f326;
        int i22 = 49914;
        while (true) {
            i22 ^= 49931;
            switch (i22) {
                case 497:
                    if (((i21 ^ (-670)) & i10) != 0) {
                        i22 = 50658;
                    }
                    break;
                case 1711:
                    break;
                case 1736:
                    fM1782 = 0.0f;
                    break;
                case 1769:
                    fM1782 = C0083.m1782();
                    int i23 = 50689;
                    while (true) {
                        i23 ^= 50706;
                        switch (i23) {
                            case 19:
                                i23 = 50720;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i22 = 50627;
        }
        d0 d0Var = new d0(fM4968, fM95, fM1226, fM6269, fM1782);
        C0171.m3270(qVar, false);
        return d0Var;
    }

    public static y c(i0 i0Var) {
        y yVarM3392 = C0178.m3392(i0Var);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (yVarM3392 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    C0260.m4968();
                    y yVar = new y(C0087.m1857(i0Var, C0414.f685 ^ (-397)), C0087.m1857(i0Var, C0177.m3373()), C0216.m4129(C0087.m1857(i0Var, C0243.m4664()), 0.12f), C0216.m4129(C0087.m1857(i0Var, C0023.m448()), 0.38f));
                    i0Var.K = yVar;
                    return yVar;
                case 239:
                    return yVarM3392;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public static y d(i0 i0Var) {
        y yVarM3465 = C0181.m3465(i0Var);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (yVarM3465 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    long jM4787 = C0250.m4787();
                    C0226.m4373();
                    y yVar = new y(jM4787, C0087.m1857(i0Var, C0236.f316 ^ (-800)), jM4787, C0216.m4129(C0087.m1857(i0Var, C0452.f723 ^ (-852)), 0.38f));
                    i0Var.L = yVar;
                    return yVar;
                case 239:
                    return yVarM3465;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public static y e(i0 i0Var) {
        y yVarM8945 = C0459.m8945(i0Var);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (yVarM8945 == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    long jM4787 = C0250.m4787();
                    y yVar = new y(jM4787, C0087.m1857(i0Var, C0453.f724 ^ 869), jM4787, C0216.m4129(C0087.m1857(i0Var, C0287.f432 ^ (-527)), 0.38f));
                    i0Var.M = yVar;
                    return yVar;
                case 239:
                    return yVarM8945;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public static u.w f(m0.m mVar) {
        float fM4373 = 0.0f;
        long jM4507 = 0;
        String str = "\u06e4\u06e3\u06e0";
        m0.q qVar = null;
        u.w wVarM1134 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747712:
                    i11 = i10 ^ 281;
                    str = "\u06e2\u06e1\u06e1";
                    break;
                case 1747773:
                    return wVarM1134;
                case 1748889:
                    i10 = C0091.f125;
                    str = "\u06e3\u06e6\u06e5";
                    break;
                case 1749605:
                    C0261.m4990(qVar, i11);
                    str = "\u06e8\u06e0\u06e6";
                    break;
                case 1749634:
                    jM4507 = C0234.m4507(i11, qVar);
                    str = "\u06e4\u06e1\u06e8";
                    break;
                case 1749699:
                    C0171.m3270(qVar, false);
                    str = "\u06e0\u06e3\u06e0";
                    break;
                case 1750754:
                    i11 = 563957504 ^ i10;
                    str = "\u06e2\u06e0\u06e3";
                    break;
                case 1751617:
                    qVar = (m0.q) mVar;
                    str = "\u06e1\u06e8\u06e0";
                    break;
                case 1754601:
                    i10 = C0075.f109;
                    str = "\u06e0\u06e1\u06e1";
                    break;
                case 1755374:
                    fM4373 = C0226.m4373();
                    str = "\u06e7\u06e6\u06e8";
                    break;
                default:
                    str = "\u06e2\u06e3\u06e4";
                    wVarM1134 = C0059.m1134(fM4373, jM4507);
                    break;
            }
        }
    }
}
