package k6;

import android.os.IBinder;
import android.os.IInterface;
import c4.C0064;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.common.api.internal.C0082;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0223;
import dagger.hilt.android.internal.modules.C0235;
import g5.C0291;
import h3.C0304;
import s.C0409;

/* JADX INFO: loaded from: classes.dex */
public final class e4 extends com.google.android.gms.common.internal.f {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f538short = {1991, 1995, 1993, 1930, 1987, 1995, 1995, 1987, 1992, 1985, 1930, 1989, 1994, 1984, 2006, 1995, 1997, 1984, 1930, 1987, 1993, 2007, 1930, 1993, 1985, 1989, 2007, 2001, 2006, 1985, 1993, 1985, 1994, 2000, 1930, 1997, 1994, 2000, 1985, 2006, 1994, 1989, 1992, 1930, 2029, 2025, 1985, 1989, 2007, 2001, 2006, 1985, 1993, 1985, 1994, 2000, 2039, 1985, 2006, 2002, 1997, 1991, 1985, 2330, 2326, 2324, 2391, 2334, 2326, 2326, 2334, 2325, 2332, 2391, 2328, 2327, 2333, 2315, 2326, 2320, 2333, 2391, 2334, 2324, 2314, 2391, 2324, 2332, 2328, 2314, 2316, 2315, 2332, 2324, 2332, 2327, 2317, 2391, 2320, 2327, 2317, 2332, 2315, 2327, 2328, 2325, 2391, 2352, 2356, 2332, 2328, 2314, 2316, 2315, 2332, 2324, 2332, 2327, 2317, 2346, 2332, 2315, 2319, 2320, 2330, 2332, 1151, 1139, 1137, 1074, 1147, 1139, 1139, 1147, 1136, 1145, 1074, 1149, 1138, 1144, 1134, 1139, 1141, 1144, 1074, 1147, 1137, 1135, 1074, 1137, 1145, 1149, 1135, 1129, 1134, 1145, 1137, 1145, 1138, 1128, 1074, 1103, 1096, 1117, 1102, 1096};

    /* JADX INFO: renamed from: ۦ۟ۡۨ, reason: contains not printable characters */
    public static short[] m6550() {
        int iM1631 = C0075.m1631();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1631 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f538short;
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

    @Override // com.google.android.gms.common.internal.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iBinder == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return null;
                case 239:
                    IInterface iInterfaceM1242 = C0064.m1242(iBinder, C0223.m4290(m6550(), 0, C0304.f451 ^ (-611), 1956));
                    boolean z10 = iInterfaceM1242 instanceof y3;
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (z10) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return new a4(iBinder);
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return (y3) iInterfaceM1242;
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

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.d
    public final int getMinApkVersion() {
        return (-12451423) ^ C0409.f679;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        String str = "۟ۥۧ";
        String strM1753 = null;
        short[] sArrM6550 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746881:
                    str = "ۢۥۦ";
                    sArrM6550 = m6550();
                    break;
                case 1747750:
                    str = "۠ۤۨ";
                    i11 = i10 ^ (-420);
                    break;
                case 1747812:
                    strM1753 = C0082.m1753(sArrM6550, 63, i11, 2425);
                    str = "ۢ۟۠";
                    break;
                case 1749571:
                    return strM1753;
                default:
                    i10 = C0123.f149;
                    str = "۠ۢۨ";
                    break;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        String str = "ۤۧۧ";
        String strM5593 = null;
        short[] sArrM6550 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1750814:
                    str = "ۥۢۥ";
                    i11 = C0235.f314;
                    break;
                case 1751748:
                    str = "ۣۣۨ";
                    sArrM6550 = m6550();
                    break;
                case 1753607:
                    return strM5593;
                case 1753670:
                    strM5593 = C0291.m5593(sArrM6550, 126, i10, 1052);
                    str = "ۦۥۦ";
                    break;
                default:
                    i10 = i11 ^ 970;
                    str = "ۦۧۧ";
                    break;
            }
        }
    }
}
