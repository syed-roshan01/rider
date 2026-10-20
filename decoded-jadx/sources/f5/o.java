package f5;

import a.C0000;
import a5.i0;
import a8.C0009;
import aa.C0012;
import android.app.Application;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import androidx.annotation.C0019;
import androidx.appcompat.widget.C0020;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.foundation.text.modifiers.C0025;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.platform.C0038;
import androidx.profileinstaller.C0045;
import c1.C0059;
import c7.C0069;
import com.auto.accept.data.model.AppConfig;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0076;
import com.google.android.datatransport.cct.C0078;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.measurement.internal.C0105;
import com.google.android.gms.tasks.C0106;
import com.google.android.play.core.integrity.client.C0107;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.emulators.C0140;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.bind.C0207;
import com.google.protobuf.C0209;
import d1.C0214;
import d3.C0216;
import d4.C0217;
import d7.C0220;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.lifecycle.C0236;
import dagger.hilt.codegen.C0241;
import dagger.hilt.internal.aliasof.C0247;
import dagger.hilt.internal.componenttreedeps.C0248;
import e9.C0266;
import f.C0269;
import g2.C0287;
import g5.C0290;
import h.C0296;
import h0.C0299;
import h3.C0301;
import h7.C0312;
import i4.C0317;
import j2.C0323;
import j4.C0326;
import j9.C0329;
import java.util.Iterator;
import k1.C0332;
import k3.C0334;
import k3.C0335;
import k7.C0337;
import l0.C0340;
import m4.C0353;
import m5.C0355;
import n.C0361;
import n8.C0365;
import o7.i2;
import p8.C0380;
import q2.C0384;
import q6.C0388;
import r2.C0397;
import r6.C0401;
import rikka.shizuku.C0406;
import s.C0407;
import s6.C0413;
import s8.C0416;
import t1.C0419;
import t2.C0421;
import u8.C0438;
import v0.C0440;
import v0.C0441;
import v6.C0446;
import v6.C0447;
import v7.C0449;
import w2.C0458;
import x2.C0467;
import x8.C0473;
import z1.C0483;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public final class o extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f410short = {10159, -1455, 1150, 1080, 1083, 1066, 1085, 1078, 1036, 1083, 1075, 1073, 1066, 1083, 1053, 1073, 1072, 1080, 1079, 1081, 1124, 1150, 1080, 1083, 1066, 1085, 1078, 1055, 1072, 1082, 1055, 1085, 1066, 1079, 1064, 1087, 1066, 1083, 1150, 1066, 1073, 1073, 1077, 1150, 1782, 1772, 1760, 1789, 1786, 1771, 1790, 1613, 1615, 1602, 1602, 1550, 1626, 1601, 1550, 1545, 1628, 1611, 1629, 1627, 1603, 1611, 1545, 1550, 1612, 1611, 1608, 1601, 1628, 1611, 1550, 1545, 1607, 1600, 1624, 1601, 1605, 1611, 1545, 1550, 1625, 1607, 1626, 1606, 1550, 1613, 1601, 1628, 1601, 1627, 1626, 1607, 1600, 1611, 2032, 2044, 2045, 2045, 2038, 2032, 2023, 2042, 2021, 2042, 2023, 2026, 1848, 1827, 1850, 1850, 1910, 1845, 1847, 1848, 1848, 1849, 1826, 1910, 1844, 1843, 1910, 1845, 1847, 1829, 1826, 1910, 1826, 1849, 1910, 1848, 1849, 1848, 1915, 1848, 1827, 1850, 1850, 1910, 1826, 1839, 1830, 1843, 1910, 1847, 1848, 1842, 1828, 1849, 1855, 1842, 1912, 1848, 1843, 1826, 1912, 1813, 1849, 1848, 1848, 1843, 1845, 1826, 1855, 1824, 1855, 1826, 1839, 1819, 1847, 1848, 1847, 1841, 1843, 1828, 10919, -2215, 2422, 2352, 2355, 2338, 2357, 2366, 2308, 2355, 2363, 2361, 2338, 2355, 2325, 2361, 2360, 2352, 2367, 2353, 2412, 2422, 2357, 2359, 2362, 2362, 2367, 2360, 2353, 2422, 2352, 2355, 2338, 2357, 2366, 2327, 2360, 2354, 2327, 2357, 2338, 2367, 2336, 2359, 2338, 2355, 2424, 2424, 2424, 2966, 2952};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Application f6304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MainViewModel f6307d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(MainViewModel mainViewModel, u8.e eVar) {
        super(C0458.f729 ^ (-309), eVar);
        this.f6307d = mainViewModel;
        int iM2475 = C0128.m2475();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2475 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0025.m505("9v2VvZU0LpqGzZJK1YR")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static short[] m5346() {
        int iM8173 = C0416.m8173();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8173 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f410short;
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
        MainViewModel mainViewModelM3511 = null;
        String str = "\u06e7\u06e1\u06e0";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747688:
                    this = new o(mainViewModelM3511, eVar);
                    str = "\u06e0\u06e4\u06df";
                    break;
                case 1754438:
                    mainViewModelM3511 = C0183.m3511(this);
                    str = "\u06e0\u06e0\u06e8";
                    break;
                default:
                    return this;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e8\u06e1\u06e0";
        m9.d0 d0Var = null;
        u8.e eVarM8000 = null;
        u8.e eVar = null;
        Object objM8246 = obj;
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56327:
                    str = "\u06df\u06e3\u06e7";
                    this = (o) eVarM8000;
                    break;
                case 1746819:
                    str = "\u06e5\u06e7\u06e6";
                    lVarM238 = C0012.m238();
                    break;
                case 1747679:
                    return objM8246;
                case 1751718:
                    eVarM8000 = C0407.m8000(this, d0Var, eVar);
                    str = "\u06e0\u06e7";
                    break;
                case 1752708:
                    objM8246 = C0419.m8246(this, lVarM238);
                    str = "\u06e0\u06e0\u06df";
                    break;
                case 1755399:
                    str = "\u06e8\u06df\u06e6";
                    d0Var = (m9.d0) objM8246;
                    break;
                default:
                    str = "\u06e4\u06e6\u06e8";
                    eVar = (u8.e) obj2;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:360:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x026f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x0529 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x0288 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x02af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x02d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x02b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x0330 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x036e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x0330 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x036e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x0353 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x0359 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x035d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x0352 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x0359 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x0355 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x037d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:0x0383 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x0387 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x037c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x0383 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x037f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x03a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x03a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x03ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x0415 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x03a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x03a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x03a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x03c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x0415 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x03d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x03db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:0x03e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x0415 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x03d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x03dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x03d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x0424 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x042a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x042e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x047d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:0x0423 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x042a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x0426 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x043d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:0x0443 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x0447 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x047d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:0x0443 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x043c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x043f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x045a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x0460 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x0464 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x047d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x0459 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x0460 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x045c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x02d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x030e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:0x04f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x04f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x04fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x0510 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:0x04f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:0x04f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:0x04e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x052c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:72:0x0182. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        NetworkCapabilities networkCapabilitiesM7525;
        Application applicationM6622;
        long jM7869;
        Object objM6254;
        int i10;
        Object objM7093;
        Application application;
        boolean zM14;
        int i11;
        int iM3734;
        int i12;
        boolean z10;
        boolean zM2099;
        int i13;
        boolean z11;
        int iM3735;
        int i14;
        int i15;
        boolean zM9582;
        int i16;
        boolean zM8557;
        int i17;
        boolean zM6315;
        int i18;
        boolean zM6316;
        int i19;
        boolean zM8700;
        int i20;
        int iM8181;
        int i21;
        boolean zM3000;
        int i22;
        int iM8182;
        int i23;
        PackageManager packageManagerM8279;
        Iterator itM2089;
        boolean zM3327;
        int i24;
        int i25;
        int i26;
        String strM748 = C0038.m748(m5346(), 0, C0388.f659 ^ 572, 1118);
        v8.a aVarM5766 = C0299.m5766();
        int iM6462 = C0332.m6462(this);
        q8.l lVarM238 = C0012.m238();
        String strM406 = C0020.m406(m5346(), 44, C0296.f444 ^ (-999), 1727);
        MainViewModel mainViewModelM3511 = C0183.m3511(this);
        int i27 = 1616;
        while (true) {
            i27 ^= 1633;
            switch (i27) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i27 = iM6462 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i28 = 1740;
                    while (true) {
                        i28 ^= 1757;
                        switch (i28) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i28 = iM6462 == 1 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0160.m3074(m5346(), 51, C0447.f718 ^ (-151), 1582));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                jM7869 = C0317.m6139(this);
                                applicationM6622 = C0337.m6622(this);
                                try {
                                    C0329.m6365(obj);
                                    objM7093 = C0361.m7093((q8.h) obj);
                                    int i29 = 1864;
                                    while (true) {
                                        i29 ^= 1881;
                                        switch (i29) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i29 = 48674;
                                                continue;
                                            case 47483:
                                                application = applicationM6622;
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                } catch (Exception e4) {
                                    Boolean boolM6048 = C0312.m6048();
                                    C0335.m6501(boolM6048, strM406);
                                    zM14 = C0000.m14(boolM6048);
                                    i11 = 1509673;
                                    while (true) {
                                        i11 ^= 1509690;
                                        switch (i11) {
                                            case 19:
                                                i11 = zM14 ? 1510417 : 1510386;
                                                break;
                                            case 712:
                                                break;
                                            case 745:
                                                break;
                                            case 1323:
                                                C0214.m4091(new Handler(C0207.m3950()), new n(applicationM6622, C0029.f49 ^ (-484)));
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    return lVarM238;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    C0329.m6365(obj);
                    Application applicationM5540 = C0287.m5540(mainViewModelM3511);
                    Boolean boolM6049 = C0312.m6048();
                    C0335.m6501(boolM6049, strM406);
                    boolean zM15 = C0000.m14(boolM6049);
                    int i30 = 48767;
                    try {
                        while (true) {
                            i30 ^= 48784;
                            switch (i30) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 76:
                                    Object objM4133 = C0217.m4133(applicationM5540, C0216.m4120(m5346(), 98, C0140.f166 ^ 79, 1939));
                                    C0301.m5795(objM4133, C0269.m5144(m5346(), 110, C0406.f677 ^ 783, 1878));
                                    ConnectivityManager connectivityManager = (ConnectivityManager) objM4133;
                                    Network networkM9228 = C0473.m9228(connectivityManager);
                                    int i31 = 48891;
                                    while (true) {
                                        i31 ^= 48908;
                                        switch (i31) {
                                            case 22:
                                                break;
                                            case 53:
                                                networkCapabilitiesM7525 = null;
                                                break;
                                            case 503:
                                                i31 = networkM9228 != null ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                networkCapabilitiesM7525 = C0384.m7525(connectivityManager, networkM9228);
                                                int i32 = 49666;
                                                while (true) {
                                                    i32 ^= 49683;
                                                    switch (i32) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i32 = 49697;
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
                                    int i33 = 49790;
                                    while (true) {
                                        i33 ^= 49807;
                                        switch (i33) {
                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 51:
                                                C0214.m4091(new Handler(C0207.m3950()), new n(applicationM5540, 0));
                                                return lVarM238;
                                            case 84:
                                                boolean zM501 = C0025.m501(networkCapabilitiesM7525, C0247.f327 ^ (-493));
                                                int i34 = 49914;
                                                while (true) {
                                                    i34 ^= 49931;
                                                    switch (i34) {
                                                        case 497:
                                                            i34 = zM501 ? 50658 : 50627;
                                                            break;
                                                        case 1711:
                                                            break;
                                                        case 1736:
                                                            C0214.m4091(new Handler(C0207.m3950()), new n(applicationM5540, 0));
                                                            return lVarM238;
                                                        case 1769:
                                                            int i35 = 50689;
                                                            while (true) {
                                                                i35 ^= 50706;
                                                                switch (i35) {
                                                                    case 19:
                                                                        i35 = 50720;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                            case 241:
                                                i33 = networkCapabilitiesM7525 != null ? 49883 : 49852;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    C0159.m3036(mainViewModelM3511);
                                    C0209.m4014(m5346(), 178, C0467.f738 ^ (-431), 2390);
                                    jM7869 = C0401.m7869();
                                    i0 i0VarM5081 = C0266.m5081(mainViewModelM3511);
                                    this.f6304a = applicationM5540;
                                    this.f6305b = jM7869;
                                    this.f6306c = 1;
                                    objM6254 = C0323.m6254(i0VarM5081, this);
                                    i10 = 50813;
                                    while (true) {
                                        i10 ^= 50830;
                                        switch (i10) {
                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 53:
                                                objM7093 = objM6254;
                                                application = applicationM5540;
                                                break;
                                            case 243:
                                                i10 = objM6254 == aVarM5766 ? 51557 : 50875;
                                                break;
                                            case 4075:
                                                return aVarM5766;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case 239:
                                    i30 = zM15 ? 48860 : 48829;
                                    break;
                                default:
                                    break;
                            }
                        }
                        C0159.m3036(mainViewModelM3511);
                        C0209.m4014(m5346(), 178, C0467.f738 ^ (-431), 2390);
                        jM7869 = C0401.m7869();
                        i0 i0VarM5082 = C0266.m5081(mainViewModelM3511);
                        this.f6304a = applicationM5540;
                        this.f6305b = jM7869;
                        this.f6306c = 1;
                        objM6254 = C0323.m6254(i0VarM5082, this);
                        i10 = 50813;
                        while (true) {
                            i10 ^= 50830;
                            switch (i10) {
                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case 53:
                                    objM7093 = objM6254;
                                    application = applicationM5540;
                                    break;
                                case 243:
                                    if (objM6254 == aVarM5766) {
                                    }
                                    break;
                                case 4075:
                                    return aVarM5766;
                                default:
                                    break;
                            }
                        }
                    } catch (Exception e10) {
                        applicationM6622 = applicationM5540;
                        Boolean boolM60410 = C0312.m6048();
                        C0335.m6501(boolM60410, strM406);
                        zM14 = C0000.m14(boolM60410);
                        i11 = 1509673;
                        while (true) {
                            i11 ^= 1509690;
                            switch (i11) {
                                case 19:
                                    if (zM14) {
                                    }
                                    break;
                                case 712:
                                    break;
                                case 745:
                                    break;
                                case 1323:
                                    C0214.m4091(new Handler(C0207.m3950()), new n(applicationM6622, C0029.f49 ^ (-484)));
                                    break;
                                default:
                                    break;
                            }
                        }
                        return lVarM238;
                    }
                    break;
                default:
                    break;
            }
        }
        try {
            C0159.m3036(mainViewModelM3511);
            long jM78610 = C0401.m7869();
            StringBuilder sb = new StringBuilder(strM748);
            C0340.m6676(sb, ((jM78610 - 9) - jM7869) + 9);
            C0142.m2728(sb, C0483.m9406(m5346(), 227, C0227.f307 ^ (-910), 3067));
            C0440.m8605(sb);
            boolean z12 = objM7093 instanceof q8.g;
            int i36 = 51588;
            while (true) {
                i36 ^= 51605;
                switch (i36) {
                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i36 = ((((z12 ? 1 : 0) ^ '\uffff') & 1) | ((z12 ? 1 : 0) & '\ufffe')) != 0 ? 51681 : 51650;
                        break;
                    case 54:
                        break;
                    case 87:
                        break;
                    case 116:
                        AppConfig appConfig = (AppConfig) objM7093;
                        Boolean boolM60411 = C0312.m6048();
                        C0335.m6501(boolM60411, strM406);
                        boolean zM16 = C0000.m14(boolM60411);
                        int i37 = 51712;
                        while (true) {
                            i37 ^= 51729;
                            switch (i37) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i37 = zM16 ? 51805 : 51774;
                                    break;
                                case 47:
                                    iM3734 = C0195.m3734(appConfig);
                                    i12 = 52735;
                                    while (true) {
                                        i12 ^= 52752;
                                        switch (i12) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                z10 = false;
                                                break;
                                            case 1007:
                                                i12 = iM3734 > 6 ? 53479 : 52797;
                                                break;
                                            case 7927:
                                                z10 = true;
                                                i26 = 53510;
                                                while (true) {
                                                    i26 ^= 53527;
                                                    switch (i26) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i26 = 53541;
                                                            continue;
                                                            continue;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        default:
                                                            continue;
                                                            continue;
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    zM2099 = C0108.m2099(C0236.m4555(appConfig), new Integer(6));
                                    i13 = 53634;
                                    while (true) {
                                        i13 ^= 53651;
                                        switch (i13) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i13 = zM2099 ? 53727 : 53696;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                z11 = true;
                                                break;
                                            case 83:
                                                z11 = z10;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    iM3735 = C0195.m3734(appConfig);
                                    i14 = 53758;
                                    while (true) {
                                        i14 ^= 53775;
                                        switch (i14) {
                                            case 1009:
                                                i14 = iM3735 > 6 ? 54502 : 54471;
                                                break;
                                            case 1703:
                                                break;
                                            case 1736:
                                                i15 = 54657;
                                                while (true) {
                                                    i15 ^= 54674;
                                                    switch (i15) {
                                                        case 19:
                                                            i15 = z11 ? 55401 : 54719;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 3579:
                                                            C0227.m4382(C0397.m7783(mainViewModelM3511), C0334.m6483());
                                                            C0227.m4382(C0380.m7468(mainViewModelM3511), C0116.m2248(appConfig));
                                                            C0227.m4382(C0441.m8615(mainViewModelM3511), C0220.m4254(appConfig));
                                                            C0227.m4382(C0473.m9230(mainViewModelM3511), C0248.m4750(appConfig));
                                                            C0227.m4382(C0079.m1712(mainViewModelM3511), C0009.m192(C0138.m2671(appConfig)));
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 1769:
                                                i25 = 54533;
                                                while (true) {
                                                    i25 ^= 54550;
                                                    switch (i25) {
                                                        case 19:
                                                            i25 = 54564;
                                                            continue;
                                                            continue;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        default:
                                                            continue;
                                                            continue;
                                                    }
                                                    C0227.m4382(C0397.m7783(mainViewModelM3511), C0334.m6483());
                                                    C0227.m4382(C0380.m7468(mainViewModelM3511), C0116.m2248(appConfig));
                                                    C0227.m4382(C0441.m8615(mainViewModelM3511), C0220.m4254(appConfig));
                                                    C0227.m4382(C0473.m9230(mainViewModelM3511), C0248.m4750(appConfig));
                                                    C0227.m4382(C0079.m1712(mainViewModelM3511), C0009.m192(C0138.m2671(appConfig)));
                                                    break;
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    zM9582 = C0492.m9582(C0076.m1656(appConfig));
                                    i16 = 55432;
                                    while (true) {
                                        i16 ^= 55449;
                                        switch (i16) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i16 = ((((zM9582 ? 1 : 0) ^ '\uffff') & 1) | ((zM9582 ? 1 : 0) & '\ufffe')) != 0 ? 55525 : 55494;
                                                break;
                                            case 62:
                                                break;
                                            case 95:
                                                break;
                                            case 124:
                                                packageManagerM8279 = C0421.m8279(C0287.m5540(mainViewModelM3511));
                                                itM2089 = C0107.m2089(C0076.m1656(appConfig));
                                                while (true) {
                                                    zM3327 = C0174.m3327(itM2089);
                                                    i24 = 55556;
                                                    while (true) {
                                                        i24 ^= 55573;
                                                        switch (i24) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i24 = zM3327 ? 55649 : 55618;
                                                                break;
                                                            case 54:
                                                                break;
                                                            case 87:
                                                                break;
                                                            case 116:
                                                                String str = (String) C0413.m8115(itM2089);
                                                                try {
                                                                    C0290.m5588(packageManagerM8279, str, 0);
                                                                    C0227.m4382(C0078.m1684(mainViewModelM3511), str);
                                                                    break;
                                                                } catch (Exception e11) {
                                                                    int i38 = 1510448;
                                                                    while (true) {
                                                                        i38 ^= 1510465;
                                                                        switch (i38) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case 113:
                                                                                i38 = 1510479;
                                                                                break;
                                                                        }
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
                                    }
                                    zM8557 = C0438.m8557(appConfig);
                                    i17 = 55680;
                                    while (true) {
                                        i17 ^= 55697;
                                        switch (i17) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i17 = zM8557 ? 56424 : 56393;
                                                break;
                                            case 1467:
                                                break;
                                            case 1496:
                                                break;
                                            case 1529:
                                                C0227.m4382(C0019.m394(mainViewModelM3511), C0334.m6483());
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    zM6315 = C0326.m6315(mainViewModelM3511);
                                    i18 = 56455;
                                    while (true) {
                                        i18 ^= 56472;
                                        switch (i18) {
                                            case 31:
                                                i18 = !zM6315 ? 56548 : 56517;
                                                break;
                                            case 62:
                                                break;
                                            case 93:
                                                break;
                                            case 124:
                                                zM3000 = C0157.m3000(appConfig);
                                                i22 = 56579;
                                                while (true) {
                                                    i22 ^= 56596;
                                                    switch (i22) {
                                                        case 23:
                                                            i22 = zM3000 ? 1507472 : 56641;
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 85:
                                                            break;
                                                        case 1564036:
                                                            iM8182 = C0416.m8181(C0106.m2064(appConfig));
                                                            i23 = 1507503;
                                                            while (true) {
                                                                i23 ^= 1507520;
                                                                switch (i23) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        break;
                                                                    case 111:
                                                                        i23 = iM8182 > 0 ? 1507596 : 1507565;
                                                                        break;
                                                                    case 460:
                                                                        C0227.m4382(C0365.m7171(mainViewModelM3511), C0106.m2064(appConfig));
                                                                        C0227.m4382(C0045.m877(mainViewModelM3511), C0355.m6972(appConfig));
                                                                        C0227.m4382(C0353.m6917(mainViewModelM3511), new Integer(C0105.m2044(appConfig)));
                                                                        C0227.m4382(C0241.m4628(mainViewModelM3511), C0334.m6483());
                                                                        mainViewModelM3511.I = true;
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
                                    zM6316 = C0326.m6315(mainViewModelM3511);
                                    i19 = 1507627;
                                    while (true) {
                                        i19 ^= 1507644;
                                        switch (i19) {
                                            case 23:
                                                i19 = !zM6316 ? 1507720 : 1507689;
                                                break;
                                            case 85:
                                                break;
                                            case 118:
                                                break;
                                            case 180:
                                                zM8700 = C0446.m8700(appConfig);
                                                i20 = 1507751;
                                                while (true) {
                                                    i20 ^= 1507768;
                                                    switch (i20) {
                                                        case 31:
                                                            i20 = zM8700 ? 1508495 : 1508464;
                                                            break;
                                                        case 1335:
                                                            iM8181 = C0416.m8181(C0449.m8754(appConfig));
                                                            i21 = 1508526;
                                                            while (true) {
                                                                i21 ^= 1508543;
                                                                switch (i21) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i21 = iM8181 > 0 ? 1508619 : 1508588;
                                                                        break;
                                                                    case 83:
                                                                        break;
                                                                    case 114:
                                                                        break;
                                                                    case 436:
                                                                        C0227.m4382(C0207.m3965(mainViewModelM3511), C0449.m8754(appConfig));
                                                                        C0227.m4382(C0059.m1130(mainViewModelM3511), C0334.m6483());
                                                                        mainViewModelM3511.I = true;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 1480:
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
                                case 76:
                                    boolean zM1342 = C0069.m1342(appConfig);
                                    int i39 = 51836;
                                    while (true) {
                                        i39 ^= 51853;
                                        switch (i39) {
                                            case 241:
                                                i39 = !zM1342 ? 52580 : 52549;
                                                break;
                                            case 1963:
                                                break;
                                            case 1992:
                                                iM3734 = C0195.m3734(appConfig);
                                                i12 = 52735;
                                                while (true) {
                                                    i12 ^= 52752;
                                                    switch (i12) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            z10 = false;
                                                            break;
                                                        case 1007:
                                                            if (iM3734 > 6) {
                                                            }
                                                            break;
                                                        case 7927:
                                                            z10 = true;
                                                            i26 = 53510;
                                                            while (true) {
                                                                i26 ^= 53527;
                                                                switch (i26) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i26 = 53541;
                                                                        continue;
                                                                        continue;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                zM2099 = C0108.m2099(C0236.m4555(appConfig), new Integer(6));
                                                i13 = 53634;
                                                while (true) {
                                                    i13 ^= 53651;
                                                    switch (i13) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (zM2099) {
                                                            }
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 76:
                                                            z11 = true;
                                                            break;
                                                        case 83:
                                                            z11 = z10;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                iM3735 = C0195.m3734(appConfig);
                                                i14 = 53758;
                                                while (true) {
                                                    i14 ^= 53775;
                                                    switch (i14) {
                                                        case 1009:
                                                            if (iM3735 > 6) {
                                                            }
                                                            break;
                                                        case 1703:
                                                            break;
                                                        case 1736:
                                                            i15 = 54657;
                                                            while (true) {
                                                                i15 ^= 54674;
                                                                switch (i15) {
                                                                    case 19:
                                                                        if (z11) {
                                                                        }
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 3579:
                                                                        C0227.m4382(C0397.m7783(mainViewModelM3511), C0334.m6483());
                                                                        C0227.m4382(C0380.m7468(mainViewModelM3511), C0116.m2248(appConfig));
                                                                        C0227.m4382(C0441.m8615(mainViewModelM3511), C0220.m4254(appConfig));
                                                                        C0227.m4382(C0473.m9230(mainViewModelM3511), C0248.m4750(appConfig));
                                                                        C0227.m4382(C0079.m1712(mainViewModelM3511), C0009.m192(C0138.m2671(appConfig)));
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 1769:
                                                            i25 = 54533;
                                                            while (true) {
                                                                i25 ^= 54550;
                                                                switch (i25) {
                                                                    case 19:
                                                                        i25 = 54564;
                                                                        continue;
                                                                        continue;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                }
                                                                C0227.m4382(C0397.m7783(mainViewModelM3511), C0334.m6483());
                                                                C0227.m4382(C0380.m7468(mainViewModelM3511), C0116.m2248(appConfig));
                                                                C0227.m4382(C0441.m8615(mainViewModelM3511), C0220.m4254(appConfig));
                                                                C0227.m4382(C0473.m9230(mainViewModelM3511), C0248.m4750(appConfig));
                                                                C0227.m4382(C0079.m1712(mainViewModelM3511), C0009.m192(C0138.m2671(appConfig)));
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                zM9582 = C0492.m9582(C0076.m1656(appConfig));
                                                i16 = 55432;
                                                while (true) {
                                                    i16 ^= 55449;
                                                    switch (i16) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (((((zM9582 ? 1 : 0) ^ '\uffff') & 1) | ((zM9582 ? 1 : 0) & '\ufffe')) != 0) {
                                                            }
                                                            break;
                                                        case 62:
                                                            break;
                                                        case 95:
                                                            break;
                                                        case 124:
                                                            packageManagerM8279 = C0421.m8279(C0287.m5540(mainViewModelM3511));
                                                            itM2089 = C0107.m2089(C0076.m1656(appConfig));
                                                            while (true) {
                                                                zM3327 = C0174.m3327(itM2089);
                                                                i24 = 55556;
                                                                while (true) {
                                                                    i24 ^= 55573;
                                                                    switch (i24) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (zM3327) {
                                                                            }
                                                                            break;
                                                                        case 54:
                                                                            break;
                                                                        case 87:
                                                                            break;
                                                                        case 116:
                                                                            String str2 = (String) C0413.m8115(itM2089);
                                                                            C0290.m5588(packageManagerM8279, str2, 0);
                                                                            C0227.m4382(C0078.m1684(mainViewModelM3511), str2);
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
                                                }
                                                zM8557 = C0438.m8557(appConfig);
                                                i17 = 55680;
                                                while (true) {
                                                    i17 ^= 55697;
                                                    switch (i17) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (zM8557) {
                                                            }
                                                            break;
                                                        case 1467:
                                                            break;
                                                        case 1496:
                                                            break;
                                                        case 1529:
                                                            C0227.m4382(C0019.m394(mainViewModelM3511), C0334.m6483());
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                zM6315 = C0326.m6315(mainViewModelM3511);
                                                i18 = 56455;
                                                while (true) {
                                                    i18 ^= 56472;
                                                    switch (i18) {
                                                        case 31:
                                                            if (!zM6315) {
                                                            }
                                                            break;
                                                        case 62:
                                                            break;
                                                        case 93:
                                                            break;
                                                        case 124:
                                                            zM3000 = C0157.m3000(appConfig);
                                                            i22 = 56579;
                                                            while (true) {
                                                                i22 ^= 56596;
                                                                switch (i22) {
                                                                    case 23:
                                                                        if (zM3000) {
                                                                        }
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 85:
                                                                        break;
                                                                    case 1564036:
                                                                        iM8182 = C0416.m8181(C0106.m2064(appConfig));
                                                                        i23 = 1507503;
                                                                        while (true) {
                                                                            i23 ^= 1507520;
                                                                            switch (i23) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    break;
                                                                                case 111:
                                                                                    if (iM8182 > 0) {
                                                                                    }
                                                                                    break;
                                                                                case 460:
                                                                                    C0227.m4382(C0365.m7171(mainViewModelM3511), C0106.m2064(appConfig));
                                                                                    C0227.m4382(C0045.m877(mainViewModelM3511), C0355.m6972(appConfig));
                                                                                    C0227.m4382(C0353.m6917(mainViewModelM3511), new Integer(C0105.m2044(appConfig)));
                                                                                    C0227.m4382(C0241.m4628(mainViewModelM3511), C0334.m6483());
                                                                                    mainViewModelM3511.I = true;
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
                                                zM6316 = C0326.m6315(mainViewModelM3511);
                                                i19 = 1507627;
                                                while (true) {
                                                    i19 ^= 1507644;
                                                    switch (i19) {
                                                        case 23:
                                                            if (!zM6316) {
                                                            }
                                                            break;
                                                        case 85:
                                                            break;
                                                        case 118:
                                                            break;
                                                        case 180:
                                                            zM8700 = C0446.m8700(appConfig);
                                                            i20 = 1507751;
                                                            while (true) {
                                                                i20 ^= 1507768;
                                                                switch (i20) {
                                                                    case 31:
                                                                        if (zM8700) {
                                                                        }
                                                                        break;
                                                                    case 1335:
                                                                        iM8181 = C0416.m8181(C0449.m8754(appConfig));
                                                                        i21 = 1508526;
                                                                        while (true) {
                                                                            i21 ^= 1508543;
                                                                            switch (i21) {
                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    if (iM8181 > 0) {
                                                                                    }
                                                                                    break;
                                                                                case 83:
                                                                                    break;
                                                                                case 114:
                                                                                    break;
                                                                                case 436:
                                                                                    C0227.m4382(C0207.m3965(mainViewModelM3511), C0449.m8754(appConfig));
                                                                                    C0227.m4382(C0059.m1130(mainViewModelM3511), C0334.m6483());
                                                                                    mainViewModelM3511.I = true;
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 1480:
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
                                            case 2025:
                                                C0214.m4091(new Handler(C0207.m3950()), new n(application, 1));
                                                int i40 = 52611;
                                                while (true) {
                                                    i40 ^= 52628;
                                                    switch (i40) {
                                                        case 23:
                                                            i40 = 52642;
                                                            continue;
                                                        case 54:
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
                                default:
                                    break;
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
            Throwable thM9416 = C0483.m9416(objM7093);
            int i41 = 1508650;
            while (true) {
                i41 ^= 1508667;
                switch (i41) {
                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i41 = thM9416 != null ? 1509394 : 1508712;
                        break;
                    case 83:
                        break;
                    case 114:
                        break;
                    case 3369:
                        Boolean boolM60412 = C0312.m6048();
                        C0335.m6501(boolM60412, strM406);
                        boolean zM17 = C0000.m14(boolM60412);
                        int i42 = 1509425;
                        while (true) {
                            i42 ^= 1509442;
                            switch (i42) {
                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    break;
                                case 115:
                                    i42 = zM17 ? 1509518 : 1509487;
                                    break;
                                case 204:
                                    C0214.m4091(new Handler(C0207.m3950()), new n(application, C0021.f41 ^ 974));
                                    int i43 = 1509549;
                                    while (true) {
                                        i43 ^= 1509566;
                                        switch (i43) {
                                            case 19:
                                                i43 = 1509580;
                                                continue;
                                            case 114:
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
                    default:
                        break;
                }
            }
        } catch (Exception e12) {
            applicationM6622 = application;
            Boolean boolM60413 = C0312.m6048();
            C0335.m6501(boolM60413, strM406);
            zM14 = C0000.m14(boolM60413);
            i11 = 1509673;
            while (true) {
                i11 ^= 1509690;
                switch (i11) {
                    case 19:
                        if (zM14) {
                        }
                        break;
                    case 712:
                        break;
                    case 745:
                        break;
                    case 1323:
                        C0214.m4091(new Handler(C0207.m3950()), new n(applicationM6622, C0029.f49 ^ (-484)));
                        break;
                    default:
                        break;
                }
            }
        }
        return lVarM238;
    }
}
