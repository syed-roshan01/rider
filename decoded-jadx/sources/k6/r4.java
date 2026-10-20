package k6;

import androidx.compose.foundation.layout.C0022;
import c3.C0062;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.ktx.C0180;
import com.google.firebase.remoteconfig.internal.Code;
import e1.C0257;
import f6.C0277;
import g0.C0285;
import h8.C0313;
import i6.C0319;
import okhttp3.internal.publicsuffix.C0372;
import q0.C0382;
import t1.C0419;
import u.C0428;
import w.C0453;
import y9.C0478;

/* JADX INFO: loaded from: classes.dex */
public final class r4 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f580short = {2472, 2447, 2439, 2434, 2443, 2442, 2510, 2458, 2433, 2510, 2441, 2443, 2458, 2510, 2494, 2447, 2445, 2437, 2447, 2441, 2443, 2467, 2447, 2432, 2447, 2441, 2443, 2460, 2510, 2440, 2433, 2460, 2510, 2471, 2432, 2461, 2458, 2447, 2434, 2434, 2510, 2492, 2443, 2440, 2443, 2460, 2460, 2443, 2460, 2510, 2494, 2434, 2447, 2455, 2510, 2493, 2458, 2433, 2460, 2443, 2510, 2445, 2433, 2435, 2462, 2447, 2458, 2439, 2444, 2439, 2434, 2439, 2458, 2455, 2510, 2445, 2438, 2443, 2445, 2437, 2452, 2456, 2458, 2521, 2454, 2457, 2451, 2437, 2456, 2462, 2451, 2521, 2433, 2450, 2457, 2451, 2462, 2457, 2448, 1457, 1430, 1438, 1435, 1426, 1427, 1495, 1411, 1432, 1495, 1413, 1426, 1411, 1413, 1438, 1426, 1409, 1426, 1495, 1447, 1435, 1430, 1422, 1495, 1444, 1411, 1432, 1413, 1426, 1495, 1409, 1426, 1413, 1412, 1438, 1432, 1433, 1495, 1425, 1432, 1413, 1495, 1470, 1433, 1412, 1411, 1430, 1435, 1435, 1495, 1445, 1426, 1425, 1426, 1413, 1413, 1426, 1413};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5 f10340a;

    public r4(p7 p7Var) {
        this.f10340a = C0313.m6073(p7Var);
        int iM5504 = C0285.m5504();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5504 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0115.m2222("BoFn9bnN")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m6591() {
        int iM7487 = C0382.m7487();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7487 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f580short;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0067. Please report as an issue. */
    public final boolean a() {
        boolean z10 = false;
        f5 f5VarM7296 = C0372.m7296(this);
        try {
            j.a aVarM9334 = C0478.m9334(C0319.m6184(f5VarM7296));
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        if (aVarM9334 == null) {
                            i10 = 1709;
                        }
                        break;
                    case 204:
                        d4 d4VarM3434 = C0180.m3434(f5VarM7296);
                        C0257.m4924(d4VarM3434);
                        C0135.m2604(C0136.m2634(d4VarM3434), C0143.m2756(m6591(), 0, C0062.f82 ^ 274, 2542));
                        break;
                    case 239:
                        int iM8851 = C0453.m8851(C0277.m5365(aVarM9334, C0319.f467 ^ 76, C0428.m8396(m6591(), 80, C0022.f42 ^ (-699), 2551)));
                        int i11 = 1864;
                        while (true) {
                            i11 ^= 1881;
                            switch (i11) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = iM8851 >= 80837300 ? 48736 : 48705;
                                    break;
                                case 47384:
                                    break;
                                case 47417:
                                    z10 = true;
                                    break;
                                case 47483:
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    default:
                        continue;
                }
                i10 = 1678;
            }
        } catch (Exception e4) {
            int i12 = 1740;
            while (true) {
                i12 ^= 1757;
                switch (i12) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i12 = 1771;
                        break;
                    case 54:
                        d4 d4VarM3435 = C0180.m3434(f5VarM7296);
                        C0257.m4924(d4VarM3435);
                        C0419.m8245(C0136.m2634(d4VarM3435), C0154.m2951(m6591(), 99, C0114.f140 ^ (-286), 1527), e4);
                        break;
                }
            }
        }
        return z10;
    }
}
