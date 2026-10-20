package k6;

import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.draw.C0029;
import c3.C0063;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.firebase.annotations.C0127;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import d7.C0221;
import dagger.hilt.internal.processedrootsentinel.C0252;
import f.C0271;
import f4.C0277;
import g0.C0286;
import h6.C0310;
import ja.C0331;
import java.util.concurrent.BlockingQueue;
import m7.C0358;
import t0.C0419;
import t1.C0420;
import u1.C0433;
import v6.C0448;
import w0.C0455;
import x0.C0467;
import x8.C0474;
import y9.C0479;

/* JADX INFO: loaded from: classes.dex */
public final class c5 extends Thread {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f529short = {2611, 2660, 2674, 2656, 2611, 2682, 2685, 2663, 2678, 2657, 2657, 2662, 2659, 2663, 2678, 2679, 2590, 2600, 2607, 2607, 2616, 2611, 2601, 2685, 2606, 2622, 2613, 2616, 2617, 2600, 2609, 2616, 2607, 2685, 2601, 2613, 2607, 2616, 2620, 2617, 2685, 2612, 2606, 2685, 2611, 2616, 2612, 2601, 2613, 2616, 2607, 2685, 2602, 2610, 2607, 2614, 2616, 2607, 2685, 2611, 2610, 2607, 2685, 2611, 2616, 2601, 2602, 2610, 2607, 2614};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f9934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9935c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z4 f9936d;

    public c5(z4 z4Var, String str, BlockingQueue blockingQueue) {
        this.f9936d = z4Var;
        C0271.m5173(blockingQueue);
        this.f9933a = new Object();
        this.f9934b = blockingQueue;
        C0200.m3838(this, str);
        int iM3030 = C0159.m3030();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3030 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0467.m9083("wr")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧ۠۟, reason: not valid java name and contains not printable characters */
    public static short[] m6541() {
        int iM1735 = C0081.m1735();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1735 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f529short;
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

    public final void a(InterruptedException interruptedException) {
        d4 d4VarM572 = C0029.m572(C0286.m5509(this));
        C0420.m8245(C0331.m6385(d4VarM572), C0419.m8231(C0479.m9332(this), C0252.m4804(m6541(), 0, C0474.f744 ^ 660, 2579)), interruptedException);
        int iM4261 = C0221.m4261();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4261 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0310.m5968("1Cnh82FN6j6N2wl8WiYgw")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final void b() {
        synchronized (C0080.m1723(C0286.m5509(this))) {
            try {
                boolean zM3053 = C0160.m3053(this);
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i10 = !zM3053 ? 1709 : 1678;
                            break;
                        case 204:
                            C0136.m2624(C0277.m5312(C0286.m5509(this)));
                            C0448.m8727(C0080.m1723(C0286.m5509(this)));
                            z4 z4VarM5509 = C0286.m5509(this);
                            c5 c5VarM476 = C0024.m476(z4VarM5509);
                            int i11 = 1740;
                            while (true) {
                                i11 ^= 1757;
                                switch (i11) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i11 = this == c5VarM476 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        c5 c5VarM2953 = C0154.m2953(z4VarM5509);
                                        int i12 = 48767;
                                        while (true) {
                                            i12 ^= 48784;
                                            switch (i12) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    C0135.m2604(C0455.m8871(C0029.m572(z4VarM5509)), C0127.m2451(m6541(), 16, C0063.f83 ^ (-772), 2653));
                                                    break;
                                                case 76:
                                                    z4VarM5509.f10607d = null;
                                                    int i13 = 48891;
                                                    while (true) {
                                                        i13 ^= 48908;
                                                        switch (i13) {
                                                            case 22:
                                                                break;
                                                            case 503:
                                                                i13 = 48922;
                                                                continue;
                                                            default:
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                                case 239:
                                                    i12 = this == c5VarM2953 ? 48860 : 48829;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        z4VarM5509.f10606c = null;
                                        int i14 = 1864;
                                        while (true) {
                                            i14 ^= 1881;
                                            switch (i14) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i14 = 48674;
                                                    break;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            this.f9935c = true;
                            int i15 = 49666;
                            while (true) {
                                i15 ^= 49683;
                                switch (i15) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i15 = 49697;
                                        continue;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    default:
                                        continue;
                                }
                            }
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                }
            } catch (Throwable th) {
                int i16 = 49790;
                while (true) {
                    i16 ^= 49807;
                    switch (i16) {
                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            throw th;
                        case 241:
                            i16 = 49821;
                            break;
                    }
                }
            }
        }
        int iM7001 = C0358.m7001();
        int i17 = 49914;
        while (true) {
            i17 ^= 49931;
            switch (i17) {
                case 497:
                    i17 = iM7001 >= 0 ? 50658 : 50627;
                    break;
                case 1711:
                    break;
                case 1736:
                    return;
                case 1769:
                    System.out.println(Integer.decode(C0433.m8461("pEc")));
                    return;
                default:
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0001, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0001, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0040, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0040, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0051. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0005. Please report as an issue. */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.c5.run():void");
    }
}
