package k0;

import aa.C0012;
import android.support.v4.app.C0014;
import androidx.compose.ui.semantics.C0039;
import androidx.preference.C0044;
import c1.C0059;
import c7.C0069;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.firebase.annotations.C0127;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0170;
import com.google.firebase.iid.C0171;
import com.google.firebase.inject.C0172;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.measurement.C0181;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.bind.C0207;
import com.ride.accepter.R;
import d3.C0216;
import d4.C0217;
import d7.C0219;
import dagger.hilt.android.components.C0228;
import dagger.hilt.components.C0243;
import dagger.hilt.internal.aliasof.C0247;
import e1.C0257;
import e1.C0258;
import e2.C0261;
import f.C0270;
import g.C0282;
import h3.C0302;
import h6.C0309;
import k.C0331;
import k3.C0334;
import l0.C0339;
import l3.C0342;
import m1.C0350;
import m4.C0353;
import o5.C0370;
import okhttp3.internal.publicsuffix.C0372;
import q7.C0390;
import s0.C0409;
import s8.C0416;
import t0.C0418;
import t2.C0423;
import u.C0428;
import u4.C0435;
import v0.C0441;
import v9.C0451;
import w0.C0454;
import w4.C0460;
import x5.C0470;
import y9.C0478;
import z.C0481;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends d9.j implements c9.e {
    public final c9.e A;
    public final c9.e B;
    public final c9.e C;
    public final e1.l0 D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.e f9288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0.o f9289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m4 f9291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c9.c f9293f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f9294n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f9295o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a2.c0 f9296p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f0.b1 f9297q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f0.a1 f9298r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f9299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f9300t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f9301u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final g2.l0 f9302v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x.m f9303w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c9.e f9304x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c9.e f9305y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c9.e f9306z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(c9.e eVar, y0.o oVar, boolean z10, m4 m4Var, String str, c9.c cVar, boolean z11, boolean z12, a2.c0 c0Var, f0.b1 b1Var, f0.a1 a1Var, boolean z13, int i10, int i11, g2.l0 l0Var, x.m mVar, c9.e eVar2, c9.e eVar3, c9.e eVar4, c9.e eVar5, c9.e eVar6, c9.e eVar7, e1.l0 l0Var2) {
        super(C0309.f457 ^ (-412));
        this.f9288a = eVar;
        this.f9289b = oVar;
        this.f9290c = z10;
        this.f9291d = m4Var;
        this.f9292e = str;
        this.f9293f = cVar;
        this.f9294n = z11;
        this.f9295o = z12;
        this.f9296p = c0Var;
        this.f9297q = b1Var;
        this.f9298r = a1Var;
        this.f9299s = z13;
        this.f9300t = i10;
        this.f9301u = i11;
        this.f9302v = l0Var;
        this.f9303w = mVar;
        this.f9304x = eVar2;
        this.f9305y = eVar3;
        this.f9306z = eVar4;
        this.A = eVar5;
        this.B = eVar6;
        this.C = eVar7;
        this.D = l0Var2;
        int iM8612 = C0441.m8612();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8612 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0350.m6859("j7NR5v1Ya")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x002c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0010. Please report as an issue. */
    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        long jM4940;
        m0.m mVar = (m0.m) obj;
        int iM8515 = C0435.m8515((Number) obj2);
        int i10 = C0176.f200;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ (-804)) & iM8515) == 2 ? 1709 : 1678;
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
                                C0470.m9156(qVar);
                                int i13 = 48767;
                                while (true) {
                                    i13 ^= 48784;
                                    switch (i13) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
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
                                            break;
                                        case 47483:
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
                    break;
                default:
                    break;
            }
            return C0012.m238();
        }
        c9.e eVarM4919 = C0257.m4919(this);
        y0.o oVarM7268 = C0370.m7268(this);
        int i15 = 48891;
        while (true) {
            i15 ^= 48908;
            switch (i15) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    i15 = eVarM4919 != null ? 49635 : 48953;
                    break;
                case 32495:
                    oVarM7268 = C0187.m3568(C0039.m758(oVarM7268, true, C0334.m6489()), 0.0f, C0132.m2553(), 0.0f, 0.0f, C0243.f323 ^ 125);
                    break;
                default:
                    break;
            }
        }
        String strM6667 = C0339.m6667(R.string.summary_collapsed_preference_list ^ C0470.f741, mVar);
        C0428.m8394();
        boolean zM8032 = C0409.m8032(this);
        int i16 = 49666;
        while (true) {
            i16 ^= 49683;
            switch (i16) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i16 = zM8032 ? 49759 : 49728;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    oVarM7268 = C0039.m758(oVarM7268, false, new m(strM6667, 2));
                    break;
                case 83:
                    break;
                default:
                    break;
            }
        }
        y0.o oVarM7646 = C0390.m7646(oVarM7268, C0481.m9375(), C0451.m8797());
        m4 m4VarM6928 = C0353.m6928(this);
        C0014.m280(m4VarM6928);
        m0.q qVar2 = (m0.q) mVar;
        C0261.m4990(qVar2, (-1885421901) ^ C0423.f694);
        int i17 = 49790;
        while (true) {
            i17 ^= 49807;
            switch (i17) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    jM4940 = C0258.m4940(m4VarM6928);
                    break;
                case 84:
                    jM4940 = C0416.m8186(m4VarM6928);
                    int i18 = 49914;
                    while (true) {
                        i18 ^= 49931;
                        switch (i18) {
                            case 497:
                                i18 = 50596;
                                break;
                            case 1711:
                                break;
                        }
                    }
                    break;
                case 241:
                    if (zM8032) {
                        i17 = 49883;
                    }
                    break;
                default:
                    continue;
            }
            i17 = 49852;
        }
        m0.g1 g1VarM862 = C0044.m862(new e1.r(jM4940), qVar2);
        C0171.m3270(qVar2, false);
        e1.n0 n0Var = new e1.n0(C0454.m8864((e1.r) C0418.m8214(g1VarM862)));
        String strM9335 = C0478.m9335(this);
        c9.c cVarM4142 = C0217.m4142(this);
        boolean zM1344 = C0069.m1344(this);
        boolean zM3664 = C0192.m3664(this);
        a2.c0 c0VarM4737 = C0247.m4737(this);
        f0.b1 b1VarM6404 = C0331.m6404(this);
        f0.a1 a1VarM3453 = C0181.m3453(this);
        boolean zM5830 = C0302.m5830(this);
        int iM7301 = C0372.m7301(this);
        int iM1582 = C0073.m1582(this);
        g2.l0 l0VarM4393 = C0228.m4393(this);
        x.m mVarM5455 = C0282.m5455(this);
        C0270.m5160(strM9335, cVarM4142, oVarM7646, zM1344, zM3664, c0VarM4737, b1VarM6404, a1VarM3453, zM5830, iM7301, iM1582, l0VarM4393, null, mVarM5455, n0Var, C0059.m1122(mVar, 1474611700 ^ C0342.f613, new n1(strM9335, zM1344, zM5830, l0VarM4393, mVarM5455, C0409.m8032(this), C0257.m4919(this), C0172.m3281(this), C0170.m3263(this), C0216.m4122(this), C0460.m8977(this), C0127.m2455(this), C0059.m1127(this), C0353.m6928(this), C0207.m3967(this))), mVar, 0, 196608, C0219.f299 ^ 4354);
        return C0012.m238();
    }
}
