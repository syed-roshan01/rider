package k6;

import a.C0000;
import android.support.v4.app.C0014;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.foundation.relocation.C0024;
import b4.C0052;
import c3.C0062;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import d1.C0213;
import d1.C0214;
import d9.C0227;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.android.internal.migration.C0233;
import dagger.hilt.codegen.C0242;
import dagger.hilt.internal.C0253;
import dagger.hilt.internal.generatesrootinput.C0251;
import e2.C0262;
import ea.C0269;
import f.C0271;
import fa.C0282;
import g2.C0288;
import g9.C0295;
import h.C0299;
import h4.C0305;
import h5.C0308;
import h5.C0309;
import h7.C0312;
import i4.C0318;
import j2.C0325;
import j5.C0328;
import ja.C0331;
import k1.C0333;
import k3.C0335;
import l0.C0341;
import l3.C0343;
import m7.C0357;
import n8.C0366;
import n9.C0367;
import p5.C0378;
import r1.C0394;
import s7.C0416;
import s8.C0417;
import t0.C0419;
import u8.C0439;
import v.C0440;
import v0.C0441;
import v5.C0445;
import w0.C0455;
import w1.C0456;
import w2.C0457;
import w4.C0462;
import w9.C0466;
import x0.C0467;
import x7.C0472;
import z7.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class d4 extends o5 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f534short = {3052, 726, 726, 726, 2285, 2295, 1114, 1088, 1950, 1938, 1893, 1890, 2525, 2541, 2534, 2539, 2538, 2555, 2530, 2539, 2556, 2478, 2528, 2529, 2554, 2478, 2557, 2539, 2554, 2464, 2478, 2496, 2529, 2554, 2478, 2530, 2529, 2537, 2537, 2535, 2528, 2537, 2478, 2539, 2556, 2556, 2529, 2556, 2465, 2553, 2543, 2556, 2528, 2274, 2258, 2265, 2260, 2261, 2244, 2269, 2260, 2243, 2193, 2271, 2270, 2245, 2193, 2264, 2271, 2264, 2245, 2264, 2256, 2269, 2264, 2251, 2260, 2261, 2207, 2193, 2303, 2270, 2245, 2193, 2269, 2270, 2262, 2262, 2264, 2271, 2262, 2193, 2260, 2243, 2243, 2270, 2243, 2206, 2246, 2256, 2243, 2271};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char f9961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f9963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f4 f9964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f4 f9965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f4 f9966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f4 f9967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f4 f9968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f4 f9969k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f4 f9970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f4 f9971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f4 f9972n;

    public d4(f5 f5Var) {
        super(f5Var);
        this.f9961c = (char) 0;
        this.f9962d = -1L;
        int i10 = C0318.f465 ^ 339;
        this.f9964f = new f4(this, i10, false, false);
        this.f9965g = new f4(this, i10, true, false);
        this.f9966h = new f4(this, i10, false, true);
        int i11 = C0024.f44 ^ 530;
        this.f9967i = new f4(this, i11, false, false);
        this.f9968j = new f4(this, i11, true, false);
        this.f9969k = new f4(this, i11, false, true);
        this.f9970l = new f4(this, C0328.f475 ^ (-815), false, false);
        this.f9971m = new f4(this, C0242.f321 ^ (-807), false, false);
        this.f9972n = new f4(this, C0052.f72 ^ 931, false, false);
        int iM3621 = C0189.m3621();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3621 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0288.m5524("m0rqeDdm13bGuYIz5KwEk")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    public static String p(Object obj, boolean z10) {
        Object objM8554;
        String strM9082;
        String str;
        String strM8581 = C0440.m8581();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (obj == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return strM8581;
                case 239:
                    boolean z11 = obj instanceof Integer;
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = z11 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                objM8554 = obj;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                objM8554 = C0439.m8554(C0367.m7190((Integer) obj));
                                break;
                            default:
                                break;
                        }
                    }
                    boolean z12 = objM8554 instanceof Long;
                    String strM5933 = C0308.m5933(m6546(), 0, 1, 3009);
                    int i12 = 1864;
                    while (true) {
                        i12 ^= 1881;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (z12) {
                                    i12 = 48736;
                                }
                                break;
                            case 47384:
                                boolean z13 = objM8554 instanceof Boolean;
                                int i13 = 49790;
                                while (true) {
                                    i13 ^= 49807;
                                    switch (i13) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 51:
                                            boolean z14 = objM8554 instanceof Throwable;
                                            int i14 = 49914;
                                            while (true) {
                                                i14 ^= 49931;
                                                switch (i14) {
                                                    case 497:
                                                        if (z14) {
                                                            i14 = 50658;
                                                        }
                                                        break;
                                                    case 1711:
                                                        break;
                                                    case 1736:
                                                        boolean z15 = objM8554 instanceof h4;
                                                        int i15 = 53634;
                                                        while (true) {
                                                            i15 ^= 53651;
                                                            switch (i15) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (z15) {
                                                                        i15 = 53727;
                                                                    }
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    return C0357.m6991((h4) objM8554);
                                                                case 83:
                                                                    int i16 = 53758;
                                                                    while (true) {
                                                                        i16 ^= 53775;
                                                                        switch (i16) {
                                                                            case 1009:
                                                                                if (z10) {
                                                                                    i16 = 54502;
                                                                                }
                                                                                break;
                                                                            case 1703:
                                                                                break;
                                                                            case 1736:
                                                                                return C0251.m4789(objM8554);
                                                                            case 1769:
                                                                                return strM5933;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i16 = 54471;
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i15 = 53696;
                                                        }
                                                        break;
                                                    case 1769:
                                                        Throwable th = (Throwable) objM8554;
                                                        int i17 = 50689;
                                                        while (true) {
                                                            i17 ^= 50706;
                                                            switch (i17) {
                                                                case 19:
                                                                    i17 = z10 ? 50782 : 50751;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    strM9082 = C0467.m9082(th);
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    strM9082 = C0213.m4048(C0014.m280(th));
                                                                    int i18 = 50813;
                                                                    while (true) {
                                                                        i18 ^= 50830;
                                                                        switch (i18) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 243:
                                                                                i18 = 50844;
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
                                                        StringBuilder sb = new StringBuilder(strM9082);
                                                        String strM9171 = C0472.m9171(C0269.m5119(f5.class));
                                                        StackTraceElement[] stackTraceElementArrM2110 = C0109.m2110(th);
                                                        int length = stackTraceElementArrM2110.length;
                                                        int i19 = 0;
                                                        while (true) {
                                                            int i20 = 51588;
                                                            while (true) {
                                                                i20 ^= 51605;
                                                                switch (i20) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i20 = i19 < length ? 51681 : 51650;
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 87:
                                                                        break;
                                                                    case 116:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            StackTraceElement stackTraceElement = stackTraceElementArrM2110[i19];
                                                            boolean zM3781 = C0197.m3781(stackTraceElement);
                                                            int i21 = 51712;
                                                            while (true) {
                                                                i21 ^= 51729;
                                                                switch (i21) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i21 = !zM3781 ? 51805 : 51774;
                                                                        break;
                                                                    case 47:
                                                                        break;
                                                                    case 76:
                                                                        String strM3553 = C0186.m3553(stackTraceElement);
                                                                        int i22 = 51836;
                                                                        while (true) {
                                                                            i22 ^= 51853;
                                                                            switch (i22) {
                                                                                case 241:
                                                                                    i22 = strM3553 != null ? 52580 : 52549;
                                                                                    break;
                                                                                case 1963:
                                                                                    break;
                                                                                case 1992:
                                                                                    break;
                                                                                case 2025:
                                                                                    boolean zM321 = C0016.m321(C0472.m9171(strM3553), strM9171);
                                                                                    int i23 = 52611;
                                                                                    while (true) {
                                                                                        i23 ^= 52628;
                                                                                        switch (i23) {
                                                                                            case 23:
                                                                                                i23 = zM321 ? 52704 : 52673;
                                                                                                break;
                                                                                            case 54:
                                                                                                break;
                                                                                            case 85:
                                                                                                break;
                                                                                            case 116:
                                                                                                C0142.m2728(sb, C0333.m6448(m6546(), 4, C0312.f459 ^ 750, 2263));
                                                                                                C0214.m4074(sb, stackTraceElement);
                                                                                                int i24 = 52735;
                                                                                                while (true) {
                                                                                                    i24 ^= 52752;
                                                                                                    switch (i24) {
                                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                                            break;
                                                                                                        case 1007:
                                                                                                            i24 = 52766;
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
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            i19 += C0132.f158 ^ (-216);
                                                            int i25 = 53510;
                                                            while (true) {
                                                                i25 ^= 53527;
                                                                switch (i25) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i25 = 53541;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        return C0441.m8605(sb);
                                                    default:
                                                        continue;
                                                }
                                                i14 = 50627;
                                            }
                                            break;
                                        case 84:
                                            return C0251.m4789(objM8554);
                                        case 241:
                                            if (z13) {
                                                i13 = 49883;
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i13 = 49852;
                                }
                                break;
                            case 47417:
                                int i26 = 48767;
                                while (true) {
                                    i26 ^= 48784;
                                    switch (i26) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            Long l10 = (Long) objM8554;
                                            long jM6486 = C0335.m6486(C0491.m9543(l10));
                                            int i27 = 48891;
                                            while (true) {
                                                i27 ^= 48908;
                                                switch (i27) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        char cM4352 = C0227.m4352(C0251.m4789(objM8554), 0);
                                                        int i28 = 49666;
                                                        while (true) {
                                                            i28 ^= 49683;
                                                            switch (i28) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i28 = cM4352 == '-' ? 49759 : 49728;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    str = strM5933;
                                                                    break;
                                                                case 83:
                                                                    str = strM8581;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        String strM477 = C0024.m477(C0335.m6486(C0491.m9543(l10)));
                                                        long jM3526 = C0185.m3526(C0062.m1203(10.0d, C0417.m8181(strM477) + (C0062.f82 ^ (-323))));
                                                        long jM3527 = C0185.m3526(((C0062.m1203(10.0d, C0417.m8181(strM477)) - 25.0d) - 1.0d) + 25.0d);
                                                        StringBuilder sb2 = new StringBuilder();
                                                        C0142.m2728(sb2, str);
                                                        C0341.m6676(sb2, jM3526);
                                                        C0142.m2728(sb2, C0188.m3587(m6546(), 1, C0309.f456 ^ (-239), 760));
                                                        C0142.m2728(sb2, str);
                                                        C0341.m6676(sb2, jM3527);
                                                        return C0441.m8605(sb2);
                                                    case 503:
                                                        if (jM6486 < 100) {
                                                            i27 = 49635;
                                                        }
                                                        break;
                                                    case 32495:
                                                        return C0251.m4789(objM8554);
                                                    default:
                                                        continue;
                                                }
                                                i27 = 48953;
                                            }
                                            break;
                                        case 76:
                                            return C0251.m4789(objM8554);
                                        case 239:
                                            if (!z10) {
                                                i26 = 48860;
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i26 = 48829;
                                }
                                break;
                            case 47483:
                                break;
                            default:
                                continue;
                        }
                        i12 = 48705;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public static String q(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String strM8581 = C0440.m8581();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = str == null ? 1709 : 1678;
                    break;
                case 204:
                    str = strM8581;
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        String strM4542 = C0236.m4542(obj, z10);
        String strM4543 = C0236.m4542(obj2, z10);
        String strM4544 = C0236.m4542(obj3, z10);
        StringBuilder sb = new StringBuilder();
        boolean zM1883 = C0088.m1883(str);
        int i11 = 1740;
        while (true) {
            i11 ^= 1757;
            switch (i11) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (!zM1883) {
                        i11 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    break;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    C0142.m2728(sb, str);
                    strM8581 = C0295.m5660(m6546(), 6, C0282.f426 ^ 811, 1120);
                    break;
                default:
                    continue;
            }
            i11 = 1802;
        }
        boolean zM1884 = C0088.m1883(strM4542);
        String strM4443 = C0232.m4443(m6546(), 8, C0232.f311 ^ (-199), 1970);
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i12 = !zM1884 ? 48736 : 48705;
                    break;
                case 47384:
                    break;
                case 47417:
                    C0142.m2728(sb, strM8581);
                    C0142.m2728(sb, strM4542);
                    strM8581 = strM4443;
                    break;
                case 47483:
                    break;
                default:
                    break;
            }
        }
        boolean zM1885 = C0088.m1883(strM4543);
        int i13 = 48767;
        while (true) {
            i13 ^= 48784;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    strM4443 = strM8581;
                    break;
                case 76:
                    C0142.m2728(sb, strM8581);
                    C0142.m2728(sb, strM4543);
                    int i14 = 48891;
                    while (true) {
                        i14 ^= 48908;
                        switch (i14) {
                            case 22:
                                break;
                            case 503:
                                i14 = 48922;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    i13 = !zM1885 ? 48860 : 48829;
                    break;
                default:
                    break;
            }
        }
        boolean zM1886 = C0088.m1883(strM4544);
        int i15 = 49666;
        while (true) {
            i15 ^= 49683;
            switch (i15) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (!zM1886) {
                        i15 = 49759;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    C0142.m2728(sb, strM4443);
                    C0142.m2728(sb, strM4544);
                    break;
                case 83:
                    break;
                default:
                    continue;
            }
            i15 = 49728;
        }
        return C0441.m8605(sb);
    }

    public static h4 r(String str) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (str == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return null;
                case 239:
                    return new h4(str);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public static String u(String str) {
        boolean zM1883 = C0088.m1883(str);
        String strM8581 = C0440.m8581();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM1883) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return strM8581;
                case 239:
                    int iM7401 = C0378.m7401(str, C0228.f307 ^ (-930));
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM7401 == -1) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return C0125.m2418(str, 0, iM7401);
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean zM2633 = C0136.m2633();
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (zM2633) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            return str;
                                        case 47417:
                                            boolean zM14 = C0000.m14((Boolean) C0262.m4995(C0074.m1618(), null));
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        return str;
                                                    case 76:
                                                        return strM8581;
                                                    case 239:
                                                        if (zM14) {
                                                            i13 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i13 = 48829;
                                            }
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i12 = 48705;
                                }
                                break;
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

    /* JADX INFO: renamed from: ۤۥۤۥ, reason: not valid java name and contains not printable characters */
    public static short[] m6546() {
        int iM8890 = C0457.m8890();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8890 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f534short;
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

    public final String A() {
        String strM8990;
        String strM8879;
        synchronized (this) {
            try {
                String strM8991 = C0462.m8990(this);
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (strM8991 == null) {
                                i10 = 1709;
                            }
                            break;
                        case 204:
                            Object objM3121 = C0163.m3121(this);
                            String strM2828 = C0148.m2828((f5) objM3121);
                            int i11 = 1740;
                            while (true) {
                                i11 ^= 1757;
                                switch (i11) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i11 = strM2828 != null ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        strM8879 = C0456.m8879(m6546(), 10, C0419.f689 ^ 231, 1827);
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        strM8879 = C0148.m2828((f5) objM3121);
                                        int i12 = 1864;
                                        while (true) {
                                            i12 ^= 1881;
                                            switch (i12) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                            this.f9963e = strM8879;
                            int i13 = 48767;
                            while (true) {
                                i13 ^= 48784;
                                switch (i13) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case 239:
                                        i13 = 48798;
                                        break;
                                }
                            }
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i10 = 1678;
                }
                C0271.m5173(C0462.m8990(this));
                strM8990 = C0462.m8990(this);
            } catch (Throwable th) {
                int i14 = 48891;
                while (true) {
                    i14 ^= 48908;
                    switch (i14) {
                        case 22:
                            throw th;
                        case 503:
                            i14 = 48922;
                            break;
                    }
                }
            }
        }
        return strM8990;
    }

    @Override // k6.o5
    public final boolean o() {
        return false;
    }

    public final void s(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        int i11;
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i12 = !z10 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM8162 = C0416.m8162(this, i10);
                    int i13 = 1740;
                    while (true) {
                        i13 ^= 1757;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i13 = zM8162 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0253.m4825(i10, C0325.m6282(this), C0394.m7707(false, str, obj, obj2, obj3));
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
        int i14 = 1864;
        while (true) {
            i14 ^= 1881;
            switch (i14) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (!z11) {
                        i14 = 48736;
                    }
                    break;
                case 47384:
                    return;
                case 47417:
                    int i15 = 48767;
                    while (true) {
                        i15 ^= 48784;
                        switch (i15) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                return;
                            case 76:
                                C0271.m5173(str);
                                z4 z4VarM8666 = C0445.m8666((f5) C0163.m3121(this));
                                int i16 = C0082.f116 ^ 383;
                                int i17 = 48891;
                                while (true) {
                                    i17 ^= 48908;
                                    switch (i17) {
                                        case 22:
                                            break;
                                        case 53:
                                            boolean zM3353 = C0176.m3353(z4VarM8666);
                                            int i18 = 49790;
                                            while (true) {
                                                i18 ^= 49807;
                                                switch (i18) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        int i19 = 49914;
                                                        while (true) {
                                                            i19 ^= 49931;
                                                            switch (i19) {
                                                                case 497:
                                                                    i19 = i10 < 0 ? 50658 : 50627;
                                                                    break;
                                                                case 1711:
                                                                    break;
                                                                case 1736:
                                                                    break;
                                                                case 1769:
                                                                    i10 = 0;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        int i20 = 50689;
                                                        while (true) {
                                                            i20 ^= 50706;
                                                            switch (i20) {
                                                                case 19:
                                                                    i20 = i10 >= 9 ? 50782 : 50751;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    i11 = i10;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    i11 = 8;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        C0343.m6719(z4VarM8666, new androidx.fragment.app.n1(this, i11, str, obj, obj2, obj3, 1));
                                                        return;
                                                    case 84:
                                                        C0253.m4825(i16, C0325.m6282(this), C0233.m4477(m6546(), 53, C0016.f36 ^ (-859), 2225));
                                                        return;
                                                    case 241:
                                                        if (!zM3353) {
                                                            i18 = 49883;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i18 = 49852;
                                            }
                                            break;
                                        case 503:
                                            if (z4VarM8666 == null) {
                                                i17 = 49635;
                                            }
                                            break;
                                        case 32495:
                                            C0253.m4825(i16, C0325.m6282(this), C0366.m7163(m6546(), 12, C0299.f446 ^ (-164), 2446));
                                            int iM2205 = C0114.m2205();
                                            int i21 = 49666;
                                            while (true) {
                                                i21 ^= 49683;
                                                switch (i21) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (iM2205 >= 0) {
                                                            i21 = 49759;
                                                        }
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        System.out.println(Double.valueOf(C0231.m4433("d9xz7hrEIuMWkQjoKGULmTiAXVO")));
                                                        return;
                                                    case 83:
                                                        return;
                                                    default:
                                                        continue;
                                                }
                                                i21 = 49728;
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i17 = 48953;
                                }
                                break;
                            case 239:
                                if (i10 >= 5) {
                                    i15 = 48860;
                                }
                                break;
                            default:
                                continue;
                        }
                        i15 = 48829;
                    }
                    break;
                case 47483:
                    break;
                default:
                    continue;
            }
            i14 = 48705;
        }
    }

    public final boolean t(int i10) {
        return C0305.m5870(C0325.m6282(this), i10);
    }

    public final f4 v() {
        return C0466.m9073(this);
    }

    public final f4 w() {
        return C0455.m8871(this);
    }

    public final f4 x() {
        return C0136.m2634(this);
    }

    public final f4 y() {
        return C0331.m6385(this);
    }

    public final f4 z() {
        return C0472.m9169(this);
    }
}
