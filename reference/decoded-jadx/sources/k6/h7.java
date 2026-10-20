package k6;

import android.os.Bundle;
import android.support.v4.app.C0014;
import android.support.v4.app.C0015;
import androidx.annotation.C0018;
import androidx.compose.ui.draw.C0029;
import androidx.core.app.C0040;
import c1.C0061;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.C0128;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.ktx.C0199;
import com.google.firebase.remoteconfiginterop.C0202;
import d1.C0213;
import d7.C0220;
import dagger.hilt.android.internal.C0235;
import e1.C0258;
import f.C0269;
import f.C0270;
import ga.C0295;
import k8.C0338;
import l6.C0343;
import l8.C0346;
import okhttp3.internal.publicsuffix.C0372;
import r6.C0401;
import t1.C0419;
import t2.C0421;
import t8.C0426;
import u8.C0438;
import v0.C0440;
import w2.C0458;
import w6.C0464;
import z1.C0483;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public final class h7 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f549short = {3030, 3046, 3063, 3040, 3040, 3051, 2981, 3040, 3069, 3061, 3050, 3062, 3040, 3041, 2981, 3043, 3050, 3063, 2981, 3049, 3040, 3062, 3062, 2981, 3057, 3053, 3044, 3051, 2981, 2996, 2997, 2997, 2997, 2981, 3048, 3062, 2987, 2981, 3008, 3059, 3040, 3051, 3057, 2981, 3051, 3050, 3057, 2981, 3062, 3040, 3051, 3057, 2987, 2981, 3057, 3052, 3048, 3040, 2147, 2132, 2130, 2142, 2115, 2133, 2136, 2143, 2134, 2065, 2116, 2114, 2132, 2115, 2065, 2132, 2143, 2134, 2128, 2134, 2132, 2140, 2132, 2143, 2117, 2077, 2065, 2140, 2114, 2783, 2789, 2804, 2469, 2481, 2480, 2475, 3264, 3322};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f10090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f6 f10092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d7 f10093d;

    public h7(d7 d7Var) {
        this.f10093d = d7Var;
        this.f10092c = new f6(this, (f5) C0163.m3121(d7Var), 1);
        C0014.m280((e6.c) C0166.m3176(d7Var));
        long jM3820 = C0199.m3820();
        this.f10090a = jM3820;
        this.f10091b = jM3820;
        int iM2767 = C0144.m2767();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2767 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0180.m3429("tLtPrQmmGClhQMJcUj")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۨۨۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6561() {
        int iM5170 = C0270.m5170();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5170 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f549short;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(boolean z10, boolean z11, long j10) {
        d7 d7VarM304 = C0015.m304(this);
        C0040.m791(d7VarM304);
        C0458.m8937(d7VarM304);
        boolean zM4077 = C0213.m4077();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = zM4077 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM3575 = C0187.m3575(C0091.m1951(d7VarM304), null, C0295.m5690());
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = zM3575 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                l4 l4VarM6640 = C0338.m6640(d7VarM304);
                                C0014.m280((e6.c) C0166.m3176(d7VarM304));
                                C0426.m8362(C0235.m4522(l4VarM6640), C0401.m7869());
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean zM8273 = C0421.m8273((f5) C0163.m3121(d7VarM304));
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = zM8273 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            l4 l4VarM6641 = C0338.m6640(d7VarM304);
                                            C0014.m280((e6.c) C0166.m3176(d7VarM304));
                                            C0426.m8362(C0235.m4522(l4VarM6641), C0401.m7869());
                                            break;
                                        case 47483:
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
                case 239:
                    l4 l4VarM6642 = C0338.m6640(d7VarM304);
                    C0014.m280((e6.c) C0166.m3176(d7VarM304));
                    C0426.m8362(C0235.m4522(l4VarM6642), C0401.m7869());
                    break;
                default:
                    break;
            }
        }
        long jM8604 = ((29 + j10) - C0440.m8604(this)) - 29;
        int i13 = 48767;
        while (true) {
            i13 ^= 48784;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    break;
                case 76:
                    int i14 = 48891;
                    while (true) {
                        i14 ^= 48908;
                        switch (i14) {
                            case 22:
                                break;
                            case 53:
                                break;
                            case 503:
                                i14 = jM8604 < 1000 ? 49635 : 48953;
                                break;
                            case 32495:
                                C0419.m8245(C0136.m2634(C0029.m572(d7VarM304)), C0202.m3867(m6561(), 0, C0483.f757 ^ (-823), 2949), C0438.m8554(jM8604));
                                return false;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    i13 = !z10 ? 48860 : 48829;
                    break;
                default:
                    break;
            }
        }
        int i15 = 49666;
        while (true) {
            i15 ^= 49683;
            switch (i15) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i15 = !z11 ? 49759 : 49728;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    jM8604 = ((j10 - 23) - C0132.m2552(this)) + 23;
                    this.f10091b = j10;
                    break;
                case 83:
                    break;
                default:
                    break;
            }
        }
        C0419.m8245(C0136.m2634(C0029.m572(d7VarM304)), C0120.m2323(m6561(), 58, C0202.f226 ^ (-442), 2097), C0438.m8554(jM8604));
        Bundle bundle = new Bundle();
        C0490.m9555(bundle, C0191.m3642(m6561(), 87, C0061.f81 ^ 823, 2688), jM8604);
        boolean zM6728 = C0343.m6728(C0091.m1951(d7VarM304));
        C0464.m9060(C0372.m7299(C0346.m6778(d7VarM304), ((zM6728 ? 1 : 0) & '\ufffe') | (((zM6728 ? 1 : 0) ^ '\uffff') & 1)), bundle, true);
        int i16 = 49790;
        while (true) {
            i16 ^= 49807;
            switch (i16) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    break;
                case 84:
                    C0168.m3222(C0128.m2464(d7VarM304), C0464.m9053(m6561(), 90, C0192.f216 ^ (-806), 2500), C0220.m4259(m6561(), 94, C0018.f38 ^ (-580), 3231), bundle);
                    break;
                case 241:
                    i16 = !z11 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
        }
        this.f10090a = j10;
        f6 f6VarM5145 = C0269.m5145(this);
        C0164.m3150(f6VarM5145);
        C0258.m4929(f6VarM5145, 3599834 ^ ((long) C0090.f124));
        return true;
    }
}
