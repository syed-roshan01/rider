package f5;

import aa.C0012;
import android.support.v4.app.C0014;
import androidx.appcompat.widget.C0020;
import b.C0049;
import b3.C0051;
import c3.C0062;
import com.auto.accept.data.model.AppConfig;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.C0087;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.components.C0134;
import com.google.firebase.components.C0135;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.gson.internal.sql.C0208;
import d1.C0212;
import d9.C0225;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.internal.aggregatedroot.C0246;
import dagger.hilt.internal.componenttreedeps.C0248;
import e9.C0266;
import f6.C0277;
import g.C0282;
import g0.C0285;
import g2.C0287;
import h0.C0299;
import i5.C0318;
import j5.C0327;
import j9.C0329;
import ja.C0330;
import k3.C0334;
import k3.C0335;
import m0.C0349;
import m3.C0352;
import n.C0361;
import o7.i2;
import p7.C0378;
import p8.C0379;
import p8.C0380;
import p9.q0;
import q1.C0383;
import r2.C0397;
import r5.C0399;
import r6.C0401;
import s7.C0414;
import v.C0439;
import v8.C0450;
import w1.C0455;
import w5.C0463;
import w9.C0465;
import x2.C0467;
import x5.C0470;
import x7.C0471;
import y.C0475;
import z1.C0483;

/* JADX INFO: loaded from: classes.dex */
public final class z extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f421short = {1261, 1263, 1278, 1247, 1251, 1262, 1186, 1188, 1188, 1188, 1187, 920, 930, 940, 933, 958, 955, 1003, 941, 938, 930, 935, 942, 943, 1626, 1624, 1621, 1621, 1561, 1613, 1622, 1561, 1566, 1611, 1628, 1610, 1612, 1620, 1628, 1566, 1561, 1627, 1628, 1631, 1622, 1611, 1628, 1561, 1566, 1616, 1623, 1615, 1622, 1618, 1628, 1566, 1561, 1614, 1616, 1613, 1617, 1561, 1626, 1622, 1611, 1622, 1612, 1613, 1616, 1623, 1628, 1645, 1612, 1539, 1610, 1613, 1623, 1606, 1617, 1613, 1606, 1623, 1539, 1600, 1612, 1613, 1613, 1606, 1600, 1623, 1610, 1612, 1613, 1549, 1539, 1651, 1615, 1606, 1602, 1616, 1606, 1539, 1600, 1611, 1606, 1600, 1608, 1539, 1626, 1612, 1622, 1617, 1539, 1613, 1606, 1623, 1620, 1612, 1617, 1608, 1549, 760, 729, 662, 735, 728, 706, 723, 708, 728, 723, 706, 662, 725, 729, 728, 728, 723, 725, 706, 735, 729, 728, 1870, 1857, 1867, 1885, 1856, 1862, 1867, 1904, 1862, 1867};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f6343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MainViewModel f6344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FirebaseUser f6346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MainViewModel f6348f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f6349n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f6350o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f6351p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(MainViewModel mainViewModel, String str, String str2, String str3, u8.e eVar) {
        super(C0463.f734 ^ 289, eVar);
        this.f6348f = mainViewModel;
        this.f6349n = str;
        this.f6350o = str2;
        this.f6351p = str3;
        int iM7523 = C0383.m7523();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7523 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0327.m6326("aQWLSNMnsAkWEsdlFVt7WrSxXMfW")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۣۡۡ, reason: not valid java name and contains not printable characters */
    public static short[] m5357() {
        int iM6904 = C0352.m6904();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6904 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f421short;
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
        String str = "\u06e6\u06e5\u06e2";
        String strM1867 = null;
        MainViewModel mainViewModelM8132 = null;
        String strM959 = null;
        String strM1197 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747936:
                    return this;
                case 1750531:
                    strM1197 = C0062.m1197(this);
                    str = "\u06e3\u06e8\u06e2";
                    break;
                case 1750813:
                    str = "\u06e0\u06e8\u06e8";
                    this = new z(mainViewModelM8132, strM959, strM1867, strM1197, eVar);
                    break;
                case 1753603:
                    mainViewModelM8132 = C0414.m8132(this);
                    str = "\u06e7\u06e2\u06e3";
                    break;
                case 1754472:
                    strM959 = C0049.m959(this);
                    str = "\u06e5\u06df\u06e4";
                    break;
                default:
                    strM1867 = C0087.m1867(this);
                    str = "\u06e3\u06df\u06df";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e0\u06e0\u06e6";
        u8.e eVarM6389 = null;
        u8.e eVar = null;
        q8.l lVarM238 = null;
        Object objM9154 = obj;
        m9.d0 d0Var = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747686:
                    str = "\u06e8\u06e4\u06e1";
                    d0Var = (m9.d0) objM9154;
                    break;
                case 1747810:
                    eVarM6389 = C0330.m6389(this, d0Var, eVar);
                    str = "\u06e0\u06e5\u06df";
                    break;
                case 1748609:
                    str = "\u06e3\u06e2\u06df";
                    lVarM238 = C0012.m238();
                    break;
                case 1750624:
                    objM9154 = C0470.m9154(this, lVarM238);
                    str = "\u06e7\u06e1\u06e4";
                    break;
                case 1754442:
                    return objM9154;
                case 1755493:
                    str = "\u06e0\u06e4\u06e6";
                    eVar = (u8.e) obj2;
                    break;
                default:
                    str = "\u06e1\u06df\u06df";
                    this = (z) eVarM6389;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:194:0x02d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x030d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x030d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0309 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0324 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x032a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x032f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x032a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x0326 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x0347 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x034d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x0351 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x0352 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x034d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x0349 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x036e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x0366 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x03e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x021f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x029d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x016a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objM2781;
        int i10;
        String strM1197;
        String strM959;
        boolean z10;
        int i11;
        FirebaseUser firebaseUser;
        String strM7415;
        int i12;
        Object objM986;
        int i13;
        FirebaseUser firebaseUserM2275;
        MainViewModel mainViewModelM4766;
        Object objM5493;
        int i14;
        FirebaseUser firebaseUser2;
        Throwable thM9416;
        int i15;
        String strM4049;
        int i16;
        String strM40410;
        int i17;
        int i18;
        boolean zM9071;
        FirebaseUser firebaseUserM5359;
        int i19;
        int i20;
        int i21;
        v8.a aVarM5766 = C0299.m5766();
        int iM9179 = C0471.m9179(this);
        q8.l lVarM238 = C0012.m238();
        String strM5456 = C0282.m5456(m5357(), 0, C0175.f199 ^ 569, 1162);
        String strM2300 = C0119.m2300(m5357(), 11, C0197.f221 ^ 110, 971);
        MainViewModel mainViewModelM8132 = C0414.m8132(this);
        int i22 = 1616;
        while (true) {
            i22 ^= 1633;
            try {
                switch (i22) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i22 = iM9179 != 0 ? 1709 : 1678;
                        break;
                    case 204:
                        int i23 = 1740;
                        while (true) {
                            i23 ^= 1757;
                            switch (i23) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i23 = iM9179 != 1 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    C0329.m6365(obj);
                                    objM2781 = C0361.m7093((q8.h) obj);
                                    i10 = 49914;
                                    while (true) {
                                        i10 ^= 49931;
                                        switch (i10) {
                                            case 497:
                                                i10 = 50596;
                                                break;
                                            case 1711:
                                                break;
                                            default:
                                                break;
                                        }
                                        strM1197 = C0062.m1197(this);
                                        strM959 = C0049.m959(this);
                                        z10 = objM2781 instanceof q8.g;
                                        i11 = 51588;
                                        while (true) {
                                            i11 ^= 51605;
                                            switch (i11) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i11 = ((((z10 ? 1 : 0) ^ '\uffff') & 1) | ((z10 ? 1 : 0) & '\ufffe')) != 0 ? 51681 : 51650;
                                                    break;
                                                case 54:
                                                    break;
                                                case 87:
                                                    thM9416 = C0483.m9416(objM2781);
                                                    i15 = 53758;
                                                    while (true) {
                                                        i15 ^= 53775;
                                                        switch (i15) {
                                                            case 1009:
                                                                i15 = thM9416 != null ? 54502 : 54471;
                                                                break;
                                                            case 1703:
                                                                break;
                                                            case 1736:
                                                                break;
                                                            case 1769:
                                                                q0 q0VarM7430 = C0379.m7430(mainViewModelM8132);
                                                                strM4049 = C0212.m4049(thM9416);
                                                                i16 = 54533;
                                                                while (true) {
                                                                    i16 ^= 54550;
                                                                    switch (i16) {
                                                                        case 19:
                                                                            i16 = strM4049 == null ? 54626 : 54595;
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 85:
                                                                            break;
                                                                        case 116:
                                                                            strM4049 = strM2300;
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0227.m4382(q0VarM7430, strM4049);
                                                                q0 q0VarM4345 = C0225.m4345(mainViewModelM8132);
                                                                strM40410 = C0212.m4049(thM9416);
                                                                i17 = 54657;
                                                                while (true) {
                                                                    i17 ^= 54674;
                                                                    switch (i17) {
                                                                        case 19:
                                                                            i17 = strM40410 == null ? 55401 : 54719;
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 3579:
                                                                            strM40410 = strM2300;
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0227.m4382(q0VarM4345, new c(strM40410));
                                                                C0227.m4382(C0073.m1601(mainViewModelM8132), C0455.m8876());
                                                                i18 = 55432;
                                                                while (true) {
                                                                    i18 ^= 55449;
                                                                    switch (i18) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i18 = 55463;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        case 62:
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    return lVarM238;
                                                case 116:
                                                    firebaseUser = (FirebaseUser) objM2781;
                                                    strM7415 = C0378.m7415(C0152.m2915(C0287.m5540(mainViewModelM8132)), C0132.m2538(m5357(), 143, C0134.f160 ^ (-853), 1839));
                                                    i12 = 51712;
                                                    while (true) {
                                                        i12 ^= 51729;
                                                        switch (i12) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i12 = strM7415 == null ? 51805 : 51774;
                                                                break;
                                                            case 47:
                                                                break;
                                                            case 76:
                                                                strM7415 = C0439.m8581();
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    a5.z zVarM7827 = C0399.m7827(mainViewModelM8132);
                                                    String strM8790 = C0450.m8790(firebaseUser);
                                                    C0335.m6501(strM8790, strM5456);
                                                    this.f6343a = objM2781;
                                                    this.f6344b = mainViewModelM8132;
                                                    this.f6345c = strM959;
                                                    this.f6346d = firebaseUser;
                                                    this.f6347e = 2;
                                                    objM986 = C0051.m986(zVarM7827, strM8790, strM1197, strM959, strM7415, this);
                                                    i13 = 51836;
                                                    while (true) {
                                                        i13 ^= 51853;
                                                        switch (i13) {
                                                            case 241:
                                                                i13 = objM986 == aVarM5766 ? 52580 : 52549;
                                                                break;
                                                            case 1963:
                                                                break;
                                                            case 1992:
                                                                firebaseUserM2275 = firebaseUser;
                                                                mainViewModelM4766 = mainViewModelM8132;
                                                                break;
                                                            case 2025:
                                                                return aVarM5766;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    this.f6343a = objM2781;
                                                    this.f6344b = mainViewModelM4766;
                                                    this.f6345c = strM959;
                                                    this.f6346d = firebaseUserM2275;
                                                    this.f6347e = 3;
                                                    objM5493 = C0285.m5493(389 ^ ((long) C0072.f104), this);
                                                    i14 = 52611;
                                                    while (true) {
                                                        i14 ^= 52628;
                                                        switch (i14) {
                                                            case 23:
                                                                i14 = objM5493 == aVarM5766 ? 52704 : 52673;
                                                                break;
                                                            case 54:
                                                                break;
                                                            case 85:
                                                                firebaseUser2 = firebaseUserM2275;
                                                                break;
                                                            case 116:
                                                                return aVarM5766;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0227.m4382(C0073.m1601(mainViewModelM4766), C0455.m8876());
                                                    C0475.m9262(mainViewModelM4766);
                                                    zM9071 = C0465.m9071((AppConfig) C0246.m4716(C0318.m6172(C0266.m5081(mainViewModelM4766))));
                                                    firebaseUserM5359 = C0277.m5359(C0020.m402(C0380.m7458(mainViewModelM4766)));
                                                    i19 = 52735;
                                                    while (true) {
                                                        i19 ^= 52752;
                                                        switch (i19) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                String strM8791 = C0450.m8790(firebaseUser2);
                                                                C0335.m6501(strM8791, strM5456);
                                                                C0467.m9105(mainViewModelM4766, strM8791);
                                                                break;
                                                            case 1007:
                                                                i19 = zM9071 ? 53479 : 52797;
                                                                break;
                                                            case 7927:
                                                                i20 = 53510;
                                                                while (true) {
                                                                    i20 ^= 53527;
                                                                    switch (i20) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i20 = firebaseUserM5359 != null ? 53603 : 53572;
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 83:
                                                                            String strM8792 = C0450.m8790(firebaseUser2);
                                                                            C0335.m6501(strM8792, strM5456);
                                                                            C0467.m9105(mainViewModelM4766, strM8792);
                                                                            break;
                                                                        case 116:
                                                                            try {
                                                                                C0233.m4497(firebaseUserM5359);
                                                                                while (true) {
                                                                                    i21 ^= 53651;
                                                                                    switch (i21) {
                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i21 = 53665;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                            } catch (Exception e4) {
                                                                                int i24 = 56579;
                                                                                while (true) {
                                                                                    i24 ^= 56596;
                                                                                    switch (i24) {
                                                                                        case 23:
                                                                                            i24 = 56610;
                                                                                            continue;
                                                                                        case 54:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                            }
                                                                            C0227.m4382(C0225.m4345(mainViewModelM4766), new b(strM959));
                                                                            i21 = 53634;
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
                                                    thM9416 = C0483.m9416(objM2781);
                                                    i15 = 53758;
                                                    while (true) {
                                                        i15 ^= 53775;
                                                        switch (i15) {
                                                            case 1009:
                                                                if (thM9416 != null) {
                                                                }
                                                                break;
                                                            case 1703:
                                                                break;
                                                            case 1736:
                                                                break;
                                                            case 1769:
                                                                q0 q0VarM7431 = C0379.m7430(mainViewModelM8132);
                                                                strM4049 = C0212.m4049(thM9416);
                                                                i16 = 54533;
                                                                while (true) {
                                                                    i16 ^= 54550;
                                                                    switch (i16) {
                                                                        case 19:
                                                                            if (strM4049 == null) {
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 85:
                                                                            break;
                                                                        case 116:
                                                                            strM4049 = strM2300;
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0227.m4382(q0VarM7431, strM4049);
                                                                q0 q0VarM4346 = C0225.m4345(mainViewModelM8132);
                                                                strM40410 = C0212.m4049(thM9416);
                                                                i17 = 54657;
                                                                while (true) {
                                                                    i17 ^= 54674;
                                                                    switch (i17) {
                                                                        case 19:
                                                                            if (strM40410 == null) {
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 3579:
                                                                            strM40410 = strM2300;
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0227.m4382(q0VarM4346, new c(strM40410));
                                                                C0227.m4382(C0073.m1601(mainViewModelM8132), C0455.m8876());
                                                                i18 = 55432;
                                                                while (true) {
                                                                    i18 ^= 55449;
                                                                    switch (i18) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i18 = 55463;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        case 62:
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    return lVarM238;
                                                default:
                                                    break;
                                            }
                                        }
                                    }
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    int i25 = 1864;
                                    while (true) {
                                        i25 ^= 1881;
                                        switch (i25) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i25 = iM9179 != 2 ? 48736 : 48705;
                                                break;
                                            case 47384:
                                                firebaseUserM2275 = C0118.m2275(this);
                                                strM959 = C0401.m7874(this);
                                                mainViewModelM4766 = C0248.m4766(this);
                                                objM2781 = C0208.m3972(this);
                                                C0329.m6365(obj);
                                                C0014.m280((q8.h) obj);
                                                int i26 = 49790;
                                                while (true) {
                                                    i26 ^= 49807;
                                                    switch (i26) {
                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 241:
                                                            i26 = 49821;
                                                            continue;
                                                        default:
                                                            continue;
                                                    }
                                                    this.f6343a = objM2781;
                                                    this.f6344b = mainViewModelM4766;
                                                    this.f6345c = strM959;
                                                    this.f6346d = firebaseUserM2275;
                                                    this.f6347e = 3;
                                                    objM5493 = C0285.m5493(389 ^ ((long) C0072.f104), this);
                                                    i14 = 52611;
                                                    while (true) {
                                                        i14 ^= 52628;
                                                        switch (i14) {
                                                            case 23:
                                                                if (objM5493 == aVarM5766) {
                                                                }
                                                                break;
                                                            case 54:
                                                                break;
                                                            case 85:
                                                                firebaseUser2 = firebaseUserM2275;
                                                                break;
                                                            case 116:
                                                                return aVarM5766;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0227.m4382(C0073.m1601(mainViewModelM4766), C0455.m8876());
                                                    C0475.m9262(mainViewModelM4766);
                                                    zM9071 = C0465.m9071((AppConfig) C0246.m4716(C0318.m6172(C0266.m5081(mainViewModelM4766))));
                                                    firebaseUserM5359 = C0277.m5359(C0020.m402(C0380.m7458(mainViewModelM4766)));
                                                    i19 = 52735;
                                                    while (true) {
                                                        i19 ^= 52752;
                                                        switch (i19) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                String strM8793 = C0450.m8790(firebaseUser2);
                                                                C0335.m6501(strM8793, strM5456);
                                                                C0467.m9105(mainViewModelM4766, strM8793);
                                                                break;
                                                            case 1007:
                                                                if (zM9071) {
                                                                }
                                                                break;
                                                            case 7927:
                                                                i20 = 53510;
                                                                while (true) {
                                                                    i20 ^= 53527;
                                                                    switch (i20) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (firebaseUserM5359 != null) {
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 83:
                                                                            String strM8794 = C0450.m8790(firebaseUser2);
                                                                            C0335.m6501(strM8794, strM5456);
                                                                            C0467.m9105(mainViewModelM4766, strM8794);
                                                                            break;
                                                                        case 116:
                                                                            C0233.m4497(firebaseUserM5359);
                                                                            C0227.m4382(C0225.m4345(mainViewModelM4766), new b(strM959));
                                                                            i21 = 53634;
                                                                            while (true) {
                                                                                i21 ^= 53651;
                                                                                switch (i21) {
                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i21 = 53665;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
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
                                                    thM9416 = C0483.m9416(objM2781);
                                                    i15 = 53758;
                                                    while (true) {
                                                        i15 ^= 53775;
                                                        switch (i15) {
                                                            case 1009:
                                                                if (thM9416 != null) {
                                                                }
                                                                break;
                                                            case 1703:
                                                                break;
                                                            case 1736:
                                                                break;
                                                            case 1769:
                                                                q0 q0VarM7432 = C0379.m7430(mainViewModelM8132);
                                                                strM4049 = C0212.m4049(thM9416);
                                                                i16 = 54533;
                                                                while (true) {
                                                                    i16 ^= 54550;
                                                                    switch (i16) {
                                                                        case 19:
                                                                            if (strM4049 == null) {
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 85:
                                                                            break;
                                                                        case 116:
                                                                            strM4049 = strM2300;
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0227.m4382(q0VarM7432, strM4049);
                                                                q0 q0VarM4347 = C0225.m4345(mainViewModelM8132);
                                                                strM40410 = C0212.m4049(thM9416);
                                                                i17 = 54657;
                                                                while (true) {
                                                                    i17 ^= 54674;
                                                                    switch (i17) {
                                                                        case 19:
                                                                            if (strM40410 == null) {
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 3579:
                                                                            strM40410 = strM2300;
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0227.m4382(q0VarM4347, new c(strM40410));
                                                                C0227.m4382(C0073.m1601(mainViewModelM8132), C0455.m8876());
                                                                i18 = 55432;
                                                                while (true) {
                                                                    i18 ^= 55449;
                                                                    switch (i18) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i18 = 55463;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        case 62:
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    return lVarM238;
                                                }
                                            case 47417:
                                                int i27 = 48767;
                                                while (true) {
                                                    i27 ^= 48784;
                                                    switch (i27) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            throw new IllegalStateException(C0349.m6842(m5357(), 24, C0397.f668 ^ 759, 1593));
                                                        case 76:
                                                            FirebaseUser firebaseUserM2276 = C0118.m2275(this);
                                                            strM959 = C0401.m7874(this);
                                                            mainViewModelM4766 = C0248.m4766(this);
                                                            objM2781 = C0208.m3972(this);
                                                            C0329.m6365(obj);
                                                            int i28 = 48891;
                                                            while (true) {
                                                                i28 ^= 48908;
                                                                switch (i28) {
                                                                    case 22:
                                                                        firebaseUser2 = firebaseUserM2276;
                                                                        break;
                                                                    case 503:
                                                                        i28 = 48922;
                                                                        continue;
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        case 239:
                                                            i27 = iM9179 == 3 ? 48860 : 48829;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0227.m4382(C0073.m1601(mainViewModelM4766), C0455.m8876());
                                                C0475.m9262(mainViewModelM4766);
                                                zM9071 = C0465.m9071((AppConfig) C0246.m4716(C0318.m6172(C0266.m5081(mainViewModelM4766))));
                                                firebaseUserM5359 = C0277.m5359(C0020.m402(C0380.m7458(mainViewModelM4766)));
                                                i19 = 52735;
                                                while (true) {
                                                    i19 ^= 52752;
                                                    switch (i19) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            String strM8795 = C0450.m8790(firebaseUser2);
                                                            C0335.m6501(strM8795, strM5456);
                                                            C0467.m9105(mainViewModelM4766, strM8795);
                                                            break;
                                                        case 1007:
                                                            if (zM9071) {
                                                            }
                                                            break;
                                                        case 7927:
                                                            i20 = 53510;
                                                            while (true) {
                                                                i20 ^= 53527;
                                                                switch (i20) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (firebaseUserM5359 != null) {
                                                                        }
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 83:
                                                                        String strM8796 = C0450.m8790(firebaseUser2);
                                                                        C0335.m6501(strM8796, strM5456);
                                                                        C0467.m9105(mainViewModelM4766, strM8796);
                                                                        break;
                                                                    case 116:
                                                                        C0233.m4497(firebaseUserM5359);
                                                                        C0227.m4382(C0225.m4345(mainViewModelM4766), new b(strM959));
                                                                        i21 = 53634;
                                                                        while (true) {
                                                                            i21 ^= 53651;
                                                                            switch (i21) {
                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i21 = 53665;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
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
                                                thM9416 = C0483.m9416(objM2781);
                                                i15 = 53758;
                                                while (true) {
                                                    i15 ^= 53775;
                                                    switch (i15) {
                                                        case 1009:
                                                            if (thM9416 != null) {
                                                            }
                                                            break;
                                                        case 1703:
                                                            break;
                                                        case 1736:
                                                            break;
                                                        case 1769:
                                                            q0 q0VarM7433 = C0379.m7430(mainViewModelM8132);
                                                            strM4049 = C0212.m4049(thM9416);
                                                            i16 = 54533;
                                                            while (true) {
                                                                i16 ^= 54550;
                                                                switch (i16) {
                                                                    case 19:
                                                                        if (strM4049 == null) {
                                                                        }
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 85:
                                                                        break;
                                                                    case 116:
                                                                        strM4049 = strM2300;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            C0227.m4382(q0VarM7433, strM4049);
                                                            q0 q0VarM4348 = C0225.m4345(mainViewModelM8132);
                                                            strM40410 = C0212.m4049(thM9416);
                                                            i17 = 54657;
                                                            while (true) {
                                                                i17 ^= 54674;
                                                                switch (i17) {
                                                                    case 19:
                                                                        if (strM40410 == null) {
                                                                        }
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 3579:
                                                                        strM40410 = strM2300;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            C0227.m4382(q0VarM4348, new c(strM40410));
                                                            C0227.m4382(C0073.m1601(mainViewModelM8132), C0455.m8876());
                                                            i18 = 55432;
                                                            while (true) {
                                                                i18 ^= 55449;
                                                                switch (i18) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i18 = 55463;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    case 62:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                return lVarM238;
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
                        C0329.m6365(obj);
                        C0227.m4382(C0073.m1601(mainViewModelM8132), C0334.m6483());
                        q0 q0VarM7434 = C0379.m7430(mainViewModelM8132);
                        C0227.m4382(q0VarM7434, null);
                        boolean zM2600 = C0135.m2600(mainViewModelM8132);
                        int i29 = 50689;
                        while (true) {
                            i29 ^= 50706;
                            switch (i29) {
                                case 19:
                                    i29 = !zM2600 ? 50782 : 50751;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    a5.j jVarM7458 = C0380.m7458(mainViewModelM8132);
                                    String strM9510 = C0049.m959(this);
                                    String strM1867 = C0087.m1867(this);
                                    this.f6347e = 1;
                                    objM2781 = C0146.m2781(jVarM7458, strM9510, strM1867, this);
                                    int i30 = 50813;
                                    while (true) {
                                        i30 ^= 50830;
                                        switch (i30) {
                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 53:
                                                break;
                                            case 243:
                                                i30 = objM2781 == aVarM5766 ? 51557 : 50875;
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
                                    C0227.m4382(q0VarM7434, C0153.m2934(m5357(), 71, C0185.f209 ^ 802, 1571));
                                    C0227.m4382(C0225.m4345(mainViewModelM8132), new c(C0330.m6370(m5357(), 121, C0112.f138 ^ 558, 694)));
                                    C0227.m4382(C0073.m1601(mainViewModelM8132), C0455.m8876());
                                    return lVarM238;
                                default:
                                    break;
                            }
                        }
                        i10 = 49914;
                        while (true) {
                            i10 ^= 49931;
                            switch (i10) {
                                case 497:
                                    i10 = 50596;
                                    break;
                                case 1711:
                                    break;
                                default:
                                    break;
                            }
                            strM1197 = C0062.m1197(this);
                            strM959 = C0049.m959(this);
                            z10 = objM2781 instanceof q8.g;
                            i11 = 51588;
                            while (true) {
                                i11 ^= 51605;
                                switch (i11) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (((((z10 ? 1 : 0) ^ '\uffff') & 1) | ((z10 ? 1 : 0) & '\ufffe')) != 0) {
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 87:
                                        thM9416 = C0483.m9416(objM2781);
                                        i15 = 53758;
                                        while (true) {
                                            i15 ^= 53775;
                                            switch (i15) {
                                                case 1009:
                                                    if (thM9416 != null) {
                                                    }
                                                    break;
                                                case 1703:
                                                    break;
                                                case 1736:
                                                    break;
                                                case 1769:
                                                    q0 q0VarM7435 = C0379.m7430(mainViewModelM8132);
                                                    strM4049 = C0212.m4049(thM9416);
                                                    i16 = 54533;
                                                    while (true) {
                                                        i16 ^= 54550;
                                                        switch (i16) {
                                                            case 19:
                                                                if (strM4049 == null) {
                                                                }
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 85:
                                                                break;
                                                            case 116:
                                                                strM4049 = strM2300;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0227.m4382(q0VarM7435, strM4049);
                                                    q0 q0VarM4349 = C0225.m4345(mainViewModelM8132);
                                                    strM40410 = C0212.m4049(thM9416);
                                                    i17 = 54657;
                                                    while (true) {
                                                        i17 ^= 54674;
                                                        switch (i17) {
                                                            case 19:
                                                                if (strM40410 == null) {
                                                                }
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 3579:
                                                                strM40410 = strM2300;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0227.m4382(q0VarM4349, new c(strM40410));
                                                    C0227.m4382(C0073.m1601(mainViewModelM8132), C0455.m8876());
                                                    i18 = 55432;
                                                    while (true) {
                                                        i18 ^= 55449;
                                                        switch (i18) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i18 = 55463;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                            case 62:
                                                                break;
                                                            default:
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        return lVarM238;
                                    case 116:
                                        firebaseUser = (FirebaseUser) objM2781;
                                        strM7415 = C0378.m7415(C0152.m2915(C0287.m5540(mainViewModelM8132)), C0132.m2538(m5357(), 143, C0134.f160 ^ (-853), 1839));
                                        i12 = 51712;
                                        while (true) {
                                            i12 ^= 51729;
                                            switch (i12) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (strM7415 == null) {
                                                    }
                                                    break;
                                                case 47:
                                                    break;
                                                case 76:
                                                    strM7415 = C0439.m8581();
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        a5.z zVarM7828 = C0399.m7827(mainViewModelM8132);
                                        String strM8797 = C0450.m8790(firebaseUser);
                                        C0335.m6501(strM8797, strM5456);
                                        this.f6343a = objM2781;
                                        this.f6344b = mainViewModelM8132;
                                        this.f6345c = strM959;
                                        this.f6346d = firebaseUser;
                                        this.f6347e = 2;
                                        objM986 = C0051.m986(zVarM7828, strM8797, strM1197, strM959, strM7415, this);
                                        i13 = 51836;
                                        while (true) {
                                            i13 ^= 51853;
                                            switch (i13) {
                                                case 241:
                                                    if (objM986 == aVarM5766) {
                                                    }
                                                    break;
                                                case 1963:
                                                    break;
                                                case 1992:
                                                    firebaseUserM2275 = firebaseUser;
                                                    mainViewModelM4766 = mainViewModelM8132;
                                                    break;
                                                case 2025:
                                                    return aVarM5766;
                                                default:
                                                    break;
                                            }
                                        }
                                        this.f6343a = objM2781;
                                        this.f6344b = mainViewModelM4766;
                                        this.f6345c = strM959;
                                        this.f6346d = firebaseUserM2275;
                                        this.f6347e = 3;
                                        objM5493 = C0285.m5493(389 ^ ((long) C0072.f104), this);
                                        i14 = 52611;
                                        while (true) {
                                            i14 ^= 52628;
                                            switch (i14) {
                                                case 23:
                                                    if (objM5493 == aVarM5766) {
                                                    }
                                                    break;
                                                case 54:
                                                    break;
                                                case 85:
                                                    firebaseUser2 = firebaseUserM2275;
                                                    break;
                                                case 116:
                                                    return aVarM5766;
                                                default:
                                                    break;
                                            }
                                        }
                                        C0227.m4382(C0073.m1601(mainViewModelM4766), C0455.m8876());
                                        C0475.m9262(mainViewModelM4766);
                                        zM9071 = C0465.m9071((AppConfig) C0246.m4716(C0318.m6172(C0266.m5081(mainViewModelM4766))));
                                        firebaseUserM5359 = C0277.m5359(C0020.m402(C0380.m7458(mainViewModelM4766)));
                                        i19 = 52735;
                                        while (true) {
                                            i19 ^= 52752;
                                            switch (i19) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    String strM8798 = C0450.m8790(firebaseUser2);
                                                    C0335.m6501(strM8798, strM5456);
                                                    C0467.m9105(mainViewModelM4766, strM8798);
                                                    break;
                                                case 1007:
                                                    if (zM9071) {
                                                    }
                                                    break;
                                                case 7927:
                                                    i20 = 53510;
                                                    while (true) {
                                                        i20 ^= 53527;
                                                        switch (i20) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                if (firebaseUserM5359 != null) {
                                                                }
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 83:
                                                                String strM8799 = C0450.m8790(firebaseUser2);
                                                                C0335.m6501(strM8799, strM5456);
                                                                C0467.m9105(mainViewModelM4766, strM8799);
                                                                break;
                                                            case 116:
                                                                C0233.m4497(firebaseUserM5359);
                                                                C0227.m4382(C0225.m4345(mainViewModelM4766), new b(strM959));
                                                                i21 = 53634;
                                                                while (true) {
                                                                    i21 ^= 53651;
                                                                    switch (i21) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i21 = 53665;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
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
                                        thM9416 = C0483.m9416(objM2781);
                                        i15 = 53758;
                                        while (true) {
                                            i15 ^= 53775;
                                            switch (i15) {
                                                case 1009:
                                                    if (thM9416 != null) {
                                                    }
                                                    break;
                                                case 1703:
                                                    break;
                                                case 1736:
                                                    break;
                                                case 1769:
                                                    q0 q0VarM7436 = C0379.m7430(mainViewModelM8132);
                                                    strM4049 = C0212.m4049(thM9416);
                                                    i16 = 54533;
                                                    while (true) {
                                                        i16 ^= 54550;
                                                        switch (i16) {
                                                            case 19:
                                                                if (strM4049 == null) {
                                                                }
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 85:
                                                                break;
                                                            case 116:
                                                                strM4049 = strM2300;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0227.m4382(q0VarM7436, strM4049);
                                                    q0 q0VarM43410 = C0225.m4345(mainViewModelM8132);
                                                    strM40410 = C0212.m4049(thM9416);
                                                    i17 = 54657;
                                                    while (true) {
                                                        i17 ^= 54674;
                                                        switch (i17) {
                                                            case 19:
                                                                if (strM40410 == null) {
                                                                }
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 3579:
                                                                strM40410 = strM2300;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0227.m4382(q0VarM43410, new c(strM40410));
                                                    C0227.m4382(C0073.m1601(mainViewModelM8132), C0455.m8876());
                                                    i18 = 55432;
                                                    while (true) {
                                                        i18 ^= 55449;
                                                        switch (i18) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i18 = 55463;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                            case 62:
                                                                break;
                                                            default:
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        return lVarM238;
                                    default:
                                        break;
                                }
                            }
                        }
                        break;
                    default:
                        break;
                }
            } catch (Exception e10) {
                int i31 = 49666;
                while (true) {
                    i31 ^= 49683;
                    switch (i31) {
                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i31 = 49697;
                            continue;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            q0 q0VarM7437 = C0379.m7430(mainViewModelM8132);
                            String strM40411 = C0212.m4049(e10);
                            int i32 = 55556;
                            while (true) {
                                i32 ^= 55573;
                                switch (i32) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i32 = strM40411 == null ? 55649 : 55618;
                                        break;
                                    case 54:
                                        break;
                                    case 87:
                                        break;
                                    case 116:
                                        strM40411 = strM2300;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            C0227.m4382(q0VarM7437, strM40411);
                            String strM40412 = C0212.m4049(e10);
                            int i33 = 55680;
                            while (true) {
                                i33 ^= 55697;
                                switch (i33) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i33 = strM40412 == null ? 56424 : 56393;
                                        break;
                                    case 1467:
                                        break;
                                    case 1496:
                                        strM2300 = strM40412;
                                        break;
                                    case 1529:
                                        int i34 = 56455;
                                        while (true) {
                                            i34 ^= 56472;
                                            switch (i34) {
                                                case 31:
                                                    i34 = 56486;
                                                    break;
                                                case 62:
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
                            C0227.m4382(C0225.m4345(mainViewModelM8132), new c(strM2300));
                            C0227.m4382(C0073.m1601(mainViewModelM8132), C0455.m8876());
                            break;
                        default:
                            continue;
                    }
                }
            }
        }
    }
}
