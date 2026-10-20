package f5;

import a.C0001;
import androidx.compose.ui.draw.C0027;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.protobuf.C0209;
import dagger.hilt.android.components.C0228;
import e1.C0258;
import m1.C0351;
import o7.i2;
import u.C0429;
import z0.C0482;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f397short = {2118, 2161, 2161, 2156, 2161, 2091, 2158, 2150, 2160, 2160, 2146, 2148, 2150, 2110, 1588};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6238a;

    public c(String str) {
        this.f6238a = str;
        int iM541 = C0027.m541();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM541 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0194.m3710("9ha2dv")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static short[] m5333() {
        int iM8415 = C0429.m8415();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8415 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f397short;
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
                    boolean z10 = obj instanceof c;
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
                                boolean zM4399 = C0228.m4399(C0351.m6884(this), C0351.m6884((c) obj));
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
                                            return true;
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

    public final int hashCode() {
        return C0429.m8418(C0351.m6884(this));
    }

    public final String toString() {
        String str = "\u06df\u06e4";
        String strM32 = null;
        StringBuilder sb = null;
        String strM4942 = null;
        short[] sArrM5333 = null;
        String strM6884 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56293:
                    str = "\u06e2\u06e3\u06e2";
                    sArrM5333 = m5333();
                    break;
                case 1748710:
                    str = "\u06e4\u06df\u06e4";
                    strM6884 = C0209.m4014(sArrM5333, 0, i10, 2051);
                    break;
                case 1749697:
                    i11 = C0482.f756;
                    str = "\u06e6\u06e7\u06e8";
                    break;
                case 1751497:
                    str = "\u06e8\u06df\u06df";
                    sb = new StringBuilder(strM6884);
                    break;
                case 1752484:
                    str = "\u06e6\u06e4\u06e4";
                    strM4942 = C0258.m4942(sb, strM6884, strM32);
                    break;
                case 1752609:
                    strM32 = C0001.m32(sArrM5333, 14, 1, 1565);
                    str = "\u06e5\u06e0\u06df";
                    break;
                case 1753574:
                    return strM4942;
                case 1753671:
                    i10 = i11 ^ 929;
                    str = "\u06e1\u06e2\u06e7";
                    break;
                case 1755553:
                    str = "\u06e5\u06e4\u06e0";
                    sArrM5333 = m5333();
                    break;
                default:
                    str = "\u06e8\u06e6\u06df";
                    strM6884 = C0351.m6884(this);
                    break;
            }
        }
    }
}
