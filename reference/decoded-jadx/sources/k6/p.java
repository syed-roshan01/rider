package k6;

import a8.C0010;
import android.os.Bundle;
import androidx.appcompat.widget.C0020;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.input.key.C0033;
import c0.C0057;
import c1.C0060;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.tasks.C0106;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.components.C0135;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0203;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.lifecycle.C0236;
import dagger.hilt.internal.generatesrootinput.C0250;
import e1.C0257;
import f.C0270;
import f0.C0272;
import f4.C0274;
import f6.C0278;
import fa.C0281;
import ja.C0330;
import java.util.Iterator;
import k7.C0337;
import l2.C0341;
import l8.C0345;
import la.C0348;
import m1.C0350;
import n.C0361;
import r5.C0400;
import s2.C0411;
import s6.C0413;
import s7.C0414;
import t1.C0419;
import u0.C0430;
import v0.C0440;
import w0.C0454;
import x7.C0471;
import z7.C0488;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f571short = {2889, 2938, 2921, 2914, 2936, 2860, 2927, 2942, 2921, 2925, 2936, 2921, 2920, 2860, 2939, 2917, 2936, 2916, 2860, 2942, 2921, 2938, 2921, 2942, 2943, 2921, 2860, 2940, 2942, 2921, 2938, 2917, 2915, 2937, 2943, 2851, 2927, 2937, 2942, 2942, 2921, 2914, 2936, 2860, 2936, 2917, 2913, 2921, 2943, 2936, 2925, 2913, 2940, 2943, 2850, 2860, 2925, 2940, 2940, 2885, 2920, 2848, 2860, 2914, 2925, 2913, 2921, 2507, 2554, 2537, 2554, 2550, 2491, 2549, 2554, 2550, 2558, 2491, 2552, 2554, 2549, 2492, 2543, 2491, 2553, 2558, 2491, 2549, 2542, 2551, 2551, 3323, 3274, 3289, 3274, 3270, 3211, 3293, 3274, 3271, 3294, 3278, 3211, 3272, 3274, 3269, 3212, 3295, 3211, 3273, 3278, 3211, 3269, 3294, 3271, 3271, 2843, 2856, 2875, 2864, 2858, 2853, 2879, 2862, 2862, 2839, 2874, 2915, 2937, 909, 902, 906, 964, 971, 967, 975, 919, 909, 1859, 1864, 1860, 1812, 1797, 1814, 1797, 1801, 1815, 1881, 2340};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f10266f;

    public p(f5 f5Var, String str, String str2, String str3, long j10, long j11, s sVar) {
        C0281.m5438(str2);
        C0281.m5438(str3);
        C0270.m5173(sVar);
        this.f10261a = str2;
        this.f10262b = str3;
        boolean zM1883 = C0088.m1883(str);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = zM1883 ? 1709 : 1678;
                    break;
                case 204:
                    str = null;
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        this.f10263c = str;
        this.f10264d = j10;
        this.f10265e = j11;
        int i11 = 1740;
        while (true) {
            i11 ^= 1757;
            switch (i11) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i11 = j11 != 0 ? 1833 : 1802;
                    break;
                case 54:
                    break;
                case 471:
                    break;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    int i12 = 1864;
                    while (true) {
                        i12 ^= 1881;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = j11 > j10 ? 48736 : 48705;
                                break;
                            case 47384:
                                break;
                            case 47417:
                                d4 d4VarM3434 = C0180.m3434(f5Var);
                                C0257.m4924(d4VarM3434);
                                C0112.m2169(C0330.m6385(d4VarM3434), C0400.m7834(m6583(), 0, C0165.f189 ^ 356, 2828), C0027.m535(str2), C0027.m535(str3));
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
        this.f10266f = sVar;
        int iM5286 = C0274.m5286();
        int i13 = 48767;
        while (true) {
            i13 ^= 48784;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    return;
                case 76:
                    System.out.println(Integer.valueOf(C0227.m4378("PahCGIF")));
                    return;
                case 239:
                    if (iM5286 >= 0) {
                        i13 = 48860;
                    }
                    break;
                default:
                    continue;
            }
            i13 = 48829;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x004f, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x004f, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x004f, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0057. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(f5 f5Var, String str, String str2, String str3, long j10, Bundle bundle) {
        s sVar;
        C0281.m5438(str2);
        C0281.m5438(str3);
        this.f10261a = str2;
        this.f10262b = str3;
        boolean zM1883 = C0088.m1883(str);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = zM1883 ? 1709 : 1678;
                    break;
                case 204:
                    str = null;
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        this.f10263c = str;
        this.f10264d = j10;
        this.f10265e = 0L;
        boolean zM3729 = C0195.m3729(bundle);
        int i11 = 1740;
        while (true) {
            i11 ^= 1757;
            switch (i11) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i11 = !zM3729 ? 1833 : 1802;
                    break;
                case 54:
                    break;
                case 471:
                    sVar = new s(new Bundle());
                    break;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    Bundle bundle2 = new Bundle(bundle);
                    Iterator itM5256 = C0272.m5256(C0060.m1152(bundle2));
                    while (true) {
                        boolean zM3327 = C0174.m3327(itM5256);
                        int i12 = 1864;
                        while (true) {
                            i12 ^= 1881;
                            switch (i12) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = zM3327 ? 48736 : 48705;
                                    break;
                                case 47384:
                                    break;
                                case 47417:
                                    String str4 = (String) C0413.m8115(itM5256);
                                    int i13 = 48767;
                                    while (true) {
                                        i13 ^= 48784;
                                        switch (i13) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                u7 u7VarM9185 = C0471.m9185(f5Var);
                                                C0236.m4550(u7VarM9185);
                                                Object objM6824 = C0348.m6824(u7VarM9185, C0010.m195(bundle2, str4), str4);
                                                int i14 = 49666;
                                                while (true) {
                                                    i14 ^= 49683;
                                                    switch (i14) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i14 = objM6824 == null ? 49759 : 49728;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 76:
                                                            d4 d4VarM3434 = C0180.m3434(f5Var);
                                                            C0257.m4924(d4VarM3434);
                                                            C0419.m8245(C0330.m6385(d4VarM3434), C0124.m2384(m6583(), 91, C0120.f146 ^ 454, 3243), C0411.m8083(C0171.m3266(f5Var), str4));
                                                            C0350.m6866(itM5256);
                                                            int i15 = 49790;
                                                            while (true) {
                                                                i15 ^= 49807;
                                                                switch (i15) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 241:
                                                                        i15 = 49821;
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 83:
                                                            u7 u7VarM9186 = C0471.m9185(f5Var);
                                                            C0236.m4550(u7VarM9186);
                                                            C0488.m9513(u7VarM9186, bundle2, str4, objM6824);
                                                            int i16 = 49914;
                                                            while (true) {
                                                                i16 ^= 49931;
                                                                switch (i16) {
                                                                    case 497:
                                                                        i16 = 50596;
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
                                            case 76:
                                                d4 d4VarM3435 = C0180.m3434(f5Var);
                                                C0257.m4924(d4VarM3435);
                                                C0135.m2604(C0454.m8871(d4VarM3435), C0033.m647(m6583(), 67, C0361.f632 ^ 57, 2459));
                                                C0350.m6866(itM5256);
                                                int i17 = 48891;
                                                while (true) {
                                                    i17 ^= 48908;
                                                    switch (i17) {
                                                        case 22:
                                                            break;
                                                        case 503:
                                                            i17 = 48922;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 239:
                                                i13 = str4 == null ? 48860 : 48829;
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
                            sVar = new s(bundle2);
                            int i18 = 50689;
                            while (true) {
                                i18 ^= 50706;
                                switch (i18) {
                                    case 19:
                                        i18 = 50720;
                                        continue;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    default:
                                        continue;
                                }
                            }
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        this.f10266f = sVar;
        int iM1735 = C0081.m1735();
        int i19 = 50813;
        while (true) {
            i19 ^= 50830;
            switch (i19) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 53:
                    return;
                case 243:
                    if (iM1735 <= 0) {
                        i19 = 51557;
                    }
                    break;
                case 4075:
                    System.out.println(Integer.parseInt(C0430.m8424("XiOiOnaEr")));
                    return;
                default:
                    continue;
            }
            i19 = 50875;
        }
    }

    /* JADX INFO: renamed from: ۣۨۡۡ, reason: not valid java name and contains not printable characters */
    public static short[] m6583() {
        int iM399 = C0020.m399();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM399 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f571short;
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

    public final p a(f5 f5Var, long j10) {
        long jM2321 = 0;
        String strM1087 = null;
        String strM3143 = null;
        String strM8125 = null;
        s sVarM3193 = null;
        Object obj = "\u06e4\u06e5\u06e7";
        while (true) {
            switch (C0124.m2383(obj)) {
                case 1748613:
                    sVarM3193 = C0167.m3193(this);
                    obj = "\u06e1\u06e5\u06e7";
                    break;
                case 1748803:
                    this = new p(f5Var, strM3143, strM1087, strM8125, jM2321, j10, sVarM3193);
                    obj = "\u06e5\u06e4\u06e3";
                    break;
                case 1749663:
                    strM1087 = C0057.m1087(this);
                    obj = "\u06e6\u06e4\u06df";
                    break;
                case 1751686:
                    strM3143 = C0164.m3143(this);
                    obj = "\u06e2\u06e2\u06df";
                    break;
                case 1752612:
                    return this;
                case 1753569:
                    strM8125 = C0414.m8125(this);
                    obj = "\u06e3\u06e2\u06e8";
                    break;
                default:
                    jM2321 = C0120.m2321(this);
                    obj = "\u06e1\u06df\u06e3";
                    break;
            }
        }
    }

    public final String toString() {
        String str = "\u06e2\u06e3\u06e2";
        StringBuilder sb = null;
        s sVarM3193 = null;
        String strM4789 = null;
        short[] sArrM6583 = null;
        String strM6634 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56536:
                    str = "\u06e0\u06e2\u06e0";
                    i11 = i10 ^ (-761);
                    break;
                case 1746696:
                    str = "\u06e8\u06e3\u06e0";
                    strM4789 = C0440.m8605(sb);
                    break;
                case 1746751:
                    str = "\u06df\u06e3\u06e5";
                    strM6634 = C0278.m5391(sArrM6583, 148, 1, 2393);
                    break;
                case 1746817:
                    C0142.m2728(sb, strM6634);
                    str = "\u06df\u06df\u06e8";
                    break;
                case 1746820:
                    C0142.m2728(sb, strM6634);
                    str = "\u06e6\u06e4\u06e5";
                    break;
                case 1746912:
                    i10 = C0341.f612;
                    str = "\u06e7\u06df";
                    break;
                case 1747742:
                    str = "\u06df\u06e3\u06e8";
                    strM6634 = C0024.m469(sArrM6583, 138, i11, 1892);
                    break;
                case 1747808:
                    C0142.m2728(sb, strM6634);
                    str = "\u06e3\u06e8\u06e4";
                    break;
                case 1747896:
                    str = "\u06e3\u06df\u06e1";
                    i11 = i10 ^ 703;
                    break;
                case 1747899:
                    C0142.m2728(sb, strM6634);
                    str = "\u06e7\u06e2\u06e3";
                    break;
                case 1748711:
                    str = "\u06e1\u06e3\u06e7";
                    strM4789 = C0250.m4789(sVarM3193);
                    break;
                case 1748741:
                    str = "\u06e4\u06e8\u06df";
                    sArrM6583 = m6583();
                    break;
                case 1749697:
                    str = "\u06e1\u06e2\u06e8";
                    sVarM3193 = C0167.m3193(this);
                    break;
                case 1749761:
                    str = "\u06e4\u06df\u06e2";
                    strM6634 = C0057.m1087(this);
                    break;
                case 1750533:
                    str = "\u06e8\u06e4\u06e2";
                    strM6634 = C0203.m3898(sArrM6583, 116, i11, 2910);
                    break;
                case 1750815:
                    str = "\u06e0\u06e7\u06e2";
                    strM6634 = C0414.m8125(this);
                    break;
                case 1751495:
                    C0142.m2728(sb, strM6634);
                    str = "\u06e5\u06e4\u06e5";
                    break;
                case 1752547:
                    str = "\u06e0\u06e4\u06e4";
                    strM6634 = C0337.m6634(sArrM6583, 129, i11, 938);
                    break;
                case 1752614:
                    str = "\u06e7\u06e1\u06e8";
                    sArrM6583 = m6583();
                    break;
                case 1753575:
                    C0142.m2728(sb, strM4789);
                    str = "\u06e7\u06df\u06e1";
                    break;
                case 1754377:
                    str = "\u06df\u06e1\u06e1";
                    sArrM6583 = m6583();
                    break;
                case 1754446:
                    i10 = C0106.f132;
                    str = "\u06e8\u06e5\u06e3";
                    break;
                case 1754472:
                    str = "\u06df\u06e6\u06e7";
                    sArrM6583 = m6583();
                    break;
                case 1755461:
                    return strM4789;
                case 1755494:
                    sb = new StringBuilder(strM6634);
                    str = "\u06e2\u06e5\u06e4";
                    break;
                case 1755526:
                    str = "\u06e5\u06e2\u06e0";
                    i11 = i10 ^ (-227);
                    break;
                default:
                    i10 = C0345.f616;
                    str = "\u06e0\u06e7\u06df";
                    break;
            }
        }
    }
}
