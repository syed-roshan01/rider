package k6;

import a.C0002;
import a8.C0009;
import a8.C0010;
import android.os.Bundle;
import android.support.v4.app.C0015;
import androidx.activity.C0017;
import androidx.compose.foundation.C0026;
import c1.C0060;
import com.auto.accept.service.C0072;
import com.google.firebase.emulators.C0140;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.iid.C0169;
import com.google.firebase.installations.C0177;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.measurement.C0181;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.ktx.C0199;
import com.google.gson.internal.bind.C0207;
import d4.C0217;
import d7.C0220;
import d9.C0225;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.migration.C0232;
import dagger.hilt.codegen.C0241;
import dagger.hilt.internal.generatesrootinput.C0250;
import e0.C0256;
import e2.C0260;
import f.C0269;
import f.C0270;
import f0.C0272;
import f1.C0273;
import f6.C0278;
import fa.C0279;
import i9.C0321;
import j2.C0323;
import j2.C0324;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import m1.C0351;
import m4.C0353;
import m7.C0356;
import m7.C0358;
import n.C0360;
import n7.C0364;
import p4.C0376;
import p8.C0380;
import q6.C0388;
import r1.C0393;
import r2.C0395;
import s2.C0411;
import s6.C0413;
import s7.C0415;
import s8.C0416;
import t7.C0425;
import v0.C0440;
import v0.C0441;
import v6.C0447;
import v7.C0448;
import v8.C0450;
import w.C0453;
import w4.C0461;
import x7.C0471;
import x8.C0473;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public final class c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5 f9932a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f528short = {2095, 720, 2574, 2617, 2594, 2600, 2592, 2601, 2583, 2615, 1539, 1551, 1806, 1782, 1750, 2876, 2849, 2874, 2868, 2874, 2877, 2926, 1648, 1586, 1597, 1585, 1593, 1633, 3196, 3104, 3121, 3106, 3121, 3133, 3107, 3181, 1007, 1001, 2353, 2760, 2756, 2369, 1514, 1488, 1485, 1477, 1514, 303, 306, 314, 303, 312, 291, 295, 303, 292, 318, 277, 291, 302, 354, 2603};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f9929b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f9930c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f9931d = new AtomicReference();

    public c4(g5 g5Var) {
        this.f9932a = g5Var;
        int iM332 = C0017.m332();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM332 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0169.m3234("oP0aNkXdwLSM2TDrUPpINq")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:185:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x00ad A[DONT_GENERATE, SYNTHETIC] */
    public static String c(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        int i10;
        String[] strArr3;
        int i11 = 0;
        boolean z10 = true;
        C0270.m5173(atomicReference);
        int length = strArr.length;
        int length2 = strArr2.length;
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i12 = length == length2 ? 1709 : 1678;
                    break;
                case 204:
                    int i13 = 1740;
                    while (true) {
                        i13 ^= 1757;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i13 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    z10 = false;
                    break;
                default:
                    break;
            }
        }
        C0260.m4977(z10);
        while (true) {
            int length3 = strArr.length;
            int i14 = 1864;
            while (true) {
                i14 ^= 1881;
                switch (i14) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i14 = i11 < length3 ? 48736 : 48705;
                        break;
                    case 47384:
                        return str;
                    case 47417:
                        break;
                    case 47483:
                        break;
                    default:
                        break;
                }
            }
            String str2 = strArr[i11];
            int i15 = 48767;
            while (true) {
                i15 ^= 48784;
                switch (i15) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        break;
                    case 76:
                        int i16 = 48891;
                        while (true) {
                            i16 ^= 48908;
                            switch (i16) {
                                case 22:
                                    break;
                                case 53:
                                    i11 += C0010.f30 ^ 880;
                                    i10 = 49914;
                                    while (true) {
                                        i10 ^= 49931;
                                        switch (i10) {
                                            case 497:
                                                i10 = 50596;
                                                break;
                                            case 1711:
                                                break;
                                        }
                                    }
                                    break;
                                case 503:
                                    i16 = str != null ? 49635 : 48953;
                                    break;
                                case 32495:
                                    boolean zM5257 = C0272.m5257(str, str2);
                                    int i17 = 49666;
                                    while (true) {
                                        i17 ^= 49683;
                                        switch (i17) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i17 = zM5257 ? 49759 : 49728;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                int i18 = 49790;
                                                while (true) {
                                                    i18 ^= 49807;
                                                    switch (i18) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 241:
                                                            i18 = 49821;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 83:
                                                i11 += C0010.f30 ^ 880;
                                                i10 = 49914;
                                                while (true) {
                                                    i10 ^= 49931;
                                                    switch (i10) {
                                                        case 497:
                                                            i10 = 50596;
                                                            break;
                                                        case 1711:
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
                        break;
                    case 239:
                        i15 = str != str2 ? 48860 : 48829;
                        break;
                    default:
                        break;
                }
            }
        }
        synchronized (atomicReference) {
            try {
                String[] strArr4 = (String[]) C0490.m9542(atomicReference);
                int i19 = 50689;
                while (true) {
                    i19 ^= 50706;
                    switch (i19) {
                        case 19:
                            i19 = strArr4 == null ? 50782 : 50751;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            strArr3 = strArr4;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 76:
                            String[] strArr5 = new String[strArr2.length];
                            C0225.m4329(atomicReference, strArr5);
                            int i20 = 50813;
                            while (true) {
                                i20 ^= 50830;
                                switch (i20) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        strArr3 = strArr5;
                                        break;
                                    case 243:
                                        i20 = 50844;
                                        continue;
                                    default:
                                        continue;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                }
                String str3 = strArr3[i11];
                int i21 = 51712;
                while (true) {
                    i21 ^= 51729;
                    switch (i21) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (str3 == null) {
                                i21 = 51805;
                            }
                            break;
                        case 47:
                            break;
                        case 76:
                            StringBuilder sb = new StringBuilder();
                            C0142.m2728(sb, strArr2[i11]);
                            C0142.m2728(sb, C0376.m7387(m6540(), 0, 1, 2055));
                            C0142.m2728(sb, strArr[i11]);
                            C0142.m2728(sb, C0072.m1553(m6540(), 1, 1, 761));
                            strArr3[i11] = C0440.m8605(sb);
                            break;
                        default:
                            continue;
                    }
                    i21 = 51774;
                }
                str = strArr3[i11];
            } catch (Throwable th) {
                int i22 = 51588;
                while (true) {
                    i22 ^= 51605;
                    switch (i22) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i22 = 51619;
                            break;
                        case 54:
                            throw th;
                    }
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ۟ۤۤۤۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6540() {
        int iM6984 = C0356.m6984();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6984 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f528short;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0057. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x00dd. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x0109. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x0139. Please report as an issue. */
    public final String a(Bundle bundle) {
        String strM4789;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (bundle == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return null;
                case 239:
                    boolean zM4898 = C0256.m4898(C0279.m5402(this));
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM4898) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                StringBuilder sb = new StringBuilder();
                                C0142.m2728(sb, C0009.m179(m6540(), 2, C0364.f635 ^ (-750), 2636));
                                Iterator itM5256 = C0272.m5256(C0060.m1152(bundle));
                                while (true) {
                                    boolean zM3327 = C0174.m3327(itM5256);
                                    int i12 = 1864;
                                    while (true) {
                                        i12 ^= 1881;
                                        switch (i12) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i12 = zM3327 ? 48736 : 48705;
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                break;
                                            case 47483:
                                                break;
                                            default:
                                                break;
                                        }
                                        C0142.m2728(sb, C0388.m7613(m6540(), 13, C0358.f629 ^ 528, 1675));
                                        return C0440.m8605(sb);
                                    }
                                    String str = (String) C0413.m8115(itM5256);
                                    int iM8854 = C0453.m8854(sb);
                                    int i13 = 48767;
                                    while (true) {
                                        i13 ^= 48784;
                                        switch (i13) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                break;
                                            case 76:
                                                C0142.m2728(sb, C0278.m5391(m6540(), 10, C0241.f321 ^ (-808), 1583));
                                                break;
                                            case 239:
                                                i13 = iM8854 != 8 ? 48860 : 48829;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    C0142.m2728(sb, C0411.m8083(this, str));
                                    C0142.m2728(sb, C0228.m4396(m6540(), 12, 1, 1843));
                                    Object objM195 = C0010.m195(bundle, str);
                                    boolean z10 = objM195 instanceof Bundle;
                                    int i14 = 48891;
                                    while (true) {
                                        i14 ^= 48908;
                                        switch (i14) {
                                            case 22:
                                                break;
                                            case 53:
                                                boolean z11 = objM195 instanceof Object[];
                                                int i15 = 49790;
                                                while (true) {
                                                    i15 ^= 49807;
                                                    switch (i15) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 51:
                                                            boolean z12 = objM195 instanceof ArrayList;
                                                            int i16 = 50689;
                                                            while (true) {
                                                                i16 ^= 50706;
                                                                switch (i16) {
                                                                    case 19:
                                                                        i16 = z12 ? 50782 : 50751;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        strM4789 = C0250.m4789(objM195);
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 76:
                                                                        strM4789 = C0441.m8616(this, C0273.m5270((ArrayList) objM195));
                                                                        int i17 = 50813;
                                                                        while (true) {
                                                                            i17 ^= 50830;
                                                                            switch (i17) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case 243:
                                                                                    i17 = 50844;
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 84:
                                                            strM4789 = C0441.m8616(this, (Object[]) objM195);
                                                            int i18 = 49914;
                                                            while (true) {
                                                                i18 ^= 49931;
                                                                switch (i18) {
                                                                    case 497:
                                                                        i18 = 50596;
                                                                        break;
                                                                    case 1711:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        case 241:
                                                            i15 = z11 ? 49883 : 49852;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 503:
                                                i14 = z10 ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                Object[] objArr = new Object[1];
                                                objArr[C0072.f104 ^ 113] = objM195;
                                                strM4789 = C0441.m8616(this, objArr);
                                                int i19 = 49666;
                                                while (true) {
                                                    i19 ^= 49683;
                                                    switch (i19) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i19 = 49697;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    break;
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    C0142.m2728(sb, strM4789);
                                    int i20 = 51588;
                                    while (true) {
                                        i20 ^= 51605;
                                        switch (i20) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i20 = 51619;
                                                break;
                                            case 54:
                                                break;
                                        }
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return C0473.m9222(bundle);
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final String b(String str) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (str == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return null;
                case 239:
                    boolean zM4898 = C0256.m4898(C0279.m5402(this));
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM4898) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return C0164.m3149(str, C0217.m4140(), C0448.m8742(), C0181.m3461());
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return str;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final String d(v vVar) {
        String strM4479;
        g5 g5VarM5402 = C0279.m5402(this);
        boolean zM4898 = C0256.m4898(g5VarM5402);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM4898) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return C0207.m3962(vVar);
                case 239:
                    StringBuilder sb = new StringBuilder(C0250.m4786(m6540(), 15, C0199.f223 ^ (-49), 2899));
                    C0142.m2728(sb, C0471.m9170(vVar));
                    C0142.m2728(sb, C0395.m7741(m6540(), 22, C0450.f721 ^ (-685), 1628));
                    C0142.m2728(sb, C0174.m3320(this, C0278.m5389(vVar)));
                    C0142.m2728(sb, C0002.m45(m6540(), 28, C0461.f732 ^ 853, 3152));
                    s sVarM6279 = C0324.m6279(vVar);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (sVarM6279 == null) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                boolean zM4899 = C0256.m4898(g5VarM5402);
                                int i12 = 48767;
                                while (true) {
                                    i12 ^= 48784;
                                    switch (i12) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            strM4479 = C0232.m4479(this, C0415.m8166(sVarM6279));
                                            break;
                                        case 76:
                                            strM4479 = C0473.m9222(C0152.m2916(sVarM6279));
                                            int i13 = 48891;
                                            while (true) {
                                                i13 ^= 48908;
                                                switch (i13) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i13 = 48922;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 239:
                                            i12 = !zM4899 ? 48860 : 48829;
                                            break;
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                strM4479 = null;
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
                                continue;
                        }
                        i11 = 1802;
                    }
                    C0142.m2728(sb, strM4479);
                    return C0440.m8605(sb);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x003d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x006c. Please report as an issue. */
    public final String e(Object[] objArr) {
        String strM4789;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (objArr == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return C0393.m7710(m6540(), 36, C0321.f469 ^ (-619), 948);
                case 239:
                    StringBuilder sb = new StringBuilder();
                    C0142.m2728(sb, C0450.m8781(m6540(), 38, 1, 2410));
                    int length = objArr.length;
                    int i11 = 0;
                    while (true) {
                        int i12 = i11;
                        int i13 = 1740;
                        while (true) {
                            i13 ^= 1757;
                            switch (i13) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i13 = i12 < length ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    break;
                                default:
                                    break;
                            }
                            C0142.m2728(sb, C0015.m302(m6540(), 41, 1, 2332));
                            return C0440.m8605(sb);
                        }
                        Object obj = objArr[i12];
                        boolean z10 = obj instanceof Bundle;
                        int i14 = 1864;
                        while (true) {
                            i14 ^= 1881;
                            switch (i14) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i14 = z10 ? 48736 : 48705;
                                    break;
                                case 47384:
                                    strM4789 = C0250.m4789(obj);
                                    break;
                                case 47417:
                                    strM4789 = C0232.m4479(this, (Bundle) obj);
                                    int i15 = 48767;
                                    while (true) {
                                        i15 ^= 48784;
                                        switch (i15) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 239:
                                                i15 = 48798;
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    }
                                    break;
                                case 47483:
                                    break;
                                default:
                                    break;
                            }
                        }
                        int i16 = 48891;
                        while (true) {
                            i16 ^= 48908;
                            switch (i16) {
                                case 22:
                                    break;
                                case 53:
                                    break;
                                case 503:
                                    i16 = strM4789 != null ? 49635 : 48953;
                                    break;
                                case 32495:
                                    int iM8854 = C0453.m8854(sb);
                                    int i17 = 49666;
                                    while (true) {
                                        i17 ^= 49683;
                                        switch (i17) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i17 = iM8854 != 1 ? 49759 : 49728;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                C0142.m2728(sb, C0183.m3496(m6540(), 39, C0140.f166 ^ 65, 2788));
                                                break;
                                            case 83:
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    C0142.m2728(sb, strM4789);
                                    break;
                                default:
                                    break;
                            }
                        }
                        i11 = (C0416.f687 ^ (-671)) + i12;
                        int i18 = 49790;
                        while (true) {
                            i18 ^= 49807;
                            switch (i18) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case 241:
                                    i18 = 49821;
                                    break;
                            }
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final String f(String str) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (str == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return null;
                case 239:
                    boolean zM4898 = C0256.m4898(C0279.m5402(this));
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM4898) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return C0164.m3149(str, C0269.m5137(), C0227.m4384(), C0425.m8349());
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return str;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final String g(String str) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (str == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return null;
                case 239:
                    boolean zM4898 = C0256.m4898(C0279.m5402(this));
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM4898) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                boolean zM8715 = C0447.m8715(str, C0026.m510(m6540(), 42, C0360.f631 ^ 743, 1461));
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (zM8715) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            return C0164.m3149(str, C0323.m6268(), C0351.m6887(), C0425.m8342());
                                        case 47417:
                                            return C0220.m4242(C0380.m7456(m6540(), 47, C0353.f624 ^ 887, 330), str, C0177.m3376(m6540(), 61, 1, 2562));
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i12 = 48705;
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return str;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
