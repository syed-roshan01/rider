package f5;

import a2.C0004;
import a3.C0006;
import a7.C0008;
import aa.C0012;
import android.support.v4.app.C0014;
import android.support.v4.app.C0015;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.ui.graphics.C0032;
import androidx.compose.ui.input.pointer.C0034;
import androidx.fragment.app.C0042;
import c1.C0058;
import c1.C0061;
import c3.C0063;
import c4.C0065;
import c7.C0068;
import com.auto.accept.data.model.AppConfig;
import com.auto.accept.data.model.TransactionData;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.tasks.C0102;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.iid.C0170;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.ktx.C0179;
import com.google.firebase.measurement.C0184;
import com.google.firebase.messaging.C0191;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0212;
import d1.C0213;
import d5.C0219;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.components.C0245;
import dagger.hilt.internal.aggregatedroot.C0247;
import dagger.hilt.internal.generatesrootinput.C0251;
import e1.C0259;
import f4.C0275;
import h0.C0300;
import h6.C0310;
import h8.C0314;
import i5.C0319;
import j3.C0326;
import j9.C0330;
import java.util.Iterator;
import java.util.List;
import k3.C0335;
import k4.C0337;
import m4.C0354;
import m7.C0359;
import n.C0362;
import n7.C0364;
import n8.C0366;
import o5.C0371;
import o7.i2;
import p9.q0;
import q6.C0389;
import r2.C0398;
import r5.C0400;
import r6.C0402;
import s6.C0414;
import s7.C0416;
import s8.C0417;
import t2.C0421;
import t3.C0425;
import u1.C0432;
import v.C0440;
import v0.C0441;
import v6.C0447;
import w1.C0456;
import x4.C0470;
import x8.C0474;
import y.C0476;
import z.C0481;
import z1.C0484;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f404short = {1459, 1461, 1443, 1443, 1445, 1459, 1459, 3133, 3135, 3122, 3122, 3198, 3114, 3121, 3198, 3193, 3116, 3131, 3117, 3115, 3123, 3131, 3193, 3198, 3132, 3131, 3128, 3121, 3116, 3131, 3198, 3193, 3127, 3120, 3112, 3121, 3125, 3131, 3193, 3198, 3113, 3127, 3114, 3126, 3198, 3133, 3121, 3116, 3121, 3115, 3114, 3127, 3120, 3131, 2660, 2632, 2642, 2647, 2632, 2633, 2567, 2565, 1150, 1148, 1077, 1071, 1148, 1074, 1075, 1148, 1072, 1075, 1074, 1083, 1081, 1070, 1148, 1066, 1085, 1072, 1077, 1080, 1126, 1148, 3318, 3271, 3295, 3275, 3267, 3272, 3282, 3206, 3280, 3267, 3284, 3279, 3264, 3279, 3267, 3266, 3206, 3268, 3283, 3282, 3206, 3285, 3267, 3284, 3280, 3267, 3284, 3206, 3271, 3269, 3282, 3279, 3280, 3271, 3282, 3279, 3273, 3272, 3206, 3286, 3267, 3272, 3266, 3279, 3272, 3265, 3208, 3206, 3316, 3267, 3282, 3284, 3295, 3279, 3272, 3265, 3208, 3208, 3208, 1976, 1929, 1937, 1925, 1933, 1926, 1948, 1992, 1926, 1927, 1948, 1992, 1934, 1927, 1949, 1926, 1932, 1992, 1937, 1933, 1948, 1990, 1992, 1980, 1946, 1937, 1992, 1929, 1935, 1929, 1921, 1926, 1992, 1929, 1934, 1948, 1933, 1946, 1992, 1944, 1929, 1937, 1921, 1926, 1935, 1990, 2249, 2277, 2276, 2276, 2287, 2281, 2302, 2275, 2277, 2276, 2218, 2287, 2296, 2296, 2277, 2296, 2212, 2218, 2270, 2296, 2291, 2218, 2283, 2285, 2283, 2275, 2276, 2212};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f6263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6264f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f6265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6266o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f6267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final MainViewModel f6268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f6269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f6270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f6271t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f6272u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(boolean z10, MainViewModel mainViewModel, String str, int i10, String str2, String str3, u8.e eVar) {
        super(C0184.f208 ^ (-736), eVar);
        this.f6267p = z10;
        this.f6268q = mainViewModel;
        this.f6269r = str;
        this.f6270s = i10;
        this.f6271t = str2;
        this.f6272u = str3;
        int iM9354 = C0481.m9354();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9354 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0194.m3710("9q1W5yhXwo")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۥۤۦۨ, reason: contains not printable characters */
    public static short[] m5340() {
        int iM1940 = C0091.m1940();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1940 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f404short;
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
        String str = "۟ۥ۟";
        String strM8697 = null;
        String strM8591 = null;
        MainViewModel mainViewModelM306 = null;
        String strM6528 = null;
        boolean zM4794 = false;
        int iM3145 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746873:
                    zM4794 = C0251.m4794(this);
                    str = "ۣ۠ۡ";
                    break;
                case 1746880:
                    strM6528 = C0337.m6528(this);
                    str = "ۦۡۥ";
                    break;
                case 1747714:
                    mainViewModelM306 = C0015.m306(this);
                    str = "ۥۡۥ";
                    break;
                case 1747750:
                    this = new g0(zM4794, mainViewModelM306, strM8697, iM3145, strM6528, strM8591, eVar);
                    str = "ۢ۠۟";
                    break;
                case 1749601:
                    return this;
                case 1749823:
                    iM3145 = C0164.m3145(this);
                    str = "۟ۥۦ";
                    break;
                case 1752521:
                    strM8697 = C0447.m8697(this);
                    str = "ۢۧۤ";
                    break;
                default:
                    strM8591 = C0441.m8591(this);
                    str = "۠ۢۨ";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۡ۠ۧ";
        u8.e eVar = null;
        Object objM9220 = obj;
        q8.l lVarM238 = null;
        m9.d0 d0Var = null;
        u8.e eVarM821 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746942:
                    eVarM821 = C0042.m821(this, d0Var, eVar);
                    str = "ۡۧۨ";
                    break;
                case 1748866:
                    str = "ۤ۟ۡ";
                    this = (g0) eVarM821;
                    break;
                case 1749699:
                    str = "۟ۧۦ";
                    eVar = (u8.e) obj2;
                    break;
                case 1750660:
                    objM9220 = C0474.m9220(this, lVarM238);
                    str = "ۥۧۧ";
                    break;
                case 1751494:
                    str = "ۣۣۤ";
                    lVarM238 = C0012.m238();
                    break;
                case 1752709:
                    return objM9220;
                default:
                    str = "ۣۢۤ";
                    d0Var = (m9.d0) objM9220;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:444:0x0322 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x0676 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x067d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x0712 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x0678 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x0688 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x068c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:0x0692 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x06a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x0687 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x068e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x0688 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x06b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x0712 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x06b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x071d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x0723 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x0727 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x0723 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x071f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x0715 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x073d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x0735 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x0618 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x0647 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x066d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x0673 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x066f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x0646 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x0647 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:0x059e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x05a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x066a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x05a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x05e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:0x05eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x05ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:0x060d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:0x05eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x05e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x0609 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x05f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x0605 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x060f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x0615 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x0604 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x0611 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x0605 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:0x051f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:0x052d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:0x0528 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:570:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x058b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:0x0591 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:0x0595 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x0598 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x058a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x0591 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x058d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x04d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:0x04da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:0x06bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:0x04d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x050f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x0513 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:0x0519 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x051c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:0x050e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x0515 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:0x050f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x06c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x06ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x06d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x070f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x06c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x06cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x06c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:0x06e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x06e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x06ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x06fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:0x06e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:0x06e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:0x06e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:0x06f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:0x070c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:0x06f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x0396 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x039b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x043c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x0396 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x03a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x03aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:0x03b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x041a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x03ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x03a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:0x0406 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x041a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x03fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x0425 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x042b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:0x042f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:0x042b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x0427 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x041d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x0447 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:0x045d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:0x043f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x0481 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:0x0487 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x048b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x0480 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:0x0487 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:0x0483 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:0x0498 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:0x049d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:0x04c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:0x04cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:0x04d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:0x04c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:0x04ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:0x04c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:720:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:0x02b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:? A[LOOP:34: B:137:0x0258->B:730:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:0x02af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:0x02d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:0x02e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:0x031e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:0x045b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:0x031e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:0x031a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:790:0x033b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:0x0349 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:0x0359 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:0x0341 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:0x0333 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:800:0x0355 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:801:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:803:0x034d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:0x038a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:0x0391 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:0x0383 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:0x038a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:826:0x074c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:827:0x0752 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:828:0x0756 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:829:0x078f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:830:0x0752 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:831:0x074e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:833:0x0744 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:836:0x0778 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:837:0x078f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:839:0x0770 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:841:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:842:0x079a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:843:0x07a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:844:0x07a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:845:0x07a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:846:0x079c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:848:0x0792 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:851:0x072b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:852:0x07b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:854:0x07ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:866:0x0662 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:867:0x077c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:868:0x0783 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:869:0x078e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:870:0x0661 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:871:0x077e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:872:0x0662 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:882:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:883:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:884:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:885:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:886:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:891:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:892:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:893:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:179:0x02ee. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10;
        int i11;
        int i12;
        q0 q0VarM156;
        int i13;
        int i14;
        int i15;
        Object objM111;
        boolean z10;
        int i16;
        int iM3145;
        Iterator itM8318;
        boolean zM3327;
        int i17;
        Object objM8115;
        boolean zM4399;
        int i18;
        int i19;
        Object obj2;
        TransactionData transactionData;
        int i20;
        String strM8581;
        int i21;
        int iM8181;
        int i22;
        int iM1325;
        String str;
        long jM3863;
        int i23;
        boolean z11;
        Object objM5993;
        int i24;
        Object obj3;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        Object objM4491;
        int i31;
        int i32;
        Throwable thM9416;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        boolean zM6067;
        String strM5281;
        int i38;
        int i39;
        int iM8182;
        int i40;
        int i41;
        long jM9263;
        Object objM4230;
        int i42;
        String str2;
        boolean z12;
        int i43;
        Object objM7131;
        int i44;
        MainViewModel mainViewModel;
        Object objM8450;
        String strM8169;
        String strM2006;
        int iM8183;
        int i45;
        MainViewModel mainViewModel2;
        Object objM4492;
        v8.a aVarM5766;
        int i46;
        int i47;
        int i48;
        Object objM1165;
        int i49;
        int i50;
        int i51;
        Throwable thM9417;
        int i52;
        int i53;
        int i54;
        String strM7042 = C0359.m7042(m5340(), 0, C0371.f641 ^ 797, 1504);
        v8.a aVarM5767 = C0300.m5766();
        int iM1215 = C0063.m1215(this);
        q8.l lVarM238 = C0012.m238();
        String strM6528 = C0337.m6528(this);
        String strM8591 = C0441.m8591(this);
        String strM8697 = C0447.m8697(this);
        boolean zM4794 = C0251.m4794(this);
        MainViewModel mainViewModelM306 = C0015.m306(this);
        try {
            try {
                try {
                    try {
                        switch (iM1215) {
                            case 0:
                                C0330.m6365(obj);
                                int i55 = 50813;
                                while (true) {
                                    i55 ^= 50830;
                                    switch (i55) {
                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 53:
                                            break;
                                        case 243:
                                            i55 = !zM4794 ? 51557 : 50875;
                                            break;
                                        case 4075:
                                            C0228.m4382(C0008.m156(mainViewModelM306), C0335.m6483());
                                            C0228.m4382(C0151.m2902(mainViewModelM306), null);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                a5.z zVarM7827 = C0400.m7827(mainViewModelM306);
                                this.f6266o = 1;
                                objM111 = C0006.m111(zVarM7827, strM8697, this);
                                int i56 = 51588;
                                while (true) {
                                    i56 ^= 51605;
                                    switch (i56) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i56 = objM111 == aVarM5767 ? 51681 : 51650;
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            break;
                                        case 116:
                                            return aVarM5767;
                                        default:
                                            break;
                                    }
                                }
                                z10 = objM111 instanceof q8.g;
                                i16 = 51712;
                                while (true) {
                                    i16 ^= 51729;
                                    switch (i16) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i16 = ((((z10 ? 1 : 0) ^ 65535) & 1) | ((z10 ? 1 : 0) & 65534)) != 0 ? 51805 : 51774;
                                            break;
                                        case 47:
                                            break;
                                        case 76:
                                            C0228.m4382(C0354.m6932(mainViewModelM306), (List) objM111);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                iM3145 = C0164.m3145(this);
                                itM8318 = C0425.m8318((Iterable) C0247.m4716(C0354.m6932(mainViewModelM306)));
                                while (true) {
                                    zM3327 = C0174.m3327(itM8318);
                                    i17 = 51836;
                                    while (true) {
                                        i17 ^= 51853;
                                        switch (i17) {
                                            case 241:
                                                i17 = zM3327 ? 52580 : 52549;
                                                break;
                                            case 1963:
                                                break;
                                            case 1992:
                                                obj2 = null;
                                                break;
                                            case 2025:
                                                objM8115 = C0414.m8115(itM8318);
                                                zM4399 = C0229.m4399(C0245.m4692((TransactionData) objM8115), strM8591);
                                                i18 = 52611;
                                                while (true) {
                                                    i18 ^= 52628;
                                                    switch (i18) {
                                                        case 23:
                                                            i18 = zM4399 ? 52704 : 52673;
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 85:
                                                            break;
                                                        case 116:
                                                            i19 = 52735;
                                                            while (true) {
                                                                i19 ^= 52752;
                                                                switch (i19) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        obj2 = objM8115;
                                                                        break;
                                                                    case 1007:
                                                                        i19 = 52766;
                                                                        continue;
                                                                        continue;
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
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                }
                                transactionData = (TransactionData) obj2;
                                i20 = 53510;
                                while (true) {
                                    i20 ^= 53527;
                                    switch (i20) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i20 = transactionData != null ? 53603 : 53572;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 83:
                                            strM8581 = C0440.m8581();
                                            i26 = 54657;
                                            while (true) {
                                                i26 ^= 54674;
                                                switch (i26) {
                                                    case 19:
                                                        i26 = 54688;
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
                                        case 116:
                                            strM8581 = C0481.m9358(transactionData);
                                            i27 = 53634;
                                            while (true) {
                                                i27 ^= 53651;
                                                switch (i27) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i27 = strM8581 == null ? 53727 : 53696;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        i28 = 53758;
                                                        while (true) {
                                                            i28 ^= 53775;
                                                            switch (i28) {
                                                                case 1009:
                                                                    i28 = 54440;
                                                                    continue;
                                                                    continue;
                                                                case 1703:
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                            }
                                                            strM8581 = C0440.m8581();
                                                            i26 = 54657;
                                                            while (true) {
                                                                i26 ^= 54674;
                                                                switch (i26) {
                                                                    case 19:
                                                                        i26 = 54688;
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
                                                        }
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
                                    i21 = 54533;
                                    while (true) {
                                        i21 ^= 54550;
                                        switch (i21) {
                                            case 19:
                                                i21 = 54564;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            default:
                                                break;
                                        }
                                        iM8181 = C0417.m8181(strM8581);
                                        i22 = 55432;
                                        while (true) {
                                            i22 ^= 55449;
                                            switch (i22) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i22 = iM8181 > 0 ? 55525 : 55494;
                                                    break;
                                                case 62:
                                                    break;
                                                case 95:
                                                    iM1325 = iM3145;
                                                    str = strM8581;
                                                    String strM6161 = C0319.m6161((AppConfig) C0470.m9145(C0022.m429(C0421.m8257(mainViewModelM306))));
                                                    C0034.m673();
                                                    String strM8592 = C0441.m8591(this);
                                                    i29 = 1509549;
                                                    while (true) {
                                                        i29 ^= 1509566;
                                                        switch (i29) {
                                                            case 19:
                                                                i29 = zM4794 ? 1509642 : 1509611;
                                                                break;
                                                            case 85:
                                                                i30 = 3;
                                                                break;
                                                            case 114:
                                                                break;
                                                            case 436:
                                                                i30 = 24;
                                                                i32 = 1509673;
                                                                while (true) {
                                                                    i32 ^= 1509690;
                                                                    switch (i32) {
                                                                        case 19:
                                                                            i32 = 1510355;
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
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    f0 f0Var = new f0(mainViewModelM306, zM4794);
                                                    this.f6260b = str;
                                                    this.f6266o = 3;
                                                    objM4491 = C0234.m4491(C0179.m3411(), new a5.d0(i30, iM1325, strM6161, strM8592, null, f0Var), this);
                                                    i31 = 1510448;
                                                    while (true) {
                                                        i31 ^= 1510465;
                                                        switch (i31) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case 47:
                                                                break;
                                                            case 113:
                                                                i31 = objM4491 == aVarM5767 ? 1510541 : 1510510;
                                                                break;
                                                            case 204:
                                                                return aVarM5767;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    a5.b0 b0Var = (a5.b0) objM4491;
                                                    zM6067 = C0314.m6067(b0Var);
                                                    strM5281 = C0275.m5281(b0Var);
                                                    i38 = 1510572;
                                                    while (true) {
                                                        i38 ^= 1510589;
                                                        switch (i38) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i38 = zM6067 ? 1511316 : 1510634;
                                                                break;
                                                            case 87:
                                                                i39 = 1516214;
                                                                while (true) {
                                                                    i39 ^= 1516231;
                                                                    switch (i39) {
                                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case 51:
                                                                            break;
                                                                        case 113:
                                                                            i39 = !zM4794 ? 1516307 : 1516276;
                                                                            break;
                                                                        case 468:
                                                                            q0 q0VarM2902 = C0151.m2902(mainViewModelM306);
                                                                            iM8182 = C0417.m8181(strM5281);
                                                                            i40 = 1516338;
                                                                            while (true) {
                                                                                i40 ^= 1516355;
                                                                                switch (i40) {
                                                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case 51:
                                                                                        strM5281 = C0245.m4690(m5340(), 143, C0228.f307 ^ (-930), 2024);
                                                                                        break;
                                                                                    case 113:
                                                                                        i40 = iM8182 > 0 ? 1537263 : 1516400;
                                                                                        break;
                                                                                    case 22444:
                                                                                        i41 = 1537294;
                                                                                        while (true) {
                                                                                            i41 ^= 1537311;
                                                                                            switch (i41) {
                                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i41 = 1537325;
                                                                                                    continue;
                                                                                                    continue;
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
                                                                                                    continue;
                                                                                                    continue;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            C0228.m4382(q0VarM2902, strM5281);
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0366.m7173(mainViewModelM306);
                                                                i51 = 1537418;
                                                                while (true) {
                                                                    i51 ^= 1537435;
                                                                    switch (i51) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i51 = !zM4794 ? 1537511 : 1537480;
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 83:
                                                                            return lVarM238;
                                                                        case 124:
                                                                            q0VarM156 = C0008.m156(mainViewModelM306);
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0228.m4382(q0VarM156, C0456.m8876());
                                                                i15 = 1537542;
                                                                while (true) {
                                                                    i15 ^= 1537559;
                                                                    switch (i15) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i15 = 1538224;
                                                                            break;
                                                                        case 3751:
                                                                            return lVarM238;
                                                                    }
                                                                }
                                                                break;
                                                            case 118:
                                                                break;
                                                            case 809:
                                                                C0014.m280(mainViewModelM306);
                                                                jM9263 = C0476.m9263(strM6528);
                                                                a5.z zVarM7828 = C0400.m7827(mainViewModelM306);
                                                                String strM8698 = C0447.m8697(this);
                                                                String strM6529 = C0337.m6528(this);
                                                                String strM8593 = C0441.m8591(this);
                                                                this.f6260b = str;
                                                                this.f6265n = jM9263;
                                                                this.f6266o = 4;
                                                                objM4230 = C0219.m4230(zVarM7828, strM8698, strM6529, jM9263, strM8593, this);
                                                                i42 = 1511347;
                                                                while (true) {
                                                                    i42 ^= 1511364;
                                                                    switch (i42) {
                                                                        case 22:
                                                                            break;
                                                                        case 53:
                                                                            str2 = str;
                                                                            break;
                                                                        case 119:
                                                                            i42 = objM4230 == aVarM5767 ? 1511440 : 1511409;
                                                                            break;
                                                                        case 8148:
                                                                            return aVarM5767;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                z12 = objM4230 instanceof q8.g;
                                                                i43 = 1511471;
                                                                while (true) {
                                                                    i43 ^= 1511488;
                                                                    switch (i43) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            thM9417 = C0484.m9416(objM4230);
                                                                            i52 = 1515191;
                                                                            while (true) {
                                                                                i52 ^= 1515208;
                                                                                switch (i52) {
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                        break;
                                                                                    case 61:
                                                                                        break;
                                                                                    case 127:
                                                                                        i52 = thM9417 != null ? 1515284 : 1515253;
                                                                                        break;
                                                                                    case 476:
                                                                                        i53 = 1515315;
                                                                                        while (true) {
                                                                                            i53 ^= 1515332;
                                                                                            switch (i53) {
                                                                                                case 22:
                                                                                                    break;
                                                                                                case 53:
                                                                                                    break;
                                                                                                case 119:
                                                                                                    i53 = !zM4794 ? 1515408 : 1515377;
                                                                                                    break;
                                                                                                case 212:
                                                                                                    C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        C0366.m7173(mainViewModelM306);
                                                                                        i54 = 1515439;
                                                                                        while (true) {
                                                                                            i54 ^= 1515456;
                                                                                            switch (i54) {
                                                                                                case 111:
                                                                                                    i54 = 1516121;
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
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                case 15769:
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
                                                                            i51 = 1537418;
                                                                            while (true) {
                                                                                i51 ^= 1537435;
                                                                                switch (i51) {
                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        if (!zM4794) {
                                                                                        }
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        break;
                                                                                    case 83:
                                                                                        return lVarM238;
                                                                                    case 124:
                                                                                        q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            C0228.m4382(q0VarM156, C0456.m8876());
                                                                            i15 = 1537542;
                                                                            while (true) {
                                                                                i15 ^= 1537559;
                                                                                switch (i15) {
                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i15 = 1538224;
                                                                                        break;
                                                                                    case 3751:
                                                                                        return lVarM238;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 111:
                                                                            i43 = ((((z12 ? 1 : 0) ^ 65535) & 1) | ((z12 ? 1 : 0) & 65534)) != 0 ? 1511564 : 1511533;
                                                                            break;
                                                                        case 204:
                                                                            C0228.m4382(C0107.m2079(mainViewModelM306), C0335.m6483());
                                                                            C0228.m4382(C0116.m2242(mainViewModelM306), strM6528);
                                                                            C0122.m2359(mainViewModelM306, jM9263 - (0 - C0402.m7869()));
                                                                            C0228.m4382(C0151.m2902(mainViewModelM306), strM7042);
                                                                            a5.z zVarM7829 = C0400.m7827(mainViewModelM306);
                                                                            this.f6260b = str2;
                                                                            this.f6261c = objM4230;
                                                                            this.f6262d = mainViewModelM306;
                                                                            this.f6263e = strM8591;
                                                                            this.f6264f = strM8697;
                                                                            this.f6266o = 5;
                                                                            objM7131 = C0364.m7131(zVarM7829, strM8591, strM7042, this);
                                                                            i44 = 1511595;
                                                                            while (true) {
                                                                                i44 ^= 1511612;
                                                                                switch (i44) {
                                                                                    case 23:
                                                                                        i44 = objM7131 == aVarM5767 ? 1512339 : 1512308;
                                                                                        break;
                                                                                    case 815:
                                                                                        return aVarM5767;
                                                                                    case 968:
                                                                                        mainViewModel = mainViewModelM306;
                                                                                        objM8450 = objM4230;
                                                                                        strM8169 = strM8697;
                                                                                        strM2006 = strM8591;
                                                                                        break;
                                                                                    case 1001:
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            iM8183 = C0417.m8181(str2);
                                                                            i45 = 1512370;
                                                                            while (true) {
                                                                                i45 ^= 1512387;
                                                                                switch (i45) {
                                                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case 51:
                                                                                        objM4230 = objM8450;
                                                                                        mainViewModel2 = mainViewModel;
                                                                                        this.f6260b = objM4230;
                                                                                        this.f6261c = mainViewModel2;
                                                                                        this.f6262d = null;
                                                                                        this.f6263e = null;
                                                                                        this.f6264f = null;
                                                                                        this.f6266o = 7;
                                                                                        objM1165 = C0061.m1165(mainViewModel2, strM8169, strM2006, this);
                                                                                        i49 = 1514416;
                                                                                        while (true) {
                                                                                            i49 ^= 1514433;
                                                                                            switch (i49) {
                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                    break;
                                                                                                case 47:
                                                                                                    break;
                                                                                                case 113:
                                                                                                    i49 = objM1165 == aVarM5767 ? 1515160 : 1514478;
                                                                                                    break;
                                                                                                case 1369:
                                                                                                    return aVarM5767;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        C0366.m7173(mainViewModel2);
                                                                                        thM9417 = C0484.m9416(objM4230);
                                                                                        i52 = 1515191;
                                                                                        while (true) {
                                                                                            i52 ^= 1515208;
                                                                                            switch (i52) {
                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                                    break;
                                                                                                case 61:
                                                                                                    break;
                                                                                                case 127:
                                                                                                    if (thM9417 != null) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 476:
                                                                                                    i53 = 1515315;
                                                                                                    while (true) {
                                                                                                        i53 ^= 1515332;
                                                                                                        switch (i53) {
                                                                                                            case 22:
                                                                                                                break;
                                                                                                            case 53:
                                                                                                                break;
                                                                                                            case 119:
                                                                                                                if (!zM4794) {
                                                                                                                }
                                                                                                                break;
                                                                                                            case 212:
                                                                                                                C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    C0366.m7173(mainViewModelM306);
                                                                                                    i54 = 1515439;
                                                                                                    while (true) {
                                                                                                        i54 ^= 1515456;
                                                                                                        switch (i54) {
                                                                                                            case 111:
                                                                                                                i54 = 1516121;
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
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                            case 15769:
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
                                                                                        i51 = 1537418;
                                                                                        while (true) {
                                                                                            i51 ^= 1537435;
                                                                                            switch (i51) {
                                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    if (!zM4794) {
                                                                                                    }
                                                                                                    break;
                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                    break;
                                                                                                case 83:
                                                                                                    return lVarM238;
                                                                                                case 124:
                                                                                                    q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        C0228.m4382(q0VarM156, C0456.m8876());
                                                                                        i15 = 1537542;
                                                                                        while (true) {
                                                                                            i15 ^= 1537559;
                                                                                            switch (i15) {
                                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i15 = 1538224;
                                                                                                    break;
                                                                                                case 3751:
                                                                                                    return lVarM238;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 113:
                                                                                        i45 = iM8183 > 0 ? 1512463 : 1512432;
                                                                                        break;
                                                                                    case 1996:
                                                                                        a4.q qVarM3089 = C0161.m3089(mainViewModel);
                                                                                        this.f6260b = objM8450;
                                                                                        this.f6261c = mainViewModel;
                                                                                        this.f6262d = strM2006;
                                                                                        this.f6263e = strM8169;
                                                                                        this.f6264f = null;
                                                                                        this.f6266o = 6;
                                                                                        C0014.m280(qVarM3089);
                                                                                        objM4492 = C0234.m4491(C0179.m3411(), new a5.a(qVarM3089, str2, null), this);
                                                                                        aVarM5766 = C0300.m5766();
                                                                                        i46 = 1512494;
                                                                                        while (true) {
                                                                                            i46 ^= 1512511;
                                                                                            switch (i46) {
                                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i46 = objM4492 == aVarM5766 ? 1513238 : 1512556;
                                                                                                    break;
                                                                                                case 83:
                                                                                                    objM4492 = lVarM238;
                                                                                                    break;
                                                                                                case 114:
                                                                                                    break;
                                                                                                case 809:
                                                                                                    i48 = 1513269;
                                                                                                    while (true) {
                                                                                                        i48 ^= 1513286;
                                                                                                        switch (i48) {
                                                                                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                break;
                                                                                                            case 115:
                                                                                                                i48 = 1513300;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                            default:
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
                                                                                        i47 = 1513393;
                                                                                        while (true) {
                                                                                            i47 ^= 1513410;
                                                                                            switch (i47) {
                                                                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                    break;
                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                    break;
                                                                                                case 115:
                                                                                                    i47 = objM4492 == aVarM5767 ? 1513486 : 1513455;
                                                                                                    break;
                                                                                                case 4044:
                                                                                                    return aVarM5767;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        C0228.m4382(C0191.m3645(mainViewModel), null);
                                                                                        i50 = 1513517;
                                                                                        while (true) {
                                                                                            i50 ^= 1513534;
                                                                                            switch (i50) {
                                                                                                case 19:
                                                                                                    i50 = 1514199;
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
                                                                                                    objM4230 = objM8450;
                                                                                                    mainViewModel2 = mainViewModel;
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
                                                                                            }
                                                                                            this.f6260b = objM4230;
                                                                                            this.f6261c = mainViewModel2;
                                                                                            this.f6262d = null;
                                                                                            this.f6263e = null;
                                                                                            this.f6264f = null;
                                                                                            this.f6266o = 7;
                                                                                            objM1165 = C0061.m1165(mainViewModel2, strM8169, strM2006, this);
                                                                                            i49 = 1514416;
                                                                                            while (true) {
                                                                                                i49 ^= 1514433;
                                                                                                switch (i49) {
                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                        break;
                                                                                                    case 47:
                                                                                                        break;
                                                                                                    case 113:
                                                                                                        if (objM1165 == aVarM5767) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 1369:
                                                                                                        return aVarM5767;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            C0366.m7173(mainViewModel2);
                                                                                            thM9417 = C0484.m9416(objM4230);
                                                                                            i52 = 1515191;
                                                                                            while (true) {
                                                                                                i52 ^= 1515208;
                                                                                                switch (i52) {
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                                        break;
                                                                                                    case 61:
                                                                                                        break;
                                                                                                    case 127:
                                                                                                        if (thM9417 != null) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 476:
                                                                                                        i53 = 1515315;
                                                                                                        while (true) {
                                                                                                            i53 ^= 1515332;
                                                                                                            switch (i53) {
                                                                                                                case 22:
                                                                                                                    break;
                                                                                                                case 53:
                                                                                                                    break;
                                                                                                                case 119:
                                                                                                                    if (!zM4794) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 212:
                                                                                                                    C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        C0366.m7173(mainViewModelM306);
                                                                                                        i54 = 1515439;
                                                                                                        while (true) {
                                                                                                            i54 ^= 1515456;
                                                                                                            switch (i54) {
                                                                                                                case 111:
                                                                                                                    i54 = 1516121;
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
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                case 15769:
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
                                                                                            i51 = 1537418;
                                                                                            while (true) {
                                                                                                i51 ^= 1537435;
                                                                                                switch (i51) {
                                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        if (!zM4794) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                        break;
                                                                                                    case 83:
                                                                                                        return lVarM238;
                                                                                                    case 124:
                                                                                                        q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            C0228.m4382(q0VarM156, C0456.m8876());
                                                                                            i15 = 1537542;
                                                                                            while (true) {
                                                                                                i15 ^= 1537559;
                                                                                                switch (i15) {
                                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        i15 = 1538224;
                                                                                                        break;
                                                                                                    case 3751:
                                                                                                        return lVarM238;
                                                                                                }
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
                                                    break;
                                                case 124:
                                                    try {
                                                        jM3863 = C0201.m3863((Number) C0247.m4716(C0200.m3835(mainViewModelM306)));
                                                        i23 = 55556;
                                                        while (true) {
                                                            i23 ^= 55573;
                                                            switch (i23) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i23 = jM3863 == 0 ? 55649 : 55618;
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 87:
                                                                    z11 = false;
                                                                    break;
                                                                case 116:
                                                                    z11 = true;
                                                                    i25 = 55680;
                                                                    while (true) {
                                                                        i25 ^= 55697;
                                                                        switch (i25) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i25 = 56362;
                                                                                continue;
                                                                                continue;
                                                                            case 1467:
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
                                                        a4.q qVarM30810 = C0161.m3089(mainViewModelM306);
                                                        String strM65210 = C0337.m6528(this);
                                                        String strM8699 = C0447.m8697(this);
                                                        this.f6260b = strM8581;
                                                        this.f6259a = iM3145;
                                                        this.f6266o = 2;
                                                        try {
                                                            objM5993 = C0310.m5993(qVarM30810, strM8581, strM65210, strM8699, z11, this);
                                                            i24 = 56455;
                                                            while (true) {
                                                                i24 ^= 56472;
                                                                switch (i24) {
                                                                    case 31:
                                                                        i24 = objM5993 == aVarM5767 ? 56548 : 56517;
                                                                        break;
                                                                    case 62:
                                                                        break;
                                                                    case 93:
                                                                        obj3 = objM5993;
                                                                        iM1325 = iM3145;
                                                                        str = strM8581;
                                                                        break;
                                                                    case 124:
                                                                        return aVarM5767;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            thM9416 = C0484.m9416(obj3);
                                                            i33 = 56579;
                                                            while (true) {
                                                                i33 ^= 56596;
                                                                switch (i33) {
                                                                    case 23:
                                                                        i33 = thM9416 != null ? 1507472 : 56641;
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 85:
                                                                        i34 = 1508650;
                                                                        while (true) {
                                                                            i34 ^= 1508667;
                                                                            switch (i34) {
                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i34 = 1508681;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case 114:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 1564036:
                                                                        i35 = 1507503;
                                                                        while (true) {
                                                                            i35 ^= 1507520;
                                                                            switch (i35) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    break;
                                                                                case 111:
                                                                                    i35 = !zM4794 ? 1507596 : 1507565;
                                                                                    break;
                                                                                case 460:
                                                                                    q0 q0VarM2903 = C0151.m2902(mainViewModelM306);
                                                                                    String strM4049 = C0213.m4049(thM9416);
                                                                                    StringBuilder sb = new StringBuilder();
                                                                                    C0142.m2728(sb, C0212.m4036(m5340(), 54, C0065.f85 ^ 660, 2599));
                                                                                    C0142.m2728(sb, str);
                                                                                    C0142.m2728(sb, C0087.m1850(m5340(), 62, C0004.f1062 ^ (-202), 1116));
                                                                                    C0142.m2728(sb, strM4049);
                                                                                    C0228.m4382(q0VarM2903, C0441.m8605(sb));
                                                                                    C0228.m4382(C0008.m156(mainViewModelM306), C0456.m8876());
                                                                                    i37 = 1507627;
                                                                                    while (true) {
                                                                                        i37 ^= 1507644;
                                                                                        switch (i37) {
                                                                                            case 23:
                                                                                                i37 = 1507658;
                                                                                                break;
                                                                                            case 118:
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
                                                                        i36 = 1508526;
                                                                        while (true) {
                                                                            i36 ^= 1508543;
                                                                            switch (i36) {
                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    if (!zM4794) {
                                                                                        i36 = 1508619;
                                                                                    }
                                                                                    break;
                                                                                case 83:
                                                                                    return lVarM238;
                                                                                case 114:
                                                                                    break;
                                                                                case 436:
                                                                                    C0228.m4382(C0008.m156(mainViewModelM306), C0456.m8876());
                                                                                    return lVarM238;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                            i36 = 1508588;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            String strM6162 = C0319.m6161((AppConfig) C0470.m9145(C0022.m429(C0421.m8257(mainViewModelM306))));
                                                            C0034.m673();
                                                            String strM8594 = C0441.m8591(this);
                                                            i29 = 1509549;
                                                            while (true) {
                                                                i29 ^= 1509566;
                                                                switch (i29) {
                                                                    case 19:
                                                                        if (zM4794) {
                                                                        }
                                                                        break;
                                                                    case 85:
                                                                        i30 = 3;
                                                                        break;
                                                                    case 114:
                                                                        break;
                                                                    case 436:
                                                                        i30 = 24;
                                                                        i32 = 1509673;
                                                                        while (true) {
                                                                            i32 ^= 1509690;
                                                                            switch (i32) {
                                                                                case 19:
                                                                                    i32 = 1510355;
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
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            f0 f0Var2 = new f0(mainViewModelM306, zM4794);
                                                            this.f6260b = str;
                                                            this.f6266o = 3;
                                                            objM4491 = C0234.m4491(C0179.m3411(), new a5.d0(i30, iM1325, strM6162, strM8594, null, f0Var2), this);
                                                            i31 = 1510448;
                                                            while (true) {
                                                                i31 ^= 1510465;
                                                                switch (i31) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case 47:
                                                                        break;
                                                                    case 113:
                                                                        if (objM4491 == aVarM5767) {
                                                                        }
                                                                        break;
                                                                    case 204:
                                                                        return aVarM5767;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            a5.b0 b0Var2 = (a5.b0) objM4491;
                                                            zM6067 = C0314.m6067(b0Var2);
                                                            strM5281 = C0275.m5281(b0Var2);
                                                            i38 = 1510572;
                                                            while (true) {
                                                                i38 ^= 1510589;
                                                                switch (i38) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (zM6067) {
                                                                        }
                                                                        break;
                                                                    case 87:
                                                                        i39 = 1516214;
                                                                        while (true) {
                                                                            i39 ^= 1516231;
                                                                            switch (i39) {
                                                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case 51:
                                                                                    break;
                                                                                case 113:
                                                                                    if (!zM4794) {
                                                                                    }
                                                                                    break;
                                                                                case 468:
                                                                                    q0 q0VarM2904 = C0151.m2902(mainViewModelM306);
                                                                                    iM8182 = C0417.m8181(strM5281);
                                                                                    i40 = 1516338;
                                                                                    while (true) {
                                                                                        i40 ^= 1516355;
                                                                                        switch (i40) {
                                                                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                break;
                                                                                            case 51:
                                                                                                strM5281 = C0245.m4690(m5340(), 143, C0228.f307 ^ (-930), 2024);
                                                                                                break;
                                                                                            case 113:
                                                                                                if (iM8182 > 0) {
                                                                                                }
                                                                                                break;
                                                                                            case 22444:
                                                                                                i41 = 1537294;
                                                                                                while (true) {
                                                                                                    i41 ^= 1537311;
                                                                                                    switch (i41) {
                                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i41 = 1537325;
                                                                                                            continue;
                                                                                                            continue;
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
                                                                                                            continue;
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    C0228.m4382(q0VarM2904, strM5281);
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0366.m7173(mainViewModelM306);
                                                                        i51 = 1537418;
                                                                        while (true) {
                                                                            i51 ^= 1537435;
                                                                            switch (i51) {
                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    if (!zM4794) {
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                case 83:
                                                                                    return lVarM238;
                                                                                case 124:
                                                                                    q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0228.m4382(q0VarM156, C0456.m8876());
                                                                        i15 = 1537542;
                                                                        while (true) {
                                                                            i15 ^= 1537559;
                                                                            switch (i15) {
                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i15 = 1538224;
                                                                                    break;
                                                                                case 3751:
                                                                                    return lVarM238;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 118:
                                                                        break;
                                                                    case 809:
                                                                        C0014.m280(mainViewModelM306);
                                                                        jM9263 = C0476.m9263(strM6528);
                                                                        a5.z zVarM78210 = C0400.m7827(mainViewModelM306);
                                                                        String strM86910 = C0447.m8697(this);
                                                                        String strM65211 = C0337.m6528(this);
                                                                        String strM8595 = C0441.m8591(this);
                                                                        this.f6260b = str;
                                                                        this.f6265n = jM9263;
                                                                        this.f6266o = 4;
                                                                        objM4230 = C0219.m4230(zVarM78210, strM86910, strM65211, jM9263, strM8595, this);
                                                                        i42 = 1511347;
                                                                        while (true) {
                                                                            i42 ^= 1511364;
                                                                            switch (i42) {
                                                                                case 22:
                                                                                    break;
                                                                                case 53:
                                                                                    str2 = str;
                                                                                    break;
                                                                                case 119:
                                                                                    if (objM4230 == aVarM5767) {
                                                                                    }
                                                                                    break;
                                                                                case 8148:
                                                                                    return aVarM5767;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        z12 = objM4230 instanceof q8.g;
                                                                        i43 = 1511471;
                                                                        while (true) {
                                                                            i43 ^= 1511488;
                                                                            switch (i43) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    thM9417 = C0484.m9416(objM4230);
                                                                                    i52 = 1515191;
                                                                                    while (true) {
                                                                                        i52 ^= 1515208;
                                                                                        switch (i52) {
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                                break;
                                                                                            case 61:
                                                                                                break;
                                                                                            case 127:
                                                                                                if (thM9417 != null) {
                                                                                                }
                                                                                                break;
                                                                                            case 476:
                                                                                                i53 = 1515315;
                                                                                                while (true) {
                                                                                                    i53 ^= 1515332;
                                                                                                    switch (i53) {
                                                                                                        case 22:
                                                                                                            break;
                                                                                                        case 53:
                                                                                                            break;
                                                                                                        case 119:
                                                                                                            if (!zM4794) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 212:
                                                                                                            C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                C0366.m7173(mainViewModelM306);
                                                                                                i54 = 1515439;
                                                                                                while (true) {
                                                                                                    i54 ^= 1515456;
                                                                                                    switch (i54) {
                                                                                                        case 111:
                                                                                                            i54 = 1516121;
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
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                        case 15769:
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
                                                                                    i51 = 1537418;
                                                                                    while (true) {
                                                                                        i51 ^= 1537435;
                                                                                        switch (i51) {
                                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                if (!zM4794) {
                                                                                                }
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                break;
                                                                                            case 83:
                                                                                                return lVarM238;
                                                                                            case 124:
                                                                                                q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    C0228.m4382(q0VarM156, C0456.m8876());
                                                                                    i15 = 1537542;
                                                                                    while (true) {
                                                                                        i15 ^= 1537559;
                                                                                        switch (i15) {
                                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                i15 = 1538224;
                                                                                                break;
                                                                                            case 3751:
                                                                                                return lVarM238;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 111:
                                                                                    if (((((z12 ? 1 : 0) ^ 65535) & 1) | ((z12 ? 1 : 0) & 65534)) != 0) {
                                                                                    }
                                                                                    break;
                                                                                case 204:
                                                                                    C0228.m4382(C0107.m2079(mainViewModelM306), C0335.m6483());
                                                                                    C0228.m4382(C0116.m2242(mainViewModelM306), strM6528);
                                                                                    C0122.m2359(mainViewModelM306, jM9263 - (0 - C0402.m7869()));
                                                                                    C0228.m4382(C0151.m2902(mainViewModelM306), strM7042);
                                                                                    a5.z zVarM78211 = C0400.m7827(mainViewModelM306);
                                                                                    this.f6260b = str2;
                                                                                    this.f6261c = objM4230;
                                                                                    this.f6262d = mainViewModelM306;
                                                                                    this.f6263e = strM8591;
                                                                                    this.f6264f = strM8697;
                                                                                    this.f6266o = 5;
                                                                                    objM7131 = C0364.m7131(zVarM78211, strM8591, strM7042, this);
                                                                                    i44 = 1511595;
                                                                                    while (true) {
                                                                                        i44 ^= 1511612;
                                                                                        switch (i44) {
                                                                                            case 23:
                                                                                                if (objM7131 == aVarM5767) {
                                                                                                }
                                                                                                break;
                                                                                            case 815:
                                                                                                return aVarM5767;
                                                                                            case 968:
                                                                                                mainViewModel = mainViewModelM306;
                                                                                                objM8450 = objM4230;
                                                                                                strM8169 = strM8697;
                                                                                                strM2006 = strM8591;
                                                                                                break;
                                                                                            case 1001:
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    iM8183 = C0417.m8181(str2);
                                                                                    i45 = 1512370;
                                                                                    while (true) {
                                                                                        i45 ^= 1512387;
                                                                                        switch (i45) {
                                                                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                break;
                                                                                            case 51:
                                                                                                objM4230 = objM8450;
                                                                                                mainViewModel2 = mainViewModel;
                                                                                                this.f6260b = objM4230;
                                                                                                this.f6261c = mainViewModel2;
                                                                                                this.f6262d = null;
                                                                                                this.f6263e = null;
                                                                                                this.f6264f = null;
                                                                                                this.f6266o = 7;
                                                                                                objM1165 = C0061.m1165(mainViewModel2, strM8169, strM2006, this);
                                                                                                i49 = 1514416;
                                                                                                while (true) {
                                                                                                    i49 ^= 1514433;
                                                                                                    switch (i49) {
                                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                                            break;
                                                                                                        case 47:
                                                                                                            break;
                                                                                                        case 113:
                                                                                                            if (objM1165 == aVarM5767) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 1369:
                                                                                                            return aVarM5767;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                C0366.m7173(mainViewModel2);
                                                                                                thM9417 = C0484.m9416(objM4230);
                                                                                                i52 = 1515191;
                                                                                                while (true) {
                                                                                                    i52 ^= 1515208;
                                                                                                    switch (i52) {
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                                            break;
                                                                                                        case 61:
                                                                                                            break;
                                                                                                        case 127:
                                                                                                            if (thM9417 != null) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 476:
                                                                                                            i53 = 1515315;
                                                                                                            while (true) {
                                                                                                                i53 ^= 1515332;
                                                                                                                switch (i53) {
                                                                                                                    case 22:
                                                                                                                        break;
                                                                                                                    case 53:
                                                                                                                        break;
                                                                                                                    case 119:
                                                                                                                        if (!zM4794) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 212:
                                                                                                                        C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                            C0366.m7173(mainViewModelM306);
                                                                                                            i54 = 1515439;
                                                                                                            while (true) {
                                                                                                                i54 ^= 1515456;
                                                                                                                switch (i54) {
                                                                                                                    case 111:
                                                                                                                        i54 = 1516121;
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
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                    case 15769:
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
                                                                                                i51 = 1537418;
                                                                                                while (true) {
                                                                                                    i51 ^= 1537435;
                                                                                                    switch (i51) {
                                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            if (!zM4794) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                            break;
                                                                                                        case 83:
                                                                                                            return lVarM238;
                                                                                                        case 124:
                                                                                                            q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                C0228.m4382(q0VarM156, C0456.m8876());
                                                                                                i15 = 1537542;
                                                                                                while (true) {
                                                                                                    i15 ^= 1537559;
                                                                                                    switch (i15) {
                                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i15 = 1538224;
                                                                                                            break;
                                                                                                        case 3751:
                                                                                                            return lVarM238;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 113:
                                                                                                if (iM8183 > 0) {
                                                                                                }
                                                                                                break;
                                                                                            case 1996:
                                                                                                a4.q qVarM30811 = C0161.m3089(mainViewModel);
                                                                                                this.f6260b = objM8450;
                                                                                                this.f6261c = mainViewModel;
                                                                                                this.f6262d = strM2006;
                                                                                                this.f6263e = strM8169;
                                                                                                this.f6264f = null;
                                                                                                this.f6266o = 6;
                                                                                                C0014.m280(qVarM30811);
                                                                                                objM4492 = C0234.m4491(C0179.m3411(), new a5.a(qVarM30811, str2, null), this);
                                                                                                aVarM5766 = C0300.m5766();
                                                                                                i46 = 1512494;
                                                                                                while (true) {
                                                                                                    i46 ^= 1512511;
                                                                                                    switch (i46) {
                                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            if (objM4492 == aVarM5766) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 83:
                                                                                                            objM4492 = lVarM238;
                                                                                                            break;
                                                                                                        case 114:
                                                                                                            break;
                                                                                                        case 809:
                                                                                                            i48 = 1513269;
                                                                                                            while (true) {
                                                                                                                i48 ^= 1513286;
                                                                                                                switch (i48) {
                                                                                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                        break;
                                                                                                                    case 115:
                                                                                                                        i48 = 1513300;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                    default:
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
                                                                                                i47 = 1513393;
                                                                                                while (true) {
                                                                                                    i47 ^= 1513410;
                                                                                                    switch (i47) {
                                                                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                            break;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                            break;
                                                                                                        case 115:
                                                                                                            if (objM4492 == aVarM5767) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 4044:
                                                                                                            return aVarM5767;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                C0228.m4382(C0191.m3645(mainViewModel), null);
                                                                                                i50 = 1513517;
                                                                                                while (true) {
                                                                                                    i50 ^= 1513534;
                                                                                                    switch (i50) {
                                                                                                        case 19:
                                                                                                            i50 = 1514199;
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
                                                                                                            objM4230 = objM8450;
                                                                                                            mainViewModel2 = mainViewModel;
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
                                                                                                    }
                                                                                                    this.f6260b = objM4230;
                                                                                                    this.f6261c = mainViewModel2;
                                                                                                    this.f6262d = null;
                                                                                                    this.f6263e = null;
                                                                                                    this.f6264f = null;
                                                                                                    this.f6266o = 7;
                                                                                                    objM1165 = C0061.m1165(mainViewModel2, strM8169, strM2006, this);
                                                                                                    i49 = 1514416;
                                                                                                    while (true) {
                                                                                                        i49 ^= 1514433;
                                                                                                        switch (i49) {
                                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                                break;
                                                                                                            case 47:
                                                                                                                break;
                                                                                                            case 113:
                                                                                                                if (objM1165 == aVarM5767) {
                                                                                                                }
                                                                                                                break;
                                                                                                            case 1369:
                                                                                                                return aVarM5767;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    C0366.m7173(mainViewModel2);
                                                                                                    thM9417 = C0484.m9416(objM4230);
                                                                                                    i52 = 1515191;
                                                                                                    while (true) {
                                                                                                        i52 ^= 1515208;
                                                                                                        switch (i52) {
                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                                                break;
                                                                                                            case 61:
                                                                                                                break;
                                                                                                            case 127:
                                                                                                                if (thM9417 != null) {
                                                                                                                }
                                                                                                                break;
                                                                                                            case 476:
                                                                                                                i53 = 1515315;
                                                                                                                while (true) {
                                                                                                                    i53 ^= 1515332;
                                                                                                                    switch (i53) {
                                                                                                                        case 22:
                                                                                                                            break;
                                                                                                                        case 53:
                                                                                                                            break;
                                                                                                                        case 119:
                                                                                                                            if (!zM4794) {
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 212:
                                                                                                                            C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                }
                                                                                                                C0366.m7173(mainViewModelM306);
                                                                                                                i54 = 1515439;
                                                                                                                while (true) {
                                                                                                                    i54 ^= 1515456;
                                                                                                                    switch (i54) {
                                                                                                                        case 111:
                                                                                                                            i54 = 1516121;
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
                                                                                                                            continue;
                                                                                                                            continue;
                                                                                                                            continue;
                                                                                                                        case 15769:
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
                                                                                                    i51 = 1537418;
                                                                                                    while (true) {
                                                                                                        i51 ^= 1537435;
                                                                                                        switch (i51) {
                                                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                if (!zM4794) {
                                                                                                                }
                                                                                                                break;
                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                break;
                                                                                                            case 83:
                                                                                                                return lVarM238;
                                                                                                            case 124:
                                                                                                                q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    C0228.m4382(q0VarM156, C0456.m8876());
                                                                                                    i15 = 1537542;
                                                                                                    while (true) {
                                                                                                        i15 ^= 1537559;
                                                                                                        switch (i15) {
                                                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                i15 = 1538224;
                                                                                                                break;
                                                                                                            case 3751:
                                                                                                                return lVarM238;
                                                                                                        }
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
                                                        } catch (Exception e4) {
                                                            int i57 = 1540239;
                                                            while (true) {
                                                                i57 ^= 1540256;
                                                                switch (i57) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case 47:
                                                                        i57 = 1540270;
                                                                        continue;
                                                                    default:
                                                                        continue;
                                                                }
                                                                int i58 = 1864;
                                                                while (true) {
                                                                    i58 ^= 1881;
                                                                    switch (i58) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i58 = 48674;
                                                                            continue;
                                                                        case 47483:
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                    i11 = 1538317;
                                                                    while (true) {
                                                                        i11 ^= 1538334;
                                                                        switch (i11) {
                                                                            case 19:
                                                                                i11 = !zM4794 ? 1538410 : 1538379;
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 85:
                                                                                break;
                                                                            case 116:
                                                                                C0228.m4382(C0151.m2902(mainViewModelM306), C0058.m1102(m5340(), 189, C0398.f668 ^ 708, 2186));
                                                                                i14 = 1538441;
                                                                                while (true) {
                                                                                    i14 ^= 1538458;
                                                                                    switch (i14) {
                                                                                        case 19:
                                                                                            i14 = 1538472;
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
                                                                    i12 = 1539340;
                                                                    while (true) {
                                                                        i12 ^= 1539357;
                                                                        switch (i12) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i12 = !zM4794 ? 1539433 : 1539402;
                                                                                break;
                                                                            case 54:
                                                                                break;
                                                                            case 87:
                                                                                return lVarM238;
                                                                            case 116:
                                                                                q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                i13 = 1539464;
                                                                                while (true) {
                                                                                    i13 ^= 1539481;
                                                                                    switch (i13) {
                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i13 = 1540146;
                                                                                            continue;
                                                                                            continue;
                                                                                        case 64939:
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
                                                                }
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            int i59 = 1507751;
                                                            while (true) {
                                                                i59 ^= 1507768;
                                                                switch (i59) {
                                                                    case 31:
                                                                        i59 = 1508433;
                                                                        continue;
                                                                    case 1513:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                                int i60 = 1740;
                                                                while (true) {
                                                                    i60 ^= 1757;
                                                                    switch (i60) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i60 = 1771;
                                                                            continue;
                                                                        case 54:
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                    i10 = 1539216;
                                                                    while (true) {
                                                                        i10 ^= 1539233;
                                                                        switch (i10) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case 49:
                                                                                i10 = !zM4794 ? 1539309 : 1539278;
                                                                                break;
                                                                            case 76:
                                                                                C0228.m4382(C0008.m156(mainViewModelM306), C0456.m8876());
                                                                                break;
                                                                            case 111:
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        int i61 = 1509425;
                                                        while (true) {
                                                            i61 ^= 1509442;
                                                            switch (i61) {
                                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 115:
                                                                    i61 = 1509456;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    }
                                }
                                break;
                            case 1:
                                C0330.m6365(obj);
                                objM111 = C0362.m7093((q8.h) obj);
                                int i62 = 50689;
                                while (true) {
                                    i62 ^= 50706;
                                    switch (i62) {
                                        case 19:
                                            i62 = 50720;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        default:
                                            continue;
                                    }
                                    z10 = objM111 instanceof q8.g;
                                    i16 = 51712;
                                    while (true) {
                                        i16 ^= 51729;
                                        switch (i16) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (((((z10 ? 1 : 0) ^ 65535) & 1) | ((z10 ? 1 : 0) & 65534)) != 0) {
                                                }
                                                break;
                                            case 47:
                                                break;
                                            case 76:
                                                C0228.m4382(C0354.m6932(mainViewModelM306), (List) objM111);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    iM3145 = C0164.m3145(this);
                                    itM8318 = C0425.m8318((Iterable) C0247.m4716(C0354.m6932(mainViewModelM306)));
                                    while (true) {
                                        zM3327 = C0174.m3327(itM8318);
                                        i17 = 51836;
                                        while (true) {
                                            i17 ^= 51853;
                                            switch (i17) {
                                                case 241:
                                                    if (zM3327) {
                                                    }
                                                    break;
                                                case 1963:
                                                    break;
                                                case 1992:
                                                    obj2 = null;
                                                    break;
                                                case 2025:
                                                    objM8115 = C0414.m8115(itM8318);
                                                    zM4399 = C0229.m4399(C0245.m4692((TransactionData) objM8115), strM8591);
                                                    i18 = 52611;
                                                    while (true) {
                                                        i18 ^= 52628;
                                                        switch (i18) {
                                                            case 23:
                                                                if (zM4399) {
                                                                }
                                                                break;
                                                            case 54:
                                                                break;
                                                            case 85:
                                                                break;
                                                            case 116:
                                                                i19 = 52735;
                                                                while (true) {
                                                                    i19 ^= 52752;
                                                                    switch (i19) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            obj2 = objM8115;
                                                                            break;
                                                                        case 1007:
                                                                            i19 = 52766;
                                                                            continue;
                                                                            continue;
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
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    }
                                    transactionData = (TransactionData) obj2;
                                    i20 = 53510;
                                    while (true) {
                                        i20 ^= 53527;
                                        switch (i20) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (transactionData != null) {
                                                }
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 83:
                                                strM8581 = C0440.m8581();
                                                i26 = 54657;
                                                while (true) {
                                                    i26 ^= 54674;
                                                    switch (i26) {
                                                        case 19:
                                                            i26 = 54688;
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
                                            case 116:
                                                strM8581 = C0481.m9358(transactionData);
                                                i27 = 53634;
                                                while (true) {
                                                    i27 ^= 53651;
                                                    switch (i27) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (strM8581 == null) {
                                                            }
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 76:
                                                            i28 = 53758;
                                                            while (true) {
                                                                i28 ^= 53775;
                                                                switch (i28) {
                                                                    case 1009:
                                                                        i28 = 54440;
                                                                        continue;
                                                                        continue;
                                                                    case 1703:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                }
                                                                strM8581 = C0440.m8581();
                                                                i26 = 54657;
                                                                while (true) {
                                                                    i26 ^= 54674;
                                                                    switch (i26) {
                                                                        case 19:
                                                                            i26 = 54688;
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
                                                            }
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
                                        i21 = 54533;
                                        while (true) {
                                            i21 ^= 54550;
                                            switch (i21) {
                                                case 19:
                                                    i21 = 54564;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                default:
                                                    break;
                                            }
                                            iM8181 = C0417.m8181(strM8581);
                                            i22 = 55432;
                                            while (true) {
                                                i22 ^= 55449;
                                                switch (i22) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (iM8181 > 0) {
                                                        }
                                                        break;
                                                    case 62:
                                                        break;
                                                    case 95:
                                                        iM1325 = iM3145;
                                                        str = strM8581;
                                                        String strM6163 = C0319.m6161((AppConfig) C0470.m9145(C0022.m429(C0421.m8257(mainViewModelM306))));
                                                        C0034.m673();
                                                        String strM8596 = C0441.m8591(this);
                                                        i29 = 1509549;
                                                        while (true) {
                                                            i29 ^= 1509566;
                                                            switch (i29) {
                                                                case 19:
                                                                    if (zM4794) {
                                                                    }
                                                                    break;
                                                                case 85:
                                                                    i30 = 3;
                                                                    break;
                                                                case 114:
                                                                    break;
                                                                case 436:
                                                                    i30 = 24;
                                                                    i32 = 1509673;
                                                                    while (true) {
                                                                        i32 ^= 1509690;
                                                                        switch (i32) {
                                                                            case 19:
                                                                                i32 = 1510355;
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
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        f0 f0Var3 = new f0(mainViewModelM306, zM4794);
                                                        this.f6260b = str;
                                                        this.f6266o = 3;
                                                        objM4491 = C0234.m4491(C0179.m3411(), new a5.d0(i30, iM1325, strM6163, strM8596, null, f0Var3), this);
                                                        i31 = 1510448;
                                                        while (true) {
                                                            i31 ^= 1510465;
                                                            switch (i31) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 47:
                                                                    break;
                                                                case 113:
                                                                    if (objM4491 == aVarM5767) {
                                                                    }
                                                                    break;
                                                                case 204:
                                                                    return aVarM5767;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        a5.b0 b0Var3 = (a5.b0) objM4491;
                                                        zM6067 = C0314.m6067(b0Var3);
                                                        strM5281 = C0275.m5281(b0Var3);
                                                        i38 = 1510572;
                                                        while (true) {
                                                            i38 ^= 1510589;
                                                            switch (i38) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (zM6067) {
                                                                    }
                                                                    break;
                                                                case 87:
                                                                    i39 = 1516214;
                                                                    while (true) {
                                                                        i39 ^= 1516231;
                                                                        switch (i39) {
                                                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 51:
                                                                                break;
                                                                            case 113:
                                                                                if (!zM4794) {
                                                                                }
                                                                                break;
                                                                            case 468:
                                                                                q0 q0VarM2905 = C0151.m2902(mainViewModelM306);
                                                                                iM8182 = C0417.m8181(strM5281);
                                                                                i40 = 1516338;
                                                                                while (true) {
                                                                                    i40 ^= 1516355;
                                                                                    switch (i40) {
                                                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 51:
                                                                                            strM5281 = C0245.m4690(m5340(), 143, C0228.f307 ^ (-930), 2024);
                                                                                            break;
                                                                                        case 113:
                                                                                            if (iM8182 > 0) {
                                                                                            }
                                                                                            break;
                                                                                        case 22444:
                                                                                            i41 = 1537294;
                                                                                            while (true) {
                                                                                                i41 ^= 1537311;
                                                                                                switch (i41) {
                                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        i41 = 1537325;
                                                                                                        continue;
                                                                                                        continue;
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
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                C0228.m4382(q0VarM2905, strM5281);
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    C0366.m7173(mainViewModelM306);
                                                                    i51 = 1537418;
                                                                    while (true) {
                                                                        i51 ^= 1537435;
                                                                        switch (i51) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (!zM4794) {
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 83:
                                                                                return lVarM238;
                                                                            case 124:
                                                                                q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    C0228.m4382(q0VarM156, C0456.m8876());
                                                                    i15 = 1537542;
                                                                    while (true) {
                                                                        i15 ^= 1537559;
                                                                        switch (i15) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i15 = 1538224;
                                                                                break;
                                                                            case 3751:
                                                                                return lVarM238;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 118:
                                                                    break;
                                                                case 809:
                                                                    C0014.m280(mainViewModelM306);
                                                                    jM9263 = C0476.m9263(strM6528);
                                                                    a5.z zVarM78212 = C0400.m7827(mainViewModelM306);
                                                                    String strM86911 = C0447.m8697(this);
                                                                    String strM65212 = C0337.m6528(this);
                                                                    String strM8597 = C0441.m8591(this);
                                                                    this.f6260b = str;
                                                                    this.f6265n = jM9263;
                                                                    this.f6266o = 4;
                                                                    objM4230 = C0219.m4230(zVarM78212, strM86911, strM65212, jM9263, strM8597, this);
                                                                    i42 = 1511347;
                                                                    while (true) {
                                                                        i42 ^= 1511364;
                                                                        switch (i42) {
                                                                            case 22:
                                                                                break;
                                                                            case 53:
                                                                                str2 = str;
                                                                                break;
                                                                            case 119:
                                                                                if (objM4230 == aVarM5767) {
                                                                                }
                                                                                break;
                                                                            case 8148:
                                                                                return aVarM5767;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    z12 = objM4230 instanceof q8.g;
                                                                    i43 = 1511471;
                                                                    while (true) {
                                                                        i43 ^= 1511488;
                                                                        switch (i43) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                thM9417 = C0484.m9416(objM4230);
                                                                                i52 = 1515191;
                                                                                while (true) {
                                                                                    i52 ^= 1515208;
                                                                                    switch (i52) {
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                            break;
                                                                                        case 61:
                                                                                            break;
                                                                                        case 127:
                                                                                            if (thM9417 != null) {
                                                                                            }
                                                                                            break;
                                                                                        case 476:
                                                                                            i53 = 1515315;
                                                                                            while (true) {
                                                                                                i53 ^= 1515332;
                                                                                                switch (i53) {
                                                                                                    case 22:
                                                                                                        break;
                                                                                                    case 53:
                                                                                                        break;
                                                                                                    case 119:
                                                                                                        if (!zM4794) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 212:
                                                                                                        C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            C0366.m7173(mainViewModelM306);
                                                                                            i54 = 1515439;
                                                                                            while (true) {
                                                                                                i54 ^= 1515456;
                                                                                                switch (i54) {
                                                                                                    case 111:
                                                                                                        i54 = 1516121;
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
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    case 15769:
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
                                                                                i51 = 1537418;
                                                                                while (true) {
                                                                                    i51 ^= 1537435;
                                                                                    switch (i51) {
                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            if (!zM4794) {
                                                                                            }
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            break;
                                                                                        case 83:
                                                                                            return lVarM238;
                                                                                        case 124:
                                                                                            q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                C0228.m4382(q0VarM156, C0456.m8876());
                                                                                i15 = 1537542;
                                                                                while (true) {
                                                                                    i15 ^= 1537559;
                                                                                    switch (i15) {
                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i15 = 1538224;
                                                                                            break;
                                                                                        case 3751:
                                                                                            return lVarM238;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 111:
                                                                                if (((((z12 ? 1 : 0) ^ 65535) & 1) | ((z12 ? 1 : 0) & 65534)) != 0) {
                                                                                }
                                                                                break;
                                                                            case 204:
                                                                                C0228.m4382(C0107.m2079(mainViewModelM306), C0335.m6483());
                                                                                C0228.m4382(C0116.m2242(mainViewModelM306), strM6528);
                                                                                C0122.m2359(mainViewModelM306, jM9263 - (0 - C0402.m7869()));
                                                                                C0228.m4382(C0151.m2902(mainViewModelM306), strM7042);
                                                                                a5.z zVarM78213 = C0400.m7827(mainViewModelM306);
                                                                                this.f6260b = str2;
                                                                                this.f6261c = objM4230;
                                                                                this.f6262d = mainViewModelM306;
                                                                                this.f6263e = strM8591;
                                                                                this.f6264f = strM8697;
                                                                                this.f6266o = 5;
                                                                                objM7131 = C0364.m7131(zVarM78213, strM8591, strM7042, this);
                                                                                i44 = 1511595;
                                                                                while (true) {
                                                                                    i44 ^= 1511612;
                                                                                    switch (i44) {
                                                                                        case 23:
                                                                                            if (objM7131 == aVarM5767) {
                                                                                            }
                                                                                            break;
                                                                                        case 815:
                                                                                            return aVarM5767;
                                                                                        case 968:
                                                                                            mainViewModel = mainViewModelM306;
                                                                                            objM8450 = objM4230;
                                                                                            strM8169 = strM8697;
                                                                                            strM2006 = strM8591;
                                                                                            break;
                                                                                        case 1001:
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                iM8183 = C0417.m8181(str2);
                                                                                i45 = 1512370;
                                                                                while (true) {
                                                                                    i45 ^= 1512387;
                                                                                    switch (i45) {
                                                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 51:
                                                                                            objM4230 = objM8450;
                                                                                            mainViewModel2 = mainViewModel;
                                                                                            this.f6260b = objM4230;
                                                                                            this.f6261c = mainViewModel2;
                                                                                            this.f6262d = null;
                                                                                            this.f6263e = null;
                                                                                            this.f6264f = null;
                                                                                            this.f6266o = 7;
                                                                                            objM1165 = C0061.m1165(mainViewModel2, strM8169, strM2006, this);
                                                                                            i49 = 1514416;
                                                                                            while (true) {
                                                                                                i49 ^= 1514433;
                                                                                                switch (i49) {
                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                        break;
                                                                                                    case 47:
                                                                                                        break;
                                                                                                    case 113:
                                                                                                        if (objM1165 == aVarM5767) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 1369:
                                                                                                        return aVarM5767;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            C0366.m7173(mainViewModel2);
                                                                                            thM9417 = C0484.m9416(objM4230);
                                                                                            i52 = 1515191;
                                                                                            while (true) {
                                                                                                i52 ^= 1515208;
                                                                                                switch (i52) {
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                                        break;
                                                                                                    case 61:
                                                                                                        break;
                                                                                                    case 127:
                                                                                                        if (thM9417 != null) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 476:
                                                                                                        i53 = 1515315;
                                                                                                        while (true) {
                                                                                                            i53 ^= 1515332;
                                                                                                            switch (i53) {
                                                                                                                case 22:
                                                                                                                    break;
                                                                                                                case 53:
                                                                                                                    break;
                                                                                                                case 119:
                                                                                                                    if (!zM4794) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 212:
                                                                                                                    C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        C0366.m7173(mainViewModelM306);
                                                                                                        i54 = 1515439;
                                                                                                        while (true) {
                                                                                                            i54 ^= 1515456;
                                                                                                            switch (i54) {
                                                                                                                case 111:
                                                                                                                    i54 = 1516121;
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
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                case 15769:
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
                                                                                            i51 = 1537418;
                                                                                            while (true) {
                                                                                                i51 ^= 1537435;
                                                                                                switch (i51) {
                                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        if (!zM4794) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                        break;
                                                                                                    case 83:
                                                                                                        return lVarM238;
                                                                                                    case 124:
                                                                                                        q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            C0228.m4382(q0VarM156, C0456.m8876());
                                                                                            i15 = 1537542;
                                                                                            while (true) {
                                                                                                i15 ^= 1537559;
                                                                                                switch (i15) {
                                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        i15 = 1538224;
                                                                                                        break;
                                                                                                    case 3751:
                                                                                                        return lVarM238;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 113:
                                                                                            if (iM8183 > 0) {
                                                                                            }
                                                                                            break;
                                                                                        case 1996:
                                                                                            a4.q qVarM30812 = C0161.m3089(mainViewModel);
                                                                                            this.f6260b = objM8450;
                                                                                            this.f6261c = mainViewModel;
                                                                                            this.f6262d = strM2006;
                                                                                            this.f6263e = strM8169;
                                                                                            this.f6264f = null;
                                                                                            this.f6266o = 6;
                                                                                            C0014.m280(qVarM30812);
                                                                                            objM4492 = C0234.m4491(C0179.m3411(), new a5.a(qVarM30812, str2, null), this);
                                                                                            aVarM5766 = C0300.m5766();
                                                                                            i46 = 1512494;
                                                                                            while (true) {
                                                                                                i46 ^= 1512511;
                                                                                                switch (i46) {
                                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        if (objM4492 == aVarM5766) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 83:
                                                                                                        objM4492 = lVarM238;
                                                                                                        break;
                                                                                                    case 114:
                                                                                                        break;
                                                                                                    case 809:
                                                                                                        i48 = 1513269;
                                                                                                        while (true) {
                                                                                                            i48 ^= 1513286;
                                                                                                            switch (i48) {
                                                                                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                    break;
                                                                                                                case 115:
                                                                                                                    i48 = 1513300;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                default:
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
                                                                                            i47 = 1513393;
                                                                                            while (true) {
                                                                                                i47 ^= 1513410;
                                                                                                switch (i47) {
                                                                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                        break;
                                                                                                    case 115:
                                                                                                        if (objM4492 == aVarM5767) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 4044:
                                                                                                        return aVarM5767;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            C0228.m4382(C0191.m3645(mainViewModel), null);
                                                                                            i50 = 1513517;
                                                                                            while (true) {
                                                                                                i50 ^= 1513534;
                                                                                                switch (i50) {
                                                                                                    case 19:
                                                                                                        i50 = 1514199;
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
                                                                                                        objM4230 = objM8450;
                                                                                                        mainViewModel2 = mainViewModel;
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
                                                                                                }
                                                                                                this.f6260b = objM4230;
                                                                                                this.f6261c = mainViewModel2;
                                                                                                this.f6262d = null;
                                                                                                this.f6263e = null;
                                                                                                this.f6264f = null;
                                                                                                this.f6266o = 7;
                                                                                                objM1165 = C0061.m1165(mainViewModel2, strM8169, strM2006, this);
                                                                                                i49 = 1514416;
                                                                                                while (true) {
                                                                                                    i49 ^= 1514433;
                                                                                                    switch (i49) {
                                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                                            break;
                                                                                                        case 47:
                                                                                                            break;
                                                                                                        case 113:
                                                                                                            if (objM1165 == aVarM5767) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 1369:
                                                                                                            return aVarM5767;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                C0366.m7173(mainViewModel2);
                                                                                                thM9417 = C0484.m9416(objM4230);
                                                                                                i52 = 1515191;
                                                                                                while (true) {
                                                                                                    i52 ^= 1515208;
                                                                                                    switch (i52) {
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                                            break;
                                                                                                        case 61:
                                                                                                            break;
                                                                                                        case 127:
                                                                                                            if (thM9417 != null) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 476:
                                                                                                            i53 = 1515315;
                                                                                                            while (true) {
                                                                                                                i53 ^= 1515332;
                                                                                                                switch (i53) {
                                                                                                                    case 22:
                                                                                                                        break;
                                                                                                                    case 53:
                                                                                                                        break;
                                                                                                                    case 119:
                                                                                                                        if (!zM4794) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 212:
                                                                                                                        C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                            C0366.m7173(mainViewModelM306);
                                                                                                            i54 = 1515439;
                                                                                                            while (true) {
                                                                                                                i54 ^= 1515456;
                                                                                                                switch (i54) {
                                                                                                                    case 111:
                                                                                                                        i54 = 1516121;
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
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                    case 15769:
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
                                                                                                i51 = 1537418;
                                                                                                while (true) {
                                                                                                    i51 ^= 1537435;
                                                                                                    switch (i51) {
                                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            if (!zM4794) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                            break;
                                                                                                        case 83:
                                                                                                            return lVarM238;
                                                                                                        case 124:
                                                                                                            q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                C0228.m4382(q0VarM156, C0456.m8876());
                                                                                                i15 = 1537542;
                                                                                                while (true) {
                                                                                                    i15 ^= 1537559;
                                                                                                    switch (i15) {
                                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i15 = 1538224;
                                                                                                            break;
                                                                                                        case 3751:
                                                                                                            return lVarM238;
                                                                                                    }
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
                                                        break;
                                                    case 124:
                                                        jM3863 = C0201.m3863((Number) C0247.m4716(C0200.m3835(mainViewModelM306)));
                                                        i23 = 55556;
                                                        while (true) {
                                                            i23 ^= 55573;
                                                            switch (i23) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (jM3863 == 0) {
                                                                    }
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 87:
                                                                    z11 = false;
                                                                    break;
                                                                case 116:
                                                                    z11 = true;
                                                                    i25 = 55680;
                                                                    while (true) {
                                                                        i25 ^= 55697;
                                                                        switch (i25) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i25 = 56362;
                                                                                continue;
                                                                                continue;
                                                                            case 1467:
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
                                                        a4.q qVarM30813 = C0161.m3089(mainViewModelM306);
                                                        String strM65213 = C0337.m6528(this);
                                                        String strM86912 = C0447.m8697(this);
                                                        this.f6260b = strM8581;
                                                        this.f6259a = iM3145;
                                                        this.f6266o = 2;
                                                        objM5993 = C0310.m5993(qVarM30813, strM8581, strM65213, strM86912, z11, this);
                                                        i24 = 56455;
                                                        while (true) {
                                                            i24 ^= 56472;
                                                            switch (i24) {
                                                                case 31:
                                                                    if (objM5993 == aVarM5767) {
                                                                    }
                                                                    break;
                                                                case 62:
                                                                    break;
                                                                case 93:
                                                                    obj3 = objM5993;
                                                                    iM1325 = iM3145;
                                                                    str = strM8581;
                                                                    break;
                                                                case 124:
                                                                    return aVarM5767;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        thM9416 = C0484.m9416(obj3);
                                                        i33 = 56579;
                                                        while (true) {
                                                            i33 ^= 56596;
                                                            switch (i33) {
                                                                case 23:
                                                                    if (thM9416 != null) {
                                                                    }
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 85:
                                                                    i34 = 1508650;
                                                                    while (true) {
                                                                        i34 ^= 1508667;
                                                                        switch (i34) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i34 = 1508681;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            case 114:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1564036:
                                                                    i35 = 1507503;
                                                                    while (true) {
                                                                        i35 ^= 1507520;
                                                                        switch (i35) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                break;
                                                                            case 111:
                                                                                if (!zM4794) {
                                                                                }
                                                                                break;
                                                                            case 460:
                                                                                q0 q0VarM2906 = C0151.m2902(mainViewModelM306);
                                                                                String strM40410 = C0213.m4049(thM9416);
                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                C0142.m2728(sb2, C0212.m4036(m5340(), 54, C0065.f85 ^ 660, 2599));
                                                                                C0142.m2728(sb2, str);
                                                                                C0142.m2728(sb2, C0087.m1850(m5340(), 62, C0004.f1062 ^ (-202), 1116));
                                                                                C0142.m2728(sb2, strM40410);
                                                                                C0228.m4382(q0VarM2906, C0441.m8605(sb2));
                                                                                C0228.m4382(C0008.m156(mainViewModelM306), C0456.m8876());
                                                                                i37 = 1507627;
                                                                                while (true) {
                                                                                    i37 ^= 1507644;
                                                                                    switch (i37) {
                                                                                        case 23:
                                                                                            i37 = 1507658;
                                                                                            break;
                                                                                        case 118:
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
                                                                    i36 = 1508526;
                                                                    while (true) {
                                                                        i36 ^= 1508543;
                                                                        switch (i36) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (!zM4794) {
                                                                                    i36 = 1508619;
                                                                                }
                                                                                break;
                                                                            case 83:
                                                                                return lVarM238;
                                                                            case 114:
                                                                                break;
                                                                            case 436:
                                                                                C0228.m4382(C0008.m156(mainViewModelM306), C0456.m8876());
                                                                                return lVarM238;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                        i36 = 1508588;
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        String strM6164 = C0319.m6161((AppConfig) C0470.m9145(C0022.m429(C0421.m8257(mainViewModelM306))));
                                                        C0034.m673();
                                                        String strM8598 = C0441.m8591(this);
                                                        i29 = 1509549;
                                                        while (true) {
                                                            i29 ^= 1509566;
                                                            switch (i29) {
                                                                case 19:
                                                                    if (zM4794) {
                                                                    }
                                                                    break;
                                                                case 85:
                                                                    i30 = 3;
                                                                    break;
                                                                case 114:
                                                                    break;
                                                                case 436:
                                                                    i30 = 24;
                                                                    i32 = 1509673;
                                                                    while (true) {
                                                                        i32 ^= 1509690;
                                                                        switch (i32) {
                                                                            case 19:
                                                                                i32 = 1510355;
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
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        f0 f0Var4 = new f0(mainViewModelM306, zM4794);
                                                        this.f6260b = str;
                                                        this.f6266o = 3;
                                                        objM4491 = C0234.m4491(C0179.m3411(), new a5.d0(i30, iM1325, strM6164, strM8598, null, f0Var4), this);
                                                        i31 = 1510448;
                                                        while (true) {
                                                            i31 ^= 1510465;
                                                            switch (i31) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 47:
                                                                    break;
                                                                case 113:
                                                                    if (objM4491 == aVarM5767) {
                                                                    }
                                                                    break;
                                                                case 204:
                                                                    return aVarM5767;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        a5.b0 b0Var4 = (a5.b0) objM4491;
                                                        zM6067 = C0314.m6067(b0Var4);
                                                        strM5281 = C0275.m5281(b0Var4);
                                                        i38 = 1510572;
                                                        while (true) {
                                                            i38 ^= 1510589;
                                                            switch (i38) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (zM6067) {
                                                                    }
                                                                    break;
                                                                case 87:
                                                                    i39 = 1516214;
                                                                    while (true) {
                                                                        i39 ^= 1516231;
                                                                        switch (i39) {
                                                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 51:
                                                                                break;
                                                                            case 113:
                                                                                if (!zM4794) {
                                                                                }
                                                                                break;
                                                                            case 468:
                                                                                q0 q0VarM2907 = C0151.m2902(mainViewModelM306);
                                                                                iM8182 = C0417.m8181(strM5281);
                                                                                i40 = 1516338;
                                                                                while (true) {
                                                                                    i40 ^= 1516355;
                                                                                    switch (i40) {
                                                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 51:
                                                                                            strM5281 = C0245.m4690(m5340(), 143, C0228.f307 ^ (-930), 2024);
                                                                                            break;
                                                                                        case 113:
                                                                                            if (iM8182 > 0) {
                                                                                            }
                                                                                            break;
                                                                                        case 22444:
                                                                                            i41 = 1537294;
                                                                                            while (true) {
                                                                                                i41 ^= 1537311;
                                                                                                switch (i41) {
                                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        i41 = 1537325;
                                                                                                        continue;
                                                                                                        continue;
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
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                C0228.m4382(q0VarM2907, strM5281);
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    C0366.m7173(mainViewModelM306);
                                                                    i51 = 1537418;
                                                                    while (true) {
                                                                        i51 ^= 1537435;
                                                                        switch (i51) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (!zM4794) {
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 83:
                                                                                return lVarM238;
                                                                            case 124:
                                                                                q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    C0228.m4382(q0VarM156, C0456.m8876());
                                                                    i15 = 1537542;
                                                                    while (true) {
                                                                        i15 ^= 1537559;
                                                                        switch (i15) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i15 = 1538224;
                                                                                break;
                                                                            case 3751:
                                                                                return lVarM238;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 118:
                                                                    break;
                                                                case 809:
                                                                    C0014.m280(mainViewModelM306);
                                                                    jM9263 = C0476.m9263(strM6528);
                                                                    a5.z zVarM78214 = C0400.m7827(mainViewModelM306);
                                                                    String strM86913 = C0447.m8697(this);
                                                                    String strM65214 = C0337.m6528(this);
                                                                    String strM8599 = C0441.m8591(this);
                                                                    this.f6260b = str;
                                                                    this.f6265n = jM9263;
                                                                    this.f6266o = 4;
                                                                    objM4230 = C0219.m4230(zVarM78214, strM86913, strM65214, jM9263, strM8599, this);
                                                                    i42 = 1511347;
                                                                    while (true) {
                                                                        i42 ^= 1511364;
                                                                        switch (i42) {
                                                                            case 22:
                                                                                break;
                                                                            case 53:
                                                                                str2 = str;
                                                                                break;
                                                                            case 119:
                                                                                if (objM4230 == aVarM5767) {
                                                                                }
                                                                                break;
                                                                            case 8148:
                                                                                return aVarM5767;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    z12 = objM4230 instanceof q8.g;
                                                                    i43 = 1511471;
                                                                    while (true) {
                                                                        i43 ^= 1511488;
                                                                        switch (i43) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                thM9417 = C0484.m9416(objM4230);
                                                                                i52 = 1515191;
                                                                                while (true) {
                                                                                    i52 ^= 1515208;
                                                                                    switch (i52) {
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                            break;
                                                                                        case 61:
                                                                                            break;
                                                                                        case 127:
                                                                                            if (thM9417 != null) {
                                                                                            }
                                                                                            break;
                                                                                        case 476:
                                                                                            i53 = 1515315;
                                                                                            while (true) {
                                                                                                i53 ^= 1515332;
                                                                                                switch (i53) {
                                                                                                    case 22:
                                                                                                        break;
                                                                                                    case 53:
                                                                                                        break;
                                                                                                    case 119:
                                                                                                        if (!zM4794) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 212:
                                                                                                        C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            C0366.m7173(mainViewModelM306);
                                                                                            i54 = 1515439;
                                                                                            while (true) {
                                                                                                i54 ^= 1515456;
                                                                                                switch (i54) {
                                                                                                    case 111:
                                                                                                        i54 = 1516121;
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
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    case 15769:
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
                                                                                i51 = 1537418;
                                                                                while (true) {
                                                                                    i51 ^= 1537435;
                                                                                    switch (i51) {
                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            if (!zM4794) {
                                                                                            }
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            break;
                                                                                        case 83:
                                                                                            return lVarM238;
                                                                                        case 124:
                                                                                            q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                C0228.m4382(q0VarM156, C0456.m8876());
                                                                                i15 = 1537542;
                                                                                while (true) {
                                                                                    i15 ^= 1537559;
                                                                                    switch (i15) {
                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i15 = 1538224;
                                                                                            break;
                                                                                        case 3751:
                                                                                            return lVarM238;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 111:
                                                                                if (((((z12 ? 1 : 0) ^ 65535) & 1) | ((z12 ? 1 : 0) & 65534)) != 0) {
                                                                                }
                                                                                break;
                                                                            case 204:
                                                                                C0228.m4382(C0107.m2079(mainViewModelM306), C0335.m6483());
                                                                                C0228.m4382(C0116.m2242(mainViewModelM306), strM6528);
                                                                                C0122.m2359(mainViewModelM306, jM9263 - (0 - C0402.m7869()));
                                                                                C0228.m4382(C0151.m2902(mainViewModelM306), strM7042);
                                                                                a5.z zVarM78215 = C0400.m7827(mainViewModelM306);
                                                                                this.f6260b = str2;
                                                                                this.f6261c = objM4230;
                                                                                this.f6262d = mainViewModelM306;
                                                                                this.f6263e = strM8591;
                                                                                this.f6264f = strM8697;
                                                                                this.f6266o = 5;
                                                                                objM7131 = C0364.m7131(zVarM78215, strM8591, strM7042, this);
                                                                                i44 = 1511595;
                                                                                while (true) {
                                                                                    i44 ^= 1511612;
                                                                                    switch (i44) {
                                                                                        case 23:
                                                                                            if (objM7131 == aVarM5767) {
                                                                                            }
                                                                                            break;
                                                                                        case 815:
                                                                                            return aVarM5767;
                                                                                        case 968:
                                                                                            mainViewModel = mainViewModelM306;
                                                                                            objM8450 = objM4230;
                                                                                            strM8169 = strM8697;
                                                                                            strM2006 = strM8591;
                                                                                            break;
                                                                                        case 1001:
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                iM8183 = C0417.m8181(str2);
                                                                                i45 = 1512370;
                                                                                while (true) {
                                                                                    i45 ^= 1512387;
                                                                                    switch (i45) {
                                                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 51:
                                                                                            objM4230 = objM8450;
                                                                                            mainViewModel2 = mainViewModel;
                                                                                            this.f6260b = objM4230;
                                                                                            this.f6261c = mainViewModel2;
                                                                                            this.f6262d = null;
                                                                                            this.f6263e = null;
                                                                                            this.f6264f = null;
                                                                                            this.f6266o = 7;
                                                                                            objM1165 = C0061.m1165(mainViewModel2, strM8169, strM2006, this);
                                                                                            i49 = 1514416;
                                                                                            while (true) {
                                                                                                i49 ^= 1514433;
                                                                                                switch (i49) {
                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                        break;
                                                                                                    case 47:
                                                                                                        break;
                                                                                                    case 113:
                                                                                                        if (objM1165 == aVarM5767) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 1369:
                                                                                                        return aVarM5767;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            C0366.m7173(mainViewModel2);
                                                                                            thM9417 = C0484.m9416(objM4230);
                                                                                            i52 = 1515191;
                                                                                            while (true) {
                                                                                                i52 ^= 1515208;
                                                                                                switch (i52) {
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                                        break;
                                                                                                    case 61:
                                                                                                        break;
                                                                                                    case 127:
                                                                                                        if (thM9417 != null) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 476:
                                                                                                        i53 = 1515315;
                                                                                                        while (true) {
                                                                                                            i53 ^= 1515332;
                                                                                                            switch (i53) {
                                                                                                                case 22:
                                                                                                                    break;
                                                                                                                case 53:
                                                                                                                    break;
                                                                                                                case 119:
                                                                                                                    if (!zM4794) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 212:
                                                                                                                    C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        C0366.m7173(mainViewModelM306);
                                                                                                        i54 = 1515439;
                                                                                                        while (true) {
                                                                                                            i54 ^= 1515456;
                                                                                                            switch (i54) {
                                                                                                                case 111:
                                                                                                                    i54 = 1516121;
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
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                case 15769:
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
                                                                                            i51 = 1537418;
                                                                                            while (true) {
                                                                                                i51 ^= 1537435;
                                                                                                switch (i51) {
                                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        if (!zM4794) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                        break;
                                                                                                    case 83:
                                                                                                        return lVarM238;
                                                                                                    case 124:
                                                                                                        q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            C0228.m4382(q0VarM156, C0456.m8876());
                                                                                            i15 = 1537542;
                                                                                            while (true) {
                                                                                                i15 ^= 1537559;
                                                                                                switch (i15) {
                                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        i15 = 1538224;
                                                                                                        break;
                                                                                                    case 3751:
                                                                                                        return lVarM238;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 113:
                                                                                            if (iM8183 > 0) {
                                                                                            }
                                                                                            break;
                                                                                        case 1996:
                                                                                            a4.q qVarM30814 = C0161.m3089(mainViewModel);
                                                                                            this.f6260b = objM8450;
                                                                                            this.f6261c = mainViewModel;
                                                                                            this.f6262d = strM2006;
                                                                                            this.f6263e = strM8169;
                                                                                            this.f6264f = null;
                                                                                            this.f6266o = 6;
                                                                                            C0014.m280(qVarM30814);
                                                                                            objM4492 = C0234.m4491(C0179.m3411(), new a5.a(qVarM30814, str2, null), this);
                                                                                            aVarM5766 = C0300.m5766();
                                                                                            i46 = 1512494;
                                                                                            while (true) {
                                                                                                i46 ^= 1512511;
                                                                                                switch (i46) {
                                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        if (objM4492 == aVarM5766) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 83:
                                                                                                        objM4492 = lVarM238;
                                                                                                        break;
                                                                                                    case 114:
                                                                                                        break;
                                                                                                    case 809:
                                                                                                        i48 = 1513269;
                                                                                                        while (true) {
                                                                                                            i48 ^= 1513286;
                                                                                                            switch (i48) {
                                                                                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                    break;
                                                                                                                case 115:
                                                                                                                    i48 = 1513300;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                default:
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
                                                                                            i47 = 1513393;
                                                                                            while (true) {
                                                                                                i47 ^= 1513410;
                                                                                                switch (i47) {
                                                                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                        break;
                                                                                                    case 115:
                                                                                                        if (objM4492 == aVarM5767) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 4044:
                                                                                                        return aVarM5767;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            C0228.m4382(C0191.m3645(mainViewModel), null);
                                                                                            i50 = 1513517;
                                                                                            while (true) {
                                                                                                i50 ^= 1513534;
                                                                                                switch (i50) {
                                                                                                    case 19:
                                                                                                        i50 = 1514199;
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
                                                                                                        objM4230 = objM8450;
                                                                                                        mainViewModel2 = mainViewModel;
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
                                                                                                }
                                                                                                this.f6260b = objM4230;
                                                                                                this.f6261c = mainViewModel2;
                                                                                                this.f6262d = null;
                                                                                                this.f6263e = null;
                                                                                                this.f6264f = null;
                                                                                                this.f6266o = 7;
                                                                                                objM1165 = C0061.m1165(mainViewModel2, strM8169, strM2006, this);
                                                                                                i49 = 1514416;
                                                                                                while (true) {
                                                                                                    i49 ^= 1514433;
                                                                                                    switch (i49) {
                                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                                            break;
                                                                                                        case 47:
                                                                                                            break;
                                                                                                        case 113:
                                                                                                            if (objM1165 == aVarM5767) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 1369:
                                                                                                            return aVarM5767;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                C0366.m7173(mainViewModel2);
                                                                                                thM9417 = C0484.m9416(objM4230);
                                                                                                i52 = 1515191;
                                                                                                while (true) {
                                                                                                    i52 ^= 1515208;
                                                                                                    switch (i52) {
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                                            break;
                                                                                                        case 61:
                                                                                                            break;
                                                                                                        case 127:
                                                                                                            if (thM9417 != null) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 476:
                                                                                                            i53 = 1515315;
                                                                                                            while (true) {
                                                                                                                i53 ^= 1515332;
                                                                                                                switch (i53) {
                                                                                                                    case 22:
                                                                                                                        break;
                                                                                                                    case 53:
                                                                                                                        break;
                                                                                                                    case 119:
                                                                                                                        if (!zM4794) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 212:
                                                                                                                        C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                            C0366.m7173(mainViewModelM306);
                                                                                                            i54 = 1515439;
                                                                                                            while (true) {
                                                                                                                i54 ^= 1515456;
                                                                                                                switch (i54) {
                                                                                                                    case 111:
                                                                                                                        i54 = 1516121;
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
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                    case 15769:
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
                                                                                                i51 = 1537418;
                                                                                                while (true) {
                                                                                                    i51 ^= 1537435;
                                                                                                    switch (i51) {
                                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            if (!zM4794) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                            break;
                                                                                                        case 83:
                                                                                                            return lVarM238;
                                                                                                        case 124:
                                                                                                            q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                C0228.m4382(q0VarM156, C0456.m8876());
                                                                                                i15 = 1537542;
                                                                                                while (true) {
                                                                                                    i15 ^= 1537559;
                                                                                                    switch (i15) {
                                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                            i15 = 1538224;
                                                                                                            break;
                                                                                                        case 3751:
                                                                                                            return lVarM238;
                                                                                                    }
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
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            case 2:
                                iM1325 = C0068.m1325(this);
                                String str3 = (String) C0229.m4394(this);
                                C0330.m6365(obj);
                                Object objM7093 = C0362.m7093((q8.h) obj);
                                int i63 = 49914;
                                while (true) {
                                    i63 ^= 49931;
                                    switch (i63) {
                                        case 497:
                                            i63 = 50596;
                                            continue;
                                        case 1711:
                                            obj3 = objM7093;
                                            str = str3;
                                            break;
                                        default:
                                            continue;
                                    }
                                    thM9416 = C0484.m9416(obj3);
                                    i33 = 56579;
                                    while (true) {
                                        i33 ^= 56596;
                                        switch (i33) {
                                            case 23:
                                                if (thM9416 != null) {
                                                }
                                                break;
                                            case 54:
                                                break;
                                            case 85:
                                                i34 = 1508650;
                                                while (true) {
                                                    i34 ^= 1508667;
                                                    switch (i34) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i34 = 1508681;
                                                            continue;
                                                            continue;
                                                            continue;
                                                        case 114:
                                                            break;
                                                        default:
                                                            continue;
                                                            continue;
                                                            continue;
                                                    }
                                                }
                                                break;
                                            case 1564036:
                                                i35 = 1507503;
                                                while (true) {
                                                    i35 ^= 1507520;
                                                    switch (i35) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            break;
                                                        case 111:
                                                            if (!zM4794) {
                                                            }
                                                            break;
                                                        case 460:
                                                            q0 q0VarM2908 = C0151.m2902(mainViewModelM306);
                                                            String strM40411 = C0213.m4049(thM9416);
                                                            StringBuilder sb3 = new StringBuilder();
                                                            C0142.m2728(sb3, C0212.m4036(m5340(), 54, C0065.f85 ^ 660, 2599));
                                                            C0142.m2728(sb3, str);
                                                            C0142.m2728(sb3, C0087.m1850(m5340(), 62, C0004.f1062 ^ (-202), 1116));
                                                            C0142.m2728(sb3, strM40411);
                                                            C0228.m4382(q0VarM2908, C0441.m8605(sb3));
                                                            C0228.m4382(C0008.m156(mainViewModelM306), C0456.m8876());
                                                            i37 = 1507627;
                                                            while (true) {
                                                                i37 ^= 1507644;
                                                                switch (i37) {
                                                                    case 23:
                                                                        i37 = 1507658;
                                                                        break;
                                                                    case 118:
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
                                                i36 = 1508526;
                                                while (true) {
                                                    i36 ^= 1508543;
                                                    switch (i36) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (!zM4794) {
                                                                i36 = 1508619;
                                                            }
                                                            break;
                                                        case 83:
                                                            return lVarM238;
                                                        case 114:
                                                            break;
                                                        case 436:
                                                            C0228.m4382(C0008.m156(mainViewModelM306), C0456.m8876());
                                                            return lVarM238;
                                                        default:
                                                            continue;
                                                            continue;
                                                            continue;
                                                    }
                                                    i36 = 1508588;
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    String strM6165 = C0319.m6161((AppConfig) C0470.m9145(C0022.m429(C0421.m8257(mainViewModelM306))));
                                    C0034.m673();
                                    String strM85910 = C0441.m8591(this);
                                    i29 = 1509549;
                                    while (true) {
                                        i29 ^= 1509566;
                                        switch (i29) {
                                            case 19:
                                                if (zM4794) {
                                                }
                                                break;
                                            case 85:
                                                i30 = 3;
                                                break;
                                            case 114:
                                                break;
                                            case 436:
                                                i30 = 24;
                                                i32 = 1509673;
                                                while (true) {
                                                    i32 ^= 1509690;
                                                    switch (i32) {
                                                        case 19:
                                                            i32 = 1510355;
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
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    f0 f0Var5 = new f0(mainViewModelM306, zM4794);
                                    this.f6260b = str;
                                    this.f6266o = 3;
                                    objM4491 = C0234.m4491(C0179.m3411(), new a5.d0(i30, iM1325, strM6165, strM85910, null, f0Var5), this);
                                    i31 = 1510448;
                                    while (true) {
                                        i31 ^= 1510465;
                                        switch (i31) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 47:
                                                break;
                                            case 113:
                                                if (objM4491 == aVarM5767) {
                                                }
                                                break;
                                            case 204:
                                                return aVarM5767;
                                            default:
                                                break;
                                        }
                                    }
                                    a5.b0 b0Var5 = (a5.b0) objM4491;
                                    zM6067 = C0314.m6067(b0Var5);
                                    strM5281 = C0275.m5281(b0Var5);
                                    i38 = 1510572;
                                    while (true) {
                                        i38 ^= 1510589;
                                        switch (i38) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (zM6067) {
                                                }
                                                break;
                                            case 87:
                                                i39 = 1516214;
                                                while (true) {
                                                    i39 ^= 1516231;
                                                    switch (i39) {
                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 51:
                                                            break;
                                                        case 113:
                                                            if (!zM4794) {
                                                            }
                                                            break;
                                                        case 468:
                                                            q0 q0VarM2909 = C0151.m2902(mainViewModelM306);
                                                            iM8182 = C0417.m8181(strM5281);
                                                            i40 = 1516338;
                                                            while (true) {
                                                                i40 ^= 1516355;
                                                                switch (i40) {
                                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 51:
                                                                        strM5281 = C0245.m4690(m5340(), 143, C0228.f307 ^ (-930), 2024);
                                                                        break;
                                                                    case 113:
                                                                        if (iM8182 > 0) {
                                                                        }
                                                                        break;
                                                                    case 22444:
                                                                        i41 = 1537294;
                                                                        while (true) {
                                                                            i41 ^= 1537311;
                                                                            switch (i41) {
                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i41 = 1537325;
                                                                                    continue;
                                                                                    continue;
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
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            C0228.m4382(q0VarM2909, strM5281);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0366.m7173(mainViewModelM306);
                                                i51 = 1537418;
                                                while (true) {
                                                    i51 ^= 1537435;
                                                    switch (i51) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (!zM4794) {
                                                            }
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 83:
                                                            return lVarM238;
                                                        case 124:
                                                            q0VarM156 = C0008.m156(mainViewModelM306);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0228.m4382(q0VarM156, C0456.m8876());
                                                i15 = 1537542;
                                                while (true) {
                                                    i15 ^= 1537559;
                                                    switch (i15) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i15 = 1538224;
                                                            break;
                                                        case 3751:
                                                            return lVarM238;
                                                    }
                                                }
                                                break;
                                            case 118:
                                                break;
                                            case 809:
                                                C0014.m280(mainViewModelM306);
                                                jM9263 = C0476.m9263(strM6528);
                                                a5.z zVarM78216 = C0400.m7827(mainViewModelM306);
                                                String strM86914 = C0447.m8697(this);
                                                String strM65215 = C0337.m6528(this);
                                                String strM85911 = C0441.m8591(this);
                                                this.f6260b = str;
                                                this.f6265n = jM9263;
                                                this.f6266o = 4;
                                                objM4230 = C0219.m4230(zVarM78216, strM86914, strM65215, jM9263, strM85911, this);
                                                i42 = 1511347;
                                                while (true) {
                                                    i42 ^= 1511364;
                                                    switch (i42) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            str2 = str;
                                                            break;
                                                        case 119:
                                                            if (objM4230 == aVarM5767) {
                                                            }
                                                            break;
                                                        case 8148:
                                                            return aVarM5767;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                z12 = objM4230 instanceof q8.g;
                                                i43 = 1511471;
                                                while (true) {
                                                    i43 ^= 1511488;
                                                    switch (i43) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            thM9417 = C0484.m9416(objM4230);
                                                            i52 = 1515191;
                                                            while (true) {
                                                                i52 ^= 1515208;
                                                                switch (i52) {
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                        break;
                                                                    case 61:
                                                                        break;
                                                                    case 127:
                                                                        if (thM9417 != null) {
                                                                        }
                                                                        break;
                                                                    case 476:
                                                                        i53 = 1515315;
                                                                        while (true) {
                                                                            i53 ^= 1515332;
                                                                            switch (i53) {
                                                                                case 22:
                                                                                    break;
                                                                                case 53:
                                                                                    break;
                                                                                case 119:
                                                                                    if (!zM4794) {
                                                                                    }
                                                                                    break;
                                                                                case 212:
                                                                                    C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0366.m7173(mainViewModelM306);
                                                                        i54 = 1515439;
                                                                        while (true) {
                                                                            i54 ^= 1515456;
                                                                            switch (i54) {
                                                                                case 111:
                                                                                    i54 = 1516121;
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
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case 15769:
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
                                                            i51 = 1537418;
                                                            while (true) {
                                                                i51 ^= 1537435;
                                                                switch (i51) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (!zM4794) {
                                                                        }
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 83:
                                                                        return lVarM238;
                                                                    case 124:
                                                                        q0VarM156 = C0008.m156(mainViewModelM306);
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            C0228.m4382(q0VarM156, C0456.m8876());
                                                            i15 = 1537542;
                                                            while (true) {
                                                                i15 ^= 1537559;
                                                                switch (i15) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i15 = 1538224;
                                                                        break;
                                                                    case 3751:
                                                                        return lVarM238;
                                                                }
                                                            }
                                                            break;
                                                        case 111:
                                                            if (((((z12 ? 1 : 0) ^ 65535) & 1) | ((z12 ? 1 : 0) & 65534)) != 0) {
                                                            }
                                                            break;
                                                        case 204:
                                                            C0228.m4382(C0107.m2079(mainViewModelM306), C0335.m6483());
                                                            C0228.m4382(C0116.m2242(mainViewModelM306), strM6528);
                                                            C0122.m2359(mainViewModelM306, jM9263 - (0 - C0402.m7869()));
                                                            C0228.m4382(C0151.m2902(mainViewModelM306), strM7042);
                                                            a5.z zVarM78217 = C0400.m7827(mainViewModelM306);
                                                            this.f6260b = str2;
                                                            this.f6261c = objM4230;
                                                            this.f6262d = mainViewModelM306;
                                                            this.f6263e = strM8591;
                                                            this.f6264f = strM8697;
                                                            this.f6266o = 5;
                                                            objM7131 = C0364.m7131(zVarM78217, strM8591, strM7042, this);
                                                            i44 = 1511595;
                                                            while (true) {
                                                                i44 ^= 1511612;
                                                                switch (i44) {
                                                                    case 23:
                                                                        if (objM7131 == aVarM5767) {
                                                                        }
                                                                        break;
                                                                    case 815:
                                                                        return aVarM5767;
                                                                    case 968:
                                                                        mainViewModel = mainViewModelM306;
                                                                        objM8450 = objM4230;
                                                                        strM8169 = strM8697;
                                                                        strM2006 = strM8591;
                                                                        break;
                                                                    case 1001:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            iM8183 = C0417.m8181(str2);
                                                            i45 = 1512370;
                                                            while (true) {
                                                                i45 ^= 1512387;
                                                                switch (i45) {
                                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 51:
                                                                        objM4230 = objM8450;
                                                                        mainViewModel2 = mainViewModel;
                                                                        this.f6260b = objM4230;
                                                                        this.f6261c = mainViewModel2;
                                                                        this.f6262d = null;
                                                                        this.f6263e = null;
                                                                        this.f6264f = null;
                                                                        this.f6266o = 7;
                                                                        objM1165 = C0061.m1165(mainViewModel2, strM8169, strM2006, this);
                                                                        i49 = 1514416;
                                                                        while (true) {
                                                                            i49 ^= 1514433;
                                                                            switch (i49) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case 47:
                                                                                    break;
                                                                                case 113:
                                                                                    if (objM1165 == aVarM5767) {
                                                                                    }
                                                                                    break;
                                                                                case 1369:
                                                                                    return aVarM5767;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0366.m7173(mainViewModel2);
                                                                        thM9417 = C0484.m9416(objM4230);
                                                                        i52 = 1515191;
                                                                        while (true) {
                                                                            i52 ^= 1515208;
                                                                            switch (i52) {
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                    break;
                                                                                case 61:
                                                                                    break;
                                                                                case 127:
                                                                                    if (thM9417 != null) {
                                                                                    }
                                                                                    break;
                                                                                case 476:
                                                                                    i53 = 1515315;
                                                                                    while (true) {
                                                                                        i53 ^= 1515332;
                                                                                        switch (i53) {
                                                                                            case 22:
                                                                                                break;
                                                                                            case 53:
                                                                                                break;
                                                                                            case 119:
                                                                                                if (!zM4794) {
                                                                                                }
                                                                                                break;
                                                                                            case 212:
                                                                                                C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    C0366.m7173(mainViewModelM306);
                                                                                    i54 = 1515439;
                                                                                    while (true) {
                                                                                        i54 ^= 1515456;
                                                                                        switch (i54) {
                                                                                            case 111:
                                                                                                i54 = 1516121;
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
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                            case 15769:
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
                                                                        i51 = 1537418;
                                                                        while (true) {
                                                                            i51 ^= 1537435;
                                                                            switch (i51) {
                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    if (!zM4794) {
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                case 83:
                                                                                    return lVarM238;
                                                                                case 124:
                                                                                    q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0228.m4382(q0VarM156, C0456.m8876());
                                                                        i15 = 1537542;
                                                                        while (true) {
                                                                            i15 ^= 1537559;
                                                                            switch (i15) {
                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i15 = 1538224;
                                                                                    break;
                                                                                case 3751:
                                                                                    return lVarM238;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 113:
                                                                        if (iM8183 > 0) {
                                                                        }
                                                                        break;
                                                                    case 1996:
                                                                        a4.q qVarM30815 = C0161.m3089(mainViewModel);
                                                                        this.f6260b = objM8450;
                                                                        this.f6261c = mainViewModel;
                                                                        this.f6262d = strM2006;
                                                                        this.f6263e = strM8169;
                                                                        this.f6264f = null;
                                                                        this.f6266o = 6;
                                                                        C0014.m280(qVarM30815);
                                                                        objM4492 = C0234.m4491(C0179.m3411(), new a5.a(qVarM30815, str2, null), this);
                                                                        aVarM5766 = C0300.m5766();
                                                                        i46 = 1512494;
                                                                        while (true) {
                                                                            i46 ^= 1512511;
                                                                            switch (i46) {
                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    if (objM4492 == aVarM5766) {
                                                                                    }
                                                                                    break;
                                                                                case 83:
                                                                                    objM4492 = lVarM238;
                                                                                    break;
                                                                                case 114:
                                                                                    break;
                                                                                case 809:
                                                                                    i48 = 1513269;
                                                                                    while (true) {
                                                                                        i48 ^= 1513286;
                                                                                        switch (i48) {
                                                                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                break;
                                                                                            case 115:
                                                                                                i48 = 1513300;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                            default:
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
                                                                        i47 = 1513393;
                                                                        while (true) {
                                                                            i47 ^= 1513410;
                                                                            switch (i47) {
                                                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    break;
                                                                                case 115:
                                                                                    if (objM4492 == aVarM5767) {
                                                                                    }
                                                                                    break;
                                                                                case 4044:
                                                                                    return aVarM5767;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0228.m4382(C0191.m3645(mainViewModel), null);
                                                                        i50 = 1513517;
                                                                        while (true) {
                                                                            i50 ^= 1513534;
                                                                            switch (i50) {
                                                                                case 19:
                                                                                    i50 = 1514199;
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
                                                                                    objM4230 = objM8450;
                                                                                    mainViewModel2 = mainViewModel;
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
                                                                            }
                                                                            this.f6260b = objM4230;
                                                                            this.f6261c = mainViewModel2;
                                                                            this.f6262d = null;
                                                                            this.f6263e = null;
                                                                            this.f6264f = null;
                                                                            this.f6266o = 7;
                                                                            objM1165 = C0061.m1165(mainViewModel2, strM8169, strM2006, this);
                                                                            i49 = 1514416;
                                                                            while (true) {
                                                                                i49 ^= 1514433;
                                                                                switch (i49) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case 47:
                                                                                        break;
                                                                                    case 113:
                                                                                        if (objM1165 == aVarM5767) {
                                                                                        }
                                                                                        break;
                                                                                    case 1369:
                                                                                        return aVarM5767;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            C0366.m7173(mainViewModel2);
                                                                            thM9417 = C0484.m9416(objM4230);
                                                                            i52 = 1515191;
                                                                            while (true) {
                                                                                i52 ^= 1515208;
                                                                                switch (i52) {
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                        break;
                                                                                    case 61:
                                                                                        break;
                                                                                    case 127:
                                                                                        if (thM9417 != null) {
                                                                                        }
                                                                                        break;
                                                                                    case 476:
                                                                                        i53 = 1515315;
                                                                                        while (true) {
                                                                                            i53 ^= 1515332;
                                                                                            switch (i53) {
                                                                                                case 22:
                                                                                                    break;
                                                                                                case 53:
                                                                                                    break;
                                                                                                case 119:
                                                                                                    if (!zM4794) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 212:
                                                                                                    C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        C0366.m7173(mainViewModelM306);
                                                                                        i54 = 1515439;
                                                                                        while (true) {
                                                                                            i54 ^= 1515456;
                                                                                            switch (i54) {
                                                                                                case 111:
                                                                                                    i54 = 1516121;
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
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                case 15769:
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
                                                                            i51 = 1537418;
                                                                            while (true) {
                                                                                i51 ^= 1537435;
                                                                                switch (i51) {
                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        if (!zM4794) {
                                                                                        }
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        break;
                                                                                    case 83:
                                                                                        return lVarM238;
                                                                                    case 124:
                                                                                        q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            C0228.m4382(q0VarM156, C0456.m8876());
                                                                            i15 = 1537542;
                                                                            while (true) {
                                                                                i15 ^= 1537559;
                                                                                switch (i15) {
                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i15 = 1538224;
                                                                                        break;
                                                                                    case 3751:
                                                                                        return lVarM238;
                                                                                }
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
                                }
                                break;
                            case 3:
                                String str4 = (String) C0229.m4394(this);
                                C0330.m6365(obj);
                                int i64 = 49790;
                                while (true) {
                                    i64 ^= 49807;
                                    switch (i64) {
                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            objM4491 = obj;
                                            str = str4;
                                            break;
                                        case 241:
                                            i64 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                    a5.b0 b0Var6 = (a5.b0) objM4491;
                                    zM6067 = C0314.m6067(b0Var6);
                                    strM5281 = C0275.m5281(b0Var6);
                                    i38 = 1510572;
                                    while (true) {
                                        i38 ^= 1510589;
                                        switch (i38) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (zM6067) {
                                                }
                                                break;
                                            case 87:
                                                i39 = 1516214;
                                                while (true) {
                                                    i39 ^= 1516231;
                                                    switch (i39) {
                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 51:
                                                            break;
                                                        case 113:
                                                            if (!zM4794) {
                                                            }
                                                            break;
                                                        case 468:
                                                            q0 q0VarM29010 = C0151.m2902(mainViewModelM306);
                                                            iM8182 = C0417.m8181(strM5281);
                                                            i40 = 1516338;
                                                            while (true) {
                                                                i40 ^= 1516355;
                                                                switch (i40) {
                                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 51:
                                                                        strM5281 = C0245.m4690(m5340(), 143, C0228.f307 ^ (-930), 2024);
                                                                        break;
                                                                    case 113:
                                                                        if (iM8182 > 0) {
                                                                        }
                                                                        break;
                                                                    case 22444:
                                                                        i41 = 1537294;
                                                                        while (true) {
                                                                            i41 ^= 1537311;
                                                                            switch (i41) {
                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i41 = 1537325;
                                                                                    continue;
                                                                                    continue;
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
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            C0228.m4382(q0VarM29010, strM5281);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0366.m7173(mainViewModelM306);
                                                i51 = 1537418;
                                                while (true) {
                                                    i51 ^= 1537435;
                                                    switch (i51) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (!zM4794) {
                                                            }
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 83:
                                                            return lVarM238;
                                                        case 124:
                                                            q0VarM156 = C0008.m156(mainViewModelM306);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0228.m4382(q0VarM156, C0456.m8876());
                                                i15 = 1537542;
                                                while (true) {
                                                    i15 ^= 1537559;
                                                    switch (i15) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i15 = 1538224;
                                                            break;
                                                        case 3751:
                                                            return lVarM238;
                                                    }
                                                }
                                                break;
                                            case 118:
                                                break;
                                            case 809:
                                                C0014.m280(mainViewModelM306);
                                                jM9263 = C0476.m9263(strM6528);
                                                a5.z zVarM78218 = C0400.m7827(mainViewModelM306);
                                                String strM86915 = C0447.m8697(this);
                                                String strM65216 = C0337.m6528(this);
                                                String strM85912 = C0441.m8591(this);
                                                this.f6260b = str;
                                                this.f6265n = jM9263;
                                                this.f6266o = 4;
                                                objM4230 = C0219.m4230(zVarM78218, strM86915, strM65216, jM9263, strM85912, this);
                                                i42 = 1511347;
                                                while (true) {
                                                    i42 ^= 1511364;
                                                    switch (i42) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            str2 = str;
                                                            break;
                                                        case 119:
                                                            if (objM4230 == aVarM5767) {
                                                            }
                                                            break;
                                                        case 8148:
                                                            return aVarM5767;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                z12 = objM4230 instanceof q8.g;
                                                i43 = 1511471;
                                                while (true) {
                                                    i43 ^= 1511488;
                                                    switch (i43) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            thM9417 = C0484.m9416(objM4230);
                                                            i52 = 1515191;
                                                            while (true) {
                                                                i52 ^= 1515208;
                                                                switch (i52) {
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                        break;
                                                                    case 61:
                                                                        break;
                                                                    case 127:
                                                                        if (thM9417 != null) {
                                                                        }
                                                                        break;
                                                                    case 476:
                                                                        i53 = 1515315;
                                                                        while (true) {
                                                                            i53 ^= 1515332;
                                                                            switch (i53) {
                                                                                case 22:
                                                                                    break;
                                                                                case 53:
                                                                                    break;
                                                                                case 119:
                                                                                    if (!zM4794) {
                                                                                    }
                                                                                    break;
                                                                                case 212:
                                                                                    C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0366.m7173(mainViewModelM306);
                                                                        i54 = 1515439;
                                                                        while (true) {
                                                                            i54 ^= 1515456;
                                                                            switch (i54) {
                                                                                case 111:
                                                                                    i54 = 1516121;
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
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case 15769:
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
                                                            i51 = 1537418;
                                                            while (true) {
                                                                i51 ^= 1537435;
                                                                switch (i51) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (!zM4794) {
                                                                        }
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 83:
                                                                        return lVarM238;
                                                                    case 124:
                                                                        q0VarM156 = C0008.m156(mainViewModelM306);
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            C0228.m4382(q0VarM156, C0456.m8876());
                                                            i15 = 1537542;
                                                            while (true) {
                                                                i15 ^= 1537559;
                                                                switch (i15) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i15 = 1538224;
                                                                        break;
                                                                    case 3751:
                                                                        return lVarM238;
                                                                }
                                                            }
                                                            break;
                                                        case 111:
                                                            if (((((z12 ? 1 : 0) ^ 65535) & 1) | ((z12 ? 1 : 0) & 65534)) != 0) {
                                                            }
                                                            break;
                                                        case 204:
                                                            C0228.m4382(C0107.m2079(mainViewModelM306), C0335.m6483());
                                                            C0228.m4382(C0116.m2242(mainViewModelM306), strM6528);
                                                            C0122.m2359(mainViewModelM306, jM9263 - (0 - C0402.m7869()));
                                                            C0228.m4382(C0151.m2902(mainViewModelM306), strM7042);
                                                            a5.z zVarM78219 = C0400.m7827(mainViewModelM306);
                                                            this.f6260b = str2;
                                                            this.f6261c = objM4230;
                                                            this.f6262d = mainViewModelM306;
                                                            this.f6263e = strM8591;
                                                            this.f6264f = strM8697;
                                                            this.f6266o = 5;
                                                            objM7131 = C0364.m7131(zVarM78219, strM8591, strM7042, this);
                                                            i44 = 1511595;
                                                            while (true) {
                                                                i44 ^= 1511612;
                                                                switch (i44) {
                                                                    case 23:
                                                                        if (objM7131 == aVarM5767) {
                                                                        }
                                                                        break;
                                                                    case 815:
                                                                        return aVarM5767;
                                                                    case 968:
                                                                        mainViewModel = mainViewModelM306;
                                                                        objM8450 = objM4230;
                                                                        strM8169 = strM8697;
                                                                        strM2006 = strM8591;
                                                                        break;
                                                                    case 1001:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            iM8183 = C0417.m8181(str2);
                                                            i45 = 1512370;
                                                            while (true) {
                                                                i45 ^= 1512387;
                                                                switch (i45) {
                                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 51:
                                                                        objM4230 = objM8450;
                                                                        mainViewModel2 = mainViewModel;
                                                                        this.f6260b = objM4230;
                                                                        this.f6261c = mainViewModel2;
                                                                        this.f6262d = null;
                                                                        this.f6263e = null;
                                                                        this.f6264f = null;
                                                                        this.f6266o = 7;
                                                                        objM1165 = C0061.m1165(mainViewModel2, strM8169, strM2006, this);
                                                                        i49 = 1514416;
                                                                        while (true) {
                                                                            i49 ^= 1514433;
                                                                            switch (i49) {
                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                    break;
                                                                                case 47:
                                                                                    break;
                                                                                case 113:
                                                                                    if (objM1165 == aVarM5767) {
                                                                                    }
                                                                                    break;
                                                                                case 1369:
                                                                                    return aVarM5767;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0366.m7173(mainViewModel2);
                                                                        thM9417 = C0484.m9416(objM4230);
                                                                        i52 = 1515191;
                                                                        while (true) {
                                                                            i52 ^= 1515208;
                                                                            switch (i52) {
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                    break;
                                                                                case 61:
                                                                                    break;
                                                                                case 127:
                                                                                    if (thM9417 != null) {
                                                                                    }
                                                                                    break;
                                                                                case 476:
                                                                                    i53 = 1515315;
                                                                                    while (true) {
                                                                                        i53 ^= 1515332;
                                                                                        switch (i53) {
                                                                                            case 22:
                                                                                                break;
                                                                                            case 53:
                                                                                                break;
                                                                                            case 119:
                                                                                                if (!zM4794) {
                                                                                                }
                                                                                                break;
                                                                                            case 212:
                                                                                                C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    C0366.m7173(mainViewModelM306);
                                                                                    i54 = 1515439;
                                                                                    while (true) {
                                                                                        i54 ^= 1515456;
                                                                                        switch (i54) {
                                                                                            case 111:
                                                                                                i54 = 1516121;
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
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                            case 15769:
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
                                                                        i51 = 1537418;
                                                                        while (true) {
                                                                            i51 ^= 1537435;
                                                                            switch (i51) {
                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    if (!zM4794) {
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                    break;
                                                                                case 83:
                                                                                    return lVarM238;
                                                                                case 124:
                                                                                    q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0228.m4382(q0VarM156, C0456.m8876());
                                                                        i15 = 1537542;
                                                                        while (true) {
                                                                            i15 ^= 1537559;
                                                                            switch (i15) {
                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i15 = 1538224;
                                                                                    break;
                                                                                case 3751:
                                                                                    return lVarM238;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 113:
                                                                        if (iM8183 > 0) {
                                                                        }
                                                                        break;
                                                                    case 1996:
                                                                        a4.q qVarM30816 = C0161.m3089(mainViewModel);
                                                                        this.f6260b = objM8450;
                                                                        this.f6261c = mainViewModel;
                                                                        this.f6262d = strM2006;
                                                                        this.f6263e = strM8169;
                                                                        this.f6264f = null;
                                                                        this.f6266o = 6;
                                                                        C0014.m280(qVarM30816);
                                                                        objM4492 = C0234.m4491(C0179.m3411(), new a5.a(qVarM30816, str2, null), this);
                                                                        aVarM5766 = C0300.m5766();
                                                                        i46 = 1512494;
                                                                        while (true) {
                                                                            i46 ^= 1512511;
                                                                            switch (i46) {
                                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    if (objM4492 == aVarM5766) {
                                                                                    }
                                                                                    break;
                                                                                case 83:
                                                                                    objM4492 = lVarM238;
                                                                                    break;
                                                                                case 114:
                                                                                    break;
                                                                                case 809:
                                                                                    i48 = 1513269;
                                                                                    while (true) {
                                                                                        i48 ^= 1513286;
                                                                                        switch (i48) {
                                                                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                break;
                                                                                            case 115:
                                                                                                i48 = 1513300;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                            default:
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
                                                                        i47 = 1513393;
                                                                        while (true) {
                                                                            i47 ^= 1513410;
                                                                            switch (i47) {
                                                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    break;
                                                                                case 115:
                                                                                    if (objM4492 == aVarM5767) {
                                                                                    }
                                                                                    break;
                                                                                case 4044:
                                                                                    return aVarM5767;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0228.m4382(C0191.m3645(mainViewModel), null);
                                                                        i50 = 1513517;
                                                                        while (true) {
                                                                            i50 ^= 1513534;
                                                                            switch (i50) {
                                                                                case 19:
                                                                                    i50 = 1514199;
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
                                                                                    objM4230 = objM8450;
                                                                                    mainViewModel2 = mainViewModel;
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
                                                                            }
                                                                            this.f6260b = objM4230;
                                                                            this.f6261c = mainViewModel2;
                                                                            this.f6262d = null;
                                                                            this.f6263e = null;
                                                                            this.f6264f = null;
                                                                            this.f6266o = 7;
                                                                            objM1165 = C0061.m1165(mainViewModel2, strM8169, strM2006, this);
                                                                            i49 = 1514416;
                                                                            while (true) {
                                                                                i49 ^= 1514433;
                                                                                switch (i49) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case 47:
                                                                                        break;
                                                                                    case 113:
                                                                                        if (objM1165 == aVarM5767) {
                                                                                        }
                                                                                        break;
                                                                                    case 1369:
                                                                                        return aVarM5767;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            C0366.m7173(mainViewModel2);
                                                                            thM9417 = C0484.m9416(objM4230);
                                                                            i52 = 1515191;
                                                                            while (true) {
                                                                                i52 ^= 1515208;
                                                                                switch (i52) {
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                        break;
                                                                                    case 61:
                                                                                        break;
                                                                                    case 127:
                                                                                        if (thM9417 != null) {
                                                                                        }
                                                                                        break;
                                                                                    case 476:
                                                                                        i53 = 1515315;
                                                                                        while (true) {
                                                                                            i53 ^= 1515332;
                                                                                            switch (i53) {
                                                                                                case 22:
                                                                                                    break;
                                                                                                case 53:
                                                                                                    break;
                                                                                                case 119:
                                                                                                    if (!zM4794) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 212:
                                                                                                    C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        C0366.m7173(mainViewModelM306);
                                                                                        i54 = 1515439;
                                                                                        while (true) {
                                                                                            i54 ^= 1515456;
                                                                                            switch (i54) {
                                                                                                case 111:
                                                                                                    i54 = 1516121;
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
                                                                                                    continue;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                case 15769:
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
                                                                            i51 = 1537418;
                                                                            while (true) {
                                                                                i51 ^= 1537435;
                                                                                switch (i51) {
                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        if (!zM4794) {
                                                                                        }
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        break;
                                                                                    case 83:
                                                                                        return lVarM238;
                                                                                    case 124:
                                                                                        q0VarM156 = C0008.m156(mainViewModelM306);
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            C0228.m4382(q0VarM156, C0456.m8876());
                                                                            i15 = 1537542;
                                                                            while (true) {
                                                                                i15 ^= 1537559;
                                                                                switch (i15) {
                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i15 = 1538224;
                                                                                        break;
                                                                                    case 3751:
                                                                                        return lVarM238;
                                                                                }
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
                                }
                                break;
                            case 4:
                                jM9263 = C0032.m635(this);
                                String str5 = (String) C0229.m4394(this);
                                C0330.m6365(obj);
                                objM4230 = C0362.m7093((q8.h) obj);
                                int i65 = 49666;
                                while (true) {
                                    i65 ^= 49683;
                                    switch (i65) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i65 = 49697;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            str2 = str5;
                                            break;
                                        default:
                                            continue;
                                    }
                                    z12 = objM4230 instanceof q8.g;
                                    i43 = 1511471;
                                    while (true) {
                                        i43 ^= 1511488;
                                        switch (i43) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                thM9417 = C0484.m9416(objM4230);
                                                i52 = 1515191;
                                                while (true) {
                                                    i52 ^= 1515208;
                                                    switch (i52) {
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                            break;
                                                        case 61:
                                                            break;
                                                        case 127:
                                                            if (thM9417 != null) {
                                                            }
                                                            break;
                                                        case 476:
                                                            i53 = 1515315;
                                                            while (true) {
                                                                i53 ^= 1515332;
                                                                switch (i53) {
                                                                    case 22:
                                                                        break;
                                                                    case 53:
                                                                        break;
                                                                    case 119:
                                                                        if (!zM4794) {
                                                                        }
                                                                        break;
                                                                    case 212:
                                                                        C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            C0366.m7173(mainViewModelM306);
                                                            i54 = 1515439;
                                                            while (true) {
                                                                i54 ^= 1515456;
                                                                switch (i54) {
                                                                    case 111:
                                                                        i54 = 1516121;
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
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    case 15769:
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
                                                i51 = 1537418;
                                                while (true) {
                                                    i51 ^= 1537435;
                                                    switch (i51) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (!zM4794) {
                                                            }
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 83:
                                                            return lVarM238;
                                                        case 124:
                                                            q0VarM156 = C0008.m156(mainViewModelM306);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0228.m4382(q0VarM156, C0456.m8876());
                                                i15 = 1537542;
                                                while (true) {
                                                    i15 ^= 1537559;
                                                    switch (i15) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i15 = 1538224;
                                                            break;
                                                        case 3751:
                                                            return lVarM238;
                                                    }
                                                }
                                                break;
                                            case 111:
                                                if (((((z12 ? 1 : 0) ^ 65535) & 1) | ((z12 ? 1 : 0) & 65534)) != 0) {
                                                }
                                                break;
                                            case 204:
                                                C0228.m4382(C0107.m2079(mainViewModelM306), C0335.m6483());
                                                C0228.m4382(C0116.m2242(mainViewModelM306), strM6528);
                                                C0122.m2359(mainViewModelM306, jM9263 - (0 - C0402.m7869()));
                                                C0228.m4382(C0151.m2902(mainViewModelM306), strM7042);
                                                a5.z zVarM782110 = C0400.m7827(mainViewModelM306);
                                                this.f6260b = str2;
                                                this.f6261c = objM4230;
                                                this.f6262d = mainViewModelM306;
                                                this.f6263e = strM8591;
                                                this.f6264f = strM8697;
                                                this.f6266o = 5;
                                                objM7131 = C0364.m7131(zVarM782110, strM8591, strM7042, this);
                                                i44 = 1511595;
                                                while (true) {
                                                    i44 ^= 1511612;
                                                    switch (i44) {
                                                        case 23:
                                                            if (objM7131 == aVarM5767) {
                                                            }
                                                            break;
                                                        case 815:
                                                            return aVarM5767;
                                                        case 968:
                                                            mainViewModel = mainViewModelM306;
                                                            objM8450 = objM4230;
                                                            strM8169 = strM8697;
                                                            strM2006 = strM8591;
                                                            break;
                                                        case 1001:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                iM8183 = C0417.m8181(str2);
                                                i45 = 1512370;
                                                while (true) {
                                                    i45 ^= 1512387;
                                                    switch (i45) {
                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 51:
                                                            objM4230 = objM8450;
                                                            mainViewModel2 = mainViewModel;
                                                            this.f6260b = objM4230;
                                                            this.f6261c = mainViewModel2;
                                                            this.f6262d = null;
                                                            this.f6263e = null;
                                                            this.f6264f = null;
                                                            this.f6266o = 7;
                                                            objM1165 = C0061.m1165(mainViewModel2, strM8169, strM2006, this);
                                                            i49 = 1514416;
                                                            while (true) {
                                                                i49 ^= 1514433;
                                                                switch (i49) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case 47:
                                                                        break;
                                                                    case 113:
                                                                        if (objM1165 == aVarM5767) {
                                                                        }
                                                                        break;
                                                                    case 1369:
                                                                        return aVarM5767;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            C0366.m7173(mainViewModel2);
                                                            thM9417 = C0484.m9416(objM4230);
                                                            i52 = 1515191;
                                                            while (true) {
                                                                i52 ^= 1515208;
                                                                switch (i52) {
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                        break;
                                                                    case 61:
                                                                        break;
                                                                    case 127:
                                                                        if (thM9417 != null) {
                                                                        }
                                                                        break;
                                                                    case 476:
                                                                        i53 = 1515315;
                                                                        while (true) {
                                                                            i53 ^= 1515332;
                                                                            switch (i53) {
                                                                                case 22:
                                                                                    break;
                                                                                case 53:
                                                                                    break;
                                                                                case 119:
                                                                                    if (!zM4794) {
                                                                                    }
                                                                                    break;
                                                                                case 212:
                                                                                    C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0366.m7173(mainViewModelM306);
                                                                        i54 = 1515439;
                                                                        while (true) {
                                                                            i54 ^= 1515456;
                                                                            switch (i54) {
                                                                                case 111:
                                                                                    i54 = 1516121;
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
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case 15769:
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
                                                            i51 = 1537418;
                                                            while (true) {
                                                                i51 ^= 1537435;
                                                                switch (i51) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (!zM4794) {
                                                                        }
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 83:
                                                                        return lVarM238;
                                                                    case 124:
                                                                        q0VarM156 = C0008.m156(mainViewModelM306);
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            C0228.m4382(q0VarM156, C0456.m8876());
                                                            i15 = 1537542;
                                                            while (true) {
                                                                i15 ^= 1537559;
                                                                switch (i15) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i15 = 1538224;
                                                                        break;
                                                                    case 3751:
                                                                        return lVarM238;
                                                                }
                                                            }
                                                            break;
                                                        case 113:
                                                            if (iM8183 > 0) {
                                                            }
                                                            break;
                                                        case 1996:
                                                            a4.q qVarM30817 = C0161.m3089(mainViewModel);
                                                            this.f6260b = objM8450;
                                                            this.f6261c = mainViewModel;
                                                            this.f6262d = strM2006;
                                                            this.f6263e = strM8169;
                                                            this.f6264f = null;
                                                            this.f6266o = 6;
                                                            C0014.m280(qVarM30817);
                                                            objM4492 = C0234.m4491(C0179.m3411(), new a5.a(qVarM30817, str2, null), this);
                                                            aVarM5766 = C0300.m5766();
                                                            i46 = 1512494;
                                                            while (true) {
                                                                i46 ^= 1512511;
                                                                switch (i46) {
                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        if (objM4492 == aVarM5766) {
                                                                        }
                                                                        break;
                                                                    case 83:
                                                                        objM4492 = lVarM238;
                                                                        break;
                                                                    case 114:
                                                                        break;
                                                                    case 809:
                                                                        i48 = 1513269;
                                                                        while (true) {
                                                                            i48 ^= 1513286;
                                                                            switch (i48) {
                                                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case 115:
                                                                                    i48 = 1513300;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                default:
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
                                                            i47 = 1513393;
                                                            while (true) {
                                                                i47 ^= 1513410;
                                                                switch (i47) {
                                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        break;
                                                                    case 115:
                                                                        if (objM4492 == aVarM5767) {
                                                                        }
                                                                        break;
                                                                    case 4044:
                                                                        return aVarM5767;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            C0228.m4382(C0191.m3645(mainViewModel), null);
                                                            i50 = 1513517;
                                                            while (true) {
                                                                i50 ^= 1513534;
                                                                switch (i50) {
                                                                    case 19:
                                                                        i50 = 1514199;
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
                                                                        objM4230 = objM8450;
                                                                        mainViewModel2 = mainViewModel;
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
                                                                }
                                                                this.f6260b = objM4230;
                                                                this.f6261c = mainViewModel2;
                                                                this.f6262d = null;
                                                                this.f6263e = null;
                                                                this.f6264f = null;
                                                                this.f6266o = 7;
                                                                objM1165 = C0061.m1165(mainViewModel2, strM8169, strM2006, this);
                                                                i49 = 1514416;
                                                                while (true) {
                                                                    i49 ^= 1514433;
                                                                    switch (i49) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case 47:
                                                                            break;
                                                                        case 113:
                                                                            if (objM1165 == aVarM5767) {
                                                                            }
                                                                            break;
                                                                        case 1369:
                                                                            return aVarM5767;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0366.m7173(mainViewModel2);
                                                                thM9417 = C0484.m9416(objM4230);
                                                                i52 = 1515191;
                                                                while (true) {
                                                                    i52 ^= 1515208;
                                                                    switch (i52) {
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                            break;
                                                                        case 61:
                                                                            break;
                                                                        case 127:
                                                                            if (thM9417 != null) {
                                                                            }
                                                                            break;
                                                                        case 476:
                                                                            i53 = 1515315;
                                                                            while (true) {
                                                                                i53 ^= 1515332;
                                                                                switch (i53) {
                                                                                    case 22:
                                                                                        break;
                                                                                    case 53:
                                                                                        break;
                                                                                    case 119:
                                                                                        if (!zM4794) {
                                                                                        }
                                                                                        break;
                                                                                    case 212:
                                                                                        C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            C0366.m7173(mainViewModelM306);
                                                                            i54 = 1515439;
                                                                            while (true) {
                                                                                i54 ^= 1515456;
                                                                                switch (i54) {
                                                                                    case 111:
                                                                                        i54 = 1516121;
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
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 15769:
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
                                                                i51 = 1537418;
                                                                while (true) {
                                                                    i51 ^= 1537435;
                                                                    switch (i51) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (!zM4794) {
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 83:
                                                                            return lVarM238;
                                                                        case 124:
                                                                            q0VarM156 = C0008.m156(mainViewModelM306);
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0228.m4382(q0VarM156, C0456.m8876());
                                                                i15 = 1537542;
                                                                while (true) {
                                                                    i15 ^= 1537559;
                                                                    switch (i15) {
                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            i15 = 1538224;
                                                                            break;
                                                                        case 3751:
                                                                            return lVarM238;
                                                                    }
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
                            case 5:
                                strM8169 = C0416.m8169(this);
                                strM2006 = C0102.m2006(this);
                                MainViewModel mainViewModel3 = (MainViewModel) C0259.m4936(this);
                                objM8450 = C0432.m8450(this);
                                String str6 = (String) C0229.m4394(this);
                                C0330.m6365(obj);
                                C0014.m280((q8.h) obj);
                                int i66 = 48891;
                                while (true) {
                                    i66 ^= 48908;
                                    switch (i66) {
                                        case 22:
                                            str2 = str6;
                                            mainViewModel = mainViewModel3;
                                            break;
                                        case 503:
                                            i66 = 48922;
                                            continue;
                                        default:
                                            continue;
                                    }
                                    iM8183 = C0417.m8181(str2);
                                    i45 = 1512370;
                                    while (true) {
                                        i45 ^= 1512387;
                                        switch (i45) {
                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 51:
                                                objM4230 = objM8450;
                                                mainViewModel2 = mainViewModel;
                                                this.f6260b = objM4230;
                                                this.f6261c = mainViewModel2;
                                                this.f6262d = null;
                                                this.f6263e = null;
                                                this.f6264f = null;
                                                this.f6266o = 7;
                                                objM1165 = C0061.m1165(mainViewModel2, strM8169, strM2006, this);
                                                i49 = 1514416;
                                                while (true) {
                                                    i49 ^= 1514433;
                                                    switch (i49) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case 47:
                                                            break;
                                                        case 113:
                                                            if (objM1165 == aVarM5767) {
                                                            }
                                                            break;
                                                        case 1369:
                                                            return aVarM5767;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0366.m7173(mainViewModel2);
                                                thM9417 = C0484.m9416(objM4230);
                                                i52 = 1515191;
                                                while (true) {
                                                    i52 ^= 1515208;
                                                    switch (i52) {
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                            break;
                                                        case 61:
                                                            break;
                                                        case 127:
                                                            if (thM9417 != null) {
                                                            }
                                                            break;
                                                        case 476:
                                                            i53 = 1515315;
                                                            while (true) {
                                                                i53 ^= 1515332;
                                                                switch (i53) {
                                                                    case 22:
                                                                        break;
                                                                    case 53:
                                                                        break;
                                                                    case 119:
                                                                        if (!zM4794) {
                                                                        }
                                                                        break;
                                                                    case 212:
                                                                        C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            C0366.m7173(mainViewModelM306);
                                                            i54 = 1515439;
                                                            while (true) {
                                                                i54 ^= 1515456;
                                                                switch (i54) {
                                                                    case 111:
                                                                        i54 = 1516121;
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
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    case 15769:
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
                                                i51 = 1537418;
                                                while (true) {
                                                    i51 ^= 1537435;
                                                    switch (i51) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (!zM4794) {
                                                            }
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 83:
                                                            return lVarM238;
                                                        case 124:
                                                            q0VarM156 = C0008.m156(mainViewModelM306);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0228.m4382(q0VarM156, C0456.m8876());
                                                i15 = 1537542;
                                                while (true) {
                                                    i15 ^= 1537559;
                                                    switch (i15) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i15 = 1538224;
                                                            break;
                                                        case 3751:
                                                            return lVarM238;
                                                    }
                                                }
                                                break;
                                            case 113:
                                                if (iM8183 > 0) {
                                                }
                                                break;
                                            case 1996:
                                                a4.q qVarM30818 = C0161.m3089(mainViewModel);
                                                this.f6260b = objM8450;
                                                this.f6261c = mainViewModel;
                                                this.f6262d = strM2006;
                                                this.f6263e = strM8169;
                                                this.f6264f = null;
                                                this.f6266o = 6;
                                                C0014.m280(qVarM30818);
                                                objM4492 = C0234.m4491(C0179.m3411(), new a5.a(qVarM30818, str2, null), this);
                                                aVarM5766 = C0300.m5766();
                                                i46 = 1512494;
                                                while (true) {
                                                    i46 ^= 1512511;
                                                    switch (i46) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (objM4492 == aVarM5766) {
                                                            }
                                                            break;
                                                        case 83:
                                                            objM4492 = lVarM238;
                                                            break;
                                                        case 114:
                                                            break;
                                                        case 809:
                                                            i48 = 1513269;
                                                            while (true) {
                                                                i48 ^= 1513286;
                                                                switch (i48) {
                                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 115:
                                                                        i48 = 1513300;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    default:
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
                                                i47 = 1513393;
                                                while (true) {
                                                    i47 ^= 1513410;
                                                    switch (i47) {
                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            break;
                                                        case 115:
                                                            if (objM4492 == aVarM5767) {
                                                            }
                                                            break;
                                                        case 4044:
                                                            return aVarM5767;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0228.m4382(C0191.m3645(mainViewModel), null);
                                                i50 = 1513517;
                                                while (true) {
                                                    i50 ^= 1513534;
                                                    switch (i50) {
                                                        case 19:
                                                            i50 = 1514199;
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
                                                            objM4230 = objM8450;
                                                            mainViewModel2 = mainViewModel;
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
                                                    }
                                                    this.f6260b = objM4230;
                                                    this.f6261c = mainViewModel2;
                                                    this.f6262d = null;
                                                    this.f6263e = null;
                                                    this.f6264f = null;
                                                    this.f6266o = 7;
                                                    objM1165 = C0061.m1165(mainViewModel2, strM8169, strM2006, this);
                                                    i49 = 1514416;
                                                    while (true) {
                                                        i49 ^= 1514433;
                                                        switch (i49) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case 47:
                                                                break;
                                                            case 113:
                                                                if (objM1165 == aVarM5767) {
                                                                }
                                                                break;
                                                            case 1369:
                                                                return aVarM5767;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0366.m7173(mainViewModel2);
                                                    thM9417 = C0484.m9416(objM4230);
                                                    i52 = 1515191;
                                                    while (true) {
                                                        i52 ^= 1515208;
                                                        switch (i52) {
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                break;
                                                            case 61:
                                                                break;
                                                            case 127:
                                                                if (thM9417 != null) {
                                                                }
                                                                break;
                                                            case 476:
                                                                i53 = 1515315;
                                                                while (true) {
                                                                    i53 ^= 1515332;
                                                                    switch (i53) {
                                                                        case 22:
                                                                            break;
                                                                        case 53:
                                                                            break;
                                                                        case 119:
                                                                            if (!zM4794) {
                                                                            }
                                                                            break;
                                                                        case 212:
                                                                            C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0366.m7173(mainViewModelM306);
                                                                i54 = 1515439;
                                                                while (true) {
                                                                    i54 ^= 1515456;
                                                                    switch (i54) {
                                                                        case 111:
                                                                            i54 = 1516121;
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
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                        case 15769:
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
                                                    i51 = 1537418;
                                                    while (true) {
                                                        i51 ^= 1537435;
                                                        switch (i51) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                if (!zM4794) {
                                                                }
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 83:
                                                                return lVarM238;
                                                            case 124:
                                                                q0VarM156 = C0008.m156(mainViewModelM306);
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0228.m4382(q0VarM156, C0456.m8876());
                                                    i15 = 1537542;
                                                    while (true) {
                                                        i15 ^= 1537559;
                                                        switch (i15) {
                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i15 = 1538224;
                                                                break;
                                                            case 3751:
                                                                return lVarM238;
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
                            case 6:
                                strM8169 = C0102.m2006(this);
                                String str7 = (String) C0259.m4936(this);
                                MainViewModel mainViewModel4 = (MainViewModel) C0432.m8450(this);
                                objM8450 = C0229.m4394(this);
                                C0330.m6365(obj);
                                int i67 = 48767;
                                while (true) {
                                    i67 ^= 48784;
                                    switch (i67) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            strM2006 = str7;
                                            mainViewModel = mainViewModel4;
                                            break;
                                        case 239:
                                            i67 = 48798;
                                            continue;
                                        default:
                                            continue;
                                    }
                                    C0228.m4382(C0191.m3645(mainViewModel), null);
                                    i50 = 1513517;
                                    while (true) {
                                        i50 ^= 1513534;
                                        switch (i50) {
                                            case 19:
                                                i50 = 1514199;
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
                                                objM4230 = objM8450;
                                                mainViewModel2 = mainViewModel;
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
                                        }
                                        this.f6260b = objM4230;
                                        this.f6261c = mainViewModel2;
                                        this.f6262d = null;
                                        this.f6263e = null;
                                        this.f6264f = null;
                                        this.f6266o = 7;
                                        objM1165 = C0061.m1165(mainViewModel2, strM8169, strM2006, this);
                                        i49 = 1514416;
                                        while (true) {
                                            i49 ^= 1514433;
                                            switch (i49) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 47:
                                                    break;
                                                case 113:
                                                    if (objM1165 == aVarM5767) {
                                                    }
                                                    break;
                                                case 1369:
                                                    return aVarM5767;
                                                default:
                                                    break;
                                            }
                                        }
                                        C0366.m7173(mainViewModel2);
                                        thM9417 = C0484.m9416(objM4230);
                                        i52 = 1515191;
                                        while (true) {
                                            i52 ^= 1515208;
                                            switch (i52) {
                                                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                    break;
                                                case 61:
                                                    break;
                                                case 127:
                                                    if (thM9417 != null) {
                                                    }
                                                    break;
                                                case 476:
                                                    i53 = 1515315;
                                                    while (true) {
                                                        i53 ^= 1515332;
                                                        switch (i53) {
                                                            case 22:
                                                                break;
                                                            case 53:
                                                                break;
                                                            case 119:
                                                                if (!zM4794) {
                                                                }
                                                                break;
                                                            case 212:
                                                                C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0366.m7173(mainViewModelM306);
                                                    i54 = 1515439;
                                                    while (true) {
                                                        i54 ^= 1515456;
                                                        switch (i54) {
                                                            case 111:
                                                                i54 = 1516121;
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
                                                                continue;
                                                                continue;
                                                                continue;
                                                            case 15769:
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
                                        i51 = 1537418;
                                        while (true) {
                                            i51 ^= 1537435;
                                            switch (i51) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (!zM4794) {
                                                    }
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 83:
                                                    return lVarM238;
                                                case 124:
                                                    q0VarM156 = C0008.m156(mainViewModelM306);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        C0228.m4382(q0VarM156, C0456.m8876());
                                        i15 = 1537542;
                                        while (true) {
                                            i15 ^= 1537559;
                                            switch (i15) {
                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i15 = 1538224;
                                                    break;
                                                case 3751:
                                                    return lVarM238;
                                            }
                                        }
                                    }
                                }
                                break;
                            case 7:
                                mainViewModel2 = (MainViewModel) C0432.m8450(this);
                                objM4230 = C0229.m4394(this);
                                C0330.m6365(obj);
                                int i68 = 1616;
                                while (true) {
                                    i68 ^= 1633;
                                    switch (i68) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 49:
                                            i68 = 1647;
                                            continue;
                                        default:
                                            continue;
                                    }
                                    C0366.m7173(mainViewModel2);
                                    thM9417 = C0484.m9416(objM4230);
                                    i52 = 1515191;
                                    while (true) {
                                        i52 ^= 1515208;
                                        switch (i52) {
                                            case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                break;
                                            case 61:
                                                break;
                                            case 127:
                                                if (thM9417 != null) {
                                                }
                                                break;
                                            case 476:
                                                i53 = 1515315;
                                                while (true) {
                                                    i53 ^= 1515332;
                                                    switch (i53) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            break;
                                                        case 119:
                                                            if (!zM4794) {
                                                            }
                                                            break;
                                                        case 212:
                                                            C0228.m4382(C0151.m2902(mainViewModelM306), C0389.m7613(m5340(), 84, C0170.f194 ^ (-176), 3238));
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0366.m7173(mainViewModelM306);
                                                i54 = 1515439;
                                                while (true) {
                                                    i54 ^= 1515456;
                                                    switch (i54) {
                                                        case 111:
                                                            i54 = 1516121;
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
                                                            continue;
                                                            continue;
                                                            continue;
                                                        case 15769:
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
                                    i51 = 1537418;
                                    while (true) {
                                        i51 ^= 1537435;
                                        switch (i51) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                if (!zM4794) {
                                                }
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 83:
                                                return lVarM238;
                                            case 124:
                                                q0VarM156 = C0008.m156(mainViewModelM306);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    C0228.m4382(q0VarM156, C0456.m8876());
                                    i15 = 1537542;
                                    while (true) {
                                        i15 ^= 1537559;
                                        switch (i15) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i15 = 1538224;
                                                break;
                                            case 3751:
                                                return lVarM238;
                                        }
                                    }
                                }
                                break;
                            default:
                                throw new IllegalStateException(C0371.m7267(m5340(), 7, C0326.f473 ^ 348, 3166));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e10) {
                    int i69 = 1540363;
                    while (true) {
                        i69 ^= 1540380;
                        switch (i69) {
                            case 23:
                                i69 = 1540394;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                        i11 = 1538317;
                        while (true) {
                            i11 ^= 1538334;
                            switch (i11) {
                                case 19:
                                    if (!zM4794) {
                                    }
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 85:
                                    break;
                                case 116:
                                    C0228.m4382(C0151.m2902(mainViewModelM306), C0058.m1102(m5340(), 189, C0398.f668 ^ 708, 2186));
                                    i14 = 1538441;
                                    while (true) {
                                        i14 ^= 1538458;
                                        switch (i14) {
                                            case 19:
                                                i14 = 1538472;
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
                        i12 = 1539340;
                        while (true) {
                            i12 ^= 1539357;
                            switch (i12) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    if (!zM4794) {
                                    }
                                    break;
                                case 54:
                                    break;
                                case 87:
                                    return lVarM238;
                                case 116:
                                    q0VarM156 = C0008.m156(mainViewModelM306);
                                    i13 = 1539464;
                                    while (true) {
                                        i13 ^= 1539481;
                                        switch (i13) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i13 = 1540146;
                                                continue;
                                                continue;
                                            case 64939:
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
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                int i70 = 1514292;
                while (true) {
                    i70 ^= 1514309;
                    switch (i70) {
                        case 22:
                            break;
                        case 113:
                            i70 = 1514323;
                            continue;
                        default:
                            continue;
                    }
                    i10 = 1539216;
                    while (true) {
                        i10 ^= 1539233;
                        switch (i10) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 49:
                                if (!zM4794) {
                                }
                                break;
                            case 76:
                                C0228.m4382(C0008.m156(mainViewModelM306), C0456.m8876());
                                break;
                            case 111:
                                break;
                            default:
                                break;
                        }
                    }
                    throw th;
                }
            }
        } catch (Exception e11) {
        }
    }
}
