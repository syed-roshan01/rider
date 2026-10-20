package k0;

import aa.C0012;
import b4.C0052;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.abt.C0112;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.ktx.C0179;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.tracing.C0204;
import d3.C0217;
import h3.C0302;
import ja.C0331;
import l0.C0341;
import m5.C0355;
import q7.C0390;
import r2.C0396;
import t8.C0427;
import u.C0430;
import u2.C0434;
import u4.C0436;
import x4.C0469;
import x5.C0471;
import x7.C0472;
import z.C0482;

/* JADX INFO: loaded from: classes.dex */
public final class o4 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9325c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(long j10, c9.e eVar, int i10) {
        super(C0430.f700 ^ 330);
        this.f9323a = i10;
        this.f9324b = j10;
        this.f9325c = eVar;
        int iM5797 = C0302.m5797();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5797 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0163.m3120("QzMr")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(String str, long j10) {
        super(C0126.f152 ^ (-206));
        this.f9323a = 3;
        this.f9325c = str;
        this.f9324b = j10;
        int iM1779 = C0083.m1779();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1779 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0469.m9118("rSa949hHIgwMCc4J2rSeQ")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final void a(m0.m mVar, int i10) {
        long jM8365 = C0427.m8365(this);
        int iM6388 = C0331.m6388(this);
        Object objM6672 = C0341.m6672(this);
        switch (iM6388) {
            case 0:
                int i11 = C0109.f135;
                int i12 = 51836;
                while (true) {
                    i12 ^= 51853;
                    switch (i12) {
                        case 241:
                            i12 = ((i11 ^ 64) & i10) == 2 ? 52580 : 52549;
                            break;
                        case 1963:
                            break;
                        case 1992:
                            C0168.m3208(C0427.m8365(this), null, (c9.e) objM6672, mVar, 0, 2);
                            break;
                        case 2025:
                            m0.q qVar = (m0.q) mVar;
                            boolean zM1625 = C0074.m1625(qVar);
                            int i13 = 52611;
                            while (true) {
                                i13 ^= 52628;
                                switch (i13) {
                                    case 23:
                                        i13 = !zM1625 ? 52704 : 52673;
                                        break;
                                    case 54:
                                        break;
                                    case 85:
                                        C0471.m9156(qVar);
                                        int i14 = 53510;
                                        while (true) {
                                            i14 ^= 53527;
                                            switch (i14) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i14 = 53541;
                                                    continue;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 116:
                                        int i15 = 52735;
                                        while (true) {
                                            i15 ^= 52752;
                                            switch (i15) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 1007:
                                                    i15 = 52766;
                                                    continue;
                                                default:
                                                    continue;
                                            }
                                            C0168.m3208(C0427.m8365(this), null, (c9.e) objM6672, mVar, 0, 2);
                                            break;
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
                int iM9373 = C0482.m9373();
                int i16 = 53634;
                while (true) {
                    i16 ^= 53651;
                    switch (i16) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (iM9373 >= 0) {
                                i16 = 53727;
                            }
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 76:
                            System.out.println(Float.valueOf(C0390.m7625("fIbD2rocgalbINDppd9G")));
                            break;
                        case 83:
                            break;
                        default:
                            continue;
                    }
                    i16 = 53696;
                }
                break;
            case 1:
                int i17 = C0302.f449;
                int i18 = 50689;
                while (true) {
                    i18 ^= 50706;
                    switch (i18) {
                        case 19:
                            i18 = ((i17 ^ 957) & i10) == 2 ? 50782 : 50751;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 76:
                            m0.q qVar2 = (m0.q) mVar;
                            boolean zM1626 = C0074.m1625(qVar2);
                            int i19 = 50813;
                            while (true) {
                                i19 ^= 50830;
                                switch (i19) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 53:
                                        C0471.m9156(qVar2);
                                        int i20 = 51712;
                                        while (true) {
                                            i20 ^= 51729;
                                            switch (i20) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i20 = 51743;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 243:
                                        i19 = !zM1626 ? 51557 : 50875;
                                        break;
                                    case 4075:
                                        int i21 = 51588;
                                        while (true) {
                                            i21 ^= 51605;
                                            switch (i21) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i21 = 51619;
                                                    break;
                                                case 54:
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
                C0168.m3208(C0427.m8365(this), null, (c9.e) objM6672, mVar, 0, 2);
                break;
            case 2:
                int i22 = C0052.f72;
                int i23 = 48891;
                while (true) {
                    i23 ^= 48908;
                    switch (i23) {
                        case 22:
                            break;
                        case 53:
                            break;
                        case 503:
                            i23 = ((i22 ^ 930) & i10) == 2 ? 49635 : 48953;
                            break;
                        case 32495:
                            m0.q qVar3 = (m0.q) mVar;
                            boolean zM1627 = C0074.m1625(qVar3);
                            int i24 = 49666;
                            while (true) {
                                i24 ^= 49683;
                                switch (i24) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i24 = !zM1627 ? 49759 : 49728;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        int i25 = 49790;
                                        while (true) {
                                            i25 ^= 49807;
                                            switch (i25) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 241:
                                                    i25 = 49821;
                                                    continue;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 83:
                                        C0471.m9156(qVar3);
                                        int i26 = 49914;
                                        while (true) {
                                            i26 ^= 49931;
                                            switch (i26) {
                                                case 497:
                                                    i26 = 50596;
                                                    break;
                                                case 1711:
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
                C0396.m7736(C0434.m8483(C0112.m2168(), new e1.r(jM8365)), (c9.e) objM6672, mVar, 0);
                break;
            default:
                int i27 = C0355.f625;
                int i28 = 1616;
                while (true) {
                    i28 ^= 1633;
                    switch (i28) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (((i27 ^ 290) & i10) == 2) {
                                i28 = 1709;
                            }
                            break;
                        case 204:
                            m0.q qVar4 = (m0.q) mVar;
                            boolean zM1628 = C0074.m1625(qVar4);
                            int i29 = 1740;
                            while (true) {
                                i29 ^= 1757;
                                switch (i29) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (!zM1628) {
                                            i29 = 1833;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        C0471.m9156(qVar4);
                                        int i30 = 48767;
                                        while (true) {
                                            i30 ^= 48784;
                                            switch (i30) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 239:
                                                    i30 = 48798;
                                                    break;
                                            }
                                        }
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        int i31 = 1864;
                                        while (true) {
                                            i31 ^= 1881;
                                            switch (i31) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i31 = 48674;
                                                    break;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i29 = 1802;
                            }
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i28 = 1678;
                }
                C0185.m3537((String) objM6672, null, C0217.m4129(jM8365, 0.7f), 0L, null, C0204.m3904(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mVar, 196608, 0, C0472.f742 ^ 130982);
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0331.m6388(this)) {
            case 0:
                C0179.m3416(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            case 1:
                C0179.m3416(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            case 2:
                C0179.m3416(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            default:
                C0179.m3416(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
