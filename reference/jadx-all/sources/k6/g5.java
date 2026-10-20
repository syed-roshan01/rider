package k6;

import a8.C0010;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.C0014;
import androidx.compose.foundation.C0026;
import androidx.compose.ui.graphics.C0031;
import androidx.compose.ui.semantics.C0039;
import c1.C0060;
import c3.C0063;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.C0241;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.codegen.C0242;
import e1.C0258;
import e1.C0259;
import f0.C0273;
import g8.C0294;
import ga.C0296;
import i.C0316;
import java.util.Iterator;
import m5.C0356;
import n1.C0363;
import n7.C0364;
import p8.C0380;
import r6.C0402;
import s6.C0414;
import s7.C0416;
import t2.C0422;
import t8.C0427;
import u7.C0438;
import v0.C0443;
import v5.C0445;
import w2.C0459;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g5 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f546short = {555, 575, 574, 549};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f5 f10063a;

    public /* synthetic */ g5(f5 f5Var) {
        this.f10063a = f5Var;
        int iM5679 = C0296.m5679();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5679 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0138.m2676("mnqPoDIbE9")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static short[] m6558() {
        int iM508 = C0026.m508();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM508 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f546short;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x009b. Please report as an issue. */
    public final void a(String str, Bundle bundle) {
        String strM608;
        f5 f5VarM2283 = C0118.m2283(this);
        z4 z4VarM8666 = C0445.m8666(f5VarM2283);
        C0258.m4924(z4VarM8666);
        C0063.m1219(z4VarM8666);
        boolean zM8273 = C0422.m8273(f5VarM2283);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM8273) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    boolean zM3729 = C0195.m3729(bundle);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = zM3729 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                int i12 = 48767;
                                while (true) {
                                    i12 ^= 48784;
                                    switch (i12) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            str = C0124.m2384(m6558(), 0, C0356.f626 ^ (-118), 586);
                                            break;
                                        case 76:
                                            boolean zM8918 = C0459.m8918(str);
                                            int i13 = 48891;
                                            while (true) {
                                                i13 ^= 48908;
                                                switch (i13) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 503:
                                                        i13 = zM8918 ? 49635 : 48953;
                                                        break;
                                                    case 32495:
                                                        str = C0124.m2384(m6558(), 0, C0356.f626 ^ (-118), 586);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 239:
                                            i12 = str != null ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                Uri.Builder builder = new Uri.Builder();
                                C0294.m5637(builder, str);
                                Iterator itM5256 = C0273.m5256(C0060.m1152(bundle));
                                while (true) {
                                    boolean zM3327 = C0174.m3327(itM5256);
                                    int i14 = 49666;
                                    while (true) {
                                        i14 ^= 49683;
                                        switch (i14) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i14 = zM3327 ? 49759 : 49728;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 76:
                                                String str2 = (String) C0414.m8115(itM5256);
                                                C0443.m8642(builder, str2, C0132.m2549(bundle, str2));
                                                int i15 = 49790;
                                                while (true) {
                                                    i15 ^= 49807;
                                                    switch (i15) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 241:
                                                            i15 = 49821;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 83:
                                                break;
                                            default:
                                                break;
                                        }
                                        strM608 = C0031.m608(C0010.m198(builder));
                                        break;
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                strM608 = null;
                                int i16 = 1864;
                                while (true) {
                                    i16 ^= 1881;
                                    switch (i16) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                    boolean zM1883 = C0088.m1883(strM608);
                    int i17 = 49914;
                    while (true) {
                        i17 ^= 49931;
                        switch (i17) {
                            case 497:
                                if (!zM1883) {
                                    i17 = 50658;
                                }
                                break;
                            case 1711:
                                break;
                            case 1736:
                                return;
                            case 1769:
                                l4 l4VarM4620 = C0242.m4620(f5VarM2283);
                                C0237.m4550(l4VarM4620);
                                C0136.m2623(C0316.m6102(l4VarM4620), strM608);
                                C0237.m4550(l4VarM4620);
                                C0014.m280(C0363.m7108(f5VarM2283));
                                C0427.m8362(C0364.m7117(l4VarM4620), C0402.m7869());
                                return;
                            default:
                                continue;
                        }
                        i17 = 50627;
                    }
                    break;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final boolean b() {
        f5 f5VarM2283 = C0118.m2283(this);
        boolean zM1883 = C0088.m1883(C0133.m2573(f5VarM2283));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = zM1883 ? 1709 : 1678;
                    break;
                case 204:
                    d4 d4VarM3434 = C0180.m3434(f5VarM2283);
                    C0258.m4924(d4VarM3434);
                    boolean zM8162 = C0416.m8162(d4VarM3434, C0259.f338 ^ 743);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = zM8162 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return true;
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
        return false;
    }

    public final boolean c() {
        l4 l4VarM4620 = C0242.m4620(C0118.m2283(this));
        C0237.m4550(l4VarM4620);
        long jM7113 = C0364.m7113(C0364.m7117(l4VarM4620));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (jM7113 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return true;
                case 239:
                    return false;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final boolean d() {
        boolean zM772 = C0039.m772(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM772) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return false;
                case 239:
                    f5 f5VarM2283 = C0118.m2283(this);
                    C0014.m280(C0363.m7108(f5VarM2283));
                    long jM7869 = C0402.m7869();
                    l4 l4VarM4620 = C0242.m4620(f5VarM2283);
                    C0237.m4550(l4VarM4620);
                    long jM7113 = C0364.m7113(C0364.m7117(l4VarM4620));
                    long jM7426 = C0380.m7426(C0438.m8535(f5VarM2283), null, C0241.m4612());
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (((jM7869 - 12) - jM7113) + 12 > jM7426) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return false;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return true;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
