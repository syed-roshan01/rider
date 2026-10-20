package f5;

import aa.C0012;
import androidx.appcompat.widget.C0020;
import androidx.lifecycle.C0043;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.abt.C0112;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.iid.C0171;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.sql.C0208;
import d1.C0212;
import dagger.hilt.android.components.C0227;
import f.C0270;
import f6.C0277;
import h.C0297;
import h0.C0299;
import j9.C0329;
import ja.C0330;
import k3.C0334;
import o7.i2;
import p8.C0379;
import p8.C0380;
import p9.q0;
import q1.C0383;
import r5.C0399;
import s.C0408;
import u8.C0438;
import v0.C0440;
import v0.C0441;
import w1.C0455;

/* JADX INFO: loaded from: classes.dex */
public final class v extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f417short = {2850, 2848, 2861, 2861, 2913, 2869, 2862, 2913, 2918, 2867, 2852, 2866, 2868, 2860, 2852, 2918, 2913, 2851, 2852, 2855, 2862, 2867, 2852, 2913, 2918, 2856, 2863, 2871, 2862, 2858, 2852, 2918, 2913, 2870, 2856, 2869, 2857, 2913, 2850, 2862, 2867, 2862, 2868, 2869, 2856, 2863, 2852, 1276, 1236, 1240, 1232, 1237, 1177, 1239, 1238, 1229, 1177, 1231, 1244, 1227, 1232, 1247, 1232, 1244, 1245, 1177, 1216, 1244, 1229, 1175, 1177, 1257, 1237, 1244, 1240, 1226, 1244, 1177, 1242, 1233, 1244, 1242, 1234, 1177, 1216, 1238, 1228, 1227, 1177, 1232, 1239, 1243, 1238, 1217, 1175, 1139, 1108, 1116, 1113, 1104, 1105, 1045, 1089, 1114, 1045, 1110, 1117, 1104, 1110, 1118, 1045, 1091, 1104, 1095, 1116, 1107, 1116, 1110, 1108, 1089, 1116, 1114, 1115, 1039, 1045};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f6334b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(MainViewModel mainViewModel, u8.e eVar) {
        super(C0112.f138 ^ 570, eVar);
        this.f6334b = mainViewModel;
        int iM3984 = C0208.m3984();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3984 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0171.m3273("e58Jy82dGbqJAlg5Dg04bq")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۦۧۥ۟, reason: contains not printable characters */
    public static short[] m5353() {
        int iM6374 = C0330.m6374();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6374 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f417short;
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
        MainViewModel mainViewModelM2914 = null;
        String str = "\u06e6\u06e4\u06e1";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1753571:
                    mainViewModelM2914 = C0152.m2914(this);
                    str = "\u06e8\u06e4\u06df";
                    break;
                case 1755491:
                    this = new v(mainViewModelM2914, eVar);
                    str = "\u06e2\u06e6";
                    break;
                default:
                    return this;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e0\u06e7\u06e8";
        Object objM7814 = obj;
        m9.d0 d0Var = null;
        u8.e eVar = null;
        q8.l lVarM238 = null;
        u8.e eVarM2204 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747650:
                    return objM7814;
                case 1747905:
                    str = "\u06e1\u06df\u06e0";
                    d0Var = (m9.d0) objM7814;
                    break;
                case 1748610:
                    str = "\u06e4\u06e3\u06e0";
                    eVar = (u8.e) obj2;
                    break;
                case 1749702:
                    str = "\u06e0\u06e7\u06e0";
                    this = (v) eVarM2204;
                    break;
                case 1749824:
                    objM7814 = C0399.m7814(this, lVarM238);
                    str = "\u06e0\u06df\u06e1";
                    break;
                case 1751617:
                    eVarM2204 = C0114.m2204(this, d0Var, eVar);
                    str = "\u06e2\u06e3\u06e7";
                    break;
                default:
                    str = "\u06e2\u06e7\u06e5";
                    lVarM238 = C0012.m238();
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0050. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:66:0x0130. Please report as an issue. */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        v8.a aVarM5766 = C0299.m5766();
        int iM5720 = C0297.m5720(this);
        MainViewModel mainViewModelM2914 = C0152.m2914(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            try {
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i10 = iM5720 != 0 ? 1709 : 1678;
                        break;
                    case 204:
                        int i11 = 1740;
                        while (true) {
                            i11 ^= 1757;
                            switch (i11) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = iM5720 == 1 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    throw new IllegalStateException(C0438.m8563(m5353(), 0, C0168.f192 ^ 927, 2881));
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    C0329.m6365(obj);
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
                        C0329.m6365(obj);
                        C0227.m4382(C0073.m1601(mainViewModelM2914), C0334.m6483());
                        C0227.m4382(C0379.m7430(mainViewModelM2914), null);
                        FirebaseUser firebaseUserM5359 = C0277.m5359(C0020.m402(C0380.m7458(mainViewModelM2914)));
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
                                    Task taskM840 = C0043.m840(firebaseUserM5359);
                                    int i14 = 49666;
                                    while (true) {
                                        i14 ^= 49683;
                                        switch (i14) {
                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i14 = taskM840 != null ? 49759 : 49728;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                this.f6333a = 1;
                                                Object objM3126 = C0163.m3126(taskM840, this);
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
                            q0 q0VarM7430 = C0379.m7430(mainViewModelM2914);
                            String strM4049 = C0212.m4049(e4);
                            StringBuilder sb = new StringBuilder(C0043.m836(m5353(), 95, C0108.f134 ^ (-92), 1077));
                            C0142.m2728(sb, strM4049);
                            C0227.m4382(q0VarM7430, C0440.m8605(sb));
                            C0227.m4382(C0073.m1601(mainViewModelM2914), C0455.m8876());
                            break;
                        case 239:
                            i16 = 48798;
                            break;
                    }
                }
            }
        }
        FirebaseUser firebaseUserM53510 = C0277.m5359(C0441.m8614());
        int i17 = 49914;
        while (true) {
            i17 ^= 49931;
            switch (i17) {
                case 497:
                    i17 = firebaseUserM53510 != null ? 50658 : 50627;
                    break;
                case 1711:
                    break;
                case 1736:
                    break;
                case 1769:
                    boolean zM5161 = C0270.m5161(firebaseUserM53510);
                    int i18 = 50689;
                    while (true) {
                        i18 ^= 50706;
                        switch (i18) {
                            case 19:
                                i18 = zM5161 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                C0227.m4382(C0379.m7430(mainViewModelM2914), null);
                                C0227.m4382(C0073.m1601(mainViewModelM2914), C0455.m8876());
                                C0383.m7508(C0113.m2178(mainViewModelM2914), null, 0, new j(mainViewModelM2914, null), C0088.f122 ^ 967);
                                int i19 = 50813;
                                while (true) {
                                    i19 ^= 50830;
                                    switch (i19) {
                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 243:
                                            i19 = 50844;
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
            return C0012.m238();
        }
        C0227.m4382(C0379.m7430(mainViewModelM2914), C0408.m8010(m5353(), 47, C0136.f162 ^ (-359), 1209));
        C0227.m4382(C0073.m1601(mainViewModelM2914), C0455.m8876());
        int i20 = 51588;
        while (true) {
            i20 ^= 51605;
            switch (i20) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i20 = 51619;
                    break;
                case 54:
                    return C0012.m238();
            }
        }
    }
}
