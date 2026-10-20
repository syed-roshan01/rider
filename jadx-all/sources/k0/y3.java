package k0;

import a.C0002;
import aa.C0012;
import android.support.v4.app.C0014;
import androidx.activity.C0017;
import c0.C0057;
import c3.C0063;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.stats.C0100;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.abt.C0112;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.C0128;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0171;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import d7.C0220;
import d9.C0227;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.android.lifecycle.C0237;
import e2.C0261;
import e2.C0262;
import e7.C0265;
import g.C0285;
import g0.C0286;
import g4.C0290;
import g5.C0291;
import g5.C0292;
import h4.C0305;
import h8.C0315;
import m5.C0356;
import p8.C0380;
import q0.C0383;
import s2.C0412;
import t2.C0422;
import t8.C0427;
import u3.C0435;
import u4.C0436;
import v0.C0443;
import v5.C0446;
import w1.C0456;
import w2.C0457;
import w6.C0465;
import x5.C0471;
import y.C0476;

/* JADX INFO: loaded from: classes.dex */
public final class y3 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f514short = {3079, 3115, 3114, 3120, 3109, 3117, 3114, 3105, 3126};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.e f9674b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3(c9.e eVar, int i10) {
        super(C0285.f429 ^ 986);
        this.f9673a = i10;
        this.f9674b = eVar;
        int iM2714 = C0141.m2714();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2714 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0427.m8366("ilRIf0WlCJKTgDfnQZTSmb4xOF")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static short[] m6444() {
        int iM2182 = C0113.m2182();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2182 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f514short;
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

    public final void a(m0.m mVar, int i10) {
        Integer numM1083 = C0057.m1083(0);
        int iM8499 = C0435.m8499(this);
        c9.e eVarM2198 = C0114.m2198(this);
        switch (iM8499) {
            case 0:
                int i11 = C0188.f212;
                int i12 = 50813;
                while (true) {
                    i12 ^= 50830;
                    switch (i12) {
                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case 53:
                            break;
                        case 243:
                            i12 = ((i11 ^ 106) & i10) == 2 ? 51557 : 50875;
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
                                        C0471.m9156(qVar);
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
                C0261.m4974(C0220.m4236(3, (-16744346) ^ C0443.f713, 0L, 0L, 0L, 0L, null, C0112.m2156((e5) C0476.m9256((m0.q) mVar, C0456.m8878()), C0265.m5058()), null, null, null), eVarM2198, mVar, 0);
                return;
            default:
                int i16 = C0305.f452;
                int i17 = 1616;
                while (true) {
                    i17 ^= 1633;
                    switch (i17) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i17 = ((i16 ^ 17) & i10) == 2 ? 1709 : 1678;
                            break;
                        case 204:
                            m0.q qVar2 = (m0.q) mVar;
                            boolean zM1626 = C0074.m1625(qVar2);
                            int i18 = 1740;
                            while (true) {
                                i18 ^= 1757;
                                switch (i18) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i18 = !zM1626 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        C0471.m9156(qVar2);
                                        int i19 = 48767;
                                        while (true) {
                                            i19 ^= 48784;
                                            switch (i19) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    return;
                                                case 239:
                                                    i19 = 48798;
                                                    break;
                                            }
                                        }
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        int i20 = 1864;
                                        while (true) {
                                            i20 ^= 1881;
                                            switch (i20) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i20 = 48674;
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
                y0.o oVarM5498 = C0286.m5498(C0227.m4370(), C0291.m5593(m6444(), 0, C0111.f137 ^ (-778), 3140));
                m0.q qVar3 = (m0.q) mVar;
                C0262.m4990(qVar3, (-733328586) ^ C0422.f692);
                r1.j0 j0VarM2476 = C0128.m2476(C0457.m8889(), true, qVar3);
                C0262.m4990(qVar3, 1323940522 ^ C0292.f439);
                int iM276 = C0014.m276(qVar3);
                m0.r1 r1VarM275 = C0014.m275(qVar3);
                C0014.m280(C0380.m7428());
                t1.j jVarM4451 = C0232.m4451();
                u0.b bVarM6976 = C0356.m6976(oVarM5498);
                boolean z10 = C0196.m3764(qVar3) instanceof m0.d;
                int i21 = 48891;
                while (true) {
                    i21 ^= 48908;
                    switch (i21) {
                        case 22:
                            break;
                        case 53:
                            C0236.m4537();
                            throw null;
                        case 503:
                            if (z10) {
                                i21 = 49635;
                            }
                            break;
                        case 32495:
                            C0100.m1961(qVar3);
                            boolean zM7502 = C0383.m7502(qVar3);
                            int i22 = 49666;
                            while (true) {
                                i22 ^= 49683;
                                switch (i22) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i22 = zM7502 ? 49759 : 49728;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        C0017.m346(qVar3, jVarM4451);
                                        int i23 = 49790;
                                        while (true) {
                                            i23 ^= 49807;
                                            switch (i23) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 241:
                                                    i23 = 49821;
                                                    continue;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 83:
                                        C0446.m8685(qVar3);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            C0089.m1904(qVar3, j0VarM2476, C0063.m1208());
                            C0089.m1904(qVar3, r1VarM275, C0465.m9055());
                            t1.i iVarM5562 = C0290.m5562();
                            boolean zM7503 = C0383.m7502(qVar3);
                            int i24 = 49914;
                            while (true) {
                                i24 ^= 49931;
                                switch (i24) {
                                    case 497:
                                        if (!zM7503) {
                                            i24 = 50658;
                                        }
                                        break;
                                    case 1711:
                                        break;
                                    case 1736:
                                        break;
                                    case 1769:
                                        boolean zM4399 = C0229.m4399(C0412.m8078(qVar3), C0057.m1083(iM276));
                                        int i25 = 50689;
                                        while (true) {
                                            i25 ^= 50706;
                                            switch (i25) {
                                                case 19:
                                                    if (!zM4399) {
                                                        i25 = 50782;
                                                    }
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    C0237.m4560(qVar3, bVarM6976, qVar3, numM1083, (-2058660579) ^ C0002.f770);
                                                    C0465.m9049(eVarM2198, qVar3, numM1083);
                                                    C0171.m3270(qVar3, false);
                                                    C0171.m3270(qVar3, true);
                                                    C0171.m3270(qVar3, false);
                                                    C0171.m3270(qVar3, false);
                                                    return;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 76:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i25 = 50751;
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i24 = 50627;
                            }
                            C0133.m2574(iM276, qVar3, iM276, iVarM5562);
                            C0237.m4560(qVar3, bVarM6976, qVar3, numM1083, (-2058660579) ^ C0002.f770);
                            C0465.m9049(eVarM2198, qVar3, numM1083);
                            C0171.m3270(qVar3, false);
                            C0171.m3270(qVar3, true);
                            C0171.m3270(qVar3, false);
                            C0171.m3270(qVar3, false);
                            return;
                        default:
                            continue;
                    }
                    i21 = 48953;
                }
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0435.m8499(this)) {
            case 0:
                C0315.m6090(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            default:
                C0315.m6090(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
