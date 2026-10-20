package k6;

import androidx.compose.foundation.layout.C0022;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.measurement.C0184;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d5.C0219;
import dagger.hilt.android.internal.modules.C0235;
import f.C0271;
import g0.C0286;
import g5.C0292;
import q7.C0391;
import q9.C0392;
import r7.C0405;
import z.C0482;

/* JADX INFO: loaded from: classes.dex */
public abstract class p2 extends q3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f572short = {2656, 2625, 2650, 2574, 2631, 2624, 2631, 2650, 2631, 2639, 2626, 2631, 2644, 2635, 2634, 3082, 3112, 3111, 3182, 3133, 3177, 3104, 3111, 3104, 3133, 3104, 3112, 3109, 3104, 3123, 3116, 3177, 3133, 3134, 3104, 3114, 3116};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10269b;

    public p2(f5 f5Var) {
        C0271.m5173(f5Var);
        this.f6226a = f5Var;
        f5Var.E = C0022.m434(f5Var) + (C0140.f166 ^ 66);
        int iM2662 = C0138.m2662();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2662 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0235.m4515("bSb15iD65F7u")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static short[] m6584() {
        int iM5504 = C0286.m5504();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5504 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f572short;
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

    public final void s() {
        boolean zM5603 = C0292.m5603(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM5603) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int iM1701 = C0079.m1701();
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM1701 <= 0) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                System.out.println(Long.decode(C0392.m7652("IaZiKt")));
                                return;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    throw new IllegalStateException(C0184.m3519(m6584(), 0, C0482.f755 ^ (-552), 2606));
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final void t() {
        boolean zM5603 = C0292.m5603(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM5603) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    boolean zM4219 = C0219.m4219(this);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM4219) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0125.m2427(C0405.m7942((f5) C0163.m3121(this)));
                                this.f10269b = true;
                                return;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    throw new IllegalStateException(C0091.m1946(m6584(), 15, C0391.f661 ^ (-301), 3145));
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public abstract boolean u();
}
