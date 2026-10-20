package f5;

import aa.C0012;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.tasks.C0102;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement.C0182;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0203;
import d1.C0212;
import d9.C0222;
import dagger.hilt.android.components.C0227;
import dagger.hilt.internal.aggregatedroot.C0246;
import ea.C0268;
import h0.C0299;
import j9.C0329;
import k3.C0334;
import l8.C0345;
import m5.C0355;
import n.C0361;
import o1.C0367;
import o7.i2;
import p7.C0378;
import p8.C0380;
import p9.q0;
import r4.C0398;
import r6.C0401;
import s7.C0415;
import t8.C0426;
import v0.C0440;
import v5.C0445;
import w1.C0455;
import z1.C0483;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f398short = {2000, 2019, 2036, 2031, 2016, 2031, 2021, 2023, 2034, 2031, 2025, 2024, 1958, 2019, 2027, 2023, 2031, 2026, 1958, 2037, 2019, 2024, 2034, 1958, 2034, 2025, 1958, 859, 892, 884, 881, 888, 889, 829, 873, 882, 829, 872, 877, 889, 892, 873, 888, 829, 888, 880, 892, 884, 881, 1077, 1079, 1082, 1082, 1142, 1058, 1081, 1142, 1137, 1060, 1075, 1061, 1059, 1083, 1075, 1137, 1142, 1076, 1075, 1072, 1081, 1060, 1075, 1142, 1137, 1087, 1080, 1056, 1081, 1085, 1075, 1137, 1142, 1057, 1087, 1058, 1086, 1142, 1077, 1081, 1060, 1081, 1059, 1058, 1087, 1080, 1075, 2382, 2409, 2404, 2408, 2421, 2421, 2402, 2404, 2419, 2343, 2423, 2406, 2420, 2420, 2416, 2408, 2421, 2403, 3006, 2992, 3008, 3068, 3061, 3057, 3043, 3061, 2992, 3059, 3064, 3061, 3059, 3067, 2992, 3049, 3071, 3045, 3042, 2992, 3065, 3070, 3058, 3071, 3048, 2992, 3057, 3070, 3060, 2992, 3011, 3040, 3057, 3069, 3007, 3034, 3045, 3070, 3067, 2992, 3062, 3071, 3068, 3060, 3061, 3042, 3006};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f6240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(MainViewModel mainViewModel, String str, String str2, u8.e eVar) {
        super(C0102.f128 ^ 236, eVar);
        this.f6240b = mainViewModel;
        this.f6241c = str;
        this.f6242d = str2;
        int iM4051 = C0212.m4051();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4051 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0159.m3042("NIvrvqdwApPGO8gyIruuAGtcLOn")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۠ۥۡۡ, reason: not valid java name and contains not printable characters */
    public static short[] m5334() {
        int iM6759 = C0345.m6759();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6759 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f398short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        String str = "\u06e6\u06e4\u06e6";
        String strM8355 = null;
        MainViewModel mainViewModelM7865 = null;
        String strM6980 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746726:
                    return this;
                case 1746785:
                    str = "\u06e2\u06df\u06e0";
                    strM6980 = C0355.m6980(this);
                    break;
                case 1749571:
                    str = "\u06e3\u06df\u06e3";
                    mainViewModelM7865 = C0401.m7865(this);
                    break;
                case 1750535:
                    this = new c0(mainViewModelM7865, strM8355, strM6980, eVar);
                    str = "\u06df\u06e0\u06e7";
                    break;
                default:
                    strM8355 = C0426.m8355(this);
                    str = "\u06df\u06e2\u06e4";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06df\u06e5\u06e2";
        q8.l lVarM238 = null;
        u8.e eVarM3059 = null;
        u8.e eVar = null;
        m9.d0 d0Var = null;
        Object objM2195 = obj;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56446:
                    objM2195 = C0114.m2195(this, lVarM238);
                    str = "\u06e0\u06e0\u06e1";
                    break;
                case 1746876:
                    str = "\u06e8\u06df\u06e2";
                    d0Var = (m9.d0) objM2195;
                    break;
                case 1747681:
                    return objM2195;
                case 1747779:
                    eVarM3059 = C0160.m3059(this, d0Var, eVar);
                    str = "\u06e3\u06e7\u06e0";
                    break;
                case 1750780:
                    str = "\u06e6\u06e5\u06e2";
                    this = (c0) eVarM3059;
                    break;
                case 1753603:
                    str = "\u06e4\u06e2";
                    lVarM238 = C0012.m238();
                    break;
                default:
                    str = "\u06e0\u06e3\u06e6";
                    eVar = (u8.e) obj2;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x020a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objM7205;
        boolean z10;
        int i10;
        Object objM5130;
        int i11;
        boolean z11;
        int i12;
        Throwable thM9416;
        int i13;
        int i14;
        String strM4049;
        int i15;
        String strM7799 = C0398.m7799(m5334(), 0, C0246.f326 ^ (-663), 1926);
        v8.a aVarM5766 = C0299.m5766();
        int iM8149 = C0415.m8149(this);
        q8.l lVarM238 = C0012.m238();
        String strM2125 = C0110.m2125(m5334(), 27, C0182.f206 ^ 281, 797);
        String strM6980 = C0355.m6980(this);
        MainViewModel mainViewModelM7865 = C0401.m7865(this);
        int i16 = 1616;
        while (true) {
            i16 ^= 1633;
            try {
                switch (i16) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i16 = iM8149 != 0 ? 1709 : 1678;
                        break;
                    case 204:
                        int i17 = 1740;
                        while (true) {
                            i17 ^= 1757;
                            switch (i17) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i17 = iM8149 != 1 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    C0329.m6365(obj);
                                    objM7205 = C0361.m7093((q8.h) obj);
                                    int i18 = 49790;
                                    while (true) {
                                        i18 ^= 49807;
                                        switch (i18) {
                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 241:
                                                i18 = 49821;
                                                continue;
                                            default:
                                                continue;
                                        }
                                        z10 = objM7205 instanceof q8.g;
                                        i10 = 50689;
                                        while (true) {
                                            i10 ^= 50706;
                                            switch (i10) {
                                                case 19:
                                                    i10 = z10 ? 50782 : 50751;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    a5.j jVarM7458 = C0380.m7458(mainViewModelM7865);
                                                    this.f6239a = 2;
                                                    objM5130 = C0268.m5130(jVarM7458, strM6980, this);
                                                    i11 = 50813;
                                                    while (true) {
                                                        i11 ^= 50830;
                                                        switch (i11) {
                                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 53:
                                                                break;
                                                            case 243:
                                                                i11 = objM5130 == aVarM5766 ? 51557 : 50875;
                                                                break;
                                                            case 4075:
                                                                return aVarM5766;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 76:
                                                    q0 q0VarM7412 = C0378.m7412(mainViewModelM7865);
                                                    q0 q0VarM1601 = C0073.m1601(mainViewModelM7865);
                                                    C0227.m4382(q0VarM7412, C0203.m3898(m5334(), 96, C0180.f204 ^ (-358), 2311));
                                                    Boolean boolM8876 = C0455.m8876();
                                                    C0227.m4382(q0VarM1601, boolM8876);
                                                    C0227.m4382(q0VarM1601, boolM8876);
                                                    return lVarM238;
                                                default:
                                                    break;
                                            }
                                        }
                                        z11 = objM5130 instanceof q8.g;
                                        i12 = 51588;
                                        while (true) {
                                            i12 ^= 51605;
                                            switch (i12) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i12 = ((((z11 ? 1 : 0) ^ '\uffff') & 1) | ((z11 ? 1 : 0) & '\ufffe')) != 0 ? 51681 : 51650;
                                                    break;
                                                case 54:
                                                    break;
                                                case 87:
                                                    break;
                                                case 116:
                                                    q0 q0VarM7413 = C0378.m7412(mainViewModelM7865);
                                                    StringBuilder sb = new StringBuilder(strM7799);
                                                    C0142.m2728(sb, strM6980);
                                                    C0142.m2728(sb, C0222.m4290(m5334(), 114, C0445.f716 ^ 530, 2960));
                                                    C0227.m4382(q0VarM7413, C0440.m8605(sb));
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        thM9416 = C0483.m9416(objM5130);
                                        i13 = 51712;
                                        while (true) {
                                            i13 ^= 51729;
                                            switch (i13) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i13 = thM9416 != null ? 51805 : 51774;
                                                    break;
                                                case 47:
                                                    break;
                                                case 76:
                                                    q0 q0VarM7414 = C0378.m7412(mainViewModelM7865);
                                                    strM4049 = C0212.m4049(thM9416);
                                                    i15 = 51836;
                                                    while (true) {
                                                        i15 ^= 51853;
                                                        switch (i15) {
                                                            case 241:
                                                                i15 = strM4049 == null ? 52580 : 52549;
                                                                break;
                                                            case 1963:
                                                                break;
                                                            case 1992:
                                                                break;
                                                            case 2025:
                                                                strM4049 = strM2125;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0227.m4382(q0VarM7414, strM4049);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        C0227.m4382(C0073.m1601(mainViewModelM7865), C0455.m8876());
                                        i14 = 52611;
                                        while (true) {
                                            i14 ^= 52628;
                                            switch (i14) {
                                                case 23:
                                                    i14 = 52642;
                                                    continue;
                                                    continue;
                                                    continue;
                                                case 54:
                                                    break;
                                                default:
                                                    continue;
                                                    continue;
                                                    continue;
                                            }
                                            return lVarM238;
                                        }
                                    }
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    int i19 = 1864;
                                    while (true) {
                                        i19 ^= 1881;
                                        switch (i19) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i19 = iM8149 == 2 ? 48736 : 48705;
                                                break;
                                            case 47384:
                                                throw new IllegalStateException(C0133.m2577(m5334(), 49, C0126.f152 ^ (-225), 1110));
                                            case 47417:
                                                C0329.m6365(obj);
                                                objM5130 = C0361.m7093((q8.h) obj);
                                                int i20 = 48767;
                                                while (true) {
                                                    i20 ^= 48784;
                                                    switch (i20) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case 239:
                                                            i20 = 48798;
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
                                    z11 = objM5130 instanceof q8.g;
                                    i12 = 51588;
                                    while (true) {
                                        i12 ^= 51605;
                                        switch (i12) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (((((z11 ? 1 : 0) ^ '\uffff') & 1) | ((z11 ? 1 : 0) & '\ufffe')) != 0) {
                                                }
                                                break;
                                            case 54:
                                                break;
                                            case 87:
                                                break;
                                            case 116:
                                                q0 q0VarM7415 = C0378.m7412(mainViewModelM7865);
                                                StringBuilder sb2 = new StringBuilder(strM7799);
                                                C0142.m2728(sb2, strM6980);
                                                C0142.m2728(sb2, C0222.m4290(m5334(), 114, C0445.f716 ^ 530, 2960));
                                                C0227.m4382(q0VarM7415, C0440.m8605(sb2));
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    thM9416 = C0483.m9416(objM5130);
                                    i13 = 51712;
                                    while (true) {
                                        i13 ^= 51729;
                                        switch (i13) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (thM9416 != null) {
                                                }
                                                break;
                                            case 47:
                                                break;
                                            case 76:
                                                q0 q0VarM7416 = C0378.m7412(mainViewModelM7865);
                                                strM4049 = C0212.m4049(thM9416);
                                                i15 = 51836;
                                                while (true) {
                                                    i15 ^= 51853;
                                                    switch (i15) {
                                                        case 241:
                                                            if (strM4049 == null) {
                                                            }
                                                            break;
                                                        case 1963:
                                                            break;
                                                        case 1992:
                                                            break;
                                                        case 2025:
                                                            strM4049 = strM2125;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0227.m4382(q0VarM7416, strM4049);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    C0227.m4382(C0073.m1601(mainViewModelM7865), C0455.m8876());
                                    i14 = 52611;
                                    while (true) {
                                        i14 ^= 52628;
                                        switch (i14) {
                                            case 23:
                                                i14 = 52642;
                                                continue;
                                                continue;
                                                continue;
                                            case 54:
                                                break;
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        return lVarM238;
                                    }
                                default:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        C0329.m6365(obj);
                        C0227.m4382(C0073.m1601(mainViewModelM7865), C0334.m6483());
                        C0227.m4382(C0378.m7412(mainViewModelM7865), null);
                        a5.j jVarM7459 = C0380.m7458(mainViewModelM7865);
                        String strM8355 = C0426.m8355(this);
                        this.f6239a = 1;
                        objM7205 = C0367.m7205(jVarM7459, strM8355, this);
                        int i21 = 49914;
                        while (true) {
                            i21 ^= 49931;
                            switch (i21) {
                                case 497:
                                    i21 = objM7205 == aVarM5766 ? 50658 : 50627;
                                    break;
                                case 1711:
                                    break;
                                case 1736:
                                    break;
                                case 1769:
                                    return aVarM5766;
                                default:
                                    break;
                            }
                        }
                        z10 = objM7205 instanceof q8.g;
                        i10 = 50689;
                        while (true) {
                            i10 ^= 50706;
                            switch (i10) {
                                case 19:
                                    if (z10) {
                                    }
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    a5.j jVarM74510 = C0380.m7458(mainViewModelM7865);
                                    this.f6239a = 2;
                                    objM5130 = C0268.m5130(jVarM74510, strM6980, this);
                                    i11 = 50813;
                                    while (true) {
                                        i11 ^= 50830;
                                        switch (i11) {
                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 53:
                                                break;
                                            case 243:
                                                if (objM5130 == aVarM5766) {
                                                }
                                                break;
                                            case 4075:
                                                return aVarM5766;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 76:
                                    q0 q0VarM7417 = C0378.m7412(mainViewModelM7865);
                                    q0 q0VarM1602 = C0073.m1601(mainViewModelM7865);
                                    C0227.m4382(q0VarM7417, C0203.m3898(m5334(), 96, C0180.f204 ^ (-358), 2311));
                                    Boolean boolM8877 = C0455.m8876();
                                    C0227.m4382(q0VarM1602, boolM8877);
                                    C0227.m4382(q0VarM1602, boolM8877);
                                    return lVarM238;
                                default:
                                    break;
                            }
                        }
                        z11 = objM5130 instanceof q8.g;
                        i12 = 51588;
                        while (true) {
                            i12 ^= 51605;
                            switch (i12) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    if (((((z11 ? 1 : 0) ^ '\uffff') & 1) | ((z11 ? 1 : 0) & '\ufffe')) != 0) {
                                    }
                                    break;
                                case 54:
                                    break;
                                case 87:
                                    break;
                                case 116:
                                    q0 q0VarM7418 = C0378.m7412(mainViewModelM7865);
                                    StringBuilder sb3 = new StringBuilder(strM7799);
                                    C0142.m2728(sb3, strM6980);
                                    C0142.m2728(sb3, C0222.m4290(m5334(), 114, C0445.f716 ^ 530, 2960));
                                    C0227.m4382(q0VarM7418, C0440.m8605(sb3));
                                    break;
                                default:
                                    break;
                            }
                        }
                        thM9416 = C0483.m9416(objM5130);
                        i13 = 51712;
                        while (true) {
                            i13 ^= 51729;
                            switch (i13) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    if (thM9416 != null) {
                                    }
                                    break;
                                case 47:
                                    break;
                                case 76:
                                    q0 q0VarM7419 = C0378.m7412(mainViewModelM7865);
                                    strM4049 = C0212.m4049(thM9416);
                                    i15 = 51836;
                                    while (true) {
                                        i15 ^= 51853;
                                        switch (i15) {
                                            case 241:
                                                if (strM4049 == null) {
                                                }
                                                break;
                                            case 1963:
                                                break;
                                            case 1992:
                                                break;
                                            case 2025:
                                                strM4049 = strM2125;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    C0227.m4382(q0VarM7419, strM4049);
                                    break;
                                default:
                                    break;
                            }
                        }
                        C0227.m4382(C0073.m1601(mainViewModelM7865), C0455.m8876());
                        i14 = 52611;
                        while (true) {
                            i14 ^= 52628;
                            switch (i14) {
                                case 23:
                                    i14 = 52642;
                                    continue;
                                    continue;
                                    continue;
                                case 54:
                                    break;
                                default:
                                    continue;
                                    continue;
                                    continue;
                            }
                            return lVarM238;
                        }
                    default:
                        break;
                }
            } catch (Exception e4) {
                int i22 = 49666;
                while (true) {
                    i22 ^= 49683;
                    switch (i22) {
                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i22 = 49697;
                            continue;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            q0 q0VarM74110 = C0378.m7412(mainViewModelM7865);
                            String strM40410 = C0212.m4049(e4);
                            int i23 = 52735;
                            while (true) {
                                i23 ^= 52752;
                                switch (i23) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        break;
                                    case 1007:
                                        i23 = strM40410 == null ? 53479 : 52797;
                                        break;
                                    case 7927:
                                        int i24 = 53510;
                                        while (true) {
                                            i24 ^= 53527;
                                            switch (i24) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i24 = 53541;
                                                    continue;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    strM40410 = strM2125;
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
                            C0227.m4382(q0VarM74110, strM40410);
                            Boolean boolM8878 = C0455.m8876();
                            q0 q0VarM1603 = C0073.m1601(mainViewModelM7865);
                            break;
                        default:
                            continue;
                    }
                }
            } finally {
                int i25 = 48891;
                while (true) {
                    i25 ^= 48908;
                    switch (i25) {
                        case 22:
                            C0227.m4382(C0073.m1601(mainViewModelM7865), C0455.m8876());
                        case 503:
                            i25 = 48922;
                            break;
                    }
                }
            }
        }
    }
}
