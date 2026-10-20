package d5;

import a.C0000;
import a2.C0004;
import a8.C0009;
import aa.C0012;
import android.content.Context;
import android.support.v4.app.C0014;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.draw.C0028;
import androidx.compose.ui.node.C0037;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.C0074;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.tasks.C0106;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.emulators.C0141;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.iid.C0169;
import com.google.firebase.measurement.C0181;
import com.google.firebase.measurement.C0182;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0198;
import com.google.firebase.remoteconfiginterop.C0202;
import com.google.firebase.remoteconfiginterop.C0203;
import d2.C0216;
import d9.C0225;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.internal.definecomponent.C0250;
import dagger.hilt.migration.C0255;
import f4.C0277;
import f6.C0279;
import g.C0284;
import h1.C0301;
import h5.C0309;
import h7.C0312;
import i4.C0318;
import i6.C0320;
import j4.C0327;
import java.util.ArrayList;
import java.util.Map;
import k2.C0334;
import k3.C0335;
import k3.C0336;
import l2.C0342;
import l6.C0344;
import m4.C0354;
import m5.C0355;
import m7.C0357;
import m7.C0358;
import n9.C0367;
import p3.C0376;
import q1.C0384;
import q6.C0388;
import r1.C0394;
import r7.C0404;
import s7.C0416;
import t0.C0419;
import v.C0440;
import w2.C0457;
import x5.C0471;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f257short = {1390, 1376, 1404, 1394, 1386, 1399, 1377, 604, 582, 628, 598, 598, 592, 581, 577, 977, 970, 1007, 982, 970, 971, 909, 907, 907, 907, 908, 386, 390, 385, 432, 393, 398, 413, 394, 2775, 2779, 2754, 2789, 2780, 2779, 2760, 2783, 294, 265, 268, 276, 261, 274, 320, 275, 257, 278, 261, 260, 321, 320, 304, 268, 261, 257, 275, 261, 320, 274, 261, 275, 276, 257, 274, 276, 320, 276, 264, 261, 320, 275, 261, 274, 278, 265, 259, 261, 320, 262, 271, 274, 320, 259, 264, 257, 270, 263, 261, 275, 320, 276, 271, 320, 276, 257, 267, 261, 320, 261, 262, 262, 261, 259, 276, 334, 2694, 2729, 2732, 2740, 2725, 2738, 2784, 2739, 2721, 2742, 2725, 2724, 2785};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4465a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f4466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.g1 f4468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0.g1 f4469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f4470f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(MainViewModel mainViewModel, boolean z10, Context context, m0.g1 g1Var, m0.g1 g1Var2) {
        super(0);
        this.f4466b = mainViewModel;
        this.f4467c = z10;
        this.f4470f = context;
        this.f4468d = g1Var;
        this.f4469e = g1Var2;
        int iM6027 = C0312.m6027();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6027 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0234.m4500("2156yKqDpi2ZDx1ZtT2kqfF9")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(MainViewModel mainViewModel, boolean z10, m0.g1 g1Var, m0.g1 g1Var2, m0.g1 g1Var3) {
        super(0);
        this.f4466b = mainViewModel;
        this.f4467c = z10;
        this.f4468d = g1Var;
        this.f4469e = g1Var2;
        this.f4470f = g1Var3;
        int iM76 = C0004.m76();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM76 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0471.m9165("uIARM7")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static Map m4165(Object obj) {
        int iM2714 = C0141.m2714();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2714 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return r8.v.D0((q8.f[]) obj);
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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

    /* JADX INFO: renamed from: ۤۨۧۤ, reason: not valid java name and contains not printable characters */
    public static short[] m4166() {
        int iM557 = C0028.m557();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM557 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f257short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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

    @Override // c9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        q8.l lVarM238 = C0012.m238();
        switch (C0354.m6925(this)) {
            case 0:
                C0169.m3236(this);
                return lVarM238;
            default:
                C0169.m3236(this);
                return lVarM238;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m4167invoke() {
        int iM7190;
        int iM6925 = C0354.m6925(this);
        Object objM3567 = C0187.m3567(this);
        boolean zM4775 = C0250.m4775(this);
        MainViewModel mainViewModelM5783 = C0301.m5783(this);
        m0.g1 g1VarM4107 = C0216.m4107(this);
        m0.g1 g1VarM7582 = C0388.m7582(this);
        switch (iM6925) {
            case 0:
                Integer numM1604 = C0074.m1604((String) C0419.m8214(g1VarM7582));
                int i10 = 48767;
                while (true) {
                    i10 ^= 48784;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            iM7190 = 0;
                            break;
                        case 76:
                            iM7190 = C0367.m7190(numM1604);
                            int i11 = 48891;
                            while (true) {
                                i11 ^= 48908;
                                switch (i11) {
                                    case 22:
                                        break;
                                    case 503:
                                        i11 = 48922;
                                        continue;
                                    default:
                                        continue;
                                }
                            }
                            break;
                        case 239:
                            i10 = numM1604 != null ? 48860 : 48829;
                            break;
                        default:
                            break;
                    }
                }
                C0334.m6480(C0384.m7519(C0167.m3199(C0202.m3874(C0279.m5385(mainViewModelM5783))), C0318.m6156(m4166(), 26, C0301.f448 ^ (-743), 495), C0277.m5318(iM7190)));
                C0334.m6480(C0384.m7519(C0167.m3199(C0202.m3874(C0279.m5385(mainViewModelM5783))), C0457.m8898(m4166(), 34, C0182.f206 ^ 263, 2746), C0277.m5318(2147483348 ^ C0198.f222)));
                C0225.m4315(g1VarM4107, C0335.m6483());
                int i12 = 49666;
                while (true) {
                    i12 ^= 49683;
                    switch (i12) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (zM4775) {
                                i12 = 49759;
                            }
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 76:
                            C0079.m1702(C0357.m6990((Context) objM3567, C0037.m732(m4166(), 42, C0144.f170 ^ (-201), 352), 1));
                            int i13 = 49790;
                            while (true) {
                                i13 ^= 49807;
                                switch (i13) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 241:
                                        i13 = 49821;
                                        break;
                                }
                            }
                            break;
                        case 83:
                            C0079.m1702(C0357.m6990((Context) objM3567, C0074.m1617(m4166(), 110, C0142.f168 ^ (-617), 2752), 0));
                            break;
                        default:
                            continue;
                    }
                    i12 = 49728;
                }
                break;
            default:
                boolean zM3470 = C0181.m3470((String) C0419.m8214(g1VarM7582));
                int i14 = 1616;
                while (true) {
                    i14 ^= 1633;
                    switch (i14) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i14 = ((((zM3470 ? 1 : 0) ^ 65535) & 1) | ((zM3470 ? 1 : 0) & 65534)) != 0 ? 1709 : 1678;
                            break;
                        case 204:
                            String strM3852 = C0201.m3852(C0284.m5474((String) C0419.m8214(g1VarM7582)));
                            boolean zM14 = C0000.m14((Boolean) C0419.m8214(g1VarM4107));
                            C0014.m280(mainViewModelM5783);
                            String strM6742 = C0344.m6742(m4166(), 0, C0404.f674 ^ (-893), 1285);
                            C0376.m7360(strM3852, strM6742);
                            z4.d dVarM5385 = C0279.m5385(mainViewModelM5783);
                            C0014.m280(dVarM5385);
                            ArrayList arrayListM8147 = C0416.m8147(C0024.m468(dVarM5385));
                            q8.f fVar = new q8.f(strM6742, strM3852);
                            q8.f fVar2 = new q8.f(C0203.m3898(m4166(), 7, C0159.f183 ^ 26, 565), C0009.m192(zM14));
                            q8.f[] fVarArr = new q8.f[2];
                            fVarArr[C0320.f467 ^ 204] = fVar;
                            fVarArr[C0327.f474 ^ (-791)] = fVar2;
                            C0358.m6998(arrayListM8147, m4165(fVarArr));
                            String strM6960 = C0355.m6960(C0309.m5952(dVarM5385), arrayListM8147);
                            C0336.m6501(strM6960, C0342.m6689(m4166(), 15, C0073.f107 ^ (-922), 933));
                            C0107.m2085(C0394.m7699(dVarM5385), strM6960);
                            C0228.m4382(C0188.m3596(dVarM5385), arrayListM8147);
                            C0225.m4315(g1VarM7582, C0440.m8581());
                            int i15 = 1740;
                            while (true) {
                                i15 ^= 1757;
                                switch (i15) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i15 = zM4775 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        C0225.m4315((m0.g1) objM3567, C0335.m6483());
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
                int iM2067 = C0106.m2067();
                int i16 = 1864;
                while (true) {
                    i16 ^= 1881;
                    switch (i16) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (iM2067 <= 0) {
                                i16 = 48736;
                            }
                            break;
                        case 47384:
                            break;
                        case 47417:
                            System.out.println(Integer.parseInt(C0255.m4854("okrbJXp5k4Eug6z")));
                            break;
                        case 47483:
                            break;
                        default:
                            continue;
                    }
                    i16 = 48705;
                }
                break;
        }
    }
}
