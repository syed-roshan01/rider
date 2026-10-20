package k6;

import a2.C0005;
import android.content.ComponentName;
import androidx.compose.ui.draw.C0029;
import androidx.core.app.C0040;
import c1.C0061;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.emulators.C0141;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import dagger.hilt.internal.processedrootsentinel.C0251;
import f4.C0276;
import i.C0316;
import ja.C0330;
import o5.C0370;
import r4.C0398;
import s0.C0410;
import t1.C0419;
import z.C0480;

/* JADX INFO: loaded from: classes.dex */
public final class a7 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f523short = {1183, 1171, 1169, 1234, 1179, 1171, 1171, 1179, 1168, 1177, 1234, 1181, 1170, 1176, 1166, 1171, 1173, 1176, 1234, 1179, 1169, 1167, 1234, 1169, 1177, 1181, 1167, 1161, 1166, 1177, 1169, 1177, 1170, 1160, 1234, 1213, 1164, 1164, 1201, 1177, 1181, 1167, 1161, 1166, 1177, 1169, 1177, 1170, 1160, 1199, 1177, 1166, 1162, 1173, 1183, 1177, 3178, 3143, 3165, 3149, 3137, 3136, 3136, 3147, 3149, 3162, 3147, 3146, 3086, 3144, 3164, 3137, 3139, 3086, 3146, 3147, 3160, 3143, 3149, 3147, 3086, 3171, 3147, 3151, 3165, 3163, 3164, 3147, 3139, 3147, 3136, 3162, 3197, 3147, 3164, 3160, 3143, 3149, 3147};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z6 f9894b;

    public /* synthetic */ a7(z6 z6Var, int i10) {
        this.f9893a = i10;
        this.f9894b = z6Var;
        int iM1701 = C0079.m1701();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1701 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0202.m3881("bQhZgi4vMKx4IlKH20m9MBe5")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۨ۟, reason: not valid java name and contains not printable characters */
    public static short[] m6535() {
        int iM4811 = C0251.m4811();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4811 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f523short;
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
        int iM6126 = C0316.m6126(this);
        z6 z6VarM8058 = C0410.m8058(this);
        switch (iM6126) {
            case 0:
                s6 s6VarM7272 = C0370.m7272(z6VarM8058);
                s6VarM7272.f10358d = null;
                C0141.m2713(s6VarM7272);
                break;
            default:
                s6 s6VarM7273 = C0370.m7272(z6VarM8058);
                ComponentName componentName = new ComponentName(C0276.m5311(C0370.m7272(z6VarM8058)), C0005.m102(m6535(), 0, C0480.f754 ^ (-662), 1276));
                C0040.m791(s6VarM7273);
                y3 y3VarM2387 = C0124.m2387(s6VarM7273);
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i10 = y3VarM2387 != null ? 1709 : 1678;
                            break;
                        case 204:
                            s6VarM7273.f10358d = null;
                            C0419.m8245(C0136.m2634(C0029.m572(s6VarM7273)), C0079.m1700(m6535(), 56, C0330.f478 ^ 342, 3118), componentName);
                            C0040.m791(s6VarM7273);
                            C0398.m7793(s6VarM7273);
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                }
                int iM1161 = C0061.m1161();
                int i11 = 1740;
                while (true) {
                    i11 ^= 1757;
                    switch (i11) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (iM1161 >= 0) {
                                i11 = 1833;
                            }
                            break;
                        case 54:
                            break;
                        case 471:
                            break;
                        case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                            System.out.println(Double.valueOf(C0131.m2519("xJxFvrpMEuHHCoPb8ViB8Wi4t")));
                            break;
                        default:
                            continue;
                    }
                    i11 = 1802;
                }
                break;
        }
    }
}
