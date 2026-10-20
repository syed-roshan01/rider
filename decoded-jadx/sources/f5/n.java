package f5;

import a2.C0004;
import android.app.Application;
import android.os.Handler;
import android.support.v4.app.C0014;
import androidx.compose.foundation.C0026;
import androidx.compose.ui.layout.C0035;
import androidx.compose.ui.node.C0037;
import androidx.preference.C0044;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.bind.C0207;
import d1.C0214;
import d9.C0223;
import d9.C0224;
import d9.C0226;
import e2.C0263;
import f4.C0275;
import g9.C0294;
import k4.C0336;
import m7.C0356;
import o7.i2;
import q6.C0387;
import q7.C0389;
import q9.C0391;
import r1.C0393;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f409short = {8694, -1703, 1910, 1812, 1843, 1826, 1847, 1910, 1828, 1843, 1831, 1827, 1855, 1828, 1843, 1829, 1910, 1848, 1843, 1826, 1825, 1849, 1828, 1853, 1910, 1845, 1849, 1848, 1848, 1843, 1845, 1826, 1855, 1849, 1848, 9324, -829, 748, 654, 681, 696, 685, 758, 748, 650, 677, 702, 681, 686, 685, 703, 681, 748, 687, 675, 674, 674, 681, 687, 696, 677, 675, 674, 748, 682, 685, 677, 672, 681, 680, 8355, -2036, 1571, 1601, 1638, 1655, 1634, 1571, 1634, 1632, 1632, 1638, 1648, 1648, 1571, 1649, 1638, 1653, 1644, 1640, 1638, 1639, 11751, -2744, 2919, 2821, 2850, 2867, 2854, 2919, 2869, 2850, 2870, 2866, 2862, 2869, 2850, 2868, 2919, 2862, 2857, 2867, 2850, 2869, 2857, 2850, 2867, 2919, 2852, 2856, 2857, 2857, 2850, 2852, 2867, 2862, 2856, 2857};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f6303b;

    public /* synthetic */ n(Application application, int i10) {
        this.f6302a = i10;
        this.f6303b = application;
        int iM7657 = C0391.m7657();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7657 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0393.m7717("fnMUq90QVLOxc4Yg2IunfmpGa")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۢۨۢۦ, reason: not valid java name and contains not printable characters */
    public static short[] m5345() {
        int iM5663 = C0294.m5663();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5663 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f409short;
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

    @Override // java.lang.Runnable
    public final void run() {
        int iM79 = C0004.m79(this);
        long j10 = (-1333) ^ ((long) C0223.f303);
        Application applicationM7591 = C0387.m7591(this);
        switch (iM79) {
            case 0:
                C0079.m1702(C0356.m6990(applicationM7591, C0044.m855(m5345(), 92, C0214.f238 ^ 232, 2887), 1));
                C0336.m6531(new Handler(C0207.m3950()), new b5.j(1), j10);
                int iM4372 = C0226.m4372();
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (iM4372 >= 0) {
                                i10 = 1709;
                            }
                            break;
                        case 204:
                            System.out.println(Float.valueOf(C0156.m2977("AZnlWLx2omeXRjgKzxvaYjJTWiW1O")));
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i10 = 1678;
                }
                break;
            case 1:
                C0079.m1702(C0356.m6990(applicationM7591, C0035.m686(m5345(), 70, C0263.f343 ^ 526, 1539), 1));
                C0336.m6531(new Handler(C0207.m3950()), new b5.j(C0026.f46 ^ (-316)), j10);
                break;
            case 2:
                C0079.m1702(C0356.m6990(applicationM7591, C0014.m279(m5345(), 35, C0125.f151 ^ 778, 716), 1));
                C0336.m6531(new Handler(C0207.m3950()), new b5.j(C0224.f304 ^ 854), j10);
                break;
            default:
                C0079.m1702(C0356.m6990(applicationM7591, C0275.m5301(m5345(), 0, C0037.f57 ^ 646, 1878), 1));
                C0336.m6531(new Handler(C0207.m3950()), new b5.j(C0389.f660 ^ 197), j10);
                break;
        }
    }
}
