package k6;

import androidx.compose.foundation.layout.C0022;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.platform.C0038;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.ktx.C0199;
import f.C0271;
import g0.C0286;
import r6.C0402;
import r7.C0405;
import s3.C0413;
import s8.C0417;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public abstract class o5 extends f4.y {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f570short = {528, 561, 554, 638, 567, 560, 567, 554, 567, 575, 562, 567, 548, 571, 570, 2796, 2766, 2753, 2696, 2779, 2703, 2758, 2753, 2758, 2779, 2758, 2766, 2755, 2758, 2773, 2762, 2703, 2779, 2776, 2758, 2764, 2762};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10258b;

    public o5(f5 f5Var) {
        C0271.m5173(f5Var);
        this.f6226a = f5Var;
        f5Var.E = C0022.m434(f5Var) + (C0490.f763 ^ (-532));
        int iM8173 = C0417.m8173();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8173 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0413.m8105("MGpXJHp3")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6582() {
        int iM2931 = C0152.m2931();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2931 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f570short;
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

    public final void m() {
        boolean zM3353 = C0176.m3353(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM3353) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int iM2662 = C0138.m2662();
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM2662 <= 0) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                System.out.println(Long.parseLong(C0402.m7880("VdeQ")));
                                return;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    throw new IllegalStateException(C0199.m3816(m6582(), 0, C0038.f58 ^ (-216), 606));
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final void n() {
        boolean zM3353 = C0176.m3353(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM3353) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    boolean zM522 = C0027.m522(this);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM522) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0125.m2427(C0405.m7942((f5) C0163.m3121(this)));
                                this.f10258b = true;
                                return;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    throw new IllegalStateException(C0417.m8170(m6582(), 15, C0286.f430 ^ (-882), 2735));
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public abstract boolean o();
}
