package k0;

import aa.C0011;
import aa.C0012;
import android.os.C0013;
import androidx.compose.ui.graphics.C0031;
import b4.C0052;
import c0.C0057;
import c1.C0059;
import c1.C0060;
import c4.C0065;
import c4.C0066;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0171;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import d9.C0223;
import dagger.hilt.internal.generatesrootinput.C0251;
import dagger.hilt.internal.processedrootsentinel.C0252;
import e2.C0261;
import e2.C0262;
import ea.C0268;
import f.C0271;
import f4.C0277;
import ia.C0323;
import k.C0332;
import s.C0409;
import s2.C0412;
import u0.C0431;
import u4.C0436;
import v5.C0446;
import w1.C0456;
import w2.C0457;
import x5.C0471;
import x7.C0473;
import y.C0476;
import y9.C0479;
import z1.C0484;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8862d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(long j10, Object obj, Object obj2, int i10) {
        super(C0323.f470 ^ 125);
        this.f8859a = i10;
        this.f8860b = j10;
        this.f8861c = obj;
        this.f8862d = obj2;
        int iM9193 = C0473.m9193();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9193 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0457.m8886("JgC22ZsG2qNp32D3l5I5UpaWX")));
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
        int iM4805 = C0252.m4805(this);
        Object objM3780 = C0197.m3780(this);
        Object objM8428 = C0431.m8428(this);
        switch (iM4805) {
            case 0:
                int i11 = C0052.f72;
                int i12 = 51712;
                while (true) {
                    i12 ^= 51729;
                    switch (i12) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i12 = ((i11 ^ 930) & i10) == 2 ? 51805 : 51774;
                            break;
                        case 47:
                            break;
                        case 76:
                            m0.q qVar = (m0.q) mVar;
                            boolean zM1625 = C0074.m1625(qVar);
                            int i13 = 51836;
                            while (true) {
                                i13 ^= 51853;
                                switch (i13) {
                                    case 241:
                                        i13 = !zM1625 ? 52580 : 52549;
                                        break;
                                    case 1963:
                                        break;
                                    case 1992:
                                        C0471.m9156(qVar);
                                        int i14 = 52735;
                                        while (true) {
                                            i14 ^= 52752;
                                            switch (i14) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 1007:
                                                    i14 = 52766;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 2025:
                                        int i15 = 52611;
                                        while (true) {
                                            i15 ^= 52628;
                                            switch (i15) {
                                                case 23:
                                                    i15 = 52642;
                                                    continue;
                                                case 54:
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
                C0251.m4802(C0473.m9194(this), C0057.m1089((e5) C0476.m9256((m0.q) mVar, C0456.m8878())), C0059.m1122(mVar, (-1327514203) ^ C0484.f757, new v.n0(C0185.f209 ^ 788, (y.t0) objM8428, (c9.f) objM3780)), mVar, 384);
                break;
            case 1:
                int i16 = C0126.f152;
                int i17 = 49666;
                while (true) {
                    i17 ^= 49683;
                    switch (i17) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i17 = ((i16 ^ (-205)) & i10) == 2 ? 49759 : 49728;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 76:
                            m0.q qVar2 = (m0.q) mVar;
                            boolean zM1626 = C0074.m1625(qVar2);
                            int i18 = 49790;
                            while (true) {
                                i18 ^= 49807;
                                switch (i18) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 51:
                                        C0471.m9156(qVar2);
                                        int i19 = 50689;
                                        while (true) {
                                            i19 ^= 50706;
                                            switch (i19) {
                                                case 19:
                                                    i19 = 50720;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 84:
                                        int i20 = 49914;
                                        while (true) {
                                            i20 ^= 49931;
                                            switch (i20) {
                                                case 497:
                                                    i20 = 50596;
                                                    continue;
                                                case 1711:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 241:
                                        i18 = !zM1626 ? 49883 : 49852;
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
                }
                C0066.m1280();
                long jM9194 = C0473.m9194(this);
                m0.q qVar3 = (m0.q) mVar;
                C0262.m4990(qVar3, (-1402274114) ^ C0065.f85);
                long jM220 = C0011.m220();
                y yVarM5317 = C0277.m5317(C0031.m618((i0) C0476.m9256(qVar3, C0446.m8687())), jM220, jM9194, jM220, jM220);
                C0171.m3270(qVar3, false);
                C0262.m4990(qVar3, 2057496652 ^ C0268.f347);
                x2 x2Var = (x2) objM8428;
                boolean zM2013 = C0103.m2013(qVar3, x2Var);
                Object objM8078 = C0412.m8078(qVar3);
                int i21 = 50813;
                while (true) {
                    i21 ^= 50830;
                    switch (i21) {
                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case 53:
                            break;
                        case 243:
                            i21 = !zM2013 ? 51557 : 50875;
                            break;
                        case 4075:
                            Object objM2417 = C0125.m2417();
                            int i22 = 51588;
                            while (true) {
                                i22 ^= 51605;
                                switch (i22) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i22 = objM8078 == objM2417 ? 51681 : 51650;
                                        break;
                                    case 54:
                                        break;
                                    case 87:
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
                    C0171.m3270(qVar3, false);
                    C0409.m8011((c9.a) objM8078, null, false, null, yVarM5317, null, null, null, null, C0059.m1122(qVar3, (-521111294) ^ C0271.f350, new j3((String) objM3780, 0)), qVar3, (-805307264) ^ C0060.f80, C0261.f340 ^ (-795));
                    break;
                }
                objM8078 = new s2(x2Var, 1);
                C0479.m9328(qVar3, objM8078);
                C0171.m3270(qVar3, false);
                C0409.m8011((c9.a) objM8078, null, false, null, yVarM5317, null, null, null, null, C0059.m1122(qVar3, (-521111294) ^ C0271.f350, new j3((String) objM3780, 0)), qVar3, (-805307264) ^ C0060.f80, C0261.f340 ^ (-795));
                break;
            default:
                int i23 = C0013.f33;
                int i24 = 1616;
                while (true) {
                    i24 ^= 1633;
                    switch (i24) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i24 = ((i23 ^ 794) & i10) == 2 ? 1709 : 1678;
                            break;
                        case 204:
                            m0.q qVar4 = (m0.q) mVar;
                            boolean zM1627 = C0074.m1625(qVar4);
                            int i25 = 1740;
                            while (true) {
                                i25 ^= 1757;
                                switch (i25) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i25 = !zM1627 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        C0471.m9156(qVar4);
                                        int i26 = 48767;
                                        while (true) {
                                            i26 ^= 48784;
                                            switch (i26) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 239:
                                                    i26 = 48798;
                                                    continue;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        int i27 = 1864;
                                        while (true) {
                                            i27 ^= 1881;
                                            switch (i27) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i27 = 48674;
                                                    continue;
                                                case 47483:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            C0168.m3208(C0473.m9194(this), (a2.c0) objM8428, (c9.e) objM3780, mVar, 0, 0);
                                            break;
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            C0168.m3208(C0473.m9194(this), (a2.c0) objM8428, (c9.e) objM3780, mVar, 0, 0);
                            break;
                        default:
                            break;
                    }
                }
                int iM4279 = C0223.m4279();
                int i28 = 48891;
                while (true) {
                    i28 ^= 48908;
                    switch (i28) {
                        case 22:
                            break;
                        case 53:
                            break;
                        case 503:
                            if (iM4279 >= 0) {
                                i28 = 49635;
                            }
                            break;
                        case 32495:
                            System.out.println(Float.parseFloat(C0332.m6409("Byz18XE3Y")));
                            break;
                        default:
                            continue;
                    }
                    i28 = 48953;
                }
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0252.m4805(this)) {
            case 0:
                C0147.m2816(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            case 1:
                C0147.m2816(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            default:
                C0147.m2816(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
