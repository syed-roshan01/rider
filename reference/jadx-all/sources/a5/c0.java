package a5;

import aa.C0012;
import androidx.compose.ui.draw.C0028;
import com.google.android.gms.common.C0087;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.C0241;
import o7.i2;
import p3.C0376;
import u4.C0436;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f11short = {2156, 2097, 2110, 2111, 2110, 2089, 2109, 2111, 2085, 2083, 2160, 2080, 2097, 2082, 2097, 2109, 2101, 2084, 2101, 2082, 2160, 2145, 2158};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f1235a = new c0(C0241.f320 ^ 457);

    /* JADX INFO: renamed from: ۣ۟ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static short[] m127() {
        int iM7362 = C0376.m7362();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7362 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f11short;
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

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۧ۟ۢ";
        Number number = null;
        short[] sArrM127 = null;
        String strM554 = null;
        String str2 = null;
        q8.l lVarM238 = null;
        int i10 = 0;
        int iM8515 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56481:
                    iM8515 = C0436.m8515(number);
                    str = "۟ۦۤ";
                    break;
                case 1746909:
                    str = "ۤۧ۟";
                    str2 = (String) obj2;
                    break;
                case 1747841:
                    iM8515 = C0087.f121;
                    str = "ۤۢ۟";
                    break;
                case 1751585:
                    i10 = iM8515 ^ 587;
                    str = "ۥۧۢ";
                    break;
                case 1751740:
                    str = "۠ۥۦ";
                    sArrM127 = m127();
                    break;
                case 1752704:
                    str = "ۨۨۢ";
                    strM554 = C0028.m554(sArrM127, 0, i10, 2128);
                    break;
                case 1754377:
                    str = "ۨۥۨ";
                    lVarM238 = C0012.m238();
                    break;
                case 1755531:
                    return lVarM238;
                case 1755618:
                    C0376.m7360(str2, strM554);
                    str = "ۧ۟ۡ";
                    break;
                default:
                    str = "ۥۦ";
                    number = (Number) obj;
                    break;
            }
        }
    }
}
