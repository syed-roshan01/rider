package f5;

import aa.C0012;
import android.support.v4.app.C0014;
import androidx.appcompat.widget.C0020;
import b3.C0051;
import b7.C0053;
import c1.C0061;
import c4.C0064;
import c6.C0067;
import com.auto.accept.data.model.AppConfig;
import com.auto.accept.data.model.UserProfile;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.components.C0135;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.measurement.C0184;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0212;
import d9.C0225;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.internal.aggregatedroot.C0246;
import dagger.hilt.internal.definecomponent.C0249;
import e1.C0259;
import e9.C0266;
import f.C0270;
import f6.C0277;
import g0.C0285;
import g2.C0287;
import ga.C0295;
import h0.C0299;
import i5.C0318;
import i9.C0321;
import j9.C0329;
import k3.C0334;
import k3.C0335;
import m0.C0349;
import m5.C0355;
import n.C0361;
import o4.C0369;
import o7.i2;
import p7.C0378;
import p8.C0379;
import p8.C0380;
import p9.q0;
import q5.C0385;
import q6.C0387;
import q7.C0390;
import r2.C0394;
import r2.C0395;
import r5.C0399;
import rikka.shizuku.C0406;
import s0.C0409;
import s2.C0411;
import s8.C0416;
import u7.C0437;
import v.C0439;
import v5.C0444;
import v8.C0450;
import w1.C0455;
import w9.C0465;
import x2.C0467;
import x4.C0468;
import y.C0475;
import y9.C0478;
import z1.C0483;
import z3.C0486;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public final class r extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f413short = {562, 526, 519, 515, 529, 519, 578, 526, 525, 517, 523, 524, 578, 516, 528, 525, 527, 578, 539, 525, 535, 528, 578, 528, 519, 517, 523, 529, 534, 519, 528, 519, 518, 578, 518, 519, 532, 523, 513, 519, 1579, 1577, 1592, 1561, 1573, 1576, 1636, 1634, 1634, 1634, 1637, 503, 468, 476, 466, 469, 411, 477, 474, 466, 471, 478, 479, 990, 988, 977, 977, 925, 969, 978, 925, 922, 975, 984, 974, 968, 976, 984, 922, 925, 991, 984, 987, 978, 975, 984, 925, 922, 980, 979, 971, 978, 982, 984, 922, 925, 970, 980, 969, 981, 925, 990, 978, 975, 978, 968, 969, 980, 979, 984, 1166, 1199, 1248, 1193, 1198, 1204, 1189, 1202, 1198, 1189, 1204, 1248, 1187, 1199, 1198, 1198, 1189, 1187, 1204, 1193, 1199, 1198, 1262, 1248, 1168, 1196, 1189, 1185, 1203, 1189, 1248, 1187, 1192, 1189, 1187, 1195, 1248, 1209, 1199, 1205, 1202, 1248, 1198, 1189, 1204, 1207, 1199, 1202, 1195, 1262, 1017, 984, 919, 990, 985, 963, 978, 965, 985, 978, 963, 919, 980, 984, 985, 985, 978, 980, 963, 990, 984, 985, 3110, 3113, 3107, 3125, 3112, 3118, 3107, 3096, 3118, 3107, 1527};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f6314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MainViewModel f6315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FirebaseUser f6317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f6318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6319f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final MainViewModel f6320n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f6321o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f6322p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(MainViewModel mainViewModel, String str, String str2, u8.e eVar) {
        super(C0064.f84 ^ (-929), eVar);
        this.f6320n = mainViewModel;
        this.f6321o = str;
        this.f6322p = str2;
        int iM1846 = C0086.m1846();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1846 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0184.m3518("AZ7ycIZ7PUQUfPO")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۢۢۢ, reason: not valid java name and contains not printable characters */
    public static short[] m5349() {
        int iM7737 = C0395.m7737();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7737 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f413short;
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
        String str = "\u06e1\u06e5\u06e0";
        String strM9104 = null;
        String strM6213 = null;
        MainViewModel mainViewModelM1169 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56389:
                    return this;
                case 1748796:
                    strM9104 = C0467.m9104(this);
                    str = "\u06e1\u06e7\u06df";
                    break;
                case 1751492:
                    this = new r(mainViewModelM1169, strM9104, strM6213, eVar);
                    str = "\u06e2\u06e7";
                    break;
                case 1753663:
                    str = "\u06e4\u06df\u06df";
                    mainViewModelM1169 = C0061.m1169(this);
                    break;
                default:
                    str = "\u06e6\u06e7\u06e0";
                    strM6213 = C0321.m6213(this);
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e3\u06df\u06e8";
        Object objM7641 = obj;
        u8.e eVarM8546 = null;
        q8.l lVarM238 = null;
        u8.e eVar = null;
        m9.d0 d0Var = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1749607:
                    str = "\u06e8\u06e0\u06e8";
                    this = (r) eVarM8546;
                    break;
                case 1750540:
                    str = "\u06df\u06e6\u06e0";
                    d0Var = (m9.d0) objM7641;
                    break;
                case 1750721:
                    return objM7641;
                case 1751588:
                    objM7641 = C0390.m7641(this, lVarM238);
                    str = "\u06e3\u06e5\u06e3";
                    break;
                case 1751651:
                    eVarM8546 = C0437.m8546(this, d0Var, eVar);
                    str = "\u06e2\u06e0\u06e5";
                    break;
                case 1755376:
                    str = "\u06e4\u06e2\u06e2";
                    lVarM238 = C0012.m238();
                    break;
                default:
                    str = "\u06e4\u06e4\u06e3";
                    eVar = (u8.e) obj2;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:280:0x04ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x03bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x0477 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x047e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x04ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x0479 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x03be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x03bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x0489 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x048f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x0493 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x04ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x048f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x048b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x04a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x04a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x04ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x04a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x049a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x04c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x04c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x04d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x04dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x0584 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x036e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x04d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x04f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x04f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x04fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x04fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x04ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x04f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x04f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x0513 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x0519 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x051d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x051e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x0512 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x0519 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x0515 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x053a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x0584 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x0532 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x0465 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x046b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x046f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x0472 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x0464 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x046b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:0x0467 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x059d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:0x02eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x030a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x030e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x0375 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x030a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x0321 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x0327 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x032b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x0375 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:0x0327 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x035b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x035f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x0380 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x037f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x03d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x03ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x03d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x03d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x03d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x0425 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x042b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x042f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x0432 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x042b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x0424 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x0427 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x0298 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x029e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:77:0x0167. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objM9112;
        int i10;
        boolean z10;
        int i11;
        FirebaseUser firebaseUser;
        String strM7415;
        int i12;
        Object objM7969;
        int i13;
        MainViewModel mainViewModelM8022;
        FirebaseUser firebaseUserM7087;
        Object objM9550;
        boolean z11;
        int i14;
        String strM2263;
        int i15;
        Object objM986;
        int i16;
        FirebaseUser firebaseUserM7088;
        MainViewModel mainViewModelM8023;
        String strM7547;
        boolean z12;
        int i17;
        Object obj2;
        UserProfile userProfile;
        int iM8181;
        int i18;
        int i19;
        FirebaseUser firebaseUser2;
        MainViewModel mainViewModel;
        boolean zM4399;
        int i20;
        int i21;
        int i22;
        Object objM5493;
        int i23;
        MainViewModel mainViewModelM8024;
        Throwable thM9416;
        int i24;
        String strM4049;
        int i25;
        String strM40410;
        int i26;
        int i27;
        boolean zM9071;
        FirebaseUser firebaseUserM5359;
        int i28;
        int i29;
        boolean zM5161;
        int i30;
        int i31;
        String strM2710 = C0141.m2710(m5349(), 0, C0390.f661 ^ (-275), 610);
        v8.a aVarM5766 = C0299.m5766();
        int iM1032 = C0053.m1032(this);
        q8.l lVarM238 = C0012.m238();
        String strM9104 = C0467.m9104(this);
        String strM4771 = C0249.m4771(m5349(), 40, C0486.f760 ^ 239, 1612);
        String strM7580 = C0387.m7580(m5349(), 51, C0091.f125 ^ (-172), 443);
        MainViewModel mainViewModelM1169 = C0061.m1169(this);
        int i32 = 1616;
        while (true) {
            i32 ^= 1633;
            try {
                switch (i32) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i32 = iM1032 != 0 ? 1709 : 1678;
                        break;
                    case 204:
                        int i33 = 1740;
                        while (true) {
                            i33 ^= 1757;
                            switch (i33) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i33 = iM1032 != 1 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    C0329.m6365(obj);
                                    objM9112 = C0361.m7093((q8.h) obj);
                                    i10 = 50813;
                                    while (true) {
                                        i10 ^= 50830;
                                        switch (i10) {
                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 243:
                                                i10 = 50844;
                                                break;
                                            default:
                                                break;
                                        }
                                        z10 = objM9112 instanceof q8.g;
                                        i11 = 51836;
                                        while (true) {
                                            i11 ^= 51853;
                                            switch (i11) {
                                                case 241:
                                                    i11 = ((((z10 ? 1 : 0) ^ '\uffff') & 1) | ((z10 ? 1 : 0) & '\ufffe')) != 0 ? 52580 : 52549;
                                                    break;
                                                case 1963:
                                                    break;
                                                case 1992:
                                                    thM9416 = C0483.m9416(objM9112);
                                                    i24 = 1508650;
                                                    while (true) {
                                                        i24 ^= 1508667;
                                                        switch (i24) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i24 = thM9416 != null ? 1509394 : 1508712;
                                                                break;
                                                            case 83:
                                                                break;
                                                            case 114:
                                                                break;
                                                            case 3369:
                                                                q0 q0VarM7430 = C0379.m7430(mainViewModelM1169);
                                                                strM4049 = C0212.m4049(thM9416);
                                                                i25 = 1509425;
                                                                while (true) {
                                                                    i25 ^= 1509442;
                                                                    switch (i25) {
                                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            break;
                                                                        case 115:
                                                                            i25 = strM4049 == null ? 1509518 : 1509487;
                                                                            break;
                                                                        case 204:
                                                                            strM4049 = strM7580;
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0227.m4382(q0VarM7430, strM4049);
                                                                q0 q0VarM4345 = C0225.m4345(mainViewModelM1169);
                                                                strM40410 = C0212.m4049(thM9416);
                                                                i26 = 1509549;
                                                                while (true) {
                                                                    i26 ^= 1509566;
                                                                    switch (i26) {
                                                                        case 19:
                                                                            i26 = strM40410 == null ? 1509642 : 1509611;
                                                                            break;
                                                                        case 85:
                                                                            break;
                                                                        case 114:
                                                                            break;
                                                                        case 436:
                                                                            strM40410 = strM7580;
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0227.m4382(q0VarM4345, new c(strM40410));
                                                                C0227.m4382(C0073.m1601(mainViewModelM1169), C0455.m8876());
                                                                i27 = 1509673;
                                                                while (true) {
                                                                    i27 ^= 1509690;
                                                                    switch (i27) {
                                                                        case 19:
                                                                            i27 = 1510355;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        case 745:
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
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
                                                case 2025:
                                                    firebaseUser = (FirebaseUser) objM9112;
                                                    strM7415 = C0378.m7415(C0152.m2915(C0287.m5540(mainViewModelM1169)), C0349.m6842(m5349(), 182, C0067.f87 ^ (-814), 3143));
                                                    i12 = 52611;
                                                    while (true) {
                                                        i12 ^= 52628;
                                                        switch (i12) {
                                                            case 23:
                                                                i12 = strM7415 == null ? 52704 : 52673;
                                                                break;
                                                            case 54:
                                                                break;
                                                            case 85:
                                                                break;
                                                            case 116:
                                                                strM7415 = C0439.m8581();
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    a5.z zVarM7827 = C0399.m7827(mainViewModelM1169);
                                                    String strM8790 = C0450.m8790(firebaseUser);
                                                    C0335.m6501(strM8790, strM4771);
                                                    this.f6314a = objM9112;
                                                    this.f6315b = mainViewModelM1169;
                                                    this.f6316c = strM9104;
                                                    this.f6317d = firebaseUser;
                                                    this.f6318e = strM7415;
                                                    this.f6319f = 2;
                                                    objM7969 = C0406.m7969(zVarM7827, strM8790, false, this);
                                                    i13 = 52735;
                                                    while (true) {
                                                        i13 ^= 52752;
                                                        switch (i13) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                mainViewModelM8022 = mainViewModelM1169;
                                                                firebaseUserM7087 = firebaseUser;
                                                                objM9550 = objM9112;
                                                                break;
                                                            case 1007:
                                                                i13 = objM7969 == aVarM5766 ? 53479 : 52797;
                                                                break;
                                                            case 7927:
                                                                return aVarM5766;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    z11 = objM7969 instanceof q8.g;
                                                    i14 = 53510;
                                                    while (true) {
                                                        i14 ^= 53527;
                                                        switch (i14) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i14 = ((((z11 ? 1 : 0) ^ '\uffff') & 1) | ((z11 ? 1 : 0) & '\ufffe')) != 0 ? 53603 : 53572;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 83:
                                                                strM2263 = C0117.m2263(firebaseUserM7087);
                                                                i15 = 55680;
                                                                while (true) {
                                                                    i15 ^= 55697;
                                                                    switch (i15) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i15 = strM2263 == null ? 56424 : 56393;
                                                                            break;
                                                                        case 1467:
                                                                            break;
                                                                        case 1496:
                                                                            break;
                                                                        case 1529:
                                                                            strM2263 = C0200.m3843(strM9104, C0444.m8665(m5349(), 192, 1, 1463));
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                a5.z zVarM7828 = C0399.m7827(mainViewModelM8022);
                                                                String strM8791 = C0450.m8790(firebaseUserM7087);
                                                                C0335.m6501(strM8791, strM4771);
                                                                this.f6314a = objM9550;
                                                                this.f6315b = mainViewModelM8022;
                                                                this.f6316c = strM9104;
                                                                this.f6317d = firebaseUserM7087;
                                                                this.f6318e = null;
                                                                this.f6319f = 3;
                                                                objM986 = C0051.m986(zVarM7828, strM8791, strM2263, strM9104, strM7415, this);
                                                                i16 = 56455;
                                                                while (true) {
                                                                    i16 ^= 56472;
                                                                    switch (i16) {
                                                                        case 31:
                                                                            i16 = objM986 == aVarM5766 ? 56548 : 56517;
                                                                            break;
                                                                        case 62:
                                                                            break;
                                                                        case 93:
                                                                            firebaseUserM7088 = firebaseUserM7087;
                                                                            mainViewModelM8023 = mainViewModelM8022;
                                                                            strM7547 = strM9104;
                                                                            objM9112 = objM9550;
                                                                            break;
                                                                        case 124:
                                                                            return aVarM5766;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                this.f6314a = objM9112;
                                                                this.f6315b = mainViewModelM8023;
                                                                this.f6316c = strM7547;
                                                                this.f6317d = firebaseUserM7088;
                                                                this.f6319f = 4;
                                                                objM5493 = C0285.m5493((-386) ^ ((long) C0153.f178), this);
                                                                i23 = 56579;
                                                                while (true) {
                                                                    i23 ^= 56596;
                                                                    switch (i23) {
                                                                        case 23:
                                                                            i23 = objM5493 == aVarM5766 ? 1507472 : 56641;
                                                                            break;
                                                                        case 54:
                                                                            break;
                                                                        case 85:
                                                                            mainViewModelM8024 = mainViewModelM8023;
                                                                            break;
                                                                        case 1564036:
                                                                            return aVarM5766;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                firebaseUser2 = firebaseUserM7088;
                                                                mainViewModel = mainViewModelM8024;
                                                                C0227.m4382(C0073.m1601(mainViewModel), C0455.m8876());
                                                                C0475.m9262(mainViewModel);
                                                                zM9071 = C0465.m9071((AppConfig) C0246.m4716(C0318.m6172(C0266.m5081(mainViewModel))));
                                                                firebaseUserM5359 = C0277.m5359(C0020.m402(C0380.m7458(mainViewModel)));
                                                                i28 = 1507503;
                                                                while (true) {
                                                                    i28 ^= 1507520;
                                                                    switch (i28) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            String strM8792 = C0450.m8790(firebaseUser2);
                                                                            C0335.m6501(strM8792, strM4771);
                                                                            C0467.m9105(mainViewModel, strM8792);
                                                                            break;
                                                                        case 111:
                                                                            i28 = zM9071 ? 1507596 : 1507565;
                                                                            break;
                                                                        case 460:
                                                                            i29 = 1507627;
                                                                            while (true) {
                                                                                i29 ^= 1507644;
                                                                                switch (i29) {
                                                                                    case 23:
                                                                                        i29 = firebaseUserM5359 != null ? 1507720 : 1507689;
                                                                                        break;
                                                                                    case 85:
                                                                                        String strM8793 = C0450.m8790(firebaseUser2);
                                                                                        C0335.m6501(strM8793, strM4771);
                                                                                        C0467.m9105(mainViewModel, strM8793);
                                                                                        break;
                                                                                    case 118:
                                                                                        break;
                                                                                    case 180:
                                                                                        zM5161 = C0270.m5161(firebaseUserM5359);
                                                                                        i30 = 1507751;
                                                                                        while (true) {
                                                                                            i30 ^= 1507768;
                                                                                            switch (i30) {
                                                                                                case 31:
                                                                                                    i30 = !zM5161 ? 1508495 : 1508464;
                                                                                                    break;
                                                                                                case 1335:
                                                                                                    try {
                                                                                                        C0233.m4497(firebaseUserM5359);
                                                                                                        while (true) {
                                                                                                            i31 ^= 1508543;
                                                                                                            switch (i31) {
                                                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                    i31 = 1508557;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                case 114:
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Exception e4) {
                                                                                                        int i34 = 1511471;
                                                                                                        while (true) {
                                                                                                            i34 ^= 1511488;
                                                                                                            switch (i34) {
                                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                                    break;
                                                                                                                case 111:
                                                                                                                    i34 = 1511502;
                                                                                                                    continue;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    C0227.m4382(C0225.m4345(mainViewModel), new b(strM7547));
                                                                                                    i31 = 1508526;
                                                                                                    break;
                                                                                                case 1480:
                                                                                                    String strM8794 = C0450.m8790(firebaseUser2);
                                                                                                    C0335.m6501(strM8794, strM4771);
                                                                                                    C0467.m9105(mainViewModel, strM8794);
                                                                                                    break;
                                                                                                case 1513:
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
                                                                thM9416 = C0483.m9416(objM9112);
                                                                i24 = 1508650;
                                                                while (true) {
                                                                    i24 ^= 1508667;
                                                                    switch (i24) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (thM9416 != null) {
                                                                            }
                                                                            break;
                                                                        case 83:
                                                                            break;
                                                                        case 114:
                                                                            break;
                                                                        case 3369:
                                                                            q0 q0VarM7431 = C0379.m7430(mainViewModelM1169);
                                                                            strM4049 = C0212.m4049(thM9416);
                                                                            i25 = 1509425;
                                                                            while (true) {
                                                                                i25 ^= 1509442;
                                                                                switch (i25) {
                                                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                        break;
                                                                                    case 115:
                                                                                        if (strM4049 == null) {
                                                                                        }
                                                                                        break;
                                                                                    case 204:
                                                                                        strM4049 = strM7580;
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            C0227.m4382(q0VarM7431, strM4049);
                                                                            q0 q0VarM4346 = C0225.m4345(mainViewModelM1169);
                                                                            strM40410 = C0212.m4049(thM9416);
                                                                            i26 = 1509549;
                                                                            while (true) {
                                                                                i26 ^= 1509566;
                                                                                switch (i26) {
                                                                                    case 19:
                                                                                        if (strM40410 == null) {
                                                                                        }
                                                                                        break;
                                                                                    case 85:
                                                                                        break;
                                                                                    case 114:
                                                                                        break;
                                                                                    case 436:
                                                                                        strM40410 = strM7580;
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            C0227.m4382(q0VarM4346, new c(strM40410));
                                                                            C0227.m4382(C0073.m1601(mainViewModelM1169), C0455.m8876());
                                                                            i27 = 1509673;
                                                                            while (true) {
                                                                                i27 ^= 1509690;
                                                                                switch (i27) {
                                                                                    case 19:
                                                                                        i27 = 1510355;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 745:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
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
                                                                z12 = objM7969 instanceof q8.g;
                                                                i17 = 53634;
                                                                while (true) {
                                                                    i17 ^= 53651;
                                                                    switch (i17) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i17 = z12 ? 53727 : 53696;
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 76:
                                                                            i22 = 53758;
                                                                            while (true) {
                                                                                i22 ^= 53775;
                                                                                switch (i22) {
                                                                                    case 1009:
                                                                                        i22 = 54440;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 1703:
                                                                                        obj2 = null;
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 83:
                                                                            obj2 = objM7969;
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0189.m3608(obj2);
                                                                userProfile = (UserProfile) obj2;
                                                                iM8181 = C0416.m8181(C0369.m7264(userProfile));
                                                                i18 = 54533;
                                                                while (true) {
                                                                    i18 ^= 54550;
                                                                    switch (i18) {
                                                                        case 19:
                                                                            i18 = iM8181 > 0 ? 54626 : 54595;
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 85:
                                                                            i19 = 55556;
                                                                            while (true) {
                                                                                i19 ^= 55573;
                                                                                switch (i19) {
                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i19 = 55587;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 54:
                                                                                        firebaseUser2 = firebaseUserM7087;
                                                                                        mainViewModel = mainViewModelM8022;
                                                                                        strM7547 = strM9104;
                                                                                        objM9112 = objM9550;
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                                C0227.m4382(C0073.m1601(mainViewModel), C0455.m8876());
                                                                                C0475.m9262(mainViewModel);
                                                                                zM9071 = C0465.m9071((AppConfig) C0246.m4716(C0318.m6172(C0266.m5081(mainViewModel))));
                                                                                firebaseUserM5359 = C0277.m5359(C0020.m402(C0380.m7458(mainViewModel)));
                                                                                i28 = 1507503;
                                                                                while (true) {
                                                                                    i28 ^= 1507520;
                                                                                    switch (i28) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                            String strM8795 = C0450.m8790(firebaseUser2);
                                                                                            C0335.m6501(strM8795, strM4771);
                                                                                            C0467.m9105(mainViewModel, strM8795);
                                                                                            break;
                                                                                        case 111:
                                                                                            if (zM9071) {
                                                                                            }
                                                                                            break;
                                                                                        case 460:
                                                                                            i29 = 1507627;
                                                                                            while (true) {
                                                                                                i29 ^= 1507644;
                                                                                                switch (i29) {
                                                                                                    case 23:
                                                                                                        if (firebaseUserM5359 != null) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 85:
                                                                                                        String strM8796 = C0450.m8790(firebaseUser2);
                                                                                                        C0335.m6501(strM8796, strM4771);
                                                                                                        C0467.m9105(mainViewModel, strM8796);
                                                                                                        break;
                                                                                                    case 118:
                                                                                                        break;
                                                                                                    case 180:
                                                                                                        zM5161 = C0270.m5161(firebaseUserM5359);
                                                                                                        i30 = 1507751;
                                                                                                        while (true) {
                                                                                                            i30 ^= 1507768;
                                                                                                            switch (i30) {
                                                                                                                case 31:
                                                                                                                    if (!zM5161) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 1335:
                                                                                                                    C0233.m4497(firebaseUserM5359);
                                                                                                                    C0227.m4382(C0225.m4345(mainViewModel), new b(strM7547));
                                                                                                                    i31 = 1508526;
                                                                                                                    while (true) {
                                                                                                                        i31 ^= 1508543;
                                                                                                                        switch (i31) {
                                                                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                i31 = 1508557;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                            case 114:
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 1480:
                                                                                                                    String strM8797 = C0450.m8790(firebaseUser2);
                                                                                                                    C0335.m6501(strM8797, strM4771);
                                                                                                                    C0467.m9105(mainViewModel, strM8797);
                                                                                                                    break;
                                                                                                                case 1513:
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
                                                                            }
                                                                            break;
                                                                        case 116:
                                                                            zM4399 = C0228.m4399(C0369.m7264(userProfile), strM7415);
                                                                            i20 = 54657;
                                                                            while (true) {
                                                                                i20 ^= 54674;
                                                                                switch (i20) {
                                                                                    case 19:
                                                                                        i20 = !zM4399 ? 55401 : 54719;
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                        i19 = 55556;
                                                                                        while (true) {
                                                                                            i19 ^= 55573;
                                                                                            switch (i19) {
                                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i19 = 55587;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                case 54:
                                                                                                    firebaseUser2 = firebaseUserM7087;
                                                                                                    mainViewModel = mainViewModelM8022;
                                                                                                    strM7547 = strM9104;
                                                                                                    objM9112 = objM9550;
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                            }
                                                                                            C0227.m4382(C0073.m1601(mainViewModel), C0455.m8876());
                                                                                            C0475.m9262(mainViewModel);
                                                                                            zM9071 = C0465.m9071((AppConfig) C0246.m4716(C0318.m6172(C0266.m5081(mainViewModel))));
                                                                                            firebaseUserM5359 = C0277.m5359(C0020.m402(C0380.m7458(mainViewModel)));
                                                                                            i28 = 1507503;
                                                                                            while (true) {
                                                                                                i28 ^= 1507520;
                                                                                                switch (i28) {
                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                        String strM8798 = C0450.m8790(firebaseUser2);
                                                                                                        C0335.m6501(strM8798, strM4771);
                                                                                                        C0467.m9105(mainViewModel, strM8798);
                                                                                                        break;
                                                                                                    case 111:
                                                                                                        if (zM9071) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 460:
                                                                                                        i29 = 1507627;
                                                                                                        while (true) {
                                                                                                            i29 ^= 1507644;
                                                                                                            switch (i29) {
                                                                                                                case 23:
                                                                                                                    if (firebaseUserM5359 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 85:
                                                                                                                    String strM8799 = C0450.m8790(firebaseUser2);
                                                                                                                    C0335.m6501(strM8799, strM4771);
                                                                                                                    C0467.m9105(mainViewModel, strM8799);
                                                                                                                    break;
                                                                                                                case 118:
                                                                                                                    break;
                                                                                                                case 180:
                                                                                                                    zM5161 = C0270.m5161(firebaseUserM5359);
                                                                                                                    i30 = 1507751;
                                                                                                                    while (true) {
                                                                                                                        i30 ^= 1507768;
                                                                                                                        switch (i30) {
                                                                                                                            case 31:
                                                                                                                                if (!zM5161) {
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 1335:
                                                                                                                                C0233.m4497(firebaseUserM5359);
                                                                                                                                C0227.m4382(C0225.m4345(mainViewModel), new b(strM7547));
                                                                                                                                i31 = 1508526;
                                                                                                                                while (true) {
                                                                                                                                    i31 ^= 1508543;
                                                                                                                                    switch (i31) {
                                                                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                            i31 = 1508557;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                        case 114:
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 1480:
                                                                                                                                String strM87910 = C0450.m8790(firebaseUser2);
                                                                                                                                C0335.m6501(strM87910, strM4771);
                                                                                                                                C0467.m9105(mainViewModel, strM87910);
                                                                                                                                break;
                                                                                                                            case 1513:
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
                                                                                        }
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        break;
                                                                                    case 3579:
                                                                                        C0225.m4338(C0380.m7458(mainViewModelM8022));
                                                                                        C0227.m4382(C0379.m7430(mainViewModelM8022), strM2710);
                                                                                        C0227.m4382(C0225.m4345(mainViewModelM8022), new c(strM2710));
                                                                                        C0227.m4382(C0073.m1601(mainViewModelM8022), C0455.m8876());
                                                                                        i21 = 55432;
                                                                                        while (true) {
                                                                                            i21 ^= 55449;
                                                                                            switch (i21) {
                                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i21 = 55463;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                case 62:
                                                                                                    objM9112 = objM9550;
                                                                                                    break;
                                                                                                default:
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
                                                                    thM9416 = C0483.m9416(objM9112);
                                                                    i24 = 1508650;
                                                                    while (true) {
                                                                        i24 ^= 1508667;
                                                                        switch (i24) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (thM9416 != null) {
                                                                                }
                                                                                break;
                                                                            case 83:
                                                                                break;
                                                                            case 114:
                                                                                break;
                                                                            case 3369:
                                                                                q0 q0VarM7432 = C0379.m7430(mainViewModelM1169);
                                                                                strM4049 = C0212.m4049(thM9416);
                                                                                i25 = 1509425;
                                                                                while (true) {
                                                                                    i25 ^= 1509442;
                                                                                    switch (i25) {
                                                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                            break;
                                                                                        case 115:
                                                                                            if (strM4049 == null) {
                                                                                            }
                                                                                            break;
                                                                                        case 204:
                                                                                            strM4049 = strM7580;
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                C0227.m4382(q0VarM7432, strM4049);
                                                                                q0 q0VarM4347 = C0225.m4345(mainViewModelM1169);
                                                                                strM40410 = C0212.m4049(thM9416);
                                                                                i26 = 1509549;
                                                                                while (true) {
                                                                                    i26 ^= 1509566;
                                                                                    switch (i26) {
                                                                                        case 19:
                                                                                            if (strM40410 == null) {
                                                                                            }
                                                                                            break;
                                                                                        case 85:
                                                                                            break;
                                                                                        case 114:
                                                                                            break;
                                                                                        case 436:
                                                                                            strM40410 = strM7580;
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                C0227.m4382(q0VarM4347, new c(strM40410));
                                                                                C0227.m4382(C0073.m1601(mainViewModelM1169), C0455.m8876());
                                                                                i27 = 1509673;
                                                                                while (true) {
                                                                                    i27 ^= 1509690;
                                                                                    switch (i27) {
                                                                                        case 19:
                                                                                            i27 = 1510355;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                        case 745:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
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
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    }
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    int i35 = 1864;
                                    while (true) {
                                        i35 ^= 1881;
                                        switch (i35) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i35 = iM1032 != 2 ? 48736 : 48705;
                                                break;
                                            case 47384:
                                                strM7415 = C0259.m4958(this);
                                                firebaseUserM7087 = C0361.m7087(this);
                                                strM9104 = C0385.m7547(this);
                                                mainViewModelM8022 = C0409.m8022(this);
                                                objM9550 = C0490.m9550(this);
                                                C0329.m6365(obj);
                                                objM7969 = C0361.m7093((q8.h) obj);
                                                int i36 = 50689;
                                                while (true) {
                                                    i36 ^= 50706;
                                                    switch (i36) {
                                                        case 19:
                                                            i36 = 50720;
                                                            continue;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    z11 = objM7969 instanceof q8.g;
                                                    i14 = 53510;
                                                    while (true) {
                                                        i14 ^= 53527;
                                                        switch (i14) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                if (((((z11 ? 1 : 0) ^ '\uffff') & 1) | ((z11 ? 1 : 0) & '\ufffe')) != 0) {
                                                                }
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 83:
                                                                strM2263 = C0117.m2263(firebaseUserM7087);
                                                                i15 = 55680;
                                                                while (true) {
                                                                    i15 ^= 55697;
                                                                    switch (i15) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (strM2263 == null) {
                                                                            }
                                                                            break;
                                                                        case 1467:
                                                                            break;
                                                                        case 1496:
                                                                            break;
                                                                        case 1529:
                                                                            strM2263 = C0200.m3843(strM9104, C0444.m8665(m5349(), 192, 1, 1463));
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                a5.z zVarM7829 = C0399.m7827(mainViewModelM8022);
                                                                String strM87911 = C0450.m8790(firebaseUserM7087);
                                                                C0335.m6501(strM87911, strM4771);
                                                                this.f6314a = objM9550;
                                                                this.f6315b = mainViewModelM8022;
                                                                this.f6316c = strM9104;
                                                                this.f6317d = firebaseUserM7087;
                                                                this.f6318e = null;
                                                                this.f6319f = 3;
                                                                objM986 = C0051.m986(zVarM7829, strM87911, strM2263, strM9104, strM7415, this);
                                                                i16 = 56455;
                                                                while (true) {
                                                                    i16 ^= 56472;
                                                                    switch (i16) {
                                                                        case 31:
                                                                            if (objM986 == aVarM5766) {
                                                                            }
                                                                            break;
                                                                        case 62:
                                                                            break;
                                                                        case 93:
                                                                            firebaseUserM7088 = firebaseUserM7087;
                                                                            mainViewModelM8023 = mainViewModelM8022;
                                                                            strM7547 = strM9104;
                                                                            objM9112 = objM9550;
                                                                            break;
                                                                        case 124:
                                                                            return aVarM5766;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                this.f6314a = objM9112;
                                                                this.f6315b = mainViewModelM8023;
                                                                this.f6316c = strM7547;
                                                                this.f6317d = firebaseUserM7088;
                                                                this.f6319f = 4;
                                                                objM5493 = C0285.m5493((-386) ^ ((long) C0153.f178), this);
                                                                i23 = 56579;
                                                                while (true) {
                                                                    i23 ^= 56596;
                                                                    switch (i23) {
                                                                        case 23:
                                                                            if (objM5493 == aVarM5766) {
                                                                            }
                                                                            break;
                                                                        case 54:
                                                                            break;
                                                                        case 85:
                                                                            mainViewModelM8024 = mainViewModelM8023;
                                                                            break;
                                                                        case 1564036:
                                                                            return aVarM5766;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                firebaseUser2 = firebaseUserM7088;
                                                                mainViewModel = mainViewModelM8024;
                                                                C0227.m4382(C0073.m1601(mainViewModel), C0455.m8876());
                                                                C0475.m9262(mainViewModel);
                                                                zM9071 = C0465.m9071((AppConfig) C0246.m4716(C0318.m6172(C0266.m5081(mainViewModel))));
                                                                firebaseUserM5359 = C0277.m5359(C0020.m402(C0380.m7458(mainViewModel)));
                                                                i28 = 1507503;
                                                                while (true) {
                                                                    i28 ^= 1507520;
                                                                    switch (i28) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            String strM87912 = C0450.m8790(firebaseUser2);
                                                                            C0335.m6501(strM87912, strM4771);
                                                                            C0467.m9105(mainViewModel, strM87912);
                                                                            break;
                                                                        case 111:
                                                                            if (zM9071) {
                                                                            }
                                                                            break;
                                                                        case 460:
                                                                            i29 = 1507627;
                                                                            while (true) {
                                                                                i29 ^= 1507644;
                                                                                switch (i29) {
                                                                                    case 23:
                                                                                        if (firebaseUserM5359 != null) {
                                                                                        }
                                                                                        break;
                                                                                    case 85:
                                                                                        String strM87913 = C0450.m8790(firebaseUser2);
                                                                                        C0335.m6501(strM87913, strM4771);
                                                                                        C0467.m9105(mainViewModel, strM87913);
                                                                                        break;
                                                                                    case 118:
                                                                                        break;
                                                                                    case 180:
                                                                                        zM5161 = C0270.m5161(firebaseUserM5359);
                                                                                        i30 = 1507751;
                                                                                        while (true) {
                                                                                            i30 ^= 1507768;
                                                                                            switch (i30) {
                                                                                                case 31:
                                                                                                    if (!zM5161) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1335:
                                                                                                    C0233.m4497(firebaseUserM5359);
                                                                                                    C0227.m4382(C0225.m4345(mainViewModel), new b(strM7547));
                                                                                                    i31 = 1508526;
                                                                                                    while (true) {
                                                                                                        i31 ^= 1508543;
                                                                                                        switch (i31) {
                                                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                i31 = 1508557;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                            case 114:
                                                                                                                break;
                                                                                                            default:
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 1480:
                                                                                                    String strM87914 = C0450.m8790(firebaseUser2);
                                                                                                    C0335.m6501(strM87914, strM4771);
                                                                                                    C0467.m9105(mainViewModel, strM87914);
                                                                                                    break;
                                                                                                case 1513:
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
                                                                thM9416 = C0483.m9416(objM9112);
                                                                i24 = 1508650;
                                                                while (true) {
                                                                    i24 ^= 1508667;
                                                                    switch (i24) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (thM9416 != null) {
                                                                            }
                                                                            break;
                                                                        case 83:
                                                                            break;
                                                                        case 114:
                                                                            break;
                                                                        case 3369:
                                                                            q0 q0VarM7433 = C0379.m7430(mainViewModelM1169);
                                                                            strM4049 = C0212.m4049(thM9416);
                                                                            i25 = 1509425;
                                                                            while (true) {
                                                                                i25 ^= 1509442;
                                                                                switch (i25) {
                                                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                        break;
                                                                                    case 115:
                                                                                        if (strM4049 == null) {
                                                                                        }
                                                                                        break;
                                                                                    case 204:
                                                                                        strM4049 = strM7580;
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            C0227.m4382(q0VarM7433, strM4049);
                                                                            q0 q0VarM4348 = C0225.m4345(mainViewModelM1169);
                                                                            strM40410 = C0212.m4049(thM9416);
                                                                            i26 = 1509549;
                                                                            while (true) {
                                                                                i26 ^= 1509566;
                                                                                switch (i26) {
                                                                                    case 19:
                                                                                        if (strM40410 == null) {
                                                                                        }
                                                                                        break;
                                                                                    case 85:
                                                                                        break;
                                                                                    case 114:
                                                                                        break;
                                                                                    case 436:
                                                                                        strM40410 = strM7580;
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            C0227.m4382(q0VarM4348, new c(strM40410));
                                                                            C0227.m4382(C0073.m1601(mainViewModelM1169), C0455.m8876());
                                                                            i27 = 1509673;
                                                                            while (true) {
                                                                                i27 ^= 1509690;
                                                                                switch (i27) {
                                                                                    case 19:
                                                                                        i27 = 1510355;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 745:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
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
                                                                z12 = objM7969 instanceof q8.g;
                                                                i17 = 53634;
                                                                while (true) {
                                                                    i17 ^= 53651;
                                                                    switch (i17) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (z12) {
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 76:
                                                                            i22 = 53758;
                                                                            while (true) {
                                                                                i22 ^= 53775;
                                                                                switch (i22) {
                                                                                    case 1009:
                                                                                        i22 = 54440;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 1703:
                                                                                        obj2 = null;
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 83:
                                                                            obj2 = objM7969;
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0189.m3608(obj2);
                                                                userProfile = (UserProfile) obj2;
                                                                iM8181 = C0416.m8181(C0369.m7264(userProfile));
                                                                i18 = 54533;
                                                                while (true) {
                                                                    i18 ^= 54550;
                                                                    switch (i18) {
                                                                        case 19:
                                                                            if (iM8181 > 0) {
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 85:
                                                                            i19 = 55556;
                                                                            while (true) {
                                                                                i19 ^= 55573;
                                                                                switch (i19) {
                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i19 = 55587;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 54:
                                                                                        firebaseUser2 = firebaseUserM7087;
                                                                                        mainViewModel = mainViewModelM8022;
                                                                                        strM7547 = strM9104;
                                                                                        objM9112 = objM9550;
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                                C0227.m4382(C0073.m1601(mainViewModel), C0455.m8876());
                                                                                C0475.m9262(mainViewModel);
                                                                                zM9071 = C0465.m9071((AppConfig) C0246.m4716(C0318.m6172(C0266.m5081(mainViewModel))));
                                                                                firebaseUserM5359 = C0277.m5359(C0020.m402(C0380.m7458(mainViewModel)));
                                                                                i28 = 1507503;
                                                                                while (true) {
                                                                                    i28 ^= 1507520;
                                                                                    switch (i28) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                            String strM87915 = C0450.m8790(firebaseUser2);
                                                                                            C0335.m6501(strM87915, strM4771);
                                                                                            C0467.m9105(mainViewModel, strM87915);
                                                                                            break;
                                                                                        case 111:
                                                                                            if (zM9071) {
                                                                                            }
                                                                                            break;
                                                                                        case 460:
                                                                                            i29 = 1507627;
                                                                                            while (true) {
                                                                                                i29 ^= 1507644;
                                                                                                switch (i29) {
                                                                                                    case 23:
                                                                                                        if (firebaseUserM5359 != null) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 85:
                                                                                                        String strM87916 = C0450.m8790(firebaseUser2);
                                                                                                        C0335.m6501(strM87916, strM4771);
                                                                                                        C0467.m9105(mainViewModel, strM87916);
                                                                                                        break;
                                                                                                    case 118:
                                                                                                        break;
                                                                                                    case 180:
                                                                                                        zM5161 = C0270.m5161(firebaseUserM5359);
                                                                                                        i30 = 1507751;
                                                                                                        while (true) {
                                                                                                            i30 ^= 1507768;
                                                                                                            switch (i30) {
                                                                                                                case 31:
                                                                                                                    if (!zM5161) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 1335:
                                                                                                                    C0233.m4497(firebaseUserM5359);
                                                                                                                    C0227.m4382(C0225.m4345(mainViewModel), new b(strM7547));
                                                                                                                    i31 = 1508526;
                                                                                                                    while (true) {
                                                                                                                        i31 ^= 1508543;
                                                                                                                        switch (i31) {
                                                                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                i31 = 1508557;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                            case 114:
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 1480:
                                                                                                                    String strM87917 = C0450.m8790(firebaseUser2);
                                                                                                                    C0335.m6501(strM87917, strM4771);
                                                                                                                    C0467.m9105(mainViewModel, strM87917);
                                                                                                                    break;
                                                                                                                case 1513:
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
                                                                            }
                                                                            break;
                                                                        case 116:
                                                                            zM4399 = C0228.m4399(C0369.m7264(userProfile), strM7415);
                                                                            i20 = 54657;
                                                                            while (true) {
                                                                                i20 ^= 54674;
                                                                                switch (i20) {
                                                                                    case 19:
                                                                                        if (!zM4399) {
                                                                                        }
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                        i19 = 55556;
                                                                                        while (true) {
                                                                                            i19 ^= 55573;
                                                                                            switch (i19) {
                                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i19 = 55587;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                case 54:
                                                                                                    firebaseUser2 = firebaseUserM7087;
                                                                                                    mainViewModel = mainViewModelM8022;
                                                                                                    strM7547 = strM9104;
                                                                                                    objM9112 = objM9550;
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                            }
                                                                                            C0227.m4382(C0073.m1601(mainViewModel), C0455.m8876());
                                                                                            C0475.m9262(mainViewModel);
                                                                                            zM9071 = C0465.m9071((AppConfig) C0246.m4716(C0318.m6172(C0266.m5081(mainViewModel))));
                                                                                            firebaseUserM5359 = C0277.m5359(C0020.m402(C0380.m7458(mainViewModel)));
                                                                                            i28 = 1507503;
                                                                                            while (true) {
                                                                                                i28 ^= 1507520;
                                                                                                switch (i28) {
                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                        String strM87918 = C0450.m8790(firebaseUser2);
                                                                                                        C0335.m6501(strM87918, strM4771);
                                                                                                        C0467.m9105(mainViewModel, strM87918);
                                                                                                        break;
                                                                                                    case 111:
                                                                                                        if (zM9071) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 460:
                                                                                                        i29 = 1507627;
                                                                                                        while (true) {
                                                                                                            i29 ^= 1507644;
                                                                                                            switch (i29) {
                                                                                                                case 23:
                                                                                                                    if (firebaseUserM5359 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 85:
                                                                                                                    String strM87919 = C0450.m8790(firebaseUser2);
                                                                                                                    C0335.m6501(strM87919, strM4771);
                                                                                                                    C0467.m9105(mainViewModel, strM87919);
                                                                                                                    break;
                                                                                                                case 118:
                                                                                                                    break;
                                                                                                                case 180:
                                                                                                                    zM5161 = C0270.m5161(firebaseUserM5359);
                                                                                                                    i30 = 1507751;
                                                                                                                    while (true) {
                                                                                                                        i30 ^= 1507768;
                                                                                                                        switch (i30) {
                                                                                                                            case 31:
                                                                                                                                if (!zM5161) {
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 1335:
                                                                                                                                C0233.m4497(firebaseUserM5359);
                                                                                                                                C0227.m4382(C0225.m4345(mainViewModel), new b(strM7547));
                                                                                                                                i31 = 1508526;
                                                                                                                                while (true) {
                                                                                                                                    i31 ^= 1508543;
                                                                                                                                    switch (i31) {
                                                                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                            i31 = 1508557;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                        case 114:
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 1480:
                                                                                                                                String strM879110 = C0450.m8790(firebaseUser2);
                                                                                                                                C0335.m6501(strM879110, strM4771);
                                                                                                                                C0467.m9105(mainViewModel, strM879110);
                                                                                                                                break;
                                                                                                                            case 1513:
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
                                                                                        }
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        break;
                                                                                    case 3579:
                                                                                        C0225.m4338(C0380.m7458(mainViewModelM8022));
                                                                                        C0227.m4382(C0379.m7430(mainViewModelM8022), strM2710);
                                                                                        C0227.m4382(C0225.m4345(mainViewModelM8022), new c(strM2710));
                                                                                        C0227.m4382(C0073.m1601(mainViewModelM8022), C0455.m8876());
                                                                                        i21 = 55432;
                                                                                        while (true) {
                                                                                            i21 ^= 55449;
                                                                                            switch (i21) {
                                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i21 = 55463;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                case 62:
                                                                                                    objM9112 = objM9550;
                                                                                                    break;
                                                                                                default:
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
                                                                    thM9416 = C0483.m9416(objM9112);
                                                                    i24 = 1508650;
                                                                    while (true) {
                                                                        i24 ^= 1508667;
                                                                        switch (i24) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (thM9416 != null) {
                                                                                }
                                                                                break;
                                                                            case 83:
                                                                                break;
                                                                            case 114:
                                                                                break;
                                                                            case 3369:
                                                                                q0 q0VarM7434 = C0379.m7430(mainViewModelM1169);
                                                                                strM4049 = C0212.m4049(thM9416);
                                                                                i25 = 1509425;
                                                                                while (true) {
                                                                                    i25 ^= 1509442;
                                                                                    switch (i25) {
                                                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                            break;
                                                                                        case 115:
                                                                                            if (strM4049 == null) {
                                                                                            }
                                                                                            break;
                                                                                        case 204:
                                                                                            strM4049 = strM7580;
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                C0227.m4382(q0VarM7434, strM4049);
                                                                                q0 q0VarM4349 = C0225.m4345(mainViewModelM1169);
                                                                                strM40410 = C0212.m4049(thM9416);
                                                                                i26 = 1509549;
                                                                                while (true) {
                                                                                    i26 ^= 1509566;
                                                                                    switch (i26) {
                                                                                        case 19:
                                                                                            if (strM40410 == null) {
                                                                                            }
                                                                                            break;
                                                                                        case 85:
                                                                                            break;
                                                                                        case 114:
                                                                                            break;
                                                                                        case 436:
                                                                                            strM40410 = strM7580;
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                C0227.m4382(q0VarM4349, new c(strM40410));
                                                                                C0227.m4382(C0073.m1601(mainViewModelM1169), C0455.m8876());
                                                                                i27 = 1509673;
                                                                                while (true) {
                                                                                    i27 ^= 1509690;
                                                                                    switch (i27) {
                                                                                        case 19:
                                                                                            i27 = 1510355;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                        case 745:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
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
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                }
                                                break;
                                            case 47417:
                                                int i37 = 48767;
                                                while (true) {
                                                    i37 ^= 48784;
                                                    switch (i37) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            firebaseUserM7088 = C0361.m7087(this);
                                                            strM7547 = C0385.m7547(this);
                                                            mainViewModelM8023 = C0409.m8022(this);
                                                            objM9112 = C0490.m9550(this);
                                                            C0329.m6365(obj);
                                                            C0014.m280((q8.h) obj);
                                                            int i38 = 49914;
                                                            while (true) {
                                                                i38 ^= 49931;
                                                                switch (i38) {
                                                                    case 497:
                                                                        i38 = 50596;
                                                                        continue;
                                                                    case 1711:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                                this.f6314a = objM9112;
                                                                this.f6315b = mainViewModelM8023;
                                                                this.f6316c = strM7547;
                                                                this.f6317d = firebaseUserM7088;
                                                                this.f6319f = 4;
                                                                objM5493 = C0285.m5493((-386) ^ ((long) C0153.f178), this);
                                                                i23 = 56579;
                                                                while (true) {
                                                                    i23 ^= 56596;
                                                                    switch (i23) {
                                                                        case 23:
                                                                            if (objM5493 == aVarM5766) {
                                                                            }
                                                                            break;
                                                                        case 54:
                                                                            break;
                                                                        case 85:
                                                                            mainViewModelM8024 = mainViewModelM8023;
                                                                            break;
                                                                        case 1564036:
                                                                            return aVarM5766;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                firebaseUser2 = firebaseUserM7088;
                                                                mainViewModel = mainViewModelM8024;
                                                                C0227.m4382(C0073.m1601(mainViewModel), C0455.m8876());
                                                                C0475.m9262(mainViewModel);
                                                                zM9071 = C0465.m9071((AppConfig) C0246.m4716(C0318.m6172(C0266.m5081(mainViewModel))));
                                                                firebaseUserM5359 = C0277.m5359(C0020.m402(C0380.m7458(mainViewModel)));
                                                                i28 = 1507503;
                                                                while (true) {
                                                                    i28 ^= 1507520;
                                                                    switch (i28) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            String strM879111 = C0450.m8790(firebaseUser2);
                                                                            C0335.m6501(strM879111, strM4771);
                                                                            C0467.m9105(mainViewModel, strM879111);
                                                                            break;
                                                                        case 111:
                                                                            if (zM9071) {
                                                                            }
                                                                            break;
                                                                        case 460:
                                                                            i29 = 1507627;
                                                                            while (true) {
                                                                                i29 ^= 1507644;
                                                                                switch (i29) {
                                                                                    case 23:
                                                                                        if (firebaseUserM5359 != null) {
                                                                                        }
                                                                                        break;
                                                                                    case 85:
                                                                                        String strM879112 = C0450.m8790(firebaseUser2);
                                                                                        C0335.m6501(strM879112, strM4771);
                                                                                        C0467.m9105(mainViewModel, strM879112);
                                                                                        break;
                                                                                    case 118:
                                                                                        break;
                                                                                    case 180:
                                                                                        zM5161 = C0270.m5161(firebaseUserM5359);
                                                                                        i30 = 1507751;
                                                                                        while (true) {
                                                                                            i30 ^= 1507768;
                                                                                            switch (i30) {
                                                                                                case 31:
                                                                                                    if (!zM5161) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 1335:
                                                                                                    C0233.m4497(firebaseUserM5359);
                                                                                                    C0227.m4382(C0225.m4345(mainViewModel), new b(strM7547));
                                                                                                    i31 = 1508526;
                                                                                                    while (true) {
                                                                                                        i31 ^= 1508543;
                                                                                                        switch (i31) {
                                                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                i31 = 1508557;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                            case 114:
                                                                                                                break;
                                                                                                            default:
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 1480:
                                                                                                    String strM879113 = C0450.m8790(firebaseUser2);
                                                                                                    C0335.m6501(strM879113, strM4771);
                                                                                                    C0467.m9105(mainViewModel, strM879113);
                                                                                                    break;
                                                                                                case 1513:
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
                                                                thM9416 = C0483.m9416(objM9112);
                                                                i24 = 1508650;
                                                                while (true) {
                                                                    i24 ^= 1508667;
                                                                    switch (i24) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (thM9416 != null) {
                                                                            }
                                                                            break;
                                                                        case 83:
                                                                            break;
                                                                        case 114:
                                                                            break;
                                                                        case 3369:
                                                                            q0 q0VarM7435 = C0379.m7430(mainViewModelM1169);
                                                                            strM4049 = C0212.m4049(thM9416);
                                                                            i25 = 1509425;
                                                                            while (true) {
                                                                                i25 ^= 1509442;
                                                                                switch (i25) {
                                                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                        break;
                                                                                    case 115:
                                                                                        if (strM4049 == null) {
                                                                                        }
                                                                                        break;
                                                                                    case 204:
                                                                                        strM4049 = strM7580;
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            C0227.m4382(q0VarM7435, strM4049);
                                                                            q0 q0VarM43410 = C0225.m4345(mainViewModelM1169);
                                                                            strM40410 = C0212.m4049(thM9416);
                                                                            i26 = 1509549;
                                                                            while (true) {
                                                                                i26 ^= 1509566;
                                                                                switch (i26) {
                                                                                    case 19:
                                                                                        if (strM40410 == null) {
                                                                                        }
                                                                                        break;
                                                                                    case 85:
                                                                                        break;
                                                                                    case 114:
                                                                                        break;
                                                                                    case 436:
                                                                                        strM40410 = strM7580;
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            C0227.m4382(q0VarM43410, new c(strM40410));
                                                                            C0227.m4382(C0073.m1601(mainViewModelM1169), C0455.m8876());
                                                                            i27 = 1509673;
                                                                            while (true) {
                                                                                i27 ^= 1509690;
                                                                                switch (i27) {
                                                                                    case 19:
                                                                                        i27 = 1510355;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 745:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
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
                                                        case 76:
                                                            int i39 = 48891;
                                                            while (true) {
                                                                i39 ^= 48908;
                                                                switch (i39) {
                                                                    case 22:
                                                                        break;
                                                                    case 53:
                                                                        throw new IllegalStateException(C0394.m7730(m5349(), 63, C0411.f682 ^ 10, 957));
                                                                    case 503:
                                                                        i39 = iM1032 == 4 ? 49635 : 48953;
                                                                        break;
                                                                    case 32495:
                                                                        firebaseUserM7088 = C0361.m7087(this);
                                                                        strM7547 = C0385.m7547(this);
                                                                        mainViewModelM8024 = C0409.m8022(this);
                                                                        objM9112 = C0490.m9550(this);
                                                                        C0329.m6365(obj);
                                                                        int i40 = 49666;
                                                                        while (true) {
                                                                            i40 ^= 49683;
                                                                            switch (i40) {
                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i40 = 49697;
                                                                                    continue;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                                            firebaseUser2 = firebaseUserM7088;
                                                            mainViewModel = mainViewModelM8024;
                                                            C0227.m4382(C0073.m1601(mainViewModel), C0455.m8876());
                                                            C0475.m9262(mainViewModel);
                                                            zM9071 = C0465.m9071((AppConfig) C0246.m4716(C0318.m6172(C0266.m5081(mainViewModel))));
                                                            firebaseUserM5359 = C0277.m5359(C0020.m402(C0380.m7458(mainViewModel)));
                                                            i28 = 1507503;
                                                            while (true) {
                                                                i28 ^= 1507520;
                                                                switch (i28) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        String strM879114 = C0450.m8790(firebaseUser2);
                                                                        C0335.m6501(strM879114, strM4771);
                                                                        C0467.m9105(mainViewModel, strM879114);
                                                                        break;
                                                                    case 111:
                                                                        if (zM9071) {
                                                                        }
                                                                        break;
                                                                    case 460:
                                                                        i29 = 1507627;
                                                                        while (true) {
                                                                            i29 ^= 1507644;
                                                                            switch (i29) {
                                                                                case 23:
                                                                                    if (firebaseUserM5359 != null) {
                                                                                    }
                                                                                    break;
                                                                                case 85:
                                                                                    String strM879115 = C0450.m8790(firebaseUser2);
                                                                                    C0335.m6501(strM879115, strM4771);
                                                                                    C0467.m9105(mainViewModel, strM879115);
                                                                                    break;
                                                                                case 118:
                                                                                    break;
                                                                                case 180:
                                                                                    zM5161 = C0270.m5161(firebaseUserM5359);
                                                                                    i30 = 1507751;
                                                                                    while (true) {
                                                                                        i30 ^= 1507768;
                                                                                        switch (i30) {
                                                                                            case 31:
                                                                                                if (!zM5161) {
                                                                                                }
                                                                                                break;
                                                                                            case 1335:
                                                                                                C0233.m4497(firebaseUserM5359);
                                                                                                C0227.m4382(C0225.m4345(mainViewModel), new b(strM7547));
                                                                                                i31 = 1508526;
                                                                                                while (true) {
                                                                                                    i31 ^= 1508543;
                                                                                                    switch (i31) {
                                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i31 = 1508557;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                        case 114:
                                                                                                            break;
                                                                                                        default:
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 1480:
                                                                                                String strM879116 = C0450.m8790(firebaseUser2);
                                                                                                C0335.m6501(strM879116, strM4771);
                                                                                                C0467.m9105(mainViewModel, strM879116);
                                                                                                break;
                                                                                            case 1513:
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
                                                            thM9416 = C0483.m9416(objM9112);
                                                            i24 = 1508650;
                                                            while (true) {
                                                                i24 ^= 1508667;
                                                                switch (i24) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (thM9416 != null) {
                                                                        }
                                                                        break;
                                                                    case 83:
                                                                        break;
                                                                    case 114:
                                                                        break;
                                                                    case 3369:
                                                                        q0 q0VarM7436 = C0379.m7430(mainViewModelM1169);
                                                                        strM4049 = C0212.m4049(thM9416);
                                                                        i25 = 1509425;
                                                                        while (true) {
                                                                            i25 ^= 1509442;
                                                                            switch (i25) {
                                                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    break;
                                                                                case 115:
                                                                                    if (strM4049 == null) {
                                                                                    }
                                                                                    break;
                                                                                case 204:
                                                                                    strM4049 = strM7580;
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0227.m4382(q0VarM7436, strM4049);
                                                                        q0 q0VarM43411 = C0225.m4345(mainViewModelM1169);
                                                                        strM40410 = C0212.m4049(thM9416);
                                                                        i26 = 1509549;
                                                                        while (true) {
                                                                            i26 ^= 1509566;
                                                                            switch (i26) {
                                                                                case 19:
                                                                                    if (strM40410 == null) {
                                                                                    }
                                                                                    break;
                                                                                case 85:
                                                                                    break;
                                                                                case 114:
                                                                                    break;
                                                                                case 436:
                                                                                    strM40410 = strM7580;
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0227.m4382(q0VarM43411, new c(strM40410));
                                                                        C0227.m4382(C0073.m1601(mainViewModelM1169), C0455.m8876());
                                                                        i27 = 1509673;
                                                                        while (true) {
                                                                            i27 ^= 1509690;
                                                                            switch (i27) {
                                                                                case 19:
                                                                                    i27 = 1510355;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case 745:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
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
                                                        case 239:
                                                            i37 = iM1032 != 3 ? 48860 : 48829;
                                                            break;
                                                        default:
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
                        C0329.m6365(obj);
                        C0227.m4382(C0073.m1601(mainViewModelM1169), C0334.m6483());
                        q0 q0VarM7437 = C0379.m7430(mainViewModelM1169);
                        C0227.m4382(q0VarM7437, null);
                        boolean zM2600 = C0135.m2600(mainViewModelM1169);
                        int i41 = 51588;
                        while (true) {
                            i41 ^= 51605;
                            switch (i41) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i41 = !zM2600 ? 51681 : 51650;
                                    break;
                                case 54:
                                    break;
                                case 87:
                                    a5.j jVarM7458 = C0380.m7458(mainViewModelM1169);
                                    String strM6213 = C0321.m6213(this);
                                    this.f6319f = 1;
                                    objM9112 = C0468.m9112(jVarM7458, strM9104, strM6213, this);
                                    int i42 = 51712;
                                    while (true) {
                                        i42 ^= 51729;
                                        switch (i42) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i42 = objM9112 == aVarM5766 ? 51805 : 51774;
                                                break;
                                            case 47:
                                                break;
                                            case 76:
                                                return aVarM5766;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case 116:
                                    C0227.m4382(q0VarM7437, C0078.m1682(m5349(), 110, C0355.f626 ^ (-68), 1216));
                                    C0227.m4382(C0225.m4345(mainViewModelM1169), new c(C0295.m5683(m5349(), 160, C0478.f752 ^ (-814), 951)));
                                    C0227.m4382(C0073.m1601(mainViewModelM1169), C0455.m8876());
                                    return lVarM238;
                                default:
                                    break;
                            }
                        }
                        i10 = 50813;
                        while (true) {
                            i10 ^= 50830;
                            switch (i10) {
                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case 243:
                                    i10 = 50844;
                                    break;
                                default:
                                    break;
                            }
                            z10 = objM9112 instanceof q8.g;
                            i11 = 51836;
                            while (true) {
                                i11 ^= 51853;
                                switch (i11) {
                                    case 241:
                                        if (((((z10 ? 1 : 0) ^ '\uffff') & 1) | ((z10 ? 1 : 0) & '\ufffe')) != 0) {
                                        }
                                        break;
                                    case 1963:
                                        break;
                                    case 1992:
                                        thM9416 = C0483.m9416(objM9112);
                                        i24 = 1508650;
                                        while (true) {
                                            i24 ^= 1508667;
                                            switch (i24) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (thM9416 != null) {
                                                    }
                                                    break;
                                                case 83:
                                                    break;
                                                case 114:
                                                    break;
                                                case 3369:
                                                    q0 q0VarM7438 = C0379.m7430(mainViewModelM1169);
                                                    strM4049 = C0212.m4049(thM9416);
                                                    i25 = 1509425;
                                                    while (true) {
                                                        i25 ^= 1509442;
                                                        switch (i25) {
                                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                break;
                                                            case 115:
                                                                if (strM4049 == null) {
                                                                }
                                                                break;
                                                            case 204:
                                                                strM4049 = strM7580;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0227.m4382(q0VarM7438, strM4049);
                                                    q0 q0VarM43412 = C0225.m4345(mainViewModelM1169);
                                                    strM40410 = C0212.m4049(thM9416);
                                                    i26 = 1509549;
                                                    while (true) {
                                                        i26 ^= 1509566;
                                                        switch (i26) {
                                                            case 19:
                                                                if (strM40410 == null) {
                                                                }
                                                                break;
                                                            case 85:
                                                                break;
                                                            case 114:
                                                                break;
                                                            case 436:
                                                                strM40410 = strM7580;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0227.m4382(q0VarM43412, new c(strM40410));
                                                    C0227.m4382(C0073.m1601(mainViewModelM1169), C0455.m8876());
                                                    i27 = 1509673;
                                                    while (true) {
                                                        i27 ^= 1509690;
                                                        switch (i27) {
                                                            case 19:
                                                                i27 = 1510355;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
                                                            case 745:
                                                                break;
                                                            default:
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
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
                                    case 2025:
                                        firebaseUser = (FirebaseUser) objM9112;
                                        strM7415 = C0378.m7415(C0152.m2915(C0287.m5540(mainViewModelM1169)), C0349.m6842(m5349(), 182, C0067.f87 ^ (-814), 3143));
                                        i12 = 52611;
                                        while (true) {
                                            i12 ^= 52628;
                                            switch (i12) {
                                                case 23:
                                                    if (strM7415 == null) {
                                                    }
                                                    break;
                                                case 54:
                                                    break;
                                                case 85:
                                                    break;
                                                case 116:
                                                    strM7415 = C0439.m8581();
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        a5.z zVarM78210 = C0399.m7827(mainViewModelM1169);
                                        String strM87920 = C0450.m8790(firebaseUser);
                                        C0335.m6501(strM87920, strM4771);
                                        this.f6314a = objM9112;
                                        this.f6315b = mainViewModelM1169;
                                        this.f6316c = strM9104;
                                        this.f6317d = firebaseUser;
                                        this.f6318e = strM7415;
                                        this.f6319f = 2;
                                        objM7969 = C0406.m7969(zVarM78210, strM87920, false, this);
                                        i13 = 52735;
                                        while (true) {
                                            i13 ^= 52752;
                                            switch (i13) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    mainViewModelM8022 = mainViewModelM1169;
                                                    firebaseUserM7087 = firebaseUser;
                                                    objM9550 = objM9112;
                                                    break;
                                                case 1007:
                                                    if (objM7969 == aVarM5766) {
                                                    }
                                                    break;
                                                case 7927:
                                                    return aVarM5766;
                                                default:
                                                    break;
                                            }
                                        }
                                        z11 = objM7969 instanceof q8.g;
                                        i14 = 53510;
                                        while (true) {
                                            i14 ^= 53527;
                                            switch (i14) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (((((z11 ? 1 : 0) ^ '\uffff') & 1) | ((z11 ? 1 : 0) & '\ufffe')) != 0) {
                                                    }
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 83:
                                                    strM2263 = C0117.m2263(firebaseUserM7087);
                                                    i15 = 55680;
                                                    while (true) {
                                                        i15 ^= 55697;
                                                        switch (i15) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                if (strM2263 == null) {
                                                                }
                                                                break;
                                                            case 1467:
                                                                break;
                                                            case 1496:
                                                                break;
                                                            case 1529:
                                                                strM2263 = C0200.m3843(strM9104, C0444.m8665(m5349(), 192, 1, 1463));
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    a5.z zVarM78211 = C0399.m7827(mainViewModelM8022);
                                                    String strM879117 = C0450.m8790(firebaseUserM7087);
                                                    C0335.m6501(strM879117, strM4771);
                                                    this.f6314a = objM9550;
                                                    this.f6315b = mainViewModelM8022;
                                                    this.f6316c = strM9104;
                                                    this.f6317d = firebaseUserM7087;
                                                    this.f6318e = null;
                                                    this.f6319f = 3;
                                                    objM986 = C0051.m986(zVarM78211, strM879117, strM2263, strM9104, strM7415, this);
                                                    i16 = 56455;
                                                    while (true) {
                                                        i16 ^= 56472;
                                                        switch (i16) {
                                                            case 31:
                                                                if (objM986 == aVarM5766) {
                                                                }
                                                                break;
                                                            case 62:
                                                                break;
                                                            case 93:
                                                                firebaseUserM7088 = firebaseUserM7087;
                                                                mainViewModelM8023 = mainViewModelM8022;
                                                                strM7547 = strM9104;
                                                                objM9112 = objM9550;
                                                                break;
                                                            case 124:
                                                                return aVarM5766;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    this.f6314a = objM9112;
                                                    this.f6315b = mainViewModelM8023;
                                                    this.f6316c = strM7547;
                                                    this.f6317d = firebaseUserM7088;
                                                    this.f6319f = 4;
                                                    objM5493 = C0285.m5493((-386) ^ ((long) C0153.f178), this);
                                                    i23 = 56579;
                                                    while (true) {
                                                        i23 ^= 56596;
                                                        switch (i23) {
                                                            case 23:
                                                                if (objM5493 == aVarM5766) {
                                                                }
                                                                break;
                                                            case 54:
                                                                break;
                                                            case 85:
                                                                mainViewModelM8024 = mainViewModelM8023;
                                                                break;
                                                            case 1564036:
                                                                return aVarM5766;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    firebaseUser2 = firebaseUserM7088;
                                                    mainViewModel = mainViewModelM8024;
                                                    C0227.m4382(C0073.m1601(mainViewModel), C0455.m8876());
                                                    C0475.m9262(mainViewModel);
                                                    zM9071 = C0465.m9071((AppConfig) C0246.m4716(C0318.m6172(C0266.m5081(mainViewModel))));
                                                    firebaseUserM5359 = C0277.m5359(C0020.m402(C0380.m7458(mainViewModel)));
                                                    i28 = 1507503;
                                                    while (true) {
                                                        i28 ^= 1507520;
                                                        switch (i28) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                String strM879118 = C0450.m8790(firebaseUser2);
                                                                C0335.m6501(strM879118, strM4771);
                                                                C0467.m9105(mainViewModel, strM879118);
                                                                break;
                                                            case 111:
                                                                if (zM9071) {
                                                                }
                                                                break;
                                                            case 460:
                                                                i29 = 1507627;
                                                                while (true) {
                                                                    i29 ^= 1507644;
                                                                    switch (i29) {
                                                                        case 23:
                                                                            if (firebaseUserM5359 != null) {
                                                                            }
                                                                            break;
                                                                        case 85:
                                                                            String strM879119 = C0450.m8790(firebaseUser2);
                                                                            C0335.m6501(strM879119, strM4771);
                                                                            C0467.m9105(mainViewModel, strM879119);
                                                                            break;
                                                                        case 118:
                                                                            break;
                                                                        case 180:
                                                                            zM5161 = C0270.m5161(firebaseUserM5359);
                                                                            i30 = 1507751;
                                                                            while (true) {
                                                                                i30 ^= 1507768;
                                                                                switch (i30) {
                                                                                    case 31:
                                                                                        if (!zM5161) {
                                                                                        }
                                                                                        break;
                                                                                    case 1335:
                                                                                        C0233.m4497(firebaseUserM5359);
                                                                                        C0227.m4382(C0225.m4345(mainViewModel), new b(strM7547));
                                                                                        i31 = 1508526;
                                                                                        while (true) {
                                                                                            i31 ^= 1508543;
                                                                                            switch (i31) {
                                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i31 = 1508557;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                case 114:
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 1480:
                                                                                        String strM8791110 = C0450.m8790(firebaseUser2);
                                                                                        C0335.m6501(strM8791110, strM4771);
                                                                                        C0467.m9105(mainViewModel, strM8791110);
                                                                                        break;
                                                                                    case 1513:
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
                                                    thM9416 = C0483.m9416(objM9112);
                                                    i24 = 1508650;
                                                    while (true) {
                                                        i24 ^= 1508667;
                                                        switch (i24) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                if (thM9416 != null) {
                                                                }
                                                                break;
                                                            case 83:
                                                                break;
                                                            case 114:
                                                                break;
                                                            case 3369:
                                                                q0 q0VarM7439 = C0379.m7430(mainViewModelM1169);
                                                                strM4049 = C0212.m4049(thM9416);
                                                                i25 = 1509425;
                                                                while (true) {
                                                                    i25 ^= 1509442;
                                                                    switch (i25) {
                                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            break;
                                                                        case 115:
                                                                            if (strM4049 == null) {
                                                                            }
                                                                            break;
                                                                        case 204:
                                                                            strM4049 = strM7580;
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0227.m4382(q0VarM7439, strM4049);
                                                                q0 q0VarM43413 = C0225.m4345(mainViewModelM1169);
                                                                strM40410 = C0212.m4049(thM9416);
                                                                i26 = 1509549;
                                                                while (true) {
                                                                    i26 ^= 1509566;
                                                                    switch (i26) {
                                                                        case 19:
                                                                            if (strM40410 == null) {
                                                                            }
                                                                            break;
                                                                        case 85:
                                                                            break;
                                                                        case 114:
                                                                            break;
                                                                        case 436:
                                                                            strM40410 = strM7580;
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0227.m4382(q0VarM43413, new c(strM40410));
                                                                C0227.m4382(C0073.m1601(mainViewModelM1169), C0455.m8876());
                                                                i27 = 1509673;
                                                                while (true) {
                                                                    i27 ^= 1509690;
                                                                    switch (i27) {
                                                                        case 19:
                                                                            i27 = 1510355;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        case 745:
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
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
                                                    z12 = objM7969 instanceof q8.g;
                                                    i17 = 53634;
                                                    while (true) {
                                                        i17 ^= 53651;
                                                        switch (i17) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                if (z12) {
                                                                }
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 76:
                                                                i22 = 53758;
                                                                while (true) {
                                                                    i22 ^= 53775;
                                                                    switch (i22) {
                                                                        case 1009:
                                                                            i22 = 54440;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        case 1703:
                                                                            obj2 = null;
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            case 83:
                                                                obj2 = objM7969;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0189.m3608(obj2);
                                                    userProfile = (UserProfile) obj2;
                                                    iM8181 = C0416.m8181(C0369.m7264(userProfile));
                                                    i18 = 54533;
                                                    while (true) {
                                                        i18 ^= 54550;
                                                        switch (i18) {
                                                            case 19:
                                                                if (iM8181 > 0) {
                                                                }
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 85:
                                                                i19 = 55556;
                                                                while (true) {
                                                                    i19 ^= 55573;
                                                                    switch (i19) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i19 = 55587;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        case 54:
                                                                            firebaseUser2 = firebaseUserM7087;
                                                                            mainViewModel = mainViewModelM8022;
                                                                            strM7547 = strM9104;
                                                                            objM9112 = objM9550;
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                    }
                                                                    C0227.m4382(C0073.m1601(mainViewModel), C0455.m8876());
                                                                    C0475.m9262(mainViewModel);
                                                                    zM9071 = C0465.m9071((AppConfig) C0246.m4716(C0318.m6172(C0266.m5081(mainViewModel))));
                                                                    firebaseUserM5359 = C0277.m5359(C0020.m402(C0380.m7458(mainViewModel)));
                                                                    i28 = 1507503;
                                                                    while (true) {
                                                                        i28 ^= 1507520;
                                                                        switch (i28) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                String strM8791111 = C0450.m8790(firebaseUser2);
                                                                                C0335.m6501(strM8791111, strM4771);
                                                                                C0467.m9105(mainViewModel, strM8791111);
                                                                                break;
                                                                            case 111:
                                                                                if (zM9071) {
                                                                                }
                                                                                break;
                                                                            case 460:
                                                                                i29 = 1507627;
                                                                                while (true) {
                                                                                    i29 ^= 1507644;
                                                                                    switch (i29) {
                                                                                        case 23:
                                                                                            if (firebaseUserM5359 != null) {
                                                                                            }
                                                                                            break;
                                                                                        case 85:
                                                                                            String strM8791112 = C0450.m8790(firebaseUser2);
                                                                                            C0335.m6501(strM8791112, strM4771);
                                                                                            C0467.m9105(mainViewModel, strM8791112);
                                                                                            break;
                                                                                        case 118:
                                                                                            break;
                                                                                        case 180:
                                                                                            zM5161 = C0270.m5161(firebaseUserM5359);
                                                                                            i30 = 1507751;
                                                                                            while (true) {
                                                                                                i30 ^= 1507768;
                                                                                                switch (i30) {
                                                                                                    case 31:
                                                                                                        if (!zM5161) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 1335:
                                                                                                        C0233.m4497(firebaseUserM5359);
                                                                                                        C0227.m4382(C0225.m4345(mainViewModel), new b(strM7547));
                                                                                                        i31 = 1508526;
                                                                                                        while (true) {
                                                                                                            i31 ^= 1508543;
                                                                                                            switch (i31) {
                                                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                    i31 = 1508557;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                case 114:
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    case 1480:
                                                                                                        String strM8791113 = C0450.m8790(firebaseUser2);
                                                                                                        C0335.m6501(strM8791113, strM4771);
                                                                                                        C0467.m9105(mainViewModel, strM8791113);
                                                                                                        break;
                                                                                                    case 1513:
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
                                                                }
                                                                break;
                                                            case 116:
                                                                zM4399 = C0228.m4399(C0369.m7264(userProfile), strM7415);
                                                                i20 = 54657;
                                                                while (true) {
                                                                    i20 ^= 54674;
                                                                    switch (i20) {
                                                                        case 19:
                                                                            if (!zM4399) {
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            i19 = 55556;
                                                                            while (true) {
                                                                                i19 ^= 55573;
                                                                                switch (i19) {
                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i19 = 55587;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 54:
                                                                                        firebaseUser2 = firebaseUserM7087;
                                                                                        mainViewModel = mainViewModelM8022;
                                                                                        strM7547 = strM9104;
                                                                                        objM9112 = objM9550;
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                                C0227.m4382(C0073.m1601(mainViewModel), C0455.m8876());
                                                                                C0475.m9262(mainViewModel);
                                                                                zM9071 = C0465.m9071((AppConfig) C0246.m4716(C0318.m6172(C0266.m5081(mainViewModel))));
                                                                                firebaseUserM5359 = C0277.m5359(C0020.m402(C0380.m7458(mainViewModel)));
                                                                                i28 = 1507503;
                                                                                while (true) {
                                                                                    i28 ^= 1507520;
                                                                                    switch (i28) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                            String strM8791114 = C0450.m8790(firebaseUser2);
                                                                                            C0335.m6501(strM8791114, strM4771);
                                                                                            C0467.m9105(mainViewModel, strM8791114);
                                                                                            break;
                                                                                        case 111:
                                                                                            if (zM9071) {
                                                                                            }
                                                                                            break;
                                                                                        case 460:
                                                                                            i29 = 1507627;
                                                                                            while (true) {
                                                                                                i29 ^= 1507644;
                                                                                                switch (i29) {
                                                                                                    case 23:
                                                                                                        if (firebaseUserM5359 != null) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 85:
                                                                                                        String strM8791115 = C0450.m8790(firebaseUser2);
                                                                                                        C0335.m6501(strM8791115, strM4771);
                                                                                                        C0467.m9105(mainViewModel, strM8791115);
                                                                                                        break;
                                                                                                    case 118:
                                                                                                        break;
                                                                                                    case 180:
                                                                                                        zM5161 = C0270.m5161(firebaseUserM5359);
                                                                                                        i30 = 1507751;
                                                                                                        while (true) {
                                                                                                            i30 ^= 1507768;
                                                                                                            switch (i30) {
                                                                                                                case 31:
                                                                                                                    if (!zM5161) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 1335:
                                                                                                                    C0233.m4497(firebaseUserM5359);
                                                                                                                    C0227.m4382(C0225.m4345(mainViewModel), new b(strM7547));
                                                                                                                    i31 = 1508526;
                                                                                                                    while (true) {
                                                                                                                        i31 ^= 1508543;
                                                                                                                        switch (i31) {
                                                                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                i31 = 1508557;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                            case 114:
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 1480:
                                                                                                                    String strM8791116 = C0450.m8790(firebaseUser2);
                                                                                                                    C0335.m6501(strM8791116, strM4771);
                                                                                                                    C0467.m9105(mainViewModel, strM8791116);
                                                                                                                    break;
                                                                                                                case 1513:
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
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 3579:
                                                                            C0225.m4338(C0380.m7458(mainViewModelM8022));
                                                                            C0227.m4382(C0379.m7430(mainViewModelM8022), strM2710);
                                                                            C0227.m4382(C0225.m4345(mainViewModelM8022), new c(strM2710));
                                                                            C0227.m4382(C0073.m1601(mainViewModelM8022), C0455.m8876());
                                                                            i21 = 55432;
                                                                            while (true) {
                                                                                i21 ^= 55449;
                                                                                switch (i21) {
                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i21 = 55463;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 62:
                                                                                        objM9112 = objM9550;
                                                                                        break;
                                                                                    default:
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
                                                        thM9416 = C0483.m9416(objM9112);
                                                        i24 = 1508650;
                                                        while (true) {
                                                            i24 ^= 1508667;
                                                            switch (i24) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (thM9416 != null) {
                                                                    }
                                                                    break;
                                                                case 83:
                                                                    break;
                                                                case 114:
                                                                    break;
                                                                case 3369:
                                                                    q0 q0VarM74310 = C0379.m7430(mainViewModelM1169);
                                                                    strM4049 = C0212.m4049(thM9416);
                                                                    i25 = 1509425;
                                                                    while (true) {
                                                                        i25 ^= 1509442;
                                                                        switch (i25) {
                                                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                break;
                                                                            case 115:
                                                                                if (strM4049 == null) {
                                                                                }
                                                                                break;
                                                                            case 204:
                                                                                strM4049 = strM7580;
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    C0227.m4382(q0VarM74310, strM4049);
                                                                    q0 q0VarM43414 = C0225.m4345(mainViewModelM1169);
                                                                    strM40410 = C0212.m4049(thM9416);
                                                                    i26 = 1509549;
                                                                    while (true) {
                                                                        i26 ^= 1509566;
                                                                        switch (i26) {
                                                                            case 19:
                                                                                if (strM40410 == null) {
                                                                                }
                                                                                break;
                                                                            case 85:
                                                                                break;
                                                                            case 114:
                                                                                break;
                                                                            case 436:
                                                                                strM40410 = strM7580;
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    C0227.m4382(q0VarM43414, new c(strM40410));
                                                                    C0227.m4382(C0073.m1601(mainViewModelM1169), C0455.m8876());
                                                                    i27 = 1509673;
                                                                    while (true) {
                                                                        i27 ^= 1509690;
                                                                        switch (i27) {
                                                                            case 19:
                                                                                i27 = 1510355;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            case 745:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
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
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
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
                int i43 = 49790;
                while (true) {
                    i43 ^= 49807;
                    switch (i43) {
                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            q0 q0VarM74311 = C0379.m7430(mainViewModelM1169);
                            String strM40411 = C0212.m4049(e10);
                            int i44 = 1510448;
                            while (true) {
                                i44 ^= 1510465;
                                switch (i44) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case 47:
                                        break;
                                    case 113:
                                        i44 = strM40411 == null ? 1510541 : 1510510;
                                        break;
                                    case 204:
                                        strM40411 = strM7580;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            C0227.m4382(q0VarM74311, strM40411);
                            String strM40412 = C0212.m4049(e10);
                            int i45 = 1510572;
                            while (true) {
                                i45 ^= 1510589;
                                switch (i45) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i45 = strM40412 == null ? 1511316 : 1510634;
                                        break;
                                    case 87:
                                        strM7580 = strM40412;
                                        break;
                                    case 118:
                                        break;
                                    case 809:
                                        int i46 = 1511347;
                                        while (true) {
                                            i46 ^= 1511364;
                                            switch (i46) {
                                                case 22:
                                                    break;
                                                case 119:
                                                    i46 = 1511378;
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
                            C0227.m4382(C0225.m4345(mainViewModelM1169), new c(strM7580));
                            C0227.m4382(C0073.m1601(mainViewModelM1169), C0455.m8876());
                            break;
                        case 241:
                            i43 = 49821;
                            continue;
                        default:
                            continue;
                    }
                }
            }
        }
    }
}
