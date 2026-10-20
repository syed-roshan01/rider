package k0;

import aa.C0012;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import androidx.profileinstaller.C0045;
import c0.C0057;
import c1.C0059;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.internal.tasks.C0103;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.emulators.C0141;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.iid.C0171;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.protobuf.C0209;
import e2.C0261;
import g8.C0293;
import k3.C0335;
import la.C0348;
import m9.C0359;
import u4.C0435;
import u4.C0436;
import v.C0439;
import w6.C0464;
import x5.C0470;

/* JADX INFO: loaded from: classes.dex */
public final class j extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.e f9052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f9053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(c9.e eVar, c9.e eVar2, int i10) {
        super(C0084.f118 ^ 519);
        this.f9051a = i10;
        this.f9052b = eVar;
        this.f9053c = eVar2;
        int iM4013 = C0209.m4013();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4013 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0293.m5651("zdJwu4BJWgKmOr4nl0tfa")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x00f9 A[SYNTHETIC] */
    public final void a(m0.m mVar, int i10) {
        m0.q qVar;
        int i11;
        int i12;
        int i13 = 0;
        Integer numM1083 = C0057.m1083(0);
        int iM8568 = C0439.m8568(this);
        c9.e eVarM3088 = C0161.m3088(this);
        c9.e eVarM342 = C0017.m342(this);
        switch (iM8568) {
            case 0:
                int i14 = C0335.f519;
                int i15 = 48891;
                while (true) {
                    i15 ^= 48908;
                    switch (i15) {
                        case 22:
                            break;
                        case 53:
                            qVar = (m0.q) mVar;
                            C0261.m4990(qVar, (-1969500198) ^ C0110.f136);
                            i11 = 50689;
                            while (true) {
                                i11 ^= 50706;
                                switch (i11) {
                                    case 19:
                                        i11 = eVarM3088 == null ? 50782 : 50751;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        C0464.m9049(eVarM3088, qVar, numM1083);
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        i12 = 50813;
                                        while (true) {
                                            i12 ^= 50830;
                                            switch (i12) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 243:
                                                    i12 = 50844;
                                                    continue;
                                                    continue;
                                                default:
                                                    continue;
                                                    continue;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            C0171.m3270(qVar, false);
                            C0464.m9049(eVarM342, qVar, numM1083);
                            break;
                        case 503:
                            i15 = ((i14 ^ 314) & i10) == 2 ? 49635 : 48953;
                            break;
                        case 32495:
                            m0.q qVar2 = (m0.q) mVar;
                            boolean zM1625 = C0074.m1625(qVar2);
                            int i16 = 49666;
                            while (true) {
                                i16 ^= 49683;
                                switch (i16) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i16 = !zM1625 ? 49759 : 49728;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        int i17 = 49790;
                                        while (true) {
                                            i17 ^= 49807;
                                            switch (i17) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    qVar = (m0.q) mVar;
                                                    C0261.m4990(qVar, (-1969500198) ^ C0110.f136);
                                                    i11 = 50689;
                                                    while (true) {
                                                        i11 ^= 50706;
                                                        switch (i11) {
                                                            case 19:
                                                                if (eVarM3088 == null) {
                                                                }
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                C0464.m9049(eVarM3088, qVar, numM1083);
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 76:
                                                                i12 = 50813;
                                                                while (true) {
                                                                    i12 ^= 50830;
                                                                    switch (i12) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case 243:
                                                                            i12 = 50844;
                                                                            continue;
                                                                            continue;
                                                                        default:
                                                                            continue;
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0171.m3270(qVar, false);
                                                    C0464.m9049(eVarM342, qVar, numM1083);
                                                    break;
                                                case 241:
                                                    i17 = 49821;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 83:
                                        C0470.m9156(qVar2);
                                        int i18 = 49914;
                                        while (true) {
                                            i18 ^= 49931;
                                            switch (i18) {
                                                case 497:
                                                    i18 = 50596;
                                                    continue;
                                                case 1711:
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
                    int iM2714 = C0141.m2714();
                    int i19 = 51588;
                    while (true) {
                        i19 ^= 51605;
                        switch (i19) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM2714 >= 0) {
                                    i19 = 51681;
                                }
                                break;
                            case 54:
                                break;
                            case 87:
                                break;
                            case 116:
                                System.out.println(Integer.parseInt(C0016.m328("dSaxb0SJKs6ycUJ1H")));
                                break;
                            default:
                                continue;
                        }
                        i19 = 51650;
                    }
                }
                break;
            default:
                int i20 = C0143.f169;
                int i21 = 1616;
                while (true) {
                    i21 ^= 1633;
                    switch (i21) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (((i20 ^ (-374)) & i10) == 2) {
                                i21 = 1709;
                            }
                            break;
                        case 204:
                            m0.q qVar3 = (m0.q) mVar;
                            boolean zM1626 = C0074.m1625(qVar3);
                            int i22 = 1740;
                            while (true) {
                                i22 ^= 1757;
                                switch (i22) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        if (!zM1626) {
                                            i22 = 1833;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        C0470.m9156(qVar3);
                                        int i23 = 48767;
                                        while (true) {
                                            i23 ^= 48784;
                                            switch (i23) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 239:
                                                    i23 = 48798;
                                                    break;
                                            }
                                        }
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        int i24 = 1864;
                                        while (true) {
                                            i24 ^= 1881;
                                            switch (i24) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i24 = 48674;
                                                    break;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i22 = 1802;
                            }
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i21 = 1678;
                }
                C0359.m7053(C0348.m6817(), C0082.m1762(), C0059.m1122(mVar, 909933960 ^ C0436.f707, new j(eVarM3088, eVarM342, i13)), mVar, C0103.f129 ^ (-60));
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0439.m8568(this)) {
            case 0:
                C0045.m866(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
            default:
                C0045.m866(this, (m0.m) obj, C0435.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
