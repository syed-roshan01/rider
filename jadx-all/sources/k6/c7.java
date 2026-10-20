package k6;

import a2.C0004;
import a8.C0009;
import android.content.pm.PackageManager;
import android.support.v4.app.C0014;
import android.util.Pair;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.input.key.C0033;
import androidx.versionedparcelable.C0048;
import c1.C0060;
import com.auto.accept.service.C0072;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.components.C0135;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.ktx.C0199;
import d1.C0212;
import d9.C0224;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.lifecycle.C0238;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.C0254;
import e7.C0265;
import f4.C0277;
import f6.C0278;
import g2.C0287;
import h0.C0300;
import h5.C0309;
import h7.C0311;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import k1.C0333;
import k4.C0337;
import k8.C0339;
import l0.C0340;
import m7.C0358;
import o1.C0368;
import o5.C0371;
import p8.C0380;
import r5.C0400;
import t1.C0420;
import t9.C0428;
import u4.C0437;
import v.C0440;
import v5.C0446;
import w1.C0456;
import w2.C0457;
import w2.C0458;
import w2.C0459;
import w9.C0466;
import x7.C0473;
import y9.C0480;
import z2.C0485;
import z7.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class c7 extends m7 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f531short = {2560, 2573, 2591, 2584, 2611, 2568, 2569, 2560, 2569, 2584, 2569, 2611, 2591, 2584, 2573, 2560, 2569, 3030, 3029, 3031, 3039, 3035, 3026, 3026, 1885, 1872, 1858, 1861, 1902, 1860, 1857, 1885, 1886, 1872, 1877, 2136, 2133, 2119, 2112, 2155, 2113, 2116, 2136, 2139, 2133, 2128, 2155, 2133, 2112, 2112, 2129, 2137, 2116, 2112, 2326, 2322, 2335, 2325, 2322, 2332, 2323, 2319, 2340, 2324, 2333, 2333, 2312, 2334, 2319, 3094, 3094, 3094, 3094, 3094, 3094, 3094, 3094, 3083, 3094, 3094, 3094, 3094, 3083, 3094, 3094, 3094, 3094, 3083, 3094, 3094, 3094, 3094, 3083, 3094, 3094, 3094, 3094, 3094, 3094, 3094, 3094, 3094, 3094, 3094, 3094, 2026, 2047, 2044, 2045, 1943, 1319, 1319, 1319, 1319, 1319, 1319, 1319, 1319, 1338, 1319, 1319, 1319, 1319, 1338, 1319, 1319, 1319, 1319, 1338, 1319, 1319, 1319, 1319, 1338, 1319, 1319, 1319, 1319, 1319, 1319, 1319, 1319, 1319, 1319, 1319, 1319, 586, 625, 638, 637, 627, 634, 575, 619, 624, 575, 632, 634, 619, 575, 638, 635, 617, 634, 621, 619, 630, 620, 630, 625, 632, 575, 630, 635};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f9941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p4 f9942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p4 f9943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p4 f9944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p4 f9945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p4 f9946i;

    public c7(p7 p7Var) {
        super(p7Var);
        this.f9941d = new HashMap();
        l4 l4VarM6640 = C0339.m6640(this);
        String strM5959 = C0309.m5959(m6543(), 0, C0400.f670 ^ 19, 2668);
        long j10 = 573 ^ ((long) C0446.f716);
        this.f9942e = new p4(l4VarM6640, strM5959, j10);
        this.f9943f = new p4(C0339.m6640(this), C0491.m9556(m6543(), 17, C0300.f447 ^ 614, 2996), j10);
        this.f9944g = new p4(C0339.m6640(this), C0033.m647(m6543(), 24, C0060.f80 ^ (-885), 1841), j10);
        this.f9945h = new p4(C0339.m6640(this), C0480.m9345(m6543(), 35, C0437.f707 ^ (-268), 2100), j10);
        this.f9946i = new p4(C0339.m6640(this), C0254.m4839(m6543(), 54, C0212.f235 ^ 549, 2427), j10);
        int iM4678 = C0244.m4678();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4678 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0459.m8932("Zma2651ZppDmARv233K8zddu5uxl")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۦۢۧۡ, reason: contains not printable characters */
    public static short[] m6543() {
        int iM2608 = C0135.m2608();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2608 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f531short;
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

    @Override // k6.m7
    public final boolean r() {
        return false;
    }

    public final String s(String str, boolean z10) {
        String strM527;
        C0224.m4302(this);
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
                    strM527 = (String) C0072.m1560(C0473.m9203(this, str));
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
                    strM527 = C0027.m527(m6543(), 69, C0371.f641 ^ 830, 3110);
                    break;
                default:
                    break;
            }
        }
        MessageDigest messageDigestM7212 = C0368.m7212();
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (messageDigestM7212 == null) {
                        i12 = 48736;
                    }
                    break;
                case 47384:
                    Locale localeM5051 = C0265.m5051();
                    BigInteger bigInteger = new BigInteger(1, C0340.m6663(messageDigestM7212, C0358.m7012(strM527)));
                    Object[] objArr = new Object[1];
                    objArr[C0428.f698 ^ 498] = bigInteger;
                    return C0048.m920(localeM5051, C0163.m3133(m6543(), 105, C0126.f152 ^ (-203), 1999), objArr);
                case 47417:
                    return null;
                case 47483:
                    break;
                default:
                    continue;
            }
            i12 = 48705;
        }
    }

    public final Pair t(String str) {
        b7 b7Var;
        m0.z1 z1VarM2919;
        String strM8581 = C0440.m8581();
        C0224.m4302(this);
        C0014.m280((e6.c) C0166.m3176(this));
        long jM3820 = C0199.m3820();
        HashMap mapM8910 = C0458.m8910(this);
        b7 b7Var2 = (b7) C0278.m5377(mapM8910, str);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = b7Var2 != null ? 1709 : 1678;
                    break;
                case 204:
                    long jM2764 = C0144.m2764(b7Var2);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = jM3820 < jM2764 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return new Pair(C0004.m92(b7Var2), C0009.m192(C0231.m4425(b7Var2)));
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
        f fVarM1951 = C0091.m1951(this);
        C0014.m280(fVarM1951);
        long jM7426 = jM3820 - (0 - C0380.m7426(fVarM1951, str, C0311.m6004()));
        try {
            long jM7427 = C0380.m7426(C0091.m1951(this), str, C0238.m4567());
            int i12 = 1864;
            while (true) {
                i12 ^= 1881;
                switch (i12) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i12 = jM7427 > 0 ? 48736 : 48705;
                        break;
                    case 47384:
                        z1VarM2919 = C0152.m2919(C0277.m5311(this));
                        break;
                    case 47417:
                        try {
                            m0.z1 z1VarM29110 = C0152.m2919(C0277.m5311(this));
                            int i13 = 48767;
                            while (true) {
                                i13 ^= 48784;
                                switch (i13) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        z1VarM2919 = z1VarM29110;
                                        break;
                                    case 239:
                                        i13 = 48798;
                                        continue;
                                    default:
                                        continue;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e4) {
                            int i14 = 49666;
                            while (true) {
                                i14 ^= 49683;
                                switch (i14) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i14 = b7Var2 != null ? 49759 : 49728;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        long jM2765 = C0144.m2764(b7Var2);
                                        int i15 = 49790;
                                        while (true) {
                                            i15 ^= 49807;
                                            switch (i15) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 51:
                                                    break;
                                                case 84:
                                                    return new Pair(C0004.m92(b7Var2), C0009.m192(C0231.m4425(b7Var2)));
                                                case 241:
                                                    i15 = jM3820 < jM7427 - (0 - jM2765) ? 49883 : 49852;
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
                            int i16 = 49914;
                            while (true) {
                                i16 ^= 49931;
                                switch (i16) {
                                    case 497:
                                        i16 = 50596;
                                        continue;
                                    case 1711:
                                        z1VarM2919 = null;
                                        break;
                                    default:
                                        continue;
                                }
                            }
                        }
                        break;
                    case 47483:
                        break;
                    default:
                        break;
                }
            }
            int i17 = 50689;
            while (true) {
                i17 ^= 50706;
                switch (i17) {
                    case 19:
                        if (z1VarM2919 == null) {
                            i17 = 50782;
                        }
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        String str2 = (String) C0164.m3151(z1VarM2919);
                        int i18 = 50813;
                        while (true) {
                            i18 ^= 50830;
                            switch (i18) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case 53:
                                    b7Var = new b7(jM7426, strM8581, C0287.m5518(z1VarM2919));
                                    int i19 = 51712;
                                    while (true) {
                                        i19 ^= 51729;
                                        switch (i19) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i19 = 51743;
                                                break;
                                        }
                                    }
                                    break;
                                case 243:
                                    if (str2 != null) {
                                        i18 = 51557;
                                    }
                                    break;
                                case 4075:
                                    b7 b7Var3 = new b7(jM7426, str2, C0287.m5518(z1VarM2919));
                                    int i20 = 51588;
                                    while (true) {
                                        i20 ^= 51605;
                                        switch (i20) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i20 = 51619;
                                                break;
                                            case 54:
                                                b7Var = b7Var3;
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i18 = 50875;
                        }
                        C0128.m2473(mapM8910, str, b7Var);
                        return new Pair(C0004.m92(b7Var), C0009.m192(C0231.m4425(b7Var)));
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                    case 76:
                        return new Pair(C0457.m8898(m6543(), 110, C0333.f516 ^ 791, 1303), C0456.m8876());
                    default:
                        continue;
                }
                i17 = 50751;
            }
        } catch (Exception e10) {
            int i21 = 48891;
            while (true) {
                i21 ^= 48908;
                switch (i21) {
                    case 22:
                        C0420.m8245(C0466.m9073(C0029.m572(this)), C0337.m6514(m6543(), 146, C0485.f758 ^ (-763), 543), e10);
                        b7Var = new b7(jM7426, strM8581, false);
                        break;
                    case 503:
                        i21 = 48922;
                        continue;
                    default:
                        continue;
                }
            }
        }
    }
}
