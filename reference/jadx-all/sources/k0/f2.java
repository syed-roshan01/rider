package k0;

import aa.C0012;
import c0.C0057;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0223;
import dagger.hilt.internal.componenttreedeps.C0249;
import e1.C0259;
import f6.C0279;
import g9.C0295;
import h3.C0302;
import h4.C0306;
import h5.C0307;
import java.util.ArrayList;
import java.util.List;
import m9.C0360;
import n.C0362;
import n7.C0365;
import n8.C0366;
import n9.C0367;
import p4.C0377;
import r7.C0405;
import s0.C0411;
import u4.C0436;
import w0.C0455;
import w5.C0463;
import x5.C0471;

/* JADX INFO: loaded from: classes.dex */
public final class f2 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.i1 f8918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1.i1 f8919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f8920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f8922f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f8923n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c9.f f8924o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(y.i1 i1Var, r1.i1 i1Var2, ArrayList arrayList, int i10, ArrayList arrayList2, Integer num, c9.f fVar, int i11) {
        super(C0366.f636 ^ (-186));
        this.f8917a = i11;
        this.f8918b = i1Var;
        this.f8919c = i1Var2;
        this.f8920d = arrayList;
        this.f8921e = i10;
        this.f8922f = arrayList2;
        this.f8923n = num;
        this.f8924o = fVar;
        int iM5394 = C0279.m5394();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5394 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0139.m2686("173FxYr8F7lZjGOFQlB6j5t"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    public final void a(m0.m mVar, int i10) {
        float fM7374;
        float fM8053;
        float fM7375;
        float fM8054;
        Integer numM1083 = C0057.m1083(0);
        int iM3211 = C0168.m3211(this);
        c9.f fVarM4283 = C0223.m4283(this);
        Integer numM7931 = C0405.m7931(this);
        List listM4756 = C0249.m4756(this);
        int iM7088 = C0362.m7088(this);
        List listM5906 = C0307.m5906(this);
        r1.i1 i1VarM5884 = C0306.m5884(this);
        y.i1 i1VarM3433 = C0180.m3433(this);
        switch (iM3211) {
            case 0:
                int i11 = C0302.f449;
                int i12 = 51588;
                while (true) {
                    i12 ^= 51605;
                    switch (i12) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (((i11 ^ 957) & i10) == 2) {
                                i12 = 51681;
                            }
                            break;
                        case 54:
                            break;
                        case 87:
                            break;
                        case 116:
                            m0.q qVar = (m0.q) mVar;
                            boolean zM1625 = C0074.m1625(qVar);
                            int i13 = 51712;
                            while (true) {
                                i13 ^= 51729;
                                switch (i13) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (!zM1625) {
                                            i13 = 51805;
                                        }
                                        break;
                                    case 47:
                                        C0471.m9156(qVar);
                                        int i14 = 52611;
                                        while (true) {
                                            i14 ^= 52628;
                                            switch (i14) {
                                                case 23:
                                                    i14 = 52642;
                                                    break;
                                                case 54:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 76:
                                        int i15 = 51836;
                                        while (true) {
                                            i15 ^= 51853;
                                            switch (i15) {
                                                case 241:
                                                    i15 = 52518;
                                                    break;
                                                case 1963:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i13 = 51774;
                            }
                            break;
                        default:
                            continue;
                    }
                    i12 = 51650;
                }
                y.j0 j0Var = new y.j0(i1VarM3433, i1VarM5884);
                boolean zM7153 = C0365.m7153(listM5906);
                int i16 = 52735;
                while (true) {
                    i16 ^= 52752;
                    switch (i16) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            fM7374 = C0377.m7374(i1VarM5884, iM7088);
                            break;
                        case 1007:
                            i16 = zM7153 ? 53479 : 52797;
                            break;
                        case 7927:
                            fM7374 = C0463.m9001(j0Var);
                            int i17 = 53510;
                            while (true) {
                                i17 ^= 53527;
                                switch (i17) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i17 = 53541;
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
                boolean zM7154 = C0365.m7153(listM4756);
                int i18 = 53634;
                while (true) {
                    i18 ^= 53651;
                    switch (i18) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i18 = !zM7154 ? 53727 : 53696;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 76:
                            int i19 = 53758;
                            while (true) {
                                i19 ^= 53775;
                                switch (i19) {
                                    case 1009:
                                        i19 = numM7931 == null ? 54502 : 54471;
                                        break;
                                    case 1703:
                                        break;
                                    case 1736:
                                        fM8053 = C0377.m7374(i1VarM5884, C0367.m7190(numM7931));
                                        int i20 = 54657;
                                        while (true) {
                                            i20 ^= 54674;
                                            switch (i20) {
                                                case 19:
                                                    i20 = 54688;
                                                    continue;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 1769:
                                        int i21 = 54533;
                                        while (true) {
                                            i21 ^= 54550;
                                            switch (i21) {
                                                case 19:
                                                    i21 = 54564;
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
                            break;
                        case 83:
                            break;
                        default:
                            break;
                    }
                    C0072.m1563(fVarM4283, new y.u0(C0455.m8875(j0Var, C0360.m7050(i1VarM5884)), fM7374, C0259.m4932(j0Var, C0360.m7050(i1VarM5884)), fM8053), mVar, numM1083);
                    break;
                }
                fM8053 = C0411.m8053(j0Var);
                C0072.m1563(fVarM4283, new y.u0(C0455.m8875(j0Var, C0360.m7050(i1VarM5884)), fM7374, C0259.m4932(j0Var, C0360.m7050(i1VarM5884)), fM8053), mVar, numM1083);
                break;
            default:
                int i22 = C0133.f159;
                int i23 = 1616;
                while (true) {
                    i23 ^= 1633;
                    switch (i23) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i23 = ((i22 ^ 795) & i10) == 2 ? 1709 : 1678;
                            break;
                        case 204:
                            m0.q qVar2 = (m0.q) mVar;
                            boolean zM1626 = C0074.m1625(qVar2);
                            int i24 = 1740;
                            while (true) {
                                i24 ^= 1757;
                                switch (i24) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i24 = !zM1626 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        C0471.m9156(qVar2);
                                        int i25 = 48767;
                                        while (true) {
                                            i25 ^= 48784;
                                            switch (i25) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 239:
                                                    i25 = 48798;
                                                    break;
                                            }
                                        }
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        int i26 = 1864;
                                        while (true) {
                                            i26 ^= 1881;
                                            switch (i26) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i26 = 48674;
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
                y.j0 j0Var2 = new y.j0(i1VarM3433, i1VarM5884);
                boolean zM7155 = C0365.m7153(listM5906);
                int i27 = 48891;
                while (true) {
                    i27 ^= 48908;
                    switch (i27) {
                        case 22:
                            break;
                        case 53:
                            fM7375 = C0377.m7374(i1VarM5884, iM7088);
                            break;
                        case 503:
                            i27 = zM7155 ? 49635 : 48953;
                            break;
                        case 32495:
                            fM7375 = C0463.m9001(j0Var2);
                            int i28 = 49666;
                            while (true) {
                                i28 ^= 49683;
                                switch (i28) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i28 = 49697;
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
                boolean zM7156 = C0365.m7153(listM4756);
                int i29 = 49790;
                while (true) {
                    i29 ^= 49807;
                    switch (i29) {
                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case 51:
                            break;
                        case 84:
                            int i30 = 49914;
                            while (true) {
                                i30 ^= 49931;
                                switch (i30) {
                                    case 497:
                                        if (numM7931 == null) {
                                            i30 = 50658;
                                        }
                                        break;
                                    case 1711:
                                        break;
                                    case 1736:
                                        fM8054 = C0377.m7374(i1VarM5884, C0367.m7190(numM7931));
                                        int i31 = 50813;
                                        while (true) {
                                            i31 ^= 50830;
                                            switch (i31) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    C0072.m1563(fVarM4283, new y.u0(C0455.m8875(j0Var2, C0360.m7050(i1VarM5884)), fM7375, C0259.m4932(j0Var2, C0360.m7050(i1VarM5884)), fM8054), mVar, numM1083);
                                                    break;
                                                case 243:
                                                    i31 = 50844;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 1769:
                                        int i32 = 50689;
                                        while (true) {
                                            i32 ^= 50706;
                                            switch (i32) {
                                                case 19:
                                                    i32 = 50720;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i30 = 50627;
                            }
                            break;
                        case 241:
                            if (!zM7156) {
                                i29 = 49883;
                            }
                            break;
                        default:
                            continue;
                    }
                    i29 = 49852;
                }
                fM8054 = C0411.m8053(j0Var2);
                C0072.m1563(fVarM4283, new y.u0(C0455.m8875(j0Var2, C0360.m7050(i1VarM5884)), fM7375, C0259.m4932(j0Var2, C0360.m7050(i1VarM5884)), fM8054), mVar, numM1083);
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0168.m3211(this)) {
            case 0:
                C0295.m5665(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            default:
                C0295.m5665(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
