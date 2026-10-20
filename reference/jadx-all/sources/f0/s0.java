package f0;

import androidx.activity.C0017;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.ui.draw.C0029;
import androidx.versionedparcelable.C0048;
import c3.C0062;
import c4.C0064;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.datatransport.cct.C0076;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import d1.C0214;
import dagger.hilt.android.components.C0229;
import dagger.hilt.components.C0244;
import e0.C0257;
import e1.C0259;
import g7.C0293;
import h1.C0301;
import k3.C0336;
import m1.C0351;
import o7.i2;
import q5.C0386;
import r5.C0400;
import r6.C0402;
import s0.C0411;
import t2.C0421;
import u1.C0432;
import v0.C0441;
import w.C0454;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements r1.v {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f377short = {2301, 2266, 2247, 2268, 2255, 2266, 2267, 2241, 2260, 2265, 2278, 2262, 2247, 2266, 2265, 2265, 2297, 2260, 2252, 2266, 2240, 2241, 2296, 2266, 2257, 2268, 2259, 2268, 2256, 2247, 2205, 2246, 2262, 2247, 2266, 2265, 2265, 2256, 2247, 2277, 2266, 2246, 2268, 2241, 2268, 2266, 2267, 2184, 2880, 2892, 2831, 2841, 2846, 2847, 2819, 2846, 2851, 2826, 2826, 2847, 2825, 2840, 2897, 2954, 2950, 3026, 3028, 3015, 3016, 3029, 3008, 3017, 3028, 3019, 3011, 3010, 3058, 3011, 3038, 3026, 2971, 1248, 1260, 1208, 1193, 1204, 1208, 1152, 1197, 1205, 1187, 1209, 1208, 1182, 1193, 1215, 1209, 1184, 1208, 1180, 1214, 1187, 1210, 1189, 1192, 1193, 1214, 1265};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2 f5891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g2.i0 f5893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.a f5894e;

    public s0(a2 a2Var, int i10, g2.i0 i0Var, t.l0 l0Var) {
        this.f5891b = a2Var;
        this.f5892c = i10;
        this.f5893d = i0Var;
        this.f5894e = l0Var;
        int iM332 = C0017.m332();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM332 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0402.m7880("c2XaLoQqeGW74lfd9nc")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۡ, reason: not valid java name and contains not printable characters */
    public static short[] m5205() {
        int iM1243 = C0064.m1243();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1243 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f377short;
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

    public final boolean equals(Object obj) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (this == obj) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return true;
                case 239:
                    boolean z10 = obj instanceof s0;
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!z10) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                s0 s0Var = (s0) obj;
                                boolean zM4399 = C0229.m4399(C0078.m1679(this), C0078.m1679(s0Var));
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (!zM4399) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            int iM4897 = C0257.m4897(this);
                                            int iM4898 = C0257.m4897(s0Var);
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        boolean zM43910 = C0229.m4399(C0090.m1919(this), C0090.m1919(s0Var));
                                                        int i14 = 48891;
                                                        while (true) {
                                                            i14 ^= 48908;
                                                            switch (i14) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    boolean zM43911 = C0229.m4399(C0293.m5626(this), C0293.m5626(s0Var));
                                                                    int i15 = 49666;
                                                                    while (true) {
                                                                        i15 ^= 49683;
                                                                        switch (i15) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (!zM43911) {
                                                                                    i15 = 49759;
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 76:
                                                                                return false;
                                                                            case 83:
                                                                                return true;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i15 = 49728;
                                                                    }
                                                                    break;
                                                                case 503:
                                                                    if (!zM43910) {
                                                                        i14 = 49635;
                                                                    }
                                                                    break;
                                                                case 32495:
                                                                    return false;
                                                                default:
                                                                    continue;
                                                            }
                                                            i14 = 48953;
                                                        }
                                                        break;
                                                    case 76:
                                                        return false;
                                                    case 239:
                                                        if (iM4897 != iM4898) {
                                                            i13 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i13 = 48829;
                                            }
                                            break;
                                        case 47417:
                                            return false;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i12 = 48705;
                                }
                                break;
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

    @Override // r1.v
    public final r1.k0 f(r1.l0 l0Var, r1.i0 i0Var, long j10) {
        long jM3547;
        int i10 = 0;
        int iM420 = C0021.m420(i0Var, C0432.m8451(j10));
        int iM3212 = C0168.m3212(j10);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM420 < iM3212) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = 1771;
                                break;
                            case 54:
                                jM3547 = j10;
                                break;
                        }
                    }
                    break;
                case 239:
                    jM3547 = C0186.m3547(j10, 0, Integer.MAX_VALUE, 0, 0, C0244.f323 ^ 125);
                    break;
                default:
                    continue;
            }
            i11 = 1678;
        }
        r1.x0 x0VarM8844 = C0454.m8844(i0Var, jM3547);
        int iM1191 = C0062.m1191(C0076.m1647(x0VarM8844), C0168.m3212(j10));
        return C0411.m8048(l0Var, iM1191, C0351.m6867(x0VarM8844), C0127.m2452(), new r0(iM1191, i10, l0Var, this, x0VarM8844));
    }

    public final int hashCode() {
        String str = "ۡۤ۠";
        c9.a aVarM5626 = null;
        a2 a2VarM1679 = null;
        g2.i0 i0VarM1919 = null;
        int i10 = 0;
        int iM7548 = 0;
        int iM4897 = 0;
        int iM2842 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56358:
                    str = "۠ۥۢ";
                    i0VarM1919 = C0090.m1919(this);
                    break;
                case 56414:
                    str = "ۧۥ";
                    iM2842 = C0148.m2842(aVarM5626);
                    break;
                case 56444:
                    str = "ۧۢۨ";
                    iM2842 = C0107.f133;
                    break;
                case 56542:
                    str = "۠۠ۡ";
                    iM4897 = iM2842 + 13;
                    break;
                case 1747681:
                    i10 = iM4897 + iM7548;
                    str = "ۦۣۦ";
                    break;
                case 1747837:
                    str = "ۥۧ۠";
                    iM4897 = C0073.m1571(i0VarM1919);
                    break;
                case 1747872:
                    return iM2842;
                case 1748703:
                    str = "ۦ۠۟";
                    iM2842 = iM4897 * i10;
                    break;
                case 1748765:
                    str = "ۣۤ۠";
                    a2VarM1679 = C0078.m1679(this);
                    break;
                case 1750601:
                    str = "ۤۡۢ";
                    iM4897 = iM7548 - iM2842;
                    break;
                case 1751527:
                    str = "ۤ۠";
                    iM4897 = C0148.m2842(a2VarM1679);
                    break;
                case 1751557:
                    str = "ۨ۟ۨ";
                    iM7548 = iM4897 * i10;
                    break;
                case 1753445:
                    str = "ۦۣۡ";
                    iM4897 = C0257.m4897(this);
                    break;
                case 1753480:
                    str = "ۡۧ";
                    iM7548 = C0386.m7548(iM4897, iM2842, i10);
                    break;
                case 1753545:
                    str = "۠ۦۦ";
                    iM2842 = i10 - 13;
                    break;
                case 1754477:
                    i10 = iM2842 ^ (-713);
                    str = "ۡۢ۠";
                    break;
                case 1755345:
                    aVarM5626 = C0293.m5626(this);
                    str = "ۣۡ";
                    break;
                default:
                    str = "ۣۡۧ";
                    iM2842 = 0 - iM4897;
                    break;
            }
        }
    }

    public final String toString() {
        String str = "ۡۨ۟";
        c9.a aVarM5626 = null;
        StringBuilder sb = null;
        g2.i0 i0VarM1919 = null;
        a2 a2VarM1679 = null;
        short[] sArrM5205 = null;
        String strM921 = null;
        int i10 = 0;
        int iM4897 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56508:
                    str = "ۡۧۦ";
                    strM921 = C0048.m921(sArrM5205, 81, iM4897, 1228);
                    break;
                case 56540:
                    C0197.m3772(sb, iM4897);
                    str = "ۧۦۣ";
                    break;
                case 1746752:
                    iM4897 = i10 ^ 16;
                    str = "ۤۡ۟";
                    break;
                case 1746788:
                    i10 = iM4897 ^ (-619);
                    str = "۠ۥۨ";
                    break;
                case 1746814:
                    str = "ۢۡۥ";
                    i0VarM1919 = C0090.m1919(this);
                    break;
                case 1746820:
                    C0142.m2728(sb, strM921);
                    str = "۟ۦ۟";
                    break;
                case 1746904:
                    iM4897 = C0257.m4897(this);
                    str = "ۣۧ";
                    break;
                case 1746966:
                    C0214.m4074(sb, aVarM5626);
                    str = "ۨۤۦ";
                    break;
                case 1747719:
                    C0214.m4074(sb, a2VarM1679);
                    str = "ۦۡۧ";
                    break;
                case 1747843:
                    str = "ۣ۟ۨ";
                    strM921 = C0301.m5777(sArrM5205, 48, i10, 2924);
                    break;
                case 1748864:
                    C0142.m2728(sb, strM921);
                    str = "ۣۢۥ";
                    break;
                case 1748866:
                    iM4897 = C0142.f168;
                    str = "۟ۢۧ";
                    break;
                case 1748888:
                    str = "ۢۦۡ";
                    sArrM5205 = m5205();
                    break;
                case 1749638:
                    C0214.m4074(sb, i0VarM1919);
                    str = "ۥۡۤ";
                    break;
                case 1749700:
                    aVarM5626 = C0293.m5626(this);
                    str = "۟ۨ۟";
                    break;
                case 1749728:
                    str = "۠ۡۨ";
                    a2VarM1679 = C0078.m1679(this);
                    break;
                case 1749764:
                    str = "ۢۤۢ";
                    sb = new StringBuilder(strM921);
                    break;
                case 1749789:
                    iM4897 = C0421.f691;
                    str = "ۥۤۥ";
                    break;
                case 1751554:
                    str = "ۥ۟ۡ";
                    strM921 = C0336.m6512(sArrM5205, 63, iM4897, 2982);
                    break;
                case 1751563:
                    i10 = C0400.f670;
                    str = "۟ۡۢ";
                    break;
                case 1751647:
                    i10 = C0259.f338;
                    str = "ۨۤ۠";
                    break;
                case 1751778:
                    str = "ۢۥۧ";
                    strM921 = C0029.m565(sArrM5205, 0, i10, 2229);
                    break;
                case 1752455:
                    C0142.m2728(sb, strM921);
                    str = "ۣ۟ۢ";
                    break;
                case 1752520:
                    str = "ۤۤ۟";
                    sArrM5205 = m5205();
                    break;
                case 1752578:
                    str = "ۣ۠ۨ";
                    strM921 = C0441.m8605(sb);
                    break;
                case 1752614:
                    i10 = iM4897 ^ 261;
                    str = "ۤۨۦ";
                    break;
                case 1753484:
                    str = "ۡۧۨ";
                    sArrM5205 = m5205();
                    break;
                case 1754596:
                    str = "ۤۡۨ";
                    sArrM5205 = m5205();
                    break;
                case 1755492:
                    iM4897 = i10 ^ 767;
                    str = "ۦۢ";
                    break;
                case 1755498:
                    C0175.m3331(sb, ')');
                    str = "ۥۣ۠";
                    break;
                default:
                    return strM921;
            }
        }
    }
}
