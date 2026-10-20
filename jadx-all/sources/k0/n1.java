package k0;

import aa.C0012;
import androidx.compose.ui.graphics.C0030;
import androidx.preference.C0044;
import androidx.startup.C0047;
import c0.C0056;
import c1.C0059;
import c3.C0062;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.measurement.C0181;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0213;
import g.C0283;
import g3.C0289;
import h3.C0302;
import h8.C0314;
import k7.C0338;
import m5.C0356;
import r6.C0403;
import t2.C0424;
import u4.C0436;
import u4.C0437;
import w0.C0455;
import w6.C0465;
import x5.C0471;
import y.C0475;
import z.C0482;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends d9.j implements c9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g2.l0 f9254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x.m f9255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9256f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c9.e f9257n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c9.e f9258o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c9.e f9259p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c9.e f9260q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c9.e f9261r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c9.e f9262s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c9.e f9263t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final m4 f9264u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e1.l0 f9265v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(String str, boolean z10, boolean z11, g2.l0 l0Var, x.m mVar, boolean z12, c9.e eVar, c9.e eVar2, c9.e eVar3, c9.e eVar4, c9.e eVar5, c9.e eVar6, c9.e eVar7, m4 m4Var, e1.l0 l0Var2) {
        super(C0090.f124 ^ 857);
        this.f9251a = str;
        this.f9252b = z10;
        this.f9253c = z11;
        this.f9254d = l0Var;
        this.f9255e = mVar;
        this.f9256f = z12;
        this.f9257n = eVar;
        this.f9258o = eVar2;
        this.f9259p = eVar3;
        this.f9260q = eVar4;
        this.f9261r = eVar5;
        this.f9262s = eVar6;
        this.f9263t = eVar7;
        this.f9264u = m4Var;
        this.f9265v = l0Var2;
        int iM3452 = C0181.m3452();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3452 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0455.m8860("xBmR9olAiZxQXEQe")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i10;
        int i11;
        c9.e eVar = (c9.e) obj;
        m0.m mVar = (m0.m) obj2;
        int iM8515 = C0436.m8515((Number) obj3);
        int i12 = C0030.f50;
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i13 = ((i12 ^ 736) & iM8515) == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM5551 = C0289.m5551((m0.q) mVar, eVar);
                    int i14 = 1740;
                    while (true) {
                        i14 ^= 1757;
                        switch (i14) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i14 = zM5551 ? 1833 : 1802;
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
        int i16 = C0194.f218;
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
                                if (!zM1625) {
                                    i18 = 49635;
                                }
                                break;
                            case 32495:
                                int i20 = 49666;
                                while (true) {
                                    i20 ^= 49683;
                                    switch (i20) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i20 = 49697;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i18 = 48953;
                    }
                    break;
                case 239:
                    if (((i16 ^ 168) & i10) == 18) {
                        i17 = 48860;
                    }
                    break;
                default:
                    continue;
            }
            i17 = 48829;
        }
        m1 m1VarM3550 = C0186.m3550();
        String strM9050 = C0465.m9050(this);
        boolean zM6075 = C0314.m6075(this);
        boolean zM9239 = C0475.m9239(this);
        g2.l0 l0VarM2134 = C0110.m2134(this);
        x.m mVarM1189 = C0062.m1189(this);
        boolean zM3024 = C0158.m3024(this);
        c9.e eVarM5810 = C0302.m5810(this);
        c9.e eVarM9378 = C0482.m9378(this);
        c9.e eVarM4062 = C0213.m4062(this);
        c9.e eVarM237 = C0012.m237(this);
        c9.e eVarM6628 = C0338.m6628(this);
        c9.e eVarM851 = C0044.m851(this);
        c9.e eVarM3682 = C0193.m3682(this);
        m4 m4VarM911 = C0047.m911(this);
        C0424.m8310(m1VarM3550, strM9050, eVar, zM6075, zM9239, l0VarM2134, mVarM1189, zM3024, eVarM5810, eVarM9378, eVarM4062, eVarM237, eVarM6628, eVarM851, eVarM3682, m4VarM911, null, C0059.m1122(mVar, (-2108827772) ^ C0436.f706, new h0.c(zM6075, zM3024, mVarM1189, m4VarM911, C0056.m1070(this))), mVar, (i10 << (C0356.f626 ^ (-115))) & (C0403.f673 ^ 888), (-14156756) ^ C0283.f427, (-33049) ^ C0437.f707);
        return C0012.m238();
    }
}
