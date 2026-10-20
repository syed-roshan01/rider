package f5;

import androidx.compose.foundation.relocation.C0024;
import androidx.preference.C0044;
import com.auto.accept.data.model.UserProfile;
import com.google.android.datatransport.cct.C0078;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0214;
import dagger.hilt.android.components.C0229;
import dagger.hilt.components.C0244;
import i.C0316;
import o7.i2;
import u.C0430;
import v0.C0441;
import v9.C0452;
import w1.C0456;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f400short = {2954, 2985, 2977, 2977, 2979, 2978, 2959, 2984, 3054, 2998, 2996, 2985, 2976, 2991, 2986, 2979, 3067, 723};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfile f6248a;

    public e(UserProfile userProfile) {
        this.f6248a = userProfile;
        int iM8885 = C0456.m8885();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8885 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0430.m8423("LRBtfLyrFhTXXbDrTZl67r")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟۠۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m5336() {
        int iM860 = C0044.m860();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM860 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f400short;
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
                    boolean z10 = obj instanceof e;
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
                                boolean zM4399 = C0229.m4399(C0244.m4675(this), C0244.m4675((e) obj));
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
        return C0316.m6099(C0244.m4675(this));
    }

    public final String toString() {
        String str = "ۢۧۡ";
        StringBuilder sb = null;
        UserProfile userProfileM4675 = null;
        short[] sArrM5336 = null;
        String strM8605 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56325:
                    str = "ۣۡ";
                    strM8605 = C0452.m8796(sArrM5336, 0, i11, 3014);
                    break;
                case 56414:
                    sb = new StringBuilder(strM8605);
                    str = "ۧۡۢ";
                    break;
                case 1747775:
                    C0142.m2728(sb, strM8605);
                    str = "ۣۡۢ";
                    break;
                case 1748893:
                    str = "ۣۧۤ";
                    sArrM5336 = m5336();
                    break;
                case 1749820:
                    str = "ۣۡۧ";
                    sArrM5336 = m5336();
                    break;
                case 1750596:
                    str = "ۥۣۧ";
                    strM8605 = C0441.m8605(sb);
                    break;
                case 1750601:
                    i10 = C0024.f44;
                    str = "ۦۨۥ";
                    break;
                case 1752705:
                    return strM8605;
                case 1753699:
                    i11 = i10 ^ 518;
                    str = "۠ۥ";
                    break;
                case 1754440:
                    str = "ۧۡۤ";
                    userProfileM4675 = C0244.m4675(this);
                    break;
                case 1754534:
                    str = "ۣ۠ۢ";
                    strM8605 = C0078.m1682(sArrM5336, 17, 1, 762);
                    break;
                default:
                    C0214.m4074(sb, userProfileM4675);
                    str = "ۡۨۤ";
                    break;
            }
        }
    }
}
