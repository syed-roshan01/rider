package k6;

import a.C0001;
import a.C0002;
import android.support.v4.app.C0014;
import android.support.v4.app.C0015;
import androidx.compose.ui.draw.C0029;
import androidx.core.app.C0040;
import androidx.lifecycle.C0043;
import androidx.profileinstaller.C0046;
import c4.C0065;
import com.google.android.datatransport.cct.C0077;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.C0256;
import dagger.hilt.android.components.C0229;
import e2.C0261;
import f.C0270;
import g.C0284;
import h.C0299;
import h0.C0300;
import k4.C0337;
import k8.C0339;
import l6.C0344;
import l9.C0348;
import n1.C0363;
import o2.C0369;
import p0.C0374;
import p8.C0380;
import q6.C0388;
import q9.C0392;
import r1.C0394;
import r6.C0402;
import r6.C0403;
import t1.C0420;
import t2.C0422;
import u8.C0439;
import y.C0476;
import z3.C0488;

/* JADX INFO: loaded from: classes.dex */
public final class f7 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f544short = {978, 1008, 999, 1018, 997, 1018, 999, 1002, 947, 993, 1014, 992, 998, 1022, 1014, 1015, 959, 947, 999, 1018, 1022, 1014, 1053, 1087, 1064, 1077, 1066, 1077, 1064, 1061, 1148, 1068, 1085, 1065, 1071, 1081, 1080, 1136, 1148, 1064, 1077, 1073, 1081};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d7 f10054c;

    public /* synthetic */ f7(d7 d7Var, long j10, int i10) {
        this.f10052a = i10;
        this.f10054c = d7Var;
        this.f10053b = j10;
        int iM7585 = C0388.m7585();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7585 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0229.m4395("NszTVWXz8QS4nS1")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6556() {
        int iM893 = C0046.m893();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM893 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f544short;
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

    /* JADX WARN: Code duplicated, block: B:108:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0097 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0060. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0074. Please report as an issue. */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int iM4890 = C0256.m4890(this);
        d7 d7VarM7878 = C0402.m7878(this);
        switch (iM4890) {
            case 0:
                long jM841 = C0043.m841(this);
                C0040.m791(d7VarM7878);
                C0439.m8553(d7VarM7878);
                C0420.m8245(C0136.m2634(C0029.m572(d7VarM7878)), C0165.m3159(m6556(), 22, C0077.f111 ^ (-647), 1116), C0439.m8554(jM841));
                l.t tVarM5751 = C0300.m5751(d7VarM7878);
                C0014.m280((e6.c) C0166.m3176((d7) C0001.m30(tVarM5751)));
                g7 g7Var = new g7(tVarM5751, C0402.m7869(), jM841);
                tVarM5751.f10928b = g7Var;
                C0337.m6531(C0476.m9272((d7) C0001.m30(tVarM5751)), g7Var, (-1132) ^ ((long) C0118.f144));
                boolean zM6728 = C0344.m6728(C0091.m1951(d7VarM7878));
                int i11 = 50813;
                while (true) {
                    i11 ^= 50830;
                    switch (i11) {
                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case 53:
                            break;
                        case 243:
                            if (zM6728) {
                                i11 = 51557;
                            }
                            break;
                        case 4075:
                            C0164.m3150(C0270.m5145(C0380.m7442(d7VarM7878)));
                            break;
                        default:
                            continue;
                    }
                    i11 = 50875;
                }
                break;
            default:
                C0040.m791(d7VarM7878);
                C0439.m8553(d7VarM7878);
                d4 d4VarM572 = C0029.m572(d7VarM7878);
                long jM842 = C0043.m841(this);
                C0420.m8245(C0136.m2634(d4VarM572), C0488.m9485(m6556(), 0, C0002.f770 ^ (-30), 915), C0439.m8554(jM842));
                boolean zM3575 = C0187.m3575(C0091.m1951(d7VarM7878), null, C0299.m5731());
                h7 h7VarM7442 = C0380.m7442(d7VarM7878);
                int i12 = 1616;
                while (true) {
                    i12 ^= 1633;
                    switch (i12) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i12 = zM3575 ? 1709 : 1678;
                            break;
                        case 204:
                            boolean zM6729 = C0344.m6728(C0091.m1951(d7VarM7878));
                            int i13 = 1740;
                            while (true) {
                                i13 ^= 1757;
                                switch (i13) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i13 = !zM6729 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        C0040.m791(C0015.m304(h7VarM7442));
                                        C0164.m3150(C0270.m5145(h7VarM7442));
                                        h7VarM7442.f10090a = jM842;
                                        h7VarM7442.f10091b = jM842;
                                        i10 = 48767;
                                        while (true) {
                                            i10 ^= 48784;
                                            switch (i10) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 239:
                                                    i10 = 48798;
                                                    break;
                                            }
                                        }
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        boolean zM6796 = C0348.m6796(d7VarM7878);
                                        int i14 = 1864;
                                        while (true) {
                                            i14 ^= 1881;
                                            switch (i14) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i14 = zM6796 ? 48736 : 48705;
                                                    break;
                                                case 47384:
                                                    break;
                                                case 47417:
                                                    C0040.m791(C0015.m304(h7VarM7442));
                                                    C0164.m3150(C0270.m5145(h7VarM7442));
                                                    h7VarM7442.f10090a = jM842;
                                                    h7VarM7442.f10091b = jM842;
                                                    i10 = 48767;
                                                    while (true) {
                                                        i10 ^= 48784;
                                                        switch (i10) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case 239:
                                                                i10 = 48798;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
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
                            break;
                        case 239:
                            boolean zM67210 = C0344.m6728(C0091.m1951(d7VarM7878));
                            int i15 = 48891;
                            while (true) {
                                i15 ^= 48908;
                                switch (i15) {
                                    case 22:
                                        break;
                                    case 53:
                                        C0040.m791(C0015.m304(h7VarM7442));
                                        C0164.m3150(C0270.m5145(h7VarM7442));
                                        h7VarM7442.f10090a = jM842;
                                        h7VarM7442.f10091b = jM842;
                                        break;
                                    case 503:
                                        i15 = !zM67210 ? 49635 : 48953;
                                        break;
                                    case 32495:
                                        boolean zM7653 = C0392.m7653(C0394.m7704(C0339.m6640(d7VarM7878)));
                                        int i16 = 49666;
                                        while (true) {
                                            i16 ^= 49683;
                                            switch (i16) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i16 = zM7653 ? 49759 : 49728;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 76:
                                                    C0040.m791(C0015.m304(h7VarM7442));
                                                    C0164.m3150(C0270.m5145(h7VarM7442));
                                                    h7VarM7442.f10090a = jM842;
                                                    h7VarM7442.f10091b = jM842;
                                                    break;
                                                case 83:
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
                            break;
                        default:
                            break;
                    }
                }
                l.t tVarM5752 = C0300.m5751(d7VarM7878);
                C0040.m791((d7) C0001.m30(tVarM5752));
                g7 g7Var2 = (g7) C0261.m4983(tVarM5752);
                int i17 = 49790;
                while (true) {
                    i17 ^= 49807;
                    switch (i17) {
                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case 51:
                            break;
                        case 84:
                            C0065.m1263(C0476.m9272((d7) C0001.m30(tVarM5752)), g7Var2);
                            break;
                        case 241:
                            i17 = g7Var2 != null ? 49883 : 49852;
                            break;
                        default:
                            break;
                    }
                }
                C0374.m7332(C0394.m7704(C0339.m6640((d7) C0001.m30(tVarM5752))), false);
                d7 d7Var = (d7) C0001.m30(tVarM5752);
                C0040.m791(d7Var);
                d7Var.f9981d = false;
                w4 w4VarM5459 = C0284.m5459(d7VarM7878);
                C0040.m791((d7) C0363.m7104(w4VarM5459));
                boolean zM8273 = C0422.m8273((f5) C0163.m3121((d7) C0363.m7104(w4VarM5459)));
                int i18 = 49914;
                while (true) {
                    i18 ^= 49931;
                    switch (i18) {
                        case 497:
                            i18 = zM8273 ? 50658 : 50627;
                            break;
                        case 1711:
                            break;
                        case 1736:
                            break;
                        case 1769:
                            C0014.m280((e6.c) C0166.m3176((d7) C0363.m7104(w4VarM5459)));
                            C0369.m7228(w4VarM5459, C0402.m7869(), false);
                            break;
                        default:
                            break;
                    }
                }
                int iM7897 = C0403.m7897();
                int i19 = 50689;
                while (true) {
                    i19 ^= 50706;
                    switch (i19) {
                        case 19:
                            if (iM7897 <= 0) {
                                i19 = 50782;
                            }
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 76:
                            System.out.println(Float.valueOf(C0192.m3669("NIkCzcPEfCtonj3Nt3eObpRwn")));
                            break;
                        default:
                            continue;
                    }
                    i19 = 50751;
                }
                break;
        }
    }
}
