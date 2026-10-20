package a5;

import aa.C0012;
import androidx.compose.ui.platform.C0038;
import com.google.android.gms.tasks.C0106;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.ktx.C0179;
import com.google.firebase.remoteconfig.internal.Code;
import j2.C0324;
import la.C0349;
import m3.C0353;
import o7.i2;
import q2.C0385;
import u2.C0434;
import z7.C0489;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f12short = {968, 1017, 993, 1013, 1021, 1014, 1004, 974, 1021, 1002, 1009, 1022, 1009, 1021, 1002, 3140, 3142, 3147, 3147, 3079, 3155, 3144, 3079, 3072, 3157, 3138, 3156, 3154, 3146, 3138, 3072, 3079, 3141, 3138, 3137, 3144, 3157, 3138, 3079, 3072, 3150, 3145, 3153, 3144, 3148, 3138, 3072, 3079, 3152, 3150, 3155, 3151, 3079, 3140, 3144, 3157, 3144, 3154, 3155, 3150, 3145, 3138, -9113, -9890, 1146, 1054, 1075, 1064, 1087, 1081, 1070, 1146, 1034, 1083, 1059, 1070, 1079, 1146, 1068, 1087, 1064, 1075, 1084, 1075, 1081, 1083, 1070, 1075, 1077, 1076, 1146, 1066, 1077, 1078, 1078, 1075, 1076, 1085, 1146, 1083, 1070, 1070, 1087, 1079, 1066, 1070, 1146, 1145, 634, 572, 565, 552, 634, 533, 552, 574, 575, 552, 608, 634, 1567, 1559, 1650, 1654, 1659, 1541, 1567, 2783, 2067, 2080, 2103, 2092, 2083, 2108, 2092, 2091, 2082, 2149, 2101, 2084, 2108, 2088, 2080, 2091, 2097, 2149, 2098, 2092, 2097, 2093, 2149, 2069, 2084, 2108, 2097, 2088, 2149, 2082, 2084, 2097, 2080, 2098, 2084, 2108, 2155, 2155, 2155, 2149, 2157, 2052, 2097, 2097, 2080, 2088, 2101, 2097, 2149, 2934, 8846, 1451, 1487, 1506, 1529, 1518, 1512, 1535, 1451, 1499, 1514, 1522, 1535, 1510, 1451, 1499, 1514, 1522, 1510, 1518, 1509, 1535, 1451, 1496, 1502, 1480, 1480, 1486, 1496, 1496, 1451, 1533, 1518, 1529, 1506, 1517, 1506, 1518, 1519, 1451, 1517, 1508, 1529, 1451, 1476, 1529, 1519, 1518, 1529, 1457, 1451, 488, 484, 389, 425, 427, 433, 426, 432, 510, 484, 8573, 2653, 2641, 2631, 2646, 2639, 2632, 2624, 2629, 2652, 2651, 2636, 1467, 1465, 1462, 1467, 1469, 1460, 1460, 1469, 1468, 3294, 3320, 3307, 3300, 3321, 3307, 3305, 3326, 3299, 3301, 3300, 3242, 3303, 3307, 3320, 3297, 3311, 3310, 3242, 3308, 3307, 3299, 3302, 3311, 3310, 3242, 3304, 3315, 3242, 3304, 3307, 3300, 3297, 2756, 2777, 2767, 2766, 2777, 2786, 2767, 2959, 2952, 2973, 2952, 2953, 2959, 2974, 2991, 2999, 2979, 2987, 2976, 3002, 3054, 3000, 2987, 3004, 2983, 2984, 2983, 2989, 2991, 3002, 2983, 2977, 2976, 3054, 3002, 2983, 2979, 2987, 2977, 3003, 3002, 3040, 3054, 2951, 2984, 3054, 2991, 2979, 2977, 3003, 2976, 3002, 3054, 3001, 2991, 3005, 3054, 2986, 2987, 2986, 3003, 2989, 3002, 2987, 2986, 3042, 3054, 3006, 2978, 2987, 2991, 3005, 2987, 3054, 3002, 2991, 3006, 3054, 2968, 2987, 3004, 2983, 2984, 2999, 3054, 2991, 2985, 2991, 2983, 2976, 3040};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1244f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c9.e f1245n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1246o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(int i10, int i11, String str, String str2, u8.e eVar, c9.e eVar2) {
        super(C0106.f132 ^ (-234), eVar);
        this.f1242d = str;
        this.f1243e = i10;
        this.f1244f = str2;
        this.f1245n = eVar2;
        this.f1246o = i11;
        int iM6259 = C0324.m6259();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6259 >= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0119.m2298("3VNiwjeoiAxKrSHlnNEhlV")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۨۥۨۦ, reason: not valid java name and contains not printable characters */
    public static short[] m128() {
        int iM2182 = C0113.m2182();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2182 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f12short;
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
        String str = "ۧۢۥ";
        String strM6908 = null;
        c9.e eVarM8474 = null;
        String strM7529 = null;
        int iM743 = 0;
        int iM9510 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1749672:
                    eVarM8474 = C0434.m8474(this);
                    str = "ۧۤۢ";
                    break;
                case 1752484:
                    this = new d0(iM9510, iM743, strM6908, strM7529, eVar, eVarM8474);
                    str = "ۧ۠ۦ";
                    break;
                case 1752735:
                    iM9510 = C0489.m9510(this);
                    str = "ۦۦۦ";
                    break;
                case 1753638:
                    strM7529 = C0385.m7529(this);
                    str = "ۢۢۨ";
                    break;
                case 1754413:
                    return this;
                case 1754533:
                    iM743 = C0038.m743(this);
                    str = "ۥ۠۟";
                    break;
                default:
                    strM6908 = C0353.m6908(this);
                    str = "ۥۨۢ";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "۠۠۟";
        u8.e eVarM6820 = null;
        m9.d0 d0Var = null;
        Object objM3418 = obj;
        u8.e eVar = null;
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56355:
                    eVarM6820 = C0349.m6820(this, d0Var, eVar);
                    str = "ۣ۟ۤ";
                    break;
                case 1747679:
                    str = "ۢۢۡ";
                    d0Var = (m9.d0) objM3418;
                    break;
                case 1749665:
                    str = "ۡۤ";
                    eVar = (u8.e) obj2;
                    break;
                case 1751686:
                    objM3418 = C0179.m3418(this, lVarM238);
                    str = "ۧۡۧ";
                    break;
                case 1751779:
                    str = "ۤۥۧ";
                    lVarM238 = C0012.m238();
                    break;
                case 1754445:
                    return objM3418;
                default:
                    str = "ۤۨۧ";
                    this = (d0) eVarM6820;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0344  */
    /* JADX WARN: Code duplicated, block: B:163:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0325 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x02d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x021a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x023f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x026c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x025e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0298 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x02b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x02ab A[SYNTHETIC] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:173:0x02d5
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
