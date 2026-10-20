package f5;

import a6.C0007;
import aa.C0012;
import androidx.appcompat.widget.C0020;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.tasks.Task;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import d1.C0213;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.modules.C0234;
import f6.C0278;
import g5.C0291;
import h0.C0300;
import h3.C0302;
import j9.C0330;
import l6.C0345;
import l8.C0347;
import o1.C0368;
import o7.i2;
import okhttp3.internal.publicsuffix.C0373;
import p8.C0380;
import p8.C0381;
import p9.q0;
import v0.C0441;
import v9.C0452;

/* JADX INFO: loaded from: classes.dex */
public final class x extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f419short = {3184, 3186, 3199, 3199, 3123, 3175, 3196, 3123, 3124, 3169, 3190, 3168, 3174, 3198, 3190, 3124, 3123, 3185, 3190, 3189, 3196, 3169, 3190, 3123, 3124, 3194, 3197, 3173, 3196, 3192, 3190, 3124, 3123, 3172, 3194, 3175, 3195, 3123, 3184, 3196, 3169, 3196, 3174, 3175, 3194, 3197, 3190, 1230, 1257, 1249, 1252, 1261, 1260, 1192, 1276, 1255, 1192, 1275, 1261, 1254, 1260, 1192, 1278, 1261, 1274, 1249, 1262, 1249, 1259, 1257, 1276, 1249, 1255, 1254, 1192, 1261, 1253, 1257, 1249, 1252, 1202, 1192};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f6339b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(MainViewModel mainViewModel, u8.e eVar) {
        super(C0345.f615 ^ 714, eVar);
        this.f6339b = mainViewModel;
        int iM3762 = C0196.m3762();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3762 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0291.m5592("xWIRKxUs00z")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۢۨ, reason: not valid java name and contains not printable characters */
    public static short[] m5355() {
        int iM8793 = C0452.m8793();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8793 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f419short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        MainViewModel mainViewModelM7200 = null;
        String str = "ۡ۠ۢ";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1754533:
                    return this;
                case 1754659:
                    this = new x(mainViewModelM7200, eVar);
                    str = "ۧۤۢ";
                    break;
                default:
                    mainViewModelM7200 = C0368.m7200(this);
                    str = "ۧۨۤ";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۨۦۨ";
        Object objM2477 = obj;
        u8.e eVarM1764 = null;
        q8.l lVarM238 = null;
        m9.d0 d0Var = null;
        u8.e eVar = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56357:
                    eVarM1764 = C0082.m1764(this, d0Var, eVar);
                    str = "ۣۣۦ";
                    break;
                case 1748773:
                    str = "ۡۦ";
                    eVar = (u8.e) obj2;
                    break;
                case 1750570:
                    return objM2477;
                case 1750662:
                    str = "ۦۤۨ";
                    this = (x) eVarM1764;
                    break;
                case 1753578:
                    str = "ۧ۠ۨ";
                    lVarM238 = C0012.m238();
                    break;
                case 1754415:
                    objM2477 = C0128.m2477(this, lVarM238);
                    str = "ۣ۠ۧ";
                    break;
                default:
                    str = "ۡۤۨ";
                    d0Var = (m9.d0) objM2477;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        v8.a aVarM5766 = C0300.m5766();
        int iM6776 = C0347.m6776(this);
        MainViewModel mainViewModelM7200 = C0368.m7200(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            try {
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i10 = iM6776 != 0 ? 1709 : 1678;
                        break;
                    case 204:
                        int i11 = 1740;
                        while (true) {
                            i11 ^= 1757;
                            switch (i11) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = iM6776 == 1 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    throw new IllegalStateException(C0373.m7300(m5355(), 0, C0330.f477 ^ 872, 3091));
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    C0330.m6365(obj);
                                    int i12 = 1864;
                                    while (true) {
                                        i12 ^= 1881;
                                        switch (i12) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i12 = 48674;
                                                continue;
                                            case 47483:
                                                obj2 = obj;
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
                        C0330.m6365(obj);
                        FirebaseUser firebaseUserM5359 = C0278.m5359(C0020.m402(C0381.m7458(mainViewModelM7200)));
                        int i13 = 48891;
                        while (true) {
                            i13 ^= 48908;
                            switch (i13) {
                                case 22:
                                    break;
                                case 53:
                                    break;
                                case 503:
                                    i13 = firebaseUserM5359 != null ? 49635 : 48953;
                                    break;
                                case 32495:
                                    Task taskM4497 = C0234.m4497(firebaseUserM5359);
                                    int i14 = 49666;
                                    while (true) {
                                        i14 ^= 49683;
                                        switch (i14) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i14 = taskM4497 != null ? 49759 : 49728;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                this.f6338a = 1;
                                                Object objM3126 = C0163.m3126(taskM4497, this);
                                                int i15 = 49790;
                                                while (true) {
                                                    i15 ^= 49807;
                                                    switch (i15) {
                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 51:
                                                            obj2 = objM3126;
                                                            break;
                                                        case 84:
                                                            return aVarM5766;
                                                        case 241:
                                                            i15 = objM3126 == aVarM5766 ? 49883 : 49852;
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
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    default:
                        break;
                }
            } catch (Exception e4) {
                int i16 = 48767;
                while (true) {
                    i16 ^= 48784;
                    switch (i16) {
                        case Code.UNAVAILABLE /* 14 */:
                            q0 q0VarM7430 = C0380.m7430(mainViewModelM7200);
                            String strM4049 = C0213.m4049(e4);
                            StringBuilder sb = new StringBuilder(C0302.m5796(m5355(), 47, C0007.f27 ^ (-388), 1160));
                            C0142.m2728(sb, strM4049);
                            C0228.m4382(q0VarM7430, C0441.m8605(sb));
                            break;
                        case 239:
                            i16 = 48798;
                            break;
                    }
                }
            }
        }
        C0228.m4382(C0380.m7430(mainViewModelM7200), null);
        int i17 = 49914;
        while (true) {
            i17 ^= 49931;
            switch (i17) {
                case 497:
                    i17 = 50596;
                    break;
                case 1711:
                    return C0012.m238();
            }
        }
    }
}
