package k0;

import a.C0001;
import a0.C0003;
import aa.C0012;
import android.support.v4.app.C0014;
import androidx.activity.C0017;
import androidx.compose.ui.input.key.C0033;
import b.C0049;
import b3.C0051;
import c0.C0057;
import c3.C0063;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.C0128;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.components.C0134;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0171;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import e2.C0262;
import e2.C0263;
import f.C0271;
import f0.C0272;
import g4.C0290;
import g5.C0291;
import h5.C0307;
import i9.C0322;
import k1.C0333;
import m0.C0350;
import m3.C0353;
import m5.C0356;
import p8.C0380;
import q0.C0383;
import r6.C0402;
import s2.C0412;
import s6.C0414;
import u2.C0434;
import u4.C0436;
import v5.C0446;
import v7.C0449;
import w.C0454;
import w2.C0457;
import w5.C0463;
import w6.C0465;
import x5.C0471;
import y.C0476;
import y9.C0479;

/* JADX INFO: loaded from: classes.dex */
public final class o3 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0.o f9313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1.l0 f9314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u.w f9317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x.m f9318f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f9319n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c9.a f9320o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f9321p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c9.e f9322q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(y0.o oVar, e1.l0 l0Var, long j10, float f10, u.w wVar, x.m mVar, boolean z10, c9.a aVar, float f11, u0.b bVar) {
        super(C0149.f174 ^ (-141));
        this.f9313a = oVar;
        this.f9314b = l0Var;
        this.f9315c = j10;
        this.f9316d = f10;
        this.f9317e = wVar;
        this.f9318f = mVar;
        this.f9319n = z10;
        this.f9320o = aVar;
        this.f9321p = f11;
        this.f9322q = bVar;
        int iM9013 = C0463.m9013();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9013 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0380.m7437("fHNh3wzr1l")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:49:0x014e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x0177. Please report as an issue. */
    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        m0.m mVar = (m0.m) obj;
        int iM8515 = C0436.m8515((Number) obj2);
        int i10 = C0051.f71;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ (-431)) & iM8515) == 2 ? 1709 : 1678;
                    break;
                case 204:
                    m0.q qVar = (m0.q) mVar;
                    boolean zM1625 = C0074.m1625(qVar);
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM1625) {
                                    i12 = 1833;
                                }
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
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i12 = 1802;
                    }
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        C0402.m7870();
        m0.q qVar2 = (m0.q) mVar;
        y0.o oVarM6973 = C0356.m6973(C0049.m953(C0449.m8743(C0414.m8119(this), C0322.m6229()), C0263.m5020(this), C0307.m5924(C0134.m2583(this), C0271.m5156(this), mVar), C0033.m643(this), C0114.m2209((m2.b) C0476.m9256(qVar2, C0479.m9327()), C0272.m5233(this))), C0434.m8475(this), C0333.m6446(false, 0.0f, 0L, qVar2, 0, C0001.f769 ^ (-983)), C0291.m5596(this), null, C0187.m3566(this), C0151.f176 ^ (-938));
        C0262.m4990(qVar2, 733329064 ^ C0454.f724);
        r1.j0 j0VarM2476 = C0128.m2476(C0457.m8889(), true, qVar2);
        C0262.m4990(qVar2, 1323940485 ^ C0003.f881);
        int iM276 = C0014.m276(qVar2);
        m0.r1 r1VarM275 = C0014.m275(qVar2);
        C0014.m280(C0380.m7428());
        t1.j jVarM4451 = C0232.m4451();
        u0.b bVarM6976 = C0356.m6976(oVarM6973);
        boolean z10 = C0196.m3764(qVar2) instanceof m0.d;
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
                    if (z10) {
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
                    C0089.m1904(qVar2, j0VarM2476, C0063.m1208());
                    C0089.m1904(qVar2, r1VarM275, C0465.m9055());
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
                    C0353.m6912(0, bVarM6976, new m0.l2(qVar2), qVar2, 2058660288 ^ C0350.f620);
                    C0465.m9049(C0232.m4456(this), qVar2, C0057.m1083(0));
                    C0171.m3270(qVar2, false);
                    C0171.m3270(qVar2, true);
                    C0171.m3270(qVar2, false);
                    C0171.m3270(qVar2, false);
                    break;
                default:
                    continue;
            }
            i15 = 48953;
        }
        return C0012.m238();
    }
}
