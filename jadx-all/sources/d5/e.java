package d5;

import a.C0000;
import a.C0001;
import a6.C0007;
import aa.C0012;
import android.os.C0013;
import android.support.v4.app.C0014;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import androidx.annotation.C0019;
import androidx.compose.foundation.C0026;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.ui.graphics.C0032;
import androidx.compose.ui.input.pointer.C0034;
import androidx.compose.ui.semantics.C0039;
import androidx.startup.C0047;
import b3.C0051;
import c0.C0057;
import c1.C0059;
import c1.C0061;
import c3.C0062;
import c3.C0063;
import c6.C0067;
import c7.C0069;
import com.auto.accept.data.model.C0071;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0074;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.measurement.internal.C0105;
import com.google.android.play.core.integrity.client.C0108;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.C0205;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.iid.C0170;
import com.google.firebase.iid.C0171;
import com.google.firebase.measurement.C0181;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.firebase.tracing.C0204;
import com.google.gson.internal.bind.C0206;
import com.google.gson.internal.bind.C0207;
import com.google.gson.internal.sql.C0208;
import com.google.protobuf.C0209;
import d1.C0213;
import d1.C0214;
import d3.C0217;
import d7.C0220;
import d7.C0221;
import d9.C0223;
import d9.C0227;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.android.lifecycle.C0238;
import dagger.hilt.codegen.C0242;
import dagger.hilt.internal.componenttreedeps.C0249;
import dagger.hilt.internal.generatesrootinput.C0251;
import dagger.hilt.migration.C0255;
import e0.C0257;
import e2.C0262;
import f.C0271;
import f0.C0272;
import f1.C0274;
import f4.C0276;
import f4.C0277;
import fa.C0280;
import fa.C0281;
import fa.C0282;
import g2.C0287;
import g3.C0289;
import g4.C0290;
import h6.C0310;
import h8.C0314;
import h8.C0315;
import i.C0316;
import i.C0317;
import i9.C0322;
import j4.C0327;
import k2.C0334;
import k3.C0336;
import l0.C0341;
import la.C0349;
import m0.l2;
import m0.l3;
import m3.C0353;
import m4.C0354;
import m5.C0356;
import m7.C0359;
import n7.C0365;
import o1.C0368;
import p3.C0376;
import p8.C0380;
import q0.C0383;
import q2.C0385;
import q6.C0389;
import r.C0393;
import r5.C0401;
import r9.C0406;
import s.C0409;
import s2.C0412;
import s6.C0414;
import t0.C0419;
import t1.C0420;
import t2.C0421;
import u1.C0432;
import u2.C0434;
import u3.C0435;
import u4.C0436;
import v5.C0446;
import v6.C0447;
import v7.C0450;
import w.C0454;
import w2.C0457;
import w6.C0465;
import x5.C0471;
import x8.C0474;
import y6.C0478;
import y9.C0479;
import z7.C0489;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d9.j implements c9.f {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f256short = {3227, 3275, 3287, 3286, 3276, 3227, 3313, 3290, 3280, 3281, 3325, 3294, 3292, 3284, 3288, 3277, 3280, 3274, 3281, 3291, 3073, 3106, 3114, 3106, 2864, 2859, 2854, 2855, 2882, 2851, 2849, 2849, 2855, 2866, 2870, 2855, 2864, 921, 1002, 899, 1002, 909, 1002, 900, 1002, 1002, 1002, 899, 1002, 900, 2450, 2490, 2486, 2494, 2491, 2551, 2454, 2483, 2483, 2469, 2482, 2468, 2468, 1694, 1711, 1725, 1725, 1721, 1697, 1724, 1706, 3204, 3245, 3248, 3237, 3245, 3254, 3298, 3218, 3235, 3249, 3249, 3253, 3245, 3248, 3238, 3325, 1828, 1854, 1840, 1849, 1879, 1854, 1849, 2993, 2970, 2971, 3026, 2945, 3029, 2973, 2964, 2947, 2960, 3029, 2964, 2971, 3029, 2964, 2966, 2966, 2970, 2944, 2971, 2945, 3018, 3029, 2666, 2640, 2654, 2647, 2585, 2668, 2633};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l3 f4457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.g1 f4458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.g1 f4459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.g1 f4460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0.g1 f4461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MainViewModel f4462f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l3 f4463n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c9.a f4464o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m0.g1 g1Var, m0.g1 g1Var2, m0.g1 g1Var3, m0.g1 g1Var4, m0.g1 g1Var5, MainViewModel mainViewModel, m0.g1 g1Var6, c9.a aVar) {
        super(C0354.f624 ^ 890);
        this.f4457a = g1Var;
        this.f4458b = g1Var2;
        this.f4459c = g1Var3;
        this.f4460d = g1Var4;
        this.f4461e = g1Var5;
        this.f4462f = mainViewModel;
        this.f4463n = g1Var6;
        this.f4464o = aVar;
        int iM4762 = C0249.m4762();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4762 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0237.m4554("bOOe0o5F69vRNUUITHx")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۧۧۨ۠, reason: not valid java name and contains not printable characters */
    public static short[] m4164() {
        int iM4538 = C0236.m4538();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4538 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f256short;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:215:0x083a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:222:0x084f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        Object uVar;
        boolean z10;
        m0.m mVar = (m0.m) obj2;
        int iM8515 = C0436.m8515((Number) obj3);
        C0376.m7360((y.t) obj, C0076.m1657(m4164(), 0, C0349.f619 ^ 961, 3263));
        int i10 = C0133.f159;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ 841) & iM8515) == 16 ? 1709 : 1678;
                    break;
                case 204:
                    m0.q qVar = (m0.q) mVar;
                    boolean zM1625 = C0074.m1625(qVar);
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = !zM1625 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                C0471.m9156(qVar);
                                int i13 = 48767;
                                while (true) {
                                    i13 ^= 48784;
                                    switch (i13) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            return C0012.m238();
                                        case 239:
                                            i13 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i14 = 1864;
                                while (true) {
                                    i14 ^= 1881;
                                    switch (i14) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i14 = 48674;
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
                    break;
                default:
                    break;
            }
        }
        y0.l lVarM4370 = C0227.m4370();
        y0.o oVarM8892 = C0457.m8892(C0143.m2748(), C0146.m2779(mVar));
        float f10 = C0406.f676 ^ 76;
        y0.o oVarM4788 = C0251.m4788(oVarM8892, f10);
        y0.e eVarM1926 = C0090.m1926();
        y.f fVarM5323 = C0277.m5323();
        m0.q qVar2 = (m0.q) mVar;
        C0262.m4990(qVar2, (-483455240) ^ C0401.f671);
        r1.j0 j0VarM4231 = C0219.m4231(fVarM5323, eVarM1926, qVar2);
        C0262.m4990(qVar2, 1323940181 ^ C0144.f170);
        int iM276 = C0014.m276(qVar2);
        m0.r1 r1VarM275 = C0014.m275(qVar2);
        C0014.m280(C0380.m7428());
        t1.j jVarM4451 = C0232.m4451();
        u0.b bVarM6976 = C0356.m6976(oVarM4788);
        boolean z11 = C0196.m3764(qVar2) instanceof m0.d;
        int i15 = 48891;
        while (true) {
            i15 ^= 48908;
            switch (i15) {
                case 22:
                    break;
                case 53:
                    C0236.m4537();
                    throw null;
                case 503:
                    if (z11) {
                        i15 = 49635;
                    }
                    break;
                case 32495:
                    C0100.m1961(qVar2);
                    boolean zM7502 = C0383.m7502(qVar2);
                    int i16 = 49666;
                    while (true) {
                        i16 ^= 49683;
                        switch (i16) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i16 = zM7502 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                C0017.m346(qVar2, jVarM4451);
                                int i17 = 49790;
                                while (true) {
                                    i17 ^= 49807;
                                    switch (i17) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i17 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                C0446.m8685(qVar2);
                                break;
                            default:
                                break;
                        }
                    }
                    t1.i iVarM1208 = C0063.m1208();
                    C0089.m1904(qVar2, j0VarM4231, iVarM1208);
                    t1.i iVarM9055 = C0465.m9055();
                    C0089.m1904(qVar2, r1VarM275, iVarM9055);
                    t1.i iVarM5562 = C0290.m5562();
                    boolean zM7503 = C0383.m7502(qVar2);
                    int i18 = 49914;
                    while (true) {
                        i18 ^= 49931;
                        switch (i18) {
                            case 497:
                                i18 = !zM7503 ? 50658 : 50627;
                                break;
                            case 1711:
                                break;
                            case 1736:
                                C0133.m2574(iM276, qVar2, iM276, iVarM5562);
                                break;
                            case 1769:
                                boolean zM4399 = C0229.m4399(C0412.m8078(qVar2), C0057.m1083(iM276));
                                int i19 = 50689;
                                while (true) {
                                    i19 ^= 50706;
                                    switch (i19) {
                                        case 19:
                                            i19 = !zM4399 ? 50782 : 50751;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            C0133.m2574(iM276, qVar2, iM276, iVarM5562);
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
                    C0353.m6912(0, bVarM6976, new l2(qVar2), qVar2, 2058660843 ^ C0220.f299);
                    float f11 = C0213.f236 ^ 192;
                    C0072.m1564(C0271.m5166(lVarM4370, f11), qVar2);
                    y0.o oVarM2949 = C0154.m2949(lVarM4370, C0013.f33 ^ 841);
                    e0.e eVarM6942 = C0354.m6942();
                    y0.o oVarM6470 = C0334.m6470(oVarM2949, eVarM6942);
                    long jM5325 = C0277.m5325();
                    e1.r rVar = new e1.r(C0217.m4129(jM5325, 0.3f));
                    e1.r rVar2 = new e1.r(C0251.m4787());
                    e1.r[] rVarArr = new e1.r[2];
                    rVarArr[C0474.f744 ^ 644] = rVar;
                    rVarArr[C0219.f298 ^ (-546)] = rVar2;
                    y0.o oVarM2043 = C0105.m2043(C0435.m8502(oVarM6470, C0359.m7026(C0406.m7965(rVarArr), 0.0f, C0207.f231 ^ (-613)), null, C0062.f82 ^ 324), C0109.f135 ^ 65, C0217.m4129(jM5325, 0.5f), eVarM6942);
                    y0.g gVarM2824 = C0147.m2824();
                    C0262.m4990(qVar2, (-733329389) ^ C0229.f308);
                    r1.j0 j0VarM2476 = C0128.m2476(gVarM2824, false, qVar2);
                    C0262.m4990(qVar2, (-1323940374) ^ C0021.f41);
                    int iM277 = C0014.m276(qVar2);
                    m0.r1 r1VarM276 = C0014.m275(qVar2);
                    u0.b bVarM6977 = C0356.m6976(oVarM2043);
                    int i20 = 50813;
                    while (true) {
                        i20 ^= 50830;
                        switch (i20) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                C0236.m4537();
                                throw null;
                            case 243:
                                if (z11) {
                                    i20 = 51557;
                                }
                                break;
                            case 4075:
                                C0100.m1961(qVar2);
                                boolean zM7504 = C0383.m7502(qVar2);
                                int i21 = 51588;
                                while (true) {
                                    i21 ^= 51605;
                                    switch (i21) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i21 = zM7504 ? 51681 : 51650;
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            C0446.m8685(qVar2);
                                            break;
                                        case 116:
                                            C0017.m346(qVar2, jVarM4451);
                                            int i22 = 51712;
                                            while (true) {
                                                i22 ^= 51729;
                                                switch (i22) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 15:
                                                    case Code.UNAUTHENTICATED /* 16 */:
                                                    default:
                                                        continue;
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i22 = 51743;
                                                        continue;
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                C0089.m1904(qVar2, j0VarM2476, iVarM1208);
                                C0089.m1904(qVar2, r1VarM276, iVarM9055);
                                boolean zM7505 = C0383.m7502(qVar2);
                                int i23 = 51836;
                                while (true) {
                                    i23 ^= 51853;
                                    switch (i23) {
                                        case 241:
                                            i23 = !zM7505 ? 52580 : 52549;
                                            break;
                                        case 1963:
                                            break;
                                        case 1992:
                                            C0133.m2574(iM277, qVar2, iM277, iVarM5562);
                                            break;
                                        case 2025:
                                            boolean zM43910 = C0229.m4399(C0412.m8078(qVar2), C0057.m1083(iM277));
                                            int i24 = 52611;
                                            while (true) {
                                                i24 ^= 52628;
                                                switch (i24) {
                                                    case 23:
                                                        i24 = !zM43910 ? 52704 : 52673;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        break;
                                                    case 116:
                                                        C0133.m2574(iM277, qVar2, iM277, iVarM5562);
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
                                C0353.m6912(0, bVarM6977, new l2(qVar2), qVar2, 2058660134 ^ C0047.f67);
                                h1.c cVarM5405 = C0280.m5405((-2131165935) ^ C0238.f317, qVar2);
                                String strM2836 = C0148.m2836(m4164(), 20, C0316.f463 ^ 518, 3149);
                                y0.o oVarM29410 = C0154.m2949(lVarM4370, C0208.f232 ^ 340);
                                int i25 = C0389.f659 ^ 534;
                                C0322.m6225(cVarM5405, strM2836, oVarM29410, null, null, 0.0f, null, qVar2, 440, 120);
                                C0016.m325(qVar2, false, true, false, false);
                                float f12 = C0414.f684 ^ (-937);
                                C0185.m3537(C0129.m2487(m4164(), 24, C0436.f706 ^ (-919), 2914), null, C0349.m6826(), C0409.m8002(lVarM4370, f12, qVar2, C0276.f391 ^ 967), null, C0205.m3913(), null, C0135.m2601(C0274.f389 ^ 416), null, null, 0L, 0, false, 0, 0, null, new a2.c0(0L, 0L, null, null, new e1.k0(C0217.m4129(jM5325, 0.5f), 20.0f, C0336.f519 ^ 315), 16768922 ^ C0206.f230), qVar2, 12782982, (-1573314) ^ C0191.f215, 64853 ^ C0034.f54);
                                int i26 = C0365.f635 ^ (-745);
                                long jM2601 = C0135.m2601(i26);
                                f2.l lVarM1734 = C0081.m1734();
                                C0185.m3537(C0434.m8486(m4164(), 37, C0051.f71 ^ (-417), 970), null, C0217.m4129(jM5325, 0.8f), jM2601, null, lVarM1734, null, C0135.m2601(i25), null, null, 0L, 0, false, 0, 0, null, null, qVar2, 12782982, 0, (-130054) ^ C0257.f336);
                                C0072.m1564(C0271.m5166(lVarM4370, f11), qVar2);
                                String str = (String) C0419.m8214(C0221.m4255(this));
                                C0262.m4990(qVar2, (-635837169) ^ C0228.f307);
                                int i27 = 52735;
                                while (true) {
                                    i27 ^= 52752;
                                    switch (i27) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            FillElement fillElementM2371 = C0123.m2371();
                                            long jM6087 = C0315.m6087();
                                            C0272.m5230(fillElementM2371, C0420.m8237(C0135.f161 ^ (-907)), C0067.m1299(C0217.m4129(jM6087, 0.12f), qVar2, i25), null, C0059.m1134(1, C0217.m4129(jM6087, 0.4f)), C0059.m1122(qVar2, (-320537973) ^ C0478.f751, new b(str, 0)), qVar2, C0032.f52 ^ (-221928), C0450.f720 ^ 352);
                                            C0072.m1564(C0271.m5166(lVarM4370, f12), qVar2);
                                            int i28 = 53634;
                                            while (true) {
                                                i28 ^= 53651;
                                                switch (i28) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i28 = 53665;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1007:
                                            if (str == null) {
                                                i27 = 53479;
                                            }
                                            break;
                                        case 7927:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i27 = 52797;
                                }
                                int i29 = 53510;
                                while (true) {
                                    i29 ^= 53527;
                                    switch (i29) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i29 = 53541;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            C0171.m3270(qVar2, false);
                                            m0.g1 g1VarM5969 = C0310.m5969(this);
                                            String str2 = (String) C0419.m8214(g1VarM5969);
                                            C0262.m4990(qVar2, (-635838118) ^ C0255.f334);
                                            Object objM8078 = C0412.m8078(qVar2);
                                            Object objM2417 = C0125.m2417();
                                            int i30 = 53758;
                                            while (true) {
                                                i30 ^= 53775;
                                                switch (i30) {
                                                    case 1009:
                                                        i30 = objM8078 == objM2417 ? 54502 : 54471;
                                                        break;
                                                    case 1703:
                                                        break;
                                                    case 1736:
                                                        break;
                                                    case 1769:
                                                        objM8078 = new u1.w0(1, g1VarM5969);
                                                        C0479.m9328(qVar2, objM8078);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            C0171.m3270(qVar2, false);
                                            C0368.m7195(str2, (c9.c) objM8078, C0007.m155(m4164(), 50, C0282.f426 ^ 804, 2519), C0287.m5514(), null, 6, null, false, null, qVar2, 200112, 464);
                                            C0072.m1564(C0271.m5166(lVarM4370, 14), qVar2);
                                            m0.g1 g1VarM2648 = C0137.m2648(this);
                                            String str3 = (String) C0419.m8214(g1VarM2648);
                                            C0262.m4990(qVar2, 635837647 ^ C0314.f461);
                                            Object objM8079 = C0412.m8078(qVar2);
                                            int i31 = 54533;
                                            while (true) {
                                                i31 ^= 54550;
                                                switch (i31) {
                                                    case 19:
                                                        i31 = objM8079 == objM2417 ? 54626 : 54595;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 85:
                                                        break;
                                                    case 116:
                                                        objM8079 = new u1.w0(C0478.f751 ^ 415, g1VarM2648);
                                                        C0479.m9328(qVar2, objM8079);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            c9.c cVar = (c9.c) objM8079;
                                            C0171.m3270(qVar2, false);
                                            String strM6675 = C0341.m6675(m4164(), 63, C0317.f464 ^ 167, 1742);
                                            u0.b bVarM1164 = C0061.m1164();
                                            m0.g1 g1VarM5555 = C0289.m5555(this);
                                            u0.b bVarM1122 = C0059.m1122(qVar2, 324195105 ^ C0100.f126, new c(1, g1VarM5555));
                                            boolean zM14 = C0000.m14((Boolean) C0419.m8214(g1VarM5555));
                                            int i32 = 54657;
                                            while (true) {
                                                i32 ^= 54674;
                                                switch (i32) {
                                                    case 19:
                                                        i32 = zM14 ? 55401 : 54719;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        uVar = new g2.u();
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 3579:
                                                        uVar = C0143.m2745();
                                                        int i33 = 55432;
                                                        while (true) {
                                                            i33 ^= 55449;
                                                            switch (i33) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i33 = 55463;
                                                                    continue;
                                                                case 62:
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
                                            C0368.m7195(str3, cVar, strM6675, bVarM1164, bVarM1122, 7, uVar, false, null, qVar2, 224389 ^ C0421.f691, C0197.f221 ^ 483);
                                            C0072.m1564(C0271.m5166(lVarM4370, C0242.f321 ^ (-816)), qVar2);
                                            long jM2997 = C0157.m2997();
                                            long jM2602 = C0135.m2601(i26);
                                            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(C0124.m2385());
                                            C0262.m4990(qVar2, (-635839254) ^ C0108.f134);
                                            Object objM80710 = C0412.m8078(qVar2);
                                            int i34 = 55556;
                                            while (true) {
                                                i34 ^= 55573;
                                                switch (i34) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i34 = objM80710 == objM2417 ? 55649 : 55618;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 87:
                                                        break;
                                                    case 116:
                                                        objM80710 = new c5.m(C0214.f237 ^ (-14), C0158.m3023(this));
                                                        C0479.m9328(qVar2, objM80710);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            C0171.m3270(qVar2, false);
                                            C0185.m3537(C0039.m760(m4164(), 71, C0229.f308 ^ (-556), 3266), C0251.m4788(C0447.m8712(horizontalAlignElement, (c9.a) objM80710), C0471.f741 ^ 177), jM2997, jM2602, null, lVarM1734, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 200070, 0, 130401 ^ C0057.f77);
                                            C0072.m1564(C0271.m5166(lVarM4370, f10), qVar2);
                                            String strM7834 = C0401.m7834(m4164(), 87, C0228.f307 ^ (-905), 1911);
                                            d dVar = new d(C0069.m1341(this), g1VarM5969, g1VarM2648, 0);
                                            boolean zM15 = C0000.m14((Boolean) C0419.m8214(C0071.m1451(this)));
                                            boolean zM3470 = C0181.m3470((String) C0419.m8214(g1VarM5969));
                                            int i35 = 55680;
                                            while (true) {
                                                i35 ^= 55697;
                                                switch (i35) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i35 = ((((zM3470 ? 1 : 0) ^ 65535) & 1) | ((zM3470 ? 1 : 0) & 65534)) != 0 ? 56424 : 56393;
                                                        break;
                                                    case 1467:
                                                        break;
                                                    case 1496:
                                                        z10 = false;
                                                        break;
                                                    case 1529:
                                                        boolean zM3471 = C0181.m3470((String) C0419.m8214(g1VarM2648));
                                                        int i36 = 56455;
                                                        while (true) {
                                                            i36 ^= 56472;
                                                            switch (i36) {
                                                                case 31:
                                                                    i36 = ((((zM3471 ? 1 : 0) ^ 65535) & 1) | ((zM3471 ? 1 : 0) & 65534)) != 0 ? 56548 : 56517;
                                                                    break;
                                                                case 62:
                                                                    break;
                                                                case 93:
                                                                    z10 = false;
                                                                    break;
                                                                case 124:
                                                                    z10 = true;
                                                                    int i37 = 56579;
                                                                    while (true) {
                                                                        i37 ^= 56596;
                                                                        switch (i37) {
                                                                            case 23:
                                                                                i37 = 56610;
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
                                            C0170.m3262(strM7834, dVar, zM15, z10, null, null, qVar2, C0191.f215 ^ (-456), C0144.f170 ^ (-189));
                                            C0072.m1564(C0271.m5166(lVarM4370, f10), qVar2);
                                            FillElement fillElementM2372 = C0123.m2371();
                                            C0262.m4990(qVar2, 693286223 ^ C0385.f655);
                                            r1.j0 j0VarM4288 = C0223.m4288(fVarM5323, C0393.m7688(), qVar2);
                                            C0262.m4990(qVar2, 1323940276 ^ C0124.f150);
                                            int iM278 = C0014.m276(qVar2);
                                            m0.r1 r1VarM277 = C0014.m275(qVar2);
                                            u0.b bVarM6978 = C0356.m6976(fillElementM2372);
                                            int i38 = 1507503;
                                            while (true) {
                                                i38 ^= 1507520;
                                                switch (i38) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        C0236.m4537();
                                                        throw null;
                                                    case 111:
                                                        if (z11) {
                                                            i38 = 1507596;
                                                        }
                                                        break;
                                                    case 460:
                                                        C0100.m1961(qVar2);
                                                        boolean zM7506 = C0383.m7502(qVar2);
                                                        int i39 = 1507627;
                                                        while (true) {
                                                            i39 ^= 1507644;
                                                            switch (i39) {
                                                                case 23:
                                                                    i39 = zM7506 ? 1507720 : 1507689;
                                                                    break;
                                                                case 85:
                                                                    C0446.m8685(qVar2);
                                                                    break;
                                                                case 118:
                                                                    break;
                                                                case 180:
                                                                    C0017.m346(qVar2, jVarM4451);
                                                                    int i40 = 1507751;
                                                                    while (true) {
                                                                        i40 ^= 1507768;
                                                                        switch (i40) {
                                                                            case 31:
                                                                                i40 = 1508433;
                                                                                continue;
                                                                            case 1513:
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
                                                        C0089.m1904(qVar2, j0VarM4288, iVarM1208);
                                                        C0089.m1904(qVar2, r1VarM277, iVarM9055);
                                                        boolean zM7507 = C0383.m7502(qVar2);
                                                        int i41 = 1508526;
                                                        while (true) {
                                                            i41 ^= 1508543;
                                                            switch (i41) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i41 = !zM7507 ? 1508619 : 1508588;
                                                                    break;
                                                                case 83:
                                                                    C0133.m2574(iM278, qVar2, iM278, iVarM5562);
                                                                    break;
                                                                case 114:
                                                                    break;
                                                                case 436:
                                                                    boolean zM43911 = C0229.m4399(C0412.m8078(qVar2), C0057.m1083(iM278));
                                                                    int i42 = 1508650;
                                                                    while (true) {
                                                                        i42 ^= 1508667;
                                                                        switch (i42) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i42 = !zM43911 ? 1509394 : 1508712;
                                                                                break;
                                                                            case 83:
                                                                                break;
                                                                            case 114:
                                                                                break;
                                                                            case 3369:
                                                                                C0133.m2574(iM278, qVar2, iM278, iVarM5562);
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
                                                        C0353.m6912(0, bVarM6978, new l2(qVar2), qVar2, (-2058660771) ^ C0489.f762);
                                                        C0185.m3537(C0026.m510(m4164(), 94, C0322.f469 ^ (-640), 3061), null, C0001.m41(), C0135.m2601(C0327.f474 ^ (-794)), null, C0204.m3904(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 200070, 0, (-130264) ^ C0161.f185);
                                                        f2.l lVarM9305 = C0478.m9305();
                                                        long jM2603 = C0135.m2601(C0389.f659 ^ 542);
                                                        C0262.m4990(qVar2, 845061829 ^ C0100.f126);
                                                        c9.a aVarM5420 = C0281.m5420(this);
                                                        boolean zM5551 = C0289.m5551(qVar2, aVarM5420);
                                                        Object objM80711 = C0412.m8078(qVar2);
                                                        int i43 = 1509425;
                                                        while (true) {
                                                            i43 ^= 1509442;
                                                            switch (i43) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    objM80711 = new u.e1(aVarM5420, C0209.f233 ^ 219);
                                                                    C0479.m9328(qVar2, objM80711);
                                                                    break;
                                                                case 115:
                                                                    i43 = !zM5551 ? 1509518 : 1509487;
                                                                    break;
                                                                case 204:
                                                                    int i44 = 1509549;
                                                                    while (true) {
                                                                        i44 ^= 1509566;
                                                                        switch (i44) {
                                                                            case 19:
                                                                                i44 = objM80711 == objM2417 ? 1509642 : 1509611;
                                                                                break;
                                                                            case 85:
                                                                                break;
                                                                            case 114:
                                                                                break;
                                                                            case 436:
                                                                                objM80711 = new u.e1(aVarM5420, C0209.f233 ^ 219);
                                                                                C0479.m9328(qVar2, objM80711);
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
                                                        C0171.m3270(qVar2, false);
                                                        C0185.m3537(C0019.m390(m4164(), 117, C0457.f727 ^ 709, 2617), C0447.m8712(lVarM4370, (c9.a) objM80711), jM5325, jM2603, null, lVarM9305, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 200070, 0, 130223 ^ C0454.f724);
                                                        C0016.m325(qVar2, false, true, false, false);
                                                        C0072.m1564(C0271.m5166(lVarM4370, f11), qVar2);
                                                        C0219.m4216(qVar2, 0);
                                                        C0072.m1564(C0271.m5166(lVarM4370, C0432.f702 ^ (-200)), qVar2);
                                                        C0171.m3270(qVar2, false);
                                                        C0171.m3270(qVar2, true);
                                                        C0171.m3270(qVar2, false);
                                                        C0171.m3270(qVar2, false);
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i38 = 1507565;
                                            }
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i20 = 50875;
                    }
                    break;
                default:
                    continue;
            }
            i15 = 48953;
        }
        return C0012.m238();
    }
}
