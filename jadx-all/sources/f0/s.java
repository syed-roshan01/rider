package f0;

import a3.C0006;
import aa.C0012;
import android.support.v4.app.C0014;
import androidx.activity.C0017;
import c0.C0056;
import c0.C0057;
import c3.C0063;
import com.auto.accept.ui.viewmodel.C0074;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.iid.C0171;
import com.google.firebase.measurement.C0182;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import d9.C0227;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.aggregatedroot.codegen.C0246;
import e0.C0257;
import e2.C0262;
import e2.C0263;
import e9.C0267;
import f4.C0276;
import g.C0284;
import g4.C0290;
import ga.C0296;
import h3.C0303;
import l0.C0340;
import m0.l2;
import m3.C0353;
import m5.C0356;
import o2.C0369;
import o4.C0370;
import o7.i2;
import p8.C0380;
import q0.C0383;
import s2.C0412;
import t2.C0424;
import u4.C0436;
import v5.C0446;
import v6.C0447;
import w6.C0465;
import x5.C0471;

/* JADX INFO: loaded from: classes.dex */
public final class s extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.v0 f5882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f5883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.c f5886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g2.a0 f5887f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g2.s f5888n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m2.b f5889o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f5890p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(h0.v0 v0Var, c2 c2Var, boolean z10, boolean z11, c9.c cVar, g2.a0 a0Var, g2.s sVar, m2.b bVar, int i10) {
        super(C0340.f610 ^ (-971));
        this.f5882a = v0Var;
        this.f5883b = c2Var;
        this.f5884c = z10;
        this.f5885d = z11;
        this.f5886e = cVar;
        this.f5887f = a0Var;
        this.f5888n = sVar;
        this.f5889o = bVar;
        this.f5890p = i10;
        int iM4710 = C0246.m4710();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4710 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0056.m1075("ym")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        m0.m mVar = (m0.m) obj;
        int iM8515 = C0436.m8515((Number) obj2);
        int i10 = C0424.f694;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ 813) & iM8515) == 2 ? 1709 : 1678;
                    break;
                case 204:
                    m0.q qVar = (m0.q) mVar;
                    boolean zM1625 = C0074.m1625(qVar);
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
        r rVar = new r(C0267.m5089(this), C0160.m3064(this), C0369.m7231(this), C0232.m4461(this), C0152.m2926(this), C0303.m5825(this));
        m0.q qVar2 = (m0.q) mVar;
        C0262.m4990(qVar2, 1323940340 ^ C0447.f717);
        y0.l lVarM4370 = C0227.m4370();
        int iM276 = C0014.m276(qVar2);
        m0.r1 r1VarM275 = C0014.m275(qVar2);
        C0014.m280(C0380.m7428());
        t1.j jVarM4451 = C0232.m4451();
        u0.b bVarM6976 = C0356.m6976(lVarM4370);
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
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
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
                    C0089.m1904(qVar2, rVar, C0063.m1208());
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
                    C0353.m6912(0, bVarM6976, new l2(qVar2), qVar2, 2058660530 ^ C0296.f443);
                    C0171.m3270(qVar2, false);
                    C0171.m3270(qVar2, true);
                    C0171.m3270(qVar2, false);
                    c2 c2VarM5089 = C0267.m5089(this);
                    o0 o0VarM7252 = C0370.m7252(c2VarM5089);
                    o0 o0VarM113 = C0006.m113();
                    boolean zM5009 = C0263.m5009(this);
                    int i20 = 50813;
                    while (true) {
                        i20 ^= 50830;
                        switch (i20) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                z10 = false;
                                break;
                            case 243:
                                i20 = o0VarM7252 != o0VarM113 ? 51557 : 50875;
                                break;
                            case 4075:
                                r1.s sVarM5296 = C0276.m5296(c2VarM5089);
                                int i21 = 51588;
                                while (true) {
                                    i21 ^= 51605;
                                    switch (i21) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i21 = sVarM5296 != null ? 51681 : 51650;
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            z10 = false;
                                            break;
                                        case 116:
                                            r1.s sVarM5297 = C0276.m5296(c2VarM5089);
                                            C0189.m3608(sVarM5297);
                                            boolean zM1630 = C0075.m1630(sVarM5297);
                                            int i22 = 51712;
                                            while (true) {
                                                i22 ^= 51729;
                                                switch (i22) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i22 = zM1630 ? 51805 : 51774;
                                                        break;
                                                    case 47:
                                                        z10 = false;
                                                        break;
                                                    case 76:
                                                        int i23 = 51836;
                                                        while (true) {
                                                            i23 ^= 51853;
                                                            switch (i23) {
                                                                case 241:
                                                                    i23 = zM5009 ? 52580 : 52549;
                                                                    break;
                                                                case 1963:
                                                                    break;
                                                                case 1992:
                                                                    z10 = false;
                                                                    break;
                                                                case 2025:
                                                                    z10 = true;
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
                    h0.v0 v0VarM4892 = C0257.m4892(this);
                    int i24 = C0107.f133 ^ (-736);
                    C0244.m4666(v0VarM4892, z10, qVar2, i24);
                    o0 o0VarM7253 = C0370.m7252(c2VarM5089);
                    o0 o0VarM3162 = C0165.m3162();
                    int i25 = 52611;
                    while (true) {
                        i25 ^= 52628;
                        switch (i25) {
                            case 23:
                                if (o0VarM7253 == o0VarM3162) {
                                    i25 = 52704;
                                }
                                break;
                            case 54:
                                break;
                            case 85:
                                break;
                            case 116:
                                boolean zM3484 = C0182.m3484(this);
                                int i26 = 52735;
                                while (true) {
                                    i26 ^= 52752;
                                    switch (i26) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            break;
                                        case 1007:
                                            if (!zM3484) {
                                                i26 = 53479;
                                            }
                                            break;
                                        case 7927:
                                            int i27 = 53510;
                                            while (true) {
                                                i27 ^= 53527;
                                                switch (i27) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (zM5009) {
                                                            i27 = 53603;
                                                        }
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 83:
                                                        break;
                                                    case 116:
                                                        C0284.m5472(v0VarM4892, qVar2, i24);
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i27 = 53572;
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i26 = 52797;
                                }
                                break;
                            default:
                                continue;
                        }
                        i25 = 52673;
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
