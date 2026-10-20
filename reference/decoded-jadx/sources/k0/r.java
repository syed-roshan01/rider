package k0;

import a7.C0008;
import aa.C0012;
import android.support.v4.app.C0014;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import androidx.core.app.C0040;
import c0.C0057;
import c3.C0063;
import c7.C0069;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.tracing.C0204;
import d5.C0218;
import d9.C0222;
import d9.C0226;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.lifecycle.C0236;
import dagger.hilt.codegen.C0241;
import dagger.hilt.internal.definecomponent.C0249;
import e2.C0261;
import g4.C0289;
import h.C0297;
import m0.C0349;
import m5.C0355;
import m7.C0358;
import p5.C0377;
import p8.C0379;
import q0.C0382;
import r4.C0398;
import s2.C0411;
import u4.C0435;
import u4.C0436;
import v5.C0445;
import v8.C0450;
import v9.C0452;
import w6.C0464;
import x5.C0470;
import z0.C0482;
import z7.C0489;

/* JADX INFO: loaded from: classes.dex */
public final class r extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.f f9416b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(c9.f fVar, int i10) {
        super(C0482.f756 ^ 941);
        this.f9415a = i10;
        this.f9416b = fVar;
        int iM792 = C0040.m792();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM792 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0069.m1347("uyxosG9McMQ97")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x006a A[SYNTHETIC] */
    public final void a(m0.m mVar, int i10) {
        int iM7389;
        int i11;
        m0.q qVar;
        r1.j0 j0VarM4231;
        int iM276;
        m0.r1 r1VarM275;
        t1.j jVarM4451;
        u0.b bVarM6976;
        boolean z10;
        int i12;
        boolean zM7502;
        int i13;
        t1.i iVarM5562;
        boolean zM7503;
        int i14;
        boolean zM4399;
        int i15;
        int i16;
        Integer numM1083 = C0057.m1083(C0358.f629 ^ 532);
        Integer numM1084 = C0057.m1083(0);
        y0.l lVarM4370 = C0226.m4370();
        int iM9536 = C0489.m9536(this);
        c9.f fVarM228 = C0012.m228(this);
        switch (iM9536) {
            case 0:
                int i17 = C0249.f329;
                int i18 = 51588;
                while (true) {
                    i18 ^= 51605;
                    switch (i18) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i18 = ((i17 ^ (-825)) & i10) == 2 ? 51681 : 51650;
                            break;
                        case 54:
                            break;
                        case 87:
                            break;
                        case 116:
                            m0.q qVar2 = (m0.q) mVar;
                            boolean zM1625 = C0074.m1625(qVar2);
                            int i19 = 51712;
                            while (true) {
                                i19 ^= 51729;
                                switch (i19) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i19 = !zM1625 ? 51805 : 51774;
                                        break;
                                    case 47:
                                        C0470.m9156(qVar2);
                                        int i20 = 52611;
                                        while (true) {
                                            i20 ^= 52628;
                                            switch (i20) {
                                                case 23:
                                                    i20 = 52642;
                                                    break;
                                                case 54:
                                                    return;
                                            }
                                        }
                                        break;
                                    case 76:
                                        int i21 = 51836;
                                        while (true) {
                                            i21 ^= 51853;
                                            switch (i21) {
                                                case 241:
                                                    i21 = 52518;
                                                    continue;
                                                case 1963:
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
                y.d dVarM5714 = C0297.m5714();
                y0.f fVarM6849 = C0349.m6849();
                m0.q qVar3 = (m0.q) mVar;
                C0261.m4990(qVar3, (-693286688) ^ C0008.f28);
                r1.j0 j0VarM4288 = C0222.m4288(dVarM5714, fVarM6849, qVar3);
                C0261.m4990(qVar3, -1323940314);
                int iM277 = C0014.m276(qVar3);
                m0.r1 r1VarM276 = C0014.m275(qVar3);
                C0014.m280(C0379.m7428());
                t1.j jVarM4452 = C0231.m4451();
                u0.b bVarM6977 = C0355.m6976(lVarM4370);
                boolean z11 = C0196.m3764(qVar3) instanceof m0.d;
                int i22 = 52735;
                while (true) {
                    i22 ^= 52752;
                    switch (i22) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            C0235.m4537();
                            throw null;
                        case 1007:
                            if (z11) {
                                i22 = 53479;
                            }
                            break;
                        case 7927:
                            C0100.m1961(qVar3);
                            boolean zM7504 = C0382.m7502(qVar3);
                            int i23 = 53510;
                            while (true) {
                                i23 ^= 53527;
                                switch (i23) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i23 = zM7504 ? 53603 : 53572;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 83:
                                        C0445.m8685(qVar3);
                                        break;
                                    case 116:
                                        C0017.m346(qVar3, jVarM4452);
                                        int i24 = 53634;
                                        while (true) {
                                            i24 ^= 53651;
                                            switch (i24) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i24 = 53665;
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
                            C0089.m1904(qVar3, j0VarM4288, C0063.m1208());
                            C0089.m1904(qVar3, r1VarM276, C0464.m9055());
                            t1.i iVarM5563 = C0289.m5562();
                            boolean zM7505 = C0382.m7502(qVar3);
                            int i25 = 53758;
                            while (true) {
                                i25 ^= 53775;
                                switch (i25) {
                                    case 1009:
                                        i25 = !zM7505 ? 54502 : 54471;
                                        break;
                                    case 1703:
                                        break;
                                    case 1736:
                                        break;
                                    case 1769:
                                        boolean zM43910 = C0228.m4399(C0411.m8078(qVar3), C0057.m1083(iM277));
                                        int i26 = 54533;
                                        while (true) {
                                            i26 ^= 54550;
                                            switch (i26) {
                                                case 19:
                                                    i26 = !zM43910 ? 54626 : 54595;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 85:
                                                    break;
                                                case 116:
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                                C0236.m4560(qVar3, bVarM6977, qVar3, numM1084, 2058660585);
                                C0072.m1563(fVarM228, C0450.m8783(), qVar3, numM1083);
                                C0016.m325(qVar3, false, true, false, false);
                                return;
                            }
                            C0133.m2574(iM277, qVar3, iM277, iVarM5563);
                            C0236.m4560(qVar3, bVarM6977, qVar3, numM1084, 2058660585);
                            C0072.m1563(fVarM228, C0450.m8783(), qVar3, numM1083);
                            C0016.m325(qVar3, false, true, false, false);
                            return;
                        default:
                            continue;
                    }
                    i22 = 52797;
                }
                break;
            default:
                int i27 = C0241.f321;
                int i28 = 1616;
                while (true) {
                    i28 ^= 1633;
                    switch (i28) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i28 = ((i27 ^ (-807)) & i10) == 2 ? 1709 : 1678;
                            break;
                        case 204:
                            m0.q qVar4 = (m0.q) mVar;
                            boolean zM1626 = C0074.m1625(qVar4);
                            int i29 = 1740;
                            while (true) {
                                i29 ^= 1757;
                                switch (i29) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i29 = !zM1626 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        C0470.m9156(qVar4);
                                        int i30 = 48767;
                                        while (true) {
                                            i30 ^= 48784;
                                            switch (i30) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 239:
                                                    i30 = 48798;
                                                    continue;
                                                default:
                                                    continue;
                                            }
                                            iM7389 = C0377.m7389();
                                            i11 = 50813;
                                            while (true) {
                                                i11 ^= 50830;
                                                switch (i11) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 53:
                                                        return;
                                                    case 243:
                                                        if (iM7389 <= 0) {
                                                            i11 = 51557;
                                                        }
                                                        break;
                                                    case 4075:
                                                        System.out.println(C0452.m8808("YYCvisafZjhHX1fxdiGyyki"));
                                                        return;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                                i11 = 50875;
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
                                                    continue;
                                                case 47483:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            qVar = (m0.q) mVar;
                                            C0261.m4990(qVar, 483455077 ^ C0436.f707);
                                            j0VarM4231 = C0218.m4231(C0204.m3900(), C0173.m3300(), qVar);
                                            C0261.m4990(qVar, -1323940314);
                                            iM276 = C0014.m276(qVar);
                                            r1VarM275 = C0014.m275(qVar);
                                            C0014.m280(C0379.m7428());
                                            jVarM4451 = C0231.m4451();
                                            bVarM6976 = C0355.m6976(lVarM4370);
                                            z10 = C0196.m3764(qVar) instanceof m0.d;
                                            i12 = 48891;
                                            while (true) {
                                                i12 ^= 48908;
                                                switch (i12) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        C0235.m4537();
                                                        throw null;
                                                    case 503:
                                                        i12 = z10 ? 49635 : 48953;
                                                        break;
                                                    case 32495:
                                                        C0100.m1961(qVar);
                                                        zM7502 = C0382.m7502(qVar);
                                                        i13 = 49666;
                                                        while (true) {
                                                            i13 ^= 49683;
                                                            switch (i13) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i13 = zM7502 ? 49759 : 49728;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    C0017.m346(qVar, jVarM4451);
                                                                    i16 = 49790;
                                                                    while (true) {
                                                                        i16 ^= 49807;
                                                                        switch (i16) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 241:
                                                                                i16 = 49821;
                                                                                continue;
                                                                                continue;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 83:
                                                                    C0445.m8685(qVar);
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        C0089.m1904(qVar, j0VarM4231, C0063.m1208());
                                                        C0089.m1904(qVar, r1VarM275, C0464.m9055());
                                                        iVarM5562 = C0289.m5562();
                                                        zM7503 = C0382.m7502(qVar);
                                                        i14 = 49914;
                                                        while (true) {
                                                            i14 ^= 49931;
                                                            switch (i14) {
                                                                case 497:
                                                                    i14 = !zM7503 ? 50658 : 50627;
                                                                    break;
                                                                case 1711:
                                                                    break;
                                                                case 1736:
                                                                    C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                                    break;
                                                                case 1769:
                                                                    zM4399 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM276));
                                                                    i15 = 50689;
                                                                    while (true) {
                                                                        i15 ^= 50706;
                                                                        switch (i15) {
                                                                            case 19:
                                                                                i15 = !zM4399 ? 50782 : 50751;
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 76:
                                                                                C0133.m2574(iM276, qVar, iM276, iVarM5562);
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
                                                        C0236.m4560(qVar, bVarM6976, qVar, numM1084, 2058660585);
                                                        C0072.m1563(fVarM228, C0141.m2721(), qVar, numM1083);
                                                        C0016.m325(qVar, false, true, false, false);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            iM7389 = C0377.m7389();
                                            i11 = 50813;
                                            while (true) {
                                                i11 ^= 50830;
                                                switch (i11) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 53:
                                                        return;
                                                    case 243:
                                                        if (iM7389 <= 0) {
                                                            i11 = 51557;
                                                        }
                                                        break;
                                                    case 4075:
                                                        System.out.println(C0452.m8808("YYCvisafZjhHX1fxdiGyyki"));
                                                        return;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                                i11 = 50875;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            qVar = (m0.q) mVar;
                            C0261.m4990(qVar, 483455077 ^ C0436.f707);
                            j0VarM4231 = C0218.m4231(C0204.m3900(), C0173.m3300(), qVar);
                            C0261.m4990(qVar, -1323940314);
                            iM276 = C0014.m276(qVar);
                            r1VarM275 = C0014.m275(qVar);
                            C0014.m280(C0379.m7428());
                            jVarM4451 = C0231.m4451();
                            bVarM6976 = C0355.m6976(lVarM4370);
                            z10 = C0196.m3764(qVar) instanceof m0.d;
                            i12 = 48891;
                            while (true) {
                                i12 ^= 48908;
                                switch (i12) {
                                    case 22:
                                        break;
                                    case 53:
                                        C0235.m4537();
                                        throw null;
                                    case 503:
                                        if (z10) {
                                        }
                                        break;
                                    case 32495:
                                        C0100.m1961(qVar);
                                        zM7502 = C0382.m7502(qVar);
                                        i13 = 49666;
                                        while (true) {
                                            i13 ^= 49683;
                                            switch (i13) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (zM7502) {
                                                    }
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 76:
                                                    C0017.m346(qVar, jVarM4451);
                                                    i16 = 49790;
                                                    while (true) {
                                                        i16 ^= 49807;
                                                        switch (i16) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 241:
                                                                i16 = 49821;
                                                                continue;
                                                                continue;
                                                            default:
                                                                continue;
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                                case 83:
                                                    C0445.m8685(qVar);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        C0089.m1904(qVar, j0VarM4231, C0063.m1208());
                                        C0089.m1904(qVar, r1VarM275, C0464.m9055());
                                        iVarM5562 = C0289.m5562();
                                        zM7503 = C0382.m7502(qVar);
                                        i14 = 49914;
                                        while (true) {
                                            i14 ^= 49931;
                                            switch (i14) {
                                                case 497:
                                                    if (!zM7503) {
                                                    }
                                                    break;
                                                case 1711:
                                                    break;
                                                case 1736:
                                                    C0133.m2574(iM276, qVar, iM276, iVarM5562);
                                                    break;
                                                case 1769:
                                                    zM4399 = C0228.m4399(C0411.m8078(qVar), C0057.m1083(iM276));
                                                    i15 = 50689;
                                                    while (true) {
                                                        i15 ^= 50706;
                                                        switch (i15) {
                                                            case 19:
                                                                if (!zM4399) {
                                                                }
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 76:
                                                                C0133.m2574(iM276, qVar, iM276, iVarM5562);
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
                                        C0236.m4560(qVar, bVarM6976, qVar, numM1084, 2058660585);
                                        C0072.m1563(fVarM228, C0141.m2721(), qVar, numM1083);
                                        C0016.m325(qVar, false, true, false, false);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            iM7389 = C0377.m7389();
                            i11 = 50813;
                            while (true) {
                                i11 ^= 50830;
                                switch (i11) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 53:
                                        return;
                                    case 243:
                                        if (iM7389 <= 0) {
                                            i11 = 51557;
                                        }
                                        break;
                                    case 4075:
                                        System.out.println(C0452.m8808("YYCvisafZjhHX1fxdiGyyki"));
                                        return;
                                    default:
                                        continue;
                                        continue;
                                        continue;
                                }
                                i11 = 50875;
                            }
                            break;
                        default:
                            break;
                    }
                }
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0489.m9536(this)) {
            case 0:
                C0398.m7789(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
            default:
                C0398.m7789(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
