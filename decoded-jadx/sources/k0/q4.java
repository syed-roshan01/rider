package k0;

import aa.C0012;
import android.support.v4.app.C0014;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import c0.C0057;
import c3.C0063;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.annotations.C0128;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.gson.internal.bind.C0207;
import d1.C0213;
import d9.C0226;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.lifecycle.C0236;
import dagger.hilt.components.C0243;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import e2.C0261;
import f1.C0273;
import g3.C0288;
import g4.C0289;
import g8.C0293;
import m5.C0355;
import p8.C0379;
import q0.C0382;
import s2.C0411;
import u4.C0435;
import v5.C0445;
import w2.C0456;
import w4.C0459;
import w6.C0464;
import x5.C0470;
import z3.C0487;
import z7.C0488;

/* JADX INFO: loaded from: classes.dex */
public final class q4 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2.c0 f9413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.e f9414e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4(float f10, long j10, a2.c0 c0Var, c9.e eVar, int i10) {
        super(C0273.f389 ^ 422);
        this.f9410a = i10;
        this.f9411b = f10;
        this.f9412c = j10;
        this.f9413d = c0Var;
        this.f9414e = eVar;
        int iM5547 = C0288.m5547();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5547 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0207.m3964("hGb")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public final void a(m0.m mVar, int i10) {
        Integer numM1083 = C0057.m1083(0);
        y0.g gVarM8889 = C0456.m8889();
        y0.l lVarM4370 = C0226.m4370();
        int iM4079 = C0213.m4079(this);
        float fM9521 = C0488.m9521(this);
        switch (iM4079) {
            case 0:
                int i11 = C0459.f730;
                int i12 = 50813;
                while (true) {
                    i12 ^= 50830;
                    switch (i12) {
                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case 53:
                            break;
                        case 243:
                            i12 = ((i11 ^ 763) & i10) == 2 ? 51557 : 50875;
                            break;
                        case 4075:
                            m0.q qVar = (m0.q) mVar;
                            boolean zM1625 = C0074.m1625(qVar);
                            int i13 = 51588;
                            while (true) {
                                i13 ^= 51605;
                                switch (i13) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i13 = !zM1625 ? 51681 : 51650;
                                        break;
                                    case 54:
                                        break;
                                    case 87:
                                        C0470.m9156(qVar);
                                        int i14 = 51836;
                                        while (true) {
                                            i14 ^= 51853;
                                            switch (i14) {
                                                case 241:
                                                    i14 = 52518;
                                                    break;
                                                case 1963:
                                                    return;
                                            }
                                        }
                                        break;
                                    case 116:
                                        int i15 = 51712;
                                        while (true) {
                                            i15 ^= 51729;
                                            switch (i15) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 15:
                                                case Code.UNAUTHENTICATED /* 16 */:
                                                default:
                                                    continue;
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i15 = 51743;
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
                y0.o oVarM1725 = C0080.m1725(lVarM4370, fM9521);
                long jM5654 = C0293.m5654(this);
                a2.c0 c0VarM9491 = C0487.m9491(this);
                c9.e eVarM4700 = C0245.m4700(this);
                m0.q qVar2 = (m0.q) mVar;
                C0261.m4990(qVar2, 733328855);
                r1.j0 j0VarM2476 = C0128.m2476(gVarM8889, false, qVar2);
                C0261.m4990(qVar2, -1323940314);
                int iM276 = C0014.m276(qVar2);
                m0.r1 r1VarM275 = C0014.m275(qVar2);
                C0014.m280(C0379.m7428());
                t1.j jVarM4451 = C0231.m4451();
                u0.b bVarM6976 = C0355.m6976(oVarM1725);
                boolean z10 = C0196.m3764(qVar2) instanceof m0.d;
                int i16 = 52611;
                while (true) {
                    i16 ^= 52628;
                    switch (i16) {
                        case 23:
                            if (z10) {
                                i16 = 52704;
                            }
                            break;
                        case 54:
                            break;
                        case 85:
                            C0235.m4537();
                            throw null;
                        case 116:
                            C0100.m1961(qVar2);
                            boolean zM7502 = C0382.m7502(qVar2);
                            int i17 = 52735;
                            while (true) {
                                i17 ^= 52752;
                                switch (i17) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        C0445.m8685(qVar2);
                                        break;
                                    case 1007:
                                        i17 = zM7502 ? 53479 : 52797;
                                        break;
                                    case 7927:
                                        C0017.m346(qVar2, jVarM4451);
                                        int i18 = 53510;
                                        while (true) {
                                            i18 ^= 53527;
                                            switch (i18) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i18 = 53541;
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
                            C0089.m1904(qVar2, j0VarM2476, C0063.m1208());
                            C0089.m1904(qVar2, r1VarM275, C0464.m9055());
                            t1.i iVarM5562 = C0289.m5562();
                            boolean zM7503 = C0382.m7502(qVar2);
                            int i19 = 53634;
                            while (true) {
                                i19 ^= 53651;
                                switch (i19) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (!zM7503) {
                                            i19 = 53727;
                                        }
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        boolean zM4399 = C0228.m4399(C0411.m8078(qVar2), C0057.m1083(iM276));
                                        int i20 = 53758;
                                        while (true) {
                                            i20 ^= 53775;
                                            switch (i20) {
                                                case 1009:
                                                    if (!zM4399) {
                                                        i20 = 54502;
                                                    }
                                                    break;
                                                case 1703:
                                                    break;
                                                case 1736:
                                                    C0236.m4560(qVar2, bVarM6976, qVar2, numM1083, 2058660585);
                                                    C0168.m3208(jM5654, c0VarM9491, eVarM4700, qVar2, 0, 0);
                                                    C0016.m325(qVar2, false, true, false, false);
                                                    return;
                                                case 1769:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i20 = 54471;
                                        }
                                        break;
                                    case 83:
                                        break;
                                    default:
                                        continue;
                                }
                                i19 = 53696;
                            }
                            C0133.m2574(iM276, qVar2, iM276, iVarM5562);
                            C0236.m4560(qVar2, bVarM6976, qVar2, numM1083, 2058660585);
                            C0168.m3208(jM5654, c0VarM9491, eVarM4700, qVar2, 0, 0);
                            C0016.m325(qVar2, false, true, false, false);
                            return;
                        default:
                            continue;
                    }
                    i16 = 52673;
                }
                break;
            default:
                int i21 = C0243.f323;
                int i22 = 1616;
                while (true) {
                    i22 ^= 1633;
                    switch (i22) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i22 = ((i21 ^ 115) & i10) == 2 ? 1709 : 1678;
                            break;
                        case 204:
                            m0.q qVar3 = (m0.q) mVar;
                            boolean zM1626 = C0074.m1625(qVar3);
                            int i23 = 1740;
                            while (true) {
                                i23 ^= 1757;
                                switch (i23) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i23 = !zM1626 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        C0470.m9156(qVar3);
                                        int i24 = 48767;
                                        while (true) {
                                            i24 ^= 48784;
                                            switch (i24) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    return;
                                                case 239:
                                                    i24 = 48798;
                                                    break;
                                            }
                                        }
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        int i25 = 1864;
                                        while (true) {
                                            i25 ^= 1881;
                                            switch (i25) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i25 = 48674;
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
                y0.o oVarM1726 = C0080.m1725(lVarM4370, fM9521);
                long jM5655 = C0293.m5654(this);
                a2.c0 c0VarM9492 = C0487.m9491(this);
                c9.e eVarM4701 = C0245.m4700(this);
                m0.q qVar4 = (m0.q) mVar;
                C0261.m4990(qVar4, 733328855);
                r1.j0 j0VarM2477 = C0128.m2476(gVarM8889, false, qVar4);
                C0261.m4990(qVar4, -1323940314);
                int iM277 = C0014.m276(qVar4);
                m0.r1 r1VarM276 = C0014.m275(qVar4);
                C0014.m280(C0379.m7428());
                t1.j jVarM4452 = C0231.m4451();
                u0.b bVarM6977 = C0355.m6976(oVarM1726);
                boolean z11 = C0196.m3764(qVar4) instanceof m0.d;
                int i26 = 48891;
                while (true) {
                    i26 ^= 48908;
                    switch (i26) {
                        case 22:
                            break;
                        case 53:
                            C0235.m4537();
                            throw null;
                        case 503:
                            if (z11) {
                                i26 = 49635;
                            }
                            break;
                        case 32495:
                            C0100.m1961(qVar4);
                            boolean zM7504 = C0382.m7502(qVar4);
                            int i27 = 49666;
                            while (true) {
                                i27 ^= 49683;
                                switch (i27) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i27 = zM7504 ? 49759 : 49728;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        C0017.m346(qVar4, jVarM4452);
                                        int i28 = 49790;
                                        while (true) {
                                            i28 ^= 49807;
                                            switch (i28) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 241:
                                                    i28 = 49821;
                                                    continue;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 83:
                                        C0445.m8685(qVar4);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            C0089.m1904(qVar4, j0VarM2477, C0063.m1208());
                            C0089.m1904(qVar4, r1VarM276, C0464.m9055());
                            t1.i iVarM5563 = C0289.m5562();
                            boolean zM7505 = C0382.m7502(qVar4);
                            int i29 = 49914;
                            while (true) {
                                i29 ^= 49931;
                                switch (i29) {
                                    case 497:
                                        if (!zM7505) {
                                            i29 = 50658;
                                        }
                                        break;
                                    case 1711:
                                        break;
                                    case 1736:
                                        break;
                                    case 1769:
                                        boolean zM43910 = C0228.m4399(C0411.m8078(qVar4), C0057.m1083(iM277));
                                        int i30 = 50689;
                                        while (true) {
                                            i30 ^= 50706;
                                            switch (i30) {
                                                case 19:
                                                    if (!zM43910) {
                                                        i30 = 50782;
                                                    }
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    C0236.m4560(qVar4, bVarM6977, qVar4, numM1083, 2058660585);
                                                    C0168.m3208(jM5655, c0VarM9492, eVarM4701, qVar4, 0, 0);
                                                    C0016.m325(qVar4, false, true, false, false);
                                                    return;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 76:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i30 = 50751;
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i29 = 50627;
                            }
                            C0133.m2574(iM277, qVar4, iM277, iVarM5563);
                            C0236.m4560(qVar4, bVarM6977, qVar4, numM1083, 2058660585);
                            C0168.m3208(jM5655, c0VarM9492, eVarM4701, qVar4, 0, 0);
                            C0016.m325(qVar4, false, true, false, false);
                            return;
                        default:
                            continue;
                    }
                    i26 = 48953;
                }
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0213.m4079(this)) {
            case 0:
                C0100.m1958(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
            default:
                C0100.m1958(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
