package k0;

import aa.C0012;
import android.os.C0013;
import androidx.activity.C0017;
import b1.C0050;
import c1.C0059;
import c4.C0066;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.annotations.C0128;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0229;
import e0.C0257;
import f4.C0277;
import h.C0298;
import l9.C0348;
import m1.C0351;
import m4.C0354;
import m7.C0358;
import r7.C0405;
import w0.C0455;

/* JADX INFO: loaded from: classes.dex */
public final class u extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1.x0 f9506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1.x0 f9508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y.g f9509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r1.x0 f9511f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r1.l0 f9512n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y.i f9513o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f9514p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f9515q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r1.x0 x0Var, int i10, r1.x0 x0Var2, y.g gVar, long j10, r1.x0 x0Var3, r1.l0 l0Var, y.i iVar, int i11, int i12) {
        super(1);
        this.f9506a = x0Var;
        this.f9507b = i10;
        this.f9508c = x0Var2;
        this.f9509d = gVar;
        this.f9510e = j10;
        this.f9511f = x0Var3;
        this.f9512n = l0Var;
        this.f9513o = iVar;
        this.f9514p = i11;
        this.f9515q = i12;
        int iM3367 = C0176.m3367();
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3367 >= 0) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0348.m6812("iEFx5Zl2Db9h7kERGILQjf")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i13 = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0079 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0060. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0092. Please report as an issue. */
    @Override // c9.c
    public final Object invoke(Object obj) {
        int iM1119;
        int iM11110;
        int iM3212;
        int i10;
        r1.w0 w0Var = (r1.w0) obj;
        r1.x0 x0VarM1947 = C0091.m1947(this);
        int iM6867 = C0351.m6867(x0VarM1947);
        int iM1283 = C0066.m1283(this);
        C0050.m966(w0Var, x0VarM1947, 0, (((iM1283 - 13) - iM6867) + 13) / (C0166.f190 ^ (-571)));
        y.f fVarM5323 = C0277.m5323();
        y.g gVarM247 = C0013.m247(this);
        boolean zM4399 = C0229.m4399(gVarM247, fVarM5323);
        r1.x0 x0VarM7016 = C0358.m7016(this);
        r1.x0 x0VarM2483 = C0128.m2483(this);
        long jM1577 = C0073.m1577(this);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = zM4399 ? 1709 : 1678;
                    break;
                case 204:
                    int iM3213 = C0168.m3212(jM1577);
                    int iM1647 = C0076.m1647(x0VarM2483);
                    int i12 = (((iM3213 + 5) - iM1647) - 5) / (C0455.f725 ^ 310);
                    int iM1648 = C0076.m1647(x0VarM1947);
                    int i13 = 1740;
                    while (true) {
                        i13 ^= 1757;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i13 = i12 < iM1648 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                int iM3214 = C0168.m3212(jM1577);
                                int iM1649 = C0076.m1647(x0VarM7016);
                                int i14 = 48767;
                                while (true) {
                                    i14 ^= 48784;
                                    switch (i14) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            iM1119 = i12;
                                            break;
                                        case 76:
                                            iM3212 = (((((C0168.m3212(jM1577) - 28) - C0076.m1647(x0VarM7016)) + 28) - 3) - (i12 - (0 - C0076.m1647(x0VarM2483)))) + 3;
                                            int i15 = 48891;
                                            while (true) {
                                                i15 ^= 48908;
                                                switch (i15) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i15 = 48922;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                                iM1119 = 0 - ((0 - i12) - iM3212);
                                                i10 = 1864;
                                                while (true) {
                                                    i10 ^= 1881;
                                                    switch (i10) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i10 = 48674;
                                                            break;
                                                        case 47483:
                                                            break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 239:
                                            i14 = ((iM1647 + (-16)) + i12) + 16 > ((iM3214 + 2) - iM1649) + (-2) ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                iM3212 = ((iM1648 + 1) - i12) - 1;
                                iM1119 = 0 - ((0 - i12) - iM3212);
                                i10 = 1864;
                                while (true) {
                                    i10 ^= 1881;
                                    switch (i10) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i10 = 48674;
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
                    break;
                case 239:
                    boolean zM43910 = C0229.m4399(gVarM247, C0298.m5714());
                    int i16 = 49666;
                    while (true) {
                        i16 ^= 49683;
                        switch (i16) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i16 = zM43910 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                iM1119 = (((((C0168.m3212(jM1577) + 5) - C0076.m1647(x0VarM2483)) - 5) + 25) - C0076.m1647(x0VarM7016)) - 25;
                                int i17 = 49790;
                                while (true) {
                                    i17 ^= 49807;
                                    switch (i17) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i17 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                iM1119 = C0059.m1119(C0152.m2912(C0354.m6931(this), C0154.m2965()), C0076.m1647(x0VarM1947));
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
        y.i iVarM4899 = C0257.m4899(this);
        boolean zM43911 = C0229.m4399(iVarM4899, fVarM5323);
        int i18 = 49914;
        while (true) {
            i18 ^= 49931;
            switch (i18) {
                case 497:
                    if (zM43911) {
                        i18 = 50658;
                    }
                    break;
                case 1711:
                    break;
                case 1736:
                    boolean zM43912 = C0229.m4399(iVarM4899, C0405.m7940());
                    int i19 = 50813;
                    while (true) {
                        i19 ^= 50830;
                        switch (i19) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                iM11110 = 0;
                                break;
                            case 243:
                                if (zM43912) {
                                    i19 = 51557;
                                }
                                break;
                            case 4075:
                                int iM3743 = C0195.m3743(this);
                                int i20 = 51588;
                                while (true) {
                                    i20 ^= 51605;
                                    switch (i20) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (iM3743 == 0) {
                                                i20 = 51681;
                                            }
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            int iM6868 = C0351.m6867(x0VarM2483);
                                            iM11110 = (((((iM1283 + 16) - iM6868) - 16) - 9) - C0059.m1119(0, 0 - ((0 - (((iM3743 - 30) - iM6868) + 30)) - C0017.m352(this)))) + 9;
                                            break;
                                        case 116:
                                            iM11110 = ((iM1283 + 0) - C0351.m6867(x0VarM2483)) + 0;
                                            int i21 = 51712;
                                            while (true) {
                                                i21 ^= 51729;
                                                switch (i21) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i21 = 51743;
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i20 = 51650;
                                }
                                break;
                            default:
                                continue;
                        }
                        i19 = 50875;
                    }
                    break;
                case 1769:
                    iM11110 = (((iM1283 + 18) - C0351.m6867(x0VarM2483)) - 18) / (C0081.f115 ^ 186);
                    int i22 = 50689;
                    while (true) {
                        i22 ^= 50706;
                        switch (i22) {
                            case 19:
                                i22 = 50720;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i18 = 50627;
        }
        C0050.m966(w0Var, x0VarM2483, iM1119, iM11110);
        C0050.m966(w0Var, x0VarM7016, ((C0168.m3212(jM1577) + 6) - C0076.m1647(x0VarM7016)) - 6, (((iM1283 - 18) - C0351.m6867(x0VarM7016)) + 18) / (C0148.f173 ^ (-244)));
        return C0012.m238();
    }
}
