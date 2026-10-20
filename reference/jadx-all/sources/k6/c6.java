package k6;

import android.os.Bundle;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.input.pointer.C0034;
import androidx.core.app.C0040;
import b7.C0054;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.components.C0135;
import com.google.firebase.iid.C0171;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import e2.C0261;
import h6.C0310;
import k8.C0339;
import l8.C0347;
import p5.C0378;
import r1.C0394;
import r2.C0396;
import r7.C0404;
import s0.C0410;
import t2.C0424;
import u.C0429;
import w0.C0455;
import w2.C0459;
import x4.C0469;
import x7.C0472;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c6 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f530short = {2452, 2482, 2472, 2479, 2470, 2529, 2469, 2468, 2487, 2468, 2477, 2478, 2481, 2468, 2483, 2529, 2466, 2478, 2479, 2482, 2468, 2479, 2485, 2529, 2478, 2479, 2477, 2488, 2554, 2529, 2470, 2478, 2478, 2470, 2477, 2468, 2529, 2464, 2481, 2481, 2529, 2472, 2469, 2529, 2471, 2478, 2484, 2479, 2469};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9937a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9940d;

    public c6(p6 p6Var, q6 q6Var, long j10) {
        this.f9940d = p6Var;
        this.f9939c = q6Var;
        this.f9938b = j10;
        int iM1047 = C0054.m1047();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1047 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0424.m8300("lXlKukgF")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public /* synthetic */ c6(y5 y5Var, Bundle bundle, long j10) {
        this.f9939c = y5Var;
        this.f9940d = bundle;
        this.f9938b = j10;
        int iM568 = C0029.m568();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM568 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0396.m7743("vxFBAzJl4T0ITR8In")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۢۢۧ۟, reason: not valid java name and contains not printable characters */
    public static short[] m6542() {
        int iM3272 = C0171.m3272();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3272 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f530short;
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

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = null;
        switch (C0378.m7396(this)) {
            case 0:
                y5 y5Var = (y5) C0404.m7914(this);
                Bundle bundle = (Bundle) C0034.m668(this);
                long jM6777 = C0347.m6777(this);
                boolean zM1883 = C0088.m1883(C0469.m9122(C0455.m8874(y5Var)));
                int i10 = 1740;
                while (true) {
                    i10 ^= 1757;
                    switch (i10) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (zM1883) {
                                i10 = 1833;
                            }
                            break;
                        case 54:
                            break;
                        case 471:
                            d4 d4VarM572 = C0029.m572(y5Var);
                            C0135.m2604(C0472.m9169(d4VarM572), C0429.m8396(m6542(), 0, C0261.f340 ^ (-710), 2497));
                            break;
                        case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                            C0195.m3742(y5Var, bundle, 0, jM6777);
                            int i11 = 1864;
                            while (true) {
                                i11 ^= 1881;
                                switch (i11) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i11 = 48674;
                                        break;
                                    case 47483:
                                        break;
                                }
                            }
                            break;
                        default:
                            continue;
                    }
                    i10 = 1802;
                }
                break;
            default:
                C0410.m8028((p6) C0034.m668(this), (q6) C0404.m7914(this), false, C0347.m6777(this));
                p6 p6Var = (p6) C0034.m668(this);
                p6Var.f10278e = null;
                s6 s6VarM7706 = C0394.m7706(p6Var);
                C0040.m791(s6VarM7706);
                C0459.m8937(s6VarM7706);
                C0310.m5979(s6VarM7706, new l.h(C0091.f125 ^ (-173), s6VarM7706, obj));
                int iM6645 = C0339.m6645();
                int i12 = 1616;
                while (true) {
                    i12 ^= 1633;
                    switch (i12) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (iM6645 >= 0) {
                                i12 = 1709;
                            }
                            break;
                        case 204:
                            System.out.println(Integer.parseInt(C0490.m9524("FnxFrH1k")));
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i12 = 1678;
                }
                break;
        }
    }
}
