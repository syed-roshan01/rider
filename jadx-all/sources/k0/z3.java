package k0;

import aa.C0012;
import androidx.compose.ui.graphics.C0032;
import b1.C0050;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.annotations.C0128;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.installations.C0177;
import com.google.firebase.measurement.C0182;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.internal.Code;
import h5.C0308;
import h7.C0311;
import j9.C0330;
import m1.C0351;
import n9.C0367;
import p4.C0377;
import p8.C0381;
import q6.C0387;
import s.C0409;
import x7.C0473;

/* JADX INFO: loaded from: classes.dex */
public final class z3 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1.x0 f9702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1.x0 f9703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1.l0 f9704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f9707f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f9708n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(r1.x0 x0Var, r1.x0 x0Var2, r1.l0 l0Var, int i10, int i11, Integer num, Integer num2) {
        super(1);
        this.f9702a = x0Var;
        this.f9703b = x0Var2;
        this.f9704c = l0Var;
        this.f9705d = i10;
        this.f9706e = i11;
        this.f9707f = num;
        this.f9708n = num2;
        int iM5997 = C0311.m5997();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5997 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0308.m5949("S9")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0023. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0013. Please report as an issue. */
    @Override // c9.c
    public final Object invoke(Object obj) {
        float fM8003;
        r1.w0 w0Var = (r1.w0) obj;
        r1.x0 x0VarM7382 = C0377.m7382(this);
        int iM627 = C0032.m627(this);
        r1.x0 x0VarM2461 = C0128.m2461(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = x0VarM2461 != null ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = x0VarM7382 != null ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                Integer numM3124 = C0163.m3124(this);
                                C0189.m3608(numM3124);
                                int iM7190 = C0367.m7190(numM3124);
                                Integer numM3374 = C0177.m3374(this);
                                C0189.m3608(numM3374);
                                int iM7191 = C0367.m7190(numM3374);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = iM7190 == iM7191 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            fM8003 = C0409.m8003();
                                            break;
                                        case 47417:
                                            fM8003 = C0311.m5995();
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 239:
                                                        i13 = 48798;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                r1.l0 l0VarM9192 = C0473.m9192(this);
                                int iM2912 = C0152.m2912(l0VarM9192, fM8003);
                                int iM2913 = C0152.m2912(l0VarM9192, C0147.m2817());
                                int iM6867 = C0351.m6867(x0VarM7382);
                                int iM6356 = C0330.m6356(l0VarM9192, C0081.m1745());
                                int iM1647 = C0076.m1647(x0VarM2461);
                                int iM1600 = C0073.m1600(this);
                                int i14 = (((((iM627 - 21) - iM7191) + 21) + 24) - ((iM2912 + (iM2913 + 20)) - 20)) - 24;
                                C0050.m966(w0Var, x0VarM2461, (((iM1600 + 6) - iM1647) - 6) / (C0387.f657 ^ (-669)), i14);
                                C0050.m966(w0Var, x0VarM7382, (((iM1600 - 28) - C0076.m1647(x0VarM7382)) + 28) / (C0381.f651 ^ (-706)), ((i14 - 27) - ((((((iM6356 - 8) + iM6867) + 8) - 7) - iM7190) + 7)) + 27);
                                int i15 = 48891;
                                while (true) {
                                    i15 ^= 48908;
                                    switch (i15) {
                                        case 22:
                                            break;
                                        case 503:
                                            i15 = 48922;
                                            break;
                                    }
                                }
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
            return C0012.m238();
        }
        int i16 = 49666;
        while (true) {
            i16 ^= 49683;
            switch (i16) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (x0VarM2461 != null) {
                        i16 = 49759;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    C0182.m3482();
                    C0050.m966(w0Var, x0VarM2461, 0, (((iM627 + 28) - C0351.m6867(x0VarM2461)) - 28) / (C0119.f145 ^ 899));
                    int i17 = 49790;
                    while (true) {
                        i17 ^= 49807;
                        switch (i17) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 241:
                                i17 = 49821;
                                break;
                        }
                    }
                    break;
                case 83:
                    int i18 = 49914;
                    while (true) {
                        i18 ^= 49931;
                        switch (i18) {
                            case 497:
                                if (x0VarM7382 != null) {
                                    i18 = 50658;
                                }
                                break;
                            case 1711:
                                break;
                            case 1736:
                                break;
                            case 1769:
                                C0182.m3482();
                                C0050.m966(w0Var, x0VarM7382, 0, (((iM627 - 15) - C0351.m6867(x0VarM7382)) + 15) / (C0112.f138 ^ 570));
                                break;
                            default:
                                continue;
                        }
                        i18 = 50627;
                    }
                    break;
                default:
                    continue;
            }
            i16 = 49728;
        }
        return C0012.m238();
    }
}
