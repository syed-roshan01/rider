package d5;

import a.C0001;
import a0.C0003;
import a7.C0008;
import aa.C0012;
import android.content.Context;
import android.support.v4.app.C0014;
import android.support.v4.app.C0015;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import androidx.annotation.C0019;
import androidx.appcompat.widget.C0020;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.text.modifiers.C0025;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.graphics.C0030;
import androidx.compose.ui.graphics.C0032;
import androidx.compose.ui.input.key.C0033;
import androidx.compose.ui.node.C0037;
import androidx.core.content.C0041;
import androidx.profileinstaller.C0045;
import androidx.versionedparcelable.C0048;
import b1.C0050;
import c0.C0057;
import c1.C0059;
import c1.C0061;
import c3.C0062;
import c3.C0063;
import c4.C0066;
import c6.C0067;
import c7.C0068;
import com.auto.accept.data.model.UserProfile;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0074;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.internal.stats.C0101;
import com.google.android.gms.internal.tasks.C0103;
import com.google.android.gms.measurement.internal.C0104;
import com.google.android.play.core.integrity.client.C0108;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.abt.C0112;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.iid.C0171;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.inject.C0172;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.measurement.C0184;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.tracing.C0204;
import d3.C0217;
import d9.C0225;
import d9.C0227;
import dagger.hilt.android.C0241;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.internal.C0253;
import dagger.hilt.internal.aggregatedroot.codegen.C0246;
import dagger.hilt.internal.generatesrootinput.C0251;
import dagger.hilt.internal.processedrootsentinel.C0252;
import e0.C0257;
import e2.C0262;
import e2.C0263;
import f.C0271;
import f0.C0272;
import f1.C0274;
import g.C0283;
import g4.C0290;
import g7.C0293;
import h.C0297;
import h3.C0302;
import h3.C0303;
import h3.C0304;
import h8.C0315;
import i.C0316;
import i6.C0320;
import i9.C0322;
import j3.C0326;
import j6.C0329;
import j9.C0330;
import k.C0332;
import k3.C0336;
import k7.C0338;
import l8.C0346;
import m0.l2;
import m0.l3;
import m3.C0353;
import m5.C0356;
import n1.C0363;
import n8.C0366;
import p3.C0376;
import p8.C0380;
import q0.C0383;
import q6.C0387;
import q6.C0388;
import r.C0393;
import r9.C0406;
import s2.C0412;
import t0.C0419;
import t1.C0420;
import t2.C0424;
import u.C0430;
import u4.C0436;
import u4.C0437;
import u8.C0439;
import v5.C0446;
import v6.C0447;
import v6.C0448;
import v8.C0451;
import w2.C0457;
import w2.C0458;
import w6.C0465;
import x5.C0471;
import x7.C0472;
import x8.C0474;
import y9.C0479;
import z.C0481;
import z0.C0483;
import z3.C0486;
import z3.C0488;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends d9.j implements c9.f {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f263short = {3295, 3278, 3275, 3275, 3270, 3265, 3272, 990, 1020, 1003, 1014, 1001, 1018, 2478, 2471, 2474, 2464, 2489, 2475, 2473, 2472, 2482, 2478, 2920, 2924, 2937, 2845, 2872, 2848, 2858, 517, 519, 518, 540, 512, 2141, 2124, 2081, 2051, 2050, 2072, 2052, 3002, 2982, 2978, 2993, 1598, 1583, 1622, 1642, 1646, 1661, 1570, 1584, 1584, 1598, 522, 539, 620, 606, 606, 592, 1257, 1260, 1268, 715, 730, 702, 667, 643, 3158, 3173, 3186, 3187, 3177, 3183, 3182, 3104, 3126, 3118, 3120};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfile f4511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l3 f4512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.a f4513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b.l f4515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l3 f4516f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l3 f4517n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m0.g1 f4518o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Context f4519p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m0.g1 f4520q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m0.g1 f4521r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m0.g1 f4522s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l3 f4523t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final MainViewModel f4524u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final m0.g1 f4525v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m0.g1 f4526w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m0.g1 f4527x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m0.g1 f4528y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(UserProfile userProfile, m0.g1 g1Var, c9.a aVar, String str, b.l lVar, m0.g1 g1Var2, m0.g1 g1Var3, m0.g1 g1Var4, Context context, m0.g1 g1Var5, m0.g1 g1Var6, m0.g1 g1Var7, m0.g1 g1Var8, MainViewModel mainViewModel, m0.g1 g1Var9, m0.g1 g1Var10, m0.g1 g1Var11, m0.g1 g1Var12) {
        super(C0346.f616 ^ 689);
        this.f4511a = userProfile;
        this.f4512b = g1Var;
        this.f4513c = aVar;
        this.f4514d = str;
        this.f4515e = lVar;
        this.f4516f = g1Var2;
        this.f4517n = g1Var3;
        this.f4518o = g1Var4;
        this.f4519p = context;
        this.f4520q = g1Var5;
        this.f4521r = g1Var6;
        this.f4522s = g1Var7;
        this.f4523t = g1Var8;
        this.f4524u = mainViewModel;
        this.f4525v = g1Var9;
        this.f4526w = g1Var10;
        this.f4527x = g1Var11;
        this.f4528y = g1Var12;
        int iM6500 = C0336.m6500();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6500 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0387.m7567("SqvNIx8K9AM")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤ۠۟, reason: not valid java name and contains not printable characters */
    public static short[] m4173() {
        int iM1779 = C0083.m1779();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1779 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f263short;
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

    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i10;
        String strM8720;
        String strM1814;
        boolean z10;
        long jM4129;
        u.w wVarM1134;
        int i11;
        y.t0 t0Var = (y.t0) obj;
        m0.m mVar = (m0.m) obj2;
        int iM8515 = C0436.m8515((Number) obj3);
        C0376.m7360(t0Var, C0481.m9366(m4173(), 0, C0061.f81 ^ 819, 3247));
        int i12 = C0297.f444;
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i13 = ((i12 ^ (-1008)) & iM8515) == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM2013 = C0103.m2013((m0.q) mVar, t0Var);
                    int i14 = 1740;
                    while (true) {
                        i14 ^= 1757;
                        switch (i14) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i14 = zM2013 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                i11 = 2;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                i11 = 4;
                                int i15 = 1864;
                                while (true) {
                                    i15 ^= 1881;
                                    switch (i15) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i15 = 48674;
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
                    i10 = (i11 & iM8515) | (iM8515 ^ i11);
                    break;
                case 239:
                    i10 = iM8515;
                    break;
                default:
                    break;
            }
        }
        int i16 = C0474.f744;
        int i17 = 48767;
        while (true) {
            i17 ^= 48784;
            switch (i17) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    break;
                case 76:
                    m0.q qVar = (m0.q) mVar;
                    boolean zM1625 = C0074.m1625(qVar);
                    int i18 = 48891;
                    while (true) {
                        i18 ^= 48908;
                        switch (i18) {
                            case 22:
                                break;
                            case 53:
                                C0471.m9156(qVar);
                                int i19 = 49790;
                                while (true) {
                                    i19 ^= 49807;
                                    switch (i19) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            return C0012.m238();
                                        case 241:
                                            i19 = 49821;
                                            break;
                                    }
                                }
                                break;
                            case 503:
                                i18 = !zM1625 ? 49635 : 48953;
                                break;
                            case 32495:
                                int i20 = 49666;
                                while (true) {
                                    i20 ^= 49683;
                                    switch (i20) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i20 = 49697;
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
                    break;
                case 239:
                    i17 = ((i16 ^ 735) & i10) == 18 ? 48860 : 48829;
                    break;
                default:
                    break;
            }
        }
        y0.l lVarM4370 = C0227.m4370();
        y0.o oVarM8892 = C0457.m8892(C0113.m2181(C0143.m2748(), t0Var), C0146.m2779(mVar));
        float f10 = C0003.f881 ^ (-845);
        y0.o oVarM4788 = C0251.m4788(oVarM8892, f10);
        UserProfile userProfileM6212 = C0322.m6212(this);
        l3 l3VarM2159 = C0112.m2159(this);
        c9.a aVarM1196 = C0062.m1196(this);
        String strM9360 = C0481.m9360(this);
        b.l lVarM2135 = C0110.m2135(this);
        l3 l3VarM1766 = C0082.m1766(this);
        l3 l3VarM1613 = C0074.m1613(this);
        m0.g1 g1VarM1985 = C0101.m1985(this);
        m0.g1 g1VarM2100 = C0108.m2100(this);
        m0.g1 g1VarM8313 = C0424.m8313(this);
        l3 l3VarM6901 = C0353.m6901(this);
        MainViewModel mainViewModelM7438 = C0380.m7438(this);
        m0.g1 g1VarM5855 = C0304.m5855(this);
        m0.g1 g1VarM4806 = C0252.m4806(this);
        m0.g1 g1VarM570 = C0029.m570(this);
        m0.g1 g1VarM8911 = C0458.m8911(this);
        m0.q qVar2 = (m0.q) mVar;
        C0262.m4990(qVar2, 483455216 ^ C0103.f129);
        r1.j0 j0VarM4231 = C0219.m4231(C0204.m3900(), C0173.m3300(), qVar2);
        C0262.m4990(qVar2, (-1323940343) ^ C0293.f440);
        int iM276 = C0014.m276(qVar2);
        m0.r1 r1VarM275 = C0014.m275(qVar2);
        C0014.m280(C0380.m7428());
        t1.j jVarM4451 = C0232.m4451();
        u0.b bVarM6976 = C0356.m6976(oVarM4788);
        boolean z11 = C0196.m3764(qVar2) instanceof m0.d;
        int i21 = 49914;
        while (true) {
            i21 ^= 49931;
            switch (i21) {
                case 497:
                    if (z11) {
                        i21 = 50658;
                    }
                    break;
                case 1711:
                    break;
                case 1736:
                    C0236.m4537();
                    throw null;
                case 1769:
                    C0100.m1961(qVar2);
                    boolean zM7502 = C0383.m7502(qVar2);
                    int i22 = 50689;
                    while (true) {
                        i22 ^= 50706;
                        switch (i22) {
                            case 19:
                                i22 = zM7502 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                C0446.m8685(qVar2);
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                C0017.m346(qVar2, jVarM4451);
                                int i23 = 50813;
                                while (true) {
                                    i23 ^= 50830;
                                    switch (i23) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 243:
                                            i23 = 50844;
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
                    C0089.m1904(qVar2, j0VarM4231, C0063.m1208());
                    C0089.m1904(qVar2, r1VarM275, C0465.m9055());
                    t1.i iVarM5562 = C0290.m5562();
                    boolean zM7503 = C0383.m7502(qVar2);
                    int i24 = 51588;
                    while (true) {
                        i24 ^= 51605;
                        switch (i24) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i24 = !zM7503 ? 51681 : 51650;
                                break;
                            case 54:
                                break;
                            case 87:
                                C0133.m2574(iM276, qVar2, iM276, iVarM5562);
                                break;
                            case 116:
                                boolean zM4399 = C0229.m4399(C0412.m8078(qVar2), C0057.m1083(iM276));
                                int i25 = 51712;
                                while (true) {
                                    i25 ^= 51729;
                                    switch (i25) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i25 = !zM4399 ? 51805 : 51774;
                                            break;
                                        case 47:
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
                    C0353.m6912(0, bVarM6976, new l2(qVar2), qVar2, (-2058659956) ^ C0020.f40);
                    FillElement fillElementM2371 = C0123.m2371();
                    long jM2039 = C0104.m2039();
                    C0272.m5230(fillElementM2371, C0420.m8237(f10), C0067.m1299(jM2039, qVar2, 0), null, null, C0059.m1122(qVar2, 897109028 ^ C0451.f721, new d1(userProfileM6212, strM9360, lVarM2135, l3VarM1766, l3VarM1613, l3VarM2159)), qVar2, 196853 ^ C0338.f608, C0246.f325 ^ 318);
                    float f11 = C0076.f110 ^ 723;
                    C0072.m1564(C0271.m5166(lVarM4370, f11), qVar2);
                    String strM302 = C0015.m302(m4173(), 7, C0037.f57 ^ 675, 927);
                    int i26 = 51836;
                    while (true) {
                        i26 ^= 51853;
                        switch (i26) {
                            case 241:
                                i26 = userProfileM6212 != null ? 52580 : 52549;
                                break;
                            case 1963:
                                break;
                            case 1992:
                                strM8720 = strM302;
                                break;
                            case 2025:
                                strM8720 = C0448.m8720(userProfileM6212);
                                int i27 = 52611;
                                while (true) {
                                    i27 ^= 52628;
                                    switch (i27) {
                                        case 23:
                                            i27 = strM8720 == null ? 52704 : 52673;
                                            break;
                                        case 54:
                                            break;
                                        case 85:
                                            break;
                                        case 116:
                                            strM8720 = strM302;
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
                    switch (C0430.m8418(strM8720)) {
                        case 67452:
                            boolean zM321 = C0016.m321(strM8720, C0184.m3519(m4173(), 62, C0472.f742 ^ 127, 1197));
                            int i28 = 1507751;
                            while (true) {
                                i28 ^= 1507768;
                                switch (i28) {
                                    case 31:
                                        i28 = zM321 ? 1508495 : 1508464;
                                        break;
                                    case 1335:
                                        strM1814 = C0085.m1814(m4173(), 65, C0136.f162 ^ (-340), 762);
                                        break;
                                    case 1480:
                                        strM1814 = strM302;
                                        break;
                                    case 1513:
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 2660340:
                            boolean zM322 = C0016.m321(strM8720, C0041.m814(m4173(), 52, C0302.f449 ^ 954, 1653));
                            int i29 = 56579;
                            while (true) {
                                i29 ^= 56596;
                                switch (i29) {
                                    case 23:
                                        i29 = !zM322 ? 1507472 : 56641;
                                        break;
                                    case 54:
                                        break;
                                    case 85:
                                        String strM6296 = C0326.m6296(m4173(), 56, C0257.f336 ^ (-850), 571);
                                        int i30 = 1507627;
                                        while (true) {
                                            i30 ^= 1507644;
                                            switch (i30) {
                                                case 23:
                                                    i30 = 1507658;
                                                    continue;
                                                case 118:
                                                    strM1814 = strM6296;
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 1564036:
                                        int i31 = 1507503;
                                        while (true) {
                                            i31 ^= 1507520;
                                            switch (i31) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    strM1814 = strM302;
                                                    break;
                                                case 111:
                                                    i31 = 1507534;
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
                            break;
                        case 2719805:
                            boolean zM323 = C0016.m321(strM8720, C0015.m302(m4173(), 42, C0363.f633 ^ 122, 3043));
                            int i32 = 55556;
                            while (true) {
                                i32 ^= 55573;
                                switch (i32) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i32 = !zM323 ? 55649 : 55618;
                                        break;
                                    case 54:
                                        break;
                                    case 87:
                                        String strM5829 = C0303.m5829(m4173(), 46, C0320.f467 ^ 202, 1551);
                                        int i33 = 56455;
                                        while (true) {
                                            i33 ^= 56472;
                                            switch (i33) {
                                                case 31:
                                                    i33 = 56486;
                                                    continue;
                                                case 62:
                                                    strM1814 = strM5829;
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 116:
                                        int i34 = 55680;
                                        while (true) {
                                            i34 ^= 55697;
                                            switch (i34) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i34 = 56362;
                                                    continue;
                                                case 1467:
                                                    strM1814 = strM302;
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
                        case 73542240:
                            boolean zM324 = C0016.m321(strM8720, C0114.m2211(m4173(), 30, C0068.f88 ^ (-765), 584));
                            int i35 = 54533;
                            while (true) {
                                i35 ^= 54550;
                                switch (i35) {
                                    case 19:
                                        i35 = !zM324 ? 54626 : 54595;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 85:
                                        String strM172 = C0008.m172(m4173(), 35, C0436.f706 ^ (-925), 2156);
                                        int i36 = 55432;
                                        while (true) {
                                            i36 ^= 55449;
                                            switch (i36) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i36 = 55463;
                                                    continue;
                                                case 62:
                                                    strM1814 = strM172;
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 116:
                                        int i37 = 54657;
                                        while (true) {
                                            i37 ^= 54674;
                                            switch (i37) {
                                                case 19:
                                                    i37 = 54688;
                                                    continue;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    strM1814 = strM302;
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
                        case 1314132820:
                            boolean zM325 = C0016.m321(strM8720, C0274.m5259(m4173(), 13, C0251.f330 ^ (-144), 2534));
                            int i38 = 53510;
                            while (true) {
                                i38 ^= 53527;
                                switch (i38) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i38 = !zM325 ? 53603 : 53572;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 83:
                                        String strM2756 = C0143.m2756(m4173(), 23, C0020.f40 ^ (-670), 2905);
                                        int i39 = 53758;
                                        while (true) {
                                            i39 ^= 53775;
                                            switch (i39) {
                                                case 1009:
                                                    i39 = 54440;
                                                    continue;
                                                case 1703:
                                                    strM1814 = strM2756;
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 116:
                                        int i40 = 53634;
                                        while (true) {
                                            i40 ^= 53651;
                                            switch (i40) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i40 = 53665;
                                                    continue;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    strM1814 = strM302;
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
                            int i41 = 52735;
                            while (true) {
                                i41 ^= 52752;
                                switch (i41) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        strM1814 = strM302;
                                        break;
                                    case 1007:
                                        i41 = 52766;
                                        continue;
                                    default:
                                        continue;
                                }
                            }
                            break;
                    }
                    C0262.m4990(qVar2, 1216094097 ^ C0376.f646);
                    Object objM8078 = C0412.m8078(qVar2);
                    Object objM2417 = C0125.m2417();
                    long j10 = ((long) C0488.f761) ^ (-286);
                    int i42 = 1508526;
                    while (true) {
                        i42 ^= 1508543;
                        switch (i42) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i42 = objM8078 == objM2417 ? 1508619 : 1508588;
                                break;
                            case 83:
                                break;
                            case 114:
                                break;
                            case 436:
                                objM8078 = C0173.m3305(C0439.m8554(j10), C0111.m2137());
                                C0479.m9328(qVar2, objM8078);
                                break;
                            default:
                                break;
                        }
                    }
                    m0.g1 g1Var = (m0.g1) objM8078;
                    C0171.m3270(qVar2, false);
                    Long lM8554 = C0439.m8554(C0201.m3863((Number) C0419.m8214(l3VarM2159)));
                    C0262.m4990(qVar2, (-1216093984) ^ C0263.f342);
                    boolean zM2014 = C0103.m2013(qVar2, l3VarM2159);
                    Object objM8079 = C0412.m8078(qVar2);
                    int i43 = 1508650;
                    while (true) {
                        i43 ^= 1508667;
                        switch (i43) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM2014) {
                                    i43 = 1509394;
                                }
                                break;
                            case 83:
                                objM8079 = new e1(l3VarM2159, g1Var, null);
                                C0479.m9328(qVar2, objM8079);
                                break;
                            case 114:
                                break;
                            case 3369:
                                int i44 = 1509425;
                                while (true) {
                                    i44 ^= 1509442;
                                    switch (i44) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            int i45 = 1509673;
                                            while (true) {
                                                i45 ^= 1509690;
                                                switch (i45) {
                                                    case 19:
                                                        i45 = 1510355;
                                                        break;
                                                    case 745:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 115:
                                            if (objM8079 == objM2417) {
                                                i44 = 1509518;
                                            }
                                            break;
                                        case 204:
                                            int i46 = 1509549;
                                            while (true) {
                                                i46 ^= 1509566;
                                                switch (i46) {
                                                    case 19:
                                                        i46 = 1509580;
                                                        break;
                                                    case 114:
                                                        objM8079 = new e1(l3VarM2159, g1Var, null);
                                                        C0479.m9328(qVar2, objM8079);
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i44 = 1509487;
                                }
                                break;
                            default:
                                continue;
                        }
                        i43 = 1508712;
                    }
                    C0171.m3270(qVar2, false);
                    C0406.m7954(lM8554, (c9.e) objM8079, qVar2);
                    long jM3863 = C0201.m3863((Number) C0419.m8214(g1Var));
                    long j11 = (-86400901) ^ C0135.f161;
                    long j12 = jM3863 / j11;
                    long jM3864 = C0201.m3863((Number) C0419.m8214(g1Var));
                    long j13 = 3599553 ^ C0393.f663;
                    long j14 = (jM3864 % j11) / j13;
                    long jM3865 = C0201.m3863((Number) C0419.m8214(g1Var));
                    long j15 = (-60281) ^ C0437.f707;
                    long j16 = (jM3865 % j13) / j15;
                    long jM3866 = (C0201.m3863((Number) C0419.m8214(g1Var)) % j15) / ((long) (C0168.f192 ^ 88));
                    long jM3867 = C0201.m3863((Number) C0419.m8214(g1Var));
                    int i47 = 1510448;
                    while (true) {
                        i47 ^= 1510465;
                        switch (i47) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 47:
                                z10 = false;
                                break;
                            case 113:
                                i47 = 1 <= jM3867 ? 1510541 : 1510510;
                                break;
                            case 204:
                                int i48 = 1510572;
                                while (true) {
                                    i48 ^= 1510589;
                                    switch (i48) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i48 = jM3867 < 3600001 ? 1511316 : 1510634;
                                            break;
                                        case 87:
                                            z10 = false;
                                            break;
                                        case 118:
                                            break;
                                        case 809:
                                            z10 = true;
                                            int i49 = 1511347;
                                            while (true) {
                                                i49 ^= 1511364;
                                                switch (i49) {
                                                    case 22:
                                                        break;
                                                    case 119:
                                                        i49 = 1511378;
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
                                break;
                            default:
                                break;
                        }
                    }
                    long jM3868 = C0201.m3863((Number) C0419.m8214(g1Var));
                    int i50 = 1511471;
                    while (true) {
                        i50 ^= 1511488;
                        switch (i50) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                jM4129 = C0217.m4129(C0315.m6087(), 0.15f);
                                int i51 = 1513269;
                                while (true) {
                                    i51 ^= 1513286;
                                    switch (i51) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 115:
                                            i51 = 1513300;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 111:
                                i50 = jM3868 > j10 ? 1511564 : 1511533;
                                break;
                            case 204:
                                int i52 = 1511595;
                                while (true) {
                                    i52 ^= 1511612;
                                    switch (i52) {
                                        case 23:
                                            i52 = z10 ? 1512339 : 1512308;
                                            break;
                                        case 815:
                                            jM4129 = C0019.m389((-4281538960L) ^ ((long) C0228.f307));
                                            break;
                                        case 968:
                                            jM4129 = C0217.m4129(C0045.m882(), 0.1f);
                                            int i53 = 1512494;
                                            while (true) {
                                                i53 ^= 1512511;
                                                switch (i53) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i53 = 1512525;
                                                        continue;
                                                    case 114:
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 1001:
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
                    int i54 = 1512370;
                    while (true) {
                        i54 ^= 1512387;
                        switch (i54) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                k0.g0 g0VarM1299 = C0067.m1299(jM4129, qVar2, 0);
                                e0.e eVarM8237 = C0420.m8237(f10);
                                int i55 = 1513393;
                                while (true) {
                                    i55 ^= 1513410;
                                    switch (i55) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            wVarM1134 = null;
                                            break;
                                        case 115:
                                            i55 = z10 ? 1513486 : 1513455;
                                            break;
                                        case 4044:
                                            wVarM1134 = C0059.m1134(1, C0217.m4129(C0019.m389(4294941049L ^ ((long) C0082.f116)), 0.5f));
                                            int i56 = 1513517;
                                            while (true) {
                                                i56 ^= 1513534;
                                                switch (i56) {
                                                    case 19:
                                                        i56 = 1514199;
                                                        continue;
                                                    case 745:
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
                                C0272.m5230(fillElementM2371, eVarM8237, g0VarM1299, null, wVarM1134, C0059.m1122(qVar2, 911970 ^ C0063.f83, new f1(z10, g1Var, strM1814, l3VarM2159, j12, j14, j16, jM3866)), qVar2, (-196838) ^ C0033.f53, C0025.f45 ^ 98);
                                C0072.m1564(C0271.m5166(lVarM4370, f11), qVar2);
                                C0262.m4990(qVar2, (-1216090957) ^ C0225.f304);
                                Object objM80710 = C0412.m8078(qVar2);
                                m0.g1 g1VarM9399 = C0483.m9399(this);
                                int i57 = 1514292;
                                while (true) {
                                    i57 ^= 1514309;
                                    switch (i57) {
                                        case 22:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                            break;
                                        case 113:
                                            i57 = objM80710 == objM2417 ? 1514385 : 1514354;
                                            break;
                                        case 212:
                                            objM80710 = C0172.m3289(C0290.f434 ^ (-218), g1VarM9399, qVar2);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                C0171.m3270(qVar2, false);
                                C0272.m5230(C0447.m8712(fillElementM2371, (c9.a) objM80710), C0420.m8237(f10), C0067.m1299(jM2039, qVar2, 0), null, null, C0059.m1122(qVar2, 925842669 ^ C0474.f744, new u.l1(C0164.f188 ^ 411, g1VarM9399, C0330.m6352(this))), qVar2, 197401 ^ C0204.f228, C0283.f427 ^ (-972));
                                C0072.m1564(C0271.m5166(lVarM4370, f11), qVar2);
                                long jM41210 = C0217.m4129(C0001.m41(), 0.5f);
                                int i58 = C0121.f147 ^ 605;
                                C0185.m3537(C0241.m4608(m4173(), 70, C0027.f47 ^ 806, 3072), fillElementM2371, jM41210, C0135.m2601(i58), null, null, null, 0L, null, new l2.i(C0152.f177 ^ 353), 0L, 0, false, 0, 0, null, null, qVar2, 3120, 0, (-130834) ^ C0032.f52);
                                C0072.m1564(C0271.m5166(lVarM4370, f10), qVar2);
                                C0262.m4990(qVar2, (-1216081923) ^ C0167.f191);
                                Object objM80711 = C0412.m8078(qVar2);
                                int i59 = 1514416;
                                while (true) {
                                    i59 ^= 1514433;
                                    switch (i59) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 47:
                                            break;
                                        case 113:
                                            i59 = objM80711 == objM2417 ? 1515160 : 1514478;
                                            break;
                                        case 1369:
                                            objM80711 = C0172.m3289(C0048.f68 ^ (-747), g1VarM1985, qVar2);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                C0171.m3270(qVar2, false);
                                C0272.m5230(C0447.m8712(fillElementM2371, (c9.a) objM80711), C0420.m8237(f10), C0067.m1299(jM2039, qVar2, 0), null, null, C0059.m1122(qVar2, (-1852597878) ^ C0113.f139, new u(g1VarM1985, g1VarM2100, g1VarM8313, l3VarM6901, mainViewModelM7438)), qVar2, 196871 ^ C0332.f479, C0072.f104 ^ 105);
                                float f12 = C0316.f463 ^ 526;
                                C0072.m1564(C0271.m5166(lVarM4370, f12), qVar2);
                                C0262.m4990(qVar2, (-1216078571) ^ C0021.f41);
                                Object objM80712 = C0412.m8078(qVar2);
                                int i60 = 1515191;
                                while (true) {
                                    i60 ^= 1515208;
                                    switch (i60) {
                                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                            break;
                                        case 61:
                                            break;
                                        case 127:
                                            if (objM80712 == objM2417) {
                                                i60 = 1515284;
                                            }
                                            break;
                                        case 476:
                                            objM80712 = C0172.m3289(i58, g1VarM5855, qVar2);
                                            int i61 = 1515315;
                                            while (true) {
                                                i61 ^= 1515332;
                                                switch (i61) {
                                                    case 22:
                                                        break;
                                                    case 119:
                                                        i61 = 1515346;
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i60 = 1515253;
                                }
                                C0171.m3270(qVar2, false);
                                C0272.m5230(C0447.m8712(fillElementM2371, (c9.a) objM80712), C0420.m8237(f10), C0067.m1299(jM2039, qVar2, 0), null, null, C0059.m1122(qVar2, (-1515614625) ^ C0050.f70, new d1(g1VarM5855, g1VarM4806, g1VarM570, g1VarM8911, l3VarM6901, mainViewModelM7438)), qVar2, 197351 ^ C0329.f476, C0030.f50 ^ 766);
                                float f13 = C0253.f332 ^ 653;
                                C0072.m1564(C0271.m5166(lVarM4370, f13), qVar2);
                                C0066.m1280();
                                C0057.m1096(aVarM1196, fillElementM2371, false, C0420.m8237(f12), C0486.m9441(C0315.m6087(), (-188) ^ ((long) C0366.f636), qVar2, C0388.f658 ^ (-882)), null, null, null, null, C0154.m2959(), qVar2, (-805307160) ^ C0067.f87, C0135.f161 ^ (-609));
                                C0072.m1564(C0271.m5166(lVarM4370, f13), qVar2);
                                C0171.m3270(qVar2, false);
                                C0171.m3270(qVar2, true);
                                C0171.m3270(qVar2, false);
                                C0171.m3270(qVar2, false);
                                break;
                            case 113:
                                i54 = 1512401;
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i21 = 50627;
        }
        return C0012.m238();
    }
}
