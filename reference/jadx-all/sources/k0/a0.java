package k0;

import a2.C0004;
import aa.C0012;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.inject.C0172;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.internal.aggregatedroot.C0247;
import e1.C0259;
import g9.C0295;
import ja.C0331;
import okhttp3.internal.publicsuffix.C0373;
import q0.C0383;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements p9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0.u f8710b;

    public /* synthetic */ a0(w0.u uVar, int i10) {
        this.f8709a = i10;
        this.f8710b = uVar;
        int iM4939 = C0259.m4939();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4939 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0115.m2222("yDEmUXnm")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public final Object b(x.k kVar) {
        q8.l lVarM238 = C0012.m238();
        int iM7304 = C0373.m7304(this);
        w0.u uVarM3588 = C0188.m3588(this);
        switch (iM7304) {
            case 0:
                boolean z10 = kVar instanceof x.h;
                int i10 = 54657;
                while (true) {
                    i10 ^= 54674;
                    switch (i10) {
                        case 19:
                            if (z10) {
                                i10 = 55401;
                            }
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            boolean z11 = kVar instanceof x.i;
                            int i11 = 55556;
                            while (true) {
                                i11 ^= 55573;
                                switch (i11) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (z11) {
                                            i11 = 55649;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 87:
                                        boolean z12 = kVar instanceof x.d;
                                        int i12 = 56455;
                                        while (true) {
                                            i12 ^= 56472;
                                            switch (i12) {
                                                case 31:
                                                    if (z12) {
                                                        i12 = 56548;
                                                    }
                                                    break;
                                                case 62:
                                                    break;
                                                case 93:
                                                    boolean z13 = kVar instanceof x.e;
                                                    int i13 = 1507503;
                                                    while (true) {
                                                        i13 ^= 1507520;
                                                        switch (i13) {
                                                            case Code.UNAVAILABLE /* 14 */:
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                boolean z14 = kVar instanceof x.o;
                                                                int i14 = 1507751;
                                                                while (true) {
                                                                    i14 ^= 1507768;
                                                                    switch (i14) {
                                                                        case 31:
                                                                            if (z14) {
                                                                                i14 = 1508495;
                                                                            }
                                                                            break;
                                                                        case 1335:
                                                                            C0146.m2793(uVarM3588, kVar);
                                                                            int i15 = 1508526;
                                                                            while (true) {
                                                                                i15 ^= 1508543;
                                                                                switch (i15) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i15 = 1508557;
                                                                                        break;
                                                                                    case 114:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 1480:
                                                                            boolean z15 = kVar instanceof x.p;
                                                                            int i16 = 1508650;
                                                                            while (true) {
                                                                                i16 ^= 1508667;
                                                                                switch (i16) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        if (z15) {
                                                                                            i16 = 1509394;
                                                                                        }
                                                                                        break;
                                                                                    case 83:
                                                                                        boolean z16 = kVar instanceof x.n;
                                                                                        int i17 = 1509549;
                                                                                        while (true) {
                                                                                            i17 ^= 1509566;
                                                                                            switch (i17) {
                                                                                                case 19:
                                                                                                    if (z16) {
                                                                                                        i17 = 1509642;
                                                                                                    }
                                                                                                    break;
                                                                                                case 85:
                                                                                                    break;
                                                                                                case 114:
                                                                                                    break;
                                                                                                case 436:
                                                                                                    C0247.m4715(uVarM3588, C0004.m91((x.n) kVar));
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                            }
                                                                                            i17 = 1509611;
                                                                                        }
                                                                                        break;
                                                                                    case 114:
                                                                                        break;
                                                                                    case 3369:
                                                                                        C0247.m4715(uVarM3588, C0331.m6373((x.p) kVar));
                                                                                        int i18 = 1509425;
                                                                                        while (true) {
                                                                                            i18 ^= 1509442;
                                                                                            switch (i18) {
                                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                    break;
                                                                                                case 115:
                                                                                                    i18 = 1509456;
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                                i16 = 1508712;
                                                                            }
                                                                            break;
                                                                        case 1513:
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                    i14 = 1508464;
                                                                }
                                                                break;
                                                            case 111:
                                                                if (z13) {
                                                                    i13 = 1507596;
                                                                }
                                                                break;
                                                            case 460:
                                                                C0247.m4715(uVarM3588, C0138.m2674((x.e) kVar));
                                                                int i19 = 1507627;
                                                                while (true) {
                                                                    i19 ^= 1507644;
                                                                    switch (i19) {
                                                                        case 23:
                                                                            i19 = 1507658;
                                                                            break;
                                                                        case 118:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                        i13 = 1507565;
                                                    }
                                                    break;
                                                case 124:
                                                    C0146.m2793(uVarM3588, kVar);
                                                    int i20 = 56579;
                                                    while (true) {
                                                        i20 ^= 56596;
                                                        switch (i20) {
                                                            case 23:
                                                                i20 = 56610;
                                                                break;
                                                            case 54:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i12 = 56517;
                                        }
                                        break;
                                    case 116:
                                        C0247.m4715(uVarM3588, C0383.m7495((x.i) kVar));
                                        int i21 = 55680;
                                        while (true) {
                                            i21 ^= 55697;
                                            switch (i21) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i21 = 56362;
                                                    break;
                                                case 1467:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i11 = 55618;
                            }
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 3579:
                            C0146.m2793(uVarM3588, kVar);
                            int i22 = 55432;
                            while (true) {
                                i22 ^= 55449;
                                switch (i22) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i22 = 55463;
                                        break;
                                    case 62:
                                        break;
                                }
                            }
                            break;
                        default:
                            continue;
                    }
                    i10 = 54719;
                }
                return lVarM238;
            default:
                boolean z17 = kVar instanceof x.h;
                int i23 = 1616;
                while (true) {
                    i23 ^= 1633;
                    switch (i23) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (z17) {
                                i23 = 1709;
                            }
                            break;
                        case 204:
                            C0146.m2793(uVarM3588, kVar);
                            int i24 = 1740;
                            while (true) {
                                i24 ^= 1757;
                                switch (i24) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i24 = 1771;
                                        break;
                                    case 54:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            boolean z18 = kVar instanceof x.i;
                            int i25 = 1864;
                            while (true) {
                                i25 ^= 1881;
                                switch (i25) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (z18) {
                                            i25 = 48736;
                                        }
                                        break;
                                    case 47384:
                                        boolean z19 = kVar instanceof x.d;
                                        int i26 = 48891;
                                        while (true) {
                                            i26 ^= 48908;
                                            switch (i26) {
                                                case 22:
                                                    break;
                                                case 53:
                                                    boolean z20 = kVar instanceof x.e;
                                                    int i27 = 49790;
                                                    while (true) {
                                                        i27 ^= 49807;
                                                        switch (i27) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 51:
                                                                boolean z21 = kVar instanceof x.o;
                                                                int i28 = 50689;
                                                                while (true) {
                                                                    i28 ^= 50706;
                                                                    switch (i28) {
                                                                        case 19:
                                                                            if (z21) {
                                                                                i28 = 50782;
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            boolean z22 = kVar instanceof x.p;
                                                                            int i29 = 51588;
                                                                            while (true) {
                                                                                i29 ^= 51605;
                                                                                switch (i29) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        if (z22) {
                                                                                            i29 = 51681;
                                                                                        }
                                                                                        break;
                                                                                    case 54:
                                                                                        break;
                                                                                    case 87:
                                                                                        boolean z23 = kVar instanceof x.n;
                                                                                        int i30 = 51836;
                                                                                        while (true) {
                                                                                            i30 ^= 51853;
                                                                                            switch (i30) {
                                                                                                case 241:
                                                                                                    if (z23) {
                                                                                                        i30 = 52580;
                                                                                                    }
                                                                                                    break;
                                                                                                case 1963:
                                                                                                    break;
                                                                                                case 1992:
                                                                                                    boolean z24 = kVar instanceof x.b;
                                                                                                    int i31 = 52735;
                                                                                                    while (true) {
                                                                                                        i31 ^= 52752;
                                                                                                        switch (i31) {
                                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                                break;
                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                                boolean z25 = kVar instanceof x.c;
                                                                                                                int i32 = 53634;
                                                                                                                while (true) {
                                                                                                                    i32 ^= 53651;
                                                                                                                    switch (i32) {
                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                            if (z25) {
                                                                                                                                i32 = 53727;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                            break;
                                                                                                                        case 76:
                                                                                                                            C0247.m4715(uVarM3588, C0295.m5658((x.c) kVar));
                                                                                                                            int i33 = 53758;
                                                                                                                            while (true) {
                                                                                                                                i33 ^= 53775;
                                                                                                                                switch (i33) {
                                                                                                                                    case 1009:
                                                                                                                                        i33 = 54440;
                                                                                                                                        break;
                                                                                                                                    case 1703:
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 83:
                                                                                                                            boolean z26 = kVar instanceof x.a;
                                                                                                                            int i34 = 54533;
                                                                                                                            while (true) {
                                                                                                                                i34 ^= 54550;
                                                                                                                                switch (i34) {
                                                                                                                                    case 19:
                                                                                                                                        i34 = !z26 ? 54595 : 54626;
                                                                                                                                        break;
                                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                        break;
                                                                                                                                    case 85:
                                                                                                                                        break;
                                                                                                                                    case 116:
                                                                                                                                        C0247.m4715(uVarM3588, C0172.m3284((x.a) kVar));
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            continue;
                                                                                                                    }
                                                                                                                    i32 = 53696;
                                                                                                                }
                                                                                                                break;
                                                                                                            case 1007:
                                                                                                                i31 = !z24 ? 52797 : 53479;
                                                                                                                break;
                                                                                                            case 7927:
                                                                                                                C0146.m2793(uVarM3588, kVar);
                                                                                                                int i35 = 53510;
                                                                                                                while (true) {
                                                                                                                    i35 ^= 53527;
                                                                                                                    switch (i35) {
                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                            i35 = 53541;
                                                                                                                            break;
                                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 2025:
                                                                                                    C0247.m4715(uVarM3588, C0004.m91((x.n) kVar));
                                                                                                    int i36 = 52611;
                                                                                                    while (true) {
                                                                                                        i36 ^= 52628;
                                                                                                        switch (i36) {
                                                                                                            case 23:
                                                                                                                i36 = 52642;
                                                                                                                break;
                                                                                                            case 54:
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                            }
                                                                                            i30 = 52549;
                                                                                        }
                                                                                        break;
                                                                                    case 116:
                                                                                        C0247.m4715(uVarM3588, C0331.m6373((x.p) kVar));
                                                                                        int i37 = 51712;
                                                                                        while (true) {
                                                                                            i37 ^= 51729;
                                                                                            switch (i37) {
                                                                                                case Code.UNAVAILABLE /* 14 */:
                                                                                                    break;
                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                    i37 = 51743;
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                                i29 = 51650;
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 76:
                                                                            C0146.m2793(uVarM3588, kVar);
                                                                            int i38 = 50813;
                                                                            while (true) {
                                                                                i38 ^= 50830;
                                                                                switch (i38) {
                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case 243:
                                                                                        i38 = 50844;
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                    i28 = 50751;
                                                                }
                                                                break;
                                                            case 84:
                                                                C0247.m4715(uVarM3588, C0138.m2674((x.e) kVar));
                                                                int i39 = 49914;
                                                                while (true) {
                                                                    i39 ^= 49931;
                                                                    switch (i39) {
                                                                        case 497:
                                                                            i39 = 50596;
                                                                            break;
                                                                        case 1711:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 241:
                                                                if (z20) {
                                                                    i27 = 49883;
                                                                }
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                        i27 = 49852;
                                                    }
                                                    break;
                                                case 503:
                                                    if (z19) {
                                                        i26 = 49635;
                                                    }
                                                    break;
                                                case 32495:
                                                    C0146.m2793(uVarM3588, kVar);
                                                    int i40 = 49666;
                                                    while (true) {
                                                        i40 ^= 49683;
                                                        switch (i40) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i40 = 49697;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i26 = 48953;
                                        }
                                        break;
                                    case 47417:
                                        C0247.m4715(uVarM3588, C0383.m7495((x.i) kVar));
                                        int i41 = 48767;
                                        while (true) {
                                            i41 ^= 48784;
                                            switch (i41) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 239:
                                                    i41 = 48798;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 47483:
                                        break;
                                    default:
                                        continue;
                                }
                                i25 = 48705;
                            }
                            break;
                        default:
                            continue;
                    }
                    i23 = 1678;
                }
                return lVarM238;
        }
    }

    @Override // p9.g
    public final /* bridge */ /* synthetic */ Object emit(Object obj, u8.e eVar) {
        int iM7304 = C0373.m7304(this);
        q8.l lVarM238 = C0012.m238();
        switch (iM7304) {
            case 0:
                C0237.m4557(this, (x.k) obj);
                return lVarM238;
            default:
                C0237.m4557(this, (x.k) obj);
                return lVarM238;
        }
    }
}
