package k6;

import android.support.v4.app.C0014;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.graphics.C0032;
import c3.C0063;
import c4.C0064;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.firebase.annotations.C0127;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import d7.C0220;
import dagger.hilt.internal.processedrootsentinel.C0251;
import e2.C0260;
import f.C0270;
import f4.C0276;
import g0.C0285;
import g2.C0287;
import h3.C0303;
import h6.C0309;
import ja.C0330;
import java.util.concurrent.BlockingQueue;
import l3.C0342;
import m7.C0357;
import t0.C0418;
import t1.C0419;
import t2.C0421;
import u1.C0432;
import v6.C0447;
import w0.C0454;
import w2.C0457;
import w4.C0460;
import w4.C0461;
import x0.C0466;
import x8.C0473;
import y9.C0478;

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
        C0270.m5173(blockingQueue);
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
                    System.out.println(Long.decode(C0466.m9083("wr")));
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
        d4 d4VarM572 = C0029.m572(C0285.m5509(this));
        C0419.m8245(C0330.m6385(d4VarM572), C0418.m8231(C0478.m9332(this), C0251.m4804(m6541(), 0, C0473.f744 ^ 660, 2579)), interruptedException);
        int iM4261 = C0220.m4261();
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
                    System.out.println(Integer.valueOf(C0309.m5968("1Cnh82FN6j6N2wl8WiYgw")));
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
        synchronized (C0080.m1723(C0285.m5509(this))) {
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
                            C0136.m2624(C0276.m5312(C0285.m5509(this)));
                            C0447.m8727(C0080.m1723(C0285.m5509(this)));
                            z4 z4VarM5509 = C0285.m5509(this);
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
                                                    C0135.m2604(C0454.m8871(C0029.m572(z4VarM5509)), C0127.m2451(m6541(), 16, C0063.f83 ^ (-772), 2653));
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
        int iM7001 = C0357.m7001();
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
                    System.out.println(Integer.decode(C0432.m8461("pEc")));
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
    */
    public final void run() {
        int i10;
        boolean z10 = false;
        while (true) {
            int i11 = 1616;
            while (true) {
                i11 ^= 1633;
                switch (i11) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i11 = !z10 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                try {
                    int iM3002 = C0157.m3002(C0083.m1789());
                    while (true) {
                        d5 d5Var = (d5) C0089.m1912(C0342.m6722(this));
                        int i12 = 48767;
                        while (true) {
                            i12 ^= 48784;
                            switch (i12) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    break;
                                case 76:
                                    boolean zM1228 = C0064.m1228(d5Var);
                                    int i13 = 48891;
                                    while (true) {
                                        i13 ^= 48908;
                                        switch (i13) {
                                            case 22:
                                                break;
                                            case 53:
                                                i10 = 10;
                                                break;
                                            case 503:
                                                i13 = zM1228 ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                int i14 = 49666;
                                                while (true) {
                                                    i14 ^= 49683;
                                                    switch (i14) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i14 = 49697;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            i10 = iM3002;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    C0287.m5525(i10);
                                    C0082.m1754(d5Var);
                                    int i15 = 49790;
                                    while (true) {
                                        i15 ^= 49807;
                                        switch (i15) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 241:
                                                i15 = 49821;
                                                break;
                                        }
                                    }
                                    break;
                                case 239:
                                    i12 = d5Var != null ? 48860 : 48829;
                                    break;
                                default:
                                    break;
                            }
                            synchronized (C0460.m8969(this)) {
                                try {
                                    Object objM4971 = C0260.m4971(C0342.m6722(this));
                                    int i16 = 50689;
                                    while (true) {
                                        i16 ^= 50706;
                                        switch (i16) {
                                            case 19:
                                                i16 = objM4971 == null ? 50782 : 50751;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                C0014.m280(C0285.m5509(this));
                                                try {
                                                    C0457.m8915(C0460.m8969(this), (-30674) ^ ((long) C0032.f52));
                                                    int i17 = 50813;
                                                    while (true) {
                                                        i17 ^= 50830;
                                                        switch (i17) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 243:
                                                                i17 = 50844;
                                                                break;
                                                        }
                                                    }
                                                } catch (InterruptedException e4) {
                                                    C0421.m8271(this, e4);
                                                    break;
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                } catch (Throwable th) {
                                    int i18 = 51588;
                                    while (true) {
                                        i18 ^= 51605;
                                        switch (i18) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i18 = 51619;
                                                break;
                                            case 54:
                                                throw th;
                                        }
                                    }
                                }
                            }
                            synchronized (C0080.m1723(C0285.m5509(this))) {
                                try {
                                    Object objM4972 = C0260.m4971(C0342.m6722(this));
                                    int i19 = 51712;
                                    while (true) {
                                        i19 ^= 51729;
                                        switch (i19) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i19 = objM4972 == null ? 51805 : 51774;
                                                break;
                                            case 47:
                                                break;
                                            case 76:
                                                C0461.m8982(this);
                                                C0461.m8982(this);
                                                return;
                                            default:
                                                break;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    int i20 = 51836;
                                    while (true) {
                                        i20 ^= 51853;
                                        switch (i20) {
                                            case 241:
                                                i20 = 52518;
                                                break;
                                            case 1963:
                                                throw th2;
                                        }
                                    }
                                }
                            }
                            int i21 = 52611;
                            while (true) {
                                i21 ^= 52628;
                                switch (i21) {
                                    case 23:
                                        i21 = 52642;
                                        break;
                                    case 54:
                                        break;
                                }
                            }
                        }
                    }
                } catch (Throwable th3) {
                    int i22 = 49914;
                    while (true) {
                        i22 ^= 49931;
                        switch (i22) {
                            case 497:
                                i22 = 50596;
                                break;
                            case 1711:
                                C0461.m8982(this);
                                throw th3;
                        }
                    }
                }
            }
            try {
                C0303.m5842(C0276.m5312(C0285.m5509(this)));
                z10 = true;
                int i23 = 1740;
                while (true) {
                    i23 ^= 1757;
                    switch (i23) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i23 = 1771;
                            break;
                        case 54:
                            break;
                    }
                }
            } catch (InterruptedException e10) {
                C0421.m8271(this, e10);
                int i24 = 1864;
                while (true) {
                    i24 ^= 1881;
                    switch (i24) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i24 = 48674;
                            break;
                        case 47483:
                            break;
                    }
                }
            }
        }
    }
}
