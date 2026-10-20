package f0;

import androidx.annotation.C0018;
import androidx.compose.ui.semantics.C0039;
import c1.C0059;
import c7.C0069;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0171;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.bind.C0207;
import d1.C0211;
import e1.C0257;
import e2.C0261;
import g3.C0288;
import h6.C0309;
import k4.C0336;
import l9.C0347;
import o7.i2;
import q0.C0382;
import q2.C0384;
import r1.C0393;
import s2.C0411;
import t7.C0425;
import v0.C0442;
import v6.C0447;
import w1.C0455;
import x5.C0470;
import y6.C0476;
import y9.C0478;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f5693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f5694b;

    static {
        float f10 = C0442.f713 ^ (-128);
        f5693a = f10;
        f5694b = (f10 * 2.0f) / 2.4142137f;
    }

    /* JADX WARN: Code duplicated, block: B:228:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x0171 A[SYNTHETIC] */
    public static final void a(long j10, y0.o oVar, c9.e eVar, m0.m mVar, int i10) {
        int i11;
        boolean zM4041;
        Object objM8078;
        int i12;
        Object objM2417;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        m0.q qVar = (m0.q) mVar;
        C0393.m7698(qVar, 5185619 ^ C0309.f457);
        int i18 = C0120.f146;
        int i19 = 1616;
        while (true) {
            i19 ^= 1633;
            switch (i19) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i19 = ((i18 ^ 465) & i10) == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM4042 = C0211.m4041(qVar, j10);
                    int i20 = 1740;
                    while (true) {
                        i20 ^= 1757;
                        switch (i20) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i20 = zM4042 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                i16 = 2;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                i16 = 4;
                                int i21 = 1864;
                                while (true) {
                                    i21 ^= 1881;
                                    switch (i21) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i21 = 48674;
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
                    i11 = (i16 & i10) | (i16 ^ i10);
                    int i22 = 48767;
                    while (true) {
                        i22 ^= 48784;
                        switch (i22) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i22 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    i11 = i10;
                    break;
                default:
                    break;
            }
        }
        int i23 = C0207.f231;
        int i24 = 48891;
        while (true) {
            i24 ^= 48908;
            switch (i24) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    i24 = ((i23 ^ (-539)) & i10) == 0 ? 49635 : 48953;
                    break;
                case 32495:
                    boolean zM2013 = C0103.m2013(qVar, oVar);
                    int i25 = 49666;
                    while (true) {
                        i25 ^= 49683;
                        switch (i25) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i25 = zM2013 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                i15 = 32;
                                int i26 = 49790;
                                while (true) {
                                    i26 ^= 49807;
                                    switch (i26) {
                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i26 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                i15 = 16;
                                break;
                            default:
                                break;
                        }
                    }
                    i11 = (i11 & i15) | (i11 ^ i15);
                    break;
                default:
                    break;
            }
        }
        int i27 = C0039.f59;
        int i28 = 49914;
        while (true) {
            i28 ^= 49931;
            switch (i28) {
                case 497:
                    i28 = ((i27 ^ 182) & i10) == 0 ? 50658 : 50627;
                    break;
                case 1711:
                    break;
                case 1736:
                    break;
                case 1769:
                    boolean zM5551 = C0288.m5551(qVar, eVar);
                    int i29 = 50689;
                    while (true) {
                        i29 ^= 50706;
                        switch (i29) {
                            case 19:
                                i29 = zM5551 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                i14 = 128;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                i14 = 256;
                                int i30 = 50813;
                                while (true) {
                                    i30 ^= 50830;
                                    switch (i30) {
                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 243:
                                            i30 = 50844;
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
                    i11 = (i11 & i14) | (i11 ^ i14);
                    break;
                default:
                    break;
            }
        }
        int i31 = C0492.f766;
        int i32 = 51588;
        while (true) {
            i32 ^= 51605;
            switch (i32) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i32 = ((i31 ^ (-501)) & i11) == 146 ? 51681 : 51650;
                    break;
                case 54:
                    break;
                case 87:
                    C0261.m4990(qVar, 2068317613 ^ C0455.f726);
                    zM4041 = C0211.m4041(qVar, j10);
                    objM8078 = C0411.m8078(qVar);
                    i12 = 52735;
                    while (true) {
                        i12 ^= 52752;
                        switch (i12) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                objM8078 = new a(j10);
                                C0478.m9328(qVar, objM8078);
                                break;
                            case 1007:
                                i12 = !zM4041 ? 53479 : 52797;
                                break;
                            case 7927:
                                objM2417 = C0125.m2417();
                                i13 = 53510;
                                while (true) {
                                    i13 ^= 53527;
                                    switch (i13) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i13 = objM8078 == objM2417 ? 53603 : 53572;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 83:
                                            break;
                                        case 116:
                                            objM8078 = new a(j10);
                                            C0478.m9328(qVar, objM8078);
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
                    C0425.m8334((h0.m) objM8078, C0336.m6517(), C0059.m1122(qVar, (-1458480610) ^ C0347.f618, new b(eVar, oVar)), qVar, C0411.f682 ^ 405);
                    break;
                case 116:
                    boolean zM1625 = C0074.m1625(qVar);
                    int i33 = 51712;
                    while (true) {
                        i33 ^= 51729;
                        switch (i33) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i33 = !zM1625 ? 51805 : 51774;
                                break;
                            case 47:
                                C0470.m9156(qVar);
                                int i34 = 52611;
                                while (true) {
                                    i34 ^= 52628;
                                    switch (i34) {
                                        case 23:
                                            i34 = 52642;
                                            continue;
                                        case 54:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 76:
                                int i35 = 51836;
                                while (true) {
                                    i35 ^= 51853;
                                    switch (i35) {
                                        case 241:
                                            i35 = 52518;
                                            continue;
                                        case 1963:
                                            break;
                                        default:
                                            continue;
                                    }
                                    C0261.m4990(qVar, 2068317613 ^ C0455.f726);
                                    zM4041 = C0211.m4041(qVar, j10);
                                    objM8078 = C0411.m8078(qVar);
                                    i12 = 52735;
                                    while (true) {
                                        i12 ^= 52752;
                                        switch (i12) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                objM8078 = new a(j10);
                                                C0478.m9328(qVar, objM8078);
                                                break;
                                            case 1007:
                                                if (!zM4041) {
                                                }
                                                break;
                                            case 7927:
                                                objM2417 = C0125.m2417();
                                                i13 = 53510;
                                                while (true) {
                                                    i13 ^= 53527;
                                                    switch (i13) {
                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (objM8078 == objM2417) {
                                                            }
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 83:
                                                            break;
                                                        case 116:
                                                            objM8078 = new a(j10);
                                                            C0478.m9328(qVar, objM8078);
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
                                    C0425.m8334((h0.m) objM8078, C0336.m6517(), C0059.m1122(qVar, (-1458480610) ^ C0347.f618, new b(eVar, oVar)), qVar, C0411.f682 ^ 405);
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
            m0.x1 x1VarM7533 = C0384.m7533(qVar);
            int i36 = 53634;
            while (true) {
                i36 ^= 53651;
                switch (i36) {
                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        if (x1VarM7533 != null) {
                            i36 = 53727;
                        }
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                    case 76:
                        x1VarM7533.f11756d = new c(j10, oVar, eVar, i10, i17);
                        return;
                    case 83:
                        return;
                    default:
                        continue;
                }
                i36 = 53696;
            }
        }
    }

    public static final void b(y0.o oVar, m0.m mVar, int i10) {
        int i11;
        int i12;
        m0.q qVar = (m0.q) mVar;
        C0393.m7698(qVar, (-694250531) ^ C0018.f38);
        int i13 = C0128.f154;
        int i14 = 1616;
        while (true) {
            i14 ^= 1633;
            switch (i14) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i14 = ((i13 ^ (-167)) & i10) == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM2013 = C0103.m2013(qVar, oVar);
                    int i15 = 1740;
                    while (true) {
                        i15 ^= 1757;
                        switch (i15) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = zM2013 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                i12 = 2;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                i12 = 4;
                                int i16 = 1864;
                                while (true) {
                                    i16 ^= 1881;
                                    switch (i16) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i16 = 48674;
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
                    i11 = (i12 & i10) | (i12 ^ i10);
                    int i17 = 48767;
                    while (true) {
                        i17 ^= 48784;
                        switch (i17) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i17 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    i11 = i10;
                    break;
                default:
                    break;
            }
        }
        int i18 = C0382.f653;
        int i19 = 48891;
        while (true) {
            i19 ^= 48908;
            switch (i19) {
                case 22:
                    break;
                case 53:
                    C0072.m1564(C0447.m8724(C0425.m8345(oVar, C0257.m4927(), C0476.m9291()), C0069.m1348()), qVar);
                    break;
                case 503:
                    i19 = ((i18 ^ 806) & i11) == 2 ? 49635 : 48953;
                    break;
                case 32495:
                    boolean zM1625 = C0074.m1625(qVar);
                    int i20 = 49666;
                    while (true) {
                        i20 ^= 49683;
                        switch (i20) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i20 = !zM1625 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                int i21 = 49790;
                                while (true) {
                                    i21 ^= 49807;
                                    switch (i21) {
                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i21 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                    C0072.m1564(C0447.m8724(C0425.m8345(oVar, C0257.m4927(), C0476.m9291()), C0069.m1348()), qVar);
                                    break;
                                }
                                break;
                            case 83:
                                C0470.m9156(qVar);
                                int i22 = 49914;
                                while (true) {
                                    i22 ^= 49931;
                                    switch (i22) {
                                        case 497:
                                            i22 = 50596;
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
        }
        m0.x1 x1VarM7533 = C0384.m7533(qVar);
        int i23 = 50689;
        while (true) {
            i23 ^= 50706;
            switch (i23) {
                case 19:
                    if (x1VarM7533 != null) {
                        i23 = 50782;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    return;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    x1VarM7533.f11756d = new y.m(oVar, i10, 1);
                    return;
                default:
                    continue;
            }
            i23 = 50751;
        }
    }
}
