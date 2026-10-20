package k6;

import androidx.appcompat.widget.C0020;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.draw.C0027;
import c0.C0057;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.tasks.C0106;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0203;
import dagger.hilt.android.components.C0228;
import dagger.hilt.internal.generatesrootinput.C0251;
import e1.C0258;
import f.C0271;
import f4.C0275;
import f6.C0279;
import fa.C0282;
import ja.C0331;
import k7.C0338;
import l2.C0342;
import l8.C0346;
import r5.C0401;
import s7.C0415;
import v0.C0441;

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
        C0282.m5438(str2);
        C0282.m5438(str3);
        C0271.m5173(sVar);
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
                                C0258.m4924(d4VarM3434);
                                C0112.m2169(C0331.m6385(d4VarM3434), C0401.m7834(m6583(), 0, C0165.f189 ^ 356, 2828), C0027.m535(str2), C0027.m535(str3));
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
        int iM5286 = C0275.m5286();
        int i13 = 48767;
        while (true) {
            i13 ^= 48784;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    return;
                case 76:
                    System.out.println(Integer.valueOf(C0228.m4378("PahCGIF")));
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
        To view partially-correct add '--show-bad-code' argument
    */
    public p(k6.f5 r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, long r16, android.os.Bundle r18) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.p.<init>(k6.f5, java.lang.String, java.lang.String, java.lang.String, long, android.os.Bundle):void");
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
        Object obj = "ۤۥۧ";
        while (true) {
            switch (C0124.m2383(obj)) {
                case 1748613:
                    sVarM3193 = C0167.m3193(this);
                    obj = "ۡۥۧ";
                    break;
                case 1748803:
                    this = new p(f5Var, strM3143, strM1087, strM8125, jM2321, j10, sVarM3193);
                    obj = "ۥۣۤ";
                    break;
                case 1749663:
                    strM1087 = C0057.m1087(this);
                    obj = "ۦۤ۟";
                    break;
                case 1751686:
                    strM3143 = C0164.m3143(this);
                    obj = "ۢۢ۟";
                    break;
                case 1752612:
                    return this;
                case 1753569:
                    strM8125 = C0415.m8125(this);
                    obj = "ۣۢۨ";
                    break;
                default:
                    jM2321 = C0120.m2321(this);
                    obj = "ۣۡ۟";
                    break;
            }
        }
    }

    public final String toString() {
        String str = "ۣۢۢ";
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
                    str = "۠ۢ۠";
                    i11 = i10 ^ (-761);
                    break;
                case 1746696:
                    str = "ۣۨ۠";
                    strM4789 = C0441.m8605(sb);
                    break;
                case 1746751:
                    str = "ۣ۟ۥ";
                    strM6634 = C0279.m5391(sArrM6583, 148, 1, 2393);
                    break;
                case 1746817:
                    C0142.m2728(sb, strM6634);
                    str = "۟۟ۨ";
                    break;
                case 1746820:
                    C0142.m2728(sb, strM6634);
                    str = "ۦۤۥ";
                    break;
                case 1746912:
                    i10 = C0342.f612;
                    str = "ۧ۟";
                    break;
                case 1747742:
                    str = "ۣ۟ۨ";
                    strM6634 = C0024.m469(sArrM6583, 138, i11, 1892);
                    break;
                case 1747808:
                    C0142.m2728(sb, strM6634);
                    str = "ۣۨۤ";
                    break;
                case 1747896:
                    str = "ۣ۟ۡ";
                    i11 = i10 ^ 703;
                    break;
                case 1747899:
                    C0142.m2728(sb, strM6634);
                    str = "ۣۧۢ";
                    break;
                case 1748711:
                    str = "ۣۡۧ";
                    strM4789 = C0251.m4789(sVarM3193);
                    break;
                case 1748741:
                    str = "ۤۨ۟";
                    sArrM6583 = m6583();
                    break;
                case 1749697:
                    str = "ۡۢۨ";
                    sVarM3193 = C0167.m3193(this);
                    break;
                case 1749761:
                    str = "ۤ۟ۢ";
                    strM6634 = C0057.m1087(this);
                    break;
                case 1750533:
                    str = "ۨۤۢ";
                    strM6634 = C0203.m3898(sArrM6583, 116, i11, 2910);
                    break;
                case 1750815:
                    str = "۠ۧۢ";
                    strM6634 = C0415.m8125(this);
                    break;
                case 1751495:
                    C0142.m2728(sb, strM6634);
                    str = "ۥۤۥ";
                    break;
                case 1752547:
                    str = "۠ۤۤ";
                    strM6634 = C0338.m6634(sArrM6583, 129, i11, 938);
                    break;
                case 1752614:
                    str = "ۧۡۨ";
                    sArrM6583 = m6583();
                    break;
                case 1753575:
                    C0142.m2728(sb, strM4789);
                    str = "ۧ۟ۡ";
                    break;
                case 1754377:
                    str = "۟ۡۡ";
                    sArrM6583 = m6583();
                    break;
                case 1754446:
                    i10 = C0106.f132;
                    str = "ۨۥۣ";
                    break;
                case 1754472:
                    str = "۟ۦۧ";
                    sArrM6583 = m6583();
                    break;
                case 1755461:
                    return strM4789;
                case 1755494:
                    sb = new StringBuilder(strM6634);
                    str = "ۢۥۤ";
                    break;
                case 1755526:
                    str = "ۥۢ۠";
                    i11 = i10 ^ (-227);
                    break;
                default:
                    i10 = C0346.f616;
                    str = "۠ۧ۟";
                    break;
            }
        }
    }
}
