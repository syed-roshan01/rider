package k0;

import aa.C0011;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.C0013;
import androidx.compose.foundation.C0026;
import androidx.compose.foundation.text.modifiers.C0025;
import androidx.compose.ui.graphics.C0032;
import androidx.compose.ui.input.pointer.C0034;
import androidx.compose.ui.layout.C0036;
import androidx.compose.ui.platform.C0038;
import androidx.compose.ui.semantics.C0039;
import c3.C0062;
import c3.C0063;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.datatransport.cct.C0078;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.iid.C0171;
import com.google.firebase.ktx.C0179;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0212;
import d5.C0219;
import d7.C0221;
import d9.C0227;
import dagger.hilt.internal.componenttreedeps.C0249;
import dagger.hilt.migration.C0255;
import e2.C0262;
import ea.C0269;
import f.C0270;
import f.C0271;
import g3.C0289;
import h.C0299;
import h4.C0306;
import h5.C0309;
import h7.C0311;
import i6.C0321;
import l3.C0343;
import l6.C0344;
import m7.C0359;
import n9.C0367;
import p4.C0377;
import p7.C0379;
import p8.C0381;
import q1.C0384;
import q2.C0385;
import r1.C0394;
import r4.C0399;
import s2.C0412;
import s7.C0416;
import u.C0429;
import u2.C0434;
import v6.C0448;
import v7.C0449;
import w0.C0455;
import w5.C0464;
import x2.C0468;
import x5.C0471;
import x7.C0472;
import y.C0476;
import y6.C0477;
import y9.C0479;
import z7.C0489;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0.o f8863a;

    static {
        y0.l lVarM4370 = C0227.m4370();
        C0399.m7788();
        f8863a = C0154.m2949(lVarM4370, C0399.m7788());
    }

    /* JADX WARN: Code duplicated, block: B:422:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x0288 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x02fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x0301 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:0x02fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x02ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x02dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:0x031a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x031e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:0x031a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x02e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:0x033d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x035e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x036c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:0x0389 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x0352 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x037f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x0389 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0381 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:0x0377 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0396 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:0x039a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:0x03ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:0x03a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:0x0396 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x03c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x03d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x03d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:580:0x03e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:0x03d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:0x03e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:0x03e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x041a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:0x03e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x03d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x03fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x0404 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x0408 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x0440 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:0x0404 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x0400 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x03f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x0414 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x043c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x040c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x0438 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x049e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x0558 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x04a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:0x0438 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x0430 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x04bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x04c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x04cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:0x04f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:0x04c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:0x04bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:0x04b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:0x04d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:0x04ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x04cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x04e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x04f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x04f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x050b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:0x04f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:0x04e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x04de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x0501 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:0x0505 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x050b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x05d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:0x0507 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:0x0501 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x04f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x0530 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:0x0528 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x054e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x055a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:0x055e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x059c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x055a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x0550 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x0546 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:0x0575 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:0x057b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x057f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:0x05a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x057b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x0577 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x056d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:0x0592 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:0x0598 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x059c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:0x05a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x0598 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:0x0594 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:0x058a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:0x0453 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:0x0457 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:0x045f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:0x0478 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:0x045b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:0x0453 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:0x044b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:0x0474 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:0x0485 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:0x046c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:0x049a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:720:0x048f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:0x0339 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:0x0331 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:0x02dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:0x02d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:236:0x0356. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:244:0x037b. Please report as an issue. */
    public static final void a(h1.c cVar, String str, y0.o oVar, long j10, m0.m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j11;
        y0.o oVar2;
        y0.o oVarM4370;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z10;
        Object objM8078;
        y0 y0VarM2417;
        int i22;
        int i23;
        y0.o oVar3;
        boolean zM740;
        int i24;
        long jM3046;
        boolean zM5158;
        int i25;
        boolean zM5159;
        int i26;
        int i27;
        int i28;
        boolean z11;
        Object objM8079;
        int i29;
        Object mVar2;
        y0.o oVarM758;
        int i30;
        int i31;
        int i32;
        boolean zM1210;
        int i33;
        int iM7181;
        int i34;
        int i35;
        ColorFilter porterDuffColorFilter;
        e1.l lVar;
        int i36;
        e1.l lVar2;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        boolean zM4041;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        boolean zM5148;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        m0.q qVar = (m0.q) mVar;
        C0394.m7698(qVar, (-2142238885) ^ C0087.f121);
        int i54 = 1616;
        while (true) {
            i54 ^= 1633;
            switch (i54) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i54 = ((i11 ^ (-2)) & i11) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    i12 = (C0078.f112 ^ (-92)) | i10;
                    int i55 = 1740;
                    while (true) {
                        i55 ^= 1757;
                        switch (i55) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i55 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    int i56 = C0311.f458;
                    int i57 = 1864;
                    while (true) {
                        i57 ^= 1881;
                        switch (i57) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i57 = ((i56 ^ (-187)) & i10) == 0 ? 48736 : 48705;
                                break;
                            case 47384:
                                i12 = i10;
                                break;
                            case 47417:
                                boolean zM5551 = C0289.m5551(qVar, cVar);
                                int i58 = 48767;
                                while (true) {
                                    i58 ^= 48784;
                                    switch (i58) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i13 = 2;
                                            break;
                                        case 76:
                                            i13 = 4;
                                            int i59 = 48891;
                                            while (true) {
                                                i59 ^= 48908;
                                                switch (i59) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i59 = 48922;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 239:
                                            i58 = zM5551 ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                i12 = (i13 & i10) | (i13 ^ i10);
                                int i60 = 49666;
                                while (true) {
                                    i60 ^= 49683;
                                    switch (i60) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i60 = 49697;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
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
                    break;
                default:
                    break;
            }
        }
        int i61 = C0072.f104;
        int i62 = 49790;
        while (true) {
            i62 ^= 49807;
            switch (i62) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    int i63 = C0343.f613;
                    int i64 = 50689;
                    while (true) {
                        i64 ^= 50706;
                        switch (i64) {
                            case 19:
                                i64 = ((i63 ^ 9) & i10) == 0 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                boolean zM2013 = C0103.m2013(qVar, str);
                                int i65 = 50813;
                                while (true) {
                                    i65 ^= 50830;
                                    switch (i65) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 53:
                                            i14 = 16;
                                            break;
                                        case 243:
                                            i65 = zM2013 ? 51557 : 50875;
                                            break;
                                        case 4075:
                                            i14 = 32;
                                            int i66 = 51588;
                                            while (true) {
                                                i66 ^= 51605;
                                                switch (i66) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i66 = 51619;
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
                                i12 = (i12 & i14) | (i12 ^ i14);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 84:
                    i12 |= C0078.f112 ^ (-110);
                    int i67 = 49914;
                    while (true) {
                        i67 ^= 49931;
                        switch (i67) {
                            case 497:
                                i67 = 50596;
                                continue;
                            case 1711:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 241:
                    i62 = ((i61 ^ 115) & i11) != 0 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
        }
        int i68 = i11 & (C0034.f54 ^ 515);
        int i69 = 51712;
        while (true) {
            i69 ^= 51729;
            switch (i69) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i69 = i68 != 0 ? 51805 : 51774;
                    break;
                case 47:
                    int i70 = C0489.f762;
                    int i71 = 52611;
                    while (true) {
                        i71 ^= 52628;
                        switch (i71) {
                            case 23:
                                i71 = ((i70 ^ (-204)) & i10) == 0 ? 52704 : 52673;
                                break;
                            case 54:
                                break;
                            case 85:
                                i53 = 51836;
                                while (true) {
                                    i53 ^= 51853;
                                    switch (i53) {
                                        case 241:
                                            i53 = 52518;
                                            continue;
                                            continue;
                                        case 1963:
                                            break;
                                        default:
                                            continue;
                                            continue;
                                    }
                                }
                                break;
                            case 116:
                                boolean zM2014 = C0103.m2013(qVar, oVar);
                                int i72 = 52735;
                                while (true) {
                                    i72 ^= 52752;
                                    switch (i72) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i15 = 128;
                                            break;
                                        case 1007:
                                            i72 = zM2014 ? 53479 : 52797;
                                            break;
                                        case 7927:
                                            i15 = 256;
                                            int i73 = 53510;
                                            while (true) {
                                                i73 ^= 53527;
                                                switch (i73) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i73 = 53541;
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
                                i12 = (i12 & i15) | (i12 ^ i15);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 76:
                    i12 |= C0121.f147 ^ 982;
                    i53 = 51836;
                    while (true) {
                        i53 ^= 51853;
                        switch (i53) {
                            case 241:
                                i53 = 52518;
                                continue;
                                continue;
                            case 1963:
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
            int i74 = C0384.f654;
            int i75 = 53634;
            while (true) {
                i75 ^= 53651;
                switch (i75) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i75 = ((i74 ^ (-3126)) & i10) == 0 ? 53727 : 53696;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                    case 76:
                        int i76 = C0026.f46;
                        int i77 = 53758;
                        while (true) {
                            i77 ^= 53775;
                            switch (i77) {
                                case 1009:
                                    if (((i76 ^ (-305)) & i11) == 0) {
                                        i77 = 54502;
                                    }
                                    break;
                                case 1703:
                                    break;
                                case 1736:
                                    i52 = 1024;
                                    break;
                                case 1769:
                                    boolean zM4042 = C0212.m4041(qVar, j10);
                                    int i78 = 54533;
                                    while (true) {
                                        i78 ^= 54550;
                                        switch (i78) {
                                            case 19:
                                                if (zM4042) {
                                                    i78 = 54626;
                                                }
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 85:
                                                i52 = 1024;
                                                break;
                                            case 116:
                                                i52 = 2048;
                                                int i79 = 54657;
                                                while (true) {
                                                    i79 ^= 54674;
                                                    switch (i79) {
                                                        case 19:
                                                            i79 = 54688;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i78 = 54595;
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i77 = 54471;
                        }
                        int i80 = (i12 & i52) | (i12 ^ i52);
                        int i81 = 55432;
                        while (true) {
                            i81 ^= 55449;
                            switch (i81) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i81 = 55463;
                                    continue;
                                case 62:
                                    i16 = i80;
                                    break;
                                default:
                                    continue;
                            }
                        }
                        break;
                    case 83:
                        i16 = i12;
                        break;
                    default:
                        break;
                }
            }
            int i82 = C0090.f124;
            int i83 = 55556;
            while (true) {
                i83 ^= 55573;
                switch (i83) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i83 = ((i82 ^ 1993) & i16) == 1170 ? 55649 : 55618;
                        break;
                    case 54:
                        break;
                    case 87:
                        C0309.m5960(qVar);
                        oVarM4370 = C0227.m4370();
                        i17 = 1507503;
                        while (true) {
                            i17 ^= 1507520;
                            switch (i17) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    i44 = 1509425;
                                    while (true) {
                                        i44 ^= 1509442;
                                        switch (i44) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                break;
                                            case 115:
                                                i44 = i68 != 0 ? 1509518 : 1509487;
                                                break;
                                            case 204:
                                                oVar = oVarM4370;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    i45 = C0179.f203;
                                    i46 = 1509549;
                                    while (true) {
                                        i46 ^= 1509566;
                                        switch (i46) {
                                            case 19:
                                                i46 = ((i45 ^ 567) & i11) != 0 ? 1509642 : 1509611;
                                                break;
                                            case 85:
                                                break;
                                            case 114:
                                                break;
                                            case 436:
                                                j10 = C0455.m8864((e1.r) C0476.m9256(qVar, C0112.m2168()));
                                                i47 = 1509673;
                                                while (true) {
                                                    i47 ^= 1509690;
                                                    switch (i47) {
                                                        case 19:
                                                            i47 = 1510355;
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
                                                    }
                                                    i16 &= C0116.f142 ^ (-7405);
                                                    break;
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case 111:
                                    i17 = ((i10 ^ (-2)) & i10) != 0 ? 1507596 : 1507565;
                                    break;
                                case 460:
                                    zM5148 = C0270.m5148(qVar);
                                    i48 = 1507627;
                                    while (true) {
                                        i48 ^= 1507644;
                                        switch (i48) {
                                            case 23:
                                                i48 = zM5148 ? 1507720 : 1507689;
                                                break;
                                            case 85:
                                                C0471.m9156(qVar);
                                                i49 = C0269.f348;
                                                i50 = 1508526;
                                                while (true) {
                                                    i50 ^= 1508543;
                                                    switch (i50) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i50 = ((i49 ^ 758) & i11) != 0 ? 1508619 : 1508588;
                                                            break;
                                                        case 83:
                                                            break;
                                                        case 114:
                                                            break;
                                                        case 436:
                                                            i16 &= C0116.f142 ^ (-7405);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 118:
                                                break;
                                            case 180:
                                                i51 = 1507751;
                                                while (true) {
                                                    i51 ^= 1507768;
                                                    switch (i51) {
                                                        case 31:
                                                            i51 = 1508433;
                                                            continue;
                                                            continue;
                                                        case 1513:
                                                            break;
                                                        default:
                                                            continue;
                                                            continue;
                                                    }
                                                    i44 = 1509425;
                                                    while (true) {
                                                        i44 ^= 1509442;
                                                        switch (i44) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                break;
                                                            case 115:
                                                                if (i68 != 0) {
                                                                }
                                                                break;
                                                            case 204:
                                                                oVar = oVarM4370;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    i45 = C0179.f203;
                                                    i46 = 1509549;
                                                    while (true) {
                                                        i46 ^= 1509566;
                                                        switch (i46) {
                                                            case 19:
                                                                if (((i45 ^ 567) & i11) != 0) {
                                                                }
                                                                break;
                                                            case 85:
                                                                break;
                                                            case 114:
                                                                break;
                                                            case 436:
                                                                j10 = C0455.m8864((e1.r) C0476.m9256(qVar, C0112.m2168()));
                                                                i47 = 1509673;
                                                                while (true) {
                                                                    i47 ^= 1509690;
                                                                    switch (i47) {
                                                                        case 19:
                                                                            i47 = 1510355;
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
                                                                    }
                                                                    i16 &= C0116.f142 ^ (-7405);
                                                                    break;
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
                                    break;
                                default:
                                    break;
                            }
                            i18 = 1508650;
                            while (true) {
                                i18 ^= 1508667;
                                switch (i18) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i18 = 1508681;
                                        continue;
                                        continue;
                                    case 114:
                                        C0103.m2025(qVar);
                                        C0262.m4990(qVar, (-69357243) ^ C0434.f704);
                                        i19 = C0032.f52;
                                        i20 = C0379.f649;
                                        i21 = 1510448;
                                        while (true) {
                                            i21 ^= 1510465;
                                            switch (i21) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 47:
                                                    i41 = C0472.f742;
                                                    i42 = 1511347;
                                                    while (true) {
                                                        i42 ^= 1511364;
                                                        switch (i42) {
                                                            case 22:
                                                                break;
                                                            case 53:
                                                                z10 = false;
                                                                break;
                                                            case 119:
                                                                i42 = ((i41 ^ 3196) & i16) == 2048 ? 1511440 : 1511409;
                                                                break;
                                                            case 8148:
                                                                z10 = true;
                                                                i40 = 1511471;
                                                                while (true) {
                                                                    i40 ^= 1511488;
                                                                    switch (i40) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case 111:
                                                                            i40 = 1511502;
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
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 113:
                                                    i21 = (((i19 ^ (-7906)) & i16) ^ (i20 ^ (-3956))) > 2048 ? 1510541 : 1510510;
                                                    break;
                                                case 204:
                                                    zM4041 = C0212.m4041(qVar, j10);
                                                    i43 = 1510572;
                                                    while (true) {
                                                        i43 ^= 1510589;
                                                        switch (i43) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i43 = !zM4041 ? 1511316 : 1510634;
                                                                break;
                                                            case 87:
                                                                z10 = true;
                                                                i40 = 1511471;
                                                                while (true) {
                                                                    i40 ^= 1511488;
                                                                    switch (i40) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case 111:
                                                                            i40 = 1511502;
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
                                                                    }
                                                                }
                                                                break;
                                                            case 118:
                                                                break;
                                                            case 809:
                                                                i41 = C0472.f742;
                                                                i42 = 1511347;
                                                                while (true) {
                                                                    i42 ^= 1511364;
                                                                    switch (i42) {
                                                                        case 22:
                                                                            break;
                                                                        case 53:
                                                                            z10 = false;
                                                                            break;
                                                                        case 119:
                                                                            if (((i41 ^ 3196) & i16) == 2048) {
                                                                            }
                                                                            break;
                                                                        case 8148:
                                                                            z10 = true;
                                                                            i40 = 1511471;
                                                                            while (true) {
                                                                                i40 ^= 1511488;
                                                                                switch (i40) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case 111:
                                                                                        i40 = 1511502;
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
                                            objM8078 = C0412.m8078(qVar);
                                            y0VarM2417 = C0125.m2417();
                                            i22 = 1511595;
                                            while (true) {
                                                i22 ^= 1511612;
                                                switch (i22) {
                                                    case 23:
                                                        i22 = !z10 ? 1512339 : 1512308;
                                                        break;
                                                    case 815:
                                                        i39 = 1512370;
                                                        while (true) {
                                                            i39 ^= 1512387;
                                                            switch (i39) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 51:
                                                                    break;
                                                                case 113:
                                                                    i39 = objM8078 == y0VarM2417 ? 1512463 : 1512432;
                                                                    break;
                                                                case 1996:
                                                                    zM1210 = C0063.m1210(j10, C0011.m220());
                                                                    i33 = 1512494;
                                                                    while (true) {
                                                                        i33 ^= 1512511;
                                                                        switch (i33) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i33 = zM1210 ? 1513238 : 1512556;
                                                                                break;
                                                                            case 83:
                                                                                iM7181 = C0367.m7181();
                                                                                i34 = C0036.f56 ^ 47;
                                                                                i35 = 1513393;
                                                                                while (true) {
                                                                                    i35 ^= 1513410;
                                                                                    switch (i35) {
                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                            porterDuffColorFilter = new PorterDuffColorFilter(C0299.m5743(j10), C0025.m498(i34));
                                                                                            break;
                                                                                        case 115:
                                                                                            i35 = iM7181 >= 29 ? 1513486 : 1513455;
                                                                                            break;
                                                                                        case 4044:
                                                                                            porterDuffColorFilter = C0185.m3535(C0116.m2231(), j10, i34);
                                                                                            i37 = 1513517;
                                                                                            while (true) {
                                                                                                i37 ^= 1513534;
                                                                                                switch (i37) {
                                                                                                    case 19:
                                                                                                        i37 = 1514199;
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
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                lVar = new e1.l(j10, i34, porterDuffColorFilter);
                                                                                i36 = 1514292;
                                                                                while (true) {
                                                                                    i36 ^= 1514309;
                                                                                    switch (i36) {
                                                                                        case 22:
                                                                                            lVar2 = lVar;
                                                                                            break;
                                                                                        case 113:
                                                                                            i36 = 1514323;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 114:
                                                                                break;
                                                                            case 809:
                                                                                lVar2 = null;
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    i38 = 1513269;
                                                                    while (true) {
                                                                        i38 ^= 1513286;
                                                                        switch (i38) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                C0479.m9328(qVar, lVar2);
                                                                                objM8078 = lVar2;
                                                                                break;
                                                                            case 115:
                                                                                i38 = 1513300;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
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
                                                    case 968:
                                                        zM1210 = C0063.m1210(j10, C0011.m220());
                                                        i33 = 1512494;
                                                        while (true) {
                                                            i33 ^= 1512511;
                                                            switch (i33) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (zM1210) {
                                                                    }
                                                                    break;
                                                                case 83:
                                                                    iM7181 = C0367.m7181();
                                                                    i34 = C0036.f56 ^ 47;
                                                                    i35 = 1513393;
                                                                    while (true) {
                                                                        i35 ^= 1513410;
                                                                        switch (i35) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                porterDuffColorFilter = new PorterDuffColorFilter(C0299.m5743(j10), C0025.m498(i34));
                                                                                break;
                                                                            case 115:
                                                                                if (iM7181 >= 29) {
                                                                                }
                                                                                break;
                                                                            case 4044:
                                                                                porterDuffColorFilter = C0185.m3535(C0116.m2231(), j10, i34);
                                                                                i37 = 1513517;
                                                                                while (true) {
                                                                                    i37 ^= 1513534;
                                                                                    switch (i37) {
                                                                                        case 19:
                                                                                            i37 = 1514199;
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
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    lVar = new e1.l(j10, i34, porterDuffColorFilter);
                                                                    i36 = 1514292;
                                                                    while (true) {
                                                                        i36 ^= 1514309;
                                                                        switch (i36) {
                                                                            case 22:
                                                                                lVar2 = lVar;
                                                                                break;
                                                                            case 113:
                                                                                i36 = 1514323;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 114:
                                                                    break;
                                                                case 809:
                                                                    lVar2 = null;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        i38 = 1513269;
                                                        while (true) {
                                                            i38 ^= 1513286;
                                                            switch (i38) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    C0479.m9328(qVar, lVar2);
                                                                    objM8078 = lVar2;
                                                                    break;
                                                                case 115:
                                                                    i38 = 1513300;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 1001:
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                e1.l lVar3 = (e1.l) objM8078;
                                                C0171.m3270(qVar, false);
                                                C0262.m4990(qVar, (-69357374) ^ C0490.f763);
                                                i23 = 1514416;
                                                while (true) {
                                                    i23 ^= 1514433;
                                                    switch (i23) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case 47:
                                                            oVar3 = oVarM4370;
                                                            break;
                                                        case 113:
                                                            i23 = str != null ? 1515160 : 1514478;
                                                            break;
                                                        case 1369:
                                                            C0262.m4990(qVar, (-69356784) ^ C0468.f738);
                                                            i27 = C0212.f235;
                                                            i28 = 1515191;
                                                            while (true) {
                                                                i28 ^= 1515208;
                                                                switch (i28) {
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                        break;
                                                                    case 61:
                                                                        z11 = false;
                                                                        break;
                                                                    case 127:
                                                                        i28 = ((i27 ^ 602) & i16) == 32 ? 1515284 : 1515253;
                                                                        break;
                                                                    case 476:
                                                                        z11 = true;
                                                                        i32 = 1515315;
                                                                        while (true) {
                                                                            i32 ^= 1515332;
                                                                            switch (i32) {
                                                                                case 22:
                                                                                    break;
                                                                                case 119:
                                                                                    i32 = 1515346;
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
                                                            objM8079 = C0412.m8078(qVar);
                                                            i29 = 1515439;
                                                            while (true) {
                                                                i29 ^= 1515456;
                                                                switch (i29) {
                                                                    case 111:
                                                                        i29 = !z11 ? 1516183 : 1516152;
                                                                        break;
                                                                    case 15703:
                                                                        i31 = 1516214;
                                                                        while (true) {
                                                                            i31 ^= 1516231;
                                                                            switch (i31) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case 51:
                                                                                    mVar2 = objM8079;
                                                                                    break;
                                                                                case 113:
                                                                                    i31 = objM8079 == y0VarM2417 ? 1516307 : 1516276;
                                                                                    break;
                                                                                case 468:
                                                                                    mVar2 = new m(str, 1);
                                                                                    C0479.m9328(qVar, mVar2);
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 15769:
                                                                        break;
                                                                    case 15800:
                                                                        mVar2 = new m(str, 1);
                                                                        C0479.m9328(qVar, mVar2);
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            C0171.m3270(qVar, false);
                                                            oVarM758 = C0039.m758(oVarM4370, false, (c9.c) mVar2);
                                                            i30 = 1516338;
                                                            while (true) {
                                                                i30 ^= 1516355;
                                                                switch (i30) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        oVar3 = oVarM758;
                                                                        break;
                                                                    case 113:
                                                                        i30 = 1516369;
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                C0171.m3270(qVar, false);
                                                zM740 = C0038.m740(C0159.m3046(cVar), C0158.m3015());
                                                i24 = 1537294;
                                                while (true) {
                                                    i24 ^= 1537311;
                                                    switch (i24) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i24 = !zM740 ? 1537387 : 1537356;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 83:
                                                            oVarM4370 = C0464.m9021();
                                                            break;
                                                        case 116:
                                                            jM3046 = C0159.m3046(cVar);
                                                            zM5158 = C0271.m5158(C0344.m6741(jM3046));
                                                            i25 = 1537418;
                                                            while (true) {
                                                                i25 ^= 1537435;
                                                                switch (i25) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i25 = zM5158 ? 1537511 : 1537480;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    case 83:
                                                                        break;
                                                                    case 124:
                                                                        zM5159 = C0271.m5158(C0416.m8158(jM3046));
                                                                        i26 = 1537542;
                                                                        while (true) {
                                                                            i26 ^= 1537559;
                                                                            switch (i26) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    i26 = zM5159 ? 1538286 : 1538255;
                                                                                    break;
                                                                                case 3751:
                                                                                    break;
                                                                                case 3800:
                                                                                    break;
                                                                                case 3833:
                                                                                    oVarM4370 = C0464.m9021();
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
                                                C0221.m4245(C0449.m8743(C0306.m5888(C0449.m8743(oVar, oVarM4370), cVar, null, C0162.m3098(), 0.0f, lVar3, 22), oVar3), qVar, 0);
                                                oVar2 = oVar;
                                                j11 = j10;
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        continue;
                                        continue;
                                }
                            }
                        }
                        break;
                    case 116:
                        boolean zM1625 = C0074.m1625(qVar);
                        int i84 = 55680;
                        while (true) {
                            i84 ^= 55697;
                            switch (i84) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i84 = !zM1625 ? 56424 : 56393;
                                    break;
                                case 1467:
                                    break;
                                case 1496:
                                    C0471.m9156(qVar);
                                    int i85 = 56579;
                                    while (true) {
                                        i85 ^= 56596;
                                        switch (i85) {
                                            case 23:
                                                i85 = 56610;
                                                continue;
                                            case 54:
                                                oVar2 = oVar;
                                                j11 = j10;
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                case 1529:
                                    int i86 = 56455;
                                    while (true) {
                                        i86 ^= 56472;
                                        switch (i86) {
                                            case 31:
                                                i86 = 56486;
                                                continue;
                                            case 62:
                                                break;
                                            default:
                                                continue;
                                        }
                                        C0309.m5960(qVar);
                                        oVarM4370 = C0227.m4370();
                                        i17 = 1507503;
                                        while (true) {
                                            i17 ^= 1507520;
                                            switch (i17) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    i44 = 1509425;
                                                    while (true) {
                                                        i44 ^= 1509442;
                                                        switch (i44) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                break;
                                                            case 115:
                                                                if (i68 != 0) {
                                                                }
                                                                break;
                                                            case 204:
                                                                oVar = oVarM4370;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    i45 = C0179.f203;
                                                    i46 = 1509549;
                                                    while (true) {
                                                        i46 ^= 1509566;
                                                        switch (i46) {
                                                            case 19:
                                                                if (((i45 ^ 567) & i11) != 0) {
                                                                }
                                                                break;
                                                            case 85:
                                                                break;
                                                            case 114:
                                                                break;
                                                            case 436:
                                                                j10 = C0455.m8864((e1.r) C0476.m9256(qVar, C0112.m2168()));
                                                                i47 = 1509673;
                                                                while (true) {
                                                                    i47 ^= 1509690;
                                                                    switch (i47) {
                                                                        case 19:
                                                                            i47 = 1510355;
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
                                                                    }
                                                                    i16 &= C0116.f142 ^ (-7405);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 111:
                                                    if (((i10 ^ (-2)) & i10) != 0) {
                                                    }
                                                    break;
                                                case 460:
                                                    zM5148 = C0270.m5148(qVar);
                                                    i48 = 1507627;
                                                    while (true) {
                                                        i48 ^= 1507644;
                                                        switch (i48) {
                                                            case 23:
                                                                if (zM5148) {
                                                                }
                                                                break;
                                                            case 85:
                                                                C0471.m9156(qVar);
                                                                i49 = C0269.f348;
                                                                i50 = 1508526;
                                                                while (true) {
                                                                    i50 ^= 1508543;
                                                                    switch (i50) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (((i49 ^ 758) & i11) != 0) {
                                                                            }
                                                                            break;
                                                                        case 83:
                                                                            break;
                                                                        case 114:
                                                                            break;
                                                                        case 436:
                                                                            i16 &= C0116.f142 ^ (-7405);
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 118:
                                                                break;
                                                            case 180:
                                                                i51 = 1507751;
                                                                while (true) {
                                                                    i51 ^= 1507768;
                                                                    switch (i51) {
                                                                        case 31:
                                                                            i51 = 1508433;
                                                                            continue;
                                                                            continue;
                                                                        case 1513:
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                    }
                                                                    i44 = 1509425;
                                                                    while (true) {
                                                                        i44 ^= 1509442;
                                                                        switch (i44) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                break;
                                                                            case 115:
                                                                                if (i68 != 0) {
                                                                                }
                                                                                break;
                                                                            case 204:
                                                                                oVar = oVarM4370;
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    i45 = C0179.f203;
                                                                    i46 = 1509549;
                                                                    while (true) {
                                                                        i46 ^= 1509566;
                                                                        switch (i46) {
                                                                            case 19:
                                                                                if (((i45 ^ 567) & i11) != 0) {
                                                                                }
                                                                                break;
                                                                            case 85:
                                                                                break;
                                                                            case 114:
                                                                                break;
                                                                            case 436:
                                                                                j10 = C0455.m8864((e1.r) C0476.m9256(qVar, C0112.m2168()));
                                                                                i47 = 1509673;
                                                                                while (true) {
                                                                                    i47 ^= 1509690;
                                                                                    switch (i47) {
                                                                                        case 19:
                                                                                            i47 = 1510355;
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
                                                                                    }
                                                                                    i16 &= C0116.f142 ^ (-7405);
                                                                                    break;
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
                                                    break;
                                                default:
                                                    break;
                                            }
                                            i18 = 1508650;
                                            while (true) {
                                                i18 ^= 1508667;
                                                switch (i18) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i18 = 1508681;
                                                        continue;
                                                        continue;
                                                    case 114:
                                                        C0103.m2025(qVar);
                                                        C0262.m4990(qVar, (-69357243) ^ C0434.f704);
                                                        i19 = C0032.f52;
                                                        i20 = C0379.f649;
                                                        i21 = 1510448;
                                                        while (true) {
                                                            i21 ^= 1510465;
                                                            switch (i21) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 47:
                                                                    i41 = C0472.f742;
                                                                    i42 = 1511347;
                                                                    while (true) {
                                                                        i42 ^= 1511364;
                                                                        switch (i42) {
                                                                            case 22:
                                                                                break;
                                                                            case 53:
                                                                                z10 = false;
                                                                                break;
                                                                            case 119:
                                                                                if (((i41 ^ 3196) & i16) == 2048) {
                                                                                }
                                                                                break;
                                                                            case 8148:
                                                                                z10 = true;
                                                                                i40 = 1511471;
                                                                                while (true) {
                                                                                    i40 ^= 1511488;
                                                                                    switch (i40) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case 111:
                                                                                            i40 = 1511502;
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
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 113:
                                                                    if ((((i19 ^ (-7906)) & i16) ^ (i20 ^ (-3956))) > 2048) {
                                                                    }
                                                                    break;
                                                                case 204:
                                                                    zM4041 = C0212.m4041(qVar, j10);
                                                                    i43 = 1510572;
                                                                    while (true) {
                                                                        i43 ^= 1510589;
                                                                        switch (i43) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (!zM4041) {
                                                                                }
                                                                                break;
                                                                            case 87:
                                                                                z10 = true;
                                                                                i40 = 1511471;
                                                                                while (true) {
                                                                                    i40 ^= 1511488;
                                                                                    switch (i40) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case 111:
                                                                                            i40 = 1511502;
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
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 118:
                                                                                break;
                                                                            case 809:
                                                                                i41 = C0472.f742;
                                                                                i42 = 1511347;
                                                                                while (true) {
                                                                                    i42 ^= 1511364;
                                                                                    switch (i42) {
                                                                                        case 22:
                                                                                            break;
                                                                                        case 53:
                                                                                            z10 = false;
                                                                                            break;
                                                                                        case 119:
                                                                                            if (((i41 ^ 3196) & i16) == 2048) {
                                                                                            }
                                                                                            break;
                                                                                        case 8148:
                                                                                            z10 = true;
                                                                                            i40 = 1511471;
                                                                                            while (true) {
                                                                                                i40 ^= 1511488;
                                                                                                switch (i40) {
                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                        break;
                                                                                                    case 111:
                                                                                                        i40 = 1511502;
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
                                                            objM8078 = C0412.m8078(qVar);
                                                            y0VarM2417 = C0125.m2417();
                                                            i22 = 1511595;
                                                            while (true) {
                                                                i22 ^= 1511612;
                                                                switch (i22) {
                                                                    case 23:
                                                                        if (!z10) {
                                                                        }
                                                                        break;
                                                                    case 815:
                                                                        i39 = 1512370;
                                                                        while (true) {
                                                                            i39 ^= 1512387;
                                                                            switch (i39) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case 51:
                                                                                    break;
                                                                                case 113:
                                                                                    if (objM8078 == y0VarM2417) {
                                                                                    }
                                                                                    break;
                                                                                case 1996:
                                                                                    zM1210 = C0063.m1210(j10, C0011.m220());
                                                                                    i33 = 1512494;
                                                                                    while (true) {
                                                                                        i33 ^= 1512511;
                                                                                        switch (i33) {
                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                if (zM1210) {
                                                                                                }
                                                                                                break;
                                                                                            case 83:
                                                                                                iM7181 = C0367.m7181();
                                                                                                i34 = C0036.f56 ^ 47;
                                                                                                i35 = 1513393;
                                                                                                while (true) {
                                                                                                    i35 ^= 1513410;
                                                                                                    switch (i35) {
                                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                            break;
                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                            porterDuffColorFilter = new PorterDuffColorFilter(C0299.m5743(j10), C0025.m498(i34));
                                                                                                            break;
                                                                                                        case 115:
                                                                                                            if (iM7181 >= 29) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 4044:
                                                                                                            porterDuffColorFilter = C0185.m3535(C0116.m2231(), j10, i34);
                                                                                                            i37 = 1513517;
                                                                                                            while (true) {
                                                                                                                i37 ^= 1513534;
                                                                                                                switch (i37) {
                                                                                                                    case 19:
                                                                                                                        i37 = 1514199;
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
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                lVar = new e1.l(j10, i34, porterDuffColorFilter);
                                                                                                i36 = 1514292;
                                                                                                while (true) {
                                                                                                    i36 ^= 1514309;
                                                                                                    switch (i36) {
                                                                                                        case 22:
                                                                                                            lVar2 = lVar;
                                                                                                            break;
                                                                                                        case 113:
                                                                                                            i36 = 1514323;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                        default:
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 114:
                                                                                                break;
                                                                                            case 809:
                                                                                                lVar2 = null;
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    i38 = 1513269;
                                                                                    while (true) {
                                                                                        i38 ^= 1513286;
                                                                                        switch (i38) {
                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                C0479.m9328(qVar, lVar2);
                                                                                                objM8078 = lVar2;
                                                                                                break;
                                                                                            case 115:
                                                                                                i38 = 1513300;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
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
                                                                    case 968:
                                                                        zM1210 = C0063.m1210(j10, C0011.m220());
                                                                        i33 = 1512494;
                                                                        while (true) {
                                                                            i33 ^= 1512511;
                                                                            switch (i33) {
                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                    if (zM1210) {
                                                                                    }
                                                                                    break;
                                                                                case 83:
                                                                                    iM7181 = C0367.m7181();
                                                                                    i34 = C0036.f56 ^ 47;
                                                                                    i35 = 1513393;
                                                                                    while (true) {
                                                                                        i35 ^= 1513410;
                                                                                        switch (i35) {
                                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                break;
                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                porterDuffColorFilter = new PorterDuffColorFilter(C0299.m5743(j10), C0025.m498(i34));
                                                                                                break;
                                                                                            case 115:
                                                                                                if (iM7181 >= 29) {
                                                                                                }
                                                                                                break;
                                                                                            case 4044:
                                                                                                porterDuffColorFilter = C0185.m3535(C0116.m2231(), j10, i34);
                                                                                                i37 = 1513517;
                                                                                                while (true) {
                                                                                                    i37 ^= 1513534;
                                                                                                    switch (i37) {
                                                                                                        case 19:
                                                                                                            i37 = 1514199;
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
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    lVar = new e1.l(j10, i34, porterDuffColorFilter);
                                                                                    i36 = 1514292;
                                                                                    while (true) {
                                                                                        i36 ^= 1514309;
                                                                                        switch (i36) {
                                                                                            case 22:
                                                                                                lVar2 = lVar;
                                                                                                break;
                                                                                            case 113:
                                                                                                i36 = 1514323;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                            default:
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 114:
                                                                                    break;
                                                                                case 809:
                                                                                    lVar2 = null;
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        i38 = 1513269;
                                                                        while (true) {
                                                                            i38 ^= 1513286;
                                                                            switch (i38) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    C0479.m9328(qVar, lVar2);
                                                                                    objM8078 = lVar2;
                                                                                    break;
                                                                                case 115:
                                                                                    i38 = 1513300;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 1001:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                e1.l lVar4 = (e1.l) objM8078;
                                                                C0171.m3270(qVar, false);
                                                                C0262.m4990(qVar, (-69357374) ^ C0490.f763);
                                                                i23 = 1514416;
                                                                while (true) {
                                                                    i23 ^= 1514433;
                                                                    switch (i23) {
                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                            break;
                                                                        case 47:
                                                                            oVar3 = oVarM4370;
                                                                            break;
                                                                        case 113:
                                                                            if (str != null) {
                                                                            }
                                                                            break;
                                                                        case 1369:
                                                                            C0262.m4990(qVar, (-69356784) ^ C0468.f738);
                                                                            i27 = C0212.f235;
                                                                            i28 = 1515191;
                                                                            while (true) {
                                                                                i28 ^= 1515208;
                                                                                switch (i28) {
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                        break;
                                                                                    case 61:
                                                                                        z11 = false;
                                                                                        break;
                                                                                    case 127:
                                                                                        if (((i27 ^ 602) & i16) == 32) {
                                                                                        }
                                                                                        break;
                                                                                    case 476:
                                                                                        z11 = true;
                                                                                        i32 = 1515315;
                                                                                        while (true) {
                                                                                            i32 ^= 1515332;
                                                                                            switch (i32) {
                                                                                                case 22:
                                                                                                    break;
                                                                                                case 119:
                                                                                                    i32 = 1515346;
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
                                                                            objM8079 = C0412.m8078(qVar);
                                                                            i29 = 1515439;
                                                                            while (true) {
                                                                                i29 ^= 1515456;
                                                                                switch (i29) {
                                                                                    case 111:
                                                                                        if (!z11) {
                                                                                        }
                                                                                        break;
                                                                                    case 15703:
                                                                                        i31 = 1516214;
                                                                                        while (true) {
                                                                                            i31 ^= 1516231;
                                                                                            switch (i31) {
                                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                    break;
                                                                                                case 51:
                                                                                                    mVar2 = objM8079;
                                                                                                    break;
                                                                                                case 113:
                                                                                                    if (objM8079 == y0VarM2417) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 468:
                                                                                                    mVar2 = new m(str, 1);
                                                                                                    C0479.m9328(qVar, mVar2);
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 15769:
                                                                                        break;
                                                                                    case 15800:
                                                                                        mVar2 = new m(str, 1);
                                                                                        C0479.m9328(qVar, mVar2);
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            C0171.m3270(qVar, false);
                                                                            oVarM758 = C0039.m758(oVarM4370, false, (c9.c) mVar2);
                                                                            i30 = 1516338;
                                                                            while (true) {
                                                                                i30 ^= 1516355;
                                                                                switch (i30) {
                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        oVar3 = oVarM758;
                                                                                        break;
                                                                                    case 113:
                                                                                        i30 = 1516369;
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0171.m3270(qVar, false);
                                                                zM740 = C0038.m740(C0159.m3046(cVar), C0158.m3015());
                                                                i24 = 1537294;
                                                                while (true) {
                                                                    i24 ^= 1537311;
                                                                    switch (i24) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (!zM740) {
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 83:
                                                                            oVarM4370 = C0464.m9021();
                                                                            break;
                                                                        case 116:
                                                                            jM3046 = C0159.m3046(cVar);
                                                                            zM5158 = C0271.m5158(C0344.m6741(jM3046));
                                                                            i25 = 1537418;
                                                                            while (true) {
                                                                                i25 ^= 1537435;
                                                                                switch (i25) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        if (zM5158) {
                                                                                        }
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        break;
                                                                                    case 83:
                                                                                        break;
                                                                                    case 124:
                                                                                        zM5159 = C0271.m5158(C0416.m8158(jM3046));
                                                                                        i26 = 1537542;
                                                                                        while (true) {
                                                                                            i26 ^= 1537559;
                                                                                            switch (i26) {
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    if (zM5159) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 3751:
                                                                                                    break;
                                                                                                case 3800:
                                                                                                    break;
                                                                                                case 3833:
                                                                                                    oVarM4370 = C0464.m9021();
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
                                                                C0221.m4245(C0449.m8743(C0306.m5888(C0449.m8743(oVar, oVarM4370), cVar, null, C0162.m3098(), 0.0f, lVar4, 22), oVar3), qVar, 0);
                                                                oVar2 = oVar;
                                                                j11 = j10;
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                }
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
                m0.x1 x1VarM7533 = C0385.m7533(qVar);
                int i87 = 1538317;
                while (true) {
                    i87 ^= 1538334;
                    switch (i87) {
                        case 19:
                            if (x1VarM7533 != null) {
                                i87 = 1538410;
                            }
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 85:
                            return;
                        case 116:
                            x1VarM7533.f11756d = new d1(cVar, str, oVar2, j11, i10, i11, 1);
                            return;
                        default:
                            continue;
                    }
                    i87 = 1538379;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:272:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x0297 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x02de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x031a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x031e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x0382 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x031a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x02ae A[SYNTHETIC] */
    public static final void b(i1.f fVar, String str, y0.o oVar, long j10, m0.m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j11;
        y0.o oVar2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        long jM8864;
        int i23;
        int i24;
        int i25;
        boolean zM5148;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        m0.q qVar = (m0.q) mVar;
        C0394.m7698(qVar, 126889984 ^ C0255.f334);
        int i33 = 1616;
        while (true) {
            i33 ^= 1633;
            switch (i33) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i33 = ((i11 ^ (-2)) & i11) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    i12 = (C0156.f180 ^ 396) | i10;
                    int i34 = 1740;
                    while (true) {
                        i34 ^= 1757;
                        switch (i34) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i34 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    int i35 = C0142.f168;
                    int i36 = 1864;
                    while (true) {
                        i36 ^= 1881;
                        switch (i36) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i36 = ((i35 ^ (-612)) & i10) == 0 ? 48736 : 48705;
                                break;
                            case 47384:
                                i12 = i10;
                                break;
                            case 47417:
                                boolean zM2013 = C0103.m2013(qVar, fVar);
                                int i37 = 48767;
                                while (true) {
                                    i37 ^= 48784;
                                    switch (i37) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i13 = 2;
                                            break;
                                        case 76:
                                            i13 = 4;
                                            int i38 = 48891;
                                            while (true) {
                                                i38 ^= 48908;
                                                switch (i38) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i38 = 48922;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 239:
                                            i37 = zM2013 ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                i12 = (i13 & i10) | (i13 ^ i10);
                                int i39 = 49666;
                                while (true) {
                                    i39 ^= 49683;
                                    switch (i39) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i39 = 49697;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
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
                    break;
                default:
                    break;
            }
        }
        int i40 = C0359.f629;
        int i41 = 49790;
        while (true) {
            i41 ^= 49807;
            switch (i41) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    int i42 = C0377.f647;
                    int i43 = 50689;
                    while (true) {
                        i43 ^= 50706;
                        switch (i43) {
                            case 19:
                                i43 = ((i42 ^ 782) & i10) == 0 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                i32 = 49914;
                                while (true) {
                                    i32 ^= 49931;
                                    switch (i32) {
                                        case 497:
                                            i32 = 50596;
                                            continue;
                                            continue;
                                        case 1711:
                                            break;
                                        default:
                                            continue;
                                            continue;
                                    }
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                boolean zM2014 = C0103.m2013(qVar, str);
                                int i44 = 50813;
                                while (true) {
                                    i44 ^= 50830;
                                    switch (i44) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 53:
                                            i14 = 16;
                                            break;
                                        case 243:
                                            i44 = zM2014 ? 51557 : 50875;
                                            break;
                                        case 4075:
                                            i14 = 32;
                                            int i45 = 51588;
                                            while (true) {
                                                i45 ^= 51605;
                                                switch (i45) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i45 = 51619;
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
                                i12 = (i12 & i14) | (i12 ^ i14);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 84:
                    i12 |= C0464.f734 ^ 275;
                    i32 = 49914;
                    while (true) {
                        i32 ^= 49931;
                        switch (i32) {
                            case 497:
                                i32 = 50596;
                                continue;
                                continue;
                            case 1711:
                                break;
                            default:
                                continue;
                                continue;
                        }
                    }
                    break;
                case 241:
                    i41 = ((i40 ^ 528) & i11) != 0 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
            int i46 = i11 & (C0249.f328 ^ 57);
            int i47 = 51712;
            while (true) {
                i47 ^= 51729;
                switch (i47) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i47 = i46 != 0 ? 51805 : 51774;
                        break;
                    case 47:
                        int i48 = C0429.f699;
                        int i49 = 52611;
                        while (true) {
                            i49 ^= 52628;
                            switch (i49) {
                                case 23:
                                    i49 = ((i48 ^ 327) & i10) == 0 ? 52704 : 52673;
                                    break;
                                case 54:
                                    break;
                                case 85:
                                    i31 = 51836;
                                    while (true) {
                                        i31 ^= 51853;
                                        switch (i31) {
                                            case 241:
                                                i31 = 52518;
                                                continue;
                                                continue;
                                            case 1963:
                                                break;
                                            default:
                                                continue;
                                                continue;
                                        }
                                    }
                                    break;
                                case 116:
                                    boolean zM2015 = C0103.m2013(qVar, oVar);
                                    int i50 = 52735;
                                    while (true) {
                                        i50 ^= 52752;
                                        switch (i50) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                i15 = 128;
                                                break;
                                            case 1007:
                                                i50 = zM2015 ? 53479 : 52797;
                                                break;
                                            case 7927:
                                                i15 = 256;
                                                int i51 = 53510;
                                                while (true) {
                                                    i51 ^= 53527;
                                                    switch (i51) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i51 = 53541;
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
                                    i12 = (i12 & i15) | (i12 ^ i15);
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 76:
                        i12 |= C0013.f33 ^ 665;
                        i31 = 51836;
                        while (true) {
                            i31 ^= 51853;
                            switch (i31) {
                                case 241:
                                    i31 = 52518;
                                    continue;
                                    continue;
                                case 1963:
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
                int i52 = C0381.f651;
                int i53 = 53634;
                while (true) {
                    i53 ^= 53651;
                    switch (i53) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i53 = ((i52 ^ (-3780)) & i10) == 0 ? 53727 : 53696;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 76:
                            int i54 = C0477.f750;
                            int i55 = 53758;
                            while (true) {
                                i55 ^= 53775;
                                switch (i55) {
                                    case 1009:
                                        if (((i54 ^ 583) & i11) == 0) {
                                            i55 = 54502;
                                        }
                                        break;
                                    case 1703:
                                        break;
                                    case 1736:
                                        i30 = 1024;
                                        break;
                                    case 1769:
                                        boolean zM4041 = C0212.m4041(qVar, j10);
                                        int i56 = 54533;
                                        while (true) {
                                            i56 ^= 54550;
                                            switch (i56) {
                                                case 19:
                                                    if (zM4041) {
                                                        i56 = 54626;
                                                    }
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 85:
                                                    i30 = 1024;
                                                    break;
                                                case 116:
                                                    i30 = 2048;
                                                    int i57 = 54657;
                                                    while (true) {
                                                        i57 ^= 54674;
                                                        switch (i57) {
                                                            case 19:
                                                                i57 = 54688;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i56 = 54595;
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i55 = 54471;
                            }
                            int i58 = (i12 & i30) | (i12 ^ i30);
                            int i59 = 55432;
                            while (true) {
                                i59 ^= 55449;
                                switch (i59) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i59 = 55463;
                                        continue;
                                    case 62:
                                        i16 = i58;
                                        break;
                                    default:
                                        continue;
                                }
                            }
                            break;
                        case 83:
                            i16 = i12;
                            break;
                        default:
                            break;
                    }
                }
                int i60 = C0142.f168;
                int i61 = 55556;
                while (true) {
                    i61 ^= 55573;
                    switch (i61) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i61 = ((i60 ^ (-1783)) & i16) == 1170 ? 55649 : 55618;
                            break;
                        case 54:
                            break;
                        case 87:
                            C0309.m5960(qVar);
                            i17 = 1507503;
                            while (true) {
                                i17 ^= 1507520;
                                switch (i17) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        i20 = 1509425;
                                        while (true) {
                                            i20 ^= 1509442;
                                            switch (i20) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    break;
                                                case 115:
                                                    i20 = i46 != 0 ? 1509518 : 1509487;
                                                    break;
                                                case 204:
                                                    oVar = C0227.m4370();
                                                    i25 = 1509549;
                                                    while (true) {
                                                        i25 ^= 1509566;
                                                        switch (i25) {
                                                            case 19:
                                                                i25 = 1509580;
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
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        i21 = C0157.f181;
                                        i22 = 1509673;
                                        while (true) {
                                            i22 ^= 1509690;
                                            switch (i22) {
                                                case 19:
                                                    i22 = ((i21 ^ (-332)) & i11) != 0 ? 1510417 : 1510386;
                                                    break;
                                                case 712:
                                                    i18 = i16;
                                                    j11 = j10;
                                                    oVar2 = oVar;
                                                    break;
                                                case 745:
                                                    break;
                                                case 1323:
                                                    jM8864 = C0455.m8864((e1.r) C0476.m9256(qVar, C0112.m2168()));
                                                    i23 = i16 & (C0062.f82 ^ (-7491));
                                                    i24 = 1510448;
                                                    while (true) {
                                                        i24 ^= 1510465;
                                                        switch (i24) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                i18 = i23;
                                                                j11 = jM8864;
                                                                oVar2 = oVar;
                                                                break;
                                                            case 113:
                                                                i24 = 1510479;
                                                                continue;
                                                                continue;
                                                                continue;
                                                                continue;
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
                                    case 111:
                                        i17 = ((i10 ^ (-2)) & i10) != 0 ? 1507596 : 1507565;
                                        break;
                                    case 460:
                                        zM5148 = C0270.m5148(qVar);
                                        i26 = 1507627;
                                        while (true) {
                                            i26 ^= 1507644;
                                            switch (i26) {
                                                case 23:
                                                    i26 = zM5148 ? 1507720 : 1507689;
                                                    break;
                                                case 85:
                                                    C0471.m9156(qVar);
                                                    i27 = C0321.f468;
                                                    i28 = 1508526;
                                                    while (true) {
                                                        i28 ^= 1508543;
                                                        switch (i28) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i28 = ((i27 ^ (-814)) & i11) != 0 ? 1508619 : 1508588;
                                                                break;
                                                            case 83:
                                                                break;
                                                            case 114:
                                                                break;
                                                            case 436:
                                                                i16 &= C0394.f664 ^ (-7446);
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    i18 = i16;
                                                    j11 = j10;
                                                    oVar2 = oVar;
                                                    break;
                                                case 118:
                                                    break;
                                                case 180:
                                                    i29 = 1507751;
                                                    while (true) {
                                                        i29 ^= 1507768;
                                                        switch (i29) {
                                                            case 31:
                                                                i29 = 1508433;
                                                                continue;
                                                                continue;
                                                            case 1513:
                                                                break;
                                                            default:
                                                                continue;
                                                                continue;
                                                        }
                                                        i20 = 1509425;
                                                        while (true) {
                                                            i20 ^= 1509442;
                                                            switch (i20) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    break;
                                                                case 115:
                                                                    if (i46 != 0) {
                                                                    }
                                                                    break;
                                                                case 204:
                                                                    oVar = C0227.m4370();
                                                                    i25 = 1509549;
                                                                    while (true) {
                                                                        i25 ^= 1509566;
                                                                        switch (i25) {
                                                                            case 19:
                                                                                i25 = 1509580;
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
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        i21 = C0157.f181;
                                                        i22 = 1509673;
                                                        while (true) {
                                                            i22 ^= 1509690;
                                                            switch (i22) {
                                                                case 19:
                                                                    if (((i21 ^ (-332)) & i11) != 0) {
                                                                    }
                                                                    break;
                                                                case 712:
                                                                    i18 = i16;
                                                                    j11 = j10;
                                                                    oVar2 = oVar;
                                                                    break;
                                                                case 745:
                                                                    break;
                                                                case 1323:
                                                                    jM8864 = C0455.m8864((e1.r) C0476.m9256(qVar, C0112.m2168()));
                                                                    i23 = i16 & (C0062.f82 ^ (-7491));
                                                                    i24 = 1510448;
                                                                    while (true) {
                                                                        i24 ^= 1510465;
                                                                        switch (i24) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                i18 = i23;
                                                                                j11 = jM8864;
                                                                                oVar2 = oVar;
                                                                                break;
                                                                            case 113:
                                                                                i24 = 1510479;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
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
                                i19 = 1508650;
                                while (true) {
                                    i19 ^= 1508667;
                                    switch (i19) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i19 = 1508681;
                                            continue;
                                            continue;
                                        case 114:
                                            C0103.m2025(qVar);
                                            i1.j0 j0VarM8714 = C0448.m8714(fVar, qVar);
                                            int i62 = (C0122.f148 ^ (-72)) & i18;
                                            int i63 = (i62 & 8) | (i62 ^ 8);
                                            int i64 = (C0219.f298 ^ (-417)) & i18;
                                            int i65 = (i63 & i64) | (i63 ^ i64);
                                            int i66 = i18 & (C0079.f113 ^ (-7724));
                                            C0121.m2338(j0VarM8714, str, oVar2, j11, qVar, (i65 ^ i66) | (i66 & i65), 0);
                                            break;
                                        default:
                                            continue;
                                            continue;
                                    }
                                }
                            }
                            break;
                        case 116:
                            boolean zM1625 = C0074.m1625(qVar);
                            int i67 = 55680;
                            while (true) {
                                i67 ^= 55697;
                                switch (i67) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i67 = !zM1625 ? 56424 : 56393;
                                        break;
                                    case 1467:
                                        break;
                                    case 1496:
                                        C0471.m9156(qVar);
                                        int i68 = 56579;
                                        while (true) {
                                            i68 ^= 56596;
                                            switch (i68) {
                                                case 23:
                                                    i68 = 56610;
                                                    continue;
                                                case 54:
                                                    j11 = j10;
                                                    oVar2 = oVar;
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 1529:
                                        int i69 = 56455;
                                        while (true) {
                                            i69 ^= 56472;
                                            switch (i69) {
                                                case 31:
                                                    i69 = 56486;
                                                    continue;
                                                case 62:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            C0309.m5960(qVar);
                                            i17 = 1507503;
                                            while (true) {
                                                i17 ^= 1507520;
                                                switch (i17) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        i20 = 1509425;
                                                        while (true) {
                                                            i20 ^= 1509442;
                                                            switch (i20) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    break;
                                                                case 115:
                                                                    if (i46 != 0) {
                                                                    }
                                                                    break;
                                                                case 204:
                                                                    oVar = C0227.m4370();
                                                                    i25 = 1509549;
                                                                    while (true) {
                                                                        i25 ^= 1509566;
                                                                        switch (i25) {
                                                                            case 19:
                                                                                i25 = 1509580;
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
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        i21 = C0157.f181;
                                                        i22 = 1509673;
                                                        while (true) {
                                                            i22 ^= 1509690;
                                                            switch (i22) {
                                                                case 19:
                                                                    if (((i21 ^ (-332)) & i11) != 0) {
                                                                    }
                                                                    break;
                                                                case 712:
                                                                    i18 = i16;
                                                                    j11 = j10;
                                                                    oVar2 = oVar;
                                                                    break;
                                                                case 745:
                                                                    break;
                                                                case 1323:
                                                                    jM8864 = C0455.m8864((e1.r) C0476.m9256(qVar, C0112.m2168()));
                                                                    i23 = i16 & (C0062.f82 ^ (-7491));
                                                                    i24 = 1510448;
                                                                    while (true) {
                                                                        i24 ^= 1510465;
                                                                        switch (i24) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                i18 = i23;
                                                                                j11 = jM8864;
                                                                                oVar2 = oVar;
                                                                                break;
                                                                            case 113:
                                                                                i24 = 1510479;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
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
                                                    case 111:
                                                        if (((i10 ^ (-2)) & i10) != 0) {
                                                        }
                                                        break;
                                                    case 460:
                                                        zM5148 = C0270.m5148(qVar);
                                                        i26 = 1507627;
                                                        while (true) {
                                                            i26 ^= 1507644;
                                                            switch (i26) {
                                                                case 23:
                                                                    if (zM5148) {
                                                                    }
                                                                    break;
                                                                case 85:
                                                                    C0471.m9156(qVar);
                                                                    i27 = C0321.f468;
                                                                    i28 = 1508526;
                                                                    while (true) {
                                                                        i28 ^= 1508543;
                                                                        switch (i28) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (((i27 ^ (-814)) & i11) != 0) {
                                                                                }
                                                                                break;
                                                                            case 83:
                                                                                break;
                                                                            case 114:
                                                                                break;
                                                                            case 436:
                                                                                i16 &= C0394.f664 ^ (-7446);
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    i18 = i16;
                                                                    j11 = j10;
                                                                    oVar2 = oVar;
                                                                    break;
                                                                case 118:
                                                                    break;
                                                                case 180:
                                                                    i29 = 1507751;
                                                                    while (true) {
                                                                        i29 ^= 1507768;
                                                                        switch (i29) {
                                                                            case 31:
                                                                                i29 = 1508433;
                                                                                continue;
                                                                                continue;
                                                                            case 1513:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                        i20 = 1509425;
                                                                        while (true) {
                                                                            i20 ^= 1509442;
                                                                            switch (i20) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    break;
                                                                                case 115:
                                                                                    if (i46 != 0) {
                                                                                    }
                                                                                    break;
                                                                                case 204:
                                                                                    oVar = C0227.m4370();
                                                                                    i25 = 1509549;
                                                                                    while (true) {
                                                                                        i25 ^= 1509566;
                                                                                        switch (i25) {
                                                                                            case 19:
                                                                                                i25 = 1509580;
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
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        i21 = C0157.f181;
                                                                        i22 = 1509673;
                                                                        while (true) {
                                                                            i22 ^= 1509690;
                                                                            switch (i22) {
                                                                                case 19:
                                                                                    if (((i21 ^ (-332)) & i11) != 0) {
                                                                                    }
                                                                                    break;
                                                                                case 712:
                                                                                    i18 = i16;
                                                                                    j11 = j10;
                                                                                    oVar2 = oVar;
                                                                                    break;
                                                                                case 745:
                                                                                    break;
                                                                                case 1323:
                                                                                    jM8864 = C0455.m8864((e1.r) C0476.m9256(qVar, C0112.m2168()));
                                                                                    i23 = i16 & (C0062.f82 ^ (-7491));
                                                                                    i24 = 1510448;
                                                                                    while (true) {
                                                                                        i24 ^= 1510465;
                                                                                        switch (i24) {
                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                i18 = i23;
                                                                                                j11 = jM8864;
                                                                                                oVar2 = oVar;
                                                                                                break;
                                                                                            case 113:
                                                                                                i24 = 1510479;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
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
                                                i19 = 1508650;
                                                while (true) {
                                                    i19 ^= 1508667;
                                                    switch (i19) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i19 = 1508681;
                                                            continue;
                                                            continue;
                                                        case 114:
                                                            C0103.m2025(qVar);
                                                            i1.j0 j0VarM8715 = C0448.m8714(fVar, qVar);
                                                            int i610 = (C0122.f148 ^ (-72)) & i18;
                                                            int i611 = (i610 & 8) | (i610 ^ 8);
                                                            int i612 = (C0219.f298 ^ (-417)) & i18;
                                                            int i613 = (i611 & i612) | (i611 ^ i612);
                                                            int i614 = i18 & (C0079.f113 ^ (-7724));
                                                            C0121.m2338(j0VarM8715, str, oVar2, j11, qVar, (i613 ^ i614) | (i614 & i613), 0);
                                                            break;
                                                        default:
                                                            continue;
                                                            continue;
                                                    }
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
                    m0.x1 x1VarM7533 = C0385.m7533(qVar);
                    int i70 = 1510572;
                    while (true) {
                        i70 ^= 1510589;
                        switch (i70) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (x1VarM7533 != null) {
                                    i70 = 1511316;
                                }
                                break;
                            case 87:
                                return;
                            case 118:
                                break;
                            case 809:
                                x1VarM7533.f11756d = new d1(fVar, str, oVar2, j11, i10, i11, 0);
                                return;
                            default:
                                continue;
                        }
                        i70 = 1510634;
                    }
                }
            }
        }
    }
}
