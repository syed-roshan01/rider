package k6;

import aa.C0012;
import c1.C0059;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.stats.C0101;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.remoteconfig.internal.Code;
import f0.C0272;
import h3.C0302;
import h4.C0305;
import j2.C0325;
import m9.C0360;
import p8.C0381;
import q0.C0382;
import u1.C0433;
import v5.C0446;
import v8.C0451;
import w.C0454;

/* JADX INFO: loaded from: classes.dex */
public final class j6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10126a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f10131f;

    public j6(p6 p6Var, q6 q6Var, q6 q6Var2, long j10, boolean z10) {
        this.f10131f = p6Var;
        this.f10129d = q6Var;
        this.f10130e = q6Var2;
        this.f10127b = j10;
        this.f10128c = z10;
        int iM8792 = C0451.m8792();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8792 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0101.m1974("rCzMOroLPLRgNo5C0HXDWuVlzVX")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public j6(y5 y5Var, s5 s5Var, long j10, boolean z10, s5 s5Var2) {
        this.f10131f = y5Var;
        this.f10129d = s5Var;
        this.f10127b = j10;
        this.f10128c = z10;
        this.f10130e = s5Var2;
        int iM7467 = C0381.m7467();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7467 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0325.m6280("F3cSnghCB")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iM8679 = C0446.m8679(this);
        Object objM7049 = C0360.m7049(this);
        Object objM5216 = C0272.m5216(this);
        p2 p2VarM229 = C0012.m229(this);
        switch (iM8679) {
            case 0:
                y5 y5Var = (y5) p2VarM229;
                s5 s5Var = (s5) objM5216;
                C0154.m2960(y5Var, s5Var);
                C0149.m2859(y5Var, s5Var, C0382.m7472(this), false, C0454.m8835(this));
                boolean zM2753 = C0143.m2753();
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i10 = zM2753 ? 1709 : 1678;
                            break;
                        case 204:
                            boolean zM3575 = C0187.m3575(C0091.m1951(y5Var), null, C0302.m5818());
                            int i11 = 1740;
                            while (true) {
                                i11 ^= 1757;
                                switch (i11) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i11 = zM3575 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        C0086.m1831(y5Var, s5Var, (s5) objM7049);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                }
                int iM8470 = C0433.m8470();
                int i12 = 1864;
                while (true) {
                    i12 ^= 1881;
                    switch (i12) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (iM8470 <= 0) {
                                i12 = 48736;
                            }
                            break;
                        case 47384:
                            break;
                        case 47417:
                            System.out.println(Integer.parseInt(C0059.m1125("Iaoj")));
                            break;
                        case 47483:
                            break;
                        default:
                            continue;
                    }
                    i12 = 48705;
                }
                break;
            default:
                C0305.m5864((p6) p2VarM229, (q6) objM5216, (q6) objM7049, C0382.m7472(this), C0454.m8835(this), null);
                break;
        }
    }
}
