package k6;

import a.C0000;
import android.os.Bundle;
import android.support.v4.app.C0014;
import androidx.annotation.C0018;
import androidx.annotation.C0019;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.ui.graphics.C0032;
import androidx.compose.ui.platform.C0038;
import androidx.compose.ui.semantics.C0039;
import androidx.core.content.C0041;
import androidx.lifecycle.C0043;
import c1.C0060;
import c6.C0067;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.common.internal.C0084;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.ktx.C0179;
import com.google.firebase.measurement.C0181;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.firebase.remoteconfig.interop.C0198;
import d1.C0213;
import d7.C0220;
import d9.C0226;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.internal.processedrootsentinel.C0251;
import e1.C0259;
import e8.C0265;
import f0.C0272;
import f4.C0275;
import f4.C0276;
import g.C0283;
import g0.C0285;
import g5.C0290;
import h5.C0308;
import i.C0315;
import j9.C0329;
import java.util.EnumMap;
import k3.C0334;
import k3.C0335;
import k4.C0336;
import l0.C0340;
import m7.C0358;
import n.C0361;
import p7.C0378;
import q1.C0383;
import q2.C0384;
import r4.C0398;
import r5.C0399;
import r9.C0405;
import s2.C0411;
import s7.C0414;
import s8.C0416;
import u.C0429;
import u7.C0437;
import v0.C0440;
import v0.C0441;
import v5.C0444;
import v9.C0452;
import w.C0453;
import w1.C0455;
import w2.C0456;
import w2.C0458;
import x7.C0471;
import y6.C0476;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f10244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumMap f10246e;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f568short = {456, 466, 510, 453, 460, 448, 510, 467, 452, 454, 456, 462, 463, 3109, 3126, 3125, 3097, 3106, 3119, 3125, 3126, 3114, 3111, 3135, 3097, 3125, 3122, 3124, 3121, 2077, 2914, 2942, 2916, 2915, 2930, 2932, 2860, 2492, 353, 2287, 2292, 2291, 2292, 2291, 2286, 2291, 2299, 2294, 2291, 2272, 2303, 2302, 1242, 1231, 1244, 1235, 1225, 1240, 1241, 778, 779, 768, 775, 779, 778, 423, 482, 504, 463, 486, 490, 473, 494, 492, 482, 484, 485, 438, 2410, 2341, 2358, 2357, 2306, 2351, 2357, 2358, 2346, 2343, 2367, 2325, 2354, 2356, 2427};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f10241f = new o((Boolean) null, C0067.f87 ^ (-836), (Boolean) null, (String) null);

    public o(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(r5.class);
        this.f10246e = enumMap;
        C0265.m5068(enumMap, C0220.m4248(), bool);
        this.f10242a = i10;
        this.f10243b = C0471.m9188(this);
        this.f10244c = bool2;
        this.f10245d = str;
        int iM354 = C0018.m354();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM354 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0405.m7961("eO")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public o(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(r5.class);
        this.f10246e = enumMap2;
        C0398.m7810(enumMap2, enumMap);
        this.f10242a = i10;
        this.f10243b = C0471.m9188(this);
        this.f10244c = bool;
        this.f10245d = str;
        int iM6681 = C0340.m6681();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6681 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0060.m1142("pq3BTheBR3cxn8W")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x002d. Please report as an issue. */
    public static o a(int i10, Bundle bundle) {
        Boolean boolM4521;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (bundle == null) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    return new o((Boolean) null, i10, (Boolean) null, (String) null);
                case 239:
                    EnumMap enumMap = new EnumMap(r5.class);
                    r5[] r5VarArrM8137 = C0414.m8137(C0444.m8670());
                    int length = r5VarArrM8137.length;
                    int i12 = 0;
                    while (true) {
                        int i13 = 1740;
                        while (true) {
                            i13 ^= 1757;
                            switch (i13) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i13 = i12 < length ? 1833 : 1802;
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
                            String strM8071 = C0411.m8071(m6580(), 0, C0038.f58 ^ (-214), 417);
                            boolean zM7033 = C0358.m7033(bundle, strM8071);
                            int i14 = 48767;
                            while (true) {
                                i14 ^= 48784;
                                switch (i14) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        boolM4521 = null;
                                        break;
                                    case 76:
                                        boolM4521 = C0235.m4521(C0132.m2549(bundle, strM8071));
                                        break;
                                    case 239:
                                        if (zM7033) {
                                            i14 = 48860;
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i14 = 48829;
                            }
                            return new o(enumMap, i10, boolM4521, C0132.m2549(bundle, C0039.m760(m6580(), 13, C0456.f727 ^ 717, 3142)));
                        }
                        r5 r5Var = r5VarArrM8137[i12];
                        C0265.m5068(enumMap, r5Var, C0043.m839(C0132.m2549(bundle, C0452.m8823(r5Var))));
                        i12 += C0283.f428 ^ (-413);
                        int i15 = 1864;
                        while (true) {
                            i15 ^= 1881;
                            switch (i15) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i15 = 48674;
                                    break;
                                case 47483:
                                    break;
                            }
                        }
                    }
                    break;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0062. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x009b. Please report as an issue. */
    public static o b(String str) {
        Boolean boolM8876;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = str != null ? 1709 : 1678;
                    break;
                case 204:
                    int iM8181 = C0416.m8181(str);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM8181 <= 0 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                String[] strArrM8842 = C0453.m8842(str, C0290.m5593(m6580(), 28, 1, 3083));
                                int iM1797 = C0084.m1797(strArrM8842[0]);
                                EnumMap enumMap = new EnumMap(r5.class);
                                r5[] r5VarArrM8137 = C0414.m8137(C0444.m8670());
                                int length = r5VarArrM8137.length;
                                int i12 = 1;
                                int i13 = 0;
                                while (true) {
                                    int i14 = 48767;
                                    while (true) {
                                        i14 ^= 48784;
                                        switch (i14) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                break;
                                            case 76:
                                                break;
                                            case 239:
                                                i14 = i13 < length ? 48860 : 48829;
                                                break;
                                            default:
                                                break;
                                        }
                                        return new o(enumMap, iM1797, (Boolean) null, (String) null);
                                    }
                                    r5 r5Var = r5VarArrM8137[i13];
                                    int i15 = C0329.f477;
                                    char cM4352 = C0226.m4352(strArrM8842[i12], 0);
                                    C0179.m3415();
                                    int i16 = 48891;
                                    while (true) {
                                        i16 ^= 48908;
                                        switch (i16) {
                                            case 22:
                                                break;
                                            case 53:
                                                boolM8876 = C0455.m8876();
                                                break;
                                            case 503:
                                                i16 = cM4352 == '0' ? 48953 : 49635;
                                                break;
                                            case 32495:
                                                int i17 = 49666;
                                                while (true) {
                                                    i17 ^= 49683;
                                                    switch (i17) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i17 = cM4352 != '1' ? 49759 : 49728;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 76:
                                                            int i18 = 49790;
                                                            while (true) {
                                                                i18 ^= 49807;
                                                                switch (i18) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        boolM8876 = null;
                                                                        break;
                                                                    case 241:
                                                                        i18 = 49821;
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 83:
                                                            boolM8876 = C0334.m6483();
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
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    C0265.m5068(enumMap, r5Var, boolM8876);
                                    i13 += C0476.f750 ^ 590;
                                    int i20 = (i15 ^ 838) + i12;
                                    int i21 = 50689;
                                    while (true) {
                                        i21 ^= 50706;
                                        switch (i21) {
                                            case 19:
                                                i21 = 50720;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                        }
                                    }
                                    i12 = i20;
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i22 = 1864;
                                while (true) {
                                    i22 ^= 1881;
                                    switch (i22) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i22 = 48674;
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
                    break;
                default:
                    break;
            }
        }
        return C0315.m6115();
    }

    /* JADX INFO: renamed from: ۡ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6580() {
        int iM6500 = C0335.m6500();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6500 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f568short;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x005c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0086. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001b. Please report as an issue. */
    public final String c() {
        char c10;
        StringBuilder sb = new StringBuilder();
        C0197.m3772(sb, C0132.m2548(this));
        r5[] r5VarArrM8137 = C0414.m8137(C0444.m8670());
        int length = r5VarArrM8137.length;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            int i12 = 1616;
            while (true) {
                i12 ^= 1633;
                switch (i12) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i12 = i11 < length ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                return C0440.m8605(sb);
            }
            r5 r5Var = r5VarArrM8137[i11];
            C0142.m2728(sb, C0234.m4516(m6580(), 29, 1, 2087));
            Boolean bool = (Boolean) C0383.m7514(C0019.m387(this), r5Var);
            C0179.m3415();
            int i13 = 1740;
            while (true) {
                i13 ^= 1757;
                switch (i13) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i13 = bool == null ? 1833 : 1802;
                        break;
                    case 54:
                        break;
                    case 471:
                        boolean zM14 = C0000.m14(bool);
                        int i14 = 48767;
                        while (true) {
                            i14 ^= 48784;
                            switch (i14) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    c10 = '0';
                                    break;
                                case 76:
                                    c10 = '1';
                                    int i15 = 48891;
                                    while (true) {
                                        i15 ^= 48908;
                                        switch (i15) {
                                            case 22:
                                                break;
                                            case 503:
                                                i15 = 48922;
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    }
                                    break;
                                case 239:
                                    i14 = zM14 ? 48860 : 48829;
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                        c10 = '-';
                        int i16 = 1864;
                        while (true) {
                            i16 ^= 1881;
                            switch (i16) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i16 = 48674;
                                    break;
                                case 47483:
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
            C0175.m3331(sb, c10);
            i10 = (C0441.f712 ^ (-254)) + i11;
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
        }
    }

    public final boolean equals(Object obj) {
        boolean z10 = obj instanceof o;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!z10) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return false;
                case 239:
                    o oVar = (o) obj;
                    boolean zM5320 = C0276.m5320(C0361.m7096(this), C0361.m7096(oVar));
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM5320) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                Boolean boolM805 = C0041.m805(this);
                                Boolean boolM806 = C0041.m805(oVar);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = boolM805 != boolM806 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        return false;
                                                    case 76:
                                                        boolean zM5257 = C0272.m5257(boolM805, boolM806);
                                                        int i14 = 48891;
                                                        while (true) {
                                                            i14 ^= 48908;
                                                            switch (i14) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    return false;
                                                                case 503:
                                                                    i14 = zM5257 ? 49635 : 48953;
                                                                    break;
                                                                case 32495:
                                                                    int i15 = 49666;
                                                                    while (true) {
                                                                        i15 ^= 49683;
                                                                        switch (i15) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i15 = 49697;
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
                                                        i13 = boolM805 != null ? 48860 : 48829;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                String strM5951 = C0308.m5951(this);
                                String strM5952 = C0308.m5951(oVar);
                                int i16 = 49790;
                                while (true) {
                                    i16 ^= 49807;
                                    switch (i16) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 51:
                                            break;
                                        case 84:
                                            int i17 = 49914;
                                            while (true) {
                                                i17 ^= 49931;
                                                switch (i17) {
                                                    case 497:
                                                        i17 = strM5951 != null ? 50658 : 50627;
                                                        break;
                                                    case 1711:
                                                        break;
                                                    case 1736:
                                                        return false;
                                                    case 1769:
                                                        boolean zM5258 = C0272.m5257(strM5951, strM5952);
                                                        int i18 = 50689;
                                                        while (true) {
                                                            i18 ^= 50706;
                                                            switch (i18) {
                                                                case 19:
                                                                    i18 = zM5258 ? 50782 : 50751;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    return false;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
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
                                        case 241:
                                            i16 = strM5951 != strM5952 ? 49883 : 49852;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                return true;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return false;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final int hashCode() {
        int i10;
        int iM8418;
        Boolean boolM805 = C0041.m805(this);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = boolM805 == null ? 1709 : 1678;
                    break;
                case 204:
                    i10 = 3;
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    Boolean boolM6483 = C0334.m6483();
                    int i13 = 1864;
                    while (true) {
                        i13 ^= 1881;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i13 = boolM805 == boolM6483 ? 48736 : 48705;
                                break;
                            case 47384:
                                i10 = 13;
                                break;
                            case 47417:
                                i10 = 7;
                                int i14 = 48767;
                                while (true) {
                                    i14 ^= 48784;
                                    switch (i14) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 239:
                                            i14 = 48798;
                                            break;
                                        default:
                                            break;
                                    }
                                }
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
        String strM5951 = C0308.m5951(this);
        int i15 = 48891;
        while (true) {
            i15 ^= 48908;
            switch (i15) {
                case 22:
                    break;
                case 53:
                    iM8418 = C0429.m8418(strM5951);
                    break;
                case 503:
                    if (strM5951 == null) {
                        i15 = 49635;
                    }
                    break;
                case 32495:
                    iM8418 = 17;
                    int i16 = 49666;
                    while (true) {
                        i16 ^= 49683;
                        switch (i16) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i16 = 49697;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i15 = 48953;
        }
        return 0 - ((0 - (iM8418 * (C0336.f520 ^ (-974)))) - ((((i10 * (C0437.f708 ^ (-844))) + 26) + C0429.m8418(C0361.m7096(this))) - 26));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0094. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00cc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x00df. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0030. Please report as an issue. */
    public final String toString() {
        String strM626;
        StringBuilder sb = new StringBuilder(C0018.m360(m6580(), 30, C0399.f670 ^ 5, 2833));
        C0142.m2728(sb, C0378.m7411(C0132.m2548(this)));
        r5[] r5VarArrM8137 = C0414.m8137(C0444.m8670());
        int length = r5VarArrM8137.length;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            int i12 = 1616;
            while (true) {
                i12 ^= 1633;
                switch (i12) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i12 = i11 < length ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                Boolean boolM805 = C0041.m805(this);
                int i13 = 49790;
                while (true) {
                    i13 ^= 49807;
                    switch (i13) {
                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case 51:
                            break;
                        case 84:
                            C0142.m2728(sb, C0014.m279(m6580(), 65, C0023.f43 ^ (-954), 395));
                            C0213.m4074(sb, boolM805);
                            break;
                        case 241:
                            if (boolM805 != null) {
                                i13 = 49883;
                            }
                            break;
                        default:
                            continue;
                    }
                    i13 = 49852;
                }
                String strM5951 = C0308.m5951(this);
                int i14 = 49914;
                while (true) {
                    i14 ^= 49931;
                    switch (i14) {
                        case 497:
                            if (strM5951 != null) {
                                i14 = 50658;
                            }
                            break;
                        case 1711:
                            break;
                        case 1736:
                            break;
                        case 1769:
                            C0142.m2728(sb, C0384.m7532(m6580(), 78, C0259.f339 ^ (-877), 2374));
                            C0142.m2728(sb, strM5951);
                            break;
                        default:
                            continue;
                    }
                    i14 = 50627;
                }
                return C0440.m8605(sb);
            }
            r5 r5Var = r5VarArrM8137[i11];
            C0142.m2728(sb, C0251.m4804(m6580(), 37, 1, 2448));
            C0142.m2728(sb, C0452.m8823(r5Var));
            C0142.m2728(sb, C0285.m5503(m6580(), 38, 1, 348));
            Boolean bool = (Boolean) C0383.m7514(C0019.m387(this), r5Var);
            int i15 = 1740;
            while (true) {
                i15 ^= 1757;
                switch (i15) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i15 = bool == null ? 1833 : 1802;
                        break;
                    case 54:
                        break;
                    case 471:
                        boolean zM14 = C0000.m14(bool);
                        int i16 = 48767;
                        while (true) {
                            i16 ^= 48784;
                            switch (i16) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    strM626 = C0032.m626(m6580(), 59, C0160.f184 ^ 749, 878);
                                    break;
                                case 76:
                                    strM626 = C0458.m8935(m6580(), 52, C0181.f205 ^ (-912), 1213);
                                    int i17 = 48891;
                                    while (true) {
                                        i17 ^= 48908;
                                        switch (i17) {
                                            case 22:
                                                break;
                                            case 503:
                                                i17 = 48922;
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    }
                                    break;
                                case 239:
                                    i16 = zM14 ? 48860 : 48829;
                                    break;
                                default:
                                    break;
                            }
                        }
                        C0142.m2728(sb, strM626);
                        break;
                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                        C0142.m2728(sb, C0198.m3789(m6580(), 39, C0275.f391 ^ 982, 2202));
                        int i18 = 1864;
                        while (true) {
                            i18 ^= 1881;
                            switch (i18) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i18 = 48674;
                                    break;
                                case 47483:
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
            i10 = (C0080.f114 ^ (-607)) + i11;
            int i19 = 49666;
            while (true) {
                i19 ^= 49683;
                switch (i19) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i19 = 49697;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
