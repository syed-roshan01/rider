package k0;

import androidx.core.content.C0041;
import androidx.versionedparcelable.C0048;
import c1.C0058;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.installations.C0177;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0198;
import com.google.gson.internal.bind.C0207;
import h1.C0301;
import l3.C0343;
import m4.C0354;
import n8.C0366;
import r.C0393;
import s.C0409;
import y.C0476;
import z7.C0489;
import z7.C0491;

/* JADX INFO: loaded from: classes.dex */
public abstract class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0.m3 f9419a = new m0.m3(C0366.m7174());

    public static final e1.l0 a(int i10, m0.m mVar) {
        q2 q2Var = (q2) C0476.m9256((m0.q) mVar, C0177.m3375());
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (i10 != 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    switch ((C0198.f222 ^ (-300)) + i10) {
                        case 0:
                            return C0343.m6713(q2Var);
                        case 1:
                            e0.e eVarM3959 = C0207.m3959(C0343.m6713(q2Var));
                            int i12 = 51588;
                            while (true) {
                                i12 ^= 51605;
                                switch (i12) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i12 = 51619;
                                        break;
                                    case 54:
                                        return eVarM3959;
                                }
                            }
                            break;
                        case 2:
                            e0.a aVarM5792 = C0301.m5792(q2Var);
                            int i13 = 50813;
                            while (true) {
                                i13 ^= 50830;
                                switch (i13) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        return aVarM5792;
                                    case 243:
                                        i13 = 50844;
                                        break;
                                }
                            }
                            break;
                        case 3:
                            e0.e eVarM39510 = C0207.m3959(C0301.m5792(q2Var));
                            int i14 = 50689;
                            while (true) {
                                i14 ^= 50706;
                                switch (i14) {
                                    case 19:
                                        i14 = 50720;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        return eVarM39510;
                                }
                            }
                            break;
                        case 4:
                            e0.e eVarM6942 = C0354.m6942();
                            int i15 = 49914;
                            while (true) {
                                i15 ^= 49931;
                                switch (i15) {
                                    case 497:
                                        i15 = 50596;
                                        break;
                                    case 1711:
                                        return eVarM6942;
                                }
                            }
                            break;
                        case 5:
                            e0.a aVarM1101 = C0058.m1101(q2Var);
                            int i16 = 49790;
                            while (true) {
                                i16 ^= 49807;
                                switch (i16) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        return aVarM1101;
                                    case 241:
                                        i16 = 49821;
                                        break;
                                }
                            }
                            break;
                        case 6:
                            e0.a aVarM1102 = C0058.m1101(q2Var);
                            float f10 = (float) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                            e0.e eVarM928 = C0048.m928(aVarM1102, new e0.c(f10), null, new e0.c(f10), C0491.f764 ^ 816);
                            int i17 = 49666;
                            while (true) {
                                i17 ^= 49683;
                                switch (i17) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i17 = 49697;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        return eVarM928;
                                }
                            }
                            break;
                        case 7:
                            e0.e eVarM39511 = C0207.m3959(C0058.m1101(q2Var));
                            int i18 = 48891;
                            while (true) {
                                i18 ^= 48908;
                                switch (i18) {
                                    case 22:
                                        return eVarM39511;
                                    case 503:
                                        i18 = 48922;
                                        break;
                                }
                            }
                            break;
                        case 8:
                            e0.a aVarM8016 = C0409.m8016(q2Var);
                            int i19 = 48767;
                            while (true) {
                                i19 ^= 48784;
                                switch (i19) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        return aVarM8016;
                                    case 239:
                                        i19 = 48798;
                                        break;
                                }
                            }
                            break;
                        case 9:
                            e1.f0 f0VarM813 = C0041.m813();
                            int i20 = 1864;
                            while (true) {
                                i20 ^= 1881;
                                switch (i20) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i20 = 48674;
                                        break;
                                    case 47483:
                                        return f0VarM813;
                                }
                            }
                            break;
                        case 10:
                            e0.a aVarM9517 = C0489.m9517(q2Var);
                            int i21 = 1740;
                            while (true) {
                                i21 ^= 1757;
                                switch (i21) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i21 = 1771;
                                        break;
                                    case 54:
                                        return aVarM9517;
                                }
                            }
                            break;
                        default:
                            throw new androidx.fragment.app.a0();
                    }
                    break;
                case 239:
                    throw null;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public static final e0.e b(e0.a aVar) {
        float f10 = 0.0f;
        String str = "ۥۦۤ";
        e0.e eVarM928 = null;
        e0.c cVar = null;
        e0.c cVar2 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746876:
                    return eVarM928;
                case 1746913:
                    cVar = new e0.c(f10);
                    str = "ۤۢۧ";
                    break;
                case 1747836:
                    eVarM928 = C0048.m928(aVar, null, cVar2, cVar, i10);
                    str = "۟ۥۢ";
                    break;
                case 1748773:
                    str = "ۣۤ۟";
                    i11 = C0393.f663;
                    break;
                case 1750686:
                    i10 = i11 ^ 578;
                    str = "۠ۥۡ";
                    break;
                case 1752675:
                    str = "۟ۦۨ";
                    f10 = (float) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    break;
                default:
                    cVar2 = new e0.c(f10);
                    str = "ۡۤۨ";
                    break;
            }
        }
    }
}
