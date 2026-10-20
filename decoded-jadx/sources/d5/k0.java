package d5;

import aa.C0012;
import android.content.Context;
import androidx.appcompat.widget.C0020;
import androidx.compose.ui.node.C0037;
import c4.C0066;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.common.api.internal.C0082;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.remoteconfig.internal.Code;
import d4.C0217;
import d9.C0224;
import dagger.hilt.android.components.C0227;
import e1.C0258;
import e2.C0260;
import f6.C0278;
import fa.C0280;
import g.C0284;
import h6.C0309;
import h7.C0311;
import i.C0316;
import i5.C0318;
import j4.C0326;
import k3.C0334;
import l9.C0347;
import m0.l3;
import m7.C0356;
import n8.C0365;
import q7.C0390;
import r1.C0393;
import s7.C0415;
import t0.C0418;
import t2.C0421;
import u8.C0438;
import v8.C0450;
import w1.C0455;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f272short = {2320, 2310, 2304, 2364, 2318, 2314, 2317, 2364, 2323, 2314, 2304, 2312, 2326, 2323, 2364, 2312, 2318, 622, 632, 638, 578, 624, 636, 613, 578, 621, 628, 638, 630, 616, 621, 578, 630, 624, 386, 404, 402, 430, 412, 408, 415, 430, 405, 387, 414, 385, 430, 410, 412, 1793, 1815, 1809, 1837, 1823, 1811, 1802, 1837, 1814, 1792, 1821, 1794, 1837, 1817, 1823, 3121, 3134, 3131, 3107, 3122, 3109, 3080, 3108, 3126, 3105, 3122, 3123};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainViewModel f4598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.g1 f4601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0.g1 f4602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0.g1 f4603f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m0.g1 f4604n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m0.g1 f4605o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m0.g1 f4606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l3 f4607q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(MainViewModel mainViewModel, boolean z10, Context context, m0.g1 g1Var, m0.g1 g1Var2, m0.g1 g1Var3, m0.g1 g1Var4, m0.g1 g1Var5, m0.g1 g1Var6, l3 l3Var) {
        super(0);
        this.f4598a = mainViewModel;
        this.f4599b = z10;
        this.f4600c = context;
        this.f4601d = g1Var;
        this.f4602e = g1Var2;
        this.f4603f = g1Var3;
        this.f4604n = g1Var4;
        this.f4605o = g1Var5;
        this.f4606p = g1Var6;
        this.f4607q = l3Var;
        int iM4224 = C0218.m4224();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4224 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0309.m5968("4la5Q")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۨ۟۠, reason: not valid java name and contains not printable characters */
    public static short[] m4184() {
        int iM226 = C0012.m226();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM226 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f272short;
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

    @Override // c9.a
    public final Object invoke() {
        float f10;
        float f11;
        float fM2193;
        float fM2194 = 0.0f;
        Float fM1285 = C0066.m1285((String) C0418.m8214(C0020.m398(this)));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = fM1285 != null ? 1709 : 1678;
                    break;
                case 204:
                    float fM2195 = C0113.m2193(fM1285);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                continue;
                            case 54:
                                f10 = fM2195;
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    f10 = 0.0f;
                    break;
                default:
                    break;
            }
        }
        Float fM1286 = C0066.m1285((String) C0418.m8214(C0126.m2439(this)));
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i12 = fM1286 != null ? 48736 : 48705;
                    break;
                case 47384:
                    f11 = 50.0f;
                    break;
                case 47417:
                    float fM2196 = C0113.m2193(fM1286);
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                f11 = fM2196;
                                break;
                            case 239:
                                i13 = 48798;
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
        Float fM1287 = C0066.m1285((String) C0418.m8214(C0326.m6303(this)));
        int i14 = 48891;
        while (true) {
            i14 ^= 48908;
            switch (i14) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    i14 = fM1287 != null ? 49635 : 48953;
                    break;
                case 32495:
                    fM2194 = C0113.m2193(fM1287);
                    break;
                default:
                    break;
            }
        }
        Float fM1288 = C0066.m1285((String) C0418.m8214(C0347.m6806(this)));
        int i15 = 49666;
        while (true) {
            i15 ^= 49683;
            switch (i15) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i15 = fM1288 != null ? 49759 : 49728;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    fM2193 = C0113.m2193(fM1288);
                    int i16 = 49790;
                    while (true) {
                        i16 ^= 49807;
                        switch (i16) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 241:
                                i16 = 49821;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 83:
                    fM2193 = 100.0f;
                    break;
                default:
                    break;
            }
        }
        z4.d dVarM5385 = C0278.m5385(C0280.m5419(this));
        C0227.m4376(C0168.m3218(C0167.m3199(C0421.m8270(C0393.m7699(dVarM5385))), C0217.m4134(m4184(), 0, C0415.f686 ^ 796, 2403), f10));
        z4.b bVarM7699 = C0393.m7699(dVarM5385);
        C0227.m4376(C0168.m3218(C0167.m3199(C0421.m8270(bVarM7699)), C0455.m8879(m4184(), 17, C0037.f57 ^ 692, 541), f11));
        C0227.m4376(C0168.m3218(C0167.m3199(C0421.m8270(bVarM7699)), C0438.m8563(m4184(), 34, C0258.f338 ^ 747, 497), fM2194));
        C0227.m4376(C0168.m3218(C0167.m3199(C0421.m8270(bVarM7699)), C0284.m5476(m4184(), 49, C0390.f661 ^ (-310), 1906), fM2193));
        Boolean boolM6483 = C0334.m6483();
        C0224.m4315(C0365.m7159(this), boolM6483);
        boolean zM2498 = C0129.m2498(this);
        int i17 = 49914;
        while (true) {
            i17 ^= 49931;
            switch (i17) {
                case 497:
                    if (zM2498) {
                        i17 = 50658;
                    }
                    break;
                case 1711:
                    break;
                case 1736:
                    break;
                case 1769:
                    C0224.m4315(C0311.m6018(this), boolM6483);
                    break;
                default:
                    continue;
            }
            i17 = 50627;
        }
        C0318.m6169();
        C0079.m1702(C0356.m6990(C0450.m8777(this), C0316.m6122(C0082.m1753(m4184(), 64, C0260.f340 ^ (-761), 3159), (String) C0418.m8214(C0122.m2346(this))), 0));
        return C0012.m238();
    }
}
