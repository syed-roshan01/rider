package f0;

import a8.C0009;
import androidx.compose.ui.graphics.C0032;
import androidx.compose.ui.layout.C0035;
import com.auto.accept.data.model.C0071;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.gson.internal.sql.C0208;
import com.google.protobuf.C0209;
import d1.C0214;
import d2.C0216;
import d4.C0218;
import d9.C0226;
import dagger.hilt.C0256;
import dagger.hilt.codegen.C0243;
import dagger.hilt.internal.aggregatedroot.codegen.C0246;
import dagger.hilt.internal.processedrootsentinel.C0252;
import g.C0285;
import g7.C0293;
import h.C0298;
import o7.i2;
import v0.C0441;

/* JADX INFO: loaded from: classes.dex */
public final class f2 implements g2.s {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f357short = {937, 896, 896, 917, 899, 914, 939, 903, 918, 918, 911, 904, 897, 968, 914, 916, 903, 904, 917, 896, 905, 916, 907, 899, 898, 946, 905, 937, 916, 911, 897, 911, 904, 903, 906, 966, 916, 899, 914, 915, 916, 904, 899, 898, 966, 911, 904, 912, 903, 906, 911, 898, 966, 907, 903, 918, 918, 911, 904, 897, 988, 966, 2239, 2226, 2209, 2239, 2896, 2841, 2819, 2896, 2846, 2847, 2820, 2896, 2841, 2846, 2896, 2818, 2833, 2846, 2839, 2837, 2896, 2847, 2838, 2896, 2847, 2818, 2841, 2839, 2841, 2846, 2833, 2844, 2896, 2820, 2837, 2824, 2820, 2896, 2859, 2880, 2908, 2896, 1986, 2027, 2027, 2046, 2024, 2041, 1984, 2028, 2045, 2045, 2020, 2019, 2026, 1955, 2018, 2047, 2020, 2026, 2020, 2019, 2028, 2017, 2009, 2018, 2009, 2047, 2028, 2019, 2046, 2027, 2018, 2047, 2016, 2024, 2025, 1965, 2047, 2024, 2041, 2040, 2047, 2019, 2024, 2025, 1965, 2020, 2019, 2043, 2028, 2017, 2020, 2025, 1965, 2016, 2028, 2045, 2045, 2020, 2019, 2026, 1975, 1965, 2078, 2067, 2048, 2078, 582, 527, 533, 582, 520, 521, 530, 582, 527, 520, 582, 532, 519, 520, 513, 515, 582, 521, 512, 582, 530, 532, 519, 520, 533, 512, 521, 532, 523, 515, 514, 582, 530, 515, 542, 530, 582, 573, 598, 586, 582};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2.s f5701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5703c;

    public f2(g2.s sVar, int i10, int i11) {
        this.f5701a = sVar;
        this.f5702b = i10;
        this.f5703c = i11;
        int iM4108 = C0216.m4108();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4108 >= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0441.m8589("X84")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۤۨۥ, reason: not valid java name and contains not printable characters */
    public static short[] m5186() {
        int iM5722 = C0298.m5722();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5722 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f357short;
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

    @Override // g2.s
    public final int a(int i10) {
        int iM3988 = C0208.m3988(C0200.m3833(this), i10);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (i10 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    int iM3619 = C0189.m3619(this);
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (i10 <= iM3619) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int iM178 = C0009.m178(this);
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i13 = iM3988 >= 0 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            StringBuilder sb = new StringBuilder(C0252.m4804(m5186(), 0, C0214.f237 ^ (-49), 998));
                                            C0197.m3772(sb, i10);
                                            C0142.m2728(sb, C0035.m686(m5186(), 62, C0032.f52 ^ (-742), 2207));
                                            C0197.m3772(sb, iM3988);
                                            C0142.m2728(sb, C0226.m4341(m5186(), 66, C0285.f429 ^ 1022, 2928));
                                            throw new IllegalStateException(C0201.m3852(C0256.m4880(sb, iM178, ']')));
                                        case 47417:
                                            int i14 = 48767;
                                            while (true) {
                                                i14 ^= 48784;
                                                switch (i14) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        StringBuilder sb2 = new StringBuilder(C0252.m4804(m5186(), 0, C0214.f237 ^ (-49), 998));
                                                        C0197.m3772(sb2, i10);
                                                        C0142.m2728(sb2, C0035.m686(m5186(), 62, C0032.f52 ^ (-742), 2207));
                                                        C0197.m3772(sb2, iM3988);
                                                        C0142.m2728(sb2, C0226.m4341(m5186(), 66, C0285.f429 ^ 1022, 2928));
                                                        throw new IllegalStateException(C0201.m3852(C0256.m4880(sb2, iM178, ']')));
                                                    case 76:
                                                        int i15 = 48891;
                                                        while (true) {
                                                            i15 ^= 48908;
                                                            switch (i15) {
                                                                case 22:
                                                                    break;
                                                                case 503:
                                                                    i15 = 48922;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i14 = iM3988 <= iM178 ? 48860 : 48829;
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
                                continue;
                        }
                        i12 = 1802;
                    }
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i11 = 1678;
        }
        return iM3988;
    }

    @Override // g2.s
    public final int b(int i10) {
        int iM4143 = C0218.m4143(C0200.m3833(this), i10);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (i10 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    int iM178 = C0009.m178(this);
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (i10 <= iM178) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int iM3619 = C0189.m3619(this);
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i13 = iM4143 >= 0 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            StringBuilder sb = new StringBuilder(C0209.m4014(m5186(), 104, C0100.f126 ^ (-520), 1933));
                                            C0197.m3772(sb, i10);
                                            C0142.m2728(sb, C0293.m5623(m5186(), 166, C0071.f98 ^ (-534), 2110));
                                            C0197.m3772(sb, iM4143);
                                            C0142.m2728(sb, C0243.m4654(m5186(), 170, C0246.f325 ^ 271, 614));
                                            throw new IllegalStateException(C0201.m3852(C0256.m4880(sb, iM3619, ']')));
                                        case 47417:
                                            int i14 = 48767;
                                            while (true) {
                                                i14 ^= 48784;
                                                switch (i14) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        StringBuilder sb2 = new StringBuilder(C0209.m4014(m5186(), 104, C0100.f126 ^ (-520), 1933));
                                                        C0197.m3772(sb2, i10);
                                                        C0142.m2728(sb2, C0293.m5623(m5186(), 166, C0071.f98 ^ (-534), 2110));
                                                        C0197.m3772(sb2, iM4143);
                                                        C0142.m2728(sb2, C0243.m4654(m5186(), 170, C0246.f325 ^ 271, 614));
                                                        throw new IllegalStateException(C0201.m3852(C0256.m4880(sb2, iM3619, ']')));
                                                    case 76:
                                                        int i15 = 48891;
                                                        while (true) {
                                                            i15 ^= 48908;
                                                            switch (i15) {
                                                                case 22:
                                                                    break;
                                                                case 503:
                                                                    i15 = 48922;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i14 = iM4143 <= iM3619 ? 48860 : 48829;
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
                                continue;
                        }
                        i12 = 1802;
                    }
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i11 = 1678;
        }
        return iM4143;
    }
}
