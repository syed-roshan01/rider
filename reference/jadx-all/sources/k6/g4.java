package k6;

import android.os.Bundle;
import c3.C0062;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import dagger.hilt.android.C0241;
import dagger.hilt.internal.generatesrootinput.C0251;
import f6.C0279;
import g5.C0291;
import j2.C0325;
import p5.C0378;
import q6.C0388;
import q7.C0390;
import r7.C0404;
import s7.C0416;
import s8.C0417;
import u1.C0433;
import v0.C0441;
import x7.C0472;

/* JADX INFO: loaded from: classes.dex */
public final class g4 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f545short = {284, 257, 282, 276, 282, 285, 334, 2477, 2543, 2528, 2540, 2532, 2492, 2387, 2319, 2334, 2317, 2334, 2322, 2316, 2370};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f10062d;

    public static g4 b(v vVar) {
        long jM5597 = 0;
        String str = "ۧۢۥ";
        String strM5389 = null;
        String strM9170 = null;
        Bundle bundleM8166 = null;
        g4 g4Var = null;
        s sVarM6279 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56358:
                    g4Var.f10060b = strM9170;
                    str = "ۣۦۨ";
                    break;
                case 56420:
                    jM5597 = C0291.m5597(vVar);
                    str = "ۣۨۢ";
                    break;
                case 1749575:
                    g4Var.f10059a = strM5389;
                    str = "ۣۡۧ";
                    break;
                case 1750601:
                    str = "ۡۧ";
                    strM9170 = C0472.m9170(vVar);
                    break;
                case 1750757:
                    g4Var.f10062d = bundleM8166;
                    str = "ۣۧ";
                    break;
                case 1752614:
                    str = "ۧۡۦ";
                    sVarM6279 = C0325.m6279(vVar);
                    break;
                case 1753421:
                    return g4Var;
                case 1753445:
                    str = "ۢ۟ۤ";
                    g4Var = new g4();
                    break;
                case 1754444:
                    str = "ۦ۠۟";
                    bundleM8166 = C0416.m8166(sVarM6279);
                    break;
                case 1755463:
                    g4Var.f10061c = jM5597;
                    str = "ۦ۟ۦ";
                    break;
                default:
                    strM5389 = C0279.m5389(vVar);
                    str = "ۥۤۥ";
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧۢۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6557() {
        int iM3548 = C0186.m3548();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3548 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f545short;
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

    public final v a() {
        long jM9177 = 0;
        String str = "ۥۥۢ";
        s sVar = null;
        String strM8455 = null;
        Bundle bundle = null;
        v vVar = null;
        String strM7587 = null;
        Bundle bundleM4606 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56319:
                    sVar = new s(bundle);
                    str = "ۣۤۧ";
                    break;
                case 1748804:
                    return vVar;
                case 1749854:
                    str = "ۡۥۨ";
                    vVar = new v(strM7587, sVar, strM8455, jM9177);
                    break;
                case 1751624:
                    strM8455 = C0433.m8455(this);
                    str = "ۧۡ۟";
                    break;
                case 1752642:
                    strM7587 = C0388.m7587(this);
                    str = "ۨ۠ۢ";
                    break;
                case 1754406:
                    str = "۠۟";
                    bundle = new Bundle(bundleM4606);
                    break;
                case 1754437:
                    jM9177 = C0472.m9177(this);
                    str = "ۢۨۤ";
                    break;
                default:
                    str = "ۧ۠۟";
                    bundleM4606 = C0241.m4606(this);
                    break;
            }
        }
    }

    public final String toString() {
        String str = "ۣۦۨ";
        String strM4789 = null;
        Bundle bundleM4606 = null;
        StringBuilder sb = null;
        short[] sArrM6557 = null;
        String strM7631 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56293:
                    str = "ۣۦۡ";
                    sArrM6557 = m6557();
                    break;
                case 1746721:
                    C0142.m2728(sb, strM7631);
                    str = "۟ۤ";
                    break;
                case 1746784:
                    i11 = i10 ^ 324;
                    str = "ۦۢۨ";
                    break;
                case 1746905:
                    i10 = C0417.f687;
                    str = "ۣۡ۠";
                    break;
                case 1747750:
                    str = "ۥۦۦ";
                    strM7631 = C0202.m3867(sArrM6557, 13, i11, 2431);
                    break;
                case 1748734:
                    i11 = i10 ^ (-665);
                    str = "ۡۤۨ";
                    break;
                case 1748773:
                    str = "ۢ۠ۥ";
                    strM7631 = C0390.m7631(sArrM6557, 0, i11, 371);
                    break;
                case 1749572:
                    C0142.m2728(sb, strM7631);
                    str = "ۧۨۥ";
                    break;
                case 1749604:
                    str = "۟۠ۢ";
                    strM7631 = C0388.m7587(this);
                    break;
                case 1749607:
                    str = "ۦ۟ۢ";
                    sb = new StringBuilder(strM7631);
                    break;
                case 1749727:
                    C0142.m2728(sb, strM4789);
                    str = "ۦۤۢ";
                    break;
                case 1750722:
                    str = "۟ۦ۠";
                    sArrM6557 = m6557();
                    break;
                case 1750750:
                    i10 = C0404.f674;
                    str = "ۧۦۥ";
                    break;
                case 1750757:
                    str = "ۦۢۥ";
                    bundleM4606 = C0241.m4606(this);
                    break;
                case 1752677:
                    C0142.m2728(sb, strM7631);
                    str = "ۢۤۡ";
                    break;
                case 1753417:
                    str = "ۢ۟ۡ";
                    strM7631 = C0433.m8455(this);
                    break;
                case 1753480:
                    i10 = C0062.f82;
                    str = "ۣ۟ۢ";
                    break;
                case 1753513:
                    strM4789 = C0251.m4789(bundleM4606);
                    str = "ۣۥۤ";
                    break;
                case 1753516:
                    str = "۠ۧۡ";
                    strM7631 = C0378.m7393(sArrM6557, 7, i11, 2433);
                    break;
                case 1753572:
                    str = "ۣۧۧ";
                    strM7631 = C0441.m8605(sb);
                    break;
                case 1754507:
                    return strM7631;
                case 1754598:
                    i11 = i10 ^ (-884);
                    str = "۠ۢۨ";
                    break;
                case 1754660:
                    str = "ۦۣۡ";
                    sArrM6557 = m6557();
                    break;
                default:
                    C0142.m2728(sb, strM7631);
                    str = "ۢ۠ۢ";
                    break;
            }
        }
    }
}
