package f5;

import b7.C0053;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import d7.C0219;
import d7.C0220;
import dagger.hilt.android.components.C0228;
import dagger.hilt.internal.C0253;
import e1.C0258;
import l6.C0343;
import o7.i2;
import p3.C0375;
import u.C0429;
import w0.C0454;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f395short = {648, 640, 652, 644, 641, 779, 803, 815, 807, 802, 768, 801, 826, 792, 811, 828, 807, 808, 807, 811, 810, 870, 811, 803, 815, 807, 802, 883, 967};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6231a;

    public b(String str) {
        C0375.m7360(str, C0454.m8868(m5331(), 0, C0202.f226 ^ (-418), 749));
        this.f6231a = str;
        int iM4237 = C0219.m4237();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4237 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0112.m2170("hUhICeHO")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m5331() {
        int iM2205 = C0114.m2205();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2205 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f395short;
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
                    boolean z10 = obj instanceof b;
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
                                boolean zM4399 = C0228.m4399(C0053.m1031(this), C0053.m1031((b) obj));
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
        return C0429.m8418(C0053.m1031(this));
    }

    public final String toString() {
        String str = "\u06e5\u06e8\u06e2";
        String strM4942 = null;
        StringBuilder sb = null;
        String strM4259 = null;
        short[] sArrM5331 = null;
        String strM1031 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56507:
                    str = "\u06e6\u06e7\u06e6";
                    i11 = i10 ^ 198;
                    break;
                case 1749663:
                    i10 = C0253.f333;
                    str = "\u06e6\u06e1";
                    break;
                case 1750725:
                    str = "\u06e5\u06e3\u06df";
                    strM4259 = C0220.m4259(sArrM5331, 28, 1, 1006);
                    break;
                case 1751681:
                    return strM4942;
                case 1751685:
                    str = "\u06e3\u06e2\u06e7";
                    strM1031 = C0053.m1031(this);
                    break;
                case 1752577:
                    strM4942 = C0258.m4942(sb, strM1031, strM4259);
                    str = "\u06e4\u06e5\u06e2";
                    break;
                case 1752671:
                    str = "\u06e4\u06e5\u06e6";
                    sb = new StringBuilder(strM1031);
                    break;
                case 1752735:
                    str = "\u06e2\u06e2\u06df";
                    sArrM5331 = m5331();
                    break;
                case 1753669:
                    str = "\u06e5\u06e6\u06e0";
                    strM1031 = C0343.m6742(sArrM5331, 5, i11, 846);
                    break;
                default:
                    str = "\u06e3\u06e5\u06e7";
                    sArrM5331 = m5331();
                    break;
            }
        }
    }
}
