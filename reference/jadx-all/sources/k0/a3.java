package k0;

import a.C0000;
import a7.C0008;
import android.support.v4.app.C0014;
import androidx.annotation.C0019;
import androidx.compose.ui.node.C0037;
import androidx.core.app.C0040;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.installations.C0177;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.codegen.C0243;
import ea.C0269;
import g2.C0288;
import h0.C0300;
import j3.C0326;
import j9.C0330;
import r6.C0402;
import s0.C0410;
import t0.C0419;
import x8.C0474;
import z.C0482;
import z3.C0487;

/* JADX INFO: loaded from: classes.dex */
public final class a3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f480short = {2713, 2715, 2710, 2710, 2778, 2702, 2709, 2778, 2781, 2696, 2719, 2697, 2703, 2711, 2719, 2781, 2778, 2712, 2719, 2716, 2709, 2696, 2719, 2778, 2781, 2707, 2708, 2700, 2709, 2705, 2719, 2781, 2778, 2701, 2707, 2702, 2706, 2778, 2713, 2709, 2696, 2709, 2703, 2702, 2707, 2708, 2719};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u9.d f8716a = C0008.m174();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.n1 f8717b = C0173.m3305(null, C0111.m2137());

    public a3() {
        int iM5529 = C0288.m5529();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5529 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0487.m9475("Y8R")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public static Object b(a3 a3Var, String str, u8.e eVar) {
        String str2 = "ۧۤۤ";
        Object objM6289 = null;
        y2 y2Var = null;
        while (true) {
            switch (C0124.m2383(str2)) {
                case 56570:
                    y2Var = new y2(str, null, false, 1);
                    str2 = "ۤۨۦ";
                    break;
                case 1752641:
                    return objM6289;
                case 1754535:
                    C0014.m280(a3Var);
                    str2 = "ۨۢ";
                    break;
                default:
                    objM6289 = C0326.m6289(a3Var, y2Var, eVar);
                    str2 = "ۥۥۡ";
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟۟, reason: not valid java name and contains not printable characters */
    public static short[] m6411() {
        int iM9373 = C0482.m9373();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9373 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f480short;
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

    /* JADX WARN: Code duplicated, block: B:175:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x016e A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:72:0x010e. Please report as an issue. */
    public final Object a(y2 y2Var, u8.e eVar) throws Throwable {
        z2 z2Var;
        u9.a aVarM788;
        a3 a3VarM2978;
        a3 a3Var;
        Object objM3379;
        int i10;
        Object obj;
        u9.a aVar;
        boolean z10 = eVar instanceof z2;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = z10 ? 1709 : 1678;
                    break;
                case 204:
                    z2Var = (z2) eVar;
                    int iM9223 = C0474.m9223(z2Var);
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = ((Integer.MAX_VALUE ^ iM9223) & iM9223) != 0 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                z2Var = new z2(this, eVar);
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                z2Var.f9701f = ((iM9223 + 6) - Integer.MIN_VALUE) - 6;
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i13 = 48674;
                                            continue;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    z2Var = new z2(this, eVar);
                    break;
                default:
                    break;
            }
        }
        Object objM24 = C0000.m24(z2Var);
        v8.a aVarM5766 = C0300.m5766();
        int iM9224 = C0474.m9223(z2Var);
        int i14 = 48767;
        while (true) {
            i14 ^= 48784;
            switch (i14) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    C0330.m6365(objM24);
                    z2Var.f9696a = this;
                    z2Var.f9697b = y2Var;
                    aVarM788 = C0040.m788(this);
                    z2Var.f9698c = aVarM788;
                    z2Var.f9701f = 1;
                    Object objM8224 = C0419.m8224(aVarM788, null, z2Var);
                    int i15 = 50813;
                    while (true) {
                        i15 ^= 50830;
                        switch (i15) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                a3VarM2978 = this;
                                break;
                            case 243:
                                i15 = objM8224 == aVarM5766 ? 51557 : 50875;
                                break;
                            case 4075:
                                return aVarM5766;
                            default:
                                break;
                        }
                    }
                    try {
                        z2Var.f9696a = a3VarM2978;
                        z2Var.f9697b = y2Var;
                        z2Var.f9698c = aVarM788;
                        C0014.m280(z2Var);
                        z2Var.f9701f = 2;
                        m9.l lVar = new m9.l(1, C0410.m8023(z2Var));
                        C0037.m736(lVar);
                        C0037.m728(C0243.m4659(a3VarM2978), new x2(y2Var, lVar));
                        objM3379 = C0177.m3379(lVar);
                        i10 = 51588;
                        while (true) {
                            i10 ^= 51605;
                            switch (i10) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i10 = objM3379 == aVarM5766 ? 51681 : 51650;
                                    break;
                                case 54:
                                    break;
                                case 87:
                                    obj = objM3379;
                                    aVar = aVarM788;
                                    break;
                                case 116:
                                    return aVarM5766;
                                default:
                                    break;
                            }
                        }
                        try {
                            C0037.m728(C0243.m4659(a3VarM2978), null);
                            C0019.m396((u9.d) aVar, null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            C0019.m396((u9.d) aVar, null);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        a3Var = a3VarM2978;
                        try {
                            C0037.m728(C0243.m4659(a3Var), null);
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                            aVar = aVarM788;
                            C0019.m396((u9.d) aVar, null);
                            throw th;
                        }
                    }
                case 76:
                    int i16 = 48891;
                    while (true) {
                        i16 ^= 48908;
                        switch (i16) {
                            case 22:
                                break;
                            case 53:
                                aVarM788 = C0156.m2981(z2Var);
                                y2Var = C0269.m5127(z2Var);
                                a3VarM2978 = C0156.m2978(z2Var);
                                C0330.m6365(objM24);
                                int i17 = 50689;
                                while (true) {
                                    i17 ^= 50706;
                                    switch (i17) {
                                        case 19:
                                            i17 = 50720;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        default:
                                            break;
                                    }
                                    z2Var.f9696a = a3VarM2978;
                                    z2Var.f9697b = y2Var;
                                    z2Var.f9698c = aVarM788;
                                    C0014.m280(z2Var);
                                    z2Var.f9701f = 2;
                                    m9.l lVar2 = new m9.l(1, C0410.m8023(z2Var));
                                    C0037.m736(lVar2);
                                    C0037.m728(C0243.m4659(a3VarM2978), new x2(y2Var, lVar2));
                                    objM3379 = C0177.m3379(lVar2);
                                    i10 = 51588;
                                    while (true) {
                                        i10 ^= 51605;
                                        switch (i10) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (objM3379 == aVarM5766) {
                                                }
                                                break;
                                            case 54:
                                                break;
                                            case 87:
                                                obj = objM3379;
                                                aVar = aVarM788;
                                                break;
                                            case 116:
                                                return aVarM5766;
                                            default:
                                                break;
                                        }
                                    }
                                    C0037.m728(C0243.m4659(a3VarM2978), null);
                                    C0019.m396((u9.d) aVar, null);
                                    return obj;
                                }
                            case 503:
                                i16 = iM9224 != 1 ? 49635 : 48953;
                                break;
                            case 32495:
                                int i18 = 49666;
                                while (true) {
                                    i18 ^= 49683;
                                    switch (i18) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i18 = iM9224 == 2 ? 49759 : 49728;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            aVarM788 = C0156.m2981(z2Var);
                                            a3VarM2978 = C0156.m2978(z2Var);
                                            try {
                                                C0330.m6365(objM24);
                                                int i19 = 49790;
                                                while (true) {
                                                    i19 ^= 49807;
                                                    switch (i19) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            obj = objM24;
                                                            aVar = aVarM788;
                                                            break;
                                                        case 241:
                                                            i19 = 49821;
                                                            continue;
                                                        default:
                                                            continue;
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                int i20 = 49914;
                                                while (true) {
                                                    i20 ^= 49931;
                                                    switch (i20) {
                                                        case 497:
                                                            i20 = 50596;
                                                            continue;
                                                        case 1711:
                                                            a3Var = a3VarM2978;
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    C0037.m728(C0243.m4659(a3Var), null);
                                                    throw th;
                                                }
                                            }
                                            break;
                                        case 83:
                                            throw new IllegalStateException(C0402.m7861(m6411(), 0, C0139.f165 ^ 685, 2810));
                                        default:
                                            break;
                                    }
                                }
                                C0037.m728(C0243.m4659(a3VarM2978), null);
                                C0019.m396((u9.d) aVar, null);
                                return obj;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    i14 = iM9224 != 0 ? 48860 : 48829;
                    break;
                default:
                    break;
            }
        }
    }
}
