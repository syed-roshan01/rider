package d5;

import a.C0000;
import a7.C0008;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import androidx.compose.foundation.C0026;
import androidx.compose.foundation.relocation.C0024;
import b7.C0054;
import c3.C0062;
import c4.C0065;
import c6.C0067;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.internal.stats.C0101;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.measurement.C0183;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.internal.Code;
import d4.C0218;
import d7.C0221;
import d9.C0225;
import dagger.hilt.android.components.C0228;
import e8.C0266;
import h0.C0300;
import h3.C0302;
import h7.C0311;
import h8.C0314;
import h8.C0315;
import java.io.File;
import k3.C0335;
import m0.C0350;
import m0.s2;
import m0.w2;
import p0.C0374;
import q6.C0387;
import q7.C0391;
import t2.C0421;
import u8.C0439;
import v.C0440;
import w1.C0456;
import w4.C0461;
import z3.C0487;
import z7.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class w extends BroadcastReceiver {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f292short = {2660, 2681, 2677, 2675, 2656, 2654, 2661, 2670, 2678, 2671, 2669, 2670, 2656, 2661, 2654, 2664, 2661, 2508, 2503, 2527, 2502, 2500, 2503, 2505, 2508, 2822, 2845, 2820, 2820, 2888, 2827, 2825, 2822, 2822, 2823, 2844, 2888, 2826, 2829, 2888, 2827, 2825, 2843, 2844, 2888, 2844, 2823, 2888, 2822, 2823, 2822, 2885, 2822, 2845, 2820, 2820, 2888, 2844, 2833, 2840, 2829, 2888, 2825, 2822, 2828, 2842, 2823, 2817, 2828, 2886, 2825, 2840, 2840, 2886, 2860, 2823, 2847, 2822, 2820, 2823, 2825, 2828, 2853, 2825, 2822, 2825, 2831, 2829, 2842, 1782, 1777, 1764, 1777, 1776, 1782, 3286, 3285, 3289, 3291, 3286, 3301, 3279, 3272, 3283};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.f1 f4813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.g1 f4814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.g1 f4815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0.d1 f4816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0.g1 f4817f;

    public w(Context context, m0.f1 f1Var, m0.g1 g1Var, m0.g1 g1Var2, m0.d1 d1Var, m0.g1 g1Var3) {
        this.f4812a = context;
        this.f4813b = f1Var;
        this.f4814c = g1Var;
        this.f4815d = g1Var2;
        this.f4816e = d1Var;
        this.f4817f = g1Var3;
        int iM3314 = C0173.m3314();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3314 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0421.m8254("Nso4COpZKGATPfdtWIqooWB")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static short[] m4205() {
        int iM1692 = C0078.m1692();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1692 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f292short;
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

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Long l10;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = intent != null ? 1709 : 1678;
                    break;
                case 204:
                    Long lM8554 = C0439.m8554(C0193.m3705(intent, C0067.m1308(m4205(), 0, C0350.f620 ^ 824, 2561), 7 ^ ((long) C0008.f28)));
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                continue;
                            case 54:
                                l10 = lM8554;
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    l10 = null;
                    break;
                default:
                    break;
            }
        }
        w2 w2Var = (w2) C0026.m517(this);
        long jM491 = C0024.m491(w2Var);
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (l10 == null) {
                        i12 = 48736;
                    }
                    break;
                case 47384:
                    long jM9543 = C0491.m9543(l10);
                    int i13 = 48891;
                    while (true) {
                        i13 ^= 48908;
                        switch (i13) {
                            case 22:
                                break;
                            case 53:
                                return;
                            case 503:
                                if (jM9543 == jM491) {
                                    i13 = 49635;
                                }
                                break;
                            case 32495:
                                C0225.m4315(C0103.m2010(this), C0456.m8876());
                                C0225.m4315(C0266.m5065(this), C0335.m6483());
                                C0073.m1583((s2) C0183.m3509(this), 1.0f);
                                Object objM4133 = C0218.m4133(C0000.m10(this), C0062.m1180(m4205(), 17, C0487.f760 ^ 236, 2472));
                                C0302.m5795(objM4133, C0114.m2211(m4205(), 25, C0387.f657 ^ (-735), 2920));
                                Cursor cursorM5754 = C0300.m5754((DownloadManager) objM4133, C0101.m1987(new DownloadManager.Query(), new long[]{C0024.m491(w2Var)}));
                                int i14 = 49666;
                                while (true) {
                                    i14 ^= 49683;
                                    switch (i14) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i14 = cursorM5754 != null ? 49759 : 49728;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            boolean zM6068 = C0314.m6068(cursorM5754);
                                            int i15 = 49790;
                                            while (true) {
                                                i15 ^= 49807;
                                                switch (i15) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        break;
                                                    case 84:
                                                        int iM7639 = C0391.m7639(cursorM5754, C0350.m6854(cursorM5754, C0315.m6078(m4205(), 89, C0054.f74 ^ 328, 1669)));
                                                        int i16 = 49914;
                                                        while (true) {
                                                            i16 ^= 49931;
                                                            switch (i16) {
                                                                case 497:
                                                                    i16 = iM7639 == 8 ? 50658 : 50627;
                                                                    break;
                                                                case 1711:
                                                                    break;
                                                                case 1736:
                                                                    break;
                                                                case 1769:
                                                                    String strM1262 = C0065.m1262(cursorM5754, C0350.m6854(cursorM5754, C0461.m8963(m4205(), 95, C0374.f644 ^ (-852), 3258)));
                                                                    int i17 = 50689;
                                                                    while (true) {
                                                                        i17 ^= 50706;
                                                                        switch (i17) {
                                                                            case 19:
                                                                                i17 = strM1262 != null ? 50782 : 50751;
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 76:
                                                                                String strM4252 = C0221.m4252(C0142.m2730(strM1262));
                                                                                int i18 = 50813;
                                                                                while (true) {
                                                                                    i18 ^= 50830;
                                                                                    switch (i18) {
                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 53:
                                                                                            break;
                                                                                        case 243:
                                                                                            i18 = strM4252 == null ? 51557 : 50875;
                                                                                            break;
                                                                                        case 4075:
                                                                                            strM4252 = C0440.m8581();
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                C0225.m4315(C0311.m5998(this), new File(strM4252));
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
                                                    case 241:
                                                        i15 = zM6068 ? 49883 : 49852;
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
                                int i19 = 51588;
                                while (true) {
                                    i19 ^= 51605;
                                    switch (i19) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (cursorM5754 != null) {
                                                i19 = 51681;
                                            }
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            return;
                                        case 116:
                                            C0228.m4391(cursorM5754);
                                            return;
                                        default:
                                            continue;
                                    }
                                    i19 = 51650;
                                }
                                break;
                            default:
                                continue;
                        }
                        i13 = 48953;
                    }
                    break;
                case 47417:
                    int i20 = 48767;
                    while (true) {
                        i20 ^= 48784;
                        switch (i20) {
                            case Code.UNAVAILABLE /* 14 */:
                                return;
                            case 239:
                                i20 = 48798;
                                break;
                        }
                    }
                    break;
                case 47483:
                    break;
                default:
                    continue;
            }
            i12 = 48705;
        }
    }
}
