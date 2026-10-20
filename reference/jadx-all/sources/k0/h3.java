package k0;

import a0.C0003;
import aa.C0012;
import android.support.v4.app.C0014;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.tasks.C0103;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.iid.C0171;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.internal.processedrootsentinel.C0252;
import e2.C0262;
import f0.C0273;
import l9.C0348;
import m7.C0357;
import q2.C0385;
import q7.C0390;
import r.C0393;
import s2.C0412;
import s6.C0414;
import t2.C0422;
import u.C0430;
import u4.C0436;
import u4.C0437;
import x5.C0471;
import x7.C0472;
import y9.C0479;
import z3.C0488;

/* JADX INFO: loaded from: classes.dex */
public final class h3 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x2 f8981b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3(x2 x2Var, int i10) {
        super(C0014.f34 ^ 960);
        this.f8980a = i10;
        this.f8981b = x2Var;
        int iM6984 = C0357.m6984();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6984 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0188.m3580("JVuZ1lsID1NbdceSDBuLHg")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x009c A[SYNTHETIC] */
    public final void a(m0.m mVar, int i10) {
        m0.q qVar;
        boolean zM2013;
        Object objM8078;
        int i11;
        Object objM2417;
        int i12;
        int iM5253 = C0273.m5253(this);
        x2 x2VarM8525 = C0437.m8525(this);
        switch (iM5253) {
            case 0:
                int i13 = C0422.f692;
                int i14 = 49914;
                while (true) {
                    i14 ^= 49931;
                    switch (i14) {
                        case 497:
                            i14 = ((i13 ^ (-286)) & i10) == 2 ? 50658 : 50627;
                            break;
                        case 1711:
                            break;
                        case 1736:
                            break;
                        case 1769:
                            m0.q qVar2 = (m0.q) mVar;
                            boolean zM1625 = C0074.m1625(qVar2);
                            int i15 = 50689;
                            while (true) {
                                i15 ^= 50706;
                                switch (i15) {
                                    case 19:
                                        i15 = !zM1625 ? 50782 : 50751;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        C0471.m9156(qVar2);
                                        int i16 = 51588;
                                        while (true) {
                                            i16 ^= 51605;
                                            switch (i16) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i16 = 51619;
                                                    break;
                                                case 54:
                                                    break;
                                            }
                                        }
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        int i17 = 50813;
                                        while (true) {
                                            i17 ^= 50830;
                                            switch (i17) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 243:
                                                    i17 = 50844;
                                                    continue;
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
                C0185.m3537(C0348.m6797(C0393.m7674(x2VarM8525)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mVar, 0, 0, C0385.f655 ^ 130473);
                break;
            default:
                int i18 = C0430.f700;
                int i19 = 1616;
                while (true) {
                    i19 ^= 1633;
                    switch (i19) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i19 = ((i18 ^ 331) & i10) == 2 ? 1709 : 1678;
                            break;
                        case 204:
                            m0.q qVar3 = (m0.q) mVar;
                            boolean zM1626 = C0074.m1625(qVar3);
                            int i20 = 1740;
                            while (true) {
                                i20 ^= 1757;
                                switch (i20) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i20 = !zM1626 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        C0471.m9156(qVar3);
                                        int i21 = 48767;
                                        while (true) {
                                            i21 ^= 48784;
                                            switch (i21) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 239:
                                                    i21 = 48798;
                                                    continue;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        int i22 = 1864;
                                        while (true) {
                                            i22 ^= 1881;
                                            switch (i22) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i22 = 48674;
                                                    continue;
                                                case 47483:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            qVar = (m0.q) mVar;
                                            C0262.m4990(qVar, (-2057496522) ^ C0472.f742);
                                            zM2013 = C0103.m2013(qVar, x2VarM8525);
                                            objM8078 = C0412.m8078(qVar);
                                            i11 = 48891;
                                            while (true) {
                                                i11 ^= 48908;
                                                switch (i11) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        objM8078 = new s2(x2VarM8525, 2);
                                                        C0479.m9328(qVar, objM8078);
                                                        break;
                                                    case 503:
                                                        i11 = !zM2013 ? 49635 : 48953;
                                                        break;
                                                    case 32495:
                                                        objM2417 = C0125.m2417();
                                                        i12 = 49666;
                                                        while (true) {
                                                            i12 ^= 49683;
                                                            switch (i12) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i12 = objM8078 == objM2417 ? 49759 : 49728;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    objM8078 = new s2(x2VarM8525, 2);
                                                                    C0479.m9328(qVar, objM8078);
                                                                    break;
                                                                case 83:
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
                                            C0171.m3270(qVar, false);
                                            C0109.m2115((c9.a) objM8078, null, false, null, null, C0390.m7633(), qVar, (-197469) ^ C0003.f881, C0414.f684 ^ (-931));
                                            break;
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            qVar = (m0.q) mVar;
                            C0262.m4990(qVar, (-2057496522) ^ C0472.f742);
                            zM2013 = C0103.m2013(qVar, x2VarM8525);
                            objM8078 = C0412.m8078(qVar);
                            i11 = 48891;
                            while (true) {
                                i11 ^= 48908;
                                switch (i11) {
                                    case 22:
                                        break;
                                    case 53:
                                        objM8078 = new s2(x2VarM8525, 2);
                                        C0479.m9328(qVar, objM8078);
                                        break;
                                    case 503:
                                        if (!zM2013) {
                                        }
                                        break;
                                    case 32495:
                                        objM2417 = C0125.m2417();
                                        i12 = 49666;
                                        while (true) {
                                            i12 ^= 49683;
                                            switch (i12) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (objM8078 == objM2417) {
                                                    }
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 76:
                                                    objM8078 = new s2(x2VarM8525, 2);
                                                    C0479.m9328(qVar, objM8078);
                                                    break;
                                                case 83:
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
                            C0171.m3270(qVar, false);
                            C0109.m2115((c9.a) objM8078, null, false, null, null, C0390.m7633(), qVar, (-197469) ^ C0003.f881, C0414.f684 ^ (-931));
                            break;
                        default:
                            break;
                    }
                    int iM9496 = C0488.m9496();
                    int i23 = 49790;
                    while (true) {
                        i23 ^= 49807;
                        switch (i23) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 51:
                                break;
                            case 84:
                                System.out.println(Double.decode(C0252.m4810("D7vQbT8fK1SVCp8BBvj")));
                                break;
                            case 241:
                                if (iM9496 >= 0) {
                                    i23 = 49883;
                                }
                                break;
                            default:
                                continue;
                        }
                        i23 = 49852;
                    }
                }
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0273.m5253(this)) {
            case 0:
                C0166.m3185(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            default:
                C0166.m3185(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
