package y3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import c4.C0066;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.remoteconfig.internal.Code;
import e2.C0263;
import o7.i2;
import v5.C0446;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static PackageInfo a(PackageManager packageManager, Context context) {
        int i10 = 0;
        String str = "ۤۤ۟";
        PackageManager.PackageInfoFlags packageInfoFlagsM9283 = null;
        String strM8680 = null;
        PackageInfo packageInfoM9282 = null;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56420:
                    str = "ۡۨۡ";
                    j11 = 189 ^ j10;
                    break;
                case 1746880:
                    str = "ۢۥۦ";
                    packageInfoM9282 = m9282(packageManager, strM8680, packageInfoFlagsM9283);
                    break;
                case 1749763:
                    return packageInfoM9282;
                case 1750567:
                    i10 = C0263.f342;
                    str = "ۧۧ۟";
                    break;
                case 1751647:
                    str = "ۣ۠ۤ";
                    strM8680 = C0446.m8680(context);
                    break;
                case 1754623:
                    j10 = i10;
                    str = "ۣۧ";
                    break;
                default:
                    packageInfoFlagsM9283 = m9283(j11);
                    str = "۟ۥۦ";
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۟۠ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m9282(Object obj, Object obj2, Object obj3) {
        int iM1277 = C0066.m1277();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1277 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((PackageManager) obj).getPackageInfo((String) obj2, (PackageManager.PackageInfoFlags) obj3);
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

    /* JADX INFO: renamed from: ۡ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static PackageManager.PackageInfoFlags m9283(long j10) {
        int iM2805 = C0147.m2805();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2805 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return PackageManager.PackageInfoFlags.of(j10);
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
}
