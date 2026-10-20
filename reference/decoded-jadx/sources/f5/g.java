package f5;

import a.C0001;
import com.auto.accept.data.model.UserProfile;
import com.auto.accept.service.C0072;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0213;
import dagger.hilt.android.components.C0228;
import g7.C0292;
import i.C0315;
import i6.C0319;
import l9.C0347;
import o7.i2;
import q1.C0383;
import v0.C0440;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f403short = {649, 703, 695, 682, 695, 688, 697, 671, 686, 686, 684, 689, 680, 703, 690, 758, 686, 684, 689, 696, 695, 690, 699, 739, 2325};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfile f6258a;

    public g(UserProfile userProfile) {
        this.f6258a = userProfile;
        int iM5634 = C0292.m5634();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5634 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0319.m6178("kG6a55TitAdxJVH")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m5339() {
        int iM7523 = C0383.m7523();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7523 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f403short;
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
                    boolean z10 = obj instanceof g;
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
                                boolean zM4399 = C0228.m4399(C0347.m6804(this), C0347.m6804((g) obj));
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
        return C0315.m6099(C0347.m6804(this));
    }

    public final String toString() {
        String str = "\u06e1\u06e0\u06e2";
        UserProfile userProfileM6804 = null;
        StringBuilder sb = null;
        short[] sArrM5339 = null;
        String strM3574 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56506:
                    userProfileM6804 = C0347.m6804(this);
                    str = "\u06e6\u06e0\u06e1";
                    break;
                case 1746749:
                    str = "\u06e7\u06e6\u06e0";
                    strM3574 = C0001.m32(sArrM5339, 0, i11, 734);
                    break;
                case 1747936:
                    return strM3574;
                case 1748643:
                    str = "\u06e4\u06e6\u06e8";
                    sArrM5339 = m5339();
                    break;
                case 1749632:
                    C0142.m2728(sb, strM3574);
                    str = "\u06e7\u06df\u06df";
                    break;
                case 1751718:
                    i10 = C0072.f104;
                    str = "\u06e6\u06e0\u06e6";
                    break;
                case 1753447:
                    C0213.m4074(sb, userProfileM6804);
                    str = "\u06e6\u06e1\u06e4";
                    break;
                case 1753452:
                    i11 = i10 ^ 105;
                    str = "\u06df\u06e1\u06df";
                    break;
                case 1753481:
                    str = "\u06e5\u06e0\u06e6";
                    sArrM5339 = m5339();
                    break;
                case 1754375:
                    str = "\u06e0\u06e8\u06e8";
                    strM3574 = C0440.m8605(sb);
                    break;
                case 1754593:
                    str = "\u06e6\u06e0";
                    sb = new StringBuilder(strM3574);
                    break;
                default:
                    str = "\u06e2\u06e1\u06df";
                    strM3574 = C0187.m3574(sArrM5339, 24, 1, 2364);
                    break;
            }
        }
    }
}
